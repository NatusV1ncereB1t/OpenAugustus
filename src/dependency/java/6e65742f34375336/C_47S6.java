package net;
import client.Client;
import client.ClientGlobals;
import client.module.Module;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_476q;
import net.C_477r;
import net.C_47MJ;
import net.C_47Ou;
import net.C_47gg;
import net.C_47rE;
import net.C_47sk;
import net.C_47y6;
import net.C_4f;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47S6 {
    boolean field_47f;
    int field_47s;
    boolean field_47F;
    boolean field_40;
    net.C_477r field_45;
    java.lang.Class field_47S;
    java.lang.Class field_47D;
    net.C_47gg field_47r;
    net.C_477r field_49;
    int field_48;
    boolean field_47;
    float field_47K;
    int field_47B;
    net.C_477r field_47y;
    boolean field_44;
    boolean field_42;
    net.C_47rE field_474;
    float field_46;
    static int[] field_41;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    public boolean method_46$aae029aa0a() {
        return this.field_40;
    }

    public void method_46$cecbafd4be(net.C_477r value) {
        this.field_47y = value;
    }

    public native void method_46$6a778c6bfe(long arg0,float arg1,int arg2,client.module.Module arg3);

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native void a();

    private static native int a(long arg0,long arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public native net.C_477r method_41$59438b0082(long arg0,float arg1,float arg2);

    private native boolean method_41$747dcd172f(short arg0,char arg1,int arg2);

    public native boolean method_40$f19a3ced8f(short arg0,long arg1);

    public net.C_477r method_40$4f8050086d() {
        return this.field_45;
    }

    public net.C_477r method_44$4f8050086d() {
        return this.field_47y;
    }

    public native void method_48$e62a30940e(long arg0,net.C_477r arg1,int arg2);

    public native boolean method_49$dc3f815dad(char arg0,int arg1,client.module.Module arg2,char arg3);

    public native boolean method_49$0dd78e0064(long arg0);

    public native void method_45$c163d5afc8(net.C_477r arg0,int arg1,char arg2,int arg3,int arg4,client.module.Module arg5);

    public void method_45$cecbafd4be(C_477r c_477r) {
        this.field_49 = c_477r;
        this.field_48 = -10000;
    }

    public void method_45$dd322a622a(float f, float f2) {
        this.field_47K = f;
        this.field_46 = f2;
        this.field_47F = true;
    }

    public native void method_45$e45a9973e5(long arg0);

    public native void method_45$d88f8d33f0(net.C_477r arg0,int arg1,client.module.Module arg2,int arg3,long arg4);

    public int method_45$8abf5c6871() {
        return this.field_48;
    }

    public net.C_477r method_47$4f8050086d() {
        return this.field_49;
    }

    public native void method_47$508900092b(float arg0,int arg1,client.module.Module arg2,long arg3);

    public native void method_47$1e2b2e4e93(float[] arg0,long arg1,int arg2,client.module.Module arg3);

    public net.C_47rE method_47$aea9641cf4() {
        return this.field_474;
    }

    public native void method_47$b1bb678617(float[] arg0,int arg1,client.module.Module arg2,int arg3,long arg4);

    public static int[] method_47$d4d28024c9() {
        return C_47S6.field_41;
    }

    public static void method_47$2022b4f670(int[] value) {
        C_47S6.field_41 = value;
    }

    public void method_43$cecbafd4be(net.C_477r value) {
        this.field_49 = value;
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
