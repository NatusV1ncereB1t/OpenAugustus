package net;
import client.Client;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.StringFormat;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.ColorHandling;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.DeserializerUnknownHandling;
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
import net.C_42C;
import net.C_47LS;
import net.C_47LU;
import net.C_47Ou;
import net.C_47oP;
import net.C_47v_;
import net.C_4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_475e {
    static int field_44;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public static native void method_46$d07b98bfef(long arg0,java.lang.String arg1);

    public static native java.lang.String method_46$3d2342c78f(int arg0,java.lang.String arg1,int arg2,java.lang.String arg3);

    private static native void a();

    private static native int a(long arg0,long arg1);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.String a(int arg0,long arg1);

    public static void method_42$d00df7729d(int value) {
        C_475e.field_44 = value;
    }

    public static C_47oP method_42$d58d24f698(String string) {
        TextComponent textComponent = StringFormat.vanilla().fromString(string, ColorHandling.RESET, DeserializerUnknownHandling.WHITE);
        return C_47v_.method_45$d58d24f698((String)TextComponentSerializer.V1_8.serialize(textComponent));
    }

    public static native void method_42$03c00c140c(short arg0,double arg1,char arg2,int arg3);

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    private static native void method_41$2cb02288e4(net.C_47oP arg0);

    public static int method_40$8abf5c6871() {
        return C_475e.field_44;
    }

    public static native int method_48$8abf5c6871();

    public static native void method_49$f5ed36ec7e(long arg0,float arg1);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
