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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47Vc;
import client.event.RenderListener;
import net.C_47j9;
import net.C_47nb;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MoveCircles_47Hd extends client.module.Module implements client.event.RenderListener,net.C_47Vc {
    private final client.setting.NumberSetting settingCircleRadius = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCircleWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCircleColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingCircleAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAnimationTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFadeOut = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingFadeOutAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingFadeOutTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTicksBetweenCircles = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyAfterJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

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

    private static native java.lang.reflect.Method d(long a0,long a1);

   static ModeSetting method_45$0bcfc732e9(MoveCircles_47Hd var0) {
      return var0.settingCircleAnimation;
   }



   static NumberSetting method_45$5c3b857a9e(MoveCircles_47Hd var0) {
      return var0.settingAnimationTime;
   }



   public void onRender3D(long var1, float var3) {
        int var13;
        double var16;
        int[] var17;
      long var4 = var1 ^ 57482311646357L;
      long var6 = var1 ^ 8944581653787L;
      int[] var8 = (int[])recovery$indy$flow$2(8136101240182466734L, var1);
      java.util.concurrent.CopyOnWriteArrayList var10000 = this.field_44;
      if (var8 == null) {
         if (this.field_44.isEmpty()) {
            return;
         }

         client.render.RenderUtils.method_42$da8c82d5d4();
         var10000 = this.field_44;
      }

      java.util.Iterator var9 = var10000.iterator();

      while (true) {
         if (var9.hasNext()) {
            net.C_47bD var10 = (net.C_47bD)var9.next();
            if (var8 != null) {
               break;
            }

            double var18;
            label158: {
               double var19;
               var13 = (var19 = var10.field_41.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
               label157:
               if (var8 == null) {
                  label155: {
                     label154:
                     if (var13 >= 0) {
                        boolean var14 = recovery$indy$flow$14(this.settingFadeOut, 8136417308527443222L, var1);
                        int[] var10001 = var8;
                        if (var1 >= 0L) {
                           if (var8 == null) {
                              if (var14) {
                                 net.C_47bD var15 = var10;
                                 if (var8 == null) {
                                    if (var10.field_42 < 1.0) {
                                       var10.field_46
                                          .method_44$7c39c8007b(
                                             (int)recovery$indy$flow$18(this.settingFadeOutTime, var4, 8136505205552151360L, var1),
                                             net.C_47nb.method_41$7498260812(
                                                (String)recovery$indy$flow$21(this.settingFadeOutAnimation, var6, 8136024413120621723L, var1)
                                             ),
                                             0,
                                             false
                                          );
                                    }

                                    var15 = var10;
                                 }

                                 var15.field_45 = net.C_47sk.method_45$4b58f7ab41(var10.field_45 * var10.field_46.method_45$fedcb3e4d3(), 0.0, 255.0);
                              }

                              var14 = recovery$indy$flow$30(this.settingFadeOut, 8136417308527443222L, var1);
                           }

                           var10001 = var8;
                        }

                        if (var10001 == null) {
                           if (var14) {
                              var16 = var10.field_46.method_48$fedcb3e4d3();
                              var18 = 1.0;
                              if (var1 < 0L) {
                                 break label158;
                              }

                              double var20;
                              var13 = (var20 = var16 - 1.0) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
                              if (var8 != null) {
                                 break label157;
                              }

                              if (var13 < 0) {
                                 break label154;
                              }
                           }

                           this.field_44.remove(var10);
                        }

                        if (var1 <= 0L) {
                           break label155;
                        }

                        if (var8 == null) {
                           continue;
                        }
                     }

                     var10.field_42 = var10.field_41.method_48$fedcb3e4d3();
                     org.lwjgl.opengl.GL11.glPushMatrix();
                     org.lwjgl.opengl.GL11.glTranslated(
                        var10.field_47 - ((net.C_47j9)recovery$indy$flow$41(field_43, 8135819476600652496L, var1)).method_41$fedcb3e4d3(),
                        var10.field_49 - ((net.C_47j9)recovery$indy$flow$45(field_43, 8135819476600652496L, var1)).method_49$fedcb3e4d3(),
                        var10.field_42b - ((net.C_47j9)recovery$indy$flow$49(field_43, 8135819476600652496L, var1)).method_45$fedcb3e4d3()
                     );
                     org.lwjgl.opengl.GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                     org.lwjgl.opengl.GL11.glLineWidth(var10.field_48);
                     client.render.RenderUtils.method_43$d00df7729d(var10.field_42v);
                  }

                  var13 = 3;
               }

               org.lwjgl.opengl.GL11.glBegin(var13);
               var16 = var10.field_40;
               var18 = var10.field_41.method_45$fedcb3e4d3();
            }

            float var11 = (float)(var16 * var18);
            int var12 = 0;

            label135: {
               label134: {
                  label133:
                  while (true) {
                     if (var12 <= 360) {
                        org.lwjgl.opengl.GL11.glVertex2f((float)(var11 * Math.cos(var12 * Math.PI / 180.0)), (float)(var11 * Math.sin(var12 * Math.PI / 180.0)));
                        var12++;

                        while (true) {
                           var17 = var8;
                           if (var1 <= 0L) {
                              break label135;
                           }

                           if (var8 != null) {
                              break label134;
                           }

                           if (var8 == null) {
                              break;
                           }

                           org.lwjgl.opengl.GL11.glEnd();
                           if (var1 >= 0L) {
                              break label133;
                           }
                        }
                     } else {
                        while (true) {
                           org.lwjgl.opengl.GL11.glEnd();
                           if (var1 >= 0L) {
                              break label133;
                           }

                           var17 = var8;
                           if (var1 <= 0L) {
                              break label135;
                           }

                           if (var8 != null) {
                              break label134;
                           }

                           if (var8 == null) {
                              break;
                           }
                        }
                     }
                  }

                  org.lwjgl.opengl.GL11.glPopMatrix();
               }

               var17 = var8;
            }

            if (var17 == null) {
               continue;
            }
         }

         if (var1 > 0L) {
            client.render.RenderUtils.method_43$da8c82d5d4();
         }
         break;
      }
   }





   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 93125334867209L;
      long var8 = var4 ^ 90944262240760L;
      long var10001 = var4 ^ 53292672869345L;
      int var10 = (int)((var4 ^ 53292672869345L) >>> 32);
      int var11 = (int)((var4 ^ 53292672869345L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var4 ^ 127209545237043L;
      int[] var15 = (int[])recovery$indy$flow$67(5869698901861583154L, var4);
      boolean var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, 5869755205763333679L, var4)).field_48M;
      if (var15 != null) {
         if (var10000) {
            this.field_42++;
         }
      } else {
         label50:
         if (var10000 && this.field_42 >= recovery$indy$flow$73(this.settingTicksBetweenCircles, var6, 5870104108140616412L, var4)) {
            MoveCircles_47Hd var16 = this;
            if (var1 >= 0) {
               if (recovery$indy$flow$75(this.settingOnlyAfterJump, 5869945801569672330L, var4)
                  && this.field_43a == ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$78(field_43, 5869755205763333679L, var4)).field_48M) {
                  break label50;
               }

               this.field_42 = 0;
               this.field_44
                  .add(
                     new net.C_47bD(
                        var8,
                        this,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$84(field_43, 5869755205763333679L, var4)).field_48Q,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$87(field_43, 5869755205763333679L, var4)).field_48j,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$90(field_43, 5869755205763333679L, var4)).field_42o,
                        (float)recovery$indy$flow$93(this.settingCircleWidth, var6, 5870104108140616412L, var4),
                        (float)recovery$indy$flow$95(this.settingCircleRadius, var6, 5870104108140616412L, var4),
                        recovery$indy$flow$98(this.settingCircleColor, var10, (short)var11, (char)var12, this.field_43y, 5869352264367271578L, var4)
                     )
                  );
               var16 = this;
            }

            var16.field_43y++;
         }

         this.field_43a = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$104(field_43, 5869755205763333679L, var4)).field_48M;
         if (recovery$indy$flow$107(var13, 5869833038977290301L, var4)) {
            this.field_42++;
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$22(this, 32, var3, -7099036107405510889L, var1);
      recovery$indy$23(this, 43, var3, -7099036107405510889L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43y = 0;
      this.field_42 = 0;
   }



    public MoveCircles_47Hd(long a0) {
        super((java.lang.String) ("MoveCircles"),(java.lang.String) ("BewegungsKreise"),(long) (((augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0) ^ 98954881348675L)),(java.awt.Color) (new java.awt.Color((int) (245),(int) (152),(int) (217))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0) ^ 20116215809166L);
        long constructorKey4 = ((augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0) ^ 44922022127704L);
        long constructorKey5 = ((augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0) ^ 6060374480863L);
        long constructorKey6 = ((augustus.recovered.modules.render.MoveCircles_47Hd.a ^ a0) ^ 83886864148605L);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "CircleRadius", Double.longBitsToDouble(4609434218613702656L), constructorKey5, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4613937818241073152L), 2);
        recovery$indy$flow$116(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "CircleWidth", 1.0D, constructorKey5, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4619567317775286272L), 2);
        recovery$indy$flow$119(this, initialized8);
        java.awt.Color initialized9 = new java.awt.Color(75, 209, 242);
        client.setting.ColorSetting initialized10 = new client.setting.ColorSetting(constructorKey6, this, "CircleColor", initialized9);
        recovery$indy$flow$124(this, initialized10);
        java.lang.Object initialValue11 = recovery$indy$flow$126(false);
        client.setting.ModeSetting initialized12 = new client.setting.ModeSetting(this, "CircleAnimation", constructorKey3, "easeInSine", (java.lang.String[]) (initialValue11));
        recovery$indy$flow$128(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "AnimationTime", Double.longBitsToDouble(4647503709213818880L), constructorKey5, Double.longBitsToDouble(4632233691727265792L), Double.longBitsToDouble(4654311885213007872L), 0);
        recovery$indy$flow$131(this, initialized13);
        client.setting.BooleanSetting initialized14 = new client.setting.BooleanSetting(this, constructorKey4, "FadeOut", true);
        recovery$indy$flow$134(this, initialized14);
        java.lang.Object initialValue15 = recovery$indy$flow$136(false);
        client.setting.ModeSetting initialized16 = new client.setting.ModeSetting(this, "FadeOutAnimation", constructorKey3, "easeInSine", (java.lang.String[]) (initialValue15));
        java.lang.Object initialValue17 = ((java.lang.Object)(((augustus.recovered.modules.render.MoveCircles_47Hd) (((java.lang.Object)(this)))).settingFadeOut));
        java.lang.Object initialValue18 = recovery$indy$flow$139(initialValue17);
        java.lang.Object initialValue19 = recovery$indy$flow$140(initialValue17);
        java.lang.Object initialValue20 = initialValue19;
        client.setting.ModeSetting initialValue21 = initialized16;
        java.lang.Object initialValue22 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue23 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue24 = recovery$indy$flow$143(initialValue22, initialValue23);
        recovery$indy$flow$144(this, initialValue24);
        client.setting.NumberSetting initialized25 = new client.setting.NumberSetting(this, "FadeOutTime", Double.longBitsToDouble(4647503709213818880L), constructorKey5, Double.longBitsToDouble(4632233691727265792L), Double.longBitsToDouble(4654311885213007872L), 0);
        java.lang.Object initialValue26 = ((java.lang.Object)(((augustus.recovered.modules.render.MoveCircles_47Hd) (((java.lang.Object)(this)))).settingFadeOut));
        java.lang.Object initialValue27 = recovery$indy$flow$148(initialValue26);
        java.lang.Object initialValue28 = recovery$indy$flow$149(initialValue26);
        java.lang.Object initialValue29 = initialValue28;
        client.setting.NumberSetting initialValue30 = initialized25;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue33 = recovery$indy$flow$152(initialValue31, initialValue32);
        recovery$indy$flow$153(this, initialValue33);
        client.setting.NumberSetting initialized34 = new client.setting.NumberSetting(this, "TicksBetweenCircles", Double.longBitsToDouble(4617315517961601024L), constructorKey5, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$156(this, initialized34);
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, constructorKey4, "OnlyAfterJump", false);
        recovery$indy$flow$159(this, initialized35);
        java.util.concurrent.CopyOnWriteArrayList initialized36 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$162(this, initialized36);
        recovery$indy$flow$163(this, 0);
        recovery$indy$flow$164(this, 0);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$2(long a0,long a1);
    private static native boolean recovery$indy$flow$14(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$18(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$21(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$30(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$45(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$49(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$67(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$73(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$75(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$84(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$87(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$93(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$95(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$98(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$104(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$107(long a0,long a1,long a2);
    private static native void recovery$indy$flow$116(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$119(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$126(boolean a0);
    private static native void recovery$indy$flow$128(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$131(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$134(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$136(boolean a0);

    private static java.lang.Object recovery$indy$flow$139(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$140(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$143(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$144(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$148(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$149(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$159(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$162(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$163(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.MoveCircles_47Hd) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$164(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.MoveCircles_47Hd) (a0)).field_42 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$26();
}
