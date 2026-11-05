package augustus.recovered.modules.render;
import com.google.common.collect.Maps;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42C;
import net.C_42N;
import net.C_45n;
import net.C_45z;
import client.render.RenderPass;
import net.C_475y;
import net.C_477A;
import net.C_477w;
import net.C_478Q;
import net.C_47F9;
import net.C_47Fw;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47UZ;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.C_47oO;
import net.minecraft.util.ResourceLocation;
import net.C_47pO;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47uI;
import net.C_47x3;
import net.C_47x7;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class BlockESP_47QJ extends client.module.Module implements client.event.RenderListener,net.C_47pO,net.C_47xz,net.C_47oO {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.HashMap field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_42N field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   static boolean method_46$e8dd2a9d4f(BlockESP_47QJ var0, boolean var1) {
      return var0.field_43a = var1;
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_40$839f0ed6fe(C_47x3 var1, long var2) {
      long var4 = var2 ^ 81019589207442L;
      long var6 = var2 ^ 32063071593321L;
      int[] var8 = recovery$indy$1(-1831744852775033079L, var2);
      if (field_44.size() < 2000) {
         C_47UZ var10000 = recovery$indy$2(var1, -1832633788206789011L, var2);
         if (var8 == null) {
            if (var10000 == null) {
               return;
            }

            var10000 = recovery$indy$3(var1, -1832633788206789011L, var2);
         }

         Object var12 = var10000.method_48$e084f7739d();
         if (var8 == null) {
            if (var12 == C_45z.field_46t) {
               return;
            }

            var12 = field_42.get(recovery$indy$4(var1, -1832633788206789011L, var2).method_48$e084f7739d());
         }

         if (((C_47x7)var12).field_47) {
            C_478Q var9 = recovery$indy$5(var1, var4, -1831247617408422603L, var2);
            if (var9 == null) {
               return;
            }

            if (!field_44.containsKey(var9)) {
               C_475y var10 = recovery$indy$6(var1, -1832633788206789011L, var2).method_48$e084f7739d();
               C_477w var11 = new C_477w(
                  var9.method_40$8abf5c6871() + var10.method_42$fedcb3e4d3(),
                  var9.method_43$8abf5c6871() + var10.method_46$fedcb3e4d3(),
                  var9.method_47$8abf5c6871() + var10.method_40$fedcb3e4d3(),
                  var10.method_41$fedcb3e4d3(),
                  var10.method_49$fedcb3e4d3(),
                  var10.method_45$fedcb3e4d3()
               );
               field_44.put(var9, var11);
               BlockESP_47QJ var13 = this;
               if (var8 == null) {
                  if (!recovery$indy$7(this.settingMode, var6, -1832246565974728964L, var2).equals(recovery$indy$8(7780, 5039724802857437175L ^ var2))) {
                     return;
                  }

                  var13 = this;
               }

               C_42C.method_48$f98697054d(recovery$indy$9(var13, var11));
            }
         }
      }
   }




   private void method_40$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 78621880645133L;
      int var3 = (int)((var1 ^ 78621880645133L) >>> 32);
      int var4 = (int)((var1 ^ 78621880645133L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      field_44.clear();
      recovery$indy$10(this.field_49, var3, (char)var4, (short)var5, 7953035625551342189L, var1);
   }



   private void method_48$50e8b484ae(C_477w var1) {
      long var2 = a ^ 70649824328019L;
      long var10001 = var2 ^ 103194915641590L;
      int var4 = (int)((var2 ^ 103194915641590L) >>> 32);
      int var5 = (int)((var2 ^ 103194915641590L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      byte var10002 = (byte)var5;
      long var10005 = 5494167473008039304L;
      int var7 = var6;
      C_477w var8 = var1;
      byte var9 = var10002;
      int var10 = var4;
      C_42N var11 = this.field_49;
      var11.method_41$9cbb9f4c32(var10, var9, var8, var7);
   }



   private void method_49$da8c82d5d4() {
      long var1 = a ^ 134171491897871L;
      long var3 = var1 ^ 74341391629405L;
      long var10002 = -1774179757041971817L;
      long var5 = var3;
      BlockESP_47QJ var7 = this;
      var7.method_40$e45a9973e5(var5);
      long var10001 = -1774327639616553990L;
      Minecraft var8 = field_43;
      var8.field_44P.method_42$da8c82d5d4();
   }



   static void method_49$7a96df1d4e(long var0, BlockESP_47QJ var2) {
      var0 = a ^ var0;
      long var3 = var0 ^ 54605221258742L;
      recovery$indy$11(var2, var3, 9136584131008697404L, var0);
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      long var7 = var5 ^ 23276261324403L;
      recovery$indy$12(this, var7, 3264703317164935097L, var5);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 137198064336940L;
      long var3 = var1 ^ 54957920661693L;
      long var10002 = 8450619485522300200L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Old");
   }



   private void method_45$05729735da(boolean var1, boolean var2, RenderPass var3) {
      label95: {
         long var4 = a ^ 113439955323995L;
         long var6 = var4 ^ 8525929790682L;
         long var8 = var4 ^ 24693659678020L;
         long var10 = var4 ^ 139402666990457L;
         long var12 = var4 ^ 77065695818958L;
         long var14 = var4 ^ 37039337727257L;
         long var10001 = var4 ^ 126165545438124L;
         int var16 = (int)((var4 ^ 126165545438124L) >>> 32);
         int var17 = (int)((var4 ^ 126165545438124L) << 32 >>> 48);
         int var18 = (int)(var10001 << 48 >>> 48);
         long var19 = var4 ^ 118754239972786L;
         GlStateManager.method_426$da8c82d5d4();
         long var10000 = 8734558836482324650L;
         int[] var71 = AntiStrike_47Qa.method_42$d4d28024c9();
         GlStateManager.method_47$f2b6a9055b(0.0F, 1.0F, 0.0F, 1.0F);
         int[] var21 = var71;
         int var22 = 0;
         if (var21 == null) {
            if (var1) {
               for (Object recovered$element$8838 : field_44.keySet()) {
         C_478Q var24 = (C_478Q) recovered$element$8838;
                  if (var21 != null) {
                     return;
                  }

                  if (var24 != null) {
                     float var25;
                     int var26;
                     label98: {
                        long var10002 = 8734402449626448770L;
                        long var31 = var8;
                        NumberSetting var33 = this.settingLineWidth;
                        var25 = (float)(var33.method_44$474dfaa627(var31) / 2.0);
                        short var81 = (short)var17;
                        char var10003 = (char)var18;
                        long var10005 = 8733484037972311289L;
                        int var34 = var22;
                        char var35 = var10003;
                        short var36 = var81;
                        int var37 = var16;
                        ColorSetting var38 = this.settingColor;
                        var26 = var38.method_47$24af287d8f(var37, var36, var35, var34);
                        var10001 = 8732705630372552837L;
                        Minecraft var39 = field_43;
                        double var27 = var39.field_42P
                           .method_49$4b58f7ab41(var24.method_40$8abf5c6871(), var24.method_43$8abf5c6871(), var24.method_47$8abf5c6871());
                        double var72 = var27;
                        double var77 = 1.0;
                        if (var21 == null) {
                           if (!(var27 > 1.0)) {
                              break label98;
                           }

                           var72 = 1.0;
                           var77 = var27 / 20.0;
                        }

                        double var29;
                        label78: {
                           var29 = var72 - var77;
                           double var73 = var29;
                           if (var21 == null) {
                              if (!(var29 < 0.3)) {
                                 break label78;
                              }

                              var73 = 0.3;
                           }

                           var29 = var73;
                        }

                        var25 *= (float)var29;
                     }

                     float var70 = var25;
                     ShaderOptions var78 = this.field_47;
                     long var10007 = 8732814539887140920L;
                     long var40 = var10;
                     int var42 = var26;
                     RenderPass var43 = var3;
                     int var10004 = C_47TX.method_40$6b468acafc(var43, var42, var40);
                     long var10006 = 8734724111554783770L;
                     int var44 = var22;
                     int var45 = var10004;
                     RenderPass var46 = var3;
                     long var47 = var6;
                     ShaderOptions var49 = var78;
                     RenderUtils.method_48$fe549f1055(var24, var49.method_42$f6a9c2ec55(var47, var46, var45, var44), 1.0F, var70);
                     var22++;
                     if (var21 != null) {
                        break;
                     }
                  }
               }

               if (var21 == null) {
                  break label95;
               }
            }

            var10001 = 8733619832947744204L;
            Minecraft var50 = field_43;
            double var74 = -var50.method_45$17391f161a().method_41$fedcb3e4d3();
            long var82 = 8733619832947744204L;
            Minecraft var51 = field_43;
            double var80 = -var51.method_45$17391f161a().method_49$fedcb3e4d3();
            long var86 = 8733619832947744204L;
            Minecraft var52 = field_43;
            GlStateManager.method_49$a59262c0f0(var74, var80, -var52.method_45$17391f161a().method_45$fedcb3e4d3());
         }

         for (Object recovered$element$12728 : field_44.values()) {
         C_477w var69 = (C_477w) recovered$element$12728;
            if (var21 != null) {
               return;
            }

            if (var69 != null) {
               if (var2) {
                  short var87 = (short)var17;
                  char var89 = (char)var18;
                  long var90 = 8733484037972311289L;
                  int var53 = var22;
                  char var54 = var89;
                  short var55 = var87;
                  int var56 = var16;
                  ColorSetting var57 = this.settingColor;
                  int var83 = var57.method_47$24af287d8f(var56, var55, var54, var53);
                  long var88 = 8733120085085499105L;
                  int var58 = var83;
                  long var59 = var12;
                  C_477w var61 = var69;
                  C_477w var75 = var61.method_44$b095abca90(var59, var58);
                  long var84 = 8733561440063877750L;
                  long var62 = var14;
                  C_477w var64 = var75;
                  var64.method_47$e45a9973e5(var62);
               }

               var22++;
               if (var21 != null) {
                  break;
               }
            }
         }

         long var85 = 8733213291212774216L;
         long var65 = var19;
         C_42N var67 = this.field_49;
         var67.method_49$e45a9973e5(var65);
      }

      GlStateManager.method_42O$da8c82d5d4();
   }






   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 75862687826910L;
      long var6 = var1 ^ 5451650687478L;
      long var8 = var1 ^ 52344924935716L;
      long var10 = var1 ^ 8944581653787L;
      long var12 = var1 ^ 80017760765463L;
      int[] var14 = AntiStrike_47Qa.method_42$d4d28024c9();
      net.minecraft.client.Minecraft var10000 = field_43;
      if (var14 == null) {
         net.minecraft.client.Minecraft var19 = field_43;
         if (var19.field_42P == null) {
            return;
         }

         var10000 = field_43;
      }

      net.minecraft.client.Minecraft var20 = var10000;
      if (var20.field_44Q != null) {
         client.render.RenderUtils.method_42$da8c82d5d4();
         long var21 = var10;
         client.setting.ModeSetting var23 = this.settingMode;
         boolean var15 = var23.method_46$5f9dc63072(var21).equals((String)recovery$indy$flow$134(7820, 6626935724324032878L ^ var1));
         long var16 = System.currentTimeMillis();
         long var37;
         int var34 = (var37 = var16 - this.field_46 - 1L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
         if (var14 == null) {
            var34 = var34 > 0 ? 1 : 0;
         }

         int var18 = var34;
         if (var1 > 0L) {
            int var35 = var18;
            if (var14 == null) {
               if (var18 != 0) {
                  this.field_46 = var16;
               }

               long var24 = var4;
               client.setting.ShaderOptions var26 = this.field_47;
               boolean var36 = var26.method_49$0dd78e0064(var24);
               long var27 = var8;
               client.setting.ShaderOptions var29 = this.field_47;
               net.C_47uI.method_40$9bd74f13d3(var36, var29.method_47$0dd78e0064(var27), var6);
               var35 = 1;
            }

            net.C_47Fw var30 = (net.C_47Fw)recovery$indy$flow$146(this, var15, (((var18) & 1) != 0));
            long var31 = var12;
            int var33 = var35;
            net.C_47uI.method_42$300c7fd546((boolean)((((int) (var33)) & 1) != 0), var31, var30);
            client.render.RenderUtils.method_43$da8c82d5d4();
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$15(this, 32, var3, -7102173912671019331L, var1);
      recovery$indy$16(this, 30, var3, -7102173912671019331L, var1);
      recovery$indy$17(this, 40, var3, -7102173912671019331L, var1);
      recovery$indy$18(this, 17, var3, -7102173912671019331L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      boolean var29;
      long var4;
      long var6;
      int var8;
      int var9;
      int var10;
      int[] var11;
      label105: {
         var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
         var6 = var4 ^ 99593642957744L;
         long var10001 = var4 ^ 61060186338111L;
         var8 = (int)((var4 ^ 61060186338111L) >>> 32);
         var9 = (int)((var4 ^ 61060186338111L) << 32 >>> 40);
         var10 = (int)(var10001 << 56 >>> 56);
         long var10000 = 2183421734696935376L;
         var11 = AntiStrike_47Qa.method_42$d4d28024c9();
         BlockESP_47QJ var26 = this;
         if (var11 == null) {
            if (!this.field_43a) {
               break label105;
            }

            var10001 = 2183752992587678420L;
            Minecraft var16 = field_43;
            var16.field_44P.method_42$da8c82d5d4();
            var26 = this;
         }

         var26.field_43a = false;
      }

      for (Object recovered$element$18059 : field_44.keySet()) {
         C_478Q var13 = (C_478Q) recovered$element$18059;
         int[] var27;
         label95: {
            label114: {
               label110: {
                  if (var3 > 0 && var11 == null) {
                     if (var13 != null) {
                        break label110;
                     }

                     field_44.remove(var13);
                  }

                  var27 = var11;
                  if (var2 < 0) {
                     break label95;
                  }

                  if (var11 == null) {
                     break label114;
                  }
               }

               label82: {
                  label111: {
                     long var34 = 2182808553825895088L;
                     Minecraft var17 = field_43;
                     C_47UZ var14 = var17.field_44Q
                        .method_49$0bfd666c6c(var13.method_40$8abf5c6871(), var13.method_43$8abf5c6871(), var13.method_47$8abf5c6871());
                     Object var28 = var14;
                     if (var11 == null) {
                        if (var14 == null) {
                           break label111;
                        }

                        var28 = field_42.get(var14.method_48$e084f7739d());
                     }

                     var29 = ((C_47x7)var28).field_47;
                     if (var11 != null) {
                        break label82;
                     }

                     if (!((C_47x7)var28).field_47) {
                        var29 = true;
                        break label82;
                     }
                  }

                  var29 = false;
               }

               boolean var15 = var29;
               boolean var30 = var15;
               if (var11 == null) {
                  if (!var15) {
                     break label114;
                  }

                  long var10002 = 2183061411283756581L;
                  long var18 = var6;
                  ModeSetting var20 = this.settingMode;
                  String var31 = var20.method_46$5f9dc63072(var18);
                  if (var11 != null) {
                     break label114;
                  }

                  var30 = var31.equals(recovery$indy$19(23904, 4844597503499746350L ^ var4));
               }

               if (var30) {
                  C_42N var32 = this.field_49;
                  Object var10003 = field_44.get(var13);
                  byte var10005 = (byte)var10;
                  C_477w var36 = (C_477w)var10003;
                  long var37 = 2182596826773104881L;
                  C_477w var21 = var36;
                  byte var22 = var10005;
                  int var23 = var9;
                  int var24 = var8;
                  C_42N var25 = var32;
                  var25.method_40$850da7b6da(var24, var23, var22, var21);
               }

               field_44.remove(var13);
            }

            var27 = var11;
         }

         if (var27 != null) {
            break;
         }
      }
   }




   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 113291047341997L;
      recovery$indy$20(this, var3, -7741410148311335321L, var1);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 125750750527195L;
      recovery$indy$21(this, var6, 2731126596571156241L, var4);
      recovery$indy$22(field_43, 2730979813519178108L, var4).method_42$da8c82d5d4();
   }



    public BlockESP_47QJ(long a0) {
        super((java.lang.String) ("BlockESP"),(java.lang.String) ("BlockDurchWandSehen"),(long) (((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 91203903308536L)),(java.awt.Color) (new java.awt.Color((int) (171),(int) (9),(int) (41))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 108915153030926L);
        long constructorKey4 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 30733624132331L);
        long constructorKey5 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 27792752947765L);
        long constructorKey6 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 80455610052161L);
        long constructorKey7 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 61039113517701L);
        long constructorKey8 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 59816475434252L);
        long constructorKey9 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 78373564079814L);
        long constructorKey10 = ((augustus.recovered.modules.render.BlockESP_47QJ.a ^ a0) ^ 16010039566692L);
        java.lang.Object initialValue11 = recovery$indy$flow$201(2);
        ((java.lang.Object[]) initialValue11)[0] = "Old";
        ((java.lang.Object[]) initialValue11)[1] = "New";
        client.setting.ModeSetting initialized12 = new client.setting.ModeSetting(this, "Mode", constructorKey5, "Old", (java.lang.String[]) (initialValue11));
        java.lang.Object initialValue13 = recovery$indy$flow$203(this);
        java.lang.Object initialValue14 = initialValue13;
        client.setting.ModeSetting initialValue15 = initialized12;
        java.lang.Object initialValue16 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue17 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue18 = recovery$indy$flow$206(initialValue16, initialValue17);
        recovery$indy$flow$207(this, initialValue18);
        java.awt.Color initialized19 = new java.awt.Color(21, 121, 230, 65);
        client.setting.ColorSetting initialized20 = new client.setting.ColorSetting(constructorKey9, this, "Color", initialized19);
        recovery$indy$flow$212(this, initialized20);
        java.lang.Object initialValue21 = recovery$indy$flow$213();
        client.setting.NumberSetting initialized22 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4618441417868443648L), constructorKey10, 0.0D, Double.longBitsToDouble(4624633867356078080L), 0);
        java.lang.Object initialValue23 = recovery$indy$flow$216(this);
        java.lang.Object initialValue24 = initialValue23;
        client.setting.NumberSetting initialValue25 = initialized22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$219(initialValue26, initialValue27);
        recovery$indy$flow$220(this, initialValue28);
        client.setting.NumberSetting initialized29 = new client.setting.NumberSetting(this, "ID", Double.longBitsToDouble(4628011567076605952L), constructorKey10, 1.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        recovery$indy$flow$223(this, initialized29);
        java.lang.Object initialValue30 = initialValue21;
        client.setting.ShaderOptions initialized31 = new client.setting.ShaderOptions(this, constructorKey6);
        long initialValue32 = constructorKey7;
        client.setting.ShaderOptions initialValue33 = initialized31;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = recovery$indy$flow$227(initialValue34, initialValue32);
        java.lang.Object initialValue36 = recovery$indy$flow$228();
        java.lang.Object initialValue37 = initialValue36;
        long initialValue38 = constructorKey8;
        java.lang.Object initialValue39 = initialValue35;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue42 = recovery$indy$flow$231(initialValue40, initialValue38, initialValue41);
        recovery$indy$flow$232(this, initialValue42);
        recovery$indy$flow$233(this, 0L);
        net.C_42N initialized43 = new net.C_42N(constructorKey4, 200);
        recovery$indy$flow$236(this, initialized43);
        recovery$indy$flow$237(this, false);
        java.lang.Object initialValue44 = recovery$indy$flow$238();
        java.lang.Object initialValue45 = recovery$indy$flow$239(initialValue44);
        java.lang.Object initialValue46 = recovery$indy$flow$240(initialValue45);
        java.lang.Object initialValue47 = initialValue46;
        BlockESP_47QJ loopLocal48 = this;
        long loopLocal49 = constructorKey3;
        java.lang.Object loopLocal50 = initialValue30;
        java.lang.Object loopLocal51 = initialValue47;
        BlockESP_47QJ loopExit55;
        long loopExit56;
        java.lang.Object loopExit57;
        loop52: while (true) {
            boolean initialValue53 = recovery$indy$flow$241(loopLocal51);
            if ((int) ((initialValue53 ? 1 : 0)) == 0) {
                java.lang.Object initialValue54 = recovery$indy$flow$251();
                BlockESP_47QJ loopNext58 = loopLocal48;
                long loopNext59 = loopLocal49;
                java.lang.Object loopNext60 = initialValue54;
                loopExit55 = loopNext58;
                loopExit56 = loopNext59;
                loopExit57 = loopNext60;
                break loop52;
            } else {
                java.lang.Object initialValue61 = recovery$indy$flow$242(loopLocal51);
                java.lang.Object initialValue62 = ((java.lang.Object)(((net.minecraft.util.ResourceLocation) (((java.lang.Object)(initialValue61))))));
                java.lang.Object initialValue63 = initialValue62;
                java.lang.Object initialValue64 = recovery$indy$flow$244(initialValue63);
                java.lang.Object initialValue65 = initialValue64;
                java.lang.Object initialValue66 = recovery$indy$flow$245(initialValue65);
                java.lang.Object initialValue67 = initialValue66;
                java.lang.Object initialValue68 = recovery$indy$flow$246();
                if (loopLocal50 != null) {
                    BlockESP_47QJ loopNext69 = loopLocal48;
                    long loopNext70 = loopLocal49;
                    java.lang.Object loopNext71 = initialValue68;
                    loopExit55 = loopNext69;
                    loopExit56 = loopNext70;
                    loopExit57 = loopNext71;
                    break loop52;
                } else {
                    java.lang.Object initialValue72 = recovery$indy$flow$248();
                    int merged73;
                    if (((java.lang.Object) initialValue67) != ((java.lang.Object) initialValue72)) {
                        merged73 = 0;
                    } else {
                        merged73 = 1;
                    }
                    net.C_47x7 initialized74 = new net.C_47x7((augustus.recovered.modules.render.BlockESP_47QJ) (loopLocal48), (java.lang.String) (initialValue65), (merged73 != 0), null);
                    java.lang.Object initialValue75 = recovery$indy$flow$250(initialValue68, initialValue67, initialized74);
                    if (loopLocal50 == null) {
                        BlockESP_47QJ loopNext76 = loopLocal48;
                        long loopNext77 = loopLocal49;
                        java.lang.Object loopNext78 = loopLocal50;
                        java.lang.Object loopNext79 = loopLocal51;
                        loopLocal48 = loopNext76;
                        loopLocal49 = loopNext77;
                        loopLocal50 = loopNext78;
                        loopLocal51 = loopNext79;
                        continue loop52;
                    } else {
                        java.lang.Object initialValue80 = recovery$indy$flow$251();
                        BlockESP_47QJ loopNext81 = loopLocal48;
                        long loopNext82 = loopLocal49;
                        java.lang.Object loopNext83 = initialValue80;
                        loopExit55 = loopNext81;
                        loopExit56 = loopNext82;
                        loopExit57 = loopNext83;
                        break loop52;
                    }
                }
            }
        }
        java.lang.Object initialValue84 = recovery$indy$flow$252(loopExit57);
        java.lang.Object initialValue85 = recovery$indy$flow$253(0);
        java.lang.Object initialValue86 = recovery$indy$flow$254(initialValue84, initialValue85);
        java.lang.Object initialValue87 = recovery$indy$flow$255(initialValue86);
        java.lang.Object initialValue88 = initialValue87;
        java.lang.Object initialValue89 = recovery$indy$flow$256();
        java.lang.Object initialValue90 = recovery$indy$flow$257(initialValue89);
        recovery$indy$flow$258(initialValue88, initialValue90);
        client.setting.MultiSelectSetting initialized91 = new client.setting.MultiSelectSetting((client.module.Module) (loopExit55), "Blocks", loopExit56, (net.C_47OZ[]) (initialValue88));
        return;
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$134(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,boolean a1,boolean a2);
    private static native java.lang.Object recovery$indy$flow$201(int a0);
    private static native java.lang.Object recovery$indy$flow$203(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$207(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$212(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$213();
    private static native java.lang.Object recovery$indy$flow$216(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$219(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$220(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$227(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$228() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$231(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$232(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$233(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.render.BlockESP_47QJ) (a0)).field_46 = a1;
        return;
    }
    private static void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.BlockESP_47QJ) (a0)).field_49 = ((net.C_42N) (a1));
        return;
    }
    private static void recovery$indy$flow$237(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.BlockESP_47QJ) (a0)).field_43a = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$238() {
        return net.C_475y.field_49H;
    }
    private static native java.lang.Object recovery$indy$flow$239(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$240(java.lang.Object a0) {
        return ((java.util.Set) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$241(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$242(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$244(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$246() {
        return augustus.recovered.modules.render.BlockESP_47QJ.field_42;
    }
    private static java.lang.Object recovery$indy$flow$248() {
        return net.C_45z.field_46_;
    }
    private static java.lang.Object recovery$indy$flow$250(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$251() {
        return augustus.recovered.modules.render.BlockESP_47QJ.field_42;
    }
    private static java.lang.Object recovery$indy$flow$252(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).values();
    }
    private static native java.lang.Object recovery$indy$flow$253(int a0);
    private static java.lang.Object recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Collection) (a0)).toArray(((java.lang.Object[]) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$255(java.lang.Object a0) {
        return ((net.C_47x7[]) (a0));
    }
    private static native java.lang.Object recovery$indy$flow$256();
    private static java.lang.Object recovery$indy$flow$257(java.lang.Object a0) {
        return java.util.Comparator.comparing(((java.util.function.Function) (a0)));
    }
    private static void recovery$indy$flow$258(java.lang.Object a0,java.lang.Object a1) {
        java.util.Arrays.sort(((java.lang.Object[]) (a0)), ((java.util.Comparator) (a1)));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47UZ recovery$indy$2(Object var0, long var1, long var3);
   private static native C_47UZ recovery$indy$3(Object var0, long var1, long var3);
   private static native C_47UZ recovery$indy$4(Object var0, long var1, long var3);
   private static native C_478Q recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native C_47UZ recovery$indy$6(Object var0, long var1, long var3);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native Runnable recovery$indy$9(BlockESP_47QJ var0, C_477w var1);
   private static native void recovery$indy$10(Object var0, int var1, char var2, short var3, long var4, long var6);
   private static native void recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$19(int var0, long var1);
   private static native void recovery$indy$20(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native RenderGlobal recovery$indy$22(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$26();
}
