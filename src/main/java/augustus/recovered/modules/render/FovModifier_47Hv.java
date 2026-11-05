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
import net.C_45n;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47nb;
import client.module.Category;
import net.C_4f;

public class FovModifier_47Hv extends Module {
   public final C_47nb field_431;
   public final BooleanSetting settingIgnoreDynamicFov;
   public final NumberSetting settingDefaultFov;
   public final NumberSetting settingSprintFov;
   public final NumberSetting settingSpeedFov;
   public final ModeSetting settingAnimationModes;
   public final NumberSetting settingAnimationTime;
   public float field_46;
   public float field_40;
   public boolean field_43P;
   public boolean field_43a;
   private static final long a = C_4f.a(8303445590377719125L, -4182578598213819866L, MethodHandles.lookup().lookupClass()).a(207580313473341L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[13];
   private static final String[] f = new String[13];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Class b(long var0, long var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 120555133297141L;
      long var3 = var1 ^ 125840144839141L;
      long var10000 = 8364288308549838060L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8363823240213413196L;
      long var6 = var3;
      ModeSetting var8 = this.settingAnimationModes;
      boolean var9 = var8.method_46$5f9dc63072(var6).equalsIgnoreCase("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 64443100522902L;
      this.field_40 = (float)recovery$indy$1(this.settingDefaultFov, var6, 2733207323955950120L, var4);
   }

   public FovModifier_47Hv(int var1, short var2, short var3) {
      super("FovModifier", "SichtfeldModifizierer", ((((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a) ^ 133382841077435L), new Color(252, 186, 3), Category.RENDER);
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 56055995596406L;
      long var8 = var4 ^ 9256182633120L;
      long var10 = var4 ^ 40901714275623L;
      long var12 = var4 ^ 133382841077435L;
      // Super arguments moved to the required Java constructor position.
      this.field_431 = new C_47nb(0.0F, 0.0F, 0.0F, 0.0F);
      this.settingIgnoreDynamicFov = new BooleanSetting(this, var8, "IgnoreDynamicFov", true);
      this.settingDefaultFov = new NumberSetting(this, "DefaultFov", 85.0, var10, 30.0, 150.0, 0);
      this.settingSprintFov = new NumberSetting(this, "SprintFov", 90.0, var10, 30.0, 150.0, 0);
      this.settingSpeedFov = new NumberSetting(this, "SpeedFov", 100.0, var10, 30.0, 150.0, 0);
      this.settingAnimationModes = new ModeSetting(this, "AnimationModes", var6, "easeOutQuint", C_47nb.method_42$8fc34d0ddc(true));
      NumberSetting var10001 = new NumberSetting(this, "AnimationTime", 200.0, var10, 1.0, 1000.0, 0);
      C_45n var10002 = recovery$indy$2(this);
      long var10003 = -8717859676478699663L;
      C_45n var14 = var10002;
      NumberSetting var15 = var10001;
      this.settingAnimationTime = var15.method_43$9db6d416f4(var14);
      this.field_46 = 70.0F;
      this.field_40 = 70.0F;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native double recovery$indy$1(Object var0, long var1, long var3, long var5);

   private static native C_45n recovery$indy$2(FovModifier_47Hv var0);

   private static native MethodHandle recovery$constant$3();
}
