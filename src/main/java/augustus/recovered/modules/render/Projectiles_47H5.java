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
import net.C_41l;
import client.render.RenderPass;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47B5;
import net.C_47B6;
import net.C_47B7;
import net.C_47BO;
import net.C_47BW;
import net.C_47BX;
import net.C_47BZ;
import net.C_47Bn;
import net.C_47Fw;
import net.C_47G3;
import net.C_47Gj;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_49h;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Projectiles_47H5 extends client.module.Module implements client.event.RenderListener,net.C_47xz {
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCalculateColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingItems = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_45$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 8682283050850L;
      long var5 = var1 ^ 79095704126794L;
      long var7 = var1 ^ 40562434198197L;
      long var9 = var1 ^ 119301982057112L;
      long var11 = var1 ^ 13040575455915L;
      long var10001 = var1 ^ 21540476954305L;
      int var13 = (int)((var1 ^ 21540476954305L) >>> 32);
      int var14 = (int)((var1 ^ 21540476954305L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      int[] var16 = recovery$indy$1(-7756337737025222223L, var1);
      int var17 = 0;

      while (var17 < this.field_43h.size()) {
         label41: {
            ArrayList var18 = (ArrayList)this.field_43h.get(var17);
            int var10000 = var18.size();
            if (var16 == null) {
               if (var10000 <= 1) {
                  break label41;
               }

               var10000 = recovery$indy$2(this.settingColor, var13, (short)var14, (char)var15, 0, -7756622101570818984L, var1);
            }

            int var19 = var10000;
            var10000 = (int) ((recovery$indy$3(this.settingCalculateColor, -7756478964797598312L, var1)) ? 1 : 0);
            if (var16 == null) {
               if (var10000 != 0) {
                  C_47tf var20 = (C_47tf)var18.get(1);
                  double var21 = Math.min(
                        Math.max(
                           recovery$indy$4(field_43, -7757282189933931472L, var1).method_49$4b58f7ab41(var20.field_40, var20.field_41, var20.field_47), 6.0
                        ),
                        36.0
                     )
                     - 6.0;
                  float[] var23 = recovery$indy$5(var19, var7, -7757043698015657226L, var1);
                  var19 = Color.HSBtoRGB((float)(0.011415525F * var21), var23[1], var23[2]);
               }

               GlStateManager.method_44$42cf812248(770, 771, 1, 0);
               recovery$indy$8(
                  recovery$indy$6(this.field_46, var3, -7757170582030101163L, var1),
                  recovery$indy$7(this.field_46, var9, -7756695399630907291L, var1),
                  var5,
                  -7756396445043220643L,
                  var1
               );
               var10000 = var19;
            }

            int var25 = var10000;
            recovery$indy$10(false, var11, recovery$indy$9(this, var25, var18), -7755683536271682582L, var1);
         }

         var17++;
         if (var16 != null) {
            break;
         }
      }
   }




   private void method_47$0dcce777ab(int var1, ArrayList var2, RenderPass var3) {
      long var4 = a ^ 138069331591701L;
      long var6 = var4 ^ 107421202478926L;
      long var8 = var4 ^ 64219174074734L;
      ShaderOptions var10000 = this.field_46;
      long var10005 = 6126481692799767410L;
      long var15 = var6;
      int var17 = var1;
      RenderPass var18 = var3;
      int var10003 = C_47TX.method_40$6b468acafc(var18, var17, var15);
      long var10004 = 6126107872429501878L;
      int var19 = var10003;
      long var20 = var8;
      RenderPass var22 = var3;
      ShaderOptions var23 = var10000;
      RenderUtils.method_43$d00df7729d(var23.method_40$d68b376f5b(var22, var20, var19));
      C_41l var11 = C_41l.method_40$2abe131c67();
      long var27 = 6125332823750887659L;
      int[] var28 = AntiStrike_47Qa.method_42$d4d28024c9();
      C_47Gj var12 = var11.method_41$4db9b92eb8();
      var12.method_44$dc4d91c0c9(3, C_49h.field_47y);
      Iterator var13 = var2.iterator();
      int[] var10 = var28;

      while (true) {
         if (var13.hasNext()) {
            C_47tf var14 = (C_47tf)var13.next();
            double var10001 = (float)var14.field_40;
            long var31 = 6125008170790688187L;
            Minecraft var24 = field_43;
            var10001 -= var24.method_45$17391f161a().method_41$fedcb3e4d3();
            double var10002 = (float)var14.field_41;
            var10004 = 6125008170790688187L;
            Minecraft var25 = field_43;
            var10002 -= var25.method_45$17391f161a().method_49$fedcb3e4d3();
            double var32 = (float)var14.field_47;
            var10005 = 6125008170790688187L;
            Minecraft var26 = field_43;
            var12.method_42$dbb7a02e02(var10001, var10002, var32 - var26.method_45$17391f161a().method_45$fedcb3e4d3()).method_42$da8c82d5d4();
            if (var10 != null) {
               break;
            }

            if (var10 == null) {
               continue;
            }
         }

         var11.method_40$da8c82d5d4();
         break;
      }
   }




   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 34431790838688L;
      long var6 = var1 ^ 57482311646357L;
      RenderUtils.method_42$da8c82d5d4();
      GL11.glLineWidth((float)recovery$indy$11(this.settingLineWidth, var6, 8135570554448843524L, var1) / 2.0F);
      recovery$indy$12(this, var4, 8134692777692901230L, var1);
      GL11.glLineWidth(1.0F);
      RenderUtils.method_43$da8c82d5d4();
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 32, var3, -7100934412139174255L, var1);
      recovery$indy$14(this, 40, var3, -7100934412139174255L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
        int[] var106;
        int var112;
        int[] var114;
        int var119;
        int[] var121;
        int[] var125;
        boolean var128;
        int var130;
        int var134;
        int[] var136;
        int[] var140;
        boolean var143;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 97512303762910L;
      long var8 = var4 ^ 74921294283267L;
      long var10 = var4 ^ 38340904172002L;
      long var12 = var4 ^ 134807666093974L;
      this.field_43h.clear();
      int[] var10000 = (int[])recovery$indy$flow$78(2183368683930518438L, var4);
      java.util.Iterator var15 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$80(field_43, 2183974759080032850L, var4)).field_44Q.iterator();
      int[] var14 = var10000;

      while (var15.hasNext()) {
         Object var103 = var15.next();

         net.minecraft.entity.Entity var16;
         int var19;
         double var20;
         double var22;
         double var24;
         double var26;
         double var28;
         double var30;
         java.util.ArrayList var36;
         int var52;
         int[] var152;
         label3786: {
            label3785: {
               while (true) {
                  var16 = (net.minecraft.entity.Entity)var103;
                  int var104 = var16.field_48y;
                  var152 = var14;
                  if (var2 >= 0) {
                     if (var14 == null) {
                        if (var16.field_48y < 0) {
                           break;
                        }

                        var104 = ((int) (var16.field_48M ? 1 : 0));
                     }

                     var152 = var14;
                  }

                  if (var3 > 0) {
                     if (var152 == null) {
                        if (var104 != 0) {
                           break;
                        }

                        var104 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                     }

                     var152 = var14;
                  }

                  label3795: {
                     label3767: {
                        label3766:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var1 <= 0) {
                                 break label3767;
                              }

                              if (var14 != null) {
                                 break label3766;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     label3754: {
                        label3753:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var3 <= 0) {
                                 break label3754;
                              }

                              if (var14 != null) {
                                 break label3753;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     label3741: {
                        label3740:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var1 <= 0) {
                                 break label3741;
                              }

                              if (var14 != null) {
                                 break label3740;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     label3728: {
                        label3727:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var3 < 0) {
                                 break label3728;
                              }

                              if (var14 != null) {
                                 break label3727;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     label3715: {
                        label3714:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var3 < 0) {
                                 break label3715;
                              }

                              if (var14 != null) {
                                 break label3714;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     label3702: {
                        label3701:
                        if (var152 == null) {
                           if (var104 != 0) {
                              var104 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                              var152 = var14;
                              if (var3 <= 0) {
                                 break label3702;
                              }

                              if (var14 != null) {
                                 break label3701;
                              }

                              if (var104 != 0) {
                                 break label3795;
                              }
                           }

                           var104 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                        }

                        var152 = var14;
                     }

                     if (var152 == null) {
                        if (var104 == 0) {
                           break;
                        }

                        var104 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                     }

                     if (var104 == 0) {
                        break;
                     }
                  }

                  net.C_47Kr var17 = new net.C_47Kr();
                  byte var105 = ((byte) (var16 instanceof C_47BW ? 1 : 0));
                  var152 = var14;
                  if (var3 > 0) {
                     if (var14 == null) {
                        if (var105 != 0) {
                           recovery$indy$flow$113(var17, var6, (C_47BW)var16, 2182464090963674058L, var4);
                           java.util.ArrayList var18 = (java.util.ArrayList)recovery$indy$flow$114(var17, 300, var8, 2183862095720235265L, var4);
                           this.field_43h.add(var18);
                           var106 = var14;
                           if (var2 <= 0) {
                              break label3785;
                           }

                           if (var14 == null) {
                              break;
                           }
                        }

                        var105 = ((byte) (var16 instanceof C_47BZ ? 1 : 0));
                     }

                     var152 = var14;
                  }

                  if (var152 == null) {
                     if (var105 != 0) {
                        recovery$indy$flow$119(var17, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                        java.util.ArrayList var51 = (java.util.ArrayList)recovery$indy$flow$120(var17, var10, 300, 2183931071545187492L, var4);
                        this.field_43h.add(var51);
                        var106 = var14;
                        if (var2 < 0) {
                           break label3785;
                        }

                        if (var14 == null) {
                           break;
                        }
                     }

                     var105 = ((byte) (1));
                  }

                  var52 = var105;
                  var19 = 0;
                  var20 = var16.field_48Q;
                  var22 = var16.field_48j;
                  var24 = var16.field_42o;
                  var26 = var16.field_48s;
                  var28 = var16.field_42;
                  var30 = var16.field_487;
                  var36 = new java.util.ArrayList();
                  if (var52 != 0) {
                     var152 = var14;
                     if (var1 <= 0) {
                        break label3786;
                     }

                     if (var14 == null) {
                        var152 = var14;
                        break label3786;
                     }
                     break;
                  } else {
                     var103 = this.field_43h;
                     if (var1 > 0) {
                        this.field_43h.add(var36);
                        break;
                     }
                  }
               }

               var106 = var14;
            }

            if (var106 == null) {
               continue;
            }
            break;
         }

         if (var152 == null) {
            short var153 = ((short) (300));
            double var241;
            int var107 = (var241 = var22 - 0.0) == 0.0 ? 0 : (var241 < 0.0 ? -1 : 1);
            if (var14 != null) {
               while (true) {
                  ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
                     .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
                  C_47B5 var100 = (C_47B5)var16;
                  var36.add(new net.C_47tf(var20, var22, var24));

                  label2560: {
                     label2559:
                     while (true) {
                        Object var122 = this.field_43h;
                        if (var1 > 0) {
                           this.field_43h.add(var36);

                           label2434:
                           while (true) {
                              label3899: {
                                 int[] var126 = var14;

                                 while (true) {
                                    if (var126 != null || !var15.hasNext()) {
                                       return;
                                    }

                                    var16 = (net.minecraft.entity.Entity)var15.next();
                                    int var127 = var16.field_48y;
                                    var152 = var14;
                                    if (var2 >= 0) {
                                       if (var14 == null) {
                                          if (var16.field_48y < 0) {
                                             continue label2434;
                                          }

                                          var127 = ((int) (var16.field_48M ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    if (var3 > 0) {
                                       if (var152 == null) {
                                          if (var127 != 0) {
                                             continue label2434;
                                          }

                                          var127 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    label3805: {
                                       label2424: {
                                          label2423:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2424;
                                                }

                                                if (var14 != null) {
                                                   break label2423;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2411: {
                                          label2410:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2411;
                                                }

                                                if (var14 != null) {
                                                   break label2410;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2398: {
                                          label2397:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2398;
                                                }

                                                if (var14 != null) {
                                                   break label2397;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2385: {
                                          label2384:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2385;
                                                }

                                                if (var14 != null) {
                                                   break label2384;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2372: {
                                          label2371:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2372;
                                                }

                                                if (var14 != null) {
                                                   break label2371;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2359: {
                                          label2358:
                                          if (var152 == null) {
                                             if (var127 != 0) {
                                                var127 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2359;
                                                }

                                                if (var14 != null) {
                                                   break label2358;
                                                }

                                                if (var127 != 0) {
                                                   break label3805;
                                                }
                                             }

                                             var127 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 == null) {
                                          if (var127 == 0) {
                                             continue label2434;
                                          }

                                          var127 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                       }

                                       if (var127 == 0) {
                                          continue label2434;
                                       }
                                    }

                                    net.C_47Kr var46 = new net.C_47Kr();
                                    var128 = var16 instanceof C_47BW;
                                    var152 = var14;
                                    if (var3 > 0) {
                                       if (var14 == null) {
                                          if (var128) {
                                             recovery$indy$flow$113(var46, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                             java.util.ArrayList var64 = (java.util.ArrayList)recovery$indy$flow$114(var46, 300, var8, 2183862095720235265L, var4);
                                             this.field_43h.add(var64);
                                             var126 = var14;
                                             if (var2 <= 0) {
                                                continue;
                                             }

                                             if (var14 == null) {
                                                continue label2434;
                                             }
                                          }

                                          var128 = var16 instanceof C_47BZ;
                                       }

                                       var152 = var14;
                                    }

                                    if (var152 != null) {
                                       break label3899;
                                    }

                                    if (!var128) {
                                       break;
                                    }

                                    recovery$indy$flow$119(var46, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                    java.util.ArrayList var65 = (java.util.ArrayList)recovery$indy$flow$120(var46, var10, 300, 2183931071545187492L, var4);
                                    this.field_43h.add(var65);
                                    var126 = var14;
                                    if (var2 >= 0) {
                                       if (var14 != null) {
                                          break;
                                       }
                                       continue label2434;
                                    }
                                 }

                                 var128 = true;
                              }

                              boolean var66 = var128;
                              boolean var79 = false;
                              var20 = var16.field_48Q;
                              var22 = var16.field_48j;
                              var24 = var16.field_42o;
                              var26 = var16.field_48s;
                              var28 = var16.field_42;
                              var30 = var16.field_487;
                              var36 = new java.util.ArrayList();
                              if (!var66) {
                                 break;
                              }

                              var152 = var14;
                              if (var1 <= 0) {
                                 break label2560;
                              }

                              if (var14 == null) {
                                 break label2559;
                              }
                           }
                        } else {
                           while (true) {
                              label2555: {
                                 label3813: {
                                    var16 = (net.minecraft.entity.Entity)var122;
                                    int var123 = var16.field_48y;
                                    var152 = var14;
                                    if (var2 >= 0) {
                                       if (var14 == null) {
                                          if (var16.field_48y < 0) {
                                             break label3813;
                                          }

                                          var123 = ((int) (var16.field_48M ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    if (var3 > 0) {
                                       if (var152 == null) {
                                          if (var123 != 0) {
                                             break label3813;
                                          }

                                          var123 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    label3814: {
                                       label2538: {
                                          label2537:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2538;
                                                }

                                                if (var14 != null) {
                                                   break label2537;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2525: {
                                          label2524:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2525;
                                                }

                                                if (var14 != null) {
                                                   break label2524;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2512: {
                                          label2511:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2512;
                                                }

                                                if (var14 != null) {
                                                   break label2511;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2499: {
                                          label2498:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2499;
                                                }

                                                if (var14 != null) {
                                                   break label2498;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2486: {
                                          label2485:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2486;
                                                }

                                                if (var14 != null) {
                                                   break label2485;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2473: {
                                          label2472:
                                          if (var152 == null) {
                                             if (var123 != 0) {
                                                var123 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2473;
                                                }

                                                if (var14 != null) {
                                                   break label2472;
                                                }

                                                if (var123 != 0) {
                                                   break label3814;
                                                }
                                             }

                                             var123 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 == null) {
                                          if (var123 == 0) {
                                             break label3813;
                                          }

                                          var123 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                       }

                                       if (var123 == 0) {
                                          break label3813;
                                       }
                                    }

                                    net.C_47Kr var45 = new net.C_47Kr();
                                    boolean var124 = var16 instanceof C_47BW;
                                    var152 = var14;
                                    if (var3 > 0) {
                                       if (var14 == null) {
                                          if (var124) {
                                             recovery$indy$flow$113(var45, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                             java.util.ArrayList var61 = (java.util.ArrayList)recovery$indy$flow$114(var45, 300, var8, 2183862095720235265L, var4);
                                             this.field_43h.add(var61);
                                             var125 = var14;
                                             if (var2 <= 0) {
                                                break label2555;
                                             }

                                             if (var14 == null) {
                                                break label3813;
                                             }
                                          }

                                          var124 = var16 instanceof C_47BZ;
                                       }

                                       var152 = var14;
                                    }

                                    if (var152 == null) {
                                       if (var124) {
                                          recovery$indy$flow$119(var45, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                          java.util.ArrayList var62 = (java.util.ArrayList)recovery$indy$flow$120(var45, var10, 300, 2183931071545187492L, var4);
                                          this.field_43h.add(var62);
                                          var125 = var14;
                                          if (var2 < 0) {
                                             break label2555;
                                          }

                                          if (var14 == null) {
                                             break label3813;
                                          }
                                       }

                                       var124 = true;
                                    }

                                    boolean var63 = var124;
                                    boolean var78 = false;
                                    var20 = var16.field_48Q;
                                    var22 = var16.field_48j;
                                    var24 = var16.field_42o;
                                    var26 = var16.field_48s;
                                    var28 = var16.field_42;
                                    var30 = var16.field_487;
                                    var36 = new java.util.ArrayList();
                                    if (!var63) {
                                       break;
                                    }

                                    var152 = var14;
                                    if (var1 <= 0) {
                                       break label2560;
                                    }

                                    if (var14 == null) {
                                       break label2559;
                                    }
                                 }

                                 var125 = var14;
                              }

                              if (var125 != null || !var15.hasNext()) {
                                 return;
                              }

                              var122 = var15.next();
                           }
                        }
                     }

                     var152 = var14;
                  }

                  if (var152 == null) {
                     short var205 = ((short) (300));
                     double var242;
                     var107 = (var242 = var22 - 0.0) == 0.0 ? 0 : (var242 < 0.0 ? -1 : 1);
                  }
               }
            }

            while (true) {
               if (var107 < 0) {
                  do {
                     var107 = 0;

                     do {
                        var52 = var107;
                        var19++;
                        net.C_47Ij var95 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
                           .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
                        if (var95 != null) {
                           var52 = 0;
                        }

                        var20 += var26;
                        var22 += var28;
                        var24 += var30;
                        float var97 = 0.95F;
                        C_47B5 var99 = (C_47B5)var16;
                        var26 += var99.field_48l;
                        var28 += var99.field_45;
                        var30 += var99.field_48q;
                        var26 *= var97;
                        var28 *= var97;
                        var30 *= var97;
                        var36.add(new net.C_47tf(var20, var22, var24));

                        while (true) {
                           label2839: {
                              label3823: {
                                 if (var52 != 0) {
                                    var107 = var19;
                                    var152 = var14;
                                    if (var1 <= 0) {
                                       break;
                                    }

                                    if (var14 == null) {
                                       var152 = var14;
                                       break;
                                    }
                                 } else {
                                    Object var116 = this.field_43h;
                                    if (var1 <= 0) {
                                       while (true) {
                                          label2832: {
                                             label3825: {
                                                var16 = (net.minecraft.entity.Entity)var116;
                                                int var120 = var16.field_48y;
                                                var152 = var14;
                                                if (var2 >= 0) {
                                                   if (var14 == null) {
                                                      if (var16.field_48y < 0) {
                                                         break label3825;
                                                      }

                                                      var120 = ((int) (var16.field_48M ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                if (var3 > 0) {
                                                   if (var152 == null) {
                                                      if (var120 != 0) {
                                                         break label3825;
                                                      }

                                                      var120 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3826: {
                                                   label2815: {
                                                      label2814:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var1 <= 0) {
                                                               break label2815;
                                                            }

                                                            if (var14 != null) {
                                                               break label2814;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   label2802: {
                                                      label2801:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var3 <= 0) {
                                                               break label2802;
                                                            }

                                                            if (var14 != null) {
                                                               break label2801;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   label2789: {
                                                      label2788:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var1 <= 0) {
                                                               break label2789;
                                                            }

                                                            if (var14 != null) {
                                                               break label2788;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   label2776: {
                                                      label2775:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var3 < 0) {
                                                               break label2776;
                                                            }

                                                            if (var14 != null) {
                                                               break label2775;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   label2763: {
                                                      label2762:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var3 < 0) {
                                                               break label2763;
                                                            }

                                                            if (var14 != null) {
                                                               break label2762;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   label2750: {
                                                      label2749:
                                                      if (var152 == null) {
                                                         if (var120 != 0) {
                                                            var120 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                            var152 = var14;
                                                            if (var3 <= 0) {
                                                               break label2750;
                                                            }

                                                            if (var14 != null) {
                                                               break label2749;
                                                            }

                                                            if (var120 != 0) {
                                                               break label3826;
                                                            }
                                                         }

                                                         var120 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                                      }

                                                      var152 = var14;
                                                   }

                                                   if (var152 == null) {
                                                      if (var120 == 0) {
                                                         break label3825;
                                                      }

                                                      var120 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                   }

                                                   if (var120 == 0) {
                                                      break label3825;
                                                   }
                                                }

                                                net.C_47Kr var44 = new net.C_47Kr();
                                                var119 = ((var16 instanceof C_47BW) ? 1 : 0);
                                                var152 = var14;
                                                if (var3 > 0) {
                                                   if (var14 == null) {
                                                      if (var119 != 0) {
                                                         recovery$indy$flow$113(var44, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                                         java.util.ArrayList var59 = (java.util.ArrayList)recovery$indy$flow$114(var44, 300, var8, 2183862095720235265L, var4);
                                                         this.field_43h.add(var59);
                                                         var121 = var14;
                                                         if (var2 <= 0) {
                                                            break label2832;
                                                         }

                                                         if (var14 == null) {
                                                            break label3825;
                                                         }
                                                      }

                                                      var119 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                                   }

                                                   var152 = var14;
                                                }

                                                if (var152 != null) {
                                                   break label2839;
                                                }

                                                if (var119 == 0) {
                                                   break label3823;
                                                }

                                                recovery$indy$flow$119(var44, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                                java.util.ArrayList var60 = (java.util.ArrayList)recovery$indy$flow$120(var44, var10, 300, 2183931071545187492L, var4);
                                                this.field_43h.add(var60);
                                                var121 = var14;
                                                if (var2 < 0) {
                                                   break label2832;
                                                }

                                                if (var14 != null) {
                                                   break label3823;
                                                }
                                             }

                                             var121 = var14;
                                          }

                                          if (var121 != null || !var15.hasNext()) {
                                             return;
                                          }

                                          var116 = var15.next();
                                       }
                                    }

                                    this.field_43h.add(var36);
                                 }

                                 label2713:
                                 while (true) {
                                    int[] var117 = var14;

                                    while (var117 == null && var15.hasNext()) {
                                       var16 = (net.minecraft.entity.Entity)var15.next();
                                       var107 = var16.field_48y;
                                       var152 = var14;
                                       if (var2 >= 0) {
                                          if (var14 == null) {
                                             if (var16.field_48y < 0) {
                                                continue label2713;
                                             }

                                             var107 = ((int) (var16.field_48M ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var3 > 0) {
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                continue label2713;
                                             }

                                             var107 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3834: {
                                          label2705: {
                                             label2704:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var1 <= 0) {
                                                      break label2705;
                                                   }

                                                   if (var14 != null) {
                                                      break label2704;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label2692: {
                                             label2691:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 <= 0) {
                                                      break label2692;
                                                   }

                                                   if (var14 != null) {
                                                      break label2691;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label2679: {
                                             label2678:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var1 <= 0) {
                                                      break label2679;
                                                   }

                                                   if (var14 != null) {
                                                      break label2678;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label2666: {
                                             label2665:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 < 0) {
                                                      break label2666;
                                                   }

                                                   if (var14 != null) {
                                                      break label2665;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label2653: {
                                             label2652:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 < 0) {
                                                      break label2653;
                                                   }

                                                   if (var14 != null) {
                                                      break label2652;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label2640: {
                                             label2639:
                                             if (var152 == null) {
                                                if (var107 != 0) {
                                                   var107 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 <= 0) {
                                                      break label2640;
                                                   }

                                                   if (var14 != null) {
                                                      break label2639;
                                                   }

                                                   if (var107 != 0) {
                                                      break label3834;
                                                   }
                                                }

                                                var107 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          if (var152 == null) {
                                             if (var107 == 0) {
                                                continue label2713;
                                             }

                                             var107 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                          }

                                          if (var107 == 0) {
                                             continue label2713;
                                          }
                                       }

                                       net.C_47Kr var43 = new net.C_47Kr();
                                       var119 = ((var16 instanceof C_47BW) ? 1 : 0);
                                       var152 = var14;
                                       if (var3 > 0) {
                                          if (var14 == null) {
                                             if (var119 != 0) {
                                                recovery$indy$flow$113(var43, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                                java.util.ArrayList var57 = (java.util.ArrayList)recovery$indy$flow$114(var43, 300, var8, 2183862095720235265L, var4);
                                                this.field_43h.add(var57);
                                                var117 = var14;
                                                if (var2 <= 0) {
                                                   continue;
                                                }

                                                if (var14 == null) {
                                                   continue label2713;
                                                }
                                             }

                                             var119 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 != null) {
                                          break label2839;
                                       }

                                       if (var119 == 0) {
                                          break label2713;
                                       }

                                       recovery$indy$flow$119(var43, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                       java.util.ArrayList var58 = (java.util.ArrayList)recovery$indy$flow$120(var43, var10, 300, 2183931071545187492L, var4);
                                       this.field_43h.add(var58);
                                       var117 = var14;
                                       if (var2 >= 0) {
                                          if (var14 != null) {
                                             break label2713;
                                          }
                                          continue label2713;
                                       }
                                    }

                                    return;
                                 }
                              }

                              var119 = 1;
                           }

                           var52 = var119;
                           var19 = 0;
                           var20 = var16.field_48Q;
                           var22 = var16.field_48j;
                           var24 = var16.field_42o;
                           var26 = var16.field_48s;
                           var28 = var16.field_42;
                           var30 = var16.field_487;
                           var36 = new java.util.ArrayList();
                        }
                     } while (var152 != null);
                  } while (var19 > 300);
               } else {
                  while (true) {
                     var19++;
                     net.C_47Ij var38 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
                        .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
                     if (var38 != null) {
                        var52 = 0;
                     }

                     var20 += var26;
                     var22 += var28;
                     var24 += var30;
                     float var39 = 0.95F;
                     C_47B5 var40 = (C_47B5)var16;
                     var26 += var40.field_48l;
                     var28 += var40.field_45;
                     var30 += var40.field_48q;
                     var26 *= var39;
                     var28 *= var39;
                     var30 *= var39;
                     var36.add(new net.C_47tf(var20, var22, var24));

                     while (true) {
                        label3100: {
                           label3842: {
                              if (var52 != 0) {
                                 var107 = var19;
                                 var152 = var14;
                                 if (var1 <= 0) {
                                    break;
                                 }

                                 if (var14 == null) {
                                    var152 = var14;
                                    break;
                                 }
                              } else {
                                 Object var109 = this.field_43h;
                                 if (var1 <= 0) {
                                    while (true) {
                                       label3093: {
                                          label3844: {
                                             var16 = (net.minecraft.entity.Entity)var109;
                                             int var113 = var16.field_48y;
                                             var152 = var14;
                                             if (var2 >= 0) {
                                                if (var14 == null) {
                                                   if (var16.field_48y < 0) {
                                                      break label3844;
                                                   }

                                                   var113 = ((int) (var16.field_48M ? 1 : 0));
                                                }

                                                var152 = var14;
                                             }

                                             if (var3 > 0) {
                                                if (var152 == null) {
                                                   if (var113 != 0) {
                                                      break label3844;
                                                   }

                                                   var113 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                                }

                                                var152 = var14;
                                             }

                                             label3845: {
                                                label3076: {
                                                   label3075:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var1 <= 0) {
                                                            break label3076;
                                                         }

                                                         if (var14 != null) {
                                                            break label3075;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3063: {
                                                   label3062:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var3 <= 0) {
                                                            break label3063;
                                                         }

                                                         if (var14 != null) {
                                                            break label3062;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3050: {
                                                   label3049:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var1 <= 0) {
                                                            break label3050;
                                                         }

                                                         if (var14 != null) {
                                                            break label3049;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3037: {
                                                   label3036:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var3 < 0) {
                                                            break label3037;
                                                         }

                                                         if (var14 != null) {
                                                            break label3036;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3024: {
                                                   label3023:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var3 < 0) {
                                                            break label3024;
                                                         }

                                                         if (var14 != null) {
                                                            break label3023;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                label3011: {
                                                   label3010:
                                                   if (var152 == null) {
                                                      if (var113 != 0) {
                                                         var113 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                         var152 = var14;
                                                         if (var3 <= 0) {
                                                            break label3011;
                                                         }

                                                         if (var14 != null) {
                                                            break label3010;
                                                         }

                                                         if (var113 != 0) {
                                                            break label3845;
                                                         }
                                                      }

                                                      var113 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                                   }

                                                   var152 = var14;
                                                }

                                                if (var152 == null) {
                                                   if (var113 == 0) {
                                                      break label3844;
                                                   }

                                                   var113 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                }

                                                if (var113 == 0) {
                                                   break label3844;
                                                }
                                             }

                                             net.C_47Kr var42 = new net.C_47Kr();
                                             var112 = ((var16 instanceof C_47BW) ? 1 : 0);
                                             var152 = var14;
                                             if (var3 > 0) {
                                                if (var14 == null) {
                                                   if (var112 != 0) {
                                                      recovery$indy$flow$113(var42, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                                      java.util.ArrayList var55 = (java.util.ArrayList)recovery$indy$flow$114(var42, 300, var8, 2183862095720235265L, var4);
                                                      this.field_43h.add(var55);
                                                      var114 = var14;
                                                      if (var2 <= 0) {
                                                         break label3093;
                                                      }

                                                      if (var14 == null) {
                                                         break label3844;
                                                      }
                                                   }

                                                   var112 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                                }

                                                var152 = var14;
                                             }

                                             if (var152 != null) {
                                                break label3100;
                                             }

                                             if (var112 == 0) {
                                                break label3842;
                                             }

                                             recovery$indy$flow$119(var42, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                             java.util.ArrayList var56 = (java.util.ArrayList)recovery$indy$flow$120(var42, var10, 300, 2183931071545187492L, var4);
                                             this.field_43h.add(var56);
                                             var114 = var14;
                                             if (var2 < 0) {
                                                break label3093;
                                             }

                                             if (var14 != null) {
                                                break label3842;
                                             }
                                          }

                                          var114 = var14;
                                       }

                                       if (var114 != null || !var15.hasNext()) {
                                          return;
                                       }

                                       var109 = var15.next();
                                    }
                                 }

                                 this.field_43h.add(var36);
                              }

                              label2974:
                              while (true) {
                                 int[] var110 = var14;

                                 while (var110 == null && var15.hasNext()) {
                                    var16 = (net.minecraft.entity.Entity)var15.next();
                                    var107 = var16.field_48y;
                                    var152 = var14;
                                    if (var2 >= 0) {
                                       if (var14 == null) {
                                          if (var16.field_48y < 0) {
                                             continue label2974;
                                          }

                                          var107 = ((int) (var16.field_48M ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    if (var3 > 0) {
                                       if (var152 == null) {
                                          if (var107 != 0) {
                                             continue label2974;
                                          }

                                          var107 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    label3853: {
                                       label2966: {
                                          label2965:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2966;
                                                }

                                                if (var14 != null) {
                                                   break label2965;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2953: {
                                          label2952:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2953;
                                                }

                                                if (var14 != null) {
                                                   break label2952;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2940: {
                                          label2939:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label2940;
                                                }

                                                if (var14 != null) {
                                                   break label2939;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2927: {
                                          label2926:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2927;
                                                }

                                                if (var14 != null) {
                                                   break label2926;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2914: {
                                          label2913:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label2914;
                                                }

                                                if (var14 != null) {
                                                   break label2913;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label2901: {
                                          label2900:
                                          if (var152 == null) {
                                             if (var107 != 0) {
                                                var107 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label2901;
                                                }

                                                if (var14 != null) {
                                                   break label2900;
                                                }

                                                if (var107 != 0) {
                                                   break label3853;
                                                }
                                             }

                                             var107 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 == null) {
                                          if (var107 == 0) {
                                             continue label2974;
                                          }

                                          var107 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                       }

                                       if (var107 == 0) {
                                          continue label2974;
                                       }
                                    }

                                    net.C_47Kr var41 = new net.C_47Kr();
                                    var112 = ((var16 instanceof C_47BW) ? 1 : 0);
                                    var152 = var14;
                                    if (var3 > 0) {
                                       if (var14 == null) {
                                          if (var112 != 0) {
                                             recovery$indy$flow$113(var41, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                             java.util.ArrayList var53 = (java.util.ArrayList)recovery$indy$flow$114(var41, 300, var8, 2183862095720235265L, var4);
                                             this.field_43h.add(var53);
                                             var110 = var14;
                                             if (var2 <= 0) {
                                                continue;
                                             }

                                             if (var14 == null) {
                                                continue label2974;
                                             }
                                          }

                                          var112 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                       }

                                       var152 = var14;
                                    }

                                    if (var152 != null) {
                                       break label3100;
                                    }

                                    if (var112 == 0) {
                                       break label2974;
                                    }

                                    recovery$indy$flow$119(var41, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                    java.util.ArrayList var54 = (java.util.ArrayList)recovery$indy$flow$120(var41, var10, 300, 2183931071545187492L, var4);
                                    this.field_43h.add(var54);
                                    var110 = var14;
                                    if (var2 >= 0) {
                                       if (var14 != null) {
                                          break label2974;
                                       }
                                       continue label2974;
                                    }
                                 }

                                 return;
                              }
                           }

                           var112 = 1;
                        }

                        var52 = var112;
                        var19 = 0;
                        var20 = var16.field_48Q;
                        var22 = var16.field_48j;
                        var24 = var16.field_42o;
                        var26 = var16.field_48s;
                        var28 = var16.field_42;
                        var30 = var16.field_487;
                        var36 = new java.util.ArrayList();
                     }

                     if (var152 == null) {
                        if (var19 <= 300) {
                           break;
                        }

                        var107 = 0;
                     }

                     var52 = var107;
                  }
               }

               double var243;
               var107 = (var243 = var22 - 0.0) == 0.0 ? 0 : (var243 < 0.0 ? -1 : 1);
            }
         } else {
            var52 = var19++;
            net.C_47Ij var96 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
               .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
            if (var14 != null) {
               while (true) {
                  C_47B5 var102 = (C_47B5)var16;
                  var36.add(new net.C_47tf(var20, var22, var24));

                  label3370: {
                     label3369:
                     while (true) {
                        var103 = this.field_43h;
                        if (var1 > 0) {
                           this.field_43h.add(var36);

                           label3244:
                           while (true) {
                              label3902: {
                                 int[] var141 = var14;

                                 while (true) {
                                    if (var141 != null || !var15.hasNext()) {
                                       return;
                                    }

                                    var16 = (net.minecraft.entity.Entity)var15.next();
                                    int var142 = var16.field_48y;
                                    var152 = var14;
                                    if (var2 >= 0) {
                                       if (var14 == null) {
                                          if (var16.field_48y < 0) {
                                             continue label3244;
                                          }

                                          var142 = ((int) (var16.field_48M ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    if (var3 > 0) {
                                       if (var152 == null) {
                                          if (var142 != 0) {
                                             continue label3244;
                                          }

                                          var142 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    label3863: {
                                       label3234: {
                                          label3233:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label3234;
                                                }

                                                if (var14 != null) {
                                                   break label3233;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3221: {
                                          label3220:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label3221;
                                                }

                                                if (var14 != null) {
                                                   break label3220;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3208: {
                                          label3207:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label3208;
                                                }

                                                if (var14 != null) {
                                                   break label3207;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3195: {
                                          label3194:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label3195;
                                                }

                                                if (var14 != null) {
                                                   break label3194;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3182: {
                                          label3181:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label3182;
                                                }

                                                if (var14 != null) {
                                                   break label3181;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3169: {
                                          label3168:
                                          if (var152 == null) {
                                             if (var142 != 0) {
                                                var142 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label3169;
                                                }

                                                if (var14 != null) {
                                                   break label3168;
                                                }

                                                if (var142 != 0) {
                                                   break label3863;
                                                }
                                             }

                                             var142 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 == null) {
                                          if (var142 == 0) {
                                             continue label3244;
                                          }

                                          var142 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                       }

                                       if (var142 == 0) {
                                          continue label3244;
                                       }
                                    }

                                    net.C_47Kr var50 = new net.C_47Kr();
                                    var143 = var16 instanceof C_47BW;
                                    var152 = var14;
                                    if (var3 > 0) {
                                       if (var14 == null) {
                                          if (var143) {
                                             recovery$indy$flow$113(var50, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                             java.util.ArrayList var75 = (java.util.ArrayList)recovery$indy$flow$114(var50, 300, var8, 2183862095720235265L, var4);
                                             this.field_43h.add(var75);
                                             var141 = var14;
                                             if (var2 <= 0) {
                                                continue;
                                             }

                                             if (var14 == null) {
                                                continue label3244;
                                             }
                                          }

                                          var143 = var16 instanceof C_47BZ;
                                       }

                                       var152 = var14;
                                    }

                                    if (var152 != null) {
                                       break label3902;
                                    }

                                    if (!var143) {
                                       break;
                                    }

                                    recovery$indy$flow$119(var50, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                    java.util.ArrayList var76 = (java.util.ArrayList)recovery$indy$flow$120(var50, var10, 300, 2183931071545187492L, var4);
                                    this.field_43h.add(var76);
                                    var141 = var14;
                                    if (var2 >= 0) {
                                       if (var14 != null) {
                                          break;
                                       }
                                       continue label3244;
                                    }
                                 }

                                 var143 = true;
                              }

                              boolean var77 = var143;
                              boolean var82 = false;
                              var20 = var16.field_48Q;
                              var22 = var16.field_48j;
                              var24 = var16.field_42o;
                              var26 = var16.field_48s;
                              var28 = var16.field_42;
                              var30 = var16.field_487;
                              var36 = new java.util.ArrayList();
                              if (!var77) {
                                 break;
                              }

                              var152 = var14;
                              if (var1 <= 0) {
                                 break label3370;
                              }

                              if (var14 == null) {
                                 break label3369;
                              }
                           }
                        } else {
                           while (true) {
                              label3365: {
                                 label3871: {
                                    var16 = (net.minecraft.entity.Entity)var103;
                                    int var138 = var16.field_48y;
                                    var152 = var14;
                                    if (var2 >= 0) {
                                       if (var14 == null) {
                                          if (var16.field_48y < 0) {
                                             break label3871;
                                          }

                                          var138 = ((int) (var16.field_48M ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    if (var3 > 0) {
                                       if (var152 == null) {
                                          if (var138 != 0) {
                                             break label3871;
                                          }

                                          var138 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                       }

                                       var152 = var14;
                                    }

                                    label3872: {
                                       label3348: {
                                          label3347:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label3348;
                                                }

                                                if (var14 != null) {
                                                   break label3347;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3335: {
                                          label3334:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label3335;
                                                }

                                                if (var14 != null) {
                                                   break label3334;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3322: {
                                          label3321:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var1 <= 0) {
                                                   break label3322;
                                                }

                                                if (var14 != null) {
                                                   break label3321;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3309: {
                                          label3308:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label3309;
                                                }

                                                if (var14 != null) {
                                                   break label3308;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3296: {
                                          label3295:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 < 0) {
                                                   break label3296;
                                                }

                                                if (var14 != null) {
                                                   break label3295;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3283: {
                                          label3282:
                                          if (var152 == null) {
                                             if (var138 != 0) {
                                                var138 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                var152 = var14;
                                                if (var3 <= 0) {
                                                   break label3283;
                                                }

                                                if (var14 != null) {
                                                   break label3282;
                                                }

                                                if (var138 != 0) {
                                                   break label3872;
                                                }
                                             }

                                             var138 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 == null) {
                                          if (var138 == 0) {
                                             break label3871;
                                          }

                                          var138 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                       }

                                       if (var138 == 0) {
                                          break label3871;
                                       }
                                    }

                                    net.C_47Kr var49 = new net.C_47Kr();
                                    boolean var139 = var16 instanceof C_47BW;
                                    var152 = var14;
                                    if (var3 > 0) {
                                       if (var14 == null) {
                                          if (var139) {
                                             recovery$indy$flow$113(var49, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                             java.util.ArrayList var72 = (java.util.ArrayList)recovery$indy$flow$114(var49, 300, var8, 2183862095720235265L, var4);
                                             this.field_43h.add(var72);
                                             var140 = var14;
                                             if (var2 <= 0) {
                                                break label3365;
                                             }

                                             if (var14 == null) {
                                                break label3871;
                                             }
                                          }

                                          var139 = var16 instanceof C_47BZ;
                                       }

                                       var152 = var14;
                                    }

                                    if (var152 == null) {
                                       if (var139) {
                                          recovery$indy$flow$119(var49, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                          java.util.ArrayList var73 = (java.util.ArrayList)recovery$indy$flow$120(var49, var10, 300, 2183931071545187492L, var4);
                                          this.field_43h.add(var73);
                                          var140 = var14;
                                          if (var2 < 0) {
                                             break label3365;
                                          }

                                          if (var14 == null) {
                                             break label3871;
                                          }
                                       }

                                       var139 = true;
                                    }

                                    boolean var74 = var139;
                                    boolean var81 = false;
                                    var20 = var16.field_48Q;
                                    var22 = var16.field_48j;
                                    var24 = var16.field_42o;
                                    var26 = var16.field_48s;
                                    var28 = var16.field_42;
                                    var30 = var16.field_487;
                                    var36 = new java.util.ArrayList();
                                    if (!var74) {
                                       break;
                                    }

                                    var152 = var14;
                                    if (var1 <= 0) {
                                       break label3370;
                                    }

                                    if (var14 == null) {
                                       break label3369;
                                    }
                                 }

                                 var140 = var14;
                              }

                              if (var140 != null || !var15.hasNext()) {
                                 return;
                              }

                              var103 = var15.next();
                           }
                        }
                     }

                     var152 = var14;
                  }

                  if (var152 == null) {
                     short var240 = ((short) (300));
                     double var244;
                     int var144 = (var244 = var22 - 0.0) == 0.0 ? 0 : (var244 < 0.0 ? -1 : 1);
                  }

                  ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
                     .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
               }
            }

            while (true) {
               if (var96 != null) {
                  var52 = 0;
               }

               var20 += var26;
               var22 += var28;
               var24 += var30;
               float var98 = 0.95F;
               C_47B5 var101 = (C_47B5)var16;
               var26 += var101.field_48l;
               var28 += var101.field_45;
               var30 += var101.field_48q;
               var26 *= var98;
               var28 *= var98;
               var30 *= var98;
               var36.add(new net.C_47tf(var20, var22, var24));

               while (true) {
                  label3634: {
                     label3880: {
                        if (var52 != 0) {
                           var130 = var19;
                           var152 = var14;
                           if (var1 <= 0) {
                              break;
                           }

                           if (var14 == null) {
                              var152 = var14;
                              break;
                           }
                        } else {
                           var103 = this.field_43h;
                           if (var1 <= 0) {
                              while (true) {
                                 label3627: {
                                    label3882: {
                                       var16 = (net.minecraft.entity.Entity)var103;
                                       int var135 = var16.field_48y;
                                       var152 = var14;
                                       if (var2 >= 0) {
                                          if (var14 == null) {
                                             if (var16.field_48y < 0) {
                                                break label3882;
                                             }

                                             var135 = ((int) (var16.field_48M ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       if (var3 > 0) {
                                          if (var152 == null) {
                                             if (var135 != 0) {
                                                break label3882;
                                             }

                                             var135 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                          }

                                          var152 = var14;
                                       }

                                       label3883: {
                                          label3610: {
                                             label3609:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var1 <= 0) {
                                                      break label3610;
                                                   }

                                                   if (var14 != null) {
                                                      break label3609;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label3597: {
                                             label3596:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 <= 0) {
                                                      break label3597;
                                                   }

                                                   if (var14 != null) {
                                                      break label3596;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label3584: {
                                             label3583:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var1 <= 0) {
                                                      break label3584;
                                                   }

                                                   if (var14 != null) {
                                                      break label3583;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label3571: {
                                             label3570:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 < 0) {
                                                      break label3571;
                                                   }

                                                   if (var14 != null) {
                                                      break label3570;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label3558: {
                                             label3557:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 < 0) {
                                                      break label3558;
                                                   }

                                                   if (var14 != null) {
                                                      break label3557;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          label3545: {
                                             label3544:
                                             if (var152 == null) {
                                                if (var135 != 0) {
                                                   var135 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                                   var152 = var14;
                                                   if (var3 <= 0) {
                                                      break label3545;
                                                   }

                                                   if (var14 != null) {
                                                      break label3544;
                                                   }

                                                   if (var135 != 0) {
                                                      break label3883;
                                                   }
                                                }

                                                var135 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                             }

                                             var152 = var14;
                                          }

                                          if (var152 == null) {
                                             if (var135 == 0) {
                                                break label3882;
                                             }

                                             var135 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                          }

                                          if (var135 == 0) {
                                             break label3882;
                                          }
                                       }

                                       net.C_47Kr var48 = new net.C_47Kr();
                                       var134 = ((var16 instanceof C_47BW) ? 1 : 0);
                                       var152 = var14;
                                       if (var3 > 0) {
                                          if (var14 == null) {
                                             if (var134 != 0) {
                                                recovery$indy$flow$113(var48, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                                java.util.ArrayList var70 = (java.util.ArrayList)recovery$indy$flow$114(var48, 300, var8, 2183862095720235265L, var4);
                                                this.field_43h.add(var70);
                                                var136 = var14;
                                                if (var2 <= 0) {
                                                   break label3627;
                                                }

                                                if (var14 == null) {
                                                   break label3882;
                                                }
                                             }

                                             var134 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                          }

                                          var152 = var14;
                                       }

                                       if (var152 != null) {
                                          break label3634;
                                       }

                                       if (var134 == 0) {
                                          break label3880;
                                       }

                                       recovery$indy$flow$119(var48, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                                       java.util.ArrayList var71 = (java.util.ArrayList)recovery$indy$flow$120(var48, var10, 300, 2183931071545187492L, var4);
                                       this.field_43h.add(var71);
                                       var136 = var14;
                                       if (var2 < 0) {
                                          break label3627;
                                       }

                                       if (var14 != null) {
                                          break label3880;
                                       }
                                    }

                                    var136 = var14;
                                 }

                                 if (var136 != null || !var15.hasNext()) {
                                    return;
                                 }

                                 var103 = var15.next();
                              }
                           }

                           this.field_43h.add(var36);
                        }

                        label3508:
                        while (true) {
                           int[] var132 = var14;

                           while (var132 == null && var15.hasNext()) {
                              var16 = (net.minecraft.entity.Entity)var15.next();
                              int var133 = var16.field_48y;
                              var152 = var14;
                              if (var2 >= 0) {
                                 if (var14 == null) {
                                    if (var16.field_48y < 0) {
                                       continue label3508;
                                    }

                                    var133 = ((int) (var16.field_48M ? 1 : 0));
                                 }

                                 var152 = var14;
                              }

                              if (var3 > 0) {
                                 if (var152 == null) {
                                    if (var133 != 0) {
                                       continue label3508;
                                    }

                                    var133 = ((int) (var16 instanceof C_47BZ ? 1 : 0));
                                 }

                                 var152 = var14;
                              }

                              label3891: {
                                 label3500: {
                                    label3499:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$90(net.C_47G3.ARROW, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var1 <= 0) {
                                             break label3500;
                                          }

                                          if (var14 != null) {
                                             break label3499;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47BO ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 label3487: {
                                    label3486:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$93(net.C_47G3.SNOW_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var3 <= 0) {
                                             break label3487;
                                          }

                                          if (var14 != null) {
                                             break label3486;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47B7 ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 label3474: {
                                    label3473:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$96(net.C_47G3.EGG, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var1 <= 0) {
                                             break label3474;
                                          }

                                          if (var14 != null) {
                                             break label3473;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47Bn ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 label3461: {
                                    label3460:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$99(net.C_47G3.ENDER_PEARL, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var3 < 0) {
                                             break label3461;
                                          }

                                          if (var14 != null) {
                                             break label3460;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47B6 ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 label3448: {
                                    label3447:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$102(net.C_47G3.XP_BOTTLE, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var3 < 0) {
                                             break label3448;
                                          }

                                          if (var14 != null) {
                                             break label3447;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47BX ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 label3435: {
                                    label3434:
                                    if (var152 == null) {
                                       if (var133 != 0) {
                                          var133 = ((int) (recovery$indy$flow$105(net.C_47G3.POTION, 2182504862207652588L, var4) ? 1 : 0));
                                          var152 = var14;
                                          if (var3 <= 0) {
                                             break label3435;
                                          }

                                          if (var14 != null) {
                                             break label3434;
                                          }

                                          if (var133 != 0) {
                                             break label3891;
                                          }
                                       }

                                       var133 = ((int) (var16 instanceof C_47B5 ? 1 : 0));
                                    }

                                    var152 = var14;
                                 }

                                 if (var152 == null) {
                                    if (var133 == 0) {
                                       continue label3508;
                                    }

                                    var133 = ((int) (recovery$indy$flow$108(net.C_47G3.FIRE_BALL, 2182504862207652588L, var4) ? 1 : 0));
                                 }

                                 if (var133 == 0) {
                                    continue label3508;
                                 }
                              }

                              net.C_47Kr var47 = new net.C_47Kr();
                              var134 = ((var16 instanceof C_47BW) ? 1 : 0);
                              var152 = var14;
                              if (var3 > 0) {
                                 if (var14 == null) {
                                    if (var134 != 0) {
                                       recovery$indy$flow$113(var47, var6, (C_47BW)var16, 2182464090963674058L, var4);
                                       java.util.ArrayList var68 = (java.util.ArrayList)recovery$indy$flow$114(var47, 300, var8, 2183862095720235265L, var4);
                                       this.field_43h.add(var68);
                                       var132 = var14;
                                       if (var2 <= 0) {
                                          continue;
                                       }

                                       if (var14 == null) {
                                          continue label3508;
                                       }
                                    }

                                    var134 = ((var16 instanceof C_47BZ) ? 1 : 0);
                                 }

                                 var152 = var14;
                              }

                              if (var152 != null) {
                                 break label3634;
                              }

                              if (var134 == 0) {
                                 break label3508;
                              }

                              recovery$indy$flow$119(var47, (C_47BZ)var16, var12, 2182068553525587478L, var4);
                              java.util.ArrayList var69 = (java.util.ArrayList)recovery$indy$flow$120(var47, var10, 300, 2183931071545187492L, var4);
                              this.field_43h.add(var69);
                              var132 = var14;
                              if (var2 >= 0) {
                                 if (var14 != null) {
                                    break label3508;
                                 }
                                 continue label3508;
                              }
                           }

                           return;
                        }
                     }

                     var134 = 1;
                  }

                  var52 = var134;
                  var19 = 0;
                  var20 = var16.field_48Q;
                  var22 = var16.field_48j;
                  var24 = var16.field_42o;
                  var26 = var16.field_48s;
                  var28 = var16.field_42;
                  var30 = var16.field_487;
                  var36 = new java.util.ArrayList();
               }

               label3644: {
                  if (var152 == null) {
                     if (var19 <= 300 && !(var22 < 0.0)) {
                        break label3644;
                     }

                     var130 = 0;
                  }

                  var52 = var130;
               }

               var19++;
               var96 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$136(field_43, 2183974759080032850L, var4))
                  .method_48$f1a7e917f7(var20, var22, var24, var20 + var26, var22 + var28, var24 + var30);
            }
         }
      }
   }






   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Projectiles_47H5(long a0) {
        super((java.lang.String) ("Projectiles"),(java.lang.String) ("Projektile"),(long) (((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 19346246301268L)),(java.awt.Color) (new java.awt.Color((int) (80),(int) (107),(int) (91))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.Projectiles_47H5.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 35621374589858L);
        long constructorKey4 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 11304327682797L);
        long constructorKey5 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 128696239532448L);
        long constructorKey6 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 106364420860495L);
        long constructorKey7 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 4590012689002L);
        long constructorKey8 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 85645252466120L);
        long constructorKey9 = ((augustus.recovered.modules.render.Projectiles_47H5.a ^ a0) ^ 55721815630751L);
        java.awt.Color initialized10 = new java.awt.Color(21, 121, 230, 180);
        client.setting.ColorSetting initialized11 = new client.setting.ColorSetting(constructorKey7, this, "Color", initialized10);
        recovery$indy$flow$153(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey6, "CalculateColor", true);
        recovery$indy$flow$156(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4616189618054758400L), constructorKey8, 1.0D, Double.longBitsToDouble(4622945017495814144L), 0);
        recovery$indy$flow$159(this, initialized13);
        client.setting.ShaderOptions initialized14 = new client.setting.ShaderOptions(this, constructorKey4);
        java.lang.Object initialValue15 = recovery$indy$flow$162();
        java.lang.Object initialValue16 = initialValue15;
        long initialValue17 = constructorKey5;
        client.setting.ShaderOptions initialValue18 = initialized14;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue21 = recovery$indy$flow$165(initialValue19, initialValue17, initialValue20);
        long initialValue22 = constructorKey9;
        java.lang.Object initialValue23 = initialValue21;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = recovery$indy$flow$167(initialValue24, initialValue22);
        recovery$indy$flow$168(this, initialValue25);
        java.lang.Object initialValue26 = recovery$indy$flow$170();
        client.setting.MultiSelectSetting initialized27 = new client.setting.MultiSelectSetting(this, "Items", constructorKey3, (net.C_47OZ[]) (initialValue26));
        recovery$indy$flow$172(this, initialized27);
        java.util.ArrayList initialized28 = new java.util.ArrayList();
        recovery$indy$flow$175(this, initialized28);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$78(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$90(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$93(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$96(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$99(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$102(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$105(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$108(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$113(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$114(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$119(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$120(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$136(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$159(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$162() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$165(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$167(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$168(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$170();
    private static native void recovery$indy$flow$172(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$175(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native int recovery$indy$2(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native float[] recovery$indy$5(int var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$8(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$9(Projectiles_47H5 var0, int var1, ArrayList var2);
   private static native void recovery$indy$10(boolean var0, long var1, Object var3, long var4, long var6);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$29();
}
