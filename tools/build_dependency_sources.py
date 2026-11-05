"""Compile explicit dependency method sources and retain their original class contracts."""
from pathlib import Path
import argparse,concurrent.futures,csv,hashlib,json,subprocess,zipfile

parser=argparse.ArgumentParser();parser.add_argument('--project',type=Path,required=True);parser.add_argument('--recovery',type=Path,required=True);parser.add_argument('--build',type=Path,required=True);parser.add_argument('--jdk',type=Path,required=True);parser.add_argument('--overlay',type=Path,required=True);parser.add_argument('--output',type=Path,required=True);parser.add_argument('--jobs',type=int,default=2);args=parser.parse_args()
root=args.project;build=args.build;output=build/'dependencies';output.mkdir(exist_ok=True)
manifest=root/'lib/dependency-methods.tsv';rows=list(csv.DictReader(manifest.open(encoding='utf-8'),delimiter='\t'))
groups={};seen=set()
for row in rows:
    identity=(row['runtime_class'],row['runtime_method'],row['runtime_descriptor'])
    if identity in seen:raise RuntimeError('Duplicate dependency source method')
    seen.add(identity);groups.setdefault(row['readable_class'],[]).append(row)
    relative=Path(row['source_file']);source=(root/relative).resolve();allowed=(root/'src/dependency/java').resolve()
    if relative.is_absolute() or not source.is_relative_to(allowed) or not source.is_file():raise RuntimeError('Invalid dependency source file')
headers=';'.join(str(path) for path in [build/'support',root/'lib/compile-headers.jar',root/'lib/live-headers.jar',root/'lib/dependency-headers.jar',root/'lib/captured-compile-headers.jar'] if path.exists())
toolcp=';'.join(map(str,[build/'tools',root/'lib/asm/*']))
def run(label,command):
    with (output/(label+'.log')).open('w',encoding='utf-8') as log:result=subprocess.run(list(map(str,command)),stdout=log,stderr=subprocess.STDOUT)
    if result.returncode:raise RuntimeError('Dependency '+label+' failed: '+str(output/(label+'.log')))
def compile_class(item):
    owner,methods=item;folder=output/'classes'/methods[0]['runtime_class'].encode('utf-8').hex();folder.mkdir(parents=True,exist_ok=True)
    files={row['source_file'] for row in methods}
    if len(files)!=1:raise RuntimeError('One dependency compilation unit per class is required')
    run('javac-'+methods[0]['runtime_class'].encode('utf-8').hex(),[args.jdk/'bin/javac.exe','-J-Xmx900m','--release','8','-encoding','UTF-8','-proc:none','-cp',headers,'-d',folder,root/methods[0]['source_file']])
    return owner,folder/(owner+'.class')
with concurrent.futures.ThreadPoolExecutor(max_workers=max(1,min(args.jobs,4))) as pool:compiled=list(pool.map(compile_class,groups.items()))
with zipfile.ZipFile(output/'compiled-readable.jar','w',zipfile.ZIP_DEFLATED) as jar:
    for owner,file in compiled:jar.writestr(owner+'.class',file.read_bytes())
java=args.jdk/'bin/java.exe'
run('restore',[java,'-Xmx1800m','-cp',toolcp,'RestoreOriginalNames',root/'lib/symbol-map.tsv',output/'compiled-readable.jar',output/'compiled-runtime.jar'])
merge=[java,'-Xmx2000m','-cp',toolcp,'MergeDependencyMethods',args.recovery/'zkm27-original-core.jar',args.overlay,output/'compiled-runtime.jar',manifest,args.output,output/'installed-methods.tsv']
if (root/'lib/dependency-retained-bridges.jar').exists():merge+=['--retained-bridges',root/'lib/dependency-retained-bridges.jar']
run('merge',merge)
full_path=root/'lib/dependency-full-classes.json'
complete=json.loads(full_path.read_text(encoding='utf-8')) if full_path.exists() else []
if complete:
    for entry in complete:
        source=(root/entry['source_file']).resolve()
        if not source.is_relative_to((root/'src/dependency/java').resolve()) or not source.is_file() or entry['readable_class'] in groups:raise RuntimeError('Invalid or overlapping complete dependency source')
    run('full-javac',[args.jdk/'bin/javac.exe','--release','8','-encoding','UTF-8','-proc:none','-cp',headers,'-d',output/'full-readable',*[root/entry['source_file'] for entry in complete]])
    with zipfile.ZipFile(output/'full-readable.jar','w',zipfile.ZIP_DEFLATED) as jar:
        for entry in complete:
            name=entry['readable_class']+'.class';jar.writestr(name,(output/'full-readable'/name).read_bytes())
    run('full-restore',[java,'-Xmx1800m','-cp',toolcp,'RestoreOriginalNames',root/'lib/symbol-map.tsv',output/'full-readable.jar',output/'full-runtime.jar'])
    run('full-abi',[java,'-Xmx1800m','-cp',toolcp,'AuditSourceFlow',args.recovery/'tools/java-deobfuscator/analysis-headers-only.jar',build/'analysis-original-core.jar',output/'full-runtime.jar',output/'full-abi.txt',root/'lib/runtime-additions.jar'])
    with zipfile.ZipFile(args.output) as jar:combined={name:jar.read(name) for name in jar.namelist()}
    with zipfile.ZipFile(output/'full-runtime.jar') as jar:
        if set(jar.namelist())!={entry['runtime_class']+'.class' for entry in complete}:raise RuntimeError('Complete dependency runtime identity mismatch')
        for name in jar.namelist():
            if name in combined:raise RuntimeError('Complete source cannot also be a method patch')
            combined[name]=jar.read(name)
    with zipfile.ZipFile(args.output,'w',zipfile.ZIP_DEFLATED) as jar:
        for name,data in combined.items():jar.writestr(name,data)
report={'source_classes':len(groups)+len(complete),'source_methods':len(rows)+sum(entry['ordinary_methods'] for entry in complete),'full_source_classes':len(complete),'full_source_constructors':sum(entry['constructors'] for entry in complete),'class_contracts_retained':True,'manifest_sha256':hashlib.sha256(manifest.read_bytes()).hexdigest(),'source_hashes':{row['source_file']:hashlib.sha256((root/row['source_file']).read_bytes()).hexdigest() for row in [*rows,*complete]}}
(output/'report.json').write_text(json.dumps(report,ensure_ascii=False,indent=2),encoding='utf-8');print('DEPENDENCY_SOURCE_BUILD_PASSED classes='+str(len(groups))+' methods='+str(len(rows)),flush=True)
