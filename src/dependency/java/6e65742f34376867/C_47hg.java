package net;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_47dx;
import net.C_47oY;
import net.C_4f;
import net.minecraft.entity.EntityLivingBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47hg {
    static org.apache.logging.log4j.Logger field_49;
    int field_46;
    int field_42;
    int field_45;
    boolean field_47;
    boolean field_48;
    boolean field_41;
    boolean field_43;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.String a(int arg0,long arg1);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    public native void method_42$b863d7bff5(net.minecraft.entity.EntityLivingBase arg0);

    public void method_42$f633c984d8(boolean value) {
        this.field_41 = value;
    }

    public boolean method_40$aae029aa0a() {
        return this.field_48;
    }

    public int method_40$8abf5c6871() {
        return this.field_42;
    }

    public boolean method_44$aae029aa0a() {
        return this.field_41;
    }

    private int method_44$8abf5c6871() {
        return --this.field_42;
    }

    public void method_48$f633c984d8(boolean value) {
        this.field_47 = value;
    }

    public static native net.C_47hg method_48$70c439e18a(net.C_47dx arg0);

    public int method_49$8abf5c6871() {
        return this.field_46;
    }

    public native void method_49$e13a52819e(net.C_47hg arg0);

    public String method_45$0e30dfc966() {
        return C_47oY.field_461[this.field_46].method_42$0e30dfc966();
    }

    public native boolean method_47$48d85e6946(net.minecraft.entity.EntityLivingBase arg0);

    public int method_47$8abf5c6871() {
        return this.field_45;
    }

    public boolean method_43$aae029aa0a() {
        return this.field_43;
    }

    public native net.C_47dx method_43$a5b2086ed4(net.C_47dx arg0);

    public native boolean equals(java.lang.Object arg0);

    public native java.lang.String toString();

    public int hashCode() {
        return this.field_46;
    }

}
