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
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_478Q;
import net.C_478k;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47PB;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47nb;
import client.module.Category;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public final class ChunkAnimator_47QH extends client.module.Module {
    private final java.lang.String[] field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAnimationTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableAroundPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.WeakHashMap field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 106067382214777L;
      long var3 = var1 ^ 98787309396157L;
      long var10000 = -1923234904937571044L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -1923362296488202128L;
      long var6 = var3;
      ModeSetting var8 = this.settingAnimation;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private static C_484 method_49$5c7a6e2439(long var0, C_478k var2) {
      var0 = a ^ var0;
      int var4 = Math.abs(var2.method_40$8abf5c6871());
      int[] var10000 = recovery$indy$1(-6442091014112600374L, var0);
      int var5 = Math.abs(var2.method_47$8abf5c6871());
      int[] var3 = var10000;
      int var8 = var4;
      if (var3 == null) {
         if (var4 > var5) {
            C_484 var6;
            label45: {
               if (var2.method_40$8abf5c6871() > 0) {
                  var6 = C_484.EAST;
                  var10000 = var3;
                  if (var0 < 0L) {
                     break label45;
                  }

                  if (var3 == null) {
                     return var6;
                  }
               }

               var6 = C_484.WEST;
               var10000 = var3;
            }

            if (var10000 == null) {
               return var6;
            }
         }

         var8 = var2.method_47$8abf5c6871();
      }

      if (var8 > 0) {
         if (var0 <= 0L) {
            return C_484.SOUTH;
         }

         C_484 var11 = C_484.SOUTH;
         if (var3 == null) {
            return var11;
         }
      }

      return C_484.NORTH;
   }



   public void method_49$b757f1dce0(net.C_47PB var1, short var2, long var3) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
      long var7 = var5 ^ 89360203399231L;
      long var9 = var5 ^ 88510784397589L;
      long var11 = var5 ^ 57167555763803L;
      long var13 = var5 ^ 11665675125274L;
      long var15 = var5 ^ 24653535948239L;
      int[] var17 = (int[])recovery$indy$flow$19(5649241448291825205L, var5);
      if (var17 != null) {
         net.C_47nl var29 = (net.C_47nl)(Object) (this);
         long var30 = var29.field_46;
         recovery$indy$flow$26(this.settingMode, var9, 5649400943921230482L, var5);
         long var39 = var30 - -1L;
         recovery$indy$flow$43(this.settingAnimationTime, var13, 5649087340870202762L, var5);
      } else if (recovery$indy$flow$20(this, var7, 5649568726348827536L, var5)) {
         net.C_47nl var18 = (net.C_47nl)this.field_47.get(var1);
         if (var18 != null) {
            long var19 = var18.field_46;
            int var21 = recovery$indy$flow$26(this.settingMode, var9, 5649400943921230482L, var5);
            if (var19 == -1L) {
               var19 = System.currentTimeMillis();
               var18.field_46 = var19;
               if (var21 == 4) {
                  net.C_478Q var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 5649302504184500302L, var5)).method_47$5730377d31();
                  var22 = var22.method_46$46079ffcd3(0, -var22.method_43$8abf5c6871(), 0);
                  net.C_478Q var23 = var1.method_40$5730377d31().method_46$46079ffcd3(8, -var1.method_40$5730377d31().method_43$8abf5c6871(), 8);
                  var18.field_47 = (net.C_484)recovery$indy$flow$39(var15, var22.method_41$7de9610298(var23), 5649522187237136624L, var5);
               }
            }

            long var32 = System.currentTimeMillis() - var19;
            int var24 = (int)recovery$indy$flow$43(this.settingAnimationTime, var13, 5649087340870202762L, var5);
            long var40;
            int var10000 = (var40 = var32 - var24) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 >= 0) {
               if (var10000 >= 0) {
                  this.field_47.remove(var1);
                  return;
               }

               var10000 = var1.method_40$5730377d31().method_43$8abf5c6871();
            }

            int var25;
            label143: {
               var25 = var10000;
               if (var21 == 2) {
                  if (var25 < ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$47(field_43, 5649159601969829992L, var5)).method_45$fedcb3e4d3()) {
                     var10000 = 0;
                     if (var2 < 0) {
                        break label143;
                     }

                     var21 = 0;
                  } else {
                     var21 = 1;
                  }
               }

               var10000 = var21;
            }

            if (var10000 == 4) {
               var21 = 3;
            }

            switch (var21) {
               case 0:
                  net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(
                     0.0, -var25 + recovery$indy$flow$49(this, (float)var32, var25, var24, var11, 5648942065258324287L, var5), 0.0
                  );
                  int[] var38 = var17;
                  if (var3 >= 0L) {
                     if (var17 == null) {
                        break;
                     }

                     net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(
                        0.0, 256 - var25 - recovery$indy$flow$51(this, (float)var32, 256 - var25, var24, var11, 5648942065258324287L, var5), 0.0
                     );
                     var38 = var17;
                  }

                  if (var38 != null && var18.field_47 != null) {
                     net.C_478k var34 = var18.field_47.method_40$def87834e6();
                     double var36 = -(200.0 - recovery$indy$flow$56(this, (float)var32, 200.0F, var24, var11, 5648942065258324287L, var5));
                     net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(var34.method_40$8abf5c6871() * var36, 0.0, var34.method_47$8abf5c6871() * var36);
                  }
                  break;
               case 1:
                  net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(
                     0.0, 256 - var25 - recovery$indy$flow$51(this, (float)var32, 256 - var25, var24, var11, 5648942065258324287L, var5), 0.0
                  );
                  if (var17 != null && var18.field_47 != null) {
                     net.C_478k var33 = var18.field_47.method_40$def87834e6();
                     double var35 = -(200.0 - recovery$indy$flow$56(this, (float)var32, 200.0F, var24, var11, 5648942065258324287L, var5));
                     net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(var33.method_40$8abf5c6871() * var35, 0.0, var33.method_47$8abf5c6871() * var35);
                  }
               case 2:
               default:
                  break;
               case 3:
                  if (var18.field_47 != null) {
                     net.C_478k var26 = var18.field_47.method_40$def87834e6();
                     double var27 = -(200.0 - recovery$indy$flow$56(this, (float)var32, 200.0F, var24, var11, 5648942065258324287L, var5));
                     net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(var26.method_40$8abf5c6871() * var27, 0.0, var26.method_47$8abf5c6871() * var27);
                  }
            }
         }
      }
   }





   private double method_45$deb0a902a0(float var1, float var2, float var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 44098281230591L;
      return C_47nb.method_41$b73618ba3d(C_47nb.method_41$7498260812(recovery$indy$12(this.settingAnimation, var6, -7706598025364275150L, var4)), var1 / var3) * var2;
   }



   public void method_43$03661f2387(net.C_47PB var1, net.C_478Q var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 96955595869408L;
      long var7 = var3 ^ 98869965450698L;
      long var9 = var3 ^ 34118846325008L;
      int[] var11 = (int[])recovery$indy$flow$68(-4415451498865001750L, var3);
      if (recovery$indy$flow$69(this, var5, -4415702773281454257L, var3)) {
         if ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$71(field_43, -4415405764725449583L, var3) != null) {
            boolean var12 = true;
            net.C_478Q var13 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -4415405764725449583L, var3)).method_47$5730377d31();
            var13 = var13.method_46$46079ffcd3(0, -var13.method_43$8abf5c6871(), 0);
            net.C_478Q var14 = var2.method_46$46079ffcd3(8, -var2.method_43$8abf5c6871(), 8);
            boolean var10000 = recovery$indy$flow$80(this.settingDisableAroundPlayer, -4415079437730001482L, var3);
            if (var11 == null) {
               if (var10000) {
                  var12 = var13.method_44$1947510a23(var14) > 4096.0;
               }

               if (var12) {
                  net.C_484 var19 = null;
                  if (recovery$indy$flow$83(this.settingMode, var7, -4415289799895024051L, var3) == 3) {
                     var19 = (net.C_484)recovery$indy$flow$85(var9, var13.method_41$7de9610298(var14), -4415732066516036561L, var3);
                  }

                  net.C_47nl var20 = new net.C_47nl(-1L, var19);
                  this.field_47.put(var1, var20);
                  if (var3 < 0L || var11 == null) {
                     return;
                  }
               }

               this.field_47.remove(var1);
            } else {
               if (var10000) {
                  net.C_484 var15 = null;
                  if (recovery$indy$flow$83(this.settingMode, var7, -4415289799895024051L, var3) == 3) {
                     var15 = (net.C_484)recovery$indy$flow$85(var9, var13.method_41$7de9610298(var14), -4415732066516036561L, var3);
                  }

                  net.C_47nl var16 = new net.C_47nl(-1L, var15);
                  this.field_47.put(var1, var16);
                  if (var3 < 0L || var11 == null) {
                     return;
                  }
               }

               this.field_47.remove(var1);
            }
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ChunkAnimator_47QH(long a0) {
        super((java.lang.String) ("ChunkAnimator"),(java.lang.String) ("LadungsAnimationF\u00fcrBereiche"),(long) (((augustus.recovered.modules.render.ChunkAnimator_47QH.a ^ a0) ^ 123925557080546L)),(java.awt.Color) (new java.awt.Color((int) (54),(int) (21),(int) (230))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ChunkAnimator_47QH.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.ChunkAnimator_47QH.a ^ a0) ^ 64878629224751L);
        long constructorKey4 = ((augustus.recovered.modules.render.ChunkAnimator_47QH.a ^ a0) ^ 1722976579065L);
        long constructorKey5 = ((augustus.recovered.modules.render.ChunkAnimator_47QH.a ^ a0) ^ 49242239668862L);
        java.lang.Object initialValue6 = recovery$indy$flow$92(5);
        ((java.lang.Object[]) initialValue6)[0] = "Below";
        ((java.lang.Object[]) initialValue6)[1] = "Above";
        ((java.lang.Object[]) initialValue6)[2] = "Horizon";
        ((java.lang.Object[]) initialValue6)[3] = "Cardinal";
        ((java.lang.Object[]) initialValue6)[4] = "Variation";
        recovery$indy$flow$93(this, initialValue6);
        java.lang.Object initialValue7 = ((java.lang.Object)(((augustus.recovered.modules.render.ChunkAnimator_47QH) (((java.lang.Object)(this)))).field_40));
        java.lang.Object arrayValue8 = ((java.lang.Object[]) initialValue7)[0];
        java.lang.Object initialValue9 = ((java.lang.Object)(((augustus.recovered.modules.render.ChunkAnimator_47QH) (((java.lang.Object)(this)))).field_40));
        client.setting.ModeSetting initialized10 = new client.setting.ModeSetting(this, "Mode", constructorKey3, (java.lang.String) (arrayValue8), (java.lang.String[]) (initialValue9));
        recovery$indy$flow$98(this, initialized10);
        java.lang.Object initialValue11 = recovery$indy$flow$100(true);
        client.setting.ModeSetting initialized12 = new client.setting.ModeSetting(this, "Animation", constructorKey3, "easeOutBack", (java.lang.String[]) (initialValue11));
        recovery$indy$flow$102(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "AnimationTime", Double.longBitsToDouble(4647503709213818880L), constructorKey5, 0.0D, Double.longBitsToDouble(4656510908468559872L), 0);
        java.lang.Object initialValue14 = recovery$indy$flow$105(this);
        java.lang.Object initialValue15 = initialValue14;
        client.setting.NumberSetting initialValue16 = initialized13;
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue18 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue19 = recovery$indy$flow$108(initialValue17, initialValue18);
        recovery$indy$flow$109(this, initialValue19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey4, "DisableAroundPlayer", false);
        recovery$indy$flow$112(this, initialized20);
        java.util.WeakHashMap initialized21 = new java.util.WeakHashMap();
        recovery$indy$flow$115(this, initialized21);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$19(long a0,long a1);
    private static native boolean recovery$indy$flow$20(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$26(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$30(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$39(long a0,java.lang.Object a1,long a2,long a3);
    private static native double recovery$indy$flow$43(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$47(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$49(java.lang.Object a0,float a1,float a2,float a3,long a4,long a5,long a6);
    private static native double recovery$indy$flow$51(java.lang.Object a0,float a1,float a2,float a3,long a4,long a5,long a6);
    private static native double recovery$indy$flow$56(java.lang.Object a0,float a1,float a2,float a3,long a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$68(long a0,long a1);
    private static native boolean recovery$indy$flow$69(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$71(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$83(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$85(long a0,java.lang.Object a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$92(int a0);
    private static native void recovery$indy$flow$93(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$98(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$100(boolean a0);
    private static native void recovery$indy$flow$102(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$105(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$108(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$112(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$115(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$21();
}
