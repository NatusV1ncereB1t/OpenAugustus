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
import net.C_47MS;
import client.module.Module;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_47vk;
import net.C_4f;

public class Child_47Qk extends Module implements C_47MS {
   public final BooleanSetting settingEditEyeHeight;
   public final BooleanSetting settingRemoveCapes;
   private static boolean field_44;
   private static final long a = C_4f.a(-8004428948666459017L, -3755522623314369055L, MethodHandles.lookup().lookupClass()).a(35092465609749L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[14];
   private static final String[] f = new String[14];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   @Override
   public void method_42$81a716381c(C_47vk var1, long var2) {
      if (recovery$indy$1(this.settingEditEyeHeight, -3664260759790890579L, var2)) {
         recovery$indy$2(var1, 0.85F, -3664707237316735254L, var2);
      }
   }

   private static native Method d(long var0, long var2);

   public static boolean method_48$aae029aa0a() {
      boolean var0 = method_45$aae029aa0a();
      return !var0;
   }

   public static void method_48$f633c984d8(boolean var0) {
      field_44 = var0;
   }

   public static boolean method_45$aae029aa0a() {
      return field_44;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$3(this, 24, 3, var3, -7098201052795954837L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Child_47Qk(long var1) {
      super("Child", "Kind", ((a ^ var1) ^ 14944789702876L), new Color(52, 217, 148), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 137108665103559L;
      long var5 = var1 ^ 14944789702876L;
      // Super arguments moved to the required Java constructor position.
      this.settingEditEyeHeight = new BooleanSetting(this, var3, "EditEyeHeight", true);
      this.settingRemoveCapes = new BooleanSetting(this, var3, "RemoveCapes", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(Object var0, long var1, long var3);

   private static native void recovery$indy$2(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$3(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native MethodHandle recovery$constant$4();
}
