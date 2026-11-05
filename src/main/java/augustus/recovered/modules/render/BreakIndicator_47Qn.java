package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Az;
import net.C_47Fw;
import net.C_47Ij;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.Minecraft;
import net.C_47nb;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class BreakIndicator_47Qn extends Module implements RenderListener {
   private final NumberSetting settingDecimalPlaces;
   private final NumberSetting settingScale;
   private final NumberSetting settingPosX;
   private final NumberSetting settingPosY;
   private final ColorSetting settingColor;
   private final BooleanSetting settingBackGround;
   private final ColorSetting settingBackGroundColor;
   private final ShaderOptions field_47;
   private final ModeSetting settingToggleAnimation;
   private final NumberSetting settingAnimationTime;
   private final C_47nb field_431;
   private float field_45;
   private static final long a = C_4f.a(-4741755197588974220L, -337989706964358311L, MethodHandles.lookup().lookupClass()).a(194150453262945L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[48];
   private static final String[] f = new String[48];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      net.minecraft.client.Minecraft var10000;
      int var34;
      java.lang.String var35;
      float var41;
      long var6;
      long var8;
      long var10;
      long var12;
      long var14;
      long var16;
      long var18;
      long var20;
      int var22;
      int var23;
      int var24;
      int[] var25;
      float var33;
      label176: {
         label175: {
            label179: {
               var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
               var8 = var6 ^ 62665625052564L;
               var10 = var6 ^ 79469613767391L;
               var12 = var6 ^ 132989861136316L;
               var14 = var6 ^ 91924420980846L;
               var16 = var6 ^ 127696898216785L;
               var18 = var6 ^ 140167575908204L;
               var20 = var6 ^ 58032606781533L;
               long var10001 = var6 ^ 48982798476343L;
               var22 = (int)((var6 ^ 48982798476343L) >>> 32);
               var23 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
               var24 = (int)(var10001 << 48 >>> 48);
               var25 = recovery$indy$1(1633964477529705745L, var6);
               var10000 = field_43;
               if (var25 == null) {
                  if (recovery$indy$2(field_43, 1633686945101428792L, var6) == null) {
                     break label179;
                  }

                  var10000 = field_43;
               }

               int[] var38 = var25;
               if (var3 >= 0) {
                  if (var25 == null) {
                     if (!recovery$indy$3(var10000, 1634510129530639878L, var6).field_42) {
                        break label179;
                     }

                     var10000 = field_43;
                  }

                  var38 = var25;
               }

               if (var38 != null) {
                  break label175;
               }

               if (recovery$indy$4(var10000, 1633686945101428792L, var6).field_49 == C_47Az.BLOCK) {
                  var10000 = field_43;
                  break label175;
               }
            }

            var33 = 0.0F;
            break label176;
         }

         var33 = recovery$indy$5(var10000, 1634510129530639878L, var6).method_48$bc607678b6();
      }

      float var26;
      int[] var40;
      label157: {
         label156: {
            label155: {
               label180: {
                  label153: {
                     var26 = var33;
                     float var43;
                     var34 = (var43 = var26 - 0.0F) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
                     label152:
                     if (var25 == null) {
                        if (var34 > 0) {
                           float var44;
                           var34 = (var44 = this.field_45 - 0.0F) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                           var40 = var25;
                           if (var1 <= 0) {
                              break label153;
                           }

                           if (var25 != null) {
                              break label152;
                           }

                           if (var34 == 0) {
                              this.field_431
                                 .method_44$7c39c8007b(
                                    (int)recovery$indy$6(this.settingAnimationTime, var10, 1631062776365332856L, var6),
                                    C_47nb.method_41$7498260812(recovery$indy$7(this.settingToggleAnimation, var16, 1634255445446417194L, var6)),
                                    1,
                                    true
                                 );
                              if (var3 <= 0) {
                                 break label155;
                              }

                              if (var25 == null) {
                                 break label180;
                              }
                           }
                        }

                        float var45;
                        var34 = (var45 = var26 - 0.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                     }

                     var40 = var25;
                  }

                  if (var40 != null) {
                     break label156;
                  }

                  if (var34 == 0) {
                     float var46;
                     var34 = (var46 = this.field_45 - 0.0F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
                     var40 = var25;
                     if (var4 < 0) {
                        break label157;
                     }

                     if (var25 != null) {
                        break label156;
                     }

                     if (var34 > 0) {
                        this.field_431
                           .method_44$7c39c8007b(
                              (int)recovery$indy$8(this.settingAnimationTime, var10, 1631062776365332856L, var6),
                              C_47nb.method_41$7498260812(recovery$indy$9(this.settingToggleAnimation, var16, 1634255445446417194L, var6)),
                              0,
                              true
                           );
                     }
                  }
               }

               this.field_45 = var26;
            }

            double var47;
            var34 = (var47 = this.field_431.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
         }

         var40 = var25;
      }

      label127: {
         label126: {
            label125: {
               label124: {
                  if (var40 == null) {
                     if (var34 != 0) {
                        var35 = recovery$indy$10(this.settingToggleAnimation, var16, 1634255445446417194L, var6);
                        if (var25 != null) {
                           break label127;
                        }

                        if (!var35.equals(recovery$indy$11(7352, 3203104848599238531L ^ var6))) {
                           break label124;
                        }
                     }

                     var33 = var26;
                     if (var4 <= 0) {
                        break label126;
                     }

                     var41 = 0.0F;
                     if (var25 != null) {
                        break label125;
                     }

                     float var48;
                     var34 = (var48 = var26 - 0.0F) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                  }

                  if (var34 == 0) {
                     return;
                  }
               }

               GL11.glPushMatrix();
               var33 = 1.0F;
               var41 = var5.method_40$8abf5c6871();
            }

            var33 /= var41;
         }

         GL11.glScaled(var33, 1.0F / var5.method_40$8abf5c6871(), 1.0);
         var35 = recovery$indy$14(
               recovery$indy$12(field_43, 1634510129530639878L, var6).method_48$bc607678b6() * 100.0F,
               var18,
               Math.max((int)recovery$indy$13(this.settingDecimalPlaces, var10, 1631062776365332856L, var6), 0),
               1630897066078199251L,
               var6
            )
            + "%";
      }

      String var27 = var35;
      float var28 = (recovery$indy$15(field_43, 1634407970988961644L, var6).method_48$2f485d5ba3(var27) + 4) / 2.0F;
      GL11.glTranslated(
         var28 * recovery$indy$16(this.settingScale, var10, 1631062776365332856L, var6)
            + recovery$indy$17(this.settingPosX, var10, 1631062776365332856L, var6)
               / 100.0
               * (field_43.field_44f - var28 * 2.0F * recovery$indy$18(this.settingScale, var10, 1631062776365332856L, var6)),
         6.0 * recovery$indy$19(this.settingScale, var10, 1631062776365332856L, var6)
            + recovery$indy$20(this.settingPosY, var10, 1631062776365332856L, var6)
               / 100.0
               * (field_43.field_44g - 12.0 * recovery$indy$21(this.settingScale, var10, 1631062776365332856L, var6)),
         0.0
      );
      GL11.glScaled(recovery$indy$22(this.settingScale, var10, 1631062776365332856L, var6), recovery$indy$23(this.settingScale, var10, 1631062776365332856L, var6), 1.0);
      double var29 = this.field_431.method_45$fedcb3e4d3();
      double var49;
      int var37 = (var49 = this.field_431.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
      var40 = var25;
      if (var3 > 0) {
         if (var25 == null) {
            if (var37 < 0) {
               GL11.glScaled(var29, var29, 1.0);
            }

            var37 = (int) ((recovery$indy$24(this.settingBackGround, 1631113159180723040L, var6)) ? 1 : 0);
         }

         var40 = var25;
      }

      if (var40 == null) {
         var37 = var37 != 0 ? recovery$indy$25(this.settingBackGroundColor, var22, (short)var23, (char)var24, 0, 1634154453812543143L, var6) : 0;
      }

      int var31 = var37;
      int var32 = recovery$indy$26(this.settingColor, var22, (short)var23, (char)var24, 0, 1634154453812543143L, var6);
      recovery$indy$29(
         recovery$indy$27(this.field_47, var8, 1633904889391372581L, var6),
         recovery$indy$28(this.field_47, var14, 1633787526466981481L, var6),
         var12,
         1634234979942666486L,
         var6
      );
      recovery$indy$31(false, var20, recovery$indy$30(this, var28, var31, var27, var32), 1634374390158715458L, var6);
      GL11.glPopMatrix();
      RenderUtils.method_41$da8c82d5d4();
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 124404808222168L;
      long var3 = var1 ^ 130573632110308L;
      long var10000 = -4965217578642874204L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -4964365054475471201L;
      long var6 = var3;
      ModeSetting var8 = this.settingToggleAnimation;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   private void method_47$24772c6902(float var1, int var2, String var3, int var4, RenderPass var5) {
      long var6 = a ^ 114510573081790L;
      long var8 = var6 ^ 64974942668849L;
      long var10 = var6 ^ 106390298494481L;
      long var10001 = -6164870282290585677L;
      BooleanSetting var12 = this.settingBackGround;
      if (var12.method_49$aae029aa0a()) {
         double var10000 = -var1;
         double var10002 = var1;
         ShaderOptions var10004 = this.field_47;
         long var10009 = -6161910472913815925L;
         long var13 = var8;
         int var15 = var2;
         RenderPass var16 = var5;
         int var10007 = C_47TX.method_40$6b468acafc(var16, var15, var13);
         long var10008 = -6161849153361896920L;
         int var17 = var10007;
         long var18 = var10;
         RenderPass var20 = var5;
         ShaderOptions var21 = var10004;
         RenderUtils.method_40$56a5fc1016(var10000, -6.0, var10002, 6.0, var21.method_40$d68b376f5b(var20, var18, var17));
      }

      if (var5 != RenderPass.BLUR) {
         var10001 = -6161612028457348161L;
         Minecraft var22 = field_43;
         var22.field_42N.method_42$b593f01403(var3, -var1 + 2.0F, -3.5F, var4);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$32(this, 32, var3, -7100628958941881710L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public BreakIndicator_47Qn(long var1) {
      super("BreakIndicator", "BlockBrechAnzeige", ((a ^ var1) ^ 398481964451L), new Color(50, 168, 123), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 132670870647941L;
      long var5 = var1 ^ 83463395396974L;
      long var7 = var1 ^ 30251051438362L;
      long var9 = var1 ^ 110813593952855L;
      long var11 = var1 ^ 124761363898808L;
      long var13 = var1 ^ 101294515347007L;
      long var15 = var1 ^ 24086500614557L;
      long var17 = var1 ^ 398481964451L;
      // Super arguments moved to the required Java constructor position.
      this.settingDecimalPlaces = new NumberSetting(this, "DecimalPlaces", 1.0, var13, 0.0, 4.0, 0);
      this.settingScale = new NumberSetting(this, "Scale", 2.0, var13, 1.0, 4.0, 2);
      this.settingPosX = new NumberSetting(this, "PosX", 52.0, var13, 0.0, 100.0, 2);
      this.settingPosY = new NumberSetting(this, "PosY", 50.0, var13, 0.0, 100.0, 2);
      this.settingColor = new ColorSetting(var15, this, "Color", Color.white);
      this.settingBackGround = new BooleanSetting(this, var11, "BackGround", true);
      ColorSetting var10001 = new ColorSetting(var15, this, "BackGroundColor", new Color(0, 0, 0, 100));
      BooleanSetting var10002 = this.settingBackGround;
      this.settingBackGround.getClass();
      C_45n var10003 = recovery$indy$33(var10002);
      long var10004 = 3751693415875513008L;
      C_45n var19 = var10003;
      long var20 = var3;
      ColorSetting var22 = var10001;
      this.settingBackGroundColor = (ColorSetting)var22.method_43$780fd62a21(var20, var19);
      ShaderOptions var30 = new ShaderOptions(this, var7);
      var10004 = 3752358989295823086L;
      Color var23 = Color.black;
      long var24 = var9;
      ShaderOptions var26 = var30;
      this.field_47 = var26.method_44$10ed55120d(var24, var23);
      this.settingToggleAnimation = new ModeSetting(this, "ToggleAnimation", var5, "easeInOutCubic", C_47nb.method_42$8fc34d0ddc(true));
      NumberSetting var31 = new NumberSetting(this, "AnimationTime", 500.0, var13, 0.0, 1000.0, 0);
      C_45n var32 = recovery$indy$34(this);
      long var33 = 3752565832303625831L;
      C_45n var27 = var32;
      NumberSetting var28 = var31;
      this.settingAnimationTime = var28.method_43$9db6d416f4(var27);
      this.field_431 = new C_47nb(0.0F, 0.0F, 0.0F, 0.0F);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native C_47Ij recovery$indy$2(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$3(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$4(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$5(Object var0, long var1, long var3);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$11(int var0, long var1);

   private static native C_40g recovery$indy$12(Object var0, long var1, long var3);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$14(double var0, long var2, int var4, long var5, long var7);

   private static native FontRenderer recovery$indy$15(Object var0, long var1, long var3);

   private static native double recovery$indy$16(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$17(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$20(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$23(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native int recovery$indy$25(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native int recovery$indy$26(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$28(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$29(boolean var0, boolean var1, long var2, long var4, long var6);

   private static native C_47Fw recovery$indy$30(BreakIndicator_47Qn var0, float var1, int var2, String var3, int var4);

   private static native void recovery$indy$31(boolean var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$33(BooleanSetting var0);

   private static native C_45n recovery$indy$34(BreakIndicator_47Qn var0);

   private static native MethodHandle recovery$constant$35();
}
