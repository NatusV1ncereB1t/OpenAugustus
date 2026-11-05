package net;
import client.Client;
import client.ClientGlobals;
import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.C_404;
import net.C_450;
import net.C_455;
import net.C_46Q;
import net.C_46_;
import net.C_47A3;
import net.C_47IT;
import net.C_47UM;
import net.C_47V8;
import net.C_47oP;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.ResourceLocation;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47Yl {
    java.lang.String field_45;
    boolean field_40;
    com.mojang.authlib.GameProfile field_49;
    net.C_47IT field_42;
    int field_44;
    boolean field_47;
    net.minecraft.util.ResourceLocation field_40W;
    net.minecraft.util.ResourceLocation field_40l;
    java.lang.String field_404;
    java.lang.String field_41;
    net.C_47oP field_43;
    int field_40G;
    int field_40u;
    long field_40V;
    long field_46;
    long field_48;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public void method_46$2cb02288e4(net.C_47oP value) {
        this.field_43 = value;
    }

    native static ResourceLocation method_46$ba4c33c55d(C_47Yl c_47Yl, ResourceLocation resourceLocation);

    public long method_46$f9912cc5c6() {
        return this.field_48;
    }

    public void method_46$fbbbe3c71b(net.minecraft.util.ResourceLocation value) {
        this.field_40l = value;
    }

    private static native void a();

    private static native int a(long arg0,long arg1);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    static String method_42$cd230f9596(C_47Yl c_47Yl) {
        return c_47Yl.field_41;
    }

    native static ResourceLocation method_42$ba4c33c55d(C_47Yl c_47Yl, ResourceLocation resourceLocation);

    public native net.C_46_ method_42$47a7a6d93d();

    public native java.lang.String method_42$0e30dfc966();

    public native net.minecraft.util.ResourceLocation method_42$8d5288ab3b();

    public int method_42$8abf5c6871() {
        return this.field_40u;
    }

    public void method_42$e45a9973e5(long value) {
        this.field_40V = value;
    }

    public long method_42$f9912cc5c6() {
        return this.field_40V;
    }

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public void method_41$a7421bf54c(java.lang.String value) {
        this.field_45 = value;
    }

    public net.C_47oP method_41$8b128fd962() {
        return this.field_43;
    }

    public void method_41$d00df7729d(int value) {
        this.field_40G = value;
    }

    public native void method_41$da8c82d5d4();

    public void method_41$1e47fea583(net.C_47IT value) {
        this.field_42 = value;
    }

    public native net.minecraft.util.ResourceLocation method_40$8d5288ab3b();

    public int method_40$8abf5c6871() {
        return this.field_44;
    }

    public net.C_47IT method_40$73d174f422() {
        return this.field_42;
    }

    public java.lang.String method_48$0e30dfc966() {
        return this.field_41;
    }

    public void method_48$d00df7729d(int value) {
        this.field_44 = value;
    }

    public void method_49$e45a9973e5(long value) {
        this.field_48 = value;
    }

    public long method_45$f9912cc5c6() {
        return this.field_46;
    }

    public void method_45$e45a9973e5(long value) {
        this.field_46 = value;
    }

    static String method_45$cd230f9596(C_47Yl c_47Yl) {
        return c_47Yl.field_404;
    }

    public int method_45$8abf5c6871() {
        return this.field_40G;
    }

    native static String method_45$efa5f208ea(C_47Yl c_47Yl, String string);

    public java.lang.String method_45$0e30dfc966() {
        return this.field_45;
    }

    public com.mojang.authlib.GameProfile method_43$cd99b948a0() {
        return this.field_49;
    }

    public native boolean method_43$aae029aa0a();

    public void method_43$d00df7729d(int value) {
        this.field_40u = value;
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
