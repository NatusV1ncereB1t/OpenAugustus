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
import net.C_42a;
import net.C_473U;
import net.C_47FQ;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.RangeSetting;
import net.C_47UA;
import net.C_47iC;
import net.C_47ob;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class SaveMoveKeys_47kT extends client.module.Module implements net.C_47iC {
    public final java.util.HashMap field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingLoadKeyDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

   public void method_42$da8c82d5d4() {
      this.field_42 = 0;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_40$e45a9973e5(long var1) {
      var1 = a ^ var1;
      if (recovery$indy$1(field_43, -6752476753450399346L, var1) == null) {
         this.field_42++;
      }
   }



   public void method_44$5e8e5b9bf6(long var1, C_47UA var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 89329712867708L;
      byte var6 = (byte) ((recovery$indy$2(-6402126320170758323L, var1)) ? 1 : 0);
      boolean var10000 = recovery$indy$3(this, var4, -6402679559528829048L, var1);
      if (var6 != 0) {
         if (!var10000) {
            return;
         }

         String var8 = var3.method_43$0e30dfc966();
         short var10001 = var6;
         if (var1 >= 0L) {
            if (var6 == 0) {
               return;
            }

            var10001 = 11403;
         }

         var10000 = var8.equals(recovery$indy$4(var10001, 2263453804486929237L ^ var1));
      }

      label96:
      if (!var10000) {
         String var9 = var3.method_43$0e30dfc966();
         short var10 = var6;
         if (var1 >= 0L) {
            if (var6 == 0) {
               return;
            }

            var10 = 6763;
         }

         if (var1 > 0L) {
            if (var9.equals(recovery$indy$5(var10, 6977032269146791348L ^ var1))) {
               break label96;
            }

            var9 = var3.method_43$0e30dfc966();
            var10 = var6;
         }

         if (var1 > 0L) {
            if (var10 == 0) {
               return;
            }

            var10 = 11151;
         }

         if (var1 > 0L) {
            if (var9.equals(recovery$indy$6(var10, 2775447960865942614L ^ var1))) {
               break label96;
            }

            var9 = var3.method_43$0e30dfc966();
            var10 = var6;
         }

         if (var1 > 0L) {
            if (var10 == 0) {
               return;
            }

            var10 = 510;
         }

         if (var1 >= 0L) {
            if (var9.equals(recovery$indy$7(var10, 6745627197246440996L ^ var1))) {
               break label96;
            }

            var9 = var3.method_43$0e30dfc966();
            var10 = var6;
         }

         if (var1 >= 0L) {
            if (var10 == 0) {
               return;
            }

            var10 = 26768;
         }

         if (!var9.equals(recovery$indy$8(var10, 5340983497167368008L ^ var1))) {
            return;
         }
      }

      this.field_40.put(var3, new C_42a(var3.method_49$8abf5c6871(), var3.field_45));
   }




    public void method_44$e45a9973e5(long l) {
        int n;
        long l2;
        block7: {
            block6: {
                int n2;
                block5: {
                    long l3 = l = a ^ l;
                    long l4 = l3 ^ 0x3B8C13925233L;
                    l2 = l3 ^ 0xD8054DFA12FL;
                    n = ((int) (SaveMoveKeys_47kT.recovery$indy$9(6658711389572756482L, l) ? 1 : 0));
                    n2 = ((int) (SaveMoveKeys_47kT.recovery$indy$10((Object)this, l4, 6659265220986197191L, l) ? 1 : 0));
                    if (n == 0) break block5;
                    if (n2 == 0) break block6;
                    n2 = this.field_42;
                }
                if (n2 == SaveMoveKeys_47kT.recovery$indy$11(this.settingLoadKeyDelay, 6659084791724005966L, l) && SaveMoveKeys_47kT.recovery$indy$12(field_43, 6658938315183781805L, l) == null) break block7;
            }
            return;
        }
        this.field_42 = 10000;
        SaveMoveKeys_47kT.recovery$indy$13(this.settingLoadKeyDelay, 6658623094405737714L, l);
        for (Object recovered$element$4937 : C_47UA.field_47O) {
         C_47UA c_47UA = (C_47UA) recovered$element$4937;
            int n3;
            block11: {
                block8: {
                    int n4;
                    C_47UA c_47UA2;
                    block9: {
                        C_42a c_42a;
                        block10: {
                            c_42a = (C_42a)this.field_40.get(c_47UA);
                            if (c_42a == null) break block8;
                            c_47UA2 = c_47UA;
                            n4 = n;
                            if (l <= 0L) break block9;
                            if (n4 == 0) break block10;
                            n3 = SaveMoveKeys_47kT.recovery$indy$14(c_47UA2.method_45$8abf5c6871(), l2, 6659162841018664281L, l) ? 1 : 0;
                            if (l < 0L) break block11;
                            if (n3 == 0) break block8;
                            c_47UA.field_45 = (Boolean)SaveMoveKeys_47kT.recovery$indy$15(c_42a, 6659016115559443294L, l);
                            c_47UA2 = c_47UA;
                        }
                        n4 = (Integer)SaveMoveKeys_47kT.recovery$indy$16(c_42a, 6658901005566891089L, l);
                    }
                    c_47UA2.method_43$d00df7729d(n4);
                }
                n3 = n;
            }
            if (n3 != 0) continue;
        }
    }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      C_473U var4 = recovery$indy$17(var3, 2668322580200788506L, var1);
      if (var4 instanceof C_47FQ) {
         this.field_40.clear();
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$18(this, 26, var3, -7098052366063797169L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_40.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_42 = 0;
   }



    public SaveMoveKeys_47kT(int a0,short a1,char a2) {
        super((java.lang.String) ("SaveMoveKeys"),(java.lang.String) ("Schl\u00fcsselSpeicherung"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a) ^ 116531865381447L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (64),(int) (52))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a);
        int constructorPart2 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a) ^ 17252286813919L) >>> 32));
        int constructorPart3 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a) ^ 17252286813919L) << 32) >>> 48));
        int constructorPart4 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a) ^ 17252286813919L) << 48) >>> 48));
        long constructorKey5 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.movement.SaveMoveKeys_47kT.a) ^ 35963222295482L);
        java.util.HashMap initialized6 = new java.util.HashMap();
        recovery$indy$flow$71(this, initialized6);
        recovery$indy$flow$72(this, 0);
        short converted7 = (short) (constructorPart3);
        short converted8 = (short) (constructorPart4);
        client.setting.RangeSetting initialized9 = new client.setting.RangeSetting(constructorPart2, this, "LoadKeyDelay", 1.0D, Double.longBitsToDouble(4613937818241073152L), converted7, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted8);
        long initialValue10 = constructorKey5;
        client.setting.RangeSetting initialValue11 = initialized9;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = recovery$indy$flow$76(initialValue12, initialValue10);
        recovery$indy$flow$77(this, initialValue13);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$71(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$72(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.SaveMoveKeys_47kT) (a0)).field_42 = a1;
        return;
    }

    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$77(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native GuiScreen recovery$indy$1(Object var0, long var1, long var3);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$4(int var0, long var1);
   private static native String recovery$indy$5(int var0, long var1);
   private static native String recovery$indy$6(int var0, long var1);
   private static native String recovery$indy$7(int var0, long var1);
   private static native String recovery$indy$8(int var0, long var1);
   private static native boolean recovery$indy$9(long var0, long var2);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$11(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$12(Object var0, long var1, long var3);
   private static native double recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(int var0, long var1, long var3, long var5);
   private static native Object recovery$indy$15(Object var0, long var1, long var3);
   private static native Object recovery$indy$16(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$17(Object var0, long var1, long var3);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$19();
}
