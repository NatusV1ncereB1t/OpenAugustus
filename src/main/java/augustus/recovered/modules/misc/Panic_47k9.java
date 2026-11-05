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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.module.Module;
import client.setting.MultiSelectSetting;
import net.C_47UP;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class Panic_47k9 extends Module implements C_47xz {
   public final MultiSelectSetting settingCategoriesToDisable;
   boolean field_43a;
   private static final long a = C_4f.a(1763884919859056318L, -6339314994476040405L, MethodHandles.lookup().lookupClass()).a(206541032123414L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[24];
   private static final String[] f = new String[24];

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
      recovery$indy$1(this, 40, var3, -7098039089498579786L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_489$e45a9973e5(long var1) {
      long var3 = var1 ^ 23939014080442L;
      long var5 = var1 ^ 32602347024051L;
      long var7 = var1 ^ 10188989497872L;
      long var9 = var1 ^ 106700183251497L;
      long var11 = var1 ^ 117583054578123L;
      int[] var13 = recovery$indy$2(4170675628122380040L, var1);
      Panic_47k9 var10000 = this;
      if (var13 == null) {
         if (this.field_43a) {
            Iterator var14 = recovery$indy$3(ClientGlobals.field_48, var11, 4170849031068607368L, var1).iterator();

            label74:
            while (true) {
               boolean var20 = var14.hasNext();

               label72:
               while (true) {
                  if (!var20) {
                     break label74;
                  }

                  Module var15 = (Module)var14.next();
                  int[] var21 = var13;

                  do {
                     if (var21 != null) {
                        return;
                     }

                     if (!recovery$indy$4(var15, var3, 4170420967902250867L, var1)) {
                        continue label74;
                     }

                     C_47UP[] var16 = recovery$indy$5(4170511429285077323L, var1);
                     int var17 = var16.length;
                     int var18 = 0;

                     while (var18 < var17) {
                        C_47UP var19 = var16[var18];
                        int[] var22 = var13;
                        if (var1 > 0L) {
                           if (var13 == null) {
                              var20 = recovery$indy$6(var19, 4172248020209390107L, var1).equals(recovery$indy$7(var15, 4170702664079155514L, var1));
                              if (var13 != null) {
                                 continue label72;
                              }

                              if (var20 && recovery$indy$8(var19, 4170337793449916356L, var1)) {
                                 recovery$indy$9(var15, false, false, var7, 4170780706124910328L, var1);
                              }

                              var18++;
                           }

                           var22 = var13;
                        }

                        if (var22 != null) {
                           break;
                        }
                     }

                     var21 = var13;
                  } while (var1 < 0L);

                  if (var13 != null) {
                     break label74;
                  }
                  break;
               }
            }

            recovery$indy$10(ClientGlobals.field_48, var5, 4172053976601460333L, var1);
         }

         recovery$indy$11(this, var9, false, 4170574074737350280L, var1);
         var10000 = this;
      }

      var10000.field_43a = false;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = true;
   }

   public Panic_47k9(long var1) {
      super("Panic", "Panik", ((a ^ var1) ^ 48992953406317L), new Color(145, 34, 224), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 32379067834011L;
      long var5 = var1 ^ 48992953406317L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = -7290568068895948167L;
      this.settingCategoriesToDisable = new MultiSelectSetting(this, "CategoriesToDisable", var3, C_47UP.values());
      this.field_43a = false;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$2(long var0, long var2);

   private static native CopyOnWriteArrayList recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native C_47UP[] recovery$indy$5(long var0, long var2);

   private static native Category recovery$indy$6(Object var0, long var1, long var3);

   private static native Category recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(Object var0, boolean var1, boolean var2, long var3, long var5, long var7);

   private static native void recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$11(Object var0, long var1, boolean var3, long var4, long var6);

   private static native MethodHandle recovery$constant$12();
}
