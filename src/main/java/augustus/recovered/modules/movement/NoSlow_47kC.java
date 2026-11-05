package augustus.recovered.modules.movement;
import augustus.recovered.modules.player.AirStuck_47Q4;
import augustus.recovered.modules.world.Scaffold_47Te;
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
import net.C_40X;
import net.C_40x;
import net.C_41Q;
import net.C_42V;
import net.C_43J;
import net.C_43r;
import net.C_43u;
import net.C_43y;
import net.C_43z;
import net.C_452;
import net.C_45J;
import net.C_45V;
import net.C_45n;
import net.C_4713;
import net.C_472n;
import net.C_473U;
import net.C_474i;
import net.C_475c;
import net.C_476q;
import net.C_4776;
import net.C_477Y;
import net.C_477z;
import net.C_478Q;
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47G2;
import net.C_47I9;
import net.C_47JT;
import net.C_47K7;
import net.C_47MN;
import net.C_47MO;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UA;
import net.C_47UH;
import net.C_47Vc;
import net.C_47cu;
import net.C_47hi;
import net.C_47iC;
import net.C_47jt;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47si;
import client.module.Category;
import net.C_47tz;
import net.C_47x6;
import net.C_47xz;
import net.C_47zh;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class NoSlow_47kC extends client.module.Module implements net.C_47UH,net.C_47hi,net.C_452,net.C_47Vc,net.C_41Q,net.C_47iC,net.C_47si,net.C_47JT,net.C_47mz,net.C_47xz {
    public final client.setting.BooleanSetting settingOnlyWhileMove = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStartSlow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingEnableIntervals = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwitchOnlyEmptySlot = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwitchGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSwitchMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSlotMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSpamMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingSword = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingSword2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSwordSlowdownInterval = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordSlowdownIntervalAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordSlowdownIntervalGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerSword = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordSneakForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordSneakStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwordNullItem = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwordEditFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSwordEnumFacingID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwordCustomBlockPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomBlockPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomBlockPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomBlockPosZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSwordCustomFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomFacingX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomFacingY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingSwordCustomFacingZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingBow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingBow2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingBowSlowdownInterval = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowSlowdownIntervalAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowSlowdownIntervalGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerBow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowSneakForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowSneakStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBowNullItem = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBowEditFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBowEnumFacingID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBowCustomBlockPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomBlockPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomBlockPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomBlockPosZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBowCustomFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomFacingX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomFacingY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingBowCustomFacingZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingRest = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingRest2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingRestSlowdownInterval = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestSlowdownIntervalAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestSlowdownIntervalGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerRest = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestSneakForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestSneakStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRestNullItem = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRestEditFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRestEnumFacingID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRestCustomBlockPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomBlockPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomBlockPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomBlockPosZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRestCustomFacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomFacingX = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomFacingY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingRestCustomFacingZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputForwardLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingInputForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputStrafeLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingInputStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputJumpLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputSneakLegit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInputSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_42k = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47rf field_40k; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_40E; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_42Z; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_403; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_40f; // Runtime access flags and ConstantValue are restored from the original class.
    boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native void b();

    private static native java.lang.reflect.Method h(long a0,long a1);

   public void method_46$a05d3e9ac3(C_4776 var1, long var2) {
      boolean var171;
      int var4 = (int)((var2 ^ 5729119255195L) >>> 32);
      long var5 = (var2 ^ 5729119255195L) << 32 >>> 32;
      long var7 = var2 ^ 56490151940354L;
      long var10001 = var2 ^ 84958035663253L;
      int var9 = (int)((var2 ^ 84958035663253L) >>> 32);
      int var10 = (int)((var2 ^ 84958035663253L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = (var2 ^ 4058919117501L) >>> 16;
      int var14 = (int)((var2 ^ 4058919117501L) << 48 >>> 48);
      long var15 = var2 ^ 14753685592718L;
      long var17 = var2 ^ 16516651686028L;
      long var19 = var2 ^ 88711271053220L;
      var10001 = var2 ^ 138395613439958L;
      int var21 = (int)((var2 ^ 138395613439958L) >>> 32);
      int var22 = (int)((var2 ^ 138395613439958L) << 32 >>> 48);
      int var23 = (int)(var10001 << 48 >>> 48);
      long var10000 = -2488467572623260975L;
      boolean var24 = Fly_47kE.method_49t$aae029aa0a();
      long var10003 = -2494246944681743140L;
      long var27 = var5;
      int var29 = var4;
      NoSlow_47kC var30 = this;
      C_47rf var25 = var30.method_41$9c52b54a6d(var29, var27);
      var10003 = -2488300974858677662L;
      long var31 = var19;
      C_47rf var33 = var25;
      NoSlow_47kC var34 = this;
      boolean var149 = var34.method_46$54e912928c(var33, var31);
      if (!var24) {
         if (var149) {
            var10001 = -2492488326045639973L;
            C_47cu var35 = this.field_42k;
            var35.method_46$da8c82d5d4();
            return;
         }

         var10003 = -2491046227758984239L;
         long var36 = var15;
         long var38 = 400L;
         C_47cu var40 = this.field_42k;
         var149 = var40.method_42$b0e346e6e3(var38, var36);
      }

      label328: {
         if (!var24) {
            if (var149) {
               break label328;
            }

            var10001 = -2491895992674834562L;
            BooleanSetting var41 = this.settingStartSlow;
            var149 = var41.method_49$aae029aa0a();
         }

         if (var149) {
            return;
         }
      }

      C_43r var26 = var25.method_48$dbd570a038();
      long var10002 = -2494531643761235010L;
      C_43r var42 = var26;
      NoSlow_47kC var43 = this;
      int var150 = (int) ((var43.method_45$d654fe8697(var42)) ? 1 : 0);
      boolean var155 = var24;
      if (var2 >= 0L) {
         if (!var24) {
            if (var150 != 0) {
               var10002 = -2492110024721240462L;
               long var44 = var17;
               ModeSetting var46 = this.settingMode;
               int var151 = (int) ((var46.method_46$5f9dc63072(var44).equals(recovery$indy$1(20781, 3989552767246481605L ^ var2))) ? 1 : 0);
               boolean var156 = var24;
               if (var2 >= 0L) {
                  if (!var24) {
                     if (var151 != 0) {
                        var10002 = -2492558304880342917L;
                        C_47x6 var47 = C_47x6.SPRINT;
                        boolean var157 = var47.method_43$aae029aa0a();
                        var10002 = -2488676984557796930L;
                        boolean var48 = var157;
                        C_4776 var49 = var1;
                        var49.method_43$f633c984d8(var48);
                     }

                     var10001 = -2492558304880342917L;
                     C_47x6 var50 = C_47x6.SLOWDOWN;
                     var151 = (int) ((var50.method_43$aae029aa0a()) ? 1 : 0);
                  }

                  var156 = var24;
               }

               if (var2 >= 0L) {
                  if (!var156) {
                     if (var151 == 0) {
                        return;
                     }

                     char var10005 = (char)var14;
                     long var10006 = -2491979421789272956L;
                     char var51 = var10005;
                     NumberSetting var52 = this.settingSwordSlowdownIntervalGround;
                     long var53 = var12;
                     NumberSetting var55 = this.settingSwordSlowdownIntervalAir;
                     ModeSetting var56 = this.settingSwordSlowdownInterval;
                     NoSlow_47kC var57 = this;
                     var151 = (int) ((var57.method_40$3a90a9f73e(var56, var55, var53, var52, var51)) ? 1 : 0);
                  }

                  var156 = var24;
               }

               if (var2 > 0L) {
                  if (!var156) {
                     if (var151 == 0) {
                        return;
                     }

                     var10001 = -2491895992674834562L;
                     BooleanSetting var58 = this.settingSwitchOnlyEmptySlot;
                     var151 = (int) ((var58.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var156 = var24;
               }

               label335: {
                  if (var2 >= 0L) {
                     if (!var156) {
                        if (var151 == 0) {
                           break label335;
                        }

                        var10001 = -2492558304880342917L;
                        C_47x6 var59 = C_47x6.SWITCH;
                        var151 = (int) ((var59.method_43$aae029aa0a()) ? 1 : 0);
                     }

                     var156 = var24;
                  }

                  if (!var156) {
                     if (var151 == 0) {
                        break label335;
                     }

                     var10002 = -2494179538689379261L;
                     Minecraft var60 = field_43;
                     short var201 = (short)var22;
                     char var10004 = (char)var23;
                     long var213 = -2488602102272507500L;
                     char var61 = var10004;
                     short var62 = var201;
                     int var63 = var21;
                     int var64 = var60.field_42P.field_42X.field_42;
                     NoSlow_47kC var65 = this;
                     var151 = var65.method_43$4397a0fda1(var64, var63, var62, var61);
                  }

                  if (var151 < 0) {
                     return;
                  }
               }

               var10003 = -2491784173794304029L;
               long var66 = var7;
               NumberSetting var68 = this.settingSwordForward;
               float var161 = (float)var68.method_44$474dfaa627(var66);
               var10002 = -2491587674365678124L;
               float var69 = var161;
               C_4776 var70 = var1;
               var70.method_43$24a796ab4c(var69);
               var10003 = -2491784173794304029L;
               long var71 = var7;
               NumberSetting var73 = this.settingSwordStrafe;
               float var162 = (float)var73.method_44$474dfaa627(var71);
               var10002 = -2491327957545461473L;
               float var74 = var162;
               C_4776 var75 = var1;
               var75.method_40$24a796ab4c(var74);
               if (!var24) {
                  return;
               }
            }

            var10002 = -2491234490256409970L;
            C_43r var76 = var26;
            NoSlow_47kC var77 = this;
            var150 = (int) ((var77.method_44$d654fe8697(var76)) ? 1 : 0);
         }

         var155 = var24;
      }

      if (var2 >= 0L) {
         if (!var155) {
            if (var150 != 0) {
               var10002 = -2492110024721240462L;
               long var78 = var17;
               ModeSetting var80 = this.settingMode;
               int var152 = (int) ((var80.method_46$5f9dc63072(var78).equals(recovery$indy$2(20781, 3989552767246481605L ^ var2))) ? 1 : 0);
               boolean var163 = var24;
               if (var2 > 0L) {
                  if (!var24) {
                     if (var152 != 0) {
                        var10002 = -2490790818903468276L;
                        C_47G2 var81 = C_47G2.SPRINT;
                        boolean var164 = var81.method_43$aae029aa0a();
                        var10002 = -2488676984557796930L;
                        boolean var82 = var164;
                        C_4776 var83 = var1;
                        var83.method_43$f633c984d8(var82);
                     }

                     var10001 = -2490790818903468276L;
                     C_47G2 var84 = C_47G2.SLOWDOWN;
                     var152 = (int) ((var84.method_43$aae029aa0a()) ? 1 : 0);
                  }

                  var163 = var24;
               }

               if (var2 >= 0L) {
                  if (!var163) {
                     if (var152 == 0) {
                        return;
                     }

                     char var214 = (char)var14;
                     long var219 = -2491979421789272956L;
                     char var85 = var214;
                     NumberSetting var86 = this.settingBowSlowdownIntervalGround;
                     long var87 = var12;
                     NumberSetting var89 = this.settingBowSlowdownIntervalAir;
                     ModeSetting var90 = this.settingBowSlowdownInterval;
                     NoSlow_47kC var91 = this;
                     var152 = (int) ((var91.method_40$3a90a9f73e(var90, var89, var87, var86, var85)) ? 1 : 0);
                  }

                  var163 = var24;
               }

               if (var2 >= 0L) {
                  if (!var163) {
                     if (var152 == 0) {
                        return;
                     }

                     var10001 = -2491895992674834562L;
                     BooleanSetting var92 = this.settingSwitchOnlyEmptySlot;
                     var152 = (int) ((var92.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var163 = var24;
               }

               label338: {
                  if (var2 > 0L) {
                     if (!var163) {
                        if (var152 == 0) {
                           break label338;
                        }

                        var10001 = -2490790818903468276L;
                        C_47G2 var93 = C_47G2.SWITCH;
                        var152 = (int) ((var93.method_43$aae029aa0a()) ? 1 : 0);
                     }

                     var163 = var24;
                  }

                  if (!var163) {
                     if (var152 == 0) {
                        break label338;
                     }

                     var10002 = -2494179538689379261L;
                     Minecraft var94 = field_43;
                     short var204 = (short)var22;
                     char var211 = (char)var23;
                     long var215 = -2488602102272507500L;
                     char var95 = var211;
                     short var96 = var204;
                     int var97 = var21;
                     int var98 = var94.field_42P.field_42X.field_42;
                     NoSlow_47kC var99 = this;
                     var152 = var99.method_43$4397a0fda1(var98, var97, var96, var95);
                  }

                  if (var152 < 0) {
                     return;
                  }
               }

               var10003 = -2491784173794304029L;
               long var100 = var7;
               NumberSetting var102 = this.settingBowForward;
               float var168 = (float)var102.method_44$474dfaa627(var100);
               var10002 = -2491587674365678124L;
               float var103 = var168;
               C_4776 var104 = var1;
               var104.method_43$24a796ab4c(var103);
               var10003 = -2491784173794304029L;
               long var105 = var7;
               NumberSetting var107 = this.settingBowStrafe;
               float var169 = (float)var107.method_44$474dfaa627(var105);
               var10002 = -2491327957545461473L;
               float var108 = var169;
               C_4776 var109 = var1;
               var109.method_40$24a796ab4c(var108);
               if (!var24) {
                  return;
               }
            }

            short var207 = (short)var11;
            long var216 = -2491930599894521526L;
            C_43r var110 = var26;
            short var111 = var207;
            int var112 = var10;
            int var113 = var9;
            NoSlow_47kC var114 = this;
            var150 = (int) ((var114.method_41$2610240745(var113, var112, var111, var110)) ? 1 : 0);
         }

         var155 = var24;
      }

      if (var2 > 0L) {
         if (!var155) {
            if (var150 == 0) {
               return;
            }

            var10001 = -2492244882535062915L;
            C_47I9 var115 = C_47I9.UN_TOGGLE;
            var150 = (int) ((var115.method_43$aae029aa0a()) ? 1 : 0);
         }

         var155 = var24;
      }

      label242: {
         label241:
         if (!var155) {
            if (var150 != 0) {
               var150 = (int) ((this.field_43P) ? 1 : 0);
               var171 = var24;
               if (var2 < 0L) {
                  break label242;
               }

               if (var24) {
                  break label241;
               }

               if (this.field_43P) {
                  var10001 = -2494179538689379261L;
                  Minecraft var116 = field_43;
                  var116.field_42P.field_49m.method_45$631790539f(new C_45J(C_40x.RELEASE_USE_ITEM, C_478Q.field_44, C_484.UP));
                  this.field_43P = false;
               }
            }

            var10002 = -2492110024721240462L;
            long var117 = var17;
            ModeSetting var119 = this.settingMode;
            var150 = (int) ((var119.method_46$5f9dc63072(var117).equals(recovery$indy$3(20781, 3989552767246481605L ^ var2))) ? 1 : 0);
         }

         var171 = var24;
      }

      if (var2 > 0L) {
         if (!var171) {
            if (var150 != 0) {
               var10002 = -2492244882535062915L;
               C_47I9 var120 = C_47I9.SPRINT;
               boolean var173 = var120.method_43$aae029aa0a();
               var10002 = -2488676984557796930L;
               boolean var121 = var173;
               C_4776 var122 = var1;
               var122.method_43$f633c984d8(var121);
            }

            var10001 = -2492244882535062915L;
            C_47I9 var123 = C_47I9.SLOWDOWN;
            var150 = (int) ((var123.method_43$aae029aa0a()) ? 1 : 0);
         }

         var171 = var24;
      }

      if (var2 >= 0L) {
         if (!var171) {
            if (var150 == 0) {
               return;
            }

            char var217 = (char)var14;
            long var220 = -2491979421789272956L;
            char var124 = var217;
            NumberSetting var125 = this.settingRestSlowdownIntervalGround;
            long var126 = var12;
            NumberSetting var128 = this.settingRestSlowdownIntervalAir;
            ModeSetting var129 = this.settingRestSlowdownInterval;
            NoSlow_47kC var130 = this;
            var150 = (int) ((var130.method_40$3a90a9f73e(var129, var128, var126, var125, var124)) ? 1 : 0);
         }

         var171 = var24;
      }

      if (var2 >= 0L) {
         if (!var171) {
            if (var150 == 0) {
               return;
            }

            var10001 = -2491895992674834562L;
            BooleanSetting var131 = this.settingSwitchOnlyEmptySlot;
            var150 = (int) ((var131.method_49$aae029aa0a()) ? 1 : 0);
         }

         var171 = var24;
      }

      label340: {
         if (var2 > 0L) {
            if (!var171) {
               if (var150 == 0) {
                  break label340;
               }

               var10001 = -2492244882535062915L;
               C_47I9 var132 = C_47I9.SWITCH;
               var150 = (int) ((var132.method_43$aae029aa0a()) ? 1 : 0);
            }

            var171 = var24;
         }

         if (!var171) {
            if (var150 == 0) {
               break label340;
            }

            var10002 = -2494179538689379261L;
            Minecraft var133 = field_43;
            short var208 = (short)var22;
            char var212 = (char)var23;
            long var218 = -2488602102272507500L;
            char var134 = var212;
            short var135 = var208;
            int var136 = var21;
            int var137 = var133.field_42P.field_42X.field_42;
            NoSlow_47kC var138 = this;
            var150 = var138.method_43$4397a0fda1(var137, var136, var135, var134);
         }

         if (var150 < 0) {
            return;
         }
      }

      var10003 = -2491784173794304029L;
      long var139 = var7;
      NumberSetting var141 = this.settingRestForward;
      float var177 = (float)var141.method_44$474dfaa627(var139);
      var10002 = -2491587674365678124L;
      float var142 = var177;
      C_4776 var143 = var1;
      var143.method_43$24a796ab4c(var142);
      var10003 = -2491784173794304029L;
      long var144 = var7;
      NumberSetting var146 = this.settingRestStrafe;
      float var178 = (float)var146.method_44$474dfaa627(var144);
      var10002 = -2491327957545461473L;
      float var147 = var178;
      C_4776 var148 = var1;
      var148.method_40$24a796ab4c(var147);
   }











   private boolean method_46$54e912928c(C_47rf var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 30166705439160L;
      return recovery$indy$4(this, var1, var4, true, -3370170939631572197L, var2);
   }



   public void method_46$908df054f5(long var1, C_47tz var3) {
      boolean var65;
      boolean var67;
      boolean var69;
      int var4 = (int)((var1 ^ 55671125421061L) >>> 32);
      long var5 = (var1 ^ 55671125421061L) << 32 >>> 32;
      long var10001 = var1 ^ 135037231091467L;
      int var7 = (int)((var1 ^ 135037231091467L) >>> 32);
      int var8 = (int)((var1 ^ 135037231091467L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 64867017542672L;
      long var12 = var1 ^ 62197813317138L;
      long var14 = var1 ^ 139677873985847L;
      long var16 = var1 ^ 51845225735838L;
      long var18 = var1 ^ 113501632061754L;
      long var10000 = 5470059299430581431L;
      boolean var20 = Fly_47kE.method_48$aae029aa0a();
      long var10003 = 5475409621405252162L;
      long var23 = var5;
      int var25 = var4;
      NoSlow_47kC var26 = this;
      C_47rf var21 = var26.method_41$9c52b54a6d(var25, var23);
      var10003 = 5470168094946346236L;
      long var27 = var18;
      C_47rf var29 = var21;
      NoSlow_47kC var30 = this;
      boolean var61 = var30.method_46$54e912928c(var29, var27);
      if (var20) {
         if (var61) {
            var10001 = 5473791673819745349L;
            C_47cu var31 = this.field_42k;
            var31.method_46$da8c82d5d4();
            return;
         }

         var10003 = 5471927644262024527L;
         long var32 = var10;
         long var34 = 400L;
         C_47cu var36 = this.field_42k;
         var61 = var36.method_42$b0e346e6e3(var34, var32);
      }

      label147: {
         if (var20) {
            if (var61) {
               break label147;
            }

            var10001 = 5473340673738158560L;
            BooleanSetting var37 = this.settingStartSlow;
            var61 = var37.method_49$aae029aa0a();
         }

         if (var61) {
            return;
         }
      }

      C_43r var22 = var21.method_48$dbd570a038();
      boolean var62 = recovery$indy$5(var16, 5475970635237415718L, var1);
      boolean var64 = var20;
      if (var1 > 0L) {
         if (var20) {
            if (!var62) {
               return;
            }

            long var10002 = 5473009029115902188L;
            long var38 = var12;
            ModeSetting var40 = this.settingMode;
            var62 = var40.method_46$5f9dc63072(var38).equals("AllDirectionMotion");
         }

         var64 = var20;
      }

      label133: {
         label132:
         if (var64) {
            if (!var62) {
               long var72 = 5473009029115902188L;
               long var41 = var12;
               ModeSetting var43 = this.settingMode;
               var62 = var43.method_46$5f9dc63072(var41).equals("LegitMotion");
               var65 = var20;
               if (var1 > 0L) {
                  if (var20) {
                     if (!var62) {
                        return;
                     }

                     var72 = 5473628616782740827L;
                     long var44 = var14;
                     NoSlow_47kC var46 = this;
                     var62 = var46.method_43K$0dd78e0064(var44);
                  }

                  var65 = var20;
               }

               if (var1 <= 0L) {
                  break label133;
               }

               if (!var65) {
                  break label132;
               }

               if (!var62) {
                  return;
               }
            }

            long var74 = 5476257557261221152L;
            C_43r var47 = var22;
            NoSlow_47kC var48 = this;
            var62 = var48.method_45$d654fe8697(var47);
         }

         var65 = var20;
      }

      label153: {
         label113: {
            label112:
            if (var65) {
               if (var62) {
                  var10001 = 5473721798855089893L;
                  C_47x6 var49 = C_47x6.SPRINT;
                  var62 = var49.method_43$aae029aa0a();
                  var67 = var20;
                  if (var1 <= 0L) {
                     break label113;
                  }

                  if (!var20) {
                     break label112;
                  }

                  if (var62) {
                     break label153;
                  }
               }

               long var75 = 5472837794250959888L;
               C_43r var50 = var22;
               NoSlow_47kC var51 = this;
               var62 = var51.method_44$d654fe8697(var50);
            }

            var67 = var20;
         }

         label100: {
            label99:
            if (var67) {
               if (var62) {
                  var10001 = 5472112581358240146L;
                  C_47G2 var52 = C_47G2.SPRINT;
                  var62 = var52.method_43$aae029aa0a();
                  var69 = var20;
                  if (var1 <= 0L) {
                     break label100;
                  }

                  if (!var20) {
                     break label99;
                  }

                  if (var62) {
                     break label153;
                  }
               }

               short var79 = (short)var9;
               long var10005 = 5473234495285362644L;
               C_43r var53 = var22;
               short var54 = var79;
               int var55 = var8;
               int var56 = var7;
               NoSlow_47kC var57 = this;
               var62 = var57.method_41$2610240745(var56, var55, var54, var53);
            }

            var69 = var20;
         }

         if (var69) {
            if (!var62) {
               return;
            }

            var10001 = 5474112083145520355L;
            C_47I9 var58 = C_47I9.SPRINT;
            var62 = var58.method_43$aae029aa0a();
         }

         if (!var62) {
            return;
         }
      }

      long var76 = 5474757354269581974L;
      boolean var59 = true;
      C_47tz var60 = var3;
      var60.method_42$f633c984d8(var59);
   }






    private static native int e(long a0,long a1);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   public void method_41$fae8de1664(net.C_475c var1) {
        boolean var207;
      long var2 = a ^ 88151833172851L;
      long var4 = var2 ^ 127170560831195L;
      int var6 = (int)((var2 ^ 33146782762855L) >>> 32);
      long var7 = (var2 ^ 33146782762855L) << 32 >>> 32;
      long var10001 = var2 ^ 94921623151721L;
      int var9 = (int)((var2 ^ 94921623151721L) >>> 32);
      int var10 = (int)((var2 ^ 94921623151721L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 22084335986032L;
      long var14 = var2 ^ 83282903698008L;
      var10001 = var2 ^ 113038192073258L;
      int var16 = (int)((var2 ^ 113038192073258L) >>> 32);
      int var17 = (int)((var2 ^ 113038192073258L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6878345743999025363L;
      boolean var19 = Fly_47kE.method_49t$aae029aa0a();
      long var10003 = -6872848663047286496L;
      long var23 = var7;
      int var25 = var6;
      NoSlow_47kC var26 = this;
      net.C_47rf var20 = var26.method_41$9c52b54a6d(var25, var23);
      if (var19) {
         this.field_437 = 0;
      } else {
         var10003 = -6878161692021084258L;
         long var27 = var14;
         net.C_47rf var29 = var20;
         NoSlow_47kC var30 = this;
         if (var30.method_46$54e912928c(var29, var27)) {
            this.field_437 = 0;
         } else {
            net.C_43r var21 = var20.method_48$dbd570a038();
            if (this.field_40k != null && !this.field_40k.equals(var20)) {
               this.field_437 = 0;
            }

            long var10002 = -6873126626141694398L;
            net.C_43r var31 = var21;
            NoSlow_47kC var32 = this;
            if (var32.method_45$d654fe8697(var31)) {
               var10001 = -6875663481811487353L;
               net.C_47x6 var33 = net.C_47x6.GRIM;
               if (var33.method_43$aae029aa0a()) {
                  var10001 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var34 = field_43;
                  var34.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, new net.C_478Q(0, 0, 0), net.C_484.DOWN));
                  var10001 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var35 = field_43;
                  long var10004 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var36 = field_43;
                  var35.field_42P.field_49m.method_45$631790539f(new net.C_477Y((var36.field_42P.field_42X.field_42 + 1) % 8));
                  var10001 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var37 = field_43;
                  var10004 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var38 = field_43;
                  var37.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var38.field_42P.field_42X.field_42));
                  var10001 = -6878428754089112604L;
                  net.minecraft.client.Minecraft var39 = field_43;
                  var10002 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var40 = field_43;
                  var39.field_44K.field_40 = var40.field_42P.field_42X.field_42;
               }

               var10001 = -6875663481811487353L;
               net.C_47x6 var41 = net.C_47x6.SWITCH;
               label289:
               if (var41.method_43$aae029aa0a()) {
                  var10002 = -6875267981293350002L;
                  long var42 = var12;
                  client.setting.ModeSetting var44 = this.settingSwitchMode;
                  if (!var44.method_46$5f9dc63072(var42).equals("PreAttack")) {
                     var10002 = -6875267981293350002L;
                     long var45 = var12;
                     client.setting.ModeSetting var47 = this.settingSwitchMode;
                     if (!var47.method_46$5f9dc63072(var45).equals("PrePostPosition")) {
                        break label289;
                     }
                  }

                  var10002 = -6872774519724488257L;
                  net.minecraft.client.Minecraft var48 = field_43;
                  short var239 = (short)var17;
                  char var244 = (char)var18;
                  long var10005 = -6878493604148822936L;
                  char var49 = var244;
                  short var50 = var239;
                  int var51 = var16;
                  int var52 = var48.field_42P.field_42X.field_42;
                  NoSlow_47kC var53 = this;
                  int var22 = var53.method_43$4397a0fda1(var52, var51, var50, var49);
                  if (var22 >= 0) {
                     var10002 = -6875267981293350002L;
                     long var54 = var12;
                     client.setting.ModeSetting var56 = this.settingSwitchMode;
                     if (var56.method_46$5f9dc63072(var54).equals("PreAttack")) {
                        var10001 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var57 = field_43;
                        var57.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var22));
                     }

                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var58 = field_43;
                     long var245 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var59 = field_43;
                     var58.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var59.field_42P.field_42X.field_42));
                     var10001 = -6878428754089112604L;
                     net.minecraft.client.Minecraft var60 = field_43;
                     var10002 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var61 = field_43;
                     var60.field_44K.field_40 = var61.field_42P.field_42X.field_42;
                  }
               }

               var10001 = -6875663481811487353L;
               net.C_47x6 var62 = net.C_47x6.SLOT;
               if (var62.method_43$aae029aa0a()) {
                  var10002 = -6875267981293350002L;
                  long var63 = var12;
                  client.setting.ModeSetting var65 = this.settingSlotMode;
                  if (var65.method_46$5f9dc63072(var63).equals("PreAttack")) {
                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var66 = field_43;
                     long var246 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var67 = field_43;
                     var66.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var67.field_42P.field_42X.field_42));
                  }
               }

               var10001 = -6875663481811487353L;
               net.C_47x6 var68 = net.C_47x6.SPAM;
               if (var68.method_43$aae029aa0a()) {
                  var10002 = -6875267981293350002L;
                  long var69 = var12;
                  client.setting.ModeSetting var71 = this.settingSpamMode;
                  if (var71.method_46$5f9dc63072(var69).equals("PreAttack")) {
                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var72 = field_43;
                     long var247 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var73 = field_43;
                     var72.field_42P.field_49m.method_45$631790539f(new net.C_42V(var73.field_42P.field_42X.method_46$ac4db64966()));
                  }
               }

               var10001 = -6875663481811487353L;
               net.C_47x6 var74 = net.C_47x6.BUG;
               if (var74.method_43$aae029aa0a()) {
                  var10002 = -6872937065589679841L;
                  boolean var75 = false;
                  net.C_475c var76 = var1;
                  var76.method_447$f633c984d8(var75);
                  if (this.field_437 != 1) {
                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var77 = field_43;
                     var77.field_42P.field_49m.method_43$631790539f(new net.C_47jt(net.C_4713.OPEN_INVENTORY_ACHIEVEMENT));
                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var78 = field_43;
                     var78.field_42P.method_47C$da8c82d5d4();
                     var10001 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var79 = field_43;
                     var79.field_42P.method_47a$da8c82d5d4();
                     var1.cancel();
                     this.field_437 = 1;
                  }
               }
            } else {
               var10002 = -6876644244627863694L;
               net.C_43r var80 = var21;
               NoSlow_47kC var81 = this;
               if (var81.method_44$d654fe8697(var80)) {
                  var10001 = -6876163329738659088L;
                  net.C_47G2 var82 = net.C_47G2.SWITCH;
                  label282:
                  if (var82.method_43$aae029aa0a()) {
                     var10002 = -6875267981293350002L;
                     long var83 = var12;
                     client.setting.ModeSetting var85 = this.settingSwitchMode;
                     if (!var85.method_46$5f9dc63072(var83).equals("PreAttack")) {
                        var10002 = -6875267981293350002L;
                        long var86 = var12;
                        client.setting.ModeSetting var88 = this.settingSwitchMode;
                        if (!var88.method_46$5f9dc63072(var86).equals("PrePostPosition")) {
                           break label282;
                        }
                     }

                     var10002 = -6872774519724488257L;
                     net.minecraft.client.Minecraft var89 = field_43;
                     short var240 = (short)var17;
                     char var248 = (char)var18;
                     long var256 = -6878493604148822936L;
                     char var90 = var248;
                     short var91 = var240;
                     int var92 = var16;
                     int var93 = var89.field_42P.field_42X.field_42;
                     NoSlow_47kC var94 = this;
                     int var167 = var94.method_43$4397a0fda1(var93, var92, var91, var90);
                     if (var167 >= 0) {
                        var10002 = -6875267981293350002L;
                        long var95 = var12;
                        client.setting.ModeSetting var97 = this.settingSwitchMode;
                        if (var97.method_46$5f9dc63072(var95).equals("PreAttack")) {
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var98 = field_43;
                           var98.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var167));
                        }

                        var10001 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var99 = field_43;
                        long var249 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var100 = field_43;
                        var99.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var100.field_42P.field_42X.field_42));
                        var10001 = -6878428754089112604L;
                        net.minecraft.client.Minecraft var101 = field_43;
                        var10002 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var102 = field_43;
                        var101.field_44K.field_40 = var102.field_42P.field_42X.field_42;
                     }
                  }

                  var10001 = -6876163329738659088L;
                  net.C_47G2 var103 = net.C_47G2.SLOT;
                  if (var103.method_43$aae029aa0a()) {
                     var10002 = -6875267981293350002L;
                     long var104 = var12;
                     client.setting.ModeSetting var106 = this.settingSlotMode;
                     if (var106.method_46$5f9dc63072(var104).equals("PreAttack")) {
                        var10001 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var107 = field_43;
                        long var250 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var108 = field_43;
                        var107.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var108.field_42P.field_42X.field_42));
                     }
                  }

                  var10001 = -6876163329738659088L;
                  net.C_47G2 var109 = net.C_47G2.SPAM;
                  if (var109.method_43$aae029aa0a()) {
                     var10002 = -6875267981293350002L;
                     long var110 = var12;
                     client.setting.ModeSetting var112 = this.settingSpamMode;
                     if (var112.method_46$5f9dc63072(var110).equals("PreAttack")) {
                        var10001 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var113 = field_43;
                        long var251 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var114 = field_43;
                        var113.field_42P.field_49m.method_45$631790539f(new net.C_42V(var114.field_42P.field_42X.method_46$ac4db64966()));
                     }
                  }
               } else {
                  short var241 = (short)var11;
                  long var257 = -6875033719263718218L;
                  net.C_43r var115 = var21;
                  short var116 = var241;
                  int var117 = var10;
                  int var118 = var9;
                  NoSlow_47kC var119 = this;
                  if (var119.method_41$2610240745(var118, var117, var116, var115)) {
                     var10001 = -6875343602652930175L;
                     net.C_47I9 var120 = net.C_47I9.SWITCH;
                     label297:
                     if (var120.method_43$aae029aa0a()) {
                        var10002 = -6875267981293350002L;
                        long var121 = var12;
                        client.setting.ModeSetting var123 = this.settingSwitchMode;
                        if (!var123.method_46$5f9dc63072(var121).equals("PreAttack")) {
                           var10002 = -6875267981293350002L;
                           long var124 = var12;
                           client.setting.ModeSetting var126 = this.settingSwitchMode;
                           if (!var126.method_46$5f9dc63072(var124).equals("PrePostPosition")) {
                              break label297;
                           }
                        }

                        var10002 = -6872774519724488257L;
                        net.minecraft.client.Minecraft var127 = field_43;
                        short var242 = (short)var17;
                        char var252 = (char)var18;
                        var257 = -6878493604148822936L;
                        char var128 = var252;
                        short var129 = var242;
                        int var130 = var16;
                        int var131 = var127.field_42P.field_42X.field_42;
                        NoSlow_47kC var132 = this;
                        int var168 = var132.method_43$4397a0fda1(var131, var130, var129, var128);
                        if (var168 >= 0) {
                           var10002 = -6872555240416979726L;
                           long var133 = var4;
                           augustus.recovered.modules.world.Scaffold_47Te var135 = client.ClientGlobals.field_48.field_46q;
                           if (!var135.method_46$0dd78e0064(var133)) {
                              var10002 = -6875267981293350002L;
                              long var136 = var12;
                              client.setting.ModeSetting var138 = this.settingSwitchMode;
                              if (var138.method_46$5f9dc63072(var136).equals("PreAttack")) {
                                 var10001 = -6872774519724488257L;
                                 net.minecraft.client.Minecraft var139 = field_43;
                                 var139.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var168));
                              }

                              var10001 = -6872774519724488257L;
                              net.minecraft.client.Minecraft var140 = field_43;
                              long var253 = -6872774519724488257L;
                              net.minecraft.client.Minecraft var141 = field_43;
                              var140.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var141.field_42P.field_42X.field_42));
                              var10001 = -6878428754089112604L;
                              net.minecraft.client.Minecraft var142 = field_43;
                              var10002 = -6872774519724488257L;
                              net.minecraft.client.Minecraft var143 = field_43;
                              var142.field_44K.field_40 = var143.field_42P.field_42X.field_42;
                           }
                        }
                     }

                     var10001 = -6875343602652930175L;
                     net.C_47I9 var144 = net.C_47I9.SLOT;
                     if (var144.method_43$aae029aa0a()) {
                        var10002 = -6875267981293350002L;
                        long var145 = var12;
                        client.setting.ModeSetting var147 = this.settingSlotMode;
                        if (var147.method_46$5f9dc63072(var145).equals("PreAttack")) {
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var148 = field_43;
                           long var254 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var149 = field_43;
                           var148.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var149.field_42P.field_42X.field_42));
                        }
                     }

                     var10001 = -6875343602652930175L;
                     net.C_47I9 var150 = net.C_47I9.SPAM;
                     if (var150.method_43$aae029aa0a()) {
                        var10002 = -6875267981293350002L;
                        long var151 = var12;
                        client.setting.ModeSetting var153 = this.settingSpamMode;
                        if (var153.method_46$5f9dc63072(var151).equals("PreAttack")) {
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var154 = field_43;
                           long var255 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var155 = field_43;
                           var154.field_42P.field_49m.method_45$631790539f(new net.C_42V(var155.field_42P.field_42X.method_46$ac4db64966()));
                        }
                     }

                     var10001 = -6875343602652930175L;
                     net.C_47I9 var156 = net.C_47I9.BUG;
                     if (var156.method_43$aae029aa0a()) {
                        var10002 = -6872937065589679841L;
                        boolean var157 = false;
                        net.C_475c var158 = var1;
                        var158.method_447$f633c984d8(var157);
                        if (this.field_437 != 3) {
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var159 = field_43;
                           var159.field_42P.field_49m.method_43$631790539f(new net.C_47jt(net.C_4713.OPEN_INVENTORY_ACHIEVEMENT));
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var160 = field_43;
                           var160.field_42P.method_47C$da8c82d5d4();
                           var10001 = -6872774519724488257L;
                           net.minecraft.client.Minecraft var161 = field_43;
                           var161.field_42P.method_47a$da8c82d5d4();
                           var1.cancel();
                           this.field_437 = 3;
                        }
                     }
                  }
               }
            }

            if (var1.isCancelled()) {
               label274: {
                  var10002 = -6873375647593377700L;
                  net.minecraft.client.Minecraft var162 = field_43;
                  if (var162.field_44m == null) {
                     var10002 = -6878795287471282500L;
                     net.minecraft.client.Minecraft var163 = field_43;
                     if (var163.field_44r.field_44l.method_42$aae029aa0a()) {
                        var10002 = -6873519678418591006L;
                        net.minecraft.client.Minecraft var164 = field_43;
                        if (var164.field_42h) {
                           var207 = true;
                           break label274;
                        }
                     }
                  }

                  var207 = false;
               }

               var10002 = -6876323486130867452L;
               boolean var165 = var207;
               net.minecraft.client.Minecraft var166 = field_43;
               var166.method_47$f633c984d8(var165);
            }

            this.field_40k = var20;
         }
      }
   }















   private boolean method_41$2610240745(int var1, int var2, short var3, C_43r var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      boolean var7 = recovery$indy$7(-66091492583776077L, var5);
      boolean var10000 = var4 instanceof C_43J;
      if (!var7) {
         if (!var10000) {
            var10000 = var4 instanceof C_43z;
            if (var7) {
               return var10000;
            }

            if (!var10000) {
               var10000 = var4 instanceof C_43y;
               if (var7) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   public void method_41$426c33b229(C_477z var1, long var2) {
   }



   private C_47rf method_41$9c52b54a6d(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      return recovery$indy$8(field_43, -7201623780746037969L, var4).method_48$ac4db64966();
   }



   public void method_41$9035875d26(long var1, net.C_47ob var3) {
      net.C_473U var418;
      net.C_473U var423;
        net.C_47rf var130;
        boolean var403;
        net.C_473U var404;
        boolean var405;
        net.C_473U var406;
        augustus.recovered.modules.movement.NoSlow_47kC var407;
        boolean var408;
        net.C_473U var409;
        net.C_473U var410;
        net.C_473U var411;
        boolean var415;
        augustus.recovered.modules.movement.NoSlow_47kC var416;
        net.C_473U var419;
        net.C_473U var421;
        net.C_473U var424;
        int var429;
        int var430;
        int var431;
        int var432;
        int var433;
        int var434;
        int var436;
      long var10001 = var1 ^ 29127789542362L;
      int var4 = (int)((var1 ^ 29127789542362L) >>> 32);
      long var5 = var10001 << 32 >>> 32;
      long var7 = var1 ^ 48552975978563L;
      var10001 = var1 ^ 90215387175124L;
      int var9 = (int)((var1 ^ 90215387175124L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var1 ^ 65678298257805L;
      long var14 = var1 ^ 87851649611493L;
      long var16 = var1 ^ 4413204483242L;
      byte var18 = ((byte) (Fly_47kE.method_48$aae029aa0a() ? 1 : 0));
      net.C_47ob var23 = var3;
      net.C_473U var19 = var23.method_46$96fcbedb66();
      int var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
      if (var18 != 0) {
         label2039: {
            label1969: {
               C_42V var132;
               label2052: {
                  net.C_43r var150;
                  label2053: {
                     label1972: {
                        label1973: {
                           label1974: {
                              label1794: {
                                 label1975: {
                                    label1976: {
                                       label1977: {
                                          label1978: {
                                             label1979: {
                                                label1980: {
                                                   label1981: {
                                                      label1982: {
                                                         label1983: {
                                                            label1984: {
                                                               label1985: {
                                                                  label1986: {
                                                                     label1781: {
                                                                        label1780: {
                                                                           label1987: {
                                                                              label1988: {
                                                                                 label1989: {
                                                                                    label1990: {
                                                                                       label1991: {
                                                                                          label1992: {
                                                                                             label1773: {
                                                                                                label1993: {
                                                                                                   label1994: {
                                                                                                      if ((var10000) != 0) {
                                                                                                         net.minecraft.client.Minecraft var24 = field_43;
                                                                                                         if (!var24.field_42P.method_436$aae029aa0a()) {
                                                                                                            var132 = (C_42V)var19;
                                                                                                            var10000 = var132.method_44$8abf5c6871();
                                                                                                            if (var1 < 0L) {
                                                                                                               label1658: {
                                                                                                                  if (var18 != 0) {
                                                                                                                     if (var10000 != 0) {
                                                                                                                        net.minecraft.client.Minecraft var153 = field_43;
                                                                                                                        var10000 = var153.field_42P.field_486;
                                                                                                                        var436 = var18;
                                                                                                                        break label1658;
                                                                                                                     }

                                                                                                                     var10000 = ((int) (var19 instanceof C_479E ? 1 : 0));
                                                                                                                  }

                                                                                                                  var436 = var18;
                                                                                                               }

                                                                                                               if (var436 != 0) {
                                                                                                                  if (var10000 != 0) {
                                                                                                                     long var156 = var5;
                                                                                                                     int var159 = var4;
                                                                                                                     NoSlow_47kC var162 = this;
                                                                                                                     var162.method_41$9c52b54a6d(var159, var156);
                                                                                                                     var416 = this;
                                                                                                                     var431 = var18;
                                                                                                                     break label2039;
                                                                                                                  }

                                                                                                                  net.C_47I9 var183 = net.C_47I9.GRIM;
                                                                                                                  var10000 = ((int) (var183.method_43$aae029aa0a() ? 1 : 0));
                                                                                                               }

                                                                                                               if (var18 == 0) {
                                                                                                                  break label1980;
                                                                                                               }

                                                                                                               if (var10000 != 0) {
                                                                                                                  var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                                                  if (var18 == 0) {
                                                                                                                     break label1980;
                                                                                                                  }

                                                                                                                  if (var10000 != 0) {
                                                                                                                     long var189 = var5;
                                                                                                                     int var195 = var4;
                                                                                                                     NoSlow_47kC var201 = this;
                                                                                                                     net.C_47rf var136 = var201.method_41$9c52b54a6d(
                                                                                                                        var195, var189
                                                                                                                     );
                                                                                                                     boolean var207 = false;
                                                                                                                     long var213 = var16;
                                                                                                                     net.C_47rf var219 = var136;
                                                                                                                     NoSlow_47kC var225 = this;
                                                                                                                     if (!var225.method_49$5913085b6d(
                                                                                                                        var219, var213, var207
                                                                                                                     )) {
                                                                                                                        net.C_43r var456 = var136.method_48$dbd570a038();
                                                                                                                        short var471 = (short)var11;
                                                                                                                        net.C_43r var228 = var456;
                                                                                                                        short var231 = var471;
                                                                                                                        int var234 = var10;
                                                                                                                        int var237 = var9;
                                                                                                                        NoSlow_47kC var240 = this;
                                                                                                                        if (var240.method_41$2610240745(
                                                                                                                           var237, var234, var231, var228
                                                                                                                        )) {
                                                                                                                           var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                                                           if (var18 == 0) {
                                                                                                                              break label1980;
                                                                                                                           }

                                                                                                                           if (var10000 != 0) {
                                                                                                                              var418 = (C_45J)var19;
                                                                                                                              var433 = var18;
                                                                                                                              break label1781;
                                                                                                                           }
                                                                                                                        }
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var418 = var19;
                                                                                                               var433 = var18;
                                                                                                               break label1781;
                                                                                                            }

                                                                                                            label1765:
                                                                                                            if (var18 != 0) {
                                                                                                               if (var10000 == 255) {
                                                                                                                  net.C_47rf var435 = var132.method_46$ac4db64966();
                                                                                                                  long var25 = var12;
                                                                                                                  net.C_47rf var27 = var435;
                                                                                                                  NoSlow_47kC var28 = this;
                                                                                                                  var10000 = ((int) (var28.method_44$54e912928c(
                                                                                                                     var27, var25
                                                                                                                  ) ? 1 : 0));
                                                                                                                  if (var18 == 0) {
                                                                                                                     break label1765;
                                                                                                                  }

                                                                                                                  if (var10000 != 0) {
                                                                                                                     net.minecraft.client.Minecraft var29 = field_43;
                                                                                                                     var10000 = var29.field_42P.field_486;
                                                                                                                     if (var18 == 0) {
                                                                                                                        break label1765;
                                                                                                                     }

                                                                                                                     if (var29.field_42P.field_486 < 2) {
                                                                                                                        net.minecraft.client.Minecraft var30 = field_43;
                                                                                                                        if (var30.field_42P.field_48M) {
                                                                                                                           net.minecraft.client.Minecraft var31 = field_43;
                                                                                                                           var31.field_42P
                                                                                                                              .method_46f$da8c82d5d4();
                                                                                                                        }

                                                                                                                        this.field_43a = true;
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var10000 = ((int) (var19 instanceof C_479E ? 1 : 0));
                                                                                                            }

                                                                                                            if (var18 == 0) {
                                                                                                               break label1773;
                                                                                                            }

                                                                                                            if (var10000 == 0) {
                                                                                                               break label1993;
                                                                                                            }

                                                                                                            long var155 = var5;
                                                                                                            int var158 = var4;
                                                                                                            NoSlow_47kC var161 = this;
                                                                                                            var130 = var161.method_41$9c52b54a6d(var158, var155);
                                                                                                            var416 = this;
                                                                                                            var431 = var18;
                                                                                                            break label1994;
                                                                                                         }
                                                                                                      }

                                                                                                      var415 = var19 instanceof C_479E;
                                                                                                      if (var18 == 0) {
                                                                                                         break label1992;
                                                                                                      }

                                                                                                      if (!var415) {
                                                                                                         net.C_47I9 var180 = net.C_47I9.GRIM;
                                                                                                         var415 = var180.method_43$aae029aa0a();
                                                                                                         break label1992;
                                                                                                      }

                                                                                                      long var154 = var5;
                                                                                                      int var157 = var4;
                                                                                                      NoSlow_47kC var160 = this;
                                                                                                      var130 = var160.method_41$9c52b54a6d(var157, var154);
                                                                                                      var416 = this;
                                                                                                      var431 = var18;
                                                                                                      if (var1 < 0L) {
                                                                                                         break label2039;
                                                                                                      }
                                                                                                   }

                                                                                                   if (var431 == 0) {
                                                                                                      break label1969;
                                                                                                   }

                                                                                                   long var163 = var14;
                                                                                                   net.C_47rf var164 = var130;
                                                                                                   NoSlow_47kC var165 = var416;
                                                                                                   if (var165.method_46$54e912928c(var164, var163)) {
                                                                                                      var416 = this;
                                                                                                      break label1969;
                                                                                                   }

                                                                                                   net.C_43r var144 = ((net.C_47rf) (var130)).method_48$dbd570a038();
                                                                                                   C_479E var151 = (C_479E)var19;
                                                                                                   net.C_43r var166 = var144;
                                                                                                   NoSlow_47kC var167 = this;
                                                                                                   var10000 = ((int) (var167.method_45$d654fe8697(var166) ? 1 : 0));
                                                                                                   if (var18 != 0) {
                                                                                                      if (var10000 != 0) {
                                                                                                         net.C_47x6 var168 = net.C_47x6.ON_GROUND;
                                                                                                         if (var168.method_43$aae029aa0a()) {
                                                                                                            var151.method_49$f633c984d8(true);
                                                                                                         }
                                                                                                         break label1993;
                                                                                                      }

                                                                                                      net.C_43r var169 = var144;
                                                                                                      NoSlow_47kC var170 = this;
                                                                                                      var10000 = ((int) (var170.method_44$d654fe8697(var169) ? 1 : 0));
                                                                                                   }

                                                                                                   if (var18 != 0) {
                                                                                                      if (var10000 != 0) {
                                                                                                         net.C_47G2 var171 = net.C_47G2.ON_GROUND;
                                                                                                         if (var171.method_43$aae029aa0a()) {
                                                                                                            var151.method_49$f633c984d8(true);
                                                                                                         }
                                                                                                         break label1993;
                                                                                                      }

                                                                                                      short var446 = (short)var11;
                                                                                                      net.C_43r var172 = var144;
                                                                                                      short var173 = var446;
                                                                                                      int var174 = var10;
                                                                                                      int var175 = var9;
                                                                                                      NoSlow_47kC var176 = this;
                                                                                                      var10000 = ((int) (var176.method_41$2610240745(
                                                                                                         var175, var174, var173, var172
                                                                                                      ) ? 1 : 0));
                                                                                                   }

                                                                                                   if (var18 == 0) {
                                                                                                      break label1773;
                                                                                                   }

                                                                                                   if (var10000 != 0) {
                                                                                                      net.C_47I9 var177 = net.C_47I9.ON_GROUND;
                                                                                                      var10000 = ((int) (var177.method_43$aae029aa0a() ? 1 : 0));
                                                                                                      if (var1 > 0L) {
                                                                                                         if (var18 != 0) {
                                                                                                            if ((var10000) != 0) {
                                                                                                               var151.method_49$f633c984d8(true);
                                                                                                            }

                                                                                                            net.C_47I9 var181 = net.C_47I9.GRIM;
                                                                                                            var10000 = ((int) (var181.method_43$aae029aa0a() ? 1 : 0));
                                                                                                         }

                                                                                                         if (var18 == 0) {
                                                                                                            break label1977;
                                                                                                         }

                                                                                                         if (!(var10000 != 0)) {
                                                                                                            break label1780;
                                                                                                         }

                                                                                                         var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                                         var432 = var18;
                                                                                                         break label1990;
                                                                                                      }

                                                                                                      if (var18 == 0) {
                                                                                                         break label1978;
                                                                                                      }

                                                                                                      if (!(var10000 != 0)) {
                                                                                                         break label1987;
                                                                                                      }

                                                                                                      var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                                      var432 = var18;
                                                                                                      break label1991;
                                                                                                   }
                                                                                                }

                                                                                                net.C_47I9 var182 = net.C_47I9.GRIM;
                                                                                                var10000 = ((int) (var182.method_43$aae029aa0a() ? 1 : 0));
                                                                                             }

                                                                                             if (var18 == 0) {
                                                                                                break label1979;
                                                                                             }

                                                                                             if (var10000 == 0) {
                                                                                                var424 = var19;
                                                                                                if (var18 == 0) {
                                                                                                   break label1976;
                                                                                                }

                                                                                                var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                                break label1979;
                                                                                             }

                                                                                             var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                             var432 = var18;
                                                                                             if (var1 > 0L) {
                                                                                                break label1990;
                                                                                             }
                                                                                             break label1991;
                                                                                          }

                                                                                          if (var18 == 0) {
                                                                                             break label1984;
                                                                                          }

                                                                                          if (!var415) {
                                                                                             var421 = var19;
                                                                                             if (var18 == 0) {
                                                                                                break label1982;
                                                                                             }

                                                                                             var415 = var19 instanceof C_42V;
                                                                                             break label1984;
                                                                                          }

                                                                                          var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                          var432 = var18;
                                                                                          if (var1 <= 0L) {
                                                                                             if (var18 == 0) {
                                                                                                break label1983;
                                                                                             }

                                                                                             if (!(var10000 != 0)) {
                                                                                                break label1988;
                                                                                             }

                                                                                             long var186 = var5;
                                                                                             int var192 = var4;
                                                                                             NoSlow_47kC var198 = this;
                                                                                             net.C_47rf var131 = var198.method_41$9c52b54a6d(var192, var186);
                                                                                             boolean var204 = false;
                                                                                             long var210 = var16;
                                                                                             net.C_47rf var216 = var131;
                                                                                             NoSlow_47kC var222 = this;
                                                                                             if (var222.method_49$5913085b6d(var216, var210, var204)) {
                                                                                                break label1988;
                                                                                             }

                                                                                             net.C_43r var445 = var131.method_48$dbd570a038();
                                                                                             short var10005 = (short)var11;
                                                                                             net.C_43r var62 = var445;
                                                                                             short var63 = var10005;
                                                                                             int var64 = var10;
                                                                                             int var65 = var9;
                                                                                             NoSlow_47kC var66 = this;
                                                                                             if (!var66.method_41$2610240745(var65, var64, var63, var62)) {
                                                                                                break label1988;
                                                                                             }

                                                                                             var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                             if (var18 == 0) {
                                                                                                break label1983;
                                                                                             }

                                                                                             if (!(var10000 != 0)) {
                                                                                                break label1988;
                                                                                             }

                                                                                             var418 = (C_45J)var19;
                                                                                             var433 = var18;
                                                                                             if (var1 < 0L) {
                                                                                                break label1781;
                                                                                             }
                                                                                             break label1989;
                                                                                          }
                                                                                          break label1990;
                                                                                       }

                                                                                       if (var432 == 0) {
                                                                                          break label1978;
                                                                                       }

                                                                                       if (!(var10000 != 0)) {
                                                                                          break label1987;
                                                                                       }

                                                                                       long var187 = var5;
                                                                                       int var193 = var4;
                                                                                       NoSlow_47kC var199 = this;
                                                                                       net.C_47rf var134 = var199.method_41$9c52b54a6d(var193, var187);
                                                                                       boolean var205 = false;
                                                                                       long var211 = var16;
                                                                                       net.C_47rf var217 = var134;
                                                                                       NoSlow_47kC var223 = this;
                                                                                       if (var223.method_49$5913085b6d(var217, var211, var205)) {
                                                                                          break label1987;
                                                                                       }

                                                                                       net.C_43r var447 = var134.method_48$dbd570a038();
                                                                                       short var469 = (short)var11;
                                                                                       net.C_43r var226 = var447;
                                                                                       short var229 = var469;
                                                                                       int var232 = var10;
                                                                                       int var235 = var9;
                                                                                       NoSlow_47kC var238 = this;
                                                                                       if (!var238.method_41$2610240745(var235, var232, var229, var226)) {
                                                                                          break label1987;
                                                                                       }

                                                                                       var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                       if (var18 == 0) {
                                                                                          break label1978;
                                                                                       }

                                                                                       if (!(var10000 != 0)) {
                                                                                          break label1987;
                                                                                       }

                                                                                       var418 = (C_45J)var19;
                                                                                       var433 = var18;
                                                                                       break label1989;
                                                                                    }

                                                                                    label2000: {
                                                                                       if (var432 != 0) {
                                                                                          if ((var10000) != 0) {
                                                                                             break label2000;
                                                                                          }

                                                                                          var10000 = ((int) (var19 instanceof C_45J ? 1 : 0));
                                                                                       }

                                                                                       if (var18 == 0) {
                                                                                          break label1977;
                                                                                       }

                                                                                       if (!(var10000 != 0)) {
                                                                                          break label1780;
                                                                                       }
                                                                                    }

                                                                                    long var188 = var5;
                                                                                    int var194 = var4;
                                                                                    NoSlow_47kC var200 = this;
                                                                                    net.C_47rf var135 = var200.method_41$9c52b54a6d(var194, var188);
                                                                                    boolean var206 = false;
                                                                                    long var212 = var16;
                                                                                    net.C_47rf var218 = var135;
                                                                                    NoSlow_47kC var224 = this;
                                                                                    if (!var224.method_49$5913085b6d(var218, var212, var206)) {
                                                                                       net.C_43r var448 = var135.method_48$dbd570a038();
                                                                                       short var470 = (short)var11;
                                                                                       net.C_43r var227 = var448;
                                                                                       short var230 = var470;
                                                                                       int var233 = var10;
                                                                                       int var236 = var9;
                                                                                       NoSlow_47kC var239 = this;
                                                                                       if (var239.method_41$2610240745(var236, var233, var230, var227)) {
                                                                                          var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                                          if (var18 != 0) {
                                                                                             if ((var10000) != 0) {
                                                                                                net.minecraft.client.Minecraft var67 = field_43;
                                                                                                net.minecraft.client.Minecraft var68 = field_43;
                                                                                                var67.field_42P
                                                                                                   .field_49m
                                                                                                   .method_43$631790539f(
                                                                                                      new C_42V(var68.field_42P.method_48$ac4db64966())
                                                                                                   );
                                                                                                net.minecraft.client.Minecraft var69 = field_43;
                                                                                                var69.field_42P
                                                                                                   .field_49m
                                                                                                   .method_43$631790539f(
                                                                                                      new C_45J(net.C_40x.DROP_ITEM, net.C_478Q.field_44, net.C_484.DOWN)
                                                                                                   );
                                                                                                var3.cancel();
                                                                                                net.minecraft.client.Minecraft var70 = field_43;
                                                                                                net.C_47UA.method_41$f0a4aeb8bd(
                                                                                                   var70.field_44r.field_45w.method_45$8abf5c6871(), false
                                                                                                );
                                                                                                this.field_43v = true;
                                                                                                break label1780;
                                                                                             }

                                                                                             var10000 = ((int) (this.field_43v ? 1 : 0));
                                                                                          }

                                                                                          if (var18 == 0) {
                                                                                             break label1977;
                                                                                          }

                                                                                          if ((var10000) != 0) {
                                                                                             var423 = (C_45J)var19;
                                                                                             if (var18 == 0) {
                                                                                                break label1985;
                                                                                             }

                                                                                             if (((net.C_45J) (var423)).method_47$4de68953a2() == net.C_40x.RELEASE_USE_ITEM) {
                                                                                                this.field_43v = false;
                                                                                                var3.cancel();
                                                                                             }
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                    break label1780;
                                                                                 }

                                                                                 if (var433 == 0) {
                                                                                    break label1986;
                                                                                 }

                                                                                 if (((net.C_45J) (var418)).method_47$4de68953a2() == net.C_40x.RELEASE_USE_ITEM) {
                                                                                    this.field_43v = false;
                                                                                    var3.cancel();
                                                                                 }
                                                                                 break label1987;
                                                                              }

                                                                              var419 = var19;
                                                                              if (var18 == 0) {
                                                                                 break label1981;
                                                                              }

                                                                              var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                                              break label1983;
                                                                           }

                                                                           var418 = var19;
                                                                           break label1986;
                                                                        }

                                                                        var423 = var19;
                                                                        break label1985;
                                                                     }

                                                                     if (var433 == 0) {
                                                                        break label1794;
                                                                     }

                                                                     var10000 = ((int) (var418 instanceof C_42V ? 1 : 0));
                                                                     break label1980;
                                                                  }

                                                                  if (var18 == 0) {
                                                                     break label1974;
                                                                  }

                                                                  var10000 = ((int) (var418 instanceof C_42V ? 1 : 0));
                                                                  break label1978;
                                                               }

                                                               if (var18 == 0) {
                                                                  break label1973;
                                                               }

                                                               var10000 = ((int) (var423 instanceof C_42V ? 1 : 0));
                                                               break label1977;
                                                            }

                                                            if (!var415) {
                                                               return;
                                                            }

                                                            var421 = var19;
                                                            break label1982;
                                                         }

                                                         if (!(var10000 != 0)) {
                                                            return;
                                                         }

                                                         var419 = var19;
                                                         break label1981;
                                                      }

                                                      var132 = (C_42V)var421;
                                                      if (var132.method_44$8abf5c6871() != 255) {
                                                         return;
                                                      }

                                                      net.C_47rf var143 = var132.method_46$ac4db64966();
                                                      long var246 = var14;
                                                      net.C_47rf var256 = var143;
                                                      NoSlow_47kC var266 = this;
                                                      if (var266.method_46$54e912928c(var256, var246)) {
                                                         return;
                                                      }

                                                      var150 = var143.method_48$dbd570a038();
                                                      if (var150 == null) {
                                                         return;
                                                      }

                                                      net.C_43r var276 = var150;
                                                      NoSlow_47kC var286 = this;
                                                      var10000 = ((int) (var286.method_45$d654fe8697(var276) ? 1 : 0));
                                                      var434 = var18;
                                                      if (var1 > 0L) {
                                                         break label2053;
                                                      }
                                                      break label1975;
                                                   }

                                                   var132 = (C_42V)var419;
                                                   if (var132.method_44$8abf5c6871() != 255) {
                                                      return;
                                                   }

                                                   net.C_47rf var142 = var132.method_46$ac4db64966();
                                                   long var245 = var14;
                                                   net.C_47rf var255 = var142;
                                                   NoSlow_47kC var265 = this;
                                                   if (var265.method_46$54e912928c(var255, var245)) {
                                                      return;
                                                   }

                                                   var150 = var142.method_48$dbd570a038();
                                                   if (var150 == null) {
                                                      return;
                                                   }

                                                   net.C_43r var275 = var150;
                                                   NoSlow_47kC var285 = this;
                                                   var10000 = ((int) (var285.method_45$d654fe8697(var275) ? 1 : 0));
                                                   var434 = var18;
                                                   break label1975;
                                                }

                                                if (var10000 == 0) {
                                                   return;
                                                }

                                                var418 = var19;
                                                break label1794;
                                             }

                                             if (var10000 == 0) {
                                                return;
                                             }

                                             var424 = var19;
                                             break label1976;
                                          }

                                          if (!(var10000 != 0)) {
                                             return;
                                          }

                                          var418 = var19;
                                          break label1974;
                                       }

                                       if (!(var10000 != 0)) {
                                          return;
                                       }

                                       var423 = var19;
                                       break label1973;
                                    }

                                    var132 = (C_42V)var424;
                                    if (var132.method_44$8abf5c6871() != 255) {
                                       return;
                                    }

                                    net.C_47rf var147 = var132.method_46$ac4db64966();
                                    long var249 = var14;
                                    net.C_47rf var259 = var147;
                                    NoSlow_47kC var269 = this;
                                    if (var269.method_46$54e912928c(var259, var249)) {
                                       return;
                                    }

                                    var150 = var147.method_48$dbd570a038();
                                    if (var150 == null) {
                                       return;
                                    }

                                    net.C_43r var279 = var150;
                                    NoSlow_47kC var289 = this;
                                    var10000 = ((int) (var289.method_45$d654fe8697(var279) ? 1 : 0));
                                    var434 = var18;
                                    if (var1 > 0L) {
                                       break label2053;
                                    }
                                    break label1972;
                                 }

                                 if (var1 < 0L) {
                                    break label2052;
                                 }
                                 break label1972;
                              }

                              var132 = (C_42V)var418;
                              if (var132.method_44$8abf5c6871() != 255) {
                                 return;
                              }

                              net.C_47rf var148 = var132.method_46$ac4db64966();
                              long var250 = var14;
                              net.C_47rf var260 = var148;
                              NoSlow_47kC var270 = this;
                              if (var270.method_46$54e912928c(var260, var250)) {
                                 return;
                              }

                              var150 = var148.method_48$dbd570a038();
                              if (var150 == null) {
                                 return;
                              }

                              net.C_43r var280 = var150;
                              NoSlow_47kC var290 = this;
                              var10000 = ((int) (var290.method_45$d654fe8697(var280) ? 1 : 0));
                              var434 = var18;
                              break label2052;
                           }

                           var132 = (C_42V)var418;
                           if (var132.method_44$8abf5c6871() != 255) {
                              return;
                           }

                           net.C_47rf var145 = var132.method_46$ac4db64966();
                           long var247 = var14;
                           net.C_47rf var257 = var145;
                           NoSlow_47kC var267 = this;
                           if (var267.method_46$54e912928c(var257, var247)) {
                              return;
                           }

                           var150 = var145.method_48$dbd570a038();
                           if (var150 == null) {
                              return;
                           }

                           net.C_43r var277 = var150;
                           NoSlow_47kC var287 = this;
                           var10000 = ((int) (var287.method_45$d654fe8697(var277) ? 1 : 0));
                           var434 = var18;
                           break label1972;
                        }

                        var132 = (C_42V)var423;
                        if (var132.method_44$8abf5c6871() != 255) {
                           return;
                        }

                        net.C_47rf var146 = var132.method_46$ac4db64966();
                        long var248 = var14;
                        net.C_47rf var258 = var146;
                        NoSlow_47kC var268 = this;
                        if (var268.method_46$54e912928c(var258, var248)) {
                           return;
                        }

                        var150 = var146.method_48$dbd570a038();
                        if (var150 == null) {
                           return;
                        }

                        net.C_43r var278 = var150;
                        NoSlow_47kC var288 = this;
                        var10000 = ((int) (var288.method_45$d654fe8697(var278) ? 1 : 0));
                        var434 = var18;
                        break label2053;
                     }

                     if (var434 != 0) {
                        if ((var10000) != 0) {
                           net.C_47G2 var307 = net.C_47G2.INVALID_PACKET;
                           boolean var425 = var307.method_43$aae029aa0a();
                           if (var18 != 0) {
                              if (var425) {
                                 var132.method_46$9bd5253e1e(null);
                              }

                              client.setting.BooleanSetting var311 = this.settingBowEditFacing;
                              var425 = var311.method_49$aae029aa0a();
                           }

                           if (var18 != 0) {
                              if (var425) {
                                 long var314 = var7;
                                 client.setting.NumberSetting var317 = this.settingBowEnumFacingID;
                                 var132.method_46$d00df7729d((int)var317.method_44$474dfaa627(var314));
                              }

                              client.setting.BooleanSetting var320 = this.settingBowCustomBlockPos;
                              var425 = var320.method_49$aae029aa0a();
                           }

                           if (var18 != 0) {
                              if (var425) {
                                 client.setting.RangeSetting var323 = this.settingBowCustomBlockPosX;
                                 double var451 = var323.method_43$fedcb3e4d3();
                                 client.setting.RangeSetting var326 = this.settingBowCustomBlockPosY;
                                 double var464 = var326.method_43$fedcb3e4d3();
                                 client.setting.RangeSetting var329 = this.settingBowCustomBlockPosZ;
                                 var132.method_47$c96058c204(new net.C_478Q(var451, var464, var329.method_43$fedcb3e4d3()));
                              }

                              client.setting.BooleanSetting var332 = this.settingBowCustomFacing;
                              var425 = var332.method_49$aae029aa0a();
                           }

                           if (var425) {
                              client.setting.RangeSetting var335 = this.settingBowCustomFacingX;
                              var132.method_47$24a796ab4c((float)var335.method_43$fedcb3e4d3());
                              client.setting.RangeSetting var338 = this.settingBowCustomFacingY;
                              var132.method_42$24a796ab4c((float)var338.method_43$fedcb3e4d3());
                              client.setting.RangeSetting var341 = this.settingBowCustomFacingZ;
                              var132.method_44$24a796ab4c((float)var341.method_43$fedcb3e4d3());
                           }

                           return;
                        }

                        short var449 = (short)var11;
                        net.C_43r var344 = var150;
                        short var347 = var449;
                        int var350 = var10;
                        int var353 = var9;
                        NoSlow_47kC var356 = this;
                        var10000 = ((int) (var356.method_41$2610240745(var353, var350, var347, var344) ? 1 : 0));
                     }

                     if (var18 != 0) {
                        if (!(var10000 != 0)) {
                           return;
                        }

                        client.setting.BooleanSetting var360 = this.settingRestNullItem;
                        var10000 = ((int) (var360.method_49$aae029aa0a() ? 1 : 0));
                     }

                     if (var18 != 0) {
                        if ((var10000) != 0) {
                           var132.method_46$9bd5253e1e(null);
                        }

                        client.setting.BooleanSetting var363 = this.settingRestEditFacing;
                        var10000 = ((int) (var363.method_49$aae029aa0a() ? 1 : 0));
                     }

                     if (var18 != 0) {
                        if ((var10000) != 0) {
                           client.setting.RangeSetting var370 = this.settingRestCustomBlockPosX;
                           double var450 = var370.method_43$fedcb3e4d3();
                           client.setting.RangeSetting var375 = this.settingRestCustomBlockPosY;
                           double var463 = var375.method_43$fedcb3e4d3();
                           client.setting.RangeSetting var380 = this.settingRestCustomBlockPosZ;
                           var132.method_47$c96058c204(new net.C_478Q(var450, var463, var380.method_43$fedcb3e4d3()));
                        }

                        client.setting.BooleanSetting var385 = this.settingRestCustomFacing;
                        var10000 = ((int) (var385.method_49$aae029aa0a() ? 1 : 0));
                     }

                     if ((var10000) != 0) {
                        client.setting.RangeSetting var390 = this.settingRestCustomFacingX;
                        var132.method_47$24a796ab4c((float)var390.method_43$fedcb3e4d3());
                        client.setting.RangeSetting var395 = this.settingRestCustomFacingY;
                        var132.method_42$24a796ab4c((float)var395.method_43$fedcb3e4d3());
                        client.setting.RangeSetting var400 = this.settingRestCustomFacingZ;
                        var132.method_44$24a796ab4c((float)var400.method_43$fedcb3e4d3());
                     }

                     return;
                  }

                  if (var434 != 0) {
                     if ((var10000) != 0) {
                        net.C_47x6 var291 = net.C_47x6.INVALID_PACKET;
                        boolean var427 = var291.method_43$aae029aa0a();
                        if (var18 != 0) {
                           if (!var427) {
                              return;
                           }

                           client.setting.BooleanSetting var292 = this.settingSwordNullItem;
                           var427 = var292.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var427) {
                              var132.method_46$9bd5253e1e(null);
                           }

                           client.setting.BooleanSetting var293 = this.settingSwordEditFacing;
                           var427 = var293.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var427) {
                              long var294 = var7;
                              client.setting.NumberSetting var295 = this.settingSwordEnumFacingID;
                              var132.method_46$d00df7729d((int)var295.method_44$474dfaa627(var294));
                           }

                           client.setting.BooleanSetting var296 = this.settingSwordCustomBlockPos;
                           var427 = var296.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var427) {
                              client.setting.RangeSetting var297 = this.settingSwordCustomBlockPosX;
                              double var455 = var297.method_43$fedcb3e4d3();
                              client.setting.RangeSetting var298 = this.settingSwordCustomBlockPosY;
                              double var467 = var298.method_43$fedcb3e4d3();
                              client.setting.RangeSetting var299 = this.settingSwordCustomBlockPosZ;
                              var132.method_47$c96058c204(new net.C_478Q(var455, var467, var299.method_43$fedcb3e4d3()));
                           }

                           client.setting.BooleanSetting var300 = this.settingSwordCustomFacing;
                           var427 = var300.method_49$aae029aa0a();
                        }

                        if (var427) {
                           client.setting.RangeSetting var301 = this.settingSwordCustomFacingX;
                           var132.method_47$24a796ab4c((float)var301.method_43$fedcb3e4d3());
                           client.setting.RangeSetting var302 = this.settingSwordCustomFacingY;
                           var132.method_42$24a796ab4c((float)var302.method_43$fedcb3e4d3());
                           client.setting.RangeSetting var303 = this.settingSwordCustomFacingZ;
                           var132.method_44$24a796ab4c((float)var303.method_43$fedcb3e4d3());
                        }

                        return;
                     }

                     net.C_43r var304 = var150;
                     NoSlow_47kC var305 = this;
                     var10000 = ((int) (var305.method_44$d654fe8697(var304) ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if ((var10000) != 0) {
                        net.C_47G2 var308 = net.C_47G2.INVALID_PACKET;
                        boolean var426 = var308.method_43$aae029aa0a();
                        if (var18 != 0) {
                           if (!var426) {
                              return;
                           }

                           client.setting.BooleanSetting var309 = this.settingBowNullItem;
                           var426 = var309.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var426) {
                              var132.method_46$9bd5253e1e(null);
                           }

                           client.setting.BooleanSetting var312 = this.settingBowEditFacing;
                           var426 = var312.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var426) {
                              long var315 = var7;
                              client.setting.NumberSetting var318 = this.settingBowEnumFacingID;
                              var132.method_46$d00df7729d((int)var318.method_44$474dfaa627(var315));
                           }

                           client.setting.BooleanSetting var321 = this.settingBowCustomBlockPos;
                           var426 = var321.method_49$aae029aa0a();
                        }

                        if (var18 != 0) {
                           if (var426) {
                              client.setting.RangeSetting var324 = this.settingBowCustomBlockPosX;
                              double var454 = var324.method_43$fedcb3e4d3();
                              client.setting.RangeSetting var327 = this.settingBowCustomBlockPosY;
                              double var466 = var327.method_43$fedcb3e4d3();
                              client.setting.RangeSetting var330 = this.settingBowCustomBlockPosZ;
                              var132.method_47$c96058c204(new net.C_478Q(var454, var466, var330.method_43$fedcb3e4d3()));
                           }

                           client.setting.BooleanSetting var333 = this.settingBowCustomFacing;
                           var426 = var333.method_49$aae029aa0a();
                        }

                        if (var426) {
                           client.setting.RangeSetting var336 = this.settingBowCustomFacingX;
                           var132.method_47$24a796ab4c((float)var336.method_43$fedcb3e4d3());
                           client.setting.RangeSetting var339 = this.settingBowCustomFacingY;
                           var132.method_42$24a796ab4c((float)var339.method_43$fedcb3e4d3());
                           client.setting.RangeSetting var342 = this.settingBowCustomFacingZ;
                           var132.method_44$24a796ab4c((float)var342.method_43$fedcb3e4d3());
                        }

                        return;
                     }

                     short var452 = (short)var11;
                     net.C_43r var345 = var150;
                     short var348 = var452;
                     int var351 = var10;
                     int var354 = var9;
                     NoSlow_47kC var357 = this;
                     var10000 = ((int) (var357.method_41$2610240745(var354, var351, var348, var345) ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if (!(var10000 != 0)) {
                        return;
                     }

                     net.C_47I9 var358 = net.C_47I9.INVALID_PACKET;
                     var10000 = ((int) (var358.method_43$aae029aa0a() ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if (!(var10000 != 0)) {
                        return;
                     }

                     client.setting.BooleanSetting var361 = this.settingRestNullItem;
                     var10000 = ((int) (var361.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if ((var10000) != 0) {
                        var132.method_46$9bd5253e1e(null);
                     }

                     client.setting.BooleanSetting var364 = this.settingRestEditFacing;
                     var10000 = ((int) (var364.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if ((var10000) != 0) {
                        long var365 = var7;
                        client.setting.NumberSetting var366 = this.settingRestEnumFacingID;
                        var132.method_46$d00df7729d((int)var366.method_44$474dfaa627(var365));
                     }

                     client.setting.BooleanSetting var367 = this.settingRestCustomBlockPos;
                     var10000 = ((int) (var367.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if (var18 != 0) {
                     if ((var10000) != 0) {
                        client.setting.RangeSetting var371 = this.settingRestCustomBlockPosX;
                        double var453 = var371.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var376 = this.settingRestCustomBlockPosY;
                        double var465 = var376.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var381 = this.settingRestCustomBlockPosZ;
                        var132.method_47$c96058c204(new net.C_478Q(var453, var465, var381.method_43$fedcb3e4d3()));
                     }

                     client.setting.BooleanSetting var386 = this.settingRestCustomFacing;
                     var10000 = ((int) (var386.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if ((var10000) != 0) {
                     client.setting.RangeSetting var391 = this.settingRestCustomFacingX;
                     var132.method_47$24a796ab4c((float)var391.method_43$fedcb3e4d3());
                     client.setting.RangeSetting var396 = this.settingRestCustomFacingY;
                     var132.method_42$24a796ab4c((float)var396.method_43$fedcb3e4d3());
                     client.setting.RangeSetting var401 = this.settingRestCustomFacingZ;
                     var132.method_44$24a796ab4c((float)var401.method_43$fedcb3e4d3());
                  }

                  return;
               }

               if (var434 != 0) {
                  if ((var10000) != 0) {
                     client.setting.RangeSetting var372 = this.settingRestCustomBlockPosX;
                     double var457 = var372.method_43$fedcb3e4d3();
                     client.setting.RangeSetting var377 = this.settingRestCustomBlockPosY;
                     double var468 = var377.method_43$fedcb3e4d3();
                     client.setting.RangeSetting var382 = this.settingRestCustomBlockPosZ;
                     var132.method_47$c96058c204(new net.C_478Q(var457, var468, var382.method_43$fedcb3e4d3()));
                  }

                  client.setting.BooleanSetting var387 = this.settingRestCustomFacing;
                  var10000 = ((int) (var387.method_49$aae029aa0a() ? 1 : 0));
               }

               if ((var10000) != 0) {
                  client.setting.RangeSetting var392 = this.settingRestCustomFacingX;
                  var132.method_47$24a796ab4c((float)var392.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var397 = this.settingRestCustomFacingY;
                  var132.method_42$24a796ab4c((float)var397.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var402 = this.settingRestCustomFacingZ;
                  var132.method_44$24a796ab4c((float)var402.method_43$fedcb3e4d3());
               }

               return;
            }

            var416.field_437 = 0;
            return;
         }

         var416.field_437 = var431;
      } else {
         label2057: {
            net.C_43r var22;
            C_42V var126;
            label2058: {
               label2009: {
                  label2010: {
                     label1959: {
                        label2011: {
                           label2012: {
                              label2013: {
                                 label2014: {
                                    label2015: {
                                       label1953: {
                                          label2016: {
                                             label2017: {
                                                label2018: {
                                                   label2019: {
                                                      label2020: {
                                                         label2021: {
                                                            if (var18 != 0) {
                                                               if ((var10000) != 0) {
                                                                  long var32 = var5;
                                                                  int var34 = var4;
                                                                  NoSlow_47kC var35 = this;
                                                                  net.C_47rf var127 = var35.method_41$9c52b54a6d(var34, var32);
                                                                  var407 = this;
                                                                  if (var1 < 0L) {
                                                                     this.field_437 = var18;
                                                                     return;
                                                                  }

                                                                  if (var18 == 0) {
                                                                     break label2057;
                                                                  }

                                                                  long var36 = var14;
                                                                  net.C_47rf var38 = var127;
                                                                  NoSlow_47kC var39 = this;
                                                                  if (var39.method_46$54e912928c(var38, var36)) {
                                                                     var407 = this;
                                                                     break label2057;
                                                                  }

                                                                  label2023: {
                                                                     net.C_43r var138 = var127.method_48$dbd570a038();
                                                                     C_479E var149 = (C_479E)var19;
                                                                     net.C_43r var40 = var138;
                                                                     NoSlow_47kC var41 = this;
                                                                     var408 = var41.method_45$d654fe8697(var40);
                                                                     if (var18 != 0) {
                                                                        if (var408) {
                                                                           net.C_47x6 var42 = net.C_47x6.ON_GROUND;
                                                                           var408 = var42.method_43$aae029aa0a();
                                                                           break label2023;
                                                                        }

                                                                        net.C_43r var43 = var138;
                                                                        NoSlow_47kC var44 = this;
                                                                        var408 = var44.method_44$d654fe8697(var43);
                                                                     }

                                                                     if (var18 != 0) {
                                                                        if (var408) {
                                                                           net.C_47G2 var45 = net.C_47G2.ON_GROUND;
                                                                           var408 = var45.method_43$aae029aa0a();
                                                                           break label2023;
                                                                        }

                                                                        short var437 = (short)var11;
                                                                        net.C_43r var46 = var138;
                                                                        short var47 = var437;
                                                                        int var48 = var10;
                                                                        int var49 = var9;
                                                                        NoSlow_47kC var50 = this;
                                                                        var408 = var50.method_41$2610240745(var49, var48, var47, var46);
                                                                     }

                                                                     if (var18 != 0) {
                                                                        if (var408) {
                                                                           net.C_47I9 var51 = net.C_47I9.ON_GROUND;
                                                                           var403 = var51.method_43$aae029aa0a();
                                                                           if (var1 <= 0L) {
                                                                              if (var18 == 0) {
                                                                                 break label2014;
                                                                              }

                                                                              if (!var403) {
                                                                                 break label2019;
                                                                              }

                                                                              var403 = var19 instanceof C_42V;
                                                                              var429 = var18;
                                                                              break label2020;
                                                                           }

                                                                           if (var18 != 0) {
                                                                              if (var403) {
                                                                                 var149.method_49$f633c984d8(true);
                                                                              }

                                                                              net.C_47I9 var179 = net.C_47I9.GRIM;
                                                                              var403 = var179.method_43$aae029aa0a();
                                                                           }

                                                                           if (var18 == 0) {
                                                                              break label2013;
                                                                           }

                                                                           if (!var403) {
                                                                              break label2018;
                                                                           }

                                                                           var403 = var19 instanceof C_42V;
                                                                           var429 = var18;
                                                                           break label2021;
                                                                        }

                                                                        net.C_47I9 var178 = net.C_47I9.GRIM;
                                                                        var408 = var178.method_43$aae029aa0a();
                                                                     }
                                                                  }

                                                                  if (var18 == 0) {
                                                                     break label2015;
                                                                  }

                                                                  if (!var408) {
                                                                     var411 = var19;
                                                                     if (var18 == 0) {
                                                                        break label2012;
                                                                     }

                                                                     var408 = var19 instanceof C_42V;
                                                                     break label2015;
                                                                  }

                                                                  var403 = var19 instanceof C_42V;
                                                                  var429 = var18;
                                                                  if (var1 <= 0L) {
                                                                     break label2020;
                                                                  }
                                                                  break label2021;
                                                               }

                                                               net.C_47I9 var52 = net.C_47I9.GRIM;
                                                               var10000 = ((int) (var52.method_43$aae029aa0a() ? 1 : 0));
                                                            }

                                                            if (var18 == 0) {
                                                               break label2017;
                                                            }

                                                            if (!(var10000 != 0)) {
                                                               var406 = var19;
                                                               if (var18 == 0) {
                                                                  break label1953;
                                                               }

                                                               var10000 = ((int) (var19 instanceof C_42V ? 1 : 0));
                                                               break label2017;
                                                            }

                                                            var403 = var19 instanceof C_42V;
                                                            var429 = var18;
                                                            if (var1 <= 0L) {
                                                               label2027: {
                                                                  if (var18 != 0) {
                                                                     if (var403) {
                                                                        long var53 = var5;
                                                                        int var55 = var4;
                                                                        NoSlow_47kC var56 = this;
                                                                        net.C_47rf var20 = var56.method_41$9c52b54a6d(var55, var53);
                                                                        boolean var57 = false;
                                                                        long var58 = var16;
                                                                        net.C_47rf var60 = var20;
                                                                        NoSlow_47kC var61 = this;
                                                                        var403 = var61.method_49$5913085b6d(var60, var58, var57);
                                                                     } else {
                                                                        var404 = var19;
                                                                        if (var18 == 0) {
                                                                           break label2027;
                                                                        }

                                                                        var403 = var19 instanceof C_42V;
                                                                     }
                                                                  }

                                                                  if (!var403) {
                                                                     return;
                                                                  }

                                                                  var404 = var19;
                                                               }

                                                               var126 = (C_42V)var404;
                                                               net.C_47rf var21 = var126.method_46$ac4db64966();
                                                               long var71 = var14;
                                                               net.C_47rf var73 = var21;
                                                               NoSlow_47kC var74 = this;
                                                               if (var74.method_46$54e912928c(var73, var71)) {
                                                                  return;
                                                               }

                                                               var22 = var21.method_48$dbd570a038();
                                                               if (var22 == null) {
                                                                  return;
                                                               }

                                                               net.C_43r var75 = var22;
                                                               NoSlow_47kC var76 = this;
                                                               var405 = var76.method_45$d654fe8697(var75);
                                                               var430 = var18;
                                                               break label2011;
                                                            }
                                                         }

                                                         if (var429 != 0) {
                                                            if (var403) {
                                                               break label2016;
                                                            }

                                                            var403 = var19 instanceof C_45J;
                                                         }

                                                         if (var18 == 0) {
                                                            break label2013;
                                                         }

                                                         if (var403) {
                                                            break label2016;
                                                         }
                                                         break label2018;
                                                      }

                                                      if (var429 == 0) {
                                                         break label2014;
                                                      }

                                                      if (var403) {
                                                         long var185 = var5;
                                                         int var191 = var4;
                                                         NoSlow_47kC var197 = this;
                                                         net.C_47rf var129 = var197.method_41$9c52b54a6d(var191, var185);
                                                         boolean var203 = false;
                                                         long var209 = var16;
                                                         net.C_47rf var215 = var129;
                                                         NoSlow_47kC var221 = this;
                                                         var403 = var221.method_49$5913085b6d(var215, var209, var203);
                                                         break label2014;
                                                      }
                                                   }

                                                   var410 = var19;
                                                   if (var18 == 0) {
                                                      break label1959;
                                                   }

                                                   var403 = var19 instanceof C_42V;
                                                   break label2014;
                                                }

                                                var409 = var19;
                                                if (var18 == 0) {
                                                   break label2010;
                                                }

                                                var403 = var19 instanceof C_42V;
                                                break label2013;
                                             }

                                             if (!(var10000 != 0)) {
                                                return;
                                             }

                                             var406 = var19;
                                             break label1953;
                                          }

                                          long var184 = var5;
                                          int var190 = var4;
                                          NoSlow_47kC var196 = this;
                                          net.C_47rf var128 = var196.method_41$9c52b54a6d(var190, var184);
                                          boolean var202 = false;
                                          long var208 = var16;
                                          net.C_47rf var214 = var128;
                                          NoSlow_47kC var220 = this;
                                          var403 = var220.method_49$5913085b6d(var214, var208, var202);
                                          break label2013;
                                       }

                                       var126 = (C_42V)var406;
                                       net.C_47rf var137 = var126.method_46$ac4db64966();
                                       long var241 = var14;
                                       net.C_47rf var251 = var137;
                                       NoSlow_47kC var261 = this;
                                       if (var261.method_46$54e912928c(var251, var241)) {
                                          return;
                                       }

                                       var22 = var137.method_48$dbd570a038();
                                       if (var22 == null) {
                                          return;
                                       }

                                       net.C_43r var271 = var22;
                                       NoSlow_47kC var281 = this;
                                       var405 = var281.method_45$d654fe8697(var271);
                                       var430 = var18;
                                       if (var1 > 0L) {
                                          break label2058;
                                       }
                                       break label2011;
                                    }

                                    if (!var408) {
                                       return;
                                    }

                                    var411 = var19;
                                    break label2012;
                                 }

                                 if (!var403) {
                                    return;
                                 }

                                 var410 = var19;
                                 break label1959;
                              }

                              if (!var403) {
                                 return;
                              }

                              var409 = var19;
                              break label2010;
                           }

                           var126 = (C_42V)var411;
                           net.C_47rf var141 = var126.method_46$ac4db64966();
                           long var244 = var14;
                           net.C_47rf var254 = var141;
                           NoSlow_47kC var264 = this;
                           if (var264.method_46$54e912928c(var254, var244)) {
                              return;
                           }

                           var22 = var141.method_48$dbd570a038();
                           if (var22 == null) {
                              return;
                           }

                           net.C_43r var274 = var22;
                           NoSlow_47kC var284 = this;
                           var405 = var284.method_45$d654fe8697(var274);
                           var430 = var18;
                           if (var1 > 0L) {
                              break label2058;
                           }
                           break label2009;
                        }

                        if (var1 < 0L) {
                           if (var430 != 0) {
                              if (var405) {
                                 client.setting.RangeSetting var119 = this.settingRestCustomBlockPosX;
                                 double var10003 = var119.method_43$fedcb3e4d3();
                                 client.setting.RangeSetting var120 = this.settingRestCustomBlockPosY;
                                 double var10004 = var120.method_43$fedcb3e4d3();
                                 client.setting.RangeSetting var121 = this.settingRestCustomBlockPosZ;
                                 var126.method_47$c96058c204(new net.C_478Q(var10003, var10004, var121.method_43$fedcb3e4d3()));
                              }

                              client.setting.BooleanSetting var122 = this.settingRestCustomFacing;
                              var405 = var122.method_49$aae029aa0a();
                           }

                           if (var405) {
                              client.setting.RangeSetting var123 = this.settingRestCustomFacingX;
                              var126.method_47$24a796ab4c((float)var123.method_43$fedcb3e4d3());
                              client.setting.RangeSetting var124 = this.settingRestCustomFacingY;
                              var126.method_42$24a796ab4c((float)var124.method_43$fedcb3e4d3());
                              client.setting.RangeSetting var125 = this.settingRestCustomFacingZ;
                              var126.method_44$24a796ab4c((float)var125.method_43$fedcb3e4d3());
                           }

                           return;
                        }
                        break label2009;
                     }

                     var126 = (C_42V)var410;
                     net.C_47rf var140 = var126.method_46$ac4db64966();
                     long var243 = var14;
                     net.C_47rf var253 = var140;
                     NoSlow_47kC var263 = this;
                     if (var263.method_46$54e912928c(var253, var243)) {
                        return;
                     }

                     var22 = var140.method_48$dbd570a038();
                     if (var22 == null) {
                        return;
                     }

                     net.C_43r var273 = var22;
                     NoSlow_47kC var283 = this;
                     var405 = var283.method_45$d654fe8697(var273);
                     var430 = var18;
                     break label2009;
                  }

                  var126 = (C_42V)var409;
                  net.C_47rf var139 = var126.method_46$ac4db64966();
                  long var242 = var14;
                  net.C_47rf var252 = var139;
                  NoSlow_47kC var262 = this;
                  if (var262.method_46$54e912928c(var252, var242)) {
                     return;
                  }

                  var22 = var139.method_48$dbd570a038();
                  if (var22 == null) {
                     return;
                  }

                  net.C_43r var272 = var22;
                  NoSlow_47kC var282 = this;
                  var405 = var282.method_45$d654fe8697(var272);
                  var430 = var18;
                  break label2058;
               }

               if (var430 != 0) {
                  if (var405) {
                     net.C_47G2 var93 = net.C_47G2.INVALID_PACKET;
                     boolean var412 = var93.method_43$aae029aa0a();
                     if (var18 != 0) {
                        if (var412) {
                           var126.method_46$9bd5253e1e(null);
                        }

                        client.setting.BooleanSetting var95 = this.settingBowEditFacing;
                        var412 = var95.method_49$aae029aa0a();
                     }

                     if (var18 != 0) {
                        if (var412) {
                           long var96 = var7;
                           client.setting.NumberSetting var98 = this.settingBowEnumFacingID;
                           var126.method_46$d00df7729d((int)var98.method_44$474dfaa627(var96));
                        }

                        client.setting.BooleanSetting var99 = this.settingBowCustomBlockPos;
                        var412 = var99.method_49$aae029aa0a();
                     }

                     if (var18 != 0) {
                        if (var412) {
                           client.setting.RangeSetting var100 = this.settingBowCustomBlockPosX;
                           double var438 = var100.method_43$fedcb3e4d3();
                           client.setting.RangeSetting var101 = this.settingBowCustomBlockPosY;
                           double var458 = var101.method_43$fedcb3e4d3();
                           client.setting.RangeSetting var102 = this.settingBowCustomBlockPosZ;
                           var126.method_47$c96058c204(new net.C_478Q(var438, var458, var102.method_43$fedcb3e4d3()));
                        }

                        client.setting.BooleanSetting var103 = this.settingBowCustomFacing;
                        var412 = var103.method_49$aae029aa0a();
                     }

                     if (!var412) {
                        return;
                     }

                     client.setting.RangeSetting var104 = this.settingBowCustomFacingX;
                     var126.method_47$24a796ab4c((float)var104.method_43$fedcb3e4d3());
                     client.setting.RangeSetting var105 = this.settingBowCustomFacingY;
                     var126.method_42$24a796ab4c((float)var105.method_43$fedcb3e4d3());
                     client.setting.RangeSetting var106 = this.settingBowCustomFacingZ;
                     var126.method_44$24a796ab4c((float)var106.method_43$fedcb3e4d3());
                  }

                  short var439 = (short)var11;
                  net.C_43r var107 = var22;
                  short var108 = var439;
                  int var109 = var10;
                  int var110 = var9;
                  NoSlow_47kC var111 = this;
                  var405 = var111.method_41$2610240745(var110, var109, var108, var107);
               }

               if (var18 != 0) {
                  if (!var405) {
                     return;
                  }

                  client.setting.BooleanSetting var113 = this.settingRestNullItem;
                  var405 = var113.method_49$aae029aa0a();
               }

               if (var18 != 0) {
                  if (var405) {
                     var126.method_46$9bd5253e1e(null);
                  }

                  client.setting.BooleanSetting var114 = this.settingRestEditFacing;
                  var405 = var114.method_49$aae029aa0a();
               }

               if (var18 != 0) {
                  if (var405) {
                     client.setting.RangeSetting var368 = this.settingRestCustomBlockPosX;
                     double var440 = var368.method_43$fedcb3e4d3();
                     client.setting.RangeSetting var373 = this.settingRestCustomBlockPosY;
                     double var459 = var373.method_43$fedcb3e4d3();
                     client.setting.RangeSetting var378 = this.settingRestCustomBlockPosZ;
                     var126.method_47$c96058c204(new net.C_478Q(var440, var459, var378.method_43$fedcb3e4d3()));
                  }

                  client.setting.BooleanSetting var383 = this.settingRestCustomFacing;
                  var405 = var383.method_49$aae029aa0a();
               }

               if (var405) {
                  client.setting.RangeSetting var388 = this.settingRestCustomFacingX;
                  var126.method_47$24a796ab4c((float)var388.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var393 = this.settingRestCustomFacingY;
                  var126.method_42$24a796ab4c((float)var393.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var398 = this.settingRestCustomFacingZ;
                  var126.method_44$24a796ab4c((float)var398.method_43$fedcb3e4d3());
               }

               return;
            }

            if (var430 != 0) {
               if (var405) {
                  net.C_47x6 var77 = net.C_47x6.INVALID_PACKET;
                  boolean var413 = var77.method_43$aae029aa0a();
                  if (var18 != 0) {
                     if (!var413) {
                        return;
                     }

                     client.setting.BooleanSetting var78 = this.settingSwordNullItem;
                     var413 = var78.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var413) {
                        var126.method_46$9bd5253e1e(null);
                     }

                     client.setting.BooleanSetting var79 = this.settingSwordEditFacing;
                     var413 = var79.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var413) {
                        long var80 = var7;
                        client.setting.NumberSetting var82 = this.settingSwordEnumFacingID;
                        var126.method_46$d00df7729d((int)var82.method_44$474dfaa627(var80));
                     }

                     client.setting.BooleanSetting var83 = this.settingSwordCustomBlockPos;
                     var413 = var83.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var413) {
                        client.setting.RangeSetting var84 = this.settingSwordCustomBlockPosX;
                        double var441 = var84.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var85 = this.settingSwordCustomBlockPosY;
                        double var460 = var85.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var86 = this.settingSwordCustomBlockPosZ;
                        var126.method_47$c96058c204(new net.C_478Q(var441, var460, var86.method_43$fedcb3e4d3()));
                     }

                     client.setting.BooleanSetting var87 = this.settingSwordCustomFacing;
                     var413 = var87.method_49$aae029aa0a();
                  }

                  if (!var413) {
                     return;
                  }

                  client.setting.RangeSetting var88 = this.settingSwordCustomFacingX;
                  var126.method_47$24a796ab4c((float)var88.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var89 = this.settingSwordCustomFacingY;
                  var126.method_42$24a796ab4c((float)var89.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var90 = this.settingSwordCustomFacingZ;
                  var126.method_44$24a796ab4c((float)var90.method_43$fedcb3e4d3());
               }

               net.C_43r var91 = var22;
               NoSlow_47kC var92 = this;
               var405 = var92.method_44$d654fe8697(var91);
            }

            if (var18 != 0) {
               if (var405) {
                  net.C_47G2 var306 = net.C_47G2.INVALID_PACKET;
                  boolean var414 = var306.method_43$aae029aa0a();
                  if (var18 != 0) {
                     if (!var414) {
                        return;
                     }

                     client.setting.BooleanSetting var94 = this.settingBowNullItem;
                     var414 = var94.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var414) {
                        var126.method_46$9bd5253e1e(null);
                     }

                     client.setting.BooleanSetting var310 = this.settingBowEditFacing;
                     var414 = var310.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var414) {
                        long var313 = var7;
                        client.setting.NumberSetting var316 = this.settingBowEnumFacingID;
                        var126.method_46$d00df7729d((int)var316.method_44$474dfaa627(var313));
                     }

                     client.setting.BooleanSetting var319 = this.settingBowCustomBlockPos;
                     var414 = var319.method_49$aae029aa0a();
                  }

                  if (var18 != 0) {
                     if (var414) {
                        client.setting.RangeSetting var322 = this.settingBowCustomBlockPosX;
                        double var442 = var322.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var325 = this.settingBowCustomBlockPosY;
                        double var461 = var325.method_43$fedcb3e4d3();
                        client.setting.RangeSetting var328 = this.settingBowCustomBlockPosZ;
                        var126.method_47$c96058c204(new net.C_478Q(var442, var461, var328.method_43$fedcb3e4d3()));
                     }

                     client.setting.BooleanSetting var331 = this.settingBowCustomFacing;
                     var414 = var331.method_49$aae029aa0a();
                  }

                  if (!var414) {
                     return;
                  }

                  client.setting.RangeSetting var334 = this.settingBowCustomFacingX;
                  var126.method_47$24a796ab4c((float)var334.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var337 = this.settingBowCustomFacingY;
                  var126.method_42$24a796ab4c((float)var337.method_43$fedcb3e4d3());
                  client.setting.RangeSetting var340 = this.settingBowCustomFacingZ;
                  var126.method_44$24a796ab4c((float)var340.method_43$fedcb3e4d3());
               }

               short var443 = (short)var11;
               net.C_43r var343 = var22;
               short var346 = var443;
               int var349 = var10;
               int var352 = var9;
               NoSlow_47kC var355 = this;
               var405 = var355.method_41$2610240745(var352, var349, var346, var343);
            }

            if (var18 != 0) {
               if (!var405) {
                  return;
               }

               net.C_47I9 var112 = net.C_47I9.INVALID_PACKET;
               var405 = var112.method_43$aae029aa0a();
            }

            if (var18 != 0) {
               if (!var405) {
                  return;
               }

               client.setting.BooleanSetting var359 = this.settingRestNullItem;
               var405 = var359.method_49$aae029aa0a();
            }

            if (var18 != 0) {
               if (var405) {
                  var126.method_46$9bd5253e1e(null);
               }

               client.setting.BooleanSetting var362 = this.settingRestEditFacing;
               var405 = var362.method_49$aae029aa0a();
            }

            if (var18 != 0) {
               if (var405) {
                  long var115 = var7;
                  client.setting.NumberSetting var117 = this.settingRestEnumFacingID;
                  var126.method_46$d00df7729d((int)var117.method_44$474dfaa627(var115));
               }

               client.setting.BooleanSetting var118 = this.settingRestCustomBlockPos;
               var405 = var118.method_49$aae029aa0a();
            }

            if (var18 != 0) {
               if (var405) {
                  client.setting.RangeSetting var369 = this.settingRestCustomBlockPosX;
                  double var444 = var369.method_43$fedcb3e4d3();
                  client.setting.RangeSetting var374 = this.settingRestCustomBlockPosY;
                  double var462 = var374.method_43$fedcb3e4d3();
                  client.setting.RangeSetting var379 = this.settingRestCustomBlockPosZ;
                  var126.method_47$c96058c204(new net.C_478Q(var444, var462, var379.method_43$fedcb3e4d3()));
               }

               client.setting.BooleanSetting var384 = this.settingRestCustomFacing;
               var405 = var384.method_49$aae029aa0a();
            }

            if (var405) {
               client.setting.RangeSetting var389 = this.settingRestCustomFacingX;
               var126.method_47$24a796ab4c((float)var389.method_43$fedcb3e4d3());
               client.setting.RangeSetting var394 = this.settingRestCustomFacingY;
               var126.method_42$24a796ab4c((float)var394.method_43$fedcb3e4d3());
               client.setting.RangeSetting var399 = this.settingRestCustomFacingZ;
               var126.method_44$24a796ab4c((float)var399.method_43$fedcb3e4d3());
            }

            return;
         }

         var407.field_437 = 0;
      }
   }













    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public void method_40$e781d6169a(C_47zh var1, long var2) {
      augustus.recovered.modules.movement.NoSlow_47kC var17;
      int var21;
      long var4 = var2 ^ 27738005618893L;
      long var10000 = 8498113391319509577L;
      byte var6 = (byte) ((Fly_47kE.method_49t$aae029aa0a()) ? 1 : 0);
      long var10001 = 8497325632338862299L;
      C_47zh var8 = var1;
      C_473U var7 = var8.method_44$96fcbedb66();
      var10001 = 8498527355919720675L;
      C_47x6 var9 = C_47x6.BLINK;
      int var15 = (int) ((var9.method_43$aae029aa0a()) ? 1 : 0);
      if (var6 == 0) {
         if (var15 == 0) {
            return;
         }

         var15 = this.field_43y;
      }

      byte var19 = var6;
      if (var2 > 0L) {
         if (var6 == 0) {
            if (var15 > 0) {
               long var10003 = 8497835913716463211L;
               boolean var10 = true;
               long var11 = var4;
               C_47zh var13 = var1;
               var13.method_47$b757cde368(var11, var10);
            }

            var15 = (int) ((var7 instanceof C_479E) ? 1 : 0);
         }

         var19 = var6;
      }

      label84: {
         label94: {
            if (var2 > 0L) {
               if (var19 == 0) {
                  label78: {
                     label77:
                     if (var15 != 0) {
                        label75: {
                           var10001 = 8501272291378699483L;
                           Minecraft var14 = field_43;
                           byte var16 = (byte) ((var14.field_42P.method_43B$aae029aa0a()) ? 1 : 0);
                           if (var2 >= 0L) {
                              if (var16 == 0) {
                                 break label75;
                              }

                              var17 = this;
                              var21 = this.field_43y + 1;
                              if (var2 < 0L) {
                                 break label78;
                              }

                              this.field_43y = var21;
                              var16 = var6;
                           }

                           if (var16 == 0) {
                              break label77;
                           }
                        }

                        this.field_43y = 0;
                     }

                     var17 = this;
                     var21 = var6;
                  }

                  if (var2 <= 0L) {
                     break label84;
                  }

                  if (var21 != 0) {
                     break label94;
                  }

                  var15 = var17.field_43y;
               }

               var19 = 3;
            }

            if (var15 <= var19) {
               return;
            }

            var17 = this;
         }

         var21 = 0;
      }

      var17.field_43y = var21;
   }




   private boolean method_40$3a90a9f73e(ModeSetting var1, NumberSetting var2, long var3, NumberSetting var5, char var6) {
      long var7 = (var3 << 16 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 105944428005448L;
      long var11 = var7 ^ 101422123696582L;
      long var10000 = 305537612091333531L;
      boolean var13 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 297610273943617076L;
      BooleanSetting var15 = this.settingEnableIntervals;
      boolean var55 = var15.method_49$aae029aa0a();
      if (!var13) {
         label141:
         if (var55) {
            long var10002 = 297356431575955256L;
            long var16 = var11;
            ModeSetting var18 = var1;
            int var56 = (int) ((var18.method_46$5f9dc63072(var16).equalsIgnoreCase("None")) ? 1 : 0);
            boolean var63 = var13;
            if (var3 > 0L) {
               if (!var13) {
                  if (var56 != 0) {
                     break label141;
                  }

                  var10002 = 297576522422879913L;
                  long var19 = var9;
                  NumberSetting var21 = var2;
                  double var57 = var21.method_44$474dfaa627(var19);
                  long var10003 = 297576522422879913L;
                  long var22 = var9;
                  NumberSetting var24 = var5;
                  double var78;
                  var56 = (var78 = var57 - var24.method_44$474dfaa627(var22)) == 0.0 ? 0 : (var78 < 0.0 ? -1 : 1);
               }

               var63 = var13;
            }

            if (var3 > 0L) {
               if (!var63) {
                  if (var56 == 0) {
                     var10002 = 297576522422879913L;
                     long var25 = var9;
                     NumberSetting var27 = var2;
                     double var79;
                     int var61 = (var79 = var27.method_44$474dfaa627(var25) - 0.0) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                     if (!var13) {
                        if (var61 == 0) {
                           return true;
                        }

                        var10002 = 297576522422879913L;
                        long var28 = var9;
                        NumberSetting var30 = var2;
                        var61 = (int)(var30.method_44$474dfaa627(var28) + 1.0);
                     }

                     int var54 = var61;
                     var10002 = 297356431575955256L;
                     long var31 = var11;
                     ModeSetting var33 = var1;
                     byte var62 = (byte) ((var33.method_46$5f9dc63072(var31).equalsIgnoreCase("TicksToNextSlowdownApply")) ? 1 : 0);
                     int var67 = this.field_43p % var54;
                     if (!var13) {
                        var67 = var67 == 0 ? 1 : 0;
                     }

                     return var62 == var67;
                  }

                  var10001 = 299691509917216009L;
                  Minecraft var34 = field_43;
                  var56 = (int) ((var34.field_42P.field_48M) ? 1 : 0);
               }

               var63 = var13;
            }

            if (var3 >= 0L) {
               if (!var63) {
                  if (var56 != 0) {
                     var10002 = 297576522422879913L;
                     long var35 = var9;
                     NumberSetting var37 = var5;
                     double var80;
                     int var59 = (var80 = var37.method_44$474dfaa627(var35) - 0.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                     if (!var13) {
                        if (var59 == 0) {
                           return true;
                        }

                        var10002 = 297576522422879913L;
                        long var38 = var9;
                        NumberSetting var40 = var5;
                        var59 = (int)(var40.method_44$474dfaa627(var38) + 1.0);
                     }

                     int var53 = var59;
                     var10002 = 297356431575955256L;
                     long var41 = var11;
                     ModeSetting var43 = var1;
                     byte var60 = (byte) ((var43.method_46$5f9dc63072(var41).equalsIgnoreCase("TicksToNextSlowdownApply")) ? 1 : 0);
                     int var66 = this.field_438 % var53;
                     if (!var13) {
                        var66 = var66 == 0 ? 1 : 0;
                     }

                     return var60 == var66;
                  }

                  var10002 = 297576522422879913L;
                  long var44 = var9;
                  NumberSetting var46 = var2;
                  double var81;
                  var56 = (var81 = var46.method_44$474dfaa627(var44) - 0.0) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
               }

               var63 = var13;
            }

            if (!var63) {
               if (var56 == 0) {
                  return true;
               }

               var10002 = 297576522422879913L;
               long var47 = var9;
               NumberSetting var49 = var2;
               var56 = (int)(var49.method_44$474dfaa627(var47) + 1.0);
            }

            int var14 = var56;
            var10002 = 297356431575955256L;
            long var50 = var11;
            ModeSetting var52 = var1;
            byte var58 = (byte) ((var52.method_46$5f9dc63072(var50).equalsIgnoreCase("TicksToNextSlowdownApply")) ? 1 : 0);
            int var65 = this.field_42 % var14;
            if (!var13) {
               var65 = var65 == 0 ? 1 : 0;
            }

            return var58 == var65;
         }

         var55 = true;
      }

      return var55;
   }





   public void method_44$cecb73866e(int var1, net.C_47K7 var2, long var3) {
        net.minecraft.client.entity.EntityPlayerSP var507;
        augustus.recovered.modules.movement.NoSlow_47kC var508;
        net.minecraft.client.entity.EntityPlayerSP var518;
        augustus.recovered.modules.movement.NoSlow_47kC var519;
        augustus.recovered.modules.movement.NoSlow_47kC var520;
        net.minecraft.client.entity.EntityPlayerSP var523;
        augustus.recovered.modules.movement.NoSlow_47kC var524;
        augustus.recovered.modules.movement.NoSlow_47kC var525;
        net.minecraft.client.entity.EntityPlayerSP var527;
        augustus.recovered.modules.movement.NoSlow_47kC var528;
        augustus.recovered.modules.movement.NoSlow_47kC var529;
        int var534;
        int var535;
        int var539;
        int var540;
        int var543;
        int var547;
        int var548;
        int var550;
        int var551;
        int var553;
        int var555;
        int var556;
        int var557;
        int var558;
        int var560;
        int var561;
        int var563;
        int var564;
        int var565;
        int var567;
        int var569;
        int var571;
        int var573;
        int var574;
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 16278467465158L;
      int var9 = (int)((var5 ^ 109137306953338L) >>> 32);
      long var10 = (var5 ^ 109137306953338L) << 32 >>> 32;
      long var10001 = var5 ^ 47501230916980L;
      int var12 = (int)((var5 ^ 47501230916980L) >>> 32);
      int var13 = (int)((var5 ^ 47501230916980L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 59504206994619L;
      int var15 = (int)((var5 ^ 59504206994619L) >>> 32);
      int var16 = (int)((var5 ^ 59504206994619L) << 32 >>> 56);
      int var17 = (int)(var10001 << 40 >>> 40);
      long var18 = var5 ^ 73137895425069L;
      long var20 = var5 ^ 115942598083693L;
      long var22 = var5 ^ 139381814684897L;
      long var24 = var5 ^ 60309322328901L;
      var10001 = var5 ^ 30416238492471L;
      int var26 = (int)((var5 ^ 30416238492471L) >>> 32);
      int var27 = (int)((var5 ^ 30416238492471L) << 32 >>> 48);
      int var28 = (int)(var10001 << 48 >>> 48);
      byte var29 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      net.C_47G2 var33 = net.C_47G2.SWITCH_CUSTOM;
      int var10000 = ((int) (var33.method_43$aae029aa0a() ? 1 : 0));
      if (var29 == 0) {
         label2144: {
            label2143: {
               label2142: {
                  label2480: {
                     net.C_43r var196;
                     label2481: {
                        label2099:
                        if (var10000 == 0) {
                           net.C_47I9 var34 = net.C_47I9.SWITCH_CUSTOM;
                           var10000 = ((int) (var34.method_43$aae029aa0a() ? 1 : 0));
                           byte var552 = var29;
                           if (var3 > 0L) {
                              label2091: {
                                 label2090: {
                                    label2377: {
                                       if (var29 == 0) {
                                          if (var10000 == 0) {
                                             break label2377;
                                          }

                                          net.minecraft.client.Minecraft var208 = field_43;
                                          var10000 = var208.field_42P.field_486;
                                       }

                                       label2083: {
                                          label2378: {
                                             var564 = var29;
                                             if (var1 > 0) {
                                                if (var29 != 0) {
                                                   break label2378;
                                                }

                                                var564 = 2;
                                             }

                                             label2076: {
                                                label2379: {
                                                   if (var1 > 0) {
                                                      if (var10000 != var564) {
                                                         break label2379;
                                                      }

                                                      var10000 = ((int) (this.field_43a ? 1 : 0));
                                                      var564 = var29;
                                                   }

                                                   if (var1 < 0) {
                                                      break label2083;
                                                   }

                                                   if (var564 != 0) {
                                                      break label2378;
                                                   }

                                                   if (var10000 != 0) {
                                                      this.field_43a = false;
                                                      net.minecraft.client.Minecraft var211 = field_43;
                                                      var527 = var211.field_42P;
                                                      if (var1 >= 0) {
                                                         net.minecraft.client.Minecraft var214 = field_43;
                                                         var211.field_42P.field_49m.method_43$631790539f(new net.C_42V(var214.field_42P.method_41$ac4db64966()));
                                                         break label2377;
                                                      }
                                                      break label2076;
                                                   }
                                                }

                                                net.minecraft.client.Minecraft var217 = field_43;
                                                var527 = var217.field_42P;
                                             }

                                             var10000 = ((int) (var527.method_436$aae029aa0a() ? 1 : 0));
                                          }

                                          var564 = var29;
                                       }

                                       if (var564 == 0) {
                                          if (var10000 == 0) {
                                             break label2377;
                                          }

                                          var528 = this;
                                          var565 = var29;
                                          if (var1 < 0) {
                                             break label2091;
                                          }

                                          if (var29 != 0) {
                                             break label2090;
                                          }

                                          long var220 = var10;
                                          int var223 = var9;
                                          NoSlow_47kC var226 = this;
                                          net.C_47rf var566 = var226.method_41$9c52b54a6d(var223, var220);
                                          long var229 = var18;
                                          net.C_47rf var232 = var566;
                                          NoSlow_47kC var235 = this;
                                          var10000 = ((int) (var235.method_44$54e912928c(var232, var229) ? 1 : 0));
                                       }

                                       if (var10000 != 0) {
                                          net.C_47K7 var238 = var2;
                                          double var241 = var238.method_44$fedcb3e4d3() + 1.0E-14;
                                          net.C_47K7 var244 = var2;
                                          var244.method_48$2c20cf5948(var241);
                                       }
                                    }

                                    var528 = this;
                                 }

                                 var565 = var9;
                              }

                              long var247 = var10;
                              int var250 = var565;
                              NoSlow_47kC var253 = var528;
                              net.C_47rf var195 = var253.method_41$9c52b54a6d(var250, var247);
                              var529 = this;
                              var567 = var29;
                              if (var1 <= 0) {
                                 break label2480;
                              }

                              if (var29 == 0) {
                                 long var256 = var24;
                                 net.C_47rf var259 = var195;
                                 NoSlow_47kC var262 = this;
                                 if (!var262.method_46$54e912928c(var259, var256)) {
                                    var196 = var195.method_48$dbd570a038();
                                    net.C_43r var265 = var196;
                                    NoSlow_47kC var268 = this;
                                    var10000 = ((int) (var268.method_45$d654fe8697(var265) ? 1 : 0));
                                    var551 = var29;
                                    break label2481;
                                 }

                                 var529 = this;
                              }

                              var567 = 0;
                              break label2480;
                           }

                           label2033: {
                              label2032: {
                                 label2381: {
                                    label2030: {
                                       label2382: {
                                          if (var1 > 0) {
                                             if (var29 != 0) {
                                                break label2382;
                                             }

                                             var552 = 2;
                                          }

                                          label2023: {
                                             label2383: {
                                                if (var1 > 0) {
                                                   if (var10000 != var552) {
                                                      break label2383;
                                                   }

                                                   var10000 = ((int) (this.field_43a ? 1 : 0));
                                                   var552 = var29;
                                                }

                                                if (var1 < 0) {
                                                   break label2030;
                                                }

                                                if (var552 != 0) {
                                                   break label2382;
                                                }

                                                if (var10000 != 0) {
                                                   this.field_43a = false;
                                                   net.minecraft.client.Minecraft var210 = field_43;
                                                   var523 = var210.field_42P;
                                                   if (var1 >= 0) {
                                                      net.minecraft.client.Minecraft var213 = field_43;
                                                      var210.field_42P.field_49m.method_43$631790539f(new net.C_42V(var213.field_42P.method_41$ac4db64966()));
                                                      break label2381;
                                                   }
                                                   break label2023;
                                                }
                                             }

                                             net.minecraft.client.Minecraft var216 = field_43;
                                             var523 = var216.field_42P;
                                          }

                                          var10000 = ((int) (var523.method_436$aae029aa0a() ? 1 : 0));
                                       }

                                       var552 = var29;
                                    }

                                    if (var552 == 0) {
                                       if (var10000 == 0) {
                                          break label2381;
                                       }

                                       var524 = this;
                                       var553 = var29;
                                       if (var1 < 0) {
                                          break label2033;
                                       }

                                       if (var29 != 0) {
                                          break label2032;
                                       }

                                       long var219 = var10;
                                       int var222 = var9;
                                       NoSlow_47kC var225 = this;
                                       net.C_47rf var554 = var225.method_41$9c52b54a6d(var222, var219);
                                       long var228 = var18;
                                       net.C_47rf var231 = var554;
                                       NoSlow_47kC var234 = this;
                                       var10000 = ((int) (var234.method_44$54e912928c(var231, var228) ? 1 : 0));
                                    }

                                    if (var10000 != 0) {
                                       net.C_47K7 var237 = var2;
                                       double var240 = var237.method_44$fedcb3e4d3() + 1.0E-14;
                                       net.C_47K7 var243 = var2;
                                       var243.method_48$2c20cf5948(var240);
                                    }
                                 }

                                 var524 = this;
                              }

                              var553 = var9;
                           }

                           long var246 = var10;
                           int var249 = var553;
                           NoSlow_47kC var252 = var524;
                           net.C_47rf var194 = var252.method_41$9c52b54a6d(var249, var246);
                           var525 = this;
                           var555 = var29;
                           if (var1 <= 0) {
                              break label2143;
                           }

                           if (var29 == 0) {
                              long var255 = var24;
                              net.C_47rf var258 = var194;
                              NoSlow_47kC var261 = this;
                              if (!var261.method_46$54e912928c(var258, var255)) {
                                 var196 = var194.method_48$dbd570a038();
                                 net.C_43r var264 = var196;
                                 NoSlow_47kC var267 = this;
                                 var10000 = ((int) (var267.method_45$d654fe8697(var264) ? 1 : 0));
                                 var551 = var29;
                                 break label2099;
                              }

                              var525 = this;
                           }

                           var555 = 0;
                           break label2143;
                        } else {
                           label2137: {
                              label2136: {
                                 label2385: {
                                    label2134: {
                                       label2386: {
                                          net.minecraft.client.Minecraft var35 = field_43;
                                          var10000 = var35.field_42P.field_486;
                                          var547 = var29;
                                          if (var1 > 0) {
                                             if (var29 != 0) {
                                                break label2386;
                                             }

                                             var547 = 2;
                                          }

                                          label2127: {
                                             label2387: {
                                                if (var1 > 0) {
                                                   if (var35.field_42P.field_486 != var547) {
                                                      break label2387;
                                                   }

                                                   var10000 = ((int) (this.field_43a ? 1 : 0));
                                                   var547 = var29;
                                                }

                                                if (var1 < 0) {
                                                   break label2134;
                                                }

                                                if (var547 != 0) {
                                                   break label2386;
                                                }

                                                if (var10000 != 0) {
                                                   this.field_43a = false;
                                                   net.minecraft.client.Minecraft var209 = field_43;
                                                   var518 = var209.field_42P;
                                                   if (var1 >= 0) {
                                                      net.minecraft.client.Minecraft var212 = field_43;
                                                      var209.field_42P.field_49m.method_43$631790539f(new net.C_42V(var212.field_42P.method_41$ac4db64966()));
                                                      break label2385;
                                                   }
                                                   break label2127;
                                                }
                                             }

                                             net.minecraft.client.Minecraft var215 = field_43;
                                             var518 = var215.field_42P;
                                          }

                                          var10000 = ((int) (var518.method_436$aae029aa0a() ? 1 : 0));
                                       }

                                       var547 = var29;
                                    }

                                    if (var547 == 0) {
                                       if (var10000 == 0) {
                                          break label2385;
                                       }

                                       var519 = this;
                                       var548 = var29;
                                       if (var1 < 0) {
                                          break label2137;
                                       }

                                       if (var29 != 0) {
                                          break label2136;
                                       }

                                       long var218 = var10;
                                       int var221 = var9;
                                       NoSlow_47kC var224 = this;
                                       net.C_47rf var549 = var224.method_41$9c52b54a6d(var221, var218);
                                       long var227 = var18;
                                       net.C_47rf var230 = var549;
                                       NoSlow_47kC var233 = this;
                                       var10000 = ((int) (var233.method_44$54e912928c(var230, var227) ? 1 : 0));
                                    }

                                    if (var10000 != 0) {
                                       net.C_47K7 var236 = var2;
                                       double var239 = var236.method_44$fedcb3e4d3() + 1.0E-14;
                                       net.C_47K7 var242 = var2;
                                       var242.method_48$2c20cf5948(var239);
                                    }
                                 }

                                 var519 = this;
                              }

                              var548 = var9;
                           }

                           long var245 = var10;
                           int var248 = var548;
                           NoSlow_47kC var251 = var519;
                           net.C_47rf var193 = var251.method_41$9c52b54a6d(var248, var245);
                           var520 = this;
                           var550 = var29;
                           if (var1 <= 0) {
                              break label2144;
                           }

                           if (var29 != 0) {
                              break label2142;
                           }

                           long var254 = var24;
                           net.C_47rf var257 = var193;
                           NoSlow_47kC var260 = this;
                           if (var260.method_46$54e912928c(var257, var254)) {
                              var520 = this;
                              break label2142;
                           }

                           var196 = var193.method_48$dbd570a038();
                           net.C_43r var263 = var196;
                           NoSlow_47kC var266 = this;
                           var10000 = ((int) (var266.method_45$d654fe8697(var263) ? 1 : 0));
                           var551 = var29;
                           if (var3 > 0L) {
                              break label2481;
                           }
                        }

                        if (var3 >= 0L) {
                           if (var551 == 0) {
                              if (var10000 != 0) {
                                 net.C_47G2 var293 = net.C_47G2.INPUT;
                                 boolean var526 = var293.method_43$aae029aa0a();
                                 byte var562 = var29;
                                 if (var1 > 0) {
                                    if (var29 == 0) {
                                       if (var526) {
                                          byte var580 = (byte)var16;
                                          int var296 = var17;
                                          byte var299 = var580;
                                          int var302 = var15;
                                          NoSlow_47kC var305 = this;
                                          var305.method_47$fdbf2d7fa0(var302, var299, var296);
                                       }

                                       net.C_47G2 var308 = net.C_47G2.TOGGLE;
                                       var526 = var308.method_43$aae029aa0a();
                                    }

                                    var562 = var29;
                                 }

                                 if (var1 >= 0) {
                                    if (var562 == 0) {
                                       if (var526) {
                                          net.minecraft.client.Minecraft var311 = field_43;
                                          var311.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                                       }

                                       net.C_47G2 var314 = net.C_47G2.SWITCH;
                                       var526 = var314.method_43$aae029aa0a();
                                    }

                                    var562 = var29;
                                 }

                                 label1930: {
                                    label1929:
                                    if (var562 == 0) {
                                       label1927:
                                       if (var526) {
                                          long var317 = var20;
                                          client.setting.ModeSetting var320 = this.settingSwitchMode;
                                          if (!var320.method_46$5f9dc63072(var317).equals("PrePosition")) {
                                             long var115 = var20;
                                             client.setting.ModeSetting var117 = this.settingSwitchMode;
                                             if (!var117.method_46$5f9dc63072(var115).equals("PrePostPosition")) {
                                                break label1927;
                                             }
                                          }

                                          net.minecraft.client.Minecraft var118 = field_43;
                                          short var588 = (short)var27;
                                          char var119 = (char)var28;
                                          short var120 = var588;
                                          int var121 = var26;
                                          int var122 = var118.field_42P.field_42X.field_42;
                                          NoSlow_47kC var123 = this;
                                          int var204 = var123.method_43$4397a0fda1(var122, var121, var120, var119);
                                          if (var204 >= 0) {
                                             net.minecraft.client.Minecraft var124 = field_43;
                                             var124.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var204));
                                             long var125 = var20;
                                             client.setting.ModeSetting var127 = this.settingSwitchMode;
                                             var526 = var127.method_46$5f9dc63072(var125).equals("PrePosition");
                                             var563 = var29;
                                             if (var1 <= 0) {
                                                break label1930;
                                             }

                                             if (var29 != 0) {
                                                break label1929;
                                             }

                                             if (var526) {
                                                net.minecraft.client.Minecraft var128 = field_43;
                                                net.minecraft.client.Minecraft var129 = field_43;
                                                var128.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var129.field_42P.field_42X.field_42));
                                             }
                                          }
                                       }

                                       net.C_47G2 var336 = net.C_47G2.PLACE;
                                       var526 = var336.method_43$aae029aa0a();
                                    }

                                    var563 = var29;
                                 }

                                 if (var563 == 0) {
                                    if (var526) {
                                       net.minecraft.client.Minecraft var339 = field_43;
                                       var339.field_42P
                                          .field_49m
                                          .method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), net.C_484.UP.method_43$8abf5c6871(), null, 0.0F, 0.0F, 0.0F));
                                    }

                                    net.C_47G2 var342 = net.C_47G2.SLOT;
                                    var526 = var342.method_43$aae029aa0a();
                                 }

                                 label1912:
                                 if (var29 == 0) {
                                    if (var526) {
                                       long var345 = var20;
                                       client.setting.ModeSetting var348 = this.settingSlotMode;
                                       var526 = var348.method_46$5f9dc63072(var345).equals("PrePosition");
                                       if (var29 != 0) {
                                          break label1912;
                                       }

                                       if (var526) {
                                          net.minecraft.client.Minecraft var351 = field_43;
                                          net.minecraft.client.Minecraft var354 = field_43;
                                          var351.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var354.field_42P.field_42X.field_42));
                                       }
                                    }

                                    net.C_47G2 var357 = net.C_47G2.SPAM;
                                    var526 = var357.method_43$aae029aa0a();
                                 }

                                 if (var29 == 0) {
                                    if (!var526) {
                                       return;
                                    }

                                    long var360 = var20;
                                    client.setting.ModeSetting var363 = this.settingSpamMode;
                                    var526 = var363.method_46$5f9dc63072(var360).equals("PrePosition");
                                 }

                                 if (var526) {
                                    net.minecraft.client.Minecraft var366 = field_43;
                                    net.minecraft.client.Minecraft var369 = field_43;
                                    var366.field_42P.field_49m.method_45$631790539f(new net.C_42V(var369.field_42P.field_42X.method_46$ac4db64966()));
                                 }

                                 return;
                              }

                              short var586 = (short)var14;
                              net.C_43r var372 = var196;
                              short var375 = var586;
                              int var378 = var13;
                              int var381 = var12;
                              NoSlow_47kC var384 = this;
                              var10000 = ((int) (var384.method_41$2610240745(var381, var378, var375, var372) ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              net.C_47I9 var387 = net.C_47I9.INPUT;
                              var10000 = ((int) (var387.method_43$aae029aa0a() ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var10000 != 0) {
                                 byte var579 = (byte)var16;
                                 int var390 = var17;
                                 byte var393 = var579;
                                 int var396 = var15;
                                 NoSlow_47kC var399 = this;
                                 var399.method_47$fdbf2d7fa0(var396, var393, var390);
                              }

                              net.C_47I9 var402 = net.C_47I9.TOGGLE;
                              var10000 = ((int) (var402.method_43$aae029aa0a() ? 1 : 0));
                           }

                           byte var559 = var29;
                           if (var1 >= 0) {
                              if (var29 == 0) {
                                 if (var10000 != 0) {
                                    net.minecraft.client.Minecraft var407 = field_43;
                                    var407.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                                 }

                                 net.C_47I9 var412 = net.C_47I9.SWITCH;
                                 var10000 = ((int) (var412.method_43$aae029aa0a() ? 1 : 0));
                              }

                              var559 = var29;
                           }

                           label1897: {
                              label1896:
                              if (var559 == 0) {
                                 label1894:
                                 if (var10000 != 0) {
                                    long var417 = var20;
                                    client.setting.ModeSetting var422 = this.settingSwitchMode;
                                    if (!var422.method_46$5f9dc63072(var417).equals("PrePosition")) {
                                       long var424 = var20;
                                       client.setting.ModeSetting var426 = this.settingSwitchMode;
                                       if (!var426.method_46$5f9dc63072(var424).equals("PrePostPosition")) {
                                          break label1894;
                                       }
                                    }

                                    net.minecraft.client.Minecraft var428 = field_43;
                                    short var587 = (short)var27;
                                    char var430 = (char)var28;
                                    short var432 = var587;
                                    int var434 = var26;
                                    int var436 = var428.field_42P.field_42X.field_42;
                                    NoSlow_47kC var438 = this;
                                    int var203 = var438.method_43$4397a0fda1(var436, var434, var432, var430);
                                    if (var203 >= 0) {
                                       long var440 = var7;
                                       augustus.recovered.modules.world.Scaffold_47Te var442 = client.ClientGlobals.field_48.field_46q;
                                       if (!var442.method_46$0dd78e0064(var440)) {
                                          net.minecraft.client.Minecraft var444 = field_43;
                                          var444.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var203));
                                          long var446 = var20;
                                          client.setting.ModeSetting var448 = this.settingSwitchMode;
                                          var10000 = ((int) (var448.method_46$5f9dc63072(var446).equals("PrePosition") ? 1 : 0));
                                          var560 = var29;
                                          if (var1 < 0) {
                                             break label1897;
                                          }

                                          if (var29 != 0) {
                                             break label1896;
                                          }

                                          if (var10000 != 0) {
                                             net.minecraft.client.Minecraft var450 = field_43;
                                             net.minecraft.client.Minecraft var452 = field_43;
                                             var450.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var452.field_42P.field_42X.field_42));
                                          }
                                       }
                                    }
                                 }

                                 net.C_47I9 var457 = net.C_47I9.SLOT;
                                 var10000 = ((int) (var457.method_43$aae029aa0a() ? 1 : 0));
                              }

                              var560 = var29;
                           }

                           label1880: {
                              if (var560 == 0) {
                                 if (var10000 != 0) {
                                    long var462 = var20;
                                    client.setting.ModeSetting var467 = this.settingSlotMode;
                                    var10000 = ((int) (var467.method_46$5f9dc63072(var462).equals("PrePosition") ? 1 : 0));
                                    var561 = var29;
                                    break label1880;
                                 }

                                 net.C_47I9 var474 = net.C_47I9.SPAM;
                                 var10000 = ((int) (var474.method_43$aae029aa0a() ? 1 : 0));
                              }

                              var561 = var29;
                           }

                           label1873:
                           if (var561 == 0) {
                              if (var10000 != 0) {
                                 long var479 = var20;
                                 client.setting.ModeSetting var484 = this.settingSpamMode;
                                 var10000 = ((int) (var484.method_46$5f9dc63072(var479).equals("PrePosition") ? 1 : 0));
                                 if (var29 != 0) {
                                    break label1873;
                                 }

                                 if (var10000 != 0) {
                                    net.minecraft.client.Minecraft var487 = field_43;
                                    net.minecraft.client.Minecraft var490 = field_43;
                                    var487.field_42P.field_49m.method_45$631790539f(new net.C_42V(var490.field_42P.field_42X.method_46$ac4db64966()));
                                 }
                              }

                              net.C_47I9 var495 = net.C_47I9.SPAM2;
                              var10000 = ((int) (var495.method_43$aae029aa0a() ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              var10000 = ((int) (recovery$indy$flow$1328(var22, 4720299783452217689L, var5) ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              net.minecraft.client.Minecraft var500 = field_43;
                              var10000 = var500.field_42P.field_48y % 5;
                           }

                           if (var10000 == 0) {
                              net.minecraft.client.Minecraft var505 = field_43;
                              var505.field_42P.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                           }

                           return;
                        }

                        if (var1 >= 0) {
                           if (var551 == 0) {
                              if (var10000 != 0) {
                                 net.minecraft.client.Minecraft var406 = field_43;
                                 var406.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                              }

                              net.C_47I9 var411 = net.C_47I9.SWITCH;
                              var10000 = ((int) (var411.method_43$aae029aa0a() ? 1 : 0));
                           }

                           var551 = var29;
                        }

                        label1979: {
                           label1978:
                           if (var551 == 0) {
                              label1976:
                              if (var10000 != 0) {
                                 long var416 = var20;
                                 client.setting.ModeSetting var421 = this.settingSwitchMode;
                                 if (!var421.method_46$5f9dc63072(var416).equals("PrePosition")) {
                                    long var160 = var20;
                                    client.setting.ModeSetting var162 = this.settingSwitchMode;
                                    if (!var162.method_46$5f9dc63072(var160).equals("PrePostPosition")) {
                                       break label1976;
                                    }
                                 }

                                 net.minecraft.client.Minecraft var163 = field_43;
                                 short var585 = (short)var27;
                                 char var164 = (char)var28;
                                 short var165 = var585;
                                 int var166 = var26;
                                 int var167 = var163.field_42P.field_42X.field_42;
                                 NoSlow_47kC var168 = this;
                                 int var202 = var168.method_43$4397a0fda1(var167, var166, var165, var164);
                                 if (var202 >= 0) {
                                    long var169 = var7;
                                    augustus.recovered.modules.world.Scaffold_47Te var171 = client.ClientGlobals.field_48.field_46q;
                                    if (!var171.method_46$0dd78e0064(var169)) {
                                       net.minecraft.client.Minecraft var172 = field_43;
                                       var172.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var202));
                                       long var173 = var20;
                                       client.setting.ModeSetting var175 = this.settingSwitchMode;
                                       var10000 = ((int) (var175.method_46$5f9dc63072(var173).equals("PrePosition") ? 1 : 0));
                                       var556 = var29;
                                       if (var1 < 0) {
                                          break label1979;
                                       }

                                       if (var29 != 0) {
                                          break label1978;
                                       }

                                       if (var10000 != 0) {
                                          net.minecraft.client.Minecraft var176 = field_43;
                                          net.minecraft.client.Minecraft var177 = field_43;
                                          var176.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var177.field_42P.field_42X.field_42));
                                       }
                                    }
                                 }
                              }

                              net.C_47I9 var456 = net.C_47I9.SLOT;
                              var10000 = ((int) (var456.method_43$aae029aa0a() ? 1 : 0));
                           }

                           var556 = var29;
                        }

                        label1962: {
                           if (var556 == 0) {
                              if (var10000 != 0) {
                                 long var461 = var20;
                                 client.setting.ModeSetting var466 = this.settingSlotMode;
                                 var10000 = ((int) (var466.method_46$5f9dc63072(var461).equals("PrePosition") ? 1 : 0));
                                 var557 = var29;
                                 break label1962;
                              }

                              net.C_47I9 var473 = net.C_47I9.SPAM;
                              var10000 = ((int) (var473.method_43$aae029aa0a() ? 1 : 0));
                           }

                           var557 = var29;
                        }

                        label1956: {
                           if (var557 == 0) {
                              if (var10000 != 0) {
                                 long var478 = var20;
                                 client.setting.ModeSetting var483 = this.settingSpamMode;
                                 var10000 = ((int) (var483.method_46$5f9dc63072(var478).equals("PrePosition") ? 1 : 0));
                                 var558 = var29;
                                 break label1956;
                              }

                              net.C_47I9 var494 = net.C_47I9.SPAM2;
                              var10000 = ((int) (var494.method_43$aae029aa0a() ? 1 : 0));
                           }

                           var558 = var29;
                        }

                        if (var558 == 0) {
                           if (var10000 == 0) {
                              return;
                           }

                           net.minecraft.client.Minecraft var499 = field_43;
                           var10000 = var499.field_42P.field_48y % 5;
                        }

                        if (var10000 == 0) {
                           net.minecraft.client.Minecraft var504 = field_43;
                           var504.field_42P.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                        }

                        return;
                     }

                     if (var551 == 0) {
                        if (var10000 != 0) {
                           net.C_47x6 var269 = net.C_47x6.INPUT;
                           boolean var531 = var269.method_43$aae029aa0a();
                           byte var572 = var29;
                           if (var1 >= 0) {
                              if (var29 == 0) {
                                 if (var531) {
                                    byte var583 = (byte)var16;
                                    int var270 = var17;
                                    byte var271 = var583;
                                    int var272 = var15;
                                    NoSlow_47kC var273 = this;
                                    var273.method_47$fdbf2d7fa0(var272, var271, var270);
                                 }

                                 var531 = recovery$indy$flow$998(var22, 4720299783452217689L, var5);
                              }

                              var572 = var29;
                           }

                           label1839: {
                              label1838:
                              if (var572 == 0) {
                                 if (var531) {
                                    net.minecraft.client.Minecraft var274 = field_43;
                                    if (var274.field_42P.field_48y % 5 == 0) {
                                       net.C_47x6 var67 = net.C_47x6.INVALID_DELAY;
                                       var531 = var67.method_43$aae029aa0a();
                                       var573 = var29;
                                       if (var1 <= 0) {
                                          break label1839;
                                       }

                                       if (var29 != 0) {
                                          break label1838;
                                       }

                                       if (var531) {
                                          net.minecraft.client.Minecraft var68 = field_43;
                                          var68.field_42P.field_49m.method_43$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                                       }
                                    }
                                 }

                                 net.C_47x6 var275 = net.C_47x6.TOGGLE;
                                 var531 = var275.method_43$aae029aa0a();
                              }

                              var573 = var29;
                           }

                           if (var573 == 0) {
                              if (var531) {
                                 net.minecraft.client.Minecraft var276 = field_43;
                                 var276.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                              }

                              net.C_47x6 var277 = net.C_47x6.SWITCH;
                              var531 = var277.method_43$aae029aa0a();
                           }

                           label1826: {
                              label1825:
                              if (var29 == 0) {
                                 label1823:
                                 if (var531) {
                                    long var278 = var20;
                                    client.setting.ModeSetting var279 = this.settingSwitchMode;
                                    if (!var279.method_46$5f9dc63072(var278).equals("PrePosition")) {
                                       long var75 = var20;
                                       client.setting.ModeSetting var77 = this.settingSwitchMode;
                                       if (!var77.method_46$5f9dc63072(var75).equals("PrePostPosition")) {
                                          break label1823;
                                       }
                                    }

                                    net.minecraft.client.Minecraft var78 = field_43;
                                    short var592 = (short)var27;
                                    char var79 = (char)var28;
                                    short var80 = var592;
                                    int var81 = var26;
                                    int var82 = var78.field_42P.field_42X.field_42;
                                    NoSlow_47kC var83 = this;
                                    int var207 = var83.method_43$4397a0fda1(var82, var81, var80, var79);
                                    if (var207 >= 0) {
                                       net.minecraft.client.Minecraft var84 = field_43;
                                       var84.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var207));
                                       long var85 = var20;
                                       client.setting.ModeSetting var87 = this.settingSwitchMode;
                                       var531 = var87.method_46$5f9dc63072(var85).equals("PrePosition");
                                       var574 = var29;
                                       if (var1 < 0) {
                                          break label1826;
                                       }

                                       if (var29 != 0) {
                                          break label1825;
                                       }

                                       if (var531) {
                                          net.minecraft.client.Minecraft var88 = field_43;
                                          net.minecraft.client.Minecraft var89 = field_43;
                                          var88.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var89.field_42P.field_42X.field_42));
                                       }
                                    }
                                 }

                                 net.C_47x6 var280 = net.C_47x6.SLOT;
                                 var531 = var280.method_43$aae029aa0a();
                              }

                              var574 = var29;
                           }

                           label1809:
                           if (var574 == 0) {
                              if (var531) {
                                 long var281 = var20;
                                 client.setting.ModeSetting var282 = this.settingSlotMode;
                                 var531 = var282.method_46$5f9dc63072(var281).equals("PrePosition");
                                 if (var29 != 0) {
                                    break label1809;
                                 }

                                 if (var531) {
                                    net.minecraft.client.Minecraft var283 = field_43;
                                    net.minecraft.client.Minecraft var284 = field_43;
                                    var283.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var284.field_42P.field_42X.field_42));
                                 }
                              }

                              net.C_47x6 var285 = net.C_47x6.SPAM;
                              var531 = var285.method_43$aae029aa0a();
                           }

                           if (var29 == 0) {
                              if (!var531) {
                                 return;
                              }

                              long var286 = var20;
                              client.setting.ModeSetting var287 = this.settingSpamMode;
                              var531 = var287.method_46$5f9dc63072(var286).equals("PrePosition");
                           }

                           if (var531) {
                              net.minecraft.client.Minecraft var288 = field_43;
                              net.minecraft.client.Minecraft var289 = field_43;
                              var288.field_42P.field_49m.method_45$631790539f(new net.C_42V(var289.field_42P.field_42X.method_46$ac4db64966()));
                           }

                           return;
                        }

                        net.C_43r var290 = var196;
                        NoSlow_47kC var291 = this;
                        var10000 = ((int) (var291.method_44$d654fe8697(var290) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (var10000 != 0) {
                           net.C_47G2 var294 = net.C_47G2.INPUT;
                           boolean var530 = var294.method_43$aae029aa0a();
                           byte var570 = var29;
                           if (var1 > 0) {
                              if (var29 == 0) {
                                 if (var530) {
                                    byte var582 = (byte)var16;
                                    int var297 = var17;
                                    byte var300 = var582;
                                    int var303 = var15;
                                    NoSlow_47kC var306 = this;
                                    var306.method_47$fdbf2d7fa0(var303, var300, var297);
                                 }

                                 net.C_47G2 var309 = net.C_47G2.TOGGLE;
                                 var530 = var309.method_43$aae029aa0a();
                              }

                              var570 = var29;
                           }

                           if (var1 >= 0) {
                              if (var570 == 0) {
                                 if (var530) {
                                    net.minecraft.client.Minecraft var312 = field_43;
                                    var312.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                                 }

                                 net.C_47G2 var315 = net.C_47G2.SWITCH;
                                 var530 = var315.method_43$aae029aa0a();
                              }

                              var570 = var29;
                           }

                           label1794: {
                              label1793:
                              if (var570 == 0) {
                                 label1791:
                                 if (var530) {
                                    long var318 = var20;
                                    client.setting.ModeSetting var321 = this.settingSwitchMode;
                                    if (!var321.method_46$5f9dc63072(var318).equals("PrePosition")) {
                                       long var322 = var20;
                                       client.setting.ModeSetting var323 = this.settingSwitchMode;
                                       if (!var323.method_46$5f9dc63072(var322).equals("PrePostPosition")) {
                                          break label1791;
                                       }
                                    }

                                    net.minecraft.client.Minecraft var324 = field_43;
                                    short var591 = (short)var27;
                                    char var325 = (char)var28;
                                    short var326 = var591;
                                    int var327 = var26;
                                    int var328 = var324.field_42P.field_42X.field_42;
                                    NoSlow_47kC var329 = this;
                                    int var206 = var329.method_43$4397a0fda1(var328, var327, var326, var325);
                                    if (var206 >= 0) {
                                       net.minecraft.client.Minecraft var330 = field_43;
                                       var330.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var206));
                                       long var331 = var20;
                                       client.setting.ModeSetting var332 = this.settingSwitchMode;
                                       var530 = var332.method_46$5f9dc63072(var331).equals("PrePosition");
                                       var571 = var29;
                                       if (var1 <= 0) {
                                          break label1794;
                                       }

                                       if (var29 != 0) {
                                          break label1793;
                                       }

                                       if (var530) {
                                          net.minecraft.client.Minecraft var333 = field_43;
                                          net.minecraft.client.Minecraft var334 = field_43;
                                          var333.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var334.field_42P.field_42X.field_42));
                                       }
                                    }
                                 }

                                 net.C_47G2 var337 = net.C_47G2.PLACE;
                                 var530 = var337.method_43$aae029aa0a();
                              }

                              var571 = var29;
                           }

                           if (var571 == 0) {
                              if (var530) {
                                 net.minecraft.client.Minecraft var340 = field_43;
                                 var340.field_42P
                                    .field_49m
                                    .method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), net.C_484.UP.method_43$8abf5c6871(), null, 0.0F, 0.0F, 0.0F));
                              }

                              net.C_47G2 var343 = net.C_47G2.SLOT;
                              var530 = var343.method_43$aae029aa0a();
                           }

                           label1776:
                           if (var29 == 0) {
                              if (var530) {
                                 long var346 = var20;
                                 client.setting.ModeSetting var349 = this.settingSlotMode;
                                 var530 = var349.method_46$5f9dc63072(var346).equals("PrePosition");
                                 if (var29 != 0) {
                                    break label1776;
                                 }

                                 if (var530) {
                                    net.minecraft.client.Minecraft var352 = field_43;
                                    net.minecraft.client.Minecraft var355 = field_43;
                                    var352.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var355.field_42P.field_42X.field_42));
                                 }
                              }

                              net.C_47G2 var358 = net.C_47G2.SPAM;
                              var530 = var358.method_43$aae029aa0a();
                           }

                           if (var29 == 0) {
                              if (!var530) {
                                 return;
                              }

                              long var361 = var20;
                              client.setting.ModeSetting var364 = this.settingSpamMode;
                              var530 = var364.method_46$5f9dc63072(var361).equals("PrePosition");
                           }

                           if (var530) {
                              net.minecraft.client.Minecraft var367 = field_43;
                              net.minecraft.client.Minecraft var370 = field_43;
                              var367.field_42P.field_49m.method_45$631790539f(new net.C_42V(var370.field_42P.field_42X.method_46$ac4db64966()));
                           }

                           return;
                        }

                        short var589 = (short)var14;
                        net.C_43r var373 = var196;
                        short var376 = var589;
                        int var379 = var13;
                        int var382 = var12;
                        NoSlow_47kC var385 = this;
                        var10000 = ((int) (var385.method_41$2610240745(var382, var379, var376, var373) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        net.C_47I9 var388 = net.C_47I9.INPUT;
                        var10000 = ((int) (var388.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (var10000 != 0) {
                           byte var581 = (byte)var16;
                           int var391 = var17;
                           byte var394 = var581;
                           int var397 = var15;
                           NoSlow_47kC var400 = this;
                           var400.method_47$fdbf2d7fa0(var397, var394, var391);
                        }

                        net.C_47I9 var403 = net.C_47I9.TOGGLE;
                        var10000 = ((int) (var403.method_43$aae029aa0a() ? 1 : 0));
                     }

                     byte var568 = var29;
                     if (var1 >= 0) {
                        if (var29 == 0) {
                           if (var10000 != 0) {
                              net.minecraft.client.Minecraft var408 = field_43;
                              var408.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                           }

                           net.C_47I9 var413 = net.C_47I9.SWITCH;
                           var10000 = ((int) (var413.method_43$aae029aa0a() ? 1 : 0));
                        }

                        var568 = var29;
                     }

                     label1761: {
                        label1760:
                        if (var568 == 0) {
                           label1758:
                           if (var10000 != 0) {
                              long var418 = var20;
                              client.setting.ModeSetting var423 = this.settingSwitchMode;
                              if (!var423.method_46$5f9dc63072(var418).equals("PrePosition")) {
                                 long var425 = var20;
                                 client.setting.ModeSetting var427 = this.settingSwitchMode;
                                 if (!var427.method_46$5f9dc63072(var425).equals("PrePostPosition")) {
                                    break label1758;
                                 }
                              }

                              net.minecraft.client.Minecraft var429 = field_43;
                              short var590 = (short)var27;
                              char var431 = (char)var28;
                              short var433 = var590;
                              int var435 = var26;
                              int var437 = var429.field_42P.field_42X.field_42;
                              NoSlow_47kC var439 = this;
                              int var205 = var439.method_43$4397a0fda1(var437, var435, var433, var431);
                              if (var205 >= 0) {
                                 long var441 = var7;
                                 augustus.recovered.modules.world.Scaffold_47Te var443 = client.ClientGlobals.field_48.field_46q;
                                 if (!var443.method_46$0dd78e0064(var441)) {
                                    net.minecraft.client.Minecraft var445 = field_43;
                                    var445.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var205));
                                    long var447 = var20;
                                    client.setting.ModeSetting var449 = this.settingSwitchMode;
                                    var10000 = ((int) (var449.method_46$5f9dc63072(var447).equals("PrePosition") ? 1 : 0));
                                    var569 = var29;
                                    if (var1 < 0) {
                                       break label1761;
                                    }

                                    if (var29 != 0) {
                                       break label1760;
                                    }

                                    if (var10000 != 0) {
                                       net.minecraft.client.Minecraft var451 = field_43;
                                       net.minecraft.client.Minecraft var453 = field_43;
                                       var451.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var453.field_42P.field_42X.field_42));
                                    }
                                 }
                              }
                           }

                           net.C_47I9 var458 = net.C_47I9.SLOT;
                           var10000 = ((int) (var458.method_43$aae029aa0a() ? 1 : 0));
                        }

                        var569 = var29;
                     }

                     label1743:
                     if (var569 == 0) {
                        if (var10000 != 0) {
                           long var463 = var20;
                           client.setting.ModeSetting var468 = this.settingSlotMode;
                           var10000 = ((int) (var468.method_46$5f9dc63072(var463).equals("PrePosition") ? 1 : 0));
                           if (var29 != 0) {
                              break label1743;
                           }

                           if (var10000 != 0) {
                              net.minecraft.client.Minecraft var469 = field_43;
                              net.minecraft.client.Minecraft var470 = field_43;
                              var469.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var470.field_42P.field_42X.field_42));
                           }
                        }

                        net.C_47I9 var475 = net.C_47I9.SPAM;
                        var10000 = ((int) (var475.method_43$aae029aa0a() ? 1 : 0));
                     }

                     label1735:
                     if (var29 == 0) {
                        if (var10000 != 0) {
                           long var480 = var20;
                           client.setting.ModeSetting var485 = this.settingSpamMode;
                           var10000 = ((int) (var485.method_46$5f9dc63072(var480).equals("PrePosition") ? 1 : 0));
                           if (var29 != 0) {
                              break label1735;
                           }

                           if (var10000 != 0) {
                              net.minecraft.client.Minecraft var488 = field_43;
                              net.minecraft.client.Minecraft var491 = field_43;
                              var488.field_42P.field_49m.method_45$631790539f(new net.C_42V(var491.field_42P.field_42X.method_46$ac4db64966()));
                           }
                        }

                        net.C_47I9 var496 = net.C_47I9.SPAM2;
                        var10000 = ((int) (var496.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        var10000 = ((int) (recovery$indy$flow$1328(var22, 4720299783452217689L, var5) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (var10000 == 0) {
                           return;
                        }

                        net.minecraft.client.Minecraft var501 = field_43;
                        var10000 = var501.field_42P.field_48y % 5;
                     }

                     if (var10000 == 0) {
                        net.minecraft.client.Minecraft var506 = field_43;
                        var506.field_42P.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                     }

                     return;
                  }

                  var529.field_43v = (boolean)((((int) (var567)) & 1) != 0);
                  return;
               }

               var550 = 0;
               break label2144;
            }

            var525.field_43v = (boolean)((((int) (var555)) & 1) != 0);
            return;
         }

         var520.field_43v = (boolean)((((int) (var550)) & 1) != 0);
      } else {
         label2368: {
            label2407: {
               var534 = var29;
               if (var1 > 0) {
                  if (var29 != 0) {
                     break label2407;
                  }

                  var534 = 2;
               }

               label2361: {
                  label2408: {
                     if (var1 > 0) {
                        if (var10000 != var534) {
                           break label2408;
                        }

                        var10000 = ((int) (this.field_43a ? 1 : 0));
                        var534 = var29;
                     }

                     if (var1 < 0) {
                        break label2368;
                     }

                     if (var534 != 0) {
                        break label2407;
                     }

                     if (var10000 != 0) {
                        this.field_43a = false;
                        net.minecraft.client.Minecraft var36 = field_43;
                        var507 = var36.field_42P;
                        if (var1 < 0) {
                           break label2361;
                        }

                        net.minecraft.client.Minecraft var37 = field_43;
                        var36.field_42P.field_49m.method_43$631790539f(new net.C_42V(var37.field_42P.method_41$ac4db64966()));
                     }
                  }

                  net.minecraft.client.Minecraft var38 = field_43;
                  var507 = var38.field_42P;
               }

               var10000 = ((int) (var507.method_436$aae029aa0a() ? 1 : 0));
            }

            var534 = var29;
         }

         label2344: {
            label2343: {
               label2342: {
                  if (var534 == 0) {
                     if (var10000 == 0) {
                        break label2342;
                     }

                     var508 = this;
                     var535 = var29;
                     if (var1 < 0) {
                        break label2344;
                     }

                     if (var29 != 0) {
                        break label2343;
                     }

                     long var39 = var10;
                     int var41 = var9;
                     NoSlow_47kC var42 = this;
                     net.C_47rf var536 = var42.method_41$9c52b54a6d(var41, var39);
                     long var43 = var18;
                     net.C_47rf var45 = var536;
                     NoSlow_47kC var46 = this;
                     var10000 = ((int) (var46.method_44$54e912928c(var45, var43) ? 1 : 0));
                  }

                  if (var10000 != 0) {
                     net.C_47K7 var47 = var2;
                     double var48 = var47.method_44$fedcb3e4d3() + 1.0E-14;
                     net.C_47K7 var50 = var2;
                     var50.method_48$2c20cf5948(var48);
                  }
               }

               var508 = this;
            }

            var535 = var9;
         }

         long var51 = var10;
         int var53 = var535;
         NoSlow_47kC var54 = var508;
         net.C_47rf var30 = var54.method_41$9c52b54a6d(var53, var51);
         NoSlow_47kC var509 = this;
         byte var537 = var29;
         if (var1 > 0) {
            if (var29 == 0) {
               long var55 = var24;
               net.C_47rf var57 = var30;
               NoSlow_47kC var58 = this;
               if (!var58.method_46$54e912928c(var57, var55)) {
                  net.C_43r var31 = var30.method_48$dbd570a038();
                  net.C_43r var59 = var31;
                  NoSlow_47kC var60 = this;
                  int var510 = ((int) (var60.method_45$d654fe8697(var59) ? 1 : 0));
                  byte var538 = var29;
                  if (var3 > 0L) {
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           net.C_47x6 var61 = net.C_47x6.INPUT;
                           var510 = ((int) (var61.method_43$aae029aa0a() ? 1 : 0));
                           byte var544 = var29;
                           if (var1 >= 0) {
                              if (var29 == 0) {
                                 if (var510 != 0) {
                                    byte var576 = (byte)var16;
                                    int var62 = var17;
                                    byte var63 = var576;
                                    int var64 = var15;
                                    NoSlow_47kC var65 = this;
                                    var65.method_47$fdbf2d7fa0(var64, var63, var62);
                                 }

                                 var510 = ((int) (recovery$indy$flow$998(var22, 4720299783452217689L, var5) ? 1 : 0));
                              }

                              var544 = var29;
                           }

                           if (var544 == 0) {
                              if (var510 != 0) {
                                 net.minecraft.client.Minecraft var66 = field_43;
                                 var510 = var66.field_42P.field_48y % 5;
                              } else {
                                 net.C_47x6 var69 = net.C_47x6.TOGGLE;
                                 var510 = ((int) (var69.method_43$aae029aa0a() ? 1 : 0));
                              }
                           }

                           if (var29 == 0) {
                              if (var510 != 0) {
                                 net.minecraft.client.Minecraft var70 = field_43;
                                 var70.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                              }

                              net.C_47x6 var71 = net.C_47x6.SWITCH;
                              var510 = ((int) (var71.method_43$aae029aa0a() ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var510 != 0) {
                                 long var72 = var20;
                                 client.setting.ModeSetting var74 = this.settingSwitchMode;
                                 byte var199 = ((byte) (var74.method_46$5f9dc63072(var72).equals("PrePosition") ? 1 : 0));
                                 var510 = var199;
                              } else {
                                 net.C_47x6 var90 = net.C_47x6.SLOT;
                                 var510 = ((int) (var90.method_43$aae029aa0a() ? 1 : 0));
                              }
                           }

                           label2224:
                           if (var29 == 0) {
                              if (var510 != 0) {
                                 long var91 = var20;
                                 client.setting.ModeSetting var93 = this.settingSlotMode;
                                 var510 = ((int) (var93.method_46$5f9dc63072(var91).equals("PrePosition") ? 1 : 0));
                                 if (var29 != 0) {
                                    break label2224;
                                 }

                                 if (var510 != 0) {
                                    net.minecraft.client.Minecraft var94 = field_43;
                                    net.minecraft.client.Minecraft var95 = field_43;
                                    var94.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var95.field_42P.field_42X.field_42));
                                 }
                              }

                              net.C_47x6 var96 = net.C_47x6.SPAM;
                              var510 = ((int) (var96.method_43$aae029aa0a() ? 1 : 0));
                           }

                           if (var29 == 0) {
                              if (var510 == 0) {
                                 return;
                              }

                              long var97 = var20;
                              client.setting.ModeSetting var99 = this.settingSpamMode;
                              var510 = ((int) (var99.method_46$5f9dc63072(var97).equals("PrePosition") ? 1 : 0));
                           }

                           if (var510 == 0) {
                              return;
                           }

                           net.minecraft.client.Minecraft var100 = field_43;
                           net.minecraft.client.Minecraft var101 = field_43;
                           var100.field_42P.field_49m.method_45$631790539f(new net.C_42V(var101.field_42P.field_42X.method_46$ac4db64966()));
                        }

                        net.C_43r var102 = var31;
                        NoSlow_47kC var103 = this;
                        var510 = ((int) (var103.method_44$d654fe8697(var102) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if ((var510) != 0) {
                           net.C_47G2 var292 = net.C_47G2.INPUT;
                           boolean var515 = var292.method_43$aae029aa0a();
                           byte var545 = var29;
                           if (var1 > 0) {
                              if (var29 == 0) {
                                 if (var515) {
                                    byte var577 = (byte)var16;
                                    int var295 = var17;
                                    byte var298 = var577;
                                    int var301 = var15;
                                    NoSlow_47kC var304 = this;
                                    var304.method_47$fdbf2d7fa0(var301, var298, var295);
                                 }

                                 net.C_47G2 var307 = net.C_47G2.TOGGLE;
                                 var515 = var307.method_43$aae029aa0a();
                              }

                              var545 = var29;
                           }

                           if (var1 >= 0) {
                              if (var545 == 0) {
                                 if (var515) {
                                    net.minecraft.client.Minecraft var310 = field_43;
                                    var310.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                                 }

                                 net.C_47G2 var313 = net.C_47G2.SWITCH;
                                 var515 = var313.method_43$aae029aa0a();
                              }

                              var545 = var29;
                           }

                           if (var545 == 0) {
                              if (var515) {
                                 long var316 = var20;
                                 client.setting.ModeSetting var319 = this.settingSwitchMode;
                                 boolean var200 = var319.method_46$5f9dc63072(var316).equals("PrePosition");
                                 var515 = var200;
                              } else {
                                 net.C_47G2 var335 = net.C_47G2.PLACE;
                                 var515 = var335.method_43$aae029aa0a();
                              }
                           }

                           if (var29 == 0) {
                              if (var515) {
                                 net.minecraft.client.Minecraft var338 = field_43;
                                 var338.field_42P
                                    .field_49m
                                    .method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), net.C_484.UP.method_43$8abf5c6871(), null, 0.0F, 0.0F, 0.0F));
                              }

                              net.C_47G2 var341 = net.C_47G2.SLOT;
                              var515 = var341.method_43$aae029aa0a();
                           }

                           label2198:
                           if (var29 == 0) {
                              if (var515) {
                                 long var344 = var20;
                                 client.setting.ModeSetting var347 = this.settingSlotMode;
                                 var515 = var347.method_46$5f9dc63072(var344).equals("PrePosition");
                                 if (var29 != 0) {
                                    break label2198;
                                 }

                                 if (var515) {
                                    net.minecraft.client.Minecraft var350 = field_43;
                                    net.minecraft.client.Minecraft var353 = field_43;
                                    var350.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var353.field_42P.field_42X.field_42));
                                 }
                              }

                              net.C_47G2 var356 = net.C_47G2.SPAM;
                              var515 = var356.method_43$aae029aa0a();
                           }

                           if (var29 == 0) {
                              if (!var515) {
                                 return;
                              }

                              long var359 = var20;
                              client.setting.ModeSetting var362 = this.settingSpamMode;
                              var515 = var362.method_46$5f9dc63072(var359).equals("PrePosition");
                           }

                           if (!var515) {
                              return;
                           }

                           net.minecraft.client.Minecraft var365 = field_43;
                           net.minecraft.client.Minecraft var368 = field_43;
                           var365.field_42P.field_49m.method_45$631790539f(new net.C_42V(var368.field_42P.field_42X.method_46$ac4db64966()));
                        }

                        short var584 = (short)var14;
                        net.C_43r var371 = var31;
                        short var374 = var584;
                        int var377 = var13;
                        int var380 = var12;
                        NoSlow_47kC var383 = this;
                        var510 = ((int) (var383.method_41$2610240745(var380, var377, var374, var371) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        net.C_47I9 var386 = net.C_47I9.INPUT;
                        var510 = ((int) (var386.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if ((var510) != 0) {
                           byte var578 = (byte)var16;
                           int var389 = var17;
                           byte var392 = var578;
                           int var395 = var15;
                           NoSlow_47kC var398 = this;
                           var398.method_47$fdbf2d7fa0(var395, var392, var389);
                        }

                        net.C_47I9 var401 = net.C_47I9.TOGGLE;
                        var510 = ((int) (var401.method_43$aae029aa0a() ? 1 : 0));
                     }

                     byte var546 = var29;
                     if (var1 >= 0) {
                        if (var29 == 0) {
                           if ((var510) != 0) {
                              net.minecraft.client.Minecraft var405 = field_43;
                              var405.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                           }

                           net.C_47I9 var410 = net.C_47I9.SWITCH;
                           var510 = ((int) (var410.method_43$aae029aa0a() ? 1 : 0));
                        }

                        var546 = var29;
                     }

                     if (var546 == 0) {
                        if ((var510) != 0) {
                           long var415 = var20;
                           client.setting.ModeSetting var420 = this.settingSwitchMode;
                           boolean var201 = var420.method_46$5f9dc63072(var415).equals("PrePosition");
                           var510 = ((int) (var201 ? 1 : 0));
                        } else {
                           net.C_47I9 var455 = net.C_47I9.SLOT;
                           var510 = ((int) (var455.method_43$aae029aa0a() ? 1 : 0));
                        }
                     }

                     label2172:
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           long var460 = var20;
                           client.setting.ModeSetting var465 = this.settingSlotMode;
                           var510 = ((int) (var465.method_46$5f9dc63072(var460).equals("PrePosition") ? 1 : 0));
                           if (var29 != 0) {
                              break label2172;
                           }

                           if ((var510) != 0) {
                              net.minecraft.client.Minecraft var182 = field_43;
                              net.minecraft.client.Minecraft var183 = field_43;
                              var182.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var183.field_42P.field_42X.field_42));
                           }
                        }

                        net.C_47I9 var472 = net.C_47I9.SPAM;
                        var510 = ((int) (var472.method_43$aae029aa0a() ? 1 : 0));
                     }

                     label2164:
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           long var477 = var20;
                           client.setting.ModeSetting var482 = this.settingSpamMode;
                           var510 = ((int) (var482.method_46$5f9dc63072(var477).equals("PrePosition") ? 1 : 0));
                           if (var29 != 0) {
                              break label2164;
                           }

                           if ((var510) != 0) {
                              net.minecraft.client.Minecraft var486 = field_43;
                              net.minecraft.client.Minecraft var489 = field_43;
                              var486.field_42P.field_49m.method_45$631790539f(new net.C_42V(var489.field_42P.field_42X.method_46$ac4db64966()));
                           }
                        }

                        net.C_47I9 var493 = net.C_47I9.SPAM2;
                        var510 = ((int) (var493.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        var510 = ((int) (recovery$indy$flow$1328(var22, 4720299783452217689L, var5) ? 1 : 0));
                     }

                     net.minecraft.client.entity.EntityPlayerSP var516;
                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        net.minecraft.client.Minecraft var498 = field_43;
                        var516 = var498.field_42P;
                     } else {
                        if ((var510) != 0) {
                           return;
                        }

                        net.minecraft.client.Minecraft var503 = field_43;
                        var516 = var503.field_42P;
                     }

                     var516.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                     return;
                  }

                  if (var3 >= 0L) {
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           net.C_47G2 var104 = net.C_47G2.INPUT;
                           boolean var512 = var104.method_43$aae029aa0a();
                           byte var541 = var29;
                           if (var1 > 0) {
                              if (var29 == 0) {
                                 if (var512) {
                                    byte var10002 = (byte)var16;
                                    int var105 = var17;
                                    byte var106 = var10002;
                                    int var107 = var15;
                                    NoSlow_47kC var108 = this;
                                    var108.method_47$fdbf2d7fa0(var107, var106, var105);
                                 }

                                 net.C_47G2 var109 = net.C_47G2.TOGGLE;
                                 var512 = var109.method_43$aae029aa0a();
                              }

                              var541 = var29;
                           }

                           if (var1 >= 0) {
                              if (var541 == 0) {
                                 if (var512) {
                                    net.minecraft.client.Minecraft var110 = field_43;
                                    var110.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                                 }

                                 net.C_47G2 var111 = net.C_47G2.SWITCH;
                                 var512 = var111.method_43$aae029aa0a();
                              }

                              var541 = var29;
                           }

                           if (var541 == 0) {
                              if (var512) {
                                 long var112 = var20;
                                 client.setting.ModeSetting var114 = this.settingSwitchMode;
                                 boolean var197 = var114.method_46$5f9dc63072(var112).equals("PrePosition");
                                 var512 = var197;
                              } else {
                                 net.C_47G2 var130 = net.C_47G2.PLACE;
                                 var512 = var130.method_43$aae029aa0a();
                              }
                           }

                           if (var29 == 0) {
                              if (var512) {
                                 net.minecraft.client.Minecraft var131 = field_43;
                                 var131.field_42P
                                    .field_49m
                                    .method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), net.C_484.UP.method_43$8abf5c6871(), null, 0.0F, 0.0F, 0.0F));
                              }

                              net.C_47G2 var132 = net.C_47G2.SLOT;
                              var512 = var132.method_43$aae029aa0a();
                           }

                           label2287:
                           if (var29 == 0) {
                              if (var512) {
                                 long var133 = var20;
                                 client.setting.ModeSetting var135 = this.settingSlotMode;
                                 var512 = var135.method_46$5f9dc63072(var133).equals("PrePosition");
                                 if (var29 != 0) {
                                    break label2287;
                                 }

                                 if (var512) {
                                    net.minecraft.client.Minecraft var136 = field_43;
                                    net.minecraft.client.Minecraft var137 = field_43;
                                    var136.field_42P.field_49m.method_45$631790539f(new net.C_477Y(var137.field_42P.field_42X.field_42));
                                 }
                              }

                              net.C_47G2 var138 = net.C_47G2.SPAM;
                              var512 = var138.method_43$aae029aa0a();
                           }

                           if (var29 == 0) {
                              if (!var512) {
                                 return;
                              }

                              long var139 = var20;
                              client.setting.ModeSetting var141 = this.settingSpamMode;
                              var512 = var141.method_46$5f9dc63072(var139).equals("PrePosition");
                           }

                           if (!var512) {
                              return;
                           }

                           net.minecraft.client.Minecraft var142 = field_43;
                           net.minecraft.client.Minecraft var143 = field_43;
                           var142.field_42P.field_49m.method_45$631790539f(new net.C_42V(var143.field_42P.field_42X.method_46$ac4db64966()));
                        }

                        short var10003 = (short)var14;
                        net.C_43r var144 = var31;
                        short var145 = var10003;
                        int var146 = var13;
                        int var147 = var12;
                        NoSlow_47kC var148 = this;
                        var510 = ((int) (var148.method_41$2610240745(var147, var146, var145, var144) ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        net.C_47I9 var149 = net.C_47I9.INPUT;
                        var510 = ((int) (var149.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if ((var510) != 0) {
                           byte var575 = (byte)var16;
                           int var150 = var17;
                           byte var151 = var575;
                           int var152 = var15;
                           NoSlow_47kC var153 = this;
                           var153.method_47$fdbf2d7fa0(var152, var151, var150);
                        }

                        net.C_47I9 var154 = net.C_47I9.TOGGLE;
                        var510 = ((int) (var154.method_43$aae029aa0a() ? 1 : 0));
                     }

                     byte var542 = var29;
                     if (var1 >= 0) {
                        if (var29 == 0) {
                           if ((var510) != 0) {
                              net.minecraft.client.Minecraft var404 = field_43;
                              var404.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                           }

                           net.C_47I9 var409 = net.C_47I9.SWITCH;
                           var510 = ((int) (var409.method_43$aae029aa0a() ? 1 : 0));
                        }

                        var542 = var29;
                     }

                     if (var542 == 0) {
                        if ((var510) != 0) {
                           long var414 = var20;
                           client.setting.ModeSetting var419 = this.settingSwitchMode;
                           boolean var198 = var419.method_46$5f9dc63072(var414).equals("PrePosition");
                           var510 = ((int) (var198 ? 1 : 0));
                        } else {
                           net.C_47I9 var454 = net.C_47I9.SLOT;
                           var510 = ((int) (var454.method_43$aae029aa0a() ? 1 : 0));
                        }
                     }

                     label2262: {
                        if (var29 == 0) {
                           if ((var510) != 0) {
                              long var459 = var20;
                              client.setting.ModeSetting var464 = this.settingSlotMode;
                              var510 = ((int) (var464.method_46$5f9dc63072(var459).equals("PrePosition") ? 1 : 0));
                              var543 = var29;
                              break label2262;
                           }

                           net.C_47I9 var471 = net.C_47I9.SPAM;
                           var510 = ((int) (var471.method_43$aae029aa0a() ? 1 : 0));
                        }

                        var543 = var29;
                     }

                     label2255:
                     if (var543 == 0) {
                        if ((var510) != 0) {
                           long var476 = var20;
                           client.setting.ModeSetting var481 = this.settingSpamMode;
                           var510 = ((int) (var481.method_46$5f9dc63072(var476).equals("PrePosition") ? 1 : 0));
                           if (var29 != 0) {
                              break label2255;
                           }

                           if ((var510) != 0) {
                              net.minecraft.client.Minecraft var188 = field_43;
                              net.minecraft.client.Minecraft var189 = field_43;
                              var188.field_42P.field_49m.method_45$631790539f(new net.C_42V(var189.field_42P.field_42X.method_46$ac4db64966()));
                           }
                        }

                        net.C_47I9 var492 = net.C_47I9.SPAM2;
                        var510 = ((int) (var492.method_43$aae029aa0a() ? 1 : 0));
                     }

                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        var510 = ((int) (recovery$indy$flow$1328(var22, 4720299783452217689L, var5) ? 1 : 0));
                     }

                     net.minecraft.client.entity.EntityPlayerSP var513;
                     if (var29 == 0) {
                        if (!(var510 != 0)) {
                           return;
                        }

                        net.minecraft.client.Minecraft var497 = field_43;
                        var513 = var497.field_42P;
                     } else {
                        if ((var510) != 0) {
                           return;
                        }

                        net.minecraft.client.Minecraft var502 = field_43;
                        var513 = var502.field_42P;
                     }

                     var513.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                     return;
                  }

                  if (var1 >= 0) {
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           net.minecraft.client.Minecraft var155 = field_43;
                           var155.field_42P.field_49m.method_45$631790539f(new net.C_45J(net.C_40x.RELEASE_USE_ITEM, net.C_478Q.field_44, net.C_484.DOWN));
                        }

                        net.C_47I9 var156 = net.C_47I9.SWITCH;
                        var510 = ((int) (var156.method_43$aae029aa0a() ? 1 : 0));
                     }

                     var538 = var29;
                  }

                  if (var538 == 0) {
                     if ((var510) != 0) {
                        long var157 = var20;
                        client.setting.ModeSetting var159 = this.settingSwitchMode;
                        boolean var32 = var159.method_46$5f9dc63072(var157).equals("PrePosition");
                        var510 = ((int) (var32 ? 1 : 0));
                     } else {
                        net.C_47I9 var178 = net.C_47I9.SLOT;
                        var510 = ((int) (var178.method_43$aae029aa0a() ? 1 : 0));
                     }
                  }

                  label2320: {
                     if (var29 == 0) {
                        if ((var510) != 0) {
                           long var179 = var20;
                           client.setting.ModeSetting var181 = this.settingSlotMode;
                           var510 = ((int) (var181.method_46$5f9dc63072(var179).equals("PrePosition") ? 1 : 0));
                           var539 = var29;
                           break label2320;
                        }

                        net.C_47I9 var184 = net.C_47I9.SPAM;
                        var510 = ((int) (var184.method_43$aae029aa0a() ? 1 : 0));
                     }

                     var539 = var29;
                  }

                  label2314: {
                     if (var539 == 0) {
                        if ((var510) != 0) {
                           long var185 = var20;
                           client.setting.ModeSetting var187 = this.settingSpamMode;
                           var510 = ((int) (var187.method_46$5f9dc63072(var185).equals("PrePosition") ? 1 : 0));
                           var540 = var29;
                           break label2314;
                        }

                        net.C_47I9 var190 = net.C_47I9.SPAM2;
                        var510 = ((int) (var190.method_43$aae029aa0a() ? 1 : 0));
                     }

                     var540 = var29;
                  }

                  net.minecraft.client.entity.EntityPlayerSP var511;
                  if (var540 == 0) {
                     if (!(var510 != 0)) {
                        return;
                     }

                     net.minecraft.client.Minecraft var191 = field_43;
                     var511 = var191.field_42P;
                  } else {
                     if ((var510) != 0) {
                        return;
                     }

                     net.minecraft.client.Minecraft var192 = field_43;
                     var511 = var192.field_42P;
                  }

                  var511.field_49m.method_45$631790539f(new net.C_42V(new net.C_478Q(-1, -1, -1), 1, null, 0.0F, 0.0F, 0.0F));
                  return;
               }

               var509 = this;
            }

            var537 = 0;
         }

         var509.field_43v = (boolean)((((int) (var537)) & 1) != 0);
      }
   }

















   private boolean method_44$d654fe8697(C_43r var1) {
      return var1 instanceof C_43u;
   }



   private boolean method_44$54e912928c(C_47rf var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 62937131219630L;
      int var4 = (int)((var2 ^ 62937131219630L) >>> 32);
      int var5 = (int)((var2 ^ 62937131219630L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var10000 = -122496457347927790L;
      boolean var7 = Fly_47kE.method_48$aae029aa0a();
      C_47rf var19 = var1;
      if (var7) {
         if (var1 == null) {
            return false;
         }

         var19 = var1;
      }

      C_43r var8 = var19.method_48$dbd570a038();
      long var10002 = -119856563161622091L;
      C_43r var9 = var8;
      NoSlow_47kC var10 = this;
      boolean var20 = var10.method_44$d654fe8697(var9);
      boolean var21 = var7;
      if (var2 > 0L) {
         if (var7) {
            if (var20) {
               var10001 = -120019893102545865L;
               C_47G2 var11 = C_47G2.SWITCH_CUSTOM;
               boolean var24 = var11.method_43$aae029aa0a();
               if (!var7) {
                  return var24;
               }

               if (var24) {
                  return true;
               }
            }

            short var10003 = (short)var6;
            long var10005 = -121150603122685327L;
            C_43r var12 = var8;
            short var13 = var10003;
            int var14 = var5;
            int var15 = var4;
            NoSlow_47kC var16 = this;
            var20 = var16.method_41$2610240745(var15, var14, var13, var12);
         }

         var21 = var7;
      }

      if (var2 >= 0L) {
         if (var21) {
            if (!var20) {
               return false;
            }

            var10001 = -120840714129620666L;
            C_47I9 var17 = C_47I9.SWITCH_CUSTOM;
            var20 = var17.method_43$aae029aa0a();
         }

         var21 = var7;
      }

      return !var21 ? var20 : var20;
   }




    public void method_44$3cd1f0717e(byte by, long l) {
        block48: {
            int n;
            block67: {
                boolean bl;
                long l2;
                block66: {
                    boolean bl2;
                    block64: {
                        block65: {
                            boolean bl3;
                            block63: {
                                block61: {
                                    block62: {
                                        int n2;
                                        boolean bl4;
                                        int n3;
                                        int n4;
                                        int n5;
                                        long l3;
                                        block59: {
                                            block60: {
                                                block49: {
                                                    block50: {
                                                        C_43r c_43r;
                                                        int n6;
                                                        int n7;
                                                        int n8;
                                                        block51: {
                                                            int n9;
                                                            block58: {
                                                                boolean bl5;
                                                                block57: {
                                                                    block55: {
                                                                        block56: {
                                                                            boolean bl6;
                                                                            block54: {
                                                                                block52: {
                                                                                    block53: {
                                                                                        block38: {
                                                                                            block39: {
                                                                                                block40: {
                                                                                                    int n10;
                                                                                                    block47: {
                                                                                                        boolean bl7;
                                                                                                        block46: {
                                                                                                            block44: {
                                                                                                                block45: {
                                                                                                                    boolean bl8;
                                                                                                                    block43: {
                                                                                                                        block41: {
                                                                                                                            block42: {
                                                                                                                                long l4;
                                                                                                                                long l5 = l4 = (long)by << 56 | l << 8 >>> 8;
                                                                                                                                l3 = l5 ^ 0x45E2EEF711C0L;
                                                                                                                                long l6 = l5 ^ 0x286E4CDBF87CL;
                                                                                                                                int n11 = (int)(l6 >>> 32);
                                                                                                                                long l7 = l6 << 32 >>> 32;
                                                                                                                                long l8 = l5 ^ 0x601F734C9B72L;
                                                                                                                                n8 = (int)(l8 >>> 32);
                                                                                                                                n7 = (int)(l8 << 32 >>> 48);
                                                                                                                                n6 = (int)(l8 << 48 >>> 48);
                                                                                                                                l2 = l5 ^ 0x225E33EDDA6BL;
                                                                                                                                long l9 = l5 ^ 0x7DF51509B543L;
                                                                                                                                long l10 = l5 ^ 0x50851BA56531L;
                                                                                                                                n5 = (int)(l10 >>> 32);
                                                                                                                                n4 = (int)(l10 << 32 >>> 48);
                                                                                                                                n3 = (int)(l10 << 48 >>> 48);
                                                                                                                                bl2 = Fly_47kE.method_48$aae029aa0a();
                                                                                                                                long l11 = l7;
                                                                                                                                int n12 = n11;
                                                                                                                                NoSlow_47kC noSlow_47kC = this;
                                                                                                                                C_47rf c_47rf = noSlow_47kC.method_41$9c52b54a6d(n12, l11);
                                                                                                                                NoSlow_47kC noSlow_47kC2 = this;
                                                                                                                                C_47rf c_47rf2 = c_47rf;
                                                                                                                                long l12 = l9;
                                                                                                                                if (noSlow_47kC2.method_46$54e912928c(c_47rf2, l12)) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                c_43r = c_47rf.method_48$dbd570a038();
                                                                                                                                C_43r c_43r2 = c_43r;
                                                                                                                                NoSlow_47kC noSlow_47kC3 = this;
                                                                                                                                n = ((int) (noSlow_47kC3.method_45$d654fe8697(c_43r2) ? 1 : 0));
                                                                                                                                bl4 = bl2;
                                                                                                                                if (l <= 0L) break block38;
                                                                                                                                if (!bl4) break block39;
                                                                                                                                if (n == 0) break block40;
                                                                                                                                C_47x6 c_47x6 = C_47x6.SWITCH;
                                                                                                                                n10 = ((int) (c_47x6.method_43$aae029aa0a() ? 1 : 0));
                                                                                                                                if (!bl2) break block41;
                                                                                                                                if (n10 == 0) break block42;
                                                                                                                                long l13 = l2;
                                                                                                                                ModeSetting c_47Tj = this.settingSwitchMode;
                                                                                                                                n10 = ((int) (c_47Tj.method_46$5f9dc63072(l13).equals("PostAttack") ? 1 : 0));
                                                                                                                                if (!bl2) break block41;
                                                                                                                                if (n10 == 0) break block42;
                                                                                                                                Minecraft c_47nT = field_43;
                                                                                                                                char c = (char)n3;
                                                                                                                                short s = (short)n4;
                                                                                                                                int n13 = n5;
                                                                                                                                int n14 = c_47nT.field_42P.field_42X.field_42;
                                                                                                                                NoSlow_47kC noSlow_47kC4 = this;
                                                                                                                                n10 = n2 = noSlow_47kC4.method_43$4397a0fda1(n14, n13, s, c);
                                                                                                                                if (!bl2) break block41;
                                                                                                                                if (n10 < 0) break block42;
                                                                                                                                long l14 = l3;
                                                                                                                                Scaffold_47Te scaffold_47Te = ClientGlobals.field_48.field_46q;
                                                                                                                                n10 = ((Module)scaffold_47Te).method_46$0dd78e0064(l14) ? 1 : 0;
                                                                                                                                bl8 = bl2;
                                                                                                                                if (l < 0L) break block43;
                                                                                                                                if (!bl8) break block41;
                                                                                                                                if (n10 == 0) {
                                                                                                                                    Minecraft c_47nT2 = field_43;
                                                                                                                                    c_47nT2.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(n2));
                                                                                                                                    Minecraft c_47nT3 = field_43;
                                                                                                                                    Minecraft c_47nT4 = field_43;
                                                                                                                                    c_47nT3.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT4.field_42P.field_42X.field_42));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            C_47x6 c_47x6 = C_47x6.SLOT;
                                                                                                                            n10 = ((int) (c_47x6.method_43$aae029aa0a() ? 1 : 0));
                                                                                                                        }
                                                                                                                        bl8 = bl2;
                                                                                                                    }
                                                                                                                    if (!bl8) break block44;
                                                                                                                    if (n10 == 0) break block45;
                                                                                                                    long l15 = l2;
                                                                                                                    ModeSetting c_47Tj = this.settingSlotMode;
                                                                                                                    n10 = ((int) (c_47Tj.method_46$5f9dc63072(l15).equals("PostAttack") ? 1 : 0));
                                                                                                                    bl7 = bl2;
                                                                                                                    if (l <= 0L) break block46;
                                                                                                                    if (!bl7) break block44;
                                                                                                                    if (n10 != 0) {
                                                                                                                        Minecraft c_47nT = field_43;
                                                                                                                        Minecraft c_47nT5 = field_43;
                                                                                                                        c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT5.field_42P.field_42X.field_42));
                                                                                                                    }
                                                                                                                }
                                                                                                                C_47x6 c_47x6 = C_47x6.SPAM;
                                                                                                                n10 = ((int) (c_47x6.method_43$aae029aa0a() ? 1 : 0));
                                                                                                            }
                                                                                                            bl7 = bl2;
                                                                                                        }
                                                                                                        if (!bl7) break block47;
                                                                                                        if (n10 == 0) break block48;
                                                                                                        long l16 = l2;
                                                                                                        ModeSetting c_47Tj = this.settingSpamMode;
                                                                                                        n10 = ((int) (c_47Tj.method_46$5f9dc63072(l16).equals("PostAttack") ? 1 : 0));
                                                                                                    }
                                                                                                    if (n10 == 0) break block48;
                                                                                                    Minecraft c_47nT = field_43;
                                                                                                    Minecraft c_47nT6 = field_43;
                                                                                                    c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_42V(c_47nT6.field_42P.field_42X.method_46$ac4db64966()));
                                                                                                    if (bl2) break block48;
                                                                                                }
                                                                                                C_43r c_43r3 = c_43r;
                                                                                                NoSlow_47kC noSlow_47kC = this;
                                                                                                n = ((int) (noSlow_47kC.method_44$d654fe8697(c_43r3) ? 1 : 0));
                                                                                            }
                                                                                            bl4 = bl2;
                                                                                        }
                                                                                        if (by < 0) break block49;
                                                                                        if (!bl4) break block50;
                                                                                        if (n == 0) break block51;
                                                                                        C_47G2 c_47G2 = C_47G2.SWITCH;
                                                                                        n9 = ((int) (c_47G2.method_43$aae029aa0a() ? 1 : 0));
                                                                                        if (!bl2) break block52;
                                                                                        if (n9 == 0) break block53;
                                                                                        long l17 = l2;
                                                                                        ModeSetting c_47Tj = this.settingSwitchMode;
                                                                                        n9 = ((int) (c_47Tj.method_46$5f9dc63072(l17).equals("PostAttack") ? 1 : 0));
                                                                                        if (!bl2) break block52;
                                                                                        if (n9 == 0) break block53;
                                                                                        Minecraft c_47nT = field_43;
                                                                                        char c = (char)n3;
                                                                                        short s = (short)n4;
                                                                                        int n15 = n5;
                                                                                        int n16 = c_47nT.field_42P.field_42X.field_42;
                                                                                        NoSlow_47kC noSlow_47kC = this;
                                                                                        n9 = n2 = noSlow_47kC.method_43$4397a0fda1(n16, n15, s, c);
                                                                                        if (!bl2) break block52;
                                                                                        if (n9 < 0) break block53;
                                                                                        long l18 = l3;
                                                                                        Scaffold_47Te scaffold_47Te = ClientGlobals.field_48.field_46q;
                                                                                        n9 = ((Module)scaffold_47Te).method_46$0dd78e0064(l18) ? 1 : 0;
                                                                                        bl6 = bl2;
                                                                                        if (by < 0) break block54;
                                                                                        if (!bl6) break block52;
                                                                                        if (n9 == 0) {
                                                                                            Minecraft c_47nT7 = field_43;
                                                                                            c_47nT7.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(n2));
                                                                                            Minecraft c_47nT8 = field_43;
                                                                                            Minecraft c_47nT9 = field_43;
                                                                                            c_47nT8.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT9.field_42P.field_42X.field_42));
                                                                                        }
                                                                                    }
                                                                                    C_47G2 c_47G2 = C_47G2.SLOT;
                                                                                    n9 = ((int) (c_47G2.method_43$aae029aa0a() ? 1 : 0));
                                                                                }
                                                                                bl6 = bl2;
                                                                            }
                                                                            if (!bl6) break block55;
                                                                            if (n9 == 0) break block56;
                                                                            long l19 = l2;
                                                                            ModeSetting c_47Tj = this.settingSlotMode;
                                                                            n9 = ((int) (c_47Tj.method_46$5f9dc63072(l19).equals("PostAttack") ? 1 : 0));
                                                                            bl5 = bl2;
                                                                            if (by < 0) break block57;
                                                                            if (!bl5) break block55;
                                                                            if (n9 != 0) {
                                                                                Minecraft c_47nT = field_43;
                                                                                Minecraft c_47nT10 = field_43;
                                                                                c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT10.field_42P.field_42X.field_42));
                                                                            }
                                                                        }
                                                                        C_47G2 c_47G2 = C_47G2.SPAM;
                                                                        n9 = ((int) (c_47G2.method_43$aae029aa0a() ? 1 : 0));
                                                                    }
                                                                    bl5 = bl2;
                                                                }
                                                                if (!bl5) break block58;
                                                                if (n9 == 0) break block48;
                                                                long l20 = l2;
                                                                ModeSetting c_47Tj = this.settingSpamMode;
                                                                n9 = ((int) (c_47Tj.method_46$5f9dc63072(l20).equals("PostAttack") ? 1 : 0));
                                                            }
                                                            if (n9 == 0) break block48;
                                                            Minecraft c_47nT = field_43;
                                                            Minecraft c_47nT11 = field_43;
                                                            c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_42V(c_47nT11.field_42P.field_42X.method_46$ac4db64966()));
                                                            if (bl2) break block48;
                                                        }
                                                        C_43r c_43r4 = c_43r;
                                                        short s = (short)n6;
                                                        int n17 = n7;
                                                        int n18 = n8;
                                                        NoSlow_47kC noSlow_47kC = this;
                                                        n = ((int) (noSlow_47kC.method_41$2610240745(n18, n17, s, c_43r4) ? 1 : 0));
                                                    }
                                                    bl4 = bl2;
                                                }
                                                if (l < 0L) break block59;
                                                if (!bl4) break block60;
                                                if (n == 0) break block48;
                                                C_47I9 c_47I9 = C_47I9.SWITCH;
                                                n = ((int) (c_47I9.method_43$aae029aa0a() ? 1 : 0));
                                            }
                                            bl4 = bl2;
                                        }
                                        if (!bl4) break block61;
                                        if (n == 0) break block62;
                                        long l21 = l2;
                                        ModeSetting c_47Tj = this.settingSwitchMode;
                                        n = ((int) (c_47Tj.method_46$5f9dc63072(l21).equals("PostAttack") ? 1 : 0));
                                        if (!bl2) break block61;
                                        if (n == 0) break block62;
                                        Minecraft c_47nT = field_43;
                                        char c = (char)n3;
                                        short s = (short)n4;
                                        int n19 = n5;
                                        int n20 = c_47nT.field_42P.field_42X.field_42;
                                        NoSlow_47kC noSlow_47kC = this;
                                        n = n2 = noSlow_47kC.method_43$4397a0fda1(n20, n19, s, c);
                                        if (!bl2) break block61;
                                        if (n < 0) break block62;
                                        long l22 = l3;
                                        Scaffold_47Te scaffold_47Te = ClientGlobals.field_48.field_46q;
                                        n = ((Module)scaffold_47Te).method_46$0dd78e0064(l22) ? 1 : 0;
                                        bl3 = bl2;
                                        if (by < 0) break block63;
                                        if (!bl3) break block61;
                                        if (n == 0) {
                                            Minecraft c_47nT12 = field_43;
                                            c_47nT12.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(n2));
                                            Minecraft c_47nT13 = field_43;
                                            Minecraft c_47nT14 = field_43;
                                            c_47nT13.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT14.field_42P.field_42X.field_42));
                                        }
                                    }
                                    C_47I9 c_47I9 = C_47I9.SLOT;
                                    n = ((int) (c_47I9.method_43$aae029aa0a() ? 1 : 0));
                                }
                                bl3 = bl2;
                            }
                            if (!bl3) break block64;
                            if (n == 0) break block65;
                            long l23 = l2;
                            ModeSetting c_47Tj = this.settingSlotMode;
                            n = ((int) (c_47Tj.method_46$5f9dc63072(l23).equals("PostAttack") ? 1 : 0));
                            bl = bl2;
                            if (by < 0) break block66;
                            if (!bl) break block64;
                            if (n != 0) {
                                Minecraft c_47nT = field_43;
                                Minecraft c_47nT15 = field_43;
                                c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_477Y(c_47nT15.field_42P.field_42X.field_42));
                            }
                        }
                        C_47I9 c_47I9 = C_47I9.SPAM;
                        n = ((int) (c_47I9.method_43$aae029aa0a() ? 1 : 0));
                    }
                    bl = bl2;
                }
                if (!bl) break block67;
                if (n == 0) break block48;
                long l24 = l2;
                ModeSetting c_47Tj = this.settingSpamMode;
                n = ((int) (c_47Tj.method_46$5f9dc63072(l24).equals("PostAttack") ? 1 : 0));
            }
            if (n != 0) {
                Minecraft c_47nT = field_43;
                Minecraft c_47nT16 = field_43;
                c_47nT.field_42P.field_49m.method_45$631790539f((C_473U)new C_42V(c_47nT16.field_42P.field_42X.method_46$ac4db64966()));
            }
        }
    }











   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 10616255900938L;
      long var10000 = 1653504369423059284L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 1651843460497713656L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 1652332157988203771L;
         BooleanSetting var5 = this.settingRestCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_49$5913085b6d(C_47rf var1, long var2, boolean var4) {
      boolean var22;
      var2 = a ^ var2;
      long var5 = var2 ^ 38999380829499L;
      long var7 = var2 ^ 9576047541277L;
      long var10000 = -6094667529186626355L;
      boolean var9 = Fly_47kE.method_49t$aae029aa0a();
      if (var1 != null) {
         long var10001 = -6089237035828100513L;
         Minecraft var10 = field_43;
         int var18 = (int) ((var10.field_42P.method_436$aae029aa0a()) ? 1 : 0);
         boolean var19 = var9;
         if (var2 > 0L) {
            if (!var9) {
               if (!(var18 != 0)) {
                  if (var9) {
                     return var4;
                  }

                  if (var4) {
                     return true;
                  }
               }

               var10001 = -6089237035828100513L;
               Minecraft var11 = field_43;
               float var25;
               var18 = (var25 = var11.field_42P.field_43I - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
            }

            var19 = var9;
         }

         label73: {
            label72:
            if (!var19) {
               if (!(var18 != 0)) {
                  var10001 = -6089237035828100513L;
                  Minecraft var12 = field_43;
                  float var26;
                  var18 = (var26 = var12.field_42P.field_47z - 0.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
                  var22 = var9;
                  if (var2 <= 0L) {
                     break label73;
                  }

                  if (var9) {
                     break label72;
                  }

                  if (!(var18 != 0)) {
                     var10001 = -6091318550974508702L;
                     BooleanSetting var13 = this.settingOnlyWhileMove;
                     boolean var27 = var13.method_49$aae029aa0a();
                     if (var9) {
                        return var27;
                     }

                     if (var27) {
                        return true;
                     }
                  }
               }

               long var10002 = -6088981343250325742L;
               long var14 = var5;
               AirStuck_47Q4 var16 = ClientGlobals.field_48.field_48i;
               var18 = (int) ((var16.method_46$0dd78e0064(var14)) ? 1 : 0);
            }

            var22 = var9;
         }

         if (var22) {
            return var18 != 0;
         }

         if (!(var18 != 0)) {
            var10001 = -6093177382690096461L;
            boolean var28 = C_474i.method_45$0dd78e0064(var7);
            if (var9) {
               return var28;
            }

            if (!var28) {
               return false;
            }
         }
      }

      return true;
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 4484364341564L;
      long var10000 = -1529991572884785822L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -1523752331867564594L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -1524381732486278963L;
         BooleanSetting var5 = this.settingRestCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   public void method_45$ca1f9e88a9(C_47tz var1, long var2) {
      boolean var60;
      boolean var62;
      boolean var64;
      boolean var66;
      int var4 = (int)((var2 ^ 118153641394072L) >>> 32);
      long var5 = (var2 ^ 118153641394072L) << 32 >>> 32;
      long var10001 = var2 ^ 38504218598550L;
      int var7 = (int)((var2 ^ 38504218598550L) >>> 32);
      int var8 = (int)((var2 ^ 38504218598550L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var2 ^ 109037408264077L;
      long var12 = var2 ^ 106952049089935L;
      long var14 = var2 ^ 42732550261418L;
      long var16 = var2 ^ 69194339103399L;
      long var10000 = 1762105567531927506L;
      boolean var18 = Fly_47kE.method_49t$aae029aa0a();
      long var10003 = 1756907286378899935L;
      long var21 = var5;
      int var23 = var4;
      NoSlow_47kC var24 = this;
      C_47rf var19 = var24.method_41$9c52b54a6d(var23, var21);
      var10003 = 1762219387638945633L;
      long var25 = var16;
      C_47rf var27 = var19;
      NoSlow_47kC var28 = this;
      boolean var59 = var28.method_46$54e912928c(var27, var25);
      if (!var18) {
         if (var59) {
            var10001 = 1759651067331682264L;
            C_47cu var29 = this.field_42k;
            var29.method_46$da8c82d5d4();
            return;
         }

         var10003 = 1760178371936229074L;
         long var30 = var10;
         long var32 = 400L;
         C_47cu var34 = this.field_42k;
         var59 = var34.method_42$b0e346e6e3(var32, var30);
      }

      label134: {
         if (!var18) {
            if (var59) {
               break label134;
            }

            var10001 = 1758778302524908157L;
            BooleanSetting var35 = this.settingStartSlow;
            var59 = var35.method_49$aae029aa0a();
         }

         if (var59) {
            return;
         }
      }

      C_43r var20;
      label127: {
         var20 = var19.method_48$dbd570a038();
         long var10002 = 1759026614043159409L;
         long var36 = var12;
         ModeSetting var38 = this.settingMode;
         var60 = var38.method_46$5f9dc63072(var36).equals("AllDirectionMotion");
         label126:
         if (!var18) {
            if (!var60) {
               var10002 = 1759026614043159409L;
               long var39 = var12;
               ModeSetting var41 = this.settingMode;
               var60 = var41.method_46$5f9dc63072(var39).equals("LegitMotion");
               var62 = var18;
               if (var2 > 0L) {
                  if (!var18) {
                     if (!var60) {
                        return;
                     }

                     var10002 = 1759612151486099142L;
                     long var42 = var14;
                     NoSlow_47kC var44 = this;
                     var60 = var44.method_43K$0dd78e0064(var42);
                  }

                  var62 = var18;
               }

               if (var2 <= 0L) {
                  break label127;
               }

               if (var62) {
                  break label126;
               }

               if (!var60) {
                  return;
               }
            }

            var10002 = 1757189936356732605L;
            C_43r var45 = var20;
            NoSlow_47kC var46 = this;
            var60 = var46.method_45$d654fe8697(var45);
         }

         var62 = var18;
      }

      label140: {
         label107: {
            label106:
            if (!var62) {
               if (var60) {
                  var10001 = 1759721277287075192L;
                  C_47x6 var47 = C_47x6.SPRINT;
                  var60 = var47.method_43$aae029aa0a();
                  var64 = var18;
                  if (var2 <= 0L) {
                     break label107;
                  }

                  if (var18) {
                     break label106;
                  }

                  if (var60) {
                     break label140;
                  }
               }

               long var72 = 1760402976165101453L;
               C_43r var48 = var20;
               NoSlow_47kC var49 = this;
               var60 = var49.method_44$d654fe8697(var48);
            }

            var64 = var18;
         }

         label94: {
            label93:
            if (!var64) {
               if (var60) {
                  var10001 = 1760204532684984847L;
                  C_47G2 var50 = C_47G2.SPRINT;
                  var60 = var50.method_43$aae029aa0a();
                  var66 = var18;
                  if (var2 < 0L) {
                     break label94;
                  }

                  if (var18) {
                     break label93;
                  }

                  if (var60) {
                     break label140;
                  }
               }

               short var76 = (short)var9;
               long var10005 = 1759091140005506121L;
               C_43r var51 = var20;
               short var52 = var76;
               int var53 = var8;
               int var54 = var7;
               NoSlow_47kC var55 = this;
               var60 = var55.method_41$2610240745(var54, var53, var52, var51);
            }

            var66 = var18;
         }

         if (!var66) {
            if (!var60) {
               return;
            }

            var10001 = 1759405778998568830L;
            C_47I9 var56 = C_47I9.SPRINT;
            var60 = var56.method_43$aae029aa0a();
         }

         if (!var60) {
            return;
         }
      }

      long var73 = 1760577172031535087L;
      boolean var57 = true;
      C_47tz var58 = var1;
      var58.method_47$f633c984d8(var57);
   }





   private boolean method_45$d654fe8697(C_43r var1) {
      return var1 instanceof C_45V;
   }



   private void method_47$fdbf2d7fa0(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
      long var6 = var4 ^ 56638253345455L;
      recovery$indy$11(field_43, -1814981371130081298L, var4)
         .field_49m
         .method_45$631790539f(
            new C_47MN(
               recovery$indy$12(this.settingInputStrafeLegit, -1817764095421735725L, var4)
                  ? recovery$indy$13(field_43, -1814981371130081298L, var4).field_47z
                  : (float)recovery$indy$14(this.settingInputStrafe, var6, -1817651474423552946L, var4),
               recovery$indy$15(this.settingInputForwardLegit, -1817764095421735725L, var4)
                  ? recovery$indy$16(field_43, -1814981371130081298L, var4).field_43I
                  : (float)recovery$indy$17(this.settingInputForward, var6, -1817651474423552946L, var4),
               recovery$indy$18(this.settingInputJumpLegit, -1817764095421735725L, var4)
                  ? recovery$indy$19(field_43, -1814981371130081298L, var4).field_49w.field_42
                  : recovery$indy$20(this.settingInputJump, -1817764095421735725L, var4),
               recovery$indy$21(this.settingInputSneakLegit, -1817764095421735725L, var4)
                  ? recovery$indy$22(field_43, -1814981371130081298L, var4).field_49w.field_49
                  : recovery$indy$23(this.settingInputSneak, -1817764095421735725L, var4)
            )
         );
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      int var4 = (int)((var2 ^ 86006781820709L) >>> 32);
      long var5 = (var2 ^ 86006781820709L) << 32 >>> 32;
      long var7 = var2 ^ 132406506099900L;
      long var10001 = var2 ^ 6907317902379L;
      int var9 = (int)((var2 ^ 6907317902379L) >>> 32);
      int var10 = (int)((var2 ^ 6907317902379L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 77412314636080L;
      long var14 = var2 ^ 30384116986394L;
      this.field_403 = this.field_42Z;
      long var10000 = 6397755666190419823L;
      boolean var90 = Fly_47kE.method_49t$aae029aa0a();
      this.field_43u = this.field_40E;
      boolean var16 = var90;
      long var10002 = 6403079050306178961L;
      C_472n var19 = var1;
      this.field_42Z = var19.method_45$bc607678b6();
      var10002 = 6403383992643301274L;
      C_472n var20 = var1;
      this.field_40E = var20.method_47$aae029aa0a();
      long var10003 = 6403252884600236386L;
      long var21 = var5;
      int var23 = var4;
      NoSlow_47kC var24 = this;
      C_47rf var17 = var24.method_41$9c52b54a6d(var23, var21);
      var10003 = 6397799220647679964L;
      long var25 = var14;
      C_47rf var27 = var17;
      NoSlow_47kC var28 = this;
      boolean var91 = var28.method_46$54e912928c(var27, var25);
      if (!var16) {
         if (var91) {
            var10001 = 6401493166654906213L;
            C_47cu var29 = this.field_42k;
            var29.method_46$da8c82d5d4();
            return;
         }

         var10003 = 6399700469524649583L;
         long var30 = var12;
         long var32 = 400L;
         C_47cu var34 = this.field_42k;
         var91 = var34.method_42$b0e346e6e3(var32, var30);
      }

      label100: {
         if (!var16) {
            if (var91) {
               break label100;
            }

            var10001 = 6401104637945324224L;
            BooleanSetting var35 = this.settingStartSlow;
            var91 = var35.method_49$aae029aa0a();
         }

         if (var91) {
            return;
         }
      }

      C_43r var18 = var17.method_48$dbd570a038();
      var10002 = 6404100679258893824L;
      C_43r var36 = var18;
      NoSlow_47kC var37 = this;
      boolean var92 = var37.method_45$d654fe8697(var36);
      boolean var96 = var16;
      if (var2 > 0L) {
         if (!var16) {
            if (var92) {
               var10001 = 6401563823557037509L;
               C_47x6 var38 = C_47x6.SNEAK;
               boolean var93 = var38.method_43$aae029aa0a();
               if (var2 >= 0L) {
                  if (!var93) {
                     return;
                  }

                  var10002 = 6401208809417506126L;
                  boolean var39 = true;
                  C_472n var40 = var1;
                  var40.method_43$f633c984d8(var39);
                  var10003 = 6401071313812675165L;
                  long var41 = var7;
                  NumberSetting var43 = this.settingSwordSneakForward;
                  double var98 = var43.method_44$474dfaa627(var41);
                  var10002 = 6397999375095704183L;
                  double var44 = var98;
                  C_472n var46 = var1;
                  var46.method_49$2c20cf5948(var44);
                  var10003 = 6401071313812675165L;
                  long var47 = var7;
                  NumberSetting var49 = this.settingSwordSneakStrafe;
                  double var99 = var49.method_44$474dfaa627(var47);
                  var10002 = 6403932774323968165L;
                  double var50 = var99;
                  C_472n var52 = var1;
                  var52.method_43$2c20cf5948(var50);
                  var93 = var16;
               }

               if (!var93) {
                  return;
               }
            }

            var10002 = 6400477511966474032L;
            C_43r var53 = var18;
            NoSlow_47kC var54 = this;
            var92 = var54.method_44$d654fe8697(var53);
         }

         var96 = var16;
      }

      if (var2 > 0L) {
         if (!var96) {
            if (var92) {
               var10001 = 6399797583061439154L;
               C_47G2 var55 = C_47G2.SNEAK;
               boolean var94 = var55.method_43$aae029aa0a();
               if (var2 > 0L) {
                  if (!var94) {
                     return;
                  }

                  var10002 = 6401208809417506126L;
                  boolean var56 = true;
                  C_472n var57 = var1;
                  var57.method_43$f633c984d8(var56);
                  var10003 = 6401071313812675165L;
                  long var58 = var7;
                  NumberSetting var60 = this.settingBowSneakForward;
                  double var101 = var60.method_44$474dfaa627(var58);
                  var10002 = 6397999375095704183L;
                  double var61 = var101;
                  C_472n var63 = var1;
                  var63.method_49$2c20cf5948(var61);
                  var10003 = 6401071313812675165L;
                  long var64 = var7;
                  NumberSetting var66 = this.settingBowSneakStrafe;
                  double var102 = var66.method_44$474dfaa627(var64);
                  var10002 = 6403932774323968165L;
                  double var67 = var102;
                  C_472n var69 = var1;
                  var69.method_43$2c20cf5948(var67);
                  var94 = var16;
               }

               if (!var94) {
                  return;
               }
            }

            short var125 = (short)var11;
            long var10005 = 6400927194107866356L;
            C_43r var70 = var18;
            short var71 = var125;
            int var72 = var10;
            int var73 = var9;
            NoSlow_47kC var74 = this;
            var92 = var74.method_41$2610240745(var73, var72, var71, var70);
         }

         var96 = var16;
      }

      if (!var96) {
         if (!var92) {
            return;
         }

         var10001 = 6401743137441966019L;
         C_47I9 var75 = C_47I9.SNEAK;
         var92 = var75.method_43$aae029aa0a();
      }

      if (var92) {
         var10002 = 6401208809417506126L;
         boolean var76 = true;
         C_472n var77 = var1;
         var77.method_43$f633c984d8(var76);
         var10003 = 6401071313812675165L;
         long var78 = var7;
         NumberSetting var80 = this.settingRestSneakForward;
         double var104 = var80.method_44$474dfaa627(var78);
         var10002 = 6397999375095704183L;
         double var81 = var104;
         C_472n var83 = var1;
         var83.method_49$2c20cf5948(var81);
         var10003 = 6401071313812675165L;
         long var84 = var7;
         NumberSetting var86 = this.settingRestSneakStrafe;
         double var105 = var86.method_44$474dfaa627(var84);
         var10002 = 6403932774323968165L;
         double var87 = var105;
         C_472n var89 = var1;
         var89.method_43$2c20cf5948(var87);
      }
   }







   private boolean method_43w$aae029aa0a() {
      long var1 = a ^ 83145093247301L;
      long var3 = var1 ^ 17210505219910L;
      long var10000 = 773980067028829667L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 765681757057464760L;
      long var6 = var3;
      ModeSetting var8 = this.settingBowSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5) {
         if (var11) {
            return false;
         }

         long var10001 = 766999867587330246L;
         C_47G2 var9 = C_47G2.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (var5) {
         if (!var11) {
            return false;
         }

         long var12 = 765894986477695156L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return !var5 ? var11 : var11;
   }



   private int method_43$4397a0fda1(int var1, int var2, short var3, char var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 13552930616186L;
      long var10001 = var5 ^ 88556636830711L;
      int var9 = (int)((var5 ^ 88556636830711L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      java.util.ArrayList var13 = new java.util.ArrayList();
      int var10000 = ((int) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      int var14 = 36;
      byte var12 = (byte)var10000;

      while (true) {
         net.minecraft.client.Minecraft var16 = field_43;
         if (var14 < var16.field_42P.field_429.field_46.size()) {
            net.minecraft.client.Minecraft var17 = field_43;
            net.C_47rf var15 = var17.field_42P.field_429.method_46$4c10532da1(var14).method_48$ac4db64966();
            byte var55 = var12;
            if (var4 > 0) {
               if (var12 == 0) {
                  net.C_47rf var58 = var15;
                  if (var12 != 0) {
                     return (Integer)(Object) (var15);
                  }

                  label237:
                  while (true) {
                     label235:
                     if (var58 == null) {
                        int var63 = var12;
                        if (var3 >= 0) {
                           if (var12 != 0) {
                              break label235;
                           }

                           var63 = var1 + 36;
                        }

                        if (var14 != var63) {
                           var13.add(var14 - 36);
                        }
                     }

                     var14++;

                     do {
                        byte var59 = var12;

                        do {
                           if (var59 != 0) {
                              break label237;
                           }

                           var16 = field_43;
                           if (var14 >= var16.field_42P.field_429.field_46.size()) {
                              break label237;
                           }

                           var17 = field_43;
                           var15 = var17.field_42P.field_429.method_46$4c10532da1(var14).method_48$ac4db64966();
                           var59 = var12;
                        } while (var4 <= 0);
                     } while (var12 != 0);

                     var58 = var15;
                  }

                  int var60 = ((int) (var13.isEmpty() ? 1 : 0));
                  if (var3 < 0) {
                     return var60;
                  }

                  int var64 = var12;
                  if (var2 >= 0) {
                     if (var12 == 0) {
                        if (var60 == 0) {
                           net.C_47MO var65 = net.C_476q.field_48;
                           int var68 = var13.size() - 1;
                           long var40 = var7;
                           int var41 = var68;
                           byte var42 = ((byte) (0));
                           net.C_47MO var43 = var65;
                           return (Integer)var13.get(var43.method_44$75dd719903(var42, var41, var40));
                        }

                        client.setting.BooleanSetting var44 = this.settingSwitchOnlyEmptySlot;
                        var60 = ((int) (var44.method_49$aae029aa0a() ? 1 : 0));
                     }

                     var64 = var12;
                  }

                  if (var2 > 0) {
                     if (var64 == 0) {
                        if (var60 != 0) {
                           return -1;
                        }

                        client.setting.BooleanSetting var45 = this.settingSwitchGomme;
                        var60 = ((int) (var45.method_49$aae029aa0a() ? 1 : 0));
                     }

                     var64 = var12;
                  }

                  if (var4 > 0) {
                     if (var64 == 0) {
                        if (var60 != 0) {
                           var10000 = var1;
                           break;
                        }

                        long var46 = var7;
                        byte var47 = ((byte) (8));
                        byte var48 = ((byte) (0));
                        net.C_47MO var49 = net.C_476q.field_48;
                        var14 = var49.method_44$75dd719903(var48, var47, var46);
                        var60 = var14;
                     }

                     var64 = var12;
                  }

                  if (var4 > 0) {
                     if (var64 != 0) {
                        return var60;
                     }

                     var64 = var1;
                  }

                  if (var60 == var64) {
                     short var67 = (short)var10;
                     char var50 = (char)var11;
                     short var51 = var67;
                     int var52 = var9;
                     int var53 = var1;
                     NoSlow_47kC var54 = this;
                     var54.method_43$4397a0fda1(var53, var52, var51, var50);
                  }

                  return var14;
               }

               var55 = var12;
            }

            if (var55 == 0) {
               continue;
            }
         }

         int var56 = ((int) (var13.isEmpty() ? 1 : 0));
         if (var3 < 0) {
            return var56;
         }

         int var61 = var12;
         if (var2 >= 0) {
            if (var12 == 0) {
               if (var56 == 0) {
                  net.C_47MO var62 = net.C_476q.field_48;
                  int var66 = var13.size() - 1;
                  long var18 = var7;
                  int var20 = var66;
                  byte var21 = ((byte) (0));
                  net.C_47MO var22 = var62;
                  return (Integer)var13.get(var22.method_44$75dd719903(var21, var20, var18));
               }

               client.setting.BooleanSetting var23 = this.settingSwitchOnlyEmptySlot;
               var56 = ((int) (var23.method_49$aae029aa0a() ? 1 : 0));
            }

            var61 = var12;
         }

         if (var2 > 0) {
            if (var61 == 0) {
               if (var56 != 0) {
                  return -1;
               }

               client.setting.BooleanSetting var24 = this.settingSwitchGomme;
               var56 = ((int) (var24.method_49$aae029aa0a() ? 1 : 0));
            }

            var61 = var12;
         }

         if (var4 > 0) {
            if (var61 == 0) {
               if (var56 != 0) {
                  var10000 = var1;
                  if (var12 != 0) {
                     var14 = var1;
                     return var1 + var14;
                  }
                  break;
               }

               long var25 = var7;
               byte var27 = ((byte) (8));
               byte var28 = ((byte) (0));
               net.C_47MO var29 = net.C_476q.field_48;
               var14 = var29.method_44$75dd719903(var28, var27, var25);
               var56 = var14;
            }

            var61 = var12;
         }

         if (var4 > 0) {
            if (var61 != 0) {
               return var56;
            }

            var61 = var1;
         }

         if (var56 == var61) {
            short var10003 = (short)var10;
            char var30 = (char)var11;
            short var31 = var10003;
            int var32 = var9;
            int var33 = var1;
            NoSlow_47kC var34 = this;
            var34.method_43$4397a0fda1(var33, var32, var31, var30);
         }

         return var14;
      }

      var14 = var10000 == 0 ? 1 : -1;
      return var1 + var14;
   }





   public void method_43$ca1f9e88a9(C_47tz var1, long var2) {
      boolean var60;
      boolean var62;
      int var4 = (int)((var2 ^ 71322336756592L) >>> 32);
      long var5 = (var2 ^ 71322336756592L) << 32 >>> 32;
      long var10001 = var2 ^ 9548670394494L;
      int var7 = (int)((var2 ^ 9548670394494L) >>> 32);
      int var8 = (int)((var2 ^ 9548670394494L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var2 ^ 79718630187877L;
      long var12 = var2 ^ 82388104913255L;
      long var14 = var2 ^ 9985179174339L;
      long var16 = var2 ^ 23387696942671L;
      long var10000 = -1973421557958415422L;
      boolean var18 = Fly_47kE.method_48$aae029aa0a();
      long var10003 = -1978801566484392649L;
      long var21 = var5;
      int var23 = var4;
      NoSlow_47kC var24 = this;
      C_47rf var19 = var24.method_41$9c52b54a6d(var23, var21);
      var10003 = -1973558940774405239L;
      long var25 = var16;
      C_47rf var27 = var19;
      NoSlow_47kC var28 = this;
      boolean var55 = var28.method_46$54e912928c(var27, var25);
      if (var18) {
         if (var55) {
            var10001 = -1980560219378293968L;
            C_47cu var29 = this.field_42k;
            var29.method_46$da8c82d5d4();
            return;
         }

         var10003 = -1980102465184634310L;
         long var30 = var10;
         long var32 = 400L;
         C_47cu var34 = this.field_42k;
         var55 = var34.method_42$b0e346e6e3(var32, var30);
      }

      label108: {
         if (var18) {
            if (var55) {
               break label108;
            }

            var10001 = -1981508897588404587L;
            BooleanSetting var35 = this.settingStartSlow;
            var55 = var35.method_49$aae029aa0a();
         }

         if (var55) {
            return;
         }
      }

      C_43r var20 = var19.method_48$dbd570a038();
      long var10002 = -1981167357093029991L;
      long var36 = var12;
      ModeSetting var38 = this.settingMode;
      boolean var56 = var38.method_46$5f9dc63072(var36).equals(recovery$indy$24(14149, 2353521402159294272L ^ var2));
      boolean var58 = var18;
      if (var2 >= 0L) {
         if (var18) {
            if (!var56) {
               return;
            }

            var10002 = -1978521403427532203L;
            C_43r var39 = var20;
            NoSlow_47kC var40 = this;
            var56 = var40.method_45$d654fe8697(var39);
         }

         var58 = var18;
      }

      label113: {
         label93: {
            label92:
            if (var58) {
               if (var56) {
                  var10001 = -1980490344160398960L;
                  C_47x6 var41 = C_47x6.SPRINT;
                  var56 = var41.method_43$aae029aa0a();
                  var60 = var18;
                  if (var2 < 0L) {
                     break label93;
                  }

                  if (!var18) {
                     break label92;
                  }

                  if (var56) {
                     break label113;
                  }
               }

               var10002 = -1979861426239274139L;
               C_43r var42 = var20;
               NoSlow_47kC var43 = this;
               var56 = var43.method_44$d654fe8697(var42);
            }

            var60 = var18;
         }

         label80: {
            label79:
            if (var60) {
               if (var56) {
                  var10001 = -1979988335117570329L;
                  C_47G2 var44 = C_47G2.SPRINT;
                  var56 = var44.method_43$aae029aa0a();
                  var62 = var18;
                  if (var2 < 0L) {
                     break label80;
                  }

                  if (!var18) {
                     break label79;
                  }

                  if (var56) {
                     break label113;
                  }
               }

               short var69 = (short)var9;
               long var10005 = -1981117945626079071L;
               C_43r var45 = var20;
               short var46 = var69;
               int var47 = var8;
               int var48 = var7;
               NoSlow_47kC var49 = this;
               var56 = var49.method_41$2610240745(var48, var47, var46, var45);
            }

            var62 = var18;
         }

         if (var62) {
            if (!var56) {
               return;
            }

            var10001 = -1980878429680804970L;
            C_47I9 var50 = C_47I9.SPRINT;
            var56 = var50.method_43$aae029aa0a();
         }

         if (!var56) {
            return;
         }
      }

      var10003 = -1980717057556792588L;
      boolean var51 = true;
      long var52 = var14;
      C_47tz var54 = var1;
      var54.method_43$b757cde368(var52, var51);
   }





   private boolean method_43_$aae029aa0a() {
      long var1 = a ^ 98625104743852L;
      long var10000 = -696864544131618318L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -701761256525312358L;
      BooleanSetting var4 = this.settingInputSneakLegit;
      boolean var6 = var4.method_44$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -700288563980563363L;
         BooleanSetting var5 = this.settingInputSneakLegit;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$25(this, 7, var5, -7103805952913121494L, var1);
      recovery$indy$26(this, 21, var5, -7103805952913121494L, var1);
      recovery$indy$27(this, 23, var5, -7103805952913121494L, var1);
      recovery$indy$28(this, 43, var5, -7103805952913121494L, var1);
      recovery$indy$29(this, 18, var5, -7103805952913121494L, var1);
      recovery$indy$30(this, 26, var5, -7103805952913121494L, var1);
      recovery$indy$31(this, 1, var5, -7103805952913121494L, var1);
      recovery$indy$32(this, 36, 18, var3, -7105489743463977796L, var1);
      recovery$indy$33(this, 25, var5, -7103805952913121494L, var1);
      recovery$indy$34(this, 40, var5, -7103805952913121494L, var1);
   }



   public void method_45q$e45a9973e5(long var1) {
      boolean var55;
      boolean var57;
      net.C_40X var59;
      float var71;
      NoSlow_47kC var53;
      boolean var60;
      label146: {
         label149: {
            int var3 = (int)((var1 ^ 65840600373408L) >>> 32);
            long var4 = (var1 ^ 65840600373408L) << 32 >>> 32;
            long var6 = var1 ^ 15070989284153L;
            long var10001 = var1 ^ 127064628771758L;
            int var8 = (int)((var1 ^ 127064628771758L) >>> 32);
            int var9 = (int)((var1 ^ 127064628771758L) << 32 >>> 48);
            int var10 = (int)(var10001 << 48 >>> 48);
            long var11 = var1 ^ 121474229376415L;
            long var10000 = 4561039459217350890L;
            boolean var13 = Fly_47kE.method_49t$aae029aa0a();
            long var10003 = 4564848241222536935L;
            long var16 = var4;
            int var18 = var3;
            NoSlow_47kC var19 = this;
            C_47rf var14 = var19.method_41$9c52b54a6d(var18, var16);
            var10003 = 4561295014865186905L;
            long var20 = var11;
            C_47rf var22 = var14;
            NoSlow_47kC var23 = this;
            boolean var52 = var23.method_46$54e912928c(var22, var20);
            if (!var13) {
               if (!var52) {
                  C_43r var15 = var14.method_48$dbd570a038();
                  long var10002 = 4565131027967969669L;
                  C_43r var25 = var15;
                  NoSlow_47kC var26 = this;
                  boolean var54 = var26.method_45$d654fe8697(var25);
                  var60 = var13;
                  if (var1 > 0L) {
                     if (!var13) {
                        if (var54) {
                           long var63 = 4563159870931380800L;
                           C_47x6 var27 = C_47x6.TIMER;
                           var55 = var27.method_43$aae029aa0a();
                           label123:
                           if (var1 > 0L) {
                              if (var55) {
                                 long var64 = 4564323042181349273L;
                                 Minecraft var28 = field_43;
                                 C_40X var56 = var28.method_46$159e3d0645();
                                 var10003 = 4562245012016479704L;
                                 long var29 = var6;
                                 NumberSetting var31 = this.settingTimerSword;
                                 var56.field_43 = (float)var31.method_44$474dfaa627(var29);
                                 this.field_40f = true;
                                 var55 = var13;
                                 if (var1 <= 0L) {
                                    break label123;
                                 }

                                 if (!var13) {
                                    return;
                                 }
                              }

                              long var65 = 4564323042181349273L;
                              Minecraft var32 = field_43;
                              var32.method_46$159e3d0645().field_43 = 1.0F;
                              var55 = var13;
                           }

                           if (!var55) {
                              return;
                           }
                        }

                        var10002 = 4563947123998349493L;
                        C_43r var33 = var15;
                        NoSlow_47kC var34 = this;
                        var54 = var34.method_44$d654fe8697(var33);
                     }

                     var60 = var13;
                  }

                  if (var1 > 0L) {
                     if (!var60) {
                        if (var54) {
                           long var66 = 4563782659891967287L;
                           C_47G2 var35 = C_47G2.TIMER;
                           var57 = var35.method_43$aae029aa0a();
                           label104:
                           if (var1 > 0L) {
                              if (var57) {
                                 long var67 = 4564323042181349273L;
                                 Minecraft var36 = field_43;
                                 C_40X var58 = var36.method_46$159e3d0645();
                                 var10003 = 4562245012016479704L;
                                 long var37 = var6;
                                 NumberSetting var39 = this.settingTimerBow;
                                 var58.field_43 = (float)var39.method_44$474dfaa627(var37);
                                 this.field_40f = true;
                                 var57 = var13;
                                 if (var1 < 0L) {
                                    break label104;
                                 }

                                 if (!var13) {
                                    return;
                                 }
                              }

                              long var68 = 4564323042181349273L;
                              Minecraft var40 = field_43;
                              var40.method_46$159e3d0645().field_43 = 1.0F;
                              var57 = var13;
                           }

                           if (!var57) {
                              return;
                           }
                        }

                        short var77 = (short)var10;
                        long var10005 = 4562670366188276593L;
                        C_43r var41 = var15;
                        short var42 = var77;
                        int var43 = var9;
                        int var44 = var8;
                        NoSlow_47kC var45 = this;
                        var54 = var45.method_41$2610240745(var44, var43, var42, var41);
                     }

                     var60 = var13;
                  }

                  if (!var60) {
                     if (!var54) {
                        return;
                     }

                     long var69 = 4562985004232114246L;
                     C_47I9 var46 = C_47I9.TIMER;
                     var54 = var46.method_43$aae029aa0a();
                  }

                  label87: {
                     if (var54) {
                        long var70 = 4564323042181349273L;
                        Minecraft var47 = field_43;
                        var59 = var47.method_46$159e3d0645();
                        var10003 = 4562245012016479704L;
                        long var48 = var6;
                        NumberSetting var50 = this.settingTimerRest;
                        var71 = (float)var50.method_44$474dfaa627(var48);
                        if (var1 < 0L) {
                           break label87;
                        }

                        var59.field_43 = var71;
                        this.field_40f = true;
                        if (!var13) {
                           return;
                        }
                     }

                     long var72 = 4564323042181349273L;
                     Minecraft var51 = field_43;
                     var59 = var51.method_46$159e3d0645();
                     var71 = 1.0F;
                  }

                  var59.field_43 = var71;
                  return;
               }

               var53 = this;
               var60 = var13;
               if (var1 <= 0L) {
                  break label146;
               }

               if (var13) {
                  break label149;
               }

               var52 = this.field_40f;
            }

            if (!var52) {
               return;
            }

            var53 = this;
         }

         var60 = false;
      }

      var53.field_40f = var60;
      long var61 = 4564323042181349273L;
      Minecraft var24 = field_43;
      var24.method_46$159e3d0645().field_43 = 1.0F;
   }






   private boolean method_43O$aae029aa0a() {
      long var1 = a ^ 101236487456823L;
      long var10000 = -878292871606928239L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -878008123415304509L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -877332338711623226L;
         BooleanSetting var5 = this.settingSwordCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      int var6 = (int)((var4 ^ 88665514834343L) >>> 32);
      long var7 = (var4 ^ 88665514834343L) << 32 >>> 32;
      long var9 = var4 ^ 5769572496536L;
      long var10000 = 2182973120542638573L;
      boolean var11 = Fly_47kE.method_49t$aae029aa0a();
      long var10003 = 2188452617715838944L;
      long var14 = var7;
      int var16 = var6;
      NoSlow_47kC var17 = this;
      C_47rf var12 = var17.method_41$9c52b54a6d(var16, var14);
      var10003 = 2182999950426083678L;
      long var18 = var9;
      C_47rf var20 = var12;
      NoSlow_47kC var21 = this;
      if (!var21.method_46$54e912928c(var20, var18)) {
         C_43r var13 = var12.method_48$dbd570a038();
         boolean var25 = var13 instanceof C_45V;
         if (!var11) {
            if (!var25) {
               return;
            }

            long var10001 = 2185638884958112583L;
            C_47x6 var22 = C_47x6.GRIM;
            var25 = var22.method_43$aae029aa0a();
         }

         if (var25) {
            long var26 = 2188381621403711359L;
            Minecraft var23 = field_43;
            long var10004 = 2188381621403711359L;
            Minecraft var24 = field_43;
            var23.field_42P.field_49m.method_45$631790539f(new C_42V(var24.field_42P.method_48$ac4db64966()));
         }
      }
   }




   private boolean method_43j$aae029aa0a() {
      long var1 = a ^ 135239895037934L;
      long var10000 = 5482723134641849160L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = 5478899117994996508L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = 5479244741526238751L;
         BooleanSetting var5 = this.settingRestEditFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_43p$aae029aa0a() {
      long var1 = a ^ 1366011983980L;
      long var10000 = -4353742861103702990L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -4356127151312120168L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -4357149290920494691L;
         BooleanSetting var5 = this.settingSwordCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private static boolean method_43z$aae029aa0a() {
      long var0 = a ^ 75245465444513L;
      long var10000 = 6582328331449976063L;
      boolean var2 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 6577129294257901141L;
      C_47x6 var3 = C_47x6.INPUT;
      boolean var6 = var3.method_43$aae029aa0a();
      if (!var2) {
         if (!var6) {
            var10001 = 6575503537849159970L;
            C_47G2 var4 = C_47G2.INPUT;
            boolean var9 = var4.method_43$aae029aa0a();
            if (var2) {
               return var9;
            }

            if (!var9) {
               var10001 = 6577449156251542611L;
               C_47I9 var5 = C_47I9.INPUT;
               boolean var10 = var5.method_43$aae029aa0a();
               if (var2) {
                  return var10;
               }

               if (!var10) {
                  return false;
               }
            }
         }

         var6 = true;
      }

      return var6;
   }



   private boolean method_43F$aae029aa0a() {
      long var1 = a ^ 97231035807498L;
      long var10000 = -3678691897110805588L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -3680087134252148226L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -3679983374482032901L;
         BooleanSetting var5 = this.settingSwordCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_433$aae029aa0a() {
      long var1 = a ^ 34887831791646L;
      long var10000 = 6045655251984305216L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 6050745516235418860L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 6051242829419391471L;
         BooleanSetting var5 = this.settingRestCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43g$aae029aa0a() {
      long var1 = a ^ 86255240714849L;
      long var3 = var1 ^ 11318434735202L;
      long var10000 = -2190672861875241409L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -2196566481894059364L;
      long var6 = var3;
      ModeSetting var8 = this.settingSwordSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (!var5) {
         if (var11) {
            return false;
         }

         long var10001 = -2195889495649782635L;
         C_47x6 var9 = C_47x6.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (!var5) {
         if (!var11) {
            return false;
         }

         long var12 = -2196344283508401264L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return var5 ? var11 : var11;
   }



   private boolean method_43C$aae029aa0a() {
      long var1 = a ^ 110446329001220L;
      long var10000 = -8143470023437516382L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -8148443172816800206L;
      BooleanSetting var4 = this.settingInputStrafeLegit;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -8151464183757867787L;
         BooleanSetting var5 = this.settingInputStrafeLegit;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : !var6;
   }



   public void method_44g$e45a9973e5(long var1) {
      boolean var144;
      boolean var148;
      boolean var156;
      boolean var160;
      boolean var167;
      boolean var171;
      long var3 = var1 ^ 74419129845702L;
      int var5 = (int)((var1 ^ 50730809454202L) >>> 32);
      long var6 = (var1 ^ 50730809454202L) << 32 >>> 32;
      long var10001 = var1 ^ 112504797072756L;
      int var8 = (int)((var1 ^ 112504797072756L) >>> 32);
      int var9 = (int)((var1 ^ 112504797072756L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 39667526683757L;
      long var13 = var1 ^ 136034334679877L;
      var10001 = var1 ^ 95421164614455L;
      int var15 = (int)((var1 ^ 95421164614455L) >>> 32);
      int var16 = (int)((var1 ^ 95421164614455L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var10000 = -8532626967398705616L;
      boolean var18 = Fly_47kE.method_49t$aae029aa0a();
      long var10003 = -8537825951917377475L;
      long var22 = var6;
      int var24 = var5;
      NoSlow_47kC var25 = this;
      C_47rf var19 = var25.method_41$9c52b54a6d(var24, var22);
      NoSlow_47kC var134 = this;
      if (!var18) {
         var10003 = -8532372528982391165L;
         long var26 = var13;
         C_47rf var28 = var19;
         NoSlow_47kC var29 = this;
         if (!var29.method_46$54e912928c(var28, var26)) {
            C_43r var20 = var19.method_48$dbd570a038();
            long var10002 = -8538666866592333985L;
            C_43r var30 = var20;
            NoSlow_47kC var31 = this;
            int var135 = (int) ((var31.method_45$d654fe8697(var30)) ? 1 : 0);
            boolean var139 = var18;
            if (var1 >= 0L) {
               if (!var18) {
                  if (var135 != 0) {
                     var10001 = -8536137155534775142L;
                     C_47x6 var32 = C_47x6.TOGGLE;
                     int var136 = (int) ((var32.method_43$aae029aa0a()) ? 1 : 0);
                     boolean var141 = var18;
                     if (var1 >= 0L) {
                        if (!var18) {
                           if (var136 != 0) {
                              var10001 = -8537751792230768478L;
                              Minecraft var33 = field_43;
                              long var10004 = -8537751792230768478L;
                              Minecraft var34 = field_43;
                              var33.field_42P.field_49m.method_45$631790539f(new C_42V(var34.field_42P.field_42X.method_46$ac4db64966()));
                           }

                           var10001 = -8536137155534775142L;
                           C_47x6 var35 = C_47x6.SWITCH;
                           var136 = (int) ((var35.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var141 = var18;
                     }

                     label342: {
                        label341:
                        if (!var141) {
                           if (var136 != 0) {
                              var10002 = -8535706452383057261L;
                              long var36 = var11;
                              ModeSetting var38 = this.settingSwitchMode;
                              var136 = (int) ((var38.method_46$5f9dc63072(var36).equals("PostPosition")) ? 1 : 0);
                              if (var18) {
                                 break label341;
                              }

                              if (var136 != 0) {
                                 var10002 = -8537751792230768478L;
                                 Minecraft var39 = field_43;
                                 short var192 = (short)var16;
                                 char var196 = (char)var17;
                                 long var10005 = -8532176674974886539L;
                                 char var40 = var196;
                                 short var41 = var192;
                                 int var42 = var15;
                                 int var43 = var39.field_42P.field_42X.field_42;
                                 NoSlow_47kC var44 = this;
                                 int var21 = var44.method_43$4397a0fda1(var43, var42, var41, var40);
                                 var136 = var21;
                                 if (var18) {
                                    break label341;
                                 }

                                 if (var21 >= 0) {
                                    var10002 = -8537989892085088785L;
                                    long var45 = var3;
                                    Scaffold_47Te var47 = ClientGlobals.field_48.field_46q;
                                    var136 = (int) ((var47.method_46$0dd78e0064(var45)) ? 1 : 0);
                                    var144 = var18;
                                    if (var1 < 0L) {
                                       break label342;
                                    }

                                    if (var18) {
                                       break label341;
                                    }

                                    if (var136 == 0) {
                                       var10001 = -8537751792230768478L;
                                       Minecraft var48 = field_43;
                                       var48.field_42P.field_49m.method_45$631790539f(new C_477Y(var21));
                                       var10001 = -8537751792230768478L;
                                       Minecraft var49 = field_43;
                                       long var197 = -8537751792230768478L;
                                       Minecraft var50 = field_43;
                                       var49.field_42P.field_49m.method_45$631790539f(new C_477Y(var50.field_42P.field_42X.field_42));
                                    }
                                 }
                              }
                           }

                           var10001 = -8536137155534775142L;
                           C_47x6 var51 = C_47x6.SLOT;
                           var136 = (int) ((var51.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var144 = var18;
                     }

                     label325: {
                        label324:
                        if (!var144) {
                           if (var136 != 0) {
                              var10002 = -8535706452383057261L;
                              long var52 = var11;
                              ModeSetting var54 = this.settingSlotMode;
                              var136 = (int) ((var54.method_46$5f9dc63072(var52).equals("PostPosition")) ? 1 : 0);
                              var148 = var18;
                              if (var1 <= 0L) {
                                 break label325;
                              }

                              if (var18) {
                                 break label324;
                              }

                              if (var136 != 0) {
                                 var10001 = -8537751792230768478L;
                                 Minecraft var55 = field_43;
                                 long var198 = -8537751792230768478L;
                                 Minecraft var56 = field_43;
                                 var55.field_42P.field_49m.method_45$631790539f(new C_477Y(var56.field_42P.field_42X.field_42));
                              }
                           }

                           var10001 = -8536137155534775142L;
                           C_47x6 var57 = C_47x6.SPAM;
                           var136 = (int) ((var57.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var148 = var18;
                     }

                     if (!var148) {
                        if (var136 == 0) {
                           return;
                        }

                        var10002 = -8535706452383057261L;
                        long var58 = var11;
                        ModeSetting var60 = this.settingSpamMode;
                        var136 = (int) ((var60.method_46$5f9dc63072(var58).equals("PostPosition")) ? 1 : 0);
                     }

                     if (var136 == 0) {
                        return;
                     }

                     var10001 = -8537751792230768478L;
                     Minecraft var61 = field_43;
                     long var199 = -8537751792230768478L;
                     Minecraft var62 = field_43;
                     var61.field_42P.field_49m.method_45$631790539f(new C_42V(var62.field_42P.field_42X.method_46$ac4db64966()));
                     if (!var18) {
                        return;
                     }
                  }

                  var10002 = -8535323531432497553L;
                  C_43r var63 = var20;
                  NoSlow_47kC var64 = this;
                  var135 = (int) ((var64.method_44$d654fe8697(var63)) ? 1 : 0);
               }

               var139 = var18;
            }

            if (var1 >= 0L) {
               if (!var139) {
                  if (var135 != 0) {
                     var10001 = -8534385185120451603L;
                     C_47G2 var65 = C_47G2.TOGGLE;
                     int var137 = (int) ((var65.method_43$aae029aa0a()) ? 1 : 0);
                     boolean var153 = var18;
                     if (var1 > 0L) {
                        if (!var18) {
                           if (var137 != 0) {
                              var10001 = -8537751792230768478L;
                              Minecraft var66 = field_43;
                              long var200 = -8537751792230768478L;
                              Minecraft var67 = field_43;
                              var66.field_42P.field_49m.method_45$631790539f(new C_42V(var67.field_42P.field_42X.method_46$ac4db64966()));
                           }

                           var10001 = -8534385185120451603L;
                           C_47G2 var68 = C_47G2.SWITCH;
                           var137 = (int) ((var68.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var153 = var18;
                     }

                     label297: {
                        label296:
                        if (!var153) {
                           if (var137 != 0) {
                              var10002 = -8535706452383057261L;
                              long var69 = var11;
                              ModeSetting var71 = this.settingSwitchMode;
                              var137 = (int) ((var71.method_46$5f9dc63072(var69).equals("PostPosition")) ? 1 : 0);
                              if (var18) {
                                 break label296;
                              }

                              if (var137 != 0) {
                                 var10002 = -8537751792230768478L;
                                 Minecraft var72 = field_43;
                                 short var193 = (short)var16;
                                 char var201 = (char)var17;
                                 long var210 = -8532176674974886539L;
                                 char var73 = var201;
                                 short var74 = var193;
                                 int var75 = var15;
                                 int var76 = var72.field_42P.field_42X.field_42;
                                 NoSlow_47kC var77 = this;
                                 int var132 = var77.method_43$4397a0fda1(var76, var75, var74, var73);
                                 var137 = var132;
                                 if (var18) {
                                    break label296;
                                 }

                                 if (var132 >= 0) {
                                    var10002 = -8537989892085088785L;
                                    long var78 = var3;
                                    Scaffold_47Te var80 = ClientGlobals.field_48.field_46q;
                                    var137 = (int) ((var80.method_46$0dd78e0064(var78)) ? 1 : 0);
                                    var156 = var18;
                                    if (var1 < 0L) {
                                       break label297;
                                    }

                                    if (var18) {
                                       break label296;
                                    }

                                    if (var137 == 0) {
                                       var10001 = -8537751792230768478L;
                                       Minecraft var81 = field_43;
                                       var81.field_42P.field_49m.method_45$631790539f(new C_477Y(var132));
                                       var10001 = -8537751792230768478L;
                                       Minecraft var82 = field_43;
                                       long var202 = -8537751792230768478L;
                                       Minecraft var83 = field_43;
                                       var82.field_42P.field_49m.method_45$631790539f(new C_477Y(var83.field_42P.field_42X.field_42));
                                    }
                                 }
                              }
                           }

                           var10001 = -8534385185120451603L;
                           C_47G2 var84 = C_47G2.SLOT;
                           var137 = (int) ((var84.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var156 = var18;
                     }

                     label280: {
                        label279:
                        if (!var156) {
                           if (var137 != 0) {
                              var10002 = -8535706452383057261L;
                              long var85 = var11;
                              ModeSetting var87 = this.settingSlotMode;
                              var137 = (int) ((var87.method_46$5f9dc63072(var85).equals("PostPosition")) ? 1 : 0);
                              var160 = var18;
                              if (var1 < 0L) {
                                 break label280;
                              }

                              if (var18) {
                                 break label279;
                              }

                              if (var137 != 0) {
                                 var10001 = -8537751792230768478L;
                                 Minecraft var88 = field_43;
                                 long var203 = -8537751792230768478L;
                                 Minecraft var89 = field_43;
                                 var88.field_42P.field_49m.method_45$631790539f(new C_477Y(var89.field_42P.field_42X.field_42));
                              }
                           }

                           var10001 = -8534385185120451603L;
                           C_47G2 var90 = C_47G2.SPAM;
                           var137 = (int) ((var90.method_43$aae029aa0a()) ? 1 : 0);
                        }

                        var160 = var18;
                     }

                     if (!var160) {
                        if (var137 == 0) {
                           return;
                        }

                        var10002 = -8535706452383057261L;
                        long var91 = var11;
                        ModeSetting var93 = this.settingSpamMode;
                        var137 = (int) ((var93.method_46$5f9dc63072(var91).equals("PostPosition")) ? 1 : 0);
                     }

                     if (var137 == 0) {
                        return;
                     }

                     var10001 = -8537751792230768478L;
                     Minecraft var94 = field_43;
                     long var204 = -8537751792230768478L;
                     Minecraft var95 = field_43;
                     var94.field_42P.field_49m.method_45$631790539f(new C_42V(var95.field_42P.field_42X.method_46$ac4db64966()));
                     if (!var18) {
                        return;
                     }
                  }

                  short var194 = (short)var10;
                  long var211 = -8535507373888750165L;
                  C_43r var96 = var20;
                  short var97 = var194;
                  int var98 = var9;
                  int var99 = var8;
                  NoSlow_47kC var100 = this;
                  var135 = (int) ((var100.method_41$2610240745(var99, var98, var97, var96)) ? 1 : 0);
               }

               var139 = var18;
            }

            if (var1 >= 0L) {
               if (!var139) {
                  if (var135 == 0) {
                     return;
                  }

                  var10001 = -8536309839586380132L;
                  C_47I9 var101 = C_47I9.TOGGLE;
                  var135 = (int) ((var101.method_43$aae029aa0a()) ? 1 : 0);
               }

               var139 = var18;
            }

            if (var1 > 0L) {
               if (!var139) {
                  if (var135 != 0) {
                     var10001 = -8537751792230768478L;
                     Minecraft var102 = field_43;
                     long var205 = -8537751792230768478L;
                     Minecraft var103 = field_43;
                     var102.field_42P.field_49m.method_45$631790539f(new C_42V(var103.field_42P.field_42X.method_46$ac4db64966()));
                  }

                  var10001 = -8536309839586380132L;
                  C_47I9 var104 = C_47I9.SWITCH;
                  var135 = (int) ((var104.method_43$aae029aa0a()) ? 1 : 0);
               }

               var139 = var18;
            }

            label251: {
               label250:
               if (!var139) {
                  if (var135 != 0) {
                     var10002 = -8535706452383057261L;
                     long var105 = var11;
                     ModeSetting var107 = this.settingSwitchMode;
                     var135 = (int) ((var107.method_46$5f9dc63072(var105).equals("PostPosition")) ? 1 : 0);
                     if (var18) {
                        break label250;
                     }

                     if (var135 != 0) {
                        var10002 = -8537751792230768478L;
                        Minecraft var108 = field_43;
                        short var195 = (short)var16;
                        char var206 = (char)var17;
                        long var212 = -8532176674974886539L;
                        char var109 = var206;
                        short var110 = var195;
                        int var111 = var15;
                        int var112 = var108.field_42P.field_42X.field_42;
                        NoSlow_47kC var113 = this;
                        int var133 = var113.method_43$4397a0fda1(var112, var111, var110, var109);
                        var135 = var133;
                        if (var18) {
                           break label250;
                        }

                        if (var133 >= 0) {
                           var10002 = -8537989892085088785L;
                           long var114 = var3;
                           Scaffold_47Te var116 = ClientGlobals.field_48.field_46q;
                           var135 = (int) ((var116.method_46$0dd78e0064(var114)) ? 1 : 0);
                           var167 = var18;
                           if (var1 < 0L) {
                              break label251;
                           }

                           if (var18) {
                              break label250;
                           }

                           if (var135 == 0) {
                              var10001 = -8537751792230768478L;
                              Minecraft var117 = field_43;
                              var117.field_42P.field_49m.method_45$631790539f(new C_477Y(var133));
                              var10001 = -8537751792230768478L;
                              Minecraft var118 = field_43;
                              long var207 = -8537751792230768478L;
                              Minecraft var119 = field_43;
                              var118.field_42P.field_49m.method_45$631790539f(new C_477Y(var119.field_42P.field_42X.field_42));
                           }
                        }
                     }
                  }

                  var10001 = -8536309839586380132L;
                  C_47I9 var120 = C_47I9.SLOT;
                  var135 = (int) ((var120.method_43$aae029aa0a()) ? 1 : 0);
               }

               var167 = var18;
            }

            label234: {
               label233:
               if (!var167) {
                  if (var135 != 0) {
                     var10002 = -8535706452383057261L;
                     long var121 = var11;
                     ModeSetting var123 = this.settingSlotMode;
                     var135 = (int) ((var123.method_46$5f9dc63072(var121).equals("PostPosition")) ? 1 : 0);
                     var171 = var18;
                     if (var1 < 0L) {
                        break label234;
                     }

                     if (var18) {
                        break label233;
                     }

                     if (var135 != 0) {
                        var10001 = -8537751792230768478L;
                        Minecraft var124 = field_43;
                        long var208 = -8537751792230768478L;
                        Minecraft var125 = field_43;
                        var124.field_42P.field_49m.method_45$631790539f(new C_477Y(var125.field_42P.field_42X.field_42));
                     }
                  }

                  var10001 = -8534385185120451603L;
                  C_47G2 var126 = C_47G2.SPAM;
                  var135 = (int) ((var126.method_43$aae029aa0a()) ? 1 : 0);
               }

               var171 = var18;
            }

            if (!var171) {
               if (var135 == 0) {
                  return;
               }

               var10002 = -8535706452383057261L;
               long var127 = var11;
               ModeSetting var129 = this.settingSpamMode;
               var135 = (int) ((var129.method_46$5f9dc63072(var127).equals("PostPosition")) ? 1 : 0);
            }

            if (var135 != 0) {
               var10001 = -8537751792230768478L;
               Minecraft var130 = field_43;
               long var209 = -8537751792230768478L;
               Minecraft var131 = field_43;
               var130.field_42P.field_49m.method_45$631790539f(new C_42V(var131.field_42P.field_42X.method_46$ac4db64966()));
            }

            return;
         }

         var134 = this;
      }

      var134.field_43P = true;
   }












   private boolean method_43y$aae029aa0a() {
      long var1 = a ^ 127703508066605L;
      long var3 = var1 ^ 52900333068078L;
      long var10000 = 6545284413389788555L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 6541478714975939024L;
      long var6 = var3;
      ModeSetting var8 = this.settingRestSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5) {
         if (var11) {
            return false;
         }

         long var10001 = 6542599284688283103L;
         C_47I9 var9 = C_47I9.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (var5) {
         if (!var11) {
            return false;
         }

         long var12 = 6541829019887870172L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return !var5 ? var11 : var11;
   }



   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$35(field_43, -7742081520277334976L, var1).field_43 = 1.0F;
      this.field_43v = false;
   }



   private boolean method_43q$aae029aa0a() {
      long var1 = a ^ 60929043866100L;
      long var10000 = 6488653227673372074L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 6490452520495342854L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 6489825164291350533L;
         BooleanSetting var5 = this.settingRestCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43Z$aae029aa0a() {
      long var1 = a ^ 133204751127876L;
      long var3 = var1 ^ 67206548040519L;
      long var10000 = -1244086448455257830L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -1251704683906933319L;
      long var6 = var3;
      ModeSetting var8 = this.settingRestSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (!var5) {
         if (var11) {
            return false;
         }

         long var10001 = -1251166845949292106L;
         C_47I9 var9 = C_47I9.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (!var5) {
         if (!var11) {
            return false;
         }

         long var12 = -1251943701385472843L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return var5 ? var11 : var11;
   }



   private boolean method_43Y$aae029aa0a() {
      long var1 = a ^ 117433215923014L;
      long var10000 = -3981729492745627880L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -3989759775198061134L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -3989590868819397961L;
         BooleanSetting var5 = this.settingSwordCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43P$aae029aa0a() {
      long var1 = a ^ 114630876440470L;
      long var10000 = -2563097322082384952L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -2560351844924369387L;
      C_47G2 var4 = C_47G2.SLOWDOWN;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -2561947092245961113L;
         BooleanSetting var5 = this.settingEnableIntervals;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private static boolean method_43B$aae029aa0a() {
      long var0 = a ^ 4343005601447L;
      long var10000 = 2692984499987528441L;
      boolean var2 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 2684408859769811027L;
      C_47x6 var3 = C_47x6.INPUT;
      boolean var6 = var3.method_43$aae029aa0a();
      if (!var2) {
         if (!var6) {
            var10001 = 2686017009981959972L;
            C_47G2 var4 = C_47G2.INPUT;
            boolean var9 = var4.method_43$aae029aa0a();
            if (var2) {
               return var9;
            }

            if (!var9) {
               var10001 = 2684581561820748373L;
               C_47I9 var5 = C_47I9.INPUT;
               boolean var10 = var5.method_43$aae029aa0a();
               if (var2) {
                  return var10;
               }

               if (!var10) {
                  return false;
               }
            }
         }

         var6 = true;
      }

      return var6;
   }



   private static boolean method_43e$aae029aa0a() {
      long var0 = a ^ 13808604636945L;
      long var10000 = 2083311056726557519L;
      boolean var2 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 2087102724000352741L;
      C_47x6 var3 = C_47x6.INPUT;
      boolean var6 = var3.method_43$aae029aa0a();
      if (!var2) {
         if (!var6) {
            var10001 = 2085352726041368210L;
            C_47G2 var4 = C_47G2.INPUT;
            boolean var9 = var4.method_43$aae029aa0a();
            if (var2) {
               return var9;
            }

            if (!var9) {
               var10001 = 2087281850636870627L;
               C_47I9 var5 = C_47I9.INPUT;
               boolean var10 = var5.method_43$aae029aa0a();
               if (var2) {
                  return var10;
               }

               if (!var10) {
                  return false;
               }
            }
         }

         var6 = true;
      }

      return var6;
   }



   private boolean method_43D$aae029aa0a() {
      long var1 = a ^ 4305085130737L;
      long var10000 = -7202959283542944937L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -7199130802276523261L;
      C_47I9 var4 = C_47I9.SLOWDOWN;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -7199768051939547648L;
         BooleanSetting var5 = this.settingEnableIntervals;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_438$aae029aa0a() {
      long var1 = a ^ 127629047868172L;
      long var10000 = -3390066191406837934L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -3391824194674074993L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -3393393170754458883L;
         BooleanSetting var5 = this.settingBowEditFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_434$aae029aa0a() {
      long var1 = a ^ 120844774696791L;
      long var10000 = 2066880894571086601L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 2067294864104327587L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 2068039639135970982L;
         BooleanSetting var5 = this.settingSwordEditFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43T$aae029aa0a() {
      long var1 = a ^ 113634453834303L;
      long var10000 = 3586839514119450209L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 3592157394440589005L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 3592515333790845902L;
         BooleanSetting var5 = this.settingRestCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43G$aae029aa0a() {
      long var1 = a ^ 615271698947L;
      long var10000 = 7636807948380993117L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 7630663235298973425L;
      C_47I9 var4 = C_47I9.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 7631150004349113330L;
         BooleanSetting var5 = this.settingRestCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43u$aae029aa0a() {
      long var1 = a ^ 21415621606428L;
      long var10000 = -4042857931404261190L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -4035868805410632289L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -4037378616102044179L;
         BooleanSetting var5 = this.settingBowCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_43H$aae029aa0a() {
      long var1 = a ^ 112686240264517L;
      long var10000 = 773777655639020827L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 766953008729522374L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 765942395105472692L;
         BooleanSetting var5 = this.settingBowCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   public void method_487$da8c82d5d4() {
      int var3;
      long var4;
      long var6;
      boolean var8;
      label33: {
         long var1 = a ^ 101461116370851L;
         var3 = (int)((var1 ^ 20128989782967L) >>> 32);
         var4 = (var1 ^ 20128989782967L) << 32 >>> 32;
         var6 = var1 ^ 78984391650952L;
         long var10000 = -4297779202131665923L;
         var8 = Fly_47kE.method_49t$aae029aa0a();
         NoSlow_47kC var18 = this;
         int var10001 = this.field_43p + 1;
         if (!var8) {
            this.field_43p = var10001;
            long var20 = -4301232760719659665L;
            Minecraft var9 = field_43;
            if (var9.field_42P.field_48M) {
               this.field_438++;
               if (!var8) {
                  break label33;
               }
            }

            var18 = this;
            var10001 = this.field_42 + 1;
         }

         var18.field_42 = var10001;
      }

      NoSlow_47kC var19 = this;
      if (!var8) {
         long var10004 = -4301306095433730576L;
         long var10 = var4;
         int var12 = var3;
         NoSlow_47kC var13 = this;
         C_47rf var21 = var13.method_41$9c52b54a6d(var12, var10);
         long var10003 = -4297612681715823794L;
         long var14 = var6;
         C_47rf var16 = var21;
         NoSlow_47kC var17 = this;
         if (!var17.method_46$54e912928c(var16, var14)) {
            return;
         }

         this.field_42 = 0;
         this.field_438 = 0;
         var19 = this;
      }

      var19.field_43p = 0;
   }



   private boolean method_43A$aae029aa0a() {
      long var1 = a ^ 108800148850503L;
      long var10000 = 4377379745172206561L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = 4368648480202860979L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = 4369380061523429046L;
         BooleanSetting var5 = this.settingSwordCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_43X$aae029aa0a() {
      long var1 = a ^ 4370351511825L;
      long var10000 = -6707563391940285001L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -6705677085994637166L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -6704372164704741152L;
         BooleanSetting var5 = this.settingBowCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_43V$aae029aa0a() {
      long var1 = a ^ 119160626540498L;
      long var10000 = -7770388648977167476L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -7767643181558063535L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -7766978106712199645L;
         BooleanSetting var5 = this.settingBowCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43a$aae029aa0a() {
      long var1 = a ^ 4463179590745L;
      long var10000 = -7520623394017638393L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -7512311635247627603L;
      C_47x6 var4 = C_47x6.SLOWDOWN;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -7512761745190556248L;
         BooleanSetting var5 = this.settingEnableIntervals;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_430$aae029aa0a() {
      long var1 = a ^ 97996663309028L;
      long var3 = var1 ^ 31994217888999L;
      long var10000 = 4115349406676268610L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 4107614080751700505L;
      long var6 = var3;
      ModeSetting var8 = this.settingSwordSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5) {
         if (var11) {
            return false;
         }

         long var10001 = 4108326782724058128L;
         C_47x6 var9 = C_47x6.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (var5) {
         if (!var11) {
            return false;
         }

         long var12 = 4107304647284245269L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return !var5 ? var11 : var11;
   }



   private static boolean method_43M$aae029aa0a() {
      long var0 = a ^ 3508468248421L;
      long var10000 = -7737762041384723517L;
      boolean var2 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -7745365207484792431L;
      C_47x6 var3 = C_47x6.INPUT;
      boolean var6 = var3.method_43$aae029aa0a();
      if (var2) {
         if (!var6) {
            var10001 = -7744881847121797402L;
            C_47G2 var4 = C_47G2.INPUT;
            boolean var9 = var4.method_43$aae029aa0a();
            if (!var2) {
               return var9;
            }

            if (!var9) {
               var10001 = -7745192490534360169L;
               C_47I9 var5 = C_47I9.INPUT;
               boolean var10 = var5.method_43$aae029aa0a();
               if (!var2) {
                  return var10;
               }

               if (!var10) {
                  return false;
               }
            }
         }

         var6 = true;
      }

      return var6;
   }



   private boolean method_43s$aae029aa0a() {
      long var1 = a ^ 31329814459401L;
      long var10000 = 5760518095128744023L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 5757731274144806719L;
      BooleanSetting var4 = this.settingInputForwardLegit;
      boolean var6 = var4.method_44$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 5759354669038581240L;
         BooleanSetting var5 = this.settingInputForwardLegit;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



   private boolean method_43k$aae029aa0a() {
      long var1 = a ^ 27544564140765L;
      long var10000 = 8153061085945785987L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 8159604172004129630L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 8158644546621147948L;
         BooleanSetting var5 = this.settingBowCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_43K$0dd78e0064(long var1) {
        int var10;
        int var9;
      long var7 = a ^ var1;
      float var4 = 0.8F;
      int var10000 = ((int) (recovery$indy$flow$2578(-1645722638827293041L, var7) ? 1 : 0));
      byte var5 = ((byte) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2580(field_43, -1640158007205036003L, var7)).method_488$aae029aa0a() ? 1 : 0));
      boolean var3 = (boolean)((((int) (var10000)) & 1) != 0);
      float var12;
      var10000 = (var12 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2583(field_43, -1640158007205036003L, var7)).method_44$c1e132d4d1().method_44$8abf5c6871() - 6.0F)
            == 0.0F
         ? 0
         : (var12 < 0.0F ? -1 : 1);
      if (var3) {
         int var11 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2591(field_43, -1640158007205036003L, var7)).field_48M ? 1 : 0));
         if (!var3) {
            float var13;
            var11 = !(var11 != 0) ? ((var13 = this.field_42Z - var4) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1)) : var5;
         }

         if (!var3) {
            if ((var11) != 0) {
               float var14;
               var5 = (byte)((var14 = this.field_42Z - var4) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1));
            }

            var11 = var5;
         }

         return (((var11) & 1) != 0);
      } else {
         boolean var6;
         label353: {
            boolean var10001;
            label374: {
               label340: {
                  label372: {
                     var6 = var10000 > 0 || ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2587(field_43, -1640158007205036003L, var7)).field_45.field_46;
                     if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2591(field_43, -1640158007205036003L, var7)).field_48M
                        && !this.field_43u
                        && this.field_403 < var4
                        && this.field_42Z >= var4
                        && !(var5 != 0)
                        && var6) {
                        var10 = ((((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2597(field_43, -1640158007205036003L, var7)).method_41$e45115c4cf(net.C_47oY.field_463)) ? 1 : 0);
                        if (var7 <= 0L) {
                           if (!var3) {
                              if (!(var10 != 0) && this.field_42Z >= var4 && var6) {
                                 var10 = ((((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2602(field_43, -1640158007205036003L, var7))
                                    .method_41$e45115c4cf(net.C_47oY.field_463)) ? 1 : 0);
                                 var10001 = var3;
                                 break label374;
                              }

                              var10 = var5;
                           }

                           var10001 = var3;
                           break label374;
                        }

                        if (!var3) {
                           if (!(var10 != 0)) {
                              var5 = ((byte) (1));
                           }

                           var10 = var5;
                        }

                        if (var3) {
                           break label353;
                        }

                        if ((var10 != 0) || !(this.field_42Z >= var4) || !var6) {
                           break label372;
                        }

                        var10 = ((((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2602(field_43, -1640158007205036003L, var7)).method_41$e45115c4cf(net.C_47oY.field_463)) ? 1 : 0);
                        var10001 = var3;
                     } else {
                        var9 = var5;
                        if (var3) {
                           break label340;
                        }

                        if ((var5 != 0) || !(this.field_42Z >= var4) || !var6) {
                           var9 = var5;
                           break label340;
                        }

                        var10 = ((((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2602(field_43, -1640158007205036003L, var7)).method_41$e45115c4cf(net.C_47oY.field_463)) ? 1 : 0);
                        var10001 = var3;
                        if (var7 <= 0L) {
                           break label374;
                        }
                     }

                     if (var10001) {
                        break label353;
                     }

                     if (!(var10 != 0)) {
                        var5 = ((byte) (1));
                     }
                  }

                  var10 = var5;
                  break label353;
               }

               if (!var3) {
                  if ((var9 != 0) && (this.field_42Z < var4 || ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2607(field_43, -1640158007205036003L, var7)).field_48d && !var6)) {
                     var5 = ((byte) (0));
                  }

                  var9 = var5;
               }

               return (((var9) & 1) != 0);
            }

            if (!var10001) {
               if ((var10 != 0) && (this.field_42Z < var4 || ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2607(field_43, -1640158007205036003L, var7)).field_48d && !var6)) {
                  var5 = ((byte) (0));
               }

               var10 = var5;
            }

            return (((var10) & 1) != 0);
         }

         if (!var3) {
            if ((var10 != 0) && (this.field_42Z < var4 || ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$2607(field_43, -1640158007205036003L, var7)).field_48d && !var6)) {
               var5 = ((byte) (0));
            }

            var10 = var5;
         }

         return (((var10) & 1) != 0);
      }
   }




   private boolean method_436$aae029aa0a() {
      long var1 = a ^ 124115890815268L;
      long var10000 = 4241287148415264122L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 4235025425010176167L;
      C_47G2 var4 = C_47G2.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 4233447498417127637L;
         BooleanSetting var5 = this.settingBowCustomFacing;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_431$aae029aa0a() {
      long var1 = a ^ 63419234459842L;
      long var10000 = 6573787566719554660L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = 6567890911941021238L;
      C_47x6 var4 = C_47x6.INVALID_PACKET;
      boolean var6 = var4.method_43$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = 6568063953678573875L;
         BooleanSetting var5 = this.settingSwordCustomBlockPos;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_43f$aae029aa0a() {
      long var1 = a ^ 43940779021994L;
      long var10000 = 3265746517107651316L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = 3261918529472861596L;
      BooleanSetting var4 = this.settingInputJumpLegit;
      boolean var6 = var4.method_44$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 3264666656042407771L;
         BooleanSetting var5 = this.settingInputJumpLegit;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



    public NoSlow_47kC(long a0) {
        super((java.lang.String) ("NoSlow"),(java.lang.String) ("NichtLangsam"),(long) (((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 34328033817646L)),(java.awt.Color) (new java.awt.Color((int) (10),(int) (40),(int) (53))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 101040042752151L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 103457781099401L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 103457781099401L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 103457781099401L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 114132334361864L);
        long constructorKey8 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 95047511252435L);
        long constructorKey9 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 7783765556542L);
        long constructorKey10 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 121067039631413L);
        int constructorPart11 = (int) ((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 138990720986771L) >>> 32));
        long constructorKey12 = ((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 138990720986771L) << 32) >>> 32);
        long constructorKey13 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 9846870945418L);
        int constructorPart14 = (int) ((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 133541042014390L) >>> 32));
        int constructorPart15 = (int) (((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 133541042014390L) << 32) >>> 48));
        int constructorPart16 = (int) (((((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 133541042014390L) << 48) >>> 48));
        long constructorKey17 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 92962674050275L);
        long constructorKey18 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 80517153462191L);
        long constructorKey19 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 73960120653746L);
        long constructorKey20 = ((augustus.recovered.modules.movement.NoSlow_47kC.a ^ a0) ^ 98725420289156L);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey10, "OnlyWhileMove", true);
        recovery$indy$flow$2635(this, initialized21);
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey10, "StartSlow", false);
        recovery$indy$flow$2638(this, initialized22);
        client.setting.BooleanSetting initialized23 = new client.setting.BooleanSetting(this, constructorKey10, "EnableIntervals", false);
        recovery$indy$flow$2641(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey10, "SwitchOnlyEmptySlot", false);
        recovery$indy$flow$2644(this, initialized24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey10, "SwitchGomme", false);
        recovery$indy$flow$2647(this, initialized25);
        java.lang.Object initialValue26 = recovery$indy$flow$2649(5);
        ((java.lang.Object[]) initialValue26)[0] = "PreAttack";
        ((java.lang.Object[]) initialValue26)[1] = "PostAttack";
        ((java.lang.Object[]) initialValue26)[2] = "PrePosition";
        ((java.lang.Object[]) initialValue26)[3] = "PostPosition";
        ((java.lang.Object[]) initialValue26)[4] = "PrePostPosition";
        client.setting.ModeSetting initialized27 = new client.setting.ModeSetting(this, "SwitchMode", constructorKey17, "PreAttack", (java.lang.String[]) (initialValue26));
        recovery$indy$flow$2651(this, initialized27);
        java.lang.Object initialValue28 = recovery$indy$flow$2653(4);
        ((java.lang.Object[]) initialValue28)[0] = "PreAttack";
        ((java.lang.Object[]) initialValue28)[1] = "PostAttack";
        ((java.lang.Object[]) initialValue28)[2] = "PrePosition";
        ((java.lang.Object[]) initialValue28)[3] = "PostPosition";
        client.setting.ModeSetting initialized29 = new client.setting.ModeSetting(this, "SlotMode", constructorKey17, "PreAttack", (java.lang.String[]) (initialValue28));
        recovery$indy$flow$2655(this, initialized29);
        java.lang.Object initialValue30 = recovery$indy$flow$2657(4);
        ((java.lang.Object[]) initialValue30)[0] = "PreAttack";
        ((java.lang.Object[]) initialValue30)[1] = "PostAttack";
        ((java.lang.Object[]) initialValue30)[2] = "PrePosition";
        ((java.lang.Object[]) initialValue30)[3] = "PostPosition";
        client.setting.ModeSetting initialized31 = new client.setting.ModeSetting(this, "SpamMode", constructorKey17, "PostPosition", (java.lang.String[]) (initialValue30));
        recovery$indy$flow$2659(this, initialized31);
        java.lang.Object initialValue32 = recovery$indy$flow$2661(4);
        ((java.lang.Object[]) initialValue32)[0] = "Legit";
        ((java.lang.Object[]) initialValue32)[1] = "LegitMotion";
        ((java.lang.Object[]) initialValue32)[2] = "AllDirection";
        ((java.lang.Object[]) initialValue32)[3] = "AllDirectionMotion";
        client.setting.ModeSetting initialized33 = new client.setting.ModeSetting(this, "Mode", constructorKey17, "Legit", (java.lang.String[]) (initialValue32));
        recovery$indy$flow$2663(this, initialized33);
        client.setting.SettingGroup initialized34 = new client.setting.SettingGroup(this, "Sword", constructorKey9);
        recovery$indy$flow$2666(this, initialized34);
        java.lang.Object initialValue35 = recovery$indy$flow$2668();
        java.lang.Object initialValue36 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.MultiSelectSetting initialized37 = new client.setting.MultiSelectSetting(this, "Sword", constructorKey18, (net.C_47OZ[]) (initialValue35), (client.setting.SettingGroup) (initialValue36));
        recovery$indy$flow$2671(this, initialized37);
        java.lang.Object initialValue38 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized39 = new client.setting.NumberSetting(this, "SwordForward", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue38), constructorKey20);
        java.lang.Object initialValue40 = recovery$indy$flow$2675();
        java.lang.Object initialValue41 = recovery$indy$flow$2676(initialValue40);
        java.lang.Object initialValue42 = recovery$indy$flow$2677(initialValue40);
        java.lang.Object initialValue43 = initialValue42;
        client.setting.NumberSetting initialValue44 = initialized39;
        java.lang.Object initialValue45 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue46 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue47 = recovery$indy$flow$2680(initialValue45, initialValue46);
        recovery$indy$flow$2681(this, initialValue47);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized49 = new client.setting.NumberSetting(this, "SwordStrafe", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue48), constructorKey20);
        java.lang.Object initialValue50 = recovery$indy$flow$2685();
        java.lang.Object initialValue51 = recovery$indy$flow$2686(initialValue50);
        java.lang.Object initialValue52 = recovery$indy$flow$2687(initialValue50);
        java.lang.Object initialValue53 = initialValue52;
        client.setting.NumberSetting initialValue54 = initialized49;
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue56 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue57 = recovery$indy$flow$2690(initialValue55, initialValue56);
        recovery$indy$flow$2691(this, initialValue57);
        java.lang.Object initialValue58 = recovery$indy$flow$2693(3);
        ((java.lang.Object[]) initialValue58)[0] = "None";
        ((java.lang.Object[]) initialValue58)[1] = "TicksToNextSlowdownApply";
        ((java.lang.Object[]) initialValue58)[2] = "TicksToNextDelayApply";
        java.lang.Object initialValue59 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.ModeSetting initialized60 = new client.setting.ModeSetting(this, "SwordSlowdownInterval", "None", (java.lang.String[]) (initialValue58), (client.setting.SettingGroup) (initialValue59), constructorKey13);
        java.lang.String initialValue61 = "SlowdownInterval";
        long initialValue62 = constructorKey3;
        client.setting.ModeSetting initialValue63 = initialized60;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue66 = recovery$indy$flow$2698(initialValue64, initialValue62, initialValue65);
        java.lang.Object initialValue67 = recovery$indy$flow$2699(this);
        java.lang.Object initialValue68 = initialValue67;
        java.lang.Object initialValue69 = initialValue66;
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue72 = recovery$indy$flow$2702(initialValue70, initialValue71);
        recovery$indy$flow$2703(this, initialValue72);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized74 = new client.setting.NumberSetting(this, "SwordSlowdownIntervalAir", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue73), constructorKey20);
        short converted75 = (short) (constructorPart6);
        int initialValue76 = (int) (converted75);
        int initialValue77 = constructorPart5;
        java.lang.String initialValue78 = "SlowdownIntervalAir";
        int initialValue79 = constructorPart4;
        client.setting.NumberSetting initialValue80 = initialized74;
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue82 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue83 = recovery$indy$flow$2709(initialValue81, initialValue79, initialValue82, initialValue77, (short) (initialValue76));
        java.lang.Object initialValue84 = recovery$indy$flow$2710(this);
        java.lang.Object initialValue85 = initialValue84;
        java.lang.Object initialValue86 = initialValue83;
        java.lang.Object initialValue87 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue86))))));
        java.lang.Object initialValue88 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue89 = recovery$indy$flow$2713(initialValue87, initialValue88);
        recovery$indy$flow$2714(this, initialValue89);
        java.lang.Object initialValue90 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized91 = new client.setting.NumberSetting(this, "SwordSlowdownIntervalGround", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue90), constructorKey20);
        short converted92 = (short) (constructorPart6);
        int initialValue93 = (int) (converted92);
        int initialValue94 = constructorPart5;
        java.lang.String initialValue95 = "SlowdownIntervalGround";
        int initialValue96 = constructorPart4;
        client.setting.NumberSetting initialValue97 = initialized91;
        java.lang.Object initialValue98 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue99 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue100 = recovery$indy$flow$2720(initialValue98, initialValue96, initialValue99, initialValue94, (short) (initialValue93));
        java.lang.Object initialValue101 = recovery$indy$flow$2721(this);
        java.lang.Object initialValue102 = initialValue101;
        java.lang.Object initialValue103 = initialValue100;
        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue105 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue106 = recovery$indy$flow$2724(initialValue104, initialValue105);
        recovery$indy$flow$2725(this, initialValue106);
        java.lang.Object initialValue107 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized108 = new client.setting.NumberSetting(this, "TimerSword", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue107), constructorKey20);
        java.lang.Object initialValue109 = recovery$indy$flow$2729();
        java.lang.Object initialValue110 = recovery$indy$flow$2730(initialValue109);
        java.lang.Object initialValue111 = recovery$indy$flow$2731(initialValue109);
        java.lang.Object initialValue112 = initialValue111;
        client.setting.NumberSetting initialValue113 = initialized108;
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue112))))));
        java.lang.Object initialValue116 = recovery$indy$flow$2734(initialValue114, initialValue115);
        recovery$indy$flow$2735(this, initialValue116);
        java.lang.Object initialValue117 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized118 = new client.setting.NumberSetting(this, "SwordSneakForward", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue117), constructorKey20);
        java.lang.Object initialValue119 = recovery$indy$flow$2739();
        java.lang.Object initialValue120 = recovery$indy$flow$2740(initialValue119);
        java.lang.Object initialValue121 = recovery$indy$flow$2741(initialValue119);
        java.lang.Object initialValue122 = initialValue121;
        client.setting.NumberSetting initialValue123 = initialized118;
        java.lang.Object initialValue124 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue123))))));
        java.lang.Object initialValue125 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue122))))));
        java.lang.Object initialValue126 = recovery$indy$flow$2744(initialValue124, initialValue125);
        recovery$indy$flow$2745(this, initialValue126);
        java.lang.Object initialValue127 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingSword));
        client.setting.NumberSetting initialized128 = new client.setting.NumberSetting(this, "SwordSneakStrafe", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue127), constructorKey20);
        java.lang.Object initialValue129 = recovery$indy$flow$2749();
        java.lang.Object initialValue130 = recovery$indy$flow$2750(initialValue129);
        java.lang.Object initialValue131 = recovery$indy$flow$2751(initialValue129);
        java.lang.Object initialValue132 = initialValue131;
        client.setting.NumberSetting initialValue133 = initialized128;
        java.lang.Object initialValue134 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue133))))));
        java.lang.Object initialValue135 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue132))))));
        java.lang.Object initialValue136 = recovery$indy$flow$2754(initialValue134, initialValue135);
        recovery$indy$flow$2755(this, initialValue136);
        client.setting.BooleanSetting initialized137 = new client.setting.BooleanSetting(this, constructorKey10, "SwordNullItem", false);
        java.lang.Object initialValue138 = recovery$indy$flow$2758();
        java.lang.Object initialValue139 = recovery$indy$flow$2759(initialValue138);
        java.lang.Object initialValue140 = recovery$indy$flow$2760(initialValue138);
        java.lang.Object initialValue141 = initialValue140;
        long initialValue142 = constructorKey7;
        client.setting.BooleanSetting initialValue143 = initialized137;
        java.lang.Object initialValue144 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue143))))));
        java.lang.Object initialValue145 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue141))))));
        java.lang.Object initialValue146 = recovery$indy$flow$2763(initialValue144, initialValue142, initialValue145);
        java.lang.Object initialValue147 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue146))))));
        recovery$indy$flow$2765(this, initialValue147);
        client.setting.BooleanSetting initialized148 = new client.setting.BooleanSetting(this, constructorKey10, "SwordEditFacing", false);
        java.lang.Object initialValue149 = recovery$indy$flow$2768();
        java.lang.Object initialValue150 = recovery$indy$flow$2769(initialValue149);
        java.lang.Object initialValue151 = recovery$indy$flow$2770(initialValue149);
        java.lang.Object initialValue152 = initialValue151;
        long initialValue153 = constructorKey7;
        client.setting.BooleanSetting initialValue154 = initialized148;
        java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue156 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue152))))));
        java.lang.Object initialValue157 = recovery$indy$flow$2773(initialValue155, initialValue153, initialValue156);
        java.lang.Object initialValue158 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue157))))));
        recovery$indy$flow$2775(this, initialValue158);
        client.setting.NumberSetting initialized159 = new client.setting.NumberSetting(this, "SwordEnumFacingID", 0.0D, constructorKey19, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0);
        java.lang.Object initialValue160 = recovery$indy$flow$2778(this);
        java.lang.Object initialValue161 = initialValue160;
        client.setting.NumberSetting initialValue162 = initialized159;
        java.lang.Object initialValue163 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue162))))));
        java.lang.Object initialValue164 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue161))))));
        java.lang.Object initialValue165 = recovery$indy$flow$2781(initialValue163, initialValue164);
        recovery$indy$flow$2782(this, initialValue165);
        client.setting.BooleanSetting initialized166 = new client.setting.BooleanSetting(this, constructorKey10, "SwordCustomBlockPos", true);
        java.lang.Object initialValue167 = recovery$indy$flow$2785();
        java.lang.Object initialValue168 = recovery$indy$flow$2786(initialValue167);
        java.lang.Object initialValue169 = recovery$indy$flow$2787(initialValue167);
        java.lang.Object initialValue170 = initialValue169;
        long initialValue171 = constructorKey7;
        client.setting.BooleanSetting initialValue172 = initialized166;
        java.lang.Object initialValue173 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue172))))));
        java.lang.Object initialValue174 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue170))))));
        java.lang.Object initialValue175 = recovery$indy$flow$2790(initialValue173, initialValue171, initialValue174);
        java.lang.Object initialValue176 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue175))))));
        recovery$indy$flow$2792(this, initialValue176);
        short converted177 = (short) (constructorPart15);
        short converted178 = (short) (constructorPart16);
        client.setting.RangeSetting initialized179 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomBlockPosX", 0.0D, 0.0D, converted177, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted178);
        long initialValue180 = constructorKey8;
        client.setting.RangeSetting initialValue181 = initialized179;
        java.lang.Object initialValue182 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue181))))));
        java.lang.Object initialValue183 = recovery$indy$flow$2796(initialValue182, initialValue180);
        java.lang.Object initialValue184 = recovery$indy$flow$2797(this);
        long initialValue185 = constructorKey12;
        java.lang.Object initialValue186 = initialValue184;
        int initialValue187 = constructorPart11;
        java.lang.Object initialValue188 = initialValue183;
        java.lang.Object initialValue189 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue188))))));
        java.lang.Object initialValue190 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue186))))));
        java.lang.Object initialValue191 = recovery$indy$flow$2800(initialValue189, initialValue187, initialValue190, initialValue185);
        recovery$indy$flow$2801(this, initialValue191);
        short converted192 = (short) (constructorPart15);
        short converted193 = (short) (constructorPart16);
        client.setting.RangeSetting initialized194 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomBlockPosY", 0.0D, 0.0D, converted192, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted193);
        long initialValue195 = constructorKey8;
        client.setting.RangeSetting initialValue196 = initialized194;
        java.lang.Object initialValue197 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue196))))));
        java.lang.Object initialValue198 = recovery$indy$flow$2805(initialValue197, initialValue195);
        java.lang.Object initialValue199 = recovery$indy$flow$2806(this);
        long initialValue200 = constructorKey12;
        java.lang.Object initialValue201 = initialValue199;
        int initialValue202 = constructorPart11;
        java.lang.Object initialValue203 = initialValue198;
        java.lang.Object initialValue204 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue203))))));
        java.lang.Object initialValue205 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue201))))));
        java.lang.Object initialValue206 = recovery$indy$flow$2809(initialValue204, initialValue202, initialValue205, initialValue200);
        recovery$indy$flow$2810(this, initialValue206);
        short converted207 = (short) (constructorPart15);
        short converted208 = (short) (constructorPart16);
        client.setting.RangeSetting initialized209 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomBlockPosZ", 0.0D, 0.0D, converted207, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted208);
        long initialValue210 = constructorKey8;
        client.setting.RangeSetting initialValue211 = initialized209;
        java.lang.Object initialValue212 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue211))))));
        java.lang.Object initialValue213 = recovery$indy$flow$2814(initialValue212, initialValue210);
        java.lang.Object initialValue214 = recovery$indy$flow$2815(this);
        long initialValue215 = constructorKey12;
        java.lang.Object initialValue216 = initialValue214;
        int initialValue217 = constructorPart11;
        java.lang.Object initialValue218 = initialValue213;
        java.lang.Object initialValue219 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue218))))));
        java.lang.Object initialValue220 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue216))))));
        java.lang.Object initialValue221 = recovery$indy$flow$2818(initialValue219, initialValue217, initialValue220, initialValue215);
        recovery$indy$flow$2819(this, initialValue221);
        client.setting.BooleanSetting initialized222 = new client.setting.BooleanSetting(this, constructorKey10, "SwordCustomFacing", false);
        java.lang.Object initialValue223 = recovery$indy$flow$2822();
        java.lang.Object initialValue224 = recovery$indy$flow$2823(initialValue223);
        java.lang.Object initialValue225 = recovery$indy$flow$2824(initialValue223);
        java.lang.Object initialValue226 = initialValue225;
        long initialValue227 = constructorKey7;
        client.setting.BooleanSetting initialValue228 = initialized222;
        java.lang.Object initialValue229 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue228))))));
        java.lang.Object initialValue230 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue226))))));
        java.lang.Object initialValue231 = recovery$indy$flow$2827(initialValue229, initialValue227, initialValue230);
        java.lang.Object initialValue232 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue231))))));
        recovery$indy$flow$2829(this, initialValue232);
        short converted233 = (short) (constructorPart15);
        short converted234 = (short) (constructorPart16);
        client.setting.RangeSetting initialized235 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomFacingX", 0.0D, 0.0D, converted233, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted234);
        long initialValue236 = constructorKey8;
        client.setting.RangeSetting initialValue237 = initialized235;
        java.lang.Object initialValue238 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue237))))));
        java.lang.Object initialValue239 = recovery$indy$flow$2833(initialValue238, initialValue236);
        java.lang.Object initialValue240 = recovery$indy$flow$2834(this);
        long initialValue241 = constructorKey12;
        java.lang.Object initialValue242 = initialValue240;
        int initialValue243 = constructorPart11;
        java.lang.Object initialValue244 = initialValue239;
        java.lang.Object initialValue245 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue244))))));
        java.lang.Object initialValue246 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue242))))));
        java.lang.Object initialValue247 = recovery$indy$flow$2837(initialValue245, initialValue243, initialValue246, initialValue241);
        recovery$indy$flow$2838(this, initialValue247);
        short converted248 = (short) (constructorPart15);
        short converted249 = (short) (constructorPart16);
        client.setting.RangeSetting initialized250 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomFacingY", 0.0D, 0.0D, converted248, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted249);
        long initialValue251 = constructorKey8;
        client.setting.RangeSetting initialValue252 = initialized250;
        java.lang.Object initialValue253 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue252))))));
        java.lang.Object initialValue254 = recovery$indy$flow$2842(initialValue253, initialValue251);
        java.lang.Object initialValue255 = recovery$indy$flow$2843(this);
        long initialValue256 = constructorKey12;
        java.lang.Object initialValue257 = initialValue255;
        int initialValue258 = constructorPart11;
        java.lang.Object initialValue259 = initialValue254;
        java.lang.Object initialValue260 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue259))))));
        java.lang.Object initialValue261 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue257))))));
        java.lang.Object initialValue262 = recovery$indy$flow$2846(initialValue260, initialValue258, initialValue261, initialValue256);
        recovery$indy$flow$2847(this, initialValue262);
        short converted263 = (short) (constructorPart15);
        short converted264 = (short) (constructorPart16);
        client.setting.RangeSetting initialized265 = new client.setting.RangeSetting(constructorPart14, this, "SwordCustomFacingZ", 0.0D, 0.0D, converted263, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted264);
        long initialValue266 = constructorKey8;
        client.setting.RangeSetting initialValue267 = initialized265;
        java.lang.Object initialValue268 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue267))))));
        java.lang.Object initialValue269 = recovery$indy$flow$2851(initialValue268, initialValue266);
        java.lang.Object initialValue270 = recovery$indy$flow$2852(this);
        long initialValue271 = constructorKey12;
        java.lang.Object initialValue272 = initialValue270;
        int initialValue273 = constructorPart11;
        java.lang.Object initialValue274 = initialValue269;
        java.lang.Object initialValue275 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue274))))));
        java.lang.Object initialValue276 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue272))))));
        java.lang.Object initialValue277 = recovery$indy$flow$2855(initialValue275, initialValue273, initialValue276, initialValue271);
        recovery$indy$flow$2856(this, initialValue277);
        client.setting.SettingGroup initialized278 = new client.setting.SettingGroup(this, "Bow", constructorKey9);
        recovery$indy$flow$2859(this, initialized278);
        java.lang.Object initialValue279 = recovery$indy$flow$2861();
        java.lang.Object initialValue280 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.MultiSelectSetting initialized281 = new client.setting.MultiSelectSetting(this, "Bow", constructorKey18, (net.C_47OZ[]) (initialValue279), (client.setting.SettingGroup) (initialValue280));
        recovery$indy$flow$2864(this, initialized281);
        java.lang.Object initialValue282 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized283 = new client.setting.NumberSetting(this, "BowForward", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue282), constructorKey20);
        java.lang.Object initialValue284 = recovery$indy$flow$2868();
        java.lang.Object initialValue285 = recovery$indy$flow$2869(initialValue284);
        java.lang.Object initialValue286 = recovery$indy$flow$2870(initialValue284);
        java.lang.Object initialValue287 = initialValue286;
        client.setting.NumberSetting initialValue288 = initialized283;
        java.lang.Object initialValue289 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue288))))));
        java.lang.Object initialValue290 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue287))))));
        java.lang.Object initialValue291 = recovery$indy$flow$2873(initialValue289, initialValue290);
        recovery$indy$flow$2874(this, initialValue291);
        java.lang.Object initialValue292 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized293 = new client.setting.NumberSetting(this, "BowStrafe", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue292), constructorKey20);
        java.lang.Object initialValue294 = recovery$indy$flow$2878();
        java.lang.Object initialValue295 = recovery$indy$flow$2879(initialValue294);
        java.lang.Object initialValue296 = recovery$indy$flow$2880(initialValue294);
        java.lang.Object initialValue297 = initialValue296;
        client.setting.NumberSetting initialValue298 = initialized293;
        java.lang.Object initialValue299 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue298))))));
        java.lang.Object initialValue300 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue297))))));
        java.lang.Object initialValue301 = recovery$indy$flow$2883(initialValue299, initialValue300);
        recovery$indy$flow$2884(this, initialValue301);
        java.lang.Object initialValue302 = recovery$indy$flow$2886(3);
        ((java.lang.Object[]) initialValue302)[0] = "None";
        ((java.lang.Object[]) initialValue302)[1] = "TicksToNextSlowdownApply";
        ((java.lang.Object[]) initialValue302)[2] = "TicksToNextDelayApply";
        java.lang.Object initialValue303 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.ModeSetting initialized304 = new client.setting.ModeSetting(this, "BowSlowdownInterval", "None", (java.lang.String[]) (initialValue302), (client.setting.SettingGroup) (initialValue303), constructorKey13);
        java.lang.String initialValue305 = "SlowdownInterval";
        long initialValue306 = constructorKey3;
        client.setting.ModeSetting initialValue307 = initialized304;
        java.lang.Object initialValue308 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue307))))));
        java.lang.Object initialValue309 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue305))))));
        java.lang.Object initialValue310 = recovery$indy$flow$2891(initialValue308, initialValue306, initialValue309);
        java.lang.Object initialValue311 = recovery$indy$flow$2892(this);
        java.lang.Object initialValue312 = initialValue311;
        java.lang.Object initialValue313 = initialValue310;
        java.lang.Object initialValue314 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue313))))));
        java.lang.Object initialValue315 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue312))))));
        java.lang.Object initialValue316 = recovery$indy$flow$2895(initialValue314, initialValue315);
        recovery$indy$flow$2896(this, initialValue316);
        java.lang.Object initialValue317 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized318 = new client.setting.NumberSetting(this, "BowSlowdownIntervalAir", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue317), constructorKey20);
        short converted319 = (short) (constructorPart6);
        int initialValue320 = (int) (converted319);
        int initialValue321 = constructorPart5;
        java.lang.String initialValue322 = "SlowdownIntervalAir";
        int initialValue323 = constructorPart4;
        client.setting.NumberSetting initialValue324 = initialized318;
        java.lang.Object initialValue325 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue324))))));
        java.lang.Object initialValue326 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue322))))));
        java.lang.Object initialValue327 = recovery$indy$flow$2902(initialValue325, initialValue323, initialValue326, initialValue321, (short) (initialValue320));
        java.lang.Object initialValue328 = recovery$indy$flow$2903(this);
        java.lang.Object initialValue329 = initialValue328;
        java.lang.Object initialValue330 = initialValue327;
        java.lang.Object initialValue331 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue330))))));
        java.lang.Object initialValue332 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue329))))));
        java.lang.Object initialValue333 = recovery$indy$flow$2906(initialValue331, initialValue332);
        recovery$indy$flow$2907(this, initialValue333);
        java.lang.Object initialValue334 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized335 = new client.setting.NumberSetting(this, "BowSlowdownIntervalGround", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue334), constructorKey20);
        short converted336 = (short) (constructorPart6);
        int initialValue337 = (int) (converted336);
        int initialValue338 = constructorPart5;
        java.lang.String initialValue339 = "SlowdownIntervalGround";
        int initialValue340 = constructorPart4;
        client.setting.NumberSetting initialValue341 = initialized335;
        java.lang.Object initialValue342 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue341))))));
        java.lang.Object initialValue343 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue339))))));
        java.lang.Object initialValue344 = recovery$indy$flow$2913(initialValue342, initialValue340, initialValue343, initialValue338, (short) (initialValue337));
        java.lang.Object initialValue345 = recovery$indy$flow$2914(this);
        java.lang.Object initialValue346 = initialValue345;
        java.lang.Object initialValue347 = initialValue344;
        java.lang.Object initialValue348 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue347))))));
        java.lang.Object initialValue349 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue346))))));
        java.lang.Object initialValue350 = recovery$indy$flow$2917(initialValue348, initialValue349);
        recovery$indy$flow$2918(this, initialValue350);
        java.lang.Object initialValue351 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized352 = new client.setting.NumberSetting(this, "TimerBow", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue351), constructorKey20);
        java.lang.Object initialValue353 = recovery$indy$flow$2922();
        java.lang.Object initialValue354 = recovery$indy$flow$2923(initialValue353);
        java.lang.Object initialValue355 = recovery$indy$flow$2924(initialValue353);
        java.lang.Object initialValue356 = initialValue355;
        client.setting.NumberSetting initialValue357 = initialized352;
        java.lang.Object initialValue358 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue357))))));
        java.lang.Object initialValue359 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue356))))));
        java.lang.Object initialValue360 = recovery$indy$flow$2927(initialValue358, initialValue359);
        recovery$indy$flow$2928(this, initialValue360);
        java.lang.Object initialValue361 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized362 = new client.setting.NumberSetting(this, "BowSneakForward", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue361), constructorKey20);
        java.lang.Object initialValue363 = recovery$indy$flow$2932();
        java.lang.Object initialValue364 = recovery$indy$flow$2933(initialValue363);
        java.lang.Object initialValue365 = recovery$indy$flow$2934(initialValue363);
        java.lang.Object initialValue366 = initialValue365;
        client.setting.NumberSetting initialValue367 = initialized362;
        java.lang.Object initialValue368 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue367))))));
        java.lang.Object initialValue369 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue366))))));
        java.lang.Object initialValue370 = recovery$indy$flow$2937(initialValue368, initialValue369);
        recovery$indy$flow$2938(this, initialValue370);
        java.lang.Object initialValue371 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingBow));
        client.setting.NumberSetting initialized372 = new client.setting.NumberSetting(this, "BowSneakStrafe", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue371), constructorKey20);
        java.lang.Object initialValue373 = recovery$indy$flow$2942();
        java.lang.Object initialValue374 = recovery$indy$flow$2943(initialValue373);
        java.lang.Object initialValue375 = recovery$indy$flow$2944(initialValue373);
        java.lang.Object initialValue376 = initialValue375;
        client.setting.NumberSetting initialValue377 = initialized372;
        java.lang.Object initialValue378 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue377))))));
        java.lang.Object initialValue379 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue376))))));
        java.lang.Object initialValue380 = recovery$indy$flow$2947(initialValue378, initialValue379);
        recovery$indy$flow$2948(this, initialValue380);
        client.setting.BooleanSetting initialized381 = new client.setting.BooleanSetting(this, constructorKey10, "BowNullItem", false);
        java.lang.Object initialValue382 = recovery$indy$flow$2951();
        java.lang.Object initialValue383 = recovery$indy$flow$2952(initialValue382);
        java.lang.Object initialValue384 = recovery$indy$flow$2953(initialValue382);
        java.lang.Object initialValue385 = initialValue384;
        long initialValue386 = constructorKey7;
        client.setting.BooleanSetting initialValue387 = initialized381;
        java.lang.Object initialValue388 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue387))))));
        java.lang.Object initialValue389 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue385))))));
        java.lang.Object initialValue390 = recovery$indy$flow$2956(initialValue388, initialValue386, initialValue389);
        java.lang.Object initialValue391 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue390))))));
        recovery$indy$flow$2958(this, initialValue391);
        client.setting.BooleanSetting initialized392 = new client.setting.BooleanSetting(this, constructorKey10, "BowEditFacing", false);
        java.lang.Object initialValue393 = recovery$indy$flow$2961();
        java.lang.Object initialValue394 = recovery$indy$flow$2962(initialValue393);
        java.lang.Object initialValue395 = recovery$indy$flow$2963(initialValue393);
        java.lang.Object initialValue396 = initialValue395;
        long initialValue397 = constructorKey7;
        client.setting.BooleanSetting initialValue398 = initialized392;
        java.lang.Object initialValue399 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue398))))));
        java.lang.Object initialValue400 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue396))))));
        java.lang.Object initialValue401 = recovery$indy$flow$2966(initialValue399, initialValue397, initialValue400);
        java.lang.Object initialValue402 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue401))))));
        recovery$indy$flow$2968(this, initialValue402);
        client.setting.NumberSetting initialized403 = new client.setting.NumberSetting(this, "BowEnumFacingID", 0.0D, constructorKey19, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0);
        java.lang.Object initialValue404 = recovery$indy$flow$2971(this);
        java.lang.Object initialValue405 = initialValue404;
        client.setting.NumberSetting initialValue406 = initialized403;
        java.lang.Object initialValue407 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue406))))));
        java.lang.Object initialValue408 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue405))))));
        java.lang.Object initialValue409 = recovery$indy$flow$2974(initialValue407, initialValue408);
        recovery$indy$flow$2975(this, initialValue409);
        client.setting.BooleanSetting initialized410 = new client.setting.BooleanSetting(this, constructorKey10, "BowCustomBlockPos", true);
        java.lang.Object initialValue411 = recovery$indy$flow$2978();
        java.lang.Object initialValue412 = recovery$indy$flow$2979(initialValue411);
        java.lang.Object initialValue413 = recovery$indy$flow$2980(initialValue411);
        java.lang.Object initialValue414 = initialValue413;
        long initialValue415 = constructorKey7;
        client.setting.BooleanSetting initialValue416 = initialized410;
        java.lang.Object initialValue417 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue416))))));
        java.lang.Object initialValue418 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue414))))));
        java.lang.Object initialValue419 = recovery$indy$flow$2983(initialValue417, initialValue415, initialValue418);
        java.lang.Object initialValue420 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue419))))));
        recovery$indy$flow$2985(this, initialValue420);
        short converted421 = (short) (constructorPart15);
        short converted422 = (short) (constructorPart16);
        client.setting.RangeSetting initialized423 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomBlockPosX", 0.0D, 0.0D, converted421, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted422);
        long initialValue424 = constructorKey8;
        client.setting.RangeSetting initialValue425 = initialized423;
        java.lang.Object initialValue426 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue425))))));
        java.lang.Object initialValue427 = recovery$indy$flow$2989(initialValue426, initialValue424);
        java.lang.Object initialValue428 = recovery$indy$flow$2990(this);
        long initialValue429 = constructorKey12;
        java.lang.Object initialValue430 = initialValue428;
        int initialValue431 = constructorPart11;
        java.lang.Object initialValue432 = initialValue427;
        java.lang.Object initialValue433 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue432))))));
        java.lang.Object initialValue434 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue430))))));
        java.lang.Object initialValue435 = recovery$indy$flow$2993(initialValue433, initialValue431, initialValue434, initialValue429);
        recovery$indy$flow$2994(this, initialValue435);
        short converted436 = (short) (constructorPart15);
        short converted437 = (short) (constructorPart16);
        client.setting.RangeSetting initialized438 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomBlockPosY", 0.0D, 0.0D, converted436, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted437);
        long initialValue439 = constructorKey8;
        client.setting.RangeSetting initialValue440 = initialized438;
        java.lang.Object initialValue441 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue440))))));
        java.lang.Object initialValue442 = recovery$indy$flow$2998(initialValue441, initialValue439);
        java.lang.Object initialValue443 = recovery$indy$flow$2999(this);
        long initialValue444 = constructorKey12;
        java.lang.Object initialValue445 = initialValue443;
        int initialValue446 = constructorPart11;
        java.lang.Object initialValue447 = initialValue442;
        java.lang.Object initialValue448 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue447))))));
        java.lang.Object initialValue449 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue445))))));
        java.lang.Object initialValue450 = recovery$indy$flow$3002(initialValue448, initialValue446, initialValue449, initialValue444);
        recovery$indy$flow$3003(this, initialValue450);
        short converted451 = (short) (constructorPart15);
        short converted452 = (short) (constructorPart16);
        client.setting.RangeSetting initialized453 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomBlockPosZ", 0.0D, 0.0D, converted451, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted452);
        long initialValue454 = constructorKey8;
        client.setting.RangeSetting initialValue455 = initialized453;
        java.lang.Object initialValue456 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue455))))));
        java.lang.Object initialValue457 = recovery$indy$flow$3007(initialValue456, initialValue454);
        java.lang.Object initialValue458 = recovery$indy$flow$3008(this);
        long initialValue459 = constructorKey12;
        java.lang.Object initialValue460 = initialValue458;
        int initialValue461 = constructorPart11;
        java.lang.Object initialValue462 = initialValue457;
        java.lang.Object initialValue463 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue462))))));
        java.lang.Object initialValue464 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue460))))));
        java.lang.Object initialValue465 = recovery$indy$flow$3011(initialValue463, initialValue461, initialValue464, initialValue459);
        recovery$indy$flow$3012(this, initialValue465);
        client.setting.BooleanSetting initialized466 = new client.setting.BooleanSetting(this, constructorKey10, "BowCustomFacing", false);
        java.lang.Object initialValue467 = recovery$indy$flow$3015();
        java.lang.Object initialValue468 = recovery$indy$flow$3016(initialValue467);
        java.lang.Object initialValue469 = recovery$indy$flow$3017(initialValue467);
        java.lang.Object initialValue470 = initialValue469;
        long initialValue471 = constructorKey7;
        client.setting.BooleanSetting initialValue472 = initialized466;
        java.lang.Object initialValue473 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue472))))));
        java.lang.Object initialValue474 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue470))))));
        java.lang.Object initialValue475 = recovery$indy$flow$3020(initialValue473, initialValue471, initialValue474);
        java.lang.Object initialValue476 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue475))))));
        recovery$indy$flow$3022(this, initialValue476);
        short converted477 = (short) (constructorPart15);
        short converted478 = (short) (constructorPart16);
        client.setting.RangeSetting initialized479 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomFacingX", 0.0D, 0.0D, converted477, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted478);
        long initialValue480 = constructorKey8;
        client.setting.RangeSetting initialValue481 = initialized479;
        java.lang.Object initialValue482 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue481))))));
        java.lang.Object initialValue483 = recovery$indy$flow$3026(initialValue482, initialValue480);
        java.lang.Object initialValue484 = recovery$indy$flow$3027(this);
        long initialValue485 = constructorKey12;
        java.lang.Object initialValue486 = initialValue484;
        int initialValue487 = constructorPart11;
        java.lang.Object initialValue488 = initialValue483;
        java.lang.Object initialValue489 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue488))))));
        java.lang.Object initialValue490 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue486))))));
        java.lang.Object initialValue491 = recovery$indy$flow$3030(initialValue489, initialValue487, initialValue490, initialValue485);
        recovery$indy$flow$3031(this, initialValue491);
        short converted492 = (short) (constructorPart15);
        short converted493 = (short) (constructorPart16);
        client.setting.RangeSetting initialized494 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomFacingY", 0.0D, 0.0D, converted492, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted493);
        long initialValue495 = constructorKey8;
        client.setting.RangeSetting initialValue496 = initialized494;
        java.lang.Object initialValue497 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue496))))));
        java.lang.Object initialValue498 = recovery$indy$flow$3035(initialValue497, initialValue495);
        java.lang.Object initialValue499 = recovery$indy$flow$3036(this);
        long initialValue500 = constructorKey12;
        java.lang.Object initialValue501 = initialValue499;
        int initialValue502 = constructorPart11;
        java.lang.Object initialValue503 = initialValue498;
        java.lang.Object initialValue504 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue503))))));
        java.lang.Object initialValue505 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue501))))));
        java.lang.Object initialValue506 = recovery$indy$flow$3039(initialValue504, initialValue502, initialValue505, initialValue500);
        recovery$indy$flow$3040(this, initialValue506);
        short converted507 = (short) (constructorPart15);
        short converted508 = (short) (constructorPart16);
        client.setting.RangeSetting initialized509 = new client.setting.RangeSetting(constructorPart14, this, "BowCustomFacingZ", 0.0D, 0.0D, converted507, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted508);
        long initialValue510 = constructorKey8;
        client.setting.RangeSetting initialValue511 = initialized509;
        java.lang.Object initialValue512 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue511))))));
        java.lang.Object initialValue513 = recovery$indy$flow$3044(initialValue512, initialValue510);
        java.lang.Object initialValue514 = recovery$indy$flow$3045(this);
        long initialValue515 = constructorKey12;
        java.lang.Object initialValue516 = initialValue514;
        int initialValue517 = constructorPart11;
        java.lang.Object initialValue518 = initialValue513;
        java.lang.Object initialValue519 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue518))))));
        java.lang.Object initialValue520 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue516))))));
        java.lang.Object initialValue521 = recovery$indy$flow$3048(initialValue519, initialValue517, initialValue520, initialValue515);
        recovery$indy$flow$3049(this, initialValue521);
        client.setting.SettingGroup initialized522 = new client.setting.SettingGroup(this, "Rest", constructorKey9);
        recovery$indy$flow$3052(this, initialized522);
        java.lang.Object initialValue523 = recovery$indy$flow$3054();
        java.lang.Object initialValue524 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.MultiSelectSetting initialized525 = new client.setting.MultiSelectSetting(this, "Rest", constructorKey18, (net.C_47OZ[]) (initialValue523), (client.setting.SettingGroup) (initialValue524));
        recovery$indy$flow$3057(this, initialized525);
        java.lang.Object initialValue526 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized527 = new client.setting.NumberSetting(this, "RestForward", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue526), constructorKey20);
        java.lang.Object initialValue528 = recovery$indy$flow$3061();
        java.lang.Object initialValue529 = recovery$indy$flow$3062(initialValue528);
        java.lang.Object initialValue530 = recovery$indy$flow$3063(initialValue528);
        java.lang.Object initialValue531 = initialValue530;
        client.setting.NumberSetting initialValue532 = initialized527;
        java.lang.Object initialValue533 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue532))))));
        java.lang.Object initialValue534 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue531))))));
        java.lang.Object initialValue535 = recovery$indy$flow$3066(initialValue533, initialValue534);
        recovery$indy$flow$3067(this, initialValue535);
        java.lang.Object initialValue536 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized537 = new client.setting.NumberSetting(this, "RestStrafe", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4596373779694328218L), 1.0D, 2, (client.setting.SettingGroup) (initialValue536), constructorKey20);
        java.lang.Object initialValue538 = recovery$indy$flow$3071();
        java.lang.Object initialValue539 = recovery$indy$flow$3072(initialValue538);
        java.lang.Object initialValue540 = recovery$indy$flow$3073(initialValue538);
        java.lang.Object initialValue541 = initialValue540;
        client.setting.NumberSetting initialValue542 = initialized537;
        java.lang.Object initialValue543 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue542))))));
        java.lang.Object initialValue544 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue541))))));
        java.lang.Object initialValue545 = recovery$indy$flow$3076(initialValue543, initialValue544);
        recovery$indy$flow$3077(this, initialValue545);
        boolean initialValue546 = recovery$indy$flow$3078();
        java.lang.Object initialValue547 = recovery$indy$flow$3080(3);
        ((java.lang.Object[]) initialValue547)[0] = "None";
        ((java.lang.Object[]) initialValue547)[1] = "TicksToNextSlowdownApply";
        ((java.lang.Object[]) initialValue547)[2] = "TicksToNextDelayApply";
        java.lang.Object initialValue548 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.ModeSetting initialized549 = new client.setting.ModeSetting(this, "RestSlowdownInterval", "None", (java.lang.String[]) (initialValue547), (client.setting.SettingGroup) (initialValue548), constructorKey13);
        java.lang.String initialValue550 = "SlowdownInterval";
        long initialValue551 = constructorKey3;
        client.setting.ModeSetting initialValue552 = initialized549;
        java.lang.Object initialValue553 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue552))))));
        java.lang.Object initialValue554 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue550))))));
        java.lang.Object initialValue555 = recovery$indy$flow$3085(initialValue553, initialValue551, initialValue554);
        java.lang.Object initialValue556 = recovery$indy$flow$3086(this);
        java.lang.Object initialValue557 = initialValue556;
        java.lang.Object initialValue558 = initialValue555;
        java.lang.Object initialValue559 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue558))))));
        java.lang.Object initialValue560 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue557))))));
        java.lang.Object initialValue561 = recovery$indy$flow$3089(initialValue559, initialValue560);
        recovery$indy$flow$3090(this, initialValue561);
        java.lang.Object initialValue562 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized563 = new client.setting.NumberSetting(this, "RestSlowdownIntervalAir", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue562), constructorKey20);
        short converted564 = (short) (constructorPart6);
        int initialValue565 = (int) (converted564);
        int initialValue566 = constructorPart5;
        java.lang.String initialValue567 = "SlowdownIntervalAir";
        int initialValue568 = constructorPart4;
        client.setting.NumberSetting initialValue569 = initialized563;
        java.lang.Object initialValue570 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue569))))));
        java.lang.Object initialValue571 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue567))))));
        java.lang.Object initialValue572 = recovery$indy$flow$3096(initialValue570, initialValue568, initialValue571, initialValue566, (short) (initialValue565));
        java.lang.Object initialValue573 = recovery$indy$flow$3097(this);
        java.lang.Object initialValue574 = initialValue573;
        java.lang.Object initialValue575 = initialValue572;
        java.lang.Object initialValue576 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue575))))));
        java.lang.Object initialValue577 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue574))))));
        java.lang.Object initialValue578 = recovery$indy$flow$3100(initialValue576, initialValue577);
        recovery$indy$flow$3101(this, initialValue578);
        java.lang.Object initialValue579 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized580 = new client.setting.NumberSetting(this, "RestSlowdownIntervalGround", 0.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue579), constructorKey20);
        short converted581 = (short) (constructorPart6);
        int initialValue582 = (int) (converted581);
        int initialValue583 = constructorPart5;
        java.lang.String initialValue584 = "SlowdownIntervalGround";
        int initialValue585 = constructorPart4;
        client.setting.NumberSetting initialValue586 = initialized580;
        java.lang.Object initialValue587 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue586))))));
        java.lang.Object initialValue588 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue584))))));
        java.lang.Object initialValue589 = recovery$indy$flow$3107(initialValue587, initialValue585, initialValue588, initialValue583, (short) (initialValue582));
        java.lang.Object initialValue590 = recovery$indy$flow$3108(this);
        java.lang.Object initialValue591 = initialValue590;
        java.lang.Object initialValue592 = initialValue589;
        java.lang.Object initialValue593 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue592))))));
        java.lang.Object initialValue594 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue591))))));
        java.lang.Object initialValue595 = recovery$indy$flow$3111(initialValue593, initialValue594);
        recovery$indy$flow$3112(this, initialValue595);
        java.lang.Object initialValue596 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized597 = new client.setting.NumberSetting(this, "TimerRest", Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue596), constructorKey20);
        java.lang.Object initialValue598 = recovery$indy$flow$3116();
        java.lang.Object initialValue599 = recovery$indy$flow$3117(initialValue598);
        java.lang.Object initialValue600 = recovery$indy$flow$3118(initialValue598);
        java.lang.Object initialValue601 = initialValue600;
        client.setting.NumberSetting initialValue602 = initialized597;
        java.lang.Object initialValue603 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue602))))));
        java.lang.Object initialValue604 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue601))))));
        java.lang.Object initialValue605 = recovery$indy$flow$3121(initialValue603, initialValue604);
        recovery$indy$flow$3122(this, initialValue605);
        java.lang.Object initialValue606 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized607 = new client.setting.NumberSetting(this, "RestSneakForward", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue606), constructorKey20);
        java.lang.Object initialValue608 = recovery$indy$flow$3126();
        java.lang.Object initialValue609 = recovery$indy$flow$3127(initialValue608);
        java.lang.Object initialValue610 = recovery$indy$flow$3128(initialValue608);
        java.lang.Object initialValue611 = initialValue610;
        client.setting.NumberSetting initialValue612 = initialized607;
        java.lang.Object initialValue613 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue612))))));
        java.lang.Object initialValue614 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue611))))));
        java.lang.Object initialValue615 = recovery$indy$flow$3131(initialValue613, initialValue614);
        recovery$indy$flow$3132(this, initialValue615);
        java.lang.Object initialValue616 = ((java.lang.Object)(((augustus.recovered.modules.movement.NoSlow_47kC) (((java.lang.Object)(this)))).settingRest));
        client.setting.NumberSetting initialized617 = new client.setting.NumberSetting(this, "RestSneakStrafe", Double.longBitsToDouble(4599075939470750515L), Double.longBitsToDouble(4599075939470750515L), 1.0D, 2, (client.setting.SettingGroup) (initialValue616), constructorKey20);
        java.lang.Object initialValue618 = recovery$indy$flow$3136();
        java.lang.Object initialValue619 = recovery$indy$flow$3137(initialValue618);
        java.lang.Object initialValue620 = recovery$indy$flow$3138(initialValue618);
        java.lang.Object initialValue621 = initialValue620;
        client.setting.NumberSetting initialValue622 = initialized617;
        java.lang.Object initialValue623 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue622))))));
        java.lang.Object initialValue624 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue621))))));
        java.lang.Object initialValue625 = recovery$indy$flow$3141(initialValue623, initialValue624);
        recovery$indy$flow$3142(this, initialValue625);
        client.setting.BooleanSetting initialized626 = new client.setting.BooleanSetting(this, constructorKey10, "RestNullItem", false);
        java.lang.Object initialValue627 = recovery$indy$flow$3145();
        java.lang.Object initialValue628 = recovery$indy$flow$3146(initialValue627);
        java.lang.Object initialValue629 = recovery$indy$flow$3147(initialValue627);
        java.lang.Object initialValue630 = initialValue629;
        long initialValue631 = constructorKey7;
        client.setting.BooleanSetting initialValue632 = initialized626;
        java.lang.Object initialValue633 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue632))))));
        java.lang.Object initialValue634 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue630))))));
        java.lang.Object initialValue635 = recovery$indy$flow$3150(initialValue633, initialValue631, initialValue634);
        java.lang.Object initialValue636 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue635))))));
        recovery$indy$flow$3152(this, initialValue636);
        client.setting.BooleanSetting initialized637 = new client.setting.BooleanSetting(this, constructorKey10, "RestEditFacing", false);
        java.lang.Object initialValue638 = recovery$indy$flow$3155();
        java.lang.Object initialValue639 = recovery$indy$flow$3156(initialValue638);
        java.lang.Object initialValue640 = recovery$indy$flow$3157(initialValue638);
        java.lang.Object initialValue641 = initialValue640;
        long initialValue642 = constructorKey7;
        client.setting.BooleanSetting initialValue643 = initialized637;
        java.lang.Object initialValue644 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue643))))));
        java.lang.Object initialValue645 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue641))))));
        java.lang.Object initialValue646 = recovery$indy$flow$3160(initialValue644, initialValue642, initialValue645);
        java.lang.Object initialValue647 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue646))))));
        recovery$indy$flow$3162(this, initialValue647);
        client.setting.NumberSetting initialized648 = new client.setting.NumberSetting(this, "RestEnumFacingID", 0.0D, constructorKey19, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0);
        java.lang.Object initialValue649 = recovery$indy$flow$3165(this);
        java.lang.Object initialValue650 = initialValue649;
        client.setting.NumberSetting initialValue651 = initialized648;
        java.lang.Object initialValue652 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue651))))));
        java.lang.Object initialValue653 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue650))))));
        java.lang.Object initialValue654 = recovery$indy$flow$3168(initialValue652, initialValue653);
        recovery$indy$flow$3169(this, initialValue654);
        client.setting.BooleanSetting initialized655 = new client.setting.BooleanSetting(this, constructorKey10, "RestCustomBlockPos", true);
        java.lang.Object initialValue656 = recovery$indy$flow$3172();
        java.lang.Object initialValue657 = recovery$indy$flow$3173(initialValue656);
        java.lang.Object initialValue658 = recovery$indy$flow$3174(initialValue656);
        java.lang.Object initialValue659 = initialValue658;
        long initialValue660 = constructorKey7;
        client.setting.BooleanSetting initialValue661 = initialized655;
        java.lang.Object initialValue662 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue661))))));
        java.lang.Object initialValue663 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue659))))));
        java.lang.Object initialValue664 = recovery$indy$flow$3177(initialValue662, initialValue660, initialValue663);
        java.lang.Object initialValue665 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue664))))));
        recovery$indy$flow$3179(this, initialValue665);
        short converted666 = (short) (constructorPart15);
        short converted667 = (short) (constructorPart16);
        client.setting.RangeSetting initialized668 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomBlockPosX", 0.0D, 0.0D, converted666, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted667);
        long initialValue669 = constructorKey8;
        client.setting.RangeSetting initialValue670 = initialized668;
        java.lang.Object initialValue671 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue670))))));
        java.lang.Object initialValue672 = recovery$indy$flow$3183(initialValue671, initialValue669);
        java.lang.Object initialValue673 = recovery$indy$flow$3184(this);
        long initialValue674 = constructorKey12;
        java.lang.Object initialValue675 = initialValue673;
        int initialValue676 = constructorPart11;
        java.lang.Object initialValue677 = initialValue672;
        java.lang.Object initialValue678 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue677))))));
        java.lang.Object initialValue679 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue675))))));
        java.lang.Object initialValue680 = recovery$indy$flow$3187(initialValue678, initialValue676, initialValue679, initialValue674);
        recovery$indy$flow$3188(this, initialValue680);
        short converted681 = (short) (constructorPart15);
        short converted682 = (short) (constructorPart16);
        client.setting.RangeSetting initialized683 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomBlockPosY", 0.0D, 0.0D, converted681, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted682);
        long initialValue684 = constructorKey8;
        client.setting.RangeSetting initialValue685 = initialized683;
        java.lang.Object initialValue686 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue685))))));
        java.lang.Object initialValue687 = recovery$indy$flow$3192(initialValue686, initialValue684);
        java.lang.Object initialValue688 = recovery$indy$flow$3193(this);
        long initialValue689 = constructorKey12;
        java.lang.Object initialValue690 = initialValue688;
        int initialValue691 = constructorPart11;
        java.lang.Object initialValue692 = initialValue687;
        java.lang.Object initialValue693 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue692))))));
        java.lang.Object initialValue694 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue690))))));
        java.lang.Object initialValue695 = recovery$indy$flow$3196(initialValue693, initialValue691, initialValue694, initialValue689);
        recovery$indy$flow$3197(this, initialValue695);
        short converted696 = (short) (constructorPart15);
        short converted697 = (short) (constructorPart16);
        client.setting.RangeSetting initialized698 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomBlockPosZ", 0.0D, 0.0D, converted696, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted697);
        long initialValue699 = constructorKey8;
        client.setting.RangeSetting initialValue700 = initialized698;
        java.lang.Object initialValue701 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue700))))));
        java.lang.Object initialValue702 = recovery$indy$flow$3201(initialValue701, initialValue699);
        java.lang.Object initialValue703 = recovery$indy$flow$3202(this);
        long initialValue704 = constructorKey12;
        java.lang.Object initialValue705 = initialValue703;
        int initialValue706 = constructorPart11;
        java.lang.Object initialValue707 = initialValue702;
        java.lang.Object initialValue708 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue707))))));
        java.lang.Object initialValue709 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue705))))));
        java.lang.Object initialValue710 = recovery$indy$flow$3205(initialValue708, initialValue706, initialValue709, initialValue704);
        recovery$indy$flow$3206(this, initialValue710);
        client.setting.BooleanSetting initialized711 = new client.setting.BooleanSetting(this, constructorKey10, "RestCustomFacing", false);
        java.lang.Object initialValue712 = recovery$indy$flow$3209();
        java.lang.Object initialValue713 = recovery$indy$flow$3210(initialValue712);
        java.lang.Object initialValue714 = recovery$indy$flow$3211(initialValue712);
        java.lang.Object initialValue715 = initialValue714;
        long initialValue716 = constructorKey7;
        client.setting.BooleanSetting initialValue717 = initialized711;
        java.lang.Object initialValue718 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue717))))));
        java.lang.Object initialValue719 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue715))))));
        java.lang.Object initialValue720 = recovery$indy$flow$3214(initialValue718, initialValue716, initialValue719);
        java.lang.Object initialValue721 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue720))))));
        recovery$indy$flow$3216(this, initialValue721);
        short converted722 = (short) (constructorPart15);
        short converted723 = (short) (constructorPart16);
        client.setting.RangeSetting initialized724 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomFacingX", 0.0D, 0.0D, converted722, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted723);
        long initialValue725 = constructorKey8;
        client.setting.RangeSetting initialValue726 = initialized724;
        java.lang.Object initialValue727 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue726))))));
        java.lang.Object initialValue728 = recovery$indy$flow$3220(initialValue727, initialValue725);
        java.lang.Object initialValue729 = recovery$indy$flow$3221(this);
        long initialValue730 = constructorKey12;
        java.lang.Object initialValue731 = initialValue729;
        int initialValue732 = constructorPart11;
        java.lang.Object initialValue733 = initialValue728;
        java.lang.Object initialValue734 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue733))))));
        java.lang.Object initialValue735 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue731))))));
        java.lang.Object initialValue736 = recovery$indy$flow$3224(initialValue734, initialValue732, initialValue735, initialValue730);
        recovery$indy$flow$3225(this, initialValue736);
        short converted737 = (short) (constructorPart15);
        short converted738 = (short) (constructorPart16);
        client.setting.RangeSetting initialized739 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomFacingY", 0.0D, 0.0D, converted737, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted738);
        long initialValue740 = constructorKey8;
        client.setting.RangeSetting initialValue741 = initialized739;
        java.lang.Object initialValue742 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue741))))));
        java.lang.Object initialValue743 = recovery$indy$flow$3229(initialValue742, initialValue740);
        java.lang.Object initialValue744 = recovery$indy$flow$3230(this);
        long initialValue745 = constructorKey12;
        java.lang.Object initialValue746 = initialValue744;
        int initialValue747 = constructorPart11;
        java.lang.Object initialValue748 = initialValue743;
        java.lang.Object initialValue749 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue748))))));
        java.lang.Object initialValue750 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue746))))));
        java.lang.Object initialValue751 = recovery$indy$flow$3233(initialValue749, initialValue747, initialValue750, initialValue745);
        recovery$indy$flow$3234(this, initialValue751);
        short converted752 = (short) (constructorPart15);
        short converted753 = (short) (constructorPart16);
        client.setting.RangeSetting initialized754 = new client.setting.RangeSetting(constructorPart14, this, "RestCustomFacingZ", 0.0D, 0.0D, converted752, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 8, converted753);
        long initialValue755 = constructorKey8;
        client.setting.RangeSetting initialValue756 = initialized754;
        java.lang.Object initialValue757 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue756))))));
        java.lang.Object initialValue758 = recovery$indy$flow$3238(initialValue757, initialValue755);
        java.lang.Object initialValue759 = recovery$indy$flow$3239(this);
        long initialValue760 = constructorKey12;
        java.lang.Object initialValue761 = initialValue759;
        int initialValue762 = constructorPart11;
        java.lang.Object initialValue763 = initialValue758;
        java.lang.Object initialValue764 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue763))))));
        java.lang.Object initialValue765 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue761))))));
        java.lang.Object initialValue766 = recovery$indy$flow$3242(initialValue764, initialValue762, initialValue765, initialValue760);
        recovery$indy$flow$3243(this, initialValue766);
        client.setting.BooleanSetting initialized767 = new client.setting.BooleanSetting(this, constructorKey10, "InputForwardLegit", false);
        java.lang.Object initialValue768 = recovery$indy$flow$3246();
        java.lang.Object initialValue769 = initialValue768;
        long initialValue770 = constructorKey7;
        client.setting.BooleanSetting initialValue771 = initialized767;
        java.lang.Object initialValue772 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue771))))));
        java.lang.Object initialValue773 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue769))))));
        java.lang.Object initialValue774 = recovery$indy$flow$3249(initialValue772, initialValue770, initialValue773);
        java.lang.Object initialValue775 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue774))))));
        recovery$indy$flow$3251(this, initialValue775);
        client.setting.NumberSetting initialized776 = new client.setting.NumberSetting(this, "InputForward", 0.0D, constructorKey19, Double.longBitsToDouble(-4616189618054758400L), 1.0D, 2);
        java.lang.Object initialValue777 = recovery$indy$flow$3254(this);
        java.lang.Object initialValue778 = initialValue777;
        client.setting.NumberSetting initialValue779 = initialized776;
        java.lang.Object initialValue780 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue779))))));
        java.lang.Object initialValue781 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue778))))));
        java.lang.Object initialValue782 = recovery$indy$flow$3257(initialValue780, initialValue781);
        recovery$indy$flow$3258(this, initialValue782);
        client.setting.BooleanSetting initialized783 = new client.setting.BooleanSetting(this, constructorKey10, "InputStrafeLegit", false);
        java.lang.Object initialValue784 = recovery$indy$flow$3261();
        java.lang.Object initialValue785 = initialValue784;
        long initialValue786 = constructorKey7;
        client.setting.BooleanSetting initialValue787 = initialized783;
        java.lang.Object initialValue788 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue787))))));
        java.lang.Object initialValue789 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue785))))));
        java.lang.Object initialValue790 = recovery$indy$flow$3264(initialValue788, initialValue786, initialValue789);
        java.lang.Object initialValue791 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue790))))));
        recovery$indy$flow$3266(this, initialValue791);
        client.setting.NumberSetting initialized792 = new client.setting.NumberSetting(this, "InputStrafe", 0.0D, constructorKey19, Double.longBitsToDouble(-4616189618054758400L), 1.0D, 2);
        java.lang.Object initialValue793 = recovery$indy$flow$3269(this);
        java.lang.Object initialValue794 = initialValue793;
        client.setting.NumberSetting initialValue795 = initialized792;
        java.lang.Object initialValue796 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue795))))));
        java.lang.Object initialValue797 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue794))))));
        java.lang.Object initialValue798 = recovery$indy$flow$3272(initialValue796, initialValue797);
        recovery$indy$flow$3273(this, initialValue798);
        client.setting.BooleanSetting initialized799 = new client.setting.BooleanSetting(this, constructorKey10, "InputJumpLegit", false);
        java.lang.Object initialValue800 = recovery$indy$flow$3276();
        java.lang.Object initialValue801 = initialValue800;
        long initialValue802 = constructorKey7;
        client.setting.BooleanSetting initialValue803 = initialized799;
        java.lang.Object initialValue804 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue803))))));
        java.lang.Object initialValue805 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue801))))));
        java.lang.Object initialValue806 = recovery$indy$flow$3279(initialValue804, initialValue802, initialValue805);
        java.lang.Object initialValue807 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue806))))));
        recovery$indy$flow$3281(this, initialValue807);
        int initialValue808 = (int) ((initialValue546 ? 1 : 0));
        client.setting.BooleanSetting initialized809 = new client.setting.BooleanSetting(this, constructorKey10, "InputJump", false);
        java.lang.Object initialValue810 = recovery$indy$flow$3284(this);
        java.lang.Object initialValue811 = initialValue810;
        long initialValue812 = constructorKey7;
        client.setting.BooleanSetting initialValue813 = initialized809;
        java.lang.Object initialValue814 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue813))))));
        java.lang.Object initialValue815 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue811))))));
        java.lang.Object initialValue816 = recovery$indy$flow$3287(initialValue814, initialValue812, initialValue815);
        java.lang.Object initialValue817 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue816))))));
        recovery$indy$flow$3289(this, initialValue817);
        client.setting.BooleanSetting initialized818 = new client.setting.BooleanSetting(this, constructorKey10, "InputSneakLegit", false);
        java.lang.Object initialValue819 = recovery$indy$flow$3292();
        java.lang.Object initialValue820 = initialValue819;
        long initialValue821 = constructorKey7;
        client.setting.BooleanSetting initialValue822 = initialized818;
        java.lang.Object initialValue823 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue822))))));
        java.lang.Object initialValue824 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue820))))));
        java.lang.Object initialValue825 = recovery$indy$flow$3295(initialValue823, initialValue821, initialValue824);
        java.lang.Object initialValue826 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue825))))));
        recovery$indy$flow$3297(this, initialValue826);
        client.setting.BooleanSetting initialized827 = new client.setting.BooleanSetting(this, constructorKey10, "InputSneak", false);
        java.lang.Object initialValue828 = recovery$indy$flow$3300(this);
        java.lang.Object initialValue829 = initialValue828;
        long initialValue830 = constructorKey7;
        client.setting.BooleanSetting initialValue831 = initialized827;
        java.lang.Object initialValue832 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue831))))));
        java.lang.Object initialValue833 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue829))))));
        java.lang.Object initialValue834 = recovery$indy$flow$3303(initialValue832, initialValue830, initialValue833);
        java.lang.Object initialValue835 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue834))))));
        recovery$indy$flow$3305(this, initialValue835);
        net.C_47cu initialized836 = new net.C_47cu();
        recovery$indy$flow$3308(this, initialized836);
        recovery$indy$flow$3309(this, 0);
        recovery$indy$flow$3310(this, null);
        recovery$indy$flow$3311(this, true);
        recovery$indy$flow$3312(this, 0);
        recovery$indy$flow$3313(this, 0);
        recovery$indy$flow$3314(this, 0);
        recovery$indy$flow$3315(this, 0);
        recovery$indy$flow$3316(this, false);
        recovery$indy$flow$3317(this, false);
        recovery$indy$flow$3318(this, false);
        if (initialValue808 != 0) {
            return;
        } else {
            java.lang.Object initialValue837 = recovery$indy$flow$3319(1);
            java.lang.Object initialValue838 = initialValue837;
            java.lang.Object initialValue839 = recovery$indy$flow$3320(initialValue838);
            recovery$indy$flow$3321(initialValue839);
            return;
        }
    }

























    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private boolean method_437$aae029aa0a() {
      long var1 = a ^ 16311481139631L;
      long var3 = var1 ^ 82378743201708L;
      long var10000 = 8815795782155891977L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 8811990634238658898L;
      long var6 = var3;
      ModeSetting var8 = this.settingBowSlowdownInterval;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5) {
         if (var11) {
            return false;
         }

         long var10001 = 8813169656281296940L;
         C_47G2 var9 = C_47G2.SLOWDOWN;
         var11 = var9.method_43$aae029aa0a();
      }

      if (var5) {
         if (!var11) {
            return false;
         }

         long var12 = 8812212024906088542L;
         BooleanSetting var10 = this.settingEnableIntervals;
         var11 = var10.method_49$aae029aa0a();
      }

      return !var5 ? var11 : var11;
   }


    private static native boolean recovery$indy$flow$998(long a0,long a1,long a2);
    private static native boolean recovery$indy$flow$1328(long a0,long a1,long a2);
    private static native boolean recovery$indy$flow$2578(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2580(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2583(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2587(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2591(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2597(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2602(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$2607(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$2635(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2638(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2641(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2644(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2647(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2649(int a0);
    private static native void recovery$indy$flow$2651(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2653(int a0);
    private static native void recovery$indy$flow$2655(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2657(int a0);
    private static native void recovery$indy$flow$2659(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2661(int a0);
    private static native void recovery$indy$flow$2663(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2666(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2668();

    private static native void recovery$indy$flow$2671(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2675() {
        return net.C_47x6.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$2676(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2677(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2680(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2681(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2685() {
        return net.C_47x6.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$2686(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2687(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2690(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2691(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2693(int a0);



    private static native java.lang.Object recovery$indy$flow$2698(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2699(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2702(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2703(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2709(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2710(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2713(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2714(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2720(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2721(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2724(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2725(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2729() {
        return net.C_47x6.TIMER;
    }
    private static java.lang.Object recovery$indy$flow$2730(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2731(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2734(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2735(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2739() {
        return net.C_47x6.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$2740(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2741(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2744(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2745(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2749() {
        return net.C_47x6.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$2750(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2751(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2754(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2755(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2758() {
        return net.C_47x6.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2759(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2760(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2763(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2765(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2768() {
        return net.C_47x6.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2769(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2770(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2773(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2775(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2778(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2781(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2782(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2785() {
        return net.C_47x6.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2786(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2787(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2790(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2792(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2796(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2797(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2800(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2801(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2805(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2806(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2809(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2810(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2814(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2815(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2818(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2819(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2822() {
        return net.C_47x6.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2823(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2824(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2827(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2829(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2833(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2834(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2837(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2838(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2842(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2843(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2846(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2847(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2851(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2852(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2855(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2856(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2859(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2861();

    private static native void recovery$indy$flow$2864(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2868() {
        return net.C_47G2.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$2869(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2870(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2873(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2874(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2878() {
        return net.C_47G2.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$2879(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2880(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2883(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2884(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2886(int a0);



    private static native java.lang.Object recovery$indy$flow$2891(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2892(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2895(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2896(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2902(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2903(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2906(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2907(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2913(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2914(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2917(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2918(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2922() {
        return net.C_47G2.TIMER;
    }
    private static java.lang.Object recovery$indy$flow$2923(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2924(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2927(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2928(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2932() {
        return net.C_47G2.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$2933(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2934(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2937(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2938(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2942() {
        return net.C_47G2.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$2943(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2944(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2947(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2948(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2951() {
        return net.C_47G2.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2952(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2953(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2956(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2958(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2961() {
        return net.C_47G2.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2962(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2963(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2966(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2968(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2971(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2974(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2975(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2978() {
        return net.C_47G2.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$2979(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2980(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2983(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2985(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2989(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2990(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2993(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2994(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2998(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2999(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3002(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3003(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3007(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3008(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3011(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3012(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$3015() {
        return net.C_47G2.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$3016(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3017(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3020(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3022(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3026(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3027(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3030(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3031(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3035(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3036(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3039(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3040(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3044(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3045(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3048(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3049(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3052(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3054();

    private static native void recovery$indy$flow$3057(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$3061() {
        return net.C_47I9.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$3062(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3063(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3066(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3067(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$3071() {
        return net.C_47I9.SLOWDOWN;
    }
    private static java.lang.Object recovery$indy$flow$3072(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3073(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3076(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3077(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$3078();
    private static native java.lang.Object recovery$indy$flow$3080(int a0);



    private static native java.lang.Object recovery$indy$flow$3085(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$3086(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3089(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3090(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$3096(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$3097(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3100(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3101(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$3107(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$3108(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3111(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3112(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$3116() {
        return net.C_47I9.TIMER;
    }
    private static java.lang.Object recovery$indy$flow$3117(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3118(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3121(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3122(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$3126() {
        return net.C_47I9.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$3127(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3128(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3131(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3132(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$3136() {
        return net.C_47I9.SNEAK;
    }
    private static java.lang.Object recovery$indy$flow$3137(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3138(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3141(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3142(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$3145() {
        return net.C_47I9.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$3146(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3147(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3150(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3152(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$3155() {
        return net.C_47I9.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$3156(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3157(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3160(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3162(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3165(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3168(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3169(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$3172() {
        return net.C_47I9.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$3173(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3174(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3177(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3179(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3183(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3184(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3187(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3188(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3192(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3193(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3196(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3197(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3201(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3202(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3205(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3206(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$3209() {
        return net.C_47I9.INVALID_PACKET;
    }
    private static java.lang.Object recovery$indy$flow$3210(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$3211(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3214(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3216(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3220(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3221(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3224(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3225(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3229(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3230(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3233(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3234(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$3238(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$3239(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3242(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$3243(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3246();


    private static native java.lang.Object recovery$indy$flow$3249(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3251(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3254(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3257(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3258(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3261();


    private static native java.lang.Object recovery$indy$flow$3264(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3266(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3269(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3272(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3273(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3276();


    private static native java.lang.Object recovery$indy$flow$3279(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3281(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3284(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3287(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3289(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3292();


    private static native java.lang.Object recovery$indy$flow$3295(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3297(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$3300(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$3303(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$3305(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$3308(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$3309(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$3310(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_40k = ((net.C_47rf) (a1));
        return;
    }
    private static void recovery$indy$flow$3311(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$3312(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$3313(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$3314(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$3315(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$3316(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$3317(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_40f = a1;
        return;
    }
    private static void recovery$indy$flow$3318(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.NoSlow_47kC) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$3319(int a0);
    private static java.lang.Object recovery$indy$flow$3320(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$3321(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native String recovery$indy$2(int var0, long var1);
   private static native String recovery$indy$3(int var0, long var1);
   private static native boolean recovery$indy$4(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native boolean recovery$indy$5(long var0, long var2, long var4);
   private static native MethodHandle recovery$constant$6();
   private static native boolean recovery$indy$7(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);
   private static native double recovery$indy$17(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3);
   private static native String recovery$indy$24(int var0, long var1);
   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$26(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$32(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$33(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native C_40X recovery$indy$35(Object var0, long var1, long var3);
}
