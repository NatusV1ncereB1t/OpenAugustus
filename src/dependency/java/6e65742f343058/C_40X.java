package net;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.C_478W;
import net.C_47sk;
import net.C_4f;
import net.minecraft.client.Minecraft;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_40X {
    float field_40;
    double field_45;
    int field_48;
    float field_49;
    float field_43;
    float field_44;
    long field_41;
    long field_42;
    long field_47;
    double field_46;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public native void method_41$da8c82d5d4();

    public void method_47$f12679997c(C_40X c_40X) {
        this.field_40 = c_40X.field_40;
        this.field_48 = c_40X.field_48;
        this.field_49 = c_40X.field_49;
        this.field_44 = c_40X.field_44;
        this.field_45 = c_40X.field_45;
        this.field_42 = c_40X.field_42;
        this.field_41 = c_40X.field_41;
        this.field_47 = c_40X.field_47;
        this.field_43 = c_40X.field_43;
        this.field_46 = c_40X.field_46;
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
