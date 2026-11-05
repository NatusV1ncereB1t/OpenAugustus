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
import client.Client;
import net.C_40X;
import net.C_41Q;
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Il;
import net.C_47K7;
import net.C_47MS;
import client.module.Module;
import net.C_47S6;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47oo;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47vQ;
import net.C_47vk;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ChinaHat_47QQ extends client.module.Module implements client.event.RenderListener,net.C_47MS,net.C_41Q {
    private final client.setting.ModeSetting settingColorMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingColor1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingColor2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRainbowAlpha = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAstolfoAlpha = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHatQualitiy = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRadius = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYOffset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRotationSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRotationOffset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInFirstPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRotateWithPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRotateWithSpoofRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRotateVertical = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileModuleRotation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOutline = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingEnabled = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAlpha = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRedOffset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingGreenOffset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBlueOffset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_49f; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_49E; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_497; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native void b();

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method h(long a0,long a1);

    private static native int e(long a0,long a1);

   public static double[] method_42$f0f47bf5f9(long var0, double var2, double var4, double var6) {
      int[] var29;
      double var9;
      double var11;
      double var13;
      int var28;
      label105: {
         label107: {
            var0 = a ^ var0;
            var9 = 0.0;
            var11 = 0.0;
            int[] var10000 = recovery$indy$1(-7010028399225263378L, var0);
            var13 = 0.0;
            int[] var8 = var10000;
            double var26 = var4;
            double var10001 = 0.0;
            if (var8 == null) {
               label101: {
                  label108: {
                     double var31;
                     var28 = (var31 = var4 - 0.0) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
                     if (var0 > 0L) {
                        if (var28 != 0) {
                           break label108;
                        }

                        var28 = (int)(var6 * 255.0 + 0.5);
                     }

                     var26 = var11 = var13 = var28;
                     if (var0 < 0L) {
                        break label101;
                     }

                     var9 = var26;
                     if (var8 == null) {
                        break label107;
                     }
                  }

                  var26 = var2 - Math.floor(var2);
               }

               var10001 = 6.0;
            }

            double var15 = var26 * var10001;
            double var17 = var15 - Math.floor(var15);
            double var19 = var6 * (1.0 - var4);
            double var21 = var6 * (1.0 - var4 * var17);
            double var23 = var6 * (1.0 - var4 * (1.0 - var17));
            var28 = (int)var15;
            if (var8 != null) {
               break label105;
            }

            label88: {
               label87: {
                  label109: {
                     label110: {
                        label84: {
                           label111: {
                              label82: {
                                 label112: {
                                    switch (var28) {
                                       case 0:
                                          var9 = var6 * 255.0 + 0.5;
                                          var11 = var23 * 255.0 + 0.5;
                                          var13 = var19 * 255.0 + 0.5;
                                          var29 = var8;
                                          if (var0 <= 0L) {
                                             break;
                                          }

                                          if (var8 == null) {
                                             break label107;
                                          }
                                       case 1:
                                          var9 = var21 * 255.0 + 0.5;
                                          var11 = var6 * 255.0 + 0.5;
                                          var13 = var19 * 255.0 + 0.5;
                                          var29 = var8;
                                          break;
                                       case 2:
                                          break label112;
                                       case 3:
                                          break label111;
                                       case 4:
                                          break label110;
                                       case 5:
                                          break label87;
                                       default:
                                          break label107;
                                    }

                                    if (var0 < 0L) {
                                       break label82;
                                    }

                                    if (var29 == null) {
                                       break label107;
                                    }
                                 }

                                 var9 = var19 * 255.0 + 0.5;
                                 var11 = var6 * 255.0 + 0.5;
                                 var13 = var23 * 255.0 + 0.5;
                                 var29 = var8;
                              }

                              if (var0 <= 0L) {
                                 break label84;
                              }

                              if (var29 == null) {
                                 break label107;
                              }
                           }

                           var9 = var19 * 255.0 + 0.5;
                           var11 = var21 * 255.0 + 0.5;
                           var13 = var6 * 255.0 + 0.5;
                           var29 = var8;
                        }

                        if (var0 < 0L) {
                           break label109;
                        }

                        if (var29 == null) {
                           break label107;
                        }
                     }

                     var9 = var23 * 255.0 + 0.5;
                     var11 = var19 * 255.0 + 0.5;
                     var13 = var6 * 255.0 + 0.5;
                     if (var0 < 0L) {
                        break label88;
                     }

                     var29 = var8;
                  }

                  if (var29 == null) {
                     break label107;
                  }
               }

               var9 = var6 * 255.0 + 0.5;
               var11 = var19 * 255.0 + 0.5;
            }

            var13 = var21 * 255.0 + 0.5;
         }

         var28 = 3;
      }

      double[] var30 = new double[var28];
      var30[0] = var9 / 255.0;
      var30[1] = var11 / 255.0;
      var30[2] = var13 / 255.0;
      return var30;
   }





   public void method_42$81a716381c(C_47vk var1, long var2) {
      long var4;
      int[] var6;
      label40: {
         var4 = var2 ^ 60507725611896L;
         var6 = recovery$indy$2(-3661962755364193929L, var2);
         if (recovery$indy$3(field_43, -3662448541276190716L, var2).field_44S == 0) {
            this.field_49E = recovery$indy$4(var1, -3662261842626281450L, var2);
            this.field_49f = recovery$indy$5(var1, -3663490810545170366L, var2);
            if (var2 <= 0L) {
               break label40;
            }

            if (var6 == null) {
               return;
            }
         }

         this.field_49E = new C_47tf(0.0, 0.0, 0.0);
      }

      float var7;
      label32: {
         label31: {
            boolean var10001 = recovery$indy$6(ClientGlobals.field_48.field_44X, var4, -3663571956764918570L, var2);
            if (var6 == null) {
               if (!var10001) {
                  break label31;
               }

               var10001 = recovery$indy$7(ClientGlobals.field_48.field_44X.settingEditEyeHeight, -3661891836684642956L, var2);
            }

            if (var10001) {
               var7 = 0.85F;
               break label32;
            }
         }

         var7 = recovery$indy$8(field_43, -3663391787154049361L, var2).method_41$bc607678b6();
      }

      this.field_49f = var7;
   }



    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public static C_47tf[] method_44$0935f85718(C_47tf var0, C_47tf var1, C_47tf var2, long var3, C_47tf var5, double var6, int var8, int var9) {
      int var37;
      var3 = a ^ var3;
      double var11 = var0.field_40;
      double var13 = var0.field_47;
      double var15 = var1.field_40;
      int[] var10000 = recovery$indy$10(3664309327668348547L, var3);
      double var17 = var1.field_47;
      double var19 = var15 * var15 + var17 * var17;
      double var21 = (var11 * var15 + var13 * var17) / var19;
      int[] var10 = var10000;
      double var23 = var11 * var11 + var13 * var13;
      double var25 = 0.0;
      double var27 = (var6 - var23) / var19 + var21 * var21;
      double var36 = var27;
      double var10001 = 0.0;
      if (var10 == null) {
         if (var27 > 0.0) {
            var25 = Math.sqrt(var27);
         }

         var36 = var25;
         var10001 = var21;
      }

      C_47tf var33;
      C_47tf var34;
      label41: {
         label45: {
            double var29 = var36 - var10001;
            double var31 = -var25 - var21;
            var33 = var0.method_40$8f851fab6c(var1.method_46$90d20bf996(var29));
            var34 = var0.method_40$8f851fab6c(var1.method_46$90d20bf996(var31));
            var37 = var8;
            int[] var39 = var10;
            if (var3 >= 0L) {
               if (var10 == null) {
                  if (var8 == 0) {
                     var33 = var2;
                     var34 = var2;
                     if (var10 == null) {
                        break label45;
                     }
                  }

                  var37 = var8;
               }

               var39 = var10;
            }

            if (var39 != null) {
               break label41;
            }

            if (var37 == var9) {
               var33 = var5;
               var34 = var5;
            }
         }

         var37 = 2;
      }

      C_47tf[] var38 = new C_47tf[var37];
      var38[0] = var33;
      var38[1] = var34;
      return var38;
   }




   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
   }



   public float method_48$72a48262dd(float var1, float var2, float var3, long var4) {
      var4 = a ^ var4;
      int[] var6 = recovery$indy$11(4633402195788297236L, var4);
      float var7 = Math.abs(var2 - var1);
      float var10000 = var7;
      float var10001 = 180.0F;
      if (var6 == null) {
         if (var7 <= 180.0F) {
            return var1 + (var2 - var1) * var3;
         }

         var10000 = var1;
         var10001 = (360.0F - var1 + var2) * var3;
      }

      return var10000 + var10001;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 83141431480142L;
      long var3 = var1 ^ 1992996013958L;
      long var10002 = 179401370209930798L;
      long var5 = var3;
      ModeSetting var7 = this.settingColorMode;
      return var7.method_46$5f9dc63072(var5).equalsIgnoreCase("Astolfo");
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 84062540677464L;
      long var3 = var1 ^ 6844253522320L;
      long var10002 = 894909495963664440L;
      long var5 = var3;
      ModeSetting var7 = this.settingColorMode;
      return var7.method_46$5f9dc63072(var5).equalsIgnoreCase("fade");
   }



   public C_47tf method_43$74e04053c6(C_47tf var1, long var2, C_47tf var4) {
      var2 = a ^ var2;
      double var6 = var4.method_45$3d77d36e13(var1);
      C_47tf var8 = var1.method_46$90d20bf996(var6);
      C_47tf var9 = var4.method_40$8f851fab6c(var8);
      C_47tf var10 = var4.method_45$8f851fab6c(var8);
      int[] var10000 = recovery$indy$12(4326001832189921360L, var2);
      C_47tf var11 = var9;
      int[] var5 = var10000;
      C_47tf var13 = var10;
      if (var5 == null) {
         if (Math.abs(var10.method_45$3d77d36e13(var1)) < Math.abs(var9.method_45$3d77d36e13(var1))) {
            var11 = var10;
         }

         var13 = var11;
      }

      return var13;
   }



   public void onRender3D(long var1, float var3) {
        int[] var121;
        augustus.recovered.modules.render.ChinaHat_47QQ var122;
      long var4;
      int var6;
      int var7;
      int var8;
      long var9;
      long var11;
      long var13;
      long var15;
      int var17;
      int var18;
      int var19;
      long var20;
      long var22;
      long var24;
      int var26;
      int var27;
      int var28;
      long var29;
      long var31;
      int[] var33;
      label243: {
         int var10000;
         var4 = var1 ^ 62198100688279L;
         long var10001 = var1 ^ 123153020977975L;
         var6 = (int)((var1 ^ 123153020977975L) >>> 48);
         var7 = (int)((var1 ^ 123153020977975L) << 16 >>> 48);
         var8 = (int)(var10001 << 32 >>> 32);
         var9 = var1 ^ 124572312253833L;
         var11 = var1 ^ 131360486323543L;
         var13 = var1 ^ 8944581653787L;
         var15 = var1 ^ 138958634525549L;
         var10001 = var1 ^ 88570288194173L;
         var17 = (int)((var1 ^ 88570288194173L) >>> 32);
         var18 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
         var19 = (int)(var10001 << 48 >>> 48);
         var20 = var1 ^ 57482311646357L;
         var22 = var1 ^ 23712977191379L;
         var24 = var1 ^ 8439546287922L;
         var10001 = var1 ^ 36646091584389L;
         var26 = (int)((var1 ^ 36646091584389L) >>> 48);
         var27 = (int)((var1 ^ 36646091584389L) << 16 >>> 32);
         var28 = (int)(var10001 << 48 >>> 48);
         var29 = var1 ^ 86635958658660L;
         var31 = var1 ^ 39330560675584L;
         var33 = (int[])recovery$indy$flow$61(8135261042800706751L, var1);
         var10000 = ((int) (recovery$indy$flow$63(this.settingInFirstPerson, 8135190124489730236L, var1) ? 1 : 0));
         label239:
         if (var33 == null) {
            if (var10000 == 0) {
               var10000 = ((net.C_47oo)recovery$indy$flow$65(field_43, 8134634397017994700L, var1)).field_44S;
               if (var33 != null) {
                  break label239;
               }

               if (var10000 == 0) {
                  return;
               }
            }

            org.lwjgl.opengl.GL11.glPushMatrix();
            org.lwjgl.opengl.GL11.glEnable(3042);
            org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
            org.lwjgl.opengl.GL11.glEnable(2848);
            org.lwjgl.opengl.GL11.glDisable(3553);
            org.lwjgl.opengl.GL11.glDisable(3008);
            if (var33 != null) {
               break label243;
            }

            var10000 = ((int) (net.C_47vQ.method_48$aae029aa0a() ? 1 : 0));
         }

         if (var10000 != 0) {
            net.C_47Il.method_498$da8c82d5d4();
         }

         net.minecraft.client.renderer.GlStateManager.method_42m$da8c82d5d4();
         net.minecraft.client.renderer.GlStateManager.method_41$da8c82d5d4();
      }

      net.C_47tf var34;
      int var36;
      double var37;
      double var39;
      double var41;
      double var43;
      double var45;
      double var47;
      double var49;
      double var51;
      double var53;
      double var55;
      float var57;
      float var58;
      float var59;
      boolean var117;
      var34 = this.field_49E
         .method_47$a365857470(
            0.0,
            ((net.C_47oo)recovery$indy$flow$79(field_43, 8134634397017994700L, var1)).field_44S == 0
               ? 0.5
               : 0.7 + recovery$indy$flow$82(this.settingYOffset, var20, 8135741016772892390L, var1),
            0.0
         );
      boolean var35 = recovery$indy$flow$85(this.settingRotateWithPlayer, 8135190124489730236L, var1);
      var36 = (int)recovery$indy$flow$87(this.settingHatQualitiy, var20, 8135741016772892390L, var1) / 2;
      var37 = recovery$indy$flow$89(this.settingRadius, var20, 8135741016772892390L, var1);
      var39 = recovery$indy$flow$91(this.settingHeight, var20, 8135741016772892390L, var1);
      recovery$indy$flow$93(this.settingColor1, var17, (short)var18, (char)var19, 0, 8134612709897166632L, var1);
      recovery$indy$flow$95(this.settingColor2, var17, (short)var18, (char)var19, 0, 8134612709897166632L, var1);
      var41 = recovery$indy$flow$97(this.settingColor1, var9, 8134413090155810523L, var1) / 255.0;
      var43 = recovery$indy$flow$99(this.settingColor1, var24, 8134225132515965910L, var1) / 255.0;
      var45 = recovery$indy$flow$101(this.settingColor1, var11, 8134970957834937223L, var1) / 255.0;
      var47 = recovery$indy$flow$103(this.settingColor1, (short)var26, var27, var28, 8134057229314251382L, var1) / 255.0;
      var49 = recovery$indy$flow$105(this.settingColor2, var9, 8134413090155810523L, var1) / 255.0;
      var51 = recovery$indy$flow$107(this.settingColor2, var24, 8134225132515965910L, var1) / 255.0;
      var53 = recovery$indy$flow$109(this.settingColor2, var11, 8134970957834937223L, var1) / 255.0;
      var55 = recovery$indy$flow$111(this.settingColor2, (short)var26, var27, var28, 8134057229314251382L, var1) / 255.0;
      var57 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$113(field_43, 8133883567804697447L, var1)).field_48h;
      var58 = var35 ? ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$116(field_43, 8133883567804697447L, var1)).field_48z : 0.0F;
      var59 = (float)(
         recovery$indy$flow$123(
               this,
               this.field_497,
               this.field_46,
               ((net.C_40X)recovery$indy$flow$121(field_43, 8135117541898471013L, var1)).field_49,
               var4,
               8135453539959334557L,
               var1
            )
            + recovery$indy$flow$125(this.settingRotationOffset, var20, 8135741016772892390L, var1)
      );
      var117 = this.field_43a;
      label228:
      if (var33 == null) {
         if (this.field_43a) {
            var117 = var35;
            if (var33 != null) {
               break label228;
            }

            if (var35) {
               var117 = recovery$indy$flow$128(this.settingRotateWithSpoofRotations, 8135190124489730236L, var1);
               if (var33 != null) {
                  break label228;
               }

               if (var117) {
                  var57 = recovery$indy$flow$138(
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$130(field_43, 8133883567804697447L, var1)).field_47k,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$133(field_43, 8133883567804697447L, var1)).field_43m,
                     ((net.C_40X)recovery$indy$flow$136(field_43, 8135117541898471013L, var1)).field_49,
                     8135131156543715757L,
                     var1
                  );
                  var58 = recovery$indy$flow$148(
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$140(field_43, 8133883567804697447L, var1)).field_43B,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$143(field_43, 8133883567804697447L, var1)).field_47J,
                     ((net.C_40X)recovery$indy$flow$146(field_43, 8135117541898471013L, var1)).field_49,
                     8135131156543715757L,
                     var1
                  );
               }
            }
         }

         var117 = var35;
      }

      if (var117) {
         var59 += var57;
      }

      double var60;
      net.C_47tf var62;
      net.C_47tf var63;
      net.C_47tf var64;
      net.C_47tf var66;
      net.C_47tf var67;
      net.C_47tf var68;
      double var69;
      label245: {
         var60 = var57 / 180.0 * Math.PI;
         var62 = ((net.C_47tf)recovery$indy$flow$149(0.0F, var57, 8134488699827934475L, var1)).method_46$90d20bf996(var37);
         var63 = var62.method_46$90d20bf996(-1.0);
         var64 = new net.C_47tf(0.0, 1.0, 0.0);
         net.C_47tf var65 = var63.method_45$8f851fab6c(var62);
         var66 = var64.method_46$8f851fab6c(var65).method_47$b2124a4855();
         var67 = var62.method_40$8f851fab6c(var34);
         var68 = var67;
         var69 = var37 * var37;
         org.lwjgl.opengl.GL11.glTranslated(
            0.0,
            this.field_49f
               - (((net.C_47oo)recovery$indy$flow$160(field_43, 8134634397017994700L, var1)).field_44S == 0 ? 0.0 : 0.2)
               + (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$163(field_43, 8133883567804697447L, var1)).method_48g$aae029aa0a() ? -0.1 : 0.0),
            0.0
         );
         var117 = recovery$indy$flow$167(this.settingRotateVertical, 8135190124489730236L, var1);
         int[] var126 = var33;
         if (var1 > 0L) {
            if (var33 == null) {
               if (!var117) {
                  break label245;
               }

               var117 = recovery$indy$flow$169(this.settingOnlyWhileModuleRotation, 8135190124489730236L, var1);
            }

            var126 = var33;
         }

         label246: {
            if (var1 > 0L) {
               if (var126 == null) {
                  if (!var117) {
                     break label246;
                  }

                  var117 = recovery$indy$flow$171(client.ClientGlobals.field_46, var29, 8133833470330106827L, var1);
               }

               var126 = var33;
            }

            if (var126 == null) {
               if (var117) {
                  break label245;
               }

               var117 = recovery$indy$flow$173(this.settingRotateWithSpoofRotations, 8135190124489730236L, var1);
            }

            if (!var117) {
               break label245;
            }
         }

         org.lwjgl.opengl.GL11.glRotated(-var58, var66.field_40, 0.0, var66.field_47);
      }

      net.C_47tf var71 = ((net.C_47tf)recovery$indy$flow$177(0.0F, var59, 8134488699827934475L, var1)).method_46$90d20bf996(var37);
      net.C_47tf var72 = var71.method_46$90d20bf996(-1.0);
      net.C_47tf var73 = var72.method_45$8f851fab6c(var71);
      net.C_47tf var74 = var73.method_46$8f851fab6c(var64).method_47$b2124a4855();
      net.C_47tf[] var75 = new net.C_47tf[var36 * 2 + 2];
      float[][] var76 = new float[var75.length][];
      byte var77 = ((byte) (((String)recovery$indy$flow$186(this.settingColorMode, var13, 8133594844726148275L, var1))
         .equalsIgnoreCase((String)recovery$indy$flow$187(30486, 3661256291855261323L ^ var1)) ? 1 : 0));
      byte var78 = ((byte) (((String)recovery$indy$flow$190(this.settingColorMode, var13, 8133594844726148275L, var1))
         .equalsIgnoreCase((String)recovery$indy$flow$191(29956, 1856021961665764492L ^ var1)) ? 1 : 0));
      float var79 = net.C_47sk.method_46$ef9a6720f7(
         (float)recovery$indy$flow$194(this.settingRainbowAlpha, var20, 8135741016772892390L, var1) / 255.0F, 0.01F, 1.0F
      );
      float var80 = net.C_47sk.method_46$ef9a6720f7(
         (float)recovery$indy$flow$197(this.settingAstolfoAlpha, var20, 8135741016772892390L, var1) / 255.0F, 0.01F, 1.0F
      );
      int var81 = 0;

      label192: {
         label247: {
            label248: {
               int[] var127;
               label189: {
                  while (true) {
                     if (var81 <= var36) {
                        double var82 = (double)var81 / var36;
                        net.C_47tf var84 = new net.C_47tf(Math.cos((var82 + 0.5) * Math.PI + var60), 0.0, Math.sin((var82 + 0.5) * Math.PI + var60))
                           .method_46$90d20bf996(var37);
                        net.C_47tf var85 = (net.C_47tf)recovery$indy$flow$204(this, var66, var22, var84, 8134286357083113917L, var1);
                        net.C_47tf[] var86 = (net.C_47tf[])recovery$indy$flow$205(var85, var66, var62, var31, var63, var69, var81, var36, 8134892276884159733L, var1);
                        net.C_47tf var87 = var86[0];
                        net.C_47tf var88 = var86[1];
                        net.C_47tf var89 = (net.C_47tf)recovery$indy$flow$206(this, var74, var22, var87, 8134286357083113917L, var1);
                        net.C_47tf var90 = (net.C_47tf)recovery$indy$flow$207(this, var74, var22, var88, 8134286357083113917L, var1);
                        double var91 = var89.method_45$8f851fab6c(var71).method_49$fedcb3e4d3() / var37 / 2.0;
                        double var93 = var90.method_45$8f851fab6c(var71).method_49$fedcb3e4d3() / var37 / 2.0;
                        double var95 = net.C_47sk.method_48$294c1e5b96(var59) + 180.0;
                        var75[var81] = var87;
                        var75[var36 * 2 + 1 - var81] = var88;
                        var87 = var87.method_40$8f851fab6c(var34);
                        var88 = var88.method_40$8f851fab6c(var34);
                        var117 = ((((int) (var77)) & 1) != 0);
                        var127 = var33;
                        if (var1 < 0L) {
                           break label189;
                        }

                        if (var33 != null) {
                           break;
                        }

                        label183: {
                           label251: {
                              if (var33 == null) {
                                 if (var77 != 0) {
                                    double var97 = (Math.atan2(var87.field_47, var87.field_40) / Math.PI * 180.0 + 180.0 - var95) % 360.0 / 360.0;
                                    double[] var99 = (double[])recovery$indy$flow$218(var15, var97, 1.0, 1.0, 8134121658275922752L, var1);
                                    net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b((float)var99[0], (float)var99[1], (float)var99[2], var79);
                                    if (var1 < 0L) {
                                       break label183;
                                    }

                                    if (var33 == null) {
                                       break label251;
                                    }
                                 }

                                 var117 = ((((int) (var78)) & 1) != 0);
                              }

                              if (((int) (var117 ? 1 : 0)) != 0) {
                                 double var111 = net.C_47sk.method_48$294c1e5b96(Math.atan2(var87.field_47, var87.field_40) / Math.PI * 180.0 + 180.0 - var95)
                                    + 180.0;
                                 int[] var114 = (int[])recovery$indy$flow$224(var111, (char)var6, (short)var7, var8, 8135396944542720695L, var1);
                                 net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(var114[0] / 255.0F, var114[1] / 255.0F, var114[2] / 255.0F, var80);
                                 if (var1 < 0L) {
                                    break label183;
                                 }

                                 if (var33 == null) {
                                    break label251;
                                 }
                              }

                              net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(
                                 recovery$indy$flow$226(var41, var49, var91, 8133679812070968236L, var1),
                                 recovery$indy$flow$227(var43, var51, var91, 8133679812070968236L, var1),
                                 recovery$indy$flow$228(var45, var53, var91, 8133679812070968236L, var1),
                                 recovery$indy$flow$229(var47, var55, var91, 8133679812070968236L, var1)
                              );
                           }

                           var76[var81] = new float[]{
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_47,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_46,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_45,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_42
                           };
                           org.lwjgl.opengl.GL11.glBegin(5);
                           org.lwjgl.opengl.GL11.glVertex3d(var67.field_40, var67.field_41 - var39, var67.field_47);
                           org.lwjgl.opengl.GL11.glVertex3d(var34.field_40, var34.field_41, var34.field_47);
                           org.lwjgl.opengl.GL11.glVertex3d(var87.field_40, var87.field_41 - var39, var87.field_47);
                           org.lwjgl.opengl.GL11.glEnd();
                        }

                        label166: {
                           label252: {
                              var117 = ((((int) (var77)) & 1) != 0);
                              if (var33 == null) {
                                 if (var77 != 0) {
                                    double var112 = (Math.atan2(var88.field_47, var88.field_40) / Math.PI * 180.0 + 180.0 - var95) % 360.0 / 360.0;
                                    double[] var115 = (double[])recovery$indy$flow$256(var15, var112, 1.0, 1.0, 8134121658275922752L, var1);
                                    net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b((float)var115[0], (float)var115[1], (float)var115[2], var79);
                                    var121 = var33;
                                    if (var1 < 0L) {
                                       break label166;
                                    }

                                    if (var33 == null) {
                                       break label252;
                                    }
                                 }

                                 var117 = ((((int) (var78)) & 1) != 0);
                              }

                              if (((int) (var117 ? 1 : 0)) != 0) {
                                 double var113 = net.C_47sk.method_48$294c1e5b96(Math.atan2(var88.field_47, var88.field_40) / Math.PI * 180.0 + 180.0 - var95)
                                    + 180.0;
                                 int[] var116 = (int[])recovery$indy$flow$262(var113, (char)var6, (short)var7, var8, 8135396944542720695L, var1);
                                 net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(var116[0] / 255.0F, var116[1] / 255.0F, var116[2] / 255.0F, var80);
                                 var121 = var33;
                                 if (var1 <= 0L) {
                                    break label166;
                                 }

                                 if (var33 == null) {
                                    break label252;
                                 }
                              }

                              net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(
                                 recovery$indy$flow$264(var41, var49, var93, 8133679812070968236L, var1),
                                 recovery$indy$flow$265(var43, var51, var93, 8133679812070968236L, var1),
                                 recovery$indy$flow$266(var45, var53, var93, 8133679812070968236L, var1),
                                 recovery$indy$flow$267(var47, var55, var93, 8133679812070968236L, var1)
                              );
                           }

                           var76[var36 * 2 + 1 - var81] = new float[]{
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_47,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_46,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_45,
                              net.minecraft.client.renderer.GlStateManager.field_49K.field_42
                           };
                           org.lwjgl.opengl.GL11.glBegin(5);
                           org.lwjgl.opengl.GL11.glVertex3d(var68.field_40, var68.field_41 - var39, var68.field_47);
                           org.lwjgl.opengl.GL11.glVertex3d(var34.field_40, var34.field_41, var34.field_47);
                           org.lwjgl.opengl.GL11.glVertex3d(var88.field_40, var88.field_41 - var39, var88.field_47);
                           org.lwjgl.opengl.GL11.glEnd();
                           var67 = var87;
                           var68 = var88;
                           var81++;
                           var121 = var33;
                        }

                        if (var121 == null) {
                           continue;
                        }
                     }

                     var122 = this;
                     if (var1 < 0L) {
                        break label248;
                     }

                     var117 = recovery$indy$flow$292(this.settingEnabled, 8135190124489730236L, var1);
                     break;
                  }

                  var127 = var33;
               }

               if (var127 != null) {
                  break label192;
               }

               if (((int) (var117 ? 1 : 0)) == 0) {
                  break label247;
               }

               org.lwjgl.opengl.GL11.glDepthMask(false);
               org.lwjgl.opengl.GL11.glEnable(2848);
               var122 = this;
            }

            float var100 = (float)recovery$indy$flow$296(var122.settingRedOffset, var20, 8135741016772892390L, var1) / 255.0F;
            float var101 = (float)recovery$indy$flow$298(this.settingGreenOffset, var20, 8135741016772892390L, var1) / 255.0F;
            float var83 = (float)recovery$indy$flow$300(this.settingBlueOffset, var20, 8135741016772892390L, var1) / 255.0F;
            float var102 = net.C_47sk.method_46$ef9a6720f7(
               (float)recovery$indy$flow$302(this.settingAlpha, var20, 8135741016772892390L, var1) / 255.0F, 0.01F, 1.0F
            );
            org.lwjgl.opengl.GL11.glLineWidth((float)net.C_47sk.method_45$4b58f7ab41(recovery$indy$flow$305(this.settingLineWidth, var20, 8135741016772892390L, var1), 0.01, 10.0));
            org.lwjgl.opengl.GL11.glBegin(3);
            int var103 = 0;

            label136: {
               while (var103 < var75.length) {
                  net.C_47tf var104 = var75[var103].method_46$90d20bf996(1.0001);
                  float[] var106 = var76[var103];
                  float var108 = net.C_47sk.method_46$ef9a6720f7(var106[0] + var100, 0.0F, 1.0F);
                  float var109 = net.C_47sk.method_46$ef9a6720f7(var106[1] + var101, 0.0F, 1.0F);
                  float var110 = net.C_47sk.method_46$ef9a6720f7(var106[2] + var83, 0.0F, 1.0F);
                  net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(var108, var109, var110, var102);
                  org.lwjgl.opengl.GL11.glVertex3d(var104.field_40 + var34.field_40, var104.field_41 + var34.field_41 - var39 + 0.001, var104.field_47 + var34.field_47);
                  var103++;
                  int[] var123 = var33;
                  if (var1 >= 0L) {
                     if (var33 != null) {
                        break label136;
                     }

                     var123 = var33;
                  }

                  if (var123 != null) {
                     break;
                  }
               }

               if (var1 > 0L) {
                  org.lwjgl.opengl.GL11.glEnd();
               }
            }

            org.lwjgl.opengl.GL11.glDepthMask(true);
         }

         client.render.RenderUtils.method_43$da8c82d5d4();
         org.lwjgl.opengl.GL11.glEnable(3008);
         var117 = ((((int) (-1)) & 1) != 0);
      }

      client.render.RenderUtils.method_43$d00df7729d((var117 ? 1 : 0));
      org.lwjgl.opengl.GL11.glPopMatrix();
   }














   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$82(this, 32, var5, -7101841722046913447L, var1);
      recovery$indy$83(this, 18, var5, -7101841722046913447L, var1);
      recovery$indy$84(this, 24, 100000, var3, -7102138713878672024L, var1);
   }



   private boolean method_43p$aae029aa0a() {
      long var1 = a ^ 85847871508101L;
      long var3 = var1 ^ 4783977940557L;
      long var10002 = -8955872876694908955L;
      long var5 = var3;
      ModeSetting var7 = this.settingColorMode;
      return var7.method_46$5f9dc63072(var5).equalsIgnoreCase("Rainbow");
   }



   private boolean method_43F$aae029aa0a() {
      long var1 = a ^ 90756318751759L;
      long var3 = var1 ^ 27243020510407L;
      long var10002 = -6828506452457788049L;
      long var5 = var3;
      ModeSetting var7 = this.settingColorMode;
      return var7.method_46$5f9dc63072(var5).equalsIgnoreCase("fade");
   }



   public void method_44g$e45a9973e5(long var1) {
      long var3 = var1 ^ 26898953324003L;
      long var5 = var1 ^ 108829165526802L;
      int[] var7 = recovery$indy$85(-8534201577534177847L, var1);
      boolean var10001 = recovery$indy$88(
         recovery$indy$87(recovery$indy$86(-8533630871368590206L, var1), -8533862733191332405L, var1), var5, -8532348482118251843L, var1
      );
      if (var7 == null) {
         var10001 = !var10001;
      }

      this.field_43a = var10001;
      this.field_497 = this.field_46;
      if (var1 >= 0L) {
         ChinaHat_47QQ var10000 = this;
         if (var7 == null) {
            if (recovery$indy$89(this.settingRotationSpeed, var3, -8533800774783193200L, var1) == 0.0) {
               this.field_46 = 0.0F;
            }

            var10000 = this;
         }

         var10000.field_46 = (float)((this.field_46 + recovery$indy$90(this.settingRotationSpeed, var3, -8533800774783193200L, var1) / 20.0) % 360.0);
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ChinaHat_47QQ(char a0,int a1,char a2) {
        super((java.lang.String) ("ChinaHat"),(java.lang.String) ("ChinaHut"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 130572668455884L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (139))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a);
        int constructorPart2 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 125104002148646L) >>> 48));
        int constructorPart3 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 125104002148646L) << 16) >>> 48));
        int constructorPart4 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 125104002148646L) << 32) >>> 32));
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 15617825997546L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 67573809789697L);
        long constructorKey7 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 124634312068701L);
        long constructorKey8 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 8683654453207L);
        long constructorKey9 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 109356405577714L);
        long constructorKey10 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 46995020425296L);
        long constructorKey11 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.ChinaHat_47QQ.a) ^ 52997788595046L);
        java.lang.Object initialValue12 = recovery$indy$flow$355(3);
        ((java.lang.Object[]) initialValue12)[0] = "Fade";
        ((java.lang.Object[]) initialValue12)[1] = "Rainbow";
        ((java.lang.Object[]) initialValue12)[2] = "Astolfo";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "ColorMode", constructorKey6, "Fade", (java.lang.String[]) (initialValue12));
        recovery$indy$flow$357(this, initialized13);
        java.awt.Color initialized14 = new java.awt.Color(255, 0, 0);
        client.setting.ColorSetting initialized15 = new client.setting.ColorSetting(constructorKey9, this, "Color1", initialized14);
        java.lang.Object initialValue16 = recovery$indy$flow$362(this);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey5;
        client.setting.ColorSetting initialValue19 = initialized15;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$365(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$367(this, initialValue23);
        java.awt.Color initialized24 = new java.awt.Color(0, 0, 255);
        client.setting.ColorSetting initialized25 = new client.setting.ColorSetting(constructorKey9, this, "Color2", initialized24);
        java.lang.Object initialValue26 = recovery$indy$flow$372(this);
        java.lang.Object initialValue27 = initialValue26;
        long initialValue28 = constructorKey5;
        client.setting.ColorSetting initialValue29 = initialized25;
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue32 = recovery$indy$flow$375(initialValue30, initialValue28, initialValue31);
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue32))))));
        recovery$indy$flow$377(this, initialValue33);
        client.setting.NumberSetting initialized34 = new client.setting.NumberSetting(this, "Rainbow Alpha", Double.longBitsToDouble(4640185359819341824L), constructorKey10, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4643176031446892544L), 2);
        java.lang.Object initialValue35 = recovery$indy$flow$380(this);
        java.lang.Object initialValue36 = initialValue35;
        client.setting.NumberSetting initialValue37 = initialized34;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue40 = recovery$indy$flow$383(initialValue38, initialValue39);
        recovery$indy$flow$384(this, initialValue40);
        client.setting.NumberSetting initialized41 = new client.setting.NumberSetting(this, "Astolfo Alpha", Double.longBitsToDouble(4640185359819341824L), constructorKey10, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4643176031446892544L), 2);
        java.lang.Object initialValue42 = recovery$indy$flow$387(this);
        java.lang.Object initialValue43 = initialValue42;
        client.setting.NumberSetting initialValue44 = initialized41;
        java.lang.Object initialValue45 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue46 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue47 = recovery$indy$flow$390(initialValue45, initialValue46);
        recovery$indy$flow$391(this, initialValue47);
        client.setting.NumberSetting initialized48 = new client.setting.NumberSetting(this, "HatQualitiy", Double.longBitsToDouble(4636737291354636288L), constructorKey10, Double.longBitsToDouble(4620693217682128896L), Double.longBitsToDouble(4643985272004935680L), 0);
        recovery$indy$flow$394(this, initialized48);
        client.setting.NumberSetting initialized49 = new client.setting.NumberSetting(this, "Radius", Double.longBitsToDouble(4604029899060858061L), constructorKey10, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621819117588971520L), 3);
        recovery$indy$flow$397(this, initialized49);
        client.setting.NumberSetting initialized50 = new client.setting.NumberSetting(this, "Height", Double.longBitsToDouble(4598175219545276416L), constructorKey10, Double.longBitsToDouble(4591870180066957722L), 1.0D, 3);
        recovery$indy$flow$400(this, initialized50);
        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting(this, "Y Offset", 0.0D, constructorKey10, Double.longBitsToDouble(-4631501856787818086L), 1.0D, 3);
        recovery$indy$flow$403(this, initialized51);
        client.setting.NumberSetting initialized52 = new client.setting.NumberSetting(this, "RotationSpeed", 1.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4645040803167600640L), 0);
        recovery$indy$flow$406(this, initialized52);
        client.setting.NumberSetting initialized53 = new client.setting.NumberSetting(this, "RotationOffset", 1.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4645040803167600640L), 0);
        recovery$indy$flow$409(this, initialized53);
        client.setting.BooleanSetting initialized54 = new client.setting.BooleanSetting(this, constructorKey8, "InFirstPerson", true);
        recovery$indy$flow$412(this, initialized54);
        client.setting.BooleanSetting initialized55 = new client.setting.BooleanSetting(this, constructorKey8, "Rotate with player", true);
        recovery$indy$flow$415(this, initialized55);
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, constructorKey8, "Rotate with spoof rotations", true);
        java.lang.Object initialValue57 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingRotateWithPlayer));
        java.lang.Object initialValue58 = recovery$indy$flow$419(initialValue57);
        java.lang.Object initialValue59 = recovery$indy$flow$420(initialValue57);
        java.lang.Object initialValue60 = initialValue59;
        long initialValue61 = constructorKey5;
        client.setting.BooleanSetting initialValue62 = initialized56;
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue64 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue65 = recovery$indy$flow$423(initialValue63, initialValue61, initialValue64);
        java.lang.Object initialValue66 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue65))))));
        recovery$indy$flow$425(this, initialValue66);
        client.setting.BooleanSetting initialized67 = new client.setting.BooleanSetting(this, constructorKey8, "Rotate vertical", false);
        java.lang.Object initialValue68 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingRotateWithPlayer));
        java.lang.Object initialValue69 = recovery$indy$flow$429(initialValue68);
        java.lang.Object initialValue70 = recovery$indy$flow$430(initialValue68);
        java.lang.Object initialValue71 = initialValue70;
        long initialValue72 = constructorKey5;
        client.setting.BooleanSetting initialValue73 = initialized67;
        java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue75 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue76 = recovery$indy$flow$433(initialValue74, initialValue72, initialValue75);
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue76))))));
        recovery$indy$flow$435(this, initialValue77);
        client.setting.BooleanSetting initialized78 = new client.setting.BooleanSetting(this, constructorKey8, "Only while module rotation", true);
        java.lang.Object initialValue79 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingRotateVertical));
        java.lang.Object initialValue80 = recovery$indy$flow$439(initialValue79);
        java.lang.Object initialValue81 = recovery$indy$flow$440(initialValue79);
        java.lang.Object initialValue82 = initialValue81;
        long initialValue83 = constructorKey5;
        client.setting.BooleanSetting initialValue84 = initialized78;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue84))))));
        java.lang.Object initialValue86 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue87 = recovery$indy$flow$443(initialValue85, initialValue83, initialValue86);
        java.lang.Object initialValue88 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue87))))));
        recovery$indy$flow$445(this, initialValue88);
        client.setting.SettingGroup initialized89 = new client.setting.SettingGroup(this, "Outline", false, constructorKey7);
        recovery$indy$flow$448(this, initialized89);
        short converted90 = (short) (constructorPart2);
        char converted91 = (char) (constructorPart3);
        java.lang.Object initialValue92 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.BooleanSetting initialized93 = new client.setting.BooleanSetting(this, "Enabled", converted90, converted91, constructorPart4, true, (client.setting.SettingGroup) (initialValue92));
        recovery$indy$flow$452(this, initialized93);
        java.lang.Object initialValue94 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.NumberSetting initialized95 = new client.setting.NumberSetting(this, "Line-width", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble(4616189618054758400L), 2, (client.setting.SettingGroup) (initialValue94), constructorKey11);
        recovery$indy$flow$456(this, initialized95);
        java.lang.Object initialValue96 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.NumberSetting initialized97 = new client.setting.NumberSetting(this, "Alpha", Double.longBitsToDouble(4643176031446892544L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4643176031446892544L), 2, (client.setting.SettingGroup) (initialValue96), constructorKey11);
        recovery$indy$flow$460(this, initialized97);
        java.lang.Object initialValue98 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.NumberSetting initialized99 = new client.setting.NumberSetting(this, "Red offset", Double.longBitsToDouble(-4595641944754880512L), Double.longBitsToDouble(-4580196005407883264L), Double.longBitsToDouble(4643176031446892544L), 1, (client.setting.SettingGroup) (initialValue98), constructorKey11);
        recovery$indy$flow$464(this, initialized99);
        java.lang.Object initialValue100 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.NumberSetting initialized101 = new client.setting.NumberSetting(this, "Green offset", Double.longBitsToDouble(-4595641944754880512L), Double.longBitsToDouble(-4580196005407883264L), Double.longBitsToDouble(4643176031446892544L), 1, (client.setting.SettingGroup) (initialValue100), constructorKey11);
        recovery$indy$flow$468(this, initialized101);
        java.lang.Object initialValue102 = ((java.lang.Object)(((augustus.recovered.modules.render.ChinaHat_47QQ) (((java.lang.Object)(this)))).settingOutline));
        client.setting.NumberSetting initialized103 = new client.setting.NumberSetting(this, "Blue offset", Double.longBitsToDouble(-4595641944754880512L), Double.longBitsToDouble(-4580196005407883264L), Double.longBitsToDouble(4643176031446892544L), 1, (client.setting.SettingGroup) (initialValue102), constructorKey11);
        recovery$indy$flow$472(this, initialized103);
    }







    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static native java.lang.Object recovery$indy$flow$61(long a0,long a1);
    private static native boolean recovery$indy$flow$63(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$65(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$82(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$87(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$89(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$91(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$93(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native int recovery$indy$flow$95(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native int recovery$indy$flow$97(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$99(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$101(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$103(java.lang.Object a0,short a1,int a2,int a3,long a4,long a5);
    private static native int recovery$indy$flow$105(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$107(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$109(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$111(java.lang.Object a0,short a1,int a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$113(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$116(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$123(java.lang.Object a0,float a1,float a2,float a3,long a4,long a5,long a6);
    private static native double recovery$indy$flow$125(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$128(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$130(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$133(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$136(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$138(float a0,float a1,float a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$140(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$143(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$148(float a0,float a1,float a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$149(float a0,float a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$163(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$167(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$169(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$171(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$173(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$177(float a0,float a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$186(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$187(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$190(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$191(int a0,long a1);
    private static native double recovery$indy$flow$194(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$197(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$204(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$205(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,java.lang.Object a4,double a5,int a6,int a7,long a8,long a9);
    private static native java.lang.Object recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$207(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$218(long a0,double a1,double a2,double a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$224(double a0,char a1,short a2,int a3,long a4,long a5);
    private static native float recovery$indy$flow$226(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$227(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$228(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$229(double a0,double a1,double a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$256(long a0,double a1,double a2,double a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$262(double a0,char a1,short a2,int a3,long a4,long a5);
    private static native float recovery$indy$flow$264(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$265(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$266(double a0,double a1,double a2,long a3,long a4);
    private static native float recovery$indy$flow$267(double a0,double a1,double a2,long a3,long a4);
    private static native boolean recovery$indy$flow$292(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$296(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$298(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$300(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$302(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$305(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$355(int a0);
    private static native void recovery$indy$flow$357(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$362(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$365(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$367(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$372(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$375(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$377(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$380(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$383(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$384(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$387(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$390(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$391(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$394(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$397(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$400(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$406(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$409(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$412(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$415(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$419(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$420(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$423(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$425(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$429(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$430(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$433(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$435(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$439(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$440(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$443(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$445(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$448(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$452(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$456(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$460(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$464(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$468(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$472(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native C_47oo recovery$indy$3(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$4(Object var0, long var1, long var3);
   private static native float recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$9();
   private static native int[] recovery$indy$10(long var0, long var2);
   private static native int[] recovery$indy$11(long var0, long var2);
   private static native int[] recovery$indy$12(long var0, long var2);
   private static native void recovery$indy$82(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$84(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native int[] recovery$indy$85(long var0, long var2);
   private static native Client recovery$indy$86(long var0, long var2);
   private static native C_47S6 recovery$indy$87(Object var0, long var1, long var3);
   private static native boolean recovery$indy$88(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$89(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$90(Object var0, long var1, long var3, long var5);
}
