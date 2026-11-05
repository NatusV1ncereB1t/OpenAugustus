package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.module.Module;
import client.module.Category;
import net.C_4f;

public class ArrowHitboxes_47Qq extends Module {
   private static final long a = C_4f.a(2918458753102178157L, -6687456056544640466L, MethodHandles.lookup().lookupClass()).a(276850159174501L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public ArrowHitboxes_47Qq(byte var1, long var2) {
      super("ArrowHitboxes", "PfeilTrefferkasten", ((((long)var1 << 56 | var2 << 8 >>> 8) ^ a) ^ 17736629322162L), new Color(153, 0, 153), Category.RENDER);
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      long var6 = var4 ^ 17736629322162L;
      // Super arguments moved to the required Java constructor position.
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native MethodHandle recovery$constant$0();
}
