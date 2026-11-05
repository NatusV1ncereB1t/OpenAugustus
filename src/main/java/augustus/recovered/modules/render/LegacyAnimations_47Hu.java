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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.module.Category;
import net.C_4f;

public class LegacyAnimations_47Hu extends Module {
   private final ModeSetting settingHeartAnimationMode;
   private final BooleanSetting settingDamageAnimation;
   private final BooleanSetting settingItemHeld;
   private final BooleanSetting settingSwing;
   private final BooleanSetting settingDebugHitBox;
   private final BooleanSetting settingRod;
   private static String field_45;
   private static final long a = C_4f.a(7423764748242193617L, 2300720849091073371L, MethodHandles.lookup().lookupClass()).a(145860542075317L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[19];
   private static final String[] f = new String[19];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(int var0, long var1);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   public boolean method_49Z$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 37642221671678L;
      long var5 = var1 ^ 76418714869589L;
      int[] var7 = recovery$indy$1(6530991830858150784L, var1);
      boolean var10000 = recovery$indy$2(this, var3, 6531671548871824388L, var1);
      if (var7 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$3(this.settingHeartAnimationMode, var5, 6531885353192333817L, var1).equals(recovery$indy$4(9422, 6203177401895963120L ^ var1));
      }

      return var7 != null ? var10000 : var10000;
   }

   public boolean method_49F$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 10380127950758L;
      int[] var5 = recovery$indy$5(-2739713342098525992L, var1);
      boolean var10000 = recovery$indy$6(this, var3, -2739028710642329764L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$7(this.settingSwing, -2739647696784544533L, var1);
      }

      if (var10000) {
         EntityPlayerSP var7 = recovery$indy$8(field_43, -2738943295275044847L, var1);
         if (var5 == null) {
            if (var7.method_48$ac4db64966() == null) {
               return false;
            }

            var7 = recovery$indy$9(field_43, -2738943295275044847L, var1);
         }

         var10000 = var7.field_488;
         int[] var10001 = var5;
         if (var1 >= 0L) {
            if (var5 == null) {
               if (!var7.field_488) {
                  return false;
               }

               var10000 = recovery$indy$10(field_43, -2738943295275044847L, var1).method_48V$aae029aa0a();
            }

            var10001 = var5;
         }

         if (var1 > 0L) {
            if (var10001 == null) {
               if (var10000) {
                  return false;
               }

               var10000 = recovery$indy$11(field_43, -2738943295275044847L, var1).method_43B$aae029aa0a();
            }

            var10001 = var5;
         }

         if (var10001 != null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      }

      return false;
   }

   public static void method_44$a7421bf54c(String var0) {
      field_45 = var0;
   }

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 93551311993840L;
      int[] var5 = recovery$indy$12(3867687587493665934L, var1);
      boolean var10000 = recovery$indy$13(this, var3, 3867289721340148490L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$14(this.settingDebugHitBox, 3867620704541098173L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 121742179821349L;
      int[] var5 = recovery$indy$15(-1622999066786496421L, var1);
      boolean var10000 = recovery$indy$16(this, var3, -1621748659288381473L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$17(this.settingItemHeld, -1623064813099312024L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public static String method_43$0e30dfc966() {
      return field_45;
   }

   public boolean method_491$ca7981a620(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 139952135010506L;
      int[] var8 = recovery$indy$18(-678105092732379212L, var4);
      boolean var10000 = recovery$indy$19(this, var6, -679632464996632528L, var4);
      if (var8 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$20(this.settingDamageAnimation, -678171252767292537L, var4);
      }

      return var8 != null ? var10000 : var10000;
   }

   public boolean method_49d$800bd538b0(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 12700027665031L;
      long var8 = var4 ^ 118954114281772L;
      int[] var10 = recovery$indy$21(3808804791273151993L, var4);
      boolean var10000 = recovery$indy$22(this, var6, 3808920597839526525L, var4);
      if (var10 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$23(this.settingHeartAnimationMode, var8, 3809133444835331968L, var4).equals(recovery$indy$24(2346, 5361822252116281958L ^ var4));
      }

      return var10 != null ? var10000 : var10000;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public boolean method_49K$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 38914105090215L;
      int[] var5 = recovery$indy$25(3385509755822688217L, var1);
      boolean var10000 = recovery$indy$26(this, var3, 3385627143431954525L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$27(this.settingRod, 3385575504966802410L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public LegacyAnimations_47Hu(long var1) {
      super("LegacyAnimations", "AlteAnimationen", ((a ^ var1) ^ 139548369426169L), new Color(50, 168, 104), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 58683003627060L;
      long var5 = var1 ^ 17384439794402L;
      long var7 = var1 ^ 139548369426169L;
      // Super arguments moved to the required Java constructor position.
      this.settingHeartAnimationMode = new ModeSetting(this, "HeartAnimationMode", var3, "Default", new String[]{"Default", "Legacy", "Minimal"});
      this.settingDamageAnimation = new BooleanSetting(this, var5, "DamageAnimation", true);
      this.settingItemHeld = new BooleanSetting(this, var5, "ItemHeld", false);
      this.settingSwing = new BooleanSetting(this, var5, "Swing", true);
      this.settingDebugHitBox = new BooleanSetting(this, var5, "DebugHitBox", true);
      this.settingRod = new BooleanSetting(this, var5, "Rod", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$4(int var0, long var1);

   private static native int[] recovery$indy$5(long var0, long var2);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);

   private static native int[] recovery$indy$12(long var0, long var2);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3);

   private static native int[] recovery$indy$15(long var0, long var2);

   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native int[] recovery$indy$18(long var0, long var2);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$20(Object var0, long var1, long var3);

   private static native int[] recovery$indy$21(long var0, long var2);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$23(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$24(int var0, long var1);

   private static native int[] recovery$indy$25(long var0, long var2);

   private static native boolean recovery$indy$26(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$27(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$28();
}
