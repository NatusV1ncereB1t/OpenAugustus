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
import net.C_478W;
import client.module.Module;
import net.C_47Sy;
import client.setting.ColorSetting;
import client.module.Category;
import net.C_4f;

public class CustomClientColor_47QA extends Module implements C_47Sy {
   public final ColorSetting settingColorSetting;
   private static final long a = C_4f.a(-2504506609502399541L, -4788763150818733994L, MethodHandles.lookup().lookupClass()).a(123422317480331L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[12];
   private static final String[] f = new String[12];

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

   @Override
   public void method_40$78e9da5ba7(byte var1, C_478W var2, int var3, int var4) {
      long var5 = (long)var1 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40;
      long var7 = var5 ^ 115547156937392L;
      recovery$indy$3(
         recovery$indy$1(-4534347551053172082L, var5), recovery$indy$2(this.settingColorSetting, var7, 0, -4534415626465932960L, var5), -4534455475461044675L, var5
      );
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$4(this, 42, var3, -7097910708493940972L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$6(recovery$indy$5(-7739257771833202940L, var1), new Color(41, 146, 222), -7739435789167979593L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomClientColor_47QA(long var1) {
      super("CustomClientColor", "EinstellbareKundenFarbe", ((a ^ var1) ^ 132825077239399L), new Color(145, 100, 250), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 120368265941593L;
      long var5 = var1 ^ 132825077239399L;
      // Super arguments moved to the required Java constructor position.
      this.settingColorSetting = new ColorSetting(var3, this, "ColorSetting", new Color(41, 146, 222));
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native Client recovery$indy$1(long var0, long var2);

   private static native Color recovery$indy$2(Object var0, long var1, int var3, long var4, long var6);

   private static native void recovery$indy$3(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);

   private static native Client recovery$indy$5(long var0, long var2);

   private static native void recovery$indy$6(Object var0, Object var1, long var2, long var4);

   private static native MethodHandle recovery$constant$7();
}
