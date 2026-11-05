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
import net.C_473U;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47cu;
import net.C_47iC;
import net.C_47ob;
import client.module.Category;
import net.C_47xZ;
import net.C_49L;
import net.C_4f;

public class Fixes_47ks extends Module implements C_49L, C_47iC {
   private final BooleanSetting settingIntave;
   private final BooleanSetting settingIntaveBlocking;
   private final BooleanSetting settingMouseDelayFix;
   public final ModeSetting settingHitDelayFixMode;
   public final BooleanSetting settingMemoryFix;
   public final BooleanSetting settingPlaceWhileBreak;
   private final BooleanSetting settingNoTerrainDownload;
   private final BooleanSetting settingNoReducedDebugInformation;
   public final C_47cu field_44;
   public final C_47cu field_46;
   private static final long a = C_4f.a(9045605166073850997L, 4824919934469123852L, MethodHandles.lookup().lookupClass()).a(62121618559466L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[20];
   private static final String[] f = new String[20];

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

   public static void method_41$da8c82d5d4() {
   }

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 87090512809452L;
      int[] var5 = recovery$indy$1(4877612499952550249L, var1);
      boolean var10000 = recovery$indy$2(this, var3, 4879474199357467995L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$3(this.settingPlaceWhileBreak, 4877413327658105019L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 58237945528152L;
      int[] var5 = recovery$indy$4(3532151946112087005L, var1);
      boolean var10000 = recovery$indy$5(this, var3, 3531706305334534127L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$6(this.settingNoTerrainDownload, 3532078122504243727L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   @Override
   public void method_45$df16004b03(int var1, int var2) {
      long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
      if (recovery$indy$7(this.settingMemoryFix, 3082746375292735939L, var3)) {
         long var5 = Runtime.getRuntime().maxMemory();
         long var7 = Runtime.getRuntime().totalMemory();
         long var9 = Runtime.getRuntime().freeMemory();
         long var11 = var7 - var9;
         if (var11 * 100L / var5 > 50L) {
            System.gc();
         }
      }
   }

   @Override
   public void method_47$9035875d26(long var1, C_47ob var3) {
      C_473U var4 = recovery$indy$8(var3, 2668165573671594410L, var1);
      if (var4 instanceof C_47xZ) {
         recovery$indy$9(this.field_46, 2666277220009748887L, var1);
      }
   }

   public boolean method_40p$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 68311319892068L;
      int[] var5 = recovery$indy$10(-2433998045209305887L, var1);
      boolean var10000 = recovery$indy$11(this, var3, -2432173617522265901L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$12(this.settingIntave, -2434058701591435981L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_403$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 69182995262186L;
      long var5 = var1 ^ 100303589991235L;
      int[] var7 = recovery$indy$13(7257185106251638383L, var1);
      boolean var10000 = recovery$indy$14(this, var3, 7255631259365116509L, var1);
      if (var7 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$15(this.settingIntaveBlocking, 7257124510264860605L, var1);
      }

      int[] var10001 = var7;
      if (var1 > 0L) {
         if (var7 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = recovery$indy$16(this.field_46, 500L, var5, 7255843420600210597L, var1);
         }

         var10001 = var7;
      }

      return var10001 != null ? var10000 : !var10000;
   }

   public boolean method_40Z$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 31558181602883L;
      int[] var5 = recovery$indy$17(5197032195760147142L, var1);
      boolean var10000 = recovery$indy$18(this, var3, 5194915812703643380L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$19(this.settingNoReducedDebugInformation, 5196975928842990356L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$20(this, 8, var3, -7098214991847811894L, var1);
      recovery$indy$21(this, 26, var3, -7098214991847811894L, var1);
   }

   @Override
   public void method_43F$e45a9973e5(long var1) {
      long var3 = var1 ^ 8889284300255L;
      recovery$indy$22(this, var3, true, 2168436456014032712L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public boolean method_40K$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 101281185103287L;
      int[] var5 = recovery$indy$23(8353000358107574578L, var1);
      boolean var10000 = recovery$indy$24(this, var3, 8353135824526220544L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$25(this.settingMouseDelayFix, 8352803728768239840L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public Fixes_47ks(long var1) {
      super("Fixes", "Reparieren", ((a ^ var1) ^ 8224624502297L), new Color(169, 66, 237), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 84451417298644L;
      long var5 = var1 ^ 130148019255810L;
      long var7 = var1 ^ 8224624502297L;
      // Super arguments moved to the required Java constructor position.
      this.settingIntave = new BooleanSetting(this, var5, "Intave", false);
      this.settingIntaveBlocking = new BooleanSetting(this, var5, "IntaveBlocking", false);
      this.settingMouseDelayFix = new BooleanSetting(this, var5, "MouseDelayFix", true);
      this.settingHitDelayFixMode = new ModeSetting(
         this, "HitDelayFixMode", var3, "Default", new String[]{"None", "Default", "WithoutDoubleClick", "OnlyAtTarget", "OnlyAtTargetLite"}
      );
      this.settingMemoryFix = new BooleanSetting(this, var5, "MemoryFix", false);
      this.settingPlaceWhileBreak = new BooleanSetting(this, var5, "PlaceWhileBreak", true);
      this.settingNoTerrainDownload = new BooleanSetting(this, var5, "NoTerrainDownload", true);
      this.settingNoReducedDebugInformation = new BooleanSetting(this, var5, "NoReducedDebugInformation", true);
      this.field_44 = new C_47cu();
      this.field_46 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native int[] recovery$indy$4(long var0, long var2);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native C_473U recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(Object var0, long var1, long var3);

   private static native int[] recovery$indy$10(long var0, long var2);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3);

   private static native int[] recovery$indy$13(long var0, long var2);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5, long var7);

   private static native int[] recovery$indy$17(long var0, long var2);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3);

   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$22(Object var0, long var1, boolean var3, long var4, long var6);

   private static native int[] recovery$indy$23(long var0, long var2);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$26();
}
