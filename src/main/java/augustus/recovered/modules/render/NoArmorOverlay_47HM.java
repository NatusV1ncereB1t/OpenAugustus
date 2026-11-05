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
import net.C_47Pb;
import client.setting.MultiSelectSetting;
import client.module.Category;
import net.C_4f;

public class NoArmorOverlay_47HM extends Module {
   private final MultiSelectSetting settingArmorTypes;
   private static final long a = C_4f.a(-2260433461566972869L, -4222487572693841547L, MethodHandles.lookup().lookupClass()).a(199460683401649L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[4];
   private static final String[] f = new String[4];

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public NoArmorOverlay_47HM(char var1, char var2, int var3) {
      super("NoArmorOverlay", "KeineArmor", ((((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a) ^ 13393084569391L), new Color(157, 224, 190), Category.RENDER);
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 67978784660185L;
      long var8 = var4 ^ 13393084569391L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = 6815559636598241842L;
      this.settingArmorTypes = new MultiSelectSetting(this, "ArmorTypes", var6, C_47Pb.values());
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native MethodHandle recovery$constant$1();
}
