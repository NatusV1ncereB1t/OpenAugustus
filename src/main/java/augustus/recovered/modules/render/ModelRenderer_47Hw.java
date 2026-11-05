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
import net.C_477S;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import net.minecraft.client.renderer.GlStateManager;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class ModelRenderer_47Hw extends Module implements C_47xz {
   public final BooleanSetting settingRenderArmor;
   private final MultiSelectSetting settingTargets;
   private boolean field_43a;
   private static final long a = C_4f.a(7002895558033635189L, 298224747763388223L, MethodHandles.lookup().lookupClass()).a(225790504216194L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[19];
   private static final String[] f = new String[19];

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

   private static native int a(long var0, long var2);

   private static native void a();

   public boolean method_42$8a15fc4c7b(Entity var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 51444022857792L;
      int[] var6 = recovery$indy$1(6781363997904860190L, var2);
      boolean var10000 = recovery$indy$2(this, var4, 6781097947199120973L, var2);
      if (var6 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = var1 instanceof EntityPlayer;
      }

      int[] var10001 = var6;
      if (var2 > 0L) {
         if (var6 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = var1 instanceof EntityPlayerSP;
         }

         var10001 = var6;
      }

      if (var10001 == null) {
         if (var10000) {
            var10000 = recovery$indy$3(C_477S.ME, 6781448526272338973L, var2);
            if (var6 != null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = recovery$indy$4(C_477S.PLAYERS, 6781448526272338973L, var2);
      }

      return var10000;
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$5(this, 40, var3, -7098131690684385767L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 83768576147199L;
      int[] var8 = recovery$indy$6(2181762303486571589L, var4);
      ModelRenderer_47Hw var10000 = this;
      if (var8 == null) {
         if (!this.field_43a) {
            return;
         }

         var10000 = this;
      }

      var10000.field_43a = false;
      recovery$indy$7(var6, 2179969233409920340L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_43a = false;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 79816093561840L;
      int var8 = GL11.glGenTextures();
      GlStateManager.method_460$d00df7729d(var8);
      recovery$indy$10(
         var6, recovery$indy$8(11147, 8889036208077246980L ^ var4), recovery$indy$9(26524, 2470967041533435414L ^ var4), 2733557479995010087L, var4
      );
      this.field_43a = true;
   }

   public ModelRenderer_47Hw(long var1) {
      super("ModelRenderer", "ModellZeichner", ((a ^ var1) ^ 66844226943949L), new Color(255, 234, 140), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 14528719189563L;
      long var5 = var1 ^ 85692679989206L;
      long var7 = var1 ^ 66844226943949L;
      // Super arguments moved to the required Java constructor position.
      this.settingRenderArmor = new BooleanSetting(this, var5, "RenderArmor", false);
      long var10005 = -976400085706450808L;
      this.settingTargets = new MultiSelectSetting(this, "Targets", var3, C_477S.values());
      this.field_43a = false;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native void recovery$indy$7(long var0, long var2, long var4);

   private static native String recovery$indy$8(int var0, long var1);

   private static native String recovery$indy$9(int var0, long var1);

   private static native void recovery$indy$10(long var0, Object var2, Object var3, long var4, long var6);

   private static native MethodHandle recovery$constant$11();
}
