package recovery.custom;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/** Cached access to the retained client ABI; no network or account access. */
public final class ClientAccess {
    private static final Map<String,Field> FIELDS=new ConcurrentHashMap<String,Field>();
    private static final Map<String,Method> METHODS=new ConcurrentHashMap<String,Method>();
    private static final Set<String> WARNED=Collections.newSetFromMap(new ConcurrentHashMap<String,Boolean>());
    private ClientAccess() {}
    public static Class<?> type(String name) {
        try{return Class.forName(name,false,ClientAccess.class.getClassLoader());}catch(ClassNotFoundException e){throw new IllegalStateException(name,e);}
    }
    public static Field field(Class<?> owner,String name) {
        String key=owner.getName()+"."+name;Field found=FIELDS.get(key);if(found!=null)return found;
        for(Class<?> c=owner;c!=null;c=c.getSuperclass())try{found=c.getDeclaredField(name);found.setAccessible(true);FIELDS.put(key,found);return found;}catch(NoSuchFieldException ignored){}
        throw new IllegalStateException("Missing field "+key);
    }
    public static Object get(Object target,String name) {
        try{return field(target instanceof Class?(Class<?>)target:target.getClass(),name).get(target instanceof Class?null:target);}catch(IllegalAccessException e){throw new IllegalStateException(e);}
    }
    public static Object getDeclared(String owner,Object target,String name) {
        try{return field(type(owner),name).get(target);}catch(IllegalAccessException e){throw new IllegalStateException(e);}
    }
    public static void set(Object target,String name,Object value) {
        try{field(target instanceof Class?(Class<?>)target:target.getClass(),name).set(target instanceof Class?null:target,value);}catch(IllegalAccessException e){throw new IllegalStateException(e);}
    }
    public static Method method(Class<?> owner,String name,Class<?> result,Class<?>...args) {
        String key=owner.getName()+"."+name+Arrays.toString(args)+result.getName();Method found=METHODS.get(key);if(found!=null)return found;
        for(Class<?> c=owner;c!=null;c=c.getSuperclass())for(Method m:c.getDeclaredMethods())if(m.getName().equals(name)&&m.getReturnType()==result&&Arrays.equals(m.getParameterTypes(),args)){m.setAccessible(true);METHODS.put(key,m);return m;}
        throw new IllegalStateException("Missing exact method "+key);
    }
    public static Object call(Object target,String name,Class<?> result,Class<?>[] signature,Object...args) {
        try{return method(target instanceof Class?(Class<?>)target:target.getClass(),name,result,signature).invoke(target instanceof Class?null:target,args);}
        catch(InvocationTargetException e){throw new IllegalStateException(e.getCause());}catch(IllegalAccessException e){throw new IllegalStateException(e);}
    }
    public static Object minecraft(){return call(type("net.47nT"),"46",type("net.47nT"),new Class<?>[0]);}
    public static Object registry(){return get(type("net.47rF"),"48");}
    public static Object module(String className) {
        Object registry=registry();if(registry==null)return null;
        for(Field f:registry.getClass().getDeclaredFields())if(f.getType().getName().equals(className))try{f.setAccessible(true);return f.get(registry);}catch(IllegalAccessException e){throw new IllegalStateException(e);}
        return null;
    }
    public static Object value(Object setting) {
        if(setting==null)return null;
        if(setting.getClass().getName().equals("net.47Tj")||type("net.47Tj").isInstance(setting))return call(getDeclared("net.47Tj",setting,"48"),"48",Object.class,new Class<?>[0]);
        for(Class<?> c=setting.getClass();c!=null&&!c.getName().equals("net.47Ti");c=c.getSuperclass())for(Field f:c.getDeclaredFields()){
            if(Modifier.isStatic(f.getModifiers())||!f.getType().getName().startsWith("net.47v"))continue;
            try{f.setAccessible(true);Object state=f.get(setting);if(state!=null)return call(state,"48",Object.class,new Class<?>[0]);}catch(RuntimeException ignored){}catch(IllegalAccessException ignored){}
        }
        return null;
    }
    public static boolean enabled(Object module) {return module!=null&&Boolean.TRUE.equals(call(getDeclared("net.47OQ",module,"48"),"48",Object.class,new Class<?>[0]));}
    public static boolean bool(Object setting){return Boolean.TRUE.equals(value(setting));}
    public static double number(Object setting,double fallback){Object v=value(setting);return v instanceof Number?((Number)v).doubleValue():fallback;}
    public static double coordinate(Object entity,String name){return ((Number)getDeclared("net.47MQ",entity,name)).doubleValue();}
    public static String choice(Object setting){Object v=value(setting);return v==null?"":String.valueOf(v);}
    public static void choices(Object setting,String value) {
        String[] before=(String[])getDeclared("net.47Tj",setting,"443");
        String[] after=before;
        if(!Arrays.asList(before).contains(value)){after=Arrays.copyOf(before,before.length+1);after[before.length]=value;}
        // The original setter also rebuilds the option-width cache used by the dropdown.
        call(setting,"46",void.class,new Class<?>[]{String[].class},(Object)after);
    }
    public static void warn(String key,Throwable error){if(WARNED.add(key))System.err.println("[custom] "+key+": "+error);}
}
