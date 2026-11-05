package net;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42R;
import net.C_43r;
import net.C_43u;
import net.C_46p;
import net.C_470K;
import net.C_475y;
import net.C_476h;
import net.C_478Q;
import net.C_47DW;
import net.C_47Dk;
import net.C_47Pf;
import net.C_47UX;
import net.C_47Ur;
import net.C_47V7;
import net.C_47aw;
import net.C_47bL;
import net.C_47dR;
import net.C_47dg;
import net.C_47dx;
import net.C_47gK;
import net.C_47mu;
import net.C_47oP;
import net.C_47ru;
import net.C_47yk;
import net.C_484;
import net.C_4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47rf {
    static java.text.DecimalFormat field_41;
    int field_46;
    int field_47;
    int field_49E;
    net.C_43r field_49;
    net.C_47dx field_44;
    int field_40;
    java.lang.String field_42;
    net.C_47aw field_495;
    net.C_475y field_49b;
    boolean field_45;
    net.C_475y field_49o;
    boolean field_49z;
    int field_43;
    com.mojang.authlib.GameProfile field_493;
    net.minecraft.util.ResourceLocation field_48;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;

    public int method_46$8abf5c6871() {
        return this.field_46;
    }

    public native boolean method_46$27a36fdbd7(net.C_475y arg0);

    public static native net.C_47rf method_46$095026a21d(net.C_47rf arg0);

    public native boolean method_46$aae029aa0a();

    public native void method_46$d00df7729d(int arg0);

    public native java.util.List method_46$5e94c1d57e(net.minecraft.entity.player.EntityPlayer arg0,boolean arg1);

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    public float method_42$8bfd936c67(C_475y c_475y) {
        return this.method_48$dbd570a038().method_46$2a6db11640(this, c_475y);
    }

    public native boolean method_42$27a36fdbd7(net.C_475y arg0);

    public native net.C_47rf method_42$ac4db64966();

    public native void method_42$c0c8d7b47b(net.minecraft.entity.EntityLivingBase arg0,net.minecraft.entity.player.EntityPlayer arg1);

    public native boolean method_42$aae029aa0a();

    public int method_42$8abf5c6871() {
        return this.field_49.method_43$8abf5c6871();
    }

    public native net.C_47dx method_42$4ec9021f34(java.lang.String arg0,boolean arg1);

    public static native boolean method_41$a6d340e794(net.C_47rf arg0,net.C_47rf arg1);

    public boolean method_41$aae029aa0a() {
        return this.field_49.method_42$aae029aa0a();
    }

    public native net.C_47dR method_41$a2e65894e1();

    public void method_41$e2a2fa31cc(World world, EntityPlayer entityPlayer, int n) {
        this.method_48$dbd570a038().method_43$03bc5df788(this, world, entityPlayer, n);
    }

    public native boolean method_41$3977673906(int arg0,java.util.Random arg1);

    public boolean method_40$aae029aa0a() {
        return this.method_48$dbd570a038().method_41$202261b6ed(this);
    }

    public int method_40$8abf5c6871() {
        return this.field_40;
    }

    public C_47bL method_40$e375ce997d() {
        return this.method_48$dbd570a038().method_45$7701aa6581(this);
    }

    public native void method_40$d00df7729d(int arg0);

    public com.mojang.authlib.GameProfile method_40$cd99b948a0() {
        return this.field_493;
    }

    public net.C_47aw method_40$5b4f13ae2f() {
        return this.field_495;
    }

    public void method_44$e2a2fa31cc(World world, EntityPlayer entityPlayer, int n) {
        entityPlayer.method_41$8ebeb8dd1e(C_47yk.field_48h[C_43r.method_41$d0f75cc625(this.field_49)], n);
        this.field_49.method_41$8518176e1e(this, world, entityPlayer);
    }

    public native java.lang.String method_44$0e30dfc966();

    public int method_44$8abf5c6871() {
        return this.method_48$dbd570a038().method_47$8abf5c6871();
    }

    public native void method_44$6c40e86184(net.C_47dx arg0);

    public void method_44$f8048eb66a(net.C_43r value) {
        this.field_49 = value;
    }

    public static native boolean method_44$a6d340e794(net.C_47rf arg0,net.C_47rf arg1);

    public native void method_44$da8c82d5d4();

    public native boolean method_44$aae029aa0a();

    public boolean method_44$d0ad116ddf(EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return this.field_49.method_46$63ad45f03b(this, entityPlayer, entityLivingBase);
    }

    public native net.C_47rf method_48$c5544559a4(java.lang.String arg0);

    public native boolean method_48$aae029aa0a();

    public native net.C_47dx method_48$a5b2086ed4(net.C_47dx arg0);

    public int method_48$8abf5c6871() {
        return this.method_48$dbd570a038().method_46$cc36436957(this);
    }

    public void method_48$6c40e86184(C_47dx c_47dx) {
        this.field_42 = null;
        this.field_44 = c_47dx;
    }

    public native void method_48$6d0d0f3f24(java.lang.String arg0,net.C_47dg arg1);

    public native void method_48$e37349d05b(net.minecraft.world.World arg0,net.C_475y arg1,net.C_478Q arg2,net.minecraft.entity.player.EntityPlayer arg3);

    private native void method_48$da8c82d5d4();

    public net.C_43r method_48$dbd570a038() {
        return this.field_49;
    }

    public void method_48$d00df7729d(int value) {
        this.field_46 = value;
    }

    public boolean method_48$27a36fdbd7(C_475y c_475y) {
        return this.field_49.method_48$27a36fdbd7(c_475y);
    }

    public net.C_47dx method_48$1e8c852349() {
        return this.field_44;
    }

    public boolean method_48$202261b6ed(C_47rf c_47rf) {
        return this.method_47$202261b6ed(c_47rf);
    }

    public native void method_49$7e50618615(int arg0,net.minecraft.entity.EntityLivingBase arg1);

    public native boolean method_49$aae029aa0a();

    public native int method_49$8abf5c6871();

    public native net.C_47oP method_49$8b128fd962();

    public native boolean method_49$202261b6ed(net.C_47rf arg0);

    public String method_49$0e30dfc966() {
        return this.field_49.method_40$fd19b7225e(this);
    }

    public void method_49$976dfc0a3b(com.mojang.authlib.GameProfile value) {
        this.field_493 = value;
    }

    public native void method_49$a99b3edf9d(net.C_47DW arg0,int arg1);

    public C_47mu method_49$a5dba4d54a() {
        return this.method_48$dbd570a038().method_46$1e1da26a3e(this);
    }

    public net.minecraft.util.ResourceLocation method_49$8d5288ab3b() {
        return this.field_48;
    }

    public native com.google.common.collect.Multimap method_49$a6c5b80719();

    public boolean method_45$aae029aa0a() {
        return this.method_48$dbd570a038().method_47$aae029aa0a();
    }

    public void method_45$fbbbe3c71b(net.minecraft.util.ResourceLocation value) {
        this.field_48 = value;
    }

    public int method_47$8abf5c6871() {
        return this.field_43;
    }

    public void method_47$c76058d366(net.C_47aw value) {
        this.field_495 = value;
    }

    public native boolean method_47$aae029aa0a();

    public native net.C_47rf method_47$8da6669f6b(int arg0);

    public C_47rf method_47$34b44fb3ef(World world, EntityPlayer entityPlayer) {
        return this.method_48$dbd570a038().method_49$d79f5d2c8a(this, world, entityPlayer);
    }

    private native boolean method_47$202261b6ed(net.C_47rf arg0);

    public static native net.C_47rf method_47$d52849b455(net.C_47dx arg0);

    public native boolean method_43$eda59072a7(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.world.World arg1,net.C_478Q arg2,net.C_484 arg3,float arg4,float arg5,float arg6);

    public C_47rf method_43$34b44fb3ef(World world, EntityPlayer entityPlayer) {
        return this.method_48$dbd570a038().method_45$d79f5d2c8a(this, world, entityPlayer);
    }

    public native void method_43$70d804995c(net.minecraft.world.World arg0,net.minecraft.entity.Entity arg1,int arg2,boolean arg3);

    public native boolean method_43$aae029aa0a();

    public int method_43$8abf5c6871() {
        return this.field_40;
    }

    public static native boolean method_43$a6d340e794(net.C_47rf arg0,net.C_47rf arg1);

    public native boolean method_49e$aae029aa0a();

    public native java.lang.String toString();

}
