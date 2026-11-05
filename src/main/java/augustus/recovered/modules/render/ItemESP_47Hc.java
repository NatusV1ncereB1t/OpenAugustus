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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42R;
import net.C_43S;
import net.C_43r;
import net.C_45V;
import net.C_45n;
import net.C_45r;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47mS;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ItemESP_47Hc extends client.module.Module implements client.event.RenderListener,net.C_47xz {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBoxColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRenderCustomItemnames = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingApplyNametagsRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.BooleanSetting field_43; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.HashMap field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public static void method_46$05a886777b(String[] var0) {
      field_47 = var0;
   }



    public static boolean method_46$214fd8f084(C_43r c_43r, long l) {
        C_47mS c_47mS;
        l = a ^ l;
        int[] nArray = ItemESP_47Hc.recovery$indy$1(-7260295243471390103L, l);
        Object object = field_43;
        if (nArray == null) {
            boolean bl = ItemESP_47Hc.recovery$indy$2(object, -7261497779931594338L, l);
            if (l < 0L) return bl;
            if (!bl) {
                return true;
            }
            object = field_45.get(c_43r);
        }
        C_47mS c_47mS2 = c_47mS = (C_47mS)object;
        if (nArray == null) {
            if (c_47mS2 == null) return false;
            c_47mS2 = c_47mS;
        }
        boolean bl = c_47mS2.field_48;
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }



    private static native void a();

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public static String[] method_48$44c5829186() {
      return field_47;
   }



   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 44744969506516L;
      long var3 = var1 ^ 3321819975621L;
      long var5 = var1 ^ 26933110702496L;
      long var10003 = -4300585101342507566L;
      long var7 = var5;
      ModeSetting var9 = this.settingMode;
      String var10002 = var9.method_46$5f9dc63072(var7);
      var10003 = -4300708569539241606L;
      String var10 = var10002;
      long var11 = var3;
      ItemESP_47Hc var13 = this;
      var13.method_47$d07b98bfef(var11, var10);
   }



    public ItemESP_47Hc(long a0) {
        super((java.lang.String) ("ItemESP"),(java.lang.String) ("ArtikelDurchWandSehen"),(long) (((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 84206399491726L)),(java.awt.Color) (java.awt.Color.RED),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 137885861020536L);
        long constructorKey4 = ((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 57590343681960L);
        long constructorKey5 = ((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 7841636122179L);
        long constructorKey6 = ((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 67831880307349L);
        long constructorKey7 = ((augustus.recovered.modules.render.ItemESP_47Hc.a ^ a0) ^ 97998280823472L);
        java.lang.Object initialValue8 = recovery$indy$flow$18(2);
        ((java.lang.Object[]) initialValue8)[0] = "Box";
        ((java.lang.Object[]) initialValue8)[1] = "Vanilla";
        client.setting.ModeSetting initialized9 = new client.setting.ModeSetting(this, "Mode", constructorKey5, "Box", (java.lang.String[]) (initialValue8));
        recovery$indy$flow$20(this, initialized9);
        java.awt.Color initialized10 = new java.awt.Color(71, 151, 255, 100);
        client.setting.ColorSetting initialized11 = new client.setting.ColorSetting(constructorKey7, this, "BoxColor", initialized10);
        recovery$indy$flow$25(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey6, "Render custom itemnames", false);
        recovery$indy$flow$28(this, initialized12);
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, constructorKey6, "Apply nametags rendering", false);
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.render.ItemESP_47Hc) (((java.lang.Object)(this)))).settingRenderCustomItemnames));
        java.lang.Object initialValue15 = recovery$indy$flow$32(initialValue14);
        java.lang.Object initialValue16 = recovery$indy$flow$33(initialValue14);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey4;
        client.setting.BooleanSetting initialValue19 = initialized13;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$36(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$38(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey6, "Only show whitelisted items", false);
        recovery$indy$flow$41(initialized24);
        java.lang.Object initialValue25 = recovery$indy$flow$42();
        java.util.HashSet initialized26 = new java.util.HashSet();
        java.util.HashSet initialValue27 = initialized26;
        java.lang.Object initialValue28 = recovery$indy$flow$45();
        java.lang.Object initialValue29 = recovery$indy$flow$46(initialValue28);
        java.lang.Object initialValue30 = initialValue29;
        java.lang.Object initialValue31 = initialValue25;
    
        Object whitelistSource;
        while (true) {
            Object item;
            if (recovery$indy$flow$47(initialValue30)) {
                item = ((java.lang.Object)(((net.C_43r) (((java.lang.Object)(recovery$indy$flow$48(initialValue30)))))));
            } else {
                Object registry = recovery$indy$flow$73();
                if (constructorKey2 > 0L) {
                    whitelistSource = recovery$indy$flow$74(registry);
                    break;
                }
                item = ((java.lang.Object)(((net.C_43r) (((java.lang.Object)(registry))))));
            }
            Object itemName = recovery$indy$flow$50(item);
            Object displayName = recovery$indy$flow$51(itemName, 5);
            if (initialValue31 != null) {
                whitelistSource = initialValue27;
                break;
            }
            if (recovery$indy$flow$52(initialValue27, displayName)) {
                Object label = recovery$indy$flow$55(new StringBuilder(), displayName);
                label = recovery$indy$flow$56(label, "-");
                int itemId = recovery$indy$flow$57(item);
                label = recovery$indy$flow$58(label, itemId);
                displayName = recovery$indy$flow$59(label);
            } else {
                recovery$indy$flow$60(initialValue27, displayName);
            }
            Object registry = recovery$indy$flow$61();
            boolean selected = recovery$indy$flow$63(item)
                    || recovery$indy$flow$64(item)
                    || recovery$indy$flow$65(item)
                    || item == recovery$indy$flow$66()
                    || item == recovery$indy$flow$67()
                    || item == recovery$indy$flow$68()
                    || item == recovery$indy$flow$69()
                    || item == recovery$indy$flow$70();
            Object itemSetting = recovery$indy$flow$71(displayName, selected, null);
            recovery$indy$flow$72(registry, item, itemSetting);
        }
        Object whitelist = recovery$indy$flow$77(recovery$indy$flow$76(whitelistSource, recovery$indy$flow$75(0)));
        Object sortKey = recovery$indy$flow$78();
        Object comparator = recovery$indy$flow$79(sortKey);
        recovery$indy$flow$80(whitelist, comparator);
        Object selection = recovery$indy$flow$82(this, "Whitelisted items", constructorKey3, whitelist);
        Object onlyWhitelisted = recovery$indy$flow$83();
        recovery$indy$flow$84(onlyWhitelisted);
        Object visibleWhen = recovery$indy$flow$85(onlyWhitelisted);
        recovery$indy$flow$88(((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(selection)))))), ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(visibleWhen)))))));
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$18(int a0);
    private static native void recovery$indy$flow$20(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$25(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$28(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$32(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$33(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$36(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$38(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$41(java.lang.Object a0) {
        augustus.recovered.modules.render.ItemESP_47Hc.field_43 = ((client.setting.BooleanSetting) (a0));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$42();
    private static java.lang.Object recovery$indy$flow$45() {
        return net.C_43r.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$46(java.lang.Object a0);
    private static boolean recovery$indy$flow$47(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$48(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$50(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$51(java.lang.Object a0,int a1) {
        return ((java.lang.String) (a0)).substring(a1);
    }
    private static boolean recovery$indy$flow$52(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashSet) (a0)).contains(a1);
    }
    private static java.lang.Object recovery$indy$flow$55(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$56(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native int recovery$indy$flow$57(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$58(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$59(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static boolean recovery$indy$flow$60(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashSet) (a0)).add(a1);
    }
    private static java.lang.Object recovery$indy$flow$61() {
        return augustus.recovered.modules.render.ItemESP_47Hc.field_45;
    }
    private static boolean recovery$indy$flow$63(java.lang.Object a0) {
        return (a0 instanceof net.C_45r);
    }
    private static boolean recovery$indy$flow$64(java.lang.Object a0) {
        return (a0 instanceof net.C_43S);
    }
    private static boolean recovery$indy$flow$65(java.lang.Object a0) {
        return (a0 instanceof net.C_45V);
    }
    private static java.lang.Object recovery$indy$flow$66() {
        return net.C_42R.field_41e;
    }
    private static java.lang.Object recovery$indy$flow$67() {
        return net.C_42R.field_41y;
    }
    private static java.lang.Object recovery$indy$flow$68() {
        return net.C_42R.field_45p;
    }
    private static java.lang.Object recovery$indy$flow$69() {
        return net.C_42R.field_47I;
    }
    private static java.lang.Object recovery$indy$flow$70() {
        return net.C_42R.field_41I;
    }
    private static native java.lang.Object recovery$indy$flow$71(java.lang.Object a0,boolean a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$72(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$73() {
        return augustus.recovered.modules.render.ItemESP_47Hc.field_45;
    }
    private static java.lang.Object recovery$indy$flow$74(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).values();
    }
    private static native java.lang.Object recovery$indy$flow$75(int a0);
    private static java.lang.Object recovery$indy$flow$76(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Collection) (a0)).toArray(((java.lang.Object[]) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$77(java.lang.Object a0) {
        return ((net.C_47mS[]) (a0));
    }
    private static native java.lang.Object recovery$indy$flow$78();
    private static java.lang.Object recovery$indy$flow$79(java.lang.Object a0) {
        return java.util.Comparator.comparing(((java.util.function.Function) (a0)));
    }
    private static void recovery$indy$flow$80(java.lang.Object a0,java.lang.Object a1) {
        java.util.Arrays.sort(((java.lang.Object[]) (a0)), ((java.util.Comparator) (a1)));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3);
    private static java.lang.Object recovery$indy$flow$83() {
        return augustus.recovered.modules.render.ItemESP_47Hc.field_43;
    }
    private static java.lang.Object recovery$indy$flow$84(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$88(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$6();
}
