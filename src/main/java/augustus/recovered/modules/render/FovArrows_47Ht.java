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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40X;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47b0;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47y6;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class FovArrows_47Ht extends Module {
   private final NumberSetting settingMaxTargetDistance;
   private final NumberSetting settingCrossHairDistance;
   private final NumberSetting settingScale;
   private final ColorSetting settingColor;
   private final BooleanSetting settingDistAlpha;
   private final BooleanSetting settingDistColor;
   private final BooleanSetting settingRenderNames;
   private final BooleanSetting settingOutline;
   private final BooleanSetting settingDifferentOutlineColor;
   private final ColorSetting settingOutlineColor;
   public final ShaderOptions field_42;
   private final ArrayList field_43h;
   private final C_47b0 field_49;
   private static final long a = C_4f.a(4594988261963229829L, -5654790734748857134L, MethodHandles.lookup().lookupClass()).a(169817382713640L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[60];
   private static final String[] f = new String[60];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   public void method_48$99d84893f2(long var1, RenderPass var3) {
      int[] var38;
      var1 = a ^ var1;
      long var4 = var1 ^ 57019593833823L;
      long var6 = var1 ^ 89199024841121L;
      long var8 = var1 ^ 2857854382909L;
      long var10 = var1 ^ 108056025317820L;
      long var12 = var1 ^ 23459381519412L;
      long var10001 = var1 ^ 59279145197385L;
      int var14 = (int)((var1 ^ 59279145197385L) >>> 32);
      int var15 = (int)((var1 ^ 59279145197385L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      int[] var17 = recovery$indy$1(-1309726928845098136L, var1);
      int var18 = 0;
      if (recovery$indy$2(field_43, -1308323689092446491L, var1) != null) {
         for (Object recovered$element$3853 : this.field_43h) {
         EntityPlayer var20 = (EntityPlayer) recovered$element$3853;
            float var21 = (float)(var20.field_48u + (var20.field_48Q - var20.field_48u) * recovery$indy$3(field_43, -1308557775102170711L, var1).field_49);
            float var22 = (float)(var20.field_48O + (var20.field_48j - var20.field_48O) * recovery$indy$4(field_43, -1308557775102170711L, var1).field_49);
            float var23 = (float)(var20.field_48l + (var20.field_42o - var20.field_48l) * recovery$indy$5(field_43, -1308557775102170711L, var1).field_49);
            double var24 = recovery$indy$9(
                  var12,
                  var21,
                  var22,
                  var23,
                  recovery$indy$7(recovery$indy$6(-1308741369134456998L, var1), -1310494593049249063L, var1).field_43,
                  recovery$indy$8(field_43, -1308323689092446491L, var1).field_48z,
                  -1308823442058808744L,
                  var1
               )[0]
               % 360.0F;
            ScaledResolution var26 = new ScaledResolution(field_43);
            GL11.glPushMatrix();
            GL11.glScaled(1.0F / var26.method_40$8abf5c6871(), 1.0F / var26.method_40$8abf5c6871(), 1.0);
            GL11.glScaled(
               recovery$indy$10(this.settingScale, var6, -1309861820224195080L, var1), recovery$indy$11(this.settingScale, var6, -1309861820224195080L, var1), 1.0
            );
            var26 = new ScaledResolution(
               field_43.field_44f * (1.0 / recovery$indy$12(this.settingScale, var6, -1309861820224195080L, var1)),
               field_43.field_44g * (1.0 / recovery$indy$13(this.settingScale, var6, -1309861820224195080L, var1)),
               (int)recovery$indy$14(this.settingScale, var6, -1309861820224195080L, var1)
            );
            float var27 = (float)(
               var26.method_46$8abf5c6871() / 2 + recovery$indy$15(this.settingCrossHairDistance, var6, -1309861820224195080L, var1) * Math.sin((Math.PI / 180.0) * var24)
            );
            float var28 = (float)(
               var26.method_48$8abf5c6871() / 2 + recovery$indy$16(this.settingCrossHairDistance, var6, -1309861820224195080L, var1) * -Math.cos((Math.PI / 180.0) * var24)
            );
            int var10000 = (int) ((recovery$indy$17(this.settingRenderNames, -1309972023321999354L, var1)) ? 1 : 0);
            if (var17 == null) {
               if (var10000 != 0) {
                  GL11.glScaled(0.5, 0.5, 1.0);
                  recovery$indy$18(field_43, -1308935507335498425L, var1)
                     .method_42$b593f01403(
                        var20.method_41$0e30dfc966(),
                        (var27 - recovery$indy$19(field_43, -1308935507335498425L, var1).method_48$2f485d5ba3(var20.method_41$0e30dfc966()) / 4.0F) * 2.0F,
                        (var28 + 8.0F) * 2.0F,
                        recovery$indy$20(this.field_42, var3, var10, -1, -1308918304179721510L, var1)
                     );
                  GL11.glScaled(2.0, 2.0, 1.0);
               }

               GlStateManager.method_42$c151fe78a0(var27, var28, 5.0F);
               GlStateManager.method_42$f2b6a9055b((float)var24 + 180.0F, 0.0F, 0.0F, 1.0F);
               GlStateManager.method_42$c151fe78a0(-var27, -var28, 5.0F);
               var10000 = recovery$indy$21(this.settingColor, var14, (short)var15, (char)var16, var18, -1310029412498185441L, var1);
            }

            int var29 = var10000;
            double var30 = 255.0 / C_47sk.method_45$4b58f7ab41(recovery$indy$22(this.settingMaxTargetDistance, var6, -1309861820224195080L, var1), 0.0, 255.0);
            int var37 = (int) ((recovery$indy$23(this.settingDistAlpha, -1309972023321999354L, var1)) ? 1 : 0);
            int[] var40 = var17;
            if (var1 >= 0L) {
               if (var17 == null) {
                  if ((var37) != 0) {
                     var29 = recovery$indy$25(
                        var29,
                        (int)(255.0 - Math.min(recovery$indy$24(field_43, -1308323689092446491L, var1).method_44$ee256e8a75(var20) * var30, 255.0)),
                        var4,
                        -1310268470888819808L,
                        var1
                     );
                  }

                  var37 = (int) ((recovery$indy$26(this.settingDistColor, -1309972023321999354L, var1)) ? 1 : 0);
               }

               var40 = var17;
            }

            label92: {
               label103: {
                  if (var40 == null) {
                     if ((var37) != 0) {
                        float[] var32 = recovery$indy$27(var29, var8, -1310467427156585540L, var1);
                        float var33 = 30.0F
                           / C_47sk.method_46$ef9a6720f7((float)recovery$indy$28(this.settingMaxTargetDistance, var6, -1309861820224195080L, var1) - 6.0F, 0.0F, 255.0F);
                        int var34 = Color.HSBtoRGB(
                           (float)(
                              0.01141552511
                                 * (
                                    C_47sk.method_46$ef9a6720f7(
                                          recovery$indy$29(field_43, -1308323689092446491L, var1).method_40$ee256e8a75(var20) - 6.0F,
                                          0.0F,
                                          (float)(recovery$indy$30(this.settingMaxTargetDistance, var6, -1309861820224195080L, var1) - 6.0)
                                       )
                                       * var33
                                 )
                           ),
                           var32[1],
                           var32[2]
                        );
                        var29 = recovery$indy$32(var34, recovery$indy$31(var29, -1310169694340911398L, var1), var4, -1310268470888819808L, var1);
                     }

                     var29 = recovery$indy$33(this.field_42, var3, var10, var29, -1308918304179721510L, var1);
                     RenderUtils.method_40$a0864c4b60(var27, var28, 10.0F, var29);
                     var38 = var17;
                     if (var1 <= 0L) {
                        break label92;
                     }

                     if (var17 != null) {
                        break label103;
                     }

                     var37 = (int) ((recovery$indy$34(this.settingOutline, -1309972023321999354L, var1)) ? 1 : 0);
                  }

                  if ((var37) != 0) {
                     GL11.glLineWidth(1.0F);
                     if (var1 > 0L) {
                        var37 = (int) ((recovery$indy$35(this.settingDifferentOutlineColor, -1309972023321999354L, var1)) ? 1 : 0);
                        if (var17 == null) {
                           if (var37 != 0) {
                              var29 = recovery$indy$36(this.settingOutlineColor, var14, (short)var15, (char)var16, var18, -1310029412498185441L, var1);
                           }

                           var37 = recovery$indy$37(this.field_42, var3, var10, var29, -1308918304179721510L, var1);
                        }

                        var29 = var37;
                     }

                     byte var10003 = (byte) ((recovery$indy$38(this.settingDifferentOutlineColor, -1309972023321999354L, var1)) ? 1 : 0);
                     if (var17 == null) {
                        var10003 = (byte)(var10003 != 0 ? recovery$indy$39(var29, 255, var4, -1310268470888819808L, var1) : var29);
                     }

                     RenderUtils.method_43$a0864c4b60(var27, var28, 10.0F, var10003);
                  }

                  GL11.glPopMatrix();
                  var18++;
               }

               var38 = var17;
            }

            if (var38 != null) {
               break;
            }
         }
      }
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 128678173426009L;
      long var10000 = -374421196817128329L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -374598349207412967L;
      BooleanSetting var4 = this.settingDifferentOutlineColor;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -374598349207412967L;
         BooleanSetting var5 = this.settingOutline;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   public boolean method_48$5161acda81(long var1, EntityPlayer var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 17825360979403L;
      long var6 = var1 ^ 48855492730724L;
      long var10001 = var1 ^ 8100570815797L;
      int var8 = (int)((var1 ^ 8100570815797L) >>> 48);
      int var9 = (int)((var1 ^ 8100570815797L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      int[] var11 = recovery$indy$40(-6970213245670276610L, var1);
      boolean var10000 = recovery$indy$41(ClientGlobals.field_48.field_480, var4, var3, -6970303329437430914L, var1);
      if (var11 == null) {
         if (var10000) {
            return false;
         }

         var10000 = recovery$indy$42(ClientGlobals.field_48.field_46Z, var3, var6, -6969543154346390686L, var1);
      }

      if (var11 == null) {
         if (var10000) {
            if (var1 < 0L) {
               return var11 != null ? ClientGlobals.field_48.field_46Z.field_43P : !ClientGlobals.field_48.field_46Z.field_43P;
            }

            if (var11 != null) {
               return var11 != null ? ClientGlobals.field_48.field_46Z.field_43P : !ClientGlobals.field_48.field_46Z.field_43P;
            }

            if (!ClientGlobals.field_48.field_46Z.field_43P) {
               return false;
            }
         }

         var10000 = recovery$indy$43(ClientGlobals.field_48.field_44Q, (short)var8, var9, var3, var10, -6970698161929651675L, var1);
      }

      return var11 != null ? var10000 : !var10000;
   }

   public void method_43$347fb22ac0(short var1, int var2, int var3) {
      net.minecraft.entity.Entity var19;
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 126714651071045L;
      long var8 = var4 ^ 58261472000751L;
      long var10001 = var4 ^ 93027460906231L;
      int var10 = (int)((var4 ^ 93027460906231L) >>> 48);
      int var11 = (int)((var4 ^ 93027460906231L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      this.field_49
         .method_40$a59262c0f0(
            recovery$indy$44(field_43, -675564483049203421L, var4).field_48Q,
            recovery$indy$45(field_43, -675564483049203421L, var4).field_48j,
            recovery$indy$46(field_43, -675564483049203421L, var4).field_42o
         );
      int[] var10000 = recovery$indy$47(-676507989216352218L, var4);
      this.field_43h.clear();
      int[] var13 = var10000;
      Minecraft var17 = field_43;
      if (var13 == null) {
         if (recovery$indy$48(field_43, -677365871772066389L, var4) == null) {
            return;
         }

         var17 = field_43;
      }

      for (Object recovered$element$14750 : recovery$indy$49(var17, -675826933410334577L, var4).field_44Q) {
         Entity var15 = (Entity) recovered$element$14750;
         label104: {
            boolean var18 = var15 instanceof EntityPlayer;
            int[] var21 = var13;
            if (var3 >= 0) {
               if (var13 == null) {
                  if (!var18) {
                     break label104;
                  }

                  var18 = var15 instanceof EntityPlayerSP;
               }

               var21 = var13;
            }

            label105: {
               if (var21 == null) {
                  if (var18) {
                     break label104;
                  }

                  var19 = var15;
                  if (var13 != null) {
                     break label105;
                  }

                  var18 = recovery$indy$50(
                     var15, true, false, (short)var10, false, false, false, true, false, false, var11, false, (char)var12, -677441184850023985L, var4
                  );
               }

               if (!var18) {
                  break label104;
               }

               var19 = var15;
            }

            EntityPlayer var16 = (EntityPlayer)var19;
            byte var20 = (byte) ((recovery$indy$51(this, var6, var16, -677621431656940961L, var4)) ? 1 : 0);
            int[] var22 = var13;
            if (var1 >= 0) {
               if (var13 == null) {
                  if (var20 == 0) {
                     break label104;
                  }

                  var20 = (byte) ((this.field_49.method_46$53fc7ac166(var16.method_45$6684d3c618())) ? 1 : 0);
               }

               var22 = var13;
            }

            if (var2 >= 0) {
               if (var22 == null) {
                  if (var20 != 0) {
                     break label104;
                  }

                  double var23;
                  var20 = (byte)((
                           var23 = recovery$indy$52(field_43, -677365871772066389L, var4).method_40$ee256e8a75(var16)
                              - recovery$indy$53(this.settingMaxTargetDistance, var8, -676654573903434058L, var4)
                        )
                        == 0.0
                     ? 0
                     : (var23 < 0.0 ? -1 : 1));
               }

               var22 = var13;
            }

            if (var22 == null && var20 < 0) {
               this.field_43h.add(var16);
            }
         }

         if (var13 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public FovArrows_47Ht(long var1) {
      super("FovArrows", "SichtfeldPfeile", ((a ^ var1) ^ 73298189532451L), new Color(124, 83, 245), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 64179963786245L;
      long var5 = var1 ^ 98361340350874L;
      long var7 = var1 ^ 42048183591639L;
      long var9 = var1 ^ 43820584748382L;
      long var11 = var1 ^ 56687447400760L;
      long var13 = var1 ^ 33907163946687L;
      long var15 = var1 ^ 95789661331741L;
      long var17 = var1 ^ 73298189532451L;
      // Super arguments moved to the required Java constructor position.
      this.settingMaxTargetDistance = new NumberSetting(this, "MaxTargetDistance", 20.0, var13, 1.0, 30.0, 0);
      this.settingCrossHairDistance = new NumberSetting(this, "CrossHairDistance", 30.0, var13, 0.0, 50.0, 0);
      this.settingScale = new NumberSetting(this, "Scale", 2.0, var13, 1.0, 4.0, 2);
      this.settingColor = new ColorSetting(var15, this, "Color", Color.red);
      this.settingDistAlpha = new BooleanSetting(this, var11, "DistAlpha", true);
      this.settingDistColor = new BooleanSetting(this, var11, "DistColor", true);
      this.settingRenderNames = new BooleanSetting(this, var11, "RenderNames", false);
      this.settingOutline = new BooleanSetting(this, var11, "Outline", true);
      BooleanSetting var10001 = new BooleanSetting(this, var11, "DifferentOutlineColor", true);
      BooleanSetting var10002 = this.settingOutline;
      this.settingOutline.getClass();
      C_45n var10003 = recovery$indy$54(var10002);
      long var10004 = -5434224529883596846L;
      C_45n var19 = var10003;
      long var20 = var3;
      BooleanSetting var22 = var10001;
      this.settingDifferentOutlineColor = (BooleanSetting)var22.method_43$780fd62a21(var20, var19);
      ColorSetting var35 = new ColorSetting(var15, this, "OutlineColor", Color.black);
      var10003 = recovery$indy$55(this);
      var10004 = -5434224529883596846L;
      C_45n var23 = var10003;
      long var24 = var3;
      ColorSetting var26 = var35;
      this.settingOutlineColor = (ColorSetting)var26.method_43$780fd62a21(var24, var23);
      ShaderOptions var36 = new ShaderOptions(this, var5);
      var10004 = -5433844108736514757L;
      Color var27 = Color.black;
      long var28 = var7;
      ShaderOptions var30 = var36;
      ShaderOptions var37 = var30.method_44$10ed55120d(var28, var27);
      long var39 = -5434483852126131807L;
      long var31 = var9;
      ShaderOptions var33 = var37;
      this.field_42 = var33.method_47$7d3e47ba5c(var31);
      this.field_43h = new ArrayList();
      this.field_49 = new C_47b0();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$3(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$4(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$5(Object var0, long var1, long var3);

   private static native Client recovery$indy$6(long var0, long var2);

   private static native C_47y6 recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native float[] recovery$indy$9(long var0, double var2, double var4, double var6, float var8, float var9, long var10, long var12);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$16(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$18(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$19(Object var0, long var1, long var3);

   private static native int recovery$indy$20(Object var0, Object var1, long var2, int var4, long var5, long var7);

   private static native int recovery$indy$21(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$23(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);

   private static native int recovery$indy$25(int var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$26(Object var0, long var1, long var3);

   private static native float[] recovery$indy$27(int var0, long var1, long var3, long var5);

   private static native double recovery$indy$28(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);

   private static native double recovery$indy$30(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$31(int var0, long var1, long var3);

   private static native int recovery$indy$32(int var0, int var1, long var2, long var4, long var6);

   private static native int recovery$indy$33(Object var0, Object var1, long var2, int var4, long var5, long var7);

   private static native boolean recovery$indy$34(Object var0, long var1, long var3);

   private static native boolean recovery$indy$35(Object var0, long var1, long var3);

   private static native int recovery$indy$36(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native int recovery$indy$37(Object var0, Object var1, long var2, int var4, long var5, long var7);

   private static native boolean recovery$indy$38(Object var0, long var1, long var3);

   private static native int recovery$indy$39(int var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$40(long var0, long var2);

   private static native boolean recovery$indy$41(Object var0, long var1, Object var3, long var4, long var6);

   private static native boolean recovery$indy$42(Object var0, Object var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$43(Object var0, short var1, int var2, Object var3, int var4, long var5, long var7);

   private static native Entity recovery$indy$44(Object var0, long var1, long var3);

   private static native Entity recovery$indy$45(Object var0, long var1, long var3);

   private static native Entity recovery$indy$46(Object var0, long var1, long var3);

   private static native int[] recovery$indy$47(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$48(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$49(Object var0, long var1, long var3);

   private static native boolean recovery$indy$50(
      Object var0,
      boolean var1,
      boolean var2,
      short var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      boolean var11,
      char var12,
      long var13,
      long var15
   );

   private static native boolean recovery$indy$51(Object var0, long var1, Object var3, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$52(Object var0, long var1, long var3);

   private static native double recovery$indy$53(Object var0, long var1, long var3, long var5);

   private static native C_45n recovery$indy$54(BooleanSetting var0);

   private static native C_45n recovery$indy$55(FovArrows_47Ht var0);

   private static native MethodHandle recovery$constant$56();
}
