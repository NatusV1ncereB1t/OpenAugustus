from pathlib import Path
import argparse, concurrent.futures, datetime, hashlib, json, subprocess, tempfile, zipfile, sys, os

sys.stdout.reconfigure(encoding='utf-8',errors='replace')
sys.stderr.reconfigure(encoding='utf-8',errors='replace')

root=Path(__file__).resolve().parent
parser=argparse.ArgumentParser(description='Build the editable Augustus modules and Alan customizations')
parser.add_argument('--recovery-root',type=Path,default=root/'build-inputs')
parser.add_argument('--jdk17',type=Path)
parser.add_argument('--java8',type=Path,default=Path(os.environ['JAVA8_HOME']) if os.environ.get('JAVA8_HOME') else root/'build-tools/java8')
parser.add_argument('--jobs',type=int,default=2)
parser.add_argument('--reuse-build',type=Path,help='Reuse unchanged javac module outputs from an eligible verified build report; run all later checks')
args=parser.parse_args();recovery=args.recovery_root.resolve()
jdk=args.jdk17 or (Path(os.environ.get('JDK17_HOME') or os.environ.get('JAVA_HOME')) if (os.environ.get('JDK17_HOME') or os.environ.get('JAVA_HOME')) else root/'build-tools/jdk17')
sys.dont_write_bytecode=True
sys.path.insert(0,str(root/'tools'))
from build_inputs import restore_inputs
restore_inputs(root)
java=jdk/'bin/java.exe';javac=jdk/'bin/javac.exe';java8=args.java8/'bin/java.exe';javac8=args.java8/'bin/javac.exe'
for path in [java,javac,java8,javac8,recovery/'zkm27-original-core.jar',recovery/'recovered-analysis.jar',recovery/'tools/java-deobfuscator/analysis-headers-only.jar']:
    if not path.is_file():raise FileNotFoundError(path)
manifest=json.loads((root/'modules.json').read_text(encoding='utf-8'))
assert len(manifest)==237 and len({row['original_class'] for row in manifest})==237
assert not ({'IRC','IRCChat','Radio'} & {row['name'] for row in manifest})
for relative,digest in json.loads((root/'pinned-inputs.json').read_text(encoding='utf-8')).items():
    if hashlib.sha256((root/relative).read_bytes()).hexdigest()!=digest:raise RuntimeError('Pinned build input changed: '+relative)
dist=root/'dist';dist.mkdir(exist_ok=True);(root/'build').mkdir(exist_ok=True)
build=Path(tempfile.mkdtemp(prefix='run-',dir=root/'build'))
for part in ['tools','support','modules','runtime','logs']:(build/part).mkdir()
asm=sorted((root/'lib/asm').glob('*.jar'))
toolcp=';'.join(map(str,[build/'tools',*asm]))
captured_compile_headers=root/'lib/captured-compile-headers.jar'
captured_runtime_types=root/'lib/captured-runtime-types.jar'
if captured_compile_headers.exists()!=captured_runtime_types.exists():raise RuntimeError('Captured compile declarations and original metadata must be installed together')
sourcecp=';'.join(map(str,[build/'support',root/'lib/compile-headers.jar',root/'lib/live-headers.jar',root/'lib/dependency-headers.jar',*([captured_compile_headers] if captured_compile_headers.exists() else [])]))
def run(label,*command):
    command=list(map(str,command))
    if Path(command[0]).name.lower()=='javac.exe':command[1:1]=['-J-Duser.language=en','-J-Dfile.encoding=UTF-8']
    elif Path(command[0]).name.lower()=='java.exe':command[1:1]=['-Duser.language=en','-Dfile.encoding=UTF-8']
    with (build/'logs'/(label+'.log')).open('w',encoding='utf-8') as log:
        done=subprocess.run(command,stdout=log,stderr=subprocess.STDOUT)
    if done.returncode:
        print((build/'logs'/(label+'.log')).read_text(encoding='utf-8',errors='replace')[-18000:],flush=True)
        raise RuntimeError(label+' failed; see '+str(build/'logs'))
def tool(label,name,*params):run(label,java,'-Xmx2400m','-cp',toolcp,name,*params)
def jar_classes(path,directory,identities=None):
    with zipfile.ZipFile(path,'w',zipfile.ZIP_DEFLATED) as out:
        for file in sorted(directory.rglob('*.class')):
            name=file.relative_to(directory).as_posix()
            if identities is None or name[:-6] in identities or any(name.startswith(owner+'$') for owner in identities):out.write(file,name)
def read_jar(path):
    with zipfile.ZipFile(path) as jar:return {name:jar.read(name) for name in jar.namelist() if name.endswith('.class')}
def write_jar(path,entries):
    with zipfile.ZipFile(path,'w',zipfile.ZIP_DEFLATED) as out:
        for name,data in entries.items():out.writestr(name,data)

analysis_core=recovery/'zkm27-original-core.jar'
captured_count=0
if captured_runtime_types.exists():
    analysis_types=read_jar(analysis_core);captured_types=read_jar(captured_runtime_types)
    if set(analysis_types)&set(captured_types):raise RuntimeError('Captured types must add exclusively missing original metadata')
    captured_count=len(captured_types);analysis_types.update(captured_types)
    analysis_core=build/'analysis-original-core.jar';write_jar(analysis_core,analysis_types)

run('tools',javac,'--release','8','-encoding','UTF-8','-proc:none','-cp',';'.join(map(str,asm)),'-d',build/'tools',*sorted((root/'tools').glob('*.java')))
support=list((root/'src/main/java/recovery').rglob('*.java'))
run('support',javac,'--release','8','-encoding','UTF-8','-proc:none','-cp',sourcecp,'-d',build/'support',*support)
sys.path.insert(0,str(root/'tools'))
sys.dont_write_bytecode=True
from module_compile_cache import ModuleCompileCache
module_cache=ModuleCompileCache(root,build,jdk,manifest,[root/'lib/compile-headers.jar',root/'lib/live-headers.jar',root/'lib/dependency-headers.jar',*([captured_compile_headers] if captured_compile_headers.exists() else [])],args.reuse_build)

def compile_module(row):
    if module_cache.restore(row):return row['name']+' (javac reused)'
    path=root/'src/main/java'/(row['readable_class']+'.java')
    run('module-'+row['name'],javac,'-J-Xmx1100m','-J-Xss16m','--release','8','-encoding','UTF-8','-proc:none','-cp',sourcecp,'-d',build/'modules',path)
    return row['name']
with concurrent.futures.ThreadPoolExecutor(max_workers=max(1,min(args.jobs,4))) as pool:
    for count,name in enumerate(pool.map(compile_module,manifest),1):
        if count%10==0 or count==len(manifest):print('COMPILED',count,'/'+str(len(manifest)),name,flush=True)
jar_classes(build/'modules.jar',build/'modules',{row['readable_class'] for row in manifest})
jar_classes(build/'support-readable.jar',build/'support')
tool('assemble','AssembleSourceFlow',build/'modules.jar',root/'lib/retained-templates.jar',build/'modules-assembled.jar')
tool('restore-modules','RestoreOriginalNames',root/'lib/symbol-map.tsv',build/'modules-assembled.jar',build/'modules-original.jar',analysis_core)
tool('frame-modules','RepairModuleFrames',recovery/'tools/java-deobfuscator/analysis-headers-only.jar',analysis_core,build/'modules-original.jar',build/'modules-framed.jar')
tool('abi','AuditSourceFlow',recovery/'tools/java-deobfuscator/analysis-headers-only.jar',analysis_core,build/'modules-framed.jar',dist/'modules-abi.txt',root/'lib/runtime-additions.jar')
tool('restore-support','RestoreOriginalNames',root/'lib/symbol-map.tsv',build/'support-readable.jar',build/'support-runtime.jar')
merged=read_jar(root/'lib/base-runtime-overlay.jar');merged.update(read_jar(build/'modules-framed.jar'));merged.update(read_jar(build/'support-runtime.jar'))
with zipfile.ZipFile(recovery/'zkm27-original-core.jar') as raw:original_names=set(raw.namelist())
for name,data in read_jar(root/'lib/runtime-additions.jar').items():
    if name not in original_names and name not in merged:merged[name]=data
write_jar(build/'all-source.jar',merged)

dependency_source_report={'source_classes':0,'source_methods':0}
if (root/'lib/dependency-methods.tsv').exists():
    run('dependency-sources',sys.executable,root/'tools/build_dependency_sources.py','--project',root,'--recovery',recovery,'--build',build,'--jdk',jdk,'--overlay',build/'all-source.jar','--output',build/'dependency-source-overlay.jar','--jobs',args.jobs)
    merged.update(read_jar(build/'dependency-source-overlay.jar'));write_jar(build/'all-source.jar',merged)
    dependency_source_report=json.loads((build/'dependencies/report.json').read_text(encoding='utf-8'))

identities=build/'module-identities.txt';identities.write_text(''.join(row['original_class']+'\n' for row in manifest),encoding='utf-8')
tool('customize','CustomizeClient',recovery/'zkm27-original-core.jar',build/'all-source.jar',build/'support-runtime.jar',build/'customized.jar',identities)
merged.update(read_jar(build/'customized.jar'))
tool('delete-irc','RemoveIrcFeature',recovery/'zkm27-original-core.jar',build/'customized.jar',build/'irc-deleted','apply',root/'lib/launcher-base.jar')
merged.update(read_jar(build/'irc-deleted.jar'))
from remove_irc_payload import removed as removed_irc, prepare as prepare_irc_payload, verify as verify_irc_payload
merged={name:data for name,data in merged.items() if not removed_irc(name)}
write_jar(build/'full-unframed.jar',merged)
tool('frame-all','RepairModuleFrames',recovery/'tools/java-deobfuscator/analysis-headers-only.jar',analysis_core,build/'full-unframed.jar',dist/'compiled-source-overlay.jar')
framed=read_jar(dist/'compiled-source-overlay.jar')
for name,data in read_jar(root/'lib/base-runtime-overlay.jar').items():
    if name.startswith(('net/java/games/input/','net/java/games/util/')):framed[name]=data
write_jar(dist/'compiled-source-overlay.jar',framed)
run('jvm',java8,'-Xverify:all','-Xmx2400m','-cp',toolcp,'TestBatchJvmVerification',recovery/'tools/java-deobfuscator/analysis-headers-only.jar',recovery/'recovered-analysis.jar',root/'lib/runtime-additions.jar',analysis_core,dist/'compiled-source-overlay.jar',build/'jvm-approved.jar',dist/'jvm.tsv')
records={line.split('\t')[0]:line.split('\t')[1:] for line in (dist/'jvm.tsv').read_text(encoding='utf-8').splitlines()[1:]}
for row in manifest:
    if records.get(row['original_class'],['MISSING'])[0]!='JVM_VERIFIED':raise RuntimeError('Business module failed Java 8 verification: '+row['original_class'])
allowed=set((root/'lib/expected-dependency-holds.tsv').read_text(encoding='utf-8').splitlines())
held=[name+'\t'+'\t'.join(values) for name,values in records.items() if values[0]=='HELD']
unexpected=set(held)-allowed
if unexpected:raise RuntimeError('New dependency verification failures: '+repr(unexpected))
run('runtime',javac8,'-source','8','-target','8','-encoding','UTF-8','-proc:none','-d',build/'runtime',*sorted((root/'src/runtime/java').rglob('*.java')))
replacement={'recovery/compiled-source-overlay.jar':(dist/'compiled-source-overlay.jar').read_bytes()}
irc_payload,irc_payload_report=prepare_irc_payload(root/'lib/launcher-base.jar',build/'irc-deleted.jar')
replacement.update(irc_payload)
for directory in [build/'runtime',root/'src/main/resources']:
    for path in directory.rglob('*'):
        if path.is_file():replacement[path.relative_to(directory).as_posix()]=path.read_bytes()
editable_resource_names=sorted(path.relative_to(root/'src/main/resources').as_posix() for path in (root/'src/main/resources').rglob('*') if path.is_file() and path.relative_to(root/'src/main/resources').as_posix().startswith('assets/'))
replacement['recovery/editable-resource-index.txt']=('\n'.join(editable_resource_names)+'\n').encode('utf-8')
target=dist/'Augustus-source-development.jar'
with zipfile.ZipFile(root/'lib/launcher-base.jar') as base,zipfile.ZipFile(target,'w',zipfile.ZIP_DEFLATED) as out:
    for info in base.infolist():
        if info.filename not in replacement and not removed_irc(info.filename):out.writestr(info,base.read(info.filename))
    for name,data in replacement.items():out.writestr(name,data)
with zipfile.ZipFile(target) as jar:
    if jar.testzip() is not None:raise RuntimeError('Package CRC check failed')
verify_irc_payload(target)
source_hashes={path.relative_to(root).as_posix():hashlib.sha256(path.read_bytes()).hexdigest() for directory in [root/'src/main/java',root/'src/dependency/java',root/'src/runtime/java',root/'src/main/resources',root/'tools'] for path in directory.rglob('*') if path.is_file()}
report={'source_implemented_bridge_methods':sum(len(row.get('source_implemented_bridge_methods',[])) for row in manifest),'built_at':datetime.datetime.now().astimezone().isoformat(),'captured_runtime_metadata_classes':captured_count,'editable_resource_count':len(editable_resource_names),'source_modules':len(manifest),'editable_dependency_classes':dependency_source_report['source_classes'],'editable_dependency_methods':dependency_source_report['source_methods'],'full_source_dependency_classes':dependency_source_report.get('full_source_classes',0),'full_source_dependency_constructors':dependency_source_report.get('full_source_constructors',0),'java8_verified_business_modules':len(manifest),'retired_modules':[],'deleted_modules':['IRC','IRCChat','Radio'],'deleted_irc_runtime_classes':['net/47kf','net/47k8','net/47Lu','net/47y9','net/47yp','net/47yu','net/47k3','net/474j'],'irc_payload_deletion':irc_payload_report,'added_module':'AlanESP','semantic_setting_fields':2080,'core_type_aliases':44,'dependency_only_verification_holds':held,'full_gameplay_equivalence_verified':False,'full_java_readability_goal_complete':False,'webcam_capture_removal_verified':False,'jar_sha256':hashlib.sha256(target.read_bytes()).hexdigest(),'build_directory':str(build),'jar':str(target),'source_hashes':source_hashes,'module_compilation_cache':module_cache.record(build/'modules.jar')}
(dist/'build-report.json').write_text(json.dumps(report,ensure_ascii=False,indent=2),encoding='utf-8')
print('BUILD PASSED:',target,flush=True)
print(str(len(manifest))+' source modules passed Java 8 verification;',len(held),'known dependency-only metadata holds. Gameplay parity is not established by this build.',flush=True)
