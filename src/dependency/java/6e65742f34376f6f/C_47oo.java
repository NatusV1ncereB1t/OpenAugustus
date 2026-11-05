package net;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_425;
import net.C_427;
import net.C_46I;
import net.C_473E;
import net.C_473U;
import net.C_476Q;
import net.C_477f;
import net.C_47AZ;
import net.C_47Fs;
import net.C_47ID;
import net.C_47Il;
import net.C_47LS;
import net.C_47LU;
import net.C_47Od;
import net.C_47UA;
import net.C_47q3;
import net.C_47qE;
import net.C_47qc;
import net.C_47qo;
import net.C_47sk;
import net.C_47vQ;
import net.C_47xo;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.World;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47oo {
    static int field_45O;
    static int field_42H;
    static int field_45m;
    static int field_42_;
    static int field_42V;
    static int field_44D;
    static int field_45;
    static int field_44P;
    static java.lang.String field_44H;
    static org.apache.logging.log4j.Logger field_44c;
    static com.google.gson.Gson field_42D;
    static java.lang.reflect.ParameterizedType field_44G;
    static java.lang.String[] field_446;
    static java.lang.String[] field_45r;
    static java.lang.String[] field_44X;
    static java.lang.String[] field_49;
    static java.lang.String[] field_44f;
    static java.lang.String[] field_452;
    static java.lang.String[] field_45D;
    static java.lang.String[] field_44V;
    static int[] field_45R;
    static int[] field_457;
    static java.lang.String[] field_44J;
    java.util.Set field_45X;
    java.util.Map field_45z;
    float field_422;
    boolean field_42X;
    int field_42Q;
    boolean field_42k;
    boolean field_45L;
    boolean field_456;
    int field_42u;
    int field_42q;
    boolean field_42C;
    int field_42v;
    java.util.List field_44_;
    java.util.List field_42t;
    net.C_473E field_45v;
    boolean field_42i;
    boolean field_42L;
    boolean field_45i;
    float field_45I;
    boolean field_45_;
    boolean field_44r;
    boolean field_42f;
    boolean field_45V;
    boolean field_45h;
    boolean field_42Z;
    boolean field_45n;
    boolean field_47;
    boolean field_44e;
    boolean field_448;
    int field_44T;
    int field_44g;
    boolean field_44s;
    float field_42l;
    float field_48;
    float field_42G;
    float field_44;
    boolean field_45N;
    int field_45c;
    float field_458;
    float field_45q;
    float field_42K;
    float field_44M;
    float field_42I;
    int field_44y;
    boolean field_45a;
    java.lang.String field_42e;
    int field_45C;
    int field_44Q;
    int field_454;
    boolean field_45A;
    boolean field_450;
    net.C_47UA field_45H;
    net.C_47UA field_42P;
    net.C_47UA field_42R;
    net.C_47UA field_42b;
    net.C_47UA field_44W;
    net.C_47UA field_44q;
    net.C_47UA field_40;
    net.C_47UA field_42A;
    net.C_47UA field_45w;
    net.C_47UA field_45p;
    net.C_47UA field_44l;
    net.C_47UA field_440;
    net.C_47UA field_424;
    net.C_47UA field_42;
    net.C_47UA field_42w;
    net.C_47UA field_45B;
    net.C_47UA field_42g;
    net.C_47UA field_42a;
    net.C_47UA field_428;
    net.C_47UA field_45F;
    net.C_47UA field_44R;
    net.C_47UA field_420;
    net.C_47UA field_449;
    net.C_47UA field_45P;
    net.C_47UA[] field_44i;
    net.C_47UA[] field_45S;
    net.C_47qE field_421;
    boolean field_42J;
    int field_44S;
    boolean field_42N;
    boolean field_45M;
    boolean field_447;
    java.lang.String field_44Z;
    boolean field_42p;
    boolean field_44F;
    float field_42B;
    float field_45E;
    float field_45b;
    int field_45Q;
    int field_45y;
    java.lang.String field_453;
    boolean field_44x;
    int field_44K;
    float field_42Y;
    int field_442;
    boolean field_45J;
    boolean field_42s;
    boolean field_44t;
    boolean field_44U;
    boolean field_44j;
    boolean field_44v;
    float field_42E;
    int field_44z;
    int field_42T;
    int field_451;
    float field_44N;
    int field_45f;
    int field_425;
    int field_44a;
    int field_445;
    int field_45t;
    boolean field_44p;
    boolean field_44d;
    boolean field_45o;
    boolean field_45j;
    boolean field_42S;
    boolean field_44o;
    boolean field_44E;
    int field_45U;
    int field_43;
    boolean field_44A;
    int field_44h;
    boolean field_444;
    boolean field_44k;
    java.lang.String field_441;
    boolean field_42o;
    boolean field_45Y;
    boolean field_45e;
    boolean field_44w;
    boolean field_45l;
    boolean field_42x;
    boolean field_45k;
    int field_455;
    boolean field_443;
    boolean field_45g;
    boolean field_41;
    boolean field_44B;
    boolean field_44I;
    int field_42F;
    boolean field_426;
    boolean field_45T;
    int field_44O;
    boolean field_44b;
    boolean field_42n;
    boolean field_46;
    int field_45G;
    int field_42d;
    int field_42O;
    boolean field_45K;
    boolean field_44Y;
    boolean field_42y;
    boolean field_429;
    boolean field_44m;
    boolean field_42c;
    boolean field_44u;
    boolean field_44L;
    boolean field_42z;
    boolean field_44C;
    boolean field_423;
    boolean field_44n;
    boolean field_45x;
    boolean field_45d;
    boolean field_45W;
    net.C_47UA field_45s;
    net.minecraft.client.Minecraft field_459;
    java.io.File field_45u;
    java.io.File field_45Z;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public native void method_46$52507e5416(net.C_47Od arg0,float arg1);

    private static native int method_46$e0db8cfaa3(int arg0,int[] arg1);

    public native void method_46$f633c984d8(boolean arg0);

    public native void method_46$da8c82d5d4();

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.String a(byte[] arg0);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    public native void method_42$da8c82d5d4();

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public native float method_41$c76f4422b2(net.C_47q3 arg0);

    public native void method_41$da8c82d5d4();

    public native boolean method_41$aae029aa0a();

    private native void method_40$da8c82d5d4();

    public native boolean method_40$a7bf4af24e(net.C_47Od arg0);

    private native java.lang.String method_40$2ea0eb6c56(net.C_47Od arg0);

    public Set method_44$9aa7af2ac9() {
        return ImmutableSet.copyOf((Collection)this.field_45X);
    }

    public native void method_44$a1b47bfa71(net.C_47ID arg0,boolean arg1);

    public native void method_44$811225824d(net.C_47q3 arg0,float arg1);

    public native float method_44$4f486c437f(net.C_47Od arg0);

    private native void method_44$da8c82d5d4();

    private native void method_44$cb22cd9c88(net.C_47Od arg0,int arg1);

    public native void method_48$da8c82d5d4();

    public native java.lang.String method_48$2ea0eb6c56(net.C_47Od arg0);

    public static native java.lang.String method_48$b52d34d971(int arg0);

    public static native boolean method_48$2d0981d01d(net.C_47UA arg0);

    public void method_49$b68e536ab1(C_47UA c_47UA, int n) {
        c_47UA.method_42$d00df7729d(n);
        this.method_45$da8c82d5d4();
    }

    public native void method_45$da8c82d5d4();

    private static native int method_45$e0db8cfaa3(int arg0,int[] arg1);

    private native void method_47$52507e5416(net.C_47Od arg0,float arg1);

    public native void method_47$cb22cd9c88(net.C_47Od arg0,int arg1);

    public native void method_47$da8c82d5d4();

    public native int method_47$8abf5c6871();

    private static native int method_47$e0db8cfaa3(int arg0,int[] arg1);

    private native float method_47$4f486c437f(net.C_47Od arg0);

    public native void method_47$82e0630f56(net.C_47ID arg0);

    private native float method_43$b45360e026(java.lang.String arg0);

    public native void method_43$da8c82d5d4();

    private static native java.lang.String method_43$9a2ada123c(java.lang.String[] arg0,int arg1);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
