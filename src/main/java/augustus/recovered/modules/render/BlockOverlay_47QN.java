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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import client.render.RenderPass;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.C_47Ij;
import net.C_47Il;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.ColorSetting;
import net.C_47V5;
import net.C_47Xe;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import client.render.RenderUtils;
import net.C_47s4;
import client.module.Category;
import net.C_47vQ;
import net.C_484;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class BlockOverlay_47QN extends client.module.Module implements net.C_47V5 {
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBlackLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBlockFill = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingInAdventureMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyBlockFace = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

   public void method_42$cecc252836(C_47s4 var1, long var2) {
      long var4 = var2 ^ 110017229645558L;
      long var6 = var2 ^ 39604008305886L;
      long var8 = var2 ^ 16955620930316L;
      long var10001 = var2 ^ 22950085037907L;
      int var10 = (int)((var2 ^ 22950085037907L) >>> 48);
      int var11 = (int)((var2 ^ 22950085037907L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var2 ^ 114584885125951L;
      var10001 = var2 ^ 123685025081173L;
      int var15 = (int)((var2 ^ 123685025081173L) >>> 32);
      int var16 = (int)((var2 ^ 123685025081173L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      int[] var18 = recovery$indy$1(6179028598515575771L, var2);
      if (recovery$indy$2(field_43, 6183403211435517830L, var2).field_49 == C_47Az.BLOCK) {
         GlStateManager.method_423$da8c82d5d4();
         GlStateManager.method_44$42cf812248(770, 771, 1, 0);
         GlStateManager.method_47$f2b6a9055b(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GlStateManager.method_421$da8c82d5d4();
         if (var2 >= 0L) {
            boolean var10000 = C_47vQ.method_48$aae029aa0a();
            if (var18 == null) {
               if (var10000) {
                  C_47Il.method_498$da8c82d5d4();
               }

               var10000 = false;
            }

            GlStateManager.method_42$f633c984d8(var10000);
         }

         boolean var31;
         label64: {
            float var19 = 0.002F;
            C_478Q var20 = recovery$indy$3(field_43, 6183403211435517830L, var2).method_49$5730377d31();
            C_475y var21 = recovery$indy$4(field_43, 6183007669147621087L, var2).method_46$efbf73d2b1(var20).method_48$e084f7739d();
            if (var18 == null) {
               if (var21.method_49$a32a680f8b() != C_47Xe.field_477) {
                  var31 = recovery$indy$5(field_43, 6183007669147621087L, var2).method_45$075d55419f().method_45$91754b766b(var20);
                  if (var18 != null) {
                     break label64;
                  }

                  if (var31) {
                     var21.method_42$6b51e0299b(
                        recovery$indy$6(field_43, 6183007669147621087L, var2),
                        var20.method_40$8abf5c6871(),
                        var20.method_43$8abf5c6871(),
                        var20.method_47$8abf5c6871()
                     );
                     int var22 = recovery$indy$7(this.settingColor, var15, (short)var16, (char)var17, 0, 6183219879308971303L, var2);
                     var21.method_42$6b51e0299b(
                        recovery$indy$8(field_43, 6183007669147621087L, var2),
                        var20.method_40$8abf5c6871(),
                        var20.method_43$8abf5c6871(),
                        var20.method_47$8abf5c6871()
                     );
                     double var23 = recovery$indy$9(field_43, 6182723057002425527L, var2).field_48u
                        + (recovery$indy$10(field_43, 6182723057002425527L, var2).field_48Q - recovery$indy$11(field_43, 6182723057002425527L, var2).field_48u)
                           * recovery$indy$12(field_43, 6183039017467649763L, var2).field_49;
                     double var25 = recovery$indy$13(field_43, 6182723057002425527L, var2).field_48O
                        + (recovery$indy$14(field_43, 6182723057002425527L, var2).field_48j - recovery$indy$15(field_43, 6182723057002425527L, var2).field_48O)
                           * recovery$indy$16(field_43, 6183039017467649763L, var2).field_49;
                     double var27 = recovery$indy$17(field_43, 6182723057002425527L, var2).field_48l
                        + (recovery$indy$18(field_43, 6182723057002425527L, var2).field_42o - recovery$indy$19(field_43, 6182723057002425527L, var2).field_48l)
                           * recovery$indy$20(field_43, 6183039017467649763L, var2).field_49;
                     C_478i var29 = var21.method_42$f487e42d4b(recovery$indy$21(field_43, 6183007669147621087L, var2), var20)
                        .method_42$800791f322(0.002F, 0.020000000949949026, 0.002F)
                        .method_47$800791f322(-var23, -var25, -var27);
                     if (var2 >= 0L) {
                        var31 = recovery$indy$22(this.settingOnlyBlockFace, 6179439173563597247L, var2);
                        if (var18 == null) {
                           if (var31) {
                              var29 = recovery$indy$24(
                                 (char)var10,
                                 (char)var11,
                                 var29,
                                 var12,
                                 recovery$indy$23(field_43, 6183403211435517830L, var2).field_40,
                                 6183306896002928498L,
                                 var2
                              );
                           }

                           var31 = recovery$indy$25(this.field_40, var4, 6183159204129057763L, var2);
                        }

                        recovery$indy$27(var31, recovery$indy$26(this.field_40, var8, 6183245534216151513L, var2), var6, 6179092197573453645L, var2);
                     }

                     C_478i var30 = var29;
                     recovery$indy$29(false, var13, recovery$indy$28(this, var30, var22), 6182869108863729277L, var2);
                     var1.cancel();
                  }
               }

               GlStateManager.method_42$f633c984d8(true);
               GlStateManager.method_42y$da8c82d5d4();
            }

            var31 = C_47vQ.method_48$aae029aa0a();
         }

         if (var31) {
            C_47Il.method_40j$da8c82d5d4();
         }

         GlStateManager.method_42z$da8c82d5d4();
      }
   }





    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_49$06a4748991(C_478i var1, int var2, RenderPass var3) {
      long var4 = a ^ 136847767082759L;
      long var6 = var4 ^ 115613536632558L;
      long var8 = var4 ^ 113770942378889L;
      long var10 = var4 ^ 56060536402126L;
      ShaderOptions var10002 = this.field_40;
      long var10007 = 2063671001377466267L;
      long var12 = var6;
      int var14 = var2;
      RenderPass var15 = var3;
      int var10005 = C_47TX.method_40$6b468acafc(var15, var14, var12);
      long var10006 = 2063265486907040167L;
      int var16 = var10005;
      long var17 = var10;
      RenderPass var19 = var3;
      ShaderOptions var20 = var10002;
      int var26 = var20.method_40$d68b376f5b(var19, var17, var16);
      long var10004 = 2063494207081997121L;
      long var21 = var8;
      int var23 = var26;
      C_478i var24 = var1;
      BlockOverlay_47QN var25 = this;
      var25.method_45$60b2ac629f(var24, var23, var21);
   }



   public void method_45$60b2ac629f(C_478i var1, int var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 57007522113780L;
      int[] var7 = recovery$indy$30(-6590606101606704494L, var3);
      int var10000 = (int) ((recovery$indy$31(this.settingBlockFill, -6590771356972764938L, var3)) ? 1 : 0);
      if (var7 == null) {
         if (var10000 != 0) {
            RenderUtils.method_43$d00df7729d(var2);
            RenderUtils.method_44$6059593eaa(var1);
         }

         double var9;
         var10000 = (var9 = recovery$indy$32(this.settingLineWidth, var5, -6590689063771997852L, var3) - 0.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      label57: {
         int[] var10001 = var7;
         if (var3 >= 0L) {
            if (var7 == null) {
               if (var10000 <= 0) {
                  break label57;
               }

               var10000 = (int) ((recovery$indy$33(this.settingBlackLine, -6590771356972764938L, var3)) ? 1 : 0);
            }

            var10001 = var7;
         }

         label45: {
            label44: {
               if (var10001 == null) {
                  if (var10000 != 0) {
                     GlStateManager.method_47$f2b6a9055b(0.0F, 0.0F, 0.0F, 1.0F);
                     if (var3 < 0L) {
                        break label45;
                     }

                     if (var7 == null) {
                        break label44;
                     }
                  }

                  var10000 = var2;
               }

               RenderUtils.method_40$3ebc9ac54d(var10000, 1.0F);
            }

            GL11.glLineWidth((float)recovery$indy$34(this.settingLineWidth, var5, -6590689063771997852L, var3) / 2.0F);
            GL11.glEnable(2848);
            RenderGlobal.method_45$6059593eaa(var1);
         }

         GL11.glDisable(2848);
      }

      GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
   }



   public static net.C_478i method_43$b9b55abb72(char var0, char var1, net.C_478i var2, int var3, net.C_484 var4) {
      switch (net.C_47A5.field_42[var4.ordinal()]) {
         case 1:
            return new net.C_478i(var2.field_48, var2.field_46, var2.field_40, var2.field_42, var2.field_47, var2.field_40);
         case 2:
            return new net.C_478i(var2.field_48, var2.field_46, var2.field_44, var2.field_42, var2.field_47, var2.field_44);
         case 3:
            return new net.C_478i(var2.field_42, var2.field_46, var2.field_44, var2.field_42, var2.field_47, var2.field_40);
         case 4:
            return new net.C_478i(var2.field_48, var2.field_46, var2.field_44, var2.field_48, var2.field_47, var2.field_40);
         case 5:
            return new net.C_478i(var2.field_48, var2.field_47, var2.field_44, var2.field_42, var2.field_47, var2.field_40);
         case 6:
            return new net.C_478i(var2.field_48, var2.field_46, var2.field_44, var2.field_42, var2.field_46, var2.field_40);
         default:
            return null;
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$35(this, 4, var3, -7099152076989262463L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public BlockOverlay_47QN(long a0) {
        super((java.lang.String) ("BlockOverlay"),(java.lang.String) ("Block\u00fcberlag"),(long) (((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 138249409488386L)),(java.awt.Color) (new java.awt.Color((int) (26),(int) (124),(int) (173))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 112576104860347L);
        long constructorKey4 = ((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 13847802395161L);
        long constructorKey5 = ((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 114385292982844L);
        long constructorKey6 = ((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 37108551746974L);
        long constructorKey7 = ((augustus.recovered.modules.render.BlockOverlay_47QN.a ^ a0) ^ 103944312648649L);
        java.awt.Color initialized8 = new java.awt.Color(21, 121, 230, 65);
        client.setting.ColorSetting initialized9 = new client.setting.ColorSetting(constructorKey5, this, "Color", initialized8);
        recovery$indy$flow$185(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey4, "BlackLine", false);
        recovery$indy$flow$188(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey4, "BlockFill", true);
        recovery$indy$flow$191(this, initialized11);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4617315517961601024L), constructorKey6, 0.0D, Double.longBitsToDouble(4621819117588971520L), 2);
        recovery$indy$flow$194(this, initialized12);
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, constructorKey4, "InAdventureMode", true);
        recovery$indy$flow$197(this, initialized13);
        client.setting.BooleanSetting initialized14 = new client.setting.BooleanSetting(this, constructorKey4, "OnlyBlockFace", false);
        recovery$indy$flow$200(this, initialized14);
        client.setting.ShaderOptions initialized15 = new client.setting.ShaderOptions(this, constructorKey3);
        long initialValue16 = constructorKey7;
        client.setting.ShaderOptions initialValue17 = initialized15;
        java.lang.Object initialValue18 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue19 = recovery$indy$flow$204(initialValue18, initialValue16);
        recovery$indy$flow$205(this, initialValue19);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$185(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$191(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$197(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$200(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$204(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$205(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47Ij recovery$indy$2(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$3(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$4(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$5(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);
   private static native int recovery$indy$7(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native WorldClient recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$12(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$16(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$20(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$21(Object var0, long var1, long var3);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$23(Object var0, long var1, long var3);
   private static native C_478i recovery$indy$24(char var0, char var1, Object var2, int var3, Object var4, long var5, long var7);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$27(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$28(BlockOverlay_47QN var0, C_478i var1, int var2);
   private static native void recovery$indy$29(boolean var0, long var1, Object var3, long var4, long var6);
   private static native int[] recovery$indy$30(long var0, long var2);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native double recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native double recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$36();
}
