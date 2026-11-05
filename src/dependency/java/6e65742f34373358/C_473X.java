package net;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.C_4f;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_473X {
    int field_42;
    static boolean field_48;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native int a(long arg0,long arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public void method_41$da8c82d5d4() {
        ++this.field_42;
    }

    public static void method_41$f633c984d8(boolean value) {
        C_473X.field_48 = value;
    }

    public static boolean method_40$aae029aa0a() {
        return C_473X.field_48;
    }

    public native boolean method_48$05d3808578(long arg0,int arg1);

    public long method_49$f9912cc5c6() {
        return this.field_42;
    }

    public void method_47$da8c82d5d4() {
        this.field_42 = 0;
    }

    public static native boolean method_43$aae029aa0a();

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
