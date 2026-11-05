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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47bg;
import net.C_47rf;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ArmorStatus_47QB extends client.module.Module implements client.event.RenderListener {
    private final client.setting.NumberSetting settingPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingDurabilityMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingDurabilityColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBackGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBackgroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDynamicArmorRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

   private void method_46$5d9b204802(int var1, int var2, RenderPass var3) {
      long var4 = a ^ 15012666148003L;
      long var6 = var4 ^ 38529517594834L;
      long var10001 = var4 ^ 52213259122695L;
      int var8 = (int)((var4 ^ 52213259122695L) >>> 32);
      int var9 = (int)((var4 ^ 52213259122695L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      int var10002 = 22 + var1;
      short var10007 = (short)var9;
      char var10008 = (char)var10;
      long var10010 = -8457798471875621377L;
      byte var11 = 0;
      char var12 = var10008;
      short var13 = var10007;
      int var14 = var8;
      ColorSetting var15 = this.settingBackgroundColor;
      int var10005 = var15.method_47$24af287d8f(var14, var13, var12, var11);
      long var20 = -8459915966048894410L;
      long var16 = var6;
      int var18 = var10005;
      RenderPass var19 = var3;
      RenderUtils.method_40$0f4d4a7a6c(0, 0, var10002, var2, C_47TX.method_40$6b468acafc(var19, var18, var16));
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private String[] method_41$1cd68c4abd(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 24780448043025L;
      String[] var6 = new String[recovery$indy$1(field_43, 4531528520079159650L, var1).field_42X.field_43.length];
      int[] var10000 = recovery$indy$2(4532428544549123381L, var1);
      int var7 = 0;
      int[] var5 = var10000;

      while (var7 < recovery$indy$3(field_43, 4531528520079159650L, var1).field_42X.field_43.length) {
         C_47rf var8 = recovery$indy$4(field_43, 4531528520079159650L, var1).field_42X.field_43[var7];
         var10000 = var5;
         if (var1 > 0L) {
            if (var5 == null) {
               if (var8 != null) {
                  var6[var7] = recovery$indy$5(this, var8, var3, 4531611828063452207L, var1);
               }

               var7++;
            }

            var10000 = var5;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var6;
   }



   private void method_40$88d55a5515(String var1, int var2, long var3) {
      var3 = a ^ var3;
      long var10001 = var3 ^ 134696945779625L;
      int var5 = (int)((var3 ^ 134696945779625L) >>> 32);
      int var6 = (int)((var3 ^ 134696945779625L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      if (var1 != null) {
         recovery$indy$6(field_43, -5677542489210258766L, var3)
            .method_43$7961e3f788(var1, 21, var2, recovery$indy$7(this.settingDurabilityColor, var5, (short)var6, (char)var7, 0, -5678607139395127727L, var3));
      }
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 79469613767391L;
      long var10001 = var6 ^ 117756592118400L;
      int var10 = (int)((var6 ^ 117756592118400L) >>> 32);
      int var11 = (int)((var6 ^ 117756592118400L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var6 ^ 120657839040124L;
      long var15 = var6 ^ 109220733899676L;
      long var17 = var6 ^ 51568576899244L;
      GL11.glPushMatrix();
      GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
      String[] var19 = recovery$indy$8(this, var13, 1632591190952691702L, var6);
      int var20 = recovery$indy$9(this, var15, var19, 1633513917668896810L, var6);
      int var21 = recovery$indy$10(this, var10, (short)var11, var12, 1634594870843177622L, var6) * 20;
      double var22 = recovery$indy$11(this.settingScale, var8, 1634218967852157664L, var6);
      GL11.glTranslated(
         (field_43.field_44f - (22 + var20) * var22) * (recovery$indy$12(this.settingPosX, var8, 1634218967852157664L, var6) / 100.0),
         (field_43.field_44g - var21 * var22) * (recovery$indy$13(this.settingPosY, var8, 1634218967852157664L, var6) / 100.0),
         0.0
      );
      GL11.glScaled(var22, var22, 1.0);
      recovery$indy$14(this, var19, var17, var20, var21, 1634523714194041097L, var6);
      GL11.glPopMatrix();
      RenderUtils.method_41$da8c82d5d4();
   }




   private String method_44$07a0faa7cb(C_47rf var1, long var2) {
      int var14;
      var2 = a ^ var2;
      long var4 = var2 ^ 16590153114940L;
      long var10002 = 2361515117294840814L;
      long var9 = var4;
      ModeSetting var11 = this.settingDurabilityMode;
      String var7 = var11.method_46$5f9dc63072(var9);
      long var10000 = 2360189605950712594L;
      int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
      byte var8 = -1;
      int[] var6 = var13;
      var14 = var7.hashCode();
      label48:
      if (var6 == null) {
         label50: {
            switch (var14) {
               case 1071632058:
                  var14 = (int) ((var7.equals("Percentage")) ? 1 : 0);
                  if (var6 != null) {
                     break label48;
                  }

                  if (var14 == 0) {
                     break label50;
                  }

                  var14 = 0;
                  if (var2 < 0L) {
                     break;
                  }

                  var8 = 0;
                  if (var6 == null) {
                     break label50;
                  }
               case 1792766359:
                  var14 = (int) ((var7.equals("Absolute")) ? 1 : 0);
                  break;
               default:
                  break label50;
            }

            if (var6 != null) {
               break label48;
            }

            if (var14 != 0) {
               var8 = 1;
            }
         }

         var14 = var8;
      }

      switch (var14) {
         case 0:
            StringBuilder var15 = new StringBuilder();
            double var10001 = 100.0 - (double)var1.method_43$8abf5c6871() / var1.method_42$8abf5c6871() * 100.0;
            long var10003 = 2360507945186474135L;
            return var15.append(C_47bg.method_43$f4fdfb5f6c(var10001, 1)).append("%").toString();
         case 1:
            return String.valueOf(var1.method_42$8abf5c6871() - var1.method_43$8abf5c6871());
         default:
            return null;
      }
   }



   private void method_48$6fc163d1c8(String[] var1, int var2, int var3, RenderPass var4) {
      long var5 = a ^ 125970831049844L;
      long var7 = var5 ^ 126033789367335L;
      long var10005 = -8481973373897445968L;
      long var9 = var7;
      int var11 = var3;
      int var12 = var2;
      String[] var13 = var1;
      ArmorStatus_47QB var14 = this;
      var14.method_49$26ec4604b1(var13, var12, var11, var9);
   }



   private int method_48$0725baa2d0(long var1, String[] var3) {
      var1 = a ^ var1;
      int var5 = 0;
      int[] var10000 = recovery$indy$15(5406119824610394325L, var1);
      String[] var6 = var3;
      int[] var4 = var10000;
      int var7 = var6.length;
      int var8 = 0;

      while (var8 < var7) {
         label44: {
            String var9 = var6[var8];
            label43:
            if (var4 == null) {
               label41:
               if (var9 != null) {
                  int var10 = recovery$indy$16(field_43, 5404612783021850758L, var1).method_48$2f485d5ba3(var9) + 3;
                  var10000 = var4;
                  if (var1 < 0L) {
                     break label44;
                  }

                  if (var4 != null) {
                     break label43;
                  }

                  int var13 = var10;
                  if (var1 > 0L) {
                     if (var10 <= var5) {
                        break label41;
                     }

                     var13 = var10;
                  }

                  var5 = var13;
               }

               var8++;
            }

            var10000 = var4;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var5;
   }



   private int method_49$54d8afe2e9(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      int[] var6 = recovery$indy$17(4763239517954345417L, var4);
      int var7 = (int)Arrays.stream(recovery$indy$18(field_43, 4764596799441456542L, var4).field_42X.field_43).filter(recovery$indy$19()).count();
      int var10000 = (int) ((recovery$indy$20(this.settingDynamicArmorRendering, 4763579936018540631L, var4)) ? 1 : 0);
      if (var6 == null) {
         if (var10000 != 0) {
            return var7;
         }

         var10000 = var7;
      }

      if (var6 == null) {
         var10000 = var10000 > 0 ? recovery$indy$21(field_43, 4764596799441456542L, var4).field_42X.field_43.length : 0;
      }

      return var10000;
   }



   private void method_49$26ec4604b1(String[] var1, int var2, int var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 97218638352222L;
      C_47rf var8 = recovery$indy$22(field_43, -5737767393597505570L, var4).method_47$8da6669f6b(var2);
      RenderUtils.method_46$1b188dfb07(var8, 3, var3 + 2, false);
      recovery$indy$23(this, var1[var2], var3 + 6, var6, -5739060995590340570L, var4);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 99337039110405L;
      long var3 = var1 ^ 35375338793671L;
      long var10000 = 8014785333158520041L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8016097575201186837L;
      long var6 = var3;
      ModeSetting var8 = this.settingDurabilityMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private void method_47$b8d25ec1a3(String[] var1, long var2, int var4, int var5) {
        int var104;
      var2 = a ^ var2;
      long var6 = var2 ^ 132899975758606L;
      long var8 = var2 ^ 62488702099750L;
      long var10 = var2 ^ 21696161502964L;
      long var12 = var2 ^ 37551250624463L;
      long var14 = var2 ^ 128533630486215L;
      int[] var16 = recovery$indy$24(-5749362909228074011L, var2);
      byte var17 = ((byte) (recovery$indy$25(this.settingBackGround, -5748872096701556101L, var2) ? 1 : 0));
      int[] var90 = var16;
      byte var20 = var17;
      if (var90 == null) {
         var20 = var20;
         var20 = var20;
         byte var105 = var20;
         if (var105 != 0) {
            recovery$indy$28(
               recovery$indy$26(this.field_47, var6, -5750222585977716188L, var2),
               recovery$indy$27(this.field_47, var10, -5749477100682965779L, var2),
               var8,
               -5749245298897376807L,
               var2
            );
            recovery$indy$30(false, var14, recovery$indy$29(this, var4, var5), -5750363487360251649L, var2);
         }

         net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
         var20 = 0;
         byte var93 = var20;
         int var95 = var1.length - 1;

         while (true) {
            int var106 = var95;
            if (var106 < 0) {
               long var110;
               int var109 = (var110 = var2 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
               if (var109 >= 0) {
                  return;
               }
            } else {
               label68: {
                  ArmorStatus_47QB var99 = this;
                  recovery$indy$31(var99, var12, var1, var95, var93, -5749837707481312434L, var2);
                  String var107 = var1[var95];
                  if (var107 == null) {
                     var99 = this;
                     boolean var108 = recovery$indy$32(var99.settingDynamicArmorRendering, -5748872096701556101L, var2);
                     if (var108) {
                        break label68;
                     }
                  }

                  var93 += 20;
               }

               var95--;
            }
         }
      } else {
         int var18 = var20;
         int var19 = var1.length - 1;
         int var101 = var19;
         int var102;
         if (var101 >= 0) {
            ArmorStatus_47QB var26 = this;
            boolean var103 = recovery$indy$32(var26.settingDynamicArmorRendering, -5748872096701556101L, var2);
            if (!var103) {
               var18 += 20;
            }

            var19--;

            do {
               long var111;
               var104 = (var111 = var2 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
            } while (var104 < 0);
         } else {
            do {
               long var112;
               var102 = (var112 = var2 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
            } while (var102 < 0);
         }
      }
   }



   private void method_43$bf5f929dfe(long var1, String[] var3, int var4, int var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 57448678507255L;
      long var8 = var1 ^ 127774055456991L;
      long var10 = var1 ^ 77192527010273L;
      long var12 = var1 ^ 104846463342349L;
      long var14 = var1 ^ 61600277514046L;
      long var16 = var1 ^ 2920341852067L;
      int[] var18 = recovery$indy$33(8200883422347704860L, var1);
      boolean var10000 = recovery$indy$34(this, var4, var10, 8200307669486031315L, var1);
      if (var18 == null) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$35(this.settingBackGround, 8200680716228959106L, var1);
      }

      if (var18 == null) {
         label34: {
            if (var10000) {
               recovery$indy$36(this, var3, var4, var5, var16, 8200362368976000564L, var1);
               if (var1 <= 0L) {
                  break label34;
               }

               if (var18 == null) {
                  return;
               }
            }

            recovery$indy$39(
               recovery$indy$37(this.field_47, var6, 8199462720569148381L, var1),
               recovery$indy$38(this.field_47, var12, 8200085053507063060L, var1),
               var8,
               8201018897259358240L,
               var1
            );
         }

         var10000 = false;
      }

      recovery$indy$41(var10000, var14, recovery$indy$40(this, var3, var4, var5), 8199883112651409670L, var1);
   }



   private boolean method_43$800bd538b0(int var1, long var2) {
      var2 = a ^ var2;
      return recovery$indy$42(field_43, 2746384778249611676L, var2).method_47$8da6669f6b(var1) != null;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$43(this, 32, var3, -7101020749373656731L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ArmorStatus_47QB(long a0) {
        super((java.lang.String) ("ArmorStatus"),(java.lang.String) ("R\u00fcstungszustand"),(long) (((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 135405403402222L)),(java.awt.Color) (new java.awt.Color((int) (125),(int) (255),(int) (203))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 4207348655816L);
        long constructorKey4 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 53406166196003L);
        long constructorKey5 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 106623078269783L);
        long constructorKey6 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 11003796304885L);
        long constructorKey7 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 43268406676594L);
        long constructorKey8 = ((augustus.recovered.modules.render.ArmorStatus_47QB.a ^ a0) ^ 121574733149136L);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "PosX", 0.0D, constructorKey7, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$142(this, initialized9);
        client.setting.NumberSetting initialized10 = new client.setting.NumberSetting(this, "PosY", 0.0D, constructorKey7, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$145(this, initialized10);
        client.setting.NumberSetting initialized11 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey7, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4616189618054758400L), 2);
        recovery$indy$flow$148(this, initialized11);
        java.lang.Object initialValue12 = recovery$indy$flow$150(3);
        ((java.lang.Object[]) initialValue12)[0] = "None";
        ((java.lang.Object[]) initialValue12)[1] = "Percentage";
        ((java.lang.Object[]) initialValue12)[2] = "Absolute";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "DurabilityMode", constructorKey4, "Percentage", (java.lang.String[]) (initialValue12));
        recovery$indy$flow$152(this, initialized13);
        java.lang.Object initialValue14 = recovery$indy$flow$154();
        client.setting.ColorSetting initialized15 = new client.setting.ColorSetting(constructorKey8, this, "DurabilityColor", (java.awt.Color) (initialValue14));
        java.lang.Object initialValue16 = recovery$indy$flow$156(this);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey3;
        client.setting.ColorSetting initialValue19 = initialized15;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$159(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$161(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey6, "BackGround", false);
        recovery$indy$flow$164(this, initialized24);
        java.awt.Color initialized25 = new java.awt.Color(0, 0, 0, 120);
        client.setting.ColorSetting initialized26 = new client.setting.ColorSetting(constructorKey8, this, "BackgroundColor", initialized25);
        java.lang.Object initialValue27 = ((java.lang.Object)(((augustus.recovered.modules.render.ArmorStatus_47QB) (((java.lang.Object)(this)))).settingBackGround));
        java.lang.Object initialValue28 = recovery$indy$flow$170(initialValue27);
        java.lang.Object initialValue29 = recovery$indy$flow$171(initialValue27);
        java.lang.Object initialValue30 = initialValue29;
        long initialValue31 = constructorKey3;
        client.setting.ColorSetting initialValue32 = initialized26;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue35 = recovery$indy$flow$174(initialValue33, initialValue31, initialValue34);
        java.lang.Object initialValue36 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue35))))));
        recovery$indy$flow$176(this, initialValue36);
        client.setting.ShaderOptions initialized37 = new client.setting.ShaderOptions(this, constructorKey5);
        recovery$indy$flow$179(this, initialized37);
        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting(this, constructorKey6, "DynamicArmorRendering", true);
        recovery$indy$flow$182(this, initialized38);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$142(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$145(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$148(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$150(int a0);
    private static native void recovery$indy$flow$152(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$154() {
        return java.awt.Color.white;
    }
    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$159(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$164(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$170(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$171(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$174(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$176(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$179(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native EntityPlayerSP recovery$indy$1(Object var0, long var1, long var3);
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native String recovery$indy$5(Object var0, Object var1, long var2, long var4, long var6);
   private static native FontRenderer recovery$indy$6(Object var0, long var1, long var3);
   private static native int recovery$indy$7(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native String[] recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$9(Object var0, long var1, Object var3, long var4, long var6);
   private static native int recovery$indy$10(Object var0, int var1, short var2, int var3, long var4, long var6);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$14(Object var0, Object var1, long var2, int var4, int var5, long var6, long var8);
   private static native int[] recovery$indy$15(long var0, long var2);
   private static native FontRenderer recovery$indy$16(Object var0, long var1, long var3);
   private static native int[] recovery$indy$17(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$19();
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native void recovery$indy$23(Object var0, Object var1, int var2, long var3, long var5, long var7);
   private static native int[] recovery$indy$24(long var0, long var2);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$28(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$29(ArmorStatus_47QB var0, int var1, int var2);
   private static native void recovery$indy$30(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$31(Object var0, long var1, Object var3, int var4, int var5, long var6, long var8);
   private static native boolean recovery$indy$32(Object var0, long var1, long var3);
   private static native int[] recovery$indy$33(long var0, long var2);
   private static native boolean recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$35(Object var0, long var1, long var3);
   private static native void recovery$indy$36(Object var0, Object var1, int var2, int var3, long var4, long var6, long var8);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$39(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$40(ArmorStatus_47QB var0, String[] var1, int var2, int var3);
   private static native void recovery$indy$41(boolean var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native void recovery$indy$43(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$46();
}
