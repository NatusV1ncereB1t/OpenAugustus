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
import client.Client;
import net.C_45n;
import net.C_470I;
import net.C_473U;
import net.C_473k;
import net.C_475e;
import net.C_476w;
import net.C_477A;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47Vp;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47ob;
import net.C_47t0;
import client.module.Category;
import net.C_4f;

public class Ambiance_47Qd extends Module implements C_47iC, C_47t0, C_47Vp {
   public final NumberSetting settingTime;
   public final NumberSetting settingTimeSpeed;
   public final NumberSetting settingRain;
   public final BooleanSetting settingSnow;
   public final NumberSetting settingThunder;
   public final BooleanSetting settingCustomWorldColor;
   public final ColorSetting settingWorldColor;
   public final BooleanSetting settingCustomFogColor;
   public final ColorSetting settingFogColor;
   public final BooleanSetting settingCustomFogDistance;
   public final NumberSetting settingFogDistance;
   public long field_47;
   private float field_46B;
   private float field_44;
   private static final long a = C_4f.a(-7638763125325487253L, -589784491240005300L, MethodHandles.lookup().lookupClass()).a(138706791510426L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[54];
   private static final String[] f = new String[54];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   @Override
   public void method_42$c07f64928a(C_476w var1, int var2, long var3) {
      long var5 = (long)var2 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 113070244356385L;
      long var9 = var5 ^ 17826462876570L;
      long var11 = var5 ^ 106527147663871L;
      long var10001 = var5 ^ 78166647674581L;
      int var13 = (int)((var5 ^ 78166647674581L) >>> 32);
      int var14 = (int)((var5 ^ 78166647674581L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      int[] var16 = recovery$indy$1(2616459659312787265L, var5);
      boolean var10000 = recovery$indy$2(this.settingCustomWorldColor, 2616353333005377227L, var5);
      if (var16 == null) {
         if (!var10000) {
            return;
         }

         recovery$indy$3(this.settingWorldColor, var13, (short)var14, (char)var15, 0, 2616250848211012863L, var5);
      }

      recovery$indy$5(var1, recovery$indy$4(this.settingWorldColor, var7, 2612313736821512099L, var5), 2616197324359717066L, var5);
      recovery$indy$7(var1, recovery$indy$6(this.settingWorldColor, var9, 2615971021007652080L, var5), 2614974802724360718L, var5);
      recovery$indy$9(var1, recovery$indy$8(this.settingWorldColor, var11, 2615938834114627223L, var5), 2615267014536497702L, var5);
   }

   @Override
   public void method_42$c77e6f55ea(C_473k var1, long var2) {
      long var4;
      int[] var6;
      long var7;
      label30: {
         var4 = var2 ^ 1629213668026L;
         var6 = recovery$indy$10(-87632639735253562L, var2);
         double var10001 = recovery$indy$11(this.settingTimeSpeed, var4, -87744028629953525L, var2);
         double var10002 = 0.0;
         if (var6 == null) {
            if (!(var10001 > 0.0)) {
               var7 = 0L;
               break label30;
            }

            var10001 = this.field_47;
            var10002 = recovery$indy$12(this.settingTimeSpeed, var4, -87744028629953525L, var2);
         }

         var7 = (long)(var10001 + var10002);
      }

      this.field_47 = var7;
      recovery$indy$14(var1, (long)(recovery$indy$13(this.settingTime, var4, -87744028629953525L, var2) + this.field_47), -87242778059941320L, var2);
      Ambiance_47Qd var10000 = this;
      if (var6 == null) {
         if (this.field_47 <= 24000L) {
            return;
         }

         var10000 = this;
      }

      var10000.field_47 = 0L;
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_47$9035875d26(long var1, C_47ob var3) {
      C_473U var4 = recovery$indy$15(var3, 2669006995076328181L, var1);
      if (var4 instanceof C_470I) {
         var3.cancel();
      }
   }

   private void method_47$da8c82d5d4() {
      long var1 = a ^ 139547359739946L;
      long var3 = var1 ^ 102960862984346L;
      long var5 = var1 ^ 55882214641043L;
      long var7 = var1 ^ 63877651051313L;
      long var10000 = -662682723894051389L;
      int[] var9 = AntiStrike_47Qa.method_42$d4d28024c9();
      var10000 = -663933231305918239L;
      Client var23 = Client.method_44$fbc0c0be91();
      long var10001 = -662549957254317154L;
      Client var10 = var23;
      long var10002 = -663766807041096487L;
      long var11 = var3;
      FullBright_47Hh var13 = var10.method_45$4a5eee04b7().field_48I;
      boolean var24 = var13.method_46$0dd78e0064(var11);
      if (var9 == null) {
         if (!var24) {
            return;
         }

         var10000 = -663933231305918239L;
         Client var26 = Client.method_44$fbc0c0be91();
         var10001 = -662549957254317154L;
         Client var14 = var26;
         var10002 = -664243034931533543L;
         long var15 = var7;
         ModeSetting var17 = var14.method_45$4a5eee04b7().field_48I.settingMode;
         var24 = var17.method_46$5f9dc63072(var15).equals("Gamma");
      }

      if (var9 == null) {
         if (!var24) {
            return;
         }

         var10001 = -662870414337635255L;
         BooleanSetting var18 = this.settingCustomWorldColor;
         var24 = var18.method_49$aae029aa0a();
      }

      if (var24) {
         var10002 = -662359628915545250L;
         String var19 = "Disable gamma mode in FullBright module";
         long var20 = var5;
         C_475e.method_46$d07b98bfef(var20, var19);
      }
   }

   @Override
   public void method_43$3aa2b8ed81(long var1, C_476w var3) {
      long var4 = var1 ^ 29862346984106L;
      long var6 = var1 ^ 120707419121681L;
      long var8 = var1 ^ 32006664735348L;
      long var10001 = var1 ^ 64774522994014L;
      int var10 = (int)((var1 ^ 64774522994014L) >>> 32);
      int var11 = (int)((var1 ^ 64774522994014L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      int[] var13 = recovery$indy$16(5747989283022570698L, var1);
      boolean var10000 = recovery$indy$17(this.settingCustomFogColor, 5747818531938612544L, var1);
      if (var13 == null) {
         if (!var10000) {
            return;
         }

         recovery$indy$18(this.settingFogColor, var10, (short)var11, (char)var12, 0, 5748202492186126196L, var1);
      }

      recovery$indy$20(var3, recovery$indy$19(this.settingFogColor, var4, 5749883405222607912L, var1), 5748251618057632577L, var1);
      recovery$indy$22(var3, recovery$indy$21(this.settingFogColor, var6, 5748482319321853819L, var1), 5746940864904690053L, var1);
      recovery$indy$24(var3, recovery$indy$23(this.settingFogColor, var8, 5748514505670208796L, var1), 5746653051047174573L, var1);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$25(this, 26, var3, -7100620947448358828L, var1);
      recovery$indy$26(this, 44, var3, -7100620947448358828L, var1);
      recovery$indy$27(this, 45, var3, -7100620947448358828L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      int[] var3 = recovery$indy$28(-7740979518990065764L, var1);
      this.field_47 = 0L;
      WorldClient var10000 = recovery$indy$29(field_43, -7741274265319222873L, var1);
      if (var3 == null) {
         if (var10000 == null) {
            return;
         }

         recovery$indy$30(field_43, -7741274265319222873L, var1).method_40$24a796ab4c(this.field_46B);
         var10000 = recovery$indy$31(field_43, -7741274265319222873L, var1);
      }

      var10000.method_44$24a796ab4c(this.field_44);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$32(2730467197560778474L, var4);
      this.field_47 = 0L;
      if (var6 == null) {
         if (recovery$indy$33(field_43, 2731271842591727825L, var4) == null) {
            return;
         }

         this.field_46B = recovery$indy$34(field_43, 2731271842591727825L, var4).method_49$f6c4892e39(1.0F);
      }

      this.field_44 = recovery$indy$35(field_43, 2731271842591727825L, var4).method_47$f6c4892e39(1.0F);
   }

   public Ambiance_47Qd(long var1) {
      super("Ambiance", "Ambiente", ((a ^ var1) ^ 10554901984670L), new Color(224, 93, 40), Category.RENDER);
      var1 = a ^ var1;
      long var10001 = var1 ^ 18530953090207L;
      int var3 = (int)((var1 ^ 18530953090207L) >>> 32);
      int var4 = (int)((var1 ^ 18530953090207L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 124711326661816L;
      long var8 = var1 ^ 132753186630021L;
      long var10 = var1 ^ 94442871854594L;
      long var12 = var1 ^ 30981027195296L;
      long var14 = var1 ^ 10554901984670L;
      // Super arguments moved to the required Java constructor position.
      this.settingTime = new NumberSetting(this, "Time", 1900.0, var10, 0.0, 24000.0, 0);
      this.settingTimeSpeed = new NumberSetting(this, "TimeSpeed", 0.0, var10, 0.0, 100.0, 1);
      this.settingRain = new NumberSetting(this, "Rain", 0.0, var10, 0.0, 1.0, 2);
      this.settingSnow = new BooleanSetting(this, var8, "Snow", false);
      this.settingThunder = new NumberSetting(this, "Thunder", 0.0, var10, 0.0, 1.0, 2);
      BooleanSetting var34 = new BooleanSetting(this, var8, "CustomWorldColor", false);
      C_477A var10004 = recovery$indy$36(this);
      byte var10005 = (byte)var5;
      long var10006 = -275539687589034755L;
      byte var16 = var10005;
      C_477A var17 = var10004;
      int var18 = var4;
      int var19 = var3;
      BooleanSetting var20 = var34;
      this.settingCustomWorldColor = (BooleanSetting)var20.method_45$bd7ddd925e(var19, var18, var17, var16);
      var10006 = -276899141327851008L;
      Client var46 = Client.method_44$fbc0c0be91();
      long var10007 = -275266803197511768L;
      Client var21 = var46;
      ColorSetting var35 = new ColorSetting(var12, this, "WorldColor", var21.method_41$f87803cb87());
      BooleanSetting var10002 = this.settingCustomWorldColor;
      this.settingCustomWorldColor.getClass();
      C_45n var10003 = recovery$indy$37(var10002);
      long var43 = -274768830851471912L;
      C_45n var22 = var10003;
      long var23 = var6;
      ColorSetting var25 = var35;
      this.settingWorldColor = (ColorSetting)var25.method_43$780fd62a21(var23, var22);
      this.settingCustomFogColor = new BooleanSetting(this, var8, "CustomFogColor", false);
      var10006 = -276899141327851008L;
      Client var48 = Client.method_44$fbc0c0be91();
      var10007 = -275266803197511768L;
      Client var26 = var48;
      ColorSetting var36 = new ColorSetting(var12, this, "FogColor", var26.method_41$f87803cb87());
      var10002 = this.settingCustomFogColor;
      this.settingCustomFogColor.getClass();
      var10003 = recovery$indy$38(var10002);
      long var44 = -274768830851471912L;
      C_45n var27 = var10003;
      long var28 = var6;
      ColorSetting var30 = var36;
      this.settingFogColor = (ColorSetting)var30.method_43$780fd62a21(var28, var27);
      this.settingCustomFogDistance = new BooleanSetting(this, var8, "CustomFogDistance", false);
      NumberSetting var37 = new NumberSetting(this, "FogDistance", 192.0, var10, 0.0, 1000.0, 0);
      var10002 = this.settingCustomFogDistance;
      this.settingCustomFogDistance.getClass();
      C_45n var40 = recovery$indy$39(var10002);
      long var42 = -276711078117159468L;
      C_45n var31 = var40;
      NumberSetting var32 = var37;
      this.settingFogDistance = var32.method_43$9db6d416f4(var31);
      this.field_46B = 0.0F;
      this.field_44 = 0.0F;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native int recovery$indy$3(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native int recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$7(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$9(Object var0, float var1, long var2, long var4);

   private static native int[] recovery$indy$10(long var0, long var2);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native C_473U recovery$indy$15(Object var0, long var1, long var3);

   private static native int[] recovery$indy$16(long var0, long var2);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native int recovery$indy$18(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native int recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$20(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$21(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$22(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$23(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$24(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$26(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$28(long var0, long var2);

   private static native WorldClient recovery$indy$29(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$30(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$31(Object var0, long var1, long var3);

   private static native int[] recovery$indy$32(long var0, long var2);

   private static native WorldClient recovery$indy$33(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$34(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$35(Object var0, long var1, long var3);

   private static native C_477A recovery$indy$36(Ambiance_47Qd var0);

   private static native C_45n recovery$indy$37(BooleanSetting var0);

   private static native C_45n recovery$indy$38(BooleanSetting var0);

   private static native C_45n recovery$indy$39(BooleanSetting var0);

   private static native MethodHandle recovery$constant$40();
}
