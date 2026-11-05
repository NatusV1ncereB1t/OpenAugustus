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
import net.C_42R;
import net.C_42a;
import net.C_43r;
import net.C_43u;
import net.C_45n;
import net.C_472n;
import net.C_475c;
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
import client.setting.ModeSetting;
import net.C_47U0;
import net.C_47UH;
import net.C_47VO;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gg;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sk;
import client.module.Category;
import net.C_47tU;
import net.C_47tf;
import net.C_47tn;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class BowAimbot_47C4 extends client.module.Module implements net.C_47U0,net.C_47UH,net.C_47xz,net.C_47hi {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMoveFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMoveFixIntave = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoShoot = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNoHorizontalBruteforce = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingEntities = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_429 field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

   private double method_46$83ff7736af(Entity var1) {
      long var2 = a ^ 82335824863450L;
      long var4 = var2 ^ 51332682026653L;
      long var10000 = 890486417127729870L;
      int[] var6 = AntiBot_47CG.method_40$d4d28024c9();
      Entity var10 = var1;
      if (var6 == null) {
         if (!(var1 instanceof EntityLivingBase)) {
            return 1000.0;
         }

         var10 = var1;
      }

      double var11 = var10.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = 889808102330287427L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = 883831801206376816L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = 889808102330287427L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = 883831801206376816L;
      Client var9 = var15;
      var10006 = 884649715051707773L;
      float[] var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48);
      return (Math.abs(var7[0]) + Math.abs(var7[1])) / 2.0F;
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      int var8;
      int var9;
      int var10;
      BowAimbot_47C4 var27;
      label36: {
         long var4 = var1 ^ 135442579221586L;
         long var6 = var1 ^ 82681106200933L;
         long var10001 = var1 ^ 37614490548695L;
         var8 = (int)((var1 ^ 37614490548695L) >>> 48);
         var9 = (int)((var1 ^ 37614490548695L) << 16 >>> 32);
         var10 = (int)(var10001 << 48 >>> 48);
         long var10000 = -6220689455015669954L;
         int[] var11 = AntiBot_47CG.method_40$d4d28024c9();
         long var10002 = -6221443325815431711L;
         long var12 = var6;
         BowAimbot_47C4 var14 = this;
         boolean var26 = var14.method_43X$0dd78e0064(var12);
         if (var11 == null) {
            if (!var26) {
               return;
            }

            var27 = this;
            if (var11 != null) {
               break label36;
            }

            var10002 = -6218595867571887325L;
            long var15 = var4;
            ModeSetting var17 = this.settingMoveFix;
            var26 = var17.method_46$5f9dc63072(var15).equals(recovery$indy$1(21674, 7071766516682698107L ^ var1));
         }

         if (!var26) {
            return;
         }

         var27 = this;
      }

      if (var27.field_42 != null) {
         char var28 = (char)var8;
         char var10004 = (char)var10;
         long var10005 = -6217615269594685853L;
         char var18 = var10004;
         BowAimbot_47C4 var19 = ClientGlobals.field_48.field_44i;
         int var20 = var9;
         char var21 = var28;
         C_47S6 var22 = ClientGlobals.field_46;
         if (var22.method_49$dc3f815dad(var21, var20, var19, var18)) {
            long var29 = -6221383640033926989L;
            Client var30 = Client.method_44$fbc0c0be91();
            long var32 = -6218328569506354048L;
            Client var23 = var30;
            var32 = -6220793922616378499L;
            float var24 = var23.method_45$03ec613b6f().field_43;
            C_47VO var25 = var3;
            var25.method_49$24a796ab4c(var24);
         }
      }
   }




   private net.C_42a method_42$50631cde99(net.minecraft.entity.EntityLivingBase var1, net.C_47rf var2, long var3, int var5) {
        int var197;
        int var200;
        int var206;
        int[] var217;
      var3 = a ^ var3;
      int var6 = (int)((var3 ^ 70859969416874L) >>> 48);
      long var7 = (var3 ^ 70859969416874L) << 16 >>> 16;
      long var9 = var3 ^ 7669427795041L;
      long var11 = var3 ^ 15102136403686L;
      long var13 = var3 ^ 67077813456792L;
      long var10001 = var3 ^ 94039499584785L;
      int var15 = (int)((var3 ^ 94039499584785L) >>> 32);
      int var16 = (int)((var3 ^ 94039499584785L) << 32 >>> 56);
      int var17 = (int)(var10001 << 40 >>> 40);
      int var19 = -1;
      float var20 = 0.0F;
      int[] var10000 = (int[])recovery$indy$flow$39(-6043670767123641675L, var3);
      float var21 = 0.0F;
      int[] var18 = var10000;
      java.util.ArrayList var22 = new java.util.ArrayList();
      int var23 = 1;
      int var24 = 0;
      if (var24 < var5) {
         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
         int var215 = var22.size();
         if (var18 == null) {
            label1480: {
               label1492: {
                  label1382: {
                     float var34;
                     net.C_478i var37;
                     double[] var38;
                     int var39;
                     byte var40;
                     float var41;
                     float var42;
                     label1381: {
                        if (var23 <= var215) {
                           java.util.ArrayList var196 = var22;
                           if (var3 < 0L) {
                              while (true) {
                                 java.util.ArrayList var100 = var196;
                                 net.C_47tf var117 = (net.C_47tf)recovery$indy$flow$67(var100, var9, var23, -6036938905422112481L, var3);
                                 net.C_47tf var134 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                 double var49 = var117.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                 double var66 = var117.field_41
                                    + var1.field_48 / 2.0F
                                    - (
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                          + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                    );
                                 double var83 = var117.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                 net.C_47sk.method_49$eb37070982(var66, net.C_47sk.method_42$44b37c2d95(var49 * var49 + var83 * var83));
                                 double var151 = var1.field_48w / 2.0F;
                                 var37 = new net.C_478i(
                                    var117.field_40 - var151,
                                    var117.field_41 + var1.field_48 / 2.0F,
                                    var117.field_47 - var151,
                                    var117.field_40 + var151,
                                    var117.field_41 + var1.field_48,
                                    var117.field_47 + var151
                                 );
                                 double[] var198 = (double[])recovery$indy$flow$100(var134, var37, var13, -6042804847672525058L, var3);
                                 var39 = var23;
                                 var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                 var41 = 0.15F;
                                 float var223;
                                 int var199 = (var223 = var41 - 60.0F) == 0.0F ? 0 : (var223 < 0.0F ? -1 : 1);

                                 while (true) {
                                    if (var199 >= 0) {
                                       var200 = var39;
                                       break;
                                    }

                                    var42 = 0.0F;
                                    if (!(var42 < 0.5)) {
                                       if (var18 != null) {
                                          return new net.C_42a(var19, new float[]{var21, var20});
                                       }

                                       var200 = var24;
                                       break;
                                    }

                                    var199 = var40;
                                    int[] var216 = var18;

                                    while (var216 == null) {
                                       var216 = var18;
                                    }
                                 }

                                 if (var200 >= var5) {
                                    return new net.C_42a(var19, new float[]{var21, var20});
                                 }

                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                 var196 = var23 <= var22.size()
                                    ? var22
                                    : (
                                       var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                          var1,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                          var15,
                                          true,
                                          (byte)var16,
                                          var17,
                                          -6034979987074555695L,
                                          var3
                                       )
                                    );
                              }
                           }

                           label1378:
                           while (true) {
                              java.util.ArrayList var31 = var196;

                              while (true) {
                                 net.C_47tf var32 = (net.C_47tf)recovery$indy$flow$67(var31, var9, var23, -6036938905422112481L, var3);
                                 net.C_47tf var33 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                 double var25 = var32.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                 double var27 = var32.field_41
                                    + var1.field_48 / 2.0F
                                    - (
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                          + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                    );
                                 double var29 = var32.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                 var34 = (float)(
                                    -(net.C_47sk.method_49$eb37070982(var27, net.C_47sk.method_42$44b37c2d95(var25 * var25 + var29 * var29)) * 180.0 / Math.PI)
                                 );
                                 double var35 = var1.field_48w / 2.0F;
                                 var37 = new net.C_478i(
                                    var32.field_40 - var35,
                                    var32.field_41 + var1.field_48 / 2.0F,
                                    var32.field_47 - var35,
                                    var32.field_40 + var35,
                                    var32.field_41 + var1.field_48,
                                    var32.field_47 + var35
                                 );
                                 var38 = (double[])recovery$indy$flow$100(var33, var37, var13, -6042804847672525058L, var3);
                                 var39 = var23;
                                 var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                 var41 = 0.15F;

                                 label1372:
                                 while (true) {
                                    float var224;
                                    var197 = (var224 = var41 - 60.0F) == 0.0F ? 0 : (var224 < 0.0F ? -1 : 1);

                                    while (true) {
                                       if (var197 >= 0) {
                                          break label1372;
                                       }

                                       var42 = 0.0F;
                                       if (!(var42 < 0.5)) {
                                          var41 += 0.2F;
                                          if (var18 != null) {
                                             break label1372;
                                          }
                                          break;
                                       }

                                       var197 = var40;
                                       if (var18 == null) {
                                          break label1378;
                                       }
                                    }
                                 }

                                 if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                    break label1382;
                                 }

                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                 if (var23 <= var22.size()) {
                                    var196 = var22;
                                    break;
                                 }

                                 var31 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                    (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                    var1,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                    var15,
                                    true,
                                    (byte)var16,
                                    var17,
                                    -6034979987074555695L,
                                    var3
                                 );
                              }
                           }
                        } else {
                           java.util.ArrayList var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                              (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                              var1,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                              var15,
                              true,
                              (byte)var16,
                              var17,
                              -6034979987074555695L,
                              var3
                           );
                           net.C_47tf var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                           net.C_47tf var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                           double var50 = var118.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                           double var67 = var118.field_41
                              + var1.field_48 / 2.0F
                              - (
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                    + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                              );
                           double var84 = var118.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                           var34 = (float)(-(net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84)) * 180.0 / Math.PI));
                           double var152 = var1.field_48w / 2.0F;
                           var37 = new net.C_478i(
                              var118.field_40 - var152,
                              var118.field_41 + var1.field_48 / 2.0F,
                              var118.field_47 - var152,
                              var118.field_40 + var152,
                              var118.field_41 + var1.field_48,
                              var118.field_47 + var152
                           );
                           var38 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                           var39 = var23;
                           var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                           var41 = 0.15F;
                           float var225;
                           var197 = (var225 = var41 - 60.0F) == 0.0F ? 0 : (var225 < 0.0F ? -1 : 1);

                           label1354:
                           while (true) {
                              if (var197 >= 0) {
                                 var206 = var39;
                                 if (var3 < 0L) {
                                    break label1492;
                                 }

                                 while (true) {
                                    if (var206 == var23 || var18 != null || ++var24 >= var5) {
                                       break label1382;
                                    }

                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                    if (var23 <= var22.size()) {
                                       var101 = var22;
                                    } else {
                                       var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                          var1,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                          var15,
                                          true,
                                          (byte)var16,
                                          var17,
                                          -6034979987074555695L,
                                          var3
                                       );
                                    }

                                    var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                    var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                    var50 = var118.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                    var67 = var118.field_41
                                       + var1.field_48 / 2.0F
                                       - (
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                             + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                       );
                                    var84 = var118.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                    var34 = (float)(
                                       -(net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84)) * 180.0 / Math.PI)
                                    );
                                    var152 = var1.field_48w / 2.0F;
                                    var37 = new net.C_478i(
                                       var118.field_40 - var152,
                                       var118.field_41 + var1.field_48 / 2.0F,
                                       var118.field_47 - var152,
                                       var118.field_40 + var152,
                                       var118.field_41 + var1.field_48,
                                       var118.field_47 + var152
                                    );
                                    var38 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                    var39 = var23;
                                    var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                    var41 = 0.15F;

                                    label1344:
                                    while (true) {
                                       float var226;
                                       var197 = (var226 = var41 - 60.0F) == 0.0F ? 0 : (var226 < 0.0F ? -1 : 1);

                                       while (true) {
                                          if (var197 >= 0) {
                                             break label1344;
                                          }

                                          var42 = 0.0F;
                                          if (!(var42 < 0.5)) {
                                             var41 += 0.2F;
                                             if (var18 != null) {
                                                break label1344;
                                             }
                                             break;
                                          }

                                          var197 = var40;
                                          if (var18 == null) {
                                             break label1354;
                                          }
                                       }
                                    }

                                    var206 = var39;
                                 }
                              }

                              var42 = 0.0F;
                              if (!(var42 < 0.5)) {
                                 var41 += 0.2F;
                                 var10000 = var18;
                                 if (var3 < 0L) {
                                    break label1480;
                                 }

                                 while (true) {
                                    if (var10000 != null) {
                                       label1319:
                                       while (true) {
                                          if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                             break label1382;
                                          }

                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                          if (var23 <= var22.size()) {
                                             var101 = var22;
                                          } else {
                                             var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                var1,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                var15,
                                                true,
                                                (byte)var16,
                                                var17,
                                                -6034979987074555695L,
                                                var3
                                             );
                                          }

                                          var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                          var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                          var50 = var118.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                          var67 = var118.field_41
                                             + var1.field_48 / 2.0F
                                             - (
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                   + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                             );
                                          var84 = var118.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                          var34 = (float)(
                                             -(net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84)) * 180.0 / Math.PI)
                                          );
                                          var152 = var1.field_48w / 2.0F;
                                          var37 = new net.C_478i(
                                             var118.field_40 - var152,
                                             var118.field_41 + var1.field_48 / 2.0F,
                                             var118.field_47 - var152,
                                             var118.field_40 + var152,
                                             var118.field_41 + var1.field_48,
                                             var118.field_47 + var152
                                          );
                                          var38 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                          var39 = var23;
                                          var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                          var41 = 0.15F;
                                          float var227;
                                          var197 = (var227 = var41 - 60.0F) == 0.0F ? 0 : (var227 < 0.0F ? -1 : 1);

                                          while (var197 < 0) {
                                             var42 = 0.0F;
                                             if (!(var42 < 0.5)) {
                                                break label1319;
                                             }

                                             var197 = var40;
                                             if (var18 == null) {
                                                break label1354;
                                             }
                                          }
                                       }
                                    } else {
                                       label1327:
                                       while (true) {
                                          float var228;
                                          var197 = (var228 = var41 - 60.0F) == 0.0F ? 0 : (var228 < 0.0F ? -1 : 1);

                                          while (var197 < 0) {
                                             var42 = 0.0F;
                                             if (!(var42 < 0.5)) {
                                                break label1327;
                                             }

                                             var197 = var40;
                                             if (var18 == null) {
                                                break label1354;
                                             }
                                          }

                                          if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                             break label1382;
                                          }

                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                          if (var23 <= var22.size()) {
                                             var101 = var22;
                                          } else {
                                             var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                var1,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                var15,
                                                true,
                                                (byte)var16,
                                                var17,
                                                -6034979987074555695L,
                                                var3
                                             );
                                          }

                                          var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                          var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                          var50 = var118.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                          var67 = var118.field_41
                                             + var1.field_48 / 2.0F
                                             - (
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                   + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                             );
                                          var84 = var118.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                          var34 = (float)(
                                             -(net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84)) * 180.0 / Math.PI)
                                          );
                                          var152 = var1.field_48w / 2.0F;
                                          var37 = new net.C_478i(
                                             var118.field_40 - var152,
                                             var118.field_41 + var1.field_48 / 2.0F,
                                             var118.field_47 - var152,
                                             var118.field_40 + var152,
                                             var118.field_41 + var1.field_48,
                                             var118.field_47 + var152
                                          );
                                          var38 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                          var39 = var23;
                                          var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                          var41 = 0.15F;
                                       }
                                    }

                                    var41 += 0.2F;
                                    var10000 = var18;
                                 }
                              }

                              var197 = var40;
                              if (var18 == null) {
                                 var217 = var18;
                                 if (var3 <= 0L) {
                                    while (true) {
                                       while (var217 != null) {
                                          if (var197 >= 0) {
                                             var206 = var39;
                                             if (var3 >= 0L) {
                                                while (var206 != var23 && var18 == null && ++var24 < var5) {
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                                   if (var23 <= var22.size()) {
                                                      var101 = var22;
                                                   } else {
                                                      var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                         (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                         var1,
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                         var15,
                                                         true,
                                                         (byte)var16,
                                                         var17,
                                                         -6034979987074555695L,
                                                         var3
                                                      );
                                                   }

                                                   var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                                   var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                      .method_49$41b79b67a0(1.0F);
                                                   var50 = var118.field_40
                                                      - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                                   var67 = var118.field_41
                                                      + var1.field_48 / 2.0F
                                                      - (
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                            + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3))
                                                               .method_41$bc607678b6()
                                                      );
                                                   var84 = var118.field_47
                                                      - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                                   net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84));
                                                   var152 = var1.field_48w / 2.0F;
                                                   var37 = new net.C_478i(
                                                      var118.field_40 - var152,
                                                      var118.field_41 + var1.field_48 / 2.0F,
                                                      var118.field_47 - var152,
                                                      var118.field_40 + var152,
                                                      var118.field_41 + var1.field_48,
                                                      var118.field_47 + var152
                                                   );
                                                   double[] var207 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                                   var39 = var23;
                                                   var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                                   var41 = 0.15F;

                                                   label1120:
                                                   while (true) {
                                                      float var229;
                                                      int var208 = (var229 = var41 - 60.0F) == 0.0F ? 0 : (var229 < 0.0F ? -1 : 1);

                                                      while (true) {
                                                         if (var208 >= 0) {
                                                            break label1120;
                                                         }

                                                         var42 = 0.0F;
                                                         if (!(var42 < 0.5)) {
                                                            var41 += 0.2F;
                                                            if (var18 != null) {
                                                               break label1120;
                                                            }
                                                            break;
                                                         }

                                                         var208 = var40;
                                                         int[] var220 = var18;

                                                         while (var220 == null) {
                                                            var220 = var18;
                                                         }
                                                      }
                                                   }

                                                   var206 = var39;
                                                }

                                                return new net.C_42a(var19, new float[]{var21, var20});
                                             }
                                             break label1492;
                                          }

                                          var42 = 0.0F;
                                          if (!(var42 < 0.5)) {
                                             var41 += 0.2F;
                                             var10000 = var18;
                                             if (var3 >= 0L) {
                                                while (true) {
                                                   if (var10000 != null) {
                                                      label1087:
                                                      while (true) {
                                                         if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                                            return new net.C_42a(var19, new float[]{var21, var20});
                                                         }

                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                                         if (var23 <= var22.size()) {
                                                            var101 = var22;
                                                         } else {
                                                            var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                               (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                               var1,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                               var15,
                                                               true,
                                                               (byte)var16,
                                                               var17,
                                                               -6034979987074555695L,
                                                               var3
                                                            );
                                                         }

                                                         var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                                         var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                            .method_49$41b79b67a0(1.0F);
                                                         var50 = var118.field_40
                                                            - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                                         var67 = var118.field_41
                                                            + var1.field_48 / 2.0F
                                                            - (
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                                  + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3))
                                                                     .method_41$bc607678b6()
                                                            );
                                                         var84 = var118.field_47
                                                            - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                                         net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84));
                                                         var152 = var1.field_48w / 2.0F;
                                                         var37 = new net.C_478i(
                                                            var118.field_40 - var152,
                                                            var118.field_41 + var1.field_48 / 2.0F,
                                                            var118.field_47 - var152,
                                                            var118.field_40 + var152,
                                                            var118.field_41 + var1.field_48,
                                                            var118.field_47 + var152
                                                         );
                                                         double[] var204 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                                         var39 = var23;
                                                         var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                                         var41 = 0.15F;
                                                         float var230;
                                                         int var205 = (var230 = var41 - 60.0F) == 0.0F ? 0 : (var230 < 0.0F ? -1 : 1);

                                                         while (var205 < 0) {
                                                            var42 = 0.0F;
                                                            if (!(var42 < 0.5)) {
                                                               break label1087;
                                                            }

                                                            var205 = var40;
                                                            int[] var219 = var18;

                                                            while (var219 == null) {
                                                               var219 = var18;
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      label1100:
                                                      while (true) {
                                                         float var231;
                                                         int var202 = (var231 = var41 - 60.0F) == 0.0F ? 0 : (var231 < 0.0F ? -1 : 1);

                                                         while (var202 < 0) {
                                                            var42 = 0.0F;
                                                            if (!(var42 < 0.5)) {
                                                               break label1100;
                                                            }

                                                            var202 = var40;
                                                            int[] var218 = var18;

                                                            while (var218 == null) {
                                                               var218 = var18;
                                                            }
                                                         }

                                                         if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                                            return new net.C_42a(var19, new float[]{var21, var20});
                                                         }

                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                                         if (var23 <= var22.size()) {
                                                            var101 = var22;
                                                         } else {
                                                            var101 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                               (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                               var1,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                               var15,
                                                               true,
                                                               (byte)var16,
                                                               var17,
                                                               -6034979987074555695L,
                                                               var3
                                                            );
                                                         }

                                                         var118 = (net.C_47tf)recovery$indy$flow$67(var101, var9, var23, -6036938905422112481L, var3);
                                                         var135 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                            .method_49$41b79b67a0(1.0F);
                                                         var50 = var118.field_40
                                                            - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                                         var67 = var118.field_41
                                                            + var1.field_48 / 2.0F
                                                            - (
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                                  + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3))
                                                                     .method_41$bc607678b6()
                                                            );
                                                         var84 = var118.field_47
                                                            - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                                         net.C_47sk.method_49$eb37070982(var67, net.C_47sk.method_42$44b37c2d95(var50 * var50 + var84 * var84));
                                                         var152 = var1.field_48w / 2.0F;
                                                         var37 = new net.C_478i(
                                                            var118.field_40 - var152,
                                                            var118.field_41 + var1.field_48 / 2.0F,
                                                            var118.field_47 - var152,
                                                            var118.field_40 + var152,
                                                            var118.field_41 + var1.field_48,
                                                            var118.field_47 + var152
                                                         );
                                                         double[] var203 = (double[])recovery$indy$flow$100(var135, var37, var13, -6042804847672525058L, var3);
                                                         var39 = var23;
                                                         var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                                         var41 = 0.15F;
                                                      }
                                                   }

                                                   var41 += 0.2F;
                                                   var10000 = var18;
                                                }
                                             }
                                             break label1480;
                                          }

                                          var197 = var40;
                                          var217 = var18;
                                       }

                                       var217 = var18;
                                    }
                                 }
                                 break label1381;
                              }
                           }
                        }

                        var217 = var18;
                        if (var3 <= 0L) {
                           while (true) {
                              while (var217 != null) {
                                 while (true) {
                                    label1417: {
                                       if (var197 < 0) {
                                          var42 = 0.0F;
                                          if (var42 < 0.5) {
                                             var197 = var40;
                                             var217 = var18;
                                             break;
                                          }

                                          var41 += 0.2F;
                                          if (var18 == null) {
                                             break label1417;
                                          }
                                       }

                                       if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                          return new net.C_42a(var19, new float[]{var21, var20});
                                       }

                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                       java.util.ArrayList var115;
                                       if (var23 <= var22.size()) {
                                          var115 = var22;
                                       } else {
                                          var115 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                             (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                             var1,
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                             var15,
                                             true,
                                             (byte)var16,
                                             var17,
                                             -6034979987074555695L,
                                             var3
                                          );
                                       }

                                       net.C_47tf var132 = (net.C_47tf)recovery$indy$flow$67(var115, var9, var23, -6036938905422112481L, var3);
                                       net.C_47tf var149 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                          .method_49$41b79b67a0(1.0F);
                                       double var64 = var132.field_40
                                          - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                       double var81 = var132.field_41
                                          + var1.field_48 / 2.0F
                                          - (
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                          );
                                       double var98 = var132.field_47
                                          - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                       net.C_47sk.method_49$eb37070982(var81, net.C_47sk.method_42$44b37c2d95(var64 * var64 + var98 * var98));
                                       double var166 = var1.field_48w / 2.0F;
                                       var37 = new net.C_478i(
                                          var132.field_40 - var166,
                                          var132.field_41 + var1.field_48 / 2.0F,
                                          var132.field_47 - var166,
                                          var132.field_40 + var166,
                                          var132.field_41 + var1.field_48,
                                          var132.field_47 + var166
                                       );
                                       double[] var212 = (double[])recovery$indy$flow$100(var149, var37, var13, -6042804847672525058L, var3);
                                       var39 = var23;
                                       var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                       var41 = 0.15F;
                                    }

                                    float var232;
                                    var197 = (var232 = var41 - 60.0F) == 0.0F ? 0 : (var232 < 0.0F ? -1 : 1);
                                 }
                              }

                              var217 = var18;
                           }
                        }
                     }

                     while (true) {
                        label1262: {
                           label1418: {
                              if (var217 == null) {
                                 if (var197 != 0 && var42 > 0.0F) {
                                    break label1418;
                                 }

                                 var197 = -1;
                              }

                              int var43 = var197;

                              while (var43 <= 1) {
                                 label1445: {
                                    if (var43 != 1 || var42 != 0.0F) {
                                       float var44 = net.C_47sk.method_46$ef9a6720f7(var34 - var41, -90.0F, 90.0F);
                                       float var45 = net.C_47sk.method_41$f6c4892e39(
                                          (float)recovery$indy$flow$104(var38, 0.5 + var42 * var43, -6035558846277377181L, var3)
                                       );
                                       net.C_47Kr var46 = new net.C_47Kr();
                                       recovery$indy$flow$110(
                                          var46,
                                          var11,
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$109(field_43, -6035182298785433121L, var3),
                                          var2,
                                          var45,
                                          var44,
                                          -6042906389275641095L,
                                          var3
                                       );
                                       int var47 = recovery$indy$flow$111(var46, (char)var6, 50, var7, var1, var37, -6034900411941600396L, var3);
                                       if (var18 != null) {
                                          break label1445;
                                       }

                                       if (var47 != Integer.MAX_VALUE) {
                                          var19 = var23 = var47 + 1;
                                          var21 = var45;
                                          var20 = var44;

                                          label1194:
                                          while (var39 != var23 && var18 == null && ++var24 < var5) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                             java.util.ArrayList var109;
                                             if (var23 <= var22.size()) {
                                                var109 = var22;
                                             } else {
                                                var109 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                   (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                   var1,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                   var15,
                                                   true,
                                                   (byte)var16,
                                                   var17,
                                                   -6034979987074555695L,
                                                   var3
                                                );
                                             }

                                             net.C_47tf var126 = (net.C_47tf)recovery$indy$flow$67(var109, var9, var23, -6036938905422112481L, var3);
                                             net.C_47tf var143 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                .method_49$41b79b67a0(1.0F);
                                             double var58 = var126.field_40
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                             double var75 = var126.field_41
                                                + var1.field_48 / 2.0F
                                                - (
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                                );
                                             double var92 = var126.field_47
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                             var34 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var75, net.C_47sk.method_42$44b37c2d95(var58 * var58 + var92 * var92))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             double var160 = var1.field_48w / 2.0F;
                                             var37 = new net.C_478i(
                                                var126.field_40 - var160,
                                                var126.field_41 + var1.field_48 / 2.0F,
                                                var126.field_47 - var160,
                                                var126.field_40 + var160,
                                                var126.field_41 + var1.field_48,
                                                var126.field_47 + var160
                                             );
                                             var38 = (double[])recovery$indy$flow$100(var143, var37, var13, -6042804847672525058L, var3);
                                             var39 = var23;
                                             var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                             var41 = 0.15F;

                                             while (true) {
                                                float var233;
                                                var197 = (var233 = var41 - 60.0F) == 0.0F ? 0 : (var233 < 0.0F ? -1 : 1);

                                                while (true) {
                                                   if (var197 >= 0) {
                                                      continue label1194;
                                                   }

                                                   var42 = 0.0F;
                                                   if (!(var42 < 0.5)) {
                                                      var41 += 0.2F;
                                                      if (var18 != null) {
                                                         continue label1194;
                                                      }
                                                      break;
                                                   }

                                                   var197 = var40;
                                                   if (var18 == null) {
                                                      break label1262;
                                                   }
                                                }
                                             }
                                          }

                                          return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                                       }
                                    }

                                    var43 += 2;
                                 }

                                 if (var18 != null) {
                                    break;
                                 }
                              }

                              var42 += 0.1F;
                              if (var18 == null) {
                                 while (true) {
                                    if (var42 < 0.5) {
                                       var197 = var40;
                                       if (var18 == null) {
                                          break label1262;
                                       }

                                       while (var197 >= 0) {
                                          if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                             return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                                          }

                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                          java.util.ArrayList var112;
                                          if (var23 <= var22.size()) {
                                             var112 = var22;
                                          } else {
                                             var112 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                var1,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                var15,
                                                true,
                                                (byte)var16,
                                                var17,
                                                -6034979987074555695L,
                                                var3
                                             );
                                          }

                                          net.C_47tf var129 = (net.C_47tf)recovery$indy$flow$67(var112, var9, var23, -6036938905422112481L, var3);
                                          net.C_47tf var146 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                             .method_49$41b79b67a0(1.0F);
                                          double var61 = var129.field_40
                                             - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                          double var78 = var129.field_41
                                             + var1.field_48 / 2.0F
                                             - (
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                   + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                             );
                                          double var95 = var129.field_47
                                             - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                          var34 = (float)(
                                             -(net.C_47sk.method_49$eb37070982(var78, net.C_47sk.method_42$44b37c2d95(var61 * var61 + var95 * var95)) * 180.0 / Math.PI)
                                          );
                                          double var163 = var1.field_48w / 2.0F;
                                          var37 = new net.C_478i(
                                             var129.field_40 - var163,
                                             var129.field_41 + var1.field_48 / 2.0F,
                                             var129.field_47 - var163,
                                             var129.field_40 + var163,
                                             var129.field_41 + var1.field_48,
                                             var129.field_47 + var163
                                          );
                                          var38 = (double[])recovery$indy$flow$100(var146, var37, var13, -6042804847672525058L, var3);
                                          var39 = var23;
                                          var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                          var41 = 0.15F;
                                          float var234;
                                          var197 = (var234 = var41 - 60.0F) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                                       }
                                    } else {
                                       var41 += 0.2F;
                                       if (var18 != null) {
                                          do {
                                             if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                                return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                                             }

                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                             java.util.ArrayList var111;
                                             if (var23 <= var22.size()) {
                                                var111 = var22;
                                             } else {
                                                var111 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                   (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                   var1,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                   var15,
                                                   true,
                                                   (byte)var16,
                                                   var17,
                                                   -6034979987074555695L,
                                                   var3
                                                );
                                             }

                                             net.C_47tf var128 = (net.C_47tf)recovery$indy$flow$67(var111, var9, var23, -6036938905422112481L, var3);
                                             net.C_47tf var145 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                .method_49$41b79b67a0(1.0F);
                                             double var60 = var128.field_40
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                             double var77 = var128.field_41
                                                + var1.field_48 / 2.0F
                                                - (
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                                );
                                             double var94 = var128.field_47
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                             var34 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var77, net.C_47sk.method_42$44b37c2d95(var60 * var60 + var94 * var94))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             double var162 = var1.field_48w / 2.0F;
                                             var37 = new net.C_478i(
                                                var128.field_40 - var162,
                                                var128.field_41 + var1.field_48 / 2.0F,
                                                var128.field_47 - var162,
                                                var128.field_40 + var162,
                                                var128.field_41 + var1.field_48,
                                                var128.field_47 + var162
                                             );
                                             var38 = (double[])recovery$indy$flow$100(var145, var37, var13, -6042804847672525058L, var3);
                                             var39 = var23;
                                             var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                             var41 = 0.15F;
                                          } while (!(var41 < 60.0F));
                                       } else {
                                          while (!(var41 < 60.0F)) {
                                             if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                                return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                                             }

                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                             java.util.ArrayList var110;
                                             if (var23 <= var22.size()) {
                                                var110 = var22;
                                             } else {
                                                var110 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                                   (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                                   var1,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                                   var15,
                                                   true,
                                                   (byte)var16,
                                                   var17,
                                                   -6034979987074555695L,
                                                   var3
                                                );
                                             }

                                             net.C_47tf var127 = (net.C_47tf)recovery$indy$flow$67(var110, var9, var23, -6036938905422112481L, var3);
                                             net.C_47tf var144 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3))
                                                .method_49$41b79b67a0(1.0F);
                                             double var59 = var127.field_40
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                             double var76 = var127.field_41
                                                + var1.field_48 / 2.0F
                                                - (
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                                      + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                                );
                                             double var93 = var127.field_47
                                                - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                             var34 = (float)(
                                                -(
                                                   net.C_47sk.method_49$eb37070982(var76, net.C_47sk.method_42$44b37c2d95(var59 * var59 + var93 * var93))
                                                      * 180.0
                                                      / Math.PI
                                                )
                                             );
                                             double var161 = var1.field_48w / 2.0F;
                                             var37 = new net.C_478i(
                                                var127.field_40 - var161,
                                                var127.field_41 + var1.field_48 / 2.0F,
                                                var127.field_47 - var161,
                                                var127.field_40 + var161,
                                                var127.field_41 + var1.field_48,
                                                var127.field_47 + var161
                                             );
                                             var38 = (double[])recovery$indy$flow$100(var144, var37, var13, -6042804847672525058L, var3);
                                             var39 = var23;
                                             var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                             var41 = 0.15F;
                                          }
                                       }
                                    }

                                    var42 = 0.0F;
                                 }
                              }
                           }

                           label1220:
                           while (true) {
                              var41 += 0.2F;
                              if (var18 != null) {
                                 while (var39 != var23 && var18 == null && ++var24 < var5) {
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                    java.util.ArrayList var114;
                                    if (var23 <= var22.size()) {
                                       var114 = var22;
                                    } else {
                                       var114 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                          var1,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                          var15,
                                          true,
                                          (byte)var16,
                                          var17,
                                          -6034979987074555695L,
                                          var3
                                       );
                                    }

                                    net.C_47tf var131 = (net.C_47tf)recovery$indy$flow$67(var114, var9, var23, -6036938905422112481L, var3);
                                    net.C_47tf var148 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                    double var63 = var131.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                    double var80 = var131.field_41
                                       + var1.field_48 / 2.0F
                                       - (
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                             + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                       );
                                    double var97 = var131.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                    var34 = (float)(
                                       -(net.C_47sk.method_49$eb37070982(var80, net.C_47sk.method_42$44b37c2d95(var63 * var63 + var97 * var97)) * 180.0 / Math.PI)
                                    );
                                    double var165 = var1.field_48w / 2.0F;
                                    var37 = new net.C_478i(
                                       var131.field_40 - var165,
                                       var131.field_41 + var1.field_48 / 2.0F,
                                       var131.field_47 - var165,
                                       var131.field_40 + var165,
                                       var131.field_41 + var1.field_48,
                                       var131.field_47 + var165
                                    );
                                    var38 = (double[])recovery$indy$flow$100(var148, var37, var13, -6042804847672525058L, var3);
                                    var39 = var23;
                                    var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                    var41 = 0.15F;
                                    float var236;
                                    var197 = (var236 = var41 - 60.0F) == 0.0F ? 0 : (var236 < 0.0F ? -1 : 1);

                                    while (var197 < 0) {
                                       var42 = 0.0F;
                                       if (!(var42 < 0.5)) {
                                          continue label1220;
                                       }

                                       var197 = var40;
                                       if (var18 == null) {
                                          break label1220;
                                       }
                                    }
                                 }

                                 return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                              } else {
                                 while (true) {
                                    float var235;
                                    var197 = (var235 = var41 - 60.0F) == 0.0F ? 0 : (var235 < 0.0F ? -1 : 1);

                                    while (var197 < 0) {
                                       var42 = 0.0F;
                                       if (!(var42 < 0.5)) {
                                          continue label1220;
                                       }

                                       var197 = var40;
                                       if (var18 == null) {
                                          break label1220;
                                       }
                                    }

                                    if (var39 == var23 || var18 != null || ++var24 >= var5) {
                                       return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
                                    }

                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                                    java.util.ArrayList var113;
                                    if (var23 <= var22.size()) {
                                       var113 = var22;
                                    } else {
                                       var113 = var22 = (java.util.ArrayList)recovery$indy$flow$66(
                                          (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                                          var1,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                                          var15,
                                          true,
                                          (byte)var16,
                                          var17,
                                          -6034979987074555695L,
                                          var3
                                       );
                                    }

                                    net.C_47tf var130 = (net.C_47tf)recovery$indy$flow$67(var113, var9, var23, -6036938905422112481L, var3);
                                    net.C_47tf var147 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                                    double var62 = var130.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                                    double var79 = var130.field_41
                                       + var1.field_48 / 2.0F
                                       - (
                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                                             + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                                       );
                                    double var96 = var130.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                                    var34 = (float)(
                                       -(net.C_47sk.method_49$eb37070982(var79, net.C_47sk.method_42$44b37c2d95(var62 * var62 + var96 * var96)) * 180.0 / Math.PI)
                                    );
                                    double var164 = var1.field_48w / 2.0F;
                                    var37 = new net.C_478i(
                                       var130.field_40 - var164,
                                       var130.field_41 + var1.field_48 / 2.0F,
                                       var130.field_47 - var164,
                                       var130.field_40 + var164,
                                       var130.field_41 + var1.field_48,
                                       var130.field_47 + var164
                                    );
                                    var38 = (double[])recovery$indy$flow$100(var147, var37, var13, -6042804847672525058L, var3);
                                    var39 = var23;
                                    var40 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                                    var41 = 0.15F;
                                 }
                              }
                           }
                        }

                        var217 = var18;
                     }
                  }

                  if (var3 <= 0L) {
                     return new net.C_42a(var19, new float[]{var21, var20});
                  }

                  return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
               }

               label1045:
               while (var206 < var5) {
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                  java.util.ArrayList var116 = var23 <= var22.size()
                     ? var22
                     : (
                        var22 = (java.util.ArrayList)recovery$indy$flow$66(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                           var1,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                           var15,
                           true,
                           (byte)var16,
                           var17,
                           -6034979987074555695L,
                           var3
                        )
                     );
                  net.C_47tf var133 = (net.C_47tf)recovery$indy$flow$67(var116, var9, var23, -6036938905422112481L, var3);
                  net.C_47tf var150 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                  double var65 = var133.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                  double var82 = var133.field_41
                     + var1.field_48 / 2.0F
                     - (
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                           + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                     );
                  double var99 = var133.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                  net.C_47sk.method_49$eb37070982(var82, net.C_47sk.method_42$44b37c2d95(var65 * var65 + var99 * var99));
                  double var167 = var1.field_48w / 2.0F;
                  net.C_478i var174 = new net.C_478i(
                     var133.field_40 - var167,
                     var133.field_41 + var1.field_48 / 2.0F,
                     var133.field_47 - var167,
                     var133.field_40 + var167,
                     var133.field_41 + var1.field_48,
                     var133.field_47 + var167
                  );
                  double[] var213 = (double[])recovery$indy$flow$100(var150, var174, var13, -6042804847672525058L, var3);
                  int var178 = var23;
                  byte var182 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                  float var187 = 0.15F;
                  float var237;
                  int var214 = (var237 = var187 - 60.0F) == 0.0F ? 0 : (var237 < 0.0F ? -1 : 1);

                  while (var214 < 0) {
                     float var195 = 0.0F;
                     if (!(var195 < 0.5)) {
                        if (var18 != null) {
                           return new net.C_42a(var19, new float[]{var21, var20});
                        }

                        var206 = var24;
                        continue label1045;
                     }

                     var214 = var182;
                     int[] var222 = var18;

                     while (var222 == null) {
                        var222 = var18;
                     }
                  }

                  var206 = var178;
               }

               return new net.C_42a(var19, new float[]{var21, var20});
            }

            label1030:
            while (var10000 == null) {
               int var209 = var24;

               while (var209 < var5) {
                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$51(field_43, -6035182298785433121L, var3)).method_41$bc607678b6();
                  java.util.ArrayList var107 = var23 <= var22.size()
                     ? var22
                     : (
                        var22 = (java.util.ArrayList)recovery$indy$flow$66(
                           (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$59(field_43, -6035182298785433121L, var3),
                           var1,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$61(field_43, -6035182298785433121L, var3)).field_48y,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$64(field_43, -6035182298785433121L, var3)).field_48y + var23,
                           var15,
                           true,
                           (byte)var16,
                           var17,
                           -6034979987074555695L,
                           var3
                        )
                     );
                  net.C_47tf var124 = (net.C_47tf)recovery$indy$flow$67(var107, var9, var23, -6036938905422112481L, var3);
                  net.C_47tf var141 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -6035182298785433121L, var3)).method_49$41b79b67a0(1.0F);
                  double var56 = var124.field_40 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$73(field_43, -6035182298785433121L, var3)).field_48Q;
                  double var73 = var124.field_41
                     + var1.field_48 / 2.0F
                     - (
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, -6035182298785433121L, var3)).field_48j
                           + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$81(field_43, -6035182298785433121L, var3)).method_41$bc607678b6()
                     );
                  double var90 = var124.field_47 - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -6035182298785433121L, var3)).field_42o;
                  net.C_47sk.method_49$eb37070982(var73, net.C_47sk.method_42$44b37c2d95(var56 * var56 + var90 * var90));
                  double var158 = var1.field_48w / 2.0F;
                  net.C_478i var172 = new net.C_478i(
                     var124.field_40 - var158,
                     var124.field_41 + var1.field_48 / 2.0F,
                     var124.field_47 - var158,
                     var124.field_40 + var158,
                     var124.field_41 + var1.field_48,
                     var124.field_47 + var158
                  );
                  double[] var210 = (double[])recovery$indy$flow$100(var141, var172, var13, -6042804847672525058L, var3);
                  int var177 = var23;
                  byte var181 = ((byte) (recovery$indy$flow$102(this.settingNoHorizontalBruteforce, -6043540102181256584L, var3) ? 1 : 0));
                  float var186 = 0.15F;
                  float var238;
                  int var211 = (var238 = var186 - 60.0F) == 0.0F ? 0 : (var238 < 0.0F ? -1 : 1);

                  while (var211 < 0) {
                     float var193 = 0.0F;
                     if (!(var193 < 0.5)) {
                        var10000 = var18;
                        continue label1030;
                     }

                     var211 = var181;
                     int[] var221 = var18;

                     while (var221 == null) {
                        var221 = var18;
                     }
                  }

                  var209 = var177;
               }

               return new net.C_42a(var19, new float[]{var21, var20});
            }

            return new net.C_42a(var19, new float[]{var21, var20});
         } else {
            return var23 == var215 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
         }
      } else if (var3 > 0L) {
         return var19 == -1 ? new net.C_42a(-1, new float[]{0.0F, 0.0F}) : new net.C_42a(var19, new float[]{var21, var20});
      } else {
         return new net.C_42a(var19, new float[]{var21, var20});
      }
   }







    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 46811246316552L;
      long var4 = var2 ^ 39618760470599L;
      long var6 = (var2 ^ 107434829908012L) >>> 16;
      int var8 = (int)((var2 ^ 107434829908012L) << 48 >>> 48);
      long var10001 = var2 ^ 84726979948789L;
      int var9 = (int)((var2 ^ 84726979948789L) >>> 48);
      int var10 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6878750502631782884L;
      int[] var12 = AntiBot_47CG.method_40$d4d28024c9();
      BowAimbot_47C4 var28 = this;
      if (var12 == null) {
         long var10002 = -6878525522425817917L;
         long var13 = var4;
         BowAimbot_47C4 var15 = this;
         if (!var15.method_43X$0dd78e0064(var13)) {
            return;
         }

         var28 = this;
      }

      if (var12 == null) {
         if (var28.field_42 == null) {
            return;
         }

         var28 = this;
      }

      var10001 = -6879145189499105583L;
      BooleanSetting var16 = var28.settingAutoShoot;
      byte var30 = (byte) ((var16.method_49$aae029aa0a()) ? 1 : 0);
      if (var12 == null) {
         if (var30 == 0) {
            return;
         }

         char var32 = (char)var9;
         char var10004 = (char)var11;
         long var10005 = -6875597089895508159L;
         char var17 = var10004;
         BowAimbot_47C4 var18 = ClientGlobals.field_48.field_44i;
         int var19 = var10;
         char var20 = var32;
         C_47S6 var21 = ClientGlobals.field_46;
         var30 = (byte) ((var21.method_49$dc3f815dad(var20, var19, var18, var17)) ? 1 : 0);
      }

      if (var12 == null) {
         if (var30 == 0) {
            return;
         }

         long var35;
         var30 = (byte)((var35 = this.field_48 - 1L) == 0L ? 0 : (var35 < 0L ? -1 : 1));
      }

      if (var12 == null) {
         if (var30 <= 0) {
            return;
         }

         char var33 = (char)var8;
         long var10003 = -6878804276309796218L;
         char var22 = var33;
         long var23 = var6;
         BowAimbot_47C4 var25 = this;
         var30 = (byte) ((var25.method_43c$5eec879a9c(var23, var22)) ? 1 : 0);
      }

      if (var30 != 0) {
         long var34 = -6875003124737068441L;
         boolean var26 = true;
         C_475c var27 = var1;
         var27.method_42$f633c984d8(var26);
      }
   }




   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      int var8;
      int var9;
      int var10;
      BowAimbot_47C4 var27;
      label36: {
         long var4 = var1 ^ 95544799427708L;
         long var6 = var1 ^ 113216930769227L;
         long var10001 = var1 ^ 17588450945529L;
         var8 = (int)((var1 ^ 17588450945529L) >>> 48);
         var9 = (int)((var1 ^ 17588450945529L) << 16 >>> 32);
         var10 = (int)(var10001 << 48 >>> 48);
         long var10000 = -5078505477616967920L;
         int[] var11 = AntiBot_47CG.method_40$d4d28024c9();
         long var10002 = -5078138935565234737L;
         long var12 = var6;
         BowAimbot_47C4 var14 = this;
         boolean var26 = var14.method_43X$0dd78e0064(var12);
         if (var11 == null) {
            if (!var26) {
               return;
            }

            var27 = this;
            if (var11 != null) {
               break label36;
            }

            var10002 = -5071842855645056243L;
            long var15 = var4;
            ModeSetting var17 = this.settingMoveFix;
            var26 = var17.method_46$5f9dc63072(var15).equals(recovery$indy$23(21674, 7071737625997589845L ^ var1));
         }

         if (!var26) {
            return;
         }

         var27 = this;
      }

      if (var27.field_42 != null) {
         char var28 = (char)var8;
         char var10004 = (char)var10;
         long var10005 = -5073100401700139443L;
         char var18 = var10004;
         BowAimbot_47C4 var19 = ClientGlobals.field_48.field_44i;
         int var20 = var9;
         char var21 = var28;
         C_47S6 var22 = ClientGlobals.field_46;
         if (var22.method_49$dc3f815dad(var21, var20, var19, var18)) {
            long var29 = -5078062291037982563L;
            Client var30 = Client.method_44$fbc0c0be91();
            long var32 = -5072703726235468626L;
            Client var23 = var30;
            var32 = -5078546179918353581L;
            float var24 = var23.method_45$03ec613b6f().field_43;
            C_47VO var25 = var3;
            var25.method_49$24a796ab4c(var24);
         }
      }
   }




    private boolean method_40$7c2c45e4ce(net.minecraft.entity.Entity entity) {
        long l;
        long l2 = l = a ^ 0x4460209042FL;
        long l3 = l2 ^ 0x6A5CAE4A4D9L;
        long l4 = l2 ^ 0x3DF39ED7FBBEL;
        int[] nArray = augustus.recovered.modules.combat.AntiBot_47CG.method_40$d4d28024c9();
        net.minecraft.entity.Entity entity2 = entity;
        BowAimbot_47C4 bowAimbot_47C4 = this;
        long l5 = l3;
        client.setting.NumberSetting numberSetting = this.settingFov;
        double d = bowAimbot_47C4.method_46$83ff7736af(entity2) - numberSetting.method_44$474dfaa627(l5);
        double d2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        if (nArray != null) return (boolean)((((int) (d2)) & 1) != 0);
        if (d2 > 0) return false;
        if (entity.field_427) return false;
        if (entity.field_48y < 1) return false;
        if (!(entity instanceof EntityLivingBase)) return false;
        if (((EntityLivingBase)entity).field_48P > 1) return false;
        net.minecraft.client.Minecraft minecraft = field_43;
        if (minecraft.field_42P == entity) {
            return false;
        }
        if (entity instanceof EntityPlayerSP) return false;
        net.C_47tn c_47tn = net.C_47tn.PLAYERS;
        net.C_47tn c_47tn2 = net.C_47tn.MOBS;
        net.C_47tn c_47tn3 = net.C_47tn.ANIMALS;
        net.C_47tn c_47tn4 = net.C_47tn.MOBS;
        net.C_47tn c_47tn5 = net.C_47tn.INVISIBLE;
        if (BowAimbot_47C4.recovery$indy$flow$190(entity, c_47tn.method_43$aae029aa0a(), c_47tn2.method_43$aae029aa0a(), c_47tn3.method_43$aae029aa0a(), c_47tn4.method_43$aae029aa0a(), false, c_47tn5.method_43$aae029aa0a(), true, true, l4, true, true, true, -1679143309966728304L, l)) return true;
        return false;
    }




   private static boolean method_48$aae029aa0a() {
      long var0 = a ^ 102833490387147L;
      long var2 = var0 ^ 108852575947187L;
      long var10000 = -8337654083480917281L;
      int[] var4 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = -8335595362036791614L;
      long var5 = var2;
      ModeSetting var7 = ClientGlobals.field_48.field_46q.settingMoveFix;
      boolean var8 = var7.method_46$5f9dc63072(var5).equalsIgnoreCase("None");
      if (var4 == null) {
         var8 = !var8;
      }

      return var8;
   }



   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$25(-39451267567937050L, var1);
      int var4 = 8;

      while (var4 < recovery$indy$26(field_43, -41095765515736436L, var1).field_429.field_46.size()) {
         int[] var8;
         label49: {
            label48: {
               label58: {
                  C_47rf var5 = recovery$indy$27(field_43, -41095765515736436L, var1).field_429.method_46$4c10532da1(var4).method_48$ac4db64966();
                  C_47rf var10000 = var5;
                  if (var3 == null) {
                     if (var5 == null) {
                        break label58;
                     }

                     var10000 = var5;
                  }

                  C_43r var6 = var10000.method_48$dbd570a038();
                  var8 = var3;
                  if (var1 <= 0L) {
                     break label49;
                  }

                  if (var3 != null) {
                     break label48;
                  }

                  boolean var9 = var6.equals(C_42R.field_47b);
                  if (var1 < 0L) {
                     return var9;
                  }

                  if (var9) {
                     return true;
                  }
               }

               var4++;
            }

            var8 = var3;
         }

         if (var8 != null) {
            break;
         }
      }

      return false;
   }



   public EntityLivingBase method_47$20b8cce974() {
      return this.field_42;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      net.C_472n var38;
      net.C_47tU var41;
      long var4 = var2 ^ 74807535967538L;
      long var6 = var2 ^ 127633069115397L;
      long var10001 = var2 ^ 31970059946167L;
      int var8 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var9 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var10000 = 6398371249668243038L;
      int[] var11 = AntiBot_47CG.method_40$d4d28024c9();
      long var10002 = 6397575921703988353L;
      long var12 = var6;
      BowAimbot_47C4 var14 = this;
      boolean var36 = var14.method_43X$0dd78e0064(var12);
      if (var11 == null) {
         if (!var36) {
            return;
         }

         var10002 = 6400498149422764611L;
         long var15 = var4;
         ModeSetting var17 = this.settingMoveFix;
         var36 = var17.method_46$5f9dc63072(var15).equals("None");
      }

      if (var11 == null) {
         if (var36) {
            return;
         }

         char var39 = (char)var8;
         char var10004 = (char)var10;
         long var10005 = 6401489723248504579L;
         char var18 = var10004;
         BowAimbot_47C4 var19 = this;
         int var20 = var9;
         char var21 = var39;
         C_47S6 var22 = ClientGlobals.field_46;
         var36 = var22.method_49$dc3f815dad(var21, var20, var19, var18);
      }

      if (var36 && this.field_42 != null) {
         char var40 = (char)var8;
         char var47 = (char)var10;
         long var48 = 6401489723248504579L;
         char var23 = var47;
         BowAimbot_47C4 var24 = ClientGlobals.field_48.field_44i;
         int var25 = var9;
         char var26 = var40;
         C_47S6 var27 = ClientGlobals.field_46;
         boolean var37 = var27.method_49$dc3f815dad(var26, var25, var24, var23);
         if (var11 == null) {
            if (!var37) {
               return;
            }

            var10002 = 6400498149422764611L;
            long var28 = var4;
            ModeSetting var30 = this.settingMoveFix;
            var37 = var30.method_46$5f9dc63072(var28).equals("Advanced");
         }

         label50: {
            long var10003;
            label49: {
               if (var37) {
                  var38 = var1;
                  var41 = C_47tU.ADVANCED;
                  var10002 = 6398115282050453812L;
                  var10003 = var2;
                  if (var2 < 0L) {
                     break label49;
                  }

                  C_47tU var31 = C_47tU.ADVANCED;
                  C_472n var32 = var1;
                  var32.method_41$1aa94c3a4e(var31);
                  if (var11 == null) {
                     break label50;
                  }
               }

               var38 = var1;
               var41 = C_47tU.DEFAULT;
               var10002 = 6398115282050453812L;
               var10003 = var2;
            }

            recovery$indy$28(var38, var41, var10002, var10003);
         }

         var10001 = 6397941584403003027L;
         BooleanSetting var33 = this.settingMoveFixIntave;
         if (var33.method_49$aae029aa0a()) {
            var10002 = 6400610683630084443L;
            boolean var34 = true;
            C_472n var35 = var1;
            var35.method_42$f633c984d8(var34);
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$29(this, 28, var3, -7103180899203776563L, var1);
      recovery$indy$30(this, 7, var3, -7103180899203776563L, var1);
      recovery$indy$31(this, 40, var3, -7103180899203776563L, var1);
      recovery$indy$32(this, 21, var3, -7103180899203776563L, var1);
   }



   private boolean method_43c$5eec879a9c(long var1, char var3) {
      long var4;
      int[] var8;
      label92: {
         var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
         long var6 = var4 ^ 105098390274512L;
         var8 = recovery$indy$33(-4311757529086451012L, var4);
         boolean var10000 = this.field_43a;
         if (var8 == null) {
            if (this.field_43a) {
               break label92;
            }

            var10000 = recovery$indy$34(this.settingMode, var6, -4309601003189039455L, var4).equals(recovery$indy$35(26363, 3727249409985376954L ^ var4));
         }

         if (var8 != null) {
            return var10000;
         }

         if (var10000) {
            return false;
         }
      }

      BowAimbot_47C4 var17;
      label99: {
         C_47rf var9 = recovery$indy$36(field_43, -4307790321549684266L, var4).method_48$ac4db64966();
         if (var8 == null) {
            label93: {
               C_47rf var15 = var9;
               if (var3 > 0) {
                  if (var9 == null) {
                     break label93;
                  }

                  var15 = var9;
               }

               C_43u var10 = (C_43u)var15.method_48$dbd570a038();
               int var11 = var10.method_46$cc36436957(var9) - recovery$indy$37(field_43, -4307790321549684266L, var4).method_415$8abf5c6871();
               int var16 = var11;
               if (var8 == null) {
                  if (var11 >= 62000) {
                     var17 = this;
                     if (var8 != null) {
                        break label99;
                     }

                     if (this.field_42 != null) {
                        recovery$indy$38(field_43, -4311231888175079996L, var4).field_45w.method_43$d00df7729d(1);
                        var17 = this;
                        break label99;
                     }
                  }

                  var16 = var11;
               }

               float var12 = var16 / 20.0F;
               var12 = (var12 * var12 + var12 * 2.0F) / 3.0F;
               float var20;
               int var18 = (var20 = var12 - 1.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
               if (var8 != null) {
                  return var18 != 0;
               }

               if (var18 > 0) {
                  boolean var13 = this.field_43P;
                  this.field_43P = true;
                  boolean var19 = var13;
                  if (var8 == null) {
                     if (!var13) {
                        return false;
                     }

                     var19 = true;
                  }

                  return var19;
               }
            }

            this.field_43P = false;
         }

         return false;
      }

      var17.field_43P = false;
      return false;
   }




   public void method_43y$e45a9973e5(long var1) {
      this.field_42 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_48 = 0L;
   }



   public void method_487$da8c82d5d4() {
      double var97;
      double var111;
      label148: {
         long var1 = a ^ 42847210973400L;
         long var3 = var1 ^ 27728837604057L;
         long var5 = var1 ^ 104707758660632L;
         long var7 = var1 ^ 9775231961245L;
         long var9 = var1 ^ 26933110702496L;
         long var11 = var1 ^ 44406830503063L;
         long var13 = var1 ^ 127506147542261L;
         long var10001 = var1 ^ 13493842599272L;
         int var15 = (int)((var1 ^ 13493842599272L) >>> 32);
         int var16 = (int)((var1 ^ 13493842599272L) << 32 >>> 56);
         int var17 = (int)(var10001 << 40 >>> 40);
         var10001 = var1 ^ 138410340241604L;
         int var18 = (int)((var1 ^ 138410340241604L) >>> 48);
         int var19 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
         int var20 = (int)(var10001 << 48 >>> 48);
         this.field_42 = null;
         long var10000 = -4298183677765442868L;
         int[] var91 = AntiBot_47CG.method_40$d4d28024c9();
         this.field_43a = false;
         int[] var21 = var91;
         BowAimbot_47C4 var92 = this;
         if (var21 == null) {
            long var10002 = -4297950202156371949L;
            long var41 = var11;
            BowAimbot_47C4 var43 = this;
            if (var43.method_43X$0dd78e0064(var41)) {
               var10001 = -4303296287379775570L;
               Minecraft var44 = field_43;
               Object[] var22 = var44.field_44Q
                  .field_44Q
                  .stream()
                  .filter(recovery$indy$39(this))
                  .sorted(Comparator.comparingDouble(recovery$indy$40(this)))
                  .toArray();
               if (var22.length != 0) {
                  this.field_42 = (EntityLivingBase)var22[0];
               }

               label121: {
                  BowAimbot_47C4 var93 = this;
                  if (var21 == null) {
                     if (this.field_42 != null) {
                        float var87;
                        float var88;
                        label134: {
                           label135: {
                              int var23 = 0;
                              var87 = 0.0F;
                              var88 = 0.0F;
                              BowAimbot_47C4 var94 = this;
                              if (var21 == null) {
                                 var10002 = -4305019785285529903L;
                                 long var45 = var9;
                                 ModeSetting var47 = this.settingMode;
                                 if (!var47.method_46$5f9dc63072(var45).equals("New")) {
                                    break label135;
                                 }

                                 var94 = this;
                              }

                              EntityLivingBase var103 = this.field_42;
                              long var10003 = -4303224154545630810L;
                              Minecraft var48 = field_43;
                              C_47rf var115 = var48.field_42P.method_48$ac4db64966();
                              long var10005 = -4305212225853042316L;
                              byte var49 = 4;
                              long var50 = var13;
                              C_47rf var52 = var115;
                              EntityLivingBase var53 = var103;
                              BowAimbot_47C4 var54 = var94;
                              C_42a var26 = var54.method_42$50631cde99(var53, var52, var50, var49);
                              var10001 = -4298302102426523311L;
                              C_42a var55 = var26;
                              var23 = (Integer)var55.method_40$0502b11602();
                              var10001 = -4297646870071927192L;
                              C_42a var56 = var26;
                              var87 = ((float[])var56.method_45$0502b11602())[1];
                              var10001 = -4297646870071927192L;
                              C_42a var57 = var26;
                              var88 = ((float[])var57.method_45$0502b11602())[0];
                              if (var21 != null) {
                                 return;
                              }

                              var10001 = -4298302102426523311L;
                              C_42a var58 = var26;
                              if ((Integer)var58.method_40$0502b11602() == -1) {
                                 break label148;
                              }

                              this.field_43a = true;
                              if (var21 != null) {
                                 break label148;
                              }

                              if (var21 == null) {
                                 break label134;
                              }
                           }

                           C_47tf var28;
                           double var89;
                           label106: {
                              int var86;
                              label105: {
                                 var10001 = -4303224154545630810L;
                                 Minecraft var59 = field_43;
                                 var89 = var59.field_42P.method_44$ee256e8a75(this.field_42);
                                 var86 = (int)(var89 / 1.75);
                                 var10001 = -4303224154545630810L;
                                 Minecraft var60 = field_43;
                                 long var119 = -4303224154545630810L;
                                 Minecraft var61 = field_43;
                                 long var10004 = -4303224154545630810L;
                                 Minecraft var62 = field_43;
                                 var28 = recovery$indy$42(
                                    recovery$indy$41(
                                       var60.field_42P,
                                       this.field_42,
                                       var61.field_42P.field_48y,
                                       var62.field_42P.field_48y + var86,
                                       var15,
                                       true,
                                       (byte)var16,
                                       var17,
                                       -4303707933837752152L,
                                       var1
                                    ),
                                    var5,
                                    999999,
                                    -4305118200169615002L,
                                    var1
                                 );
                                 var10001 = -4303224154545630810L;
                                 Minecraft var63 = field_43;
                                 double var29 = var63.field_42P.method_40$3d77d36e13(var28);
                                 double var31 = var29 - var89;
                                 double var127;
                                 int var95 = (var127 = var31 - 3.0) == 0.0 ? 0 : (var127 < 0.0 ? -1 : 1);
                                 if (var21 == null) {
                                    if (var95 > 0) {
                                       double var128;
                                       int var96 = (var128 = var89 - 80.0) == 0.0 ? 0 : (var128 < 0.0 ? -1 : 1);
                                       if (var21 == null) {
                                          if (var96 > 0) {
                                             var86 = (int)(var89 / 1.25);
                                             if (var21 == null) {
                                                break label105;
                                             }
                                          }

                                          var96 = (int)(var89 / 1.5);
                                       }

                                       var86 = var96;
                                       if (var21 == null) {
                                          break label105;
                                       }
                                    }

                                    var97 = var31;
                                    var111 = 3.0;
                                    if (var21 != null) {
                                       break label106;
                                    }

                                    double var129;
                                    var95 = (var129 = var31 - 3.0) == 0.0 ? 0 : (var129 < 0.0 ? -1 : 1);
                                 }

                                 if (var95 < 0) {
                                    var86 = (int)(var89 / 1.8);
                                 }
                              }

                              var10001 = -4303224154545630810L;
                              Minecraft var64 = field_43;
                              long var122 = -4303224154545630810L;
                              Minecraft var65 = field_43;
                              long var125 = -4303224154545630810L;
                              Minecraft var66 = field_43;
                              var28 = recovery$indy$44(
                                 recovery$indy$43(
                                    var7,
                                    var64.field_42P,
                                    this.field_42,
                                    var65.field_42P.field_48y,
                                    var66.field_42P.field_48y + var86,
                                    -4298038591779806331L,
                                    var1
                                 ),
                                 var5,
                                 999999,
                                 -4305118200169615002L,
                                 var1
                              );
                              var97 = var28.field_40;
                              var10002 = -4303224154545630810L;
                              Minecraft var67 = field_43;
                              var111 = var67.field_42P.field_48Q;
                           }

                           double var33 = var97 - var111;
                           double var98 = var28.field_41 + this.field_42.method_41$bc607678b6();
                           var10002 = -4303224154545630810L;
                           Minecraft var68 = field_43;
                           long var120 = -4303224154545630810L;
                           Minecraft var69 = field_43;
                           double var35 = var98 - (var68.field_42P.field_48j + var69.field_42P.method_41$bc607678b6());
                           var10002 = -4303224154545630810L;
                           Minecraft var70 = field_43;
                           double var37 = var28.field_47 - var70.field_42P.field_42o;
                           var88 = (float)Math.toDegrees(Math.atan2(var37, var33)) - 90.0F;
                           double var39 = C_47sk.method_42$44b37c2d95(var33 * var33 + var37 * var37);
                           double var99 = var89;
                           double var113 = 30.0;
                           if (var21 == null) {
                              if (var89 > 30.0) {
                                 var89 += (var89 - 30.0) * 0.75;
                              }

                              var99 = Math.atan2(var35, var39) * 180.0;
                              var113 = Math.PI;
                           }

                           var87 = (float)(-(var99 / var113)) - (float)var89 * 0.11F;
                        }

                        C_429 var100 = this.field_45;
                        long var123 = -4303777310319518783L;
                        C_47S6 var71 = ClientGlobals.field_46;
                        C_477r var124 = var71.method_44$4f8050086d();
                        long var126 = -4305298693271232016L;
                        C_477r var72 = var124;
                        long var73 = var3;
                        float var75 = var87;
                        float var76 = var88;
                        C_429 var77 = var100;
                        C_477r var90 = var77.method_48$e39a948784(var76, var75, var73, var72);
                        char var121 = (char)var18;
                        long var10007 = -4303368377349182702L;
                        BowAimbot_47C4 var78 = this;
                        int var79 = var20;
                        int var80 = var19;
                        char var81 = var121;
                        byte var82 = 4;
                        C_477r var83 = var90;
                        C_47S6 var84 = ClientGlobals.field_46;
                        var84.method_45$c163d5afc8(var83, var82, var81, var80, var79, var78);
                        this.field_48++;
                        if (var21 == null) {
                           break label121;
                        }
                     }

                     var93 = this;
                  }

                  var93.field_48 = 0L;
               }

               if (var21 == null) {
                  return;
               }
            }

            var92 = this;
         }

         var92.field_48 = 0L;
         return;
      }

      this.field_48 = 0L;
   }








   private boolean method_43X$0dd78e0064(long var1) {
      net.minecraft.client.Minecraft var18;
      var1 = a ^ var1;
      long var3 = var1 ^ 61106590560189L;
      long var10000 = -4881115977026839849L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      Minecraft var16 = field_43;
      if (var5 == null) {
         long var10001 = -4873771962854200899L;
         Minecraft var6 = field_43;
         if (var6.field_42P == null) {
            return false;
         }

         var16 = field_43;
      }

      if (var5 == null) {
         long var21 = -4873848601647454283L;
         Minecraft var7 = var16;
         if (var7.field_44Q == null) {
            return false;
         }

         var16 = field_43;
      }

      label87: {
         long var22 = -4873568629095767708L;
         Minecraft var8 = var16;
         boolean var17 = var8.method_44$aae029aa0a();
         if (var5 == null) {
            if (!var17) {
               return false;
            }

            var18 = field_43;
            if (var5 != null) {
               break label87;
            }

            var22 = -4881857127082646097L;
            Minecraft var9 = field_43;
            var17 = var9.field_44r.field_45w.field_45;
         }

         if (!var17) {
            return false;
         }

         var18 = field_43;
      }

      long var24 = -4873771962854200899L;
      Minecraft var10 = var18;
      C_47rf var19 = var10.field_42P.method_48$ac4db64966();
      if (var5 == null) {
         if (var19 == null) {
            return false;
         }

         var24 = -4873771962854200899L;
         Minecraft var11 = field_43;
         var19 = var11.field_42P.method_48$ac4db64966();
      }

      boolean var20 = var19.method_48$dbd570a038() instanceof C_43u;
      int[] var26 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (!var20) {
               return false;
            }

            long var10002 = -4881637561768922098L;
            long var12 = var3;
            BowAimbot_47C4 var14 = this;
            var20 = var14.method_45$0dd78e0064(var12);
         }

         var26 = var5;
      }

      return var26 != null ? var20 : var20;
   }




   private boolean method_43k$aae029aa0a() {
      long var1 = a ^ 33029949510788L;
      long var3 = var1 ^ 35788299271676L;
      long var10002 = -5179905234395893107L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



    public BowAimbot_47C4(char a0,int a1,char a2) {
        super((java.lang.String) ("BowAimbot"),(java.lang.String) ("BogenZiehlhilfe"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 17499167200100L)),(java.awt.Color) (new java.awt.Color((int) (12),(int) (219),(int) (77))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a);
        long constructorKey2 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 82703860686813L);
        long constructorKey3 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 68270902648466L);
        long constructorKey4 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 130976249862722L);
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 75171705512873L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 9284272625397L);
        long constructorKey7 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 9709118222782L);
        long constructorKey8 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 139426785382271L);
        long constructorKey9 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.combat.BowAimbot_47C4.a) ^ 91907592024312L);
        java.lang.Object initialValue10 = recovery$indy$flow$440(2);
        ((java.lang.Object[]) initialValue10)[0] = "Old";
        ((java.lang.Object[]) initialValue10)[1] = "New";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "Mode", constructorKey5, "Old", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$442(this, initialized11);
        client.setting.SettingGroup initialized12 = new client.setting.SettingGroup(this, "Rotations", true, constructorKey6);
        recovery$indy$flow$445(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "Fov", Double.longBitsToDouble(4636033603912859648L), constructorKey9, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$448(this, initialized13);
        java.lang.Object initialValue14 = recovery$indy$flow$450(3);
        ((java.lang.Object[]) initialValue14)[0] = "None";
        ((java.lang.Object[]) initialValue14)[1] = "Default";
        ((java.lang.Object[]) initialValue14)[2] = "Advanced";
        client.setting.ModeSetting initialized15 = new client.setting.ModeSetting(this, "MoveFix", constructorKey5, "Default", (java.lang.String[]) (initialValue14));
        java.lang.String initialValue16 = "SilentMoveFix";
        long initialValue17 = constructorKey2;
        client.setting.ModeSetting initialValue18 = initialized15;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue21 = recovery$indy$flow$454(initialValue19, initialValue17, initialValue20);
        recovery$indy$flow$455(this, initialValue21);
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey8, "MoveFixIntave", true);
        java.lang.Object initialValue23 = recovery$indy$flow$458();
        java.lang.Object initialValue24 = initialValue23;
        long initialValue25 = constructorKey4;
        client.setting.BooleanSetting initialValue26 = initialized22;
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue28 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue29 = recovery$indy$flow$461(initialValue27, initialValue25, initialValue28);
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue29))))));
        recovery$indy$flow$463(this, initialValue30);
        client.setting.BooleanSetting initialized31 = new client.setting.BooleanSetting(this, constructorKey8, "AutoShoot", true);
        recovery$indy$flow$466(this, initialized31);
        client.setting.BooleanSetting initialized32 = new client.setting.BooleanSetting(this, constructorKey8, "No horizontal bruteforce", false);
        java.lang.Object initialValue33 = recovery$indy$flow$469(this);
        java.lang.Object initialValue34 = initialValue33;
        long initialValue35 = constructorKey4;
        client.setting.BooleanSetting initialValue36 = initialized32;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue39 = recovery$indy$flow$472(initialValue37, initialValue35, initialValue38);
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue39))))));
        recovery$indy$flow$474(this, initialValue40);
        java.lang.Object initialValue41 = recovery$indy$flow$476();
        client.setting.MultiSelectSetting initialized42 = new client.setting.MultiSelectSetting(this, "Entities", constructorKey3, (net.C_47OZ[]) (initialValue41));
        recovery$indy$flow$478(this, initialized42);
        recovery$indy$flow$479(this, null);
        recovery$indy$flow$480(this, 0L);
        recovery$indy$flow$481(this, false);
        recovery$indy$flow$482(this, false);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.combat.BowAimbot_47C4) (((java.lang.Object)(this)))).settingRotations));
        net.C_429 initialized44 = new net.C_429(this, (client.setting.SettingGroup) (initialValue43), constructorKey7);
        recovery$indy$flow$486(this, initialized44);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$39(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$51(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$59(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$64(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$66(java.lang.Object a0,java.lang.Object a1,int a2,int a3,int a4,boolean a5,byte a6,int a7,long a8,long a9);
    private static native java.lang.Object recovery$indy$flow$67(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$100(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native boolean recovery$indy$flow$102(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$104(java.lang.Object a0,double a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$109(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$110(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);
    private static native int recovery$indy$flow$111(java.lang.Object a0,char a1,int a2,long a3,java.lang.Object a4,java.lang.Object a5,long a6,long a7);
    private static native boolean recovery$indy$flow$190(java.lang.Object a0,boolean a1,boolean a2,boolean a3,boolean a4,boolean a5,boolean a6,boolean a7,boolean a8,long a9,boolean a10,boolean a11,boolean a12,long a13,long a14);
    private static native java.lang.Object recovery$indy$flow$440(int a0);
    private static native void recovery$indy$flow$442(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$445(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$448(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$450(int a0);


    private static native java.lang.Object recovery$indy$flow$454(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$455(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$458();


    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$463(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$466(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$469(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$472(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$474(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$476();
    private static native void recovery$indy$flow$478(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$479(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.BowAimbot_47C4) (a0)).field_42 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$480(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.combat.BowAimbot_47C4) (a0)).field_48 = a1;
        return;
    }
    private static void recovery$indy$flow$481(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.BowAimbot_47C4) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$482(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.BowAimbot_47C4) (a0)).field_43P = a1;
        return;
    }

    private static native void recovery$indy$flow$486(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native String recovery$indy$23(int var0, long var1);
   private static native int[] recovery$indy$25(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native void recovery$indy$28(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$33(long var0, long var2);
   private static native String recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$35(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$38(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$39(BowAimbot_47C4 var0);
   private static native ToDoubleFunction recovery$indy$40(BowAimbot_47C4 var0);
   private static native ArrayList recovery$indy$41(
      Object var0, Object var1, int var2, int var3, int var4, boolean var5, byte var6, int var7, long var8, long var10
   );
   private static native C_47tf recovery$indy$42(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$43(long var0, Object var2, Object var3, int var4, int var5, long var6, long var8);
   private static native C_47tf recovery$indy$44(Object var0, long var1, int var3, long var4, long var6);
   private static native MethodHandle recovery$constant$47();
}
