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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.ModeSetting;
import net.C_47Yl;
import client.module.Category;
import net.C_4f;

public class CustomSkin_47HV extends Module {
   public final ModeSetting settingSkinMode;
   public final ModeSetting settingCustomName;
   private static String[] field_40;
   private static final long a = C_4f.a(-7354377339785821973L, -1780725401739900006L, MethodHandles.lookup().lookupClass()).a(273419979733849L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[14];
   private static final String[] f = new String[14];

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

   private static native void a();

   private static native int a(long var0, long var2);

   public static String[] method_42$44c5829186() {
      return field_40;
   }

   private static native Method d(long var0, long var2);

   public static void method_41$05a886777b(String[] var0) {
      field_40 = var0;
   }

   private static boolean method_45$aae029aa0a() {
      return false;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      int[] var3 = recovery$indy$1(-7739210488891129242L, var1);
      EntityPlayerSP var10000 = recovery$indy$2(field_43, -7739120373660336062L, var1);
      if (var3 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$3(field_43, -7739120373660336062L, var1);
      }

      C_47Yl var4 = var10000.method_47$3ebfab9d80();
      if (var3 == null) {
         if (var4 == null) {
            return;
         }

         recovery$indy$4(field_43, -7739120373660336062L, var1).method_47$3ebfab9d80().field_47 = false;
         var4 = recovery$indy$5(field_43, -7739120373660336062L, var1).method_47$3ebfab9d80();
      }

      var4.method_41$da8c82d5d4();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$6(2733359825459639056L, var4);
      EntityPlayerSP var10000 = recovery$indy$7(field_43, 2733414842207465780L, var4);
      if (var6 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$8(field_43, 2733414842207465780L, var4);
      }

      C_47Yl var7 = var10000.method_47$3ebfab9d80();
      if (var6 == null) {
         if (var7 == null) {
            return;
         }

         recovery$indy$9(field_43, 2733414842207465780L, var4).method_47$3ebfab9d80().field_47 = false;
         var7 = recovery$indy$10(field_43, 2733414842207465780L, var4).method_47$3ebfab9d80();
      }

      var7.method_41$da8c82d5d4();
   }

   public CustomSkin_47HV(long var1) {
      super("CustomSkin", "KundenspezifischeHaut", ((a ^ var1) ^ 32266527418547L), new Color(67, 209, 174), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 95574624786558L;
      long var5 = var1 ^ 32266527418547L;
      // Super arguments moved to the required Java constructor position.
      this.settingSkinMode = new ModeSetting(this, "SkinMode", var3, "default", new String[]{"default", "slim"});
      ModeSetting var10001 = new ModeSetting(this, "CustomName", var3, "Zlimuzin", new String[0]);
      C_45n var10002 = recovery$indy$11();
      long var10003 = -6842163266343740713L;
      C_45n var7 = var10002;
      ModeSetting var8 = var10001;
      this.settingCustomName = var8.method_44$d3b0c78647(var7);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$11();

   private static native MethodHandle recovery$constant$12();
}
