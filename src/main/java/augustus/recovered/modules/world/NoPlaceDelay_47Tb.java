package augustus.recovered.modules.world;
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
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.Setting;
import client.module.Category;
import net.C_484;
import net.C_48N;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class NoPlaceDelay_47Tb extends client.module.Module {
    public final client.setting.MultiSelectSetting settingOnlyOnTheseBlockFaces = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.HashMap field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   public static boolean method_46$5c8e537a33(long var0, C_484 var2) {
      var0 = a ^ var0;
      return recovery$indy$1((C_48N)field_45.get(var2), -5340505381559822372L, var0);
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public NoPlaceDelay_47Tb(long a0) {
        super((java.lang.String) ("NoPlaceDelay"),(java.lang.String) ("OhnePlazierungsDelay"),(long) (((augustus.recovered.modules.world.NoPlaceDelay_47Tb.a ^ a0) ^ 114479539370005L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (64),(int) (52))),(client.module.Category) (client.module.Category.WORLD));
        long key = augustus.recovered.modules.world.NoPlaceDelay_47Tb.a ^ a0;
        long settingKey = key ^ 98833657017827L;
        long disableKey = key ^ 37257471585408L;
        Object guard = recovery$indy$flow$5();
        net.C_47OZ[] faces = new net.C_47OZ[6];
        int faceIndex = 0;
        while (true) {
            if (faceIndex < faces.length) {
                Object direction = ((Object[]) recovery$indy$flow$8())[faceIndex];
                faces[faceIndex] = new net.C_48N((net.C_484) direction, true);
                Object registry = recovery$indy$flow$10();
                Object registryDirection = ((Object[]) recovery$indy$flow$11())[faceIndex];
                recovery$indy$flow$12(registry, registryDirection, faces[faceIndex]);
                faceIndex++;
                if (key > 0L && guard != null) return;
                if (guard == null) continue;
            }
            while (true) {
                Object upFace = ((java.lang.Object)(((net.C_48N) (((java.lang.Object)(recovery$indy$flow$15(recovery$indy$flow$13(), recovery$indy$flow$14())))))));
                recovery$indy$flow$18(((java.lang.Object)(((net.C_48N) (((java.lang.Object)(upFace)))))), disableKey, false);
                if (key > 0L) {
                    recovery$indy$flow$21(this, new client.setting.MultiSelectSetting(this, "Only on these block faces", settingKey, faces));
                    return;
                }
                faceIndex++;
                if (guard == null) break;
            }
        }
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$5();
    private static native java.lang.Object recovery$indy$flow$8();
    private static java.lang.Object recovery$indy$flow$10() {
        return augustus.recovered.modules.world.NoPlaceDelay_47Tb.field_45;
    }
    private static native java.lang.Object recovery$indy$flow$11();
    private static java.lang.Object recovery$indy$flow$12(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$13() {
        return augustus.recovered.modules.world.NoPlaceDelay_47Tb.field_45;
    }
    private static java.lang.Object recovery$indy$flow$14() {
        return net.C_484.UP;
    }
    private static java.lang.Object recovery$indy$flow$15(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }


    private static native void recovery$indy$flow$18(java.lang.Object a0,long a1,boolean a2);
    private static native void recovery$indy$flow$21(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$2();
}
