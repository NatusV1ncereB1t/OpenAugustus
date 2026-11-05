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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.ModeSetting;
import net.C_47Vc;
import client.module.Category;
import net.C_4f;

public class NoBob_47HB extends Module implements C_47Vc {
   public final ModeSetting settingMode;
   private static final long a = C_4f.a(336068798790027398L, 675245505475263490L, MethodHandles.lookup().lookupClass()).a(175017805762105L);
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
   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 115274117911687L;
      if (recovery$indy$1(this.settingMode, var6, 5868612867785109327L, var4).equals(recovery$indy$2(10491, 3346454742305218451L ^ var4))) {
         recovery$indy$3(field_43, 5868703995980091706L, var4).field_48C = 0.0F;
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$4(this, 43, var3, -7097926958758575803L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public NoBob_47HB(long var1) {
      super("NoBob", "KeinBob", ((a ^ var1) ^ 4959817031416L), new Color(121, 232, 163), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 87097059388981L;
      long var5 = var1 ^ 4959817031416L;
      // Super arguments moved to the required Java constructor position.
      this.settingMode = new ModeSetting(this, "Mode", var3, "Normal", new String[]{"Normal", "NoScreenBobbing"});
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native String recovery$indy$1(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$2(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$5();
}
