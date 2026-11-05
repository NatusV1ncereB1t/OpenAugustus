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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43r;
import net.C_45V;
import net.C_472k;
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FQ;
import net.minecraft.client.gui.GuiScreen;
import net.C_47MU;
import client.module.Module;
import net.C_47TY;
import client.event.RenderListener;
import net.C_47Yl;
import net.C_47dF;
import net.C_47iC;
import net.C_47jj;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47ph;
import net.C_47rf;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Lag_47Cy extends client.module.Module implements net.C_47xz,net.C_47iC,net.C_47dF,client.event.RenderListener {
    private final net.C_47TY settingLagToggleKey = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47jj field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
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

   public void method_40$db44232a44(long var1, C_47MU var3) {
      java.lang.String var11;
      long var4 = var1 ^ 10382293023165L;
      int var6 = (int)((var1 ^ 29336012942693L) >>> 32);
      long var7 = (var1 ^ 29336012942693L) << 32 >>> 32;
      String[] var9 = recovery$indy$1(4819787777757041735L, var1);
      if (recovery$indy$2(var3, 4822616655179517610L, var1) == recovery$indy$3(this.settingLagToggleKey, var6, var7, 4822761588712717346L, var1)) {
         boolean var10001 = this.field_43a;
         if (var9 != null) {
            var10001 = !this.field_43a;
         }

         long var10;
         long var10002;
         long var10003;
         label45: {
            label44: {
               this.field_43a = var10001;
               if (var1 > 0L) {
                  Lag_47Cy var10000 = this;
                  if (var9 != null) {
                     if (!this.field_43a) {
                        break label44;
                     }

                     var10000 = this;
                  }

                  var10000.field_49 = C_47jj.SEND_MESSAGE;
                  var10 = var4;
                  var11 = recovery$indy$4(6213, 6702776025842630002L ^ var1);
                  var10002 = 4822317994194016743L;
                  var10003 = var1;
                  if (var1 < 0L) {
                     break label45;
                  }

                  recovery$indy$5(var4, var11, 4822317994194016743L, var1);
               }

               if (var9 != null) {
                  return;
               }
            }

            var10 = var4;
            var11 = recovery$indy$6(24001, 8570452774456555762L ^ var1);
            var10002 = 4822317994194016743L;
            var10003 = var1;
         }

         recovery$indy$7(var10, var11, var10002, var10003);
      }
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      String[] var4;
      C_473U var7;
      label41: {
         var4 = recovery$indy$8(2669359069311415215L, var1);
         C_473U var5 = recovery$indy$9(var3, 2667565174872201114L, var1);
         boolean var10000 = var5 instanceof C_47FQ;
         if (var4 != null) {
            if (var10000) {
               this.field_43W.clear();
            }

            var7 = var5;
            if (var4 == null) {
               break label41;
            }

            var10000 = var5 instanceof C_47AL;
         }

         if (!var10000) {
            return;
         }

         var7 = var5;
      }

      C_47AL var6 = (C_47AL)var7;
      if (var4 != null) {
         if (!var6.method_45$8b128fd962().method_48$0e30dfc966().contains(recovery$indy$10(3933, 6340244128711953799L ^ var1))) {
            return;
         }

         this.field_49 = C_47jj.SEND_MESSAGE;
      }

      var3.cancel();
   }



   public void onRender3D(long var1, float var3) {
      if (this.field_43a) {
         recovery$indy$11(field_43, null, 8136464013121334162L, var1);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$12(this, 40, var3, -7099869031312296643L, var1);
      recovery$indy$13(this, 26, var3, -7099869031312296643L, var1);
      recovery$indy$14(this, 14, var3, -7099869031312296643L, var1);
      recovery$indy$15(this, 32, var3, -7099869031312296643L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_49 = C_47jj.SEND_MESSAGE;
      String[] var10000 = recovery$indy$16(2730399843932582720L, var4);
      this.field_43a = false;
      String[] var6 = var10000;
      this.field_43h.clear();
      this.field_43W.clear();
      EntityPlayerSP var7 = recovery$indy$17(field_43, 2732309501318974007L, var4);
      if (var6 != null) {
         if (var7 == null) {
            return;
         }

         var7 = recovery$indy$18(field_43, 2732309501318974007L, var4);
      }

      var7.method_49$a7421bf54c(recovery$indy$19(2657, 1662000968452786263L ^ var4));
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 33263061666228L;
      long var3 = var1 ^ 26811776761870L;
      String[] var5 = MLG_47CP.method_46$44c5829186();
      if (var5 == null) {
         if (this.field_43a) {
            this.field_49 = net.C_47jj.SEND_MESSAGE;
         }

         net.minecraft.client.Minecraft var34 = field_43;
         java.util.Iterator var28 = var34.method_40$f8db5d9e73().method_43$29638970ac().iterator();
         if (var28.hasNext()) {
            net.C_47Yl var31 = (net.C_47Yl)var28.next();
            String var33 = var31.method_48$0e30dfc966();
            long var35 = var3;
            String var36 = var33;
            net.C_472k.method_44$228bb405f3(var36, var35);
         }
      } else {
         if (this.field_43a) {
            switch (net.C_40A.field_43[this.field_49.ordinal()]) {
               case 1:
                  for (Object recovered$element$5718 : this.field_43h) {
         String var29 = (String) recovered$element$5718;
                     if (!this.field_43W.contains(var29)) {
                        net.minecraft.client.Minecraft var10 = field_43;
                        var10.field_42P.method_49$a7421bf54c("/report " + var29);
                        this.field_49 = net.C_47jj.CLICK;
                        this.field_43W.add(var29);
                        break;
                     }
                  }
                  break;
               case 2:
                  net.minecraft.client.Minecraft var11 = field_43;
                  if (var11.field_44B instanceof C_47ph) {
                     net.minecraft.client.Minecraft var12 = field_43;
                     C_47ph var6 = (C_47ph)var12.field_44B;

                     for (int var7 = 0; var7 < var6.field_46M.field_46.size(); var7++) {
                        net.C_47rf var8 = var6.field_46M.method_46$4c10532da1(var7).method_48$ac4db64966();
                        if (var8 != null) {
                           net.C_43r var9 = var8.method_48$dbd570a038();
                           if (var9 instanceof C_45V) {
                              net.minecraft.client.Minecraft var13 = field_43;
                              net.minecraft.client.Minecraft var14 = field_43;
                              var13.field_44K.method_42$f0ddb617a2(var6.field_46M.field_43, -999, 0, 4, var14.field_42P);
                              net.minecraft.client.Minecraft var15 = field_43;
                              net.minecraft.client.Minecraft var16 = field_43;
                              var15.field_44K.method_42$f0ddb617a2(var6.field_46M.field_43, var7, 0, 0, var16.field_42P);
                              this.field_49 = net.C_47jj.CLOSE;
                              break;
                           }
                        }
                     }
                  }
                  break;
               case 3:
                  net.minecraft.client.Minecraft var17 = field_43;
                  if (var17.field_44B instanceof C_47ph) {
                     net.minecraft.client.Minecraft var18 = field_43;
                     var18.field_42P.method_47a$da8c82d5d4();
                     this.field_49 = net.C_47jj.SEND_MESSAGE;
                  }
            }
         } else {
            net.minecraft.client.Minecraft var19 = field_43;
            if (var19.field_44B instanceof C_47ph && (this.field_49 == net.C_47jj.CLOSE || this.field_49 == net.C_47jj.CLICK)) {
               net.minecraft.client.Minecraft var20 = field_43;
               var20.field_42P.method_47a$da8c82d5d4();
               this.field_49 = net.C_47jj.SEND_MESSAGE;
            }

            net.minecraft.client.Minecraft var21 = field_43;

            for (Object recovered$element$8515 : var21.method_40$f8db5d9e73().method_43$29638970ac()) {
         net.C_47Yl var30 = (net.C_47Yl) recovered$element$8515;
               String var32 = var30.method_48$0e30dfc966();
               long var22 = var3;
               String var24 = var32;
               if (net.C_472k.method_44$228bb405f3(var24, var22) && !this.field_43h.contains(var32)) {
                  net.minecraft.client.Minecraft var25 = field_43;
                  if (!var32.equals(var25.field_44h.method_47$0e30dfc966())) {
                     this.field_43h.add(var32);
                  }
               }
            }
         }
      }
   }






    public Lag_47Cy(long a0) {
        super((java.lang.String) ("Lag"),(java.lang.String) ("Verz\u00f6gerung"),(long) (((augustus.recovered.modules.fun.Lag_47Cy.a ^ a0) ^ 10344999971408L)),(java.awt.Color) (new java.awt.Color((int) (201),(int) (240),(int) (153))),(client.module.Category) (client.module.Category.FUN));
        long settingKey = (augustus.recovered.modules.fun.Lag_47Cy.a ^ a0) ^ 14307250920119L;
        net.C_47TY setting = new net.C_47TY(this, settingKey, "LagToggleKey");
        recovery$indy$flow$156(this, setting);
        recovery$indy$flow$157(this, false);
        recovery$indy$flow$160(this, new java.util.ArrayList());
        recovery$indy$flow$163(this, new java.util.ArrayList());
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$157(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.fun.Lag_47Cy) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$163(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native int recovery$indy$2(Object var0, long var1, long var3);
   private static native int recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$4(int var0, long var1);
   private static native void recovery$indy$5(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$6(int var0, long var1);
   private static native void recovery$indy$7(long var0, Object var2, long var3, long var5);
   private static native String[] recovery$indy$8(long var0, long var2);
   private static native C_473U recovery$indy$9(Object var0, long var1, long var3);
   private static native String recovery$indy$10(int var0, long var1);
   private static native void recovery$indy$11(Object var0, GuiScreen var1, long var2, long var4);
   private static native void recovery$indy$12(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native String[] recovery$indy$16(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native String recovery$indy$19(int var0, long var1);
   private static native MethodHandle recovery$constant$20();
}
