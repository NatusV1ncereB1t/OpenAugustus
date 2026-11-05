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
import net.C_45n;
import net.C_46_;
import net.C_474z;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47LS;
import client.module.Module;
import client.setting.ShaderOptions;
import net.C_47TA;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class Scoreboard_47Hm extends Module implements RenderListener {
   public final BooleanSetting settingRemove;
   public final BooleanSetting settingStick;
   public final BooleanSetting settingTransparent;
   public final BooleanSetting settingRounded;
   public final NumberSetting settingRoundFactor;
   public final NumberSetting settingPositionX;
   public final NumberSetting settingPositionY;
   public final NumberSetting settingScale;
   public final ShaderOptions field_45;
   private static final long a = C_4f.a(6299325966633928690L, 8400483488667106487L, MethodHandles.lookup().lookupClass()).a(146831219213509L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[31];
   private static final String[] f = new String[31];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(int var0, long var1);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 79469613767391L;
      long var10001 = var6 ^ 114103840337383L;
      int var10 = (int)((var6 ^ 114103840337383L) >>> 48);
      int var11 = (int)((var6 ^ 114103840337383L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      int[] var13 = recovery$indy$1(1630450087376045998L, var6);
      boolean var10000 = recovery$indy$2(this.settingRemove, 1630398043958592700L, var6);
      if (var13 == null) {
         if (var10000) {
            return;
         }

         var10000 = recovery$indy$3(ClientGlobals.field_48.field_41s, (short)var10, (short)var11, var12, 1630966898165474371L, var6);
      }

      if (!var10000) {
         GL11.glPushMatrix();
         ScaledResolution var14 = new ScaledResolution(field_43);
         GL11.glScaled(1.0F / var14.method_40$8abf5c6871(), 1.0F / var14.method_40$8abf5c6871(), 1.0);
         GL11.glScaled(recovery$indy$4(this.settingScale, var8, 1630333998205941525L, var6), recovery$indy$5(this.settingScale, var8, 1630333998205941525L, var6), 1.0);
         GlStateManager.method_426$da8c82d5d4();
         GlStateManager.method_42p$da8c82d5d4();
         GlStateManager.method_46$3ebc9ac54d(516, 0.1F);
         ScaledResolution var15 = new ScaledResolution(
            field_43.field_44f * (1.0 / recovery$indy$6(this.settingScale, var8, 1630333998205941525L, var6)),
            field_43.field_44g * (1.0 / recovery$indy$7(this.settingScale, var8, 1630333998205941525L, var6)),
            (int)recovery$indy$8(this.settingScale, var8, 1630333998205941525L, var6)
         );
         C_47TA var16 = recovery$indy$9(field_43, 1630530910269049728L, var6).method_49$d774fd0a7c();
         if (var13 == null) {
            if (var16 != null) {
               C_474z var17;
               label50: {
                  var17 = null;
                  C_46_ var18 = var16.method_49$7fb0be9c6d(recovery$indy$10(field_43, 1631421732367969291L, var6).method_41$0e30dfc966());
                  C_46_ var21 = var18;
                  if (var13 == null) {
                     if (var18 == null) {
                        break label50;
                     }

                     var21 = var18;
                  }

                  int var19 = var21.method_46$bdfcbf4331().method_49$8abf5c6871();
                  if (var19 >= 0) {
                     var17 = var16.method_41$41cf6f2ce6(3 + var19);
                  }
               }

               C_474z var22 = var17;
               if (var13 == null) {
                  var22 = var17 != null ? var17 : var16.method_41$41cf6f2ce6(1);
               }

               C_474z var20 = var22;
               if (var13 != null) {
                  return;
               }

               if (var20 != null) {
                  recovery$indy$11(field_43, 1631234207491432182L, var6)
                     .method_46$c32d3654ad(var20, var15, recovery$indy$12(this.settingTransparent, 1630398043958592700L, var6));
               }
            }

            GlStateManager.method_42O$da8c82d5d4();
            GL11.glPopMatrix();
            RenderUtils.method_41$da8c82d5d4();
         }
      }
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 126466223972986L;
      long var10000 = 332053929303004565L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 331967422393865863L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 42102180080830L;
      long var10000 = -3864119242764379311L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -3864308574877509565L;
      BooleanSetting var4 = this.settingRemove;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var6) {
            return false;
         }

         var10001 = -3864308574877509565L;
         BooleanSetting var5 = this.settingRounded;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_455$aae029aa0a() {
      long var1 = a ^ 130594056150397L;
      long var10000 = -4927865389927863662L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -4927950230860502656L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_45U$aae029aa0a() {
      long var1 = a ^ 100261299153521L;
      long var10000 = -3706293852388909666L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -3706380345876406644L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_45T$aae029aa0a() {
      long var1 = a ^ 75642988368901L;
      long var10000 = -5556168142511119382L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -5556222214159638280L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 32, var3, -7099028786980763966L, var1);
   }

   private boolean method_45_$aae029aa0a() {
      long var1 = a ^ 127213471842272L;
      long var10000 = -7421455014738573297L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -7421542775593743587L;
      BooleanSetting var4 = this.settingRemove;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var6) {
            return false;
         }

         var10001 = -7421542775593743587L;
         BooleanSetting var5 = this.settingStick;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : !var6;
   }

   private boolean method_454$aae029aa0a() {
      long var1 = a ^ 20365805119751L;
      long var10000 = 5757518743545552616L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 5757292594011217402L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_45E$aae029aa0a() {
      long var1 = a ^ 43636375358639L;
      long var10000 = 3048626751276907328L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 3048433605282232402L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Scoreboard_47Hm(short var1, int var2, char var3) {
      super("Scoreboard", "Spielstandanzeige", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 19839029324663L), new Color(34, 162, 162), Category.RENDER);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 117640181211729L;
      long var8 = var4 ^ 10809258756046L;
      long var10 = var4 ^ 130425973175427L;
      long var12 = var4 ^ 109056231307116L;
      long var14 = var4 ^ 86275469166827L;
      long var16 = var4 ^ 19839029324663L;
      // Super arguments moved to the required Java constructor position.
      this.settingRemove = new BooleanSetting(this, var12, "Remove", false);
      BooleanSetting var10001 = new BooleanSetting(this, var12, "Stick", false);
      C_45n var10003 = recovery$indy$14(this);
      long var10004 = -6716088399402442325L;
      C_45n var18 = var10003;
      long var19 = var6;
      BooleanSetting var21 = var10001;
      this.settingStick = (BooleanSetting)var21.method_43$780fd62a21(var19, var18);
      var10001 = new BooleanSetting(this, var12, "Transparent", false);
      var10003 = recovery$indy$15(this);
      var10004 = -6716088399402442325L;
      C_45n var22 = var10003;
      long var23 = var6;
      BooleanSetting var25 = var10001;
      this.settingTransparent = (BooleanSetting)var25.method_43$780fd62a21(var23, var22);
      var10001 = new BooleanSetting(this, var12, "Rounded", false);
      var10003 = recovery$indy$16(this);
      var10004 = -6716088399402442325L;
      C_45n var26 = var10003;
      long var27 = var6;
      BooleanSetting var29 = var10001;
      this.settingRounded = (BooleanSetting)var29.method_43$780fd62a21(var27, var26);
      NumberSetting var48 = new NumberSetting(this, "RoundFactor", 3.0, var14, 0.0, 8.0, 1);
      C_45n var10002 = recovery$indy$17(this);
      long var59 = -6716319683947617103L;
      C_45n var30 = var10002;
      NumberSetting var31 = var48;
      this.settingRoundFactor = var31.method_43$9db6d416f4(var30);
      NumberSetting var49 = new NumberSetting(this, "PositionX", 100.0, var14, 0.0, 100.0, 1);
      var10002 = recovery$indy$18(this);
      long var60 = -6716319683947617103L;
      C_45n var32 = var10002;
      NumberSetting var33 = var49;
      this.settingPositionX = var33.method_43$9db6d416f4(var32);
      NumberSetting var50 = new NumberSetting(this, "PositionY", 60.0, var14, 0.0, 100.0, 1);
      var10002 = recovery$indy$19(this);
      long var61 = -6716319683947617103L;
      C_45n var34 = var10002;
      NumberSetting var35 = var50;
      this.settingPositionY = var35.method_43$9db6d416f4(var34);
      NumberSetting var51 = new NumberSetting(this, "Scale", 2.0, var14, 1.0, 4.0, 2);
      var10002 = recovery$indy$20(this);
      long var62 = -6716319683947617103L;
      C_45n var36 = var10002;
      NumberSetting var37 = var51;
      this.settingScale = var37.method_43$9db6d416f4(var36);
      ShaderOptions var52 = new ShaderOptions(this, var8);
      var10004 = -6716494031274652711L;
      Color var38 = Color.black;
      long var39 = var10;
      ShaderOptions var41 = var52;
      ShaderOptions var53 = var41.method_44$10ed55120d(var39, var38);
      var10003 = recovery$indy$21(this);
      var10004 = -6716088399402442325L;
      C_45n var42 = var10003;
      long var43 = var6;
      ShaderOptions var45 = var53;
      this.field_45 = (ShaderOptions)var45.method_43$780fd62a21(var43, var42);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, short var1, short var2, int var3, long var4, long var6);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native WorldClient recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native C_47LS recovery$indy$11(Object var0, long var1, long var3);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$14(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$15(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$16(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$17(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$18(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$19(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$20(Scoreboard_47Hm var0);

   private static native C_45n recovery$indy$21(Scoreboard_47Hm var0);

   private static native MethodHandle recovery$constant$22();
}
