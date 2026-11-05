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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_40g;
import net.C_40t;
import net.C_42V;
import net.C_45n;
import client.render.RenderPass;
import net.C_473U;
import net.C_476l;
import net.minecraft.client.gui.ScaledResolution;
import net.C_479E;
import net.C_479J;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Fw;
import net.C_47Fx;
import net.minecraft.client.gui.FontRenderer;
import net.C_47LS;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import net.C_47Wu;
import client.event.RenderListener;
import net.C_47bi;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47gt;
import net.C_47i;
import net.C_47iC;
import net.C_47ob;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sT;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Hotbar_47Hf extends client.module.Module implements client.event.RenderListener,net.C_47iC,net.C_47xz {
    public final client.setting.NumberSetting settingHotbarScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingArmor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingArmorDurability = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingArmorShadow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCustomHotbar = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingCustomHotbar2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingItemRectangle = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSilentSlot = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDebugInformation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOtherPingCalculation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingInventoryItems = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    public int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    public float field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.Setting[] field_47; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private void method_46$8d7976b8ed(float var1, int var2, RenderPass var3) {
      long var4 = a ^ 55319340011130L;
      long var6 = var4 ^ 10629480670330L;
      long var10000 = -4029568981114133830L;
      int[] var8 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var3 == RenderPass.SHADOW) {
         float var10001 = var2;
         float var10002 = var1 + 182.0F;
         float var10003 = var2 + 60;
         ShaderOptions var10004 = this.settingCustomHotbar2;
         int var10007 = Color.black.getRGB();
         long var10008 = -4028942939717478644L;
         int var9 = var10007;
         long var10 = var6;
         RenderPass var12 = var3;
         ShaderOptions var13 = var10004;
         RenderUtils.method_43$76ab45bd30(var1, var10001, var10002, var10003, var13.method_40$d68b376f5b(var12, var10, var9));
         if (var8 == null) {
            return;
         }
      }

      RenderUtils.method_41$f5c515825a(var1, var2, var1 + 182.0F, var2 + 60, 0, 0, 0, 185);
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private void method_42$f5ed36ec7e(long var1, float var3) {
      var1 = a ^ var1;
      int[] var4 = (int[])recovery$indy$flow$12(1776180988045472264L, var1);
      this.field_43h.add(var3);

      while (this.field_43h.size() > 5) {
         this.field_43h.remove(0);
         if (var4 != null) {
            break;
         }
      }

      float var5 = 0.0F;
      java.util.Iterator var10000 = this.field_43h.iterator();
      if (var1 >= 0L) {
         java.util.Iterator var6 = var10000;

         while (var6.hasNext()) {
            float var7 = (Float)var6.next();
            var5 += var7;
            long var15;
            int var12 = (var15 = var1 - 0L) == 0L ? 0 : (var15 < 0L ? -1 : 1);
            if (var4 != null) {
               return;
            }

            if (var4 != null) {
               break;
            }
         }

         Object var11 = this;
         if (var1 > 0L) {
            this.field_42 = (float)(Math.round(var5 / this.field_43h.size() * 100.0F) / 100.0);
            return;
         }

         while (true) {
            float var10 = (Float)var11;
            var5 += var10;
            long var16;
            int var13 = (var16 = var1 - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
            if (var4 != null) {
               return;
            }

            if (var4 == null && var6.hasNext()) {
               var11 = var6.next();
            } else {
               var11 = this;
               long var17;
               var13 = (var17 = var1 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
            }
         }
      }

      while (true) {
         while (var4 != null || this.field_43h.size() <= 5) {
            var5 = 0.0F;
            this.field_43h.iterator();
            long var18;
            int var10001 = (var18 = var1 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
         }

         this.field_43h.remove(0);
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      net.C_473U var14;
      augustus.recovered.modules.render.Hotbar_47Hf var15;
      long var4;
      int[] var6;
      C_473U var7;
      int[] var16;
      int var10000;
      label130: {
         label129: {
            label133: {
               label127: {
                  var4 = var1 ^ 120672541344497L;
                  var6 = recovery$indy$2(-7192232418261453154L, var1);
                  var7 = recovery$indy$3(var3, -7191272474812319096L, var1);
                  var10000 = (int) ((var7 instanceof C_47bi) ? 1 : 0);
                  label126:
                  if (var6 == null) {
                     if (var10000 == 0) {
                        var10000 = (int) ((var7 instanceof C_476l) ? 1 : 0);
                        var16 = var6;
                        if (var1 < 0L) {
                           break label127;
                        }

                        if (var6 != null) {
                           break label126;
                        }

                        if (var10000 == 0) {
                           var10000 = (int) ((var7 instanceof C_42V) ? 1 : 0);
                           if (var6 != null) {
                              break label129;
                           }

                           if (var10000 == 0) {
                              break label133;
                           }
                        }
                     }

                     var10000 = (int) ((recovery$indy$4(field_43, -7191420822180992623L, var1).method_47$aae029aa0a()) ? 1 : 0);
                  }

                  var16 = var6;
               }

               if (var16 != null) {
                  break label129;
               }

               label112:
               if (var10000 == 0) {
                  label135: {
                     var10000 = (int) ((var7 instanceof C_42V) ? 1 : 0);
                     var16 = var6;
                     if (var1 >= 0L) {
                        if (var6 == null) {
                           if (var10000 == 0) {
                              break label135;
                           }

                           var10000 = ((C_42V)var7).method_44$8abf5c6871();
                        }

                        var16 = var6;
                     }

                     if (var1 < 0L) {
                        break label130;
                     }

                     if (var16 != null) {
                        break label129;
                     }

                     if (var10000 != 255) {
                        break label112;
                     }
                  }

                  this.field_438++;
               }
            }

            var10000 = (int) ((var7 instanceof C_479E) ? 1 : 0);
         }

         var16 = var6;
      }

      label91: {
         label136: {
            label137: {
               if (var16 == null) {
                  if (var10000 == 0) {
                     return;
                  }

                  var14 = var7;
                  if (var6 != null) {
                     break label137;
                  }

                  var10000 = (int) ((var7 instanceof C_479J) ? 1 : 0);
               }

               if (var10000 == 0) {
                  var14 = var7;
                  if (var6 != null) {
                     break label137;
                  }

                  if (!(var7 instanceof C_479m)) {
                     break label136;
                  }
               }

               var14 = var7;
            }

            C_479E var8 = (C_479E)var14;
            double var9 = Math.abs(var8.method_47$fedcb3e4d3() - this.field_43F);
            double var11 = Math.abs(var8.method_42$fedcb3e4d3() - this.field_430);
            float var13 = (float)(Math.hypot(var11, var9) * 20.0);
            recovery$indy$5(this, var4, var13, -7190179470438381603L, var1);
            this.field_43F = var8.method_47$fedcb3e4d3();
            var15 = this;
            if (var1 <= 0L) {
               break label91;
            }

            this.field_430 = var8.method_42$fedcb3e4d3();
            if (var6 == null) {
               return;
            }
         }

         var15 = this;
      }

      recovery$indy$6(var15, var4, 0.0F, -7190179470438381603L, var1);
   }




   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      int[] var51;
      int[] var47;
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 54881756596022L;
      long var10 = var6 ^ 62665625052564L;
      long var12 = var6 ^ 132989861136316L;
      long var14 = var6 ^ 91924420980846L;
      long var16 = var6 ^ 122729819376735L;
      long var18 = var6 ^ 79903376820066L;
      long var10001 = var6 ^ 91111378839327L;
      int var20 = (int)((var6 ^ 91111378839327L) >>> 32);
      int var21 = (int)((var6 ^ 91111378839327L) << 32 >>> 40);
      int var22 = (int)(var10001 << 56 >>> 56);
      long var23 = var6 ^ 58032606781533L;
      int[] var25 = recovery$indy$7(1633798235799796738L, var6);
      Hotbar_47Hf var10000 = this;
      if (var25 == null) {
         if (!recovery$indy$8(this.settingCustomHotbar, 1634147253638208688L, var6)) {
            return;
         }

         GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
         var10000 = this;
      }

      double var26 = recovery$indy$9(var10000.settingHotbarScale, true, var16, 1634478729494907295L, var6);
      int var28 = (int)Math.round(field_43.field_44f / var26);
      int var29 = (int)Math.round(field_43.field_44g / var26);
      GL11.glScaled(var26, var26, 1.0);
      EntityPlayer var30 = (EntityPlayer)recovery$indy$10(field_43, 1633042873931176424L, var6);
      int var31 = var28 / 2;
      recovery$indy$13(
         recovery$indy$11(this.settingCustomHotbar2, var10, 1634672840086695205L, var6),
         recovery$indy$12(this.settingCustomHotbar2, var14, 1632687439298074541L, var6),
         var12,
         1633916718063048609L,
         var6
      );
      recovery$indy$15(false, var23, recovery$indy$14(this, var29, var28), 1633622053706075925L, var6);
      int var44 = (int) ((recovery$indy$16(this.settingItemRectangle, 1634147253638208688L, var6)) ? 1 : 0);
      int[] var50 = var25;
      if (var4 >= 0) {
         if (var25 == null) {
            if (var44 != 0) {
               RenderUtils.method_43$76ab45bd30(var28 / 2.0F - 91.0F, var29 - 22, var28 / 2.0F + 91.0F, var29, Integer.MIN_VALUE);
            }

            var44 = recovery$indy$17(field_43, 1633488611025308003L, var6).field_42X.field_42;
         }

         var50 = var25;
      }

      label143: {
         label142:
         if (var50 == null) {
            if (var44 != C_47i.field_40) {
               var44 = (int) ((recovery$indy$18(this.settingSilentSlot, 1634147253638208688L, var6)) ? 1 : 0);
               var51 = var25;
               if (var1 < 0) {
                  break label143;
               }

               if (var25 != null) {
                  break label142;
               }

               if (var44 != 0) {
                  RenderUtils.method_41$f5c515825a(
                     (float)(var31 - 90.3 + recovery$indy$19(field_43, 1633488611025308003L, var6).field_42X.field_42 * 20),
                     var29 - 22,
                     (float)(var31 - 68.9 + recovery$indy$20(field_43, 1633488611025308003L, var6).field_42X.field_42 * 20),
                     var29,
                     154,
                     206,
                     243,
                     185
                  );
               }
            }

            RenderUtils.method_41$f5c515825a(
               (float)(var31 - 90.3 + C_47i.field_40 * 20), var29 - 22, (float)(var31 - 68.9 + C_47i.field_40 * 20), var29, 222, 222, 222, 185
            );
            var44 = (int) ((recovery$indy$21(this.settingDebugInformation, 1634147253638208688L, var6)) ? 1 : 0);
         }

         var51 = var25;
      }

      if (var51 == null) {
         if (var44 != 0) {
            RenderUtils.method_41$f5c515825a(var28 - 5, var29 - 22, var28, var29, 255, 255, 255, 200);
         }

         recovery$indy$22(var28, var20, var21, (byte)var22, var29, 1633845488256379488L, var6);
         GlStateManager.method_42R$da8c82d5d4();
         GlStateManager.method_423$da8c82d5d4();
         GlStateManager.method_44$42cf812248(770, 771, 1, 0);
         C_47Fx.method_41$da8c82d5d4();
         var44 = 0;
      }

      int var32 = var44;

      while (true) {
         if (var32 < 9) {
            int var33 = var28 / 2 - 90 + var32 * 20 + 2;
            int var34 = var29 - 16 - 3;
            recovery$indy$23(field_43, 1634627704987770231L, var6)
               .method_42$f8becba966(var32, var33, var34, recovery$indy$24(field_43, 1634788636427429385L, var6).field_49, var30);
            var32++;
            int[] var45 = var25;
            if (var1 > 0) {
               if (var25 != null) {
                  return;
               }

               var45 = var25;
            }

            if (var45 == null) {
               continue;
            }
         }

         do {
            int var46 = (int) ((recovery$indy$25(this.settingInventoryItems, 1634147253638208688L, var6)) ? 1 : 0);
            if (var3 > 0) {
               if (var25 == null) {
                  label105:
                  if (var46 != 0) {
                     EntityPlayerSP var48 = recovery$indy$26(field_43, 1633488611025308003L, var6);
                     if (var25 == null) {
                        if (var48 == null) {
                           break label105;
                        }

                        var48 = recovery$indy$27(field_43, 1633488611025308003L, var6);
                     }

                     if (var48.field_42X != null) {
                        C_47gt var39 = new C_47gt(
                           recovery$indy$28(field_43, 1633488611025308003L, var6).field_42X,
                           false,
                           recovery$indy$29(field_43, 1633488611025308003L, var6),
                           true
                        );
                        int var41 = (int)(var28 / 2.0F) - 96;
                        int var43 = var29 - 165;
                        float var35 = var41 + 5.5F;
                        int var36 = var43 + 83;
                        recovery$indy$32(
                           recovery$indy$30(this.settingCustomHotbar2, var10, 1634672840086695205L, var6),
                           recovery$indy$31(this.settingCustomHotbar2, var14, 1632687439298074541L, var6),
                           var12,
                           1633916718063048609L,
                           var6
                        );
                        recovery$indy$34(false, var23, recovery$indy$33(this, var35, var36), 1633622053706075925L, var6);
                        int var37 = 0;

                        while (var37 < var39.field_46.size()) {
                           C_47sT var38 = (C_47sT)var39.field_46.get(var37);
                           recovery$indy$35(this, var38, var18, var41, var43, 1633108825694008125L, var6);
                           var37++;
                           int[] var49 = var25;
                           if (var3 >= 0) {
                              if (var25 != null) {
                                 return;
                              }

                              var49 = var25;
                           }

                           if (var49 != null) {
                              break;
                           }
                        }
                     }
                  }

                  C_47Fx.method_45$da8c82d5d4();
                  GlStateManager.method_47$da8c82d5d4();
                  GlStateManager.method_42z$da8c82d5d4();
                  recovery$indy$36(C_40t.field_45, var8, "A", 1.5, var29 - 20, Color.white.getRGB(), 1633250417642427719L, var6);
                  GL11.glScaled(1.0 / var26, 1.0 / var26, 1.0);
                  if (var3 < 0) {
                     return;
                  }

                  var46 = var5.method_40$8abf5c6871();
               }

               GL11.glScaled(var46, var5.method_40$8abf5c6871(), 1.0);
               RenderUtils.method_41$da8c82d5d4();
               return;
            }

            int var40 = var46;
            int var42 = var29 - 16 - 3;
            recovery$indy$23(field_43, 1634627704987770231L, var6)
               .method_42$f8becba966(var32, var40, var42, recovery$indy$24(field_43, 1634788636427429385L, var6).field_49, var30);
            var32++;
            var47 = var25;
            if (var1 > 0) {
               if (var25 != null) {
                  return;
               }

               var47 = var25;
            }
         } while (var47 != null);
      }
   }







   private void method_44$5d9b204802(int var1, int var2, RenderPass var3) {
      long var4 = a ^ 5064317411871L;
      long var6 = var4 ^ 55834537863543L;
      long var10000 = -6597440751644635425L;
      int[] var8 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var3 == RenderPass.SHADOW) {
         float var10001 = var1 + 1;
         float var10002 = var2 + 1;
         float var10003 = var1 - 22;
         ShaderOptions var10004 = this.settingCustomHotbar2;
         int var10005 = Color.black.getRGB();
         long var10007 = -6597361056902225813L;
         long var9 = var6;
         int var11 = var10005;
         ShaderOptions var12 = var10004;
         RenderUtils.method_43$76ab45bd30(0.0F, var10001, var10002, var10003, var12.method_49$7ee0e11626(var11, var9));
         if (var8 == null) {
            return;
         }
      }

      RenderUtils.method_41$f5c515825a(0.0F, var1 + 1, var2 + 1, var1 - 22, 0, 0, 0, 185);
   }



   private void method_49$44050359dc(C_47sT var1, long var2, int var4, int var5) {
      var2 = a ^ var2;
      int var6 = var1.field_40 + var4;
      int var7 = var1.field_46 + var5;
      C_47rf var8 = var1.method_48$ac4db64966();
      GlStateManager.method_42$da8c82d5d4();
      recovery$indy$37(field_43, -2905551419806630868L, var2).method_47$c76f597421(var8, var6, var7);
      recovery$indy$38(field_43, -2905551419806630868L, var2)
         .method_40$8a54eb3b13(recovery$indy$39(field_43, -2905920165031234677L, var2), var8, var6, var7, null);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 27030581052379L;
      long var10000 = 411290577971228443L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 410307200594038560L;
      BooleanSetting var4 = this.settingArmor;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 411217399442313129L;
         BooleanSetting var5 = this.settingArmor;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public int method_45$95d88932bd(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$40(-7068267398768281786L, var1);
      byte var10000 = (byte) ((recovery$indy$41(this.settingCustomHotbar, -7067912728224360460L, var1)) ? 1 : 0);
      if (var3 == null) {
         if (var10000 == 0) {
            return 0;
         }

         var10000 = (byte) ((recovery$indy$42(this.settingInventoryItems, -7067912728224360460L, var1)) ? 1 : 0);
      }

      if (var3 != null) {
         return var10000;
      } else {
         return var10000 != 0 ? -62 : 0;
      }
   }



   public static Setting[] method_47$19d51fe81e() {
      return field_47;
   }



   public static void method_43$5994d1a418(Setting[] var0) {
      field_47 = var0;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$43(this, 32, var3, -7101878034985003159L, var1);
      recovery$indy$44(this, 26, var3, -7101878034985003159L, var1);
      recovery$indy$45(this, 40, var3, -7101878034985003159L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$46(2183476579432510691L, var4);
      this.field_43W.add(this.field_438);

      ArrayList var10000;
      label57: {
         label56:
         while (true) {
            if (this.field_43W.size() > 20) {
               var10000 = this.field_43W;
               if (var2 <= 0) {
                  break label57;
               }

               this.field_43W.remove(0);
            } else if (var3 >= 0) {
               this.field_43y = 0;
               break;
            }

            do {
               if (var6 != null) {
                  break label56;
               }

               if (var6 == null) {
                  continue label56;
               }
            } while (var3 < 0);

            this.field_43y = 0;
            break;
         }

         var10000 = this.field_43W;
      }

      Iterator var7 = var10000.iterator();

      label38:
      while (true) {
         Object var9;
         if (var7.hasNext()) {
            var9 = var7.next();
         } else {
            var9 = this;
            if (var2 > 0) {
               this.field_438 = 0;
               break;
            }
         }

         do {
            int var8 = (Integer)var9;
            this.field_43y += var8;
            int[] var10 = var6;
            if (var1 >= 0) {
               if (var6 != null) {
                  return;
               }

               var10 = var6;
            }

            if (var10 == null) {
               continue label38;
            }

            var9 = this;
         } while (var2 <= 0);

         this.field_438 = 0;
         break;
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Hotbar_47Hf(long a0) {
        super((java.lang.String) ("Hotbar"),(java.lang.String) ("Schnellzugriffsleiste"),(long) (((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 113008029654940L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (64),(int) (52))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 33202849388218L);
        long constructorKey4 = ((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 137542623703845L);
        long constructorKey5 = ((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 2558474158184L);
        long constructorKey6 = ((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 26264678171527L);
        long constructorKey7 = ((augustus.recovered.modules.render.Hotbar_47Hf.a ^ a0) ^ 64575027035136L);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "HotbarScale", Double.longBitsToDouble(4611686018427387904L), constructorKey7, 1.0D, Double.longBitsToDouble(4616189618054758400L), 2);
        recovery$indy$flow$223(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey6, "Armor", true);
        recovery$indy$flow$226(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey6, "ArmorDurability", true);
        java.lang.Object initialValue11 = recovery$indy$flow$229(this);
        java.lang.Object initialValue12 = initialValue11;
        long initialValue13 = constructorKey3;
        client.setting.BooleanSetting initialValue14 = initialized10;
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue16 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue17 = recovery$indy$flow$232(initialValue15, initialValue13, initialValue16);
        java.lang.Object initialValue18 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue17))))));
        recovery$indy$flow$234(this, initialValue18);
        client.setting.BooleanSetting initialized19 = new client.setting.BooleanSetting(this, constructorKey6, "ArmorShadow", true);
        recovery$indy$flow$237(this, initialized19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey6, "CustomHotbar", true);
        recovery$indy$flow$240(this, initialized20);
        client.setting.ShaderOptions initialized21 = new client.setting.ShaderOptions(this, constructorKey4);
        java.lang.Object initialValue22 = recovery$indy$flow$243();
        java.lang.Object initialValue23 = initialValue22;
        long initialValue24 = constructorKey5;
        client.setting.ShaderOptions initialValue25 = initialized21;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue28 = recovery$indy$flow$246(initialValue26, initialValue24, initialValue27);
        java.lang.Object initialValue29 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingCustomHotbar));
        java.lang.Object initialValue30 = recovery$indy$flow$248(initialValue29);
        java.lang.Object initialValue31 = recovery$indy$flow$249(initialValue29);
        java.lang.Object initialValue32 = initialValue31;
        long initialValue33 = constructorKey3;
        java.lang.Object initialValue34 = initialValue28;
        java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue36 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue37 = recovery$indy$flow$252(initialValue35, initialValue33, initialValue36);
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue37))))));
        recovery$indy$flow$254(this, initialValue38);
        client.setting.BooleanSetting initialized39 = new client.setting.BooleanSetting(this, constructorKey6, "ItemRectangle", true);
        java.lang.Object initialValue40 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingCustomHotbar));
        java.lang.Object initialValue41 = recovery$indy$flow$258(initialValue40);
        java.lang.Object initialValue42 = recovery$indy$flow$259(initialValue40);
        java.lang.Object initialValue43 = initialValue42;
        long initialValue44 = constructorKey3;
        client.setting.BooleanSetting initialValue45 = initialized39;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue48 = recovery$indy$flow$262(initialValue46, initialValue44, initialValue47);
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue48))))));
        recovery$indy$flow$264(this, initialValue49);
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey6, "SilentSlot", false);
        java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingCustomHotbar));
        java.lang.Object initialValue52 = recovery$indy$flow$268(initialValue51);
        java.lang.Object initialValue53 = recovery$indy$flow$269(initialValue51);
        java.lang.Object initialValue54 = initialValue53;
        long initialValue55 = constructorKey3;
        client.setting.BooleanSetting initialValue56 = initialized50;
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue58 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue59 = recovery$indy$flow$272(initialValue57, initialValue55, initialValue58);
        java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue59))))));
        recovery$indy$flow$274(this, initialValue60);
        client.setting.BooleanSetting initialized61 = new client.setting.BooleanSetting(this, constructorKey6, "DebugInformation", true);
        java.lang.Object initialValue62 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingCustomHotbar));
        java.lang.Object initialValue63 = recovery$indy$flow$278(initialValue62);
        java.lang.Object initialValue64 = recovery$indy$flow$279(initialValue62);
        java.lang.Object initialValue65 = initialValue64;
        long initialValue66 = constructorKey3;
        client.setting.BooleanSetting initialValue67 = initialized61;
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue69 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue70 = recovery$indy$flow$282(initialValue68, initialValue66, initialValue69);
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue70))))));
        recovery$indy$flow$284(this, initialValue71);
        client.setting.BooleanSetting initialized72 = new client.setting.BooleanSetting(this, constructorKey6, "OtherPingCalculation", true);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingDebugInformation));
        java.lang.Object initialValue74 = recovery$indy$flow$288(initialValue73);
        java.lang.Object initialValue75 = recovery$indy$flow$289(initialValue73);
        java.lang.Object initialValue76 = initialValue75;
        long initialValue77 = constructorKey3;
        client.setting.BooleanSetting initialValue78 = initialized72;
        java.lang.Object initialValue79 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue80 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue81 = recovery$indy$flow$292(initialValue79, initialValue77, initialValue80);
        java.lang.Object initialValue82 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue81))))));
        recovery$indy$flow$294(this, initialValue82);
        client.setting.BooleanSetting initialized83 = new client.setting.BooleanSetting(this, constructorKey6, "InventoryItems", false);
        java.lang.Object initialValue84 = ((java.lang.Object)(((augustus.recovered.modules.render.Hotbar_47Hf) (((java.lang.Object)(this)))).settingCustomHotbar));
        java.lang.Object initialValue85 = recovery$indy$flow$298(initialValue84);
        java.lang.Object initialValue86 = recovery$indy$flow$299(initialValue84);
        java.lang.Object initialValue87 = initialValue86;
        long initialValue88 = constructorKey3;
        client.setting.BooleanSetting initialValue89 = initialized83;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue87))))));
        java.lang.Object initialValue92 = recovery$indy$flow$302(initialValue90, initialValue88, initialValue91);
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue92))))));
        recovery$indy$flow$304(this, initialValue93);
        java.util.ArrayList initialized94 = new java.util.ArrayList();
        recovery$indy$flow$307(this, initialized94);
        java.util.ArrayList initialized95 = new java.util.ArrayList();
        recovery$indy$flow$310(this, initialized95);
        recovery$indy$flow$311(this, 0);
        recovery$indy$flow$312(this, 0);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$12(long a0,long a1);
    private static native void recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$226(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$229(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$232(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$237(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$243() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$246(java.lang.Object a0,long a1,java.lang.Object a2);

    private static java.lang.Object recovery$indy$flow$248(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$249(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$252(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$258(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$259(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$262(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$264(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$268(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$269(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$272(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$274(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$278(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$279(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$282(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$284(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$288(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$289(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$292(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$294(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$298(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$299(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$302(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$304(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$307(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$310(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$311(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.Hotbar_47Hf) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$312(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.Hotbar_47Hf) (a0)).field_43y = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$4(Object var0, long var1, long var3);
   private static native void recovery$indy$5(Object var0, long var1, float var3, long var4, long var6);
   private static native void recovery$indy$6(Object var0, long var1, float var3, long var4, long var6);
   private static native int[] recovery$indy$7(long var0, long var2);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native double recovery$indy$9(Object var0, boolean var1, long var2, long var4, long var6);
   private static native Entity recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$13(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$14(Hotbar_47Hf var0, int var1, int var2);
   private static native void recovery$indy$15(boolean var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native void recovery$indy$22(int var0, int var1, int var2, byte var3, int var4, long var5, long var7);
   private static native C_47LS recovery$indy$23(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$24(Object var0, long var1, long var3);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$32(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$33(Hotbar_47Hf var0, float var1, int var2);
   private static native void recovery$indy$34(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$35(Object var0, Object var1, long var2, int var4, int var5, long var6, long var8);
   private static native void recovery$indy$36(Object var0, long var1, Object var3, double var4, double var6, int var8, long var9, long var11);
   private static native C_47Wu recovery$indy$37(Object var0, long var1, long var3);
   private static native C_47Wu recovery$indy$38(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$39(Object var0, long var1, long var3);
   private static native int[] recovery$indy$40(long var0, long var2);
   private static native boolean recovery$indy$41(Object var0, long var1, long var3);
   private static native boolean recovery$indy$42(Object var0, long var1, long var3);
   private static native void recovery$indy$43(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$44(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$46(long var0, long var2);
   private static native MethodHandle recovery$constant$54();
}
