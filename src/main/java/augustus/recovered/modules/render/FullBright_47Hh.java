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
import net.C_477A;
import net.C_47OE;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47mP;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import client.module.Category;
import net.C_4f;

public class FullBright_47Hh extends Module implements C_47mP {
   public final ModeSetting settingMode;
   public final BooleanSetting settingOther;
   private float field_48;
   private static final long a = C_4f.a(8998699118072822924L, -768565615668809154L, MethodHandles.lookup().lookupClass()).a(154223811862367L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[26];
   private static final String[] f = new String[26];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   @Override
   public void method_46$4072749d5d(int var1, int var2, C_47OE var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
      if (!recovery$indy$1(this.settingOther, -4185615526308006347L, var4)) {
         recovery$indy$2(var3, true, -4185971524336167439L, var4);
      }
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private void method_42$da8c82d5d4() {
      C_47oo var22;
      label62: {
         long var1 = a ^ 39135510402141L;
         long var3 = var1 ^ 98088417569876L;
         long var5 = var1 ^ 68758673811455L;
         long var10000 = 2453903785859016832L;
         int[] var7 = AntiStrike_47Qa.method_42$d4d28024c9();
         long var10002 = 2453655916149664187L;
         long var8 = var3;
         FullBright_47Hh var10 = this;
         byte var19 = (byte) ((var10.method_46$0dd78e0064(var8)) ? 1 : 0);
         if (var7 == null) {
            if (var19 != 0) {
               label65: {
                  var10002 = 2453753643098779300L;
                  long var11 = var5;
                  ModeSetting var13 = this.settingMode;
                  byte var20 = (byte) ((var13.method_46$5f9dc63072(var11).equals("Gamma")) ? 1 : 0);
                  if (var7 == null) {
                     if (var20 != 0) {
                        long var10001 = 2454056180783292541L;
                        Minecraft var14 = field_43;
                        var14.field_44r.field_45E = 10.0F;
                        if (var7 == null) {
                           return;
                        }
                     }

                     long var23 = 2454056180783292541L;
                     Minecraft var15 = field_43;
                     var22 = var15.field_44r;
                     if (var7 != null) {
                        break label65;
                     }

                     float var28;
                     var20 = (byte)((var28 = var15.field_44r.field_45E - 1.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1));
                  }

                  if (var20 <= 0) {
                     return;
                  }

                  long var24 = 2454056180783292541L;
                  Minecraft var16 = field_43;
                  var22 = var16.field_44r;
               }

               var22.field_45E = Math.min(this.field_48, 1.0F);
               if (var7 == null) {
                  return;
               }
            }

            long var25 = 2454056180783292541L;
            Minecraft var17 = field_43;
            var22 = var17.field_44r;
            if (var7 != null) {
               break label62;
            }

            float var29;
            var19 = (byte)((var29 = var17.field_44r.field_45E - 1.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1));
         }

         if (var19 <= 0) {
            return;
         }

         long var26 = 2454056180783292541L;
         Minecraft var18 = field_43;
         var22 = var18.field_44r;
      }

      var22.field_45E = Math.min(this.field_48, 1.0F);
   }

   private static native Method d(long var0, long var2);

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 28074184235039L;
      long var3 = var1 ^ 5043728591805L;
      long var10002 = 7948644363742765798L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("NightVision");
   }

   @Override
   public void method_43$d0d1553836(long var1, C_47OE var3) {
      long var4 = var1 ^ 64712385866412L;
      if (!recovery$indy$3(this.settingMode, var4, 8024991920615810039L, var1).equals(recovery$indy$4(6384, 1558163729674124337L ^ var1))) {
         recovery$indy$5(var3, true, 8024659204143218500L, var1);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$6(this, 22, var3, -7099491141526367495L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$7(field_43, -7737287241720654100L, var1).field_45E = Math.min(this.field_48, 1.0F);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 7668165369880L;
      this.field_48 = recovery$indy$8(field_43, 2731916307898738586L, var4).field_45E;
      if (recovery$indy$9(this.settingMode, var6, 2732070342417656131L, var4).equals(recovery$indy$10(15591, 4368261749395247766L ^ var4))) {
         recovery$indy$11(field_43, 2731916307898738586L, var4).field_45E = 10.0F;
      }
   }

   public FullBright_47Hh(long var1) {
      super("FullBright", "VolleHelligkeit", ((a ^ var1) ^ 60982876272555L), new Color(188, 213, 25), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 87427042557581L;
      long var5 = var1 ^ 137175882893158L;
      long var7 = var1 ^ 77318757002160L;
      long var9 = var1 ^ 60982876272555L;
      // Super arguments moved to the required Java constructor position.
      ModeSetting var10001 = new ModeSetting(this, "Mode", var5, "NightVision", new String[]{"NightVision", "Gamma"});
      C_477A var10002 = recovery$indy$12(this);
      long var10003 = 9085237772768932374L;
      C_477A var11 = var10002;
      ModeSetting var12 = var10001;
      this.settingMode = var12.method_42$977b7ac128(var11);
      BooleanSetting var18 = new BooleanSetting(this, var7, "Other", true);
      C_45n var19 = recovery$indy$13(this);
      long var10004 = 9085050353677004759L;
      C_45n var13 = var19;
      long var14 = var3;
      BooleanSetting var16 = var18;
      this.settingOther = (BooleanSetting)var16.method_43$780fd62a21(var14, var13);
      this.field_48 = 1.0F;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(Object var0, long var1, long var3);

   private static native void recovery$indy$2(Object var0, boolean var1, long var2, long var4);

   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$4(int var0, long var1);

   private static native void recovery$indy$5(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);

   private static native C_47oo recovery$indy$7(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$8(Object var0, long var1, long var3);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$10(int var0, long var1);

   private static native C_47oo recovery$indy$11(Object var0, long var1, long var3);

   private static native C_477A recovery$indy$12(FullBright_47Hh var0);

   private static native C_45n recovery$indy$13(FullBright_47Hh var0);

   private static native MethodHandle recovery$constant$14();
}
