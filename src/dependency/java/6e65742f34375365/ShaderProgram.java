package client.render;
import client.setting.Setting;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41l;
import net.C_47Gj;
import net.C_49h;
import net.C_4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class ShaderProgram {
    int field_48;
    int field_40;
    java.lang.String field_41;
    int field_44;
    static boolean field_49;
    java.lang.String field_47;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native int a(long arg0,long arg1);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.String a(int arg0,long arg1);

    public int method_42$2f485d5ba3(String string) {
        return GL20.glGetUniformLocation((int)this.field_40, (CharSequence)string);
    }

    public native void method_42$b73d7ed643(float arg0,long arg1,float arg2);

    private static native int method_42$a35dc661d1(int arg0,long arg1,java.lang.String arg2);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public void method_41$da8c82d5d4() {
        GL20.glUseProgram((int)this.field_40);
    }

    public void method_48$da8c82d5d4() {
        GL20.glUseProgram((int)0);
    }

    private static native java.lang.String method_48$e168718026(long arg0,java.lang.String arg1);

    public void method_45$da8c82d5d4() {
        GL20.glUseProgram((int)0);
        GL20.glDeleteProgram((int)this.field_40);
        GL20.glDeleteShader((int)this.field_44);
        GL20.glDeleteShader((int)this.field_48);
    }

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
