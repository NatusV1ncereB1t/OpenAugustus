package net;
import client.Client;
import client.module.ModuleManager;
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
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_473V;
import net.C_478k;
import net.C_4f;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47sk {
    static float field_48;
    static int field_45;
    static int field_45z;
    static int field_451;
    static float field_46;
    static float field_49;
    static float field_457;
    static float field_45B;
    static float field_47;
    static float field_43;
    static float field_45h;
    static float field_45X;
    static float[] field_45T;
    static float[] field_459;
    static boolean field_40;
    static int field_44;
    static float field_45s;
    static float field_45j;
    static float field_45J;
    static float field_41;
    static float field_45w;
    static float[] field_45_;
    static int[] field_45r;
    static double field_45L;
    static double[] field_45F;
    static double[] field_42;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static int method_46$0f7a48eca2(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static double method_46$294c1e5b96(double d) {
        return d - Math.floor(d);
    }

    public static native float method_46$ef9a6720f7(float arg0,float arg1,float arg2);

    public static native int method_46$7cf53c2591(int arg0,int arg1);

    public static native int method_46$5c35a9eb12(float arg0);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public static double method_42$294c1e5b96(double d) {
        double d2 = 0.5 * d;
        long l = Double.doubleToRawLongBits(d);
        l = 6910469410427058090L - (l >> 1);
        d = Double.longBitsToDouble(l);
        d *= 1.5 - d2 * d * d;
        return d;
    }

    public static native int method_42$0f7a48eca2(int arg0);

    native public static double method_42$28ac6eec8b(long[] lArray);

    public static float method_42$44b37c2d95(double d) {
        return (float)Math.sqrt(d);
    }

    public static float method_42$f6c4892e39(float f) {
        return (float)Math.sqrt(f);
    }

    public static native int method_42$7cf53c2591(int arg0,int arg1);

    public static native int method_42$b4643774d1(double arg0);

    public static long method_42$8f3b59ad34(int n, int n2, int n3) {
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        return l;
    }

    public static UUID method_42$78d52d611f(Random random) {
        long l = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l2 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l, l2);
    }

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static native int method_41$ccf00398d8(java.lang.String arg0,int arg1);

    native public static float method_41$f6c4892e39(float f);

    public static native double method_40$eb37070982(double arg0,double arg1);

    public static int method_40$7cf53c2591(int n, int n2) {
        int n3 = (n & 0xFF0000) >> 16;
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n & 0xFF00) >> 8;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = (n & 0xFF) >> 0;
        int n8 = (n2 & 0xFF) >> 0;
        int n9 = (int)((float)n3 * (float)n4 / 255.0f);
        int n10 = (int)((float)n5 * (float)n6 / 255.0f);
        int n11 = (int)((float)n7 * (float)n8 / 255.0f);
        return n & 0xFF000000 | n9 << 16 | n10 << 8 | n11;
    }

    public static native float method_40$f6c4892e39(float arg0);

    public static native int method_44$b4643774d1(double arg0);

    public static native long method_44$ccdee441c2(double arg0);

    public static native float method_44$f6c4892e39(float arg0);

    native public static double method_48$294c1e5b96(double d);

    public static double method_48$cc3a06a287(String string, double d, double d2) {
        return Math.max(d2, C_47sk.method_45$71ca8f8614(string, d));
    }

    public static int method_48$4c1942e0e6(String string, int n, int n2) {
        return Math.max(n2, C_47sk.method_41$ccf00398d8(string, n));
    }

    public static int method_48$4c2d00f8dd(float f, float f2, float f3) {
        return C_47sk.method_47$cabccf1c64(C_47sk.method_46$5c35a9eb12(f * 255.0f), C_47sk.method_46$5c35a9eb12(f2 * 255.0f), C_47sk.method_46$5c35a9eb12(f3 * 255.0f));
    }

    public static long method_48$b79bc641a8(C_478k c_478k) {
        return C_47sk.method_42$8f3b59ad34(c_478k.method_40$8abf5c6871(), c_478k.method_43$8abf5c6871(), c_478k.method_47$8abf5c6871());
    }

    public static int method_49$7cf53c2591(int n, int n2) {
        return (n % n2 + n2) % n2;
    }

    private static native int method_49$0f7a48eca2(int arg0);

    public static native int method_49$cabccf1c64(int arg0,int arg1,int arg2);

    public static native double method_49$4b58f7ab41(double arg0,double arg1,double arg2);

    public static native int method_49$4c2d00f8dd(float arg0,float arg1,float arg2);

    public static native double method_49$eb37070982(double arg0,double arg1);

    public static native double method_45$4b58f7ab41(double arg0,double arg1,double arg2);

    public static native double method_45$71ca8f8614(java.lang.String arg0,double arg1);

    public static int method_45$b4643774d1(double d) {
        return (int)(d + 1024.0) - 1024;
    }

    public static native float method_47$acd68e59d5(java.util.Random arg0,float arg1,float arg2);

    public static native int method_47$b4643774d1(double arg0);

    public static int method_47$cabccf1c64(int n, int n2, int n3) {
        int n4 = (n << 8) + n2;
        n4 = (n4 << 8) + n3;
        return n4;
    }

    public static native boolean method_47$6f23493b63(float arg0,float arg1);

    public static native double method_47$7c253373ac(java.util.Random arg0,double arg1,double arg2);

    public static native float method_47$f6c4892e39(float arg0);

    public static native int method_47$5c35a9eb12(float arg0);

    public static double method_47$4b58f7ab41(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    private static native boolean method_43$9a6ad9dfe5(int arg0);

    public static native int method_43$0f7a48eca2(int arg0);

    public static double method_43$294c1e5b96(double d) {
        double d2 = 0.5 * d;
        long l = Double.doubleToRawLongBits(d);
        l = 6910469410427058090L - (l >> 1);
        d = Double.longBitsToDouble(l);
        d *= 1.5 - d2 * d * d;
        return d;
    }

    public static native int method_43$94389f60ba(java.util.Random arg0,int arg1,int arg2);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
