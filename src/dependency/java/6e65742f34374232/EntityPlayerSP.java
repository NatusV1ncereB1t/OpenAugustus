package net.minecraft.client.entity;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.dietrichevents2.StateTypes;
import java.util.Map;
import net.C_40y;
import net.C_45W;
import net.C_473U;
import net.C_479E;
import net.C_479H;
import net.C_479J;
import net.C_479N;
import net.C_479m;
import net.C_47AC;
import net.C_47K6;
import net.C_47K7;
import net.C_47S9;
import net.C_47cu;
import net.C_47tf;
import net.C_49Q;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.C_47Wi;
import net.C_47he;
import net.C_48c;
import net.C_47bi;
import net.C_476l;
import net.C_47gf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.C_47LS;
import net.minecraft.world.World;
public abstract class EntityPlayerSP extends Entity {
 private EntityPlayerSP(World world) { super(world); }
    public C_47K6 field_49m;
    private C_49Q field_49b;
    private GuiScreen field_40;
    public double field_438;
    public int field_486;
    public int field_48o;
    public int field_434;
    private C_47tf field_48Z;
    private int field_43o;
    private double field_48U;
    private double field_43f;
    private double field_48b;
    public float field_43F;
    public float field_43t;
    public float field_43n;
    public float field_43W;
    private boolean field_485;
    private boolean field_480;
    private int field_48E;
    private boolean field_48t;
    private String field_42d;
    public C_479H field_49w;
    protected Minecraft field_49z;
    protected int field_48P;
    public int field_43J;
    public float field_439;
    public float field_48e;
    public float field_43c;
    public float field_43y;
    private int field_48A;
    private float field_43T;
    public float field_437;
    public float field_43M;
    private boolean field_420;
    public int field_43z;
    private float field_435;
    private float field_43O;
    private C_47S9 field_49V;
    private C_47S9 field_49B;
    private C_47S9 field_49G;
    private float field_48n;
    private int field_48J;
    private C_47tf field_43D;
    private C_47tf field_47N;
    private int field_42W;
    private boolean field_42l;
    public boolean field_48H;
    public boolean field_48m;
    public boolean field_48D;
    private boolean field_43;
    private C_47cu field_49j;
    private float field_43j;
    private float field_43U;
    private C_47tf field_43r;
    private C_47tf field_49n;
    private C_47tf field_42g;
    private C_47tf field_49A;
    private static long b;
    private static String[] r;
    private static String[] s;
    private static Map t;
    private static Object[] y;
    private static String[] z;
    public boolean field_488;
    public int field_43L;
    public World field_47;
    private native static int q(long var0, long var2_1);
    private native static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray);
    private native static Field i(Class clazz, String string, Class clazz2);
    private native static String e(byte[] byArray);
    private native static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2);
    private native static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray);
    private native static void e();
    private native static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType);
    private native static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray);
    private native static String e(int n, long l);
    private native static Exception d(Exception exception);
    private native static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType);
    private native static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray);
    private native static Field j(Class clazz, String string, Class clazz2);
    protected native boolean method_47q$aae029aa0a();
    public native void method_40h$da8c82d5d4();
    public native boolean method_48g$aae029aa0a();
    private native static Class r(long l, long l2);
    private native static Field s(long l, long l2);
    private native static Method t(long l, long l2);
    public native int method_44$8abf5c6871();
    private static native EntityPlayerSP recovery$indy$1(Object var0, long var1, long var3);
    private static native String recovery$indy$7(int var0, long var1);
    private static native void recovery$indy$8(Object var0, Object var1, long var2, long var4);
    private static native String recovery$indy$9(int var0, long var1);
    private static native void recovery$indy$10(Object var0, Object var1, long var2, long var4);
    private static native String recovery$indy$11(int var0, long var1);
    private static native void recovery$indy$16(Object var0, Object var1, long var2, long var4);
    private static native C_47LS recovery$indy$17(Object var0, long var1, long var3);
    private static native C_47K7 recovery$indy$74(boolean var0, float var1, long var2, float var4, double var5, double var7, double var9, long var11, long var13);
    private static native double recovery$indy$75(Object var0, long var1, long var3);
    private static native double recovery$indy$76(Object var0, long var1, long var3);
    private static native double recovery$indy$77(Object var0, long var1, long var3);
    private static native float recovery$indy$78(Object var0, long var1, long var3);
    private static native float recovery$indy$79(Object var0, long var1, long var3);
    private static native double recovery$indy$80(Object var0, long var1, long var3);
    private static native double recovery$indy$81(Object var0, long var1, long var3);
    private static native double recovery$indy$82(Object var0, long var1, long var3);
    private static native float recovery$indy$83(Object var0, long var1, long var3);
    private static native float recovery$indy$84(Object var0, long var1, long var3);
    private static native boolean recovery$indy$85(Object var0, long var1, long var3);
    private static native double recovery$indy$86(Object var0, long var1, long var3);
    private static native double recovery$indy$87(Object var0, long var1, long var3);
    private static native double recovery$indy$88(Object var0, long var1, long var3);
    private static native boolean recovery$indy$89(Object var0, long var1, long var3);
    private static native float recovery$indy$90(Object var0, long var1, long var3);
    private static native float recovery$indy$91(Object var0, long var1, long var3);
    private static native boolean recovery$indy$92(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$93(Object var0, long var1, long var3);
    private static native boolean recovery$indy$94(Object var0, long var1, long var3);
    private static native float recovery$indy$95(Object var0, long var1, long var3);
    private static native float recovery$indy$96(Object var0, long var1, long var3);
    private static native boolean recovery$indy$97(Object var0, long var1, long var3);
    private static native double recovery$indy$98(Object var0, long var1, long var3);
    private static native double recovery$indy$99(Object var0, long var1, long var3);
    private static native double recovery$indy$100(Object var0, long var1, long var3);
    private static native float recovery$indy$101(Object var0, long var1, long var3);
    private static native float recovery$indy$102(Object var0, long var1, long var3);
    private static native double recovery$indy$103(Object var0, long var1, long var3);
    private static native double recovery$indy$104(Object var0, long var1, long var3);
    private static native double recovery$indy$105(Object var0, long var1, long var3);
    private static native double recovery$indy$106(Object var0, long var1, long var3);
    private static native double recovery$indy$107(Object var0, long var1, long var3);
    private static native double recovery$indy$108(Object var0, long var1, long var3);
    private static native double recovery$indy$109(Object var0, long var1, long var3);
    private static native double recovery$indy$110(Object var0, long var1, long var3);
    private static native double recovery$indy$111(Object var0, long var1, long var3);
    private static native double recovery$indy$112(Object var0, long var1, long var3);
    private static native double recovery$indy$113(Object var0, long var1, long var3);
    private static native double recovery$indy$114(Object var0, long var1, long var3);
    private static native double recovery$indy$115(Object var0, long var1, long var3);
    private static native double recovery$indy$116(Object var0, long var1, long var3);
    private static native double recovery$indy$117(Object var0, long var1, long var3);
    private static native void recovery$indy$118(long var0, long var2, long var4);
    private static native EntityPlayerSP recovery$indy$169(Object var0, long var1, long var3);
    private static native C_47Wi recovery$indy$170(long var0, long var2, long var4);
    private static native boolean recovery$indy$171(Object var0, long var1, long var3);
    private static native boolean recovery$indy$172(Object var0, long var1, long var3);
    public double method_46$fedcb3e4d3() {
        return this.field_43f;
    }

    public net.minecraft.client.gui.GuiScreen method_46$f8ba6cbd86() {
        return this.field_40;
    }

    public void method_42$53dd9fd526(net.C_47tf value) {
        this.field_43r = value;
    }

    public net.C_47tf method_42$b2124a4855() {
        return this.field_48Z;
    }

    public double method_41$fedcb3e4d3() {
        return this.field_48b;
    }

    public net.C_47tf method_41$b2124a4855() {
        return this.field_49A;
    }

    public void method_40$7480b345ab(net.minecraft.client.gui.GuiScreen value) {
        this.field_40 = value;
    }

    public void method_40$a7421bf54c(java.lang.String value) {
        this.field_42d = value;
    }

    public net.C_49Q method_40$43c168aa94() {
        return this.field_49b;
    }

    public void method_46r$24a796ab4c(float value) {
        this.field_43F = value;
    }

    public void method_44$2c20cf5948(double value) {
        this.field_43f = value;
    }

    public void method_44$53dd9fd526(net.C_47tf value) {
        this.field_42g = value;
    }

    public net.C_47tf method_44$b2124a4855() {
        return this.field_43D;
    }

    public net.C_47tf method_48$b2124a4855() {
        return this.field_42g;
    }

    public net.C_47tf method_45$b2124a4855() {
        return this.field_49n;
    }

    public void method_45$2c20cf5948(double value) {
        this.field_48U = value;
    }

    public void method_45$53dd9fd526(net.C_47tf value) {
        this.field_49n = value;
    }

    public net.C_47tf method_47$b2124a4855() {
        return this.field_43r;
    }

    public void method_47$53dd9fd526(net.C_47tf value) {
        this.field_49A = value;
    }

    public double method_43$fedcb3e4d3() {
        return this.field_48U;
    }

    public void method_43$2c20cf5948(double value) {
        this.field_48b = value;
    }

    public float method_47L$bc607678b6() {
        return this.field_43T;
    }

    public boolean method_47V$aae029aa0a() {
        return this.field_485;
    }

    public float method_47l$bc607678b6() {
        return this.field_43F;
    }

    public boolean method_47B$aae029aa0a() {
        return this.field_480;
    }

    public float method_47I$bc607678b6() {
        return this.field_43n;
    }

    public java.lang.String method_45W$0e30dfc966() {
        return this.field_42d;
    }

    public void method_43p$f633c984d8(boolean value) {
        this.field_480 = value;
    }

    public void method_433$f633c984d8(boolean value) {
        this.field_485 = value;
    }

    public void method_43C$f633c984d8(boolean value) {
        this.field_42l = value;
    }

    public void method_46z$24a796ab4c(float value) {
        this.field_43n = value;
    }

    public void method_46i$da8c82d5d4() {
        long ownerKey = b ^ 0x4649E98D444AL;
        long moduleKey = ownerKey ^ 0xDC80F32C37DL;
        EntityPlayerSP.recovery$indy$169(this.field_49z, 3236032728902540548L, ownerKey).method_40h$da8c82d5d4();
        C_47Wi module = EntityPlayerSP.recovery$indy$170(moduleKey, 3241662113815505563L, ownerKey);
        if (!this.field_488 || this.field_43L >= this.method_44$8abf5c6871() / 2 || this.field_43L < 0) {
            if (!EntityPlayerSP.recovery$indy$171(module, 3241901694445583717L, ownerKey)) {
                this.field_43L = -1;
                this.field_488 = true;
            }
            if (this.field_47 instanceof C_47he) {
                ((C_47he)this.field_47).method_46$09f8887092().method_43$b037c80ea6(this, new C_48c(this, 0));
            }
        }
        if (!EntityPlayerSP.recovery$indy$172(module, 3236209143826458893L, ownerKey)) {
            if (C_47AC.field_45.olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                this.field_49m.method_45$631790539f(new C_47bi());
            } else {
                this.field_49m.method_45$631790539f(new C_476l(C_47gf.MAIN_HAND));
            }
        }
    }
    public void method_434$f633c984d8(boolean dispatchEvents) {
        long ownerKey;
        long l2 = ownerKey = b ^ 0x5302F17BA540L;
        long eventKey = l2 ^ 0x29D1BB0031C0L;
        long postKey = l2 ^ 0x6375762AE34EL;
        C_47K7 motionEvent = dispatchEvents ? EntityPlayerSP.recovery$indy$74((boolean)this.field_48M, (float)this.field_48h, (long)eventKey, (float)this.field_48z, (double)this.field_48Q, (double)this.method_45$6684d3c618().field_46, (double)this.field_42o, (long)-3605329540967327021L, (long)ownerKey) : new C_47K7(this.field_48M, this.field_48h, this.field_48z, this.field_48Q, this.method_45$6684d3c618().field_46, this.field_42o, StateTypes.PRE);
        boolean sprinting = this.method_488$aae029aa0a() && !this.field_42l;
        if (sprinting != this.field_480) {
            if (sprinting) {
                this.field_49m.method_45$631790539f((C_473U)new C_45W((Entity)this, C_40y.START_SPRINTING));
            } else {
                this.field_49m.method_45$631790539f((C_473U)new C_45W((Entity)this, C_40y.STOP_SPRINTING));
            }
            this.field_48H = false;
            this.field_48m = false;
            this.field_48D = false;
            this.field_480 = sprinting;
        }
        this.field_42l = false;
        boolean sneaking = this.method_48g$aae029aa0a();
        if (sneaking != this.field_485) {
            if (sneaking) {
                this.field_49m.method_45$631790539f((C_473U)new C_45W((Entity)this, C_40y.START_SNEAKING));
            } else {
                this.field_49m.method_45$631790539f((C_473U)new C_45W((Entity)this, C_40y.STOP_SNEAKING));
            }
            this.field_485 = sneaking;
        }
        if (this.method_47q$aae029aa0a()) {
            double deltaX = EntityPlayerSP.recovery$indy$75((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey) - this.field_48U;
            double deltaY = EntityPlayerSP.recovery$indy$76((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey) - this.field_43f;
            double deltaZ = EntityPlayerSP.recovery$indy$77((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey) - this.field_48b;
            double deltaYaw = EntityPlayerSP.recovery$indy$78((Object)motionEvent, (long)-3610874005194031164L, (long)ownerKey) - this.field_43F;
            double deltaPitch = EntityPlayerSP.recovery$indy$79((Object)motionEvent, (long)-3608523650348200433L, (long)ownerKey) - this.field_43n;
            if (C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                ++this.field_48E;
            }
            boolean positionChanged = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ > (C_47AC.field_45.newerThan(ProtocolVersion.v1_18) ? 4.0E-8 : 9.0E-4) || this.field_48E >= 20;
            boolean rotationChanged = deltaYaw != 0.0 || deltaPitch != 0.0;
            if (this.field_48S == null) {
                if (positionChanged && rotationChanged) {
                    this.field_49m.method_45$631790539f((C_473U)new C_479m(EntityPlayerSP.recovery$indy$80((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey), EntityPlayerSP.recovery$indy$81((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey), EntityPlayerSP.recovery$indy$82((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey), EntityPlayerSP.recovery$indy$83((Object)motionEvent, (long)-3610874005194031164L, (long)ownerKey), EntityPlayerSP.recovery$indy$84((Object)motionEvent, (long)-3608523650348200433L, (long)ownerKey), EntityPlayerSP.recovery$indy$85((Object)motionEvent, (long)-3607664649343541442L, (long)ownerKey)));
                } else if (positionChanged) {
                    this.field_49m.method_45$631790539f((C_473U)new C_479J(EntityPlayerSP.recovery$indy$86((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey), EntityPlayerSP.recovery$indy$87((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey), EntityPlayerSP.recovery$indy$88((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey), EntityPlayerSP.recovery$indy$89((Object)motionEvent, (long)-3607664649343541442L, (long)ownerKey)));
                } else if (rotationChanged) {
                    this.field_49m.method_45$631790539f((C_473U)new C_479N(EntityPlayerSP.recovery$indy$90((Object)motionEvent, (long)-3610874005194031164L, (long)ownerKey), EntityPlayerSP.recovery$indy$91((Object)motionEvent, (long)-3608523650348200433L, (long)ownerKey), EntityPlayerSP.recovery$indy$92((Object)motionEvent, (long)-3607664649343541442L, (long)ownerKey)));
                } else if (C_47AC.field_45.olderThanOrEqualTo(ProtocolVersion.v1_8) || this.field_420 != EntityPlayerSP.recovery$indy$93((Object)this.field_49z, (long)-3611139421162636274L, (long)ownerKey).field_48M) {
                    this.field_49m.method_45$631790539f((C_473U)new C_479E(EntityPlayerSP.recovery$indy$94((Object)motionEvent, (long)-3607664649343541442L, (long)ownerKey)));
                }
            } else {
                this.field_49m.method_45$631790539f((C_473U)new C_479m(this.field_48s, -999.0, this.field_487, EntityPlayerSP.recovery$indy$95((Object)motionEvent, (long)-3610874005194031164L, (long)ownerKey), EntityPlayerSP.recovery$indy$96((Object)motionEvent, (long)-3608523650348200433L, (long)ownerKey), EntityPlayerSP.recovery$indy$97((Object)motionEvent, (long)-3607664649343541442L, (long)ownerKey)));
                positionChanged = false;
            }
            if (C_47AC.field_45.olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                ++this.field_48E;
            }
            if (positionChanged) {
                this.field_48U = EntityPlayerSP.recovery$indy$98((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey);
                this.field_43f = EntityPlayerSP.recovery$indy$99((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey);
                this.field_48b = EntityPlayerSP.recovery$indy$100((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey);
                this.field_48E = 0;
            }
            this.field_43t = this.field_43F;
            this.field_43W = this.field_43n;
            if (rotationChanged) {
                this.field_43F = EntityPlayerSP.recovery$indy$101((Object)motionEvent, (long)-3610874005194031164L, (long)ownerKey);
                this.field_43n = EntityPlayerSP.recovery$indy$102((Object)motionEvent, (long)-3608523650348200433L, (long)ownerKey);
            }
        }
        this.field_420 = this.field_48M;
        if (this.field_43D == null) {
            this.field_43D = new C_47tf(EntityPlayerSP.recovery$indy$103((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey), EntityPlayerSP.recovery$indy$104((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey), EntityPlayerSP.recovery$indy$105((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey));
        }
        if (this.field_47N == null) {
            this.field_47N = new C_47tf(EntityPlayerSP.recovery$indy$106((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey), EntityPlayerSP.recovery$indy$107((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey), EntityPlayerSP.recovery$indy$108((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey));
        }
        this.field_42W = this.field_47N.field_40 != EntityPlayerSP.recovery$indy$109((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey) || this.field_47N.field_41 != EntityPlayerSP.recovery$indy$110((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey) || this.field_47N.field_47 != EntityPlayerSP.recovery$indy$111((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey) ? 3 : this.field_42W;
        if (this.field_42W > 0) {
            this.field_43D = new C_47tf(this.field_43D.field_40 + (EntityPlayerSP.recovery$indy$112((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey) - this.field_43D.field_40) / (double)this.field_42W, this.field_43D.field_41 + (EntityPlayerSP.recovery$indy$113((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey) - this.field_43D.field_41) / (double)this.field_42W, this.field_43D.field_47 + (EntityPlayerSP.recovery$indy$114((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey) - this.field_43D.field_47) / (double)this.field_42W);
            --this.field_42W;
        }
        this.field_47N = new C_47tf(EntityPlayerSP.recovery$indy$115((Object)motionEvent, (long)-3607751766412752822L, (long)ownerKey), EntityPlayerSP.recovery$indy$116((Object)motionEvent, (long)-3607942373188689601L, (long)ownerKey), EntityPlayerSP.recovery$indy$117((Object)motionEvent, (long)-3605458158448533978L, (long)ownerKey));
        if (dispatchEvents) {
            EntityPlayerSP.recovery$indy$118((long)postKey, (long)-3610765484873334851L, (long)ownerKey);
        }
        this.method_44$53dd9fd526(this.method_47$b2124a4855());
        this.method_47$53dd9fd526(this.method_45$b2124a4855());
    }
}
