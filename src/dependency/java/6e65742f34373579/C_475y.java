package net;
import augustus.recovered.modules.render.XRay_47HH;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40E;
import net.C_40i;
import net.C_41j;
import net.C_43F;
import net.C_43r;
import net.C_46D;
import net.C_46G;
import net.C_46K;
import net.C_46b;
import net.C_46e;
import net.C_46j;
import net.C_4750;
import net.C_4755;
import net.C_4756;
import net.C_4757;
import net.C_475A;
import net.C_475B;
import net.C_475C;
import net.C_475E;
import net.C_475I;
import net.C_475J;
import net.C_475K;
import net.C_475N;
import net.C_475O;
import net.C_475P;
import net.C_475Q;
import net.C_475R;
import net.C_475T;
import net.C_475X;
import net.C_475_;
import net.C_475a;
import net.C_475d;
import net.C_475k;
import net.C_475l;
import net.C_475m;
import net.C_475n;
import net.C_475q;
import net.C_475w;
import net.C_475z;
import net.C_478Q;
import net.C_478i;
import net.C_47B0;
import net.C_47BP;
import net.C_47E2;
import net.C_47E3;
import net.C_47E4;
import net.C_47E5;
import net.C_47E6;
import net.C_47E7;
import net.C_47E8;
import net.C_47E9;
import net.C_47EA;
import net.C_47EB;
import net.C_47ED;
import net.C_47EE;
import net.C_47EF;
import net.C_47EG;
import net.C_47EH;
import net.C_47EI;
import net.C_47EJ;
import net.C_47EK;
import net.C_47EL;
import net.C_47EM;
import net.C_47EN;
import net.C_47EP;
import net.C_47EQ;
import net.C_47ER;
import net.C_47ES;
import net.C_47EU;
import net.C_47EV;
import net.C_47EW;
import net.C_47EX;
import net.C_47EY;
import net.C_47EZ;
import net.C_47E_;
import net.C_47Ea;
import net.C_47Eb;
import net.C_47Ec;
import net.C_47Ee;
import net.C_47Ef;
import net.C_47Eg;
import net.C_47Eh;
import net.C_47Ej;
import net.C_47Ek;
import net.C_47El;
import net.C_47Em;
import net.C_47En;
import net.C_47Eo;
import net.C_47Eq;
import net.C_47Er;
import net.C_47Es;
import net.C_47Et;
import net.C_47Eu;
import net.C_47Ev;
import net.C_47Ew;
import net.C_47Ex;
import net.C_47Ez;
import net.C_47Ij;
import net.C_47J0;
import net.C_47J1;
import net.C_47J2;
import net.C_47J3;
import net.C_47J4;
import net.C_47J5;
import net.C_47J6;
import net.C_47J7;
import net.C_47J9;
import net.C_47JB;
import net.C_47JC;
import net.C_47JD;
import net.C_47JE;
import net.C_47JF;
import net.C_47JG;
import net.C_47JI;
import net.C_47JJ;
import net.C_47JL;
import net.C_47JN;
import net.C_47JO;
import net.C_47JR;
import net.C_47JS;
import net.C_47JV;
import net.C_47JW;
import net.C_47JX;
import net.C_47JY;
import net.C_47JZ;
import net.C_47Ja;
import net.C_47Jb;
import net.C_47Jc;
import net.C_47Jd;
import net.C_47Je;
import net.C_47Jf;
import net.C_47Jh;
import net.C_47Ji;
import net.C_47Jj;
import net.C_47Jk;
import net.C_47Jm;
import net.C_47Jn;
import net.C_47Jo;
import net.C_47Jp;
import net.C_47Jq;
import net.C_47Jr;
import net.C_47Js;
import net.C_47Jt;
import net.C_47Ju;
import net.C_47Jv;
import net.C_47Jw;
import net.C_47Jx;
import net.C_47Jy;
import net.C_47K;
import net.C_47Ri;
import net.C_47S0;
import net.C_47T7;
import net.C_47UX;
import net.C_47UZ;
import net.C_47Xe;
import net.C_47cH;
import net.C_47es;
import net.C_47gb;
import net.C_47jP;
import net.C_47mw;
import net.C_47oI;
import net.C_47rf;
import net.C_47ru;
import net.C_47sS;
import net.C_47tf;
import net.C_47v;
import net.C_47yk;
import net.C_484;
import net.C_49T;
import net.C_49l;
import net.C_4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_475y {
    static net.minecraft.util.ResourceLocation field_49x;
    static net.C_47oI field_49H;
    static net.C_47gb field_44;
    net.C_47es field_494;
    static net.C_49l field_49b;
    static net.C_49l field_49f;
    static net.C_49l field_49Q;
    static net.C_49l field_49s;
    static net.C_49l field_49K;
    static net.C_49l field_49p;
    static net.C_49l field_495;
    static net.C_49l field_49S;
    static net.C_49l field_49A;
    static net.C_49l field_49y;
    static net.C_49l field_49Y;
    static net.C_49l field_490;
    static net.C_49l field_43;
    boolean field_49e;
    int field_41;
    boolean field_46;
    int field_42;
    boolean field_49r;
    float field_49m;
    float field_49j;
    boolean field_49;
    boolean field_49o;
    boolean field_49D;
    double field_40;
    double field_49O;
    double field_45;
    double field_49I;
    double field_498;
    double field_49W;
    net.C_49l field_49g;
    float field_49T;
    net.C_47Xe field_49G;
    net.C_47Ri field_493;
    float field_49F;
    net.C_49T field_48;
    net.C_47UZ field_47;
    java.lang.String field_497;
    static long a;
    static java.lang.String[] d;
    static java.lang.String[] e;
    static java.util.Map f;
    static java.lang.Object[] k;
    static java.lang.String[] l;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Exception b(java.lang.Exception arg0);

    public C_47UZ method_46$b69f2df4f2(C_47UZ c_47UZ) {
        return c_47UZ;
    }

    public void method_46$85c483902c(World world, C_478Q c_478Q, C_47UZ c_47UZ, EntityPlayer entityPlayer) {
    }

    protected C_475y method_46$e084f7739d() {
        this.method_44$77d9013503(-1.0f);
        return this;
    }

    public net.C_47UZ method_46$5ec0c4dca2() {
        return this.field_47;
    }

    public final void method_46$3d65da0bc2(World world, C_478Q c_478Q, C_47UZ c_47UZ, int n) {
        this.method_46$f08a524717(world, c_478Q, c_47UZ, 1.0f, n);
    }

    public native void method_46$f08a524717(net.minecraft.world.World arg0,net.C_478Q arg1,net.C_47UZ arg2,float arg3,int arg4);

    public boolean method_46$97186ba9e6(C_47cH c_47cH) {
        return true;
    }

    public boolean method_46$11172d118b(World world, C_478Q c_478Q, C_484 c_484, C_47rf c_47rf) {
        return this.method_48$bc83db2d44(world, c_478Q, c_484);
    }

    public void method_46$789ddda2bd(World world, C_478Q c_478Q, C_47UZ c_47UZ) {
    }

    public void method_46$dd5a11c850(World world, C_478Q c_478Q, EntityPlayer entityPlayer) {
    }

    public void method_46$da8c82d5d4() {
    }

    public C_47v method_46$b241d86379() {
        return C_47v.SOLID;
    }

    private static void method_46$90a7561101(int n, String string, C_475y c_475y) {
        C_475y.method_48$7f6572a77e(n, new ResourceLocation(string), c_475y);
    }

    public int method_46$fafbbb17a4(C_47UZ c_47UZ) {
        return 0xFFFFFF;
    }

    private native boolean method_46$f523beac1e(net.C_47tf arg0);

    public boolean method_46$aae029aa0a() {
        return false;
    }

    public float method_46$ee256e8a75(Entity entity) {
        return this.field_49j / 5.0f;
    }

    public void method_46$e1ae124146(World world, C_478Q c_478Q, C_47UZ c_47UZ, Random random) {
    }

    public double method_46$fedcb3e4d3() {
        return this.field_49O;
    }

    public native java.lang.String method_46$0e30dfc966();

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native void a();

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native int a(long arg0,long arg1);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public C_478i method_42$f487e42d4b(World world, C_478Q c_478Q) {
        return new C_478i((double)c_478Q.method_40$8abf5c6871() + this.field_40, (double)c_478Q.method_43$8abf5c6871() + this.field_49O, (double)c_478Q.method_47$8abf5c6871() + this.field_45, (double)c_478Q.method_40$8abf5c6871() + this.field_49I, (double)c_478Q.method_43$8abf5c6871() + this.field_498, (double)c_478Q.method_47$8abf5c6871() + this.field_49W);
    }

    protected C_475y method_42$77d9013503(float f) {
        this.field_42 = (int)(15.0f * f);
        return this;
    }

    public void method_42$6b51e0299b(C_47S0 c_47S0, int n, int n2, int n3) {
    }

    public int method_42$8abf5c6871() {
        return this.field_41;
    }

    public void method_42$0e2c4dd620(World world, C_478Q c_478Q, C_47UZ c_47UZ, EntityLivingBase entityLivingBase, C_47rf c_47rf) {
    }

    protected C_475y method_42$8d4694ec3b(boolean bl) {
        this.field_49o = bl;
        return this;
    }

    public double method_42$fedcb3e4d3() {
        return this.field_40;
    }

    public C_475y method_42$e351b3a0e7(C_47es c_47es) {
        this.field_494 = c_47es;
        return this;
    }

    public C_47UZ method_42$66b82c3102(C_47UZ c_47UZ, C_47S0 c_47S0, int n, int n2, int n3) {
        return c_47UZ;
    }

    public void method_42$e1ae124146(World world, C_478Q c_478Q, C_47UZ c_47UZ, Random random) {
        this.method_46$e1ae124146(world, c_478Q, c_47UZ, random);
    }

    public void method_42$35f81d268d(World world, C_478Q c_478Q, Entity entity) {
    }

    public int method_42$38b2ed2c7e(World world, C_478Q c_478Q) {
        return this.method_45$fafbbb17a4(world.method_46$efbf73d2b1(c_478Q));
    }

    public int method_42$060834df09(C_47S0 c_47S0, C_478Q c_478Q) {
        return this.method_41$de5e4627da(c_47S0, c_478Q.method_40$8abf5c6871(), c_478Q.method_43$8abf5c6871(), c_478Q.method_47$8abf5c6871());
    }

    public boolean method_42$aae029aa0a() {
        return true;
    }

    public boolean method_42$4bc460106f(C_47UZ c_47UZ, boolean bl, boolean bl2) {
        return this.method_49$aae029aa0a();
    }

    public boolean method_42$b41614db2d(World world, C_478Q c_478Q, C_47UZ c_47UZ, EntityPlayer entityPlayer, C_484 c_484, float f, float f2, float f3) {
        return false;
    }

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public void method_41$b53bf92512(World world, C_478Q c_478Q) {
    }

    public final int method_41$060834df09(C_47S0 c_47S0, C_478Q c_478Q) {
        return this.method_44$ed73798bcf(c_47S0, c_478Q, 0);
    }

    public native boolean method_41$169054f119(net.C_47S0 arg0,int arg1,int arg2,int arg3);

    public C_47Ri method_41$536c7c8217(C_47UZ c_47UZ) {
        return this.field_493;
    }

    private native boolean method_41$f523beac1e(net.C_47tf arg0);

    public int method_41$8abf5c6871() {
        return 0xFFFFFF;
    }

    public int method_41$ae6138334e(World world) {
        return 10;
    }

    public C_47UZ method_41$edde1aba98(int n) {
        return this.method_46$5ec0c4dca2();
    }

    public double method_41$fedcb3e4d3() {
        return this.field_49I;
    }

    public boolean method_41$aae029aa0a() {
        return false;
    }

    public net.C_47es method_41$d9bb815435() {
        return this.field_494;
    }

    public C_47tf method_41$0e6224f4d8(World world, C_478Q c_478Q, Entity entity, C_47tf c_47tf) {
        return c_47tf;
    }

    public native int method_41$de5e4627da(net.C_47S0 arg0,int arg1,int arg2,int arg3);

    public C_43r method_41$46086bc101(World world, C_478Q c_478Q) {
        return C_43r.method_49$13724ad5d4(this);
    }

    protected C_475y method_40$77d9013503(float f) {
        this.field_49j = f * 3.0f;
        return this;
    }

    public native net.C_47Ij method_40$590bfd39f6(net.minecraft.world.World arg0,net.C_478Q arg1,double arg2,double arg3,double arg4,double arg5,double arg6,double arg7);

    public native float method_40$bc607678b6();

    private native boolean method_40$f523beac1e(net.C_47tf arg0);

    protected final void method_40$cc82067b44(float f, float f2, float f3, float f4, float f5, float f6) {
        this.field_40 = f;
        this.field_49O = f2;
        this.field_45 = f3;
        this.field_49I = f4;
        this.field_498 = f5;
        this.field_49W = f6;
    }

    public int method_40$38b2ed2c7e(World world, C_478Q c_478Q) {
        return 0;
    }

    public double method_40$fedcb3e4d3() {
        return this.field_45;
    }

    public void method_40$7f4ce6cf48(World world, Entity entity) {
        entity.field_42 = 0.0;
    }

    public boolean method_40$a4b0ce59bd(World world, C_478Q c_478Q) {
        return false;
    }

    public C_475y method_40$f2d9800f06(String string) {
        this.field_497 = string;
        return this;
    }

    protected native boolean method_40$aae029aa0a();

    protected C_475y method_40$7d63918764(C_49l c_49l) {
        this.field_49g = c_49l;
        return this;
    }

    public void method_40$6323e3cc0f(World world, C_478Q c_478Q, C_47UZ c_47UZ, Entity entity) {
    }

    public void method_40$789ddda2bd(World world, C_478Q c_478Q, C_47UZ c_47UZ) {
    }

    public native void method_44$7e99941829(net.minecraft.world.World arg0,net.C_478Q arg1,net.C_47UZ arg2,net.C_478i arg3,java.util.List arg4,net.minecraft.entity.Entity arg5);

    public native boolean method_44$aae029aa0a();

    public C_43r method_44$21f125ce68(C_47UZ c_47UZ, Random random, int n) {
        return C_43r.method_49$13724ad5d4(this);
    }

    public int method_44$2df6bc1279(C_47S0 c_47S0, C_478Q c_478Q, C_47UZ c_47UZ, C_484 c_484) {
        return 0;
    }

    public static native void method_44$da8c82d5d4();

    public native net.C_47tf method_44$a511f7901b(double arg0,double arg1,double arg2,double arg3,double arg4,double arg5,double arg6);

    public int method_44$8abf5c6871() {
        return this.field_49G.method_43$8abf5c6871();
    }

    protected native net.C_475y method_44$77d9013503(float arg0);

    public void method_44$2e7ea1bc11(net.C_47UZ value) {
        this.field_47 = value;
    }

    public boolean method_44$8b903c4af2(C_47UZ c_47UZ, boolean bl) {
        return this.method_49$aae029aa0a();
    }

    protected native void method_44$6c59f3e417(net.minecraft.world.World arg0,net.C_478Q arg1,int arg2);

    public void method_44$55a083ae5c(World world, C_478Q c_478Q, C_47UZ c_47UZ, C_475y c_475y) {
    }

    public static C_47UZ method_44$edde1aba98(int n) {
        int n2 = n & 0xFFF;
        int n3 = n >> 12 & 0xF;
        return C_475y.method_49$c1e739f280(n2).method_41$edde1aba98(n3);
    }

    public void method_44$f674098a46(C_43r c_43r, C_47es c_47es, List list) {
        list.add(new C_47rf(c_43r, 1, 0));
    }

    public int method_44$ed73798bcf(C_47S0 c_47S0, C_478Q c_478Q, int n) {
        return 0xFFFFFF;
    }

    private static void method_48$7f6572a77e(int n, ResourceLocation resourceLocation, C_475y c_475y) {
        field_49H.method_40$6b8d4efbda(n, (Object)resourceLocation, (Object)c_475y);
    }

    public boolean method_48$a4b0ce59bd(World world, C_478Q c_478Q) {
        return world.method_46$efbf73d2b1((C_478Q)c_478Q).method_48$e084f7739d().field_49G.method_49$aae029aa0a();
    }

    public int method_48$e4fba4cb85(Random random) {
        return 1;
    }

    public C_40E method_48$28eede2a80() {
        return C_40E.NONE;
    }

    public boolean method_48$bc83db2d44(World world, C_478Q c_478Q, C_484 c_484) {
        return this.method_48$a4b0ce59bd(world, c_478Q);
    }

    public boolean method_48$b41614db2d(World world, C_478Q c_478Q, C_47UZ c_47UZ, EntityPlayer entityPlayer, C_484 c_484, float f, float f2, float f3) {
        return false;
    }

    public C_47UZ method_48$d74190f387(World world, C_478Q c_478Q, C_484 c_484, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return this.method_41$edde1aba98(n);
    }

    public static native net.C_475y method_48$f2d9800f06(java.lang.String arg0);

    public static int method_48$dd4913a2cb(C_475y c_475y) {
        return field_49H.method_41$e47da4afb6((Object)c_475y);
    }

    public native net.C_47tf method_48$a511f7901b(double arg0,double arg1,double arg2,double arg3,double arg4,double arg5,double arg6);

    public void method_48$9a4892f6e3(World world, C_478Q c_478Q, C_47cH c_47cH) {
    }

    public boolean method_48$aae029aa0a() {
        return this.field_49D;
    }

    protected final void method_48$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        this.field_40 = d;
        this.field_49O = d2;
        this.field_45 = d3;
        this.field_49I = d4;
        this.field_498 = d5;
        this.field_49W = d6;
    }

    public native boolean method_48$058406673f(net.C_47S0 arg0,net.C_478Q arg1);

    public boolean method_48$ef9648958f(C_47S0 c_47S0, C_478Q c_478Q, C_484 c_484) {
        return c_47S0.method_46$efbf73d2b1(c_478Q).method_48$e084f7739d().method_49$a32a680f8b().method_47$aae029aa0a();
    }

    public double method_49$fedcb3e4d3() {
        return this.field_498;
    }

    private native boolean method_49$f523beac1e(net.C_47tf arg0);

    public void method_49$f0a577f322(World world, C_478Q c_478Q, Entity entity, float f) {
        entity.method_44$dd322a622a(f, 1.0f);
    }

    public static native boolean method_49$b1616dd160(net.C_475y arg0,net.C_475y arg1);

    public boolean method_49$aae029aa0a() {
        return true;
    }

    public static native net.C_475y method_49$654211ccc1(net.C_43r arg0);

    public void method_49$789ddda2bd(World world, C_478Q c_478Q, C_47UZ c_47UZ) {
    }

    public static C_475y method_49$c1e739f280(int n) {
        return (C_475y)field_49H.method_41$915e32db46(n);
    }

    public net.C_47Xe method_49$a32a680f8b() {
        return this.field_49G;
    }

    public native boolean method_49$89336b9cb4(net.C_47S0 arg0,int arg1,int arg2,int arg3,net.C_484 arg4);

    public int method_45$c435023e5b(int n, Random random) {
        return this.method_48$e4fba4cb85(random);
    }

    protected C_49T method_45$8e4b46021d() {
        return new C_49T(this, new C_47sS[0]);
    }

    public native void method_45$2293bfa74a(net.minecraft.world.World arg0,net.minecraft.entity.player.EntityPlayer arg1,net.C_478Q arg2,net.C_47UZ arg3,net.C_47K arg4);

    public boolean method_45$aae029aa0a() {
        return this.field_49r;
    }

    protected C_475y method_45$e084f7739d() {
        this.field_49 = false;
        return this;
    }

    public double method_45$fedcb3e4d3() {
        return this.field_49W;
    }

    public int method_45$2df6bc1279(C_47S0 c_47S0, C_478Q c_478Q, C_47UZ c_47UZ, C_484 c_484) {
        return 0;
    }

    public int method_45$fafbbb17a4(C_47UZ c_47UZ) {
        return 0;
    }

    protected final void method_45$6059593eaa(C_478i c_478i) {
        this.field_40 = c_478i.field_48;
        this.field_49O = c_478i.field_46;
        this.field_45 = c_478i.field_44;
        this.field_49I = c_478i.field_42;
        this.field_498 = c_478i.field_47;
        this.field_49W = c_478i.field_40;
    }

    public int method_45$8abf5c6871() {
        return 3;
    }

    private native boolean method_45$f523beac1e(net.C_47tf arg0);

    public boolean method_47$aae029aa0a() {
        return this.field_49o;
    }

    public C_478i method_47$61d5683948(World world, C_47UZ c_47UZ, int n, int n2, int n3) {
        return new C_478i((double)n + this.field_40, (double)n2 + this.field_49O, (double)n3 + this.field_45, (double)n + this.field_49I, (double)n2 + this.field_498, (double)n3 + this.field_49W);
    }

    protected C_475y method_47$c1e739f280(int n) {
        this.field_41 = n;
        return this;
    }

    public native int method_47$fafbbb17a4(net.C_47UZ arg0);

    public native boolean method_47$27a36fdbd7(net.C_475y arg0);

    public net.C_49T method_43$8e4b46021d() {
        return this.field_48;
    }

    public boolean method_43$1e6bdde589(World world, C_478Q c_478Q, C_47UZ c_47UZ, int n, int n2) {
        return false;
    }

    public static int method_43$fafbbb17a4(C_47UZ c_47UZ) {
        C_475y c_475y = c_47UZ.method_48$e084f7739d();
        return C_475y.method_48$dd4913a2cb(c_475y) + (c_475y.method_47$fafbbb17a4(c_47UZ) << 12);
    }

    public native net.C_47tf method_43$a511f7901b(double arg0,double arg1,double arg2,double arg3,double arg4,double arg5,double arg6);

    public native net.C_47Ij method_43$ff59c756f1(net.minecraft.world.World arg0,int arg1,int arg2,int arg3,double arg4,double arg5,double arg6,double arg7,double arg8,double arg9);

    protected native net.C_47rf method_43$54edca04ed(net.C_47UZ arg0);

    public void method_43$e1ae124146(World world, C_478Q c_478Q, C_47UZ c_47UZ, Random random) {
    }

    private native boolean method_43$f523beac1e(net.C_47tf arg0);

    public int method_43$8abf5c6871() {
        return this.field_42;
    }

    public static native void method_43$084aa7ec85(net.minecraft.world.World arg0,net.C_478Q arg1,net.C_47rf arg2);

    public native float method_43$38de05d5ed(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.world.World arg1,net.C_478Q arg2);

    public boolean method_43$aae029aa0a() {
        return this.field_49e;
    }

    public native java.lang.String method_43$0e30dfc966();

    public float method_43$615db595b3(World world, C_478Q c_478Q) {
        return this.field_49m;
    }

    public native boolean method_42i$aae029aa0a();

    public boolean method_42b$aae029aa0a() {
        return true;
    }

    public native boolean method_42k$aae029aa0a();

    public boolean method_42F$aae029aa0a() {
        return this.field_46;
    }

    public boolean method_42D$aae029aa0a() {
        return true;
    }

    public boolean method_42z$aae029aa0a() {
        return false;
    }

    public native boolean method_42X$aae029aa0a();

    public boolean method_429$aae029aa0a() {
        return this.field_49;
    }

    public boolean method_42M$aae029aa0a() {
        return true;
    }

    public native java.lang.String toString();

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
