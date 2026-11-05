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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_429;
import net.C_43r;
import net.C_45n;
import net.C_46j;
import net.C_473U;
import net.C_4749;
import net.C_475P;
import net.C_475c;
import net.C_475y;
import net.C_477r;
import net.C_478Q;
import net.C_478i;
import net.C_479E;
import net.C_479J;
import net.C_479N;
import net.C_479m;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47ET;
import net.C_47Ij;
import client.module.Module;
import net.C_47Rw;
import net.C_47Rz;
import net.C_47S6;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import net.C_47TT;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47UH;
import net.C_47UZ;
import net.C_47Vc;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47i;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47od;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_47xz;
import net.C_47zh;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class NoFall_47Qp extends client.module.Module implements net.C_47UH,net.C_47xz,net.C_47iC,net.C_48T,net.C_47Rz,net.C_47od,net.C_47Vc,net.C_47mz {
    public client.setting.ModeSetting settingMode; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCollisionFallDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinFallDist = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinLegitFallDist = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRandomizeYaw = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingBlinkMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBlinkStartFallDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47gg field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_429 field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478Q field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478Q field_450; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 93446394500336L;
      long var9 = var5 ^ 115002472062334L;
      long var11 = var5 ^ 13538434133415L;
      long var10000 = 1773281650620035691L;
      boolean var13 = AirStuck_47Q4.method_45$aae029aa0a();
      Minecraft var31 = field_43;
      if (var13) {
         long var10001 = 1767000333452118272L;
         Minecraft var14 = field_43;
         if (var14.field_44Q == null) {
            return;
         }

         var31 = field_43;
      }

      long var35 = 1772772020376540045L;
      Minecraft var15 = var31;
      EntityPlayerSP var32 = var15.field_42P;
      if (var13) {
         if (var15.field_42P == null) {
            return;
         }

         var35 = 1772772020376540045L;
         Minecraft var16 = field_43;
         var32 = var16.field_42P;
      }

      int var33 = var32.field_48y;
      boolean var37 = var13;
      if (var4 >= 0) {
         if (var13) {
            if (var32.field_48y < 100) {
               return;
            }

            var35 = 1772772020376540045L;
            Minecraft var17 = field_43;
            double var34 = var17.field_42P.field_48_;
            long var10003 = 1765494972061316311L;
            long var18 = var7;
            NumberSetting var20 = this.settingBlinkStartFallDistance;
            double var41;
            var33 = (var41 = var34 - var20.method_44$474dfaa627(var18)) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
         }

         var37 = var13;
      }

      if (var4 > 0) {
         if (var37) {
            if (var33 <= 0) {
               return;
            }

            long var10002 = 1773031197002306631L;
            long var21 = var9;
            ModeSetting var23 = this.settingBlinkMode;
            var33 = (int) ((var23.method_46$5f9dc63072(var21).equals("OnlyIncoming")) ? 1 : 0);
         }

         var37 = var13;
      }

      label49: {
         if (var37) {
            if (var33 != 0) {
               break label49;
            }

            long var39 = 1773031197002306631L;
            long var24 = var9;
            ModeSetting var26 = this.settingBlinkMode;
            var33 = (int) ((var26.method_46$5f9dc63072(var24).equals("Both")) ? 1 : 0);
         }

         if (var33 == 0) {
            return;
         }
      }

      long var40 = 1765756098476849044L;
      boolean var27 = true;
      long var28 = var11;
      C_47zh var30 = var1;
      var30.method_47$b757cde368(var28, var27);
   }




    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, net.C_47ob var3) {
        net.C_479E var125;
        augustus.recovered.modules.player.NoFall_47Qp var127;
        net.C_473U var130;
        net.C_473U var131;
        augustus.recovered.modules.player.NoFall_47Qp var134;
        augustus.recovered.modules.player.NoFall_47Qp var137;
        int var138;
        int var139;
        int var140;
        int var142;
        int var143;
        int var145;
        int var146;
        augustus.recovered.modules.player.NoFall_47Qp var149;
        augustus.recovered.modules.player.NoFall_47Qp var152;
      long var4 = var1 ^ 17925729311181L;
      byte var6 = ((byte) (AirStuck_47Q4.method_45$aae029aa0a() ? 1 : 0));
      net.C_47ob var11 = var3;
      net.C_473U var7 = var11.method_46$96fcbedb66();
      if (var6 != 0) {
         net.minecraft.client.Minecraft var12 = field_43;
         if (var12.field_42P != null) {
            net.minecraft.client.Minecraft var57 = field_43;
            if (var57.field_44Q != null) {
               label1371: {
                  label1372: {
                     label1373: {
                        net.C_473U var141;
                        byte var157;
                        label1374: {
                           label1375: {
                              label1376: {
                                 C_479E var41;
                                 label1092: {
                                    label1294: {
                                       label1243: {
                                          label1295: {
                                             label1296: {
                                                byte var9;
                                                label1297: {
                                                   label1248: {
                                                      label1377: {
                                                         label1078: {
                                                            label1250: {
                                                               label1251: {
                                                                  label1075: {
                                                                     label1074: {
                                                                        label1252: {
                                                                           String var29;
                                                                           label1253: {
                                                                              label1254: {
                                                                                 label1255: {
                                                                                    label1256: {
                                                                                       label1068: {
                                                                                          label1067: {
                                                                                             long var58 = var4;
                                                                                             client.setting.ModeSetting var59 = this.settingMode;
                                                                                             var29 = var59.method_46$5f9dc63072(var58);
                                                                                             var9 = ((byte) (-1));
                                                                                             switch (var29.hashCode()) {
                                                                                                case -1721492669:
                                                                                                   var139 = ((var29.equals("Vulcan")) ? 1 : 0);
                                                                                                   var157 = var6;
                                                                                                   if (var1 > 0L) {
                                                                                                      break label1075;
                                                                                                   }
                                                                                                   break label1068;
                                                                                                case -661292916:
                                                                                                   if (!var29.equals("OnGround2")) {
                                                                                                      break label1254;
                                                                                                   }

                                                                                                   var9 = ((byte) (2));
                                                                                                   var140 = var6;
                                                                                                   if (var1 >= 0L) {
                                                                                                      if (var6 != 0) {
                                                                                                         if (var6 != 0) {
                                                                                                            net.minecraft.client.Minecraft var102 = field_43;
                                                                                                            if (var102.field_42P.field_48R > 3.0F
                                                                                                               && var7 instanceof C_479E) {
                                                                                                               var41 = (C_479E)var7;
                                                                                                               var41.method_49$f633c984d8(true);
                                                                                                            }

                                                                                                            return;
                                                                                                         }

                                                                                                         var41 = (C_479E)var7;
                                                                                                         var41.method_49$f633c984d8(false);
                                                                                                         net.minecraft.client.Minecraft var62 = field_43;
                                                                                                         var62.field_42P.field_48R = -1.0F;
                                                                                                         var143 = var6;
                                                                                                         break label1078;
                                                                                                      }

                                                                                                      var139 = ((var29.equals("Vulcan")) ? 1 : 0);
                                                                                                      var157 = var6;
                                                                                                      if (var1 > 0L) {
                                                                                                         break label1075;
                                                                                                      }
                                                                                                      break label1255;
                                                                                                   }
                                                                                                   break label1256;
                                                                                                case 82544993:
                                                                                                   if (!var29.equals("Verus")) {
                                                                                                      break label1254;
                                                                                                   }

                                                                                                   var9 = ((byte) (1));
                                                                                                   var138 = var6;
                                                                                                   if (var1 > 0L) {
                                                                                                      break label1253;
                                                                                                   }
                                                                                                   break;
                                                                                                case 370287304:
                                                                                                   if (var29.equals("NoGround")) {
                                                                                                      var9 = ((byte) (0));
                                                                                                      if (var1 > 0L) {
                                                                                                         if (var6 != 0 || !var29.equals("Verus")) {
                                                                                                            break label1297;
                                                                                                         }

                                                                                                         var9 = ((byte) (1));
                                                                                                         var138 = var6;
                                                                                                         break label1253;
                                                                                                      }

                                                                                                      if (var6 == 0) {
                                                                                                         break label1067;
                                                                                                      }

                                                                                                      var9 = ((byte) (1));
                                                                                                      var138 = var6;
                                                                                                      break;
                                                                                                   }
                                                                                                default:
                                                                                                   break label1254;
                                                                                             }

                                                                                             if (var138 != 0) {
                                                                                                var9 = ((byte) (2));
                                                                                                var140 = var6;
                                                                                                if (var1 >= 0L) {
                                                                                                   if (var6 == 0) {
                                                                                                      var139 = ((var29.equals("Vulcan")) ? 1 : 0);
                                                                                                      var157 = var6;
                                                                                                   } else {
                                                                                                      var139 = var9;
                                                                                                      var157 = var6;
                                                                                                   }
                                                                                                   break label1255;
                                                                                                }
                                                                                                break label1256;
                                                                                             }
                                                                                          }

                                                                                          var139 = var9;
                                                                                          var157 = var6;
                                                                                       }

                                                                                       if (var157 != 0) {
                                                                                          switch (var139) {
                                                                                             case 0:
                                                                                                var139 = ((var7 instanceof C_479E) ? 1 : 0);
                                                                                                break;
                                                                                             case 1:
                                                                                                var143 = ((var7 instanceof C_479E) ? 1 : 0);
                                                                                                var157 = var6;
                                                                                                if (var1 >= 0L) {
                                                                                                   break label1377;
                                                                                                }
                                                                                                break label1251;
                                                                                             case 2:
                                                                                                net.minecraft.client.Minecraft var103 = field_43;
                                                                                                if (!(var103.field_42P.field_48R > 3.0F)
                                                                                                   || !(var7 instanceof C_479E)) {
                                                                                                   return;
                                                                                                }

                                                                                                var41 = (C_479E)var7;
                                                                                                var141 = var41;
                                                                                                var157 = ((byte) (1));
                                                                                                if (var1 >= 0L) {
                                                                                                   break label1374;
                                                                                                }
                                                                                                break label1243;
                                                                                             case 3:
                                                                                                var141 = var7;
                                                                                                if (var6 != 0) {
                                                                                                   if (!(var7 instanceof C_479E)) {
                                                                                                      return;
                                                                                                   }

                                                                                                   var141 = var7;
                                                                                                }

                                                                                                var41 = (C_479E)var141;
                                                                                                net.minecraft.client.Minecraft var110 = field_43;
                                                                                                float var169;
                                                                                                var145 = (var169 = var110.field_42P.field_48R - 3.0F) == 0.0F
                                                                                                   ? 0
                                                                                                   : (var169 < 0.0F ? -1 : 1);
                                                                                                var157 = var6;
                                                                                                if (var1 < 0L) {
                                                                                                   break label1376;
                                                                                                }
                                                                                                break label1092;
                                                                                             default:
                                                                                                return;
                                                                                          }
                                                                                       }

                                                                                       if (var139 == 0) {
                                                                                          return;
                                                                                       }

                                                                                       var41 = (C_479E)var7;
                                                                                       var41.method_49$f633c984d8(false);
                                                                                       net.minecraft.client.Minecraft var64 = field_43;
                                                                                       var64.field_42P.field_48R = -1.0F;
                                                                                       var143 = var6;
                                                                                       if (var1 < 0L) {
                                                                                          break label1074;
                                                                                       }
                                                                                       break label1252;
                                                                                    }

                                                                                    if (var6 != 0) {
                                                                                       switch (var140) {
                                                                                          case 0:
                                                                                             var140 = ((var7 instanceof C_479E) ? 1 : 0);
                                                                                             break;
                                                                                          case 1:
                                                                                             var143 = ((var7 instanceof C_479E) ? 1 : 0);
                                                                                             break label1074;
                                                                                          case 2:
                                                                                             net.minecraft.client.Minecraft var100 = field_43;
                                                                                             float var165;
                                                                                             var142 = (var165 = var100.field_42P.field_48R - 3.0F) == 0.0F
                                                                                                ? 0
                                                                                                : (var165 < 0.0F ? -1 : 1);
                                                                                             break label1248;
                                                                                          case 3:
                                                                                             var141 = var7;
                                                                                             var157 = var6;
                                                                                             break label1243;
                                                                                          default:
                                                                                             return;
                                                                                       }
                                                                                    }

                                                                                    if (var140 == 0) {
                                                                                       return;
                                                                                    }

                                                                                    var41 = (C_479E)var7;
                                                                                    var41.method_49$f633c984d8(false);
                                                                                    net.minecraft.client.Minecraft var60 = field_43;
                                                                                    var60.field_42P.field_48R = -1.0F;
                                                                                    var143 = var6;
                                                                                    break label1074;
                                                                                 }

                                                                                 if (var157 != 0) {
                                                                                    switch (var139) {
                                                                                       case 0:
                                                                                          var139 = ((var7 instanceof C_479E) ? 1 : 0);
                                                                                          break;
                                                                                       case 1:
                                                                                          break label1250;
                                                                                       case 2:
                                                                                          net.minecraft.client.Minecraft var101 = field_43;
                                                                                          float var168;
                                                                                          var146 = (var168 = var101.field_42P.field_48R - 3.0F) == 0.0F
                                                                                             ? 0
                                                                                             : (var168 < 0.0F ? -1 : 1);
                                                                                          break label1295;
                                                                                       case 3:
                                                                                          var141 = var7;
                                                                                          if (var6 != 0) {
                                                                                             if (!(var7 instanceof C_479E)) {
                                                                                                return;
                                                                                             }

                                                                                             var141 = var7;
                                                                                          }

                                                                                          var41 = (C_479E)var141;
                                                                                          net.minecraft.client.Minecraft var109 = field_43;
                                                                                          float var171;
                                                                                          var145 = (var171 = var109.field_42P.field_48R - 3.0F) == 0.0F
                                                                                             ? 0
                                                                                             : (var171 < 0.0F ? -1 : 1);
                                                                                          var157 = var6;
                                                                                          break label1092;
                                                                                       default:
                                                                                          return;
                                                                                    }
                                                                                 }

                                                                                 if (var139 == 0) {
                                                                                    return;
                                                                                 }

                                                                                 var41 = (C_479E)var7;
                                                                                 var41.method_49$f633c984d8(false);
                                                                                 net.minecraft.client.Minecraft var61 = field_43;
                                                                                 var61.field_42P.field_48R = -1.0F;
                                                                                 var143 = var6;
                                                                                 break label1252;
                                                                              }

                                                                              if (var6 != 0) {
                                                                                 return;
                                                                              }

                                                                              var41 = (C_479E)var7;
                                                                              var41.method_49$f633c984d8(false);
                                                                              net.minecraft.client.Minecraft var63 = field_43;
                                                                              var63.field_42P.field_48R = -1.0F;
                                                                              var143 = var6;
                                                                              if (var1 >= 0L) {
                                                                                 break label1078;
                                                                              }
                                                                              break label1074;
                                                                           }

                                                                           if (var138 != 0 || !var29.equals("OnGround2")) {
                                                                              break label1297;
                                                                           }

                                                                           var9 = ((byte) (2));
                                                                           if (var6 != 0) {
                                                                              break label1297;
                                                                           }

                                                                           var139 = ((var29.equals("Vulcan")) ? 1 : 0);
                                                                           var157 = var6;
                                                                           break label1075;
                                                                        }

                                                                        if (var143 != 0) {
                                                                           return;
                                                                        }
                                                                        break label1250;
                                                                     }

                                                                     var157 = var6;
                                                                     break label1251;
                                                                  }

                                                                  if (var157 == 0) {
                                                                     break label1296;
                                                                  }

                                                                  if (var139 != 0) {
                                                                     var9 = ((byte) (3));
                                                                  }
                                                                  break label1297;
                                                               }

                                                               if (var157 != 0) {
                                                                  if (var143 != 0) {
                                                                     break label1373;
                                                                  }

                                                                  var143 = ((var7 instanceof C_479J) ? 1 : 0);
                                                               }

                                                               if (var143 != 0) {
                                                                  break label1373;
                                                               }

                                                               var41 = (C_479E)var7;
                                                               var41.method_49$f633c984d8(true);
                                                               net.minecraft.client.Minecraft var97 = field_43;
                                                               var97.field_42P.field_48R = 0.0F;
                                                               var142 = var6;
                                                               break label1248;
                                                            }

                                                            var143 = ((var7 instanceof C_479E) ? 1 : 0);
                                                            var157 = var6;
                                                            break label1377;
                                                         }

                                                         if (var143 != 0) {
                                                            return;
                                                         }

                                                         byte var147 = ((byte) (var7 instanceof C_479E ? 1 : 0));
                                                         if (var6 != 0) {
                                                            if (var147 == 0) {
                                                               return;
                                                            }

                                                            net.minecraft.client.Minecraft var66 = field_43;
                                                            float var166;
                                                            var147 = (byte)((var166 = var66.field_42P.field_48R - 2.0F) == 0.0F ? 0 : (var166 < 0.0F ? -1 : 1));
                                                         }

                                                         if (var6 != 0) {
                                                            if (var147 <= 0) {
                                                               return;
                                                            }

                                                            var147 = ((byte) (var7 instanceof C_479m ? 1 : 0));
                                                         }

                                                         label1259: {
                                                            if (var6 != 0) {
                                                               if (var147 != 0) {
                                                                  break label1259;
                                                               }

                                                               var147 = ((byte) (var7 instanceof C_479N ? 1 : 0));
                                                            }

                                                            if (var6 != 0) {
                                                               if (var147 != 0) {
                                                                  break label1259;
                                                               }

                                                               var147 = ((byte) (var7 instanceof C_479J ? 1 : 0));
                                                            }

                                                            if (var147 == 0) {
                                                               var41 = (C_479E)var7;
                                                               var41.method_49$f633c984d8(true);
                                                               net.minecraft.client.Minecraft var95 = field_43;
                                                               var95.field_42P.field_48R = 0.0F;
                                                               var146 = var6;
                                                               if (var1 > 0L) {
                                                                  break label1294;
                                                               }
                                                               break label1295;
                                                            }
                                                         }

                                                         var3.cancel();
                                                         net.minecraft.client.Minecraft var70 = field_43;
                                                         net.minecraft.client.Minecraft var75 = field_43;
                                                         net.minecraft.client.Minecraft var80 = field_43;
                                                         double var161 = var80.field_42P.field_48j + 1.0;
                                                         net.minecraft.client.Minecraft var85 = field_43;
                                                         var70.field_42P
                                                            .field_49m
                                                            .method_43$631790539f(
                                                               new C_479J(var75.field_42P.field_48Q, var161, var85.field_42P.field_42o, true)
                                                            );
                                                         net.minecraft.client.Minecraft var90 = field_43;
                                                         var90.field_42P.field_48R = 0.0F;
                                                         return;
                                                      }

                                                      if (var157 != 0) {
                                                         if (var143 == 0) {
                                                            return;
                                                         }

                                                         net.minecraft.client.Minecraft var67 = field_43;
                                                         float var167;
                                                         var143 = (byte)((var167 = var67.field_42P.field_48R - 2.0F) == 0.0F ? 0 : (var167 < 0.0F ? -1 : 1));
                                                      }

                                                      if (var6 != 0) {
                                                         if (var143 <= 0) {
                                                            return;
                                                         }

                                                         var143 = ((var7 instanceof C_479m) ? 1 : 0);
                                                      }

                                                      if (var6 != 0) {
                                                         if (var143 != 0) {
                                                            break label1375;
                                                         }

                                                         var143 = ((var7 instanceof C_479N) ? 1 : 0);
                                                      }

                                                      if (var6 != 0) {
                                                         if (var143 != 0) {
                                                            break label1375;
                                                         }

                                                         var143 = ((var7 instanceof C_479J) ? 1 : 0);
                                                      }

                                                      if (var143 != 0) {
                                                         break label1375;
                                                      }

                                                      var41 = (C_479E)var7;
                                                      var41.method_49$f633c984d8(true);
                                                      net.minecraft.client.Minecraft var96 = field_43;
                                                      var96.field_42P.field_48R = 0.0F;
                                                      var146 = var6;
                                                      break label1295;
                                                   }

                                                   if (var142 <= 0 || !(var7 instanceof C_479E)) {
                                                      return;
                                                   }

                                                   var41 = (C_479E)var7;
                                                   var141 = var41;
                                                   var157 = ((byte) (1));
                                                   break label1243;
                                                }

                                                var139 = var9;
                                             }

                                             label1260: {
                                                if (var6 != 0) {
                                                   switch (var139) {
                                                      case 0:
                                                         var139 = ((var7 instanceof C_479E) ? 1 : 0);
                                                         break;
                                                      case 1:
                                                         break label1260;
                                                      case 2:
                                                         break label1372;
                                                      case 3:
                                                         var141 = var7;
                                                         if (var6 != 0) {
                                                            if (!(var7 instanceof C_479E)) {
                                                               return;
                                                            }

                                                            var141 = var7;
                                                         }

                                                         label1263: {
                                                            var41 = (C_479E)var141;
                                                            net.minecraft.client.Minecraft var112 = field_43;
                                                            float var173;
                                                            int var151 = (var173 = var112.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var173 < 0.0F ? -1 : 1);
                                                            if (var6 != 0) {
                                                               if (var151 > 0) {
                                                                  var41.method_49$f633c984d8(true);
                                                                  net.minecraft.client.Minecraft var116 = field_43;
                                                                  var116.field_42P.field_48R = 0.0F;
                                                                  this.field_42 = 1;
                                                               }

                                                               var152 = this;
                                                               if (var6 == 0) {
                                                                  break label1263;
                                                               }

                                                               var151 = this.field_42;
                                                            }

                                                            if (var151 != 1) {
                                                               return;
                                                            }

                                                            net.minecraft.client.Minecraft var122 = field_43;
                                                            var122.field_42P.field_42 = -0.011;
                                                            var152 = this;
                                                         }

                                                         var152.field_42 = 0;
                                                         return;
                                                      default:
                                                         return;
                                                   }
                                                }

                                                if (var139 == 0) {
                                                   return;
                                                }

                                                var41 = (C_479E)var7;
                                                var41.method_49$f633c984d8(false);
                                                net.minecraft.client.Minecraft var65 = field_43;
                                                var65.field_42P.field_48R = -1.0F;
                                                if (var6 != 0) {
                                                   return;
                                                }
                                             }

                                             byte var153 = ((byte) (var7 instanceof C_479E ? 1 : 0));
                                             if (var6 != 0) {
                                                if (var153 == 0) {
                                                   return;
                                                }

                                                net.minecraft.client.Minecraft var68 = field_43;
                                                float var170;
                                                var153 = (byte)((var170 = var68.field_42P.field_48R - 2.0F) == 0.0F ? 0 : (var170 < 0.0F ? -1 : 1));
                                             }

                                             if (var6 != 0) {
                                                if (var153 <= 0) {
                                                   return;
                                                }

                                                var153 = ((byte) (var7 instanceof C_479m ? 1 : 0));
                                             }

                                             if (var6 != 0) {
                                                if (var153 != 0) {
                                                   break label1371;
                                                }

                                                var153 = ((byte) (var7 instanceof C_479N ? 1 : 0));
                                             }

                                             if (var6 != 0) {
                                                if (var153 != 0) {
                                                   break label1371;
                                                }

                                                var153 = ((byte) (var7 instanceof C_479J ? 1 : 0));
                                             }

                                             if (var153 != 0) {
                                                break label1371;
                                             }

                                             var41 = (C_479E)var7;
                                             var41.method_49$f633c984d8(true);
                                             net.minecraft.client.Minecraft var98 = field_43;
                                             var98.field_42P.field_48R = 0.0F;
                                             var146 = var6;
                                             break label1294;
                                          }

                                          if (var146 <= 0 || !(var7 instanceof C_479E)) {
                                             return;
                                          }

                                          var41 = (C_479E)var7;
                                          var141 = var41;
                                          var157 = ((byte) (1));
                                          break label1374;
                                       }

                                       if (var157 != 0 && !(var141 instanceof C_479E)) {
                                          return;
                                       }

                                       net.minecraft.client.Minecraft var111 = field_43;
                                       float var172;
                                       var145 = (var172 = var111.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var172 < 0.0F ? -1 : 1);
                                       var157 = var6;
                                       break label1376;
                                    }

                                    if (var146 != 0) {
                                       return;
                                    }
                                    break label1372;
                                 }

                                 label1261: {
                                    if (var157 != 0) {
                                       if (var145 > 0) {
                                          var41.method_49$f633c984d8(true);
                                          net.minecraft.client.Minecraft var115 = field_43;
                                          var115.field_42P.field_48R = 0.0F;
                                          this.field_42 = 1;
                                       }

                                       var149 = this;
                                       if (var6 == 0) {
                                          break label1261;
                                       }

                                       var145 = this.field_42;
                                    }

                                    if (var145 != 1) {
                                       return;
                                    }

                                    net.minecraft.client.Minecraft var120 = field_43;
                                    var120.field_42P.field_42 = -0.011;
                                    var149 = this;
                                 }

                                 var149.field_42 = 0;
                                 return;
                              }

                              if (var145 == var157) {
                                 net.minecraft.client.Minecraft var121 = field_43;
                                 var121.field_42P.field_42 = -0.011;
                                 this.field_42 = 0;
                              }

                              return;
                           }

                           var3.cancel();
                           net.minecraft.client.Minecraft var71 = field_43;
                           net.minecraft.client.Minecraft var76 = field_43;
                           net.minecraft.client.Minecraft var81 = field_43;
                           double var162 = var81.field_42P.field_48j + 1.0;
                           net.minecraft.client.Minecraft var86 = field_43;
                           var71.field_42P.field_49m.method_43$631790539f(new C_479J(var76.field_42P.field_48Q, var162, var86.field_42P.field_42o, true));
                           net.minecraft.client.Minecraft var91 = field_43;
                           var91.field_42P.field_48R = 0.0F;
                           return;
                        }

                        ((net.C_479E) (var141)).method_49$f633c984d8((boolean)((((int) (var157)) & 1) != 0));
                        return;
                     }

                     var3.cancel();
                     net.minecraft.client.Minecraft var72 = field_43;
                     net.minecraft.client.Minecraft var77 = field_43;
                     net.minecraft.client.Minecraft var82 = field_43;
                     double var163 = var82.field_42P.field_48j + 1.0;
                     net.minecraft.client.Minecraft var87 = field_43;
                     var72.field_42P.field_49m.method_43$631790539f(new C_479J(var77.field_42P.field_48Q, var163, var87.field_42P.field_42o, true));
                     net.minecraft.client.Minecraft var92 = field_43;
                     var92.field_42P.field_48R = 0.0F;
                     return;
                  }

                  net.minecraft.client.Minecraft var104 = field_43;
                  if (var104.field_42P.field_48R > 3.0F && var7 instanceof C_479E) {
                     C_479E var56 = (C_479E)var7;
                     var56.method_49$f633c984d8(true);
                  }

                  return;
               }

               var3.cancel();
               net.minecraft.client.Minecraft var73 = field_43;
               net.minecraft.client.Minecraft var78 = field_43;
               net.minecraft.client.Minecraft var83 = field_43;
               double var164 = var83.field_42P.field_48j + 1.0;
               net.minecraft.client.Minecraft var88 = field_43;
               var73.field_42P.field_49m.method_43$631790539f(new C_479J(var78.field_42P.field_48Q, var164, var88.field_42P.field_42o, true));
               net.minecraft.client.Minecraft var93 = field_43;
               var93.field_42P.field_48R = 0.0F;
               return;
            }
         }
      } else {
         net.minecraft.client.Minecraft var13 = field_43;
         if (var13.field_44Q != null) {
            int var128;
            byte var154;
            label1379: {
               label1380: {
                  C_479E var10;
                  label1299: {
                     label1270: {
                        label1271: {
                           long var14 = var4;
                           client.setting.ModeSetting var16 = this.settingMode;
                           String var8 = var16.method_46$5f9dc63072(var14);
                           var128 = var8.hashCode();
                           net.C_473U var129;
                           if (var6 != 0) {
                              switch (var128) {
                                 case 0:
                                    var129 = var7;
                                    break;
                                 case 1:
                                    var128 = ((int) (var7 instanceof C_479E ? 1 : 0));
                                    var154 = var6;
                                    if (var1 >= 0L) {
                                       break label1379;
                                    }
                                    break label1271;
                                 case 2:
                                    net.minecraft.client.Minecraft var25 = field_43;
                                    if (var25.field_42P.field_48R == 3.0F) {
                                       return;
                                    }

                                    var10 = (C_479E)var7;
                                    var125 = var10;
                                    if (var1 >= 0L) {
                                       var10.method_49$f633c984d8(true);
                                       net.C_473U var126 = var7;
                                       if (var6 != 0) {
                                          if (!(var7 instanceof C_479E)) {
                                             return;
                                          }

                                          var126 = var7;
                                       }

                                       var10 = (C_479E)var126;
                                       net.minecraft.client.Minecraft var105 = field_43;
                                       float var174;
                                       var128 = (var174 = var105.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var174 < 0.0F ? -1 : 1);
                                       var154 = var6;
                                       break label1299;
                                    }
                                    break label1270;
                                 case 3:
                                    net.C_473U var123 = var7;
                                    if (var6 != 0) {
                                       if (!(var7 instanceof C_479E)) {
                                          return;
                                       }

                                       var123 = var7;
                                    }

                                    var10 = (C_479E)var123;
                                    net.minecraft.client.Minecraft var26 = field_43;
                                    float var175;
                                    var128 = (var175 = var26.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var175 < 0.0F ? -1 : 1);
                                    var154 = var6;
                                    if (var1 < 0L) {
                                       break label1380;
                                    }
                                    break label1299;
                                 default:
                                    return;
                              }
                           } else {
                              if (var128 == 0) {
                                 return;
                              }

                              var129 = var7;
                           }

                           var10 = (C_479E)var129;
                           var10.method_49$f633c984d8(false);
                           net.minecraft.client.Minecraft var17 = field_43;
                           var17.field_42P.field_48R = -1.0F;
                           var128 = var6;
                           if (var1 >= 0L) {
                              if (var6 != 0) {
                                 return;
                              }

                              var128 = ((int) (var7 instanceof C_479E ? 1 : 0));
                              var154 = var6;
                              break label1379;
                           }

                           var154 = var6;
                        }

                        label1213: {
                           label1212: {
                              if (var154 != 0) {
                                 if (var128 == 0) {
                                    var130 = var7;
                                    break label1213;
                                 }
                              } else if (var128 == 0) {
                                 break label1212;
                              }

                              var3.cancel();
                              net.minecraft.client.Minecraft var19 = field_43;
                              net.minecraft.client.Minecraft var20 = field_43;
                              net.minecraft.client.Minecraft var21 = field_43;
                              double var10004 = var21.field_42P.field_48j + 1.0;
                              net.minecraft.client.Minecraft var22 = field_43;
                              var19.field_42P.field_49m.method_43$631790539f(new C_479J(var20.field_42P.field_48Q, var10004, var22.field_42P.field_42o, true));
                              net.minecraft.client.Minecraft var23 = field_43;
                              var23.field_42P.field_48R = 0.0F;
                           }

                           var130 = var7;
                        }

                        var10 = (C_479E)var130;
                        var10.method_49$f633c984d8(true);
                        net.minecraft.client.Minecraft var24 = field_43;
                        var24.field_42P.field_48R = 0.0F;
                        if (var6 == 0) {
                           return;
                        }

                        var10 = (C_479E)var7;
                        var125 = var10;
                        boolean var155 = true;
                     }

                     if (!(var125 instanceof C_479E)) {
                        return;
                     }

                     net.minecraft.client.Minecraft var106 = field_43;
                     float var176;
                     var128 = (var176 = var106.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var176 < 0.0F ? -1 : 1);
                     var154 = var6;
                     break label1380;
                  }

                  label1272: {
                     if (var154 != 0) {
                        if (var128 > 0) {
                           var10.method_49$f633c984d8(true);
                           net.minecraft.client.Minecraft var27 = field_43;
                           var27.field_42P.field_48R = 0.0F;
                           this.field_42 = 1;
                        }

                        var127 = this;
                        if (var6 == 0) {
                           break label1272;
                        }

                        var128 = this.field_42;
                     }

                     if (var128 != 1) {
                        return;
                     }

                     net.minecraft.client.Minecraft var28 = field_43;
                     var28.field_42P.field_42 = -0.011;
                     var127 = this;
                  }

                  var127.field_42 = 0;
                  return;
               }

               if (var128 == var154) {
                  net.minecraft.client.Minecraft var117 = field_43;
                  var117.field_42P.field_42 = -0.011;
                  this.field_42 = 0;
               }

               return;
            }

            if (var154 != 0) {
               if (var128 == 0) {
                  return;
               }

               net.minecraft.client.Minecraft var18 = field_43;
               float var177;
               var128 = (var177 = var18.field_42P.field_48R - 2.0F) == 0.0F ? 0 : (var177 < 0.0F ? -1 : 1);
            }

            if (var6 != 0) {
               if (var128 <= 0) {
                  return;
               }

               var128 = ((int) (var7 instanceof C_479m ? 1 : 0));
            }

            label1157: {
               label1156: {
                  label1155: {
                     if (var6 != 0) {
                        if (var128 != 0) {
                           break label1155;
                        }

                        var128 = ((int) (var7 instanceof C_479N ? 1 : 0));
                     }

                     if (var6 != 0) {
                        if (var128 == 0) {
                           var131 = var7;
                           break label1157;
                        }
                     } else if (var128 == 0) {
                        break label1156;
                     }
                  }

                  var3.cancel();
                  net.minecraft.client.Minecraft var69 = field_43;
                  net.minecraft.client.Minecraft var74 = field_43;
                  net.minecraft.client.Minecraft var79 = field_43;
                  double var160 = var79.field_42P.field_48j + 1.0;
                  net.minecraft.client.Minecraft var84 = field_43;
                  var69.field_42P.field_49m.method_43$631790539f(new C_479J(var74.field_42P.field_48Q, var160, var84.field_42P.field_42o, true));
                  net.minecraft.client.Minecraft var89 = field_43;
                  var89.field_42P.field_48R = 0.0F;
               }

               var131 = var7;
            }

            C_479E var35 = (C_479E)var131;
            var35.method_49$f633c984d8(true);
            net.minecraft.client.Minecraft var94 = field_43;
            var94.field_42P.field_48R = 0.0F;
            if (var1 > 0L) {
               if (var6 == 0) {
                  net.minecraft.client.Minecraft var99 = field_43;
                  if (var99.field_42P.field_48R != 3.0F) {
                     var35 = (C_479E)var7;
                     var35.method_49$f633c984d8(true);
                     net.C_473U var135 = var7;
                     if (var6 != 0) {
                        if (!(var7 instanceof C_479E)) {
                           return;
                        }

                        var135 = var7;
                     }

                     label1275: {
                        var35 = (C_479E)var135;
                        net.minecraft.client.Minecraft var108 = field_43;
                        float var178;
                        var128 = (var178 = var108.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var178 < 0.0F ? -1 : 1);
                        if (var6 != 0) {
                           if (var128 > 0) {
                              var35.method_49$f633c984d8(true);
                              net.minecraft.client.Minecraft var114 = field_43;
                              var114.field_42P.field_48R = 0.0F;
                              this.field_42 = 1;
                           }

                           var137 = this;
                           if (var6 == 0) {
                              break label1275;
                           }

                           var128 = this.field_42;
                        }

                        if (var128 != 1) {
                           return;
                        }

                        net.minecraft.client.Minecraft var119 = field_43;
                        var119.field_42P.field_42 = -0.011;
                        var137 = this;
                     }

                     var137.field_42 = 0;
                  }
               }
            } else {
               if (var6 != 0) {
                  var35 = (C_479E)var7;
                  var35.method_49$f633c984d8(true);
                  net.C_473U var132 = var7;
                  if (var6 != 0) {
                     if (!(var7 instanceof C_479E)) {
                        return;
                     }

                     var132 = var7;
                  }

                  label1278: {
                     var35 = (C_479E)var132;
                     net.minecraft.client.Minecraft var107 = field_43;
                     float var179;
                     var128 = (var179 = var107.field_42P.field_48R - 3.0F) == 0.0F ? 0 : (var179 < 0.0F ? -1 : 1);
                     if (var6 != 0) {
                        if (var128 > 0) {
                           var35.method_49$f633c984d8(true);
                           net.minecraft.client.Minecraft var113 = field_43;
                           var113.field_42P.field_48R = 0.0F;
                           this.field_42 = 1;
                        }

                        var134 = this;
                        if (var6 == 0) {
                           break label1278;
                        }

                        var128 = this.field_42;
                     }

                     if (var128 != 1) {
                        return;
                     }

                     net.minecraft.client.Minecraft var118 = field_43;
                     var118.field_42P.field_42 = -0.011;
                     var134 = this;
                  }

                  var134.field_42 = 0;
               }
            }
         }
      }
   }






   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 112262448012066L;
      long var4 = var2 ^ 22084335986032L;
      long var10001 = var2 ^ 84726979948789L;
      int var6 = (int)((var2 ^ 84726979948789L) >>> 48);
      int var7 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6875436656333010331L;
      boolean var9 = AirStuck_47Q4.method_45$aae029aa0a();
      this.field_43y++;
      NoFall_47Qp var22 = this;
      if (var9) {
         long var10002 = -6875467248413397943L;
         long var10 = var4;
         ModeSetting var12 = this.settingMode;
         if (!var12.method_46$5f9dc63072(var10).equals("Legit")) {
            return;
         }

         var22 = this;
      }

      if (var22.field_450 != null) {
         char var24 = (char)var6;
         char var10004 = (char)var8;
         long var10005 = -6878730823443645143L;
         char var13 = var10004;
         NoFall_47Qp var14 = this;
         int var15 = var7;
         char var16 = var24;
         C_47S6 var17 = ClientGlobals.field_46;
         if (var17.method_49$dc3f815dad(var16, var15, var14, var13)) {
            var10001 = -6878516377063837133L;
            Minecraft var18 = field_43;
            if (var18.field_42Y != null) {
               int var23 = this.field_438;
               byte var26 = -1;
               if (var9) {
                  if (this.field_438 == -1) {
                     return;
                  }

                  var23 = this.field_43y;
                  var26 = 2;
               }

               if (var23 > var26) {
                  var10001 = -6878516377063837133L;
                  Minecraft var19 = field_43;
                  if (var19.field_42Y.field_49 == C_47Az.BLOCK) {
                     long var28 = -6877363207797735574L;
                     byte var20 = 1;
                     C_475c var21 = var1;
                     var21.method_48$d00df7729d(var20);
                     this.field_43y = 0;
                  }
               }

               return;
            }
         }
      }
   }




   public void method_40$6f6970ed3f(long var1, C_46j var3) {
      net.C_478Q var26;
      long var4 = var1 ^ 71165683526949L;
      long var6 = var1 ^ 137287473161387L;
      long var10000 = 2400338171912022201L;
      boolean var8 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 2399862516729326994L;
      long var10 = var6;
      ModeSetting var12 = this.settingMode;
      if (var12.method_46$5f9dc63072(var10).equals(recovery$indy$1(3186, 4378364435105450388L ^ var1))) {
         long var10001 = 2400192678259370584L;
         Minecraft var13 = field_43;
         EntityPlayerSP var23 = var13.field_42P;
         if (!var8) {
            if (var13.field_42P == null) {
               return;
            }

            var10001 = 2400192678259370584L;
            Minecraft var14 = field_43;
            var23 = var14.field_42P;
         }

         double var24 = var23.field_48R;
         long var10003 = 2401922828121984258L;
         long var15 = var4;
         NumberSetting var17 = this.settingCollisionFallDistance;
         double var34;
         int var25 = (var34 = var24 - var17.method_44$474dfaa627(var15)) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
         boolean var28 = var8;
         if (var1 >= 0L) {
            if (!var8) {
               if (var25 <= 0) {
                  return;
               }

               var10001 = 2402019274580456101L;
               C_46j var18 = var3;
               var25 = (int) ((var18.method_47$e084f7739d() instanceof C_475P) ? 1 : 0);
            }

            var28 = var8;
         }

         label59: {
            if (!var28) {
               if (var25 == 0) {
                  return;
               }

               var10001 = 2401706358294579444L;
               C_46j var19 = var3;
               var26 = var19.method_43$5730377d31();
               if (var8) {
                  break label59;
               }

               double var35;
               var25 = (var35 = var26.method_43$8abf5c6871() + 1 - this.field_430) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
            }

            if (var25 >= 0) {
               return;
            }

            var10001 = 2401706358294579444L;
            C_46j var20 = var3;
            var26 = var20.method_43$5730377d31();
         }

         C_478Q var9 = var26;
         C_478i var32 = ((net.C_478i) (new C_478i(var9.method_40$8abf5c6871(), var9.method_43$8abf5c6871(), var9.method_47$8abf5c6871(), var9.method_40$8abf5c6871() + 1, var9.method_43$8abf5c6871() + 1, var9.method_47$8abf5c6871() + 1)));
         var10002 = 2401033954394276179L;
         C_478i var21 = var32;
         C_46j var22 = var3;
         var22.method_42$6059593eaa(var21);
      }
   }




   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4 = var2 ^ 72117992307098L;
      long var6 = var2 ^ 138480231952404L;
      long var8 = var2 ^ 27738005618893L;
      long var10000 = 8498823760673677057L;
      boolean var10 = AirStuck_47Q4.method_45$aae029aa0a();
      Minecraft var28 = field_43;
      if (var10) {
         long var10001 = 8498204650021807210L;
         Minecraft var11 = field_43;
         if (var11.field_44Q == null) {
            return;
         }

         var28 = field_43;
      }

      long var32 = 8498349297358470887L;
      Minecraft var12 = var28;
      EntityPlayerSP var29 = var12.field_42P;
      if (var10) {
         if (var12.field_42P == null) {
            return;
         }

         var32 = 8498349297358470887L;
         Minecraft var13 = field_43;
         var29 = var13.field_42P;
      }

      int var30 = var29.field_48y;
      boolean var34 = var10;
      if (var2 >= 0L) {
         if (var10) {
            if (var29.field_48y < 100) {
               return;
            }

            var32 = 8498349297358470887L;
            Minecraft var14 = field_43;
            double var31 = var14.field_42P.field_48_;
            long var10003 = 8496701747765811645L;
            long var15 = var4;
            NumberSetting var17 = this.settingBlinkStartFallDistance;
            double var38;
            var30 = (var38 = var31 - var17.method_44$474dfaa627(var15)) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
         }

         var34 = var10;
      }

      if (var2 > 0L) {
         if (var34) {
            if (var30 <= 0) {
               return;
            }

            long var10002 = 8498581740237125933L;
            long var18 = var6;
            ModeSetting var20 = this.settingBlinkMode;
            var30 = (int) ((var20.method_46$5f9dc63072(var18).equals("OnlyOutgoing")) ? 1 : 0);
         }

         var34 = var10;
      }

      label49: {
         if (var34) {
            if (var30 != 0) {
               break label49;
            }

            long var36 = 8498581740237125933L;
            long var21 = var6;
            ModeSetting var23 = this.settingBlinkMode;
            var30 = (int) ((var23.method_46$5f9dc63072(var21).equals("Both")) ? 1 : 0);
         }

         if (var30 == 0) {
            return;
         }
      }

      long var37 = 8496934301920090878L;
      boolean var24 = true;
      long var25 = var8;
      C_47zh var27 = var1;
      var27.method_47$b757cde368(var25, var24);
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 39284647450045L;
      long var3 = var1 ^ 89839460510703L;
      long var10002 = -5905860305839349034L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Legit");
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 29866292327914L;
      long var3 = var1 ^ 115611995409336L;
      long var10002 = -3576680793112067455L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Collision");
   }



   private int method_45$056bba07dc(char var1, char var2, int var3) {
      java.lang.Object var13;
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      ArrayList var7 = new ArrayList();
      int var10000 = (int) ((recovery$indy$2(-726309987354271973L, var4)) ? 1 : 0);
      int var8 = 36;
      byte var6 = (byte)var10000;

      while (true) {
         if (var8 < recovery$indy$3(field_43, -726644777498870019L, var4).field_429.field_46.size()) {
            C_47rf var9 = recovery$indy$4(field_43, -726644777498870019L, var4).field_429.method_46$4c10532da1(var8).method_48$ac4db64966();
            var10000 = var6;
            if (var2 > 0) {
               if (var6 != 0) {
                  var13 = var9;
                  if (var6 == 0) {
                     break;
                  }

                  label155:
                  if (var9 != null) {
                     label190: {
                        C_43r var14 = var9.method_48$dbd570a038();
                        C_43r var10001 = C_43r.method_46$4158f44b4a(326);
                        if (var6 != 0) {
                           if (var14 == var10001) {
                              boolean var15 = recovery$indy$5(field_43, -726644777498870019L, var4).method_48H$aae029aa0a();
                              if (var6 == 0) {
                                 break label155;
                              }

                              if (!var15) {
                                 break label190;
                              }
                           }

                           var14 = var9.method_48$dbd570a038();
                           var10001 = C_43r.method_46$4158f44b4a(325);
                        }

                        if (var14 != var10001) {
                           break label155;
                        }

                        float var23;
                        var10000 = (var23 = recovery$indy$6(field_43, -726644777498870019L, var4).field_48R - 0.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                        byte var22 = var6;
                        if (var1 >= 0) {
                           if (var6 != 0) {
                              if ((var10000) != 0) {
                                 break label155;
                              }

                              var10000 = (int) ((recovery$indy$7(field_43, -726644777498870019L, var4).method_48H$aae029aa0a()) ? 1 : 0);
                           }

                           var22 = var6;
                        }

                        if (var22 == 0 || !(var10000 != 0)) {
                           break label155;
                        }
                     }

                     var7.add(var8 - 36);
                  }

                  var8++;
               }

               var10000 = var6;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         byte var17 = (byte) ((var7.isEmpty()) ? 1 : 0);
         if (var3 >= 0 || var6 == 0) {
            return var17;
         }

         label118:
         if (var17 != 0) {
            var8 = 36;

            while (true) {
               if (var8 < recovery$indy$8(field_43, -726644777498870019L, var4).field_429.field_46.size()) {
                  C_47rf var11 = recovery$indy$9(field_43, -726644777498870019L, var4).field_429.method_46$4c10532da1(var8).method_48$ac4db64966();
                  if (var2 < 0) {
                     return var6;
                  }

                  if (var6 == 0) {
                     break;
                  }

                  var17 = var6;
                  if (var1 >= 0) {
                     if (var6 != 0) {
                        label130: {
                           C_47rf var20 = var11;
                           if (var2 > 0) {
                              if (var11 == null) {
                                 break label130;
                              }

                              var20 = var11;
                           }

                           if (var20.method_48$dbd570a038() == C_43r.method_46$4158f44b4a(30)) {
                              var17 = (byte) ((recovery$indy$10(field_43, -726644777498870019L, var4).method_48H$aae029aa0a()) ? 1 : 0);
                              if (var6 == 0) {
                                 return var17;
                              }

                              if (var17 == 0) {
                                 return var8 - 36;
                              }
                           }
                        }

                        var8++;
                     }

                     var17 = var6;
                  }

                  if (var17 != 0) {
                     continue;
                  }
               }

               if (var3 >= 0) {
                  return var6;
               }

               if (var6 == 0) {
                  break label118;
               }
               break;
            }

            return -1;
         }

         var13 = var7.get(0);
         break;
      }

      return (Integer)var13;
   }




   private C_478Q method_47$7021b5bb10(short var1, int var2, int var3) {
      net.C_478Q var43;
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 25697977450072L;
      long var8 = var4 ^ 39480727143823L;
      long var10001 = 183247567760165276L;
      Minecraft var28 = field_43;
      double var11 = var28.field_42P.field_48Q;
      var10001 = 183247567760165276L;
      Minecraft var29 = field_43;
      double var13 = var29.field_42P.field_48j;
      var10001 = 183247567760165276L;
      Minecraft var30 = field_43;
      double var15 = var30.field_42P.field_42o;
      long var10000 = 183194269793380474L;
      boolean var41 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = 183247567760165276L;
      Minecraft var31 = field_43;
      double var17 = var31.field_42P.field_48s;
      var10002 = 183247567760165276L;
      Minecraft var32 = field_43;
      double var19 = var32.field_42P.field_42;
      var10002 = 183247567760165276L;
      Minecraft var33 = field_43;
      double var21 = var33.field_42P.field_487;
      var10002 = 183247567760165276L;
      Minecraft var34 = field_43;
      boolean var23 = var34.field_42P.field_48V;
      int var24 = 0;
      boolean var10 = var41;

      while (true) {
         if (var24 < 200) {
            var10001 = 183247567760165276L;
            Minecraft var35 = field_43;
            var10002 = 183247567760165276L;
            Minecraft var36 = field_43;
            long var10010 = 186616975080152905L;
            double[] var25 = C_47TT.method_45$65107dc15d(
               var35.field_42P.field_49w.field_40, var36.field_42P.field_49w.field_45, var17, var8, var19, var21, var11, var13, var15, var23
            );
            var23 = false;
            var11 = var25[0];
            var13 = var25[1];
            var15 = var25[2];
            var17 = var25[3];
            var19 = var25[4];
            var21 = var25[5];
            C_478Q var26 = ((net.C_478Q) (new C_478Q(var11, var13, var15)));
            var10001 = 185919733926597393L;
            Minecraft var37 = field_43;
            C_475y var27 = var37.field_44Q.method_46$efbf73d2b1(var26).method_48$e084f7739d();
            boolean var42 = var27 instanceof C_47ET;
            if (var10) {
               if (var42) {
                  return null;
               }

               var43 = var26;
               if (!var10) {
                  break;
               }

               var10002 = 186870274302521227L;
               C_478Q var38 = var26;
               long var39 = var6;
               var42 = method_43$133d77006a(var39, var38);
            }

            if (var42) {
               var43 = var26;
               break;
            }

            var24++;
            if (var10) {
               continue;
            }
         }

         return null;
      }

      return var43;
   }




   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      long var4 = var2 ^ 110944363308965L;
      long var6 = var2 ^ 97315520376363L;
      long var10000 = 3156902973397033529L;
      boolean var8 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 3156498187791443730L;
      long var9 = var6;
      ModeSetting var11 = this.settingMode;
      byte var18 = (byte) ((var11.method_46$5f9dc63072(var9).equals(recovery$indy$11(9486, 5633484929884662357L ^ var2))) ? 1 : 0);
      if (!var8) {
         if (var18 == 0) {
            return;
         }

         long var10001 = 3156766983432741080L;
         Minecraft var12 = field_43;
         double var19 = var12.field_42P.field_48R;
         long var10003 = 3158567365135353730L;
         long var13 = var4;
         NumberSetting var15 = this.settingCollisionFallDistance;
         double var22;
         var18 = (byte)((var22 = var19 - var15.method_44$474dfaa627(var13)) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1));
      }

      if (var18 <= 0) {
         var10002 = 3156766983432741080L;
         Minecraft var16 = field_43;
         long var21 = 3158853673332729988L;
         C_47Rw var17 = var1;
         this.field_430 = var16.field_42P.field_48j + var17.method_40$fedcb3e4d3();
      }
   }



   private static boolean method_43$133d77006a(long var0, C_478Q var2) {
      var0 = a ^ var0;
      C_47UZ var3 = recovery$indy$12(field_43, 5146194771239786223L, var0).method_46$efbf73d2b1(var2);
      C_475y var4 = var3.method_48$e084f7739d();
      return var4.method_47$61d5683948(
            recovery$indy$13(field_43, 5146194771239786223L, var0), var3, var2.method_40$8abf5c6871(), var2.method_43$8abf5c6871(), var2.method_47$8abf5c6871()
         )
         != null;
   }



   public void method_40G$e45a9973e5(long var1) {
      byte var91;
      int var93;
      net.minecraft.client.Minecraft var81;
      byte var97;
      net.C_478Q var100;
      byte var16;
      NoFall_47Qp var73;
      int var3 = (int)((var1 ^ 3101956278293L) >>> 56);
      long var4 = (var1 ^ 3101956278293L) << 8 >>> 8;
      long var6 = var1 ^ 104729863225817L;
      long var10001 = var1 ^ 6407505185672L;
      int var8 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var9 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 65625748161535L;
      int var11 = (int)((var1 ^ 65625748161535L) >>> 48);
      int var12 = (int)((var1 ^ 65625748161535L) << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      long var14 = var1 ^ 109012243908695L;
      long var10000 = -3624555502404294846L;
      var16 = (byte) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
      var73 = this;
      label244:
      if (var16 != 0) {
         label247: {
            byte var85 = -1;
            if (var1 >= 0L) {
               this.field_438 = -1;
               var10001 = -3624503247539648860L;
               Minecraft var20 = field_43;
               if (var20.field_42P == null) {
                  break label247;
               }

               var73 = this;
               var85 = var16;
            }

            if (var85 == 0) {
               break label244;
            }

            long var10002 = -3624806404697636498L;
            long var21 = var14;
            ModeSetting var23 = var73.settingMode;
            byte var75 = (byte) ((var23.method_46$5f9dc63072(var21).equals(recovery$indy$14(30775, 8753945465630593299L ^ var1))) ? 1 : 0);
            if (var1 > 0L) {
               if (var75 == 0) {
                  break label247;
               }

               var75 = 0;
            }

            int var17 = var75;
            var10001 = -3626331402233652183L;
            Minecraft var24 = field_43;
            long var10004 = -3624503247539648860L;
            Minecraft var25 = field_43;
            long var10005 = -3624503247539648860L;
            Minecraft var26 = field_43;
            long var10006 = -3624503247539648860L;
            Minecraft var27 = field_43;
            C_47UZ var18 = var24.field_44Q.method_46$efbf73d2b1(new C_478Q(var25.field_42P.field_48Q, var26.field_42P.field_48j, var27.field_42P.field_42o));
            C_475y var19 = var18.method_48$e084f7739d();
            int var76 = (int) ((var19 instanceof C_47ET) ? 1 : 0);
            byte var88 = var16;
            if (var1 > 0L) {
               if (var16 != 0) {
                  if (var76 != 0) {
                     int var77 = (Integer)var18.method_49$baa9c66b68(C_47ET.field_44);
                     if (var16 != 0) {
                        var77 = var77 == 0 ? 1 : 0;
                     }

                     var17 = var77;
                  }

                  var10001 = -3624503247539648860L;
                  Minecraft var28 = field_43;
                  double var78 = var28.field_42P.field_48R;
                  long var10003 = -3627288929639718402L;
                  long var29 = var6;
                  NumberSetting var31 = this.settingMinLegitFallDist;
                  double var118;
                  var76 = (var118 = var78 - var31.method_44$474dfaa627(var29)) == 0.0 ? 0 : (var118 < 0.0 ? -1 : 1);
               }

               var88 = var16;
            }

            label229: {
               label248: {
                  label227: {
                     label226: {
                        label249: {
                           label250: {
                              if (var1 >= 0L) {
                                 if (var88 != 0) {
                                    if (var76 > 0) {
                                       break label250;
                                    }

                                    var10001 = -3624503247539648860L;
                                    Minecraft var32 = field_43;
                                    var76 = (int) ((var32.field_42P.method_48H$aae029aa0a()) ? 1 : 0);
                                 }

                                 var88 = var16;
                              }

                              if (var88 == 0) {
                                 break label248;
                              }

                              if (var76 == 0) {
                                 break label249;
                              }

                              var76 = var17;
                              if (var16 == 0) {
                                 break label248;
                              }

                              if (var17 == 0) {
                                 break label249;
                              }
                           }

                           var73 = this;
                           var91 = var16;
                           if (var1 < 0L) {
                              break label227;
                           }

                           if (var16 == 0) {
                              break label226;
                           }

                           if (this.field_450 != null) {
                              char var92 = (char)var11;
                              char var101 = (char)var12;
                              var10004 = -3627373478963626321L;
                              int var33 = var13;
                              char var34 = var101;
                              char var35 = var92;
                              NoFall_47Qp var36 = this;
                              var76 = var36.method_45$056bba07dc(var35, var34, var33);
                              var93 = -1;
                              if (var16 == 0) {
                                 break label229;
                              }

                              label208:
                              if (var76 != -1) {
                                 Minecraft var79 = field_43;
                                 if (var16 != 0) {
                                    var10001 = -3625979358755922156L;
                                    Minecraft var37 = field_43;
                                    if (var37.field_42Y == null) {
                                       break label208;
                                    }

                                    var79 = field_43;
                                 }

                                 label201: {
                                    var10001 = -3624503247539648860L;
                                    Minecraft var38 = var79;
                                    float var119;
                                    var76 = (var119 = var38.field_42P.field_48R - 0.0F) == 0.0F ? 0 : (var119 < 0.0F ? -1 : 1);
                                    label200:
                                    if (var16 != 0) {
                                       label198: {
                                          if (var76 == 0) {
                                             var76 = var17;
                                             if (var16 == 0) {
                                                break label200;
                                             }

                                             label195:
                                             if (var17 != 0) {
                                                C_478Q var80 = this.field_46;
                                                if (var16 != 0) {
                                                   if (this.field_46 == null) {
                                                      break label195;
                                                   }

                                                   var81 = field_43;
                                                   if (var16 == 0) {
                                                      break label198;
                                                   }

                                                   var10001 = -3625979358755922156L;
                                                   Minecraft var39 = field_43;
                                                   var80 = var39.field_42Y.method_49$5730377d31();
                                                }

                                                if (var80 != null) {
                                                   var10002 = -3625979358755922156L;
                                                   Minecraft var40 = field_43;
                                                   var76 = (int) ((this.field_46.method_40$91754b766b(var40.field_42Y.method_49$5730377d31())) ? 1 : 0);
                                                   var97 = var16;
                                                   if (var1 < 0L) {
                                                      break label201;
                                                   }

                                                   if (var16 == 0) {
                                                      break label200;
                                                   }

                                                   if (var76 != 0) {
                                                      char var103 = (char)var11;
                                                      char var107 = (char)var12;
                                                      var10005 = -3627373478963626321L;
                                                      int var41 = var13;
                                                      char var42 = var107;
                                                      char var43 = var103;
                                                      NoFall_47Qp var44 = this;
                                                      this.field_438 = var44.method_45$056bba07dc(var43, var42, var41);
                                                   }
                                                }
                                             }
                                          }

                                          var81 = field_43;
                                       }

                                       var10001 = -3624503247539648860L;
                                       Minecraft var45 = var81;
                                       double var82 = var45.field_42P.field_48R;
                                       long var108 = -3627288929639718402L;
                                       long var46 = var6;
                                       NumberSetting var48 = this.settingMinLegitFallDist;
                                       double var120;
                                       var76 = (var120 = var82 - var48.method_44$474dfaa627(var46)) == 0.0 ? 0 : (var120 < 0.0 ? -1 : 1);
                                    }

                                    var97 = var16;
                                 }

                                 if (var97 == 0) {
                                    break label248;
                                 }

                                 if (var76 > 0) {
                                    var76 = var17;
                                    if (var16 == 0) {
                                       break label248;
                                    }

                                    if (var17 == 0) {
                                       byte var83 = (byte)var3;
                                       var10004 = -3626414661302643825L;
                                       C_47S6 var49 = ClientGlobals.field_46;
                                       C_477r var109 = var49.method_47$4f8050086d();
                                       long var10007 = -3626284857394031616L;
                                       double var50 = 0.0;
                                       double var52 = 10.0;
                                       double var54 = 10.0;
                                       C_477r var56 = var109;
                                       float var57 = 1.0F;
                                       long var58 = var4;
                                       byte var60 = var83;
                                       if (C_4749.method_47$cc73fc11d5(var60, var58, var57, var56, var54, var52, var50).field_49 == C_47Az.BLOCK) {
                                          char var104 = (char)var11;
                                          char var110 = (char)var12;
                                          var10005 = -3627373478963626321L;
                                          int var61 = var13;
                                          char var62 = var110;
                                          char var63 = var104;
                                          NoFall_47Qp var64 = this;
                                          this.field_438 = var64.method_45$056bba07dc(var63, var62, var61);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var73 = this;
                     }

                     var91 = var16;
                  }

                  if (var91 == 0) {
                     break label244;
                  }

                  var76 = var73.field_438;
               }

               var93 = -1;
            }

            if (var76 != var93) {
               char var111 = (char)var9;
               char var114 = (char)var10;
               var10006 = -3625854055909221990L;
               int var65 = this.field_438;
               char var66 = var114;
               char var67 = var111;
               byte var68 = 1;
               NoFall_47Qp var69 = this;
               int var70 = var8;
               C_47i.method_43$95cbd1eb82(var70, var69, var68, var67, var66, var65);
            }
         }

         var73 = this;
      }

      label158: {
         long var105 = -3625979358755922156L;
         Minecraft var71 = field_43;
         C_47Ij var99 = var71.field_42Y;
         if (var16 != 0) {
            if (var71.field_42Y == null) {
               var100 = null;
               break label158;
            }

            var105 = -3625979358755922156L;
            Minecraft var72 = field_43;
            var99 = var72.field_42Y;
         }

         var100 = var99.method_49$5730377d31();
      }

      var73.field_46 = var100;
   }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$15(this, 7, var3, -7101241038936456929L, var1);
      recovery$indy$16(this, 40, var3, -7101241038936456929L, var1);
      recovery$indy$17(this, 26, var3, -7101241038936456929L, var1);
      recovery$indy$18(this, 34, var3, -7101241038936456929L, var1);
      recovery$indy$19(this, 3, var3, -7101241038936456929L, var1);
      recovery$indy$20(this, 20, var3, -7101241038936456929L, var1);
      recovery$indy$21(this, 43, var3, -7101241038936456929L, var1);
      recovery$indy$22(this, 25, var3, -7101241038936456929L, var1);
   }



   private boolean method_42G$aae029aa0a() {
      long var1 = a ^ 11836138438916L;
      long var3 = var1 ^ 132818013683542L;
      long var10002 = -4993645161692350865L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("OnGround1");
   }



   private boolean method_42k$aae029aa0a() {
      long var1 = a ^ 87680608731566L;
      long var3 = var1 ^ 67832328765436L;
      long var10002 = -425230264887609659L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Legit");
   }



   private boolean method_426$aae029aa0a() {
      long var1 = a ^ 89903025436830L;
      long var3 = var1 ^ 39358672438988L;
      long var10002 = 4839497308016758773L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Legit");
   }



   private boolean method_42L$aae029aa0a() {
      long var1 = a ^ 55274121878513L;
      long var3 = var1 ^ 70687783118243L;
      long var10000 = 2325790994594908854L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = 2325610752965029018L;
      long var6 = var3;
      ModeSetting var8 = this.settingBlinkMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_42I$aae029aa0a() {
      long var1 = a ^ 81044725768388L;
      long var3 = var1 ^ 65672067587734L;
      long var10002 = 6589682528942970799L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Legit");
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 113186446332478L;
      long var8 = var4 ^ 99593642957744L;
      byte var10 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      net.minecraft.client.Minecraft var13 = field_43;
      if (var13.field_42P != null) {
         long var14 = var8;
         client.setting.ModeSetting var16 = this.settingMode;
         String var11 = var16.method_46$5f9dc63072(var14);
         byte var12 = -1;
         int var10000 = var11.hashCode();
         if (var10 == 0) {
            byte var68;
            byte var10001;
            switch (var10000) {
               case -661292917:
                  label279: {
                     label278:
                     if (var11.equals("OnGround1")) {
                        var12 = 0;
                        var68 = var10;
                        if (var1 > 0) {
                           if (var10 == 0) {
                              break label278;
                           }

                           var68 = ((byte) (var11.equals("Stop") ? 1 : 0));
                        }

                        label272:
                        if (var68 != 0) {
                           var12 = 1;
                           var68 = var10;
                           if (var1 >= 0) {
                              if (var10 == 0) {
                                 break label272;
                              }

                              var68 = ((byte) (var11.equals("AAC3") ? 1 : 0));
                           }

                           var10001 = var10;
                           if (var1 <= 0) {
                              break;
                           }

                           if (var10 != 0) {
                              break label279;
                           }

                           if (var68 != 0) {
                              var12 = 2;
                           }
                        }
                     }

                     var68 = var12;
                  }

                  var10001 = var10;
                  break;
               case 2001008:
                  var68 = ((byte) (var11.equals("AAC3") ? 1 : 0));
                  var10001 = var10;
                  if (var1 > 0) {
                     if (var10 == 0) {
                        if (var68 != 0) {
                           var12 = 2;
                        }

                        var68 = var12;
                     }

                     var10001 = var10;
                  }
                  break;
               case 2587682:
                  label259: {
                     label258:
                     if (var11.equals("Stop")) {
                        var12 = 1;
                        var68 = var10;
                        if (var1 >= 0) {
                           if (var10 == 0) {
                              break label258;
                           }

                           var68 = ((byte) (var11.equals("AAC3") ? 1 : 0));
                        }

                        var10001 = var10;
                        if (var1 <= 0) {
                           break;
                        }

                        if (var10 != 0) {
                           break label259;
                        }

                        if (var68 != 0) {
                           var12 = 2;
                        }
                     }

                     var68 = var12;
                  }

                  var10001 = var10;
                  break;
               default:
                  var68 = var12;
                  var10001 = var10;
            }

            if (var10001 == 0) {
               switch (var68) {
                  case 0:
                     net.minecraft.client.Minecraft var33 = field_43;
                     double var71 = var33.field_42P.field_48R;
                     long var18 = var6;
                     client.setting.NumberSetting var20 = this.settingMinFallDist;
                     if (var71 > var20.method_44$474dfaa627(var18)) {
                        net.minecraft.client.Minecraft var34 = field_43;
                        var34.field_42P.field_49m.method_45$631790539f(new net.C_479E(true));
                     }
                     break;
                  case 1:
                     net.minecraft.client.Minecraft var38 = field_43;
                     if (var38.field_42P.field_48R > 2.0F) {
                        net.minecraft.client.Minecraft var23 = field_43;
                        var23.field_42P.field_42 = 0.0;
                        net.minecraft.client.Minecraft var24 = field_43;
                        var24.field_42P.field_48M = true;
                        net.minecraft.client.Minecraft var25 = field_43;
                        var25.field_42P.field_49m.method_45$631790539f(new net.C_479E(true));
                        net.minecraft.client.Minecraft var26 = field_43;
                        var26.field_42P.field_48R = 0.0F;
                        var68 = var10;
                        if (var1 >= 0) {
                           if (var10 == 0) {
                              return;
                           }

                           net.minecraft.client.Minecraft var43 = field_43;
                           var68 = ((byte) (var43.method_46$aae029aa0a() ? 1 : 0));
                        }

                        if (var68 == 0) {
                           net.minecraft.client.Minecraft var44 = field_43;
                           if (var44.field_42P.field_48R > 2.0F) {
                              net.minecraft.client.Minecraft var49 = field_43;
                              net.minecraft.client.Minecraft var54 = field_43;
                              net.minecraft.client.Minecraft var59 = field_43;
                              var49.field_42P
                                 .field_49m
                                 .method_45$631790539f(new net.C_479J(var54.field_42P.field_48Q, Double.NaN, var59.field_42P.field_42o, false));
                              net.minecraft.client.Minecraft var64 = field_43;
                              var64.field_42P.field_48R = -99999.0F;
                           }
                        }
                     }
                     break;
                  case 2:
                     net.minecraft.client.Minecraft var42 = field_43;
                     if (!var42.method_46$aae029aa0a()) {
                        net.minecraft.client.Minecraft var28 = field_43;
                        if (var28.field_42P.field_48R > 2.0F) {
                           net.minecraft.client.Minecraft var48 = field_43;
                           net.minecraft.client.Minecraft var53 = field_43;
                           net.minecraft.client.Minecraft var58 = field_43;
                           var48.field_42P.field_49m.method_45$631790539f(new net.C_479J(var53.field_42P.field_48Q, Double.NaN, var58.field_42P.field_42o, false));
                           net.minecraft.client.Minecraft var63 = field_43;
                           var63.field_42P.field_48R = -99999.0F;
                        }
                     }
               }
            } else if (var68 > 0) {
               net.minecraft.client.Minecraft var35 = field_43;
               var35.field_42P.field_49m.method_45$631790539f(new net.C_479E(true));
            }
         } else {
            if (var10 == 0) {
               switch (var10000) {
                  case 0:
                     net.minecraft.client.Minecraft var17 = field_43;
                     var17.field_42P.field_49m.method_45$631790539f(new net.C_479E(true));
                     net.minecraft.client.Minecraft var36 = field_43;
                     var36.field_42P.field_48R = 0.0F;
                     byte var66 = var10;
                     if (var1 >= 0) {
                        if (var10 == 0) {
                           break;
                        }

                        net.minecraft.client.Minecraft var40 = field_43;
                        var66 = ((byte) (var40.method_46$aae029aa0a() ? 1 : 0));
                     }

                     if (var66 > 0) {
                        net.minecraft.client.Minecraft var46 = field_43;
                        net.minecraft.client.Minecraft var51 = field_43;
                        net.minecraft.client.Minecraft var56 = field_43;
                        var46.field_42P.field_49m.method_45$631790539f(new net.C_479J(var51.field_42P.field_48Q, Double.NaN, var56.field_42P.field_42o, false));
                        net.minecraft.client.Minecraft var61 = field_43;
                        var61.field_42P.field_48R = -99999.0F;
                     }
                     break;
                  case 1:
                     net.minecraft.client.Minecraft var22 = field_43;
                     var22.field_42P.field_48R = 0.0F;
                     byte var65 = var10;
                     if (var1 >= 0) {
                        if (var10 == 0) {
                           break;
                        }

                        net.minecraft.client.Minecraft var39 = field_43;
                        var65 = ((byte) (var39.method_46$aae029aa0a() ? 1 : 0));
                     }

                     if (var65 > 0) {
                        net.minecraft.client.Minecraft var45 = field_43;
                        net.minecraft.client.Minecraft var50 = field_43;
                        net.minecraft.client.Minecraft var55 = field_43;
                        var45.field_42P.field_49m.method_45$631790539f(new net.C_479J(var50.field_42P.field_48Q, Double.NaN, var55.field_42P.field_42o, false));
                        net.minecraft.client.Minecraft var60 = field_43;
                        var60.field_42P.field_48R = -99999.0F;
                     }
                     break;
                  case 2:
                     net.minecraft.client.Minecraft var27 = field_43;
                     if (((int) (var27.method_46$aae029aa0a() ? 1 : 0)) > 0) {
                        net.minecraft.client.Minecraft var29 = field_43;
                        net.minecraft.client.Minecraft var30 = field_43;
                        net.minecraft.client.Minecraft var31 = field_43;
                        var29.field_42P.field_49m.method_45$631790539f(new net.C_479J(var30.field_42P.field_48Q, Double.NaN, var31.field_42P.field_42o, false));
                        net.minecraft.client.Minecraft var32 = field_43;
                        var32.field_42P.field_48R = -99999.0F;
                     }
               }
            } else if (var10000 > 0) {
               net.minecraft.client.Minecraft var21 = field_43;
               var21.field_42P.field_49m.method_45$631790539f(new net.C_479E(true));
               net.minecraft.client.Minecraft var37 = field_43;
               var37.field_42P.field_48R = 0.0F;
               byte var67 = var10;
               if (var1 >= 0) {
                  if (var10 == 0) {
                     return;
                  }

                  net.minecraft.client.Minecraft var41 = field_43;
                  var67 = ((byte) (var41.method_46$aae029aa0a() ? 1 : 0));
               }

               if (var67 > 0) {
                  net.minecraft.client.Minecraft var47 = field_43;
                  net.minecraft.client.Minecraft var52 = field_43;
                  net.minecraft.client.Minecraft var57 = field_43;
                  var47.field_42P.field_49m.method_45$631790539f(new net.C_479J(var52.field_42P.field_48Q, Double.NaN, var57.field_42P.field_42o, false));
                  net.minecraft.client.Minecraft var62 = field_43;
                  var62.field_42P.field_48R = -99999.0F;
               }
            }
         }
      }
   }





   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 92608710488184L;
      long var8 = var4 ^ 32447737409149L;
      long var10 = var4 ^ 7668165369880L;
      boolean var12 = recovery$indy$23(2737511435018424077L, var4);
      this.field_45 = new C_47gg(var6);
      if (var12) {
         if (recovery$indy$24(field_43, 2737142542569090795L, var4) == null) {
            return;
         }

         this.field_438 = recovery$indy$25(field_43, 2737142542569090795L, var4).field_42X.field_42;
         recovery$indy$27(this, var8, recovery$indy$26(this.settingMode, var10, 2737480606772963617L, var4), 2729229678903856329L, var4);
      }
   }



   public void method_487$da8c82d5d4() {
      augustus.recovered.modules.player.NoFall_47Qp var73;
      long var1 = a ^ 117033835085810L;
      long var3 = var1 ^ 3321819975621L;
      long var5 = var1 ^ 39702344730670L;
      long var7 = var1 ^ 27728837604057L;
      long var10001 = var1 ^ 59552003374441L;
      int var9 = (int)((var1 ^ 59552003374441L) >>> 48);
      int var10 = (int)((var1 ^ 59552003374441L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 71417001691656L;
      int var12 = (int)((var1 ^ 71417001691656L) >>> 48);
      int var13 = (int)((var1 ^ 71417001691656L) << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      long var15 = var1 ^ 26933110702496L;
      var10001 = var1 ^ 138410340241604L;
      int var17 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var18 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var19 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4304083914163581518L;
      boolean var20 = AirStuck_47Q4.method_419$aae029aa0a();
      NoFall_47Qp var68 = this;
      if (!var20) {
         long var10003 = -4303925446425982823L;
         long var25 = var15;
         ModeSetting var27 = this.settingMode;
         String var10002 = var27.method_46$5f9dc63072(var25);
         var10003 = -4298627117463212687L;
         String var28 = var10002;
         long var29 = var3;
         NoFall_47Qp var31 = this;
         var31.method_47$d07b98bfef(var29, var28);
         var10001 = -4304220629943824557L;
         Minecraft var32 = field_43;
         if (var32.field_42P == null) {
            return;
         }

         var68 = this;
      }

      long var85 = -4303925446425982823L;
      long var33 = var15;
      ModeSetting var35 = var68.settingMode;
      byte var70 = (byte) ((var35.method_46$5f9dc63072(var33).equals("Legit")) ? 1 : 0);
      if (!var20) {
         if (var70 == 0) {
            return;
         }

         var70 = 0;
      }

      label97: {
         int var21 = var70;
         var10001 = -4297606578193246754L;
         Minecraft var36 = field_43;
         long var10004 = -4304220629943824557L;
         Minecraft var37 = field_43;
         long var10005 = -4304220629943824557L;
         Minecraft var38 = field_43;
         long var10006 = -4304220629943824557L;
         Minecraft var39 = field_43;
         C_47UZ var22 = var36.field_44Q.method_46$efbf73d2b1(new C_478Q(var37.field_42P.field_48Q, var38.field_42P.field_48j, var39.field_42P.field_42o));
         C_475y var23 = var22.method_48$e084f7739d();
         byte var71 = (byte) ((var23 instanceof C_47ET) ? 1 : 0);
         if (!var20) {
            if (var71 != 0) {
               int var72 = (Integer)var22.method_49$baa9c66b68(C_47ET.field_44);
               if (!var20) {
                  var72 = var72 == 0 ? 1 : 0;
               }

               var21 = var72;
            }

            var73 = this;
            if (var20) {
               break label97;
            }

            short var86 = (short)var9;
            var10005 = -4304011817211688015L;
            int var40 = var11;
            int var41 = var10;
            short var42 = var86;
            NoFall_47Qp var43 = this;
            this.field_450 = var43.method_47$7021b5bb10(var42, var41, var40);
            var10001 = -4304220629943824557L;
            Minecraft var44 = field_43;
            double var74 = var44.field_42P.field_48R;
            long var90 = -4296930248702679031L;
            long var45 = var5;
            NumberSetting var47 = this.settingMinLegitFallDist;
            double var97;
            var71 = (byte)((var97 = var74 - var47.method_44$474dfaa627(var45)) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1));
         }

         if (var71 <= 0) {
            var10001 = -4304220629943824557L;
            Minecraft var48 = field_43;
            int var75 = (int) ((var48.field_42P.method_48H$aae029aa0a()) ? 1 : 0);
            if (!var20) {
               if (var75 == 0) {
                  return;
               }

               var75 = var21;
            }

            if (var75 == 0) {
               return;
            }
         }

         var73 = this;
      }

      if (!var20) {
         if (var73.field_450 == null) {
            return;
         }

         var73 = this;
      }

      if (!var20) {
         char var83 = (char)var12;
         char var87 = (char)var13;
         long var92 = -4296574431408474280L;
         int var49 = var14;
         char var50 = var87;
         char var51 = var83;
         NoFall_47Qp var52 = var73;
         if (var52.method_45$056bba07dc(var51, var50, var49) == -1) {
            return;
         }

         var73 = this;
      }

      C_429 var76 = var73.field_44;
      var85 = -4304220629943824557L;
      Minecraft var53 = field_43;
      float var84 = var53.field_42P.field_48h;
      long var93 = -4298048543784752066L;
      C_47S6 var54 = ClientGlobals.field_46;
      C_477r var94 = var54.method_44$4f8050086d();
      long var96 = -4304141237803484841L;
      C_477r var55 = var94;
      long var56 = var7;
      float var58 = 90.0F;
      float var59 = var84;
      C_429 var60 = var76;
      C_477r var24 = var60.method_48$e39a948784(var59, var58, var56, var55);
      char var91 = (char)var17;
      long var10007 = -4297748879601442295L;
      NoFall_47Qp var61 = this;
      int var62 = var19;
      int var63 = var18;
      char var64 = var91;
      byte var65 = 4;
      C_477r var66 = var24;
      C_47S6 var67 = ClientGlobals.field_46;
      var67.method_45$c163d5afc8(var66, var65, var64, var63, var62, var61);
   }






    public NoFall_47Qp(long a0) {
        super((java.lang.String) ("NoFall"),(java.lang.String) ("KeinFallen"),(long) (((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 65479490171936L)),(java.awt.Color) (new java.awt.Color((int) (222),(int) (80),(int) (95),(int) (255))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.NoFall_47Qp.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 134883914034055L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 134883914034055L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 134883914034055L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 74185875242246L);
        long constructorKey7 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 43168996714510L);
        long constructorKey8 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 123393079280877L);
        long constructorKey9 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 66066791330225L);
        int constructorPart10 = (int) ((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 101543255435670L) >>> 32));
        int constructorPart11 = (int) (((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 101543255435670L) << 32) >>> 48));
        int constructorPart12 = (int) (((((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 101543255435670L) << 48) >>> 48));
        long constructorKey13 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 66741156681466L);
        long constructorKey14 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 82090287081531L);
        long constructorKey15 = ((augustus.recovered.modules.player.NoFall_47Qp.a ^ a0) ^ 114285073831868L);
        java.lang.Object initialValue16 = recovery$indy$flow$638(9);
        ((java.lang.Object[]) initialValue16)[0] = "OnGround1";
        ((java.lang.Object[]) initialValue16)[1] = "OnGround2";
        ((java.lang.Object[]) initialValue16)[2] = "NoGround";
        ((java.lang.Object[]) initialValue16)[3] = "Stop";
        ((java.lang.Object[]) initialValue16)[4] = "Legit";
        ((java.lang.Object[]) initialValue16)[5] = "Verus";
        ((java.lang.Object[]) initialValue16)[6] = "AAC3";
        ((java.lang.Object[]) initialValue16)[7] = "Collision";
        ((java.lang.Object[]) initialValue16)[8] = "Vulcan";
        client.setting.ModeSetting initialized17 = new client.setting.ModeSetting(this, "Mode", constructorKey8, "OnGround", (java.lang.String[]) (initialValue16));
        recovery$indy$flow$640(this, initialized17);
        client.setting.NumberSetting initialized18 = new client.setting.NumberSetting(this, "CollisionFallDistance", Double.longBitsToDouble(4611686018427387904L), constructorKey15, 0.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        short converted19 = (short) (constructorPart5);
        int initialValue20 = (int) (converted19);
        int initialValue21 = constructorPart4;
        java.lang.String initialValue22 = "FallDistance";
        int initialValue23 = constructorPart3;
        client.setting.NumberSetting initialValue24 = initialized18;
        java.lang.Object initialValue25 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue26 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue22))))));
        java.lang.Object initialValue27 = recovery$indy$flow$645(initialValue25, initialValue23, initialValue26, initialValue21, (short) (initialValue20));
        java.lang.Object initialValue28 = recovery$indy$flow$646(this);
        java.lang.Object initialValue29 = initialValue28;
        java.lang.Object initialValue30 = initialValue27;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue33 = recovery$indy$flow$649(initialValue31, initialValue32);
        recovery$indy$flow$650(this, initialValue33);
        client.setting.NumberSetting initialized34 = new client.setting.NumberSetting(this, "MinFallDist", Double.longBitsToDouble(4611686018427387904L), constructorKey15, 1.0D, Double.longBitsToDouble(4627448617123184640L), 0);
        java.lang.Object initialValue35 = recovery$indy$flow$653(this);
        java.lang.Object initialValue36 = initialValue35;
        client.setting.NumberSetting initialValue37 = initialized34;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue40 = recovery$indy$flow$656(initialValue38, initialValue39);
        recovery$indy$flow$657(this, initialValue40);
        client.setting.NumberSetting initialized41 = new client.setting.NumberSetting(this, "MinLegitFallDist", Double.longBitsToDouble(4618441417868443648L), constructorKey15, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4627448617123184640L), 1);
        short converted42 = (short) (constructorPart5);
        int initialValue43 = (int) (converted42);
        int initialValue44 = constructorPart4;
        java.lang.String initialValue45 = "MinFallDist";
        int initialValue46 = constructorPart3;
        client.setting.NumberSetting initialValue47 = initialized41;
        java.lang.Object initialValue48 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue49 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue50 = recovery$indy$flow$662(initialValue48, initialValue46, initialValue49, initialValue44, (short) (initialValue43));
        java.lang.Object initialValue51 = recovery$indy$flow$663(this);
        java.lang.Object initialValue52 = initialValue51;
        java.lang.Object initialValue53 = initialValue50;
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue56 = recovery$indy$flow$666(initialValue54, initialValue55);
        recovery$indy$flow$667(this, initialValue56);
        client.setting.SettingGroup initialized57 = new client.setting.SettingGroup(this, "Rotations", true, constructorKey9);
        java.lang.Object initialValue58 = recovery$indy$flow$670(this);
        char converted59 = (char) (constructorPart11);
        java.lang.Object initialValue60 = initialValue58;
        int initialValue61 = constructorPart12;
        int initialValue62 = (int) (converted59);
        int initialValue63 = constructorPart10;
        client.setting.SettingGroup initialValue64 = initialized57;
        java.lang.Object initialValue65 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue66 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue67 = recovery$indy$flow$673(initialValue65, initialValue63, (char) (initialValue62), initialValue61, initialValue66);
        recovery$indy$flow$674(this, initialValue67);
        client.setting.NumberSetting initialized68 = new client.setting.NumberSetting(this, "Delay", Double.longBitsToDouble(4637440978796412928L), constructorKey15, 0.0D, Double.longBitsToDouble(4656510908468559872L), 0);
        java.lang.Object initialValue69 = recovery$indy$flow$677(this);
        java.lang.Object initialValue70 = initialValue69;
        client.setting.NumberSetting initialValue71 = initialized68;
        java.lang.Object initialValue72 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue73 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue74 = recovery$indy$flow$680(initialValue72, initialValue73);
        recovery$indy$flow$681(this, initialValue74);
        client.setting.BooleanSetting initialized75 = new client.setting.BooleanSetting(this, constructorKey14, "RandomizeYaw", true);
        java.lang.Object initialValue76 = recovery$indy$flow$684(this);
        java.lang.Object initialValue77 = initialValue76;
        long initialValue78 = constructorKey6;
        client.setting.BooleanSetting initialValue79 = initialized75;
        java.lang.Object initialValue80 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue79))))));
        java.lang.Object initialValue81 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue82 = recovery$indy$flow$687(initialValue80, initialValue78, initialValue81);
        java.lang.Object initialValue83 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue82))))));
        recovery$indy$flow$689(this, initialValue83);
        java.lang.Object initialValue84 = recovery$indy$flow$691(4);
        ((java.lang.Object[]) initialValue84)[0] = "None";
        ((java.lang.Object[]) initialValue84)[1] = "OnlyIncoming";
        ((java.lang.Object[]) initialValue84)[2] = "OnlyOutgoing";
        ((java.lang.Object[]) initialValue84)[3] = "Both";
        client.setting.ModeSetting initialized85 = new client.setting.ModeSetting(this, "BlinkMode", constructorKey8, "None", (java.lang.String[]) (initialValue84));
        recovery$indy$flow$693(this, initialized85);
        client.setting.NumberSetting initialized86 = new client.setting.NumberSetting(this, "BlinkStartFallDistance", Double.longBitsToDouble(4613937818241073152L), constructorKey15, 1.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        java.lang.Object initialValue87 = recovery$indy$flow$696(this);
        java.lang.Object initialValue88 = initialValue87;
        client.setting.NumberSetting initialValue89 = initialized86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$699(initialValue90, initialValue91);
        recovery$indy$flow$700(this, initialValue92);
        net.C_47gg initialized93 = new net.C_47gg(constructorKey7);
        recovery$indy$flow$703(this, initialized93);
        java.lang.Object initialValue94 = ((java.lang.Object)(((augustus.recovered.modules.player.NoFall_47Qp) (((java.lang.Object)(this)))).settingRotations));
        net.C_429 initialized95 = new net.C_429(this, (client.setting.SettingGroup) (initialValue94), constructorKey13);
        recovery$indy$flow$707(this, initialized95);
        recovery$indy$flow$708(this, null);
        recovery$indy$flow$709(this, 0.0D);
        recovery$indy$flow$710(this, 0);
        recovery$indy$flow$711(this, 0);
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$638(int a0);
    private static void recovery$indy$flow$640(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).settingMode = ((client.setting.ModeSetting) (a1));
        return;
    }


    private static native java.lang.Object recovery$indy$flow$645(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$646(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$649(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$650(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$653(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$657(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$662(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$663(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$666(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$667(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$673(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$674(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$677(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$680(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$681(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$684(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$687(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$689(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$691(int a0);
    private static native void recovery$indy$flow$693(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$696(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$699(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$703(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_45 = ((net.C_47gg) (a1));
        return;
    }

    private static void recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_44 = ((net.C_429) (a1));
        return;
    }
    private static void recovery$indy$flow$708(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_46 = ((net.C_478Q) (a1));
        return;
    }
    private static void recovery$indy$flow$709(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$710(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$711(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.NoFall_47Qp) (a0)).field_42 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native String recovery$indy$11(int var0, long var1);
   private static native WorldClient recovery$indy$12(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$13(Object var0, long var1, long var3);
   private static native String recovery$indy$14(int var0, long var1);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$23(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native String recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$27(Object var0, long var1, Object var3, long var4, long var6);
   private static native MethodHandle recovery$constant$35();
}
