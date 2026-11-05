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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41Z;
import net.C_472n;
import net.C_477r;
import net.C_479J;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47IQ;
import net.C_47Ij;
import net.C_47K6;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47WF;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47h4;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47nU;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TPAura_47Ch extends client.module.Module implements net.C_47xz,client.event.RenderListener,net.C_47hi {
    public final client.setting.NumberSetting settingMaxDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxTeleportDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAttacksPerSecond = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNoswing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingFly = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinhurttime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDebuglines = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_47d = null; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_473; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_43W; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_477r field_49; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private void method_42$f82940a0be(final java.util.ArrayList list, final net.C_47tf e, long n) {
        n ^= TPAura_47Ch.a;
        final long n2 = n ^ 0x76F62BC3A86FL;
        final int[] array = (int[])recovery$indy$flow$1(-5731582634363194469L, n);
        java.util.Collections.reverse(list);
        if (array != null) {
            final java.util.Iterator iterator = list.iterator();
            net.C_47K6 field_49m = null;
            Label_0200: {
                if (iterator.hasNext()) {
                    final net.C_47tf c_47tf = (net.C_47tf)iterator.next();
                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf.field_40, c_47tf.field_41, c_47tf.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                    int[] array3;
                    int[] array2 = array3 = array;
                    if (n >= 0L) {
                        while (array3 == null) {
                            if (array == null) {
                                if (iterator.hasNext()) {
                                    final net.C_47tf c_47tf2 = (net.C_47tf)iterator.next();
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf2.field_40, c_47tf2.field_41, c_47tf2.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                                    array3 = array;
                                    continue;
                                }
                            }
                            field_49m = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                            break Label_0200;
                        }
                        return;
                    }
                    while (true) {
                        Object o = null;
                        Label_1190: {
                            if (array2 == null) {
                                if (iterator.hasNext()) {
                                    o = iterator.next();
                                    break Label_1190;
                                }
                            }
                            o = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                        }
                        final net.C_47tf c_47tf3 = (net.C_47tf)o;
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf3.field_40, c_47tf3.field_41, c_47tf3.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                        array2 = array;
                    }
                }
                else {
                    Object o2;
                    field_49m = (net.C_47K6)(o2 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m);
                    if (n < 0L) {
                        while (true) {
                            final net.C_47tf c_47tf4 = (net.C_47tf)o2;
                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf4.field_40, c_47tf4.field_41, c_47tf4.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                            if (array == null) {
                                if (iterator.hasNext()) {
                                    o2 = iterator.next();
                                    continue;
                                }
                            }
                            o2 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                        }
                    }
                }
            }
            field_49m.method_45$631790539f(new net.C_479J(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$32(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48Q, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$35(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48j, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$38(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_42o, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$41(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
            return;
        }
        list.add(e);
        if (recovery$indy$flow$5(this.settingLegit, -5730848640779326472L, n)) {
            final java.util.Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                recovery$indy$flow$10(this, n2, iterator2.next(), -5731403311129314935L, n);
            }
            return;
        }
        final java.util.Iterator iterator3 = list.iterator();
        net.C_47K6 field_49m2 = null;
        Label_0579: {
            if (iterator3.hasNext()) {
                final net.C_47tf c_47tf5 = (net.C_47tf)iterator3.next();
                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf5.field_40, c_47tf5.field_41, c_47tf5.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                int[] array5;
                int[] array4 = array5 = array;
                if (n >= 0L) {
                    while (array5 == null) {
                        if (array == null) {
                            if (iterator3.hasNext()) {
                                final net.C_47tf c_47tf6 = (net.C_47tf)iterator3.next();
                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf6.field_40, c_47tf6.field_41, c_47tf6.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                                array5 = array;
                                continue;
                            }
                        }
                        field_49m2 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                        break Label_0579;
                    }
                    return;
                }
                while (true) {
                    Object o3 = null;
                    Label_1317: {
                        if (array4 == null) {
                            if (iterator3.hasNext()) {
                                o3 = iterator3.next();
                                break Label_1317;
                            }
                        }
                        o3 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                    }
                    final net.C_47tf c_47tf7 = (net.C_47tf)o3;
                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf7.field_40, c_47tf7.field_41, c_47tf7.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                    array4 = array;
                }
            }
            else {
                Object o4;
                field_49m2 = (net.C_47K6)(o4 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m);
                if (n < 0L) {
                    while (true) {
                        final net.C_47tf c_47tf8 = (net.C_47tf)o4;
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m.method_45$631790539f(new net.C_479J(c_47tf8.field_40, c_47tf8.field_41, c_47tf8.field_47, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$23(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
                        if (array == null) {
                            if (iterator3.hasNext()) {
                                o4 = iterator3.next();
                                continue;
                            }
                        }
                        o4 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$28(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_49m;
                    }
                }
            }
        }
        field_49m2.method_45$631790539f(new net.C_479J(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$32(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48Q, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$35(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48j, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$38(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_42o, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$41(TPAura_47Ch.field_43, -5732981202687523751L, n)).field_48M));
    }




   private void method_42$2c868fc0cb(int var1, Entity var2, short var3, char var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      if (!recovery$indy$11(this.settingNoswing, -2962897282303914642L, var5)) {
         recovery$indy$12(field_43, -2961652352931667249L, var5).method_46i$da8c82d5d4();
      }

      recovery$indy$13(field_43, -2961652352931667249L, var5).field_49m.method_45$631790539f(new C_47WF(var2, C_41Z.ATTACK));
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$806e9620b3(float var1, float var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 41656120579433L;
      long var7 = var3 ^ 69822588314426L;
      C_477r var9 = recovery$indy$16(
         recovery$indy$14(this.field_49.field_44, var1, 180.0F, var7, 4874126220076944680L, var3),
         recovery$indy$15(this.field_49.field_41, var2, 180.0F, var7, 4874126220076944680L, var3),
         var5,
         this.field_49.field_44,
         this.field_49.field_41,
         4874537951340812737L,
         var3
      );
      this.field_49.field_44 = var9.field_44;
      this.field_49.field_41 = var9.field_41;
      recovery$indy$17(field_43, 4873199627787728776L, var3).field_48h = var9.field_44;
      recovery$indy$18(field_43, 4873199627787728776L, var3).field_48z = var9.field_41;
   }



   private static double method_40$83ff7736af(Entity var0) {
      long var1 = a ^ 63793830608930L;
      long var10002 = -5707899736971377440L;
      Minecraft var3 = field_43;
      return var0.method_43$83ff7736af(var3.field_42P);
   }



   private void method_48$3fe6464523(C_47tf var1, Entity var2, long var3) {
      int[] var10;
      var3 = a ^ var3;
      long var5 = var3 ^ 19632836698638L;
      int[] var7 = recovery$indy$19(-426657948979578374L, var3);
      boolean var10000 = recovery$indy$20(this.settingLegit, -426002845589626471L, var3);
      if (var7 == null) {
         if (var10000) {
            int var8 = recovery$indy$21(this, var5, var1, -426557584491547672L, var3);

            label40:
            while (true) {
               if (var8 > 0) {
                  var8--;
                  var2.method_44i$da8c82d5d4();
                  var10 = var7;
               } else {
                  var10 = var7;
                  if (var3 >= 0L) {
                     break;
                  }
               }

               while (true) {
                  if (var3 >= 0L) {
                     if (var10 != null) {
                        return;
                     }

                     var10 = var7;
                  }

                  if (var10 == null) {
                     break;
                  }

                  var10 = var7;
                  if (var3 >= 0L) {
                     break label40;
                  }
               }
            }

            if (var10 == null) {
               return;
            }
         }

         recovery$indy$22(field_43, -427493601709928904L, var3)
            .field_49m
            .method_45$631790539f(new C_479J(var1.field_40, var1.field_41, var1.field_47, recovery$indy$23(field_43, -427493601709928904L, var3).field_48M));
         this.field_43h.add(var1);
      }
   }



   private int method_48$9e61d57142(long var1, C_47tf var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 79937088398478L;
      long var6 = var1 ^ 61793100127166L;
      int[] var8 = recovery$indy$24(7565612217673919248L, var1);
      int var9 = 0;

      int var10000;
      label40:
      while (true) {
         if (var9 < Math.max(10.0, 15.0 * recovery$indy$25(this.settingMaxTeleportDistance, var4, 7565074633724275262L, var1))) {
            double var17;
            var10000 = (var17 = recovery$indy$26(field_43, 7564776565484379346L, var1).method_40$3d77d36e13(var3) - 0.8) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
            int[] var10001 = var8;
            if (var1 > 0L) {
               if (var8 != null) {
                  break;
               }

               var10001 = var8;
            }

            if (var10001 != null) {
               break;
            }

            if (var10000 > 0) {
               var9++;
            } else if (var1 >= 0L) {
               var10000 = var9;
               break;
            }
         } else if (var1 >= 0L) {
            var10000 = var9;
            break;
         }

         do {
            double var10 = var3.field_40 + 0.5 - recovery$indy$27(field_43, 7564776565484379346L, var1).field_48Q;
            double var12 = var3.field_47 + 0.5 - recovery$indy$28(field_43, 7564776565484379346L, var1).field_42o;
            float var14 = (float)(C_47sk.method_49$eb37070982(var12, var10) * 180.0 / Math.PI - 90.0);
            float var15 = (float)ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
            recovery$indy$29(this, var14, var15, var6, 7564796570698206340L, var1);
            recovery$indy$30(field_43, 7564776565484379346L, var1).method_44i$da8c82d5d4();
            this.field_43h
               .add(
                  new C_47tf(
                     recovery$indy$31(field_43, 7564776565484379346L, var1).field_48Q,
                     recovery$indy$32(field_43, 7564776565484379346L, var1).field_48j,
                     recovery$indy$33(field_43, 7564776565484379346L, var1).field_42o
                  )
               );
            if (var8 == null) {
               continue label40;
            }
         } while (var1 < 0L);

         var10000 = var9;
         break;
      }

      return var10000;
   }




   private void method_48$e9a28cd67d(long var1, Entity var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 2134852914427L;
      int var4 = (int)((var1 ^ 2134852914427L) >>> 48);
      int var5 = (int)((var1 ^ 2134852914427L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var1 ^ 26179683804673L;
      this.field_43a = false;
      this.field_43P = true;
      C_47tf var9 = recovery$indy$34(var3, (char)var4, (short)var5, var6, -3080244673632720347L, var1);
      double var10 = var9.field_40 - recovery$indy$35(field_43, -3079244122797776531L, var1).field_48Q;
      double var12 = var9.field_41
         - (recovery$indy$36(field_43, -3079244122797776531L, var1).field_48j + recovery$indy$37(field_43, -3079244122797776531L, var1).method_41$bc607678b6());
      double var14 = var9.field_47 - recovery$indy$38(field_43, -3079244122797776531L, var1).field_42o;
      float var16 = (float)(C_47sk.method_49$eb37070982(var14, var10) * 180.0 / Math.PI - 90.0);
      float var17 = (float)(-(C_47sk.method_49$eb37070982(var12, C_47sk.method_42$44b37c2d95(var10 * var10 + var14 * var14)) * 180.0 / Math.PI));
      recovery$indy$39(this, var16, var17, var7, -3079158559875272389L, var1);
      recovery$indy$40(field_43, -3079244122797776531L, var1).method_44i$da8c82d5d4();
      var3.method_44i$da8c82d5d4();
      this.field_43a = true;
      this.field_43P = false;
   }




   private static double method_45$56d52d2401(C_47tf var0, Entity var1) {
      return var1.method_44$4b58f7ab41(var0.field_40, var0.field_41, var0.field_47);
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      label27: {
         int[] var4 = recovery$indy$41(6398564924176341794L, var2);
         boolean var10000 = this.field_43a;
         if (var4 == null) {
            if (this.field_43a) {
               break label27;
            }

            var10000 = this.field_43P;
         }

         if (!var10000) {
            return;
         }
      }

      recovery$indy$42(var1, this.field_43P ? 0.0F : 1.0F, 6399515747907950833L, var2);
      recovery$indy$43(var1, false, 6399583501095243759L, var2);
      recovery$indy$45(var1, recovery$indy$44(field_43, 6397729319231450336L, var2).field_48d, 6398474000174841709L, var2);
      recovery$indy$46(var1, 0.0F, 6397432444518525766L, var2);
   }



   public boolean method_47$95acdcf594(C_47tf var1, long var2, C_47tf var4) {
      boolean var18;
      var2 = a ^ var2;
      C_47tf[][] var6 = new C_47tf[6][];
      C_47tf var7 = var4.method_45$8f851fab6c(var1).method_41$a365857470(0.0, 1.0, 0.0).method_47$b2124a4855().method_46$90d20bf996(0.6);
      int[] var10000 = recovery$indy$47(9194720685577157748L, var2);
      var6[0] = new C_47tf[]{var1, var4};
      var6[1] = new C_47tf[]{var1.method_47$a365857470(0.0, 1.5, 0.0), var4.method_47$a365857470(0.0, 1.5, 0.0)};
      var6[2] = new C_47tf[]{var6[0][0].method_40$8f851fab6c(var7), var6[0][1].method_40$8f851fab6c(var7)};
      var6[3] = new C_47tf[]{var6[1][0].method_40$8f851fab6c(var7), var6[1][1].method_40$8f851fab6c(var7)};
      int[] var5 = var10000;
      var6[4] = new C_47tf[]{var6[0][0].method_45$8f851fab6c(var7), var6[0][1].method_45$8f851fab6c(var7)};
      var6[5] = new C_47tf[]{var6[1][0].method_45$8f851fab6c(var7), var6[1][1].method_45$8f851fab6c(var7)};
      C_47tf[][] var8 = var6;
      int var9 = var8.length;
      int var10 = 0;

      while (var10 < var9) {
         label53: {
            label52: {
               C_47tf[] var11 = var8[var10];
               C_47tf var12 = var11[0];
               C_47tf var13 = var11[1];
               C_47Ij var14 = recovery$indy$48(field_43, 9196068365411188734L, var2)
                  .method_45$10ff535342(var12.field_40, var12.field_41, var12.field_47, var13.field_40, var13.field_41, var13.field_47, false, false, false);
               C_47Ij var17 = var14;
               if (var5 == null) {
                  if (var14 == null) {
                     break label52;
                  }

                  var17 = var14;
               }

               if (var17.field_49 == C_47Az.BLOCK) {
                  var18 = true;
                  break label53;
               }
            }

            var18 = false;
         }

         boolean var15 = var18;
         var10000 = var5;
         if (var2 >= 0L) {
            if (var5 == null) {
               if (var2 < 0L) {
                  return var15;
               }

               if (var15) {
                  this.field_43W.add(var6);
                  return true;
               }

               var10++;
            }

            var10000 = var5;
         }

         if (var10000 != null) {
            break;
         }
      }

      return false;
   }





   private int method_43$4c6ffc56d7(java.util.ArrayList var1, net.C_47tf var2, long var3, int var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 122020160293421L;
      long var8 = var3 ^ 116910433614248L;
      long var10 = var3 ^ 55357160618662L;
      int[] var12 = (int[])recovery$indy$flow$226(-731739428504947146L, var3);
      int var13 = var5;
      if (var13 >= var1.size()) {
         int var22 = var1.size();
         return var3 >= 0L ? var22 - 1 : var22;
      }

      net.C_47pN var14 = (net.C_47pN)var1.get(var13);
      net.C_47tf var15 = ((net.C_47tf)recovery$indy$flow$231((net.C_47nU)recovery$indy$flow$230(var14, -731472121628640192L, var3), var6, -730571630404070502L, var3))
         .method_47$a365857470(0.5, 0.0, 0.5);
      double var24;
      int var10000 = (
               var24 = var15.method_41$3d77d36e13(var2)
                  - recovery$indy$flow$235(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
                     * recovery$indy$flow$237(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
            )
            == 0.0
         ? 0
         : (var24 < 0.0 ? -1 : 1);
      if (var3 <= 0L) {
         if (var12 == null) {
            if (var10000 <= 0) {
               int var28 = ((int) (recovery$indy$flow$238(this, var2, var10, var15, -730480154764119125L, var3) ? 1 : 0));
               if (var12 != null) {
                  return var28 - var13;
               }

               while (var28 == 0) {
                  if (++var13 >= var1.size()) {
                     var28 = var1.size();
                     if (var3 >= 0L) {
                        return var28 - 1;
                     }

                     return var28;
                  }

                  var14 = (net.C_47pN)var1.get(var13);
                  var15 = ((net.C_47tf)recovery$indy$flow$231((net.C_47nU)recovery$indy$flow$230(var14, -731472121628640192L, var3), var6, -730571630404070502L, var3))
                     .method_47$a365857470(0.5, 0.0, 0.5);
                  double var25;
                  var28 = (
                           var25 = var15.method_41$3d77d36e13(var2)
                              - recovery$indy$flow$235(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
                                 * recovery$indy$flow$237(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
                        )
                        == 0.0
                     ? 0
                     : (var25 < 0.0 ? -1 : 1);
                  if (var12 != null) {
                     return var28 == var13 ? var5 : var13 - 1;
                  }

                  if (var28 > 0) {
                     break;
                  }

                  var28 = ((int) (recovery$indy$flow$238(this, var2, var10, var15, -730480154764119125L, var3) ? 1 : 0));
               }

               return var5 == var13 ? var5 : var13 - 1;
            }

            var10000 = var5;
         }

         if (var12 != null) {
            return var10000 - var13;
         } else {
            return var10000 == var13 ? var5 : var13 - 1;
         }
      } else {
         if (var12 != null) {
            return var10000;
         }

         if (var12 == null) {
            if (var10000 <= 0) {
               int var27 = ((int) (recovery$indy$flow$238(this, var2, var10, var15, -730480154764119125L, var3) ? 1 : 0));
               if (var12 != null) {
                  return var27 - var13;
               }

               while (true) {
                  if (var27 == 0) {
                     if (++var13 >= var1.size()) {
                        return var1.size() - 1;
                     }

                     var14 = (net.C_47pN)var1.get(var13);
                     var15 = ((net.C_47tf)recovery$indy$flow$231(
                           (net.C_47nU)recovery$indy$flow$230(var14, -731472121628640192L, var3), var6, -730571630404070502L, var3
                        ))
                        .method_47$a365857470(0.5, 0.0, 0.5);
                     double var26;
                     var27 = (
                              var26 = var15.method_41$3d77d36e13(var2)
                                 - recovery$indy$flow$235(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
                                    * recovery$indy$flow$237(this.settingMaxTeleportDistance, var8, -731085433908513000L, var3)
                           )
                           == 0.0
                        ? 0
                        : (var26 < 0.0 ? -1 : 1);
                     if (var12 != null) {
                        return var27;
                     }

                     if (var12 != null) {
                        break;
                     }

                     if (var27 <= 0) {
                        var27 = ((int) (recovery$indy$flow$238(this, var2, var10, var15, -730480154764119125L, var3) ? 1 : 0));
                        continue;
                     }
                  }

                  var27 = var5;
                  break;
               }

               return var27 == var13 ? var5 : var13 - 1;
            }

            var10000 = var5;
         }

         if (var12 != null) {
            return var10000 - var13;
         } else {
            return var10000 == var13 ? var5 : var13 - 1;
         }
      }
   }



   public void onRender3D(long var1, float var3) {
        java.util.Iterator var20;
        int var24;
      long var4 = var1 ^ 53781451951888L;
      org.lwjgl.opengl.GL11.glPushMatrix();
      int[] var10000 = (int[])recovery$indy$flow$241(8134917983572669195L, var1);
      org.lwjgl.opengl.GL11.glTranslated(
         -((net.C_47j9)recovery$indy$flow$243(field_43, 8135274640649550405L, var1)).method_41$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$246(field_43, 8135274640649550405L, var1)).method_49$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$249(field_43, 8135274640649550405L, var1)).method_45$fedcb3e4d3()
      );
      org.lwjgl.opengl.GL11.glEnable(3042);
      org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
      org.lwjgl.opengl.GL11.glDisable(3008);
      org.lwjgl.opengl.GL11.glEnable(2848);
      org.lwjgl.opengl.GL11.glDisable(2929);
      org.lwjgl.opengl.GL11.glDisable(3553);
      int[] var6 = var10000;
      net.minecraft.client.renderer.GlStateManager.method_42m$da8c82d5d4();
      org.lwjgl.opengl.GL11.glDepthMask(false);
      if (var6 == null) {
         label181: {
            label182: {
               TPAura_47Ch var19 = this;
               if (var1 > 0L) {
                  if (this.field_473 == null) {
                     break label182;
                  }

                  var19 = this;
               }

               label170: {
                  label169: {
                     if (recovery$indy$flow$262(var19.settingDebuglines, 8135669981932399464L, var1)) {
                        net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 0.0F, 0.0F, 0.3F);
                        if (var1 < 0L) {
                           break label170;
                        }

                        if (var6 == null) {
                           break label169;
                        }
                     }

                     net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 0.0F, 0.0F, 0.15F);
                  }

                  org.lwjgl.opengl.GL11.glBegin(3);
               }

               java.util.Iterator var7 = this.field_473.iterator();

               label160: {
                  label183: {
                     label158: {
                        while (true) {
                           if (var7.hasNext()) {
                              var20 = var7;
                              if (var1 <= 0L) {
                                 break label158;
                              }

                              net.C_47pN var8 = (net.C_47pN)var7.next();
                              net.C_47tf var9 = (net.C_47tf)recovery$indy$flow$272(
                                 (net.C_47nU)recovery$indy$flow$271(var8, 8134653116082600317L, var1), var4, 8133820794700568231L, var1
                              );
                              org.lwjgl.opengl.GL11.glVertex3d(var9.field_40 + 0.5, var9.field_41 + 0.01, var9.field_47 + 0.5);
                              if (var6 != null) {
                                 break;
                              }

                              if (var6 == null) {
                                 continue;
                              }
                           }

                           org.lwjgl.opengl.GL11.glEnd();
                           net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 0.9F);
                           byte var21 = 3;
                           if (var1 < 0L) {
                              while (true) {
                                 if (var21 == 0) {
                                    break label183;
                                 }

                                 net.C_47tf var15 = (net.C_47tf)var7.next();
                                 org.lwjgl.opengl.GL11.glVertex3d(var15.field_40, var15.field_41 + 0.01, var15.field_47);
                                 var10000 = var6;
                                 if (var1 >= 0L) {
                                    if (var6 != null) {
                                       break label160;
                                    }

                                    var10000 = var6;
                                 }

                                 if (var10000 != null) {
                                    break label183;
                                 }

                                 var21 = ((byte) (var7.hasNext() ? 1 : 0));
                              }
                           }

                           org.lwjgl.opengl.GL11.glBegin(3);
                           break;
                        }

                        var20 = this.field_43h.iterator();
                     }

                     var7 = var20;

                     while (var7.hasNext()) {
                        net.C_47tf var16 = (net.C_47tf)var7.next();
                        org.lwjgl.opengl.GL11.glVertex3d(var16.field_40, var16.field_41 + 0.01, var16.field_47);
                        var10000 = var6;
                        if (var1 >= 0L) {
                           if (var6 != null) {
                              break label160;
                           }

                           var10000 = var6;
                        }

                        if (var10000 != null) {
                           break;
                        }
                     }
                  }

                  if (var1 >= 0L) {
                     org.lwjgl.opengl.GL11.glEnd();
                  }
               }

               var24 = ((recovery$indy$flow$291(this.settingDebuglines, 8135669981932399464L, var1)) ? 1 : 0);
               if (var6 != null) {
                  break label181;
               }

               if (var24 != 0) {
                  net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(0.0F, 0.0F, 1.0F, 0.4F);

                  label121:
                  for (Object var25 : this.field_43W) {
                     label117:
                     while (true) {
                        net.C_47tf[][] var17 = (net.C_47tf[][])var25;
                        net.C_47tf[][] var18 = var17;
                        int var10 = var18.length;
                        var24 = 0;
                        if (var6 != null) {
                           break label181;
                        }

                        int var11 = 0;

                        while (var11 < var10) {
                           net.C_47tf[] var12 = var18[var11];
                           org.lwjgl.opengl.GL11.glBegin(3);
                           org.lwjgl.opengl.GL11.glVertex3d(var12[0].field_40, var12[0].field_41, var12[0].field_47);
                           org.lwjgl.opengl.GL11.glVertex3d(var12[1].field_40, var12[1].field_41, var12[1].field_47);
                           org.lwjgl.opengl.GL11.glEnd();
                           var11++;
                           if (var6 != null) {
                              continue label121;
                           }

                           var25 = var6;
                           if (var1 <= 0L) {
                              continue label117;
                           }

                           if (var6 != null) {
                              break;
                           }
                        }

                        var25 = var6;
                        if (var1 >= 0L) {
                           if (var6 != null) {
                              break label121;
                           }
                           break;
                        }
                     }
                  }
               }
            }

            org.lwjgl.opengl.GL11.glPopMatrix();
            org.lwjgl.opengl.GL11.glDepthMask(true);
            net.minecraft.client.renderer.GlStateManager.method_42H$da8c82d5d4();
            org.lwjgl.opengl.GL11.glEnable(3008);
            org.lwjgl.opengl.GL11.glEnable(3553);
            org.lwjgl.opengl.GL11.glEnable(2929);
            org.lwjgl.opengl.GL11.glDisable(3042);
            org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
            if (var1 < 0L) {
               return;
            }

            var24 = 2848;
         }

         org.lwjgl.opengl.GL11.glDisable(var24);
      }
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$63(this, 40, var3, -7102067448043888159L, var1);
      recovery$indy$64(this, 32, var3, -7102067448043888159L, var1);
      recovery$indy$65(this, 21, var3, -7102067448043888159L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 103317784671408L;
      long var3 = var1 ^ 95006691626674L;
      long var5 = var1 ^ 35964725853099L;
      long var7 = var1 ^ 28991199511759L;
      long var9 = var1 ^ 20265335153147L;
      long var11 = var1 ^ 39702344730670L;
      long var13 = var1 ^ 44132535081594L;
      long var15 = var1 ^ 10889770277127L;
      long var10001 = var1 ^ 98161154155097L;
      int var17 = (int)((var1 ^ 98161154155097L) >>> 32);
      int var18 = (int)((var1 ^ 98161154155097L) << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      long var20 = var1 ^ 34590593728866L;
      long var22 = var1 ^ 34418661316425L;
      long var24 = var1 ^ 137932902256302L;
      int[] var26 = AntiBot_47CG.method_40$d4d28024c9();
      net.C_47S6 var49 = client.ClientGlobals.field_46;
      this.field_49 = var49.method_44$4f8050086d();
      net.C_47cu var10000 = this.field_47d;
      if (var26 != null) {
         net.C_47cu var131 = this.field_47d;
         var131.method_46$da8c82d5d4();
         this.field_43a = true;
         long var132 = var11;
         client.setting.NumberSetting var133 = this.settingMaxDistance;
         var133.method_44$474dfaa627(var132);
         long var134 = var11;
         client.setting.NumberSetting var135 = this.settingMaxDistance;
         var135.method_44$474dfaa627(var134);
         java.util.ArrayList var125 = new java.util.ArrayList();
         net.minecraft.client.Minecraft var136 = field_43;
         java.util.Iterator var127 = var136.field_44Q.field_44Q.iterator();
         if (var127.hasNext()) {
            net.minecraft.entity.Entity var142 = (net.minecraft.entity.Entity)var127.next();
         } else {
            var125.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$386()));
         }
      } else {
         long var50 = var11;
         client.setting.NumberSetting var52 = this.settingAttacksPerSecond;
         double var143 = 1000.0 / var52.method_44$474dfaa627(var50);
         long var53 = var13;
         double var55 = var143;
         net.C_47cu var57 = var10000;
         if (var57.method_43$2ac7ee8710(var55, var53)) {
            net.C_47cu var58 = this.field_47d;
            var58.method_46$da8c82d5d4();
            this.field_43a = true;
            long var59 = var11;
            client.setting.NumberSetting var61 = this.settingMaxDistance;
            double var137 = var61.method_44$474dfaa627(var59);
            long var62 = var11;
            client.setting.NumberSetting var64 = this.settingMaxDistance;
            double var27 = var137 * var64.method_44$474dfaa627(var62);
            java.util.ArrayList var29 = new java.util.ArrayList();
            net.minecraft.client.Minecraft var65 = field_43;

            for (Object recovered$element$11249 : var65.field_44Q.field_44Q) {
         net.minecraft.entity.Entity var31 = (net.minecraft.entity.Entity) recovered$element$11249;
               net.minecraft.client.Minecraft var66 = field_43;
               if (var31 != var66.field_42P && var31 instanceof EntityLivingBase) {
                  EntityLivingBase var32 = (EntityLivingBase)var31;
                  net.minecraft.client.Minecraft var67 = field_43;
                  if (!(var31.method_43$83ff7736af(var67.field_42P) > var27)) {
                     double var138 = var32.field_432;
                     long var68 = var11;
                     client.setting.NumberSetting var70 = this.settingMinhurttime;
                     if (!(var138 > var70.method_44$474dfaa627(var68)) && !(var31 instanceof EntityPlayerSP)) {
                        net.C_47IQ var71 = net.C_47IQ.PLAYER;
                        boolean var144 = var71.method_43$aae029aa0a();
                        net.C_47IQ var72 = net.C_47IQ.MOB;
                        boolean var10002 = var72.method_43$aae029aa0a();
                        net.C_47IQ var73 = net.C_47IQ.ANIMAL;
                        boolean var10003 = var73.method_43$aae029aa0a();
                        net.C_47IQ var74 = net.C_47IQ.VILLAGER;
                        boolean var10004 = var74.method_43$aae029aa0a();
                        net.C_47IQ var75 = net.C_47IQ.INVISIBLE;
                        boolean var10006 = var75.method_43$aae029aa0a();
                        net.C_47IQ var76 = net.C_47IQ.DEAD;
                        if (recovery$indy$flow$384(
                           var31,
                           var144,
                           var10002,
                           var10003,
                           var10004,
                           false,
                           var10006,
                           true,
                           true,
                           var22,
                           true,
                           var76.method_43$aae029aa0a(),
                           true,
                           -4298322135949611526L,
                           var1
                        )) {
                           var29.add(var31);
                        }
                     }
                  }
               }
            }

            var29.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$386()));
            int var126 = 0;
            if (!var29.isEmpty()) {
               net.minecraft.client.Minecraft var77 = field_43;
               net.C_47tf var128 = var77.field_42P.method_42$41b79b67a0(1.0F);
               net.minecraft.client.Minecraft var78 = field_43;
               net.C_47tf var129 = var78.field_42P.method_42$41b79b67a0(1.0F);
               net.C_47nU var33 = new net.C_47nU((int)Math.floor(var129.field_40), (int)Math.floor(var129.field_41), (int)Math.floor(var129.field_47));
               net.minecraft.client.Minecraft var79 = field_43;
               if (var79.field_42P.field_48v != null) {
                  net.minecraft.client.Minecraft var80 = field_43;
                  int var145 = (int)var80.field_42P.field_48v.field_48;
                  net.minecraft.client.Minecraft var81 = field_43;
                  int var146 = (int)var81.field_42P.field_48v.field_47;
                  net.minecraft.client.Minecraft var82 = field_43;
                  var33 = new net.C_47nU(var145, var146, (int)var82.field_42P.field_48v.field_44);
               }

               java.util.ArrayList var34 = new java.util.ArrayList();
               this.field_473 = new java.util.ArrayList();
               this.field_43h = new java.util.ArrayList();
               this.field_43W = new java.util.ArrayList();
               net.minecraft.client.Minecraft var83 = field_43;
               this.field_43h.add(var83.field_42P.method_42$41b79b67a0(1.0F));
               int var35 = 100;
               client.setting.BooleanSetting var84 = this.settingFly;
               boolean var36 = var84.method_49$aae029aa0a();
               long var85 = var11;
               client.setting.NumberSetting var87 = this.settingMaxTargets;
               long var37 = (long)(35.0 / var87.method_44$474dfaa627(var85));
               float[] var139 = new float[2];
               net.minecraft.client.Minecraft var88 = field_43;
               var139[0] = var88.field_42P.field_48h;
               net.minecraft.client.Minecraft var89 = field_43;
               var139[1] = var89.field_42P.field_48z;
               float[] var39 = var139;

               while (var35 > 0) {
                  java.util.ArrayList var40 = new java.util.ArrayList();

                  for (Object recovered$element$15975 : var29) {
         net.minecraft.entity.Entity var42 = (net.minecraft.entity.Entity) recovered$element$15975;
                     net.C_47tf var43 = var42.method_42$41b79b67a0(1.0F);
                     net.C_47nU var44 = new net.C_47nU((int)Math.floor(var43.field_40), (int)Math.floor(var43.field_41), (int)Math.floor(var43.field_47));
                     net.C_47h4 var45 = new net.C_47h4(var33, var44, false, var3, false, var36);
                     var45.field_47L = false;
                     java.util.ArrayList var46 = (java.util.ArrayList)recovery$indy$flow$476(var45, var15, true, var37, -4297697872981194272L, var1);
                     var40.add(var42);
                     if (var46 != null && !var46.isEmpty()) {
                        java.util.Collections.reverse(var46);
                        int var47 = 0;
                        this.field_473.addAll(var46);

                        do {
                           int var90 = var47 + 1;
                           long var91 = var20;
                           net.C_47tf var93 = var129;
                           java.util.ArrayList var94 = var46;
                           TPAura_47Ch var95 = this;
                           var47 = var95.method_43$4c6ffc56d7(var94, var93, var91, var90);
                           net.C_47tf var48 = ((net.C_47tf)recovery$indy$flow$489(
                                 (net.C_47nU)recovery$indy$flow$488((net.C_47pN)var46.get(var47), -4296707047065186874L, var1), var5, -4298067134049443300L, var1
                              ))
                              .method_47$a365857470(0.5, 0.0, 0.5);
                           if (var47 == var46.size() - 1) {
                              var48 = var43;
                           }

                           long var96 = var24;
                           net.minecraft.entity.Entity var98 = var42;
                           net.C_47tf var99 = var48;
                           TPAura_47Ch var100 = this;
                           var100.method_48$3fe6464523(var99, var98, var96);
                           var129 = var48;
                           var34.add(var48);
                        } while (var47 < var46.size() - 1);

                        short var147 = (short)var18;
                        char var101 = (char)var19;
                        short var102 = var147;
                        net.minecraft.entity.Entity var103 = var42;
                        int var104 = var17;
                        TPAura_47Ch var105 = this;
                        var105.method_42$2c868fc0cb(var104, var103, var102, var101);
                        client.setting.BooleanSetting var106 = this.settingLegit;
                        if (var106.method_49$aae029aa0a()) {
                           net.minecraft.entity.Entity var107 = var42;
                           long var108 = var9;
                           TPAura_47Ch var110 = this;
                           var110.method_48$e9a28cd67d(var108, var107);
                        }

                        var33 = new net.C_47nU((int)Math.round(var129.field_40), (int)Math.round(var129.field_41), (int)Math.round(var129.field_47));
                        double var141 = ++var126;
                        long var111 = var11;
                        client.setting.NumberSetting var113 = this.settingMaxTargets;
                        if (var141 >= var113.method_44$474dfaa627(var111)) {
                           var35 = 0;
                        }
                        break;
                     }

                     double var140 = ++var126;
                     long var114 = var11;
                     client.setting.NumberSetting var116 = this.settingMaxTargets;
                     if (var140 >= var116.method_44$474dfaa627(var114)) {
                        var35 = 0;
                        break;
                     }
                  }

                  if (var29.isEmpty()) {
                     break;
                  }

                  var35--;
                  var29.removeAll(var40);
                  net.C_47tf var130 = var129;
                  var29.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$523(var130)));
               }

               if (!var34.isEmpty()) {
                  long var117 = var7;
                  net.C_47tf var119 = var128;
                  java.util.ArrayList var120 = var34;
                  TPAura_47Ch var121 = this;
                  var121.method_42$f82940a0be(var120, var119, var117);
               }

               client.setting.BooleanSetting var122 = this.settingLegit;
               if (var122.method_49$aae029aa0a()) {
                  net.minecraft.client.Minecraft var123 = field_43;
                  var123.field_42P.field_48h = var39[0];
                  net.minecraft.client.Minecraft var124 = field_43;
                  var124.field_42P.field_48z = var39[1];
               }
            }

            this.field_43a = false;
         }
      }
   }










    public TPAura_47Ch(int a0,int a1) {
        super((java.lang.String) ("TPAura"),(java.lang.String) ("Fernt\u00f6tung mittels Teleportation"),(long) ((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 101986566237159L)),(java.awt.Color) (java.awt.Color.RED),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = ((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a);
        long constructorKey2 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 11836310882406L);
        long constructorKey3 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 75785970590455L);
        long constructorKey4 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 50462018222076L);
        long constructorKey5 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 812452907131L);
        long constructorKey6 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.combat.TPAura_47Ch.a) ^ 28807601115981L);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "MaxDistance", Double.longBitsToDouble(4632233691727265792L), constructorKey5, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4639481672377565184L), 0);
        recovery$indy$flow$545(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "MaxTeleportDistance", Double.longBitsToDouble(4617315517961601024L), constructorKey5, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4621256167635550208L), 0);
        recovery$indy$flow$548(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "AttacksPerSecond", Double.longBitsToDouble(4611686018427387904L), constructorKey5, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$551(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey4, "Noswing", false);
        recovery$indy$flow$554(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey4, "Fly", true);
        recovery$indy$flow$557(this, initialized11);
        client.setting.SettingGroup initialized12 = new client.setting.SettingGroup(this, "Target", constructorKey3);
        recovery$indy$flow$560(this, initialized12);
        java.lang.Object initialValue13 = recovery$indy$flow$562();
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.combat.TPAura_47Ch) (((java.lang.Object)(this)))).settingTarget));
        client.setting.MultiSelectSetting initialized15 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey2, (net.C_47OZ[]) (initialValue13), (client.setting.SettingGroup) (initialValue14));
        recovery$indy$flow$565(this, initialized15);
        java.lang.Object initialValue16 = ((java.lang.Object)(((augustus.recovered.modules.combat.TPAura_47Ch) (((java.lang.Object)(this)))).settingTarget));
        client.setting.NumberSetting initialized17 = new client.setting.NumberSetting(this, "MaxTargets", 1.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue16), constructorKey6);
        recovery$indy$flow$569(this, initialized17);
        java.lang.Object initialValue18 = ((java.lang.Object)(((augustus.recovered.modules.combat.TPAura_47Ch) (((java.lang.Object)(this)))).settingTarget));
        client.setting.NumberSetting initialized19 = new client.setting.NumberSetting(this, "Minhurttime", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue18), constructorKey6);
        recovery$indy$flow$573(this, initialized19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey4, "Debuglines", false);
        recovery$indy$flow$576(this, initialized20);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey4, "Legit", false);
        recovery$indy$flow$579(this, initialized21);
        net.C_47cu initialized22 = new net.C_47cu();
        recovery$indy$flow$582(this, initialized22);
        java.util.ArrayList initialized23 = new java.util.ArrayList();
        recovery$indy$flow$585(this, initialized23);
        net.C_477r initialized24 = new net.C_477r();
        recovery$indy$flow$588(this, initialized24);
        recovery$indy$flow$589(this, false);
        recovery$indy$flow$590(this, false);
        return;
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$1(long a0,long a1);
    private static native boolean recovery$indy$flow$5(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$10(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$16(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$23(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$28(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$32(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$35(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$38(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$226(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$230(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$231(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$235(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$237(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$238(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$241(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$243(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$246(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$249(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$262(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$271(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$272(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$291(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$384(java.lang.Object a0,boolean a1,boolean a2,boolean a3,boolean a4,boolean a5,boolean a6,boolean a7,boolean a8,long a9,boolean a10,boolean a11,boolean a12,long a13,long a14);
    private static native java.lang.Object recovery$indy$flow$386();
    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0,long a1,boolean a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$488(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$489(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$523(java.lang.Object a0);
    private static native void recovery$indy$flow$545(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$548(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$551(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$554(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$557(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$560(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$562();

    private static native void recovery$indy$flow$565(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$569(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$573(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$579(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$582(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$585(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.TPAura_47Ch) (a0)).field_43W = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$588(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.TPAura_47Ch) (a0)).field_49 = ((net.C_477r) (a1));
        return;
    }
    private static void recovery$indy$flow$589(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.TPAura_47Ch) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$590(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.TPAura_47Ch) (a0)).field_43P = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native float recovery$indy$14(float var0, float var1, float var2, long var3, long var5, long var7);
   private static native float recovery$indy$15(float var0, float var1, float var2, long var3, long var5, long var7);
   private static native C_477r recovery$indy$16(float var0, float var1, long var2, float var4, float var5, long var6, long var8);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native int[] recovery$indy$19(long var0, long var2);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native int recovery$indy$21(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native int[] recovery$indy$24(long var0, long var2);
   private static native double recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, float var1, float var2, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$34(Object var0, char var1, short var2, int var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native void recovery$indy$39(Object var0, float var1, float var2, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);
   private static native int[] recovery$indy$41(long var0, long var2);
   private static native void recovery$indy$42(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$43(Object var0, boolean var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native void recovery$indy$45(Object var0, boolean var1, long var2, long var4);
   private static native void recovery$indy$46(Object var0, float var1, long var2, long var4);
   private static native int[] recovery$indy$47(long var0, long var2);
   private static native WorldClient recovery$indy$48(Object var0, long var1, long var3);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$72();
}
