package augustus.recovered.modules.movement;

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
import net.C_472n;
import net.C_477G;
import client.module.Module;
import net.C_47Rw;
import net.C_47Vc;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.C_47ob;
import net.C_47od;
import client.module.Category;
import net.C_47zh;
import net.C_4f;

public class MotionModifier_47k7 extends Module implements C_47od, C_47Vc, C_47hi, C_47mz, C_47iC {
   private final C_477G field_46;
   private static final long a = C_4f.a(-7351453013599278447L, 8470702061048280959L, MethodHandles.lookup().lookupClass()).a(118014605195414L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[22];
   private static final String[] f = new String[22];

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
   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 40837212139137L;
      recovery$indy$1(this.field_46, var4, var3, -7189251938636001009L, var1);
   }

   @Override
   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4 = var2 ^ 76598487307130L;
      recovery$indy$2(this.field_46, var4, var1, 8495150215993158030L, var2);
   }

   @Override
   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      long var4 = (var2 ^ 126321112146361L) >>> 16;
      int var6 = (int)((var2 ^ 126321112146361L) << 48 >>> 48);
      recovery$indy$3(this.field_46, var4, var1, (short)var6, 3159956347707320739L, var2);
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 62620264325810L;
      recovery$indy$4(this.field_46, var4, var1, 6396716555183922402L, var2);
   }

   @Override
   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 21291186487410L;
      recovery$indy$5(this.field_46, var6, 5870300448417831576L, var4);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$6(this, 20, var3, -7098209933819393620L, var1);
      recovery$indy$7(this, 43, var3, -7098209933819393620L, var1);
      recovery$indy$8(this, 21, var3, -7098209933819393620L, var1);
      recovery$indy$9(this, 25, var3, -7098209933819393620L, var1);
      recovery$indy$10(this, 26, var3, -7098209933819393620L, var1);
   }

   @Override
   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 86996371926297L;
      recovery$indy$11(this.field_46, var3, 4559693639352661205L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      long var10001 = var1 ^ 50371951572954L;
      int var3 = (int)((var1 ^ 50371951572954L) >>> 32);
      int var4 = (int)((var1 ^ 50371951572954L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      recovery$indy$12(this.field_46, var3, var4, (byte)var5, -7739149430144758309L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 133160972543104L;
      recovery$indy$13(this.field_46, var6, 2731685744426950333L, var4);
   }

   public MotionModifier_47k7(long var1) {
      super("MotionModifier", "BewegungsModifizierer", ((a ^ var1) ^ 138616696342514L), new Color(50, 168, 82), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 83960469440262L;
      long var5 = var1 ^ 138616696342514L;
      long var7 = var1 ^ 113651212003455L;
      // Super arguments moved to the required Java constructor position.
      this.field_46 = new C_477G(this, var3);
      long var10002 = 1030563554643646269L;
      long var9 = var7;
      C_477G var11 = this.field_46;
      var11.method_45$e45a9973e5(var9);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$2(Object var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$3(Object var0, long var1, Object var3, short var4, long var5, long var7);

   private static native void recovery$indy$4(Object var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$8(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$12(Object var0, int var1, int var2, byte var3, long var4, long var6);

   private static native void recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native MethodHandle recovery$constant$14();
}
