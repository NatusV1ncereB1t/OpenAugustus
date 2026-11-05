package augustus.recovered.modules.player;
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
import net.C_473U;
import net.C_479E;
import net.C_479J;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import client.module.Module;
import client.setting.NumberSetting;
import net.C_47TT;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.module.Category;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class SelfDamage_47Qw extends client.module.Module implements net.C_47Vc,net.C_47iC,net.C_47mz {
    private final client.setting.ModeSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSetPositionYAdd = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMotion = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLoops = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYAddInLoopFirst = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSecondPacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYAddInLoopSecond = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFinishPacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYAddFinish = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRepeat = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRepeatTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$e45a9973e5(long var1) {
      byte var74;
      boolean var78;
      augustus.recovered.modules.player.SelfDamage_47Qw var82;
      long var3;
      long var5;
      long var7;
      long var11;
      byte var13;
      int var71;
      var1 = a ^ var1;
      var3 = var1 ^ 16432565858825L;
      var5 = var1 ^ 45526921879371L;
      var7 = var1 ^ 42234404591950L;
      long var9 = var1 ^ 28639931814080L;
      var11 = var1 ^ 8534290848166L;
      long var10002 = -7692809096897494583L;
      long var17 = var9;
      ModeSetting var19 = this.settingModes;
      String var14 = var19.method_46$5f9dc63072(var17);
      long var10000 = -7692715040619503504L;
      int var70 = (int) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
      byte var15 = -1;
      var13 = (byte)var70;
      var71 = var14.hashCode();
      label337:
      if (var13 != 0) {
         label340: {
            label334: {
               label341: {
                  label332: {
                     label342: {
                        label330: {
                           label343: {
                              label328: {
                                 label344: {
                                    label326: {
                                       label345: {
                                          switch (var71) {
                                             case -1984451626:
                                                var71 = (int) ((var14.equals("Motion")) ? 1 : 0);
                                                if (var13 == 0) {
                                                   break label337;
                                                }

                                                if (var71 == 0) {
                                                   break label340;
                                                }

                                                var15 = 0;
                                                var71 = var13;
                                                if (var1 <= 0L) {
                                                   break;
                                                }

                                                if (var13 != 0) {
                                                   break label340;
                                                }
                                             case 857595017:
                                                var71 = (int) ((var14.equals("Packet1")) ? 1 : 0);
                                                break;
                                             case 2182005:
                                                break label344;
                                             case 49420033:
                                                break label341;
                                             case 110026635:
                                                break label342;
                                             case 857595018:
                                                break label345;
                                             case 2029746065:
                                                break label343;
                                             default:
                                                break label340;
                                          }

                                          if (var13 == 0) {
                                             break label337;
                                          }

                                          if (var71 == 0) {
                                             break label340;
                                          }

                                          var15 = 1;
                                          var71 = var13;
                                          if (var1 < 0L) {
                                             break label326;
                                          }

                                          if (var13 != 0) {
                                             break label340;
                                          }
                                       }

                                       var71 = (int) ((var14.equals("Packet2")) ? 1 : 0);
                                    }

                                    if (var13 == 0) {
                                       break label337;
                                    }

                                    if (var71 == 0) {
                                       break label340;
                                    }

                                    var15 = 2;
                                    var71 = var13;
                                    if (var1 < 0L) {
                                       break label328;
                                    }

                                    if (var13 != 0) {
                                       break label340;
                                    }
                                 }

                                 var71 = (int) ((var14.equals("Fake")) ? 1 : 0);
                              }

                              if (var13 == 0) {
                                 break label337;
                              }

                              if (var71 == 0) {
                                 break label340;
                              }

                              var15 = 3;
                              var71 = var13;
                              if (var1 < 0L) {
                                 break label330;
                              }

                              if (var13 != 0) {
                                 break label340;
                              }
                           }

                           var71 = (int) ((var14.equals("Custom")) ? 1 : 0);
                        }

                        if (var13 == 0) {
                           break label337;
                        }

                        if (var71 == 0) {
                           break label340;
                        }

                        var15 = 4;
                        var71 = var13;
                        if (var1 < 0L) {
                           break label332;
                        }

                        if (var13 != 0) {
                           break label340;
                        }
                     }

                     var71 = (int) ((var14.equals("SetPosition")) ? 1 : 0);
                  }

                  if (var13 == 0) {
                     break label337;
                  }

                  if (var71 == 0) {
                     break label340;
                  }

                  var15 = 5;
                  var71 = var13;
                  if (var1 < 0L) {
                     break label334;
                  }

                  if (var13 != 0) {
                     break label340;
                  }
               }

               var71 = (int) ((var14.equals("3Jump")) ? 1 : 0);
            }

            if (var13 == 0) {
               break label337;
            }

            if (var71 != 0) {
               var15 = 6;
            }
         }

         var71 = var15;
      }

      label362: {
         label349: {
            label254: {
               label350: {
                  label252: {
                     label351: {
                        label250: {
                           label352: {
                              switch (var71) {
                                 case 0:
                                    long var85 = -7695801888368836330L;
                                    Minecraft var20 = field_43;
                                    long var105 = -7696122056674004894L;
                                    long var21 = var7;
                                    NumberSetting var23 = this.settingMotion;
                                    var20.field_42P.field_42 = (float)var23.method_44$474dfaa627(var21);
                                    var74 = var13;
                                    if (var1 < 0L) {
                                       break;
                                    }

                                    if (var13 != 0) {
                                       return;
                                    }
                                 case 1:
                                    long var86 = -7695909118049548791L;
                                    C_47TT.method_43$e45a9973e5(var5);
                                    var74 = var13;
                                    break;
                                 case 2:
                                    break label352;
                                 case 3:
                                    break label351;
                                 case 4:
                                    break label350;
                                 case 5:
                                    long var83 = -7695801888368836330L;
                                    Minecraft var50 = field_43;
                                    EntityPlayerSP var73 = var50.field_42P;
                                    var10002 = -7695801888368836330L;
                                    Minecraft var51 = field_43;
                                    double var84 = var51.field_42P.field_48Q;
                                    long var10003 = -7695801888368836330L;
                                    Minecraft var52 = field_43;
                                    long var10005 = -7696122056674004894L;
                                    long var53 = var7;
                                    NumberSetting var55 = this.settingSetPositionYAdd;
                                    double var101 = var52.field_42P.field_48j + var55.method_44$474dfaa627(var53);
                                    long var10004 = -7695801888368836330L;
                                    Minecraft var56 = field_43;
                                    var73.method_46$a59262c0f0(var84, var101, var56.field_42P.field_42o);
                                    var70 = var13;
                                    break label349;
                                 case 6:
                                    long var10001 = -7695801888368836330L;
                                    Minecraft var57 = field_43;
                                    var70 = (int) ((var57.field_42P.field_48M) ? 1 : 0);
                                    break label362;
                                 default:
                                    return;
                              }

                              if (var1 < 0L) {
                                 break label250;
                              }

                              if (var74 != 0) {
                                 return;
                              }
                           }

                           long var87 = -7693256479598372515L;
                           C_47TT.method_40$e45a9973e5(var11);
                           var74 = var13;
                        }

                        if (var1 < 0L) {
                           break label252;
                        }

                        if (var74 != 0) {
                           return;
                        }
                     }

                     long var88 = -7695801888368836330L;
                     Minecraft var24 = field_43;
                     var24.field_42P.method_48$9edd7f290f((byte)2);
                     var74 = var13;
                  }

                  if (var1 <= 0L) {
                     break label254;
                  }

                  if (var74 != 0) {
                     return;
                  }
               }

               var74 = 0;
            }

            int var16 = var74;

            label223:
            while (true) {
               double var75 = var16;
               long var106 = -7696122056674004894L;
               long var25 = var7;
               NumberSetting var27 = this.settingLoops;
               BooleanSetting var77;
               long var90;
               if (var75 < var27.method_44$474dfaa627(var25)) {
                  var90 = -7695801888368836330L;
                  Minecraft var28 = field_43;
                  C_47K6 var76 = var28.field_42P.field_49m;
                  long var111 = -7695801888368836330L;
                  Minecraft var29 = field_43;
                  double var107 = var29.field_42P.field_48Q;
                  long var118 = -7695801888368836330L;
                  Minecraft var30 = field_43;
                  long var10007 = -7696122056674004894L;
                  long var31 = var7;
                  NumberSetting var33 = this.settingYAddInLoopFirst;
                  double var112 = var30.field_42P.field_48j + var33.method_44$474dfaa627(var31);
                  long var10006 = -7695801888368836330L;
                  Minecraft var34 = field_43;
                  var76.method_43$631790539f(new C_479J(var107, var112, var34.field_42P.field_42o, false));
                  if (var1 >= 0L) {
                     if (var13 != 0) {
                        var77 = this.settingSecondPacket;
                        var90 = -7696204455437860041L;
                        var10002 = var1;
                     } else {
                        if (var13 != 0) {
                           continue;
                        }

                        var77 = this.settingFinishPacket;
                        var90 = -7696204455437860041L;
                        var10002 = var1;
                        if (var1 >= 0L) {
                           BooleanSetting var42 = this.settingFinishPacket;
                           var78 = var42.method_49$aae029aa0a();
                           break;
                        }
                     }
                  } else {
                     if (var13 != 0) {
                        continue;
                     }

                     var77 = this.settingFinishPacket;
                     var90 = -7696204455437860041L;
                     var10002 = var1;
                     if (var1 >= 0L) {
                        BooleanSetting var60 = this.settingFinishPacket;
                        var78 = var60.method_49$aae029aa0a();
                        break;
                     }
                  }
               } else {
                  var77 = this.settingFinishPacket;
                  var90 = -7696204455437860041L;
                  var10002 = var1;
                  if (var1 >= 0L) {
                     BooleanSetting var62 = this.settingFinishPacket;
                     var78 = var62.method_49$aae029aa0a();
                     break;
                  }
               }

               do {
                  var78 = recovery$indy$1(var77, var90, var10002);
                  if (var13 == 0) {
                     break label223;
                  }

                  if (var78) {
                     var90 = -7695801888368836330L;
                     Minecraft var35 = field_43;
                     C_47K6 var79 = var35.field_42P.field_49m;
                     long var113 = -7695801888368836330L;
                     Minecraft var36 = field_43;
                     double var108 = var36.field_42P.field_48Q;
                     long var119 = -7695801888368836330L;
                     Minecraft var37 = field_43;
                     long var124 = -7696122056674004894L;
                     long var38 = var7;
                     NumberSetting var40 = this.settingYAddInLoopSecond;
                     double var114 = var37.field_42P.field_48j + var40.method_44$474dfaa627(var38);
                     long var122 = -7695801888368836330L;
                     Minecraft var41 = field_43;
                     var79.method_43$631790539f(new C_479J(var108, var114, var41.field_42P.field_42o, false));
                  }

                  var16++;
                  if (var13 != 0) {
                     continue label223;
                  }

                  var77 = this.settingFinishPacket;
                  var90 = -7696204455437860041L;
                  var10002 = var1;
               } while (var1 < 0L);

               BooleanSetting var61 = this.settingFinishPacket;
               var78 = var61.method_49$aae029aa0a();
               break;
            }

            if (!var78) {
               return;
            }

            long var92 = -7695801888368836330L;
            Minecraft var43 = field_43;
            C_47K6 var80 = var43.field_42P.field_49m;
            long var115 = -7695801888368836330L;
            Minecraft var44 = field_43;
            double var109 = var44.field_42P.field_48Q;
            long var120 = -7695801888368836330L;
            Minecraft var45 = field_43;
            long var125 = -7696122056674004894L;
            long var46 = var7;
            NumberSetting var48 = this.settingYAddFinish;
            double var116 = var45.field_42P.field_48j + var48.method_44$474dfaa627(var46);
            long var123 = -7695801888368836330L;
            Minecraft var49 = field_43;
            var80.method_43$631790539f(new C_479J(var109, var116, var49.field_42P.field_42o, true));
            var70 = var13;
            if (var1 >= 0L) {
               if (var13 != 0) {
                  return;
               }

               var92 = -7695801888368836330L;
               Minecraft var63 = field_43;
               EntityPlayerSP var81 = var63.field_42P;
               var10002 = -7695801888368836330L;
               Minecraft var64 = field_43;
               double var94 = var64.field_42P.field_48Q;
               long var110 = -7695801888368836330L;
               Minecraft var65 = field_43;
               var120 = -7696122056674004894L;
               long var66 = var7;
               NumberSetting var67 = this.settingSetPositionYAdd;
               double var104 = var65.field_42P.field_48j + var67.method_44$474dfaa627(var66);
               var115 = -7695801888368836330L;
               Minecraft var68 = field_43;
               var81.method_46$a59262c0f0(var94, var104, var68.field_42P.field_42o);
               var70 = var13;
            }
         }

         if (var1 >= 0L) {
            if (var70 != 0) {
               return;
            }

            long var95 = -7695801888368836330L;
            Minecraft var69 = field_43;
            var70 = (int) ((var69.field_42P.field_48M) ? 1 : 0);
         }
      }

      int var97;
      label171: {
         label355: {
            byte var96 = var13;
            if (var1 > 0L) {
               if (var13 != 0) {
                  if (var70 == 0) {
                     return;
                  }

                  var82 = this;
                  var97 = var13;
                  if (var1 <= 0L) {
                     break label171;
                  }

                  if (var13 == 0) {
                     break label355;
                  }

                  var70 = this.field_42;
               }

               var96 = 3;
            }

            if (var70 < var96) {
               long var98 = -7695801888368836330L;
               Minecraft var58 = field_43;
               var58.field_42P.method_46f$da8c82d5d4();
               long var99 = -7692872324515677497L;
               C_47TT.method_45$e45a9973e5(var3);
            }

            var82 = this;
         }

         var97 = var82.field_42 + 1;
      }

      var82.field_42 = var97;
   }








   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 17925729311181L;
      boolean var6 = recovery$indy$2(-7192240148008170436L, var1);
      int var10000 = (int) ((recovery$indy$3(this.settingModes, var4, -7192058786167387964L, var1).equals(recovery$indy$4(6037, 4723250562244820903L ^ var1))) ? 1 : 0);
      if (!var6) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.field_42;
      }

      if (var10000 < 4) {
         C_473U var7 = recovery$indy$5(var3, -7187924800734821320L, var1);
         C_473U var9 = var7;
         if (!var6) {
            if (!(var7 instanceof C_479E)) {
               return;
            }

            var9 = var7;
         }

         C_479E var8 = (C_479E)var9;
         var8.method_49$f633c984d8(false);
      }
   }



   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4 = var2 ^ 138480231952404L;
      long var6 = var2 ^ 27738005618893L;
      boolean var8 = recovery$indy$6(8496438784116221413L, var2);
      int var10000 = (int) ((recovery$indy$7(this.settingModes, var4, 8496534499213369629L, var2).equals(recovery$indy$8(6037, 4723210459173803646L ^ var2))) ? 1 : 0);
      if (!var8) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.field_42;
      }

      if (var10000 < 4) {
         recovery$indy$9(var1, var6, true, 8495934671330535008L, var2);
      }
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 66772429397417L;
      long var3 = var1 ^ 68803694318079L;
      long var10002 = -7781513729845493514L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Custom");
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 65199282622943L;
      long var3 = var1 ^ 63107384319369L;
      long var10002 = 6373866206348692608L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("SetPosition");
   }



   public void method_45p$a6cfe74df2(short var1, long var2) {
        augustus.recovered.modules.player.SelfDamage_47Qw var100;
        augustus.recovered.modules.player.SelfDamage_47Qw var102;
        augustus.recovered.modules.player.SelfDamage_47Qw var105;
        augustus.recovered.modules.player.SelfDamage_47Qw var106;
        augustus.recovered.modules.player.SelfDamage_47Qw var89;
        augustus.recovered.modules.player.SelfDamage_47Qw var91;
        augustus.recovered.modules.player.SelfDamage_47Qw var93;
        augustus.recovered.modules.player.SelfDamage_47Qw var98;
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 110230340898277L;
      long var8 = var4 ^ 127186484910818L;
      long var10 = var4 ^ 93125334867209L;
      long var12 = var4 ^ 115274117911687L;
      byte var14 = ((byte) (AirStuck_47Q4.method_45$aae029aa0a() ? 1 : 0));
      long var15 = var12;
      client.setting.ModeSetting var17 = this.settingModes;
      String var18 = var17.method_46$5f9dc63072(var15);
      long var19 = var8;
      SelfDamage_47Qw var21 = this;
      var21.method_47$d07b98bfef(var19, var18);
      boolean var10000 = this.field_43a;
      if (var14 != 0) {
         int var110;
         label630: {
            if (this.field_43a) {
               long var22 = var12;
               client.setting.ModeSetting var24 = this.settingModes;
               var10000 = var24.method_46$5f9dc63072(var22).equals((String)recovery$indy$flow$169(6037, 4723189444589908717L ^ var4));
               var110 = var14;
               if (var2 > 0L) {
                  if (var14 != 0) {
                     if (var10000) {
                        net.minecraft.client.Minecraft var45 = field_43;
                        if (var45.field_42P == null) {
                           return;
                        }

                        label437: {
                           label436: {
                              client.setting.BooleanSetting var46 = this.settingOnlyOnGround;
                              var10000 = var46.method_49$aae029aa0a();
                              if (var1 >= 0) {
                                 if (!var10000) {
                                    break label436;
                                 }

                                 net.minecraft.client.Minecraft var47 = field_43;
                                 var10000 = var47.field_42P.field_48M;
                              }

                              if (!var10000) {
                                 var105 = this;
                                 if (var14 == 0) {
                                    break label437;
                                 }

                                 long var48 = var12;
                                 client.setting.ModeSetting var49 = this.settingModes;
                                 if (!var49.method_46$5f9dc63072(var48).equals((String)recovery$indy$flow$184(6037, 4723189444589908717L ^ var4))) {
                                    return;
                                 }
                              }
                           }

                           long var51 = var6;
                           SelfDamage_47Qw var53 = this;
                           var53.method_41$e45a9973e5(var51);
                           var105 = this;
                        }

                        var105.field_43a = true;
                     }

                     var10000 = this.field_43a;
                  }

                  if (var14 != 0) {
                     if (!var10000) {
                        return;
                     }

                     long var57 = var12;
                     client.setting.ModeSetting var61 = this.settingModes;
                     var10000 = var61.method_46$5f9dc63072(var57).equals((String)recovery$indy$flow$193(6037, 4723189444589908717L ^ var4));
                  }

                  if (var14 != 0) {
                     if (var10000) {
                        return;
                     }

                     client.setting.BooleanSetting var64 = this.settingRepeat;
                     var10000 = var64.method_49$aae029aa0a();
                  }

                  label408: {
                     label407: {
                        if (var10000) {
                           var106 = this;
                           var110 = var14;
                           if (var1 < 0) {
                              break label408;
                           }

                           if (var14 == 0) {
                              break label407;
                           }

                           double var107 = this.field_43y;
                           long var70 = var10;
                           client.setting.NumberSetting var76 = this.settingRepeatTicks;
                           if (var107 > var76.method_44$474dfaa627(var70)) {
                              this.field_43y = 0;
                              long var82 = var6;
                              SelfDamage_47Qw var88 = this;
                              var88.method_41$e45a9973e5(var82);
                           }
                        }

                        var106 = this;
                     }

                     var110 = var106.field_43y + 1;
                  }

                  var106.field_43y = var110;
                  return;
               }

               if (var2 >= 0L) {
                  if (var14 != 0) {
                     if (!var10000) {
                        return;
                     }

                     long var56 = var12;
                     client.setting.ModeSetting var60 = this.settingModes;
                     var10000 = var60.method_46$5f9dc63072(var56).equals((String)recovery$indy$flow$193(6037, 4723189444589908717L ^ var4));
                  }

                  if (var14 != 0) {
                     if (var10000) {
                        return;
                     }

                     client.setting.BooleanSetting var63 = this.settingRepeat;
                     var10000 = var63.method_49$aae029aa0a();
                  }

                  label454: {
                     label453: {
                        if (var10000) {
                           var102 = this;
                           var110 = var14;
                           if (var1 < 0) {
                              break label454;
                           }

                           if (var14 == 0) {
                              break label453;
                           }

                           double var103 = this.field_43y;
                           long var69 = var10;
                           client.setting.NumberSetting var75 = this.settingRepeatTicks;
                           if (var103 > var75.method_44$474dfaa627(var69)) {
                              this.field_43y = 0;
                              long var81 = var6;
                              SelfDamage_47Qw var87 = this;
                              var87.method_41$e45a9973e5(var81);
                           }
                        }

                        var102 = this;
                     }

                     var110 = var102.field_43y + 1;
                  }

                  var102.field_43y = var110;
                  return;
               }
            } else {
               label609: {
                  net.minecraft.client.Minecraft var44 = field_43;
                  if (var44.field_42P == null) {
                     return;
                  }

                  label518: {
                     client.setting.BooleanSetting var26 = this.settingOnlyOnGround;
                     var10000 = var26.method_49$aae029aa0a();
                     if (var1 >= 0) {
                        if (!var10000) {
                           break label518;
                        }

                        net.minecraft.client.Minecraft var27 = field_43;
                        var10000 = var27.field_42P.field_48M;
                     }

                     if (!var10000) {
                        SelfDamage_47Qw var96 = this;
                        if (var2 >= 0L) {
                           if (var14 != 0) {
                              long var28 = var12;
                              client.setting.ModeSetting var30 = this.settingModes;
                              if (!var30.method_46$5f9dc63072(var28).equals((String)recovery$indy$flow$184(6037, 4723189444589908717L ^ var4))) {
                                 return;
                              }

                              long var31 = var6;
                              SelfDamage_47Qw var33 = this;
                              var33.method_41$e45a9973e5(var31);
                              var96 = this;
                           }

                           var96.field_43a = true;
                           var10000 = this.field_43a;
                           var110 = var14;
                           break label630;
                        }

                        this.field_43a = (boolean)((((int) (var14)) & 1) != 0);
                        var10000 = this.field_43a;
                        var110 = var14;
                        break label609;
                     }
                  }

                  long var50 = var6;
                  SelfDamage_47Qw var52 = this;
                  var52.method_41$e45a9973e5(var50);
                  this.field_43a = true;
                  var10000 = this.field_43a;
                  var110 = var14;
                  if (var2 >= 0L) {
                     break label630;
                  }
               }
            }

            if (var110 != 0) {
               if (var10000) {
                  return;
               }

               client.setting.BooleanSetting var62 = this.settingRepeat;
               var10000 = var62.method_49$aae029aa0a();
            }

            label498: {
               label497: {
                  if (var10000) {
                     var100 = this;
                     var110 = var14;
                     if (var1 < 0) {
                        break label498;
                     }

                     if (var14 == 0) {
                        break label497;
                     }

                     double var101 = this.field_43y;
                     long var68 = var10;
                     client.setting.NumberSetting var74 = this.settingRepeatTicks;
                     if (var101 > var74.method_44$474dfaa627(var68)) {
                        this.field_43y = 0;
                        long var80 = var6;
                        SelfDamage_47Qw var86 = this;
                        var86.method_41$e45a9973e5(var80);
                     }
                  }

                  var100 = this;
               }

               var110 = var100.field_43y + 1;
            }

            var100.field_43y = var110;
            return;
         }

         if (var110 != 0) {
            if (!var10000) {
               return;
            }

            long var55 = var12;
            client.setting.ModeSetting var59 = this.settingModes;
            var10000 = var59.method_46$5f9dc63072(var55).equals((String)recovery$indy$flow$193(6037, 4723189444589908717L ^ var4));
         }

         if (var14 != 0) {
            if (var10000) {
               return;
            }

            client.setting.BooleanSetting var37 = this.settingRepeat;
            var10000 = var37.method_49$aae029aa0a();
         }

         label477: {
            label476: {
               if (var10000) {
                  var98 = this;
                  var110 = var14;
                  if (var1 < 0) {
                     break label477;
                  }

                  if (var14 == 0) {
                     break label476;
                  }

                  double var99 = this.field_43y;
                  long var67 = var10;
                  client.setting.NumberSetting var73 = this.settingRepeatTicks;
                  if (var99 > var73.method_44$474dfaa627(var67)) {
                     this.field_43y = 0;
                     long var79 = var6;
                     SelfDamage_47Qw var85 = this;
                     var85.method_41$e45a9973e5(var79);
                  }
               }

               var98 = this;
            }

            var110 = var98.field_43y + 1;
         }

         var98.field_43y = var110;
      } else if (var2 > 0L) {
         if (var14 != 0) {
            if (this.field_43a) {
               net.minecraft.client.Minecraft var25 = field_43;
               if (var25.field_42P == null) {
                  return;
               }

               this.field_43a = true;
            }

            var10000 = this.field_43a;
         }

         if (var14 != 0) {
            if (!var10000) {
               return;
            }

            long var54 = var12;
            client.setting.ModeSetting var58 = this.settingModes;
            var10000 = var58.method_46$5f9dc63072(var54).equals((String)recovery$indy$flow$193(6037, 4723189444589908717L ^ var4));
         }

         int var109;
         label538: {
            if (var14 != 0) {
               if (var10000) {
                  return;
               }

               var93 = this;
            } else {
               label536: {
                  if (var10000) {
                     var93 = this;
                     var109 = var14;
                     if (var1 < 0) {
                        break label538;
                     }

                     if (var14 == 0) {
                        break label536;
                     }

                     double var94 = this.field_43y;
                     long var66 = var10;
                     client.setting.NumberSetting var72 = this.settingRepeatTicks;
                     if (var94 > var72.method_44$474dfaa627(var66)) {
                        this.field_43y = 0;
                        long var78 = var6;
                        SelfDamage_47Qw var84 = this;
                        var84.method_41$e45a9973e5(var78);
                     }
                  }

                  var93 = this;
               }
            }

            var109 = var93.field_43y + 1;
         }

         var93.field_43y = var109;
      } else if (var2 >= 0L) {
         if (var14 != 0) {
            if (!this.field_43a) {
               return;
            }

            long var34 = var12;
            client.setting.ModeSetting var36 = this.settingModes;
            var10000 = var36.method_46$5f9dc63072(var34).equals((String)recovery$indy$flow$193(6037, 4723189444589908717L ^ var4));
         }

         int var108;
         label561: {
            if (var14 != 0) {
               if (var10000) {
                  return;
               }

               var91 = this;
            } else {
               label559: {
                  if (var10000) {
                     var91 = this;
                     var108 = var14;
                     if (var1 < 0) {
                        break label561;
                     }

                     if (var14 == 0) {
                        break label559;
                     }

                     double var92 = this.field_43y;
                     long var65 = var10;
                     client.setting.NumberSetting var71 = this.settingRepeatTicks;
                     if (var92 > var71.method_44$474dfaa627(var65)) {
                        this.field_43y = 0;
                        long var77 = var6;
                        SelfDamage_47Qw var83 = this;
                        var83.method_41$e45a9973e5(var77);
                     }
                  }

                  var91 = this;
               }
            }

            var108 = var91.field_43y + 1;
         }

         var91.field_43y = var108;
      } else {
         int var10001;
         label583: {
            if (var14 != 0) {
               if (this.field_43a) {
                  return;
               }

               var89 = this;
            } else {
               label581: {
                  if (this.field_43a) {
                     var89 = this;
                     var10001 = var14;
                     if (var1 < 0) {
                        break label583;
                     }

                     if (var14 == 0) {
                        break label581;
                     }

                     double var90 = this.field_43y;
                     long var38 = var10;
                     client.setting.NumberSetting var40 = this.settingRepeatTicks;
                     if (var90 > var40.method_44$474dfaa627(var38)) {
                        this.field_43y = 0;
                        long var41 = var6;
                        SelfDamage_47Qw var43 = this;
                        var43.method_41$e45a9973e5(var41);
                     }
                  }

                  var89 = this;
               }
            }

            var10001 = var89.field_43y + 1;
         }

         var89.field_43y = var10001;
      }
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 43, var3, -7098958416958344037L, var1);
      recovery$indy$14(this, 26, var3, -7098958416958344037L, var1);
      recovery$indy$15(this, 25, var3, -7098958416958344037L, var1);
   }



   private boolean method_43c$aae029aa0a() {
      long var1 = a ^ 108704407956837L;
      long var3 = var1 ^ 106603348107571L;
      long var10002 = -1959386780666138566L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Custom");
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_43Z$aae029aa0a() {
      long var1 = a ^ 114030451438391L;
      long var3 = var1 ^ 111724877332321L;
      long var10002 = -388196380723745176L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Custom");
   }



   private boolean method_43h$aae029aa0a() {
      long var1 = a ^ 21003401735658L;
      long var3 = var1 ^ 18910965506492L;
      long var10000 = 7224327212731076876L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = 7224246442970312885L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Custom");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 7227606621441946187L;
         BooleanSetting var9 = this.settingFinishPacket;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_43D$aae029aa0a() {
      long var1 = a ^ 130903025957957L;
      long var3 = var1 ^ 128810589728787L;
      long var10002 = 8497951413011210522L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Motion");
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_43y = 0;
      this.field_42 = 0;
   }



   private boolean method_43a$aae029aa0a() {
      long var1 = a ^ 74519319921423L;
      long var3 = var1 ^ 72496107409241L;
      long var10000 = 766922067938213865L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = 767016019020783184L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("3Jump");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_430$aae029aa0a() {
      long var1 = a ^ 79430429092631L;
      long var10000 = 7114664763589554864L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 7111402383938221238L;
      BooleanSetting var4 = this.settingRepeat;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 7112221136617941124L;
         BooleanSetting var5 = this.settingRepeat;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43d$aae029aa0a() {
      long var1 = a ^ 60073106471043L;
      long var3 = var1 ^ 57775581754581L;
      long var10000 = 3542313009531667557L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = 3542231077982086620L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("3Jump");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_43s$aae029aa0a() {
      long var1 = a ^ 105372419211772L;
      long var3 = var1 ^ 103340615716266L;
      long var10002 = 601196546642320547L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Custom");
   }



   private boolean method_43f$aae029aa0a() {
      long var1 = a ^ 102504868329910L;
      long var3 = var1 ^ 104537212761568L;
      long var10000 = 8078693501555925009L;
      boolean var5 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 8078863983430395113L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Custom");
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 8075468487583196695L;
         BooleanSetting var9 = this.settingSecondPacket;
         var10 = var9.method_49$aae029aa0a();
      }

      return var5 ? var10 : var10;
   }



    public SelfDamage_47Qw(long a0) {
        super((java.lang.String) ("SelfDamage"),(java.lang.String) ("SelbstSchaden"),(long) (((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 46569828995449L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (64),(int) (52))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 118173207957214L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 118173207957214L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 118173207957214L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 90915823720543L);
        long constructorKey7 = ((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 107678914683316L);
        long constructorKey8 = ((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 100598363688290L);
        long constructorKey9 = ((augustus.recovered.modules.player.SelfDamage_47Qw.a ^ a0) ^ 129906971751141L);
        java.lang.Object initialValue10 = recovery$indy$flow$272(7);
        ((java.lang.Object[]) initialValue10)[0] = "Motion";
        ((java.lang.Object[]) initialValue10)[1] = "Packet1";
        ((java.lang.Object[]) initialValue10)[2] = "Packet2";
        ((java.lang.Object[]) initialValue10)[3] = "Custom";
        ((java.lang.Object[]) initialValue10)[4] = "Fake";
        ((java.lang.Object[]) initialValue10)[5] = "SetPosition";
        ((java.lang.Object[]) initialValue10)[6] = "3Jump";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "Modes", constructorKey7, "Motion", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$274(this, initialized11);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "SetPositionYAdd", Double.longBitsToDouble(4614162998222441677L), constructorKey9, Double.longBitsToDouble(-4607182418800017408L), Double.longBitsToDouble(4616189618054758400L), 4);
        short converted13 = (short) (constructorPart5);
        int initialValue14 = (int) (converted13);
        int initialValue15 = constructorPart4;
        java.lang.String initialValue16 = "YAdd";
        int initialValue17 = constructorPart3;
        client.setting.NumberSetting initialValue18 = initialized12;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue21 = recovery$indy$flow$279(initialValue19, initialValue17, initialValue20, initialValue15, (short) (initialValue14));
        java.lang.Object initialValue22 = recovery$indy$flow$280(this);
        java.lang.Object initialValue23 = initialValue22;
        java.lang.Object initialValue24 = initialValue21;
        java.lang.Object initialValue25 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue26 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue27 = recovery$indy$flow$283(initialValue25, initialValue26);
        recovery$indy$flow$284(this, initialValue27);
        client.setting.NumberSetting initialized28 = new client.setting.NumberSetting(this, "Motion", Double.longBitsToDouble(4617315517961601024L), constructorKey9, 0.0D, Double.longBitsToDouble(4621819117588971520L), 2);
        java.lang.Object initialValue29 = recovery$indy$flow$287(this);
        java.lang.Object initialValue30 = initialValue29;
        client.setting.NumberSetting initialValue31 = initialized28;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue34 = recovery$indy$flow$290(initialValue32, initialValue33);
        recovery$indy$flow$291(this, initialValue34);
        client.setting.NumberSetting initialized35 = new client.setting.NumberSetting(this, "Loops", Double.longBitsToDouble(4632374429215621120L), constructorKey9, 1.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        java.lang.Object initialValue36 = recovery$indy$flow$294(this);
        java.lang.Object initialValue37 = initialValue36;
        client.setting.NumberSetting initialValue38 = initialized35;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue41 = recovery$indy$flow$297(initialValue39, initialValue40);
        recovery$indy$flow$298(this, initialValue41);
        client.setting.NumberSetting initialized42 = new client.setting.NumberSetting(this, "YAddInLoopFirst", Double.longBitsToDouble(4581421828931458171L), constructorKey9, 0.0D, 1.0D, 4);
        java.lang.Object initialValue43 = recovery$indy$flow$301(this);
        java.lang.Object initialValue44 = initialValue43;
        client.setting.NumberSetting initialValue45 = initialized42;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue48 = recovery$indy$flow$304(initialValue46, initialValue47);
        recovery$indy$flow$305(this, initialValue48);
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, constructorKey8, "SecondPacket", true);
        java.lang.Object initialValue50 = recovery$indy$flow$308(this);
        java.lang.Object initialValue51 = initialValue50;
        long initialValue52 = constructorKey6;
        client.setting.BooleanSetting initialValue53 = initialized49;
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue56 = recovery$indy$flow$311(initialValue54, initialValue52, initialValue55);
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue56))))));
        recovery$indy$flow$313(this, initialValue57);
        client.setting.NumberSetting initialized58 = new client.setting.NumberSetting(this, "YAddInLoopSecond", Double.longBitsToDouble(4581421828931458171L), constructorKey9, 0.0D, 1.0D, 4);
        java.lang.Object initialValue59 = recovery$indy$flow$316(this);
        java.lang.Object initialValue60 = initialValue59;
        client.setting.NumberSetting initialValue61 = initialized58;
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue63 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue64 = recovery$indy$flow$319(initialValue62, initialValue63);
        recovery$indy$flow$320(this, initialValue64);
        client.setting.BooleanSetting initialized65 = new client.setting.BooleanSetting(this, constructorKey8, "FinishPacket", true);
        java.lang.Object initialValue66 = recovery$indy$flow$323(this);
        java.lang.Object initialValue67 = initialValue66;
        long initialValue68 = constructorKey6;
        client.setting.BooleanSetting initialValue69 = initialized65;
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue72 = recovery$indy$flow$326(initialValue70, initialValue68, initialValue71);
        java.lang.Object initialValue73 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue72))))));
        recovery$indy$flow$328(this, initialValue73);
        client.setting.NumberSetting initialized74 = new client.setting.NumberSetting(this, "YAddFinish", 0.0D, constructorKey9, 0.0D, 1.0D, 4);
        java.lang.Object initialValue75 = recovery$indy$flow$331(this);
        java.lang.Object initialValue76 = initialValue75;
        client.setting.NumberSetting initialValue77 = initialized74;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue80 = recovery$indy$flow$334(initialValue78, initialValue79);
        recovery$indy$flow$335(this, initialValue80);
        client.setting.BooleanSetting initialized81 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnGround", false);
        java.lang.Object initialValue82 = recovery$indy$flow$338(this);
        java.lang.Object initialValue83 = initialValue82;
        long initialValue84 = constructorKey6;
        client.setting.BooleanSetting initialValue85 = initialized81;
        java.lang.Object initialValue86 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue87 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue88 = recovery$indy$flow$341(initialValue86, initialValue84, initialValue87);
        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue88))))));
        recovery$indy$flow$343(this, initialValue89);
        client.setting.BooleanSetting initialized90 = new client.setting.BooleanSetting(this, constructorKey8, "Repeat", false);
        java.lang.Object initialValue91 = recovery$indy$flow$346(this);
        java.lang.Object initialValue92 = initialValue91;
        long initialValue93 = constructorKey6;
        client.setting.BooleanSetting initialValue94 = initialized90;
        java.lang.Object initialValue95 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue94))))));
        java.lang.Object initialValue96 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue97 = recovery$indy$flow$349(initialValue95, initialValue93, initialValue96);
        java.lang.Object initialValue98 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue97))))));
        recovery$indy$flow$351(this, initialValue98);
        client.setting.NumberSetting initialized99 = new client.setting.NumberSetting(this, "RepeatTicks", Double.longBitsToDouble(4639129828656676864L), constructorKey9, 0.0D, Double.longBitsToDouble(4641240890982006784L), 0);
        java.lang.Object initialValue100 = recovery$indy$flow$354(this);
        java.lang.Object initialValue101 = initialValue100;
        client.setting.NumberSetting initialValue102 = initialized99;
        java.lang.Object initialValue103 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue104 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue105 = recovery$indy$flow$357(initialValue103, initialValue104);
        recovery$indy$flow$358(this, initialValue105);
        recovery$indy$flow$359(this, 0);
        recovery$indy$flow$360(this, false);
        recovery$indy$flow$361(this, 0);
        return;
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$169(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$184(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$193(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$272(int a0);
    private static native void recovery$indy$flow$274(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$279(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$284(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$287(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$290(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$291(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$294(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$297(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$298(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$301(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$304(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$305(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$308(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$311(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$313(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$316(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$319(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$320(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$323(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$326(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$328(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$331(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$334(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$335(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$338(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$341(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$343(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$346(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$349(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$351(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$354(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$357(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$358(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$359(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.SelfDamage_47Qw) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$360(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.SelfDamage_47Qw) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$361(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.SelfDamage_47Qw) (a0)).field_42 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(Object var0, long var1, long var3);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$4(int var0, long var1);
   private static native C_473U recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(long var0, long var2);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native void recovery$indy$9(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$27();
}
