package augustus.recovered.modules.player;

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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_47Mt;
import client.module.Module;
import client.module.ModuleManager;
import client.setting.ModeSetting;
import client.module.Category;
import net.C_47xZ;
import net.C_4f;

public class NoRotationSet_47Q9 extends Module {
   public final ModeSetting settingMode;
   private static final long a = C_4f.a(5814162632843308093L, -5036082354490551282L, MethodHandles.lookup().lookupClass()).a(162407157551363L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[14];
   private static final String[] f = new String[14];

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

   public static boolean method_47$bd6f069ca0(C_47xZ var0, long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 112835888294338L;
      long var5 = var1 ^ 1251883410025L;
      boolean var7 = recovery$indy$1(2855251114796098495L, var1);
      int var10000 = ((int) (recovery$indy$4(
            recovery$indy$3(recovery$indy$2(2855159851357943261L, var1), 2855092013547504464L, var1).field_46s.settingMode, var5, 2854815773952960035L, var1
         )
         .equalsIgnoreCase(recovery$indy$5(447, 1329674965351548605L ^ var1)) ? 1 : 0));
      if (!var7) {
         if ((var10000) != 0) {
            var10000 = ((int) (recovery$indy$8(
               recovery$indy$7(recovery$indy$6(2855159851357943261L, var1), 2855092013547504464L, var1).field_46s, var3, 2854743301920384250L, var1
            ) ? 1 : 0));
            if (var7) {
               return (var10000 != 0);
            }

            if ((var10000) != 0) {
               Set var8 = var0.method_46$9aa7af2ac9();
               double var11;
               var10000 = (var11 = var0.method_40$fedcb3e4d3() - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
               boolean var10001 = var7;
               if (var1 > 0L) {
                  if (!var7) {
                     if ((var10000) != 0) {
                        return false;
                     }

                     double var12;
                     var10000 = (var12 = var0.method_48$fedcb3e4d3() - 0.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                  }

                  var10001 = var7;
               }

               if (var1 >= 0L) {
                  if (!var10001) {
                     if ((var10000) != 0) {
                        return false;
                     }

                     double var13;
                     var10000 = (var13 = var0.method_46$fedcb3e4d3() - 0.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                  }

                  var10001 = var7;
               }

               if (var1 >= 0L) {
                  if (!var10001) {
                     if ((var10000) != 0) {
                        return false;
                     }

                     float var14;
                     var10000 = (var14 = var0.method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
                  }

                  var10001 = var7;
               }

               if (var1 > 0L) {
                  if (!var10001) {
                     if ((var10000) != 0) {
                        return false;
                     }

                     float var15;
                     var10000 = (var15 = var0.method_41$bc607678b6() - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                  }

                  var10001 = var7;
               }

               if (var1 > 0L) {
                  if (!var10001) {
                     if ((var10000) != 0) {
                        return false;
                     }

                     var10000 = (int) ((var8.contains(C_47Mt.X)) ? 1 : 0);
                  }

                  var10001 = var7;
               }

               if (var1 > 0L) {
                  if (!var10001) {
                     if (!(var10000 != 0)) {
                        return false;
                     }

                     var10000 = (int) ((var8.contains(C_47Mt.Y)) ? 1 : 0);
                  }

                  var10001 = var7;
               }

               if (var1 > 0L) {
                  if (!var10001) {
                     if (!(var10000 != 0)) {
                        return false;
                     }

                     var10000 = (int) ((var8.contains(C_47Mt.Z)) ? 1 : 0);
                  }

                  var10001 = var7;
               }

               if (var1 >= 0L) {
                  if (!var10001) {
                     if (!(var10000 != 0)) {
                        return false;
                     }

                     var10000 = (int) ((var8.contains(C_47Mt.Y_ROT)) ? 1 : 0);
                  }

                  var10001 = var7;
               }

               if (var1 > 0L) {
                  if (!var10001) {
                     if (!(var10000 != 0)) {
                        return false;
                     }

                     var10000 = (int) ((var8.contains(C_47Mt.X_ROT)) ? 1 : 0);
                  }

                  var10001 = var7;
               }

               if (var10001) {
                  return var10000 != 0;
               }

               if ((var10000) != 0) {
                  return true;
               }

               return false;
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
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

   public NoRotationSet_47Q9(long var1) {
      super("NoRotationSet", "KeineRotationssetzung", ((a ^ var1) ^ 48160516135650L), new Color(26, 108, 135), Category.PLAYER);
      var1 = a ^ var1;
      long var3 = var1 ^ 106073597684271L;
      long var5 = var1 ^ 48160516135650L;
      // Super arguments moved to the required Java constructor position.
      this.settingMode = new ModeSetting(this, "Mode", var3, "Default", new String[]{"Default", "Test"});
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native Client recovery$indy$2(long var0, long var2);

   private static native ModuleManager recovery$indy$3(Object var0, long var1, long var3);

   private static native String recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$5(int var0, long var1);

   private static native Client recovery$indy$6(long var0, long var2);

   private static native ModuleManager recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native MethodHandle recovery$constant$9();
}
