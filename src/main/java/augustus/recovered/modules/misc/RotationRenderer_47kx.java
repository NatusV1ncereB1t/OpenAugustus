package augustus.recovered.modules.misc;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_406;
import client.Client;
import net.C_40n;
import net.C_478i;
import client.module.Module;
import client.setting.BooleanSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47rE;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47uo;
import net.C_47xz;
import net.C_49S;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class RotationRenderer_47kx extends client.module.Module implements client.event.RenderListener,net.C_47xz {
    private final client.setting.BooleanSetting settingRecordedPredictions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRecordedAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43W; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_46; // Runtime access flags and ConstantValue are restored from the original class.
    public double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private JsonArray method_49$0e96c6ec16(File var1, long var2) throws IOException {
      var2 = a ^ var2;
      long var4 = var2 ^ 34201805299689L;
      byte[] var6 = recovery$indy$1(var4, Files.readAllBytes(var1.toPath()), -1456406069096290255L, var2);
      return JsonParser.parseString(new String(var6, StandardCharsets.UTF_8)).getAsJsonArray();
   }



   public void onRender3D(long var1, float var3) {
      java.lang.Object var56;
        double var59;
        double var62;
        int var67;
      long var4 = var1 ^ 123905222240072L;
      long var6 = var1 ^ 75288905936760L;
      long var8 = var1 ^ 128548703178572L;
      long var10 = var1 ^ 28483910385441L;
      long var12 = var1 ^ 98483747655084L;
      long var14 = var1 ^ 69741958737225L;
      long var16 = var1 ^ 136119629532475L;
      int[] var18 = (int[])recovery$indy$flow$9(8135010977847865154L, var1);
      long var19 = System.currentTimeMillis();
      int var10000 = ((int) (recovery$indy$flow$11(203, var12, 8142119015880988301L, var1) ? 1 : 0));
      if (var18 == null) {
         if ((var10000) != 0) {
            this.field_430 = this.field_430 - (var19 - this.field_47) / 200.0;
         }

         var10000 = ((int) (recovery$indy$flow$15(205, var12, 8142119015880988301L, var1) ? 1 : 0));
      }

      int[] var10001 = var18;
      if (var1 >= 0L) {
         if (var18 == null) {
            if ((var10000) != 0) {
               this.field_430 = this.field_430 + (var19 - this.field_47) / 200.0;
            }

            this.field_430 = net.C_47sk.method_45$4b58f7ab41(this.field_430, 0.0, this.field_43h.size() - 1);
            double var70;
            var10000 = (var70 = this.field_42 - Math.floor(this.field_430)) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
         }

         var10001 = var18;
      }

      if (var10001 == null) {
         ;
      }

      int var21 = var10000;
      this.field_42 = (int)Math.floor(this.field_430);
      this.field_47 = var19;
      client.render.RenderUtils.method_42$da8c82d5d4();
      org.lwjgl.opengl.GL11.glPushMatrix();
      org.lwjgl.opengl.GL11.glTranslated(
         -((net.C_47j9)recovery$indy$flow$34(field_43, 8135051178398897955L, var1)).method_41$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$37(field_43, 8135051178398897955L, var1)).method_49$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$40(field_43, 8135051178398897955L, var1)).method_45$fedcb3e4d3()
      );
      net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(0.0F, 0.0F, 0.0F, 1.0F);
      org.lwjgl.opengl.GL11.glBegin(7);
      org.lwjgl.opengl.GL11.glVertex3d(-100.0, 90.0, -100.0);
      org.lwjgl.opengl.GL11.glVertex3d(-100.0, 90.0, 100.0);
      org.lwjgl.opengl.GL11.glVertex3d(100.0, 90.0, 100.0);
      org.lwjgl.opengl.GL11.glVertex3d(100.0, 90.0, -100.0);
      org.lwjgl.opengl.GL11.glEnd();
      int var22 = 0;
      int var23 = Math.max((int)this.field_430 - 10, 0);

      label370: {
         while (true) {
            if (var23 < Math.min(Math.ceil(this.field_430) - 1.0, this.field_46.size())) {
               double[] var24 = (double[])this.field_46.get(var23);
               net.C_47tf var25 = (net.C_47tf)recovery$indy$flow$60((float)var24[1], (float)var24[0], 8133600969630530085L, var1);
               net.C_47tf var26 = ((net.C_47tf)this.field_43h.get(var23)).method_45$8f851fab6c(this.field_49).method_47$a365857470(0.0, 1.62, 0.0);
               net.C_47tf var27 = ((net.C_47tf)this.field_43W.get(var23)).method_45$8f851fab6c(this.field_49);
               net.C_47tf var28 = var26.method_40$8f851fab6c(var25.method_46$90d20bf996(6.0));
               net.C_47tf var29 = var26.method_40$8f851fab6c(var25.method_46$90d20bf996(0.1));
               net.C_478i var30 = (net.C_478i)recovery$indy$flow$76(var27, var14, true, 8142263234408219887L, var1);
               double var31 = var22 / 20.0;
               var10000 = var22;
               if (var1 < 0L) {
                  break label370;
               }

               var67 = 18;
               if (var18 != null) {
                  break;
               }

               int[] var10002 = var18;
               if (var1 >= 0L) {
                  if (var18 == null) {
                     if (var22 >= 18) {
                        var31 *= 0.1;
                     }

                     var10000 = var22;
                     var67 = 17;
                  }

                  var10002 = var18;
               }

               label376: {
                  if (var10002 == null) {
                     if (var10000 == var67) {
                        var31 *= 0.05;
                     }

                     var10000 = var22;
                     if (var18 != null) {
                        break label376;
                     }

                     var67 = 17;
                  }

                  if (var10000 < var67) {
                     var31 *= 0.01;
                  }

                  org.lwjgl.opengl.GL11.glColor4d(1.0, 1.0, 1.0, var31);
                  org.lwjgl.opengl.GL11.glBegin(3);
                  org.lwjgl.opengl.GL11.glVertex3d(var26.field_40, var26.field_41, var26.field_47);
                  org.lwjgl.opengl.GL11.glVertex3d(var28.field_40, var28.field_41, var28.field_47);
                  org.lwjgl.opengl.GL11.glEnd();
                  org.lwjgl.opengl.GL11.glColor4d(1.0, 0.0, 0.0, var31);
                  var10000 = 3;
               }

               org.lwjgl.opengl.GL11.glBegin(var10000);
               org.lwjgl.opengl.GL11.glVertex3d(var26.field_40, var26.field_41, var26.field_47);
               org.lwjgl.opengl.GL11.glVertex3d(var29.field_40, var29.field_41, var29.field_47);
               org.lwjgl.opengl.GL11.glEnd();
               org.lwjgl.opengl.GL11.glColor4d(1.0, 1.0, 1.0, var31);
               client.render.RenderUtils.method_41$6059593eaa(var30);
               var22++;
               var23++;
               if (var18 == null) {
                  continue;
               }
            }

            var10000 = (int)(Math.ceil(this.field_430) - 1.0);
            if (var1 < 0L) {
               break label370;
            }

            var67 = 0;
            break;
         }

         var23 = net.C_47sk.method_49$cabccf1c64(var10000, var67, this.field_46.size());
         var10000 = (int)Math.min(Math.ceil(this.field_430), this.field_46.size());
      }

      int var42 = var10000;
      double var43 = this.field_430 % 1.0;
      net.C_47tf var44 = ((net.C_47tf)this.field_43W.get(var23)).method_48$d6978c8819((net.C_47tf)this.field_43W.get(var42), var43).method_45$8f851fab6c(this.field_49);
      net.C_478i var45 = (net.C_478i)recovery$indy$flow$121(var44, var14, true, 8142263234408219887L, var1);
      org.lwjgl.opengl.GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
      client.render.RenderUtils.method_41$6059593eaa(net.C_478i.method_49$31245ca15a(var44.method_47$a365857470(0.0, 1.62, 0.0), 0.05));
      net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(0.0F, 1.0F, 0.0F, 1.0F);
      client.render.RenderUtils.method_41$6059593eaa(net.C_478i.method_49$31245ca15a(var44.method_47$a365857470(0.0, 1.62, 0.0), 0.4));
      double[] var46 = (double[])this.field_46.get(var23);
      double[] var47 = (double[])this.field_46.get(var42);
      double[] var48 = null;
      double var32 = Double.NaN;
      double var34 = var46[0];
      int var36 = var23;

      label347:
      while (true) {
         if (var36 < this.field_46.size()) {
            var56 = this.field_46.get(var36);

            while (true) {
               label307: {
                  double[] var50 = (double[])var56;
                  if (var1 >= 0L) {
                     double[] var60 = var48;
                     if (var18 == null) {
                        if (var48 != null) {
                           label379: {
                              double var52 = recovery$indy$flow$143(
                                 var8, net.C_47sk.method_48$294c1e5b96(var48[0]), net.C_47sk.method_48$294c1e5b96(var50[0]), 8135147783971682937L, var1
                              );
                              double var71;
                              var10000 = (var71 = Math.abs(var52) - 0.15) == 0.0 ? 0 : (var71 < 0.0 ? -1 : 1);
                              if (var18 == null) {
                                 label297: {
                                    if (var10000 <= 0) {
                                       var62 = var50[0];
                                       if (var1 <= 0L) {
                                          break label297;
                                       }

                                       var34 = var62;
                                       if (var18 == null) {
                                          break label307;
                                       }
                                    }

                                    var62 = var32;
                                 }

                                 if (var18 != null) {
                                    break label379;
                                 }

                                 var10000 = ((int) (Double.isFinite(var62) ? 1 : 0));
                              }

                              label291:
                              if (var10000 != 0) {
                                 var62 = Math.signum(var32);
                                 if (var18 != null) {
                                    break label379;
                                 }

                                 double var69 = Math.signum(var52);
                                 if (var1 > 0L) {
                                    if (var62 == var69) {
                                       break label291;
                                    }

                                    var62 = var50[0];
                                    var69 = var32 / (var52 - var32) * var52;
                                 }

                                 var34 = net.C_47sk.method_48$294c1e5b96(var62 + var69);
                                 if (var18 == null) {
                                    break label307;
                                 }
                              }

                              var62 = var52;
                           }

                           var32 = var62;
                        }

                        var60 = var50;
                     }

                     var48 = var60;
                     var36++;
                  }

                  if (var18 == null) {
                     break;
                  }
               }

               var56 = new net.C_47rE(10);
               if (var1 > 0L) {
                  break label347;
               }
            }
         } else {
            while (true) {
               var56 = new net.C_47rE(10);
               if (var1 > 0L) {
                  break label347;
               }

               double[] var37 = (double[])var56;
               if (var1 >= 0L) {
                  double[] var57 = var48;
                  if (var18 == null) {
                     if (var48 != null) {
                        label384: {
                           double var38 = recovery$indy$flow$143(
                              var8, net.C_47sk.method_48$294c1e5b96(var48[0]), net.C_47sk.method_48$294c1e5b96(var37[0]), 8135147783971682937L, var1
                           );
                           double var72;
                           var10000 = (var72 = Math.abs(var38) - 0.15) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
                           if (var18 == null) {
                              label333: {
                                 if (var10000 <= 0) {
                                    var59 = var37[0];
                                    if (var1 <= 0L) {
                                       break label333;
                                    }

                                    var34 = var59;
                                    if (var18 == null) {
                                       continue;
                                    }
                                 }

                                 var59 = var32;
                              }

                              if (var18 != null) {
                                 break label384;
                              }

                              var10000 = ((int) (Double.isFinite(var59) ? 1 : 0));
                           }

                           label327:
                           if (var10000 != 0) {
                              var59 = Math.signum(var32);
                              if (var18 != null) {
                                 break label384;
                              }

                              double var68 = Math.signum(var38);
                              if (var1 > 0L) {
                                 if (var59 == var68) {
                                    break label327;
                                 }

                                 var59 = var37[0];
                                 var68 = var32 / (var38 - var32) * var38;
                              }

                              var34 = net.C_47sk.method_48$294c1e5b96(var59 + var68);
                              if (var18 == null) {
                                 continue;
                              }
                           }

                           var59 = var38;
                        }

                        var32 = var59;
                     }

                     var57 = var37;
                  }

                  var48 = var57;
                  var36++;
               }

               if (var18 == null) {
                  break;
               }
            }
         }
      }

      Object var49 = var56;
      net.C_47rE var51 = new net.C_47rE(10);
      int var53 = Math.max((int)this.field_430 - 10, 0);

      label267: {
         while (true) {
            if (var53 < Math.min(Math.ceil(this.field_430) - 1.0, this.field_43h.size())) {
               recovery$indy$flow$165(var49, var6, new net.C_40n((net.C_47tf)this.field_43h.get(var53), var53), 8142079263030033841L, var1);
               var53++;
               int[] var63 = var18;
               if (var1 > 0L) {
                  if (var18 != null) {
                     break;
                  }

                  var63 = var18;
               }

               if (var63 == null) {
                  continue;
               }
            }

            var10000 = Math.max((int)this.field_430 - 10, 0);
            if (var1 <= 0L) {
               while (true) {
                  if (var1 <= 0L) {
                     break label267;
                  }

                  if (var10000 < 0) {
                     recovery$indy$flow$175(var51, var6, this.field_43W.get(var53), 8142079263030033841L, var1);
                     var53++;
                     int[] var65 = var18;
                     if (var1 > 0L) {
                        if (var18 != null) {
                           return;
                        }

                        var65 = var18;
                     }

                     if (var65 == null) {
                        double var73;
                        var10000 = (var73 = var53 - Math.min(Math.ceil(this.field_430) - 1.0, this.field_43W.size())) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
                        continue;
                     }
                  }

                  var10000 = ((int) (recovery$indy$flow$176(var49, var10, 8134575490504027339L, var1) ? 1 : 0));
                  if (var1 > 0L) {
                     break label267;
                  }
               }
            }

            var53 = var10000;
            break;
         }

         label249:
         while (true) {
            double var74;
            var10000 = (var74 = var53 - Math.min(Math.ceil(this.field_430) - 1.0, this.field_43W.size())) == 0.0 ? 0 : (var74 < 0.0 ? -1 : 1);

            while (true) {
               if (var1 <= 0L) {
                  break label249;
               }

               if (var10000 < 0) {
                  recovery$indy$flow$175(var51, var6, this.field_43W.get(var53), 8142079263030033841L, var1);
                  var53++;
                  int[] var66 = var18;
                  if (var1 > 0L) {
                     if (var18 != null) {
                        return;
                     }

                     var66 = var18;
                  }

                  if (var66 == null) {
                     break;
                  }
               }

               var10000 = ((int) (recovery$indy$flow$176(var49, var10, 8134575490504027339L, var1) ? 1 : 0));
               if (var1 > 0L) {
                  break label249;
               }
            }
         }
      }

      if (var10000 != 0) {
         double var54 = recovery$indy$flow$177(this, var49, var51, 0, var4, (((var21) & 1) != 0), 8134630902521681487L, var1);
         double var40 = recovery$indy$flow$178(this, var49, var51, 1, var4, (((var21) & 1) != 0), 8134630902521681487L, var1);
         recovery$indy$flow$180(
            this,
            var44.method_47$a365857470(0.0, 1.62, 0.0),
            new double[]{var54, var46[1]},
            new double[]{var54, var47[1]},
            var43,
            var23,
            var42,
            var16,
            1.0,
            1.0,
            0.0,
            8134253907827983521L,
            var1
         );
         recovery$indy$flow$182(
            this,
            var44.method_47$a365857470(0.0, 1.62, 0.0),
            new double[]{var40, var46[1]},
            new double[]{var40, var47[1]},
            var43,
            var23,
            var42,
            var16,
            1.0,
            1.0,
            0.0,
            8134253907827983521L,
            var1
         );
      }

      recovery$indy$flow$184(
         this, var44.method_47$a365857470(0.0, 1.62, 0.0), var46, var47, var43, var23, var42, var16, 1.0, 1.0, 1.0, 8134253907827983521L, var1
      );
      recovery$indy$flow$186(
         this,
         var44.method_47$a365857470(0.0, 1.62, 0.0),
         new double[]{var34, var46[1]},
         new double[]{var34, var47[1]},
         var43,
         var23,
         var42,
         var16,
         0.8,
         0.5,
         0.4,
         8134253907827983521L,
         var1
      );
      org.lwjgl.opengl.GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
      client.render.RenderUtils.method_41$6059593eaa(var45);
      client.render.RenderUtils.method_43$da8c82d5d4();
      org.lwjgl.opengl.GL11.glPopMatrix();
      net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
   }










   private double method_43$224abdc56a(C_47rE var1, C_47rE var2, int var3, long var4, boolean var6) {
      double[] var56;
      double var57;
      double var59;
      var4 = a ^ var4;
      long var7 = var4 ^ 121554191524637L;
      long var9 = var4 ^ 102134962229831L;
      long var11 = var4 ^ 10329071922292L;
      long var13 = var4 ^ 137884938119297L;
      long var15 = var4 ^ 76930220772278L;
      long var17 = var4 ^ 137519644554391L;
      long var19 = var4 ^ 132238930431139L;
      long var21 = var4 ^ 60352169937540L;
      C_49S var24 = new C_49S(4);
      int[] var10000 = recovery$indy$21(-2943008967262091121L, var4);
      double var25 = Double.NaN;
      double var27 = 0.0;
      int[] var23 = var10000;
      double var29 = 0.0;
      byte var31 = 4;
      int var32 = 0;
      int var33 = 3;

      label100:
      while (true) {
         Object var55;
         if (var33 > 0) {
            var55 = recovery$indy$22(var1, var19, var33 + 4, -2941372879225249691L, var4);
         } else {
            var55 = var24;
            if (var4 >= 0L) {
               var56 = recovery$indy$30(var24, var9, -2941666050225908296L, var4);
               break;
            }
         }

         do {
            C_40n var34 = (C_40n)var55;
            C_47tf var35 = var34.field_43w;
            C_47tf var36 = (C_47tf)recovery$indy$23(var2, var19, var33 + 4, -2941372879225249691L, var4);
            C_478i var37 = recovery$indy$24(var36, var21, true, -2940242765387422942L, var4);
            var56 = recovery$indy$25(var35, var37, var17, -2942744580923785025L, var4);
            if (var23 != null) {
               break label100;
            }

            label105: {
               double[] var38;
               var38 = var56;
               var57 = var25;
               label94:
               if (var23 == null) {
                  int var58 = (int) ((Double.isNaN(var25)) ? 1 : 0);
                  if (var4 >= 0L) {
                     if (var58 == 0) {
                        var57 = recovery$indy$28(
                              var13, C_47sk.method_48$294c1e5b96(var27), C_47sk.method_48$294c1e5b96(var38[var3]), -2942873370171302476L, var4
                           )
                           + var29;
                        break label94;
                     }

                     var25 = C_47sk.method_48$294c1e5b96(var38[var3]);
                     recovery$indy$26(var24, var7, 0.0, -2941827208298036977L, var4);
                     var27 = var25;
                     var58 = ((C_40n)recovery$indy$27(var1, var19, 0, -2941372879225249691L, var4)).field_45 - var34.field_45;
                  }

                  var32 = var58;
                  if (var4 < 0L) {
                     if (var23 == null) {
                        continue label100;
                     }
                     break label105;
                  }

                  if (var23 == null) {
                     var33--;
                     if (var23 == null) {
                        continue label100;
                     }
                     break label105;
                  }

                  var57 = recovery$indy$28(var13, C_47sk.method_48$294c1e5b96(var27), C_47sk.method_48$294c1e5b96(var38[var3]), -2942873370171302476L, var4)
                     + var29;
               }

               double var39 = var57;
               recovery$indy$29(var24, var7, var39, -2941827208298036977L, var4);
               var27 = var38[var3];
               var29 = var39;
               var33--;
               if (var23 == null) {
                  continue label100;
               }
            }

            var55 = var24;
         } while (var4 < 0L);

         var56 = recovery$indy$30(var24, var9, -2941666050225908296L, var4);
         break;
      }

      double[] var49 = var56;
      double var50 = var49[0] * var32 + var49[1];
      double var51 = var49[0] * (var32 + 1) + var49[1];
      double var52 = recovery$indy$31(var24, var15, -2941838721838346464L, var4);
      double var40 = 0.0;
      double var42 = 0.0;
      int var44 = 0;

      label63:
      while (true) {
         if (var44 < recovery$indy$32(var24, -2942580289579377226L, var4).size()) {
            double var45 = (Double)recovery$indy$33(var24, -2942580289579377226L, var4).get(var44);
            var40 += Math.pow(var45 - var52, 2.0);
            if (var4 > 0L) {
               var59 = var42 + Math.pow(var45 - (var49[0] * var44 + var49[1]), 2.0);
               if (var23 != null) {
                  break;
               }

               var42 = var59;
               var44++;
            }

            if (var23 == null) {
               continue;
            }
         }

         do {
            double var60 = recovery$indy$38(
               var13,
               C_47sk.method_48$294c1e5b96(
                  recovery$indy$37(
                     ((C_40n)recovery$indy$34(var1, var19, 0, -2941372879225249691L, var4)).field_43w,
                     recovery$indy$36((C_47tf)recovery$indy$35(var2, var19, 0, -2941372879225249691L, var4), var21, true, -2940242765387422942L, var4),
                     var17,
                     -2942744580923785025L,
                     var4
                  )[var3]
               ),
               C_47sk.method_48$294c1e5b96(var50 + var25),
               -2942873370171302476L,
               var4
            );
            if (var4 > 0L) {
               var59 = Math.abs(var60);
               break label63;
            }

            double var54 = var60;
            var40 += Math.pow(var54 - var52, 2.0);
            if (var4 > 0L) {
               var59 = var42 + Math.pow(var54 - (var49[0] * var44 + var49[1]), 2.0);
               if (var23 != null) {
                  break label63;
               }

               var42 = var59;
               var44++;
            }
         } while (var23 != null);
      }

      double var53 = var59;
      double var46 = Math.abs(
         recovery$indy$43(
            var13,
            C_47sk.method_48$294c1e5b96(
               recovery$indy$42(
                  ((C_40n)recovery$indy$39(var1, var19, 0, -2941372879225249691L, var4)).field_43w,
                  recovery$indy$41((C_47tf)recovery$indy$40(var2, var19, 0, -2941372879225249691L, var4), var21, true, -2940242765387422942L, var4),
                  var17,
                  -2942744580923785025L,
                  var4
               )[var3]
            ),
            C_47sk.method_48$294c1e5b96(var51 + var25),
            -2942873370171302476L,
            var4
         )
      );
      if (var6) {
         recovery$indy$55(
            var11,
            "#"
               + this.field_430
               + recovery$indy$44(13105, 4982397950924207125L ^ var4)
               + recovery$indy$45(var50, 3, -2941488651727333471L, var4)
               + recovery$indy$46(27297, 257580190891568526L ^ var4)
               + recovery$indy$47(1.0 - var42 / var40, 7, -2941488651727333471L, var4)
               + recovery$indy$48(28097, 2862919814688828143L ^ var4)
               + recovery$indy$49(var53, 4, -2941488651727333471L, var4)
               + recovery$indy$50(11533, 5932964096285747757L ^ var4)
               + recovery$indy$51(var46, 4, -2941488651727333471L, var4)
               + " "
               + Arrays.toString(recovery$indy$52(var24, -2942580289579377226L, var4).toArray())
               + recovery$indy$53(10264, 201615785004314420L ^ var4)
               + var32
               + recovery$indy$54(24853, 424616477922420276L ^ var4)
               + Arrays.toString(var49),
            -2941024514840606040L,
            var4
         );
      }

      return C_47sk.method_48$294c1e5b96(var50 + var25);
   }






   private void method_43$a948e41c94(
      C_47tf var1, double[] var2, double[] var3, double var4, int var6, int var7, long var8, double var10, double var12, double var14
   ) {
      var8 = a ^ var8;
      long var16 = var8 ^ 129862264816370L;
      double var18 = recovery$indy$56(var16, C_47sk.method_48$294c1e5b96(var2[0]), C_47sk.method_48$294c1e5b96(var3[0]), 9033054542242002887L, var8);
      double var20 = var3[1] - var2[1];
      C_47tf var22 = recovery$indy$57((float)(var2[1] + var20 * var4), (float)(var2[0] + var18 * var4), 9033754715451144091L, var8);
      C_47tf var23 = ((C_47tf)this.field_43h.get(var6))
         .method_48$d6978c8819((C_47tf)this.field_43h.get(var7), var4)
         .method_45$8f851fab6c(this.field_49)
         .method_47$a365857470(0.0, 1.62, 0.0);
      C_47tf var24 = var23.method_40$8f851fab6c(var22.method_46$90d20bf996(6.0));
      C_47tf var25 = var23.method_40$8f851fab6c(var22.method_46$90d20bf996(0.1));
      GL11.glColor4d(var10, var12, var14, 1.0);
      GL11.glBegin(3);
      GL11.glVertex3d(var23.field_40, var23.field_41, var23.field_47);
      GL11.glVertex3d(var24.field_40, var24.field_41, var24.field_47);
      GL11.glEnd();
      GL11.glColor4d(1.0, 0.0, 0.0, 1.0);
      GL11.glBegin(3);
      GL11.glVertex3d(var23.field_40, var23.field_41, var23.field_47);
      GL11.glVertex3d(var25.field_40, var25.field_41, var25.field_47);
      GL11.glEnd();
      GL11.glColor4d(0.0, 0.0, 1.0, 1.0);
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$58(this, 32, var3, -7101177144236983205L, var1);
      recovery$indy$59(this, 40, var3, -7101177144236983205L, var1);
   }



   public void method_43F$e45a9973e5(long var1) {
      recovery$indy$63(recovery$indy$62(recovery$indy$61(2170207128415519059L, var1), 2170592300255173211L, var1), 2170448729258972921L, var1).remove(this);
      recovery$indy$66(recovery$indy$65(recovery$indy$64(2170207128415519059L, var1), 2170592300255173211L, var1), 2169941774962225159L, var1).remove(this);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
      this.field_43W.clear();
      this.field_46.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 15611559894714L;
      long var8 = var4 ^ 66076636450475L;
      int[] var10 = (int[])recovery$indy$flow$343(2730962282012949057L, var4);
      if ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$345(field_43, 2737259457316587764L, var4) == null) {
         recovery$indy$flow$346(this, 2737303677953378752L, var4);
      } else {
         java.awt.FileDialog var11 = new java.awt.FileDialog((java.awt.Frame)null);
         var11.setVisible(true);
         java.io.File var12 = new java.io.File(var11.getDirectory() + var11.getFile());

         try {
            this.field_46.clear();
            this.field_43h.clear();
            this.field_43W.clear();
            com.google.gson.JsonArray var13 = (com.google.gson.JsonArray)recovery$indy$flow$366(this, var12, var8, 2737175439842917210L, var4);
            com.google.gson.Gson var14 = new com.google.gson.Gson();
            java.util.ArrayList var15 = new java.util.ArrayList();
            int var16 = 0;

            while (var16 < var13.size()) {
               com.google.gson.JsonObject var17 = var13.get(var16).getAsJsonObject();
               var15.add(var14.fromJson(var17, net.C_47Fb.class));
               var16++;
               int[] var10000 = var10;
               if (var2 >= 0) {
                  if (var10 != null) {
                     return;
                  }

                  var10000 = var10;
               }

               if (var10000 != null) {
                  break;
               }
            }

            if (var3 > 0) {
               for (Object recovered$element$8621 : var15) {
         net.C_47Fb var20 = (net.C_47Fb) recovered$element$8621;
                  this.field_46.add(new double[]{var20.field_48, var20.field_463});
                  this.field_43h.add(new net.C_47tf(var20.field_46r, var20.field_44, var20.field_47));
                  this.field_43W.add(new net.C_47tf(var20.field_45, var20.field_42, var20.field_46));
                  int[] var21 = var10;
                  if (var3 >= 0) {
                     if (var10 != null) {
                        return;
                     }

                     var21 = var10;
                  }

                  if (var21 != null) {
                     break;
                  }
               }

               this.field_49 = ((net.C_47tf)this.field_43W.get(0)).method_47$a365857470(0.0, -100.0, 0.0);
               this.field_430 = 0.0;
               recovery$indy$flow$415(
                  var6,
                  (String)recovery$indy$flow$407(27619, 3501133511504338440L ^ var4)
                     + this.field_46.size()
                     + (String)recovery$indy$flow$412(4459, 8493394138787800200L ^ var4),
                  2729575682264217702L,
                  var4
               );
               if (var3 >= 0) {
               }
            }
         } catch (Throwable var18) {
            var18.printStackTrace();
            recovery$indy$flow$417(this, 2737303677953378752L, var4);
         }
      }
   }




   public void method_487$da8c82d5d4() {
      long var1 = a ^ 129677291652305L;
      long var3 = var1 ^ 81150188468503L;
      long var10000 = -4296912064399156231L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      Minecraft var37 = field_43;
      if (var5 == null) {
         long var10001 = -4297606483078254143L;
         Minecraft var15 = field_43;
         if (var15.field_44m != null) {
            var10001 = -4303981494925067148L;
            Minecraft var16 = field_43;
            var16.field_42P.field_42 = 0.0;
            return;
         }

         var10001 = -4298525515797199728L;
         Minecraft var17 = field_43;
         var17.field_44r.field_45H.field_45 = false;
         var10001 = -4298525515797199728L;
         Minecraft var18 = field_43;
         var18.field_44r.field_42R.field_45 = false;
         var10001 = -4298525515797199728L;
         Minecraft var19 = field_43;
         var19.field_44r.field_42P.field_45 = false;
         var10001 = -4298525515797199728L;
         Minecraft var20 = field_43;
         var20.field_44r.field_42b.field_45 = false;
         var10001 = -4298525515797199728L;
         Minecraft var21 = field_43;
         var21.field_44r.field_44q.field_45 = false;
         var10001 = -4298525515797199728L;
         Minecraft var22 = field_43;
         var22.field_44r.field_44W.field_45 = false;
         var37 = field_43;
      }

      long var51 = -4303981494925067148L;
      Minecraft var23 = var37;
      double var6 = var23.field_42P.field_48h + 90.0F;
      boolean var8 = false;
      var51 = -4298525515797199728L;
      Minecraft var24 = field_43;
      int var38 = var24.field_44r.field_45H.method_45$8abf5c6871();
      long var10002 = -4303877431604174282L;
      boolean var9 = C_47uo.method_45$800bd538b0(var38, var3);
      var51 = -4298525515797199728L;
      Minecraft var25 = field_43;
      int var39 = var25.field_44r.field_42R.method_45$8abf5c6871();
      var10002 = -4303877431604174282L;
      boolean var10 = C_47uo.method_45$800bd538b0(var39, var3);
      boolean var40 = var9;
      if (var5 == null) {
         if (var9) {
            var8 = true;
         }

         var40 = var10;
      }

      if (var5 == null) {
         if (var40) {
            var6 -= 180.0;
            var8 = true;
         }

         var51 = -4298525515797199728L;
         Minecraft var26 = field_43;
         int var41 = var26.field_44r.field_42P.method_45$8abf5c6871();
         var10002 = -4303877431604174282L;
         var40 = C_47uo.method_45$800bd538b0(var41, var3);
      }

      if (var5 == null) {
         if (var40) {
            label117: {
               if (!var10) {
                  var6 -= var9 ? 45.0 : 90.0;
                  if (var5 == null) {
                     break label117;
                  }
               }

               var6 += 45.0;
            }

            var8 = true;
         }

         var51 = -4298525515797199728L;
         Minecraft var27 = field_43;
         int var42 = var27.field_44r.field_42b.method_45$8abf5c6871();
         var10002 = -4303877431604174282L;
         var40 = C_47uo.method_45$800bd538b0(var42, var3);
      }

      if (var5 == null) {
         if (var40) {
            label105: {
               if (!var10) {
                  var6 += var9 ? 45.0 : 90.0;
                  if (var5 == null) {
                     break label105;
                  }
               }

               var6 -= 45.0;
            }

            var8 = true;
         }

         var51 = -4303981494925067148L;
         Minecraft var28 = field_43;
         var28.field_42P.field_42 = 0.0;
         var51 = -4298525515797199728L;
         Minecraft var29 = field_43;
         int var43 = var29.field_44r.field_44q.method_45$8abf5c6871();
         var10002 = -4303877431604174282L;
         var40 = C_47uo.method_45$800bd538b0(var43, var3);
      }

      if (var5 == null) {
         if (var40) {
            var51 = -4303981494925067148L;
            Minecraft var30 = field_43;
            var30.field_42P.field_42 -= 0.05;
         }

         var51 = -4298525515797199728L;
         Minecraft var31 = field_43;
         int var44 = var31.field_44r.field_44W.method_45$8abf5c6871();
         var10002 = -4303877431604174282L;
         var40 = C_47uo.method_45$800bd538b0(var44, var3);
      }

      if (var5 == null) {
         if (var40) {
            var51 = -4303981494925067148L;
            Minecraft var32 = field_43;
            var32.field_42P.field_42 += 0.05;
         }

         var40 = var8;
      }

      if (var40) {
         double var11 = Math.cos(Math.toRadians(var6)) * 0.8944271909999159 / 10.0;
         double var13 = Math.sin(Math.toRadians(var6)) * 0.8944271909999159 / 10.0;
         var51 = -4303981494925067148L;
         Minecraft var33 = field_43;
         var33.field_42P.field_48s = var11;
         var51 = -4303981494925067148L;
         Minecraft var34 = field_43;
         var34.field_42P.field_487 = var13;
         if (var5 == null) {
            return;
         }
      }

      var51 = -4303981494925067148L;
      Minecraft var35 = field_43;
      var35.field_42P.field_48s = 0.0;
      var51 = -4303981494925067148L;
      Minecraft var36 = field_43;
      var36.field_42P.field_487 = 0.0;
   }






    public RotationRenderer_47kx(long a0) {
        super((java.lang.String) ("RotationRenderer"),(java.lang.String) ("RotationsAnzeiger"),(long) (((augustus.recovered.modules.misc.RotationRenderer_47kx.a ^ a0) ^ 73856989151412L)),(java.awt.Color) (java.awt.Color.BLACK),(client.module.Category) (client.module.Category.MISC));
        long settingKey = ((augustus.recovered.modules.misc.RotationRenderer_47kx.a ^ a0) ^ 55012763671727L);
        client.setting.BooleanSetting predictions = new client.setting.BooleanSetting(this, settingKey, "Recorded Predictions", false);
        recovery$indy$flow$533(this, predictions);
        client.setting.BooleanSetting aura = new client.setting.BooleanSetting(this, settingKey, "Recorded Aura", false);
        recovery$indy$flow$536(this, aura);
        recovery$indy$flow$539(this, new java.util.ArrayList());
        recovery$indy$flow$542(this, new java.util.ArrayList());
        recovery$indy$flow$545(this, new java.util.ArrayList());
        recovery$indy$flow$546(this, 0.0D);
        recovery$indy$flow$547(this, 0);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$9(long a0,long a1);
    private static native boolean recovery$indy$flow$11(int a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$15(int a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$34(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$37(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$40(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$60(float a0,float a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,boolean a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,long a1,boolean a2,long a3,long a4);
    private static native double recovery$indy$flow$143(long a0,double a1,double a2,long a3,long a4);
    private static native void recovery$indy$flow$165(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native void recovery$indy$flow$175(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native boolean recovery$indy$flow$176(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$177(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,long a4,boolean a5,long a6,long a7);
    private static native double recovery$indy$flow$178(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,long a4,boolean a5,long a6,long a7);
    private static native void recovery$indy$flow$180(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3,double a4,int a5,int a6,long a7,double a8,double a9,double a10,long a11,long a12);
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3,double a4,int a5,int a6,long a7,double a8,double a9,double a10,long a11,long a12);
    private static native void recovery$indy$flow$184(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3,double a4,int a5,int a6,long a7,double a8,double a9,double a10,long a11,long a12);
    private static native void recovery$indy$flow$186(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3,double a4,int a5,int a6,long a7,double a8,double a9,double a10,long a11,long a12);
    private static native java.lang.Object recovery$indy$flow$343(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$345(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$346(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$366(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$407(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$412(int a0,long a1);
    private static native void recovery$indy$flow$415(long a0,java.lang.Object a1,long a2,long a3);
    private static native void recovery$indy$flow$417(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$533(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$536(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$539(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRenderer_47kx) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$542(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRenderer_47kx) (a0)).field_43W = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$545(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRenderer_47kx) (a0)).field_46 = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$546(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.RotationRenderer_47kx) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$547(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.RotationRenderer_47kx) (a0)).field_42 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native byte[] recovery$indy$1(long var0, Object var2, long var3, long var5);
   private static native int[] recovery$indy$21(long var0, long var2);
   private static native Object recovery$indy$22(Object var0, long var1, int var3, long var4, long var6);
   private static native Object recovery$indy$23(Object var0, long var1, int var3, long var4, long var6);
   private static native C_478i recovery$indy$24(Object var0, long var1, boolean var3, long var4, long var6);
   private static native double[] recovery$indy$25(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$26(Object var0, long var1, double var3, long var5, long var7);
   private static native Object recovery$indy$27(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$28(long var0, double var2, double var4, long var6, long var8);
   private static native void recovery$indy$29(Object var0, long var1, double var3, long var5, long var7);
   private static native double[] recovery$indy$30(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native ArrayList recovery$indy$32(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$33(Object var0, long var1, long var3);
   private static native Object recovery$indy$34(Object var0, long var1, int var3, long var4, long var6);
   private static native Object recovery$indy$35(Object var0, long var1, int var3, long var4, long var6);
   private static native C_478i recovery$indy$36(Object var0, long var1, boolean var3, long var4, long var6);
   private static native double[] recovery$indy$37(Object var0, Object var1, long var2, long var4, long var6);
   private static native double recovery$indy$38(long var0, double var2, double var4, long var6, long var8);
   private static native Object recovery$indy$39(Object var0, long var1, int var3, long var4, long var6);
   private static native Object recovery$indy$40(Object var0, long var1, int var3, long var4, long var6);
   private static native C_478i recovery$indy$41(Object var0, long var1, boolean var3, long var4, long var6);
   private static native double[] recovery$indy$42(Object var0, Object var1, long var2, long var4, long var6);
   private static native double recovery$indy$43(long var0, double var2, double var4, long var6, long var8);
   private static native String recovery$indy$44(int var0, long var1);
   private static native String recovery$indy$45(double var0, int var2, long var3, long var5);
   private static native String recovery$indy$46(int var0, long var1);
   private static native String recovery$indy$47(double var0, int var2, long var3, long var5);
   private static native String recovery$indy$48(int var0, long var1);
   private static native String recovery$indy$49(double var0, int var2, long var3, long var5);
   private static native String recovery$indy$50(int var0, long var1);
   private static native String recovery$indy$51(double var0, int var2, long var3, long var5);
   private static native ArrayList recovery$indy$52(Object var0, long var1, long var3);
   private static native String recovery$indy$53(int var0, long var1);
   private static native String recovery$indy$54(int var0, long var1);
   private static native void recovery$indy$55(long var0, Object var2, long var3, long var5);
   private static native double recovery$indy$56(long var0, double var2, double var4, long var6, long var8);
   private static native C_47tf recovery$indy$57(float var0, float var1, long var2, long var4);
   private static native void recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$59(Object var0, int var1, long var2, long var4, long var6);
   private static native Client recovery$indy$61(long var0, long var2);
   private static native C_406 recovery$indy$62(Object var0, long var1, long var3);
   private static native CopyOnWriteArrayList recovery$indy$63(Object var0, long var1, long var3);
   private static native Client recovery$indy$64(long var0, long var2);
   private static native C_406 recovery$indy$65(Object var0, long var1, long var3);
   private static native CopyOnWriteArrayList recovery$indy$66(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$75();
}
