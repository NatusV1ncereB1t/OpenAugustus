package augustus.recovered.modules.render;
import io.netty.channel.ChannelHandler;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_42V;
import net.C_42a;
import net.C_473U;
import net.C_476l;
import net.minecraft.client.gui.ScaledResolution;
import net.C_479E;
import net.C_479J;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Iw;
import net.C_47K6;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import net.C_47Pf;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47Vt;
import client.event.RenderListener;
import net.C_47bi;
import net.C_47iC;
import net.C_47ob;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class DebugInformation_47HS extends client.module.Module implements client.event.RenderListener,net.C_47iC,net.C_47xz {
    private final client.setting.MultiSelectSetting settingDebugInformation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.GregorianCalendar field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    public int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    public float field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      net.C_473U var14;
      augustus.recovered.modules.render.DebugInformation_47HS var15;
      long var4;
      int[] var6;
      C_473U var7;
      int[] var16;
      int var10000;
      label130: {
         label129: {
            label133: {
               label127: {
                  var4 = var1 ^ 119064065082511L;
                  var6 = recovery$indy$1(-7188084244928134718L, var1);
                  var7 = recovery$indy$2(var3, -7192206780273150589L, var1);
                  var10000 = (int) ((var7 instanceof C_47bi) ? 1 : 0);
                  label126:
                  if (var6 == null) {
                     if (var10000 == 0) {
                        var10000 = (int) ((var7 instanceof C_476l) ? 1 : 0);
                        var16 = var6;
                        if (var1 <= 0L) {
                           break label127;
                        }

                        if (var6 != null) {
                           break label126;
                        }

                        if (var10000 == 0) {
                           var10000 = (int) ((var7 instanceof C_42V) ? 1 : 0);
                           if (var6 != null) {
                              break label129;
                           }

                           if (var10000 == 0) {
                              break label133;
                           }
                        }
                     }

                     var10000 = (int) ((recovery$indy$3(field_43, -7191153014540919541L, var1).method_47$aae029aa0a()) ? 1 : 0);
                  }

                  var16 = var6;
               }

               if (var16 != null) {
                  break label129;
               }

               label112:
               if (var10000 == 0) {
                  label135: {
                     var10000 = (int) ((var7 instanceof C_42V) ? 1 : 0);
                     var16 = var6;
                     if (var1 >= 0L) {
                        if (var6 == null) {
                           if (var10000 == 0) {
                              break label135;
                           }

                           var10000 = ((C_42V)var7).method_44$8abf5c6871();
                        }

                        var16 = var6;
                     }

                     if (var1 < 0L) {
                        break label130;
                     }

                     if (var16 != null) {
                        break label129;
                     }

                     if (var10000 != 255) {
                        break label112;
                     }
                  }

                  this.field_42++;
               }
            }

            var10000 = (int) ((var7 instanceof C_479E) ? 1 : 0);
         }

         var16 = var6;
      }

      label91: {
         label136: {
            label137: {
               if (var16 == null) {
                  if (var10000 == 0) {
                     return;
                  }

                  var14 = var7;
                  if (var6 != null) {
                     break label137;
                  }

                  var10000 = (int) ((var7 instanceof C_479J) ? 1 : 0);
               }

               if (var10000 == 0) {
                  var14 = var7;
                  if (var6 != null) {
                     break label137;
                  }

                  if (!(var7 instanceof C_479m)) {
                     break label136;
                  }
               }

               var14 = var7;
            }

            C_479E var8 = (C_479E)var14;
            double var9 = Math.abs(var8.method_47$fedcb3e4d3() - this.field_43F);
            double var11 = Math.abs(var8.method_42$fedcb3e4d3() - this.field_430);
            float var13 = (float)(Math.hypot(var11, var9) * 20.0);
            recovery$indy$4(this, var13, var4, -7191306612983985584L, var1);
            this.field_43F = var8.method_47$fedcb3e4d3();
            var15 = this;
            if (var1 < 0L) {
               break label91;
            }

            this.field_430 = var8.method_42$fedcb3e4d3();
            if (var6 == null) {
               return;
            }
         }

         var15 = this;
      }

      recovery$indy$5(var15, 0.0F, var4, -7191306612983985584L, var1);
   }




   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 7023048545254L;
      long var10 = var6 ^ 79469613767391L;
      GL11.glPushMatrix();
      GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
      GL11.glTranslated(
         recovery$indy$6(this.settingPosX, var10, 1630887911149694058L, var6) / 100.0 * field_43.field_44f,
         recovery$indy$7(this.settingPosY, var10, 1630887911149694058L, var6) / 100.0 * field_43.field_44g,
         0.0
      );
      GL11.glScaled(recovery$indy$8(this.settingScale, var10, 1630887911149694058L, var6), recovery$indy$9(this.settingScale, var10, 1630887911149694058L, var6), 1.0);
      recovery$indy$10(this, var8, 1630939660789447161L, var6);
      GL11.glPopMatrix();
      RenderUtils.method_41$da8c82d5d4();
   }



   private void method_45$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 127683537112749L;
      long var5 = var1 ^ 107019112847217L;
      long var7 = var1 ^ 38089757845409L;
      int[] var9 = recovery$indy$11(-9154190046716945143L, var1);
      ArrayList var10 = new ArrayList();
      byte var10000 = (byte) ((recovery$indy$12(C_47Iw.FPS, -9152766293840923031L, var1)) ? 1 : 0);
      if (var9 == null) {
         if ((var10000) != 0) {
            var10.add(new C_42a(recovery$indy$13(22760, 2487860883362652337L ^ var1), recovery$indy$14(-9152464453683905029L, var1)));
         }

         var10000 = (byte) ((recovery$indy$15(C_47Iw.PING, -9152766293840923031L, var1)) ? 1 : 0);
      }

      int[] var10001 = var9;
      if (var1 > 0L) {
         if (var9 == null) {
            if ((var10000) != 0) {
               var10.add(
                  new C_42a(
                     recovery$indy$16(14372, 7552408083570180195L ^ var1),
                     recovery$indy$17(ClientGlobals.field_48.field_48U.settingOtherPingCalculation, -9154236193002567443L, var1)
                        ? recovery$indy$18(var7, -9153364849763087244L, var1)
                        : (
                           recovery$indy$19(field_43, -9151632924794836365L, var1) != null
                                 && recovery$indy$20(field_43, -9151632924794836365L, var1)
                                       .method_46$f2f51c3dae(recovery$indy$21(field_43, -9151792419431884655L, var1).method_46$48a3a9a042())
                                    != null
                              ? recovery$indy$22(field_43, -9151632924794836365L, var1)
                                 .method_46$f2f51c3dae(recovery$indy$23(field_43, -9151792419431884655L, var1).method_46$48a3a9a042())
                                 .method_40$8abf5c6871()
                              : 0
                        )
                  )
               );
            }

            var10000 = (byte) ((recovery$indy$24(C_47Iw.CPS, -9152766293840923031L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if ((var10000) != 0) {
               var10.add(new C_42a(recovery$indy$25(27803, 7728264516752872654L ^ var1), this.field_43y));
            }

            var10000 = (byte) ((recovery$indy$26(C_47Iw.POS_X, -9152766293840923031L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if ((var10000) != 0) {
               var10.add(
                  new C_42a(
                     "X",
                     recovery$indy$27(ClientGlobals.field_48.field_48M, var3, -9151575653370921569L, var1)
                        ? (int)recovery$indy$28(field_43, -9151792419431884655L, var1).field_48Q
                           + recovery$indy$29(ClientGlobals.field_48.field_48M, -9152566024145250463L, var1)
                        : (int)recovery$indy$30(field_43, -9151792419431884655L, var1).field_48Q
                  )
               );
            }

            var10000 = (byte) ((recovery$indy$31(C_47Iw.POS_Y, -9152766293840923031L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if ((var10000) != 0) {
               var10.add(new C_42a("Y", (int)recovery$indy$32(field_43, -9151792419431884655L, var1).field_48j));
            }

            var10000 = (byte) ((recovery$indy$33(C_47Iw.POS_Z, -9152766293840923031L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if ((var10000) != 0) {
               var10.add(
                  new C_42a(
                     "Z",
                     recovery$indy$34(ClientGlobals.field_48.field_48M, var3, -9151575653370921569L, var1)
                        ? (int)recovery$indy$35(field_43, -9151792419431884655L, var1).field_42o
                           + recovery$indy$36(ClientGlobals.field_48.field_48M, -9151722738794933010L, var1)
                        : (int)recovery$indy$37(field_43, -9151792419431884655L, var1).field_42o
                  )
               );
            }

            var10000 = (byte) ((recovery$indy$38(C_47Iw.BPS, -9152766293840923031L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var10001 == null && (var10000 != 0)) {
         var10.add(new C_42a(recovery$indy$39(30017, 4585702957922979088L ^ var1), this.field_46));
      }

      label235: {
         ChannelHandler var11 = recovery$indy$40(field_43, -9151632924794836365L, var1).method_49$431840b606().field_43.pipeline().get(C_47Vt.class);
         ChannelHandler var17 = var11;
         if (var9 == null) {
            if (!(var11 instanceof C_47Vt)) {
               break label235;
            }

            var17 = var11;
         }

         C_47Vt var12 = (C_47Vt)var17;
         var10000 = (byte) ((recovery$indy$41(C_47Iw.RX, -9152766293840923031L, var1)) ? 1 : 0);
         var10001 = var9;
         if (var1 >= 0L) {
            if (var9 == null) {
               if ((var10000) != 0) {
                  var10.add(
                     new C_42a(
                        recovery$indy$42(8913, 6740499080436898439L ^ var1),
                        Math.round(recovery$indy$43(var12, -9153072307102332099L, var1)) + recovery$indy$44(15468, 1773878564423582783L ^ var1)
                     )
                  );
               }

               var10000 = (byte) ((recovery$indy$45(C_47Iw.TX, -9152766293840923031L, var1)) ? 1 : 0);
            }

            var10001 = var9;
         }

         if (var1 >= 0L) {
            if (var10001 == null) {
               if ((var10000) != 0) {
                  var10.add(
                     new C_42a(
                        recovery$indy$46(32240, 6537339532366382518L ^ var1),
                        Math.round(recovery$indy$47(var12, -9152828108587252218L, var1)) + recovery$indy$48(29749, 3638990097507617896L ^ var1)
                     )
                  );
               }

               var10000 = (byte) ((recovery$indy$49(C_47Iw.DOWNLOAD, -9152766293840923031L, var1)) ? 1 : 0);
            }

            var10001 = var9;
         }

         if (var1 > 0L) {
            if (var10001 == null) {
               if ((var10000) != 0) {
                  var10.add(
                     new C_42a(
                        recovery$indy$50(27629, 5689300143232717747L ^ var1),
                        recovery$indy$52(recovery$indy$51(var12, -9152945000309006256L, var1), var5, -9153101106109456089L, var1)
                           + recovery$indy$53(29749, 3638990097507617896L ^ var1)
                     )
                  );
               }

               var10000 = (byte) ((recovery$indy$54(C_47Iw.UPLOAD, -9152766293840923031L, var1)) ? 1 : 0);
            }

            var10001 = var9;
         }

         if (var10001 == null && (var10000 != 0)) {
            var10.add(
               new C_42a(
                  recovery$indy$55(17275, 2892639744468892451L ^ var1),
                  recovery$indy$57(recovery$indy$56(var12, -9152926380048510685L, var1), var5, -9153101106109456089L, var1)
                     + recovery$indy$58(29749, 3638990097507617896L ^ var1)
               )
            );
         }
      }

      Date var16 = null;
      if (recovery$indy$59(C_47Iw.DATE, -9152766293840923031L, var1)) {
         var10.add(new C_42a(recovery$indy$60(26332, 5130130955132313230L ^ var1), DateFormat.getDateInstance(2).format(var16 = new Date())));
      }

      var10000 = (byte) ((recovery$indy$61(C_47Iw.TIME, -9152766293840923031L, var1)) ? 1 : 0);
      if (var9 == null) {
         if (var10000 != 0) {
            var10.add(new C_42a(recovery$indy$62(11349, 4490256887863956481L ^ var1), DateFormat.getTimeInstance(3).format(var16 == null ? new Date() : var16)));
         }

         var10000 = 0;
      }

      int var13 = var10000;

      while (var13 < var10.size()) {
         C_42a var14 = (C_42a)var10.get(var13);
         recovery$indy$63(field_43, -9153219824534187732L, var1)
            .method_40$b593f01403(
               (String)recovery$indy$64(var14, -9152604921758825202L, var1)
                  + recovery$indy$65(24811, 6237272396082911415L ^ var1)
                  + C_47Pf.GRAY
                  + recovery$indy$66(var14, -9153507713625619787L, var1),
               0.0F,
               var13 * recovery$indy$67(field_43, -9153219824534187732L, var1).field_47,
               -1
            );
         var13++;
         if (var9 != null) {
            break;
         }
      }
   }








   private void method_45$7ad71e9395(float var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = (int[])recovery$indy$flow$258(6701574927258009852L, var2);
      this.field_43W.add(var1);

      while (this.field_43W.size() > 5) {
         this.field_43W.remove(0);
         if (var4 != null) {
            break;
         }
      }

      float var5 = 0.0F;
      java.util.Iterator var10000 = this.field_43W.iterator();
      if (var2 >= 0L) {
         java.util.Iterator var6 = var10000;

         while (var6.hasNext()) {
            float var7 = (Float)var6.next();
            var5 += var7;
            long var15;
            int var12 = (var15 = var2 - 0L) == 0L ? 0 : (var15 < 0L ? -1 : 1);
            if (var4 != null) {
               return;
            }

            if (var4 != null) {
               break;
            }
         }

         Object var11 = this;
         if (var2 > 0L) {
            this.field_46 = (float)(Math.round(var5 / this.field_43W.size() * 100.0F) / 100.0);
            return;
         }

         while (true) {
            float var10 = (Float)var11;
            var5 += var10;
            long var16;
            int var13 = (var16 = var2 - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
            if (var4 != null) {
               return;
            }

            if (var4 == null && var6.hasNext()) {
               var11 = var6.next();
            } else {
               var11 = this;
               long var17;
               var13 = (var17 = var2 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
            }
         }
      }

      while (true) {
         while (var4 != null || this.field_43W.size() <= 5) {
            var5 = 0.0F;
            this.field_43W.iterator();
            long var18;
            int var10001 = (var18 = var2 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
         }

         this.field_43W.remove(0);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$69(this, 32, var3, -7100482140287382738L, var1);
      recovery$indy$70(this, 26, var3, -7100482140287382738L, var1);
      recovery$indy$71(this, 40, var3, -7100482140287382738L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$72(2180729234378818495L, var4);
      this.field_43h.add(this.field_42);

      ArrayList var10000;
      label57: {
         label56:
         while (true) {
            if (this.field_43h.size() > 20) {
               var10000 = this.field_43h;
               if (var1 < 0) {
                  break label57;
               }

               this.field_43h.remove(0);
            } else if (var1 > 0) {
               this.field_43y = 0;
               break;
            }

            do {
               if (var6 != null) {
                  break label56;
               }

               if (var6 == null) {
                  continue label56;
               }
            } while (var1 <= 0);

            this.field_43y = 0;
            break;
         }

         var10000 = this.field_43h;
      }

      Iterator var7 = var10000.iterator();

      label38:
      while (true) {
         Object var9;
         if (var7.hasNext()) {
            var9 = var7.next();
         } else {
            var9 = this;
            if (var3 >= 0) {
               this.field_42 = 0;
               break;
            }
         }

         do {
            int var8 = (Integer)var9;
            this.field_43y += var8;
            int[] var10 = var6;
            if (var1 > 0) {
               if (var6 != null) {
                  return;
               }

               var10 = var6;
            }

            if (var10 == null) {
               continue label38;
            }

            var9 = this;
         } while (var3 < 0);

         this.field_42 = 0;
         break;
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public DebugInformation_47HS(int a0,char a1,char a2) {
        super((java.lang.String) ("DebugInformation"),(java.lang.String) ("DebugInformation"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.DebugInformation_47HS.a) ^ 61216141665630L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (122),(int) (52))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.DebugInformation_47HS.a);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.DebugInformation_47HS.a) ^ 6945618749608L);
        long constructorKey3 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.DebugInformation_47HS.a) ^ 118542416086722L);
        java.lang.Object initialValue4 = recovery$indy$flow$299();
        client.setting.MultiSelectSetting initialized5 = new client.setting.MultiSelectSetting(this, "Debug information", constructorKey2, (net.C_47OZ[]) (initialValue4));
        recovery$indy$flow$301(this, initialized5);
        client.setting.NumberSetting initialized6 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey3, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4616189618054758400L), 2);
        recovery$indy$flow$304(this, initialized6);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "PosX", 0.0D, constructorKey3, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$307(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "PosY", 0.0D, constructorKey3, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$310(this, initialized8);
        java.util.GregorianCalendar initialized9 = new java.util.GregorianCalendar();
        recovery$indy$flow$313(this, initialized9);
        java.util.ArrayList initialized10 = new java.util.ArrayList();
        recovery$indy$flow$316(this, initialized10);
        java.util.ArrayList initialized11 = new java.util.ArrayList();
        recovery$indy$flow$319(this, initialized11);
        recovery$indy$flow$320(this, 0);
        recovery$indy$flow$321(this, 0);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$258(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$299();
    private static native void recovery$indy$flow$301(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$304(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$307(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$310(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$313(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$316(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$319(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$320(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.DebugInformation_47HS) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$321(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.DebugInformation_47HS) (a0)).field_43y = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$3(Object var0, long var1, long var3);
   private static native void recovery$indy$4(Object var0, float var1, long var2, long var4, long var6);
   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4, long var6);
   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$11(long var0, long var2);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native String recovery$indy$13(int var0, long var1);
   private static native int recovery$indy$14(long var0, long var2);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native String recovery$indy$16(int var0, long var1);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native int recovery$indy$18(long var0, long var2, long var4);
   private static native C_47K6 recovery$indy$19(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3);
   private static native String recovery$indy$25(int var0, long var1);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native int recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native boolean recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native int recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native String recovery$indy$39(int var0, long var1);
   private static native C_47K6 recovery$indy$40(Object var0, long var1, long var3);
   private static native boolean recovery$indy$41(Object var0, long var1, long var3);
   private static native String recovery$indy$42(int var0, long var1);
   private static native double recovery$indy$43(Object var0, long var1, long var3);
   private static native String recovery$indy$44(int var0, long var1);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3);
   private static native String recovery$indy$46(int var0, long var1);
   private static native double recovery$indy$47(Object var0, long var1, long var3);
   private static native String recovery$indy$48(int var0, long var1);
   private static native boolean recovery$indy$49(Object var0, long var1, long var3);
   private static native String recovery$indy$50(int var0, long var1);
   private static native long recovery$indy$51(Object var0, long var1, long var3);
   private static native String recovery$indy$52(long var0, long var2, long var4, long var6);
   private static native String recovery$indy$53(int var0, long var1);
   private static native boolean recovery$indy$54(Object var0, long var1, long var3);
   private static native String recovery$indy$55(int var0, long var1);
   private static native long recovery$indy$56(Object var0, long var1, long var3);
   private static native String recovery$indy$57(long var0, long var2, long var4, long var6);
   private static native String recovery$indy$58(int var0, long var1);
   private static native boolean recovery$indy$59(Object var0, long var1, long var3);
   private static native String recovery$indy$60(int var0, long var1);
   private static native boolean recovery$indy$61(Object var0, long var1, long var3);
   private static native String recovery$indy$62(int var0, long var1);
   private static native FontRenderer recovery$indy$63(Object var0, long var1, long var3);
   private static native Object recovery$indy$64(Object var0, long var1, long var3);
   private static native String recovery$indy$65(int var0, long var1);
   private static native Object recovery$indy$66(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$67(Object var0, long var1, long var3);
   private static native void recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$70(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$72(long var0, long var2);
   private static native MethodHandle recovery$constant$73();
}
