package augustus.recovered.modules.render;

import com.google.gson.JsonObject;
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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import client.render.RenderPass;
import net.C_474F;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.C_47If;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.render.ShaderProgram;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import client.render.StencilFramebuffer;
import net.C_47g5;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tP;
import net.C_47uI;
import net.C_47vQ;
import net.C_47vi;
import net.C_47wr;
import net.C_47xB;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class Shadow_47HW extends Module implements C_47xz, C_47vi {
   public final BooleanSetting settingCustomColor;
   public final ColorSetting settingColor;
   public final NumberSetting settingSigma;
   public final BooleanSetting settingShadowEntities;
   public final MultiSelectSetting settingEntities;
   private final MultiSelectSetting settingItemsToShadow;
   private final Framebuffer field_47n;
   private final Framebuffer field_49;
   public final Framebuffer field_46;
   private ShaderProgram field_45;
   private double field_430;
   private boolean field_43a;
   private FloatBuffer field_473;
   private static String field_48;
   private static final long a = C_4f.a(947838041546449063L, -4476446624079916252L, MethodHandles.lookup().lookupClass()).a(224403323646794L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[79];
   private static final String[] f = new String[79];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(int var0, long var1);

   private static native Class b(long var0, long var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field b(Class var0, String var1, Class var2);

   private static void method_46$73f6f9977a(C_47Pi var0, EntityLivingBase var1, C_47wr var2, Entity var3, RenderPass var4) {
      long var5 = a ^ 110661648481964L;
      long var7 = var5 ^ 12893006213864L;
      double var10004 = var3.field_48Q - var3.field_48u;
      long var10006 = 6528193776612776664L;
      Minecraft var9 = field_43;
      var10004 = var3.field_48u + var10004 * var9.method_46$159e3d0645().field_49;
      double var25 = var3.field_48j - var3.field_48O;
      long var10008 = 6528193776612776664L;
      Minecraft var10 = field_43;
      double var10005 = var3.field_48O + var25 * var10.method_46$159e3d0645().field_49;
      double var10007 = var3.field_42o - var3.field_48l;
      long var10009 = 6528193776612776664L;
      Minecraft var11 = field_43;
      double var26 = var3.field_48l + var10007 * var11.method_46$159e3d0645().field_49;
      var10008 = 6523414983801533502L;
      boolean var12 = true;
      double var13 = var26;
      double var15 = var10005;
      double var17 = var10004;
      long var19 = var7;
      C_47wr var21 = var2;
      EntityLivingBase var22 = var1;
      C_47Pi var23 = var0;
      var23.method_41$cec454e236(var22, var21, var19, var17, var15, var13, var12);
      long var10000 = 6528101359925134165L;
      C_47uI.method_42q$da8c82d5d4();
   }

   public void method_46$7e0e5a02f4(long var1, short var3, ScaledResolution var4) {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 57394910077687L;
      long var10001 = var5 ^ 90889836898756L;
      int var9 = (int)((var5 ^ 90889836898756L) >>> 48);
      int var10 = (int)((var5 ^ 90889836898756L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 137741175322051L;
      long var14 = var5 ^ 95006880999691L;
      int[] var16 = recovery$indy$1(-3500974832646998036L, var5);
      short var10000 = (short) ((Display.isActive()) ? 1 : 0);
      if (var16 == null) {
         if (var10000 == 0) {
            return;
         }

         recovery$indy$3(this, recovery$indy$2(), var14, false, false, -3499899085114411040L, var5);
         GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.method_426$da8c82d5d4();
         GlStateManager.method_42p$da8c82d5d4();
         GlStateManager.method_46$3ebc9ac54d(516, 0.0F);
         var10000 = 770;
      }

      GlStateManager.method_47$df16004b03(var10000, 771);
      GlStateManager.method_42$da8c82d5d4();
      GlStateManager.method_42y$da8c82d5d4();
      GlStateManager.method_41$da8c82d5d4();
      double var17 = var4.method_44$fedcb3e4d3();
      double var19 = var4.method_40$fedcb3e4d3();
      GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
      recovery$indy$4(this.field_45, -3500379251535992476L, var5);
      recovery$indy$5(this, var7, -3500221861722314676L, var5);
      recovery$indy$6(this, (char)var9, 0, this.field_46.field_40, var10, this.field_47n, (short)var11, (int)var17, (int)var19, -3498646074532203957L, var5);
      recovery$indy$7(this, (char)var9, 1, this.field_47n.field_40, var10, this.field_49, (short)var11, (int)var17, (int)var19, -3498646074532203957L, var5);
      recovery$indy$8(this.field_45, -3499281948462736874L, var5);
      recovery$indy$9(var12, -3499138376867829528L, var5);
      recovery$indy$10(-3500743470254140020L, var5);
      recovery$indy$11(this, this.field_46.field_40, var17, var19, -3500648413778412044L, var5);
      recovery$indy$12(0, -3500632242775237696L, var5);
      recovery$indy$13(this, this.field_49.field_40, var17, var19, -3500648413778412044L, var5);
      recovery$indy$14(-3499036292132731163L, var5);
      GlStateManager.method_460$d00df7729d(0);
      GlStateManager.method_46$3ebc9ac54d(516, 0.2F);
      GlStateManager.method_42i$da8c82d5d4();
      GlStateManager.method_42O$da8c82d5d4();
      GlStateManager.method_42z$da8c82d5d4();
      this.field_46.method_40$da8c82d5d4();
      recovery$indy$15(field_43, -3499857597589928176L, var5).method_43$f633c984d8(false);
      GlStateManager.method_46$da8c82d5d4();
   }

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   public static void method_42$a7421bf54c(String var0) {
      field_48 = var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void method_42$e45a9973e5(long var1) {
      java.nio.FloatBuffer var24;
      long var3;
      long var5;
      long var7;
      long var9;
      int var11;
      int var12;
      int var13;
      label125: {
         var1 = a ^ var1;
         var3 = var1 ^ 64645590394380L;
         var5 = var1 ^ 69152753613292L;
         var7 = var1 ^ 70377342797269L;
         var9 = var1 ^ 58994169786506L;
         long var10001 = var1 ^ 40442566572861L;
         var11 = (int)((var1 ^ 40442566572861L) >>> 32);
         var12 = (int)((var1 ^ 40442566572861L) << 32 >>> 48);
         var13 = (int)(var10001 << 48 >>> 48);
         GL20.glUniform2f(
            recovery$indy$17(this.field_45, recovery$indy$16(28580, 9181746408041019570L ^ var1), -3918084003140761949L, var1),
            1.0F / field_43.field_44f,
            1.0F / field_43.field_44g
         );
         GL20.glUniform1i(recovery$indy$19(this.field_45, recovery$indy$18(10674, 1076561409910455998L ^ var1), -3918084003140761949L, var1), 0);
         int[] var10000 = recovery$indy$20(-3916660445824995037L, var1);
         float var15 = (float)recovery$indy$21(this.settingSigma, var7, -3916615777556152737L, var1);
         int[] var14 = var10000;
         GL20.glUniform1f(recovery$indy$23(this.field_45, recovery$indy$22(28159, 6892432253067262698L ^ var1), -3918084003140761949L, var1), var15);
         double var22 = this.field_430;
         double var26 = recovery$indy$24(this.settingSigma, var7, -3916615777556152737L, var1);
         if (var14 == null) {
            if (var22 == var26) {
               if (var14 != null) {
                  GL20.glUniform3f(
                     recovery$indy$33(this.field_45, recovery$indy$32(2985, 3635652767359278249L ^ var1), -3918084003140761949L, var1),
                     recovery$indy$34(this.settingColor, var5, -3916525457939723466L, var1),
                     recovery$indy$35(this.settingColor, var3, -3917653761944377100L, var1),
                     recovery$indy$36(this.settingColor, var9, -3916802397805220338L, var1)
                  );
                  return;
               }

               if (this.field_473 != null) {
                  break label125;
               }
            }

            var22 = recovery$indy$25(this.settingSigma, var7, -3916615777556152737L, var1);
            var26 = 1.75;
         }

         float var16 = (float)(var22 * var26);
         int var17 = 0;
         float var20 = -var16;

         label112: {
            label126: {
               while (true) {
                  if (var20 <= var16) {
                     var17++;
                     float var23 = var20 + 1.0F;
                     if (var1 <= 0L) {
                        var20 = var23;
                        break;
                     }

                     var20 = var23;
                     if (var14 != null) {
                        var20 = -var16;
                        break;
                     }

                     if (var14 == null) {
                        continue;
                     }
                  }

                  if (var1 <= 0L) {
                     var24 = this.field_473;
                     if (var1 > 0L) {
                        break label112;
                     }

                     var20++;
                     var10000 = var14;
                     if (var1 > 0L) {
                        if (var14 != null) {
                           return;
                        }

                        var10000 = var14;
                     }
                     break label126;
                  }

                  this.field_473 = BufferUtils.createFloatBuffer(var17);
                  var20 = -var16;
                  break;
               }

               if (var20 <= var16) {
                  this.field_473
                     .put(recovery$indy$27(this, var20, (float)recovery$indy$26(this.settingSigma, var7, -3916615777556152737L, var1), -3917966190692744625L, var1));
               } else {
                  var24 = this.field_473;
                  if (var1 > 0L) {
                     break label112;
                  }
               }

               var20++;
               var10000 = var14;
               if (var1 > 0L) {
                  if (var14 != null) {
                     return;
                  }

                  var10000 = var14;
               }
            }

            label99:
            while (true) {
               while (var10000 == null) {
                  if (var20 <= var16) {
                     this.field_473
                        .put(
                           recovery$indy$27(this, var20, (float)recovery$indy$26(this.settingSigma, var7, -3916615777556152737L, var1), -3917966190692744625L, var1)
                        );
                  } else {
                     var24 = this.field_473;
                     if (var1 > 0L) {
                        break label99;
                     }
                  }

                  var20++;
                  var10000 = var14;
                  if (var1 > 0L) {
                     if (var14 != null) {
                        return;
                     }

                     var10000 = var14;
                  }
               }

               var24 = this.field_473;
               if (var1 > 0L) {
                  break;
               }

               var20++;
               var10000 = var14;
               if (var1 > 0L) {
                  if (var14 != null) {
                     return;
                  }

                  var10000 = var14;
               }
            }
         }

         ((Buffer)var24).flip();
      }

      this.field_430 = recovery$indy$28(this.settingSigma, var7, -3916615777556152737L, var1);
      GL20.glUniform1(recovery$indy$30(this.field_45, recovery$indy$29(5475, 4684295546740474476L ^ var1), -3918084003140761949L, var1), this.field_473);
      recovery$indy$31(this.settingColor, var11, (short)var12, (char)var13, 0, -3909301473302579051L, var1);
      GL20.glUniform3f(
         recovery$indy$33(this.field_45, recovery$indy$32(2985, 3635652767359278249L ^ var1), -3918084003140761949L, var1),
         recovery$indy$34(this.settingColor, var5, -3916525457939723466L, var1),
         recovery$indy$35(this.settingColor, var3, -3917653761944377100L, var1),
         recovery$indy$36(this.settingColor, var9, -3916802397805220338L, var1)
      );
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      net.minecraft.entity.EntityLivingBase var15;
      long var4 = var2 ^ 74969343727596L;
      long var10001 = var2 ^ 140258210288593L;
      int var6 = (int)((var2 ^ 140258210288593L) >>> 48);
      int var7 = (int)((var2 ^ 140258210288593L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 109366789844811L;
      int[] var11 = recovery$indy$37(1853624767372583231L, var2);
      boolean var10000 = recovery$indy$38(this.settingShadowEntities, 1854013960372959479L, var2);
      if (var11 == null) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$39(ClientGlobals.field_48.field_44K, var4, 1846522762039265479L, var2);
      }

      label84: {
         if (var11 == null) {
            if (!var10000) {
               break label84;
            }

            var10000 = recovery$indy$40(C_47tP.VANILLA, 1854926720283226368L, var2);
         }

         if (var10000) {
            return;
         }
      }

      EntityLivingBase var12;
      label72: {
         label90: {
            var12 = recovery$indy$41(var1, 1854641842965905209L, var2);
            if (recovery$indy$42(C_47If.MYSELF, 1854565951162101886L, var2)) {
               var15 = var12;
               if (var11 != null) {
                  break label72;
               }

               if (var12 == recovery$indy$43(field_43, 1847254219397520052L, var2)) {
                  break label90;
               }
            }

            var15 = var12;
            int[] var17 = var11;
            if (var2 > 0L) {
               if (var11 == null) {
                  if (var12 == recovery$indy$44(field_43, 1847254219397520052L, var2)) {
                     return;
                  }

                  var15 = var12;
               }

               var17 = var11;
            }

            if (var17 != null) {
               break label72;
            }

            if (!recovery$indy$51(
               var15,
               recovery$indy$45(C_47If.PLAYERS, 1854565951162101886L, var2),
               recovery$indy$46(C_47If.MOBS, 1854565951162101886L, var2),
               (short)var6,
               recovery$indy$47(C_47If.ANIMALS, 1854565951162101886L, var2),
               recovery$indy$48(C_47If.VILLAGER, 1854565951162101886L, var2),
               recovery$indy$49(C_47If.ARMOR_STANDS, 1854565951162101886L, var2),
               recovery$indy$50(C_47If.INVISIBLE, 1854565951162101886L, var2),
               false,
               false,
               var7,
               true,
               (char)var8,
               1847187864769633519L,
               var2
            )) {
               return;
            }
         }

         recovery$indy$52(1847052614367175069L, var2);
         recovery$indy$53(1855251928430887026L, var2);
         var15 = recovery$indy$54(var1, 1854641842965905209L, var2);
      }

      EntityLivingBase var13 = var15;
      C_47wr var14 = recovery$indy$55(var1, 1846908297679227660L, var2);
      var10000 = var12.method_48E$aae029aa0a();
      if (var11 == null) {
         var10000 = !var10000;
      }

      recovery$indy$57(var10000, var9, recovery$indy$56(var1, var13, var14, var12), 1846570767415551358L, var2);
   }

   @Override
   public void method_41$fc5619fbe0(long var1, JsonObject var3) {
      long var4 = var1 ^ 71977172566356L;
      long var6 = var1 ^ 0L;
      int[] var8 = recovery$indy$58(6501833826193089213L, var1);
      Shadow_47HW var10000 = this;
      if (var8 == null) {
         super.method_41$fc5619fbe0(var6, var3);
         if (!recovery$indy$59(field_43, 6494219283002755275L, var1)) {
            return;
         }

         var10000 = this;
      }

      var10000.field_45 = new ShaderProgram(
         recovery$indy$60(26372, 8302490430705132436L ^ var1),
         var4,
         recovery$indy$61(this.settingCustomColor, 6501092652503890805L, var1)
            ? recovery$indy$62(26363, 3372660523988771432L ^ var1)
            : recovery$indy$63(27688, 1686801346481776821L ^ var1)
      );
   }

   public void method_40$5d20160a17(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      recovery$indy$64(field_43, -7231876875637222435L, var4).method_43$f633c984d8(true);
   }

   private float method_40$e70c882bc6(float var1, float var2) {
      return (float)(Math.exp(-(var1 * var1) / (2.0F * var2 * var2)) / Math.sqrt((Math.PI * 2) * var2 * var2));
   }

   @Override
   public void method_44$48d2807cb4(C_474F var1, JsonObject var2, boolean var3, Function var4, long var5) {
      long var7 = var5 ^ 0L;
      long var9 = var5 ^ 55201990981807L;
      int[] var11 = recovery$indy$65(-2035534499117917370L, var5);
      Shadow_47HW var10000 = this;
      if (var11 == null) {
         super.method_44$48d2807cb4(var1, var2, var3, var4, var7);
         if (!recovery$indy$66(field_43, -2027911460079619792L, var5)) {
            return;
         }

         var10000 = this;
      }

      var10000.field_45 = new ShaderProgram(
         recovery$indy$67(26372, 8302434618584324719L ^ var5),
         var9,
         recovery$indy$68(this.settingCustomColor, -2034512056069602674L, var5)
            ? recovery$indy$69(26363, 3372751516263308179L ^ var5)
            : recovery$indy$70(27688, 1686821957052387662L ^ var5)
      );
   }

   public void method_48$eae026117a(Runnable var1, long var2, boolean var4, boolean var5) {
      java.lang.Runnable var8;
      int[] var6;
      boolean var10000;
      int[] var10001;
      label56: {
         var2 = a ^ var2;
         var6 = recovery$indy$71(4780949548452920031L, var2);
         var10000 = var5;
         label55:
         if (var6 == null) {
            if (var5) {
               var10000 = C_47vQ.method_48$aae029aa0a();
               var10001 = var6;
               if (var2 < 0L) {
                  break label56;
               }

               if (var6 != null) {
                  break label55;
               }

               if (var10000) {
                  return;
               }
            }

            var10000 = Display.isActive();
         }

         var10001 = var6;
      }

      label60: {
         if (var10001 == null) {
            if (!var10000) {
               return;
            }

            this.field_46.method_43$f633c984d8(false);
            if (var2 >= 0L) {
               var8 = var1;
               if (var6 != null) {
                  break label60;
               }

               var1.run();
               recovery$indy$72(field_43, 4782070421356071459L, var2).method_43$f633c984d8(false);
            }

            var10000 = var4;
         }

         if (!var10000) {
            return;
         }

         var8 = var1;
      }

      var8.run();
   }

   public void method_48$da8c82d5d4() {
      this.field_46.method_43$f633c984d8(false);
   }

   private void method_45$9dded803c5(int var1, double var2, double var4) {
      GlStateManager.method_423$da8c82d5d4();
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

   public static String method_45$0e30dfc966() {
      return field_48;
   }

   @Override
   public void method_45$37832ba3d0(JsonObject var1, long var2) {
      long var4 = var2 ^ 135159196761518L;
      long var6 = var2 ^ 0L;
      int[] var8 = recovery$indy$73(-1819140949293457849L, var2);
      Shadow_47HW var10000 = this;
      if (var8 == null) {
         super.method_45$37832ba3d0(var1, var6);
         if (!recovery$indy$74(field_43, -1812098941886680015L, var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.field_45 = new ShaderProgram(
         recovery$indy$75(26372, 8302496506978951022L ^ var2),
         var4,
         recovery$indy$76(this.settingCustomColor, -1818681524942157937L, var2)
            ? recovery$indy$77(26363, 3372672186135469714L ^ var2)
            : recovery$indy$78(27688, 1686742613909492815L ^ var2)
      );
   }

   private static void method_43$da8c82d5d4() {
      C_47g5.method_48$0f4d4a7a6c(-2001, -2001, -2000, -2000, Color.red.getRGB());
   }

   @Override
   public JsonObject method_43$00525ca0d5(int var1, C_474F var2, JsonObject var3, char var4, Function var5, short var6) {
      long var7 = (long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48;
      long var10001 = var7 ^ 0L;
      int var9 = (int)((var7 ^ 0L) >>> 32);
      int var10 = (int)((var7 ^ 0L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var7 ^ 3311327960941L;
      JsonObject var14 = super.method_43$00525ca0d5(var9, var2, var3, (char)var10, var5, (short)var11);
      if (!recovery$indy$79(field_43, 295364502446429938L, var7)) {
         return var14;
      }

      this.field_45 = new ShaderProgram(
         recovery$indy$80(26372, 8302418324726824365L ^ var7),
         var12,
         recovery$indy$81(this.settingCustomColor, 288730818143987020L, var7)
            ? recovery$indy$82(26363, 3372732763305032785L ^ var7)
            : recovery$indy$83(27688, 1686873589866378892L ^ var7)
      );
      return var14;
   }

   public void method_43$f146e7b857(char var1, int var2, int var3, int var4, Framebuffer var5, short var6, int var7, int var8) {
      long var9 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 33910974352462L;
      var5.method_40$da8c82d5d4();
      var5.method_43$f633c984d8(false);
      GL20.glUniform2f(recovery$indy$85(this.field_45, recovery$indy$84(27664, 3702366360244416545L ^ var9), -4426108517116768880L, var9), 1 - var2, var2);
      GL11.glBindTexture(3553, var3);
      recovery$indy$86(this.field_45, var7, var11, var8, -4424922743793917638L, var9);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$87(this, 40, var3, -7101118282762755392L, var1);
      recovery$indy$88(this, 31, var3, -7101118282762755392L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 135226956760353L;
      int[] var8 = recovery$indy$89(2183714618418849480L, var4);
      Shadow_47HW var10000 = this;
      if (var8 == null) {
         label28:
         if (this.field_43a != recovery$indy$90(this.settingCustomColor, 2183611230257692416L, var4)) {
            var10000 = this;
            if (var8 == null) {
               if (recovery$indy$91(this.settingCustomColor, 2183611230257692416L, var4)) {
                  this.field_45 = new ShaderProgram(recovery$indy$92(21425, 4576579904274469726L ^ var4), var6, recovery$indy$93(28417, 4390103197580177387L ^ var4));
                  if (var8 == null) {
                     break label28;
                  }
               }

               var10000 = this;
            }

            var10000.field_45 = new ShaderProgram(recovery$indy$94(26372, 8302496433005078497L ^ var4), var6, recovery$indy$95(21850, 5630533225249609126L ^ var4));
         }

         var10000 = this;
      }

      var10000.field_43a = recovery$indy$96(this.settingCustomColor, 2183611230257692416L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 42408159542921L;
      this.field_45 = new ShaderProgram(
         recovery$indy$97(26372, 8302448488579800137L ^ var4),
         var6,
         recovery$indy$98(this.settingCustomColor, 2730838016806356136L, var4)
            ? recovery$indy$99(26363, 3372772839908187573L ^ var4)
            : recovery$indy$100(27688, 1686843271427856232L ^ var4)
      );
   }

   public Shadow_47HW(long var1) {
      super("Shadow", "Schatten", ((a ^ var1) ^ 28510124171856L), new Color(170, 181, 182, 255), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 44065803562918L;
      long var5 = var1 ^ 106769006144374L;
      long var7 = var1 ^ 131440908316815L;
      long var9 = var1 ^ 115219014893131L;
      long var10001 = var1 ^ 71218096003141L;
      int var11 = (int)((var1 ^ 71218096003141L) >>> 32);
      int var12 = (int)((var1 ^ 71218096003141L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var1 ^ 13584241458798L;
      long var16 = var1 ^ 76496440394188L;
      long var18 = var1 ^ 28510124171856L;
      // Super arguments moved to the required Java constructor position.
      this.settingCustomColor = new BooleanSetting(this, var9, "CustomColor", true);
      ColorSetting var28 = new ColorSetting(var14, this, "Color", new Color(0, 0, 0, 1));
      BooleanSetting var10002 = this.settingCustomColor;
      this.settingCustomColor.getClass();
      C_45n var10003 = recovery$indy$101(var10002);
      long var10004 = -1443371929806132448L;
      C_45n var20 = var10003;
      long var21 = var5;
      ColorSetting var23 = var28;
      this.settingColor = (ColorSetting)var23.method_43$780fd62a21(var21, var20);
      this.settingSigma = new NumberSetting(this, "Sigma", 5.0, var16, 0.0, 30.0, 1);
      this.settingShadowEntities = new BooleanSetting(this, var9, "ShadowEntities", false);
      long var10005 = -1448663182476257148L;
      MultiSelectSetting var29 = new MultiSelectSetting(this, "Entities", var3, C_47If.values());
      var10002 = this.settingShadowEntities;
      this.settingShadowEntities.getClass();
      C_45n var31 = recovery$indy$102(var10002);
      long var32 = -1448133349367156960L;
      C_45n var24 = var31;
      MultiSelectSetting var25 = var29;
      this.settingEntities = var25.method_40$1f2e7f1148(var24);
      var10005 = -1448041290484981041L;
      this.settingItemsToShadow = new MultiSelectSetting(this, "ItemsToShadow", var3, C_47xB.values());
      this.field_47n = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var11, false, var12, (char)var13);
      this.field_49 = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var11, false, var12, (char)var13);
      this.field_46 = new StencilFramebuffer(field_43.field_44f, field_43.field_44g, var11, true, var12, (char)var13);
      this.field_473 = null;
      var10005 = -1449117087777764690L;
      BooleanSetting var26 = this.settingCustomColor;
      this.field_45 = new ShaderProgram("vertex.vert", var7, var26.method_49$aae029aa0a() ? "alphaBlur2.glsl" : "alphaBlur.glsl");
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native Runnable recovery$indy$2();

   private static native void recovery$indy$3(Object var0, Object var1, long var2, boolean var4, boolean var5, long var6, long var8);

   private static native void recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$6(
      Object var0, char var1, int var2, int var3, int var4, Object var5, short var6, int var7, int var8, long var9, long var11
   );

   private static native void recovery$indy$7(
      Object var0, char var1, int var2, int var3, int var4, Object var5, short var6, int var7, int var8, long var9, long var11
   );

   private static native void recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(long var0, long var2, long var4);

   private static native void recovery$indy$10(long var0, long var2);

   private static native void recovery$indy$11(Object var0, int var1, double var2, double var4, long var6, long var8);

   private static native void recovery$indy$12(int var0, long var1, long var3);

   private static native void recovery$indy$13(Object var0, int var1, double var2, double var4, long var6, long var8);

   private static native void recovery$indy$14(long var0, long var2);

   private static native Framebuffer recovery$indy$15(Object var0, long var1, long var3);

   private static native String recovery$indy$16(int var0, long var1);

   private static native int recovery$indy$17(Object var0, Object var1, long var2, long var4);

   private static native String recovery$indy$18(int var0, long var1);

   private static native int recovery$indy$19(Object var0, Object var1, long var2, long var4);

   private static native int[] recovery$indy$20(long var0, long var2);

   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$22(int var0, long var1);

   private static native int recovery$indy$23(Object var0, Object var1, long var2, long var4);

   private static native double recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$25(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$26(Object var0, long var1, long var3, long var5);

   private static native float recovery$indy$27(Object var0, float var1, float var2, long var3, long var5);

   private static native double recovery$indy$28(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$29(int var0, long var1);

   private static native int recovery$indy$30(Object var0, Object var1, long var2, long var4);

   private static native int recovery$indy$31(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native String recovery$indy$32(int var0, long var1);

   private static native int recovery$indy$33(Object var0, Object var1, long var2, long var4);

   private static native float recovery$indy$34(Object var0, long var1, long var3, long var5);

   private static native float recovery$indy$35(Object var0, long var1, long var3, long var5);

   private static native float recovery$indy$36(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$37(long var0, long var2);

   private static native boolean recovery$indy$38(Object var0, long var1, long var3);

   private static native boolean recovery$indy$39(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$40(Object var0, long var1, long var3);

   private static native EntityLivingBase recovery$indy$41(Object var0, long var1, long var3);

   private static native boolean recovery$indy$42(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);

   private static native boolean recovery$indy$45(Object var0, long var1, long var3);

   private static native boolean recovery$indy$46(Object var0, long var1, long var3);

   private static native boolean recovery$indy$47(Object var0, long var1, long var3);

   private static native boolean recovery$indy$48(Object var0, long var1, long var3);

   private static native boolean recovery$indy$49(Object var0, long var1, long var3);

   private static native boolean recovery$indy$50(Object var0, long var1, long var3);

   private static native boolean recovery$indy$51(
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

   private static native void recovery$indy$52(long var0, long var2);

   private static native void recovery$indy$53(long var0, long var2);

   private static native EntityLivingBase recovery$indy$54(Object var0, long var1, long var3);

   private static native C_47wr recovery$indy$55(Object var0, long var1, long var3);

   private static native C_47Fw recovery$indy$56(C_47Pi var0, EntityLivingBase var1, C_47wr var2, Entity var3);

   private static native void recovery$indy$57(boolean var0, long var1, Object var3, long var4, long var6);

   private static native int[] recovery$indy$58(long var0, long var2);

   private static native boolean recovery$indy$59(Object var0, long var1, long var3);

   private static native String recovery$indy$60(int var0, long var1);

   private static native boolean recovery$indy$61(Object var0, long var1, long var3);

   private static native String recovery$indy$62(int var0, long var1);

   private static native String recovery$indy$63(int var0, long var1);

   private static native Framebuffer recovery$indy$64(Object var0, long var1, long var3);

   private static native int[] recovery$indy$65(long var0, long var2);

   private static native boolean recovery$indy$66(Object var0, long var1, long var3);

   private static native String recovery$indy$67(int var0, long var1);

   private static native boolean recovery$indy$68(Object var0, long var1, long var3);

   private static native String recovery$indy$69(int var0, long var1);

   private static native String recovery$indy$70(int var0, long var1);

   private static native int[] recovery$indy$71(long var0, long var2);

   private static native Framebuffer recovery$indy$72(Object var0, long var1, long var3);

   private static native int[] recovery$indy$73(long var0, long var2);

   private static native boolean recovery$indy$74(Object var0, long var1, long var3);

   private static native String recovery$indy$75(int var0, long var1);

   private static native boolean recovery$indy$76(Object var0, long var1, long var3);

   private static native String recovery$indy$77(int var0, long var1);

   private static native String recovery$indy$78(int var0, long var1);

   private static native boolean recovery$indy$79(Object var0, long var1, long var3);

   private static native String recovery$indy$80(int var0, long var1);

   private static native boolean recovery$indy$81(Object var0, long var1, long var3);

   private static native String recovery$indy$82(int var0, long var1);

   private static native String recovery$indy$83(int var0, long var1);

   private static native String recovery$indy$84(int var0, long var1);

   private static native int recovery$indy$85(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$86(Object var0, float var1, long var2, float var4, long var5, long var7);

   private static native void recovery$indy$87(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$88(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$89(long var0, long var2);

   private static native boolean recovery$indy$90(Object var0, long var1, long var3);

   private static native boolean recovery$indy$91(Object var0, long var1, long var3);

   private static native String recovery$indy$92(int var0, long var1);

   private static native String recovery$indy$93(int var0, long var1);

   private static native String recovery$indy$94(int var0, long var1);

   private static native String recovery$indy$95(int var0, long var1);

   private static native boolean recovery$indy$96(Object var0, long var1, long var3);

   private static native String recovery$indy$97(int var0, long var1);

   private static native boolean recovery$indy$98(Object var0, long var1, long var3);

   private static native String recovery$indy$99(int var0, long var1);

   private static native String recovery$indy$100(int var0, long var1);

   private static native C_45n recovery$indy$101(BooleanSetting var0);

   private static native C_45n recovery$indy$102(BooleanSetting var0);

   private static native MethodHandle recovery$constant$103();
}
