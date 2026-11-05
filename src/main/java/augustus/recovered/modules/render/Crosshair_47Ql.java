package augustus.recovered.modules.render;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
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
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Fw;
import net.C_47LS;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47oo;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Crosshair_47Ql extends client.module.Module implements client.event.RenderListener {
    public final client.setting.BooleanSetting settingDefaultCrossHair = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingThirdPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLength = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMargin = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDot = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTStyle = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingShadow = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private boolean method_49G$aae029aa0a() {
      long var1 = a ^ 85458603647487L;
      long var10000 = -2000940401385986211L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2001072217560324788L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void onRender2D(int var1, float var2, char var3, int var4, net.minecraft.client.gui.ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 21574113237242L;
      long var10 = var6 ^ 132989861136316L;
      long var12 = var6 ^ 58032606781533L;
      int[] var14 = (int[])recovery$indy$flow$5(1630400085764724166L, var6);
      int var10000 = ((int) (recovery$indy$flow$9(client.ClientGlobals.field_48.field_44c.settingDefaultCrossHair, 1630760567591737303L, var6) ? 1 : 0));
      if (var14 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = ((int) (((net.C_47LS)recovery$indy$flow$11(field_43, 1630559240163746358L, var6)).method_48$aae029aa0a() ? 1 : 0));
      }

      if (var14 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((net.C_47oo)recovery$indy$flow$14(field_43, 1630473102906175144L, var6)).field_44S;
      }

      boolean var10001 = true;
      int[] var10002 = var14;
      if (var1 > 0) {
         if (var14 == null) {
            label76: {
               if (var10000 >= 1) {
                  var10000 = ((int) (recovery$indy$flow$18(client.ClientGlobals.field_48.field_44c, var8, 1631414263735806151L, var6) ? 1 : 0));
                  int[] var15 = var14;
                  if (var3 >= 0) {
                     if (var14 == null) {
                        if (var10000 == 0) {
                           return;
                        }

                        var10000 = ((int) (recovery$indy$flow$22(client.ClientGlobals.field_48.field_44c.settingThirdPerson, 1630760567591737303L, var6) ? 1 : 0));
                     }

                     var15 = var14;
                  }

                  if (var15 != null) {
                     break label76;
                  }

                  if (var10000 == 0) {
                     return;
                  }
               }

               var10000 = 0;
            }

            var10001 = recovery$indy$flow$26(client.ClientGlobals.field_48.field_44c.settingShadow, 1630760567591737303L, var6);
         }

         var10002 = var14;
      }

      label56: {
         label89: {
            if (var1 >= 0) {
               if (var10002 == null) {
                  if (!var10001) {
                     break label89;
                  }

                  var10001 = recovery$indy$flow$29(client.ClientGlobals.field_48.field_41D, var8, 1631414263735806151L, var6);
               }

               var10002 = var14;
            }

            if (var10002 != null) {
               break label56;
            }

            if (var10001) {
               var10001 = true;
               break label56;
            }
         }

         var10001 = false;
      }

      recovery$indy$flow$30((((var10000) & 1) != 0), var10001, var10, 1630319991373331447L, var6);
      recovery$indy$flow$32(false, var12, (net.C_47Fw)recovery$indy$flow$31(var5), 1631338101385654896L, var6);
      client.render.RenderUtils.method_41$da8c82d5d4();
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 65405710216163L;
      long var10000 = -1285973907131585215L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -1286140882428301488L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 23607255350903L;
      long var10000 = -309794481630201643L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -310014267576354108L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private static void method_45$9026d96459(ScaledResolution var0, RenderPass var1) {
      long var2 = a ^ 139235854800733L;
      long var4 = var2 ^ 118897481982260L;
      long var10002 = 1340030388968850475L;
      long var6 = var4;
      ScaledResolution var8 = var0;
      C_47LS.method_43$4cdccbe08b(var8, var6);
   }



   private boolean method_49x$aae029aa0a() {
      long var1 = a ^ 75326169566223L;
      long var10000 = 705713245554199213L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 705598739977013436L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$12(this, 32, 1000000, var3, -7099230287455324102L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_49L$aae029aa0a() {
      long var1 = a ^ 76266302371886L;
      long var10000 = 4461435186885951116L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 4461883674471906461L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_49M$aae029aa0a() {
      long var1 = a ^ 69258926761146L;
      long var10000 = 7025131679058862616L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 7025527661483352073L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49B$aae029aa0a() {
      long var1 = a ^ 35577434062964L;
      long var10000 = -8813449171692534058L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -8813071090414877497L;
      BooleanSetting var4 = this.settingDefaultCrossHair;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



    public Crosshair_47Ql(long a0) {
        super((java.lang.String) ("Crosshair"),(java.lang.String) ("Fadenkreuz"),(long) (((augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0) ^ 30976090854264L)),(java.awt.Color) (new java.awt.Color((int) (157),(int) (230),(int) (106))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0) ^ 110884002830942L);
        long constructorKey4 = ((augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0) ^ 119884033986403L);
        long constructorKey5 = ((augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0) ^ 70714994372836L);
        long constructorKey6 = ((augustus.recovered.modules.render.Crosshair_47Ql.a ^ a0) ^ 10552647896902L);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey4, "DefaultCrossHair", false);
        recovery$indy$flow$70(this, initialized7);
        client.setting.BooleanSetting initialized8 = new client.setting.BooleanSetting(this, constructorKey4, "ThirdPerson", false);
        recovery$indy$flow$73(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey5, 1.0D, Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue10 = ((java.lang.Object)(((augustus.recovered.modules.render.Crosshair_47Ql) (((java.lang.Object)(this)))).settingDefaultCrossHair));
        java.lang.Object initialValue11 = recovery$indy$flow$77(initialValue10);
        java.lang.Object initialValue12 = recovery$indy$flow$78(initialValue10);
        java.lang.Object initialValue13 = initialValue12;
        client.setting.NumberSetting initialValue14 = initialized9;
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue16 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue17 = recovery$indy$flow$81(initialValue15, initialValue16);
        recovery$indy$flow$82(this, initialValue17);
        java.awt.Color initialized18 = new java.awt.Color(94, 0, 255, 255);
        client.setting.ColorSetting initialized19 = new client.setting.ColorSetting(constructorKey6, this, "Color", initialized18);
        java.lang.Object initialValue20 = recovery$indy$flow$87(this);
        java.lang.Object initialValue21 = initialValue20;
        long initialValue22 = constructorKey3;
        client.setting.ColorSetting initialValue23 = initialized19;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue26 = recovery$indy$flow$90(initialValue24, initialValue22, initialValue25);
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue26))))));
        recovery$indy$flow$92(this, initialValue27);
        client.setting.NumberSetting initialized28 = new client.setting.NumberSetting(this, "Length", Double.longBitsToDouble(4616189618054758400L), constructorKey5, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0);
        java.lang.Object initialValue29 = recovery$indy$flow$95(this);
        java.lang.Object initialValue30 = initialValue29;
        client.setting.NumberSetting initialValue31 = initialized28;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue34 = recovery$indy$flow$98(initialValue32, initialValue33);
        recovery$indy$flow$99(this, initialValue34);
        client.setting.NumberSetting initialized35 = new client.setting.NumberSetting(this, "Width", 1.0D, constructorKey5, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        java.lang.Object initialValue36 = recovery$indy$flow$102(this);
        java.lang.Object initialValue37 = initialValue36;
        client.setting.NumberSetting initialValue38 = initialized35;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue41 = recovery$indy$flow$105(initialValue39, initialValue40);
        recovery$indy$flow$106(this, initialValue41);
        client.setting.NumberSetting initialized42 = new client.setting.NumberSetting(this, "Margin", 1.0D, constructorKey5, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0);
        java.lang.Object initialValue43 = recovery$indy$flow$109(this);
        java.lang.Object initialValue44 = initialValue43;
        client.setting.NumberSetting initialValue45 = initialized42;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue48 = recovery$indy$flow$112(initialValue46, initialValue47);
        recovery$indy$flow$113(this, initialValue48);
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, constructorKey4, "Dot", true);
        java.lang.Object initialValue50 = recovery$indy$flow$116(this);
        java.lang.Object initialValue51 = initialValue50;
        long initialValue52 = constructorKey3;
        client.setting.BooleanSetting initialValue53 = initialized49;
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue56 = recovery$indy$flow$119(initialValue54, initialValue52, initialValue55);
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue56))))));
        recovery$indy$flow$121(this, initialValue57);
        client.setting.BooleanSetting initialized58 = new client.setting.BooleanSetting(this, constructorKey4, "T-Style", false);
        java.lang.Object initialValue59 = recovery$indy$flow$124(this);
        java.lang.Object initialValue60 = initialValue59;
        long initialValue61 = constructorKey3;
        client.setting.BooleanSetting initialValue62 = initialized58;
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue64 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue65 = recovery$indy$flow$127(initialValue63, initialValue61, initialValue64);
        java.lang.Object initialValue66 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue65))))));
        recovery$indy$flow$129(this, initialValue66);
        client.setting.BooleanSetting initialized67 = new client.setting.BooleanSetting(this, constructorKey4, "Shadow", true);
        java.lang.Object initialValue68 = recovery$indy$flow$132(this);
        java.lang.Object initialValue69 = initialValue68;
        long initialValue70 = constructorKey3;
        client.setting.BooleanSetting initialValue71 = initialized67;
        java.lang.Object initialValue72 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue73 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue74 = recovery$indy$flow$135(initialValue72, initialValue70, initialValue73);
        java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue74))))));
        recovery$indy$flow$137(this, initialValue75);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$5(long a0,long a1);
    private static native boolean recovery$indy$flow$9(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$11(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$14(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$18(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$22(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$26(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$29(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$30(boolean a0,boolean a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$31(java.lang.Object a0);
    private static native void recovery$indy$flow$32(boolean a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native void recovery$indy$flow$70(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$73(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$77(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$82(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$87(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$92(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$95(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$98(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$99(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$102(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$105(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$106(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$109(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$112(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$113(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$116(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$119(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$121(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$124(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$127(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$135(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$137(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$12(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native MethodHandle recovery$constant$21();
}
