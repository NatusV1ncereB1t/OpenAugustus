package net;
import cc.C_40Z;
import com.google.common.base.Function;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41N;
import net.C_42F;
import net.C_42d;
import net.C_430;
import net.C_432;
import net.C_433;
import net.C_435;
import net.C_436;
import net.C_437;
import net.C_438;
import net.C_439;
import net.C_43A;
import net.C_43B;
import net.C_43E;
import net.C_43F;
import net.C_43H;
import net.C_43I;
import net.C_43J;
import net.C_43K;
import net.C_43L;
import net.C_43M;
import net.C_43N;
import net.C_43O;
import net.C_43P;
import net.C_43Q;
import net.C_43R;
import net.C_43S;
import net.C_43T;
import net.C_43U;
import net.C_43W;
import net.C_43X;
import net.C_43Y;
import net.C_43Z;
import net.C_43_;
import net.C_43a;
import net.C_43c;
import net.C_43d;
import net.C_43f;
import net.C_43g;
import net.C_43h;
import net.C_43j;
import net.C_43k;
import net.C_43l;
import net.C_43m;
import net.C_43n;
import net.C_43p;
import net.C_43q;
import net.C_43s;
import net.C_43t;
import net.C_43u;
import net.C_43v;
import net.C_43w;
import net.C_43x;
import net.C_43y;
import net.C_43z;
import net.C_451;
import net.C_454;
import net.C_45D;
import net.C_45F;
import net.C_45G;
import net.C_45S;
import net.C_45U;
import net.C_45V;
import net.C_45Y;
import net.C_45b;
import net.C_45e;
import net.C_45i;
import net.C_45o;
import net.C_45z;
import net.C_461;
import net.C_472q;
import net.C_473h;
import net.C_474w;
import net.C_475y;
import net.C_477h;
import net.C_478Q;
import net.C_47Aw;
import net.C_47Ij;
import net.C_47KW;
import net.C_47RW;
import net.C_47SO;
import net.C_47TN;
import net.C_47UX;
import net.C_47Wn;
import net.C_47aw;
import net.C_47ax;
import net.C_47bL;
import net.C_47dx;
import net.C_47es;
import net.C_47jx;
import net.C_47mu;
import net.C_47no;
import net.C_47oB;
import net.C_47oY;
import net.C_47rf;
import net.C_47sU;
import net.C_47sk;
import net.C_47ul;
import net.C_47zi;
import net.C_484;
import net.C_49o;
import net.C_4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_43r {
    static net.C_47oB field_43;
    static java.util.Map field_46;
    static java.util.UUID field_46b;
    net.C_47es field_47;
    int field_41;
    static java.util.Random field_49;
    int field_44;
    int field_45;
    boolean field_48;
    boolean field_40;
    net.C_43r field_42;
    java.lang.String field_46W;
    java.lang.String field_46s;
    static long a;
    static java.lang.String[] d;
    static java.lang.String[] e;
    static java.util.Map f;

    private static native java.lang.Exception b(java.lang.Exception arg0);

    public native net.C_47mu method_46$1e1da26a3e(net.C_47rf arg0);

    private static void method_46$b896d31457(int n, ResourceLocation resourceLocation, C_43r c_43r) {
        field_43.method_40$6b8d4efbda(n, (Object)resourceLocation, (Object)c_43r);
    }

    public boolean method_46$63ad45f03b(C_47rf c_47rf, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return false;
    }

    public int method_46$cc36436957(C_47rf c_47rf) {
        return 0;
    }

    public boolean method_46$aae029aa0a() {
        return this.field_48;
    }

    public float method_46$2a6db11640(C_47rf c_47rf, C_475y c_475y) {
        return 1.0f;
    }

    public native java.lang.String method_46$fd19b7225e(net.C_47rf arg0);

    public static C_43r method_46$4158f44b4a(int n) {
        return (C_43r)field_43.method_41$915e32db46(n);
    }

    public void method_46$2813ec2223(C_47rf c_47rf, World world, Entity entity, int n, boolean bl) {
    }

    public boolean method_46$e8e0687f2a(C_47dx c_47dx) {
        return false;
    }

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    public C_43r method_42$c041c61fce(String string) {
        this.field_46s = string;
        return this;
    }

    public boolean method_42$aae029aa0a() {
        return this.field_40;
    }

    public native java.lang.String method_42$0e30dfc966();

    public void method_42$f674098a46(C_43r c_43r, C_47es c_47es, List list) {
        list.add(new C_47rf(c_43r, 1, 0));
    }

    public boolean method_41$aae029aa0a() {
        return true;
    }

    public void method_41$8518176e1e(C_47rf c_47rf, World world, EntityPlayer entityPlayer) {
    }

    public static native int method_41$d0f75cc625(net.C_43r arg0);

    public int method_41$0f7a48eca2(int n) {
        return 0;
    }

    public boolean method_41$202261b6ed(C_47rf c_47rf) {
        return c_47rf.method_49e$aae029aa0a();
    }

    public native boolean method_40$aae029aa0a();

    protected C_43r method_40$4158f44b4a(int n) {
        this.field_45 = n;
        return this;
    }

    public native java.lang.String method_40$fd19b7225e(net.C_47rf arg0);

    public net.C_47es method_40$d9bb815435() {
        return this.field_47;
    }

    public native boolean method_44$aae029aa0a();

    private static void method_44$d6a9499d27(int n, String string, C_43r c_43r) {
        C_43r.method_46$b896d31457(n, new ResourceLocation(string), c_43r);
    }

    public String method_44$fd19b7225e(C_47rf c_47rf) {
        return this.field_46W;
    }

    public static native void method_44$da8c82d5d4();

    protected C_43r method_44$c041c61fce(String string) {
        this.field_46W = string;
        return this;
    }

    public boolean method_44$39768d50e2(C_47rf c_47rf, EntityPlayer entityPlayer, World world, C_478Q c_478Q, C_484 c_484, float f, float f2, float f3) {
        return false;
    }

    protected C_43r method_48$31e6e23013(boolean bl) {
        this.field_40 = bl;
        return this;
    }

    public int method_48$8abf5c6871() {
        return 0;
    }

    public boolean method_48$27a36fdbd7(C_475y c_475y) {
        return false;
    }

    public native boolean method_48$202261b6ed(net.C_47rf arg0);

    public boolean method_48$aae029aa0a() {
        return false;
    }

    public boolean method_48$943e8cd1c0(C_47rf c_47rf, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        return false;
    }

    public C_43r method_48$dbd570a038() {
        this.field_48 = true;
        return this;
    }

    public Multimap method_49$a6c5b80719() {
        return HashMultimap.create();
    }

    public static native net.C_43r method_49$c041c61fce(java.lang.String arg0);

    public C_47rf method_49$d79f5d2c8a(C_47rf c_47rf, World world, EntityPlayer entityPlayer) {
        return c_47rf;
    }

    protected native net.C_47Ij method_49$9fed217ccd(net.minecraft.world.World arg0,net.minecraft.entity.player.EntityPlayer arg1,boolean arg2);

    public boolean method_49$a6d340e794(C_47rf c_47rf, C_47rf c_47rf2) {
        return false;
    }

    protected static void method_49$ff1c6b84c8(C_475y c_475y, C_43r c_43r) {
        C_43r.method_46$b896d31457(C_475y.method_48$dd4913a2cb(c_475y), (ResourceLocation)C_475y.field_49H.method_42$262c527aaf((Object)c_475y), c_43r);
        field_46.put(c_475y, c_43r);
    }

    public static C_43r method_49$13724ad5d4(C_475y c_475y) {
        return (C_43r)field_46.get(c_475y);
    }

    public boolean method_49$773543eb2c(C_47rf c_47rf, World world, C_475y c_475y, C_478Q c_478Q, EntityLivingBase entityLivingBase) {
        return false;
    }

    public int method_45$d412039beb(C_47rf c_47rf, int n) {
        return 0xFFFFFF;
    }

    public boolean method_45$aae029aa0a() {
        return false;
    }

    public net.C_43r method_45$dbd570a038() {
        return this.field_42;
    }

    public C_47bL method_45$7701aa6581(C_47rf c_47rf) {
        return C_47bL.NONE;
    }

    public C_47rf method_45$d79f5d2c8a(C_47rf c_47rf, World world, EntityPlayer entityPlayer) {
        return c_47rf;
    }

    public C_43r method_45$38fa0af477(C_47es c_47es) {
        this.field_47 = c_47es;
        return this;
    }

    public int method_47$8abf5c6871() {
        return this.field_44;
    }

    public native boolean method_47$202261b6ed(net.C_47rf arg0);

    public void method_47$cb96fcecc7(C_47rf c_47rf, EntityPlayer entityPlayer, List list, boolean bl) {
    }

    public boolean method_47$aae029aa0a() {
        return false;
    }

    public C_43r method_47$4158f44b4a(int n) {
        this.field_44 = n;
        return this;
    }

    public native java.lang.String method_47$fd19b7225e(net.C_47rf arg0);

    public void method_43$03bc5df788(C_47rf c_47rf, World world, EntityPlayer entityPlayer, int n) {
    }

    private static void method_43$6ddea6d022(C_475y c_475y) {
        C_43r.method_49$ff1c6b84c8(c_475y, (C_43r)new C_43F(c_475y));
    }

    public int method_43$8abf5c6871() {
        return this.field_45;
    }

    public C_43r method_43$a31962479e(C_43r c_43r) {
        this.field_42 = c_43r;
        return this;
    }

}
