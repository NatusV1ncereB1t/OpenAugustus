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
import net.C_42R;
import net.C_43J;
import net.C_43r;
import net.C_473U;
import net.C_475c;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FQ;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47cu;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_47xZ;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoEat_47QY extends client.module.Module implements net.C_47UH,net.C_47iC,net.C_48T {
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingHunger = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingUseGapple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      augustus.recovered.modules.player.AutoEat_47QY var11;
      boolean var4;
      int var10;
      long var2 = a ^ 92439159260673L;
      long var10000 = -6877921025340453866L;
      var4 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -6880459474981553337L;
      Minecraft var5 = field_43;
      var10 = var5.field_42P.field_42X.field_42;
      label62:
      if (!var4) {
         if (var5.field_42P.field_42X.field_42 != this.field_42) {
            var10 = this.field_42;
            if (var4) {
               break label62;
            }

            if (this.field_42 > -1) {
               return;
            }
         }

         var10 = this.field_42;
      }

      label65: {
         label53:
         if (!var4) {
            if (var10 >= 0) {
               var10001 = -6880627208598741521L;
               Minecraft var6 = field_43;
               var10 = (int) ((var6.method_44$aae029aa0a()) ? 1 : 0);
               if (var4) {
                  break label53;
               }

               if (var10 != 0) {
                  long var10002 = -6880739855745688479L;
                  boolean var7 = true;
                  C_475c var8 = var1;
                  var8.method_45$f633c984d8(var7);
                  if (!var4) {
                     return;
                  }
               }
            }

            var11 = this;
            if (var4) {
               break label65;
            }

            var10 = this.field_43y;
         }

         if (var10 < 0) {
            return;
         }

         var11 = this;
      }

      var10001 = -6880896903418604642L;
      RangeSetting var9 = var11.settingHunger;
      var9.method_43$fedcb3e4d3();
   }



   private boolean method_45$0dd78e0064(long var1) {
      client.module.ModuleManager var7;
      boolean var9;
      long var3;
      boolean var5;
      int var8;
      int var10000;
      label103: {
         label109: {
            var1 = a ^ var1;
            var3 = var1 ^ 65965354283970L;
            var5 = recovery$indy$1(9049137816862451211L, var1);
            var10000 = recovery$indy$2(field_43, 9050822207778334302L, var1).method_44$c1e132d4d1().method_44$8abf5c6871();
            var8 = recovery$indy$3(this.settingHunger, 9050990852074317161L, var1);
            if (var5) {
               if (var10000 >= var8) {
                  return false;
               }

               var10000 = recovery$indy$4(field_43, 9050822207778334302L, var1).field_48y;
               var8 = (int) ((var5) ? 1 : 0);
               if (var1 <= 0L) {
                  break label103;
               }

               if (!var5) {
                  break label109;
               }

               var8 = 20;
            }

            if (var10000 <= var8) {
               return false;
            }

            var10000 = (int) ((recovery$indy$5(field_43, 9050636929167343862L, var1)) ? 1 : 0);
         }

         var8 = (int) ((var5) ? 1 : 0);
      }

      if (var1 > 0L) {
         if ((var8) != 0) {
            if (var10000 == 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$6(ClientGlobals.field_48.field_48Q, var3, 9049346707938692671L, var1)) ? 1 : 0);
         }

         var8 = (int) ((var5) ? 1 : 0);
      }

      label91: {
         label90:
         if ((var8) != 0) {
            label88: {
               if (var10000 != 0) {
                  var7 = ClientGlobals.field_48;
                  if (!var5) {
                     break label88;
                  }

                  if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                     var10000 = (int) ((recovery$indy$7(this.settingNotWhileKillAura, 9050260865527598246L, var1)) ? 1 : 0);
                     var9 = var5;
                     if (var1 < 0L) {
                        break label91;
                     }

                     if (!var5) {
                        break label90;
                     }

                     if (var10000 != 0) {
                        return false;
                     }
                  }
               }

               var7 = ClientGlobals.field_48;
            }

            var10000 = (int) ((recovery$indy$8(var7.field_46q, var3, 9049346707938692671L, var1)) ? 1 : 0);
         }

         var9 = var5;
      }

      if (!var9) {
         return var10000 != 0;
      }

      if (var10000 == 0) {
         return true;
      }

      boolean var10 = recovery$indy$9(this.settingNotWhileScaffold, 9050260865527598246L, var1);
      return !var5 ? var10 : !var10;
   }




   public void method_47$9035875d26(long var1, C_47ob var3) {
      label20: {
         boolean var4 = recovery$indy$10(2669094722917285525L, var1);
         C_473U var5 = recovery$indy$11(var3, 2667653365212882518L, var1);
         boolean var10000 = var5 instanceof C_47FQ;
         if (var4) {
            if (var10000) {
               break label20;
            }

            var10000 = var5 instanceof C_47xZ;
         }

         if (!var10000) {
            return;
         }
      }

      recovery$indy$12(this.field_49, 2667469635604365137L, var1);
   }



   public void method_40G$e45a9973e5(long var1) {
        augustus.recovered.modules.player.AutoEat_47QY var50;
        augustus.recovered.modules.player.AutoEat_47QY var53;
        augustus.recovered.modules.player.AutoEat_47QY var56;
        int var59;
        int var60;
      long var10001 = var1 ^ 19880739506046L;
      int var3 = (int)((var1 ^ 19880739506046L) >>> 32);
      int var4 = (int)((var1 ^ 19880739506046L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 118554311087803L;
      var10001 = var1 ^ 6407505185672L;
      int var8 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var9 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 106978727381589L;
      this.field_43y = this.field_42;
      int var10000 = ((int) (recovery$indy$flow$53(-3626593469822721743L, var1) ? 1 : 0));
      this.field_42 = -1;
      byte var16 = (byte)var10000;
      if (recovery$indy$flow$55(this, var6, -3628755515617980133L, var1)) {
         label523: {
            double var17 = -100.0;
            double var19 = -100.0;
            int var21 = -1;
            int var22 = -1;
            int var23 = 0;
            AutoEat_47QY var46;
            int var58;
            byte var10002;
            if (var23 < 9) {
               net.C_47rf var24 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, -3628557974494800288L, var1))
                  .field_429
                  .method_46$4c10532da1(var23 + 36)
                  .method_48$ac4db64966();
               var10000 = var16;
               if (var1 <= 0L) {
                  if (var1 < 0L) {
                     if (var16 != var16) {
                        int var30 = this.field_42;
                        byte var35 = 3;
                        AutoEat_47QY var40 = this;
                        recovery$indy$flow$76(var8, var40, var35, (char)var9, (char)var10, var30, -3627057857490840110L, var1);
                     }

                     return;
                  }

                  AutoEat_47QY var54;
                  byte var61;
                  if (var16 == 0) {
                     if (var16 == 0) {
                        this.field_42 = -1;
                     }

                     var54 = this;
                     var61 = var16;
                  } else {
                     if (var16 == -1) {
                        return;
                     }

                     var54 = this;
                     var61 = 3;
                  }

                  int var29 = this.field_42;
                  byte var34 = var61;
                  AutoEat_47QY var39 = var54;
                  recovery$indy$flow$76(var8, var39, var34, (char)var9, (char)var10, var29, -3627057857490840110L, var1);
                  return;
               }

               while (true) {
                  if (var10000 != 0) {
                     break label523;
                  }

                  if (var16 == 0) {
                     if (var24 != null) {
                        net.C_43r var47 = var24.method_48$dbd570a038();
                        if (var16 == 0) {
                           label420:
                           while (true) {
                              label403:
                              if (var47 instanceof C_43J) {
                                 C_43J var43 = (C_43J)var24.method_48$dbd570a038();
                                 double var44 = recovery$indy$flow$65(var24, var3, (short)var4, (short)var5, -3626680671249391833L, var1);
                                 var10000 = ((int) (var43.equals(net.C_42R.field_41I) ? 1 : 0));
                                 if (var16 == 0) {
                                    if (var10000 != 0) {
                                       if (!(var44 > var19)) {
                                          break label403;
                                       }

                                       var19 = var44;
                                       var22 = var23;
                                       if (var16 == 0) {
                                          break label403;
                                       }
                                    }

                                    double var62;
                                    var10000 = (var62 = var44 - var17) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
                                 }

                                 if (var16 == 0) {
                                    if (var10000 <= 0) {
                                       break label403;
                                    }

                                    var17 = var44;
                                    var10000 = var23;
                                 }

                                 var21 = var10000;
                              }

                              do {
                                 var23++;

                                 do {
                                    if (var16 != 0 || var23 >= 9) {
                                       label389: {
                                          label532: {
                                             var60 = var21;
                                             if (var16 == 0) {
                                                if (var21 != -1) {
                                                   break label532;
                                                }

                                                var60 = ((recovery$indy$flow$69(this.settingUseGapple, -3627997864796357480L, var1)) ? 1 : 0);
                                             }

                                             if (var16 != 0) {
                                                break label389;
                                             }

                                             if (var60 != 0) {
                                                var60 = var22;
                                                break label389;
                                             }
                                          }

                                          var60 = var21;
                                       }

                                       this.field_42 = var60;
                                       break label420;
                                    }

                                    var24 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, -3628557974494800288L, var1))
                                       .field_429
                                       .method_46$4c10532da1(var23 + 36)
                                       .method_48$ac4db64966();
                                    if (var16 != 0) {
                                       break label420;
                                    }
                                 } while (var16 != 0);
                              } while (var24 == null);

                              var47 = var24.method_48$dbd570a038();
                           }

                           label533: {
                              var10000 = ((int) (recovery$indy$flow$72(this.field_49, 250L, var11, -3626947255116926022L, var1) ? 1 : 0));
                              if (var16 == 0) {
                                 if (var10000 == 0) {
                                    this.field_42 = -1;
                                 }

                                 var53 = this;
                                 if (var16 != 0) {
                                    break label533;
                                 }

                                 var10000 = this.field_42;
                              }

                              if (var10000 == -1) {
                                 return;
                              }

                              var53 = this;
                           }

                           int var28 = this.field_42;
                           byte var33 = 3;
                           AutoEat_47QY var38 = var53;
                           recovery$indy$flow$76(var8, var38, var33, (char)var9, (char)var10, var28, -3627057857490840110L, var1);
                           return;
                        }

                        label470:
                        while (true) {
                           label536: {
                              C_43J var25 = (C_43J)var47;
                              double var26 = recovery$indy$flow$65(var24, var3, (short)var4, (short)var5, -3626680671249391833L, var1);
                              var10000 = ((int) (var25.equals(net.C_42R.field_41I) ? 1 : 0));
                              if (var16 == 0) {
                                 if (var10000 != 0) {
                                    double var63;
                                    var22 = (var63 = var26 - var19) == 0.0 ? 0 : (var63 < 0.0 ? -1 : 1);
                                    if (var16 == 0) {
                                       break label536;
                                    }
                                 }

                                 double var64;
                                 var10000 = (var64 = var26 - var17) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
                              }

                              if (var16 == 0) {
                                 if (var10000 <= 0) {
                                    break label536;
                                 }

                                 var17 = var26;
                                 var10000 = var23;
                              }

                              var21 = var10000;
                           }

                           do {
                              var23++;

                              do {
                                 if (var16 != 0 || var23 >= 9) {
                                    label443: {
                                       label538: {
                                          var59 = var21;
                                          if (var16 == 0) {
                                             if (var21 != -1) {
                                                break label538;
                                             }

                                             var59 = ((recovery$indy$flow$69(this.settingUseGapple, -3627997864796357480L, var1)) ? 1 : 0);
                                          }

                                          if (var16 != 0) {
                                             break label443;
                                          }

                                          if (var59 != 0) {
                                             var59 = var22;
                                             break label443;
                                          }
                                       }

                                       var59 = var21;
                                    }

                                    this.field_42 = var59;
                                    break label470;
                                 }

                                 var24 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, -3628557974494800288L, var1))
                                    .field_429
                                    .method_46$4c10532da1(var23 + 36)
                                    .method_48$ac4db64966();
                                 if (var16 != 0) {
                                    break label470;
                                 }
                              } while (var16 != 0);
                           } while (var24 == null);

                           var47 = var24.method_48$dbd570a038();
                        }

                        label539: {
                           var10000 = ((int) (recovery$indy$flow$72(this.field_49, 250L, var11, -3626947255116926022L, var1) ? 1 : 0));
                           if (var16 == 0) {
                              if (var10000 == 0) {
                                 this.field_42 = -1;
                              }

                              var50 = this;
                              if (var16 != 0) {
                                 break label539;
                              }

                              var10000 = this.field_42;
                           }

                           if (var10000 == -1) {
                              return;
                           }

                           var50 = this;
                        }

                        int var13 = this.field_42;
                        byte var14 = 3;
                        AutoEat_47QY var15 = var50;
                        recovery$indy$flow$76(var8, var15, var14, (char)var9, (char)var10, var13, -3627057857490840110L, var1);
                        return;
                     }

                     var23++;
                  }

                  if (var16 != 0 || var23 >= 9) {
                     var46 = this;
                     var58 = var21;
                     var10002 = var16;
                     break;
                  }

                  var24 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, -3628557974494800288L, var1))
                     .field_429
                     .method_46$4c10532da1(var23 + 36)
                     .method_48$ac4db64966();
                  var10000 = var16;
               }
            } else {
               var46 = this;
               var58 = var21;
               var10002 = var16;
               if (var1 <= 0L) {
                  byte var32 = var16;
                  int var37 = var21;
                  AutoEat_47QY var42 = this;
                  recovery$indy$flow$76(var8, var42, var37, (char)var9, (char)var10, var32, -3627057857490840110L, var1);
                  return;
               }
            }

            label504: {
               label541: {
                  if (var10002 == 0) {
                     if (var58 != -1) {
                        break label541;
                     }

                     var58 = ((int) (recovery$indy$flow$69(this.settingUseGapple, -3627997864796357480L, var1) ? 1 : 0));
                  }

                  if (var16 != 0) {
                     break label504;
                  }

                  if (var58 != 0) {
                     var58 = var22;
                     break label504;
                  }
               }

               var58 = var21;
            }

            var46.field_42 = var58;
         }

         label542: {
            var10000 = ((int) (recovery$indy$flow$72(this.field_49, 250L, var11, -3626947255116926022L, var1) ? 1 : 0));
            if (var16 == 0) {
               if (var10000 == 0) {
                  this.field_42 = -1;
               }

               var56 = this;
               if (var16 != 0) {
                  break label542;
               }

               var10000 = this.field_42;
            }

            if (var10000 == -1) {
               return;
            }

            var56 = this;
         }

         int var31 = this.field_42;
         byte var36 = 3;
         AutoEat_47QY var41 = var56;
         recovery$indy$flow$76(var8, var41, var36, (char)var9, (char)var10, var31, -3627057857490840110L, var1);
      }
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$20(this, 7, var3, -7099732305214153047L, var1);
      recovery$indy$21(this, 26, var3, -7099732305214153047L, var1);
      recovery$indy$22(this, 34, var3, -7099732305214153047L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$23(this.settingHunger, 2732055864883255030L, var4);
   }



    public AutoEat_47QY(long a0,byte a1) {
        super((java.lang.String) ("AutoEat"),(java.lang.String) ("AutomatischEssen"),(long) (((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 23482526031780L)),(java.awt.Color) (new java.awt.Color((int) (252),(int) (186),(int) (3))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = (((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a);
        int constructorPart2 = (int) ((((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 126545297597244L) >>> 32));
        int constructorPart3 = (int) (((((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 126545297597244L) << 32) >>> 48));
        int constructorPart4 = (int) (((((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 126545297597244L) << 48) >>> 48));
        long constructorKey5 = ((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 101232731010649L);
        long constructorKey6 = ((((a0 << 8) | (((long) (a1) << 56) >>> 56)) ^ augustus.recovered.modules.player.AutoEat_47QY.a) ^ 110500653925311L);
        net.C_47cu initialized7 = new net.C_47cu();
        recovery$indy$flow$84(this, initialized7);
        recovery$indy$flow$85(this, -1);
        recovery$indy$flow$86(this, -1);
        short converted8 = (short) (constructorPart3);
        short converted9 = (short) (constructorPart4);
        client.setting.RangeSetting initialized10 = new client.setting.RangeSetting(constructorPart2, this, "Hunger", Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4626322717216342016L), converted8, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted9);
        long initialValue11 = constructorKey5;
        client.setting.RangeSetting initialValue12 = initialized10;
        java.lang.Object initialValue13 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue14 = recovery$indy$flow$90(initialValue13, initialValue11);
        recovery$indy$flow$91(this, initialValue14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey6, "UseGapple", false);
        recovery$indy$flow$94(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey6, "NotWhileKillAura", false);
        recovery$indy$flow$97(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey6, "NotWhileScaffold", true);
        recovery$indy$flow$100(this, initialized17);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$53(long a0,long a1);
    private static native boolean recovery$indy$flow$55(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$57(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$65(java.lang.Object a0,int a1,short a2,short a3,long a4,long a5);
    private static native boolean recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$72(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$76(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5,long a6,long a7);
    private static native void recovery$indy$flow$84(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$85(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoEat_47QY) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$86(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoEat_47QY) (a0)).field_43y = a1;
        return;
    }

    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$91(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$94(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$97(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$100(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native int recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(long var0, long var2);
   private static native C_473U recovery$indy$11(Object var0, long var1, long var3);
   private static native void recovery$indy$12(Object var0, long var1, long var3);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$23(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$24();
}
