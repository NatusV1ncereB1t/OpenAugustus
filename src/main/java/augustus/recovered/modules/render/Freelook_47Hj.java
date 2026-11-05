package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_476x;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47MS;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47VU;
import net.C_47oo;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47vk;
import net.C_47wH;
import net.C_47y6;
import net.C_4f;

public class Freelook_47Hj extends Module implements C_47MS, C_476x {
   private final BooleanSetting settingThirdPerson;
   private final BooleanSetting settingDisableItInFistPerson;
   private float field_40;
   private float field_49;
   private int field_42;
   private static final long a = C_4f.a(-3476283966853285684L, 784416850521471665L, MethodHandles.lookup().lookupClass()).a(236732605123894L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[32];
   private static final String[] f = new String[32];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   @Override
   public void method_42$81a716381c(C_47vk var1, long var2) {
      Freelook_47Hj var5;
      label42: {
         label41: {
            label45: {
               int[] var4;
               label39: {
                  var4 = recovery$indy$1(-3664894895241930766L, var2);
                  int var10000 = recovery$indy$2(field_43, -3665472497865109079L, var2).field_44S;
                  if (var4 == null) {
                     if (var10000 != 0) {
                        break label39;
                     }

                     var5 = this;
                     if (var4 != null) {
                        break label42;
                     }

                     var10000 = (int) ((recovery$indy$3(this.settingDisableItInFistPerson, -3664817941474489939L, var2)) ? 1 : 0);
                  }

                  if (var10000 != 0) {
                     break label45;
                  }
               }

               recovery$indy$4(var1, this.field_40, -3665739325267074316L, var2);
               recovery$indy$5(var1, this.field_49, -3665423925526994864L, var2);
               recovery$indy$6(var1, true, -3665549500196338758L, var2);
               if (var2 <= 0L) {
                  break label41;
               }

               if (var4 == null) {
                  return;
               }
            }

            this.field_40 = recovery$indy$8(recovery$indy$7(-3665913181599329454L, var2), -3665195232619948394L, var2).field_43;
         }

         var5 = this;
      }

      var5.field_49 = recovery$indy$10(recovery$indy$9(-3665913181599329454L, var2), -3665195232619948394L, var2).field_48;
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_48$c945181dab(long var1, C_47VU var3) {
      long var4;
      int[] var6;
      int var10000;
      int[] var10001;
      label61: {
         var4 = var1 ^ 17199219927184L;
         var6 = recovery$indy$11(-1816193999611921382L, var1);
         var10000 = recovery$indy$12(field_43, -1816753283930228159L, var1).field_44S;
         label60:
         if (var6 == null) {
            if (var10000 == 0) {
               var10000 = (int) ((recovery$indy$13(this.settingDisableItInFistPerson, -1816133916475104699L, var1)) ? 1 : 0);
               var10001 = var6;
               if (var1 < 0L) {
                  break label61;
               }

               if (var6 != null) {
                  break label60;
               }

               if (var10000 != 0) {
                  return;
               }
            }

            var10000 = (int) ((recovery$indy$14(ClientGlobals.field_48.field_462, var4, -1816988677281882322L, var1)) ? 1 : 0);
         }

         var10001 = var6;
      }

      label48: {
         if (var10001 == null) {
            if (var10000 != 0) {
               break label48;
            }

            var10000 = (int) ((recovery$indy$15(ClientGlobals.field_48.field_46e, var4, -1816988677281882322L, var1)) ? 1 : 0);
         }

         if (var10000 == 0) {
            recovery$indy$16(var3, 0, -1816909457630798214L, var1);
            recovery$indy$17(var3, 0, -1816358305769800392L, var1);
         }
      }

      float var7 = recovery$indy$18(field_43, -1816753283930228159L, var1).field_422 * 0.6F + 0.2F;
      float var8 = var7 * var7 * var7 * 8.0F;
      float var9 = recovery$indy$19(field_43, -1816605217948327524L, var1).field_45 * var8;
      float var10 = recovery$indy$20(field_43, -1816605217948327524L, var1).field_48 * var8;
      Freelook_47Hj var11 = this;
      if (var1 >= 0L) {
         if (var6 == null) {
            if (recovery$indy$21(field_43, -1816753283930228159L, var1).field_42X) {
               var10 *= -1.0F;
            }

            this.field_40 = (float)(this.field_40 + var9 * 0.15);
            this.field_49 = (float)(this.field_49 - var10 * 0.15);
         }

         var11 = this;
      }

      var11.field_49 = C_47sk.method_46$ef9a6720f7(this.field_49, -90.0F, 90.0F);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$22(this, 24, var3, -7099812386354681979L, var1);
      recovery$indy$23(this, 19, var3, -7099812386354681979L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      if (recovery$indy$24(this.settingThirdPerson, -7737553159828074480L, var1)) {
         recovery$indy$25(field_43, -7738060239926654956L, var1).field_44S = this.field_42;
      }
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      if (recovery$indy$26(field_43, 2732327923290596043L, var4) != null) {
         this.field_40 = recovery$indy$28(recovery$indy$27(2732375661279411097L, var4), 2731936850940362333L, var4).field_43;
         this.field_49 = recovery$indy$30(recovery$indy$29(2732375661279411097L, var4), 2731936850940362333L, var4).field_48;
         this.field_42 = recovery$indy$31(field_43, 2732267027756202338L, var4).field_44S;
         if (recovery$indy$32(this.settingThirdPerson, 2731614810277781862L, var4)) {
            recovery$indy$33(field_43, 2732267027756202338L, var4).field_44S = 1;
         }
      }
   }

   public Freelook_47Hj(long var1) {
      super("Freelook", "FreiesSchauen", ((a ^ var1) ^ 99569719742590L), new Color(152, 245, 167), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 48010794912869L;
      long var5 = var1 ^ 99569719742590L;
      // Super arguments moved to the required Java constructor position.
      this.settingThirdPerson = new BooleanSetting(this, var3, "ThirdPerson", true);
      this.settingDisableItInFistPerson = new BooleanSetting(this, var3, "DisableItInFistPerson", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native C_47oo recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$6(Object var0, boolean var1, long var2, long var4);

   private static native Client recovery$indy$7(long var0, long var2);

   private static native C_47y6 recovery$indy$8(Object var0, long var1, long var3);

   private static native Client recovery$indy$9(long var0, long var2);

   private static native C_47y6 recovery$indy$10(Object var0, long var1, long var3);

   private static native int[] recovery$indy$11(long var0, long var2);

   private static native C_47oo recovery$indy$12(Object var0, long var1, long var3);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4);

   private static native C_47oo recovery$indy$18(Object var0, long var1, long var3);

   private static native C_47wH recovery$indy$19(Object var0, long var1, long var3);

   private static native C_47wH recovery$indy$20(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$21(Object var0, long var1, long var3);

   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$25(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);

   private static native Client recovery$indy$27(long var0, long var2);

   private static native C_47y6 recovery$indy$28(Object var0, long var1, long var3);

   private static native Client recovery$indy$29(long var0, long var2);

   private static native C_47y6 recovery$indy$30(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$31(Object var0, long var1, long var3);

   private static native boolean recovery$indy$32(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$33(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$34();
}
