import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

/** Reverse the exact recorded readability projection, including descriptor suffixes. */
public final class RestoreOriginalNames {
    public static void main(String[] args)throws Exception {
        final Map<String,String> forward=new HashMap<String,String>(),legacyForward=new HashMap<String,String>(),reverse=new HashMap<String,String>();
        final Map<String,String> methods=new HashMap<String,String>(),fields=new HashMap<String,String>();
        List<String[]> rows=new ArrayList<String[]>();
        for(String line:Files.readAllLines(Paths.get(args[0]),StandardCharsets.UTF_8)){
            String[] row=line.split("\t",-1);if(row.length!=5)continue;rows.add(row);
            if(row[0].equals("CLASS")){if(!legacyForward.containsKey(row[1]))legacyForward.put(row[1],row[4]);forward.put(row[1],row[4]);reverse.put(row[4],row[1]);}
        }
        Remapper toReadable=new Remapper(){public String map(String name){return forward.containsKey(name)?forward.get(name):name;}};
        final Remapper toLegacy=new Remapper(){public String map(String name){return legacyForward.containsKey(name)?legacyForward.get(name):name;}};
        for(String[] row:rows){
            if(row[0].equals("METHOD"))methods.put(toReadable.map(row[1])+"\t"+row[4]+"\t"+toReadable.mapMethodDesc(row[3]),row[2]);
            if(row[0].equals("FIELD"))fields.put(toReadable.map(row[1])+"\t"+row[4]+"\t"+toReadable.mapDesc(row[3]),row[2]);
        }
        final int[] renamed={0,0,0};
        Remapper original=new Remapper(){
            public String map(String name){String result=reverse.get(name);if(result!=null){renamed[0]++;return result;}return name;}
            public String mapMethodName(String owner,String name,String descriptor){
                String base=name;
                if(name.startsWith("method_")&&name.matches(".*\\$[0-9a-f]{10}$")){
                    base=name.substring(0,name.length()-11);
                    String legacyDescriptor=toLegacy.mapMethodDesc(mapMethodDesc(descriptor));
                    if(!SourceMethodNames.name(base,legacyDescriptor).equals(name))throw new IllegalStateException("Wrong descriptor suffix: "+name);
                }
                String result=methods.get(owner+"\t"+base+"\t"+descriptor);
                String runtimeDescriptor=mapMethodDesc(descriptor);
                if(result==null&&base.equals("onRender2D")&&runtimeDescriptor.equals("(IFCILnet/477t;)V"))result="44";
                if(result==null&&base.equals("onRender3D")&&runtimeDescriptor.equals("(JF)V"))result="43";
                if(result==null&&base.equals("onRenderOverlay")&&runtimeDescriptor.equals("(FJLnet/477t;B)V"))result="45";
                if(result==null&&base.startsWith("method_")){
                    String candidate=base.substring(7);
                    if(!candidate.isEmpty()&&Character.isDigit(candidate.charAt(0)))result=candidate;
                }
                if(result==null)result=base;
                if(!result.equals(name))renamed[1]++;
                return result;
            }
            public String mapFieldName(String owner,String name,String descriptor){
                String result=fields.get(owner+"\t"+name+"\t"+descriptor);
                if(result==null&&name.startsWith("field_")&&name.length()>6&&Character.isDigit(name.charAt(6)))result=name.substring(6);
                if(result==null)result=name;
                if(!result.equals(name))renamed[2]++;
                return result;
            }
        };
        try(JarFile source=new JarFile(args[1]);JarOutputStream target=new JarOutputStream(Files.newOutputStream(Paths.get(args[2])))){
            Enumeration<JarEntry> entries=source.entries();
            while(entries.hasMoreElements()){
                JarEntry entry=entries.nextElement();if(entry.isDirectory())continue;
                byte[] bytes=RestoreSourceBridges.read(source.getInputStream(entry));String name=entry.getName();
                if(name.endsWith(".class")){
                    ClassReader reader=new ClassReader(bytes);ClassWriter writer=new ClassWriter(0);
                    reader.accept(new ClassRemapper(writer,original),0);bytes=writer.toByteArray();
                    ClassNode check=new ClassNode();new ClassReader(bytes).accept(check,0);
                    if(args.length==4){
                        // The earlier deobfuscator removes this proven identity helper.
                        // Retain its original declaration for reflective/ABI compatibility.
                        try(JarFile raw=new JarFile(args[3])){
                            JarEntry rawEntry=raw.getJarEntry(check.name+".class");
                            if(rawEntry==null)throw new IllegalStateException("Missing original "+check.name);
                            ClassNode baseline=new ClassNode();new ClassReader(RestoreSourceBridges.read(raw.getInputStream(rawEntry))).accept(baseline,0);
                            for(MethodNode method:baseline.methods){
                                if(!(method.desc.equals("(Ljava/lang/Exception;)Ljava/lang/Exception;")||method.desc.equals("(Ljava/lang/Throwable;)Ljava/lang/Throwable;"))||(method.access&Opcodes.ACC_STATIC)==0)continue;
                                List<AbstractInsnNode> executable=new ArrayList<AbstractInsnNode>();
                                for(AbstractInsnNode instruction:method.instructions)if(instruction.getOpcode()>=0)executable.add(instruction);
                                if(executable.size()!=2||!(executable.get(0) instanceof VarInsnNode)||executable.get(0).getOpcode()!=Opcodes.ALOAD||((VarInsnNode)executable.get(0)).var!=0||executable.get(1).getOpcode()!=Opcodes.ARETURN)continue;
                                boolean found=false;for(MethodNode existing:check.methods)if(existing.name.equals(method.name)&&existing.desc.equals(method.desc))found=true;
                                if(!found){check.methods.add(method);System.out.println("Retained original exception identity helper "+check.name);}
                            }
                        }
                        ClassWriter merged=new ClassWriter(0);check.accept(merged);bytes=merged.toByteArray();
                    }
                    for(MethodNode method:check.methods)if((method.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))==0)
                        new Analyzer<BasicValue>(new BasicVerifier()).analyze(check.name,method);
                    name=check.name+".class";
                }
                target.putNextEntry(new JarEntry(name));target.write(bytes);target.closeEntry();
            }
        }
        System.out.println("PASS original_names_restored class_refs="+renamed[0]+" method_refs="+renamed[1]+" field_refs="+renamed[2]+" basic_verifier=true gameplay_not_verified=true");
    }
}
