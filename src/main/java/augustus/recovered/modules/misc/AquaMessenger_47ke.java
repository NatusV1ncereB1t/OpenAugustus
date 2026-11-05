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
import client.Client;
import net.C_475e;
import client.module.Module;
import net.C_47cu;
import net.C_47r1;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class AquaMessenger_47ke extends Module implements C_47xz {
   boolean field_43a;
   private final C_47cu field_49;
   private static final long a = C_4f.a(3036562757344362009L, 831588202910475709L, MethodHandles.lookup().lookupClass()).a(238952366661134L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[21];
   private static final String[] f = new String[21];

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
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 40, var3, -7098185271267957490L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 699800515287L;
      recovery$indy$2(var3, false, -7738963732334672284L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = true;
   }

   @Override
   public void method_487$da8c82d5d4() {
      long var1 = a ^ 17341629835213L;
      long var3 = var1 ^ 18371206823682L;
      long var5 = var1 ^ 12585715114521L;
      long var7 = var1 ^ 28657421075362L;
      long var9 = var1 ^ 113736564757192L;
      long var10000 = -4300919061242132874L;
      int[] var11 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10003 = -4300587317997066778L;
      long var12 = var7;
      long var14 = 10000L;
      C_47cu var16 = this.field_49;
      boolean var24 = var16.method_42$b0e346e6e3(var14, var12);
      if (var11 == null) {
         if (!var24) {
            return;
         }

         var10000 = -4300738086950767180L;
         Client var26 = Client.method_44$fbc0c0be91();
         long var10002 = -4300708341819121490L;
         long var17 = var9;
         Client var19 = var26;
         var24 = var19.method_43$5f9dc63072(var17).isEmpty();
      }

      if (var11 == null) {
         if (var24) {
            return;
         }

         var24 = this.field_43a;
      }

      if (var11 == null) {
         if (!var24) {
            return;
         }

         long var27 = -4300837403340537151L;
         String var20 = "Attention: chat messages are unsecure!";
         long var21 = var3;
         C_475e.method_46$d07b98bfef(var21, var20);
         var24 = true;
      }

      long var28 = -4298784060483316054L;
      C_47r1.method_45$b757cde368(var5, var24);
      long var10001 = -4298688458044045402L;
      C_47cu var23 = this.field_49;
      var23.method_46$da8c82d5d4();
      this.field_43a = false;
   }

   public AquaMessenger_47ke(long var1) {
      super("AquaMessenger", "WasserBote", ((a ^ var1) ^ 106782215797041L), new Color(52, 235, 195), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 106782215797041L;
      // Super arguments moved to the required Java constructor position.
      this.field_43a = false;
      this.field_49 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$2(long var0, boolean var2, long var3, long var5);

   private static native MethodHandle recovery$constant$3();
}
