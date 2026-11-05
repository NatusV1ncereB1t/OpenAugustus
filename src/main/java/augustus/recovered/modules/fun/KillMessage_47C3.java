package augustus.recovered.modules.fun;
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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class KillMessage_47C3 extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final client.setting.ModeSetting settingSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingKillMessageMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingKillMessageCustom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

   private void method_42$db82fd5e78(String var1, long var2) {
      java.lang.String[] var14;
      java.lang.String[] var16;
      long var4;
      int var6;
      long var7;
      String[] var9;
      int var13;
      var2 = a ^ var2;
      var4 = (var2 ^ 133534585525143L) >>> 8;
      var6 = (int)((var2 ^ 133534585525143L) << 56 >>> 56);
      var7 = var2 ^ 122859712866965L;
      String var10 = recovery$indy$1(this.settingKillMessageMode, var7, 3416626818609544604L, var2);
      String[] var10000 = recovery$indy$2(3416816112772278365L, var2);
      byte var11 = -1;
      var9 = var10000;
      var13 = var10.hashCode();
      label313:
      if (var9 != null) {
         label316: {
            label310: {
               label317: {
                  label308: {
                     label318: {
                        label306: {
                           label319: {
                              label304: {
                                 label320: {
                                    label302: {
                                       label321: {
                                          label300: {
                                             label322: {
                                                switch (var13) {
                                                   case -2140892085:
                                                      break label320;
                                                   case -2067907591:
                                                      break label319;
                                                   case -1854418717:
                                                      break label318;
                                                   case 2272:
                                                      break label322;
                                                   case 67717986:
                                                      break label321;
                                                   case 1137666049:
                                                      var13 = (int) ((var10.equals(recovery$indy$3(18979, 8812590359327568084L ^ var2))) ? 1 : 0);
                                                      if (var9 == null) {
                                                         break label313;
                                                      }

                                                      if (var13 == 0) {
                                                         break label316;
                                                      }

                                                      var13 = 0;
                                                      if (var2 <= 0L) {
                                                         break;
                                                      }

                                                      var11 = 0;
                                                      if (var9 != null) {
                                                         break label316;
                                                      }
                                                   case 76:
                                                      var13 = (int) ((var10.equals("L")) ? 1 : 0);
                                                      break;
                                                   case 2029746065:
                                                      break label317;
                                                   default:
                                                      break label316;
                                                }

                                                if (var9 == null) {
                                                   break label313;
                                                }

                                                if (var13 == 0) {
                                                   break label316;
                                                }

                                                var13 = 1;
                                                if (var2 < 0L) {
                                                   break label300;
                                                }

                                                var11 = 1;
                                                if (var9 != null) {
                                                   break label316;
                                                }
                                             }

                                             var13 = (int) ((var10.equals(recovery$indy$4(13282, 4089880831854545159L ^ var2))) ? 1 : 0);
                                          }

                                          if (var9 == null) {
                                             break label313;
                                          }

                                          if (var13 == 0) {
                                             break label316;
                                          }

                                          var13 = 2;
                                          if (var2 <= 0L) {
                                             break label302;
                                          }

                                          var11 = 2;
                                          if (var9 != null) {
                                             break label316;
                                          }
                                       }

                                       var13 = (int) ((var10.equals(recovery$indy$5(590, 6637929204323661960L ^ var2))) ? 1 : 0);
                                    }

                                    if (var9 == null) {
                                       break label313;
                                    }

                                    if (var13 == 0) {
                                       break label316;
                                    }

                                    var13 = 3;
                                    if (var2 <= 0L) {
                                       break label304;
                                    }

                                    var11 = 3;
                                    if (var9 != null) {
                                       break label316;
                                    }
                                 }

                                 var13 = (int) ((var10.equals(recovery$indy$6(14374, 2159339814722405094L ^ var2))) ? 1 : 0);
                              }

                              if (var9 == null) {
                                 break label313;
                              }

                              if (var13 == 0) {
                                 break label316;
                              }

                              var13 = 4;
                              if (var2 < 0L) {
                                 break label306;
                              }

                              var11 = 4;
                              if (var9 != null) {
                                 break label316;
                              }
                           }

                           var13 = (int) ((var10.equals(recovery$indy$7(23480, 329801091153912128L ^ var2))) ? 1 : 0);
                        }

                        if (var9 == null) {
                           break label313;
                        }

                        if (var13 == 0) {
                           break label316;
                        }

                        var13 = 5;
                        if (var2 <= 0L) {
                           break label308;
                        }

                        var11 = 5;
                        if (var9 != null) {
                           break label316;
                        }
                     }

                     var13 = (int) ((var10.equals(recovery$indy$8(20523, 2958239436770929354L ^ var2))) ? 1 : 0);
                  }

                  if (var9 == null) {
                     break label313;
                  }

                  if (var13 == 0) {
                     break label316;
                  }

                  var13 = 6;
                  if (var2 < 0L) {
                     break label310;
                  }

                  var11 = 6;
                  if (var9 != null) {
                     break label316;
                  }
               }

               var13 = (int) ((var10.equals(recovery$indy$9(12114, 7360611738913183148L ^ var2))) ? 1 : 0);
            }

            if (var9 == null) {
               break label313;
            }

            if (var13 != 0) {
               var11 = 7;
            }
         }

         var13 = var11;
      }

      label324: {
         label221: {
            label220: {
               label325: {
                  label218: {
                     label326: {
                        label216: {
                           label327: {
                              label214: {
                                 label328: {
                                    switch (var13) {
                                       case 0:
                                          recovery$indy$10(field_43, 3416221539986099050L, var2)
                                             .method_49$a7421bf54c(
                                                var1
                                                   + recovery$indy$11(28867, 8255591154856380930L ^ var2)
                                                   + recovery$indy$13(
                                                      recovery$indy$12(3417041580442800980L, var2), var4, (byte)var6, 3416965349909829097L, var2
                                                   )
                                                   + recovery$indy$14(385, 1842183846930955133L ^ var2)
                                             );
                                          var14 = var9;
                                          if (var2 <= 0L) {
                                             break;
                                          }

                                          if (var9 != null) {
                                             return;
                                          }
                                       case 1:
                                          recovery$indy$15(field_43, 3416221539986099050L, var2)
                                             .method_49$a7421bf54c(recovery$indy$16(21965, 7492561505847799594L ^ var2) + var1);
                                          var14 = var9;
                                          break;
                                       case 2:
                                          break label328;
                                       case 3:
                                          break label327;
                                       case 4:
                                          break label326;
                                       case 5:
                                          break label325;
                                       case 6:
                                          break label221;
                                       case 7:
                                          break label324;
                                       default:
                                          return;
                                    }

                                    if (var2 < 0L) {
                                       break label214;
                                    }

                                    if (var14 != null) {
                                       return;
                                    }
                                 }

                                 recovery$indy$17(field_43, 3416221539986099050L, var2)
                                    .method_49$a7421bf54c(recovery$indy$18(13347, 7539584446940024513L ^ var2) + var1);
                                 var14 = var9;
                              }

                              if (var2 <= 0L) {
                                 break label216;
                              }

                              if (var14 != null) {
                                 return;
                              }
                           }

                           recovery$indy$19(field_43, 3416221539986099050L, var2)
                              .method_49$a7421bf54c(recovery$indy$20(30005, 3262324975219658696L ^ var2) + var1);
                           var14 = var9;
                        }

                        if (var2 <= 0L) {
                           break label218;
                        }

                        if (var14 != null) {
                           return;
                        }
                     }

                     recovery$indy$21(field_43, 3416221539986099050L, var2).method_49$a7421bf54c(recovery$indy$22(3405, 6770508792880904107L ^ var2) + var1);
                     var14 = var9;
                  }

                  if (var2 <= 0L) {
                     break label220;
                  }

                  if (var14 != null) {
                     return;
                  }
               }

               recovery$indy$23(field_43, 3416221539986099050L, var2).method_49$a7421bf54c(recovery$indy$24(15089, 8062122408186904583L ^ var2) + var1 + "?");
               var14 = var9;
            }

            if (var14 != null) {
               return;
            }
         }

         label182: {
            label181: {
               label329: {
                  label330: {
                     label331: {
                        KillMessage_47C3 var15 = this;
                        if (var9 != null) {
                           switch (this.field_42) {
                              case 1:
                                 recovery$indy$25(field_43, 3416221539986099050L, var2)
                                    .method_49$a7421bf54c(recovery$indy$26(29597, 8574436757440579952L ^ var2) + var1);
                                 var15 = this;
                                 break;
                              case 2:
                                 break label331;
                              case 3:
                                 break label330;
                              case 4:
                                 break label329;
                              default:
                                 break label181;
                           }
                        }

                        var15.field_42++;
                        var16 = var9;
                        if (var2 < 0L) {
                           break label182;
                        }

                        if (var9 != null) {
                           break label181;
                        }
                     }

                     recovery$indy$27(field_43, 3416221539986099050L, var2).method_49$a7421bf54c(recovery$indy$28(26351, 6092772701660306432L ^ var2) + var1);
                     this.field_42++;
                     var16 = var9;
                     if (var2 <= 0L) {
                        break label182;
                     }

                     if (var9 != null) {
                        break label181;
                     }
                  }

                  recovery$indy$29(field_43, 3416221539986099050L, var2).method_49$a7421bf54c(recovery$indy$30(466, 3757520413809261352L ^ var2) + var1);
                  this.field_42++;
                  var16 = var9;
                  if (var2 < 0L) {
                     break label182;
                  }

                  if (var9 != null) {
                     break label181;
                  }
               }

               recovery$indy$31(field_43, 3416221539986099050L, var2).method_49$a7421bf54c(recovery$indy$32(5653, 6314274888115170540L ^ var2) + var1);
               this.field_42 = 1;
            }

            var16 = var9;
         }

         if (var16 != null) {
            return;
         }
      }

      recovery$indy$33(field_43, 3416221539986099050L, var2)
         .method_49$a7421bf54c(recovery$indy$34(this.settingKillMessageCustom, var7, 3416626818609544604L, var2) + " " + var1);
   }







    private static native java.lang.reflect.Method d(long a0,long a1);

   private static boolean method_48$aae029aa0a() {
      return false;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 40846118478071L;
      String[] var6 = recovery$indy$35(2668579305972589119L, var1);
      C_473U var7 = recovery$indy$36(var3, 2669364485893501900L, var1);
      if (var7 instanceof C_47AL) {
         Minecraft var10000 = field_43;
         if (var6 != null) {
            if (recovery$indy$37(field_43, 2669106256777822472L, var1) == null) {
               return;
            }

            var10000 = field_43;
         }

         if (recovery$indy$38(var10000, 2669001638840480472L, var1) != null) {
            C_47AL var8 = (C_47AL)var7;
            String var9 = var8.method_45$8b128fd962().method_48$0e30dfc966();
            String var10 = recovery$indy$39(field_43, 2669106256777822472L, var1).method_41$0e30dfc966();
            String var19 = var9;
            String var10001 = var10;
            if (var6 != null) {
               if (!var9.contains(var10)) {
                  return;
               }

               var19 = var9;
               var10001 = " ";
            }

            String[] var11 = var19.split(var10001);
            Iterator var12 = recovery$indy$40(field_43, 2669001638840480472L, var1).field_44Q.iterator();

            label150:
            while (true) {
               boolean var20 = var12.hasNext();

               label148:
               while (var20) {
                  Entity var13 = (Entity)var12.next();
                  String var14 = var13.method_41$0e30dfc966();
                  var20 = var13 instanceof EntityPlayerSP;
                  String[] var24 = var6;

                  label146:
                  while (true) {
                     if (var24 != null) {
                        if (var20) {
                           continue label150;
                        }

                        var20 = var9.contains(var14);
                     }

                     if (!var20) {
                        continue label150;
                     }

                     String[] var15 = var11;
                     int var16 = var15.length;
                     int var17 = 0;

                     label144:
                     while (true) {
                        String[] var21;
                        if (var17 < var16) {
                           var21 = var15;
                        } else {
                           this.field_40.put(var14, (long)(System.currentTimeMillis() + recovery$indy$43(this.settingDelay, 2667517051969283151L, var1)));
                           var21 = var6;
                           if (var1 > 0L) {
                              if (var6 == null) {
                                 return;
                              }
                              continue label150;
                           }
                        }

                        do {
                           String var18 = var21[var17];
                           var20 = recovery$indy$41(this.settingSequence, var4, 2668384320953022462L, var1)
                              .equals(recovery$indy$42(26077, 3262527455979328852L ^ var1));
                           if (var6 == null) {
                              continue label148;
                           }

                           var24 = var6;
                           if (var1 < 0L) {
                              continue label146;
                           }

                           if (var1 > 0L) {
                              if (var6 != null) {
                                 if (var20) {
                                    boolean var22 = var18.contains(var10);
                                    if (var6 != null) {
                                       if (!var22) {
                                          if (var18.contains(var14)) {
                                             return;
                                          }

                                          var17++;
                                          if (var6 != null) {
                                             continue label144;
                                          }
                                       }
                                    } else {
                                       if (var22) {
                                          return;
                                       }

                                       var17++;
                                       if (var6 != null) {
                                          continue label144;
                                       }
                                    }
                                 } else {
                                    boolean var23 = var18.contains(var10);
                                    if (var6 != null) {
                                       if (var23) {
                                          return;
                                       }

                                       var23 = var18.contains(var14);
                                    }

                                    if (!var23) {
                                       var17++;
                                       if (var6 != null) {
                                          continue label144;
                                       }
                                    }
                                 }
                              } else {
                                 if (var6 != null) {
                                    if (var20) {
                                       return;
                                    }

                                    var20 = var18.contains(var14);
                                 }

                                 if (!var20) {
                                    var17++;
                                    if (var6 != null) {
                                       continue label144;
                                    }
                                 }
                              }
                           } else {
                              if (var6 != null) {
                                 if (var20) {
                                    return;
                                 }

                                 var20 = var18.contains(var14);
                              }

                              if (!var20) {
                                 var17++;
                                 if (var6 != null) {
                                    continue label144;
                                 }
                              }
                           }

                           this.field_40.put(var14, (long)(System.currentTimeMillis() + recovery$indy$43(this.settingDelay, 2667517051969283151L, var1)));
                           var21 = var6;
                        } while (var1 <= 0L);

                        if (var6 == null) {
                           return;
                        }
                        continue label150;
                     }
                  }
               }

               return;
            }
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$44(this, 26, var3, -7099304555111030635L, var1);
      recovery$indy$45(this, 40, var3, -7099304555111030635L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_40.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public void method_487$da8c82d5d4() {
        String string;
        long l;
        block6: {
            long l2;
            long l3 = l2 = a ^ 0x3DA3B141AFE5L;
            long l4 = l3 ^ 0x1A10536743A2L;
            l = l3 ^ 0x46AD19998084L;
            String[] stringArray = MLG_47CP.method_46$44c5829186();
            KillMessage_47C3 killMessage_47C3 = this;
            if (stringArray == null) {
                Iterator iterator = killMessage_47C3.field_40.keySet().iterator();
                if (!iterator.hasNext()) return;
                String string2 = (String)iterator.next();
                if ((Long)this.field_40.get(string2) == System.currentTimeMillis()) return;
                long l5 = l;
                String string3 = string2;
                KillMessage_47C3 killMessage_47C32 = this;
                killMessage_47C32.method_42$db82fd5e78(string3, l5);
                C_47cu c_47cu = this.field_44;
                c_47cu.method_46$da8c82d5d4();
                return;
            }
            BooleanSetting c_47TV = killMessage_47C3.settingInInv;
            if (c_47TV.method_49$aae029aa0a()) {
                Minecraft c_47nT = field_43;
                if (c_47nT.field_44m == null) {
                } else {
                    return;
                }
            }
            Iterator iterator = this.field_40.keySet().iterator();
            while (iterator.hasNext()) {
                string = (String)iterator.next();
                if ((Long)this.field_40.get(string) <= System.currentTimeMillis()) continue;
                RangeSetting c_47Ts = this.settingDelay;
                long l6 = l4;
                C_47cu c_47cu = this.field_44;
                long l7 = c_47Ts.method_44$8abf5c6871();
                if (!c_47cu.method_42$b0e346e6e3(l7, l6)) {
                    continue;
                }
                break block6;
            }
            return;
        }
        long l8 = l;
        String string4 = string;
        KillMessage_47C3 killMessage_47C3 = this;
        killMessage_47C3.method_42$db82fd5e78(string4, l8);
        C_47cu c_47cu = this.field_44;
        c_47cu.method_46$da8c82d5d4();
    }




    public KillMessage_47C3(long a0) {
        super((java.lang.String) ("KillMessage"),(java.lang.String) ("T\u00f6tungsnachricht"),(long) (((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 57526262534946L)),(java.awt.Color) (new java.awt.Color((int) (46),(int) (77),(int) (66))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 90284715945914L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 90284715945914L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 90284715945914L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 140625569211375L);
        long constructorKey7 = ((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 137544299084511L);
        long constructorKey8 = ((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 76370488545081L);
        long constructorKey9 = ((augustus.recovered.modules.fun.KillMessage_47C3.a ^ a0) ^ 75318982727266L);
        java.lang.Object initialValue10 = recovery$indy$flow$210(3);
        ((java.lang.Object[]) initialValue10)[0] = "Irrelevant";
        ((java.lang.Object[]) initialValue10)[1] = "YourFirst";
        ((java.lang.Object[]) initialValue10)[2] = "OpponentFirst";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "Sequence", constructorKey6, "YourFirst", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$212(this, initialized11);
        java.lang.Object initialValue12 = recovery$indy$flow$214(8);
        ((java.lang.Object[]) initialValue12)[0] = "Augustus";
        ((java.lang.Object[]) initialValue12)[1] = "L";
        ((java.lang.Object[]) initialValue12)[2] = "GG";
        ((java.lang.Object[]) initialValue12)[3] = "GG AC";
        ((java.lang.Object[]) initialValue12)[4] = "Hahaha";
        ((java.lang.Object[]) initialValue12)[5] = "Spectate";
        ((java.lang.Object[]) initialValue12)[6] = "Random";
        ((java.lang.Object[]) initialValue12)[7] = "Custom";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "KillMessageMode", constructorKey6, "Augustus", (java.lang.String[]) (initialValue12));
        recovery$indy$flow$216(this, initialized13);
        short converted14 = (short) (constructorPart4);
        short converted15 = (short) (constructorPart5);
        client.setting.RangeSetting initialized16 = new client.setting.RangeSetting(constructorPart3, this, "Delay", Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4656510908468559872L), converted14, 0.0D, Double.longBitsToDouble(4661014508095930368L), 0, converted15);
        long initialValue17 = constructorKey7;
        client.setting.RangeSetting initialValue18 = initialized16;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = recovery$indy$flow$220(initialValue19, initialValue17);
        recovery$indy$flow$221(this, initialValue20);
        java.lang.Object initialValue21 = recovery$indy$flow$222();
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey8, "InInv", false);
        recovery$indy$flow$225(this, initialized22);
        java.lang.Object initialValue23 = initialValue21;
        java.lang.StringBuilder initialized24 = new java.lang.StringBuilder();
        java.lang.Object initialValue25 = recovery$indy$flow$229(initialized24, "killed by Augustus");
        java.lang.Object initialValue26 = recovery$indy$flow$230();
        long initialValue27 = constructorKey9;
        java.lang.Object initialValue28 = initialValue26;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = recovery$indy$flow$232(initialValue29, initialValue27);
        java.lang.Object initialValue31 = recovery$indy$flow$233(initialValue25, initialValue30);
        java.lang.Object initialValue32 = recovery$indy$flow$234(initialValue31, "!");
        java.lang.Object initialValue33 = recovery$indy$flow$235(initialValue32);
        java.lang.Object initialValue34 = recovery$indy$flow$236(0);
        client.setting.ModeSetting initialized35 = new client.setting.ModeSetting(this, "KillMessageCustom", constructorKey6, (java.lang.String) (initialValue33), (java.lang.String[]) (initialValue34));
        java.lang.Object initialValue36 = recovery$indy$flow$238();
        java.lang.Object initialValue37 = initialValue36;
        client.setting.ModeSetting initialValue38 = initialized35;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue41 = recovery$indy$flow$241(initialValue39, initialValue40);
        recovery$indy$flow$242(this, initialValue41);
        recovery$indy$flow$243(this, 1);
        java.util.HashMap initialized42 = new java.util.HashMap();
        recovery$indy$flow$246(this, initialized42);
        net.C_47cu initialized43 = new net.C_47cu();
        recovery$indy$flow$249(this, initialized43);
        if (initialValue23 != null) {
            return;
        } else {
            java.lang.Object initialValue44 = recovery$indy$flow$250(3);
            java.lang.Object initialValue45 = initialValue44;
            java.lang.Object initialValue46 = recovery$indy$flow$251(initialValue45);
            recovery$indy$flow$252(initialValue46);
            return;
        }
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$210(int a0);
    private static native void recovery$indy$flow$212(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$214(int a0);
    private static native void recovery$indy$flow$216(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$221(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$222();
    private static native void recovery$indy$flow$225(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$229(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$230();

    private static native java.lang.Object recovery$indy$flow$232(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$233(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$235(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$236(int a0);
    private static native java.lang.Object recovery$indy$flow$238();


    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$243(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.KillMessage_47C3) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$250(int a0);
    private static java.lang.Object recovery$indy$flow$251(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$252(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(Object var0, long var1, long var3, long var5);
   private static native String[] recovery$indy$2(long var0, long var2);
   private static native String recovery$indy$3(int var0, long var1);
   private static native String recovery$indy$4(int var0, long var1);
   private static native String recovery$indy$5(int var0, long var1);
   private static native String recovery$indy$6(int var0, long var1);
   private static native String recovery$indy$7(int var0, long var1);
   private static native String recovery$indy$8(int var0, long var1);
   private static native String recovery$indy$9(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native String recovery$indy$11(int var0, long var1);
   private static native Client recovery$indy$12(long var0, long var2);
   private static native String recovery$indy$13(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$14(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native String recovery$indy$16(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native String recovery$indy$18(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native String recovery$indy$20(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native String recovery$indy$22(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native String recovery$indy$24(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native String recovery$indy$26(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native String recovery$indy$28(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native String recovery$indy$30(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native String recovery$indy$32(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native String recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native String[] recovery$indy$35(long var0, long var2);
   private static native C_473U recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$38(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$39(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$40(Object var0, long var1, long var3);
   private static native String recovery$indy$41(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$42(int var0, long var1);
   private static native double recovery$indy$43(Object var0, long var1, long var3);
   private static native void recovery$indy$44(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$47();
}
