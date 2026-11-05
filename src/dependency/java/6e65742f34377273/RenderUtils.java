package client.render;
import client.ClientGlobals;
import client.setting.ColorSetting;
import java.awt.Color;
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
import net.C_40X;
import net.C_41l;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_47BP;
import net.C_47Gj;
import net.C_47Il;
import net.C_47K;
import net.C_47N;
import net.C_47Ou;
import net.C_47Wu;
import net.C_47j9;
import net.C_47rf;
import net.C_47sk;
import net.C_47vQ;
import net.C_49h;
import net.C_4f;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class RenderUtils implements C_47Ou {
    static boolean field_45;
    static long a;
    static java.lang.String b;
    static java.lang.Object[] c;
    static java.lang.String[] d;

    private static native java.lang.Class b(long arg0,long arg1);

    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    public static native void method_46$1b188dfb07(net.C_47rf arg0,int arg1,int arg2,boolean arg3);

    public static void method_46$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        RenderUtils.method_41$cc82067b44((float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6);
    }

    public static native boolean method_46$0ce7aadef1(int arg0,int arg1,double arg2,double arg3,double arg4,double arg5);

    private static native int a(long arg0,long arg1);

    private static native void a();

    private static native java.lang.String a(byte[] arg0);

    private static native java.lang.Exception a(java.lang.Exception arg0);

    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);

    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);

    public static void method_42$d1741d635c(Color color) {
        GlStateManager.method_47$f2b6a9055b((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static void method_42$f4cb786bc6(int n, int n2, int n3, int n4, float f, float f2, float f3) {
        RenderUtils.method_40$6b4c2200df(n, n2, n3, n4, f, f2, f3, 1.0f);
    }

    public static native void method_42$da8c82d5d4();

    public static void method_42$32e26becb0(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        RenderUtils.method_40$6b4c2200df(n, n2, n3, n4, (float)n5 / 255.0f, (float)n6 / 255.0f, (float)n7 / 255.0f, (float)n8 / 255.0f);
    }

    public static native void method_42$8895a6b654(net.minecraft.entity.EntityLivingBase arg0,int arg1);

    native public static void method_42$85eee1abaa(float f, float f2, float f3, float f4, float f5, int n, Color color);

    public static native void method_42$dcfe565fe0(float arg0,float arg1,float arg2,float arg3,float arg4,int arg5,int arg6,int arg7);

    native public static void method_42$3e42f10208(Entity entity, float f, float f2, float f3, double d, double d2);

    public static native void method_42$4983da8661(double arg0,int arg1,int arg2,float arg3,float arg4,float arg5,boolean arg6);

    public static void method_42$657351ea81(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        RenderUtils.method_40$6b4c2200df(n, n2, n3, n4, (float)n5 / 255.0f, (float)n6 / 255.0f, (float)n7 / 255.0f, 1.0f);
    }

    private static native java.lang.reflect.Method d(long arg0,long arg1);

    public static void method_41$da8c82d5d4() {
        GlStateManager.method_42i$da8c82d5d4();
        GlStateManager.method_42h$da8c82d5d4();
        GlStateManager.method_46$da8c82d5d4();
        GlStateManager.method_47$f2b6a9055b(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.method_41$da8c82d5d4();
    }

    public static native void method_41$3e42f10208(net.minecraft.entity.Entity arg0,float arg1,float arg2,float arg3,double arg4,double arg5);

    public static void method_41$6059593eaa(C_478i c_478i) {
        RenderUtils.method_45$0bc3ff5d48(c_478i.field_48, c_478i.field_46, c_478i.field_44, c_478i.field_42, c_478i.field_47, c_478i.field_40);
    }

    public static void method_41$7ad4183c87(double d, double d2, double d3, double d4) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
    }

    public static void method_41$cc82067b44(float f, float f2, float f3, float f4, float f5, float f6) {
        C_41l c_41l = C_41l.method_40$2abe131c67();
        C_47Gj c_47Gj = c_41l.method_41$4db9b92eb8();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        c_47Gj.method_44$dc4d91c0c9(3, C_49h.field_47y);
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$da8c82d5d4();
        c_41l.method_40$da8c82d5d4();
    }

    public static void method_41$85eee1abaa(float f, float f2, float f3, float f4, float f5, int n, Color color) {
        RenderUtils.method_49$722989e45f(f, f2, f3, f4, f5, n, color.getRGB());
    }

    public static void method_41$15770aebb3(double d, double d2, double d3, double d4, float f, Color color) {
        RenderUtils.method_45$6c6a1f85b2(d, d2, d3, d4, f, (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static void method_41$f5c515825a(float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        RenderUtils.method_43$06d5af932f(f, f2, f3, f4, (float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f, (float)n4 / 255.0f);
    }

    public static native void method_40$ecace5a108(float arg0,float arg1,float arg2,float arg3,double arg4);

    public static native void method_40$56a5fc1016(double arg0,double arg1,double arg2,double arg3,int arg4);

    native public static void method_40$6b4c2200df(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4);

    native public static void method_40$85eee1abaa(float f, float f2, float f3, float f4, float f5, int n, Color color);

    public static void method_40$3ebc9ac54d(int n, float f) {
        GlStateManager.method_47$f2b6a9055b((float)(n >> 16 & 0xFF) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, f);
    }

    public static void method_40$a0864c4b60(float f, float f2, float f3, int n) {
        GL11.glPushMatrix();
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        RenderUtils.method_43$d00df7729d(n);
        GL11.glBegin((int)4);
        float f4 = f3 / 2.0f;
        float f5 = f + f4;
        float f6 = f - f4;
        float f7 = f2 + f4;
        float f8 = f2 - f4;
        GL11.glVertex2f((float)f5, (float)f8);
        GL11.glVertex2f((float)f6, (float)f8);
        GL11.glVertex2f((float)f, (float)f7);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
        GL11.glPopMatrix();
    }

    public static native void method_40$9aa76d28dd(net.C_47BP arg0,float arg1,float arg2,float arg3,float arg4);

    public static void method_40$0f4d4a7a6c(int n, int n2, int n3, int n4, int n5) {
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        RenderUtils.method_40$6b4c2200df(n, n2, n3, n4, f2, f3, f4, f);
    }

    public static native void method_40$990374c81d(net.minecraft.entity.EntityLivingBase arg0,int arg1,java.lang.String arg2);

    public static void method_44$6059593eaa(C_478i c_478i) {
        RenderUtils.method_49$0bc3ff5d48(c_478i.field_48, c_478i.field_46, c_478i.field_44, c_478i.field_42, c_478i.field_47, c_478i.field_40);
    }

    native private static void method_44$3e42f10208(Entity entity, float f, float f2, float f3, double d, double d2);

    public static void method_44$cc82067b44(float f, float f2, float f3, float f4, float f5, float f6) {
        C_41l c_41l = C_41l.method_40$2abe131c67();
        C_47Gj c_47Gj = c_41l.method_41$4db9b92eb8();
        c_47Gj.method_44$dc4d91c0c9(7, C_49h.field_47y);
        RenderUtils.method_47$cc82067b44(f, f2, f3, f4, f5, f6);
        c_41l.method_40$da8c82d5d4();
    }

    public static void method_44$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glEnd();
    }

    public static void method_44$42cf812248(int n, int n2, int n3, int n4) {
        GlStateManager.method_47$f2b6a9055b((float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f, (float)n4 / 255.0f);
    }

    public static native void method_48$fe549f1055(net.C_478Q arg0,int arg1,float arg2,float arg3);

    public static native void method_48$45fe1d62b8(net.minecraft.entity.EntityLivingBase arg0,client.setting.ColorSetting arg1,float arg2,int arg3,boolean arg4);

    public static void method_48$e73a890a64(float f, float f2, float f3, float f4, float f5, int n, int n2, Color color) {
        RenderUtils.method_42$dcfe565fe0(f, f2, f3, f4, f5, n, n2, color.getRGB());
    }

    public static void method_48$6059593eaa(C_478i c_478i) {
        RenderUtils.method_44$0bc3ff5d48(c_478i.field_48, c_478i.field_46, c_478i.field_44, c_478i.field_42, c_478i.field_47, c_478i.field_40);
    }

    public static void method_48$f2b6a9055b(float f, float f2, float f3, float f4) {
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
    }

    public static int method_48$7a03ae1ced(Color color, double d, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (RenderUtils.method_43$d995cdbb69(n3, n4, n5, n6, n, n2)) {
            float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
            float f = (float)((double)fArray[2] + d);
            if ((double)fArray[2] + d > 1.0) {
                f = 1.0f;
            } else if ((double)fArray[2] + d < 0.0) {
                f = 0.0f;
            }
            n7 = Color.HSBtoRGB(fArray[0], fArray[1], f);
        } else {
            n7 = color.getRGB();
        }
        return n7;
    }

    public static void method_48$cc82067b44(float f, float f2, float f3, float f4, float f5, float f6) {
        C_41l c_41l = C_41l.method_40$2abe131c67();
        C_47Gj c_47Gj = c_41l.method_41$4db9b92eb8();
        c_47Gj.method_44$dc4d91c0c9(7, C_49h.field_47y);
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$da8c82d5d4();
        c_41l.method_40$da8c82d5d4();
    }

    public static void method_48$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        RenderUtils.method_47$cc82067b44((float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6);
    }

    public static native void method_49$722989e45f(float arg0,float arg1,float arg2,float arg3,float arg4,int arg5,int arg6);

    public static void method_49$06dbce660f(float f, float f2, float f3, float f4, float f5, int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, Color color) {
        RenderUtils.method_43$095b2ca601(f, f2, f3, f4, f5, n, bl, bl2, bl3, bl4, color.getRGB());
    }

    public static native void method_49$abcd007888(double arg0,double arg1,double arg2,double arg3,double arg4,java.awt.Color arg5);

    public static void method_49$85eee1abaa(float f, float f2, float f3, float f4, float f5, int n, Color color) {
        int n2;
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        RenderUtils.method_42$d1741d635c(color);
        GL11.glBegin((int)9);
        f5 = Math.min(Math.min(Math.abs(f4 - f2) / 2.0f, Math.abs(f3 - f) / 2.0f), f5);
        n = Math.max(1, n - n % 3);
        for (n2 = 90; n2 <= 180; n2 += n) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin(Math.toRadians(n2)) * (double)f5), (double)((double)(f2 + f5) + Math.cos(Math.toRadians(n2)) * (double)f5));
        }
        for (n2 = 180; n2 <= 270; n2 += n) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin(Math.toRadians(n2)) * (double)f5), (double)((double)(f2 + f5) + Math.cos(Math.toRadians(n2)) * (double)f5));
        }
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
    }

    public static void method_49$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        RenderUtils.method_44$cc82067b44((float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6);
    }

    public static void method_49$58ba42e353(float f, float f2, float f3, float f4, int n, int n2, int n3) {
        RenderUtils.method_43$06d5af932f(f, f2, f3, f4, (float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f, 1.0f);
    }

    public static void method_49$df16004b03(int n, int n2) {
        GlStateManager.method_47$f2b6a9055b((float)(n >> 16 & 0xFF) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, (float)n2 / 255.0f);
    }

    public static native void method_49$fe3d7b3fc5(net.minecraft.entity.Entity arg0,int arg1,float arg2,float arg3);

    public static native void method_45$fe549f1055(net.C_478Q arg0,int arg1,float arg2,float arg3);

    public static native void method_45$bf9efb3833(net.C_47K arg0,int arg1,float arg2,float arg3,double arg4,boolean arg5);

    public static native void method_45$6c6a1f85b2(double arg0,double arg1,double arg2,double arg3,float arg4,float arg5,float arg6,float arg7,float arg8);

    public static native void method_45$6b4c2200df(int arg0,int arg1,int arg2,int arg3,float arg4,float arg5,float arg6,float arg7);

    public static void method_45$0bc3ff5d48(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d5, (double)d3);
        GL11.glVertex3d((double)d4, (double)d2, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d3);
        GL11.glVertex3d((double)d4, (double)d2, (double)d6);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glVertex3d((double)d, (double)d2, (double)d6);
        GL11.glVertex3d((double)d, (double)d5, (double)d6);
        GL11.glEnd();
    }

    public static native void method_45$1b188dfb07(net.C_47rf arg0,int arg1,int arg2,boolean arg3);

    public static void method_45$61a4f17e6a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        RenderUtils.method_43$06d5af932f(f, f2, f3, f4, f5, f6, f7, 1.0f);
    }

    public static native void method_47$ec02dc7e0f(int arg0,int arg1,int arg2,int arg3,float arg4,float arg5,float arg6,float arg7,boolean arg8);

    public static void method_47$cc82067b44(float f, float f2, float f3, float f4, float f5, float f6) {
        C_47Gj c_47Gj = C_41l.method_40$2abe131c67().method_41$4db9b92eb8();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f5, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f4, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f6).method_42$da8c82d5d4();
        c_47Gj.method_42$dbb7a02e02((double)f, (double)f2, (double)f3).method_42$da8c82d5d4();
        c_47Gj.method_42$da8c82d5d4();
    }

    public static native void method_47$230c7ec7b1(net.minecraft.entity.Entity arg0,int arg1,float arg2,float arg3,boolean arg4);

    public static native void method_47$a896ad8163(net.C_47K arg0,int arg1);

    public static void method_47$15770aebb3(double d, double d2, double d3, double d4, float f, Color color) {
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        GL11.glLineWidth((float)f);
        RenderUtils.method_42$d1741d635c(color);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
    }

    public static void method_43$d00df7729d(int n) {
        GlStateManager.method_47$f2b6a9055b((float)(n >> 16 & 0xFF) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, (float)(n >> 24 & 0xFF) / 255.0f);
    }

    public static native void method_43$4f91566a26(double arg0,double arg1,double arg2,double arg3,float arg4,int arg5);

    public static native void method_43$06d5af932f(float arg0,float arg1,float arg2,float arg3,float arg4,float arg5,float arg6,float arg7);

    native public static void method_43$095b2ca601(float f, float f2, float f3, float f4, float f5, int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n2);

    public static void method_43$da1bfc93ea(double d, double d2, double d3, double d4, float f, double d5, double d6, int n) {
        double d7 = Math.abs(d - d3) / 2.0 / (100.0 / d5);
        double d8 = Math.abs(d2 - d4) / 2.0 / (100.0 / d6);
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        RenderUtils.method_43$d00df7729d(n);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)(d2 + d8));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + d7), (double)d2);
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d3, (double)(d2 + d8));
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)(d3 - d7), (double)d2);
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d3, (double)(d4 - d8));
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)(d3 - d7), (double)d4);
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)(d4 - d8));
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)(d + d7), (double)d4);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
    }

    public static void method_43$76ab45bd30(float f, float f2, float f3, float f4, int n) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        RenderUtils.method_43$06d5af932f(f, f2, f3, f4, f6, f7, f8, f5);
    }

    public static void method_43$6059593eaa(C_478i c_478i) {
        RenderUtils.method_46$0bc3ff5d48(c_478i.field_48, c_478i.field_46, c_478i.field_44, c_478i.field_42, c_478i.field_47, c_478i.field_40);
    }

    public static native void method_43$da8c82d5d4();

    public static void method_43$f2b6a9055b(float f, float f2, float f3, float f4) {
        ScaledResolution scaledResolution = new ScaledResolution(field_43);
        float f5 = scaledResolution.method_40$8abf5c6871();
        GL11.glScissor((int)((int)(f * f5)), (int)((int)((scaledResolution.method_40$fedcb3e4d3() - (double)f4) * (double)f5)), (int)((int)((f3 - f) * f5)), (int)((int)((f4 - f2) * f5)));
    }

    public static void method_43$f2f98fff8c(int n, int n2, int n3, int n4, float f, Color color) {
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        GL11.glLineWidth((float)f);
        RenderUtils.method_42$d1741d635c(color);
        GL11.glBegin((int)1);
        GL11.glVertex2i((int)n, (int)n2);
        GL11.glVertex2i((int)n3, (int)n4);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
    }

    public static native boolean method_43$d995cdbb69(float arg0,float arg1,float arg2,float arg3,int arg4,int arg5);

    public static void method_43$a0864c4b60(float f, float f2, float f3, int n) {
        GL11.glPushMatrix();
        GlStateManager.method_423$da8c82d5d4();
        GlStateManager.method_421$da8c82d5d4();
        GlStateManager.method_44$42cf812248(770, 771, 1, 0);
        RenderUtils.method_43$d00df7729d(n);
        GL11.glBegin((int)3);
        float f4 = f3 / 2.0f;
        float f5 = f + f4;
        float f6 = f - f4;
        float f7 = f2 + f4;
        float f8 = f2 - f4;
        GL11.glVertex2f((float)f5, (float)f8);
        GL11.glVertex2f((float)f6, (float)f8);
        GL11.glVertex2f((float)f, (float)f7);
        GL11.glVertex2f((float)f5, (float)f8);
        GL11.glEnd();
        GlStateManager.method_42y$da8c82d5d4();
        GlStateManager.method_42z$da8c82d5d4();
        GL11.glPopMatrix();
    }

    public static native void method_43$3e42f10208(net.minecraft.entity.Entity arg0,float arg1,float arg2,float arg3,double arg4,double arg5);

    private static native void method_43$52bdd5500a(float arg0,float arg1,float arg2,java.lang.String arg3);

    private static native java.lang.reflect.Field c(long arg0,long arg1);

}
