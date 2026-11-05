package augustus.recovered.modules.render;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import client.render.RenderPass;
import net.C_477r;
import net.C_477z;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Fw;
import net.C_47Ij;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47gg;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47si;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_486;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TargetESP_47HX extends client.module.Module implements client.event.RenderListener,net.C_47si {
    private final client.setting.MultiSelectSetting settingModules = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingTargetEspColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingTargetEspHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAdjustWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAdjustYPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLength = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCritVisualizer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCritVisualizerColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBestAimPoint = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBestAimPointSize = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBestAimPointColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_43k = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   private void method_46$2d732da069(int var1, EntityLivingBase var2, float var3, float var4, float var5, RenderPass var6) {
      long var7 = a ^ 38211368124199L;
      long var9 = var7 ^ 39751793402902L;
      long var11 = var7 ^ 84229293869611L;
      long var13 = var7 ^ 25571878208523L;
      ShaderOptions var10000 = this.field_42;
      long var10005 = 2916160618092415067L;
      long var16 = var11;
      int var18 = var1;
      RenderPass var19 = var6;
      int var10003 = C_47TX.method_40$6b468acafc(var19, var18, var16);
      long var10004 = 2910410136369271639L;
      int var20 = var10003;
      long var21 = var13;
      RenderPass var23 = var6;
      ShaderOptions var24 = var10000;
      RenderUtils.method_43$d00df7729d(var24.method_40$d68b376f5b(var23, var21, var20));
      long var49 = 2909432019109903486L;
      int[] var50 = AntiStrike_47Qa.method_42$d4d28024c9();
      float var55 = var4 + var2.field_48;
      long var10006 = 2911516922474695754L;
      long var25 = var9;
      NumberSetting var27 = this.settingAdjustYPos;
      float var56 = var55 + (float)var27.method_44$474dfaa627(var25);
      double var59 = var2.field_48w;
      long var10008 = 2911516922474695754L;
      long var28 = var9;
      NumberSetting var30 = this.settingAdjustWidth;
      double var60 = var59 + var30.method_44$474dfaa627(var28);
      var10008 = 2911516922474695754L;
      long var31 = var9;
      NumberSetting var33 = this.settingHeight;
      RenderUtils.method_43$3e42f10208(var2, var3, var56, var5, var60, var33.method_44$474dfaa627(var31));
      int[] var15 = var50;
      long var10002 = 2911516922474695754L;
      long var34 = var9;
      NumberSetting var36 = this.settingLineWidth;
      double var64;
      int var51 = (var64 = var36.method_44$474dfaa627(var34) - 0.0) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
      if (var15 == null) {
         if (var51 <= 0) {
            return;
         }

         var10002 = 2911516922474695754L;
         long var37 = var9;
         NumberSetting var39 = this.settingLineWidth;
         GL11.glLineWidth((float)(var39.method_44$474dfaa627(var37) / 2.0));
         var51 = var1;
      }

      RenderUtils.method_40$3ebc9ac54d(var51, 1.0F);
      float var53 = var4 + var2.field_48;
      var10005 = 2911516922474695754L;
      long var40 = var9;
      NumberSetting var42 = this.settingAdjustYPos;
      float var54 = var53 + (float)var42.method_44$474dfaa627(var40);
      double var57 = var2.field_48w;
      long var10007 = 2911516922474695754L;
      long var43 = var9;
      NumberSetting var45 = this.settingAdjustWidth;
      double var58 = var57 + var45.method_44$474dfaa627(var43);
      var10007 = 2911516922474695754L;
      long var46 = var9;
      NumberSetting var48 = this.settingHeight;
      RenderUtils.method_41$3e42f10208(var2, var3, var54, var5, var58, var48.method_44$474dfaa627(var46));
   }




    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

   private void method_42$9686ceb17d(EntityLivingBase var1, int var2, int var3, RenderPass var4, short var5, int var6) {
      long var9;
      long var11;
      int var39;
      label34: {
         long var7 = ((long)var3 << 32 | (long)var5 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
         var9 = var7 ^ 21887835372758L;
         var11 = var7 ^ 79383531713270L;
         long var10001 = var7 ^ 34764175207427L;
         int var13 = (int)((var7 ^ 34764175207427L) >>> 32);
         int var14 = (int)((var7 ^ 34764175207427L) << 32 >>> 48);
         int var15 = (int)(var10001 << 48 >>> 48);
         long var10000 = -2405697963701335421L;
         int[] var16 = AntiStrike_47Qa.method_42$d4d28024c9();
         TargetESP_47HX var38 = this;
         if (var16 == null) {
            label36: {
               var10001 = -2405689871010421220L;
               BooleanSetting var18 = this.settingHitColor;
               var39 = (int) ((var18.method_49$aae029aa0a()) ? 1 : 0);
               if (var5 <= 0) {
                  if (var39 == 0) {
                     break label36;
                  }

                  var39 = var1.field_432;
               }

               if (var16 != null) {
                  break label34;
               }

               if (var39 != 0) {
                  short var10002 = (short)var14;
                  char var10003 = (char)var15;
                  long var10005 = -2413699702690982267L;
                  int var19 = var2;
                  char var20 = var10003;
                  short var21 = var10002;
                  int var22 = var13;
                  ColorSetting var23 = this.settingTargetEspHitColor;
                  var39 = var23.method_47$24af287d8f(var22, var21, var20, var19);
                  break label34;
               }
            }

            var38 = this;
         }

         short var43 = (short)var14;
         char var44 = (char)var15;
         long var46 = -2413699702690982267L;
         int var24 = var2;
         char var25 = var44;
         short var26 = var43;
         int var27 = var13;
         ColorSetting var28 = var38.settingTargetEspColor;
         var39 = var28.method_47$24af287d8f(var27, var26, var25, var24);
      }

      int var17 = var39;
      ShaderOptions var41 = this.field_42;
      long var47 = -2412495831641669978L;
      long var29 = var9;
      int var31 = var17;
      RenderPass var32 = var4;
      int var45 = C_47TX.method_40$6b468acafc(var32, var31, var29);
      long var10004 = -2405337909398968918L;
      int var33 = var45;
      long var34 = var11;
      RenderPass var36 = var4;
      ShaderOptions var37 = var41;
      RenderUtils.method_43$d00df7729d(var37.method_40$d68b376f5b(var36, var34, var33));
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$426c33b229(net.C_477z var1, long var2) {
      net.minecraft.entity.Entity var15;
      net.minecraft.entity.Entity var13;
        boolean var12;
        boolean var14;
        boolean var16;
      long var4 = var2 ^ 47708964897230L;
      int[] var6 = (int[])recovery$indy$flow$60(8135312113983300856L, var2);
      EntityLivingBase var7 = (EntityLivingBase)recovery$indy$flow$61(this, var4, 8140676218686814255L, var2);
      if (var7 != null) {
         float var18;
         int var10000 = (var18 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$63(field_43, 8140780385451156066L, var2)).field_48R - 0.0F) == 0.0F
            ? 0
            : (var18 < 0.0F ? -1 : 1);
         if (var2 >= 0L) {
            label226: {
               if (var6 == null) {
                  if (var10000 <= 0) {
                     break label226;
                  }

                  var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$66(field_43, 8140780385451156066L, var2)).field_48M ? 1 : 0));
               }

               if (var6 == null) {
                  if (var10000 != 0) {
                     break label226;
                  }

                  var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, 8140780385451156066L, var2)).method_49W$aae029aa0a() ? 1 : 0));
               }

               if (var2 > 0L) {
                  label167: {
                     label228: {
                        if (var6 == null) {
                           if (var10000 != 0) {
                              break label228;
                           }

                           var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$72(field_43, 8140780385451156066L, var2)).method_48H$aae029aa0a() ? 1 : 0));
                        }

                        label229: {
                           if (var6 == null) {
                              if (var10000 != 0) {
                                 break label228;
                              }

                              var15 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$75(field_43, 8140780385451156066L, var2);
                              if (var6 != null) {
                                 break label229;
                              }

                              var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP) (var15)).method_41$e45115c4cf(net.C_47oY.field_463) ? 1 : 0));
                           }

                           if (var10000 != 0) {
                              break label228;
                           }

                           var15 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$79(field_43, 8140780385451156066L, var2)).field_48S;
                        }

                        if (var6 == null) {
                           if (var15 != null) {
                              break label228;
                           }

                           var15 = ((net.C_47Ij)recovery$indy$flow$82(field_43, 8140337571925126086L, var2)).field_47;
                        }

                        var16 = var15 instanceof EntityLivingBase;
                        if (var6 != null) {
                           break label167;
                        }

                        if (var16) {
                           var16 = true;
                           break label167;
                        }
                     }

                     var16 = false;
                  }

                  boolean var10 = var16;
                  this.field_43k
                     .add(
                        new net.C_47ti(
                           var10
                              ? (String)recovery$indy$flow$87(21863, 3572288455421846520L ^ var2)
                              : (String)recovery$indy$flow$88(827, 933462140738680233L ^ var2),
                           ((net.C_47Ij)recovery$indy$flow$90(field_43, 8140337571925126086L, var2)).field_45,
                           System.currentTimeMillis()
                        )
                     );
                  return;
               }

               label190: {
                  label231: {
                     label232: {
                        if (var6 == null) {
                           if (var10000 != 0) {
                              break label231;
                           }

                           var13 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$75(field_43, 8140780385451156066L, var2);
                           if (var6 != null) {
                              break label232;
                           }

                           var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP) (var13)).method_41$e45115c4cf(net.C_47oY.field_463) ? 1 : 0));
                        }

                        if (var10000 != 0) {
                           break label231;
                        }

                        var13 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$79(field_43, 8140780385451156066L, var2)).field_48S;
                     }

                     if (var6 == null) {
                        if (var13 != null) {
                           break label231;
                        }

                        var13 = ((net.C_47Ij)recovery$indy$flow$82(field_43, 8140337571925126086L, var2)).field_47;
                     }

                     var14 = var13 instanceof EntityLivingBase;
                     if (var6 != null) {
                        break label190;
                     }

                     if (var14) {
                        var14 = true;
                        break label190;
                     }
                  }

                  var14 = false;
               }

               boolean var9 = var14;
               this.field_43k
                  .add(
                     new net.C_47ti(
                        var9
                           ? (String)recovery$indy$flow$87(21863, 3572288455421846520L ^ var2)
                           : (String)recovery$indy$flow$88(827, 933462140738680233L ^ var2),
                        ((net.C_47Ij)recovery$indy$flow$90(field_43, 8140337571925126086L, var2)).field_45,
                        System.currentTimeMillis()
                     )
                  );
               return;
            }

            boolean var17 = false;
            this.field_43k
               .add(
                  new net.C_47ti(
                     (String)recovery$indy$flow$88(827, 933462140738680233L ^ var2),
                     ((net.C_47Ij)recovery$indy$flow$90(field_43, 8140337571925126086L, var2)).field_45,
                     System.currentTimeMillis()
                  )
               );
         } else {
            label222: {
               label234: {
                  net.minecraft.entity.Entity var11;
                  int[] var10001;
                  if (var6 == null) {
                     if (var10000 != 0) {
                        break label234;
                     }

                     var11 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$75(field_43, 8140780385451156066L, var2);
                     var10001 = var6;
                  } else {
                     if (var10000 != 0) {
                        break label234;
                     }

                     var11 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$79(field_43, 8140780385451156066L, var2)).field_48S;
                     var10001 = var6;
                  }

                  if (var10001 == null) {
                     if (var11 != null) {
                        break label234;
                     }

                     var11 = ((net.C_47Ij)recovery$indy$flow$82(field_43, 8140337571925126086L, var2)).field_47;
                  }

                  var12 = var11 instanceof EntityLivingBase;
                  if (var6 != null) {
                     break label222;
                  }

                  if (var12) {
                     var12 = true;
                     break label222;
                  }
               }

               var12 = false;
            }

            boolean var8 = var12;
            this.field_43k
               .add(
                  new net.C_47ti(
                     var8 ? (String)recovery$indy$flow$87(21863, 3572288455421846520L ^ var2) : (String)recovery$indy$flow$88(827, 933462140738680233L ^ var2),
                     ((net.C_47Ij)recovery$indy$flow$90(field_43, 8140337571925126086L, var2)).field_45,
                     System.currentTimeMillis()
                  )
               );
         }
      }
   }




   private void method_44$9b5ac9f644(EntityLivingBase var1, RenderPass var2) {
      long var3 = a ^ 78056040138168L;
      long var5 = var3 ^ 126694242447313L;
      long var10004 = 5972188192745899162L;
      RenderPass var7 = var2;
      EntityLivingBase var8 = var1;
      long var9 = var5;
      TargetESP_47HX var11 = this;
      var11.method_48$6e09e282af(var9, var8, var7);
   }



   public void method_48$6e09e282af(long var1, net.minecraft.entity.EntityLivingBase var3, client.render.RenderPass var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 31961079948819L;
      long var7 = var1 ^ 51088667493902L;
      long var10001 = var1 ^ 79664619742131L;
      int var9 = (int)((var1 ^ 79664619742131L) >>> 32);
      int var10 = (int)((var1 ^ 79664619742131L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 133984734796027L;
      int var12 = (int)((var1 ^ 133984734796027L) >>> 32);
      int var13 = (int)((var1 ^ 133984734796027L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      double var253 = var3.field_48Q - var3.field_48u;
      long var10003 = 7666474451022469765L;
      net.minecraft.client.Minecraft var30 = field_43;
      double var10000 = var3.field_48u + var253 * var30.method_46$159e3d0645().field_49;
      long var10002 = 7666804033282825235L;
      net.minecraft.client.Minecraft var31 = field_43;
      float var16 = (float)(var10000 - var31.method_45$17391f161a().method_41$fedcb3e4d3());
      long var225 = 7666630935095688827L;
      int[] var226 = AntiStrike_47Qa.method_42$d4d28024c9();
      double var265 = var3.field_48j - var3.field_48O;
      long var10004 = 7666474451022469765L;
      net.minecraft.client.Minecraft var32 = field_43;
      double var254 = var3.field_48O + var265 * var32.method_46$159e3d0645().field_49;
      var10003 = 7666804033282825235L;
      net.minecraft.client.Minecraft var33 = field_43;
      float var17 = (float)(var254 - var33.method_45$17391f161a().method_49$fedcb3e4d3());
      double var266 = var3.field_42o - var3.field_48l;
      var10004 = 7666474451022469765L;
      net.minecraft.client.Minecraft var34 = field_43;
      double var255 = var3.field_48l + var266 * var34.method_46$159e3d0645().field_49;
      var10003 = 7666804033282825235L;
      net.minecraft.client.Minecraft var35 = field_43;
      float var18 = (float)(var255 - var35.method_45$17391f161a().method_45$fedcb3e4d3());
      int[] var15 = var226;
      net.minecraft.client.renderer.GlStateManager.method_426$da8c82d5d4();
      net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
      org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
      org.lwjgl.opengl.GL11.glEnable(2848);
      net.minecraft.client.renderer.GlStateManager.method_421$da8c82d5d4();
      net.minecraft.client.renderer.GlStateManager.method_42i$da8c82d5d4();
      org.lwjgl.opengl.GL11.glLineWidth(3.0F);
      org.lwjgl.opengl.GL11.glShadeModel(7425);
      org.lwjgl.opengl.GL11.glDisable(2884);
      double var19 = var3.field_48w * 1.2;
      var10000 = System.currentTimeMillis();
      var10004 = 7665953407033921103L;
      long var36 = var5;
      client.setting.NumberSetting var38 = this.settingSpeed;
      float var21 = (float)Math.sin(var10000 / (400.0 / var38.method_44$474dfaa627(var36)));
      var10002 = 7665953407033921103L;
      long var39 = var5;
      client.setting.NumberSetting var41 = this.settingLength;
      double var22 = net.C_47sk.method_45$4b58f7ab41(var41.method_44$474dfaa627(var39), 0.0, 10.0);
      org.lwjgl.opengl.GL11.glTranslatef(0.0F, var21, 0.0F);
      org.lwjgl.opengl.GL11.glBegin(5);
      int var24 = 0;
      if (var24 < 361) {
         short var302 = (short)var10;
         long var320 = 7673466601392049738L;
         int var91 = var11;
         short var94 = var302;
         client.render.RenderPass var97 = var4;
         int var100 = var9;
         int var103 = var24;
         net.minecraft.entity.EntityLivingBase var106 = var3;
         TargetESP_47HX var109 = this;
         var109.method_42$9686ceb17d(var106, var103, var100, var97, var94, var91);
         double var80 = var16 + Math.cos(Math.toRadians(var24)) * var19;
         double var83 = var18 - Math.sin(Math.toRadians(var24)) * var19;
         org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F, var83);
         TargetESP_47HX var238 = this;
         if (var15 == null) {
            while (true) {
               var10001 = 7666573020785185508L;
               client.setting.BooleanSetting var112 = var238.settingHitColor;
               int var245;
               if (var112.method_49$aae029aa0a() && var3.field_432 != 0) {
                  short var274 = (short)var13;
                  char var285 = (char)var14;
                  long var309 = 7672082820586988157L;
                  int var114 = var24;
                  char var116 = var285;
                  short var118 = var274;
                  int var120 = var12;
                  client.setting.ColorSetting var122 = this.settingTargetEspHitColor;
                  var245 = var122.method_47$24af287d8f(var120, var118, var116, var114);
               } else {
                  short var273 = (short)var13;
                  char var284 = (char)var14;
                  long var308 = 7672082820586988157L;
                  int var127 = var24;
                  char var132 = var284;
                  short var137 = var273;
                  int var142 = var12;
                  client.setting.ColorSetting var147 = this.settingTargetEspColor;
                  var245 = var147.method_47$24af287d8f(var142, var137, var132, var127);
               }

               int var89 = var245;
               var10004 = 7667065759418011986L;
               int var152 = var89;
               long var157 = var7;
               client.render.RenderPass var162 = var4;
               client.setting.ShaderOptions var167 = this.field_42;
               client.render.RenderUtils.method_40$3ebc9ac54d(var167.method_40$d68b376f5b(var162, var157, var152), 0.0F);
               org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F + var21 * 0.4F * var22, var83);
               if (++var24 >= 361) {
                  org.lwjgl.opengl.GL11.glEnd();
                  org.lwjgl.opengl.GL11.glBegin(2);
                  if (var1 >= 0L) {
                     var24 = 0;
                     if (var24 >= 361) {
                        org.lwjgl.opengl.GL11.glEnd();
                        net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                        org.lwjgl.opengl.GL11.glShadeModel(7424);
                        org.lwjgl.opengl.GL11.glDisable(2848);
                        org.lwjgl.opengl.GL11.glEnable(2884);
                        net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                        long var329;
                        int var251 = (var329 = var1 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                        net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                        return;
                     }

                     var302 = (short)var10;
                     var320 = 7673466601392049738L;
                     int var174 = var11;
                     short var182 = var302;
                     client.render.RenderPass var190 = var4;
                     int var198 = var9;
                     int var206 = var24;
                     net.minecraft.entity.EntityLivingBase var214 = var3;
                     TargetESP_47HX var222 = this;
                     var222.method_42$9686ceb17d(var214, var206, var198, var190, var182, var174);
                     org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                     var24++;
                     int[] var248 = var15;
                     if (var1 > 0L) {
                        while (var248 == null) {
                           if (var15 != null || var24 >= 361) {
                              org.lwjgl.opengl.GL11.glEnd();
                              net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                              org.lwjgl.opengl.GL11.glShadeModel(7424);
                              org.lwjgl.opengl.GL11.glDisable(2848);
                              org.lwjgl.opengl.GL11.glEnable(2884);
                              net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                              net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                              net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                              net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                              net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                              long var330;
                              int var250 = (var330 = var1 - 0L) == 0L ? 0 : (var330 < 0L ? -1 : 1);
                              net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                              break;
                           }

                           var302 = (short)var10;
                           var320 = 7673466601392049738L;
                           var174 = var11;
                           var182 = var302;
                           var190 = var4;
                           var198 = var9;
                           var206 = var24;
                           var214 = var3;
                           var222 = this;
                           var222.method_42$9686ceb17d(var214, var206, var198, var190, var182, var174);
                           org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                           var24++;
                           var248 = var15;
                           long var331;
                           int var264 = (var331 = var1 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                        }

                        return;
                     }

                     while (var248 == null && var24 < 361) {
                        var302 = (short)var10;
                        var320 = 7673466601392049738L;
                        var174 = var11;
                        var182 = var302;
                        var190 = var4;
                        var198 = var9;
                        var206 = var24;
                        var214 = var3;
                        var222 = this;
                        var222.method_42$9686ceb17d(var214, var206, var198, var190, var182, var174);
                        org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                        var24++;
                        var248 = var15;
                        long var332;
                        int var263 = (var332 = var1 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                     }

                     org.lwjgl.opengl.GL11.glEnd();
                     net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                     org.lwjgl.opengl.GL11.glShadeModel(7424);
                     org.lwjgl.opengl.GL11.glDisable(2848);
                     org.lwjgl.opengl.GL11.glEnable(2884);
                     net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                     long var333;
                     int var249 = (var333 = var1 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                     net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                     return;
                  }

                  while (true) {
                     var80 = var16 + Math.cos(Math.toRadians(var24)) * var19;
                     var83 = var18 - Math.sin(Math.toRadians(var24)) * var19;
                     org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F, var83);
                     var10001 = 7666573020785185508L;
                     var112 = this.settingHitColor;
                     int var246;
                     if (var112.method_49$aae029aa0a() && var3.field_432 != 0) {
                        short var276 = (short)var13;
                        char var287 = (char)var14;
                        long var312 = 7672082820586988157L;
                        int var115 = var24;
                        char var117 = var287;
                        short var119 = var276;
                        int var121 = var12;
                        client.setting.ColorSetting var123 = this.settingTargetEspHitColor;
                        var246 = var123.method_47$24af287d8f(var121, var119, var117, var115);
                     } else {
                        short var275 = (short)var13;
                        char var286 = (char)var14;
                        long var311 = 7672082820586988157L;
                        int var128 = var24;
                        char var133 = var286;
                        short var138 = var275;
                        int var143 = var12;
                        client.setting.ColorSetting var148 = this.settingTargetEspColor;
                        var246 = var148.method_47$24af287d8f(var143, var138, var133, var128);
                     }

                     var89 = var246;
                     var10004 = 7667065759418011986L;
                     var152 = var89;
                     var157 = var7;
                     var162 = var4;
                     var167 = this.field_42;
                     client.render.RenderUtils.method_40$3ebc9ac54d(var167.method_40$d68b376f5b(var162, var157, var152), 0.0F);
                     org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F + var21 * 0.4F * var22, var83);
                     if (++var24 < 361) {
                        var302 = (short)var10;
                        var320 = 7673466601392049738L;
                        var91 = var11;
                        var94 = var302;
                        var97 = var4;
                        var100 = var9;
                        var103 = var24;
                        var106 = var3;
                        var109 = this;
                        var109.method_42$9686ceb17d(var106, var103, var100, var97, var94, var91);
                     } else {
                        org.lwjgl.opengl.GL11.glEnd();
                        org.lwjgl.opengl.GL11.glBegin(2);
                        long var334;
                        int var247 = (var334 = var1 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                     }
                  }
               }

               var302 = (short)var10;
               var320 = 7673466601392049738L;
               var91 = var11;
               var94 = var302;
               var97 = var4;
               var100 = var9;
               var103 = var24;
               var106 = var3;
               var109 = this;
               var109.method_42$9686ceb17d(var106, var103, var100, var97, var94, var91);
               var80 = var16 + Math.cos(Math.toRadians(var24)) * var19;
               var83 = var18 - Math.sin(Math.toRadians(var24)) * var19;
               org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F, var83);
               var238 = this;
            }
         } else {
            short var271 = (short)var13;
            char var282 = (char)var14;
            long var303 = 7672082820586988157L;
            int var125 = var24;
            char var130 = var282;
            short var135 = var271;
            int var140 = var12;
            client.setting.ColorSetting var145 = this.settingTargetEspColor;
            int var87 = var145.method_47$24af287d8f(var140, var135, var130, var125);
            var10004 = 7667065759418011986L;
            int var150 = var87;
            long var155 = var7;
            client.render.RenderPass var160 = var4;
            client.setting.ShaderOptions var165 = this.field_42;
            client.render.RenderUtils.method_40$3ebc9ac54d(var165.method_40$d68b376f5b(var160, var155, var150), 0.0F);
            org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F + var21 * 0.4F * var22, var83);
            var24++;
            org.lwjgl.opengl.GL11.glEnd();
            org.lwjgl.opengl.GL11.glBegin(2);
            if (var1 < 0L) {
               while (true) {
                  var80 = var16 + Math.cos(Math.toRadians(var24)) * var19;
                  var83 = var18 - Math.sin(Math.toRadians(var24)) * var19;
                  org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F, var83);
                  short var272 = (short)var13;
                  char var283 = (char)var14;
                  long var307 = 7672082820586988157L;
                  var125 = var24;
                  var130 = var283;
                  var135 = var272;
                  var140 = var12;
                  var145 = this.settingTargetEspColor;
                  var87 = var145.method_47$24af287d8f(var140, var135, var130, var125);
                  var10004 = 7667065759418011986L;
                  var150 = var87;
                  var155 = var7;
                  var160 = var4;
                  var165 = this.field_42;
                  client.render.RenderUtils.method_40$3ebc9ac54d(var165.method_40$d68b376f5b(var160, var155, var150), 0.0F);
                  org.lwjgl.opengl.GL11.glVertex3d(var80, var17 + 1.0F + var21 * 0.4F * var22, var83);
                  var24++;
                  org.lwjgl.opengl.GL11.glEnd();
                  org.lwjgl.opengl.GL11.glBegin(2);
                  long var335;
                  int var243 = (var335 = var1 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
               }
            }

            var24 = 0;
            if (var24 >= 361) {
               org.lwjgl.opengl.GL11.glEnd();
               net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
               org.lwjgl.opengl.GL11.glShadeModel(7424);
               org.lwjgl.opengl.GL11.glDisable(2848);
               org.lwjgl.opengl.GL11.glEnable(2884);
               net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
               long var336;
               int var242 = (var336 = var1 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
               net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
            } else {
               var302 = (short)var10;
               var320 = 7673466601392049738L;
               int var171 = var11;
               short var179 = var302;
               client.render.RenderPass var187 = var4;
               int var195 = var9;
               int var203 = var24;
               net.minecraft.entity.EntityLivingBase var211 = var3;
               TargetESP_47HX var219 = this;
               var219.method_42$9686ceb17d(var211, var203, var195, var187, var179, var171);
               org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
               var24++;
               int[] var239 = var15;
               if (var1 > 0L) {
                  while (var239 == null) {
                     if (var15 != null || var24 >= 361) {
                        org.lwjgl.opengl.GL11.glEnd();
                        net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                        org.lwjgl.opengl.GL11.glShadeModel(7424);
                        org.lwjgl.opengl.GL11.glDisable(2848);
                        org.lwjgl.opengl.GL11.glEnable(2884);
                        net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                        net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                        long var337;
                        int var241 = (var337 = var1 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                        net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                        break;
                     }

                     var302 = (short)var10;
                     var320 = 7673466601392049738L;
                     var171 = var11;
                     var179 = var302;
                     var187 = var4;
                     var195 = var9;
                     var203 = var24;
                     var211 = var3;
                     var219 = this;
                     var219.method_42$9686ceb17d(var211, var203, var195, var187, var179, var171);
                     org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                     var24++;
                     var239 = var15;
                     long var338;
                     int var260 = (var338 = var1 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                  }
               } else {
                  while (var239 == null && var24 < 361) {
                     var302 = (short)var10;
                     var320 = 7673466601392049738L;
                     var171 = var11;
                     var179 = var302;
                     var187 = var4;
                     var195 = var9;
                     var203 = var24;
                     var211 = var3;
                     var219 = this;
                     var219.method_42$9686ceb17d(var211, var203, var195, var187, var179, var171);
                     org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                     var24++;
                     var239 = var15;
                     long var339;
                     int var259 = (var339 = var1 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                  }

                  org.lwjgl.opengl.GL11.glEnd();
                  net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                  org.lwjgl.opengl.GL11.glShadeModel(7424);
                  org.lwjgl.opengl.GL11.glDisable(2848);
                  org.lwjgl.opengl.GL11.glEnable(2884);
                  net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                  net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                  net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                  net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                  net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                  long var340;
                  int var240 = (var340 = var1 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                  net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
               }
            }
         }
      } else {
         org.lwjgl.opengl.GL11.glEnd();
         org.lwjgl.opengl.GL11.glBegin(2);
         if (var1 < 0L) {
            double var25 = var16 + Math.cos(Math.toRadians(var24)) * var19;
            double var27 = var18 - Math.sin(Math.toRadians(var24)) * var19;
            org.lwjgl.opengl.GL11.glVertex3d(var25, var17 + 1.0F, var27);
            TargetESP_47HX var232 = this;
            if (var15 != null) {
               while (true) {
                  short var270 = (short)var13;
                  char var281 = (char)var14;
                  long var301 = 7672082820586988157L;
                  int var124 = var24;
                  char var129 = var281;
                  short var134 = var270;
                  int var139 = var12;
                  client.setting.ColorSetting var144 = var232.settingTargetEspColor;
                  int var86 = var144.method_47$24af287d8f(var139, var134, var129, var124);
                  var10004 = 7667065759418011986L;
                  int var149 = var86;
                  long var154 = var7;
                  client.render.RenderPass var159 = var4;
                  client.setting.ShaderOptions var164 = this.field_42;
                  client.render.RenderUtils.method_40$3ebc9ac54d(var164.method_40$d68b376f5b(var159, var154, var149), 0.0F);
                  org.lwjgl.opengl.GL11.glVertex3d(var25, var17 + 1.0F + var21 * 0.4F * var22, var27);
                  var24++;
                  org.lwjgl.opengl.GL11.glEnd();
                  org.lwjgl.opengl.GL11.glBegin(2);
                  long var341;
                  int var237 = (var341 = var1 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                  var25 = var16 + Math.cos(Math.toRadians(var24)) * var19;
                  var27 = var18 - Math.sin(Math.toRadians(var24)) * var19;
                  org.lwjgl.opengl.GL11.glVertex3d(var25, var17 + 1.0F, var27);
                  var232 = this;
               }
            }

            while (true) {
               var10001 = 7666573020785185508L;
               client.setting.BooleanSetting var49 = var232.settingHitColor;
               int var234;
               if (var49.method_49$aae029aa0a() && var3.field_432 != 0) {
                  short var269 = (short)var13;
                  char var280 = (char)var14;
                  long var299 = 7672082820586988157L;
                  int var50 = var24;
                  char var51 = var280;
                  short var52 = var269;
                  int var53 = var12;
                  client.setting.ColorSetting var54 = this.settingTargetEspHitColor;
                  var234 = var54.method_47$24af287d8f(var53, var52, var51, var50);
               } else {
                  short var268 = (short)var13;
                  char var279 = (char)var14;
                  long var298 = 7672082820586988157L;
                  int var55 = var24;
                  char var56 = var279;
                  short var57 = var268;
                  int var58 = var12;
                  client.setting.ColorSetting var59 = this.settingTargetEspColor;
                  var234 = var59.method_47$24af287d8f(var58, var57, var56, var55);
               }

               int var29 = var234;
               var10004 = 7667065759418011986L;
               int var60 = var29;
               long var61 = var7;
               client.render.RenderPass var63 = var4;
               client.setting.ShaderOptions var64 = this.field_42;
               client.render.RenderUtils.method_40$3ebc9ac54d(var64.method_40$d68b376f5b(var63, var61, var60), 0.0F);
               org.lwjgl.opengl.GL11.glVertex3d(var25, var17 + 1.0F + var21 * 0.4F * var22, var27);
               if (++var24 < 361) {
                  short var300 = (short)var10;
                  long var319 = 7673466601392049738L;
                  int var42 = var11;
                  short var43 = var300;
                  client.render.RenderPass var44 = var4;
                  int var45 = var9;
                  int var46 = var24;
                  net.minecraft.entity.EntityLivingBase var47 = var3;
                  TargetESP_47HX var48 = this;
                  var48.method_42$9686ceb17d(var47, var46, var45, var44, var43, var42);
               } else {
                  org.lwjgl.opengl.GL11.glEnd();
                  org.lwjgl.opengl.GL11.glBegin(2);
                  long var342;
                  int var235 = (var342 = var1 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
               }

               var25 = var16 + Math.cos(Math.toRadians(var24)) * var19;
               var27 = var18 - Math.sin(Math.toRadians(var24)) * var19;
               org.lwjgl.opengl.GL11.glVertex3d(var25, var17 + 1.0F, var27);
               var232 = this;
            }
         }

         var24 = 0;
         if (var24 >= 361) {
            org.lwjgl.opengl.GL11.glEnd();
            net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
            org.lwjgl.opengl.GL11.glShadeModel(7424);
            org.lwjgl.opengl.GL11.glDisable(2848);
            org.lwjgl.opengl.GL11.glEnable(2884);
            net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
            long var343;
            int var231 = (var343 = var1 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
            net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
         } else {
            short var10005 = (short)var10;
            long var10007 = 7673466601392049738L;
            int var65 = var11;
            short var66 = var10005;
            client.render.RenderPass var67 = var4;
            int var68 = var9;
            int var69 = var24;
            net.minecraft.entity.EntityLivingBase var70 = var3;
            TargetESP_47HX var71 = this;
            var71.method_42$9686ceb17d(var70, var69, var68, var67, var66, var65);
            org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
            var24++;
            int[] var228 = var15;
            if (var1 > 0L) {
               while (var228 == null) {
                  if (var15 != null || var24 >= 361) {
                     org.lwjgl.opengl.GL11.glEnd();
                     net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
                     org.lwjgl.opengl.GL11.glShadeModel(7424);
                     org.lwjgl.opengl.GL11.glDisable(2848);
                     org.lwjgl.opengl.GL11.glEnable(2884);
                     net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                     net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                     long var344;
                     int var230 = (var344 = var1 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                     net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                     break;
                  }

                  var10005 = (short)var10;
                  var10007 = 7673466601392049738L;
                  var65 = var11;
                  var66 = var10005;
                  var67 = var4;
                  var68 = var9;
                  var69 = var24;
                  var70 = var3;
                  var71 = this;
                  var71.method_42$9686ceb17d(var70, var69, var68, var67, var66, var65);
                  org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                  var24++;
                  var228 = var15;
                  long var345;
                  int var257 = (var345 = var1 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
               }
            } else {
               while (var228 == null && var24 < 361) {
                  var10005 = (short)var10;
                  var10007 = 7673466601392049738L;
                  var65 = var11;
                  var66 = var10005;
                  var67 = var4;
                  var68 = var9;
                  var69 = var24;
                  var70 = var3;
                  var71 = this;
                  var71.method_42$9686ceb17d(var70, var69, var68, var67, var66, var65);
                  org.lwjgl.opengl.GL11.glVertex3d(var16 + Math.cos(Math.toRadians(var24)) * var19, var17 + 1.0F, var18 - Math.sin(Math.toRadians(var24)) * var19);
                  var24++;
                  var228 = var15;
                  long var346;
                  int var256 = (var346 = var1 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
               }

               org.lwjgl.opengl.GL11.glEnd();
               net.minecraft.client.renderer.GlStateManager.method_42p$da8c82d5d4();
               org.lwjgl.opengl.GL11.glShadeModel(7424);
               org.lwjgl.opengl.GL11.glDisable(2848);
               org.lwjgl.opengl.GL11.glEnable(2884);
               net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
               net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
               long var347;
               int var229 = (var347 = var1 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
               net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
            }
         }
      }
   }







   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 59058050922270L;
      long var3 = var1 ^ 16716432041377L;
      long var10002 = -6899348282056840934L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Box");
   }



   private EntityLivingBase method_48$ca0d30613f(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 108009602840100L;
      long var8 = var4 ^ 71912631219671L;
      int[] var10 = recovery$indy$13(-4250268783505272550L, var4);
      if (!recovery$indy$14(C_486.LEGIT, -4249427722219954726L, var4)) {
         return null;
      }

      C_47Ij var11 = recovery$indy$16(var6, 1.0F, recovery$indy$15(ClientGlobals.field_46, -4243840024706795690L, var4), 6.0, 0.5, -4244470849625412300L, var4);
      C_47Ij var10000 = var11;
      if (var10 == null) {
         if (var11 == null) {
            return null;
         }

         var10000 = var11;
      }

      boolean var12 = var10000.field_47 instanceof EntityLivingBase;
      if (var10 == null) {
         if (!var12) {
            return null;
         }

         if (var10 != null) {
            return (EntityLivingBase)var11.field_47;
         }

         var12 = var11.field_47 instanceof EntityPlayer;
      }

      if (var12) {
         EntityPlayer var14 = (EntityPlayer)var11.field_47;
         if (var10 != null) {
            return var14;
         }

         if (!recovery$indy$17(var8, var14, -4243686003904400559L, var4)) {
            return null;
         }
      }

      return (EntityLivingBase)var11.field_47;
   }



   public EntityLivingBase method_49$f2b0beb8fc(long var1) {
      client.module.ModuleManager var10;
      client.module.ModuleManager var12;
      augustus.recovered.modules.legit.AutoRod_47C7 var13;
      long var3;
      int var5;
      int var6;
      int var7;
      int[] var8;
      int[] var14;
      boolean var10000;
      label145: {
         var1 = a ^ var1;
         var3 = var1 ^ 128545543383088L;
         long var10001 = var1 ^ 78239912653868L;
         var5 = (int)((var1 ^ 78239912653868L) >>> 48);
         var6 = (int)((var1 ^ 78239912653868L) << 16 >>> 32);
         var7 = (int)(var10001 << 48 >>> 48);
         var8 = recovery$indy$18(7377857259407553149L, var1);
         var10000 = recovery$indy$19(ClientGlobals.field_48.field_48Q, var3, 7384283477797756685L, var1);
         label144:
         if (var8 == null) {
            label142: {
               if (var10000) {
                  var10 = ClientGlobals.field_48;
                  if (var8 != null) {
                     break label142;
                  }

                  if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                     var10000 = recovery$indy$20(C_486.KILL_AURA, 7377011747201973949L, var1);
                     var14 = var8;
                     if (var1 <= 0L) {
                        break label145;
                     }

                     if (var8 != null) {
                        break label144;
                     }

                     if (var10000) {
                        return ClientGlobals.field_48.field_48Q.field_45z;
                     }
                  }
               }

               var10 = ClientGlobals.field_48;
            }

            var10000 = recovery$indy$21(var10.field_46e, var3, 7384283477797756685L, var1);
         }

         var14 = var8;
      }

      label127: {
         label126:
         if (var14 == null) {
            label124: {
               if (var10000) {
                  var12 = ClientGlobals.field_48;
                  if (var8 != null) {
                     break label124;
                  }

                  if (ClientGlobals.field_48.field_46e.field_43c != null) {
                     var10000 = recovery$indy$22(C_486.AIM_BOT, 7377011747201973949L, var1);
                     var14 = var8;
                     if (var1 <= 0L) {
                        break label127;
                     }

                     if (var8 != null) {
                        break label126;
                     }

                     if (var10000) {
                        return ClientGlobals.field_48.field_46e.field_43c;
                     }
                  }
               }

               var12 = ClientGlobals.field_48;
            }

            var10000 = recovery$indy$23(var12.field_462, var3, 7384283477797756685L, var1);
         }

         var14 = var8;
      }

      label109: {
         label108:
         if (var14 == null) {
            if (var10000 && ClientGlobals.field_48.field_462.field_456 != null) {
               var10000 = recovery$indy$24(C_486.AIM_ASSIST, 7377011747201973949L, var1);
               var14 = var8;
               if (var1 < 0L) {
                  break label109;
               }

               if (var8 != null) {
                  break label108;
               }

               if (var10000) {
                  return ClientGlobals.field_48.field_462.field_456;
               }
            }

            var10000 = recovery$indy$25(C_486.AUTO_ROD, 7377011747201973949L, var1);
         }

         var14 = var8;
      }

      label153: {
         if (var14 == null) {
            if (!var10000) {
               return recovery$indy$29(this, (short)var5, var6, var7, 7377564930203505260L, var1);
            }

            var13 = ClientGlobals.field_48.field_46k;
            if (var8 != null) {
               break label153;
            }

            var10000 = recovery$indy$26(ClientGlobals.field_48.field_46k, var3, 7384283477797756685L, var1);
         }

         if (!var10000) {
            return recovery$indy$29(this, (short)var5, var6, var7, 7377564930203505260L, var1);
         }

         var13 = ClientGlobals.field_48.field_46k;
      }

      EntityLivingBase var11 = recovery$indy$27(var13, 7377621922666786505L, var1);
      if (var8 != null) {
         return var11;
      } else {
         return var11 != null
            ? recovery$indy$28(ClientGlobals.field_48.field_46k, 7377621922666786505L, var1)
            : recovery$indy$29(this, (short)var5, var6, var7, 7377564930203505260L, var1);
      }
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 118270708348742L;
      long var3 = var1 ^ 89144551663097L;
      long var10002 = 2312819879715498306L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Box");
   }



   public void onRender3D(long var1, float var3) {
        int[] var133;
        net.minecraft.client.Minecraft var135;
        float var136;
        long var148;
      long var6;
      long var18;
      int var20;
      int var21;
      int var22;
      int[] var23;
      net.minecraft.entity.EntityLivingBase var24;
      label200: {
         long var4 = var1 ^ 75862687826910L;
         var6 = var1 ^ 57482311646357L;
         long var8 = var1 ^ 58577708171723L;
         long var10 = var1 ^ 5451650687478L;
         long var12 = var1 ^ 52344924935716L;
         long var14 = var1 ^ 8944581653787L;
         long var16 = var1 ^ 80017760765463L;
         var18 = var1 ^ 36935386977251L;
         long var10001 = var1 ^ 88570288194173L;
         var20 = (int)((var1 ^ 88570288194173L) >>> 32);
         var21 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
         var22 = (int)(var10001 << 48 >>> 48);
         var23 = AntiStrike_47Qa.method_42$d4d28024c9();
         long var35 = var8;
         TargetESP_47HX var37 = this;
         var24 = var37.method_49$f2b0beb8fc(var35);
         if (var23 == null) {
            if (var24 == null) {
               break label200;
            }

            client.render.RenderUtils.method_42$da8c82d5d4();
         }

         int var10000;
         long var38 = var14;
         client.setting.ModeSetting var40 = this.settingMode;
         String var25 = var40.method_46$5f9dc63072(var38);
         byte var26 = -1;
         var10000 = var25.hashCode();
         label165:
         if (var23 == null) {
            label189: {
               switch (var10000) {
                  case 66987:
                     var10000 = ((int) (var25.equals("Box") ? 1 : 0));
                     if (var23 != null) {
                        break label165;
                     }

                     if (var10000 == 0) {
                        break label189;
                     }

                     var10000 = 0;
                     if (var1 < 0L) {
                        break;
                     }

                     var26 = 0;
                     if (var23 == null) {
                        break label189;
                     }
                  case 79882757:
                     var10000 = ((int) (var25.equals("Sigma") ? 1 : 0));
                     break;
                  default:
                     break label189;
               }

               if (var23 != null) {
                  break label165;
               }

               if (var10000 != 0) {
                  var26 = 1;
               }
            }

            var10000 = var26;
         }

         switch (var10000) {
            case 0:
               float var27;
               float var28;
               float var29;
               label156: {
                  double var139 = var24.field_48Q - var24.field_48u;
                  net.minecraft.client.Minecraft var41 = field_43;
                  double var121 = var24.field_48u + var139 * var41.method_46$159e3d0645().field_49;
                  net.minecraft.client.Minecraft var42 = field_43;
                  var27 = (float)(var121 - var42.method_45$17391f161a().method_41$fedcb3e4d3());
                  double var140 = var24.field_48j - var24.field_48O;
                  net.minecraft.client.Minecraft var43 = field_43;
                  double var122 = var24.field_48O + var140 * var43.method_46$159e3d0645().field_49;
                  net.minecraft.client.Minecraft var44 = field_43;
                  var28 = (float)(var122 - var44.method_45$17391f161a().method_49$fedcb3e4d3());
                  double var141 = var24.field_42o - var24.field_48l;
                  net.minecraft.client.Minecraft var45 = field_43;
                  double var123 = var24.field_48l + var141 * var45.method_46$159e3d0645().field_49;
                  net.minecraft.client.Minecraft var46 = field_43;
                  var29 = (float)(var123 - var46.method_45$17391f161a().method_45$fedcb3e4d3());
                  TargetESP_47HX var124 = this;
                  if (var23 == null) {
                     label192: {
                        client.setting.BooleanSetting var47 = this.settingHitColor;
                        var10000 = ((int) (var47.method_49$aae029aa0a() ? 1 : 0));
                        if (var1 >= 0L) {
                           if (var10000 == 0) {
                              break label192;
                           }

                           var10000 = var24.field_432;
                        }

                        if (var23 != null) {
                           break label156;
                        }

                        if (var10000 > 0) {
                           short var10002 = (short)var21;
                           char var10003 = (char)var22;
                           byte var48 = 0;
                           char var49 = var10003;
                           short var50 = var10002;
                           int var51 = var20;
                           client.setting.ColorSetting var52 = this.settingTargetEspHitColor;
                           var10000 = var52.method_47$24af287d8f(var51, var50, var49, var48);
                           break label156;
                        }
                     }

                     var124 = this;
                  }

                  short var146 = (short)var21;
                  char var151 = (char)var22;
                  byte var53 = 0;
                  char var54 = var151;
                  short var55 = var146;
                  int var56 = var20;
                  client.setting.ColorSetting var57 = var124.settingTargetEspColor;
                  var10000 = var57.method_47$24af287d8f(var56, var55, var54, var53);
               }

               int var34 = var10000;
               long var58 = var4;
               client.setting.ShaderOptions var60 = this.field_42;
               boolean var127 = var60.method_49$0dd78e0064(var58);
               long var61 = var12;
               client.setting.ShaderOptions var63 = this.field_42;
               net.C_47uI.method_40$9bd74f13d3(var127, var63.method_47$0dd78e0064(var61), var10);
               net.C_47Fw var64 = (net.C_47Fw)recovery$indy$flow$336(this, var34, var24, var27, var28, var29);
               long var65 = var16;
               boolean var67 = true;
               net.C_47uI.method_42$300c7fd546(var67, var65, var64);
               if (var1 <= 0L || var23 == null) {
                  break;
               }
            case 1:
               long var68 = var4;
               client.setting.ShaderOptions var70 = this.field_42;
               boolean var128 = var70.method_49$0dd78e0064(var68);
               long var71 = var12;
               client.setting.ShaderOptions var73 = this.field_42;
               net.C_47uI.method_40$9bd74f13d3(var128, var73.method_47$0dd78e0064(var71), var10);
               net.C_47Fw var74 = (net.C_47Fw)recovery$indy$flow$346(this, var24);
               long var75 = var16;
               boolean var77 = true;
               net.C_47uI.method_42$300c7fd546(var77, var75, var74);
         }

         client.render.RenderUtils.method_43$da8c82d5d4();
      }

      client.setting.BooleanSetting var78 = this.settingCritVisualizer;
      char var129 = ((char) (var78.method_49$aae029aa0a() ? 1 : 0));
      if (var23 == null) {
         if ((var129) != 0) {
            org.lwjgl.opengl.GL11.glEnable(32823);
            org.lwjgl.opengl.GL11.glPolygonOffset(1.0F, -1100000.0F);
            int var113 = 0;

            label135: {
               while (true) {
                  if (var113 < this.field_43k.size()) {
                     label130: {
                        label195: {
                           net.C_47ti var115 = (net.C_47ti)this.field_43k.get(var113);
                           short var147 = (short)var21;
                           char var152 = (char)var22;
                           int var79 = var113;
                           char var80 = var152;
                           short var81 = var147;
                           int var82 = var20;
                           client.setting.ColorSetting var83 = this.settingCritVisualizerColor;
                           int var117 = var83.method_47$24af287d8f(var82, var81, var80, var79);
                           double var130 = recovery$indy$flow$363(var115, 8142278838135728217L, var1);
                           long var84 = var6;
                           client.setting.NumberSetting var86 = this.settingDuration;
                           double var131 = var130 + var86.method_44$474dfaa627(var84);
                           if (var1 >= 0L) {
                              double var142 = System.currentTimeMillis();
                              if (var23 == null) {
                                 double var154;
                                 var129 = (char)((var154 = var131 - var142) == 0.0 ? 0 : (var154 < 0.0 ? -1 : 1));
                                 if (var23 != null) {
                                    break;
                                 }

                                 if (var129 < 0) {
                                    this.field_43k.remove(var115);
                                    var133 = var23;
                                    if (var1 < 0L) {
                                       break label130;
                                    }

                                    if (var23 == null) {
                                       break label195;
                                    }
                                 }

                                 var131 = ((net.C_47tf)recovery$indy$flow$370(var115, 8133953985120306314L, var1)).field_40;
                                 net.minecraft.client.Minecraft var87 = field_43;
                                 var142 = var87.method_45$17391f161a().method_41$fedcb3e4d3();
                              }

                              var131 -= var142;
                           }

                           label118: {
                              long var143;
                              label117: {
                                 double var119 = var131;
                                 net.minecraft.client.Minecraft var88 = field_43;
                                 double var30 = ((net.C_47tf)recovery$indy$flow$376(var115, 8133953985120306314L, var1)).field_41
                                    - var88.method_45$17391f161a().method_49$fedcb3e4d3();
                                 net.minecraft.client.Minecraft var89 = field_43;
                                 double var32 = ((net.C_47tf)recovery$indy$flow$382(var115, 8133953985120306314L, var1)).field_47
                                    - var89.method_45$17391f161a().method_45$fedcb3e4d3();
                                 net.minecraft.client.renderer.GlStateManager.method_426$da8c82d5d4();
                                 net.minecraft.client.renderer.GlStateManager.method_49$a59262c0f0(var119, var30, var32);
                                 net.minecraft.client.Minecraft var90 = field_43;
                                 net.C_47j9 var134 = var90.method_45$17391f161a();
                                 if (var1 > 0L) {
                                    net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b(-var134.field_433, 0.0F, 1.0F, 0.0F);
                                    var135 = net.minecraft.client.Minecraft.method_46$28f1e2a3f8();
                                    if (var23 == null) {
                                       var143 = 8133884791030134804L;
                                       var148 = var1;
                                       if (var1 <= 0L) {
                                          break label117;
                                       }

                                       net.minecraft.client.Minecraft var91 = var135;
                                       if (var91.field_44r.field_44S == 2) {
                                          var135 = field_43;
                                          var143 = 8134588292328834709L;
                                          var148 = var1;
                                          break label117;
                                       }

                                       var135 = field_43;
                                    }

                                    net.minecraft.client.Minecraft var92 = var135;
                                    var134 = var92.method_45$17391f161a();
                                 }

                                 var136 = var134.field_47;
                                 break label118;
                              }

                              var136 = -((net.C_47j9)recovery$indy$flow$400(var135, var143, var148)).field_47;
                           }

                           net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b(var136, 1.0F, 0.0F, 0.0F);
                           net.minecraft.client.renderer.GlStateManager.method_48$a59262c0f0(-0.02, -0.02, 0.02);
                           net.minecraft.client.renderer.GlStateManager.method_42$f633c984d8(true);
                           net.minecraft.client.renderer.GlStateManager.method_42m$da8c82d5d4();
                           net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                           net.minecraft.client.Minecraft var93 = field_43;
                           net.minecraft.client.gui.FontRenderer var137 = var93.field_42N;
                           String var144 = (String)recovery$indy$flow$414(var115, 8142334355505616307L, var1);
                           net.minecraft.client.Minecraft var94 = field_43;
                           var137.method_40$b593f01403(
                              var144,
                              -var94.field_42N.method_48$2f485d5ba3((String)recovery$indy$flow$418(var115, 8142334355505616307L, var1)) / 2.0F,
                              -4.0F,
                              var117
                           );
                           net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
                        }

                        var113++;
                        var133 = var23;
                     }

                     if (var133 == null) {
                        continue;
                     }
                  }

                  if (var1 <= 0L) {
                     break label135;
                  }

                  var129 = '耷';
                  break;
               }

               org.lwjgl.opengl.GL11.glDisable(var129);
            }

            org.lwjgl.opengl.GL11.glPolygonOffset(1.0F, 1100000.0F);
         }

         client.setting.BooleanSetting var95 = this.settingBestAimPoint;
         var129 = ((char) (var95.method_49$aae029aa0a() ? 1 : 0));
      }

      if ((var129) != 0) {
         net.minecraft.entity.EntityLivingBase var138 = var24;
         if (var23 == null) {
            if (var24 == null) {
               return;
            }

            client.render.RenderUtils.method_42$da8c82d5d4();
            var138 = var24;
         }

         byte var96 = 80;
         byte var97 = 100;
         long var98 = var18;
         float var100 = var3;
         net.minecraft.entity.EntityLivingBase var101 = var138;
         net.C_47tf var114 = net.C_47gg.method_41$933c1029e1(var101, var100, var98, var97, var96);
         net.minecraft.client.Minecraft var102 = field_43;
         double var145 = -var102.method_45$17391f161a().method_41$fedcb3e4d3();
         net.minecraft.client.Minecraft var103 = field_43;
         double var149 = -var103.method_45$17391f161a().method_49$fedcb3e4d3();
         net.minecraft.client.Minecraft var104 = field_43;
         net.C_47tf var116 = var114.method_47$a365857470(var145, var149, -var104.method_45$17391f161a().method_45$fedcb3e4d3());
         long var105 = var6;
         client.setting.NumberSetting var107 = this.settingBestAimPointSize;
         float var118 = (float)var107.method_44$474dfaa627(var105) / 10.0F;
         short var150 = (short)var21;
         char var153 = (char)var22;
         byte var108 = 0;
         char var109 = var153;
         short var110 = var150;
         int var111 = var20;
         client.setting.ColorSetting var112 = this.settingBestAimPointColor;
         int var120 = var112.method_47$24af287d8f(var111, var110, var109, var108);
         client.render.RenderUtils.method_43$d00df7729d(var120);
         client.render.RenderUtils.method_49$0bc3ff5d48(
            var116.field_40 - var118,
            var116.field_41 - var118,
            var116.field_47 - var118,
            var116.field_40 + var118,
            var116.field_41 + var118,
            var116.field_47 + var118
         );
         client.render.RenderUtils.method_43$da8c82d5d4();
      }
   }










   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$39(this, 32, var3, -7103196019059390467L, var1);
      recovery$indy$40(this, 1, var3, -7103196019059390467L, var1);
   }



   private boolean method_43z$aae029aa0a() {
      long var1 = a ^ 7679973167944L;
      long var3 = var1 ^ 66515030868471L;
      long var10002 = 4906289164350852428L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Box");
   }



   private boolean method_43C$aae029aa0a() {
      long var1 = a ^ 95732581005534L;
      long var3 = var1 ^ 120481963371105L;
      long var10002 = 3423006116367460058L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Sigma");
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_43Z$aae029aa0a() {
      long var1 = a ^ 114170566452362L;
      long var3 = var1 ^ 102619499836981L;
      long var10000 = 8344365365827610579L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8346512795153939086L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_43n$aae029aa0a() {
      long var1 = a ^ 24696973379641L;
      long var3 = var1 ^ 49429311150726L;
      long var10002 = -6960396194241915331L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Box");
   }



   private boolean method_43e$aae029aa0a() {
      long var1 = a ^ 78505621628916L;
      long var3 = var1 ^ 138418699613515L;
      long var10000 = 8120839672302937261L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 8118553730960931312L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_43A$aae029aa0a() {
      long var1 = a ^ 97010929738776L;
      long var10000 = 8313394199654639425L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 8313469291956374494L;
      BooleanSetting var4 = this.settingHitColor;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 8305069212752977939L;
         BooleanSetting var5 = this.settingHitColor;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   private boolean method_43M$aae029aa0a() {
      long var1 = a ^ 129701032783495L;
      long var3 = var1 ^ 87362875391032L;
      long var10002 = -5054772666992037757L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Sigma");
   }



   private boolean method_43t$aae029aa0a() {
      long var1 = a ^ 42821278951023L;
      long var3 = var1 ^ 31269606257872L;
      long var10000 = 3542192378543236406L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 3544759578178058347L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



    public TargetESP_47HX(long a0) {
        super((java.lang.String) ("TargetESP"),(java.lang.String) ("ZielAu\u00dfersinnlicheWahrnehmung"),(long) (((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 64457081581733L)),(java.awt.Color) (new java.awt.Color((int) (212),(int) (133),(int) (76))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.TargetESP_47HX.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 12516812979539L);
        long constructorKey4 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 73025350187395L);
        long constructorKey5 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 124431713927272L);
        long constructorKey6 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 36558983896092L);
        long constructorKey7 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 103404004454225L);
        long constructorKey8 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 105481236154584L);
        long constructorKey9 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 83266914069694L);
        long constructorKey10 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 51862825036955L);
        long constructorKey11 = ((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 113125773382457L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 116255092055057L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 116255092055057L) << 32) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 116255092055057L) << 48) >>> 48));
        int constructorPart15 = (int) ((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 105513874478370L) >>> 32));
        int constructorPart16 = (int) (((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 105513874478370L) << 32) >>> 40));
        int constructorPart17 = (int) (((((augustus.recovered.modules.render.TargetESP_47HX.a ^ a0) ^ 105513874478370L) << 56) >>> 56));
        java.lang.Object initialValue18 = recovery$indy$flow$507();
        client.setting.MultiSelectSetting initialized19 = new client.setting.MultiSelectSetting(this, "Modules", constructorKey3, (net.C_47OZ[]) (initialValue18));
        recovery$indy$flow$509(this, initialized19);
        java.lang.Object initialValue20 = recovery$indy$flow$511(3);
        ((java.lang.Object[]) initialValue20)[0] = "None";
        ((java.lang.Object[]) initialValue20)[1] = "Box";
        ((java.lang.Object[]) initialValue20)[2] = "Sigma";
        client.setting.ModeSetting initialized21 = new client.setting.ModeSetting(this, "Mode", constructorKey5, "Sigma", (java.lang.String[]) (initialValue20));
        recovery$indy$flow$513(this, initialized21);
        java.awt.Color initialized22 = new java.awt.Color(41, 146, 222);
        client.setting.ColorSetting initialized23 = new client.setting.ColorSetting(constructorKey10, this, "TargetEspColor", initialized22);
        java.lang.Object initialValue24 = recovery$indy$flow$518(this);
        java.lang.Object initialValue25 = initialValue24;
        long initialValue26 = constructorKey4;
        client.setting.ColorSetting initialValue27 = initialized23;
        java.lang.Object initialValue28 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue29 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue30 = recovery$indy$flow$521(initialValue28, initialValue26, initialValue29);
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue30))))));
        recovery$indy$flow$523(this, initialValue31);
        client.setting.BooleanSetting initialized32 = new client.setting.BooleanSetting(this, constructorKey9, "HitColor", true);
        java.lang.Object initialValue33 = recovery$indy$flow$526(this);
        java.lang.Object initialValue34 = initialValue33;
        long initialValue35 = constructorKey4;
        client.setting.BooleanSetting initialValue36 = initialized32;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue39 = recovery$indy$flow$529(initialValue37, initialValue35, initialValue38);
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue39))))));
        recovery$indy$flow$531(this, initialValue40);
        java.lang.Object initialValue41 = recovery$indy$flow$533();
        client.setting.ColorSetting initialized42 = new client.setting.ColorSetting(constructorKey10, this, "TargetEspHitColor", (java.awt.Color) (initialValue41));
        java.lang.Object initialValue43 = recovery$indy$flow$535(this);
        java.lang.Object initialValue44 = initialValue43;
        long initialValue45 = constructorKey4;
        client.setting.ColorSetting initialValue46 = initialized42;
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue48 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue49 = recovery$indy$flow$538(initialValue47, initialValue45, initialValue48);
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue49))))));
        recovery$indy$flow$540(this, initialValue50);
        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting(this, "LineWidth", 0.0D, constructorKey11, 0.0D, Double.longBitsToDouble(4622945017495814144L), 0);
        java.lang.Object initialValue52 = recovery$indy$flow$543(this);
        java.lang.Object initialValue53 = initialValue52;
        client.setting.NumberSetting initialValue54 = initialized51;
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue56 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue57 = recovery$indy$flow$546(initialValue55, initialValue56);
        recovery$indy$flow$547(this, initialValue57);
        client.setting.NumberSetting initialized58 = new client.setting.NumberSetting(this, "AdjustWidth", Double.longBitsToDouble(-4631501856787818086L), constructorKey11, Double.longBitsToDouble(-4616189618054758400L), 1.0D, 2);
        java.lang.Object initialValue59 = recovery$indy$flow$550(this);
        java.lang.Object initialValue60 = initialValue59;
        client.setting.NumberSetting initialValue61 = initialized58;
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue63 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue64 = recovery$indy$flow$553(initialValue62, initialValue63);
        recovery$indy$flow$554(this, initialValue64);
        client.setting.NumberSetting initialized65 = new client.setting.NumberSetting(this, "Height", Double.longBitsToDouble(4590429028186199163L), constructorKey11, 0.0D, Double.longBitsToDouble(4602678819172646912L), 2);
        java.lang.Object initialValue66 = recovery$indy$flow$557(this);
        java.lang.Object initialValue67 = initialValue66;
        client.setting.NumberSetting initialValue68 = initialized65;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue71 = recovery$indy$flow$560(initialValue69, initialValue70);
        recovery$indy$flow$561(this, initialValue71);
        client.setting.NumberSetting initialized72 = new client.setting.NumberSetting(this, "AdjustYPos", Double.longBitsToDouble(4594212051873190380L), constructorKey11, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue73 = recovery$indy$flow$564(this);
        java.lang.Object initialValue74 = initialValue73;
        client.setting.NumberSetting initialValue75 = initialized72;
        java.lang.Object initialValue76 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue78 = recovery$indy$flow$567(initialValue76, initialValue77);
        recovery$indy$flow$568(this, initialValue78);
        client.setting.NumberSetting initialized79 = new client.setting.NumberSetting(this, "Speed", 1.0D, constructorKey11, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue80 = recovery$indy$flow$571(this);
        java.lang.Object initialValue81 = initialValue80;
        client.setting.NumberSetting initialValue82 = initialized79;
        java.lang.Object initialValue83 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue84 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue81))))));
        java.lang.Object initialValue85 = recovery$indy$flow$574(initialValue83, initialValue84);
        recovery$indy$flow$575(this, initialValue85);
        client.setting.NumberSetting initialized86 = new client.setting.NumberSetting(this, "Length", 1.0D, constructorKey11, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue87 = recovery$indy$flow$578(this);
        java.lang.Object initialValue88 = initialValue87;
        client.setting.NumberSetting initialValue89 = initialized86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$581(initialValue90, initialValue91);
        recovery$indy$flow$582(this, initialValue92);
        client.setting.ShaderOptions initialized93 = new client.setting.ShaderOptions(this, constructorKey6);
        java.lang.Object initialValue94 = recovery$indy$flow$585();
        java.lang.Object initialValue95 = initialValue94;
        long initialValue96 = constructorKey7;
        client.setting.ShaderOptions initialValue97 = initialized93;
        java.lang.Object initialValue98 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue99 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue100 = recovery$indy$flow$588(initialValue98, initialValue96, initialValue99);
        java.lang.Object initialValue101 = recovery$indy$flow$589(this);
        java.lang.Object initialValue102 = initialValue101;
        long initialValue103 = constructorKey4;
        java.lang.Object initialValue104 = initialValue100;
        java.lang.Object initialValue105 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue104))))));
        java.lang.Object initialValue106 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue107 = recovery$indy$flow$592(initialValue105, initialValue103, initialValue106);
        java.lang.Object initialValue108 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue107))))));
        long initialValue109 = constructorKey8;
        java.lang.Object initialValue110 = initialValue108;
        java.lang.Object initialValue111 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue112 = recovery$indy$flow$595(initialValue111, initialValue109);
        recovery$indy$flow$596(this, initialValue112);
        client.setting.BooleanSetting initialized113 = new client.setting.BooleanSetting(this, constructorKey9, "CritVisualizer", true);
        recovery$indy$flow$599(this, initialized113);
        java.awt.Color initialized114 = new java.awt.Color(255, 164, 75);
        client.setting.ColorSetting initialized115 = new client.setting.ColorSetting(constructorKey10, this, "CritVisualizerColor", initialized114);
        byte converted116 = (byte) (constructorPart17);
        int initialValue117 = 1;
        int initialValue118 = (int) (converted116);
        int initialValue119 = constructorPart16;
        int initialValue120 = constructorPart15;
        client.setting.ColorSetting initialValue121 = initialized115;
        java.lang.Object initialValue122 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue121))))));
        java.lang.Object initialValue123 = recovery$indy$flow$605(initialValue122, initialValue120, initialValue119, (byte) (initialValue118), (initialValue117 != 0));
        char converted124 = (char) (constructorPart14);
        int initialValue125 = 50;
        int initialValue126 = (int) (converted124);
        int initialValue127 = constructorPart13;
        int initialValue128 = constructorPart12;
        java.lang.Object initialValue129 = initialValue123;
        java.lang.Object initialValue130 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue131 = recovery$indy$flow$607(initialValue130, initialValue128, initialValue127, (char) (initialValue126), initialValue125);
        java.lang.Object initialValue132 = ((java.lang.Object)(((augustus.recovered.modules.render.TargetESP_47HX) (((java.lang.Object)(this)))).settingCritVisualizer));
        java.lang.Object initialValue133 = recovery$indy$flow$609(initialValue132);
        java.lang.Object initialValue134 = recovery$indy$flow$610(initialValue132);
        java.lang.Object initialValue135 = initialValue134;
        long initialValue136 = constructorKey4;
        java.lang.Object initialValue137 = initialValue131;
        java.lang.Object initialValue138 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue137))))));
        java.lang.Object initialValue139 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue135))))));
        java.lang.Object initialValue140 = recovery$indy$flow$613(initialValue138, initialValue136, initialValue139);
        java.lang.Object initialValue141 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue140))))));
        recovery$indy$flow$615(this, initialValue141);
        client.setting.BooleanSetting initialized142 = new client.setting.BooleanSetting(this, constructorKey9, "BestAimPoint", false);
        recovery$indy$flow$618(this, initialized142);
        client.setting.NumberSetting initialized143 = new client.setting.NumberSetting(this, "BestAimPointSize", Double.longBitsToDouble(4599075939470750515L), constructorKey11, Double.longBitsToDouble(4576918229304087675L), 1.0D, 2);
        java.lang.Object initialValue144 = ((java.lang.Object)(((augustus.recovered.modules.render.TargetESP_47HX) (((java.lang.Object)(this)))).settingBestAimPoint));
        java.lang.Object initialValue145 = recovery$indy$flow$622(initialValue144);
        java.lang.Object initialValue146 = recovery$indy$flow$623(initialValue144);
        java.lang.Object initialValue147 = initialValue146;
        client.setting.NumberSetting initialValue148 = initialized143;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue151 = recovery$indy$flow$626(initialValue149, initialValue150);
        recovery$indy$flow$627(this, initialValue151);
        java.awt.Color initialized152 = new java.awt.Color(41, 146, 222);
        client.setting.ColorSetting initialized153 = new client.setting.ColorSetting(constructorKey10, this, "bestAimPointColor", initialized152);
        java.lang.Object initialValue154 = ((java.lang.Object)(((augustus.recovered.modules.render.TargetESP_47HX) (((java.lang.Object)(this)))).settingBestAimPoint));
        java.lang.Object initialValue155 = recovery$indy$flow$633(initialValue154);
        java.lang.Object initialValue156 = recovery$indy$flow$634(initialValue154);
        java.lang.Object initialValue157 = initialValue156;
        long initialValue158 = constructorKey4;
        client.setting.ColorSetting initialValue159 = initialized153;
        java.lang.Object initialValue160 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue159))))));
        java.lang.Object initialValue161 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue157))))));
        java.lang.Object initialValue162 = recovery$indy$flow$637(initialValue160, initialValue158, initialValue161);
        java.lang.Object initialValue163 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue162))))));
        recovery$indy$flow$639(this, initialValue163);
        client.setting.NumberSetting initialized164 = new client.setting.NumberSetting(this, "Duration", Double.longBitsToDouble(4652007308841189376L), constructorKey11, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4661014508095930368L), 0);
        java.lang.Object initialValue165 = ((java.lang.Object)(((augustus.recovered.modules.render.TargetESP_47HX) (((java.lang.Object)(this)))).settingCritVisualizer));
        java.lang.Object initialValue166 = recovery$indy$flow$643(initialValue165);
        java.lang.Object initialValue167 = recovery$indy$flow$644(initialValue165);
        java.lang.Object initialValue168 = initialValue167;
        client.setting.NumberSetting initialValue169 = initialized164;
        java.lang.Object initialValue170 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue171 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue168))))));
        java.lang.Object initialValue172 = recovery$indy$flow$647(initialValue170, initialValue171);
        recovery$indy$flow$648(this, initialValue172);
        java.util.concurrent.CopyOnWriteArrayList initialized173 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$651(this, initialized173);
        return;
    }








    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$60(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$63(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$66(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$72(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$75(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$87(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$88(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$336(java.lang.Object a0,int a1,java.lang.Object a2,float a3,float a4,float a5);
    private static native java.lang.Object recovery$indy$flow$346(java.lang.Object a0,java.lang.Object a1);
    private static native long recovery$indy$flow$363(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$370(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$376(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$382(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$400(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$414(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$418(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$507();
    private static native void recovery$indy$flow$509(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$511(int a0);
    private static native void recovery$indy$flow$513(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$518(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$521(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$523(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$526(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$529(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$531(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$533() {
        return java.awt.Color.red;
    }
    private static native java.lang.Object recovery$indy$flow$535(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$538(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$540(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$543(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$546(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$547(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$550(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$553(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$554(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$557(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$560(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$561(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$564(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$567(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$568(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$571(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$574(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$575(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$578(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$581(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$582(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$585() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$588(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$589(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$592(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$595(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$596(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$599(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$605(java.lang.Object a0,int a1,int a2,byte a3,boolean a4);

    private static native java.lang.Object recovery$indy$flow$607(java.lang.Object a0,int a1,int a2,char a3,int a4);

    private static java.lang.Object recovery$indy$flow$609(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$610(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$613(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$615(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$618(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$622(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$623(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$626(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$633(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$634(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$637(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$643(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$644(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$647(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$648(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$651(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$13(long var0, long var2);
   private static native boolean recovery$indy$14(Object var0, long var1, long var3);
   private static native C_477r recovery$indy$15(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$16(long var0, float var2, Object var3, double var4, double var6, long var8, long var10);
   private static native boolean recovery$indy$17(long var0, Object var2, long var3, long var5);
   private static native int[] recovery$indy$18(long var0, long var2);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native EntityLivingBase recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$28(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$29(Object var0, short var1, int var2, int var3, long var4, long var6);
   private static native void recovery$indy$39(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$55();
}
