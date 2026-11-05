package net;
import client.Client;
import client.ClientGlobals;
import client.module.ModuleManager;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import net.C_40v;
import net.C_41l;
import net.C_42R;
import net.C_42z;
import net.C_45z;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_4792;
import net.C_4798;
import net.C_479K;
import net.C_479L;
import net.C_479P;
import net.C_479a;
import net.C_479c;
import net.C_479o;
import net.C_479p;
import net.C_479t;
import net.C_47B0;
import net.C_47B1;
import net.C_47B3;
import net.C_47B4;
import net.C_47B6;
import net.C_47B7;
import net.C_47B9;
import net.C_47BD;
import net.C_47BE;
import net.C_47BG;
import net.C_47BI;
import net.C_47BJ;
import net.C_47BK;
import net.C_47BL;
import net.C_47BN;
import net.C_47BO;
import net.C_47BP;
import net.C_47BS;
import net.C_47BU;
import net.C_47BX;
import net.C_47BZ;
import net.C_47Bb;
import net.C_47Be;
import net.C_47Bm;
import net.C_47Bn;
import net.C_47Bo;
import net.C_47Bp;
import net.C_47Bq;
import net.C_47Br;
import net.C_47Bt;
import net.C_47Bu;
import net.C_47Bv;
import net.C_47Bw;
import net.C_47By;
import net.C_47EP;
import net.C_47F8;
import net.C_47Gj;
import net.C_47Il;
import net.C_47PA;
import net.C_47PC;
import net.C_47PH;
import net.C_47PQ;
import net.C_47PT;
import net.C_47P_;
import net.C_47Pk;
import net.C_47Pl;
import net.C_47Pz;
import net.C_47TC;
import net.C_47UZ;
import net.C_47W4;
import net.C_47Wu;
import net.C_47a0;
import net.C_47a5;
import net.C_47a7;
import net.C_47aA;
import net.C_47aC;
import net.C_47aE;
import net.C_47aH;
import net.C_47aI;
import net.C_47aJ;
import net.C_47aP;
import net.C_47aQ;
import net.C_47aT;
import net.C_47aW;
import net.C_47aX;
import net.C_47aZ;
import net.C_47a_;
import net.C_47ak;
import net.C_47al;
import net.C_47am;
import net.C_47an;
import net.C_47aq;
import net.C_47aw;
import net.C_47ax;
import net.C_47az;
import net.C_47mU;
import net.C_47oo;
import net.C_47pC;
import net.C_47pl;
import net.C_47sS;
import net.C_47tf;
import net.C_47tt;
import net.C_47w0;
import net.C_47w1;
import net.C_47w2;
import net.C_47w3;
import net.C_47w4;
import net.C_47w5;
import net.C_47w8;
import net.C_47w9;
import net.C_47wB;
import net.C_47wD;
import net.C_47wE;
import net.C_47wG;
import net.C_47wI;
import net.C_47wJ;
import net.C_47wK;
import net.C_47wL;
import net.C_47wM;
import net.C_47wN;
import net.C_47wP;
import net.C_47wR;
import net.C_47wS;
import net.C_47wU;
import net.C_47wV;
import net.C_47wW;
import net.C_47wZ;
import net.C_47wa;
import net.C_47wb;
import net.C_47wc;
import net.C_47wd;
import net.C_47we;
import net.C_47wf;
import net.C_47wg;
import net.C_47wh;
import net.C_47wi;
import net.C_47wj;
import net.C_47wm;
import net.C_47wo;
import net.C_47wp;
import net.C_47wq;
import net.C_47wr;
import net.C_47ws;
import net.C_47wt;
import net.C_47wu;
import net.C_47wv;
import net.C_47ww;
import net.C_47wx;
import net.C_47wy;
import net.C_47x_;
import net.C_484;
import net.C_49h;
import net.C_4f;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47j9 {
    java.util.Map field_43r;
    java.util.Map field_434;
    net.C_47wJ field_44;
    net.minecraft.client.gui.FontRenderer field_43L;
    double field_43A;
    double field_43h;
    double field_48;
    net.minecraft.client.renderer.texture.TextureManager field_41;
    net.minecraft.world.World field_43;
    net.minecraft.entity.Entity field_49;
    net.minecraft.entity.Entity field_43_;
    float field_433;
    float field_47;
    net.C_47oo field_43K;
    double field_43j;
    double field_46;
    double field_43V;
    boolean field_40;
    boolean field_43E;
    boolean field_45;
    net.C_47PC field_42;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public void method_46$f633c984d8(boolean value) {
        this.field_43E = value;
    }

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Throwable a(java.lang.Throwable arg0);

    private native void method_42$c6531a7535(net.minecraft.entity.Entity arg0,double arg1,double arg2,double arg3,float arg4,float arg5,boolean arg6);

    public void method_42$f633c984d8(boolean value) {
        this.field_45 = value;
    }

    public native void method_42$ce5acc6e2e(net.minecraft.world.World arg0,net.minecraft.client.gui.FontRenderer arg1,net.minecraft.entity.Entity arg2,net.minecraft.entity.Entity arg3,net.C_47oo arg4,float arg5);

    public net.minecraft.client.gui.FontRenderer method_42$aeaaebeabd() {
        return this.field_43L;
    }

    public native void method_42$fb75e24ae7(net.minecraft.entity.Entity arg0,float arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public boolean method_41$aae029aa0a() {
        return this.field_43E;
    }

    public double method_41$fedcb3e4d3() {
        return this.field_43A;
    }

    native public boolean method_41$470cbf2a56(Entity entity, double d, double d2, double d3, float f, float f2);

    native public Map method_40$43b9f1ea53();

    public void method_40$24a796ab4c(float value) {
        this.field_433 = value;
    }

    public native net.C_47PC method_48$9ac57df522(java.lang.Class arg0);

    public double method_48$4b58f7ab41(double d, double d2, double d3) {
        double d4 = d - this.field_43j;
        double d5 = d2 - this.field_46;
        double d6 = d3 - this.field_43V;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public void method_49$a59262c0f0(double d, double d2, double d3) {
        this.field_43A = d;
        this.field_43h = d2;
        this.field_48 = d3;
    }

    public boolean method_49$9adb6424b3(Entity entity, float f) {
        return this.method_47$8ecfd306d8(entity, f, false);
    }

    public void method_49$c4596a1755(java.util.Map value) {
        this.field_43r = value;
    }

    public double method_49$fedcb3e4d3() {
        return this.field_43h;
    }

    public boolean method_49$aae029aa0a() {
        return this.field_45;
    }

    public native boolean method_45$e51ebfa8eb(net.minecraft.entity.Entity arg0,net.C_47W4 arg1,double arg2,double arg3,double arg4);

    public java.util.Map method_45$43b9f1ea53() {
        return this.field_43r;
    }

    public double method_45$fedcb3e4d3() {
        return this.field_48;
    }

    public void method_47$9eb75cbbdb(net.minecraft.world.World value) {
        this.field_43 = value;
    }

    public native boolean method_47$8ecfd306d8(net.minecraft.entity.Entity arg0,float arg1,boolean arg2);

    public void method_43$f633c984d8(boolean value) {
        this.field_40 = value;
    }

    public native net.C_47PC method_43$807e6aa360(net.minecraft.entity.Entity arg0);

    public native boolean method_43$7464e6b30e(net.minecraft.entity.Entity arg0,double arg1,double arg2,double arg3,float arg4,float arg5,boolean arg6);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
