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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_45Y;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47Tf;
import client.setting.Setting;
import net.C_47rf;
import client.module.Category;
import net.C_4f;

public class NoMiningTrace_47Hl extends Module {
   public final BooleanSetting settingAlwaysAtRightClicking;
   public final BooleanSetting settingAlwaysAfterBlockBreakStarted;
   public final BooleanSetting settingOnlyPickaxesWhenLeftclicking;
   public final C_47Tf settingExcludedWeapons;
   private static final long a = C_4f.a(-5906179664599808092L, 2842594240109935480L, MethodHandles.lookup().lookupClass()).a(184018590769096L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[23];
   private static final String[] f = new String[23];

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

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 71692522612016L;
      long var10001 = var1 ^ 40615990012938L;
      int var5 = (int)((var1 ^ 40615990012938L) >>> 48);
      int var6 = (int)((var1 ^ 40615990012938L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      Setting[] var11;
      Setting[] var8 = recovery$indy$1(-1482831506552974753L, var1);
      boolean var10000 = recovery$indy$2(this, var3, -1483243153689559475L, var1);
      if (var8 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$3(this.settingOnlyPickaxesWhenLeftclicking, -1482987430437693306L, var1);
      }

      label82: {
         label81:
         if (var8 == null) {
            if (var10000) {
               C_47rf var10 = recovery$indy$4(field_43, -1482947837424847480L, var1).method_48$ac4db64966();
               if (var8 == null) {
                  if (var10 == null) {
                     return false;
                  }

                  var10 = recovery$indy$5(field_43, -1482947837424847480L, var1).method_48$ac4db64966();
               }

               var10000 = var10.method_48$dbd570a038() instanceof C_45Y;
               var11 = var8;
               if (var1 <= 0L) {
                  break label82;
               }

               if (var8 != null) {
                  break label81;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$7(
               this.settingExcludedWeapons,
               (short)var5,
               var6,
               (short)var7,
               recovery$indy$6(field_43, -1482947837424847480L, var1).method_48$ac4db64966(),
               -1483330173450782930L,
               var1
            );
         }

         var11 = var8;
      }

      if (var11 != null) {
         return var10000;
      }

      if (!var10000) {
         return true;
      }

      var10000 = recovery$indy$8(field_43, -1483192624682211300L, var1).field_42;
      Setting[] var12 = var8;
      if (var1 >= 0L) {
         if (var8 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = recovery$indy$9(this.settingAlwaysAfterBlockBreakStarted, -1482987430437693306L, var1);
         }

         var12 = var8;
      }

      return var12 != null ? var10000 : var10000;
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

   public NoMiningTrace_47Hl(long var1) {
      super("NoMiningTrace", "KeineBergbauspuren", ((a ^ var1) ^ 130889996563840L), new Color(66, 135, 245), Category.WORLD);
      var1 = a ^ var1;
      long var3 = var1 ^ 3557705802665L;
      long var5 = var1 ^ 6801887668635L;
      long var7 = var1 ^ 130889996563840L;
      long var9 = var1 ^ 53094001686187L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingAlwaysAtRightClicking = new BooleanSetting(this, var5, "AlwaysAtRightClicking", true);
      this.settingAlwaysAfterBlockBreakStarted = new BooleanSetting(this, var5, "AlwaysAfterBlockBreakStarted", true);
      this.settingOnlyPickaxesWhenLeftclicking = new BooleanSetting(this, var5, "OnlyPickaxes when leftclicking", false);
      this.settingExcludedWeapons = new C_47Tf(this, var9, "Excluded weapons");
      long var10004 = -270757439582198260L;
      long var11 = var3;
      boolean var13 = false;
      String var14 = "Rest";
      C_47Tf var15 = this.settingExcludedWeapons;
      var15.method_48$1c748620d3(var14, var13, var11);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native Setting[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, short var1, int var2, short var3, Object var4, long var5, long var7);

   private static native C_40g recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$10();
}
