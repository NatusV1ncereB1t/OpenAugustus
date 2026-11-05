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
import java.util.Arrays;
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
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Br;
import net.C_47F9;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import net.C_47OA;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Tf;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47VU;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oo;
import net.C_47qB;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_47y6;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AimBot_47O_ extends net.C_47OA implements net.C_47oO,net.C_47xz,net.C_476x {
    public final client.setting.NumberSetting settingPreAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingOwnYawMul = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingOwnPitchMul = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAssistYawMul = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAssistPitchMul = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingYawFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPitchFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDiggingCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingTargetSort = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47Tf field_431 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public net.minecraft.entity.EntityLivingBase field_43c; // Runtime access flags and ConstantValue are restored from the original class.
    public net.minecraft.entity.EntityLivingBase field_41; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_43O; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_43R = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final int[] field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_43H; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_477r field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_43s; // Runtime access flags and ConstantValue are restored from the original class.
    private static long b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map h; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] j; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] l; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void b();

    private static native java.lang.reflect.Method h(long a0,long a1);

    private static native int e(long a0,long a1);

    private static native java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private static double method_40$83ff7736af(Entity var0) {
      long var1 = b ^ 6006749241409L;
      long var10001 = 5789791491436397873L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_44$ee256e8a75(var0);
   }



   private double method_44$83ff7736af(Entity var1) {
      net.minecraft.entity.Entity var10;
      long var2 = b ^ 91783150634962L;
      long var4 = var2 ^ 73632136557841L;
      long var10000 = -591319150232120379L;
      boolean var6 = method_45i$aae029aa0a();
      if (!(var1 instanceof EntityLivingBase)) {
         return 1000.0;
      }

      var10 = this.field_41;
      label29:
      if (var6) {
         if (this.field_41 != null) {
            var10 = var1;
            if (!var6) {
               break label29;
            }

            if (var1.method_49$8abf5c6871() == this.field_41.method_49$8abf5c6871()) {
               return -1.0;
            }
         }

         var10 = var1;
      }

      double var11 = var10.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = -589499921875567260L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = -588658723883614292L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = -589499921875567260L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = -588658723883614292L;
      Client var9 = var15;
      var10006 = -588031156666366621L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



    private boolean method_44$7c2c45e4ce(Entity c_47MQ) {
        long l;
        long l2 = l = b ^ 0x1A00F97A586AL;
        long l3 = l2 ^ 0x6D209107E418L;
        long l4 = l2 ^ 0xB8EC63AAAA9L;
        long l5 = l2 ^ 0x5676C534BB7FL;
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
        float[] fArray = C_47gg.method_42$edd155e764((double)c_47MQ.field_48Q, (double)c_47MQ.field_48j, (long)l4, (double)c_47MQ.field_42o, (float)c_40U.method_45$03ec613b6f().field_43, (float)c_40U2.method_45$03ec613b6f().field_48);
        long l6 = l3;
        NumberSetting c_47TS = this.settingYawFov;
        if ((double)Math.abs(fArray[0]) > c_47TS.method_44$474dfaa627(l6)) {
            return false;
        }
        long l7 = l3;
        NumberSetting c_47TS2 = this.settingPitchFov;
        if ((double)Math.abs(fArray[1]) > c_47TS2.method_44$474dfaa627(l7)) {
            return false;
        }
        if (this.field_43c instanceof EntityPlayerSP) return false;
        C_47qB c_47qB = C_47qB.PLAYER;
        C_47qB c_47qB2 = C_47qB.MOB;
        C_47qB c_47qB3 = C_47qB.ANIMAL;
        C_47qB c_47qB4 = C_47qB.VILLAGER;
        C_47qB c_47qB5 = C_47qB.ARMOR_STAND;
        C_47qB c_47qB6 = C_47qB.INVISIBLE;
        C_47qB c_47qB7 = C_47qB.TEAMMATES;
        C_47qB c_47qB8 = C_47qB.DEAD;
        if (!AimBot_47O_.recovery$indy$1(c_47MQ, c_47qB.method_43$aae029aa0a(), c_47qB2.method_43$aae029aa0a(), c_47qB3.method_43$aae029aa0a(), c_47qB4.method_43$aae029aa0a(), c_47qB5.method_43$aae029aa0a(), c_47qB6.method_43$aae029aa0a(), !c_47qB7.method_43$aae029aa0a(), true, l5, true, c_47qB8.method_43$aae029aa0a(), true, -6309545933618267150L, l)) return false;
        Minecraft c_47nT2 = field_43;
        long l8 = l3;
        NumberSetting c_47TS3 = this.settingPreAimRange;
        if ((double)c_47nT2.field_42P.method_40$ee256e8a75(c_47MQ) < c_47TS3.method_44$474dfaa627(l8)) return true;
        return false;
    }





   public static void method_48$f633c984d8(boolean var0) {
      field_43s = var0;
   }



   private float method_48$5618b8530d(long var1) {
      var1 = b ^ var1;
      return recovery$indy$3(recovery$indy$2(1849761068014867230L, var1), 1850606814410346966L, var1).field_48;
   }



   public void method_48$c945181dab(long var1, C_47VU var3) {
      net.minecraft.entity.EntityLivingBase var53;
      byte var64;
      int var58;
      byte var65;
      net.C_47VU var59;
      net.C_47VU var60;
      long var4 = var1 ^ 44836373139303L;
      long var6 = var1 ^ 17199219927184L;
      long var8 = var1 ^ 20861879870971L;
      long var10 = var1 ^ 92897628564149L;
      long var12 = var1 ^ 50803475188684L;
      long var10001 = var1 ^ 125620820507806L;
      int var14 = (int)((var1 ^ 125620820507806L) >>> 32);
      int var15 = (int)((var1 ^ 125620820507806L) << 32 >>> 40);
      int var16 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 53887829849790L;
      int var17 = (int)((var1 ^ 53887829849790L) >>> 48);
      int var18 = (int)((var1 ^ 53887829849790L) << 16 >>> 32);
      int var19 = (int)(var10001 << 48 >>> 48);
      byte var20 = (byte) ((recovery$indy$4(-1810932513413315888L, var1)) ? 1 : 0);
      if (recovery$indy$5(ClientGlobals.field_48.field_41W, var6, -1810814476382351690L, var1)) {
         recovery$indy$6(var3, 0, -1819433837165857162L, var1);
         recovery$indy$7(var3, 0, -1817912942442632573L, var1);
      }

      AimBot_47O_ var54;
      label283: {
         label287: {
            EntityPlayerSP var10000 = recovery$indy$8(field_43, -1810624603633355849L, var1);
            if (var20 != 0) {
               if (var10000 == null) {
                  break label287;
               }

               var10000 = recovery$indy$9(field_43, -1810624603633355849L, var1);
            }

            label288: {
               int var52 = (int) ((var10000.field_427) ? 1 : 0);
               byte var62 = var20;
               if (var1 > 0L) {
                  if (var20 != 0) {
                     if ((var10000.field_427 ? 1 : 0) != 0) {
                        break label287;
                     }

                     var53 = recovery$indy$10(field_43, -1810624603633355849L, var1);
                     if (var20 == 0) {
                        break label288;
                     }

                     var52 = var53.field_48y;
                  }

                  var62 = 20;
               }

               if (var52 <= var62) {
                  break label287;
               }

               var54 = this;
               if (var20 == 0) {
                  break label283;
               }

               var53 = this.field_43c;
            }

            label264:
            if (var53 != null) {
               int var55 = (int) ((recovery$indy$11(field_43, -1818967464744794349L, var1)) ? 1 : 0);
               byte var63 = var20;
               if (var1 >= 0L) {
                  if (var20 != 0) {
                     if (var55 == 0) {
                        break label264;
                     }

                     var55 = (int) ((recovery$indy$12(this.settingClick, -1817511463671259484L, var1)) ? 1 : 0);
                  }

                  var63 = var20;
               }

               label255: {
                  label254:
                  if (var63 != 0) {
                     if (var55 != 0) {
                        var55 = (int) ((recovery$indy$13(field_43, -1817851061867832702L, var1).field_44l.method_42$aae029aa0a()) ? 1 : 0);
                        var64 = var20;
                        if (var1 <= 0L) {
                           break label255;
                        }

                        if (var20 == 0) {
                           break label254;
                        }

                        if (var55 == 0) {
                           break label264;
                        }
                     }

                     var55 = (int) ((recovery$indy$14(ClientGlobals.field_46, (char)var17, var18, ClientGlobals.field_48.field_46k, (char)var19, -1818839834739631289L, var1)) ? 1 : 0);
                  }

                  var64 = var20;
               }

               if (var1 > 0L) {
                  if (var64 != 0) {
                     if (var55 != 0) {
                        break label264;
                     }

                     var55 = (int) ((recovery$indy$15(this.settingDiggingCheck, -1817511463671259484L, var1)) ? 1 : 0);
                  }

                  var64 = var20;
               }

               label235:
               if (var64 != 0) {
                  if (var55 != 0) {
                     var55 = (int) ((recovery$indy$16(field_43, -1817851061867832702L, var1).field_44l.method_42$aae029aa0a()) ? 1 : 0);
                     if (var20 == 0) {
                        break label235;
                     }

                     label231:
                     if (var55 != 0) {
                        C_47Ij var56 = recovery$indy$17(field_43, -1819338745623084754L, var1);
                        if (var20 != 0) {
                           if (var56 == null) {
                              break label231;
                           }

                           var56 = recovery$indy$18(field_43, -1819338745623084754L, var1);
                        }

                        if (var56.field_49 == C_47Az.BLOCK) {
                           break label264;
                        }
                     }
                  }

                  var55 = (int)(System.currentTimeMillis() - this.field_49);
               }

               int var21 = var55;
               C_477r var22 = recovery$indy$22(
                  this,
                  this.field_43c,
                  new C_477r(recovery$indy$19(this, var12, -1818345096369605938L, var1), recovery$indy$20(this, var4, -1818322286174661096L, var1)),
                  recovery$indy$21(var3, -1818556876274611999L, var1),
                  180.0F,
                  var8,
                  180.0F,
                  -1819141017155590280L,
                  var1
               );
               C_477r var57 = var22;
               if (var20 != 0) {
                  if (var22 == null) {
                     return;
                  }

                  var57 = var22;
               }

               int[] var23;
               int var28;
               int var29;
               label219: {
                  var23 = recovery$indy$25(
                     var57.field_44,
                     var22.field_41,
                     var14,
                     var15,
                     (byte)var16,
                     recovery$indy$23(this, var12, -1818345096369605938L, var1),
                     recovery$indy$24(this, var4, -1818322286174661096L, var1),
                     -1810993121620566012L,
                     var1
                  );
                  double var24 = (double)this.field_43H[0] / this.field_43y * var21;
                  double var26 = (double)this.field_43H[1] / this.field_43y * var21;
                  this.field_46[0] = this.field_46[0] + var24;
                  this.field_46[1] = this.field_46[1] + var26;
                  var28 = (int)Math.round(this.field_46[0] - this.field_45[0]);
                  var29 = (int)Math.round(this.field_46[1] - this.field_45[1]);
                  this.field_45[0] = this.field_45[0] + var28;
                  this.field_45[1] = this.field_45[1] + var29;
                  var58 = recovery$indy$26(var3, -1819308326686195220L, var1);
                  label218:
                  if (var20 != 0) {
                     label216: {
                        label215:
                        if (var58 != 0) {
                           int var30 = var23[0];
                           var58 = var30;
                           var65 = var20;
                           if (var1 >= 0L) {
                              if (var20 != 0) {
                                 if (var30 < 0) {
                                    var58 = var30 - recovery$indy$27(var3, -1819308326686195220L, var1);
                                    int var66 = var20;
                                    if (var1 >= 0L) {
                                       if (var20 == 0) {
                                          break label218;
                                       }

                                       var66 = var30;
                                    }

                                    if (var58 > var66) {
                                       break label215;
                                    }

                                    double var31 = recovery$indy$28(var3, -1819308326686195220L, var1)
                                       * recovery$indy$29(this.settingAssistYawMul, var10, -1817564146870281697L, var1);
                                    double var33 = var31 + this.field_43R[0];
                                    int var35 = (int)Math.round(var33);
                                    var59 = var3;
                                    if (var1 < 0L) {
                                       break label216;
                                    }

                                    recovery$indy$30(var3, var35, -1819433837165857162L, var1);
                                    this.field_43R[0] = var33 - var35;
                                    if (var20 != 0) {
                                       break label215;
                                    }
                                 }

                                 var58 = var30 - recovery$indy$31(var3, -1819308326686195220L, var1);
                              }

                              var65 = var20;
                           }

                           if (var1 <= 0L) {
                              break label219;
                           }

                           if (var65 == 0) {
                              break label218;
                           }

                           if (var58 >= var30) {
                              double var42 = recovery$indy$32(var3, -1819308326686195220L, var1)
                                 * recovery$indy$33(this.settingAssistYawMul, var10, -1817564146870281697L, var1);
                              double var45 = var42 + this.field_43R[0];
                              int var48 = (int)Math.round(var45);
                              recovery$indy$34(var3, var48, -1819433837165857162L, var1);
                              this.field_43R[0] = var45 - var48;
                           }
                        }

                        var59 = var3;
                     }

                     var58 = recovery$indy$35(var59, -1811223028479527385L, var1);
                  }

                  var65 = var20;
               }

               label172:
               if (var65 != 0) {
                  label188: {
                     label187:
                     if (var58 != 0) {
                        int var40 = var23[1];
                        var58 = var40;
                        int var67 = var20;
                        if (var1 >= 0L) {
                           if (var20 != 0) {
                              if (var40 < 0) {
                                 var58 = var40 - recovery$indy$36(var3, -1811223028479527385L, var1);
                                 int var68 = var20;
                                 if (var1 > 0L) {
                                    if (var20 == 0) {
                                       break label172;
                                    }

                                    var68 = var40;
                                 }

                                 if (var58 > var68) {
                                    break label187;
                                 }

                                 double var43 = recovery$indy$37(var3, -1811223028479527385L, var1)
                                    * recovery$indy$38(this.settingAssistPitchMul, var10, -1817564146870281697L, var1);
                                 double var46 = var43 + this.field_43R[1];
                                 int var49 = (int)Math.round(var46);
                                 var60 = var3;
                                 if (var1 < 0L) {
                                    break label188;
                                 }

                                 recovery$indy$39(var3, var49, -1817912942442632573L, var1);
                                 this.field_43R[1] = var46 - var49;
                                 if (var20 != 0) {
                                    break label187;
                                 }
                              }

                              var58 = var40 - recovery$indy$40(var3, -1811223028479527385L, var1);
                           }

                           var67 = var20;
                        }

                        if (var1 > 0L) {
                           if (var67 == 0) {
                              break label172;
                           }

                           var67 = var40;
                        }

                        if (var58 >= var67) {
                           double var44 = recovery$indy$41(var3, -1811223028479527385L, var1)
                              * recovery$indy$42(this.settingAssistPitchMul, var10, -1817564146870281697L, var1);
                           double var47 = var44 + this.field_43R[1];
                           int var50 = (int)Math.round(var47);
                           recovery$indy$43(var3, var50, -1817912942442632573L, var1);
                           this.field_43R[1] = var47 - var50;
                        }
                     }

                     var60 = var3;
                  }

                  var58 = recovery$indy$44(var60, -1819308326686195220L, var1);
               }

               double var41 = var58 * recovery$indy$45(this.settingOwnYawMul, var10, -1817564146870281697L, var1);
               double var32 = var41 + this.field_40[0];
               int var34 = (int)Math.round(var32);
               recovery$indy$46(var3, var34, -1819433837165857162L, var1);
               this.field_40[0] = var32 - var34;
               double var51 = recovery$indy$47(var3, -1811223028479527385L, var1) * recovery$indy$48(this.settingOwnPitchMul, var10, -1817564146870281697L, var1);
               double var37 = var51 + this.field_40[1];
               int var39 = (int)Math.round(var37);
               recovery$indy$49(var3, var39, -1817912942442632573L, var1);
               this.field_40[1] = var37 - var39;
               recovery$indy$51(var3, var28 + recovery$indy$50(var3, -1819308326686195220L, var1), -1819433837165857162L, var1);
               recovery$indy$53(var3, var29 + recovery$indy$52(var3, -1811223028479527385L, var1), -1817912942442632573L, var1);
            }
         }

         var54 = this;
      }

      var54.field_49 = System.currentTimeMillis();
   }









   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_43c = null;
      this.field_41 = null;
   }



   private float method_49$5618b8530d(long var1) {
      var1 = b ^ var1;
      byte var3 = (byte) ((recovery$indy$54(-7126322181282514668L, var1)) ? 1 : 0);
      float var4 = recovery$indy$56(recovery$indy$55(-7133511492215760971L, var1), -7132105437304384131L, var1).field_43;

      while (true) {
         if (recovery$indy$57(field_43, -7126050003617216397L, var1).field_48h - var4 >= 180.0F) {
            var4 += 360.0F;
            byte var10000 = var3;
            if (var1 > 0L) {
               if (var3 == 0) {
                  return var4;
               }

               var10000 = var3;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         while (true) {
            float var8;
            int var6 = (var8 = recovery$indy$58(field_43, -7126050003617216397L, var1).field_48h - var4 - -180.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
            if (var1 < 0L) {
               if (var1 > 0L) {
                  if (var6 == 0) {
                     return var4;
                  }

                  var6 = var3;
               }

               if (var6 != 0) {
                  break;
               }
            } else {
               if (var6 >= 0) {
                  return var4;
               }

               float var7 = var4 - 360.0F;
               if (var3 == 0) {
                  return var7;
               }

               var4 = var7;
               if (var3 == 0) {
                  return var4;
               }
            }
         }
      }
   }



   private static double method_45$83ff7736af(Entity var0) {
      return ((EntityLivingBase)var0).method_43$bc607678b6();
   }



   private double method_47$83ff7736af(Entity var1) {
      long var2 = b ^ 111534343986149L;
      long var4 = var2 ^ 128637017057574L;
      long var10000 = -1449899733481115103L;
      boolean var6 = method_45g$aae029aa0a();
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
      long var10004 = -1448299837196902061L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = -1449143083519679589L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = -1448299837196902061L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = -1449143083519679589L;
      Client var9 = var15;
      var10006 = -1449645821809583788L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



   private static boolean method_45p$aae029aa0a() {
      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 49072313886417L;
      super.method_43_$e45a9973e5(var3);
      recovery$indy$59(this, 40, var5, -7102080715868397142L, var1);
      recovery$indy$60(this, 19, var5, -7102080715868397142L, var1);
      recovery$indy$61(this, 17, var5, -7102080715868397142L, var1);
   }



   public static boolean method_45i$aae029aa0a() {
      return field_43s;
   }



   public static boolean method_45g$aae029aa0a() {
      boolean var0 = method_45i$aae029aa0a();
      return !var0;
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      super.method_43y$e45a9973e5(var3);
      this.field_43c = null;
      this.field_41 = null;
   }



    public void method_489$e45a9973e5(long l) {
        block25: {
            boolean bl;
            int n;
            int n2;
            int n3;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            long l9;
            block26: {
                boolean bl2;
                block24: {
                    long l10 = l;
                    l9 = l10 ^ 0x5CC09DE7CCC8L;
                    l8 = l10 ^ 0x32A67512D04DL;
                    l7 = l10 ^ 0x7F727C18A14FL;
                    l6 = l10 ^ 0x66981E072F1DL;
                    l5 = l10 ^ 0x89875FABAD1L;
                    l4 = l10 ^ 0x3D69EE42BCC9L;
                    l3 = l10 ^ 0x72796174FC11L;
                    l2 = l10 ^ 0x3455A61D54E6L;
                    long l11 = l10 ^ 0x68215D6B23B4L;
                    n3 = (int)(l11 >>> 32);
                    n2 = (int)(l11 << 32 >>> 40);
                    n = (int)(l11 << 56 >>> 56);
                    bl = AimBot_47O_.recovery$indy$62(4176064014587108858L, l);
                    this.field_41 = this.field_43c;
                    this.field_43c = null;
                    if (!bl) return;
                    bl2 = AimBot_47O_.recovery$indy$63(field_43, 4173606343639177273L, l);
                    if (l < 0L) break block24;
                    if (!bl2) break block25;
                    bl2 = AimBot_47O_.recovery$indy$64(this.settingClick, 4173988672311804302L, l);
                }
                if (!bl2) break block26;
                if (!AimBot_47O_.recovery$indy$65((Object)AimBot_47O_.field_43, (long)4174740604620096936L, (long)l).field_44l.method_42$aae029aa0a()) break block25;
            }
            if (AimBot_47O_.recovery$indy$66(this.field_431, l4, 4174834533192434130L, l)) {
                Object[] objectArray = null;
                String string = AimBot_47O_.recovery$indy$67(this.settingTargetSort, l3, 4176936538710941656L, l);
                int n4 = -1;
                switch (string.hashCode()) {
                    case -2137395588: {
                        if (!string.equals(AimBot_47O_.recovery$indy$69(12185, 0x5EF60E7E2DB0D45FL ^ l))) break;
                        n4 = 1;
                        boolean bl3 = bl;
                        if (l > 0L) {
                            if (bl3) break;
                            bl3 = string.equals(AimBot_47O_.recovery$indy$70(5098, 0x2A06C03BD707682EL ^ l));
                        }
                        if (!bl3) break;
                        n4 = 2;
                        boolean bl4 = bl;
                        if (l >= 0L) {
                            if (bl4) break;
                            bl4 = string.equals(AimBot_47O_.recovery$indy$71(29183, 0x5B76BA624F930A3FL ^ l));
                        }
                        if (!bl4) break;
                        n4 = 3;
                        break;
                    }
                    case -1818398616: {
                        if (!string.equals(AimBot_47O_.recovery$indy$71(29183, 0x5B76BA624F930A3FL ^ l))) break;
                        n4 = 3;
                        break;
                    }
                    case 69805: {
                        if (!string.equals(AimBot_47O_.recovery$indy$68(9371, 0x4245373797F1DF5CL ^ l))) break;
                        n4 = 0;
                        boolean bl5 = bl;
                        if (l >= 0L) {
                            if (bl5) break;
                            bl5 = string.equals(AimBot_47O_.recovery$indy$69(12185, 0x5EF60E7E2DB0D45FL ^ l));
                        }
                        if (!bl5) break;
                        n4 = 1;
                        boolean bl6 = bl;
                        if (l > 0L) {
                            if (bl6) break;
                            bl6 = string.equals(AimBot_47O_.recovery$indy$70(5098, 0x2A06C03BD707682EL ^ l));
                        }
                        if (!bl6) break;
                        n4 = 2;
                        boolean bl7 = bl;
                        if (l >= 0L) {
                            if (bl7) break;
                            bl7 = string.equals(AimBot_47O_.recovery$indy$71(29183, 0x5B76BA624F930A3FL ^ l));
                        }
                        if (!bl7) break;
                        n4 = 3;
                        break;
                    }
                    case 353103893: {
                        if (!string.equals(AimBot_47O_.recovery$indy$70(5098, 0x2A06C03BD707682EL ^ l))) break;
                        n4 = 2;
                        boolean bl8 = bl;
                        if (l >= 0L) {
                            if (bl8) break;
                            bl8 = string.equals(AimBot_47O_.recovery$indy$71(29183, 0x5B76BA624F930A3FL ^ l));
                        }
                        if (!bl8) break;
                        n4 = 3;
                        break;
                    }
                }
                switch (n4) {
                    case 0: {
                        objectArray = AimBot_47O_.recovery$indy$72((Object)AimBot_47O_.field_43, (long)4173422269092496807L, (long)l).field_44Q.stream().filter(AimBot_47O_.recovery$indy$73(this)).sorted(Comparator.comparingDouble(AimBot_47O_.recovery$indy$74(this))).toArray();
                        break;
                    }
                    case 1: {
                        objectArray = AimBot_47O_.recovery$indy$75((Object)AimBot_47O_.field_43, (long)4173422269092496807L, (long)l).field_44Q.stream().filter(AimBot_47O_.recovery$indy$76(this)).sorted(Comparator.comparingDouble(AimBot_47O_.recovery$indy$77())).toArray();
                        break;
                    }
                    case 2: {
                        objectArray = AimBot_47O_.recovery$indy$78((Object)AimBot_47O_.field_43, (long)4173422269092496807L, (long)l).field_44Q.stream().filter(AimBot_47O_.recovery$indy$79(this)).sorted(Comparator.comparingDouble(AimBot_47O_.recovery$indy$80())).toArray();
                        break;
                    }
                    case 3: {
                        objectArray = AimBot_47O_.recovery$indy$81((Object)AimBot_47O_.field_43, (long)4173422269092496807L, (long)l).field_44Q.stream().filter(AimBot_47O_.recovery$indy$82(this)).sorted(Comparator.comparingDouble(AimBot_47O_.recovery$indy$83(this))).toArray();
                        break;
                    }
                }
                if (objectArray != null && objectArray.length > 0) {
                    this.field_43c = (EntityLivingBase)objectArray[0];
                }
                if (this.field_43c != null) {
                    float f = AimBot_47O_.recovery$indy$86(C_476q.field_48, AimBot_47O_.recovery$indy$84(this.field_42Q, l7, 4173506270149382225L, l), AimBot_47O_.recovery$indy$85(this.field_42Q, l9, 4174407497757732916L, l), l6, 4176428669776549284L, l) / 2.0f;
                    float f2 = AimBot_47O_.recovery$indy$89(C_476q.field_48, AimBot_47O_.recovery$indy$87(this.field_427, l7, 4173506270149382225L, l), AimBot_47O_.recovery$indy$88(this.field_427, l9, 4174407497757732916L, l), l6, 4176428669776549284L, l) / 2.0f;
                    C_477r c_477r = AimBot_47O_.recovery$indy$92((Object)this, this.field_43c, new C_477r(AimBot_47O_.recovery$indy$90((Object)this, l2, 4173124528133254628L, l), AimBot_47O_.recovery$indy$91((Object)this, l8, 4174308962296449330L, l)), 1.0f, f, l5, f2, 4173436640088553554L, l);
                    this.field_43H = AimBot_47O_.recovery$indy$95(c_477r.field_44, c_477r.field_41, n3, n2, (byte)n, AimBot_47O_.recovery$indy$93((Object)this, l2, 4173124528133254628L, l), AimBot_47O_.recovery$indy$94((Object)this, l8, 4174308962296449330L, l), 4175986088670379822L, l);
                    System.out.println(Arrays.toString(this.field_43H));
                    return;
                }
                this.field_47 = null;
            }
        }
        this.field_43H[0] = 0;
        this.field_43H[1] = 1;
    }






   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 52783189452144L;
      long var10001 = var4 ^ 0L;
      int var8 = (int)((var4 ^ 0L) >>> 48);
      int var9 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      recovery$indy$96(this.field_43j, true, 2737545568087174086L, var4);
      recovery$indy$98(this.field_43j, var6, recovery$indy$97(), 2737213970479082913L, var4);
      recovery$indy$100(this.field_42, recovery$indy$99(30837, 2806636236396208061L ^ var4), 2737154147753512257L, var4);
      this.field_43a = true;
      super.method_43x$c973149af1((short)var8, var9, (char)var10);
      this.field_43c = null;
      this.field_49 = System.currentTimeMillis();
      this.field_43O = System.currentTimeMillis();
      this.field_41 = null;
      this.field_43H[0] = 0;
      this.field_43H[1] = 0;
      this.field_45[0] = this.field_45[1] = 0;
      this.field_46[0] = this.field_46[1] = 0.0;
   }




   public void method_488$e45a9973e5(long var1) {
      this.field_43y = (int)Math.abs(this.field_43O - System.currentTimeMillis());
      this.field_43O = System.currentTimeMillis();
      this.field_45[0] = this.field_45[1] = 0;
      this.field_46[0] = this.field_46[1] = 0.0;
      this.field_43P = true;
   }



    public AimBot_47O_(long a0) {
        super((java.lang.String) ("AimBot"),(long) (((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 124535139071855L)),(java.lang.String) ("Ziehlhilfe"),(java.awt.Color) (new java.awt.Color((int) (66),(int) (135),(int) (245))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AimBot_47O_.b ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 25876155262192L);
        long constructorKey4 = ((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 120675882867147L);
        long constructorKey5 = ((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 96007986591005L);
        int constructorPart6 = (int) ((((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 5252916770040L) >>> 32));
        int constructorPart7 = (int) (((((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 5252916770040L) << 32) >>> 48));
        int constructorPart8 = (int) (((((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 5252916770040L) << 48) >>> 48));
        long constructorKey9 = ((augustus.recovered.modules.legit.AimBot_47O_.b ^ a0) ^ 134181937187482L);
        client.setting.NumberSetting initialized10 = new client.setting.NumberSetting(this, "PreAimRange", Double.longBitsToDouble(4617315517961601024L), constructorKey9, 0.0D, Double.longBitsToDouble(4621819117588971520L), 1);
        recovery$indy$flow$388(this, initialized10);
        client.setting.NumberSetting initialized11 = new client.setting.NumberSetting(this, "OwnYawMul", 1.0D, constructorKey9, 0.0D, 1.0D, 2);
        recovery$indy$flow$391(this, initialized11);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "OwnPitchMul", 1.0D, constructorKey9, 0.0D, 1.0D, 2);
        recovery$indy$flow$394(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "AssistYawMul", Double.longBitsToDouble(4602678819172646912L), constructorKey9, 0.0D, 1.0D, 2);
        recovery$indy$flow$397(this, initialized13);
        client.setting.NumberSetting initialized14 = new client.setting.NumberSetting(this, "AssistPitchMul", Double.longBitsToDouble(4602678819172646912L), constructorKey9, 0.0D, 1.0D, 2);
        recovery$indy$flow$400(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "YawFov", Double.longBitsToDouble(4631530004285489152L), constructorKey9, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$403(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "PitchFov", Double.longBitsToDouble(4628011567076605952L), constructorKey9, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$406(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey5, "Click", true);
        recovery$indy$flow$409(this, initialized17);
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, constructorKey5, "DiggingCheck", true);
        recovery$indy$flow$412(this, initialized18);
        java.lang.Object initialValue19 = recovery$indy$flow$414();
        client.setting.MultiSelectSetting initialized20 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue19));
        recovery$indy$flow$416(this, initialized20);
        java.lang.Object initialValue21 = recovery$indy$flow$418(4);
        ((java.lang.Object[]) initialValue21)[0] = "Single";
        ((java.lang.Object[]) initialValue21)[1] = "FOV";
        ((java.lang.Object[]) initialValue21)[2] = "Health";
        ((java.lang.Object[]) initialValue21)[3] = "Distance";
        client.setting.ModeSetting initialized22 = new client.setting.ModeSetting(this, "TargetSort", constructorKey4, "Single", (java.lang.String[]) (initialValue21));
        recovery$indy$flow$420(this, initialized22);
        char converted23 = (char) (constructorPart7);
        net.C_47Tf initialized24 = new net.C_47Tf(constructorPart6, converted23, this, constructorPart8);
        recovery$indy$flow$423(this, initialized24);
        recovery$indy$flow$424(this, null);
        recovery$indy$flow$425(this, null);
        recovery$indy$flow$426(this, 0L);
        recovery$indy$flow$427(this, 0L);
        recovery$indy$flow$428(this, 0);
        double[] values25 = new double[2];
        recovery$indy$flow$429(this, values25);
        double[] values26 = new double[2];
        recovery$indy$flow$430(this, values26);
        double[] values27 = new double[2];
        recovery$indy$flow$431(this, values27);
        int[] values28 = new int[2];
        recovery$indy$flow$432(this, values28);
        int[] values29 = new int[2];
        recovery$indy$flow$433(this, values29);
        recovery$indy$flow$434(this, null);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String c(int a0,long a1);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String c(byte[] a0);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static native void recovery$indy$flow$388(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$391(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$394(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$397(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$400(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$406(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$409(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$412(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$414();
    private static native void recovery$indy$flow$416(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$418(int a0);
    private static native void recovery$indy$flow$420(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$423(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$424(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_43c = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$425(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_41 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$426(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_49 = a1;
        return;
    }
    private static void recovery$indy$flow$427(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_43O = a1;
        return;
    }
    private static void recovery$indy$flow$428(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_43y = a1;
        return;
    }
    private static native void recovery$indy$flow$429(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$430(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$431(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$432(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$433(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_43H = ((int[]) (a1));
        return;
    }
    private static void recovery$indy$flow$434(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AimBot_47O_) (a0)).field_47 = ((net.C_477r) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(
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
   private static native Client recovery$indy$2(long var0, long var2);
   private static native C_47y6 recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$16(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$17(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$18(Object var0, long var1, long var3);
   private static native float recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$20(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$21(Object var0, long var1, long var3);
   private static native C_477r recovery$indy$22(Object var0, Object var1, Object var2, float var3, float var4, long var5, float var7, long var8, long var10);
   private static native float recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$25(float var0, float var1, int var2, int var3, byte var4, float var5, float var6, long var7, long var9);
   private static native int recovery$indy$26(Object var0, long var1, long var3);
   private static native int recovery$indy$27(Object var0, long var1, long var3);
   private static native int recovery$indy$28(Object var0, long var1, long var3);
   private static native double recovery$indy$29(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$31(Object var0, long var1, long var3);
   private static native int recovery$indy$32(Object var0, long var1, long var3);
   private static native double recovery$indy$33(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$34(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$35(Object var0, long var1, long var3);
   private static native int recovery$indy$36(Object var0, long var1, long var3);
   private static native int recovery$indy$37(Object var0, long var1, long var3);
   private static native double recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$39(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$40(Object var0, long var1, long var3);
   private static native int recovery$indy$41(Object var0, long var1, long var3);
   private static native double recovery$indy$42(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$43(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$44(Object var0, long var1, long var3);
   private static native double recovery$indy$45(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$47(Object var0, long var1, long var3);
   private static native double recovery$indy$48(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$49(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$50(Object var0, long var1, long var3);
   private static native void recovery$indy$51(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$52(Object var0, long var1, long var3);
   private static native void recovery$indy$53(Object var0, int var1, long var2, long var4);
   private static native boolean recovery$indy$54(long var0, long var2);
   private static native Client recovery$indy$55(long var0, long var2);
   private static native C_47y6 recovery$indy$56(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$57(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$58(Object var0, long var1, long var3);
   private static native void recovery$indy$59(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$61(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$62(long var0, long var2);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3);
   private static native boolean recovery$indy$64(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$65(Object var0, long var1, long var3);
   private static native boolean recovery$indy$66(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$67(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$68(int var0, long var1);
   private static native String recovery$indy$69(int var0, long var1);
   private static native String recovery$indy$70(int var0, long var1);
   private static native String recovery$indy$71(int var0, long var1);
   private static native WorldClient recovery$indy$72(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$73(AimBot_47O_ var0);
   private static native ToDoubleFunction recovery$indy$74(AimBot_47O_ var0);
   private static native WorldClient recovery$indy$75(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$76(AimBot_47O_ var0);
   private static native ToDoubleFunction recovery$indy$77();
   private static native WorldClient recovery$indy$78(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$79(AimBot_47O_ var0);
   private static native ToDoubleFunction recovery$indy$80();
   private static native WorldClient recovery$indy$81(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$82(AimBot_47O_ var0);
   private static native ToDoubleFunction recovery$indy$83(AimBot_47O_ var0);
   private static native double recovery$indy$84(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$85(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$86(Object var0, double var1, double var3, long var5, long var7, long var9);
   private static native double recovery$indy$87(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$88(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$89(Object var0, double var1, double var3, long var5, long var7, long var9);
   private static native float recovery$indy$90(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$91(Object var0, long var1, long var3, long var5);
   private static native C_477r recovery$indy$92(Object var0, Object var1, Object var2, float var3, float var4, long var5, float var7, long var8, long var10);
   private static native float recovery$indy$93(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$94(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$95(float var0, float var1, int var2, int var3, byte var4, float var5, float var6, long var7, long var9);
   private static native void recovery$indy$96(Object var0, boolean var1, long var2, long var4);
   private static native C_45n recovery$indy$97();
   private static native Setting recovery$indy$98(Object var0, long var1, Object var3, long var4, long var6);
   private static native String recovery$indy$99(int var0, long var1);
   private static native void recovery$indy$100(Object var0, Object var1, long var2, long var4);
   private static native MethodHandle recovery$constant$101();
}
