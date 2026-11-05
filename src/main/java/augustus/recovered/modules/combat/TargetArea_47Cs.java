package augustus.recovered.modules.combat;

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
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;

public class TargetArea_47Cs extends Module {
   private final C_47TU settingX;
   private final C_47TU settingY;
   private final C_47TU settingZ;
   private final BooleanSetting settingReverse;
   private static final long a = C_4f.a(-1575858078443113143L, 6535150339459089696L, MethodHandles.lookup().lookupClass()).a(66393221401589L);
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

   public boolean method_44$8a15fc4c7b(Entity var1, long var2) {
      int[] var8;
      int var10000;
      label96: {
         label99: {
            var2 = a ^ var2;
            long var4 = var2 ^ 71631578682805L;
            long var6 = var2 ^ 108391673509938L;
            var8 = recovery$indy$1(-6874028760685619512L, var2);
            double var12;
            var10000 = (var12 = var1.field_48Q - recovery$indy$2(this.settingX, var6, -6873956786755482566L, var2)) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
            if (var8 == null) {
               if (var10000 < 0) {
                  break label99;
               }

               double var13;
               var10000 = (var13 = var1.field_48Q - recovery$indy$3(this.settingX, var4, -6874132876255455012L, var2)) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
            }

            int[] var10001 = var8;
            if (var2 >= 0L) {
               if (var8 == null) {
                  if (var10000 > 0) {
                     break label99;
                  }

                  double var14;
                  var10000 = (var14 = var1.field_48j - recovery$indy$4(this.settingY, var6, -6873956786755482566L, var2)) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
               }

               var10001 = var8;
            }

            if (var2 >= 0L) {
               if (var10001 == null) {
                  if (var10000 < 0) {
                     break label99;
                  }

                  double var15;
                  var10000 = (var15 = var1.field_48j - recovery$indy$5(this.settingY, var4, -6874132876255455012L, var2)) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
               }

               var10001 = var8;
            }

            if (var2 > 0L) {
               if (var10001 == null) {
                  if (var10000 > 0) {
                     break label99;
                  }

                  double var16;
                  var10000 = (var16 = var1.field_42o - recovery$indy$6(this.settingZ, var6, -6873956786755482566L, var2)) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
               }

               var10001 = var8;
            }

            if (var2 >= 0L) {
               if (var10001 == null) {
                  if (var10000 < 0) {
                     break label99;
                  }

                  double var17;
                  var10000 = (var17 = var1.field_42o - recovery$indy$7(this.settingZ, var4, -6874132876255455012L, var2)) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
               }

               var10001 = var8;
            }

            if (var10001 != null) {
               break label96;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label96;
            }
         }

         var10000 = 0;
      }

      int var9 = var10000;
      byte var11 = (byte) ((recovery$indy$8(this.settingReverse, -6874079416091134151L, var2)) ? 1 : 0);
      if (var8 == null) {
         var11 = (byte)(var11 != var9 ? 1 : 0);
      }

      return var11 != 0;
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

   public TargetArea_47Cs(char var1, int var2, int var3) {
      super("TargetArea", "GegnerBereich", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 22807604637031L), Color.red, Category.COMBAT);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 106599559096297L;
      long var8 = var4 ^ 111715531026812L;
      long var10 = var4 ^ 22807604637031L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingX = new C_47TU(var6, this, "x", -1000.0, 1000.0, -1000.0, 1000.0, 0);
      this.settingY = new C_47TU(var6, this, "y", 0.0, 255.0, 0.0, 255.0, 0);
      this.settingZ = new C_47TU(var6, this, "z", -1000.0, 1000.0, -1000.0, 1000.0, 0);
      this.settingReverse = new BooleanSetting(this, var8, "Reverse", false);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$9();
}
