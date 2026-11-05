package augustus.recovered.modules.render;
import augustus.recovered.modules.combat.KillAura_47CY;
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
import client.Client;
import net.C_41l;
import net.C_45n;
import client.render.RenderPass;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FQ;
import net.C_47Fw;
import net.C_47Gj;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47iC;
import net.C_47j9;
import net.C_47ob;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xZ;
import net.C_47xz;
import net.C_49h;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Line_47H3 extends client.module.Module implements client.event.RenderListener,net.C_47xz,net.C_47iC {
    private final client.setting.SettingGroup settingMoveLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingActivateMoveLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingResetOnTeleportMoveLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingAuraLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingActivateAuraLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisplayLegitimateRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisplayRotationsAtCurrentPosition = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingAuraColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAuraLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAuraLineTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingResetOnTeleportAuraLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.ShaderOptions field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_47L; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_47r; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_43W; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_47y; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_44; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_47N; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private double[] field_47h; // Runtime access flags and ConstantValue are restored from the original class.
    private static int[] field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

   public static void method_46$2022b4f670(int[] var0) {
      field_40 = var0;
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

   private void method_42$6c8e96f3ca(float var1, RenderPass var2) {
      long var3 = a ^ 49556933940751L;
      long var5 = var3 ^ 100773062416008L;
      long var10004 = 3569344080813980045L;
      float var7 = var1;
      RenderPass var8 = var2;
      long var9 = var5;
      Line_47H3 var11 = this;
      var11.method_48$232d2bad78(var9, var8, var7);
   }



   public static int[] method_42$d4d28024c9() {
      return field_40;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_44$da8c82d5d4() {
      this.field_47y.clear();
      this.field_47N.clear();
      this.field_47r.clear();
      this.field_43W.clear();
      this.field_44.clear();
      this.field_47L.clear();
      this.field_47h = null;
      this.field_43h.clear();
   }



   private void method_48$e45a9973e5(long var1) {
      int var35;
      var1 = a ^ var1;
      long var3 = var1 ^ 40754800771964L;
      long var5 = var1 ^ 36556334144668L;
      long var7 = var1 ^ 46712745317882L;
      long var10001 = var1 ^ 64956193021517L;
      int var9 = (int)((var1 ^ 64956193021517L) >>> 32);
      int var10 = (int)((var1 ^ 64956193021517L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      GL11.glPushMatrix();
      int[] var10000 = recovery$indy$1(3231224759187664645L, var1);
      C_47tf var13 = ((net.C_47tf) (new C_47tf(recovery$indy$2(field_43, 3230960637335604080L, var1).method_41$fedcb3e4d3(), recovery$indy$3(field_43, 3230960637335604080L, var1).method_49$fedcb3e4d3(), recovery$indy$4(field_43, 3230960637335604080L, var1).method_45$fedcb3e4d3())));
      int[] var12 = var10000;
      GL11.glDisable(3008);
      GL11.glBegin(3);
      GlStateManager.method_47$f2b6a9055b(
         recovery$indy$5(this.settingAuraColor, var5, 3230806956811390868L, var1),
         recovery$indy$6(this.settingAuraColor, var3, 3229881953254990018L, var1),
         recovery$indy$7(this.settingAuraColor, var7, 3230643246230211194L, var1),
         1.0F
      );
      C_47tf var14 = var13.method_47$a365857470(0.0, recovery$indy$8(field_43, 3229100588102967514L, var1).method_41$bc607678b6(), 0.0);
      int var15 = 0;

      label74: {
         while (true) {
            if (var15 < this.field_44.size()) {
               float[] var16 = (float[])this.field_43W.get(var15);
               float[] var17 = (float[])this.field_43W.get(Math.max(var15 - 1, 0));
               long var18 = (Long)this.field_47L.get(Math.max(var15 - 1, 0));
               long var20 = (Long)this.field_47L.get(var15);
               double var22 = var20 - var18;
               if (var1 < 0L) {
                  break label74;
               }

               var35 = var15;
               if (var12 != null) {
                  break;
               }

               if (var12 == null && var15 > 0) {
                  recovery$indy$9(this.settingAuraColor, var9, (short)var10, (char)var11, 0, 3229486106663079110L, var1);
               }

               float var24 = C_47sk.method_40$f6c4892e39(-var16[0] * (float) (Math.PI / 180.0) - (float) Math.PI);
               float var25 = C_47sk.method_47$f6c4892e39(-var16[0] * (float) (Math.PI / 180.0) - (float) Math.PI);
               float var26 = -C_47sk.method_40$f6c4892e39(-var16[1] * (float) (Math.PI / 180.0));
               float var27 = C_47sk.method_47$f6c4892e39(-var16[1] * (float) (Math.PI / 180.0));
               C_47tf var28 = ((net.C_47tf) (new C_47tf(recovery$indy$10(this.settingDisplayRotationsAtCurrentPosition, 3231107811116866911L, var1) ? var14 : (C_47tf)this.field_44.get(var15))));
               var28.field_40 = var28.field_40 + (var25 * var26 - var13.field_40);
               var28.field_41 = var28.field_41 + (var27 - var13.field_41);
               var28.field_47 = var28.field_47 + (var24 * var26 - var13.field_47);
               GL11.glVertex3d(var28.field_40, var28.field_41, var28.field_47);
               var15++;
               if (var12 == null) {
                  continue;
               }
            }

            GL11.glEnd();
            if (var1 < 0L) {
               break label74;
            }

            var35 = 255;
            break;
         }

         RenderUtils.method_44$42cf812248(var35, 0, 0, 255);
      }

      double var30 = 0.002;
      int var31 = 0;

      while (true) {
         if (var31 < this.field_47y.size()) {
            float[] var32 = (float[])this.field_47y.get(var31);
            float var19 = C_47sk.method_40$f6c4892e39(-var32[0] * (float) (Math.PI / 180.0) - (float) Math.PI);
            float var33 = C_47sk.method_47$f6c4892e39(-var32[0] * (float) (Math.PI / 180.0) - (float) Math.PI);
            float var21 = -C_47sk.method_40$f6c4892e39(-var32[1] * (float) (Math.PI / 180.0));
            float var34 = C_47sk.method_47$f6c4892e39(-var32[1] * (float) (Math.PI / 180.0));
            if (var12 != null) {
               break;
            }

            C_47tf var23 = ((net.C_47tf) (new C_47tf(recovery$indy$11(this.settingDisplayRotationsAtCurrentPosition, 3231107811116866911L, var1) ? var14 : (C_47tf)this.field_47N.get(var31))));
            var23.field_40 = var23.field_40 + (var33 * var21 - var13.field_40);
            var23.field_41 = var23.field_41 + (var34 - var13.field_41);
            var23.field_47 = var23.field_47 + (var19 * var21 - var13.field_47);
            RenderUtils.method_49$0bc3ff5d48(
               var23.field_40 - 0.002, var23.field_41 - 0.002, var23.field_47 - 0.002, var23.field_40 + 0.002, var23.field_41 + 0.002, var23.field_47 + 0.002
            );
            var31++;
            if (var12 == null) {
               continue;
            }
         }

         GL11.glEnable(3008);
         RenderUtils.method_44$42cf812248(255, 255, 255, 255);
         if (var1 >= 0L) {
            GL11.glPopMatrix();
         }
         break;
      }
   }






   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 84861947689207L;
      long var10000 = -6956687325405815642L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -6956848528543518980L;
      BooleanSetting var4 = this.settingDisplayLegitimateRotations;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -6957190538287981440L;
         BooleanSetting var5 = this.settingDisplayLegitimateRotations;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



    public void method_48$232d2bad78(long l, RenderPass c_471t, float f) {
        double[] dArray;
        double[] dArray2;
        C_47Gj c_47Gj;
        C_41l c_41l;
        block14: {
            double[] dArray3;
            double[] dArray4;
            C_47Gj c_47Gj2;
            C_41l c_41l2;
            block18: {
                Object object;
                block17: {
                    int n;
                    ArrayList arrayList;
                    block16: {
                        block12: {
                            block15: {
                                int n2;
                                block13: {
                                    int n3;
                                    int n4;
                                    int n5;
                                    long l2;
                                    block11: {
                                        int n6;
                                        block10: {
                                            long l3 = l = a ^ l;
                                            l2 = l3 ^ 0x6D05CBDCACE0L;
                                            long l4 = l3 ^ 0x3AA90AB9B215L;
                                            n5 = (int)(l4 >>> 32);
                                            n4 = (int)(l4 << 32 >>> 48);
                                            n3 = (int)(l4 << 48 >>> 48);
                                            int[] nArray = Line_47H3.recovery$indy$12(40422955387568989L, l);
                                            n6 = this.field_43h.size();
                                            if (nArray != null) break block10;
                                            if (n6 < 2) {
                                                return;
                                            }
                                            break block11;
                                        }
                                        RenderUtils.method_43$d00df7729d((int)n6);
                                        c_41l2 = C_41l.method_40$2abe131c67();
                                        c_47Gj2 = c_41l2.method_41$4db9b92eb8();
                                        c_47Gj2.method_44$dc4d91c0c9(3, C_49h.field_47y);
                                        double[] dArray5 = this.field_47h;
                                        dArray4 = new double[]{Line_47H3.recovery$indy$15(this.field_47h[0], dArray5[0], f, 39772614395174410L, l), Line_47H3.recovery$indy$16(this.field_47h[1], dArray5[1], f, 39772614395174410L, l), Line_47H3.recovery$indy$17(this.field_47h[2], dArray5[2], f, 39772614395174410L, l)};
                                        c_47Gj2.method_42$dbb7a02e02((double)((float)dArray4[0]) - Line_47H3.recovery$indy$18(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)dArray4[1]) - Line_47H3.recovery$indy$19(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)dArray4[2]) - Line_47H3.recovery$indy$20(field_43, 40158760527636264L, l).method_45$fedcb3e4d3()).method_42$da8c82d5d4();
                                        n2 = 0;
                                        if (n2 >= this.field_43h.size() - 1) break block12;
                                        break block13;
                                    }
                                    RenderUtils.method_43$d00df7729d((int)Line_47H3.recovery$indy$14(this.field_48, c_471t, l2, Line_47H3.recovery$indy$13(this.settingColor, n5, (short)n4, (char)n3, 0, 38686566314434718L, l), 38953515624541127L, l));
                                    c_41l = C_41l.method_40$2abe131c67();
                                    c_47Gj = c_41l.method_41$4db9b92eb8();
                                    c_47Gj.method_44$dc4d91c0c9(3, C_49h.field_47y);
                                    if (this.field_47h == null) break block14;
                                    break block15;
                                }
                                arrayList = this.field_43h;
                                n = n2;
                                break block16;
                            }
                            double[] dArray6 = (double[])this.field_43h.get(0);
                            dArray2 = new double[]{Line_47H3.recovery$indy$15(this.field_47h[0], dArray6[0], f, 39772614395174410L, l), Line_47H3.recovery$indy$16(this.field_47h[1], dArray6[1], f, 39772614395174410L, l), Line_47H3.recovery$indy$17(this.field_47h[2], dArray6[2], f, 39772614395174410L, l)};
                            c_47Gj.method_42$dbb7a02e02((double)((float)dArray2[0]) - Line_47H3.recovery$indy$18(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)dArray2[1]) - Line_47H3.recovery$indy$19(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)dArray2[2]) - Line_47H3.recovery$indy$20(field_43, 40158760527636264L, l).method_45$fedcb3e4d3()).method_42$da8c82d5d4();
                            break block14;
                        }
                        arrayList = this.field_43h;
                        n = this.field_43h.size() - 1;
                        if (l <= 0L) break block16;
                        object = arrayList.get(n);
                        break block17;
                    }
                    dArray3 = (double[])arrayList.get(n);
                    if (l < 0L) break block18;
                    dArray4 = dArray3;
                    object = c_47Gj2.method_42$dbb7a02e02((double)((float)dArray4[0]) - Line_47H3.recovery$indy$21(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)dArray4[1]) - Line_47H3.recovery$indy$22(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)dArray4[2]) - Line_47H3.recovery$indy$23(field_43, 40158760527636264L, l).method_45$fedcb3e4d3());
                }
                dArray3 = (double[])object;
            }
            double[] dArray7 = dArray3;
            dArray4 = (double[])this.field_43h.get(this.field_43h.size() - 2);
            c_47Gj2.method_42$dbb7a02e02((double)((float)Line_47H3.recovery$indy$24(dArray4[0], dArray7[0], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$25(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)Line_47H3.recovery$indy$26(dArray4[1], dArray7[1], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$27(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)Line_47H3.recovery$indy$28(dArray4[2], dArray7[2], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$29(field_43, 40158760527636264L, l).method_45$fedcb3e4d3()).method_42$da8c82d5d4();
            c_41l2.method_40$da8c82d5d4();
            return;
        }
        int n = 0;
        while (true) {
            int n7;
            ArrayList arrayList;
            if (n < this.field_43h.size() - 1) {
                arrayList = this.field_43h;
                n7 = n;
            } else {
                arrayList = this.field_43h;
                n7 = this.field_43h.size() - 1;
                if (l > 0L) {
                    dArray = (double[])arrayList.get(n7);
                    break;
                }
            }
            dArray = (double[])arrayList.get(n7);
            if (l < 0L) break;
            dArray2 = dArray;
            c_47Gj.method_42$dbb7a02e02((double)((float)dArray2[0]) - Line_47H3.recovery$indy$21(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)dArray2[1]) - Line_47H3.recovery$indy$22(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)dArray2[2]) - Line_47H3.recovery$indy$23(field_43, 40158760527636264L, l).method_45$fedcb3e4d3()).method_42$da8c82d5d4();
            ++n;
        }
        double[] dArray8 = dArray;
        dArray2 = (double[])this.field_43h.get(this.field_43h.size() - 2);
        c_47Gj.method_42$dbb7a02e02((double)((float)Line_47H3.recovery$indy$24(dArray2[0], dArray8[0], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$25(field_43, 40158760527636264L, l).method_41$fedcb3e4d3(), (double)((float)Line_47H3.recovery$indy$26(dArray2[1], dArray8[1], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$27(field_43, 40158760527636264L, l).method_49$fedcb3e4d3(), (double)((float)Line_47H3.recovery$indy$28(dArray2[2], dArray8[2], f, 39772614395174410L, l)) - Line_47H3.recovery$indy$29(field_43, 40158760527636264L, l).method_45$fedcb3e4d3()).method_42$da8c82d5d4();
        c_41l.method_40$da8c82d5d4();
    }





   private boolean method_49$2ac7ee8710(double var1, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 23364191578124L;
      int[] var7 = recovery$indy$30(-6593596228764801108L, var3);
      double var9;
      int var10000 = (var9 = Math.abs(var1 - System.currentTimeMillis()) - recovery$indy$31(this.settingLineTime, var5, -6593660218493501469L, var3)) == 0.0
         ? 0
         : (var9 < 0.0 ? -1 : 1);
      if (var7 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 20290521581540L;
      int[] var5 = recovery$indy$32(-3912630027314918815L, var1);
      KillAura_47CY var10000 = ClientGlobals.field_48.field_48Q;
      if (var5 == null) {
         if (!recovery$indy$33(ClientGlobals.field_48.field_48Q, var3, -3912348841041326664L, var1)) {
            return false;
         }

         var10000 = ClientGlobals.field_48.field_48Q;
      }

      return var10000.field_45z != null;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      augustus.recovered.modules.render.Line_47H3 var7;
      int[] var4;
      int var10000;
      int[] var10001;
      label67: {
         var4 = recovery$indy$34(2669468370762589913L, var1);
         C_473U var5 = recovery$indy$35(var3, 2669116005524860004L, var1);
         var10000 = (int) ((var5 instanceof C_47FQ) ? 1 : 0);
         label66:
         if (var4 == null) {
            if (var10000 != 0) {
               C_47FQ var6 = (C_47FQ)var5;
               var10000 = var6.method_48$8abf5c6871();
               var10001 = var4;
               if (var1 < 0L) {
                  break label67;
               }

               if (var4 != null) {
                  break label66;
               }

               if (var10000 != this.field_43y) {
                  this.field_43y = var6.method_48$8abf5c6871();
                  recovery$indy$36(this, 2668416809937510037L, var1);
               }
            }

            var10000 = (int) ((var5 instanceof C_47xZ) ? 1 : 0);
         }

         var10001 = var4;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$37(this.settingResetOnTeleportMoveLine, 2669356903070323843L, var1)) ? 1 : 0);
         }

         var10001 = var4;
      }

      label72: {
         if (var10001 == null) {
            if (var10000 != 0) {
               this.field_43h.clear();
            }

            var7 = this;
            if (var4 != null) {
               break label72;
            }

            var10000 = (int) ((recovery$indy$38(this.settingResetOnTeleportAuraLine, 2669356903070323843L, var1)) ? 1 : 0);
         }

         if (var10000 == 0) {
            return;
         }

         var7 = this;
      }

      recovery$indy$39(var7, 2668416809937510037L, var1);
   }



   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 50370950462395L;
      long var6 = var1 ^ 75862687826910L;
      long var8 = var1 ^ 57482311646357L;
      long var10 = var1 ^ 5451650687478L;
      long var12 = var1 ^ 52344924935716L;
      long var14 = var1 ^ 65677601152735L;
      long var16 = var1 ^ 80017760765463L;
      long var10001 = var1 ^ 88570288194173L;
      int var18 = (int)((var1 ^ 88570288194173L) >>> 32);
      int var19 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
      int var20 = (int)(var10001 << 48 >>> 48);
      int[] var21 = recovery$indy$40(8135742085300794165L, var1);
      boolean var10000 = recovery$indy$41(this.settingActivateMoveLine, 8135569045232746863L, var1);
      if (var21 == null) {
         if (var10000) {
            RenderUtils.method_42$da8c82d5d4();
            GL11.glLineWidth((float)recovery$indy$42(this.settingLineWidth, var8, 8135679673905654650L, var1));
            GlStateManager.method_44$42cf812248(770, 771, 1, 0);
            recovery$indy$45(
               recovery$indy$43(this.field_48, var6, 8134770340173948080L, var1),
               recovery$indy$44(this.field_48, var12, 8133887372286838460L, var1),
               var10,
               8135206826179641120L,
               var1
            );
            recovery$indy$47(false, var16, recovery$indy$46(this, var3), 8142253022532478011L, var1);
            GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
            RenderUtils.method_43$da8c82d5d4();
         }

         var10000 = recovery$indy$48(this.settingActivateAuraLine, 8135569045232746863L, var1);
      }

      int[] var22 = var21;
      if (var1 >= 0L) {
         if (var21 == null) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$49(this.settingDisplayLegitimateRotations, 8135569045232746863L, var1);
         }

         var22 = var21;
      }

      label112: {
         if (var22 == null) {
            if (!var10000) {
               return;
            }

            RenderUtils.method_42$da8c82d5d4();
            RenderUtils.method_43$d00df7729d(recovery$indy$50(this.settingColor, var18, (short)var19, (char)var20, 0, 8133812221041512694L, var1));
            GL11.glLineWidth((float)recovery$indy$51(this.settingLineWidth, var8, 8135679673905654650L, var1));
            GlStateManager.method_44$42cf812248(770, 771, 1, 0);
            if (var1 <= 0L) {
               break label112;
            }

            if (var21 != null) {
               recovery$indy$57(this, var4, 8134714094163043479L, var1);
               GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
               break label112;
            }

            var10000 = recovery$indy$52(this, var14, 8134276649190660233L, var1);
         }

         if (!var10000) {
            this.field_47L.add(System.currentTimeMillis());
            this.field_43W
               .add(
                  new float[]{
                     recovery$indy$53(field_43, 8133635610557463786L, var1).field_48h, recovery$indy$54(field_43, 8133635610557463786L, var1).field_48z
                  }
               );
            this.field_44.add(recovery$indy$55(field_43, 8133635610557463786L, var1).method_49$41b79b67a0(var3));
            if (!this.field_47L.isEmpty()) {
               if (System.currentTimeMillis() - (Long)this.field_47L.get(0) > recovery$indy$56(this.settingAuraLineTime, var8, 8135679673905654650L, var1)) {
                  this.field_47L.remove(0);
                  this.field_43W.remove(0);
                  this.field_44.remove(0);
               } else if (var1 >= 0L) {
                  recovery$indy$57(this, var4, 8134714094163043479L, var1);
                  GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                  break label112;
               }
            } else if (var1 >= 0L) {
               recovery$indy$57(this, var4, 8134714094163043479L, var1);
               GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
               break label112;
            }
         } else if (var1 >= 0L) {
            recovery$indy$57(this, var4, 8134714094163043479L, var1);
            GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
            break label112;
         }

         label97:
         while (true) {
            while (var21 == null) {
               if (!this.field_47L.isEmpty()) {
                  if (System.currentTimeMillis() - (Long)this.field_47L.get(0) > recovery$indy$56(this.settingAuraLineTime, var8, 8135679673905654650L, var1)) {
                     this.field_47L.remove(0);
                     this.field_43W.remove(0);
                     this.field_44.remove(0);
                  } else if (var1 >= 0L) {
                     recovery$indy$57(this, var4, 8134714094163043479L, var1);
                     GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                     break label97;
                  }
               } else if (var1 >= 0L) {
                  recovery$indy$57(this, var4, 8134714094163043479L, var1);
                  GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
                  break label97;
               }
            }

            if (var1 >= 0L) {
               recovery$indy$57(this, var4, 8134714094163043479L, var1);
               GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
               break;
            }
         }
      }

      RenderUtils.method_43$da8c82d5d4();
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$58(this, 32, var3, -7102159792388357892L, var1);
      recovery$indy$59(this, 40, var3, -7102159792388357892L, var1);
      recovery$indy$60(this, 26, var3, -7102159792388357892L, var1);
   }



   private boolean method_42j$0dd78e0064(long var1) {
      label31: {
         var1 = a ^ var1;
         long var3 = var1 ^ 18154968260854L;
         int[] var5 = recovery$indy$61(-1942477558448707880L, var1);
         boolean var10000 = recovery$indy$62(ClientGlobals.field_48.field_48Q.field_47x, var3, -1940385095496579185L, var1)
            .equalsIgnoreCase(recovery$indy$63(17667, 3378474827483766812L ^ var1));
         if (var5 == null) {
            if (var10000) {
               break label31;
            }

            var10000 = recovery$indy$64(ClientGlobals.field_48.field_48Q.field_47x, var3, -1940385095496579185L, var1)
               .equalsIgnoreCase(recovery$indy$65(29894, 5500220180627771852L ^ var1));
         }

         if (var5 != null) {
            return var10000;
         }

         if (!var10000) {
            return false;
         }
      }

      recovery$indy$66(-1941584077855870138L, var1).getClass();
      return false;
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



    public void method_489$e45a9973e5(long key) {
        long settingKey = key ^ 85883628582303L;
        long expiryKey = key ^ 32377573095960L;
        long activityKey = key ^ 72431167231957L;
        long stateKey = key ^ 40319640894316L;
        recovery$indy$flow$329(this, null);
        Object guard = recovery$indy$flow$330(4174146402632661567L, key);
        long now = recovery$indy$flow$331();
        boolean recordMovement = recovery$indy$flow$333(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateMoveLine)), 4174030546288724069L, key);
        if (guard != null) {
            if (!recordMovement) return;
            float[] guardedRotation = new float[recovery$indy$flow$392(this, stateKey, 4174825496819115579L, key) ? 1 : 0];
            guardedRotation[0] = recovery$indy$flow$395(recovery$indy$flow$394(recovery$indy$flow$393(), 4173148165779158496L, key));
            guardedRotation[1] = recovery$indy$flow$398(recovery$indy$flow$397(recovery$indy$flow$396(), 4173148165779158496L, key));
            return;
        }
        if (recordMovement) {
            double previousX = recovery$indy$flow$336(recovery$indy$flow$335(recovery$indy$flow$334(), 4173148165779158496L, key));
            double currentX = recovery$indy$flow$339(recovery$indy$flow$338(recovery$indy$flow$337(), 4173148165779158496L, key));
            double previousXAgain = recovery$indy$flow$342(recovery$indy$flow$341(recovery$indy$flow$340(), 4173148165779158496L, key));
            float x = (float) (previousX + (currentX - previousXAgain));
            double previousY = recovery$indy$flow$345(recovery$indy$flow$344(recovery$indy$flow$343(), 4173148165779158496L, key));
            double heightOffset = recovery$indy$flow$347(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingLineWidth)), settingKey, 4174212147190653552L, key) / 100.0D;
            double currentY = recovery$indy$flow$350(recovery$indy$flow$349(recovery$indy$flow$348(), 4173148165779158496L, key));
            double previousYAgain = recovery$indy$flow$353(recovery$indy$flow$352(recovery$indy$flow$351(), 4173148165779158496L, key));
            float y = (float) ((previousY + heightOffset) + (currentY - previousYAgain));
            double previousZ = recovery$indy$flow$356(recovery$indy$flow$355(recovery$indy$flow$354(), 4173148165779158496L, key));
            double currentZ = recovery$indy$flow$359(recovery$indy$flow$358(recovery$indy$flow$357(), 4173148165779158496L, key));
            double previousZAgain = recovery$indy$flow$362(recovery$indy$flow$361(recovery$indy$flow$360(), 4173148165779158496L, key));
            float z = (float) (previousZ + (currentZ - previousZAgain));
            if (!recovery$indy$flow$364(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)))) {
                Object points = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h));
                int lastIndex = recovery$indy$flow$367(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h))) - 1;
                double[] lastPoint = (double[]) recovery$indy$flow$369(recovery$indy$flow$368(points, lastIndex));
                if (lastPoint[0] != (double) x || lastPoint[1] != (double) y || lastPoint[2] != (double) z) {
                    recovery$indy$flow$371(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)), new double[]{(double) x, (double) y, (double) z, (double) now});
                }
            } else {
                recovery$indy$flow$373(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)), new double[]{(double) x, (double) y, (double) z, (double) now});
            }
            for (;;) {
                while (0 < recovery$indy$flow$375(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)))) {
                    double[] point = (double[]) recovery$indy$flow$378(recovery$indy$flow$377(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)), 0));
                    if (key < 0L) continue;
                    if (!recovery$indy$flow$379(this, point[3], expiryKey, 4174568580838162658L, key)) break;
                    recovery$indy$flow$381(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)), 0);
                    recovery$indy$flow$382(this, point);
                }
                if (key >= 0L) break;
                recovery$indy$flow$378(guard);
            }
        } else {
            boolean empty = recovery$indy$flow$384(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)));
            if (key < 0L) {
                if (!empty) return;
            } else if (!empty) {
                recovery$indy$flow$386(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43h)));
                recovery$indy$flow$387(this, null);
            }
        }
        if (key >= 0L && !recovery$indy$flow$389(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine)), 4174030546288724069L, key)) return;
        if (!recovery$indy$flow$391(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingDisplayLegitimateRotations)), 4174030546288724069L, key)) return;
        float[] rotation = null;
        Object eyePosition = null;
        boolean secondarySelected = false;
        if (!recovery$indy$flow$392(this, stateKey, 4174825496819115579L, key)) {
            rotation = new float[2];
            rotation[0] = recovery$indy$flow$395(recovery$indy$flow$394(recovery$indy$flow$393(), 4173148165779158496L, key));
            rotation[1] = recovery$indy$flow$398(recovery$indy$flow$397(recovery$indy$flow$396(), 4173148165779158496L, key));
            eyePosition = recovery$indy$flow$401(recovery$indy$flow$400(recovery$indy$flow$399(), 4173148165779158496L, key), 1.0F);
            recovery$indy$flow$404(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47r)), recovery$indy$flow$403(now));
            recovery$indy$flow$406(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47y)), rotation);
            recovery$indy$flow$408(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47N)), eyePosition);
            while (!recovery$indy$flow$410(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47r)))) {
                long oldest = recovery$indy$flow$414(((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(recovery$indy$flow$412(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47r)), 0))))))));
                double age = (double) (now - oldest);
                double lifetime = recovery$indy$flow$416(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLineTime)), settingKey, 4174212147190653552L, key);
                if (key <= 0L) {
                    if (key < 0L) {
                        if (age != lifetime) return;
                    } else {
                        if (age == lifetime) return;
                        if (recovery$indy$flow$424(this, stateKey, 4174825496819115579L, key)) return;
                    }
                    secondarySelected = true;
                    break;
                }
                if (!(age > lifetime)) break;
                recovery$indy$flow$418(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47r)), 0);
                recovery$indy$flow$420(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47y)), 0);
                recovery$indy$flow$422(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47N)), 0);
            }
        }
        if (!secondarySelected) {
            if (key > 0L) {
                if (!recovery$indy$flow$423(this, activityKey, 4172791591417401731L, key)) return;
                if (recovery$indy$flow$424(this, stateKey, 4174825496819115579L, key)) return;
            } else {
                if (recovery$indy$flow$424(this, activityKey, 4172791591417401731L, key)) return;
            }
        }
        recovery$indy$flow$427(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47L)), recovery$indy$flow$426(now));
        Object rotations = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43W));
        if (rotation == null) {
            rotation = new float[2];
            rotation[0] = recovery$indy$flow$431(recovery$indy$flow$430(recovery$indy$flow$429(), 4173148165779158496L, key));
            rotation[1] = recovery$indy$flow$434(recovery$indy$flow$433(recovery$indy$flow$432(), 4173148165779158496L, key));
        }
        recovery$indy$flow$435(rotations, rotation);
        Object positions = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_44));
        if (eyePosition == null) eyePosition = recovery$indy$flow$439(recovery$indy$flow$438(recovery$indy$flow$437(), 4173148165779158496L, key), 1.0F);
        recovery$indy$flow$440(positions, eyePosition);
        while (!recovery$indy$flow$442(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47L)))) {
            long oldest = recovery$indy$flow$446(((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(recovery$indy$flow$444(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47L)), 0))))))));
            double age = (double) (now - oldest);
            double lifetime = recovery$indy$flow$448(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLineTime)), settingKey, 4174212147190653552L, key);
            if (!(age > lifetime)) break;
            recovery$indy$flow$450(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_47L)), 0);
            recovery$indy$flow$452(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_43W)), 0);
            recovery$indy$flow$454(((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).field_44)), 0);
        }
    }







   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43h = new ArrayList();
   }



    public Line_47H3(int a0,char a1,int a2) {
        super((java.lang.String) ("Line"),(java.lang.String) ("Linie"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 92107964788898L)),(java.awt.Color) (new java.awt.Color((int) (10),(int) (20),(int) (15))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a);
        int constructorPart2 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 93238717010504L) >>> 48));
        int constructorPart3 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 93238717010504L) << 16) >>> 48));
        int constructorPart4 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 93238717010504L) << 32) >>> 32));
        long constructorKey5 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 47487607404932L);
        int constructorPart6 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 20775638527749L) >>> 32));
        int constructorPart7 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 20775638527749L) << 32) >>> 48));
        int constructorPart8 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 20775638527749L) << 48) >>> 48));
        long constructorKey9 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 92764597728563L);
        long constructorKey10 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 130987608751415L);
        long constructorKey11 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 79276888644635L);
        long constructorKey12 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 60823263440726L);
        long constructorKey13 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 45396784582348L);
        long constructorKey14 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 124177564575081L);
        long constructorKey15 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Line_47H3.a) ^ 23327533697032L);
        client.setting.SettingGroup initialized16 = new client.setting.SettingGroup(this, "MoveLine", true, constructorKey9);
        recovery$indy$flow$460(this, initialized16);
        short converted17 = (short) (constructorPart2);
        char converted18 = (char) (constructorPart3);
        java.lang.Object initialValue19 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingMoveLine));
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, "ActivateMoveLine", converted17, converted18, constructorPart4, true, (client.setting.SettingGroup) (initialValue19));
        long initialValue21 = constructorKey13;
        java.lang.String initialValue22 = "Activate";
        client.setting.BooleanSetting initialValue23 = initialized20;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue22))))));
        java.lang.Object initialValue26 = recovery$indy$flow$466(initialValue24, initialValue25, initialValue21);
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue26))))));
        recovery$indy$flow$468(this, initialValue27);
        java.awt.Color initialized28 = new java.awt.Color(77, 0, 255, 255);
        java.lang.Object initialValue29 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingMoveLine));
        client.setting.ColorSetting initialized30 = new client.setting.ColorSetting(this, "Color", constructorKey10, initialized28, (client.setting.SettingGroup) (initialValue29));
        java.lang.Object initialValue31 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateMoveLine));
        java.lang.Object initialValue32 = recovery$indy$flow$475(initialValue31);
        java.lang.Object initialValue33 = recovery$indy$flow$476(initialValue31);
        java.lang.Object initialValue34 = initialValue33;
        long initialValue35 = constructorKey5;
        client.setting.ColorSetting initialValue36 = initialized30;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue39 = recovery$indy$flow$479(initialValue37, initialValue35, initialValue38);
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue39))))));
        recovery$indy$flow$481(this, initialValue40);
        java.lang.Object initialValue41 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingMoveLine));
        client.setting.NumberSetting initialized42 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4616189618054758400L), 2, (client.setting.SettingGroup) (initialValue41), constructorKey15);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateMoveLine));
        java.lang.Object initialValue44 = recovery$indy$flow$486(initialValue43);
        java.lang.Object initialValue45 = recovery$indy$flow$487(initialValue43);
        java.lang.Object initialValue46 = initialValue45;
        client.setting.NumberSetting initialValue47 = initialized42;
        java.lang.Object initialValue48 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue49 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue50 = recovery$indy$flow$490(initialValue48, initialValue49);
        recovery$indy$flow$491(this, initialValue50);
        java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingMoveLine));
        client.setting.NumberSetting initialized52 = new client.setting.NumberSetting(this, "LineTime", Double.longBitsToDouble(4658815484840378368L), Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4671226772094713856L), 0, (client.setting.SettingGroup) (initialValue51), constructorKey15);
        java.lang.Object initialValue53 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateMoveLine));
        java.lang.Object initialValue54 = recovery$indy$flow$496(initialValue53);
        java.lang.Object initialValue55 = recovery$indy$flow$497(initialValue53);
        java.lang.Object initialValue56 = initialValue55;
        client.setting.NumberSetting initialValue57 = initialized52;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue60 = recovery$indy$flow$500(initialValue58, initialValue59);
        recovery$indy$flow$501(this, initialValue60);
        short converted61 = (short) (constructorPart2);
        char converted62 = (char) (constructorPart3);
        java.lang.Object initialValue63 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingMoveLine));
        client.setting.BooleanSetting initialized64 = new client.setting.BooleanSetting(this, "ResetOnTeleportMoveLine", converted61, converted62, constructorPart4, false, (client.setting.SettingGroup) (initialValue63));
        long initialValue65 = constructorKey13;
        java.lang.String initialValue66 = "ResetOnTeleport";
        client.setting.BooleanSetting initialValue67 = initialized64;
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue69 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue66))))));
        java.lang.Object initialValue70 = recovery$indy$flow$507(initialValue68, initialValue69, initialValue65);
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue72 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateMoveLine));
        java.lang.Object initialValue73 = recovery$indy$flow$510(initialValue72);
        java.lang.Object initialValue74 = recovery$indy$flow$511(initialValue72);
        java.lang.Object initialValue75 = initialValue74;
        long initialValue76 = constructorKey5;
        java.lang.Object initialValue77 = initialValue71;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue80 = recovery$indy$flow$514(initialValue78, initialValue76, initialValue79);
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue80))))));
        recovery$indy$flow$516(this, initialValue81);
        client.setting.SettingGroup initialized82 = new client.setting.SettingGroup(this, "AuraLine", true, constructorKey9);
        recovery$indy$flow$519(this, initialized82);
        short converted83 = (short) (constructorPart2);
        char converted84 = (char) (constructorPart3);
        java.lang.Object initialValue85 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.BooleanSetting initialized86 = new client.setting.BooleanSetting(this, "ActivateAuraLine", converted83, converted84, constructorPart4, false, (client.setting.SettingGroup) (initialValue85));
        long initialValue87 = constructorKey13;
        java.lang.String initialValue88 = "Activate";
        client.setting.BooleanSetting initialValue89 = initialized86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$525(initialValue90, initialValue91, initialValue87);
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue92))))));
        recovery$indy$flow$527(this, initialValue93);
        short converted94 = (short) (constructorPart2);
        char converted95 = (char) (constructorPart3);
        java.lang.Object initialValue96 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.BooleanSetting initialized97 = new client.setting.BooleanSetting(this, "Display legitimate rotations", converted94, converted95, constructorPart4, false, (client.setting.SettingGroup) (initialValue96));
        java.lang.Object initialValue98 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine));
        java.lang.Object initialValue99 = recovery$indy$flow$532(initialValue98);
        java.lang.Object initialValue100 = recovery$indy$flow$533(initialValue98);
        java.lang.Object initialValue101 = initialValue100;
        long initialValue102 = constructorKey5;
        client.setting.BooleanSetting initialValue103 = initialized97;
        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue105 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue106 = recovery$indy$flow$536(initialValue104, initialValue102, initialValue105);
        java.lang.Object initialValue107 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue106))))));
        recovery$indy$flow$538(this, initialValue107);
        short converted108 = (short) (constructorPart2);
        char converted109 = (char) (constructorPart3);
        java.lang.Object initialValue110 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.BooleanSetting initialized111 = new client.setting.BooleanSetting(this, "Display rotations at current position", converted108, converted109, constructorPart4, false, (client.setting.SettingGroup) (initialValue110));
        java.lang.Object initialValue112 = recovery$indy$flow$542(this);
        java.lang.Object initialValue113 = initialValue112;
        long initialValue114 = constructorKey5;
        client.setting.BooleanSetting initialValue115 = initialized111;
        java.lang.Object initialValue116 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue115))))));
        java.lang.Object initialValue117 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue118 = recovery$indy$flow$545(initialValue116, initialValue114, initialValue117);
        java.lang.Object initialValue119 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue118))))));
        recovery$indy$flow$547(this, initialValue119);
        java.awt.Color initialized120 = new java.awt.Color(77, 0, 255, 255);
        java.lang.Object initialValue121 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.ColorSetting initialized122 = new client.setting.ColorSetting(this, "AuraColor", constructorKey10, initialized120, (client.setting.SettingGroup) (initialValue121));
        long initialValue123 = constructorKey13;
        java.lang.String initialValue124 = "Color";
        client.setting.ColorSetting initialValue125 = initialized122;
        java.lang.Object initialValue126 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue125))))));
        java.lang.Object initialValue127 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue124))))));
        java.lang.Object initialValue128 = recovery$indy$flow$555(initialValue126, initialValue127, initialValue123);
        java.lang.Object initialValue129 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue130 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine));
        java.lang.Object initialValue131 = recovery$indy$flow$558(initialValue130);
        java.lang.Object initialValue132 = recovery$indy$flow$559(initialValue130);
        java.lang.Object initialValue133 = initialValue132;
        long initialValue134 = constructorKey5;
        java.lang.Object initialValue135 = initialValue129;
        java.lang.Object initialValue136 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue135))))));
        java.lang.Object initialValue137 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue133))))));
        java.lang.Object initialValue138 = recovery$indy$flow$562(initialValue136, initialValue134, initialValue137);
        java.lang.Object initialValue139 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue138))))));
        recovery$indy$flow$564(this, initialValue139);
        java.lang.Object initialValue140 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.NumberSetting initialized141 = new client.setting.NumberSetting(this, "AuraLineWidth", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4616189618054758400L), 2, (client.setting.SettingGroup) (initialValue140), constructorKey15);
        short converted142 = (short) (constructorPart8);
        int initialValue143 = (int) (converted142);
        int initialValue144 = constructorPart7;
        java.lang.String initialValue145 = "LineWidth";
        int initialValue146 = constructorPart6;
        client.setting.NumberSetting initialValue147 = initialized141;
        java.lang.Object initialValue148 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue149 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue145))))));
        java.lang.Object initialValue150 = recovery$indy$flow$570(initialValue148, initialValue146, initialValue149, initialValue144, (short) (initialValue143));
        java.lang.Object initialValue151 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine));
        java.lang.Object initialValue152 = recovery$indy$flow$572(initialValue151);
        java.lang.Object initialValue153 = recovery$indy$flow$573(initialValue151);
        java.lang.Object initialValue154 = initialValue153;
        java.lang.Object initialValue155 = initialValue150;
        java.lang.Object initialValue156 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue155))))));
        java.lang.Object initialValue157 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue158 = recovery$indy$flow$576(initialValue156, initialValue157);
        recovery$indy$flow$577(this, initialValue158);
        java.lang.Object initialValue159 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.NumberSetting initialized160 = new client.setting.NumberSetting(this, "AuraLineTime", Double.longBitsToDouble(4658815484840378368L), Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4671226772094713856L), 0, (client.setting.SettingGroup) (initialValue159), constructorKey15);
        short converted161 = (short) (constructorPart8);
        int initialValue162 = (int) (converted161);
        int initialValue163 = constructorPart7;
        java.lang.String initialValue164 = "LineTime";
        int initialValue165 = constructorPart6;
        client.setting.NumberSetting initialValue166 = initialized160;
        java.lang.Object initialValue167 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue166))))));
        java.lang.Object initialValue168 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue164))))));
        java.lang.Object initialValue169 = recovery$indy$flow$583(initialValue167, initialValue165, initialValue168, initialValue163, (short) (initialValue162));
        java.lang.Object initialValue170 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine));
        java.lang.Object initialValue171 = recovery$indy$flow$585(initialValue170);
        java.lang.Object initialValue172 = recovery$indy$flow$586(initialValue170);
        java.lang.Object initialValue173 = initialValue172;
        java.lang.Object initialValue174 = initialValue169;
        java.lang.Object initialValue175 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue174))))));
        java.lang.Object initialValue176 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue173))))));
        java.lang.Object initialValue177 = recovery$indy$flow$589(initialValue175, initialValue176);
        recovery$indy$flow$590(this, initialValue177);
        short converted178 = (short) (constructorPart2);
        char converted179 = (char) (constructorPart3);
        java.lang.Object initialValue180 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingAuraLine));
        client.setting.BooleanSetting initialized181 = new client.setting.BooleanSetting(this, "ResetOnTeleportAuraLine", converted178, converted179, constructorPart4, false, (client.setting.SettingGroup) (initialValue180));
        long initialValue182 = constructorKey13;
        java.lang.String initialValue183 = "ResetOnTeleport";
        client.setting.BooleanSetting initialValue184 = initialized181;
        java.lang.Object initialValue185 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue184))))));
        java.lang.Object initialValue186 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue183))))));
        java.lang.Object initialValue187 = recovery$indy$flow$596(initialValue185, initialValue186, initialValue182);
        java.lang.Object initialValue188 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue187))))));
        java.lang.Object initialValue189 = ((java.lang.Object)(((augustus.recovered.modules.render.Line_47H3) (((java.lang.Object)(this)))).settingActivateAuraLine));
        java.lang.Object initialValue190 = recovery$indy$flow$599(initialValue189);
        java.lang.Object initialValue191 = recovery$indy$flow$600(initialValue189);
        java.lang.Object initialValue192 = initialValue191;
        long initialValue193 = constructorKey5;
        java.lang.Object initialValue194 = initialValue188;
        java.lang.Object initialValue195 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue194))))));
        java.lang.Object initialValue196 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue197 = recovery$indy$flow$603(initialValue195, initialValue193, initialValue196);
        java.lang.Object initialValue198 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue197))))));
        recovery$indy$flow$605(this, initialValue198);
        client.setting.ShaderOptions initialized199 = new client.setting.ShaderOptions(this, constructorKey11);
        java.lang.Object initialValue200 = recovery$indy$flow$608();
        java.lang.Object initialValue201 = initialValue200;
        long initialValue202 = constructorKey12;
        client.setting.ShaderOptions initialValue203 = initialized199;
        java.lang.Object initialValue204 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue203))))));
        java.lang.Object initialValue205 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue201))))));
        java.lang.Object initialValue206 = recovery$indy$flow$611(initialValue204, initialValue202, initialValue205);
        long initialValue207 = constructorKey14;
        java.lang.Object initialValue208 = initialValue206;
        java.lang.Object initialValue209 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue208))))));
        java.lang.Object initialValue210 = recovery$indy$flow$613(initialValue209, initialValue207);
        recovery$indy$flow$614(this, initialValue210);
        java.util.ArrayList initialized211 = new java.util.ArrayList();
        recovery$indy$flow$617(this, initialized211);
        java.util.ArrayList initialized212 = new java.util.ArrayList();
        recovery$indy$flow$620(this, initialized212);
        java.util.ArrayList initialized213 = new java.util.ArrayList();
        recovery$indy$flow$623(this, initialized213);
        java.util.ArrayList initialized214 = new java.util.ArrayList();
        recovery$indy$flow$626(this, initialized214);
        java.util.ArrayList initialized215 = new java.util.ArrayList();
        recovery$indy$flow$629(this, initialized215);
        java.util.ArrayList initialized216 = new java.util.ArrayList();
        recovery$indy$flow$632(this, initialized216);
        java.util.ArrayList initialized217 = new java.util.ArrayList();
        recovery$indy$flow$635(this, initialized217);
        recovery$indy$flow$636(this, -100);
    }








    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static void recovery$indy$flow$329(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47h = ((double[]) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$330(long a0,long a1);
    private static long recovery$indy$flow$331() {
        return java.lang.System.currentTimeMillis();
    }

    private static native boolean recovery$indy$flow$333(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$334() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$335(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$336(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48u;
    }
    private static java.lang.Object recovery$indy$flow$337() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$338(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$339(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$340() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$341(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$342(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48u;
    }
    private static java.lang.Object recovery$indy$flow$343() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$344(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$345(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48O;
    }

    private static native double recovery$indy$flow$347(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$348() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$349(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$350(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$351() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$352(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$353(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48O;
    }
    private static java.lang.Object recovery$indy$flow$354() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$355(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$356(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48l;
    }
    private static java.lang.Object recovery$indy$flow$357() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$358(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$359(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static java.lang.Object recovery$indy$flow$360() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$361(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$362(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48l;
    }

    private static boolean recovery$indy$flow$364(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }


    private static int recovery$indy$flow$367(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$368(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }
    private static java.lang.Object recovery$indy$flow$369(java.lang.Object a0) {
        return ((double[]) (a0));
    }

    private static boolean recovery$indy$flow$371(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$373(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static int recovery$indy$flow$375(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$377(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }
    private static java.lang.Object recovery$indy$flow$378(java.lang.Object a0) {
        return ((double[]) (a0));
    }
    private static native boolean recovery$indy$flow$379(java.lang.Object a0,double a1,long a2,long a3,long a4);

    private static java.lang.Object recovery$indy$flow$381(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static void recovery$indy$flow$382(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47h = ((double[]) (a1));
        return;
    }

    private static boolean recovery$indy$flow$384(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static void recovery$indy$flow$386(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }
    private static void recovery$indy$flow$387(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47h = ((double[]) (a1));
        return;
    }

    private static native boolean recovery$indy$flow$389(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$391(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$392(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$393() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$394(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$395(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static java.lang.Object recovery$indy$flow$396() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$397(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$398(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static java.lang.Object recovery$indy$flow$399() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$400(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$401(java.lang.Object a0,float a1);

    private static java.lang.Object recovery$indy$flow$403(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static boolean recovery$indy$flow$404(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$406(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$408(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$410(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static java.lang.Object recovery$indy$flow$412(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static long recovery$indy$flow$414(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }

    private static native double recovery$indy$flow$416(java.lang.Object a0,long a1,long a2,long a3);

    private static java.lang.Object recovery$indy$flow$418(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$420(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$422(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static native boolean recovery$indy$flow$423(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$424(java.lang.Object a0,long a1,long a2,long a3);

    private static java.lang.Object recovery$indy$flow$426(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static boolean recovery$indy$flow$427(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$429() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$430(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$431(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static java.lang.Object recovery$indy$flow$432() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$433(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$434(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static boolean recovery$indy$flow$435(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$437() {
        return augustus.recovered.modules.render.Line_47H3.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$438(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$439(java.lang.Object a0,float a1);
    private static boolean recovery$indy$flow$440(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$442(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static java.lang.Object recovery$indy$flow$444(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static long recovery$indy$flow$446(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }

    private static native double recovery$indy$flow$448(java.lang.Object a0,long a1,long a2,long a3);

    private static java.lang.Object recovery$indy$flow$450(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$452(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$454(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static native void recovery$indy$flow$460(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$466(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$468(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$475(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$479(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$481(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$486(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$487(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$490(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$491(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$496(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$497(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$500(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$501(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$507(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$510(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$511(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$514(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$516(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$519(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$525(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$527(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$532(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$533(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$536(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$538(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$542(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$545(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$547(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$555(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$558(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$559(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$562(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$564(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$570(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);

    private static java.lang.Object recovery$indy$flow$572(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$573(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$577(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$583(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);

    private static java.lang.Object recovery$indy$flow$585(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$586(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$589(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$590(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$596(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$599(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$600(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$603(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$605(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$608() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$611(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$613(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$614(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_48 = ((client.setting.ShaderOptions) (a1));
        return;
    }
    private static void recovery$indy$flow$617(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$620(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47L = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$623(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47r = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$626(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_43W = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$629(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47y = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$632(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_44 = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$635(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_47N = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$636(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.Line_47H3) (a0)).field_43y = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47j9 recovery$indy$2(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$3(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$4(Object var0, long var1, long var3);
   private static native float recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native float recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native int recovery$indy$9(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native int[] recovery$indy$12(long var0, long var2);
   private static native int recovery$indy$13(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native int recovery$indy$14(Object var0, Object var1, long var2, int var4, long var5, long var7);
   private static native double recovery$indy$15(double var0, double var2, double var4, long var6, long var8);
   private static native double recovery$indy$16(double var0, double var2, double var4, long var6, long var8);
   private static native double recovery$indy$17(double var0, double var2, double var4, long var6, long var8);
   private static native C_47j9 recovery$indy$18(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$19(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$20(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$21(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$22(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$23(Object var0, long var1, long var3);
   private static native double recovery$indy$24(double var0, double var2, double var4, long var6, long var8);
   private static native C_47j9 recovery$indy$25(Object var0, long var1, long var3);
   private static native double recovery$indy$26(double var0, double var2, double var4, long var6, long var8);
   private static native C_47j9 recovery$indy$27(Object var0, long var1, long var3);
   private static native double recovery$indy$28(double var0, double var2, double var4, long var6, long var8);
   private static native C_47j9 recovery$indy$29(Object var0, long var1, long var3);
   private static native int[] recovery$indy$30(long var0, long var2);
   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$32(long var0, long var2);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$34(long var0, long var2);
   private static native C_473U recovery$indy$35(Object var0, long var1, long var3);
   private static native void recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native void recovery$indy$39(Object var0, long var1, long var3);
   private static native int[] recovery$indy$40(long var0, long var2);
   private static native boolean recovery$indy$41(Object var0, long var1, long var3);
   private static native double recovery$indy$42(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$44(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$45(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$46(Line_47H3 var0, float var1);
   private static native void recovery$indy$47(boolean var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(Object var0, long var1, long var3);
   private static native int recovery$indy$50(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native double recovery$indy$51(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$53(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$55(Object var0, long var1, long var3);
   private static native double recovery$indy$56(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$57(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$59(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$61(long var0, long var2);
   private static native String recovery$indy$62(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$63(int var0, long var1);
   private static native String recovery$indy$64(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$65(int var0, long var1);
   private static native Client recovery$indy$66(long var0, long var2);
   private static native MethodHandle recovery$constant$103();
}
