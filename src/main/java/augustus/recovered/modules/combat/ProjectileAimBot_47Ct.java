package augustus.recovered.modules.combat;
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
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_429;
import net.C_43R;
import net.C_43r;
import net.C_45n;
import net.C_45o;
import net.C_472n;
import net.C_473x;
import net.C_475c;
import net.C_476q;
import net.C_477r;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gg;
import net.C_47hN;
import net.C_47hi;
import net.C_47i;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sk;
import client.module.Category;
import net.C_47tU;
import net.C_47tf;
import net.C_47xz;
import net.C_48T;
import net.C_48p;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ProjectileAimBot_47Ct extends client.module.Module implements net.C_47xz,net.C_47UH,net.C_48T,net.C_47hi {
    private final client.setting.SettingGroup settingRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxTargetLookFovDiff = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCombat = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPredict = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyAtKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyKillAuraTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAssistAtRightClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_429 field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   private boolean method_402$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$1(1774895261825878873L, var1);
      boolean var10000 = recovery$indy$2(this.settingAssistAtRightClick, 1774555498410960418L, var1);
      if (var3 == null) {
         label47:
         if (var10000) {
            C_47rf var6 = recovery$indy$3(field_43, 1781531619297060921L, var1).method_48$ac4db64966();
            if (var3 == null) {
               if (var6 == null) {
                  break label47;
               }

               var6 = recovery$indy$4(field_43, 1781531619297060921L, var1).method_48$ac4db64966();
            }

            C_43r var4 = var6.method_48$dbd570a038();
            var10000 = var4 instanceof C_45o;
            if (var3 == null) {
               if (!var10000) {
                  var10000 = var4 instanceof C_43R;
                  if (var3 != null) {
                     return var10000;
                  }

                  if (!var10000) {
                     return false;
                  }
               }

               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }



    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private net.C_477r method_42$7e0c43c1fb(long var1, net.minecraft.entity.EntityLivingBase var3, int var4) {
        boolean var296;
        java.util.ArrayList var297;
        int[] var328;
      var1 = a ^ var1;
      long var5 = var1 ^ 97662372433226L;
      long var7 = var1 ^ 106497127077489L;
      long var9 = var1 ^ 130310806991324L;
      long var11 = var1 ^ 21572175169796L;
      long var13 = var1 ^ 96290785741544L;
      long var15 = var1 ^ 70535084423120L;
      long var10001 = var1 ^ 71331935012980L;
      int var17 = (int)((var1 ^ 71331935012980L) >>> 32);
      int var18 = (int)((var1 ^ 71331935012980L) << 32 >>> 56);
      int var19 = (int)(var10001 << 40 >>> 40);
      long var20 = var1 ^ 89611553917110L;
      long var22 = var1 ^ 89704685662231L;
      int[] var24 = (int[])recovery$indy$flow$14(-3367013589663284547L, var1);
      int var10000 = ((int) (recovery$indy$flow$15(this, var15, -3366541209477672578L, var1) ? 1 : 0));
      if (var24 == null) {
         net.C_47rf var25 = var10000 != 0
            ? ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$17(field_43, -3360526735694028323L, var1)).method_48$ac4db64966()
            : (
               recovery$indy$flow$19(this, var7, -3367639957693188183L, var1) < 0
                  ? null
                  : ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$21(field_43, -3360526735694028323L, var1))
                     .field_429
                     .method_46$4c10532da1(recovery$indy$flow$23(this, var7, -3367639957693188183L, var1) + 36)
                     .method_48$ac4db64966()
            );
         if (var25 == null) {
            return new net.C_477r(0.0F, 0.0F);
         }

         this.field_43y = 1;
         double var26 = var3.field_48w / 2.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         java.util.ArrayList var60 = new java.util.ArrayList();
         net.C_47tf var62 = (net.C_47tf)recovery$indy$flow$44(
            (java.util.ArrayList)recovery$indy$flow$43(
               var13,
               (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, -3360526735694028323L, var1),
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$35(field_43, -3360526735694028323L, var1)).field_48y,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$38(field_43, -3360526735694028323L, var1)).field_48y,
               0,
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$41(field_43, -3360526735694028323L, var1)).field_48y + 1,
               -3366833160994914119L,
               var1
            ),
            var11,
            0,
            -3360129611190136822L,
            var1
         );
         int var63 = 0;
         if (var63 >= var4) {
            if (var1 >= 0L) {
               return new net.C_477r(var57, var58);
            }

            label1218:
            while (true) {
               java.util.ArrayList var326 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                  var3,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                  var17,
                  true,
                  (byte)var18,
                  var19,
                  -3361016989020254574L,
                  var1
               );

               while (true) {
                  java.util.ArrayList var79 = var326;

                  while (true) {
                     double var118;
                     double var130;
                     double var142;
                     float var337;
                     float var341;
                     label1204: {
                        net.C_47tf var106 = (net.C_47tf)recovery$indy$flow$59(var79, var11, this.field_43y, -3360129611190136822L, var1);
                        var118 = var106.field_40;
                        var130 = var106.field_41;
                        var142 = var106.field_47;
                        double var169 = var118 - var62.field_40;
                        double var196 = var130
                           + this.field_45.method_41$bc607678b6()
                           - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                        double var223 = var142 - var62.field_47;
                        float var250 = (float)Math.toDegrees(Math.atan2(var223, var169)) - 90.0F;
                        var337 = (float)(
                           -(net.C_47sk.method_49$eb37070982(var196, net.C_47sk.method_42$44b37c2d95(var169 * var169 + var223 * var223)) * 180.0 / Math.PI)
                        );
                        var341 = recovery$indy$flow$78(
                           ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                           var250,
                           180.0F,
                           var9,
                           -3366946608509713305L,
                           var1
                        );
                        boolean var327 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                        if (var24 == null) {
                           if (var327) {
                              break label1204;
                           }

                           var327 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                        }

                        if (var327) {
                           return new net.C_477r(
                              var341 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                              recovery$indy$flow$92(
                                 ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                 var337 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 180.0F,
                                 var9,
                                 -3366946608509713305L,
                                 var1
                              )
                           );
                        }
                     }

                     float var266 = 0.0F;
                     if (var266 < 60.0F) {
                        byte var272 = 0;
                        byte var278 = -1;

                        while (var278 < 2) {
                           float var286 = var337 + var266 * var278;
                           net.C_47Kr var294 = new net.C_47Kr();
                           recovery$indy$flow$101(
                              var294,
                              var20,
                              (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                              var25,
                              var62.field_40,
                              var62.field_41,
                              var62.field_47,
                              var341,
                              var286,
                              -3361609908541176809L,
                              var1
                           );
                           recovery$indy$flow$105(
                              var294,
                              100,
                              var3,
                              new net.C_478i(var118 - var26, var130 + 0.2, var142 - var26, var118 + var26, var130 + var3.field_48, var142 + var26),
                              var22,
                              -3360944204658105796L,
                              var1
                           );
                           if (var24 != null) {
                              break;
                           }
                        }

                        if (var272 > var60.size() || this.field_43y <= 0) {
                           continue label1218;
                        }

                        var326 = var60;
                        break;
                     }

                     var63++;
                     if (var24 != null) {
                        continue label1218;
                     }
                  }
               }
            }
         } else {
            double var115;
            double var127;
            double var139;
            float var252;
            float var254;
            boolean var306;
            int[] var329;
            if (this.field_43y <= var60.size() && this.field_43y > 0) {
               java.util.ArrayList var324 = var60;
               if (var1 < 0L) {
                  while (true) {
                     java.util.ArrayList var78 = var324;

                     while (true) {
                        label1248: {
                           net.C_47tf var105 = (net.C_47tf)recovery$indy$flow$59(var78, var11, this.field_43y, -3360129611190136822L, var1);
                           var115 = var105.field_40;
                           var127 = var105.field_41;
                           var139 = var105.field_47;
                           double var168 = var115 - var62.field_40;
                           double var195 = var127
                              + this.field_45.method_41$bc607678b6()
                              - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                           double var222 = var139 - var62.field_47;
                           float var249 = (float)Math.toDegrees(Math.atan2(var222, var168)) - 90.0F;
                           var252 = (float)(
                              -(net.C_47sk.method_49$eb37070982(var195, net.C_47sk.method_42$44b37c2d95(var168 * var168 + var222 * var222)) * 180.0 / Math.PI)
                           );
                           var254 = recovery$indy$flow$78(
                              ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                              var249,
                              180.0F,
                              var9,
                              -3366946608509713305L,
                              var1
                           );
                           var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                           if (var24 == null) {
                              if (var306) {
                                 break label1248;
                              }

                              var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                           }

                           if (var306) {
                              return new net.C_477r(
                                 var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 recovery$indy$flow$92(
                                    ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                    var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                    180.0F,
                                    var9,
                                    -3366946608509713305L,
                                    var1
                                 )
                              );
                           }
                        }

                        float var265 = 0.0F;
                        if (var265 < 60.0F) {
                           byte var271 = 0;
                           byte var277 = -1;

                           while (var277 < 2) {
                              float var285 = var252 + var265 * var277;
                              net.C_47Kr var293 = new net.C_47Kr();
                              recovery$indy$flow$101(
                                 var293,
                                 var20,
                                 (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                                 var25,
                                 var62.field_40,
                                 var62.field_41,
                                 var62.field_47,
                                 var254,
                                 var285,
                                 -3361609908541176809L,
                                 var1
                              );
                              recovery$indy$flow$105(
                                 var293,
                                 100,
                                 var3,
                                 new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                                 var22,
                                 -3360944204658105796L,
                                 var1
                              );
                              if (var24 != null) {
                                 break;
                              }
                           }

                           if (var271 <= var60.size() && this.field_43y > 0) {
                              var324 = var60;
                              break;
                           }
                        } else {
                           var63++;
                           if (var24 == null) {
                              continue;
                           }
                        }

                        var324 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                           var3,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                           var17,
                           true,
                           (byte)var18,
                           var19,
                           -3361016989020254574L,
                           var1
                        );
                        break;
                     }
                  }
               }

               java.util.ArrayList var76 = var60;
               if (var24 != null) {
                  var76 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                     var3,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                     var17,
                     true,
                     (byte)var18,
                     var19,
                     -3361016989020254574L,
                     var1
                  );
               }

               net.C_47tf var102 = (net.C_47tf)recovery$indy$flow$59(var76, var11, this.field_43y, -3360129611190136822L, var1);
               var115 = var102.field_40;
               var127 = var102.field_41;
               var139 = var102.field_47;
               double var165 = var115 - var62.field_40;
               double var192 = var127
                  + this.field_45.method_41$bc607678b6()
                  - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
               double var219 = var139 - var62.field_47;
               float var246 = (float)Math.toDegrees(Math.atan2(var219, var165)) - 90.0F;
               var252 = (float)(-(net.C_47sk.method_49$eb37070982(var192, net.C_47sk.method_42$44b37c2d95(var165 * var165 + var219 * var219)) * 180.0 / Math.PI));
               var254 = recovery$indy$flow$78(
                  ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                  var246,
                  180.0F,
                  var9,
                  -3366946608509713305L,
                  var1
               );
               var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
               var329 = var24;
               if (var1 <= 0L) {
                  while (true) {
                     label1493: {
                        if (var329 == null) {
                           if (var306) {
                              break label1493;
                           }

                           var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                        }

                        if (var306) {
                           return new net.C_477r(
                              var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                              recovery$indy$flow$92(
                                 ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                 var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 180.0F,
                                 var9,
                                 -3366946608509713305L,
                                 var1
                              )
                           );
                        }
                     }

                     for (float var264 = 0.0F; var264 < 60.0F; var264 += 0.2F) {
                        boolean var270 = false;
                        byte var276 = -1;

                        while (var276 < 2) {
                           float var284 = var252 + var264 * var276;
                           net.C_47Kr var292 = new net.C_47Kr();
                           recovery$indy$flow$101(
                              var292,
                              var20,
                              (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                              var25,
                              var62.field_40,
                              var62.field_41,
                              var62.field_47,
                              var254,
                              var284,
                              -3361609908541176809L,
                              var1
                           );
                           recovery$indy$flow$105(
                              var292,
                              100,
                              var3,
                              new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                              var22,
                              -3360944204658105796L,
                              var1
                           );
                           if (var24 == null) {
                              break;
                           }

                           var276 += 2;
                           if (var24 != null) {
                              break;
                           }
                        }

                        if (var270) {
                           break;
                        }
                     }

                     var63++;
                     if (var24 != null) {
                        var76 = (java.util.ArrayList)recovery$indy$flow$57(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                           var3,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                           var17,
                           true,
                           (byte)var18,
                           var19,
                           -3361016989020254574L,
                           var1
                        );
                     }

                     var102 = (net.C_47tf)recovery$indy$flow$59(var76, var11, this.field_43y, -3360129611190136822L, var1);
                     var115 = var102.field_40;
                     var127 = var102.field_41;
                     var139 = var102.field_47;
                     var165 = var115 - var62.field_40;
                     var192 = var127
                        + this.field_45.method_41$bc607678b6()
                        - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                     var219 = var139 - var62.field_47;
                     var246 = (float)Math.toDegrees(Math.atan2(var219, var165)) - 90.0F;
                     var252 = (float)(-(net.C_47sk.method_49$eb37070982(var192, net.C_47sk.method_42$44b37c2d95(var165 * var165 + var219 * var219)) * 180.0 / Math.PI));
                     var254 = recovery$indy$flow$78(
                        ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                        var246,
                        180.0F,
                        var9,
                        -3366946608509713305L,
                        var1
                     );
                     var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                     var329 = var24;
                  }
               }
            } else {
               java.util.ArrayList var69 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                  var3,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                  var17,
                  true,
                  (byte)var18,
                  var19,
                  -3361016989020254574L,
                  var1
               );
               net.C_47tf var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
               var115 = var88.field_40;
               var127 = var88.field_41;
               var139 = var88.field_47;
               double var151 = var115 - var62.field_40;
               double var178 = var127
                  + this.field_45.method_41$bc607678b6()
                  - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
               double var205 = var139 - var62.field_47;
               float var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
               var252 = (float)(-(net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205)) * 180.0 / Math.PI));
               var254 = recovery$indy$flow$78(
                  ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                  var232,
                  180.0F,
                  var9,
                  -3366946608509713305L,
                  var1
               );
               var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
               var329 = var24;
               if (var1 <= 0L) {
                  while (true) {
                     label1521: {
                        if (var329 == null) {
                           if (var306) {
                              break label1521;
                           }

                           var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                        }

                        if (var306) {
                           return new net.C_477r(
                              var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                              recovery$indy$flow$92(
                                 ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                 var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 180.0F,
                                 var9,
                                 -3366946608509713305L,
                                 var1
                              )
                           );
                        }
                     }

                     float var261 = 0.0F;
                     if (var261 < 60.0F) {
                        byte var51 = 0;
                        byte var52 = -1;
                        if (var52 < 2) {
                           float var53 = var252 + var261 * var52;
                           net.C_47Kr var54 = new net.C_47Kr();
                           recovery$indy$flow$101(
                              var54,
                              var20,
                              (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                              var25,
                              var62.field_40,
                              var62.field_41,
                              var62.field_47,
                              var254,
                              var53,
                              -3361609908541176809L,
                              var1
                           );
                           recovery$indy$flow$105(
                              var54,
                              100,
                              var3,
                              new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                              var22,
                              -3360944204658105796L,
                              var1
                           );
                           int[] var307 = var24;
                           if (var1 < 0L) {
                              while (true) {
                                 if (var307 != null) {
                                    do {
                                       if (var51 <= var60.size() && this.field_43y > 0) {
                                          java.util.ArrayList var316 = var60;

                                          label1273:
                                          while (true) {
                                             var69 = var316;

                                             do {
                                                label1268: {
                                                   var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                   var115 = var88.field_40;
                                                   var127 = var88.field_41;
                                                   var139 = var88.field_47;
                                                   var151 = var115 - var62.field_40;
                                                   var178 = var127
                                                      + this.field_45.method_41$bc607678b6()
                                                      - (
                                                         var62.field_41
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var205 = var139 - var62.field_47;
                                                   var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                   var252 = (float)(
                                                      -(
                                                         net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                            * 180.0
                                                            / Math.PI
                                                      )
                                                   );
                                                   var254 = recovery$indy$flow$78(
                                                      ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                      var232,
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   );
                                                   var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                   if (var24 == null) {
                                                      if (var306) {
                                                         break label1268;
                                                      }

                                                      var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                   }

                                                   if (var306) {
                                                      return new net.C_477r(
                                                         var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         recovery$indy$flow$92(
                                                            ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                            var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                            180.0F,
                                                            var9,
                                                            -3366946608509713305L,
                                                            var1
                                                         )
                                                      );
                                                   }
                                                }

                                                var261 = 0.0F;
                                                if (var261 < 60.0F) {
                                                   break label1273;
                                                }

                                                var63++;
                                             } while (var24 == null);

                                             var316 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );
                                          }
                                       } else {
                                          label1288:
                                          while (true) {
                                             var69 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );

                                             do {
                                                label1284: {
                                                   var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                   var115 = var88.field_40;
                                                   var127 = var88.field_41;
                                                   var139 = var88.field_47;
                                                   var151 = var115 - var62.field_40;
                                                   var178 = var127
                                                      + this.field_45.method_41$bc607678b6()
                                                      - (
                                                         var62.field_41
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var205 = var139 - var62.field_47;
                                                   var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                   var252 = (float)(
                                                      -(
                                                         net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                            * 180.0
                                                            / Math.PI
                                                      )
                                                   );
                                                   var254 = recovery$indy$flow$78(
                                                      ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                      var232,
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   );
                                                   var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                   if (var24 == null) {
                                                      if (var306) {
                                                         break label1284;
                                                      }

                                                      var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                   }

                                                   if (var306) {
                                                      return new net.C_477r(
                                                         var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         recovery$indy$flow$92(
                                                            ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                            var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                            180.0F,
                                                            var9,
                                                            -3366946608509713305L,
                                                            var1
                                                         )
                                                      );
                                                   }
                                                }

                                                var261 = 0.0F;
                                                if (var261 < 60.0F) {
                                                   break label1288;
                                                }

                                                var63++;
                                             } while (var24 == null);
                                          }
                                       }

                                       var51 = 0;
                                       var52 = -1;
                                    } while (var52 >= 2);
                                 } else {
                                    while (var52 >= 2) {
                                       if (var51 <= var60.size() && this.field_43y > 0) {
                                          java.util.ArrayList var313 = var60;

                                          label1308:
                                          while (true) {
                                             var69 = var313;

                                             do {
                                                label1303: {
                                                   var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                   var115 = var88.field_40;
                                                   var127 = var88.field_41;
                                                   var139 = var88.field_47;
                                                   var151 = var115 - var62.field_40;
                                                   var178 = var127
                                                      + this.field_45.method_41$bc607678b6()
                                                      - (
                                                         var62.field_41
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var205 = var139 - var62.field_47;
                                                   var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                   var252 = (float)(
                                                      -(
                                                         net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                            * 180.0
                                                            / Math.PI
                                                      )
                                                   );
                                                   var254 = recovery$indy$flow$78(
                                                      ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                      var232,
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   );
                                                   var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                   if (var24 == null) {
                                                      if (var306) {
                                                         break label1303;
                                                      }

                                                      var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                   }

                                                   if (var306) {
                                                      return new net.C_477r(
                                                         var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         recovery$indy$flow$92(
                                                            ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                            var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                            180.0F,
                                                            var9,
                                                            -3366946608509713305L,
                                                            var1
                                                         )
                                                      );
                                                   }
                                                }

                                                var261 = 0.0F;
                                                if (var261 < 60.0F) {
                                                   break label1308;
                                                }

                                                var63++;
                                             } while (var24 == null);

                                             var313 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );
                                          }
                                       } else {
                                          label1324:
                                          while (true) {
                                             var69 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );

                                             do {
                                                label1320: {
                                                   var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                   var115 = var88.field_40;
                                                   var127 = var88.field_41;
                                                   var139 = var88.field_47;
                                                   var151 = var115 - var62.field_40;
                                                   var178 = var127
                                                      + this.field_45.method_41$bc607678b6()
                                                      - (
                                                         var62.field_41
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var205 = var139 - var62.field_47;
                                                   var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                   var252 = (float)(
                                                      -(
                                                         net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                            * 180.0
                                                            / Math.PI
                                                      )
                                                   );
                                                   var254 = recovery$indy$flow$78(
                                                      ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                      var232,
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   );
                                                   var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                   if (var24 == null) {
                                                      if (var306) {
                                                         break label1320;
                                                      }

                                                      var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                   }

                                                   if (var306) {
                                                      return new net.C_477r(
                                                         var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         recovery$indy$flow$92(
                                                            ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                            var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                            180.0F,
                                                            var9,
                                                            -3366946608509713305L,
                                                            var1
                                                         )
                                                      );
                                                   }
                                                }

                                                var261 = 0.0F;
                                                if (var261 < 60.0F) {
                                                   break label1324;
                                                }

                                                var63++;
                                             } while (var24 == null);
                                          }
                                       }

                                       var51 = 0;
                                       var52 = -1;
                                    }
                                 }

                                 var53 = var252 + var261 * var52;
                                 var54 = new net.C_47Kr();
                                 recovery$indy$flow$101(
                                    var54,
                                    var20,
                                    (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                                    var25,
                                    var62.field_40,
                                    var62.field_41,
                                    var62.field_47,
                                    var254,
                                    var53,
                                    -3361609908541176809L,
                                    var1
                                 );
                                 recovery$indy$flow$105(
                                    var54,
                                    100,
                                    var3,
                                    new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                                    var22,
                                    -3360944204658105796L,
                                    var1
                                 );
                                 var307 = var24;
                              }
                           }

                           while (true) {
                              label1397: {
                                 if (var307 != null) {
                                    var52 += 2;
                                    if (var24 == null) {
                                       while (true) {
                                          if (var52 < 2) {
                                             break label1397;
                                          }

                                          if (var51 != 0) {
                                             do {
                                                var63++;
                                                if (var24 != null) {
                                                   var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                                      (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                      var3,
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                      var17,
                                                      true,
                                                      (byte)var18,
                                                      var19,
                                                      -3361016989020254574L,
                                                      var1
                                                   );
                                                }

                                                label1349: {
                                                   var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                   var115 = var88.field_40;
                                                   var127 = var88.field_41;
                                                   var139 = var88.field_47;
                                                   var151 = var115 - var62.field_40;
                                                   var178 = var127
                                                      + this.field_45.method_41$bc607678b6()
                                                      - (
                                                         var62.field_41
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var205 = var139 - var62.field_47;
                                                   var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                   var252 = (float)(
                                                      -(
                                                         net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                            * 180.0
                                                            / Math.PI
                                                      )
                                                   );
                                                   var254 = recovery$indy$flow$78(
                                                      ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                      var232,
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   );
                                                   var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                   if (var24 == null) {
                                                      if (var306) {
                                                         break label1349;
                                                      }

                                                      var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                   }

                                                   if (var306) {
                                                      return new net.C_477r(
                                                         var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         recovery$indy$flow$92(
                                                            ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                            var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                            180.0F,
                                                            var9,
                                                            -3366946608509713305L,
                                                            var1
                                                         )
                                                      );
                                                   }
                                                }

                                                var261 = 0.0F;
                                             } while (!(var261 < 60.0F));
                                          } else {
                                             for (var261 += 0.2F; !(var261 < 60.0F); var261 = 0.0F) {
                                                var63++;
                                                if (var24 != null) {
                                                   var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                                      (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                      var3,
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                      var17,
                                                      true,
                                                      (byte)var18,
                                                      var19,
                                                      -3361016989020254574L,
                                                      var1
                                                   );
                                                }

                                                var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                                var115 = var88.field_40;
                                                var127 = var88.field_41;
                                                var139 = var88.field_47;
                                                var151 = var115 - var62.field_40;
                                                var178 = var127
                                                   + this.field_45.method_41$bc607678b6()
                                                   - (
                                                      var62.field_41
                                                         + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                            .method_41$bc607678b6()
                                                   );
                                                var205 = var139 - var62.field_47;
                                                var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                                var252 = (float)(
                                                   -(
                                                      net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                         * 180.0
                                                         / Math.PI
                                                   )
                                                );
                                                var254 = recovery$indy$flow$78(
                                                   ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                   var232,
                                                   180.0F,
                                                   var9,
                                                   -3366946608509713305L,
                                                   var1
                                                );
                                                var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                if (var24 == null) {
                                                   if (var306) {
                                                      continue;
                                                   }

                                                   var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                }

                                                if (var306) {
                                                   return new net.C_477r(
                                                      var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      recovery$indy$flow$92(
                                                         ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                         var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         180.0F,
                                                         var9,
                                                         -3366946608509713305L,
                                                         var1
                                                      )
                                                   );
                                                }
                                             }
                                          }

                                          var51 = 0;
                                          var52 = -1;
                                       }
                                    }
                                 }

                                 do {
                                    if (var51 != 0) {
                                       do {
                                          var63++;
                                          if (var24 != null) {
                                             var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );
                                          }

                                          label1379: {
                                             var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                             var115 = var88.field_40;
                                             var127 = var88.field_41;
                                             var139 = var88.field_47;
                                             var151 = var115 - var62.field_40;
                                             var178 = var127
                                                + this.field_45.method_41$bc607678b6()
                                                - (
                                                   var62.field_41
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                                );
                                             var205 = var139 - var62.field_47;
                                             var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                             var252 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             var254 = recovery$indy$flow$78(
                                                ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                var232,
                                                180.0F,
                                                var9,
                                                -3366946608509713305L,
                                                var1
                                             );
                                             var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                             if (var24 == null) {
                                                if (var306) {
                                                   break label1379;
                                                }

                                                var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                             }

                                             if (var306) {
                                                return new net.C_477r(
                                                   var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                   recovery$indy$flow$92(
                                                      ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                      var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   )
                                                );
                                             }
                                          }

                                          var261 = 0.0F;
                                       } while (!(var261 < 60.0F));
                                    } else {
                                       for (var261 += 0.2F; !(var261 < 60.0F); var261 = 0.0F) {
                                          var63++;
                                          if (var24 != null) {
                                             var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );
                                          }

                                          var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                          var115 = var88.field_40;
                                          var127 = var88.field_41;
                                          var139 = var88.field_47;
                                          var151 = var115 - var62.field_40;
                                          var178 = var127
                                             + this.field_45.method_41$bc607678b6()
                                             - (
                                                var62.field_41
                                                   + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                             );
                                          var205 = var139 - var62.field_47;
                                          var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                          var252 = (float)(
                                             -(
                                                net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                   * 180.0
                                                   / Math.PI
                                             )
                                          );
                                          var254 = recovery$indy$flow$78(
                                             ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                             var232,
                                             180.0F,
                                             var9,
                                             -3366946608509713305L,
                                             var1
                                          );
                                          var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                          if (var24 == null) {
                                             if (var306) {
                                                continue;
                                             }

                                             var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                          }

                                          if (var306) {
                                             return new net.C_477r(
                                                var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                recovery$indy$flow$92(
                                                   ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                   var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                   180.0F,
                                                   var9,
                                                   -3366946608509713305L,
                                                   var1
                                                )
                                             );
                                          }
                                       }
                                    }

                                    var51 = 0;
                                    var52 = -1;
                                 } while (var52 >= 2);
                              }

                              var53 = var252 + var261 * var52;
                              var54 = new net.C_47Kr();
                              recovery$indy$flow$101(
                                 var54,
                                 var20,
                                 (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                                 var25,
                                 var62.field_40,
                                 var62.field_41,
                                 var62.field_47,
                                 var254,
                                 var53,
                                 -3361609908541176809L,
                                 var1
                              );
                              recovery$indy$flow$105(
                                 var54,
                                 100,
                                 var3,
                                 new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                                 var22,
                                 -3360944204658105796L,
                                 var1
                              );
                              var307 = var24;
                           }
                        } else {
                           var306 = ((((int) (var51)) & 1) != 0);
                           if (var1 < 0L) {
                              while (true) {
                                 if (((int) (var306 ? 1 : 0)) <= var60.size() && this.field_43y > 0) {
                                    java.util.ArrayList var322 = var60;

                                    label1416:
                                    while (true) {
                                       var69 = var322;

                                       do {
                                          label1411: {
                                             var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                             var115 = var88.field_40;
                                             var127 = var88.field_41;
                                             var139 = var88.field_47;
                                             var151 = var115 - var62.field_40;
                                             var178 = var127
                                                + this.field_45.method_41$bc607678b6()
                                                - (
                                                   var62.field_41
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                                );
                                             var205 = var139 - var62.field_47;
                                             var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                             var252 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             var254 = recovery$indy$flow$78(
                                                ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                var232,
                                                180.0F,
                                                var9,
                                                -3366946608509713305L,
                                                var1
                                             );
                                             boolean var323 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                             if (var24 == null) {
                                                if (var323) {
                                                   break label1411;
                                                }

                                                var323 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                             }

                                             if (var323) {
                                                return new net.C_477r(
                                                   var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                   recovery$indy$flow$92(
                                                      ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                      var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   )
                                                );
                                             }
                                          }

                                          var261 = 0.0F;
                                          if (var261 < 60.0F) {
                                             break label1416;
                                          }

                                          var63++;
                                       } while (var24 == null);

                                       var322 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                          var3,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                          var17,
                                          true,
                                          (byte)var18,
                                          var19,
                                          -3361016989020254574L,
                                          var1
                                       );
                                    }
                                 } else {
                                    label1431:
                                    while (true) {
                                       var69 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                          var3,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                          var17,
                                          true,
                                          (byte)var18,
                                          var19,
                                          -3361016989020254574L,
                                          var1
                                       );

                                       do {
                                          label1427: {
                                             var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                             var115 = var88.field_40;
                                             var127 = var88.field_41;
                                             var139 = var88.field_47;
                                             var151 = var115 - var62.field_40;
                                             var178 = var127
                                                + this.field_45.method_41$bc607678b6()
                                                - (
                                                   var62.field_41
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                                );
                                             var205 = var139 - var62.field_47;
                                             var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                             var252 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             var254 = recovery$indy$flow$78(
                                                ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                var232,
                                                180.0F,
                                                var9,
                                                -3366946608509713305L,
                                                var1
                                             );
                                             boolean var321 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                             if (var24 == null) {
                                                if (var321) {
                                                   break label1427;
                                                }

                                                var321 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                             }

                                             if (var321) {
                                                return new net.C_477r(
                                                   var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                   recovery$indy$flow$92(
                                                      ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                      var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      180.0F,
                                                      var9,
                                                      -3366946608509713305L,
                                                      var1
                                                   )
                                                );
                                             }
                                          }

                                          var261 = 0.0F;
                                          if (var261 < 60.0F) {
                                             break label1431;
                                          }

                                          var63++;
                                       } while (var24 == null);
                                    }
                                 }

                                 var51 = 0;
                                 var52 = -1;

                                 while (var52 < 2) {
                                    float var282 = var252 + var261 * var52;
                                    net.C_47Kr var290 = new net.C_47Kr();
                                    recovery$indy$flow$101(
                                       var290,
                                       var20,
                                       (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                                       var25,
                                       var62.field_40,
                                       var62.field_41,
                                       var62.field_47,
                                       var254,
                                       var282,
                                       -3361609908541176809L,
                                       var1
                                    );
                                    recovery$indy$flow$105(
                                       var290,
                                       100,
                                       var3,
                                       new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                                       var22,
                                       -3360944204658105796L,
                                       var1
                                    );
                                    if (var24 != null) {
                                       break;
                                    }
                                 }

                                 var306 = ((((int) (var51)) & 1) != 0);
                              }
                           }

                           while (true) {
                              if (((int) (var306 ? 1 : 0)) != 0) {
                                 do {
                                    var63++;
                                    if (var24 != null) {
                                       var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                          var3,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                          var17,
                                          true,
                                          (byte)var18,
                                          var19,
                                          -3361016989020254574L,
                                          var1
                                       );
                                    }

                                    label1455: {
                                       var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                       var115 = var88.field_40;
                                       var127 = var88.field_41;
                                       var139 = var88.field_47;
                                       var151 = var115 - var62.field_40;
                                       var178 = var127
                                          + this.field_45.method_41$bc607678b6()
                                          - (
                                             var62.field_41
                                                + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                          );
                                       var205 = var139 - var62.field_47;
                                       var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                       var252 = (float)(
                                          -(
                                             net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205))
                                                * 180.0
                                                / Math.PI
                                          )
                                       );
                                       var254 = recovery$indy$flow$78(
                                          ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                          var232,
                                          180.0F,
                                          var9,
                                          -3366946608509713305L,
                                          var1
                                       );
                                       boolean var320 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                       if (var24 == null) {
                                          if (var320) {
                                             break label1455;
                                          }

                                          var320 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                       }

                                       if (var320) {
                                          return new net.C_477r(
                                             var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                             recovery$indy$flow$92(
                                                ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                180.0F,
                                                var9,
                                                -3366946608509713305L,
                                                var1
                                             )
                                          );
                                       }
                                    }

                                    var261 = 0.0F;
                                 } while (!(var261 < 60.0F));
                              } else {
                                 for (var261 += 0.2F; !(var261 < 60.0F); var261 = 0.0F) {
                                    var63++;
                                    if (var24 != null) {
                                       var69 = (java.util.ArrayList)recovery$indy$flow$57(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                          var3,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                          var17,
                                          true,
                                          (byte)var18,
                                          var19,
                                          -3361016989020254574L,
                                          var1
                                       );
                                    }

                                    var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                                    var115 = var88.field_40;
                                    var127 = var88.field_41;
                                    var139 = var88.field_47;
                                    var151 = var115 - var62.field_40;
                                    var178 = var127
                                       + this.field_45.method_41$bc607678b6()
                                       - (
                                          var62.field_41
                                             + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6()
                                       );
                                    var205 = var139 - var62.field_47;
                                    var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                                    var252 = (float)(
                                       -(net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205)) * 180.0 / Math.PI)
                                    );
                                    var254 = recovery$indy$flow$78(
                                       ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                       var232,
                                       180.0F,
                                       var9,
                                       -3366946608509713305L,
                                       var1
                                    );
                                    boolean var319 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                    if (var24 == null) {
                                       if (var319) {
                                          continue;
                                       }

                                       var319 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                    }

                                    if (var319) {
                                       return new net.C_477r(
                                          var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                          recovery$indy$flow$92(
                                             ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                             var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                             180.0F,
                                             var9,
                                             -3366946608509713305L,
                                             var1
                                          )
                                       );
                                    }
                                 }
                              }

                              var51 = 0;
                              var52 = -1;

                              while (var52 < 2) {
                                 float var281 = var252 + var261 * var52;
                                 net.C_47Kr var289 = new net.C_47Kr();
                                 recovery$indy$flow$101(
                                    var289,
                                    var20,
                                    (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                                    var25,
                                    var62.field_40,
                                    var62.field_41,
                                    var62.field_47,
                                    var254,
                                    var281,
                                    -3361609908541176809L,
                                    var1
                                 );
                                 recovery$indy$flow$105(
                                    var289,
                                    100,
                                    var3,
                                    new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                                    var22,
                                    -3360944204658105796L,
                                    var1
                                 );
                                 if (var24 == null) {
                                    break;
                                 }

                                 var52 += 2;
                                 if (var24 != null) {
                                    break;
                                 }
                              }

                              var306 = ((((int) (var51)) & 1) != 0);
                           }
                        }
                     }

                     var63++;
                     if (var24 != null) {
                        var69 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                           var3,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                           var17,
                           true,
                           (byte)var18,
                           var19,
                           -3361016989020254574L,
                           var1
                        );
                     }

                     var88 = (net.C_47tf)recovery$indy$flow$59(var69, var11, this.field_43y, -3360129611190136822L, var1);
                     var115 = var88.field_40;
                     var127 = var88.field_41;
                     var139 = var88.field_47;
                     var151 = var115 - var62.field_40;
                     var178 = var127
                        + this.field_45.method_41$bc607678b6()
                        - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                     var205 = var139 - var62.field_47;
                     var232 = (float)Math.toDegrees(Math.atan2(var205, var151)) - 90.0F;
                     var252 = (float)(-(net.C_47sk.method_49$eb37070982(var178, net.C_47sk.method_42$44b37c2d95(var151 * var151 + var205 * var205)) * 180.0 / Math.PI));
                     var254 = recovery$indy$flow$78(
                        ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                        var232,
                        180.0F,
                        var9,
                        -3366946608509713305L,
                        var1
                     );
                     var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                     var329 = var24;
                  }
               }
            }

            while (true) {
               label1732: {
                  if (var329 == null) {
                     if (var306) {
                        break label1732;
                     }

                     var306 = recovery$indy$flow$81(this, var15, -3366541209477672578L, var1);
                  }

                  if (var24 == null) {
                     if (var306) {
                        break label1732;
                     }

                     var306 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                  }

                  if (var306) {
                     return new net.C_477r(
                        var254 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                        recovery$indy$flow$92(
                           ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                           var252 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                           180.0F,
                           var9,
                           -3366946608509713305L,
                           var1
                        )
                     );
                  }
               }

               for (float var263 = 0.0F; var263 < 60.0F; var263 += 0.2F) {
                  boolean var269 = false;
                  byte var275 = -1;

                  while (var275 < 2) {
                     float var283 = var252 + var263 * var275;
                     net.C_47Kr var291 = new net.C_47Kr();
                     recovery$indy$flow$101(
                        var291,
                        var20,
                        (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$97(field_43, -3360526735694028323L, var1),
                        var25,
                        var62.field_40,
                        var62.field_41,
                        var62.field_47,
                        var254,
                        var283,
                        -3361609908541176809L,
                        var1
                     );
                     int var55 = recovery$indy$flow$105(
                        var291,
                        100,
                        var3,
                        new net.C_478i(var115 - var26, var127 + 0.2, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26),
                        var22,
                        -3360944204658105796L,
                        var1
                     );
                     if (var55 != Integer.MAX_VALUE) {
                        this.field_43y = var55;
                        var269 = true;
                        var57 = var254;
                        var58 = var283;
                        this.field_40 = new net.C_478i(var115 - var26, var127, var139 - var26, var115 + var26, var127 + var3.field_48, var139 + var26);
                        this.field_438 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$112(field_43, -3360526735694028323L, var1)).field_48y;
                        if (var24 == null) {
                           break;
                        }
                     }

                     var275 += 2;
                     if (var24 != null) {
                        break;
                     }
                  }

                  if (var269) {
                     break;
                  }
               }

               if (var24 != null || ++var63 >= var4) {
                  return new net.C_477r(var57, var58);
               }

               java.util.ArrayList var77;
               label1184: {
                  if (this.field_43y <= var60.size() && this.field_43y > 0) {
                     var77 = var60;
                     if (var24 == null) {
                        break label1184;
                     }
                  }

                  var77 = var60 = (java.util.ArrayList)recovery$indy$flow$57(
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                     var3,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                     var17,
                     true,
                     (byte)var18,
                     var19,
                     -3361016989020254574L,
                     var1
                  );
               }

               net.C_47tf var103 = (net.C_47tf)recovery$indy$flow$59(var77, var11, this.field_43y, -3360129611190136822L, var1);
               var115 = var103.field_40;
               var127 = var103.field_41;
               var139 = var103.field_47;
               double var166 = var115 - var62.field_40;
               double var193 = var127
                  + this.field_45.method_41$bc607678b6()
                  - (var62.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
               double var220 = var139 - var62.field_47;
               float var247 = (float)Math.toDegrees(Math.atan2(var220, var166)) - 90.0F;
               var252 = (float)(-(net.C_47sk.method_49$eb37070982(var193, net.C_47sk.method_42$44b37c2d95(var166 * var166 + var220 * var220)) * 180.0 / Math.PI));
               var254 = recovery$indy$flow$78(
                  ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                  var247,
                  180.0F,
                  var9,
                  -3366946608509713305L,
                  var1
               );
               var306 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
               var329 = var24;
            }
         }
      } else {
         {
            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$21(field_43, -3360526735694028323L, var1))
               .field_429
               .method_46$4c10532da1(recovery$indy$flow$23(this, var7, -3367639957693188183L, var1) + 36)
               .method_48$ac4db64966();
         }

         float var28;
         float var29;
         java.util.ArrayList var30;
         net.C_47tf var31;
         int var32;
         float var48;
         float var49;
         label1688: {
            label1760: {
               var28 = 0.0F;
               var29 = 0.0F;
               var30 = new java.util.ArrayList();
               var31 = (net.C_47tf)recovery$indy$flow$44(
                  (java.util.ArrayList)recovery$indy$flow$43(
                     var13,
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, -3360526735694028323L, var1),
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$35(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$38(field_43, -3360526735694028323L, var1)).field_48y,
                     0,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$41(field_43, -3360526735694028323L, var1)).field_48y + 1,
                     -3366833160994914119L,
                     var1
                  ),
                  var11,
                  0,
                  -3360129611190136822L,
                  var1
               );
               var32 = 0;
               if (var32 >= var4) {
                  if (var1 >= 0L) {
                     return new net.C_477r(var28, var29);
                  }
               } else {
                  if (this.field_43y > 0) {
                     var297 = var30;
                     if (var1 >= 0L) {
                        java.util.ArrayList var66 = var30;
                        if (var24 != null) {
                           var66 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                              (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                              var3,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                              var17,
                              true,
                              (byte)var18,
                              var19,
                              -3361016989020254574L,
                              var1
                           );
                        }

                        net.C_47tf var84 = (net.C_47tf)recovery$indy$flow$59(var66, var11, this.field_43y, -3360129611190136822L, var1);
                        double var111 = var84.field_40;
                        double var123 = var84.field_41;
                        double var135 = var84.field_47;
                        double var147 = var111 - var31.field_40;
                        double var174 = var123
                           + this.field_45.method_41$bc607678b6()
                           - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                        double var201 = var135 - var31.field_47;
                        float var228 = (float)Math.toDegrees(Math.atan2(var201, var147)) - 90.0F;
                        var48 = (float)(
                           -(net.C_47sk.method_49$eb37070982(var174, net.C_47sk.method_42$44b37c2d95(var147 * var147 + var201 * var201)) * 180.0 / Math.PI)
                        );
                        var49 = recovery$indy$flow$78(
                           ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                           var228,
                           180.0F,
                           var9,
                           -3366946608509713305L,
                           var1
                        );
                        var296 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                        var328 = var24;
                        if (var1 <= 0L) {
                           while (true) {
                              label1623: {
                                 if (var328 == null) {
                                    if (var296) {
                                       break label1623;
                                    }

                                    var296 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                 }

                                 if (var296) {
                                    return new net.C_477r(
                                       var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                       recovery$indy$flow$92(
                                          ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                          var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                          180.0F,
                                          var9,
                                          -3366946608509713305L,
                                          var1
                                       )
                                    );
                                 }
                              }

                              label1618: {
                                 label1617: {
                                    float var259 = 0.0F;
                                    int[] var303;
                                    if (var259 < 60.0F) {
                                       if (-1 >= var4) {
                                          return new net.C_477r(var28, var29);
                                       }

                                       if (this.field_43y <= 0) {
                                          break label1617;
                                       }

                                       var66 = var30;
                                       var303 = var24;
                                    } else {
                                       var32++;
                                       var303 = var24;
                                    }

                                    if (var303 == null) {
                                       break label1618;
                                    }
                                 }

                                 var66 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                                    (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                    var3,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                    var17,
                                    true,
                                    (byte)var18,
                                    var19,
                                    -3361016989020254574L,
                                    var1
                                 );
                              }

                              var84 = (net.C_47tf)recovery$indy$flow$59(var66, var11, this.field_43y, -3360129611190136822L, var1);
                              var111 = var84.field_40;
                              var123 = var84.field_41;
                              var135 = var84.field_47;
                              var147 = var111 - var31.field_40;
                              var174 = var123
                                 + this.field_45.method_41$bc607678b6()
                                 - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                              var201 = var135 - var31.field_47;
                              var228 = (float)Math.toDegrees(Math.atan2(var201, var147)) - 90.0F;
                              var48 = (float)(
                                 -(net.C_47sk.method_49$eb37070982(var174, net.C_47sk.method_42$44b37c2d95(var147 * var147 + var201 * var201)) * 180.0 / Math.PI)
                              );
                              var49 = recovery$indy$flow$78(
                                 ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                 var228,
                                 180.0F,
                                 var9,
                                 -3366946608509713305L,
                                 var1
                              );
                              var296 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                              var328 = var24;
                           }
                        }
                        break label1688;
                     }
                     break label1760;
                  }

                  java.util.ArrayList var33 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                     var3,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                     var17,
                     true,
                     (byte)var18,
                     var19,
                     -3361016989020254574L,
                     var1
                  );
                  net.C_47tf var34 = (net.C_47tf)recovery$indy$flow$59(var33, var11, this.field_43y, -3360129611190136822L, var1);
                  double var35 = var34.field_40;
                  double var37 = var34.field_41;
                  double var39 = var34.field_47;
                  double var41 = var35 - var31.field_40;
                  double var43 = var37
                     + this.field_45.method_41$bc607678b6()
                     - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                  double var45 = var39 - var31.field_47;
                  float var47 = (float)Math.toDegrees(Math.atan2(var45, var41)) - 90.0F;
                  var48 = (float)(-(net.C_47sk.method_49$eb37070982(var43, net.C_47sk.method_42$44b37c2d95(var41 * var41 + var45 * var45)) * 180.0 / Math.PI));
                  var49 = recovery$indy$flow$78(
                     ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                     var47,
                     180.0F,
                     var9,
                     -3366946608509713305L,
                     var1
                  );
                  var296 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                  var328 = var24;
                  if (var1 > 0L) {
                     break label1688;
                  }

                  while (true) {
                     label1682: {
                        if (var328 == null) {
                           if (var296) {
                              break label1682;
                           }

                           var296 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                        }

                        if (var296) {
                           return new net.C_477r(
                              var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                              recovery$indy$flow$92(
                                 ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                 var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 180.0F,
                                 var9,
                                 -3366946608509713305L,
                                 var1
                              )
                           );
                        }
                     }

                     label1677: {
                        float var50 = 0.0F;
                        if (var50 < 60.0F) {
                           if (-1 >= var4) {
                              if (var1 >= 0L) {
                                 return new net.C_477r(var28, var29);
                              }
                              break;
                           }

                           if (this.field_43y > 0) {
                              var297 = var30;
                              if (var1 >= 0L) {
                                 while (true) {
                                    var33 = var297;
                                    int[] var298 = var24;

                                    label1657:
                                    while (true) {
                                       if (var298 != null) {
                                          while (true) {
                                             label1644: {
                                                var33 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                                                   (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                   var3,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                   var17,
                                                   true,
                                                   (byte)var18,
                                                   var19,
                                                   -3361016989020254574L,
                                                   var1
                                                );
                                                var34 = (net.C_47tf)recovery$indy$flow$59(var33, var11, this.field_43y, -3360129611190136822L, var1);
                                                var35 = var34.field_40;
                                                var37 = var34.field_41;
                                                var39 = var34.field_47;
                                                var41 = var35 - var31.field_40;
                                                var43 = var37
                                                   + this.field_45.method_41$bc607678b6()
                                                   - (
                                                      var31.field_41
                                                         + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                            .method_41$bc607678b6()
                                                   );
                                                var45 = var39 - var31.field_47;
                                                var47 = (float)Math.toDegrees(Math.atan2(var45, var41)) - 90.0F;
                                                var48 = (float)(
                                                   -(
                                                      net.C_47sk.method_49$eb37070982(var43, net.C_47sk.method_42$44b37c2d95(var41 * var41 + var45 * var45))
                                                         * 180.0
                                                         / Math.PI
                                                   )
                                                );
                                                var49 = recovery$indy$flow$78(
                                                   ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                   var47,
                                                   180.0F,
                                                   var9,
                                                   -3366946608509713305L,
                                                   var1
                                                );
                                                boolean var300 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                if (var24 == null) {
                                                   if (var300) {
                                                      break label1644;
                                                   }

                                                   var300 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                }

                                                if (var300) {
                                                   return new net.C_477r(
                                                      var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      recovery$indy$flow$92(
                                                         ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                         var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         180.0F,
                                                         var9,
                                                         -3366946608509713305L,
                                                         var1
                                                      )
                                                   );
                                                }
                                             }

                                             var50 = 0.0F;
                                             if (!(var50 < 60.0F)) {
                                                break;
                                             }

                                             if (-1 >= var4) {
                                                return new net.C_477r(var28, var29);
                                             }

                                             if (this.field_43y > 0) {
                                                break label1657;
                                             }
                                          }
                                       } else {
                                          while (true) {
                                             label1652: {
                                                var34 = (net.C_47tf)recovery$indy$flow$59(var33, var11, this.field_43y, -3360129611190136822L, var1);
                                                var35 = var34.field_40;
                                                var37 = var34.field_41;
                                                var39 = var34.field_47;
                                                var41 = var35 - var31.field_40;
                                                var43 = var37
                                                   + this.field_45.method_41$bc607678b6()
                                                   - (
                                                      var31.field_41
                                                         + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1))
                                                            .method_41$bc607678b6()
                                                   );
                                                var45 = var39 - var31.field_47;
                                                var47 = (float)Math.toDegrees(Math.atan2(var45, var41)) - 90.0F;
                                                var48 = (float)(
                                                   -(
                                                      net.C_47sk.method_49$eb37070982(var43, net.C_47sk.method_42$44b37c2d95(var41 * var41 + var45 * var45))
                                                         * 180.0
                                                         / Math.PI
                                                   )
                                                );
                                                var49 = recovery$indy$flow$78(
                                                   ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                                                   var47,
                                                   180.0F,
                                                   var9,
                                                   -3366946608509713305L,
                                                   var1
                                                );
                                                boolean var299 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                                                if (var24 == null) {
                                                   if (var299) {
                                                      break label1652;
                                                   }

                                                   var299 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                                                }

                                                if (var299) {
                                                   return new net.C_477r(
                                                      var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                      recovery$indy$flow$92(
                                                         ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                                         var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                                         180.0F,
                                                         var9,
                                                         -3366946608509713305L,
                                                         var1
                                                      )
                                                   );
                                                }
                                             }

                                             var50 = 0.0F;
                                             if (!(var50 < 60.0F)) {
                                                break;
                                             }

                                             if (-1 >= var4) {
                                                return new net.C_477r(var28, var29);
                                             }

                                             if (this.field_43y > 0) {
                                                break label1657;
                                             }

                                             var33 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                                                var3,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                                                var17,
                                                true,
                                                (byte)var18,
                                                var19,
                                                -3361016989020254574L,
                                                var1
                                             );
                                          }
                                       }

                                       var32++;
                                       var298 = var24;
                                    }

                                    var297 = var30;
                                 }
                              }
                              break label1760;
                           }
                        } else {
                           var32++;
                           if (var24 == null) {
                              break label1677;
                           }
                        }

                        var33 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                           var3,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                           var17,
                           true,
                           (byte)var18,
                           var19,
                           -3361016989020254574L,
                           var1
                        );
                     }

                     var34 = (net.C_47tf)recovery$indy$flow$59(var33, var11, this.field_43y, -3360129611190136822L, var1);
                     var35 = var34.field_40;
                     var37 = var34.field_41;
                     var39 = var34.field_47;
                     var41 = var35 - var31.field_40;
                     var43 = var37
                        + this.field_45.method_41$bc607678b6()
                        - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                     var45 = var39 - var31.field_47;
                     var47 = (float)Math.toDegrees(Math.atan2(var45, var41)) - 90.0F;
                     var48 = (float)(-(net.C_47sk.method_49$eb37070982(var43, net.C_47sk.method_42$44b37c2d95(var41 * var41 + var45 * var45)) * 180.0 / Math.PI));
                     var49 = recovery$indy$flow$78(
                        ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                        var47,
                        180.0F,
                        var9,
                        -3366946608509713305L,
                        var1
                     );
                     var296 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                     var328 = var24;
                  }
               }

               label1600:
               while (true) {
                  java.util.ArrayList var304 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                     var3,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                     var17,
                     true,
                     (byte)var18,
                     var19,
                     -3361016989020254574L,
                     var1
                  );

                  while (true) {
                     java.util.ArrayList var68 = var304;

                     while (true) {
                        label1593: {
                           net.C_47tf var87 = (net.C_47tf)recovery$indy$flow$59(var68, var11, this.field_43y, -3360129611190136822L, var1);
                           double var114 = var87.field_40;
                           double var126 = var87.field_41;
                           double var138 = var87.field_47;
                           double var150 = var114 - var31.field_40;
                           double var177 = var126
                              + this.field_45.method_41$bc607678b6()
                              - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                           double var204 = var138 - var31.field_47;
                           float var231 = (float)Math.toDegrees(Math.atan2(var204, var150)) - 90.0F;
                           var48 = (float)(
                              -(net.C_47sk.method_49$eb37070982(var177, net.C_47sk.method_42$44b37c2d95(var150 * var150 + var204 * var204)) * 180.0 / Math.PI)
                           );
                           var49 = recovery$indy$flow$78(
                              ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                              var231,
                              180.0F,
                              var9,
                              -3366946608509713305L,
                              var1
                           );
                           boolean var305 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                           if (var24 == null) {
                              if (var305) {
                                 break label1593;
                              }

                              var305 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                           }

                           if (var305) {
                              return new net.C_477r(
                                 var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                 recovery$indy$flow$92(
                                    ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                                    var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                                    180.0F,
                                    var9,
                                    -3366946608509713305L,
                                    var1
                                 )
                              );
                           }
                        }

                        float var260 = 0.0F;
                        if (var260 < 60.0F) {
                           if (-1 >= var4 || this.field_43y <= 0) {
                              continue label1600;
                           }

                           var304 = var30;
                           break;
                        }

                        var32++;
                        if (var24 != null) {
                           continue label1600;
                        }
                     }
                  }
               }
            }

            while (true) {
               java.util.ArrayList var65 = var297;

               while (true) {
                  label1573: {
                     net.C_47tf var83 = (net.C_47tf)recovery$indy$flow$59(var65, var11, this.field_43y, -3360129611190136822L, var1);
                     double var110 = var83.field_40;
                     double var122 = var83.field_41;
                     double var134 = var83.field_47;
                     double var146 = var110 - var31.field_40;
                     double var173 = var122
                        + this.field_45.method_41$bc607678b6()
                        - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
                     double var200 = var134 - var31.field_47;
                     float var227 = (float)Math.toDegrees(Math.atan2(var200, var146)) - 90.0F;
                     var48 = (float)(-(net.C_47sk.method_49$eb37070982(var173, net.C_47sk.method_42$44b37c2d95(var146 * var146 + var200 * var200)) * 180.0 / Math.PI));
                     var49 = recovery$indy$flow$78(
                        ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44,
                        var227,
                        180.0F,
                        var9,
                        -3366946608509713305L,
                        var1
                     );
                     boolean var301 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
                     if (var24 == null) {
                        if (var301) {
                           break label1573;
                        }

                        var301 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
                     }

                     if (var301) {
                        return new net.C_477r(
                           var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                           recovery$indy$flow$92(
                              ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                              var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                              180.0F,
                              var9,
                              -3366946608509713305L,
                              var1
                           )
                        );
                     }
                  }

                  float var257 = 0.0F;
                  if (var257 < 60.0F) {
                     if (-1 < var4 && this.field_43y > 0) {
                        var297 = var30;
                        break;
                     }
                  } else {
                     var32++;
                     if (var24 == null) {
                        continue;
                     }
                  }

                  var297 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                     (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                     var3,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                     var17,
                     true,
                     (byte)var18,
                     var19,
                     -3361016989020254574L,
                     var1
                  );
                  break;
               }
            }
         }

         while (true) {
            label1747: {
               if (var328 == null) {
                  if (var296) {
                     break label1747;
                  }

                  var296 = recovery$indy$flow$81(this, var15, -3366541209477672578L, var1);
               }

               if (var24 == null) {
                  if (var296) {
                     break label1747;
                  }

                  var296 = recovery$indy$flow$83(this.settingCombat, -3367500657554444346L, var1);
               }

               if (var296) {
                  return new net.C_477r(
                     var49 + recovery$indy$flow$86(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                     recovery$indy$flow$92(
                        ((net.C_477r)recovery$indy$flow$88(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_41,
                        var48 + recovery$indy$flow$91(net.C_476q.field_48, -2.0F, var5, 2.0F, -3361457006415590774L, var1),
                        180.0F,
                        var9,
                        -3366946608509713305L,
                        var1
                     )
                  );
               }
            }

            float var258 = 0.0F;
            if (var258 < 60.0F) {
               var10000 = -1;
            } else {
               var32++;
               if (var24 != null) {
                  break;
               }

               var10000 = var32;
            }

            if (var10000 >= var4) {
               break;
            }

            java.util.ArrayList var67;
            label1553: {
               if (this.field_43y > 0) {
                  var67 = var30;
                  if (var24 == null) {
                     break label1553;
                  }
               }

               var67 = var30 = (java.util.ArrayList)recovery$indy$flow$57(
                  (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$49(field_43, -3360526735694028323L, var1),
                  var3,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -3360526735694028323L, var1)).field_48y,
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$54(field_43, -3360526735694028323L, var1)).field_48y + this.field_43y,
                  var17,
                  true,
                  (byte)var18,
                  var19,
                  -3361016989020254574L,
                  var1
               );
            }

            net.C_47tf var85 = (net.C_47tf)recovery$indy$flow$59(var67, var11, this.field_43y, -3360129611190136822L, var1);
            double var112 = var85.field_40;
            double var124 = var85.field_41;
            double var136 = var85.field_47;
            double var148 = var112 - var31.field_40;
            double var175 = var124
               + this.field_45.method_41$bc607678b6()
               - (var31.field_41 + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, -3360526735694028323L, var1)).method_41$bc607678b6());
            double var202 = var136 - var31.field_47;
            float var229 = (float)Math.toDegrees(Math.atan2(var202, var148)) - 90.0F;
            var48 = (float)(-(net.C_47sk.method_49$eb37070982(var175, net.C_47sk.method_42$44b37c2d95(var148 * var148 + var202 * var202)) * 180.0 / Math.PI));
            var49 = recovery$indy$flow$78(
               ((net.C_477r)recovery$indy$flow$76(client.ClientGlobals.field_46, -3361230381420458115L, var1)).field_44, var229, 180.0F, var9, -3366946608509713305L, var1
            );
            var296 = recovery$indy$flow$80(this.settingPredict, -3367500657554444346L, var1);
            var328 = var24;
         }

         return new net.C_477r(var28, var29);
      }
   }







    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      long var4;
      int var8;
      int var9;
      int var10;
      int[] var11;
      ProjectileAimBot_47Ct var35;
      label116: {
         long var2 = a ^ 8439516815024L;
         var4 = var2 ^ 119873566128679L;
         long var6 = var2 ^ 996647224860L;
         long var10001 = var2 ^ 84726979948789L;
         var8 = (int)((var2 ^ 84726979948789L) >>> 48);
         var9 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
         var10 = (int)(var10001 << 48 >>> 48);
         long var10000 = -6878766621169650831L;
         var11 = AntiBot_47CG.method_40$d4d28024c9();
         var10001 = -6874915252331998096L;
         Minecraft var12 = field_43;
         boolean var34 = var12.method_44$aae029aa0a();
         if (var11 == null) {
            if (!var34) {
               return;
            }

            this.field_42++;
            var35 = this;
            if (var11 != null) {
               break label116;
            }

            long var10002 = -6878152947973889870L;
            long var13 = var6;
            ProjectileAimBot_47Ct var15 = this;
            var34 = var15.method_402$0dd78e0064(var13);
         }

         label95:
         if (var34) {
            C_475c var36 = var1;
            if (var11 == null) {
               var10001 = -6878700824727643256L;
               C_475c var16 = var1;
               if (!var16.method_40p$aae029aa0a()) {
                  break label95;
               }

               var36 = var1;
            }

            long var44 = -6876981730004091260L;
            boolean var17 = false;
            C_475c var18 = var36;
            var18.method_447$f633c984d8(var17);
         }

         var35 = this;
      }

      if (var35.field_45 != null) {
         char var41 = (char)var8;
         char var10004 = (char)var10;
         long var10005 = -6875239816751184473L;
         char var19 = var10004;
         ProjectileAimBot_47Ct var20 = this;
         int var21 = var9;
         char var22 = var41;
         C_47S6 var23 = ClientGlobals.field_46;
         int var37 = (int) ((var23.method_49$dc3f815dad(var22, var21, var20, var19)) ? 1 : 0);
         if (var11 == null) {
            if (var37 == 0) {
               return;
            }

            long var42 = -6876642091466076143L;
            Minecraft var24 = field_43;
            var37 = var24.field_42P.field_48y - 1;
         }

         label110: {
            label111: {
               label112: {
                  if (var11 == null) {
                     if (var37 != this.field_438) {
                        long var43 = -6879112981163418102L;
                        BooleanSetting var25 = this.settingPredict;
                        var37 = (int) ((var25.method_49$aae029aa0a()) ? 1 : 0);
                        if (var11 != null) {
                           break label111;
                        }

                        if (var37 == 0) {
                           break label112;
                        }
                     }

                     long var10003 = -6878310560552416809L;
                     long var26 = var4;
                     EntityLivingBase var28 = this.field_45;
                     ProjectileAimBot_47Ct var29 = this;
                     var37 = (int) ((var29.method_45$e04982bb4a(var28, var26)) ? 1 : 0);
                  }

                  if (var11 != null) {
                     break label111;
                  }

                  if (var37 == 0) {
                     return;
                  }
               }

               var35 = this;
               if (var11 != null) {
                  break label110;
               }

               var37 = this.field_42;
            }

            if (var37 <= 10) {
               return;
            }

            var35 = this;
         }

         var35.field_42 = 0;
         long var45 = -6878515650694399880L;
         byte var30 = 1;
         C_475c var31 = var1;
         var31.method_48$d00df7729d(var30);
         var45 = -6876981730004091260L;
         boolean var32 = true;
         C_475c var33 = var1;
         var33.method_447$f633c984d8(var32);
      }
   }





   private EntityLivingBase method_40$f2b0beb8fc(long var1) {
      long var3;
      int[] var5;
      int var24;
      int[] var28;
      label134: {
         var1 = a ^ var1;
         var3 = var1 ^ 50664223708569L;
         long var10000 = -7220418603524667341L;
         var5 = AntiBot_47CG.method_40$d4d28024c9();
         long var10001 = -7221117074364113849L;
         Minecraft var7 = field_43;
         var24 = (int) ((var7.field_44r.field_45w.method_42$aae029aa0a()) ? 1 : 0);
         label133:
         if (var5 == null) {
            if (var24 != 0) {
               long var27 = -7218306833627524426L;
               Minecraft var8 = field_43;
               Object[] var6 = var8.field_44Q
                  .field_44Q
                  .stream()
                  .filter(recovery$indy$36(this))
                  .sorted(Comparator.comparingDouble(recovery$indy$37(this)))
                  .toArray();
               var24 = var6.length;
               var28 = var5;
               if (var1 < 0L) {
                  break label134;
               }

               if (var5 != null) {
                  break label133;
               }

               if (var24 != 0) {
                  return (EntityLivingBase)var6[0];
               }
            }

            long var29 = -7220916662131890872L;
            BooleanSetting var9 = this.settingCombat;
            var24 = (int) ((var9.method_49$aae029aa0a()) ? 1 : 0);
         }

         var28 = var5;
      }

      label123: {
         label122:
         if (var28 == null) {
            if (var24 != 0) {
               long var10002 = -7218224851785068925L;
               long var10 = var3;
               KillAura_47CY var12 = ClientGlobals.field_48.field_48Q;
               var24 = (int) ((var12.method_46$0dd78e0064(var10)) ? 1 : 0);
               var28 = var5;
               if (var1 < 0L) {
                  break label123;
               }

               if (var5 != null) {
                  break label122;
               }

               if (var24 != 0 && ClientGlobals.field_48.field_48Q.field_45z != null) {
                  long var32 = -7218390805139002541L;
                  Minecraft var13 = field_43;
                  return var13.field_42P.method_40$ee256e8a75(ClientGlobals.field_48.field_48Q.field_45z) < 3.3 ? null : ClientGlobals.field_48.field_48Q.field_45z;
               }
            }

            long var31 = -7220916662131890872L;
            BooleanSetting var14 = this.settingCombat;
            var24 = (int) ((var14.method_49$aae029aa0a()) ? 1 : 0);
         }

         var28 = var5;
      }

      if (var1 >= 0L) {
         if (var28 == null) {
            if (var24 == 0) {
               return null;
            }

            long var38 = -7218224851785068925L;
            long var15 = var3;
            KillAura_47CY var17 = ClientGlobals.field_48.field_48Q;
            var24 = (int) ((var17.method_46$0dd78e0064(var15)) ? 1 : 0);
         }

         var28 = var5;
      }

      label109: {
         label108:
         if (var28 == null) {
            if (var24 != 0) {
               long var33 = -7220916662131890872L;
               BooleanSetting var18 = this.settingOnlyKillAuraTarget;
               var24 = (int) ((var18.method_49$aae029aa0a()) ? 1 : 0);
               if (var5 != null) {
                  break label108;
               }

               if (var24 == 0) {
                  break label109;
               }
            }

            long var34 = -7220916662131890872L;
            BooleanSetting var19 = this.settingOnlyAtKillAura;
            var24 = (int) ((var19.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (var24 != 0) {
            return null;
         }
      }

      long var35 = -7218306833627524426L;
      Minecraft var20 = field_43;
      Object[] var23 = var20.field_44Q.field_44Q.stream().filter(recovery$indy$38(this)).sorted(Comparator.comparingDouble(recovery$indy$39(this))).toArray();
      var24 = var23.length;
      if (var5 == null) {
         if (var24 == 0) {
            return null;
         }

         long var36 = -7218390805139002541L;
         Minecraft var21 = field_43;
         Object var37 = var5;
         if (var1 >= 0L) {
            if (var5 != null) {
               return var21.field_42P;
            }

            var37 = var23[0];
         }

         double var39;
         var24 = (var39 = var21.field_42P.method_40$ee256e8a75((Entity)var37) - 3.3) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
      }

      return var24 < 0 ? null : (EntityLivingBase)var23[0];
   }





   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 25436300393705L;
      long var10000 = 4814531322399592744L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 4814747942306528339L;
      BooleanSetting var4 = this.settingCombat;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 4814747942306528339L;
         BooleanSetting var5 = this.settingOnlyKillAuraTarget;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : !var6;
   }



   private boolean method_48$7c2c45e4ce(Entity var1) {
      long var2 = a ^ 11412332632587L;
      long var4 = var2 ^ 17616205614955L;
      long var10004 = 2606354978973106335L;
      boolean var6 = true;
      long var7 = var4;
      Entity var9 = var1;
      ProjectileAimBot_47Ct var10 = this;
      return var10.method_49$9c4c88bd4b(var9, var7, var6);
   }



   private boolean method_49$9c4c88bd4b(Entity var1, long var2, boolean var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 55742982756634L;
      long var7 = var2 ^ 10879028217469L;
      int[] var9 = recovery$indy$40(-3067605596465723755L, var2);
      Entity var10000 = var1;
      if (var9 == null) {
         if (var1 == recovery$indy$41(field_43, -3065446450476538379L, var2)) {
            return false;
         }

         var10000 = var1;
      }

      byte var11 = ((byte) (recovery$indy$49(
         var10000,
         recovery$indy$42(C_473x.PLAYER, -3066606842751271745L, var2),
         recovery$indy$43(C_473x.MOB, -3066606842751271745L, var2),
         recovery$indy$44(C_473x.ANIMAL, -3066606842751271745L, var2),
         recovery$indy$45(C_473x.VILLAGER, -3066606842751271745L, var2),
         recovery$indy$46(C_473x.ARMOR_STAND, -3066606842751271745L, var2),
         recovery$indy$47(C_473x.INVISIBLE, -3066606842751271745L, var2),
         true,
         true,
         var7,
         true,
         recovery$indy$48(C_473x.DEAD, -3066606842751271745L, var2),
         true,
         -3066242291309397455L,
         var2
      ) ? 1 : 0));
      int[] var10001 = var9;
      if (var2 >= 0L) {
         if (var9 == null) {
            if (var11 == 0) {
               return false;
            }

            double var12;
            var11 = (byte)((
                     var12 = var1.method_40$ee256e8a75(recovery$indy$50(field_43, -3065446450476538379L, var2))
                        - recovery$indy$51(this.settingAimRange, var5, -3067914225491130254L, var2)
                  )
                  == 0.0
               ? 0
               : (var12 < 0.0 ? -1 : 1));
         }

         var10001 = var9;
      }

      if (var10001 != null) {
         return var11 != 0;
      } else if (var11 < 0) {
         return true;
      } else {
         return var9 != null ? var4 : !var4;
      }
   }



   private boolean method_49$7c2c45e4ce(Entity var1) {
      long var2 = a ^ 50926155945284L;
      long var4 = var2 ^ 57404801318948L;
      long var10004 = 3126771630725156816L;
      boolean var6 = false;
      long var7 = var4;
      Entity var9 = var1;
      ProjectileAimBot_47Ct var10 = this;
      return var10.method_49$9c4c88bd4b(var9, var7, var6);
   }



   private int method_45$95d88932bd(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$52(8719128493724314360L, var1);
      int var4 = 36;

      while (var4 < recovery$indy$53(field_43, 8725835796547406232L, var1).field_429.field_46.size()) {
         C_47rf var5 = recovery$indy$54(field_43, 8725835796547406232L, var1).field_429.method_46$4c10532da1(var4).method_48$ac4db64966();
         int[] var10000 = var3;
         if (var1 >= 0L) {
            if (var3 == null) {
               label70: {
                  C_47rf var7 = var5;
                  if (var1 > 0L) {
                     if (var5 == null) {
                        break label70;
                     }

                     var7 = var5;
                  }

                  byte var8 = (byte) ((var7.method_48$dbd570a038() instanceof C_45o) ? 1 : 0);
                  if (var3 != null) {
                     return var8;
                  }

                  if (var8 != 0) {
                     return var4 - 36;
                  }

                  byte var9 = (byte) ((var5.method_48$dbd570a038() instanceof C_43R) ? 1 : 0);
                  if (var3 != null) {
                     return var9;
                  }

                  if (var9 != 0) {
                     return var4 - 36;
                  }
               }

               var4++;
            }

            var10000 = var3;
         }

         if (var10000 != null) {
            break;
         }
      }

      return -1;
   }



    private boolean method_45$e04982bb4a(net.minecraft.entity.EntityLivingBase target, long eventKey) {
        long decodedKey = recovery$indy$flow$278() ^ eventKey;
        long trajectoryKey = decodedKey ^ 55085239832156L;
        long collisionKey = decodedKey ^ 135614915724744L;
        recovery$indy$flow$279();
        Object prediction = recovery$indy$flow$280();
        Object flowGuard = recovery$indy$flow$281(7249348683470845794L, decodedKey);
        Object player = recovery$indy$flow$283(recovery$indy$flow$282(), 7242395679607067650L, decodedKey);
        Object heldItem = recovery$indy$flow$286(recovery$indy$flow$285(recovery$indy$flow$284(), 7242395679607067650L, decodedKey));
        float yaw = recovery$indy$flow$289(recovery$indy$flow$288(recovery$indy$flow$287(), 7242395679607067650L, decodedKey));
        float pitch = recovery$indy$flow$292(recovery$indy$flow$291(recovery$indy$flow$290(), 7242395679607067650L, decodedKey));
        recovery$indy$flow$293(prediction, trajectoryKey, player, heldItem, yaw, pitch, 7248946226068283342L, decodedKey);
        Object collisionContext = ((java.lang.Object)(((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (((java.lang.Object)(this)))).field_40));
        int collisionTicks = recovery$indy$flow$295(prediction, 200, target, collisionContext, collisionKey, 7243105206269810659L, decodedKey);
        return flowGuard != null ? (collisionTicks & 1) != 0 : collisionTicks != Integer.MAX_VALUE;
    }



   private double method_45$83ff7736af(Entity var1) {
      long var2 = a ^ 111984655002240L;
      long var4 = var2 ^ 49113078404735L;
      long var10000 = -7729913907557677247L;
      int[] var6 = AntiBot_47CG.method_40$d4d28024c9();
      Entity var9 = var1;
      if (var6 == null) {
         if (!(var1 instanceof EntityLivingBase)) {
            return 1000.0;
         }

         var9 = var1;
      }

      double var10 = var9.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = -7729352864182190105L;
      Client var11 = Client.method_44$fbc0c0be91();
      long var10005 = -7734933882447809596L;
      Client var7 = var11;
      float var12 = var7.method_45$03ec613b6f().field_43;
      var10005 = -7729352864182190105L;
      Client var14 = Client.method_44$fbc0c0be91();
      long var10006 = -7734933882447809596L;
      Client var8 = var14;
      var10006 = -7735515115759374292L;
      return Math.abs(C_47gg.method_42$edd155e764(var10, var10001, var4, var10003, var12, var8.method_45$03ec613b6f().field_48)[0]);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 18549303047523L;
      long var10000 = 818143605123635362L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 818366792064923097L;
      BooleanSetting var4 = this.settingCombat;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 818366792064923097L;
         BooleanSetting var5 = this.settingOnlyAtKillAura;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10001 = var2 ^ 31970059946167L;
      int var4 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var5 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      if (recovery$indy$62(ClientGlobals.field_46, (char)var4, var5, this, (char)var6, 6400861696117145061L, var2)) {
         recovery$indy$63(var1, C_47tU.DEFAULT, 6398130527999960610L, var2);
      }
   }



   public void method_40G$e45a9973e5(long var1) {
      long var3 = var1 ^ 95820453366426L;
      long var10001 = var1 ^ 6407505185672L;
      int var5 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var6 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 64044482010578L;
      int var8 = (int)((var1 ^ 64044482010578L) >>> 48);
      int var9 = (int)((var1 ^ 64044482010578L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var10000 = -3625748424893325738L;
      int[] var11 = AntiBot_47CG.method_40$d4d28024c9();
      var10001 = -3625377701746607785L;
      Minecraft var13 = field_43;
      if (var13.method_44$aae029aa0a()) {
         ProjectileAimBot_47Ct var29 = this;
         if (var11 == null) {
            if (this.field_45 == null) {
               return;
            }

            var29 = this;
         }

         var10001 = -3625665979277987027L;
         BooleanSetting var14 = var29.settingCombat;
         int var31 = (int) ((var14.method_49$aae029aa0a()) ? 1 : 0);
         int[] var36 = var11;
         if (var1 > 0L) {
            if (var11 == null) {
               if (var31 == 0) {
                  return;
               }

               char var37 = (char)var8;
               char var10004 = (char)var10;
               long var10005 = -3625033895935743872L;
               char var15 = var10004;
               ProjectileAimBot_47Ct var16 = this;
               int var17 = var9;
               char var18 = var37;
               C_47S6 var19 = ClientGlobals.field_46;
               var31 = (int) ((var19.method_49$dc3f815dad(var18, var17, var16, var15)) ? 1 : 0);
            }

            var36 = var11;
         }

         if (var36 == null) {
            if (var31 == 0) {
               return;
            }

            long var10002 = -3627496997550740670L;
            long var20 = var3;
            ProjectileAimBot_47Ct var22 = this;
            var31 = var22.method_45$95d88932bd(var20);
         }

         int var12 = var31;
         int var32 = var12;
         if (var1 > 0L) {
            if (var12 < 0) {
               return;
            }

            var32 = var5;
         }

         char var10003 = (char)var6;
         char var38 = (char)var7;
         long var10006 = -3624315525206430857L;
         int var23 = var12;
         char var24 = var38;
         char var25 = var10003;
         byte var26 = -1;
         ProjectileAimBot_47Ct var27 = this;
         int var28 = var32;
         C_47i.method_43$95cbd1eb82(var28, var27, var26, var25, var24, var23);
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$64(this, 40, var3, -7102405497573065863L, var1);
      recovery$indy$65(this, 7, var3, -7102405497573065863L, var1);
      recovery$indy$66(this, 34, var3, -7102405497573065863L, var1);
      recovery$indy$67(this, 21, var3, -7102405497573065863L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_45 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public void method_487$da8c82d5d4() {
        C_477r c_477r;
        int n;
        int n2;
        int n3;
        long l;
        block21: {
            long l2;
            block23: {
                block20: {
                    long l3;
                    block22: {
                        block18: {
                            BooleanSetting c_47TV;
                            block19: {
                                long l4;
                                block17: {
                                    block16: {
                                        block15: {
                                            block14: {
                                                block10: {
                                                    int n4;
                                                    int n5;
                                                    int n6;
                                                    block12: {
                                                        block13: {
                                                            block11: {
                                                                long l5;
                                                                long l6;
                                                                long l7;
                                                                block9: {
                                                                    int n7;
                                                                    block8: {
                                                                        long l8;
                                                                        long l9 = l8 = a ^ 0xBC7C919BA60L;
                                                                        l4 = l9 ^ 0x4BAFBF206B28L;
                                                                        l2 = l9 ^ 0x7FC20765CA0BL;
                                                                        long l10 = l9 ^ 0x44297A7CB645L;
                                                                        n6 = (int)(l10 >>> 48);
                                                                        n5 = (int)(l10 << 16 >>> 32);
                                                                        n4 = (int)(l10 << 48 >>> 48);
                                                                        l7 = l9 ^ 0x2C7E4E79C36DL;
                                                                        l6 = l9 ^ 0x241BEC27882EL;
                                                                        l5 = l9 ^ 0x56DC125F21A6L;
                                                                        l = l9 ^ 0x3670C1D4858DL;
                                                                        l3 = l9 ^ 0xC833FB2A2CCL;
                                                                        long l11 = l9 ^ 0x7DE22B29D0C4L;
                                                                        n3 = (int)(l11 >>> 48);
                                                                        n2 = (int)(l11 << 16 >>> 32);
                                                                        n = (int)(l11 << 48 >>> 48);
                                                                        int[] nArray = AntiBot_47CG.method_40$d4d28024c9();
                                                                        Minecraft c_47nT = field_43;
                                                                        n7 = ((int) (c_47nT.method_44$aae029aa0a() ? 1 : 0));
                                                                        if (nArray != null) break block8;
                                                                        if (n7 == 0) {
                                                                            return;
                                                                        }
                                                                        break block9;
                                                                    }
                                                                    if (n7 < 0) {
                                                                        return;
                                                                    }
                                                                    long l12 = l5;
                                                                    ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                                                                    this.field_45 = projectileAimBot_47Ct.method_40$f2b0beb8fc(l12);
                                                                    EntityLivingBase c_47aK = this.field_45;
                                                                    EntityLivingBase c_47aK2 = c_47aK;
                                                                    int n8 = n4;
                                                                    int n9 = n5;
                                                                    short s = (short)n6;
                                                                    if (C_48p.method_43$c918038342((short)s, (int)n9, (int)n8, (EntityLivingBase)c_47aK2)) break block10;
                                                                    break block11;
                                                                }
                                                                this.field_45 = null;
                                                                ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                                                                long l13 = l7;
                                                                if (projectileAimBot_47Ct.method_45$95d88932bd(l13) < 0) {
                                                                    return;
                                                                }
                                                                long l14 = l5;
                                                                ProjectileAimBot_47Ct projectileAimBot_47Ct2 = this;
                                                                this.field_45 = projectileAimBot_47Ct2.method_40$f2b0beb8fc(l14);
                                                                if (this.field_45 == null) break block12;
                                                                Minecraft c_47nT = field_43;
                                                                double d = 180.0 - C_47hN.method_44$eb37070982((double)C_47sk.method_41$f6c4892e39((float)c_47nT.field_42P.field_48h), (double)C_47sk.method_41$f6c4892e39((float)this.field_45.field_43m));
                                                                NumberSetting c_47TS = this.settingMaxTargetLookFovDiff;
                                                                long l15 = l6;
                                                                if (!(d > c_47TS.method_44$474dfaa627(l15))) break block12;
                                                                break block13;
                                                            }
                                                            this.field_45 = null;
                                                            return;
                                                        }
                                                        this.field_45 = null;
                                                    }
                                                    if (this.field_45 == null) return;
                                                    EntityLivingBase c_47aK = this.field_45;
                                                    EntityLivingBase c_47aK3 = c_47aK;
                                                    int n10 = n4;
                                                    int n11 = n5;
                                                    short s = (short)n6;
                                                    if (C_48p.method_43$c918038342((short)s, (int)n11, (int)n10, (EntityLivingBase)c_47aK3)) {
                                                        return;
                                                    }
                                                    break block14;
                                                }
                                                int n12 = 3;
                                                EntityLivingBase c_47aK = this.field_45;
                                                long l16 = l4;
                                                ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                                                C_477r c_477r2 = projectileAimBot_47Ct.method_42$7e0c43c1fb(l16, c_47aK, n12);
                                                C_47S6 c_47S6 = ClientGlobals.field_46;
                                                C_477r c_477r3 = c_47S6.method_44$4f8050086d();
                                                long l17 = l;
                                                C_477r c_477r4 = c_477r2;
                                                C_429 c_429 = (c_477r2.field_44 == 0.0f ? this : this).field_46;
                                                C_477r c_477r5 = c_429.method_42$3b1940ea5f(c_477r4, l17, c_477r3);
                                                ProjectileAimBot_47Ct projectileAimBot_47Ct3 = this;
                                                int n13 = n;
                                                int n14 = n2;
                                                char c = (char)n3;
                                                int n15 = 0;
                                                C_477r c_477r6 = c_477r5;
                                                C_47S6 c_47S62 = ClientGlobals.field_46;
                                                c_47S62.method_45$c163d5afc8(c_477r6, n15, c, n14, n13, (Module)projectileAimBot_47Ct3);
                                                return;
                                            }
                                            Minecraft c_47nT = field_43;
                                            if (c_47nT.field_44r.field_45w.method_42$aae029aa0a()) break block15;
                                            BooleanSetting c_47TV2 = this.settingCombat;
                                            if (!c_47TV2.method_49$aae029aa0a()) break block16;
                                        }
                                        Minecraft c_47nT = field_43;
                                        if (!c_47nT.field_44r.field_45w.method_42$aae029aa0a()) break block17;
                                        ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                                        long l18 = l3;
                                        if (projectileAimBot_47Ct.method_402$0dd78e0064(l18)) break block17;
                                        break block18;
                                    }
                                    this.field_45 = null;
                                    return;
                                }
                                int n16 = 3;
                                EntityLivingBase c_47aK = this.field_45;
                                long l19 = l4;
                                ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                                c_477r = projectileAimBot_47Ct.method_42$7e0c43c1fb(l19, c_47aK, n16);
                                if (c_477r.field_44 != 0.0f) break block19;
                                if (c_477r.field_41 == 0.0f) break block20;
                            }
                            if ((c_47TV = this.settingPredict).method_49$aae029aa0a()) break block21;
                            break block22;
                        }
                        this.field_45 = null;
                        return;
                    }
                    ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
                    long l20 = l3;
                    if (projectileAimBot_47Ct.method_402$0dd78e0064(l20)) break block21;
                    break block23;
                }
                this.field_45 = null;
                return;
            }
            KillAura_47CY killAura_47CY = ClientGlobals.field_48.field_48Q;
            long l21 = l2;
            if (((Module)killAura_47CY).method_46$0dd78e0064(l21) && ClientGlobals.field_48.field_48Q.field_45z != null) {
                BooleanSetting c_47TV = this.settingCombat;
                if (c_47TV.method_49$aae029aa0a()) return;
            }
        }
        C_47S6 c_47S6 = ClientGlobals.field_46;
        C_477r c_477r7 = c_47S6.method_44$4f8050086d();
        long l22 = l;
        C_477r c_477r8 = c_477r;
        C_429 c_429 = this.field_46;
        C_477r c_477r9 = c_429.method_42$3b1940ea5f(c_477r8, l22, c_477r7);
        ProjectileAimBot_47Ct projectileAimBot_47Ct = this;
        int n17 = n;
        int n18 = n2;
        char c = (char)n3;
        int n19 = 0;
        C_477r c_477r10 = c_477r9;
        C_47S6 c_47S63 = ClientGlobals.field_46;
        c_47S63.method_45$c163d5afc8(c_477r10, n19, c, n18, n17, (Module)projectileAimBot_47Ct);
    }







    public ProjectileAimBot_47Ct(long a0) {
        super((java.lang.String) ("ProjectileAimBot"),(java.lang.String) ("ProjektilZielhilfe"),(long) (((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 96174087771790L)),(java.awt.Color) (new java.awt.Color((int) (250),(int) (233),(int) (85))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 112724085644152L);
        long constructorKey4 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 52284132908968L);
        long constructorKey5 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 88938978349855L);
        long constructorKey6 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 88263817262164L);
        long constructorKey7 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 42179899706005L);
        long constructorKey8 = ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a ^ a0) ^ 12115946272018L);
        client.setting.SettingGroup initialized9 = new client.setting.SettingGroup(this, "Rotations", true, constructorKey5);
        recovery$indy$flow$428(this, initialized9);
        client.setting.NumberSetting initialized10 = new client.setting.NumberSetting(this, "MaxTargetLookFovDiff", Double.longBitsToDouble(4640537203540230144L), constructorKey8, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$431(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey7, "Combat", true);
        recovery$indy$flow$434(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey7, "Predict", true);
        recovery$indy$flow$437(this, initialized12);
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, constructorKey7, "OnlyAtKillAura", true);
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (((java.lang.Object)(this)))).settingCombat));
        java.lang.Object initialValue15 = recovery$indy$flow$441(initialValue14);
        java.lang.Object initialValue16 = recovery$indy$flow$442(initialValue14);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey4;
        client.setting.BooleanSetting initialValue19 = initialized13;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$445(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$447(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey7, "OnlyKillAuraTarget", true);
        java.lang.Object initialValue25 = recovery$indy$flow$450(this);
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey4;
        client.setting.BooleanSetting initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$453(initialValue29, initialValue27, initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue31))))));
        recovery$indy$flow$455(this, initialValue32);
        client.setting.NumberSetting initialized33 = new client.setting.NumberSetting(this, "AimRange", Double.longBitsToDouble(4621819117588971520L), constructorKey8, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4624633867356078080L), 1);
        java.lang.Object initialValue34 = recovery$indy$flow$458(this);
        java.lang.Object initialValue35 = initialValue34;
        client.setting.NumberSetting initialValue36 = initialized33;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue39 = recovery$indy$flow$461(initialValue37, initialValue38);
        recovery$indy$flow$462(this, initialValue39);
        client.setting.BooleanSetting initialized40 = new client.setting.BooleanSetting(this, constructorKey7, "AssistAtRightClick", false);
        recovery$indy$flow$465(this, initialized40);
        java.lang.Object initialValue41 = recovery$indy$flow$467();
        client.setting.MultiSelectSetting initialized42 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue41));
        recovery$indy$flow$469(this, initialized42);
        recovery$indy$flow$470(this, null);
        recovery$indy$flow$471(this, 0);
        recovery$indy$flow$472(this, 0);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (((java.lang.Object)(this)))).settingRotations));
        net.C_429 initialized44 = new net.C_429(this, (client.setting.SettingGroup) (initialValue43), constructorKey6);
        recovery$indy$flow$476(this, initialized44);
        recovery$indy$flow$477(this, null);
        return;
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$14(long a0,long a1);
    private static native boolean recovery$indy$flow$15(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$17(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$19(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$21(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$23(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$33(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$35(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$38(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$43(long a0,java.lang.Object a1,int a2,int a3,int a4,int a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$44(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$49(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$51(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$54(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$57(java.lang.Object a0,java.lang.Object a1,int a2,int a3,int a4,boolean a5,byte a6,int a7,long a8,long a9);
    private static native java.lang.Object recovery$indy$flow$59(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$78(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native boolean recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$81(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$83(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$86(java.lang.Object a0,float a1,long a2,float a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$88(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$91(java.lang.Object a0,float a1,long a2,float a3,long a4,long a5);
    private static native float recovery$indy$flow$92(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$97(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$101(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,double a4,double a5,double a6,float a7,float a8,long a9,long a10);
    private static native int recovery$indy$flow$105(java.lang.Object a0,int a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$112(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$278() {
        return augustus.recovered.modules.combat.ProjectileAimBot_47Ct.a;
    }
    private static native java.lang.Object recovery$indy$flow$279();
    private static native java.lang.Object recovery$indy$flow$280();
    private static native java.lang.Object recovery$indy$flow$281(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$282() {
        return augustus.recovered.modules.combat.ProjectileAimBot_47Ct.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$284() {
        return augustus.recovered.modules.combat.ProjectileAimBot_47Ct.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$285(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$286(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$287() {
        return augustus.recovered.modules.combat.ProjectileAimBot_47Ct.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$288(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$289(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43F;
    }
    private static java.lang.Object recovery$indy$flow$290() {
        return augustus.recovered.modules.combat.ProjectileAimBot_47Ct.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$291(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$292(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43n;
    }
    private static native void recovery$indy$flow$293(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);

    private static native int recovery$indy$flow$295(java.lang.Object a0,int a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5,long a6);
    private static native void recovery$indy$flow$428(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$431(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$434(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$437(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$441(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$442(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$445(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$447(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$450(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$453(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$455(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$458(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$462(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$465(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$467();
    private static native void recovery$indy$flow$469(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$470(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (a0)).field_45 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$471(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$472(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (a0)).field_42 = a1;
        return;
    }

    private static native void recovery$indy$flow$476(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$477(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.ProjectileAimBot_47Ct) (a0)).field_40 = ((net.C_478i) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$36(ProjectileAimBot_47Ct var0);
   private static native ToDoubleFunction recovery$indy$37(ProjectileAimBot_47Ct var0);
   private static native Predicate recovery$indy$38(ProjectileAimBot_47Ct var0);
   private static native ToDoubleFunction recovery$indy$39(ProjectileAimBot_47Ct var0);
   private static native int[] recovery$indy$40(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);
   private static native boolean recovery$indy$42(Object var0, long var1, long var3);
   private static native boolean recovery$indy$43(Object var0, long var1, long var3);
   private static native boolean recovery$indy$44(Object var0, long var1, long var3);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3);
   private static native boolean recovery$indy$47(Object var0, long var1, long var3);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(
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
   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);
   private static native double recovery$indy$51(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$52(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$53(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native boolean recovery$indy$62(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native void recovery$indy$63(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$71();
}
