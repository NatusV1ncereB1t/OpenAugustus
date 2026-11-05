package net;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_47K;
import net.C_47WG;
import net.C_47WY;
import net.C_47rf;
import net.C_47sT;
import net.C_47sk;
import net.C_49z;
import net.C_4f;
import net.minecraft.entity.player.EntityPlayer;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47gG {
    java.util.List field_47;
    java.util.List field_46;
    int field_43;
    short field_40;
    int field_41;
    int field_42;
    java.util.Set field_48;
    java.util.List field_44;
    java.util.Set field_49;
    static long a;
    static java.lang.String c;

    public void method_46$c924e60368(C_47WG c_47WG) {
        this.method_47$da8c82d5d4();
    }

    public C_47sT method_46$4c10532da1(int n) {
        return (C_47sT)this.field_46.get(n);
    }

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException arg0);

    public native void method_42$5b9c51f5c2(net.minecraft.entity.player.EntityPlayer arg0);

    public native net.C_47rf method_41$539efcc5a4(int arg0,int arg1,int arg2,net.minecraft.entity.player.EntityPlayer arg3);

    native public short method_41$52b5c3d8dc(C_47WY c_47WY);

    protected void method_41$843bbefb18(int n, int n2, boolean bl, EntityPlayer entityPlayer) {
        this.method_41$539efcc5a4(n, n2, 1, entityPlayer);
    }

    public static int method_41$7cf53c2591(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    public boolean method_41$85c00d53ec(EntityPlayer entityPlayer, int n) {
        return false;
    }

    public void method_40$637e1f57ef(int n, C_47rf c_47rf) {
        this.method_46$4c10532da1(n).method_48$9bd5253e1e(c_47rf);
    }

    public boolean method_40$e69c302f65(C_47rf c_47rf, C_47sT c_47sT) {
        return true;
    }

    public native net.C_47sT method_44$b970eba52d(net.C_47WG arg0,int arg1);

    public native net.C_47rf method_44$58893a92a6(net.minecraft.entity.player.EntityPlayer arg0,int arg1);

    public static int method_44$0f7a48eca2(int n) {
        return n >> 2 & 3;
    }

    public native void method_44$90bb91024f(net.C_47rf[] arg0);

    public static native boolean method_44$6ebbc0fdfc(int arg0,net.minecraft.entity.player.EntityPlayer arg1);

    native protected C_47sT method_44$496ed4cea1(C_47sT c_47sT);

    public void method_48$4322f41a52(C_49z c_49z) {
        this.field_44.remove(c_49z);
    }

    public static native void method_48$c1c6fef55c(java.util.Set arg0,int arg1,net.C_47rf arg2,int arg3);

    public static int method_48$0f7a48eca2(int n) {
        return n & 3;
    }

    protected native boolean method_48$8f71bb0ec9(net.C_47rf arg0,int arg1,int arg2,boolean arg3);

    protected void method_49$da8c82d5d4() {
        this.field_42 = 0;
        this.field_48.clear();
    }

    public void method_49$df16004b03(int n, int n2) {
    }

    public native boolean method_49$731cbed369(net.minecraft.entity.player.EntityPlayer arg0);

    public native java.util.List method_49$3f0615080b();

    public boolean method_45$4c10225645(C_47sT c_47sT) {
        return true;
    }

    public static native int method_45$3794fb634e(net.C_47WG arg0);

    public native void method_47$da8c82d5d4();

    public static native boolean method_47$f796a8df5f(net.C_47sT arg0,net.C_47rf arg1,boolean arg2);

    public native void method_43$8b3d847d1c(net.minecraft.entity.player.EntityPlayer arg0,boolean arg1);

    public native void method_43$4322f41a52(net.C_49z arg0);

    public static native int method_43$71d99ece1b(net.C_47K arg0);

}
