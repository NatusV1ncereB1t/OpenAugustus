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
import client.module.Module;
import net.C_47dH;
import client.module.Category;
import net.C_4f;
import net.java.games.input.DefaultControllerEnvironment;

public class RawMouseInput_47ky extends Module {
   private static boolean field_42;
   private static final long a = C_4f.a(5443613327159009750L, 8614035152500280517L, MethodHandles.lookup().lookupClass()).a(3578829913724L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[8];
   private static final String[] f = new String[8];

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

   public static void method_48$f633c984d8(boolean var0) {
      field_42 = var0;
   }

   public static synchronized boolean method_45$aae029aa0a() {
      return field_42;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$1(C_47dH.field_44, null, -7738401207777649256L, var1);
      recovery$indy$2(false, -7738349704074425440L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      C_47dH.field_44.field_45 = new DefaultControllerEnvironment();
      recovery$indy$3(C_47dH.field_44, null, 2733043198066109678L, var4);
      recovery$indy$4(true, 2733067763736623830L, var4);
   }

   public RawMouseInput_47ky(int var1, int var2, char var3) {
      super("RawMouseInput", "RohMausEingabe", ((((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a) ^ 38471446802525L), new Color(255, 211, 99), Category.MISC);
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 38471446802525L;
      // Super arguments moved to the required Java constructor position.
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$2(boolean var0, long var1, long var3);

   private static native void recovery$indy$3(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$4(boolean var0, long var1, long var3);

   private static native MethodHandle recovery$constant$5();
}
