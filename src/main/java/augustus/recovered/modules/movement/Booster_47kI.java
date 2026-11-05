package augustus.recovered.modules.movement;

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
import net.C_471S;
import net.C_476v;
import client.module.Module;
import client.setting.NumberSetting;
import net.C_47TY;
import net.C_47cu;
import client.module.Category;
import net.C_4f;

public class Booster_47kI extends Module implements C_471S {
   public final NumberSetting settingBoostTicks;
   public final NumberSetting settingDelay;
   public final C_47TY settingKeyToToggleBoost;
   private final C_47cu field_46;
   private static final long a = C_4f.a(1146752777307830372L, 588073581792399956L, MethodHandles.lookup().lookupClass()).a(27873797322417L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[24];
   private static final String[] f = new String[24];

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

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_45$6c53b83f97(C_476v var1, long var2) {
   }

   @Override
   public void method_47$4ff7ee0874(char var1, C_476v var2, int var3, short var4) {
      long var5;
      long var7;
      C_47cu var19;
      label30: {
         var5 = (long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48;
         var7 = var5 ^ 128606783361105L;
         long var9 = var5 ^ 70751344748413L;
         long var11 = var5 ^ 83981927281961L;
         int var13 = (int)((var5 ^ 113424111568009L) >>> 32);
         long var14 = (var5 ^ 113424111568009L) << 32 >>> 32;
         long var16 = var5 ^ 50082418972228L;
         boolean var18 = recovery$indy$1(3099450829567656189L, var5);
         boolean var10000 = recovery$indy$3(recovery$indy$2(this.settingKeyToToggleBoost, var13, var14, 3099524661750119371L, var5), var16, 3099195754128821002L, var5);
         if (!var18) {
            if (!var10000) {
               return;
            }

            var19 = this.field_46;
            if (var18) {
               break label30;
            }

            var10000 = recovery$indy$5(this.field_46, recovery$indy$4(this.settingDelay, var9, 3099321349176818557L, var5), var11, 3099778388626988471L, var5);
         }

         if (!var10000) {
            return;
         }

         recovery$indy$7(var2, (int)Math.max(0.0, recovery$indy$6(this.settingBoostTicks, var9, 3099321349176818557L, var5)), 3099064461100000477L, var5);
         var19 = this.field_46;
      }

      recovery$indy$8(var19, 3099111738735476757L, var5);
      recovery$indy$10(var7, recovery$indy$9(18013, 9193131988220573795L ^ var5), 3099250852257088381L, var5);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$11(this, 41, var3, -7099416809562247315L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Booster_47kI(long var1) {
      super("Booster", "Beschläuniger", ((a ^ var1) ^ 43069907547395L), new Color(214, 84, 186), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 38759766525412L;
      long var5 = var1 ^ 135614908389023L;
      long var7 = var1 ^ 43069907547395L;
      // Super arguments moved to the required Java constructor position.
      this.settingBoostTicks = new NumberSetting(this, "BoostTicks", 2.0, var5, 0.0, 20.0, 0);
      this.settingDelay = new NumberSetting(this, "Delay", 2000.0, var5, 0.0, 10000.0, 0);
      this.settingKeyToToggleBoost = new C_47TY(this, var3, "Key to toggle boost");
      this.field_46 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native int recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$3(int var0, long var1, long var3, long var5);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$5(Object var0, double var1, long var3, long var5, long var7);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4);

   private static native void recovery$indy$8(Object var0, long var1, long var3);

   private static native String recovery$indy$9(int var0, long var1);

   private static native void recovery$indy$10(long var0, Object var2, long var3, long var5);

   private static native void recovery$indy$11(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$12();
}
