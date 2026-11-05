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
import net.C_40T;
import net.C_45n;
import net.C_476x;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47VU;
import net.C_47nb;
import net.C_47oo;
import client.module.Category;
import net.C_47zr;
import net.C_4f;

public class CustomZoom_47Hr extends Module implements C_47zr, C_476x {
   public final NumberSetting settingZoomFactor;
   public final ModeSetting settingAnimationModes;
   public final NumberSetting settingAnimationTime;
   public final BooleanSetting settingFastZoom;
   private final C_47nb field_431;
   private boolean field_43a;
   private static final long a = C_4f.a(5500435622164389916L, 4768076377792015513L, MethodHandles.lookup().lookupClass()).a(104027033954085L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[23];
   private static final String[] f = new String[23];

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

   private static native Method d(long var0, long var2);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 68660175103863L;
      long var3 = var1 ^ 134256419067523L;
      long var10000 = 1401506137055452532L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 1401440516754504036L;
      long var6 = var3;
      ModeSetting var8 = this.settingAnimationModes;
      boolean var9 = var8.method_46$5f9dc63072(var6).equalsIgnoreCase("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_48$c945181dab(long var1, C_47VU var3) {
      label17: {
         int[] var4 = recovery$indy$1(-1816300417795184436L, var1);
         boolean var10000 = recovery$indy$2(field_43, -1816207899587554548L, var1).field_45s.field_45;
         if (var4 == null) {
            if (!var10000) {
               break label17;
            }

            var10000 = this.field_43a;
         }

         if (!var10000) {
         }
      }

      this.field_43a = recovery$indy$3(field_43, -1816207899587554548L, var1).field_45s.field_45;
   }

   @Override
   public void method_49$e5bc8e13c1(char var1, int var2, short var3, C_40T var4) {
      float var13;
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var7 = var5 ^ 128363183184876L;
      long var9 = var5 ^ 80109054136930L;
      int[] var11 = recovery$indy$4(-2913243300722533995L, var5);
      float var12 = (float)recovery$indy$5(this.settingZoomFactor, var7, -2913140362942597554L, var5) - 1.0F;
      if (var11 == null) {
         label38: {
            byte var10000 = (byte) ((recovery$indy$6(this.settingAnimationModes, var9, -2912746518242902651L, var5).equals(recovery$indy$7(31175, 3320739820899354057L ^ var5))) ? 1 : 0);
            if (var3 < 0) {
               if (var10000 != 0) {
                  break label38;
               }

               double var14;
               var10000 = (byte)((var14 = this.field_431.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1));
            }

            label32: {
               if (var10000 < 0) {
                  var13 = 1.0F + (float)(var12 * this.field_431.method_45$fedcb3e4d3());
                  if (var2 < 0) {
                     break label32;
                  }

                  var12 = var13;
                  if (var11 == null) {
                     break label38;
                  }
               }

               var13 = var12 + 1.0F;
            }

            var12 = var13;
         }

         recovery$indy$8(var4, var12, -2912935055496635700L, var5);
      }
   }

   public C_47nb method_47$538018b47e() {
      return this.field_431;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$9(this, 46, var3, -7099362718879328510L, var1);
      recovery$indy$10(this, 19, var3, -7099362718879328510L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomZoom_47Hr(long var1) {
      super("CustomZoom", "EinstellbarerZoom", ((a ^ var1) ^ 90421158395381L), new Color(252, 186, 3), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 28075134700856L;
      long var5 = var1 ^ 38587372429806L;
      long var7 = var1 ^ 15669684625001L;
      long var9 = var1 ^ 90421158395381L;
      // Super arguments moved to the required Java constructor position.
      this.settingZoomFactor = new NumberSetting(this, "ZoomFactor", 4.0, var7, 1.0, 10.0, 2);
      this.settingAnimationModes = new ModeSetting(this, "AnimationModes", var3, "easeOutQuint", C_47nb.method_42$8fc34d0ddc(true));
      NumberSetting var10001 = new NumberSetting(this, "AnimationTime", 200.0, var7, 0.0, 1000.0, 0);
      C_45n var10002 = recovery$indy$11(this);
      long var10003 = -5455536974315294308L;
      C_45n var11 = var10002;
      NumberSetting var12 = var10001;
      this.settingAnimationTime = var12.method_43$9db6d416f4(var11);
      this.settingFastZoom = new BooleanSetting(this, var5, "FastZoom", false);
      this.field_431 = new C_47nb(0.0F, 0.0F, 0.0F, 0.0F);
      this.field_43a = false;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native C_47oo recovery$indy$2(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$3(Object var0, long var1, long var3);

   private static native int[] recovery$indy$4(long var0, long var2);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$7(int var0, long var1);

   private static native void recovery$indy$8(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$11(CustomZoom_47Hr var0);

   private static native MethodHandle recovery$constant$12();
}
