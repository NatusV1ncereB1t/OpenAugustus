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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MotionBlur_47HK extends client.module.Module {
    public final boolean field_43a = Boolean.FALSE.booleanValue(); // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFrameMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAdditionalFramePrecision = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBrightness = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWhenFocused = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 124717984341936L;
      long var10000 = -5914199203613720906L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      boolean var4 = this.field_43a;
      if (var3 == null) {
         var4 = !this.field_43a;
      }

      return var4;
   }



   public void method_49$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = (var1 ^ 66760585201770L) >>> 32;
      int var5 = (int)((var1 ^ 66760585201770L) << 32 >>> 32);
      long var6 = var1 ^ 41369114810882L;
      int[] var8 = recovery$indy$1(-2991607918402484959L, var1);
      MotionBlur_47HK var10000 = this;
      if (var8 == null) {
         label52: {
            boolean var11 = recovery$indy$2(this.settingOnlyWhenFocused, -2991749541744337647L, var1);
            if (var1 > 0L) {
               if (!var11) {
                  break label52;
               }

               var11 = Display.isActive();
            }

            if (!var11) {
               return;
            }
         }

         var10000 = this;
      }

      label45: {
         float var9 = recovery$indy$3(var10000, var3, var5, -2991556581752093508L, var1);
         short var12 = 259;
         float var10001 = var9;
         if (var1 > 0L) {
            GL11.glAccum(259, var9);
            double var13;
            var12 = (short)((var13 = recovery$indy$4(this.settingBrightness, var6, -2991682103670213742L, var1) - 50.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1));
            if (var8 == null) {
               if (var12 == 0) {
                  GL11.glAccum(256, 1.0F - var9);
                  if (var1 < 0L) {
                     return;
                  }

                  if (var8 == null) {
                     break label45;
                  }
               }

               var12 = 256;
            }

            var10001 = (float)((1.0F - var9) / 100.0F * recovery$indy$5(this.settingBrightness, var6, -2991682103670213742L, var1) * 2.0);
         }

         GL11.glAccum(var12, var10001);
      }

      GL11.glAccum(258, 1.0F);
   }



   public float method_45$a20f9d77e2(long var1, int var3) {
      float var10;
      float var10001;
      label34: {
         long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
         long var6 = var4 ^ 72935678222391L;
         int[] var8 = recovery$indy$6(7804399197998448404L, var4);
         float var9 = (float)(recovery$indy$7(this.settingFrameMultiplier, var6, 7804191904849086887L, var4) * 10.0);
         double var11;
         int var10000 = (var11 = recovery$indy$8(this.settingAdditionalFramePrecision, var6, 7804191904849086887L, var4) - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
         if (var8 == null) {
            if (var10000 != 0) {
               var9 = (float)(var9 + recovery$indy$9(this.settingAdditionalFramePrecision, var6, 7804191904849086887L, var4) / 5.0);
            }

            var10 = var9;
            if (var3 <= 0) {
               return var9;
            }

            var10001 = 990.0F;
            if (var8 != null) {
               break label34;
            }

            float var12;
            var10000 = (var12 = var9 - 990.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var10000 > 0) {
            var9 = 990.0F;
         }

         var10 = var9;
         var10001 = 1000.0F;
      }

      var10 /= var10001;
      return var10;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 72681754743032L;
      long var10000 = -6727049237692960258L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      boolean var4 = this.field_43a;
      if (var3 == null) {
         var4 = !this.field_43a;
      }

      return var4;
   }



   public void method_43_$e45a9973e5(long var1) {
   }



   private boolean method_40v$aae029aa0a() {
      long var1 = a ^ 68848222717462L;
      long var10000 = 3768040484925613840L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      boolean var4 = this.field_43a;
      if (var3 == null) {
         var4 = !this.field_43a;
      }

      return var4;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public MotionBlur_47HK(long a0) {
        super((java.lang.String) ("MotionBlur"),(java.lang.String) ("BewegungsUnsch\u00e4rfe"),(long) (((augustus.recovered.modules.render.MotionBlur_47HK.a ^ a0) ^ 124848903335573L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (151))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.MotionBlur_47HK.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.MotionBlur_47HK.a ^ a0) ^ 722178306702L);
        long constructorKey4 = ((augustus.recovered.modules.render.MotionBlur_47HK.a ^ a0) ^ 50509191990537L);
        java.lang.Object constructorKey5 = recovery$indy$flow$31();
        java.lang.Object initialValue6 = recovery$indy$flow$32(7937);
        java.lang.Object initialValue7 = recovery$indy$flow$33(initialValue6);
        boolean initialValue8 = recovery$indy$flow$34(initialValue7, "amd");
        if (constructorKey5 != null) {
            recovery$indy$flow$38(this, initialValue8);
            client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Frame Multiplier", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
            java.lang.Object initialValue10 = recovery$indy$flow$41(this);
            java.lang.Object initialValue11 = initialValue10;
            client.setting.NumberSetting initialValue12 = initialized9;
            java.lang.Object initialValue13 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue12))))));
            java.lang.Object initialValue14 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue11))))));
            java.lang.Object initialValue15 = recovery$indy$flow$44(initialValue13, initialValue14);
            recovery$indy$flow$45(this, initialValue15);
            client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "Additional frame precision", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
            java.lang.Object initialValue17 = recovery$indy$flow$48(this);
            java.lang.Object initialValue18 = initialValue17;
            client.setting.NumberSetting initialValue19 = initialized16;
            java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue19))))));
            java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue18))))));
            java.lang.Object initialValue22 = recovery$indy$flow$51(initialValue20, initialValue21);
            recovery$indy$flow$52(this, initialValue22);
            client.setting.NumberSetting initialized23 = new client.setting.NumberSetting(this, "Brightness", Double.longBitsToDouble(4632233691727265792L), constructorKey4, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4636737291354636288L), 1);
            java.lang.Object initialValue24 = recovery$indy$flow$55(this);
            java.lang.Object initialValue25 = initialValue24;
            client.setting.NumberSetting initialValue26 = initialized23;
            java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue26))))));
            java.lang.Object initialValue28 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue25))))));
            java.lang.Object initialValue29 = recovery$indy$flow$58(initialValue27, initialValue28);
            recovery$indy$flow$59(this, initialValue29);
            client.setting.BooleanSetting initialized30 = new client.setting.BooleanSetting(this, constructorKey3, "Only when focused", true);
            recovery$indy$flow$62(this, initialized30);
            return;
        } else {
            if ((int) ((initialValue8 ? 1 : 0)) != 0) {
                recovery$indy$flow$38(this, true);
                client.setting.NumberSetting initialized31 = new client.setting.NumberSetting(this, "Frame Multiplier", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                java.lang.Object initialValue32 = recovery$indy$flow$41(this);
                java.lang.Object initialValue33 = initialValue32;
                client.setting.NumberSetting initialValue34 = initialized31;
                java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue34))))));
                java.lang.Object initialValue36 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue33))))));
                java.lang.Object initialValue37 = recovery$indy$flow$44(initialValue35, initialValue36);
                recovery$indy$flow$45(this, initialValue37);
                client.setting.NumberSetting initialized38 = new client.setting.NumberSetting(this, "Additional frame precision", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                java.lang.Object initialValue39 = recovery$indy$flow$48(this);
                java.lang.Object initialValue40 = initialValue39;
                client.setting.NumberSetting initialValue41 = initialized38;
                java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue41))))));
                java.lang.Object initialValue43 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
                java.lang.Object initialValue44 = recovery$indy$flow$51(initialValue42, initialValue43);
                recovery$indy$flow$52(this, initialValue44);
                client.setting.NumberSetting initialized45 = new client.setting.NumberSetting(this, "Brightness", Double.longBitsToDouble(4632233691727265792L), constructorKey4, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4636737291354636288L), 1);
                java.lang.Object initialValue46 = recovery$indy$flow$55(this);
                java.lang.Object initialValue47 = initialValue46;
                client.setting.NumberSetting initialValue48 = initialized45;
                java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue48))))));
                java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
                java.lang.Object initialValue51 = recovery$indy$flow$58(initialValue49, initialValue50);
                recovery$indy$flow$59(this, initialValue51);
                client.setting.BooleanSetting initialized52 = new client.setting.BooleanSetting(this, constructorKey3, "Only when focused", true);
                recovery$indy$flow$62(this, initialized52);
                return;
            } else {
                java.lang.Object initialValue53 = recovery$indy$flow$35(7937);
                java.lang.Object initialValue54 = recovery$indy$flow$36(initialValue53);
                boolean initialValue55 = recovery$indy$flow$37(initialValue54, "rx ");
                if (constructorKey5 != null) {
                    recovery$indy$flow$38(this, initialValue55);
                    client.setting.NumberSetting initialized56 = new client.setting.NumberSetting(this, "Frame Multiplier", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                    java.lang.Object initialValue57 = recovery$indy$flow$41(this);
                    java.lang.Object initialValue58 = initialValue57;
                    client.setting.NumberSetting initialValue59 = initialized56;
                    java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue59))))));
                    java.lang.Object initialValue61 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
                    java.lang.Object initialValue62 = recovery$indy$flow$44(initialValue60, initialValue61);
                    recovery$indy$flow$45(this, initialValue62);
                    client.setting.NumberSetting initialized63 = new client.setting.NumberSetting(this, "Additional frame precision", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                    java.lang.Object initialValue64 = recovery$indy$flow$48(this);
                    java.lang.Object initialValue65 = initialValue64;
                    client.setting.NumberSetting initialValue66 = initialized63;
                    java.lang.Object initialValue67 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue66))))));
                    java.lang.Object initialValue68 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue65))))));
                    java.lang.Object initialValue69 = recovery$indy$flow$51(initialValue67, initialValue68);
                    recovery$indy$flow$52(this, initialValue69);
                    client.setting.NumberSetting initialized70 = new client.setting.NumberSetting(this, "Brightness", Double.longBitsToDouble(4632233691727265792L), constructorKey4, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4636737291354636288L), 1);
                    java.lang.Object initialValue71 = recovery$indy$flow$55(this);
                    java.lang.Object initialValue72 = initialValue71;
                    client.setting.NumberSetting initialValue73 = initialized70;
                    java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue73))))));
                    java.lang.Object initialValue75 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue72))))));
                    java.lang.Object initialValue76 = recovery$indy$flow$58(initialValue74, initialValue75);
                    recovery$indy$flow$59(this, initialValue76);
                    client.setting.BooleanSetting initialized77 = new client.setting.BooleanSetting(this, constructorKey3, "Only when focused", true);
                    recovery$indy$flow$62(this, initialized77);
                    return;
                } else {
                    if ((int) ((initialValue55 ? 1 : 0)) == 0) {
                        recovery$indy$flow$38(this, false);
                        client.setting.NumberSetting initialized78 = new client.setting.NumberSetting(this, "Frame Multiplier", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue79 = recovery$indy$flow$41(this);
                        java.lang.Object initialValue80 = initialValue79;
                        client.setting.NumberSetting initialValue81 = initialized78;
                        java.lang.Object initialValue82 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue81))))));
                        java.lang.Object initialValue83 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue80))))));
                        java.lang.Object initialValue84 = recovery$indy$flow$44(initialValue82, initialValue83);
                        recovery$indy$flow$45(this, initialValue84);
                        client.setting.NumberSetting initialized85 = new client.setting.NumberSetting(this, "Additional frame precision", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue86 = recovery$indy$flow$48(this);
                        java.lang.Object initialValue87 = initialValue86;
                        client.setting.NumberSetting initialValue88 = initialized85;
                        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue88))))));
                        java.lang.Object initialValue90 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue87))))));
                        java.lang.Object initialValue91 = recovery$indy$flow$51(initialValue89, initialValue90);
                        recovery$indy$flow$52(this, initialValue91);
                        client.setting.NumberSetting initialized92 = new client.setting.NumberSetting(this, "Brightness", Double.longBitsToDouble(4632233691727265792L), constructorKey4, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue93 = recovery$indy$flow$55(this);
                        java.lang.Object initialValue94 = initialValue93;
                        client.setting.NumberSetting initialValue95 = initialized92;
                        java.lang.Object initialValue96 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue95))))));
                        java.lang.Object initialValue97 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue94))))));
                        java.lang.Object initialValue98 = recovery$indy$flow$58(initialValue96, initialValue97);
                        recovery$indy$flow$59(this, initialValue98);
                        client.setting.BooleanSetting initialized99 = new client.setting.BooleanSetting(this, constructorKey3, "Only when focused", true);
                        recovery$indy$flow$62(this, initialized99);
                        return;
                    } else {
                        recovery$indy$flow$38(this, true);
                        client.setting.NumberSetting initialized100 = new client.setting.NumberSetting(this, "Frame Multiplier", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue101 = recovery$indy$flow$41(this);
                        java.lang.Object initialValue102 = initialValue101;
                        client.setting.NumberSetting initialValue103 = initialized100;
                        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue103))))));
                        java.lang.Object initialValue105 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue102))))));
                        java.lang.Object initialValue106 = recovery$indy$flow$44(initialValue104, initialValue105);
                        recovery$indy$flow$45(this, initialValue106);
                        client.setting.NumberSetting initialized107 = new client.setting.NumberSetting(this, "Additional frame precision", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue108 = recovery$indy$flow$48(this);
                        java.lang.Object initialValue109 = initialValue108;
                        client.setting.NumberSetting initialValue110 = initialized107;
                        java.lang.Object initialValue111 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue110))))));
                        java.lang.Object initialValue112 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue109))))));
                        java.lang.Object initialValue113 = recovery$indy$flow$51(initialValue111, initialValue112);
                        recovery$indy$flow$52(this, initialValue113);
                        client.setting.NumberSetting initialized114 = new client.setting.NumberSetting(this, "Brightness", Double.longBitsToDouble(4632233691727265792L), constructorKey4, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4636737291354636288L), 1);
                        java.lang.Object initialValue115 = recovery$indy$flow$55(this);
                        java.lang.Object initialValue116 = initialValue115;
                        client.setting.NumberSetting initialValue117 = initialized114;
                        java.lang.Object initialValue118 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue117))))));
                        java.lang.Object initialValue119 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue116))))));
                        java.lang.Object initialValue120 = recovery$indy$flow$58(initialValue118, initialValue119);
                        recovery$indy$flow$59(this, initialValue120);
                        client.setting.BooleanSetting initialized121 = new client.setting.BooleanSetting(this, constructorKey3, "Only when focused", true);
                        recovery$indy$flow$62(this, initialized121);
                        return;
                    }
                }
            }
        }
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$31();
    private static native java.lang.Object recovery$indy$flow$32(int a0);
    private static java.lang.Object recovery$indy$flow$33(java.lang.Object a0) {
        return ((java.lang.String) (a0)).toLowerCase();
    }
    private static boolean recovery$indy$flow$34(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).contains(((java.lang.CharSequence) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$35(int a0);
    private static java.lang.Object recovery$indy$flow$36(java.lang.Object a0) {
        return ((java.lang.String) (a0)).toLowerCase();
    }
    private static boolean recovery$indy$flow$37(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).contains(((java.lang.CharSequence) (a1)));
    }
    private static native void recovery$indy$flow$38(java.lang.Object a0,boolean a1);
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$44(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$45(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$48(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$51(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$52(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$55(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$58(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$59(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native float recovery$indy$3(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$13();
}
