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
import net.C_45y;
import net.C_4781;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47UT;
import client.event.RenderListener;
import client.module.Category;
import net.C_4f;

public class CustomGlint_47HD extends Module implements C_47UT, RenderListener {
   public final BooleanSetting settingRemove;
   public final BooleanSetting settingBrighterEnchantments;
   public final BooleanSetting settingCustomColor;
   public final ColorSetting settingColor;
   private final MultiSelectSetting settingFakeEnchant;
   public final NumberSetting settingSpeed;
   private int field_42;
   private static final long a = C_4f.a(2986550585238019503L, 9106255971698707072L, MethodHandles.lookup().lookupClass()).a(266603845812338L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[32];
   private static final String[] f = new String[32];

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
   public void method_48$d0c2422fd1(C_45y var1, long var2) {
      long var4 = var2 ^ 27794404092648L;
      long var10001 = var2 ^ 138045210874880L;
      int var6 = (int)((var2 ^ 138045210874880L) >>> 32);
      int var7 = (int)((var2 ^ 138045210874880L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      int[] var9 = recovery$indy$1(7391551642809324677L, var2);
      boolean var10000 = recovery$indy$2(this.settingCustomColor, 7392580448013253444L, var2);
      if (var9 == null) {
         if (var10000) {
            recovery$indy$4(
               var1, recovery$indy$3(this.settingColor, var6, (short)var7, (char)var8, this.field_42, 7391752607036825011L, var2), 7391960707928560838L, var2
            );
            this.field_42++;
         }

         var10000 = recovery$indy$5(this.settingRemove, 7392580448013253444L, var2);
      }

      if (var10000) {
         var1.cancel();
      }

      recovery$indy$7(var1, recovery$indy$6(this.settingSpeed, var4, 7392594300600132329L, var2), 7392032363128091132L, var2);
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 125929547371822L;
      long var10000 = 8913267107564145059L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 8913151998694647394L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 110398401777356L;
      long var10000 = -2283219639037242815L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2282209673715876480L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   @Override
   public void onRender3D(long var1, float var3) {
      this.field_42 = 0;
   }

   private boolean method_45F$aae029aa0a() {
      long var1 = a ^ 44314731336528L;
      long var10000 = -4770415983164059683L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -4769388690862497764L;
      BooleanSetting var4 = this.settingCustomColor;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -4769529872056214267L;
         BooleanSetting var5 = this.settingCustomColor;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$8(this, 12, var3, -7099032766453017670L, var1);
      recovery$indy$9(this, 32, var3, -7099032766453017670L, var1);
   }

   private boolean method_45E$aae029aa0a() {
      long var1 = a ^ 119438217170883L;
      long var10000 = -6818635528347774130L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -6819295719075070833L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomGlint_47HD(long var1) {
      super("CustomGlint", "KundenspezifischesGlitzern", ((a ^ var1) ^ 28154183864279L), new Color(128, 64, 204), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 44422601589281L;
      long var5 = var1 ^ 107126003140337L;
      long var7 = var1 ^ 115172425733068L;
      long var9 = var1 ^ 13400231957481L;
      long var11 = var1 ^ 76861004196939L;
      long var13 = var1 ^ 28154183864279L;
      // Super arguments moved to the required Java constructor position.
      this.settingRemove = new BooleanSetting(this, var7, "Remove", false);
      this.settingBrighterEnchantments = new BooleanSetting(this, var7, "BrighterEnchantments", false);
      BooleanSetting var10001 = new BooleanSetting(this, var7, "CustomColor", false);
      C_45n var10003 = recovery$indy$10(this);
      long var10004 = -4148957006459385402L;
      C_45n var15 = var10003;
      long var16 = var5;
      BooleanSetting var18 = var10001;
      this.settingCustomColor = (BooleanSetting)var18.method_43$780fd62a21(var16, var15);
      ColorSetting var28 = new ColorSetting(var9, this, "Color", new Color(128, 64, 204));
      var10003 = recovery$indy$11(this);
      var10004 = -4148957006459385402L;
      C_45n var19 = var10003;
      long var20 = var5;
      ColorSetting var22 = var28;
      this.settingColor = (ColorSetting)var22.method_43$780fd62a21(var20, var19);
      long var10005 = -4150057468115815294L;
      MultiSelectSetting var29 = new MultiSelectSetting(this, "FakeEnchant", var3, C_4781.values());
      C_45n var10002 = recovery$indy$12(this);
      long var33 = -4149372809012107636L;
      C_45n var23 = var10002;
      MultiSelectSetting var24 = var29;
      this.settingFakeEnchant = var24.method_40$1f2e7f1148(var23);
      NumberSetting var30 = new NumberSetting(this, "Speed", 1.0, var11, 0.01, 10.0, 2);
      var10002 = recovery$indy$13(this);
      long var34 = -4149441038309655244L;
      C_45n var25 = var10002;
      NumberSetting var26 = var30;
      this.settingSpeed = var26.method_43$9db6d416f4(var25);
      this.field_42 = 0;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native int recovery$indy$3(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$7(Object var0, double var1, long var3, long var5);

   private static native void recovery$indy$8(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$10(CustomGlint_47HD var0);

   private static native C_45n recovery$indy$11(CustomGlint_47HD var0);

   private static native C_45n recovery$indy$12(CustomGlint_47HD var0);

   private static native C_45n recovery$indy$13(CustomGlint_47HD var0);

   private static native MethodHandle recovery$constant$14();
}
