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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.texture.TextureManager;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.minecraft.client.gui.FontRenderer;
import net.C_47LS;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47hg;
import net.C_47oY;
import net.C_47pL;
import net.C_47qc;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class RenderPotion_47HN extends Module implements RenderListener {
   public final NumberSetting settingXCoord;
   public final NumberSetting settingYCoord;
   public final NumberSetting settingScale;
   public final NumberSetting settingMargin;
   public final ColorSetting settingBackgroundColor;
   public final ShaderOptions field_47;
   private static final long a = C_4f.a(-7402179702579900469L, 154852986177724668L, MethodHandles.lookup().lookupClass()).a(232532844641036L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[39];
   private static final String[] f = new String[39];

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

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      net.C_47oY var39;
      net.C_47hg var41;
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
      int[] var10000 = recovery$indy$1(1631172403926752140L, var6);
      Collection var22 = recovery$indy$2(field_43, 1634090119039103767L, var6).method_46$29638970ac();
      GL11.glPushMatrix();
      GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
      int[] var21 = var10000;
      GL11.glScaled(recovery$indy$3(this.settingScale, var10, 1631251994763321425L, var6), recovery$indy$4(this.settingScale, var10, 1631251994763321425L, var6), 1.0);
      ScaledResolution var23 = new ScaledResolution(
         field_43.field_44f * (1.0 / recovery$indy$5(this.settingScale, var10, 1631251994763321425L, var6)),
         field_43.field_44g * (1.0 / recovery$indy$6(this.settingScale, var10, 1631251994763321425L, var6)),
         (int)recovery$indy$7(this.settingScale, var10, 1631251994763321425L, var6)
      );
      if (var21 == null) {
         label125: {
            label129: {
               byte var37 = (byte) ((var22.isEmpty()) ? 1 : 0);
               if (var4 > 0) {
                  if (var37 != 0) {
                     break label129;
                  }

                  var37 = 32;
               }

               byte var24 = var37;
               int var25 = (int)(var24 + recovery$indy$8(this.settingMargin, var10, 1631251994763321425L, var6));
               int var26 = (int)((var23.method_46$8abf5c6871() - 142) * (recovery$indy$9(this.settingXCoord, var10, 1631251994763321425L, var6) / 100.0));
               int var27 = (int)(
                  (var23.method_48$8abf5c6871() - (var25 * (var22.size() - 1) + var24))
                     * (recovery$indy$10(this.settingYCoord, var10, 1631251994763321425L, var6) / 100.0)
               );
               GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.method_41$da8c82d5d4();
               GlStateManager.method_42p$da8c82d5d4();
               int var28 = recovery$indy$11(this.settingBackgroundColor, var18, (short)var19, (char)var20, 0, 1630912462405831889L, var6);

               for (Object recovered$element$5526 : recovery$indy$12(field_43, 1634090119039103767L, var6).method_46$29638970ac()) {
         C_47hg var30 = (C_47hg) recovered$element$5526;
                  C_47oY var31 = C_47oY.field_461[var30.method_49$8abf5c6871()];
                  if (var1 < 0) {
                     break label125;
                  }

                  if (var21 != null) {
                     return;
                  }

                  if (var31 != null) {
                     label132: {
                        int var32 = var27;
                        int var33 = var27;
                        recovery$indy$15(
                           recovery$indy$13(this.field_47, var8, 1631015263001640294L, var6),
                           recovery$indy$14(this.field_47, var14, 1631128791064024391L, var6),
                           var12,
                           1631371007092898987L,
                           var6
                        );
                        int var38 = 0;
                        if (var3 > 0) {
                           recovery$indy$17(false, var16, recovery$indy$16(this, var26, var32, var33, var24, var28), 1633758599537560261L, var6);
                           GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                           var39 = var31;
                           if (var21 != null) {
                              break label132;
                           }

                           var38 = (int) ((var31.method_42$aae029aa0a()) ? 1 : 0);
                        }

                        label108: {
                           if (var4 > 0) {
                              if (var38 == 0) {
                                 break label108;
                              }

                              recovery$indy$18(field_43, 1633989239528118843L, var6).method_44$fbbbe3c71b(C_47pL.field_46I);
                              var38 = var31.method_49$8abf5c6871();
                           }

                           int var34 = var38;
                           recovery$indy$19(field_43, 1631345239750088208L, var6)
                              .method_47$2f87e17fce(var26 + 6, var27 + 7, 0 + var34 % 8 * 18, 198 + var34 / 8 * 18, 18, 18);
                        }

                        var39 = var31;
                     }

                     label102: {
                        label101: {
                           String var36;
                           label133: {
                              var36 = C_47qc.method_44$32d58c58b9(var39.method_42$0e30dfc966(), new Object[0]);
                              int var40 = var30.method_47$8abf5c6871();
                              byte var42 = 1;
                              int[] var10002 = var21;
                              if (var3 > 0) {
                                 if (var21 == null) {
                                    if (var40 == 1) {
                                       var36 = var36 + " " + C_47qc.method_44$32d58c58b9(recovery$indy$20(28174, 7226206139264445646L ^ var6), new Object[0]);
                                       if (var21 == null) {
                                          break label133;
                                       }
                                    }

                                    var40 = var30.method_47$8abf5c6871();
                                    var42 = 2;
                                 }

                                 var10002 = var21;
                              }

                              if (var10002 == null) {
                                 if (var40 == var42) {
                                    var36 = var36 + " " + C_47qc.method_44$32d58c58b9(recovery$indy$21(13250, 1501092701208637701L ^ var6), new Object[0]);
                                    if (var21 == null) {
                                       break label133;
                                    }
                                 }

                                 var41 = var30;
                                 if (var4 < 0) {
                                    break label102;
                                 }

                                 var40 = var30.method_47$8abf5c6871();
                                 if (var21 != null) {
                                    break label101;
                                 }

                                 var42 = 3;
                              }

                              if (var40 == var42) {
                                 var36 = var36 + " " + C_47qc.method_44$32d58c58b9(recovery$indy$22(23146, 7044181155176126639L ^ var6), new Object[0]);
                              }
                           }

                           recovery$indy$23(field_43, 1633924461892646940L, var6).method_40$b593f01403(var36, var26 + 10 + 18, var27 + 6, 16777215);
                        }

                        var41 = var30;
                     }

                     String var35 = C_47oY.method_46$2a17c96be3(var41);
                     recovery$indy$24(field_43, 1633924461892646940L, var6).method_40$b593f01403(var35, var26 + 10 + 18, var27 + 6 + 10, 8355711);
                     var27 += var25;
                     if (var3 <= 0) {
                        break label125;
                     }

                     if (var21 != null) {
                        break;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
         }

         RenderUtils.method_41$da8c82d5d4();
      }
   }

   private void method_47$88833b0910(int var1, int var2, int var3, int var4, int var5, RenderPass var6) {
      long var7 = a ^ 115031445566795L;
      long var9 = var7 ^ 68850692905238L;
      long var11 = var7 ^ 111344049477430L;
      int var10002 = var1 + 140;
      int var10003 = var3 + var4;
      ShaderOptions var10004 = this.field_47;
      long var10009 = -334990672738945284L;
      long var13 = var9;
      int var15 = var5;
      RenderPass var16 = var6;
      int var10007 = C_47TX.method_40$6b468acafc(var16, var15, var13);
      long var10008 = -335502419844181701L;
      int var17 = var10007;
      long var18 = var11;
      RenderPass var20 = var6;
      ShaderOptions var21 = var10004;
      RenderUtils.method_40$0f4d4a7a6c(var1, var2, var10002, var10003, var21.method_40$d68b376f5b(var20, var18, var17));
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$25(this, 32, var3, -7099249933934537661L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public RenderPotion_47HN(long var1) {
      super("RenderPotion", "ZeichneTränke", ((a ^ var1) ^ 105027982706248L), new Color(123, 252, 3), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 75153938918129L;
      long var5 = var1 ^ 64947155278268L;
      long var7 = var1 ^ 4368172787156L;
      long var9 = var1 ^ 81576187255414L;
      long var11 = var1 ^ 105027982706248L;
      // Super arguments moved to the required Java constructor position.
      this.settingXCoord = new NumberSetting(this, "X-Coord", 0.0, var7, 0.0, 100.0, 2);
      this.settingYCoord = new NumberSetting(this, "Y-Coord", 0.0, var7, 0.0, 100.0, 2);
      this.settingScale = new NumberSetting(this, "Scale", 2.0, var7, 0.5, 4.0, 2);
      this.settingMargin = new NumberSetting(this, "Margin", 1.0, var7, 0.0, 10.0, 0);
      this.settingBackgroundColor = new ColorSetting(var9, this, "BackgroundColor", new Color(0, 0, 0, 150));
      ShaderOptions var10001 = new ShaderOptions(this, var3);
      long var10004 = -3460174060560757715L;
      Color var13 = Color.black;
      long var14 = var5;
      ShaderOptions var16 = var10001;
      this.field_47 = var16.method_44$10ed55120d(var14, var13);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$11(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$15(boolean var0, boolean var1, long var2, long var4, long var6);

   private static native C_47Fw recovery$indy$16(RenderPotion_47HN var0, int var1, int var2, int var3, int var4, int var5);

   private static native void recovery$indy$17(boolean var0, long var1, Object var3, long var4, long var6);

   private static native TextureManager recovery$indy$18(Object var0, long var1, long var3);

   private static native C_47LS recovery$indy$19(Object var0, long var1, long var3);

   private static native String recovery$indy$20(int var0, long var1);

   private static native String recovery$indy$21(int var0, long var1);

   private static native String recovery$indy$22(int var0, long var1);

   private static native FontRenderer recovery$indy$23(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$24(Object var0, long var1, long var3);

   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$26();
}
