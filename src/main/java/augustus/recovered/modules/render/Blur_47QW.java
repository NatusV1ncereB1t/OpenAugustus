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
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41C;
import net.C_45n;
import client.render.RenderPass;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Dm;
import net.C_47Fw;
import net.C_47Il;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.render.ShaderProgram;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import client.render.StencilFramebuffer;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tP;
import net.C_47vQ;
import net.C_47vi;
import net.C_47wr;
import net.C_4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class Blur_47QW extends Module implements C_47vi {
   public final ModeSetting settingModesNew;
   public final NumberSetting settingSigma;
   public final BooleanSetting settingInScreens;
   public final BooleanSetting settingBlurEntities;
   public final MultiSelectSetting settingEntities;
   private final MultiSelectSetting settingItemsToBlur;
   private final Framebuffer field_48;
   private final Framebuffer field_44;
   private final Framebuffer field_45;
   private ShaderProgram field_46y;
   private double field_430;
   private FloatBuffer field_47;
   private FloatBuffer field_46w;
   private static String[] field_42;
   private static final long a = C_4f.a(-2671350954725208278L, -8512662868275125684L, MethodHandles.lookup().lookupClass()).a(176109491841625L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[74];
   private static final String[] f = new String[74];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(byte[] var0);

   private static void method_46$73f6f9977a(C_47Pi var0, EntityLivingBase var1, C_47wr var2, Entity var3, RenderPass var4) {
      long var5 = a ^ 70133436208713L;
      long var7 = var5 ^ 124230008998099L;
      double var10004 = var3.field_48Q - var3.field_48u;
      long var10006 = -2259834608171220837L;
      Minecraft var9 = field_43;
      var10004 = var3.field_48u + var10004 * var9.method_46$159e3d0645().field_49;
      double var25 = var3.field_48j - var3.field_48O;
      long var10008 = -2259834608171220837L;
      Minecraft var10 = field_43;
      double var10005 = var3.field_48O + var25 * var10.method_46$159e3d0645().field_49;
      double var10007 = var3.field_42o - var3.field_48l;
      long var10009 = -2259834608171220837L;
      Minecraft var11 = field_43;
      double var26 = var3.field_48l + var10007 * var11.method_46$159e3d0645().field_49;
      var10008 = -2252120270829772623L;
      boolean var12 = true;
      double var13 = var26;
      double var15 = var10005;
      double var17 = var10004;
      long var19 = var7;
      C_47wr var21 = var2;
      EntityLivingBase var22 = var1;
      C_47Pi var23 = var0;
      var23.method_41$cec454e236(var22, var21, var19, var17, var15, var13, var12);
   }

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private float method_42$e70c882bc6(float var1, float var2) {
      return (float)(Math.exp(-(var1 * var1) / (2.0F * var2 * var2)) / Math.sqrt((Math.PI * 2) * var2 * var2));
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      net.minecraft.entity.EntityLivingBase var15;
      net.minecraft.client.entity.EntityPlayerSP var17;
      long var4 = var2 ^ 74969343727596L;
      long var10001 = var2 ^ 140258210288593L;
      int var6 = (int)((var2 ^ 140258210288593L) >>> 48);
      int var7 = (int)((var2 ^ 140258210288593L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 109366789844811L;
      int[] var11 = recovery$indy$1(1853569500221605875L, var2);
      boolean var10000 = recovery$indy$2(this.settingBlurEntities, 1854013565533034337L, var2);
      if (var11 == null) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$3(ClientGlobals.field_48.field_44K, var4, 1847082016745580902L, var2);
      }

      label72: {
         if (var11 == null) {
            if (!var10000) {
               break label72;
            }

            var10000 = recovery$indy$4(C_47tP.VANILLA, 1855395752676250873L, var2);
         }

         if (var10000) {
            return;
         }
      }

      EntityLivingBase var12;
      label60: {
         label78: {
            label79: {
               var12 = recovery$indy$5(var1, 1855102076474730199L, var2);
               if (recovery$indy$6(C_41C.MYSELF, 1847408845127402779L, var2)) {
                  var15 = var12;
                  var17 = recovery$indy$7(field_43, 1854586147617030510L, var2);
                  if (var11 != null) {
                     break label79;
                  }

                  if (var12 == var17) {
                     break label60;
                  }
               }

               var15 = var12;
               if (var11 != null) {
                  break label78;
               }

               var17 = recovery$indy$8(field_43, 1854586147617030510L, var2);
            }

            if (var15 == var17) {
               return;
            }

            var15 = var12;
         }

         if (!recovery$indy$15(
            var15,
            recovery$indy$9(C_41C.PLAYERS, 1847408845127402779L, var2),
            recovery$indy$10(C_41C.MOBS, 1847408845127402779L, var2),
            (short)var6,
            recovery$indy$11(C_41C.ANIMALS, 1847408845127402779L, var2),
            recovery$indy$12(C_41C.VILLAGER, 1847408845127402779L, var2),
            recovery$indy$13(C_41C.ARMOR_STANDS, 1847408845127402779L, var2),
            recovery$indy$14(C_41C.INVISIBLE, 1847408845127402779L, var2),
            false,
            false,
            var7,
            true,
            (char)var8,
            1854525594053540428L,
            var2
         )) {
            return;
         }
      }

      recovery$indy$16(1846769156642132389L, var2);
      recovery$indy$17(1853433470433031539L, var2);
      C_47wr var13 = recovery$indy$18(var1, 1847324499901482113L, var2);
      EntityLivingBase var14 = recovery$indy$19(var1, 1855102076474730199L, var2);
      var10000 = var12.method_48E$aae029aa0a();
      if (var11 == null) {
         var10000 = !var10000;
      }

      recovery$indy$21(var10000, var9, recovery$indy$20(var1, var14, var13, var12), 1847128340773271424L, var2);
   }

   public void method_41$e45a9973e5(long var1) {
      long var3;
      long var5;
      long var7;
      label26: {
         var1 = a ^ var1;
         var3 = var1 ^ 2691391669906L;
         var5 = var1 ^ 16312475881237L;
         var7 = var1 ^ 115202836190793L;
         int[] var9 = recovery$indy$22(8951784422079881841L, var1);
         boolean var10000 = Display.isActive();
         if (var9 == null) {
            if (!var10000) {
               return;
            }

            GlStateManager.method_426$da8c82d5d4();
            GlStateManager.method_42$c151fe78a0(0.0F, 0.0F, -1.0F);
            GlStateManager.method_42p$da8c82d5d4();
            GlStateManager.method_46$3ebc9ac54d(516, 0.0F);
            GlStateManager.method_42$da8c82d5d4();
            GlStateManager.method_42y$da8c82d5d4();
            if (var9 != null) {
               break label26;
            }

            var10000 = C_47vQ.method_48$aae029aa0a();
         }

         if (var10000) {
            C_47Il.method_40j$da8c82d5d4();
         }

         GlStateManager.method_41$da8c82d5d4();
      }

      ScaledResolution var10 = new ScaledResolution(field_43);
      float var11 = (float)var10.method_44$fedcb3e4d3();
      float var12 = (float)var10.method_40$fedcb3e4d3();
      recovery$indy$23(this.field_46y, 8951743261352272520L, var1);
      recovery$indy$24(this, var7, 8952381266710848369L, var1);
      recovery$indy$26(
         this, 0, recovery$indy$25(field_43, 8952277213141658255L, var1).field_40, this.field_48, var5, (int)var11, (int)var12, 8951567753679522450L, var1
      );
      recovery$indy$27(this, 1, this.field_48.field_40, this.field_44, var5, (int)var11, (int)var12, 8951567753679522450L, var1);
      recovery$indy$28(this.field_46y, 8953044642457283810L, var1);
      recovery$indy$29(var3, 8952667018270212966L, var1);
      recovery$indy$30(8951857026905167968L, var1);
      recovery$indy$31(this, this.field_45.field_40, var11, var12, 8952000215683544261L, var1);
      recovery$indy$32(1, 8951894629893348778L, var1);
      recovery$indy$33(this, this.field_44.field_40, var11, var12, 8952000215683544261L, var1);
      recovery$indy$34(8952631282739290345L, var1);
      recovery$indy$35(field_43, 8952277213141658255L, var1).method_43$f633c984d8(false);
      GlStateManager.method_460$d00df7729d(0);
      GlStateManager.method_46$3ebc9ac54d(516, 0.2F);
      GlStateManager.method_42i$da8c82d5d4();
      GlStateManager.method_42O$da8c82d5d4();
      GlStateManager.method_46$da8c82d5d4();
      this.field_45.method_40$da8c82d5d4();
      recovery$indy$36(field_43, 8952277213141658255L, var1).method_43$f633c984d8(false);
   }

   public static String[] method_41$44c5829186() {
      return field_42;
   }

   private void method_40$9dded803c5(int var1, double var2, double var4) {
      GL11.glBindTexture(3553, var1);
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0, 1.0);
      GL11.glVertex2d(0.0, 0.0);
      GL11.glTexCoord2d(0.0, 0.0);
      GL11.glVertex2d(0.0, var4);
      GL11.glTexCoord2d(1.0, 0.0);
      GL11.glVertex2d(var2, var4);
      GL11.glTexCoord2d(1.0, 1.0);
      GL11.glVertex2d(var2, 0.0);
      GL11.glEnd();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void method_44$e45a9973e5(long var1) {
      augustus.recovered.modules.render.Blur_47QW var11;
      java.nio.FloatBuffer var14;
      long var3;
      label98: {
         var1 = a ^ var1;
         var3 = var1 ^ 74673392865508L;
         GL20.glUniform2f(
            recovery$indy$38(this.field_46y, recovery$indy$37(22564, 5042394224730704008L ^ var1), 2058187272846572239L, var1),
            1.0F / field_43.field_44f,
            1.0F / field_43.field_44g
         );
         int[] var10000 = recovery$indy$39(2059393796959044318L, var1);
         GL20.glUniform1i(recovery$indy$41(this.field_46y, recovery$indy$40(12133, 1817630517248458705L ^ var1), 2058187272846572239L, var1), 0);
         int[] var5 = var10000;
         double var10 = this.field_430;
         double var10001 = recovery$indy$42(this.settingSigma, var3, 2060373774208523058L, var1);
         if (var5 == null) {
            label91: {
               if (var10 == var10001) {
                  var11 = this;
                  if (var5 != null) {
                     break label91;
                  }

                  if (this.field_47 != null) {
                     if (var5 != null) {
                        GL20.glUniform1i(
                           recovery$indy$52(this.field_46y, recovery$indy$51(10287, 8852908947720861854L ^ var1), 2058187272846572239L, var1),
                           this.field_46w.limit()
                        );
                        return;
                     }

                     if (this.field_46w != null) {
                        break label98;
                     }
                  }
               }

               var11 = this;
            }

            var10 = recovery$indy$43(var11.settingSigma, var3, 2060373774208523058L, var1);
            var10001 = 1.75;
         }

         float var6 = (float)(var10 * var10001);
         this.field_47 = BufferUtils.createFloatBuffer((int)var6 + 1);
         int var7 = 0;

         label80:
         while (true) {
            Blur_47QW var12;
            if (var7 <= var6) {
               var12 = this;
            } else {
               ((Buffer)this.field_47).flip();
               var12 = this;
               if (var1 >= 0L) {
                  this.field_46w = BufferUtils.createFloatBuffer((int)var6 + 1);
                  break;
               }
            }

            do {
               var12.field_47
                  .put(recovery$indy$45(this, var7, (float)recovery$indy$44(this.settingSigma, var3, 2060373774208523058L, var1), 2058324026079163292L, var1));
               var7++;
               var10000 = var5;
               if (var1 >= 0L) {
                  if (var5 != null) {
                     break label80;
                  }

                  var10000 = var5;
               }

               if (var10000 == null) {
                  continue label80;
               }

               ((Buffer)this.field_47).flip();
               var12 = this;
            } while (var1 < 0L);

            this.field_46w = BufferUtils.createFloatBuffer((int)var6 + 1);
            break;
         }

         var7 = 0;

         label62:
         while (true) {
            if (var7 <= var6) {
               this.field_46w.put(var7);
            } else {
               var14 = this.field_46w;
               if (var1 >= 0L) {
                  break;
               }
            }

            while (true) {
               var7++;
               var10000 = var5;
               if (var1 >= 0L) {
                  if (var5 != null) {
                     return;
                  }

                  var10000 = var5;
               }

               if (var10000 == null) {
                  break;
               }

               var14 = this.field_46w;
               if (var1 >= 0L) {
                  break label62;
               }
            }
         }

         ((Buffer)var14).flip();
      }

      this.field_430 = recovery$indy$46(this.settingSigma, var3, 2060373774208523058L, var1);
      GL20.glUniform1(recovery$indy$48(this.field_46y, recovery$indy$47(11609, 1824130067661454822L ^ var1), 2058187272846572239L, var1), this.field_47);
      GL20.glUniform1(recovery$indy$50(this.field_46y, recovery$indy$49(27424, 9186509813951544213L ^ var1), 2058187272846572239L, var1), this.field_46w);
      GL20.glUniform1i(
         recovery$indy$52(this.field_46y, recovery$indy$51(10287, 8852908947720861854L ^ var1), 2058187272846572239L, var1), this.field_46w.limit()
      );
   }

   public void method_48$da8c82d5d4() {
      this.field_45.method_43$f633c984d8(false);
   }

   public static void method_49$05a886777b(String[] var0) {
      field_42 = var0;
   }

   public void method_45$e45a9973e5(long var1) {
      var1 = a ^ var1;
      recovery$indy$53(field_43, -1986980275697126689L, var1).method_43$f633c984d8(false);
   }

   public void method_47$6cb0442de7(Runnable var1, boolean var2, long var3, boolean var5) {
      long var6;
      int[] var8;
      boolean var10000;
      int[] var10001;
      label56: {
         var3 = a ^ var3;
         var6 = var3 ^ 79389740075689L;
         var8 = recovery$indy$54(-2872034275224533394L, var3);
         var10000 = var5;
         label55:
         if (var8 == null) {
            if (var5) {
               var10000 = C_47vQ.method_48$aae029aa0a();
               var10001 = var8;
               if (var3 <= 0L) {
                  break label56;
               }

               if (var8 != null) {
                  break label55;
               }

               if (var10000) {
                  return;
               }
            }

            var10000 = Display.isActive();
         }

         var10001 = var8;
      }

      if (var3 > 0L) {
         if (var10001 == null) {
            if (!var10000) {
               return;
            }

            recovery$indy$55(this, -2864333367222355809L, var3);
            var1.run();
            recovery$indy$56(this, var6, -2872434283117940385L, var3);
            var10000 = var2;
         }

         var10001 = var8;
      }

      if (var10001 == null) {
         if (!var10000) {
            return;
         }

         var10000 = Display.isActive();
      }

      if (var10000) {
         var1.run();
      }
   }

   public void method_43$d12f387002(int var1, int var2, Framebuffer var3, long var4, int var6, int var7) {
      var4 = a ^ var4;
      long var8 = var4 ^ 32666214796048L;
      var3.method_40$da8c82d5d4();
      var3.method_43$f633c984d8(false);
      GL20.glUniform2f(recovery$indy$58(this.field_46y, recovery$indy$57(32184, 7697312565640426584L ^ var4), 5029465783916012435L, var4), 1 - var1, var1);
      GL11.glBindTexture(3553, var2);
      recovery$indy$59(this.field_46y, var6, var8, var7, 5028590956553367787L, var4);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$60(this, 31, var3, -7101221794114956198L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 42408159542921L;
      this.field_46y = new ShaderProgram(recovery$indy$61(19930, 979798155555120155L ^ var4), var6, recovery$indy$62(17589, 4817525980394368366L ^ var4));
   }

   public Blur_47QW(short var1, int var2, char var3) {
      super("Blur", "Unschärfe", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 74214857382755L), new Color(170, 181, 182, 255), Category.RENDER);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 8395984721882L;
      long var8 = var4 ^ 125905480816277L;
      long var10 = var4 ^ 9669839874990L;
      long var12 = var4 ^ 49589713553852L;
      long var14 = var4 ^ 55370677536632L;
      long var10001 = var4 ^ 28951178420598L;
      int var16 = (int)((var4 ^ 28951178420598L) >>> 32);
      int var17 = (int)((var4 ^ 28951178420598L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var4 ^ 34101214902527L;
      long var21 = var4 ^ 74214857382755L;
      // Super arguments moved to the required Java constructor position.
      ModeSetting var29 = new ModeSetting(this, "ModesNew", var10, "Kawase", new String[]{"Kawase", "Gaussian", "Box"});
      long var10004 = 1353810638318415085L;
      String var23 = "Modes";
      long var24 = var6;
      ModeSetting var26 = var29;
      this.settingModesNew = var26.method_48$b8175c68a2(var24, var23);
      this.settingSigma = new NumberSetting(this, "Sigma", 7.0, var19, 4.0, 30.0, 1);
      this.settingInScreens = new BooleanSetting(this, var14, "InScreens", true);
      this.settingBlurEntities = new BooleanSetting(this, var14, "BlurEntities", false);
      long var10005 = 1356770954639399431L;
      MultiSelectSetting var30 = new MultiSelectSetting(this, "Entities", var8, C_41C.values());
      BooleanSetting var10002 = this.settingBlurEntities;
      this.settingBlurEntities.getClass();
      C_45n var31 = recovery$indy$63(var10002);
      long var10003 = 1357250670777744070L;
      C_45n var27 = var31;
      MultiSelectSetting var28 = var30;
      this.settingEntities = var28.method_40$1f2e7f1148(var27);
      var10005 = 1354316159725768386L;
      this.settingItemsToBlur = new MultiSelectSetting(this, "ItemsToBlur", var8, C_47Dm.values());
      this.field_48 = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var16, false, var17, (char)var18);
      this.field_44 = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var16, false, var17, (char)var18);
      this.field_45 = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var16, true, var17, (char)var18);
      this.field_46y = new ShaderProgram("vertex.vert", var12, "blur.glsl");
      this.field_47 = null;
      this.field_46w = null;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityLivingBase recovery$indy$5(Object var0, long var1, long var3);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(
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

   private static native void recovery$indy$16(long var0, long var2);

   private static native void recovery$indy$17(long var0, long var2);

   private static native C_47wr recovery$indy$18(Object var0, long var1, long var3);

   private static native EntityLivingBase recovery$indy$19(Object var0, long var1, long var3);

   private static native C_47Fw recovery$indy$20(C_47Pi var0, EntityLivingBase var1, C_47wr var2, Entity var3);

   private static native void recovery$indy$21(boolean var0, long var1, Object var3, long var4, long var6);

   private static native int[] recovery$indy$22(long var0, long var2);

   private static native void recovery$indy$23(Object var0, long var1, long var3);

   private static native void recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native Framebuffer recovery$indy$25(Object var0, long var1, long var3);

   private static native void recovery$indy$26(Object var0, int var1, int var2, Object var3, long var4, int var6, int var7, long var8, long var10);

   private static native void recovery$indy$27(Object var0, int var1, int var2, Object var3, long var4, int var6, int var7, long var8, long var10);

   private static native void recovery$indy$28(Object var0, long var1, long var3);

   private static native void recovery$indy$29(long var0, long var2, long var4);

   private static native void recovery$indy$30(long var0, long var2);

   private static native void recovery$indy$31(Object var0, int var1, double var2, double var4, long var6, long var8);

   private static native void recovery$indy$32(int var0, long var1, long var3);

   private static native void recovery$indy$33(Object var0, int var1, double var2, double var4, long var6, long var8);

   private static native void recovery$indy$34(long var0, long var2);

   private static native Framebuffer recovery$indy$35(Object var0, long var1, long var3);

   private static native Framebuffer recovery$indy$36(Object var0, long var1, long var3);

   private static native String recovery$indy$37(int var0, long var1);

   private static native int recovery$indy$38(Object var0, Object var1, long var2, long var4);

   private static native int[] recovery$indy$39(long var0, long var2);

   private static native String recovery$indy$40(int var0, long var1);

   private static native int recovery$indy$41(Object var0, Object var1, long var2, long var4);

   private static native double recovery$indy$42(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$43(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$44(Object var0, long var1, long var3, long var5);

   private static native float recovery$indy$45(Object var0, float var1, float var2, long var3, long var5);

   private static native double recovery$indy$46(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$47(int var0, long var1);

   private static native int recovery$indy$48(Object var0, Object var1, long var2, long var4);

   private static native String recovery$indy$49(int var0, long var1);

   private static native int recovery$indy$50(Object var0, Object var1, long var2, long var4);

   private static native String recovery$indy$51(int var0, long var1);

   private static native int recovery$indy$52(Object var0, Object var1, long var2, long var4);

   private static native Framebuffer recovery$indy$53(Object var0, long var1, long var3);

   private static native int[] recovery$indy$54(long var0, long var2);

   private static native void recovery$indy$55(Object var0, long var1, long var3);

   private static native void recovery$indy$56(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$57(int var0, long var1);

   private static native int recovery$indy$58(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$59(Object var0, float var1, long var2, float var4, long var5, long var7);

   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);

   private static native String recovery$indy$61(int var0, long var1);

   private static native String recovery$indy$62(int var0, long var1);

   private static native C_45n recovery$indy$63(BooleanSetting var0);

   private static native MethodHandle recovery$constant$64();
}
