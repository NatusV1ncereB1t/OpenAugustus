package augustus.recovered.modules.player;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_472n;
import net.C_473U;
import net.C_479E;
import net.C_479N;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47Rw;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47hi;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47od;
import client.module.Category;
import net.C_47xZ;
import net.C_49p;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AirStuck_47Q4 extends client.module.Module implements net.C_47od,net.C_47hi,net.C_47Vc,net.C_47iC {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$9035875d26(long l, C_47ob c_47ob) {
        block22: {
            C_473U c_473U;
            boolean bl;
            long l2;
            block20: {
                block21: {
                    boolean bl2;
                    block19: {
                        l2 = l ^ 0x104DA8BA59CDL;
                        bl = AirStuck_47Q4.method_419$aae029aa0a();
                        C_47ob c_47ob2 = c_47ob;
                        c_473U = c_47ob2.method_46$96fcbedb66();
                        bl2 = c_473U instanceof C_479E;
                        if (bl) break block19;
                        if (!bl2) return;
                        Minecraft c_47nT = field_43;
                        if (!c_47nT.field_42P.field_48M) break block20;
                        break block21;
                    }
                    if (bl2) {
                        return;
                    }
                    long l3 = l2;
                    ModeSetting c_47Tj = this.settingMode;
                    String string = c_47Tj.method_46$5f9dc63072(l3);
                    int n = -1;
                    switch (string.hashCode()) {
                        case 0: {
                            c_47ob.cancel();
                            boolean bl3 = bl;
                            if (l >= 0L) {
                                if (!bl3) return;
                                bl3 = c_473U instanceof C_479N;
                            }
                            if (bl3) return;
                            c_47ob.cancel();
                            return;
                        }
                        case 1: {
                            if (c_473U instanceof C_479N) return;
                            c_47ob.cancel();
                            return;
                        }
                    }
                    return;
                }
                BooleanSetting c_47TV = this.settingOnlyInAir;
                if (c_47TV.method_49$aae029aa0a()) break block22;
            }
            long l4 = l2;
            ModeSetting c_47Tj = this.settingMode;
            String string = c_47Tj.method_46$5f9dc63072(l4);
            int n = -1;
            switch (string.hashCode()) {
                case 682567324: {
                    if (!string.equals("NoRotate")) break;
                    n = 0;
                    boolean bl4 = bl;
                    if (l > 0L) {
                        if (!bl4) break;
                        bl4 = string.equals("CanRotate");
                    }
                    if (!bl4) break;
                    n = 1;
                    break;
                }
                case 2003324203: {
                    if (!string.equals("CanRotate")) break;
                    n = 1;
                    break;
                }
            }
            switch (n) {
                case 0: {
                    c_47ob.cancel();
                    boolean bl5 = bl;
                    if (l >= 0L) {
                        if (!bl5) return;
                        bl5 = c_473U instanceof C_479N;
                    }
                    if (bl5) return;
                    c_47ob.cancel();
                    return;
                }
                case 1: {
                    if (c_473U instanceof C_479N) return;
                    c_47ob.cancel();
                    return;
                }
            }
            return;
        }
    }




   public void method_44$3b2c9d0e78(C_49p var1, long var2) {
      long var4 = var2 ^ 107598548495088L;
      long var6 = var2 ^ 134860041331861L;
      recovery$indy$2(this, var4, recovery$indy$1(this.settingMode, var6, 7018479027930891590L, var2), 7018408742515799097L, var2);
      boolean var10000 = recovery$indy$3(7019179801925231689L, var2);
      recovery$indy$4(field_43, 7018612944575072027L, var2).field_42 = 0.0;
      boolean var8 = var10000;
      recovery$indy$5(field_43, 7018612944575072027L, var2).field_48s = 0.0;
      recovery$indy$6(field_43, 7018612944575072027L, var2).field_487 = 0.0;
      var10000 = recovery$indy$7(this.settingMode, var6, 7018479027930891590L, var2).equals(recovery$indy$8(20669, 4423588724333261874L ^ var2));
      if (var8) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$9(field_43, 7018612944575072027L, var2).field_48M;
      }

      label26: {
         if (var8) {
            if (!var10000) {
               break label26;
            }

            var10000 = recovery$indy$10(this.settingOnlyInAir, 7018225096741648288L, var2);
         }

         if (var10000) {
            return;
         }
      }

      var1.cancel();
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 103906135488667L;
      long var3 = var1 ^ 49957935405803L;
      long var10000 = -6982676987976310892L;
      boolean var5 = method_419$aae029aa0a();
      long var10002 = -6982564359889454280L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Intave");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   public static void method_48$f633c984d8(boolean var0) {
      field_44 = var0;
   }



   public static boolean method_45$aae029aa0a() {
      return field_44;
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      recovery$indy$11(var1, 0.0, 3159645735567658774L, var2);
      recovery$indy$12(var1, 0.0, 3159283547801868343L, var2);
      recovery$indy$13(var1, 0.0, 3160045911814114460L, var2);
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 59735639340751L;
      long var6 = var1 ^ 40846118478071L;
      boolean var8 = recovery$indy$14(2669365014663782443L, var1);
      C_473U var9 = recovery$indy$15(var3, 2667936084945396970L, var1);
      if (recovery$indy$16(field_43, 2667609585377952633L, var1) == null) {
         recovery$indy$17(this, var4, false, 2669249340225504830L, var1);
      }

      boolean var10000 = recovery$indy$18(this.settingMode, var6, 2667532840587215140L, var1).equals(recovery$indy$19(32580, 1557848332770631595L ^ var1));
      if (var8) {
         if (!var10000) {
            return;
         }

         var10000 = var9 instanceof C_47xZ;
      }

      if (var10000) {
         var3.cancel();
      }
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      if (recovery$indy$20(this.settingSneak, 6395815314625678855L, var2)) {
         recovery$indy$21(var1, true, 6396223147871709332L, var2);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$22(this, 20, var3, -7099850429133965966L, var1);
      recovery$indy$23(this, 21, var3, -7099850429133965966L, var1);
      recovery$indy$24(this, 43, var3, -7099850429133965966L, var1);
      recovery$indy$25(this, 26, var3, -7099850429133965966L, var1);
   }



   public static boolean method_419$aae029aa0a() {
      boolean var0 = method_45$aae029aa0a();
      return !var0;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public AirStuck_47Q4(long a0) {
        super((java.lang.String) ("AirStuck"),(java.lang.String) ("LuftStecken"),(long) (((augustus.recovered.modules.player.AirStuck_47Q4.a ^ a0) ^ 58488483123237L)),(java.awt.Color) (new java.awt.Color((int) (78),(int) (186),(int) (112))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.AirStuck_47Q4.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.AirStuck_47Q4.a ^ a0) ^ 85508340275459L);
        long constructorKey4 = ((augustus.recovered.modules.player.AirStuck_47Q4.a ^ a0) ^ 139113859277032L);
        long constructorKey5 = ((augustus.recovered.modules.player.AirStuck_47Q4.a ^ a0) ^ 74858778348606L);
        java.lang.Object initialValue6 = recovery$indy$flow$74(4);
        ((java.lang.Object[]) initialValue6)[0] = "NoRotate";
        ((java.lang.Object[]) initialValue6)[1] = "CanRotate";
        ((java.lang.Object[]) initialValue6)[2] = "Intave";
        ((java.lang.Object[]) initialValue6)[3] = "NewNoRotate";
        client.setting.ModeSetting initialized7 = new client.setting.ModeSetting(this, "Mode", constructorKey4, "NoRotate", (java.lang.String[]) (initialValue6));
        recovery$indy$flow$76(this, initialized7);
        client.setting.BooleanSetting initialized8 = new client.setting.BooleanSetting(this, constructorKey5, "Sneak", true);
        recovery$indy$flow$79(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey5, "OnlyInAir", true);
        java.lang.Object initialValue10 = recovery$indy$flow$82(this);
        java.lang.Object initialValue11 = initialValue10;
        long initialValue12 = constructorKey3;
        client.setting.BooleanSetting initialValue13 = initialized9;
        java.lang.Object initialValue14 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue15 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue16 = recovery$indy$flow$85(initialValue14, initialValue12, initialValue15);
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue16))))));
        recovery$indy$flow$87(this, initialValue17);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$74(int a0);
    private static native void recovery$indy$flow$76(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$79(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$87(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$2(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$3(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native void recovery$indy$11(Object var0, double var1, long var3, long var5);
   private static native void recovery$indy$12(Object var0, double var1, long var3, long var5);
   private static native void recovery$indy$13(Object var0, double var1, long var3, long var5);
   private static native boolean recovery$indy$14(long var0, long var2);
   private static native C_473U recovery$indy$15(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);
   private static native void recovery$indy$17(Object var0, long var1, boolean var3, long var4, long var6);
   private static native String recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$19(int var0, long var1);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native void recovery$indy$21(Object var0, boolean var1, long var2, long var4);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$24(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$27();
}
