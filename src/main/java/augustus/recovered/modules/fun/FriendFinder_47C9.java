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
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Yl;
import net.C_47cu;
import net.C_47iC;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class FriendFinder_47C9 extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final client.setting.NumberSetting settingInviteDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHideFriendMessage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_47$9035875d26(long var1, C_47ob var3) {
      String[] var4 = recovery$indy$1(2667435199140323961L, var1);
      if (recovery$indy$2(this.settingHideFriendMessage, 2667964459560648913L, var1)) {
         C_473U var5 = recovery$indy$3(var3, 2667769262532697438L, var1);
         C_473U var10000 = var5;
         if (var4 != null) {
            if (!(var5 instanceof C_47AL)) {
               return;
            }

            var10000 = var5;
         }

         label54: {
            C_47AL var6 = (C_47AL)var10000;
            String var7 = var6.method_45$8b128fd962().method_48$0e30dfc966();
            boolean var8 = var7.contains(recovery$indy$4(32207, 836865873224045556L ^ var1));
            String[] var10001 = var4;
            if (var1 > 0L) {
               if (var4 != null) {
                  if (var8) {
                     break label54;
                  }

                  var8 = var7.contains(recovery$indy$5(17809, 4225924989499026349L ^ var1));
               }

               var10001 = var4;
            }

            if (var10001 != null) {
               if (var8) {
                  break label54;
               }

               var8 = var7.contains(recovery$indy$6(5482, 5774592275504659282L ^ var1));
            }

            if (!var8) {
               return;
            }
         }

         var3.cancel();
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$7(this, 26, var3, -7098942557788906956L, var1);
      recovery$indy$8(this, 40, var3, -7098942557788906956L, var1);
   }



    public void method_48o$537c8d9634(int n, short s, char c) {
        long l;
        long l2 = l = (long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48;
        long l3 = l2 ^ 0x5A8833A4DA1EL;
        long l4 = l2 ^ 0xE70B0BE77D5L;
        long l5 = l2 ^ 0x66F145ED523EL;
        long l6 = l2 ^ 0x6AC9C1D9406AL;
        String[] stringArray = FriendFinder_47C9.recovery$indy$9(2180830307131185470L, l);
        int n2 = FriendFinder_47C9.recovery$indy$10(field_43, 2180636839881011069L, l).method_43$43b9f1ea53().values().size();
        if (stringArray != null) {
            if (n2 <= 1) {
                return;
            }
            n2 = FriendFinder_47C9.recovery$indy$12(this.field_44, FriendFinder_47C9.recovery$indy$11(this.settingInviteDelay, l5, 2180230258131271993L, l), l6, 2180125558523955443L, l) ? 1 : 0;
        }
        if (n2 == 0) return;
        for (Object recovered$element$5008 : FriendFinder_47C9.recovery$indy$13(field_43, 2180636839881011069L, l).method_43$43b9f1ea53().values()) {
         C_47Yl c_47Yl = (C_47Yl) recovered$element$5008;
            String[] stringArray2;
            block14: {
                block8: {
                    block13: {
                        String[] stringArray3;
                        boolean bl;
                        String string;
                        block11: {
                            block12: {
                                block9: {
                                    block10: {
                                        block6: {
                                            block7: {
                                                string = c_47Yl.method_43$cd99b948a0().getName();
                                                bl = FriendFinder_47C9.recovery$indy$14(string, l3, 2180027186131317548L, l);
                                                stringArray3 = stringArray;
                                                if (n <= 0) break block6;
                                                if (stringArray3 == null) break block7;
                                                if (!bl) break block8;
                                                bl = string.equals(FriendFinder_47C9.recovery$indy$15(field_43, 2180559236434047978L, l).method_41$0e30dfc966());
                                            }
                                            stringArray3 = stringArray;
                                        }
                                        if (c <= '\u0000') break block9;
                                        if (stringArray3 == null) break block10;
                                        if (bl) break block8;
                                        bl = FriendFinder_47C9.recovery$indy$16((Object)ClientGlobals.field_48.field_46Z, string, l4, 2180708252622442143L, l);
                                    }
                                    stringArray3 = stringArray;
                                }
                                if (s < 0) break block11;
                                if (stringArray3 == null) break block12;
                                if (bl) break block8;
                                bl = this.field_43h.contains(string);
                            }
                            stringArray3 = stringArray;
                        }
                        if (stringArray3 == null) break block13;
                        if (bl) break block8;
                        FriendFinder_47C9.recovery$indy$17(field_43, 2180559236434047978L, l).method_49$a7421bf54c(FriendFinder_47C9.recovery$indy$18(19162, 0x5D25D22243151FA7L ^ l) + string);
                        bl = this.field_43h.add(string);
                    }
                    FriendFinder_47C9.recovery$indy$19(this.field_44, 2180321502590486056L, l);
                    stringArray2 = stringArray;
                    if (n < 0) break block14;
                    if (stringArray2 != null) return;
                }
                stringArray2 = stringArray;
            }
            if (stringArray2 != null) continue;
        }
    }




   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public FriendFinder_47C9(long a0) {
        super((java.lang.String) ("FriendFinder"),(java.lang.String) ("FreundeFinder"),(long) (((augustus.recovered.modules.fun.FriendFinder_47C9.a ^ a0) ^ 92004525120547L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (201),(int) (52))),(client.module.Category) (client.module.Category.FUN));
        long visibilityKey = ((augustus.recovered.modules.fun.FriendFinder_47C9.a ^ a0) ^ 37976011653176L);
        long delayKey = ((augustus.recovered.modules.fun.FriendFinder_47C9.a ^ a0) ^ 17393710759871L);
        client.setting.NumberSetting delay = new client.setting.NumberSetting(this, "InviteDelay", 1000.0D, delayKey, 0.0D, 10000.0D, 0);
        recovery$indy$flow$64(this, delay);
        client.setting.BooleanSetting hideMessage = new client.setting.BooleanSetting(this, visibilityKey, "HideFriendMessage", true);
        recovery$indy$flow$67(this, hideMessage);
        recovery$indy$flow$70(this, new net.C_47cu());
        recovery$indy$flow$73(this, new java.util.ArrayList());
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$64(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$67(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$70(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$73(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native String recovery$indy$4(int var0, long var1);
   private static native String recovery$indy$5(int var0, long var1);
   private static native String recovery$indy$6(int var0, long var1);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$8(Object var0, int var1, long var2, long var4, long var6);
   private static native String[] recovery$indy$9(long var0, long var2);
   private static native C_47K6 recovery$indy$10(Object var0, long var1, long var3);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$12(Object var0, double var1, long var3, long var5, long var7);
   private static native C_47K6 recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(Object var0, Object var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native String recovery$indy$18(int var0, long var1);
   private static native void recovery$indy$19(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$20();
}
