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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fx;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47j9;
import net.C_47mU;
import net.minecraft.client.Minecraft;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class Model_47HP extends Module implements RenderListener, C_47xz {
   public final NumberSetting settingXCoord;
   public final NumberSetting settingYCoord;
   public final NumberSetting settingScale;
   public final BooleanSetting settingYawRot;
   private float field_45;
   private float field_42;
   private static final long a = C_4f.a(-5440292705892846295L, 6643149700911720382L, MethodHandles.lookup().lookupClass()).a(169322487336775L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[23];
   private static final String[] f = new String[23];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private void method_42$58760996d3(int var1, int var2, int var3, long var4, float var6, float var7, EntityPlayerSP var8) {
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var18;
      label17: {
         var4 = a ^ var4;
         GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.method_426$da8c82d5d4();
         GlStateManager.method_49$da8c82d5d4();
         GlStateManager.method_426$da8c82d5d4();
         GlStateManager.method_42$c151fe78a0(var1, var2, 50.0F);
         GlStateManager.method_47$c151fe78a0(-var3, var3, var3);
         GlStateManager.method_42$f2b6a9055b(180.0F, 0.0F, 0.0F, 1.0F);
         var10 = var8.field_43_;
         int[] var10000 = recovery$indy$1(4835692608017279925L, var4);
         var11 = var8.field_48h;
         var12 = var8.field_48z;
         var13 = var8.field_47k;
         var14 = var8.field_43m;
         var15 = var8.field_47J;
         GlStateManager.method_42$f2b6a9055b(135.0F, 0.0F, 1.0F, 0.0F);
         C_47Fx.method_42$da8c82d5d4();
         GlStateManager.method_42$f2b6a9055b(-135.0F, 0.0F, 1.0F, 0.0F);
         GlStateManager.method_42$f2b6a9055b(-((float)Math.atan(var7 / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
         int[] var9 = var10000;
         var8.field_43_ = (float)Math.atan(var6 / 40.0F) * 20.0F;
         Model_47HP var10002 = this;
         if (var9 == null) {
            if (!recovery$indy$2(this.settingYawRot, 4835499283772426138L, var4)) {
               var18 = 0.0F;
               break label17;
            }

            var10002 = this;
         }

         var18 = C_47sk.method_46$ef9a6720f7(var10002.field_42 - this.field_45, -8.0F, 8.0F);
      }

      var8.field_48h = 0.0F + var18;
      var8.field_48z = 0.0F;
      var8.field_47J = 0.0F;
      var8.field_43m = var8.field_48h;
      var8.field_47k = var8.field_48h;
      GlStateManager.method_42$c151fe78a0(0.0F, 0.0F, 0.0F);
      C_47j9 var16 = recovery$indy$3(Minecraft.method_46$28f1e2a3f8(), 4835410604532848588L, var4);
      var16.method_40$24a796ab4c(180.0F);
      var16.method_46$f633c984d8(false);
      var8.method_45$f633c984d8(false);
      var16.method_41$470cbf2a56(var8, 0.0, 0.0, 0.0, 0.0F, 1.0F);
      var8.method_45$f633c984d8(true);
      var16.method_46$f633c984d8(true);
      var8.field_43_ = var10;
      var8.field_47J = var15;
      var8.field_48h = var11;
      var8.field_48z = var12;
      var8.field_47k = var13;
      var8.field_43m = var14;
      GlStateManager.method_42O$da8c82d5d4();
      C_47Fx.method_45$da8c82d5d4();
      GlStateManager.method_47$da8c82d5d4();
      GlStateManager.method_45$d00df7729d(C_47mU.field_42N);
      GlStateManager.method_421$da8c82d5d4();
      GlStateManager.method_45$d00df7729d(C_47mU.field_42B);
      GlStateManager.method_42O$da8c82d5d4();
   }

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 57890923053613L;
      long var10 = var6 ^ 79469613767391L;
      int var12 = (int)(
         1.0 * recovery$indy$4(this.settingScale, var10, 1630665931515272665L, var6) / 2.0
            + (var5.method_46$8abf5c6871() - 1.0 * recovery$indy$5(this.settingScale, var10, 1630665931515272665L, var6))
               / 100.0
               * recovery$indy$6(this.settingXCoord, var10, 1630665931515272665L, var6)
      );
      int var13 = (int)(
         2.0 * recovery$indy$7(this.settingScale, var10, 1630665931515272665L, var6)
            + (var5.method_48$8abf5c6871() - 2.0 * recovery$indy$8(this.settingScale, var10, 1630665931515272665L, var6))
               / 100.0
               * recovery$indy$9(this.settingYCoord, var10, 1630665931515272665L, var6)
      );
      recovery$indy$12(
         this,
         var12,
         var13,
         (int)recovery$indy$10(this.settingScale, var10, 1630665931515272665L, var6),
         var8,
         0.0F,
         0.0F,
         recovery$indy$11(field_43, 1630387412786116694L, var6),
         1630366287476546956L,
         var6
      );
      RenderUtils.method_41$da8c82d5d4();
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 32, var3, -7099499093626599723L, var1);
      recovery$indy$14(this, 40, var3, -7099499093626599723L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      this.field_42 = this.field_45;
      this.field_45 = recovery$indy$15(field_43, 2180131451236151479L, var4).field_48h;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Model_47HP(long var1) {
      super("Model", "Model", ((a ^ var1) ^ 41566127771225L), new Color(252, 186, 3), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 93361279144514L;
      long var5 = var1 ^ 133802974064069L;
      long var7 = var1 ^ 41566127771225L;
      // Super arguments moved to the required Java constructor position.
      this.settingXCoord = new NumberSetting(this, "X-Coord", 1.0, var5, 0.0, 100.0, 2);
      this.settingYCoord = new NumberSetting(this, "Y-Coord", 8.0, var5, 0.0, 100.0, 2);
      this.settingScale = new NumberSetting(this, "Scale", 30.0, var5, 10.0, 100.0, 0);
      this.settingYawRot = new BooleanSetting(this, var3, "YawRot", true);
      this.field_45 = 0.0F;
      this.field_42 = 0.0F;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$3(Object var0, long var1, long var3);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);

   private static native void recovery$indy$12(Object var0, int var1, int var2, int var3, long var4, float var6, float var7, Object var8, long var9, long var11);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$16();
}
