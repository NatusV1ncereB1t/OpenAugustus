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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_40x;
import net.C_40y;
import net.C_41Z;
import net.C_42V;
import net.C_45J;
import net.C_45W;
import net.C_45n;
import net.C_46s;
import net.C_4713;
import client.render.RenderPass;
import net.C_473U;
import net.C_475c;
import net.C_476l;
import net.C_476q;
import net.C_478i;
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Fw;
import net.C_47H;
import net.C_47K6;
import net.C_47MO;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TT;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47WF;
import client.event.RenderListener;
import net.C_47Xx;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bi;
import net.C_47cu;
import net.C_47eb;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47jt;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.ClientGlobals;
import net.C_47ri;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_47vS;
import net.C_47vi;
import net.C_47wr;
import net.C_47xz;
import net.C_47zh;
import net.C_48p;
import net.C_48q;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class BackTrack_47Ca extends client.module.Module implements net.C_47oO,net.C_47mz,client.event.RenderListener,net.C_47vi,net.C_48q,net.C_47xz,net.C_47UH {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaxHitRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingThreshold = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCancelHitsIfServerCancelsHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingClassicBackTrackDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhenNeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDynamicClassic = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingBackTrackTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayBetweenBacktrack = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCalculateWithOwnPing = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingForceDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPredict = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDynamic = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaxLagPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDelayBetweenLags = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCountMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCalculateWithOwnPingLagTrack = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLagPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingPingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDelayBetweenBacktrackPing = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCalculateWithOwnPingPing = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDynamicPing = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCheckStartDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingStartDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingAbortCriterion = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingStopOnAttackRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFixPacketOrder = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingStopOnAttackMaxHurtTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStopBackTrackAtHurtTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingContinueWithBackTrackAtHurtTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingImprove = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPreAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingClickCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTargetESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTargetESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmoothRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingPlayerESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingPlayerESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyInThirdPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47u; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47n; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47F; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47e = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private final double[] field_47q = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47R = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_478; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47m; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47r; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47M; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47O; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_479; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47W; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47h; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

   public void method_46$2c4d5d53cf(long var1, C_47H var3) {
      java.lang.String var44;
      net.minecraft.client.Minecraft var45;
      net.minecraft.client.Minecraft var47;
      augustus.recovered.modules.latency.BackTrack_47Ca var49;
      long var4;
      long var6;
      long var8;
      String var10;
      int var42;
      String var10001;
      label220: {
         var4 = var1 ^ 39716244248338L;
         var6 = var1 ^ 83103949759630L;
         var8 = var1 ^ 81345279682188L;
         long var10002 = 7017601037377013669L;
         long var13 = var6;
         ModeSetting var15 = this.settingMode;
         String var11 = var15.method_46$5f9dc63072(var13);
         long var10000 = 7019880520254695507L;
         String var41 = C_47eb.method_48$0e30dfc966();
         byte var12 = -1;
         var10 = var41;
         var42 = var11.hashCode();
         label219:
         if (var10 == null) {
            label223: {
               label216: {
                  label224: {
                     String var43;
                     switch (var42) {
                        case -966060924:
                           var42 = (int) ((var11.equals("BackTrack")) ? 1 : 0);
                           if (var10 != null) {
                              break label219;
                           }

                           if (var42 == 0) {
                              break label223;
                           }

                           var12 = 0;
                           var43 = var10;
                           if (var1 <= 0L) {
                              break;
                           }

                           if (var10 == null) {
                              break label223;
                           }
                        case -1766985991:
                           var43 = var11;
                           break;
                        case 68985021:
                           break label224;
                        default:
                           break label223;
                     }

                     var42 = (int) ((var43.equals("LagTrack")) ? 1 : 0);
                     if (var10 != null) {
                        break label219;
                     }

                     if (var42 == 0) {
                        break label223;
                     }

                     var12 = 1;
                     var44 = var10;
                     if (var1 < 0L) {
                        break label216;
                     }

                     if (var10 == null) {
                        break label223;
                     }
                  }

                  var44 = var11;
               }

               var42 = (int) ((var44.equals("Gomme")) ? 1 : 0);
               var10001 = var10;
               if (var1 < 0L) {
                  break label220;
               }

               if (var10 != null) {
                  break label219;
               }

               if (var42 != 0) {
                  var12 = 2;
               }
            }

            var42 = var12;
         }

         var10001 = var10;
      }

      label227: {
         label183: {
            label228: {
               if (var1 >= 0L) {
                  if (var10001 == null) {
                     switch (var42) {
                        case 0:
                           long var51 = this.field_437;
                           long var10003 = 7015016807709065806L;
                           long var16 = var8;
                           long var18 = var51;
                           C_47cu var20 = this.field_45;
                           var42 = (int) ((var20.method_42$b0e346e6e3(var18, var16)) ? 1 : 0);
                           break;
                        case 1:
                           break label228;
                        case 2:
                           break label227;
                        default:
                           return;
                     }
                  }

                  var10001 = var10;
               }

               if (var1 > 0L) {
                  if (var10001 == null) {
                     if (var42 == 0) {
                        return;
                     }

                     long var52 = 7016968278989507405L;
                     BooleanSetting var21 = this.settingForceDelay;
                     var42 = (int) ((var21.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var10001 = var10;
               }

               if (var10001 == null) {
                  if (var42 == 0) {
                     return;
                  }

                  long var53 = 7014626717702737684L;
                  PacketHandler_47Cq var22 = ClientGlobals.field_48.field_489;
                  var42 = (int) ((var22.method_45_$aae029aa0a()) ? 1 : 0);
               }

               if (var42 == 0) {
                  return;
               }

               var45 = field_43;
               if (var1 <= 0L) {
                  break label183;
               }

               long var54 = 7017458489080328694L;
               Minecraft var23 = field_43;
               var23.method_40$f8db5d9e73().method_49$431840b606().method_43$631790539f(new C_47vS());
               if (var10 == null) {
                  return;
               }
            }

            var45 = field_43;
         }

         if (var10 == null) {
            long var55 = 7020526299410521847L;
            Minecraft var24 = var45;
            if (var24.field_44Q == null) {
               return;
            }

            var45 = field_43;
         }

         label229: {
            long var56 = 7016165443475584766L;
            Minecraft var25 = var45;
            EntityPlayerSP var46 = var25.field_42P;
            if (var10 == null) {
               if (var25.field_42P == null) {
                  return;
               }

               var47 = field_43;
               if (var10 != null) {
                  break label229;
               }

               long var57 = 7016165443475584766L;
               Minecraft var26 = field_43;
               var46 = var26.field_42P;
            }

            if (var46.field_48y < 10) {
               return;
            }

            var47 = field_43;
         }

         long var58 = 7020526299410521847L;
         Minecraft var27 = var47;
         if (var27.field_44Q.field_44Q == null) {
            return;
         }

         long var63 = 7017601037377013669L;
         long var28 = var6;
         ModeSetting var30 = this.settingCountMode;
         var42 = (int) ((var30.method_46$5f9dc63072(var28).equals("Tick")) ? 1 : 0);
         if (var10 == null) {
            if (var42 == 0) {
               return;
            }

            long var59 = 7018806196567921658L;
            Minecraft var31 = field_43;
            var42 = var31.method_46$159e3d0645().field_48;
         }

         label163: {
            label162: {
               int var60 = 1;
               if (var10 == null) {
                  if (var42 < 1) {
                     break label162;
                  }

                  var49 = this;
                  if (var10 != null) {
                     break label163;
                  }

                  var42 = this.field_438;
                  var63 = 7017083469770441151L;
                  RangeSetting var32 = this.settingMaxLagPackets;
                  var60 = var32.method_44$8abf5c6871();
               }

               if (var42 > var60) {
                  long var61 = 7017458489080328694L;
                  Minecraft var33 = field_43;
                  var33.method_40$f8db5d9e73().method_49$431840b606().method_43$631790539f(new C_47vS());
               }
            }

            var49 = this;
         }

         long var66 = 7018806196567921658L;
         Minecraft var34 = field_43;
         var49.field_43y = var49.field_43y + var34.method_46$159e3d0645().field_48;
         if (var10 == null) {
            return;
         }
      }

      C_47H var50 = var3;
      boolean var62 = true;
      if (var10 == null) {
         long var67 = 7017328204740678821L;
         long var35 = var4;
         boolean var37 = true;
         C_47H var38 = var3;
         var38.method_47$a19f828fbe(var37, var35);
         if (!this.field_47O) {
            return;
         }

         var50 = var3;
         var62 = true;
      }

      long var65 = 7019202860790989505L;
      boolean var39 = var62;
      C_47H var40 = var50;
      var40.method_40$f633c984d8(var39);
   }






   private void method_46$268603e72a(C_47Pi var1, C_47wr var2, RenderPass var3) {
      long var4 = a ^ 90221773371217L;
      long var6 = var4 ^ 97853185504946L;
      long var8 = var4 ^ 133985592912046L;
      EntityLivingBase var10002 = this.field_49;
      long var10006 = 7873335278734740357L;
      long var10 = var8;
      ModeSetting var12 = this.settingTargetESP;
      boolean var10004 = var12.method_46$5f9dc63072(var10).equals("PlayerModelArmor");
      var10006 = 7876295078018072951L;
      long var13 = var6;
      boolean var15 = var10004;
      C_47wr var16 = var2;
      EntityLivingBase var17 = var10002;
      C_47Pi var18 = var1;
      BackTrack_47Ca var19 = this;
      var19.method_47$0f4afe0bb4(var18, var17, var16, var15, var13);
   }



   public void method_46$e535f8442d(net.C_47zh var1, long var2, short var4) {
        int var305;
        int var302;
        java.lang.String var307;
        java.lang.String var308;
        java.lang.String var309;
        net.minecraft.client.Minecraft var312;
        int var313;
        int var315;
        net.minecraft.client.Minecraft var324;
        net.minecraft.client.Minecraft var327;
        boolean var329;
        java.lang.String var332;
      long var5;
      long var7;
      long var9;
      long var11;
      long var13;
      long var15;
      int var17;
      int var18;
      long var19;
      long var21;
      long var23;
      long var25;
      int var27;
      long var28;
      long var30;
      long var32;
      int var34;
      int var35;
      int var36;
      long var37;
      long var39;
      long var41;
      long var43;
      long var45;
      int var47;
      int var48;
      int var49;
      String var50;
      BackTrack_47Ca var303;
      label641: {
         label642: {
            var5 = var2 << 16 | (long)var4 << 48 >>> 48;
            var7 = var5 ^ 127421628519195L;
            var9 = var5 ^ 111682102919200L;
            var11 = var5 ^ 11340300091188L;
            var13 = var5 ^ 97606001903268L;
            var15 = var5 ^ 98544027959257L;
            var17 = (int)((var5 ^ 20237306761422L) >>> 32);
            var18 = (int)((var5 ^ 20237306761422L) << 32 >>> 32);
            var19 = var5 ^ 115002472062334L;
            var21 = var5 ^ 13538434133415L;
            var23 = var5 ^ 42074321833781L;
            var25 = var5 ^ 77111405440423L;
            var27 = (int)((var5 ^ 51129139020317L) >>> 48);
            var28 = (var5 ^ 51129139020317L) << 16 >>> 16;
            var30 = var5 ^ 47125200434925L;
            var32 = var5 ^ 51729956964521L;
            long var10001 = var5 ^ 75327591158633L;
            var34 = (int)((var5 ^ 75327591158633L) >>> 32);
            var35 = (int)((var5 ^ 75327591158633L) << 32 >>> 56);
            var36 = (int)(var10001 << 40 >>> 40);
            var37 = var5 ^ 93446394500336L;
            var39 = var5 ^ 48089186071199L;
            var41 = var5 ^ 120819109849596L;
            var43 = var5 ^ 117607217143676L;
            var45 = var5 ^ 91028304517952L;
            var10001 = var5 ^ 52140657308994L;
            var47 = (int)((var5 ^ 52140657308994L) >>> 32);
            var48 = (int)((var5 ^ 52140657308994L) << 32 >>> 48);
            var49 = (int)(var10001 << 48 >>> 48);
            long var10000 = 1773155115573596579L;
            var50 = net.C_47eb.method_48$0e30dfc966();
            var10001 = 1767042834308123854L;
            net.C_47zh var64 = var1;
            net.C_473U var51 = var64.method_44$96fcbedb66();
            var10001 = 1778444944267202318L;
            net.minecraft.client.Minecraft var65 = field_43;
            if (var65.field_42P != null) {
               var302 = ((var51 instanceof C_46s) ? 1 : 0);
               if (var50 != null) {
                  break label642;
               }

               if (var302 != 0) {
                  C_46s var52 = (C_46s)var51;
                  var302 = var52.method_45$8abf5c6871();
                  if (var50 != null) {
                     break label642;
                  }

                  long var10002 = 1778444944267202318L;
                  net.minecraft.client.Minecraft var66 = field_43;
                  if (var302 == var66.field_42P.method_49$8abf5c6871()) {
                     var10002 = 1772181061824925383L;
                     boolean var67 = true;
                     BackTrack_47Ca var68 = this;
                     var68.method_41N$f633c984d8(var67);
                     var10002 = 1771444857912105543L;
                     boolean var69 = true;
                     BackTrack_47Ca var70 = this;
                     var70.method_48$f633c984d8(var69);
                  }
               }
            }

            var303 = this;
            if (var50 != null) {
               break label641;
            }

            var302 = ((this.field_43P) ? 1 : 0);
         }

         if (var302 != 0) {
            long var338 = 1776906278627161828L;
            PacketHandler_47Cq var71 = client.ClientGlobals.field_48.field_489;
            if (!var71.method_45_$aae029aa0a()) {
               var338 = 1777791781510412341L;
               client.setting.RangeSetting var72 = this.settingMaxHitRange;
               var72.method_43$fedcb3e4d3();
            }
         }

         long var388 = 1776906278627161828L;
         PacketHandler_47Cq var73 = client.ClientGlobals.field_48.field_489;
         this.field_43P = var73.method_45_$aae029aa0a();
         var303 = this;
      }

      String var340;
      label625: {
         long var389 = 1770941577223241301L;
         long var74 = var19;
         client.setting.ModeSetting var76 = var303.settingMode;
         String var293 = var76.method_46$5f9dc63072(var74);
         byte var53 = -1;
         var305 = var293.hashCode();
         label624:
         if (var50 == null) {
            label643: {
               label621: {
                  label644: {
                     label619: {
                        label645: {
                           String var306;
                           switch (var305) {
                              case -1766985991:
                                 break label645;
                              case 2487698:
                                 break label644;
                              case 1896850514:
                                 var305 = ((var293.equals("ClassicBackTrack")) ? 1 : 0);
                                 if (var50 != null) {
                                    break label624;
                                 }

                                 if (var305 == 0) {
                                    break label643;
                                 }

                                 var53 = 0;
                                 var306 = var50;
                                 if (var4 <= 0) {
                                    break;
                                 }

                                 if (var50 == null) {
                                    break label643;
                                 }
                              case -966060924:
                                 var306 = var293;
                                 break;
                              default:
                                 break label643;
                           }

                           var305 = ((var306.equals("BackTrack")) ? 1 : 0);
                           if (var50 != null) {
                              break label624;
                           }

                           if (var305 == 0) {
                              break label643;
                           }

                           var53 = 1;
                           var307 = var50;
                           if (var4 < 0) {
                              break label619;
                           }

                           if (var50 == null) {
                              break label643;
                           }
                        }

                        var307 = var293;
                     }

                     var305 = ((var307.equals("LagTrack")) ? 1 : 0);
                     if (var50 != null) {
                        break label624;
                     }

                     if (var305 == 0) {
                        break label643;
                     }

                     var53 = 2;
                     var308 = var50;
                     if (var2 <= 0L) {
                        break label621;
                     }

                     if (var50 == null) {
                        break label643;
                     }
                  }

                  var308 = var293;
               }

               var305 = ((var308.equals("Ping")) ? 1 : 0);
               var340 = var50;
               if (var4 < 0) {
                  break label625;
               }

               if (var50 != null) {
                  break label624;
               }

               if (var305 != 0) {
                  var53 = 3;
               }
            }

            var305 = var53;
         }

         var340 = var50;
      }

      label647: {
         label648: {
            label649: {
               if (var2 > 0L) {
                  if (var340 == null) {
                     switch (var305) {
                        case 0:
                           long var341 = 1770306585852375741L;
                           client.setting.BooleanSetting var77 = this.settingDynamicClassic;
                           var305 = ((var77.method_49$aae029aa0a()) ? 1 : 0);
                           break;
                        case 1:
                           break label649;
                        case 2:
                           break label648;
                        case 3:
                           break label647;
                        default:
                           return;
                     }
                  }

                  var340 = var50;
               }

               label563: {
                  label562: {
                     if (var340 == null) {
                        if (var305 == 0) {
                           break label562;
                        }

                        var305 = ((this.field_47h) ? 1 : 0);
                     }

                     if (var305 != 0) {
                        short var10006 = (short)var49;
                        long var10007 = 1777417080986810683L;
                        short var78 = var10006;
                        int var79 = var48;
                        double var80 = 3.0;
                        net.minecraft.entity.EntityLivingBase var82 = this.field_49;
                        int var83 = var47;
                        boolean var84 = true;
                        net.C_47zh var85 = var1;
                        var85.method_41$337ba7bdf9(var84, var83, var82, var80, var79, var78);
                        var309 = var50;
                        if (var2 <= 0L) {
                           break label563;
                        }

                        if (var50 == null) {
                           return;
                        }
                     }
                  }

                  long var10003 = 1773279360935380416L;
                  boolean var86 = this.field_47h;
                  long var87 = var21;
                  net.C_47zh var89 = var1;
                  var89.method_47$b757cde368(var87, var86);
                  var309 = var50;
               }

               if (var309 == null) {
                  return;
               }
            }

            net.minecraft.entity.EntityLivingBase var54 = this.field_49;
            String var390 = Math.max(0, this.field_437) + " ms";
            long var414 = 1772318640852811941L;
            String var90 = var390;
            long var91 = var7;
            BackTrack_47Ca var93 = this;
            var93.method_47$d07b98bfef(var91, var90);
            net.minecraft.client.Minecraft var310 = field_43;
            if (var50 == null) {
               long var342 = 1773794229479253767L;
               net.minecraft.client.Minecraft var94 = field_43;
               if (var94.field_44Q == null) {
                  return;
               }

               var310 = field_43;
            }

            label650: {
               long var343 = 1778444944267202318L;
               net.minecraft.client.Minecraft var95 = var310;
               net.minecraft.client.entity.EntityPlayerSP var311 = var95.field_42P;
               if (var50 == null) {
                  if (var95.field_42P == null) {
                     return;
                  }

                  var312 = field_43;
                  if (var50 != null) {
                     break label650;
                  }

                  long var344 = 1778444944267202318L;
                  net.minecraft.client.Minecraft var96 = field_43;
                  var311 = var96.field_42P;
               }

               if (var311.field_48y < 10) {
                  return;
               }

               var312 = field_43;
            }

            long var345 = 1773794229479253767L;
            net.minecraft.client.Minecraft var97 = var312;
            if (var97.field_44Q.field_44Q == null) {
               return;
            }

            label550: {
               label549: {
                  label548: {
                     if (var54 != null) {
                        net.C_47tf var55;
                        double[] var56;
                        label545: {
                           long var391 = 1771901341409993808L;
                           net.minecraft.entity.EntityLivingBase var98 = var54;
                           BackTrack_47Ca var99 = this;
                           var55 = var99.method_47$1537289edf(var98);
                           long var346 = 1770306585852375741L;
                           client.setting.BooleanSetting var100 = this.settingPredict;
                           var313 = ((var100.method_49$aae029aa0a()) ? 1 : 0);
                           label544:
                           if (var50 == null) {
                              label542:
                              if (var313 != 0) {
                                 label654: {
                                    double var453;
                                    var313 = (byte)((var453 = var54.field_43S - var55.field_40) == 0.0 ? 0 : (var453 < 0.0 ? -1 : 1));
                                    var340 = var50;
                                    if (var2 >= 0L) {
                                       if (var50 == null) {
                                          if (var313 != 0) {
                                             break label654;
                                          }

                                          double var454;
                                          var313 = (byte)((var454 = var54.field_47B - var55.field_41) == 0.0 ? 0 : (var454 < 0.0 ? -1 : 1));
                                       }

                                       var340 = var50;
                                    }

                                    if (var4 >= 0) {
                                       if (var340 == null) {
                                          if (var313 != 0) {
                                             break label654;
                                          }

                                          double var455;
                                          var313 = (byte)((var455 = var54.field_43E - var55.field_47) == 0.0 ? 0 : (var455 < 0.0 ? -1 : 1));
                                       }

                                       var340 = var50;
                                    }

                                    if (var340 != null) {
                                       break label544;
                                    }

                                    if (var313 == 0) {
                                       break label542;
                                    }
                                 }

                                 synchronized (this.field_47q) {
                                    var56 = this.field_47q;
                                 }

                                 if (var50 == null) {
                                    break label545;
                                 }
                              }

                              var313 = 3;
                           }

                           double[] var314 = new double[var313];
                           var314[0] = var54.field_43S;
                           var314[1] = var54.field_47B;
                           var314[2] = var54.field_43E;
                           var56 = var314;
                        }

                        var414 = 1771656953026515078L;
                        net.C_47tf var101 = var55;
                        long var102 = var39;
                        net.minecraft.entity.EntityLivingBase var104 = var54;
                        net.C_478i var297 = net.C_47gg.method_45$591f816751(var104, var102, var101);
                        double var348 = var56[0];
                        double var392 = var56[1];
                        double var416 = var56[2];
                        long var10004 = 1774398984093291286L;
                        double var105 = var416;
                        double var107 = var392;
                        double var109 = var348;
                        net.minecraft.entity.EntityLivingBase var111 = var54;
                        net.C_478i var58 = net.C_47gg.method_43$0f34e7e3b0(var111, var109, var107, var105);
                        long var393 = 1777652994703706684L;
                        net.C_478i var112 = var297;
                        long var113 = var41;
                        net.C_47tf var59 = net.C_47gg.method_42$f4fbca6f44(var113, var112);
                        long var394 = 1777652994703706684L;
                        net.C_478i var115 = var58;
                        long var116 = var41;
                        net.C_47tf var60 = net.C_47gg.method_42$f4fbca6f44(var116, var115);
                        long var349 = 1778444944267202318L;
                        net.minecraft.client.Minecraft var118 = field_43;
                        net.C_47tf var61 = var118.field_42P.method_49$41b79b67a0(1.0F);
                        long var395 = 1766869894060001428L;
                        long var119 = var23;
                        BackTrack_47Ca var121 = this;
                        var315 = ((var121.method_48n$0dd78e0064(var119)) ? 1 : 0);
                        if (var50 != null) {
                           break label549;
                        }

                        if (var315 != 0) {
                           long var396 = 1777171572771625306L;
                           long var122 = var32;
                           BackTrack_47Ca var124 = this;
                           var315 = ((var124.method_45$0dd78e0064(var122)) ? 1 : 0);
                           if (var50 != null) {
                              break label549;
                           }

                           if (var315 != 0) {
                              net.C_47cu var316 = this.field_47e;
                              long var397 = 1770357971138099279L;
                              client.setting.RangeSetting var125 = this.settingDelayBetweenBacktrack;
                              long var350 = var125.method_44$8abf5c6871();
                              var414 = 1777368877076691902L;
                              long var126 = var43;
                              long var128 = var350;
                              net.C_47cu var130 = var316;
                              var315 = ((var130.method_42$b0e346e6e3(var128, var126)) ? 1 : 0);
                              if (var50 != null) {
                                 break label549;
                              }

                              if (var315 != 0) {
                                 long var398 = 1776906278627161828L;
                                 PacketHandler_47Cq var131 = client.ClientGlobals.field_48.field_489;
                                 boolean var351 = var131.method_45_$aae029aa0a();
                                 short var418 = (short)var27;
                                 long var10005 = 1770840594353012840L;
                                 net.minecraft.entity.EntityLivingBase var132 = var54;
                                 boolean var133 = var351;
                                 long var134 = var28;
                                 short var136 = var418;
                                 BackTrack_47Ca var137 = this;
                                 var315 = ((var137.method_44$b3b7078e64(var136, var134, var133, var132)) ? 1 : 0);
                                 if (var50 != null) {
                                    break label549;
                                 }

                                 if (var315 != 0) {
                                    double var352 = var61.method_43$3d77d36e13(var60);
                                    double var399 = var61.method_43$3d77d36e13(var59);
                                    byte var435 = (byte)var35;
                                    long var446 = 1773000884939539612L;
                                    int var138 = var36;
                                    byte var139 = var435;
                                    int var140 = var34;
                                    double var141 = var399;
                                    double var143 = var352;
                                    BackTrack_47Ca var145 = this;
                                    var315 = ((var145.method_49$72a224a996(var143, var141, var140, var139, var138)) ? 1 : 0);
                                    if (var50 != null) {
                                       break label549;
                                    }

                                    if (var315 != 0) {
                                       var414 = 1771315286031218384L;
                                       net.minecraft.entity.EntityLivingBase var146 = var54;
                                       long var147 = var30;
                                       BackTrack_47Ca var149 = this;
                                       var315 = ((var149.method_48$971dcaf928(var147, var146)) ? 1 : 0);
                                       if (var50 != null) {
                                          break label549;
                                       }

                                       if (var315 != 0) {
                                          long var353 = this.field_437;
                                          var414 = 1777368877076691902L;
                                          long var150 = var43;
                                          long var152 = var353;
                                          net.C_47cu var154 = this.field_45;
                                          var315 = ((var154.method_42$b0e346e6e3(var152, var150)) ? 1 : 0);
                                          if (var50 != null) {
                                             break label549;
                                          }

                                          label505:
                                          if (var315 == 0) {
                                             label655: {
                                                long var354 = 1770306585852375741L;
                                                client.setting.BooleanSetting var155 = this.settingDynamic;
                                                var315 = ((var155.method_49$aae029aa0a()) ? 1 : 0);
                                                var340 = var50;
                                                if (var2 > 0L) {
                                                   if (var50 == null) {
                                                      if (var315 == 0) {
                                                         break label655;
                                                      }

                                                      long var356 = 1776906278627161828L;
                                                      PacketHandler_47Cq var156 = client.ClientGlobals.field_48.field_489;
                                                      var315 = ((var156.method_45_$aae029aa0a()) ? 1 : 0);
                                                   }

                                                   var340 = var50;
                                                }

                                                label656: {
                                                   if (var2 >= 0L) {
                                                      if (var340 == null) {
                                                         if (var315 != 0) {
                                                            break label656;
                                                         }

                                                         double var456;
                                                         var315 = (byte)((var456 = var61.method_43$3d77d36e13(var60) - 3.0) == 0.0
                                                            ? 0
                                                            : (var456 < 0.0 ? -1 : 1));
                                                      }

                                                      var340 = var50;
                                                   }

                                                   if (var4 < 0) {
                                                      break label550;
                                                   }

                                                   if (var340 != null) {
                                                      break label549;
                                                   }

                                                   if (var315 <= 0) {
                                                      break label505;
                                                   }
                                                }

                                                short var447 = (short)var49;
                                                long var451 = 1777417080986810683L;
                                                short var157 = var447;
                                                int var158 = var48;
                                                double var159 = 3.0;
                                                net.minecraft.entity.EntityLivingBase var161 = var54;
                                                int var162 = var47;
                                                boolean var163 = true;
                                                net.C_47zh var164 = var1;
                                                var164.method_41$337ba7bdf9(var163, var162, var161, var159, var158, var157);
                                                if (var4 <= 0) {
                                                   break label548;
                                                }

                                                if (var50 == null) {
                                                   break label505;
                                                }
                                             }

                                             var414 = 1773279360935380416L;
                                             boolean var165 = true;
                                             long var166 = var21;
                                             net.C_47zh var168 = var1;
                                             var168.method_47$b757cde368(var166, var165);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     long var400 = 1773753460461730154L;
                     net.C_47zh var169 = var1;
                     this.field_43a = var169.method_44$aae029aa0a();
                  }

                  long var357 = 1773753460461730154L;
                  net.C_47zh var170 = var1;
                  var315 = ((var170.method_44$aae029aa0a()) ? 1 : 0);
               }

               var340 = var50;
            }

            label468: {
               label467:
               if (var340 == null) {
                  if (var315 != 0) {
                     var315 = ((this.field_47F) ? 1 : 0);
                     var340 = var50;
                     if (var4 <= 0) {
                        break label468;
                     }

                     if (var50 != null) {
                        break label467;
                     }

                     if (!this.field_47F) {
                        long var359 = 1777791781510412341L;
                        client.setting.RangeSetting var171 = this.settingDelayBetweenBacktrack;
                        var171.method_43$fedcb3e4d3();
                     }
                  }

                  long var360 = 1773753460461730154L;
                  net.C_47zh var172 = var1;
                  var315 = ((var172.method_44$aae029aa0a()) ? 1 : 0);
               }

               var340 = var50;
            }

            label658: {
               if (var2 > 0L) {
                  if (var340 == null) {
                     if (var315 != 0) {
                        break label658;
                     }

                     this.field_43u = false;
                     var315 = ((this.field_47F) ? 1 : 0);
                  }

                  var340 = var50;
               }

               label455: {
                  label454: {
                     label453: {
                        label452: {
                           label659: {
                              if (var340 == null) {
                                 if (var315 == 0) {
                                    var303 = this;
                                    if (var50 != null) {
                                       break label455;
                                    }

                                    if (this.field_437 > 0) {
                                       break label454;
                                    }
                                 }

                                 var303 = this;
                                 if (var50 != null) {
                                    break label659;
                                 }

                                 long var361 = 1770306585852375741L;
                                 client.setting.BooleanSetting var173 = this.settingCalculateWithOwnPing;
                                 var315 = ((var173.method_49$aae029aa0a()) ? 1 : 0);
                              }

                              if (var315 != 0) {
                                 var303 = this;
                                 if (var2 <= 0L) {
                                    break label453;
                                 }

                                 net.C_47MO var401 = net.C_476q.field_48;
                                 long var442 = 1776770085517167091L;
                                 long var174 = var9;
                                 net.C_47TU var176 = this.settingBackTrackTime;
                                 double var436 = var176.method_41$474dfaa627(var174);
                                 long var452 = 1771054167957362067L;
                                 long var177 = var25;
                                 net.C_47TU var179 = this.settingBackTrackTime;
                                 double var443 = var179.method_43$474dfaa627(var177);
                                 long var448 = 1778583638517557590L;
                                 double var180 = var443;
                                 double var182 = var436;
                                 long var184 = var11;
                                 net.C_47MO var186 = var401;
                                 this.field_437 = Math.max(
                                    0, var186.method_41$07400418b0(var184, var182, var180) - recovery$indy$flow$252(var15, 1773945038800735288L, var5)
                                 );
                                 if (var50 == null) {
                                    break label452;
                                 }
                              }

                              var303 = this;
                           }

                           net.C_47MO var362 = net.C_476q.field_48;
                           long var437 = 1776770085517167091L;
                           long var187 = var9;
                           net.C_47TU var189 = this.settingBackTrackTime;
                           double var422 = var189.method_41$474dfaa627(var187);
                           long var449 = 1771054167957362067L;
                           long var190 = var25;
                           net.C_47TU var192 = this.settingBackTrackTime;
                           double var438 = var192.method_43$474dfaa627(var190);
                           long var444 = 1778583638517557590L;
                           double var193 = var438;
                           double var195 = var422;
                           long var197 = var11;
                           net.C_47MO var199 = var362;
                           var303.field_437 = var199.method_41$07400418b0(var197, var195, var193);
                        }

                        var303 = this;
                     }

                     long var363 = 1770528255188202037L;
                     net.C_47cu var200 = var303.field_47e;
                     var200.method_46$da8c82d5d4();
                  }

                  var303 = this;
               }

               long var364 = 1770528255188202037L;
               net.C_47cu var201 = var303.field_45;
               var201.method_46$da8c82d5d4();
            }

            long var402 = 1773753460461730154L;
            net.C_47zh var202 = var1;
            this.field_47F = var202.method_44$aae029aa0a();
            if (var50 == null) {
               return;
            }
         }

         net.minecraft.client.Minecraft var322 = field_43;
         if (var50 == null) {
            long var365 = 1773794229479253767L;
            net.minecraft.client.Minecraft var203 = field_43;
            if (var203.field_44Q == null) {
               return;
            }

            var322 = field_43;
         }

         label661: {
            long var366 = 1778444944267202318L;
            net.minecraft.client.Minecraft var204 = var322;
            net.minecraft.client.entity.EntityPlayerSP var323 = var204.field_42P;
            if (var50 == null) {
               if (var204.field_42P == null) {
                  return;
               }

               var324 = field_43;
               if (var50 != null) {
                  break label661;
               }

               long var367 = 1778444944267202318L;
               net.minecraft.client.Minecraft var205 = field_43;
               var323 = var205.field_42P;
            }

            if (var323.field_48y < 10) {
               return;
            }

            var324 = field_43;
         }

         long var368 = 1773794229479253767L;
         net.minecraft.client.Minecraft var206 = var324;
         if (var206.field_44Q.field_44Q == null) {
            return;
         }

         long var423 = 1773467787289877529L;
         int var207 = var18;
         int var208 = var17;
         BackTrack_47Ca var209 = this;
         var209.method_47$df16004b03(var208, var207);
         var423 = 1773279360935380416L;
         boolean var210 = this.field_47M;
         long var211 = var21;
         net.C_47zh var213 = var1;
         var213.method_47$b757cde368(var211, var210);
         this.field_43a = this.field_47M;
         long var403 = 1773753460461730154L;
         net.C_47zh var214 = var1;
         boolean var369 = var214.method_44$aae029aa0a();
         if (var50 == null) {
            var369 = !var369;
         }

         this.field_478 = var369;
         if (var50 == null) {
            return;
         }
      }

      net.minecraft.entity.EntityLivingBase var294 = this.field_49;
      StringBuilder var370 = new StringBuilder();
      long var425 = 1770357971138099279L;
      client.setting.RangeSetting var215 = this.settingPingDelay;
      String var404 = var370.append(var215.method_44$8abf5c6871()).append(" ms").toString();
      var425 = 1772318640852811941L;
      String var216 = var404;
      long var217 = var7;
      BackTrack_47Ca var219 = this;
      var219.method_47$d07b98bfef(var217, var216);
      if (var294 != null) {
         net.minecraft.client.Minecraft var325 = field_43;
         if (var50 == null) {
            long var371 = 1773794229479253767L;
            net.minecraft.client.Minecraft var220 = field_43;
            if (var220.field_44Q == null) {
               return;
            }

            var325 = field_43;
         }

         label664: {
            long var372 = 1778444944267202318L;
            net.minecraft.client.Minecraft var221 = var325;
            net.minecraft.client.entity.EntityPlayerSP var326 = var221.field_42P;
            if (var50 == null) {
               if (var221.field_42P == null) {
                  return;
               }

               var327 = field_43;
               if (var50 != null) {
                  break label664;
               }

               long var373 = 1778444944267202318L;
               net.minecraft.client.Minecraft var222 = field_43;
               var326 = var222.field_42P;
            }

            if (var326.field_48y < 10) {
               return;
            }

            var327 = field_43;
         }

         long var374 = 1773794229479253767L;
         net.minecraft.client.Minecraft var223 = var327;
         if (var223.field_44Q.field_44Q != null) {
            net.C_47tf var328 = var294.field_43D;
            if (var50 == null) {
               if (var294.field_43D == null) {
                  return;
               }

               long var375 = 1778444944267202318L;
               net.minecraft.client.Minecraft var224 = field_43;
               var328 = var224.field_42P.method_49$41b79b67a0(1.0F);
            }

            label667: {
               net.C_47tf var295 = var328;
               var425 = 1771901341409993808L;
               net.minecraft.entity.EntityLivingBase var225 = var294;
               BackTrack_47Ca var226 = this;
               net.C_47tf var405 = var226.method_47$1537289edf(var225);
               var425 = 1771656953026515078L;
               net.C_47tf var227 = var405;
               long var228 = var39;
               net.minecraft.entity.EntityLivingBase var230 = var294;
               net.C_478i var296 = net.C_47gg.method_45$591f816751(var230, var228, var227);
               long var406 = 1771994369207500185L;
               net.C_478i var231 = var296;
               net.C_47tf var232 = var295;
               net.C_47tf var298 = net.C_47gg.method_47$42676af4e9(var232, var231);
               long var439 = 1774398984093291286L;
               double var233 = var294.field_43E;
               double var235 = var294.field_47B;
               double var237 = var294.field_43S;
               net.minecraft.entity.EntityLivingBase var239 = var294;
               net.C_478i var299 = net.C_47gg.method_43$0f34e7e3b0(var239, var237, var235, var233);
               long var407 = 1771994369207500185L;
               net.C_478i var240 = var299;
               net.C_47tf var241 = var295;
               net.C_47tf var300 = net.C_47gg.method_47$42676af4e9(var241, var240);
               double var301 = var295.method_43$3d77d36e13(var300);
               double var62 = var295.method_43$3d77d36e13(var298);
               byte var440 = (byte)var35;
               long var450 = 1773000884939539612L;
               int var242 = var36;
               byte var243 = var440;
               int var244 = var34;
               double var245 = var62;
               double var247 = var301;
               BackTrack_47Ca var249 = this;
               var329 = var249.method_49$72a224a996(var247, var245, var244, var243, var242);
               label359:
               if (var50 == null) {
                  label357: {
                     if (var329) {
                        net.C_47cu var330 = this.field_47e;
                        var425 = 1770258964607022767L;
                        long var250 = var37;
                        client.setting.NumberSetting var252 = this.settingDelayBetweenBacktrackPing;
                        double var376 = var252.method_44$474dfaa627(var250);
                        var425 = 1774073768774030413L;
                        long var253 = var13;
                        double var255 = var376;
                        net.C_47cu var257 = var330;
                        var329 = var257.method_43$2ac7ee8710(var255, var253);
                        if (var50 != null) {
                           break label359;
                        }

                        if (var329) {
                           long var408 = 1777171572771625306L;
                           long var258 = var32;
                           BackTrack_47Ca var260 = this;
                           var329 = var260.method_45$0dd78e0064(var258);
                           if (var50 != null) {
                              break label359;
                           }

                           if (var329) {
                              long var409 = 1776906278627161828L;
                              PacketHandler_47Cq var261 = client.ClientGlobals.field_48.field_489;
                              boolean var377 = var261.method_45_$aae029aa0a();
                              short var431 = (short)var27;
                              long var445 = 1770840594353012840L;
                              net.minecraft.entity.EntityLivingBase var262 = var294;
                              boolean var263 = var377;
                              long var264 = var28;
                              short var266 = var431;
                              BackTrack_47Ca var267 = this;
                              var329 = var267.method_44$b3b7078e64(var266, var264, var263, var262);
                              if (var50 != null) {
                                 break label359;
                              }

                              if (var329) {
                                 var425 = 1771315286031218384L;
                                 net.minecraft.entity.EntityLivingBase var268 = var294;
                                 long var269 = var30;
                                 BackTrack_47Ca var271 = this;
                                 var329 = var271.method_48$971dcaf928(var269, var268);
                                 if (var50 != null) {
                                    break label359;
                                 }

                                 if (var329) {
                                    label669: {
                                       label345: {
                                          label670: {
                                             long var378 = 1770306585852375741L;
                                             client.setting.BooleanSetting var272 = this.settingDynamicPing;
                                             byte var331 = ((byte) (var272.method_49$aae029aa0a() ? 1 : 0));
                                             var340 = var50;
                                             if (var4 >= 0) {
                                                if (var50 == null) {
                                                   if (var331 == 0) {
                                                      break label670;
                                                   }

                                                   long var380 = 1776906278627161828L;
                                                   PacketHandler_47Cq var273 = client.ClientGlobals.field_48.field_489;
                                                   var331 = ((byte) (var273.method_45_$aae029aa0a() ? 1 : 0));
                                                }

                                                var340 = var50;
                                             }

                                             label336: {
                                                if (var340 == null) {
                                                   if (var331 != 0) {
                                                      break label336;
                                                   }

                                                   double var457;
                                                   var331 = (byte)((var457 = var295.method_43$3d77d36e13(var300) - 3.0) == 0.0 ? 0 : (var457 < 0.0 ? -1 : 1));
                                                }

                                                if (var331 <= 0) {
                                                   break label345;
                                                }
                                             }

                                             long var410 = 1770357971138099279L;
                                             client.setting.RangeSetting var274 = this.settingPingDelay;
                                             int var381 = var274.method_44$8abf5c6871();
                                             var439 = 1773332080398672714L;
                                             double var275 = 3.0;
                                             net.minecraft.entity.EntityLivingBase var277 = var294;
                                             int var278 = var381;
                                             net.C_47zh var279 = var1;
                                             var279.method_42$162860be77(var278, var277, var275);
                                             var332 = var50;
                                             if (var4 < 0) {
                                                break label669;
                                             }

                                             if (var50 == null) {
                                                break label345;
                                             }
                                          }

                                          long var411 = 1770357971138099279L;
                                          client.setting.RangeSetting var280 = this.settingPingDelay;
                                          int var382 = var280.method_44$8abf5c6871();
                                          long var412 = 1766809901405294472L;
                                          int var281 = var382;
                                          net.C_47zh var282 = var1;
                                          var282.method_45$d00df7729d(var281);
                                       }

                                       this.field_47W = true;
                                       this.field_43a = true;
                                       if (var2 <= 0L) {
                                          break label357;
                                       }

                                       var332 = var50;
                                    }

                                    if (var332 == null) {
                                       return;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.field_43u = false;
                  }

                  var303 = this;
                  if (var50 != null) {
                     break label667;
                  }

                  var329 = this.field_47W;
               }

               if (var329) {
                  long var383 = 1770528255188202037L;
                  net.C_47cu var283 = this.field_47e;
                  var283.method_46$da8c82d5d4();
                  long var384 = 1777791781510412341L;
                  client.setting.RangeSetting var284 = this.settingPingDelay;
                  var284.method_43$fedcb3e4d3();
                  if (var4 <= 0) {
                     return;
                  }

                  var303 = this;
                  if (var50 != null) {
                     break label667;
                  }

                  long var385 = 1770306585852375741L;
                  client.setting.BooleanSetting var285 = this.settingCalculateWithOwnPingPing;
                  if (var285.method_49$aae029aa0a()) {
                     client.setting.RangeSetting var334 = this.settingPingDelay;
                     var425 = 1770357971138099279L;
                     client.setting.RangeSetting var286 = this.settingPingDelay;
                     double var413 = Math.max(0, var286.method_44$8abf5c6871() - recovery$indy$flow$404(var15, 1773945038800735288L, var5));
                     var425 = 1774272614182944624L;
                     double var287 = var413;
                     long var289 = var45;
                     client.setting.RangeSetting var291 = var334;
                     var291.method_43$b7da0951ad(var289, var287);
                  }
               }

               this.field_47W = false;
               var303 = this;
            }

            var303.field_43a = false;
         }
      }
   }



















    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

   private void method_42$ad0e900906(RenderPass var1) {
      long var2 = a ^ 47101699093472L;
      long var4 = var2 ^ 67508719150481L;
      long var10001 = 3012670493623713391L;
      Minecraft var6 = field_43;
      long var10004 = 3022004123177650126L;
      long var7 = var4;
      NumberSetting var9 = this.settingLineWidthMe;
      RenderUtils.method_48$45fe1d62b8(var6.field_42P, this.settingClassicColorMe, (float)var9.method_44$474dfaa627(var7), 255, false);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$268603e72a(C_47Pi var1, C_47wr var2, RenderPass var3) {
      long var4 = a ^ 128568602797771L;
      long var6 = var4 ^ 104707587389748L;
      long var8 = var4 ^ 6553160403904L;
      long var10005 = -226989397542725089L;
      long var10 = var6;
      ModeSetting var12 = this.settingPlayerESP;
      boolean var10004 = var12.method_46$5f9dc63072(var10).equals("PlayerModelArmor");
      var10005 = -226204115795504572L;
      boolean var13 = var10004;
      long var14 = var8;
      C_47wr var16 = var2;
      C_47Pi var17 = var1;
      BackTrack_47Ca var18 = this;
      var18.method_48$d197f0e9b1(var17, var16, var14, var13);
   }



   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 70095987243663L;
      long var4 = var2 ^ 40383247413189L;
      long var10001 = var2 ^ 79449530028693L;
      int var6 = (int)((var2 ^ 79449530028693L) >>> 48);
      int var7 = (int)((var2 ^ 79449530028693L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6875308179843913299L;
      String var9 = C_47eb.method_48$0e30dfc966();
      BackTrack_47Ca var20 = this;
      if (var9 == null) {
         if (this.field_49 == null) {
            return;
         }

         var20 = this;
      }

      var10001 = -6872747052221248845L;
      BooleanSetting var10 = var20.settingCancelHitsIfServerCancelsHit;
      boolean var22 = var10.method_49$aae029aa0a();
      if (var9 == null) {
         if (!var22) {
            return;
         }

         short var23 = (short)var6;
         long var10004 = -6872859917494709319L;
         EntityLivingBase var11 = this.field_49;
         int var12 = var8;
         int var13 = var7;
         short var14 = var23;
         var22 = C_48p.method_43$c918038342(var14, var13, var12, var11);
      }

      if (var9 == null) {
         if (var22) {
            return;
         }

         long var10003 = -6876467977992949510L;
         long var15 = var4;
         EntityLivingBase var17 = this.field_49;
         BackTrack_47Ca var18 = this;
         var22 = var18.method_44$e04982bb4a(var17, var15);
      }

      if (!var22) {
         var10001 = -6874592715711387456L;
         C_475c var19 = var1;
         var19.method_48$da8c82d5d4();
      }
   }




    public void method_41$9b8d272046(net.C_47Pi event, long key) {
        long packetHandlerKey = key ^ 28647365199211L;
        long firstFilterKey = key ^ 122382108011138L;
        long filterKey = key ^ 51969795262634L;
        long modeFilterKey = key ^ 63522018948808L;
        long secondFilterKey = key ^ 4582297337720L;
        long modeKey = key ^ 39118360861767L;
        long callbackKey = key ^ 109366789844811L;
        String mode = (String) recovery$indy$flow$445(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), modeKey);
        String guard = (String) recovery$indy$flow$446();
        int hash = mode.hashCode();
        int selectedMode = -1;
        if (guard != null) {
            selectedMode = hash;
        } else {
            switch (hash) {
                case 2487698:
                    if (mode.equals("Ping")) {
                        selectedMode = 0;
                        if (key <= 0L) guard.equals("ClassicBackTrack");
                    }
                    break;
                case 1896850514:
                    if (mode.equals("ClassicBackTrack")) {
                        selectedMode = 1;
                        if (key < 0L) guard.equals("BackTrack");
                    }
                    break;
                case -966060924:
                    if (mode.equals("BackTrack")) {
                        selectedMode = 2;
                        if (key <= 0L) guard.equals("LagTrack");
                    }
                    break;
                case -1766985991:
                    if (mode.equals("LagTrack")) {
                        selectedMode = 3;
                        if (key < 0L) guard.equals("Gomme");
                    }
                    break;
                case 68985021:
                    if (mode.equals("Gomme")) selectedMode = 4;
                    break;
                default:
                    break;
            }
        }
        if (selectedMode >= 0 && selectedMode <= 2) {
            if (((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49)) == null) return;
            boolean filterFirst = recovery$indy$flow$457(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$454())))).field_489)))))))));
            if (guard == null) {
                if (!filterFirst) return;
                if (key >= 0L) {
                    Object target = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49));
                    if (!recovery$indy$flow$461(target, recovery$indy$flow$460(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event))))))))) return;
                }
                if (key > 0L) {
                    Object filter = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESP));
                    if (!recovery$indy$flow$465(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))))), ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(filter)))))), modeFilterKey)) return;
                }
                filterFirst = recovery$indy$flow$468(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), firstFilterKey);
            }
            boolean filterSecond = recovery$indy$flow$471(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), secondFilterKey);
            recovery$indy$flow$472(filterFirst, filterSecond, filterKey);
            Object packet = recovery$indy$flow$474(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event)))))));
            if (key <= 0L) return;
            Object callback = recovery$indy$flow$475(this, event, packet);
            recovery$indy$flow$477(false, callbackKey, ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(callback)))))));
            if (guard == null) return;
        } else if (selectedMode != 3 && selectedMode != 4) {
            return;
        }
        if (!recovery$indy$flow$481(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$478())))).field_489)))))))), packetHandlerKey)) return;
        Object currentTarget = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49));
        if (guard == null) {
            if (currentTarget != null) {
                Object target = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49));
                boolean sameTarget = recovery$indy$flow$486(target, recovery$indy$flow$485(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event))))))));
                if (sameTarget) {
                    Object filter = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESP));
                    boolean filterFirst = recovery$indy$flow$490(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))))), ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(filter)))))), modeFilterKey);
                    if (key <= 0L || filterFirst) {
                        if (key > 0L) filterFirst = recovery$indy$flow$493(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), firstFilterKey);
                        boolean filterSecond = recovery$indy$flow$496(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), secondFilterKey);
                        recovery$indy$flow$497(filterFirst, filterSecond, filterKey);
                        Object packet = recovery$indy$flow$499(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event)))))));
                        Object callback = recovery$indy$flow$500(this, event, packet);
                        recovery$indy$flow$502(false, callbackKey, ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(callback)))))));
                    }
                }
            }
            currentTarget = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49));
        }
        if (currentTarget == null) return;
        Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$504())))))))))).field_42P));
        if (guard == null) {
            if (player == null) return;
            player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$507())))))))))).field_42P));
        }
        boolean filterFirst = recovery$indy$flow$512(player, recovery$indy$flow$511(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event))))))));
        if (guard == null) {
            int playerState;
            if (key > 0L) {
                if (!filterFirst) return;
                Object filter = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESP));
                if (!recovery$indy$flow$516(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))))), ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(filter)))))), modeFilterKey)) return;
                playerState = recovery$indy$flow$520(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$517())))))))))).field_44r)));
            } else {
                playerState = filterFirst ? 1 : 0;
            }
            if (playerState == 0 && recovery$indy$flow$523(((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingOnlyInThirdPerson)))))))))) return;
            filterFirst = recovery$indy$flow$526(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayer)))))))), firstFilterKey);
        }
        boolean filterSecond = recovery$indy$flow$529(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayer)))))))), secondFilterKey);
        recovery$indy$flow$530(filterFirst, filterSecond, filterKey);
        Object packet = recovery$indy$flow$532(((java.lang.Object)(((net.C_47Pi) (((java.lang.Object)(event)))))));
        Object callback = recovery$indy$flow$533(this, event, packet);
        recovery$indy$flow$535(false, callbackKey, ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(callback)))))));
    }







   private boolean method_41$894f5cf30b(ModeSetting var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 40890595209348L;
      long var10000 = 3846582633139436633L;
      String var6 = C_47eb.method_48$0e30dfc966();
      long var10002 = 3848862802970432431L;
      long var7 = var4;
      ModeSetting var9 = var1;
      boolean var14 = var9.method_46$5f9dc63072(var7).equals("PlayerModel");
      if (var6 == null) {
         if (!var14) {
            var10002 = 3848862802970432431L;
            long var10 = var4;
            ModeSetting var12 = var1;
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



   private double method_41$6544fd5d65(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 136438148199081L;
      String var8 = recovery$indy$6(9000426387203503583L, var4);
      boolean var10000 = recovery$indy$7(ClientGlobals.field_48.field_48Q, var6, 8994609079549300399L, var4);
      if (var8 == null) {
         if (var10000) {
            return ClientGlobals.field_48.field_48Q.field_42J;
         }

         if (var8 != null) {
            return recovery$indy$9(ClientGlobals.field_48.field_41L, 8994921370925091239L, var4);
         }

         var10000 = recovery$indy$8(ClientGlobals.field_48.field_41L, var6, 8994609079549300399L, var4);
      }

      return !var10000 ? 3.0 : recovery$indy$9(ClientGlobals.field_48.field_41L, 8994921370925091239L, var4);
   }



   public void method_40$e781d6169a(net.C_47zh var1, long var2) {
        augustus.recovered.modules.latency.BackTrack_47Ca var269;
        augustus.recovered.modules.latency.BackTrack_47Ca var270;
      long var4 = var2 ^ 112741827346033L;
      long var6 = var2 ^ 72117992307098L;
      long var8 = var2 ^ 138480231952404L;
      long var10 = var2 ^ 27738005618893L;
      String var12 = net.C_47eb.method_48$0e30dfc966();
      net.C_47zh var16 = var1;
      net.C_473U var13 = var16.method_44$96fcbedb66();
      long var17 = var8;
      client.setting.ModeSetting var19 = this.settingAbortCriterion;
      String var10000 = var19.method_46$5f9dc63072(var17);
      if (var12 == null) {
         if (var10000.equals("OnAttack") && this.field_49 != null) {
            client.setting.BooleanSetting var20 = this.settingFixPacketOrder;
            if (var20.method_49$aae029aa0a()) {
               int var279 = ((int) (var13 instanceof C_45J ? 1 : 0));
               if (var2 > 0L) {
                  label2092: {
                     label2091: {
                        label2167: {
                           if (var12 == null) {
                              if ((var279) != 0) {
                                 net.C_40x var282 = ((C_45J)var13).method_47$4de68953a2();
                                 net.C_40x var292 = net.C_40x.DROP_ALL_ITEMS;
                                 if (var12 == null) {
                                    if (var282 == net.C_40x.DROP_ALL_ITEMS) {
                                       break label2167;
                                    }

                                    var282 = ((C_45J)var13).method_47$4de68953a2();
                                    var292 = net.C_40x.DROP_ITEM;
                                 }

                                 if (var12 == null) {
                                    if (var282 == var292) {
                                       break label2167;
                                    }

                                    var282 = ((C_45J)var13).method_47$4de68953a2();
                                    var292 = net.C_40x.RELEASE_USE_ITEM;
                                 }

                                 if (var282 == var292) {
                                    break label2167;
                                 }
                              }

                              var279 = ((int) (var13 instanceof C_47jt ? 1 : 0));
                           }

                           if (var12 == null) {
                              if ((var279 != 0) && ((C_47jt)var13).method_41$755b7fcdef() == net.C_4713.OPEN_INVENTORY_ACHIEVEMENT) {
                                 break label2167;
                              }

                              var279 = ((int) (var13 instanceof C_45W ? 1 : 0));
                           }

                           if (var12 == null) {
                              if ((var279 != 0) && ((C_45W)var13).method_42$c4164528f2() == net.C_40y.OPEN_INVENTORY) {
                                 break label2167;
                              }

                              var279 = ((int) (var13 instanceof C_42V ? 1 : 0));
                           }

                           label2063:
                           if (var12 == null) {
                              if ((var279 != 0)
                                 && ((C_42V)var13).method_44$8abf5c6871() == 255
                                 && ((C_42V)var13).method_42$bc607678b6() == 0.0F
                                 && ((C_42V)var13).method_48$bc607678b6() == 0.0F) {
                                 float var294;
                                 var279 = (var294 = ((C_42V)var13).method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var294 < 0.0F ? -1 : 1);
                                 if (var12 != null) {
                                    break label2063;
                                 }

                                 if (!(var279 != 0)) {
                                    break label2167;
                                 }
                              }

                              var279 = ((int) (var13 instanceof C_47bi ? 1 : 0));
                           }

                           if (var12 == null) {
                              if ((var279) != 0) {
                                 break label2167;
                              }

                              var279 = ((int) (var13 instanceof C_476l ? 1 : 0));
                           }

                           if (var12 != null) {
                              break label2092;
                           }

                           if (!(var279 != 0)) {
                              break label2091;
                           }
                        }

                        boolean var61 = true;
                        long var63 = var10;
                        net.C_47zh var65 = var1;
                        var65.method_47$b757cde368(var63, var61);
                     }

                     var279 = ((int) (var13 instanceof C_47WF ? 1 : 0));
                  }

                  if ((var279 != 0) && ((C_47WF)var13).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                     long var68 = var6;
                     client.setting.NumberSetting var71 = this.settingStopOnAttackMaxHurtTime;
                     if (var71.method_44$474dfaa627(var68) >= this.field_49.field_432) {
                        this.field_43u = true;
                     }
                  }

                  long var74 = var8;
                  client.setting.ModeSetting var77 = this.settingMode;
                  String var55 = var77.method_46$5f9dc63072(var74);
                  byte var59 = -1;
                  switch (var55.hashCode()) {
                     case -1766985991:
                        if (var55.equals("LagTrack")) {
                           var59 = 0;
                           if (var12 != null && var55.equals("Gomme")) {
                              var59 = 1;
                           }
                        }
                        break;
                     case 68985021:
                        if (var55.equals("Gomme")) {
                           var59 = 1;
                        }
                  }

                  switch (var59) {
                     case 0:
                        StringBuilder var293 = new StringBuilder();
                        client.setting.RangeSetting var85 = this.settingMaxLagPackets;
                        String var93 = var293.append(var85.method_44$8abf5c6871()).append("").toString();
                        long var101 = var4;
                        BackTrack_47Ca var109 = this;
                        var109.method_47$d07b98bfef(var101, var93);
                        net.minecraft.client.Minecraft var116 = field_43;
                        if (var116.field_44Q != null) {
                           net.minecraft.client.Minecraft var124 = field_43;
                           if (var124.field_42P != null) {
                              net.minecraft.client.Minecraft var131 = field_43;
                              if (var131.field_42P.field_48y >= 10) {
                                 net.minecraft.client.Minecraft var139 = field_43;
                                 if (var139.field_44Q.field_44Q != null) {
                                    boolean var283 = var13 instanceof C_47WF;
                                    if (var12 == null) {
                                       if (var283) {
                                          this.field_47m = true;
                                       }

                                       var283 = var13 instanceof C_479E;
                                    }

                                    if (var12 == null) {
                                       if (var283 && this.field_47m) {
                                          this.field_47r = true;
                                       }

                                       var283 = this.field_47M;
                                    }

                                    if (var283) {
                                       long var150 = var8;
                                       client.setting.ModeSetting var161 = this.settingCountMode;
                                       if (var161.method_46$5f9dc63072(var150).equals("MovePacket") && var13 instanceof C_479E) {
                                          this.field_43y++;
                                       }
                                    }

                                    boolean var180 = this.field_47M;
                                    long var199 = var10;
                                    net.C_47zh var218 = var1;
                                    var218.method_47$b757cde368(var199, var180);
                                    net.C_47zh var237 = var1;
                                    this.field_43v = !var237.method_44$aae029aa0a();
                                    return;
                                 }
                              }
                           }
                        }

                        return;
                     case 1:
                        if (var13 instanceof C_47WF) {
                           this.field_479 = true;
                        }

                        if (this.field_47O) {
                           boolean var247 = true;
                           long var257 = var10;
                           net.C_47zh var267 = var1;
                           var267.method_47$b757cde368(var257, var247);
                        }

                        return;
                     default:
                        return;
                  }
               }

               if (var2 >= 0L) {
                  label2124: {
                     label2123: {
                        label2172: {
                           if (var12 == null) {
                              if ((var279 != 0) && ((C_45W)var13).method_42$c4164528f2() == net.C_40y.OPEN_INVENTORY) {
                                 break label2172;
                              }

                              var279 = ((int) (var13 instanceof C_42V ? 1 : 0));
                           }

                           label2115:
                           if (var12 == null) {
                              if ((var279 != 0)
                                 && ((C_42V)var13).method_44$8abf5c6871() == 255
                                 && ((C_42V)var13).method_42$bc607678b6() == 0.0F
                                 && ((C_42V)var13).method_48$bc607678b6() == 0.0F) {
                                 float var295;
                                 var279 = (var295 = ((C_42V)var13).method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var295 < 0.0F ? -1 : 1);
                                 if (var12 != null) {
                                    break label2115;
                                 }

                                 if (!(var279 != 0)) {
                                    break label2172;
                                 }
                              }

                              var279 = ((int) (var13 instanceof C_47bi ? 1 : 0));
                           }

                           if (var12 == null) {
                              if ((var279) != 0) {
                                 break label2172;
                              }

                              var279 = ((int) (var13 instanceof C_476l ? 1 : 0));
                           }

                           if (var12 != null) {
                              break label2124;
                           }

                           if (!(var279 != 0)) {
                              break label2123;
                           }
                        }

                        boolean var60 = true;
                        long var62 = var10;
                        net.C_47zh var64 = var1;
                        var64.method_47$b757cde368(var62, var60);
                     }

                     var279 = ((int) (var13 instanceof C_47WF ? 1 : 0));
                  }

                  if ((var279 != 0) && ((C_47WF)var13).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                     long var67 = var6;
                     client.setting.NumberSetting var70 = this.settingStopOnAttackMaxHurtTime;
                     if (var70.method_44$474dfaa627(var67) >= this.field_49.field_432) {
                        this.field_43u = true;
                     }
                  }

                  long var73 = var8;
                  client.setting.ModeSetting var76 = this.settingMode;
                  String var54 = var76.method_46$5f9dc63072(var73);
                  byte var58 = -1;
                  switch (var54.hashCode()) {
                     case -1766985991:
                        if (var54.equals("LagTrack")) {
                           var58 = 0;
                           if (var12.equals("Gomme")) {
                              var58 = 1;
                           }
                        }
                        break;
                     case 68985021:
                        if (var54.equals("Gomme")) {
                           var58 = 1;
                        }
                  }

                  switch (var58) {
                     case 0:
                        StringBuilder var291 = new StringBuilder();
                        client.setting.RangeSetting var84 = this.settingMaxLagPackets;
                        String var92 = var291.append(var84.method_44$8abf5c6871()).append("").toString();
                        long var100 = var4;
                        BackTrack_47Ca var108 = this;
                        var108.method_47$d07b98bfef(var100, var92);
                        net.minecraft.client.Minecraft var115 = field_43;
                        if (var115.field_44Q != null) {
                           net.minecraft.client.Minecraft var123 = field_43;
                           if (var123.field_42P != null) {
                              net.minecraft.client.Minecraft var130 = field_43;
                              if (var130.field_42P.field_48y >= 10) {
                                 net.minecraft.client.Minecraft var138 = field_43;
                                 if (var138.field_44Q.field_44Q != null) {
                                    boolean var281 = var13 instanceof C_47WF;
                                    if (var12 == null) {
                                       if (var281) {
                                          this.field_47m = true;
                                       }

                                       var281 = var13 instanceof C_479E;
                                    }

                                    if (var12 == null) {
                                       if (var281 && this.field_47m) {
                                          this.field_47r = true;
                                       }

                                       var281 = this.field_47M;
                                    }

                                    if (var281) {
                                       long var149 = var8;
                                       client.setting.ModeSetting var160 = this.settingCountMode;
                                       if (var160.method_46$5f9dc63072(var149).equals("MovePacket")) {
                                          this.field_43y++;
                                       }
                                    }

                                    boolean var179 = this.field_47M;
                                    long var198 = var10;
                                    net.C_47zh var217 = var1;
                                    var217.method_47$b757cde368(var198, var179);
                                    net.C_47zh var236 = var1;
                                    this.field_43v = !var236.method_44$aae029aa0a();
                                    return;
                                 }
                              }
                           }
                        }

                        return;
                     case 1:
                        if (var13 instanceof C_47WF) {
                           this.field_479 = true;
                        }

                        if (this.field_47O) {
                           boolean var246 = true;
                           long var256 = var10;
                           net.C_47zh var266 = var1;
                           var266.method_47$b757cde368(var256, var246);
                        }

                        return;
                     default:
                        return;
                  }
               }

               String var289;
               label2135: {
                  if (var12 == null) {
                     if ((var279 != 0)
                        && ((C_42V)var13).method_44$8abf5c6871() == 255
                        && ((C_42V)var13).method_42$bc607678b6() == 0.0F
                        && ((C_42V)var13).method_48$bc607678b6() == 0.0F) {
                        float var296;
                        var279 = (var296 = ((C_42V)var13).method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var296 < 0.0F ? -1 : 1);
                        var289 = var12;
                        break label2135;
                     }

                     var279 = ((int) (var13 instanceof C_47bi ? 1 : 0));
                  }

                  var289 = var12;
               }

               if (var289 == null) {
                  if ((var279) != 0) {
                     boolean var21 = true;
                     long var22 = var10;
                     net.C_47zh var24 = var1;
                     var24.method_47$b757cde368(var22, var21);
                  }

                  var279 = ((int) (var13 instanceof C_47WF ? 1 : 0));
               }

               if ((var279 != 0) && ((C_47WF)var13).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                  long var66 = var6;
                  client.setting.NumberSetting var69 = this.settingStopOnAttackMaxHurtTime;
                  if (var69.method_44$474dfaa627(var66) >= this.field_49.field_432) {
                     this.field_43u = true;
                  }
               }

               long var72 = var8;
               client.setting.ModeSetting var75 = this.settingMode;
               String var53 = var75.method_46$5f9dc63072(var72);
               byte var57 = -1;
               switch (var53.hashCode()) {
                  case -1766985991:
                     if (var53.equals("LagTrack")) {
                        var57 = 0;
                        if (var12.equals("Gomme")) {
                           var57 = 1;
                        }
                     }
                     break;
                  case 68985021:
                     if (var53.equals("Gomme")) {
                        var57 = 1;
                     }
               }

               switch (var57) {
                  case 0:
                     StringBuilder var290 = new StringBuilder();
                     client.setting.RangeSetting var83 = this.settingMaxLagPackets;
                     String var91 = var290.append(var83.method_44$8abf5c6871()).append("").toString();
                     long var99 = var4;
                     BackTrack_47Ca var107 = this;
                     var107.method_47$d07b98bfef(var99, var91);
                     net.minecraft.client.Minecraft var114 = field_43;
                     if (var114.field_44Q != null) {
                        net.minecraft.client.Minecraft var122 = field_43;
                        if (var122.field_42P != null) {
                           net.minecraft.client.Minecraft var129 = field_43;
                           if (var129.field_42P.field_48y >= 10) {
                              net.minecraft.client.Minecraft var137 = field_43;
                              if (var137.field_44Q.field_44Q != null) {
                                 boolean var280 = var13 instanceof C_47WF;
                                 if (var12 == null) {
                                    if (var280 && this.field_47m) {
                                       this.field_47r = true;
                                    }

                                    var280 = this.field_47M;
                                 }

                                 if (var280) {
                                    long var148 = var8;
                                    client.setting.ModeSetting var159 = this.settingCountMode;
                                    if (var159.method_46$5f9dc63072(var148).equals("MovePacket")) {
                                       this.field_43y++;
                                    }
                                 }

                                 boolean var178 = this.field_47M;
                                 long var197 = var10;
                                 net.C_47zh var216 = var1;
                                 var216.method_47$b757cde368(var197, var178);
                                 net.C_47zh var235 = var1;
                                 this.field_43v = !var235.method_44$aae029aa0a();
                                 return;
                              }
                           }
                        }
                     }

                     return;
                  case 1:
                     if (var13 instanceof C_47WF) {
                        this.field_479 = true;
                     }

                     if (this.field_47O) {
                        boolean var245 = true;
                        long var255 = var10;
                        net.C_47zh var265 = var1;
                        var265.method_47$b757cde368(var255, var245);
                     }

                     return;
                  default:
                     return;
               }
            }

            if (var13 instanceof C_47WF && ((C_47WF)var13).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
               long var25 = var6;
               client.setting.NumberSetting var27 = this.settingStopOnAttackMaxHurtTime;
               if (var27.method_44$474dfaa627(var25) >= this.field_49.field_432) {
                  this.field_43u = true;
               }
            }
         }

         long var28 = var8;
         client.setting.ModeSetting var30 = this.settingMode;
         String var52 = var30.method_46$5f9dc63072(var28);
         byte var15 = -1;
         switch (var52.hashCode()) {
            case -1766985991:
               if (var52.equals("LagTrack")) {
                  var15 = 0;
                  if (var2 > 0L) {
                     if (var12 != null && var52.equals("Gomme")) {
                        var15 = 1;
                     }

                     switch (var15) {
                        case 0:
                           StringBuilder var288 = new StringBuilder();
                           client.setting.RangeSetting var82 = this.settingMaxLagPackets;
                           String var90 = var288.append(var82.method_44$8abf5c6871()).append("").toString();
                           long var98 = var4;
                           BackTrack_47Ca var106 = this;
                           var106.method_47$d07b98bfef(var98, var90);
                           net.minecraft.client.Minecraft var113 = field_43;
                           if (var113.field_44Q != null) {
                              net.minecraft.client.Minecraft var121 = field_43;
                              if (var121.field_42P != null) {
                                 net.minecraft.client.Minecraft var128 = field_43;
                                 if (var128.field_42P.field_48y >= 10) {
                                    net.minecraft.client.Minecraft var136 = field_43;
                                    if (var136.field_44Q.field_44Q != null) {
                                       boolean var278 = var13 instanceof C_47WF;
                                       if (var12 == null) {
                                          if (var278) {
                                             this.field_47m = true;
                                          }

                                          var278 = var13 instanceof C_479E;
                                       }

                                       if (var12 == null) {
                                          if (var278 && this.field_47m) {
                                             this.field_47r = true;
                                          }

                                          var278 = this.field_47M;
                                       }

                                       if (var278) {
                                          long var147 = var8;
                                          client.setting.ModeSetting var158 = this.settingCountMode;
                                          if (var158.method_46$5f9dc63072(var147).equals("MovePacket") && var13 instanceof C_479E) {
                                             this.field_43y++;
                                          }
                                       }

                                       boolean var177 = this.field_47M;
                                       long var196 = var10;
                                       net.C_47zh var215 = var1;
                                       var215.method_47$b757cde368(var196, var177);
                                       net.C_47zh var234 = var1;
                                       this.field_43v = !var234.method_44$aae029aa0a();
                                       return;
                                    }
                                 }
                              }
                           }

                           return;
                        case 1:
                           if (var13 instanceof C_47WF) {
                              this.field_479 = true;
                           }

                           if (this.field_47O) {
                              boolean var244 = true;
                              long var254 = var10;
                              net.C_47zh var264 = var1;
                              var264.method_47$b757cde368(var254, var244);
                           }

                           return;
                        default:
                           return;
                     }
                  } else {
                     if (var12.equals("Gomme")) {
                        var15 = 1;
                     }

                     switch (var15) {
                        case 0:
                           StringBuilder var287 = new StringBuilder();
                           client.setting.RangeSetting var81 = this.settingMaxLagPackets;
                           String var89 = var287.append(var81.method_44$8abf5c6871()).append("").toString();
                           long var97 = var4;
                           BackTrack_47Ca var105 = this;
                           var105.method_47$d07b98bfef(var97, var89);
                           net.minecraft.client.Minecraft var112 = field_43;
                           if (var112.field_44Q != null) {
                              net.minecraft.client.Minecraft var120 = field_43;
                              if (var120.field_42P != null) {
                                 net.minecraft.client.Minecraft var127 = field_43;
                                 if (var127.field_42P.field_48y >= 10) {
                                    net.minecraft.client.Minecraft var135 = field_43;
                                    if (var135.field_44Q.field_44Q != null) {
                                       boolean var277 = var13 instanceof C_47WF;
                                       if (var2 >= 0L) {
                                          if (var12 == null) {
                                             if (var277) {
                                                this.field_47m = true;
                                             }

                                             var277 = var13 instanceof C_479E;
                                          }

                                          if (var12 == null) {
                                             if (var277 && this.field_47m) {
                                                this.field_47r = true;
                                             }

                                             var277 = this.field_47M;
                                          }

                                          if (var277) {
                                             long var146 = var8;
                                             client.setting.ModeSetting var157 = this.settingCountMode;
                                             if (var157.method_46$5f9dc63072(var146).equals("MovePacket")) {
                                                this.field_43y++;
                                             }
                                          }

                                          boolean var176 = this.field_47M;
                                          long var195 = var10;
                                          net.C_47zh var214 = var1;
                                          var214.method_47$b757cde368(var195, var176);
                                          net.C_47zh var233 = var1;
                                          this.field_43v = !var233.method_44$aae029aa0a();
                                          return;
                                       }

                                       if (var12 == null) {
                                          if (var277 && this.field_47m) {
                                             this.field_47r = true;
                                          }

                                          var277 = this.field_47M;
                                       }

                                       if (var277) {
                                          long var145 = var8;
                                          client.setting.ModeSetting var156 = this.settingCountMode;
                                          if (var156.method_46$5f9dc63072(var145).equals("MovePacket")) {
                                             this.field_43y++;
                                          }
                                       }

                                       boolean var175 = this.field_47M;
                                       long var194 = var10;
                                       net.C_47zh var213 = var1;
                                       var213.method_47$b757cde368(var194, var175);
                                       net.C_47zh var232 = var1;
                                       this.field_43v = !var232.method_44$aae029aa0a();
                                       return;
                                    }
                                 }
                              }
                           }

                           return;
                        case 1:
                           if (var13 instanceof C_47WF) {
                              this.field_479 = true;
                           }

                           if (this.field_47O) {
                              boolean var243 = true;
                              long var253 = var10;
                              net.C_47zh var263 = var1;
                              var263.method_47$b757cde368(var253, var243);
                           }

                           return;
                        default:
                           return;
                     }
                  }
               } else {
                  switch (var15) {
                     case 0:
                        StringBuilder var286 = new StringBuilder();
                        client.setting.RangeSetting var80 = this.settingMaxLagPackets;
                        String var88 = var286.append(var80.method_44$8abf5c6871()).append("").toString();
                        long var96 = var4;
                        BackTrack_47Ca var104 = this;
                        var104.method_47$d07b98bfef(var96, var88);
                        net.minecraft.client.Minecraft var111 = field_43;
                        if (var111.field_44Q != null) {
                           net.minecraft.client.Minecraft var119 = field_43;
                           if (var119.field_42P != null) {
                              net.minecraft.client.Minecraft var126 = field_43;
                              if (var126.field_42P.field_48y >= 10) {
                                 net.minecraft.client.Minecraft var134 = field_43;
                                 if (var134.field_44Q.field_44Q != null) {
                                    boolean var275 = var13 instanceof C_47WF;
                                    if (var2 >= 0L) {
                                       if (var12 == null) {
                                          if (var275) {
                                             this.field_47m = true;
                                          }

                                          var275 = var13 instanceof C_479E;
                                       }

                                       if (var12 == null) {
                                          if (var275 && this.field_47m) {
                                             this.field_47r = true;
                                          }

                                          var275 = this.field_47M;
                                       }

                                       if (var275) {
                                          long var144 = var8;
                                          client.setting.ModeSetting var155 = this.settingCountMode;
                                          boolean var276 = var155.method_46$5f9dc63072(var144).equals("MovePacket");
                                          if (var2 > 0L) {
                                             if (var276 && var13 instanceof C_479E) {
                                                this.field_43y++;
                                             }

                                             boolean var174 = this.field_47M;
                                             long var193 = var10;
                                             net.C_47zh var212 = var1;
                                             var212.method_47$b757cde368(var193, var174);
                                             net.C_47zh var231 = var1;
                                             this.field_43v = !var231.method_44$aae029aa0a();
                                             return;
                                          }

                                          if (var276) {
                                             this.field_43y++;
                                          }

                                          boolean var173 = this.field_47M;
                                          long var192 = var10;
                                          net.C_47zh var211 = var1;
                                          var211.method_47$b757cde368(var192, var173);
                                          net.C_47zh var230 = var1;
                                          this.field_43v = !var230.method_44$aae029aa0a();
                                          return;
                                       }

                                       boolean var172 = this.field_47M;
                                       long var191 = var10;
                                       net.C_47zh var210 = var1;
                                       var210.method_47$b757cde368(var191, var172);
                                       net.C_47zh var229 = var1;
                                       this.field_43v = !var229.method_44$aae029aa0a();
                                       return;
                                    }

                                    if (var12 == null) {
                                       if (var275 && this.field_47m) {
                                          this.field_47r = true;
                                       }

                                       var275 = this.field_47M;
                                    }

                                    if (var275) {
                                       long var143 = var8;
                                       client.setting.ModeSetting var154 = this.settingCountMode;
                                       if (var154.method_46$5f9dc63072(var143).equals("MovePacket")) {
                                          this.field_43y++;
                                       }
                                    }

                                    boolean var171 = this.field_47M;
                                    long var190 = var10;
                                    net.C_47zh var209 = var1;
                                    var209.method_47$b757cde368(var190, var171);
                                    net.C_47zh var228 = var1;
                                    this.field_43v = !var228.method_44$aae029aa0a();
                                    return;
                                 }
                              }
                           }
                        }

                        return;
                     case 1:
                        if (var13 instanceof C_47WF) {
                           this.field_479 = true;
                        }

                        if (this.field_47O) {
                           boolean var242 = true;
                           long var252 = var10;
                           net.C_47zh var262 = var1;
                           var262.method_47$b757cde368(var252, var242);
                        }

                        return;
                     default:
                        return;
                  }
               }
            case 68985021:
               if (var52.equals("Gomme")) {
                  var15 = 1;
               }

               switch (var15) {
                  case 0:
                     StringBuilder var285 = new StringBuilder();
                     client.setting.RangeSetting var79 = this.settingMaxLagPackets;
                     String var87 = var285.append(var79.method_44$8abf5c6871()).append("").toString();
                     long var95 = var4;
                     BackTrack_47Ca var103 = this;
                     var103.method_47$d07b98bfef(var95, var87);
                     net.minecraft.client.Minecraft var110 = field_43;
                     if (var110.field_44Q != null) {
                        net.minecraft.client.Minecraft var118 = field_43;
                        if (var118.field_42P != null) {
                           net.minecraft.client.Minecraft var125 = field_43;
                           if (var125.field_42P.field_48y >= 10) {
                              net.minecraft.client.Minecraft var133 = field_43;
                              if (var133.field_44Q.field_44Q != null) {
                                 boolean var273 = var13 instanceof C_47WF;
                                 if (var2 >= 0L) {
                                    if (var12 == null) {
                                       if (var273) {
                                          this.field_47m = true;
                                       }

                                       var273 = var13 instanceof C_479E;
                                    }

                                    if (var12 == null) {
                                       if (var273 && this.field_47m) {
                                          this.field_47r = true;
                                       }

                                       var273 = this.field_47M;
                                    }

                                    if (var273) {
                                       long var142 = var8;
                                       client.setting.ModeSetting var153 = this.settingCountMode;
                                       boolean var274 = var153.method_46$5f9dc63072(var142).equals("MovePacket");
                                       if (var2 > 0L) {
                                          if (var274 && var13 instanceof C_479E) {
                                             this.field_43y++;
                                          }

                                          boolean var170 = this.field_47M;
                                          long var189 = var10;
                                          net.C_47zh var208 = var1;
                                          var208.method_47$b757cde368(var189, var170);
                                          net.C_47zh var227 = var1;
                                          this.field_43v = !var227.method_44$aae029aa0a();
                                          return;
                                       }

                                       if (var274) {
                                          this.field_43y++;
                                       }

                                       boolean var169 = this.field_47M;
                                       long var188 = var10;
                                       net.C_47zh var207 = var1;
                                       var207.method_47$b757cde368(var188, var169);
                                       net.C_47zh var226 = var1;
                                       this.field_43v = !var226.method_44$aae029aa0a();
                                       return;
                                    }

                                    boolean var168 = this.field_47M;
                                    long var187 = var10;
                                    net.C_47zh var206 = var1;
                                    var206.method_47$b757cde368(var187, var168);
                                    net.C_47zh var225 = var1;
                                    this.field_43v = !var225.method_44$aae029aa0a();
                                    return;
                                 }

                                 if (var12 == null) {
                                    if (var273 && this.field_47m) {
                                       this.field_47r = true;
                                    }

                                    var273 = this.field_47M;
                                 }

                                 if (var273) {
                                    long var141 = var8;
                                    client.setting.ModeSetting var152 = this.settingCountMode;
                                    if (var152.method_46$5f9dc63072(var141).equals("MovePacket")) {
                                       this.field_43y++;
                                    }
                                 }

                                 boolean var167 = this.field_47M;
                                 long var186 = var10;
                                 net.C_47zh var205 = var1;
                                 var205.method_47$b757cde368(var186, var167);
                                 net.C_47zh var224 = var1;
                                 this.field_43v = !var224.method_44$aae029aa0a();
                                 return;
                              }
                           }
                        }
                     }

                     return;
                  case 1:
                     if (var13 instanceof C_47WF) {
                        this.field_479 = true;
                     }

                     if (this.field_47O) {
                        boolean var241 = true;
                        long var251 = var10;
                        net.C_47zh var261 = var1;
                        var261.method_47$b757cde368(var251, var241);
                     }

                     return;
                  default:
                     return;
               }
            default:
               switch (var15) {
                  case 0:
                     StringBuilder var284 = new StringBuilder();
                     client.setting.RangeSetting var78 = this.settingMaxLagPackets;
                     String var86 = var284.append(var78.method_44$8abf5c6871()).append("").toString();
                     long var94 = var4;
                     BackTrack_47Ca var102 = this;
                     var102.method_47$d07b98bfef(var94, var86);
                     net.minecraft.client.Minecraft var36 = field_43;
                     if (var36.field_44Q != null) {
                        net.minecraft.client.Minecraft var117 = field_43;
                        if (var117.field_42P != null) {
                           net.minecraft.client.Minecraft var38 = field_43;
                           if (var38.field_42P.field_48y >= 10) {
                              net.minecraft.client.Minecraft var132 = field_43;
                              if (var132.field_44Q.field_44Q != null) {
                                 boolean var271 = var13 instanceof C_47WF;
                                 if (var2 >= 0L) {
                                    if (var12 == null) {
                                       if (var271) {
                                          this.field_47m = true;
                                       }

                                       var271 = var13 instanceof C_479E;
                                    }

                                    if (var12 == null) {
                                       if (var271 && this.field_47m) {
                                          this.field_47r = true;
                                       }

                                       var271 = this.field_47M;
                                    }

                                    if (var271) {
                                       long var140 = var8;
                                       client.setting.ModeSetting var151 = this.settingCountMode;
                                       boolean var272 = var151.method_46$5f9dc63072(var140).equals("MovePacket");
                                       if (var2 > 0L) {
                                          if (var272 && var13 instanceof C_479E) {
                                             this.field_43y++;
                                          }

                                          boolean var166 = this.field_47M;
                                          long var185 = var10;
                                          net.C_47zh var204 = var1;
                                          var204.method_47$b757cde368(var185, var166);
                                          net.C_47zh var223 = var1;
                                          this.field_43v = !var223.method_44$aae029aa0a();
                                          return;
                                       }

                                       if (var272) {
                                          this.field_43y++;
                                       }

                                       boolean var165 = this.field_47M;
                                       long var184 = var10;
                                       net.C_47zh var203 = var1;
                                       var203.method_47$b757cde368(var184, var165);
                                       net.C_47zh var222 = var1;
                                       this.field_43v = !var222.method_44$aae029aa0a();
                                       return;
                                    }

                                    boolean var164 = this.field_47M;
                                    long var183 = var10;
                                    net.C_47zh var202 = var1;
                                    var202.method_47$b757cde368(var183, var164);
                                    net.C_47zh var221 = var1;
                                    this.field_43v = !var221.method_44$aae029aa0a();
                                    return;
                                 }

                                 if (var12 == null) {
                                    if (var271 && this.field_47m) {
                                       this.field_47r = true;
                                    }

                                    var271 = this.field_47M;
                                 }

                                 if (var271) {
                                    long var40 = var8;
                                    client.setting.ModeSetting var42 = this.settingCountMode;
                                    if (var42.method_46$5f9dc63072(var40).equals("MovePacket")) {
                                       this.field_43y++;
                                    }
                                 }

                                 boolean var163 = this.field_47M;
                                 long var182 = var10;
                                 net.C_47zh var201 = var1;
                                 var201.method_47$b757cde368(var182, var163);
                                 net.C_47zh var220 = var1;
                                 this.field_43v = !var220.method_44$aae029aa0a();
                                 return;
                              }
                           }
                        }
                     }

                     return;
                  case 1:
                     if (var13 instanceof C_47WF) {
                        this.field_479 = true;
                     }

                     if (this.field_47O) {
                        boolean var240 = true;
                        long var250 = var10;
                        net.C_47zh var260 = var1;
                        var260.method_47$b757cde368(var250, var240);
                     }

                     return;
               }
         }
      } else {
         String var14 = var10000;
         switch (var14.hashCode()) {
            case 0:
               StringBuilder var10001 = new StringBuilder();
               client.setting.RangeSetting var31 = this.settingMaxLagPackets;
               String var32 = var10001.append(var31.method_44$8abf5c6871()).append("").toString();
               long var33 = var4;
               BackTrack_47Ca var35 = this;
               var35.method_47$d07b98bfef(var33, var32);
               net.minecraft.client.Minecraft var37 = field_43;
               if (var37.field_42P.field_48y >= 10) {
                  net.minecraft.client.Minecraft var39 = field_43;
                  if (var39.field_44Q.field_44Q != null) {
                     boolean var268 = var13 instanceof C_47WF;
                     if (var2 >= 0L) {
                        if (var12 == null) {
                           if (var268) {
                              this.field_47m = true;
                           }

                           var268 = var13 instanceof C_479E;
                        }

                        label2147: {
                           if (var12 == null) {
                              if (!var268) {
                                 var270 = this;
                                 break label2147;
                              }

                              var268 = this.field_47m;
                           }

                           if (var268) {
                              var270 = this;
                           } else {
                              boolean var162 = this.field_47M;
                              long var181 = var10;
                              net.C_47zh var200 = var1;
                              var200.method_47$b757cde368(var181, var162);
                              var270 = this;
                           }
                        }

                        net.C_47zh var219 = var1;
                        var270.field_43v = var219.method_44$aae029aa0a();
                        if (var13 instanceof C_47WF) {
                           boolean var239 = true;
                           long var249 = var10;
                           net.C_47zh var259 = var1;
                           var259.method_47$b757cde368(var249, var239);
                        }

                        return;
                     }

                     label2155: {
                        if (var12 == null) {
                           if (!var268) {
                              var269 = this;
                              break label2155;
                           }

                           var268 = this.field_47m;
                        }

                        if (var268) {
                           var269 = this;
                        } else {
                           boolean var43 = this.field_47M;
                           long var44 = var10;
                           net.C_47zh var46 = var1;
                           var46.method_47$b757cde368(var44, var43);
                           var269 = this;
                        }
                     }

                     net.C_47zh var47 = var1;
                     var269.field_43v = var47.method_44$aae029aa0a();
                     if (var13 instanceof C_47WF) {
                        boolean var238 = true;
                        long var248 = var10;
                        net.C_47zh var258 = var1;
                        var258.method_47$b757cde368(var248, var238);
                     }

                     return;
                  }
               }

               return;
            case 1:
               if (var13 instanceof C_47WF) {
                  boolean var48 = true;
                  long var49 = var10;
                  net.C_47zh var51 = var1;
                  var51.method_47$b757cde368(var49, var48);
               }

               return;
         }
      }
   }








   private boolean method_44$b3b7078e64(short var1, long var2, boolean var4, EntityLivingBase var5) {
      java.lang.String var83;
      int var70;
      long var6 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var10001 = var6 ^ 39191590738220L;
      int var8 = (int)((var6 ^ 39191590738220L) >>> 48);
      int var9 = (int)((var6 ^ 39191590738220L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var6 ^ 75986548083942L;
      long var13 = var6 ^ 133585452156264L;
      long var10000 = -9183522677254731339L;
      String var15 = C_47eb.method_48$0e30dfc966();
      var10001 = -9171475466992724200L;
      Minecraft var20 = field_43;
      C_47tf var16 = var20.field_42P.method_49$41b79b67a0(1.0F);
      byte var68 = (byte) ((var4) ? 1 : 0);
      if (var15 == null) {
         if ((var4 ? 1 : 0) != 0) {
            long var87 = -9185737825682790845L;
            long var21 = var13;
            ModeSetting var23 = this.settingAbortCriterion;
            boolean var74 = var23.method_46$5f9dc63072(var21).equals("None");
            String var82 = var15;
            if (var1 >= 0) {
               if (var15 == null) {
                  if (var74) {
                     return true;
                  }

                  var87 = -9185737825682790845L;
                  long var24 = var13;
                  ModeSetting var26 = this.settingAbortCriterion;
                  var74 = var26.method_46$5f9dc63072(var24).equals("OnAttack");
               }

               var82 = var15;
            }

            label112: {
               label111:
               if (var82 == null) {
                  if (var74) {
                     var74 = this.field_43u;
                     var83 = var15;
                     if (var2 < 0L) {
                        break label112;
                     }

                     if (var15 != null) {
                        break label111;
                     }

                     if (!this.field_43u) {
                        return true;
                     }
                  }

                  var87 = -9185737825682790845L;
                  long var27 = var13;
                  ModeSetting var29 = this.settingAbortCriterion;
                  var74 = var29.method_46$5f9dc63072(var27).equals("OnRange");
               }

               var83 = var15;
            }

            if (var83 == null) {
               if (var74) {
                  char var84 = (char)var8;
                  short var90 = (short)var9;
                  long var96 = -9183005418308484794L;
                  int var30 = var10;
                  short var31 = var90;
                  char var32 = var84;
                  EntityLivingBase var33 = var5;
                  C_47tf var66 = C_47gg.method_48$ad21877b94(var33, var32, var31, var30);
                  double var75 = var16.method_43$3d77d36e13(var66);
                  long var93 = -9185328105709326663L;
                  long var34 = var11;
                  NumberSetting var36 = this.settingStopOnAttackRange;
                  double var97;
                  int var76 = (var97 = var75 - var36.method_44$474dfaa627(var34)) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1);
                  if (var15 == null) {
                     if (var76 <= 0) {
                        double var77 = var5.field_432;
                        var93 = -9185328105709326663L;
                        long var37 = var11;
                        NumberSetting var39 = this.settingStopOnAttackMaxHurtTime;
                        double var98;
                        int var102 = (var98 = var77 - var39.method_44$474dfaa627(var37)) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
                        if (var15 != null) {
                           return var102 != 0;
                        }

                        if (var102 <= 0) {
                           return false;
                        }
                     }

                     var76 = 1;
                  }

                  return var76 != 0;
               }

               var74 = false;
            }

            return var74;
         }

         var68 = 1;
      }

      int var17 = var68;
      long var10002 = -9185737825682790845L;
      long var40 = var13;
      ModeSetting var42 = this.settingAbortCriterion;
      if (var42.method_46$5f9dc63072(var40).equals("OnRange")) {
         char var79 = (char)var8;
         short var85 = (short)var9;
         long var10004 = -9183005418308484794L;
         int var43 = var10;
         short var44 = var85;
         char var45 = var79;
         EntityLivingBase var46 = var5;
         C_47tf var18 = C_47gg.method_48$ad21877b94(var46, var45, var44, var43);
         double var69 = var16.method_43$3d77d36e13(var18);
         long var10003 = -9185328105709326663L;
         long var47 = var11;
         NumberSetting var49 = this.settingStopOnAttackRange;
         double var99;
         var70 = (var99 = var69 - var49.method_44$474dfaa627(var47)) == 0.0 ? 0 : (var99 < 0.0 ? -1 : 1);
         label143:
         if (var15 == null) {
            if (var70 <= 0) {
               double var71 = var5.field_432;
               var10003 = -9185328105709326663L;
               long var50 = var11;
               NumberSetting var52 = this.settingStopOnAttackMaxHurtTime;
               double var100;
               var70 = (var100 = var71 - var52.method_44$474dfaa627(var50)) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1);
               if (var15 != null) {
                  break label143;
               }

               if (var70 <= 0) {
                  var70 = 0;
                  break label143;
               }
            }

            var70 = 1;
         }

         var17 = var70;
      }

      long var95 = -9184528905596089600L;
      double var53 = var5.field_43E;
      double var55 = var5.field_47B;
      double var57 = var5.field_43S;
      EntityLivingBase var59 = var5;
      C_478i var67 = C_47gg.method_43$0f34e7e3b0(var59, var57, var55, var53);
      var10002 = -9186935753328269937L;
      C_478i var60 = var67;
      C_47tf var61 = var16;
      C_47tf var19 = C_47gg.method_47$42676af4e9(var61, var60);
      var10001 = -9185243640621864277L;
      BooleanSetting var62 = this.settingCheckStartDistance;
      int var72 = (int) ((var62.method_49$aae029aa0a()) ? 1 : 0);
      if (var15 == null) {
         if (var72 != 0) {
            double var73 = var16.method_43$3d77d36e13(var19);
            long var92 = -9185328105709326663L;
            long var63 = var11;
            NumberSetting var65 = this.settingStartDistance;
            double var101;
            int var103 = (var101 = var73 - var65.method_44$474dfaa627(var63)) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
            if (var1 < 0) {
               return (boolean)(var15 != null ? var103 : var103 != 0);
            }

            if (var15 != null) {
               return (boolean)(var15 != null ? var103 : var103 != 0);
            }

            if (var103 <= 0) {
               return false;
            }
         }

         var72 = var17;
      }

      return (boolean)(var15 != null ? var72 : var72 != 0);
   }






   public boolean method_44$e04982bb4a(EntityLivingBase var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 47303601435575L;
      int var4 = (int)((var2 ^ 47303601435575L) >>> 48);
      int var5 = (int)((var2 ^ 47303601435575L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      String var7 = recovery$indy$10(-7684297101304079261L, var2);
      double var8 = recovery$indy$11(field_43, -7679155165236542770L, var2).method_48$7c2c45e4ce(var1)
         ? 6.0
         : Math.min(6.0, recovery$indy$12(this, (char)var4, var5, (short)var6, -7684864836820772062L, var2));
      double var11;
      int var10000 = (
               var11 = recovery$indy$13(field_43, -7679155165236542770L, var2)
                     .method_47$b2124a4855()
                     .method_41$4b58f7ab41(var1.field_43S, var1.field_47B, var1.field_43E)
                  - var8
            )
            == 0.0
         ? 0
         : (var11 < 0.0 ? -1 : 1);
      if (var7 == null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   private synchronized void method_48$f633c984d8(boolean var1) {
      this.field_47n = var1;
   }



   public void method_48$d197f0e9b1(C_47Pi var1, C_47wr var2, long var3, boolean var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 28413751985527L;
      C_47tf var8 = recovery$indy$14(field_43, 7867581228002884239L, var3).method_47$b2124a4855();
      recovery$indy$16(
         var1,
         recovery$indy$15(field_43, 7867581228002884239L, var3),
         var2,
         var6,
         var8.field_40,
         var8.field_41,
         var8.field_47,
         var5,
         7859568307889461960L,
         var3
      );
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 90470050956039L;
      long var3 = var1 ^ 133717971115256L;
      long var10000 = -2801922678058151899L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -2804136185909624877L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("ClassicBackTrack");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48$971dcaf928(long var1, EntityLivingBase var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 20294175138618L;
      String var6 = recovery$indy$17(3782344825895091525L, var1);
      double var8;
      int var10000 = (
               var8 = recovery$indy$18(field_43, 3767362224529597416L, var1)
                     .method_47$b2124a4855()
                     .method_41$4b58f7ab41(var3.field_43S, var3.field_47B, var3.field_43E)
                  - recovery$indy$19(this.settingMaxHitRange, var4, 3781579183527918874L, var1)
            )
            == 0.0
         ? 0
         : (var8 < 0.0 ? -1 : 1);
      if (var6 == null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   private void method_49$268603e72a(C_47Pi var1, C_47wr var2, RenderPass var3) {
      long var4 = a ^ 129359436777510L;
      long var6 = var4 ^ 140013985270213L;
      long var8 = var4 ^ 103849090881497L;
      EntityLivingBase var10002 = this.field_49;
      long var10006 = -3299850929673685774L;
      long var10 = var8;
      ModeSetting var12 = this.settingTargetESP;
      boolean var10004 = var12.method_46$5f9dc63072(var10).equals("PlayerModelArmor");
      var10006 = -3298571114918478336L;
      long var13 = var6;
      boolean var15 = var10004;
      C_47wr var16 = var2;
      EntityLivingBase var17 = var10002;
      C_47Pi var18 = var1;
      BackTrack_47Ca var19 = this;
      var19.method_47$0f4afe0bb4(var18, var17, var16, var15, var13);
   }



   private boolean method_49$72a224a996(double var1, double var3, int var5, byte var6, int var7) {
      long var8 = ((long)var5 << 32 | (long)var6 << 56 >>> 32 | (long)var7 << 40 >>> 40) ^ a;
      long var10 = var8 ^ 51784476237202L;
      String var12 = recovery$indy$20(-3316346099970107199L, var8);
      double var13;
      int var10000 = (var13 = var1 - (var3 + recovery$indy$21(this.settingThreshold, var10, -3318235099355152435L, var8))) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (var12 == null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
   }



   private boolean method_45$0dd78e0064(long var1) {
      java.lang.String var27;
      var1 = a ^ var1;
      long var3 = var1 ^ 75418563118674L;
      long var10000 = 5348467953633460993L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10001 = 5346744860031295519L;
      BooleanSetting var7 = this.settingStopBackTrackAtHurtTime;
      byte var22 = (byte) ((var7.method_49$aae029aa0a()) ? 1 : 0);
      if (var5 == null) {
         if (var22 == 0) {
            long var30 = 5347883667954288869L;
            boolean var8 = false;
            BackTrack_47Ca var9 = this;
            var9.method_48$f633c984d8(var8);
            var30 = 5348619546371791973L;
            boolean var10 = false;
            BackTrack_47Ca var11 = this;
            var11.method_41N$f633c984d8(var10);
            return true;
         }

         var10001 = 5348012016465561422L;
         BackTrack_47Ca var12 = this;
         var22 = (byte) ((var12.method_48a$aae029aa0a()) ? 1 : 0);
      }

      label74: {
         label73:
         if (var5 == null) {
            if (var22 != 0) {
               var10001 = 5346342616292659189L;
               BackTrack_47Ca var13 = this;
               var22 = (byte) ((var13.method_48Z$aae029aa0a()) ? 1 : 0);
               var27 = var5;
               if (var1 < 0L) {
                  break label74;
               }

               if (var5 != null) {
                  break label73;
               }

               if (var22 != 0) {
                  return false;
               }
            }

            var10001 = 5348012016465561422L;
            BackTrack_47Ca var14 = this;
            var22 = (byte) ((var14.method_48a$aae029aa0a()) ? 1 : 0);
         }

         var27 = var5;
      }

      if (var1 >= 0L) {
         if (var27 == null) {
            if (var22 == 0) {
               return true;
            }

            var10001 = 5335743201534713260L;
            Minecraft var15 = field_43;
            double var23 = var15.field_42P.field_432;
            long var10003 = 5346662592340714509L;
            long var16 = var3;
            NumberSetting var18 = this.settingContinueWithBackTrackAtHurtTime;
            double var32;
            var22 = (byte)((var32 = var23 - var18.method_44$474dfaa627(var16)) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1));
         }

         var27 = var5;
      }

      if (var27 == null) {
         var22 = (byte)(var22 <= 0 ? 1 : 0);
      }

      byte var6 = var22;
      byte var24 = var6;
      if (var5 == null) {
         if (var6 != 0) {
            long var10002 = 5348619546371791973L;
            boolean var19 = false;
            BackTrack_47Ca var20 = this;
            var20.method_41N$f633c984d8(var19);
         }

         var24 = var6;
      }

      return var24 != 0;
   }




   public void method_45$d27e4ca694(double[] var1) {
      this.field_47q[0] = var1[0];
      this.field_47q[1] = var1[1];
      this.field_47q[2] = var1[2];
   }



   private void method_47$df16004b03(int var1, int var2) {
      augustus.recovered.modules.latency.BackTrack_47Ca var10;
      long var3;
      String var7;
      boolean var8;
      boolean var9;
      String var10001;
      label62: {
         var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
         long var5 = var3 ^ 42965816627948L;
         var8 = this.field_47M;
         String var10000 = recovery$indy$22(-3287999157957256346L, var3);
         this.field_47M = recovery$indy$23(this, var5, -3291114011697862353L, var3);
         var7 = var10000;
         var9 = this.field_47r;
         label61:
         if (var7 == null) {
            if (this.field_47r) {
               var9 = this.field_47m;
               var10001 = var7;
               if (var1 <= 0) {
                  break label62;
               }

               if (var7 != null) {
                  break label61;
               }

               if (this.field_47m) {
                  this.field_47m = false;
                  this.field_47r = false;
                  this.field_47M = false;
               }
            }

            var9 = this.field_47M;
         }

         var10001 = var7;
      }

      label66: {
         label49:
         if (var10001 == null) {
            if (!var9) {
               var9 = var8;
               if (var7 != null) {
                  break label49;
               }

               if (var8) {
                  recovery$indy$24(this.field_47R, -3290157634978957072L, var3);
               }
            }

            var10 = this;
            if (var7 != null) {
               break label66;
            }

            var9 = this.field_47M;
         }

         if (var9) {
            return;
         }

         var10 = this;
      }

      var10.field_43y = 0;
   }



   public void method_47$0f4afe0bb4(C_47Pi var1, EntityLivingBase var2, C_47wr var3, boolean var4, long var5) {
      long var7;
      double var10;
      double var12;
      double var14;
      label40: {
         C_47tf var10000;
         label39: {
            var5 = a ^ var5;
            var7 = var5 ^ 108017222576543L;
            String var9 = recovery$indy$25(140444969807530186L, var5);
            if (recovery$indy$26(this.settingSmoothRendering, 141883934143409108L, var5)) {
               var10000 = var2.field_43D;
               if (var9 != null) {
                  break label39;
               }

               if (var2.field_43D != null) {
                  var10000 = var2.field_42g;
                  if (var9 != null) {
                     break label39;
                  }

                  if (var2.field_42g != null) {
                     var10 = var2.field_42g.field_40
                        + (var2.field_43D.field_40 - var2.field_42g.field_40) * recovery$indy$27(field_43, 143722504535716707L, var5).field_49;
                     var12 = var2.field_42g.field_41
                        + (var2.field_43D.field_41 - var2.field_42g.field_41) * recovery$indy$28(field_43, 143722504535716707L, var5).field_49;
                     var14 = var2.field_42g.field_47
                        + (var2.field_43D.field_47 - var2.field_42g.field_47) * recovery$indy$29(field_43, 143722504535716707L, var5).field_49;
                     if (var5 < 0L) {
                        return;
                     }

                     if (var9 == null) {
                        break label40;
                     }
                  }
               }
            }

            var10000 = var2.field_43r;
         }

         var10 = var10000.field_40 + (var2.field_47N.field_40 - var2.field_43r.field_40) * recovery$indy$30(field_43, 143722504535716707L, var5).field_49;
         var12 = var2.field_43r.field_41 + (var2.field_47N.field_41 - var2.field_43r.field_41) * recovery$indy$31(field_43, 143722504535716707L, var5).field_49;
         var14 = var2.field_43r.field_47 + (var2.field_47N.field_47 - var2.field_43r.field_47) * recovery$indy$32(field_43, 143722504535716707L, var5).field_49;
      }

      recovery$indy$33(var1, var2, var3, var7, var10, var12, var14, var4, 142620203780224544L, var5);
   }




   private C_47tf method_47$1537289edf(EntityLivingBase var1) {
      return new C_47tf(var1.field_48J / 32.0, var1.field_48o / 32.0, var1.field_48A / 32.0);
   }



   private boolean method_47$5909fdf9ee(long var1, Entity var3) {
      long var4;
      String var8;
      Entity var10;
      label44: {
         var1 = a ^ var1;
         var4 = var1 ^ 53736894779144L;
         long var6 = var1 ^ 12686472843375L;
         var8 = recovery$indy$34(244292845359221339L, var1);
         boolean var10000 = var3 instanceof EntityPlayerSP;
         if (var8 == null) {
            if (var10000) {
               return false;
            }

            var10 = var3;
            if (var8 != null) {
               break label44;
            }

            var10000 = recovery$indy$40(
               var3,
               recovery$indy$35(C_47Xx.PLAYER, 239206729829708635L, var1),
               recovery$indy$36(C_47Xx.MOB, 239206729829708635L, var1),
               recovery$indy$37(C_47Xx.ANIMAL, 239206729829708635L, var1),
               recovery$indy$38(C_47Xx.VILLAGER, 239206729829708635L, var1),
               recovery$indy$39(C_47Xx.ARMOR_STAND, 239206729829708635L, var1),
               true,
               true,
               true,
               var6,
               true,
               true,
               true,
               239809502807823440L,
               var1
            );
         }

         if (!var10000) {
            return false;
         }

         var10 = var3;
      }

      if (var10 != recovery$indy$41(field_43, 240426237552678134L, var1)) {
         double var12;
         int var11 = (
                  var12 = recovery$indy$42(field_43, 240426237552678134L, var1).method_44$ee256e8a75(var3)
                     - recovery$indy$43(this.settingPreAimRange, var4, 245829929088462167L, var1)
               )
               == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
         if (var8 != null) {
            return var11 != 0;
         }

         if (var11 < 0) {
            return true;
         }
      }

      return false;
   }



    public void onRender3D(long key, float partialTicks) {
        long packetKey = key ^ 54686117440567L;
        long firstColorKey = key ^ 75862687826910L;
        long renderKey = key ^ 5451650687478L;
        long secondColorKey = key ^ 52344924935716L;
        long settingKey = key ^ 8944581653787L;
        long callbackKey = key ^ 80017760765463L;
        Object guard = recovery$indy$flow$909();
        if (guard == null) {
            if (((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).field_49)) == null) return;
            recovery$indy$flow$911();
        }
        boolean ping = recovery$indy$flow$915(recovery$indy$flow$914(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "Ping");
        if (guard != null) {
            recovery$indy$flow$931(recovery$indy$flow$930(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "LagTrack");
            if (ping) {
                Object game = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$958()))))));
                int camera = recovery$indy$flow$964(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(game)))).field_44r)));
                Object callback = ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(recovery$indy$flow$975(this)))))));
                recovery$indy$flow$977((camera & 1) != 0, callbackKey, callback);
            }
            recovery$indy$flow$978();
            return;
        }
        boolean usesHandler = ping;
        if (!usesHandler) usesHandler = recovery$indy$flow$919(recovery$indy$flow$918(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "BackTrack");
        boolean primaryMode;
        if (usesHandler) {
            primaryMode = recovery$indy$flow$927(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$924())))).field_489)))))))));
        } else {
            primaryMode = recovery$indy$flow$923(recovery$indy$flow$922(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "ClassicBackTrack");
            if (primaryMode && key > 0L) primaryMode = recovery$indy$flow$927(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$924())))).field_489)))))))));
        }
        boolean secondaryMode = recovery$indy$flow$931(recovery$indy$flow$930(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "LagTrack");
        if (!secondaryMode) {
            secondaryMode = recovery$indy$flow$935(recovery$indy$flow$934(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingMode)))))))), settingKey), "Gomme");
            if (secondaryMode && key >= 0L) secondaryMode = recovery$indy$flow$939(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$936())))).field_489)))))))), packetKey);
        } else {
            secondaryMode = recovery$indy$flow$939(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$936())))).field_489)))))))), packetKey);
        }
        boolean firstPass;
        boolean secondPass = secondaryMode;
        if (primaryMode || (key > 0L && secondaryMode)) {
            boolean classic = recovery$indy$flow$943(recovery$indy$flow$942(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESP)))))))), settingKey), "Classic");
            firstPass = key >= 0L && classic;
            if (key < 0L) secondPass = classic;
        } else {
            firstPass = key == 0L && secondaryMode;
        }
        if (firstPass) {
            boolean first = recovery$indy$flow$946(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), firstColorKey);
            boolean second = recovery$indy$flow$949(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTarget)))))))), secondColorKey);
            recovery$indy$flow$950(first, second, renderKey);
            Object callback = ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(recovery$indy$flow$951(this)))))));
            recovery$indy$flow$953(false, callbackKey, callback);
        }
        if (secondPass) {
            boolean classic = recovery$indy$flow$957(recovery$indy$flow$956(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESP)))))))), settingKey), "Classic");
            if (classic) {
                Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$958())))))))))).field_42P));
                if (player != null) {
                    Object settings = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$961())))))))))).field_44r));
                    int camera = recovery$indy$flow$964(settings);
                    boolean draw = camera != 0;
                    if (!draw) draw = !recovery$indy$flow$967(((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingOnlyInThirdPerson)))))))));
                    if (draw) {
                        boolean first = recovery$indy$flow$970(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayer)))))))), firstColorKey);
                        boolean second = recovery$indy$flow$973(((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayer)))))))), secondColorKey);
                        recovery$indy$flow$974(first, second, renderKey);
                        Object callback = ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(recovery$indy$flow$975(this)))))));
                        recovery$indy$flow$977(false, callbackKey, callback);
                    }
                }
            }
        }
        recovery$indy$flow$978();
    }






   private EntityLivingBase method_43$f2b0beb8fc(long var1) {
      double var17;
      var1 = a ^ var1;
      long var3 = var1 ^ 117029454087599L;
      long var5 = var1 ^ 124662845354734L;
      long var7 = var1 ^ 16270438448366L;
      String var9 = recovery$indy$46(-1907601381221225282L, var1);
      Minecraft var10000 = field_43;
      if (var9 == null) {
         if (recovery$indy$47(field_43, -1895140466554359277L, var1) == null) {
            return null;
         }

         var10000 = field_43;
      }

      if (recovery$indy$48(var10000, -1909352534727566822L, var1) != null) {
         EntityLivingBase var10 = recovery$indy$49(var3, -1909243500728531305L, var1);
         byte var16 = (byte) ((recovery$indy$50(this.settingOnlyKillAura, -1906093577148166240L, var1)) ? 1 : 0);
         String var10001 = var9;
         if (var1 >= 0L) {
            label64:
            if (var9 == null) {
               if (var16 == 0 && var10 == null) {
                  double var11 = 10000.0;

                  for (Object recovered$element$127657 : recovery$indy$51(field_43, -1909352534727566822L, var1).field_44Q) {
         Entity var14 = (Entity) recovered$element$127657;
                     var16 = (byte) ((recovery$indy$52(this, var7, var14, -1908220105736818828L, var1)) ? 1 : 0);
                     var10001 = var9;
                     if (var1 >= 0L) {
                        if (var9 != null) {
                           break label64;
                        }

                        var10001 = var9;
                     }

                     label80: {
                        label103: {
                           if (var10001 == null) {
                              if (var16 == 0) {
                                 break label80;
                              }

                              var17 = var11;
                              if (var9 != null) {
                                 break label103;
                              }

                              double var19;
                              var16 = (byte)((var19 = var11 - recovery$indy$53(field_43, -1895140466554359277L, var1).method_44$ee256e8a75(var14)) == 0.0
                                 ? 0
                                 : (var19 < 0.0 ? -1 : 1));
                           }

                           if (var16 <= 0) {
                              break label80;
                           }

                           var10 = (EntityLivingBase)var14;
                           var17 = recovery$indy$54(field_43, -1895140466554359277L, var1).method_44$ee256e8a75(var14);
                        }

                        var11 = var17;
                     }

                     if (var9 != null) {
                        break;
                     }
                  }
               }

               if (var1 < 0L) {
                  return var10;
               }

               var16 = (byte) ((recovery$indy$55(this.settingNotWhileScaffold, -1906093577148166240L, var1)) ? 1 : 0);
            }

            var10001 = var9;
         }

         if (var10001 == null) {
            if (var16 == 0) {
               return var10;
            }

            var16 = (byte) ((recovery$indy$56(var5, -1906495860908184936L, var1)) ? 1 : 0);
         }

         return var16 != 0 ? null : var10;
      } else {
         return null;
      }
   }




   private void method_43$ad0e900906(RenderPass var1) {
      long var2 = a ^ 31197134395410L;
      long var4 = var2 ^ 13121245580899L;
      EntityLivingBase var10000 = this.field_49;
      ColorSetting var10001 = this.settingClassicColorTarget;
      long var10004 = -4466895506843177924L;
      long var6 = var4;
      NumberSetting var8 = this.settingLineWidthTarget;
      float var10002 = (float)var8.method_44$474dfaa627(var6);
      long var10005 = -4466942562782205906L;
      BooleanSetting var9 = this.settingSmoothRendering;
      RenderUtils.method_48$45fe1d62b8(var10000, var10001, var10002, 255, var9.method_49$aae029aa0a());
   }



   private synchronized void method_41N$f633c984d8(boolean var1) {
      this.field_47u = var1;
   }



   private boolean method_48h$aae029aa0a() {
      long var1 = a ^ 80568826092867L;
      long var3 = var1 ^ 108385431798460L;
      long var10002 = -8695975959510392425L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("LagTrack");
   }



   private boolean method_48I$aae029aa0a() {
      long var1 = a ^ 82187265729662L;
      long var3 = var1 ^ 107108459379585L;
      long var10002 = -4725212752408291158L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Ping");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$57(this, 25, var5, -7107762709242655831L, var1);
      recovery$indy$58(this, 32, var5, -7107762709242655831L, var1);
      recovery$indy$59(this, 31, var5, -7107762709242655831L, var1);
      recovery$indy$60(this, 16, var5, -7107762709242655831L, var1);
      recovery$indy$61(this, 40, var5, -7107762709242655831L, var1);
      recovery$indy$62(this, 17, var5, -7107762709242655831L, var1);
      recovery$indy$63(this, 7, 1000000, var3, -7107164142650968361L, var1);
   }



   private boolean method_48F$aae029aa0a() {
      long var1 = a ^ 113149261767014L;
      long var3 = var1 ^ 84924571254425L;
      long var10002 = 4284190288358170034L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_48x$aae029aa0a() {
      long var1 = a ^ 60649026150654L;
      long var3 = var1 ^ 31874642870017L;
      long var10002 = 4245999026075425834L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("LagTrack");
   }



   private boolean method_48P$aae029aa0a() {
      long var1 = a ^ 30618698143256L;
      long var3 = var1 ^ 52834268301799L;
      long var10000 = -8357876359323990726L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -8355587508755895604L;
      long var6 = var3;
      ModeSetting var8 = this.settingAbortCriterion;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("OnAttack");
      if (var5 == null) {
         if (!var12) {
            return false;
         }

         var10002 = -8355587508755895604L;
         long var9 = var3;
         ModeSetting var11 = this.settingMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("ClassicBackTrack");
      }

      return var5 != null ? var12 : !var12;
   }



   private boolean method_48b$aae029aa0a() {
      long var1 = a ^ 48032215238547L;
      long var3 = var1 ^ 527346407532L;
      long var10002 = 6737892027421768519L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("ClassicBackTrack");
   }



   private boolean method_48l$aae029aa0a() {
      long var1 = a ^ 132300516596806L;
      long var3 = var1 ^ 91835160626105L;
      long var10000 = 5070129800168869732L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 5067850188677324946L;
      long var6 = var3;
      ModeSetting var8 = this.settingAbortCriterion;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         if (var12) {
            return false;
         }

         var10002 = 5067850188677324946L;
         long var9 = var3;
         ModeSetting var11 = this.settingMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("ClassicBackTrack");
      }

      return var5 != null ? var12 : !var12;
   }



   private boolean method_48R$aae029aa0a() {
      long var1 = a ^ 10862049149627L;
      long var3 = var1 ^ 37609216662852L;
      long var10002 = 1777214688251969135L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_48z$aae029aa0a() {
      long var1 = a ^ 30687941128377L;
      long var3 = var1 ^ 53036416200518L;
      long var10000 = -6150831279187172453L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -6148542278196671379L;
      long var6 = var3;
      ModeSetting var8 = this.settingAbortCriterion;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("OnRange");
      if (var5 == null) {
         if (!var12) {
            return false;
         }

         var10002 = -6148542278196671379L;
         long var9 = var3;
         ModeSetting var11 = this.settingMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("ClassicBackTrack");
      }

      return var5 != null ? var12 : !var12;
   }



   private boolean method_48O$aae029aa0a() {
      long var1 = a ^ 106779618998539L;
      long var3 = var1 ^ 82222957291252L;
      long var10000 = -6696393605093135831L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -6694170201207093793L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("BackTrack");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48L$aae029aa0a() {
      long var1 = a ^ 112132696867747L;
      long var3 = var1 ^ 85961538772060L;
      long var10002 = 6463091307791859575L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Ping");
   }



   private boolean method_48Y$aae029aa0a() {
      long var1 = a ^ 85571996798968L;
      long var3 = var1 ^ 112177550970887L;
      long var10002 = 1579263069797839660L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("LagTrack");
   }



   private boolean method_48C$aae029aa0a() {
      long var1 = a ^ 140389132502320L;
      long var10000 = 6857504272786134546L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = 6854576037129991436L;
      BooleanSetting var4 = this.settingOnlyKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_48Q$aae029aa0a() {
      long var1 = a ^ 26809176458058L;
      long var3 = var1 ^ 56849933769909L;
      long var10002 = 6438175867724709790L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



    private boolean method_48s$0dd78e0064(long l) {
        block13: {
            block2: {
                String string;
                boolean bl;
                C_47tf c_47tf;
                C_47tf c_47tf2;
                C_47tf c_47tf3;
                EntityLivingBase c_47aK;
                int n;
                int n2;
                int n3;
                long l2;
                block10: {
                    String string2;
                    block11: {
                        boolean bl2;
                        block12: {
                            String string3;
                            block7: {
                                block8: {
                                    block9: {
                                        BackTrack_47Ca backTrack_47Ca;
                                        long l3;
                                        long l4;
                                        long l5;
                                        long l6;
                                        block5: {
                                            block6: {
                                                block4: {
                                                    int n4;
                                                    block3: {
                                                        long l7 = l = a ^ l;
                                                        long l8 = l7 ^ 0x1BF4716C803FL;
                                                        int n5 = (int)(l8 >>> 48);
                                                        long l9 = l8 << 16 >>> 16;
                                                        l2 = l7 ^ 0x1FA82F9334CFL;
                                                        l6 = l7 ^ 0x1A784EF24A8BL;
                                                        l5 = l7 ^ 0x6189306196D2L;
                                                        long l10 = l7 ^ 0x71F68D17D14BL;
                                                        n3 = (int)(l10 >>> 32);
                                                        n2 = (int)(l10 << 32 >>> 56);
                                                        n = (int)(l10 << 40 >>> 40);
                                                        l4 = l7 ^ 0x6DB1B4558486L;
                                                        long l11 = l7 ^ 0x1EC8BD9DB0BDL;
                                                        long l12 = l7 ^ 0x58967B582BDEL;
                                                        long l13 = l7 ^ 0x6CD40E803DFBL;
                                                        l3 = l7 ^ 0x13302E460D17L;
                                                        string2 = BackTrack_47Ca.recovery$indy$64(-2685915201795419263L, l);
                                                        c_47aK = this.field_49;
                                                        if (string2 != null) return false;
                                                        if (c_47aK == null) break block2;
                                                        if (BackTrack_47Ca.recovery$indy$65(field_43, -2698646608921948884L, l) == null || BackTrack_47Ca.recovery$indy$66(field_43, -2684148675508673243L, l) == null) break block2;
                                                        double d = c_47aK.field_43S;
                                                        double d2 = c_47aK.field_47B;
                                                        double d3 = c_47aK.field_43E;
                                                        C_478i c_478i = BackTrack_47Ca.recovery$indy$68(c_47aK, l11, BackTrack_47Ca.recovery$indy$67((Object)this, c_47aK, -2687176088022407566L, l), -2687516580761775452L, l);
                                                        C_478i c_478i2 = BackTrack_47Ca.recovery$indy$69(c_47aK, d, d2, d3, -2684748951546621644L, l);
                                                        c_47tf3 = BackTrack_47Ca.recovery$indy$70(l12, c_478i, -2699546722941630434L, l);
                                                        c_47tf2 = BackTrack_47Ca.recovery$indy$71(l12, c_478i2, -2699546722941630434L, l);
                                                        c_47tf = BackTrack_47Ca.recovery$indy$72(field_43, -2698646608921948884L, l).method_49$41b79b67a0(1.0f);
                                                        bl2 = BackTrack_47Ca.recovery$indy$73((Object)this, (short)n5, l9, this.field_47M, c_47aK, -2688227488860536246L, l);
                                                        n4 = ((int) (BackTrack_47Ca.recovery$indy$74(this.settingCalculateWithOwnPingLagTrack, -2687715484551073633L, l) ? 1 : 0));
                                                        if (l <= 0L) break block3;
                                                        if (n4 == 0) break block4;
                                                        n4 = Math.max(0, this.field_43y * 50 - BackTrack_47Ca.recovery$indy$75(l13, -2685160325131596262L, l));
                                                    }
                                                    int n6 = n4;
                                                    backTrack_47Ca = this;
                                                    if (l < 0L) break block5;
                                                    backTrack_47Ca.field_438 = (int)((double)n6 / 50.0);
                                                    break block6;
                                                }
                                                this.field_438 = this.field_43y;
                                            }
                                            backTrack_47Ca = this;
                                        }
                                        if (!BackTrack_47Ca.recovery$indy$76((Object)backTrack_47Ca, l3, -2691151763691500874L, l)) break block2;
                                        if (!BackTrack_47Ca.recovery$indy$77((Object)this, l6, -2698785009279542408L, l)) break block2;
                                        if (!BackTrack_47Ca.recovery$indy$79(this.field_47R, BackTrack_47Ca.recovery$indy$78(this.settingDelayBetweenLags, l5, -2687791005366881139L, l), l4, -2685003248668338577L, l)) break block2;
                                        bl = this.field_43v;
                                        string3 = string2;
                                        if (l < 0L) break block7;
                                        if (string3 != null) break block8;
                                        if (!bl) break block9;
                                        bl = this.field_478;
                                        string = string2;
                                        if (l <= 0L) break block10;
                                        if (string != null) break block11;
                                        if (bl) break block12;
                                    }
                                    bl = this.field_47M;
                                }
                                string3 = string2;
                            }
                            if (string3 != null) return bl;
                            if (!bl) break block2;
                        }
                        bl = bl2;
                    }
                    string = string2;
                }
                if (string != null) return bl;
                if (!bl) break block2;
                if (!BackTrack_47Ca.recovery$indy$80((Object)this, c_47tf.method_43$3d77d36e13(c_47tf2), c_47tf.method_43$3d77d36e13(c_47tf3), n3, (byte)n2, n, -2686182098078693698L, l)) break block2;
                if (!BackTrack_47Ca.recovery$indy$81((Object)this, l2, c_47aK, -2686735096251419406L, l)) break block2;
                if (this.field_438 <= BackTrack_47Ca.recovery$indy$82(this.settingMaxLagPackets, -2687621733205116307L, l)) break block13;
            }
            this.field_43u = false;
            return false;
        }
        BackTrack_47Ca.recovery$indy$83(this.settingMaxLagPackets, -2699405221245830633L, l);
        if (!this.field_43v) return true;
        if (!this.field_478) return true;
        this.field_43y = 0;
        return true;
    }






   private boolean method_48n$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 50555017434621L;
      String var5 = recovery$indy$84(983361471395546269L, var1);
      boolean var10000 = recovery$indy$85(0, var3, 984721575828694669L, var1);
      if (var5 == null) {
         if (!var10000) {
            var10000 = recovery$indy$86(this.settingClickCheck, 986144657484015491L, var1);
            if (var5 != null) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   private boolean method_48o$aae029aa0a() {
      long var1 = a ^ 25686970287901L;
      long var3 = var1 ^ 66559675881698L;
      long var10002 = -7129213695817352247L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Gomme");
   }



   private boolean method_482$aae029aa0a() {
      long var1 = a ^ 108467495594027L;
      long var3 = var1 ^ 80758704207828L;
      long var10002 = -5604303055743691521L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("ClassicBackTrack");
   }



   private boolean method_48r$aae029aa0a() {
      long var1 = a ^ 101445334529728L;
      long var3 = var1 ^ 131486167329087L;
      long var10002 = 3229849445674338836L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private synchronized boolean method_48Z$aae029aa0a() {
      return this.field_47n;
   }



   private boolean method_489$aae029aa0a() {
      long var1 = a ^ 94872894001083L;
      long var10000 = -7664679983601754983L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = -7661905610787291257L;
      BooleanSetting var4 = this.settingOnlyKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_483$aae029aa0a() {
      long var1 = a ^ 78981767232L;
      long var3 = var1 ^ 48137805053887L;
      long var10000 = -406801223839796382L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -409011021371958124L;
      long var6 = var3;
      ModeSetting var8 = this.settingPlayerESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48f$aae029aa0a() {
      long var1 = a ^ 69299152560222L;
      long var3 = var1 ^ 22898084691873L;
      long var10002 = -410714115169411958L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



   private boolean method_48_$aae029aa0a() {
      long var1 = a ^ 90254286691261L;
      long var3 = var1 ^ 133867182326850L;
      long var10002 = 4733200346451224425L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Ping");
   }



   private boolean method_48g$aae029aa0a() {
      long var1 = a ^ 108992148878453L;
      long var3 = var1 ^ 80217661647754L;
      long var10000 = -1265613458298460329L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -1267897888842151775L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("ClassicBackTrack");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48K$aae029aa0a() {
      long var1 = a ^ 112147791699592L;
      long var3 = var1 ^ 85946156597623L;
      long var10000 = -8893864224062517846L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -8891650161730592164L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("ClassicBackTrack");
      if (var5 == null) {
         if (var10) {
            return false;
         }

         long var10001 = -8892284041137525068L;
         BooleanSetting var9 = this.settingStopBackTrackAtHurtTime;
         var10 = var9.method_49$aae029aa0a();
      }

      return var5 != null ? var10 : var10;
   }



   private boolean method_48J$aae029aa0a() {
      long var1 = a ^ 87446604669360L;
      long var3 = var1 ^ 110353424186959L;
      long var10002 = 4297183082471447908L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



   private boolean method_48B$aae029aa0a() {
      long var1 = a ^ 16684487366956L;
      long var3 = var1 ^ 40652932531923L;
      long var10002 = -8989490956760193544L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 44258007896257L;
      long var8 = var4 ^ 13136143433030L;
      long var10 = var4 ^ 110162248843858L;
      this.field_43u = false;
      this.field_43a = false;
      recovery$indy$87(this.settingDelayBetweenBacktrack, 2723994246598247763L, var4);
      this.field_478 = true;
      this.field_43v = true;
      this.field_47M = false;
      this.field_43p = 0;
      this.field_47O = false;
      this.field_437 = recovery$indy$90(
         C_476q.field_48,
         var10,
         recovery$indy$88(this.settingBackTrackTime, var8, 2724172668586800277L, var4),
         recovery$indy$89(this.settingBackTrackTime, var6, 2734355678661044469L, var4),
         2722604113380643888L,
         var4
      );
      recovery$indy$91(this.settingMaxHitRange, 2723994246598247763L, var4);
      recovery$indy$92(this.settingMaxLagPackets, 2723994246598247763L, var4);
      recovery$indy$93(this.settingPingDelay, 2723994246598247763L, var4);
      this.field_47W = true;
   }



   public boolean method_48e$aae029aa0a() {
      return this.field_43a;
   }



   private boolean method_48D$aae029aa0a() {
      long var1 = a ^ 63123226921237L;
      long var3 = var1 ^ 20601128326890L;
      long var10002 = 5982996782207808961L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("ClassicBackTrack");
   }



   private boolean method_48m$aae029aa0a() {
      long var1 = a ^ 133553498511862L;
      long var3 = var1 ^ 90859223467529L;
      long var10002 = -8942847306179287774L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("LagTrack");
   }



   private boolean method_484$aae029aa0a() {
      long var1 = a ^ 70473803527715L;
      long var3 = var1 ^ 118531994511836L;
      long var10002 = -6038862356047475977L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Ping");
   }



   private boolean method_487$aae029aa0a() {
      long var1 = a ^ 130803244935872L;
      long var3 = var1 ^ 102403153605951L;
      long var10002 = -1093653147383327212L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   public void method_487$da8c82d5d4() {
        boolean var125;
      long var1 = a ^ 56810825588319L;
      long var3 = var1 ^ 99209245436467L;
      long var5 = var1 ^ 3321819975621L;
      long var10001 = var1 ^ 57605465690039L;
      int var7 = (int)((var1 ^ 57605465690039L) >>> 32);
      int var8 = (int)((var1 ^ 57605465690039L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      long var10 = var1 ^ 28622552693704L;
      long var12 = var1 ^ 31905820849442L;
      long var14 = var1 ^ 26933110702496L;
      long var16 = var1 ^ 28657421075362L;
      long var18 = var1 ^ 95257844782059L;
      long var10000 = -4303765828153668227L;
      String var20 = net.C_47eb.method_48$0e30dfc966();
      long var10003 = -4305205209669253220L;
      long var36 = var10;
      BackTrack_47Ca var38 = this;
      this.field_49 = var38.method_43$f2b0beb8fc(var36);
      var10001 = -4301196497082241437L;
      client.setting.BooleanSetting var39 = this.settingStopBackTrackAtHurtTime;
      boolean var124 = var39.method_49$aae029aa0a();
      if (var20 == null) {
         if (var124) {
            var10001 = -4291861554403273776L;
            net.minecraft.client.Minecraft var40 = field_43;
            if (var40.field_42P.field_432 == 10) {
               long var10002 = -4302310587543927143L;
               boolean var41 = false;
               BackTrack_47Ca var42 = this;
               var42.method_48$f633c984d8(var41);
            } else {
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var43 = field_43;
               if (var43.field_42P.field_432 == 0) {
                  long var147 = -4303614201039023591L;
                  boolean var44 = false;
                  BackTrack_47Ca var45 = this;
                  var45.method_41N$f633c984d8(var44);
               }
            }
         }

         long var148 = -4301547746132909429L;
         long var46 = var14;
         client.setting.ModeSetting var48 = this.settingMode;
         if (var48.method_46$5f9dc63072(var46).equals("ClassicBackTrack") && this.field_49 != null) {
            net.C_47tf var23;
            net.C_47tf var24;
            net.C_47tf var25;
            label150: {
               StringBuilder var130 = new StringBuilder();
               long var10004 = -4300968605854047087L;
               client.setting.RangeSetting var49 = this.settingClassicBackTrackDelay;
               String var149 = var130.append(Math.max(0, var49.method_44$8abf5c6871())).append(" ms").toString();
               var10003 = -4303476901083341701L;
               String var50 = var149;
               long var51 = var5;
               BackTrack_47Ca var53 = this;
               var53.method_47$d07b98bfef(var51, var50);
               var10004 = -4304985361648447544L;
               double var54 = this.field_49.field_42o;
               double var56 = this.field_49.field_48j;
               double var58 = this.field_49.field_48Q;
               net.minecraft.entity.EntityLivingBase var60 = this.field_49;
               net.C_478i var21 = net.C_47gg.method_43$0f34e7e3b0(var60, var58, var56, var54);
               var10004 = -4304985361648447544L;
               double var61 = this.field_49.field_43E;
               double var63 = this.field_49.field_47B;
               double var65 = this.field_49.field_43S;
               net.minecraft.entity.EntityLivingBase var67 = this.field_49;
               net.C_478i var22 = net.C_47gg.method_43$0f34e7e3b0(var67, var65, var63, var61);
               var148 = -4290508655281269022L;
               net.C_478i var68 = var21;
               long var69 = var12;
               var23 = net.C_47gg.method_42$f4fbca6f44(var69, var68);
               var148 = -4290508655281269022L;
               net.C_478i var71 = var22;
               long var72 = var12;
               var24 = net.C_47gg.method_42$f4fbca6f44(var72, var71);
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var74 = field_43;
               var25 = var74.field_42P.method_49$41b79b67a0(1.0F);
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var75 = field_43;
               var148 = -4291861554403273776L;
               net.minecraft.client.Minecraft var76 = field_43;
               var10003 = -4291861554403273776L;
               net.minecraft.client.Minecraft var77 = field_43;
               double var26 = var75.field_42P.method_45$b2124a4855().field_40
                  + (var76.field_42P.method_47$b2124a4855().field_40 - var77.field_42P.method_45$b2124a4855().field_40) / 3.0;
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var78 = field_43;
               var148 = -4291861554403273776L;
               net.minecraft.client.Minecraft var79 = field_43;
               var10003 = -4291861554403273776L;
               net.minecraft.client.Minecraft var80 = field_43;
               double var28 = var78.field_42P.method_45$b2124a4855().field_41
                  + (var79.field_42P.method_47$b2124a4855().field_41 - var80.field_42P.method_45$b2124a4855().field_41) / 3.0;
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var81 = field_43;
               var148 = -4291861554403273776L;
               net.minecraft.client.Minecraft var82 = field_43;
               var10003 = -4291861554403273776L;
               net.minecraft.client.Minecraft var83 = field_43;
               double var30 = var81.field_42P.method_45$b2124a4855().field_47
                  + (var82.field_42P.method_47$b2124a4855().field_47 - var83.field_42P.method_45$b2124a4855().field_47) / 3.0;
               var10001 = -4291861554403273776L;
               net.minecraft.client.Minecraft var84 = field_43;
               var10004 = -4304985361648447544L;
               double var85 = var30;
               double var87 = var28;
               double var89 = var26;
               net.minecraft.client.entity.EntityPlayerSP var91 = var84.field_42P;
               net.C_478i var32 = net.C_47gg.method_43$0f34e7e3b0(var91, var89, var87, var85);
               net.C_47tf var33 = this.field_49.method_49$41b79b67a0(1.0F);
               var148 = -4302886411266481849L;
               net.C_478i var92 = var32;
               net.C_47tf var93 = var33;
               net.C_47tf var34 = net.C_47gg.method_47$42676af4e9(var93, var92);
               var10001 = -4301196497082241437L;
               client.setting.BooleanSetting var94 = this.settingOnlyWhenNeed;
               label130:
               if (var94.method_49$aae029aa0a() && !(var33.method_43$3d77d36e13(var34) > 3.0)) {
                  var10001 = -4291861554403273776L;
                  net.minecraft.client.Minecraft var95 = field_43;
                  if (var95.field_42P.field_432 < 8) {
                     var10001 = -4291861554403273776L;
                     net.minecraft.client.Minecraft var96 = field_43;
                     if (var96.field_42P.field_432 > 3) {
                        break label130;
                     }
                  }

                  var125 = false;
                  break label150;
               }

               var125 = true;
            }

            boolean var35 = var125;
            if (var35) {
               var148 = -4297737891678350262L;
               long var97 = var18;
               BackTrack_47Ca var99 = this;
               if (var99.method_48n$0dd78e0064(var97)) {
                  double var139 = var25.method_43$3d77d36e13(var24);
                  double var157 = var25.method_43$3d77d36e13(var23);
                  byte var168 = (byte)var8;
                  long var10006 = -4304167940610615230L;
                  int var100 = var9;
                  byte var101 = var168;
                  int var102 = var7;
                  double var103 = var157;
                  double var105 = var139;
                  BackTrack_47Ca var107 = this;
                  if (var107.method_49$72a224a996(var105, var103, var102, var101, var100)) {
                     var10003 = -4302475616460084722L;
                     net.minecraft.entity.EntityLivingBase var108 = this.field_49;
                     long var109 = var3;
                     BackTrack_47Ca var111 = this;
                     if (var111.method_48$971dcaf928(var109, var108)) {
                        net.C_47cu var126 = this.field_45;
                        var148 = -4300968605854047087L;
                        client.setting.RangeSetting var112 = this.settingClassicBackTrackDelay;
                        var10001 = var112.method_44$8abf5c6871();
                        var10003 = -4290791946026457248L;
                        long var113 = var16;
                        long var115 = var10001;
                        net.C_47cu var117 = var126;
                        if (!var117.method_42$b0e346e6e3(var115, var113)) {
                           var10001 = -4301196497082241437L;
                           client.setting.BooleanSetting var118 = this.settingDynamicClassic;
                           if (var118.method_49$aae029aa0a()) {
                              var10001 = -4290058808400909766L;
                              PacketHandler_47Cq var119 = client.ClientGlobals.field_48.field_489;
                              if (!var119.method_45_$aae029aa0a() && !(var25.method_43$3d77d36e13(var24) > 3.0)) {
                                 return;
                              }
                           }

                           this.field_47h = true;
                           return;
                        }
                     }
                  }
               }
            }

            var10001 = -4290058808400909766L;
            PacketHandler_47Cq var120 = client.ClientGlobals.field_48.field_489;
            if (var120.method_45_$aae029aa0a()) {
               var10001 = -4301686707159952168L;
               net.minecraft.client.Minecraft var121 = field_43;
               var121.method_40$f8db5d9e73().method_49$431840b606().method_43$631790539f(new net.C_47vS());
            }

            this.field_47h = false;
            var10001 = -4301959126943453461L;
            net.C_47cu var122 = this.field_45;
            var122.method_46$da8c82d5d4();
            var10001 = -4290368236319890197L;
            client.setting.RangeSetting var123 = this.settingClassicBackTrackDelay;
            var123.method_43$fedcb3e4d3();
         } else {
            this.field_47h = false;
         }
      } else {
         (var124 ? this : this).field_47h = false;
      }
   }









   private boolean method_48t$aae029aa0a() {
      long var1 = a ^ 29823273051596L;
      long var3 = var1 ^ 53645533231667L;
      long var10000 = 9211791415886165742L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 9214080790069057816L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_488$e45a9973e5(long var1) {
        int var123;
        augustus.recovered.modules.latency.BackTrack_47Ca var125;
        augustus.recovered.modules.latency.BackTrack_47Ca var126;
        java.lang.String var141;
      int var3;
      long var4;
      long var6;
      long var8;
      long var10;
      long var12;
      int var14;
      int var15;
      int var16;
      long var19;
      long var23;
      long var25;
      String var27;
      int var118;
      var3 = (int)((var1 ^ 4027910972176L) >>> 48);
      var4 = (var1 ^ 4027910972176L) << 16 >>> 16;
      var6 = var1 ^ 8751210584032L;
      var8 = var1 ^ 104222028673558L;
      var10 = var1 ^ 2361924594084L;
      var12 = var1 ^ 133953910404605L;
      long var10001 = var1 ^ 116183936840292L;
      var14 = (int)((var1 ^ 116183936840292L) >>> 32);
      var15 = (int)((var1 ^ 116183936840292L) << 32 >>> 56);
      var16 = (int)(var10001 << 40 >>> 40);
      long var17 = var1 ^ 78921266398747L;
      var19 = var1 ^ 71244246894833L;
      long var21 = var1 ^ 76629286485107L;
      var23 = var1 ^ 76144646311556L;
      var25 = var1 ^ 12565146594872L;
      long var10003 = -5074559091228427697L;
      long var37 = var17;
      BackTrack_47Ca var39 = this;
      this.field_49 = var39.method_43$f2b0beb8fc(var37);
      long var10000 = -5073676583362432850L;
      String var117 = net.C_47eb.method_48$0e30dfc966();
      var10003 = -5071465690817044648L;
      long var40 = var21;
      client.setting.ModeSetting var42 = this.settingMode;
      String var28 = var42.method_46$5f9dc63072(var40);
      var27 = var117;
      byte var29 = -1;
      var118 = var28.hashCode();
      label207:
      if (var27 == null) {
         label210: {
            String var119;
            switch (var118) {
               case -966060924:
                  var118 = ((int) (var28.equals("BackTrack") ? 1 : 0));
                  if (var27 != null) {
                     break label207;
                  }

                  if (var118 == 0) {
                     break label210;
                  }

                  var29 = 0;
                  var119 = var27;
                  if (var1 < 0L) {
                     break;
                  }

                  if (var27 == null) {
                     break label210;
                  }
               case 68985021:
                  var119 = var28;
                  break;
               default:
                  break label210;
            }

            var118 = ((int) (var119.equals("Gomme") ? 1 : 0));
            if (var27 != null) {
               break label207;
            }

            if (var118 != 0) {
               var29 = 1;
            }
         }

         var118 = var29;
      }

      switch (var118) {
         case 0:
            BackTrack_47Ca var120 = this;
            if (var27 == null) {
               if (this.field_49 == null) {
                  break;
               }

               var120 = this;
            }

            synchronized (var120.field_47q) {
               long var10004 = -5075461555478847960L;
               long var43 = var23;
               byte var45 = 0;
               net.minecraft.entity.EntityLivingBase var46 = this.field_49;
               double[] var131 = net.C_47TT.method_49$3cebd2dd73(var46, var45, var43);
               long var10002 = -5073802470544396216L;
               double[] var47 = var131;
               BackTrack_47Ca var48 = this;
               var48.method_45$d27e4ca694(var47);
            }

            if (var27 == null) {
               break;
            }
         case 1:
            StringBuilder var132 = new StringBuilder();
            long var156 = -5072157023156398174L;
            long var49 = var12;
            client.setting.NumberSetting var51 = this.settingLagPackets;
            String var145 = var132.append(var51.method_44$474dfaa627(var49)).append("").toString();
            var10003 = -5073965510420504152L;
            String var52 = var145;
            long var53 = var8;
            BackTrack_47Ca var55 = this;
            var55.method_47$d07b98bfef(var53, var52);
            net.minecraft.client.Minecraft var121 = field_43;
            if (var27 == null) {
               var10001 = -5072529648748066041L;
               net.minecraft.client.Minecraft var56 = field_43;
               if (var56.method_46$159e3d0645().field_48 < 1) {
                  return;
               }

               var121 = field_43;
            }

            var10001 = -5075304589957855734L;
            net.minecraft.client.Minecraft var57 = var121;
            if (var57.field_44Q != null) {
               label173: {
                  label172: {
                     byte var30;
                     var10003 = -5072529648748066041L;
                     net.minecraft.client.Minecraft var58 = field_43;
                     this.field_43p = this.field_43p + var58.method_46$159e3d0645().field_48;
                     var30 = 0;
                     label171:
                     if (this.field_49 != null) {
                        net.minecraft.client.Minecraft var122 = field_43;
                        if (var27 == null) {
                           var10001 = -5070099454213067261L;
                           net.minecraft.client.Minecraft var59 = field_43;
                           if (var59.field_42P == null) {
                              break label171;
                           }

                           var122 = field_43;
                        }

                        var10001 = -5075304589957855734L;
                        net.minecraft.client.Minecraft var60 = var122;
                        if (var60.field_44Q != null) {
                           var156 = -5074779080979025381L;
                           double var61 = this.field_49.field_42o;
                           double var63 = this.field_49.field_48j;
                           double var65 = this.field_49.field_48Q;
                           net.minecraft.entity.EntityLivingBase var67 = this.field_49;
                           net.C_478i var31 = net.C_47gg.method_43$0f34e7e3b0(var67, var65, var63, var61);
                           long var146 = -5069275462062970063L;
                           net.C_478i var68 = var31;
                           long var69 = var19;
                           net.C_47tf var32 = net.C_47gg.method_42$f4fbca6f44(var69, var68);
                           var156 = -5074779080979025381L;
                           double var71 = this.field_49.field_43E;
                           double var73 = this.field_49.field_47B;
                           double var75 = this.field_49.field_43S;
                           net.minecraft.entity.EntityLivingBase var77 = this.field_49;
                           net.C_478i var33 = net.C_47gg.method_43$0f34e7e3b0(var77, var75, var73, var71);
                           long var147 = -5069275462062970063L;
                           net.C_478i var78 = var33;
                           long var79 = var19;
                           net.C_47tf var34 = net.C_47gg.method_42$f4fbca6f44(var79, var78);
                           var10001 = -5070099454213067261L;
                           net.minecraft.client.Minecraft var81 = field_43;
                           net.C_47tf var35 = var81.field_42P.method_49$41b79b67a0(1.0F);
                           short var138 = (short)var3;
                           long var10005 = -5071502834095595163L;
                           net.minecraft.entity.EntityLivingBase var82 = this.field_49;
                           boolean var83 = this.field_47O;
                           long var84 = var4;
                           short var86 = var138;
                           BackTrack_47Ca var87 = this;
                           byte var36 = ((byte) (var87.method_44$b3b7078e64(var86, var84, var83, var82) ? 1 : 0));
                           long var148 = -5077804288854464103L;
                           long var88 = var25;
                           BackTrack_47Ca var90 = this;
                           var123 = ((var90.method_48n$0dd78e0064(var88)) ? 1 : 0);
                           if (var27 != null) {
                              break label172;
                           }

                           if (var123 != 0) {
                              long var149 = -5069675455441717161L;
                              long var91 = var10;
                              BackTrack_47Ca var93 = this;
                              var123 = ((var93.method_45$0dd78e0064(var91)) ? 1 : 0);
                              if (var27 != null) {
                                 break label172;
                              }

                              if (var123 != 0) {
                                 double var139 = var35.method_43$3d77d36e13(var34);
                                 double var150 = var35.method_43$3d77d36e13(var32);
                                 byte var159 = (byte)var15;
                                 long var10006 = -5073344835358890607L;
                                 int var94 = var16;
                                 byte var95 = var159;
                                 int var96 = var14;
                                 double var97 = var150;
                                 double var99 = var139;
                                 BackTrack_47Ca var101 = this;
                                 var123 = ((var101.method_49$72a224a996(var99, var97, var96, var95, var94)) ? 1 : 0);
                                 if (var27 != null) {
                                    break label172;
                                 }

                                 if (var123 != 0) {
                                    var123 = var36;
                                    if (var27 != null) {
                                       break label172;
                                    }

                                    if (var36 != 0) {
                                       var10003 = -5072789345434036259L;
                                       net.minecraft.entity.EntityLivingBase var102 = this.field_49;
                                       long var103 = var6;
                                       BackTrack_47Ca var105 = this;
                                       var123 = ((var105.method_48$971dcaf928(var103, var102)) ? 1 : 0);
                                       if (var27 != null) {
                                          break label172;
                                       }

                                       if (var123 != 0) {
                                          var10001 = -5070099454213067261L;
                                          net.minecraft.client.Minecraft var106 = field_43;
                                          double var124 = var106.field_42P.method_44$ee256e8a75(this.field_49);
                                          var156 = -5070099454213067261L;
                                          net.minecraft.client.Minecraft var107 = field_43;
                                          var10005 = -5070099454213067261L;
                                          net.minecraft.client.Minecraft var108 = field_43;
                                          var10006 = -5070099454213067261L;
                                          net.minecraft.client.Minecraft var109 = field_43;
                                          double var163;
                                          var123 = (byte)((
                                                   var163 = var124
                                                      - new net.C_47tf(var107.field_42P.field_48a, var108.field_42P.field_48G, var109.field_42P.field_48q)
                                                         .method_43$3d77d36e13(
                                                            new net.C_47tf(this.field_49.field_48Q, this.field_49.field_48j, this.field_49.field_42o)
                                                         )
                                                )
                                                == 0.0
                                             ? 0
                                             : (var163 < 0.0 ? -1 : 1));
                                          var141 = var27;
                                          if (var1 <= 0L) {
                                             break label173;
                                          }

                                          if (var27 != null) {
                                             break label172;
                                          }

                                          if (var123 < 0) {
                                             var30 = 1;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var123 = var30;
                  }

                  var141 = var27;
               }

               label142: {
                  label221: {
                     label140: {
                        label139: {
                           if (var141 == null) {
                              if (var123 == 0) {
                                 break label139;
                              }

                              var125 = this;
                              if (var27 != null) {
                                 break label140;
                              }

                              var123 = ((this.field_479) ? 1 : 0);
                           }

                           if (var123 == 0) {
                              var126 = this;
                              if (var27 != null) {
                                 break label142;
                              }

                              double var127 = this.field_43p;
                              var10003 = -5072157023156398174L;
                              long var110 = var12;
                              client.setting.NumberSetting var112 = this.settingLagPackets;
                              if (!(var127 > var112.method_44$474dfaa627(var110))) {
                                 break label221;
                              }
                           }
                        }

                        var125 = this;
                     }

                     var125.field_43u = false;
                     String var128 = var27;
                     if (var1 > 0L) {
                        if (var27 == null) {
                           label217: {
                              var10001 = -5071603536124483317L;
                              net.minecraft.client.Minecraft var113 = field_43;
                              net.C_47K6 var129 = var113.method_40$f8db5d9e73();
                              if (var1 > 0L) {
                                 if (var129 == null) {
                                    break label217;
                                 }

                                 var10001 = -5071603536124483317L;
                                 net.minecraft.client.Minecraft var114 = field_43;
                                 var129 = var114.method_40$f8db5d9e73();
                              }

                              net.C_47ri var130 = var129.method_49$431840b606();
                              if (var27 == null) {
                                 if (var130 == null) {
                                    break label217;
                                 }

                                 var10001 = -5071603536124483317L;
                                 net.minecraft.client.Minecraft var115 = field_43;
                                 var130 = var115.method_40$f8db5d9e73().method_49$431840b606();
                              }

                              var130.method_45$631790539f(new net.C_47vS());
                           }

                           this.field_43a = true;
                           this.field_47O = false;
                           this.field_43p = 0;
                           this.field_479 = false;
                        }

                        var128 = var27;
                     }

                     if (var128 == null) {
                        return;
                     }
                  }

                  this.field_43a = false;
                  var126 = this;
               }

               var126.field_47O = true;
            }
      }
   }









   private boolean method_48c$aae029aa0a() {
      long var1 = a ^ 102501872249990L;
      long var3 = var1 ^ 130756064326521L;
      long var10002 = -678711419597320110L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



   private boolean method_486$aae029aa0a() {
      long var1 = a ^ 53912657872371L;
      long var3 = var1 ^ 29536821008908L;
      long var10000 = -6923737506724063535L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -6926017539690727129L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48X$aae029aa0a() {
      long var1 = a ^ 72896441584546L;
      long var3 = var1 ^ 116106151498845L;
      long var10000 = 5888599654718380160L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 5886386107775989622L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("ClassicBackTrack");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48v$aae029aa0a() {
      long var1 = a ^ 45649926191360L;
      long var3 = var1 ^ 2547532785407L;
      long var10000 = -6693780713913062878L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10001 = -6696836441442072260L;
      BooleanSetting var6 = this.settingCheckStartDistance;
      boolean var10 = var6.method_49$aae029aa0a();
      if (var5 == null) {
         if (!var10) {
            return false;
         }

         long var10002 = -6696061880379914796L;
         long var7 = var3;
         ModeSetting var9 = this.settingMode;
         var10 = var9.method_46$5f9dc63072(var7).equals("ClassicBackTrack");
      }

      return var5 != null ? var10 : !var10;
   }



   private synchronized boolean method_48a$aae029aa0a() {
      return this.field_47u;
   }



   private boolean method_48d$aae029aa0a() {
      long var1 = a ^ 138808486693399L;
      long var3 = var1 ^ 94469045196264L;
      long var10002 = 5766182608283317955L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("BackTrack");
   }



    public BackTrack_47Ca(int a0,int a1) {
        super((java.lang.String) ("BackTrack"),(java.lang.String) ("Zur\u00fcckverfolgung"),(long) ((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 77633574898593L)),(java.awt.Color) (new java.awt.Color((int) (110),(int) (186),(int) (9))),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = ((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a);
        long constructorKey2 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 20191564649366L);
        long constructorKey3 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 68643892904583L);
        int constructorPart4 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 8503023358982L) >>> 32));
        int constructorPart5 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 8503023358982L) << 32) >>> 48));
        int constructorPart6 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 8503023358982L) << 48) >>> 48));
        long constructorKey7 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 2401942577984L);
        long constructorKey8 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 47032482908914L);
        long constructorKey9 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 55897159221551L);
        long constructorKey10 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 108298049259060L);
        long constructorKey11 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 17395133473372L);
        long constructorKey12 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 66070356047311L);
        long constructorKey13 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 104142948385457L);
        long constructorKey14 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 61297672673210L);
        long constructorKey15 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 81859147661452L);
        int constructorPart16 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 43751412617500L) >>> 32));
        long constructorKey17 = (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 43751412617500L) << 32) >>> 32);
        long constructorKey18 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 89435192152325L);
        int constructorPart19 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36110302066489L) >>> 32));
        int constructorPart20 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36110302066489L) << 32) >>> 48));
        int constructorPart21 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36110302066489L) << 48) >>> 48));
        long constructorKey22 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 131282669667927L);
        int constructorPart23 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 72095920384331L) >>> 48));
        int constructorPart24 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 72095920384331L) << 16) >>> 48));
        int constructorPart25 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 72095920384331L) << 32) >>> 32));
        long constructorKey26 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 14497273052012L);
        int constructorPart27 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 24437129888975L) >>> 32));
        int constructorPart28 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 24437129888975L) << 32) >>> 40));
        int constructorPart29 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 24437129888975L) << 56) >>> 56));
        int constructorPart30 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36613418423831L) >>> 32));
        int constructorPart31 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36613418423831L) << 32) >>> 48));
        int constructorPart32 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 36613418423831L) << 48) >>> 48));
        long constructorKey33 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 39495165047772L);
        long constructorKey34 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 29582818109501L);
        long constructorKey35 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.latency.BackTrack_47Ca.a) ^ 453831963403L);
        java.lang.Object initialValue36 = recovery$indy$flow$1630(5);
        ((java.lang.Object[]) initialValue36)[0] = "BackTrack";
        ((java.lang.Object[]) initialValue36)[1] = "LagTrack";
        ((java.lang.Object[]) initialValue36)[2] = "Gomme";
        ((java.lang.Object[]) initialValue36)[3] = "Ping";
        ((java.lang.Object[]) initialValue36)[4] = "ClassicBackTrack";
        client.setting.ModeSetting initialized37 = new client.setting.ModeSetting(this, "Mode", constructorKey26, "BackTrack", (java.lang.String[]) (initialValue36));
        recovery$indy$flow$1632(this, initialized37);
        java.lang.Object initialValue38 = recovery$indy$flow$1633();
        short converted39 = (short) (constructorPart20);
        short converted40 = (short) (constructorPart21);
        client.setting.RangeSetting initialized41 = new client.setting.RangeSetting(constructorPart19, this, "MaxHitRange", Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4618441417868443648L), converted39, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4621819117588971520L), 2, converted40);
        java.lang.String initialValue42 = "MaxBackTrackRangeMax";
        java.lang.String initialValue43 = "MaxBackTrackRangeMin";
        long initialValue44 = constructorKey15;
        client.setting.RangeSetting initialValue45 = initialized41;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue48 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue49 = recovery$indy$flow$1639(initialValue46, initialValue44, initialValue47, initialValue48);
        long initialValue50 = constructorKey11;
        java.lang.Object initialValue51 = initialValue49;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = recovery$indy$flow$1641(initialValue52, initialValue50);
        recovery$indy$flow$1642(this, initialValue53);
        java.lang.Object initialValue54 = initialValue38;
        client.setting.NumberSetting initialized55 = new client.setting.NumberSetting(this, "Threshold", Double.longBitsToDouble(4593671619917905920L), constructorKey34, 0.0D, Double.longBitsToDouble(4596373779694328218L), 3);
        recovery$indy$flow$1645(this, initialized55);
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, constructorKey14, "CancelHitsIfServerCancelsHit", true);
        recovery$indy$flow$1648(this, initialized56);
        short converted57 = (short) (constructorPart20);
        short converted58 = (short) (constructorPart21);
        client.setting.RangeSetting initialized59 = new client.setting.RangeSetting(constructorPart19, this, "ClassicBackTrackDelay", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4643000109586448384L), converted57, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0, converted58);
        long initialValue60 = constructorKey11;
        client.setting.RangeSetting initialValue61 = initialized59;
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue63 = recovery$indy$flow$1652(initialValue62, initialValue60);
        java.lang.String initialValue64 = "MaxBackTrackDelay";
        java.lang.String initialValue65 = "MinBackTrackDelay";
        long initialValue66 = constructorKey15;
        java.lang.Object initialValue67 = initialValue63;
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue69 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue70 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue71 = recovery$indy$flow$1656(initialValue68, initialValue66, initialValue69, initialValue70);
        java.lang.Object initialValue72 = recovery$indy$flow$1657(this);
        long initialValue73 = constructorKey17;
        java.lang.Object initialValue74 = initialValue72;
        int initialValue75 = constructorPart16;
        java.lang.Object initialValue76 = initialValue71;
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue78 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue79 = recovery$indy$flow$1660(initialValue77, initialValue75, initialValue78, initialValue73);
        recovery$indy$flow$1661(this, initialValue79);
        client.setting.BooleanSetting initialized80 = new client.setting.BooleanSetting(this, constructorKey14, "OnlyWhenNeed", false);
        java.lang.Object initialValue81 = recovery$indy$flow$1664(this);
        java.lang.Object initialValue82 = initialValue81;
        long initialValue83 = constructorKey3;
        client.setting.BooleanSetting initialValue84 = initialized80;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue84))))));
        java.lang.Object initialValue86 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue87 = recovery$indy$flow$1667(initialValue85, initialValue83, initialValue86);
        java.lang.Object initialValue88 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue87))))));
        recovery$indy$flow$1669(this, initialValue88);
        client.setting.BooleanSetting initialized89 = new client.setting.BooleanSetting(this, constructorKey14, "DynamicClassic", false);
        long initialValue90 = constructorKey12;
        java.lang.String initialValue91 = "Dynamic";
        client.setting.BooleanSetting initialValue92 = initialized89;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue91))))));
        java.lang.Object initialValue95 = recovery$indy$flow$1674(initialValue93, initialValue94, initialValue90);
        java.lang.Object initialValue96 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue97 = recovery$indy$flow$1676(this);
        java.lang.Object initialValue98 = initialValue97;
        long initialValue99 = constructorKey3;
        java.lang.Object initialValue100 = initialValue96;
        java.lang.Object initialValue101 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue100))))));
        java.lang.Object initialValue102 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue103 = recovery$indy$flow$1679(initialValue101, initialValue99, initialValue102);
        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue103))))));
        recovery$indy$flow$1681(this, initialValue104);
        net.C_47TU initialized105 = new net.C_47TU(constructorKey9, this, "BackTrackTime", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4643000109586448384L), 0.0D, Double.longBitsToDouble(4662219572839972864L), 0);
        java.lang.String initialValue106 = "MaxBackTrackDelay";
        java.lang.String initialValue107 = "MinBackTrackDelay";
        long initialValue108 = constructorKey7;
        net.C_47TU initialValue109 = initialized105;
        java.lang.Object initialValue110 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue111 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue107))))));
        java.lang.Object initialValue112 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue106))))));
        java.lang.Object initialValue113 = recovery$indy$flow$1687(initialValue110, initialValue108, initialValue111, initialValue112);
        java.lang.Object initialValue114 = recovery$indy$flow$1688(this);
        long initialValue115 = constructorKey8;
        java.lang.Object initialValue116 = initialValue114;
        java.lang.Object initialValue117 = initialValue113;
        java.lang.Object initialValue118 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue117))))));
        java.lang.Object initialValue119 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue116))))));
        java.lang.Object initialValue120 = recovery$indy$flow$1691(initialValue118, initialValue119, initialValue115);
        recovery$indy$flow$1692(this, initialValue120);
        short converted121 = (short) (constructorPart20);
        short converted122 = (short) (constructorPart21);
        client.setting.RangeSetting initialized123 = new client.setting.RangeSetting(constructorPart19, this, "DelayBetweenBacktrack", Double.longBitsToDouble(4632233691727265792L), Double.longBitsToDouble(4639481672377565184L), converted121, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0, converted122);
        long initialValue124 = constructorKey11;
        client.setting.RangeSetting initialValue125 = initialized123;
        java.lang.Object initialValue126 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue125))))));
        java.lang.Object initialValue127 = recovery$indy$flow$1696(initialValue126, initialValue124);
        java.lang.String initialValue128 = "DelayBetweenBacktracks";
        long initialValue129 = constructorKey2;
        java.lang.Object initialValue130 = initialValue127;
        java.lang.Object initialValue131 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue132 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue133 = recovery$indy$flow$1699(initialValue131, initialValue129, initialValue132);
        java.lang.Object initialValue134 = recovery$indy$flow$1700(this);
        long initialValue135 = constructorKey17;
        java.lang.Object initialValue136 = initialValue134;
        int initialValue137 = constructorPart16;
        java.lang.Object initialValue138 = initialValue133;
        java.lang.Object initialValue139 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue138))))));
        java.lang.Object initialValue140 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue136))))));
        java.lang.Object initialValue141 = recovery$indy$flow$1703(initialValue139, initialValue137, initialValue140, initialValue135);
        recovery$indy$flow$1704(this, initialValue141);
        client.setting.BooleanSetting initialized142 = new client.setting.BooleanSetting(this, constructorKey14, "CalculateWithOwnPing", false);
        long initialValue143 = constructorKey12;
        java.lang.String initialValue144 = "Subtract ping from Delay";
        client.setting.BooleanSetting initialValue145 = initialized142;
        java.lang.Object initialValue146 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue145))))));
        java.lang.Object initialValue147 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue144))))));
        java.lang.Object initialValue148 = recovery$indy$flow$1709(initialValue146, initialValue147, initialValue143);
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = recovery$indy$flow$1711(this);
        java.lang.Object initialValue151 = initialValue150;
        long initialValue152 = constructorKey3;
        java.lang.Object initialValue153 = initialValue149;
        java.lang.Object initialValue154 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue155 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue151))))));
        java.lang.Object initialValue156 = recovery$indy$flow$1714(initialValue154, initialValue152, initialValue155);
        java.lang.Object initialValue157 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue156))))));
        recovery$indy$flow$1716(this, initialValue157);
        client.setting.BooleanSetting initialized158 = new client.setting.BooleanSetting(this, constructorKey14, "ForceDelay", false);
        java.lang.Object initialValue159 = recovery$indy$flow$1719(this);
        java.lang.Object initialValue160 = initialValue159;
        long initialValue161 = constructorKey3;
        client.setting.BooleanSetting initialValue162 = initialized158;
        java.lang.Object initialValue163 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue162))))));
        java.lang.Object initialValue164 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue160))))));
        java.lang.Object initialValue165 = recovery$indy$flow$1722(initialValue163, initialValue161, initialValue164);
        java.lang.Object initialValue166 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue165))))));
        recovery$indy$flow$1724(this, initialValue166);
        client.setting.BooleanSetting initialized167 = new client.setting.BooleanSetting(this, constructorKey14, "Predict", true);
        java.lang.Object initialValue168 = recovery$indy$flow$1727(this);
        java.lang.Object initialValue169 = initialValue168;
        long initialValue170 = constructorKey3;
        client.setting.BooleanSetting initialValue171 = initialized167;
        java.lang.Object initialValue172 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue171))))));
        java.lang.Object initialValue173 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue174 = recovery$indy$flow$1730(initialValue172, initialValue170, initialValue173);
        java.lang.Object initialValue175 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue174))))));
        recovery$indy$flow$1732(this, initialValue175);
        client.setting.BooleanSetting initialized176 = new client.setting.BooleanSetting(this, constructorKey14, "Dynamic", false);
        java.lang.Object initialValue177 = recovery$indy$flow$1735(this);
        java.lang.Object initialValue178 = initialValue177;
        long initialValue179 = constructorKey3;
        client.setting.BooleanSetting initialValue180 = initialized176;
        java.lang.Object initialValue181 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue180))))));
        java.lang.Object initialValue182 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue183 = recovery$indy$flow$1738(initialValue181, initialValue179, initialValue182);
        java.lang.Object initialValue184 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue183))))));
        recovery$indy$flow$1740(this, initialValue184);
        short converted185 = (short) (constructorPart20);
        short converted186 = (short) (constructorPart21);
        client.setting.RangeSetting initialized187 = new client.setting.RangeSetting(constructorPart19, this, "MaxLagPackets", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), converted185, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, converted186);
        java.lang.Object initialValue188 = recovery$indy$flow$1743(this);
        long initialValue189 = constructorKey17;
        java.lang.Object initialValue190 = initialValue188;
        int initialValue191 = constructorPart16;
        client.setting.RangeSetting initialValue192 = initialized187;
        java.lang.Object initialValue193 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue194 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue190))))));
        java.lang.Object initialValue195 = recovery$indy$flow$1746(initialValue193, initialValue191, initialValue194, initialValue189);
        recovery$indy$flow$1747(this, initialValue195);
        client.setting.NumberSetting initialized196 = new client.setting.NumberSetting(this, "DelayBetweenLags", 0.0D, constructorKey34, 0.0D, Double.longBitsToDouble(4661014508095930368L), 0);
        java.lang.Object initialValue197 = recovery$indy$flow$1750(this);
        java.lang.Object initialValue198 = initialValue197;
        client.setting.NumberSetting initialValue199 = initialized196;
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue199))))));
        java.lang.Object initialValue201 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue198))))));
        java.lang.Object initialValue202 = recovery$indy$flow$1753(initialValue200, initialValue201);
        recovery$indy$flow$1754(this, initialValue202);
        java.lang.Object initialValue203 = recovery$indy$flow$1756(2);
        ((java.lang.Object[]) initialValue203)[0] = "Tick";
        ((java.lang.Object[]) initialValue203)[1] = "MovePacket";
        client.setting.ModeSetting initialized204 = new client.setting.ModeSetting(this, "CountMode", constructorKey26, "Tick", (java.lang.String[]) (initialValue203));
        java.lang.Object initialValue205 = recovery$indy$flow$1758(this);
        java.lang.Object initialValue206 = initialValue205;
        client.setting.ModeSetting initialValue207 = initialized204;
        java.lang.Object initialValue208 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue207))))));
        java.lang.Object initialValue209 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue206))))));
        java.lang.Object initialValue210 = recovery$indy$flow$1761(initialValue208, initialValue209);
        recovery$indy$flow$1762(this, initialValue210);
        client.setting.BooleanSetting initialized211 = new client.setting.BooleanSetting(this, constructorKey14, "CalculateWithOwnPingLagTrack", false);
        long initialValue212 = constructorKey12;
        java.lang.String initialValue213 = "Subtract ping from Delay";
        client.setting.BooleanSetting initialValue214 = initialized211;
        java.lang.Object initialValue215 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue214))))));
        java.lang.Object initialValue216 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue213))))));
        java.lang.Object initialValue217 = recovery$indy$flow$1767(initialValue215, initialValue216, initialValue212);
        java.lang.Object initialValue218 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue217))))));
        java.lang.Object initialValue219 = recovery$indy$flow$1769(this);
        java.lang.Object initialValue220 = initialValue219;
        long initialValue221 = constructorKey3;
        java.lang.Object initialValue222 = initialValue218;
        java.lang.Object initialValue223 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue222))))));
        java.lang.Object initialValue224 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue220))))));
        java.lang.Object initialValue225 = recovery$indy$flow$1772(initialValue223, initialValue221, initialValue224);
        java.lang.Object initialValue226 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue225))))));
        recovery$indy$flow$1774(this, initialValue226);
        client.setting.NumberSetting initialized227 = new client.setting.NumberSetting(this, "LagPackets", Double.longBitsToDouble(4621819117588971520L), constructorKey34, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        short converted228 = (short) (constructorPart6);
        int initialValue229 = (int) (converted228);
        int initialValue230 = constructorPart5;
        java.lang.String initialValue231 = "MaxLagPackets";
        int initialValue232 = constructorPart4;
        client.setting.NumberSetting initialValue233 = initialized227;
        java.lang.Object initialValue234 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue233))))));
        java.lang.Object initialValue235 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue231))))));
        java.lang.Object initialValue236 = recovery$indy$flow$1779(initialValue234, initialValue232, initialValue235, initialValue230, (short) (initialValue229));
        java.lang.Object initialValue237 = recovery$indy$flow$1780(this);
        java.lang.Object initialValue238 = initialValue237;
        java.lang.Object initialValue239 = initialValue236;
        java.lang.Object initialValue240 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue239))))));
        java.lang.Object initialValue241 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue238))))));
        java.lang.Object initialValue242 = recovery$indy$flow$1783(initialValue240, initialValue241);
        recovery$indy$flow$1784(this, initialValue242);
        short converted243 = (short) (constructorPart20);
        short converted244 = (short) (constructorPart21);
        client.setting.RangeSetting initialized245 = new client.setting.RangeSetting(constructorPart19, this, "PingDelay", Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4639481672377565184L), converted243, 0.0D, Double.longBitsToDouble(4656510908468559872L), 0, converted244);
        long initialValue246 = constructorKey11;
        client.setting.RangeSetting initialValue247 = initialized245;
        java.lang.Object initialValue248 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue247))))));
        java.lang.Object initialValue249 = recovery$indy$flow$1788(initialValue248, initialValue246);
        java.lang.Object initialValue250 = recovery$indy$flow$1789(this);
        long initialValue251 = constructorKey17;
        java.lang.Object initialValue252 = initialValue250;
        int initialValue253 = constructorPart16;
        java.lang.Object initialValue254 = initialValue249;
        java.lang.Object initialValue255 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue254))))));
        java.lang.Object initialValue256 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue252))))));
        java.lang.Object initialValue257 = recovery$indy$flow$1792(initialValue255, initialValue253, initialValue256, initialValue251);
        recovery$indy$flow$1793(this, initialValue257);
        client.setting.NumberSetting initialized258 = new client.setting.NumberSetting(this, "DelayBetweenBacktrackPing", Double.longBitsToDouble(4652992471259676672L), constructorKey34, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0);
        short converted259 = (short) (constructorPart6);
        int initialValue260 = (int) (converted259);
        int initialValue261 = constructorPart5;
        java.lang.String initialValue262 = "DelayBetweenBacktracks";
        int initialValue263 = constructorPart4;
        client.setting.NumberSetting initialValue264 = initialized258;
        java.lang.Object initialValue265 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue264))))));
        java.lang.Object initialValue266 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue262))))));
        java.lang.Object initialValue267 = recovery$indy$flow$1798(initialValue265, initialValue263, initialValue266, initialValue261, (short) (initialValue260));
        java.lang.Object initialValue268 = recovery$indy$flow$1799(this);
        java.lang.Object initialValue269 = initialValue268;
        java.lang.Object initialValue270 = initialValue267;
        java.lang.Object initialValue271 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue270))))));
        java.lang.Object initialValue272 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue269))))));
        java.lang.Object initialValue273 = recovery$indy$flow$1802(initialValue271, initialValue272);
        recovery$indy$flow$1803(this, initialValue273);
        client.setting.BooleanSetting initialized274 = new client.setting.BooleanSetting(this, constructorKey14, "CalculateWithOwnPingPing", false);
        long initialValue275 = constructorKey12;
        java.lang.String initialValue276 = "Subtract own ping from Delay";
        client.setting.BooleanSetting initialValue277 = initialized274;
        java.lang.Object initialValue278 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue277))))));
        java.lang.Object initialValue279 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue276))))));
        java.lang.Object initialValue280 = recovery$indy$flow$1808(initialValue278, initialValue279, initialValue275);
        java.lang.Object initialValue281 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue280))))));
        java.lang.Object initialValue282 = recovery$indy$flow$1810(this);
        java.lang.Object initialValue283 = initialValue282;
        long initialValue284 = constructorKey3;
        java.lang.Object initialValue285 = initialValue281;
        java.lang.Object initialValue286 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue285))))));
        java.lang.Object initialValue287 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue283))))));
        java.lang.Object initialValue288 = recovery$indy$flow$1813(initialValue286, initialValue284, initialValue287);
        java.lang.Object initialValue289 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue288))))));
        recovery$indy$flow$1815(this, initialValue289);
        client.setting.BooleanSetting initialized290 = new client.setting.BooleanSetting(this, constructorKey14, "DynamicPing", false);
        long initialValue291 = constructorKey12;
        java.lang.String initialValue292 = "Dynamic";
        client.setting.BooleanSetting initialValue293 = initialized290;
        java.lang.Object initialValue294 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue293))))));
        java.lang.Object initialValue295 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue292))))));
        java.lang.Object initialValue296 = recovery$indy$flow$1820(initialValue294, initialValue295, initialValue291);
        java.lang.Object initialValue297 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue296))))));
        java.lang.Object initialValue298 = recovery$indy$flow$1822(this);
        java.lang.Object initialValue299 = initialValue298;
        long initialValue300 = constructorKey3;
        java.lang.Object initialValue301 = initialValue297;
        java.lang.Object initialValue302 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue301))))));
        java.lang.Object initialValue303 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue299))))));
        java.lang.Object initialValue304 = recovery$indy$flow$1825(initialValue302, initialValue300, initialValue303);
        java.lang.Object initialValue305 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue304))))));
        recovery$indy$flow$1827(this, initialValue305);
        client.setting.BooleanSetting initialized306 = new client.setting.BooleanSetting(this, constructorKey14, "CheckStartDistance", false);
        java.lang.Object initialValue307 = recovery$indy$flow$1830(this);
        java.lang.Object initialValue308 = initialValue307;
        long initialValue309 = constructorKey3;
        client.setting.BooleanSetting initialValue310 = initialized306;
        java.lang.Object initialValue311 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue310))))));
        java.lang.Object initialValue312 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue308))))));
        java.lang.Object initialValue313 = recovery$indy$flow$1833(initialValue311, initialValue309, initialValue312);
        java.lang.Object initialValue314 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue313))))));
        recovery$indy$flow$1835(this, initialValue314);
        client.setting.NumberSetting initialized315 = new client.setting.NumberSetting(this, "StartDistance", Double.longBitsToDouble(4613937818241073152L), constructorKey34, 0.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        java.lang.Object initialValue316 = recovery$indy$flow$1838(this);
        java.lang.Object initialValue317 = initialValue316;
        client.setting.NumberSetting initialValue318 = initialized315;
        java.lang.Object initialValue319 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue318))))));
        java.lang.Object initialValue320 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue317))))));
        java.lang.Object initialValue321 = recovery$indy$flow$1841(initialValue319, initialValue320);
        recovery$indy$flow$1842(this, initialValue321);
        java.lang.Object initialValue322 = recovery$indy$flow$1844(3);
        ((java.lang.Object[]) initialValue322)[0] = "None";
        ((java.lang.Object[]) initialValue322)[1] = "OnAttack";
        ((java.lang.Object[]) initialValue322)[2] = "OnRange";
        client.setting.ModeSetting initialized323 = new client.setting.ModeSetting(this, "AbortCriterion", constructorKey26, "None", (java.lang.String[]) (initialValue322));
        java.lang.Object initialValue324 = recovery$indy$flow$1846(this);
        java.lang.Object initialValue325 = initialValue324;
        client.setting.ModeSetting initialValue326 = initialized323;
        java.lang.Object initialValue327 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue326))))));
        java.lang.Object initialValue328 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue325))))));
        java.lang.Object initialValue329 = recovery$indy$flow$1849(initialValue327, initialValue328);
        recovery$indy$flow$1850(this, initialValue329);
        client.setting.NumberSetting initialized330 = new client.setting.NumberSetting(this, "StopOnAttackRange", Double.longBitsToDouble(4613825228250388890L), constructorKey34, 1.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        java.lang.Object initialValue331 = recovery$indy$flow$1853(this);
        java.lang.Object initialValue332 = initialValue331;
        client.setting.NumberSetting initialValue333 = initialized330;
        java.lang.Object initialValue334 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue333))))));
        java.lang.Object initialValue335 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue332))))));
        java.lang.Object initialValue336 = recovery$indy$flow$1856(initialValue334, initialValue335);
        recovery$indy$flow$1857(this, initialValue336);
        client.setting.BooleanSetting initialized337 = new client.setting.BooleanSetting(this, constructorKey14, "FixPacketOrder", true);
        java.lang.Object initialValue338 = recovery$indy$flow$1860(this);
        java.lang.Object initialValue339 = initialValue338;
        long initialValue340 = constructorKey3;
        client.setting.BooleanSetting initialValue341 = initialized337;
        java.lang.Object initialValue342 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue341))))));
        java.lang.Object initialValue343 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue339))))));
        java.lang.Object initialValue344 = recovery$indy$flow$1863(initialValue342, initialValue340, initialValue343);
        java.lang.Object initialValue345 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue344))))));
        recovery$indy$flow$1865(this, initialValue345);
        client.setting.NumberSetting initialized346 = new client.setting.NumberSetting(this, "StopOnAttackMaxHurtTime", Double.longBitsToDouble(4613937818241073152L), constructorKey34, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue347 = recovery$indy$flow$1868(this);
        java.lang.Object initialValue348 = initialValue347;
        client.setting.NumberSetting initialValue349 = initialized346;
        java.lang.Object initialValue350 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue349))))));
        java.lang.Object initialValue351 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue348))))));
        java.lang.Object initialValue352 = recovery$indy$flow$1871(initialValue350, initialValue351);
        recovery$indy$flow$1872(this, initialValue352);
        client.setting.BooleanSetting initialized353 = new client.setting.BooleanSetting(this, constructorKey14, "StopBackTrackAtHurtTime", false);
        java.lang.Object initialValue354 = recovery$indy$flow$1875(this);
        java.lang.Object initialValue355 = initialValue354;
        long initialValue356 = constructorKey3;
        client.setting.BooleanSetting initialValue357 = initialized353;
        java.lang.Object initialValue358 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue357))))));
        java.lang.Object initialValue359 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue355))))));
        java.lang.Object initialValue360 = recovery$indy$flow$1878(initialValue358, initialValue356, initialValue359);
        java.lang.Object initialValue361 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue360))))));
        recovery$indy$flow$1880(this, initialValue361);
        client.setting.NumberSetting initialized362 = new client.setting.NumberSetting(this, "ContinueWithBackTrackAtHurtTime", 0.0D, constructorKey34, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue363 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingStopBackTrackAtHurtTime));
        java.lang.Object initialValue364 = recovery$indy$flow$1884(initialValue363);
        java.lang.Object initialValue365 = recovery$indy$flow$1885(initialValue363);
        java.lang.Object initialValue366 = initialValue365;
        client.setting.NumberSetting initialValue367 = initialized362;
        java.lang.Object initialValue368 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue367))))));
        java.lang.Object initialValue369 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue366))))));
        java.lang.Object initialValue370 = recovery$indy$flow$1888(initialValue368, initialValue369);
        java.lang.Object initialValue371 = recovery$indy$flow$1889(this);
        java.lang.Object initialValue372 = initialValue371;
        java.lang.Object initialValue373 = initialValue370;
        java.lang.Object initialValue374 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue373))))));
        java.lang.Object initialValue375 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue372))))));
        java.lang.Object initialValue376 = recovery$indy$flow$1892(initialValue374, initialValue375);
        recovery$indy$flow$1893(this, initialValue376);
        client.setting.BooleanSetting initialized377 = new client.setting.BooleanSetting(this, constructorKey14, "NotWhileScaffold", true);
        recovery$indy$flow$1896(this, initialized377);
        client.setting.BooleanSetting initialized378 = new client.setting.BooleanSetting(this, constructorKey14, "Improve", false);
        recovery$indy$flow$1899(this, initialized378);
        client.setting.BooleanSetting initialized379 = new client.setting.BooleanSetting(this, constructorKey14, "OnlyKillAura", true);
        recovery$indy$flow$1902(this, initialized379);
        java.lang.Object initialValue380 = recovery$indy$flow$1904();
        client.setting.MultiSelectSetting initialized381 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey22, (net.C_47OZ[]) (initialValue380));
        java.lang.Object initialValue382 = recovery$indy$flow$1906(this);
        java.lang.Object initialValue383 = initialValue382;
        client.setting.MultiSelectSetting initialValue384 = initialized381;
        java.lang.Object initialValue385 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue384))))));
        java.lang.Object initialValue386 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue383))))));
        java.lang.Object initialValue387 = recovery$indy$flow$1909(initialValue385, initialValue386);
        recovery$indy$flow$1910(this, initialValue387);
        client.setting.NumberSetting initialized388 = new client.setting.NumberSetting(this, "PreAimRange", Double.longBitsToDouble(4616189618054758400L), constructorKey34, 0.0D, Double.longBitsToDouble(4624633867356078080L), 1);
        java.lang.Object initialValue389 = recovery$indy$flow$1913(this);
        java.lang.Object initialValue390 = initialValue389;
        client.setting.NumberSetting initialValue391 = initialized388;
        java.lang.Object initialValue392 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue391))))));
        java.lang.Object initialValue393 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue390))))));
        java.lang.Object initialValue394 = recovery$indy$flow$1916(initialValue392, initialValue393);
        recovery$indy$flow$1917(this, initialValue394);
        client.setting.BooleanSetting initialized395 = new client.setting.BooleanSetting(this, constructorKey14, "ClickCheck", false);
        recovery$indy$flow$1920(this, initialized395);
        client.setting.SettingGroup initialized396 = new client.setting.SettingGroup(this, "TargetESPs", constructorKey13);
        recovery$indy$flow$1923(this, initialized396);
        java.lang.Object initialValue397 = recovery$indy$flow$1925(4);
        ((java.lang.Object[]) initialValue397)[0] = "None";
        ((java.lang.Object[]) initialValue397)[1] = "Classic";
        ((java.lang.Object[]) initialValue397)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue397)[3] = "PlayerModelArmor";
        java.lang.Object initialValue398 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ModeSetting initialized399 = new client.setting.ModeSetting(this, "TargetESP", "Classic", (java.lang.String[]) (initialValue397), (client.setting.SettingGroup) (initialValue398), constructorKey18);
        recovery$indy$flow$1928(this, initialized399);
        java.awt.Color initialized400 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue401 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ColorSetting initialized402 = new client.setting.ColorSetting(this, "ClassicColorTarget", constructorKey10, initialized400, (client.setting.SettingGroup) (initialValue401));
        long initialValue403 = constructorKey12;
        java.lang.String initialValue404 = "ClassicColor";
        client.setting.ColorSetting initialValue405 = initialized402;
        java.lang.Object initialValue406 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue405))))));
        java.lang.Object initialValue407 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue404))))));
        java.lang.Object initialValue408 = recovery$indy$flow$1936(initialValue406, initialValue407, initialValue403);
        java.lang.Object initialValue409 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue408))))));
        java.lang.Object initialValue410 = recovery$indy$flow$1938(this);
        java.lang.Object initialValue411 = initialValue410;
        long initialValue412 = constructorKey3;
        java.lang.Object initialValue413 = initialValue409;
        java.lang.Object initialValue414 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue413))))));
        java.lang.Object initialValue415 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue411))))));
        java.lang.Object initialValue416 = recovery$indy$flow$1941(initialValue414, initialValue412, initialValue415);
        java.lang.Object initialValue417 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue416))))));
        recovery$indy$flow$1943(this, initialValue417);
        java.lang.Object initialValue418 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.NumberSetting initialized419 = new client.setting.NumberSetting(this, "LineWidthTarget", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue418), constructorKey35);
        short converted420 = (short) (constructorPart6);
        int initialValue421 = (int) (converted420);
        int initialValue422 = constructorPart5;
        java.lang.String initialValue423 = "LineWidth";
        int initialValue424 = constructorPart4;
        client.setting.NumberSetting initialValue425 = initialized419;
        java.lang.Object initialValue426 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue425))))));
        java.lang.Object initialValue427 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue423))))));
        java.lang.Object initialValue428 = recovery$indy$flow$1949(initialValue426, initialValue424, initialValue427, initialValue422, (short) (initialValue421));
        java.lang.Object initialValue429 = recovery$indy$flow$1950(this);
        java.lang.Object initialValue430 = initialValue429;
        java.lang.Object initialValue431 = initialValue428;
        java.lang.Object initialValue432 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue431))))));
        java.lang.Object initialValue433 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue430))))));
        java.lang.Object initialValue434 = recovery$indy$flow$1953(initialValue432, initialValue433);
        recovery$indy$flow$1954(this, initialValue434);
        short converted435 = (short) (constructorPart23);
        char converted436 = (char) (constructorPart24);
        java.lang.Object initialValue437 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.BooleanSetting initialized438 = new client.setting.BooleanSetting(this, "SmoothRendering", converted435, converted436, constructorPart25, false, (client.setting.SettingGroup) (initialValue437));
        java.lang.Object initialValue439 = recovery$indy$flow$1958(this);
        java.lang.Object initialValue440 = initialValue439;
        long initialValue441 = constructorKey3;
        client.setting.BooleanSetting initialValue442 = initialized438;
        java.lang.Object initialValue443 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue442))))));
        java.lang.Object initialValue444 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue440))))));
        java.lang.Object initialValue445 = recovery$indy$flow$1961(initialValue443, initialValue441, initialValue444);
        java.lang.Object initialValue446 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue445))))));
        recovery$indy$flow$1963(this, initialValue446);
        java.lang.Object initialValue447 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingTargetESPs));
        byte converted448 = (byte) (constructorPart29);
        client.setting.ShaderOptions initialized449 = new client.setting.ShaderOptions(constructorPart27, constructorPart28, this, "Target", converted448, (client.setting.SettingGroup) (initialValue447));
        java.lang.Object initialValue450 = recovery$indy$flow$1967(this);
        java.lang.Object initialValue451 = initialValue450;
        long initialValue452 = constructorKey3;
        client.setting.ShaderOptions initialValue453 = initialized449;
        java.lang.Object initialValue454 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue453))))));
        java.lang.Object initialValue455 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue451))))));
        java.lang.Object initialValue456 = recovery$indy$flow$1970(initialValue454, initialValue452, initialValue455);
        java.lang.Object initialValue457 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue456))))));
        long initialValue458 = constructorKey33;
        java.lang.Object initialValue459 = initialValue457;
        java.lang.Object initialValue460 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue459))))));
        java.lang.Object initialValue461 = recovery$indy$flow$1973(initialValue460, initialValue458);
        recovery$indy$flow$1974(this, initialValue461);
        client.setting.SettingGroup initialized462 = new client.setting.SettingGroup(this, "PlayerESPs", constructorKey13);
        java.lang.Object initialValue463 = recovery$indy$flow$1977(this);
        char converted464 = (char) (constructorPart31);
        java.lang.Object initialValue465 = initialValue463;
        int initialValue466 = constructorPart32;
        int initialValue467 = (int) (converted464);
        int initialValue468 = constructorPart30;
        client.setting.SettingGroup initialValue469 = initialized462;
        java.lang.Object initialValue470 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue469))))));
        java.lang.Object initialValue471 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue465))))));
        java.lang.Object initialValue472 = recovery$indy$flow$1980(initialValue470, initialValue468, (char) (initialValue467), initialValue466, initialValue471);
        recovery$indy$flow$1981(this, initialValue472);
        java.lang.Object initialValue473 = recovery$indy$flow$1983(4);
        ((java.lang.Object[]) initialValue473)[0] = "None";
        ((java.lang.Object[]) initialValue473)[1] = "Classic";
        ((java.lang.Object[]) initialValue473)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue473)[3] = "PlayerModelArmor";
        java.lang.Object initialValue474 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ModeSetting initialized475 = new client.setting.ModeSetting(this, "PlayerESP", "Classic", (java.lang.String[]) (initialValue473), (client.setting.SettingGroup) (initialValue474), constructorKey18);
        recovery$indy$flow$1986(this, initialized475);
        short converted476 = (short) (constructorPart23);
        char converted477 = (char) (constructorPart24);
        java.lang.Object initialValue478 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.BooleanSetting initialized479 = new client.setting.BooleanSetting(this, "OnlyInThirdPerson", converted476, converted477, constructorPart25, true, (client.setting.SettingGroup) (initialValue478));
        recovery$indy$flow$1990(this, initialized479);
        java.awt.Color initialized480 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue481 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ColorSetting initialized482 = new client.setting.ColorSetting(this, "ClassicColorMe", constructorKey10, initialized480, (client.setting.SettingGroup) (initialValue481));
        long initialValue483 = constructorKey12;
        java.lang.String initialValue484 = "ClassicColor";
        client.setting.ColorSetting initialValue485 = initialized482;
        java.lang.Object initialValue486 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue485))))));
        java.lang.Object initialValue487 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue484))))));
        java.lang.Object initialValue488 = recovery$indy$flow$1998(initialValue486, initialValue487, initialValue483);
        java.lang.Object initialValue489 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue488))))));
        java.lang.Object initialValue490 = recovery$indy$flow$2000(this);
        java.lang.Object initialValue491 = initialValue490;
        long initialValue492 = constructorKey3;
        java.lang.Object initialValue493 = initialValue489;
        java.lang.Object initialValue494 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue493))))));
        java.lang.Object initialValue495 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue491))))));
        java.lang.Object initialValue496 = recovery$indy$flow$2003(initialValue494, initialValue492, initialValue495);
        java.lang.Object initialValue497 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue496))))));
        recovery$indy$flow$2005(this, initialValue497);
        java.lang.Object initialValue498 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.NumberSetting initialized499 = new client.setting.NumberSetting(this, "LineWidthMe", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue498), constructorKey35);
        short converted500 = (short) (constructorPart6);
        int initialValue501 = (int) (converted500);
        int initialValue502 = constructorPart5;
        java.lang.String initialValue503 = "LineWidth";
        int initialValue504 = constructorPart4;
        client.setting.NumberSetting initialValue505 = initialized499;
        java.lang.Object initialValue506 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue505))))));
        java.lang.Object initialValue507 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue503))))));
        java.lang.Object initialValue508 = recovery$indy$flow$2011(initialValue506, initialValue504, initialValue507, initialValue502, (short) (initialValue501));
        java.lang.Object initialValue509 = recovery$indy$flow$2012(this);
        java.lang.Object initialValue510 = initialValue509;
        java.lang.Object initialValue511 = initialValue508;
        java.lang.Object initialValue512 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue511))))));
        java.lang.Object initialValue513 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue510))))));
        java.lang.Object initialValue514 = recovery$indy$flow$2015(initialValue512, initialValue513);
        recovery$indy$flow$2016(this, initialValue514);
        java.lang.Object initialValue515 = ((java.lang.Object)(((augustus.recovered.modules.latency.BackTrack_47Ca) (((java.lang.Object)(this)))).settingPlayerESPs));
        byte converted516 = (byte) (constructorPart29);
        client.setting.ShaderOptions initialized517 = new client.setting.ShaderOptions(constructorPart27, constructorPart28, this, "Player", converted516, (client.setting.SettingGroup) (initialValue515));
        java.lang.Object initialValue518 = recovery$indy$flow$2020(this);
        java.lang.Object initialValue519 = initialValue518;
        long initialValue520 = constructorKey3;
        client.setting.ShaderOptions initialValue521 = initialized517;
        java.lang.Object initialValue522 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue521))))));
        java.lang.Object initialValue523 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue519))))));
        java.lang.Object initialValue524 = recovery$indy$flow$2023(initialValue522, initialValue520, initialValue523);
        java.lang.Object initialValue525 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue524))))));
        long initialValue526 = constructorKey33;
        java.lang.Object initialValue527 = initialValue525;
        java.lang.Object initialValue528 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue527))))));
        java.lang.Object initialValue529 = recovery$indy$flow$2026(initialValue528, initialValue526);
        recovery$indy$flow$2027(this, initialValue529);
        recovery$indy$flow$2028(this, null);
        recovery$indy$flow$2029(this, false);
        recovery$indy$flow$2030(this, false);
        recovery$indy$flow$2031(this, false);
        recovery$indy$flow$2032(this, false);
        net.C_47cu initialized530 = new net.C_47cu();
        recovery$indy$flow$2035(this, initialized530);
        net.C_47cu initialized531 = new net.C_47cu();
        recovery$indy$flow$2038(this, initialized531);
        double[] values532 = new double[3];
        recovery$indy$flow$2039(this, values532);
        net.C_47cu initialized533 = new net.C_47cu();
        recovery$indy$flow$2042(this, initialized533);
        recovery$indy$flow$2043(this, 0);
        recovery$indy$flow$2044(this, 0);
        recovery$indy$flow$2045(this, false);
        recovery$indy$flow$2046(this, false);
        recovery$indy$flow$2047(this, false);
        recovery$indy$flow$2048(this, 0);
        recovery$indy$flow$2049(this, true);
        recovery$indy$flow$2050(this, false);
        recovery$indy$flow$2051(this, true);
        recovery$indy$flow$2052(this, false);
        if (initialValue54 == null) {
            return;
        } else {
            java.lang.Object initialValue534 = recovery$indy$flow$2053(2);
            java.lang.Object initialValue535 = initialValue534;
            java.lang.Object initialValue536 = recovery$indy$flow$2054(initialValue535);
            recovery$indy$flow$2055(initialValue536);
            return;
        }
    }


















    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native int recovery$indy$flow$252(long a0,long a1,long a2);
    private static native int recovery$indy$flow$404(long a0,long a1,long a2);


    private static native java.lang.Object recovery$indy$flow$445(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$446();

    private static java.lang.Object recovery$indy$flow$454() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$457(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$460(java.lang.Object a0);
    private static native boolean recovery$indy$flow$461(java.lang.Object a0,java.lang.Object a1);



    private static native boolean recovery$indy$flow$465(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native boolean recovery$indy$flow$468(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$471(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$472(boolean a0,boolean a1,long a2);

    private static native java.lang.Object recovery$indy$flow$474(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$475(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);

    private static native void recovery$indy$flow$477(boolean a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$478() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$481(java.lang.Object a0,long a1);



    private static native java.lang.Object recovery$indy$flow$485(java.lang.Object a0);
    private static native boolean recovery$indy$flow$486(java.lang.Object a0,java.lang.Object a1);



    private static native boolean recovery$indy$flow$490(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native boolean recovery$indy$flow$493(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$496(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$497(boolean a0,boolean a1,long a2);

    private static native java.lang.Object recovery$indy$flow$499(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$500(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);

    private static native void recovery$indy$flow$502(boolean a0,long a1,java.lang.Object a2);

    private static java.lang.Object recovery$indy$flow$504() {
        return augustus.recovered.modules.latency.BackTrack_47Ca.field_43;
    }


    private static java.lang.Object recovery$indy$flow$507() {
        return augustus.recovered.modules.latency.BackTrack_47Ca.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$511(java.lang.Object a0);
    private static native boolean recovery$indy$flow$512(java.lang.Object a0,java.lang.Object a1);



    private static native boolean recovery$indy$flow$516(java.lang.Object a0,java.lang.Object a1,long a2);
    private static java.lang.Object recovery$indy$flow$517() {
        return augustus.recovered.modules.latency.BackTrack_47Ca.field_43;
    }


    private static int recovery$indy$flow$520(java.lang.Object a0) {
        return ((net.C_47oo) (a0)).field_44S;
    }


    private static native boolean recovery$indy$flow$523(java.lang.Object a0);


    private static native boolean recovery$indy$flow$526(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$529(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$530(boolean a0,boolean a1,long a2);

    private static native java.lang.Object recovery$indy$flow$532(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$533(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);

    private static native void recovery$indy$flow$535(boolean a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$909();

    private static native void recovery$indy$flow$911();


    private static native java.lang.Object recovery$indy$flow$914(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$915(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native java.lang.Object recovery$indy$flow$918(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$919(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native java.lang.Object recovery$indy$flow$922(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$923(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$924() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$927(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$930(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$931(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native java.lang.Object recovery$indy$flow$934(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$935(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$936() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$939(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$942(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$943(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native boolean recovery$indy$flow$946(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$949(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$950(boolean a0,boolean a1,long a2);
    private static native java.lang.Object recovery$indy$flow$951(java.lang.Object a0);

    private static native void recovery$indy$flow$953(boolean a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$956(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$957(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$958() {
        return augustus.recovered.modules.latency.BackTrack_47Ca.field_43;
    }


    private static java.lang.Object recovery$indy$flow$961() {
        return augustus.recovered.modules.latency.BackTrack_47Ca.field_43;
    }


    private static int recovery$indy$flow$964(java.lang.Object a0) {
        return ((net.C_47oo) (a0)).field_44S;
    }


    private static native boolean recovery$indy$flow$967(java.lang.Object a0);


    private static native boolean recovery$indy$flow$970(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$973(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$974(boolean a0,boolean a1,long a2);
    private static native java.lang.Object recovery$indy$flow$975(java.lang.Object a0);

    private static native void recovery$indy$flow$977(boolean a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$978();
    private static native java.lang.Object recovery$indy$flow$1630(int a0);
    private static native void recovery$indy$flow$1632(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1633();



    private static native java.lang.Object recovery$indy$flow$1639(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);

    private static native java.lang.Object recovery$indy$flow$1641(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1642(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1645(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1648(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1652(java.lang.Object a0,long a1);



    private static native java.lang.Object recovery$indy$flow$1656(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1657(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1660(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1661(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1664(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1667(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1669(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1674(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1676(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1679(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1681(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1687(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1688(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1691(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$1692(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1696(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1699(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1700(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1703(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1704(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1709(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1711(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1714(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1716(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1719(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1722(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1724(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1727(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1730(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1732(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1735(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1738(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1740(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1743(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1746(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1747(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1750(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1753(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1754(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1756(int a0);
    private static native java.lang.Object recovery$indy$flow$1758(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1761(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1762(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1767(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1769(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1772(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1774(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1779(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1780(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1783(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1784(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1788(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1789(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1792(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1793(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1798(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1799(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1802(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1803(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1808(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1810(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1813(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1815(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1820(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1822(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1825(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1827(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1830(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1833(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1835(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1838(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1841(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1842(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1844(int a0);
    private static native java.lang.Object recovery$indy$flow$1846(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1849(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1850(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1853(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1856(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1857(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1860(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1863(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1865(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1868(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1871(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1872(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1875(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1878(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1880(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1884(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1885(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1888(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1889(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1892(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1893(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1896(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1899(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1902(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1904();
    private static native java.lang.Object recovery$indy$flow$1906(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1909(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1910(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1913(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1916(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1917(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1920(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1923(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1925(int a0);

    private static native void recovery$indy$flow$1928(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1936(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1938(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1941(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1943(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1949(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1950(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1953(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1954(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1958(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1961(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1963(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1967(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1970(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1973(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1974(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1977(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1980(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1981(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1983(int a0);

    private static native void recovery$indy$flow$1986(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1990(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1998(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$2000(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2003(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2005(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2011(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2012(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2015(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2016(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2020(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2023(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$2026(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$2027(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2028(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_49 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$2029(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$2030(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$2031(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$2032(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47F = a1;
        return;
    }
    private static native void recovery$indy$flow$2035(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2038(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2039(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2042(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2043(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$2044(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$2045(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47m = a1;
        return;
    }
    private static void recovery$indy$flow$2046(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47r = a1;
        return;
    }
    private static void recovery$indy$flow$2047(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47M = a1;
        return;
    }
    private static void recovery$indy$flow$2048(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$2049(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47O = a1;
        return;
    }
    private static void recovery$indy$flow$2050(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_479 = a1;
        return;
    }
    private static void recovery$indy$flow$2051(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47W = a1;
        return;
    }
    private static void recovery$indy$flow$2052(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.BackTrack_47Ca) (a0)).field_47h = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$2053(int a0);
    private static java.lang.Object recovery$indy$flow$2054(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$2055(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$6(long var0, long var2);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$9(Object var0, long var1, long var3);
   private static native String recovery$indy$10(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native double recovery$indy$12(Object var0, char var1, int var2, short var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native void recovery$indy$16(
      Object var0, Object var1, Object var2, long var3, double var5, double var7, double var9, boolean var11, long var12, long var14
   );
   private static native String recovery$indy$17(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$20(long var0, long var2);
   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$22(long var0, long var2);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$24(Object var0, long var1, long var3);
   private static native String recovery$indy$25(long var0, long var2);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$27(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$28(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$29(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$30(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$31(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$32(Object var0, long var1, long var3);
   private static native void recovery$indy$33(
      Object var0, Object var1, Object var2, long var3, double var5, double var7, double var9, boolean var11, long var12, long var14
   );
   private static native String recovery$indy$34(long var0, long var2);
   private static native boolean recovery$indy$35(Object var0, long var1, long var3);
   private static native boolean recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3);
   private static native boolean recovery$indy$40(
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
   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native double recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$46(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$47(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$48(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$49(long var0, long var2, long var4);
   private static native boolean recovery$indy$50(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$51(Object var0, long var1, long var3);
   private static native boolean recovery$indy$52(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$53(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native boolean recovery$indy$55(Object var0, long var1, long var3);
   private static native boolean recovery$indy$56(long var0, long var2, long var4);
   private static native void recovery$indy$57(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$59(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$61(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$62(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$63(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native String recovery$indy$64(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$65(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$66(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$67(Object var0, Object var1, long var2, long var4);
   private static native C_478i recovery$indy$68(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_478i recovery$indy$69(Object var0, double var1, double var3, double var5, long var7, long var9);
   private static native C_47tf recovery$indy$70(long var0, Object var2, long var3, long var5);
   private static native C_47tf recovery$indy$71(long var0, Object var2, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$72(Object var0, long var1, long var3);
   private static native boolean recovery$indy$73(Object var0, short var1, long var2, boolean var4, Object var5, long var6, long var8);
   private static native boolean recovery$indy$74(Object var0, long var1, long var3);
   private static native int recovery$indy$75(long var0, long var2, long var4);
   private static native boolean recovery$indy$76(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$77(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$78(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$79(Object var0, double var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$80(Object var0, double var1, double var3, int var5, byte var6, int var7, long var8, long var10);
   private static native boolean recovery$indy$81(Object var0, long var1, Object var3, long var4, long var6);
   private static native int recovery$indy$82(Object var0, long var1, long var3);
   private static native double recovery$indy$83(Object var0, long var1, long var3);
   private static native String recovery$indy$84(long var0, long var2);
   private static native boolean recovery$indy$85(int var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$86(Object var0, long var1, long var3);
   private static native double recovery$indy$87(Object var0, long var1, long var3);
   private static native double recovery$indy$88(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$89(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$90(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$91(Object var0, long var1, long var3);
   private static native double recovery$indy$92(Object var0, long var1, long var3);
   private static native double recovery$indy$93(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$131();
}
