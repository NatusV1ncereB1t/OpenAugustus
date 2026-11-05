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
import net.C_46j;
import net.C_472n;
import net.C_473U;
import net.C_475P;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_479E;
import net.C_479J;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import client.module.Module;
import net.C_47Rz;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.C_47ob;
import net.C_47oo;
import client.module.Category;
import net.C_47xZ;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Teleport_47Qx extends client.module.Module implements net.C_47Vc,net.C_47iC,net.C_47mz,net.C_47Rz,net.C_47hi {
    public client.setting.ModeSetting settingMode; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting settingAutoDisable; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private double[] field_41; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 17925729311181L;
      long var6 = var1 ^ 19942097427407L;
      byte var8 = (byte) ((recovery$indy$1(-7191641784658353878L, var1)) ? 1 : 0);
      C_473U var9 = recovery$indy$2(var3, -7188240939531265733L, var1);
      boolean var10000 = recovery$indy$3(this.settingMode, var4, -7191129099217278545L, var1).equals(recovery$indy$4(1826, 5188461548114270534L ^ var1));
      if (var8 != 0) {
         if (!var10000) {
            return;
         }

         var10000 = var9 instanceof C_479E;
      }

      if (var8 != 0) {
         if (!var10000) {
            return;
         }

         var10000 = this.field_48;
      }

      if (var10000) {
         C_479E var10 = (C_479E)var9;
         var10.method_44$2c20cf5948(this.field_41[0]);
         var10.method_45$2c20cf5948(this.field_41[1]);
         var10.method_42$2c20cf5948(this.field_41[2]);
         recovery$indy$5(field_43, -7191797241915056744L, var1).method_46$a59262c0f0(this.field_41[0], this.field_41[1], this.field_41[2]);
         recovery$indy$6(field_43, -7191797241915056744L, var1).field_48M = true;
         Teleport_47Qx var11 = this;
         byte var10001 = var8;
         if (var1 >= 0L) {
            if (var8 != 0) {
               if (!recovery$indy$7(this.field_40, 1000L, var6, -7191261810289900423L, var1)) {
                  return;
               }

               this.field_48 = false;
               this.field_44 = true;
               var11 = this;
            }

            var10001 = 3;
         }

         double[] var12 = new double[var10001];
         var12[0] = Double.POSITIVE_INFINITY;
         var12[1] = Double.POSITIVE_INFINITY;
         var12[2] = Double.POSITIVE_INFINITY;
         var11.field_41 = var12;
      }
   }




   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4 = var2 ^ 138480231952404L;
      long var6 = var2 ^ 27738005618893L;
      boolean var8 = recovery$indy$8(8496668104321931975L, var2);
      boolean var10000 = recovery$indy$9(this.settingMode, var4, 8496770295521017974L, var2).equals(recovery$indy$10(17287, 5179202559360889908L ^ var2));
      if (!var8) {
         if (!var10000) {
            return;
         }

         var10000 = this.field_43P;
      }

      if (var10000) {
         recovery$indy$11(var1, var6, true, 8496558053791293302L, var2);
      }
   }



   public void method_40$6f6970ed3f(long var1, C_46j var3) {
      net.C_478Q var14;
      net.C_478Q var16;
      long var6;
      byte var8;
      int var13;
      int var10001;
      label206: {
         long var4 = var1 ^ 137287473161387L;
         var6 = var1 ^ 139303808771753L;
         String var9 = recovery$indy$12(this.settingMode, var4, 2401991719739872457L, var1);
         byte var10000 = (byte) ((recovery$indy$13(2401627477014125644L, var1)) ? 1 : 0);
         byte var10 = -1;
         var8 = var10000;
         var13 = var9.hashCode();
         label205:
         if (var8 != 0) {
            label209: {
               switch (var13) {
                  case -1721492669:
                     var13 = (int) ((var9.equals(recovery$indy$14(9626, 3780481345951778460L ^ var1))) ? 1 : 0);
                     if (var8 == 0) {
                        break label205;
                     }

                     if (var13 == 0) {
                        break label209;
                     }

                     var10 = 0;
                     var13 = var8;
                     if (var1 < 0L) {
                        break;
                     }

                     if (var8 != 0) {
                        break label209;
                     }
                  case 1216457565:
                     var13 = (int) ((var9.equals(recovery$indy$15(5083, 185127474471989468L ^ var1))) ? 1 : 0);
                     break;
                  default:
                     break label209;
               }

               var10001 = var8;
               if (var1 < 0L) {
                  break label206;
               }

               if (var8 == 0) {
                  break label205;
               }

               if (var13 != 0) {
                  var10 = 1;
               }
            }

            var13 = var10;
         }

         var10001 = var8;
      }

      label183: {
         label212: {
            if (var1 > 0L) {
               if (var10001 != 0) {
                  switch (var13) {
                     case 0:
                        var13 = (int) ((recovery$indy$16(this.field_49, 1500L, var6, 2402087578795587871L, var1)) ? 1 : 0);
                        break;
                     case 1:
                        break label212;
                     default:
                        return;
                  }
               }

               var10001 = var8;
            }

            if (var1 >= 0L) {
               if (var10001 != 0) {
                  if (var13 != 0) {
                     return;
                  }

                  var13 = (int) ((recovery$indy$17(var3, 2402500397062531769L, var1) instanceof C_475P) ? 1 : 0);
               }

               var10001 = var8;
            }

            label213: {
               if (var1 > 0L) {
                  if (var10001 != 0) {
                     if (var13 == 0) {
                        return;
                     }

                     var14 = recovery$indy$18(var3, 2402277231301314540L, var1);
                     if (var8 == 0) {
                        break label213;
                     }

                     var13 = var14.method_43$8abf5c6871();
                  }

                  var10001 = this.field_42;
               }

               if (var13 >= var10001) {
                  return;
               }

               var14 = recovery$indy$19(var3, 2402277231301314540L, var1);
            }

            C_478Q var11 = var14;
            recovery$indy$20(
               var3,
               new C_478i(
                  var11.method_40$8abf5c6871(),
                  var11.method_43$8abf5c6871(),
                  var11.method_47$8abf5c6871(),
                  var11.method_40$8abf5c6871() + 1,
                  var11.method_43$8abf5c6871() + 1,
                  var11.method_47$8abf5c6871() + 1
               ),
               2402994457020156050L,
               var1
            );
            var13 = var8;
            if (var1 <= 0L) {
               break label183;
            }

            if (var8 != 0) {
               return;
            }
         }

         var13 = (int) ((this.field_43v) ? 1 : 0);
      }

      label150: {
         label149: {
            label215: {
               label147: {
                  label146:
                  if (var8 != 0) {
                     if (var13 != 0) {
                        var13 = (int) ((this.field_43u) ? 1 : 0);
                        var10001 = var8;
                        if (var1 < 0L) {
                           break label147;
                        }

                        if (var8 == 0) {
                           break label146;
                        }

                        if (!this.field_43u) {
                           var13 = this.field_43y;
                           byte var18 = var8;
                           if (var1 > 0L) {
                              if (var8 == 0) {
                                 break label149;
                              }

                              var18 = 1;
                           }

                           if (this.field_43y < var18) {
                              break label215;
                           }
                        }
                     }

                     var13 = (int) ((this.field_43a) ? 1 : 0);
                  }

                  var10001 = var8;
               }

               if (var1 < 0L) {
                  break label150;
               }

               if (var10001 == 0) {
                  break label149;
               }

               if (var13 == 0) {
                  return;
               }
            }

            var13 = (int) ((recovery$indy$21(var3, 2402500397062531769L, var1) instanceof C_475P) ? 1 : 0);
         }

         var10001 = var8;
      }

      label217: {
         if (var1 >= 0L) {
            if (var10001 != 0) {
               if (var13 == 0) {
                  return;
               }

               var16 = recovery$indy$22(var3, 2402277231301314540L, var1);
               if (var8 == 0) {
                  break label217;
               }

               var13 = var16.method_43$8abf5c6871();
            }

            var10001 = this.field_42;
         }

         if (var13 >= var10001) {
            return;
         }

         var16 = recovery$indy$23(var3, 2402277231301314540L, var1);
      }

      C_478Q var12 = var16;
      recovery$indy$24(
         var3,
         new C_478i(
            var12.method_40$8abf5c6871(),
            var12.method_43$8abf5c6871(),
            var12.method_47$8abf5c6871(),
            var12.method_40$8abf5c6871() + 1,
            var12.method_43$8abf5c6871() + 1,
            var12.method_47$8abf5c6871() + 1
         ),
         2402994457020156050L,
         var1
      );
   }





   public void method_47$9035875d26(long var1, net.C_47ob var3) {
        augustus.recovered.modules.player.Teleport_47Qx var101;
        augustus.recovered.modules.player.Teleport_47Qx var107;
        augustus.recovered.modules.player.Teleport_47Qx var31;
        augustus.recovered.modules.player.Teleport_47Qx var35;
        augustus.recovered.modules.player.Teleport_47Qx var39;
        augustus.recovered.modules.player.Teleport_47Qx var49;
        augustus.recovered.modules.player.Teleport_47Qx var52;
        augustus.recovered.modules.player.Teleport_47Qx var58;
        augustus.recovered.modules.player.Teleport_47Qx var72;
        augustus.recovered.modules.player.Teleport_47Qx var76;
        augustus.recovered.modules.player.Teleport_47Qx var79;
        int var80;
        int var88;
        augustus.recovered.modules.player.Teleport_47Qx var90;
        augustus.recovered.modules.player.Teleport_47Qx var94;
        augustus.recovered.modules.player.Teleport_47Qx var98;
      long var4 = var1 ^ 40846118478071L;
      net.C_473U var7 = (net.C_473U)recovery$indy$flow$80(var3, 2667267431466672129L, var1);
      int var10000 = ((int) (recovery$indy$flow$81(2668772332480842276L, var1) ? 1 : 0));
      String var8 = (String)recovery$indy$flow$83(this.settingMode, var4, 2668892148009947285L, var1);
      byte var6 = (byte)var10000;
      byte var9 = -1;
      var10000 = var8.hashCode();
      if (var6 == 0) {
         switch (var10000) {
            case -680497142:
               int var121;
               label2931: {
                  C_47xZ var22;
                  label2932: {
                     if (var8.equals((String)recovery$indy$flow$85(598, 2504347868271863042L ^ var1))) {
                        var9 = 0;
                        var80 = var6;
                        if (var1 > 0L) {
                           label2462: {
                              if (var6 != 0) {
                                 var88 = ((var8.equals((String)recovery$indy$flow$87(1737, 8444446367813591446L ^ var1))) ? 1 : 0);
                                 if (var6 != 0) {
                                    break label2462;
                                 }

                                 if (var88 != 0) {
                                    var9 = 1;
                                 }
                              }

                              var88 = var9;
                           }

                           if (var6 == 0) {
                              switch (var88) {
                                 case 0:
                                    int var91 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                    if (var6 == 0) {
                                       if (!(var91 != 0)) {
                                          return;
                                       }

                                       var91 = ((int) (this.field_48 ? 1 : 0));
                                    }

                                    if ((var91) != 0) {
                                       label2802: {
                                          var22 = (C_47xZ)var7;
                                          double var141;
                                          var91 = (var141 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var141 < 0.0 ? -1 : 1);
                                          if (var6 == 0) {
                                             if ((var91) != 0) {
                                                break label2802;
                                             }

                                             double var142;
                                             var91 = (var142 = var22.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var142 < 0.0 ? -1 : 1);
                                          }

                                          if (var6 == 0) {
                                             if ((var91) != 0) {
                                                break label2802;
                                             }

                                             double var143;
                                             var91 = (var143 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var143 < 0.0 ? -1 : 1);
                                          }

                                          if (!(var91 != 0)) {
                                             this.field_48 = false;
                                             this.field_44 = true;
                                             this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                          }
                                       }

                                       if (var6 != 0) {
                                          var91 = ((int) (this.field_43v ? 1 : 0));
                                          if (var6 == 0) {
                                             if (!this.field_43v) {
                                                return;
                                             }

                                             var91 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                          }

                                          if (var6 == 0) {
                                             if (var91 == 0) {
                                                return;
                                             }

                                             var3.cancel();
                                             var91 = this.field_43y;
                                          }

                                          label2324: {
                                             if (var91 > 1) {
                                                var94 = this;
                                                if (var6 != 0) {
                                                   break label2324;
                                                }

                                                if (!this.field_43u) {
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                                      .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                                   this.field_43u = true;
                                                   this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                                   this.field_43y = 0;
                                                   recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                                }
                                             }

                                             var94 = this;
                                          }

                                          var94.field_43y++;
                                          return;
                                       }
                                    }

                                    return;
                                 case 1:
                                    var10000 = ((int) (this.field_43v ? 1 : 0));
                                    if (var6 == 0) {
                                       if (!this.field_43v) {
                                          return;
                                       }

                                       var10000 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                    }

                                    if (var6 == 0) {
                                       if (var10000 == 0) {
                                          return;
                                       }

                                       var3.cancel();
                                       var10000 = this.field_43y;
                                    }

                                    label2308: {
                                       if (var10000 > 1) {
                                          var90 = this;
                                          if (var6 != 0) {
                                             break label2308;
                                          }

                                          if (!this.field_43u) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                                .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                             this.field_43u = true;
                                             this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                             this.field_43y = 0;
                                             recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                          }
                                       }

                                       var90 = this;
                                    }

                                    var90.field_43y++;
                                    return;
                                 default:
                                    return;
                              }
                           }

                           if (var6 == 0) {
                              if (var88 == 0) {
                                 return;
                              }

                              var88 = ((this.field_48) ? 1 : 0);
                           }

                           if (var88 == 0) {
                              return;
                           }

                           var22 = (C_47xZ)var7;
                           double var144;
                           var10000 = (var144 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var144 < 0.0 ? -1 : 1);
                           var121 = var6;
                           break label2932;
                        }

                        var121 = var6;
                        if (var1 < 0L) {
                           break label2931;
                        }

                        if (var6 == 0) {
                           switch (var6) {
                              case 0:
                                 int var84 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                 if (var6 == 0) {
                                    if (!(var84 != 0)) {
                                       return;
                                    }

                                    var84 = ((int) (this.field_48 ? 1 : 0));
                                 }

                                 if ((var84) != 0) {
                                    label2396: {
                                       var22 = (C_47xZ)var7;
                                       double var145;
                                       var84 = (var145 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var145 < 0.0 ? -1 : 1);
                                       if (var6 == 0) {
                                          if ((var84) != 0) {
                                             break label2396;
                                          }

                                          double var146;
                                          var84 = (var146 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var146 < 0.0 ? -1 : 1);
                                       }

                                       if (!(var84 != 0)) {
                                          this.field_48 = false;
                                          this.field_44 = true;
                                          this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                       }
                                    }

                                    var84 = var6;
                                    if (var6 == 0) {
                                       if (var6 == 0) {
                                          return;
                                       }

                                       var3.cancel();
                                       var84 = this.field_43y;
                                    }

                                    Teleport_47Qx var87;
                                    if (var84 > 1) {
                                       var87 = this;
                                       var121 = var6;
                                    } else {
                                       var87 = this;
                                       var121 = this.field_43y + 1;
                                    }

                                    var87.field_43y = var121;
                                 }

                                 return;
                              case 1:
                                 var10000 = ((int) (this.field_43v ? 1 : 0));
                                 if (var6 == 0) {
                                    if (!this.field_43v) {
                                       return;
                                    }

                                    var3.cancel();
                                    var10000 = this.field_43y;
                                 }

                                 Teleport_47Qx var83;
                                 if (var10000 > 1) {
                                    var83 = this;
                                    var121 = var6;
                                 } else {
                                    var83 = this;
                                    var121 = this.field_43y + 1;
                                 }

                                 var83.field_43y = var121;
                                 return;
                              default:
                                 return;
                           }
                        }

                        if (var6 == 0) {
                           if (var6 == 0) {
                              return;
                           }

                           var80 = ((this.field_48) ? 1 : 0);
                        }

                        if (var80 == 0) {
                           return;
                        }

                        var22 = (C_47xZ)var7;
                        double var147;
                        var10000 = (var147 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var147 < 0.0 ? -1 : 1);
                        var121 = var6;
                     } else {
                        var80 = var9;
                        var121 = var6;
                        if (var1 < 0L) {
                           break label2931;
                        }

                        if (var6 == 0) {
                           switch (var9) {
                              case 0:
                                 int var102 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                 if (var6 == 0) {
                                    if (!(var102 != 0)) {
                                       return;
                                    }

                                    var102 = ((int) (this.field_48 ? 1 : 0));
                                 }

                                 if ((var102) != 0) {
                                    var22 = (C_47xZ)var7;
                                    double var148;
                                    var102 = (var148 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var148 < 0.0 ? -1 : 1);
                                    if (var1 > 0L) {
                                       label2813: {
                                          if (var6 == 0) {
                                             if ((var102) != 0) {
                                                break label2813;
                                             }

                                             double var149;
                                             var102 = (var149 = var22.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var149 < 0.0 ? -1 : 1);
                                          }

                                          if (var6 == 0) {
                                             if ((var102) != 0) {
                                                break label2813;
                                             }

                                             double var150;
                                             var102 = (var150 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var150 < 0.0 ? -1 : 1);
                                          }

                                          if (!(var102 != 0)) {
                                             this.field_48 = false;
                                             this.field_44 = true;
                                             this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                          }
                                       }

                                       if (var6 != 0) {
                                          var102 = ((int) (this.field_43v ? 1 : 0));
                                          if (var6 == 0) {
                                             if (!this.field_43v) {
                                                return;
                                             }

                                             var102 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                          }

                                          if (var6 == 0) {
                                             if (var102 == 0) {
                                                return;
                                             }

                                             var3.cancel();
                                             var102 = this.field_43y;
                                          }

                                          label2256: {
                                             if (var102 > 1) {
                                                var107 = this;
                                                if (var6 != 0) {
                                                   break label2256;
                                                }

                                                if (!this.field_43u) {
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                                      .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                                   this.field_43u = true;
                                                   this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                                   this.field_43y = 0;
                                                   recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                                }
                                             }

                                             var107 = this;
                                          }

                                          var107.field_43y++;
                                       }

                                       return;
                                    }

                                    label2292: {
                                       if (var6 == 0) {
                                          if ((var102) != 0) {
                                             break label2292;
                                          }

                                          double var151;
                                          var102 = (var151 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var151 < 0.0 ? -1 : 1);
                                       }

                                       if (!(var102 != 0)) {
                                          this.field_48 = false;
                                          this.field_44 = true;
                                          this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                       }
                                    }

                                    var102 = var6;
                                    if (var6 == 0) {
                                       if (var6 == 0) {
                                          return;
                                       }

                                       var3.cancel();
                                       var102 = this.field_43y;
                                    }

                                    Teleport_47Qx var105;
                                    if (var102 > 1) {
                                       var105 = this;
                                       var121 = var6;
                                    } else {
                                       var105 = this;
                                       var121 = this.field_43y + 1;
                                    }

                                    var105.field_43y = var121;
                                    return;
                                 }

                                 return;
                              case 1:
                                 var10000 = ((int) (this.field_43v ? 1 : 0));
                                 if (var1 > 0L) {
                                    if (var6 == 0) {
                                       if (!this.field_43v) {
                                          return;
                                       }

                                       var10000 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                    }

                                    if (var6 == 0) {
                                       if (var10000 == 0) {
                                          return;
                                       }

                                       var3.cancel();
                                       var10000 = this.field_43y;
                                    }

                                    label2229: {
                                       if (var10000 > 1) {
                                          var101 = this;
                                          if (var6 != 0) {
                                             break label2229;
                                          }

                                          if (!this.field_43u) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                                .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                             this.field_43u = true;
                                             this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                             this.field_43y = 0;
                                             recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                          }
                                       }

                                       var101 = this;
                                    }

                                    var101.field_43y++;
                                    return;
                                 }

                                 if (var6 == 0) {
                                    if (!this.field_43v) {
                                       return;
                                    }

                                    var3.cancel();
                                    var10000 = this.field_43y;
                                 }

                                 Teleport_47Qx var100;
                                 if (var10000 > 1) {
                                    var100 = this;
                                    var121 = var6;
                                 } else {
                                    var100 = this;
                                    var121 = this.field_43y + 1;
                                 }

                                 var100.field_43y = var121;
                                 return;
                              default:
                                 return;
                           }
                        }

                        if (var6 == 0) {
                           if (var9 == 0) {
                              return;
                           }

                           var80 = ((this.field_48) ? 1 : 0);
                        }

                        if (var80 == 0) {
                           return;
                        }

                        var22 = (C_47xZ)var7;
                        double var152;
                        var10000 = (var152 = var22.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var152 < 0.0 ? -1 : 1);
                        var121 = var6;
                        if (var1 > 0L) {
                           break label2932;
                        }
                     }

                     label2415: {
                        if (var121 == 0) {
                           if ((var10000) != 0) {
                              break label2415;
                           }

                           double var153;
                           var10000 = (var153 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var153 < 0.0 ? -1 : 1);
                        }

                        if (!(var10000 != 0)) {
                           this.field_48 = false;
                           this.field_44 = true;
                           this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                        }
                     }

                     var10000 = var6;
                     if (var6 == 0) {
                        if (var6 == 0) {
                           return;
                        }

                        var3.cancel();
                        var10000 = this.field_43y;
                     }

                     Teleport_47Qx var96;
                     if (var10000 > 1) {
                        var96 = this;
                        var121 = var6;
                     } else {
                        var96 = this;
                        var121 = this.field_43y + 1;
                     }

                     var96.field_43y = var121;
                     return;
                  }

                  label2816: {
                     if (var121 == 0) {
                        if ((var10000) != 0) {
                           break label2816;
                        }

                        double var154;
                        var10000 = (var154 = var22.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var154 < 0.0 ? -1 : 1);
                     }

                     if (var6 == 0) {
                        if ((var10000) != 0) {
                           break label2816;
                        }

                        double var155;
                        var10000 = (var155 = var22.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var155 < 0.0 ? -1 : 1);
                     }

                     if (!(var10000 != 0)) {
                        this.field_48 = false;
                        this.field_44 = true;
                        this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                     }
                  }

                  if (var6 != 0) {
                     var10000 = ((int) (this.field_43v ? 1 : 0));
                     if (var6 == 0) {
                        if (!this.field_43v) {
                           return;
                        }

                        var10000 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                     }

                     if (var6 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        var3.cancel();
                        var10000 = this.field_43y;
                     }

                     label2359: {
                        if (var10000 > 1) {
                           var98 = this;
                           if (var6 != 0) {
                              break label2359;
                           }

                           if (!this.field_43u) {
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                 .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                              this.field_43u = true;
                              this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                              this.field_43y = 0;
                              recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                           }
                        }

                        var98 = this;
                     }

                     var98.field_43y++;
                  }

                  return;
               }

               if (var121 == 0) {
                  if (var80 == 0) {
                     return;
                  }

                  var80 = ((this.field_48) ? 1 : 0);
               }

               if (var80 != 0) {
                  label2421: {
                     C_47xZ var26 = (C_47xZ)var7;
                     double var156;
                     var10000 = (var156 = var26.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var156 < 0.0 ? -1 : 1);
                     if (var6 == 0) {
                        if ((var10000) != 0) {
                           break label2421;
                        }

                        double var157;
                        var10000 = (var157 = var26.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var157 < 0.0 ? -1 : 1);
                     }

                     if (!(var10000 != 0)) {
                        this.field_48 = false;
                        this.field_44 = true;
                        this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                     }
                  }

                  Teleport_47Qx var109;
                  if (var6 > var6) {
                     var109 = this;
                     var121 = var6;
                  } else {
                     var109 = this;
                     var121 = this.field_43y + 1;
                  }

                  var109.field_43y = var121;
               }

               return;
            case 1216457565:
               int var59 = ((int) (var8.equals((String)recovery$indy$flow$87(1737, 8444446367813591446L ^ var1)) ? 1 : 0));
               if (var1 > 0L) {
                  if (var6 == 0) {
                     if (var59 != 0) {
                        var9 = 1;
                     }

                     var59 = var9;
                  }

                  if (var6 == 0) {
                     switch (var59) {
                        case 0:
                           int var73 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                           if (var6 == 0) {
                              if (!(var73 != 0)) {
                                 break;
                              }

                              var73 = ((int) (this.field_48 ? 1 : 0));
                           }

                           if ((var73) != 0) {
                              label2788: {
                                 C_47xZ var20 = (C_47xZ)var7;
                                 double var129;
                                 var73 = (var129 = var20.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var129 < 0.0 ? -1 : 1);
                                 if (var6 == 0) {
                                    if ((var73) != 0) {
                                       break label2788;
                                    }

                                    double var130;
                                    var73 = (var130 = var20.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var130 < 0.0 ? -1 : 1);
                                 }

                                 if (var6 == 0) {
                                    if ((var73) != 0) {
                                       break label2788;
                                    }

                                    double var131;
                                    var73 = (var131 = var20.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var131 < 0.0 ? -1 : 1);
                                 }

                                 if (!(var73 != 0)) {
                                    this.field_48 = false;
                                    this.field_44 = true;
                                    this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                 }
                              }

                              if (var6 != 0) {
                                 var73 = ((int) (this.field_43v ? 1 : 0));
                                 if (var6 == 0) {
                                    if (!this.field_43v) {
                                       break;
                                    }

                                    var73 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                 }

                                 if (var6 == 0) {
                                    if (var73 == 0) {
                                       break;
                                    }

                                    var3.cancel();
                                    var73 = this.field_43y;
                                 }

                                 label2098: {
                                    if (var73 > 1) {
                                       var76 = this;
                                       if (var6 != 0) {
                                          break label2098;
                                       }

                                       if (!this.field_43u) {
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                             .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                          this.field_43u = true;
                                          this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                          this.field_43y = 0;
                                          recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                       }
                                    }

                                    var76 = this;
                                 }

                                 var76.field_43y++;
                              }
                           }
                           break;
                        case 1:
                           var59 = ((int) (this.field_43v ? 1 : 0));
                           if (var6 == 0) {
                              if (!this.field_43v) {
                                 return;
                              }

                              var59 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                           }

                           if (var6 == 0) {
                              if (var59 == 0) {
                                 return;
                              }

                              var3.cancel();
                              var59 = this.field_43y;
                           }

                           label2082: {
                              if (var59 > 1) {
                                 var72 = this;
                                 if (var6 != 0) {
                                    break label2082;
                                 }

                                 if (!this.field_43u) {
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                       .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                    this.field_43u = true;
                                    this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                    this.field_43y = 0;
                                    recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                 }
                              }

                              var72 = this;
                           }

                           var72.field_43y++;
                     }
                  } else {
                     if (var6 == 0) {
                        if (var59 == 0) {
                           return;
                        }

                        var59 = ((int) (this.field_48 ? 1 : 0));
                     }

                     if (var59 != 0) {
                        label2790: {
                           C_47xZ var21 = (C_47xZ)var7;
                           double var132;
                           var59 = (var132 = var21.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var132 < 0.0 ? -1 : 1);
                           if (var6 == 0) {
                              if ((var59) != 0) {
                                 break label2790;
                              }

                              double var133;
                              var59 = (var133 = var21.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var133 < 0.0 ? -1 : 1);
                           }

                           if (var6 == 0) {
                              if ((var59) != 0) {
                                 break label2790;
                              }

                              double var134;
                              var59 = (var134 = var21.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var134 < 0.0 ? -1 : 1);
                           }

                           if (!(var59 != 0)) {
                              this.field_48 = false;
                              this.field_44 = true;
                              this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                           }
                        }

                        if (var6 != 0) {
                           var59 = ((int) (this.field_43v ? 1 : 0));
                           if (var6 == 0) {
                              if (!this.field_43v) {
                                 return;
                              }

                              var59 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                           }

                           if (var6 == 0) {
                              if (var59 == 0) {
                                 return;
                              }

                              var3.cancel();
                              var59 = this.field_43y;
                           }

                           label2133: {
                              if (var59 > 1) {
                                 var79 = this;
                                 if (var6 != 0) {
                                    break label2133;
                                 }

                                 if (!this.field_43u) {
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                       .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                    this.field_43u = true;
                                    this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                    this.field_43y = 0;
                                    recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                 }
                              }

                              var79 = this;
                           }

                           var79.field_43y++;
                        }
                     }
                  }

                  return;
               } else if (var1 >= 0L) {
                  if (var6 == 0) {
                     switch (var59) {
                        case 0:
                           int var64 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                           if (var6 == 0) {
                              if (!(var64 != 0)) {
                                 break;
                              }

                              var64 = ((int) (this.field_48 ? 1 : 0));
                           }

                           if ((var64) != 0) {
                              label2180: {
                                 C_47xZ var18 = (C_47xZ)var7;
                                 double var135;
                                 var64 = (var135 = var18.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var135 < 0.0 ? -1 : 1);
                                 if (var6 == 0) {
                                    if ((var64) != 0) {
                                       break label2180;
                                    }

                                    double var136;
                                    var64 = (var136 = var18.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var136 < 0.0 ? -1 : 1);
                                 }

                                 if (!(var64 != 0)) {
                                    this.field_48 = false;
                                    this.field_44 = true;
                                    this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                 }
                              }

                              var64 = var6;
                              if (var6 == 0) {
                                 if (var6 == 0) {
                                    break;
                                 }

                                 var3.cancel();
                                 var64 = this.field_43y;
                              }

                              Teleport_47Qx var67;
                              int var119;
                              if (var64 > 1) {
                                 var67 = this;
                                 var119 = var6;
                              } else {
                                 var67 = this;
                                 var119 = this.field_43y + 1;
                              }

                              var67.field_43y = var119;
                           }
                           break;
                        case 1:
                           var59 = ((int) (this.field_43v ? 1 : 0));
                           if (var6 == 0) {
                              if (!this.field_43v) {
                                 return;
                              }

                              var3.cancel();
                              var59 = this.field_43y;
                           }

                           Teleport_47Qx var63;
                           int var118;
                           if (var59 > 1) {
                              var63 = this;
                              var118 = var6;
                           } else {
                              var63 = this;
                              var118 = this.field_43y + 1;
                           }

                           var63.field_43y = var118;
                     }
                  } else {
                     if (var6 == 0) {
                        if (var59 == 0) {
                           return;
                        }

                        var59 = ((int) (this.field_48 ? 1 : 0));
                     }

                     if (var59 != 0) {
                        label2199: {
                           C_47xZ var19 = (C_47xZ)var7;
                           double var137;
                           var59 = (var137 = var19.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var137 < 0.0 ? -1 : 1);
                           if (var6 == 0) {
                              if ((var59) != 0) {
                                 break label2199;
                              }

                              double var138;
                              var59 = (var138 = var19.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var138 < 0.0 ? -1 : 1);
                           }

                           if (!(var59 != 0)) {
                              this.field_48 = false;
                              this.field_44 = true;
                              this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                           }
                        }

                        var59 = var6;
                        if (var6 == 0) {
                           if (var6 == 0) {
                              return;
                           }

                           var3.cancel();
                           var59 = this.field_43y;
                        }

                        Teleport_47Qx var70;
                        int var120;
                        if (var59 > 1) {
                           var70 = this;
                           var120 = var6;
                        } else {
                           var70 = this;
                           var120 = this.field_43y + 1;
                        }

                        var70.field_43y = var120;
                     }
                  }

                  return;
               } else {
                  if (var6 == 0) {
                     if (var59 == 0) {
                        return;
                     }

                     var59 = ((int) (this.field_48 ? 1 : 0));
                  }

                  if (var59 != 0) {
                     label2215: {
                        C_47xZ var17 = (C_47xZ)var7;
                        double var139;
                        var59 = (var139 = var17.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var139 < 0.0 ? -1 : 1);
                        if (var6 == 0) {
                           if ((var59) != 0) {
                              break label2215;
                           }

                           double var140;
                           var59 = (var140 = var17.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var140 < 0.0 ? -1 : 1);
                        }

                        if (!(var59 != 0)) {
                           this.field_48 = false;
                           this.field_44 = true;
                           this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                        }
                     }

                     Teleport_47Qx var61;
                     int var117;
                     if (var6 > var6) {
                        var61 = this;
                        var117 = var6;
                     } else {
                        var61 = this;
                        var117 = this.field_43y + 1;
                     }

                     var61.field_43y = var117;
                  }

                  return;
               }
            default:
               int var42 = var9;
               if (var1 >= 0L) {
                  if (var6 == 0) {
                     switch (var9) {
                        case 0:
                           int var53 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                           if (var6 == 0) {
                              if (!(var53 != 0)) {
                                 return;
                              }

                              var53 = ((int) (this.field_48 ? 1 : 0));
                           }

                           if ((var53) != 0) {
                              C_47xZ var16 = (C_47xZ)var7;
                              double var158;
                              var53 = (var158 = var16.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var158 < 0.0 ? -1 : 1);
                              if (var1 > 0L) {
                                 label2826: {
                                    if (var6 == 0) {
                                       if ((var53) != 0) {
                                          break label2826;
                                       }

                                       double var159;
                                       var53 = (var159 = var16.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var159 < 0.0 ? -1 : 1);
                                    }

                                    if (var6 == 0) {
                                       if ((var53) != 0) {
                                          break label2826;
                                       }

                                       double var160;
                                       var53 = (var160 = var16.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var160 < 0.0 ? -1 : 1);
                                    }

                                    if (!(var53 != 0)) {
                                       this.field_48 = false;
                                       this.field_44 = true;
                                       this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                    }
                                 }

                                 if (var6 != 0) {
                                    var53 = ((int) (this.field_43v ? 1 : 0));
                                    if (var6 == 0) {
                                       if (!this.field_43v) {
                                          return;
                                       }

                                       var53 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                                    }

                                    if (var6 == 0) {
                                       if (var53 == 0) {
                                          return;
                                       }

                                       var3.cancel();
                                       var53 = this.field_43y;
                                    }

                                    label2512: {
                                       if (var53 > 1) {
                                          var58 = this;
                                          if (var6 != 0) {
                                             break label2512;
                                          }

                                          if (!this.field_43u) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                                .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                             this.field_43u = true;
                                             this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                             this.field_43y = 0;
                                             recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                          }
                                       }

                                       var58 = this;
                                    }

                                    var58.field_43y++;
                                 }

                                 return;
                              }

                              label2548: {
                                 if (var6 == 0) {
                                    if ((var53) != 0) {
                                       break label2548;
                                    }

                                    double var161;
                                    var53 = (var161 = var16.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var161 < 0.0 ? -1 : 1);
                                 }

                                 if (!(var53 != 0)) {
                                    this.field_48 = false;
                                    this.field_44 = true;
                                    this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                 }
                              }

                              var53 = var6;
                              if (var6 == 0) {
                                 if (var6 == 0) {
                                    return;
                                 }

                                 var3.cancel();
                                 var53 = this.field_43y;
                              }

                              Teleport_47Qx var56;
                              int var116;
                              if (var53 > 1) {
                                 var56 = this;
                                 var116 = var6;
                              } else {
                                 var56 = this;
                                 var116 = this.field_43y + 1;
                              }

                              var56.field_43y = var116;
                              return;
                           }

                           return;
                        case 1:
                           var42 = ((int) (this.field_43v ? 1 : 0));
                           if (var1 > 0L) {
                              if (var6 == 0) {
                                 if (!this.field_43v) {
                                    return;
                                 }

                                 var42 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                              }

                              if (var6 == 0) {
                                 if (var42 == 0) {
                                    return;
                                 }

                                 var3.cancel();
                                 var42 = this.field_43y;
                              }

                              label2485: {
                                 if (var42 > 1) {
                                    var52 = this;
                                    if (var6 != 0) {
                                       break label2485;
                                    }

                                    if (!this.field_43u) {
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                          .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                       this.field_43u = true;
                                       this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                       this.field_43y = 0;
                                       recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                    }
                                 }

                                 var52 = this;
                              }

                              var52.field_43y++;
                              return;
                           } else {
                              if (var6 == 0) {
                                 if (!this.field_43v) {
                                    return;
                                 }

                                 var3.cancel();
                                 var42 = this.field_43y;
                              }

                              Teleport_47Qx var51;
                              int var115;
                              if (var42 > 1) {
                                 var51 = this;
                                 var115 = var6;
                              } else {
                                 var51 = this;
                                 var115 = this.field_43y + 1;
                              }

                              var51.field_43y = var115;
                              return;
                           }
                     }
                  } else {
                     if (var6 == 0) {
                        if (var9 == 0) {
                           return;
                        }

                        var42 = ((int) (this.field_48 ? 1 : 0));
                     }

                     if (var42 != 0) {
                        C_47xZ var15 = (C_47xZ)var7;
                        double var162;
                        var42 = (var162 = var15.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var162 < 0.0 ? -1 : 1);
                        if (var1 > 0L) {
                           label2831: {
                              if (var6 == 0) {
                                 if ((var42) != 0) {
                                    break label2831;
                                 }

                                 double var163;
                                 var42 = (var163 = var15.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var163 < 0.0 ? -1 : 1);
                              }

                              if (var6 == 0) {
                                 if ((var42) != 0) {
                                    break label2831;
                                 }

                                 double var164;
                                 var42 = (var164 = var15.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var164 < 0.0 ? -1 : 1);
                              }

                              if (!(var42 != 0)) {
                                 this.field_48 = false;
                                 this.field_44 = true;
                                 this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                              }
                           }

                           if (var6 != 0) {
                              var42 = ((int) (this.field_43v ? 1 : 0));
                              if (var6 == 0) {
                                 if (!this.field_43v) {
                                    return;
                                 }

                                 var42 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                              }

                              if (var6 == 0) {
                                 if (var42 == 0) {
                                    return;
                                 }

                                 var3.cancel();
                                 var42 = this.field_43y;
                              }

                              label2564: {
                                 if (var42 > 1) {
                                    var49 = this;
                                    if (var6 != 0) {
                                       break label2564;
                                    }

                                    if (!this.field_43u) {
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                          .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                       this.field_43u = true;
                                       this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                       this.field_43y = 0;
                                       recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                    }
                                 }

                                 var49 = this;
                              }

                              var49.field_43y++;
                           }
                        } else {
                           label2600: {
                              if (var6 == 0) {
                                 if ((var42) != 0) {
                                    break label2600;
                                 }

                                 double var165;
                                 var42 = (var165 = var15.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var165 < 0.0 ? -1 : 1);
                              }

                              if (!(var42 != 0)) {
                                 this.field_48 = false;
                                 this.field_44 = true;
                                 this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                              }
                           }

                           var42 = var6;
                           if (var6 == 0) {
                              if (var6 == 0) {
                                 return;
                              }

                              var3.cancel();
                              var42 = this.field_43y;
                           }

                           Teleport_47Qx var47;
                           int var114;
                           if (var42 > 1) {
                              var47 = this;
                              var114 = var6;
                           } else {
                              var47 = this;
                              var114 = this.field_43y + 1;
                           }

                           var47.field_43y = var114;
                        }
                     }
                  }
               } else {
                  if (var6 == 0) {
                     if (var9 == 0) {
                        return;
                     }

                     var42 = ((int) (this.field_48 ? 1 : 0));
                  }

                  if (var42 != 0) {
                     label2617: {
                        C_47xZ var14 = (C_47xZ)var7;
                        double var166;
                        var42 = (var166 = var14.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var166 < 0.0 ? -1 : 1);
                        if (var6 == 0) {
                           if ((var42) != 0) {
                              break label2617;
                           }

                           double var167;
                           var42 = (var167 = var14.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var167 < 0.0 ? -1 : 1);
                        }

                        if (!(var42 != 0)) {
                           this.field_48 = false;
                           this.field_44 = true;
                           this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                        }
                     }

                     Teleport_47Qx var44;
                     int var113;
                     if (var6 > var6) {
                        var44 = this;
                        var113 = var6;
                     } else {
                        var44 = this;
                        var113 = this.field_43y + 1;
                     }

                     var44.field_43y = var113;
                  }
               }
         }
      } else if (var1 >= 0L) {
         if (var6 == 0) {
            switch (var10000) {
               case 0:
                  int var37 = ((int) (var7 instanceof C_47xZ ? 1 : 0));
                  if (var6 == 0) {
                     if (!(var37 != 0)) {
                        return;
                     }

                     var37 = ((int) (this.field_48 ? 1 : 0));
                  }

                  if ((var37) != 0) {
                     C_47xZ var13 = (C_47xZ)var7;
                     double var168;
                     var37 = (var168 = var13.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var168 < 0.0 ? -1 : 1);
                     if (var1 > 0L) {
                        label2841: {
                           if (var6 == 0) {
                              if ((var37) != 0) {
                                 break label2841;
                              }

                              double var169;
                              var37 = (var169 = var13.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var169 < 0.0 ? -1 : 1);
                           }

                           if (var6 == 0) {
                              if ((var37) != 0) {
                                 break label2841;
                              }

                              double var170;
                              var37 = (var170 = var13.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var170 < 0.0 ? -1 : 1);
                           }

                           if (!(var37 != 0)) {
                              this.field_48 = false;
                              this.field_44 = true;
                              this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                           }
                        }

                        if (var6 != 0) {
                           byte var40 = ((byte) (this.field_43v ? 1 : 0));
                           if (var6 == 0) {
                              if (!this.field_43v) {
                                 return;
                              }

                              var40 = ((byte) (var7 instanceof C_47xZ ? 1 : 0));
                           }

                           Teleport_47Qx var41;
                           if (var6 == 0) {
                              if (var40 == 0) {
                                 return;
                              }

                              var3.cancel();
                              var41 = this;
                           } else {
                              label2665: {
                                 if (var40 > 1) {
                                    var41 = this;
                                    if (var6 != 0) {
                                       break label2665;
                                    }

                                    if (!this.field_43u) {
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                          .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                       this.field_43u = true;
                                       this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                       this.field_43y = 0;
                                       recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                                    }
                                 }

                                 var41 = this;
                              }
                           }

                           var41.field_43y++;
                        }

                        return;
                     }

                     label2701: {
                        if (var6 == 0) {
                           if ((var37) != 0) {
                              break label2701;
                           }

                           double var171;
                           var37 = (var171 = var13.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var171 < 0.0 ? -1 : 1);
                        }

                        if (!(var37 != 0)) {
                           this.field_48 = false;
                           this.field_44 = true;
                           this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                        }
                     }

                     int var112;
                     label2694: {
                        if (var6 == 0) {
                           if (var6 == 0) {
                              return;
                           }

                           var3.cancel();
                           var39 = this;
                        } else {
                           if (var6 > 1) {
                              var39 = this;
                              var112 = var6;
                              break label2694;
                           }

                           var39 = this;
                        }

                        var112 = var39.field_43y + 1;
                     }

                     var39.field_43y = var112;
                     return;
                  }

                  return;
               case 1:
                  byte var34 = ((byte) (this.field_43v ? 1 : 0));
                  if (var1 > 0L) {
                     if (var6 == 0) {
                        if (!this.field_43v) {
                           return;
                        }

                        var34 = ((byte) (var7 instanceof C_47xZ ? 1 : 0));
                     }

                     Teleport_47Qx var36;
                     if (var6 == 0) {
                        if (var34 == 0) {
                           return;
                        }

                        var3.cancel();
                        var36 = this;
                     } else {
                        label2635: {
                           if (var34 > 1) {
                              var36 = this;
                              if (var6 != 0) {
                                 break label2635;
                              }

                              if (!this.field_43u) {
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                    .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                 this.field_43u = true;
                                 this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                 this.field_43y = 0;
                                 recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                              }
                           }

                           var36 = this;
                        }
                     }

                     var36.field_43y++;
                     return;
                  } else {
                     int var111;
                     label2652: {
                        if (var6 == 0) {
                           if (!this.field_43v) {
                              return;
                           }

                           var3.cancel();
                           var35 = this;
                        } else {
                           if (((int) (this.field_43v ? 1 : 0)) > 1) {
                              var35 = this;
                              var111 = var6;
                              break label2652;
                           }

                           var35 = this;
                        }

                        var111 = var35.field_43y + 1;
                     }

                     var35.field_43y = var111;
                     return;
                  }
            }
         } else {
            if (var6 == 0) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = ((int) (this.field_48 ? 1 : 0));
            }

            if (var10000 != 0) {
               C_47xZ var12 = (C_47xZ)var7;
               double var172;
               var10000 = (var172 = var12.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var172 < 0.0 ? -1 : 1);
               if (var1 > 0L) {
                  label2845: {
                     if (var6 == 0) {
                        if ((var10000) != 0) {
                           break label2845;
                        }

                        double var173;
                        var10000 = (var173 = var12.method_48$fedcb3e4d3() - this.field_41[1]) == 0.0 ? 0 : (var173 < 0.0 ? -1 : 1);
                     }

                     if (var6 == 0) {
                        if ((var10000) != 0) {
                           break label2845;
                        }

                        double var174;
                        var10000 = (var174 = var12.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var174 < 0.0 ? -1 : 1);
                     }

                     if (!(var10000 != 0)) {
                        this.field_48 = false;
                        this.field_44 = true;
                        this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                     }
                  }

                  if (var6 != 0) {
                     byte var32 = ((byte) (this.field_43v ? 1 : 0));
                     if (var6 == 0) {
                        if (!this.field_43v) {
                           return;
                        }

                        var32 = ((byte) (var7 instanceof C_47xZ ? 1 : 0));
                     }

                     Teleport_47Qx var33;
                     if (var6 == 0) {
                        if (var32 == 0) {
                           return;
                        }

                        var3.cancel();
                        var33 = this;
                     } else {
                        label2720: {
                           if (var32 > 1) {
                              var33 = this;
                              if (var6 != 0) {
                                 break label2720;
                              }

                              if (!this.field_43u) {
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, 2669420618098631842L, var1))
                                    .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                                 this.field_43u = true;
                                 this.field_42 = (int)((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$114(field_43, 2669420618098631842L, var1)).field_48j;
                                 this.field_43y = 0;
                                 recovery$indy$flow$119(this.field_49, 2669442118893340304L, var1);
                              }
                           }

                           var33 = this;
                        }
                     }

                     var33.field_43y++;
                  }
               } else {
                  label2756: {
                     if (var6 == 0) {
                        if ((var10000) != 0) {
                           break label2756;
                        }

                        double var175;
                        var10000 = (var175 = var12.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var175 < 0.0 ? -1 : 1);
                     }

                     if (!(var10000 != 0)) {
                        this.field_48 = false;
                        this.field_44 = true;
                        this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                     }
                  }

                  int var110;
                  label2749: {
                     if (var6 == 0) {
                        if (var6 == 0) {
                           return;
                        }

                        var3.cancel();
                        var31 = this;
                     } else {
                        if (var6 > 1) {
                           var31 = this;
                           var110 = var6;
                           break label2749;
                        }

                        var31 = this;
                     }

                     var110 = var31.field_43y + 1;
                  }

                  var31.field_43y = var110;
               }
            }
         }
      } else {
         if (var6 == 0) {
            if (var10000 == 0) {
               return;
            }

            var10000 = ((int) (this.field_48 ? 1 : 0));
         }

         if (var10000 != 0) {
            label2773: {
               C_47xZ var10 = (C_47xZ)var7;
               double var176;
               var10000 = (var176 = var10.method_40$fedcb3e4d3() - this.field_41[0]) == 0.0 ? 0 : (var176 < 0.0 ? -1 : 1);
               if (var6 == 0) {
                  if ((var10000) != 0) {
                     break label2773;
                  }

                  double var177;
                  var10000 = (var177 = var10.method_46$fedcb3e4d3() - this.field_41[2]) == 0.0 ? 0 : (var177 < 0.0 ? -1 : 1);
               }

               if (!(var10000 != 0)) {
                  this.field_48 = false;
                  this.field_44 = true;
                  this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
               }
            }

            Teleport_47Qx var29;
            int var10001;
            if (var6 > var6) {
               var29 = this;
               var10001 = var6;
            } else {
               var29 = this;
               var10001 = this.field_43y + 1;
            }

            var29.field_43y = var10001;
         }
      }
   }





   public void method_47$05bd94f678(C_472n var1, long var2) {
      augustus.recovered.modules.player.Teleport_47Qx var9;
      byte var8;
      byte var10;
      int var10000;
      label212: {
         label211: {
            long var4;
            label215: {
               label209: {
                  var4 = var2 ^ 74807535967538L;
                  long var6 = var2 ^ 77412314636080L;
                  var8 = (byte) ((recovery$indy$33(6398492901454854113L, var2)) ? 1 : 0);
                  var10000 = (int) ((recovery$indy$34(this.settingMode, var4, 6398680949181918544L, var2).equals(recovery$indy$35(9626, 3780436625771216645L ^ var2))) ? 1 : 0);
                  label208:
                  if (var8 == 0) {
                     if (var10000 != 0) {
                        var10000 = (int) ((recovery$indy$36(this.field_49, 1500L, var6, 6398723610620936326L, var2)) ? 1 : 0);
                        var10 = var8;
                        if (var2 < 0L) {
                           break label209;
                        }

                        if (var8 != 0) {
                           break label208;
                        }

                        if (var10000 == 0) {
                           recovery$indy$37(var1, 1.0F, 6395443269896967702L, var2);
                           if (var8 == 0) {
                              break label215;
                           }
                        }
                     }

                     var10000 = (int) ((this.field_43P) ? 1 : 0);
                  }

                  var10 = var8;
               }

               if (var10 != 0) {
                  break label211;
               }

               if (var10000 != 0) {
                  var10000 = (int) ((this.field_43a) ? 1 : 0);
                  var10 = var8;
                  if (var2 <= 0L) {
                     break label212;
                  }

                  if (var8 != 0) {
                     break label211;
                  }

                  if (!this.field_43a) {
                     this.field_43P = false;
                     this.field_44 = true;
                     this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                  }
               }
            }

            var10000 = (int) ((recovery$indy$38(this.settingMode, var4, 6398680949181918544L, var2).equals(recovery$indy$39(1737, 8444480286148238419L ^ var2))) ? 1 : 0);
         }

         var10 = var8;
      }

      if (var2 >= 0L) {
         if (var10 == 0) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((this.field_43v) ? 1 : 0);
         }

         var10 = var8;
      }

      if (var2 > 0L) {
         if (var10 == 0) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((this.field_43u) ? 1 : 0);
         }

         var10 = var8;
      }

      label171: {
         label170: {
            label169: {
               label219: {
                  if (var2 >= 0L) {
                     if (var10 == 0) {
                        if (var10000 == 0) {
                           break label219;
                        }

                        var10000 = (int) ((this.field_43a) ? 1 : 0);
                     }

                     var10 = var8;
                  }

                  if (var2 <= 0L) {
                     break label171;
                  }

                  if (var10 != 0) {
                     break label170;
                  }

                  if (var10000 == 0) {
                     break label169;
                  }
               }

               recovery$indy$40(var1, 1.0F, 6395443269896967702L, var2);
            }

            var10000 = (int) ((this.field_43v) ? 1 : 0);
         }

         var10 = var8;
      }

      label152: {
         label220: {
            label221: {
               label149: {
                  label148:
                  if (var10 == 0) {
                     if (var10000 != 0) {
                        var10000 = (int) ((this.field_43u) ? 1 : 0);
                        var10 = var8;
                        if (var2 < 0L) {
                           break label149;
                        }

                        if (var8 != 0) {
                           break label148;
                        }

                        if (!this.field_43u) {
                           var10000 = this.field_43y;
                           var10 = 1;
                           if (var8 != 0) {
                              break label221;
                           }

                           if (this.field_43y >= 1) {
                              recovery$indy$41(var1, 0.0F, 6395443269896967702L, var2);
                              recovery$indy$42(var1, 0.0F, 6395611007509422873L, var2);
                           }
                        }
                     }

                     var10000 = this.field_43y;
                  }

                  var10 = var8;
               }

               if (var2 <= 0L) {
                  break label152;
               }

               if (var10 != 0) {
                  break label220;
               }

               var10 = 40;
            }

            if (var10000 <= var10) {
               return;
            }

            var10000 = (int) ((this.field_43u) ? 1 : 0);
         }

         var10 = var8;
      }

      label125: {
         label223: {
            if (var10 == 0) {
               if (var10000 == 0) {
                  return;
               }

               var9 = this;
               var10 = var8;
               if (var2 < 0L) {
                  break label125;
               }

               if (var8 != 0) {
                  break label223;
               }

               var10000 = (int) ((this.field_43a) ? 1 : 0);
            }

            if (var10000 == 0) {
               return;
            }

            this.field_44 = true;
            this.field_43v = false;
            this.field_43u = false;
            this.field_43y = 0;
            this.field_43a = false;
            var9 = this;
         }

         var10 = 3;
      }

      double[] var14 = new double[var10];
      var14[0] = Double.POSITIVE_INFINITY;
      var14[1] = Double.POSITIVE_INFINITY;
      var14[2] = Double.POSITIVE_INFINITY;
      var9.field_41 = var14;
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$43(this, 43, var3, -7098877779962186396L, var1);
      recovery$indy$44(this, 26, var3, -7098877779962186396L, var1);
      recovery$indy$45(this, 25, var3, -7098877779962186396L, var1);
      recovery$indy$46(this, 3, var3, -7098877779962186396L, var1);
      recovery$indy$47(this, 21, var3, -7098877779962186396L, var1);
   }



   public void method_45q$e45a9973e5(long var1) {
      augustus.recovered.modules.player.Teleport_47Qx var16;
      augustus.recovered.modules.player.Teleport_47Qx var17;
      long var5;
      long var7;
      byte var9;
      int var10000;
      byte var10001;
      label335: {
         long var3 = var1 ^ 46911700055250L;
         var5 = var1 ^ 54777118390967L;
         var7 = var1 ^ 56896567818421L;
         var9 = (byte) ((recovery$indy$48(4560306648037871716L, var1)) ? 1 : 0);
         recovery$indy$50(this, var3, recovery$indy$49(this.settingMode, var5, 4560417661031893717L, var1), 4560227897534633458L, var1);
         var10000 = (int) ((recovery$indy$51(field_43, 4560541071452357066L, var1).field_44l.method_42$aae029aa0a()) ? 1 : 0);
         label334:
         if (var9 == 0) {
            label332:
            if (var10000 != 0) {
               C_47Ij var14 = recovery$indy$52(field_43, 4559039879486354692L, var1);
               if (var9 == 0) {
                  if (var14 == null) {
                     break label332;
                  }

                  var14 = recovery$indy$53(field_43, 4559039879486354692L, var1);
               }

               if (var14.field_49 == C_47Az.BLOCK) {
                  double var25;
                  var10000 = (var25 = this.field_41[0] - (Double.POSITIVE_INFINITY)) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
                  var10001 = var9;
                  if (var1 < 0L) {
                     break label335;
                  }

                  if (var9 != 0) {
                     break label334;
                  }

                  if (var10000 == 0) {
                     C_478Q var10 = recovery$indy$54(field_43, 4559039879486354692L, var1).method_49$5730377d31();
                     C_475y var11 = recovery$indy$55(field_43, 4560840028390501829L, var1).method_46$efbf73d2b1(var10).method_48$e084f7739d();
                     this.field_41 = new double[]{
                        recovery$indy$56(field_43, 4559039879486354692L, var1).method_49$5730377d31().method_40$8abf5c6871() + 0.5,
                        recovery$indy$57(field_43, 4559039879486354692L, var1).method_49$5730377d31().method_43$8abf5c6871() + var11.method_49$fedcb3e4d3(),
                        recovery$indy$58(field_43, 4559039879486354692L, var1).method_49$5730377d31().method_47$8abf5c6871() + 0.5
                     };
                     this.field_48 = true;
                     recovery$indy$59(this.field_40, 4560975997999357136L, var1);
                  }
               }
            }

            var10000 = (int) ((recovery$indy$60(this.settingMode, var5, 4560417661031893717L, var1).equals(recovery$indy$61(9626, 3780414324318492800L ^ var1))) ? 1 : 0);
         }

         var10001 = var9;
      }

      label318: {
         label317:
         if (var10001 == 0) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$62(field_43, 4560944790552739554L, var1).field_48M) ? 1 : 0);
               if (var9 != 0) {
                  break label317;
               }

               if (var10000 != 0) {
                  var10000 = (int) ((this.field_43a) ? 1 : 0);
                  var10001 = var9;
                  if (var1 <= 0L) {
                     break label318;
                  }

                  if (var9 != 0) {
                     break label317;
                  }

                  if (this.field_43a) {
                     recovery$indy$63(field_43, 4560944790552739554L, var1)
                        .method_46$a59262c0f0(
                           recovery$indy$64(field_43, 4560944790552739554L, var1).field_48Q,
                           recovery$indy$65(field_43, 4560944790552739554L, var1).field_48j + 2.0,
                           recovery$indy$66(field_43, 4560944790552739554L, var1).field_42o
                        );
                     this.field_43a = false;
                     recovery$indy$67(this.field_49, 4560975997999357136L, var1);
                     this.field_42 = (int)recovery$indy$68(field_43, 4560944790552739554L, var1).field_48j;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$69(this.settingMode, var5, 4560417661031893717L, var1).equals(recovery$indy$70(1737, 8444433799937457110L ^ var1))) ? 1 : 0);
         }

         var10001 = var9;
      }

      label304: {
         label303:
         if (var10001 == 0) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$71(field_43, 4560944790552739554L, var1).field_48M) ? 1 : 0);
               if (var9 != 0) {
                  break label303;
               }

               if (var10000 != 0) {
                  var10000 = (int) ((this.field_43u) ? 1 : 0);
                  if (var9 != 0) {
                     break label303;
                  }

                  if (this.field_43u) {
                     var10000 = (int) ((this.field_43a) ? 1 : 0);
                     if (var9 != 0) {
                        break label303;
                     }

                     if (!this.field_43a) {
                        var10000 = (int) ((recovery$indy$72(this.field_49, 500L, var7, 4560352983312901891L, var1)) ? 1 : 0);
                        var10001 = var9;
                        if (var1 <= 0L) {
                           break label304;
                        }

                        if (var9 != 0) {
                           break label303;
                        }

                        if (var10000 != 0) {
                           this.field_43a = true;
                           recovery$indy$73(field_43, 4560944790552739554L, var1).method_46f$da8c82d5d4();
                           this.field_42 = (int)recovery$indy$74(field_43, 4560944790552739554L, var1).field_48j + 1;
                           this.field_43y = 0;
                        }
                     }
                  }
               }
            }

            var10000 = (int) ((this.field_48) ? 1 : 0);
         }

         var10001 = var9;
      }

      label284: {
         label283:
         if (var10001 == 0) {
            label281: {
               label280:
               if (var10000 != 0) {
                  label278: {
                     String var12 = recovery$indy$75(this.settingMode, var5, 4560417661031893717L, var1);
                     byte var13 = -1;
                     var10000 = var12.hashCode();
                     label277:
                     if (var9 == 0) {
                        label342: {
                           label274: {
                              label343: {
                                 label272: {
                                    label344: {
                                       switch (var10000) {
                                          case -1721492669:
                                             break label344;
                                          case 244394530:
                                             var10000 = (int) ((var12.equals(recovery$indy$76(28360, 2840435825381970907L ^ var1))) ? 1 : 0);
                                             if (var9 != 0) {
                                                break label277;
                                             }

                                             if (var10000 == 0) {
                                                break label342;
                                             }

                                             var13 = 0;
                                             var10000 = var9;
                                             if (var1 < 0L) {
                                                break;
                                             }

                                             if (var9 == 0) {
                                                break label342;
                                             }
                                          case 1897755483:
                                             var10000 = (int) ((var12.equals(recovery$indy$77(3705, 2890947784364389230L ^ var1))) ? 1 : 0);
                                             break;
                                          case 1216457565:
                                             break label343;
                                          default:
                                             break label342;
                                       }

                                       if (var9 != 0) {
                                          break label277;
                                       }

                                       if (var10000 == 0) {
                                          break label342;
                                       }

                                       var13 = 1;
                                       var10000 = var9;
                                       if (var1 < 0L) {
                                          break label272;
                                       }

                                       if (var9 == 0) {
                                          break label342;
                                       }
                                    }

                                    var10000 = (int) ((var12.equals(recovery$indy$78(9626, 3780414324318492800L ^ var1))) ? 1 : 0);
                                 }

                                 if (var9 != 0) {
                                    break label277;
                                 }

                                 if (var10000 == 0) {
                                    break label342;
                                 }

                                 var13 = 2;
                                 var10000 = var9;
                                 if (var1 <= 0L) {
                                    break label274;
                                 }

                                 if (var9 == 0) {
                                    break label342;
                                 }
                              }

                              var10000 = (int) ((var12.equals(recovery$indy$79(1737, 8444433799937457110L ^ var1))) ? 1 : 0);
                           }

                           var10001 = var9;
                           if (var1 <= 0L) {
                              break label278;
                           }

                           if (var9 != 0) {
                              break label277;
                           }

                           if (var10000 != 0) {
                              var13 = 3;
                           }
                        }

                        var10000 = var13;
                     }

                     var10001 = var9;
                  }

                  if (var10001 != 0) {
                     break label283;
                  }

                  label346: {
                     label230: {
                        byte var15;
                        switch (var10000) {
                           case 0:
                              var10000 = (int) ((recovery$indy$80(field_43, 4560944790552739554L, var1).field_48M) ? 1 : 0);
                              var10001 = var9;
                              if (var1 >= 0L) {
                                 if (var9 == 0) {
                                    if (var10000 == 0) {
                                       double var10003 = this.field_41[0];
                                       recovery$indy$81(field_43, 4560944790552739554L, var1)
                                          .field_49m
                                          .method_45$631790539f(new C_479J(var10003, this.field_41[1] + 0.3, this.field_41[2], true));
                                       var10003 = this.field_41[0];
                                       recovery$indy$82(field_43, 4560944790552739554L, var1)
                                          .field_49m
                                          .method_45$631790539f(new C_479J(var10003, this.field_41[1] + 0.3, this.field_41[2], false));
                                       this.field_48 = false;
                                       this.field_44 = true;
                                       this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
                                    }

                                    var10000 = (int) ((recovery$indy$83(field_43, 4560944790552739554L, var1).field_48M) ? 1 : 0);
                                 }

                                 var10001 = var9;
                              }

                              if (var10001 != 0) {
                                 break label283;
                              }

                              if (var10000 == 0) {
                                 break label280;
                              }

                              recovery$indy$84(field_43, 4560944790552739554L, var1).method_46f$da8c82d5d4();
                              var15 = var9;
                              if (var1 < 0L) {
                                 break;
                              }

                              if (var9 == 0) {
                                 break label280;
                              }
                           case 1:
                              recovery$indy$85(field_43, 4560944790552739554L, var1)
                                 .method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 0.3, this.field_41[2]);
                              double var24 = this.field_41[0];
                              recovery$indy$86(field_43, 4560944790552739554L, var1)
                                 .field_49m
                                 .method_45$631790539f(new C_479J(var24, this.field_41[1] + 0.3, this.field_41[2], false));
                              this.field_48 = false;
                              var16 = this;
                              if (var1 <= 0L) {
                                 break label281;
                              }

                              this.field_44 = true;
                              var15 = var9;
                              break;
                           case 2:
                              break label230;
                           case 3:
                              break label346;
                           default:
                              break label280;
                        }

                        if (var15 == 0) {
                           break label280;
                        }
                     }

                     this.field_43P = true;
                     recovery$indy$87(field_43, 4560944790552739554L, var1).method_46$a59262c0f0(this.field_41[0], this.field_41[1] + 1.0, this.field_41[2]);
                     this.field_48 = false;
                     var16 = this;
                     if (var1 < 0L) {
                        break label281;
                     }

                     this.field_43a = true;
                     if (var9 == 0) {
                        break label280;
                     }
                  }

                  var10000 = (int) ((recovery$indy$88(field_43, 4560944790552739554L, var1).field_48M) ? 1 : 0);
                  var10001 = var9;
                  if (var1 < 0L) {
                     break label284;
                  }

                  if (var9 != 0) {
                     break label283;
                  }

                  if (var10000 != 0) {
                     recovery$indy$89(field_43, 4560944790552739554L, var1).method_46f$da8c82d5d4();
                     this.field_48 = false;
                     this.field_43v = true;
                     this.field_42 = (int)recovery$indy$90(field_43, 4560944790552739554L, var1).field_48j + 1;
                  }
               }

               var16 = this;
            }

            var10000 = (int) ((recovery$indy$91(var16.settingAutoDisable, 4559233680926336038L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      label348: {
         if (var10001 == 0) {
            if (var10000 == 0) {
               return;
            }

            var17 = this;
            if (var9 != 0) {
               break label348;
            }

            var10000 = (int) ((this.field_44) ? 1 : 0);
         }

         if (var10000 == 0) {
            return;
         }

         var17 = this;
      }

      recovery$indy$92(var17, 4560463713535333747L, var1);
   }








   public void method_43y$e45a9973e5(long var1) {
      this.field_41 = new double[3];
      this.field_48 = false;
      this.field_43P = false;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_41 = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
      this.field_48 = false;
      this.field_44 = false;
      this.field_43P = false;
      this.field_43v = false;
      this.field_43y = 0;
      this.field_43u = false;
      this.field_43a = false;
   }



    public Teleport_47Qx(long a0) {
        super((java.lang.String) ("Teleport"),(java.lang.String) ("Raumreise"),(long) (((augustus.recovered.modules.player.Teleport_47Qx.a ^ a0) ^ 106742242659185L)),(java.awt.Color) (new java.awt.Color((int) (141),(int) (232),(int) (5))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = ((augustus.recovered.modules.player.Teleport_47Qx.a ^ a0) ^ 46870107536316L);
        long constructorKey2 = ((augustus.recovered.modules.player.Teleport_47Qx.a ^ a0) ^ 17799935301482L);
        java.lang.Object initialValue3 = recovery$indy$flow$344(5);
        ((java.lang.Object[]) initialValue3)[0] = "OldKarhu";
        ((java.lang.Object[]) initialValue3)[1] = "OldVulcan";
        ((java.lang.Object[]) initialValue3)[2] = "Vulcan";
        ((java.lang.Object[]) initialValue3)[3] = "VulcanNew";
        ((java.lang.Object[]) initialValue3)[4] = "Vanilla";
        client.setting.ModeSetting initialized4 = new client.setting.ModeSetting(this, "Mode", constructorKey1, "Vulcan", (java.lang.String[]) (initialValue3));
        recovery$indy$flow$346(this, initialized4);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey2, "AutoDisable", true);
        recovery$indy$flow$349(this, initialized5);
        net.C_47cu initialized6 = new net.C_47cu();
        recovery$indy$flow$352(this, initialized6);
        net.C_47cu initialized7 = new net.C_47cu();
        recovery$indy$flow$355(this, initialized7);
        double[] values8 = new double[3];
        recovery$indy$flow$356(this, values8);
        recovery$indy$flow$357(this, false);
        recovery$indy$flow$358(this, false);
        recovery$indy$flow$359(this, 0);
        recovery$indy$flow$360(this, false);
        recovery$indy$flow$361(this, 0);
        recovery$indy$flow$362(this, false);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$81(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$83(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$85(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$87(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$107(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$114(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$119(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$344(int a0);
    private static void recovery$indy$flow$346(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).settingMode = ((client.setting.ModeSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$349(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).settingAutoDisable = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static native void recovery$indy$flow$352(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$355(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$356(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_41 = ((double[]) (a1));
        return;
    }
    private static void recovery$indy$flow$357(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_44 = a1;
        return;
    }
    private static void recovery$indy$flow$358(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$359(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$360(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$361(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$362(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Teleport_47Qx) (a0)).field_43u = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$4(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$8(long var0, long var2);
   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$10(int var0, long var1);
   private static native void recovery$indy$11(Object var0, long var1, boolean var3, long var4, long var6);
   private static native String recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$13(long var0, long var2);
   private static native String recovery$indy$14(int var0, long var1);
   private static native String recovery$indy$15(int var0, long var1);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5, long var7);
   private static native C_475y recovery$indy$17(Object var0, long var1, long var3);
   private static native C_478Q recovery$indy$18(Object var0, long var1, long var3);
   private static native C_478Q recovery$indy$19(Object var0, long var1, long var3);
   private static native void recovery$indy$20(Object var0, Object var1, long var2, long var4);
   private static native C_475y recovery$indy$21(Object var0, long var1, long var3);
   private static native C_478Q recovery$indy$22(Object var0, long var1, long var3);
   private static native C_478Q recovery$indy$23(Object var0, long var1, long var3);
   private static native void recovery$indy$24(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$33(long var0, long var2);
   private static native String recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$35(int var0, long var1);
   private static native boolean recovery$indy$36(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$37(Object var0, float var1, long var2, long var4);
   private static native String recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$39(int var0, long var1);
   private static native void recovery$indy$40(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$41(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$42(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$43(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$44(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$48(long var0, long var2);
   private static native String recovery$indy$49(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$50(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_47oo recovery$indy$51(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$52(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$53(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$54(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$55(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$56(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$57(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$58(Object var0, long var1, long var3);
   private static native void recovery$indy$59(Object var0, long var1, long var3);
   private static native String recovery$indy$60(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$61(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$62(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$63(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$64(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$65(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$66(Object var0, long var1, long var3);
   private static native void recovery$indy$67(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$68(Object var0, long var1, long var3);
   private static native String recovery$indy$69(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$70(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$71(Object var0, long var1, long var3);
   private static native boolean recovery$indy$72(Object var0, long var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$73(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$74(Object var0, long var1, long var3);
   private static native String recovery$indy$75(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$76(int var0, long var1);
   private static native String recovery$indy$77(int var0, long var1);
   private static native String recovery$indy$78(int var0, long var1);
   private static native String recovery$indy$79(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$80(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$81(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$84(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$85(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$86(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$87(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$89(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$90(Object var0, long var1, long var3);
   private static native boolean recovery$indy$91(Object var0, long var1, long var3);
   private static native void recovery$indy$92(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$93();
}
