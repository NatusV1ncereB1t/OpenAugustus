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
import net.C_45V;
import net.C_475c;
import net.C_47Bq;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47UH;
import net.minecraft.client.Minecraft;
import net.C_47rf;
import client.module.Category;
import net.C_4f;

public class TntBlock_47C8 extends Module implements C_47UH {
   private static final long a = C_4f.a(-2782557408003055924L, -5148297566299352408L, MethodHandles.lookup().lookupClass()).a(210550906793176L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[17];
   private static final String[] f = new String[17];

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
   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 137267769824799L;
      long var10000 = -6881460705218092820L;
      int[] var4 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -6879476700054431294L;
      Minecraft var8 = field_43;

      Entity var16;
      for (Object recoveredEntity : var8.field_44Q.field_44Q) {
         Entity var6 = (Entity) recoveredEntity;
         label52: {
            byte var14 = (byte) ((var6 instanceof C_47Bq) ? 1 : 0);
            if (var4 == null) {
               if (var14 == 0) {
                  break label52;
               }

               long var10002 = -6879345621477922881L;
               Minecraft var9 = field_43;
               double var20;
               var14 = (byte)((var20 = var6.method_44$ee256e8a75(var9.field_42P) - 8.2) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1));
            }

            label47:
            if (var14 < 0) {
               label60: {
                  var10001 = -6879345621477922881L;
                  Minecraft var10 = field_43;
                  C_47rf var15 = var10.field_42P.method_41$ac4db64966();
                  if (var4 == null) {
                     if (var15 == null) {
                        break label47;
                     }

                     var10001 = -6879345621477922881L;
                     Minecraft var11 = field_43;
                     var16 = var11.field_42P;
                     if (var4 != null) {
                        break label60;
                     }

                     var15 = var11.field_42P.method_41$ac4db64966();
                  }

                  if (!(var15.method_48$dbd570a038() instanceof C_45V)) {
                     break label47;
                  }

                  var16 = var6;
               }

               C_47Bq var7 = (C_47Bq)var16;
               if (var7.field_40 < 4) {
                  long var19 = -6879306808437965226L;
                  boolean var12 = true;
                  C_475c var13 = var1;
                  var13.method_45$f633c984d8(var12);
               }
            }
         }

         if (var4 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 7, var3, -7098232757072773467L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public TntBlock_47C8(long var1) {
      super("TntBlock", "TntBlockierung", ((a ^ var1) ^ 104839861977295L), new Color(252, 147, 91), Category.COMBAT);
      var1 = a ^ var1;
      long var3 = var1 ^ 104839861977295L;
      // Pure super-constructor arguments are evaluated in the first statement above.
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$2();
}
