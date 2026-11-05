package net;
import client.Client;
import client.ClientGlobals;
import de.florianmichael.dietrichevents2.StateTypes;
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
import net.C_40x;
import net.C_41Z;
import net.C_425;
import net.C_42V;
import net.C_42k;
import net.C_43F;
import net.C_45J;
import net.C_45V;
import net.C_473U;
import net.C_4747;
import net.C_475y;
import net.C_477Y;
import net.C_478Q;
import net.C_47Aa;
import net.C_47EP;
import net.C_47Fr;
import net.C_47IT;
import net.C_47Ij;
import net.C_47Is;
import net.C_47K6;
import net.C_47UZ;
import net.C_47WF;
import net.C_47WM;
import net.C_47Xe;
import net.C_47aZ;
import net.C_47cu;
import net.C_47rf;
import net.C_47tf;
import net.C_47vh;
import net.C_47xQ;
import net.C_484;
import net.C_49Q;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_40g {
    net.minecraft.client.Minecraft field_43W;
    net.C_47K6 field_44;
    net.C_478Q field_45;
    net.C_47rf field_48;
    float field_41;
    float field_43;
    int field_46;
    boolean field_42;
    net.C_47IT field_47;
    int field_40;
    net.C_47cu field_49;
    static long a;
    static java.lang.String b;
    static java.lang.Object[] c;
    static java.lang.String[] d;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public void method_46$24a796ab4c(float value) {
        this.field_41 = value;
    }

    public native void method_46$da8c82d5d4();

    public native boolean method_46$04c095064e(net.C_478Q arg0,net.C_484 arg1);

    public native boolean method_46$aae029aa0a();

    public net.C_47IT method_46$73d174f422() {
        return this.field_47;
    }

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native int a(long arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private native boolean method_42$91754b766b(net.C_478Q arg0);

    public static native void method_42$64d3e0e0d8(net.minecraft.client.Minecraft arg0,net.C_40g arg1,net.C_478Q arg2,net.C_484 arg3);

    public native boolean method_42$04c095064e(net.C_478Q arg0,net.C_484 arg1);

    public native boolean method_42$aae029aa0a();

    public native net.C_47rf method_42$f0ddb617a2(int arg0,int arg1,int arg2,int arg3,net.minecraft.entity.player.EntityPlayer arg4);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public boolean method_41$aae029aa0a() {
        return this.field_47.method_47$aae029aa0a();
    }

    public boolean method_40$aae029aa0a() {
        return this.field_47.method_45$aae029aa0a();
    }

    public native boolean method_40$6e587eaa78(net.C_478Q arg0,net.C_484 arg1,net.C_47rf arg2);

    public native void method_40$d1c34605ae(net.C_47rf arg0,int arg1);

    public native boolean method_40$04c095064e(net.C_478Q arg0,net.C_484 arg1);

    public native float method_44$bc607678b6();

    public EntityPlayerSP method_44$a7b6c71ac4(World world, C_49Q c_49Q) {
        return new EntityPlayerSP(this.field_43W, world, this.field_44, c_49Q);
    }

    public native boolean method_44$79cd781ab9(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.entity.Entity arg1);

    public native boolean method_44$70851ff417(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.world.World arg1,net.C_47rf arg2);

    public native boolean method_44$aae029aa0a();

    public native boolean method_48$c760cd9bb7(net.minecraft.client.entity.EntityPlayerSP arg0,net.minecraft.client.multiplayer.WorldClient arg1,net.C_47rf arg2,net.C_478Q arg3,net.C_484 arg4,net.C_47tf arg5);

    public void method_48$df16004b03(int n, int n2) {
        this.field_44.method_45$631790539f((C_473U)new C_42k(n, n2));
    }

    public boolean method_48$aae029aa0a() {
        return this.field_47.method_45$aae029aa0a();
    }

    public void method_48$5b9c51f5c2(EntityPlayer entityPlayer) {
        entityPlayer.field_48h = -180.0f;
    }

    public float method_48$bc607678b6() {
        return this.field_41;
    }

    public native boolean method_49$92403e1770(net.C_478Q arg0,net.C_484 arg1,int arg2);

    public native void method_49$9bd5253e1e(net.C_47rf arg0);

    public native void method_45$f633c984d8(boolean arg0);

    public native void method_45$da8c82d5d4();

    public native void method_45$1e47fea583(net.C_47IT arg0);

    public boolean method_45$aae029aa0a() {
        return this.field_47.method_47$aae029aa0a();
    }

    public native boolean method_45$7e3e6c1340(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.entity.Entity arg1,net.C_47Ij arg2);

    public void method_47$5b9c51f5c2(EntityPlayer entityPlayer) {
        this.method_46$da8c82d5d4();
        this.field_44.method_45$631790539f(new C_45J(C_40x.RELEASE_USE_ITEM, C_478Q.field_44, C_484.DOWN));
        entityPlayer.method_47C$da8c82d5d4();
    }

    public boolean method_47$aae029aa0a() {
        return this.field_42;
    }

    public native void method_43$da8c82d5d4();

    public void method_43$5b9c51f5c2(EntityPlayer entityPlayer) {
        this.field_47.method_47$c0b73c5562(entityPlayer.field_45);
    }

    public native void method_43$8cfdf5ae53(net.minecraft.entity.player.EntityPlayer arg0,net.minecraft.entity.Entity arg1);

    public native boolean method_43$aae029aa0a();

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
