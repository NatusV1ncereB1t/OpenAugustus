package augustus.recovered.modules.legit;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_42l;
import net.C_43F;
import net.C_45n;
import net.C_472n;
import net.C_474i;
import net.C_475c;
import net.C_476q;
import net.C_476x;
import net.C_478Q;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import net.C_47MO;
import client.module.Module;
import net.C_47S6;
import net.C_47TT;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47VU;
import net.C_47XK;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import net.C_47r0;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sc;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_47y6;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoEagle_47C6 extends client.module.Module implements net.C_47UH,net.C_47hi,net.C_47xz,net.C_476x,net.C_47r0 {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMinSneakTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingMoonWalkWideness = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingStartDistToBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSilentRotation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingIntave = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingMidRotation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFastPlace = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingDCPSMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAlwaysPlaceWhenPossible = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDelayClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingClickPause = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOneClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47XK field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47Ij field_41r; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_41g; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43U; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_41M; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_41x; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   private float method_46$85a266d04d(long var1, float var3) {
      boolean var4;
      float var5;
      int var10000;
      boolean var10001;
      label195: {
         var1 = a ^ var1;
         var4 = recovery$indy$1(3870206043021509063L, var1);
         var5 = C_47sk.method_41$f6c4892e39(var3);
         float var14;
         var10000 = (var14 = var5 - -25.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         label194:
         if (!var4) {
            if (var10000 > 0) {
               float var15;
               var10000 = (var15 = var5 - 25.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               var10001 = var4;
               if (var1 <= 0L) {
                  break label195;
               }

               if (var4) {
                  break label194;
               }

               if (var10000 < 0) {
                  return 0.0F;
               }
            }

            float var16;
            var10000 = (var16 = var5 - -25.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         }

         var10001 = var4;
      }

      label184: {
         label183:
         if (!var10001) {
            if (var10000 > 0) {
               float var17;
               var10000 = (var17 = var5 - 70.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
               var10001 = var4;
               if (var1 <= 0L) {
                  break label184;
               }

               if (var4) {
                  break label183;
               }

               if (var10000 < 0) {
                  return 45.0F;
               }
            }

            float var18;
            var10000 = (var18 = var5 - 70.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         }

         var10001 = var4;
      }

      label173: {
         label172:
         if (!var10001) {
            if (var10000 > 0) {
               float var19;
               var10000 = (var19 = var5 - 115.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
               var10001 = var4;
               if (var1 < 0L) {
                  break label173;
               }

               if (var4) {
                  break label172;
               }

               if (var10000 < 0) {
                  return 90.0F;
               }
            }

            float var20;
            var10000 = (var20 = var5 - 115.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         }

         var10001 = var4;
      }

      label161:
      if (!var10001) {
         if (var10000 > 0) {
            float var21;
            var10000 = (var21 = var5 - 160.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            if (var4) {
               break label161;
            }

            if (var10000 < 0) {
               return 135.0F;
            }
         }

         if (var4) {
            return var5;
         }

         float var22;
         var10000 = (var22 = var5 - 160.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      }

      if (var10000 <= 0) {
         float var23;
         var10000 = (var23 = var5 - -160.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
         var10001 = var4;
         if (var1 > 0L) {
            if (!var4) {
               if (var10000 < 0) {
                  return 180.0F;
               }

               float var24;
               var10000 = (var24 = var5 - -160.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            }

            var10001 = var4;
         }

         label139: {
            label138:
            if (!var10001) {
               if (var10000 > 0) {
                  float var25;
                  var10000 = (var25 = var5 - -115.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                  var10001 = var4;
                  if (var1 < 0L) {
                     break label139;
                  }

                  if (var4) {
                     break label138;
                  }

                  if (var10000 < 0) {
                     return -135.0F;
                  }
               }

               float var26;
               var10000 = (var26 = var5 - -115.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
            }

            var10001 = var4;
         }

         label127:
         if (!var10001) {
            if (var10000 > 0) {
               float var27;
               var10000 = (var27 = var5 - -70.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
               if (var4) {
                  break label127;
               }

               if (var10000 < 0) {
                  return -90.0F;
               }
            }

            if (var4) {
               return var5;
            }

            float var28;
            var10000 = (var28 = var5 - -70.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
         }

         if (var10000 > 0) {
            if (var4) {
               return var5;
            }

            if (var5 < -25.0F) {
               return -45.0F;
            }
         }

         return var3;
      } else {
         return 180.0F;
      }
   }




    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(net.C_475c var1) {
      long var2 = a ^ 63005935773034L;
      long var4 = var2 ^ 63874656424615L;
      long var6 = var2 ^ 135427909863653L;
      long var8 = var2 ^ 61317133670596L;
      long var10000 = -6876501682979913943L;
      boolean var10 = AimBot_47O_.method_45i$aae029aa0a();
      long var10001 = -6876848343849311022L;
      net.minecraft.client.Minecraft var14 = field_43;
      long var10002 = -6876726450414412729L;
      net.minecraft.client.Minecraft var15 = field_43;
      long var10003 = -6876726450414412729L;
      net.minecraft.client.Minecraft var16 = field_43;
      double var90 = var16.field_42P.field_48j - 0.5;
      long var10004 = -6876726450414412729L;
      net.minecraft.client.Minecraft var17 = field_43;
      boolean var11 = var14.field_44Q
         .method_45$4093413a27(var15.field_42P.field_48Q, var90, var17.field_42P.field_42o)
         .method_48$e084f7739d()
         .method_43$aae029aa0a();
      if (!var10) {
         boolean var55 = var11;
         this.field_43P = var11;
         int var75 = this.field_43y - 1;
         var10002 = -6876726450414412729L;
         net.minecraft.client.Minecraft var57 = field_43;
         var10003 = -6875039928994670036L;
         net.minecraft.client.entity.EntityPlayerSP var58 = var57.field_42P;
         long var59 = var8;
         int var60 = var75;
         double[] var56 = net.C_47TT.method_45$f42b969df3(var60, var59, var58);
         if (var11) {
            var10001 = -6874810295456122422L;
            net.minecraft.client.Minecraft var61 = field_43;
            if (var61.field_42Y.field_49 == net.C_47Az.BLOCK) {
               var10001 = -6876726450414412729L;
               net.minecraft.client.Minecraft var62 = field_43;
               if (var62.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43F) {
                  var10001 = -6874810295456122422L;
                  net.minecraft.client.Minecraft var63 = field_43;
                  if (var63.field_42Y.method_49$5730377d31() != null) {
                     if (!var55) {
                        var10002 = -6874810295456122422L;
                        net.minecraft.client.Minecraft var64 = field_43;
                        long var104 = -6878333659091983357L;
                        boolean var65 = this.field_43u;
                        net.C_475c var66 = var1;
                        net.C_47Ij var67 = var64.field_42Y;
                        long var68 = var6;
                        net.C_47XK var69 = this.field_46;
                        var69.method_48$e10de81326(var68, var67, var66, var65);
                        this.field_43u = false;
                     }

                     var10002 = -6878989295949131907L;
                     boolean var70 = true;
                     net.C_475c var71 = var1;
                     var71.method_40$f633c984d8(var70);
                     var10002 = -6879176523787590726L;
                     boolean var72 = false;
                     net.C_475c var73 = var1;
                     var73.method_45$f633c984d8(var72);
                  }
               }
            }
         }
      } else {
         if (var11 && !this.field_43P) {
            long var10005 = -6875389606308361394L;
            long var18 = var4;
            byte var20 = 1;
            byte var21 = 0;
            net.C_47MO var22 = net.C_476q.field_48;
            this.field_43y = var22.method_44$75dd719903(var21, var20, var18);
            var10005 = -6875389606308361394L;
            long var23 = var4;
            byte var25 = 1;
            byte var26 = 0;
            net.C_47MO var27 = net.C_476q.field_48;
            this.field_43n = var27.method_44$75dd719903(var26, var25, var23);
         }

         if (!var11 && this.field_43P) {
            this.field_437 = this.field_43n;
         }

         boolean var12 = (this.field_43y >= 0 || !this.field_43P) && !var11;
         this.field_43P = var11;
         int var74 = this.field_43y - 1;
         var10002 = -6876726450414412729L;
         net.minecraft.client.Minecraft var28 = field_43;
         var10003 = -6875039928994670036L;
         net.minecraft.client.entity.EntityPlayerSP var29 = var28.field_42P;
         long var30 = var8;
         int var32 = var74;
         double[] var13 = net.C_47TT.method_45$f42b969df3(var32, var30, var29);
         if (var11) {
            var10001 = -6876848343849311022L;
            net.minecraft.client.Minecraft var33 = field_43;
            double var77 = var13[0];
            var10003 = -6876726450414412729L;
            net.minecraft.client.Minecraft var34 = field_43;
            if (!var33.field_44Q.method_45$4093413a27(var77, var34.field_42P.field_48j - 1.0, var13[2]).method_48$e084f7739d().method_43$aae029aa0a()) {
               var12 = true;
            }
         }

         if (var11 && this.field_437 > 0) {
            var12 = true;
            this.field_437--;
         }

         var10001 = -6878615534544836292L;
         net.minecraft.client.Minecraft var35 = field_43;
         if (!var35.field_44r.field_45w.method_42$aae029aa0a()) {
            this.field_43u = true;
         }

         var10001 = -6878615534544836292L;
         net.minecraft.client.Minecraft var36 = field_43;
         if (var36.field_44r.field_45w.method_42$aae029aa0a() && this.field_41g) {
            var10001 = -6874862342563957302L;
            net.minecraft.client.Minecraft var37 = field_43;
            if (var37.method_44$aae029aa0a()) {
               var10001 = -6874810295456122422L;
               net.minecraft.client.Minecraft var38 = field_43;
               if (var38.field_42Y != null) {
                  var10001 = -6874810295456122422L;
                  net.minecraft.client.Minecraft var39 = field_43;
                  if (var39.field_42Y.field_49 == net.C_47Az.BLOCK) {
                     var10001 = -6876726450414412729L;
                     net.minecraft.client.Minecraft var40 = field_43;
                     if (var40.field_42P.method_48$ac4db64966() != null) {
                        var10001 = -6876726450414412729L;
                        net.minecraft.client.Minecraft var41 = field_43;
                        if (var41.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43F) {
                           var10001 = -6874810295456122422L;
                           net.minecraft.client.Minecraft var42 = field_43;
                           if (var42.field_42Y.method_49$5730377d31() != null) {
                              label166: {
                                 if (!var12) {
                                    var10001 = -6877156249671809055L;
                                    client.setting.BooleanSetting var43 = this.settingClickPause;
                                    if (var43.method_49$aae029aa0a()) {
                                       break label166;
                                    }
                                 }

                                 var10002 = -6874810295456122422L;
                                 net.minecraft.client.Minecraft var44 = field_43;
                                 long var103 = -6878333659091983357L;
                                 boolean var45 = this.field_43u;
                                 net.C_475c var46 = var1;
                                 net.C_47Ij var47 = var44.field_42Y;
                                 long var48 = var6;
                                 net.C_47XK var50 = this.field_46;
                                 var50.method_48$e10de81326(var48, var47, var46, var45);
                                 this.field_43u = false;
                              }

                              var10002 = -6878989295949131907L;
                              boolean var51 = true;
                              net.C_475c var52 = var1;
                              var52.method_40$f633c984d8(var51);
                              var10002 = -6879176523787590726L;
                              boolean var53 = false;
                              net.C_475c var54 = var1;
                              var54.method_45$f633c984d8(var53);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }







   private double method_40$28b17c71a2(long var1, C_42l var3, float var4) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 99706922993032L;
      int var5 = (int)((var1 ^ 99706922993032L) >>> 32);
      int var6 = (int)((var1 ^ 99706922993032L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      boolean var8 = recovery$indy$2(-741212088228068924L, var1);
      C_47Ij var9 = recovery$indy$3(var5, (short)var6, 1.0F, var7, var4, var3.field_44, -745065157197601081L, var1);
      C_47Ij var10000 = var9;
      if (!var8) {
         if (var9 == null) {
            return 100.0;
         }

         var10000 = var9;
      }

      if (!var8) {
         if (var10000.method_49$5730377d31() == null) {
            return 100.0;
         }

         var10000 = var9;
      }

      C_47tf var13 = var10000.field_45;
      if (!var8) {
         if (var10000.field_45 == null) {
            return 100.0;
         }

         var13 = var9.field_45;
      }

      double var10 = var13.field_41 % 1.0;
      return Math.abs(0.5 - var10);
   }



   private void method_40$4e8b83db3a(long var1, C_472n var3, C_478Q var4, double var5, boolean var7) {
      label77: {
         var1 = a ^ var1;
         boolean var8 = recovery$indy$4(-3821137570284765558L, var1);
         int var10000 = (int) ((var7) ? 1 : 0);
         if (!var8) {
            if ((var7 ? 1 : 0) != 0) {
               double var11;
               var10000 = (var11 = var4.method_40$8abf5c6871() + 0.5 - this.field_430 - var5) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
               if (!var8) {
                  if (var10000 > 0) {
                     this.field_438 = -1;
                     if (var1 < 0L) {
                        return;
                     }

                     if (!var8) {
                        break label77;
                     }
                  }

                  double var12;
                  var10000 = (var12 = var4.method_40$8abf5c6871() + 0.5 + this.field_430 - var5) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               }

               if (var10000 >= 0) {
                  break label77;
               }

               this.field_438 = 1;
               if (var1 < 0L) {
                  return;
               }

               if (!var8) {
                  break label77;
               }
            }

            double var13;
            var10000 = (var13 = var4.method_40$8abf5c6871() + 0.5 + this.field_430 - var5) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
         }

         if (!var8) {
            if (var10000 < 0) {
               this.field_438 = -1;
               if (var1 < 0L) {
                  return;
               }

               if (!var8) {
                  break label77;
               }
            }

            double var14;
            var10000 = (var14 = var4.method_40$8abf5c6871() + 0.5 - this.field_430 - var5) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
         }

         if (var10000 > 0) {
            this.field_438 = 1;
         }
      }

      recovery$indy$5(var3, this.field_438, -3820709826296331559L, var1);
   }




   private void method_44$6724e66524(long var1, net.C_472n var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 49744462252665L;
      long var6 = var1 ^ 15998367295486L;
      long var8 = var1 ^ 75232748427002L;
      long var10 = var1 ^ 22202082742828L;
      long var12 = var1 ^ 43532734865811L;
      long var10001 = var1 ^ 48924229340769L;
      int var14 = (int)((var1 ^ 48924229340769L) >>> 48);
      int var15 = (int)((var1 ^ 48924229340769L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 118345664671827L;
      boolean var19 = recovery$indy$flow$137(9169845289870745849L, var1);
      byte var10000 = ((byte) (recovery$indy$flow$138(this, (short)var14, var15, (char)var16, 9176501561977978716L, var1) ? 1 : 0));
      if (!var19) {
         if ((var10000) != 0) {
            recovery$indy$flow$144(var3, false, 9178332601299112498L, var1);
         }

         net.C_478Q var27 = new net.C_478Q(
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$147(field_43, 9169577504046302103L, var1)).field_48Q,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$150(field_43, 9169577504046302103L, var1)).field_48j,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$153(field_43, 9169577504046302103L, var1)).field_42o
            )
            .method_45$5730377d31();
         boolean var28 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$158(field_43, 9169488613408455426L, var1))
            .method_46$efbf73d2b1(var27)
            .method_48$e084f7739d()
            .method_43$aae029aa0a();
         var10000 = ((byte) (this.field_43a ? 1 : 0));
         if (var1 >= 0L) {
            if (var19) {
               if (this.field_43a != var28) {
                  this.field_43F = -recovery$indy$flow$168(
                     net.C_476q.field_48,
                     recovery$indy$flow$165(this.settingStartDistToBlock, var6, 9171047984617649334L, var1),
                     var12,
                     recovery$indy$flow$167(this.settingStartDistToBlock, var4, 9176722681088372571L, var1),
                     9170082259359949809L,
                     var1
                  );
                  this.field_430 = recovery$indy$flow$175(
                     net.C_476q.field_48,
                     recovery$indy$flow$172(this.settingMoonWalkWideness, var6, 9171047984617649334L, var1),
                     var12,
                     recovery$indy$flow$174(this.settingMoonWalkWideness, var4, 9176722681088372571L, var1),
                     9170082259359949809L,
                     var1
                  );
               }

               this.field_43a = var28;
               var10000 = 0;
            }

            byte var29 = var10000;
            java.util.List var32 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$179(field_43, 9169488613408455426L, var1))
               .method_40$d4a3a06218(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$181(field_43, 9169577504046302103L, var1),
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$183(field_43, 9169577504046302103L, var1)).method_45$6684d3c618().method_47$800791f322(0.0, -1.0, 0.0)
               );
            java.util.Iterator var35 = var32.iterator();
            if (var35.hasNext()) {
               net.C_478i var45 = (net.C_478i)var35.next();
            } else {
               switch (var29) {
                  case 1:
                     recovery$indy$flow$224(
                        this,
                        var8,
                        var3,
                        var27,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$222(field_43, 9169577504046302103L, var1)).field_42o,
                        true,
                        9178214740529313660L,
                        var1
                     );
                     if (var1 > 0L) {
                        if (!var19) {
                           recovery$indy$flow$228(
                              this,
                              var8,
                              var3,
                              var27,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                              false,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$232(
                                 this,
                                 var17,
                                 var3,
                                 var27,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                 true,
                                 9177202481233108829L,
                                 var1
                              );
                              if (!var19) {
                                 recovery$indy$flow$236(
                                    this,
                                    var17,
                                    var3,
                                    var27,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                    false,
                                    9177202481233108829L,
                                    var1
                                 );
                              }
                           }
                        }

                        return;
                     }

                     if (!var19) {
                        recovery$indy$flow$236(
                           this,
                           var17,
                           var3,
                           var27,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                           true,
                           9177202481233108829L,
                           var1
                        );
                     }

                     return;
                  case 2:
                     recovery$indy$flow$228(
                        this,
                        var8,
                        var3,
                        var27,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                        false,
                        9178214740529313660L,
                        var1
                     );
                     if (!var19) {
                        double var48 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q;
                        if (var1 > 0L) {
                           recovery$indy$flow$232(this, var17, var3, var27, var48, true, 9177202481233108829L, var1);
                           if (!var19) {
                              recovery$indy$flow$236(
                                 this,
                                 var17,
                                 var3,
                                 var27,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                 false,
                                 9177202481233108829L,
                                 var1
                              );
                           }

                           return;
                        }

                        recovery$indy$flow$236(this, var17, var3, var27, var48, true, 9177202481233108829L, var1);
                        return;
                     }

                     return;
                  case 3:
                     double var47 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q;
                     if (var1 > 0L) {
                        recovery$indy$flow$232(this, var17, var3, var27, var47, true, 9177202481233108829L, var1);
                        if (!var19) {
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var27,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                        }

                        return;
                     }

                     recovery$indy$flow$236(this, var17, var3, var27, var47, true, 9177202481233108829L, var1);
                     return;
                  case 4:
                     recovery$indy$flow$236(
                        this,
                        var17,
                        var3,
                        var27,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                        false,
                        9177202481233108829L,
                        var1
                     );
                     return;
               }
            }
         } else {
            if (this.field_43a != var19) {
               this.field_43F = -recovery$indy$flow$168(
                  net.C_476q.field_48,
                  recovery$indy$flow$165(this.settingStartDistToBlock, var6, 9171047984617649334L, var1),
                  var12,
                  recovery$indy$flow$167(this.settingStartDistToBlock, var4, 9176722681088372571L, var1),
                  9170082259359949809L,
                  var1
               );
               this.field_430 = recovery$indy$flow$175(
                  net.C_476q.field_48,
                  recovery$indy$flow$172(this.settingMoonWalkWideness, var6, 9171047984617649334L, var1),
                  var12,
                  recovery$indy$flow$174(this.settingMoonWalkWideness, var4, 9176722681088372571L, var1),
                  9170082259359949809L,
                  var1
               );
            }

            this.field_43a = var28;
            boolean var43 = false;
            java.util.List var31 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$179(field_43, 9169488613408455426L, var1))
               .method_40$d4a3a06218(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$181(field_43, 9169577504046302103L, var1),
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$183(field_43, 9169577504046302103L, var1)).method_45$6684d3c618().method_47$800791f322(0.0, -1.0, 0.0)
               );
            java.util.Iterator var34 = var31.iterator();
            if (var34.hasNext()) {
               net.C_478i var44 = (net.C_478i)var34.next();
            }
         }
      } else if ((var10000 != 0) && recovery$indy$flow$139(var10, 9171117576772088641L, var1)) {
         if (((net.C_47oo)recovery$indy$flow$141(field_43, 9176691238704477932L, var1)).field_45w.method_42$aae029aa0a()) {
            recovery$indy$flow$144(var3, false, 9178332601299112498L, var1);
         }

         net.C_478Q var20 = new net.C_478Q(
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$147(field_43, 9169577504046302103L, var1)).field_48Q,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$150(field_43, 9169577504046302103L, var1)).field_48j,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$153(field_43, 9169577504046302103L, var1)).field_42o
            )
            .method_45$5730377d31();
         boolean var21 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$158(field_43, 9169488613408455426L, var1))
            .method_46$efbf73d2b1(var20)
            .method_48$e084f7739d()
            .method_43$aae029aa0a();
         boolean var39 = this.field_43a;
         if (var1 >= 0L) {
            if (var19) {
               if (this.field_43a != var21) {
                  this.field_43F = -recovery$indy$flow$168(
                     net.C_476q.field_48,
                     recovery$indy$flow$165(this.settingStartDistToBlock, var6, 9171047984617649334L, var1),
                     var12,
                     recovery$indy$flow$167(this.settingStartDistToBlock, var4, 9176722681088372571L, var1),
                     9170082259359949809L,
                     var1
                  );
                  this.field_430 = recovery$indy$flow$175(
                     net.C_476q.field_48,
                     recovery$indy$flow$172(this.settingMoonWalkWideness, var6, 9171047984617649334L, var1),
                     var12,
                     recovery$indy$flow$174(this.settingMoonWalkWideness, var4, 9176722681088372571L, var1),
                     9170082259359949809L,
                     var1
                  );
               }

               this.field_43a = var21;
               var39 = false;
            }

            boolean var22 = var39;
            java.util.List var30 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$179(field_43, 9169488613408455426L, var1))
               .method_40$d4a3a06218(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$181(field_43, 9169577504046302103L, var1),
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$183(field_43, 9169577504046302103L, var1)).method_45$6684d3c618().method_47$800791f322(0.0, -1.0, 0.0)
               );
            java.util.Iterator var33 = var30.iterator();
            if (var33.hasNext()) {
               net.C_478i var36 = (net.C_478i)var33.next();
               var39 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$192(field_43, 9169577504046302103L, var1))
                  .method_45$6684d3c618()
                  .method_42$800791f322(-0.3, 0.0, -0.3)
                  .method_47$800791f322(0.0, -1.0, 0.0)
                  .method_49$53fc7ac166(
                     var36.method_42$800791f322(
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$197(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.EAST
                              && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$201(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.WEST
                           ? 0.0
                           : this.field_43F,
                        0.0,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$206(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.NORTH
                              && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$210(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.SOUTH
                           ? 0.0
                           : this.field_43F
                     )
                  );
               if (var1 > 0L) {
                  while (true) {
                     if (var39) {
                        var22 = true;
                        if (var19) {
                           break;
                        }
                     }

                     if (!var33.hasNext()) {
                        break;
                     }

                     var36 = (net.C_478i)var33.next();
                     var39 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$192(field_43, 9169577504046302103L, var1))
                        .method_45$6684d3c618()
                        .method_42$800791f322(-0.3, 0.0, -0.3)
                        .method_47$800791f322(0.0, -1.0, 0.0)
                        .method_49$53fc7ac166(
                           var36.method_42$800791f322(
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$197(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.EAST
                                    && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$201(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.WEST
                                 ? 0.0
                                 : this.field_43F,
                              0.0,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$206(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.NORTH
                                    && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$210(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.SOUTH
                                 ? 0.0
                                 : this.field_43F
                           )
                        );
                  }

                  if (!var22) {
                     switch (net.C_47Ii.field_40[((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$218(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1().ordinal()]) {
                        case 1:
                           recovery$indy$flow$224(
                              this,
                              var8,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$222(field_43, 9169577504046302103L, var1)).field_42o,
                              true,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$228(
                                 this,
                                 var8,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                                 false,
                                 9178214740529313660L,
                                 var1
                              );
                              if (!var19) {
                                 recovery$indy$flow$232(
                                    this,
                                    var17,
                                    var3,
                                    var20,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                    true,
                                    9177202481233108829L,
                                    var1
                                 );
                                 if (!var19) {
                                    recovery$indy$flow$236(
                                       this,
                                       var17,
                                       var3,
                                       var20,
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                       false,
                                       9177202481233108829L,
                                       var1
                                    );
                                 }
                              }
                           }
                           break;
                        case 2:
                           recovery$indy$flow$228(
                              this,
                              var8,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                              false,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$232(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                 true,
                                 9177202481233108829L,
                                 var1
                              );
                              if (!var19) {
                                 recovery$indy$flow$236(
                                    this,
                                    var17,
                                    var3,
                                    var20,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                    false,
                                    9177202481233108829L,
                                    var1
                                 );
                              }
                           }
                           break;
                        case 3:
                           recovery$indy$flow$232(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                              true,
                              9177202481233108829L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$236(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                 false,
                                 9177202481233108829L,
                                 var1
                              );
                           }
                           break;
                        case 4:
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                     }
                  }
               } else {
                  while (!var39 && var33.hasNext()) {
                     var36 = (net.C_478i)var33.next();
                     var39 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$192(field_43, 9169577504046302103L, var1))
                        .method_45$6684d3c618()
                        .method_42$800791f322(-0.3, 0.0, -0.3)
                        .method_47$800791f322(0.0, -1.0, 0.0)
                        .method_49$53fc7ac166(
                           var36.method_42$800791f322(
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$197(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.EAST
                                    && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$201(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.WEST
                                 ? 0.0
                                 : this.field_43F,
                              0.0,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$206(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.NORTH
                                    && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$210(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.SOUTH
                                 ? 0.0
                                 : this.field_43F
                           )
                        );
                  }

                  if (!var22) {
                     switch (net.C_47Ii.field_40[((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$218(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1().ordinal()]) {
                        case 1:
                           recovery$indy$flow$224(
                              this,
                              var8,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$222(field_43, 9169577504046302103L, var1)).field_42o,
                              true,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$236(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                 true,
                                 9177202481233108829L,
                                 var1
                              );
                           }
                           break;
                        case 2:
                           recovery$indy$flow$228(
                              this,
                              var8,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                              false,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$236(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                 true,
                                 9177202481233108829L,
                                 var1
                              );
                           }
                           break;
                        case 3:
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                              true,
                              9177202481233108829L,
                              var1
                           );
                           break;
                        case 4:
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                     }
                  }
               }
            } else if (!var22) {
               switch (net.C_47Ii.field_40[((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$218(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1().ordinal()]) {
                  case 1:
                     recovery$indy$flow$224(
                        this,
                        var8,
                        var3,
                        var20,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$222(field_43, 9169577504046302103L, var1)).field_42o,
                        true,
                        9178214740529313660L,
                        var1
                     );
                     if (var1 > 0L) {
                        if (!var19) {
                           recovery$indy$flow$228(
                              this,
                              var8,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                              false,
                              9178214740529313660L,
                              var1
                           );
                           if (!var19) {
                              recovery$indy$flow$232(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                                 true,
                                 9177202481233108829L,
                                 var1
                              );
                              if (!var19) {
                                 recovery$indy$flow$236(
                                    this,
                                    var17,
                                    var3,
                                    var20,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                    false,
                                    9177202481233108829L,
                                    var1
                                 );
                              }
                           }
                        }

                        return;
                     }

                     if (!var19) {
                        recovery$indy$flow$236(
                           this,
                           var17,
                           var3,
                           var20,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                           true,
                           9177202481233108829L,
                           var1
                        );
                     }

                     return;
                  case 2:
                     recovery$indy$flow$228(
                        this,
                        var8,
                        var3,
                        var20,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                        false,
                        9178214740529313660L,
                        var1
                     );
                     if (!var19) {
                        double var46 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q;
                        if (var1 > 0L) {
                           recovery$indy$flow$232(this, var17, var3, var20, var46, true, 9177202481233108829L, var1);
                           if (!var19) {
                              recovery$indy$flow$236(
                                 this,
                                 var17,
                                 var3,
                                 var20,
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                                 false,
                                 9177202481233108829L,
                                 var1
                              );
                           }

                           return;
                        }

                        recovery$indy$flow$236(this, var17, var3, var20, var46, true, 9177202481233108829L, var1);
                        return;
                     }

                     return;
                  case 3:
                     double var10004 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q;
                     if (var1 > 0L) {
                        recovery$indy$flow$232(this, var17, var3, var20, var10004, true, 9177202481233108829L, var1);
                        if (!var19) {
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                        }

                        return;
                     }

                     recovery$indy$flow$236(this, var17, var3, var20, var10004, true, 9177202481233108829L, var1);
                     return;
                  case 4:
                     recovery$indy$flow$236(
                        this,
                        var17,
                        var3,
                        var20,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                        false,
                        9177202481233108829L,
                        var1
                     );
                     return;
               }
            }
         } else {
            if (this.field_43a != var19) {
               this.field_43F = -recovery$indy$flow$168(
                  net.C_476q.field_48,
                  recovery$indy$flow$165(this.settingStartDistToBlock, var6, 9171047984617649334L, var1),
                  var12,
                  recovery$indy$flow$167(this.settingStartDistToBlock, var4, 9176722681088372571L, var1),
                  9170082259359949809L,
                  var1
               );
               this.field_430 = recovery$indy$flow$175(
                  net.C_476q.field_48,
                  recovery$indy$flow$172(this.settingMoonWalkWideness, var6, 9171047984617649334L, var1),
                  var12,
                  recovery$indy$flow$174(this.settingMoonWalkWideness, var4, 9176722681088372571L, var1),
                  9170082259359949809L,
                  var1
               );
            }

            this.field_43a = var21;
            var39 = false;
            java.util.List var23 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$179(field_43, 9169488613408455426L, var1))
               .method_40$d4a3a06218(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$181(field_43, 9169577504046302103L, var1),
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$183(field_43, 9169577504046302103L, var1)).method_45$6684d3c618().method_47$800791f322(0.0, -1.0, 0.0)
               );
            java.util.Iterator var24 = var23.iterator();
            if (var24.hasNext()) {
               net.C_478i var25 = (net.C_478i)var24.next();
               if (!((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$192(field_43, 9169577504046302103L, var1))
                  .method_45$6684d3c618()
                  .method_42$800791f322(-0.3, 0.0, -0.3)
                  .method_47$800791f322(0.0, -1.0, 0.0)
                  .method_49$53fc7ac166(
                     var25.method_42$800791f322(
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$197(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.EAST
                              && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$201(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.WEST
                           ? 0.0
                           : this.field_43F,
                        0.0,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$206(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.NORTH
                              && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$210(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1() != net.C_484.SOUTH
                           ? 0.0
                           : this.field_43F
                     )
                  )) {
                  switch (net.C_47Ii.field_40[((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$218(field_43, 9169577504046302103L, var1)).method_40$89b19fafe1().ordinal()]) {
                     case 1:
                        recovery$indy$flow$224(
                           this,
                           var8,
                           var3,
                           var20,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$222(field_43, 9169577504046302103L, var1)).field_42o,
                           true,
                           9178214740529313660L,
                           var1
                        );
                        if (!var19) {
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                        }
                        break;
                     case 2:
                        recovery$indy$flow$228(
                           this,
                           var8,
                           var3,
                           var20,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$226(field_43, 9169577504046302103L, var1)).field_42o,
                           false,
                           9178214740529313660L,
                           var1
                        );
                        if (!var19) {
                           recovery$indy$flow$236(
                              this,
                              var17,
                              var3,
                              var20,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                              false,
                              9177202481233108829L,
                              var1
                           );
                        }
                        break;
                     case 3:
                        recovery$indy$flow$236(
                           this,
                           var17,
                           var3,
                           var20,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$230(field_43, 9169577504046302103L, var1)).field_48Q,
                           true,
                           9177202481233108829L,
                           var1
                        );
                        break;
                     case 4:
                        recovery$indy$flow$236(
                           this,
                           var17,
                           var3,
                           var20,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$234(field_43, 9169577504046302103L, var1)).field_48Q,
                           false,
                           9177202481233108829L,
                           var1
                        );
                  }
               }
            }
         }
      }
   }






   private void method_48$05bd94f678(C_472n var1, long var2) {
      net.minecraft.client.Minecraft var12;
      augustus.recovered.modules.legit.AutoEagle_47C6 var15;
      var2 = a ^ var2;
      long var4 = var2 ^ 125047304807491L;
      byte var6 = (byte) ((recovery$indy$38(-3951169378025865896L, var2)) ? 1 : 0);
      int var10000 = (int) ((recovery$indy$39(var4, -3951557568438418130L, var2)) ? 1 : 0);
      if (var6 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = 0;
      }

      int var7 = var10000;
      List var8 = recovery$indy$40(field_43, -3949669223963521683L, var2)
         .method_40$d4a3a06218(
            recovery$indy$41(field_43, -3949789210701433352L, var2),
            recovery$indy$42(field_43, -3949789210701433352L, var2).method_45$6684d3c618().method_47$800791f322(0.0, -1.0, 0.0)
         );
      Iterator var9 = var8.iterator();

      int var16;
      label143: {
         label142: {
            label141: {
               label140: {
                  label153: {
                     while (true) {
                        label136:
                        if (var9.hasNext()) {
                           C_478i var10 = (C_478i)var9.next();
                           var12 = field_43;
                           if (var6 != 0) {
                              break label153;
                           }

                           C_478i var13 = recovery$indy$43(field_43, -3949789210701433352L, var2)
                              .method_45$6684d3c618()
                              .method_42$800791f322(-0.3, 0.0, -0.3)
                              .method_47$800791f322(0.0, -1.0, 0.0);
                           double var10002 = Math.abs(recovery$indy$44(field_43, -3949789210701433352L, var2).field_48s);
                           if (var6 == 0) {
                              var10002 = var10002 > 0.02 ? this.field_43F : 0.0;
                           }

                           double var10004 = Math.abs(recovery$indy$45(field_43, -3949789210701433352L, var2).field_487);
                           if (var6 == 0) {
                              var10004 = var10004 > 0.02 ? this.field_43F : 0.0;
                           }

                           label155: {
                              var10000 = (int) ((var13.method_49$53fc7ac166(var10.method_42$800791f322(var10002, 0.0, var10004))) ? 1 : 0);
                              if (var2 >= 0L) {
                                 if (var6 == 0) {
                                    if (var10000 == 0) {
                                       break label155;
                                    }

                                    var10000 = 1;
                                 }

                                 var7 = var10000;
                                 var10000 = var6;
                              }

                              if (var2 < 0L) {
                                 break;
                              }

                              if (var10000 == 0) {
                                 break label136;
                              }
                           }

                           if (var6 == 0) {
                              continue;
                           }
                        }

                        var10000 = (int) ((recovery$indy$46(var1, -3950215534493193547L, var2)) ? 1 : 0);
                        if (var2 <= 0L) {
                           break label140;
                        }
                        break;
                     }

                     label115: {
                        label114:
                        if (var6 == 0) {
                           label112: {
                              if (var10000 != 0) {
                                 var10000 = var7;
                                 var16 = var6;
                                 if (var2 <= 0L) {
                                    break label115;
                                 }

                                 if (var6 != 0) {
                                    break label114;
                                 }

                                 if (var7 == 0) {
                                    recovery$indy$47(var1, true, -3949488284165626787L, var2);
                                    var15 = this;
                                    var16 = 0;
                                    if (var2 < 0L) {
                                       break label112;
                                    }

                                    this.field_43U = 0;
                                    if (var6 == 0) {
                                       break label141;
                                    }
                                 }
                              }

                              var15 = this;
                              var16 = var6;
                           }

                           if (var2 <= 0L) {
                              break label143;
                           }

                           if (var16 != 0) {
                              break label142;
                           }

                           var10000 = var15.field_43U;
                        }

                        var16 = recovery$indy$48(this.settingMinSneakTicks, -3947464559525633831L, var2);
                     }

                     if (var10000 < var16) {
                        break label141;
                     }

                     var12 = field_43;
                  }

                  var10000 = (int) ((recovery$indy$49(var12, -3948164268133400445L, var2).field_45w.method_42$aae029aa0a()) ? 1 : 0);
               }

               if (var10000 != 0) {
                  recovery$indy$50(var1, false, -3949488284165626787L, var2);
               }
            }

            var15 = this;
         }

         var16 = var15.field_43U + 1;
      }

      var15.field_43U = var16;
   }




   private double method_48$7b6e9f716f(C_42l var1) {
      long var2 = a ^ 138088702154692L;
      long var10002 = 1313027309427596219L;
      C_47S6 var4 = ClientGlobals.field_46;
      return Math.abs(var1.field_44 - var4.method_44$4f8050086d().field_41);
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 38915897854122L;
      long var3 = var1 ^ 15653263067312L;
      long var10002 = -8263436177577465486L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("UnLegit");
   }



   private double method_48$5adda97157(float var1, C_42l var2) {
      long var3 = a ^ 73386219743643L;
      long var5 = var3 ^ 70279465065532L;
      long var10004 = 3204498390341402783L;
      float var7 = var1;
      C_42l var8 = var2;
      long var9 = var5;
      AutoEagle_47C6 var11 = this;
      return var11.method_40$28b17c71a2(var9, var8, var7);
   }



   public void method_48$c945181dab(long var1, C_47VU var3) {
      AutoEagle_47C6 var25;
      long var4 = var1 ^ 114453840274235L;
      long var10001 = var1 ^ 53887829849790L;
      int var6 = (int)((var1 ^ 53887829849790L) >>> 48);
      int var7 = (int)((var1 ^ 53887829849790L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var10000 = -1811926809682019998L;
      boolean var9 = AimBot_47O_.method_45i$aae029aa0a();
      var25 = this;
      label78:
      if (var9) {
         long var10002 = -1812409991316684039L;
         long var13 = var4;
         ModeSetting var15 = this.settingMode;
         label76:
         if (var15.method_46$5f9dc63072(var13).equals(recovery$indy$51(21918, 2497858376097409218L ^ var1))) {
            var25 = this;
            if (!var9) {
               break label78;
            }

            int var26 = (int) ((this.field_41M) ? 1 : 0);
            if (var1 >= 0L) {
               if (!this.field_41M) {
                  break label76;
               }

               long var27 = -1818906090791429104L;
               Client var28 = Client.method_44$fbc0c0be91();
               var10001 = -1811437893832068777L;
               Client var16 = var28;
               float var35;
               var26 = (var35 = var16.method_45$03ec613b6f().field_48 - 70.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
            }

            boolean var30 = var9;
            if (var1 > 0L) {
               if (var9) {
                  if (var26 <= 0) {
                     break label76;
                  }

                  char var31 = (char)var6;
                  char var10004 = (char)var8;
                  long var10005 = -1810582996650252827L;
                  char var17 = var10004;
                  AutoEagle_47C6 var18 = this;
                  int var19 = var7;
                  char var20 = var31;
                  C_47S6 var21 = ClientGlobals.field_46;
                  var26 = (int) ((var21.method_49$dc3f815dad(var20, var19, var18, var17)) ? 1 : 0);
               }

               var30 = var9;
            }

            if (var30) {
               if (var26 == 0) {
                  break label76;
               }

               var25 = this;
               if (!var9) {
                  break label78;
               }

               var10001 = -1818307603448856150L;
               BooleanSetting var22 = this.settingSilentRotation;
               var26 = (int) ((var22.method_49$aae029aa0a()) ? 1 : 0);
            }

            if (var26 == 0) {
               int var10 = (int)(System.currentTimeMillis() - this.field_47);
               double var11 = (double)this.field_43p / this.field_42 * var10;
               if (var1 <= 0L) {
                  return;
               }

               var25 = this;
               if (!var9) {
                  break label78;
               }

               if (this.field_43p != 0) {
                  int var33 = (int)var11;
                  var10002 = -1818482697861908514L;
                  int var23 = var33;
                  C_47VU var24 = var3;
                  var24.method_49$d00df7729d(var23);
               }
            }
         }

         var25 = this;
      }

      var25.field_47 = System.currentTimeMillis();
   }




   private void method_48$4e8b83db3a(long var1, C_472n var3, C_478Q var4, double var5, boolean var7) {
      label77: {
         var1 = a ^ var1;
         boolean var8 = recovery$indy$52(-6029835643365517277L, var1);
         int var10000 = (int) ((var7) ? 1 : 0);
         if (!var8) {
            if ((var7 ? 1 : 0) != 0) {
               double var11;
               var10000 = (var11 = var4.method_47$8abf5c6871() + 0.5 - this.field_430 - var5) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
               if (!var8) {
                  if (var10000 > 0) {
                     this.field_438 = -1;
                     if (var1 <= 0L) {
                        return;
                     }

                     if (!var8) {
                        break label77;
                     }
                  }

                  double var12;
                  var10000 = (var12 = var4.method_47$8abf5c6871() + 0.5 + this.field_430 - var5) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               }

               if (var10000 >= 0) {
                  break label77;
               }

               this.field_438 = 1;
               if (var1 < 0L) {
                  return;
               }

               if (!var8) {
                  break label77;
               }
            }

            double var13;
            var10000 = (var13 = var4.method_47$8abf5c6871() + 0.5 + this.field_430 - var5) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
         }

         if (!var8) {
            if (var10000 < 0) {
               this.field_438 = -1;
               if (var1 <= 0L) {
                  return;
               }

               if (!var8) {
                  break label77;
               }
            }

            double var14;
            var10000 = (var14 = var4.method_47$8abf5c6871() + 0.5 - this.field_430 - var5) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
         }

         if (var10000 > 0) {
            this.field_438 = 1;
         }
      }

      recovery$indy$53(var3, this.field_438, -6029418946033081232L, var1);
   }




   private void method_49$05bd94f678(C_472n var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 89452547800794L;
      boolean var6 = recovery$indy$54(-3190922523179201521L, var2);
      byte var10000 = (byte) ((recovery$indy$55(var4, -3193017284482048073L, var2)) ? 1 : 0);
      if (var6) {
         if (var10000 == 0) {
            return;
         }

         float var8;
         var10000 = (byte)((var8 = recovery$indy$57(recovery$indy$56(-3193935620990031491L, var2), -3192678162055297990L, var2).field_48 - 70.0F) == 0.0F
            ? 0
            : (var8 < 0.0F ? -1 : 1));
      }

      if (var10000 > 0) {
         recovery$indy$58(var1, false, -3194818273018986812L, var2);
      }
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 55259535637076L;
      long var3 = var1 ^ 34197663529550L;
      long var10000 = -23686277656753191L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -23518874903553140L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("UnLegit");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_47$05bd94f678(net.C_472n var1, long var2) {
        augustus.recovered.modules.legit.AutoEagle_47C6 var159;
        augustus.recovered.modules.legit.AutoEagle_47C6 var160;
        augustus.recovered.modules.legit.AutoEagle_47C6 var162;
        augustus.recovered.modules.legit.AutoEagle_47C6 var164;
        augustus.recovered.modules.legit.AutoEagle_47C6 var165;
        augustus.recovered.modules.legit.AutoEagle_47C6 var167;
        int var169;
        int var170;
        int var171;
        int var175;
        int var176;
        int var177;
      long var4 = var2 ^ 117306294840811L;
      long var6 = var2 ^ 64939488546442L;
      long var8 = var2 ^ 80274582388844L;
      long var10 = var2 ^ 30710968521747L;
      long var12 = var2 ^ 74807535967538L;
      long var14 = var2 ^ 138976538206844L;
      long var16 = var2 ^ 105661702243841L;
      long var10001 = var2 ^ 118685084133875L;
      int var18 = (int)((var2 ^ 118685084133875L) >>> 48);
      int var19 = (int)((var2 ^ 118685084133875L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      byte var21 = ((byte) (AimBot_47O_.method_45g$aae029aa0a() ? 1 : 0));
      if (var21 == 0) {
         client.setting.BooleanSetting var24 = this.settingOnlyWhileSneak;
         if (!var24.method_49$aae029aa0a()) {
            boolean var25 = true;
            net.C_472n var26 = var1;
            var26.method_43$f633c984d8(var25);
         }

         net.C_472n var27 = var1;
         this.field_41M = var27.method_47$aae029aa0a();
         client.setting.BooleanSetting var76 = this.settingFastPlace;
         boolean var174 = var76.method_49$aae029aa0a();
         if (var2 > 0L) {
            label750: {
               label908: {
                  if (var21 == 0) {
                     if (!var174) {
                        break label908;
                     }

                     net.C_472n var77 = var1;
                     var174 = var77.method_47$aae029aa0a();
                  }

                  if (var21 != 0) {
                     break label750;
                  }

                  if (!var174) {
                     long var80 = var12;
                     client.setting.ModeSetting var83 = this.settingMode;
                     var174 = var83.method_46$5f9dc63072(var80).equals("MoonWalk");
                     if (var21 == 0) {
                        if (!var174) {
                           break label908;
                        }

                        short var183 = (short)var18;
                        char var84 = (char)var20;
                        int var85 = var19;
                        short var86 = var183;
                        AutoEagle_47C6 var87 = this;
                        var174 = var87.method_45F$e9830c5930(var86, var85, var84);
                     }

                     if (var21 != 0) {
                        break label750;
                     }

                     if (!var174) {
                        break label908;
                     }
                  }

                  var174 = true;
                  break label750;
               }

               var174 = false;
            }

            byte var166;
            label731: {
               label910: {
                  label911: {
                     this.field_41g = var174;
                     net.C_472n var90 = var1;
                     var166 = ((byte) (var90.method_47$aae029aa0a() ? 1 : 0));
                     if (var21 == 0) {
                        if (var166 != 0) {
                           break label911;
                        }

                        client.setting.BooleanSetting var93 = this.settingOnlyWhileSneak;
                        var166 = ((byte) (var93.method_49$aae029aa0a() ? 1 : 0));
                     }

                     if (var21 != 0) {
                        break label731;
                     }

                     if (var166 != 0) {
                        break label910;
                     }
                  }

                  long var98 = var12;
                  client.setting.ModeSetting var103 = this.settingMode;
                  String var73 = var103.method_46$5f9dc63072(var98);
                  byte var75 = -1;
                  switch (var73.hashCode()) {
                     case -231785334:
                        if (var73.equals("MoonWalk")) {
                           var75 = 0;
                           if (var21 != 0 && var73.equals("Eagle")) {
                              var75 = 1;
                              if (var21 != 0) {
                                 var166 = ((byte) (var73.equals("UnLegit") ? 1 : 0));
                                 if (var21 != 0) {
                                    break;
                                 }

                                 if (var166 != 0) {
                                    var75 = 2;
                                 }
                              }
                           }
                        }

                        var166 = var75;
                        break;
                     case 66715108:
                        if (var73.equals("Eagle")) {
                           var75 = 1;
                           if (var21 != 0) {
                              var166 = ((byte) (var73.equals("UnLegit") ? 1 : 0));
                              if (var21 != 0) {
                                 break;
                              }

                              if (var166 != 0) {
                                 var75 = 2;
                              }
                           }
                        }

                        var166 = var75;
                        break;
                     case 1350907008:
                        var166 = ((byte) (var73.equals("UnLegit") ? 1 : 0));
                        if (var21 == 0) {
                           if (var166 != 0) {
                              var75 = 2;
                           }

                           var166 = var75;
                        }
                        break;
                     default:
                        var166 = var75;
                  }

                  if (var21 != 0) {
                     break label731;
                  }

                  switch (var166) {
                     case 0:
                        net.C_472n var104 = var1;
                        long var105 = var14;
                        AutoEagle_47C6 var106 = this;
                        var106.method_44$6724e66524(var105, var104);
                        if (var21 != 0) {
                           long var187 = 6397531291544468856L;
                           long var109 = var10;
                           net.C_472n var112 = var1;
                           AutoEagle_47C6 var115 = this;
                           var115.method_48$05bd94f678(var112, var109);
                           if (var21 != 0) {
                              recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                           }
                        }
                        break;
                     case 1:
                        long var186 = 6397531291544468856L;
                        long var108 = var10;
                        net.C_472n var111 = var1;
                        AutoEagle_47C6 var114 = this;
                        var114.method_48$05bd94f678(var111, var108);
                        if (var21 != 0) {
                           recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                        }
                        break;
                     case 2:
                        recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                  }
               }

               net.C_472n var120 = var1;
               var166 = ((byte) (var120.method_47$aae029aa0a() ? 1 : 0));
            }

            label701: {
               label700: {
                  if (var21 == 0) {
                     if (var166 != 0) {
                        break label700;
                     }

                     var166 = ((byte) (this.field_43v ? 1 : 0));
                  }

                  if (var166 != 0) {
                     var167 = this;
                     if (var21 != 0) {
                        break label701;
                     }

                     long var123 = var12;
                     client.setting.ModeSetting var126 = this.settingMode;
                     if (var126.method_46$5f9dc63072(var123).equals("Eagle")) {
                        net.C_47MO var179 = net.C_476q.field_48;
                        long var129 = var8;
                        net.C_47TU var132 = this.settingStartDistToBlock;
                        double var184 = var132.method_41$474dfaa627(var129);
                        long var135 = var4;
                        net.C_47TU var138 = this.settingStartDistToBlock;
                        double var141 = var138.method_43$474dfaa627(var135);
                        long var144 = var16;
                        double var147 = var184;
                        net.C_47MO var150 = var179;
                        this.field_43F = -var150.method_49$1e515b636c(var147, var144, var141);
                        client.setting.RangeSetting var153 = this.settingMinSneakTicks;
                        var153.method_43$fedcb3e4d3();
                     }
                  }
               }

               var167 = this;
            }

            net.C_472n var158 = var1;
            var167.field_43v = var158.method_47$aae029aa0a();
         } else {
            label811:
            if (var21 == 0) {
               if (!var174) {
                  long var79 = var12;
                  client.setting.ModeSetting var82 = this.settingMode;
                  var174 = var82.method_46$5f9dc63072(var79).equals("MoonWalk");
                  if (var21 != 0) {
                     break label811;
                  }

                  if (!var174) {
                     var174 = false;
                     break label811;
                  }
               }

               var174 = true;
            }

            this.field_41g = var174;
            net.C_472n var89 = var1;
            byte var163 = ((byte) (var89.method_47$aae029aa0a() ? 1 : 0));
            if (var2 >= 0L) {
               label781: {
                  label780: {
                     label913: {
                        if (var21 == 0) {
                           if (var163 != 0) {
                              break label913;
                           }

                           client.setting.BooleanSetting var92 = this.settingOnlyWhileSneak;
                           var163 = ((byte) (var92.method_49$aae029aa0a() ? 1 : 0));
                        }

                        if (var21 != 0) {
                           break label780;
                        }

                        if (var163 != 0) {
                           net.C_472n var119 = var1;
                           var163 = ((byte) (var119.method_47$aae029aa0a() ? 1 : 0));
                           break label780;
                        }
                     }

                     long var97 = var12;
                     client.setting.ModeSetting var102 = this.settingMode;
                     String var72 = var102.method_46$5f9dc63072(var97);
                     byte var74 = -1;
                     switch (var72.hashCode()) {
                        case -231785334:
                           if (var72.equals("MoonWalk")) {
                              var74 = 0;
                              if (var21 != 0) {
                                 var163 = var21;
                                 var177 = var21;
                                 break label781;
                              }
                           }

                           var163 = var74;
                           var177 = var21;
                           break label781;
                        case 66715108:
                           if (var72.equals("Eagle")) {
                              var163 = var21;
                              var177 = var21;
                           } else {
                              var163 = var74;
                              var177 = var21;
                           }
                           break label781;
                        case 1350907008:
                           var163 = ((byte) (var72.equals("UnLegit") ? 1 : 0));
                           var177 = var21;
                           break label781;
                        default:
                           var163 = var74;
                           var177 = var21;
                           break label781;
                     }
                  }

                  var177 = var21;
               }

               label763: {
                  label762: {
                     if (var177 == 0) {
                        if (var163 != 0) {
                           break label762;
                        }

                        var163 = ((byte) (this.field_43v ? 1 : 0));
                     }

                     if (var163 != 0) {
                        var165 = this;
                        if (var21 != 0) {
                           break label763;
                        }

                        long var122 = var12;
                        client.setting.ModeSetting var125 = this.settingMode;
                        if (var125.method_46$5f9dc63072(var122).equals("Eagle")) {
                           net.C_47MO var178 = net.C_476q.field_48;
                           long var128 = var8;
                           net.C_47TU var131 = this.settingStartDistToBlock;
                           double var182 = var131.method_41$474dfaa627(var128);
                           long var134 = var4;
                           net.C_47TU var137 = this.settingStartDistToBlock;
                           double var140 = var137.method_43$474dfaa627(var134);
                           long var143 = var16;
                           double var146 = var182;
                           net.C_47MO var149 = var178;
                           this.field_43F = -var149.method_49$1e515b636c(var146, var143, var140);
                           client.setting.RangeSetting var152 = this.settingMinSneakTicks;
                           var152.method_43$fedcb3e4d3();
                        }
                     }
                  }

                  var165 = this;
               }

               net.C_472n var157 = var1;
               var165.field_43v = var157.method_47$aae029aa0a();
            } else {
               label802: {
                  if (var21 == 0) {
                     if (var163 == 0) {
                        long var96 = var12;
                        client.setting.ModeSetting var101 = this.settingMode;
                        String var71 = var101.method_46$5f9dc63072(var96);
                        byte var23 = -1;
                        switch (var71.hashCode()) {
                           case -231785334:
                              if (var71.equals("MoonWalk")) {
                                 var23 = 0;
                                 if (var21 != 0) {
                                    var163 = var21;
                                    var175 = var21;
                                    break label802;
                                 }
                              }

                              var163 = var23;
                              var175 = var21;
                              break label802;
                           case 66715108:
                              if (var71.equals("Eagle")) {
                                 var163 = var21;
                                 var175 = var21;
                              } else {
                                 var163 = var23;
                                 var175 = var21;
                              }
                              break label802;
                           case 1350907008:
                              var163 = ((byte) (var71.equals("UnLegit") ? 1 : 0));
                              var175 = var21;
                              break label802;
                           default:
                              var163 = var23;
                              var175 = var21;
                              break label802;
                        }
                     }

                     net.C_472n var118 = var1;
                     var163 = ((byte) (var118.method_47$aae029aa0a() ? 1 : 0));
                  }

                  var175 = var21;
               }

               label791: {
                  label790: {
                     if (var175 == 0) {
                        if (var163 != 0) {
                           break label790;
                        }

                        var163 = ((byte) (this.field_43v ? 1 : 0));
                     }

                     if (var163 != 0) {
                        var164 = this;
                        var176 = var21;
                        break label791;
                     }
                  }

                  var164 = this;
                  net.C_472n var156 = var1;
                  var176 = ((var156.method_47$aae029aa0a()) ? 1 : 0);
               }

               var164.field_43v = (boolean)((((int) (var176)) & 1) != 0);
            }
         }
      } else {
         client.setting.BooleanSetting var28 = this.settingFastPlace;
         boolean var168 = var28.method_49$aae029aa0a();
         if (var2 > 0L) {
            label855: {
               label915: {
                  if (var21 == 0) {
                     if (!var168) {
                        break label915;
                     }

                     net.C_472n var29 = var1;
                     var168 = var29.method_47$aae029aa0a();
                  }

                  if (var21 != 0) {
                     break label855;
                  }

                  if (!var168) {
                     long var78 = var12;
                     client.setting.ModeSetting var81 = this.settingMode;
                     var168 = var81.method_46$5f9dc63072(var78).equals("MoonWalk");
                     if (var21 == 0) {
                        if (!var168) {
                           break label915;
                        }

                        short var180 = (short)var18;
                        char var33 = (char)var20;
                        int var34 = var19;
                        short var35 = var180;
                        AutoEagle_47C6 var36 = this;
                        var168 = var36.method_45F$e9830c5930(var35, var34, var33);
                     }

                     if (var21 != 0) {
                        break label855;
                     }

                     if (!var168) {
                        break label915;
                     }
                  }

                  var168 = true;
                  break label855;
               }

               var168 = false;
            }

            int var161;
            label836: {
               label917: {
                  label918: {
                     this.field_41g = var168;
                     net.C_472n var88 = var1;
                     var161 = ((int) (var88.method_47$aae029aa0a() ? 1 : 0));
                     if (var21 == 0) {
                        if (var161 != 0) {
                           break label918;
                        }

                        client.setting.BooleanSetting var91 = this.settingOnlyWhileSneak;
                        var161 = ((int) (var91.method_49$aae029aa0a() ? 1 : 0));
                     }

                     if (var21 != 0) {
                        break label836;
                     }

                     if (var161 != 0) {
                        break label917;
                     }
                  }

                  long var95 = var12;
                  client.setting.ModeSetting var100 = this.settingMode;
                  String var70 = var100.method_46$5f9dc63072(var95);
                  var161 = var70.hashCode();
                  if (var21 != 0) {
                     break label836;
                  }

                  switch (var161) {
                     case 0:
                        net.C_472n var42 = var1;
                        long var43 = var14;
                        AutoEagle_47C6 var45 = this;
                        var45.method_44$6724e66524(var43, var42);
                        if (var21 != 0) {
                           long var185 = 6397531291544468856L;
                           long var107 = var10;
                           net.C_472n var110 = var1;
                           AutoEagle_47C6 var113 = this;
                           var113.method_48$05bd94f678(var110, var107);
                           if (var21 != 0) {
                              recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                           }
                        }
                        break;
                     case 1:
                        long var10003 = 6397531291544468856L;
                        long var46 = var10;
                        net.C_472n var48 = var1;
                        AutoEagle_47C6 var49 = this;
                        var49.method_48$05bd94f678(var48, var46);
                        if (var21 != 0) {
                           recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                        }
                        break;
                     case 2:
                        recovery$indy$flow$394(this, var1, var6, 6400183315122455173L, var2);
                  }
               }

               net.C_472n var117 = var1;
               var161 = ((int) (var117.method_47$aae029aa0a() ? 1 : 0));
            }

            label821: {
               if (var21 == 0) {
                  if (var161 == 0) {
                     var162 = this;
                     break label821;
                  }
               } else if (var161 != 0) {
                  var162 = this;
                  if (var21 != 0) {
                     break label821;
                  }

                  long var121 = var12;
                  client.setting.ModeSetting var124 = this.settingMode;
                  if (var124.method_46$5f9dc63072(var121).equals("Eagle")) {
                     net.C_47MO var173 = net.C_476q.field_48;
                     long var127 = var8;
                     net.C_47TU var130 = this.settingStartDistToBlock;
                     double var181 = var130.method_41$474dfaa627(var127);
                     long var133 = var4;
                     net.C_47TU var136 = this.settingStartDistToBlock;
                     double var139 = var136.method_43$474dfaa627(var133);
                     long var142 = var16;
                     double var145 = var181;
                     net.C_47MO var148 = var173;
                     this.field_43F = -var148.method_49$1e515b636c(var145, var142, var139);
                     client.setting.RangeSetting var151 = this.settingMinSneakTicks;
                     var151.method_43$fedcb3e4d3();
                  }
               }

               var162 = this;
            }

            net.C_472n var155 = var1;
            var162.field_43v = var155.method_47$aae029aa0a();
         } else {
            label902:
            if (var21 == 0) {
               if (!var168) {
                  long var30 = var12;
                  client.setting.ModeSetting var32 = this.settingMode;
                  var168 = var32.method_46$5f9dc63072(var30).equals("MoonWalk");
                  if (var21 != 0) {
                     break label902;
                  }

                  if (!var168) {
                     var168 = false;
                     break label902;
                  }
               }

               var168 = true;
            }

            this.field_41g = var168;
            net.C_472n var37 = var1;
            int var10000 = ((int) (var37.method_47$aae029aa0a() ? 1 : 0));
            if (var2 >= 0L) {
               label878: {
                  label877: {
                     label920: {
                        if (var21 == 0) {
                           if (var10000 != 0) {
                              break label920;
                           }

                           client.setting.BooleanSetting var38 = this.settingOnlyWhileSneak;
                           var10000 = ((int) (var38.method_49$aae029aa0a() ? 1 : 0));
                        }

                        if (var21 != 0) {
                           break label877;
                        }

                        if (var10000 != 0) {
                           net.C_472n var116 = var1;
                           var10000 = ((int) (var116.method_47$aae029aa0a() ? 1 : 0));
                           break label877;
                        }
                     }

                     long var94 = var12;
                     client.setting.ModeSetting var99 = this.settingMode;
                     String var69 = var99.method_46$5f9dc63072(var94);
                     var10000 = var69.hashCode();
                     var171 = var21;
                     break label878;
                  }

                  var171 = var21;
               }

               label865: {
                  if (var171 == 0) {
                     if (var10000 == 0) {
                        var160 = this;
                        break label865;
                     }
                  } else if (var10000 != 0) {
                     var160 = this;
                     if (var21 != 0) {
                        break label865;
                     }

                     long var51 = var12;
                     client.setting.ModeSetting var53 = this.settingMode;
                     if (var53.method_46$5f9dc63072(var51).equals("Eagle")) {
                        net.C_47MO var172 = net.C_476q.field_48;
                        long var54 = var8;
                        net.C_47TU var56 = this.settingStartDistToBlock;
                        double var10002 = var56.method_41$474dfaa627(var54);
                        long var57 = var4;
                        net.C_47TU var59 = this.settingStartDistToBlock;
                        double var60 = var59.method_43$474dfaa627(var57);
                        long var62 = var16;
                        double var64 = var10002;
                        net.C_47MO var66 = var172;
                        this.field_43F = -var66.method_49$1e515b636c(var64, var62, var60);
                        client.setting.RangeSetting var67 = this.settingMinSneakTicks;
                        var67.method_43$fedcb3e4d3();
                     }
                  }

                  var160 = this;
               }

               net.C_472n var154 = var1;
               var160.field_43v = var154.method_47$aae029aa0a();
            } else {
               label893: {
                  if (var21 == 0) {
                     if (var10000 == 0) {
                        long var39 = var12;
                        client.setting.ModeSetting var41 = this.settingMode;
                        String var22 = var41.method_46$5f9dc63072(var39);
                        var10000 = var22.hashCode();
                        var169 = var21;
                        break label893;
                     }

                     net.C_472n var50 = var1;
                     var10000 = ((int) (var50.method_47$aae029aa0a() ? 1 : 0));
                  }

                  var169 = var21;
               }

               label887: {
                  label886: {
                     if (var169 == 0) {
                        if (var10000 == 0) {
                           var159 = this;
                           break label886;
                        }
                     } else if (var10000 != 0) {
                        var159 = this;
                        var170 = var21;
                        break label887;
                     }

                     var159 = this;
                  }

                  net.C_472n var68 = var1;
                  var170 = ((var68.method_47$aae029aa0a()) ? 1 : 0);
               }

               var159.field_43v = (boolean)((((int) (var170)) & 1) != 0);
            }
         }
      }
   }







   private boolean method_455$aae029aa0a() {
      long var1 = a ^ 123815699547281L;
      long var3 = var1 ^ 103097630311563L;
      long var10002 = 101669002285983049L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("MoonWalk");
   }



   private boolean method_45S$aae029aa0a() {
      long var1 = a ^ 135363966517490L;
      long var3 = var1 ^ 94853250154728L;
      long var10002 = -4248520713112821462L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Eagle");
   }



   private boolean method_45F$e9830c5930(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$60(-806496033315067018L, var4);
      float var7;
      int var10000 = (var7 = recovery$indy$61(field_43, -806153420571326440L, var4).field_48z - 81.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      if (var6) {
         if (var10000 >= 0) {
            return false;
         }

         double var8;
         var10000 = (var8 = recovery$indy$62(field_43, -806153420571326440L, var4).field_48z - 79.8) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      }

      return (boolean)(!var6 ? var10000 : var10000 > 0);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$63(this, 7, var3, -7102776020483001409L, var1);
      recovery$indy$64(this, 21, var3, -7102776020483001409L, var1);
      recovery$indy$65(this, 40, var3, -7102776020483001409L, var1);
      recovery$indy$66(this, 19, var3, -7102776020483001409L, var1);
      recovery$indy$67(this, 29, var3, -7102776020483001409L, var1);
   }



   private boolean method_45J$aae029aa0a() {
      long var1 = a ^ 27879465097696L;
      long var3 = var1 ^ 57189351217658L;
      long var10002 = 2024467727732422712L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("UnLegit");
   }



   public void method_40v$e45a9973e5(long var1) {
      if (this.field_41r != null) {
         recovery$indy$68(field_43, this.field_41r, -3573361837409118411L, var1);
      }
   }



   private boolean method_45l$aae029aa0a() {
      long var1 = a ^ 90077865905571L;
      long var3 = var1 ^ 137115695893945L;
      long var10000 = 602561896800402478L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = 601650616585549908L;
      ModeSetting var6 = this.settingDCPSMode;
      boolean var10 = var6.method_44$aae029aa0a();
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10002 = 602094885714373755L;
         long var7 = var3;
         ModeSetting var9 = this.settingDCPSMode;
         var10 = var9.method_46$5f9dc63072(var7).equals("External");
      }

      return var5 ? var10 : var10;
   }



   private boolean method_45q$aae029aa0a() {
      long var1 = a ^ 71033860970833L;
      long var3 = var1 ^ 120682195654987L;
      long var10002 = -2546500343468230519L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("UnLegit");
   }



   public void method_482$4a66cb4514(char var1, int var2, char var3) {
      this.field_42 = (int)Math.abs(this.field_41x - System.currentTimeMillis());
      this.field_41x = System.currentTimeMillis();
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$69(this.settingMinSneakTicks, 2737459240468140882L, var4);
      this.field_43u = true;
   }



   public void method_487$da8c82d5d4() {
      float var50;
      net.C_47Ij var55;
      java.lang.Object var59;
      net.C_42l var43;
      net.C_42l var61;
      long var1 = a ^ 58439557759418L;
      long var3 = var1 ^ 133891770533014L;
      long var5 = var1 ^ 26933110702496L;
      long var10001 = var1 ^ 2366097120773L;
      int var7 = (int)((var1 ^ 2366097120773L) >>> 32);
      int var8 = (int)((var1 ^ 2366097120773L) << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      long var10 = var1 ^ 16072673080465L;
      long var12 = var1 ^ 133140353470701L;
      long var10000 = -4303789707979984841L;
      boolean var14 = AimBot_47O_.method_45g$aae029aa0a();
      this.field_41r = null;
      long var10002 = -4304747650869993374L;
      long var21 = var5;
      ModeSetting var23 = this.settingMode;
      byte var47 = (byte) ((var23.method_46$5f9dc63072(var21).equals("UnLegit")) ? 1 : 0);
      if (!var14) {
         if (var47 == 0) {
            return;
         }

         var47 = (byte) ((this.field_41M) ? 1 : 0);
      }

      label240: {
         if (!var14) {
            if (var47 == 0) {
               return;
            }

            var10000 = -4297978950076580213L;
            Client var49 = Client.method_44$fbc0c0be91();
            var10001 = -4303459151868849204L;
            Client var24 = var49;
            var50 = var24.method_45$03ec613b6f().field_48;
            if (var14) {
               break label240;
            }

            float var77;
            var47 = (byte)((var77 = var50 - 70.0F) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1));
         }

         if (var47 <= 0) {
            return;
         }

         var10001 = -4305166566062065513L;
         Minecraft var25 = field_43;
         var50 = var25.field_42P.field_48h;
      }

      float var15 = var50;
      ArrayList var16 = new ArrayList();
      float var17 = 0.0F;
      float var18 = 72.0F;

      while (true) {
         var10002 = -4296606973550714063L;
         BooleanSetting var26 = this.settingIntave;
         byte var64;
         if (var26.method_49$aae029aa0a()) {
            var64 = 85;
            if (!var14) {
            }
         } else {
            var64 = 90;
         }

         float var78;
         int var51 = (var78 = var18 - var64) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
         if (!var14) {
            if (var51 < 0) {
               label213: {
                  var10002 = -4303603064942670395L;
                  C_47S6 var27 = ClientGlobals.field_46;
                  long var10003 = -4303993020816726750L;
                  float var19 = C_47gg.method_41$d819a8fdf1(var18, var27.method_44$4f8050086d().field_41, var10);
                  float var52 = var19;
                  float var65 = var17;
                  if (!var14) {
                     if (var19 != var17) {
                        C_47Ij var20 = C_47sc.method_42$40d619e661(1.0F, var15, var19);
                        if (var14) {
                           break label213;
                        }

                        label184:
                        if (var20.field_49 == C_47Az.BLOCK) {
                           C_47Ij var53 = var20;
                           if (!var14) {
                              C_478Q var66 = var20.method_49$5730377d31();
                              var10002 = -4296736438404356223L;
                              C_478Q var28 = var66;
                              long var29 = var3;
                              if (!C_474i.method_42$133d77006a(var29, var28)) {
                                 break label184;
                              }

                              var53 = var20;
                           }

                           label246: {
                              C_484 var54 = var53.field_40;
                              C_484 var67 = C_484.DOWN;
                              if (!var14) {
                                 if (var53.field_40 == C_484.DOWN) {
                                    break label184;
                                 }

                                 var55 = var20;
                                 if (var14) {
                                    break label246;
                                 }

                                 var54 = var20.field_40;
                                 var67 = C_484.UP;
                              }

                              if (var54 == var67) {
                                 break label184;
                              }

                              var55 = var20;
                           }

                           double var56 = var55.method_49$5730377d31().method_43$8abf5c6871();
                           var10002 = -4305166566062065513L;
                           Minecraft var31 = field_43;
                           double var79;
                           int var57 = (var79 = var56 - var31.field_42P.field_48j) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                           if (!var14) {
                              if (var57 >= 0) {
                                 break label184;
                              }

                              double var80;
                              var57 = (var80 = var20.field_45.field_41 % 1.0 - 0.88) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                           }

                           label248: {
                              if (!var14) {
                                 if (var57 < 0) {
                                    double var81;
                                    int var58 = (var81 = var20.field_45.field_41 % 1.0 - 0.18) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
                                    if (var14) {
                                       break label184;
                                    }

                                    if (var58 > 0) {
                                       break label248;
                                    }
                                 }

                                 var10001 = -4296606973550714063L;
                                 BooleanSetting var32 = this.settingIntave;
                                 var57 = (int) ((var32.method_49$aae029aa0a()) ? 1 : 0);
                              }

                              if (var14 || var57 != 0) {
                                 break label184;
                              }
                           }

                           var16.add(new C_42l(var20, var19));
                        }
                     }

                     var17 = var19;
                     var52 = var18;
                     var65 = 0.05F;
                  }

                  var18 = var52 + var65;
               }

               if (!var14) {
                  continue;
               }
            }

            var59 = var16;
            if (var14) {
               break;
            }

            var51 = (int) ((var16.isEmpty()) ? 1 : 0);
         }

         if (var51 != 0) {
            return;
         }

         var59 = var16.get(0);
         break;
      }

      label249: {
         var43 = (C_42l)var59;
         var10001 = -4296606973550714063L;
         BooleanSetting var33 = this.settingIntave;
         boolean var60 = var33.method_49$aae029aa0a();
         if (!var14) {
            if (var60) {
               for (Object recovered$element$67415 : var16) {
         C_42l var46 = (C_42l) recovered$element$67415;
                  if (var14) {
                     return;
                  }

                  label154: {
                     var61 = var46;
                     label153:
                     if (!var14) {
                        if (var46 != null) {
                           var61 = var46;
                           if (var14) {
                              break label153;
                           }

                           if (!(var46.field_44 < var43.field_44)) {
                              break label154;
                           }
                        }

                        var61 = var46;
                     }

                     var43 = var61;
                  }

                  if (var14) {
                     break;
                  }
               }

               if (!var14) {
                  break label249;
               }
            }

            var10001 = -4296606973550714063L;
            BooleanSetting var34 = this.settingMidRotation;
            var60 = var34.method_49$aae029aa0a();
         }

         label135: {
            if (var60) {
               float var45 = var15;
               var16.sort(Comparator.comparingDouble(recovery$indy$70(this, var45)));
               if (!var14) {
                  break label135;
               }
            }

            var16.sort(Comparator.comparingDouble(recovery$indy$71(this)));
         }

         var43 = (C_42l)var16.get(0);
      }

      long var10005 = -4304262869833653892L;
      AutoEagle_47C6 var35 = this;
      byte var36 = -2;
      float var37 = var43.field_44;
      long var38 = var12;
      C_47S6 var40 = ClientGlobals.field_46;
      var40.method_46$6a778c6bfe(var38, var37, var36, var35);
      long var10004 = -4305166566062065513L;
      Minecraft var41 = field_43;
      byte var75 = (byte)var9;
      long var10008 = -4305166566062065513L;
      Minecraft var42 = field_43;
      var10008 = -4304863619656062176L;
      this.field_43p = C_47gg.method_45$0e33825bca(0.0F, var43.field_44, var7, var8, var75, var41.field_42P.field_48h, var42.field_42P.field_48z)[1];
      this.field_41r = var43.field_42;
   }







    public AutoEagle_47C6(long a0) {
        super((java.lang.String) ("AutoEagle"),(java.lang.String) ("AutoAdler"),(long) (((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 45949144804785L)),(java.awt.Color) (new java.awt.Color((int) (194),(int) (222),(int) (146))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 87439937474857L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 87439937474857L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 87439937474857L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 89332115956887L);
        long constructorKey7 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 108294632693116L);
        long constructorKey8 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 76518025620706L);
        long constructorKey9 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 128832470779842L);
        long constructorKey10 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 81113598481960L);
        long constructorKey11 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 131909760337053L);
        long constructorKey12 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 102837447190335L);
        long constructorKey13 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 106116714579020L);
        long constructorKey14 = ((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 97782947049898L);
        int constructorPart15 = (int) ((((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 79832918259468L) >>> 32));
        long constructorKey16 = ((((augustus.recovered.modules.legit.AutoEagle_47C6.a ^ a0) ^ 79832918259468L) << 32) >>> 32);
        java.lang.Object initialValue17 = recovery$indy$flow$567(3);
        ((java.lang.Object[]) initialValue17)[0] = "Eagle";
        ((java.lang.Object[]) initialValue17)[1] = "MoonWalk";
        ((java.lang.Object[]) initialValue17)[2] = "UnLegit";
        client.setting.ModeSetting initialized18 = new client.setting.ModeSetting(this, "Mode", constructorKey7, "Eagle", (java.lang.String[]) (initialValue17));
        recovery$indy$flow$569(this, initialized18);
        short converted19 = (short) (constructorPart4);
        short converted20 = (short) (constructorPart5);
        client.setting.RangeSetting initialized21 = new client.setting.RangeSetting(constructorPart3, this, "MinSneakTicks", 1.0D, Double.longBitsToDouble(4611686018427387904L), converted19, 1.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted20);
        long initialValue22 = constructorKey13;
        client.setting.RangeSetting initialValue23 = initialized21;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = recovery$indy$flow$573(initialValue24, initialValue22);
        double initialValue26 = Double.longBitsToDouble(4627730092099895296L);
        long initialValue27 = constructorKey11;
        double initialValue28 = Double.longBitsToDouble(4624633867356078080L);
        double initialValue29 = Double.longBitsToDouble(4611686018427387904L);
        double initialValue30 = 1.0D;
        double initialValue31 = Double.longBitsToDouble(4613937818241073152L);
        double initialValue32 = Double.longBitsToDouble(4613937818241073152L);
        java.lang.Object initialValue33 = initialValue25;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = recovery$indy$flow$575(initialValue34, initialValue32, initialValue31, initialValue30, initialValue29, initialValue28, initialValue27, initialValue26);
        java.lang.Object initialValue36 = recovery$indy$flow$576(this);
        long initialValue37 = constructorKey16;
        java.lang.Object initialValue38 = initialValue36;
        int initialValue39 = constructorPart15;
        java.lang.Object initialValue40 = initialValue35;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue43 = recovery$indy$flow$579(initialValue41, initialValue39, initialValue42, initialValue37);
        recovery$indy$flow$580(this, initialValue43);
        net.C_47TU initialized44 = new net.C_47TU(constructorKey12, this, "MoonWalkWideness", Double.longBitsToDouble(4587366580439587226L), Double.longBitsToDouble(4591870180066957722L), 0.0D, Double.longBitsToDouble(4599075939470750515L), 2);
        java.lang.Object initialValue45 = recovery$indy$flow$583(this);
        long initialValue46 = constructorKey8;
        java.lang.Object initialValue47 = initialValue45;
        net.C_47TU initialValue48 = initialized44;
        java.lang.Object initialValue49 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue51 = recovery$indy$flow$586(initialValue49, initialValue50, initialValue46);
        recovery$indy$flow$587(this, initialValue51);
        net.C_47TU initialized52 = new net.C_47TU(constructorKey12, this, "StartDistToBlock", Double.longBitsToDouble(4587366580439587226L), Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(-4626998257160447590L), Double.longBitsToDouble(4602678819172646912L), 2);
        java.lang.Object initialValue53 = recovery$indy$flow$590(this);
        long initialValue54 = constructorKey8;
        java.lang.Object initialValue55 = initialValue53;
        net.C_47TU initialValue56 = initialized52;
        java.lang.Object initialValue57 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue58 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue55))))));
        java.lang.Object initialValue59 = recovery$indy$flow$593(initialValue57, initialValue58, initialValue54);
        recovery$indy$flow$594(this, initialValue59);
        client.setting.BooleanSetting initialized60 = new client.setting.BooleanSetting(this, constructorKey14, "SilentRotation", false);
        java.lang.Object initialValue61 = recovery$indy$flow$597(this);
        java.lang.Object initialValue62 = initialValue61;
        long initialValue63 = constructorKey6;
        client.setting.BooleanSetting initialValue64 = initialized60;
        java.lang.Object initialValue65 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue66 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue67 = recovery$indy$flow$600(initialValue65, initialValue63, initialValue66);
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue67))))));
        recovery$indy$flow$602(this, initialValue68);
        client.setting.BooleanSetting initialized69 = new client.setting.BooleanSetting(this, constructorKey14, "Intave", false);
        java.lang.Object initialValue70 = recovery$indy$flow$605(this);
        java.lang.Object initialValue71 = initialValue70;
        long initialValue72 = constructorKey6;
        client.setting.BooleanSetting initialValue73 = initialized69;
        java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue75 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue76 = recovery$indy$flow$608(initialValue74, initialValue72, initialValue75);
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue76))))));
        recovery$indy$flow$610(this, initialValue77);
        client.setting.BooleanSetting initialized78 = new client.setting.BooleanSetting(this, constructorKey14, "MidRotation", false);
        java.lang.Object initialValue79 = recovery$indy$flow$613(this);
        java.lang.Object initialValue80 = initialValue79;
        long initialValue81 = constructorKey6;
        client.setting.BooleanSetting initialValue82 = initialized78;
        java.lang.Object initialValue83 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue84 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue85 = recovery$indy$flow$616(initialValue83, initialValue81, initialValue84);
        java.lang.Object initialValue86 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue85))))));
        recovery$indy$flow$618(this, initialValue86);
        client.setting.BooleanSetting initialized87 = new client.setting.BooleanSetting(this, constructorKey14, "FastPlace", true);
        recovery$indy$flow$621(this, initialized87);
        short converted88 = (short) (constructorPart4);
        short converted89 = (short) (constructorPart5);
        client.setting.RangeSetting initialized90 = new client.setting.RangeSetting(constructorPart3, this, "CPS", Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4626322717216342016L), converted88, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, converted89);
        long initialValue91 = constructorKey13;
        client.setting.RangeSetting initialValue92 = initialized90;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = recovery$indy$flow$625(initialValue93, initialValue91);
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue96 = recovery$indy$flow$627(initialValue95);
        java.lang.Object initialValue97 = recovery$indy$flow$628(initialValue95);
        long initialValue98 = constructorKey16;
        java.lang.Object initialValue99 = initialValue97;
        int initialValue100 = constructorPart15;
        java.lang.Object initialValue101 = initialValue94;
        java.lang.Object initialValue102 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue103 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue104 = recovery$indy$flow$631(initialValue102, initialValue100, initialValue103, initialValue98);
        recovery$indy$flow$632(this, initialValue104);
        java.lang.Object initialValue105 = recovery$indy$flow$634(2);
        ((java.lang.Object[]) initialValue105)[0] = "Internal";
        ((java.lang.Object[]) initialValue105)[1] = "External";
        client.setting.ModeSetting initialized106 = new client.setting.ModeSetting(this, "DCPSMode", constructorKey7, "External", (java.lang.String[]) (initialValue105));
        java.lang.Object initialValue107 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue108 = recovery$indy$flow$637(initialValue107);
        java.lang.Object initialValue109 = recovery$indy$flow$638(initialValue107);
        java.lang.Object initialValue110 = initialValue109;
        client.setting.ModeSetting initialValue111 = initialized106;
        java.lang.Object initialValue112 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue111))))));
        java.lang.Object initialValue113 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue114 = recovery$indy$flow$641(initialValue112, initialValue113);
        recovery$indy$flow$642(this, initialValue114);
        short converted115 = (short) (constructorPart4);
        short converted116 = (short) (constructorPart5);
        client.setting.RangeSetting initialized117 = new client.setting.RangeSetting(constructorPart3, this, "DCPS", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4616189618054758400L), converted115, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted116);
        long initialValue118 = constructorKey13;
        client.setting.RangeSetting initialValue119 = initialized117;
        java.lang.Object initialValue120 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue119))))));
        java.lang.Object initialValue121 = recovery$indy$flow$646(initialValue120, initialValue118);
        java.lang.Object initialValue122 = recovery$indy$flow$647(this);
        long initialValue123 = constructorKey16;
        java.lang.Object initialValue124 = initialValue122;
        int initialValue125 = constructorPart15;
        java.lang.Object initialValue126 = initialValue121;
        java.lang.Object initialValue127 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue126))))));
        java.lang.Object initialValue128 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue124))))));
        java.lang.Object initialValue129 = recovery$indy$flow$650(initialValue127, initialValue125, initialValue128, initialValue123);
        recovery$indy$flow$651(this, initialValue129);
        client.setting.BooleanSetting initialized130 = new client.setting.BooleanSetting(this, constructorKey14, "AlwaysPlaceWhenPossible", true);
        java.lang.Object initialValue131 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue132 = recovery$indy$flow$655(initialValue131);
        java.lang.Object initialValue133 = recovery$indy$flow$656(initialValue131);
        java.lang.Object initialValue134 = initialValue133;
        long initialValue135 = constructorKey6;
        client.setting.BooleanSetting initialValue136 = initialized130;
        java.lang.Object initialValue137 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue136))))));
        java.lang.Object initialValue138 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue139 = recovery$indy$flow$659(initialValue137, initialValue135, initialValue138);
        java.lang.Object initialValue140 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue139))))));
        recovery$indy$flow$661(this, initialValue140);
        client.setting.BooleanSetting initialized141 = new client.setting.BooleanSetting(this, constructorKey14, "DelayClick", false);
        java.lang.Object initialValue142 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue143 = recovery$indy$flow$665(initialValue142);
        java.lang.Object initialValue144 = recovery$indy$flow$666(initialValue142);
        java.lang.Object initialValue145 = initialValue144;
        long initialValue146 = constructorKey6;
        client.setting.BooleanSetting initialValue147 = initialized141;
        java.lang.Object initialValue148 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue149 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue145))))));
        java.lang.Object initialValue150 = recovery$indy$flow$669(initialValue148, initialValue146, initialValue149);
        java.lang.Object initialValue151 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue150))))));
        recovery$indy$flow$671(this, initialValue151);
        client.setting.BooleanSetting initialized152 = new client.setting.BooleanSetting(this, constructorKey14, "ClickPause", false);
        java.lang.Object initialValue153 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue154 = recovery$indy$flow$675(initialValue153);
        java.lang.Object initialValue155 = recovery$indy$flow$676(initialValue153);
        java.lang.Object initialValue156 = initialValue155;
        long initialValue157 = constructorKey6;
        client.setting.BooleanSetting initialValue158 = initialized152;
        java.lang.Object initialValue159 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue158))))));
        java.lang.Object initialValue160 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue161 = recovery$indy$flow$679(initialValue159, initialValue157, initialValue160);
        java.lang.Object initialValue162 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue161))))));
        recovery$indy$flow$681(this, initialValue162);
        client.setting.BooleanSetting initialized163 = new client.setting.BooleanSetting(this, constructorKey14, "OneClick", false);
        java.lang.Object initialValue164 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingFastPlace));
        java.lang.Object initialValue165 = recovery$indy$flow$685(initialValue164);
        java.lang.Object initialValue166 = recovery$indy$flow$686(initialValue164);
        java.lang.Object initialValue167 = initialValue166;
        long initialValue168 = constructorKey6;
        client.setting.BooleanSetting initialValue169 = initialized163;
        java.lang.Object initialValue170 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue171 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue172 = recovery$indy$flow$689(initialValue170, initialValue168, initialValue171);
        java.lang.Object initialValue173 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue172))))));
        recovery$indy$flow$691(this, initialValue173);
        client.setting.BooleanSetting initialized174 = new client.setting.BooleanSetting(this, constructorKey14, "OnlyWhileSneak", true);
        recovery$indy$flow$694(this, initialized174);
        java.lang.Object initialValue175 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingCPS));
        java.lang.Object initialValue176 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingDCPSMode));
        java.lang.Object initialValue177 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingDCPS));
        java.lang.Object initialValue178 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingAlwaysPlaceWhenPossible));
        java.lang.Object initialValue179 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingOneClick));
        java.lang.Object initialValue180 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoEagle_47C6) (((java.lang.Object)(this)))).settingDelayClick));
        net.C_47XK initialized181 = new net.C_47XK((client.setting.RangeSetting) (initialValue175), (client.setting.ModeSetting) (initialValue176), (client.setting.RangeSetting) (initialValue177), constructorKey9, (client.setting.BooleanSetting) (initialValue178), (client.setting.BooleanSetting) (initialValue179), (client.setting.BooleanSetting) (initialValue180));
        recovery$indy$flow$703(this, initialized181);
        recovery$indy$flow$704(this, null);
        recovery$indy$flow$705(this, false);
        recovery$indy$flow$706(this, 0);
        recovery$indy$flow$707(this, 1);
        recovery$indy$flow$708(this, 0.0D);
        recovery$indy$flow$709(this, 0.0D);
        recovery$indy$flow$710(this, false);
        recovery$indy$flow$711(this, false);
        recovery$indy$flow$712(this, false);
        recovery$indy$flow$713(this, 0L);
        recovery$indy$flow$714(this, 0L);
        recovery$indy$flow$715(this, 0);
        recovery$indy$flow$716(this, 0);
        recovery$indy$flow$717(this, 0);
        java.lang.Object initialValue182 = recovery$indy$flow$718();
        long initialValue183 = constructorKey10;
        int initialValue184 = 2;
        int initialValue185 = 0;
        java.lang.Object initialValue186 = initialValue182;
        java.lang.Object initialValue187 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(initialValue186))))));
        int initialValue188 = recovery$indy$flow$720(initialValue187, initialValue185, initialValue184, initialValue183);
        recovery$indy$flow$721(this, initialValue188);
        java.lang.Object initialValue189 = recovery$indy$flow$722();
        long initialValue190 = constructorKey10;
        int initialValue191 = 2;
        int initialValue192 = 0;
        java.lang.Object initialValue193 = initialValue189;
        java.lang.Object initialValue194 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(initialValue193))))));
        int initialValue195 = recovery$indy$flow$724(initialValue194, initialValue192, initialValue191, initialValue190);
        recovery$indy$flow$725(this, initialValue195);
    }









    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$137(long a0,long a1);
    private static native boolean recovery$indy$flow$138(java.lang.Object a0,short a1,int a2,char a3,long a4,long a5);
    private static native boolean recovery$indy$flow$139(long a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$141(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$144(java.lang.Object a0,boolean a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$150(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$153(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$158(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$165(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$167(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$168(java.lang.Object a0,double a1,long a2,double a3,long a4,long a5);
    private static native double recovery$indy$flow$172(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$174(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$175(java.lang.Object a0,double a1,long a2,double a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$179(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$181(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$183(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$192(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$197(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$201(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$206(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$210(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$218(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$222(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$224(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,double a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$226(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$228(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,double a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$230(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$232(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,double a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$234(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$236(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,double a4,boolean a5,long a6,long a7);
    private static native void recovery$indy$flow$394(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$567(int a0);
    private static native void recovery$indy$flow$569(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$573(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$575(java.lang.Object a0,double a1,double a2,double a3,double a4,double a5,long a6,double a7);
    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$579(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$580(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$583(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$586(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$587(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$590(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$593(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$594(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$597(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$600(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$602(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$605(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$608(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$610(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$613(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$616(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$618(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$621(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$625(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$627(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$628(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$631(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$632(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$634(int a0);

    private static java.lang.Object recovery$indy$flow$637(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$638(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$641(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$642(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$646(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$647(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$650(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$651(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$655(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$661(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$665(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$666(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$669(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$671(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$675(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$676(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$679(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$681(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$685(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$686(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$689(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$691(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$694(java.lang.Object a0,java.lang.Object a1);






    private static native void recovery$indy$flow$703(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$704(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_41r = ((net.C_47Ij) (a1));
        return;
    }
    private static void recovery$indy$flow$705(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$706(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43U = a1;
        return;
    }
    private static void recovery$indy$flow$707(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$708(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43F = a1;
        return;
    }
    private static void recovery$indy$flow$709(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$710(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$711(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$712(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_41M = a1;
        return;
    }
    private static void recovery$indy$flow$713(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_47 = a1;
        return;
    }
    private static void recovery$indy$flow$714(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_41x = a1;
        return;
    }
    private static void recovery$indy$flow$715(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$716(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$717(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_437 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$718() {
        return net.C_476q.field_48;
    }

    private static native int recovery$indy$flow$720(java.lang.Object a0,int a1,int a2,long a3);
    private static void recovery$indy$flow$721(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43y = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$722() {
        return net.C_476q.field_48;
    }

    private static native int recovery$indy$flow$724(java.lang.Object a0,int a1,int a2,long a3);
    private static void recovery$indy$flow$725(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoEagle_47C6) (a0)).field_43n = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native C_47Ij recovery$indy$3(int var0, short var1, float var2, int var3, float var4, float var5, long var6, long var8);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$38(long var0, long var2);
   private static native boolean recovery$indy$39(long var0, long var2, long var4);
   private static native WorldClient recovery$indy$40(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3);
   private static native void recovery$indy$47(Object var0, boolean var1, long var2, long var4);
   private static native int recovery$indy$48(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$49(Object var0, long var1, long var3);
   private static native void recovery$indy$50(Object var0, boolean var1, long var2, long var4);
   private static native String recovery$indy$51(int var0, long var1);
   private static native boolean recovery$indy$52(long var0, long var2);
   private static native void recovery$indy$53(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$54(long var0, long var2);
   private static native boolean recovery$indy$55(long var0, long var2, long var4);
   private static native Client recovery$indy$56(long var0, long var2);
   private static native C_47y6 recovery$indy$57(Object var0, long var1, long var3);
   private static native void recovery$indy$58(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$60(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$61(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$62(Object var0, long var1, long var3);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, C_47Ij var1, long var2, long var4);
   private static native double recovery$indy$69(Object var0, long var1, long var3);
   private static native ToDoubleFunction recovery$indy$70(AutoEagle_47C6 var0, float var1);
   private static native ToDoubleFunction recovery$indy$71(AutoEagle_47C6 var0);
   private static native MethodHandle recovery$constant$85();
}
