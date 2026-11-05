package net;
import client.Client;
import client.ClientGlobals;
import client.module.ModuleManager;
import client.render.RenderPass;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.C_47Fw;
import net.C_47eh;
import net.C_47mY;
import net.C_47sb;
import net.C_47vQ;
import net.C_4f;
import net.minecraft.client.gui.ScaledResolution;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47uI {
    static net.C_47mY field_48;
    static byte field_46;
    static net.C_47mY field_40;
    static net.C_47eh field_43;
    static boolean field_40p;
    static net.C_47mY field_47;
    static byte field_40J;
    static byte field_45;
    static byte field_42;
    static byte field_49;
    static byte field_44;
    static byte field_40R;
    static net.C_47sb field_41;
    static int field_403;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public static void method_46$da8c82d5d4() {
        field_42 = 0;
    }

    private static native int a(long arg0,long arg1);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native void a();

    private static native java.lang.Exception a(java.lang.Exception arg0);

    public static void method_42$da8c82d5d4() {
        field_40R = 1;
    }

    public static native void method_42$300c7fd546(boolean arg0,long arg1,net.C_47Fw arg2);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static int method_41$8abf5c6871() {
        return C_47uI.field_403;
    }

    public static void method_41$da8c82d5d4() {
        field_42 = (byte)2;
    }

    public static void method_40$da8c82d5d4() {
        field_40R = 0;
    }

    public static native void method_40$9bd74f13d3(boolean arg0,boolean arg1,long arg2);

    public static void method_44$da8c82d5d4() {
        field_49 = 1;
    }

    public static native void method_48$40333f8e7d(net.minecraft.client.gui.ScaledResolution arg0,boolean arg1,long arg2);

    public static void method_48$da8c82d5d4() {
        field_40R = (byte)2;
    }

    public static void method_48$d00df7729d(int value) {
        C_47uI.field_403 = value;
    }

    public static void method_49$da8c82d5d4() {
        field_44 = 1;
    }

    public static void method_45$da8c82d5d4() {
        field_44 = (byte)2;
    }

    public static native boolean method_45$0dd78e0064(long arg0);

    public static native int method_45$8abf5c6871();

    public static void method_47$da8c82d5d4() {
        field_42 = 1;
    }

    public static void method_43$da8c82d5d4() {
        field_49 = (byte)2;
    }

    public static void method_42q$da8c82d5d4() {
        field_44 = 0;
    }

    public static void method_42y$da8c82d5d4() {
        field_49 = 0;
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
