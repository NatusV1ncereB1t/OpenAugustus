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
import client.Client;
import net.C_45c;
import net.minecraft.client.gui.ScaledResolution;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.event.RenderListener;
import net.C_47eh;
import net.C_47jO;
import client.ClientGlobals;
import net.C_47sk;
import net.C_47sv;
import client.module.Category;
import net.C_47vQ;
import net.C_4f;

public class Notifications_47HJ extends Module implements RenderListener {
   private static final C_47eh field_44;
   private static final String[] field_49;
   public final BooleanSetting settingBlur;
   public final BooleanSetting settingAvoidDuplications;
   public final ModeSetting settingPosition;
   public final NumberSetting settingDuplicateTime;
   public final NumberSetting settingShowDuration;
   public final NumberSetting settingSpeed;
   public final ModeSetting settingGroupColorMode;
   public final ModeSetting settingProgressColorMode;
   public final MultiSelectSetting settingNotificationTypes;
   private static boolean field_42;
   private static final long a = C_4f.a(3927645895137901357L, -3150393082464878523L, MethodHandles.lookup().lookupClass()).a(3762306769619L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[47];
   private static final String[] f = new String[47];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 70852845512124L;
      recovery$indy$1(this, false, var8, 1631153175561172368L, var6);
   }

   public static void method_48$f633c984d8(boolean var0) {
      field_42 = var0;
   }

   public static boolean method_48$aae029aa0a() {
      return field_42;
   }

   public int method_49$099c081838(C_45c var1, String var2, long var3) {
      long var5;
      int var13;
      int[] var10001;
      label81: {
         int[] var7;
         var3 = a ^ var3;
         var5 = var3 ^ 47087287742555L;
         String var8 = var2;
         int[] var10000 = recovery$indy$2(-8593130037780604422L, var3);
         byte var9 = -1;
         var7 = var10000;
         var13 = var8.hashCode();
         label80:
         if (var7 == null) {
            label84: {
               label77: {
                  label85: {
                     switch (var13) {
                        case 2181788:
                           break label85;
                        case 1550796526:
                           var13 = (int) ((var8.equals(recovery$indy$3(972, 1913945979254587308L ^ var3))) ? 1 : 0);
                           if (var7 != null) {
                              break label80;
                           }

                           if (var13 == 0) {
                              break label84;
                           }

                           var13 = 0;
                           if (var3 <= 0L) {
                              break;
                           }

                           var9 = 0;
                           if (var7 == null) {
                              break label84;
                           }
                        case -1986326225:
                           var13 = (int) ((var8.equals(recovery$indy$4(23003, 3139195299262195116L ^ var3))) ? 1 : 0);
                           break;
                        default:
                           break label84;
                     }

                     if (var7 != null) {
                        break label80;
                     }

                     if (var13 == 0) {
                        break label84;
                     }

                     var13 = 1;
                     if (var3 < 0L) {
                        break label77;
                     }

                     var9 = 1;
                     if (var7 == null) {
                        break label84;
                     }
                  }

                  var13 = (int) ((var8.equals(recovery$indy$5(4248, 5709280662274682111L ^ var3))) ? 1 : 0);
               }

               var10001 = var7;
               if (var3 < 0L) {
                  break label81;
               }

               if (var7 != null) {
                  break label80;
               }

               if (var13 != 0) {
                  var9 = 2;
               }
            }

            var13 = var9;
         }

         var10001 = var7;
      }

      if (var10001 == null) {
         switch (var13) {
            case 0:
               return recovery$indy$7(recovery$indy$6(-8596708661274543934L, var3), -8597354412460327592L, var3).getRGB();
            case 1:
               return recovery$indy$9(recovery$indy$8(var1, -8593054762420111493L, var3), -8592981826917244487L, var3).getRGB();
            case 2:
               long var10 = recovery$indy$10(var1.field_42, -8597024657102842313L, var3);
               return recovery$indy$12(
                  var5,
                  Color.RED,
                  Color.GREEN,
                  1.0F - C_47sk.method_46$ef9a6720f7((float)var10 / recovery$indy$11(var1, -8592885016080825145L, var3), 0.0F, 1.0F),
                  -8596458699169408435L,
                  var3
               );
            default:
               var13 = Color.GRAY.getRGB();
         }
      }

      return var13;
   }

   public static boolean method_45$aae029aa0a() {
      boolean var0 = method_48$aae029aa0a();
      return !var0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$13(this, 32, Integer.MAX_VALUE, var3, -7100521119624447201L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   public void method_43T$a19f828fbe(boolean var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 103634471092823L;
      int var4 = (int)((var2 ^ 103634471092823L) >>> 48);
      int var5 = (int)((var2 ^ 103634471092823L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 36828831774912L;
      long var9 = var2 ^ 115237679420430L;
      long var11 = var2 ^ 53870468381557L;
      long var13 = var2 ^ 92734423214603L;
      long var15 = var2 ^ 30175011847344L;
      int[] var17 = recovery$indy$14(-646135029286279603L, var2);
      boolean var10000 = recovery$indy$15(-646680660576612065L, var2);
      if (var17 == null) {
         if (var10000) {
            return;
         }

         recovery$indy$16((char)var4, (short)var5, var6, -646822132887848671L, var2);
         if (var17 != null) {
            return;
         }

         var10000 = recovery$indy$17(this.settingBlur, -645786584040344164L, var2);
      }

      label56:
      if (var10000) {
         var10000 = recovery$indy$18(-647033981586744621L, var2);
         int[] var20 = var17;
         if (var2 > 0L) {
            if (var17 == null) {
               if (var10000) {
                  break label56;
               }

               var10000 = C_47vQ.method_44G$aae029aa0a();
            }

            var20 = var17;
         }

         if (var2 > 0L) {
            if (var20 == null) {
               if (var10000) {
                  break label56;
               }

               var10000 = C_47vQ.method_44I$aae029aa0a();
            }

            var20 = var17;
         }

         if (var20 == null) {
            if (var10000) {
               break label56;
            }

            var10000 = C_47vQ.method_45a$aae029aa0a();
         }

         if (!var10000) {
            recovery$indy$19(field_44, var13, true, var1, -647376804323194500L, var2);
            recovery$indy$20(var15, -646578497440532623L, var2);
            recovery$indy$21(field_44, var7, -646332280955434389L, var2);
            recovery$indy$23(
               field_44, var1, var9, (int)recovery$indy$22(ClientGlobals.field_48.field_41A.settingSigma, var11, -645752118650710350L, var2), -646534292605875390L, var2
            );
         }
      }

      recovery$indy$24(var15, -646578497440532623L, var2);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Notifications_47HJ(long var1) {
      super("Notifications", "Benachrichtigungen", ((a ^ var1) ^ 83094837633628L), Color.WHITE, Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 134616606584746L;
      long var5 = var1 ^ 139242274754579L;
      long var7 = var1 ^ 167892701841L;
      long var9 = var1 ^ 64559899573831L;
      long var11 = var1 ^ 26318330479040L;
      long var13 = var1 ^ 83094837633628L;
      // Super arguments moved to the required Java constructor position.
      this.settingBlur = new BooleanSetting(this, var9, "Blur", true);
      this.settingAvoidDuplications = new BooleanSetting(this, var9, "AvoidDuplications", true);
      this.settingPosition = new ModeSetting(this, "Position", var7, "Bottom right", new String[]{"Top right", "Top left", "Bottom right", "Bottom left"});
      this.settingDuplicateTime = new NumberSetting(this, "DuplicateTime", 0.2F, var11, 0.0, 1.0, 1);
      this.settingShowDuration = new NumberSetting(this, "ShowDuration", 2.5, var11, 0.0, 10.0, 1);
      this.settingSpeed = new NumberSetting(this, "Speed", 5.0, var11, 1.0, 10.0, 0);
      this.settingGroupColorMode = new ModeSetting(this, "GroupColorMode", var7, "Blank", field_49);
      this.settingProgressColorMode = new ModeSetting(this, "ProgressColorMode", var7, "Notification type", field_49);
      long var10005 = -6058188691889765272L;
      this.settingNotificationTypes = new MultiSelectSetting(this, "NotificationTypes", var3, C_47sv.values());
      long var10004 = -6058325682376631101L;
      long var15 = var5;
      boolean var17 = false;
      boolean var18 = true;
      Notifications_47HJ var19 = this;
      var19.method_49$9bd74f13d3(var18, var17, var15);
   }

   // Retained obfuscator initialization is restored after javac.
   static { field_44 = null; field_49 = null; b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, boolean var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$2(long var0, long var2);

   private static native String recovery$indy$3(int var0, long var1);

   private static native String recovery$indy$4(int var0, long var1);

   private static native String recovery$indy$5(int var0, long var1);

   private static native Client recovery$indy$6(long var0, long var2);

   private static native Color recovery$indy$7(Object var0, long var1, long var3);

   private static native C_47jO recovery$indy$8(Object var0, long var1, long var3);

   private static native Color recovery$indy$9(Object var0, long var1, long var3);

   private static native long recovery$indy$10(Object var0, long var1, long var3);

   private static native int recovery$indy$11(Object var0, long var1, long var3);

   private static native int recovery$indy$12(long var0, Object var2, Object var3, double var4, long var6, long var8);

   private static native void recovery$indy$13(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native int[] recovery$indy$14(long var0, long var2);

   private static native boolean recovery$indy$15(long var0, long var2);

   private static native void recovery$indy$16(char var0, short var1, int var2, long var3, long var5);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native boolean recovery$indy$18(long var0, long var2);

   private static native void recovery$indy$19(Object var0, long var1, boolean var3, boolean var4, long var5, long var7);

   private static native void recovery$indy$20(long var0, long var2, long var4);

   private static native void recovery$indy$21(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$23(Object var0, boolean var1, long var2, int var4, long var5, long var7);

   private static native void recovery$indy$24(long var0, long var2, long var4);

   private static native MethodHandle recovery$constant$25();
}
