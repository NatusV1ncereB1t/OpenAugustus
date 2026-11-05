package net;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43S;
import net.C_43r;
import net.C_470K;
import net.C_470d;
import net.C_471E;
import net.C_473d;
import net.C_475y;
import net.C_47TC;
import net.C_47WG;
import net.C_47dR;
import net.C_47dg;
import net.C_47dx;
import net.C_47i;
import net.C_47oP;
import net.C_47rf;
import net.C_47tt;
import net.C_47x_;
import net.C_4f;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47WY implements C_47WG {
    net.C_47rf[] field_46;
    net.C_47rf[] field_43;
    int field_42;
    net.minecraft.entity.player.EntityPlayer field_47;
    net.C_47rf field_40;
    boolean field_45;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;

    public native net.C_47rf method_46$ab1220d05f(int arg0,int arg1);

    public int method_46$0f7a48eca2(int n) {
        return 0;
    }

    public native net.C_47dR method_46$c253b7ae76(net.C_47dR arg0);

    public native void method_46$cf49a59b2e(net.C_47WY arg0);

    public native net.C_47rf method_46$ac4db64966();

    public boolean method_46$aae029aa0a() {
        return false;
    }

    public void method_46$5b9c51f5c2(EntityPlayer entityPlayer) {
    }

    private static native java.lang.Throwable a(java.lang.Throwable arg0);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.String a(int arg0,long arg1);

    private native int method_42$cc36436957(net.C_47rf arg0);

    public native void method_42$4d248f5b6e(net.C_43r arg0,int arg1,boolean arg2,boolean arg3);

    public static int method_41$8abf5c6871() {
        return 9;
    }

    public void method_41$637e1f57ef(int n, C_47rf c_47rf) {
        C_47rf[] c_47rfArray = this.field_46;
        if (n >= c_47rfArray.length) {
            n -= c_47rfArray.length;
            c_47rfArray = this.field_43;
        }
        c_47rfArray[n] = c_47rf;
    }

    public native java.lang.String method_41$0e30dfc966();

    public C_47rf method_41$8da6669f6b(int n) {
        C_47rf[] c_47rfArray = this.field_46;
        if (n >= this.field_46.length) {
            c_47rfArray = this.field_43;
            n -= this.field_46.length;
        }
        if (c_47rfArray[n] != null) {
            C_47rf c_47rf = c_47rfArray[n];
            c_47rfArray[n] = null;
            return c_47rf;
        }
        return null;
    }

    public net.C_47rf method_41$ac4db64966() {
        return this.field_40;
    }

    public native int method_41$20e310763d(net.C_43r arg0,int arg1,int arg2,net.C_47dx arg3);

    public native void method_40$da8c82d5d4();

    public native int method_40$8abf5c6871();

    public native net.C_47oP method_40$8b128fd962();

    public int method_44$8abf5c6871() {
        return 64;
    }

    public native void method_44$29c6f9cdd4(net.C_47dR arg0);

    public void method_44$9bd5253e1e(net.C_47rf value) {
        this.field_40 = value;
    }

    public native void method_48$24a796ab4c(float arg0);

    public boolean method_48$5b55d994ff(int n, C_47rf c_47rf) {
        return true;
    }

    public native void method_48$d00df7729d(int arg0);

    public native void method_48$da8c82d5d4();

    private native int method_48$cc36436957(net.C_47rf arg0);

    public int method_48$8abf5c6871() {
        return 0;
    }

    public native boolean method_49$202261b6ed(net.C_47rf arg0);

    public float method_45$8bfd936c67(C_475y c_475y) {
        float f = 1.0f;
        if (this.field_46[this.field_42] != null) {
            f *= this.field_46[this.field_42].method_42$8bfd936c67(c_475y);
        }
        return f;
    }

    public native boolean method_45$d654fe8697(net.C_43r arg0);

    private native int method_45$d0f75cc625(net.C_43r arg0);

    public native void method_45$da8c82d5d4();

    public native int method_45$8abf5c6871();

    public C_47rf method_47$8da6669f6b(int n) {
        return this.field_43[n];
    }

    public int method_47$8abf5c6871() {
        return this.field_46.length + 4;
    }

    public void method_47$df16004b03(int n, int n2) {
    }

    public void method_47$5b9c51f5c2(EntityPlayer entityPlayer) {
    }

    public native boolean method_47$202261b6ed(net.C_47rf arg0);

    public native boolean method_47$d654fe8697(net.C_43r arg0);

    private native int method_47$243c1be53f(net.C_43r arg0,int arg1);

    public native boolean method_47$731cbed369(net.minecraft.entity.player.EntityPlayer arg0);

    public C_47rf method_43$8da6669f6b(int n) {
        C_47rf[] c_47rfArray = this.field_46;
        if (n >= c_47rfArray.length) {
            n -= c_47rfArray.length;
            c_47rfArray = this.field_43;
        }
        return c_47rfArray[n];
    }

    public native boolean method_43$27a36fdbd7(net.C_475y arg0);

    public void method_43$da8c82d5d4() {
        this.field_45 = true;
    }

}
