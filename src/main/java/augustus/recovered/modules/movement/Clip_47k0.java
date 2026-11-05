package augustus.recovered.modules.movement;
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
import net.C_40X;
import net.C_45n;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.event.RenderListener;
import net.C_47cu;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47qi;
import client.module.Category;
import net.C_47xZ;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Clip_47k0 extends client.module.Module implements client.event.RenderListener,net.C_47iC {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoDisable = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4;
      boolean var6;
      C_473U var7;
      boolean var10000;
      boolean var10001;
      label86: {
         var4 = var1 ^ 40846118478071L;
         var6 = recovery$indy$1(2667935349215462881L, var1);
         var7 = recovery$indy$2(var3, 2667810690335324747L, var1);
         var10000 = var7 instanceof C_47xZ;
         label85:
         if (!var6) {
            if (var10000) {
               var10000 = recovery$indy$3(this.settingMode, var4, 2667345777052996963L, var1).equals(recovery$indy$4(13225, 3081797554906041395L ^ var1));
               var10001 = var6;
               if (var1 < 0L) {
                  break label86;
               }

               if (var6) {
                  break label85;
               }

               if (var10000) {
                  var3.cancel();
               }
            }

            var10000 = var7 instanceof C_47xZ;
         }

         var10001 = var6;
      }

      label75: {
         label74:
         if (!var10001) {
            if (var10000) {
               var10000 = recovery$indy$5(this.settingMode, var4, 2667345777052996963L, var1).equals(recovery$indy$6(27053, 8535321820490618426L ^ var1));
               var10001 = var6;
               if (var1 < 0L) {
                  break label75;
               }

               if (var6) {
                  break label74;
               }

               if (var10000) {
                  ((C_47xZ)var7).method_41$24a796ab4c(1.0F);
               }
            }

            var10000 = var7 instanceof C_47qi;
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (!var10001) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$7(this.settingMode, var4, 2667345777052996963L, var1).equals(recovery$indy$8(5603, 7522057834991790719L ^ var1));
         }

         var10001 = var6;
      }

      label56: {
         if (!var10001) {
            if (var10000) {
               break label56;
            }

            var10000 = recovery$indy$9(this.settingMode, var4, 2667345777052996963L, var1).equals(recovery$indy$10(13225, 3081797554906041395L ^ var1));
         }

         if (!var10000) {
            return;
         }
      }

      var3.cancel();
   }




    public void onRender3D(long l, float f) {
        block3: {
            Clip_47k0 clip_47k0;
            long l2;
            block4: {
                C_47cu c_47cu;
                block5: {
                    boolean bl;
                    block2: {
                        long l3 = l;
                        l2 = l3 ^ 0x1B50E16D6323L;
                        long l4 = l3 ^ 0x3447A4C43C95L;
                        long l5 = l3 ^ 0x387F20F02EC1L;
                        boolean bl2 = Clip_47k0.recovery$indy$11(8136390530516865037L, l);
                        bl = Clip_47k0.recovery$indy$12(this.settingAutoDisable, 8136351751990243533L, l);
                        if (bl2) break block2;
                        if (!bl) break block3;
                        clip_47k0 = this;
                        if (l <= 0L) break block4;
                        c_47cu = clip_47k0.field_47;
                        if (bl2) break block5;
                        bl = Clip_47k0.recovery$indy$14(c_47cu, Clip_47k0.recovery$indy$13(this.settingTime, l4, 8136486154123355773L, l), l5, 8136844870240797258L, l);
                    }
                    if (!bl) break block3;
                    c_47cu = this.field_47;
                }
                Clip_47k0.recovery$indy$15(c_47cu, 8136172548770353367L, l);
                clip_47k0 = this;
            }
            Clip_47k0.recovery$indy$16((Object)clip_47k0, l2, false, 8135937577520448883L, l);
        }
    }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 32, var3, -7098946857650413705L, var1);
      recovery$indy$18(this, 26, var3, -7098946857650413705L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 21639693029742L;
      if (recovery$indy$19(this.settingMode, var3, -7737916081201257222L, var1).equals(recovery$indy$20(13225, 3081737595948973482L ^ var1))) {
         recovery$indy$21(field_43, -7737194061723290077L, var1).field_43 = 1.0F;
      }
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4;
      Minecraft var9;
      label30: {
         var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
         long var6 = var4 ^ 7668165369880L;
         boolean var8 = recovery$indy$22(2731796905344763150L, var4);
         EntityPlayerSP var10000 = recovery$indy$23(field_43, 2732196761599118121L, var4);
         if (!var8) {
            if (var10000 == null) {
               return;
            }

            var9 = field_43;
            if (var8) {
               break label30;
            }

            var10000 = recovery$indy$24(field_43, 2732196761599118121L, var4);
         }

         var10000.field_42 = 0.9;
         recovery$indy$25(this.field_47, 2732122604707284436L, var4);
         if (!recovery$indy$26(this.settingMode, var6, 2732404065421350284L, var4).equals(recovery$indy$27(19471, 8108488710646231928L ^ var4))) {
            return;
         }

         var9 = field_43;
      }

      recovery$indy$28(var9, 2731964966260836181L, var4).field_43 = 100.0F;
   }



    public Clip_47k0(long a0) {
        super((java.lang.String) ("Clip"),(java.lang.String) ("Clip"),(long) (((augustus.recovered.modules.movement.Clip_47k0.a ^ a0) ^ 124616432499476L)),(java.awt.Color) (new java.awt.Color((int) (135),(int) (168),(int) (50))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.Clip_47k0.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.Clip_47k0.a ^ a0) ^ 64744876264409L);
        long constructorKey4 = ((augustus.recovered.modules.movement.Clip_47k0.a ^ a0) ^ 489720112911L);
        long constructorKey5 = ((augustus.recovered.modules.movement.Clip_47k0.a ^ a0) ^ 49659331205256L);
        java.lang.Object initialValue6 = recovery$indy$flow$60(3);
        ((java.lang.Object[]) initialValue6)[0] = "Intave1";
        ((java.lang.Object[]) initialValue6)[1] = "Intave2";
        ((java.lang.Object[]) initialValue6)[2] = "IntaveInstant";
        client.setting.ModeSetting initialized7 = new client.setting.ModeSetting(this, "Mode", constructorKey3, "IntaveInstant", (java.lang.String[]) (initialValue6));
        recovery$indy$flow$62(this, initialized7);
        client.setting.BooleanSetting initialized8 = new client.setting.BooleanSetting(this, constructorKey4, "AutoDisable", true);
        recovery$indy$flow$65(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Time", Double.longBitsToDouble(4632233691727265792L), constructorKey5, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        java.lang.Object initialValue10 = ((java.lang.Object)(((augustus.recovered.modules.movement.Clip_47k0) (((java.lang.Object)(this)))).settingAutoDisable));
        java.lang.Object initialValue11 = recovery$indy$flow$69(initialValue10);
        java.lang.Object initialValue12 = recovery$indy$flow$70(initialValue10);
        java.lang.Object initialValue13 = initialValue12;
        client.setting.NumberSetting initialValue14 = initialized9;
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue16 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue17 = recovery$indy$flow$73(initialValue15, initialValue16);
        recovery$indy$flow$74(this, initialValue17);
        net.C_47cu initialized18 = new net.C_47cu();
        recovery$indy$flow$77(this, initialized18);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$60(int a0);
    private static native void recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$65(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$69(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$70(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$74(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$77(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$4(int var0, long var1);
   private static native String recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$6(int var0, long var1);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$10(int var0, long var1);
   private static native boolean recovery$indy$11(long var0, long var2);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$14(Object var0, double var1, long var3, long var5, long var7);
   private static native void recovery$indy$15(Object var0, long var1, long var3);
   private static native void recovery$indy$16(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$20(int var0, long var1);
   private static native C_40X recovery$indy$21(Object var0, long var1, long var3);
   private static native boolean recovery$indy$22(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native void recovery$indy$25(Object var0, long var1, long var3);
   private static native String recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$27(int var0, long var1);
   private static native C_40X recovery$indy$28(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$30();
}
