package augustus.recovered.modules.legit;

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
import net.C_474k;
import net.C_477z;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47oO;
import client.ClientGlobals;
import net.C_47si;
import net.C_47sk;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class Range_47CT extends Module implements C_47oO, C_47xz, C_47si {
   private final ModeSetting settingRangeMode;
   private final NumberSetting settingRangeInternal;
   private final C_47TU settingBaseRange;
   private final NumberSetting settingChanceOfExtendedRange;
   private final BooleanSetting settingOnlyWhileSprinting;
   public final BooleanSetting settingThroughWalls;
   public final NumberSetting settingBuildRange;
   private double field_430;
   private boolean field_43a;
   private EntityLivingBase field_47;
   private final C_47cu field_44;
   private final C_474k field_41;
   private static boolean field_40;
   private static final long a = C_4f.a(-7401185546236641035L, 1905836125469794599L, MethodHandles.lookup().lookupClass()).a(104681495392473L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[41];
   private static final String[] g = new String[41];

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   public double method_46$fedcb3e4d3() {
      return this.field_430;
   }

   private static native int a(long var0, long var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
      if (recovery$indy$1(var1, 8137171416792164680L, var2) instanceof EntityLivingBase) {
         this.field_47 = (EntityLivingBase)recovery$indy$2(var1, 8137171416792164680L, var2);
         recovery$indy$3(this.field_44, 8137235643933364248L, var2);
      }
   }

   public static boolean method_48$aae029aa0a() {
      boolean var0 = method_45$aae029aa0a();
      return !var0;
   }

   public static void method_48$f633c984d8(boolean var0) {
      field_40 = var0;
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_47 = null;
   }

   public static boolean method_45$aae029aa0a() {
      return field_40;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$4(this, 40, var3, -7099018633475610818L, var1);
      recovery$indy$5(this, 1, var3, -7099018633475610818L, var1);
      recovery$indy$6(this, 17, var3, -7099018633475610818L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      double var25;
      long var4;
      long var6;
      long var10;
      long var12;
      long var14;
      byte var20;
      Range_47CT var22;
      byte var10001;
      label76: {
         label79: {
            var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
            var6 = var4 ^ 127739024042857L;
            long var8 = var4 ^ 72498010691029L;
            var10 = var4 ^ 96342271166190L;
            var12 = var4 ^ 88148290019972L;
            var14 = var4 ^ 113186446332478L;
            long var16 = var4 ^ 99593642957744L;
            long var18 = var4 ^ 97834970749362L;
            var20 = (byte) ((recovery$indy$7(2180534455796403436L, var4)) ? 1 : 0);
            recovery$indy$8(this, var8, "" + this.field_430, 2183341751115541517L, var4);
            boolean var10000 = recovery$indy$9(this.settingRangeMode, var16, 2183806209554789593L, var4).equals(recovery$indy$10(13124, 5290814692481547795L ^ var4));
            if (var20 == 0) {
               if (var10000) {
                  this.field_430 = recovery$indy$11(this.settingRangeInternal, var14, 2180421497746595764L, var4);
                  return;
               }

               var22 = this;
               var10001 = var20;
               if (var1 <= 0) {
                  break label76;
               }

               if (var20 != 0) {
                  break label79;
               }

               var10000 = recovery$indy$12(this.field_44, 3000L, var18, 2183549830775052927L, var4);
            }

            if (var10000) {
               this.field_47 = null;
            }

            var22 = this;
         }

         var10001 = var20;
      }

      if (var10001 == 0) {
         if (var22.field_47 == null) {
            return;
         }

         var22 = this;
      }

      label64: {
         Range_47CT var24 = this;
         if (var20 == 0) {
            if (this.field_43a) {
               var25 = recovery$indy$13(this.settingBaseRange, var6, 2183247992980001417L, var4);
               break label64;
            }

            var24 = this;
         }

         var25 = recovery$indy$14(var24.settingBaseRange, var10, 2180488066374039238L, var4);
      }

      var22.field_430 = var25;
      int var23 = this.field_47.field_432;
      var10001 = 9;
      byte var10002 = var20;
      if (var1 > 0) {
         if (var20 == 0) {
            if (this.field_47.field_432 != 9) {
               return;
            }

            var23 = (int)recovery$indy$15(this.settingChanceOfExtendedRange, var14, 2180421497746595764L, var4);
            var10001 = 0;
         }

         var10002 = 100;
      }

      int var21 = C_47sk.method_49$cabccf1c64(var23, var10001, var10002);
      this.field_43a = recovery$indy$16(this.field_41, var21, var12, 2183639002091514728L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_47 = null;
   }

   private boolean method_44C$aae029aa0a() {
      long var1 = a ^ 76200403297444L;
      long var3 = var1 ^ 56546632110175L;
      long var10002 = 6170241366431399734L;
      long var5 = var3;
      ModeSetting var7 = this.settingRangeMode;
      return var7.method_46$5f9dc63072(var5).equals("Dual");
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_430 = 3.0;
      this.field_43a = false;
   }

   private boolean method_44K$aae029aa0a() {
      long var1 = a ^ 109782845451527L;
      long var3 = var1 ^ 24158378564092L;
      long var10002 = 6629931153588057749L;
      long var5 = var3;
      ModeSetting var7 = this.settingRangeMode;
      return var7.method_46$5f9dc63072(var5).equals("Dual");
   }

   private boolean method_441$aae029aa0a() {
      long var1 = a ^ 20885925099067L;
      long var3 = var1 ^ 110908440740544L;
      long var10002 = 5133626833619479977L;
      long var5 = var3;
      ModeSetting var7 = this.settingRangeMode;
      return var7.method_46$5f9dc63072(var5).equals("Default");
   }

   public boolean method_44y$5805b0149c(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 72444092305596L;
      boolean var8 = recovery$indy$17(6839687574126215465L, var4);
      boolean var10000 = recovery$indy$18(ClientGlobals.field_48.field_41L, var6, 6839415595061482073L, var4);
      if (var8) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$19(ClientGlobals.field_48.field_41L.settingOnlyWhileSprinting, 6838405165625027554L, var4);
      }

      if (!var8) {
         return var10000;
      }

      if (!var10000) {
         return true;
      }

      var10000 = recovery$indy$20(field_43, 6837738289485341840L, var4).method_488$aae029aa0a();
      return !var8 ? var10000 : var10000;
   }

   public Range_47CT(long var1) {
      super("Range", "Distanz", ((a ^ var1) ^ 13181298781992L), new Color(65, 140, 35), Category.LEGIT);
      var1 = a ^ var1;
      long var10001 = var1 ^ 82316146372751L;
      int var3 = (int)((var1 ^ 82316146372751L) >>> 32);
      int var4 = (int)((var1 ^ 82316146372751L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 70682608754661L;
      long var8 = var1 ^ 113940674244219L;
      long var10 = var1 ^ 41458597603556L;
      long var12 = var1 ^ 135074591241011L;
      long var14 = var1 ^ 96214554725556L;
      long var16 = var1 ^ 13181298781992L;
      // Super arguments moved to the required Java constructor position.
      this.settingRangeMode = new ModeSetting(this, "RangeMode", var6, "Default", new String[]{"Default", "Dual"});
      NumberSetting var32 = new NumberSetting(this, "RangeInternal", 3.0, var14, 3.0, 4.5, 2);
      short var10005 = (short)var5;
      long var10006 = -6443055703503370286L;
      short var18 = var10005;
      int var19 = var4;
      String var20 = "Range";
      int var21 = var3;
      NumberSetting var22 = var32;
      NumberSetting var33 = var22.method_47$4b927564ab(var21, var20, var19, var18);
      C_45n var10002 = recovery$indy$21(this);
      long var10003 = -6441473129917152582L;
      C_45n var23 = var10002;
      NumberSetting var24 = var33;
      this.settingRangeInternal = var24.method_43$9db6d416f4(var23);
      C_47TU var34 = new C_47TU(this, "BaseRange", "ExtendedRange", var10, 3.0, 3.7, 3.0, 6.0, 2);
      var10002 = recovery$indy$22(this);
      long var10004 = -6442430212184782548L;
      long var25 = var8;
      C_45n var27 = var10002;
      C_47TU var28 = var34;
      this.settingBaseRange = var28.method_49$99c1850eef(var27, var25);
      NumberSetting var35 = new NumberSetting(this, "Chance of Extended Range", 50.0, var14, 0.0, 100.0, 0);
      var10002 = recovery$indy$23(this);
      var10003 = -6441473129917152582L;
      C_45n var29 = var10002;
      NumberSetting var30 = var35;
      this.settingChanceOfExtendedRange = var30.method_43$9db6d416f4(var29);
      this.settingOnlyWhileSprinting = new BooleanSetting(this, var12, "OnlyWhileSprinting", false);
      this.settingThroughWalls = new BooleanSetting(this, var12, "ThroughWalls", false);
      this.settingBuildRange = new NumberSetting(this, "BuildRange", 4.5, var14, 4.5, 6.0, 2);
      this.field_430 = 3.0;
      this.field_43a = false;
      this.field_47 = null;
      this.field_44 = new C_47cu();
      this.field_41 = new C_474k(100, 0.0);
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native Entity recovery$indy$1(Object var0, long var1, long var3);

   private static native Entity recovery$indy$2(Object var0, long var1, long var3);

   private static native void recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$7(long var0, long var2);

   private static native void recovery$indy$8(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$10(int var0, long var1);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3, long var5, long var7);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$17(long var0, long var2);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$21(Range_47CT var0);

   private static native C_45n recovery$indy$22(Range_47CT var0);

   private static native C_45n recovery$indy$23(Range_47CT var0);

   private static native MethodHandle recovery$constant$24();
}
