package augustus.recovered.modules.latency;
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
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41Q;
import net.C_42L;
import net.C_42V;
import net.C_45J;
import net.C_45n;
import net.C_46s;
import client.render.RenderPass;
import net.C_473U;
import net.C_478i;
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BX;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Fw;
import net.C_47Is;
import net.C_47K6;
import net.C_47K7;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.setting.RangeSetting;
import net.C_47WF;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47dz;
import net.C_47eb;
import net.C_47hH;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47ri;
import client.render.RenderUtils;
import net.C_47s;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_47vS;
import net.C_47vi;
import net.C_47wr;
import net.C_47xZ;
import net.C_47xz;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class PulseBlink_47CZ extends client.module.Module implements net.C_47mz,client.event.RenderListener,net.C_47vi,net.C_47xz,net.C_47iC,net.C_41Q {
    public final client.setting.ModeSetting settingPacketDirection = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingLagBreakTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingLagTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingFlushConditions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTargetESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTargetESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmoothRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingPlayerESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingPlayerESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyInThirdPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native void b();

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method h(long a0,long a1);

   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5;
      long var7;
      long var9;
      long var11;
      String var13;
      C_473U var14;
      int var40;
      String var43;
      label147: {
         var5 = var2 << 16 | (long)var4 << 48 >>> 48;
         var7 = var5 ^ 77811304532827L;
         var9 = var5 ^ 115002472062334L;
         var11 = var5 ^ 13538434133415L;
         long var10000 = 1766733717793915753L;
         var13 = C_47eb.method_48$0e30dfc966();
         long var10001 = 1767598981931558599L;
         C_47zh var16 = var1;
         var14 = var16.method_44$96fcbedb66();
         long var42 = 1773986564972573211L;
         C_47hH var17 = C_47hH.VELOCITY;
         var40 = (int) ((C_47hH.method_48$48d0768a1c(var17)) ? 1 : 0);
         label146:
         if (var13 == null) {
            if (var40 != 0) {
               var40 = (int) ((var14 instanceof C_46s) ? 1 : 0);
               if (var13 != null) {
                  break label146;
               }

               if (var40 != 0) {
                  C_46s var15 = (C_46s)var14;
                  var40 = var15.method_45$8abf5c6871();
                  var43 = var13;
                  if (var2 <= 0L) {
                     break label147;
                  }

                  if (var13 != null) {
                     break label146;
                  }

                  long var10002 = 1769952002112153239L;
                  Minecraft var18 = field_43;
                  if (var40 == var18.field_42P.method_49$8abf5c6871()) {
                     var10002 = 1773030381911809044L;
                     long var19 = var7;
                     PulseBlink_47CZ var21 = this;
                     var21.method_40$e45a9973e5(var19);
                  }
               }
            }

            long var44 = 1773986564972573211L;
            C_47hH var22 = C_47hH.EXPLOSION;
            var40 = (int) ((C_47hH.method_48$48d0768a1c(var22)) ? 1 : 0);
         }

         var43 = var13;
      }

      label133: {
         label132:
         if (var43 == null) {
            if (var40 != 0) {
               var40 = (int) ((var14 instanceof C_42L) ? 1 : 0);
               if (var13 != null) {
                  break label132;
               }

               label128:
               if (var40 != 0) {
                  label151: {
                     C_42L var39 = (C_42L)var14;
                     float var53;
                     var40 = (var53 = var39.method_44$bc607678b6() - 0.0F) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
                     var43 = var13;
                     if (var4 > 0) {
                        if (var13 == null) {
                           if (var40 != 0) {
                              break label151;
                           }

                           float var54;
                           var40 = (var54 = var39.method_49$bc607678b6() - 0.0F) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
                        }

                        var43 = var13;
                     }

                     if (var4 >= 0) {
                        if (var43 == null) {
                           if (var40 != 0) {
                              break label151;
                           }

                           float var55;
                           var40 = (var55 = var39.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
                        }

                        var43 = var13;
                     }

                     if (var4 <= 0) {
                        break label133;
                     }

                     if (var43 != null) {
                        break label132;
                     }

                     if (var40 == 0) {
                        break label128;
                     }
                  }

                  long var50 = 1773030381911809044L;
                  long var23 = var7;
                  PulseBlink_47CZ var25 = this;
                  var25.method_40$e45a9973e5(var23);
               }
            }

            long var46 = 1773986564972573211L;
            C_47hH var26 = C_47hH.TELEPORT;
            var40 = (int) ((C_47hH.method_48$48d0768a1c(var26)) ? 1 : 0);
         }

         var43 = var13;
      }

      label102:
      if (var43 == null) {
         if (var40 != 0) {
            var40 = (int) ((var14 instanceof C_47xZ) ? 1 : 0);
            if (var13 != null) {
               break label102;
            }

            if (var40 != 0) {
               long var51 = 1773030381911809044L;
               long var27 = var7;
               PulseBlink_47CZ var29 = this;
               var29.method_40$e45a9973e5(var27);
            }
         }

         long var52 = 1772499066988900744L;
         long var30 = var9;
         ModeSetting var32 = this.settingPacketDirection;
         var40 = (int) ((var32.method_46$5f9dc63072(var30).equals(recovery$indy$1(7003, 2379210521924498064L ^ var5))) ? 1 : 0);
      }

      if (var40 == 0) {
         Minecraft var41 = field_43;
         if (var13 == null) {
            long var47 = 1769952002112153239L;
            Minecraft var33 = field_43;
            if (var33.field_42P == null) {
               return;
            }

            var41 = field_43;
         }

         long var48 = 1773253984723300940L;
         Minecraft var34 = var41;
         if (var34.field_44Q != null) {
            if (this.field_43a) {
               long var10003 = 1766807892928736300L;
               boolean var35 = true;
               long var36 = var11;
               C_47zh var38 = var1;
               var38.method_47$b757cde368(var36, var35);
            }

            return;
         }
      }
   }





   private void method_46$ad0e900906(RenderPass var1) {
      long var2 = a ^ 64086804997906L;
      long var4 = var2 ^ 12699857014833L;
      long var10001 = 2040551220807197270L;
      Minecraft var6 = field_43;
      long var10004 = 2044441522262756805L;
      long var7 = var4;
      NumberSetting var9 = this.settingLineWidthMe;
      RenderUtils.method_48$45fe1d62b8(var6.field_42P, this.settingClassicColorMe, (float)var9.method_44$474dfaa627(var7), 255, false);
   }



    private static native int e(long a0,long a1);

   private void method_42$758fc8f1b9(Entity var1) {
      long var2 = a ^ 1213832450698L;
      long var4 = var2 ^ 38374983989762L;
      long var10001 = 7622700629307267022L;
      Minecraft var11 = field_43;
      double var7 = var11.field_42P.method_44$ee256e8a75(var1);
      long var10000 = 7628489561293500976L;
      String var16 = C_47eb.method_48$0e30dfc966();
      long var10002 = 7622700629307267022L;
      Minecraft var12 = field_43;
      double var9 = var12.field_42P.method_46$ee256e8a75(var1);
      String var6 = var16;
      double var19;
      int var17 = (var19 = var7 - 2.0) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
      if (var6 == null) {
         if (var17 >= 0) {
            return;
         }

         double var20;
         var17 = (var20 = var9 - 1.0) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      }

      if (var17 < 0) {
         var10002 = 7620782845454675277L;
         long var13 = var4;
         PulseBlink_47CZ var15 = this;
         var15.method_40$e45a9973e5(var13);
      }
   }



   private void method_42$ad0e900906(RenderPass var1) {
      long var2 = a ^ 100268487048115L;
      long var4 = var2 ^ 28916581299163L;
      long var6 = var2 ^ 117596855012496L;
      long var8 = var2 ^ 99260145258995L;
      long var10 = var2 ^ 124416657270305L;
      long var10000 = 4676017334126418697L;
      String var12 = C_47eb.method_48$0e30dfc966();

      for (Object recovered$element$19260 : this.field_43h) {
         EntityLivingBase var14 = (EntityLivingBase) recovered$element$19260;
         boolean var25 = var14 instanceof EntityPlayerSP;
         if (var12 == null) {
            if (var25) {
               continue;
            }

            ColorSetting var10001 = this.settingClassicColorTarget;
            long var10004 = 4683235377278194020L;
            long var15 = var6;
            NumberSetting var17 = this.settingLineWidthTarget;
            float var10002 = (float)var17.method_44$474dfaa627(var15);
            long var10005 = 4683457677628710569L;
            BooleanSetting var18 = this.settingSmoothRendering;
            RenderUtils.method_48$45fe1d62b8(var14, var10001, var10002, 255, var18.method_49$aae029aa0a());
            long var27 = 4676913553243381987L;
            long var19 = var4;
            ShaderOptions var21 = this.settingTarget;
            var25 = var21.method_49$0dd78e0064(var19);
         }

         long var10003 = 4680149399685261652L;
         long var22 = var10;
         ShaderOptions var24 = this.settingTarget;
         boolean var26 = var24.method_47$0dd78e0064(var22);
         var10003 = 4683325428555505718L;
         C_47uI.method_40$9bd74f13d3(var25, var26, var8);
         if (var12 != null) {
            break;
         }
      }
   }



   private static void method_42$709ea9dc54(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9, RenderPass var10) {
      long var11 = a ^ 134700964887617L;
      long var13 = var11 ^ 12497513475940L;
      long var10008 = -8715958737525654786L;
      boolean var15 = var9;
      double var16 = var7;
      double var18 = var5;
      double var20 = var3;
      long var22 = var13;
      C_47wr var24 = var2;
      EntityLivingBase var25 = var1;
      C_47Pi var26 = var0;
      var26.method_41$cec454e236(var25, var24, var22, var20, var18, var16, var15);
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      C_473U var4 = recovery$indy$3(var3, -7193356210892719607L, var1);
      if (var4 instanceof C_479E) {
         this.field_43y++;
      }
   }



   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      augustus.recovered.modules.latency.PulseBlink_47CZ var65;
      net.minecraft.client.Minecraft var67;
      long var4;
      int var6;
      int var7;
      int var8;
      long var9;
      long var11;
      String var18;
      label102: {
         var4 = var2 ^ 28647365199211L;
         long var10001 = var2 ^ 77658587735714L;
         var6 = (int)((var2 ^ 77658587735714L) >>> 48);
         var7 = (int)((var2 ^ 77658587735714L) << 16 >>> 48);
         var8 = (int)(var10001 << 32 >>> 32);
         var9 = var2 ^ 39118360861767L;
         var11 = var2 ^ 33502480784005L;
         var10001 = var2 ^ 90592811413681L;
         int var13 = (int)((var2 ^ 90592811413681L) >>> 32);
         int var14 = (int)((var2 ^ 90592811413681L) << 32 >>> 48);
         int var15 = (int)(var10001 << 48 >>> 48);
         long var16 = var2 ^ 68103344083561L;
         long var10000 = 1854913496243880528L;
         var18 = C_47eb.method_48$0e30dfc966();
         var10001 = 1847873547821255824L;
         C_47Pi var21 = var1;
         EntityLivingBase var19 = var21.method_41$20b8cce974();
         var10001 = 1849292140934869804L;
         PacketHandler_47Cq var22 = ClientGlobals.field_48.field_489;
         boolean var64 = var22.method_45_$aae029aa0a();
         if (var18 == null) {
            if (!var64) {
               break label102;
            }

            long var10005 = 1848125163178536401L;
            EntityLivingBase var23 = var19;
            int var24 = var15;
            int var25 = var14;
            int var26 = var13;
            PulseBlink_47CZ var27 = this;
            var64 = var27.method_41$4a5865f831(var26, var25, var24, var23);
         }

         label103: {
            if (var18 == null) {
               if (!var64) {
                  break label102;
               }

               var65 = this;
               if (var18 != null) {
                  break label103;
               }

               long var10003 = 1848380848911703319L;
               ModeSetting var28 = this.settingTargetESP;
               long var29 = var11;
               PulseBlink_47CZ var31 = this;
               var64 = var31.method_43$ab2a340e95(var29, var28);
            }

            if (!var64) {
               break label102;
            }

            var65 = this;
         }

         long var81 = 1846587487547011249L;
         long var32 = var9;
         ModeSetting var34 = this.settingTargetESP;
         boolean var10004 = var34.method_46$5f9dc63072(var32).equals("PlayerModelArmor");
         var81 = 1849283633743660877L;
         boolean var35 = var10004;
         long var36 = var16;
         EntityLivingBase var38 = var19;
         C_47Pi var39 = var1;
         PulseBlink_47CZ var40 = var65;
         var40.method_40$35a3ef6725(var39, var38, var36, var35);
      }

      long var71 = 1849126752813377454L;
      Minecraft var41 = field_43;
      if (var41.field_42P != null) {
         long var10002 = 1848771318368894108L;
         long var42 = var4;
         PacketHandler_47Cq var44 = ClientGlobals.field_48.field_489;
         int var66 = (int) ((var44.method_48$0dd78e0064(var42)) ? 1 : 0);
         String var72 = var18;
         if (var2 >= 0L) {
            if (var18 == null) {
               if (var66 == 0) {
                  return;
               }

               var71 = 1849126752813377454L;
               Minecraft var45 = field_43;
               var10002 = 1847873547821255824L;
               C_47Pi var46 = var1;
               var66 = (int) ((var45.field_42P.equals(var46.method_41$20b8cce974())) ? 1 : 0);
            }

            var72 = var18;
         }

         if (var2 >= 0L) {
            if (var72 == null) {
               if (var66 == 0) {
                  return;
               }

               long var79 = 1848380848911703319L;
               ModeSetting var47 = this.settingPlayerESP;
               long var48 = var11;
               PulseBlink_47CZ var50 = this;
               var66 = (int) ((var50.method_43$ab2a340e95(var48, var47)) ? 1 : 0);
            }

            var72 = var18;
         }

         label106: {
            if (var72 == null) {
               if (var66 == 0) {
                  return;
               }

               var67 = field_43;
               if (var18 != null) {
                  break label106;
               }

               var71 = 1854661072361685137L;
               Minecraft var51 = field_43;
               var66 = var51.field_44r.field_44S;
            }

            if (var66 == 0) {
               var71 = 1848603348521961456L;
               BooleanSetting var52 = this.settingOnlyInThirdPerson;
               if (var52.method_49$aae029aa0a()) {
                  return;
               }
            }

            var67 = field_43;
         }

         var71 = 1849126752813377454L;
         Minecraft var53 = var67;
         C_47tf var20 = var53.field_42P.method_47$b2124a4855();
         char var77 = (char)var6;
         short var80 = (short)var7;
         long var10007 = 1846587487547011249L;
         long var54 = var9;
         ModeSetting var56 = this.settingPlayerESP;
         boolean var10006 = var56.method_46$5f9dc63072(var54).equals("PlayerModelArmor");
         var10007 = 1854525368391530361L;
         boolean var57 = var10006;
         int var58 = var8;
         C_47tf var59 = var20;
         short var60 = var80;
         C_47Pi var61 = var1;
         char var62 = var77;
         PulseBlink_47CZ var63 = this;
         var63.method_43$fbaf53aaa1(var62, var61, var60, var59, var58, var57);
      }
   }






   private boolean method_41$4a5865f831(int var1, int var2, int var3, Entity var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 122973310599494L;
      String var9 = recovery$indy$4(-3290527654957807176L, var5);
      Entity var10000 = var4;
      if (var9 == null) {
         if (var4 == recovery$indy$5(field_43, -3296316569561781178L, var5)) {
            return false;
         }

         var10000 = var4;
      }

      boolean var10 = recovery$indy$12(
         var10000,
         recovery$indy$6(C_47s.PLAYER, -3295922711416795656L, var5),
         recovery$indy$7(C_47s.MOB, -3295922711416795656L, var5),
         recovery$indy$8(C_47s.ANIMAL, -3295922711416795656L, var5),
         recovery$indy$9(C_47s.VILLAGER, -3295922711416795656L, var5),
         false,
         recovery$indy$10(C_47s.INVISIBLE, -3295922711416795656L, var5),
         false,
         false,
         var7,
         true,
         recovery$indy$11(C_47s.DEAD, -3295922711416795656L, var5),
         false,
         -3295519766894679721L,
         var5
      );
      return var9 != null ? var10 : var10;
   }



    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public void method_40$35a3ef6725(C_47Pi var1, EntityLivingBase var2, long var3, boolean var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 83208279475122L;
      long var8 = var3 ^ 12812035056026L;
      long var10 = var3 ^ 36051013310024L;
      long var12 = var3 ^ 78704492103291L;
      double var10001 = var2.field_43D.field_40 - var2.field_42g.field_40;
      long var10003 = -1110890018631384593L;
      Minecraft var21 = field_43;
      double var14 = var2.field_42g.field_40 + var10001 * var21.method_46$159e3d0645().field_49;
      var10001 = var2.field_43D.field_41 - var2.field_42g.field_41;
      var10003 = -1110890018631384593L;
      Minecraft var22 = field_43;
      double var16 = var2.field_42g.field_41 + var10001 * var22.method_46$159e3d0645().field_49;
      var10001 = var2.field_43D.field_47 - var2.field_42g.field_47;
      var10003 = -1110890018631384593L;
      Minecraft var23 = field_43;
      double var18 = var2.field_42g.field_47 + var10001 * var23.method_46$159e3d0645().field_49;
      long var10002 = -1112690403419189110L;
      long var24 = var6;
      ShaderOptions var26 = this.settingTarget;
      boolean var10000 = var26.method_49$0dd78e0064(var24);
      var10003 = -1109456758322898627L;
      long var27 = var10;
      ShaderOptions var29 = this.settingTarget;
      boolean var38 = var29.method_47$0dd78e0064(var27);
      var10003 = -1110187575405686689L;
      C_47uI.method_40$9bd74f13d3(var10000, var38, var8);
      long var39 = -1112047301791149762L;
      C_47Pi var30 = var1;
      C_47wr var20 = var30.method_43$e97f03698c();
      C_47Fw var40 = recovery$indy$13(var1, var2, var20, var14, var16, var18, var5);
      var10003 = -1109876477379704704L;
      C_47Fw var31 = var40;
      long var32 = var12;
      boolean var34 = false;
      C_47uI.method_42$300c7fd546(var34, var32, var31);
   }




    public void method_40$e781d6169a(C_47zh c_47zh, long l) {
        String string;
        boolean bl;
        C_473U c_473U;
        long l2;
        long l3;
        block92: {
            String string2;
            block90: {
                block91: {
                    String string3;
                    block89: {
                        block87: {
                            block88: {
                                String string4;
                                block86: {
                                    block84: {
                                        block85: {
                                            String string5;
                                            block83: {
                                                block78: {
                                                    block79: {
                                                        block82: {
                                                            block80: {
                                                                block81: {
                                                                    String string6;
                                                                    block75: {
                                                                        block77: {
                                                                            block59: {
                                                                                block76: {
                                                                                    String string7;
                                                                                    boolean bl2;
                                                                                    block73: {
                                                                                        block71: {
                                                                                            C_473U c_473U2;
                                                                                            block72: {
                                                                                                block74: {
                                                                                                    block67: {
                                                                                                        String string8;
                                                                                                        block70: {
                                                                                                            block68: {
                                                                                                                block69: {
                                                                                                                    String string9;
                                                                                                                    block65: {
                                                                                                                        block63: {
                                                                                                                            block64: {
                                                                                                                                block66: {
                                                                                                                                    long l4;
                                                                                                                                    block60: {
                                                                                                                                        String string10;
                                                                                                                                        block62: {
                                                                                                                                            block54: {
                                                                                                                                                block55: {
                                                                                                                                                    block61: {
                                                                                                                                                        block56: {
                                                                                                                                                            block57: {
                                                                                                                                                                block58: {
                                                                                                                                                                    block53: {
                                                                                                                                                                        Minecraft c_47nT;
                                                                                                                                                                        block52: {
                                                                                                                                                                            long l5 = l;
                                                                                                                                                                            l3 = l5 ^ 0x53AEB35CE631L;
                                                                                                                                                                            l4 = l5 ^ 0x7DF27108B014L;
                                                                                                                                                                            l2 = l5 ^ 0x193A41F8C0CDL;
                                                                                                                                                                            string2 = C_47eb.method_48$0e30dfc966();
                                                                                                                                                                            ModeSetting c_47Tj = this.settingPacketDirection;
                                                                                                                                                                            long l6 = l4;
                                                                                                                                                                            if (c_47Tj.method_46$5f9dc63072(l6).equals("OnlyIncoming")) return;
                                                                                                                                                                            c_47nT = field_43;
                                                                                                                                                                            if (string2 != null) break block52;
                                                                                                                                                                            Minecraft c_47nT2 = c_47nT;
                                                                                                                                                                            if (c_47nT2.field_42P == null) return;
                                                                                                                                                                            Minecraft c_47nT3 = field_43;
                                                                                                                                                                            if (c_47nT3.field_44Q == null) {
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            break block53;
                                                                                                                                                                        }
                                                                                                                                                                        Minecraft c_47nT4 = c_47nT;
                                                                                                                                                                        if (c_47nT4.field_44Q == null) {
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        C_47zh c_47zh2 = c_47zh;
                                                                                                                                                                        c_473U2 = c_47zh2.method_44$96fcbedb66();
                                                                                                                                                                        bl2 = c_473U2 instanceof C_47WF;
                                                                                                                                                                        if (string2 != null) break block54;
                                                                                                                                                                        if (!bl2) break block55;
                                                                                                                                                                        bl2 = c_473U2 instanceof C_47Is;
                                                                                                                                                                        string10 = string2;
                                                                                                                                                                        if (l <= 0L) break block56;
                                                                                                                                                                        if (string10 != null) break block57;
                                                                                                                                                                        break block58;
                                                                                                                                                                    }
                                                                                                                                                                    C_47zh c_47zh3 = c_47zh;
                                                                                                                                                                    c_473U = c_47zh3.method_44$96fcbedb66();
                                                                                                                                                                    if (!(c_473U instanceof C_47WF)) break block59;
                                                                                                                                                                    long l7 = l4;
                                                                                                                                                                    ModeSetting c_47Tj = this.settingModes;
                                                                                                                                                                    if (c_47Tj.method_46$5f9dc63072(l7).equals("Default")) break block59;
                                                                                                                                                                    break block60;
                                                                                                                                                                }
                                                                                                                                                                if (bl2) break block61;
                                                                                                                                                                bl2 = c_473U2 instanceof C_47dz;
                                                                                                                                                            }
                                                                                                                                                            string10 = string2;
                                                                                                                                                        }
                                                                                                                                                        if (l < 0L) break block62;
                                                                                                                                                        if (string10 != null) break block54;
                                                                                                                                                        if (!bl2) break block55;
                                                                                                                                                    }
                                                                                                                                                    long l8 = l3;
                                                                                                                                                    PulseBlink_47CZ pulseBlink_47CZ = this;
                                                                                                                                                    pulseBlink_47CZ.method_40$e45a9973e5(l8);
                                                                                                                                                }
                                                                                                                                                C_47hH c_47hH = C_47hH.BREAK_BLOCKS;
                                                                                                                                                bl2 = C_47hH.method_48$48d0768a1c((C_47hH)c_47hH);
                                                                                                                                            }
                                                                                                                                            string10 = string2;
                                                                                                                                        }
                                                                                                                                        if (string10 != null) break block63;
                                                                                                                                        if (!bl2) break block64;
                                                                                                                                        bl2 = c_473U2 instanceof C_45J;
                                                                                                                                        string9 = string2;
                                                                                                                                        if (l <= 0L) break block65;
                                                                                                                                        if (string9 != null) break block63;
                                                                                                                                        if (!bl2) break block64;
                                                                                                                                        break block66;
                                                                                                                                    }
                                                                                                                                    long l9 = l4;
                                                                                                                                    ModeSetting c_47Tj = this.settingPacketDirection;
                                                                                                                                    if (!c_47Tj.method_46$5f9dc63072(l9).equals("OnlyOutgoing")) break block59;
                                                                                                                                    break block67;
                                                                                                                                }
                                                                                                                                long l10 = l3;
                                                                                                                                PulseBlink_47CZ pulseBlink_47CZ = this;
                                                                                                                                pulseBlink_47CZ.method_40$e45a9973e5(l10);
                                                                                                                            }
                                                                                                                            C_47eb c_47eb = C_47eb.USE_ITEM;
                                                                                                                            bl2 = c_47eb.method_43$aae029aa0a();
                                                                                                                        }
                                                                                                                        string9 = string2;
                                                                                                                    }
                                                                                                                    if (string9 != null) break block68;
                                                                                                                    if (!bl2) break block69;
                                                                                                                    Minecraft c_47nT = field_43;
                                                                                                                    bl2 = c_47nT.field_42P.method_436$aae029aa0a();
                                                                                                                    string8 = string2;
                                                                                                                    if (l < 0L) break block70;
                                                                                                                    if (string8 != null) break block68;
                                                                                                                    if (bl2) {
                                                                                                                        long l11 = l3;
                                                                                                                        PulseBlink_47CZ pulseBlink_47CZ = this;
                                                                                                                        pulseBlink_47CZ.method_40$e45a9973e5(l11);
                                                                                                                    }
                                                                                                                }
                                                                                                                C_47eb c_47eb = C_47eb.OPEN_GUI;
                                                                                                                bl2 = c_47eb.method_43$aae029aa0a();
                                                                                                            }
                                                                                                            string8 = string2;
                                                                                                        }
                                                                                                        if (string8 != null) break block71;
                                                                                                        if (!bl2) break block72;
                                                                                                        Minecraft c_47nT = field_43;
                                                                                                        bl2 = c_47nT.method_44$aae029aa0a();
                                                                                                        string7 = string2;
                                                                                                        if (l < 0L) break block73;
                                                                                                        if (string7 != null) break block71;
                                                                                                        if (bl2) break block72;
                                                                                                        break block74;
                                                                                                    }
                                                                                                    bl = this.field_43a;
                                                                                                    string6 = string2;
                                                                                                    if (l <= 0L) break block75;
                                                                                                    break block76;
                                                                                                }
                                                                                                long l12 = l3;
                                                                                                PulseBlink_47CZ pulseBlink_47CZ = this;
                                                                                                pulseBlink_47CZ.method_40$e45a9973e5(l12);
                                                                                            }
                                                                                            bl2 = c_473U2 instanceof C_42V;
                                                                                        }
                                                                                        string7 = string2;
                                                                                    }
                                                                                    if (string7 == null) {
                                                                                        if (bl2) {
                                                                                            C_47hH c_47hH = C_47hH.PLACE_BLOCK;
                                                                                            bl2 = C_47hH.method_48$48d0768a1c((C_47hH)c_47hH);
                                                                                        } else {
                                                                                            bl2 = this.field_43a;
                                                                                        }
                                                                                    }
                                                                                    if (!bl2) return;
                                                                                    boolean bl3 = true;
                                                                                    long l13 = l2;
                                                                                    C_47zh c_47zh4 = c_47zh;
                                                                                    c_47zh4.method_47$b757cde368(l13, bl3);
                                                                                    return;
                                                                                }
                                                                                if (string6 != null) break block77;
                                                                                if (bl) {
                                                                                    long l14 = l3;
                                                                                    PulseBlink_47CZ pulseBlink_47CZ = this;
                                                                                    pulseBlink_47CZ.method_40$e45a9973e5(l14);
                                                                                }
                                                                            }
                                                                            C_47hH c_47hH = C_47hH.INVENTORY_ACTIONS;
                                                                            bl = C_47hH.method_48$48d0768a1c((C_47hH)c_47hH);
                                                                        }
                                                                        string6 = string2;
                                                                    }
                                                                    if (string6 != null) break block78;
                                                                    if (!bl) break block79;
                                                                    bl = c_473U instanceof C_47Is;
                                                                    string5 = string2;
                                                                    if (l <= 0L) break block80;
                                                                    if (string5 != null) break block81;
                                                                    if (bl) break block82;
                                                                    bl = c_473U instanceof C_47dz;
                                                                }
                                                                string5 = string2;
                                                            }
                                                            if (l < 0L) break block83;
                                                            if (string5 != null) break block78;
                                                            if (!bl) break block79;
                                                        }
                                                        long l15 = l3;
                                                        PulseBlink_47CZ pulseBlink_47CZ = this;
                                                        pulseBlink_47CZ.method_40$e45a9973e5(l15);
                                                    }
                                                    C_47hH c_47hH = C_47hH.BREAK_BLOCKS;
                                                    bl = C_47hH.method_48$48d0768a1c((C_47hH)c_47hH);
                                                }
                                                string5 = string2;
                                            }
                                            if (string5 != null) break block84;
                                            if (!bl) break block85;
                                            bl = c_473U instanceof C_45J;
                                            string4 = string2;
                                            if (l <= 0L) break block86;
                                            if (string4 != null) break block84;
                                            if (bl) {
                                                long l16 = l3;
                                                PulseBlink_47CZ pulseBlink_47CZ = this;
                                                pulseBlink_47CZ.method_40$e45a9973e5(l16);
                                            }
                                        }
                                        C_47eb c_47eb = C_47eb.USE_ITEM;
                                        bl = c_47eb.method_43$aae029aa0a();
                                    }
                                    string4 = string2;
                                }
                                if (string4 != null) break block87;
                                if (!bl) break block88;
                                Minecraft c_47nT = field_43;
                                bl = c_47nT.field_42P.method_436$aae029aa0a();
                                string3 = string2;
                                if (l < 0L) break block89;
                                if (string3 != null) break block87;
                                if (bl) {
                                    long l17 = l3;
                                    PulseBlink_47CZ pulseBlink_47CZ = this;
                                    pulseBlink_47CZ.method_40$e45a9973e5(l17);
                                }
                            }
                            C_47eb c_47eb = C_47eb.OPEN_GUI;
                            bl = c_47eb.method_43$aae029aa0a();
                        }
                        string3 = string2;
                    }
                    if (string3 != null) break block90;
                    if (!bl) break block91;
                    Minecraft c_47nT = field_43;
                    bl = c_47nT.method_44$aae029aa0a();
                    string = string2;
                    if (l < 0L) break block92;
                    if (string != null) break block90;
                    if (!bl) {
                        long l18 = l3;
                        PulseBlink_47CZ pulseBlink_47CZ = this;
                        pulseBlink_47CZ.method_40$e45a9973e5(l18);
                    }
                }
                bl = c_473U instanceof C_42V;
            }
            string = string2;
        }
        if (string == null) {
            if (bl) {
                C_47hH c_47hH = C_47hH.PLACE_BLOCK;
                if (C_47hH.method_48$48d0768a1c((C_47hH)c_47hH)) {
                    C_42V c_42V = (C_42V)c_473U;
                    if (c_42V.method_42$bc607678b6() != 0.0f) {
                        if (c_42V.method_48$bc607678b6() != 0.0f) {
                            if (c_42V.method_40$bc607678b6() != 0.0f) {
                                if (c_42V.method_44$8abf5c6871() != 255) {
                                    long l19 = l3;
                                    PulseBlink_47CZ pulseBlink_47CZ = this;
                                    pulseBlink_47CZ.method_40$e45a9973e5(l19);
                                }
                            }
                        }
                    }
                }
            }
            bl = this.field_43a;
        }
        if (!bl) return;
        boolean bl4 = true;
        long l20 = l2;
        C_47zh c_47zh5 = c_47zh;
        c_47zh5.method_47$b757cde368(l20, bl4);
    }






   private void method_40$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 104319765880503L;
      int var3 = (int)((var1 ^ 104319765880503L) >>> 48);
      int var4 = (int)((var1 ^ 104319765880503L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      this.field_43a = false;
      this.field_43y = 0;
      recovery$indy$14(this, (char)var3, var4, var5, -6299535470001537266L, var1);
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      boolean var18;
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 78263951807048L;
      long var10000 = 4726443276619389562L;
      String var9 = C_47eb.method_48$0e30dfc966();
      long var10001 = 4723561924185303816L;
      C_47hH var10 = C_47hH.SPRINT_RESET;
      var18 = C_47hH.method_48$48d0768a1c(var10);
      label29:
      if (var9 == null) {
         if (var18) {
            var10001 = 4720652143462432644L;
            Minecraft var11 = field_43;
            var18 = var11.field_42P.method_488$aae029aa0a();
            if (var9 != null) {
               break label29;
            }

            long var10002 = 4720652143462432644L;
            Minecraft var12 = field_43;
            if (var18 != var12.field_42P.method_47B$aae029aa0a()) {
               var10002 = 4722042179138438407L;
               long var13 = var7;
               PulseBlink_47CZ var15 = this;
               var15.method_40$e45a9973e5(var13);
            }
         }

         var10001 = 4723561924185303816L;
         C_47hH var16 = C_47hH.SPLASH_POTION;
         var18 = C_47hH.method_48$48d0768a1c(var16);
      }

      if (var18) {
         var10001 = 4722267134726187871L;
         Minecraft var17 = field_43;
         var17.field_44Q.field_44Q.stream().filter(recovery$indy$15()).forEach(recovery$indy$16(this));
      }
   }



   private static void method_44$949b423eca(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3, RenderPass var4) {
      long var5 = a ^ 30534288984612L;
      long var7 = var5 ^ 116660430346497L;
      long var10002 = -1051767490734059680L;
      Minecraft var9 = field_43;
      long var10008 = -1049390447022486373L;
      boolean var10 = var3;
      double var11 = var2.field_47;
      double var13 = var2.field_41;
      double var15 = var2.field_40;
      long var17 = var7;
      C_47wr var19 = var1;
      EntityPlayerSP var20 = var9.field_42P;
      C_47Pi var21 = var0;
      var21.method_41$cec454e236(var20, var19, var17, var15, var13, var11, var10);
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 102105840517952L;
      long var3 = var1 ^ 89601025408493L;
      long var10002 = -5185306288193466085L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private static boolean method_48$7c2c45e4ce(Entity var0) {
      return var0 instanceof C_47BX;
   }



   private EntityLivingBase method_49$f2b0beb8fc(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 106987317416511L;
      return recovery$indy$17(var3, 3609594974536728336L, var1);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 14503116660821L;
      long var3 = var1 ^ 619650555640L;
      long var10002 = -2657327692379688434L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_47$971dcaf928(long var1, EntityLivingBase var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 63424302785785L;
      int var4 = (int)((var1 ^ 63424302785785L) >>> 48);
      int var5 = (int)((var1 ^ 63424302785785L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 69421548588888L;
      int var7 = (int)((var1 ^ 69421548588888L) >>> 48);
      int var8 = (int)((var1 ^ 69421548588888L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 71080605975817L;
      var10001 = var1 ^ 114509391120787L;
      int var12 = (int)((var1 ^ 114509391120787L) >>> 48);
      int var13 = (int)((var1 ^ 114509391120787L) << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      String var16 = recovery$indy$18(4415701474035426986L, var1);
      int var10000 = (int) ((var3 instanceof EntityPlayer) ? 1 : 0);
      if (var16 == null) {
         label75:
         if ((var10000) != 0) {
            EntityLivingBase var33 = var3;
            if (var16 == null) {
               EntityLivingBase var15 = var3;
               if (recovery$indy$19((short)var7, var8, var9, var15, 4421045869247142891L, var1)) {
                  break label75;
               }

               var33 = var3;
            }

            EntityPlayer var17 = (EntityPlayer)var33;
            float var18 = var17.method_42$bc607678b6();
            C_478i var19 = var17.method_45$6684d3c618().method_42$800791f322(var18, var18, var18);
            C_47tf var20 = new C_47tf(
               recovery$indy$20(field_43, 4418921955581870932L, var1).field_48Q,
               recovery$indy$21(field_43, 4418921955581870932L, var1).field_48j,
               recovery$indy$22(field_43, 4418921955581870932L, var1).field_42o
            );
            C_47tf var21 = recovery$indy$23(var17, (char)var4, (short)var5, var6, 4415280412093836775L, var1);
            double[] var22 = recovery$indy$25(0, var10, recovery$indy$24(field_43, 4418921955581870932L, var1), 4420572157403948899L, var1);
            C_47tf var23 = new C_47tf(var22[0], var22[1] + recovery$indy$26(field_43, 4418921955581870932L, var1).method_41$bc607678b6(), var22[2]);
            C_47tf var24 = recovery$indy$27(var23, var19, 4421689843538055169L, var1);
            double var38;
            var10000 = (var38 = var23.method_43$3d77d36e13(var24) - var20.method_43$3d77d36e13(var21)) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
            if (var16 == null) {
               if (var10000 < 0) {
                  float var39;
                  var10000 = (var39 = recovery$indy$28(field_43, 4418921955581870932L, var1).method_40$ee256e8a75(var17) - 3.0F) == 0.0F
                     ? 0
                     : (var39 < 0.0F ? -1 : 1);
                  if (var16 != null) {
                     return var10000 != 0;
                  }

                  if (var10000 > 0) {
                     int var25 = recovery$indy$29(this.settingLagTicks, 4421438239288326249L, var1);

                     while (var25 > 0) {
                        double[] var26 = recovery$indy$31(var25 - 1, var10, recovery$indy$30(field_43, 4418921955581870932L, var1), 4420572157403948899L, var1);
                        C_47tf var27 = recovery$indy$32((short)var12, (short)var13, var14, var17, var25, 4419526170722363875L, var1);
                        C_47tf var28 = new C_47tf(var26[0], var26[1] + recovery$indy$33(field_43, 4418921955581870932L, var1).method_41$bc607678b6(), var26[2]);
                        float var29 = var17.field_48w / 2.0F;
                        C_478i var30 = new C_478i(
                              var27.field_40 - var29,
                              var27.field_41,
                              var27.field_47 - var29,
                              var27.field_40 + var29,
                              var27.field_41 + var17.field_48,
                              var27.field_47 + var29
                           )
                           .method_42$800791f322(var18, var18, var18);
                        C_47tf var31 = recovery$indy$34(var28, var30, 4421689843538055169L, var1);
                        String var35 = var16;
                        if (var1 > 0L) {
                           if (var16 == null) {
                              double var40;
                              var10000 = (var40 = var28.method_43$3d77d36e13(var31) - 3.0) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
                              if (var16 != null) {
                                 return var10000 != 0;
                              }

                              if (var10000 < 0) {
                                 return false;
                              }

                              var25--;
                           }

                           var35 = var16;
                        }

                        if (var35 != null) {
                           break;
                        }
                     }
                  }
               }

               var10000 = 1;
            }

            return var10000 != 0;
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }





   private void method_47$890e55755d(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      recovery$indy$35(this.settingLagTicks, 972245933796473936L, var4);
      recovery$indy$36(this.settingLagBreakTicks, 972245933796473936L, var4);
      this.field_43y = 0;
   }



   public void method_43$fbaf53aaa1(char var1, C_47Pi var2, short var3, C_47tf var4, int var5, boolean var6) {
      long var7 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 53861722634105L;
      long var11 = var7 ^ 124205352129873L;
      long var13 = var7 ^ 100708409893507L;
      long var15 = var7 ^ 66817181856432L;
      long var10002 = 307817801737724993L;
      long var18 = var9;
      ShaderOptions var20 = this.settingPlayer;
      boolean var10000 = var20.method_49$0dd78e0064(var18);
      long var10003 = 311049250130177526L;
      long var21 = var13;
      ShaderOptions var23 = this.settingPlayer;
      boolean var10001 = var23.method_47$0dd78e0064(var21);
      var10003 = 314312003056084116L;
      C_47uI.method_40$9bd74f13d3(var10000, var10001, var11);
      long var29 = 313648401510458869L;
      C_47Pi var24 = var2;
      C_47wr var17 = var24.method_43$e97f03698c();
      C_47Fw var30 = recovery$indy$37(var2, var17, var4, var6);
      var10003 = 311758175358450763L;
      C_47Fw var25 = var30;
      long var26 = var15;
      boolean var28 = false;
      C_47uI.method_42$300c7fd546(var28, var26, var25);
   }



   private boolean method_43$ab2a340e95(long var1, ModeSetting var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 40648530312603L;
      long var10000 = 8674494271275180940L;
      String var6 = C_47eb.method_48$0e30dfc966();
      long var10002 = 8681922906694799725L;
      long var7 = var4;
      ModeSetting var9 = var3;
      boolean var14 = var9.method_46$5f9dc63072(var7).equals("PlayerModel");
      if (var6 == null) {
         if (!var14) {
            var10002 = 8681922906694799725L;
            long var10 = var4;
            ModeSetting var12 = var3;
            boolean var16 = var12.method_46$5f9dc63072(var10).equals("PlayerModelArmor");
            if (var6 != null) {
               return var16;
            }

            if (!var16) {
               return false;
            }
         }

         var14 = true;
      }

      return var14;
   }



   private boolean method_43$3d8993dd37(short var1, int var2, EntityLivingBase var3, short var4) {
      long var5;
      long var7;
      long var15;
      int var17;
      int var18;
      int var19;
      String var26;
      label181: {
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         long var20;
         int var22;
         int var23;
         int var24;
         EntityLivingBase var45;
         label182: {
            var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
            var7 = var5 ^ 60266352873895L;
            long var10001 = var5 ^ 44876324942481L;
            var9 = (int)((var5 ^ 44876324942481L) >>> 48);
            var10 = (int)((var5 ^ 44876324942481L) << 16 >>> 48);
            var11 = (int)(var10001 << 32 >>> 32);
            var10001 = var5 ^ 50976914397488L;
            var12 = (int)((var5 ^ 50976914397488L) >>> 48);
            var13 = (int)((var5 ^ 50976914397488L) << 16 >>> 32);
            var14 = (int)(var10001 << 48 >>> 48);
            var15 = var5 ^ 11642021292808L;
            var10001 = var5 ^ 37003817412953L;
            var17 = (int)((var5 ^ 37003817412953L) >>> 48);
            var18 = (int)((var5 ^ 37003817412953L) << 16 >>> 32);
            var19 = (int)(var10001 << 48 >>> 48);
            var20 = var5 ^ 89997619532641L;
            var10001 = var5 ^ 133430708101115L;
            var22 = (int)((var5 ^ 133430708101115L) >>> 48);
            var23 = (int)((var5 ^ 133430708101115L) << 16 >>> 48);
            var24 = (int)(var10001 << 32 >>> 32);
            var26 = recovery$indy$38(-6111481005083889470L, var5);
            boolean var10000 = var3 instanceof EntityPlayer;
            if (var26 == null) {
               if (!var10000) {
                  break label181;
               }

               var45 = var3;
               if (var26 != null) {
                  break label182;
               }

               EntityLivingBase var25 = var3;
               var10000 = recovery$indy$39((short)var12, var13, var14, var25, -6110640647791800957L, var5);
            }

            if (var10000) {
               break label181;
            }

            var45 = var3;
         }

         EntityPlayer var27 = (EntityPlayer)var45;
         float var28 = var27.method_42$bc607678b6();
         C_478i var29 = var27.method_45$6684d3c618().method_42$800791f322(var28, var28, var28);
         C_47tf var30 = new C_47tf(
            recovery$indy$45(field_43, -6108223166117554884L, var5).field_48Q,
            recovery$indy$46(field_43, -6108223166117554884L, var5).field_48j,
            recovery$indy$47(field_43, -6108223166117554884L, var5).field_42o
         );
         C_47tf var31 = recovery$indy$48(var27, (char)var9, (short)var10, var11, -6111899971081569393L, var5);
         double[] var32 = recovery$indy$50(0, var20, recovery$indy$49(field_43, -6108223166117554884L, var5), -6111077332784844533L, var5);
         C_47tf var33 = new C_47tf(var32[0], var32[1] + recovery$indy$51(field_43, -6108223166117554884L, var5).method_41$bc607678b6(), var32[2]);
         C_47tf var34 = recovery$indy$52(var33, var29, -6109997094470662551L, var5);
         double var55;
         int var46 = (var55 = var33.method_43$3d77d36e13(var34) - var30.method_43$3d77d36e13(var31)) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);
         if (var26 == null) {
            if (var46 < 0) {
               float var56;
               int var59 = (var56 = recovery$indy$53(field_43, -6108223166117554884L, var5).method_40$ee256e8a75(var27) - 3.0F) == 0.0F
                  ? 0
                  : (var56 < 0.0F ? -1 : 1);
               if (var26 != null) {
                  return var59 != 0;
               }

               if (var59 > 0) {
                  boolean var60 = recovery$indy$54((short)var12, var13, var14, var27, -6110640647791800957L, var5);
                  if (var26 != null) {
                     return var60;
                  }

                  if (!var60) {
                     int var35 = recovery$indy$55(this.settingLagTicks, -6110245769217151487L, var5);

                     while (var35 > 0) {
                        double[] var36 = recovery$indy$57(
                           var35 - 1, var20, recovery$indy$56(field_43, -6108223166117554884L, var5), -6111077332784844533L, var5
                        );
                        C_47tf var37 = recovery$indy$58((short)var22, (short)var23, var24, var27, var35, -6107621214433083509L, var5);
                        C_47tf var38 = new C_47tf(var36[0], var36[1] + recovery$indy$59(field_43, -6108223166117554884L, var5).method_41$bc607678b6(), var36[2]);
                        float var39 = var27.field_48w / 2.0F;
                        C_478i var40 = new C_478i(
                              var37.field_40 - var39,
                              var37.field_41,
                              var37.field_47 - var39,
                              var37.field_40 + var39,
                              var37.field_41 + var27.field_48,
                              var37.field_47 + var39
                           )
                           .method_42$800791f322(var28, var28, var28);
                        C_47tf var41 = recovery$indy$60(var38, var40, -6109997094470662551L, var5);
                        String var47 = var26;
                        if (var2 > 0) {
                           if (var26 == null) {
                              double var57;
                              int var61 = (var57 = var38.method_43$3d77d36e13(var41) - 3.0) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
                              if (var26 != null) {
                                 return var61 != 0;
                              }

                              if (var61 < 0) {
                                 return false;
                              }

                              var35--;
                           }

                           var47 = var26;
                        }

                        if (var47 != null) {
                           break;
                        }
                     }
                  }
               }
            }

            var46 = 1;
         }

         return var46 != 0;
      }

      Iterator var42 = recovery$indy$40(field_43, -6111165299454066201L, var5).field_44Q.iterator();

      byte var49;
      while (true) {
         if (var42.hasNext()) {
            label186: {
               Entity var43 = (Entity)var42.next();
               Entity var48 = var43;
               if (var26 == null) {
                  var49 = (byte) ((var43 instanceof EntityPlayer) ? 1 : 0);
                  if (var26 != null) {
                     break;
                  }

                  if (!(var49 != 0)) {
                     break label186;
                  }

                  var48 = var43;
               }

               EntityPlayer var44 = (EntityPlayer)var48;
               var49 = (byte) ((var44 instanceof EntityPlayerSP) ? 1 : 0);
               String var54 = var26;
               if (var4 <= 0) {
                  if (var26 == null) {
                     if (var49 != 0) {
                        break label186;
                     }

                     var49 = (byte) ((recovery$indy$41(ClientGlobals.field_48.field_46Z, var44, var15, -6110859799133210471L, var5)) ? 1 : 0);
                  }

                  var54 = var26;
               }

               if (var2 >= 0) {
                  if (var54 == null) {
                     if (var49 != 0) {
                        break label186;
                     }

                     var49 = (byte) ((recovery$indy$42(ClientGlobals.field_48.field_480, var7, var44, -6112402995710186432L, var5)) ? 1 : 0);
                  }

                  var54 = var26;
               }

               if (var4 <= 0) {
                  if (var54 == null) {
                     if (var49 != 0) {
                        break label186;
                     }

                     var49 = (byte) ((recovery$indy$43(ClientGlobals.field_48.field_44Q, (short)var17, var18, var44, var19, -6108508964822709779L, var5)) ? 1 : 0);
                  }

                  var54 = var26;
               }

               if (var4 < 0) {
                  if (var54 == null) {
                     if (var49 != 0) {
                        break label186;
                     }

                     double var58;
                     var49 = (byte)((
                              var58 = recovery$indy$44(field_43, -6108223166117554884L, var5)
                                    .method_45$b2124a4855()
                                    .method_41$4b58f7ab41(var44.field_48Q, var44.field_48j, var44.field_42o)
                                 - 6.1
                           )
                           == 0.0
                        ? 0
                        : (var58 < 0.0 ? -1 : 1));
                  }

                  var54 = var26;
               }

               if (var54 != null) {
                  return var49 != 0;
               }

               if (var49 < 0) {
                  return true;
               }
            }

            if (var26 == null) {
               continue;
            }
         }

         var49 = 0;
         break;
      }

      return var49 != 0;
   }







    public void onRender3D(long l, float f) {
        block10: {
            boolean bl;
            long l2;
            block16: {
                long l3;
                long l4;
                long l5;
                block17: {
                    Minecraft c_47nT;
                    String string;
                    block15: {
                        boolean bl2;
                        block14: {
                            String string2;
                            long l6;
                            block13: {
                                block11: {
                                    long l7;
                                    block12: {
                                        String string3;
                                        block9: {
                                            block7: {
                                                block8: {
                                                    long l8 = l;
                                                    l7 = l8 ^ 0x31BC9A9AAC37L;
                                                    l5 = l8 ^ 0x44FF288F43DEL;
                                                    l4 = l8 ^ 0x4F54FB3E1F6L;
                                                    l3 = l8 ^ 0x2F9B80A81624L;
                                                    l6 = l8 ^ 0x822929CB51BL;
                                                    l2 = l8 ^ 0x48C69634C617L;
                                                    string = C_47eb.method_48$0e30dfc966();
                                                    RenderUtils.method_42$da8c82d5d4();
                                                    PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                                    bl2 = packetHandler_47Cq.method_45_$aae029aa0a();
                                                    if (string != null) break block7;
                                                    if (bl2) break block8;
                                                    long l9 = l7;
                                                    PacketHandler_47Cq packetHandler_47Cq2 = ClientGlobals.field_48.field_489;
                                                    bl2 = packetHandler_47Cq2.method_48$0dd78e0064(l9);
                                                    string3 = string;
                                                    if (l < 0L) break block9;
                                                    if (string3 != null) break block7;
                                                    if (!bl2) break block10;
                                                }
                                                long l10 = l6;
                                                ModeSetting c_47Tj = this.settingTargetESP;
                                                bl2 = c_47Tj.method_46$5f9dc63072(l10).equals("Classic");
                                            }
                                            string3 = string;
                                        }
                                        if (string3 != null) break block11;
                                        if (!bl2) break block12;
                                        PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                        bl2 = packetHandler_47Cq.method_45_$aae029aa0a();
                                        string2 = string;
                                        if (l < 0L) break block13;
                                        if (string2 != null) break block11;
                                        if (bl2) {
                                            long l11 = l5;
                                            ShaderOptions c_47T2 = this.settingTarget;
                                            long l12 = l3;
                                            ShaderOptions c_47T22 = this.settingTarget;
                                            C_47uI.method_40$9bd74f13d3((boolean)c_47T2.method_49$0dd78e0064(l11), (boolean)c_47T22.method_47$0dd78e0064(l12), (long)l4);
                                            C_47Fw c_47Fw = PulseBlink_47CZ.recovery$indy$61(this);
                                            long l13 = l2;
                                            boolean bl3 = false;
                                            C_47uI.method_42$300c7fd546((boolean)bl3, (long)l13, (C_47Fw)c_47Fw);
                                        }
                                    }
                                    long l14 = l7;
                                    PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                    bl2 = packetHandler_47Cq.method_48$0dd78e0064(l14);
                                }
                                string2 = string;
                            }
                            if (string2 != null) break block14;
                            if (!bl2) break block10;
                            long l15 = l6;
                            ModeSetting c_47Tj = this.settingPlayerESP;
                            bl2 = c_47Tj.method_46$5f9dc63072(l15).equals("Classic");
                        }
                        if (!bl2) break block10;
                        c_47nT = field_43;
                        if (string != null) break block15;
                        Minecraft c_47nT2 = c_47nT;
                        if (c_47nT2.field_42P == null) break block10;
                        c_47nT = field_43;
                    }
                    Minecraft c_47nT3 = c_47nT;
                    bl = (c_47nT3.field_44r.field_44S != 0);
                    if (string != null) break block16;
                    if (bl) break block17;
                    BooleanSetting c_47TV = this.settingOnlyInThirdPerson;
                    bl = c_47TV.method_49$aae029aa0a();
                    if (string != null) break block16;
                    if (bl) break block10;
                }
                long l16 = l5;
                ShaderOptions c_47T2 = this.settingPlayer;
                long l17 = l3;
                ShaderOptions c_47T23 = this.settingPlayer;
                C_47uI.method_40$9bd74f13d3((boolean)c_47T2.method_49$0dd78e0064(l16), (boolean)c_47T23.method_47$0dd78e0064(l17), (long)l4);
                bl = false;
            }
            C_47Fw c_47Fw = PulseBlink_47CZ.recovery$indy$62(this);
            long l18 = l2;
            boolean bl4 = bl;
            C_47uI.method_42$300c7fd546((boolean)bl4, (long)l18, (C_47Fw)c_47Fw);
        }
        RenderUtils.method_43$da8c82d5d4();
    }





   private boolean method_40H$aae029aa0a() {
      long var1 = a ^ 98463598065755L;
      long var3 = var1 ^ 92555821303542L;
      long var10002 = 220977885915294208L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_40D$aae029aa0a() {
      long var1 = a ^ 53381034654628L;
      long var3 = var1 ^ 67260237169929L;
      long var10000 = -9154719353131082978L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -9156245518335071745L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_40W$aae029aa0a() {
      long var1 = a ^ 32108166045576L;
      long var3 = var1 ^ 18224632832293L;
      long var10002 = -1962911336921870893L;
      long var5 = var3;
      ModeSetting var7 = this.settingPacketDirection;
      return var7.method_46$5f9dc63072(var5).equals("OnlyOutgoing");
   }



   private boolean method_40I$aae029aa0a() {
      long var1 = a ^ 102109418533771L;
      long var3 = var1 ^ 89604569845030L;
      long var10000 = -8584833880178076879L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -8592560895557295664L;
      long var6 = var3;
      ModeSetting var8 = this.settingPlayerESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$63(this, 25, var3, -7105156328811681278L, var1);
      recovery$indy$64(this, 32, var3, -7105156328811681278L, var1);
      recovery$indy$65(this, 31, var3, -7105156328811681278L, var1);
      recovery$indy$66(this, 40, var3, -7105156328811681278L, var1);
      recovery$indy$67(this, 26, var3, -7105156328811681278L, var1);
      recovery$indy$68(this, 18, var3, -7105156328811681278L, var1);
   }



   private boolean method_40f$aae029aa0a() {
      long var1 = a ^ 51384310817123L;
      long var3 = var1 ^ 38600289230798L;
      long var10002 = -2726537040510553288L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_40Y$aae029aa0a() {
      long var1 = a ^ 65623847255088L;
      long var3 = var1 ^ 59441223975581L;
      long var10000 = -8689717045878891382L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -8684505695919198613L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_40h$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 95164603663166L;
      long var5 = var1 ^ 4210637507696L;
      long var7 = var1 ^ 133810267246484L;
      long var10001 = var1 ^ 20529271282200L;
      int var9 = (int)((var1 ^ 20529271282200L) >>> 48);
      int var10 = (int)((var1 ^ 20529271282200L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var10000 = -8471653668351684221L;
      String var12 = C_47eb.method_48$0e30dfc966();
      long var10002 = -8470352885113170525L;
      long var14 = var3;
      PulseBlink_47CZ var16 = this;
      EntityLivingBase var13 = var16.method_49$f2b0beb8fc(var14);
      var10002 = -8470356476444466334L;
      long var17 = var7;
      ModeSetting var19 = this.settingModes;
      boolean var33 = var19.method_46$5f9dc63072(var17).equals("DefaultCombat");
      if (var12 == null) {
         if (var33) {
            short var35 = (short)var9;
            short var10004 = (short)var11;
            long var10005 = -8469442958514249964L;
            short var20 = var10004;
            EntityLivingBase var21 = var13;
            int var22 = var10;
            short var23 = var35;
            PulseBlink_47CZ var24 = this;
            return var24.method_43$3d8993dd37(var23, var22, var21, var20);
         }

         var10002 = -8470356476444466334L;
         long var25 = var7;
         ModeSetting var27 = this.settingModes;
         var33 = var27.method_46$5f9dc63072(var25).equals("CombatOnly");
      }

      String var34 = var12;
      if (var1 > 0L) {
         if (var12 == null) {
            if (!var33) {
               return false;
            }

            long var10003 = -8468348316878610537L;
            EntityLivingBase var28 = var13;
            long var29 = var5;
            PulseBlink_47CZ var31 = this;
            var33 = var31.method_47$971dcaf928(var29, var28);
         }

         var34 = var12;
      }

      return var34 != null ? var33 : var33;
   }




   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 47705542031174L;
      int var6 = (int)((var4 ^ 47705542031174L) >>> 32);
      int var7 = (int)((var4 ^ 47705542031174L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      this.field_43h.clear();
      String var10000 = recovery$indy$69(2182698775393650087L, var4);
      Iterator var10 = recovery$indy$70(field_43, 2185916076040221826L, var4).field_44Q.iterator();
      String var9 = var10000;

      while (var10.hasNext()) {
         Entity var11 = (Entity)var10.next();
         if (var9 == null && recovery$indy$71(this, var6, var7, var8, var11, 2184990243609029158L, var4)) {
            this.field_43h.add((EntityLivingBase)var11);
         }

         if (var9 != null) {
            break;
         }
      }
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 122418861773779L;
      int var6 = (int)((var4 ^ 122418861773779L) >>> 48);
      int var7 = (int)((var4 ^ 122418861773779L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      recovery$indy$72(this, (char)var6, var7, var8, 2735862469733266026L, var4);
      this.field_43a = false;
   }



   public void method_488$e45a9973e5(long var1) {
      java.lang.String var23;
      java.lang.String var24;
      java.lang.String var18;
      long var10001 = var1 ^ 48507828735928L;
      int var3 = (int)((var1 ^ 48507828735928L) >>> 48);
      int var4 = (int)((var1 ^ 48507828735928L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 40755722062014L;
      long var8 = var1 ^ 10722933763838L;
      long var10 = var1 ^ 118667382762070L;
      long var12 = var1 ^ 76629286485107L;
      long var14 = var1 ^ 90190080414975L;
      String var16 = recovery$indy$73(-5077351333047606684L, var1);
      label170:
      if (recovery$indy$74(field_43, -5071883456125188198L, var1) != null) {
         int var10000;
         label191: {
            var10000 = (int) ((recovery$indy$75(C_47hH.STANDING_STILL, -5074613087725038826L, var1)) ? 1 : 0);
            label190:
            if (var16 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$76(var14, -5071164124210191325L, var1)) ? 1 : 0);
                  var23 = var16;
                  if (var1 <= 0L) {
                     break label191;
                  }

                  if (var16 != null) {
                     break label190;
                  }

                  if (var10000 == 0) {
                     break label170;
                  }
               }

               var10000 = (int) ((recovery$indy$77(var8, -5075006522778789424L, var1)) ? 1 : 0);
            }

            var23 = var16;
         }

         label180: {
            label179:
            if (var23 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$78(C_47hH.SCAFFOLD_TOGGLED, -5074613087725038826L, var1)) ? 1 : 0);
                  var24 = var16;
                  if (var1 <= 0L) {
                     break label180;
                  }

                  if (var16 != null) {
                     break label179;
                  }

                  if (var10000 != 0) {
                     break label170;
                  }
               }

               var10000 = (int) ((this.field_43a) ? 1 : 0);
            }

            var24 = var16;
         }

         label165: {
            label164: {
               label163: {
                  label198: {
                     if (var1 > 0L) {
                        if (var24 == null) {
                           if (var10000 != 0) {
                              var10000 = this.field_43y;
                              if (var16 != null) {
                                 break label164;
                              }

                              if (this.field_43y < recovery$indy$79(this.settingLagTicks, -5074927437100319577L, var1)) {
                                 break label198;
                              }

                              this.field_43a = false;
                              var18 = var16;
                              if (var1 >= 0L) {
                                 if (var16 == null) {
                                    label200: {
                                       C_47K6 var19 = recovery$indy$80(field_43, -5073916579191352620L, var1);
                                       if (var1 >= 0L) {
                                          if (var19 == null) {
                                             break label200;
                                          }

                                          var19 = recovery$indy$81(field_43, -5073916579191352620L, var1);
                                       }

                                       C_47ri var20 = var19.method_49$431840b606();
                                       if (var16 == null) {
                                          if (var20 == null) {
                                             break label200;
                                          }

                                          var20 = recovery$indy$82(field_43, -5073916579191352620L, var1).method_49$431840b606();
                                       }

                                       var20.method_43$631790539f(new C_47vS());
                                    }

                                    recovery$indy$83(this, (char)var3, var4, var5, -5071898554505253375L, var1);
                                 }

                                 var18 = var16;
                              }

                              if (var1 < 0L) {
                                 break label163;
                              }

                              if (var18 == null) {
                                 break label198;
                              }
                           }

                           var10000 = this.field_43y;
                        }

                        var24 = var16;
                     }

                     if (var1 < 0L) {
                        break label165;
                     }

                     if (var24 != null) {
                        break label164;
                     }

                     if (var10000 >= recovery$indy$84(this.settingLagBreakTicks, -5074927437100319577L, var1)) {
                        this.field_43a = true;
                        recovery$indy$85(this, (char)var3, var4, var5, -5071898554505253375L, var1);
                     }
                  }

                  var18 = recovery$indy$86(this.settingPacketDirection, var12, -5074426846753517435L, var1);
               }

               var10000 = (int) ((var18.equals(recovery$indy$87(7003, 2379178736281375645L ^ var1))) ? 1 : 0);
            }

            var24 = var16;
         }

         if (var24 == null) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$88(this, var6, -5071389948141529244L, var1)) ? 1 : 0);
         }

         int var17 = var10000;
         if (var17 != 0) {
            label201: {
               C_47K6 var21 = recovery$indy$89(field_43, -5073916579191352620L, var1);
               if (var16 == null) {
                  if (var21 == null) {
                     break label201;
                  }

                  var21 = recovery$indy$90(field_43, -5073916579191352620L, var1);
               }

               C_47ri var22 = var21.method_49$431840b606();
               if (var16 == null) {
                  if (var22 == null) {
                     break label201;
                  }

                  var22 = recovery$indy$91(field_43, -5073916579191352620L, var1).method_49$431840b606();
               }

               var22.method_43$631790539f(new C_47vS());
            }

            recovery$indy$92(this, var10, -5073801320783364839L, var1);
         }

         return;
      }

      this.field_43a = false;
      this.field_43y = 0;
   }





   private boolean method_40P$aae029aa0a() {
      long var1 = a ^ 75336852760848L;
      long var3 = var1 ^ 80419928676285L;
      long var10000 = -3294502662569391702L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -3289299816653030581L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



    public PulseBlink_47CZ(long a0) {
        super((java.lang.String) ("PulseBlink"),(java.lang.String) ("Vodafone"),(long) (((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 84787872544988L)),(java.awt.Color) (java.awt.Color.black),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 28430429610219L);
        long constructorKey4 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 59271227896314L);
        int constructorPart5 = (int) ((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 13458499069819L) >>> 32));
        int constructorPart6 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 13458499069819L) << 32) >>> 48));
        int constructorPart7 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 13458499069819L) << 48) >>> 48));
        long constructorKey8 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 116519583364425L);
        long constructorKey9 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 4760172351777L);
        long constructorKey10 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 93672797401548L);
        long constructorKey11 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 61097968895666L);
        long constructorKey12 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 99853937566328L);
        int constructorPart13 = (int) ((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 47630568358980L) >>> 32));
        int constructorPart14 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 47630568358980L) << 32) >>> 48));
        int constructorPart15 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 47630568358980L) << 48) >>> 48));
        long constructorKey16 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 137305512064298L);
        int constructorPart17 = (int) ((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 81451590146614L) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 81451590146614L) << 16) >>> 48));
        int constructorPart19 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 81451590146614L) << 32) >>> 32));
        long constructorKey20 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 7323564034065L);
        int constructorPart21 = (int) ((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 32710350600114L) >>> 32));
        int constructorPart22 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 32710350600114L) << 32) >>> 40));
        int constructorPart23 = (int) (((((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 32710350600114L) << 56) >>> 56));
        long constructorKey24 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 29821921942365L);
        long constructorKey25 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 44452406739105L);
        long constructorKey26 = ((augustus.recovered.modules.latency.PulseBlink_47CZ.a ^ a0) ^ 13124964941942L);
        java.lang.Object initialValue27 = recovery$indy$flow$698(3);
        ((java.lang.Object[]) initialValue27)[0] = "OnlyIncoming";
        ((java.lang.Object[]) initialValue27)[1] = "OnlyOutgoing";
        ((java.lang.Object[]) initialValue27)[2] = "Both";
        client.setting.ModeSetting initialized28 = new client.setting.ModeSetting(this, "PacketDirection", constructorKey20, "OnlyOutgoing", (java.lang.String[]) (initialValue27));
        recovery$indy$flow$700(this, initialized28);
        short converted29 = (short) (constructorPart14);
        short converted30 = (short) (constructorPart15);
        client.setting.RangeSetting initialized31 = new client.setting.RangeSetting(constructorPart13, this, "LagBreakTicks", 0.0D, 0.0D, converted29, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted30);
        java.lang.String initialValue32 = "TickDelayBetweenLags";
        long initialValue33 = constructorKey3;
        client.setting.RangeSetting initialValue34 = initialized31;
        java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue36 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue37 = recovery$indy$flow$705(initialValue35, initialValue33, initialValue36);
        long initialValue38 = constructorKey9;
        java.lang.Object initialValue39 = initialValue37;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = recovery$indy$flow$707(initialValue40, initialValue38);
        recovery$indy$flow$708(this, initialValue41);
        short converted42 = (short) (constructorPart14);
        short converted43 = (short) (constructorPart15);
        client.setting.RangeSetting initialized44 = new client.setting.RangeSetting(constructorPart13, this, "LagTicks", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4618441417868443648L), converted42, 1.0D, Double.longBitsToDouble(4632233691727265792L), 0, converted43);
        long initialValue45 = constructorKey9;
        client.setting.RangeSetting initialValue46 = initialized44;
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue48 = recovery$indy$flow$712(initialValue47, initialValue45);
        recovery$indy$flow$713(this, initialValue48);
        java.lang.Object initialValue49 = recovery$indy$flow$715(3);
        ((java.lang.Object[]) initialValue49)[0] = "Default";
        ((java.lang.Object[]) initialValue49)[1] = "DefaultCombat";
        ((java.lang.Object[]) initialValue49)[2] = "CombatOnly";
        client.setting.ModeSetting initialized50 = new client.setting.ModeSetting(this, "Modes", constructorKey20, "DefaultCombat", (java.lang.String[]) (initialValue49));
        java.lang.Object initialValue51 = recovery$indy$flow$717(this);
        java.lang.Object initialValue52 = initialValue51;
        client.setting.ModeSetting initialValue53 = initialized50;
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue55 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue56 = recovery$indy$flow$720(initialValue54, initialValue55);
        recovery$indy$flow$721(this, initialValue56);
        java.lang.Object initialValue57 = recovery$indy$flow$723();
        client.setting.MultiSelectSetting initialized58 = new client.setting.MultiSelectSetting(this, "FlushConditions", constructorKey16, (net.C_47OZ[]) (initialValue57));
        recovery$indy$flow$725(this, initialized58);
        client.setting.SettingGroup initialized59 = new client.setting.SettingGroup(this, "TargetESPs", constructorKey10);
        recovery$indy$flow$728(this, initialized59);
        java.lang.Object initialValue60 = recovery$indy$flow$730(4);
        ((java.lang.Object[]) initialValue60)[0] = "None";
        ((java.lang.Object[]) initialValue60)[1] = "Classic";
        ((java.lang.Object[]) initialValue60)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue60)[3] = "PlayerModelArmor";
        java.lang.Object initialValue61 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ModeSetting initialized62 = new client.setting.ModeSetting(this, "TargetESP", "Classic", (java.lang.String[]) (initialValue60), (client.setting.SettingGroup) (initialValue61), constructorKey12);
        recovery$indy$flow$733(this, initialized62);
        java.awt.Color initialized63 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue64 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ColorSetting initialized65 = new client.setting.ColorSetting(this, "ClassicColorTarget", constructorKey8, initialized63, (client.setting.SettingGroup) (initialValue64));
        long initialValue66 = constructorKey11;
        java.lang.String initialValue67 = "ClassicColor";
        client.setting.ColorSetting initialValue68 = initialized65;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue71 = recovery$indy$flow$741(initialValue69, initialValue70, initialValue66);
        java.lang.Object initialValue72 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue73 = recovery$indy$flow$743(this);
        java.lang.Object initialValue74 = initialValue73;
        long initialValue75 = constructorKey4;
        java.lang.Object initialValue76 = initialValue72;
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue78 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue79 = recovery$indy$flow$746(initialValue77, initialValue75, initialValue78);
        java.lang.Object initialValue80 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue79))))));
        recovery$indy$flow$748(this, initialValue80);
        java.lang.Object initialValue81 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.NumberSetting initialized82 = new client.setting.NumberSetting(this, "LineWidthTarget", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue81), constructorKey26);
        short converted83 = (short) (constructorPart7);
        int initialValue84 = (int) (converted83);
        int initialValue85 = constructorPart6;
        java.lang.String initialValue86 = "LineWidth";
        int initialValue87 = constructorPart5;
        client.setting.NumberSetting initialValue88 = initialized82;
        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue90 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue86))))));
        java.lang.Object initialValue91 = recovery$indy$flow$754(initialValue89, initialValue87, initialValue90, initialValue85, (short) (initialValue84));
        java.lang.Object initialValue92 = recovery$indy$flow$755(this);
        java.lang.Object initialValue93 = initialValue92;
        java.lang.Object initialValue94 = initialValue91;
        java.lang.Object initialValue95 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue94))))));
        java.lang.Object initialValue96 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue93))))));
        java.lang.Object initialValue97 = recovery$indy$flow$758(initialValue95, initialValue96);
        recovery$indy$flow$759(this, initialValue97);
        short converted98 = (short) (constructorPart17);
        char converted99 = (char) (constructorPart18);
        java.lang.Object initialValue100 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.BooleanSetting initialized101 = new client.setting.BooleanSetting(this, "SmoothRendering", converted98, converted99, constructorPart19, false, (client.setting.SettingGroup) (initialValue100));
        java.lang.Object initialValue102 = recovery$indy$flow$763(this);
        java.lang.Object initialValue103 = initialValue102;
        long initialValue104 = constructorKey4;
        client.setting.BooleanSetting initialValue105 = initialized101;
        java.lang.Object initialValue106 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue105))))));
        java.lang.Object initialValue107 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue108 = recovery$indy$flow$766(initialValue106, initialValue104, initialValue107);
        java.lang.Object initialValue109 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue108))))));
        recovery$indy$flow$768(this, initialValue109);
        java.lang.Object initialValue110 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        byte converted111 = (byte) (constructorPart23);
        client.setting.ShaderOptions initialized112 = new client.setting.ShaderOptions(constructorPart21, constructorPart22, this, "Target", converted111, (client.setting.SettingGroup) (initialValue110));
        java.lang.Object initialValue113 = recovery$indy$flow$772(this);
        java.lang.Object initialValue114 = initialValue113;
        long initialValue115 = constructorKey4;
        client.setting.ShaderOptions initialValue116 = initialized112;
        java.lang.Object initialValue117 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue116))))));
        java.lang.Object initialValue118 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue114))))));
        java.lang.Object initialValue119 = recovery$indy$flow$775(initialValue117, initialValue115, initialValue118);
        java.lang.Object initialValue120 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue119))))));
        long initialValue121 = constructorKey25;
        java.lang.Object initialValue122 = initialValue120;
        java.lang.Object initialValue123 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue122))))));
        java.lang.Object initialValue124 = recovery$indy$flow$778(initialValue123, initialValue121);
        recovery$indy$flow$779(this, initialValue124);
        java.lang.Object initialValue125 = recovery$indy$flow$781();
        java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.MultiSelectSetting initialized127 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey24, (net.C_47OZ[]) (initialValue125), (client.setting.SettingGroup) (initialValue126));
        java.lang.Object initialValue128 = recovery$indy$flow$784(this);
        java.lang.Object initialValue129 = initialValue128;
        client.setting.MultiSelectSetting initialValue130 = initialized127;
        java.lang.Object initialValue131 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue132 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue133 = recovery$indy$flow$787(initialValue131, initialValue132);
        recovery$indy$flow$788(this, initialValue133);
        client.setting.SettingGroup initialized134 = new client.setting.SettingGroup(this, "PlayerESPs", constructorKey10);
        recovery$indy$flow$791(this, initialized134);
        java.lang.Object initialValue135 = recovery$indy$flow$793(4);
        ((java.lang.Object[]) initialValue135)[0] = "None";
        ((java.lang.Object[]) initialValue135)[1] = "Classic";
        ((java.lang.Object[]) initialValue135)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue135)[3] = "PlayerModelArmor";
        java.lang.Object initialValue136 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ModeSetting initialized137 = new client.setting.ModeSetting(this, "PlayerESP", "Classic", (java.lang.String[]) (initialValue135), (client.setting.SettingGroup) (initialValue136), constructorKey12);
        recovery$indy$flow$796(this, initialized137);
        java.awt.Color initialized138 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue139 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ColorSetting initialized140 = new client.setting.ColorSetting(this, "ClassicColorMe", constructorKey8, initialized138, (client.setting.SettingGroup) (initialValue139));
        long initialValue141 = constructorKey11;
        java.lang.String initialValue142 = "ClassicColor";
        client.setting.ColorSetting initialValue143 = initialized140;
        java.lang.Object initialValue144 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue143))))));
        java.lang.Object initialValue145 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue146 = recovery$indy$flow$804(initialValue144, initialValue145, initialValue141);
        java.lang.Object initialValue147 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue146))))));
        java.lang.Object initialValue148 = recovery$indy$flow$806(this);
        java.lang.Object initialValue149 = initialValue148;
        long initialValue150 = constructorKey4;
        java.lang.Object initialValue151 = initialValue147;
        java.lang.Object initialValue152 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue151))))));
        java.lang.Object initialValue153 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue149))))));
        java.lang.Object initialValue154 = recovery$indy$flow$809(initialValue152, initialValue150, initialValue153);
        java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue154))))));
        recovery$indy$flow$811(this, initialValue155);
        java.lang.Object initialValue156 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.NumberSetting initialized157 = new client.setting.NumberSetting(this, "LineWidthMe", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue156), constructorKey26);
        short converted158 = (short) (constructorPart7);
        int initialValue159 = (int) (converted158);
        int initialValue160 = constructorPart6;
        java.lang.String initialValue161 = "LineWidth";
        int initialValue162 = constructorPart5;
        client.setting.NumberSetting initialValue163 = initialized157;
        java.lang.Object initialValue164 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue163))))));
        java.lang.Object initialValue165 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue161))))));
        java.lang.Object initialValue166 = recovery$indy$flow$817(initialValue164, initialValue162, initialValue165, initialValue160, (short) (initialValue159));
        java.lang.Object initialValue167 = recovery$indy$flow$818(this);
        java.lang.Object initialValue168 = initialValue167;
        java.lang.Object initialValue169 = initialValue166;
        java.lang.Object initialValue170 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue171 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue168))))));
        java.lang.Object initialValue172 = recovery$indy$flow$821(initialValue170, initialValue171);
        recovery$indy$flow$822(this, initialValue172);
        short converted173 = (short) (constructorPart17);
        char converted174 = (char) (constructorPart18);
        java.lang.Object initialValue175 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.BooleanSetting initialized176 = new client.setting.BooleanSetting(this, "OnlyInThirdPerson", converted173, converted174, constructorPart19, true, (client.setting.SettingGroup) (initialValue175));
        recovery$indy$flow$826(this, initialized176);
        java.lang.Object initialValue177 = ((java.lang.Object)(((augustus.recovered.modules.latency.PulseBlink_47CZ) (((java.lang.Object)(this)))).settingPlayerESPs));
        byte converted178 = (byte) (constructorPart23);
        client.setting.ShaderOptions initialized179 = new client.setting.ShaderOptions(constructorPart21, constructorPart22, this, "Player", converted178, (client.setting.SettingGroup) (initialValue177));
        java.lang.Object initialValue180 = recovery$indy$flow$830(this);
        java.lang.Object initialValue181 = initialValue180;
        long initialValue182 = constructorKey4;
        client.setting.ShaderOptions initialValue183 = initialized179;
        java.lang.Object initialValue184 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue183))))));
        java.lang.Object initialValue185 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue181))))));
        java.lang.Object initialValue186 = recovery$indy$flow$833(initialValue184, initialValue182, initialValue185);
        java.lang.Object initialValue187 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue186))))));
        long initialValue188 = constructorKey25;
        java.lang.Object initialValue189 = initialValue187;
        java.lang.Object initialValue190 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue189))))));
        java.lang.Object initialValue191 = recovery$indy$flow$836(initialValue190, initialValue188);
        recovery$indy$flow$837(this, initialValue191);
        java.util.ArrayList initialized192 = new java.util.ArrayList();
        recovery$indy$flow$840(this, initialized192);
        recovery$indy$flow$841(this, 0);
        recovery$indy$flow$842(this, true);
        return;
    }








    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native java.lang.Object recovery$indy$flow$698(int a0);
    private static native void recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$705(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$707(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$708(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$712(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$713(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$715(int a0);
    private static native java.lang.Object recovery$indy$flow$717(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$720(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$721(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$723();
    private static native void recovery$indy$flow$725(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$728(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$730(int a0);

    private static native void recovery$indy$flow$733(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$741(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$743(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$746(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$748(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$754(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$755(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$758(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$759(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$763(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$766(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$768(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$772(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$775(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$778(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$779(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$781();

    private static native java.lang.Object recovery$indy$flow$784(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$787(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$788(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$791(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$793(int a0);

    private static native void recovery$indy$flow$796(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$804(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$806(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$809(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$811(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$817(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$818(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$821(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$822(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$826(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$830(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$833(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$836(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$837(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$840(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$841(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.PulseBlink_47CZ) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$842(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.PulseBlink_47CZ) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native MethodHandle recovery$constant$2();
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native String recovery$indy$4(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(
      Object var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      long var9,
      boolean var11,
      boolean var12,
      boolean var13,
      long var14,
      long var16
   );
   private static native C_47Fw recovery$indy$13(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9);
   private static native void recovery$indy$14(Object var0, char var1, int var2, int var3, long var4, long var6);
   private static native Predicate recovery$indy$15();
   private static native Consumer recovery$indy$16(PulseBlink_47CZ var0);
   private static native EntityLivingBase recovery$indy$17(long var0, long var2, long var4);
   private static native String recovery$indy$18(long var0, long var2);
   private static native boolean recovery$indy$19(short var0, int var1, int var2, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$23(Object var0, char var1, short var2, int var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native double[] recovery$indy$25(int var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$27(Object var0, Object var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native int recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native double[] recovery$indy$31(int var0, long var1, Object var3, long var4, long var6);
   private static native C_47tf recovery$indy$32(short var0, short var1, int var2, Object var3, int var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$34(Object var0, Object var1, long var2, long var4);
   private static native double recovery$indy$35(Object var0, long var1, long var3);
   private static native double recovery$indy$36(Object var0, long var1, long var3);
   private static native C_47Fw recovery$indy$37(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3);
   private static native String recovery$indy$38(long var0, long var2);
   private static native boolean recovery$indy$39(short var0, int var1, int var2, Object var3, long var4, long var6);
   private static native WorldClient recovery$indy$40(Object var0, long var1, long var3);
   private static native boolean recovery$indy$41(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$42(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$43(Object var0, short var1, int var2, Object var3, int var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$46(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$47(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$48(Object var0, char var1, short var2, int var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);
   private static native double[] recovery$indy$50(int var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$51(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$52(Object var0, Object var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$53(Object var0, long var1, long var3);
   private static native boolean recovery$indy$54(short var0, int var1, int var2, Object var3, long var4, long var6);
   private static native int recovery$indy$55(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);
   private static native double[] recovery$indy$57(int var0, long var1, Object var3, long var4, long var6);
   private static native C_47tf recovery$indy$58(short var0, short var1, int var2, Object var3, int var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$59(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$60(Object var0, Object var1, long var2, long var4);
   private static native C_47Fw recovery$indy$61(PulseBlink_47CZ var0);
   private static native C_47Fw recovery$indy$62(PulseBlink_47CZ var0);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$69(long var0, long var2);
   private static native WorldClient recovery$indy$70(Object var0, long var1, long var3);
   private static native boolean recovery$indy$71(Object var0, int var1, int var2, int var3, Object var4, long var5, long var7);
   private static native void recovery$indy$72(Object var0, char var1, int var2, int var3, long var4, long var6);
   private static native String recovery$indy$73(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$74(Object var0, long var1, long var3);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3);
   private static native boolean recovery$indy$76(long var0, long var2, long var4);
   private static native boolean recovery$indy$77(long var0, long var2, long var4);
   private static native boolean recovery$indy$78(Object var0, long var1, long var3);
   private static native int recovery$indy$79(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$80(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$81(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$82(Object var0, long var1, long var3);
   private static native void recovery$indy$83(Object var0, char var1, int var2, int var3, long var4, long var6);
   private static native int recovery$indy$84(Object var0, long var1, long var3);
   private static native void recovery$indy$85(Object var0, char var1, int var2, int var3, long var4, long var6);
   private static native String recovery$indy$86(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$87(int var0, long var1);
   private static native boolean recovery$indy$88(Object var0, long var1, long var3, long var5);
   private static native C_47K6 recovery$indy$89(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$90(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$91(Object var0, long var1, long var3);
   private static native void recovery$indy$92(Object var0, long var1, long var3, long var5);
}
