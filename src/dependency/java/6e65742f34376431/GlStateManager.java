package net.minecraft.client.renderer;
import cc.C_40Z;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.C_42_;
import net.C_473J;
import net.C_473j;
import net.C_474f;
import net.C_476L;
import net.C_47F1;
import net.C_47F;
import net.C_47Gp;
import net.C_47Il;
import net.C_47Rl;
import net.C_47WK;
import net.C_47jd;
import net.C_47m8;
import net.C_47mU;
import net.C_47rK;
import net.C_47rp;
import net.C_47tW;
import net.C_47ud;
import net.C_47vA;
import net.C_47vQ;
import net.C_47vl;
import net.C_47xn;
import net.C_48G;
import net.C_49y;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class GlStateManager {
    static net.C_47vl field_40;
    static net.C_49y field_496;
    static net.C_49y[] field_49X;
    static net.C_47Gp field_49t;
    static net.C_474f field_495;
    static net.C_47m8 field_49E;
    static net.C_47jd field_42;
    static net.C_473J field_45;
    static net.C_47vA field_49;
    static net.C_47F1 field_49u;
    static net.C_42_ field_48;
    static net.C_47xn field_49H;
    static net.C_476L field_498;
    static net.C_49y field_41;
    static int field_49m;
    static net.C_47rK[] field_49q;
    static int field_49F;
    static net.C_49y field_44;
    static net.C_47WK field_43;
    static net.C_47tW field_49K;
    static boolean field_49S;
    static net.C_47rp field_49g;
    static net.C_47Rl field_492;
    static net.C_47rp field_49p;
    static net.C_47F field_47;
    static boolean field_46;

    public static native void method_46$d00df7729d(int arg0);

    public static void method_46$099cf68bd1(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        GL11.glTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (IntBuffer)intBuffer);
    }

    public static int method_46$cabccf1c64(int n, int n2, int n3) {
        return GL11.glGetTexLevelParameteri((int)n, (int)n2, (int)n3);
    }

    public static native void method_46$3ebc9ac54d(int arg0,float arg1);

    native public static void method_46$da8c82d5d4();

    public static int method_46$8abf5c6871() {
        return GlStateManager.field_49u.field_41;
    }

    public static void method_46$f633c984d8(boolean bl) {
        GlStateManager.field_42.field_42.method_49$f633c984d8(bl);
    }

    public static boolean method_46$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49t.field_49);
    }

    public static void method_46$3d68838c3b(IntBuffer intBuffer) {
        intBuffer.rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            int n = intBuffer.get();
            GlStateManager.method_46$d00df7729d(n);
        }
        intBuffer.rewind();
    }

    public static native void method_46$d2cc908379(int arg0,java.nio.IntBuffer arg1,java.nio.IntBuffer arg2);

    private static native cc.C_40Z a(cc.C_40Z arg0);

    public static void method_42$df16004b03(int n, int n2) {
        GL11.glDeleteLists((int)n, (int)n2);
    }

    public static void method_42$c151fe78a0(float f, float f2, float f3) {
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
    }

    public static float method_42$bc607678b6() {
        return GlStateManager.field_40.field_43;
    }

    public static boolean method_42$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)field_44);
    }

    public static native void method_42$702bafdc36(net.C_47Rl arg0);

    public static native void method_42$24a796ab4c(float arg0);

    public static native void method_42$d00df7729d(int arg0);

    public static void method_42$da8c82d5d4() {
        GlStateManager.field_49E.field_41.method_40$da8c82d5d4();
    }

    public static void method_42$f2b6a9055b(float f, float f2, float f3, float f4) {
        GL11.glRotatef((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void method_42$099cf68bd1(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (IntBuffer)intBuffer);
    }

    public static void method_42$42cf812248(int n, int n2, int n3, int n4) {
        GL11.glViewport((int)n, (int)n2, (int)n3, (int)n4);
    }

    private static native net.C_47ud method_42$89c9e31ac3(net.C_473j arg0);

    public static int method_42$8abf5c6871() {
        return GlStateManager.field_45.field_46;
    }

    public static native void method_42$f633c984d8(boolean arg0);

    public static native void method_41$d00df7729d(int arg0);

    public static int method_41$8abf5c6871() {
        return GlStateManager.field_42.field_43;
    }

    public static native void method_41$dfa68fb44f(net.C_47F arg0);

    public static void method_41$da8c82d5d4() {
        field_496.method_48$da8c82d5d4();
    }

    public static float method_41$bc607678b6() {
        return GlStateManager.field_42.field_49;
    }

    public static void method_41$42cf812248(int n, int n2, int n3, int n4) {
        GL11.glTexCoordPointer((int)n, (int)n2, (int)n3, (long)n4);
    }

    public static boolean method_41$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49u.field_42);
    }

    public static native void method_40$a132a28a29(net.C_473j arg0,int arg1);

    public static int method_40$8abf5c6871() {
        return GlStateManager.field_49q[GlStateManager.field_49m].field_42;
    }

    public static native void method_40$d00df7729d(int arg0);

    public static void method_40$c0b82825d0(FloatBuffer floatBuffer) {
        GL11.glMultMatrix((FloatBuffer)floatBuffer);
    }

    public static void method_40$df16004b03(int n, int n2) {
        GL11.glFogi((int)n, (int)n2);
    }

    public static native void method_40$24a796ab4c(float arg0);

    public static void method_40$c12925b3e5(C_473j c_473j) {
        GlStateManager.method_42$89c9e31ac3((C_473j)c_473j).field_43.method_48$da8c82d5d4();
    }

    public static void method_40$42cf812248(int n, int n2, int n3, int n4) {
        GL11.glVertexPointer((int)n, (int)n2, (int)n3, (long)n4);
    }

    public static boolean method_40$aae029aa0a() {
        return GlStateManager.field_49E.field_47;
    }

    public static float method_40$bc607678b6() {
        return GlStateManager.field_42.field_48;
    }

    public static void method_40$7cc134dc8c(int n, int n2, int n3, ByteBuffer byteBuffer) {
        GL11.glTexCoordPointer((int)n, (int)n2, (int)n3, (ByteBuffer)byteBuffer);
    }

    public static void method_40$da8c82d5d4() {
        GlStateManager.field_49.field_48.method_40$da8c82d5d4();
    }

    public static native void method_460$d00df7729d(int arg0);

    public static void method_46_$d00df7729d(int n) {
        GlStateManager.field_49q[n].field_46.method_40$da8c82d5d4();
    }

    public static void method_44$b4afcfee9b(int n, FloatBuffer floatBuffer) {
        GL11.glFog((int)n, (FloatBuffer)floatBuffer);
    }

    public static void method_44$32e26becb0(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        GL11.glCopyTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8);
    }

    public static native void method_44$3d68838c3b(java.nio.IntBuffer arg0);

    public static void method_44$d00df7729d(int n) {
        field_49X[n].method_40$da8c82d5d4();
    }

    public static int method_44$0f7a48eca2(int n) {
        return GlStateManager.field_49q[n].field_42;
    }

    public static void method_44$1d69891222(int n, int n2, int n3, int n4, IntBuffer intBuffer) {
        GL11.glGetTexImage((int)n, (int)n2, (int)n3, (int)n4, (IntBuffer)intBuffer);
    }

    public static native void method_44$702bafdc36(net.C_47Rl arg0);

    public static native void method_44$df16004b03(int arg0,int arg1);

    public static int method_44$8abf5c6871() {
        return GlStateManager.field_495.field_48;
    }

    public static native void method_44$42cf812248(int arg0,int arg1,int arg2,int arg3);

    public static void method_44$da8c82d5d4() {
        GL11.glEndList();
        field_46 = false;
    }

    public static boolean method_44$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)field_41);
    }

    public static float method_44$bc607678b6() {
        return GlStateManager.field_49.field_49;
    }

    public static int method_48$8abf5c6871() {
        return GL11.glGenTextures();
    }

    public static boolean method_48$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_45.field_48);
    }

    public static native void method_48$da8c82d5d4();

    public static native void method_48$d00df7729d(int arg0);

    public static native void method_48$dfa68fb44f(net.C_47F arg0);

    public static void method_48$a59262c0f0(double d, double d2, double d3) {
        GL11.glScaled((double)d, (double)d2, (double)d3);
    }

    public static native void method_48$2c20cf5948(double arg0);

    public static void method_48$cecac6f52e(int n, int n2, float f) {
        GL11.glTexParameterf((int)n, (int)n2, (float)f);
    }

    public static native void method_48$23922dd444(int arg0,int arg1,int arg2);

    public static void method_48$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glOrtho((double)d, (double)d2, (double)d3, (double)d4, (double)d5, (double)d6);
    }

    public static void method_49$7cc134dc8c(int n, int n2, int n3, ByteBuffer byteBuffer) {
        GL11.glColorPointer((int)n, (int)n2, (int)n3, (ByteBuffer)byteBuffer);
    }

    public static float method_49$bc607678b6() {
        return GlStateManager.field_49.field_42;
    }

    public static void method_49$a59262c0f0(double d, double d2, double d3) {
        GL11.glTranslated((double)d, (double)d2, (double)d3);
    }

    public static native void method_49$24a796ab4c(float arg0);

    public static native void method_49$d00df7729d(int arg0);

    public static void method_49$da8c82d5d4() {
        GlStateManager.field_49t.field_49.method_40$da8c82d5d4();
    }

    public static native void method_49$dfa68fb44f(net.C_47F arg0);

    public static boolean method_49$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)field_496);
    }

    public static int method_49$8abf5c6871() {
        return GlStateManager.field_49E.field_43;
    }

    public static int method_45$8abf5c6871() {
        return GlStateManager.field_49t.field_43;
    }

    public static void method_45$94df7bfbf2(C_473j c_473j, int n, FloatBuffer floatBuffer) {
        GL11.glTexGen((int)GlStateManager.method_42$89c9e31ac3((C_473j)c_473j).field_44, (int)n, (FloatBuffer)floatBuffer);
    }

    public static native void method_45$702bafdc36(net.C_47Rl arg0);

    public static void method_45$c151fe78a0(float f, float f2, float f3) {
        GlStateManager.method_47$f2b6a9055b(f, f2, f3, 1.0f);
    }

    public static void method_45$da8c82d5d4() {
        GlStateManager.field_49t.field_49.method_48$da8c82d5d4();
    }

    public static void method_45$42cf812248(int n, int n2, int n3, int n4) {
        GL11.glColorPointer((int)n, (int)n2, (int)n3, (long)n4);
    }

    public static boolean method_45$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49q[GlStateManager.field_49m].field_46);
    }

    public static void method_45$d0893e6958(int n, int n2, ByteBuffer byteBuffer) {
        GL11.glNormalPointer((int)n, (int)n2, (ByteBuffer)byteBuffer);
    }

    public static float method_45$bc607678b6() {
        return GlStateManager.field_42.field_40;
    }

    public static native void method_45$d00df7729d(int arg0);

    public static native void method_45$f2b6a9055b(float arg0,float arg1,float arg2,float arg3);

    public static native void method_47$d00df7729d(int arg0);

    public static void method_47$7cc134dc8c(int n, int n2, int n3, ByteBuffer byteBuffer) {
        GL11.glVertexPointer((int)n, (int)n2, (int)n3, (ByteBuffer)byteBuffer);
    }

    public static native void method_47$f2b6a9055b(float arg0,float arg1,float arg2,float arg3);

    public static void method_47$c12925b3e5(C_473j c_473j) {
        GlStateManager.method_42$89c9e31ac3((C_473j)c_473j).field_43.method_40$da8c82d5d4();
    }

    public static int method_47$8abf5c6871() {
        return GlStateManager.field_49t.field_41;
    }

    public static void method_47$c151fe78a0(float f, float f2, float f3) {
        GL11.glScalef((float)f, (float)f2, (float)f3);
    }

    public static boolean method_47$9a6ad9dfe5(int n) {
        return C_49y.method_42$ec34d27d66((C_49y)field_49X[n]);
    }

    public static void method_47$da8c82d5d4() {
        field_44.method_48$da8c82d5d4();
    }

    public static boolean method_47$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_495.field_46);
    }

    public static native void method_47$df16004b03(int arg0,int arg1);

    public static void method_43$23922dd444(int n, int n2, int n3) {
        GL11.glTexParameteri((int)n, (int)n2, (int)n3);
    }

    public static void method_43$df16004b03(int n, int n2) {
        GL11.glNewList((int)n, (int)n2);
        field_46 = true;
    }

    public static void method_43$da8c82d5d4() {
        GlStateManager.field_49u.field_42.method_40$da8c82d5d4();
    }

    public static void method_43$b4afcfee9b(int n, FloatBuffer floatBuffer) {
        GL11.glGetFloat((int)n, (FloatBuffer)floatBuffer);
    }

    public static int method_43$8abf5c6871() {
        return C_47mU.field_42B + field_49m;
    }

    public static native void method_43$dd322a622a(float arg0,float arg1);

    public static native void method_43$1c03e9076d(boolean arg0,boolean arg1,boolean arg2,boolean arg3);

    public static native void method_43$d00df7729d(int arg0);

    public static boolean method_43$9a6ad9dfe5(int n) {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49q[n].field_46);
    }

    public static boolean method_43$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_42.field_42);
    }

    public static int method_40H$8abf5c6871() {
        return GlStateManager.field_40.field_48;
    }

    public static int method_40z$8abf5c6871() {
        return GlStateManager.field_495.field_41;
    }

    public static native void method_42i$da8c82d5d4();

    public static native void method_425$da8c82d5d4();

    public static void method_42O$da8c82d5d4() {
        GL11.glPopMatrix();
    }

    public static void method_42c$da8c82d5d4() {
        GlStateManager.field_49E.field_41.method_48$da8c82d5d4();
    }

    public static void method_42h$da8c82d5d4() {
        field_496.method_40$da8c82d5d4();
    }

    public static native void method_42p$da8c82d5d4();

    public static void method_42Y$da8c82d5d4() {
        GL11.glBindTexture((int)3553, (int)GlStateManager.field_49q[GlStateManager.field_49m].field_42);
    }

    public static void method_42v$da8c82d5d4() {
        GL11.glLoadIdentity();
    }

    public static void method_42Q$da8c82d5d4() {
        GL11.glPushAttrib((int)8256);
    }

    public static void method_42r$da8c82d5d4() {
        GL11.glPopAttrib();
    }

    public static void method_42G$da8c82d5d4() {
        GlStateManager.field_42.field_42.method_40$da8c82d5d4();
    }

    public static void method_42_$da8c82d5d4() {
        GlStateManager.field_42.field_42.method_48$da8c82d5d4();
    }

    public static void method_426$da8c82d5d4() {
        GL11.glPushMatrix();
    }

    public static native void method_423$da8c82d5d4();

    public static void method_42R$da8c82d5d4() {
        field_44.method_40$da8c82d5d4();
    }

    public static void method_42o$da8c82d5d4() {
        GL11.glEnd();
    }

    public static native void method_42z$da8c82d5d4();

    public static void method_429$da8c82d5d4() {
        field_41.method_48$da8c82d5d4();
    }

    public static void method_428$da8c82d5d4() {
        GlStateManager.field_49.field_48.method_48$da8c82d5d4();
    }

    public static void method_42m$da8c82d5d4() {
        GlStateManager.field_45.field_48.method_48$da8c82d5d4();
    }

    public static void method_42H$da8c82d5d4() {
        GlStateManager.field_45.field_48.method_40$da8c82d5d4();
    }

    public static void method_427$da8c82d5d4() {
        field_41.method_40$da8c82d5d4();
    }

    public static void method_422$da8c82d5d4() {
        GlStateManager.field_49u.field_42.method_48$da8c82d5d4();
    }

    public static native void method_42j$da8c82d5d4();

    public static int method_40R$8abf5c6871() {
        return GlStateManager.field_49F;
    }

    public static void method_421$da8c82d5d4() {
        GlStateManager.field_49q[GlStateManager.field_49m].field_46.method_48$da8c82d5d4();
    }

    public static void method_42y$da8c82d5d4() {
        GlStateManager.field_49q[GlStateManager.field_49m].field_46.method_40$da8c82d5d4();
    }

    public static boolean method_48s$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_40.field_47);
    }

    public static boolean method_48W$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49E.field_41);
    }

    public static boolean method_48v$aae029aa0a() {
        return C_49y.method_42$ec34d27d66((C_49y)GlStateManager.field_49.field_48);
    }

    public static void method_46G$d00df7729d(int n) {
        GL11.glEnableClientState((int)n);
    }

    public static void method_46z$d00df7729d(int n) {
        GL11.glDisableClientState((int)n);
    }

    public static int method_40m$8abf5c6871() {
        return GL11.glGetError();
    }

    native public static void method_46W$d00df7729d(int n);

    public static void method_469$d00df7729d(int n) {
        field_49X[n].method_48$da8c82d5d4();
    }

    public static void method_46J$d00df7729d(int n) {
        GlStateManager.field_49q[n].field_46.method_48$da8c82d5d4();
    }

    public static void method_46i$d00df7729d(int n) {
        GL11.glMatrixMode((int)n);
    }

}
