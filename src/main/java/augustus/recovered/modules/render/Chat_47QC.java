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
import net.minecraft.client.gui.ScaledResolution;
import net.C_47LS;
import net.C_47LU;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;

public class Chat_47QC extends Module implements RenderListener {
   public final BooleanSetting settingRemove;
   public final BooleanSetting settingNoChatLimit;
   public final BooleanSetting settingBackGround;
   public final BooleanSetting settingCustomBackGroundColor;
   public final ColorSetting settingBackGroundColor;
   public final ShaderOptions field_46;
   private static final long a = C_4f.a(-6845487694388612886L, 4320805862213472262L, MethodHandles.lookup().lookupClass()).a(166632282348415L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[27];
   private static final String[] f = new String[27];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private boolean method_49y$aae029aa0a() {
      long var1 = a ^ 81752974074815L;
      long var10000 = 885629918234520443L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 885987436446080711L;
      BooleanSetting var4 = this.settingRemove;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var6) {
            return false;
         }

         var10001 = 885987436446080711L;
         BooleanSetting var5 = this.settingBackGround;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_49n$aae029aa0a() {
      long var1 = a ^ 136457923291148L;
      long var10000 = -4037101072016056120L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -4037302655534361228L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   private boolean method_49C$aae029aa0a() {
      long var1 = a ^ 23686858559804L;
      long var10000 = -87472306944517640L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -87548404940198844L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }

   private boolean method_497$a10325316f(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      int[] var5 = recovery$indy$1(-2018397132673432372L, var3);
      boolean var10000 = recovery$indy$2(this.settingRemove, -2018459435032825488L, var3);
      if (var5 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      int var14;
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      int var8 = (int)((var6 ^ 140728435956397L) >>> 32);
      int var9 = (int)((var6 ^ 140728435956397L) << 32 >>> 32);
      long var10001 = var6 ^ 48982798476343L;
      int var10 = (int)((var6 ^ 48982798476343L) >>> 32);
      int var11 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      int[] var13 = recovery$indy$3(1630408942787604881L, var6);
      if (recovery$indy$4(this, var8, var9, 1631405284242635394L, var6)) {
         C_47LU var10000;
         boolean var10002;
         int var10003;
         label34: {
            label38: {
               GlStateManager.method_426$da8c82d5d4();
               GlStateManager.method_42$c151fe78a0(0.0F, var5.method_48$8abf5c6871() - 48, 0.0F);
               GlStateManager.method_42z$da8c82d5d4();
               var10000 = recovery$indy$5(field_43, 1630581244047342314L, var6).method_48$9b8db3ed78();
               var14 = recovery$indy$6(field_43, 1630581244047342314L, var6).method_44$8abf5c6871();
               var10002 = recovery$indy$7(this.settingBackGround, 1630772682997482541L, var6);
               var10003 = (int) ((recovery$indy$8(this.settingCustomBackGroundColor, 1630772682997482541L, var6)) ? 1 : 0);
               int[] var10004 = var13;
               if (var3 >= 0) {
                  if (var13 == null) {
                     if (var10003 == 0) {
                        break label38;
                     }

                     var10003 = (int) ((recovery$indy$9(this.settingBackGround, 1630772682997482541L, var6)) ? 1 : 0);
                  }

                  var10004 = var13;
               }

               if (var10004 != null) {
                  break label34;
               }

               if (var10003 != 0) {
                  var10003 = recovery$indy$10(this.settingBackGroundColor, var10, (short)var11, (char)var12, 0, 1631152103398083616L, var6);
                  break label34;
               }
            }

            var10003 = Integer.MIN_VALUE;
         }

         var10000.method_45$91efd2c5e4(var14, var10002, var10003);
         GlStateManager.method_42O$da8c82d5d4();
      }

      RenderUtils.method_41$da8c82d5d4();
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 78725472951163L;
      long var10000 = 3787085784615523263L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 3787427377960773123L;
      BooleanSetting var4 = this.settingRemove;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var6) {
            return false;
         }

         var10001 = 3787427377960773123L;
         BooleanSetting var5 = this.settingBackGround;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 115081010781929L;
      long var10000 = 3538775180890183213L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 3539136691609396113L;
      BooleanSetting var4 = this.settingRemove;
      boolean var7 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var7) {
            return false;
         }

         var10001 = 3539136691609396113L;
         BooleanSetting var5 = this.settingBackGround;
         var7 = var5.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (!var7) {
            return false;
         }

         var10001 = 3539136691609396113L;
         BooleanSetting var6 = this.settingCustomBackGroundColor;
         var7 = var6.method_49$aae029aa0a();
      }

      return var3 != null ? var7 : var7;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$11(this, 32, var3, -7099858692990191986L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Chat_47QC(long var1) {
      super("Chat", "Plaudern", ((a ^ var1) ^ 107962014776693L), new Color(169, 3, 252), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 29436681909331L;
      long var5 = var1 ^ 134068574802380L;
      long var7 = var1 ^ 7305035604609L;
      long var9 = var1 ^ 20978200273262L;
      long var11 = var1 ^ 131408982581579L;
      long var13 = var1 ^ 107962014776693L;
      // Super arguments moved to the required Java constructor position.
      this.settingRemove = new BooleanSetting(this, var9, "Remove", false);
      BooleanSetting var10001 = new BooleanSetting(this, var9, "NoChatLimit", true);
      C_45n var10003 = recovery$indy$12(this);
      long var10004 = 3804126138004756772L;
      C_45n var15 = var10003;
      long var16 = var3;
      BooleanSetting var18 = var10001;
      this.settingNoChatLimit = (BooleanSetting)var18.method_43$780fd62a21(var16, var15);
      var10001 = new BooleanSetting(this, var9, "BackGround", true);
      var10003 = recovery$indy$13(this);
      var10004 = 3804126138004756772L;
      C_45n var19 = var10003;
      long var20 = var3;
      BooleanSetting var22 = var10001;
      this.settingBackGround = (BooleanSetting)var22.method_43$780fd62a21(var20, var19);
      var10001 = new BooleanSetting(this, var9, "CustomBackGroundColor", false);
      var10003 = recovery$indy$14(this);
      var10004 = 3804126138004756772L;
      C_45n var23 = var10003;
      long var24 = var3;
      BooleanSetting var26 = var10001;
      this.settingCustomBackGroundColor = (BooleanSetting)var26.method_43$780fd62a21(var24, var23);
      ColorSetting var42 = new ColorSetting(var11, this, "BackGroundColor", new Color(0, 0, 0, 150));
      var10003 = recovery$indy$15(this);
      var10004 = 3804126138004756772L;
      C_45n var27 = var10003;
      long var28 = var3;
      ColorSetting var30 = var42;
      this.settingBackGroundColor = (ColorSetting)var30.method_43$780fd62a21(var28, var27);
      ShaderOptions var43 = new ShaderOptions(this, var5);
      var10004 = 3803613908637951463L;
      Color var31 = Color.black;
      long var32 = var7;
      ShaderOptions var34 = var43;
      ShaderOptions var44 = var34.method_44$10ed55120d(var32, var31);
      var10003 = recovery$indy$16(this);
      var10004 = 3804126138004756772L;
      C_45n var35 = var10003;
      long var36 = var3;
      ShaderOptions var38 = var44;
      this.field_46 = (ShaderOptions)var38.method_43$780fd62a21(var36, var35);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native int[] recovery$indy$3(long var0, long var2);

   private static native boolean recovery$indy$4(Object var0, int var1, int var2, long var3, long var5);

   private static native C_47LS recovery$indy$5(Object var0, long var1, long var3);

   private static native C_47LS recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native int recovery$indy$10(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$11(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$12(Chat_47QC var0);

   private static native C_45n recovery$indy$13(Chat_47QC var0);

   private static native C_45n recovery$indy$14(Chat_47QC var0);

   private static native C_45n recovery$indy$15(Chat_47QC var0);

   private static native C_45n recovery$indy$16(Chat_47QC var0);

   private static native MethodHandle recovery$constant$17();
}
