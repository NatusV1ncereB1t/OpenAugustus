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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40t;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Fw;
import net.minecraft.client.gui.FontRenderer;
import net.C_47LS;
import client.module.Module;
import client.font.FontFace;
import net.C_47Pn;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g5;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47uI;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class HUD_47H2 extends Module implements RenderListener {
   public final ModeSetting settingMode;
   public final ModeSetting settingSide;
   public final ModeSetting settingCasing;
   private final NumberSetting settingXPos;
   private final NumberSetting settingYPos;
   private final NumberSetting settingScale;
   public final NumberSetting settingSize;
   private final NumberSetting settingNewFontSize;
   private final ColorSetting settingColor;
   private final BooleanSetting settingBackGround;
   private final BooleanSetting settingRoudedBackGround;
   private final NumberSetting settingRoundFactor;
   private final ColorSetting settingBackGroundColor;
   private final ShaderOptions settingHud;
   private final String field_43E;
   private final String field_43Y;
   private final ResourceLocation field_41J;
   private final ResourceLocation field_49;
   private final ResourceLocation field_415;
   private final ResourceLocation field_41a;
   private int field_43y;
   private static final long a = C_4f.a(7369950506259646190L, 1841426548125051119L, MethodHandles.lookup().lookupClass()).a(32789703482206L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[76];
   private static final String[] f = new String[76];

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Class b(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private void method_42$750d056189(ScaledResolution var1, int var2, RenderPass var3) {
      long var4 = a ^ 94094814068184L;
      long var6 = var4 ^ 19743370898378L;
      long var8 = var4 ^ 81299773068871L;
      long var10 = var4 ^ 100324130428478L;
      FontFace var10000 = C_40t.field_42k;
      String var10002 = this.field_43E;
      float var10003 = var1.method_46$8abf5c6871();
      long var10007 = -5020908950440728529L;
      long var12 = var8;
      String var14 = this.field_43E;
      FontFace var15 = C_40t.field_42k;
      double var30 = var10003 - var15.method_40$4795379639(var14, var12);
      long var10009 = -5019432504114517430L;
      int var16 = var2;
      long var17 = var10;
      RenderPass var19 = var3;
      ShaderOptions var20 = this.settingHud;
      int var10005 = var20.method_40$d68b376f5b(var19, var17, var16);
      long var10006 = -5022691549325965631L;
      int var21 = var10005;
      double var22 = 4.0;
      double var24 = var30;
      String var26 = var10002;
      long var27 = var6;
      FontFace var29 = var10000;
      var29.method_49$ef463a66c2(var27, var26, var24, var22, var21);
   }

   private void method_42$c92fa76846(int var1, float var2, float var3, RenderPass var4) {
      int var14;
      label20: {
         long var5 = a ^ 79828431484487L;
         long var7 = var5 ^ 129015107255740L;
         long var9 = var5 ^ 32894835823489L;
         long var11 = var5 ^ 77172753735073L;
         long var10000 = 3588271794642790394L;
         int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
         ShaderOptions var28 = this.settingHud;
         long var10005 = 3591436572985051448L;
         long var15 = var9;
         int var17 = var1;
         RenderPass var18 = var4;
         int var10003 = C_47TX.method_40$6b468acafc(var18, var17, var15);
         long var10004 = 3587250925465428437L;
         int var19 = var10003;
         long var20 = var11;
         RenderPass var22 = var4;
         ShaderOptions var23 = var28;
         var14 = var23.method_40$d68b376f5b(var22, var20, var19);
         if (var13 == null) {
            long var10001 = 3589153275330122096L;
            BooleanSetting var24 = this.settingRoudedBackGround;
            if (!var24.method_49$aae029aa0a()) {
               break label20;
            }

            float var10002 = var2 + 6.0F;
            long var10006 = 3589361041306718090L;
            long var25 = var7;
            NumberSetting var27 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(0.0F, 0.0F, var10002, var3, (float)var27.method_44$474dfaa627(var25), 1, var14);
         }

         if (var13 == null) {
            return;
         }
      }

      RenderUtils.method_43$76ab45bd30(0.0F, 0.0F, var2 + 6.0F, var3, var14);
   }

   private static native Method d(long var0, long var2);

   private void method_41$87f7b1f1aa(int var1, RenderPass var2) {
      long var3 = a ^ 117685797222056L;
      long var5 = var3 ^ 52124382601402L;
      long var7 = var3 ^ 111748405058894L;
      FontFace var10000 = C_40t.field_42k;
      String var10002 = this.field_43E;
      long var10009 = 8153584776912085306L;
      int var9 = var1;
      long var10 = var7;
      RenderPass var12 = var2;
      ShaderOptions var13 = this.settingHud;
      int var10005 = var13.method_40$d68b376f5b(var12, var10, var9);
      long var10006 = 8159377079729982897L;
      int var14 = var10005;
      double var15 = 2.0;
      double var17 = 2.0;
      String var19 = var10002;
      long var20 = var5;
      FontFace var22 = var10000;
      var22.method_49$ef463a66c2(var20, var19, var17, var15, var14);
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      int var338, var340, var351, var354;
      net.minecraft.client.renderer.texture.TextureManager var341;
      int[] var345, var374;
      java.util.Calendar var350;
      String var353, var355, var364, var390;
      StringBuilder var357;
      HUD_47H2 var377;
      ResourceLocation var378;
      boolean var409, var411;
      label838: {
         long var29;
         label841: {
            long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
            long var8 = var6 ^ 21574113237242L;
            long var10 = (var6 ^ 108768708930131L) >>> 8;
            int var12 = (int)((var6 ^ 108768708930131L) << 56 >>> 56);
            long var13 = var6 ^ 133167456748533L;
            long var10001 = var6 ^ 128072895326984L;
            int var15 = (int)((var6 ^ 128072895326984L) >>> 56);
            int var16 = (int)((var6 ^ 128072895326984L) << 8 >>> 32);
            int var17 = (int)(var10001 << 40 >>> 40);
            long var18 = var6 ^ 91924420980846L;
            long var20 = var6 ^ 127696898216785L;
            long var22 = var6 ^ 116479229475515L;
            long var24 = var6 ^ 58032606781533L;
            var10001 = var6 ^ 48982798476343L;
            int var26 = (int)((var6 ^ 48982798476343L) >>> 32);
            int var27 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
            int var28 = (int)(var10001 << 48 >>> 48);
            var29 = var6 ^ 70978380508681L;
            long var31 = var6 ^ 62665625052564L;
            long var33 = var6 ^ 79469613767391L;
            long var35 = var6 ^ 132989861136316L;
            long var37 = var6 ^ 82460276447839L;
            long var10000 = 1634568344793677977L;
            int[] var39 = AntiStrike_47Qa.method_42$d4d28024c9();
            var10001 = 1633104333183972789L;
            Minecraft var59 = field_43;
            boolean var335 = var59.field_44r.field_42N;
            if (var39 == null) {
               if (var59.field_44r.field_42N) {
                  break label841;
               }

               GL11.glPushMatrix();
               GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
               long var10002 = 1633898235398236393L;
               long var60 = var33;
               NumberSetting var62 = this.settingXPos;
               double var336 = var62.method_44$474dfaa627(var60) / 100.0 * field_43.field_44f;
               long var10003 = 1633898235398236393L;
               long var63 = var33;
               NumberSetting var65 = this.settingYPos;
               GL11.glTranslated(var336, var65.method_44$474dfaa627(var63) / 100.0 * field_43.field_44g, 0.0);
               var10001 = 1635966778275898034L;
               HUD_47H2 var66 = this;
               var335 = var66.method_44Z$aae029aa0a();
            }

            boolean var40 = var335;
            long var412 = 1636827267471365560L;
            long var67 = var20;
            ModeSetting var69 = this.settingSide;
            byte var41 = (byte) ((var69.method_46$5f9dc63072(var67).equals("Left")) ? 1 : 0);
            double var337;
            if (var40) {
               var412 = 1633898235398236393L;
               long var70 = var33;
               NumberSetting var72 = this.settingSize;
               var337 = var72.method_44$474dfaa627(var70);
            } else {
               var412 = 1633898235398236393L;
               long var73 = var33;
               NumberSetting var75 = this.settingScale;
               var337 = var75.method_44$474dfaa627(var73);
            }

            double var42 = var337;
            if (var39 == null) {
               var412 = 1636827267471365560L;
               long var76 = var20;
               ModeSetting var78 = this.settingMode;
               if (!var78.method_46$5f9dc63072(var76).equals("Simple")) {
                  GL11.glScaled(var42, var42, 1.0);
               }

               GlStateManager.method_42z$da8c82d5d4();
            }

            ScaledResolution var44;
            FontRenderer var45;
            label830: {
               var44 = new ScaledResolution(field_43.field_44f * (1.0 / var42), field_43.field_44g * (1.0 / var42), (int)var42);
               var10001 = 1633643791399121985L;
               Minecraft var79 = field_43;
               var45 = var79.field_42N;
               var412 = 1636827267471365560L;
               long var80 = var20;
               ModeSetting var82 = this.settingMode;
               String var46 = var82.method_46$5f9dc63072(var80);
               byte var47 = -1;
               var338 = var46.hashCode();
               label829:
               if (var39 == null) {
                  label842: {
                     label826: {
                        label843: {
                           label824: {
                              label844: {
                                 label822: {
                                    label845: {
                                       label820: {
                                          label846: {
                                             label818: {
                                                label847: {
                                                   label816: {
                                                      label848: {
                                                         label814: {
                                                            label849: {
                                                               switch (var338) {
                                                                  case -1818419758:
                                                                     break label843;
                                                                  case 2718584:
                                                                     break label844;
                                                                  case 63955982:
                                                                     break label846;
                                                                  case 76517104:
                                                                     break label847;
                                                                  case 1137666049:
                                                                     var338 = (int) ((var46.equals("Augustus")) ? 1 : 0);
                                                                     if (var39 != null) {
                                                                        break label829;
                                                                     }

                                                                     if (var338 == 0) {
                                                                        break label842;
                                                                     }

                                                                     var338 = 0;
                                                                     if (var1 <= 0) {
                                                                        break;
                                                                     }

                                                                     var47 = 0;
                                                                     if (var39 == null) {
                                                                        break label842;
                                                                     }
                                                                  case 2374091:
                                                                     var338 = (int) ((var46.equals("Logo")) ? 1 : 0);
                                                                     break;
                                                                  case 1481215861:
                                                                     break label845;
                                                                  case 1964968130:
                                                                     break label848;
                                                                  case 2096995984:
                                                                     break label849;
                                                                  default:
                                                                     break label842;
                                                               }

                                                               if (var39 != null) {
                                                                  break label829;
                                                               }

                                                               if (var338 == 0) {
                                                                  break label842;
                                                               }

                                                               var338 = 1;
                                                               if (var3 < 0) {
                                                                  break label814;
                                                               }

                                                               var47 = 1;
                                                               if (var39 == null) {
                                                                  break label842;
                                                               }
                                                            }

                                                            var338 = (int) ((var46.equals("Fanart")) ? 1 : 0);
                                                         }

                                                         if (var39 != null) {
                                                            break label829;
                                                         }

                                                         if (var338 == 0) {
                                                            break label842;
                                                         }

                                                         var338 = 2;
                                                         if (var1 < 0) {
                                                            break label816;
                                                         }

                                                         var47 = 2;
                                                         if (var39 == null) {
                                                            break label842;
                                                         }
                                                      }

                                                      var338 = (int) ((var46.equals("Amogus")) ? 1 : 0);
                                                   }

                                                   if (var39 != null) {
                                                      break label829;
                                                   }

                                                   if (var338 == 0) {
                                                      break label842;
                                                   }

                                                   var338 = 3;
                                                   if (var4 < 0) {
                                                      break label818;
                                                   }

                                                   var47 = 3;
                                                   if (var39 == null) {
                                                      break label842;
                                                   }
                                                }

                                                var338 = (int) ((var46.equals("Other")) ? 1 : 0);
                                             }

                                             if (var39 != null) {
                                                break label829;
                                             }

                                             if (var338 == 0) {
                                                break label842;
                                             }

                                             var338 = 4;
                                             if (var3 < 0) {
                                                break label820;
                                             }

                                             var47 = 4;
                                             if (var39 == null) {
                                                break label842;
                                             }
                                          }

                                          var338 = (int) ((var46.equals("Basic")) ? 1 : 0);
                                       }

                                       if (var39 != null) {
                                          break label829;
                                       }

                                       if (var338 == 0) {
                                          break label842;
                                       }

                                       var338 = 5;
                                       if (var1 < 0) {
                                          break label822;
                                       }

                                       var47 = 5;
                                       if (var39 == null) {
                                          break label842;
                                       }
                                    }

                                    var338 = (int) ((var46.equals("Ausustus")) ? 1 : 0);
                                 }

                                 if (var39 != null) {
                                    break label829;
                                 }

                                 if (var338 == 0) {
                                    break label842;
                                 }

                                 var338 = 6;
                                 if (var1 < 0) {
                                    break label824;
                                 }

                                 var47 = 6;
                                 if (var39 == null) {
                                    break label842;
                                 }
                              }

                              var338 = (int) ((var46.equals("Xave")) ? 1 : 0);
                           }

                           if (var39 != null) {
                              break label829;
                           }

                           if (var338 == 0) {
                              break label842;
                           }

                           var338 = 7;
                           if (var4 < 0) {
                              break label826;
                           }

                           var47 = 7;
                           if (var39 == null) {
                              break label842;
                           }
                        }

                        var338 = (int) ((var46.equals("Simple")) ? 1 : 0);
                     }

                     var374 = var39;
                     if (var3 < 0) {
                        break label830;
                     }

                     if (var39 != null) {
                        break label829;
                     }

                     if (var338 != 0) {
                        var47 = 8;
                     }
                  }

                  var338 = var47;
               }

               var374 = var39;
            }

            label851: {
               label723: {
                  label852: {
                     label853: {
                        label854: {
                           label855: {
                              label856: {
                                 if (var4 >= 0) {
                                    if (var374 == null) {
                                       switch (var338) {
                                          case 0:
                                          case 1:
                                          case 2:
                                          case 3:
                                             GlStateManager.method_42p$da8c82d5d4();
                                             GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                                             var412 = 1636827267471365560L;
                                             long var83 = var20;
                                             ModeSetting var85 = this.settingMode;
                                             var338 = (int) ((var85.method_46$5f9dc63072(var83).equals("Augustus")) ? 1 : 0);
                                             break;
                                          case 4:
                                             break label856;
                                          case 5:
                                          case 6:
                                             break label855;
                                          case 7:
                                             break label854;
                                          case 8:
                                             break label853;
                                          default:
                                             break label852;
                                       }
                                    }

                                    var374 = var39;
                                 }

                                 if (var374 == null) {
                                    var338 = var338 != 0 ? 210 : 256;
                                 }

                                 int var48;
                                 label705: {
                                    var48 = var338;
                                    int var339 = var41;
                                    if (var39 == null) {
                                       if (var41 != 0) {
                                          var340 = -20;
                                          break label705;
                                       }

                                       var339 = var44.method_46$8abf5c6871();
                                    }

                                    var340 = var339 - var48;
                                 }

                                 int var49;
                                 label857: {
                                    var49 = var340;
                                    var10001 = 1632612082385394241L;
                                    Minecraft var86 = field_43;
                                    var341 = var86.method_43$b55274ab34();
                                    long var459 = 1636827267471365560L;
                                    long var87 = var20;
                                    ModeSetting var89 = this.settingMode;
                                    boolean var376 = var89.method_46$5f9dc63072(var87).equals("Augustus");
                                    int[] var418 = var39;
                                    if (var4 > 0) {
                                       if (var39 == null) {
                                          if (var376) {
                                             var378 = this.field_41J;
                                             break label857;
                                          }

                                          var459 = 1636827267471365560L;
                                          long var90 = var20;
                                          ModeSetting var92 = this.settingMode;
                                          var376 = var92.method_46$5f9dc63072(var90).equals("Logo");
                                       }

                                       var418 = var39;
                                    }

                                    label858: {
                                       if (var418 == null) {
                                          if (var376) {
                                             var378 = this.field_415;
                                             break label857;
                                          }

                                          var377 = this;
                                          if (var39 != null) {
                                             break label858;
                                          }

                                          var459 = 1636827267471365560L;
                                          long var93 = var20;
                                          ModeSetting var95 = this.settingMode;
                                          var376 = var95.method_46$5f9dc63072(var93).equals("Amogus");
                                       }

                                       if (var376) {
                                          var378 = this.field_49;
                                          break label857;
                                       }

                                       var377 = this;
                                    }

                                    var378 = var377.field_41a;
                                 }

                                 var341.method_44$fbbbe3c71b(var378);
                                 var412 = 1633352757953803629L;
                                 long var96 = var18;
                                 ShaderOptions var98 = this.settingHud;
                                 boolean var342 = var98.method_47$0dd78e0064(var96);
                                 int[] var379 = var39;
                                 if (var3 > 0) {
                                    if (var39 == null) {
                                       if (var342) {
                                          var10000 = 1636226940909460836L;
                                          C_47uI.method_41$da8c82d5d4();
                                       }

                                       var412 = 1632876370721191125L;
                                       long var99 = var31;
                                       ShaderOptions var101 = this.settingHud;
                                       var342 = var101.method_49$0dd78e0064(var99);
                                    }

                                    var379 = var39;
                                 }

                                 if (var379 == null) {
                                    if (!var342) {
                                       var10000 = 1633863815836746875L;
                                       C_47uI.method_45$da8c82d5d4();
                                    }

                                    var342 = true;
                                 }

                                 C_47Fw var421 = recovery$indy$1(var49, var48);
                                 long var462 = 1636090530957604285L;
                                 C_47Fw var102 = var421;
                                 long var103 = var24;
                                 boolean var105 = var342;
                                 C_47uI.method_42$300c7fd546(var105, var103, var102);
                                 double var422 = (float)(256.0 * var42) + 1.0F;
                                 long var10004 = 1633449447632885493L;
                                 double var106 = 1.0;
                                 double var108 = var422;
                                 long var110 = var29;
                                 HUD_47H2 var112 = this;
                                 var112.method_48$bd33fd2f7f(var110, var108, var106);
                                 var345 = var39;
                                 if (var3 <= 0) {
                                    break label851;
                                 }

                                 if (var39 == null) {
                                    break label723;
                                 }
                              }

                              GL11.glPushMatrix();
                              GL11.glScaled(1.5, 1.5, 1.0);
                              double var423 = (int)((var45.field_47 * 1.75F + 5.0F) * 1.5);
                              long var500 = 1633449447632885493L;
                              double var113 = var42;
                              double var115 = var423;
                              long var117 = var29;
                              HUD_47H2 var119 = this;
                              var119.method_48$bd33fd2f7f(var117, var115, var113);
                              int var320 = var45.method_48$2f485d5ba3("A");
                              int var324 = var45.method_48$2f485d5ba3("ugustus");
                              short var424 = (short)var27;
                              char var463 = (char)var28;
                              long var10005 = 1633125505119508771L;
                              byte var120 = 0;
                              char var121 = var463;
                              short var122 = var424;
                              int var123 = var26;
                              ColorSetting var124 = this.settingColor;
                              int var50 = var124.method_47$24af287d8f(var123, var122, var121, var120);
                              short var425 = (short)var27;
                              var463 = (char)var28;
                              var10005 = 1633125505119508771L;
                              byte var125 = 0;
                              char var126 = var463;
                              short var127 = var425;
                              int var128 = var26;
                              ColorSetting var129 = this.settingBackGroundColor;
                              int var51 = var129.method_47$24af287d8f(var128, var127, var126, var125);
                              var10001 = 1633688406007576083L;
                              BooleanSetting var130 = this.settingBackGround;
                              byte var346 = (byte) ((var130.method_49$aae029aa0a()) ? 1 : 0);
                              int[] var381 = var39;
                              if (var4 > 0) {
                                 if (var39 == null) {
                                    if (var346 != 0) {
                                       var412 = 1632876370721191125L;
                                       long var131 = var31;
                                       ShaderOptions var133 = this.settingHud;
                                       boolean var347 = var133.method_49$0dd78e0064(var131);
                                       long var465 = 1633352757953803629L;
                                       long var134 = var18;
                                       ShaderOptions var136 = this.settingHud;
                                       boolean var382 = var136.method_47$0dd78e0064(var134);
                                       long var466 = 1634781182781478677L;
                                       C_47uI.method_40$9bd74f13d3(var347, var382, var35);
                                    }

                                    var346 = var41;
                                 }

                                 var381 = var39;
                              }

                              label679: {
                                 label860: {
                                    if (var1 > 0) {
                                       if (var381 == null) {
                                          if (var346 != 0) {
                                             var10001 = 1633688406007576083L;
                                             BooleanSetting var137 = this.settingBackGround;
                                             boolean var348 = var137.method_49$aae029aa0a();
                                             if (var39 == null) {
                                                if (var348) {
                                                   C_47Fw var427 = recovery$indy$2(this, var51, var320, var324, var45);
                                                   long var467 = 1636090530957604285L;
                                                   C_47Fw var138 = var427;
                                                   long var139 = var24;
                                                   boolean var141 = false;
                                                   C_47uI.method_42$300c7fd546(var141, var139, var138);
                                                }

                                                GL11.glPushMatrix();
                                                GL11.glScaled(1.75, 1.75, 1.0);
                                                var45.method_41$b68e94942b("A", 1.0F, 1.0F, var50, true, 0.5F);
                                                GL11.glPopMatrix();
                                                var45.method_41$b68e94942b("ugustus", var320 * 1.75F + 2.0F, 2 + var45.field_47 - 4.0F, var50, true, 0.5F);
                                             }

                                             var10000 = 1632638248020475523L;
                                             Client.method_44$fbc0c0be91().getClass();
                                             var345 = var39;
                                             if (var3 < 0) {
                                                break label679;
                                             }

                                             if (var39 == null) {
                                                break label860;
                                             }
                                          }

                                          var10001 = 1633688406007576083L;
                                          BooleanSetting var142 = this.settingBackGround;
                                          var346 = (byte) ((var142.method_49$aae029aa0a()) ? 1 : 0);
                                       }

                                       var381 = var39;
                                    }

                                    if (var381 == null) {
                                       if (var346 != 0) {
                                          C_47Fw var428 = recovery$indy$3(this, var51, var44, var320, var324, var45);
                                          long var468 = 1636090530957604285L;
                                          C_47Fw var143 = var428;
                                          long var144 = var24;
                                          boolean var146 = false;
                                          C_47uI.method_42$300c7fd546(var146, var144, var143);
                                       }

                                       GL11.glPushMatrix();
                                       GL11.glScaled(1.75, 1.75, 1.0);
                                       var45.method_41$b68e94942b(
                                          "A", var44.method_46$8abf5c6871() / 1.5F / 1.75F - var320 - var324 / 1.75F - 0.25F, 1.0F, var50, true, 0.5F
                                       );
                                       GL11.glPopMatrix();
                                       var45.method_41$b68e94942b(
                                          "ugustus",
                                          var44.method_46$8abf5c6871() / 1.5F - 1.75F - var320 * 1.5F * 1.75F - var324 / 1.5F + 4.0F,
                                          2 + var45.field_47 - 4.0F,
                                          var50,
                                          true,
                                          0.5F
                                       );
                                    }
                                 }

                                 GL11.glPopMatrix();
                                 var345 = var39;
                              }

                              if (var3 < 0) {
                                 break label851;
                              }

                              if (var345 == null) {
                                 break label723;
                              }
                           }

                           GregorianCalendar var321;
                           label664: {
                              label862: {
                                 var321 = (GregorianCalendar)GregorianCalendar.getInstance();
                                 Date var325 = new Date();
                                 if (var3 > 0) {
                                    var350 = var321;
                                    if (var39 != null) {
                                       break label862;
                                    }

                                    var321.setTime(var325);
                                 }

                                 label863: {
                                    var412 = 1636210352222863857L;
                                    long var147 = var8;
                                    Protector_47HE var149 = ClientGlobals.field_48.field_48M;
                                    var351 = (int) ((var149.method_46$0dd78e0064(var147)) ? 1 : 0);
                                    if (var3 > 0) {
                                       if (var351 == 0) {
                                          break label863;
                                       }

                                       var10001 = 1633688406007576083L;
                                       BooleanSetting var150 = ClientGlobals.field_48.field_48M.settingTime;
                                       var351 = (int) ((var150.method_49$aae029aa0a()) ? 1 : 0);
                                    }

                                    if (var39 != null) {
                                       break label664;
                                    }

                                    if (var351 != 0) {
                                       var10001 = 1636848742515738215L;
                                       Protector_47HE var151 = ClientGlobals.field_48.field_48M;
                                       var351 = var151.method_49$8abf5c6871();
                                       break label664;
                                    }
                                 }

                                 var350 = var321;
                              }

                              var351 = var350.get(10);
                           }

                           int var327;
                           label647: {
                              var327 = var351;
                              int var352 = var321.get(12);
                              if (var39 == null) {
                                 if (var352 <= 9) {
                                    var353 = "0" + var321.get(12);
                                    break label647;
                                 }

                                 var352 = var321.get(12);
                              }

                              var353 = String.valueOf(var352);
                           }

                           label641: {
                              label640: {
                                 String var329;
                                 label864: {
                                    var329 = var353;
                                    var412 = 1636210352222863857L;
                                    long var152 = var8;
                                    Protector_47HE var154 = ClientGlobals.field_48.field_48M;
                                    var354 = (int) ((var154.method_46$0dd78e0064(var152)) ? 1 : 0);
                                    int[] var387 = var39;
                                    if (var3 >= 0) {
                                       if (var39 == null) {
                                          if (var354 == 0) {
                                             break label864;
                                          }

                                          var10001 = 1633688406007576083L;
                                          BooleanSetting var155 = ClientGlobals.field_48.field_48M.settingTime;
                                          var354 = (int) ((var155.method_49$aae029aa0a()) ? 1 : 0);
                                       }

                                       var387 = var39;
                                    }

                                    if (var387 != null) {
                                       break label640;
                                    }

                                    if (var354 != 0) {
                                       var10001 = 1634409161270395386L;
                                       Protector_47HE var156 = ClientGlobals.field_48.field_48M;
                                       var354 = var156.method_43a$8abf5c6871();
                                       break label640;
                                    }
                                 }

                                 var355 = var329;
                                 break label641;
                              }

                              var355 = String.valueOf(var354);
                           }

                           String var52;
                           label865: {
                              String var330 = var355;
                              int var356 = var321.get(9);
                              if (var39 == null) {
                                 if (var356 == 0) {
                                    var52 = var327 < 9 ? " (0" + var327 + ":" + var330 + " AM)" : " (" + var327 + ":" + var330 + " AM)";
                                    if (var39 == null) {
                                       break label865;
                                    }
                                 }

                                 var356 = var327;
                              }

                              var52 = var356 < 9 ? " (0" + var327 + ":" + var330 + " PM)" : " (" + var327 + ":" + var330 + " PM)";
                           }

                           var357 = new StringBuilder();
                           long var469 = 1636827267471365560L;
                           long var157 = var20;
                           ModeSetting var159 = this.settingMode;
                           var390 = var159.method_46$5f9dc63072(var157);
                           label539:
                           if (var39 == null) {
                              short var391 = (short) ((var390.equals("Basic")) ? 1 : 0);
                              if (var3 > 0) {
                                 if (var391 != 0) {
                                    var10001 = 1632638248020475523L;
                                    Client var393 = Client.method_44$fbc0c0be91();
                                    byte var470 = (byte)var12;
                                    long var501 = 1636405692195977696L;
                                    byte var160 = var470;
                                    long var161 = var10;
                                    Client var163 = var393;
                                    var390 = var163.method_40$213342eea1(var161, var160);
                                    break label539;
                                 }

                                 var391 = 20517;
                              }

                              var390 = recovery$indy$4(var391, 7947828731254809806L ^ var6);
                           }

                           StringBuilder var358 = var357.append(var390).append(" ");
                           var10001 = 1632638248020475523L;
                           Client var395 = Client.method_44$fbc0c0be91();
                           var469 = 1633298898020172217L;
                           long var164 = var37;
                           Client var166 = var395;
                           String var53 = var358.append(var166.method_44$5f9dc63072(var164)).toString();
                           float var54 = var45.method_48$2f485d5ba3(var53);
                           float var55 = var45.method_48$2f485d5ba3(var52);
                           double var431 = var45.field_47 + 1;
                           long var502 = 1633449447632885493L;
                           double var167 = var42;
                           double var169 = var431;
                           long var171 = var29;
                           HUD_47H2 var173 = this;
                           var173.method_48$bd33fd2f7f(var171, var169, var167);
                           int var56 = new Color(182, 186, 189).getRGB();
                           short var432 = (short)var27;
                           char var472 = (char)var28;
                           long var508 = 1633125505119508771L;
                           byte var174 = 0;
                           char var175 = var472;
                           short var176 = var432;
                           int var177 = var26;
                           ColorSetting var178 = this.settingColor;
                           int var57 = var178.method_47$24af287d8f(var177, var176, var175, var174);
                           short var433 = (short)var27;
                           char var473 = (char)var28;
                           var508 = 1633125505119508771L;
                           byte var179 = 0;
                           char var180 = var473;
                           short var181 = var433;
                           int var182 = var26;
                           ColorSetting var183 = this.settingBackGroundColor;
                           int var58 = var183.method_47$24af287d8f(var182, var181, var180, var179);
                           var10001 = 1633688406007576083L;
                           BooleanSetting var184 = this.settingBackGround;
                           byte var359 = (byte) ((var184.method_49$aae029aa0a()) ? 1 : 0);
                           int[] var397 = var39;
                           if (var1 > 0) {
                              if (var39 == null) {
                                 if (var359 != 0) {
                                    var412 = 1632876370721191125L;
                                    long var185 = var31;
                                    ShaderOptions var187 = this.settingHud;
                                    boolean var360 = var187.method_49$0dd78e0064(var185);
                                    var469 = 1633352757953803629L;
                                    long var188 = var18;
                                    ShaderOptions var190 = this.settingHud;
                                    boolean var398 = var190.method_47$0dd78e0064(var188);
                                    var469 = 1634781182781478677L;
                                    C_47uI.method_40$9bd74f13d3(var360, var398, var35);
                                 }

                                 var359 = var41;
                              }

                              var397 = var39;
                           }

                           if (var4 >= 0) {
                              if (var397 == null) {
                                 if (var359 != 0) {
                                    var10001 = 1633688406007576083L;
                                    BooleanSetting var191 = this.settingBackGround;
                                    boolean var361 = var191.method_49$aae029aa0a();
                                    if (var39 == null) {
                                       if (var361) {
                                          C_47Fw var435 = recovery$indy$5(this, var58, var55, var54, var45);
                                          var469 = 1636090530957604285L;
                                          C_47Fw var192 = var435;
                                          long var193 = var24;
                                          boolean var195 = false;
                                          C_47uI.method_42$300c7fd546(var195, var193, var192);
                                       }

                                       var45.method_41$b68e94942b(var53, 1.0F, 1.0F, var57, true, 0.5F);
                                       var45.method_41$b68e94942b(var52, var54 + 1.0F, 1.0F, var56, true, 0.5F);
                                    }

                                    var345 = var39;
                                    if (var4 < 0) {
                                       break label851;
                                    }

                                    if (var39 == null) {
                                       break label723;
                                    }
                                 }

                                 var10001 = 1633688406007576083L;
                                 BooleanSetting var196 = this.settingBackGround;
                                 var359 = (byte) ((var196.method_49$aae029aa0a()) ? 1 : 0);
                              }

                              var397 = var39;
                           }

                           if (var397 == null) {
                              if (var359 != 0) {
                                 C_47Fw var436 = recovery$indy$6(this, var58, var44, var55, var54, var45);
                                 var469 = 1636090530957604285L;
                                 C_47Fw var197 = var436;
                                 long var198 = var24;
                                 boolean var200 = false;
                                 C_47uI.method_42$300c7fd546(var200, var198, var197);
                              }

                              var45.method_41$b68e94942b(var53, var44.method_46$8abf5c6871() - var54 - var55, 1.0F, var57, true, 0.5F);
                              var45.method_41$b68e94942b(var52, var44.method_46$8abf5c6871() - var55 - 1.0F, 1.0F, var56, true, 0.5F);
                           }

                           var345 = var39;
                           if (var3 < 0) {
                              break label851;
                           }

                           if (var39 == null) {
                              break label723;
                           }
                        }

                        label617: {
                           label616: {
                              short var437 = (short)var27;
                              char var478 = (char)var28;
                              long var510 = 1633125505119508771L;
                              byte var201 = 0;
                              char var202 = var478;
                              short var203 = var437;
                              int var204 = var26;
                              ColorSetting var205 = this.settingColor;
                              int var322 = var205.method_47$24af287d8f(var204, var203, var202, var201);
                              byte var362 = 0;
                              HUD_47H2 var401 = this;
                              if (var4 >= 0) {
                                 long var479 = 1633352757953803629L;
                                 long var206 = var18;
                                 ShaderOptions var208 = this.settingHud;
                                 boolean var402 = var208.method_47$0dd78e0064(var206);
                                 long var480 = 1634781182781478677L;
                                 C_47uI.method_40$9bd74f13d3(false, var402, var35);
                                 var362 = var41;
                                 if (var39 == null) {
                                    if (var41 != 0) {
                                       C_47Fw var438 = recovery$indy$7(this, var322);
                                       long var481 = 1636090530957604285L;
                                       C_47Fw var209 = var438;
                                       long var210 = var24;
                                       boolean var212 = false;
                                       C_47uI.method_42$300c7fd546(var212, var210, var209);
                                       var345 = var39;
                                       if (var1 < 0) {
                                          break label617;
                                       }

                                       if (var39 == null) {
                                          break label616;
                                       }
                                    }

                                    var362 = 0;
                                 }

                                 var401 = this;
                              }

                              C_47Fw var439 = recovery$indy$8(var401, var44, var322);
                              long var482 = 1636090530957604285L;
                              C_47Fw var213 = var439;
                              long var214 = var24;
                              byte var216 = var362;
                              C_47uI.method_42$300c7fd546((var216 != 0), var214, var213);
                           }

                           GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                           var412 = 1634371453351846998L;
                           FontFace var217 = C_40t.field_42k;
                           double var403 = var217.method_44$bc607678b6() * var42;
                           long var483 = 1634371453351846998L;
                           FontFace var218 = C_40t.field_42Q;
                           double var441 = var403 + var218.method_44$bc607678b6() / 1.25;
                           long var503 = 1633449447632885493L;
                           double var219 = 1.0;
                           double var221 = var441;
                           long var223 = var29;
                           HUD_47H2 var225 = this;
                           var225.method_48$bd33fd2f7f(var223, var221, var219);
                           var345 = var39;
                        }

                        if (var1 <= 0) {
                           break label851;
                        }

                        if (var345 == null) {
                           break label723;
                        }
                     }

                     var412 = 1633898235398236393L;
                     long var226 = var33;
                     NumberSetting var228 = this.settingNewFontSize;
                     int var323 = C_47sk.method_49$cabccf1c64((int)var228.method_44$474dfaa627(var226), 1, 300);
                     int var363 = this.field_43y;
                     int[] var404 = var39;
                     if (var3 > 0) {
                        if (var39 == null) {
                           if (this.field_43y != var323) {
                              long var484 = 1634487468707396033L;
                              int var229 = var323;
                              long var230 = var13;
                              C_47Pn var232 = C_40t.field_429;
                              var232.method_42$a2276b849d(var230, var229);
                           }

                           var412 = 1636827267471365560L;
                           long var233 = var20;
                           ModeSetting var235 = this.settingCasing;
                           var363 = (int) ((var235.method_46$5f9dc63072(var233).equals("UpperCase")) ? 1 : 0);
                        }

                        var404 = var39;
                     }

                     String var326;
                     label602: {
                        label601: {
                           label867: {
                              if (var404 == null) {
                                 if (var363 != 0) {
                                    var326 = this.field_43E;
                                    if (var4 <= 0) {
                                       break label602;
                                    }

                                    if (var39 == null) {
                                       break label601;
                                    }
                                 }

                                 var412 = 1636827267471365560L;
                                 long var236 = var20;
                                 ModeSetting var238 = this.settingCasing;
                                 var364 = var238.method_46$5f9dc63072(var236);
                                 if (var39 != null) {
                                    break label867;
                                 }

                                 var363 = (int) ((var364.equals("LowerCase")) ? 1 : 0);
                              }

                              if (var363 != 0) {
                                 var326 = this.field_43Y;
                                 if (var4 <= 0) {
                                    break label602;
                                 }

                                 if (var39 == null) {
                                    break label601;
                                 }
                              }

                              var10000 = 1632638248020475523L;
                              Client var366 = Client.method_44$fbc0c0be91();
                              byte var445 = (byte)var12;
                              long var485 = 1636405692195977696L;
                              byte var239 = var445;
                              long var240 = var10;
                              Client var242 = var366;
                              var364 = var242.method_40$213342eea1(var240, var239);
                           }

                           var326 = var364;
                        }

                        this.field_43y = var323;
                     }

                     label582: {
                        float var332;
                        label869: {
                           short var446 = (short)var27;
                           char var486 = (char)var28;
                           long var511 = 1633125505119508771L;
                           byte var243 = 0;
                           char var244 = var486;
                           short var245 = var446;
                           int var246 = var26;
                           ColorSetting var247 = this.settingColor;
                           int var328 = var247.method_47$24af287d8f(var246, var245, var244, var243);
                           var412 = 1632876370721191125L;
                           long var248 = var31;
                           ShaderOptions var250 = this.settingHud;
                           boolean var367 = var250.method_49$0dd78e0064(var248);
                           long var487 = 1633352757953803629L;
                           long var251 = var18;
                           ShaderOptions var253 = this.settingHud;
                           boolean var405 = var253.method_47$0dd78e0064(var251);
                           long var488 = 1634781182781478677L;
                           C_47uI.method_40$9bd74f13d3(var367, var405, var35);
                           long var489 = 1634250276089496787L;
                           long var254 = var22;
                           String var256 = var326;
                           C_47Pn var257 = C_40t.field_429;
                           float var331 = var257.method_40$4795379639(var256, var254);
                           byte var406 = (byte)var15;
                           var511 = 1634695670037121643L;
                           int var258 = var17;
                           int var259 = var16;
                           String var260 = var326;
                           byte var261 = var406;
                           C_47Pn var262 = C_40t.field_429;
                           var332 = var262.method_46$498603d867(var261, var260, var259, var258) * 1.12F;
                           byte var368 = var41;
                           int[] var407 = var39;
                           if (var4 >= 0) {
                              if (var39 == null) {
                                 if (var41 != 0) {
                                    var10001 = 1633688406007576083L;
                                    BooleanSetting var263 = this.settingBackGround;
                                    boolean var369 = var263.method_49$aae029aa0a();
                                    if (var39 == null) {
                                       if (var369) {
                                          short var448 = (short)var27;
                                          var486 = (char)var28;
                                          var511 = 1633125505119508771L;
                                          byte var264 = 0;
                                          char var265 = var486;
                                          short var266 = var448;
                                          int var267 = var26;
                                          ColorSetting var268 = this.settingBackGroundColor;
                                          int var333 = var268.method_47$24af287d8f(var267, var266, var265, var264);
                                          C_47Fw var449 = recovery$indy$9(this, var333, var331, var332);
                                          long var491 = 1636090530957604285L;
                                          C_47Fw var269 = var449;
                                          long var270 = var24;
                                          boolean var272 = false;
                                          C_47uI.method_42$300c7fd546(var272, var270, var269);
                                       }

                                       var369 = false;
                                    }

                                    label573: {
                                       label872: {
                                          long var492 = 1633352757953803629L;
                                          long var273 = var18;
                                          ShaderOptions var275 = this.settingHud;
                                          var409 = var275.method_47$0dd78e0064(var273);
                                          int[] var450 = var39;
                                          if (var4 > 0) {
                                             if (var39 == null) {
                                                if (!var409) {
                                                   break label872;
                                                }

                                                var412 = 1633688406007576083L;
                                                BooleanSetting var276 = this.settingBackGround;
                                                var409 = var276.method_49$aae029aa0a();
                                             }

                                             var450 = var39;
                                          }

                                          if (var450 != null) {
                                             break label573;
                                          }

                                          if (!var409) {
                                             var409 = true;
                                             break label573;
                                          }
                                       }

                                       var409 = false;
                                    }

                                    long var493 = 1634781182781478677L;
                                    C_47uI.method_40$9bd74f13d3(var369, var409, var35);
                                    C_47Fw var452 = recovery$indy$10(this, var326, var328);
                                    long var494 = 1636090530957604285L;
                                    C_47Fw var277 = var452;
                                    long var278 = var24;
                                    boolean var280 = false;
                                    C_47uI.method_42$300c7fd546(var280, var278, var277);
                                    var345 = var39;
                                    if (var4 <= 0) {
                                       break label582;
                                    }

                                    if (var39 == null) {
                                       break label869;
                                    }
                                 }

                                 var10001 = 1633688406007576083L;
                                 BooleanSetting var281 = this.settingBackGround;
                                 var368 = (byte) ((var281.method_49$aae029aa0a()) ? 1 : 0);
                              }

                              var407 = var39;
                           }

                           if (var407 == null) {
                              if (var368 != 0) {
                                 short var453 = (short)var27;
                                 var486 = (char)var28;
                                 var511 = 1633125505119508771L;
                                 byte var282 = 0;
                                 char var283 = var486;
                                 short var284 = var453;
                                 int var285 = var26;
                                 ColorSetting var286 = this.settingBackGroundColor;
                                 int var334 = var286.method_47$24af287d8f(var285, var284, var283, var282);
                                 C_47Fw var454 = recovery$indy$11(this, var334, var331, var332);
                                 long var496 = 1636090530957604285L;
                                 C_47Fw var287 = var454;
                                 long var288 = var24;
                                 boolean var290 = false;
                                 C_47uI.method_42$300c7fd546(var290, var288, var287);
                              }

                              var368 = 0;
                           }

                           label554: {
                              label873: {
                                 long var497 = 1633352757953803629L;
                                 long var291 = var18;
                                 ShaderOptions var293 = this.settingHud;
                                 var411 = var293.method_47$0dd78e0064(var291);
                                 int[] var455 = var39;
                                 if (var4 >= 0) {
                                    if (var39 == null) {
                                       if (!var411) {
                                          break label873;
                                       }

                                       var412 = 1633688406007576083L;
                                       BooleanSetting var294 = this.settingBackGround;
                                       var411 = var294.method_49$aae029aa0a();
                                    }

                                    var455 = var39;
                                 }

                                 if (var455 != null) {
                                    break label554;
                                 }

                                 if (!var411) {
                                    var411 = true;
                                    break label554;
                                 }
                              }

                              var411 = false;
                           }

                           long var498 = 1634781182781478677L;
                           C_47uI.method_40$9bd74f13d3((var368 != 0), var411, var35);
                           C_47Fw var457 = recovery$indy$12(this, var326, var331, var328);
                           long var499 = 1636090530957604285L;
                           C_47Fw var295 = var457;
                           long var296 = var24;
                           boolean var298 = false;
                           C_47uI.method_42$300c7fd546(var298, var296, var295);
                        }

                        double var458 = var332 + var332 / 1.25;
                        long var504 = 1633449447632885493L;
                        double var299 = 1.0;
                        double var301 = var458;
                        long var303 = var29;
                        HUD_47H2 var305 = this;
                        var305.method_48$bd33fd2f7f(var303, var301, var299);
                        var345 = var39;
                     }

                     if (var3 < 0) {
                        break label851;
                     }

                     if (var345 == null) {
                        break label723;
                     }
                  }

                  long var505 = 1633449447632885493L;
                  double var306 = 1.0;
                  double var308 = 0.0;
                  long var310 = var29;
                  HUD_47H2 var312 = this;
                  var312.method_48$bd33fd2f7f(var310, var308, var306);
               }

               GL11.glPopMatrix();
               if (var1 < 0) {
                  return;
               }

               var345 = var39;
            }

            if (var345 == null) {
               break label838;
            }
         }

         long var506 = 1633449447632885493L;
         double var313 = 1.0;
         double var315 = 0.0;
         long var317 = var29;
         HUD_47H2 var319 = this;
         var319.method_48$bd33fd2f7f(var317, var315, var313);
      }

      RenderUtils.method_41$da8c82d5d4();
   }

   private void method_48$c92fa76846(int var1, float var2, float var3, RenderPass var4) {
      long var5 = a ^ 56416178612111L;
      long var7 = var5 ^ 15956888218740L;
      long var9 = var5 ^ 112420869964361L;
      long var11 = var5 ^ 68057071783017L;
      long var10000 = 2307076637205247538L;
      int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
      ShaderOptions var28 = this.settingHud;
      long var10005 = 2314607615916300528L;
      long var15 = var9;
      int var17 = var1;
      RenderPass var18 = var4;
      int var10003 = C_47TX.method_40$6b468acafc(var18, var17, var15);
      long var10004 = 2305845620680355869L;
      int var19 = var10003;
      long var20 = var11;
      RenderPass var22 = var4;
      ShaderOptions var23 = var28;
      int var14 = var23.method_40$d68b376f5b(var22, var20, var19);
      long var10001 = 2307883937667432632L;
      BooleanSetting var24 = this.settingRoudedBackGround;
      int var29 = (int) ((var24.method_49$aae029aa0a()) ? 1 : 0);
      if (var13 == null) {
         if (var29 != 0) {
            float var30 = field_43.field_44f - var2 - 6.0F;
            float var10002 = field_43.field_44f;
            long var10006 = 2307957423336496706L;
            long var25 = var7;
            NumberSetting var27 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(var30, 0.0F, var10002, var3, (float)var27.method_44$474dfaa627(var25), 1, var14);
            if (var13 == null) {
               return;
            }
         }

         var29 = field_43.field_44f;
      }

      RenderUtils.method_43$76ab45bd30(var29 - var2 - 6.0F, 0.0F, field_43.field_44f, var3, var14);
   }

   private void method_48$ae905816b6(int var1, float var2, float var3, FontRenderer var4, RenderPass var5) {
      int var15;
      label20: {
         long var6 = a ^ 30869750243274L;
         long var8 = var6 ^ 37242845336625L;
         long var10 = var6 ^ 80689553963532L;
         long var12 = var6 ^ 20589060355116L;
         long var10000 = 6359450625306971767L;
         int[] var14 = AntiStrike_47Qa.method_42$d4d28024c9();
         ShaderOptions var29 = this.settingHud;
         long var10005 = 6366414221729374389L;
         long var16 = var10;
         int var18 = var1;
         RenderPass var19 = var5;
         int var10003 = C_47TX.method_40$6b468acafc(var19, var18, var16);
         long var10004 = 6360539784481114200L;
         int var20 = var10003;
         long var21 = var12;
         RenderPass var23 = var5;
         ShaderOptions var24 = var29;
         var15 = var24.method_40$d68b376f5b(var23, var21, var20);
         if (var14 == null) {
            long var10001 = 6359768127697926397L;
            BooleanSetting var25 = this.settingRoudedBackGround;
            if (!var25.method_49$aae029aa0a()) {
               break label20;
            }

            float var10002 = var2 + 3.0F + var3;
            float var30 = var4.field_47 + 1;
            long var10006 = 6359835085017245191L;
            long var26 = var8;
            NumberSetting var28 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(0.0F, 0.0F, var10002, var30, (float)var28.method_44$474dfaa627(var26), 1, var15);
         }

         if (var14 == null) {
            return;
         }
      }

      RenderUtils.method_43$76ab45bd30(0.0F, 0.0F, var2 + 3.0F + var3, var4.field_47 + 1, var15);
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 66646905214091L;
      long var3 = var1 ^ 67295387490046L;
      long var10000 = 5980901425330111798L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 5987646401224806423L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   private void method_48$bd33fd2f7f(long var1, double var3, double var5) {
      var1 = a ^ var1;
      long var7 = var1 ^ 37057054243545L;
      int[] var9 = recovery$indy$13(4550732014701685009L, var1);
      int var10000 = (int) ((recovery$indy$14(this.settingSide, var7, 4557493486760361008L, var1)
         .equals(recovery$indy$15(ClientGlobals.field_48.field_46E.settingSide, var7, 4557493486760361008L, var1))) ? 1 : 0);
      if (var9 == null) {
         if (var10000 == 0) {
            var3 = 0.0;
         }

         var10000 = (int)((float)(var3 * var5));
      }

      double var11;
      int var10001 = (var11 = var3 - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      if (var9 == null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      C_47LS.field_47 = var10000 + var10001;
   }

   private void method_49$7e24959efe(int var1, int var2, int var3, FontRenderer var4, RenderPass var5) {
      long var6 = a ^ 115159387869915L;
      long var8 = var6 ^ 93941815204128L;
      long var10 = var6 ^ 67949841102621L;
      long var12 = var6 ^ 112244905457981L;
      long var10000 = 1535791286183363430L;
      int[] var14 = AntiStrike_47Qa.method_42$d4d28024c9();
      ShaderOptions var29 = this.settingHud;
      long var10005 = 1534452790212685220L;
      long var16 = var10;
      int var18 = var1;
      RenderPass var19 = var5;
      int var10003 = C_47TX.method_40$6b468acafc(var19, var18, var16);
      long var10004 = 1536951864219387209L;
      int var20 = var10003;
      long var21 = var12;
      RenderPass var23 = var5;
      ShaderOptions var24 = var29;
      int var15 = var24.method_40$d68b376f5b(var23, var21, var20);
      long var10001 = 1536602432520222188L;
      BooleanSetting var25 = this.settingRoudedBackGround;
      byte var30 = (byte) ((var25.method_49$aae029aa0a()) ? 1 : 0);
      if (var14 == null) {
         if (var30 != 0) {
            float var10002 = (int)(var2 * 1.75F + var3 + 4.0F);
            float var31 = (int)(var4.field_47 * 1.75F + 3.0F);
            long var10006 = 1536810490520644374L;
            long var26 = var8;
            NumberSetting var28 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(0.0F, 0.0F, var10002, var31, (float)var28.method_44$474dfaa627(var26), 1, var15);
            if (var14 == null) {
               return;
            }
         }

         var30 = 0;
      }

      C_47g5.method_48$0f4d4a7a6c(var30, 0, (int)(var2 * 1.75F + var3 + 4.0F), (int)(var4.field_47 * 1.75F + 3.0F), var15);
   }

   private static void method_45$5d9b204802(int var0, int var1, RenderPass var2) {
      long var3 = a ^ 39195325168108L;
      long var10001 = -115081494530456642L;
      Minecraft var5 = field_43;
      var5.field_42R.method_47$2f87e17fce(var0, -3, 0, 0, var1, 256);
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 135592584418193L;
      long var10000 = 1448516302663942700L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 1448197739692324006L;
      BooleanSetting var4 = this.settingBackGround;
      boolean var7 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var7) {
            return false;
         }

         var10001 = 1441234953668454065L;
         BooleanSetting var5 = this.settingBackGround;
         var7 = var5.method_44$aae029aa0a();
      }

      if (var3 == null) {
         if (!var7) {
            return false;
         }

         var10001 = 1448197739692324006L;
         BooleanSetting var6 = this.settingRoudedBackGround;
         var7 = var6.method_49$aae029aa0a();
      }

      return var3 != null ? var7 : var7;
   }

   private void method_45$3e39de354f(String var1, float var2, int var3, RenderPass var4) {
      long var5 = a ^ 119614156997573L;
      long var7 = var5 ^ 108179363538979L;
      long var9 = var5 ^ 102724450710071L;
      C_47Pn var10000 = C_40t.field_429;
      double var10002 = field_43.field_44f - var2 - 3.0F;
      long var10008 = -8914209266872265641L;
      int var11 = var3;
      long var12 = var7;
      RenderPass var14 = var4;
      ShaderOptions var15 = this.settingHud;
      int var10005 = var15.method_40$d68b376f5b(var14, var12, var11);
      long var10006 = -8913346540932525477L;
      int var16 = var10005;
      long var17 = var9;
      double var19 = 0.0;
      double var21 = var10002;
      String var23 = var1;
      C_47Pn var24 = var10000;
      var24.method_43$86fcc28337(var23, var21, var19, var17, var16);
   }

   @Override
   public void onRenderOverlay(float var1, long var2, ScaledResolution var4, byte var5) {
      short var60;
      int var62;
      net.minecraft.client.renderer.texture.TextureManager var63;
      HUD_47H2 var68;
      ResourceLocation var69;
      long var6 = var2 << 8 | (long)var5 << 56 >>> 56;
      long var8 = var6 ^ 59923426438490L;
      long var10 = var6 ^ 77208727097873L;
      long var12 = var6 ^ 134542947523487L;
      long var14 = var6 ^ 64569400649875L;
      long var10000 = -2422609762574186409L;
      int[] var16 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2415599131023086980L;
      HUD_47H2 var24 = this;
      byte var17 = (byte) ((var24.method_44Z$aae029aa0a()) ? 1 : 0);
      byte var58 = var17;
      if (var16 == null) {
         if (var17 == 0) {
            return;
         }

         long var10002 = -2420920000204309477L;
         long var25 = var8;
         ShaderOptions var27 = this.settingHud;
         var58 = (byte) ((var27.method_49$0dd78e0064(var25)) ? 1 : 0);
      }

      if (var16 == null) {
         if (var58 == 0) {
            return;
         }

         GL11.glPushMatrix();
         GL11.glScaled(1.0F / var4.method_40$8abf5c6871(), 1.0F / var4.method_40$8abf5c6871(), 1.0);
         long var71 = -2422149659899895769L;
         long var28 = var10;
         NumberSetting var30 = this.settingXPos;
         double var59 = var30.method_44$474dfaa627(var28) / 100.0 * field_43.field_44f;
         long var10003 = -2422149659899895769L;
         long var31 = var10;
         NumberSetting var33 = this.settingYPos;
         GL11.glTranslated(var59, var33.method_44$474dfaa627(var31) / 100.0 * field_43.field_44g, 0.0);
         var71 = -2415860399236440714L;
         long var34 = var12;
         ModeSetting var36 = this.settingSide;
         var58 = (byte) ((var36.method_46$5f9dc63072(var34).equals("Left")) ? 1 : 0);
      }

      byte var18;
      double var19;
      ScaledResolution var21;
      var18 = var58;
      long var73 = -2422149659899895769L;
      long var37 = var10;
      NumberSetting var39 = this.settingSize;
      var19 = var39.method_44$474dfaa627(var37);
      GL11.glScaled(var19, var19, 1.0);
      var21 = new ScaledResolution(field_43.field_44f * (1.0 / var19), field_43.field_44g * (1.0 / var19), (int)var19);
      GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
      var73 = -2415860399236440714L;
      long var40 = var12;
      ModeSetting var42 = this.settingMode;
      var60 = (short) ((var42.method_46$5f9dc63072(var40).equals("Amogus")) ? 1 : 0);
      label77:
      if (var16 == null) {
         if (var60 == 0) {
            var73 = -2415860399236440714L;
            long var43 = var12;
            ModeSetting var45 = this.settingMode;
            var60 = (short) ((var45.method_46$5f9dc63072(var43).equals("Logo")) ? 1 : 0);
            if (var16 != null) {
               break label77;
            }

            if (var60 == 0) {
               var60 = 210;
               break label77;
            }
         }

         var60 = 256;
      }

      short var22;
      label69: {
         var22 = var60;
         int var61 = var18;
         if (var16 == null) {
            if (var18 != 0) {
               var62 = -20;
               break label69;
            }

            var61 = var21.method_46$8abf5c6871();
         }

         var62 = var61 - var22;
      }

      int var23;
      label63: {
         label93: {
            var23 = var62;
            var10001 = -2421183464703372657L;
            Minecraft var46 = field_43;
            var63 = var46.method_43$b55274ab34();
            long var77 = -2415860399236440714L;
            long var47 = var12;
            ModeSetting var49 = this.settingMode;
            boolean var67 = var49.method_46$5f9dc63072(var47).equals("Augustus");
            if (var16 == null) {
               if (var67) {
                  var69 = this.field_41J;
                  break label63;
               }

               var68 = this;
               if (var16 != null) {
                  break label93;
               }

               var77 = -2415860399236440714L;
               long var50 = var12;
               ModeSetting var52 = this.settingMode;
               var67 = var52.method_46$5f9dc63072(var50).equals("Logo");
            }

            if (var67) {
               var69 = this.field_415;
               break label63;
            }

            var68 = this;
         }

         var69 = var68.field_49;
      }

      var63.method_46$b7480652c6(var69, false);
      var10001 = -2422516942749654088L;
      Minecraft var53 = field_43;
      var53.field_42R.method_47$2f87e17fce(var23, -3, 0, 0, var22, 256);
      var10000 = -2415708644734302427L;
      C_47uI.method_48$da8c82d5d4();
      var10000 = -2420858908758656318L;
      C_47uI.method_42q$da8c82d5d4();
      C_47Fw var76 = recovery$indy$16(var23, var22);
      long var79 = -2415475497786770061L;
      C_47Fw var54 = var76;
      long var55 = var14;
      boolean var57 = false;
      C_47uI.method_42$300c7fd546(var57, var55, var54);
      GL11.glScaled(var19, var19, 1.0);
      GL11.glPopMatrix();
   }

   private void method_47$46b3944261(int var1, ScaledResolution var2, int var3, int var4, FontRenderer var5, RenderPass var6) {
      long var7 = a ^ 47900714343663L;
      long var9 = var7 ^ 24588352116500L;
      long var11 = var7 ^ 139503446276393L;
      long var13 = var7 ^ 40932897437449L;
      long var10000 = 1973835739961593170L;
      int[] var15 = AntiStrike_47Qa.method_42$d4d28024c9();
      ShaderOptions var30 = this.settingHud;
      long var10005 = 1981367793521779600L;
      long var17 = var11;
      int var19 = var1;
      RenderPass var20 = var6;
      int var10003 = C_47TX.method_40$6b468acafc(var20, var19, var17);
      long var10004 = 1972606047328914301L;
      int var21 = var10003;
      long var22 = var13;
      RenderPass var24 = var6;
      ShaderOptions var25 = var30;
      int var16 = var25.method_40$d68b376f5b(var24, var22, var21);
      long var10001 = 1974644719445507032L;
      BooleanSetting var26 = this.settingRoudedBackGround;
      int var31 = (int) ((var26.method_49$aae029aa0a()) ? 1 : 0);
      if (var15 == null) {
         if (var31 != 0) {
            float var32 = (int)(var2.method_46$8abf5c6871() / 1.5F - (int)(var3 * 1.75F + var4 + 4.0F));
            float var10002 = (int)(var2.method_46$8abf5c6871() / 1.5F) + 1;
            float var33 = (int)(var5.field_47 * 1.75F + 3.0F);
            long var10006 = 1974718295620429090L;
            long var27 = var9;
            NumberSetting var29 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(var32, 0.0F, var10002, var33, (float)var29.method_44$474dfaa627(var27), 1, var16);
            if (var15 == null) {
               return;
            }
         }

         var31 = (int)(var2.method_46$8abf5c6871() / 1.5F - (int)(var3 * 1.75F + var4 + 4.0F));
      }

      C_47g5.method_48$0f4d4a7a6c(var31, 0, (int)(var2.method_46$8abf5c6871() / 1.5F) + 1, (int)(var5.field_47 * 1.75F + 3.0F), var16);
   }

   private void method_47$30a74cec44(String var1, int var2, RenderPass var3) {
      long var4 = a ^ 18816259837025L;
      long var6 = var4 ^ 34873786263431L;
      long var8 = var4 ^ 35981915438483L;
      C_47Pn var10000 = C_40t.field_429;
      double var10003 = -1.0F * (this.field_43y / 80.0F);
      long var10008 = -3752026038591808525L;
      int var10 = var2;
      long var11 = var6;
      RenderPass var13 = var3;
      ShaderOptions var14 = this.settingHud;
      int var10005 = var14.method_40$d68b376f5b(var13, var11, var10);
      long var10006 = -3753447515342512641L;
      int var15 = var10005;
      long var16 = var8;
      double var18 = var10003;
      double var20 = 3.0;
      String var22 = var1;
      C_47Pn var23 = var10000;
      var23.method_43$86fcc28337(var22, var20, var18, var16, var15);
   }

   private void method_43$bc82163608(int var1, ScaledResolution var2, float var3, float var4, FontRenderer var5, RenderPass var6) {
      long var7 = a ^ 24484198640996L;
      long var9 = var7 ^ 47865281390239L;
      long var11 = var7 ^ 73893968234658L;
      long var13 = var7 ^ 27410551129730L;
      long var10000 = 7705453292142722265L;
      int[] var15 = AntiStrike_47Qa.method_42$d4d28024c9();
      ShaderOptions var30 = this.settingHud;
      long var10005 = 7706791832073900571L;
      long var17 = var11;
      int var19 = var1;
      RenderPass var20 = var6;
      int var10003 = C_47TX.method_40$6b468acafc(var20, var19, var17);
      long var10004 = 7704294931387759350L;
      int var21 = var10003;
      long var22 = var13;
      RenderPass var24 = var6;
      ShaderOptions var25 = var30;
      int var16 = var25.method_40$d68b376f5b(var24, var22, var21);
      long var10001 = 7704644377049565779L;
      BooleanSetting var26 = this.settingRoudedBackGround;
      int var31 = (int) ((var26.method_49$aae029aa0a()) ? 1 : 0);
      if (var15 == null) {
         if (var31 != 0) {
            float var32 = var2.method_46$8abf5c6871() - var3 - 3.0F - var4;
            float var10002 = var2.method_46$8abf5c6871();
            float var33 = var5.field_47 + 1;
            long var10006 = 7704715614321759401L;
            long var27 = var9;
            NumberSetting var29 = this.settingRoundFactor;
            RenderUtils.method_49$722989e45f(var32, 0.0F, var10002, var33, (float)var29.method_44$474dfaa627(var27), 1, var16);
            if (var15 == null) {
               return;
            }
         }

         var31 = var2.method_46$8abf5c6871();
      }

      RenderUtils.method_43$76ab45bd30(var31 - var3 - 3.0F - var4, 0.0F, var2.method_46$8abf5c6871(), var5.field_47 + 1, var16);
   }

   private static void method_43$5d9b204802(int var0, int var1, RenderPass var2) {
      long var3 = a ^ 78165417019577L;
      long var10001 = 5706695485873337067L;
      Minecraft var5 = field_43;
      var5.field_42R.method_47$2f87e17fce(var0, -3, 0, 0, var1, 256);
   }

   private boolean method_44s$aae029aa0a() {
      long var1 = a ^ 100948423504340L;
      long var3 = var1 ^ 99398400521121L;
      long var10000 = 8529546642856992873L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8522785213612733768L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 32, var3, -7101486822974650986L, var1);
   }

   private boolean method_44V$aae029aa0a() {
      long var1 = a ^ 117526933247883L;
      long var3 = var1 ^ 117968854668798L;
      long var10000 = -8070388586682644938L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -8063639249919847657L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   private boolean method_44f$aae029aa0a() {
      long var1 = a ^ 103736764673807L;
      long var3 = var1 ^ 105484492533114L;
      long var10000 = 2919472666554646194L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 2926220910114958227L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   private boolean method_442$aae029aa0a() {
      long var1 = a ^ 38865265589204L;
      long var3 = var1 ^ 38414639413665L;
      long var10000 = 8962007042087250537L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8955262078824988488L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var18 = var8.method_46$5f9dc63072(var6).equals("Ausustus");
      if (var5 == null) {
         if (!var18) {
            var10002 = 8955262078824988488L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var22 = var11.method_46$5f9dc63072(var9).equals("Other");
            if (var5 != null) {
               return var22;
            }

            if (!var22) {
               var10002 = 8955262078824988488L;
               long var12 = var3;
               ModeSetting var14 = this.settingMode;
               boolean var23 = var14.method_46$5f9dc63072(var12).equals("Basic");
               if (var5 != null) {
                  return var23;
               }

               if (!var23) {
                  var10002 = 8955262078824988488L;
                  long var15 = var3;
                  ModeSetting var17 = this.settingMode;
                  boolean var24 = var17.method_46$5f9dc63072(var15).equals("Simple");
                  if (var5 != null) {
                     return var24;
                  }

                  if (!var24) {
                     return false;
                  }
               }
            }
         }

         var18 = true;
      }

      return var18;
   }

   private boolean method_44Z$aae029aa0a() {
      long var1 = a ^ 83711540125319L;
      long var3 = var1 ^ 85261546036466L;
      long var10000 = -2806834831438295238L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -2804594598320137701L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var18 = var8.method_46$5f9dc63072(var6).equals("Augustus");
      if (var5 == null) {
         if (!var18) {
            var10002 = -2804594598320137701L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var22 = var11.method_46$5f9dc63072(var9).equals("Amogus");
            if (var5 != null) {
               return var22;
            }

            if (!var22) {
               var10002 = -2804594598320137701L;
               long var12 = var3;
               ModeSetting var14 = this.settingMode;
               boolean var23 = var14.method_46$5f9dc63072(var12).equals("Logo");
               if (var5 != null) {
                  return var23;
               }

               if (!var23) {
                  var10002 = -2804594598320137701L;
                  long var15 = var3;
                  ModeSetting var17 = this.settingMode;
                  boolean var24 = var17.method_46$5f9dc63072(var15).equals("Fanart");
                  if (var5 != null) {
                     return var24;
                  }

                  if (!var24) {
                     return false;
                  }
               }
            }
         }

         var18 = true;
      }

      return var18;
   }

   private boolean method_44v$aae029aa0a() {
      long var1 = a ^ 41852460533960L;
      long var10000 = 1099850988266363253L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 1098972219817422847L;
      BooleanSetting var4 = this.settingBackGround;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 1105940263850212840L;
         BooleanSetting var5 = this.settingBackGround;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_444$aae029aa0a() {
      long var1 = a ^ 77229153200704L;
      long var3 = var1 ^ 78702264772661L;
      long var10000 = 3299753727875857405L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 3302015995937615580L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var21 = var8.method_46$5f9dc63072(var6).equals("Ausustus");
      if (var5 == null) {
         if (!var21) {
            var10002 = 3302015995937615580L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var26 = var11.method_46$5f9dc63072(var9).equals("Other");
            if (var5 != null) {
               return var26;
            }

            if (!var26) {
               var10002 = 3302015995937615580L;
               long var12 = var3;
               ModeSetting var14 = this.settingMode;
               boolean var27 = var14.method_46$5f9dc63072(var12).equals("Basic");
               if (var5 != null) {
                  return var27;
               }

               if (!var27) {
                  var10002 = 3302015995937615580L;
                  long var15 = var3;
                  ModeSetting var17 = this.settingMode;
                  boolean var28 = var17.method_46$5f9dc63072(var15).equals("Simple");
                  if (var5 != null) {
                     return var28;
                  }

                  if (!var28) {
                     var10002 = 3302015995937615580L;
                     long var18 = var3;
                     ModeSetting var20 = this.settingMode;
                     boolean var29 = var20.method_46$5f9dc63072(var18).equals("Xave");
                     if (var5 != null) {
                        return var29;
                     }

                     if (!var29) {
                        return false;
                     }
                  }
               }
            }
         }

         var21 = true;
      }

      return var21;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   private boolean method_446$aae029aa0a() {
      long var1 = a ^ 83137129793899L;
      long var10000 = -3539801639682090794L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -3538922325546062244L;
      BooleanSetting var4 = this.settingBackGround;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -3532375429228118965L;
         BooleanSetting var5 = this.settingBackGround;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_44Q$aae029aa0a() {
      long var1 = a ^ 108485366476549L;
      long var3 = var1 ^ 108867405852016L;
      long var10000 = 7534012139490180792L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 7536275461010205593L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var16 = var8.method_46$5f9dc63072(var6).equals("Augustus");
      if (var5 == null) {
         if (var16) {
            return false;
         }

         long var10001 = 7535938611979869331L;
         HUD_47H2 var9 = this;
         var16 = var9.method_44Z$aae029aa0a();
      }

      if (var5 == null) {
         if (var16) {
            return false;
         }

         var10002 = 7536275461010205593L;
         long var10 = var3;
         ModeSetting var12 = this.settingMode;
         var16 = var12.method_46$5f9dc63072(var10).equals("None");
      }

      if (var5 == null) {
         if (var16) {
            return false;
         }

         var10002 = 7536275461010205593L;
         long var13 = var3;
         ModeSetting var15 = this.settingMode;
         var16 = var15.method_46$5f9dc63072(var13).equals("Simple");
      }

      return var5 != null ? var16 : !var16;
   }

   private boolean method_44K$aae029aa0a() {
      long var1 = a ^ 113255041090953L;
      long var3 = var1 ^ 112872324106236L;
      long var10002 = 4763189039321088277L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }

   private boolean method_44u$aae029aa0a() {
      long var1 = a ^ 133945641547414L;
      long var3 = var1 ^ 132472810829027L;
      long var10002 = 3532266738476970506L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }

   public HUD_47H2(long var1) {
      super("HUD", "ÜberlagerungsElemente", (a ^ var1) ^ 97877676810783L, new Color(75, 166, 91), Category.RENDER);
      var1 = a ^ var1;
      long var3 = (var1 ^ 1951698933587L) >>> 8;
      int var5 = (int)((var1 ^ 1951698933587L) << 56 >>> 56);
      long var10001 = var1 ^ 26544342842808L;
      int var6 = (int)((var1 ^ 26544342842808L) >>> 32);
      int var7 = (int)((var1 ^ 26544342842808L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var1 ^ 37323053312825L;
      long var11 = var1 ^ 20551372411602L;
      long var13 = var1 ^ 67692571606507L;
      long var15 = var1 ^ 44119775690244L;
      long var17 = var1 ^ 75247370274210L;
      long var19 = var1 ^ 6014511513987L;
      long var21 = var1 ^ 84319739084321L;
      long var23 = var1 ^ 97877676810783L;
      // Super key computed in the first statement above.
      this.settingMode = new ModeSetting(
         this, "Mode", var11, "Basic", new String[]{"None", "Basic", "Other", "Simple", "Ausustus", "Xave", "Augustus", "Amogus", "Logo", "Fanart"}
      );
      ModeSetting var79 = new ModeSetting(this, "Side", var11, "Left", new String[]{"Left", "Right"});
      C_45n var10002 = recovery$indy$18(this);
      long var10003 = 7758553171876464597L;
      C_45n var25 = var10002;
      ModeSetting var26 = var79;
      this.settingSide = var26.method_44$d3b0c78647(var25);
      ModeSetting var80 = new ModeSetting(this, "Casing", var11, "Default", new String[]{"Default", "UpperCase", "LowerCase"});
      var10002 = recovery$indy$19(this);
      var10003 = 7758553171876464597L;
      C_45n var27 = var10002;
      ModeSetting var28 = var80;
      this.settingCasing = var28.method_44$d3b0c78647(var27);
      NumberSetting var81 = new NumberSetting(this, "X-Pos", 0.0, var19, 0.0, 100.0, 2);
      var10002 = recovery$indy$20(this);
      var10003 = 7757710596690559732L;
      C_45n var29 = var10002;
      NumberSetting var30 = var81;
      this.settingXPos = var30.method_43$9db6d416f4(var29);
      NumberSetting var82 = new NumberSetting(this, "Y-Pos", 0.0, var19, 0.0, 100.0, 2);
      var10002 = recovery$indy$21(this);
      var10003 = 7757710596690559732L;
      C_45n var31 = var10002;
      NumberSetting var32 = var82;
      this.settingYPos = var32.method_43$9db6d416f4(var31);
      NumberSetting var83 = new NumberSetting(this, "Scale", 2.0, var19, 1.0, 4.0, 2);
      var10002 = recovery$indy$22(this);
      var10003 = 7757710596690559732L;
      C_45n var33 = var10002;
      NumberSetting var34 = var83;
      this.settingScale = var34.method_43$9db6d416f4(var33);
      NumberSetting var84 = new NumberSetting(this, "Size", 0.6, var19, 0.01, 2.0, 2);
      var10002 = recovery$indy$23(this);
      var10003 = 7757710596690559732L;
      C_45n var35 = var10002;
      NumberSetting var36 = var84;
      this.settingSize = var36.method_43$9db6d416f4(var35);
      NumberSetting var85 = new NumberSetting(this, "NewFontSize", 33.0, var19, 16.0, 80.0, 0);
      short var10005 = (short)var8;
      long var10006 = 7758006932798733638L;
      short var37 = var10005;
      int var38 = var7;
      String var39 = "Size";
      int var40 = var6;
      NumberSetting var41 = var85;
      NumberSetting var86 = var41.method_47$4b927564ab(var40, var39, var38, var37);
      var10002 = recovery$indy$24(this);
      var10003 = 7757710596690559732L;
      C_45n var42 = var10002;
      NumberSetting var43 = var86;
      this.settingNewFontSize = var43.method_43$9db6d416f4(var42);
      ColorSetting var87 = new ColorSetting(var21, this, "Color", Color.white);
      C_45n var111 = recovery$indy$25(this);
      long var10004 = 7761303372884521996L;
      C_45n var44 = var111;
      long var45 = var9;
      ColorSetting var47 = var87;
      this.settingColor = (ColorSetting)var47.method_43$780fd62a21(var45, var44);
      BooleanSetting var88 = new BooleanSetting(this, var15, "BackGround", true);
      C_45n var112 = recovery$indy$26(this);
      var10004 = 7761303372884521996L;
      C_45n var48 = var112;
      long var49 = var9;
      BooleanSetting var51 = var88;
      this.settingBackGround = (BooleanSetting)var51.method_43$780fd62a21(var49, var48);
      BooleanSetting var89 = new BooleanSetting(this, var15, "RoudedBackGround", false);
      C_45n var113 = recovery$indy$27(this);
      var10004 = 7761303372884521996L;
      C_45n var52 = var113;
      long var53 = var9;
      BooleanSetting var55 = var89;
      this.settingRoudedBackGround = (BooleanSetting)var55.method_43$780fd62a21(var53, var52);
      NumberSetting var90 = new NumberSetting(this, "RoundFactor", 2.0, var19, 1.0, 10.0, 0);
      var10002 = recovery$indy$28(this);
      var10003 = 7757710596690559732L;
      C_45n var56 = var10002;
      NumberSetting var57 = var90;
      this.settingRoundFactor = var57.method_43$9db6d416f4(var56);
      ColorSetting var91 = new ColorSetting(var21, this, "BackGroundColor", new Color(0, 0, 0, 100));
      C_45n var115 = recovery$indy$29(this);
      var10004 = 7761303372884521996L;
      C_45n var58 = var115;
      long var59 = var9;
      ColorSetting var61 = var91;
      this.settingBackGroundColor = (ColorSetting)var61.method_43$780fd62a21(var59, var58);
      ShaderOptions var92 = new ShaderOptions(var17, this, "Hud");
      var10004 = 7757642877117980430L;
      Color var62 = Color.black;
      long var63 = var13;
      ShaderOptions var65 = var92;
      ShaderOptions var93 = var65.method_44$10ed55120d(var63, var62);
      C_45n var116 = recovery$indy$30(this);
      var10004 = 7761303372884521996L;
      C_45n var66 = var116;
      long var67 = var9;
      ShaderOptions var69 = var93;
      this.settingHud = (ShaderOptions)var69.method_43$780fd62a21(var67, var66);
      var10001 = 7757495425135379331L;
      Client var95 = Client.method_44$fbc0c0be91();
      byte var117 = (byte)var5;
      var10004 = 7761335363529131232L;
      byte var70 = var117;
      long var71 = var3;
      Client var73 = var95;
      this.field_43E = var73.method_40$213342eea1(var71, var70).toUpperCase(Locale.ROOT);
      var10001 = 7757495425135379331L;
      Client var97 = Client.method_44$fbc0c0be91();
      byte var118 = (byte)var5;
      var10004 = 7761335363529131232L;
      byte var74 = var118;
      long var75 = var3;
      Client var77 = var97;
      this.field_43Y = var77.method_40$213342eea1(var75, var74).toLowerCase(Locale.ROOT);
      this.field_41J = new ResourceLocation("augustus", "pictures/augustus.png");
      this.field_49 = new ResourceLocation("augustus", "pictures/amogus.png");
      this.field_415 = new ResourceLocation("augustus", "pictures/logo.png");
      this.field_41a = new ResourceLocation("augustus", "pictures/fanart.png");
      this.field_43y = 0;
   }

   // Retained original <clinit> is restored after compilation.
   static { b = null; c = null; }


   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_47Fw recovery$indy$1(int var0, int var1);

   private static native C_47Fw recovery$indy$2(HUD_47H2 var0, int var1, int var2, int var3, FontRenderer var4);

   private static native C_47Fw recovery$indy$3(HUD_47H2 var0, int var1, ScaledResolution var2, int var3, int var4, FontRenderer var5);

   private static native String recovery$indy$4(int var0, long var1);

   private static native C_47Fw recovery$indy$5(HUD_47H2 var0, int var1, float var2, float var3, FontRenderer var4);

   private static native C_47Fw recovery$indy$6(HUD_47H2 var0, int var1, ScaledResolution var2, float var3, float var4, FontRenderer var5);

   private static native C_47Fw recovery$indy$7(HUD_47H2 var0, int var1);

   private static native C_47Fw recovery$indy$8(HUD_47H2 var0, ScaledResolution var1, int var2);

   private static native C_47Fw recovery$indy$9(HUD_47H2 var0, int var1, float var2, float var3);

   private static native C_47Fw recovery$indy$10(HUD_47H2 var0, String var1, int var2);

   private static native C_47Fw recovery$indy$11(HUD_47H2 var0, int var1, float var2, float var3);

   private static native C_47Fw recovery$indy$12(HUD_47H2 var0, String var1, float var2, int var3);

   private static native int[] recovery$indy$13(long var0, long var2);

   private static native String recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native C_47Fw recovery$indy$16(int var0, int var1);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$18(HUD_47H2 var0);

   private static native C_45n recovery$indy$19(HUD_47H2 var0);

   private static native C_45n recovery$indy$20(HUD_47H2 var0);

   private static native C_45n recovery$indy$21(HUD_47H2 var0);

   private static native C_45n recovery$indy$22(HUD_47H2 var0);

   private static native C_45n recovery$indy$23(HUD_47H2 var0);

   private static native C_45n recovery$indy$24(HUD_47H2 var0);

   private static native C_45n recovery$indy$25(HUD_47H2 var0);

   private static native C_45n recovery$indy$26(HUD_47H2 var0);

   private static native C_45n recovery$indy$27(HUD_47H2 var0);

   private static native C_45n recovery$indy$28(HUD_47H2 var0);

   private static native C_45n recovery$indy$29(HUD_47H2 var0);

   private static native C_45n recovery$indy$30(HUD_47H2 var0);

   private static native MethodHandle recovery$constant$31();
}
