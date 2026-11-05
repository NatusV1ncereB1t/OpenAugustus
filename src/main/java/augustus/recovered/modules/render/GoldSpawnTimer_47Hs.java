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
import net.C_42R;
import net.C_45n;
import client.render.RenderPass;
import net.C_473U;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.minecraft.client.gui.FontRenderer;
import net.C_47LS;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47g5;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47oP;
import net.C_47ob;
import net.C_47rf;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class GoldSpawnTimer_47Hs extends client.module.Module implements client.event.RenderListener,net.C_47xz,net.C_47iC {
    private final client.setting.NumberSetting settingXCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBackGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBackgroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
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

    private void method_41$e45a9973e5(long l) {
        int[] nArray;
        l = a ^ l;
        int[] nArray2 = nArray = GoldSpawnTimer_47Hs.recovery$indy$1(-8388649450144006683L, l);
        Object object = field_43;
        if (nArray2 == null) {
            net.minecraft.client.entity.EntityPlayerSP c_47B2 = GoldSpawnTimer_47Hs.recovery$indy$2(object, -8388362586140391676L, l);
            if (c_47B2 == null) return;
            object = field_43;
            net.minecraft.client.gui.GuiScreen c_47Lv = GoldSpawnTimer_47Hs.recovery$indy$3(object, -8388867944824453500L, l);
            if (c_47Lv != null) return;
            object = field_43;
            net.minecraft.client.multiplayer.WorldClient c_47hb = GoldSpawnTimer_47Hs.recovery$indy$4(object, -8388500059294283550L, l);
            if (c_47hb == null) return;
            int n = ((int) (this.field_43a ? 1 : 0));
            int n2 = n;
            if (n2 != 0) return;
            object = GoldSpawnTimer_47Hs.recovery$indy$5(field_43, -8388362586140391676L, l);
            n = ((net.minecraft.client.entity.EntityPlayerSP)object).field_48y;
            int n3 = n;
            int n4 = 20;
            if (n3 <= n4) return;
            this.field_43a = true;
            object = GoldSpawnTimer_47Hs.recovery$indy$6(field_43, -8388362586140391676L, l);
            ((net.minecraft.client.entity.EntityPlayerSP)object).method_49$a7421bf54c(GoldSpawnTimer_47Hs.recovery$indy$7(4580, 0x7EC2220721D54939L ^ l));
            return;
        }
        net.minecraft.client.multiplayer.WorldClient c_47hb = GoldSpawnTimer_47Hs.recovery$indy$4(object, -8388500059294283550L, l);
        if (c_47hb == null) return;
        int n = ((int) (this.field_43a ? 1 : 0));
        int n5 = n;
        int n6 = 20;
        if (n5 <= n6) return;
        this.field_43a = true;
        object = GoldSpawnTimer_47Hs.recovery$indy$6(field_43, -8388362586140391676L, l);
        ((net.minecraft.client.entity.EntityPlayerSP)object).method_49$a7421bf54c(GoldSpawnTimer_47Hs.recovery$indy$7(4580, 0x7EC2220721D54939L ^ l));
    }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      int var35;
      label48: {
         long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
         long var8 = var6 ^ 62665625052564L;
         long var10 = var6 ^ 79469613767391L;
         long var12 = var6 ^ 132989861136316L;
         long var14 = var6 ^ 91924420980846L;
         long var16 = var6 ^ 58032606781533L;
         long var10001 = var6 ^ 48982798476343L;
         int var18 = (int)((var6 ^ 48982798476343L) >>> 32);
         int var19 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
         int var20 = (int)(var10001 << 48 >>> 48);
         int[] var21 = recovery$indy$8(1634194666832814301L, var6);
         GoldSpawnTimer_47Hs var10000 = this;
         if (var21 == null) {
            if (!this.field_43P) {
               break label48;
            }

            GL11.glPushMatrix();
            var10000 = this;
         }

         ScaledResolution var24;
         label40: {
            double var22 = recovery$indy$9(var10000.settingScale, var10, 1634012091052625053L, var6);
            GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
            GL11.glScaled(var22, var22, 1.0);
            var24 = new ScaledResolution(field_43.field_44f * (1.0 / var22), field_43.field_44g * (1.0 / var22), (int)var22);
            int var25 = (int)((System.currentTimeMillis() - this.field_40) / 1000L);
            int var34 = var25;
            int var10002 = 60;
            if (var21 == null) {
               if (var25 >= 60) {
                  var35 = 29 - var25 % 30;
                  break label40;
               }

               var34 = 59;
               var10002 = var25 % 60;
            }

            var35 = var34 - var10002;
         }

         int var26 = 1 + var35;
         String var27 = var26 + recovery$indy$10(18559, 2102407518468115867L ^ var6);
         int var28 = 20 + recovery$indy$11(field_43, 1632570729664666818L, var6).method_48$2f485d5ba3(var27) + 3;
         byte var29 = 15;
         int var30 = (int)((var24.method_46$8abf5c6871() - var28) * (recovery$indy$12(this.settingXCoord, var10, 1634012091052625053L, var6) / 100.0));
         int var31 = (int)((var24.method_48$8abf5c6871() - var29) * (recovery$indy$13(this.settingYCoord, var10, 1634012091052625053L, var6) / 100.0));
         if (var4 > 0) {
            boolean var33 = recovery$indy$14(this.settingBackGround, 1634084681648530853L, var6);
            if (var21 == null) {
               if (var33) {
                  int var32 = recovery$indy$15(this.settingBackgroundColor, var18, (short)var19, (char)var20, 0, 1634547379876540971L, var6);
                  recovery$indy$18(
                     recovery$indy$16(this.field_48, var8, 1634283739690563453L, var6),
                     recovery$indy$17(this.field_48, var14, 1634738587753095076L, var6),
                     var12,
                     1633929232767450688L,
                     var6
                  );
                  recovery$indy$20(false, var16, recovery$indy$19(this, var30, var31, var28, var29, var32), 1633066998039970713L, var6);
               }

               RenderUtils.method_46$1b188dfb07(new C_47rf(C_42R.field_41e), var30 + 2, var31, false);
               recovery$indy$21(field_43, 1632570729664666818L, var6).method_43$7961e3f788(var27, var30 + 22, var31 + 4, -1);
            }
         }

         GL11.glPopMatrix();
      }

      RenderUtils.method_41$da8c82d5d4();
   }





   private void method_44$88833b0910(int var1, int var2, int var3, int var4, int var5, RenderPass var6) {
      long var7 = a ^ 1559305788223L;
      long var9 = var7 ^ 103632894539934L;
      long var11 = var7 ^ 2730703054101L;
      long var10000 = -1724131429320843678L;
      int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var6 == RenderPass.SHADOW) {
         int var10002 = var1 + var3;
         int var10003 = var2 + var4;
         ShaderOptions var10004 = this.field_48;
         long var10008 = -1724643272375015741L;
         int var10005 = C_47TX.method_45$75dd719903(var5, 255, var9);
         long var10007 = -1724054251910549709L;
         long var14 = var11;
         int var16 = var10005;
         ShaderOptions var17 = var10004;
         C_47g5.method_48$0f4d4a7a6c(var1, var2, var10002, var10003, var17.method_49$7ee0e11626(var16, var14));
         if (var13 == null) {
            return;
         }
      }

      C_47g5.method_48$0f4d4a7a6c(var1, var2, var1 + var3, var2 + var4, var5);
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 50498101010005L;
      int[] var6 = recovery$indy$22(2669370560899208059L, var1);
      C_473U var7 = recovery$indy$23(var3, 2668701347080824070L, var1);
      C_473U var10000 = var7;
      if (var6 == null) {
         if (!(var7 instanceof C_47AL)) {
            return;
         }

         var10000 = var7;
      }

      C_47AL var8 = (C_47AL)var10000;
      C_47oP var9 = var8.method_45$8b128fd962();
      if (var6 == null) {
         if (var9 == null) {
            return;
         }

         var9 = var8.method_45$8b128fd962();
      }

      String var10 = var9.method_49$0e30dfc966();
      if (var6 == null) {
         short var11 = (short) ((var10.contains(recovery$indy$24(9824, 1746850055306367016L ^ var1))) ? 1 : 0);
         if (var1 > 0L) {
            if (var11 == 0) {
               return;
            }

            var11 = 2774;
         }

         var10 = recovery$indy$25(var11, 1409141439357516954L ^ var1);
      }

      recovery$indy$26(var4, var10, 2670366333894066846L, var1);
      this.field_40 = System.currentTimeMillis() + 500L;
      this.field_43P = true;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$27(this, 32, var3, -7101029602573708379L, var1);
      recovery$indy$28(this, 40, var3, -7101029602573708379L, var1);
      recovery$indy$29(this, 26, var3, -7101029602573708379L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      net.minecraft.client.Minecraft var10;
      int var10000;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 122118350333692L;
      int[] var8 = recovery$indy$30(2183399004490721340L, var4);
      recovery$indy$31(this, var6, 2182155726043045331L, var4);
      var10000 = recovery$indy$32(field_43, 2184235637762380509L, var4).field_48y;
      label63:
      if (var8 == null) {
         label61: {
            if (var10000 > 20) {
               C_47oP var9 = recovery$indy$33(field_43, 2183537700908475403L, var4).method_48$e51542f5b2().method_40$8b128fd962();
               var10 = field_43;
               if (var8 != null) {
                  break label61;
               }

               if (recovery$indy$34(field_43, 2183537700908475403L, var4) != null) {
                  var10 = field_43;
                  if (var8 != null) {
                     break label61;
                  }

                  label56:
                  if (recovery$indy$35(field_43, 2183537700908475403L, var4).method_48$e51542f5b2() != null) {
                     var10 = field_43;
                     if (var8 != null) {
                        break label61;
                     }

                     C_47oP var11 = recovery$indy$36(field_43, 2183537700908475403L, var4).method_48$e51542f5b2().method_40$8b128fd962();
                     if (var2 > 0) {
                        if (var11 == null) {
                           break label56;
                        }

                        var11 = var9;
                     }

                     var10000 = (int) ((var11.method_49$0e30dfc966().contains(recovery$indy$37(21122, 4952910153203720076L ^ var4))) ? 1 : 0);
                     if (var8 != null) {
                        break label63;
                     }

                     if (var10000 == 0) {
                        this.field_43P = false;
                     }
                  }
               }
            }

            var10 = field_43;
         }

         var10000 = (int) ((recovery$indy$38(var10, 2182403392412597217L, var4)) ? 1 : 0);
      }

      if (var10000 != 0) {
         this.field_43P = false;
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_43P = false;
   }



    public GoldSpawnTimer_47Hs(byte a0,long a1) {
        super((java.lang.String) ("GoldSpawnTimer"),(java.lang.String) ("GoldEntstehungsUhr"),(long) ((((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 58600271107534L)),(java.awt.Color) (new java.awt.Color((int) (140),(int) (255),(int) (190))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = ((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a);
        long constructorKey2 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 85482451639528L);
        long constructorKey3 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 51214936652151L);
        long constructorKey4 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 90022444304954L);
        long constructorKey5 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 75245477235157L);
        long constructorKey6 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 115686029211218L);
        long constructorKey7 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.GoldSpawnTimer_47Hs.a) ^ 36280199530992L);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "X-Coord", 0.0D, constructorKey6, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$124(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Y-Coord", 0.0D, constructorKey6, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$127(this, initialized9);
        client.setting.NumberSetting initialized10 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey6, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4616189618054758400L), 2);
        recovery$indy$flow$130(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey5, "BackGround", true);
        recovery$indy$flow$133(this, initialized11);
        java.awt.Color initialized12 = new java.awt.Color(0, 0, 0, 150);
        client.setting.ColorSetting initialized13 = new client.setting.ColorSetting(constructorKey7, this, "BackgroundColor", initialized12);
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.render.GoldSpawnTimer_47Hs) (((java.lang.Object)(this)))).settingBackGround));
        java.lang.Object initialValue15 = recovery$indy$flow$139(initialValue14);
        java.lang.Object initialValue16 = recovery$indy$flow$140(initialValue14);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey2;
        client.setting.ColorSetting initialValue19 = initialized13;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$143(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$145(this, initialValue23);
        client.setting.ShaderOptions initialized24 = new client.setting.ShaderOptions(this, constructorKey3);
        java.lang.Object initialValue25 = recovery$indy$flow$148();
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey4;
        client.setting.ShaderOptions initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$151(initialValue29, initialValue27, initialValue30);
        recovery$indy$flow$152(this, initialValue31);
        recovery$indy$flow$153(this, false);
        recovery$indy$flow$154(this, 0L);
        recovery$indy$flow$155(this, false);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$127(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$130(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$133(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$139(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$140(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$143(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$145(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$148() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$151(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$152(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$153(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.GoldSpawnTimer_47Hs) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$154(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.render.GoldSpawnTimer_47Hs) (a0)).field_40 = a1;
        return;
    }
    private static void recovery$indy$flow$155(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.GoldSpawnTimer_47Hs) (a0)).field_43P = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$3(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native String recovery$indy$7(int var0, long var1);
   private static native int[] recovery$indy$8(long var0, long var2);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$10(int var0, long var1);
   private static native FontRenderer recovery$indy$11(Object var0, long var1, long var3);
   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$14(Object var0, long var1, long var3);
   private static native int recovery$indy$15(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$18(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$19(GoldSpawnTimer_47Hs var0, int var1, int var2, int var3, int var4, int var5);
   private static native void recovery$indy$20(boolean var0, long var1, Object var3, long var4, long var6);
   private static native FontRenderer recovery$indy$21(Object var0, long var1, long var3);
   private static native int[] recovery$indy$22(long var0, long var2);
   private static native C_473U recovery$indy$23(Object var0, long var1, long var3);
   private static native String recovery$indy$24(int var0, long var1);
   private static native String recovery$indy$25(int var0, long var1);
   private static native void recovery$indy$26(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$30(long var0, long var2);
   private static native void recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native C_47LS recovery$indy$33(Object var0, long var1, long var3);
   private static native C_47LS recovery$indy$34(Object var0, long var1, long var3);
   private static native C_47LS recovery$indy$35(Object var0, long var1, long var3);
   private static native C_47LS recovery$indy$36(Object var0, long var1, long var3);
   private static native String recovery$indy$37(int var0, long var1);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$40();
}
