package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.ScaledResolution;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47hL;
import net.minecraft.client.Minecraft;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class KeyStrokes_47Hp extends Module implements RenderListener {
   public final C_47hL field_41;
   public final C_47hL field_43T;
   public final C_47hL field_45;
   public final C_47hL field_40;
   public final C_47hL field_49;
   public final C_47hL field_48;
   public final ColorSetting settingBackGroundColor;
   public final ColorSetting settingBackGroundColorPressed;
   public final ColorSetting settingKeyColor;
   public final ColorSetting settingKeyColorPressed;
   public final NumberSetting settingScale;
   public final NumberSetting settingFadeSpeed;
   public final NumberSetting settingX;
   public final NumberSetting settingY;
   public final ShaderOptions field_42;
   private final ArrayList field_43h;
   private static final long a = C_4f.a(-6695943834787646759L, 5813495032715498050L, MethodHandles.lookup().lookupClass()).a(11069926029721L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[20];
   private static final String[] f = new String[20];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Class b(long var0, long var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 17055690395340L;
      long var10 = var6 ^ 79469613767391L;
      GL11.glPushMatrix();
      int[] var10000 = recovery$indy$1(1630673127402286925L, var6);
      GL11.glScaled(1.0 / var5.method_40$8abf5c6871(), 1.0 / var5.method_40$8abf5c6871(), 1.0);
      GL11.glScaled(recovery$indy$2(this.settingScale, var10, 1632251337933433381L, var6), recovery$indy$3(this.settingScale, var10, 1632251337933433381L, var6), 1.0);
      double var13 = field_43.field_44f / recovery$indy$4(this.settingScale, var10, 1632251337933433381L, var6);
      double var15 = field_43.field_44g / recovery$indy$5(this.settingScale, var10, 1632251337933433381L, var6);
      int var17 = C_47sk.method_42$b4643774d1(var13);
      int var18 = C_47sk.method_42$b4643774d1(var15);
      int var19 = (int)((var17 - 58) * (recovery$indy$6(this.settingX, var10, 1632251337933433381L, var6) / 100.0));
      int var20 = (int)((var18 - 58) * (recovery$indy$7(this.settingY, var10, 1632251337933433381L, var6) / 100.0));
      int[] var12 = var10000;
      Iterator var21 = this.field_43h.iterator();

      while (true) {
         if (var21.hasNext()) {
            C_47hL var22 = (C_47hL)var21.next();
            recovery$indy$8(var22, var8, var19, var20, 1630786124648691351L, var6);
            var10000 = var12;
            if (var3 > 0) {
               if (var12 != null) {
                  break;
               }

               var10000 = var12;
            }

            if (var10000 == null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         if (var3 >= 0) {
            RenderUtils.method_41$da8c82d5d4();
         }
         break;
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$9(this, 32, var3, -7098032379205557085L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public KeyStrokes_47Hp(long var1) {
      super("KeyStrokes", "TastenStreicheln", ((a ^ var1) ^ 59616060920821L), new Color(95, 218, 222), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 50474093821772L;
      long var5 = var1 ^ 90900728712193L;
      long var7 = var1 ^ 41138587928306L;
      long var9 = var1 ^ 39086988611531L;
      long var11 = var1 ^ 116843559301225L;
      long var13 = var1 ^ 59616060920821L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = 6506360276865855441L;
      Minecraft var15 = field_43;
      this.field_41 = new C_47hL("W", var7, var15.field_44r.field_45H, 20, 0, 18, 18);
      var10005 = 6506360276865855441L;
      Minecraft var16 = field_43;
      this.field_43T = new C_47hL("A", var7, var16.field_44r.field_42P, 0, 20, 18, 18);
      var10005 = 6506360276865855441L;
      Minecraft var17 = field_43;
      this.field_45 = new C_47hL("S", var7, var17.field_44r.field_42R, 20, 20, 18, 18);
      var10005 = 6506360276865855441L;
      Minecraft var18 = field_43;
      this.field_40 = new C_47hL("D", var7, var18.field_44r.field_42b, 40, 20, 18, 18);
      var10005 = 6506360276865855441L;
      Minecraft var19 = field_43;
      this.field_49 = new C_47hL("LMB", var7, var19.field_44r.field_44l, 0, 40, 28, 18);
      var10005 = 6506360276865855441L;
      Minecraft var20 = field_43;
      this.field_48 = new C_47hL("RMB", var7, var20.field_44r.field_45w, 30, 40, 28, 18);
      this.settingBackGroundColor = new ColorSetting(var9, this, "BackGroundColor", new Color(0, 0, 0, 100));
      this.settingBackGroundColorPressed = new ColorSetting(var9, this, "BackGroundColorPressed", new Color(100, 100, 100, 100));
      this.settingKeyColor = new ColorSetting(var9, this, "KeyColor", Color.LIGHT_GRAY);
      this.settingKeyColorPressed = new ColorSetting(var9, this, "KeyColorPressed", Color.white);
      this.settingScale = new NumberSetting(this, "Scale", 2.0, var11, 1.0, 4.0, 1);
      this.settingFadeSpeed = new NumberSetting(this, "FadeSpeed", 300.0, var11, 0.0, 1000.0, 0);
      this.settingX = new NumberSetting(this, "X", 80.0, var11, 0.0, 100.0, 2);
      this.settingY = new NumberSetting(this, "Y", 80.0, var11, 0.0, 100.0, 2);
      ShaderOptions var10001 = new ShaderOptions(this, var3);
      long var10004 = 6506515878284651137L;
      Color var21 = Color.black;
      long var22 = var5;
      ShaderOptions var24 = var10001;
      this.field_42 = var24.method_44$10ed55120d(var22, var21);
      this.field_43h = new ArrayList();
      this.field_43h.add(this.field_41);
      this.field_43h.add(this.field_43T);
      this.field_43h.add(this.field_45);
      this.field_43h.add(this.field_40);
      this.field_43h.add(this.field_49);
      this.field_43h.add(this.field_48);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$8(Object var0, long var1, int var3, int var4, long var5, long var7);

   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$10();
}
