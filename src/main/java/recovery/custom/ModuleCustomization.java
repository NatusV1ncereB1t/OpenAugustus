package recovery.custom;

import java.lang.reflect.*;
import java.util.*;

/** Integrates the editable Alan modules into module collections. */
public final class ModuleCustomization {
    private static long moduleKey,choiceKey;
    private static boolean moduleKeySeen,choiceKeySeen,creating;
    private static AlanESP alanESP;
    private ModuleCustomization() {}
    public static void rememberModuleKey(long key){moduleKey=key;moduleKeySeen=true;}
    public static void rememberChoiceKey(long key){choiceKey=key;choiceKeySeen=true;}
    public static Object newChoice(Object owner,String label,String value,String[] choices)throws Exception {
        if(!choiceKeySeen)throw new IllegalStateException("A validated mode constructor key has not been observed");
        return ClientAccess.type("net.47Tj").getConstructor(ClientAccess.type("net.47OQ"),String.class,long.class,String.class,String[].class).newInstance(owner,label,choiceKey,value,choices);
    }
    public static void onModuleCreated(Object module){AlanVisuals.initializeModule(module);}
    @SuppressWarnings({"rawtypes","unchecked"})
    public static Collection filter(Collection modules) {
        if(modules==null||modules.isEmpty())return modules;Object first=modules.iterator().next();Class<?> base=ClientAccess.type("net.47OQ");
        if(first==null||!base.isInstance(first))return modules;
        try{
            if(alanESP==null&&!creating&&moduleKeySeen){creating=true;try{alanESP=new AlanESP(moduleKey);System.err.println("[custom] AlanESP source module registered");}finally{creating=false;}}
            if(alanESP!=null){
                Class<?> events=ClientAccess.type("de.florianmichael.dietrichevents2.DietrichEvents2");
                Object bus=ClientAccess.getDeclared("net.47yA",null,"41");
                int event=((Number)ClientAccess.get(ClientAccess.type("net.47yP"),"48")).intValue();
                if(!Boolean.TRUE.equals(ClientAccess.call(bus,"isSubscriber",boolean.class,new Class<?>[]{int.class,Object.class},event,alanESP)))ClientAccess.call(bus,"subscribe",void.class,new Class<?>[]{int.class,Object.class},event,alanESP);
            }
            if(alanESP!=null&&!modules.contains(alanESP)){
                boolean all=modules.size()>100,renderOnly=!all;
                for(Object item:modules)if(item!=null&&base.isInstance(item)){Object category=ClientAccess.getDeclared("net.47OQ",item,"49");if(!String.valueOf(category).equals("RENDER")){renderOnly=false;break;}}
                if(all||renderOnly)modules.add(alanESP);
            }
        }catch(UnsupportedOperationException immutable){
            List<Object> copy=new ArrayList<Object>(modules);return copy;
        }catch(Throwable error){ClientAccess.warn("module registration",error);}
        return modules;
    }
    public static boolean shaderEnabled(Object setting,boolean shadow) {
        if(!ClientAccess.bool(setting))return false;
        try{Object module=ClientAccess.module(shadow?"net.47HW":"net.47QW");if(module==null)return false;
            if(!ClientAccess.enabled(module))ClientAccess.call(module,"42",void.class,new Class<?>[]{Boolean.class},Boolean.TRUE);
            return ClientAccess.enabled(module);
        }catch(Throwable error){ClientAccess.warn("shared shader dependency",error);return false;}
    }
    public static String accountLabel(String original){if(original!=null&&original.startsWith("Username:"))return "KanyeWest";return original;}
    public static String mainMenuName(String original){int suffix=original==null?-1:original.indexOf(" §7[");if(suffix<0&&original!=null)suffix=original.indexOf(" [");return "§eKanyeWest"+(suffix<0?"":original.substring(suffix));}
}
