package net;
import client.Client;
import client.module.ModuleManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import net.C_43E;
import net.C_43F;
import net.C_43L;
import net.C_43g;
import net.C_43r;
import net.C_43s;
import net.C_43t;
import net.C_475H;
import net.C_475P;
import net.C_475_;
import net.C_475y;
import net.C_478Q;
import net.C_47E1;
import net.C_47E2;
import net.C_47E8;
import net.C_47EB;
import net.C_47EF;
import net.C_47EH;
import net.C_47EI;
import net.C_47EM;
import net.C_47EP;
import net.C_47ER;
import net.C_47ES;
import net.C_47ET;
import net.C_47EU;
import net.C_47EV;
import net.C_47EY;
import net.C_47EZ;
import net.C_47Eb;
import net.C_47Ef;
import net.C_47Eg;
import net.C_47Eh;
import net.C_47Ep;
import net.C_47Er;
import net.C_47Ev;
import net.C_47Ex;
import net.C_47Jk;
import net.C_47Jn;
import net.C_47Ou;
import net.C_47UZ;
import net.C_47rf;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_474i {
    static java.util.HashSet field_42;
    static java.util.HashSet field_40;
    static int field_44;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static native boolean method_42$133d77006a(long arg0,net.C_478Q arg1);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static void method_41$d00df7729d(int value) {
        C_474i.field_44 = value;
    }

    public static native boolean method_40$2488324e9f(net.C_478Q arg0,long arg1);

    public static int method_40$8abf5c6871() {
        return C_474i.field_44;
    }

    public static native boolean method_48$2488324e9f(net.C_478Q arg0,long arg1);

    public static native boolean method_49$c8e73c711c(long arg0,net.C_47rf arg1);

    public static native int method_49$8abf5c6871();

    public static native boolean method_45$0dd78e0064(long arg0);

    public static native boolean method_47$133d77006a(long arg0,net.C_478Q arg1);

    public static native boolean method_47$5913085b6d(net.C_47rf arg0,long arg1,boolean arg2);

    public static boolean method_47$27a36fdbd7(C_475y c_475y) {
        return field_42.contains(c_475y.getClass());
    }

    public static native boolean method_43$f63b8f5000(double arg0,double arg1,long arg2,double arg3);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
