package augustus.recovered.modules.misc;

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
import net.C_407;
import client.Client;
import net.C_45n;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47F9;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiMainMenu;
import net.C_47LX;
import net.C_47MU;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TY;
import client.setting.ModeSetting;
import client.event.RenderListener;
import net.C_47bg;
import net.C_47cu;
import net.C_47dF;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47mK;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class AutoLeave_47k1 extends Module implements C_47dF, RenderListener, C_47oO, C_47xz, C_47mK {
   public final BooleanSetting settingCalculateWithHit;
   public final NumberSetting settingTime;
   public final BooleanSetting settingDisplayTime;
   public final NumberSetting settingXCoord;
   public final NumberSetting settingYCoord;
   public final BooleanSetting settingAutoLeaveBool;
   public final NumberSetting settingHeats;
   public final ModeSetting settingMode;
   public final BooleanSetting settingLeaveOnKey;
   public final BooleanSetting settingLeaveOnDeath;
   public final BooleanSetting settingLeaveIfStaffArrives;
   public final C_47TY settingKey;
   private long field_48N;
   private final C_47cu field_46;
   private boolean field_43a;
   private final C_47cu field_48m;
   private static final long a = C_4f.a(-8222772323416010340L, 8575845988887636070L, MethodHandles.lookup().lookupClass()).a(171011272171509L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[63];
   private static final String[] f = new String[63];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private void method_46$e45a9973e5(long var1) {
      AutoLeave_47k1 var10000;
      label27: {
         var1 = a ^ var1;
         long var3 = var1 ^ 69762690231364L;
         long var5 = var1 ^ 3629405398441L;
         int[] var7 = recovery$indy$1(3015756141029662595L, var1);
         int var8 = (int)(System.currentTimeMillis() - this.field_48N);
         if (var7 == null) {
            if (!(var8 > recovery$indy$2(this.settingTime, var5, 3016151774030480262L, var1))) {
               var10000 = this;
               if (var7 != null) {
                  break label27;
               }

               if (recovery$indy$3(this.settingCalculateWithHit, 3016084645950027124L, var1)) {
                  return;
               }
            }

            recovery$indy$4(this, var3, 3016977043404006952L, var1);
         }

         var10000 = this;
      }

      var10000.field_48N = System.currentTimeMillis();
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   @Override
   public void method_40$db44232a44(long var1, C_47MU var3) {
      int var4 = (int)((var1 ^ 29336012942693L) >>> 32);
      long var5 = (var1 ^ 29336012942693L) << 32 >>> 32;
      long var7 = var1 ^ 79395225487730L;
      long var10000 = 4819450464676934843L;
      int[] var9 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 4819827502592695884L;
      BooleanSetting var10 = this.settingLeaveOnKey;
      int var19 = (int) ((var10.method_49$aae029aa0a()) ? 1 : 0);
      if (var9 == null) {
         if (var19 == 0) {
            return;
         }

         var10001 = 4820903019740504510L;
         C_47MU var11 = var3;
         var19 = var11.method_42$8abf5c6871();
      }

      long var10004 = 4819254887441763085L;
      long var12 = var5;
      int var14 = var4;
      C_47TY var15 = this.settingKey;
      if (var19 == var15.method_49$7ee0e11626(var14, var12)) {
         long var10002 = 4820443188533827809L;
         long var16 = var7;
         AutoLeave_47k1 var18 = this;
         var18.method_46$e45a9973e5(var16);
      }
   }

   @Override
   public void method_44$c3e139a72f(C_407 var1, long var2) {
      augustus.recovered.modules.misc.AutoLeave_47k1 var29;
      long var10001 = var2 ^ 78704420995556L;
      int var4 = (int)((var2 ^ 78704420995556L) >>> 48);
      int var5 = (int)((var2 ^ 78704420995556L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 50668263188801L;
      long var10000 = -5855227721940395801L;
      int[] var9 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = -5854994431840966144L;
      C_407 var10 = var1;
      double var25 = var10.method_47$fedcb3e4d3();
      short var10002 = (short)var4;
      long var10004 = -5856106364450585444L;
      Minecraft var11 = field_43;
      char var10003 = (char)var6;
      long var10006 = -5856038655417354317L;
      boolean var26 = C_47bg.method_47$3dc87949b2(var10002, var5, var25, var10003, var11.field_42P.field_48Q, 0.01);
      if (var9 == null) {
         if (!var26) {
            return;
         }

         var10001 = -5855058656426470090L;
         C_407 var12 = var1;
         double var27 = var12.method_44$fedcb3e4d3();
         var10002 = (short)var4;
         var10004 = -5856106364450585444L;
         Minecraft var13 = field_43;
         var10003 = (char)var6;
         var10006 = -5856038655417354317L;
         var26 = C_47bg.method_47$3dc87949b2(var10002, var5, var27, var10003, var13.field_42P.field_48j, 0.01);
      }

      int[] var32 = var9;
      if (var2 > 0L) {
         if (var9 == null) {
            if (!var26) {
               return;
            }

            var10001 = -5855923338058618422L;
            C_407 var14 = var1;
            double var28 = var14.method_48$fedcb3e4d3();
            var10002 = (short)var4;
            var10004 = -5856106364450585444L;
            Minecraft var15 = field_43;
            var10003 = (char)var6;
            var10006 = -5856038655417354317L;
            var26 = C_47bg.method_47$3dc87949b2(var10002, var5, var28, var10003, var15.field_42P.field_42o, 0.01);
         }

         var32 = var9;
      }

      if (var2 > 0L) {
         if (var32 == null) {
            if (!var26) {
               return;
            }

            var10001 = -5856784210586653367L;
            C_407 var16 = var1;
            var26 = var16.method_44$0e30dfc966().equals("game.player.hurt.fall.small");
         }

         var32 = var9;
      }

      label82: {
         label81: {
            label80: {
               label105: {
                  if (var2 >= 0L) {
                     if (var32 == null) {
                        if (var26) {
                           break label105;
                        }

                        var10001 = -5856784210586653367L;
                        C_407 var17 = var1;
                        var26 = var17.method_44$0e30dfc966().equals("game.player.hurt.fall.big");
                     }

                     var32 = var9;
                  }

                  if (var2 <= 0L) {
                     break label82;
                  }

                  if (var32 != null) {
                     break label81;
                  }

                  if (!var26) {
                     break label80;
                  }
               }

               var10001 = -5856160589698879549L;
               C_47cu var18 = this.field_46;
               var18.method_46$da8c82d5d4();
            }

            var10001 = -5856784210586653367L;
            C_407 var19 = var1;
            var26 = var19.method_44$0e30dfc966().equals("game.player.hurt");
         }

         var32 = var9;
      }

      label106: {
         if (var32 == null) {
            if (!var26) {
               return;
            }

            var29 = this;
            if (var9 != null) {
               break label106;
            }

            long var42 = -5855743152721215472L;
            long var20 = var7;
            long var22 = 100L;
            C_47cu var24 = this.field_46;
            var26 = var24.method_42$b0e346e6e3(var22, var20);
         }

         if (!var26) {
            return;
         }

         var29 = this;
      }

      var29.field_48N = System.currentTimeMillis();
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      label40: {
         long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
         long var8 = var6 ^ 79469613767391L;
         long var10 = var6 ^ 140167575908204L;
         int[] var12 = recovery$indy$5(1633774431961915637L, var6);
         int var10000 = (int) ((recovery$indy$6(this.settingCalculateWithHit, 1633964484214016514L, var6)) ? 1 : 0);
         if (var12 == null) {
            if (var10000 == 0) {
               break label40;
            }

            var10000 = (int) ((recovery$indy$7(this.settingDisplayTime, 1633964484214016514L, var6)) ? 1 : 0);
         }

         if (var12 == null) {
            if (var10000 == 0) {
               break label40;
            }

            var10000 = (int)(System.currentTimeMillis() - this.field_48N);
         }

         double var13 = var10000;
         String var15 = recovery$indy$8(var13 / 1000.0, var10, 1, 1634095615535094336L, var6);
         FontRenderer var16 = recovery$indy$9(field_43, 1634308252302616732L, var6);
         int var17 = var16.method_48$2f485d5ba3(var15);
         int var18 = var16.field_47 - 1;
         int var19 = (int)((var5.method_46$8abf5c6871() - var17) / 100.0 * recovery$indy$10(this.settingXCoord, var8, 1634187661578239216L, var6));
         int var20 = (int)((var5.method_48$8abf5c6871() - var18) / 100.0 * recovery$indy$11(this.settingYCoord, var8, 1634187661578239216L, var6));
         double var21;
         int var10004 = (var21 = var13 - recovery$indy$12(this.settingTime, var8, 1634187661578239216L, var6)) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
         if (var12 == null) {
            var10004 = var10004 > 0 ? Color.GREEN.getRGB() : Color.RED.getRGB();
         }

         var16.method_43$7961e3f788(var15, var19, var20, var10004);
      }

      RenderUtils.method_41$da8c82d5d4();
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 104958983831424L;
      long var10000 = 6756275144740432794L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 6756045166338310509L;
      BooleanSetting var4 = this.settingCalculateWithHit;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 6756045166338310509L;
         BooleanSetting var5 = this.settingDisplayTime;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private void method_49$e45a9973e5(long var1) {
      int[] var5;
      int var25;
      var1 = a ^ var1;
      long var3 = var1 ^ 130831879594537L;
      long var10002 = -6353943074334995190L;
      long var9 = var3;
      ModeSetting var11 = this.settingMode;
      String var6 = var11.method_46$5f9dc63072(var9);
      long var10000 = -6353356490308316787L;
      int[] var24 = ClientSettings_47kr.method_46$d4d28024c9();
      byte var7 = -1;
      var5 = var24;
      var25 = var6.hashCode();
      label84:
      if (var5 == null) {
         label87: {
            switch (var25) {
               case 73591734:
                  var25 = (int) ((var6.equals("Lobby")) ? 1 : 0);
                  if (var5 != null) {
                     break label84;
                  }

                  if (var25 == 0) {
                     break label87;
                  }

                  var25 = 0;
                  if (var1 <= 0L) {
                     break;
                  }

                  var7 = 0;
                  if (var5 == null) {
                     break label87;
                  }
               case -1821959325:
                  var25 = (int) ((var6.equals("Server")) ? 1 : 0);
                  break;
               default:
                  break label87;
            }

            if (var5 != null) {
               break label84;
            }

            if (var25 != 0) {
               var7 = 1;
            }
         }

         var25 = var7;
      }

      switch (var25) {
         case 0:
            long var10001 = -6354380269285421578L;
            Minecraft var12 = field_43;
            var12.field_42P.method_49$a7421bf54c("/hub");
            if (var1 <= 0L) {
               break;
            }

            if (var5 == null) {
               return;
            }
         case 1:
            var10002 = -6353025568145866670L;
            boolean var13 = true;
            Minecraft var14 = field_43;
            var14.field_42O = var13;
            break;
         default:
            return;
      }

      long var28 = -6353695837584214413L;
      Minecraft var15 = field_43;
      boolean var8 = var15.method_42$aae029aa0a();
      var28 = -6354502873067244956L;
      Minecraft var16 = field_43;
      var16.field_44Q.method_45$da8c82d5d4();
      var10002 = -6352481581151042926L;
      Object var17 = null;
      Minecraft var18 = field_43;
      var18.method_44$a1dcd804df((WorldClient)var17);
      if (var5 == null) {
         if (var8) {
            Minecraft var26 = field_43;
            GuiMainMenu var30 = new GuiMainMenu();
            var10002 = -6353424274032681244L;
            GuiMainMenu var19 = var30;
            Minecraft var20 = var26;
            var20.method_43$7480b345ab(var19);
            if (var1 >= 0L && var5 == null) {
               return;
            }
         }

         Minecraft var27 = field_43;
         C_47LX var31 = new C_47LX(new GuiMainMenu());
         var10002 = -6353424274032681244L;
         C_47LX var21 = var31;
         Minecraft var22 = var27;
         var22.method_43$7480b345ab(var21);
      }
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_48N = System.currentTimeMillis();
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 136457453227948L;
      long var10000 = -1301752375782319178L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -1301988727917924031L;
      BooleanSetting var4 = this.settingCalculateWithHit;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -1301988727917924031L;
         BooleanSetting var5 = this.settingDisplayTime;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 14, var3, -7100281052102405544L, var1);
      recovery$indy$14(this, 32, var3, -7100281052102405544L, var1);
      recovery$indy$15(this, 17, var3, -7100281052102405544L, var1);
      recovery$indy$16(this, 40, var3, -7100281052102405544L, var1);
      recovery$indy$17(this, 35, var3, -7100281052102405544L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
   }

   @Override
   public void method_487$da8c82d5d4() {
      augustus.recovered.modules.misc.AutoLeave_47k1 var48;
      long var3;
      long var5;
      long var9;
      long var11;
      int[] var15;
      int var46;
      long var1 = a ^ 134597899052574L;
      var3 = var1 ^ 140471324494347L;
      var5 = var1 ^ 26542915862979L;
      long var7 = var1 ^ 39702344730670L;
      var9 = var1 ^ 140731810739247L;
      var11 = var1 ^ 28657421075362L;
      long var13 = var1 ^ 90098038525901L;
      long var10000 = -4297215326744317436L;
      var15 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -4297438622143964941L;
      BooleanSetting var16 = this.settingAutoLeaveBool;
      var46 = (int) ((var16.method_49$aae029aa0a()) ? 1 : 0);
      label96:
      if (var15 == null) {
         if (var46 != 0) {
            var10001 = -4298164346968101249L;
            Minecraft var17 = field_43;
            double var47 = var17.field_42P.method_43$bc607678b6();
            long var10003 = -4297382545046327807L;
            long var18 = var7;
            NumberSetting var20 = this.settingHeats;
            double var60;
            var46 = (var60 = var47 - var20.method_44$474dfaa627(var18)) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
            if (var15 != null) {
               break label96;
            }

            if (var46 <= 0) {
               long var10002 = -4297913650122842530L;
               long var21 = var13;
               AutoLeave_47k1 var23 = this;
               var23.method_46$e45a9973e5(var21);
            }
         }

         var10001 = -4297438622143964941L;
         BooleanSetting var24 = this.settingLeaveIfStaffArrives;
         var46 = (int) ((var24.method_49$aae029aa0a()) ? 1 : 0);
      }

      label89:
      if (var15 == null) {
         if (var46 != 0) {
            long var54 = -4297877820203437344L;
            long var25 = var3;
            StaffDetector_47kd var27 = ClientGlobals.field_48.field_46t;
            var46 = (int) ((var27.method_46$0dd78e0064(var25)) ? 1 : 0);
            if (var15 != null) {
               break label89;
            }

            if (var46 != 0) {
               var54 = -4296559439450071475L;
               long var28 = var9;
               StaffDetector_47kd var30 = ClientGlobals.field_48.field_46t;
               var46 = (int) ((var30.method_45F$0dd78e0064(var28)) ? 1 : 0);
               if (var15 != null) {
                  break label89;
               }

               if (var46 != 0) {
                  long var59 = -4296701612877731085L;
                  long var31 = var11;
                  long var33 = 1000L;
                  C_47cu var35 = this.field_48m;
                  var46 = (int) ((var35.method_42$b0e346e6e3(var33, var31)) ? 1 : 0);
                  if (var15 != null) {
                     break label89;
                  }

                  if (var46 != 0) {
                     var54 = -4298312061863703633L;
                     long var36 = var5;
                     AutoLeave_47k1 var38 = this;
                     var38.method_49$e45a9973e5(var36);
                     var10001 = -4298253745853545184L;
                     C_47cu var39 = this.field_48m;
                     var39.method_46$da8c82d5d4();
                  }
               }
            }
         }

         var10001 = -4298164346968101249L;
         Minecraft var40 = field_43;
         var46 = (int) ((var40.field_42P.field_427) ? 1 : 0);
      }

      label76: {
         label75: {
            if (var15 == null) {
               if (var46 == 0) {
                  break label75;
               }

               var48 = this;
               if (var15 != null) {
                  break label76;
               }

               var46 = (int) ((this.field_43a) ? 1 : 0);
            }

            if (var46 == 0) {
               var48 = this;
               if (var15 != null) {
                  break label76;
               }

               var10001 = -4297438622143964941L;
               BooleanSetting var41 = this.settingLeaveOnDeath;
               if (var41.method_49$aae029aa0a()) {
                  long var57 = -4298312061863703633L;
                  long var42 = var5;
                  AutoLeave_47k1 var44 = this;
                  var44.method_49$e45a9973e5(var42);
               }
            }
         }

         var48 = this;
      }

      long var58 = -4298164346968101249L;
      Minecraft var45 = field_43;
      var48.field_43a = var45.field_42P.field_427;
   }

   private static boolean method_40K$aae029aa0a() {
      long var0 = a ^ 120653752041679L;
      long var2 = var0 ^ 114432434253018L;
      long var10000 = 2490409923584028701L;
      Client var8 = Client.method_44$fbc0c0be91();
      long var10001 = 2488775785151435912L;
      Client var4 = var8;
      long var10002 = 2489304451228341297L;
      long var5 = var2;
      StaffDetector_47kd var7 = var4.method_45$4a5eee04b7().field_46t;
      return var7.method_46$0dd78e0064(var5);
   }

   public AutoLeave_47k1(long var1) {
      super("AutoLeave", "AutomatischesVerlassen", ((a ^ var1) ^ 21179021319685L), new Color(50, 168, 82), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 118430492989219L;
      long var5 = var1 ^ 97818708684488L;
      long var7 = var1 ^ 116339619881067L;
      long var9 = var1 ^ 108197267112478L;
      long var11 = var1 ^ 25463395020514L;
      long var13 = var1 ^ 87134433197465L;
      long var15 = var1 ^ 21179021319685L;
      // Super arguments moved to the required Java constructor position.
      this.settingCalculateWithHit = new BooleanSetting(this, var9, "CalculateWithHit", true);
      NumberSetting var10001 = new NumberSetting(this, "Time", 12000.0, var13, 0.0, 20000.0, 0);
      BooleanSetting var10002 = this.settingCalculateWithHit;
      this.settingCalculateWithHit.getClass();
      C_45n var44 = recovery$indy$18(var10002);
      long var10003 = -2903234911195702814L;
      C_45n var17 = var44;
      NumberSetting var18 = var10001;
      this.settingTime = var18.method_43$9db6d416f4(var17);
      BooleanSetting var38 = new BooleanSetting(this, var9, "DisplayTime", true);
      var10002 = this.settingCalculateWithHit;
      this.settingCalculateWithHit.getClass();
      C_45n var50 = recovery$indy$19(var10002);
      long var10004 = -2904409182442957039L;
      C_45n var19 = var50;
      long var20 = var3;
      BooleanSetting var22 = var38;
      this.settingDisplayTime = (BooleanSetting)var22.method_43$780fd62a21(var20, var19);
      var10001 = new NumberSetting(this, "X-Coord", 100.0, var13, 0.0, 100.0, 2);
      C_45n var46 = recovery$indy$20(this);
      var10003 = -2903234911195702814L;
      C_45n var23 = var46;
      NumberSetting var24 = var10001;
      this.settingXCoord = var24.method_43$9db6d416f4(var23);
      var10001 = new NumberSetting(this, "Y-Coord", 100.0, var13, 0.0, 100.0, 2);
      C_45n var47 = recovery$indy$21(this);
      var10003 = -2903234911195702814L;
      C_45n var25 = var47;
      NumberSetting var26 = var10001;
      this.settingYCoord = var26.method_43$9db6d416f4(var25);
      BooleanSetting var41 = new BooleanSetting(this, var9, "AutoLeaveBool", false);
      var10004 = -2904755770708537395L;
      long var27 = var7;
      String var29 = "AutoLeave";
      BooleanSetting var30 = var41;
      this.settingAutoLeaveBool = (BooleanSetting)var30.method_40$56e823faec(var29, var27);
      var10001 = new NumberSetting(this, "Heats", 2.0, var13, 0.0, 20.0, 0);
      var10002 = this.settingAutoLeaveBool;
      this.settingAutoLeaveBool.getClass();
      C_45n var49 = recovery$indy$22(var10002);
      var10003 = -2903234911195702814L;
      C_45n var31 = var49;
      NumberSetting var32 = var10001;
      this.settingHeats = var32.method_43$9db6d416f4(var31);
      this.settingMode = new ModeSetting(this, "Mode", var5, "Lobby", new String[]{"Lobby", "Server"});
      this.settingLeaveOnKey = new BooleanSetting(this, var9, "LeaveOnKey", false);
      this.settingLeaveOnDeath = new BooleanSetting(this, var9, "LeaveOnDeath", false);
      BooleanSetting var43 = new BooleanSetting(this, var9, "LeaveIfStaffArrives", false);
      C_45n var54 = recovery$indy$23();
      var10004 = -2904409182442957039L;
      C_45n var33 = var54;
      long var34 = var3;
      BooleanSetting var36 = var43;
      this.settingLeaveIfStaffArrives = (BooleanSetting)var36.method_43$780fd62a21(var34, var33);
      this.settingKey = new C_47TY(this, var11, "Key");
      this.field_48N = System.currentTimeMillis();
      this.field_46 = new C_47cu();
      this.field_43a = false;
      this.field_48m = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$5(long var0, long var2);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native String recovery$indy$8(double var0, long var2, int var4, long var5, long var7);

   private static native FontRenderer recovery$indy$9(Object var0, long var1, long var3);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$18(BooleanSetting var0);

   private static native C_45n recovery$indy$19(BooleanSetting var0);

   private static native C_45n recovery$indy$20(AutoLeave_47k1 var0);

   private static native C_45n recovery$indy$21(AutoLeave_47k1 var0);

   private static native C_45n recovery$indy$22(BooleanSetting var0);

   private static native C_45n recovery$indy$23();

   private static native MethodHandle recovery$constant$24();
}
