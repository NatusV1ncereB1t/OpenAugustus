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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_476q;
import net.C_476x;
import net.C_477r;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Br;
import net.C_47F9;
import net.C_47Ij;
import net.C_47MO;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Tf;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47VU;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gg;
import net.C_47hN;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oo;
import net.C_47q9;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_47y6;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AimAssist_47Cm extends client.module.Module implements net.C_47oO,net.C_47xz,net.C_476x {
    private final client.setting.RangeSetting settingPreAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private client.setting.ModeSetting settingMode; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_45n field_45t; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_45n field_458; // Runtime access flags and ConstantValue are restored from the original class.
    private client.setting.NumberSetting settingStrength; // Runtime access flags and ConstantValue are restored from the original class.
    private client.setting.NumberSetting settingFasterMouseMovement; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingImproveYourAimInput = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingOwnHorizontalRotationMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingOwnVerticalRotationMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHorizontalAssistMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingVerticalAssistMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingAutoAim = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingHorizontalSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingVerticalSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHorizontalSmoothness = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingVerticalSmoothness = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmoothEarly = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingNoRotationFovMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingNoRotationHorizontalFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingNoRotationVerticalFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingNoRotationHorizontal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingNoRotationVertical = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHorizontalBoxSize = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRandomizationStrength = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRandomizeInNoRotationFovs = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHorizontalFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingVerticalFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDiggingCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSingleTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47Tf field_45J = null; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_45G; // Runtime access flags and ConstantValue are restored from the original class.
    public net.minecraft.entity.EntityLivingBase field_456; // Runtime access flags and ConstantValue are restored from the original class.
    public net.minecraft.entity.EntityLivingBase field_45l; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_45M = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_45q; // Runtime access flags and ConstantValue are restored from the original class.
    private double[] field_45a; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47gg field_454 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_453; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_45L; // Runtime access flags and ConstantValue are restored from the original class.
    private static int[] field_45p; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

   public static void method_46$2022b4f670(int[] var0) {
      field_45p = var0;
   }



   private double method_46$83ff7736af(Entity var1) {
      net.minecraft.entity.Entity var10;
      long var2 = a ^ 70938576590078L;
      long var4 = var2 ^ 107175666642736L;
      long var10000 = -1303081285915420027L;
      boolean var6 = AimBot_47O_.method_45i$aae029aa0a();
      if (!(var1 instanceof EntityLivingBase)) {
         return 1000.0;
      }

      var10 = this.field_45l;
      label29:
      if (var6) {
         if (this.field_45l != null) {
            var10 = var1;
            if (!var6) {
               break label29;
            }

            if (var1.method_49$8abf5c6871() == this.field_45l.method_49$8abf5c6871()) {
               return -1.0;
            }
         }

         var10 = var1;
      }

      double var11 = var10.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = -1299693661200375342L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = -1302323495313377990L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = -1299693661200375342L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = -1302323495313377990L;
      Client var9 = var15;
      var10006 = -1301631174930439252L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



   private void method_46$77c9a14aae(C_47VU var1, long var2) {
      net.C_47VU var56;
      net.C_47VU var57;
      long var4;
      byte var19;
      int[] var23;
      int var30;
      int var31;
      int var55;
      int var60;
      label127: {
         var2 = a ^ var2;
         var4 = var2 ^ 19032560411566L;
         long var10001 = var2 ^ 48855973385408L;
         int var6 = (int)((var2 ^ 48855973385408L) >>> 48);
         int var7 = (int)((var2 ^ 48855973385408L) << 16 >>> 32);
         int var8 = (int)(var10001 << 48 >>> 48);
         long var9 = var2 ^ 107924261623228L;
         long var11 = var2 ^ 63507388666670L;
         long var58 = var2 ^ 88027861572901L;
         int var13 = (int)((var2 ^ 88027861572901L) >>> 48);
         int var14 = (int)((var2 ^ 88027861572901L) << 16 >>> 32);
         int var15 = (int)(var58 << 48 >>> 48);
         long var59 = var2 ^ 60964230133125L;
         int var16 = (int)((var2 ^ 60964230133125L) >>> 32);
         int var17 = (int)((var2 ^ 60964230133125L) << 32 >>> 40);
         int var18 = (int)(var59 << 56 >>> 56);
         int var20 = (int)(System.currentTimeMillis() - this.field_45L);
         C_47tf var21 = recovery$indy$2(this.field_456, var9, recovery$indy$1(var1, -1168819253873193121L, var2), -1170241872325432813L, var2);
         byte var10000 = (byte) ((recovery$indy$3(-1169369229066413910L, var2)) ? 1 : 0);
         C_477r var22 = recovery$indy$7(
            var11,
            var21.field_40,
            var21.field_41,
            var21.field_47,
            new C_477r(
               recovery$indy$4(this, (short)var6, var7, (short)var8, -1163126711450359644L, var2),
               recovery$indy$5(this, (short)var13, var14, (short)var15, -1169426292765382067L, var2)
            ),
            180.0F,
            180.0F,
            false,
            recovery$indy$6(var1, -1168819253873193121L, var2),
            -1163944621465614061L,
            var2
         );
         var19 = var10000;
         var23 = recovery$indy$10(
            var22.field_44,
            var22.field_41,
            var16,
            var17,
            (byte)var18,
            recovery$indy$8(this, (short)var6, var7, (short)var8, -1163126711450359644L, var2),
            recovery$indy$9(this, (short)var13, var14, (short)var15, -1169426292765382067L, var2),
            -1167473922450016645L,
            var2
         );
         C_477r var24 = recovery$indy$15(
            var11,
            var21.field_40,
            var21.field_41,
            var21.field_47,
            new C_477r(
               recovery$indy$11(this, (short)var6, var7, (short)var8, -1163126711450359644L, var2),
               recovery$indy$12(this, (short)var13, var14, (short)var15, -1169426292765382067L, var2)
            ),
            4.0F * (recovery$indy$13(var1, -1168819253873193121L, var2) - this.field_45G),
            4.0F,
            false,
            recovery$indy$14(var1, -1168819253873193121L, var2),
            -1163944621465614061L,
            var2
         );
         int[] var25 = recovery$indy$18(
            var24.field_44,
            var24.field_41,
            var16,
            var17,
            (byte)var18,
            recovery$indy$16(this, (short)var6, var7, (short)var8, -1163126711450359644L, var2),
            recovery$indy$17(this, (short)var13, var14, (short)var15, -1169426292765382067L, var2),
            -1167473922450016645L,
            var2
         );
         double var26 = (double)this.field_45q[0] / this.field_43y * var20;
         double var28 = (double)this.field_45q[1] / this.field_43y * var20;
         this.field_45a[0] = this.field_45a[0] + var26;
         this.field_45a[1] = this.field_45a[1] + var28;
         var30 = (int)Math.round(this.field_45a[0] - this.field_40[0]);
         var31 = (int)Math.round(this.field_45a[1] - this.field_40[1]);
         this.field_40[0] = this.field_40[0] + var30;
         this.field_40[1] = this.field_40[1] + var31;
         var55 = recovery$indy$19(var1, -1170146252744131848L, var2);
         label126:
         if (var19 != 0) {
            label124: {
               label123:
               if (var55 != 0) {
                  int var32 = var23[0];
                  var55 = var32;
                  var60 = var19;
                  if (var2 >= 0L) {
                     if (var19 != 0) {
                        if (var32 < 0) {
                           var55 = var32 - recovery$indy$20(var1, -1170146252744131848L, var2);
                           var60 = var19;
                           if (var2 >= 0L) {
                              if (var19 == 0) {
                                 break label126;
                              }

                              var60 = var32;
                           }

                           if (var55 > var60) {
                              break label123;
                           }

                           double var33 = recovery$indy$21(var1, -1170146252744131848L, var2)
                              * recovery$indy$22(this.settingHorizontalAssistMultiplier, var4, -1169127563255185994L, var2);
                           double var35 = var33 + this.field_49[0];
                           int var37 = (int)Math.round(var35);
                           var56 = var1;
                           if (var2 < 0L) {
                              break label124;
                           }

                           recovery$indy$23(var1, var37, -1169785223510846301L, var2);
                           this.field_49[0] = var35 - var37;
                           if (var19 != 0) {
                              break label123;
                           }
                        }

                        var55 = var32 - recovery$indy$24(var1, -1170146252744131848L, var2);
                     }

                     var60 = var19;
                  }

                  if (var2 < 0L) {
                     break label127;
                  }

                  if (var60 == 0) {
                     break label126;
                  }

                  if (var55 >= var32) {
                     double var45 = recovery$indy$25(var1, -1170146252744131848L, var2) * recovery$indy$26(this.settingHorizontalAssistMultiplier, var4, -1169127563255185994L, var2);
                     double var48 = var45 + this.field_49[0];
                     int var51 = (int)Math.round(var48);
                     recovery$indy$27(var1, var51, -1169785223510846301L, var2);
                     this.field_49[0] = var48 - var51;
                  }
               }

               var56 = var1;
            }

            var55 = recovery$indy$28(var56, -1167110096160222940L, var2);
         }

         var60 = var19;
      }

      label98:
      if (var60 != 0) {
         label96: {
            label95:
            if (var55 != 0) {
               int var43 = var23[1];
               var55 = var43;
               var60 = var19;
               if (var2 >= 0L) {
                  if (var19 != 0) {
                     if (var43 < 0) {
                        var55 = var43 - recovery$indy$29(var1, -1167110096160222940L, var2);
                        var60 = var19;
                        if (var2 > 0L) {
                           if (var19 == 0) {
                              break label98;
                           }

                           var60 = var43;
                        }

                        if (var55 > var60) {
                           break label95;
                        }

                        double var46 = recovery$indy$30(var1, -1167110096160222940L, var2) * recovery$indy$31(this.settingVerticalAssistMultiplier, var4, -1169127563255185994L, var2);
                        double var49 = var46 + this.field_49[1];
                        int var52 = (int)Math.round(var49);
                        var57 = var1;
                        if (var2 < 0L) {
                           break label96;
                        }

                        recovery$indy$32(var1, var52, -1163892071174171654L, var2);
                        this.field_49[1] = var49 - var52;
                        if (var19 != 0) {
                           break label95;
                        }
                     }

                     var55 = var43 - recovery$indy$33(var1, -1167110096160222940L, var2);
                  }

                  var60 = var19;
               }

               if (var2 >= 0L) {
                  if (var60 == 0) {
                     break label98;
                  }

                  var60 = var43;
               }

               if (var55 >= var60) {
                  double var47 = recovery$indy$34(var1, -1167110096160222940L, var2) * recovery$indy$35(this.settingVerticalAssistMultiplier, var4, -1169127563255185994L, var2);
                  double var50 = var47 + this.field_49[1];
                  int var53 = (int)Math.round(var50);
                  recovery$indy$36(var1, var53, -1163892071174171654L, var2);
                  this.field_49[1] = var50 - var53;
               }
            }

            var57 = var1;
         }

         var55 = recovery$indy$37(var57, -1170146252744131848L, var2);
      }

      double var44 = var55 * recovery$indy$38(this.settingOwnHorizontalRotationMultiplier, var4, -1169127563255185994L, var2);
      double var34 = var44 + this.field_45M[0];
      int var36 = (int)Math.round(var34);
      recovery$indy$39(var1, var36, -1169785223510846301L, var2);
      this.field_45M[0] = var34 - var36;
      double var54 = recovery$indy$40(var1, -1167110096160222940L, var2) * recovery$indy$41(this.settingOwnVerticalRotationMultiplier, var4, -1169127563255185994L, var2);
      double var39 = var54 + this.field_45M[1];
      int var41 = (int)Math.round(var39);
      recovery$indy$42(var1, var41, -1163892071174171654L, var2);
      this.field_45M[1] = var39 - var41;
      recovery$indy$44(var1, recovery$indy$43(var1, -1170146252744131848L, var2) + var30, -1169785223510846301L, var2);
      recovery$indy$46(var1, recovery$indy$45(var1, -1167110096160222940L, var2) + var31, -1163892071174171654L, var2);
   }









    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private float method_41$8a492dfcff(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      return recovery$indy$48(recovery$indy$47(-4459448795754590664L, var4), -4465491806009599280L, var4).field_43;
   }



   private void method_41$5d6954e515(char var1, C_47VU var2, long var3) {
      int var34;
      byte var38;
      int var35;
      long var5;
      long var16;
      byte var21;
      double var24;
      double var26;
      label169: {
         var5 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ a;
         long var10001 = var5 ^ 98049234750005L;
         int var7 = (int)((var5 ^ 98049234750005L) >>> 48);
         int var8 = (int)((var5 ^ 98049234750005L) << 16 >>> 32);
         int var9 = (int)(var10001 << 48 >>> 48);
         long var10 = var5 ^ 25752162028361L;
         long var12 = var5 ^ 40274398023298L;
         long var14 = var5 ^ 84119088860635L;
         var16 = var5 ^ 74582634458075L;
         var10001 = var5 ^ 41009997530064L;
         int var18 = (int)((var5 ^ 41009997530064L) >>> 48);
         int var19 = (int)((var5 ^ 41009997530064L) << 16 >>> 32);
         int var20 = (int)(var10001 << 48 >>> 48);
         C_47tf var22 = recovery$indy$50(this.field_456, var10, recovery$indy$49(var2, 8156846132538823082L, var5), 8157991948687226086L, var5);
         C_477r var23 = recovery$indy$54(
            var14,
            var22.field_40,
            var22.field_41,
            var22.field_47,
            new C_477r(
               recovery$indy$51(this, (short)var7, var8, (short)var9, 8155679351766333009L, var5),
               recovery$indy$52(this, (short)var18, var19, (short)var20, 8156064797491279032L, var5)
            ),
            180.0F,
            180.0F,
            false,
            recovery$indy$53(var2, 8156846132538823082L, var5),
            8155354594330695654L,
            var5
         );
         byte var10000 = (byte) ((recovery$indy$55(8157332618565612440L, var5)) ? 1 : 0);
         var24 = recovery$indy$57(
            var12,
            C_47sk.method_41$f6c4892e39(recovery$indy$56(field_43, 8157989161275634389L, var5).field_48h),
            C_47sk.method_48$294c1e5b96(var23.field_44),
            8157101805333868648L,
            var5
         );
         var21 = var10000;
         var26 = -(var23.field_41 - recovery$indy$58(field_43, 8157989161275634389L, var5).field_48z);
         boolean var32 = recovery$indy$59(field_43, 8154937330124841129L, var5).field_42X;
         if (var21 == 0) {
            if (!var32) {
               break label169;
            }

            var32 = recovery$indy$60(var2, 8155749195947603082L, var5);
         }

         if (!var32) {
            var26 *= -1.0;
         }
      }

      C_47VU var33;
      int var37;
      label162: {
         double var30;
         label172: {
            label173: {
               label159: {
                  label174: {
                     label157: {
                        double var28;
                        label175: {
                           label176: {
                              label154: {
                                 label177: {
                                    label152: {
                                       label151: {
                                          label178: {
                                             var28 = recovery$indy$61(this.settingStrength, true, var16, 8155053588513186736L, var5);
                                             var30 = recovery$indy$62(this.settingFasterMouseMovement, true, var16, 8155053588513186736L, var5);
                                             var33 = var2;
                                             var37 = var21;
                                             if (var3 >= 0L) {
                                                if (var21 == 0) {
                                                   label180: {
                                                      double var39;
                                                      var34 = (var39 = Math.signum(recovery$indy$63(var2, 8158195327817540621L, var5)) - Math.signum(var24))
                                                            == 0.0
                                                         ? 0
                                                         : (var39 < 0.0 ? -1 : 1);
                                                      if (var1 >= 0) {
                                                         if (var34 != 0) {
                                                            break label180;
                                                         }

                                                         double var40;
                                                         var34 = (var40 = Math.abs(recovery$indy$64(var2, 8158195327817540621L, var5)) - Math.abs(var24))
                                                               == 0.0
                                                            ? 0
                                                            : (var40 < 0.0 ? -1 : 1);
                                                      }

                                                      if (var21 != 0) {
                                                         break label151;
                                                      }

                                                      if (var34 <= 0) {
                                                         break label178;
                                                      }

                                                      double var41;
                                                      var34 = (
                                                               var41 = Math.abs(recovery$indy$65(var2, 8158195327817540621L, var5) / var28 - var24)
                                                                  - Math.abs(var24 - recovery$indy$66(var2, 8158195327817540621L, var5))
                                                            )
                                                            == 0.0
                                                         ? 0
                                                         : (var41 < 0.0 ? -1 : 1);
                                                      var38 = var21;
                                                      if (var3 < 0L) {
                                                         break label152;
                                                      }

                                                      if (var21 != 0) {
                                                         break label151;
                                                      }

                                                      if (var34 >= 0) {
                                                         break label178;
                                                      }
                                                   }

                                                   var33 = var2;
                                                }

                                                var37 = (int)(recovery$indy$67(var2, 8158195327817540621L, var5) / var28);
                                             }

                                             if (var3 <= 0L) {
                                                break label154;
                                             }

                                             recovery$indy$68(var33, var37, 8156410121763424854L, var5);
                                             if (var21 == 0) {
                                                break label177;
                                             }
                                          }

                                          double var42;
                                          var34 = (var42 = (int)(Math.abs(recovery$indy$69(var2, 8158195327817540621L, var5)) * var30) - Math.abs(var24))
                                                == 0.0
                                             ? 0
                                             : (var42 < 0.0 ? -1 : 1);
                                       }

                                       var38 = var21;
                                    }

                                    if (var38 != 0) {
                                       break label176;
                                    }

                                    if (var34 < 0) {
                                       recovery$indy$71(var2, (int)(recovery$indy$70(var2, 8158195327817540621L, var5) * var30), 8156410121763424854L, var5);
                                    }
                                 }

                                 var33 = var2;
                                 var37 = var21;
                              }

                              if (var1 < 0) {
                                 break label157;
                              }

                              if (var37 != 0) {
                                 break label175;
                              }

                              double var43;
                              var34 = (var43 = Math.signum(recovery$indy$72(var33, 8158520103393529809L, var5)) - Math.signum(var26)) == 0.0
                                 ? 0
                                 : (var43 < 0.0 ? -1 : 1);
                           }

                           if (var34 == 0) {
                              double var44;
                              var35 = (var44 = Math.abs(recovery$indy$73(var2, 8158520103393529809L, var5)) - Math.abs(var26)) == 0.0
                                 ? 0
                                 : (var44 < 0.0 ? -1 : 1);
                              if (var21 != 0) {
                                 break label173;
                              }

                              if (var35 <= 0) {
                                 break label174;
                              }

                              double var45;
                              var35 = (
                                       var45 = Math.abs(recovery$indy$74(var2, 8158520103393529809L, var5) / var28 - var26)
                                          - Math.abs(var26 - recovery$indy$75(var2, 8158520103393529809L, var5))
                                    )
                                    == 0.0
                                 ? 0
                                 : (var45 < 0.0 ? -1 : 1);
                              if (var21 != 0) {
                                 break label173;
                              }

                              if (var35 >= 0) {
                                 break label174;
                              }
                           }

                           var33 = var2;
                        }

                        var37 = (int)(recovery$indy$76(var2, 8158520103393529809L, var5) / var28);
                     }

                     if (var1 < 0) {
                        break label159;
                     }

                     recovery$indy$77(var33, var37, 8155019538287267087L, var5);
                     if (var21 == 0) {
                        return;
                     }
                  }

                  var33 = var2;
                  var37 = var21;
               }

               if (var1 < 0) {
                  break label162;
               }

               if (var37 != 0) {
                  break label172;
               }

               double var46;
               var35 = (var46 = (int)(Math.abs(recovery$indy$78(var33, 8158520103393529809L, var5)) * var30) - Math.abs(var26)) == 0.0
                  ? 0
                  : (var46 < 0.0 ? -1 : 1);
            }

            if (var35 >= 0) {
               return;
            }

            var33 = var2;
         }

         var37 = (int)(recovery$indy$79(var2, 8158520103393529809L, var5) * var30);
      }

      recovery$indy$80(var33, var37, 8155019538287267087L, var5);
   }






   public static int[] method_40$d4d28024c9() {
      return field_45p;
   }



   private boolean method_49H$aae029aa0a() {
      long var1 = a ^ 95313184103859L;
      long var3 = var1 ^ 50138881958210L;
      long var10002 = 7252988317561548240L;
      long var5 = var3;
      ModeSetting var7 = this.settingNoRotationFovMode;
      return var7.method_46$5f9dc63072(var5).equals("2D");
   }



   private double method_44$83ff7736af(Entity var1) {
      long var2 = a ^ 20465210397270L;
      long var4 = var2 ^ 56493965175192L;
      long var10000 = -1493335735821538838L;
      boolean var6 = AimBot_47O_.method_45g$aae029aa0a();
      Entity var10 = var1;
      if (!var6) {
         if (!(var1 instanceof EntityLivingBase)) {
            return 1000.0;
         }

         var10 = var1;
      }

      double var11 = var10.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = -1486507181839538310L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = -1493675868675673198L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = -1486507181839538310L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = -1493675868675673198L;
      Client var9 = var15;
      var10006 = -1492944032446126844L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



   public void method_48$c945181dab(long var1, C_47VU var3) {
      AimAssist_47Cm var17;
      label71: {
         long var4 = var1 ^ 17199219927184L;
         int var6 = (int)((var1 ^ 105505386065643L) >>> 48);
         long var7 = (var1 ^ 105505386065643L) << 16 >>> 16;
         long var9 = var1 ^ 114453840274235L;
         long var11 = var1 ^ 46965806100510L;
         long var10001 = var1 ^ 26187122088946L;
         int var13 = (int)((var1 ^ 26187122088946L) >>> 32);
         int var14 = (int)((var1 ^ 26187122088946L) << 32 >>> 48);
         int var15 = (int)(var10001 << 48 >>> 48);
         byte var16 = (byte) ((recovery$indy$81(-1810774895573904975L, var1)) ? 1 : 0);
         boolean var10000 = recovery$indy$82(ClientGlobals.field_48.field_41W, var4, -1813238336400268710L, var1);
         if (var16 != 0) {
            if (var10000) {
               recovery$indy$83(var3, 0, -1810636461246734920L, var1);
               recovery$indy$84(var3, 0, -1818817211924276511L, var1);
            }

            var17 = this;
            int var20 = var16;
            if (var1 >= 0L) {
               if (var16 == 0) {
                  break label71;
               }

               var20 = var13;
            }

            var10000 = recovery$indy$85(this, var20, (short)var14, var15, -1811545441310318168L, var1);
         }

         label60: {
            label59:
            if (var10000) {
               var17 = this;
               char var21 = (char)var16;
               if (var1 > 0L) {
                  if (var16 != 0) {
                     label53: {
                        byte var19 = ((byte) (recovery$indy$86(this.settingMode, var9, -1810851722456600663L, var1)
                           .equals(recovery$indy$87(19242, 5671070370192451477L ^ var1)) ? 1 : 0));
                        if (var1 > 0L) {
                           if (var19 == 0) {
                              break label53;
                           }

                           recovery$indy$88(this, var3, var11, -1812851748038623592L, var1);
                           if (var1 <= 0L) {
                              break label60;
                           }

                           var19 = var16;
                        }

                        if (var19 != 0) {
                           break label59;
                        }
                     }

                     var17 = this;
                  }

                  var21 = (char)var6;
               }

               recovery$indy$89(var17, var21, var3, var7, -1811138868410444120L, var1);
            }

            this.field_45G = recovery$indy$90(var3, -1811361676484262332L, var1);
         }

         var17 = this;
      }

      var17.field_45L = System.currentTimeMillis();
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 69630971276168L;
      long var3 = var1 ^ 75188553799545L;
      long var10002 = -7882245436694225941L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Stable");
   }



    private boolean method_49$7c2c45e4ce(Entity c_47MQ) {
        long l;
        long l2 = l = a ^ 0x7F5D85045450L;
        long l3 = l2 ^ 0x6B3C03CABA03L;
        long l4 = l2 ^ 0x380EB918612FL;
        long l5 = l2 ^ 0x5EA0EE252F9EL;
        long l6 = l2 ^ 0x358ED2B3E48L;
        boolean bl = AimBot_47O_.method_45g$aae029aa0a();
        boolean bl2 = c_47MQ instanceof EntityPlayerSP;
        if (bl) return bl2;
        if (bl2) return false;
        if (c_47MQ instanceof C_47Br) return false;
        if (c_47MQ.field_48y < 1) return false;
        Minecraft c_47nT = field_43;
        if (!c_47nT.field_42P.method_48$7c2c45e4ce(c_47MQ)) {
            return false;
        }
        Client c_40U = Client.method_44$fbc0c0be91();
        Client c_40U2 = Client.method_44$fbc0c0be91();
        float[] fArray = C_47gg.method_42$edd155e764((double)c_47MQ.field_48Q, (double)c_47MQ.field_48j, (long)l5, (double)c_47MQ.field_42o, (float)c_40U.method_45$03ec613b6f().field_43, (float)c_40U2.method_45$03ec613b6f().field_48);
        long l7 = l4;
        NumberSetting c_47TS = this.settingHorizontalFov;
        if ((double)Math.abs(fArray[0]) > c_47TS.method_44$474dfaa627(l7)) {
            return false;
        }
        long l8 = l4;
        NumberSetting c_47TS2 = this.settingVerticalFov;
        if ((double)Math.abs(fArray[1]) > c_47TS2.method_44$474dfaa627(l8)) {
            return false;
        }
        if (this.field_456 instanceof EntityPlayerSP) return false;
        C_47q9 c_47q9 = C_47q9.PLAYER;
        C_47q9 c_47q92 = C_47q9.MOB;
        C_47q9 c_47q93 = C_47q9.ANIMAL;
        C_47q9 c_47q94 = C_47q9.VILLAGER;
        C_47q9 c_47q95 = C_47q9.ARMOR_STAND;
        C_47q9 c_47q96 = C_47q9.INVISIBLE;
        C_47q9 c_47q97 = C_47q9.TEAMMATES;
        C_47q9 c_47q98 = C_47q9.DEAD;
        if (!AimAssist_47Cm.recovery$indy$91(c_47MQ, c_47q9.method_43$aae029aa0a(), c_47q92.method_43$aae029aa0a(), c_47q93.method_43$aae029aa0a(), c_47q94.method_43$aae029aa0a(), c_47q95.method_43$aae029aa0a(), c_47q96.method_43$aae029aa0a(), !c_47q97.method_43$aae029aa0a(), true, l6, true, c_47q98.method_43$aae029aa0a(), true, 3260681231135289450L, l)) return false;
        Minecraft c_47nT2 = field_43;
        long l9 = l3;
        RangeSetting c_47Ts = this.settingPreAimRange;
        if ((double)c_47nT2.field_42P.method_40$ee256e8a75(c_47MQ) < c_47Ts.method_41$474dfaa627(l9)) return true;
        return false;
    }





   private float method_49$8a492dfcff(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      return recovery$indy$93(recovery$indy$92(-3748782067931281443L, var4), -3755405345716284619L, var4).field_48;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_456 = null;
      this.field_45l = null;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 4401914446792L;
      long var3 = var1 ^ 139873877540665L;
      long var10002 = 8853119043912561579L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Experimental");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$94(this, 40, var3, -7103947541496527994L, var1);
      recovery$indy$95(this, 19, var3, -7103947541496527994L, var1);
      recovery$indy$96(this, 17, var3, -7103947541496527994L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_456 = null;
      this.field_45l = null;
   }



   public void method_489$e45a9973e5(long var1) {
        float var522;
        int var524;
        float var525;
        boolean var532;
        int var534;
        int var552;
      long var3 = var1 ^ 15987524042471L;
      long var5 = var1 ^ 18353041497691L;
      long var7 = var1 ^ 129808678485956L;
      long var9 = var1 ^ 64243680746520L;
      long var11 = var1 ^ 5200419914136L;
      long var13 = var1 ^ 125865651665937L;
      long var10001 = var1 ^ 16890483673876L;
      int var15 = (int)((var1 ^ 16890483673876L) >>> 48);
      int var16 = (int)((var1 ^ 16890483673876L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 115991563608355L;
      int var18 = (int)((var1 ^ 115991563608355L) >>> 48);
      int var19 = (int)((var1 ^ 115991563608355L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 114492510512052L;
      int var21 = (int)((var1 ^ 114492510512052L) >>> 32);
      int var22 = (int)((var1 ^ 114492510512052L) << 32 >>> 40);
      int var23 = (int)(var10001 << 56 >>> 56);
      long var24 = var1 ^ 85883628582303L;
      var10001 = var1 ^ 126702086554353L;
      int var26 = (int)((var1 ^ 126702086554353L) >>> 48);
      int var27 = (int)((var1 ^ 126702086554353L) << 16 >>> 32);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var1 ^ 8595011988016L;
      long var31 = var1 ^ 67525178211529L;
      long var33 = var1 ^ 125711630962619L;
      long var35 = var1 ^ 134844509895882L;
      this.field_45G = 0.0F;
      this.field_45l = this.field_456;
      long var10000 = 4174978540868811612L;
      boolean var515 = AimBot_47O_.method_45g$aae029aa0a();
      this.field_456 = null;
      boolean var37 = var515;
      var10001 = 4173164032610383112L;
      net.minecraft.client.Minecraft var64 = field_43;
      boolean var516 = var64.method_44$aae029aa0a();
      if (var37) {
         if (var516) {
            var10001 = 4176410054864371992L;
            net.minecraft.client.Minecraft var309 = field_43;
            Object[] var263 = var309.field_44Q
               .field_44Q
               .stream()
               .filter((java.util.function.Predicate)recovery$indy$flow$342(this))
               .sorted(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$348(this)))
               .toArray();
            if (var263.length > 0) {
               this.field_456 = (net.minecraft.entity.EntityLivingBase)var263[0];
            }

            var10001 = 4175065987729265250L;
            client.setting.RangeSetting var514 = this.settingPreAimRange;
            var514.method_43$fedcb3e4d3();
         }
      } else {
         if (var516) {
            var10001 = 4176945392628861011L;
            client.setting.BooleanSetting var65 = this.settingClick;
            if (var65.method_49$aae029aa0a()) {
               var10001 = 4172587646683162733L;
               net.minecraft.client.Minecraft var66 = field_43;
               if (!var66.field_44r.field_44l.method_42$aae029aa0a()) {
                  return;
               }
            }

            long var10002 = 4176614540541011456L;
            long var67 = var31;
            net.C_47Tf var69 = this.field_45J;
            if (var69.method_47$0dd78e0064(var67)) {
               var10001 = 4176410054864371992L;
               net.minecraft.client.Minecraft var70 = field_43;
               java.util.stream.Stream var517 = var70.field_44Q.field_44Q.stream().filter((java.util.function.Predicate)recovery$indy$flow$342(this));
               var10002 = 4176945392628861011L;
               client.setting.BooleanSetting var71 = this.settingSingleTarget;
               Object[] var38 = var517.sorted(
                     java.util.Comparator.comparingDouble(
                        var71.method_49$aae029aa0a() ? (java.util.function.ToDoubleFunction)recovery$indy$flow$347(this) : (java.util.function.ToDoubleFunction)recovery$indy$flow$348(this)
                     )
                  )
                  .toArray();
               if (var38.length > 0) {
                  this.field_456 = (net.minecraft.entity.EntityLivingBase)var38[0];
               }

               net.minecraft.entity.EntityLivingBase var518 = this.field_456;
               if (var1 > 0L) {
                  if (this.field_456 != null) {
                     net.C_47tf var265;
                     float var268;
                     float var269;
                     float var271;
                     float var272;
                     net.minecraft.entity.EntityLivingBase var537 = this.field_456;
                     long var722 = 4176864353563356039L;
                     long var310 = var24;
                     client.setting.NumberSetting var311 = this.settingHorizontalBoxSize;
                     int var694 = (int)var311.method_44$474dfaa627(var310);
                     var722 = 4175410612538050896L;
                     int var312 = var694;
                     long var313 = var9;
                     byte var314 = 100;
                     net.minecraft.entity.EntityLivingBase var315 = var537;
                     var265 = net.C_47gg.method_45$3f2be61afc(var315, var314, var313, var312);
                     net.minecraft.entity.EntityLivingBase var538 = this.field_456;
                     short var657 = (short)var26;
                     short var724 = (short)var28;
                     long var752 = 4173395635700465301L;
                     short var316 = var724;
                     int var317 = var27;
                     short var318 = var657;
                     AimAssist_47Cm var319 = this;
                     float var594 = var319.method_41$8a492dfcff(var318, var317, var316);
                     short var695 = (short)var15;
                     short var753 = (short)var17;
                     long var781 = 4175966776827018364L;
                     short var320 = var753;
                     int var321 = var16;
                     short var322 = var695;
                     AimAssist_47Cm var323 = this;
                     float var658 = var323.method_49$8a492dfcff(var322, var321, var320);
                     short var725 = (short)var18;
                     var781 = 4178638981055028080L;
                     int var324 = var20;
                     float var325 = var658;
                     int var326 = var19;
                     short var327 = var725;
                     float var328 = var594;
                     net.minecraft.entity.EntityLivingBase var329 = var538;
                     float[] var267 = net.C_47gg.method_47$6fbd4707ff(var329, var328, var327, var326, var325, var324);
                     var268 = Math.abs(var267[0]);
                     var269 = Math.abs(var267[1]);
                     net.minecraft.entity.EntityLivingBase var539 = this.field_456;
                     short var659 = (short)var26;
                     short var726 = (short)var28;
                     var752 = 4173395635700465301L;
                     short var330 = var726;
                     int var331 = var27;
                     short var332 = var659;
                     AimAssist_47Cm var333 = this;
                     float var595 = var333.method_41$8a492dfcff(var332, var331, var330);
                     var695 = (short)var15;
                     short var755 = (short)var17;
                     var781 = 4175966776827018364L;
                     short var334 = var755;
                     int var335 = var16;
                     short var336 = var695;
                     AimAssist_47Cm var337 = this;
                     float var660 = var337.method_49$8a492dfcff(var336, var335, var334);
                     var722 = 4178321291390407004L;
                     long var338 = var3;
                     float var339 = var660;
                     float var340 = var595;
                     net.minecraft.entity.EntityLivingBase var341 = var539;
                     float[] var270 = net.C_47gg.method_42$1708ca092a(var341, var340, var339, var338);
                     var271 = Math.abs(var270[0]);
                     var272 = Math.abs(var270[1]);
                     var10001 = 4176945392628861011L;
                     client.setting.BooleanSetting var342 = this.settingSmoothEarly;
                     label603:
                     if (var342.method_49$aae029aa0a()) {
                        var10002 = 4176127212453048451L;
                        long var343 = var13;
                        client.setting.ModeSetting var344 = this.settingNoRotationFovMode;
                        boolean var540 = var344.method_46$5f9dc63072(var343).equals((String)recovery$indy$flow$385(625, 1617241917243847157L ^ var1));
                        long var854;
                        int var597 = (var854 = var1 - 0L) == 0L ? 0 : (var854 < 0L ? -1 : 1);
                        if (var540) {
                           long var697 = 4176864353563356039L;
                           long var345 = var24;
                           client.setting.NumberSetting var346 = this.settingNoRotationHorizontalFov;
                           var271 = Math.max(var271 - (float)var346.method_44$474dfaa627(var345), 0.0F);
                           long var698 = 4176864353563356039L;
                           long var347 = var24;
                           client.setting.NumberSetting var348 = this.settingNoRotationVerticalFov;
                           var272 = Math.max(var272 - (float)var348.method_44$474dfaa627(var347), 0.0F);
                           if (!var37) {
                              break label603;
                           }
                        }

                        var10002 = 4176864353563356039L;
                        long var350 = var24;
                        client.setting.NumberSetting var352 = this.settingNoRotationHorizontal;
                        float var275 = (float)(var352.method_44$474dfaa627(var350) / 2.0);
                        var10002 = 4176864353563356039L;
                        long var354 = var24;
                        client.setting.NumberSetting var356 = this.settingNoRotationVertical;
                        float var279 = (float)(var356.method_44$474dfaa627(var354) / 2.0);
                        if (var275 > 0.0F) {
                           long var855;
                           int var598 = (var855 = var1 - 0L) == 0L ? 0 : (var855 < 0L ? -1 : 1);
                           label599:
                           if (var279 > 0.0F) {
                              float[] var295;
                              float[] var298;
                              label607: {
                                 net.C_47tf var283 = this.field_456.method_45$6684d3c618().method_49$b2124a4855();
                                 net.C_478i var287 = new net.C_478i(
                                    var283.field_40 - var275,
                                    var265.field_41 - var279,
                                    var283.field_47 - var275,
                                    var283.field_40 + var275,
                                    var265.field_41 + var279,
                                    var283.field_47 + var275
                                 );
                                 var10001 = 4175635081395730961L;
                                 net.minecraft.client.Minecraft var123 = field_43;
                                 net.C_47tf var291 = var123.field_42P.method_49$41b79b67a0(1.0F);
                                 net.minecraft.entity.EntityLivingBase var541 = this.field_456;
                                 var722 = 4175202969622875608L;
                                 long var124 = var11;
                                 net.C_478i var126 = var287;
                                 net.C_47tf var127 = var291;
                                 double[] var600 = net.C_47hN.method_42$58b9d1b99f(var127, var126, var124);
                                 long var699 = 4173655289403230131L;
                                 double var128 = 1.0;
                                 double[] var130 = var600;
                                 float var601 = (float)net.C_47hN.method_49$4907f774d6(var130, var128);
                                 var752 = 4175535218002915762L;
                                 net.C_478i var131 = var287;
                                 long var132 = var7;
                                 net.C_47tf var134 = var291;
                                 double[] var664 = net.C_47hN.method_49$ad831e4004(var134, var132, var131);
                                 var722 = 4173655289403230131L;
                                 double var135 = 1.0;
                                 double[] var137 = var664;
                                 float var665 = (float)net.C_47hN.method_49$4907f774d6(var137, var135);
                                 var722 = 4178321291390407004L;
                                 long var138 = var3;
                                 float var140 = var665;
                                 float var141 = var601;
                                 net.minecraft.entity.EntityLivingBase var142 = var541;
                                 var295 = net.C_47gg.method_42$1708ca092a(var142, var141, var140, var138);
                                 net.minecraft.entity.EntityLivingBase var542 = this.field_456;
                                 var722 = 4175202969622875608L;
                                 long var143 = var11;
                                 net.C_478i var145 = var287;
                                 net.C_47tf var146 = var291;
                                 double[] var602 = net.C_47hN.method_42$58b9d1b99f(var146, var145, var143);
                                 long var700 = 4173655289403230131L;
                                 double var147 = 0.0;
                                 double[] var149 = var602;
                                 float var603 = (float)net.C_47hN.method_49$4907f774d6(var149, var147);
                                 var752 = 4175535218002915762L;
                                 net.C_478i var150 = var287;
                                 long var151 = var7;
                                 net.C_47tf var153 = var291;
                                 double[] var666 = net.C_47hN.method_49$ad831e4004(var153, var151, var150);
                                 var722 = 4173655289403230131L;
                                 double var154 = 0.0;
                                 double[] var156 = var666;
                                 float var667 = (float)net.C_47hN.method_49$4907f774d6(var156, var154);
                                 var722 = 4178321291390407004L;
                                 long var157 = var3;
                                 float var159 = var667;
                                 float var160 = var603;
                                 net.minecraft.entity.EntityLivingBase var161 = var542;
                                 var298 = net.C_47gg.method_42$1708ca092a(var161, var160, var159, var157);
                                 float var543 = var270[0];
                                 long var856;
                                 int var604 = (var856 = var1 - 0L) == 0L ? 0 : (var856 < 0L ? -1 : 1);
                                 float var857;
                                 int var544 = (var857 = var543 - 0.0F) == 0.0F ? 0 : (var857 < 0.0F ? -1 : 1);
                                 long var858;
                                 int var605 = (var858 = var1 - 0L) == 0L ? 0 : (var858 < 0L ? -1 : 1);
                                 if (var544 < 0) {
                                    float var545 = Math.max(var271 - Math.abs(var295[0]), 0.0F);
                                    long var859;
                                    int var606 = (var859 = var1 - 0L) == 0L ? 0 : (var859 < 0L ? -1 : 1);
                                    var271 = var545;
                                    if (!var37) {
                                       break label607;
                                    }
                                 }

                                 var271 = Math.max(var271 - Math.abs(var298[0]), 0.0F);
                              }

                              float var546 = var270[1];
                              long var860;
                              int var607 = (var860 = var1 - 0L) == 0L ? 0 : (var860 < 0L ? -1 : 1);
                              float var861;
                              int var547 = (var861 = var546 - 0.0F) == 0.0F ? 0 : (var861 < 0.0F ? -1 : 1);
                              long var862;
                              int var608 = (var862 = var1 - 0L) == 0L ? 0 : (var862 < 0L ? -1 : 1);
                              if (var547 < 0) {
                                 float var548 = Math.max(var272 - Math.abs(var295[1]), 0.0F);
                                 long var863;
                                 int var609 = (var863 = var1 - 0L) == 0L ? 0 : (var863 < 0L ? -1 : 1);
                                 var272 = var548;
                                 if (!var37) {
                                    break label599;
                                 }
                              }

                              var272 = Math.max(var272 - Math.abs(var298[1]), 0.0F);
                           }
                        }
                     }

                     boolean var300;
                     boolean var301;
                     label592: {
                        var10001 = 4175065987729265250L;
                        client.setting.RangeSetting var359 = this.settingHorizontalSpeed;
                        float var276 = net.C_47sk.method_46$ef9a6720f7((float)var359.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                        var10001 = 4175065987729265250L;
                        client.setting.RangeSetting var362 = this.settingVerticalSpeed;
                        float var280 = net.C_47sk.method_46$ef9a6720f7((float)var362.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                        var10002 = 4176864353563356039L;
                        long var365 = var24;
                        client.setting.NumberSetting var368 = this.settingHorizontalSmoothness;
                        float var284 = net.C_47sk.method_46$ef9a6720f7((float)var368.method_44$474dfaa627(var365), 1.0F, 10.0F);
                        var10002 = 4176864353563356039L;
                        long var371 = var24;
                        client.setting.NumberSetting var374 = this.settingVerticalSmoothness;
                        float var288 = net.C_47sk.method_46$ef9a6720f7((float)var374.method_44$474dfaa627(var371), 1.0F, 10.0F);
                        float var292 = var276 == 0.0F
                           ? 0.0F
                           : var276 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var271), var276, var276 * var284) / (var276 * var284));
                        float var296 = var280 == 0.0F
                           ? 0.0F
                           : var280 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var272), var280, var280 * var288) / (var280 * var288));
                        double var549 = var265.field_40;
                        double var612 = var265.field_41;
                        double var701 = var265.field_47;
                        short var806 = (short)var26;
                        short var835 = (short)var28;
                        long var844 = 4173395635700465301L;
                        short var377 = var835;
                        int var380 = var27;
                        short var383 = var806;
                        AimAssist_47Cm var386 = this;
                        float var784 = var386.method_41$8a492dfcff(var383, var380, var377);
                        short var827 = (short)var15;
                        short var845 = (short)var17;
                        long var852 = 4175966776827018364L;
                        short var389 = var845;
                        int var392 = var16;
                        short var395 = var827;
                        AimAssist_47Cm var398 = this;
                        net.C_477r var734 = new net.C_477r(var784, var398.method_49$8a492dfcff(var395, var392, var389));
                        long var828 = 4175120221864514417L;
                        boolean var401 = false;
                        float var404 = var296;
                        float var407 = var292;
                        net.C_477r var410 = var734;
                        double var413 = var701;
                        long var416 = var33;
                        double var419 = var612;
                        double var422 = var549;
                        net.C_477r var299 = net.C_47gg.method_48$63715048f6(var422, var419, var416, var413, var410, var407, var404, var401);
                        float var613 = var299.field_44;
                        float var670 = var299.field_41;
                        short var735 = (short)var26;
                        short var785 = (short)var28;
                        long var807 = 4173395635700465301L;
                        short var425 = var785;
                        int var428 = var27;
                        short var431 = var735;
                        AimAssist_47Cm var434 = this;
                        float var758 = var434.method_41$8a492dfcff(var431, var428, var425);
                        byte var808 = (byte)var23;
                        var827 = (short)var15;
                        short var846 = (short)var17;
                        var852 = 4175966776827018364L;
                        short var437 = var846;
                        int var440 = var16;
                        short var443 = var827;
                        AimAssist_47Cm var446 = this;
                        float var809 = var446.method_49$8a492dfcff(var443, var440, var437);
                        long var830 = 4178517968599736394L;
                        this.field_45q = net.C_47gg.method_45$0e33825bca(var613, var670, var21, var22, var808, var758, var809);
                        var300 = false;
                        var301 = false;
                        var10002 = 4176127212453048451L;
                        long var449 = var13;
                        client.setting.ModeSetting var452 = this.settingNoRotationFovMode;
                        boolean var550 = var452.method_46$5f9dc63072(var449).equals((String)recovery$indy$flow$492(625, 1617241917243847157L ^ var1));
                        long var864;
                        int var614 = (var864 = var1 - 0L) == 0L ? 0 : (var864 < 0L ? -1 : 1);
                        if (var550) {
                           double var551 = var268;
                           long var702 = 4176864353563356039L;
                           long var453 = var24;
                           client.setting.NumberSetting var454 = this.settingNoRotationHorizontalFov;
                           double var865;
                           var552 = (var865 = var551 - var454.method_44$474dfaa627(var453)) == 0.0 ? 0 : (var865 < 0.0 ? -1 : 1);
                           long var866;
                           int var672 = (var866 = var1 - 0L) == 0L ? 0 : (var866 < 0L ? -1 : 1);
                           if (!var37) {
                              if (var552 < 0) {
                                 this.field_45q[0] = 0;
                                 var300 = true;
                              }

                              double var553 = var269;
                              long var703 = 4176864353563356039L;
                              long var204 = var24;
                              client.setting.NumberSetting var206 = this.settingNoRotationVerticalFov;
                              double var867;
                              var552 = (var867 = var553 - var206.method_44$474dfaa627(var204)) == 0.0 ? 0 : (var867 < 0.0 ? -1 : 1);
                           }

                           if (var37) {
                              break label592;
                           }

                           if (var552 < 0) {
                              long var868;
                              int var615 = (var868 = var1 - 0L) == 0L ? 0 : (var868 < 0L ? -1 : 1);
                              this.field_45q[1] = 0;
                              var301 = true;
                           }
                        } else {
                           var10002 = 4176864353563356039L;
                           long var455 = var24;
                           client.setting.NumberSetting var456 = this.settingNoRotationHorizontal;
                           float var302 = (float)(var456.method_44$474dfaa627(var455) / 2.0);
                           var10002 = 4176864353563356039L;
                           long var457 = var24;
                           client.setting.NumberSetting var458 = this.settingNoRotationVertical;
                           float var303 = (float)(var458.method_44$474dfaa627(var457) / 2.0);
                           if (var302 > 0.0F && var303 > 0.0F) {
                              double var308;
                              label587: {
                                 var722 = 4175410612538050896L;
                                 byte var459 = 100;
                                 long var460 = var9;
                                 byte var461 = 100;
                                 net.minecraft.entity.EntityLivingBase var462 = this.field_456;
                                 var265 = net.C_47gg.method_45$3f2be61afc(var462, var461, var460, var459);
                                 net.C_47tf var304 = this.field_456.method_45$6684d3c618().method_49$b2124a4855();
                                 net.C_478i var305 = new net.C_478i(
                                    var304.field_40 - var302,
                                    var265.field_41 - var303,
                                    var304.field_47 - var302,
                                    var304.field_40 + var302,
                                    var265.field_41 + var303,
                                    var304.field_47 + var302
                                 );
                                 var10001 = 4175635081395730961L;
                                 net.minecraft.client.Minecraft var463 = field_43;
                                 net.C_47tf var306 = var463.field_42P.method_49$41b79b67a0(1.0F);
                                 double var704 = var299.field_44 % 360.0F;
                                 var722 = 4173275991172872715L;
                                 double var464 = var704;
                                 net.C_47tf var465 = var306;
                                 long var466 = var35;
                                 net.C_478i var467 = var305;
                                 double var307 = net.C_47hN.method_42$1ea1bacfea(var467, var466, var465, var464);
                                 double var705 = var299.field_41;
                                 var722 = 4173625120190472003L;
                                 double var468 = var705;
                                 long var469 = var29;
                                 net.C_47tf var470 = var306;
                                 net.C_478i var471 = var305;
                                 var308 = net.C_47hN.method_47$c781022a65(var471, var470, var469, var468);
                                 if (var307 > 0.0) {
                                    double var869;
                                    var552 = (var869 = var307 - 1.0) == 0.0 ? 0 : (var869 < 0.0 ? -1 : 1);
                                    long var870;
                                    int var675 = (var870 = var1 - 0L) == 0L ? 0 : (var870 < 0L ? -1 : 1);
                                    if (var37) {
                                       break label587;
                                    }

                                    if (var552 < 0) {
                                       this.field_45q[0] = 0;
                                       var300 = true;
                                    }
                                 }

                                 double var871;
                                 var552 = (var871 = var308 - 0.0) == 0.0 ? 0 : (var871 < 0.0 ? -1 : 1);
                              }

                              if (var37) {
                                 break label592;
                              }

                              if (var552 > 0) {
                                 double var872;
                                 var552 = (var872 = var308 - 1.0) == 0.0 ? 0 : (var872 < 0.0 ? -1 : 1);
                                 long var873;
                                 int var676 = (var873 = var1 - 0L) == 0L ? 0 : (var873 < 0L ? -1 : 1);
                                 if (var37) {
                                    break label592;
                                 }

                                 if (var552 < 0) {
                                    this.field_45q[1] = 0;
                                    var301 = true;
                                 }
                              }
                           }
                        }

                        var10002 = 4176864353563356039L;
                        long var473 = var24;
                        client.setting.NumberSetting var475 = this.settingRandomizationStrength;
                        double var874;
                        var552 = (var874 = var475.method_44$474dfaa627(var473) - 0.0) == 0.0 ? 0 : (var874 < 0.0 ? -1 : 1);
                     }

                     label715: {
                        if (!var37) {
                           if (var552 <= 0) {
                              break label715;
                           }

                           var10001 = 4176945392628861011L;
                           client.setting.BooleanSetting var477 = this.settingRandomizeInNoRotationFovs;
                           var552 = ((var477.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        if (var552 != 0 || !var300) {
                           int[] var554 = this.field_45q;
                           int var678 = this.field_45q[0];
                           net.C_47MO var706 = net.C_476q.field_48;
                           var781 = 4176864353563356039L;
                           long var479 = var24;
                           client.setting.NumberSetting var481 = this.settingRandomizationStrength;
                           double var760 = -var481.method_44$474dfaa627(var479);
                           long var831 = 4176864353563356039L;
                           long var483 = var24;
                           client.setting.NumberSetting var485 = this.settingRandomizationStrength;
                           double var788 = var485.method_44$474dfaa627(var483);
                           long var810 = 4178712348352070711L;
                           double var487 = var788;
                           double var489 = var760;
                           long var491 = var5;
                           net.C_47MO var493 = var706;
                           var554[0] = var678 + var493.method_41$07400418b0(var491, var489, var487);
                        }

                        var10001 = 4176945392628861011L;
                        client.setting.BooleanSetting var495 = this.settingRandomizeInNoRotationFovs;
                        if (!var495.method_49$aae029aa0a()) {
                           long var875;
                           int var619 = (var875 = var1 - 0L) == 0L ? 0 : (var875 < 0L ? -1 : 1);
                           if (var301) {
                              break label715;
                           }
                        }

                        int[] var555 = this.field_45q;
                        int var679 = this.field_45q[1];
                        net.C_47MO var707 = net.C_476q.field_48;
                        var781 = 4176864353563356039L;
                        long var497 = var24;
                        client.setting.NumberSetting var499 = this.settingRandomizationStrength;
                        double var761 = -var499.method_44$474dfaa627(var497);
                        long var832 = 4176864353563356039L;
                        long var501 = var24;
                        client.setting.NumberSetting var503 = this.settingRandomizationStrength;
                        double var790 = var503.method_44$474dfaa627(var501);
                        long var811 = 4178712348352070711L;
                        double var505 = var790;
                        double var507 = var761;
                        long var509 = var5;
                        net.C_47MO var511 = var707;
                        var555[1] = var679 + var511.method_41$07400418b0(var509, var507, var505);
                     }

                     if (!var37) {
                        return;
                     }
                  }

                  var10001 = 4175065987729265250L;
                  client.setting.RangeSetting var513 = this.settingPreAimRange;
                  var513.method_43$fedcb3e4d3();
                  return;
               }

               float var41;
               boolean var53;
               boolean var54;
               net.C_477r var297;
               label702: {
                  long var10004 = 4176864353563356039L;
                  long var72 = var24;
                  client.setting.NumberSetting var74 = this.settingHorizontalBoxSize;
                  int var10003 = (int)var74.method_44$474dfaa627(var72);
                  var10004 = 4175410612538050896L;
                  int var75 = var10003;
                  long var76 = var9;
                  byte var78 = 100;
                  net.minecraft.entity.EntityLivingBase var79 = var518;
                  net.C_47tf var39 = net.C_47gg.method_45$3f2be61afc(var79, var78, var76, var75);
                  net.minecraft.entity.EntityLivingBase var519 = this.field_456;
                  short var624 = (short)var26;
                  short var709 = (short)var28;
                  long var10005 = 4173395635700465301L;
                  short var80 = var709;
                  int var81 = var27;
                  short var82 = var624;
                  AimAssist_47Cm var83 = this;
                  float var563 = var83.method_41$8a492dfcff(var82, var81, var80);
                  short var680 = (short)var15;
                  short var739 = (short)var17;
                  long var10006 = 4175966776827018364L;
                  short var84 = var739;
                  int var85 = var16;
                  short var86 = var680;
                  AimAssist_47Cm var87 = this;
                  float var625 = var87.method_49$8a492dfcff(var86, var85, var84);
                  short var710 = (short)var18;
                  var10006 = 4178638981055028080L;
                  int var88 = var20;
                  float var89 = var625;
                  int var90 = var19;
                  short var91 = var710;
                  float var92 = var563;
                  net.minecraft.entity.EntityLivingBase var93 = var519;
                  float[] var40 = net.C_47gg.method_47$6fbd4707ff(var93, var92, var91, var90, var89, var88);
                  var41 = Math.abs(var40[0]);
                  float var42 = Math.abs(var40[1]);
                  net.minecraft.entity.EntityLivingBase var520 = this.field_456;
                  short var626 = (short)var26;
                  short var711 = (short)var28;
                  var10005 = 4173395635700465301L;
                  short var94 = var711;
                  int var95 = var27;
                  short var96 = var626;
                  AimAssist_47Cm var97 = this;
                  float var564 = var97.method_41$8a492dfcff(var96, var95, var94);
                  var680 = (short)var15;
                  short var741 = (short)var17;
                  var10006 = 4175966776827018364L;
                  short var98 = var741;
                  int var99 = var16;
                  short var100 = var680;
                  AimAssist_47Cm var101 = this;
                  float var627 = var101.method_49$8a492dfcff(var100, var99, var98);
                  var10004 = 4178321291390407004L;
                  long var102 = var3;
                  float var104 = var627;
                  float var105 = var564;
                  net.minecraft.entity.EntityLivingBase var106 = var520;
                  float[] var43 = net.C_47gg.method_42$1708ca092a(var106, var105, var104, var102);
                  float var44 = Math.abs(var43[0]);
                  float var45 = Math.abs(var43[1]);
                  var10001 = 4176945392628861011L;
                  client.setting.BooleanSetting var107 = this.settingSmoothEarly;
                  if (var107.method_49$aae029aa0a()) {
                     var10002 = 4176127212453048451L;
                     long var108 = var13;
                     client.setting.ModeSetting var110 = this.settingNoRotationFovMode;
                     boolean var521 = var110.method_46$5f9dc63072(var108).equals((String)recovery$indy$flow$385(625, 1617241917243847157L ^ var1));
                     if (var1 >= 0L) {
                        float var273;
                        float var277;
                        label654: {
                           label653: {
                              if (var521) {
                                 long var683 = 4176864353563356039L;
                                 long var111 = var24;
                                 client.setting.NumberSetting var113 = this.settingNoRotationHorizontalFov;
                                 var44 = Math.max(var44 - (float)var113.method_44$474dfaa627(var111), 0.0F);
                                 long var684 = 4176864353563356039L;
                                 long var114 = var24;
                                 client.setting.NumberSetting var116 = this.settingNoRotationVerticalFov;
                                 var45 = Math.max(var45 - (float)var116.method_44$474dfaa627(var114), 0.0F);
                                 if (!var37) {
                                    break label653;
                                 }
                              }

                              var10002 = 4176864353563356039L;
                              long var349 = var24;
                              client.setting.NumberSetting var351 = this.settingNoRotationHorizontal;
                              var273 = (float)(var351.method_44$474dfaa627(var349) / 2.0);
                              var10002 = 4176864353563356039L;
                              long var353 = var24;
                              client.setting.NumberSetting var355 = this.settingNoRotationVertical;
                              var277 = (float)(var355.method_44$474dfaa627(var353) / 2.0);
                              if (var273 > 0.0F) {
                                 var525 = var277;
                                 long var876;
                                 int var572 = (var876 = var1 - 0L) == 0L ? 0 : (var876 < 0L ? -1 : 1);
                                 break label654;
                              }
                           }

                           var10001 = 4175065987729265250L;
                           client.setting.RangeSetting var357 = this.settingHorizontalSpeed;
                           var273 = net.C_47sk.method_46$ef9a6720f7((float)var357.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                           var10001 = 4175065987729265250L;
                           client.setting.RangeSetting var360 = this.settingVerticalSpeed;
                           var277 = net.C_47sk.method_46$ef9a6720f7((float)var360.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                           var10002 = 4176864353563356039L;
                           long var363 = var24;
                           client.setting.NumberSetting var366 = this.settingHorizontalSmoothness;
                           var525 = net.C_47sk.method_46$ef9a6720f7((float)var366.method_44$474dfaa627(var363), 1.0F, 10.0F);
                        }

                        float var281 = var525;
                        var10002 = 4176864353563356039L;
                        long var369 = var24;
                        client.setting.NumberSetting var372 = this.settingVerticalSmoothness;
                        float var285 = net.C_47sk.method_46$ef9a6720f7((float)var372.method_44$474dfaa627(var369), 1.0F, 10.0F);
                        float var289 = var273 == 0.0F
                           ? 0.0F
                           : var273 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var44), var273, var273 * var281) / (var273 * var281));
                        float var293 = var277 == 0.0F
                           ? 0.0F
                           : var277 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var45), var277, var277 * var285) / (var277 * var285));
                        double var526 = var39.field_40;
                        double var575 = var39.field_41;
                        double var685 = var39.field_47;
                        short var794 = (short)var26;
                        short var833 = (short)var28;
                        long var838 = 4173395635700465301L;
                        short var375 = var833;
                        int var378 = var27;
                        short var381 = var794;
                        AimAssist_47Cm var384 = this;
                        float var767 = var384.method_41$8a492dfcff(var381, var378, var375);
                        short var815 = (short)var15;
                        short var839 = (short)var17;
                        long var848 = 4175966776827018364L;
                        short var387 = var839;
                        int var390 = var16;
                        short var393 = var815;
                        AimAssist_47Cm var396 = this;
                        net.C_477r var715 = new net.C_477r(var767, var396.method_49$8a492dfcff(var393, var390, var387));
                        long var816 = 4175120221864514417L;
                        boolean var399 = false;
                        float var402 = var293;
                        float var405 = var289;
                        net.C_477r var408 = var715;
                        double var411 = var685;
                        long var414 = var33;
                        double var417 = var575;
                        double var420 = var526;
                        var297 = net.C_47gg.method_48$63715048f6(var420, var417, var414, var411, var408, var405, var402, var399);
                        float var576 = var297.field_44;
                        float var639 = var297.field_41;
                        short var716 = (short)var26;
                        short var768 = (short)var28;
                        long var795 = 4173395635700465301L;
                        short var423 = var768;
                        int var426 = var27;
                        short var429 = var716;
                        AimAssist_47Cm var432 = this;
                        float var744 = var432.method_41$8a492dfcff(var429, var426, var423);
                        byte var796 = (byte)var23;
                        var815 = (short)var15;
                        short var840 = (short)var17;
                        var848 = 4175966776827018364L;
                        short var435 = var840;
                        int var438 = var16;
                        short var441 = var815;
                        AimAssist_47Cm var444 = this;
                        float var797 = var444.method_49$8a492dfcff(var441, var438, var435);
                        long var818 = 4178517968599736394L;
                        this.field_45q = net.C_47gg.method_45$0e33825bca(var576, var639, var21, var22, var796, var744, var797);
                        var53 = false;
                        var54 = false;
                        var10002 = 4176127212453048451L;
                        long var447 = var13;
                        client.setting.ModeSetting var450 = this.settingNoRotationFovMode;
                        var524 = ((var450.method_46$5f9dc63072(var447).equals((String)recovery$indy$flow$492(625, 1617241917243847157L ^ var1))) ? 1 : 0);
                        long var877;
                        int var577 = (var877 = var1 - 0L) == 0L ? 0 : (var877 < 0L ? -1 : 1);
                        break label702;
                     }

                     float var46;
                     float var47;
                     label675: {
                        if (var521) {
                           var10002 = 4176864353563356039L;
                           long var117 = var24;
                           client.setting.NumberSetting var119 = this.settingNoRotationHorizontal;
                           var46 = (float)(var119.method_44$474dfaa627(var117) / 2.0);
                           var10002 = 4176864353563356039L;
                           long var120 = var24;
                           client.setting.NumberSetting var122 = this.settingNoRotationVertical;
                           var47 = (float)(var122.method_44$474dfaa627(var120) / 2.0);
                           if (var46 > 0.0F) {
                              var522 = var47;
                              long var878;
                              int var568 = (var878 = var1 - 0L) == 0L ? 0 : (var878 < 0L ? -1 : 1);
                              break label675;
                           }
                        }

                        var10001 = 4175065987729265250L;
                        client.setting.RangeSetting var162 = this.settingHorizontalSpeed;
                        var46 = net.C_47sk.method_46$ef9a6720f7((float)var162.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                        var10001 = 4175065987729265250L;
                        client.setting.RangeSetting var163 = this.settingVerticalSpeed;
                        var47 = net.C_47sk.method_46$ef9a6720f7((float)var163.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                        var10002 = 4176864353563356039L;
                        long var164 = var24;
                        client.setting.NumberSetting var166 = this.settingHorizontalSmoothness;
                        var522 = net.C_47sk.method_46$ef9a6720f7((float)var166.method_44$474dfaa627(var164), 1.0F, 10.0F);
                     }

                     float var48 = var522;
                     var10002 = 4176864353563356039L;
                     long var167 = var24;
                     client.setting.NumberSetting var169 = this.settingVerticalSmoothness;
                     float var49 = net.C_47sk.method_46$ef9a6720f7((float)var169.method_44$474dfaa627(var167), 1.0F, 10.0F);
                     float var50 = var46 == 0.0F ? 0.0F : var46 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var44), var46, var46 * var48) / (var46 * var48));
                     float var51 = var47 == 0.0F ? 0.0F : var47 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var45), var47, var47 * var49) / (var47 * var49));
                     double var523 = var39.field_40;
                     double var569 = var39.field_41;
                     double var682 = var39.field_47;
                     short var10007 = (short)var26;
                     short var10009 = (short)var28;
                     long var10010 = 4173395635700465301L;
                     short var170 = var10009;
                     int var171 = var27;
                     short var172 = var10007;
                     AimAssist_47Cm var173 = this;
                     float var764 = var173.method_41$8a492dfcff(var172, var171, var170);
                     short var10008 = (short)var15;
                     short var836 = (short)var17;
                     long var10011 = 4175966776827018364L;
                     short var174 = var836;
                     int var175 = var16;
                     short var176 = var10008;
                     AimAssist_47Cm var177 = this;
                     net.C_477r var713 = new net.C_477r(var764, var177.method_49$8a492dfcff(var176, var175, var174));
                     long var812 = 4175120221864514417L;
                     boolean var178 = false;
                     float var179 = var51;
                     float var180 = var50;
                     net.C_477r var181 = var713;
                     double var182 = var682;
                     long var184 = var33;
                     double var186 = var569;
                     double var188 = var523;
                     var297 = net.C_47gg.method_48$63715048f6(var188, var186, var184, var182, var181, var180, var179, var178);
                     float var570 = var297.field_44;
                     float var633 = var297.field_41;
                     short var714 = (short)var26;
                     short var765 = (short)var28;
                     long var791 = 4173395635700465301L;
                     short var190 = var765;
                     int var191 = var27;
                     short var192 = var714;
                     AimAssist_47Cm var193 = this;
                     float var742 = var193.method_41$8a492dfcff(var192, var191, var190);
                     byte var792 = (byte)var23;
                     var10008 = (short)var15;
                     short var837 = (short)var17;
                     var10011 = 4175966776827018364L;
                     short var194 = var837;
                     int var195 = var16;
                     short var196 = var10008;
                     AimAssist_47Cm var197 = this;
                     float var793 = var197.method_49$8a492dfcff(var196, var195, var194);
                     long var814 = 4178517968599736394L;
                     this.field_45q = net.C_47gg.method_45$0e33825bca(var570, var633, var21, var22, var792, var742, var793);
                     var53 = false;
                     var54 = false;
                     var10002 = 4176127212453048451L;
                     long var198 = var13;
                     client.setting.ModeSetting var200 = this.settingNoRotationFovMode;
                     var524 = ((var200.method_46$5f9dc63072(var198).equals((String)recovery$indy$flow$492(625, 1617241917243847157L ^ var1))) ? 1 : 0);
                     long var879;
                     int var571 = (var879 = var1 - 0L) == 0L ? 0 : (var879 < 0L ? -1 : 1);
                  } else {
                     var10001 = 4175065987729265250L;
                     client.setting.RangeSetting var358 = this.settingHorizontalSpeed;
                     float var274 = net.C_47sk.method_46$ef9a6720f7((float)var358.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                     var10001 = 4175065987729265250L;
                     client.setting.RangeSetting var361 = this.settingVerticalSpeed;
                     float var278 = net.C_47sk.method_46$ef9a6720f7((float)var361.method_43$fedcb3e4d3(), 0.0F, 180.0F);
                     var10002 = 4176864353563356039L;
                     long var364 = var24;
                     client.setting.NumberSetting var367 = this.settingHorizontalSmoothness;
                     float var282 = net.C_47sk.method_46$ef9a6720f7((float)var367.method_44$474dfaa627(var364), 1.0F, 10.0F);
                     var10002 = 4176864353563356039L;
                     long var370 = var24;
                     client.setting.NumberSetting var373 = this.settingVerticalSmoothness;
                     float var286 = net.C_47sk.method_46$ef9a6720f7((float)var373.method_44$474dfaa627(var370), 1.0F, 10.0F);
                     float var290 = var274 == 0.0F
                        ? 0.0F
                        : var274 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var44), var274, var274 * var282) / (var274 * var282));
                     float var294 = var278 == 0.0F
                        ? 0.0F
                        : var278 * (net.C_47sk.method_46$ef9a6720f7(Math.abs(var45), var278, var278 * var286) / (var278 * var286));
                     double var527 = var39.field_40;
                     double var580 = var39.field_41;
                     double var686 = var39.field_47;
                     short var798 = (short)var26;
                     short var834 = (short)var28;
                     long var841 = 4173395635700465301L;
                     short var376 = var834;
                     int var379 = var27;
                     short var382 = var798;
                     AimAssist_47Cm var385 = this;
                     float var770 = var385.method_41$8a492dfcff(var382, var379, var376);
                     short var819 = (short)var15;
                     short var842 = (short)var17;
                     long var850 = 4175966776827018364L;
                     short var388 = var842;
                     int var391 = var16;
                     short var394 = var819;
                     AimAssist_47Cm var397 = this;
                     net.C_477r var717 = new net.C_477r(var770, var397.method_49$8a492dfcff(var394, var391, var388));
                     long var820 = 4175120221864514417L;
                     boolean var400 = false;
                     float var403 = var294;
                     float var406 = var290;
                     net.C_477r var409 = var717;
                     double var412 = var686;
                     long var415 = var33;
                     double var418 = var580;
                     double var421 = var527;
                     var297 = net.C_47gg.method_48$63715048f6(var421, var418, var415, var412, var409, var406, var403, var400);
                     float var581 = var297.field_44;
                     float var643 = var297.field_41;
                     short var718 = (short)var26;
                     short var771 = (short)var28;
                     long var799 = 4173395635700465301L;
                     short var424 = var771;
                     int var427 = var27;
                     short var430 = var718;
                     AimAssist_47Cm var433 = this;
                     float var746 = var433.method_41$8a492dfcff(var430, var427, var424);
                     byte var800 = (byte)var23;
                     var819 = (short)var15;
                     short var843 = (short)var17;
                     var850 = 4175966776827018364L;
                     short var436 = var843;
                     int var439 = var16;
                     short var442 = var819;
                     AimAssist_47Cm var445 = this;
                     float var801 = var445.method_49$8a492dfcff(var442, var439, var436);
                     long var822 = 4178517968599736394L;
                     this.field_45q = net.C_47gg.method_45$0e33825bca(var581, var643, var21, var22, var800, var746, var801);
                     var53 = false;
                     var54 = false;
                     var10002 = 4176127212453048451L;
                     long var448 = var13;
                     client.setting.ModeSetting var451 = this.settingNoRotationFovMode;
                     var524 = ((var451.method_46$5f9dc63072(var448).equals((String)recovery$indy$flow$492(625, 1617241917243847157L ^ var1))) ? 1 : 0);
                     if (var1 >= 0L) {
                        break label702;
                     }
                  }

                  long var880;
                  int var645 = (var880 = var1 - 0L) == 0L ? 0 : (var880 < 0L ? -1 : 1);
                  if (!var37) {
                     AimAssist_47Cm var528;
                     if (var524 < 0) {
                        var528 = this;
                        long var881;
                        int var582 = (var881 = var1 - 0L) == 0L ? 0 : (var881 < 0L ? -1 : 1);
                     } else {
                        var528 = this;
                     }

                     var10002 = 4176864353563356039L;
                     long var231 = var24;
                     client.setting.NumberSetting var233 = var528.settingRandomizationStrength;
                     double var882;
                     var524 = (byte)((var882 = var233.method_44$474dfaa627(var231) - 0.0) == 0.0 ? 0 : (var882 < 0.0 ? -1 : 1));
                  }

                  label669: {
                     label716: {
                        if (!var37) {
                           if (var524 <= 0) {
                              break label716;
                           }

                           var10001 = 4176945392628861011L;
                           client.setting.BooleanSetting var234 = this.settingRandomizeInNoRotationFovs;
                           var524 = ((var234.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        if (var524 != 0 || !var53) {
                           int[] var530 = this.field_45q;
                           int var647 = this.field_45q[0];
                           net.C_47MO var687 = net.C_476q.field_48;
                           var10006 = 4176864353563356039L;
                           long var235 = var24;
                           client.setting.NumberSetting var237 = this.settingRandomizationStrength;
                           double var748 = -var237.method_44$474dfaa627(var235);
                           long var823 = 4176864353563356039L;
                           long var238 = var24;
                           client.setting.NumberSetting var240 = this.settingRandomizationStrength;
                           double var774 = var240.method_44$474dfaa627(var238);
                           long var802 = 4178712348352070711L;
                           double var241 = var774;
                           double var243 = var748;
                           long var245 = var5;
                           net.C_47MO var247 = var687;
                           var530[0] = var647 + var247.method_41$07400418b0(var245, var243, var241);
                        }

                        var10001 = 4176945392628861011L;
                        client.setting.BooleanSetting var248 = this.settingRandomizeInNoRotationFovs;
                        if (!var248.method_49$aae029aa0a()) {
                           var532 = var54;
                           long var883;
                           int var585 = (var883 = var1 - 0L) == 0L ? 0 : (var883 < 0L ? -1 : 1);
                           break label669;
                        }

                        int[] var531 = this.field_45q;
                        int var648 = this.field_45q[1];
                        net.C_47MO var688 = net.C_476q.field_48;
                        var10006 = 4176864353563356039L;
                        long var249 = var24;
                        client.setting.NumberSetting var251 = this.settingRandomizationStrength;
                        double var749 = -var251.method_44$474dfaa627(var249);
                        long var824 = 4176864353563356039L;
                        long var252 = var24;
                        client.setting.NumberSetting var254 = this.settingRandomizationStrength;
                        double var776 = var254.method_44$474dfaa627(var252);
                        long var803 = 4178712348352070711L;
                        double var255 = var776;
                        double var257 = var749;
                        long var259 = var5;
                        net.C_47MO var261 = var688;
                        var531[1] = var648 + var261.method_41$07400418b0(var259, var257, var255);
                     }

                     var532 = var37;
                  }

                  if (var532) {
                     var10001 = 4175065987729265250L;
                     client.setting.RangeSetting var262 = this.settingPreAimRange;
                     var262.method_43$fedcb3e4d3();
                  }

                  return;
               }

               label646: {
                  if (var524 != 0) {
                     double var533 = var41;
                     long var689 = 4176864353563356039L;
                     long var201 = var24;
                     client.setting.NumberSetting var203 = this.settingNoRotationHorizontalFov;
                     double var884;
                     var534 = (var884 = var533 - var203.method_44$474dfaa627(var201)) == 0.0 ? 0 : (var884 < 0.0 ? -1 : 1);
                     long var885;
                     int var649 = (var885 = var1 - 0L) == 0L ? 0 : (var885 < 0L ? -1 : 1);
                     if (var37) {
                        break label646;
                     }

                     if (var534 < 0) {
                        long var886;
                        int var587 = (var886 = var1 - 0L) == 0L ? 0 : (var886 < 0L ? -1 : 1);
                        this.field_45q[1] = 0;
                        var54 = true;
                     }
                  } else {
                     var10002 = 4176864353563356039L;
                     long var207 = var24;
                     client.setting.NumberSetting var209 = this.settingNoRotationHorizontal;
                     float var55 = (float)(var209.method_44$474dfaa627(var207) / 2.0);
                     var10002 = 4176864353563356039L;
                     long var210 = var24;
                     client.setting.NumberSetting var212 = this.settingNoRotationVertical;
                     float var56 = (float)(var212.method_44$474dfaa627(var210) / 2.0);
                     if (var55 > 0.0F && var56 > 0.0F) {
                        long var719 = 4175410612538050896L;
                        byte var213 = 100;
                        long var214 = var9;
                        byte var216 = 100;
                        net.minecraft.entity.EntityLivingBase var217 = this.field_456;
                        net.C_47tf var264 = net.C_47gg.method_45$3f2be61afc(var217, var216, var214, var213);
                        net.C_47tf var57 = this.field_456.method_45$6684d3c618().method_49$b2124a4855();
                        net.C_478i var58 = new net.C_478i(
                           var57.field_40 - var55,
                           var264.field_41 - var56,
                           var57.field_47 - var55,
                           var57.field_40 + var55,
                           var264.field_41 + var56,
                           var57.field_47 + var55
                        );
                        var10001 = 4175635081395730961L;
                        net.minecraft.client.Minecraft var218 = field_43;
                        net.C_47tf var59 = var218.field_42P.method_49$41b79b67a0(1.0F);
                        double var690 = var297.field_44 % 360.0F;
                        var719 = 4173275991172872715L;
                        double var219 = var690;
                        net.C_47tf var221 = var59;
                        long var222 = var35;
                        net.C_478i var224 = var58;
                        double var60 = net.C_47hN.method_42$1ea1bacfea(var224, var222, var221, var219);
                        var690 = var297.field_41;
                        var719 = 4173625120190472003L;
                        double var225 = var690;
                        long var227 = var29;
                        net.C_47tf var229 = var59;
                        net.C_478i var230 = var58;
                        double var62 = net.C_47hN.method_47$c781022a65(var230, var229, var227, var225);
                        boolean var589;
                        if (var60 > 0.0) {
                           double var887;
                           var534 = (var887 = var60 - 1.0) == 0.0 ? 0 : (var887 < 0.0 ? -1 : 1);
                           var589 = var37;
                           long var888;
                           int var652 = (var888 = var1 - 0L) == 0L ? 0 : (var888 < 0L ? -1 : 1);
                        } else {
                           double var889;
                           var534 = (var889 = var62 - 0.0) == 0.0 ? 0 : (var889 < 0.0 ? -1 : 1);
                           var589 = var37;
                        }

                        if (var589) {
                           break label646;
                        }

                        if (var534 > 0) {
                           double var890;
                           var534 = (var890 = var62 - 1.0) == 0.0 ? 0 : (var890 < 0.0 ? -1 : 1);
                           long var891;
                           int var653 = (var891 = var1 - 0L) == 0L ? 0 : (var891 < 0L ? -1 : 1);
                           if (var37) {
                              break label646;
                           }

                           if (var534 < 0) {
                              this.field_45q[1] = 0;
                              var54 = true;
                           }
                        }
                     }
                  }

                  var10002 = 4176864353563356039L;
                  long var472 = var24;
                  client.setting.NumberSetting var474 = this.settingRandomizationStrength;
                  double var892;
                  var534 = (var892 = var474.method_44$474dfaa627(var472) - 0.0) == 0.0 ? 0 : (var892 < 0.0 ? -1 : 1);
               }

               label717: {
                  if (!var37) {
                     if (var534 <= 0) {
                        break label717;
                     }

                     var10001 = 4176945392628861011L;
                     client.setting.BooleanSetting var476 = this.settingRandomizeInNoRotationFovs;
                     var534 = ((var476.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  if (var534 != 0 || !var53) {
                     int[] var535 = this.field_45q;
                     int var655 = this.field_45q[0];
                     net.C_47MO var692 = net.C_476q.field_48;
                     long var777 = 4176864353563356039L;
                     long var478 = var24;
                     client.setting.NumberSetting var480 = this.settingRandomizationStrength;
                     double var750 = -var480.method_44$474dfaa627(var478);
                     long var825 = 4176864353563356039L;
                     long var482 = var24;
                     client.setting.NumberSetting var484 = this.settingRandomizationStrength;
                     double var778 = var484.method_44$474dfaa627(var482);
                     long var804 = 4178712348352070711L;
                     double var486 = var778;
                     double var488 = var750;
                     long var490 = var5;
                     net.C_47MO var492 = var692;
                     var535[0] = var655 + var492.method_41$07400418b0(var490, var488, var486);
                  }

                  var10001 = 4176945392628861011L;
                  client.setting.BooleanSetting var494 = this.settingRandomizeInNoRotationFovs;
                  if (!var494.method_49$aae029aa0a()) {
                     long var893;
                     int var592 = (var893 = var1 - 0L) == 0L ? 0 : (var893 < 0L ? -1 : 1);
                     if (var54) {
                        break label717;
                     }
                  }

                  int[] var536 = this.field_45q;
                  int var656 = this.field_45q[1];
                  net.C_47MO var693 = net.C_476q.field_48;
                  long var779 = 4176864353563356039L;
                  long var496 = var24;
                  client.setting.NumberSetting var498 = this.settingRandomizationStrength;
                  double var751 = -var498.method_44$474dfaa627(var496);
                  long var826 = 4176864353563356039L;
                  long var500 = var24;
                  client.setting.NumberSetting var502 = this.settingRandomizationStrength;
                  double var780 = var502.method_44$474dfaa627(var500);
                  long var805 = 4178712348352070711L;
                  double var504 = var780;
                  double var506 = var751;
                  long var508 = var5;
                  net.C_47MO var510 = var693;
                  var536[1] = var656 + var510.method_41$07400418b0(var508, var506, var504);
               }

               if (var37) {
                  var10001 = 4175065987729265250L;
                  client.setting.RangeSetting var512 = this.settingPreAimRange;
                  var512.method_43$fedcb3e4d3();
               }

               return;
            }
         }
      }
   }
















   private boolean method_49T$aae029aa0a() {
      long var1 = a ^ 101642486131278L;
      long var3 = var1 ^ 43187876075199L;
      long var10002 = -3217047135406204371L;
      long var5 = var3;
      ModeSetting var7 = this.settingNoRotationFovMode;
      return var7.method_46$5f9dc63072(var5).equals("3D");
   }



   private boolean method_49J$aae029aa0a() {
      long var1 = a ^ 86563458240008L;
      long var3 = var1 ^ 58878270731001L;
      long var10002 = -5252091725328499093L;
      long var5 = var3;
      ModeSetting var7 = this.settingNoRotationFovMode;
      return var7.method_46$5f9dc63072(var5).equals("3D");
   }



   private boolean method_49W$aae029aa0a() {
      long var1 = a ^ 40536489987389L;
      long var3 = var1 ^ 109457762302018L;
      long var10000 = 8371537831284930177L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 8370536318119503450L;
      long var6 = var3;
      NumberSetting var8 = this.settingRandomizationStrength;
      double var10;
      int var9 = (var10 = var8.method_44$474dfaa627(var6) - 0.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
      if (!var5) {
         var9 = var9 > 0 ? 1 : 0;
      }

      return var9 != 0;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_45L = System.currentTimeMillis();
      this.field_453 = System.currentTimeMillis();
   }



   public void method_488$e45a9973e5(long var1) {
      this.field_43y = (int)Math.abs(this.field_453 - System.currentTimeMillis());
      this.field_453 = System.currentTimeMillis();
      this.field_40[0] = this.field_40[1] = 0;
      this.field_45a[0] = this.field_45a[1] = 0.0;
   }



   private boolean method_49u$c63877e5e5(int var1, short var2, int var3) {
      long var4;
      int var6;
      int var7;
      int var8;
      boolean var9;
      EntityLivingBase var10;
      label126: {
         var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
         long var10001 = var4 ^ 80636769391689L;
         var6 = (int)((var4 ^ 80636769391689L) >>> 48);
         var7 = (int)((var4 ^ 80636769391689L) << 16 >>> 32);
         var8 = (int)(var10001 << 48 >>> 48);
         var9 = recovery$indy$102(-8922225792681933183L, var4);
         int var10000 = (int) ((recovery$indy$103(field_43, -8921710238751471668L, var4).field_427) ? 1 : 0);
         if (!var9) {
            if (var10000 != 0) {
               return false;
            }

            var10 = recovery$indy$104(field_43, -8921710238751471668L, var4);
            if (var9) {
               break label126;
            }

            var10000 = var10.field_48y;
         }

         if (var10000 <= 20) {
            return false;
         }

         var10 = this.field_456;
      }

      if (var10 != null) {
         boolean var11 = recovery$indy$105(field_43, -8919541072516020011L, var4);
         boolean var13 = var9;
         if (var3 >= 0) {
            if (!var9) {
               if (!var11) {
                  return false;
               }

               var11 = recovery$indy$106(this.settingClick, -8923285070859881074L, var4);
            }

            var13 = var9;
         }

         label112: {
            label111:
            if (!var13) {
               if (var11) {
                  var11 = recovery$indy$107(field_43, -8920117460053846608L, var4).field_44l.method_42$aae029aa0a();
                  var13 = var9;
                  if (var3 <= 0) {
                     break label112;
                  }

                  if (var9) {
                     break label111;
                  }

                  if (!var11) {
                     return false;
                  }
               }

               var11 = recovery$indy$108(ClientGlobals.field_46, (char)var6, var7, ClientGlobals.field_48.field_46k, (char)var8, -8922452171349200474L, var4);
            }

            var13 = var9;
         }

         if (var3 > 0) {
            if (!var13) {
               if (var11) {
                  return false;
               }

               var11 = recovery$indy$109(this.settingDiggingCheck, -8923285070859881074L, var4);
            }

            var13 = var9;
         }

         if (var13) {
            return var11;
         }

         if (!var11) {
            return true;
         }

         boolean var15 = recovery$indy$110(field_43, -8920117460053846608L, var4).field_44l.method_42$aae029aa0a();
         if (var9) {
            return var15;
         }

         if (!var15) {
            return true;
         }

         C_47Ij var12 = recovery$indy$111(field_43, -8919429945471038844L, var4);
         if (!var9) {
            if (var12 == null) {
               return true;
            }

            var12 = recovery$indy$112(field_43, -8919429945471038844L, var4);
         }

         if (var12.field_49 != C_47Az.BLOCK) {
            return true;
         }
      }

      return false;
   }




   private boolean method_49m$aae029aa0a() {
      long var1 = a ^ 132363432160555L;
      long var3 = var1 ^ 3660538859994L;
      long var10002 = -7764235719489249976L;
      long var5 = var3;
      ModeSetting var7 = this.settingNoRotationFovMode;
      return var7.method_46$5f9dc63072(var5).equals("2D");
   }



    public AimAssist_47Cm(long a0) {
        super((java.lang.String) ("AimAssist"),(java.lang.String) ("Ziehlhilfe"),(long) (((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 117009222069997L)),(java.awt.Color) (new java.awt.Color((int) (66),(int) (135),(int) (245))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 20471061948363L);
        long constructorKey4 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 130454873928387L);
        long constructorKey5 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 38629782718224L);
        long constructorKey6 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 125651546515453L);
        long constructorKey7 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 30029718958838L);
        int constructorPart8 = (int) ((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 80098009576211L) >>> 32));
        int constructorPart9 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 80098009576211L) << 32) >>> 48));
        int constructorPart10 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 80098009576211L) << 48) >>> 48));
        long constructorKey11 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 138158031352905L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 13364747063925L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 13364747063925L) << 32) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 13364747063925L) << 48) >>> 48));
        long constructorKey15 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 100702158218011L);
        int constructorPart16 = (int) ((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 120267926080519L) >>> 48));
        int constructorPart17 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 120267926080519L) << 16) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 120267926080519L) << 32) >>> 32));
        long constructorKey19 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 37242809949728L);
        int constructorPart20 = (int) ((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 15103612613467L) >>> 32));
        int constructorPart21 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 15103612613467L) << 32) >>> 48));
        int constructorPart22 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 15103612613467L) << 48) >>> 48));
        int constructorPart23 = (int) ((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 125730495496007L) >>> 32));
        int constructorPart24 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 125730495496007L) << 32) >>> 48));
        int constructorPart25 = (int) (((((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 125730495496007L) << 48) >>> 48));
        long constructorKey26 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 59476269272433L);
        long constructorKey27 = ((augustus.recovered.modules.legit.AimAssist_47Cm.a ^ a0) ^ 49037902632519L);
        short converted28 = (short) (constructorPart13);
        short converted29 = (short) (constructorPart14);
        client.setting.RangeSetting initialized30 = new client.setting.RangeSetting(constructorPart12, this, "Pre aim range", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4617315517961601024L), converted28, 0.0D, Double.longBitsToDouble(4621819117588971520L), 1, converted29);
        long initialValue31 = constructorKey5;
        client.setting.RangeSetting initialValue32 = initialized30;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = recovery$indy$flow$638(initialValue33, initialValue31);
        recovery$indy$flow$639(this, initialValue34);
        java.lang.Object initialValue35 = recovery$indy$flow$641(2);
        ((java.lang.Object[]) initialValue35)[0] = "Stable";
        ((java.lang.Object[]) initialValue35)[1] = "Experimental";
        client.setting.ModeSetting initialized36 = new client.setting.ModeSetting(this, "Mode", constructorKey19, "Stable", (java.lang.String[]) (initialValue35));
        recovery$indy$flow$643(this, initialized36);
        java.lang.Object initialValue37 = recovery$indy$flow$644(this);
        recovery$indy$flow$645(this, initialValue37);
        java.lang.Object initialValue38 = recovery$indy$flow$646(this);
        recovery$indy$flow$647(this, initialValue38);
        client.setting.NumberSetting initialized39 = new client.setting.NumberSetting(this, "Strength", Double.longBitsToDouble(4611686018427387904L), constructorKey26, 1.0D, Double.longBitsToDouble(4617315517961601024L), 2);
        java.lang.Object initialValue40 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).field_458));
        java.lang.Object initialValue41 = initialValue40;
        client.setting.NumberSetting initialValue42 = initialized39;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue45 = recovery$indy$flow$653(initialValue43, initialValue44);
        recovery$indy$flow$654(this, initialValue45);
        client.setting.NumberSetting initialized46 = new client.setting.NumberSetting(this, "Faster mouse movement", 1.0D, constructorKey26, 1.0D, Double.longBitsToDouble(4617315517961601024L), 2);
        java.lang.Object initialValue47 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).field_458));
        java.lang.Object initialValue48 = initialValue47;
        client.setting.NumberSetting initialValue49 = initialized46;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue52 = recovery$indy$flow$660(initialValue50, initialValue51);
        recovery$indy$flow$661(this, initialValue52);
        client.setting.SettingGroup initialized53 = new client.setting.SettingGroup(this, "Improve your aim input", constructorKey6);
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).field_45t));
        char converted55 = (char) (constructorPart21);
        java.lang.Object initialValue56 = initialValue54;
        int initialValue57 = constructorPart22;
        int initialValue58 = (int) (converted55);
        int initialValue59 = constructorPart20;
        client.setting.SettingGroup initialValue60 = initialized53;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue63 = recovery$indy$flow$667(initialValue61, initialValue59, (char) (initialValue58), initialValue57, initialValue62);
        recovery$indy$flow$668(this, initialValue63);
        java.lang.Object initialValue64 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingImproveYourAimInput));
        client.setting.NumberSetting initialized65 = new client.setting.NumberSetting(this, "Own horizontal rotation multiplier", 1.0D, 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue64), constructorKey27);
        recovery$indy$flow$672(this, initialized65);
        java.lang.Object initialValue66 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingImproveYourAimInput));
        client.setting.NumberSetting initialized67 = new client.setting.NumberSetting(this, "Own vertical rotation multiplier", 1.0D, 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue66), constructorKey27);
        recovery$indy$flow$676(this, initialized67);
        java.lang.Object initialValue68 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingImproveYourAimInput));
        client.setting.NumberSetting initialized69 = new client.setting.NumberSetting(this, "Horizontal assist multiplier", 1.0D, 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue68), constructorKey27);
        recovery$indy$flow$680(this, initialized69);
        java.lang.Object initialValue70 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingImproveYourAimInput));
        client.setting.NumberSetting initialized71 = new client.setting.NumberSetting(this, "Vertical assist multiplier", 1.0D, 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue70), constructorKey27);
        recovery$indy$flow$684(this, initialized71);
        client.setting.SettingGroup initialized72 = new client.setting.SettingGroup(this, "Auto aim", constructorKey6);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).field_45t));
        char converted74 = (char) (constructorPart21);
        java.lang.Object initialValue75 = initialValue73;
        int initialValue76 = constructorPart22;
        int initialValue77 = (int) (converted74);
        int initialValue78 = constructorPart20;
        client.setting.SettingGroup initialValue79 = initialized72;
        java.lang.Object initialValue80 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue79))))));
        java.lang.Object initialValue81 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue82 = recovery$indy$flow$690(initialValue80, initialValue78, (char) (initialValue77), initialValue76, initialValue81);
        recovery$indy$flow$691(this, initialValue82);
        java.lang.Object initialValue83 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.RangeSetting initialized84 = new client.setting.RangeSetting(constructorPart23, this, " horizontal speed", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4618441417868443648L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 1, (client.setting.SettingGroup) (initialValue83));
        long initialValue85 = constructorKey5;
        client.setting.RangeSetting initialValue86 = initialized84;
        java.lang.Object initialValue87 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue86))))));
        java.lang.Object initialValue88 = recovery$indy$flow$696(initialValue87, initialValue85);
        recovery$indy$flow$697(this, initialValue88);
        java.lang.Object initialValue89 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.RangeSetting initialized90 = new client.setting.RangeSetting(constructorPart23, this, " vertical speed", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4618441417868443648L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 1, (client.setting.SettingGroup) (initialValue89));
        long initialValue91 = constructorKey5;
        client.setting.RangeSetting initialValue92 = initialized90;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = recovery$indy$flow$702(initialValue93, initialValue91);
        recovery$indy$flow$703(this, initialValue94);
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized96 = new client.setting.NumberSetting(this, "Horizontal smoothness", Double.longBitsToDouble(4617315517961601024L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue95), constructorKey27);
        recovery$indy$flow$707(this, initialized96);
        java.lang.Object initialValue97 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized98 = new client.setting.NumberSetting(this, "Vertical smoothness", Double.longBitsToDouble(4617315517961601024L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue97), constructorKey27);
        recovery$indy$flow$711(this, initialized98);
        short converted99 = (short) (constructorPart16);
        char converted100 = (char) (constructorPart17);
        java.lang.Object initialValue101 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.BooleanSetting initialized102 = new client.setting.BooleanSetting(this, "Smooth early", converted99, converted100, constructorPart18, true, (client.setting.SettingGroup) (initialValue101));
        recovery$indy$flow$715(this, initialized102);
        java.lang.Object initialValue103 = recovery$indy$flow$717(2);
        ((java.lang.Object[]) initialValue103)[0] = "2D";
        ((java.lang.Object[]) initialValue103)[1] = "3D";
        java.lang.Object initialValue104 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.ModeSetting initialized105 = new client.setting.ModeSetting(this, "NoRotationFovMode", "2D", (java.lang.String[]) (initialValue103), (client.setting.SettingGroup) (initialValue104), constructorKey11);
        recovery$indy$flow$720(this, initialized105);
        java.lang.Object initialValue106 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized107 = new client.setting.NumberSetting(this, "No rotation horizontal fov", Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 0, (client.setting.SettingGroup) (initialValue106), constructorKey27);
        java.lang.Object initialValue108 = recovery$indy$flow$724(this);
        java.lang.Object initialValue109 = initialValue108;
        client.setting.NumberSetting initialValue110 = initialized107;
        java.lang.Object initialValue111 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue112 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue113 = recovery$indy$flow$727(initialValue111, initialValue112);
        recovery$indy$flow$728(this, initialValue113);
        java.lang.Object initialValue114 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized115 = new client.setting.NumberSetting(this, "No rotation vertical fov", Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 0, (client.setting.SettingGroup) (initialValue114), constructorKey27);
        java.lang.Object initialValue116 = recovery$indy$flow$732(this);
        java.lang.Object initialValue117 = initialValue116;
        client.setting.NumberSetting initialValue118 = initialized115;
        java.lang.Object initialValue119 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue120 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue117))))));
        java.lang.Object initialValue121 = recovery$indy$flow$735(initialValue119, initialValue120);
        recovery$indy$flow$736(this, initialValue121);
        java.lang.Object initialValue122 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized123 = new client.setting.NumberSetting(this, "No rotation horizontal", Double.longBitsToDouble(4610560118520545280L), 0.0D, Double.longBitsToDouble(4613937818241073152L), 2, (client.setting.SettingGroup) (initialValue122), constructorKey27);
        java.lang.Object initialValue124 = recovery$indy$flow$740(this);
        java.lang.Object initialValue125 = initialValue124;
        client.setting.NumberSetting initialValue126 = initialized123;
        java.lang.Object initialValue127 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue126))))));
        java.lang.Object initialValue128 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue125))))));
        java.lang.Object initialValue129 = recovery$indy$flow$743(initialValue127, initialValue128);
        recovery$indy$flow$744(this, initialValue129);
        java.lang.Object initialValue130 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized131 = new client.setting.NumberSetting(this, "No rotation vertical", 1.0D, 0.0D, Double.longBitsToDouble(4613937818241073152L), 2, (client.setting.SettingGroup) (initialValue130), constructorKey27);
        java.lang.Object initialValue132 = recovery$indy$flow$748(this);
        java.lang.Object initialValue133 = initialValue132;
        client.setting.NumberSetting initialValue134 = initialized131;
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue133))))));
        java.lang.Object initialValue137 = recovery$indy$flow$751(initialValue135, initialValue136);
        recovery$indy$flow$752(this, initialValue137);
        java.lang.Object initialValue138 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized139 = new client.setting.NumberSetting(this, "Horizontal box size", Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue138), constructorKey27);
        recovery$indy$flow$756(this, initialized139);
        java.lang.Object initialValue140 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.NumberSetting initialized141 = new client.setting.NumberSetting(this, "Randomization strength", 0.0D, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, (client.setting.SettingGroup) (initialValue140), constructorKey27);
        recovery$indy$flow$760(this, initialized141);
        short converted142 = (short) (constructorPart16);
        char converted143 = (char) (constructorPart17);
        java.lang.Object initialValue144 = ((java.lang.Object)(((augustus.recovered.modules.legit.AimAssist_47Cm) (((java.lang.Object)(this)))).settingAutoAim));
        client.setting.BooleanSetting initialized145 = new client.setting.BooleanSetting(this, "Randomize in no rotation fovs", converted142, converted143, constructorPart18, true, (client.setting.SettingGroup) (initialValue144));
        java.lang.Object initialValue146 = recovery$indy$flow$764(this);
        java.lang.Object initialValue147 = initialValue146;
        long initialValue148 = constructorKey3;
        client.setting.BooleanSetting initialValue149 = initialized145;
        java.lang.Object initialValue150 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue149))))));
        java.lang.Object initialValue151 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue152 = recovery$indy$flow$767(initialValue150, initialValue148, initialValue151);
        java.lang.Object initialValue153 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue152))))));
        recovery$indy$flow$769(this, initialValue153);
        client.setting.NumberSetting initialized154 = new client.setting.NumberSetting(this, "Horizontal fov", Double.longBitsToDouble(4636033603912859648L), constructorKey26, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$772(this, initialized154);
        client.setting.NumberSetting initialized155 = new client.setting.NumberSetting(this, "Vertical fov", Double.longBitsToDouble(4636033603912859648L), constructorKey26, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$775(this, initialized155);
        client.setting.BooleanSetting initialized156 = new client.setting.BooleanSetting(this, constructorKey7, "Click", true);
        recovery$indy$flow$778(this, initialized156);
        client.setting.BooleanSetting initialized157 = new client.setting.BooleanSetting(this, constructorKey7, "Digging check", true);
        recovery$indy$flow$781(this, initialized157);
        client.setting.BooleanSetting initialized158 = new client.setting.BooleanSetting(this, constructorKey7, "Single target", true);
        recovery$indy$flow$784(this, initialized158);
        java.lang.Object initialValue159 = recovery$indy$flow$786();
        client.setting.MultiSelectSetting initialized160 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey15, (net.C_47OZ[]) (initialValue159));
        recovery$indy$flow$788(this, initialized160);
        char converted161 = (char) (constructorPart9);
        net.C_47Tf initialized162 = new net.C_47Tf(constructorPart8, converted161, this, constructorPart10);
        recovery$indy$flow$791(this, initialized162);
        recovery$indy$flow$792(this, 0.0F);
        recovery$indy$flow$793(this, null);
        recovery$indy$flow$794(this, null);
        double[] values163 = new double[2];
        recovery$indy$flow$795(this, values163);
        double[] values164 = new double[2];
        recovery$indy$flow$796(this, values164);
        int[] values165 = new int[2];
        recovery$indy$flow$797(this, values165);
        int[] values166 = new int[2];
        recovery$indy$flow$798(this, values166);
        double[] values167 = new double[2];
        recovery$indy$flow$799(this, values167);
        int[] values168 = new int[2];
        recovery$indy$flow$800(this, values168);
        net.C_47gg initialized169 = new net.C_47gg(constructorKey4);
        recovery$indy$flow$803(this, initialized169);
        recovery$indy$flow$804(this, 0L);
        recovery$indy$flow$805(this, 0);
        recovery$indy$flow$806(this, 0L);
    }








    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$342(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$347(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$348(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$385(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$492(int a0,long a1);

    private static native java.lang.Object recovery$indy$flow$638(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$641(int a0);
    private static void recovery$indy$flow$643(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).settingMode = ((client.setting.ModeSetting) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$644(java.lang.Object a0);
    private static void recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45t = ((net.C_45n) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$646(java.lang.Object a0);
    private static void recovery$indy$flow$647(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_458 = ((net.C_45n) (a1));
        return;
    }



    private static native java.lang.Object recovery$indy$flow$653(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$654(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).settingStrength = ((client.setting.NumberSetting) (a1));
        return;
    }



    private static native java.lang.Object recovery$indy$flow$660(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$661(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).settingFasterMouseMovement = ((client.setting.NumberSetting) (a1));
        return;
    }



    private static native java.lang.Object recovery$indy$flow$667(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$668(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$672(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$676(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$680(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$684(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$690(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$691(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$696(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$697(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$702(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$703(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$711(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$715(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$717(int a0);

    private static native void recovery$indy$flow$720(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$724(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$727(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$728(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$732(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$735(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$736(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$740(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$743(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$744(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$748(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$751(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$752(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$756(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$760(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$764(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$767(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$769(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$772(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$775(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$778(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$784(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$786();
    private static native void recovery$indy$flow$788(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$791(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$792(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45G = a1;
        return;
    }
    private static void recovery$indy$flow$793(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_456 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$794(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45l = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$795(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$796(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$797(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_48 = ((int[]) (a1));
        return;
    }
    private static void recovery$indy$flow$798(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45q = ((int[]) (a1));
        return;
    }
    private static void recovery$indy$flow$799(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45a = ((double[]) (a1));
        return;
    }
    private static void recovery$indy$flow$800(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_40 = ((int[]) (a1));
        return;
    }
    private static native void recovery$indy$flow$803(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$804(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_453 = a1;
        return;
    }
    private static void recovery$indy$flow$805(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$806(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AimAssist_47Cm) (a0)).field_45L = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native float recovery$indy$1(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$2(Object var0, long var1, float var3, long var4, long var6);
   private static native boolean recovery$indy$3(long var0, long var2);
   private static native float recovery$indy$4(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$5(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$6(Object var0, long var1, long var3);
   private static native C_477r recovery$indy$7(
      long var0, double var2, double var4, double var6, Object var8, float var9, float var10, boolean var11, float var12, long var13, long var15
   );
   private static native float recovery$indy$8(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$9(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native int[] recovery$indy$10(float var0, float var1, int var2, int var3, byte var4, float var5, float var6, long var7, long var9);
   private static native float recovery$indy$11(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$12(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$13(Object var0, long var1, long var3);
   private static native float recovery$indy$14(Object var0, long var1, long var3);
   private static native C_477r recovery$indy$15(
      long var0, double var2, double var4, double var6, Object var8, float var9, float var10, boolean var11, float var12, long var13, long var15
   );
   private static native float recovery$indy$16(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$17(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native int[] recovery$indy$18(float var0, float var1, int var2, int var3, byte var4, float var5, float var6, long var7, long var9);
   private static native int recovery$indy$19(Object var0, long var1, long var3);
   private static native int recovery$indy$20(Object var0, long var1, long var3);
   private static native int recovery$indy$21(Object var0, long var1, long var3);
   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$24(Object var0, long var1, long var3);
   private static native int recovery$indy$25(Object var0, long var1, long var3);
   private static native double recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$28(Object var0, long var1, long var3);
   private static native int recovery$indy$29(Object var0, long var1, long var3);
   private static native int recovery$indy$30(Object var0, long var1, long var3);
   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$33(Object var0, long var1, long var3);
   private static native int recovery$indy$34(Object var0, long var1, long var3);
   private static native double recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$36(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$37(Object var0, long var1, long var3);
   private static native double recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$39(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$40(Object var0, long var1, long var3);
   private static native double recovery$indy$41(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$43(Object var0, long var1, long var3);
   private static native void recovery$indy$44(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$45(Object var0, long var1, long var3);
   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4);
   private static native Client recovery$indy$47(long var0, long var2);
   private static native C_47y6 recovery$indy$48(Object var0, long var1, long var3);
   private static native float recovery$indy$49(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$50(Object var0, long var1, float var3, long var4, long var6);
   private static native float recovery$indy$51(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$52(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native float recovery$indy$53(Object var0, long var1, long var3);
   private static native C_477r recovery$indy$54(
      long var0, double var2, double var4, double var6, Object var8, float var9, float var10, boolean var11, float var12, long var13, long var15
   );
   private static native boolean recovery$indy$55(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);
   private static native double recovery$indy$57(long var0, double var2, double var4, long var6, long var8);
   private static native EntityPlayerSP recovery$indy$58(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$59(Object var0, long var1, long var3);
   private static native boolean recovery$indy$60(Object var0, long var1, long var3);
   private static native double recovery$indy$61(Object var0, boolean var1, long var2, long var4, long var6);
   private static native double recovery$indy$62(Object var0, boolean var1, long var2, long var4, long var6);
   private static native int recovery$indy$63(Object var0, long var1, long var3);
   private static native int recovery$indy$64(Object var0, long var1, long var3);
   private static native int recovery$indy$65(Object var0, long var1, long var3);
   private static native int recovery$indy$66(Object var0, long var1, long var3);
   private static native int recovery$indy$67(Object var0, long var1, long var3);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$69(Object var0, long var1, long var3);
   private static native int recovery$indy$70(Object var0, long var1, long var3);
   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$72(Object var0, long var1, long var3);
   private static native int recovery$indy$73(Object var0, long var1, long var3);
   private static native int recovery$indy$74(Object var0, long var1, long var3);
   private static native int recovery$indy$75(Object var0, long var1, long var3);
   private static native int recovery$indy$76(Object var0, long var1, long var3);
   private static native void recovery$indy$77(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$78(Object var0, long var1, long var3);
   private static native int recovery$indy$79(Object var0, long var1, long var3);
   private static native void recovery$indy$80(Object var0, int var1, long var2, long var4);
   private static native boolean recovery$indy$81(long var0, long var2);
   private static native boolean recovery$indy$82(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4);
   private static native void recovery$indy$84(Object var0, int var1, long var2, long var4);
   private static native boolean recovery$indy$85(Object var0, int var1, short var2, int var3, long var4, long var6);
   private static native String recovery$indy$86(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$87(int var0, long var1);
   private static native void recovery$indy$88(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$89(Object var0, char var1, Object var2, long var3, long var5, long var7);
   private static native float recovery$indy$90(Object var0, long var1, long var3);
   private static native boolean recovery$indy$91(
      Object var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      long var9,
      boolean var11,
      boolean var12,
      boolean var13,
      long var14,
      long var16
   );
   private static native Client recovery$indy$92(long var0, long var2);
   private static native C_47y6 recovery$indy$93(Object var0, long var1, long var3);
   private static native void recovery$indy$94(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$95(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$96(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$102(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$103(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$104(Object var0, long var1, long var3);
   private static native boolean recovery$indy$105(Object var0, long var1, long var3);
   private static native boolean recovery$indy$106(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$107(Object var0, long var1, long var3);
   private static native boolean recovery$indy$108(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native boolean recovery$indy$109(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$110(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$111(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$112(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$120();
}
