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
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;

public class CustomHurtCam_47Hi extends Module {
   private final BooleanSetting settingRemoveHurtCamAtDeath;
   private final NumberSetting settingStrength;
   private static final long a = C_4f.a(6289134222185308101L, 2258591836856965796L, MethodHandles.lookup().lookupClass()).a(247103577270419L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[13];
   private static final String[] f = new String[13];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 123915705440196L;
      int[] var5 = recovery$indy$1(-2766929469929562456L, var1);
      boolean var10000 = recovery$indy$2(this.settingRemoveHurtCamAtDeath, -2767004368000343216L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$3(this, var3, -2767454511686934814L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public float method_47$5618b8530d(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 65831097724303L;
      long var5 = var1 ^ 105581376679850L;
      int[] var7 = recovery$indy$4(-2030367918425709341L, var1);
      CustomHurtCam_47Hi var10000 = this;
      if (var7 == null) {
         if (!recovery$indy$5(this, var3, -2030193636444855127L, var1)) {
            return 14.0F;
         }

         var10000 = this;
      }

      return (float)recovery$indy$6(var10000.settingStrength, var5, -2030509840189185760L, var1);
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

   public CustomHurtCam_47Hi(long var1) {
      super("CustomHurtCam", "GegenSchmerzCam", ((a ^ var1) ^ 107969698792042L), new Color(245, 162, 54), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 20985817194097L;
      long var5 = var1 ^ 68505121710582L;
      long var7 = var1 ^ 107969698792042L;
      // Super arguments moved to the required Java constructor position.
      this.settingRemoveHurtCamAtDeath = new BooleanSetting(this, var3, "RemoveHurtCamAtDeath", true);
      this.settingStrength = new NumberSetting(this, "Strength", 0.0, var5, -35.0, 35.0, 1);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$4(long var0, long var2);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native MethodHandle recovery$constant$7();
}
