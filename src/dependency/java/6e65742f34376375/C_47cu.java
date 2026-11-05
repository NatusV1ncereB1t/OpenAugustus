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
public class C_47cu {
    long field_47;
    static java.lang.String[] field_43;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Class b(long arg0,long arg1);

    public void method_46$da8c82d5d4() {
        this.field_47 = System.currentTimeMillis();
    }

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native int a(long arg0,long arg1);

    public native boolean method_42$b0e346e6e3(long arg0,long arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static java.lang.String[] method_44$44c5829186() {
        return C_47cu.field_43;
    }

    public long method_47$f9912cc5c6() {
        return Math.max(0L, System.currentTimeMillis() - this.field_47);
    }

    public void method_47$e45a9973e5(long value) {
        this.field_47 = value;
    }

    public native boolean method_43$2ac7ee8710(double arg0,long arg1);

    public static void method_43$05a886777b(java.lang.String[] value) {
        C_47cu.field_43 = value;
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
