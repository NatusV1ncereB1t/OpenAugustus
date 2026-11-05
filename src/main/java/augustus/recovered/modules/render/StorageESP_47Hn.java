package augustus.recovered.modules.render;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_470;
import client.render.RenderPass;
import net.C_4725;
import net.C_477A;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478Q;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Fw;
import net.C_47K;
import net.minecraft.entity.Entity;
import net.C_47N;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TX;
import client.setting.Setting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47b0;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oO;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47uI;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class StorageESP_47Hn extends client.module.Module implements client.event.RenderListener,net.C_47xz,net.C_47oO {
    private final client.setting.MultiSelectSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBoxChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBoxEnderChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBoxLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBoxExpand = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBoxPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingBoxShader = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingBlockBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBlockBoxChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBlockBoxEnderChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBlockBoxLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBlockBoxPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingBlockBoxShader = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup setting3DCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCorner3ChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCorner3EnderChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCorner3DPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingCorner3DShader = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingReal2D = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingReal2DColorChest1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingReal2DColorChest2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingReal2DColorEnderChest1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingReal2DColorEnderChest2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingReal2DPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingReal2DShader = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingCornerChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingCornerEnderChestColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCornerLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCornerHorizontalPercentage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCornerVerticalPercentage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCornerPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingCornerShader = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.HashMap field_45g = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47b0 field_45s = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap field_451 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   private void method_46$ad0e900906(RenderPass var1) {
      long var2 = a ^ 2553996243152L;
      long var4 = var2 ^ 99316574462145L;
      long var6 = var2 ^ 83458075404639L;
      long var8 = var2 ^ 83187942845805L;
      long var10 = var2 ^ 4028523628808L;
      long var10000 = 7291301953774369737L;
      int[] var12 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var13 = 0;

      while (var13 < this.field_43h.size()) {
         C_47K var14 = (C_47K)this.field_43h.get(var13);
         long var10006 = 7291224412645634028L;
         long var17 = var10;
         int var19 = var13;
         ColorSetting var20 = this.settingBoxEnderChestColor;
         ColorSetting var21 = this.settingBoxChestColor;
         C_47K var22 = var14;
         StorageESP_47Hn var23 = this;
         int var15 = var23.method_47$8624e6cd4d(var22, var21, var20, var19, var17);
         long var10004 = 7292757572667606655L;
         long var24 = var8;
         NumberSetting var26 = this.settingBoxLineWidth;
         C_47K var27 = var14;
         StorageESP_47Hn var28 = this;
         float var16 = var28.method_41$c72cb14121(var27, var26, var24);
         var10006 = 7290979850373342709L;
         int var29 = var13;
         int var30 = var15;
         RenderPass var31 = var1;
         long var32 = var4;
         ShaderOptions var34 = this.settingBoxShader;
         int var10001 = var34.method_42$f6a9c2ec55(var32, var31, var30, var29);
         var10006 = 7291077558909879036L;
         long var35 = var6;
         NumberSetting var37 = this.settingBoxExpand;
         RenderUtils.method_45$bf9efb3833(var14, var10001, 1.0F, var16, var37.method_44$474dfaa627(var35), false);
         var13++;
         if (var12 != null) {
            break;
         }
      }
   }




    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private void method_42$ad0e900906(RenderPass var1) {
      long var2 = a ^ 21951822061933L;
      long var4 = var2 ^ 83521437938044L;
      long var6 = var2 ^ 99012339301584L;
      long var8 = var2 ^ 19844330150069L;
      long var10000 = -823321061514630540L;
      int[] var10 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var11 = 0;

      while (var11 < this.field_43h.size()) {
         C_47K var12 = (C_47K)this.field_43h.get(var11);
         long var10006 = -823401869754646959L;
         long var15 = var8;
         int var17 = var11;
         ColorSetting var18 = this.settingBlockBoxEnderChestColor;
         ColorSetting var19 = this.settingBlockBoxChestColor;
         C_47K var20 = var12;
         StorageESP_47Hn var21 = this;
         int var13 = var21.method_47$8624e6cd4d(var20, var19, var18, var17, var15);
         long var10004 = -826403960064370750L;
         long var22 = var6;
         NumberSetting var24 = this.settingBlockBoxLineWidth;
         C_47K var25 = var12;
         StorageESP_47Hn var26 = this;
         float var14 = var26.method_41$c72cb14121(var25, var24, var22);
         var10006 = -823083208537066424L;
         int var27 = var11;
         int var28 = var13;
         RenderPass var29 = var1;
         long var30 = var4;
         ShaderOptions var32 = this.settingBlockBoxShader;
         RenderUtils.method_45$bf9efb3833(var12, var32.method_42$f6a9c2ec55(var30, var29, var28, var27), 1.0F, var14, 0.0, true);
         var11++;
         if (var10 != null) {
            break;
         }
      }
   }




   private void method_42$da8c82d5d4() {
      long var1 = a ^ 52906453051471L;
      long var3 = var1 ^ 9979572883083L;
      long var5 = var1 ^ 80375679888547L;
      long var7 = var1 ^ 108263857380209L;
      long var9 = var1 ^ 5678791789378L;
      long var10000 = -4778079294737095850L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -4777086514073761759L;
      C_4725 var12 = C_4725.BOX;
      boolean var23 = var12.method_43$aae029aa0a();
      if (var11 == null) {
         if (!var23) {
            return;
         }

         long var10002 = -4776402806254598999L;
         long var13 = var3;
         ShaderOptions var15 = this.settingBoxShader;
         boolean var24 = var15.method_49$0dd78e0064(var13);
         long var10003 = -4777037468405701947L;
         long var16 = var7;
         ShaderOptions var18 = this.settingBoxShader;
         boolean var25 = var18.method_47$0dd78e0064(var16);
         var10003 = -4777897771888508094L;
         C_47uI.method_40$9bd74f13d3(var24, var25, var5);
         var23 = true;
      }

      C_47Fw var26 = recovery$indy$1(this);
      long var28 = -4779648840307951940L;
      C_47Fw var19 = var26;
      long var20 = var9;
      boolean var22 = var23;
      C_47uI.method_42$300c7fd546(var22, var20, var19);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private float method_41$c72cb14121(C_47K var1, NumberSetting var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 106841787584967L;
      int[] var7 = recovery$indy$2(-7081977804577914031L, var3);
      float var8 = (float)(recovery$indy$3(var2, var5, -7082131813520459164L, var3) / 2.0);
      double var10000 = recovery$indy$4(field_43, -7084754265272547671L, var3)
         .method_49$4b58f7ab41(
            var1.method_43$5730377d31().method_40$8abf5c6871(),
            var1.method_43$5730377d31().method_43$8abf5c6871(),
            var1.method_43$5730377d31().method_47$8abf5c6871()
         );
      double var10001 = 1.0;
      if (var7 == null) {
         if (!(var10000 > 1.0)) {
            return var8;
         }

         var10000 = 1.0;
         var10001 = recovery$indy$5(field_43, -7084754265272547671L, var3)
               .method_49$4b58f7ab41(
                  var1.method_43$5730377d31().method_40$8abf5c6871(),
                  var1.method_43$5730377d31().method_43$8abf5c6871(),
                  var1.method_43$5730377d31().method_47$8abf5c6871()
               )
            / 20.0;
      }

      float var9 = (float)(var10000 - var10001);
      float var11 = var9;
      if (var7 == null) {
         if (var9 < 0.3) {
            var9 = 0.3F;
         }

         var11 = var8 * var9;
      }

      return var11;
   }



   private void method_44$da8c82d5d4() {
      long var1 = a ^ 53315443299068L;
      long var3 = var1 ^ 10380042417208L;
      long var5 = var1 ^ 80791245755920L;
      long var7 = var1 ^ 107839693185474L;
      long var9 = var1 ^ 5813037314545L;
      long var10000 = -8717884411580524059L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -8716891611666369902L;
      C_4725 var12 = C_4725.REAL_2D;
      boolean var23 = var12.method_43$aae029aa0a();
      if (var11 == null) {
         if (!var23) {
            return;
         }

         long var10002 = -8717334355713966566L;
         long var13 = var3;
         ShaderOptions var15 = this.settingReal2DShader;
         boolean var24 = var15.method_49$0dd78e0064(var13);
         long var10003 = -8716842593848502154L;
         long var16 = var7;
         ShaderOptions var18 = this.settingReal2DShader;
         boolean var25 = var18.method_47$0dd78e0064(var16);
         var10003 = -8718266113706903055L;
         C_47uI.method_40$9bd74f13d3(var24, var25, var5);
         var23 = false;
      }

      C_47Fw var26 = recovery$indy$6(this);
      long var28 = -8712135588506104817L;
      C_47Fw var19 = var26;
      long var20 = var9;
      boolean var22 = var23;
      C_47uI.method_42$300c7fd546(var22, var20, var19);
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      int[] var8 = recovery$indy$7(1634784535289546825L, var6);
      StorageESP_47Hn var10000 = this;
      if (var8 == null) {
         if (this.field_43h.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      for (Object recovered$element$12102 : var10000.field_46.values()) {
         Runnable var10 = (Runnable) recovered$element$12102;
         var10.run();
         RenderUtils.method_41$da8c82d5d4();
         if (var8 != null) {
            break;
         }
      }
   }



   private void method_48$ad0e900906(RenderPass var1) {
      long var2 = a ^ 70627220418106L;
      long var4 = var2 ^ 26652307340843L;
      long var6 = var2 ^ 72325082109922L;
      long var10000 = -304650412189899485L;
      int[] var8 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var9 = 0;

      while (var9 < this.field_43h.size()) {
         C_47K var10 = (C_47K)this.field_43h.get(var9);
         long var10006 = -304587159731588858L;
         long var12 = var6;
         int var14 = var9;
         ColorSetting var15 = this.settingCorner3EnderChestColor;
         ColorSetting var16 = this.settingCorner3ChestColor;
         C_47K var17 = var10;
         StorageESP_47Hn var18 = this;
         int var11 = var18.method_47$8624e6cd4d(var17, var16, var15, var14, var12);
         var10006 = -304976050341594337L;
         int var19 = var9;
         int var20 = var11;
         RenderPass var21 = var1;
         long var22 = var4;
         ShaderOptions var24 = this.settingCorner3DShader;
         RenderUtils.method_47$a896ad8163(var10, var24.method_42$f6a9c2ec55(var22, var21, var20, var19));
         var9++;
         if (var8 != null) {
            break;
         }
      }
   }



   private void method_48$da8c82d5d4() {
      long var1 = a ^ 54079759285716L;
      long var3 = var1 ^ 132604199085147L;
      this.field_46.clear();
      long var10003 = -1717227064823918600L;
      long var5 = var3;
      NumberSetting var7 = this.settingReal2DPriority;
      this.field_46.put((int)var7.method_44$474dfaa627(var5), recovery$indy$8(this));
      var10003 = -1717227064823918600L;
      long var8 = var3;
      NumberSetting var10 = this.settingCornerPriority;
      this.field_46.put((int)var10.method_44$474dfaa627(var8), recovery$indy$9(this));
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_43h.clear();
      this.field_45g.clear();
   }



   private void method_49$da8c82d5d4() {
      long var1 = a ^ 116405800317300L;
      long var3 = var1 ^ 88868859811760L;
      long var5 = var1 ^ 18524259923352L;
      long var7 = var1 ^ 65660603679306L;
      long var9 = var1 ^ 102163756454521L;
      long var10000 = 2633343484827564653L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 2634386845171224858L;
      C_4725 var12 = C_4725.BLOCK_BOX;
      boolean var23 = var12.method_43$aae029aa0a();
      if (var11 == null) {
         if (!var23) {
            return;
         }

         long var10002 = 2633927609581542802L;
         long var13 = var3;
         ShaderOptions var15 = this.settingBlockBoxShader;
         boolean var24 = var15.method_49$0dd78e0064(var13);
         long var10003 = 2634557934209989630L;
         long var16 = var7;
         ShaderOptions var18 = this.settingBlockBoxShader;
         boolean var25 = var18.method_47$0dd78e0064(var16);
         var10003 = 2632959308937239161L;
         C_47uI.method_40$9bd74f13d3(var24, var25, var5);
         var23 = true;
      }

      C_47Fw var26 = recovery$indy$10(this);
      long var28 = 2634640369289113479L;
      C_47Fw var19 = var26;
      long var20 = var9;
      boolean var22 = var23;
      C_47uI.method_42$300c7fd546(var22, var20, var19);
   }



   private void method_45$ad0e900906(RenderPass var1) {
      long var2 = a ^ 54762741481186L;
      long var4 = var2 ^ 116338432241395L;
      long var6 = var2 ^ 18447045691728L;
      long var10001 = var2 ^ 31546726521221L;
      int var8 = (int)((var2 ^ 31546726521221L) >>> 32);
      int var9 = (int)((var2 ^ 31546726521221L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var10000 = 3106881082454996475L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var12 = 0;

      while (var12 < this.field_43h.size()) {
         C_47K var13 = (C_47K)this.field_43h.get(var12);
         double[] var14 = (double[])this.field_45g.get(var13);
         RenderPass var46 = var1;
         RenderPass var50 = RenderPass.SHADOW;
         if (var11 == null) {
            if (var1 != RenderPass.SHADOW) {
               double var47 = var14[0];
               double var51 = var14[1];
               double var10002 = var14[2];
               double var10003 = var14[3];
               int var10004 = (int) ((var13 instanceof C_470) ? 1 : 0);
               if (var11 == null) {
                  if (var10004 != 0) {
                     short var10006 = (short)var9;
                     char var10007 = (char)var10;
                     long var10009 = 3105750154023339264L;
                     int var16 = var12;
                     char var17 = var10007;
                     short var18 = var10006;
                     int var19 = var8;
                     ColorSetting var20 = this.settingReal2DColorEnderChest1;
                     var10004 = var20.method_47$24af287d8f(var19, var18, var17, var16);
                  } else {
                     short var61 = (short)var9;
                     char var62 = (char)var10;
                     long var63 = 3105750154023339264L;
                     int var21 = var12;
                     char var22 = var62;
                     short var23 = var61;
                     int var24 = var8;
                     ColorSetting var25 = this.settingReal2DColorChest1;
                     var10004 = var25.method_47$24af287d8f(var24, var23, var22, var21);
                  }
               }

               RenderUtils.method_40$56a5fc1016(var47, var51, var10002, var10003, var10004);
            }

            var46 = var1;
            var50 = RenderPass.BLUR;
         }

         if (var46 != var50) {
            int var48 = (int) ((var13 instanceof C_470) ? 1 : 0);
            if (var11 == null) {
               if (var48 != 0) {
                  short var53 = (short)var9;
                  char var56 = (char)var10;
                  long var10005 = 3105750154023339264L;
                  int var26 = var12;
                  char var27 = var56;
                  short var28 = var53;
                  int var29 = var8;
                  ColorSetting var30 = this.settingReal2DColorEnderChest2;
                  var48 = var30.method_47$24af287d8f(var29, var28, var27, var26);
               } else {
                  short var54 = (short)var9;
                  char var57 = (char)var10;
                  long var59 = 3105750154023339264L;
                  int var31 = var12;
                  char var32 = var57;
                  short var33 = var54;
                  int var34 = var8;
                  ColorSetting var35 = this.settingReal2DColorChest2;
                  var48 = var35.method_47$24af287d8f(var34, var33, var32, var31);
               }
            }

            int var15 = var48;
            double var49 = var14[0];
            double var52 = var14[1];
            double var55 = var14[2];
            double var58 = var14[3];
            ShaderOptions var60 = this.settingReal2DShader;
            long var10011 = 3100630147855832383L;
            long var36 = var6;
            int var38 = var15;
            RenderPass var39 = var1;
            int var10008 = C_47TX.method_40$6b468acafc(var39, var38, var36);
            long var10010 = 3106621827670207431L;
            int var40 = var12;
            int var41 = var10008;
            RenderPass var42 = var1;
            long var43 = var4;
            ShaderOptions var45 = var60;
            RenderUtils.method_43$4f91566a26(var49, var52, var55, var58, 1.0F, var45.method_42$f6a9c2ec55(var43, var42, var41, var40));
         }

         var12++;
         if (var11 != null) {
            break;
         }
      }
   }





   private void method_45$da8c82d5d4() {
      long var1 = a ^ 76473581178327L;
      long var3 = var1 ^ 136892789467923L;
      long var5 = var1 ^ 66566375475515L;
      long var7 = var1 ^ 26270137188073L;
      long var9 = var1 ^ 123941627440858L;
      long var10000 = -7482537673870489906L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -7481582119896994375L;
      C_4725 var12 = C_4725.CORNER_3D;
      boolean var23 = var12.method_43$aae029aa0a();
      if (var11 == null) {
         if (!var23) {
            return;
         }

         long var10002 = -7480835879423499983L;
         long var13 = var3;
         ShaderOptions var15 = this.settingCorner3DShader;
         boolean var24 = var15.method_49$0dd78e0064(var13);
         long var10003 = -7481332029716347043L;
         long var16 = var7;
         ShaderOptions var18 = this.settingCorner3DShader;
         boolean var25 = var18.method_47$0dd78e0064(var16);
         var10003 = -7482437377977768230L;
         C_47uI.method_40$9bd74f13d3(var24, var25, var5);
         var23 = true;
      }

      C_47Fw var26 = recovery$indy$11(this);
      long var28 = -7479578312316742876L;
      C_47Fw var19 = var26;
      long var20 = var9;
      boolean var22 = var23;
      C_47uI.method_42$300c7fd546(var22, var20, var19);
   }



   private int method_47$8624e6cd4d(C_47K var1, ColorSetting var2, ColorSetting var3, int var4, long var5) {
      var5 = a ^ var5;
      long var10001 = var5 ^ 85654732999498L;
      int var7 = (int)((var5 ^ 85654732999498L) >>> 32);
      int var8 = (int)((var5 ^ 85654732999498L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      int[] var10 = recovery$indy$12(-5056826925085956300L, var5);
      byte var10000 = (byte) ((var1 instanceof C_470) ? 1 : 0);
      if (var10 == null) {
         var10000 = (byte)(var10000 != 0
            ? recovery$indy$13(var3, var7, (short)var8, (char)var9, var4, -5055706088080435249L, var5)
            : recovery$indy$14(var2, var7, (short)var8, (char)var9, var4, -5055706088080435249L, var5));
      }

      return var10000;
   }



   private void method_47$acf62e0bf1(C_47K var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$15(1385642438627380700L, var2);
      C_478Q var5 = var1.method_43$5730377d31();
      if (var4 == null
         && this.field_45s
            .method_41$a9269b572f(
               var5.method_40$8abf5c6871(),
               var5.method_43$8abf5c6871(),
               var5.method_47$8abf5c6871(),
               var5.method_40$8abf5c6871() + 1,
               var5.method_43$8abf5c6871() + 1,
               var5.method_47$8abf5c6871() + 1
            )) {
         this.field_43h.add(var1);
      }
   }



   private void method_47$ad0e900906(RenderPass var1) {
      long var2 = a ^ 116609772301701L;
      long var4 = var2 ^ 55040058588564L;
      long var6 = var2 ^ 39287860491274L;
      long var8 = var2 ^ 82494180661815L;
      long var10001 = var2 ^ 78551439313634L;
      int var10 = (int)((var2 ^ 78551439313634L) >>> 32);
      int var11 = (int)((var2 ^ 78551439313634L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var10000 = -5153665939873274212L;
      int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
      int var14 = 0;

      while (var14 < this.field_43h.size()) {
         C_47K var15 = (C_47K)this.field_43h.get(var14);
         double[] var16 = (double[])this.field_45g.get(var15);
         int var47 = (int) ((var15 instanceof C_470) ? 1 : 0);
         if (var13 == null) {
            if (var47 != 0) {
               short var10002 = (short)var11;
               char var10003 = (char)var12;
               long var10005 = -5152526376676125081L;
               int var18 = var14;
               char var19 = var10003;
               short var20 = var10002;
               int var21 = var10;
               ColorSetting var22 = this.settingCornerEnderChestColor;
               var47 = var22.method_47$24af287d8f(var21, var20, var19, var18);
            } else {
               short var50 = (short)var11;
               char var52 = (char)var12;
               long var54 = -5152526376676125081L;
               int var23 = var14;
               char var24 = var52;
               short var25 = var50;
               int var26 = var10;
               ColorSetting var27 = this.settingCornerChestColor;
               var47 = var27.method_47$24af287d8f(var26, var25, var24, var23);
            }
         }

         int var17 = var47;
         double var48 = var16[0];
         double var49 = var16[1];
         double var51 = var16[2];
         double var53 = var16[3];
         long var10006 = -5153679056706560087L;
         long var28 = var6;
         NumberSetting var30 = this.settingCornerLineWidth;
         float var10004 = (float)var30.method_44$474dfaa627(var28);
         long var10007 = -5153679056706560087L;
         long var31 = var6;
         NumberSetting var33 = this.settingCornerHorizontalPercentage;
         double var55 = var33.method_44$474dfaa627(var31);
         long var10008 = -5153679056706560087L;
         long var34 = var6;
         NumberSetting var36 = this.settingCornerVerticalPercentage;
         double var56 = var36.method_44$474dfaa627(var34);
         ShaderOptions var57 = this.settingCornerShader;
         long var10013 = -5160846510470019496L;
         long var37 = var8;
         int var39 = var17;
         RenderPass var40 = var1;
         int var10010 = C_47TX.method_40$6b468acafc(var40, var39, var37);
         long var10012 = -5153336406070822752L;
         int var41 = var14;
         int var42 = var10010;
         RenderPass var43 = var1;
         long var44 = var4;
         ShaderOptions var46 = var57;
         RenderUtils.method_43$da1bfc93ea(var48, var49, var51, var53, var10004, var55, var56, var46.method_42$f6a9c2ec55(var44, var43, var42, var41));
         var14++;
         if (var13 != null) {
            break;
         }
      }
   }




   private void method_47$da8c82d5d4() {
      long var1 = a ^ 114059218994618L;
      long var3 = var1 ^ 104117683479422L;
      long var5 = var1 ^ 33791438831958L;
      long var7 = var1 ^ 59190583146116L;
      long var9 = var1 ^ 90746068821687L;
      long var10000 = -3439187090176766301L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -3440408706645269036L;
      C_4725 var12 = C_4725.CORNER;
      boolean var23 = var12.method_43$aae029aa0a();
      if (var11 == null) {
         if (!var23) {
            return;
         }

         long var10002 = -3439737095727847076L;
         long var13 = var3;
         ShaderOptions var15 = this.settingCornerShader;
         boolean var24 = var15.method_49$0dd78e0064(var13);
         long var10003 = -3440228838391541968L;
         long var16 = var7;
         ShaderOptions var18 = this.settingCornerShader;
         boolean var25 = var18.method_47$0dd78e0064(var16);
         var10003 = -3439579237699752265L;
         C_47uI.method_40$9bd74f13d3(var24, var25, var5);
         var23 = false;
      }

      C_47Fw var26 = recovery$indy$16(this);
      long var28 = -3432287078359344311L;
      C_47Fw var19 = var26;
      long var20 = var9;
      boolean var22 = var23;
      C_47uI.method_42$300c7fd546(var22, var20, var19);
   }



   private void method_43$da8c82d5d4() {
      long var1 = a ^ 65162135460151L;
      long var3 = var1 ^ 126403086778552L;
      this.field_451.clear();
      long var10003 = 5532713347658771227L;
      long var5 = var3;
      NumberSetting var7 = this.settingBoxPriority;
      this.field_451.put((int)var7.method_44$474dfaa627(var5), recovery$indy$17(this));
      var10003 = 5532713347658771227L;
      long var8 = var3;
      NumberSetting var10 = this.settingBlockBoxPriority;
      this.field_451.put((int)var10.method_44$474dfaa627(var8), recovery$indy$18(this));
      var10003 = 5532713347658771227L;
      long var11 = var3;
      NumberSetting var13 = this.settingCorner3DPriority;
      this.field_451.put((int)var13.method_44$474dfaa627(var11), recovery$indy$19(this));
   }



   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 138341576030118L;
      int[] var6 = recovery$indy$20(8135075284956294659L, var1);
      StorageESP_47Hn var10000 = this;
      if (var6 == null) {
         if (this.field_43h.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      ObjectIterator var7 = var10000.field_451.values().iterator();

      label137:
      while (true) {
         Object var14;
         if (var7.hasNext()) {
            var14 = var7.next();
         } else {
            var14 = C_4725.REAL_2D;
            if (var1 >= 0L) {
               boolean var17 = recovery$indy$21(C_4725.REAL_2D, 8133831658961487220L, var1);
               if (var6 == null) {
                  if (var17) {
                     break;
                  }

                  var17 = recovery$indy$22(C_4725.CORNER, 8133831658961487220L, var1);
               }

               if (!var17) {
                  return;
               }
               break;
            }
         }

         do {
            Runnable var8 = (Runnable)var14;
            GL11.glPushMatrix();
            RenderUtils.method_42$da8c82d5d4();
            var8.run();
            RenderUtils.method_43$da8c82d5d4();
            GL11.glPopMatrix();
            int[] var15 = var6;
            if (var1 >= 0L) {
               if (var6 != null) {
                  break label137;
               }

               var15 = var6;
            }

            if (var15 == null) {
               continue label137;
            }

            var14 = C_4725.REAL_2D;
         } while (var1 < 0L);

         boolean var16 = recovery$indy$21(C_4725.REAL_2D, 8133831658961487220L, var1);
         if (var6 == null) {
            if (var16) {
               break;
            }

            var16 = recovery$indy$22(C_4725.CORNER, 8133831658961487220L, var1);
         }

         if (!var16) {
            return;
         }
         break;
      }

      ScaledResolution var12 = new ScaledResolution(field_43);

      for (Object recovered$element$30039 : this.field_43h) {
         C_47K var9 = (C_47K) recovered$element$30039;
         C_478i var10 = var9.method_46$e084f7739d().method_42$f487e42d4b(recovery$indy$23(field_43, 8142284850922608691L, var1), var9.method_43$5730377d31());
         label103:
         if (var6 == null) {
            label101:
            if (var9 instanceof C_47N) {
               C_47N var11 = (C_47N)var9;
               C_47N var18 = var11.field_40Y;
               int[] var10001 = var6;
               if (var1 > 0L) {
                  if (var6 == null) {
                     if (var11.field_40Y != null) {
                        var10 = var10.method_44$cf3537e63f(
                           var11.field_40Y
                              .method_46$e084f7739d()
                              .method_42$f487e42d4b(recovery$indy$24(field_43, 8142284850922608691L, var1), var11.field_40Y.method_43$5730377d31())
                        );
                        if (var6 == null) {
                           break label101;
                        }
                     }

                     var18 = var11.field_48;
                  }

                  var10001 = var6;
               }

               if (var1 >= 0L) {
                  if (var10001 == null) {
                     if (var18 != null) {
                        var10 = var10.method_44$cf3537e63f(
                           var11.field_48
                              .method_46$e084f7739d()
                              .method_42$f487e42d4b(recovery$indy$25(field_43, 8142284850922608691L, var1), var11.field_48.method_43$5730377d31())
                        );
                        if (var6 == null) {
                           break label101;
                        }
                     }

                     var18 = var11.field_49;
                  }

                  var10001 = var6;
               }

               if (var1 >= 0L) {
                  if (var10001 == null) {
                     if (var18 != null) {
                        var10 = var10.method_44$cf3537e63f(
                           var11.field_49
                              .method_46$e084f7739d()
                              .method_42$f487e42d4b(recovery$indy$26(field_43, 8142284850922608691L, var1), var11.field_49.method_43$5730377d31())
                        );
                        if (var6 == null) {
                           break label101;
                        }
                     }

                     var18 = var11.field_42;
                  }

                  var10001 = var6;
               }

               if (var10001 != null) {
                  break label103;
               }

               if (var18 != null) {
                  var10 = var10.method_44$cf3537e63f(
                     var11.field_42
                        .method_46$e084f7739d()
                        .method_42$f487e42d4b(recovery$indy$27(field_43, 8142284850922608691L, var1), var11.field_42.method_43$5730377d31())
                  );
               }
            }

            this.field_45g.put(var9, recovery$indy$28(var4, var10, var12, 8134904391810185234L, var1));
         }

         if (var6 != null) {
            break;
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$29(this, 32, -9, var3, -7101385111657251049L, var1);
      recovery$indy$30(this, 40, var5, -7102035306567213566L, var1);
      recovery$indy$31(this, 17, var5, -7102035306567213566L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 113186446332478L;
      long var8 = var4 ^ 121495366703233L;
      int[] var10 = recovery$indy$32(2183899920422420648L, var4);
      net.minecraft.client.multiplayer.WorldClient var10000 = recovery$indy$33(field_43, 2185484248505398936L, var4);
      int[] var83 = var10;
      net.minecraft.client.multiplayer.WorldClient var19 = var10000;
      if (var83 == null) {
         var19 = var19;
         net.minecraft.client.multiplayer.WorldClient var114 = var19;
         if (var114 != null) {
            this.field_43h.clear();
            this.field_45s
               .method_40$a59262c0f0(
                  recovery$indy$34(field_43, 2182909733360131050L, var4).field_48Q,
                  recovery$indy$35(field_43, 2182909733360131050L, var4).field_48j,
                  recovery$indy$36(field_43, 2182909733360131050L, var4).field_42o
               );
            var19 = recovery$indy$37(field_43, 2185484248505398936L, var4);
            java.util.Iterator var84 = var19.field_44e.iterator();

            while (true) {
               boolean var115 = var84.hasNext();
               if (!var115) {
                  return;
               }

               net.C_47K var85;
               int var90;
               int[] var106;
               label103: {
                  label102: {
                     var85 = (net.C_47K)var84.next();
                     int var89 = (int) ((var85 instanceof C_47N) ? 1 : 0);
                     boolean var116 = (var89 != 0);
                     if (!var116) {
                        byte var125 = (byte) ((var85 instanceof C_470) ? 1 : 0);
                        int var117 = var1;
                        var106 = var10;
                        var90 = var125;
                        if (var117 <= 0) {
                           break label103;
                        }

                        var106 = var106;
                        var89 = var90;
                        var106 = var106;
                        var89 = var89;
                        var83 = var106;
                        var90 = var89;
                        if (var83 != null) {
                           break label102;
                        }

                        var89 = var90;
                        var89 = var89;
                        int var119 = var89;
                        if (var119 == 0) {
                           continue;
                        }
                     }

                     double var126;
                     var90 = (
                              var126 = recovery$indy$38(field_43, 2185620573988160848L, var4)
                                    .method_49$4b58f7ab41(
                                       var85.method_43$5730377d31().method_40$8abf5c6871(),
                                       var85.method_43$5730377d31().method_43$8abf5c6871(),
                                       var85.method_43$5730377d31().method_47$8abf5c6871()
                                    )
                                 - recovery$indy$39(this.settingMaxDistance, var6, 2183737287189739933L, var4) * 16.0
                           )
                           == 0.0
                        ? 0
                        : (var126 < 0.0 ? -1 : 1);
                  }

                  var106 = var10;
                  var90 = var90;
               }

               var83 = var106;
               var90 = var90;
               if (var83 == null) {
                  var90 = var90;
                  int var121 = var90;
                  if (var121 > 0) {
                     continue;
                  }

                  net.C_47K var102 = var85;
                  var90 = (int) ((var102 instanceof C_47N) ? 1 : 0);
               }

               int var122 = var90;
               if (var122 != 0) {
                  net.C_47K var103 = var85;
                  C_47N var104 = ((C_47N)var103).field_40Y;
                  C_47N var123 = var104;
                  if (var123 != null) {
                     continue;
                  }

                  C_47N var105 = ((C_47N)var85).field_48;
                  C_47N var124 = var105;
                  if (var124 != null) {
                     continue;
                  }
               }

               recovery$indy$40(this, var85, var8, 2183762452528069401L, var4);
            }
         }
      } else {
         java.util.Iterator var11 = var19.field_44e.iterator();

         while (true) {
            boolean var109 = var11.hasNext();
            if (!var109) {
               break;
            }

            net.C_47K var12;
            label119: {
               var12 = (net.C_47K)var11.next();
               byte var13 = (byte) ((var12 instanceof C_47N) ? 1 : 0);
               int[] var26 = var10;
               var13 = var13;
               var83 = var26;
               var13 = var13;
               net.C_47K var98;
               if (var83 == null) {
                  var13 = var13;
                  byte var111 = var13;
                  if (var111 > 0) {
                     continue;
                  }

                  var98 = var12;
               } else {
                  byte var112 = var13;
                  if (var112 == 0) {
                     break label119;
                  }

                  var98 = var12;
               }

               C_47N var99 = ((C_47N)var98).field_40Y;
               C_47N var113 = var99;
               if (var113 != null) {
                  continue;
               }
            }

            recovery$indy$40(this, var12, var8, 2183762452528069401L, var4);
            break;
         }
      }
   }




   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
      this.field_45g.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public StorageESP_47Hn(long a0) {
        super((java.lang.String) ("StorageESP"),(java.lang.String) ("SpeicherR\u00f6ntgenBlick"),(long) (((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 619260613282L)),(java.awt.Color) (new java.awt.Color((int) (100),(int) (166),(int) (148),(int) (255))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 72226666138885L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 72226666138885L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 72226666138885L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 40081937735479L);
        long constructorKey7 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 134262346132684L);
        long constructorKey8 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 54348374384468L);
        int constructorPart9 = (int) ((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 28395052315555L) >>> 32));
        int constructorPart10 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 28395052315555L) << 32) >>> 40));
        int constructorPart11 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 28395052315555L) << 56) >>> 56));
        int constructorPart12 = (int) ((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 88179455221196L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 88179455221196L) << 32) >>> 40));
        int constructorPart14 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 88179455221196L) << 56) >>> 56));
        long constructorKey15 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 7747327203123L);
        int constructorPart16 = (int) ((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 113558644068116L) >>> 32));
        int constructorPart17 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 113558644068116L) << 32) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 113558644068116L) << 48) >>> 48));
        long constructorKey19 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 109968968142166L);
        long constructorKey20 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 112016909986527L);
        long constructorKey21 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 102171336372542L);
        long constructorKey22 = ((augustus.recovered.modules.render.StorageESP_47Hn.a ^ a0) ^ 77390966860296L);
        java.lang.Object initialValue23 = recovery$indy$flow$424();
        client.setting.MultiSelectSetting initialized24 = new client.setting.MultiSelectSetting(this, "Modes", constructorKey8, (net.C_47OZ[]) (initialValue23));
        recovery$indy$flow$426(this, initialized24);
        client.setting.SettingGroup initialized25 = new client.setting.SettingGroup(this, "Box", true, constructorKey15);
        java.lang.Object initialValue26 = recovery$indy$flow$429();
        java.lang.Object initialValue27 = recovery$indy$flow$430(initialValue26);
        java.lang.Object initialValue28 = recovery$indy$flow$431(initialValue26);
        char converted29 = (char) (constructorPart17);
        java.lang.Object initialValue30 = initialValue28;
        int initialValue31 = constructorPart18;
        int initialValue32 = (int) (converted29);
        int initialValue33 = constructorPart16;
        client.setting.SettingGroup initialValue34 = initialized25;
        java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue36 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue37 = recovery$indy$flow$434(initialValue35, initialValue33, (char) (initialValue32), initialValue31, initialValue36);
        recovery$indy$flow$435(this, initialValue37);
        java.awt.Color initialized38 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue39 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        client.setting.ColorSetting initialized40 = new client.setting.ColorSetting(this, "BoxChestColor", constructorKey6, initialized38, (client.setting.SettingGroup) (initialValue39));
        long initialValue41 = constructorKey7;
        java.lang.String initialValue42 = "ChestColor";
        client.setting.ColorSetting initialValue43 = initialized40;
        java.lang.Object initialValue44 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue45 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue46 = recovery$indy$flow$443(initialValue44, initialValue45, initialValue41);
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue46))))));
        recovery$indy$flow$445(this, initialValue47);
        java.awt.Color initialized48 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue49 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        client.setting.ColorSetting initialized50 = new client.setting.ColorSetting(this, "BoxEnderChestColor", constructorKey6, initialized48, (client.setting.SettingGroup) (initialValue49));
        long initialValue51 = constructorKey7;
        java.lang.String initialValue52 = "EnderChestColor";
        client.setting.ColorSetting initialValue53 = initialized50;
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue56 = recovery$indy$flow$453(initialValue54, initialValue55, initialValue51);
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue56))))));
        recovery$indy$flow$455(this, initialValue57);
        java.lang.Object initialValue58 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        client.setting.NumberSetting initialized59 = new client.setting.NumberSetting(this, "BoxLineWidth", Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4622945017495814144L), 0, (client.setting.SettingGroup) (initialValue58), constructorKey22);
        short converted60 = (short) (constructorPart5);
        int initialValue61 = (int) (converted60);
        int initialValue62 = constructorPart4;
        java.lang.String initialValue63 = "LineWidth";
        int initialValue64 = constructorPart3;
        client.setting.NumberSetting initialValue65 = initialized59;
        java.lang.Object initialValue66 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue67 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue68 = recovery$indy$flow$461(initialValue66, initialValue64, initialValue67, initialValue62, (short) (initialValue61));
        recovery$indy$flow$462(this, initialValue68);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        client.setting.NumberSetting initialized70 = new client.setting.NumberSetting(this, "BoxExpand", 0.0D, Double.longBitsToDouble(-4616189618054758400L), 1.0D, 4, (client.setting.SettingGroup) (initialValue69), constructorKey22);
        short converted71 = (short) (constructorPart5);
        int initialValue72 = (int) (converted71);
        int initialValue73 = constructorPart4;
        java.lang.String initialValue74 = "Expand";
        int initialValue75 = constructorPart3;
        client.setting.NumberSetting initialValue76 = initialized70;
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue78 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue79 = recovery$indy$flow$468(initialValue77, initialValue75, initialValue78, initialValue73, (short) (initialValue72));
        recovery$indy$flow$469(this, initialValue79);
        java.lang.Object initialValue80 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        client.setting.NumberSetting initialized81 = new client.setting.NumberSetting(this, "BoxPriority", 0.0D, 0.0D, Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue80), constructorKey22);
        short converted82 = (short) (constructorPart5);
        int initialValue83 = (int) (converted82);
        int initialValue84 = constructorPart4;
        java.lang.String initialValue85 = "3DPriority";
        int initialValue86 = constructorPart3;
        client.setting.NumberSetting initialValue87 = initialized81;
        java.lang.Object initialValue88 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue87))))));
        java.lang.Object initialValue89 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue90 = recovery$indy$flow$475(initialValue88, initialValue86, initialValue89, initialValue84, (short) (initialValue83));
        java.lang.Object initialValue91 = recovery$indy$flow$476(this);
        byte converted92 = (byte) (constructorPart11);
        int initialValue93 = (int) (converted92);
        java.lang.Object initialValue94 = initialValue91;
        int initialValue95 = constructorPart10;
        int initialValue96 = constructorPart9;
        java.lang.Object initialValue97 = initialValue90;
        java.lang.Object initialValue98 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue99 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue94))))));
        java.lang.Object initialValue100 = recovery$indy$flow$479(initialValue98, initialValue96, initialValue95, initialValue99, (byte) (initialValue93));
        java.lang.Object initialValue101 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue100))))));
        recovery$indy$flow$481(this, initialValue101);
        java.lang.Object initialValue102 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBox));
        byte converted103 = (byte) (constructorPart14);
        client.setting.ShaderOptions initialized104 = new client.setting.ShaderOptions(constructorPart12, constructorPart13, this, "BoxShader", converted103, (client.setting.SettingGroup) (initialValue102));
        java.lang.Object initialValue105 = recovery$indy$flow$485();
        java.lang.Object initialValue106 = initialValue105;
        long initialValue107 = constructorKey19;
        client.setting.ShaderOptions initialValue108 = initialized104;
        java.lang.Object initialValue109 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue108))))));
        java.lang.Object initialValue110 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue106))))));
        java.lang.Object initialValue111 = recovery$indy$flow$488(initialValue109, initialValue107, initialValue110);
        long initialValue112 = constructorKey20;
        java.lang.Object initialValue113 = initialValue111;
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = recovery$indy$flow$490(initialValue114, initialValue112);
        recovery$indy$flow$491(this, initialValue115);
        client.setting.SettingGroup initialized116 = new client.setting.SettingGroup(this, "BlockBox", true, constructorKey15);
        java.lang.Object initialValue117 = recovery$indy$flow$494();
        java.lang.Object initialValue118 = recovery$indy$flow$495(initialValue117);
        java.lang.Object initialValue119 = recovery$indy$flow$496(initialValue117);
        char converted120 = (char) (constructorPart17);
        java.lang.Object initialValue121 = initialValue119;
        int initialValue122 = constructorPart18;
        int initialValue123 = (int) (converted120);
        int initialValue124 = constructorPart16;
        client.setting.SettingGroup initialValue125 = initialized116;
        java.lang.Object initialValue126 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue125))))));
        java.lang.Object initialValue127 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue121))))));
        java.lang.Object initialValue128 = recovery$indy$flow$499(initialValue126, initialValue124, (char) (initialValue123), initialValue122, initialValue127);
        recovery$indy$flow$500(this, initialValue128);
        java.awt.Color initialized129 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue130 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBlockBox));
        client.setting.ColorSetting initialized131 = new client.setting.ColorSetting(this, "BlockBoxChestColor", constructorKey6, initialized129, (client.setting.SettingGroup) (initialValue130));
        long initialValue132 = constructorKey7;
        java.lang.String initialValue133 = "ChestColor";
        client.setting.ColorSetting initialValue134 = initialized131;
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue133))))));
        java.lang.Object initialValue137 = recovery$indy$flow$508(initialValue135, initialValue136, initialValue132);
        java.lang.Object initialValue138 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue137))))));
        recovery$indy$flow$510(this, initialValue138);
        java.awt.Color initialized139 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue140 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBlockBox));
        client.setting.ColorSetting initialized141 = new client.setting.ColorSetting(this, "BlockBoxEnderChestColor", constructorKey6, initialized139, (client.setting.SettingGroup) (initialValue140));
        long initialValue142 = constructorKey7;
        java.lang.String initialValue143 = "EnderChestColor";
        client.setting.ColorSetting initialValue144 = initialized141;
        java.lang.Object initialValue145 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue144))))));
        java.lang.Object initialValue146 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue143))))));
        java.lang.Object initialValue147 = recovery$indy$flow$518(initialValue145, initialValue146, initialValue142);
        java.lang.Object initialValue148 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue147))))));
        recovery$indy$flow$520(this, initialValue148);
        java.lang.Object initialValue149 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBlockBox));
        client.setting.NumberSetting initialized150 = new client.setting.NumberSetting(this, "BlockBoxLineWidth", Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4622945017495814144L), 0, (client.setting.SettingGroup) (initialValue149), constructorKey22);
        short converted151 = (short) (constructorPart5);
        int initialValue152 = (int) (converted151);
        int initialValue153 = constructorPart4;
        java.lang.String initialValue154 = "LineWidth";
        int initialValue155 = constructorPart3;
        client.setting.NumberSetting initialValue156 = initialized150;
        java.lang.Object initialValue157 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue158 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue159 = recovery$indy$flow$526(initialValue157, initialValue155, initialValue158, initialValue153, (short) (initialValue152));
        recovery$indy$flow$527(this, initialValue159);
        java.lang.Object initialValue160 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBlockBox));
        client.setting.NumberSetting initialized161 = new client.setting.NumberSetting(this, "BlockBoxPriority", 1.0D, 0.0D, Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue160), constructorKey22);
        short converted162 = (short) (constructorPart5);
        int initialValue163 = (int) (converted162);
        int initialValue164 = constructorPart4;
        java.lang.String initialValue165 = "3DPriority";
        int initialValue166 = constructorPart3;
        client.setting.NumberSetting initialValue167 = initialized161;
        java.lang.Object initialValue168 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue169 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue165))))));
        java.lang.Object initialValue170 = recovery$indy$flow$533(initialValue168, initialValue166, initialValue169, initialValue164, (short) (initialValue163));
        java.lang.Object initialValue171 = recovery$indy$flow$534(this);
        byte converted172 = (byte) (constructorPart11);
        int initialValue173 = (int) (converted172);
        java.lang.Object initialValue174 = initialValue171;
        int initialValue175 = constructorPart10;
        int initialValue176 = constructorPart9;
        java.lang.Object initialValue177 = initialValue170;
        java.lang.Object initialValue178 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue179 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue174))))));
        java.lang.Object initialValue180 = recovery$indy$flow$537(initialValue178, initialValue176, initialValue175, initialValue179, (byte) (initialValue173));
        java.lang.Object initialValue181 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue180))))));
        recovery$indy$flow$539(this, initialValue181);
        java.lang.Object initialValue182 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingBlockBox));
        byte converted183 = (byte) (constructorPart14);
        client.setting.ShaderOptions initialized184 = new client.setting.ShaderOptions(constructorPart12, constructorPart13, this, "BlockBoxShader", converted183, (client.setting.SettingGroup) (initialValue182));
        java.lang.Object initialValue185 = recovery$indy$flow$543();
        java.lang.Object initialValue186 = initialValue185;
        long initialValue187 = constructorKey19;
        client.setting.ShaderOptions initialValue188 = initialized184;
        java.lang.Object initialValue189 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue188))))));
        java.lang.Object initialValue190 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue186))))));
        java.lang.Object initialValue191 = recovery$indy$flow$546(initialValue189, initialValue187, initialValue190);
        long initialValue192 = constructorKey20;
        java.lang.Object initialValue193 = initialValue191;
        java.lang.Object initialValue194 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue193))))));
        java.lang.Object initialValue195 = recovery$indy$flow$548(initialValue194, initialValue192);
        recovery$indy$flow$549(this, initialValue195);
        client.setting.SettingGroup initialized196 = new client.setting.SettingGroup(this, "3DCorner", true, constructorKey15);
        java.lang.Object initialValue197 = recovery$indy$flow$552();
        java.lang.Object initialValue198 = recovery$indy$flow$553(initialValue197);
        java.lang.Object initialValue199 = recovery$indy$flow$554(initialValue197);
        char converted200 = (char) (constructorPart17);
        java.lang.Object initialValue201 = initialValue199;
        int initialValue202 = constructorPart18;
        int initialValue203 = (int) (converted200);
        int initialValue204 = constructorPart16;
        client.setting.SettingGroup initialValue205 = initialized196;
        java.lang.Object initialValue206 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue205))))));
        java.lang.Object initialValue207 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue201))))));
        java.lang.Object initialValue208 = recovery$indy$flow$557(initialValue206, initialValue204, (char) (initialValue203), initialValue202, initialValue207);
        recovery$indy$flow$558(this, initialValue208);
        java.awt.Color initialized209 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue210 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.ColorSetting initialized211 = new client.setting.ColorSetting(this, "Corner3ChestColor", constructorKey6, initialized209, (client.setting.SettingGroup) (initialValue210));
        long initialValue212 = constructorKey7;
        java.lang.String initialValue213 = "ChestColor";
        client.setting.ColorSetting initialValue214 = initialized211;
        java.lang.Object initialValue215 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue214))))));
        java.lang.Object initialValue216 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue213))))));
        java.lang.Object initialValue217 = recovery$indy$flow$566(initialValue215, initialValue216, initialValue212);
        java.lang.Object initialValue218 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue217))))));
        recovery$indy$flow$568(this, initialValue218);
        java.awt.Color initialized219 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue220 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.ColorSetting initialized221 = new client.setting.ColorSetting(this, "Corner3EnderChestColor", constructorKey6, initialized219, (client.setting.SettingGroup) (initialValue220));
        long initialValue222 = constructorKey7;
        java.lang.String initialValue223 = "EnderChestColor";
        client.setting.ColorSetting initialValue224 = initialized221;
        java.lang.Object initialValue225 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue224))))));
        java.lang.Object initialValue226 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue223))))));
        java.lang.Object initialValue227 = recovery$indy$flow$576(initialValue225, initialValue226, initialValue222);
        java.lang.Object initialValue228 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue227))))));
        recovery$indy$flow$578(this, initialValue228);
        java.lang.Object initialValue229 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.NumberSetting initialized230 = new client.setting.NumberSetting(this, "Corner3DPriority", Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue229), constructorKey22);
        short converted231 = (short) (constructorPart5);
        int initialValue232 = (int) (converted231);
        int initialValue233 = constructorPart4;
        java.lang.String initialValue234 = "3DPriority";
        int initialValue235 = constructorPart3;
        client.setting.NumberSetting initialValue236 = initialized230;
        java.lang.Object initialValue237 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue236))))));
        java.lang.Object initialValue238 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue234))))));
        java.lang.Object initialValue239 = recovery$indy$flow$584(initialValue237, initialValue235, initialValue238, initialValue233, (short) (initialValue232));
        java.lang.Object initialValue240 = recovery$indy$flow$585(this);
        byte converted241 = (byte) (constructorPart11);
        int initialValue242 = (int) (converted241);
        java.lang.Object initialValue243 = initialValue240;
        int initialValue244 = constructorPart10;
        int initialValue245 = constructorPart9;
        java.lang.Object initialValue246 = initialValue239;
        java.lang.Object initialValue247 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue246))))));
        java.lang.Object initialValue248 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue243))))));
        java.lang.Object initialValue249 = recovery$indy$flow$588(initialValue247, initialValue245, initialValue244, initialValue248, (byte) (initialValue242));
        java.lang.Object initialValue250 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue249))))));
        recovery$indy$flow$590(this, initialValue250);
        java.lang.Object initialValue251 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).setting3DCorner));
        byte converted252 = (byte) (constructorPart14);
        client.setting.ShaderOptions initialized253 = new client.setting.ShaderOptions(constructorPart12, constructorPart13, this, "Corner3DShader", converted252, (client.setting.SettingGroup) (initialValue251));
        java.lang.Object initialValue254 = recovery$indy$flow$594();
        java.lang.Object initialValue255 = initialValue254;
        long initialValue256 = constructorKey19;
        client.setting.ShaderOptions initialValue257 = initialized253;
        java.lang.Object initialValue258 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue257))))));
        java.lang.Object initialValue259 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue255))))));
        java.lang.Object initialValue260 = recovery$indy$flow$597(initialValue258, initialValue256, initialValue259);
        long initialValue261 = constructorKey20;
        java.lang.Object initialValue262 = initialValue260;
        java.lang.Object initialValue263 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue262))))));
        java.lang.Object initialValue264 = recovery$indy$flow$599(initialValue263, initialValue261);
        recovery$indy$flow$600(this, initialValue264);
        client.setting.SettingGroup initialized265 = new client.setting.SettingGroup(this, "Real2D", true, constructorKey15);
        java.lang.Object initialValue266 = recovery$indy$flow$603();
        java.lang.Object initialValue267 = recovery$indy$flow$604(initialValue266);
        java.lang.Object initialValue268 = recovery$indy$flow$605(initialValue266);
        char converted269 = (char) (constructorPart17);
        java.lang.Object initialValue270 = initialValue268;
        int initialValue271 = constructorPart18;
        int initialValue272 = (int) (converted269);
        int initialValue273 = constructorPart16;
        client.setting.SettingGroup initialValue274 = initialized265;
        java.lang.Object initialValue275 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue274))))));
        java.lang.Object initialValue276 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue270))))));
        java.lang.Object initialValue277 = recovery$indy$flow$608(initialValue275, initialValue273, (char) (initialValue272), initialValue271, initialValue276);
        recovery$indy$flow$609(this, initialValue277);
        java.awt.Color initialized278 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue279 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized280 = new client.setting.ColorSetting(this, "Real2DColorChest1", constructorKey6, initialized278, (client.setting.SettingGroup) (initialValue279));
        long initialValue281 = constructorKey7;
        java.lang.String initialValue282 = "ChestColor1";
        client.setting.ColorSetting initialValue283 = initialized280;
        java.lang.Object initialValue284 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue283))))));
        java.lang.Object initialValue285 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue282))))));
        java.lang.Object initialValue286 = recovery$indy$flow$617(initialValue284, initialValue285, initialValue281);
        java.lang.Object initialValue287 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue286))))));
        recovery$indy$flow$619(this, initialValue287);
        java.awt.Color initialized288 = new java.awt.Color(21, 121, 230);
        java.lang.Object initialValue289 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized290 = new client.setting.ColorSetting(this, "Real2DColorChest2", constructorKey6, initialized288, (client.setting.SettingGroup) (initialValue289));
        long initialValue291 = constructorKey7;
        java.lang.String initialValue292 = "ChestColor2";
        client.setting.ColorSetting initialValue293 = initialized290;
        java.lang.Object initialValue294 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue293))))));
        java.lang.Object initialValue295 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue292))))));
        java.lang.Object initialValue296 = recovery$indy$flow$627(initialValue294, initialValue295, initialValue291);
        java.lang.Object initialValue297 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue296))))));
        recovery$indy$flow$629(this, initialValue297);
        java.awt.Color initialized298 = new java.awt.Color(66, 245, 164, 65);
        java.lang.Object initialValue299 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized300 = new client.setting.ColorSetting(this, "Real2DColorEnderChest1", constructorKey6, initialized298, (client.setting.SettingGroup) (initialValue299));
        long initialValue301 = constructorKey7;
        java.lang.String initialValue302 = "EnderChestColor1";
        client.setting.ColorSetting initialValue303 = initialized300;
        java.lang.Object initialValue304 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue303))))));
        java.lang.Object initialValue305 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue302))))));
        java.lang.Object initialValue306 = recovery$indy$flow$637(initialValue304, initialValue305, initialValue301);
        java.lang.Object initialValue307 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue306))))));
        recovery$indy$flow$639(this, initialValue307);
        java.awt.Color initialized308 = new java.awt.Color(66, 245, 164);
        java.lang.Object initialValue309 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized310 = new client.setting.ColorSetting(this, "Real2DColorEnderChest2", constructorKey6, initialized308, (client.setting.SettingGroup) (initialValue309));
        long initialValue311 = constructorKey7;
        java.lang.String initialValue312 = "EnderChestColor2";
        client.setting.ColorSetting initialValue313 = initialized310;
        java.lang.Object initialValue314 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue313))))));
        java.lang.Object initialValue315 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue312))))));
        java.lang.Object initialValue316 = recovery$indy$flow$647(initialValue314, initialValue315, initialValue311);
        java.lang.Object initialValue317 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue316))))));
        recovery$indy$flow$649(this, initialValue317);
        java.lang.Object initialValue318 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.NumberSetting initialized319 = new client.setting.NumberSetting(this, "Real2DPriority", 0.0D, 0.0D, 1.0D, 0, (client.setting.SettingGroup) (initialValue318), constructorKey22);
        short converted320 = (short) (constructorPart5);
        int initialValue321 = (int) (converted320);
        int initialValue322 = constructorPart4;
        java.lang.String initialValue323 = "2DPriority";
        int initialValue324 = constructorPart3;
        client.setting.NumberSetting initialValue325 = initialized319;
        java.lang.Object initialValue326 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue325))))));
        java.lang.Object initialValue327 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue323))))));
        java.lang.Object initialValue328 = recovery$indy$flow$655(initialValue326, initialValue324, initialValue327, initialValue322, (short) (initialValue321));
        java.lang.Object initialValue329 = recovery$indy$flow$656(this);
        byte converted330 = (byte) (constructorPart11);
        int initialValue331 = (int) (converted330);
        java.lang.Object initialValue332 = initialValue329;
        int initialValue333 = constructorPart10;
        int initialValue334 = constructorPart9;
        java.lang.Object initialValue335 = initialValue328;
        java.lang.Object initialValue336 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue335))))));
        java.lang.Object initialValue337 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue332))))));
        java.lang.Object initialValue338 = recovery$indy$flow$659(initialValue336, initialValue334, initialValue333, initialValue337, (byte) (initialValue331));
        java.lang.Object initialValue339 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue338))))));
        recovery$indy$flow$661(this, initialValue339);
        java.lang.Object initialValue340 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingReal2D));
        byte converted341 = (byte) (constructorPart14);
        client.setting.ShaderOptions initialized342 = new client.setting.ShaderOptions(constructorPart12, constructorPart13, this, "Real2DShader", converted341, (client.setting.SettingGroup) (initialValue340));
        java.lang.Object initialValue343 = recovery$indy$flow$665();
        java.lang.Object initialValue344 = initialValue343;
        long initialValue345 = constructorKey19;
        client.setting.ShaderOptions initialValue346 = initialized342;
        java.lang.Object initialValue347 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue346))))));
        java.lang.Object initialValue348 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue344))))));
        java.lang.Object initialValue349 = recovery$indy$flow$668(initialValue347, initialValue345, initialValue348);
        long initialValue350 = constructorKey20;
        java.lang.Object initialValue351 = initialValue349;
        java.lang.Object initialValue352 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue351))))));
        java.lang.Object initialValue353 = recovery$indy$flow$670(initialValue352, initialValue350);
        recovery$indy$flow$671(this, initialValue353);
        client.setting.SettingGroup initialized354 = new client.setting.SettingGroup(this, "Corner", true, constructorKey15);
        java.lang.Object initialValue355 = recovery$indy$flow$674();
        java.lang.Object initialValue356 = recovery$indy$flow$675(initialValue355);
        java.lang.Object initialValue357 = recovery$indy$flow$676(initialValue355);
        char converted358 = (char) (constructorPart17);
        java.lang.Object initialValue359 = initialValue357;
        int initialValue360 = constructorPart18;
        int initialValue361 = (int) (converted358);
        int initialValue362 = constructorPart16;
        client.setting.SettingGroup initialValue363 = initialized354;
        java.lang.Object initialValue364 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue363))))));
        java.lang.Object initialValue365 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue359))))));
        java.lang.Object initialValue366 = recovery$indy$flow$679(initialValue364, initialValue362, (char) (initialValue361), initialValue360, initialValue365);
        recovery$indy$flow$680(this, initialValue366);
        java.awt.Color initialized367 = new java.awt.Color(21, 121, 230);
        java.lang.Object initialValue368 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.ColorSetting initialized369 = new client.setting.ColorSetting(this, "CornerChestColor", constructorKey6, initialized367, (client.setting.SettingGroup) (initialValue368));
        long initialValue370 = constructorKey7;
        java.lang.String initialValue371 = "ChestColor";
        client.setting.ColorSetting initialValue372 = initialized369;
        java.lang.Object initialValue373 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue372))))));
        java.lang.Object initialValue374 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue371))))));
        java.lang.Object initialValue375 = recovery$indy$flow$688(initialValue373, initialValue374, initialValue370);
        java.lang.Object initialValue376 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue375))))));
        recovery$indy$flow$690(this, initialValue376);
        java.awt.Color initialized377 = new java.awt.Color(66, 245, 164);
        java.lang.Object initialValue378 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.ColorSetting initialized379 = new client.setting.ColorSetting(this, "CornerEnderChestColor", constructorKey6, initialized377, (client.setting.SettingGroup) (initialValue378));
        long initialValue380 = constructorKey7;
        java.lang.String initialValue381 = "EnderChestColor";
        client.setting.ColorSetting initialValue382 = initialized379;
        java.lang.Object initialValue383 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue382))))));
        java.lang.Object initialValue384 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue381))))));
        java.lang.Object initialValue385 = recovery$indy$flow$698(initialValue383, initialValue384, initialValue380);
        java.lang.Object initialValue386 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue385))))));
        recovery$indy$flow$700(this, initialValue386);
        java.lang.Object initialValue387 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized388 = new client.setting.NumberSetting(this, "CornerLineWidth", Double.longBitsToDouble(4611686018427387904L), 1.0D, Double.longBitsToDouble(4617315517961601024L), 0, (client.setting.SettingGroup) (initialValue387), constructorKey22);
        short converted389 = (short) (constructorPart5);
        int initialValue390 = (int) (converted389);
        int initialValue391 = constructorPart4;
        java.lang.String initialValue392 = "LineWidth";
        int initialValue393 = constructorPart3;
        client.setting.NumberSetting initialValue394 = initialized388;
        java.lang.Object initialValue395 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue394))))));
        java.lang.Object initialValue396 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue392))))));
        java.lang.Object initialValue397 = recovery$indy$flow$706(initialValue395, initialValue393, initialValue396, initialValue391, (short) (initialValue390));
        recovery$indy$flow$707(this, initialValue397);
        java.lang.Object initialValue398 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized399 = new client.setting.NumberSetting(this, "CornerHorizontalPercentage", Double.longBitsToDouble(4632233691727265792L), 1.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue398), constructorKey22);
        recovery$indy$flow$711(this, initialized399);
        java.lang.Object initialValue400 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized401 = new client.setting.NumberSetting(this, "CornerVerticalPercentage", Double.longBitsToDouble(4632233691727265792L), 1.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue400), constructorKey22);
        short converted402 = (short) (constructorPart5);
        int initialValue403 = (int) (converted402);
        int initialValue404 = constructorPart4;
        java.lang.String initialValue405 = "VerticalPercentage";
        int initialValue406 = constructorPart3;
        client.setting.NumberSetting initialValue407 = initialized401;
        java.lang.Object initialValue408 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue407))))));
        java.lang.Object initialValue409 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue405))))));
        java.lang.Object initialValue410 = recovery$indy$flow$717(initialValue408, initialValue406, initialValue409, initialValue404, (short) (initialValue403));
        recovery$indy$flow$718(this, initialValue410);
        java.lang.Object initialValue411 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized412 = new client.setting.NumberSetting(this, "CornerPriority", 1.0D, 0.0D, 1.0D, 0, (client.setting.SettingGroup) (initialValue411), constructorKey22);
        short converted413 = (short) (constructorPart5);
        int initialValue414 = (int) (converted413);
        int initialValue415 = constructorPart4;
        java.lang.String initialValue416 = "2DPriority";
        int initialValue417 = constructorPart3;
        client.setting.NumberSetting initialValue418 = initialized412;
        java.lang.Object initialValue419 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue418))))));
        java.lang.Object initialValue420 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue416))))));
        java.lang.Object initialValue421 = recovery$indy$flow$724(initialValue419, initialValue417, initialValue420, initialValue415, (short) (initialValue414));
        java.lang.Object initialValue422 = recovery$indy$flow$725(this);
        byte converted423 = (byte) (constructorPart11);
        int initialValue424 = (int) (converted423);
        java.lang.Object initialValue425 = initialValue422;
        int initialValue426 = constructorPart10;
        int initialValue427 = constructorPart9;
        java.lang.Object initialValue428 = initialValue421;
        java.lang.Object initialValue429 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue428))))));
        java.lang.Object initialValue430 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue425))))));
        java.lang.Object initialValue431 = recovery$indy$flow$728(initialValue429, initialValue427, initialValue426, initialValue430, (byte) (initialValue424));
        java.lang.Object initialValue432 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue431))))));
        recovery$indy$flow$730(this, initialValue432);
        java.lang.Object initialValue433 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(this)))).settingCorner));
        byte converted434 = (byte) (constructorPart14);
        client.setting.ShaderOptions initialized435 = new client.setting.ShaderOptions(constructorPart12, constructorPart13, this, "CornerShader", converted434, (client.setting.SettingGroup) (initialValue433));
        java.lang.Object initialValue436 = recovery$indy$flow$734();
        java.lang.Object initialValue437 = initialValue436;
        long initialValue438 = constructorKey19;
        client.setting.ShaderOptions initialValue439 = initialized435;
        java.lang.Object initialValue440 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue439))))));
        java.lang.Object initialValue441 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue437))))));
        java.lang.Object initialValue442 = recovery$indy$flow$737(initialValue440, initialValue438, initialValue441);
        long initialValue443 = constructorKey20;
        java.lang.Object initialValue444 = initialValue442;
        java.lang.Object initialValue445 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue444))))));
        java.lang.Object initialValue446 = recovery$indy$flow$739(initialValue445, initialValue443);
        recovery$indy$flow$740(this, initialValue446);
        client.setting.NumberSetting initialized447 = new client.setting.NumberSetting(this, "MaxDistance", Double.longBitsToDouble(4618441417868443648L), constructorKey21, 0.0D, Double.longBitsToDouble(4629700416936869888L), 0);
        recovery$indy$flow$743(this, initialized447);
        java.util.HashMap initialized448 = new java.util.HashMap();
        recovery$indy$flow$746(this, initialized448);
        java.util.ArrayList initialized449 = new java.util.ArrayList();
        recovery$indy$flow$749(this, initialized449);
        java.lang.Object initialValue450 = recovery$indy$flow$750();
        net.C_47b0 initialized451 = new net.C_47b0();
        recovery$indy$flow$753(this, initialized451);
        it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap initialized452 = new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap();
        recovery$indy$flow$756(this, initialized452);
        it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap initialized453 = new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap();
        recovery$indy$flow$759(this, initialized453);
        java.lang.Object initialValue454 = initialValue450;
        StorageESP_47Hn initialValue455 = this;
        java.lang.Object initialValue456 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(initialValue455))))));
        recovery$indy$flow$761(initialValue456);
        StorageESP_47Hn initialValue457 = this;
        java.lang.Object initialValue458 = ((java.lang.Object)(((augustus.recovered.modules.render.StorageESP_47Hn) (((java.lang.Object)(initialValue457))))));
        recovery$indy$flow$763(initialValue458);
        java.lang.Object initialValue459 = recovery$indy$flow$764();
        if (initialValue459 == null) {
        } else {
            int[] values460 = new int[5];
            int[] initialValue461 = values460;
            java.lang.Object initialValue462 = recovery$indy$flow$765(initialValue461);
            recovery$indy$flow$766(initialValue462);
        }
        return;
    }














    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$424();
    private static native void recovery$indy$flow$426(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$429() {
        return net.C_4725.BOX;
    }
    private static java.lang.Object recovery$indy$flow$430(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$431(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$434(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$435(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$443(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$445(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$453(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$455(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$462(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$468(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$469(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$475(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$479(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$481(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$485() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$488(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$490(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$491(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$494() {
        return net.C_4725.BLOCK_BOX;
    }
    private static java.lang.Object recovery$indy$flow$495(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$496(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$499(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$500(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$508(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$510(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$518(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$520(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$526(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$527(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$533(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$534(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$537(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$539(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$543() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$546(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$548(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$549(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$552() {
        return net.C_4725.CORNER_3D;
    }
    private static java.lang.Object recovery$indy$flow$553(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$554(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$557(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$558(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$566(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$568(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$578(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$584(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$585(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$588(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$590(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$594() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$597(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$599(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$600(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$603() {
        return net.C_4725.REAL_2D;
    }
    private static java.lang.Object recovery$indy$flow$604(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$605(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$608(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$609(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$617(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$619(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$629(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$637(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$647(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$649(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$655(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$661(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$665() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$668(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$671(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$674() {
        return net.C_4725.CORNER;
    }
    private static java.lang.Object recovery$indy$flow$675(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$676(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$679(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$680(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$688(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$690(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$698(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$706(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$711(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$717(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$718(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$724(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$725(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$728(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$730(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$734() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$737(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$739(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$740(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$743(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$746(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$749(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$750();
    private static native void recovery$indy$flow$753(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$756(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$759(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$761(java.lang.Object a0);

    private static native void recovery$indy$flow$763(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$764();
    private static java.lang.Object recovery$indy$flow$765(java.lang.Object a0) {
        return ((int[]) (a0));
    }
    private static native void recovery$indy$flow$766(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native C_47Fw recovery$indy$1(StorageESP_47Hn var0);
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native C_47Fw recovery$indy$6(StorageESP_47Hn var0);
   private static native int[] recovery$indy$7(long var0, long var2);
   private static native Runnable recovery$indy$8(StorageESP_47Hn var0);
   private static native Runnable recovery$indy$9(StorageESP_47Hn var0);
   private static native C_47Fw recovery$indy$10(StorageESP_47Hn var0);
   private static native C_47Fw recovery$indy$11(StorageESP_47Hn var0);
   private static native int[] recovery$indy$12(long var0, long var2);
   private static native int recovery$indy$13(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native int recovery$indy$14(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native int[] recovery$indy$15(long var0, long var2);
   private static native C_47Fw recovery$indy$16(StorageESP_47Hn var0);
   private static native Runnable recovery$indy$17(StorageESP_47Hn var0);
   private static native Runnable recovery$indy$18(StorageESP_47Hn var0);
   private static native Runnable recovery$indy$19(StorageESP_47Hn var0);
   private static native int[] recovery$indy$20(long var0, long var2);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$23(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$24(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$25(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$26(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$27(Object var0, long var1, long var3);
   private static native double[] recovery$indy$28(long var0, Object var2, Object var3, long var4, long var6);
   private static native void recovery$indy$29(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$32(long var0, long var2);
   private static native WorldClient recovery$indy$33(Object var0, long var1, long var3);
   private static native Entity recovery$indy$34(Object var0, long var1, long var3);
   private static native Entity recovery$indy$35(Object var0, long var1, long var3);
   private static native Entity recovery$indy$36(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$37(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native double recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$40(Object var0, Object var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$51();
}
