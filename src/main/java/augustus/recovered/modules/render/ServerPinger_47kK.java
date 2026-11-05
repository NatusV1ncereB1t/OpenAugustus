package augustus.recovered.modules.render;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45H;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ServerPinger_47kK extends client.module.Module {
    public final client.setting.SettingGroup settingServerWidget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingServerWidgetEnabled = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBackgroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingIpInfo = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIpInfoEnabled = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingTextColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBoxColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingBackend = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingPlayerGraph = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingPlayerGraphEnabled = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxEntries = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingKeepPlayerData = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.Map field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   private static String[] method_40$3d4b98126e(int var0) {
      return new String[var0];
   }



   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_44.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ServerPinger_47kK(long a0) {
        super((java.lang.String) ("ServerPinger"),(java.lang.String) ("BereitstellerF\u00fcrTaktischWichtigeInformationen"),(long) (((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 85924156262925L)),(java.awt.Color) (new java.awt.Color((int) (178),(int) (18),(int) (253))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 80455958341863L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 80455958341863L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 80455958341863L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 135330642229314L);
        long constructorKey7 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 81081343627164L);
        long constructorKey8 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 117379940599704L);
        long constructorKey9 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 57902793651299L);
        long constructorKey10 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 9719864783527L);
        long constructorKey11 = ((augustus.recovered.modules.render.ServerPinger_47kK.a ^ a0) ^ 98861552210089L);
        client.setting.SettingGroup initialized12 = new client.setting.SettingGroup(this, "ServerWidget", true, constructorKey7);
        recovery$indy$flow$5(this, initialized12);
        short converted13 = (short) (constructorPart3);
        char converted14 = (char) (constructorPart4);
        java.lang.Object initialValue15 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingServerWidget));
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, "ServerWidgetEnabled", converted13, converted14, constructorPart5, true, (client.setting.SettingGroup) (initialValue15));
        long initialValue17 = constructorKey9;
        java.lang.String initialValue18 = "Enabled";
        client.setting.BooleanSetting initialValue19 = initialized16;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue22 = recovery$indy$flow$11(initialValue20, initialValue21, initialValue17);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$13(this, initialValue23);
        java.lang.Object initialValue24 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingServerWidget));
        client.setting.NumberSetting initialized25 = new client.setting.NumberSetting(this, "PingDelay", Double.longBitsToDouble(4662219572839972864L), Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble(4677104761256804352L), 0, (client.setting.SettingGroup) (initialValue24), constructorKey10);
        recovery$indy$flow$17(this, initialized25);
        java.awt.Color initialized26 = new java.awt.Color(41, 146, 222);
        java.lang.Object initialValue27 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingServerWidget));
        client.setting.ColorSetting initialized28 = new client.setting.ColorSetting(this, "Color", constructorKey8, initialized26, (client.setting.SettingGroup) (initialValue27));
        recovery$indy$flow$23(this, initialized28);
        java.awt.Color initialized29 = new java.awt.Color(0, 0, 0, 120);
        java.lang.Object initialValue30 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingServerWidget));
        client.setting.ColorSetting initialized31 = new client.setting.ColorSetting(this, "BackgroundColor", constructorKey8, initialized29, (client.setting.SettingGroup) (initialValue30));
        recovery$indy$flow$29(this, initialized31);
        client.setting.SettingGroup initialized32 = new client.setting.SettingGroup(this, "IpInfo", true, constructorKey7);
        recovery$indy$flow$32(this, initialized32);
        short converted33 = (short) (constructorPart3);
        char converted34 = (char) (constructorPart4);
        java.lang.Object initialValue35 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingIpInfo));
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, "IpInfoEnabled", converted33, converted34, constructorPart5, true, (client.setting.SettingGroup) (initialValue35));
        long initialValue37 = constructorKey9;
        java.lang.String initialValue38 = "Enabled";
        client.setting.BooleanSetting initialValue39 = initialized36;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue42 = recovery$indy$flow$38(initialValue40, initialValue41, initialValue37);
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue42))))));
        recovery$indy$flow$40(this, initialValue43);
        java.awt.Color initialized44 = new java.awt.Color(41, 146, 222);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingIpInfo));
        client.setting.ColorSetting initialized46 = new client.setting.ColorSetting(this, "TextColor", constructorKey8, initialized44, (client.setting.SettingGroup) (initialValue45));
        recovery$indy$flow$46(this, initialized46);
        java.awt.Color initialized47 = new java.awt.Color(0, 0, 0, 120);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingIpInfo));
        client.setting.ColorSetting initialized49 = new client.setting.ColorSetting(this, "BoxColor", constructorKey8, initialized47, (client.setting.SettingGroup) (initialValue48));
        recovery$indy$flow$52(this, initialized49);
        java.lang.Object initialValue50 = recovery$indy$flow$54();
        java.lang.Object initialValue51 = initialValue50;
        java.lang.Object initialValue52 = ((java.lang.Object)(((net.C_45H) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = recovery$indy$flow$56(initialValue52);
        java.lang.Object initialValue54 = recovery$indy$flow$57();
        java.lang.Object initialValue55 = recovery$indy$flow$58(initialValue54);
        java.lang.Object initialValue56 = recovery$indy$flow$59();
        java.lang.Object initialValue57 = recovery$indy$flow$60(initialValue55, initialValue56);
        java.lang.Object initialValue58 = recovery$indy$flow$61();
        java.lang.Object initialValue59 = recovery$indy$flow$62(initialValue57, initialValue58);
        java.lang.Object initialValue60 = recovery$indy$flow$63(initialValue59);
        java.lang.Object initialValue61 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingIpInfo));
        client.setting.ModeSetting initialized62 = new client.setting.ModeSetting(this, "Backend", (java.lang.String) (initialValue53), (java.lang.String[]) (initialValue60), (client.setting.SettingGroup) (initialValue61), constructorKey11);
        recovery$indy$flow$66(this, initialized62);
        client.setting.SettingGroup initialized63 = new client.setting.SettingGroup(this, "PlayerGraph", true, constructorKey7);
        recovery$indy$flow$69(this, initialized63);
        short converted64 = (short) (constructorPart3);
        char converted65 = (char) (constructorPart4);
        java.lang.Object initialValue66 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingPlayerGraph));
        client.setting.BooleanSetting initialized67 = new client.setting.BooleanSetting(this, "PlayerGraphEnabled", converted64, converted65, constructorPart5, true, (client.setting.SettingGroup) (initialValue66));
        long initialValue68 = constructorKey9;
        java.lang.String initialValue69 = "Enabled";
        client.setting.BooleanSetting initialValue70 = initialized67;
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue72 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue73 = recovery$indy$flow$75(initialValue71, initialValue72, initialValue68);
        java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue73))))));
        recovery$indy$flow$77(this, initialValue74);
        java.lang.Object initialValue75 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingPlayerGraph));
        client.setting.NumberSetting initialized76 = new client.setting.NumberSetting(this, "MaxEntries", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4647503709213818880L), 0, (client.setting.SettingGroup) (initialValue75), constructorKey10);
        recovery$indy$flow$81(this, initialized76);
        short converted77 = (short) (constructorPart3);
        char converted78 = (char) (constructorPart4);
        java.lang.Object initialValue79 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingPlayerGraph));
        client.setting.BooleanSetting initialized80 = new client.setting.BooleanSetting(this, "KeepPlayerData", converted77, converted78, constructorPart5, true, (client.setting.SettingGroup) (initialValue79));
        recovery$indy$flow$85(this, initialized80);
        java.util.HashMap initialized81 = new java.util.HashMap();
        recovery$indy$flow$88(this, initialized81);
        java.lang.Object initialValue82 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingColor));
        int initialValue83 = 1;
        java.lang.Object initialValue84 = initialValue82;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue84))))));
        recovery$indy$flow$91(initialValue85, (initialValue83 != 0));
        java.lang.Object initialValue86 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingColor));
        int initialValue87 = 255;
        java.lang.Object initialValue88 = initialValue86;
        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue88))))));
        recovery$indy$flow$94(initialValue89, initialValue87);
        java.lang.Object initialValue90 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingTextColor));
        int initialValue91 = 1;
        java.lang.Object initialValue92 = initialValue90;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue92))))));
        recovery$indy$flow$97(initialValue93, (initialValue91 != 0));
        java.lang.Object initialValue94 = ((java.lang.Object)(((augustus.recovered.modules.render.ServerPinger_47kK) (((java.lang.Object)(this)))).settingTextColor));
        int initialValue95 = 255;
        java.lang.Object initialValue96 = initialValue94;
        java.lang.Object initialValue97 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue96))))));
        recovery$indy$flow$100(initialValue97, initialValue95);
        long initialValue98 = constructorKey6;
        int initialValue99 = 0;
        int initialValue100 = 1;
        ServerPinger_47kK initialValue101 = this;
        java.lang.Object initialValue102 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(initialValue101))))));
        recovery$indy$flow$102(initialValue102, (initialValue100 != 0), (initialValue99 != 0), initialValue98);
        return;
    }






    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$5(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$11(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$13(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$17(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$23(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$29(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$32(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$38(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$40(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$46(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$52(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$54() {
        return net.C_45H.INCOLUMITAS;
    }

    private static native java.lang.Object recovery$indy$flow$56(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$57();
    private static java.lang.Object recovery$indy$flow$58(java.lang.Object a0) {
        return java.util.Arrays.stream(((java.lang.Object[]) (a0)));
    }
    private static native java.lang.Object recovery$indy$flow$59();
    private static java.lang.Object recovery$indy$flow$60(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).map(((java.util.function.Function) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$61();
    private static java.lang.Object recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).toArray(((java.util.function.IntFunction) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$63(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }

    private static native void recovery$indy$flow$66(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$69(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$75(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$77(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$81(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$85(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$88(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$91(java.lang.Object a0,boolean a1);


    private static native void recovery$indy$flow$94(java.lang.Object a0,int a1);


    private static native void recovery$indy$flow$97(java.lang.Object a0,boolean a1);


    private static native void recovery$indy$flow$100(java.lang.Object a0,int a1);

    private static native void recovery$indy$flow$102(java.lang.Object a0,boolean a1,boolean a2,long a3);
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$3();
}
