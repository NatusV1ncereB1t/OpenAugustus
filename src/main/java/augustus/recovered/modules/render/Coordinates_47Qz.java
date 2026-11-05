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
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Fw;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.Minecraft;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47uI;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class Coordinates_47Qz extends Module implements RenderListener {
   private final NumberSetting settingPosX;
   private final NumberSetting settingPosY;
   private final NumberSetting settingScale;
   private final ColorSetting settingColor1;
   private final ColorSetting settingColor2;
   private final BooleanSetting settingBackGround;
   private final ColorSetting settingBackGroundColor;
   private final ShaderOptions settingBackGround2;
   private static final long a = C_4f.a(-5311491048766800223L, -6930206938374299136L, MethodHandles.lookup().lookupClass()).a(23016820215420L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[40];
   private static final String[] f = new String[40];

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

   private void method_42$1585339aeb(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, RenderPass var10) {
      long var11 = a ^ 29869076847299L;
      long var13 = var11 ^ 100080578731361L;
      long var15 = var11 ^ 14813780521513L;
      long var10000 = 1182368065125281021L;
      int[] var17 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var10 == RenderPass.NONE) {
         long var10001 = 1182223619899130746L;
         BooleanSetting var20 = this.settingBackGround;
         int var39 = (int) ((var20.method_49$aae029aa0a()) ? 1 : 0);
         if (var17 == null) {
            if (var39 != 0) {
               double var40 = var1 - 1;
               double var42 = var2 - 1;
               double var10002 = var1 + var3 + 1.0F;
               long var10005 = 1182123368717882289L;
               Minecraft var21 = field_43;
               RenderUtils.method_40$56a5fc1016(var40, var42, var10002, var2 + var21.field_42N.field_47, var4);
            }

            var10001 = 1182123368717882289L;
            Minecraft var22 = field_43;
            var39 = var22.field_42N.method_48$2f485d5ba3("" + var5);
         }

         float var18 = var39;
         var10001 = 1182123368717882289L;
         Minecraft var23 = field_43;
         float var19 = var23.field_42N.method_48$2f485d5ba3("" + var6);
         var10001 = 1182123368717882289L;
         Minecraft var24 = field_43;
         var24.field_42N.method_40$b593f01403("X: ", var1, var2, var7);
         var10001 = 1182123368717882289L;
         Minecraft var25 = field_43;
         var25.field_42N.method_40$b593f01403("" + var5, var1 + 11, var2, var8);
         var10001 = 1182123368717882289L;
         Minecraft var26 = field_43;
         var26.field_42N.method_40$b593f01403("  Y: ", var1 + 11 + var18, var2, var7);
         var10001 = 1182123368717882289L;
         Minecraft var27 = field_43;
         var27.field_42N.method_40$b593f01403("" + var6, var1 + 11 + var18 + 17.0F, var2, var8);
         var10001 = 1182123368717882289L;
         Minecraft var28 = field_43;
         var28.field_42N.method_40$b593f01403("  Z: ", var1 + 11 + var18 + 17.0F + var19, var2, var7);
         var10001 = 1182123368717882289L;
         Minecraft var29 = field_43;
         var29.field_42N.method_40$b593f01403("" + var9, var1 + 11 + var18 + 17.0F + var19 + 17.0F, var2, var8);
         if (var17 == null) {
            return;
         }
      }

      double var41 = var1 - 1;
      double var51 = var2 - 1;
      double var52 = var1 + var3 + 1.0F;
      long var53 = 1182123368717882289L;
      Minecraft var30 = field_43;
      double var10003 = var2 + var30.field_42N.field_47;
      ShaderOptions var10004 = this.settingBackGround2;
      long var10008 = 1182017170318830016L;
      long var31 = var15;
      int var33 = var4;
      RenderPass var34 = var10;
      int var54 = C_47TX.method_40$6b468acafc(var34, var33, var31);
      long var10007 = 1182710507483831127L;
      long var35 = var13;
      int var37 = var54;
      ShaderOptions var38 = var10004;
      RenderUtils.method_40$56a5fc1016(var41, var51, var52, var10003, var38.method_49$7ee0e11626(var37, var35));
   }

   private static native Method d(long var0, long var2);

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var12;
      long var14;
      long var16;
      int[] var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      float var34;
      int var35;
      int var36;
      int var37;
      boolean var94;
      label53: {
         label56: {
            long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
            long var8 = var6 ^ 62665625052564L;
            long var10 = var6 ^ 79469613767391L;
            var12 = var6 ^ 132989861136316L;
            var14 = var6 ^ 91924420980846L;
            var16 = var6 ^ 58032606781533L;
            long var10001 = var6 ^ 48982798476343L;
            int var18 = (int)((var6 ^ 48982798476343L) >>> 32);
            int var19 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
            int var20 = (int)(var10001 << 48 >>> 48);
            var10001 = 1634187612254317374L;
            Minecraft var38 = field_43;
            var22 = (int)var38.field_42P.field_48Q;
            var10001 = 1634187612254317374L;
            Minecraft var39 = field_43;
            var23 = (int)var39.field_42P.field_48j;
            long var10000 = 1631342095158864438L;
            int[] var88 = AntiStrike_47Qa.method_42$d4d28024c9();
            long var10002 = 1634187612254317374L;
            Minecraft var40 = field_43;
            var24 = (int)var40.field_42P.field_42o;
            short var10003 = (short)var19;
            char var10004 = (char)var20;
            long var10006 = 1631030294646602647L;
            byte var41 = 0;
            char var42 = var10004;
            short var43 = var10003;
            int var44 = var18;
            ColorSetting var45 = this.settingColor1;
            var25 = var45.method_47$24af287d8f(var44, var43, var42, var41);
            var10003 = (short)var19;
            var10004 = (char)var20;
            var10006 = 1631030294646602647L;
            byte var46 = 0;
            char var47 = var10004;
            short var48 = var10003;
            int var49 = var18;
            ColorSetting var50 = this.settingColor2;
            var26 = var50.method_47$24af287d8f(var49, var48, var47, var46);
            var21 = var88;
            GL11.glPushMatrix();
            GL11.glScaled(1.0 / var5.method_40$8abf5c6871(), 1.0 / var5.method_40$8abf5c6871(), 1.0);
            var10002 = 1631396869385855056L;
            long var51 = var10;
            NumberSetting var53 = this.settingScale;
            double var89 = var53.method_44$474dfaa627(var51);
            long var108 = 1631396869385855056L;
            long var54 = var10;
            NumberSetting var56 = this.settingScale;
            GL11.glScaled(var89, var56.method_44$474dfaa627(var54), 1.0);
            double var90 = field_43.field_44f;
            long var109 = 1631396869385855056L;
            long var57 = var10;
            NumberSetting var59 = this.settingScale;
            double var27 = var90 / var59.method_44$474dfaa627(var57);
            double var91 = field_43.field_44g;
            long var110 = 1631396869385855056L;
            long var60 = var10;
            NumberSetting var62 = this.settingScale;
            double var29 = var91 / var62.method_44$474dfaa627(var60);
            int var31 = C_47sk.method_42$b4643774d1(var27);
            int var32 = C_47sk.method_42$b4643774d1(var29);
            String var33 = "X: " + var22 + "  Y: " + var23 + "  Z: " + var24;
            var10001 = 1633842889031488890L;
            Minecraft var63 = field_43;
            var34 = var63.field_42N.method_48$2f485d5ba3(var33);
            double var92 = var31 - var34;
            long var111 = 1631396869385855056L;
            long var64 = var10;
            NumberSetting var66 = this.settingPosX;
            var35 = (int)(var92 * (var66.method_44$474dfaa627(var64) / 100.0));
            var10002 = 1633842889031488890L;
            Minecraft var67 = field_43;
            double var93 = var32 - var67.field_42N.field_47;
            long var112 = 1631396869385855056L;
            long var68 = var10;
            NumberSetting var70 = this.settingPosY;
            var36 = (int)(var93 * (var70.method_44$474dfaa627(var68) / 100.0));
            short var102 = (short)var19;
            char var113 = (char)var20;
            long var10005 = 1631030294646602647L;
            byte var71 = 0;
            char var72 = var113;
            short var73 = var102;
            int var74 = var18;
            ColorSetting var75 = this.settingBackGroundColor;
            var37 = var75.method_47$24af287d8f(var74, var73, var72, var71);
            var10001 = 1631208641643218353L;
            BooleanSetting var76 = this.settingBackGround;
            var94 = var76.method_49$aae029aa0a();
            if (var21 == null) {
               if (!var94) {
                  break label56;
               }

               var10002 = 1633979213069588039L;
               long var77 = var8;
               ShaderOptions var79 = this.settingBackGround2;
               var94 = var79.method_49$0dd78e0064(var77);
            }

            if (var21 != null) {
               break label53;
            }

            if (var94) {
               var94 = true;
               break label53;
            }
         }

         var94 = false;
      }

      boolean var99;
      label42: {
         label57: {
            long var104 = 1631208641643218353L;
            BooleanSetting var80 = this.settingBackGround;
            var99 = var80.method_49$aae029aa0a();
            int[] var105 = var21;
            if (var1 > 0) {
               if (var21 == null) {
                  if (!var99) {
                     break label57;
                  }

                  long var114 = 1634046672324916432L;
                  long var81 = var14;
                  ShaderOptions var83 = this.settingBackGround2;
                  var99 = var83.method_47$0dd78e0064(var81);
               }

               var105 = var21;
            }

            if (var105 != null) {
               break label42;
            }

            if (var99) {
               var99 = true;
               break label42;
            }
         }

         var99 = false;
      }

      long var115 = 1630983694703123916L;
      C_47uI.method_40$9bd74f13d3(var94, var99, var12);
      C_47Fw var106 = recovery$indy$1(this, var35, var36, var34, var37, var22, var23, var25, var26, var24);
      var115 = 1633933320983280940L;
      C_47Fw var84 = var106;
      long var85 = var16;
      boolean var87 = false;
      C_47uI.method_42$300c7fd546(var87, var85, var84);
      GL11.glPopMatrix();
      RenderUtils.method_41$da8c82d5d4();
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$2(this, 32, var3, -7099338867826542749L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Coordinates_47Qz(long var1) {
      super("Coordinates", "Koordinaten", ((a ^ var1) ^ 59775993819763L), new Color(209, 69, 81), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 86486441360213L;
      long var5 = var1 ^ 91026016955783L;
      long var7 = var1 ^ 78585776205416L;
      long var9 = var1 ^ 47513714185678L;
      long var11 = var1 ^ 116690471506415L;
      long var13 = var1 ^ 39485694848589L;
      long var15 = var1 ^ 59775993819763L;
      // Super arguments moved to the required Java constructor position.
      this.settingPosX = new NumberSetting(this, "PosX", 0.0, var11, 0.0, 100.0, 2);
      this.settingPosY = new NumberSetting(this, "PosY", 0.0, var11, 0.0, 100.0, 2);
      this.settingScale = new NumberSetting(this, "Scale", 2.0, var11, 1.0, 4.0, 1);
      this.settingColor1 = new ColorSetting(var13, this, "Color1", new Color(85, 85, 85));
      this.settingColor2 = new ColorSetting(var13, this, "Color2", new Color(-1));
      this.settingBackGround = new BooleanSetting(this, var7, "BackGround", true);
      ColorSetting var10001 = new ColorSetting(var13, this, "BackGroundColor", new Color(0, 0, 0, 100));
      BooleanSetting var10002 = this.settingBackGround;
      this.settingBackGround.getClass();
      C_45n var10003 = recovery$indy$3(var10002);
      long var10004 = -4917508397854958985L;
      C_45n var17 = var10003;
      long var18 = var3;
      ColorSetting var20 = var10001;
      this.settingBackGroundColor = (ColorSetting)var20.method_43$780fd62a21(var18, var17);
      ShaderOptions var30 = new ShaderOptions(var9, this, "BackGround");
      var10004 = -4917888926429069259L;
      Color var21 = Color.black;
      long var22 = var5;
      ShaderOptions var24 = var30;
      ShaderOptions var31 = var24.method_44$10ed55120d(var22, var21);
      var10002 = this.settingBackGround;
      this.settingBackGround.getClass();
      var10003 = recovery$indy$4(var10002);
      var10004 = -4917508397854958985L;
      C_45n var25 = var10003;
      long var26 = var3;
      ShaderOptions var28 = var31;
      this.settingBackGround2 = (ShaderOptions)var28.method_43$780fd62a21(var26, var25);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_47Fw recovery$indy$1(
      Coordinates_47Qz var0, int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9
   );

   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$3(BooleanSetting var0);

   private static native C_45n recovery$indy$4(BooleanSetting var0);

   private static native MethodHandle recovery$constant$5();
}
