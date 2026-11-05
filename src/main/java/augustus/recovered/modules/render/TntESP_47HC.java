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
import net.C_43S;
import net.C_43r;
import net.C_45n;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Bq;
import net.C_47DW;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47b0;
import net.C_47da;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47ru;
import net.C_47sk;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;

public class TntESP_47HC extends Module implements RenderListener, C_47xz {
   private final ArrayList field_43h;
   private final ColorSetting settingColor;
   private final BooleanSetting settingDeathCircle;
   private final ColorSetting settingDeathColor;
   private final NumberSetting settingSmoothness;
   private final BooleanSetting settingDisplayDamage;
   private final NumberSetting settingXCoord;
   private final NumberSetting settingYCoord;
   private double field_430;
   private final C_47b0 field_41;
   private final C_47da field_48;
   private static final long a = C_4f.a(-19966063182588517L, -6231062367797176565L, MethodHandles.lookup().lookupClass()).a(164165466176325L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[50];
   private static final String[] f = new String[50];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   public float method_46$15de4e8b9b(int var1, C_47da var2, long var3, float var5, boolean var6) {
      long var7 = ((long)var1 << 32 | var3 << 32 >>> 32) ^ a;
      int[] var9 = recovery$indy$1(1577044926455626262L, var7);
      int var10000 = (int) ((var2.method_43$aae029aa0a()) ? 1 : 0);
      if (var9 == null) {
         if (var10000 != 0) {
            return var5;
         }

         var10000 = (int) ((recovery$indy$2(field_43, 1576822717067413832L, var7).method_41$e45115c4cf(C_47oY.field_46C)) ? 1 : 0);
      }

      int[] var10001 = var9;
      if (var3 > 0L) {
         if (var9 == null) {
            if (var10000 != 0 && var2 != C_47da.field_49F) {
               int var10 = (recovery$indy$3(field_43, 1576822717067413832L, var7).method_43$1c5515a899(C_47oY.field_46C).method_47$8abf5c6871() + 1) * 5;
               int var11 = 25 - var10;
               float var12 = var5 * var11;
               var5 = var12 / 25.0F;
            }

            float var25;
            var10000 = (var25 = var5 - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
         }

         var10001 = var9;
      }

      if (var10001 == null) {
         if (var10000 <= 0) {
            return 0.0F;
         }

         var10000 = 0;
      }

      int var15 = var10000;
      C_47ru.field_42.field_40 = var2;
      int var16 = 0;

      label139: {
         label138: {
            while (true) {
               if (var16 < recovery$indy$4(field_43, 1576822717067413832L, var7).field_42X.field_43.length) {
                  C_47rf var18 = recovery$indy$5(field_43, 1576822717067413832L, var7).field_42X.field_43[var16];
                  int[] var20 = var9;
                  if (var1 > 0) {
                     if (var9 != null) {
                        break;
                     }

                     var20 = var9;
                  }

                  if (var3 > 0L) {
                     if (var20 == null) {
                        label124: {
                           C_47rf var21 = var18;
                           if (var3 > 0L) {
                              if (var18 == null) {
                                 break label124;
                              }

                              var21 = var18;
                           }

                           if (var21.method_48$dbd570a038() instanceof C_43S) {
                              float var13 = 0.0F;
                              var10000 = C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var18);
                              if (var9 == null) {
                                 if (var10000 > 0) {
                                    int var14 = C_47ru.field_42
                                       .method_44$1b6465a6ed(C_47DW.field_48h, C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var18));
                                    var13 = (var14 + 1 >> 1) + ((var14 >> 1) + 1) / (var6 ? 1.0F : 2.0F);
                                 }

                                 var10000 = (int)(var15 + var13);
                              }

                              var15 = var10000;
                           }
                        }

                        var16++;
                     }

                     var20 = var9;
                  }

                  if (var20 == null) {
                     continue;
                  }
               }

               var10000 = var15;
               var10001 = var9;
               if (var3 <= 0L || var1 <= 0) {
                  break label139;
               }

               if (var9 != null) {
                  break label138;
               }

               if (var15 > 20) {
                  var15 = 20;
               }
               break;
            }

            var10000 = var15;
         }

         var10001 = var9;
      }

      if (var10001 == null) {
         if (var10000 <= 0) {
            return var5;
         }

         var10000 = 25 - var15;
      }

      var16 = var10000;
      float var19 = var5 * var16;
      return var19 / 25.0F;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   protected float method_42$48dc952fbd(long var1, C_47da var3, float var4, boolean var5) {
      int var6;
      int var7;
      int var8;
      int var9;
      long var10;
      label47: {
         var1 = a ^ var1;
         long var10001 = var1 ^ 55348049047092L;
         var6 = (int)((var1 ^ 55348049047092L) >>> 48);
         var7 = (int)((var1 ^ 55348049047092L) << 16 >>> 32);
         var8 = (int)(var10001 << 48 >>> 48);
         var9 = (int)((var1 ^ 86888370577498L) >>> 32);
         var10 = (var1 ^ 86888370577498L) << 32 >>> 32;
         int[] var12 = recovery$indy$6(-4106191573568001801L, var1);
         byte var10000 = (byte) ((var3.method_49$aae029aa0a()) ? 1 : 0);
         if (var12 == null) {
            if (var10000 != 0) {
               break label47;
            }

            var10000 = (byte) ((recovery$indy$7(field_43, -4107048193392436311L, var1).method_43B$aae029aa0a()) ? 1 : 0);
         }

         if (var12 == null) {
            if (var10000 == 0) {
               break label47;
            }

            if (var1 < 0L) {
               return var4;
            }

            if (var12 != null) {
               return Math.max(var4, 0.0F);
            }

            float var19;
            var10000 = (byte)((var19 = var4 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1));
         }

         if (var10000 > 0) {
            var4 = (1.0F + var4) * 0.5F;
         }
      }

      var4 = recovery$indy$9(this, (char)var6, var7, var3, var4, recovery$indy$8(field_43, -4107048193392436311L, var1), var8, -4106879721253035006L, var1);
      var4 = recovery$indy$10(this, var9, var3, var10, var4, var5, -4106988143395344706L, var1);
      return Math.max(var4 - recovery$indy$11(field_43, -4107048193392436311L, var1).method_47$bc607678b6(), 0.0F);
   }

   private static native Method d(long var0, long var2);

   public float method_40$5618b8530d(long var1) {
      var1 = a ^ var1;
      float var4 = 0.0F;
      int[] var10000 = recovery$indy$12(-6228786451264600454L, var1);
      int var5 = 0;
      int[] var3 = var10000;

      while (var5 < recovery$indy$13(field_43, -6229091467635034844L, var1).field_42X.field_43.length) {
         C_47rf var6 = recovery$indy$14(field_43, -6229091467635034844L, var1).field_42X.field_43[var5];
         var10000 = var3;
         if (var1 >= 0L) {
            if (var3 == null) {
               label55: {
                  C_47rf var11 = var6;
                  if (var1 > 0L) {
                     if (var6 == null) {
                        break label55;
                     }

                     var11 = var6;
                  }

                  C_43r var12 = var11.method_48$dbd570a038();
                  if (var3 == null) {
                     if (!(var12 instanceof C_43S)) {
                        break label55;
                     }

                     var12 = var6.method_48$dbd570a038();
                  }

                  C_43S var7 = (C_43S)var12;
                  float var8 = var7.field_43;
                  var4 += var8;
               }

               var5++;
            }

            var10000 = var3;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var4;
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      label18: {
         long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
         long var8 = var6 ^ 79469613767391L;
         long var10 = var6 ^ 140167575908204L;
         int[] var12 = recovery$indy$15(1634208511681378649L, var6);
         byte var10000 = (byte) ((recovery$indy$16(this.settingDisplayDamage, 1631021722636990922L, var6)) ? 1 : 0);
         if (var12 == null) {
            if (var10000 == 0) {
               break label18;
            }

            double var16;
            var10000 = (byte)((var16 = this.field_430 - 0.0) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1));
         }

         if (var10000 > 0) {
            String var13 = recovery$indy$17(28795, 222460457680982496L ^ var6) + recovery$indy$18(this.field_430, var10, 3, 1631126937872316807L, var6);
            int var14 = (int)(
               (var5.method_48$8abf5c6871() - recovery$indy$19(field_43, 1632882694089308269L, var6).field_47)
                  / 100.0
                  * recovery$indy$20(this.settingYCoord, var8, 1633998942427613601L, var6)
            );
            int var15 = (int)(
               (var5.method_46$8abf5c6871() - recovery$indy$21(field_43, 1632882694089308269L, var6).method_48$2f485d5ba3(var13))
                  / 100.0
                  * recovery$indy$22(this.settingXCoord, var8, 1633998942427613601L, var6)
            );
            recovery$indy$23(field_43, 1632882694089308269L, var6).method_43$7961e3f788(var13, var15, var14, Color.white.getRGB());
         }
      }

      RenderUtils.method_41$da8c82d5d4();
   }

   private float method_49$0339364634(char var1, int var2, C_47da var3, float var4, EntityPlayer var5, int var6) {
      long var7 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 58734005977273L;
      if (!var3.method_49$aae029aa0a()) {
         float var11 = 25.0F - recovery$indy$24(this, var9, -2626016624369763466L, var7);
         float var12 = var4 * var11;
         var4 = var12 / 25.0F;
      }

      return var4;
   }

   private double method_47$32f7496887(long var1, C_47Bq var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 73679974623368L;
      float var7 = 8.0F;
      int[] var10000 = recovery$indy$25(6715084773464240836L, var1);
      double var8 = var3.field_48j + var3.field_48 / 16.0F;
      int[] var6 = var10000;
      EntityPlayerSP var25 = recovery$indy$26(field_43, 6715979666799296922L, var1);
      if (var6 == null) {
         if (var25.method_48u$aae029aa0a()) {
            return 0.0;
         }

         var25 = recovery$indy$27(field_43, 6715979666799296922L, var1);
      }

      double var10 = var25.method_49$4b58f7ab41(var3.field_48Q, var8, var3.field_42o) / var7;
      double var26 = var10;
      if (var6 != null) {
         return var10;
      }

      double var10001 = 1.0;
      if (var1 > 0L) {
         if (!(var10 <= 1.0)) {
            return 0.0;
         }

         var26 = recovery$indy$28(field_43, 6715979666799296922L, var1).field_48Q;
         var10001 = var3.field_48Q;
      }

      double var12 = var26 - var10001;
      double var14 = recovery$indy$29(field_43, 6715979666799296922L, var1).field_48j
         + recovery$indy$30(field_43, 6715979666799296922L, var1).method_41$bc607678b6()
         - var8;
      double var16 = recovery$indy$31(field_43, 6715979666799296922L, var1).field_42o - var3.field_42o;
      double var18 = C_47sk.method_42$44b37c2d95(var12 * var12 + var14 * var14 + var16 * var16);
      if (var6 != null) {
         return var18;
      } else if (var18 != 0.0) {
         double var20 = recovery$indy$32(field_43, 6715584200252135446L, var1)
            .method_43$8cb56434fa(var3.field_48Q, var8, var3.field_42o, recovery$indy$33(field_43, 6715979666799296922L, var1).method_45$6684d3c618());
         double var22 = (1.0 - var10) * var20;
         return recovery$indy$34(
            this,
            var4,
            this.field_48.method_46$cc5f2a5550().method_40$cc5f2a5550(),
            (int)((var22 * var22 + var22) / 2.0 * 8.0 * var7 + 1.0),
            true,
            6715786716923205147L,
            var1
         );
      } else {
         return 0.0;
      }
   }

   private double method_43$ddb476ac14(char var1, int var2, char var3) {
      float var17;
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 57794270297056L;
      int[] var8 = recovery$indy$35(-3577914640560168532L, var4);
      float var9 = 8.0F;
      if (!recovery$indy$36(field_43, -3577119801709686030L, var4).method_48u$aae029aa0a()) {
         float var10 = 0.0F;

         while (var10 < 8.0F) {
            double var11 = (double)var10 / var9;
            int[] var10000 = var8;
            if (var1 >= 0) {
               if (var8 == null) {
                  double var16 = var11;
                  if (var8 != null) {
                     return var11;
                  }

                  label60: {
                     float var18;
                     label59: {
                        label74: {
                           double var10001 = 1.0;
                           if (var2 > 0) {
                              if (!(var11 <= 1.0)) {
                                 break label74;
                              }

                              var16 = 1.0 - var11;
                              var10001 = 1.0;
                           }

                           double var13 = var16 * var10001;
                           float var15 = recovery$indy$37(field_43, -3577119801709686030L, var4).method_43$bc607678b6()
                              - recovery$indy$38(
                                 this,
                                 var6,
                                 this.field_48.method_46$cc5f2a5550().method_40$cc5f2a5550(),
                                 (int)((var13 * var13 + var13) / 2.0 * 8.0 * var9 + 1.0),
                                 true,
                                 -3577208316168043149L,
                                 var4
                              );
                           var17 = var15;
                           if (var2 <= 0) {
                              break label60;
                           }

                           var18 = 0.0F;
                           if (var8 != null) {
                              break label59;
                           }

                           if (var15 > 0.0F) {
                              return var10;
                           }
                        }

                        var17 = var10;
                        var18 = 0.1F;
                     }

                     var17 += var18;
                  }

                  var10 = var17;
               }

               var10000 = var8;
            }

            if (var10000 != null) {
               break;
            }
         }
      }

      return 0.0;
   }

   @Override
   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 57482311646357L;
      long var10001 = var1 ^ 131865199037444L;
      int var6 = (int)((var1 ^ 131865199037444L) >>> 48);
      int var7 = (int)((var1 ^ 131865199037444L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 88570288194173L;
      int var9 = (int)((var1 ^ 88570288194173L) >>> 32);
      int var10 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      RenderUtils.method_42$da8c82d5d4();
      int[] var10000 = recovery$indy$39(8135651550055718675L, var1);
      int var13 = (int)recovery$indy$40(this.settingSmoothness, var4, 8135573919506526187L, var1);
      int[] var12 = var10000;
      int var14 = recovery$indy$41(this.settingColor, var9, (short)var10, (char)var11, 0, 8135312206555105772L, var1);
      byte var25 = (byte) ((recovery$indy$42(this.settingDeathCircle, 8136018379906768768L, var1)) ? 1 : 0);
      if (var12 == null) {
         var25 = (byte)(var25 != 0 ? recovery$indy$43(this.settingDeathColor, var9, (short)var10, (char)var11, 0, 8135312206555105772L, var1) : 0);
      }

      byte var15 = var25;
      Iterator var16 = this.field_43h.iterator();

      while (true) {
         if (var16.hasNext()) {
            C_47Bq var17 = (C_47Bq)var16.next();
            GL11.glPushMatrix();
            float var18 = var17.field_48 / 16.0F;
            float var19 = (float)(
               var17.field_48u
                  + (var17.field_48Q - var17.field_48u) * recovery$indy$44(field_43, 8134750221270678352L, var1).field_49
                  - recovery$indy$45(field_43, 8135212989215645935L, var1).method_41$fedcb3e4d3()
            );
            float var20 = (float)(
               var17.field_48O
                  + var18
                  + (var17.field_48j + var18 - (var17.field_48O + var18)) * recovery$indy$46(field_43, 8134750221270678352L, var1).field_49
                  - recovery$indy$47(field_43, 8135212989215645935L, var1).method_49$fedcb3e4d3()
            );
            float var21 = (float)(
               var17.field_48l
                  + (var17.field_42o - var17.field_48l) * recovery$indy$48(field_43, 8134750221270678352L, var1).field_49
                  - recovery$indy$49(field_43, 8135212989215645935L, var1).method_45$fedcb3e4d3()
            );
            GL11.glTranslated(var19, var20, var21);
            Sphere var22 = new Sphere();
            var22.setDrawStyle(100011);
            Sphere var23 = new Sphere();
            var23.setDrawStyle(100012);
            if (var12 != null) {
               break;
            }

            int var26 = (int) ((recovery$indy$50(this.settingDeathCircle, 8136018379906768768L, var1)) ? 1 : 0);
            if (var12 == null) {
               if (var26 != 0) {
                  RenderUtils.method_43$d00df7729d(var15);
                  float var24 = (float)recovery$indy$51(this, (char)var6, var7, (char)var8, 8135540264572229597L, var1);
                  var22.draw(var24, var13, var13);
                  var23.draw(var24, var13, var13);
               }

               var26 = var14;
            }

            RenderUtils.method_43$d00df7729d(var26);
            var22.draw(8.0F, var13, var13);
            var23.draw(8.0F, var13, var13);
            GL11.glPopMatrix();
            if (var12 == null) {
               continue;
            }
         }

         if (var1 >= 0L) {
            RenderUtils.method_43$da8c82d5d4();
         }
         break;
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$52(this, 32, var3, -7100575792640428954L, var1);
      recovery$indy$53(this, 40, var3, -7100575792640428954L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_488$e45a9973e5(long var1) {
      long var3 = var1 ^ 85692246365700L;
      this.field_43h.clear();
      int[] var10000 = recovery$indy$54(-5075576116952459653L, var1);
      this.field_430 = 0.0;
      int[] var5 = var10000;
      Minecraft var9 = field_43;
      if (var5 == null) {
         if (recovery$indy$55(field_43, -5076220524775932759L, var1) == null) {
            return;
         }

         var9 = field_43;
      }

      if (var5 == null) {
         if (recovery$indy$56(var9, -5076441334227770075L, var1) == null) {
            return;
         }

         var9 = field_43;
      }

      for (Object recovered$element$22605 : recovery$indy$57(var9, -5076220524775932759L, var1).field_44Q) {
         Entity var7 = (Entity) recovered$element$22605;
         label77: {
            Entity var10 = var7;
            if (var5 == null) {
               if (!(var7 instanceof C_47Bq)) {
                  break label77;
               }

               var10 = var7;
            }

            C_47Bq var8 = (C_47Bq)var10;
            this.field_41
               .method_40$a59262c0f0(
                  recovery$indy$58(field_43, -5075887805519925686L, var1).field_48Q,
                  recovery$indy$59(field_43, -5075887805519925686L, var1).field_48j,
                  recovery$indy$60(field_43, -5075887805519925686L, var1).field_42o
               );
            boolean var11 = this.field_41.method_46$53fc7ac166(var7.method_45$6684d3c618().method_42$800791f322(9.0, 9.0, 9.0));
            int[] var10001 = var5;
            if (var1 > 0L) {
               if (var5 == null) {
                  if (!var11) {
                     break label77;
                  }

                  var11 = this.field_43h.contains(var7);
               }

               var10001 = var5;
            }

            if (var10001 == null) {
               if (var11) {
                  break label77;
               }

               this.field_43h.add(var8);
            }

            this.field_430 = this.field_430 + recovery$indy$61(this, var3, var8, -5075929168281467915L, var1);
         }

         if (var5 != null) {
            break;
         }
      }
   }

   public TntESP_47HC(long var1) {
      super("TntESP", "TntESP", ((a ^ var1) ^ 104890936749887L), new Color(109, 199, 117), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 43502859429401L;
      long var5 = var1 ^ 50858060460836L;
      long var7 = var1 ^ 82261629629185L;
      long var9 = var1 ^ 3407586561187L;
      long var11 = var1 ^ 104890936749887L;
      // Super arguments moved to the required Java constructor position.
      this.field_43h = new ArrayList();
      this.settingColor = new ColorSetting(var7, this, "Color", new Color(255, 255, 255, 40));
      this.settingDeathCircle = new BooleanSetting(this, var5, "DeathCircle", true);
      ColorSetting var10001 = new ColorSetting(var7, this, "DeathColor", new Color(255, 0, 0, 40));
      BooleanSetting var10002 = this.settingDeathCircle;
      this.settingDeathCircle.getClass();
      C_45n var10003 = recovery$indy$62(var10002);
      long var10004 = 7390093256130551605L;
      C_45n var13 = var10003;
      long var14 = var3;
      ColorSetting var16 = var10001;
      this.settingDeathColor = (ColorSetting)var16.method_43$780fd62a21(var14, var13);
      this.settingSmoothness = new NumberSetting(this, "Smoothness", 32.0, var9, 8.0, 60.0, 0);
      this.settingDisplayDamage = new BooleanSetting(this, var5, "DisplayDamage", true);
      NumberSetting var22 = new NumberSetting(this, "X-Coord", 50.0, var9, 0.0, 100.0, 2);
      var10002 = this.settingDisplayDamage;
      this.settingDisplayDamage.getClass();
      C_45n var25 = recovery$indy$63(var10002);
      long var28 = 7388474816401364052L;
      C_45n var17 = var25;
      NumberSetting var18 = var22;
      this.settingXCoord = var18.method_43$9db6d416f4(var17);
      NumberSetting var23 = new NumberSetting(this, "Y-Coord", 45.0, var9, 0.0, 100.0, 2);
      var10002 = this.settingDisplayDamage;
      this.settingDisplayDamage.getClass();
      C_45n var27 = recovery$indy$64(var10002);
      long var29 = 7388474816401364052L;
      C_45n var19 = var27;
      NumberSetting var20 = var23;
      this.settingYCoord = var20.method_43$9db6d416f4(var19);
      this.field_430 = 0.0;
      this.field_41 = new C_47b0();
      this.field_48 = new C_47da("explosion");
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native float recovery$indy$9(Object var0, char var1, int var2, Object var3, float var4, Object var5, int var6, long var7, long var9);

   private static native float recovery$indy$10(Object var0, int var1, Object var2, long var3, float var5, boolean var6, long var7, long var9);

   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);

   private static native int[] recovery$indy$12(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);

   private static native int[] recovery$indy$15(long var0, long var2);

   private static native boolean recovery$indy$16(Object var0, long var1, long var3);

   private static native String recovery$indy$17(int var0, long var1);

   private static native String recovery$indy$18(double var0, long var2, int var4, long var5, long var7);

   private static native FontRenderer recovery$indy$19(Object var0, long var1, long var3);

   private static native double recovery$indy$20(Object var0, long var1, long var3, long var5);

   private static native FontRenderer recovery$indy$21(Object var0, long var1, long var3);

   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native FontRenderer recovery$indy$23(Object var0, long var1, long var3);

   private static native float recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$25(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$32(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);

   private static native float recovery$indy$34(Object var0, long var1, Object var3, float var4, boolean var5, long var6, long var8);

   private static native int[] recovery$indy$35(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);

   private static native float recovery$indy$38(Object var0, long var1, Object var3, float var4, boolean var5, long var6, long var8);

   private static native int[] recovery$indy$39(long var0, long var2);

   private static native double recovery$indy$40(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$41(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native boolean recovery$indy$42(Object var0, long var1, long var3);

   private static native int recovery$indy$43(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native C_40X recovery$indy$44(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$45(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$46(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$47(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$48(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$49(Object var0, long var1, long var3);

   private static native boolean recovery$indy$50(Object var0, long var1, long var3);

   private static native double recovery$indy$51(Object var0, char var1, int var2, char var3, long var4, long var6);

   private static native void recovery$indy$52(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$53(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$54(long var0, long var2);

   private static native WorldClient recovery$indy$55(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$57(Object var0, long var1, long var3);

   private static native Entity recovery$indy$58(Object var0, long var1, long var3);

   private static native Entity recovery$indy$59(Object var0, long var1, long var3);

   private static native Entity recovery$indy$60(Object var0, long var1, long var3);

   private static native double recovery$indy$61(Object var0, long var1, Object var3, long var4, long var6);

   private static native C_45n recovery$indy$62(BooleanSetting var0);

   private static native C_45n recovery$indy$63(BooleanSetting var0);

   private static native C_45n recovery$indy$64(BooleanSetting var0);

   private static native MethodHandle recovery$constant$65();
}
