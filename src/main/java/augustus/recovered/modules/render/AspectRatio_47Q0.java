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
import net.C_443;
import client.module.Module;
import net.C_47T5;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;

public class AspectRatio_47Q0 extends Module implements C_47T5 {
   private final NumberSetting settingAspect;
   private final BooleanSetting settingHand;
   private static final long a = C_4f.a(301618084607743887L, 7031975952722786849L, MethodHandles.lookup().lookupClass()).a(267107550269193L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[20];
   private static final String[] f = new String[20];

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
   public void method_43$44ed1b990b(int var1, C_443 var2, int var3, byte var4) {
      long var5 = (long)var1 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56;
      long var7 = var5 ^ 62448293922512L;
      int[] var9 = recovery$indy$1(769565719554737028L, var5);
      C_443 var10000 = var2;
      if (var9 == null) {
         label23: {
            boolean var10 = recovery$indy$2(var2, 769673735617859763L, var5);
            if (var4 < 0) {
               if (!var10) {
                  break label23;
               }

               var10 = recovery$indy$3(this.settingHand, 768216857636044400L, var5);
            }

            if (!var10) {
               return;
            }
         }

         var10000 = var2;
      }

      recovery$indy$6(
         var10000,
         recovery$indy$4(var2, 769758777710285839L, var5) * (float)recovery$indy$5(this.settingAspect, var7, 768319087394481424L, var5),
         769812683280456418L,
         var5
      );
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$7(this, 48, var3, -7098026531906774404L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AspectRatio_47Q0(char var1, long var2) {
      super("AspectRatio", "BildschirmVerzerrung", ((((long)var1 << 48 | var2 << 16 >>> 16) ^ a) ^ 26312039200010L), new Color(235, 119, 110), Category.RENDER);
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var6 = var4 ^ 113020925192465L;
      long var8 = var4 ^ 83092840978070L;
      long var10 = var4 ^ 26312039200010L;
      // Super arguments moved to the required Java constructor position.
      this.settingAspect = new NumberSetting(this, "Aspect", 1.0, var8, 0.0, 5.0, 2);
      this.settingHand = new BooleanSetting(this, var6, "Hand", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native float recovery$indy$4(Object var0, long var1, long var3);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$6(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$8();
}
