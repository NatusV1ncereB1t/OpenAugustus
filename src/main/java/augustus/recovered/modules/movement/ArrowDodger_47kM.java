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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_472n;
import net.C_475c;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BZ;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UH;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47i;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_47tf;
import net.C_47vs;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ArrowDodger_47kM extends client.module.Module implements net.C_47hi,net.C_47UH,net.C_48T {
    private final client.setting.BooleanSetting settingDoge = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingArrowHitboxExpand = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReleaseItemAtCollisionIncoming = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileEating = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
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
      long var2 = a ^ 42241219548854L;
      long var4 = var2 ^ 78429900962854L;
      long var10000 = -6878074978659220674L;
      boolean var6 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -6880402960137430946L;
      BooleanSetting var7 = this.settingReleaseItemAtCollisionIncoming;
      boolean var16 = var7.method_49$aae029aa0a();
      if (!var6) {
         if (!var16) {
            return;
         }

         var16 = this.field_43a;
      }

      if (var16) {
         var10001 = -6877223092377717197L;
         Minecraft var8 = field_43;
         if (var8.field_42P.method_48$ac4db64966() != null) {
            long var10002 = -6880479262553603201L;
            long var9 = var4;
            ArrowDodger_47kM var11 = this;
            if (!C_47i.method_49$e40da76921(var11, var9)) {
               var10002 = -6877441830836332450L;
               boolean var12 = false;
               C_475c var13 = var1;
               var13.method_447$f633c984d8(var12);
               var10002 = -6877839989499236410L;
               boolean var14 = false;
               C_475c var15 = var1;
               var15.method_45$f633c984d8(var14);
            }
         }
      }
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      int var10000;
      label27: {
         byte var4 = (byte) ((recovery$indy$1(6399187510980262780L, var2)) ? 1 : 0);
         var10000 = this.field_42;
         byte var10001 = var4;
         if (var2 > 0L) {
            if (var4 != 0) {
               break label27;
            }

            var10001 = -2;
         }

         if (this.field_42 == var10001) {
            return;
         }

         var10000 = (int) ((recovery$indy$2(this.settingDoge, 6395592965236826140L, var2)) ? 1 : 0);
      }

      if (var10000 != 0) {
         recovery$indy$3(var1, this.field_43y, 6399604465977159718L, var2);
         recovery$indy$4(var1, this.field_42, 6399402058474034910L, var2);
      }
   }



   private static double method_47$39745cff3f(C_478i var0, C_47tf var1) {
      long var2 = a ^ 73882225872030L;
      long var10003 = 8837988250413318054L;
      C_478i var4 = var0;
      C_47tf var5 = var1;
      return var1.method_43$3d77d36e13(C_47gg.method_47$42676af4e9(var5, var4));
   }



   public void method_40G$e45a9973e5(long var1) {
        augustus.recovered.modules.movement.ArrowDodger_47kM var109;
        augustus.recovered.modules.movement.ArrowDodger_47kM var111;
        int var112;
        augustus.recovered.modules.movement.ArrowDodger_47kM var115;
        int var116;
        augustus.recovered.modules.movement.ArrowDodger_47kM var123;
        augustus.recovered.modules.movement.ArrowDodger_47kM var125;
        int var126;
        augustus.recovered.modules.movement.ArrowDodger_47kM var129;
        int var130;
        int var134;
        int var137;
        int var139;
        int var142;
        int var143;
        int var146;
        int var148;
      long var3 = var1 ^ 104729863225817L;
      long var5 = (var1 ^ 47842276369325L) >>> 16;
      int var7 = (int)((var1 ^ 47842276369325L) << 48 >>> 48);
      long var10001 = var1 ^ 127218108653412L;
      int var8 = (int)((var1 ^ 127218108653412L) >>> 56);
      int var9 = (int)((var1 ^ 127218108653412L) << 8 >>> 32);
      int var10 = (int)(var10001 << 40 >>> 40);
      long var11 = var1 ^ 135483163764942L;
      var10001 = var1 ^ 6407505185672L;
      int var13 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var14 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var1 ^ 73848953912433L;
      byte var21 = ((byte) (recovery$indy$flow$29(-3626644629025213306L, var1) ? 1 : 0));
      int var10000 = ((int) (recovery$indy$flow$31(this.settingNotWhileEating, -3628614017491847815L, var1) ? 1 : 0));
      if (var21 != 0) {
         label1921: {
            label1922: {
               label1923: {
                  java.util.ArrayList var64;
                  label1924: {
                     label1622: {
                        label1846: {
                           label1847: {
                              label1619: {
                                 label1618: {
                                    label1848: {
                                       label1616: {
                                          int var63;
                                          double var68;
                                          int var81;
                                          label1849: {
                                             label1850: {
                                                label1851: {
                                                   label1612: {
                                                      java.util.Iterator var65;
                                                      net.minecraft.entity.Entity var69;
                                                      if (var10000 != 0) {
                                                         var10000 = ((int) (((EntityPlayerSP)recovery$indy$flow$33(field_43, -3627573391606342892L, var1))
                                                            .method_48V$aae029aa0a() ? 1 : 0));
                                                         if (var1 < 0L) {
                                                            if (var21 != 0) {
                                                               if (var10000 == 0 && !recovery$indy$flow$38(field_43, -3626883330957062144L, var1)) {
                                                                  this.field_43a = false;
                                                                  this.field_42 = -2;
                                                                  return;
                                                               }

                                                               this.field_42 = -2;
                                                               this.field_43y = -2;
                                                               var10000 = Integer.MAX_VALUE;
                                                            }

                                                            var64 = new java.util.ArrayList();
                                                            java.util.Iterator var66 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$46(field_43, -3627190461502608652L, var1))
                                                               .field_44Q
                                                               .iterator();
                                                            if (var66.hasNext()) {
                                                               var69 = (net.minecraft.entity.Entity)var66.next();
                                                               var10000 = ((int) (var69 instanceof C_47BZ ? 1 : 0));
                                                               var142 = var21;
                                                            } else {
                                                               var10000 = ((int) (var64.isEmpty() ? 1 : 0));
                                                               var142 = var21;
                                                            }
                                                            break label1616;
                                                         }

                                                         if (var21 != 0) {
                                                            if (var10000 != 0) {
                                                               break label1921;
                                                            }

                                                            var10000 = ((int) (recovery$indy$flow$36(this.settingInInv, -3628614017491847815L, var1) ? 1 : 0));
                                                         }

                                                         if (var21 != 0) {
                                                            if (var10000 == 0 && !recovery$indy$flow$38(field_43, -3626883330957062144L, var1)) {
                                                               break label1921;
                                                            }

                                                            this.field_42 = -2;
                                                            this.field_43y = -2;
                                                            var10000 = Integer.MAX_VALUE;
                                                         }

                                                         var63 = var10000;
                                                         var64 = new java.util.ArrayList();
                                                         var65 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$46(field_43, -3627190461502608652L, var1))
                                                            .field_44Q
                                                            .iterator();
                                                         if (!var65.hasNext()) {
                                                            var10000 = ((int) (var64.isEmpty() ? 1 : 0));
                                                            break label1612;
                                                         }

                                                         var69 = (net.minecraft.entity.Entity)var65.next();
                                                         var10000 = ((int) (var69 instanceof C_47BZ ? 1 : 0));
                                                         var142 = var21;
                                                      } else {
                                                         var10000 = ((int) (recovery$indy$flow$36(this.settingInInv, -3628614017491847815L, var1) ? 1 : 0));
                                                         if (var21 != 0) {
                                                            if (var10000 == 0 && !recovery$indy$flow$38(field_43, -3626883330957062144L, var1)) {
                                                               this.field_43a = false;
                                                               this.field_42 = -2;
                                                               return;
                                                            }

                                                            this.field_42 = -2;
                                                            this.field_43y = -2;
                                                            var10000 = Integer.MAX_VALUE;
                                                         }

                                                         var63 = var10000;
                                                         var64 = new java.util.ArrayList();
                                                         var65 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$46(field_43, -3627190461502608652L, var1))
                                                            .field_44Q
                                                            .iterator();
                                                         if (!var65.hasNext()) {
                                                            boolean var131 = var64.isEmpty();
                                                            if (var21 == 0) {
                                                               if (!var131) {
                                                                  break label1848;
                                                               }

                                                               var64.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                               var68 = Double.MIN_VALUE;
                                                               var81 = -1;
                                                               byte var150 = ((byte) (2));
                                                               var126 = -1;
                                                               var146 = var21;
                                                               if (var1 <= 0L) {
                                                                  if (var21 != 0) {
                                                                     var126 = ((this.field_43a) ? 1 : 0);
                                                                  }

                                                                  if (var126 != 0
                                                                     && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1))
                                                                           .method_48$ac4db64966()
                                                                        != null
                                                                     && ((EntityPlayerSP)recovery$indy$flow$131(field_43, -3627573391606342892L, var1))
                                                                           .method_415$8abf5c6871()
                                                                        > 0) {
                                                                     int var43 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1))
                                                                              .field_42X
                                                                              .field_42
                                                                           == 8
                                                                        ? ((EntityPlayerSP)recovery$indy$flow$138(field_43, -3627573391606342892L, var1))
                                                                              .field_42X
                                                                              .field_42
                                                                           - 1
                                                                        : ((EntityPlayerSP)recovery$indy$flow$142(field_43, -3627573391606342892L, var1))
                                                                              .field_42X
                                                                              .field_42
                                                                           + 1;
                                                                     byte var52 = ((byte) (6));
                                                                     ArrowDodger_47kM var61 = this;
                                                                     recovery$indy$flow$145(
                                                                        var13, var61, var52, (char)var14, (char)var15, var43, -3625662901789427734L, var1
                                                                     );
                                                                  }

                                                                  return;
                                                               }
                                                               break label1849;
                                                            }

                                                            if (var131) {
                                                               break label1848;
                                                            }

                                                            var123 = this;
                                                            var143 = var21;
                                                            if (var1 < 0L) {
                                                               break label1619;
                                                            }
                                                            break label1851;
                                                         }

                                                         var69 = (net.minecraft.entity.Entity)var65.next();
                                                         var10000 = ((int) (var69 instanceof C_47BZ ? 1 : 0));
                                                         var142 = var21;
                                                         if (var1 < 0L) {
                                                            break label1616;
                                                         }
                                                      }

                                                      if (var142 != 0) {
                                                         byte var144 = var21;
                                                         if (var1 <= 0L) {
                                                            label1463: {
                                                               while (true) {
                                                                  if (var10000 >= var144) {
                                                                     net.C_47Kr var78 = new net.C_47Kr();
                                                                     recovery$indy$flow$57(var78, (C_47BZ)var69, var16, -3627599965388819901L, var1);
                                                                     java.util.ArrayList var127 = (java.util.ArrayList)recovery$indy$flow$60(
                                                                        var78,
                                                                        200,
                                                                        (float)recovery$indy$flow$59(
                                                                           this.settingArrowHitboxExpand, var3, -3626743901473137163L, var1
                                                                        ),
                                                                        (byte)var8,
                                                                        var9,
                                                                        var10,
                                                                        -3627237198531909017L,
                                                                        var1
                                                                     );
                                                                     if ((net.C_47Ij)recovery$indy$flow$61(var78, -3627372635029304138L, var1) != null) {
                                                                        label1457: {
                                                                           var10000 = ((int) (((net.C_47Ij)recovery$indy$flow$62(var78, -3627372635029304138L, var1)).field_47 instanceof EntityPlayerSP ? 1 : 0));
                                                                           if (var21 != 0) {
                                                                              if (var10000 >= var63) {
                                                                                 break label1457;
                                                                              }

                                                                              var10000 = var78.field_45R;
                                                                           }

                                                                           var63 = var10000;
                                                                        }

                                                                        if (var21 == 0) {
                                                                           break;
                                                                        }
                                                                     }
                                                                  }

                                                                  if (var65.hasNext()) {
                                                                     var69 = (net.minecraft.entity.Entity)var65.next();
                                                                     var10000 = ((int) (var69 instanceof C_47BZ ? 1 : 0));
                                                                     if (var21 != 0) {
                                                                        var144 = var21;
                                                                        continue;
                                                                     }
                                                                     break label1463;
                                                                  }
                                                                  break;
                                                               }

                                                               var10000 = ((int) (var64.isEmpty() ? 1 : 0));
                                                            }

                                                            label1411: {
                                                               label1410: {
                                                                  if (var21 != 0) {
                                                                     if (var10000 != 0) {
                                                                        break label1410;
                                                                     }

                                                                     var129 = this;
                                                                     if (var21 == 0) {
                                                                        break label1411;
                                                                     }

                                                                     var10000 = ((int) (recovery$indy$flow$70(this.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                                                  }

                                                                  if (var10000 != 0) {
                                                                     var64.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                                     byte var79 = ((byte) (-1));
                                                                     byte var145 = ((byte) (2));
                                                                     var126 = -1;
                                                                     var146 = var21;
                                                                     break label1922;
                                                                  }
                                                               }

                                                               var129 = this;
                                                            }

                                                            var129.field_43a = !var64.isEmpty();
                                                            var126 = ((recovery$indy$flow$125(
                                                               this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1
                                                            )) ? 1 : 0);
                                                            var146 = var21;
                                                            break label1922;
                                                         }

                                                         label1551: {
                                                            while (true) {
                                                               label1548: {
                                                                  if (var144 != 0) {
                                                                     if (var10000 == 0) {
                                                                        break label1548;
                                                                     }

                                                                     var10000 = var69.field_48y;
                                                                  }

                                                                  if (var10000 >= 1) {
                                                                     net.C_47Kr var76 = new net.C_47Kr();
                                                                     recovery$indy$flow$57(var76, (C_47BZ)var69, var16, -3627599965388819901L, var1);
                                                                     java.util.ArrayList var84 = (java.util.ArrayList)recovery$indy$flow$60(
                                                                        var76,
                                                                        200,
                                                                        (float)recovery$indy$flow$59(
                                                                           this.settingArrowHitboxExpand, var3, -3626743901473137163L, var1
                                                                        ),
                                                                        (byte)var8,
                                                                        var9,
                                                                        var10,
                                                                        -3627237198531909017L,
                                                                        var1
                                                                     );
                                                                     label1542:
                                                                     if ((net.C_47Ij)recovery$indy$flow$61(var76, -3627372635029304138L, var1) != null) {
                                                                        var10000 = ((int) (((net.C_47Ij)recovery$indy$flow$62(var76, -3627372635029304138L, var1)).field_47 instanceof EntityPlayerSP ? 1 : 0));
                                                                        if (var21 != 0) {
                                                                           if (var10000 == 0) {
                                                                              break label1542;
                                                                           }

                                                                           var64.add(var84);
                                                                           var10000 = var76.field_45R;
                                                                        }

                                                                        label1535: {
                                                                           if (var21 != 0) {
                                                                              if (var10000 >= var63) {
                                                                                 break label1535;
                                                                              }

                                                                              var10000 = var76.field_45R;
                                                                           }

                                                                           var63 = var10000;
                                                                        }

                                                                        if (var21 == 0) {
                                                                           break;
                                                                        }
                                                                     }
                                                                  }
                                                               }

                                                               if (!var65.hasNext()) {
                                                                  break;
                                                               }

                                                               var69 = (net.minecraft.entity.Entity)var65.next();
                                                               var10000 = ((int) (var69 instanceof C_47BZ ? 1 : 0));
                                                               if (var21 == 0) {
                                                                  break label1551;
                                                               }

                                                               var144 = var21;
                                                            }

                                                            var10000 = ((int) (var64.isEmpty() ? 1 : 0));
                                                         }

                                                         if (var21 != 0) {
                                                            if (var10000 != 0) {
                                                               break label1618;
                                                            }

                                                            var125 = this;
                                                            if (var21 == 0) {
                                                               break label1847;
                                                            }

                                                            var10000 = ((int) (recovery$indy$flow$70(this.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                                         }

                                                         if (var10000 != 0) {
                                                            var64.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                            var68 = Double.MIN_VALUE;
                                                            var81 = -1;

                                                            while (var81 < 2) {
                                                               var126 = -1;
                                                               if (var21 == 0) {
                                                                  break label1923;
                                                               }

                                                               int var85 = -1;

                                                               label1513: {
                                                                  while (var85 < 2) {
                                                                     double[] var88 = (double[])recovery$indy$flow$99(
                                                                        var63,
                                                                        (EntityPlayerSP)recovery$indy$flow$75(field_43, -3627573391606342892L, var1),
                                                                        var5,
                                                                        ((EntityPlayerSP)recovery$indy$flow$77(field_43, -3627573391606342892L, var1)).field_48Q,
                                                                        ((EntityPlayerSP)recovery$indy$flow$80(field_43, -3627573391606342892L, var1)).field_48j,
                                                                        ((EntityPlayerSP)recovery$indy$flow$83(field_43, -3627573391606342892L, var1)).field_42o,
                                                                        (short)var7,
                                                                        ((EntityPlayerSP)recovery$indy$flow$86(field_43, -3627573391606342892L, var1)).field_48h,
                                                                        new net.C_472n(
                                                                           var11,
                                                                           var85,
                                                                           var81,
                                                                           ((EntityPlayerSP)recovery$indy$flow$90(field_43, -3627573391606342892L, var1))
                                                                              .field_49w
                                                                              .field_42,
                                                                           ((EntityPlayerSP)recovery$indy$flow$94(field_43, -3627573391606342892L, var1))
                                                                              .field_49w
                                                                              .field_49,
                                                                           net.C_47vs.PRE
                                                                        ),
                                                                        -3625538708120953430L,
                                                                        var1
                                                                     );
                                                                     float var91 = ((EntityPlayerSP)recovery$indy$flow$101(
                                                                                 field_43, -3627573391606342892L, var1
                                                                              ))
                                                                              .field_48w
                                                                           / 2.0F
                                                                        + 0.1F;
                                                                     net.C_478i var94 = new net.C_478i(
                                                                        var88[0] - var91,
                                                                        var88[1] - 0.1F,
                                                                        var88[2] - var91,
                                                                        var88[0] + var91,
                                                                        var88[1]
                                                                           + ((EntityPlayerSP)recovery$indy$flow$105(field_43, -3627573391606342892L, var1)).field_48
                                                                           + 0.1F,
                                                                        var88[2] + var91
                                                                     );
                                                                     double var97 = 0.0;
                                                                     if (var21 == 0) {
                                                                        break label1513;
                                                                     }

                                                                     java.util.Iterator var100 = var64.iterator();

                                                                     while (true) {
                                                                        if (var100.hasNext()) {
                                                                           java.util.ArrayList var103 = (java.util.ArrayList)var100.next();
                                                                           net.C_47tf var106 = ((net.C_47tf) (var103.stream()
                                                                              .min(
                                                                                 java.util.Comparator.comparingDouble(
                                                                                    (java.util.function.ToDoubleFunction<? super net.C_47tf>)recovery$indy$flow$113(var94)
                                                                                 )
                                                                              )
                                                                              .orElse(null)));
                                                                           if (var21 == 0) {
                                                                              break;
                                                                           }

                                                                           if (var21 != 0) {
                                                                              if (var106 == null) {
                                                                                 continue;
                                                                              }

                                                                              var97 += var106.method_43$3d77d36e13(
                                                                                 (net.C_47tf)recovery$indy$flow$118(var106, var94, -3627151328858109783L, var1)
                                                                              );
                                                                           }

                                                                           if (var21 != 0) {
                                                                              continue;
                                                                           }
                                                                        }

                                                                        if (var97 > var68) {
                                                                           this.field_42 = var81;
                                                                           this.field_43y = var85;
                                                                           var68 = var97;
                                                                        }

                                                                        var85++;
                                                                        break;
                                                                     }

                                                                     if (var21 == 0) {
                                                                        break;
                                                                     }
                                                                  }

                                                                  var81++;
                                                               }

                                                               if (var21 == 0) {
                                                                  break label1618;
                                                               }
                                                            }
                                                         }
                                                         break label1618;
                                                      }
                                                   }

                                                   if (var21 == 0) {
                                                      break label1850;
                                                   }

                                                   if (var10000 != 0) {
                                                      break label1846;
                                                   }

                                                   var123 = this;
                                                   var143 = var21;
                                                }

                                                if (var143 == 0) {
                                                   break label1924;
                                                }

                                                var10000 = ((int) (recovery$indy$flow$70(var123.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                             }

                                             if (var10000 == 0) {
                                                break label1846;
                                             }

                                             var64.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                             var68 = Double.MIN_VALUE;
                                             var81 = -1;
                                             byte var149 = ((byte) (2));
                                             var126 = -1;
                                             var146 = var21;
                                             if (var1 <= 0L) {
                                                break label1922;
                                             }
                                          }

                                          while (true) {
                                             if (var146 == 0) {
                                                break label1923;
                                             }

                                             int var86 = var126;

                                             label1582: {
                                                while (var86 < 2) {
                                                   double[] var89 = (double[])recovery$indy$flow$99(
                                                      var63,
                                                      (EntityPlayerSP)recovery$indy$flow$75(field_43, -3627573391606342892L, var1),
                                                      var5,
                                                      ((EntityPlayerSP)recovery$indy$flow$77(field_43, -3627573391606342892L, var1)).field_48Q,
                                                      ((EntityPlayerSP)recovery$indy$flow$80(field_43, -3627573391606342892L, var1)).field_48j,
                                                      ((EntityPlayerSP)recovery$indy$flow$83(field_43, -3627573391606342892L, var1)).field_42o,
                                                      (short)var7,
                                                      ((EntityPlayerSP)recovery$indy$flow$86(field_43, -3627573391606342892L, var1)).field_48h,
                                                      new net.C_472n(
                                                         var11,
                                                         var86,
                                                         var81,
                                                         ((EntityPlayerSP)recovery$indy$flow$90(field_43, -3627573391606342892L, var1)).field_49w.field_42,
                                                         ((EntityPlayerSP)recovery$indy$flow$94(field_43, -3627573391606342892L, var1)).field_49w.field_49,
                                                         net.C_47vs.PRE
                                                      ),
                                                      -3625538708120953430L,
                                                      var1
                                                   );
                                                   float var92 = ((EntityPlayerSP)recovery$indy$flow$101(field_43, -3627573391606342892L, var1)).field_48w
                                                         / 2.0F
                                                      + 0.1F;
                                                   net.C_478i var95 = new net.C_478i(
                                                      var89[0] - var92,
                                                      var89[1] - 0.1F,
                                                      var89[2] - var92,
                                                      var89[0] + var92,
                                                      var89[1]
                                                         + ((EntityPlayerSP)recovery$indy$flow$105(field_43, -3627573391606342892L, var1)).field_48
                                                         + 0.1F,
                                                      var89[2] + var92
                                                   );
                                                   double var98 = 0.0;
                                                   if (var21 == 0) {
                                                      break label1582;
                                                   }

                                                   java.util.Iterator var101 = var64.iterator();

                                                   while (true) {
                                                      if (var101.hasNext()) {
                                                         java.util.ArrayList var104 = (java.util.ArrayList)var101.next();
                                                         net.C_47tf var107 = ((net.C_47tf) (var104.stream()
                                                            .min(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction<? super net.C_47tf>)recovery$indy$flow$113(var95)))
                                                            .orElse(null)));
                                                         if (var21 == 0) {
                                                            break;
                                                         }

                                                         if (var21 != 0) {
                                                            if (var107 == null) {
                                                               continue;
                                                            }

                                                            var98 += var107.method_43$3d77d36e13(
                                                               (net.C_47tf)recovery$indy$flow$118(var107, var95, -3627151328858109783L, var1)
                                                            );
                                                         }

                                                         if (var21 != 0) {
                                                            continue;
                                                         }
                                                      }

                                                      if (var98 > var68) {
                                                         this.field_42 = var81;
                                                         this.field_43y = var86;
                                                         var68 = var98;
                                                      }

                                                      var86++;
                                                      break;
                                                   }

                                                   if (var21 == 0) {
                                                      break;
                                                   }
                                                }

                                                var81++;
                                             }

                                             if (var21 == 0 || var81 >= 2) {
                                                break label1618;
                                             }

                                             var126 = -1;
                                             var146 = var21;
                                          }
                                       }

                                       if (var142 == 0) {
                                          if (var10000 == 0) {
                                             return;
                                          }

                                          var64.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                          byte var80 = ((byte) (-1));
                                          byte var147 = ((byte) (2));
                                          var130 = -1;
                                          var148 = var21;
                                          break label1622;
                                       }

                                       if (var10000 != 0) {
                                          return;
                                       }

                                       var123 = this;
                                       var143 = var21;
                                       break label1619;
                                    }

                                    if (var1 < 0L) {
                                       return;
                                    }
                                    break label1846;
                                 }

                                 var125 = this;
                                 break label1847;
                              }

                              var123.field_43a = var143 == 0;
                              var130 = ((recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1)) ? 1 : 0);
                              var148 = var21;
                              break label1622;
                           }

                           var125.field_43a = !var64.isEmpty();
                           var126 = ((recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1)) ? 1 : 0);
                           break label1923;
                        }

                        var123 = this;
                        break label1924;
                     }

                     if (var148 != 0) {
                        if (var130 == 0) {
                           return;
                        }

                        var130 = ((this.field_43a) ? 1 : 0);
                     }

                     if (var130 != 0
                        && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_48$ac4db64966() != null
                        && ((EntityPlayerSP)recovery$indy$flow$131(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
                        int var41 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 == 8
                           ? ((EntityPlayerSP)recovery$indy$flow$138(field_43, -3627573391606342892L, var1)).field_42X.field_42 - 1
                           : ((EntityPlayerSP)recovery$indy$flow$142(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 1;
                        byte var50 = ((byte) (6));
                        ArrowDodger_47kM var59 = this;
                        recovery$indy$flow$145(var13, var59, var50, (char)var14, (char)var15, var41, -3625662901789427734L, var1);
                     }

                     return;
                  }

                  var123.field_43a = !var64.isEmpty();
                  boolean var132 = recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1);
                  if (var21 != 0) {
                     if (!var132) {
                        return;
                     }

                     var132 = this.field_43a;
                  }

                  if (var132
                     && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_48$ac4db64966() != null
                     && ((EntityPlayerSP)recovery$indy$flow$131(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
                     int var44 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 == 8
                        ? ((EntityPlayerSP)recovery$indy$flow$138(field_43, -3627573391606342892L, var1)).field_42X.field_42 - 1
                        : ((EntityPlayerSP)recovery$indy$flow$142(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 1;
                     byte var53 = ((byte) (6));
                     ArrowDodger_47kM var62 = this;
                     recovery$indy$flow$145(var13, var62, var53, (char)var14, (char)var15, var44, -3625662901789427734L, var1);
                  }

                  return;
               }

               if (var21 != 0) {
                  if (var126 == 0) {
                     return;
                  }

                  var126 = ((this.field_43a) ? 1 : 0);
               }

               if (var126 != 0
                  && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_48$ac4db64966() != null
                  && ((EntityPlayerSP)recovery$indy$flow$131(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
                  int var42 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 == 8
                     ? ((EntityPlayerSP)recovery$indy$flow$138(field_43, -3627573391606342892L, var1)).field_42X.field_42 - 1
                     : ((EntityPlayerSP)recovery$indy$flow$142(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 1;
                  byte var51 = ((byte) (6));
                  ArrowDodger_47kM var60 = this;
                  recovery$indy$flow$145(var13, var60, var51, (char)var14, (char)var15, var42, -3625662901789427734L, var1);
               }

               return;
            }

            if (var146 != 0) {
               if (var126 == 0) {
                  return;
               }

               var126 = ((this.field_43a) ? 1 : 0);
            }

            if (var126 != 0
               && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_48$ac4db64966() != null
               && ((EntityPlayerSP)recovery$indy$flow$131(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
               int var40 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 == 8
                  ? ((EntityPlayerSP)recovery$indy$flow$138(field_43, -3627573391606342892L, var1)).field_42X.field_42 - 1
                  : ((EntityPlayerSP)recovery$indy$flow$142(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 1;
               byte var49 = ((byte) (6));
               ArrowDodger_47kM var58 = this;
               recovery$indy$flow$145(var13, var58, var49, (char)var14, (char)var15, var40, -3625662901789427734L, var1);
            }

            return;
         }

         this.field_43a = false;
         this.field_42 = -2;
      } else {
         if (var21 != 0) {
            if (var10000 == 0) {
               var10000 = ((int) (recovery$indy$flow$38(field_43, -3626883330957062144L, var1) ? 1 : 0));
            } else {
               this.field_42 = -2;
               this.field_43y = -2;
               var10000 = Integer.MAX_VALUE;
            }
         }

         label1926: {
            label1927: {
               java.util.ArrayList var23;
               label1928: {
                  label1832: {
                     label1831: {
                        label1830: {
                           label1829: {
                              label1828: {
                                 label1827: {
                                    int var22;
                                    int var75;
                                    label1874: {
                                       label1875: {
                                          var22 = var10000;
                                          var23 = new java.util.ArrayList();
                                          java.util.Iterator var24 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$46(field_43, -3627190461502608652L, var1)).field_44Q.iterator();
                                          if (var24.hasNext()) {
                                             net.minecraft.entity.Entity var25 = (net.minecraft.entity.Entity)var24.next();
                                             var10000 = ((int) (var25 instanceof C_47BZ ? 1 : 0));
                                             if (var1 < 0L) {
                                                if (var21 == 0) {
                                                   if (var10000 == 0) {
                                                      return;
                                                   }

                                                   var23.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                   byte var74 = ((byte) (-1));
                                                   byte var138 = ((byte) (2));
                                                   var116 = -1;
                                                   var139 = var21;
                                                   break label1832;
                                                }

                                                if (var10000 != 0) {
                                                   return;
                                                }

                                                var109 = this;
                                                var134 = var21;
                                                break label1830;
                                             }

                                             if (var21 != 0) {
                                                byte var135 = var21;
                                                if (var1 <= 0L) {
                                                   label1688: {
                                                      while (true) {
                                                         if (var10000 >= var135) {
                                                            label1683: {
                                                               net.C_47Kr var72 = new net.C_47Kr();
                                                               recovery$indy$flow$57(var72, (C_47BZ)var25, var16, -3627599965388819901L, var1);
                                                               java.util.ArrayList var113 = (java.util.ArrayList)recovery$indy$flow$60(
                                                                  var72,
                                                                  200,
                                                                  (float)recovery$indy$flow$59(this.settingArrowHitboxExpand, var3, -3626743901473137163L, var1),
                                                                  (byte)var8,
                                                                  var9,
                                                                  var10,
                                                                  -3627237198531909017L,
                                                                  var1
                                                               );
                                                               var10000 = ((int) (((net.C_47Ij)recovery$indy$flow$61(var72, -3627372635029304138L, var1)).field_47 instanceof EntityPlayerSP ? 1 : 0));
                                                               if (var21 != 0) {
                                                                  if (var10000 >= var22) {
                                                                     break label1683;
                                                                  }

                                                                  var10000 = var72.field_45R;
                                                               }

                                                               var22 = var10000;
                                                            }

                                                            if (var21 == 0) {
                                                               break;
                                                            }
                                                         }

                                                         if (var24.hasNext()) {
                                                            var25 = (net.minecraft.entity.Entity)var24.next();
                                                            var10000 = ((int) (var25 instanceof C_47BZ ? 1 : 0));
                                                            if (var21 != 0) {
                                                               var135 = var21;
                                                               continue;
                                                            }
                                                            break label1688;
                                                         }
                                                         break;
                                                      }

                                                      var10000 = ((int) (var23.isEmpty() ? 1 : 0));
                                                   }

                                                   label1645: {
                                                      label1644: {
                                                         if (var21 != 0) {
                                                            if (var10000 != 0) {
                                                               break label1644;
                                                            }

                                                            var115 = this;
                                                            if (var21 == 0) {
                                                               break label1645;
                                                            }

                                                            var10000 = ((int) (recovery$indy$flow$70(this.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                                         }

                                                         if (var10000 != 0) {
                                                            var23.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                            byte var73 = ((byte) (-1));
                                                            byte var136 = ((byte) (2));
                                                            var112 = -1;
                                                            var137 = var21;
                                                            break label1926;
                                                         }
                                                      }

                                                      var115 = this;
                                                   }

                                                   var115.field_43a = var23.isEmpty();
                                                   var112 = ((recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1)) ? 1 : 0);
                                                   var137 = var21;
                                                   break label1926;
                                                }

                                                label1776: {
                                                   while (true) {
                                                      label1773: {
                                                         if (var135 != 0) {
                                                            if (var10000 == 0) {
                                                               break label1773;
                                                            }

                                                            var10000 = var25.field_48y;
                                                         }

                                                         label1768:
                                                         if (var10000 >= 1) {
                                                            net.C_47Kr var26 = new net.C_47Kr();
                                                            recovery$indy$flow$57(var26, (C_47BZ)var25, var16, -3627599965388819901L, var1);
                                                            java.util.ArrayList var27 = (java.util.ArrayList)recovery$indy$flow$60(
                                                               var26,
                                                               200,
                                                               (float)recovery$indy$flow$59(this.settingArrowHitboxExpand, var3, -3626743901473137163L, var1),
                                                               (byte)var8,
                                                               var9,
                                                               var10,
                                                               -3627237198531909017L,
                                                               var1
                                                            );
                                                            var10000 = ((int) (((net.C_47Ij)recovery$indy$flow$61(var26, -3627372635029304138L, var1)).field_47 instanceof EntityPlayerSP ? 1 : 0));
                                                            if (var21 != 0) {
                                                               if (var10000 == 0) {
                                                                  break label1768;
                                                               }

                                                               var23.add(var27);
                                                               var10000 = var26.field_45R;
                                                            }

                                                            label1761: {
                                                               if (var21 != 0) {
                                                                  if (var10000 >= var22) {
                                                                     break label1761;
                                                                  }

                                                                  var10000 = var26.field_45R;
                                                               }

                                                               var22 = var10000;
                                                            }

                                                            if (var21 == 0) {
                                                               break;
                                                            }
                                                         }
                                                      }

                                                      if (!var24.hasNext()) {
                                                         break;
                                                      }

                                                      var25 = (net.minecraft.entity.Entity)var24.next();
                                                      var10000 = ((int) (var25 instanceof C_47BZ ? 1 : 0));
                                                      if (var21 == 0) {
                                                         break label1776;
                                                      }

                                                      var135 = var21;
                                                   }

                                                   var10000 = ((int) (var23.isEmpty() ? 1 : 0));
                                                }

                                                if (var21 != 0) {
                                                   if (var10000 != 0) {
                                                      break label1828;
                                                   }

                                                   var111 = this;
                                                   if (var21 == 0) {
                                                      break label1829;
                                                   }

                                                   var10000 = ((int) (recovery$indy$flow$70(this.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                                }

                                                if (var10000 != 0) {
                                                   var23.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                   var75 = -1;

                                                   while (var75 < 2) {
                                                      var112 = -1;
                                                      if (var21 == 0) {
                                                         break label1927;
                                                      }

                                                      int var82 = -1;

                                                      label1739: {
                                                         while (var82 < 2) {
                                                            double[] var28 = (double[])recovery$indy$flow$99(
                                                               var22,
                                                               (EntityPlayerSP)recovery$indy$flow$75(field_43, -3627573391606342892L, var1),
                                                               var5,
                                                               ((EntityPlayerSP)recovery$indy$flow$77(field_43, -3627573391606342892L, var1)).field_48Q,
                                                               ((EntityPlayerSP)recovery$indy$flow$80(field_43, -3627573391606342892L, var1)).field_48j,
                                                               ((EntityPlayerSP)recovery$indy$flow$83(field_43, -3627573391606342892L, var1)).field_42o,
                                                               (short)var7,
                                                               ((EntityPlayerSP)recovery$indy$flow$86(field_43, -3627573391606342892L, var1)).field_48h,
                                                               new net.C_472n(
                                                                  var11,
                                                                  var82,
                                                                  var75,
                                                                  ((EntityPlayerSP)recovery$indy$flow$90(field_43, -3627573391606342892L, var1)).field_49w.field_42,
                                                                  ((EntityPlayerSP)recovery$indy$flow$94(field_43, -3627573391606342892L, var1)).field_49w.field_49,
                                                                  net.C_47vs.PRE
                                                               ),
                                                               -3625538708120953430L,
                                                               var1
                                                            );
                                                            float var29 = ((EntityPlayerSP)recovery$indy$flow$101(field_43, -3627573391606342892L, var1)).field_48w
                                                                  / 2.0F
                                                               + 0.1F;
                                                            net.C_478i var30 = new net.C_478i(
                                                               var28[0] - var29,
                                                               var28[1] - 0.1F,
                                                               var28[2] - var29,
                                                               var28[0] + var29,
                                                               var28[1]
                                                                  + ((EntityPlayerSP)recovery$indy$flow$105(field_43, -3627573391606342892L, var1)).field_48
                                                                  + 0.1F,
                                                               var28[2] + var29
                                                            );
                                                            double var31 = 0.0;
                                                            if (var21 == 0) {
                                                               break label1739;
                                                            }

                                                            java.util.Iterator var33 = var23.iterator();

                                                            while (true) {
                                                               if (var33.hasNext()) {
                                                                  java.util.ArrayList var34 = (java.util.ArrayList)var33.next();
                                                                  net.C_47tf var35 = ((net.C_47tf) (var34.stream()
                                                                     .min(
                                                                        java.util.Comparator.comparingDouble(
                                                                           (java.util.function.ToDoubleFunction<? super net.C_47tf>)recovery$indy$flow$113(var30)
                                                                        )
                                                                     )
                                                                     .orElse(null)));
                                                                  if (var21 == 0) {
                                                                     break;
                                                                  }

                                                                  if (var21 != 0) {
                                                                     if (var35 == null) {
                                                                        continue;
                                                                     }

                                                                     var31 += var35.method_43$3d77d36e13(
                                                                        (net.C_47tf)recovery$indy$flow$118(var35, var30, -3627151328858109783L, var1)
                                                                     );
                                                                  }

                                                                  if (var21 != 0) {
                                                                     continue;
                                                                  }
                                                               }

                                                               var82++;
                                                               break;
                                                            }

                                                            if (var21 == 0) {
                                                               break;
                                                            }
                                                         }

                                                         var75++;
                                                      }

                                                      if (var21 == 0) {
                                                         break label1828;
                                                      }
                                                   }
                                                }
                                                break label1828;
                                             }

                                             if (var21 == 0) {
                                                break label1875;
                                             }

                                             if (var10000 != 0) {
                                                break label1831;
                                             }

                                             var109 = this;
                                             var134 = var21;
                                          } else {
                                             boolean var117 = var23.isEmpty();
                                             if (var21 == 0) {
                                                if (!var117) {
                                                   break label1827;
                                                }

                                                var23.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                                var75 = -1;
                                                byte var141 = ((byte) (2));
                                                var112 = -1;
                                                var137 = var21;
                                                if (var1 <= 0L) {
                                                   if (var21 != 0) {
                                                      var112 = ((this.field_43a) ? 1 : 0);
                                                   }

                                                   if (var112 != 0
                                                      && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1))
                                                            .method_415$8abf5c6871()
                                                         > 0) {
                                                      int var38 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42
                                                         + 8;
                                                      byte var47 = ((byte) (6));
                                                      ArrowDodger_47kM var56 = this;
                                                      recovery$indy$flow$145(var13, var56, var47, (char)var14, (char)var15, var38, -3625662901789427734L, var1);
                                                   }

                                                   return;
                                                }
                                                break label1874;
                                             }

                                             if (var117) {
                                                break label1827;
                                             }

                                             var109 = this;
                                             var134 = var21;
                                             if (var1 < 0L) {
                                                break label1830;
                                             }
                                          }

                                          if (var134 == 0) {
                                             break label1928;
                                          }

                                          var10000 = ((int) (recovery$indy$flow$70(var109.settingDoge, -3628614017491847815L, var1) ? 1 : 0));
                                       }

                                       if (var10000 == 0) {
                                          break label1831;
                                       }

                                       var23.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$71()));
                                       var75 = -1;
                                       byte var140 = ((byte) (2));
                                       var112 = -1;
                                       var137 = var21;
                                       if (var1 <= 0L) {
                                          break label1926;
                                       }
                                    }

                                    while (true) {
                                       if (var137 == 0) {
                                          break label1927;
                                       }

                                       int var83 = var112;

                                       label1808: {
                                          while (var83 < 2) {
                                             double[] var87 = (double[])recovery$indy$flow$99(
                                                var22,
                                                (EntityPlayerSP)recovery$indy$flow$75(field_43, -3627573391606342892L, var1),
                                                var5,
                                                ((EntityPlayerSP)recovery$indy$flow$77(field_43, -3627573391606342892L, var1)).field_48Q,
                                                ((EntityPlayerSP)recovery$indy$flow$80(field_43, -3627573391606342892L, var1)).field_48j,
                                                ((EntityPlayerSP)recovery$indy$flow$83(field_43, -3627573391606342892L, var1)).field_42o,
                                                (short)var7,
                                                ((EntityPlayerSP)recovery$indy$flow$86(field_43, -3627573391606342892L, var1)).field_48h,
                                                new net.C_472n(
                                                   var11,
                                                   var83,
                                                   var75,
                                                   ((EntityPlayerSP)recovery$indy$flow$90(field_43, -3627573391606342892L, var1)).field_49w.field_42,
                                                   ((EntityPlayerSP)recovery$indy$flow$94(field_43, -3627573391606342892L, var1)).field_49w.field_49,
                                                   net.C_47vs.PRE
                                                ),
                                                -3625538708120953430L,
                                                var1
                                             );
                                             float var90 = ((EntityPlayerSP)recovery$indy$flow$101(field_43, -3627573391606342892L, var1)).field_48w / 2.0F
                                                + 0.1F;
                                             net.C_478i var93 = new net.C_478i(
                                                var87[0] - var90,
                                                var87[1] - 0.1F,
                                                var87[2] - var90,
                                                var87[0] + var90,
                                                var87[1] + ((EntityPlayerSP)recovery$indy$flow$105(field_43, -3627573391606342892L, var1)).field_48 + 0.1F,
                                                var87[2] + var90
                                             );
                                             double var96 = 0.0;
                                             if (var21 == 0) {
                                                break label1808;
                                             }

                                             java.util.Iterator var99 = var23.iterator();

                                             while (true) {
                                                if (var99.hasNext()) {
                                                   java.util.ArrayList var102 = (java.util.ArrayList)var99.next();
                                                   net.C_47tf var105 = ((net.C_47tf) (var102.stream()
                                                      .min(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction<? super net.C_47tf>)recovery$indy$flow$113(var93)))
                                                      .orElse(null)));
                                                   if (var21 == 0) {
                                                      break;
                                                   }

                                                   if (var21 != 0) {
                                                      if (var105 == null) {
                                                         continue;
                                                      }

                                                      var96 += var105.method_43$3d77d36e13(
                                                         (net.C_47tf)recovery$indy$flow$118(var105, var93, -3627151328858109783L, var1)
                                                      );
                                                   }

                                                   if (var21 != 0) {
                                                      continue;
                                                   }
                                                }

                                                var83++;
                                                break;
                                             }

                                             if (var21 == 0) {
                                                break;
                                             }
                                          }

                                          var75++;
                                       }

                                       if (var21 == 0 || var75 >= 2) {
                                          break label1828;
                                       }

                                       var112 = -1;
                                       var137 = var21;
                                    }
                                 }

                                 if (var1 < 0L) {
                                    return;
                                 }
                                 break label1831;
                              }

                              var111 = this;
                           }

                           var111.field_43a = var23.isEmpty();
                           var112 = ((recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1)) ? 1 : 0);
                           break label1927;
                        }

                        var109.field_43a = (boolean)((((int) (var134)) & 1) != 0);
                        var116 = ((recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1)) ? 1 : 0);
                        var139 = var21;
                        break label1832;
                     }

                     var109 = this;
                     break label1928;
                  }

                  if (var139 != 0) {
                     if (var116 == 0) {
                        return;
                     }

                     var116 = ((this.field_43a) ? 1 : 0);
                  }

                  if (var116 != 0 && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
                     int var36 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 8;
                     byte var45 = ((byte) (6));
                     ArrowDodger_47kM var54 = this;
                     recovery$indy$flow$145(var13, var54, var45, (char)var14, (char)var15, var36, -3625662901789427734L, var1);
                  }

                  return;
               }

               var109.field_43a = var23.isEmpty();
               boolean var118 = recovery$indy$flow$125(this.settingReleaseItemAtCollisionIncoming, -3628614017491847815L, var1);
               if (var21 != 0) {
                  if (!var118) {
                     return;
                  }

                  var118 = this.field_43a;
               }

               if (var118 && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
                  int var39 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 8;
                  byte var48 = ((byte) (6));
                  ArrowDodger_47kM var57 = this;
                  recovery$indy$flow$145(var13, var57, var48, (char)var14, (char)var15, var39, -3625662901789427734L, var1);
               }

               return;
            }

            if (var21 != 0) {
               if (var112 == 0) {
                  return;
               }

               var112 = ((this.field_43a) ? 1 : 0);
            }

            if (var112 != 0 && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
               int var37 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 8;
               byte var46 = ((byte) (6));
               ArrowDodger_47kM var55 = this;
               recovery$indy$flow$145(var13, var55, var46, (char)var14, (char)var15, var37, -3625662901789427734L, var1);
            }

            return;
         }

         if (var137 != 0) {
            if (var112 == 0) {
               return;
            }

            var112 = ((this.field_43a) ? 1 : 0);
         }

         if (var112 != 0 && ((EntityPlayerSP)recovery$indy$flow$128(field_43, -3627573391606342892L, var1)).method_415$8abf5c6871() > 0) {
            int var18 = ((EntityPlayerSP)recovery$indy$flow$134(field_43, -3627573391606342892L, var1)).field_42X.field_42 + 8;
            byte var19 = ((byte) (6));
            ArrowDodger_47kM var20 = this;
            recovery$indy$flow$145(var13, var20, var19, (char)var14, (char)var15, var18, -3625662901789427734L, var1);
         }
      }
   }








   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$37(this, 21, var3, -7100516187566924975L, var1);
      recovery$indy$38(this, 7, var3, -7100516187566924975L, var1);
      recovery$indy$39(this, 34, var3, -7100516187566924975L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
   }



    public ArrowDodger_47kM(long a0) {
        super((java.lang.String) ("ArrowDodger"),(java.lang.String) ("PfeilAusweicher"),(long) (((augustus.recovered.modules.movement.ArrowDodger_47kM.a ^ a0) ^ 109577124910931L)),(java.awt.Color) (new java.awt.Color((int) (49),(int) (234),(int) (247))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.ArrowDodger_47kM.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.ArrowDodger_47kM.a ^ a0) ^ 20394287156040L);
        long constructorKey4 = ((augustus.recovered.modules.movement.ArrowDodger_47kM.a ^ a0) ^ 70181265208527L);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey3, "Doge", true);
        recovery$indy$flow$152(this, initialized5);
        client.setting.NumberSetting initialized6 = new client.setting.NumberSetting(this, "Arrow hitbox expand", Double.longBitsToDouble(4596373779694328218L), constructorKey4, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue7 = ((java.lang.Object)(((augustus.recovered.modules.movement.ArrowDodger_47kM) (((java.lang.Object)(this)))).settingDoge));
        java.lang.Object initialValue8 = recovery$indy$flow$156(initialValue7);
        java.lang.Object initialValue9 = recovery$indy$flow$157(initialValue7);
        java.lang.Object initialValue10 = initialValue9;
        client.setting.NumberSetting initialValue11 = initialized6;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue10))))));
        java.lang.Object initialValue14 = recovery$indy$flow$160(initialValue12, initialValue13);
        recovery$indy$flow$161(this, initialValue14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey3, "Release item at collision incoming", true);
        recovery$indy$flow$164(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey3, "NotWhileEating", false);
        recovery$indy$flow$167(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey3, "InInv", false);
        recovery$indy$flow$170(this, initialized17);
        recovery$indy$flow$171(this, -2);
        recovery$indy$flow$172(this, -2);
        recovery$indy$flow$173(this, false);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$29(long a0,long a1);
    private static native boolean recovery$indy$flow$31(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$33(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$36(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$38(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$46(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$57(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native double recovery$indy$flow$59(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$60(java.lang.Object a0,int a1,float a2,byte a3,int a4,int a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$62(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$70(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$71();
    private static native java.lang.Object recovery$indy$flow$75(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$83(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$86(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$94(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$99(int a0,java.lang.Object a1,long a2,double a3,double a4,double a5,short a6,float a7,java.lang.Object a8,long a9,long a10);
    private static native java.lang.Object recovery$indy$flow$101(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$105(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$113(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$118(java.lang.Object a0,java.lang.Object a1,long a2,long a3);
    private static native boolean recovery$indy$flow$125(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$128(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$131(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$134(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$138(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$142(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$145(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5,long a6,long a7);
    private static native void recovery$indy$flow$152(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$156(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$157(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$164(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$167(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$170(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$171(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.ArrowDodger_47kM) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$172(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.ArrowDodger_47kM) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$173(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.ArrowDodger_47kM) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$4(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$37(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$38(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$39(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$41();
}
