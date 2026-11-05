package recovery.custom;

public final class MenuBackground {
    private static boolean drawn;
    private MenuBackground() {}
    public static void beginFrame(){drawn=false;}
    public static void loading(Object renderer){try{Object resolution=ClientAccess.getDeclared("net.493",renderer,"48");if(AlanVisuals.menuMode!=null&&!ClientAccess.choice(AlanVisuals.menuMode).equals("Alan"))return;int width=((Number)ClientAccess.call(resolution,"46",int.class,new Class<?>[0])).intValue(),height=((Number)ClientAccess.call(resolution,"48",int.class,new Class<?>[0])).intValue();AlanVisuals.image(0,0,width,height);}catch(Throwable error){ClientAccess.warn("Alan loading background",error);}}
    public static boolean drawCurrent(){try{Object screen=ClientAccess.get(ClientAccess.minecraft(),"44m");return screen!=null&&draw(screen);}catch(Throwable error){ClientAccess.warn("Alan current menu background",error);return false;}}
    public static boolean draw(Object screen) {
        try{
            if(ClientAccess.get(ClientAccess.minecraft(),"44Q")!=null)return false;
            if(screen==null||!ClientAccess.type("net.47Lv").isInstance(screen))return false;
            if(drawn)return true;
            drawn=AlanVisuals.background(screen);return drawn;
        }catch(Throwable error){ClientAccess.warn("Alan background selection",error);return false;}
    }
}
