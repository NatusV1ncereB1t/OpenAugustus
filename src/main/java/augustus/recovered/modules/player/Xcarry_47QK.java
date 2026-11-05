package augustus.recovered.modules.player;

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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47dz;
import net.C_47iC;
import net.C_47ob;
import client.module.Category;
import net.C_4f;

public class Xcarry_47QK extends Module implements C_47iC {
   private static final long a = C_4f.a(4845628414871098837L, 4323801898382560086L, MethodHandles.lookup().lookupClass()).a(155756726616395L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[15];
   private static final String[] f = new String[15];

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
   public void method_41$9035875d26(long var1, C_47ob var3) {
      boolean var4 = recovery$indy$1(-7189227682061161574L, var1);
      C_473U var10000 = recovery$indy$2(var3, -7189349547036338851L, var1);
      if (!var4) {
         if (!(var10000 instanceof C_47dz)) {
            return;
         }

         var10000 = recovery$indy$3(var3, -7189349547036338851L, var1);
      }

      C_47dz var5 = (C_47dz)var10000;
      if (var5.method_48$8abf5c6871() == recovery$indy$4(field_43, -7189366190068019476L, var1).field_42e.field_43) {
         var3.cancel();
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$5(this, 26, var3, -7097769728504172625L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Xcarry_47QK(long var1) {
      super("Xcarry", "Behalten des X Förmigen Inventares", ((a ^ var1) ^ 46079913694881L), Color.WHITE, Category.PLAYER);
      var1 = a ^ var1;
      long var3 = var1 ^ 46079913694881L;
      // Pure super-constructor arguments are evaluated in the first statement above.
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);

   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$6();
}
