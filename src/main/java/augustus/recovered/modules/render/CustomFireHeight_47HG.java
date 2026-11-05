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
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;

public class CustomFireHeight_47HG extends Module {
   public final BooleanSetting settingRemoveFire;
   public final NumberSetting settingFireHeight;
   private static final long a = C_4f.a(-8302870260076483115L, -710934385190457345L, MethodHandles.lookup().lookupClass()).a(6545511687826L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[10];
   private static final String[] f = new String[10];

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

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 25447181608841L;
      long var10000 = 1024044223180653575L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 1023955188847698182L;
      BooleanSetting var4 = this.settingRemoveFire;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomFireHeight_47HG(long var1) {
      super("CustomFireHeight", "EnstellbareFeureHöhe", ((a ^ var1) ^ 96254835223080L), new Color(235, 229, 52), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 42535492007475L;
      long var5 = var1 ^ 13158231574964L;
      long var7 = var1 ^ 96254835223080L;
      // Super arguments moved to the required Java constructor position.
      this.settingRemoveFire = new BooleanSetting(this, var3, "RemoveFire", false);
      NumberSetting var10001 = new NumberSetting(this, "FireHeight", -0.3, var5, -0.7, 0.0, 2);
      C_45n var10002 = recovery$indy$1(this);
      long var10003 = -2049002657938241530L;
      C_45n var9 = var10002;
      NumberSetting var10 = var10001;
      this.settingFireHeight = var10.method_43$9db6d416f4(var9);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_45n recovery$indy$1(CustomFireHeight_47HG var0);

   private static native MethodHandle recovery$constant$2();
}
