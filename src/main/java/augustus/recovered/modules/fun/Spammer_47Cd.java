package augustus.recovered.modules.fun;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47D1;
import net.C_47DD;
import net.C_47DG;
import net.C_47Db;
import net.C_47De;
import net.C_47Gw;
import client.module.Module;
import net.C_47Th;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.minecraft.client.multiplayer.WorldClient;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_47yN;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Spammer_47Cd extends client.module.Module implements net.C_47xz {
    private final client.setting.RangeSetting settingTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47Th settingRandomMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSpammMessage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private java.lang.String field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native int a(long a0,long a1);

    private void method_42$db82fd5e78(String string, long l) {
        String[] stringArray;
        long l2;
        block7: {
            Spammer_47Cd spammer_47Cd;
            block8: {
                int n;
                long l3;
                block5: {
                    block6: {
                        long l4 = l = a ^ l;
                        l3 = l4 ^ 0x2FFFF38942BDL;
                        l2 = l4 ^ 0x3C8D80789485L;
                        long l5 = l4 ^ 0x46B17143AADAL;
                        this.field_44 = string;
                        String string2 = Spammer_47Cd.recovery$indy$2(this.settingSpammMessage, l2, 5871146911235877590L, l).toLowerCase(Locale.ROOT);
                        stringArray = Spammer_47Cd.recovery$indy$1(5871889460253258480L, l);
                        C_47yN c_47yN = Spammer_47Cd.recovery$indy$4(Spammer_47Cd.recovery$indy$3(5871396556516103631L, l), 5871516087910799628L, l);
                        n = ((int) (string2.startsWith(Spammer_47Cd.recovery$indy$5(c_47yN.field_45, l5, 5870998213144053221L, l).toLowerCase(Locale.ROOT)) ? 1 : 0));
                        if (stringArray == null) break block5;
                        if (n != 0) break block6;
                        n = string2.startsWith(Spammer_47Cd.recovery$indy$6(c_47yN.field_46, l5, 5870998213144053221L, l).toLowerCase(Locale.ROOT)) ? 1 : 0;
                        if (stringArray == null) break block5;
                        if (n != 0) break block6;
                        n = string2.startsWith(Spammer_47Cd.recovery$indy$7(c_47yN.field_48, l5, 5870998213144053221L, l).toLowerCase(Locale.ROOT)) ? 1 : 0;
                        if (stringArray == null) break block5;
                        if (n != 0) break block6;
                        n = string2.startsWith(Spammer_47Cd.recovery$indy$8(c_47yN.field_40, l5, 5870998213144053221L, l).toLowerCase(Locale.ROOT)) ? 1 : 0;
                        if (stringArray == null) break block5;
                        if (n == 0) break block7;
                    }
                    spammer_47Cd = this;
                    if (stringArray == null) break block8;
                    n = spammer_47Cd.field_43y;
                }
                if (n > 1) {
                    Spammer_47Cd.recovery$indy$9((Object)ClientGlobals.field_48.field_46_, l3, true, 5871250359282117880L, l);
                }
                spammer_47Cd = this;
            }
            ++spammer_47Cd.field_43y;
            return;
        }
        this.field_43y = 0;
        EntityPlayerSP c_47B2 = Spammer_47Cd.recovery$indy$10(field_43, 5870685430269604565L, l);
        StringBuilder stringBuilder = new StringBuilder().append(Spammer_47Cd.recovery$indy$11(this.settingSpammMessage, l2, 5871146911235877590L, l));
        String string3 = string;
        if (stringArray != null) {
            string3 = string3.equals("") ? "" : Spammer_47Cd.recovery$indy$12(472, 0x68BC354D1DD8ACD8L ^ l) + string;
        }
        c_47B2.method_49$a7421bf54c(stringBuilder.append(string3).toString());
    }




    private static native java.lang.reflect.Method d(long a0,long a1);

   private static boolean method_48$aae029aa0a() {
      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 40, var3, -7099139579116722540L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$14(this.settingTickDelay, 2732558371500512200L, var4);
   }



    public void method_488$e45a9973e5(long l) {
        net.C_47Db c_47Db;
        int n;
        String[] stringArray;
        int n2;
        int n3;
        String[] stringArray2;
        Object object;
        long l2;
        long l3;
        block9: {
            String[] stringArray3;
            block10: {
                net.C_47Db c_47Db2;
                String[] stringArray4;
                int n4;
                block8: {
                    long l4 = l;
                    l3 = l4 ^ 0x5A426860CB01L;
                    l2 = l4 ^ 0x20F598789B19L;
                    stringArray3 = Spammer_47Cd.recovery$indy$15(-5076861460720674298L, l);
                    ++this.field_42;
                    String[] stringArray5 = stringArray3;
                    object = field_43;
                    if (stringArray5 == null) break block8;
                    net.minecraft.client.entity.EntityPlayerSP c_47B2 = Spammer_47Cd.recovery$indy$16(object, -5075938897677444573L, l);
                    if (c_47B2 == null) return;
                    object = field_43;
                    net.minecraft.client.multiplayer.WorldClient c_47hb = Spammer_47Cd.recovery$indy$17(object, -5075884602210730035L, l);
                    if (c_47hb == null) return;
                    object = field_43;
                    long l5 = l - 0L;
                    long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                    stringArray2 = stringArray3;
                    n3 = Spammer_47Cd.recovery$indy$18((Object)object, (long)-5075938897677444573L, (long)l).field_48y;
                    if (l6 < 0) break block9;
                    break block10;
                }
                long l7 = l - 0L;
                long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                String[] stringArray6 = stringArray3;
                int n5 = Spammer_47Cd.recovery$indy$18((Object)object, (long)-5075938897677444573L, (long)l).field_48y;
                if (l8 >= 0) {
                    String[] stringArray7 = stringArray6;
                    if (stringArray7 != null) {
                        int n6 = n5;
                        n4 = 10;
                        if (n6 <= n4) return;
                        n5 = Spammer_47Cd.recovery$indy$19(field_43, -5075780272963456328L, l) ? 1 : 0;
                    }
                    stringArray6 = stringArray3;
                }
                if ((stringArray4 = stringArray6) != null) {
                    int n7 = n5;
                    if (n7 == 0) return;
                    object = this;
                } else {
                    int n8 = n5;
                    n4 = Spammer_47Cd.recovery$indy$20(this.settingTickDelay, -5075713448307810602L, l);
                    if (n8 <= n4) return;
                    this.field_42 = 0;
                    object = this;
                }
                net.C_47Db c_47Db3 = c_47Db2 = (net.C_47Db)Spammer_47Cd.recovery$indy$21(((Spammer_47Cd)object).settingRandomMode, -5079991565766727187L, l);
                if (c_47Db3 != null) {
                    Spammer_47Cd.recovery$indy$23(this, Spammer_47Cd.recovery$indy$22(c_47Db2, l3, -5076108527678501753L, l), l2, -5076605574033138477L, l);
                }
                Spammer_47Cd.recovery$indy$24(this.settingTickDelay, -5079853582595043421L, l);
                return;
            }
            String[] stringArray8 = stringArray2;
            if (stringArray8 != null) {
                int n9 = n3;
                n2 = 10;
                if (n9 <= n2) return;
                n3 = Spammer_47Cd.recovery$indy$19(field_43, -5075780272963456328L, l) ? 1 : 0;
            }
            stringArray2 = stringArray3;
        }
        if ((stringArray = stringArray2) != null) {
            int n10 = n3;
            if (n10 == 0) return;
            object = this;
            n3 = ((Spammer_47Cd)object).field_42;
        }
        if ((n = n3) <= (n2 = Spammer_47Cd.recovery$indy$20(this.settingTickDelay, -5075713448307810602L, l))) return;
        this.field_42 = 0;
        object = this;
        net.C_47Db c_47Db4 = c_47Db = (net.C_47Db)Spammer_47Cd.recovery$indy$21(((Spammer_47Cd)object).settingRandomMode, -5079991565766727187L, l);
        if (c_47Db4 != null) {
            Spammer_47Cd.recovery$indy$23(this, Spammer_47Cd.recovery$indy$22(c_47Db, l3, -5076108527678501753L, l), l2, -5076605574033138477L, l);
        }
        Spammer_47Cd.recovery$indy$24(this.settingTickDelay, -5079853582595043421L, l);
    }



    public Spammer_47Cd(long a0) {
        super((java.lang.String) ("Spammer"),(java.lang.String) ("Vollm\u00fcller"),(long) (((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 27038168660695L)),(java.awt.Color) (new java.awt.Color((int) (77),(int) (112),(int) (107))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 139482224232015L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 139482224232015L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 139482224232015L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 91410881104410L);
        long constructorKey7 = ((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 90014848897834L);
        int constructorPart8 = (int) ((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 42676944600650L) >>> 32));
        int constructorPart9 = (int) (((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 42676944600650L) << 32) >>> 48));
        int constructorPart10 = (int) (((((augustus.recovered.modules.fun.Spammer_47Cd.a ^ a0) ^ 42676944600650L) << 48) >>> 48));
        short converted11 = (short) (constructorPart4);
        short converted12 = (short) (constructorPart5);
        client.setting.RangeSetting initialized13 = new client.setting.RangeSetting(constructorPart3, this, "TickDelay", Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4630826316843712512L), converted11, 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, converted12);
        long initialValue14 = constructorKey7;
        client.setting.RangeSetting initialValue15 = initialized13;
        java.lang.Object initialValue16 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue17 = recovery$indy$flow$82(initialValue16, initialValue14);
        recovery$indy$flow$83(this, initialValue17);
        short converted18 = (short) (constructorPart9);
        short converted19 = (short) (constructorPart10);
        java.lang.Object initialValue20 = recovery$indy$flow$85(4);
        java.lang.Object initialValue21 = recovery$indy$flow$86();
        ((java.lang.Object[]) initialValue20)[0] = initialValue21;
        java.lang.Object initialValue22 = recovery$indy$flow$87();
        ((java.lang.Object[]) initialValue20)[1] = initialValue22;
        java.lang.Object initialValue23 = recovery$indy$flow$88();
        ((java.lang.Object[]) initialValue20)[2] = initialValue23;
        java.lang.Object initialValue24 = recovery$indy$flow$89();
        ((java.lang.Object[]) initialValue20)[3] = initialValue24;
        net.C_47Th initialized25 = new net.C_47Th(constructorPart8, converted18, converted19, this, "RandomMode", "RandomAlphanumeric", (java.util.function.BiFunction[]) (initialValue20));
        recovery$indy$flow$91(this, initialized25);
        java.lang.Object initialValue26 = recovery$indy$flow$93(0);
        client.setting.ModeSetting initialized27 = new client.setting.ModeSetting(this, "SpammMessage", constructorKey6, "Augustus on top!", (java.lang.String[]) (initialValue26));
        java.lang.Object initialValue28 = recovery$indy$flow$95();
        java.lang.Object initialValue29 = initialValue28;
        client.setting.ModeSetting initialValue30 = initialized27;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue33 = recovery$indy$flow$98(initialValue31, initialValue32);
        recovery$indy$flow$99(this, initialValue33);
        recovery$indy$flow$100(this, 0);
        recovery$indy$flow$101(this, "");
        recovery$indy$flow$102(this, 0);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$83(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$85(int a0);
    private static native java.lang.Object recovery$indy$flow$86();
    private static native java.lang.Object recovery$indy$flow$87();
    private static native java.lang.Object recovery$indy$flow$88();
    private static native java.lang.Object recovery$indy$flow$89();
    private static native void recovery$indy$flow$91(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$93(int a0);
    private static native java.lang.Object recovery$indy$flow$95();


    private static native java.lang.Object recovery$indy$flow$98(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$99(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$100(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.Spammer_47Cd) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$101(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.fun.Spammer_47Cd) (a0)).field_44 = ((java.lang.String) (a1));
        return;
    }
    private static void recovery$indy$flow$102(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.Spammer_47Cd) (a0)).field_43y = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native Client recovery$indy$3(long var0, long var2);
   private static native C_47yN recovery$indy$4(Object var0, long var1, long var3);
   private static native String recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$9(Object var0, long var1, boolean var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native String recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$12(int var0, long var1);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$14(Object var0, long var1, long var3);
   private static native String[] recovery$indy$15(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native int recovery$indy$20(Object var0, long var1, long var3);
   private static native C_47Gw recovery$indy$21(Object var0, long var1, long var3);
   private static native String recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$23(Object var0, Object var1, long var2, long var4, long var6);
   private static native double recovery$indy$24(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$26();
}
