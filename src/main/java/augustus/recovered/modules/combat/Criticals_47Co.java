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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_47G0;
import net.C_47G5;
import net.C_47GE;
import net.C_47GI;
import net.C_47GZ;
import net.C_47Gq;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47Th;
import client.module.Category;
import net.C_4f;

public class Criticals_47Co extends Module {
   public final C_47Th settingMode;
   public final BooleanSetting settingOnlyWhileJumpKeyPressed;
   public final BooleanSetting settingOnlyWhileKillAuraTarget;
   public final BooleanSetting settingCriticalsInAir;
   public final BooleanSetting settingCriticalsOnGround;
   private static int field_47;
   private static final long a = C_4f.a(488233447868068947L, -8819830351317404902L, MethodHandles.lookup().lookupClass()).a(68954940608098L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[28];
   private static final String[] f = new String[28];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 14057074247765L;
      long var3 = var1 ^ 1371531762529L;
      long var10000 = 2203176053224610518L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = 2203303583029589429L;
      long var6 = var3;
      C_47Th var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Lag");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   public static int method_49$8abf5c6871() {
      return field_47;
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 50297626009427L;
      long var3 = var1 ^ 35499706322023L;
      long var10000 = 5302251358828809680L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = 5302308622139237043L;
      long var6 = var3;
      C_47Th var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Lag");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   public static int method_45$8abf5c6871() {
      int var0 = method_49$8abf5c6871();
      return var0 == 0 ? 93 : 0;
   }

   public static void method_43$d00df7729d(int var0) {
      field_47 = var0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   private boolean method_43I$aae029aa0a() {
      long var1 = a ^ 72625907466906L;
      long var3 = var1 ^ 87936069112238L;
      long var10000 = 6078749230415597593L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = 6079008655428206458L;
      long var6 = var3;
      C_47Th var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Lag");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   private boolean method_43G$aae029aa0a() {
      long var1 = a ^ 113037164477319L;
      long var3 = var1 ^ 117893552138419L;
      long var10000 = 3260934836427925764L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = 3261132697639110247L;
      long var6 = var3;
      C_47Th var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Lag");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Criticals_47Co(long var1) {
      super("Criticals", "KritischeTreffer", ((a ^ var1) ^ 113677210138429L), Color.RED, Category.COMBAT);
      var1 = a ^ var1;
      long var3 = var1 ^ 34731635211803L;
      long var5 = var1 ^ 24494368123686L;
      long var7 = var1 ^ 113677210138429L;
      long var10001 = var1 ^ 98012660888480L;
      int var9 = (int)((var1 ^ 98012660888480L) >>> 32);
      int var10 = (int)((var1 ^ 98012660888480L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      // Super arguments moved to the required Java constructor position.
      short var10004 = (short)var10;
      short var10005 = (short)var11;
      BiFunction[] var10009 = new BiFunction[6];
      long var10012 = -4718766814319094042L;
      var10009[0] = C_47GI.method_42$0e52b9896c();
      var10012 = -4719050418242497604L;
      var10009[1] = C_47GE.method_41$0e52b9896c();
      var10012 = -4718967442590378513L;
      var10009[2] = C_47G0.method_48$0e52b9896c();
      var10012 = -4719162697173678192L;
      var10009[3] = C_47Gq.method_49$0e52b9896c();
      var10012 = -4719228415001545410L;
      var10009[4] = C_47GZ.method_45$0e52b9896c();
      var10012 = -4718667077609194966L;
      var10009[5] = C_47G5.method_43$0e52b9896c();
      this.settingMode = new C_47Th(var9, var10004, var10005, this, "Mode", "NoGround", var10009);
      BooleanSetting var29 = new BooleanSetting(this, var5, "OnlyWhileJumpKeyPressed", false);
      C_45n var10003 = recovery$indy$1(this);
      long var36 = -4719085966300540371L;
      C_45n var12 = var10003;
      long var13 = var3;
      BooleanSetting var15 = var29;
      this.settingOnlyWhileJumpKeyPressed = (BooleanSetting)var15.method_43$780fd62a21(var13, var12);
      BooleanSetting var30 = new BooleanSetting(this, var5, "onlyWhileKillAuraTarget", false);
      var10003 = recovery$indy$2(this);
      long var37 = -4719085966300540371L;
      C_45n var16 = var10003;
      long var17 = var3;
      BooleanSetting var19 = var30;
      this.settingOnlyWhileKillAuraTarget = (BooleanSetting)var19.method_43$780fd62a21(var17, var16);
      BooleanSetting var31 = new BooleanSetting(this, var5, "CriticalsInAir", true);
      var10003 = recovery$indy$3(this);
      long var38 = -4719085966300540371L;
      C_45n var20 = var10003;
      long var21 = var3;
      BooleanSetting var23 = var31;
      this.settingCriticalsInAir = (BooleanSetting)var23.method_43$780fd62a21(var21, var20);
      BooleanSetting var32 = new BooleanSetting(this, var5, "CriticalsOnGround", true);
      var10003 = recovery$indy$4(this);
      long var39 = -4719085966300540371L;
      C_45n var24 = var10003;
      long var25 = var3;
      BooleanSetting var27 = var32;
      this.settingCriticalsOnGround = (BooleanSetting)var27.method_43$780fd62a21(var25, var24);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_45n recovery$indy$1(Criticals_47Co var0);

   private static native C_45n recovery$indy$2(Criticals_47Co var0);

   private static native C_45n recovery$indy$3(Criticals_47Co var0);

   private static native C_45n recovery$indy$4(Criticals_47Co var0);

   private static native MethodHandle recovery$constant$5();
}
