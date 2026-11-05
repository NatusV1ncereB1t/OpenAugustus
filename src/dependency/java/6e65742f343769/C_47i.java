package net;
import client.module.Module;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import net.C_47rf;
import net.C_47tV;
import net.C_4f;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47i {
    static net.C_47rf field_47;
    static int field_44;
    static java.util.ArrayList field_46;
    static int field_49;
    static client.module.Module field_43;
    static int field_40;
    static int field_48;
    static int[] field_41;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static native void method_46$1d13c11fdd(client.module.Module arg0,long arg1,int arg2,int arg3,boolean arg4);

    private static native void a();

    private static native int a(long arg0,long arg1);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static native boolean method_42$0dd78e0064(long arg0);

    public static native int method_42$95d88932bd(long arg0);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static int method_41$8abf5c6871() {
        return C_47i.field_48;
    }

    public static int[] method_40$d4d28024c9() {
        return C_47i.field_41;
    }

    public static void method_40$2022b4f670(int[] value) {
        C_47i.field_41 = value;
    }

    public static native void method_40$647e71917e(client.module.Module arg0,int arg1,int arg2,int arg3,int arg4,boolean arg5,int arg6);

    public static int method_44$8abf5c6871() {
        return C_47i.field_44;
    }

    public static void method_44$d00df7729d(int n) {
        field_49 = n;
        field_48 = 1000;
        field_43 = null;
    }

    public static int method_49$8abf5c6871() {
        return C_47i.field_49;
    }

    public static native boolean method_49$e40da76921(client.module.Module arg0,long arg1);

    public static native void method_43$95cbd1eb82(int arg0,client.module.Module arg1,int arg2,char arg3,char arg4,int arg5);

    public static native void method_43$a3a966256f(client.module.Module arg0,long arg1,int arg2,int arg3,int arg4);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
