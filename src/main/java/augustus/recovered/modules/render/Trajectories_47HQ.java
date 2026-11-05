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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_41l;
import net.C_42R;
import net.C_435;
import net.C_43B;
import net.C_43R;
import net.C_43q;
import net.C_43r;
import net.C_43u;
import net.C_43z;
import net.C_45n;
import net.C_45o;
import client.render.RenderPass;
import net.C_477r;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.C_47Gj;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47d4;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_484;
import net.C_49h;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Trajectories_47HQ extends client.module.Module implements client.event.RenderListener {
    public final client.setting.BooleanSetting settingCalculateColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingItems = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

   private void method_46$6324b20301(int var1, C_47Ij var2, RenderPass var3) {
      long var4 = a ^ 69348981531148L;
      long var6 = var4 ^ 27623824553521L;
      long var8 = var4 ^ 73415749564433L;
      long var10 = var4 ^ 77126461370969L;
      C_41l var13 = C_41l.method_40$2abe131c67();
      C_47Gj var14 = var13.method_41$4db9b92eb8();
      var14.method_44$dc4d91c0c9(3, C_49h.field_47y);
      long var10000 = -3135331678465527148L;
      int[] var47 = AntiStrike_47Qa.method_42$d4d28024c9();
      ShaderOptions var10001 = this.field_40;
      long var10006 = -3141370690063527645L;
      long var20 = var6;
      int var22 = var1;
      RenderPass var23 = var3;
      int var10004 = C_47TX.method_40$6b468acafc(var23, var22, var20);
      long var10005 = -3136653563743218016L;
      int var24 = var10004;
      long var25 = var8;
      RenderPass var27 = var3;
      ShaderOptions var28 = var10001;
      int var15 = var28.method_40$d68b376f5b(var27, var25, var24);
      int[] var12 = var47;
      RenderUtils.method_40$3ebc9ac54d(var15, 0.85F);
      Iterator var16 = this.field_43h.iterator();

      while (true) {
         if (var16.hasNext()) {
            C_47tf var17 = (C_47tf)var16.next();
            double var52 = (float)var17.field_40;
            long var10003 = -3136080361455736105L;
            Minecraft var29 = field_43;
            double var53 = var52 - var29.method_45$17391f161a().method_41$fedcb3e4d3();
            double var10002 = (float)var17.field_41;
            long var65 = -3136080361455736105L;
            Minecraft var30 = field_43;
            var10002 -= var30.method_45$17391f161a().method_49$fedcb3e4d3();
            double var61 = (float)var17.field_47;
            var10005 = -3136080361455736105L;
            Minecraft var31 = field_43;
            var14.method_42$dbb7a02e02(var53, var10002, var61 - var31.method_45$17391f161a().method_45$fedcb3e4d3()).method_42$da8c82d5d4();
            if (var12 != null) {
               break;
            }

            if (var12 == null) {
               continue;
            }
         }

         var13.method_40$da8c82d5d4();
         break;
      }

      C_47Ij var48 = var2;
      if (var12 == null) {
         if (var2 == null) {
            return;
         }

         var48 = var2;
      }

      if (var12 == null) {
         if (var48.field_49 != C_47Az.ENTITY) {
            var10006 = -3142019953227011105L;
            C_41l var38 = var13;
            C_47Ij var39 = var2;
            int var40 = var15;
            long var41 = var10;
            C_47Gj var43 = var14;
            Trajectories_47HQ var44 = this;
            var44.method_48$c76563f154(var43, var41, var40, var39, var38);
            return;
         }

         var48 = var2;
      }

      Entity var45 = var48.field_47;
      double var54 = var45.field_48Q - var45.field_48u;
      long var62 = -3135868988195801106L;
      Minecraft var32 = field_43;
      double var49 = var45.field_48u + var54 * var32.method_46$159e3d0645().field_49;
      long var58 = -3136080361455736105L;
      Minecraft var33 = field_43;
      float var46 = (float)(var49 - var33.method_45$17391f161a().method_41$fedcb3e4d3());
      double var55 = var45.field_48j - var45.field_48O;
      var62 = -3135868988195801106L;
      Minecraft var34 = field_43;
      double var50 = var45.field_48O + var55 * var34.method_46$159e3d0645().field_49;
      var58 = -3136080361455736105L;
      Minecraft var35 = field_43;
      float var18 = (float)(var50 - var35.method_45$17391f161a().method_49$fedcb3e4d3());
      double var56 = var45.field_42o - var45.field_48l;
      var62 = -3135868988195801106L;
      Minecraft var36 = field_43;
      double var51 = var45.field_48l + var56 * var36.method_46$159e3d0645().field_49;
      var58 = -3136080361455736105L;
      Minecraft var37 = field_43;
      float var19 = (float)(var51 - var37.method_45$17391f161a().method_45$fedcb3e4d3());
      RenderUtils.method_40$3ebc9ac54d(var15, 0.3F);
      RenderUtils.method_43$3e42f10208(var45, var46, var18, var19, var45.field_48w / 1.5F, var45.field_48);
      GL11.glLineWidth(2.5F);
      RenderUtils.method_40$3ebc9ac54d(var15, 1.0F);
      RenderUtils.method_41$3e42f10208(var45, var46, var18, var19, var45.field_48w / 1.5F, var45.field_48);
   }





    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_48$c76563f154(C_47Gj var1, long var2, int var4, C_47Ij var5, C_41l var6) {
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      label112: {
         var2 = a ^ var2;
         RenderUtils.method_40$3ebc9ac54d(var4, 0.3F);
         C_47tf var8 = var5.field_45;
         int[] var10000 = recovery$indy$1(-3432252877930596681L, var2);
         C_484 var9 = var5.field_40;
         int[] var7 = var10000;
         var10 = (float)(var8.field_40 - recovery$indy$2(field_43, -3433634329862852876L, var2).method_41$fedcb3e4d3());
         var11 = (float)(var8.field_40 - recovery$indy$3(field_43, -3433634329862852876L, var2).method_41$fedcb3e4d3());
         var12 = (float)(var8.field_41 - recovery$indy$4(field_43, -3433634329862852876L, var2).method_49$fedcb3e4d3());
         var13 = (float)(var8.field_41 - recovery$indy$5(field_43, -3433634329862852876L, var2).method_49$fedcb3e4d3());
         var14 = (float)(var8.field_47 - recovery$indy$6(field_43, -3433634329862852876L, var2).method_45$fedcb3e4d3());
         var15 = (float)(var8.field_47 - recovery$indy$7(field_43, -3433634329862852876L, var2).method_45$fedcb3e4d3());
         C_484 var17 = var9;
         C_484 var10001 = C_484.SOUTH;
         if (var7 == null) {
            if (var9 == C_484.SOUTH) {
               var10 -= 0.4F;
               var11 += 0.4F;
               var12 -= 0.4F;
               var13 += 0.4F;
               var15 += 0.02F;
               var14 += 0.05F;
               if (var2 <= 0L) {
                  return;
               }

               if (var7 == null) {
                  break label112;
               }
            }

            var17 = var9;
            var10001 = C_484.NORTH;
         }

         int[] var10002 = var7;
         if (var2 >= 0L) {
            if (var7 == null) {
               if (var17 == var10001) {
                  var10 -= 0.4F;
                  var11 += 0.4F;
                  var12 -= 0.4F;
                  var13 += 0.4F;
                  var15 -= 0.02F;
                  var14 -= 0.05F;
                  if (var2 < 0L) {
                     return;
                  }

                  if (var7 == null) {
                     break label112;
                  }
               }

               var17 = var9;
               var10001 = C_484.EAST;
            }

            var10002 = var7;
         }

         if (var2 > 0L) {
            if (var10002 == null) {
               if (var17 == var10001) {
                  var11 += 0.02F;
                  var10 += 0.05F;
                  var12 -= 0.4F;
                  var13 += 0.4F;
                  var14 -= 0.4F;
                  var15 += 0.4F;
                  if (var2 < 0L) {
                     return;
                  }

                  if (var7 == null) {
                     break label112;
                  }
               }

               var17 = var9;
               var10001 = C_484.WEST;
            }

            var10002 = var7;
         }

         if (var2 >= 0L) {
            if (var10002 == null) {
               if (var17 == var10001) {
                  var11 -= 0.02F;
                  var10 -= 0.05F;
                  var12 -= 0.4F;
                  var13 += 0.4F;
                  var14 -= 0.4F;
                  var15 += 0.4F;
                  if (var2 <= 0L) {
                     return;
                  }

                  if (var7 == null) {
                     break label112;
                  }
               }

               var17 = var9;
               var10001 = C_484.UP;
            }

            var10002 = var7;
         }

         if (var10002 == null) {
            if (var17 == var10001) {
               var10 -= 0.4F;
               var11 += 0.4F;
               var13 += 0.02F;
               var12 += 0.05F;
               var14 -= 0.4F;
               var15 += 0.4F;
               if (var2 < 0L) {
                  return;
               }

               if (var7 == null) {
                  break label112;
               }
            }

            var17 = var9;
            var10001 = C_484.DOWN;
         }

         if (var17 == var10001) {
            var10 -= 0.4F;
            var11 += 0.4F;
            var13 -= 0.02F;
            var12 -= 0.05F;
            var14 -= 0.4F;
            var15 += 0.4F;
         }
      }

      var1.method_44$dc4d91c0c9(7, C_49h.field_47y);
      var1.method_42$dbb7a02e02(var10, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var14).method_42$da8c82d5d4();
      var1.method_42$da8c82d5d4();
      var6.method_40$da8c82d5d4();
      GL11.glLineWidth(2.0F);
      var1.method_44$dc4d91c0c9(3, C_49h.field_47y);
      var1.method_42$dbb7a02e02(var10, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var12, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var15).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var11, var13, var14).method_42$da8c82d5d4();
      var1.method_42$dbb7a02e02(var10, var13, var14).method_42$da8c82d5d4();
      var1.method_42$da8c82d5d4();
      var6.method_40$da8c82d5d4();
   }








   public void method_48$ac92464403(C_47Ij var1, long var2) {
      long var4;
      long var8;
      long var12;
      long var14;
      int var20;
      label25: {
         var2 = a ^ var2;
         var4 = var2 ^ 55780698070624L;
         long var6 = var2 ^ 72584829526315L;
         var8 = var2 ^ 126104862800968L;
         long var10 = var2 ^ 19494213743543L;
         var12 = var2 ^ 98818013449114L;
         var14 = var2 ^ 68731456330665L;
         long var10001 = var2 ^ 42647895809987L;
         int var16 = (int)((var2 ^ 42647895809987L) >>> 32);
         int var17 = (int)((var2 ^ 42647895809987L) << 32 >>> 48);
         int var18 = (int)(var10001 << 48 >>> 48);
         RenderUtils.method_42$da8c82d5d4();
         GL11.glLineWidth((float)recovery$indy$8(this.settingLineWidth, var6, -5955317950626508832L, var2) / 2.0F);
         int[] var10000 = recovery$indy$9(-5955408167319958605L, var2);
         GlStateManager.method_44$42cf812248(770, 771, 1, 0);
         int[] var19 = var10000;
         int var26 = (int) ((recovery$indy$10(this.settingCalculateColor, -5954974113877139853L, var2)) ? 1 : 0);
         if (var19 == null) {
            if (var26 != 0) {
               C_47tf var21 = (C_47tf)this.field_43h.get(this.field_43h.size() - 1);
               double var22 = Math.min(
                     Math.max(recovery$indy$11(field_43, -5962494233408018655L, var2).method_49$4b58f7ab41(var21.field_40, var21.field_41, var21.field_47), 6.0),
                     36.0
                  )
                  - 6.0;
               float[] var24 = recovery$indy$13(
                  recovery$indy$12(this.settingColor, var16, (short)var17, (char)var18, 0, -5954200426030912794L, var2), var10, -5954387444445341579L, var2
               );
               var20 = Color.HSBtoRGB((float)(0.011415525F * var22), var24[1], var24[2]);
               if (var2 < 0L) {
                  return;
               }

               if (var19 == null) {
                  break label25;
               }
            }

            var26 = recovery$indy$14(this.settingColor, var16, (short)var17, (char)var18, 0, -5954200426030912794L, var2);
         }

         var20 = var26;
      }

      recovery$indy$17(
         recovery$indy$15(this.field_40, var4, -5954666367278181569L, var2),
         recovery$indy$16(this.field_40, var12, -5954258824663236631L, var2),
         var8,
         -5955168731684364553L,
         var2
      );
      recovery$indy$19(false, var14, recovery$indy$18(this, var20, var1), -5961861532096237402L, var2);
      GL11.glLineWidth(1.0F);
      GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
      RenderUtils.method_43$da8c82d5d4();
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 33860854381713L;
      long var10000 = 5395366961772424201L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 5395801504270072265L;
      BooleanSetting var4 = this.settingCalculateColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void onRender3D(long var1, float var3) {
        boolean var40;
        client.module.ModuleManager var43;
        net.C_47S6 var44;
        int[] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
      long var4 = var1 ^ 122725729730224L;
      long var6 = var1 ^ 123592227444553L;
      long var8 = var1 ^ 24829609159848L;
      long var10 = var1 ^ 17743462132676L;
      long var10001 = var1 ^ 41629115021592L;
      int var12 = (int)((var1 ^ 41629115021592L) >>> 32);
      int var13 = (int)((var1 ^ 41629115021592L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      int var15 = (int)((var1 ^ 91970941628948L) >>> 48);
      long var16 = (var1 ^ 91970941628948L) << 16 >>> 16;
      var10001 = var1 ^ 89302874071198L;
      int var18 = (int)((var1 ^ 89302874071198L) >>> 48);
      int var19 = (int)((var1 ^ 89302874071198L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var1 ^ 138504552156016L;
      this.field_43h.clear();
      int[] var10000 = (int[])recovery$indy$flow$255(8134720935884346893L, var1);
      net.C_47rf var24 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$257(field_43, 8142087363478731423L, var1)).method_48$ac4db64966();
      int[] var23 = var10000;
      net.C_47Ij var25 = null;
      net.C_47rf var39 = var24;
      if (var23 == null) {
         if (var24 == null) {
            return;
         }

         var39 = var24;
      }

      net.C_43r var26;
      label341: {
         label331: {
            var26 = var39.method_48$dbd570a038();
            var40 = var26 instanceof C_45o;
            label330:
            if (var23 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$262(net.C_47d4.SNOW_BALL, 8134421092156879120L, var1);
                  var51 = var23;
                  if (var1 < 0L) {
                     break label331;
                  }

                  if (var23 != null) {
                     break label330;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26 instanceof C_43R;
            }

            var51 = var23;
         }

         label318: {
            label317:
            if (var51 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$265(net.C_47d4.EGG, 8134421092156879120L, var1);
                  var52 = var23;
                  if (var1 < 0L) {
                     break label318;
                  }

                  if (var23 != null) {
                     break label317;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26 instanceof C_43u;
            }

            var52 = var23;
         }

         label305: {
            label304:
            if (var52 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$268(net.C_47d4.BOW, 8134421092156879120L, var1);
                  var53 = var23;
                  if (var1 <= 0L) {
                     break label305;
                  }

                  if (var23 != null) {
                     break label304;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26 instanceof C_43B;
            }

            var53 = var23;
         }

         label292: {
            label291:
            if (var53 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$271(net.C_47d4.ENDER_PEARL, 8134421092156879120L, var1);
                  var54 = var23;
                  if (var1 < 0L) {
                     break label292;
                  }

                  if (var23 != null) {
                     break label291;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26.equals(net.C_42R.field_41C);
            }

            var54 = var23;
         }

         label279: {
            label278:
            if (var54 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$275(net.C_47d4.XP_BOTTLE, 8134421092156879120L, var1);
                  var55 = var23;
                  if (var1 <= 0L) {
                     break label279;
                  }

                  if (var23 != null) {
                     break label278;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26.equals(net.C_42R.field_47E);
            }

            var55 = var23;
         }

         label266: {
            label265:
            if (var55 == null) {
               if (var40) {
                  var40 = net.C_43z.method_40$9a6ad9dfe5(var24.method_40$8abf5c6871());
                  if (var23 != null) {
                     break label265;
                  }

                  if (var40) {
                     var40 = recovery$indy$flow$281(net.C_47d4.POTION, 8134421092156879120L, var1);
                     var56 = var23;
                     if (var1 < 0L) {
                        break label266;
                     }

                     if (var23 != null) {
                        break label265;
                     }

                     if (var40) {
                        break label341;
                     }
                  }
               }

               var40 = var26 instanceof C_435;
            }

            var56 = var23;
         }

         label250: {
            label249:
            if (var56 == null) {
               if (var40) {
                  var40 = recovery$indy$flow$284(net.C_47d4.ROD, 8134421092156879120L, var1);
                  var57 = var23;
                  if (var1 <= 0L) {
                     break label250;
                  }

                  if (var23 != null) {
                     break label249;
                  }

                  if (var40) {
                     break label341;
                  }
               }

               var40 = var26 instanceof C_43q;
            }

            var57 = var23;
         }

         if (var57 == null) {
            if (!var40) {
               return;
            }

            var40 = recovery$indy$flow$287(net.C_47d4.FIREBALL, 8134421092156879120L, var1);
         }

         if (!var40) {
            return;
         }
      }

      net.C_47Kr var27;
      label349: {
         var27 = new net.C_47Kr();
         recovery$indy$flow$292(
            var27,
            (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$291(field_43, 8142087363478731423L, var1),
            var12,
            (short)var13,
            (short)var14,
            var24,
            8134906830057176779L,
            var1
         );
         boolean var41 = var26 instanceof C_43u;
         int[] var58 = var23;
         if (var1 >= 0L) {
            if (var23 == null) {
               if (var41) {
                  this.field_43h = (java.util.ArrayList)recovery$indy$flow$294(var27, var6, 300, 8133714722871021770L, var1);
                  if (var23 == null) {
                     break label349;
                  }
               }

               var41 = var26 instanceof C_435;
            }

            var58 = var23;
         }

         if (var58 == null) {
            if (var41) {
               this.field_43h = (java.util.ArrayList)recovery$indy$flow$297(var27, var21, 300, 8142461201020185649L, var1);
               if (var23 == null) {
                  break label349;
               }
            }

            var41 = var26 instanceof C_43q;
         }

         if (!var41) {
            this.field_43h = (java.util.ArrayList)recovery$indy$flow$415(var27, 300, var8, 8134561146750786566L, var1);
         } else {
            label226: {
               double var28;
               double var30;
               double var32;
               float var34;
               label225: {
                  label224: {
                     label350: {
                        this.field_43h = new java.util.ArrayList();
                        var28 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$304(field_43, 8142087363478731423L, var1)).field_48u
                           + (
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$307(field_43, 8142087363478731423L, var1)).field_48Q
                                    - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$310(field_43, 8142087363478731423L, var1)).field_48u
                              )
                              * ((net.C_40X)recovery$indy$flow$313(field_43, 8134171772438532983L, var1)).field_49;
                        var30 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$316(field_43, 8142087363478731423L, var1)).field_48O
                           + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$319(field_43, 8142087363478731423L, var1)).method_41$bc607678b6()
                           + (
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$322(field_43, 8142087363478731423L, var1)).field_48j
                                    - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$325(field_43, 8142087363478731423L, var1)).field_48O
                              )
                              * ((net.C_40X)recovery$indy$flow$328(field_43, 8134171772438532983L, var1)).field_49;
                        var32 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$331(field_43, 8142087363478731423L, var1)).field_48l
                           + (
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$334(field_43, 8142087363478731423L, var1)).field_42o
                                    - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$337(field_43, 8142087363478731423L, var1)).field_48l
                              )
                              * ((net.C_40X)recovery$indy$flow$340(field_43, 8134171772438532983L, var1)).field_49;
                        var34 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$343(field_43, 8142087363478731423L, var1)).field_48p
                           + (
                                 ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$346(field_43, 8142087363478731423L, var1)).field_48h
                                    - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$349(field_43, 8142087363478731423L, var1)).field_48p
                              )
                              * ((net.C_40X)recovery$indy$flow$352(field_43, 8134171772438532983L, var1)).field_49;
                        boolean var42 = recovery$indy$flow$356(client.ClientGlobals.field_48.field_44i, var4, 8141902115904573287L, var1);
                        int[] var59 = var23;
                        if (var1 >= 0L) {
                           if (var23 == null) {
                              label218: {
                                 if (var42) {
                                    var43 = client.ClientGlobals.field_48;
                                    if (var23 != null) {
                                       break label218;
                                    }

                                    if ((net.minecraft.entity.EntityLivingBase)recovery$indy$flow$359(client.ClientGlobals.field_48.field_44i, 8142260651862195594L, var1) != null) {
                                       var44 = client.ClientGlobals.field_46;
                                       if (var23 != null) {
                                          break label224;
                                       }

                                       if (recovery$indy$flow$363(
                                          client.ClientGlobals.field_46, (char)var18, var19, client.ClientGlobals.field_48.field_44i, (char)var20, 8133992028802792995L, var1
                                       )) {
                                          break label350;
                                       }
                                    }
                                 }

                                 var43 = client.ClientGlobals.field_48;
                              }

                              var42 = recovery$indy$flow$366(var43.field_46k, var4, 8141902115904573287L, var1);
                           }

                           var59 = var23;
                        }

                        if (var59 != null) {
                           break label226;
                        }

                        if (!var42 || (net.minecraft.entity.EntityLivingBase)recovery$indy$flow$369(client.ClientGlobals.field_48.field_46k, 8134075716719530227L, var1) == null) {
                           break label225;
                        }

                        boolean var45 = recovery$indy$flow$373(
                           client.ClientGlobals.field_46, (char)var18, var19, client.ClientGlobals.field_48.field_46k, (char)var20, 8133992028802792995L, var1
                        );
                        if (var23 != null) {
                           break label226;
                        }

                        if (!var45) {
                           break label225;
                        }
                     }

                     var44 = client.ClientGlobals.field_46;
                  }

                  var34 = ((net.C_477r)recovery$indy$flow$375(var44, 8134062082201891130L, var1)).field_44
                     + (
                           ((net.C_477r)recovery$indy$flow$378(client.ClientGlobals.field_46, 8142355575344702209L, var1)).field_44
                              - ((net.C_477r)recovery$indy$flow$381(client.ClientGlobals.field_46, 8134062082201891130L, var1)).field_44
                        )
                        * ((net.C_40X)recovery$indy$flow$384(field_43, 8134171772438532983L, var1)).field_49;
               }

               var28 += net.C_47sk.method_40$f6c4892e39(var34 / 180.0F * (float) Math.PI) * 0.16F * -1.0F;
               var30 -= 0.1F;
               var32 += net.C_47sk.method_47$f6c4892e39(var34 / 180.0F * (float) Math.PI) * 0.16F * -1.0F;
               this.field_43h.add(new net.C_47tf(var28, var30, var32));
            }

            net.C_47Ij var35;
            label193: {
               label192: {
                  var35 = (net.C_47Ij)recovery$indy$flow$398(
                     var3,
                     (short)var15,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$393(field_43, 8142087363478731423L, var1)).field_48h,
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$396(field_43, 8142087363478731423L, var1)).field_48z,
                     200.0,
                     var16,
                     200.0,
                     0.0,
                     8141859086196165046L,
                     var1
                  );
                  var10000 = var23;
                  if (var1 >= 0L) {
                     if (var23 == null) {
                        label353: {
                           net.C_47Ij var47 = var35;
                           if (var1 > 0L) {
                              if (var35 == null) {
                                 break label353;
                              }

                              var47 = var35;
                           }

                           if (var23 == null) {
                              if (var47.field_49 == net.C_47Az.MISS) {
                                 break label353;
                              }

                              var47 = var35;
                           }

                           if (var47.field_45 != null) {
                              break label192;
                           }
                        }

                        this.field_43h
                           .add(
                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$404(field_43, 8142087363478731423L, var1))
                                 .method_42$41b79b67a0(var3)
                                 .method_40$8f851fab6c(
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$407(field_43, 8142087363478731423L, var1))
                                       .method_47$41b79b67a0(var3)
                                       .method_46$90d20bf996(200.0)
                                 )
                           );
                     }

                     var10000 = var23;
                  }

                  if (var10000 == null) {
                     break label193;
                  }
               }

               this.field_43h.add(var35.field_45);
            }

            var27 = null;
            var25 = var35;
         }
      }

      label159: {
         net.C_47Kr var48 = var27;
         if (var23 == null) {
            if (var27 == null) {
               break label159;
            }

            var48 = var27;
         }

         var25 = (net.C_47Ij)recovery$indy$flow$417(var48, 8141675427777377733L, var1);
      }

      Trajectories_47HQ var49 = this;
      if (var23 == null) {
         if (this.field_43h.size() <= 1) {
            return;
         }

         var49 = this;
      }

      recovery$indy$flow$420(var49, var25, var10, 8142436899808850863L, var1);
   }









   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$69(this, 32, var3, -7101304365003390467L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Trajectories_47HQ(long a0) {
        super((java.lang.String) ("Trajectories"),(java.lang.String) ("Flugbahnen"),(long) (((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 102950155888857L)),(java.awt.Color) (new java.awt.Color((int) (29),(int) (202),(int) (103))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 119143101310255L);
        long constructorKey4 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 41046667256319L);
        long constructorKey5 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 77508778411104L);
        long constructorKey6 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 62903973574445L);
        long constructorKey7 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 48951635899586L);
        long constructorKey8 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 79255690589415L);
        long constructorKey9 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 2049832012613L);
        long constructorKey10 = ((augustus.recovered.modules.render.Trajectories_47HQ.a ^ a0) ^ 139174831013138L);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey7, "CalculateColor", false);
        recovery$indy$flow$426(this, initialized11);
        java.awt.Color initialized12 = new java.awt.Color(21, 121, 230);
        client.setting.ColorSetting initialized13 = new client.setting.ColorSetting(constructorKey8, this, "Color", initialized12);
        java.lang.Object initialValue14 = recovery$indy$flow$431(this);
        java.lang.Object initialValue15 = initialValue14;
        long initialValue16 = constructorKey4;
        client.setting.ColorSetting initialValue17 = initialized13;
        java.lang.Object initialValue18 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue19 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue20 = recovery$indy$flow$434(initialValue18, initialValue16, initialValue19);
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue20))))));
        recovery$indy$flow$436(this, initialValue21);
        client.setting.NumberSetting initialized22 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4617315517961601024L), constructorKey9, 1.0D, Double.longBitsToDouble(4622945017495814144L), 0);
        recovery$indy$flow$439(this, initialized22);
        client.setting.ShaderOptions initialized23 = new client.setting.ShaderOptions(this, constructorKey5);
        java.lang.Object initialValue24 = recovery$indy$flow$442();
        java.lang.Object initialValue25 = initialValue24;
        long initialValue26 = constructorKey6;
        client.setting.ShaderOptions initialValue27 = initialized23;
        java.lang.Object initialValue28 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue29 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue30 = recovery$indy$flow$445(initialValue28, initialValue26, initialValue29);
        long initialValue31 = constructorKey10;
        java.lang.Object initialValue32 = initialValue30;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = recovery$indy$flow$447(initialValue33, initialValue31);
        recovery$indy$flow$448(this, initialValue34);
        java.lang.Object initialValue35 = recovery$indy$flow$450();
        client.setting.MultiSelectSetting initialized36 = new client.setting.MultiSelectSetting(this, "Items", constructorKey3, (net.C_47OZ[]) (initialValue35));
        recovery$indy$flow$452(this, initialized36);
        java.util.ArrayList initialized37 = new java.util.ArrayList();
        recovery$indy$flow$455(this, initialized37);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$255(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$257(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$262(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$265(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$268(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$271(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$275(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$281(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$284(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$287(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$291(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$292(java.lang.Object a0,java.lang.Object a1,int a2,short a3,short a4,java.lang.Object a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$294(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$297(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$304(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$307(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$310(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$313(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$316(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$319(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$322(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$325(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$328(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$331(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$334(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$337(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$340(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$343(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$346(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$349(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$352(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$356(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$359(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$363(java.lang.Object a0,char a1,int a2,java.lang.Object a3,char a4,long a5,long a6);
    private static native boolean recovery$indy$flow$366(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$369(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$373(java.lang.Object a0,char a1,int a2,java.lang.Object a3,char a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$375(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$378(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$381(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$384(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$393(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$396(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$398(float a0,short a1,float a2,float a3,double a4,long a5,double a6,double a7,long a8,long a9);
    private static native java.lang.Object recovery$indy$flow$404(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$407(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$415(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$417(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$420(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$426(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$431(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$434(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$436(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$439(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$442() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$445(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$447(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$448(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$450();
    private static native void recovery$indy$flow$452(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$455(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Trajectories_47HQ) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47j9 recovery$indy$2(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$3(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$4(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$5(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$6(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$7(Object var0, long var1, long var3);
   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$9(long var0, long var2);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native int recovery$indy$12(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native float[] recovery$indy$13(int var0, long var1, long var3, long var5);
   private static native int recovery$indy$14(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$17(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$18(Trajectories_47HQ var0, int var1, C_47Ij var2);
   private static native void recovery$indy$19(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$71();
}
