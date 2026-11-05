package augustus.recovered.modules.world;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_46I;
import net.C_476q;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import client.module.Module;
import client.setting.Setting;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_484;
import net.C_4f;

public class SmartRaytrace_47TG extends Module {
   private static Setting[] field_44;
   private static final long a = C_4f.a(5910308039065719265L, -4275970530384161553L, MethodHandles.lookup().lookupClass()).a(49369947047081L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[22];
   private static final String[] f = new String[22];

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

   private static native Method d(long var0, long var2);

   public static Setting[] method_48$19d51fe81e() {
      return field_44;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void method_49$c94409dc99(int var1, short var2, int var3) {
      boolean var17;
      boolean var19;
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 54482449828559L;
      long var8 = var4 ^ 93126196481590L;
      Setting[] var10 = recovery$indy$1(-510997483815471287L, var4);
      Minecraft var10000 = field_43;
      if (var10 == null) {
         if (recovery$indy$2(field_43, -511115613667980086L, var4) == null) {
            return;
         }

         var10000 = field_43;
      }

      Setting[] var10001 = var10;
      if (var3 > 0) {
         if (var10 == null) {
            if (recovery$indy$3(var10000, -510766218797004328L, var4) == null) {
               return;
            }

            var10000 = field_43;
         }

         var10001 = var10;
      }

      if (var10001 == null) {
         if (recovery$indy$5(var8, recovery$indy$4(var10000, -511115613667980086L, var4).method_48$ac4db64966(), -511036524885060509L, var4)) {
            return;
         }

         var10000 = field_43;
      }

      label123: {
         C_47Ij var15 = recovery$indy$6(var10000, -510893453964609046L, var4);
         if (var10 == null) {
            if (var15 == null) {
               break label123;
            }

            var15 = recovery$indy$7(field_43, -510893453964609046L, var4);
         }

         if (var15.field_49 == C_47Az.ENTITY) {
            return;
         }
      }

      boolean var11 = false;
      ArrayList var12 = new ArrayList();
      C_47Ij var13 = null;
      float var14 = 0.05F;

      label114:
      while (true) {
         if (var14 < 1.0F) {
            recovery$indy$8(field_43, -510766218797004328L, var4).method_49$0628eaf977(var14, false);
         } else if (var3 > 0) {
            var17 = var11;
            break;
         }

         do {
            Setting[] var16 = var10;
            if (var3 > 0) {
               if (var10 == null) {
                  var17 = recovery$indy$10(var8, recovery$indy$9(field_43, -511115613667980086L, var4).method_48$ac4db64966(), -511036524885060509L, var4);
                  if (var10 != null) {
                     break label114;
                  }

                  if (var17) {
                     C_47Ij var18 = var13;
                     if (var10 == null) {
                        if (var13 == null) {
                           var13 = recovery$indy$11(field_43, -510893453964609046L, var4);
                        }

                        var18 = recovery$indy$12(field_43, -510893453964609046L, var4);
                     }

                     if (var18.field_40 != C_484.UP) {
                        var11 = true;
                        var12.add(recovery$indy$13(field_43, -510893453964609046L, var4));
                     }
                  }

                  var14 += 0.05F;
               }

               var16 = var10;
            }

            if (var16 == null) {
               continue label114;
            }
         } while (var3 <= 0);

         var17 = var11;
         break;
      }

      if (var17) {
         recovery$indy$15(
            field_43, (C_47Ij)var12.get(recovery$indy$14(C_476q.field_48, 0, var12.size() - 1, var6, -508917006235915194L, var4)), -510893453964609046L, var4
         );
      }

      label94: {
         if (var13 != null) {
            var19 = var11;
            if (var10 != null) {
               break label94;
            }

            if (!var11) {
               recovery$indy$16(field_43, var13, -510893453964609046L, var4);
            }
         }

         var19 = var11;
      }

      if (!var19 && var13 == null) {
         recovery$indy$17(field_43, -510766218797004328L, var4).method_49$0628eaf977(1.0F, false);
      }
   }

   public static void method_45$5994d1a418(Setting[] var0) {
      field_44 = var0;
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

   public SmartRaytrace_47TG(long var1) {
      super("SmartRaytrace", "SchlauerRaytrace", ((a ^ var1) ^ 80131556709189L), Color.black, Category.WORLD);
      var1 = a ^ var1;
      long var3 = var1 ^ 80131556709189L;
      // Super arguments moved to the required Java constructor position.
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native Setting[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native C_46I recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(long var0, Object var2, long var3, long var5);

   private static native C_47Ij recovery$indy$6(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$7(Object var0, long var1, long var3);

   private static native C_46I recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(long var0, Object var2, long var3, long var5);

   private static native C_47Ij recovery$indy$11(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$12(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$13(Object var0, long var1, long var3);

   private static native int recovery$indy$14(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$15(Object var0, C_47Ij var1, long var2, long var4);

   private static native void recovery$indy$16(Object var0, C_47Ij var1, long var2, long var4);

   private static native C_46I recovery$indy$17(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$18();
}
