package augustus.recovered.modules.render;
import com.mojang.authlib.GameProfile;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_40t;
import net.minecraft.client.renderer.texture.TextureManager;
import net.C_45K;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.C_47Fw;
import net.C_47Fx;
import net.C_47Fy;
import net.C_47ID;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import client.font.FontFace;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import net.C_47TT;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47WU;
import client.event.RenderListener;
import net.C_47Yl;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g5;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47nb;
import net.minecraft.util.ResourceLocation;
import client.ClientGlobals;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TargetHud_47HO extends client.module.Module implements client.event.RenderListener,net.C_47xz {
    private final client.setting.ModeSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingHealthMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBackGroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHealthBackGroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHealthColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingTextColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBackGroundColorNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHealthBackGroundColorNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHealthColorNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHeadDamageColorNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingTextColorNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingTrackEntity = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTrackY = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingXCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingToggleAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAnimationTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47nb field_46n = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47nb field_431 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_46C; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.client.entity.AbstractClientPlayer field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.client.entity.AbstractClientPlayer field_46G; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_462; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   private boolean method_49A$aae029aa0a() {
      long var1 = a ^ 67806024016304L;
      long var3 = var1 ^ 128722943250983L;
      long var10002 = 6323111494906488859L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



   private boolean method_49G$aae029aa0a() {
      long var1 = a ^ 122190578579271L;
      long var10000 = 85524941301590588L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 85293287133573194L;
      BooleanSetting var4 = this.settingTrackEntity;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49n$aae029aa0a() {
      long var1 = a ^ 122210779532500L;
      long var3 = var1 ^ 43566515437379L;
      long var10002 = -386070510775794305L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   private void method_46$5a4ce5251c(int var1, int var2, int var3, AbstractClientPlayer var4, boolean var5, RenderPass var6) {
      float var90;
      float var98;
      long var13;
      long var19;
      int var21;
      int var22;
      int var23;
      int[] var24;
      int var83;
      long var7 = a ^ 71420455768071L;
      long var9 = var7 ^ 95467200902880L;
      long var11 = var7 ^ 19890304916241L;
      var13 = var7 ^ 126208391746413L;
      long var15 = var7 ^ 64387497073863L;
      long var17 = var7 ^ 101792245908515L;
      var19 = var7 ^ 8034159626755L;
      long var10001 = var7 ^ 88933075391734L;
      var21 = (int)((var7 ^ 88933075391734L) >>> 32);
      var22 = (int)((var7 ^ 88933075391734L) << 32 >>> 48);
      var23 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6453667413071950468L;
      var24 = AntiStrike_47Qa.method_42$d4d28024c9();
      var83 = -var1;
      label94:
      if (var24 == null) {
         float var84 = var83;
         float var93 = -var2;
         float var10002 = var1;
         float var10003 = var2;
         ShaderOptions var10006 = this.field_42;
         long var10011 = -6451945473810467017L;
         long var30 = var17;
         int var32 = var3;
         RenderPass var33 = var6;
         int var10009 = C_47TX.method_40$6b468acafc(var33, var32, var30);
         long var10010 = -6454988816692287959L;
         int var34 = var10009;
         long var35 = var19;
         RenderPass var37 = var6;
         ShaderOptions var38 = var10006;
         RenderUtils.method_49$722989e45f(var84, var93, var10002, var10003, 20.0F, 1, var38.method_40$d68b376f5b(var37, var35, var34));
         if (var6 == RenderPass.NONE) {
            int var25 = var4.field_432;
            int var26 = 66 - var25;
            int var27 = -113 + var25 / 2;
            int var28 = -33 + var25 / 2;
            var10001 = -6452069682441039867L;
            C_47Fy.method_43$e45a9973e5(var15);
            long var85 = -6455795701180010877L;
            C_47Fy.method_49$da8c82d5d4();
            RenderUtils.method_41$85eee1abaa(var27, var28, var27 + var26, var28 + var26, 15.0F, 1, Color.white);
            var10001 = -6455734650550273405L;
            C_47Fy.method_46$d00df7729d(1);
            ResourceLocation var96 = var4.method_47$8d5288ab3b();
            long var10008 = -6452483990885602667L;
            int var39 = var26;
            long var40 = var11;
            int var42 = var28;
            int var43 = var27;
            boolean var44 = var5;
            AbstractClientPlayer var45 = var4;
            ResourceLocation var46 = var96;
            TargetHud_47HO var47 = this;
            var47.method_42$db57d89aef(var46, var45, var44, var43, var42, var40, var39);
            long var86 = -6452167195237213386L;
            C_47Fy.method_41$da8c82d5d4();
            var83 = var25;
            if (var24 != null) {
               break label94;
            }

            if (var25 > 0) {
               short var102 = (short)var22;
               char var105 = (char)var23;
               long var10005 = -6452269167535259957L;
               byte var48 = 0;
               char var49 = var105;
               short var50 = var102;
               int var51 = var21;
               ColorSetting var52 = this.settingHeadDamageColorNew;
               int var29 = var52.method_47$24af287d8f(var51, var50, var49, var48);
               float var87 = var27;
               float var97 = var28;
               var10002 = var27 + var26;
               var10003 = var28 + var26;
               int var10007 = 20 * var25;
               long var110 = -6455444836530347485L;
               RenderUtils.method_49$722989e45f(var87, var97, var10002, var10003, 15.0F, 1, C_47TX.method_45$75dd719903(var29, var10007, var9));
            }
         }

         var83 = 147;
      }

      int var79;
      label87: {
         var79 = var83;
         if (var6 == RenderPass.NONE) {
            float var80;
            label97: {
               label83: {
                  long var107 = -6451858861364935447L;
                  AbstractClientPlayer var53 = var4;
                  ModeSetting var54 = this.settingHealthMode;
                  long var55 = var13;
                  var80 = C_47TT.method_43$5b8fd0f5d2(var55, var54, var53);
                  TargetHud_47HO var88 = this;
                  if (var24 == null) {
                     if (Integer.signum(this.field_43y) != -1) {
                        var83 = this.field_43y;
                        if (var24 != null) {
                           break label97;
                        }

                        if (this.field_43y == var4.method_49$8abf5c6871()) {
                           break label83;
                        }
                     }

                     this.field_49 = var80;
                     var88 = this;
                  }

                  var88.field_46C = var80;
               }

               var90 = this.field_49;
               var98 = var80;
               if (var24 != null) {
                  break label87;
               }

               float var120;
               var83 = (var120 = this.field_49 - var80) == 0.0F ? 0 : (var120 < 0.0F ? -1 : 1);
            }

            if (var83 != 0) {
               this.field_46C = this.field_49;
               this.field_49 = var80;
               this.field_431.method_44$7c39c8007b(400, C_45K.easeOutCubic, 1, false);
            }
         }

         var90 = this.field_49;
         var98 = var4.method_40$bc607678b6();
      }

      float var81 = var90 / var98;
      RenderPass var91 = var6;
      RenderPass var99 = RenderPass.NONE;
      if (var24 == null) {
         if (var6 == RenderPass.NONE) {
            float var82 = this.field_46C / var4.method_40$bc607678b6();
            this.field_431.method_48$f2b6a9055b(var79 * var82, 0.0F, var79 * var81, 0.0F);
         }

         var91 = var6;
         var99 = RenderPass.BLUR;
      }

      if (var91 != var99 && var79 * var81 > -40.0F) {
         var10001 = -6451827594579661245L;
         Minecraft var57 = field_43;
         C_47WU serverData = var57.method_45$88b98ad4b7();
         // Singleplayer has no ServerData. It still needs the same health bar.
         if (serverData == null || !serverData.field_48.contains("gommehd.net")) {
            ShaderOptions var108 = this.field_42;
            short var113 = (short)var22;
            char var117 = (char)var23;
            long var10013 = -6452269167535259957L;
            byte var59 = 0;
            char var60 = var117;
            short var61 = var113;
            int var62 = var21;
            ColorSetting var63 = this.settingHealthBackGroundColorNew;
            int var111 = var63.method_47$24af287d8f(var62, var61, var60, var59);
            long var114 = -6454988816692287959L;
            int var64 = var111;
            long var65 = var19;
            RenderPass var67 = var6;
            ShaderOptions var68 = var108;
            RenderUtils.method_49$722989e45f(-37.0F, 0.0F, 110.0F, 20.0F, 8.0F, 1, var68.method_40$d68b376f5b(var67, var65, var64));
            float var104 = C_47sk.method_46$ef9a6720f7(-37.0F + this.field_431.method_46$bc607678b6(), -37.0F, 110.0F);
            var108 = this.field_42;
            var113 = (short)var22;
            var117 = (char)var23;
            var10013 = -6452269167535259957L;
            byte var69 = 0;
            char var70 = var117;
            short var71 = var113;
            int var72 = var21;
            ColorSetting var73 = this.settingHealthColorNew;
            var111 = var73.method_47$24af287d8f(var72, var71, var70, var69);
            long var116 = -6454988816692287959L;
            int var74 = var111;
            long var75 = var19;
            RenderPass var77 = var6;
            ShaderOptions var78 = var108;
            RenderUtils.method_49$722989e45f(-37.0F, 0.0F, var104, 20.0F, 8.0F, 1, var78.method_40$d68b376f5b(var77, var75, var74));
         }
      }
   }







    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

   private void method_42$db57d89aef(ResourceLocation var1, AbstractClientPlayer var2, boolean var3, int var4, int var5, long var6, int var8) {
      var6 = a ^ var6;
      int[] var10000 = recovery$indy$1(5412686507871821838L, var6);
      recovery$indy$2(field_43, 5411132797560443132L, var6).method_44$fbbbe3c71b(var1);
      int[] var9 = var10000;
      byte var10001 = (byte) ((var3) ? 1 : 0);
      if (var9 == null) {
         var10001 = (byte)((var3 ? 1 : 0) != 0 ? 8 : 0);
      }

      int var10 = 8 + var10001;
      var10001 = (byte) ((var3) ? 1 : 0);
      if (var9 == null) {
         var10001 = (byte)((var3 ? 1 : 0) != 0 ? -1 : 1);
      }

      int var11 = 8 * var10001;
      C_47g5.method_48$2306008c16(var4, var5, 8.0F, var10, 8, var11, var8, var8, 64.0F, 64.0F);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_49g$aae029aa0a() {
      long var1 = a ^ 87253773413497L;
      long var3 = var1 ^ 8670173487086L;
      long var10002 = -7347263701469764142L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      augustus.recovered.modules.render.TargetHud_47HO var45;
      augustus.recovered.modules.render.TargetHud_47HO var47;
      net.minecraft.client.entity.AbstractClientPlayer var50;
      long var6;
      long var8;
      long var10;
      long var12;
      long var14;
      int[] var16;
      AbstractClientPlayer var42;
      label142: {
         var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
         var8 = var6 ^ 36252403172272L;
         var10 = var6 ^ 79469613767391L;
         var12 = var6 ^ 127696898216785L;
         var14 = var6 ^ 116404737761845L;
         long var10000 = 1634397374271372733L;
         var16 = AntiStrike_47Qa.method_42$d4d28024c9();
         boolean var40 = ClientGlobals.field_48.field_48Q.field_45z instanceof AbstractClientPlayer;
         if (var16 == null) {
            if (var40) {
               var42 = (AbstractClientPlayer)ClientGlobals.field_48.field_48Q.field_45z;
               break label142;
            }

            var40 = ClientGlobals.field_48.field_46e.field_43c instanceof AbstractClientPlayer;
         }

         label143: {
            if (var16 == null) {
               if (var40) {
                  var42 = (AbstractClientPlayer)ClientGlobals.field_48.field_46e.field_43c;
                  break label142;
               }

               var42 = ((net.minecraft.client.entity.AbstractClientPlayer) (ClientGlobals.field_48.field_462.field_456));
               if (var16 != null) {
                  break label143;
               }

               var40 = ClientGlobals.field_48.field_462.field_456 instanceof AbstractClientPlayer;
            }

            if (!var40) {
               var42 = null;
               break label142;
            }

            var42 = ((net.minecraft.client.entity.AbstractClientPlayer) (ClientGlobals.field_48.field_462.field_456));
         }

         var42 = var42;
      }

      AbstractClientPlayer var17 = (AbstractClientPlayer) recovery.custom.TargetHudRepair.resolve(var42);
      var42 = var17;
      if (var16 == null) {
         if (var17 != this.field_46G) {
            C_47nb var44 = this.field_46n;
            long var10003 = 1634257448248735052L;
            long var18 = var10;
            NumberSetting var20 = this.settingAnimationTime;
            int var10001 = (int)var20.method_44$474dfaa627(var18);
            long var10004 = 1636554158684793197L;
            long var21 = var12;
            ModeSetting var23 = this.settingToggleAnimation;
            var44.method_44$7c39c8007b(var10001, C_47nb.method_41$7498260812(var23.method_46$5f9dc63072(var21)), var17 != null ? 1 : 0, true);
         }

         var42 = var17;
      }

      if (var42 != null) {
         this.field_40 = var17;
      }

      label119: {
         label145: {
            var45 = this;
            int[] var48 = var16;
            if (var4 >= 0) {
               if (var16 == null) {
                  long var49 = 1634338760053450699L;
                  BooleanSetting var24 = this.settingTrackEntity;
                  if (var24.method_49$aae029aa0a()) {
                     var45 = this;
                     if (var16 != null) {
                        break label119;
                     }

                     if (!(this.field_462.field_47 >= 0.0)) {
                        break label145;
                     }

                     var45 = this;
                     if (var16 != null) {
                        break label119;
                     }

                     if (!(this.field_462.field_47 <= 1.0)) {
                        break label145;
                     }
                  }

                  var45 = this;
               }

               var48 = var16;
            }

            if (var48 != null) {
               break label119;
            }

            if (var45.field_40 != null) {
               label103: {
                  label102: {
                     TargetHud_47HO var46 = this;
                     if (var16 == null) {
                        long var10002 = 1636554158684793197L;
                        long var25 = var12;
                        ModeSetting var27 = this.settingModes;
                        if (var27.method_46$5f9dc63072(var25).equals(recovery$indy$3(10658, 3355414536500427118L ^ var6))) {
                           var47 = this;
                           var50 = this.field_40;
                           if (var1 <= 0) {
                              break label103;
                           }

                           long var10005 = 1636643657777643982L;
                           long var28 = var14;
                           ScaledResolution var30 = var5;
                           AbstractClientPlayer var31 = var17;
                           AbstractClientPlayer var32 = this.field_40;
                           TargetHud_47HO var33 = this;
                           var33.method_43$9f8a7ef02f(var32, var31, var30, var28);
                           if (var16 == null) {
                              break label102;
                           }
                        }

                        var46 = this;
                     }

                     long var51 = 1633288362059741947L;
                     ScaledResolution var34 = var5;
                     AbstractClientPlayer var35 = var17;
                     AbstractClientPlayer var36 = this.field_40;
                     long var37 = var8;
                     TargetHud_47HO var39 = var46;
                     var39.method_49$b27f2b68ca(var37, var36, var35, var34);
                  }

                  var47 = this;
                  var50 = this.field_40;
               }

               var47.field_43y = var50.method_49$8abf5c6871();
            }
         }

         var45 = this;
      }

      var45.field_46G = var17;
      RenderUtils.method_41$da8c82d5d4();
   }





   private void method_48$b2bbaa7a62(int var1, net.C_47Yl var2, net.minecraft.client.entity.AbstractClientPlayer var3, boolean var4, client.render.RenderPass var5) {
      long var6 = a ^ 50476095329267L;
      long var8 = var6 ^ 139688137529573L;
      long var10 = var6 ^ 35002121556121L;
      long var12 = var6 ^ 96292608548659L;
      long var14 = var6 ^ 54464043452375L;
      long var16 = var6 ^ 116901064018423L;
      long var10001 = var6 ^ 68165006530306L;
      int var18 = (int)((var6 ^ 68165006530306L) >>> 32);
      int var19 = (int)((var6 ^ 68165006530306L) << 32 >>> 48);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6513442342638514552L;
      int[] var21 = AntiStrike_47Qa.method_42$d4d28024c9();
      client.setting.ShaderOptions var10006 = this.field_42;
      long var10011 = -6520516431773666109L;
      long var27 = var14;
      int var29 = var1;
      client.render.RenderPass var30 = var5;
      int var10009 = net.C_47TX.method_40$6b468acafc(var30, var29, var27);
      long var10010 = -6512441715072047651L;
      int var31 = var10009;
      long var32 = var16;
      client.render.RenderPass var34 = var5;
      client.setting.ShaderOptions var35 = var10006;
      client.render.RenderUtils.method_49$722989e45f(-156.0F, -56.0F, 156.0F, 56.0F, 10.0F, 1, var35.method_40$d68b376f5b(var34, var32, var31));
      net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
      if (var21 != null) {
         var10000 = -6520894491788109630L;
         net.C_47Fy.method_41$da8c82d5d4();
         byte var77 = 2;
         org.lwjgl.opengl.GL11.glPopMatrix();
         short var78 = 190;
         boolean var79 = false;
         float var93;
         float var102;
         if (var5 == client.render.RenderPass.NONE) {
            long var105 = -6520638795522701539L;
            net.minecraft.client.entity.AbstractClientPlayer var85 = var3;
            client.setting.ModeSetting var86 = this.settingHealthMode;
            long var87 = var10;
            float var81 = net.C_47TT.method_43$5b8fd0f5d2(var87, var86, var85);
            this.field_46C = var81;
            var93 = this.field_49;
            var102 = var81;
         } else {
            var93 = this.field_49;
            var102 = var3.method_40$bc607678b6();
         }

         float var82 = var93 / var102;
         if (var5 != client.render.RenderPass.NONE) {
            float var119;
            int var84 = (var119 = var78 * var82 - -150.0F) == 0.0F ? 0 : (var119 < 0.0F ? -1 : 1);
            org.lwjgl.opengl.GL11.glPushMatrix();
            org.lwjgl.opengl.GL11.glScaled(var77, var77, 1.0);
            net.minecraft.client.renderer.GlStateManager.method_426$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_42R$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_44$42cf812248(770, 771, 1, 0);
            net.C_47Fx.method_41$da8c82d5d4();
            client.render.RenderUtils.method_46$1b188dfb07(var3.method_47$8da6669f6b(3), 0, var84 - 1, false);
            net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
            org.lwjgl.opengl.GL11.glPopMatrix();
         }

         var10000 = -6513349154966347269L;
         net.C_47uI.method_45$da8c82d5d4();
      } else {
         if (var5 == client.render.RenderPass.NONE) {
            var10001 = -6520708880344361999L;
            net.C_47Fy.method_43$e45a9973e5(var12);
            var10000 = -6513325329712026249L;
            net.C_47Fy.method_49$da8c82d5d4();
            client.render.RenderUtils.method_41$85eee1abaa(50.0F, -50.0F, 150.0F, 50.0F, 8.0F, 1, java.awt.Color.white);
            var10001 = -6513064232029046409L;
            net.C_47Fy.method_46$d00df7729d(1);
            net.minecraft.util.ResourceLocation var97 = var2.method_42$8d5288ab3b();
            long var10008 = -6521134317463115423L;
            byte var36 = 100;
            long var37 = var8;
            byte var39 = -50;
            byte var40 = 50;
            boolean var41 = var4;
            net.minecraft.client.entity.AbstractClientPlayer var42 = var3;
            net.minecraft.util.ResourceLocation var43 = var97;
            TargetHud_47HO var44 = this;
            var44.method_42$db57d89aef(var43, var42, var41, var40, var39, var37, var36);
            var10000 = -6520894491788109630L;
            net.C_47Fy.method_41$da8c82d5d4();
         }

         byte var22 = 2;
         if (var5 == client.render.RenderPass.NONE) {
            org.lwjgl.opengl.GL11.glPushMatrix();
            org.lwjgl.opengl.GL11.glScaled(var22, var22, 1.0);
            var10001 = -6512253150487919494L;
            net.minecraft.client.Minecraft var45 = field_43;
            net.minecraft.client.gui.FontRenderer var90 = var45.field_42N;
            String var99 = var3.method_41$cd99b948a0().getName();
            int var10002 = -145 / var22;
            int var10003 = -45 / var22;
            short var106 = (short)var19;
            char var10007 = (char)var20;
            long var109 = -6521068791101326017L;
            byte var46 = 0;
            char var47 = var10007;
            short var48 = var106;
            int var49 = var18;
            client.setting.ColorSetting var50 = this.settingTextColor;
            var90.method_43$7961e3f788(var99, var10002, var10003, var50.method_47$24af287d8f(var49, var48, var47, var46));
            org.lwjgl.opengl.GL11.glPopMatrix();
         }

         short var23 = 190;
         byte var24 = 0;
         if (var5 == client.render.RenderPass.NONE) {
            long var104 = -6520638795522701539L;
            net.minecraft.client.entity.AbstractClientPlayer var51 = var3;
            client.setting.ModeSetting var52 = this.settingHealthMode;
            long var53 = var10;
            float var25 = net.C_47TT.method_43$5b8fd0f5d2(var53, var52, var51);
            if (Integer.signum(this.field_43y) == -1 || this.field_43y != var3.method_49$8abf5c6871()) {
               this.field_49 = var25;
               this.field_46C = var25;
            }

            if (this.field_49 != var25) {
               this.field_46C = this.field_49;
               this.field_49 = var25;
               this.field_431.method_44$7c39c8007b(400, net.C_45K.easeOutCubic, 1, false);
            }
         }

         float var80 = this.field_49 / var3.method_40$bc607678b6();
         if (var5 == client.render.RenderPass.NONE) {
            float var26 = this.field_46C / var3.method_40$bc607678b6();
            this.field_431.method_48$f2b6a9055b(var23 * var26, 0.0F, var23 * var80, 0.0F);
         }

         if (var5 != client.render.RenderPass.BLUR) {
            if (var23 * var80 > -150.0F) {
               var10001 = -6520387760554365513L;
               net.minecraft.client.Minecraft var55 = field_43;
               if (var55.method_45$88b98ad4b7() != null) {
                  var10001 = -6520387760554365513L;
                  net.minecraft.client.Minecraft var56 = field_43;
                  if (!var56.method_45$88b98ad4b7().field_48.contains("gommehd.net")) {
                     var10006 = this.field_42;
                     short var112 = (short)var19;
                     char var116 = (char)var20;
                     long var10013 = -6521068791101326017L;
                     byte var57 = 0;
                     char var58 = var116;
                     short var59 = var112;
                     int var60 = var18;
                     client.setting.ColorSetting var61 = this.settingHealthBackGroundColor;
                     var10009 = var61.method_47$24af287d8f(var60, var59, var58, var57);
                     var10010 = -6512441715072047651L;
                     int var62 = var10009;
                     long var63 = var16;
                     client.render.RenderPass var65 = var5;
                     client.setting.ShaderOptions var66 = var10006;
                     client.render.RenderUtils.method_49$722989e45f(-150.0F, -17.0F, 40.0F, 3.0F, 3.0F, 1, var66.method_40$d68b376f5b(var65, var63, var62));
                     float var103 = net.C_47sk.method_46$ef9a6720f7(-150.0F + this.field_431.method_46$bc607678b6(), -150.0F, 40.0F);
                     var10006 = this.field_42;
                     short var114 = (short)var19;
                     char var117 = (char)var20;
                     var10013 = -6521068791101326017L;
                     byte var67 = 0;
                     char var68 = var117;
                     short var69 = var114;
                     int var70 = var18;
                     client.setting.ColorSetting var71 = this.settingHealthColor;
                     var10009 = var71.method_47$24af287d8f(var70, var69, var68, var67);
                     var10010 = -6512441715072047651L;
                     int var72 = var10009;
                     long var73 = var16;
                     client.render.RenderPass var75 = var5;
                     client.setting.ShaderOptions var76 = var10006;
                     client.render.RenderUtils.method_49$722989e45f(-150.0F, -17.0F, var103, 3.0F, 3.0F, 1, var76.method_40$d68b376f5b(var75, var73, var72));
                     var24 += 10;
                  }
               }
            }

            int var83 = -2 + var24;
            org.lwjgl.opengl.GL11.glPushMatrix();
            org.lwjgl.opengl.GL11.glScaled(var22, var22, 1.0);
            net.minecraft.client.renderer.GlStateManager.method_426$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_42R$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
            net.minecraft.client.renderer.GlStateManager.method_44$42cf812248(770, 771, 1, 0);
            net.C_47Fx.method_41$da8c82d5d4();
            if (var3.method_47$8da6669f6b(3) != null) {
               client.render.RenderUtils.method_46$1b188dfb07(var3.method_47$8da6669f6b(3), -77, var83, false);
            }

            if (var3.method_47$8da6669f6b(2) != null) {
               client.render.RenderUtils.method_46$1b188dfb07(var3.method_47$8da6669f6b(2), -59, var83, false);
            }

            if (var3.method_47$8da6669f6b(1) != null) {
               client.render.RenderUtils.method_46$1b188dfb07(var3.method_47$8da6669f6b(1), -41, var83, false);
            }

            if (var3.method_47$8da6669f6b(0) != null) {
               client.render.RenderUtils.method_46$1b188dfb07(var3.method_47$8da6669f6b(0), -23, var83, false);
            }

            if (var3.method_48$ac4db64966() != null) {
               client.render.RenderUtils.method_46$1b188dfb07(var3.method_48$ac4db64966(), 0, var83 - 1, false);
            }

            net.minecraft.client.renderer.GlStateManager.method_42O$da8c82d5d4();
            org.lwjgl.opengl.GL11.glPopMatrix();
         }

         var10000 = -6513349154966347269L;
         net.C_47uI.method_45$da8c82d5d4();
      }
   }








   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 65092955365123L;
      long var3 = var1 ^ 127037998918804L;
      long var10000 = -6238738475289738632L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -6236584985183791448L;
      long var6 = var3;
      ModeSetting var8 = this.settingToggleAnimation;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_49$b27f2b68ca(long var1, AbstractClientPlayer var3, AbstractClientPlayer var4, ScaledResolution var5) {
      net.minecraft.client.entity.AbstractClientPlayer var80;
      boolean var81;
      int var88;
      int var89;
      var1 = a ^ var1;
      long var6 = var1 ^ 74818534428743L;
      long var8 = var1 ^ 57949852643084L;
      long var10 = var1 ^ 4425612948079L;
      long var12 = var1 ^ 52126475453885L;
      long var14 = var1 ^ 23216871460712L;
      long var16 = var1 ^ 62518009369861L;
      long var18 = var1 ^ 79395466335630L;
      long var10001 = var1 ^ 88505387930084L;
      int var20 = (int)((var1 ^ 88505387930084L) >>> 32);
      int var21 = (int)((var1 ^ 88505387930084L) << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var10000 = -2054214057313023890L;
      int[] var23 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var3 != null) {
         label112: {
            if (this.field_46n.method_48$fedcb3e4d3() == 1.0) {
               var80 = var4;
               if (var23 != null) {
                  break label112;
               }

               if (var4 == null) {
                  return;
               }
            }

            var80 = var3;
         }

         label103: {
            label102: {
               label117: {
                  GameProfile var24 = var80.method_41$cd99b948a0();
                  var81 = var3.method_41$a160e896d5(C_47ID.CAPE);
                  int[] var86 = var23;
                  if (var1 >= 0L) {
                     if (var23 == null) {
                        if (!var81) {
                           break label117;
                        }

                        var81 = var24.getName().equals("Dinnerbone");
                     }

                     var86 = var23;
                  }

                  if (var86 != null) {
                     break label103;
                  }

                  if (var81) {
                     break label102;
                  }

                  var81 = var24.getName().equals("Grumm");
                  if (var23 != null) {
                     break label103;
                  }

                  if (var81) {
                     break label102;
                  }
               }

               var81 = false;
               break label103;
            }

            var81 = true;
         }

         boolean var25 = var81;
         var10001 = -2061267975771192665L;
         Minecraft var35 = field_43;
         C_47Yl var26 = var35.method_40$f8db5d9e73().method_46$f2f51c3dae(var3.method_46$48a3a9a042());
         if (var23 == null) {
            if (var26 == null) {
               return;
            }

            GL11.glPushMatrix();
            GL11.glScaled(1.0 / var5.method_40$8abf5c6871(), 1.0 / var5.method_40$8abf5c6871(), 1.0);
         }

         byte var27;
         byte var28;
         double var95;
         label83: {
            var27 = 120;
            var28 = 40;
            long var10002 = -2060832903052266579L;
            Minecraft var36 = field_43;
            var88 = var36.method_45$1bff846bdc().field_44 - var27 * 2;
            TargetHud_47HO var93 = this;
            if (var23 == null) {
               long var10003 = -2054439112783719912L;
               BooleanSetting var37 = this.settingTrackEntity;
               if (var37.method_49$aae029aa0a()) {
                  var95 = this.field_462.field_40 / var5.method_46$8abf5c6871();
                  break label83;
               }

               var93 = this;
            }

            long var10004 = -2054362091701272417L;
            long var38 = var8;
            NumberSetting var40 = var93.settingXCoord;
            var95 = var40.method_44$474dfaa627(var38) / 100.0;
         }

         int var29;
         label77: {
            var29 = var27 + (int)(var88 * var95);
            long var96 = -2060832903052266579L;
            Minecraft var41 = field_43;
            var89 = var41.method_45$1bff846bdc().field_42 - var28 * 2;
            TargetHud_47HO var97 = this;
            if (var23 == null) {
               long var104 = -2054439112783719912L;
               BooleanSetting var42 = this.settingTrackEntity;
               if (var42.method_49$aae029aa0a()) {
                  var95 = this.field_462.field_41 / var5.method_48$8abf5c6871();
                  break label77;
               }

               var97 = this;
            }

            long var110 = -2054362091701272417L;
            long var43 = var8;
            NumberSetting var45 = var97.settingYCoord;
            var95 = var45.method_44$474dfaa627(var43) / 100.0;
         }

         int var30 = var28 + (int)(var89 * var95);
         GL11.glTranslatef(var29, var30, 0.0F);
         double var31 = this.field_46n.method_45$fedcb3e4d3();
         double var113;
         int var82 = (var113 = this.field_46n.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var113 < 0.0 ? -1 : 1);
         if (var23 == null) {
            if (var82 < 0) {
               GL11.glScaled(var31, var31, 1.0);
            }

            short var100 = (short)var21;
            char var105 = (char)var22;
            long var10005 = -2060695913098003495L;
            byte var46 = 0;
            char var47 = var105;
            short var48 = var100;
            int var49 = var20;
            ColorSetting var50 = this.settingBackGroundColorNew;
            var82 = var50.method_47$24af287d8f(var49, var48, var47, var46);
         }

         int var33 = var82;
         long var101 = -2054814391160044159L;
         long var51 = var6;
         ShaderOptions var53 = this.field_42;
         boolean var83 = var53.method_49$0dd78e0064(var51);
         long var106 = -2060644318296372428L;
         long var54 = var12;
         ShaderOptions var56 = this.field_42;
         boolean var90 = var56.method_47$0dd78e0064(var54);
         var106 = -2055294282639754430L;
         C_47uI.method_40$9bd74f13d3(var83, var90, var10);
         C_47Fw var102 = recovery$indy$4(this, var27, var28, var33, var3, var25);
         var106 = -2061210086254040360L;
         C_47Fw var57 = var102;
         long var58 = var18;
         boolean var60 = true;
         C_47uI.method_42$300c7fd546(var60, var58, var57);
         FontFace var84 = C_40t.field_47;
         String var91 = var3.method_41$cd99b948a0().getName();
         var106 = -2054995703492786496L;
         long var61 = var14;
         String var63 = var91;
         FontFace var64 = var84;
         int var34 = (int)var64.method_40$4795379639(var63, var61);
         FontFace var85 = C_40t.field_47;
         String var92 = var3.method_41$cd99b948a0().getName();
         var95 = (int)(33.0F + -var34 / 2.0F);
         short var10006 = (short)var21;
         char var10007 = (char)var22;
         long var10009 = -2060695913098003495L;
         byte var65 = 0;
         char var66 = var10007;
         short var67 = var10006;
         int var68 = var20;
         ColorSetting var69 = this.settingTextColorNew;
         int var111 = var69.method_47$24af287d8f(var68, var67, var66, var65);
         long var112 = -2054519673726379347L;
         int var70 = var111;
         long var71 = var16;
         double var73 = -25.0;
         double var75 = var95;
         String var77 = var92;
         FontFace var78 = var85;
         var78.method_43$86fcc28337(var77, var75, var73, var71, var70);
         GL11.glPopMatrix();
      }
   }






   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 67403612186756L;
      long var3 = var1 ^ 129692257180435L;
      long var10002 = -6992906589779599057L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 57482311646357L;
      long var6 = var1 ^ 74191671779935L;
      int[] var8 = recovery$indy$5(8134899239292230647L, var1);
      TargetHud_47HO var10000 = this;
      if (var8 == null) {
         if (!recovery$indy$6(this.settingTrackEntity, 8134673488024568193L, var1)) {
            return;
         }

         var10000 = this;
      }

      int[] var10001 = var8;
      if (var1 >= 0L) {
         if (var8 == null) {
            if (var10000.field_40 == null) {
               return;
            }

            var10000 = this;
         }

         var10001 = var8;
      }

      label35: {
         if (var10001 == null) {
            if (var10000.field_46n.method_48$fedcb3e4d3() != 1.0) {
               break label35;
            }

            var10000 = this;
         }

         if (var10000.field_46G == null) {
            return;
         }
      }

      C_47tf var9 = new C_47tf(
         this.field_40.field_48u
            + (this.field_40.field_48Q - this.field_40.field_48u) * recovery$indy$7(field_43, 8133810536555825375L, var1).field_49
            - recovery$indy$8(field_43, 8134194173278282044L, var1).method_41$fedcb3e4d3(),
         this.field_40.field_48O
            + (this.field_40.field_48j - this.field_40.field_48O) * recovery$indy$9(field_43, 8133810536555825375L, var1).field_49
            - recovery$indy$10(field_43, 8134194173278282044L, var1).method_49$fedcb3e4d3(),
         this.field_40.field_48l
            + (this.field_40.field_42o - this.field_40.field_48l) * recovery$indy$11(field_43, 8133810536555825375L, var1).field_49
            - recovery$indy$12(field_43, 8134194173278282044L, var1).method_45$fedcb3e4d3()
      );
      this.field_462 = recovery$indy$14(
         var9.field_40,
         var9.field_41 + this.field_40.field_48 / 2.0F + recovery$indy$13(this.settingTrackY, var4, 8134750508049732358L, var1),
         var9.field_47,
         var6,
         new ScaledResolution(field_43),
         8134578909617493678L,
         var1
      );
   }




   public void method_43$9f8a7ef02f(AbstractClientPlayer var1, AbstractClientPlayer var2, ScaledResolution var3, long var4) {
      net.minecraft.client.entity.AbstractClientPlayer var61;
      boolean var62;
      int var68;
      int var69;
      var4 = a ^ var4;
      long var6 = var4 ^ 14474857460162L;
      long var8 = var4 ^ 138069189054089L;
      long var10 = var4 ^ 84801302303722L;
      long var12 = var4 ^ 112487753835576L;
      long var14 = var4 ^ 1183498843147L;
      long var10001 = var4 ^ 27869919260769L;
      int var16 = (int)((var4 ^ 27869919260769L) >>> 32);
      int var17 = (int)((var4 ^ 27869919260769L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var10000 = -9009242057525941781L;
      int[] var19 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var1 != null) {
         label112: {
            if (this.field_46n.method_48$fedcb3e4d3() == 1.0) {
               var61 = var2;
               if (var19 != null) {
                  break label112;
               }

               if (var2 == null) {
                  return;
               }
            }

            var61 = var1;
         }

         label103: {
            label102: {
               label117: {
                  GameProfile var20 = var61.method_41$cd99b948a0();
                  var62 = var1.method_41$a160e896d5(C_47ID.CAPE);
                  int[] var66 = var19;
                  if (var4 > 0L) {
                     if (var19 == null) {
                        if (!var62) {
                           break label117;
                        }

                        var62 = var20.getName().equals("Dinnerbone");
                     }

                     var66 = var19;
                  }

                  if (var66 != null) {
                     break label103;
                  }

                  if (var62) {
                     break label102;
                  }

                  var62 = var20.getName().equals("Grumm");
                  if (var19 != null) {
                     break label103;
                  }

                  if (var62) {
                     break label102;
                  }
               }

               var62 = false;
               break label103;
            }

            var62 = true;
         }

         boolean var21 = var62;
         var10001 = -9015733027102039262L;
         Minecraft var28 = field_43;
         C_47Yl var22 = var28.method_40$f8db5d9e73().method_46$f2f51c3dae(var1.method_46$48a3a9a042());
         if (var19 == null) {
            if (var22 == null) {
               return;
            }

            GL11.glPushMatrix();
            GL11.glScaled(1.0 / var3.method_40$8abf5c6871(), 1.0 / var3.method_40$8abf5c6871(), 1.0);
         }

         double var73;
         label83: {
            long var10002 = -9015297971696725464L;
            Minecraft var29 = field_43;
            var68 = var29.method_45$1bff846bdc().field_44 - 312;
            TargetHud_47HO var71 = this;
            if (var19 == null) {
               long var10003 = -9009341493272513635L;
               BooleanSetting var30 = this.settingTrackEntity;
               if (var30.method_49$aae029aa0a()) {
                  var73 = this.field_462.field_40 / var3.method_46$8abf5c6871();
                  break label83;
               }

               var71 = this;
            }

            long var10004 = -9009387652909604582L;
            long var31 = var8;
            NumberSetting var33 = var71.settingXCoord;
            var73 = var33.method_44$474dfaa627(var31) / 100.0;
         }

         int var23;
         label77: {
            var23 = 156 + (int)(var68 * var73);
            long var74 = -9015297971696725464L;
            Minecraft var34 = field_43;
            var69 = var34.method_45$1bff846bdc().field_42 - 112;
            TargetHud_47HO var75 = this;
            if (var19 == null) {
               long var82 = -9009341493272513635L;
               BooleanSetting var35 = this.settingTrackEntity;
               if (var35.method_49$aae029aa0a()) {
                  var73 = this.field_462.field_41 / var3.method_48$8abf5c6871();
                  break label77;
               }

               var75 = this;
            }

            long var88 = -9009387652909604582L;
            long var36 = var8;
            NumberSetting var38 = var75.settingYCoord;
            var73 = var38.method_44$474dfaa627(var36) / 100.0;
         }

         int var24 = 56 + (int)(var69 * var73);
         GL11.glTranslatef(var23, var24, 0.0F);
         long var78 = -9009387652909604582L;
         long var39 = var8;
         NumberSetting var41 = this.settingScale;
         double var63 = var41.method_44$474dfaa627(var39);
         long var83 = -9009387652909604582L;
         long var42 = var8;
         NumberSetting var44 = this.settingScale;
         GL11.glScaled(var63, var44.method_44$474dfaa627(var42), 1.0);
         double var25 = this.field_46n.method_45$fedcb3e4d3();
         double var89;
         int var64 = (var89 = this.field_46n.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var89 < 0.0 ? -1 : 1);
         if (var19 == null) {
            if (var64 < 0) {
               GL11.glScaled(var25, var25, 1.0);
            }

            short var79 = (short)var17;
            char var84 = (char)var18;
            long var10005 = -9015178573544695204L;
            byte var45 = 0;
            char var46 = var84;
            short var47 = var79;
            int var48 = var16;
            ColorSetting var49 = this.settingBackGroundColor;
            var64 = var49.method_47$24af287d8f(var48, var47, var46, var45);
         }

         int var27 = var64;
         long var80 = -9007590592647142396L;
         long var50 = var6;
         ShaderOptions var52 = this.field_42;
         boolean var65 = var52.method_49$0dd78e0064(var50);
         var83 = -9015546956481369423L;
         long var53 = var12;
         ShaderOptions var55 = this.field_42;
         boolean var70 = var55.method_47$0dd78e0064(var53);
         var83 = -9007364613216675129L;
         C_47uI.method_40$9bd74f13d3(var65, var70, var10);
         C_47Fw var81 = recovery$indy$15(this, var27, var22, var1, var21);
         var83 = -9016112450751804579L;
         C_47Fw var56 = var81;
         long var57 = var14;
         boolean var59 = true;
         C_47uI.method_42$300c7fd546(var59, var57, var56);
         GL11.glPopMatrix();
         GlStateManager.method_42y$da8c82d5d4();
         GlStateManager.method_42z$da8c82d5d4();
      }
   }






   private boolean method_496$aae029aa0a() {
      long var1 = a ^ 62755346377450L;
      long var3 = var1 ^ 124977820457341L;
      long var10002 = 2061013515133412161L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$16(this, 32, var3, -7102743251522554294L, var1);
      recovery$indy$17(this, 40, var3, -7102743251522554294L, var1);
   }



   private boolean method_49p$aae029aa0a() {
      long var1 = a ^ 65529223304561L;
      long var10000 = 2529207437603604490L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 2529142217713799804L;
      BooleanSetting var4 = this.settingTrackEntity;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49E$aae029aa0a() {
      long var1 = a ^ 133163114859722L;
      long var3 = var1 ^ 54586897317725L;
      long var10002 = 8843504858641597793L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43y = -1;
      this.field_40 = null;
      this.field_46G = null;
   }



   private boolean method_49o$aae029aa0a() {
      long var1 = a ^ 70126546352878L;
      long var3 = var1 ^ 131384917444985L;
      long var10002 = -8314148438873935035L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 64443100522902L;
      long var8 = var4 ^ 7668165369880L;
      this.field_46n
         .method_44$7c39c8007b(
            (int)recovery$indy$18(this.settingAnimationTime, var6, 2731290955559912965L, var4),
            C_47nb.method_41$7498260812(recovery$indy$19(this.settingToggleAnimation, var8, 2737985767335549476L, var4)),
            1,
            true
         );
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 88816413585975L;
      long var3 = var1 ^ 3321819975621L;
      long var5 = var1 ^ 26933110702496L;
      long var10003 = -4303373014106981476L;
      long var7 = var5;
      ModeSetting var9 = this.settingModes;
      String var10002 = var9.method_46$5f9dc63072(var7);
      var10003 = -4297851095612960424L;
      String var10 = var10002;
      long var11 = var3;
      TargetHud_47HO var13 = this;
      var13.method_47$d07b98bfef(var11, var10);
   }



   private boolean method_49D$aae029aa0a() {
      long var1 = a ^ 99744353762582L;
      long var3 = var1 ^ 19853460180609L;
      long var10002 = -3790250246053251907L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



   private boolean method_49Q$aae029aa0a() {
      long var1 = a ^ 43322617178425L;
      long var3 = var1 ^ 123004130564782L;
      long var10002 = -2357301618952920942L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   private boolean method_49K$aae029aa0a() {
      long var1 = a ^ 131423236032772L;
      long var3 = var1 ^ 69538473032339L;
      long var10002 = 9184104401971839151L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }



    public TargetHud_47HO(long a0) {
        super((java.lang.String) ("TargetHud"),(java.lang.String) ("Angriffszieloberfl\u00e4che"),(long) (((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 6896197141418L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (158))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.TargetHud_47HO.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 139297501760140L);
        long constructorKey4 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 85700502975335L);
        long constructorKey5 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 32548288556819L);
        long constructorKey6 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 108652722052190L);
        long constructorKey7 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 137206637018564L);
        long constructorKey8 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 131259146133425L);
        long constructorKey9 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 21927709220756L);
        long constructorKey10 = ((augustus.recovered.modules.render.TargetHud_47HO.a ^ a0) ^ 99201222139958L);
        java.lang.Object initialValue11 = recovery$indy$flow$566(2);
        ((java.lang.Object[]) initialValue11)[0] = "Old";
        ((java.lang.Object[]) initialValue11)[1] = "New";
        client.setting.ModeSetting initialized12 = new client.setting.ModeSetting(this, "Modes", constructorKey4, "Old", (java.lang.String[]) (initialValue11));
        recovery$indy$flow$568(this, initialized12);
        java.lang.Object initialValue13 = recovery$indy$flow$570(2);
        ((java.lang.Object[]) initialValue13)[0] = "Entity";
        ((java.lang.Object[]) initialValue13)[1] = "Scoreboard";
        client.setting.ModeSetting initialized14 = new client.setting.ModeSetting(this, "HealthMode", constructorKey4, "Entity", (java.lang.String[]) (initialValue13));
        recovery$indy$flow$572(this, initialized14);
        java.awt.Color initialized15 = new java.awt.Color(0, 0, 0, 180);
        client.setting.ColorSetting initialized16 = new client.setting.ColorSetting(constructorKey9, this, "BackGroundColor", initialized15);
        java.lang.Object initialValue17 = recovery$indy$flow$577(this);
        java.lang.Object initialValue18 = initialValue17;
        long initialValue19 = constructorKey3;
        client.setting.ColorSetting initialValue20 = initialized16;
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue22 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue23 = recovery$indy$flow$580(initialValue21, initialValue19, initialValue22);
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue23))))));
        recovery$indy$flow$582(this, initialValue24);
        java.awt.Color initialized25 = new java.awt.Color(0, 0, 0);
        client.setting.ColorSetting initialized26 = new client.setting.ColorSetting(constructorKey9, this, "HealthBackGroundColor", initialized25);
        java.lang.Object initialValue27 = recovery$indy$flow$587(this);
        java.lang.Object initialValue28 = initialValue27;
        long initialValue29 = constructorKey3;
        client.setting.ColorSetting initialValue30 = initialized26;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue33 = recovery$indy$flow$590(initialValue31, initialValue29, initialValue32);
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue33))))));
        recovery$indy$flow$592(this, initialValue34);
        java.awt.Color initialized35 = new java.awt.Color(255, 0, 0);
        client.setting.ColorSetting initialized36 = new client.setting.ColorSetting(constructorKey9, this, "HealthColor", initialized35);
        java.lang.Object initialValue37 = recovery$indy$flow$597(this);
        java.lang.Object initialValue38 = initialValue37;
        long initialValue39 = constructorKey3;
        client.setting.ColorSetting initialValue40 = initialized36;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue43 = recovery$indy$flow$600(initialValue41, initialValue39, initialValue42);
        java.lang.Object initialValue44 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue43))))));
        recovery$indy$flow$602(this, initialValue44);
        java.awt.Color initialized45 = new java.awt.Color(255, 255, 255);
        client.setting.ColorSetting initialized46 = new client.setting.ColorSetting(constructorKey9, this, "TextColor", initialized45);
        java.lang.Object initialValue47 = recovery$indy$flow$607(this);
        java.lang.Object initialValue48 = initialValue47;
        long initialValue49 = constructorKey3;
        client.setting.ColorSetting initialValue50 = initialized46;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue53 = recovery$indy$flow$610(initialValue51, initialValue49, initialValue52);
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue53))))));
        recovery$indy$flow$612(this, initialValue54);
        client.setting.NumberSetting initialized55 = new client.setting.NumberSetting(this, "Scale", 1.0D, constructorKey10, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue56 = recovery$indy$flow$615(this);
        java.lang.Object initialValue57 = initialValue56;
        client.setting.NumberSetting initialValue58 = initialized55;
        java.lang.Object initialValue59 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue60 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue61 = recovery$indy$flow$618(initialValue59, initialValue60);
        recovery$indy$flow$619(this, initialValue61);
        java.awt.Color initialized62 = new java.awt.Color(0, 0, 0, 100);
        client.setting.ColorSetting initialized63 = new client.setting.ColorSetting(constructorKey9, this, "BackGroundColorNew", initialized62);
        long initialValue64 = constructorKey7;
        java.lang.String initialValue65 = "BackGroundColor";
        client.setting.ColorSetting initialValue66 = initialized63;
        java.lang.Object initialValue67 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue66))))));
        java.lang.Object initialValue68 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue69 = recovery$indy$flow$626(initialValue67, initialValue68, initialValue64);
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = recovery$indy$flow$628(this);
        java.lang.Object initialValue72 = initialValue71;
        long initialValue73 = constructorKey3;
        java.lang.Object initialValue74 = initialValue70;
        java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue76 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue72))))));
        java.lang.Object initialValue77 = recovery$indy$flow$631(initialValue75, initialValue73, initialValue76);
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue77))))));
        recovery$indy$flow$633(this, initialValue78);
        java.awt.Color initialized79 = new java.awt.Color(0, 0, 0);
        client.setting.ColorSetting initialized80 = new client.setting.ColorSetting(constructorKey9, this, "HealthBackGroundColorNew", initialized79);
        long initialValue81 = constructorKey7;
        java.lang.String initialValue82 = "HealthBackGroundColor";
        client.setting.ColorSetting initialValue83 = initialized80;
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue85 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue86 = recovery$indy$flow$640(initialValue84, initialValue85, initialValue81);
        java.lang.Object initialValue87 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue86))))));
        java.lang.Object initialValue88 = recovery$indy$flow$642(this);
        java.lang.Object initialValue89 = initialValue88;
        long initialValue90 = constructorKey3;
        java.lang.Object initialValue91 = initialValue87;
        java.lang.Object initialValue92 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue91))))));
        java.lang.Object initialValue93 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue94 = recovery$indy$flow$645(initialValue92, initialValue90, initialValue93);
        java.lang.Object initialValue95 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue94))))));
        recovery$indy$flow$647(this, initialValue95);
        java.awt.Color initialized96 = new java.awt.Color(255, 0, 0);
        client.setting.ColorSetting initialized97 = new client.setting.ColorSetting(constructorKey9, this, "HealthColorNew", initialized96);
        long initialValue98 = constructorKey7;
        java.lang.String initialValue99 = "HealthColor";
        client.setting.ColorSetting initialValue100 = initialized97;
        java.lang.Object initialValue101 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue100))))));
        java.lang.Object initialValue102 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue103 = recovery$indy$flow$654(initialValue101, initialValue102, initialValue98);
        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue105 = recovery$indy$flow$656(this);
        java.lang.Object initialValue106 = initialValue105;
        long initialValue107 = constructorKey3;
        java.lang.Object initialValue108 = initialValue104;
        java.lang.Object initialValue109 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue108))))));
        java.lang.Object initialValue110 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue106))))));
        java.lang.Object initialValue111 = recovery$indy$flow$659(initialValue109, initialValue107, initialValue110);
        java.lang.Object initialValue112 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue111))))));
        recovery$indy$flow$661(this, initialValue112);
        java.awt.Color initialized113 = new java.awt.Color(255, 0, 0);
        client.setting.ColorSetting initialized114 = new client.setting.ColorSetting(constructorKey9, this, "HeadDamageColorNew", initialized113);
        long initialValue115 = constructorKey7;
        java.lang.String initialValue116 = "HeadDamageColor";
        client.setting.ColorSetting initialValue117 = initialized114;
        java.lang.Object initialValue118 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue117))))));
        java.lang.Object initialValue119 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue116))))));
        java.lang.Object initialValue120 = recovery$indy$flow$668(initialValue118, initialValue119, initialValue115);
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = recovery$indy$flow$670(this);
        java.lang.Object initialValue123 = initialValue122;
        long initialValue124 = constructorKey3;
        java.lang.Object initialValue125 = initialValue121;
        java.lang.Object initialValue126 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue125))))));
        java.lang.Object initialValue127 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue123))))));
        java.lang.Object initialValue128 = recovery$indy$flow$673(initialValue126, initialValue124, initialValue127);
        java.lang.Object initialValue129 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue128))))));
        recovery$indy$flow$675(this, initialValue129);
        java.awt.Color initialized130 = new java.awt.Color(255, 255, 255);
        client.setting.ColorSetting initialized131 = new client.setting.ColorSetting(constructorKey9, this, "TextColorNew", initialized130);
        long initialValue132 = constructorKey7;
        java.lang.String initialValue133 = "TextColor";
        client.setting.ColorSetting initialValue134 = initialized131;
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue133))))));
        java.lang.Object initialValue137 = recovery$indy$flow$682(initialValue135, initialValue136, initialValue132);
        java.lang.Object initialValue138 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue137))))));
        java.lang.Object initialValue139 = recovery$indy$flow$684(this);
        java.lang.Object initialValue140 = initialValue139;
        long initialValue141 = constructorKey3;
        java.lang.Object initialValue142 = initialValue138;
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue144 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue140))))));
        java.lang.Object initialValue145 = recovery$indy$flow$687(initialValue143, initialValue141, initialValue144);
        java.lang.Object initialValue146 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue145))))));
        recovery$indy$flow$689(this, initialValue146);
        client.setting.BooleanSetting initialized147 = new client.setting.BooleanSetting(this, constructorKey8, "TrackEntity", true);
        recovery$indy$flow$692(this, initialized147);
        client.setting.NumberSetting initialized148 = new client.setting.NumberSetting(this, "TrackY", 0.0D, constructorKey10, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), 2);
        java.lang.Object initialValue149 = ((java.lang.Object)(((augustus.recovered.modules.render.TargetHud_47HO) (((java.lang.Object)(this)))).settingTrackEntity));
        java.lang.Object initialValue150 = recovery$indy$flow$696(initialValue149);
        java.lang.Object initialValue151 = recovery$indy$flow$697(initialValue149);
        java.lang.Object initialValue152 = initialValue151;
        client.setting.NumberSetting initialValue153 = initialized148;
        java.lang.Object initialValue154 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue155 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue152))))));
        java.lang.Object initialValue156 = recovery$indy$flow$700(initialValue154, initialValue155);
        recovery$indy$flow$701(this, initialValue156);
        client.setting.NumberSetting initialized157 = new client.setting.NumberSetting(this, "XCoord", Double.longBitsToDouble(4633641066610819072L), constructorKey10, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        java.lang.Object initialValue158 = recovery$indy$flow$704(this);
        java.lang.Object initialValue159 = initialValue158;
        client.setting.NumberSetting initialValue160 = initialized157;
        java.lang.Object initialValue161 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue160))))));
        java.lang.Object initialValue162 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue159))))));
        java.lang.Object initialValue163 = recovery$indy$flow$707(initialValue161, initialValue162);
        recovery$indy$flow$708(this, initialValue163);
        client.setting.NumberSetting initialized164 = new client.setting.NumberSetting(this, "YCoord", Double.longBitsToDouble(4632233691727265792L), constructorKey10, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        java.lang.Object initialValue165 = recovery$indy$flow$711(this);
        java.lang.Object initialValue166 = initialValue165;
        client.setting.NumberSetting initialValue167 = initialized164;
        java.lang.Object initialValue168 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue169 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue166))))));
        java.lang.Object initialValue170 = recovery$indy$flow$714(initialValue168, initialValue169);
        recovery$indy$flow$715(this, initialValue170);
        java.lang.Object initialValue171 = recovery$indy$flow$717(true);
        client.setting.ModeSetting initialized172 = new client.setting.ModeSetting(this, "ToggleAnimation", constructorKey4, "easeOutBack", (java.lang.String[]) (initialValue171));
        recovery$indy$flow$719(this, initialized172);
        client.setting.NumberSetting initialized173 = new client.setting.NumberSetting(this, "AnimationTime", Double.longBitsToDouble(4647503709213818880L), constructorKey10, 0.0D, Double.longBitsToDouble(4656510908468559872L), 0);
        java.lang.Object initialValue174 = recovery$indy$flow$722(this);
        java.lang.Object initialValue175 = initialValue174;
        client.setting.NumberSetting initialValue176 = initialized173;
        java.lang.Object initialValue177 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue176))))));
        java.lang.Object initialValue178 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue175))))));
        java.lang.Object initialValue179 = recovery$indy$flow$725(initialValue177, initialValue178);
        recovery$indy$flow$726(this, initialValue179);
        client.setting.ShaderOptions initialized180 = new client.setting.ShaderOptions(this, constructorKey5);
        java.lang.Object initialValue181 = recovery$indy$flow$729();
        java.lang.Object initialValue182 = initialValue181;
        long initialValue183 = constructorKey6;
        client.setting.ShaderOptions initialValue184 = initialized180;
        java.lang.Object initialValue185 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue184))))));
        java.lang.Object initialValue186 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue182))))));
        java.lang.Object initialValue187 = recovery$indy$flow$732(initialValue185, initialValue183, initialValue186);
        recovery$indy$flow$733(this, initialValue187);
        recovery$indy$flow$734(this, -1);
        recovery$indy$flow$735(this, null);
        recovery$indy$flow$736(this, null);
        net.C_47tf initialized188 = new net.C_47tf(0.0D, 0.0D, 0.0D);
        recovery$indy$flow$739(this, initialized188);
        net.C_47nb initialized189 = new net.C_47nb(0.0F, 0.0F, 0.0F, 0.0F);
        recovery$indy$flow$742(this, initialized189);
        net.C_47nb initialized190 = new net.C_47nb(0.0F, 0.0F, 0.0F, 0.0F);
        recovery$indy$flow$745(this, initialized190);
    }








    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$566(int a0);
    private static native void recovery$indy$flow$568(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$570(int a0);
    private static native void recovery$indy$flow$572(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$577(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$580(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$582(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$587(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$590(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$592(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$597(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$600(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$602(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$607(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$610(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$612(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$615(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$618(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$619(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$626(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$628(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$631(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$633(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$640(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$642(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$645(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$647(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$654(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$661(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$668(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$673(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$675(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$682(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$684(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$687(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$689(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$692(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$696(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$697(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$701(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$704(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$708(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$711(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$714(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$715(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$717(boolean a0);
    private static native void recovery$indy$flow$719(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$722(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$725(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$726(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$729() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$732(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$733(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$734(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.TargetHud_47HO) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$735(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.TargetHud_47HO) (a0)).field_40 = ((net.minecraft.client.entity.AbstractClientPlayer) (a1));
        return;
    }
    private static void recovery$indy$flow$736(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.TargetHud_47HO) (a0)).field_46G = ((net.minecraft.client.entity.AbstractClientPlayer) (a1));
        return;
    }
    private static void recovery$indy$flow$739(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.TargetHud_47HO) (a0)).field_462 = ((net.C_47tf) (a1));
        return;
    }
    private static native void recovery$indy$flow$742(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$745(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native TextureManager recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(int var0, long var1);
   private static native C_47Fw recovery$indy$4(TargetHud_47HO var0, int var1, int var2, int var3, AbstractClientPlayer var4, boolean var5);
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$7(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$8(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$9(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$10(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$11(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$12(Object var0, long var1, long var3);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native C_47tf recovery$indy$14(double var0, double var2, double var4, long var6, Object var8, long var9, long var11);
   private static native C_47Fw recovery$indy$15(TargetHud_47HO var0, int var1, C_47Yl var2, AbstractClientPlayer var3, boolean var4);
   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$34();
}
