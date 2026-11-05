package recovery.custom;

/** Uses a crosshair player when the combat modules have no active player target. */
public final class TargetHudRepair {
    private static Object lastTarget;
    private static long lastSeen;
    private TargetHudRepair() {}
    public static Object resolve(Object original) {
        if(original!=null)return original;
        try{
            Object registry=ClientAccess.registry(),target=null;
            String[][] candidates={{"48Q","45z"},{"46e","43c"},{"462","456"}};Class<?> player=ClientAccess.type("net.47Bh");
            for(String[] pair:candidates){Object owner=ClientAccess.get(registry,pair[0]);if(owner!=null){Object found=ClientAccess.get(owner,pair[1]);if(player.isInstance(found)){target=found;break;}}}
            if(target!=null)return target;
            Object mc=ClientAccess.minecraft(),hit=ClientAccess.get(mc,"42Y");
            if(hit!=null)for(java.lang.reflect.Field f:hit.getClass().getDeclaredFields())if(ClientAccess.type("net.47MQ").isAssignableFrom(f.getType())){f.setAccessible(true);Object found=f.get(hit);if(player.isInstance(found)){target=found;break;}}
            if(target!=null){lastTarget=target;lastSeen=System.currentTimeMillis();}
            else if(System.currentTimeMillis()-lastSeen<1000)target=lastTarget;
            // In the HUD editor show the local player so the user can place the widget.
            if(target==null){Object screen=ClientAccess.get(mc,"44m");if(screen!=null&&screen.getClass().getName().equals("net.47Lh"))target=ClientAccess.get(mc,"42P");}
            return target;
        }catch(Throwable error){ClientAccess.warn("TargetHUD target selection",error);return original;}
    }
}
