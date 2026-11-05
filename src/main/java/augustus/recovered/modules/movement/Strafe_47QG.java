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
import net.C_45n;
import net.C_474i;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47Rw;
import client.setting.NumberSetting;
import net.C_47TT;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.minecraft.client.Minecraft;
import net.C_47od;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Strafe_47QG extends client.module.Module implements net.C_47od,net.C_47Vc {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingEvent = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPercentage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStrafeOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTimingOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingHurtTimeStrafeOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStrafeOnAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTiminInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingHurtTimeStrafeInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBackwardsStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

   private void method_46$e45a9973e5(long var1) {
        double var120;
        double var124;
      var1 = a ^ var1;
      long var10001 = var1 ^ 26581874832154L;
      int var3 = (int)((var1 ^ 26581874832154L) >>> 32);
      int var4 = (int)((var1 ^ 26581874832154L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 108891061994292L;
      long var8 = var1 ^ 21015787165751L;
      var10001 = var1 ^ 121005460308117L;
      int var10 = (int)((var1 ^ 121005460308117L) >>> 32);
      int var11 = (int)((var1 ^ 121005460308117L) << 32 >>> 40);
      int var12 = (int)(var10001 << 56 >>> 56);
      long var13 = var1 ^ 52193128337849L;
      long var15 = var1 ^ 13921065315341L;
      var10001 = var1 ^ 79585237810243L;
      int var17 = (int)((var1 ^ 79585237810243L) >>> 32);
      int var18 = (int)((var1 ^ 79585237810243L) << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      byte var20 = ((byte) (Fly_47kE.method_48$aae029aa0a() ? 1 : 0));
      byte var24 = (byte)var12;
      int var25 = var11;
      int var26 = var10;
      Strafe_47QG var27 = this;
      byte var10000 = ((byte) (var27.method_41d$5a0422472c(var26, var25, var24) ? 1 : 0));
      if (var20 != 0) {
         if ((var10000) != 0) {
            if (!net.C_474i.method_45$0dd78e0064(var6)) {
               label479: {
                  label480: {
                     label481: {
                        label426: {
                           label445: {
                              label429: {
                                 label373: {
                                    label372: {
                                       label371: {
                                          label370: {
                                             label369: {
                                                label430: {
                                                   String var44;
                                                   byte var46;
                                                   label431: {
                                                      long var57 = var13;
                                                      client.setting.ModeSetting var58 = this.settingMode;
                                                      var44 = var58.method_46$5f9dc63072(var57);
                                                      var46 = -1;
                                                      switch (var44.hashCode()) {
                                                         case -2099899231:
                                                            if (var44.equals("Intave")) {
                                                               var46 = 2;
                                                            }
                                                            break;
                                                         case -1997372447:
                                                            if (var44.equals("Matrix")) {
                                                               var46 = 1;
                                                               var10000 = var20;
                                                               if (var1 <= 0L) {
                                                                  if (var20 != 0) {
                                                                     var46 = 2;
                                                                  }

                                                                  switch (var46) {
                                                                     case 0:
                                                                        long var63 = var8;
                                                                        client.setting.NumberSetting var69 = this.settingPercentage;
                                                                        recovery$indy$flow$15(
                                                                           var17,
                                                                           (char)var18,
                                                                           (char)var19,
                                                                           (float)(var69.method_44$474dfaa627(var63) / 100.0),
                                                                           1460910864201776486L,
                                                                           var1
                                                                        );
                                                                        var10000 = var20;
                                                                        break label430;
                                                                     case 1:
                                                                        recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                                                        var10000 = var20;
                                                                        break label430;
                                                                     case 2:
                                                                        net.minecraft.client.Minecraft var75 = field_43;
                                                                        if (!var75.field_42P.field_48M) {
                                                                           net.minecraft.client.Minecraft var84 = field_43;
                                                                           net.minecraft.client.entity.EntityPlayerSP var94 = var84.field_42P;
                                                                           long var104 = var15;
                                                                           byte var114 = 0;
                                                                           double[] var51 = net.C_47TT.method_45$f42b969df3(var114, var104, var94);
                                                                           var124 = var51[9];
                                                                           break label479;
                                                                        }

                                                                        return;
                                                                     default:
                                                                        return;
                                                                  }
                                                               }
                                                               break label431;
                                                            }
                                                            break;
                                                         case -1955878649:
                                                            if (var44.equals("Normal")) {
                                                               var46 = 0;
                                                               if (var1 < 0L) {
                                                                  if (var20 != 0) {
                                                                     var46 = 1;
                                                                     if (var20 != 0) {
                                                                        var46 = 2;
                                                                     }
                                                                  }

                                                                  switch (var46) {
                                                                     case 0:
                                                                        long var61 = var8;
                                                                        client.setting.NumberSetting var67 = this.settingPercentage;
                                                                        recovery$indy$flow$15(
                                                                           var17,
                                                                           (char)var18,
                                                                           (char)var19,
                                                                           (float)(var67.method_44$474dfaa627(var61) / 100.0),
                                                                           1460910864201776486L,
                                                                           var1
                                                                        );
                                                                        var10000 = var20;
                                                                        break label426;
                                                                     case 1:
                                                                        recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                                                        var10000 = var20;
                                                                        break label426;
                                                                     case 2:
                                                                        net.minecraft.client.Minecraft var74 = field_43;
                                                                        var10000 = ((byte) (var74.field_42P.field_48M ? 1 : 0));
                                                                        break label426;
                                                                     default:
                                                                        return;
                                                                  }
                                                               }

                                                               if (var20 == 0 && var44.equals("Matrix")) {
                                                                  var46 = 1;
                                                                  var10000 = var20;
                                                                  if (var1 <= 0L) {
                                                                     if (var20 != 0) {
                                                                        var46 = 2;
                                                                     }

                                                                     switch (var46) {
                                                                        case 0:
                                                                           long var60 = var8;
                                                                           client.setting.NumberSetting var66 = this.settingPercentage;
                                                                           recovery$indy$flow$15(
                                                                              var17,
                                                                              (char)var18,
                                                                              (char)var19,
                                                                              (float)(var66.method_44$474dfaa627(var60) / 100.0),
                                                                              1460910864201776486L,
                                                                              var1
                                                                           );
                                                                           var10000 = var20;
                                                                           break label372;
                                                                        case 1:
                                                                           recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                                                           var10000 = var20;
                                                                           break label372;
                                                                        case 2:
                                                                           break label445;
                                                                        default:
                                                                           return;
                                                                     }
                                                                  }
                                                                  break label431;
                                                               }

                                                               switch (var46) {
                                                                  case 0:
                                                                     long var59 = var8;
                                                                     client.setting.NumberSetting var65 = this.settingPercentage;
                                                                     recovery$indy$flow$15(
                                                                        var17,
                                                                        (char)var18,
                                                                        (char)var19,
                                                                        (float)(var65.method_44$474dfaa627(var59) / 100.0),
                                                                        1460910864201776486L,
                                                                        var1
                                                                     );
                                                                     var10000 = var20;
                                                                     if (var1 <= 0L) {
                                                                        break label372;
                                                                     }
                                                                     break label369;
                                                                  case 1:
                                                                     recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                                                     var10000 = var20;
                                                                     break label370;
                                                                  case 2:
                                                                     break label373;
                                                                  default:
                                                                     return;
                                                               }
                                                            }
                                                      }

                                                      switch (var46) {
                                                         case 0:
                                                            long var64 = var8;
                                                            client.setting.NumberSetting var70 = this.settingPercentage;
                                                            recovery$indy$flow$15(
                                                               var17,
                                                               (char)var18,
                                                               (char)var19,
                                                               (float)(var70.method_44$474dfaa627(var64) / 100.0),
                                                               1460910864201776486L,
                                                               var1
                                                            );
                                                            var10000 = var20;
                                                            if (var1 > 0L) {
                                                               break label369;
                                                            }
                                                            break label430;
                                                         case 1:
                                                            recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                                            var10000 = var20;
                                                            if (var1 < 0L) {
                                                               break label426;
                                                            }
                                                            break label370;
                                                         case 2:
                                                            net.minecraft.client.Minecraft var76 = field_43;
                                                            if (!var76.field_42P.field_48M) {
                                                               net.minecraft.client.Minecraft var85 = field_43;
                                                               net.minecraft.client.entity.EntityPlayerSP var95 = var85.field_42P;
                                                               long var105 = var15;
                                                               byte var115 = 0;
                                                               double[] var52 = net.C_47TT.method_45$f42b969df3(var115, var105, var95);
                                                               var124 = var52[9];
                                                               if (var1 <= 0L) {
                                                                  break label479;
                                                               }
                                                               break label481;
                                                            }

                                                            return;
                                                         default:
                                                            return;
                                                      }
                                                   }

                                                   if (var10000 == 0 && var44.equals("Intave")) {
                                                      var46 = 2;
                                                   }

                                                   switch (var46) {
                                                      case 0:
                                                         long var62 = var8;
                                                         client.setting.NumberSetting var68 = this.settingPercentage;
                                                         recovery$indy$flow$15(
                                                            var17,
                                                            (char)var18,
                                                            (char)var19,
                                                            (float)(var68.method_44$474dfaa627(var62) / 100.0),
                                                            1460910864201776486L,
                                                            var1
                                                         );
                                                         var10000 = var20;
                                                         break label369;
                                                      case 1:
                                                         break label371;
                                                      case 2:
                                                         break label429;
                                                      default:
                                                         return;
                                                   }
                                                }

                                                if (var1 < 0L) {
                                                   break label426;
                                                }
                                                break label372;
                                             }

                                             if (var10000 != 0) {
                                                return;
                                             }
                                             break label371;
                                          }

                                          if (var10000 != 0) {
                                             return;
                                          }
                                          break label373;
                                       }

                                       recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                                       if (var20 != 0) {
                                          return;
                                       }
                                       break label429;
                                    }

                                    if (var10000 != 0) {
                                       return;
                                    }
                                    break label445;
                                 }

                                 net.minecraft.client.Minecraft var77 = field_43;
                                 if (var77.field_42P.field_48M) {
                                    return;
                                 }

                                 net.minecraft.client.Minecraft var86 = field_43;
                                 net.minecraft.client.entity.EntityPlayerSP var96 = var86.field_42P;
                                 long var106 = var15;
                                 byte var116 = 0;
                                 double[] var53 = net.C_47TT.method_45$f42b969df3(var116, var106, var96);
                                 var124 = var53[9];
                                 if (var1 <= 0L) {
                                    break label480;
                                 }
                                 break label481;
                              }

                              net.minecraft.client.Minecraft var79 = field_43;
                              if (var79.field_42P.field_48M) {
                                 return;
                              }

                              net.minecraft.client.Minecraft var89 = field_43;
                              net.minecraft.client.entity.EntityPlayerSP var99 = var89.field_42P;
                              long var109 = var15;
                              byte var119 = 0;
                              double[] var56 = net.C_47TT.method_45$f42b969df3(var119, var109, var99);
                              var124 = var56[9];
                              break label481;
                           }

                           net.minecraft.client.Minecraft var78 = field_43;
                           if (var78.field_42P.field_48M) {
                              return;
                           }

                           net.minecraft.client.Minecraft var87 = field_43;
                           net.minecraft.client.entity.EntityPlayerSP var97 = var87.field_42P;
                           long var107 = var15;
                           byte var117 = 0;
                           double[] var54 = net.C_47TT.method_45$f42b969df3(var117, var107, var97);
                           var124 = var54[9];
                           break label480;
                        }

                        if (var10000 == 0) {
                           net.minecraft.client.Minecraft var88 = field_43;
                           net.minecraft.client.entity.EntityPlayerSP var98 = var88.field_42P;
                           long var108 = var15;
                           byte var118 = 0;
                           double[] var55 = net.C_47TT.method_45$f42b969df3(var118, var108, var98);
                           recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var55[9], 1460910864201776486L, var1);
                        }

                        return;
                     }

                     if (var124 == 1.0) {
                        long var40 = var8;
                        client.setting.NumberSetting var42 = this.settingPercentage;
                        recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)(var42.method_44$474dfaa627(var40) / 100.0), 1460910864201776486L, var1);
                     }

                     return;
                  }

                  recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var124, 1460910864201776486L, var1);
                  return;
               }

               recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var124, 1460910864201776486L, var1);
            }
         }
      } else if (!(var10000 != 0)) {
         label483: {
            label484: {
               long var28 = var13;
               client.setting.ModeSetting var30 = this.settingMode;
               String var21 = var30.method_46$5f9dc63072(var28);
               switch (var21.hashCode()) {
                  case 0:
                     long var31 = var8;
                     client.setting.NumberSetting var33 = this.settingPercentage;
                     recovery$indy$flow$15(var17, (char)var18, (char)var19, (float)(var33.method_44$474dfaa627(var31) / 100.0), 1460910864201776486L, var1);
                     var10000 = var20;
                     if (var1 > 0L) {
                        if (var20 != 0) {
                           return;
                        }

                        recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                        if (var20 != 0) {
                           return;
                        }

                        net.minecraft.client.Minecraft var73 = field_43;
                        net.minecraft.client.Minecraft var83 = field_43;
                        net.minecraft.client.entity.EntityPlayerSP var93 = var83.field_42P;
                        long var103 = var15;
                        byte var113 = ((byte) (var73.field_42P.field_48M ? 1 : 0));
                        double[] var50 = net.C_47TT.method_45$f42b969df3(var113, var103, var93);
                        var120 = var50[9];
                        break label484;
                     }

                     if (var1 < 0L) {
                        break label483;
                     }

                     if (var20 != 0) {
                        return;
                     }

                     net.minecraft.client.Minecraft var72 = field_43;
                     net.minecraft.client.Minecraft var81 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var91 = var81.field_42P;
                     long var101 = var15;
                     byte var111 = ((byte) (var72.field_42P.field_48M ? 1 : 0));
                     double[] var48 = net.C_47TT.method_45$f42b969df3(var111, var101, var91);
                     var120 = var48[9];
                     break;
                  case 1:
                     recovery$indy$flow$16(var3, var4, (char)var5, 1460395057589729183L, var1);
                     var10000 = var20;
                     if (var1 < 0L) {
                        break label483;
                     }

                     if (var20 != 0) {
                        return;
                     }

                     net.minecraft.client.Minecraft var71 = field_43;
                     net.minecraft.client.Minecraft var80 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var90 = var80.field_42P;
                     long var100 = var15;
                     byte var110 = ((byte) (var71.field_42P.field_48M ? 1 : 0));
                     double[] var47 = net.C_47TT.method_45$f42b969df3(var110, var100, var90);
                     var120 = var47[9];
                     if (var1 > 0L) {
                        break label484;
                     }
                     break;
                  case 2:
                     net.minecraft.client.Minecraft var34 = field_43;
                     net.minecraft.client.Minecraft var35 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var36 = var35.field_42P;
                     long var37 = var15;
                     byte var39 = ((byte) (var34.field_42P.field_48M ? 1 : 0));
                     double[] var23 = net.C_47TT.method_45$f42b969df3(var39, var37, var36);
                     var120 = var23[9];
                     if (var1 <= 0L) {
                        recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var120, 1460910864201776486L, var1);
                        return;
                     }
                     break label484;
                  default:
                     return;
               }

               recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var120, 1460910864201776486L, var1);
               return;
            }

            recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)(var120 / 1.0), 1460910864201776486L, var1);
            return;
         }

         net.minecraft.client.Minecraft var82 = field_43;
         net.minecraft.client.entity.EntityPlayerSP var92 = var82.field_42P;
         long var102 = var15;
         byte var112 = var10000;
         double[] var49 = net.C_47TT.method_45$f42b969df3(var112, var102, var92);
         recovery$indy$flow$29(var17, (char)var18, (char)var19, (float)var49[9], 1460910864201776486L, var1);
      }
   }





   private static double method_46$474dfaa627(long var0) {
      var0 = a ^ var0;
      long var2 = var0 ^ 5693194686857L;
      byte var4 = (byte) ((recovery$indy$4(-2638864955387822962L, var0)) ? 1 : 0);
      float var5 = recovery$indy$5(var2, -2637100059847675316L, var0);
      float var10000 = recovery$indy$6(field_43, -2637054931672795415L, var0).field_43I;
      if (var4 != 0) {
         label52: {
            float var11;
            int var8 = (var11 = var10000 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var0 > 0L) {
               if (var8 >= 0) {
                  break label52;
               }

               var5 += 180.0F;
               var8 = var4;
            }

            if (var8 != 0) {
               return Math.toRadians(var5);
            }
         }

         var10000 = 1.0F;
      }

      float var6 = var10000;
      float var12;
      int var9 = (var12 = recovery$indy$7(field_43, -2637054931672795415L, var0).field_43I - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      byte var10001 = var4;
      if (var0 > 0L) {
         if (var4 != 0) {
            if (var9 > 0) {
               var6 = 0.5F;
            }

            float var13;
            var9 = (var13 = recovery$indy$8(field_43, -2637054931672795415L, var0).field_47z - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         }

         var10001 = var4;
      }

      if (var10001 != 0) {
         if (var9 > 0) {
            var5 -= 90.0F * var6;
         }

         var10000 = recovery$indy$9(field_43, -2637054931672795415L, var0).field_47z;
         if (var4 == 0) {
            return Math.toRadians(var10000);
         }

         float var14;
         var9 = (var14 = var10000 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      if (var9 < 0) {
         var5 += 90.0F * var6;
      }

      return Math.toRadians(var5);
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_40$464505d199(net.C_47Rw var1, long var2, boolean var4) {
        int var361;
        int var362;
        int var363;
        int var365;
        int var371;
        int var372;
        int var373;
        int var374;
        int var376;
        int var378;
        int var384;
        int var386;
        int var430;
        int var435;
        int var442;
      var2 = a ^ var2;
      long var5 = var2 ^ 13956118111171L;
      long var7 = var2 ^ 140405248169058L;
      long var9 = var2 ^ 44897261965219L;
      long var11 = var2 ^ 74593157619180L;
      long var13 = var2 ^ 105583085707352L;
      long var15 = var2 ^ 92776469067104L;
      long var10001 = 6346959163118016361L;
      net.C_47Rw var38 = var1;
      double var18 = var38.method_44$fedcb3e4d3();
      long var10000 = 6346221982215346841L;
      byte var358 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      long var10002 = 6346885666773758376L;
      net.C_47Rw var39 = var1;
      double var20 = var39.method_47$fedcb3e4d3();
      double var22 = Math.sqrt(var18 * var18 + var20 * var20);
      byte var17 = var358;
      var10002 = 6347160195006037302L;
      long var40 = var11;
      client.setting.ModeSetting var42 = this.settingMode;
      String var24 = var42.method_46$5f9dc63072(var40);
      byte var25 = -1;
      int var359 = var24.hashCode();
      if (var17 == 0) {
         label1314: {
            label1315: {
               label1192: {
                  label1193: {
                     label1194: {
                        label1241: {
                           label1029: {
                              label1242: {
                                 label1233: {
                                    label1024: {
                                       label1198: {
                                          label1199: {
                                             label1200: {
                                                label1201: {
                                                   label1202: {
                                                      label1203: {
                                                         label1017: {
                                                            label1016: {
                                                               label1204: {
                                                                  label1205: {
                                                                     label1206: {
                                                                        label1012: {
                                                                           label1011: {
                                                                              label1010: {
                                                                                 label1009: {
                                                                                    label1207: {
                                                                                       label1208: {
                                                                                          label1006: {
                                                                                             label1209: {
                                                                                                switch (var359) {
                                                                                                   case -2099899231:
                                                                                                      if (!var24.equals("Intave")) {
                                                                                                         break label1208;
                                                                                                      }

                                                                                                      var25 = 1;
                                                                                                      var372 = var17;
                                                                                                      if (var2 < 0L) {
                                                                                                         break label1016;
                                                                                                      }

                                                                                                      if (var17 == 0) {
                                                                                                         break label1209;
                                                                                                      }

                                                                                                      var372 = ((var24.equals("Matrix")) ? 1 : 0);
                                                                                                      var435 = var17;
                                                                                                      long var612;
                                                                                                      int var542 = (var612 = var2 - 0L) == 0L
                                                                                                         ? 0
                                                                                                         : (var612 < 0L ? -1 : 1);
                                                                                                      break;
                                                                                                   case -1997372447:
                                                                                                      var372 = ((var24.equals("Matrix")) ? 1 : 0);
                                                                                                      var435 = var17;
                                                                                                      if (var2 < 0L) {
                                                                                                         break label1017;
                                                                                                      }
                                                                                                      break;
                                                                                                   case -1955878649:
                                                                                                      if (var24.equals("Normal")) {
                                                                                                         var25 = 0;
                                                                                                         if (var2 > 0L) {
                                                                                                            label928: {
                                                                                                               if (var17 != 0 && var24.equals("Intave")) {
                                                                                                                  var25 = 1;
                                                                                                                  long var605;
                                                                                                                  int var433 = (var605 = var2 - 0L) == 0L
                                                                                                                     ? 0
                                                                                                                     : (var605 < 0L ? -1 : 1);
                                                                                                                  if (var17 != 0) {
                                                                                                                     var374 = ((var24.equals("Matrix")) ? 1 : 0);
                                                                                                                     long var606;
                                                                                                                     int var538 = (var606 = var2 - 0L) == 0L
                                                                                                                        ? 0
                                                                                                                        : (var606 < 0L ? -1 : 1);
                                                                                                                     if (var17 != 0) {
                                                                                                                        break label928;
                                                                                                                     }

                                                                                                                     if (var374 != 0) {
                                                                                                                        var25 = 2;
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var374 = var25;
                                                                                                            }

                                                                                                            if (var17 == 0) {
                                                                                                               switch (var374) {
                                                                                                                  case 0:
                                                                                                                     var374 = ((recovery$indy$flow$60(
                                                                                                                        var15, 6346601274495627412L, var2
                                                                                                                     )) ? 1 : 0);
                                                                                                                     break;
                                                                                                                  case 1:
                                                                                                                     break label1198;
                                                                                                                  case 2:
                                                                                                                     break label1241;
                                                                                                                  default:
                                                                                                                     return;
                                                                                                               }
                                                                                                            }

                                                                                                            if (var374 == 0) {
                                                                                                               return;
                                                                                                            }

                                                                                                            var10002 = 6349794869706810243L;
                                                                                                            long var204 = var7;
                                                                                                            client.setting.NumberSetting var210 = this.settingPercentage;
                                                                                                            float var117 = (float)(
                                                                                                               var210.method_44$474dfaa627(var204) / 100.0
                                                                                                            );
                                                                                                            double var135 = var22 * var117;
                                                                                                            double var152 = 1.0F - var117;
                                                                                                            double var165 = var18 * var152;
                                                                                                            double var178 = var20 * var152;
                                                                                                            double var191 = recovery$indy$flow$64(
                                                                                                               var5, 6347207092018641424L, var2
                                                                                                            );
                                                                                                            var18 = var165 - Math.sin(var191) * var135;
                                                                                                            var20 = var178 + Math.cos(var191) * var135;
                                                                                                            var10002 = 6346761413822667994L;
                                                                                                            double var216 = var18;
                                                                                                            net.C_47Rw var222 = var1;
                                                                                                            var222.method_42$2c20cf5948(var216);
                                                                                                            var10002 = 6346779935113474272L;
                                                                                                            double var228 = var20;
                                                                                                            net.C_47Rw var234 = var1;
                                                                                                            var234.method_40$2c20cf5948(var228);
                                                                                                            var371 = var17;
                                                                                                            long var607;
                                                                                                            int var434 = (var607 = var2 - 0L) == 0L
                                                                                                               ? 0
                                                                                                               : (var607 < 0L ? -1 : 1);
                                                                                                            break label1203;
                                                                                                         }

                                                                                                         if (var17 != 0) {
                                                                                                            var25 = 1;
                                                                                                            var372 = var17;
                                                                                                            if (var2 < 0L) {
                                                                                                               break label1016;
                                                                                                            }

                                                                                                            label984: {
                                                                                                               if (var17 != 0) {
                                                                                                                  var373 = ((var24.equals("Matrix")) ? 1 : 0);
                                                                                                                  long var608;
                                                                                                                  int var534 = (var608 = var2 - 0L) == 0L
                                                                                                                     ? 0
                                                                                                                     : (var608 < 0L ? -1 : 1);
                                                                                                                  if (var17 != 0) {
                                                                                                                     break label984;
                                                                                                                  }

                                                                                                                  if (var373 != 0) {
                                                                                                                     var25 = 2;
                                                                                                                  }
                                                                                                               }

                                                                                                               var373 = var25;
                                                                                                            }

                                                                                                            if (var17 == 0) {
                                                                                                               switch (var373) {
                                                                                                                  case 0:
                                                                                                                     var373 = ((recovery$indy$flow$60(
                                                                                                                        var15, 6346601274495627412L, var2
                                                                                                                     )) ? 1 : 0);
                                                                                                                     break;
                                                                                                                  case 1:
                                                                                                                     break label1011;
                                                                                                                  case 2:
                                                                                                                     break label1242;
                                                                                                                  default:
                                                                                                                     return;
                                                                                                               }
                                                                                                            }

                                                                                                            if (var373 == 0) {
                                                                                                               return;
                                                                                                            }

                                                                                                            var10002 = 6349794869706810243L;
                                                                                                            long var203 = var7;
                                                                                                            client.setting.NumberSetting var209 = this.settingPercentage;
                                                                                                            float var116 = (float)(
                                                                                                               var209.method_44$474dfaa627(var203) / 100.0
                                                                                                            );
                                                                                                            double var134 = var22 * var116;
                                                                                                            double var151 = 1.0F - var116;
                                                                                                            double var164 = var18 * var151;
                                                                                                            double var177 = var20 * var151;
                                                                                                            double var190 = recovery$indy$flow$64(
                                                                                                               var5, 6347207092018641424L, var2
                                                                                                            );
                                                                                                            var18 = var164 - Math.sin(var190) * var134;
                                                                                                            var20 = var177 + Math.cos(var190) * var134;
                                                                                                            var10002 = 6346761413822667994L;
                                                                                                            double var215 = var18;
                                                                                                            net.C_47Rw var221 = var1;
                                                                                                            var221.method_42$2c20cf5948(var215);
                                                                                                            var10002 = 6346779935113474272L;
                                                                                                            double var227 = var20;
                                                                                                            net.C_47Rw var233 = var1;
                                                                                                            var233.method_40$2c20cf5948(var227);
                                                                                                            var371 = var17;
                                                                                                            long var609;
                                                                                                            int var432 = (var609 = var2 - 0L) == 0L
                                                                                                               ? 0
                                                                                                               : (var609 < 0L ? -1 : 1);
                                                                                                            break label1009;
                                                                                                         }

                                                                                                         byte var369 = var25;
                                                                                                         if (var17 == 0) {
                                                                                                            switch (var25) {
                                                                                                               case 0:
                                                                                                                  var369 = ((byte) (recovery$indy$flow$60(
                                                                                                                     var15, 6346601274495627412L, var2
                                                                                                                  ) ? 1 : 0));
                                                                                                                  break;
                                                                                                               case 1:
                                                                                                                  var371 = ((recovery$indy$flow$79(
                                                                                                                     var15, 6346601274495627412L, var2
                                                                                                                  )) ? 1 : 0);
                                                                                                                  var430 = var17;
                                                                                                                  long var610;
                                                                                                                  int var530 = (var610 = var2 - 0L) == 0L
                                                                                                                     ? 0
                                                                                                                     : (var610 < 0L ? -1 : 1);
                                                                                                                  break label1206;
                                                                                                               case 2:
                                                                                                                  var10000 = var15;
                                                                                                                  var10001 = 6346601274495627412L;
                                                                                                                  var10002 = var2;
                                                                                                                  if (var2 < 0L) {
                                                                                                                     break label1315;
                                                                                                                  }
                                                                                                                  break label1194;
                                                                                                               default:
                                                                                                                  return;
                                                                                                            }
                                                                                                         }

                                                                                                         if (var369 == 0) {
                                                                                                            return;
                                                                                                         }

                                                                                                         var10002 = 6349794869706810243L;
                                                                                                         long var202 = var7;
                                                                                                         client.setting.NumberSetting var208 = this.settingPercentage;
                                                                                                         float var115 = (float)(
                                                                                                            var208.method_44$474dfaa627(var202) / 100.0
                                                                                                         );
                                                                                                         double var133 = var22 * var115;
                                                                                                         double var150 = 1.0F - var115;
                                                                                                         double var163 = var18 * var150;
                                                                                                         double var176 = var20 * var150;
                                                                                                         double var189 = recovery$indy$flow$64(
                                                                                                            var5, 6347207092018641424L, var2
                                                                                                         );
                                                                                                         var18 = var163 - Math.sin(var189) * var133;
                                                                                                         var20 = var176 + Math.cos(var189) * var133;
                                                                                                         var10002 = 6346761413822667994L;
                                                                                                         double var214 = var18;
                                                                                                         net.C_47Rw var220 = var1;
                                                                                                         var220.method_42$2c20cf5948(var214);
                                                                                                         var10002 = 6346779935113474272L;
                                                                                                         double var226 = var20;
                                                                                                         net.C_47Rw var232 = var1;
                                                                                                         var232.method_40$2c20cf5948(var226);
                                                                                                         var371 = var17;
                                                                                                         long var611;
                                                                                                         int var431 = (var611 = var2 - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var611 < 0L ? -1 : 1);
                                                                                                         break label1207;
                                                                                                      }
                                                                                                   default:
                                                                                                      break label1208;
                                                                                                }

                                                                                                if (var435 != 0) {
                                                                                                   break label1006;
                                                                                                }

                                                                                                if (var372 != 0) {
                                                                                                   var25 = 2;
                                                                                                }
                                                                                             }

                                                                                             var372 = var25;
                                                                                          }

                                                                                          if (var17 == 0) {
                                                                                             switch (var372) {
                                                                                                case 0:
                                                                                                   var372 = ((recovery$indy$flow$60(
                                                                                                      var15, 6346601274495627412L, var2
                                                                                                   )) ? 1 : 0);
                                                                                                   break;
                                                                                                case 1:
                                                                                                   var371 = ((recovery$indy$flow$79(
                                                                                                      var15, 6346601274495627412L, var2
                                                                                                   )) ? 1 : 0);
                                                                                                   var430 = var17;
                                                                                                   if (var2 > 0L) {
                                                                                                      break label1024;
                                                                                                   }
                                                                                                   break label1012;
                                                                                                case 2:
                                                                                                   var10000 = var15;
                                                                                                   var10001 = 6346601274495627412L;
                                                                                                   var10002 = var2;
                                                                                                   long var654;
                                                                                                   int var597 = (var654 = var2 - 0L) == 0L
                                                                                                      ? 0
                                                                                                      : (var654 < 0L ? -1 : 1);
                                                                                                   break label1029;
                                                                                                default:
                                                                                                   return;
                                                                                             }
                                                                                          }

                                                                                          if (var372 == 0) {
                                                                                             return;
                                                                                          }

                                                                                          var10002 = 6349794869706810243L;
                                                                                          long var205 = var7;
                                                                                          client.setting.NumberSetting var211 = this.settingPercentage;
                                                                                          float var118 = (float)(var211.method_44$474dfaa627(var205) / 100.0);
                                                                                          double var136 = var22 * var118;
                                                                                          double var153 = 1.0F - var118;
                                                                                          double var166 = var18 * var153;
                                                                                          double var179 = var20 * var153;
                                                                                          double var192 = recovery$indy$flow$64(
                                                                                             var5, 6347207092018641424L, var2
                                                                                          );
                                                                                          var18 = var166 - Math.sin(var192) * var136;
                                                                                          var20 = var179 + Math.cos(var192) * var136;
                                                                                          var10002 = 6346761413822667994L;
                                                                                          double var217 = var18;
                                                                                          net.C_47Rw var223 = var1;
                                                                                          var223.method_42$2c20cf5948(var217);
                                                                                          var10002 = 6346779935113474272L;
                                                                                          double var229 = var20;
                                                                                          net.C_47Rw var235 = var1;
                                                                                          var235.method_40$2c20cf5948(var229);
                                                                                          var371 = var17;
                                                                                          if (var2 > 0L) {
                                                                                             break label1203;
                                                                                          }
                                                                                          break label1009;
                                                                                       }

                                                                                       byte var375 = var25;
                                                                                       if (var17 == 0) {
                                                                                          switch (var25) {
                                                                                             case 0:
                                                                                                var375 = ((byte) (recovery$indy$flow$60(
                                                                                                   var15, 6346601274495627412L, var2
                                                                                                ) ? 1 : 0));
                                                                                                break;
                                                                                             case 1:
                                                                                                var371 = ((recovery$indy$flow$79(
                                                                                                   var15, 6346601274495627412L, var2
                                                                                                )) ? 1 : 0);
                                                                                                var430 = var17;
                                                                                                if (var2 > 0L) {
                                                                                                   break label1024;
                                                                                                }
                                                                                                break label1206;
                                                                                             case 2:
                                                                                                var10000 = var15;
                                                                                                var10001 = 6346601274495627412L;
                                                                                                var10002 = var2;
                                                                                                if (var2 < 0L) {
                                                                                                   break label1315;
                                                                                                }
                                                                                                break label1029;
                                                                                             default:
                                                                                                return;
                                                                                          }
                                                                                       }

                                                                                       if (var375 == 0) {
                                                                                          return;
                                                                                       }

                                                                                       var10002 = 6349794869706810243L;
                                                                                       long var207 = var7;
                                                                                       client.setting.NumberSetting var213 = this.settingPercentage;
                                                                                       float var122 = (float)(var213.method_44$474dfaa627(var207) / 100.0);
                                                                                       double var139 = var22 * var122;
                                                                                       double var155 = 1.0F - var122;
                                                                                       double var168 = var18 * var155;
                                                                                       double var181 = var20 * var155;
                                                                                       double var194 = recovery$indy$flow$64(var5, 6347207092018641424L, var2);
                                                                                       var18 = var168 - Math.sin(var194) * var139;
                                                                                       var20 = var181 + Math.cos(var194) * var139;
                                                                                       var10002 = 6346761413822667994L;
                                                                                       double var219 = var18;
                                                                                       net.C_47Rw var225 = var1;
                                                                                       var225.method_42$2c20cf5948(var219);
                                                                                       var10002 = 6346779935113474272L;
                                                                                       double var231 = var20;
                                                                                       net.C_47Rw var237 = var1;
                                                                                       var237.method_40$2c20cf5948(var231);
                                                                                       var371 = var17;
                                                                                       if (var2 > 0L) {
                                                                                          break label1203;
                                                                                       }
                                                                                    }

                                                                                    long var613;
                                                                                    int var445 = (var613 = var2 - 0L) == 0L ? 0 : (var613 < 0L ? -1 : 1);
                                                                                    if (var2 < 0L) {
                                                                                       break label1200;
                                                                                    }
                                                                                    break label1010;
                                                                                 }

                                                                                 long var614;
                                                                                 int var436 = (var614 = var2 - 0L) == 0L ? 0 : (var614 < 0L ? -1 : 1);
                                                                                 long var615;
                                                                                 int var437 = (var615 = var2 - 0L) == 0L ? 0 : (var615 < 0L ? -1 : 1);
                                                                              }

                                                                              if (var371 == 0) {
                                                                                 return;
                                                                              }
                                                                           }

                                                                           var371 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                                                           var430 = var17;
                                                                           long var616;
                                                                           int var561 = (var616 = var2 - 0L) == 0L ? 0 : (var616 < 0L ? -1 : 1);
                                                                        }

                                                                        long var617;
                                                                        int var562 = (var617 = var2 - 0L) == 0L ? 0 : (var617 < 0L ? -1 : 1);
                                                                        if (var430 != 0) {
                                                                           break label1201;
                                                                        }

                                                                        if (var371 != 0) {
                                                                           break label1204;
                                                                        }

                                                                        var10001 = 6345596237522025016L;
                                                                        net.minecraft.client.Minecraft var246 = field_43;
                                                                        var371 = ((var246.field_44r.field_42b.field_45) ? 1 : 0);
                                                                        var442 = var17;
                                                                        long var618;
                                                                        int var563 = (var618 = var2 - 0L) == 0L ? 0 : (var618 < 0L ? -1 : 1);
                                                                        break label1205;
                                                                     }

                                                                     long var619;
                                                                     int var552 = (var619 = var2 - 0L) == 0L ? 0 : (var619 < 0L ? -1 : 1);
                                                                     if (var430 != 0) {
                                                                        break label1202;
                                                                     }

                                                                     if (var371 != 0) {
                                                                        var10001 = 6347050158392276379L;
                                                                        net.minecraft.client.Minecraft var252 = field_43;
                                                                        var371 = var252.field_42P.field_432;
                                                                        break label1202;
                                                                     }

                                                                     var10001 = 6345596237522025016L;
                                                                     net.minecraft.client.Minecraft var245 = field_43;
                                                                     var371 = ((var245.field_44r.field_42b.field_45) ? 1 : 0);
                                                                     var442 = var17;
                                                                     if (var2 < 0L) {
                                                                        break label1233;
                                                                     }
                                                                  }

                                                                  if (var442 != 0) {
                                                                     break label1201;
                                                                  }

                                                                  if (var371 == 0) {
                                                                     return;
                                                                  }
                                                               }

                                                               var10001 = 6347050158392276379L;
                                                               net.minecraft.client.Minecraft var253 = field_43;
                                                               var371 = var253.field_42P.field_432;
                                                               break label1201;
                                                            }

                                                            var435 = var17;
                                                            long var620;
                                                            int var546 = (var620 = var2 - 0L) == 0L ? 0 : (var620 < 0L ? -1 : 1);
                                                         }

                                                         if (var435 == 0) {
                                                            switch (var372) {
                                                               case 0:
                                                                  var372 = ((recovery$indy$flow$60(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                                                  break;
                                                               case 1:
                                                                  var371 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                                                  break label1200;
                                                               case 2:
                                                                  var10000 = var15;
                                                                  var10001 = 6346601274495627412L;
                                                                  var10002 = var2;
                                                                  long var660;
                                                                  int var598 = (var660 = var2 - 0L) == 0L ? 0 : (var660 < 0L ? -1 : 1);
                                                                  break label1315;
                                                               default:
                                                                  return;
                                                            }
                                                         }

                                                         if (var372 == 0) {
                                                            return;
                                                         }

                                                         var10002 = 6349794869706810243L;
                                                         long var206 = var7;
                                                         client.setting.NumberSetting var212 = this.settingPercentage;
                                                         float var119 = (float)(var212.method_44$474dfaa627(var206) / 100.0);
                                                         double var137 = var22 * var119;
                                                         double var154 = 1.0F - var119;
                                                         double var167 = var18 * var154;
                                                         double var180 = var20 * var154;
                                                         double var193 = recovery$indy$flow$64(var5, 6347207092018641424L, var2);
                                                         var18 = var167 - Math.sin(var193) * var137;
                                                         var20 = var180 + Math.cos(var193) * var137;
                                                         var10002 = 6346761413822667994L;
                                                         double var218 = var18;
                                                         net.C_47Rw var224 = var1;
                                                         var224.method_42$2c20cf5948(var218);
                                                         var10002 = 6346779935113474272L;
                                                         double var230 = var20;
                                                         net.C_47Rw var236 = var1;
                                                         var236.method_40$2c20cf5948(var230);
                                                         var371 = var17;
                                                         long var621;
                                                         int var438 = (var621 = var2 - 0L) == 0L ? 0 : (var621 < 0L ? -1 : 1);
                                                         long var622;
                                                         int var439 = (var622 = var2 - 0L) == 0L ? 0 : (var622 < 0L ? -1 : 1);
                                                         long var623;
                                                         int var440 = (var623 = var2 - 0L) == 0L ? 0 : (var623 < 0L ? -1 : 1);
                                                         break label1200;
                                                      }

                                                      label904: {
                                                         if (var371 == 0) {
                                                            long var624;
                                                            int var466 = (var624 = var2 - 0L) == 0L ? 0 : (var624 < 0L ? -1 : 1);
                                                            if (!var4) {
                                                               break label904;
                                                            }

                                                            var10001 = 6347050158392276379L;
                                                            net.minecraft.client.Minecraft var238 = field_43;
                                                            var238.field_42P.field_48s = var18;
                                                         }

                                                         var10001 = 6347050158392276379L;
                                                         net.minecraft.client.Minecraft var239 = field_43;
                                                         var239.field_42P.field_487 = var20;
                                                      }

                                                      long var625;
                                                      int var469 = (var625 = var2 - 0L) == 0L ? 0 : (var625 < 0L ? -1 : 1);
                                                      if (var17 == 0) {
                                                         return;
                                                      }
                                                      break label1198;
                                                   }

                                                   long var626;
                                                   int var553 = (var626 = var2 - 0L) == 0L ? 0 : (var626 < 0L ? -1 : 1);
                                                   long var627;
                                                   int var554 = (var627 = var2 - 0L) == 0L ? 0 : (var627 < 0L ? -1 : 1);
                                                   if (var17 == 0) {
                                                      if (var371 != 0) {
                                                         return;
                                                      }

                                                      var371 = 0;
                                                   }

                                                   var10002 = 6347050158392276379L;
                                                   net.minecraft.client.Minecraft var261 = field_43;
                                                   long var599 = 6346660000975910208L;
                                                   net.minecraft.client.entity.EntityPlayerSP var268 = var261.field_42P;
                                                   long var275 = var13;
                                                   int var282 = var371;
                                                   double[] var121 = net.C_47TT.method_45$f42b969df3(var282, var275, var268);
                                                   double var377 = var121[9];
                                                   long var628;
                                                   int var444 = (var628 = var2 - 0L) == 0L ? 0 : (var628 < 0L ? -1 : 1);
                                                   float var138 = (float)var377;
                                                   double var146 = var22 * var138;
                                                   double var159 = 1.0F - var138;
                                                   double var172 = var18 * var159;
                                                   double var185 = var20 * var159;
                                                   double var198 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                                                   var18 = var172 - Math.sin(var198) * var146;
                                                   var20 = var185 + Math.cos(var198) * var146;
                                                   var10002 = 6346761413822667994L;
                                                   double var289 = var18;
                                                   net.C_47Rw var296 = var1;
                                                   var296.method_42$2c20cf5948(var289);
                                                   var10002 = 6346779935113474272L;
                                                   double var303 = var20;
                                                   net.C_47Rw var310 = var1;
                                                   var310.method_40$2c20cf5948(var303);
                                                   var378 = var17;
                                                   if (var2 < 0L) {
                                                      break label1193;
                                                   }
                                                   break label1199;
                                                }

                                                long var629;
                                                int var564 = (var629 = var2 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
                                                long var630;
                                                int var565 = (var630 = var2 - 0L) == 0L ? 0 : (var630 < 0L ? -1 : 1);
                                                if (var17 == 0) {
                                                   if (var371 != 0) {
                                                      return;
                                                   }

                                                   var371 = 0;
                                                }

                                                var10002 = 6347050158392276379L;
                                                net.minecraft.client.Minecraft var262 = field_43;
                                                long var600 = 6346660000975910208L;
                                                net.minecraft.client.entity.EntityPlayerSP var269 = var262.field_42P;
                                                long var276 = var13;
                                                int var283 = var371;
                                                double[] var123 = net.C_47TT.method_45$f42b969df3(var283, var276, var269);
                                                double var379 = var123[9];
                                                long var631;
                                                int var448 = (var631 = var2 - 0L) == 0L ? 0 : (var631 < 0L ? -1 : 1);
                                                float var140 = (float)var379;
                                                double var147 = var22 * var140;
                                                double var160 = 1.0F - var140;
                                                double var173 = var18 * var160;
                                                double var186 = var20 * var160;
                                                double var199 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                                                var18 = var173 - Math.sin(var199) * var147;
                                                var20 = var186 + Math.cos(var199) * var147;
                                                var10002 = 6346761413822667994L;
                                                double var290 = var18;
                                                net.C_47Rw var297 = var1;
                                                var297.method_42$2c20cf5948(var290);
                                                var10002 = 6346779935113474272L;
                                                double var304 = var20;
                                                net.C_47Rw var311 = var1;
                                                var311.method_40$2c20cf5948(var304);
                                                var378 = var17;
                                                long var632;
                                                int var449 = (var632 = var2 - 0L) == 0L ? 0 : (var632 < 0L ? -1 : 1);
                                                break label1199;
                                             }

                                             long var633;
                                             int var571 = (var633 = var2 - 0L) == 0L ? 0 : (var633 < 0L ? -1 : 1);
                                             long var634;
                                             int var572 = (var634 = var2 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
                                             if (var17 == 0) {
                                                if (var371 == 0) {
                                                   var10001 = 6345596237522025016L;
                                                   net.minecraft.client.Minecraft var247 = field_43;
                                                   var371 = ((var247.field_44r.field_42b.field_45) ? 1 : 0);
                                                   var442 = var17;
                                                   long var635;
                                                   int var573 = (var635 = var2 - 0L) == 0L ? 0 : (var635 < 0L ? -1 : 1);
                                                   break label1233;
                                                }

                                                var10001 = 6347050158392276379L;
                                                net.minecraft.client.Minecraft var254 = field_43;
                                                var371 = var254.field_42P.field_432;
                                             }

                                             var442 = var17;
                                             break label1233;
                                          }

                                          label884: {
                                             if (var378 == 0) {
                                                long var636;
                                                int var450 = (var636 = var2 - 0L) == 0L ? 0 : (var636 < 0L ? -1 : 1);
                                                if (!var4) {
                                                   break label884;
                                                }

                                                var10001 = 6347050158392276379L;
                                                net.minecraft.client.Minecraft var315 = field_43;
                                                var315.field_42P.field_48s = var18;
                                             }

                                             var10001 = 6347050158392276379L;
                                             net.minecraft.client.Minecraft var318 = field_43;
                                             var318.field_42P.field_487 = var20;
                                          }

                                          long var637;
                                          int var453 = (var637 = var2 - 0L) == 0L ? 0 : (var637 < 0L ? -1 : 1);
                                          if (var17 == 0) {
                                             return;
                                          }
                                          break label1242;
                                       }

                                       var371 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                       var430 = var17;
                                       long var638;
                                       int var581 = (var638 = var2 - 0L) == 0L ? 0 : (var638 < 0L ? -1 : 1);
                                    }

                                    if (var430 == 0) {
                                       if (var371 == 0) {
                                          return;
                                       }

                                       var10001 = 6347050158392276379L;
                                       net.minecraft.client.Minecraft var240 = field_43;
                                       var371 = ((var240.field_42P.field_48M) ? 1 : 0);
                                    }

                                    long var639;
                                    int var582 = (var639 = var2 - 0L) == 0L ? 0 : (var639 < 0L ? -1 : 1);
                                    if (var17 == 0) {
                                       if (var371 != 0) {
                                          return;
                                       }

                                       var10001 = 6345596237522025016L;
                                       net.minecraft.client.Minecraft var241 = field_43;
                                       var371 = ((var241.field_44r.field_42P.field_45) ? 1 : 0);
                                    }

                                    label867:
                                    if (var17 == 0) {
                                       if (var371 == 0) {
                                          var10001 = 6345596237522025016L;
                                          net.minecraft.client.Minecraft var248 = field_43;
                                          var371 = ((var248.field_44r.field_42b.field_45) ? 1 : 0);
                                          long var640;
                                          int var583 = (var640 = var2 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
                                          if (var17 != 0) {
                                             break label867;
                                          }

                                          if (!var248.field_44r.field_42b.field_45) {
                                             return;
                                          }
                                       }

                                       var10001 = 6347050158392276379L;
                                       net.minecraft.client.Minecraft var255 = field_43;
                                       var371 = var255.field_42P.field_432;
                                    }

                                    long var641;
                                    int var584 = (var641 = var2 - 0L) == 0L ? 0 : (var641 < 0L ? -1 : 1);
                                    if (var17 == 0) {
                                       if (var371 != 0) {
                                          return;
                                       }

                                       var10001 = 6347050158392276379L;
                                       net.minecraft.client.Minecraft var256 = field_43;
                                       var371 = ((var256.field_42P.field_46) ? 1 : 0);
                                    }

                                    long var642;
                                    int var585 = (var642 = var2 - 0L) == 0L ? 0 : (var642 < 0L ? -1 : 1);
                                    if (var17 == 0) {
                                       if (var371 != 0) {
                                          return;
                                       }

                                       var10001 = 6347050158392276379L;
                                       net.minecraft.client.Minecraft var257 = field_43;
                                       var371 = ((var257.field_42P.method_45$aae029aa0a()) ? 1 : 0);
                                    }

                                    if (var17 == 0) {
                                       if (var371 != 0) {
                                          return;
                                       }

                                       var371 = 0;
                                    }

                                    var10002 = 6347050158392276379L;
                                    net.minecraft.client.Minecraft var264 = field_43;
                                    long var603 = 6346660000975910208L;
                                    net.minecraft.client.entity.EntityPlayerSP var271 = var264.field_42P;
                                    long var278 = var13;
                                    int var285 = var371;
                                    double[] var127 = net.C_47TT.method_45$f42b969df3(var285, var278, var271);
                                    double var381 = var127[9];
                                    long var643;
                                    int var476 = (var643 = var2 - 0L) == 0L ? 0 : (var643 < 0L ? -1 : 1);
                                    double var644;
                                    int var382 = (var644 = var381 - 1.0) == 0.0 ? 0 : (var644 < 0.0 ? -1 : 1);
                                    long var645;
                                    int var477 = (var645 = var2 - 0L) == 0L ? 0 : (var645 < 0L ? -1 : 1);
                                    label842:
                                    if (!(var382 != 0)) {
                                       var10002 = 6349794869706810243L;
                                       long var65 = var7;
                                       client.setting.NumberSetting var67 = this.settingPercentage;
                                       float var142 = (float)(var67.method_44$474dfaa627(var65) / 100.0);
                                       double var149 = var22 * var142;
                                       double var162 = 1.0F - var142;
                                       double var175 = var18 * var162;
                                       double var188 = var20 * var162;
                                       double var201 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                                       var18 = var175 - Math.sin(var201) * var149;
                                       var20 = var188 + Math.cos(var201) * var149;
                                       var10002 = 6346761413822667994L;
                                       double var292 = var18;
                                       net.C_47Rw var299 = var1;
                                       var299.method_42$2c20cf5948(var292);
                                       var10002 = 6346779935113474272L;
                                       double var306 = var20;
                                       net.C_47Rw var313 = var1;
                                       var313.method_40$2c20cf5948(var306);
                                       long var646;
                                       int var478 = (var646 = var2 - 0L) == 0L ? 0 : (var646 < 0L ? -1 : 1);
                                       if (var17 == 0) {
                                          long var647;
                                          int var479 = (var647 = var2 - 0L) == 0L ? 0 : (var647 < 0L ? -1 : 1);
                                          if (!var4) {
                                             break label842;
                                          }

                                          var10001 = 6347050158392276379L;
                                          net.minecraft.client.Minecraft var316 = field_43;
                                          var316.field_42P.field_48s = var18;
                                       }

                                       var10001 = 6347050158392276379L;
                                       net.minecraft.client.Minecraft var319 = field_43;
                                       var319.field_42P.field_487 = var20;
                                    }

                                    long var648;
                                    int var482 = (var648 = var2 - 0L) == 0L ? 0 : (var648 < 0L ? -1 : 1);
                                    if (var17 == 0) {
                                       return;
                                    }
                                    break label1241;
                                 }

                                 long var649;
                                 int var574 = (var649 = var2 - 0L) == 0L ? 0 : (var649 < 0L ? -1 : 1);
                                 long var650;
                                 int var575 = (var650 = var2 - 0L) == 0L ? 0 : (var650 < 0L ? -1 : 1);
                                 if (var442 == 0) {
                                    if (var371 != 0) {
                                       return;
                                    }

                                    var371 = 0;
                                 }

                                 var10002 = 6347050158392276379L;
                                 net.minecraft.client.Minecraft var263 = field_43;
                                 long var602 = 6346660000975910208L;
                                 net.minecraft.client.entity.EntityPlayerSP var270 = var263.field_42P;
                                 long var277 = var13;
                                 int var284 = var371;
                                 double[] var125 = net.C_47TT.method_45$f42b969df3(var284, var277, var270);
                                 double var380 = var125[9];
                                 long var651;
                                 int var459 = (var651 = var2 - 0L) == 0L ? 0 : (var651 < 0L ? -1 : 1);
                                 float var141 = (float)var380;
                                 double var148 = var22 * var141;
                                 double var161 = 1.0F - var141;
                                 double var174 = var18 * var161;
                                 double var187 = var20 * var161;
                                 double var200 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                                 var18 = var174 - Math.sin(var200) * var148;
                                 var20 = var187 + Math.cos(var200) * var148;
                                 var10002 = 6346761413822667994L;
                                 double var291 = var18;
                                 net.C_47Rw var298 = var1;
                                 var298.method_42$2c20cf5948(var291);
                                 var10002 = 6346779935113474272L;
                                 double var305 = var20;
                                 net.C_47Rw var312 = var1;
                                 var312.method_40$2c20cf5948(var305);
                                 var378 = var17;
                                 long var652;
                                 int var460 = (var652 = var2 - 0L) == 0L ? 0 : (var652 < 0L ? -1 : 1);
                                 break label1193;
                              }

                              var10000 = var15;
                              var10001 = 6346601274495627412L;
                              var10002 = var2;
                              long var653;
                              int var601 = (var653 = var2 - 0L) == 0L ? 0 : (var653 < 0L ? -1 : 1);
                              break label1194;
                           }

                           if (!recovery$indy$flow$129(var10000, var10001, var10002)) {
                              return;
                           }

                           double var120 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                           var18 = -Math.sin(var120) * var22;
                           var20 = Math.cos(var120) * var22;
                           var10002 = 6346761413822667994L;
                           double var323 = var18;
                           net.C_47Rw var330 = var1;
                           var330.method_42$2c20cf5948(var323);
                           var10002 = 6346779935113474272L;
                           double var337 = var20;
                           net.C_47Rw var344 = var1;
                           var344.method_40$2c20cf5948(var337);
                           var376 = var17;
                           if (var2 <= 0L) {
                              break label1314;
                           }
                           break label1192;
                        }

                        long var655;
                        int var604 = (var655 = var2 - 0L) == 0L ? 0 : (var655 < 0L ? -1 : 1);
                        if (!recovery$indy$flow$129(var15, 6346601274495627412L, var2)) {
                           return;
                        }

                        double var128 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                        var18 = -Math.sin(var128) * var22;
                        var20 = Math.cos(var128) * var22;
                        var10002 = 6346761413822667994L;
                        double var326 = var18;
                        net.C_47Rw var333 = var1;
                        var333.method_42$2c20cf5948(var326);
                        var10002 = 6346779935113474272L;
                        double var340 = var20;
                        net.C_47Rw var347 = var1;
                        var347.method_40$2c20cf5948(var340);
                        var376 = var17;
                        long var656;
                        int var483 = (var656 = var2 - 0L) == 0L ? 0 : (var656 < 0L ? -1 : 1);
                        break label1192;
                     }

                     if (!recovery$indy$flow$129(var10000, var10001, var10002)) {
                        return;
                     }

                     double var124 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                     var18 = -Math.sin(var124) * var22;
                     var20 = Math.cos(var124) * var22;
                     var10002 = 6346761413822667994L;
                     double var324 = var18;
                     net.C_47Rw var331 = var1;
                     var331.method_42$2c20cf5948(var324);
                     var10002 = 6346779935113474272L;
                     double var338 = var20;
                     net.C_47Rw var345 = var1;
                     var345.method_40$2c20cf5948(var338);
                     var376 = var17;
                     long var657;
                     int var454 = (var657 = var2 - 0L) == 0L ? 0 : (var657 < 0L ? -1 : 1);
                     break label1314;
                  }

                  long var658;
                  int var461 = (var658 = var2 - 0L) == 0L ? 0 : (var658 < 0L ? -1 : 1);
                  long var659;
                  int var462 = (var659 = var2 - 0L) == 0L ? 0 : (var659 < 0L ? -1 : 1);
                  if (var378 == 0) {
                     return;
                  }

                  var10000 = var9;
                  var10001 = 6349942018221752547L;
                  var10002 = var2;
                  break label1315;
               }

               if (var376 == 0) {
                  if (!var4) {
                     return;
                  }

                  var10001 = 6347050158392276379L;
                  net.minecraft.client.Minecraft var352 = field_43;
                  var352.field_42P.field_48s = var18;
               }

               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var357 = field_43;
               var357.field_42P.field_487 = var20;
               return;
            }

            double var126 = recovery$indy$flow$130(var10000, var10001, var10002);
            var18 = -Math.sin(var126) * var22;
            var20 = Math.cos(var126) * var22;
            var10002 = 6346761413822667994L;
            double var325 = var18;
            net.C_47Rw var332 = var1;
            var332.method_42$2c20cf5948(var325);
            var10002 = 6346779935113474272L;
            double var339 = var20;
            net.C_47Rw var346 = var1;
            var346.method_40$2c20cf5948(var339);
            long var661;
            int var463 = (var661 = var2 - 0L) == 0L ? 0 : (var661 < 0L ? -1 : 1);
            if (var17 != 0) {
               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var351 = field_43;
               var351.field_42P.field_48s = var18;
               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var356 = field_43;
               var356.field_42P.field_487 = var20;
            }

            return;
         }

         if (var376 != 0) {
            var10001 = 6347050158392276379L;
            net.minecraft.client.Minecraft var350 = field_43;
            var350.field_42P.field_48s = var18;
            var10001 = 6347050158392276379L;
            net.minecraft.client.Minecraft var355 = field_43;
            var355.field_42P.field_487 = var20;
         }
      } else {
         label1317: {
            label1318: {
               label1217: {
                  label1234: {
                     label1243: {
                        label1221: {
                           label1222: {
                              label1223: {
                                 label1174: {
                                    label1224: {
                                       label1225: {
                                          if (var17 == 0) {
                                             switch (var359) {
                                                case 0:
                                                   var359 = ((int) (recovery$indy$flow$60(var15, 6346601274495627412L, var2) ? 1 : 0));
                                                   break;
                                                case 1:
                                                   var362 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                                   var384 = var17;
                                                   if (var2 > 0L) {
                                                      break label1243;
                                                   }

                                                   long var662;
                                                   int var490 = (var662 = var2 - 0L) == 0L ? 0 : (var662 < 0L ? -1 : 1);
                                                   if (var17 != 0) {
                                                      break label1174;
                                                   }

                                                   if (var362 != 0) {
                                                      var10001 = 6347050158392276379L;
                                                      net.minecraft.client.Minecraft var57 = field_43;
                                                      var362 = var57.field_42P.field_432;
                                                      break label1174;
                                                   }

                                                   var10001 = 6345596237522025016L;
                                                   net.minecraft.client.Minecraft var56 = field_43;
                                                   var363 = ((var56.field_44r.field_42b.field_45) ? 1 : 0);
                                                   var386 = var17;
                                                   if (var2 < 0L) {
                                                      break label1222;
                                                   }
                                                   break label1225;
                                                case 2:
                                                   var10000 = var15;
                                                   var10001 = 6346601274495627412L;
                                                   var10002 = var2;
                                                   if (var2 < 0L) {
                                                      break label1318;
                                                   }

                                                   if (!recovery$indy$flow$129(var15, 6346601274495627412L, var2)) {
                                                      return;
                                                   }

                                                   double var26 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                                                   var18 = -Math.sin(var26) * var22;
                                                   var20 = Math.cos(var26) * var22;
                                                   var10002 = 6346761413822667994L;
                                                   double var76 = var18;
                                                   net.C_47Rw var78 = var1;
                                                   var78.method_42$2c20cf5948(var76);
                                                   var10002 = 6346779935113474272L;
                                                   double var79 = var20;
                                                   net.C_47Rw var81 = var1;
                                                   var81.method_40$2c20cf5948(var79);
                                                   var361 = var17;
                                                   if (var2 <= 0L) {
                                                      break label1317;
                                                   }
                                                   break label1217;
                                                default:
                                                   return;
                                             }
                                          }

                                          if (var359 == 0) {
                                             return;
                                          }

                                          var10002 = 6349794869706810243L;
                                          long var43 = var7;
                                          client.setting.NumberSetting var45 = this.settingPercentage;
                                          float var108 = (float)(var45.method_44$474dfaa627(var43) / 100.0);
                                          double var129 = var22 * var108;
                                          double var29 = 1.0F - var108;
                                          double var31 = var18 * var29;
                                          double var33 = var20 * var29;
                                          double var35 = recovery$indy$flow$64(var5, 6347207092018641424L, var2);
                                          var18 = var31 - Math.sin(var35) * var129;
                                          var20 = var33 + Math.cos(var35) * var129;
                                          var10002 = 6346761413822667994L;
                                          double var46 = var18;
                                          net.C_47Rw var48 = var1;
                                          var48.method_42$2c20cf5948(var46);
                                          var10002 = 6346779935113474272L;
                                          double var49 = var20;
                                          net.C_47Rw var51 = var1;
                                          var51.method_40$2c20cf5948(var49);
                                          var363 = var17;
                                          if (var2 > 0L) {
                                             label1131: {
                                                if (var17 == 0) {
                                                   long var663;
                                                   int var410 = (var663 = var2 - 0L) == 0L ? 0 : (var663 < 0L ? -1 : 1);
                                                   if (!var4) {
                                                      break label1131;
                                                   }

                                                   var10001 = 6347050158392276379L;
                                                   net.minecraft.client.Minecraft var52 = field_43;
                                                   var52.field_42P.field_48s = var18;
                                                }

                                                var10001 = 6347050158392276379L;
                                                net.minecraft.client.Minecraft var53 = field_43;
                                                var53.field_42P.field_487 = var20;
                                             }

                                             long var664;
                                             int var413 = (var664 = var2 - 0L) == 0L ? 0 : (var664 < 0L ? -1 : 1);
                                             if (var17 == 0) {
                                                return;
                                             }

                                             var362 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                             var384 = var17;
                                             long var665;
                                             int var519 = (var665 = var2 - 0L) == 0L ? 0 : (var665 < 0L ? -1 : 1);
                                             break label1243;
                                          }

                                          long var666;
                                          int var389 = (var666 = var2 - 0L) == 0L ? 0 : (var666 < 0L ? -1 : 1);
                                          if (var2 < 0L) {
                                             long var667;
                                             int var509 = (var667 = var2 - 0L) == 0L ? 0 : (var667 < 0L ? -1 : 1);
                                             long var668;
                                             int var510 = (var668 = var2 - 0L) == 0L ? 0 : (var668 < 0L ? -1 : 1);
                                             if (var17 == 0) {
                                                if (var17 == 0) {
                                                   var10001 = 6345596237522025016L;
                                                   net.minecraft.client.Minecraft var243 = field_43;
                                                   var363 = ((var243.field_44r.field_42b.field_45) ? 1 : 0);
                                                   var386 = var17;
                                                   long var669;
                                                   int var511 = (var669 = var2 - 0L) == 0L ? 0 : (var669 < 0L ? -1 : 1);
                                                   break label1222;
                                                }

                                                var10001 = 6347050158392276379L;
                                                net.minecraft.client.Minecraft var250 = field_43;
                                                var363 = var250.field_42P.field_432;
                                             }

                                             var386 = var17;
                                             break label1222;
                                          }

                                          if (var17 == 0) {
                                             return;
                                          }

                                          var363 = ((recovery$indy$flow$79(var15, 6346601274495627412L, var2)) ? 1 : 0);
                                          long var670;
                                          int var499 = (var670 = var2 - 0L) == 0L ? 0 : (var670 < 0L ? -1 : 1);
                                          long var671;
                                          int var500 = (var671 = var2 - 0L) == 0L ? 0 : (var671 < 0L ? -1 : 1);
                                          if (var17 != 0) {
                                             break label1223;
                                          }

                                          if (var363 != 0) {
                                             break label1224;
                                          }

                                          var10001 = 6345596237522025016L;
                                          net.minecraft.client.Minecraft var242 = field_43;
                                          var363 = ((var242.field_44r.field_42b.field_45) ? 1 : 0);
                                          var386 = var17;
                                          long var672;
                                          int var501 = (var672 = var2 - 0L) == 0L ? 0 : (var672 < 0L ? -1 : 1);
                                       }

                                       if (var386 != 0) {
                                          break label1223;
                                       }

                                       if (var363 == 0) {
                                          return;
                                       }
                                    }

                                    var10001 = 6347050158392276379L;
                                    net.minecraft.client.Minecraft var249 = field_43;
                                    var363 = var249.field_42P.field_432;
                                    break label1223;
                                 }

                                 long var673;
                                 int var491 = (var673 = var2 - 0L) == 0L ? 0 : (var673 < 0L ? -1 : 1);
                                 long var674;
                                 int var492 = (var674 = var2 - 0L) == 0L ? 0 : (var674 < 0L ? -1 : 1);
                                 if (var17 == 0) {
                                    if (var362 != 0) {
                                       return;
                                    }

                                    var362 = 0;
                                 }

                                 var10002 = 6347050158392276379L;
                                 net.minecraft.client.Minecraft var60 = field_43;
                                 long var10003 = 6346660000975910208L;
                                 net.minecraft.client.entity.EntityPlayerSP var61 = var60.field_42P;
                                 long var62 = var13;
                                 int var64 = var362;
                                 double[] var107 = net.C_47TT.method_45$f42b969df3(var64, var62, var61);
                                 double var364 = var107[9];
                                 long var675;
                                 int var388 = (var675 = var2 - 0L) == 0L ? 0 : (var675 < 0L ? -1 : 1);
                                 float var27 = (float)var364;
                                 double var28 = var22 * var27;
                                 double var30 = 1.0F - var27;
                                 double var32 = var18 * var30;
                                 double var34 = var20 * var30;
                                 double var36 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                                 var18 = var32 - Math.sin(var36) * var28;
                                 var20 = var34 + Math.cos(var36) * var28;
                                 var10002 = 6346761413822667994L;
                                 double var68 = var18;
                                 net.C_47Rw var70 = var1;
                                 var70.method_42$2c20cf5948(var68);
                                 var10002 = 6346779935113474272L;
                                 double var71 = var20;
                                 net.C_47Rw var73 = var1;
                                 var73.method_40$2c20cf5948(var71);
                                 var365 = var17;
                                 if (var2 < 0L) {
                                    break label1234;
                                 }
                                 break label1221;
                              }

                              long var676;
                              int var502 = (var676 = var2 - 0L) == 0L ? 0 : (var676 < 0L ? -1 : 1);
                              long var677;
                              int var503 = (var677 = var2 - 0L) == 0L ? 0 : (var677 < 0L ? -1 : 1);
                              if (var17 == 0) {
                                 if (var363 != 0) {
                                    return;
                                 }

                                 var363 = 0;
                              }

                              var10002 = 6347050158392276379L;
                              net.minecraft.client.Minecraft var258 = field_43;
                              long var592 = 6346660000975910208L;
                              net.minecraft.client.entity.EntityPlayerSP var265 = var258.field_42P;
                              long var272 = var13;
                              int var279 = var363;
                              double[] var109 = net.C_47TT.method_45$f42b969df3(var279, var272, var265);
                              double var366 = var109[9];
                              long var678;
                              int var392 = (var678 = var2 - 0L) == 0L ? 0 : (var678 < 0L ? -1 : 1);
                              float var130 = (float)var366;
                              double var143 = var22 * var130;
                              double var156 = 1.0F - var130;
                              double var169 = var18 * var156;
                              double var182 = var20 * var156;
                              double var195 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                              var18 = var169 - Math.sin(var195) * var143;
                              var20 = var182 + Math.cos(var195) * var143;
                              var10002 = 6346761413822667994L;
                              double var286 = var18;
                              net.C_47Rw var293 = var1;
                              var293.method_42$2c20cf5948(var286);
                              var10002 = 6346779935113474272L;
                              double var300 = var20;
                              net.C_47Rw var307 = var1;
                              var307.method_40$2c20cf5948(var300);
                              var365 = var17;
                              long var679;
                              int var393 = (var679 = var2 - 0L) == 0L ? 0 : (var679 < 0L ? -1 : 1);
                              break label1221;
                           }

                           long var680;
                           int var512 = (var680 = var2 - 0L) == 0L ? 0 : (var680 < 0L ? -1 : 1);
                           long var681;
                           int var513 = (var681 = var2 - 0L) == 0L ? 0 : (var681 < 0L ? -1 : 1);
                           if (var386 == 0) {
                              if (var363 != 0) {
                                 return;
                              }

                              var363 = 0;
                           }

                           var10002 = 6347050158392276379L;
                           net.minecraft.client.Minecraft var259 = field_43;
                           long var594 = 6346660000975910208L;
                           net.minecraft.client.entity.EntityPlayerSP var266 = var259.field_42P;
                           long var273 = var13;
                           int var280 = var363;
                           double[] var111 = net.C_47TT.method_45$f42b969df3(var280, var273, var266);
                           double var367 = var111[9];
                           long var682;
                           int var403 = (var682 = var2 - 0L) == 0L ? 0 : (var682 < 0L ? -1 : 1);
                           float var131 = (float)var367;
                           double var144 = var22 * var131;
                           double var157 = 1.0F - var131;
                           double var170 = var18 * var157;
                           double var183 = var20 * var157;
                           double var196 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                           var18 = var170 - Math.sin(var196) * var144;
                           var20 = var183 + Math.cos(var196) * var144;
                           var10002 = 6346761413822667994L;
                           double var287 = var18;
                           net.C_47Rw var294 = var1;
                           var294.method_42$2c20cf5948(var287);
                           var10002 = 6346779935113474272L;
                           double var301 = var20;
                           net.C_47Rw var308 = var1;
                           var308.method_40$2c20cf5948(var301);
                           var365 = var17;
                           long var683;
                           int var404 = (var683 = var2 - 0L) == 0L ? 0 : (var683 < 0L ? -1 : 1);
                           break label1234;
                        }

                        label1118: {
                           if (var365 == 0) {
                              long var684;
                              int var394 = (var684 = var2 - 0L) == 0L ? 0 : (var684 < 0L ? -1 : 1);
                              if (!var4) {
                                 break label1118;
                              }

                              var10001 = 6347050158392276379L;
                              net.minecraft.client.Minecraft var74 = field_43;
                              var74.field_42P.field_48s = var18;
                           }

                           var10001 = 6347050158392276379L;
                           net.minecraft.client.Minecraft var75 = field_43;
                           var75.field_42P.field_487 = var20;
                        }

                        long var685;
                        int var397 = (var685 = var2 - 0L) == 0L ? 0 : (var685 < 0L ? -1 : 1);
                        if (var17 == 0) {
                           return;
                        }

                        long var686;
                        int var593 = (var686 = var2 - 0L) == 0L ? 0 : (var686 < 0L ? -1 : 1);
                        if (!recovery$indy$flow$129(var15, 6346601274495627412L, var2)) {
                           return;
                        }

                        double var110 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                        var18 = -Math.sin(var110) * var22;
                        var20 = Math.cos(var110) * var22;
                        var10002 = 6346761413822667994L;
                        double var320 = var18;
                        net.C_47Rw var327 = var1;
                        var327.method_42$2c20cf5948(var320);
                        var10002 = 6346779935113474272L;
                        double var334 = var20;
                        net.C_47Rw var341 = var1;
                        var341.method_40$2c20cf5948(var334);
                        var361 = var17;
                        long var687;
                        int var398 = (var687 = var2 - 0L) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                        break label1317;
                     }

                     if (var384 == 0) {
                        if (var362 == 0) {
                           return;
                        }

                        var10001 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var54 = field_43;
                        var362 = ((var54.field_42P.field_48M) ? 1 : 0);
                     }

                     long var688;
                     int var520 = (var688 = var2 - 0L) == 0L ? 0 : (var688 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        if (var362 != 0) {
                           return;
                        }

                        var10001 = 6345596237522025016L;
                        net.minecraft.client.Minecraft var55 = field_43;
                        var362 = ((var55.field_44r.field_42P.field_45) ? 1 : 0);
                     }

                     label1108:
                     if (var17 == 0) {
                        if (var362 == 0) {
                           var10001 = 6345596237522025016L;
                           net.minecraft.client.Minecraft var244 = field_43;
                           var362 = ((var244.field_44r.field_42b.field_45) ? 1 : 0);
                           long var689;
                           int var521 = (var689 = var2 - 0L) == 0L ? 0 : (var689 < 0L ? -1 : 1);
                           if (var17 != 0) {
                              break label1108;
                           }

                           if (!var244.field_44r.field_42b.field_45) {
                              return;
                           }
                        }

                        var10001 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var251 = field_43;
                        var362 = var251.field_42P.field_432;
                     }

                     long var690;
                     int var522 = (var690 = var2 - 0L) == 0L ? 0 : (var690 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        if (var362 != 0) {
                           return;
                        }

                        var10001 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var58 = field_43;
                        var362 = ((var58.field_42P.field_46) ? 1 : 0);
                     }

                     long var691;
                     int var523 = (var691 = var2 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        if (var362 != 0) {
                           return;
                        }

                        var10001 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var59 = field_43;
                        var362 = ((var59.field_42P.method_45$aae029aa0a()) ? 1 : 0);
                     }

                     if (var17 == 0) {
                        if (var362 != 0) {
                           return;
                        }

                        var362 = 0;
                     }

                     label1097: {
                        var10002 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var260 = field_43;
                        long var595 = 6346660000975910208L;
                        net.minecraft.client.entity.EntityPlayerSP var267 = var260.field_42P;
                        long var274 = var13;
                        int var281 = var362;
                        double[] var113 = net.C_47TT.method_45$f42b969df3(var281, var274, var267);
                        double var368 = var113[9];
                        long var692;
                        int var420 = (var692 = var2 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                        float var132 = (float)(var368 / 1.0);
                        double var145 = var22 * var132;
                        double var158 = 1.0F - var132;
                        double var171 = var18 * var158;
                        double var184 = var20 * var158;
                        double var197 = recovery$indy$flow$114(var5, 6347207092018641424L, var2);
                        var18 = var171 - Math.sin(var197) * var145;
                        var20 = var184 + Math.cos(var197) * var145;
                        var10002 = 6346761413822667994L;
                        double var288 = var18;
                        net.C_47Rw var295 = var1;
                        var295.method_42$2c20cf5948(var288);
                        var10002 = 6346779935113474272L;
                        double var302 = var20;
                        net.C_47Rw var309 = var1;
                        var309.method_40$2c20cf5948(var302);
                        long var693;
                        int var421 = (var693 = var2 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                        if (var17 == 0) {
                           long var694;
                           int var422 = (var694 = var2 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                           if (!var4) {
                              break label1097;
                           }

                           var10001 = 6347050158392276379L;
                           net.minecraft.client.Minecraft var314 = field_43;
                           var314.field_42P.field_48s = var18;
                        }

                        var10001 = 6347050158392276379L;
                        net.minecraft.client.Minecraft var317 = field_43;
                        var317.field_42P.field_487 = var20;
                     }

                     long var695;
                     int var425 = (var695 = var2 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        return;
                     }

                     long var696;
                     int var596 = (var696 = var2 - 0L) == 0L ? 0 : (var696 < 0L ? -1 : 1);
                     if (!recovery$indy$flow$129(var15, 6346601274495627412L, var2)) {
                        return;
                     }

                     double var114 = recovery$indy$flow$130(var9, 6349942018221752547L, var2);
                     var18 = -Math.sin(var114) * var22;
                     var20 = Math.cos(var114) * var22;
                     var10002 = 6346761413822667994L;
                     double var322 = var18;
                     net.C_47Rw var329 = var1;
                     var329.method_42$2c20cf5948(var322);
                     var10002 = 6346779935113474272L;
                     double var336 = var20;
                     net.C_47Rw var343 = var1;
                     var343.method_40$2c20cf5948(var336);
                     var361 = var17;
                     long var697;
                     int var426 = (var697 = var2 - 0L) == 0L ? 0 : (var697 < 0L ? -1 : 1);
                     break label1217;
                  }

                  long var698;
                  int var405 = (var698 = var2 - 0L) == 0L ? 0 : (var698 < 0L ? -1 : 1);
                  long var699;
                  int var406 = (var699 = var2 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
                  if (var365 == 0) {
                     return;
                  }

                  var10000 = var9;
                  var10001 = 6349942018221752547L;
                  var10002 = var2;
                  break label1318;
               }

               if (var361 == 0) {
                  if (!var4) {
                     return;
                  }

                  var10001 = 6347050158392276379L;
                  net.minecraft.client.Minecraft var349 = field_43;
                  var349.field_42P.field_48s = var18;
               }

               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var354 = field_43;
               var354.field_42P.field_487 = var20;
               return;
            }

            double var112 = recovery$indy$flow$130(var10000, var10001, var10002);
            var18 = -Math.sin(var112) * var22;
            var20 = Math.cos(var112) * var22;
            var10002 = 6346761413822667994L;
            double var321 = var18;
            net.C_47Rw var328 = var1;
            var328.method_42$2c20cf5948(var321);
            var10002 = 6346779935113474272L;
            double var335 = var20;
            net.C_47Rw var342 = var1;
            var342.method_40$2c20cf5948(var335);
            long var700;
            int var407 = (var700 = var2 - 0L) == 0L ? 0 : (var700 < 0L ? -1 : 1);
            if (var17 != 0) {
               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var348 = field_43;
               var348.field_42P.field_48s = var18;
               var10001 = 6347050158392276379L;
               net.minecraft.client.Minecraft var353 = field_43;
               var353.field_42P.field_487 = var20;
            }

            return;
         }

         if (var361 != 0) {
            var10001 = 6347050158392276379L;
            net.minecraft.client.Minecraft var82 = field_43;
            var82.field_42P.field_48s = var18;
            var10001 = 6347050158392276379L;
            net.minecraft.client.Minecraft var83 = field_43;
            var83.field_42P.field_487 = var20;
         }
      }
   }








   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 22453151238126L;
      long var3 = var1 ^ 40625339371211L;
      long var10000 = -3803934646117749541L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -3803279152877725973L;
      BooleanSetting var6 = this.settingStrafeOnGround;
      boolean var10 = var6.method_49$aae029aa0a();
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10002 = -3804763553763627503L;
         long var7 = var3;
         ModeSetting var9 = this.settingTimingOnGround;
         var10 = var9.method_46$5f9dc63072(var7).equals("NotWhileKB");
      }

      return !var5 ? var10 : !var10;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 104006916530952L;
      long var3 = var1 ^ 121010261518893L;
      long var10000 = 3446206568813030744L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 3449268301943403021L;
      BooleanSetting var6 = this.settingStrafeOnAir;
      boolean var10 = var6.method_49$aae029aa0a();
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10002 = 3446530561015417591L;
         long var7 = var3;
         ModeSetting var9 = this.settingTiminInAir;
         var10 = var9.method_46$5f9dc63072(var7).equals("NotWhileKB");
      }

      return var5 ? var10 : !var10;
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      augustus.recovered.modules.movement.Strafe_47QG var35;
      long var4 = var2 ^ 23034124303526L;
      long var10001 = var2 ^ 28552516894471L;
      int var6 = (int)((var2 ^ 28552516894471L) >>> 32);
      int var7 = (int)((var2 ^ 28552516894471L) << 32 >>> 40);
      int var8 = (int)(var10001 << 56 >>> 56);
      long var9 = var2 ^ 69817512509206L;
      long var11 = var2 ^ 97315520376363L;
      long var10000 = 3158652708562422843L;
      boolean var13 = Fly_47kE.method_48$aae029aa0a();
      byte var10003 = (byte)var8;
      long var10004 = 3158900406606608837L;
      byte var14 = var10003;
      int var15 = var7;
      int var16 = var6;
      Strafe_47QG var17 = this;
      boolean var34 = var17.method_41d$5a0422472c(var16, var15, var14);
      if (var13) {
         if (!var34) {
            return;
         }

         var10001 = 3159232527450385058L;
         var34 = C_474i.method_45$0dd78e0064(var4);
      }

      boolean var38 = var13;
      if (var2 >= 0L) {
         if (var13) {
            if (var34) {
               return;
            }

            long var10002 = 3157797137416785649L;
            long var18 = var11;
            ModeSetting var20 = this.settingEvent;
            var34 = var20.method_46$5f9dc63072(var18).equals("Mid");
         }

         var38 = var13;
      }

      label65: {
         if (var38) {
            label49: {
               if (var34) {
                  var35 = this;
                  if (var2 <= 0L) {
                     break label49;
                  }

                  var10004 = 3159084085136934305L;
                  boolean var21 = true;
                  long var22 = var9;
                  C_47Rw var24 = var1;
                  Strafe_47QG var25 = this;
                  var25.method_40$464505d199(var24, var22, var21);
                  if (var13) {
                     return;
                  }
               }

               var35 = this;
            }

            if (!var13) {
               break label65;
            }

            long var39 = 3157797137416785649L;
            long var26 = var11;
            ModeSetting var28 = var35.settingEvent;
            var34 = var28.method_46$5f9dc63072(var26).equals("OtherMid");
         }

         if (!var34) {
            return;
         }

         var35 = this;
      }

      var10004 = 3159084085136934305L;
      boolean var29 = false;
      long var30 = var9;
      C_47Rw var32 = var1;
      Strafe_47QG var33 = var35;
      var33.method_40$464505d199(var32, var30, var29);
   }




   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 115274117911687L;
      long var8 = var4 ^ 109424016493039L;
      boolean var10 = recovery$indy$16(5870998133888792215L, var4);
      Strafe_47QG var10000 = this;
      if (var10) {
         if (!recovery$indy$17(this.settingEvent, var6, 5872288818574750813L, var4).equals(recovery$indy$18(29288, 4619944596852049683L ^ var4))) {
            return;
         }

         var10000 = this;
      }

      recovery$indy$19(var10000, var8, 5871097052990989041L, var4);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$20(this, 20, var3, -7099996288004794146L, var1);
      recovery$indy$21(this, 43, var3, -7099996288004794146L, var1);
   }



   private boolean method_41v$aae029aa0a() {
      long var1 = a ^ 25714986689895L;
      long var3 = var1 ^ 43955338292290L;
      long var10000 = -1604359635815224521L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -1604476927883621224L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Matrix");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_41d$5a0422472c(int var1, int var2, byte var3) {
      long var6;
      long var8;
      long var12;
      boolean var14;
      int var69;
      boolean var81;
      label310: {
         long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
         var6 = var4 ^ 83451761061156L;
         var8 = var4 ^ 114713231720611L;
         long var10 = var4 ^ 15882218623524L;
         var12 = var4 ^ 111462387408381L;
         long var10000 = 1730495215605940205L;
         var14 = Fly_47kE.method_48$aae029aa0a();
         var69 = recovery$indy$22(var10, 1733538623101639453L, var4)[0];
         label309:
         if (var14) {
            if (var69 < 0) {
               long var10001 = 1733402551820142045L;
               BooleanSetting var15 = this.settingBackwardsStrafe;
               var69 = (int) ((var15.method_49$aae029aa0a()) ? 1 : 0);
               var81 = var14;
               if (var3 >= 0) {
                  break label310;
               }

               if (!var14) {
                  break label309;
               }

               if (var69 == 0) {
                  return false;
               }
            }

            long var82 = 1730621363030766986L;
            Minecraft var16 = field_43;
            var69 = (int) ((var16.field_42P.field_48M) ? 1 : 0);
         }

         var81 = var14;
      }

      if (var1 >= 0) {
         if (var81) {
            if (var69 != 0) {
               long var94 = 1733402551820142045L;
               BooleanSetting var17 = this.settingStrafeOnGround;
               var69 = (int) ((var17.method_49$aae029aa0a()) ? 1 : 0);
               var81 = var14;
               if (var3 < 0) {
                  if (var14) {
                     if (var69 == 0) {
                        return false;
                     }

                     long var96 = 1730621363030766986L;
                     Minecraft var18 = field_43;
                     var69 = var18.field_42P.field_432;
                  }

                  var81 = var14;
               }

               label236: {
                  label235:
                  if (var81) {
                     if (var69 != 0) {
                        long var107 = 1730651204418878759L;
                        long var19 = var12;
                        ModeSetting var21 = this.settingTimingOnGround;
                        var69 = (int) ((var21.method_46$5f9dc63072(var19).equals("NotWhileKB")) ? 1 : 0);
                        var81 = var14;
                        if (var1 <= 0) {
                           break label236;
                        }

                        if (!var14) {
                           break label235;
                        }

                        if (var69 != 0) {
                           return false;
                        }
                     }

                     long var108 = 1730651204418878759L;
                     long var22 = var12;
                     ModeSetting var24 = this.settingTimingOnGround;
                     var69 = (int) ((var24.method_46$5f9dc63072(var22).equals("OnlyWhileKB")) ? 1 : 0);
                  }

                  var81 = var14;
               }

               if (var1 > 0) {
                  if (var81) {
                     if (var69 != 0) {
                        long var102 = 1730621363030766986L;
                        Minecraft var25 = field_43;
                        var69 = var25.field_42P.field_432;
                        var81 = var14;
                        if (var3 < 0) {
                           if (var14) {
                              if (var25.field_42P.field_432 == 0) {
                                 return false;
                              }

                              long var104 = 1730621363030766986L;
                              Minecraft var26 = field_43;
                              double var79 = var26.field_42P.field_432;
                              long var114 = 1730012443495571536L;
                              long var27 = var8;
                              C_47TU var29 = this.settingHurtTimeStrafeOnGround;
                              double var116;
                              var69 = (var116 = var79 - var29.method_41$474dfaa627(var27)) == 0.0 ? 0 : (var116 < 0.0 ? -1 : 1);
                           }

                           var81 = var14;
                        }

                        if (var3 < 0) {
                           if (var81) {
                              if (var69 < 0) {
                                 return false;
                              }

                              long var105 = 1730621363030766986L;
                              Minecraft var30 = field_43;
                              double var80 = var30.field_42P.field_432;
                              long var115 = 1729863127788606475L;
                              long var31 = var6;
                              C_47TU var33 = this.settingHurtTimeStrafeOnGround;
                              double var117;
                              var69 = (var117 = var80 - var33.method_43$474dfaa627(var31)) == 0.0 ? 0 : (var117 < 0.0 ? -1 : 1);
                           }

                           var81 = var14;
                        }

                        if (!var81) {
                           return var69 != 0;
                        }

                        if (var69 <= 0) {
                           return true;
                        }

                        return false;
                     }

                     long var98 = 1730621363030766986L;
                     Minecraft var34 = field_43;
                     var69 = var34.field_42P.field_432;
                  }

                  var81 = var14;
               }

               if (var81) {
                  if (var69 != 0) {
                     long var99 = 1730621363030766986L;
                     Minecraft var35 = field_43;
                     double var76 = var35.field_42P.field_432;
                     long var112 = 1730012443495571536L;
                     long var36 = var8;
                     C_47TU var38 = this.settingHurtTimeStrafeOnGround;
                     double var118;
                     var69 = (var118 = var76 - var38.method_41$474dfaa627(var36)) == 0.0 ? 0 : (var118 < 0.0 ? -1 : 1);
                     var81 = var14;
                     if (var3 <= 0) {
                        if (var14) {
                           if (var69 < 0) {
                              return false;
                           }

                           long var101 = 1730621363030766986L;
                           Minecraft var39 = field_43;
                           double var77 = var39.field_42P.field_432;
                           var112 = 1729863127788606475L;
                           long var40 = var6;
                           C_47TU var42 = this.settingHurtTimeStrafeOnGround;
                           double var119;
                           var69 = (var119 = var77 - var42.method_43$474dfaa627(var40)) == 0.0 ? 0 : (var119 < 0.0 ? -1 : 1);
                        }

                        var81 = var14;
                     }

                     if (!var81) {
                        return var69 != 0;
                     }

                     if (var69 > 0) {
                        return false;
                     }
                  }

                  var69 = 1;
               }

               return var69 != 0;
            }

            long var83 = 1733402551820142045L;
            BooleanSetting var43 = this.settingStrafeOnAir;
            var69 = (int) ((var43.method_49$aae029aa0a()) ? 1 : 0);
         }

         var81 = var14;
      }

      if (var2 >= 0) {
         if (var81) {
            if (var69 == 0) {
               return false;
            }

            long var84 = 1730621363030766986L;
            Minecraft var44 = field_43;
            var69 = var44.field_42P.field_432;
         }

         var81 = var14;
      }

      label296: {
         label295:
         if (var81) {
            if (var69 != 0) {
               long var10002 = 1730651204418878759L;
               long var45 = var12;
               ModeSetting var47 = this.settingTiminInAir;
               var69 = (int) ((var47.method_46$5f9dc63072(var45).equals("NotWhileKB")) ? 1 : 0);
               var81 = var14;
               if (var2 < 0) {
                  break label296;
               }

               if (!var14) {
                  break label295;
               }

               if (var69 != 0) {
                  return false;
               }
            }

            long var106 = 1730651204418878759L;
            long var48 = var12;
            ModeSetting var50 = this.settingTiminInAir;
            var69 = (int) ((var50.method_46$5f9dc63072(var48).equals("OnlyWhileKB")) ? 1 : 0);
         }

         var81 = var14;
      }

      if (var3 < 0) {
         if (var81) {
            if (var69 != 0) {
               long var90 = 1730621363030766986L;
               Minecraft var51 = field_43;
               var69 = var51.field_42P.field_432;
               var81 = var14;
               if (var3 < 0) {
                  if (var14) {
                     if (var51.field_42P.field_432 == 0) {
                        return false;
                     }

                     long var92 = 1730621363030766986L;
                     Minecraft var52 = field_43;
                     double var73 = var52.field_42P.field_432;
                     long var110 = 1730012443495571536L;
                     long var53 = var8;
                     C_47TU var55 = this.settingHurtTimeStrafeInAir;
                     double var120;
                     var69 = (var120 = var73 - var55.method_41$474dfaa627(var53)) == 0.0 ? 0 : (var120 < 0.0 ? -1 : 1);
                  }

                  var81 = var14;
               }

               if (var1 >= 0) {
                  if (var81) {
                     if (var69 < 0) {
                        return false;
                     }

                     long var93 = 1730621363030766986L;
                     Minecraft var56 = field_43;
                     double var74 = var56.field_42P.field_432;
                     long var111 = 1729863127788606475L;
                     long var57 = var6;
                     C_47TU var59 = this.settingHurtTimeStrafeInAir;
                     double var121;
                     var69 = (var121 = var74 - var59.method_43$474dfaa627(var57)) == 0.0 ? 0 : (var121 < 0.0 ? -1 : 1);
                  }

                  var81 = var14;
               }

               if (!var81) {
                  return var69 != 0;
               }

               if (var69 <= 0) {
                  return true;
               }

               return false;
            }

            long var86 = 1730621363030766986L;
            Minecraft var60 = field_43;
            var69 = var60.field_42P.field_432;
         }

         var81 = var14;
      }

      if (var81) {
         if (var69 != 0) {
            long var87 = 1730621363030766986L;
            Minecraft var61 = field_43;
            double var70 = var61.field_42P.field_432;
            long var10003 = 1730012443495571536L;
            long var62 = var8;
            C_47TU var64 = this.settingHurtTimeStrafeInAir;
            double var122;
            var69 = (var122 = var70 - var64.method_41$474dfaa627(var62)) == 0.0 ? 0 : (var122 < 0.0 ? -1 : 1);
            var81 = var14;
            if (var3 <= 0) {
               if (var14) {
                  if (var69 < 0) {
                     return false;
                  }

                  long var89 = 1730621363030766986L;
                  Minecraft var65 = field_43;
                  double var71 = var65.field_42P.field_432;
                  var10003 = 1729863127788606475L;
                  long var66 = var6;
                  C_47TU var68 = this.settingHurtTimeStrafeInAir;
                  double var123;
                  var69 = (var123 = var71 - var68.method_43$474dfaa627(var66)) == 0.0 ? 0 : (var123 < 0.0 ? -1 : 1);
               }

               var81 = var14;
            }

            if (!var81) {
               return var69 != 0;
            }

            if (var69 > 0) {
               return false;
            }
         }

         var69 = 1;
      }

      return var69 != 0;
   }







   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 54777118390967L;
      long var5 = var1 ^ 64337835550687L;
      boolean var7 = recovery$indy$23(4560243454516395458L, var1);
      Strafe_47QG var10000 = this;
      if (!var7) {
         if (!recovery$indy$24(this.settingEvent, var3, 4561819420020841069L, var1).equals(recovery$indy$25(24668, 7825930453294611209L ^ var1))) {
            return;
         }

         var10000 = this;
      }

      recovery$indy$26(var10000, var5, 4560469320998161601L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Strafe_47QG(long a0) {
        super((java.lang.String) ("Strafe"),(java.lang.String) ("Bestrafung"),(long) (((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 77452066829641L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (82))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.Strafe_47QG.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 15140422862212L);
        long constructorKey4 = ((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 46372042994714L);
        long constructorKey5 = ((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 55236988796871L);
        long constructorKey6 = ((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 60841253202258L);
        long constructorKey7 = ((augustus.recovered.modules.movement.Strafe_47QG.a ^ a0) ^ 28645386409685L);
        java.lang.Object initialValue8 = recovery$indy$flow$314(3);
        ((java.lang.Object[]) initialValue8)[0] = "Normal";
        ((java.lang.Object[]) initialValue8)[1] = "Matrix";
        ((java.lang.Object[]) initialValue8)[2] = "Intave";
        client.setting.ModeSetting initialized9 = new client.setting.ModeSetting(this, "Mode", constructorKey3, "Normal", (java.lang.String[]) (initialValue8));
        recovery$indy$flow$316(this, initialized9);
        java.lang.Object initialValue10 = recovery$indy$flow$318(4);
        ((java.lang.Object[]) initialValue10)[0] = "Pre";
        ((java.lang.Object[]) initialValue10)[1] = "Mid";
        ((java.lang.Object[]) initialValue10)[2] = "OtherMid";
        ((java.lang.Object[]) initialValue10)[3] = "Post";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "Event", constructorKey3, "Pre", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$320(this, initialized11);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "Percentage", Double.longBitsToDouble(4636737291354636288L), constructorKey7, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        java.lang.Object initialValue13 = recovery$indy$flow$323(this);
        java.lang.Object initialValue14 = initialValue13;
        client.setting.NumberSetting initialValue15 = initialized12;
        java.lang.Object initialValue16 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue17 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue18 = recovery$indy$flow$326(initialValue16, initialValue17);
        recovery$indy$flow$327(this, initialValue18);
        client.setting.BooleanSetting initialized19 = new client.setting.BooleanSetting(this, constructorKey6, "StrafeOnGround", false);
        recovery$indy$flow$330(this, initialized19);
        java.lang.Object initialValue20 = recovery$indy$flow$332(3);
        ((java.lang.Object[]) initialValue20)[0] = "Always";
        ((java.lang.Object[]) initialValue20)[1] = "NotWhileKB";
        ((java.lang.Object[]) initialValue20)[2] = "OnlyWhileKB";
        client.setting.ModeSetting initialized21 = new client.setting.ModeSetting(this, "TimingOnGround", constructorKey3, "Always", (java.lang.String[]) (initialValue20));
        java.lang.Object initialValue22 = ((java.lang.Object)(((augustus.recovered.modules.movement.Strafe_47QG) (((java.lang.Object)(this)))).settingStrafeOnGround));
        java.lang.Object initialValue23 = recovery$indy$flow$335(initialValue22);
        java.lang.Object initialValue24 = recovery$indy$flow$336(initialValue22);
        java.lang.Object initialValue25 = initialValue24;
        client.setting.ModeSetting initialValue26 = initialized21;
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue28 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue29 = recovery$indy$flow$339(initialValue27, initialValue28);
        recovery$indy$flow$340(this, initialValue29);
        net.C_47TU initialized30 = new net.C_47TU(constructorKey5, this, "HurtTimeStrafeOnGround", 0.0D, Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue31 = recovery$indy$flow$343(this);
        long initialValue32 = constructorKey4;
        java.lang.Object initialValue33 = initialValue31;
        net.C_47TU initialValue34 = initialized30;
        java.lang.Object initialValue35 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue36 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue37 = recovery$indy$flow$346(initialValue35, initialValue36, initialValue32);
        recovery$indy$flow$347(this, initialValue37);
        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting(this, constructorKey6, "StrafeOnAir", true);
        recovery$indy$flow$350(this, initialized38);
        java.lang.Object initialValue39 = recovery$indy$flow$352(3);
        ((java.lang.Object[]) initialValue39)[0] = "Always";
        ((java.lang.Object[]) initialValue39)[1] = "NotWhileKB";
        ((java.lang.Object[]) initialValue39)[2] = "OnlyWhileKB";
        client.setting.ModeSetting initialized40 = new client.setting.ModeSetting(this, "TiminInAir", constructorKey3, "Always", (java.lang.String[]) (initialValue39));
        java.lang.Object initialValue41 = ((java.lang.Object)(((augustus.recovered.modules.movement.Strafe_47QG) (((java.lang.Object)(this)))).settingStrafeOnAir));
        java.lang.Object initialValue42 = recovery$indy$flow$355(initialValue41);
        java.lang.Object initialValue43 = recovery$indy$flow$356(initialValue41);
        java.lang.Object initialValue44 = initialValue43;
        client.setting.ModeSetting initialValue45 = initialized40;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue48 = recovery$indy$flow$359(initialValue46, initialValue47);
        recovery$indy$flow$360(this, initialValue48);
        net.C_47TU initialized49 = new net.C_47TU(constructorKey5, this, "HurtTimeStrafeInAir", 0.0D, Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue50 = recovery$indy$flow$363(this);
        long initialValue51 = constructorKey4;
        java.lang.Object initialValue52 = initialValue50;
        net.C_47TU initialValue53 = initialized49;
        java.lang.Object initialValue54 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue56 = recovery$indy$flow$366(initialValue54, initialValue55, initialValue51);
        recovery$indy$flow$367(this, initialValue56);
        client.setting.BooleanSetting initialized57 = new client.setting.BooleanSetting(this, constructorKey6, "BackwardsStrafe", true);
        recovery$indy$flow$370(this, initialized57);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$15(int a0,char a1,char a2,float a3,long a4,long a5);
    private static native void recovery$indy$flow$16(int a0,int a1,char a2,long a3,long a4);
    private static native void recovery$indy$flow$29(int a0,char a1,char a2,float a3,long a4,long a5);
    private static native boolean recovery$indy$flow$60(long a0,long a1,long a2);
    private static native double recovery$indy$flow$64(long a0,long a1,long a2);
    private static native boolean recovery$indy$flow$79(long a0,long a1,long a2);
    private static native double recovery$indy$flow$114(long a0,long a1,long a2);
    private static native boolean recovery$indy$flow$129(long a0,long a1,long a2);
    private static native double recovery$indy$flow$130(long a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$314(int a0);
    private static native void recovery$indy$flow$316(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$318(int a0);
    private static native void recovery$indy$flow$320(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$323(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$326(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$327(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$330(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$332(int a0);

    private static java.lang.Object recovery$indy$flow$335(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$336(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$339(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$340(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$343(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$346(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$347(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$350(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$352(int a0);

    private static java.lang.Object recovery$indy$flow$355(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$356(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$359(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$360(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$363(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$366(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$367(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$370(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native float recovery$indy$5(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(long var0, long var2);
   private static native String recovery$indy$17(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$18(int var0, long var1);
   private static native void recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$22(long var0, long var2, long var4);
   private static native boolean recovery$indy$23(long var0, long var2);
   private static native String recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$25(int var0, long var1);
   private static native void recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$32();
}
