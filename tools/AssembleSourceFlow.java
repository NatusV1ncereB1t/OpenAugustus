import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

/** Restores only explicitly declared retained helpers/bridges and original field metadata. */
public final class AssembleSourceFlow { static final RepairModuleFrames metadata=new RepairModuleFrames();
    static boolean retained(MethodNode method){return method.name.equals("<clinit>")||RestoreSourceBridges.bridge(method.name)||((method.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))==(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC)&&method.name.matches("[a-z]{1,2}"));}
    static byte[] assemble(byte[] compiled,byte[] bytes)throws Exception{
        ClassNode node=new ClassNode(),template=new ClassNode();new ClassReader(compiled).accept(node,0);new ClassReader(bytes).accept(template,0);
        Map<String,MethodNode> methods=new HashMap<String,MethodNode>();for(MethodNode m:template.methods)if(retained(m))methods.put(m.name+m.desc,m);
        for(int i=0;i<node.methods.size();i++){
            MethodNode m=node.methods.get(i);if(!retained(m))continue;MethodNode body=methods.remove(m.name+m.desc);
            if(body==null)throw new IllegalStateException("Unknown retained method "+m.name+m.desc);if(RestoreSourceBridges.bridge(m.name)&&(m.access&Opcodes.ACC_NATIVE)==0){m.access=body.access;}else node.methods.set(i,body);
        }
        for(MethodNode m:methods.values())if(m.name.equals("<clinit>"))node.methods.add(m);else if(!RestoreSourceBridges.bridge(m.name))throw new IllegalStateException("Missing source declaration "+m.name+m.desc);
        for(FieldNode field:node.fields){FieldNode found=null;for(FieldNode f:template.fields)if(f.name.equals(field.name)&&f.desc.equals(field.desc))found=f;if(found==null)throw new IllegalStateException("New field "+field.name);field.access=found.access;field.value=found.value;}
        ClassWriter writer=(node.name.equals("augustus/recovered/modules/world/Scaffold_47Te")||node.name.equals("augustus/recovered/modules/movement/BugUp_47kq"))?new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS){protected String getCommonSuperClass(String a,String b){return metadata.common(a,b);}}:new ClassWriter(ClassWriter.COMPUTE_MAXS);node.accept(writer);return writer.toByteArray();
    }
    public static void main(String[] args)throws Exception{
        Path lib=Paths.get(args[1]).getParent();for(String name:new String[]{"compile-headers.jar","live-headers.jar","dependency-headers.jar","captured-compile-headers.jar"})if(Files.exists(lib.resolve(name)))metadata.load(lib.resolve(name).toString());metadata.load(args[1]);metadata.load(args[0]);
        int count=0;try(JarFile input=new JarFile(args[0]);JarFile retained=new JarFile(args[1]);JarOutputStream out=new JarOutputStream(Files.newOutputStream(Paths.get(args[2])))){
            Enumeration<JarEntry> entries=input.entries();while(entries.hasMoreElements()){JarEntry entry=entries.nextElement();if(!entry.getName().endsWith(".class"))continue;JarEntry t=retained.getJarEntry(entry.getName());if(t==null)throw new IllegalStateException("Missing template "+entry.getName());byte[] bytes=assemble(RestoreSourceBridges.read(input.getInputStream(entry)),RestoreSourceBridges.read(retained.getInputStream(t)));out.putNextEntry(new JarEntry(entry.getName()));out.write(bytes);out.closeEntry();count++;}
        }System.out.println("SOURCE_FLOW_ASSEMBLED classes="+count);
    }
}
