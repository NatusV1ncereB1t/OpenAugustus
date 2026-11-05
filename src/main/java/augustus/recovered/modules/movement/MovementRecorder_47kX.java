package augustus.recovered.modules.movement;
import java.awt.Color;
import java.io.File;
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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import client.module.Module;
import net.C_47Th;
import net.C_47VK;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MovementRecorder_47kX extends client.module.Module {
    public static java.lang.String field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47Th settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$1(field_43, -7738651573406410126L, var1).field_43 = 1.0F;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$2(field_43, 2732801181866093316L, var4).field_43 = 1.0F;
   }



    public MovementRecorder_47kX(long a0) {
        super((java.lang.String) ("MovementRecorder"),(java.lang.String) ("MovementAufzeichner"),(long) (((augustus.recovered.modules.movement.MovementRecorder_47kX.a ^ a0) ^ 123431365734508L)),(java.awt.Color) (java.awt.Color.GREEN),(client.module.Category) (client.module.Category.MOVEMENT));
        int constructorPart1 = (int) ((((augustus.recovered.modules.movement.MovementRecorder_47kX.a ^ a0) ^ 85784637617393L) >>> 32));
        int constructorPart2 = (int) (((((augustus.recovered.modules.movement.MovementRecorder_47kX.a ^ a0) ^ 85784637617393L) << 32) >>> 48));
        int constructorPart3 = (int) (((((augustus.recovered.modules.movement.MovementRecorder_47kX.a ^ a0) ^ 85784637617393L) << 48) >>> 48));
        short converted4 = (short) (constructorPart2);
        short converted5 = (short) (constructorPart3);
        java.lang.Object initialValue6 = recovery$indy$flow$7(2);
        java.lang.Object initialValue7 = recovery$indy$flow$8();
        ((java.lang.Object[]) initialValue6)[0] = initialValue7;
        java.lang.Object initialValue8 = recovery$indy$flow$9();
        ((java.lang.Object[]) initialValue6)[1] = initialValue8;
        net.C_47Th initialized9 = new net.C_47Th(constructorPart1, converted4, converted5, this, "Mode", "Record", (java.util.function.BiFunction[]) (initialValue6));
        recovery$indy$flow$11(this, initialized9);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$7(int a0);
    private static native java.lang.Object recovery$indy$flow$8();
    private static native java.lang.Object recovery$indy$flow$9();
    private static native void recovery$indy$flow$11(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native C_40X recovery$indy$1(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$2(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$5();
}
