package net;
import client.render.RenderPass;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_46_;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47TX {
    static int field_40;
    static long a;
    static java.lang.String b;
    static java.lang.Object[] c;
    static java.lang.String[] d;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static native int method_46$8abf5c6871();

    public static native int method_46$c00956a038(long arg0,java.awt.Color arg1,java.awt.Color arg2,double arg3);

    private static native void method_46$2478f4ff5d(long arg0,int arg1,int arg2,int arg3,int arg4);

    public static native int[] method_46$10bbc99aaf(double arg0,char arg1,short arg2,int arg3);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native void a();

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native int a(long arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    public static int method_42$0f7a48eca2(int n) {
        return n & 0xFF;
    }

    public static float method_42$d4116ae163(int n) {
        return (float)(n >> 24 & 0xFF) / 255.0f;
    }

    public static native int method_42$946347ffd5(long arg0,net.minecraft.entity.player.EntityPlayer arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static int method_40$0f7a48eca2(int n) {
        return n >> 24 & 0xFF;
    }

    public static int method_40$b421b87216(double d, int n, int n2) {
        return (int)Math.abs(d * (double)n + (1.0 - d) * (double)n2);
    }

    public static native int method_40$3b12418e23(int arg0,long arg1,int arg2,int arg3);

    public static float method_40$d4116ae163(int n) {
        return (float)(n >> 8 & 0xFF) / 255.0f;
    }

    public static native int method_40$6b468acafc(client.render.RenderPass arg0,int arg1,long arg2);

    public static native int method_40$5ea4506ff1(java.awt.Color arg0,java.awt.Color arg1,int arg2,int arg3,long arg4);

    public static void method_44$d00df7729d(int value) {
        C_47TX.field_40 = value;
    }

    public static native int method_44$43666c4bfc(int arg0,long arg1,int arg2,float arg3,float arg4);

    public static native float[] method_44$04f9f491cc(int arg0,long arg1);

    public static float method_48$d4116ae163(int n) {
        return (float)(n >> 16 & 0xFF) / 255.0f;
    }

    public static int method_48$030b8f069f(int n, int n2, float f) {
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n2 >> 8 & 0xFF;
        int n8 = n2 & 0xFF;
        int n9 = (int)((float)n3 + f * (float)(n6 - n3));
        int n10 = (int)((float)n4 + f * (float)(n7 - n4));
        int n11 = (int)((float)n5 + f * (float)(n8 - n5));
        return 0xFF000000 | n9 << 16 | n10 << 8 | n11;
    }

    public static int method_48$0f7a48eca2(int n) {
        return n >> 8 & 0xFF;
    }

    public static native int method_49$7258449aa4(int arg0,int arg1,float arg2,float arg3,int arg4,long arg5);

    public static native int method_49$3ffab17ebe(short arg0,int arg1,int arg2,short arg3,int arg4);

    public static float method_45$d4116ae163(int n) {
        return (float)(n & 0xFF) / 255.0f;
    }

    public static native int method_45$906c6ef571(long arg0,int arg1,int arg2,float arg3);

    public static native int method_45$6fcfba2f6d(int arg0,int arg1,int arg2,int arg3,long arg4);

    public static int method_45$8abf5c6871() {
        return C_47TX.field_40;
    }

    public static native int method_45$75dd719903(int arg0,int arg1,long arg2);

    public static int method_47$0f7a48eca2(int n) {
        return 0xFF000000 | n;
    }

    public static int method_43$0f7a48eca2(int n) {
        return n >> 16 & 0xFF;
    }

    public static native int method_43$be4afa70db(long arg0,int arg1,int arg2,int arg3);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
