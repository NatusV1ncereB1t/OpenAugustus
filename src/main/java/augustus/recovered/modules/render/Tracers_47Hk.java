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
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.minecraft.entity.Entity;
import net.C_47MS;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gy;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oo;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47vk;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class Tracers_47Hk extends Module implements C_47MS, RenderListener, C_47xz {
   public final ModeSetting settingMode;
   public final BooleanSetting settingStaticColor;
   public final ColorSetting settingColor;
   public final NumberSetting settingLineWidth;
   public final ShaderOptions field_47;
   private final MultiSelectSetting settingEntities;
   public final NumberSetting settingMaximumRenderDistance;
   private boolean field_43a;
   private final ArrayList field_43h;
   public float field_40;
   private static final long a = C_4f.a(2388574384717371344L, -5248854052268081609L, MethodHandles.lookup().lookupClass()).a(205204570944256L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[64];
   private static final String[] f = new String[64];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   @Override
   public void method_42$81a716381c(C_47vk var1, long var2) {
      this.field_40 = recovery$indy$1(var1, -3663505763466619011L, var2);
   }

   private static native Method d(long var0, long var2);

   private void method_44$962cca68a7(long var1, EntityLivingBase var3, int var4, RenderPass var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 67167502676843L;
      long var8 = var1 ^ 6681909317578L;
      long var10 = var1 ^ 116341400523992L;
      long var12 = var1 ^ 113028048665931L;
      long var10001 = var1 ^ 54291168863166L;
      int var14 = (int)((var1 ^ 54291168863166L) >>> 32);
      int var15 = (int)((var1 ^ 54291168863166L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      int[] var17 = recovery$indy$2(1235787327243463329L, var1);
      int var18 = recovery$indy$3(this.settingColor, var14, (short)var15, (char)var16, var4, 1234332346673571418L, var1);
      if (var17 == null) {
         if (!recovery$indy$4(this.settingStaticColor, 1235565620203002070L, var1)) {
            double var19 = Math.min(Math.max(recovery$indy$5(field_43, 1234822266276586573L, var1).method_44$ee256e8a75(var3), 6.0F), 36.0F) - 6.0F;
            float[] var21 = recovery$indy$6(var18, var8, 1235838204125889482L, var1);
            var18 = Color.HSBtoRGB((float)(0.011415525F * var19), var21[1], var21[2]);
         }

         RenderUtils.method_40$990374c81d(
            var3,
            recovery$indy$8(this.field_47, var5, var12, recovery$indy$7(var5, var18, var6, 1234919971419091901L, var1), 1234257391599296023L, var1),
            recovery$indy$9(this.settingMode, var10, 1235075008676157945L, var1)
         );
      }
   }

   private static boolean method_48$aae029aa0a() {
      long var0 = a ^ 118829244091088L;
      long var2 = var0 ^ 137719981928773L;
      long var10000 = -435382023747648910L;
      int[] var4 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -435574856780278483L;
      long var5 = var2;
      ColorSetting var7 = ClientGlobals.field_48.field_48s.settingColor;
      boolean var8 = var7.method_46$0dd78e0064(var5);
      if (var4 == null) {
         var8 = !var8;
      }

      return var8;
   }

   private void method_48$ad0e900906(RenderPass var1) {
      long var2 = a ^ 132770377900736L;
      long var4 = var2 ^ 6313563993068L;
      long var10000 = -3322211177349879198L;
      int[] var6 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var7 = 0;

      while (var7 < this.field_43h.size()) {
         EntityLivingBase var10002 = (EntityLivingBase)this.field_43h.get(var7);
         long var10005 = -3322101790302493547L;
         RenderPass var8 = var1;
         int var9 = var7;
         EntityLivingBase var10 = var10002;
         long var11 = var4;
         Tracers_47Hk var13 = this;
         var13.method_44$962cca68a7(var11, var10, var9, var8);
         var7++;
         if (var6 != null) {
            break;
         }
      }
   }

   private static boolean method_45$aae029aa0a() {
      long var0 = a ^ 44685897686285L;
      long var10001 = 3326902869447583704L;
      BooleanSetting var2 = ClientGlobals.field_48.field_48s.settingStaticColor;
      return var2.method_49$aae029aa0a();
   }

   @Override
   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 75862687826910L;
      long var6 = var1 ^ 57482311646357L;
      long var8 = var1 ^ 5451650687478L;
      long var10 = var1 ^ 52344924935716L;
      long var12 = var1 ^ 80017760765463L;
      RenderUtils.method_42$da8c82d5d4();
      float var14 = (float)(recovery$indy$10(this.settingLineWidth, var6, 8135384783595816917L, var1) / 2.0);
      GL11.glLineWidth(var14);
      recovery$indy$13(
         recovery$indy$11(this.field_47, var4, 8134879104075088179L, var1),
         recovery$indy$12(this.field_47, var10, 8134221491401878177L, var1),
         var8,
         8135033789864908725L,
         var1
      );
      recovery$indy$15(false, var12, recovery$indy$14(this), 8133600909604831692L, var1);
      RenderUtils.method_43$da8c82d5d4();
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$16(this, 24, 11, var3, -7101966792215848862L, var1);
      recovery$indy$17(this, 32, var5, -7101745185626275451L, var1);
      recovery$indy$18(this, 40, var5, -7101745185626275451L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 113186446332478L;
      long var10001 = var4 ^ 131022816656764L;
      int var8 = (int)((var4 ^ 131022816656764L) >>> 32);
      int var9 = (int)((var4 ^ 131022816656764L) << 32 >>> 56);
      int var10 = (int)(var10001 << 40 >>> 40);
      this.field_43h.clear();
      int[] var10000 = recovery$indy$19(2183776729224095177L, var4);
      Iterator var18 = recovery$indy$20(field_43, 2182621359767124961L, var4).field_44Q.iterator();
      int[] var17 = var10000;

      while (var18.hasNext()) {
         label64: {
            Entity var19 = (Entity)var18.next();
            Entity var20 = var19;
            if (var17 == null) {
               if (var19 instanceof EntityPlayerSP) {
                  break label64;
               }

               var20 = var19;
            }

            boolean var22 = recovery$indy$21(C_47gy.PLAYER, 2182348292331549507L, var4);
            boolean var10002 = recovery$indy$22(C_47gy.MOB, 2182348292331549507L, var4);
            boolean var10003 = recovery$indy$23(C_47gy.ANIMAL, 2182348292331549507L, var4);
            boolean var10004 = recovery$indy$24(C_47gy.VILLAGER, 2182348292331549507L, var4);
            boolean var10005 = recovery$indy$25(C_47gy.ARMOR_STAND, 2182348292331549507L, var4);
            boolean var10006 = recovery$indy$26(C_47gy.INVISIBLE, 2182348292331549507L, var4);
            boolean var10007 = recovery$indy$27(C_47gy.TEAMMATES, 2182348292331549507L, var4);
            if (var17 == null) {
               var10007 = !var10007;
            }

            boolean var11 = recovery$indy$28(C_47gy.ALERTED, 2182348292331549507L, var4);
            boolean var12 = true;
            boolean var13 = true;
            boolean var14 = var10007;
            boolean var15 = var10006;
            boolean var16 = var10005;
            byte var21 = ((byte) (recovery$indy$29(
               var20, var22, var10002, var10003, var10004, var8, (byte)var9, var16, var15, var10, var14, var13, var12, var11, 2183984098602269655L, var4
            ) ? 1 : 0));
            int[] var23 = var17;
            if (var1 > 0) {
               if (var17 == null) {
                  if (var21 == 0) {
                     break label64;
                  }

                  double var24;
                  var21 = (byte)((
                           var24 = recovery$indy$30(field_43, 2182780259030838053L, var4).method_44$ee256e8a75(var19)
                              - recovery$indy$31(this.settingMaximumRenderDistance, var6, 2183652003143592318L, var4)
                        )
                        == 0.0
                     ? 0
                     : (var24 < 0.0 ? -1 : 1));
               }

               var23 = var17;
            }

            if (var23 == null && var21 < 0) {
               this.field_43h.add((EntityLivingBase)var19);
            }
         }

         if (var17 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$32(field_43, -7739997365370331354L, var1).field_42k = this.field_43a;
      this.field_43h.clear();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_43a = recovery$indy$33(field_43, 2729203572906847824L, var4).field_42k;
      recovery$indy$34(field_43, 2729203572906847824L, var4).field_42k = false;
   }

   public Tracers_47Hk(int var1, int var2) {
      super("Tracers", "Isotopenindikator", ((((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a) ^ 131849403933248L), new Color(12, 58, 133), Category.RENDER);
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      long var5 = var3 ^ 77065900601270L;
      long var7 = var3 ^ 16628160883558L;
      long var9 = var3 ^ 66376665027213L;
      long var11 = var3 ^ 118975101816569L;
      long var13 = var3 ^ 21434561068468L;
      long var15 = var3 ^ 7482223394395L;
      long var17 = var3 ^ 108156954001022L;
      long var19 = var3 ^ 47923850658268L;
      long var21 = var3 ^ 93318059341707L;
      long var23 = var3 ^ 131849403933248L;
      // Super arguments moved to the required Java constructor position.
      this.settingMode = new ModeSetting(this, "Mode", var9, "Feet", new String[]{"Feet", "CrossHair"});
      BooleanSetting var10001 = new BooleanSetting(this, var15, "StaticColor", false);
      C_45n var10003 = recovery$indy$35();
      long var10004 = -6055958451089587348L;
      C_45n var25 = var10003;
      long var26 = var7;
      BooleanSetting var28 = var10001;
      this.settingStaticColor = (BooleanSetting)var28.method_43$780fd62a21(var26, var25);
      ColorSetting var40 = new ColorSetting(var17, this, "Color", new Color(21, 121, 230, 65));
      var10003 = recovery$indy$36();
      var10004 = -6055958451089587348L;
      C_45n var29 = var10003;
      long var30 = var7;
      ColorSetting var32 = var40;
      this.settingColor = (ColorSetting)var32.method_43$780fd62a21(var30, var29);
      this.settingLineWidth = new NumberSetting(this, "LineWidth", 6.0, var19, 0.1, 15.0, 1);
      ShaderOptions var41 = new ShaderOptions(this, var11);
      var10004 = -6055568112140422189L;
      Color var33 = Color.black;
      long var34 = var13;
      ShaderOptions var36 = var41;
      ShaderOptions var42 = var36.method_44$10ed55120d(var34, var33);
      long var44 = -6056163661518775547L;
      long var37 = var21;
      ShaderOptions var39 = var42;
      this.field_47 = var39.method_41$7d3e47ba5c(var37);
      long var10005 = -6057023927174256089L;
      this.settingEntities = new MultiSelectSetting(this, "Entities", var5, C_47gy.values());
      this.settingMaximumRenderDistance = new NumberSetting(this, "MaximumRenderDistance", 500.0, var19, 0.0, 500.0, 0);
      this.field_43h = new ArrayList();
      this.field_40 = 0.0F;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native float recovery$indy$1(Object var0, long var1, long var3);

   private static native int[] recovery$indy$2(long var0, long var2);

   private static native int recovery$indy$3(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native float[] recovery$indy$6(int var0, long var1, long var3, long var5);

   private static native int recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);

   private static native int recovery$indy$8(Object var0, Object var1, long var2, int var4, long var5, long var7);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$13(boolean var0, boolean var1, long var2, long var4, long var6);

   private static native C_47Fw recovery$indy$14(Tracers_47Hk var0);

   private static native void recovery$indy$15(boolean var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$16(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$19(long var0, long var2);

   private static native WorldClient recovery$indy$20(Object var0, long var1, long var3);

   private static native boolean recovery$indy$21(Object var0, long var1, long var3);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3);

   private static native boolean recovery$indy$23(Object var0, long var1, long var3);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3);

   private static native boolean recovery$indy$26(Object var0, long var1, long var3);

   private static native boolean recovery$indy$27(Object var0, long var1, long var3);

   private static native boolean recovery$indy$28(Object var0, long var1, long var3);

   private static native boolean recovery$indy$29(
      Object var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      int var5,
      byte var6,
      boolean var7,
      boolean var8,
      int var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      long var14,
      long var16
   );

   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);

   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);

   private static native C_47oo recovery$indy$32(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$33(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$34(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$35();

   private static native C_45n recovery$indy$36();

   private static native MethodHandle recovery$constant$37();
}
