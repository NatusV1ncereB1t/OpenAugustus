package net;
import client.Client;
import client.ClientGlobals;
import client.module.ModuleManager;
import client.setting.RangeSetting;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_44g;
import net.C_45h;
import net.C_472n;
import net.C_476q;
import net.C_477r;
import net.C_478i;
import net.C_47Az;
import net.C_47FC;
import net.C_47Ij;
import net.C_47KR;
import net.C_47MJ;
import net.C_47Ou;
import net.C_47VK;
import net.C_47WC;
import net.C_47XY;
import net.C_47XZ;
import net.C_47cu;
import net.C_47oo;
import net.C_47qb;
import net.C_47r2;
import net.C_47r5;
import net.C_47rE;
import net.C_47sc;
import net.C_47sk;
import net.C_47tf;
import net.C_47vs;
import net.C_47z;
import net.C_48V;
import net.C_49S;
import net.C_4f;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47gg implements C_47Ou {
    double field_42a;
    double field_45s;
    double field_45L;
    float field_456;
    double field_420;
    boolean field_45H;
    double field_42d;
    static net.C_47r5 field_45i;
    int field_42V;
    double field_42k;
    float field_45B;
    boolean field_45_;
    static net.C_47qb field_454;
    int field_457;
    float field_45g;
    double field_42y;
    int field_451;
    double field_45Y;
    double[] field_45X;
    net.C_49S field_45G;
    double field_45M;
    double field_42m;
    double field_45b;
    int field_45E;
    net.C_49S field_41;
    int field_42b;
    static net.C_47r5 field_42q;
    static int field_42Q;
    double field_45Z;
    double field_42L;
    static net.C_47tf field_425;
    int field_45W;
    int field_42T;
    net.C_477r field_42v;
    net.C_47rE field_45J;
    net.C_47KR field_42S;
    net.C_49S field_42l;
    double field_42N;
    static net.C_47tf field_429;
    int field_45k;
    double field_42n;
    double field_49;
    boolean field_42W;
    net.C_48V field_42K;
    int field_45v;
    java.util.ArrayList field_45q;
    double field_42z;
    double field_42w;
    net.C_477r field_42O;
    boolean field_42J;
    double field_45F;
    double field_42R;
    int field_45d;
    double field_40;
    static net.C_47tf field_45T;
    static net.C_47tf field_42r;
    double field_45m;
    static boolean field_45f;
    net.minecraft.entity.EntityLivingBase field_42e;
    double field_45R;
    double field_45S;
    static net.C_45h field_47;
    double field_45P;
    net.C_47tf field_42o;
    static net.C_47tf field_45l;
    double field_45o;
    net.C_49S field_45p;
    float field_42F;
    boolean field_42;
    static net.C_47tf field_45r;
    double field_42u;
    boolean field_45K;
    double field_42U;
    static boolean field_45a;
    double field_44;
    double field_42c;
    double field_42h;
    int field_45U;
    java.util.ArrayList field_45O;
    static net.C_47tf field_42H;
    net.C_47XZ field_42P;
    int field_428;
    double field_42Y;
    net.C_477r field_422;
    boolean field_423;
    double field_45z;
    net.C_49S field_45;
    double field_42_;
    net.C_477r field_42p;
    boolean field_450;
    int field_48;
    double field_45w;
    double field_42D;
    static int field_42x;
    int field_45e;
    int field_453;
    double field_45I;
    net.minecraft.entity.Entity field_42s;
    net.C_47MJ field_45n;
    net.C_47WC field_427;
    static boolean field_42B;
    int field_45u;
    double field_45y;
    float field_45j;
    float field_46;
    double field_42E;
    float field_42j;
    double field_424;
    float field_42M;
    net.C_44g field_42f;
    net.C_47XY field_45C;
    double field_458;
    boolean field_42G;
    static net.C_47tf field_42i;
    int field_45Q;
    double[][] field_459;
    net.C_47z field_455;
    double field_45c;
    net.C_49S field_45x;
    double field_42C;
    double field_42A;
    float field_42Z;
    double field_45D;
    net.C_47cu field_42t;
    double field_42I;
    double field_45N;
    double field_421;
    int field_426;
    double field_42g;
    static int[] field_42X;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    public static native net.C_47tf method_46$8a59962c37(int arg0,net.C_47tf arg1,net.minecraft.entity.EntityLivingBase arg2,char arg3,double arg4,double arg5,double arg6,int arg7);

    public native float method_46$69e9a33521(float arg0,float arg1,long arg2,float arg3);

    public native void method_46$0a5da2ee1e(net.C_47MJ arg0,long arg1);

    public static native net.C_47tf method_46$1ccaeebf3b(net.C_47tf arg0,net.minecraft.entity.EntityLivingBase arg1,long arg2,net.C_47tf arg3);

    public native float method_46$fc33ea18d5(float arg0,float arg1,float arg2,client.setting.RangeSetting arg3,long arg4,float arg5);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private native net.C_47tf method_42$ad6d47cef3(net.minecraft.entity.Entity arg0,long arg1,net.C_47tf arg2,java.lang.String arg3,float arg4,float arg5,float arg6,float arg7,boolean arg8,double arg9);

    public native net.C_47tf method_42$2502ebd8c1(long arg0,net.minecraft.entity.Entity arg1,java.lang.String arg2,int arg3,int arg4,int arg5,int arg6,net.C_477r arg7);

    private native double method_42$cadac657e1(float arg0,float arg1,net.C_44g arg2);

    private native net.C_477r method_42$57d9e41424(net.minecraft.entity.EntityLivingBase arg0,float arg1,float arg2,float arg3,long arg4,float arg5,float arg6,float arg7,double arg8);

    public static native net.C_47tf method_42$f4fbca6f44(long arg0,net.C_478i arg1);

    public static C_47tf method_42$63d2e15c78(float f, float f2) {
        float f3 = C_47sk.method_40$f6c4892e39(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = C_47sk.method_47$f6c4892e39(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -C_47sk.method_40$f6c4892e39(-f * ((float)Math.PI / 180));
        float f6 = C_47sk.method_47$f6c4892e39(-f * ((float)Math.PI / 180));
        return new C_47tf(f4 * f5, f6, f3 * f5);
    }

    public static native float method_42$d819a8fdf1(float arg0,float arg1,long arg2);

    public static native net.C_47tf method_42$13f275fce1(net.minecraft.entity.Entity arg0,long arg1,float arg2,int arg3,int arg4,net.C_477r arg5);

    public static native float[] method_42$edd155e764(double arg0,double arg1,long arg2,double arg3,float arg4,float arg5);

    private native net.C_477r method_42$c2720df7fb(net.minecraft.entity.EntityLivingBase arg0,float arg1,float arg2,float arg3,float arg4,long arg5);

    public static native float[] method_42$1708ca092a(net.minecraft.entity.Entity arg0,float arg1,float arg2,long arg3);

    private native boolean method_42$f63b8f5000(double arg0,double arg1,long arg2,double arg3);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public native net.C_477r method_41$e3893b057e(net.minecraft.entity.EntityLivingBase arg0,short arg1,client.setting.RangeSetting arg2,client.setting.RangeSetting arg3,client.setting.RangeSetting arg4,client.setting.RangeSetting arg5,float arg6,int arg7,char arg8,float arg9,java.lang.String arg10,boolean arg11,boolean arg12,boolean arg13,float arg14,net.C_47tf arg15,boolean arg16,boolean arg17,java.lang.String arg18,java.lang.String arg19,double arg20,int arg21,int arg22,int arg23,java.lang.String arg24,java.lang.String arg25,boolean arg26,boolean arg27,boolean arg28,client.setting.RangeSetting arg29,client.setting.RangeSetting arg30,double arg31,float arg32,float arg33,float arg34,float arg35,float arg36,float arg37,float arg38,float arg39,float arg40,float arg41,float arg42,boolean arg43,int arg44,double arg45,double arg46,double arg47,double arg48,double arg49,java.lang.String arg50,boolean arg51);

    public native net.C_477r method_41$8c7669412c(double arg0,double arg1,double arg2,long arg3,float arg4,float arg5,boolean arg6);

    public static native float method_41$d819a8fdf1(float arg0,float arg1,long arg2);

    public void method_41$f1f57073e2(C_477r c_477r, C_477r c_477r2) {
        this.field_45Z = Math.abs(c_477r.field_44 - c_477r2.field_44);
        this.field_42n = Math.abs(c_477r.field_41 - c_477r2.field_41);
    }

    public native net.C_477r method_41$cf66645699(net.minecraft.entity.Entity arg0,long arg1,float arg2,float arg3,boolean arg4);

    public native net.C_47XY method_41$db50e7ffa2(int arg0,int arg1,net.C_477r arg2,int arg3,net.C_477r arg4,int arg5,double arg6,double arg7,boolean arg8);

    public native void method_41$356c98d3b6(long arg0,float arg1,int arg2);

    public static native net.C_47tf method_41$933c1029e1(net.minecraft.entity.Entity arg0,float arg1,long arg2,int arg3,int arg4);

    private native boolean method_40$07733105b5(int arg0,short arg1,int arg2,short arg3);

    public static void method_40$2022b4f670(int[] value) {
        C_47gg.field_42X = value;
    }

    public native net.C_477r method_40$5c373e1605(net.minecraft.entity.EntityLivingBase arg0,net.minecraft.entity.EntityLivingBase arg1,float arg2,long arg3,float arg4,double arg5,double arg6,net.C_47tf arg7);

    public static native double[] method_40$b468f83400(net.C_47tf arg0,long arg1,net.C_47tf arg2,net.C_478i arg3,net.C_478i arg4,double arg5,double arg6);

    public static native boolean method_40$3a7a50fe41(float arg0,long arg1);

    public native net.C_47r2 method_44$86bba5eee9(int arg0,char arg1,short arg2);

    private float method_44$f6c4892e39(float f) {
        f = Math.max(0.001f, Math.abs(f));
        f = C_47sk.method_46$ef9a6720f7(f, 0.001f, 30.0f);
        return f;
    }

    public native net.C_47r2 method_44$c25888acea(net.C_47FC arg0,net.C_47r2 arg1,net.C_47XY arg2,int arg3,long arg4,double arg5);

    public static native float method_44$558c5d3f22(short arg0,float arg1,float arg2,char arg3,int arg4,float arg5);

    public static native net.C_477r method_44$f69ace2615(long arg0,int[] arg1,float arg2,float arg3);

    public static native net.C_47tf method_48$4713aecc0d(net.minecraft.entity.Entity arg0,long arg1,int arg2,int arg3,net.C_477r arg4);

    private native net.C_44g method_48$1276066d5b(java.util.ArrayList arg0,float arg1,float arg2);

    public static native float method_48$784784a283(float arg0,long arg1);

    public static native float method_48$3c2c24c526(char arg0,float arg1,float arg2,char arg3,int arg4,float arg5);

    public static native net.C_47tf method_48$ad21877b94(net.minecraft.entity.Entity arg0,char arg1,short arg2,int arg3);

    private native float method_48$e4dfb937a4(java.lang.String arg0,long arg1,double arg2,float arg3);

    public static native net.C_477r method_48$63715048f6(double arg0,double arg1,long arg2,double arg3,net.C_477r arg4,float arg5,float arg6,boolean arg7);

    private native void method_48$dc1aaefa1a(net.minecraft.entity.EntityLivingBase arg0,float arg1,long arg2,float arg3);

    public native net.C_47XY method_48$2c26ba2bbf(double arg0,double arg1,double arg2,double arg3,int arg4,double arg5,double arg6,long arg7,boolean arg8);

    private native double method_48$cadac657e1(float arg0,float arg1,net.C_44g arg2);

    public static native int[] method_48$f24f30e62e(long arg0,net.C_477r arg1,net.C_477r arg2);

    private native net.C_47tf method_49$488942be7f(net.C_47tf arg0,net.C_47tf arg1,double arg2,boolean arg3,char arg4,int arg5,short arg6);

    public native net.C_477r method_49$7f0c906405(double arg0,double arg1,double arg2,double arg3,double arg4,long arg5,double arg6,double arg7,double arg8);

    public static C_47tf method_49$229328d797(Entity entity, Entity entity2) {
        C_47tf c_47tf = entity.method_49$41b79b67a0(1.0f);
        float f = entity2.method_42$bc607678b6();
        C_478i c_478i = entity2.method_45$6684d3c618().method_42$800791f322(f, f, f);
        double d = C_47sk.method_45$4b58f7ab41(c_47tf.field_40, c_478i.field_48, c_478i.field_42);
        double d2 = C_47sk.method_45$4b58f7ab41(c_47tf.field_41, c_478i.field_46, c_478i.field_47);
        double d3 = C_47sk.method_45$4b58f7ab41(c_47tf.field_47, c_478i.field_44, c_478i.field_40);
        return new C_47tf(d, d2, d3);
    }

    private native double method_49$cadac657e1(float arg0,float arg1,net.C_44g arg2);

    public static native double method_49$3e5d4b74af(net.C_477r arg0,net.C_477r arg1,int arg2,short arg3,net.C_477r arg4,short arg5);

    public static int[] method_49$d4d28024c9() {
        return C_47gg.field_42X;
    }

    public native net.C_477r method_49$f6c0cb748c(boolean arg0,net.minecraft.entity.EntityLivingBase arg1,float arg2,float arg3,float arg4,float arg5,java.lang.String arg6,float arg7,float arg8,double arg9,boolean arg10,boolean arg11,client.setting.RangeSetting arg12,client.setting.RangeSetting arg13,double arg14,boolean arg15,float arg16,float arg17,float arg18,float arg19,float arg20,float arg21,long arg22,float arg23,float arg24,float arg25,float arg26,float arg27);

    public native net.C_477r method_49$6fe34d0475(double arg0,double arg1,double arg2,float arg3,float arg4,float arg5,long arg6,float arg7,boolean arg8);

    private native net.C_44g method_49$efe3367f4b(java.util.ArrayList arg0,float arg1,float arg2,float arg3,float arg4,float arg5,float arg6,float arg7,float arg8,float arg9,float arg10,float arg11,float arg12,float arg13,long arg14);

    public static native net.C_477r method_49$c311864491(long arg0,net.C_477r arg1,net.C_477r arg2);

    public static native double[] method_45$4f42f38651(long arg0,net.C_47tf arg1,net.C_478i arg2,net.C_478i arg3,double arg4,double arg5);

    public static native net.C_477r method_45$c5daf1e88f(float arg0,float arg1,short arg2,short arg3,int arg4,net.C_477r arg5);

    public native net.C_477r method_45$3d59858ec2(long arg0,double arg1,double arg2,double arg3,double arg4,double arg5);

    public static native net.C_47tf method_45$9ed3218511(net.minecraft.entity.Entity arg0,long arg1,float arg2);

    public static native float method_45$69e9a33521(float arg0,float arg1,long arg2,float arg3);

    public static native int[] method_45$0e33825bca(float arg0,float arg1,int arg2,int arg3,byte arg4,float arg5,float arg6);

    public static native net.C_47tf method_45$3f2be61afc(net.minecraft.entity.Entity arg0,int arg1,long arg2,int arg3);

    public static native net.C_477r method_45$5c9cee6350(float arg0,float arg1,long arg2,float arg3,float arg4);

    private static double method_45$6384490bf4(C_477r c_477r, C_477r c_477r2) {
        float f = c_477r.field_44 - c_477r2.field_44;
        float f2 = c_477r.field_41 - c_477r2.field_41;
        return Math.sqrt(f2 * f2 + f * f);
    }

    public static native net.C_478i method_45$591f816751(net.minecraft.entity.EntityLivingBase arg0,long arg1,net.C_47tf arg2);

    public static native double[] method_45$2c3f403dd6(net.C_47tf arg0,net.C_478i arg1,byte arg2,double arg3,long arg4,double arg5);

    public static C_47tf method_47$42676af4e9(C_47tf c_47tf, C_478i c_478i) {
        double d = C_47sk.method_45$4b58f7ab41(c_47tf.field_40, c_478i.field_48, c_478i.field_42);
        double d2 = C_47sk.method_45$4b58f7ab41(c_47tf.field_41, c_478i.field_46, c_478i.field_47);
        double d3 = C_47sk.method_45$4b58f7ab41(c_47tf.field_47, c_478i.field_44, c_478i.field_40);
        return new C_47tf(d, d2, d3);
    }

    public static native net.C_477r method_47$3e364f7e74(net.C_47tf arg0,net.C_47tf arg1,net.C_477r arg2,float arg3,long arg4,float arg5);

    private static native double method_47$cadac657e1(float arg0,float arg1,net.C_44g arg2);

    public static native float[] method_47$4eebe80ac4(long arg0,double arg1,double arg2,double arg3,float arg4,float arg5);

    public static C_47tf method_47$f66832c191(C_47tf c_47tf, C_478i c_478i, int n, int n2) {
        double d = c_478i.field_42 - c_478i.field_48;
        double d2 = c_478i.field_47 - c_478i.field_46;
        double d3 = d * ((double)n2 / 100.0);
        double d4 = d2 * ((double)n / 100.0);
        C_478i c_478i2 = c_478i.method_42$800791f322((d3 - d) / 2.0, (d4 - d2) / 2.0, (d3 - d) / 2.0);
        double d5 = C_47sk.method_45$4b58f7ab41(c_47tf.field_40, c_478i2.field_48, c_478i2.field_42);
        double d6 = C_47sk.method_45$4b58f7ab41(c_47tf.field_41, c_478i2.field_46, c_478i2.field_47);
        double d7 = C_47sk.method_45$4b58f7ab41(c_47tf.field_47, c_478i2.field_44, c_478i2.field_40);
        return new C_47tf(d5, d6, d7);
    }

    public static native float method_47$72a48262dd(float arg0,float arg1,float arg2,long arg3);

    public static native net.C_477r method_47$cfcd1353c8(long arg0,double arg1,double arg2,double arg3,net.C_477r arg4,float arg5,float arg6,boolean arg7,float arg8);

    private native java.util.ArrayList method_47$7c173e8d01(char arg0,java.lang.String arg1,long arg2,java.lang.String arg3);

    public static native float[] method_47$6fbd4707ff(net.minecraft.entity.Entity arg0,float arg1,short arg2,int arg3,float arg4,int arg5);

    public static native float method_47$e593af7975(long arg0,float arg1,float arg2,float arg3,float arg4,float arg5,float arg6,float arg7,boolean arg8,float arg9);

    public native net.C_47r2 method_47$789ae98509(long arg0,net.C_477r arg1);

    private static C_478i method_47$887b7995c4(Entity entity, double d) {
        float f = entity.method_42$bc607678b6();
        double d2 = entity.field_48u + (entity.field_48Q - entity.field_48u) * d;
        double d3 = entity.field_48O + (entity.field_48j - entity.field_48O) * d;
        double d4 = entity.field_48l + (entity.field_42o - entity.field_48l) * d;
        float f2 = entity.field_48w / 2.0f;
        C_478i c_478i = new C_478i(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)entity.field_48, d4 + (double)f2);
        c_478i = c_478i.method_42$800791f322(f, f, f);
        return c_478i;
    }

    public native net.C_477r method_47$891b4694c6(long arg0,net.minecraft.entity.Entity arg1,float arg2,float arg3,boolean arg4);

    public static native float method_47$7b0ce13299(float arg0,long arg1,float arg2,float arg3,float arg4,client.setting.RangeSetting arg5);

    public native float method_47$5346cc7c01(float arg0,float arg1,long arg2,float arg3,client.setting.RangeSetting arg4,float arg5);

    public native float method_43$b287d68bd9(float arg0,int arg1,int arg2,float arg3,byte arg4,float arg5);

    public static C_478i method_43$0f34e7e3b0(EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        float f = entityLivingBase.method_42$bc607678b6();
        float f2 = entityLivingBase.field_48w / 2.0f + f;
        return new C_478i(d - (double)f2, d2 - (double)f, d3 - (double)f2, d + (double)f2, d2 + (double)entityLivingBase.field_48 + (double)f, d3 + (double)f2);
    }

    public static C_478i method_43$f182795752(EntityLivingBase entityLivingBase) {
        float f = entityLivingBase.method_42$bc607678b6();
        return entityLivingBase.method_45$6684d3c618().method_42$800791f322(f, f, f);
    }

    public static native net.C_477r method_43$ede84128b2(int arg0,int arg1,char arg2,char arg3,net.C_477r arg4,int arg5);

    public native void method_43$e45a9973e5(long arg0);

    public static native net.C_477r method_43$fb98a95b9c(int arg0,int arg1,long arg2,float arg3,float arg4);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
