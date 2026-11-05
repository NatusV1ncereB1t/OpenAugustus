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
import net.C_476q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Yl;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_4f;

public class Protector_47HE extends Module {
   public BooleanSetting settingTime;
   public final ModeSetting settingNameGeneration;
   private int field_43y;
   private int field_437;
   private int field_43p;
   private int field_438;
   private static int field_47;
   private static final long a = C_4f.a(7851027364040542082L, 4570809718005189084L, MethodHandles.lookup().lookupClass()).a(207821304197550L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[16];
   private static final String[] f = new String[16];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   public int method_49$8abf5c6871() {
      return this.field_438;
   }

   public static void method_49$d00df7729d(int var0) {
      field_47 = var0;
   }

   public int method_45$8abf5c6871() {
      return this.field_437;
   }

   public static int method_43i$8abf5c6871() {
      return field_47;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      int[] var3 = recovery$indy$1(-7739158816079170536L, var1);
      Minecraft var10000 = field_43;
      if (var3 == null) {
         if (recovery$indy$2(field_43, -7739090425214547906L, var1) == null) {
            return;
         }

         var10000 = field_43;
      }

      for (Object recovered$element$3291 : recovery$indy$3(var10000, -7738952630866843730L, var1).method_43$29638970ac()) {
         C_47Yl var5 = (C_47Yl) recovered$element$3291;
         var5.field_47 = false;
         var5.method_41$da8c82d5d4();
         if (var3 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 45060405155791L;
      this.field_43y = recovery$indy$4(C_476q.field_48, -1000, 1000, var6, 2733481787198874011L, var4);
      int[] var10000 = recovery$indy$5(2733378590228219246L, var4);
      this.field_437 = recovery$indy$6(C_476q.field_48, -1000, 1000, var6, 2733481787198874011L, var4);
      int[] var8 = var10000;
      this.field_43p = recovery$indy$7(C_476q.field_48, 10, 60, var6, 2733481787198874011L, var4);
      this.field_438 = recovery$indy$8(C_476q.field_48, 0, 11, var6, 2733481787198874011L, var4);
      Minecraft var11 = field_43;
      if (var8 == null) {
         if (recovery$indy$9(field_43, 2733455261783521608L, var4) == null) {
            return;
         }

         var11 = field_43;
      }

      for (Object recovered$element$4488 : recovery$indy$10(var11, 2733582456164308696L, var4).method_43$29638970ac()) {
         C_47Yl var10 = (C_47Yl) recovered$element$4488;
         var10.field_47 = false;
         var10.method_41$da8c82d5d4();
         if (var8 != null) {
            break;
         }
      }
   }

   public static int method_435$8abf5c6871() {
      int var0 = method_43i$8abf5c6871();
      return var0 == 0 ? 72 : 0;
   }

   public int method_43a$8abf5c6871() {
      return this.field_43p;
   }

   public int method_43L$8abf5c6871() {
      return this.field_43y;
   }

   public Protector_47HE(long var1) {
      super("Protector", "Versicherung", ((a ^ var1) ^ 34683805758785L), Color.yellow, Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 92631212426636L;
      long var5 = var1 ^ 121701929920858L;
      long var7 = var1 ^ 34683805758785L;
      // Super arguments moved to the required Java constructor position.
      this.settingTime = new BooleanSetting(this, var5, "Time", true);
      this.settingNameGeneration = new ModeSetting(this, "NameGeneration", var3, "List", new String[]{"List", "Esound", "Generated"});
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native C_47K6 recovery$indy$3(Object var0, long var1, long var3);

   private static native int recovery$indy$4(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native int[] recovery$indy$5(long var0, long var2);

   private static native int recovery$indy$6(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native int recovery$indy$7(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native int recovery$indy$8(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native C_47K6 recovery$indy$10(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$11();
}
