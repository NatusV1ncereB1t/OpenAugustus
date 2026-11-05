package augustus.recovered.modules.combat;
import augustus.recovered.modules.misc.Debug_47kF;
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
import net.C_40y;
import net.C_45W;
import net.C_45n;
import net.C_472n;
import net.C_473U;
import net.C_473X;
import net.C_477z;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import net.C_47MS;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47hi;
import net.C_47iC;
import net.C_47oO;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47si;
import net.C_47sk;
import client.module.Category;
import net.C_47vk;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MoreKB_47CU extends client.module.Module implements net.C_47oO,net.C_47hi,net.C_47xz,net.C_47MS,net.C_47iC,net.C_47si {
    private final client.setting.ModeSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHideSneakAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingFOV = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingIgnoreEatingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDontSprintResetIfYouAlreadyDidLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTiming = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSprintResetTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSprintResetTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingDoubleReset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDoubleSprintReset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDoubleResetTiming = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDoubleResetDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingFail = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFailSprintReset = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFailDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFailDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_497 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_49p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_49s; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

   public void method_42$81a716381c(C_47vk var1, long var2) {
      int[] var4 = recovery$indy$1(-3662544208824465125L, var2);
      int var10000 = this.field_437;
      if (var4 == null) {
         if (this.field_437 >= 3) {
            return;
         }

         var10000 = (int) ((recovery$indy$2(this.settingHideSneakAnimation, -3661772303886776257L, var2)) ? 1 : 0);
      }

      if (var10000 != 0) {
         recovery$indy$3(var1, 1.62F, -3662302808740594701L, var2);
      }
   }



   public static void method_42$da8c82d5d4() {
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$426c33b229(C_477z var1, long var2) {
      int[] var4 = recovery$indy$4(8133854722893952214L, var2);
      Entity var5 = recovery$indy$5(var1, 8135397767001743719L, var2);
      Entity var10000 = var5;
      if (var4 == null) {
         if (!(var5 instanceof EntityLivingBase)) {
            return;
         }

         var10000 = var5;
      }

      EntityLivingBase var6 = (EntityLivingBase)var10000;
      if (var4 == null) {
         if (var6.field_432 >= 3) {
            return;
         }

         this.field_49s = this.field_43a;
      }

      this.field_43a = false;
   }



   public void method_41$9035875d26(long var1, C_47ob var3) {
      int[] var4 = recovery$indy$6(-7191606992462948347L, var1);
      C_473U var5 = recovery$indy$7(var3, -7191289768359743823L, var1);
      C_473U var10000 = var5;
      if (var4 == null) {
         if (!(var5 instanceof C_45W)) {
            return;
         }

         var10000 = var5;
      }

      C_45W var6 = (C_45W)var10000;
      C_40y var7 = var6.method_42$c4164528f2();
      if (var7 == C_40y.START_SPRINTING) {
         this.field_43a = true;
      }
   }



   private void method_48$f46db484fe(int var1, int var2, int var3, boolean var4) {
      int[] var13;
      net.minecraft.client.entity.EntityPlayerSP var14;
      int[] var15;
      int[] var16;
      net.minecraft.client.entity.EntityPlayerSP var17;
      long var5;
      int[] var9;
      int var12;
      var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 45174528665577L;
      String var10 = recovery$indy$8(this.settingModes, var7, 2454185696893458070L, var5);
      int[] var10000 = recovery$indy$9(2456290081297032737L, var5);
      byte var11 = -1;
      var9 = var10000;
      var12 = var10.hashCode();
      label323:
      if (var9 == null) {
         label326: {
            label320: {
               label327: {
                  label318: {
                     label328: {
                        label316: {
                           label329: {
                              label314: {
                                 label330: {
                                    label312: {
                                       label331: {
                                          label310: {
                                             label332: {
                                                label308: {
                                                   label333: {
                                                      switch (var12) {
                                                         case -1911998296:
                                                            var12 = (int) ((var10.equals(recovery$indy$10(1398, 8810719977421046691L ^ var5))) ? 1 : 0);
                                                            if (var9 != null) {
                                                               break label323;
                                                            }

                                                            if (var12 == 0) {
                                                               break label326;
                                                            }

                                                            var12 = 0;
                                                            if (var2 <= 0) {
                                                               break;
                                                            }

                                                            var11 = 0;
                                                            if (var9 == null) {
                                                               break label326;
                                                            }
                                                         case 1106913241:
                                                            var12 = (int) ((var10.equals(recovery$indy$11(27450, 5613092091779149284L ^ var5))) ? 1 : 0);
                                                            break;
                                                         case 79430:
                                                            break label330;
                                                         case 2182268:
                                                            break label327;
                                                         case 2556496:
                                                            break label328;
                                                         case 6971297:
                                                            break label331;
                                                         case 41569173:
                                                            break label333;
                                                         case 73298841:
                                                            break label332;
                                                         case 80029428:
                                                            break label329;
                                                         default:
                                                            break label326;
                                                      }

                                                      if (var9 != null) {
                                                         break label323;
                                                      }

                                                      if (var12 == 0) {
                                                         break label326;
                                                      }

                                                      var12 = 1;
                                                      if (var2 < 0) {
                                                         break label308;
                                                      }

                                                      var11 = 1;
                                                      if (var9 == null) {
                                                         break label326;
                                                      }
                                                   }

                                                   var12 = (int) ((var10.equals(recovery$indy$12(926, 3113956126949311811L ^ var5))) ? 1 : 0);
                                                }

                                                if (var9 != null) {
                                                   break label323;
                                                }

                                                if (var12 == 0) {
                                                   break label326;
                                                }

                                                var12 = 2;
                                                if (var3 <= 0) {
                                                   break label310;
                                                }

                                                var11 = 2;
                                                if (var9 == null) {
                                                   break label326;
                                                }
                                             }

                                             var12 = (int) ((var10.equals(recovery$indy$13(32070, 4824463701976939410L ^ var5))) ? 1 : 0);
                                          }

                                          if (var9 != null) {
                                             break label323;
                                          }

                                          if (var12 == 0) {
                                             break label326;
                                          }

                                          var12 = 3;
                                          if (var3 < 0) {
                                             break label312;
                                          }

                                          var11 = 3;
                                          if (var9 == null) {
                                             break label326;
                                          }
                                       }

                                       var12 = (int) ((var10.equals(recovery$indy$14(17818, 4549330083620471665L ^ var5))) ? 1 : 0);
                                    }

                                    if (var9 != null) {
                                       break label323;
                                    }

                                    if (var12 == 0) {
                                       break label326;
                                    }

                                    var12 = 4;
                                    if (var3 <= 0) {
                                       break label314;
                                    }

                                    var11 = 4;
                                    if (var9 == null) {
                                       break label326;
                                    }
                                 }

                                 var12 = (int) ((var10.equals(recovery$indy$15(20535, 8132979755599419131L ^ var5))) ? 1 : 0);
                              }

                              if (var9 != null) {
                                 break label323;
                              }

                              if (var12 == 0) {
                                 break label326;
                              }

                              var12 = 5;
                              if (var1 < 0) {
                                 break label316;
                              }

                              var11 = 5;
                              if (var9 == null) {
                                 break label326;
                              }
                           }

                           var12 = (int) ((var10.equals(recovery$indy$16(19442, 8461905158820449587L ^ var5))) ? 1 : 0);
                        }

                        if (var9 != null) {
                           break label323;
                        }

                        if (var12 == 0) {
                           break label326;
                        }

                        var12 = 6;
                        if (var3 <= 0) {
                           break label318;
                        }

                        var11 = 6;
                        if (var9 == null) {
                           break label326;
                        }
                     }

                     var12 = (int) ((var10.equals(recovery$indy$17(2174, 7886013663401741970L ^ var5))) ? 1 : 0);
                  }

                  if (var9 != null) {
                     break label323;
                  }

                  if (var12 == 0) {
                     break label326;
                  }

                  var12 = 7;
                  if (var2 <= 0) {
                     break label320;
                  }

                  var11 = 7;
                  if (var9 == null) {
                     break label326;
                  }
               }

               var12 = (int) ((var10.equals(recovery$indy$18(11511, 246493772510702140L ^ var5))) ? 1 : 0);
            }

            if (var9 != null) {
               break label323;
            }

            if (var12 != 0) {
               var11 = 8;
            }
         }

         var12 = var11;
      }

      boolean var10001;
      label220: {
         label219: {
            label335: {
               label336: {
                  label216: {
                     label215: {
                        label337: {
                           label213: {
                              label212: {
                                 label338: {
                                    label339: {
                                       label209: {
                                          label340: {
                                             switch (var12) {
                                                case 0:
                                                   recovery$indy$19(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$20(field_43, 2453886574027507277L, var5), C_40y.STOP_SPRINTING)
                                                      );
                                                   recovery$indy$21(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$22(field_43, 2453886574027507277L, var5), C_40y.START_SPRINTING)
                                                      );
                                                   recovery$indy$23(field_43, 2453886574027507277L, var5).method_43p$f633c984d8(true);
                                                   this.field_43p = 0;
                                                   var13 = var9;
                                                   if (var1 <= 0) {
                                                      break;
                                                   }

                                                   if (var9 == null) {
                                                      return;
                                                   }
                                                case 1:
                                                   recovery$indy$24(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$25(field_43, 2453886574027507277L, var5), C_40y.STOP_SPRINTING)
                                                      );
                                                   recovery$indy$26(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$27(field_43, 2453886574027507277L, var5), C_40y.START_SPRINTING)
                                                      );
                                                   recovery$indy$28(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$29(field_43, 2453886574027507277L, var5), C_40y.STOP_SPRINTING)
                                                      );
                                                   recovery$indy$30(field_43, 2453886574027507277L, var5)
                                                      .field_49m
                                                      .method_45$631790539f(
                                                         new C_45W(recovery$indy$31(field_43, 2453886574027507277L, var5), C_40y.START_SPRINTING)
                                                      );
                                                   recovery$indy$32(field_43, 2453886574027507277L, var5).method_43p$f633c984d8(true);
                                                   this.field_43p = 0;
                                                   var13 = var9;
                                                   break;
                                                case 2:
                                                   break label340;
                                                case 3:
                                                   break label339;
                                                case 4:
                                                   break label212;
                                                case 5:
                                                   break label337;
                                                case 6:
                                                   break label216;
                                                case 7:
                                                   break label336;
                                                case 8:
                                                   break label219;
                                                default:
                                                   return;
                                             }

                                             if (var1 <= 0) {
                                                break label209;
                                             }

                                             if (var13 == null) {
                                                return;
                                             }
                                          }

                                          recovery$indy$33(field_43, 2453886574027507277L, var5).field_48H = true;
                                          var13 = var9;
                                       }

                                       if (var1 <= 0) {
                                          break label338;
                                       }

                                       if (var13 == null) {
                                          return;
                                       }
                                    }

                                    var14 = recovery$indy$34(field_43, 2453886574027507277L, var5);
                                    if (var3 < 0) {
                                       break label213;
                                    }

                                    var14.field_48m = true;
                                    var13 = var9;
                                 }

                                 if (var13 == null) {
                                    return;
                                 }
                              }

                              var14 = recovery$indy$35(field_43, 2453886574027507277L, var5);
                           }

                           if (var9 == null) {
                              if (var14.method_488$aae029aa0a()) {
                                 recovery$indy$36(field_43, 2453886574027507277L, var5).method_48$f633c984d8(false);
                              }

                              recovery$indy$37(field_43, 2453886574027507277L, var5)
                                 .field_49m
                                 .method_45$631790539f(new C_45W(recovery$indy$38(field_43, 2453886574027507277L, var5), C_40y.START_SPRINTING));
                              var14 = recovery$indy$39(field_43, 2453886574027507277L, var5);
                           }

                           var14.method_43p$f633c984d8(true);
                           this.field_43p = 0;
                           var15 = var9;
                           if (var3 <= 0) {
                              break label215;
                           }

                           if (var9 == null) {
                              return;
                           }
                        }

                        recovery$indy$40(field_43, 2453886574027507277L, var5).method_43p$f633c984d8(false);
                        var15 = var9;
                     }

                     if (var15 == null) {
                        return;
                     }
                  }

                  if (!var4) {
                     return;
                  }

                  recovery$indy$41(field_43, 2453886574027507277L, var5).field_48m = true;
                  var16 = var9;
                  if (var3 <= 0) {
                     break label335;
                  }

                  if (var9 == null) {
                     return;
                  }
               }

               var17 = recovery$indy$42(field_43, 2453886574027507277L, var5);
               var10001 = true;
               if (var2 < 0) {
                  break label220;
               }

               var17.field_48D = true;
               var16 = var9;
            }

            if (var16 == null) {
               return;
            }
         }

         var17 = recovery$indy$43(field_43, 2453886574027507277L, var5);
         var10001 = true;
      }

      var17.method_43C$f633c984d8(var10001);
   }







   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$44(5098926562446672628L, var1);
      boolean var10000 = recovery$indy$45(this.settingIgnoreEatingTargets, 5098572576081150928L, var1);
      if (var3 == null) {
         if (var10000) {
            var10000 = this.field_49.method_48V$aae029aa0a();
            if (var3 != null) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_49 = null;
   }



   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 110945882414764L;
      int[] var5 = recovery$indy$46(1222820335981581519L, var1);
      byte var10000 = (byte) ((recovery$indy$47(ClientGlobals.field_48.field_44J, var3, 1216762416820220034L, var1)) ? 1 : 0);
      if (var5 == null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = (byte) ((recovery$indy$48(ClientGlobals.field_48.field_44J.settingImprove, 1223455802709497323L, var1)) ? 1 : 0);
      }

      int[] var10001 = var5;
      if (var1 > 0L) {
         if (var5 == null) {
            if (var10000 == 0) {
               return false;
            }

            var10000 = (byte) ((recovery$indy$49(ClientGlobals.field_48.field_44J, 1223010739372025246L, var1)) ? 1 : 0);
         }

         var10001 = var5;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (var10000 == 0) {
               return false;
            }

            double var7;
            var10000 = (byte)((
                     var7 = recovery$indy$50(field_43, 1217061082616214691L, var1)
                           .method_49$4b58f7ab41(this.field_49.field_43S, this.field_49.field_47B, this.field_49.field_43E)
                        - 3.0
                  )
                  == 0.0
               ? 0
               : (var7 < 0.0 ? -1 : 1));
         }

         var10001 = var5;
      }

      return (boolean)(var10001 != null ? var10000 : var10000 > 0);
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      augustus.recovered.modules.combat.MoreKB_47CU var7;
      int[] var6;
      int var10000;
      int[] var10001;
      label58: {
         label57: {
            long var4;
            label56: {
               label61: {
                  var4 = var2 ^ 74807535967538L;
                  var6 = recovery$indy$51(6398792429069540602L, var2);
                  var10000 = (int) ((recovery$indy$52(var1, 6401707571794953346L, var2)) ? 1 : 0);
                  if (var6 == null) {
                     if (var10000 != 0) {
                        break label61;
                     }

                     float var8;
                     var10000 = (var8 = recovery$indy$53(var1, 6401306901874794769L, var2) - 1.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
                  }

                  var10001 = var6;
                  if (var2 <= 0L) {
                     break label58;
                  }

                  if (var6 != null) {
                     break label57;
                  }

                  if (var10000 == 0) {
                     break label56;
                  }
               }

               this.field_43v = true;
            }

            this.field_437++;
            var10000 = (int) ((recovery$indy$54(this.settingModes, var4, 6400857501638437965L, var2).equals(recovery$indy$55(27931, 8227678157240439053L ^ var2))) ? 1 : 0);
         }

         var10001 = var6;
      }

      label62: {
         if (var10001 == null) {
            if (var10000 == 0) {
               return;
            }

            var7 = this;
            if (var6 != null) {
               break label62;
            }

            var10000 = this.field_43p;
         }

         if (var10000 <= 0) {
            return;
         }

         this.field_43p--;
         recovery$indy$56(var1, true, 6398718486470764587L, var2);
         this.field_43u = true;
         var7 = this;
      }

      var7.field_437 = 0;
   }



   private EntityLivingBase method_47$f2b0beb8fc(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 130401965520917L;
      int[] var5 = recovery$indy$57(2068879977691306113L, var1);
      Object var6 = null;
      C_47Ij var10000 = recovery$indy$58(field_43, 2067910280139696760L, var1);
      if (var5 == null) {
         if (var10000 == null) {
            return recovery$indy$62(var6, var3, 2067265010343187557L, var1);
         }

         var10000 = recovery$indy$59(field_43, 2067910280139696760L, var1);
      }

      if (var5 == null) {
         if (var10000.field_49 != C_47Az.ENTITY) {
            return recovery$indy$62(var6, var3, 2067265010343187557L, var1);
         }

         var10000 = recovery$indy$60(field_43, 2067910280139696760L, var1);
      }

      Entity var8 = var10000.field_47;
      if (var5 == null) {
         if (!(var10000.field_47 instanceof EntityLivingBase)) {
            return recovery$indy$62(var6, var3, 2067265010343187557L, var1);
         }

         var8 = recovery$indy$61(field_43, 2067910280139696760L, var1).field_47;
      }

      var6 = (EntityLivingBase)var8;
      return recovery$indy$62(var6, var3, 2067265010343187557L, var1);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$63(this, 21, var3, -7101161859969850623L, var1);
      recovery$indy$64(this, 40, var3, -7101161859969850623L, var1);
      recovery$indy$65(this, 24, var3, -7101161859969850623L, var1);
      recovery$indy$66(this, 17, var3, -7101161859969850623L, var1);
      recovery$indy$67(this, 26, var3, -7101161859969850623L, var1);
      recovery$indy$68(this, 1, var3, -7101161859969850623L, var1);
   }



   private boolean method_42p$aae029aa0a() {
      long var1 = a ^ 44605778851972L;
      long var3 = var1 ^ 8080014602968L;
      long var10002 = -5242705997152107609L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("LegitSneak");
   }



   private boolean method_42f$0dd78e0064(long var1) {
      int var3;
      int var4;
      int var5;
      int[] var6;
      int[] var10;
      int var10000;
      label82: {
         var1 = a ^ var1;
         long var10001 = var1 ^ 17197719807432L;
         var3 = (int)((var1 ^ 17197719807432L) >>> 48);
         var4 = (int)((var1 ^ 17197719807432L) << 16 >>> 48);
         var5 = (int)(var10001 << 32 >>> 32);
         var6 = recovery$indy$69(8289527441536726845L, var1);
         var10000 = this.field_42;
         label81:
         if (var6 == null) {
            if (this.field_42 > 0) {
               var10000 = (int) ((this.field_49s) ? 1 : 0);
               var10 = var6;
               if (var1 < 0L) {
                  break label82;
               }

               if (var6 != null) {
                  break label81;
               }

               if (this.field_49s) {
                  this.field_42++;
               }
            }

            this.field_42--;
            var10000 = (int) ((recovery$indy$70(this.settingFailSprintReset, 8289037043771356697L, var1)) ? 1 : 0);
         }

         var10 = var6;
      }

      label71: {
         label86: {
            if (var1 > 0L) {
               if (var10 == null) {
                  if (var10000 == 0) {
                     break label86;
                  }

                  var10000 = this.field_43y;
               }

               var10 = var6;
            }

            if (var10 != null) {
               break label71;
            }

            if (var10000 >= recovery$indy$71(this.settingFailDelay, 8289941292316534520L, var1)) {
               var10000 = 1;
               break label71;
            }
         }

         var10000 = 0;
      }

      int var7 = var10000;
      var10000 = var7;
      var10 = var6;
      if (var1 > 0L) {
         if (var6 == null) {
            if (var7 != 0) {
               this.field_42 = (int)recovery$indy$72(this.settingFailDuration, 8290618970392294866L, var1);
               this.field_43y = 0;
               recovery$indy$73(this.settingFailDelay, (short)var3, (char)var4, var5, 8288925537981407539L, var1);
            }

            var10000 = this.field_42;
         }

         var10 = var6;
      }

      if (var10 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return var10000 != 0;
   }




    public void method_48o$537c8d9634(int n, short s, char c) {
        Object object;
        block85: {
            int n2;
            int n3;
            int n4;
            long l;
            int n5;
            int n6;
            int n7;
            long l2;
            block83: {
                block84: {
                    int[] nArray;
                    int[] nArray2;
                    block81: {
                        int[] nArray3;
                        block82: {
                            block80: {
                                int[] nArray4;
                                int[] nArray5;
                                int n8;
                                long l3;
                                block77: {
                                    block78: {
                                        block75: {
                                            block76: {
                                                boolean bl;
                                                Object object2;
                                                long l4;
                                                block79: {
                                                    int[] nArray6;
                                                    int n9;
                                                    int n10;
                                                    int n11;
                                                    long l5;
                                                    block65: {
                                                        block66: {
                                                            block68: {
                                                                int n12;
                                                                long l6;
                                                                long l7;
                                                                long l8;
                                                                block74: {
                                                                    block73: {
                                                                        block70: {
                                                                            block72: {
                                                                                long l9;
                                                                                block67: {
                                                                                    block69: {
                                                                                        block71: {
                                                                                            int n13;
                                                                                            block63: {
                                                                                                block64: {
                                                                                                    char c2;
                                                                                                    block57: {
                                                                                                        block58: {
                                                                                                            block56: {
                                                                                                                block61: {
                                                                                                                    int[] nArray7;
                                                                                                                    block62: {
                                                                                                                        int n14;
                                                                                                                        block60: {
                                                                                                                            int[] nArray8;
                                                                                                                            block51: {
                                                                                                                                block52: {
                                                                                                                                    block54: {
                                                                                                                                        int n15;
                                                                                                                                        block59: {
                                                                                                                                            block53: {
                                                                                                                                                block55: {
                                                                                                                                                    Object object3;
                                                                                                                                                    block38: {
                                                                                                                                                        block49: {
                                                                                                                                                            block34: {
                                                                                                                                                                block50: {
                                                                                                                                                                    char c3;
                                                                                                                                                                    block44: {
                                                                                                                                                                        block46: {
                                                                                                                                                                            block43: {
                                                                                                                                                                                block48: {
                                                                                                                                                                                    block39: {
                                                                                                                                                                                        int n16;
                                                                                                                                                                                        block47: {
                                                                                                                                                                                            block41: {
                                                                                                                                                                                                block45: {
                                                                                                                                                                                                    block42: {
                                                                                                                                                                                                        block40: {
                                                                                                                                                                                                            int[] nArray9;
                                                                                                                                                                                                            block30: {
                                                                                                                                                                                                                block32: {
                                                                                                                                                                                                                    block36: {
                                                                                                                                                                                                                        block37: {
                                                                                                                                                                                                                            block35: {
                                                                                                                                                                                                                                block33: {
                                                                                                                                                                                                                                    block28: {
                                                                                                                                                                                                                                        block31: {
                                                                                                                                                                                                                                            net.minecraft.entity.EntityLivingBase c_47aK;
                                                                                                                                                                                                                                            block29: {
                                                                                                                                                                                                                                                block27: {
                                                                                                                                                                                                                                                    long l10 = l2 = (long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48;
                                                                                                                                                                                                                                                    l8 = l10 ^ 0x6760E500A2EDL;
                                                                                                                                                                                                                                                    l5 = l10 ^ 0x3D28AEAF101BL;
                                                                                                                                                                                                                                                    long l11 = l10 ^ 0x41EFC22C95D5L;
                                                                                                                                                                                                                                                    long l12 = l10 ^ 0x1549F093CD51L;
                                                                                                                                                                                                                                                    l4 = l10 ^ 0x525FC88B6512L;
                                                                                                                                                                                                                                                    l7 = l10 ^ 0x66F145ED523EL;
                                                                                                                                                                                                                                                    long l13 = l10 ^ 0x48F988A0F3F1L;
                                                                                                                                                                                                                                                    n7 = (int)(l13 >>> 32);
                                                                                                                                                                                                                                                    n6 = (int)(l13 << 32 >>> 48);
                                                                                                                                                                                                                                                    n5 = (int)(l13 << 48 >>> 48);
                                                                                                                                                                                                                                                    l = l10 ^ 0x1E197B433ECFL;
                                                                                                                                                                                                                                                    l3 = l10 ^ 0x5A9473B5DBB0L;
                                                                                                                                                                                                                                                    long l14 = l10 ^ 0x53BF3A54888DL;
                                                                                                                                                                                                                                                    n11 = (int)(l14 >>> 48);
                                                                                                                                                                                                                                                    n10 = (int)(l14 << 16 >>> 48);
                                                                                                                                                                                                                                                    n9 = (int)(l14 << 32 >>> 32);
                                                                                                                                                                                                                                                    l9 = l10 ^ 0x62B4CFE8C11FL;
                                                                                                                                                                                                                                                    l6 = l10 ^ 0x309853D69724L;
                                                                                                                                                                                                                                                    MoreKB_47CU.recovery$indy$75(this, l11, MoreKB_47CU.recovery$indy$74(this.settingModes, l3, 2186065927699950287L, l2), 2182284667429416928L, l2);
                                                                                                                                                                                                                                                    c_47aK = MoreKB_47CU.recovery$indy$77(this, l12, 2182606172280047362L, l2);
                                                                                                                                                                                                                                                    object3 = nArray3 = MoreKB_47CU.recovery$indy$76(2183978993643444856L, l2);
                                                                                                                                                                                                                                                    object = c_47aK;
                                                                                                                                                                                                                                                    if (object3 != null) break block27;
                                                                                                                                                                                                                                                    object3 = object;
                                                                                                                                                                                                                                                    if (object3 == null) break block28;
                                                                                                                                                                                                                                                    break block29;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                char c4 = c;
                                                                                                                                                                                                                                                nArray7 = nArray3;
                                                                                                                                                                                                                                                n13 = ((net.minecraft.entity.EntityLivingBase)object).field_432;
                                                                                                                                                                                                                                                if (c4 <= '\u0000') break block30;
                                                                                                                                                                                                                                                break block31;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            this.field_49 = c_47aK;
                                                                                                                                                                                                                                            break block28;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        int[] nArray10 = nArray7;
                                                                                                                                                                                                                                        if (nArray10 != null) break block32;
                                                                                                                                                                                                                                        break block33;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    object = this.field_49;
                                                                                                                                                                                                                                    object3 = object;
                                                                                                                                                                                                                                    if (object3 == null) break block34;
                                                                                                                                                                                                                                    break block35;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                int n17 = 10;
                                                                                                                                                                                                                                int n18 = n13;
                                                                                                                                                                                                                                if (n18 != n17) break block36;
                                                                                                                                                                                                                                break block37;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            object = this.field_49;
                                                                                                                                                                                                                            char c5 = c;
                                                                                                                                                                                                                            nArray2 = nArray3;
                                                                                                                                                                                                                            n4 = ((net.minecraft.entity.EntityLivingBase)object).field_432;
                                                                                                                                                                                                                            if (c5 <= '\u0000') break block38;
                                                                                                                                                                                                                            break block39;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        this.field_43v = false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    n13 = MoreKB_47CU.recovery$indy$78(field_43, 2185520514230696468L, l2).method_43B$aae029aa0a() ? 1 : 0;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                nArray7 = nArray3;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if ((nArray9 = nArray7) != null) break block40;
                                                                                                                                                                                                            int n19 = n13;
                                                                                                                                                                                                            if (n19 == 0) break block41;
                                                                                                                                                                                                            break block42;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n16 = n13;
                                                                                                                                                                                                        if (n16 == 0) break block43;
                                                                                                                                                                                                        n16 = s;
                                                                                                                                                                                                        nArray7 = nArray3;
                                                                                                                                                                                                        object = this;
                                                                                                                                                                                                        if (n16 < 0) break block44;
                                                                                                                                                                                                        break block45;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    this.field_43v = true;
                                                                                                                                                                                                    break block41;
                                                                                                                                                                                                }
                                                                                                                                                                                                int[] nArray11 = nArray7;
                                                                                                                                                                                                if (nArray11 != null) break block46;
                                                                                                                                                                                                break block47;
                                                                                                                                                                                            }
                                                                                                                                                                                            object = this;
                                                                                                                                                                                            break block46;
                                                                                                                                                                                        }
                                                                                                                                                                                        n16 = MoreKB_47CU.recovery$indy$79(((MoreKB_47CU)object).settingDontSprintResetIfYouAlreadyDidLegit, 2183629393516419932L, l2) ? 1 : 0;
                                                                                                                                                                                        if (n16 == 0) break block43;
                                                                                                                                                                                        break block48;
                                                                                                                                                                                    }
                                                                                                                                                                                    int[] nArray12 = nArray2;
                                                                                                                                                                                    if (nArray12 != null) break block49;
                                                                                                                                                                                    int n20 = n4;
                                                                                                                                                                                    n3 = 10;
                                                                                                                                                                                    if (n20 != n3) break block34;
                                                                                                                                                                                    break block50;
                                                                                                                                                                                }
                                                                                                                                                                                this.field_49p = false;
                                                                                                                                                                                this.field_43P = false;
                                                                                                                                                                                this.field_43p = 0;
                                                                                                                                                                            }
                                                                                                                                                                            object = this;
                                                                                                                                                                        }
                                                                                                                                                                        nArray7 = nArray3;
                                                                                                                                                                    }
                                                                                                                                                                    if ((c3 = c) <= '\u0000') break block51;
                                                                                                                                                                    Object object4 = nArray7;
                                                                                                                                                                    if (object4 != null) break block52;
                                                                                                                                                                    short s2 = s;
                                                                                                                                                                    object = ((MoreKB_47CU)object).field_49;
                                                                                                                                                                    if (s2 < 0) break block53;
                                                                                                                                                                    object4 = object;
                                                                                                                                                                    if (object4 == null) break block54;
                                                                                                                                                                    break block55;
                                                                                                                                                                }
                                                                                                                                                                this.field_43v = false;
                                                                                                                                                            }
                                                                                                                                                            n4 = ((int) (MoreKB_47CU.recovery$indy$78(field_43, 2185520514230696468L, l2).method_43B$aae029aa0a() ? 1 : 0));
                                                                                                                                                        }
                                                                                                                                                        nArray2 = nArray3;
                                                                                                                                                    }
                                                                                                                                                    if ((object3 = nArray2) == null) {
                                                                                                                                                        int n21 = n4;
                                                                                                                                                        if (n21 != 0) {
                                                                                                                                                            this.field_43v = true;
                                                                                                                                                        }
                                                                                                                                                        object = this;
                                                                                                                                                        n4 = ((MoreKB_47CU)object).field_43v ? 1 : 0;
                                                                                                                                                    }
                                                                                                                                                    if ((n15 = n4) == 0) break block56;
                                                                                                                                                    n15 = s;
                                                                                                                                                    nArray2 = nArray3;
                                                                                                                                                    object = this;
                                                                                                                                                    if (n15 < 0) break block57;
                                                                                                                                                    int[] nArray13 = nArray2;
                                                                                                                                                    if (nArray13 != null) break block58;
                                                                                                                                                    break block59;
                                                                                                                                                }
                                                                                                                                                object = this.field_49;
                                                                                                                                            }
                                                                                                                                            n13 = ((net.minecraft.entity.EntityLivingBase)object).field_432;
                                                                                                                                            break block60;
                                                                                                                                        }
                                                                                                                                        n15 = MoreKB_47CU.recovery$indy$79(((MoreKB_47CU)object).settingDontSprintResetIfYouAlreadyDidLegit, 2183629393516419932L, l2) ? 1 : 0;
                                                                                                                                        if (n15 == 0) break block56;
                                                                                                                                        break block61;
                                                                                                                                    }
                                                                                                                                    object = this;
                                                                                                                                }
                                                                                                                                nArray7 = nArray3;
                                                                                                                            }
                                                                                                                            if ((nArray8 = nArray7) != null) break block62;
                                                                                                                            n13 = ((MoreKB_47CU)object).field_43P ? 1 : 0;
                                                                                                                        }
                                                                                                                        object = (n14 = n13) != 0 ? this : this;
                                                                                                                    }
                                                                                                                    int n22 = this.field_43p;
                                                                                                                    int[] nArray14 = nArray3;
                                                                                                                    int[] nArray15 = nArray14;
                                                                                                                    if (nArray15 == null) {
                                                                                                                        int n23 = n22;
                                                                                                                        n22 = n23 > 0 ? 1 : 0;
                                                                                                                    }
                                                                                                                    ((MoreKB_47CU)object).field_43u = (n22 != 0);
                                                                                                                    n13 = this.field_43p;
                                                                                                                    nArray7 = nArray3;
                                                                                                                    int[] nArray16 = nArray7;
                                                                                                                    if (nArray16 != null) break block63;
                                                                                                                    break block64;
                                                                                                                }
                                                                                                                this.field_49p = false;
                                                                                                                this.field_43P = false;
                                                                                                                this.field_43p = 0;
                                                                                                            }
                                                                                                            object = this;
                                                                                                        }
                                                                                                        nArray2 = nArray3;
                                                                                                    }
                                                                                                    if ((c2 = c) <= '\u0000') break block65;
                                                                                                    int[] nArray17 = nArray2;
                                                                                                    if (nArray17 != null) break block66;
                                                                                                    short s3 = s;
                                                                                                    object = ((MoreKB_47CU)object).field_49;
                                                                                                    if (s3 < 0) break block67;
                                                                                                    Object object5 = object;
                                                                                                    if (object5 == null) break block68;
                                                                                                    break block69;
                                                                                                }
                                                                                                int n24 = n13;
                                                                                                if (n24 == 0) break block70;
                                                                                                break block71;
                                                                                            }
                                                                                            int n25 = n13;
                                                                                            if (n25 == 0) break block72;
                                                                                            object = this;
                                                                                            break block73;
                                                                                        }
                                                                                        object = this;
                                                                                        break block73;
                                                                                    }
                                                                                    object = this.field_49;
                                                                                }
                                                                                n4 = ((net.minecraft.entity.EntityLivingBase)object).field_432;
                                                                                n3 = 10;
                                                                                n12 = n4;
                                                                                if (n12 != n3) break block68;
                                                                                n4 = MoreKB_47CU.recovery$indy$80(this, l9, 2183452013367521804L, l2) ? 1 : 0;
                                                                                n12 = n4;
                                                                                if (n12 != 0) break block68;
                                                                                break block74;
                                                                            }
                                                                            object = this;
                                                                            break block73;
                                                                        }
                                                                        object = this;
                                                                    }
                                                                    ++((MoreKB_47CU)object).field_438;
                                                                    return;
                                                                }
                                                                n4 = MoreKB_47CU.recovery$indy$81(this, l6, 2182014813821094679L, l2) ? 1 : 0;
                                                                n12 = n4;
                                                                if (n12 != 0) {
                                                                    this.field_43a = false;
                                                                    double d = 180.0 - MoreKB_47CU.recovery$indy$83(net.C_47sk.method_41$f6c4892e39(MoreKB_47CU.recovery$indy$82((Object)MoreKB_47CU.field_43, (long)2185520514230696468L, (long)l2).field_48h), net.C_47sk.method_41$f6c4892e39(this.field_49.field_43m), 2182493553015283773L, l2);
                                                                    double d2 = d - MoreKB_47CU.recovery$indy$84(this.settingFOV, l7, 2183553402805294033L, l2);
                                                                    n4 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                                                    n12 = n4;
                                                                    if (n12 <= 0) {
                                                                        n8 = MoreKB_47CU.recovery$indy$85(this, l8, 2182648737353557358L, l2) ? 1 : 0;
                                                                        object = this;
                                                                        n12 = n8;
                                                                        n8 = n12 == 0 ? 1 : 0;
                                                                        ((MoreKB_47CU)object).field_43P = (n8 != 0);
                                                                    }
                                                                    n12 = c;
                                                                    n8 = 0;
                                                                    object = this;
                                                                    if (n12 > 0) {
                                                                        ((MoreKB_47CU)object).field_438 = n8;
                                                                        this.field_49 = null;
                                                                        MoreKB_47CU.recovery$indy$86(this.field_497, 2185473726150243202L, l2);
                                                                        object = this;
                                                                        n4 = ((MoreKB_47CU)object).field_42;
                                                                        n12 = n4;
                                                                        if (n12 <= 0) {
                                                                            ++this.field_43y;
                                                                        }
                                                                        object = this;
                                                                        n8 = 0;
                                                                    }
                                                                    ((MoreKB_47CU)object).field_49p = (n8 != 0);
                                                                }
                                                            }
                                                            object = this;
                                                        }
                                                        nArray2 = nArray3;
                                                    }
                                                    if ((nArray6 = nArray2) != null) break block75;
                                                    n4 = ((MoreKB_47CU)object).field_43P ? 1 : 0;
                                                    int n26 = n4;
                                                    if (n26 == 0) break block76;
                                                    object = this;
                                                    n26 = ((MoreKB_47CU)object).field_438;
                                                    n3 = MoreKB_47CU.recovery$indy$87(this.settingSprintResetTime, 2183847477918092221L, l2);
                                                    if (n26 != n3) break block76;
                                                    MoreKB_47CU.recovery$indy$88(this.settingSprintResetTime, (short)n11, (char)n10, n9, 2183526494538943606L, l2);
                                                    this.field_43p = (int)MoreKB_47CU.recovery$indy$89(this.settingSprintResetTicks, (short)n11, (char)n10, n9, 2183526494538943606L, l2);
                                                    n26 = c;
                                                    nArray5 = nArray3;
                                                    n8 = 0;
                                                    object = this;
                                                    if (n26 < 0) break block77;
                                                    int[] nArray18 = nArray5;
                                                    if (nArray18 != null) break block78;
                                                    ((MoreKB_47CU)object).field_43P = (n8 != 0);
                                                    int n27 = n;
                                                    object = client.ClientGlobals.field_48.field_412;
                                                    if (n27 < 0) break block79;
                                                    n27 = MoreKB_47CU.recovery$indy$90(object, l5, 2185819459218538037L, l2) ? 1 : 0;
                                                    if (n27 == 0) break block76;
                                                    object = client.ClientGlobals.field_48.field_412;
                                                }
                                                if ((object2 = (object = ((augustus.recovered.modules.misc.Debug_47kF)object).field_43Q)) != null && (bl = MoreKB_47CU.recovery$indy$91(object = client.ClientGlobals.field_48.field_412.field_43Q, 2183629393516419932L, l2))) {
                                                    MoreKB_47CU.recovery$indy$93(l4, MoreKB_47CU.recovery$indy$92(2414, 0x585BD91AE83733F9L ^ l2) + this.field_438 + " " + this.field_43p, 2182164005426798115L, l2);
                                                }
                                            }
                                            object = this;
                                        }
                                        n8 = this.field_43p;
                                    }
                                    nArray5 = nArray3;
                                }
                                if ((nArray4 = nArray5) == null) {
                                    int n28 = n8;
                                    n8 = n28 > 0 ? 1 : 0;
                                }
                                ((MoreKB_47CU)object).field_43u = (n8 != 0);
                                n4 = this.field_43p;
                                int n29 = n4;
                                if (n29 <= 0) break block80;
                                n29 = s;
                                nArray2 = nArray3;
                                n4 = MoreKB_47CU.recovery$indy$94(this.settingModes, l3, 2186065927699950287L, l2).equals(MoreKB_47CU.recovery$indy$95(27931, 0x722E8B2C2FA0D78FL ^ l2)) ? 1 : 0;
                                if (n29 <= 0) break block81;
                                int[] nArray19 = nArray2;
                                if (nArray19 != null) break block82;
                                n29 = n4;
                                if (n29 == 0) {
                                    --this.field_43p;
                                    MoreKB_47CU.recovery$indy$96(this, n7, n6, n5, false, 2184055187911318559L, l2);
                                }
                            }
                            n4 = this.field_43v ? 1 : 0;
                        }
                        nArray2 = nArray3;
                    }
                    if ((nArray = nArray2) != null) break block83;
                    int n30 = n4;
                    if (n30 == 0) break block84;
                    object = this;
                    n30 = MoreKB_47CU.recovery$indy$97(((MoreKB_47CU)object).settingDontSprintResetIfYouAlreadyDidLegit, 2183629393516419932L, l2) ? 1 : 0;
                    if (n30 != 0) break block85;
                }
                object = this;
                n4 = MoreKB_47CU.recovery$indy$98(((MoreKB_47CU)object).settingDoubleSprintReset, 2183629393516419932L, l2) ? 1 : 0;
            }
            if ((n2 = n4) != 0) {
                object = this;
                n2 = ((MoreKB_47CU)object).field_43u ? 1 : 0;
                if (n2 == 0) {
                    object = this;
                    n2 = ((MoreKB_47CU)object).field_438;
                    n3 = MoreKB_47CU.recovery$indy$99(this.settingDoubleResetTiming, 2183847477918092221L, l2);
                    if (n2 == n3) {
                        object = this;
                        n2 = MoreKB_47CU.recovery$indy$101(((MoreKB_47CU)object).field_497, l, MoreKB_47CU.recovery$indy$100(this.settingDoubleResetDelay, 2183847477918092221L, l2), 2182850040568135006L, l2) ? 1 : 0;
                        if (n2 != 0) {
                            object = this;
                            n2 = ((MoreKB_47CU)object).field_49p ? 1 : 0;
                            if (n2 == 0) {
                                MoreKB_47CU.recovery$indy$102(this, n7, n6, n5, true, 2184055187911318559L, l2);
                                MoreKB_47CU.recovery$indy$103(this.settingDoubleResetDelay, 2182959511868184727L, l2);
                                MoreKB_47CU.recovery$indy$104(this.settingDoubleResetTiming, 2182959511868184727L, l2);
                                MoreKB_47CU.recovery$indy$105(this.field_497, 2184111230253492006L, l2);
                                this.field_49p = true;
                            }
                        }
                    }
                }
            }
        }
        object = this;
        ++((MoreKB_47CU)object).field_438;
    }








   public void method_43y$e45a9973e5(long var1) {
      this.field_49 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_43P = true;
      this.field_43u = false;
      this.field_49s = false;
      this.field_43a = false;
      recovery$indy$106(this.settingDoubleResetDelay, 2730081260667315007L, var4);
      recovery$indy$107(this.settingDoubleResetTiming, 2730081260667315007L, var4);
      this.field_43v = false;
   }



    public MoreKB_47CU(char a0,int a1,int a2) {
        super((java.lang.String) ("MoreKB"),(java.lang.String) ("MehrR\u00fccksto\u00df"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 131921750842182L)),(java.awt.Color) (new java.awt.Color((int) (252),(int) (73),(int) (3))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a);
        long constructorKey2 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 38745499140977L);
        long constructorKey3 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 16554723185248L);
        long constructorKey4 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 45945698169450L);
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 68934401209019L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 7558852904797L);
        int constructorPart7 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 24922618790395L) >>> 32));
        long constructorKey8 = ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 24922618790395L) << 32) >>> 32);
        int constructorPart9 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 8847923480798L) >>> 32));
        int constructorPart10 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 8847923480798L) << 32) >>> 40));
        int constructorPart11 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 8847923480798L) << 56) >>> 56));
        int constructorPart12 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 124185607551404L) >>> 48));
        int constructorPart13 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 124185607551404L) << 16) >>> 48));
        int constructorPart14 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 124185607551404L) << 32) >>> 32));
        long constructorKey15 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 66312087808907L);
        long constructorKey16 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 123560093310679L);
        long constructorKey17 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 14509235709921L);
        int constructorPart18 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 122912593955564L) >>> 32));
        int constructorPart19 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 122912593955564L) << 32) >>> 48));
        int constructorPart20 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 122912593955564L) << 48) >>> 48));
        long constructorKey21 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.MoreKB_47CU.a) ^ 47862543169754L);
        java.lang.Object initialValue22 = recovery$indy$flow$356(9);
        ((java.lang.Object[]) initialValue22)[0] = "STap";
        ((java.lang.Object[]) initialValue22)[1] = "LegitSneak";
        ((java.lang.Object[]) initialValue22)[2] = "Legit";
        ((java.lang.Object[]) initialValue22)[3] = "LegitFast";
        ((java.lang.Object[]) initialValue22)[4] = "Fast";
        ((java.lang.Object[]) initialValue22)[5] = "LessPacket";
        ((java.lang.Object[]) initialValue22)[6] = "Packet";
        ((java.lang.Object[]) initialValue22)[7] = "DoublePacket";
        ((java.lang.Object[]) initialValue22)[8] = "One";
        client.setting.ModeSetting initialized23 = new client.setting.ModeSetting(this, "Modes", constructorKey15, "Legit", (java.lang.String[]) (initialValue22));
        recovery$indy$flow$358(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey6, "HideSneakAnimation", true);
        java.lang.Object initialValue25 = recovery$indy$flow$361(this);
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey3;
        client.setting.BooleanSetting initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$364(initialValue29, initialValue27, initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue31))))));
        recovery$indy$flow$366(this, initialValue32);
        client.setting.NumberSetting initialized33 = new client.setting.NumberSetting(this, "FOV", Double.longBitsToDouble(4640537203540230144L), constructorKey21, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$369(this, initialized33);
        client.setting.BooleanSetting initialized34 = new client.setting.BooleanSetting(this, constructorKey6, "IgnoreEatingTargets", false);
        recovery$indy$flow$372(this, initialized34);
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, constructorKey6, "DontSprintResetIfYouAlreadyDidLegit", false);
        recovery$indy$flow$375(this, initialized35);
        client.setting.SettingGroup initialized36 = new client.setting.SettingGroup(this, "Timing", true, constructorKey16);
        recovery$indy$flow$378(this, initialized36);
        java.lang.Object initialValue37 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingTiming));
        client.setting.RangeSetting initialized38 = new client.setting.RangeSetting(constructorPart18, this, "SprintResetTime", constructorPart19, constructorPart20, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue37));
        long initialValue39 = constructorKey17;
        client.setting.RangeSetting initialValue40 = initialized38;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = recovery$indy$flow$383(initialValue41, initialValue39);
        double initialValue43 = Double.longBitsToDouble(4629137466983448576L);
        long initialValue44 = constructorKey4;
        double initialValue45 = Double.longBitsToDouble(4624633867356078080L);
        double initialValue46 = Double.longBitsToDouble(4621819117588971520L);
        double initialValue47 = 0.0D;
        double initialValue48 = Double.longBitsToDouble(4619567317775286272L);
        double initialValue49 = 1.0D;
        java.lang.Object initialValue50 = initialValue42;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = recovery$indy$flow$385(initialValue51, initialValue49, initialValue48, initialValue47, initialValue46, initialValue45, initialValue44, initialValue43);
        byte converted53 = (byte) (constructorPart11);
        int initialValue54 = 0;
        int initialValue55 = (int) (converted53);
        double initialValue56 = Double.longBitsToDouble(4617315517961601024L);
        double initialValue57 = Double.longBitsToDouble(4602678819172646912L);
        int initialValue58 = constructorPart10;
        double initialValue59 = 1.0D;
        int initialValue60 = constructorPart9;
        java.lang.Object initialValue61 = initialValue52;
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue63 = recovery$indy$flow$387(initialValue62, initialValue60, initialValue59, initialValue58, initialValue57, initialValue56, (byte) (initialValue55), (initialValue54 != 0));
        recovery$indy$flow$388(this, initialValue63);
        client.setting.SettingGroup initialized64 = new client.setting.SettingGroup(this, "Duration", true, constructorKey16);
        recovery$indy$flow$391(this, initialized64);
        java.lang.Object initialValue65 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDuration));
        client.setting.RangeSetting initialized66 = new client.setting.RangeSetting(constructorPart18, this, "SprintResetTicks", constructorPart19, constructorPart20, 1.0D, 1.0D, 1.0D, Double.longBitsToDouble(4617315517961601024L), 0, (client.setting.SettingGroup) (initialValue65));
        long initialValue67 = constructorKey17;
        client.setting.RangeSetting initialValue68 = initialized66;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = recovery$indy$flow$396(initialValue69, initialValue67);
        double initialValue71 = Double.longBitsToDouble(4613937818241073152L);
        long initialValue72 = constructorKey4;
        double initialValue73 = 0.0D;
        double initialValue74 = Double.longBitsToDouble(4617315517961601024L);
        double initialValue75 = 1.0D;
        double initialValue76 = Double.longBitsToDouble(4611686018427387904L);
        double initialValue77 = Double.longBitsToDouble(4611686018427387904L);
        java.lang.Object initialValue78 = initialValue70;
        java.lang.Object initialValue79 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue80 = recovery$indy$flow$398(initialValue79, initialValue77, initialValue76, initialValue75, initialValue74, initialValue73, initialValue72, initialValue71);
        java.lang.String initialValue81 = "SprintResetDuration";
        long initialValue82 = constructorKey2;
        java.lang.Object initialValue83 = initialValue80;
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue85 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue81))))));
        java.lang.Object initialValue86 = recovery$indy$flow$401(initialValue84, initialValue82, initialValue85);
        byte converted87 = (byte) (constructorPart11);
        int initialValue88 = 0;
        int initialValue89 = (int) (converted87);
        double initialValue90 = Double.longBitsToDouble(4616189618054758400L);
        double initialValue91 = Double.longBitsToDouble(4602678819172646912L);
        int initialValue92 = constructorPart10;
        double initialValue93 = 1.0D;
        int initialValue94 = constructorPart9;
        java.lang.Object initialValue95 = initialValue86;
        java.lang.Object initialValue96 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue97 = recovery$indy$flow$403(initialValue96, initialValue94, initialValue93, initialValue92, initialValue91, initialValue90, (byte) (initialValue89), (initialValue88 != 0));
        recovery$indy$flow$404(this, initialValue97);
        client.setting.SettingGroup initialized98 = new client.setting.SettingGroup(this, "DoubleReset", true, constructorKey16);
        recovery$indy$flow$407(this, initialized98);
        short converted99 = (short) (constructorPart12);
        char converted100 = (char) (constructorPart13);
        java.lang.Object initialValue101 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDoubleReset));
        client.setting.BooleanSetting initialized102 = new client.setting.BooleanSetting(this, "DoubleSprintReset", converted99, converted100, constructorPart14, true, (client.setting.SettingGroup) (initialValue101));
        recovery$indy$flow$411(this, initialized102);
        java.lang.Object initialValue103 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDoubleReset));
        client.setting.RangeSetting initialized104 = new client.setting.RangeSetting(constructorPart18, this, "DoubleResetTiming", constructorPart19, constructorPart20, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4624070917402656768L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue103));
        byte converted105 = (byte) (constructorPart11);
        int initialValue106 = 0;
        int initialValue107 = (int) (converted105);
        double initialValue108 = Double.longBitsToDouble(4617315517961601024L);
        double initialValue109 = Double.longBitsToDouble(4602678819172646912L);
        int initialValue110 = constructorPart10;
        double initialValue111 = 1.0D;
        int initialValue112 = constructorPart9;
        client.setting.RangeSetting initialValue113 = initialized104;
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = recovery$indy$flow$416(initialValue114, initialValue112, initialValue111, initialValue110, initialValue109, initialValue108, (byte) (initialValue107), (initialValue106 != 0));
        java.lang.Object initialValue116 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDoubleSprintReset));
        java.lang.Object initialValue117 = recovery$indy$flow$418(initialValue116);
        java.lang.Object initialValue118 = recovery$indy$flow$419(initialValue116);
        long initialValue119 = constructorKey8;
        java.lang.Object initialValue120 = initialValue118;
        int initialValue121 = constructorPart7;
        java.lang.Object initialValue122 = initialValue115;
        java.lang.Object initialValue123 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue122))))));
        java.lang.Object initialValue124 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue125 = recovery$indy$flow$422(initialValue123, initialValue121, initialValue124, initialValue119);
        recovery$indy$flow$423(this, initialValue125);
        java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDoubleReset));
        client.setting.RangeSetting initialized127 = new client.setting.RangeSetting(constructorPart18, this, "DoubleResetDelay", constructorPart19, constructorPart20, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4624633867356078080L), 0.0D, Double.longBitsToDouble(4629137466983448576L), 0, (client.setting.SettingGroup) (initialValue126));
        long initialValue128 = constructorKey5;
        client.setting.RangeSetting initialValue129 = initialized127;
        java.lang.Object initialValue130 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue131 = recovery$indy$flow$428(initialValue130, initialValue128);
        double initialValue132 = Double.longBitsToDouble(4624633867356078080L);
        long initialValue133 = constructorKey4;
        double initialValue134 = Double.longBitsToDouble(4621819117588971520L);
        double initialValue135 = Double.longBitsToDouble(4629137466983448576L);
        double initialValue136 = 0.0D;
        double initialValue137 = Double.longBitsToDouble(4626322717216342016L);
        double initialValue138 = Double.longBitsToDouble(4617315517961601024L);
        java.lang.Object initialValue139 = initialValue131;
        java.lang.Object initialValue140 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue139))))));
        java.lang.Object initialValue141 = recovery$indy$flow$430(initialValue140, initialValue138, initialValue137, initialValue136, initialValue135, initialValue134, initialValue133, initialValue132);
        java.lang.Object initialValue142 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingDoubleSprintReset));
        java.lang.Object initialValue143 = recovery$indy$flow$432(initialValue142);
        java.lang.Object initialValue144 = recovery$indy$flow$433(initialValue142);
        long initialValue145 = constructorKey8;
        java.lang.Object initialValue146 = initialValue144;
        int initialValue147 = constructorPart7;
        java.lang.Object initialValue148 = initialValue141;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue146))))));
        java.lang.Object initialValue151 = recovery$indy$flow$436(initialValue149, initialValue147, initialValue150, initialValue145);
        recovery$indy$flow$437(this, initialValue151);
        client.setting.SettingGroup initialized152 = new client.setting.SettingGroup(this, "Fail", true, constructorKey16);
        recovery$indy$flow$440(this, initialized152);
        short converted153 = (short) (constructorPart12);
        char converted154 = (char) (constructorPart13);
        java.lang.Object initialValue155 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingFail));
        client.setting.BooleanSetting initialized156 = new client.setting.BooleanSetting(this, "FailSprintReset", converted153, converted154, constructorPart14, true, (client.setting.SettingGroup) (initialValue155));
        recovery$indy$flow$444(this, initialized156);
        java.lang.Object initialValue157 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingFail));
        client.setting.RangeSetting initialized158 = new client.setting.RangeSetting(constructorPart18, this, "FailDelay", constructorPart19, constructorPart20, Double.longBitsToDouble(4624633867356078080L), Double.longBitsToDouble(4625759767262920704L), 0.0D, Double.longBitsToDouble(4639481672377565184L), 0, (client.setting.SettingGroup) (initialValue157));
        long initialValue159 = constructorKey5;
        client.setting.RangeSetting initialValue160 = initialized158;
        java.lang.Object initialValue161 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue160))))));
        java.lang.Object initialValue162 = recovery$indy$flow$449(initialValue161, initialValue159);
        java.lang.Object initialValue163 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingFailSprintReset));
        java.lang.Object initialValue164 = recovery$indy$flow$451(initialValue163);
        java.lang.Object initialValue165 = recovery$indy$flow$452(initialValue163);
        long initialValue166 = constructorKey8;
        java.lang.Object initialValue167 = initialValue165;
        int initialValue168 = constructorPart7;
        java.lang.Object initialValue169 = initialValue162;
        java.lang.Object initialValue170 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue171 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue172 = recovery$indy$flow$455(initialValue170, initialValue168, initialValue171, initialValue166);
        recovery$indy$flow$456(this, initialValue172);
        java.lang.Object initialValue173 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingFail));
        client.setting.RangeSetting initialized174 = new client.setting.RangeSetting(constructorPart18, this, "FailDuration", constructorPart19, constructorPart20, 1.0D, Double.longBitsToDouble(4611686018427387904L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue173));
        byte converted175 = (byte) (constructorPart11);
        int initialValue176 = 0;
        int initialValue177 = (int) (converted175);
        double initialValue178 = Double.longBitsToDouble(4617315517961601024L);
        double initialValue179 = Double.longBitsToDouble(4602678819172646912L);
        int initialValue180 = constructorPart10;
        double initialValue181 = 1.0D;
        int initialValue182 = constructorPart9;
        client.setting.RangeSetting initialValue183 = initialized174;
        java.lang.Object initialValue184 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue183))))));
        java.lang.Object initialValue185 = recovery$indy$flow$461(initialValue184, initialValue182, initialValue181, initialValue180, initialValue179, initialValue178, (byte) (initialValue177), (initialValue176 != 0));
        java.lang.Object initialValue186 = ((java.lang.Object)(((augustus.recovered.modules.combat.MoreKB_47CU) (((java.lang.Object)(this)))).settingFailSprintReset));
        java.lang.Object initialValue187 = recovery$indy$flow$463(initialValue186);
        java.lang.Object initialValue188 = recovery$indy$flow$464(initialValue186);
        long initialValue189 = constructorKey8;
        java.lang.Object initialValue190 = initialValue188;
        int initialValue191 = constructorPart7;
        java.lang.Object initialValue192 = initialValue185;
        java.lang.Object initialValue193 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue194 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue190))))));
        java.lang.Object initialValue195 = recovery$indy$flow$467(initialValue193, initialValue191, initialValue194, initialValue189);
        recovery$indy$flow$468(this, initialValue195);
        net.C_473X initialized196 = new net.C_473X();
        recovery$indy$flow$471(this, initialized196);
        recovery$indy$flow$472(this, 0);
        recovery$indy$flow$473(this, 0);
        recovery$indy$flow$474(this, 0);
        recovery$indy$flow$475(this, 0);
        recovery$indy$flow$476(this, true);
        recovery$indy$flow$477(this, false);
        recovery$indy$flow$478(this, 0);
        recovery$indy$flow$479(this, false);
        recovery$indy$flow$480(this, false);
        recovery$indy$flow$481(this, false);
        recovery$indy$flow$482(this, false);
    }








    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$356(int a0);
    private static native void recovery$indy$flow$358(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$361(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$364(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$366(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$369(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$372(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$375(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$378(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$383(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$385(java.lang.Object a0,double a1,double a2,double a3,double a4,double a5,long a6,double a7);

    private static native java.lang.Object recovery$indy$flow$387(java.lang.Object a0,int a1,double a2,int a3,double a4,double a5,byte a6,boolean a7);
    private static native void recovery$indy$flow$388(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$391(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$396(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$398(java.lang.Object a0,double a1,double a2,double a3,double a4,double a5,long a6,double a7);


    private static native java.lang.Object recovery$indy$flow$401(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$403(java.lang.Object a0,int a1,double a2,int a3,double a4,double a5,byte a6,boolean a7);
    private static native void recovery$indy$flow$404(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$407(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$411(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$416(java.lang.Object a0,int a1,double a2,int a3,double a4,double a5,byte a6,boolean a7);

    private static java.lang.Object recovery$indy$flow$418(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$419(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$422(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$423(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$428(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$430(java.lang.Object a0,double a1,double a2,double a3,double a4,double a5,long a6,double a7);

    private static java.lang.Object recovery$indy$flow$432(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$433(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$436(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$437(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$440(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$444(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$449(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$451(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$455(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$456(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0,int a1,double a2,int a3,double a4,double a5,byte a6,boolean a7);

    private static java.lang.Object recovery$indy$flow$463(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$464(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$467(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$468(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$471(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$472(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$473(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$474(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$475(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$476(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$477(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$478(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$479(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_49p = a1;
        return;
    }
    private static void recovery$indy$flow$480(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$481(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_49s = a1;
        return;
    }
    private static void recovery$indy$flow$482(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoreKB_47CU) (a0)).field_43v = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, float var1, long var2, long var4);
   private static native int[] recovery$indy$4(long var0, long var2);
   private static native Entity recovery$indy$5(Object var0, long var1, long var3);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native C_473U recovery$indy$7(Object var0, long var1, long var3);
   private static native String recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$9(long var0, long var2);
   private static native String recovery$indy$10(int var0, long var1);
   private static native String recovery$indy$11(int var0, long var1);
   private static native String recovery$indy$12(int var0, long var1);
   private static native String recovery$indy$13(int var0, long var1);
   private static native String recovery$indy$14(int var0, long var1);
   private static native String recovery$indy$15(int var0, long var1);
   private static native String recovery$indy$16(int var0, long var1);
   private static native String recovery$indy$17(int var0, long var1);
   private static native String recovery$indy$18(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$39(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native int[] recovery$indy$44(long var0, long var2);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3);
   private static native int[] recovery$indy$46(long var0, long var2);
   private static native boolean recovery$indy$47(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);
   private static native int[] recovery$indy$51(long var0, long var2);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3);
   private static native float recovery$indy$53(Object var0, long var1, long var3);
   private static native String recovery$indy$54(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$55(int var0, long var1);
   private static native void recovery$indy$56(Object var0, boolean var1, long var2, long var4);
   private static native int[] recovery$indy$57(long var0, long var2);
   private static native C_47Ij recovery$indy$58(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$59(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$60(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$61(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$62(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$69(long var0, long var2);
   private static native boolean recovery$indy$70(Object var0, long var1, long var3);
   private static native int recovery$indy$71(Object var0, long var1, long var3);
   private static native double recovery$indy$72(Object var0, long var1, long var3);
   private static native double recovery$indy$73(Object var0, short var1, char var2, int var3, long var4, long var6);
   private static native String recovery$indy$74(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$75(Object var0, long var1, Object var3, long var4, long var6);
   private static native int[] recovery$indy$76(long var0, long var2);
   private static native EntityLivingBase recovery$indy$77(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$78(Object var0, long var1, long var3);
   private static native boolean recovery$indy$79(Object var0, long var1, long var3);
   private static native boolean recovery$indy$80(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$81(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
   private static native double recovery$indy$83(double var0, double var2, long var4, long var6);
   private static native double recovery$indy$84(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$85(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$86(Object var0, long var1, long var3);
   private static native int recovery$indy$87(Object var0, long var1, long var3);
   private static native double recovery$indy$88(Object var0, short var1, char var2, int var3, long var4, long var6);
   private static native double recovery$indy$89(Object var0, short var1, char var2, int var3, long var4, long var6);
   private static native boolean recovery$indy$90(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$91(Object var0, long var1, long var3);
   private static native String recovery$indy$92(int var0, long var1);
   private static native void recovery$indy$93(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$94(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$95(int var0, long var1);
   private static native void recovery$indy$96(Object var0, int var1, int var2, int var3, boolean var4, long var5, long var7);
   private static native boolean recovery$indy$97(Object var0, long var1, long var3);
   private static native boolean recovery$indy$98(Object var0, long var1, long var3);
   private static native int recovery$indy$99(Object var0, long var1, long var3);
   private static native int recovery$indy$100(Object var0, long var1, long var3);
   private static native boolean recovery$indy$101(Object var0, long var1, int var3, long var4, long var6);
   private static native void recovery$indy$102(Object var0, int var1, int var2, int var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$103(Object var0, long var1, long var3);
   private static native double recovery$indy$104(Object var0, long var1, long var3);
   private static native void recovery$indy$105(Object var0, long var1, long var3);
   private static native double recovery$indy$106(Object var0, long var1, long var3);
   private static native double recovery$indy$107(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$113();
}
