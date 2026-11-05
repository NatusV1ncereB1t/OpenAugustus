package augustus.recovered.modules.legit;
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
import net.C_40d;
import net.C_42a;
import net.C_45n;
import net.C_473X;
import net.C_4749;
import net.C_474k;
import net.C_475c;
import net.C_476q;
import net.C_476x;
import net.C_477A;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Ij;
import net.C_47MO;
import net.minecraft.entity.Entity;
import net.C_47My;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TT;
import net.C_47TU;
import client.setting.BooleanSetting;
import net.C_47Tf;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47UR;
import net.C_47VU;
import net.C_47Wq;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47ej;
import net.C_47gg;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oY;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tf;
import net.C_47xl;
import net.C_47xz;
import net.C_48p;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoClicker_47Cn extends client.module.Module implements net.C_47oO,net.C_47UH,net.C_476x,net.C_47xz {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCPSLimiter = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCPSLimiterIntave = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingModeValues = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSimpleCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSimpleCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingSimpleClickDutyCycle = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSimpleDoubleClicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSimpleExtraDoubleClickRandomize = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDeviationCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDeviationDoubleClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDeviationAirMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDragCPSInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDragCPSInAirRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaxCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaxCPSRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMinStandardDeviation = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAdvancedCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAdvancedCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSpikes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSpikeDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSpikeDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSpikeMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDrops = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDropDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDropDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDropMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReduceHitsInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingReduceRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingReduceMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReduceHitsOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingReduceRecalculateDelayOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingReduceMultiplierOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingHurttimesToHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingClickPattern = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingRecordedMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRecordedAirMultiplier = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPlayRecordedMouseMovements = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSmartMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSmartClickMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSmartDoubleClickModeS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCPSSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSInAirRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartDCPSInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPSInAirRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSOnWallRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartDCPSOnWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPSOnWallRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOnFirstHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSFirstHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPSFirstHitRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartDCPSFirstHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartDCPSFirstHitRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOnTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartDCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPSRecalculateTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingTiming = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTimingValues = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingPrediction = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingLoseDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingEndurance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingEnduranceReduction = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayClicksAfterClosingGuiScreen = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReduceCPSIfYouCanNotHitATargett = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCritFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingPerfectHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAttackFriends = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingLongClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBreakBlocks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBreakTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyOnClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47Tf field_48B = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_48r; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_48c; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_40d field_48H; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43W; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_44Z; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X[] field_44B = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k[] field_48D = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting[] field_48y = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_48l = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_444 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44d = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_48f = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_48S = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44p = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_442 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44j = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48X = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44D = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47UR field_48z = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44M = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44n = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48e = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44f = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47ej field_448 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44H = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_480; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48I; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_44i; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_44N; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_485; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_441; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_44R; // Runtime access flags and ConstantValue are restored from the original class.
    private float[] field_48k; // Runtime access flags and ConstantValue are restored from the original class.
    private double[] field_44A; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_44r; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_44S; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43U; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_44g; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44c = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

   private boolean method_49y$aae029aa0a() {
      long var1 = a ^ 65073596656290L;
      long var3 = var1 ^ 75465306591018L;
      long var10000 = 790118087969990522L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 791385498416455639L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = 791385498416455639L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_498$aae029aa0a() {
      long var1 = a ^ 18650677687291L;
      long var3 = var1 ^ 122578120382067L;
      long var10000 = 6026433701320488010L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 6026585081946719886L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (var5) {
         if (!var12) {
            return false;
         }

         var10002 = 6026585081946719886L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Recommended");
      }

      return !var5 ? var12 : var12;
   }



   private boolean method_49n$aae029aa0a() {
      long var1 = a ^ 74996294079603L;
      long var3 = var1 ^ 65665438446075L;
      long var10000 = 3758928192494441410L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 3759080656125632774L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 3758572641245841941L;
         BooleanSetting var9 = this.settingReduceHitsInAir;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_46$7b44fbd6b7(double var1, long var3, int var5) {
        net.minecraft.client.Minecraft var135;
        int var142;
        net.minecraft.client.Minecraft var144;
        int var146;
      var3 = a ^ var3;
      long var6 = var3 ^ 93930982833231L;
      long var8 = var3 ^ 19017972241341L;
      long var10 = var3 ^ 90637984496732L;
      int var12 = (int)((var3 ^ 10894067956563L) >>> 48);
      long var13 = (var3 ^ 10894067956563L) << 16 >>> 16;
      long var15 = var3 ^ 125061464228328L;
      long var10000 = -5079771229286870004L;
      byte var17 = ((byte) (AimBot_47O_.method_45g$aae029aa0a() ? 1 : 0));
      long var10002 = -5076253702519083871L;
      long var26 = var10;
      client.setting.ModeSetting var28 = this.settingTiming;
      byte var130 = ((byte) (var28.method_46$5f9dc63072(var26).equals((String)recovery$indy$flow$34(21057, 4290536942808983077L ^ var3)) ? 1 : 0));
      if (var17 != 0) {
         if (var3 < 0L) {
            if (var17 == 0) {
               if (var130 == 0) {
                  long var186 = -5065242821152014437L;
                  client.setting.RangeSetting var80 = this.settingEndurance;
                  var80.method_43$fedcb3e4d3();
               }

               this.field_43P = true;
               var130 = 0;
            }

            return (((var130) & 1) != 0);
         } else if (var17 != 0) {
            if (var17 == 0) {
               if (var130 == 0) {
                  long var185 = -5065242821152014437L;
                  client.setting.RangeSetting var79 = this.settingEndurance;
                  var79.method_43$fedcb3e4d3();
               }

               this.field_43P = true;
               var130 = 0;
            }

            return (((var130) & 1) != 0);
         } else {
            var10002 = -5076050904288769821L;
            client.setting.RangeSetting var75 = this.settingEndurance;
            int var168 = var75.method_44$8abf5c6871();
            if (var3 > 0L) {
               label459:
               if (var130 <= var168) {
                  label496: {
                     int var143 = ((int) (this.field_43P ? 1 : 0));
                     long var234;
                     int var208 = (var234 = var3 - 0L) == 0L ? 0 : (var234 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        if (this.field_43P) {
                           break label459;
                        }

                        var144 = field_43;
                        long var235;
                        int var209 = (var235 = var3 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                        if (var17 != 0) {
                           break label496;
                        }

                        long var176 = -5075865123262662167L;
                        net.minecraft.client.Minecraft var81 = field_43;
                        var143 = var81.field_423;
                     }

                     if (var143 == 1) {
                        long var177 = -5065242821152014437L;
                        client.setting.RangeSetting var84 = this.settingLoseDelay;
                        var84.method_43$fedcb3e4d3();
                        long var178 = -5065242821152014437L;
                        client.setting.RangeSetting var87 = this.settingPrediction;
                        var87.method_43$fedcb3e4d3();
                     }

                     var144 = field_43;
                  }

                  if (var17 == 0) {
                     long var179 = -5076840039605205020L;
                     net.minecraft.client.Minecraft var90 = var144;
                     var144 = var90.field_42Y != null ? field_43 : field_43;
                  }

                  long var180 = -5063038994227395561L;
                  net.minecraft.client.Minecraft var94 = var144;
                  var10002 = -5076050904288769821L;
                  client.setting.RangeSetting var97 = this.settingLoseDelay;
                  if (var94.field_44p > var97.method_44$8abf5c6871()) {
                     return false;
                  }

                  var10002 = -5064591208714678457L;
                  net.minecraft.client.Minecraft var100 = field_43;
                  int var181 = (short)var12;
                  long var228 = -5064591208714678457L;
                  net.minecraft.client.Minecraft var103 = field_43;
                  long var233 = -5064538259054326405L;
                  net.C_47Ij var60 = net.C_4749.method_40$5c9c2d08e9(1.0F, (short)var181, var100.field_42P.field_48h, var103.field_42P.field_48z, 10.0, var13, 6.0, 1.0);
                  EntityLivingBase var62 = (EntityLivingBase)var60.field_47;
                  byte var64 = 1;

                  while (true) {
                     if (var64 < var5) {
                        EntityLivingBase var182 = (EntityLivingBase)var60.field_47;
                        long var222 = -5064020769963618236L;
                        byte var105 = var64;
                        EntityLivingBase var107 = var182;
                        long var109 = var6;
                        net.C_47tf var66 = net.C_48p.method_41$cde1fe0260(var109, var107, var105);
                        var222 = -5065935243711548956L;
                        net.C_47tf var111 = var66;
                        long var113 = var8;
                        EntityLivingBase var115 = var62;
                        net.C_478i var68 = net.C_47gg.method_45$591f816751(var115, var113, var111);
                        int var145 = var64 - 1;
                        var10002 = -5064591208714678457L;
                        net.minecraft.client.Minecraft var117 = field_43;
                        var222 = -5062342114860046506L;
                        net.minecraft.client.entity.EntityPlayerSP var119 = var117.field_42P;
                        long var121 = var15;
                        int var123 = var145;
                        double[] var70 = net.C_47TT.method_45$f42b969df3(var123, var121, var119);
                        double var213 = var70[0];
                        double var225 = var70[1];
                        long var230 = -5064591208714678457L;
                        net.minecraft.client.Minecraft var125 = field_43;
                        net.C_47tf var72 = new net.C_47tf(var213, var225 + var125.field_42P.method_41$bc607678b6(), var70[2]);
                        var10002 = -5065797692275492729L;
                        net.C_478i var127 = var68;
                        net.C_47tf var129 = var72;
                        net.C_47tf var74 = net.C_47gg.method_47$42676af4e9(var129, var127);
                        long var236;
                        var181 = (var236 = var3 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                        if (var17 == 0) {
                           double var237;
                           var146 = (var237 = var72.method_43$3d77d36e13(var74) - var1) == 0.0 ? 0 : (var237 < 0.0 ? -1 : 1);
                           break;
                        }

                        if (var17 == 0) {
                           continue;
                        }
                     }

                     var146 = 0;
                     break;
                  }

                  return (((var146) & 1) != 0);
               }

               boolean var147 = this.field_43P;
               if (var17 == 0) {
                  if (!this.field_43P) {
                     long var184 = -5065242821152014437L;
                     client.setting.RangeSetting var78 = this.settingEndurance;
                     var78.method_43$fedcb3e4d3();
                  }

                  this.field_43P = true;
                  var147 = false;
               }

               return var147;
            } else {
               long var238;
               int var202 = (var238 = var3 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
               if (var130 == var168) {
                  long var169 = -5065242821152014437L;
                  client.setting.RangeSetting var83 = this.settingLoseDelay;
                  var83.method_43$fedcb3e4d3();
                  long var170 = -5065242821152014437L;
                  client.setting.RangeSetting var86 = this.settingPrediction;
                  var86.method_43$fedcb3e4d3();
               }

               net.minecraft.client.Minecraft var140 = field_43;
               if (var17 == 0) {
                  long var171 = -5076840039605205020L;
                  net.minecraft.client.Minecraft var89 = field_43;
                  var140 = var89.field_42Y != null ? field_43 : field_43;
               }

               long var172 = -5063038994227395561L;
               net.minecraft.client.Minecraft var93 = var140;
               var10002 = -5076050904288769821L;
               client.setting.RangeSetting var96 = this.settingLoseDelay;
               if (var93.field_44p > var96.method_44$8abf5c6871()) {
                  return false;
               }

               var10002 = -5064591208714678457L;
               net.minecraft.client.Minecraft var99 = field_43;
               int var173 = (short)var12;
               long var227 = -5064591208714678457L;
               net.minecraft.client.Minecraft var102 = field_43;
               long var232 = -5064538259054326405L;
               net.C_47Ij var59 = net.C_4749.method_40$5c9c2d08e9(1.0F, (short)var173, var99.field_42P.field_48h, var102.field_42P.field_48z, 10.0, var13, 6.0, 1.0);
               EntityLivingBase var61 = (EntityLivingBase)var59.field_47;
               byte var63 = 1;

               while (true) {
                  if (var63 < var5) {
                     EntityLivingBase var174 = (EntityLivingBase)var59.field_47;
                     long var218 = -5064020769963618236L;
                     byte var104 = var63;
                     EntityLivingBase var106 = var174;
                     long var108 = var6;
                     net.C_47tf var65 = net.C_48p.method_41$cde1fe0260(var108, var106, var104);
                     var218 = -5065935243711548956L;
                     net.C_47tf var110 = var65;
                     long var112 = var8;
                     EntityLivingBase var114 = var61;
                     net.C_478i var67 = net.C_47gg.method_45$591f816751(var114, var112, var110);
                     int var141 = var63 - 1;
                     var10002 = -5064591208714678457L;
                     net.minecraft.client.Minecraft var116 = field_43;
                     var218 = -5062342114860046506L;
                     net.minecraft.client.entity.EntityPlayerSP var118 = var116.field_42P;
                     long var120 = var15;
                     int var122 = var141;
                     double[] var69 = net.C_47TT.method_45$f42b969df3(var122, var120, var118);
                     double var206 = var69[0];
                     double var221 = var69[1];
                     long var229 = -5064591208714678457L;
                     net.minecraft.client.Minecraft var124 = field_43;
                     net.C_47tf var71 = new net.C_47tf(var206, var221 + var124.field_42P.method_41$bc607678b6(), var69[2]);
                     var10002 = -5065797692275492729L;
                     net.C_478i var126 = var67;
                     net.C_47tf var128 = var71;
                     net.C_47tf var73 = net.C_47gg.method_47$42676af4e9(var128, var126);
                     long var239;
                     var173 = (var239 = var3 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                     if (var17 == 0) {
                        double var240;
                        var142 = (var240 = var71.method_43$3d77d36e13(var73) - var1) == 0.0 ? 0 : (var240 < 0.0 ? -1 : 1);
                        break;
                     }

                     if (var17 == 0) {
                        continue;
                     }
                  }

                  var142 = 0;
                  break;
               }

               return (((var142) & 1) != 0);
            }
         }
      } else {
         if (var130 == 0) {
            return true;
         }

         int var131 = this.field_43U;
         if (var3 >= 0L) {
            if (var17 != 0) {
               if (var17 == 0) {
                  if (this.field_43U == 0) {
                     long var167 = -5065242821152014437L;
                     client.setting.RangeSetting var77 = this.settingEndurance;
                     var77.method_43$fedcb3e4d3();
                  }

                  this.field_43P = true;
                  var131 = 0;
               }

               return (((var131) & 1) != 0);
            } else {
               var10002 = -5076050904288769821L;
               client.setting.RangeSetting var29 = this.settingEndurance;
               int var148 = var29.method_44$8abf5c6871();
               if (var3 > 0L) {
                  label422:
                  if (var131 <= var148) {
                     label489: {
                        int var134 = ((int) (this.field_43P ? 1 : 0));
                        long var241;
                        int var192 = (var241 = var3 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                        if (var17 == 0) {
                           if (this.field_43P) {
                              break label422;
                           }

                           var135 = field_43;
                           long var242;
                           int var193 = (var242 = var3 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                           if (var17 != 0) {
                              break label489;
                           }

                           long var156 = -5075865123262662167L;
                           net.minecraft.client.Minecraft var31 = field_43;
                           var134 = var31.field_423;
                        }

                        if (var134 == 1) {
                           long var157 = -5065242821152014437L;
                           client.setting.RangeSetting var82 = this.settingLoseDelay;
                           var82.method_43$fedcb3e4d3();
                           long var158 = -5065242821152014437L;
                           client.setting.RangeSetting var85 = this.settingPrediction;
                           var85.method_43$fedcb3e4d3();
                        }

                        var135 = field_43;
                     }

                     if (var17 == 0) {
                        long var159 = -5076840039605205020L;
                        net.minecraft.client.Minecraft var88 = var135;
                        if (var88.field_42Y != null) {
                           long var160 = -5076840039605205020L;
                           net.minecraft.client.Minecraft var91 = field_43;
                           if (var91.field_42Y.field_49 == net.C_47Az.ENTITY) {
                              return true;
                           }
                        }

                        var135 = field_43;
                     }

                     long var161 = -5063038994227395561L;
                     net.minecraft.client.Minecraft var92 = var135;
                     var10002 = -5076050904288769821L;
                     client.setting.RangeSetting var95 = this.settingLoseDelay;
                     if (var92.field_44p > var95.method_44$8abf5c6871()) {
                        int var136 = this.field_43U;
                        long var243;
                        int var195 = (var243 = var3 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                        if (var17 == 0) {
                           var10002 = -5076050904288769821L;
                           client.setting.RangeSetting var38 = this.settingEndurance;
                           if (this.field_43U <= var38.method_44$8abf5c6871() / 2) {
                              var10002 = -5064591208714678457L;
                              net.minecraft.client.Minecraft var98 = field_43;
                              int var162 = (short)var12;
                              long var226 = -5064591208714678457L;
                              net.minecraft.client.Minecraft var101 = field_43;
                              long var231 = -5064538259054326405L;
                              net.C_47Ij var58 = net.C_4749.method_40$5c9c2d08e9(
                                 1.0F, (short)var162, var98.field_42P.field_48h, var101.field_42P.field_48z, 10.0, var13, 6.0, 1.0
                              );
                              if (var58 != null) {
                                 boolean var137 = var58.field_47 instanceof EntityLivingBase;
                                 long var244;
                                 var162 = (var244 = var3 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
                                 if (var137) {
                                    EntityLivingBase var19 = (EntityLivingBase)var58.field_47;
                                    int var20 = 1;

                                    while (var20 < var5) {
                                       EntityLivingBase var164 = (EntityLivingBase)var58.field_47;
                                       long var10003 = -5064020769963618236L;
                                       int var41 = var20;
                                       EntityLivingBase var42 = var164;
                                       long var43 = var6;
                                       net.C_47tf var21 = net.C_48p.method_41$cde1fe0260(var43, var42, var41);
                                       var10003 = -5065935243711548956L;
                                       net.C_47tf var45 = var21;
                                       long var46 = var8;
                                       EntityLivingBase var48 = var19;
                                       net.C_478i var22 = net.C_47gg.method_45$591f816751(var48, var46, var45);
                                       int var138 = var20 - 1;
                                       var10002 = -5064591208714678457L;
                                       net.minecraft.client.Minecraft var49 = field_43;
                                       var10003 = -5062342114860046506L;
                                       net.minecraft.client.entity.EntityPlayerSP var50 = var49.field_42P;
                                       long var51 = var15;
                                       int var53 = var138;
                                       double[] var23 = net.C_47TT.method_45$f42b969df3(var53, var51, var50);
                                       double var199 = var23[0];
                                       double var217 = var23[1];
                                       long var10005 = -5064591208714678457L;
                                       net.minecraft.client.Minecraft var54 = field_43;
                                       net.C_47tf var24 = new net.C_47tf(var199, var217 + var54.field_42P.method_41$bc607678b6(), var23[2]);
                                       var10002 = -5065797692275492729L;
                                       net.C_478i var55 = var22;
                                       net.C_47tf var56 = var24;
                                       net.C_47tf var25 = net.C_47gg.method_47$42676af4e9(var56, var55);
                                       long var245;
                                       var162 = (var245 = var3 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                                       if (var17 == 0) {
                                          if (var24.method_43$3d77d36e13(var25) < var1) {
                                             return true;
                                          }

                                          var20++;
                                       }

                                       if (var17 != 0) {
                                          break;
                                       }
                                    }

                                    return false;
                                 }
                              }

                              return false;
                           }

                           var136 = 0;
                        }

                        return (((var136) & 1) != 0);
                     }

                     return true;
                  }

                  boolean var139 = this.field_43P;
                  if (var17 == 0) {
                     if (!this.field_43P) {
                        long var166 = -5065242821152014437L;
                        client.setting.RangeSetting var76 = this.settingEndurance;
                        var76.method_43$fedcb3e4d3();
                     }

                     this.field_43P = true;
                     var139 = false;
                  }

                  return var139;
               } else {
                  long var246;
                  int var188 = (var246 = var3 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                  if (var131 == var148) {
                     long var149 = -5065242821152014437L;
                     client.setting.RangeSetting var32 = this.settingLoseDelay;
                     var32.method_43$fedcb3e4d3();
                     long var150 = -5065242821152014437L;
                     client.setting.RangeSetting var33 = this.settingPrediction;
                     var33.method_43$fedcb3e4d3();
                  }

                  net.minecraft.client.Minecraft var132 = field_43;
                  if (var17 == 0) {
                     long var151 = -5076840039605205020L;
                     net.minecraft.client.Minecraft var34 = field_43;
                     if (var34.field_42Y != null) {
                        long var152 = -5076840039605205020L;
                        net.minecraft.client.Minecraft var35 = field_43;
                        if (var35.field_42Y.field_49 == net.C_47Az.ENTITY) {
                           return true;
                        }
                     }

                     var132 = field_43;
                  }

                  long var153 = -5063038994227395561L;
                  net.minecraft.client.Minecraft var36 = var132;
                  var10002 = -5076050904288769821L;
                  client.setting.RangeSetting var37 = this.settingLoseDelay;
                  if (var36.field_44p > var37.method_44$8abf5c6871()) {
                     long var247;
                     int var190 = (var247 = var3 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                     if (this.field_43U > var17 / 2) {
                        return false;
                     }

                     var10002 = -5064591208714678457L;
                     net.minecraft.client.Minecraft var39 = field_43;
                     int var154 = (short)var12;
                     long var10004 = -5064591208714678457L;
                     net.minecraft.client.Minecraft var40 = field_43;
                     long var10008 = -5064538259054326405L;
                     net.C_47Ij var18 = net.C_4749.method_40$5c9c2d08e9(
                        1.0F, (short)var154, var39.field_42P.field_48h, var40.field_42P.field_48z, 10.0, var13, 6.0, 1.0
                     );
                     boolean var133;
                     if (var18 != null) {
                        var133 = var18.field_47 instanceof EntityLivingBase;
                        long var248;
                        var154 = (var248 = var3 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                     } else {
                        var133 = false;
                     }

                     return var133;
                  } else {
                     return true;
                  }
               }
            }
         } else {
            if (var17 == 0) {
               if (this.field_43U == 0) {
                  long var10001 = -5065242821152014437L;
                  client.setting.RangeSetting var30 = this.settingEndurance;
                  var30.method_43$fedcb3e4d3();
               }

               this.field_43P = true;
               var131 = 0;
            }

            return (((var131) & 1) != 0);
         }
      }
   }






    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private void method_42$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 45191646603522L;
      long var10001 = var1 ^ 28636942937219L;
      int var5 = (int)((var1 ^ 28636942937219L) >>> 32);
      int var6 = (int)((var1 ^ 28636942937219L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 57815255439560L;
      long var10 = var1 ^ 138501344504147L;
      var10001 = var1 ^ 112076940648607L;
      int var12 = (int)((var1 ^ 112076940648607L) >>> 32);
      int var13 = (int)((var1 ^ 112076940648607L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      int var15 = (int)((var1 ^ 31394540252040L) >>> 32);
      long var16 = (var1 ^ 31394540252040L) << 32 >>> 32;
      byte var18 = (byte) ((recovery$indy$2(-5141308374686083797L, var1)) ? 1 : 0);
      int var19 = 0;

      int var10000;
      label75:
      while (true) {
         if (var19 < this.field_44B.length) {
            this.field_44B[var19] = new C_473X();
            var19++;
            var10000 = var18;
         } else {
            var10000 = 0;
            if (var1 >= 0L) {
               var19 = 0;
               var10000 = var19;
               break;
            }
         }

         do {
            if (var1 < 0L) {
               break label75;
            }

            if (var10000 != 0) {
               var10000 = var19;
               break label75;
            }

            if (var18 == 0) {
               continue label75;
            }

            var10000 = 0;
         } while (var1 < 0L);

         var19 = 0;
         var10000 = var19;
         break;
      }

      while (true) {
         if (var1 > 0L) {
            if (var10000 < this.field_48D.length) {
               this.field_48D[var19] = new C_474k(20, var19 * 1.2 % 20.0);
               var19++;
               var10000 = var18;
               if (var1 <= 0L) {
                  break;
               }

               if (var18 != 0) {
                  var10000 = var19;
                  break;
               }

               if (var18 == 0) {
                  var10000 = var19;
                  continue;
               }
            }

            var10000 = 0;
            if (var1 <= 0L) {
               continue;
            }

            var19 = 0;
         } else {
            var19 = var10000;
         }

         var10000 = var19;
         break;
      }

      while (var10000 < 11) {
         SettingGroup var20 = recovery$indy$5(
            new SettingGroup(var10, this, recovery$indy$3(12762, 3111797915264877694L ^ var1) + var19, this.settingCPSSettings),
            var5,
            (char)var6,
            var7,
            recovery$indy$4(this),
            -5146892987684998779L,
            var1
         );
         this.field_48y[var19 * 4] = recovery$indy$10(
            recovery$indy$8(
               new RangeSetting(var12, this, recovery$indy$6(2899, 8291202276139777579L ^ var1) + var19, var13, var14, 17.0, 19.0, 1.0, 40.0, 0, var20),
               var3,
               recovery$indy$7(10704, 338225762447662315L ^ var1),
               -5146630210498647318L,
               var1
            ),
            var15,
            recovery$indy$9(this),
            var16,
            -5144064173385150224L,
            var1
         );
         this.field_48y[var19 * 4 + 1] = recovery$indy$17(
            recovery$indy$15(
               recovery$indy$14(
                  new RangeSetting(
                     var12,
                     this,
                     recovery$indy$11(10368, 5856910216272518616L ^ var1) + var19 + recovery$indy$12(24039, 5727840719434672298L ^ var1),
                     var13,
                     var14,
                     3.0,
                     8.0,
                     1.0,
                     40.0,
                     0,
                     var20
                  ),
                  var3,
                  recovery$indy$13(21483, 3481764800106751639L ^ var1),
                  -5146630210498647318L,
                  var1
               ),
               var8,
               -5147074855656570863L,
               var1
            ),
            var15,
            recovery$indy$16(this),
            var16,
            -5144064173385150224L,
            var1
         );
         this.field_48y[var19 * 4 + 2] = recovery$indy$22(
            recovery$indy$20(
               new RangeSetting(var12, this, recovery$indy$18(27494, 3723392562462940732L ^ var1) + var19, var13, var14, 4.0, 5.0, 0.0, 20.0, 0, var20),
               var3,
               recovery$indy$19(10338, 5108226162047884738L ^ var1),
               -5146630210498647318L,
               var1
            ),
            var15,
            recovery$indy$21(this),
            var16,
            -5144064173385150224L,
            var1
         );
         this.field_48y[var19 * 4 + 3] = recovery$indy$28(
            recovery$indy$26(
               recovery$indy$25(
                  new RangeSetting(var12, this, recovery$indy$23(18238, 1907207987873411706L ^ var1) + var19, var13, var14, 3.0, 8.0, 1.0, 40.0, 0, var20),
                  var3,
                  recovery$indy$24(29166, 3992336157644440644L ^ var1),
                  -5146630210498647318L,
                  var1
               ),
               var8,
               -5147074855656570863L,
               var1
            ),
            var15,
            recovery$indy$27(this),
            var16,
            -5144064173385150224L,
            var1
         );
         var19++;
         if (var18 != 0) {
            break;
         }

         var10000 = var19;
      }
   }






    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(net.C_475c var1) {
        boolean var107;
      long var2 = a ^ 118302380015864L;
      long var10001 = var2 ^ 103777359319682L;
      int var4 = (int)((var2 ^ 103777359319682L) >>> 48);
      int var5 = (int)((var2 ^ 103777359319682L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 13727458202351L;
      long var9 = var2 ^ 4863460043744L;
      long var11 = var2 ^ 63874656424615L;
      var10001 = var2 ^ 13360052465638L;
      int var13 = (int)((var2 ^ 13360052465638L) >>> 32);
      int var14 = (int)((var2 ^ 13360052465638L) << 32 >>> 40);
      int var15 = (int)(var10001 << 56 >>> 56);
      long var16 = var2 ^ 19095962691563L;
      long var18 = var2 ^ 49770330257744L;
      long var20 = var2 ^ 94652987350752L;
      long var22 = var2 ^ 60931701184537L;
      long var24 = var2 ^ 100538457743364L;
      long var10000 = -6868762930792018656L;
      boolean var26 = AimBot_47O_.method_45g$aae029aa0a();
      long var10003 = -6869038891550845103L;
      long var29 = var16;
      AutoClicker_47Cn var31 = this;
      this.field_44Z = var31.method_43$f2b0beb8fc(var29);
      if (var26) {
         long var126 = -6876918410349409798L;
         net.minecraft.client.Minecraft var98 = field_43;
         this.field_43u = var98.field_44r.field_44l.method_42$aae029aa0a();
         this.field_44S = true;
         long var97 = System.currentTimeMillis();
         long var135 = -6868799474896138883L;
         long var99 = var11;
         byte var100 = 45;
         byte var101 = 0;
         net.C_47MO var102 = net.C_476q.field_48;
         this.field_48r = var97 - var102.method_44$75dd719903(var101, var100, var99);
         this.field_47 = var97;
      } else {
         var10001 = -6871914369285595490L;
         client.setting.BooleanSetting var32 = this.settingOnlyOnClick;
         label120:
         if (var32.method_49$aae029aa0a()) {
            var10001 = -6876918410349409798L;
            net.minecraft.client.Minecraft var33 = field_43;
            if (!var33.field_44r.field_44l.method_42$aae029aa0a()) {
               var10001 = -6876918410349409798L;
               net.minecraft.client.Minecraft var34 = field_43;
               if (var34.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                  break label120;
               }
            }

            if (!this.field_43u) {
               this.field_48I = true;
            }
         }

         label114: {
            long var10002 = -6876918410349409798L;
            net.minecraft.client.Minecraft var35 = field_43;
            if (!var35.field_44r.field_44l.method_42$aae029aa0a()) {
               var10002 = -6876918410349409798L;
               net.minecraft.client.Minecraft var36 = field_43;
               if (var36.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                  var107 = false;
                  break label114;
               }
            }

            var107 = true;
         }

         label109: {
            this.field_43u = var107;
            long var116 = -6873321863303790076L;
            long var37 = var9;
            AutoClicker_47Cn var39 = this;
            if (var39.method_44E$0dd78e0064(var37)) {
               var10003 = -6871797168922996273L;
               client.setting.RangeSetting var40 = this.settingPrediction;
               int var128 = var40.method_44$8abf5c6871();
               long var10004 = -6870739134857147217L;
               int var41 = var128;
               long var42 = var18;
               double var44 = 3.0;
               AutoClicker_47Cn var46 = this;
               if (var46.method_46$7b44fbd6b7(var44, var42, var41)) {
                  var116 = -6875529120945705684L;
                  long var47 = var24;
                  AutoClicker_47Cn var49 = this;
                  if (!var49.method_44A$0dd78e0064(var47)) {
                     this.field_43U++;
                     if (this.field_44S) {
                        long var95 = System.currentTimeMillis();
                        long var134 = -6868799474896138883L;
                        long var50 = var11;
                        byte var52 = 45;
                        byte var53 = 0;
                        net.C_47MO var54 = net.C_476q.field_48;
                        this.field_48r = var95 - var54.method_44$75dd719903(var53, var52, var50);
                        this.field_47 = var95;
                        this.field_44S = false;
                     }

                     var10001 = -6873984675084183957L;
                     net.minecraft.client.Minecraft var55 = field_43;
                     if (!var55.field_42P.method_436$aae029aa0a()) {
                        byte var129 = (byte)var15;
                        var10004 = -6872906498043653318L;
                        byte var56 = var129;
                        int var57 = var14;
                        int var58 = var13;
                        AutoClicker_47Cn var59 = this;
                        int var96 = var59.method_45$bde84e76b3(var58, var57, var56);
                        var10004 = -6874188788562118786L;
                        long var60 = var22;
                        int var62 = var96;
                        net.C_475c var63 = var1;
                        AutoClicker_47Cn var64 = this;
                        var64.method_49$a0b331bbc3(var63, var62, var60);
                     }

                     var116 = -6871914369285595490L;
                     client.setting.BooleanSetting var65 = this.settingLongClick;
                     boolean var112 = var65.method_49$aae029aa0a();
                     var116 = -6872681977562619985L;
                     boolean var66 = var112;
                     net.C_475c var67 = var1;
                     var67.method_44$f633c984d8(var66);
                     var10001 = -6871914369285595490L;
                     client.setting.BooleanSetting var68 = this.settingLongClick;
                     if (!var68.method_49$aae029aa0a()) {
                        var116 = -6873514821864555769L;
                        boolean var69 = false;
                        net.C_475c var70 = var1;
                        var70.method_43$f633c984d8(var69);
                     }

                     var116 = -6874934296606506212L;
                     long var71 = var7;
                     AutoClicker_47Cn var73 = this;
                     if (var73.method_44X$0dd78e0064(var71)) {
                        var116 = -6871149729282779186L;
                        boolean var74 = true;
                        net.C_475c var75 = var1;
                        var75.method_49$f633c984d8(var74);
                        var116 = -6876418873347359031L;
                        boolean var76 = this.field_43v;
                        net.C_475c var77 = var1;
                        var77.method_46$f633c984d8(var76);
                     }
                  } else {
                     this.field_44S = true;
                     var116 = -6873514821864555769L;
                     boolean var78 = true;
                     net.C_475c var79 = var1;
                     var79.method_43$f633c984d8(var78);
                  }
                  break label109;
               }
            }

            var116 = -6875058753710919987L;
            long var80 = var20;
            AutoClicker_47Cn var82 = this;
            var82.method_43$e45a9973e5(var80);
            this.field_44S = true;
            long var27 = System.currentTimeMillis();
            long var10006 = -6868799474896138883L;
            long var83 = var11;
            byte var85 = 45;
            byte var86 = 0;
            net.C_47MO var87 = net.C_476q.field_48;
            this.field_48r = var27 - var87.method_44$75dd719903(var86, var85, var83);
            this.field_47 = var27;
            var10001 = -6868575948229697470L;
            net.minecraft.client.Minecraft var88 = field_43;
            if (var88.field_44m != null) {
               var10001 = -6874787003449614502L;
               net.minecraft.client.Minecraft var89 = field_43;
               if (var89.field_42t != null) {
                  var10001 = -6874496311119518025L;
                  client.setting.RangeSetting var90 = this.settingDelayClicksAfterClosingGuiScreen;
                  var90.method_43$fedcb3e4d3();
               }
            }
         }

         this.field_43n++;
         this.field_438++;
         short var114 = (short)var4;
         short var130 = (short)var6;
         long var133 = -6874350578409036921L;
         short var91 = var130;
         int var92 = var5;
         short var93 = var114;
         AutoClicker_47Cn var94 = this;
         var94.method_47$3345a93977(var93, var92, var91);
      }
   }








   private C_474k method_41$72cd3d0feb(short var1, int var2, short var3, int var4) {
      int var16;
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 131625152993195L;
      long var10002 = 1331556951245719382L;
      long var12 = var7;
      ModeSetting var14 = this.settingSmartClickMode;
      String var10 = var14.method_46$5f9dc63072(var12);
      long var10000 = 1330289368882610171L;
      byte var15 = (byte) ((AimBot_47O_.method_45g$aae029aa0a()) ? 1 : 0);
      byte var11 = -1;
      byte var9 = var15;
      var16 = var10.hashCode();
      label77:
      if (var9 == 0) {
         label79: {
            label74: {
               label80: {
                  switch (var16) {
                     case -547811547:
                        var16 = (int) ((var10.equals("Combined")) ? 1 : 0);
                        if (var9 != 0) {
                           break label77;
                        }

                        if (var16 == 0) {
                           break label79;
                        }

                        var11 = 0;
                        var16 = var9;
                        if (var4 >= 0) {
                           break;
                        }

                        if (var9 == 0) {
                           break label79;
                        }
                     case -1085510111:
                        var16 = (int) ((var10.equals("Default")) ? 1 : 0);
                        break;
                     case 1367467843:
                        break label80;
                     default:
                        break label79;
                  }

                  if (var9 != 0) {
                     break label77;
                  }

                  if (var16 == 0) {
                     break label79;
                  }

                  var11 = 1;
                  var16 = var9;
                  if (var4 > 0) {
                     break label74;
                  }

                  if (var9 == 0) {
                     break label79;
                  }
               }

               var16 = (int) ((var10.equals("Separate")) ? 1 : 0);
            }

            if (var9 != 0) {
               break label77;
            }

            if (var16 != 0) {
               var11 = 2;
            }
         }

         var16 = var11;
      }

      switch (var16) {
         case 0:
            return this.field_48X;
         case 1:
            return var2 < 22 ? this.field_48X : this.field_48D[var2];
         case 2:
            return this.field_48D[var2];
         default:
            return this.field_48X;
      }
   }




   private int method_40$7ee0e11626(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 106431969036009L;
      long var6 = var2 ^ 17300020360160L;
      int var8 = (int)((var2 ^ 99510014813932L) >>> 48);
      long var9 = (var2 ^ 99510014813932L) << 16 >>> 16;
      boolean var11 = recovery$indy$29(621307512794834194L, var2);
      int var10000 = (int) ((recovery$indy$30(this, (short)var8, var9, 618556358655678823L, var2)) ? 1 : 0);
      if (!var11) {
         if (var10000 != 0) {
            BooleanSetting var13 = ClientGlobals.field_48.field_412.field_43B;
            if (!var11) {
               if (ClientGlobals.field_48.field_412.field_43B == null) {
                  return 0;
               }

               var13 = ClientGlobals.field_48.field_412.field_43B;
            }

            byte var14 = (byte) ((recovery$indy$31(var13, 617025240550864556L, var2)) ? 1 : 0);
            if (var11) {
               return var14;
            }

            if (var14 != 0) {
               var14 = (byte) ((recovery$indy$32(ClientGlobals.field_48.field_412, var4, 624057254727958938L, var2)) ? 1 : 0);
               if (var11) {
                  return var14;
               }

               if (var14 != 0) {
                  recovery$indy$34(var6, recovery$indy$33(11404, 4657411209313135079L ^ var2), 617363594291249963L, var2);
               }
            }

            return 0;
         }

         var10000 = var1;
      }

      return var10000;
   }



   private boolean method_494$aae029aa0a() {
      long var1 = a ^ 117170584916244L;
      long var3 = var1 ^ 23215997039772L;
      long var10002 = 8164394271349761121L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }



   private C_474k method_44$67a256e525(int var1, long var2) {
      int var14;
      var2 = a ^ var2;
      long var4 = var2 ^ 48588806769871L;
      long var10002 = -8566136244015621070L;
      long var9 = var4;
      ModeSetting var11 = this.settingSmartDoubleClickModeS;
      String var7 = var11.method_46$5f9dc63072(var9);
      long var10000 = -8566283209532920074L;
      byte var13 = (byte) ((AimBot_47O_.method_45i$aae029aa0a()) ? 1 : 0);
      byte var8 = -1;
      byte var6 = var13;
      var14 = var7.hashCode();
      label77:
      if (var6 != 0) {
         label79: {
            label74: {
               label80: {
                  switch (var14) {
                     case -547811547:
                        var14 = (int) ((var7.equals("Combined")) ? 1 : 0);
                        if (var6 == 0) {
                           break label77;
                        }

                        if (var14 == 0) {
                           break label79;
                        }

                        var8 = 0;
                        var14 = var6;
                        if (var2 <= 0L) {
                           break;
                        }

                        if (var6 != 0) {
                           break label79;
                        }
                     case -1085510111:
                        var14 = (int) ((var7.equals("Default")) ? 1 : 0);
                        break;
                     case 1367467843:
                        break label80;
                     default:
                        break label79;
                  }

                  if (var6 == 0) {
                     break label77;
                  }

                  if (var14 == 0) {
                     break label79;
                  }

                  var8 = 1;
                  var14 = var6;
                  if (var2 <= 0L) {
                     break label74;
                  }

                  if (var6 != 0) {
                     break label79;
                  }
               }

               var14 = (int) ((var7.equals("Separate")) ? 1 : 0);
            }

            if (var6 == 0) {
               break label77;
            }

            if (var14 != 0) {
               var8 = 2;
            }
         }

         var14 = var8;
      }

      switch (var14) {
         case 0:
            return this.field_44D;
         case 1:
            return var1 < 22 ? this.field_44D : this.field_48D[var1];
         case 2:
            return this.field_48D[var1];
         default:
            return this.field_44D;
      }
   }



   private void method_48$da8c82d5d4() {
      long var1 = a ^ 70488244645640L;
      long var10001 = var1 ^ 67271935067113L;
      int var3 = (int)((var1 ^ 67271935067113L) >>> 32);
      int var4 = (int)((var1 ^ 67271935067113L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 69914830195328L;
      long var10003 = -8119449314258412931L;
      long var8 = var6;
      ModeSetting var10 = this.settingClickPattern;
      String var16 = var10.method_46$5f9dc63072(var8);
      short var17 = (short)var4;
      char var10004 = (char)var5;
      long var10006 = -8118555361395699247L;
      ArrayList var11 = this.field_43W;
      char var12 = var10004;
      short var13 = var17;
      int var14 = var3;
      String var15 = var16;
      this.field_48H = C_47xl.method_49$93400a88bc(var15, var14, var13, var12, var11);
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 1284669670481L;
      long var3 = var1 ^ 139254081626585L;
      long var10000 = 7208046770010801120L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 7208199146096390436L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (var5) {
         if (!var12) {
            return false;
         }

         var10002 = 7208199146096390436L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Recommended");
      }

      return !var5 ? var12 : var12;
   }



   public void method_48$c945181dab(long var1, C_47VU var3) {
      AutoClicker_47Cn var24;
      long var4 = var1 ^ 114453840274235L;
      long var10000 = -1808691628303774869L;
      boolean var6 = AimBot_47O_.method_45g$aae029aa0a();
      var24 = this;
      label32:
      if (!var6) {
         long var10002 = -1807425248531385402L;
         long var14 = var4;
         ModeSetting var16 = this.settingMode;
         label30:
         if (var16.method_46$5f9dc63072(var14).equals(recovery$indy$35(6591, 6858474953757553221L ^ var1))) {
            var24 = this;
            if (var6) {
               break label32;
            }

            long var10001 = -1807788122005956395L;
            BooleanSetting var17 = this.settingPlayRecordedMouseMovements;
            int var25 = (int) ((var17.method_49$aae029aa0a()) ? 1 : 0);
            if (var1 >= 0L) {
               if (var25 == 0) {
                  break label30;
               }

               var25 = (int)(System.currentTimeMillis() - this.field_441);
            }

            int var7 = var25;
            double var8 = (double)this.field_44R[0] / this.field_43y * var7;
            double var10 = (double)this.field_44R[1] / this.field_43y * var7;
            this.field_44A[0] = this.field_44A[0] + var8;
            this.field_44A[1] = this.field_44A[1] + var10;
            int var12 = (int)Math.round(this.field_44A[0] - this.field_44r[0]);
            int var13 = (int)Math.round(this.field_44A[1] - this.field_44r[1]);
            this.field_44r[0] = this.field_44r[0] + var12;
            this.field_44r[1] = this.field_44r[1] + var13;
            var10002 = -1809315522956172501L;
            C_47VU var18 = var3;
            int var26 = var18.method_47$8abf5c6871() + var12;
            var10002 = -1806898981746173401L;
            int var19 = var26;
            C_47VU var20 = var3;
            var20.method_42$d00df7729d(var19);
            var10002 = -1814697803817973866L;
            C_47VU var21 = var3;
            int var27 = var21.method_49$8abf5c6871() + var13;
            var10002 = -1810744776945343733L;
            int var22 = var27;
            C_47VU var23 = var3;
            var23.method_49$d00df7729d(var22);
         }

         var24 = this;
      }

      var24.field_441 = System.currentTimeMillis();
   }




   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_44Z = null;
   }



   private void method_49$a0b331bbc3(C_475c var1, int var2, long var3) {
      long var5;
      boolean var7;
      label34: {
         var3 = a ^ var3;
         var5 = var3 ^ 5734917236420L;
         var7 = recovery$indy$36(-2827109652551434452L, var3);
         C_47Ij var10000 = recovery$indy$37(field_43, -2827580178418932051L, var3);
         if (var7) {
            if (var10000 == null) {
               break label34;
            }

            var10000 = recovery$indy$38(field_43, -2827580178418932051L, var3);
         }

         if (var10000.field_49 == C_47Az.ENTITY) {
            this.field_43n = 0;
         }
      }

      label28: {
         int var9 = (int) ((recovery$indy$39(this, var5, -2814713810746146410L, var3)) ? 1 : 0);
         if (var7) {
            if (var9 == 0) {
               break label28;
            }

            var9 = var2;
         }

         if (var9 > 0) {
            this.field_480 = true;
            recovery$indy$40(var1, true, -2810871442108797015L, var3);
         }
      }

      recovery$indy$41(field_43, -2813312223187504737L, var3).field_44l.method_43$d00df7729d(0);
      recovery$indy$42(var1, var2, -2810397344654295377L, var3);
   }



    private C_42a method_49$f9db2aeeaf(long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x6B843DBF1BA1L;
        long l4 = l2 ^ 0x10FA6BE93C43L;
        long l5 = l2 ^ 0x2D9532D36B69L;
        int n = AutoClicker_47Cn.recovery$indy$43(this.field_48H, l3, 2813257128460886914L, l);
        int n2 = AutoClicker_47Cn.recovery$indy$45(this.field_48H, l3, 2813257128460886914L, l);
        boolean bl = AutoClicker_47Cn.recovery$indy$44(2825532739522855134L, l);
        int n3 = ((int) (AutoClicker_47Cn.recovery$indy$46((Object)this, l4, 2824541869757932791L, l) ? 1 : 0));
        if (bl) {
            if (n3 != 0) {
                n = (int)((double)n / AutoClicker_47Cn.recovery$indy$47(this.settingRecordedAirMultiplier, l5, 2813133111415094446L, l));
                n2 = (int)((double)n2 / AutoClicker_47Cn.recovery$indy$48(this.settingRecordedAirMultiplier, l5, 2813133111415094446L, l));
            }
            n = (int)Math.min((double)n * (1.0 / AutoClicker_47Cn.recovery$indy$49(this.settingMultiplier, l5, 2813133111415094446L, l)), 1000.0);
            n3 = (int)Math.min((double)n2 * (1.0 / AutoClicker_47Cn.recovery$indy$50(this.settingMultiplier, l5, 2813133111415094446L, l)), 1000.0);
        }
        n2 = n3;
        return new C_42a((Object)(n + n2), (Object)n);
    }



   private int method_49$1978aaf78d(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 69200651039777L;
      boolean var6 = recovery$indy$51(-1013204301221341672L, var1);
      AutoClicker_47Cn var10000 = this;
      if (var6) {
         byte var8 = (byte) ((recovery$indy$52(this.settingSmartMode, var4, -1013051838763506468L, var1).equals(recovery$indy$53(1422, 2469884123938945522L ^ var1))) ? 1 : 0);
         if (var1 < 0L) {
            return var8;
         }

         if (var8 != 0) {
            return recovery$indy$54(this.settingSmartDCPS, -1012375297033109346L, var1);
         }

         var10000 = this;
      }

      return recovery$indy$55(var10000.field_48y[var3], -1012375297033109346L, var1);
   }



   private void method_49$e1d6eacf90(long var1, char var3) {
      augustus.recovered.modules.legit.AutoClicker_47Cn var68;
      net.C_473X var69;
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 58148713544667L;
      long var8 = var4 ^ 123625359072932L;
      long var10001 = var4 ^ 133335321775513L;
      int var10 = (int)((var4 ^ 133335321775513L) >>> 48);
      int var11 = (int)((var4 ^ 133335321775513L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var10000 = 1978538814446517405L;
      boolean var13 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 1978668101374578265L;
      long var16 = var8;
      ModeSetting var18 = this.settingSmartMode;
      byte var61 = (byte) ((var18.method_46$5f9dc63072(var16).equals(recovery$indy$56(1422, 2469806691225703287L ^ var4))) ? 1 : 0);
      if (var13) {
         if (var61 != 0) {
            label61: {
               label88: {
                  C_473X var66 = this.field_442;
                  var10002 = 1978800526331210267L;
                  RangeSetting var19 = this.settingCPSRecalculateTickDelay;
                  int var86 = var19.method_44$8abf5c6871();
                  long var93 = 1979983673404601184L;
                  int var20 = var86;
                  long var21 = var6;
                  C_473X var23 = var66;
                  boolean var67 = var23.method_48$05d3808578(var21, var20);
                  if (var13) {
                     if (var67) {
                        var10001 = 1964522863497333011L;
                        C_473X var24 = this.field_442;
                        var24.method_47$da8c82d5d4();
                        short var76 = (short)var10;
                        char var87 = (char)var11;
                        long var96 = 1963616751315363289L;
                        int var25 = var12;
                        char var26 = var87;
                        short var27 = var76;
                        RangeSetting var28 = this.settingCPSRecalculateTickDelay;
                        var28.method_40$6160e88c05(var27, var26, var25);
                        short var77 = (short)var10;
                        char var88 = (char)var11;
                        var96 = 1963616751315363289L;
                        int var29 = var12;
                        char var30 = var88;
                        short var31 = var77;
                        RangeSetting var32 = this.settingSmartCPS;
                        var32.method_40$6160e88c05(var31, var30, var29);
                     }

                     var68 = this;
                     if (var1 <= 0L) {
                        break label61;
                     }

                     var69 = this.field_44j;
                     if (!var13) {
                        break label88;
                     }

                     var10002 = 1978800526331210267L;
                     RangeSetting var33 = this.settingDCPSRecalculateTickDelay;
                     int var90 = var33.method_44$8abf5c6871();
                     var93 = 1979983673404601184L;
                     int var34 = var90;
                     long var35 = var6;
                     C_473X var37 = var69;
                     var67 = var37.method_48$05d3808578(var35, var34);
                  }

                  if (!var67) {
                     return;
                  }

                  var69 = this.field_44j;
               }

               var10001 = 1964522863497333011L;
               C_473X var38 = var69;
               var38.method_47$da8c82d5d4();
               short var79 = (short)var10;
               char var91 = (char)var11;
               long var98 = 1963616751315363289L;
               int var39 = var12;
               char var40 = var91;
               short var41 = var79;
               RangeSetting var42 = this.settingDCPSRecalculateTickDelay;
               var42.method_40$6160e88c05(var41, var40, var39);
               var68 = this;
            }

            short var80 = (short)var10;
            char var92 = (char)var11;
            long var99 = 1963616751315363289L;
            int var43 = var12;
            char var44 = var92;
            short var45 = var80;
            RangeSetting var46 = var68.settingSmartDCPS;
            var46.method_40$6160e88c05(var45, var44, var43);
            return;
         }

         var61 = 0;
      }

      int var14 = var61;

      while (var14 < 22) {
         int var15 = var14 * 2;
         boolean var62 = var13;
         if (var1 > 0L) {
            if (var13) {
               label77: {
                  C_473X var63 = this.field_44B[var14];
                  if (var3 >= 0) {
                     RangeSetting var71 = this.field_48y[var15];
                     var10002 = 1978800526331210267L;
                     RangeSetting var47 = var71;
                     int var82 = var47.method_44$8abf5c6871();
                     long var10003 = 1979983673404601184L;
                     int var48 = var82;
                     long var49 = var6;
                     C_473X var51 = var63;
                     if (!var51.method_48$05d3808578(var49, var48)) {
                        break label77;
                     }

                     var63 = this.field_44B[var14];
                  }

                  var10001 = 1964522863497333011L;
                  C_473X var52 = var63;
                  var52.method_47$da8c82d5d4();
                  RangeSetting var64 = this.field_48y[var15 + 1];
                  short var73 = (short)var10;
                  char var83 = (char)var11;
                  long var10004 = 1963616751315363289L;
                  int var53 = var12;
                  char var54 = var83;
                  short var55 = var73;
                  RangeSetting var56 = var64;
                  var56.method_40$6160e88c05(var55, var54, var53);
                  RangeSetting var65 = this.field_48y[var15];
                  short var74 = (short)var10;
                  char var84 = (char)var11;
                  var10004 = 1963616751315363289L;
                  int var57 = var12;
                  char var58 = var84;
                  short var59 = var74;
                  RangeSetting var60 = var65;
                  var60.method_40$6160e88c05(var59, var58, var57);
               }

               var14++;
            }

            var62 = var13;
         }

         if (!var62) {
            break;
         }
      }
   }






    private int method_49$95d88932bd(long a0) {
        long value6;
        long computed7;
        long computed9;
        long computed11;
        long computed13;
        long computed15;
        long computed16;
        int converted17;
        long computed19;
        long computed20;
        int converted21;
        long computed23;
        long computed24;
        int converted25;
        long computed27;
        long computed28;
        int converted29;
        long computed31;
        long computed32;
        int converted33;
        long computed35;
        long computed36;
        int converted37;
        long computed39;
        long computed41;
        long computed43;
        long computed45;
        long computed47;
        long computed49;
        long computed51;
        long computed53;
        long computed55;
        long computed57;
        long computed59;
        long computed60;
        int converted61;
        long computed63;
        long computed64;
        int converted65;
        long computed67;
        long computed68;
        int converted69;
        long computed71;
        long computed73;
        long computed75;
        long computed77;
        long computed79;
        long computed81;
        long computed82;
        long computed84;
        long computed85;
        int converted86;
        long computed88;
        long computed89;
        int converted90;
        long computed92;
        long computed93;
        int converted94;
        long computed96;
        long computed97;
        int converted98;
        long computed100;
        long computed102;
        java.lang.Object value104;
        java.lang.Object value107;
        java.lang.Object value108;
        boolean value110;
        int value111;
        int value112;
        int value113;
        int regionValue151;
        int regionValue307;
        int regionValue385;
        int regionValue463;
        int regionValue541;
        int regionValue697;
        int regionValue774;
        boolean value814;
        int edgeValue852;
        int edgeValue932;
        int value1203;
        int comparison1204;
        int regionValue1243;
        int regionValue1244;
        boolean value1520;
        int edgeValue1559;
        int edgeValue1560;
        int edgeValue1598;
        int regionValue1637;
        int regionValue1638;
        int edgeValue1677;
        int edgeValue1678;
        int edgeValue1715;
        int value1869;
        int comparison1870;
        int regionValue1909;
        int regionValue1910;
        boolean value2186;
        int edgeValue2225;
        int edgeValue2226;
        int edgeValue2264;
        int regionValue2303;
        int regionValue2304;
        int edgeValue2343;
        int edgeValue2344;
        int edgeValue2381;
        int value2535;
        int comparison2536;
        int regionValue2575;
        int regionValue2576;
        boolean value2852;
        int edgeValue2891;
        int edgeValue2892;
        int edgeValue2930;
        int regionValue2969;
        int regionValue2970;
        int edgeValue3009;
        int edgeValue3010;
        int edgeValue3047;
        int value3201;
        int comparison3202;
        int regionValue3241;
        int regionValue3242;
        boolean value3518;
        int edgeValue3557;
        int edgeValue3558;
        int edgeValue3596;
        int regionValue3635;
        int regionValue3636;
        int edgeValue3675;
        int edgeValue3676;
        int edgeValue3713;
        int value3867;
        int comparison3868;
        int regionValue3906;
        int regionValue3907;
        boolean value4182;
        int edgeValue4220;
        int edgeValue4221;
        int comparison4222;
        int regionValue4260;
        int edgeValue4299;
        int regionValue4338;
        int regionValue4339;
        int edgeValue4378;
        int edgeValue4379;
        int edgeValue4418;
        int regionValue4456;
        int regionValue4457;
        int edgeValue4495;
        int edgeValue4496;
        int regionValue4534;
        int regionValue4535;
        int edgeValue4573;
        int edgeValue4574;
        int edgeValue4611;
        int value4687;
        int edgeValue4763;
        int edgeValue4801;
        int regionValue4803;
        int edgeValue4804;
        int regionValue4842;
        int edgeValue4880;
        int value5035;
        java.lang.Object value5036;
        java.lang.Object value5038;
        java.lang.Object value5039;
        java.lang.Object value5041;
        int value5042;
        int comparison5043;
        int regionValue5057;
        int regionValue5117;
        int value5266;
        int comparison5267;
        int regionValue5278;
        int regionValue5279;
        int regionValue5333;
        java.lang.Object value5385;
        java.lang.Object value5386;
        java.lang.Object value5388;
        int value5389;
        java.lang.Object value5393;
        boolean value5394;
        int edgeValue5408;
        int edgeValue5422;
        int regionValue5435;
        int edgeValue5447;
        int regionValue5461;
        int edgeValue5475;
        java.lang.Object value5528;
        java.lang.Object value5530;
        java.lang.Object value5531;
        short converted5532;
        char converted5533;
        int value5535;
        int value5536;
        java.lang.Object value5538;
        double value5539;
        java.lang.Object value5540;
        short converted5541;
        char converted5542;
        int value5544;
        int value5545;
        java.lang.Object value5547;
        double value5548;
        java.lang.Object value5562;
        java.lang.Object value5563;
        java.lang.Object value5566;
        double value5567;
        java.lang.Object value5568;
        java.lang.Object value5570;
        int value5571;
        double converted5572;
        int value5573;
        int value5586;
        int edgeValue5598;
        java.lang.Object value5599;
        java.lang.Object value5600;
        java.lang.Object value5603;
        boolean value5604;
        int edgeValue5615;
        int edgeValue5616;
        int regionValue5627;
        int edgeValue5638;
        int regionValue5649;
        int regionValue5650;
        int edgeValue5661;
        int edgeValue5662;
        int regionValue5673;
        int edgeValue5684;
        int edgeValue5735;
        int value5736;
        int edgeValue5747;
        int regionValue5757;
        int edgeValue5768;
        int regionValue5780;
        int edgeValue5792;
        int regionValue5803;
        int edgeValue5813;
        int regionValue5824;
        int edgeValue5835;
        int regionValue5846;
        int edgeValue5857;
        int edgeValue5867;
        java.lang.Object value5869;
        java.lang.Object value5870;
        int regionValue5875;
        int edgeValue5880;
        int edgeValue5890;
        java.lang.Object value5891;
        java.lang.Object value5892;
        java.lang.Object value5894;
        int value5895;
        java.lang.Object value5899;
        boolean value5900;
        int comparison5901;
        int regionValue5906;
        int regionValue5907;
        int edgeValue5912;
        int edgeValue5913;
        int edgeValue5931;
        int regionValue5954;
        java.lang.Object value6038;
        java.lang.Object value6040;
        java.lang.Object value6041;
        short converted6042;
        char converted6043;
        int value6045;
        int value6046;
        java.lang.Object value6048;
        double value6049;
        java.lang.Object value6050;
        short converted6051;
        char converted6052;
        int value6054;
        int value6055;
        java.lang.Object value6057;
        double value6058;
        java.lang.Object value6064;
        java.lang.Object value6065;
        java.lang.Object value6067;
        int value6068;
        java.lang.Object value6072;
        int value6073;
        int value6079;
        int edgeValue6084;
        int comparison6086;
        int regionValue6091;
        int regionValue6092;
        int edgeValue6097;
        int edgeValue6098;
        int regionValue6103;
        int regionValue6104;
        int edgeValue6109;
        int edgeValue6110;
        int regionValue6114;
        int edgeValue6118;
        int regionValue6123;
        int edgeValue6128;
        int edgeValue6133;
        int edgeValue6138;
        int edgeValue6139;
        int regionValue6143;
        int regionValue6144;
        int edgeValue6148;
        int edgeValue6149;
        int regionValue6154;
        int regionValue6155;
        int edgeValue6160;
        int edgeValue6161;
        int edgeValue6165;
        int regionValue6170;
        int edgeValue6175;
        int regionValue6180;
        int edgeValue6185;
        java.lang.Object value6186;
        java.lang.Object value6188;
        boolean value6189;
        int edgeValue6193;
        int edgeValue6194;
        int regionValue6199;
        int edgeValue6205;
        int edgeValue6206;
        int regionValue6211;
        int edgeValue6217;
        int edgeValue6222;
        int regionValue6227;
        int edgeValue6232;
        int regionValue6237;
        int edgeValue6242;
        java.lang.Object value6243;
        java.lang.Object value6245;
        java.lang.Object value6246;
        int edgeValue6250;
        int regionValue6255;
        int edgeValue6260;
        int regionValue6265;
        int edgeValue6270;
        java.lang.Object value6271;
        java.lang.Object value6272;
        java.lang.Object value6275;
        boolean value6276;
        int regionValue6280;
        int regionValue6281;
        int edgeValue6285;
        int edgeValue6286;
        int regionValue6290;
        int edgeValue6295;
        int edgeValue6296;
        int regionValue6300;
        int edgeValue6305;
        int regionValue6310;
        int edgeValue6314;
        int regionValue6318;
        int edgeValue6322;
        int regionValue6326;
        int edgeValue6330;
        java.lang.Object value6331;
        java.lang.Object value6333;
        java.lang.Object value6334;
        float value6335;
        int comparison6336;
        int comparison6337;
        int regionValue6341;
        int regionValue6342;
        int edgeValue6347;
        int regionValue6353;
        int edgeValue6359;
        int regionValue6365;
        int edgeValue6371;
        int regionValue6377;
        int regionValue6378;
        int edgeValue6382;
        int regionValue6387;
        int edgeValue6392;
        int regionValue6397;
        int edgeValue6402;
        int regionValue6407;
        int edgeValue6411;
        int regionValue6415;
        int edgeValue6419;
        java.lang.Object value6420;
        java.lang.Object value6422;
        java.lang.Object value6423;
        boolean value6424;
        int edgeValue6428;
        int edgeValue6429;
        int edgeValue6433;
        int edgeValue6434;
        int comparison6436;
        int regionValue6440;
        int regionValue6441;
        int edgeValue6446;
        int edgeValue6447;
        int regionValue6452;
        int regionValue6453;
        int edgeValue6458;
        int edgeValue6459;
        int regionValue6464;
        int regionValue6465;
        int edgeValue6469;
        int edgeValue6470;
        int regionValue6474;
        int regionValue6475;
        int edgeValue6479;
        int edgeValue6480;
        int regionValue6484;
        int regionValue6485;
        int edgeValue6489;
        int edgeValue6490;
        int edgeValue6494;
        int regionValue6498;
        int edgeValue6502;
        java.lang.Object value6503;
        java.lang.Object value6505;
        java.lang.Object value6506;
        boolean value6507;
        int edgeValue6511;
        int edgeValue6512;
        int edgeValue6516;
        int edgeValue6517;
        int comparison6519;
        int regionValue6523;
        int regionValue6524;
        int edgeValue6529;
        int edgeValue6530;
        int regionValue6535;
        int regionValue6536;
        int edgeValue6541;
        int edgeValue6542;
        int regionValue6547;
        int regionValue6548;
        int edgeValue6552;
        int edgeValue6553;
        int regionValue6557;
        int regionValue6558;
        int edgeValue6562;
        int edgeValue6563;
        int regionValue6567;
        int regionValue6568;
        int edgeValue6572;
        int edgeValue6573;
        int edgeValue6577;
        int regionValue6581;
        int edgeValue6585;
        java.lang.Object value6586;
        java.lang.Object value6588;
        java.lang.Object value6589;
        boolean value6590;
        int edgeValue6594;
        int edgeValue6595;
        int edgeValue6599;
        int edgeValue6600;
        int regionValue6605;
        int regionValue6606;
        int edgeValue6610;
        int edgeValue6611;
        int regionValue6615;
        int regionValue6616;
        int edgeValue6620;
        int edgeValue6621;
        int edgeValue6625;
        int regionValue6629;
        int edgeValue6633;
        java.lang.Object value6634;
        java.lang.Object value6636;
        java.lang.Object value6637;
        int comparison6638;
        int regionValue6642;
        java.lang.Object regionValue6643;
        int edgeValue6648;
        int regionValue6654;
        int edgeValue6660;
        int regionValue6666;
        int edgeValue6672;
        int regionValue6678;
        java.lang.Object regionValue6679;
        int edgeValue6683;
        int regionValue6688;
        int edgeValue6693;
        int regionValue6698;
        int edgeValue6703;
        java.lang.Object value6705;
        boolean value6706;
        int edgeValue6710;
        int edgeValue6711;
        int edgeValue6715;
        int regionValue6719;
        int edgeValue6723;
        java.lang.Object value6724;
        java.lang.Object value6726;
        java.lang.Object value6727;
        java.lang.Object value6728;
        int edgeValue6732;
        int edgeValue6737;
        java.lang.Object edgeValue6738;
        int regionValue6743;
        java.lang.Object regionValue6744;
        int edgeValue6748;
        java.lang.Object edgeValue6749;
        int regionValue6753;
        java.lang.Object regionValue6754;
        int edgeValue6758;
        java.lang.Object edgeValue6759;
        int edgeValue6763;
        int regionValue6767;
        int edgeValue6771;
        java.lang.Object value6772;
        java.lang.Object value6774;
        java.lang.Object value6775;
        java.lang.Object value6776;
        int edgeValue6780;
        boolean value6782;
        int edgeValue6786;
        int edgeValue6787;
        int regionValue6791;
        int edgeValue6796;
        int edgeValue6797;
        int edgeValue6801;
        int regionValue6805;
        int edgeValue6809;
        int edgeValue6813;
        int edgeValue6817;
        int edgeValue6818;
        int regionValue6822;
        int regionValue6823;
        int edgeValue6827;
        int edgeValue6828;
        int edgeValue6832;
        int edgeValue6833;
        int value6834;
        boolean value6835;
        int edgeValue6839;
        int edgeValue6840;
        int regionValue6844;
        int regionValue6845;
        int edgeValue6850;
        int edgeValue6851;
        int edgeValue6852;
        int edgeValue6856;
        int regionValue6860;
        int regionValue6861;
        int edgeValue6865;
        int edgeValue6866;
        int regionValue6870;
        int regionValue6871;
        int edgeValue6875;
        int edgeValue6876;
        int edgeValue6880;
        int edgeValue6881;
        int regionValue6885;
        int regionValue6886;
        int edgeValue6890;
        int edgeValue6891;
        int regionValue6895;
        int regionValue6896;
        int edgeValue6900;
        int edgeValue6901;
        int edgeValue6905;
        int value6918;
        java.lang.Object value6923;
        java.lang.Object value6924;
        boolean value6925;
        int edgeValue6929;
        int edgeValue6930;
        int regionValue6934;
        int edgeValue6938;
        java.lang.Object value6939;
        int value6940;
        int regionValue6944;
        int edgeValue6948;
        int regionValue6952;
        int edgeValue6956;
        java.lang.Object value6957;
        java.lang.Object value6958;
        int regionValue6962;
        int regionValue6963;
        int edgeValue6967;
        int comparison6969;
        int edgeValue6973;
        int edgeValue6974;
        int regionValue6975;
        int edgeValue6976;
        int edgeValue6980;
        int regionValue6984;
        int edgeValue6988;
        int comparison6989;
        int edgeValue6993;
        int edgeValue6994;
        int edgeValue6995;
        java.lang.Object value6996;
        java.lang.Object value6997;
        java.lang.Object value6999;
        int value7000;
        long converted7001;
        java.lang.Object value7005;
        boolean value7006;
        int regionValue7021;
        int edgeValue7036;
        int edgeValue7072;
        java.lang.Object value7169;
        short converted7170;
        char converted7171;
        int value7173;
        int value7174;
        java.lang.Object value7176;
        double value7177;
        java.lang.Object value7178;
        java.lang.Object value7180;
        double value7181;
        java.lang.Object value7182;
        java.lang.Object value7184;
        java.lang.Object value7199;
        java.lang.Object value7201;
        int value7202;
        int value7218;
        java.lang.Object value7219;
        java.lang.Object value7221;
        boolean value7222;
        int regionValue7237;
        int regionValue7238;
        int edgeValue7253;
        int edgeValue7254;
        int regionValue7269;
        int edgeValue7285;
        int edgeValue7286;
        int regionValue7301;
        int edgeValue7316;
        int regionValue7331;
        int edgeValue7346;
        int regionValue7361;
        int edgeValue7376;
        java.lang.Object value7377;
        java.lang.Object value7380;
        double value7381;
        int converted7382;
        java.lang.Object value7384;
        long value7385;
        java.lang.Object value7389;
        boolean value7390;
        int edgeValue7405;
        int edgeValue7406;
        int regionValue7421;
        int edgeValue7438;
        int edgeValue7440;
        int edgeValue7455;
        java.lang.Object value7516;
        java.lang.Object value7518;
        int value7519;
        double converted7520;
        java.lang.Object value7521;
        java.lang.Object value7524;
        double value7525;
        double computed7526;
        long value7527;
        int converted7528;
        java.lang.Object value7530;
        long value7531;
        java.lang.Object value7532;
        java.lang.Object value7533;
        char converted7534;
        int value7537;
        java.lang.Object value7539;
        double value7540;
        int converted7541;
        java.lang.Object value7542;
        java.lang.Object value7545;
        double value7546;
        int converted7547;
        java.lang.Object value7552;
        int value7553;
        long converted7554;
        long computed7555;
        java.lang.Object value7559;
        boolean value7560;
        int comparison7561;
        int regionValue7576;
        int regionValue7577;
        int edgeValue7594;
        int edgeValue7630;
        java.lang.Object value7763;
        int computed7764;
        int value7765;
        int computed7766;
        java.lang.Object value7771;
        int value7772;
        long converted7773;
        java.lang.Object value7774;
        java.lang.Object value7776;
        java.lang.Object value7792;
        java.lang.Object value7794;
        boolean value7795;
        int edgeValue7810;
        int edgeValue7811;
        int edgeValue7826;
        int edgeValue7827;
        int regionValue7837;
        int regionValue7838;
        int edgeValue7847;
        int edgeValue7848;
        int regionValue7863;
        int regionValue7864;
        int edgeValue7879;
        int edgeValue7880;
        int regionValue7889;
        int edgeValue7898;
        int regionValue7913;
        int edgeValue7928;
        java.lang.Object value7929;
        java.lang.Object value7932;
        double value7933;
        int converted7934;
        java.lang.Object value7936;
        long value7937;
        java.lang.Object value7941;
        boolean value7942;
        int edgeValue7951;
        int edgeValue7952;
        int regionValue7967;
        int edgeValue7984;
        int edgeValue7986;
        int edgeValue7995;
        java.lang.Object value8056;
        java.lang.Object value8058;
        int value8059;
        double converted8060;
        java.lang.Object value8061;
        java.lang.Object value8064;
        double value8065;
        double computed8066;
        long value8067;
        int converted8068;
        java.lang.Object value8070;
        long value8071;
        java.lang.Object value8072;
        java.lang.Object value8073;
        char converted8074;
        int value8077;
        java.lang.Object value8079;
        double value8080;
        int converted8081;
        java.lang.Object value8082;
        java.lang.Object value8085;
        double value8086;
        int converted8087;
        java.lang.Object value8092;
        int value8093;
        long converted8094;
        long computed8095;
        java.lang.Object value8099;
        boolean value8100;
        int comparison8101;
        int regionValue8110;
        int regionValue8111;
        int edgeValue8122;
        int edgeValue8148;
        java.lang.Object value8239;
        int computed8240;
        int value8241;
        int computed8242;
        java.lang.Object value8247;
        int value8248;
        long converted8249;
        java.lang.Object value8250;
        java.lang.Object value8252;
        java.lang.Object value8262;
        java.lang.Object value8264;
        boolean value8265;
        int edgeValue8274;
        int edgeValue8275;
        int edgeValue8284;
        int edgeValue8285;
        int comparison8287;
        int regionValue8296;
        int regionValue8297;
        int edgeValue8307;
        int edgeValue8308;
        int regionValue8318;
        int regionValue8319;
        int edgeValue8329;
        int edgeValue8330;
        int regionValue8340;
        int regionValue8341;
        int edgeValue8350;
        int edgeValue8351;
        int regionValue8360;
        int regionValue8361;
        int edgeValue8370;
        int edgeValue8371;
        int regionValue8380;
        int regionValue8381;
        int edgeValue8390;
        int edgeValue8391;
        int regionValue8400;
        int edgeValue8409;
        int regionValue8418;
        int edgeValue8427;
        java.lang.Object value8428;
        java.lang.Object value8430;
        java.lang.Object value8431;
        int regionValue8440;
        java.lang.Object regionValue8441;
        int edgeValue8450;
        int regionValue8460;
        int edgeValue8470;
        int regionValue8480;
        int edgeValue8490;
        int edgeValue8500;
        int regionValue8509;
        int edgeValue8518;
        int regionValue8527;
        int edgeValue8536;
        java.lang.Object value8537;
        java.lang.Object value8539;
        java.lang.Object value8540;
        int edgeValue8549;
        java.lang.Object value8551;
        java.lang.Object value8552;
        int edgeValue8561;
        java.lang.Object value8578;
        java.lang.Object value8579;
        java.lang.Object value8581;
        int value8582;
        long converted8583;
        java.lang.Object value8587;
        boolean value8588;
        int regionValue8597;
        int edgeValue8606;
        int edgeValue8624;
        java.lang.Object value8691;
        java.lang.Object value8693;
        double value8694;
        java.lang.Object value8695;
        java.lang.Object value8697;
        double value8698;
        java.lang.Object value8699;
        java.lang.Object value8701;
        java.lang.Object value8710;
        java.lang.Object value8712;
        int value8713;
        double converted8714;
        java.lang.Object value8715;
        java.lang.Object value8718;
        double value8719;
        double computed8720;
        long value8721;
        int converted8722;
        int value8732;
        int edgeValue8741;
        java.lang.Object value8742;
        java.lang.Object value8744;
        boolean value8745;
        int edgeValue8754;
        int edgeValue8755;
        int edgeValue8764;
        int edgeValue8765;
        int comparison8767;
        int regionValue8773;
        int regionValue8774;
        int edgeValue8781;
        int edgeValue8782;
        int regionValue8792;
        int regionValue8793;
        int edgeValue8803;
        int edgeValue8804;
        int regionValue8811;
        int regionValue8812;
        int edgeValue8818;
        int edgeValue8819;
        int regionValue8828;
        int regionValue8829;
        int edgeValue8838;
        int edgeValue8839;
        int regionValue8848;
        int regionValue8849;
        int edgeValue8858;
        int edgeValue8859;
        int regionValue8866;
        int edgeValue8873;
        int regionValue8882;
        int edgeValue8891;
        java.lang.Object value8892;
        java.lang.Object value8894;
        java.lang.Object value8895;
        int regionValue8904;
        java.lang.Object regionValue8905;
        int edgeValue8914;
        int regionValue8924;
        int edgeValue8934;
        int regionValue8944;
        int edgeValue8954;
        int edgeValue8962;
        int regionValue8971;
        int edgeValue8980;
        int regionValue8989;
        int edgeValue8998;
        java.lang.Object value8999;
        java.lang.Object value9001;
        java.lang.Object value9002;
        int edgeValue9011;
        java.lang.Object value9013;
        java.lang.Object value9014;
        int edgeValue9021;
        java.lang.Object value9038;
        java.lang.Object value9039;
        java.lang.Object value9041;
        int value9042;
        long converted9043;
        java.lang.Object value9047;
        boolean value9048;
        int regionValue9055;
        int edgeValue9062;
        int edgeValue9078;
        java.lang.Object value9137;
        java.lang.Object value9139;
        double value9140;
        java.lang.Object value9141;
        java.lang.Object value9143;
        double value9144;
        java.lang.Object value9145;
        java.lang.Object value9147;
        java.lang.Object value9155;
        java.lang.Object value9157;
        int value9158;
        double converted9159;
        java.lang.Object value9160;
        java.lang.Object value9163;
        double value9164;
        double computed9165;
        long value9166;
        int converted9167;
        int value9175;
        int edgeValue9182;
        java.lang.Object value9183;
        java.lang.Object value9184;
        java.lang.Object value9187;
        boolean value9188;
        int edgeValue9194;
        int edgeValue9195;
        int edgeValue9201;
        int edgeValue9202;
        int regionValue9204;
        int edgeValue9205;
        int regionValue9211;
        int regionValue9212;
        int edgeValue9218;
        int edgeValue9219;
        int regionValue9225;
        int edgeValue9231;
        int edgeValue9232;
        java.lang.Object value9233;
        int regionValue9239;
        java.lang.Object regionValue9240;
        int edgeValue9246;
        int regionValue9253;
        int edgeValue9260;
        int regionValue9267;
        int edgeValue9273;
        int regionValue9279;
        int edgeValue9285;
        int regionValue9291;
        int edgeValue9297;
        java.lang.Object value9298;
        int edgeValue9304;
        int value9306;
        int regionValue9312;
        int regionValue9313;
        int edgeValue9319;
        int edgeValue9326;
        int edgeValue9327;
        int value9328;
        java.lang.Object value9329;
        int length9331;
        int value9333;
        int regionValue9339;
        int regionValue9340;
        int regionValue9343;
        int edgeValue9349;
        int edgeValue9350;
        int regionValue9358;
        int edgeValue9363;
        int regionValue9369;
        int regionValue9370;
        int regionValue9373;
        int edgeValue9379;
        int edgeValue9380;
        int edgeValue9383;
        java.lang.Object arrayValue9384;
        java.lang.Object value9385;
        int comparison9386;
        int regionValue9392;
        int regionValue9393;
        int regionValue9396;
        int edgeValue9403;
        int edgeValue9404;
        int edgeValue9407;
        int regionValue9414;
        int regionValue9415;
        int regionValue9418;
        java.lang.Object regionValue9419;
        int edgeValue9426;
        int edgeValue9427;
        int edgeValue9430;
        java.lang.Object edgeValue9431;
        int regionValue9438;
        int regionValue9439;
        int regionValue9442;
        int edgeValue9448;
        int edgeValue9449;
        int edgeValue9452;
        int regionValue9458;
        int regionValue9459;
        int regionValue9462;
        java.lang.Object regionValue9463;
        int edgeValue9469;
        int edgeValue9470;
        int edgeValue9473;
        java.lang.Object edgeValue9474;
        int regionValue9480;
        int regionValue9481;
        int regionValue9484;
        java.lang.Object regionValue9485;
        int edgeValue9491;
        int edgeValue9492;
        int edgeValue9495;
        java.lang.Object edgeValue9496;
        java.lang.Object value9497;
        java.lang.Object value9498;
        int value9499;
        int comparison9500;
        int regionValue9506;
        int regionValue9507;
        int regionValue9510;
        java.lang.Object regionValue9511;
        int regionValue9512;
        int regionValue9513;
        int edgeValue9519;
        int edgeValue9520;
        int edgeValue9523;
        java.lang.Object edgeValue9524;
        int edgeValue9525;
        int regionValue9532;
        int regionValue9533;
        int regionValue9536;
        java.lang.Object regionValue9537;
        int regionValue9538;
        int edgeValue9545;
        int edgeValue9546;
        int edgeValue9549;
        java.lang.Object edgeValue9550;
        int edgeValue9551;
        int regionValue9558;
        int regionValue9559;
        int regionValue9562;
        java.lang.Object regionValue9563;
        int regionValue9564;
        int edgeValue9571;
        int edgeValue9572;
        int edgeValue9575;
        java.lang.Object edgeValue9576;
        int edgeValue9577;
        int regionValue9579;
        int edgeValue9580;
        int regionValue9586;
        int regionValue9587;
        int regionValue9590;
        java.lang.Object regionValue9591;
        int regionValue9592;
        int edgeValue9598;
        int edgeValue9599;
        int edgeValue9602;
        java.lang.Object edgeValue9603;
        int edgeValue9604;
        int regionValue9610;
        int regionValue9611;
        int regionValue9614;
        java.lang.Object regionValue9615;
        int regionValue9616;
        int edgeValue9622;
        int edgeValue9623;
        int edgeValue9626;
        java.lang.Object edgeValue9627;
        int edgeValue9628;
        int edgeValue9634;
        int edgeValue9635;
        int edgeValue9638;
        java.lang.Object edgeValue9639;
        int edgeValue9640;
        int edgeValue9641;
        int comparison9642;
        int regionValue9648;
        int regionValue9649;
        int regionValue9652;
        int regionValue9653;
        int regionValue9654;
        int edgeValue9660;
        int edgeValue9661;
        int edgeValue9664;
        int edgeValue9665;
        int edgeValue9666;
        int regionValue9672;
        int regionValue9673;
        int regionValue9676;
        java.lang.Object regionValue9677;
        int regionValue9678;
        int regionValue9679;
        int edgeValue9685;
        int edgeValue9686;
        int edgeValue9689;
        java.lang.Object edgeValue9690;
        int edgeValue9691;
        int edgeValue9692;
        int regionValue9698;
        int regionValue9699;
        int regionValue9702;
        int edgeValue9708;
        int edgeValue9709;
        int edgeValue9712;
        int regionValue9718;
        int regionValue9719;
        int regionValue9722;
        java.lang.Object regionValue9723;
        int edgeValue9729;
        int edgeValue9730;
        int edgeValue9733;
        java.lang.Object edgeValue9734;
        int regionValue9740;
        int regionValue9741;
        int regionValue9744;
        java.lang.Object regionValue9745;
        int edgeValue9751;
        int edgeValue9752;
        int edgeValue9755;
        java.lang.Object edgeValue9756;
        java.lang.Object value9757;
        java.lang.Object value9758;
        boolean value9759;
        int edgeValue9765;
        int edgeValue9766;
        int edgeValue9769;
        int edgeValue9770;
        int regionValue9772;
        int edgeValue9773;
        int regionValue9779;
        int regionValue9780;
        int regionValue9783;
        int regionValue9784;
        int edgeValue9790;
        int edgeValue9791;
        int edgeValue9794;
        int edgeValue9795;
        int edgeValue9801;
        int edgeValue9802;
        int edgeValue9805;
        int incremented9806;
        int edgeValue9812;
        int edgeValue9813;
        int edgeValue9816;
        int edgeValue9822;
        int edgeValue9823;
        int edgeValue9826;
        int edgeValue9833;
        int edgeValue9834;
        int edgeValue9837;
        int edgeValue9842;
        int edgeValue9843;
        java.lang.Object value9844;
        int value9846;
        java.lang.Object value9848;
        int value9849;
        java.lang.Object value9853;
        int value9854;
        java.lang.Object value9856;
        char converted9857;
        int value9860;
        java.lang.Object value9862;
        double value9863;
        float converted9864;
        java.lang.Object value9866;
        java.lang.Object value9869;
        double value9870;
        float converted9871;
        float computed9873;
        float computed9874;
        float computed9876;
        float computed9877;
        long value9879;
        int value9881;
        int regionValue9890;
        long value9900;
        int comparison9901;
        int regionValue9910;
        int edgeValue9919;
        int regionValue9928;
        int edgeValue9937;
        double converted9938;
        double converted9939;
        java.security.SecureRandom initialized9940;
        double value9941;
        double computed9942;
        double computed9943;
        float converted9944;
        float computed9945;
        int converted9946;
        int regionValue9955;
        int regionValue9956;
        int edgeValue9965;
        int edgeValue9966;
        java.lang.Object value9967;
        java.lang.Object value9968;
        java.lang.Object value9969;
        boolean value9970;
        int comparison9971;
        int edgeValue9980;
        int edgeValue9981;
        int regionValue9986;
        int regionValue9987;
        int edgeValue9992;
        int edgeValue9993;
        double converted9994;
        double value9995;
        int regionValue9999;
        int edgeValue10003;
        int regionValue10012;
        double regionValue10013;
        int edgeValue10022;
        double edgeValue10023;
        java.lang.Object value10024;
        java.lang.Object value10025;
        java.lang.Object value10026;
        java.lang.Object value10027;
        int regionValue10036;
        double regionValue10037;
        java.lang.Object regionValue10038;
        int edgeValue10047;
        double edgeValue10048;
        java.lang.Object edgeValue10049;
        int regionValue10058;
        double regionValue10059;
        java.lang.Object regionValue10060;
        int edgeValue10069;
        double edgeValue10070;
        java.lang.Object edgeValue10071;
        int regionValue10080;
        double regionValue10081;
        int edgeValue10090;
        double edgeValue10091;
        int regionValue10100;
        double regionValue10101;
        int edgeValue10110;
        double edgeValue10111;
        int regionValue10120;
        double regionValue10121;
        int edgeValue10130;
        double edgeValue10131;
        java.lang.Object value10132;
        java.lang.Object value10133;
        java.lang.Object value10134;
        java.lang.Object value10135;
        int edgeValue10144;
        double edgeValue10145;
        java.lang.Object edgeValue10146;
        java.lang.Object value10147;
        java.lang.Object value10148;
        int regionValue10157;
        double regionValue10158;
        int edgeValue10167;
        double edgeValue10168;
        int edgeValue10177;
        double edgeValue10178;
        java.lang.Object value10179;
        java.lang.Object value10181;
        java.lang.Object value10182;
        double value10183;
        double computed10184;
        double value10185;
        int edgeValue10194;
        double edgeValue10195;
        long value10196;
        long converted10197;
        long value10198;
        long computed10199;
        int incremented10200;
        int edgeValue10209;
        int regionValue10218;
        int edgeValue10227;
        java.lang.Object value10228;
        java.lang.Object value10229;
        java.lang.Object value10230;
        boolean value10231;
        int comparison10232;
        int edgeValue10241;
        int edgeValue10242;
        int edgeValue10247;
        int edgeValue10248;
        int regionValue10249;
        int edgeValue10250;
        int regionValue10255;
        int regionValue10256;
        int edgeValue10261;
        int edgeValue10262;
        int edgeValue10266;
        int regionValue10271;
        int edgeValue10276;
        int regionValue10281;
        int edgeValue10286;
        int comparison10287;
        int regionValue10291;
        int regionValue10292;
        int regionValue10293;
        int edgeValue10297;
        int edgeValue10298;
        int regionValue10303;
        int regionValue10304;
        int edgeValue10309;
        int edgeValue10310;
        int regionValue10315;
        int regionValue10316;
        int edgeValue10321;
        int edgeValue10322;
        int edgeValue10324;
        int regionValue10328;
        int regionValue10329;
        int edgeValue10333;
        int edgeValue10334;
        int regionValue10338;
        int regionValue10339;
        int edgeValue10343;
        int edgeValue10344;
        int edgeValue10348;
        int edgeValue10349;
        int edgeValue10350;
        int edgeValue10354;
        int value10361;
        int value10367;
        java.lang.Object value10369;
        int value10370;
        java.lang.Object value10372;
        int value10395;
        java.lang.Object value10396;
        java.lang.Object value10399;
        java.lang.Object value10400;
        boolean value10401;
        int edgeValue10425;
        int edgeValue10449;
        int regionValue10460;
        int regionValue10504;
        java.lang.Object value10554;
        int comparison10555;
        java.lang.Object regionValue10564;
        java.lang.Object value10614;
        java.lang.Object value10616;
        int value10617;
        java.lang.Object value10621;
        boolean value10622;
        java.lang.Object value10671;
        java.lang.Object value10673;
        double value10674;
        java.lang.Object value10675;
        java.lang.Object value10677;
        double value10678;
        java.lang.Object value10679;
        java.lang.Object value10689;
        java.lang.Object value10690;
        java.lang.Object value10708;
        java.lang.Object value10709;
        java.lang.Object value10711;
        int value10712;
        java.lang.Object value10713;
        java.lang.Object value10716;
        double value10717;
        java.lang.Object value10718;
        java.lang.Object value10721;
        double value10722;
        java.lang.Object value10723;
        java.lang.Object value10725;
        boolean value10726;
        int comparison10727;
        int regionValue10738;
        int edgeValue10750;
        int edgeValue10774;
        int regionValue10786;
        java.lang.Object value10882;
        java.lang.Object value10884;
        boolean value10885;
        int edgeValue10896;
        int edgeValue10907;
        int regionValue10919;
        int edgeValue10930;
        int regionValue10941;
        int edgeValue10952;
        int edgeValue10993;
        int regionValue11004;
        int edgeValue11015;
        int edgeValue11026;
        java.lang.Object value11027;
        java.lang.Object value11029;
        boolean value11030;
        double value11031;
        int value11033;
        int value11034;
        java.lang.Object value11039;
        java.lang.Object value11040;
        java.lang.Object value11043;
        java.lang.Object value11044;
        java.lang.Object value11045;
        int value11046;
        java.lang.Object value11049;
        java.lang.Object value11050;
        java.lang.Object value11051;
        boolean value11052;
        java.lang.Object value11057;
        int value11058;
        int comparison11060;
        int regionValue11062;
        java.lang.Object value11077;
        java.lang.Object value11078;
        java.lang.Object value11081;
        boolean value11082;
        int regionValue11084;
        int edgeValue11086;
        int edgeValue11098;
        int comparison11133;
        int regionValue11137;
        int regionValue11162;
        int regionValue11184;
        int edgeValue11188;
        int value11189;
        int edgeValue11191;
        int edgeValue11192;
        int edgeValue11193;
        int value11194;
        java.lang.Object value11195;
        java.lang.Object value11197;
        java.lang.Object value11198;
        int comparison11200;
        java.lang.Object value11642;
        java.lang.Object value11643;
        java.lang.Object value11771;
        boolean value11772;
        int regionValue11794;
        int edgeValue11816;
        int edgeValue11860;
        int edgeValue11987;
        int regionValue12009;
        int edgeValue12031;
        int edgeValue12053;
        int value12054;
        char converted12055;
        int value12056;
        java.lang.Object value12059;
        int regionValue12079;
        int edgeValue12099;
        int regionValue12119;
        int edgeValue12139;
        int regionValue12152;
        java.lang.Object value12244;
        int value12245;
        int value12266;
        java.lang.Object value12267;
        java.lang.Object value12268;
        java.lang.Object value12271;
        boolean value12272;
        int comparison12273;
        int regionValue12290;
        int regionValue12292;
        int regionValue12293;
        int edgeValue12313;
        int edgeValue12314;
        int regionValue12334;
        int edgeValue12355;
        int edgeValue12356;
        int regionValue12374;
        int regionValue12376;
        int regionValue12377;
        int edgeValue12396;
        int regionValue12416;
        int edgeValue12436;
        int regionValue12456;
        int edgeValue12476;
        int regionValue12494;
        int regionValue12496;
        int edgeValue12515;
        int regionValue12533;
        int edgeValue12551;
        int value12552;
        int regionValue12566;
        int edgeValue12599;
        int edgeValue12616;
        int edgeValue12618;
        int edgeValue12619;
        int edgeValue12636;
        int edgeValue12638;
        int edgeValue12639;
        int comparison12641;
        int regionValue12656;
        int regionValue12658;
        int edgeValue12674;
        int edgeValue12676;
        int regionValue12694;
        int regionValue12696;
        int regionValue12697;
        int edgeValue12715;
        int edgeValue12717;
        int edgeValue12718;
        int regionValue12734;
        int regionValue12736;
        int edgeValue12751;
        int edgeValue12753;
        int regionValue12770;
        int regionValue12772;
        int regionValue12773;
        int edgeValue12790;
        int edgeValue12792;
        int edgeValue12793;
        int regionValue12810;
        int regionValue12812;
        int regionValue12813;
        int edgeValue12830;
        int edgeValue12832;
        int edgeValue12833;
        int value12834;
        int regionValue12849;
        int edgeValue12865;
        int regionValue12883;
        int regionValue12885;
        int edgeValue12902;
        int edgeValue12904;
        int regionValue12921;
        int regionValue12923;
        int edgeValue12940;
        int edgeValue12942;
        int regionValue12955;
        int regionValue12958;
        int edgeValue12971;
        int edgeValue12974;
        int regionValue12991;
        int regionValue12993;
        int regionValue12995;
        int edgeValue13012;
        int edgeValue13014;
        int edgeValue13016;
        int regionValue13033;
        int regionValue13035;
        int regionValue13037;
        int edgeValue13054;
        int edgeValue13056;
        int edgeValue13058;
        int value13059;
        int comparison13060;
        int regionValue13073;
        int edgeValue13088;
        int regionValue13108;
        int regionValue13109;
        int edgeValue13128;
        int edgeValue13129;
        short converted13131;
        short converted13132;
        int value13134;
        int value13135;
        int value13136;
        java.lang.Object value13138;
        java.lang.Object value13139;
        int computed13140;
        java.lang.Object value13144;
        int value13145;
        java.lang.Object value13149;
        int value13150;
        java.lang.Object value13154;
        int value13155;
        int regionValue13187;
        int edgeValue13205;
        int computed13207;
        java.lang.Object value13211;
        java.lang.Object value13212;
        int computed13213;
        int computed13214;
        java.lang.Object value13218;
        int value13219;
        java.lang.Object value13223;
        int value13224;
        java.lang.Object value13228;
        int value13229;
        int computed13230;
        java.lang.Object value13262;
        java.lang.Object value13263;
        java.lang.Object value13265;
        int value13266;
        java.lang.Object value13270;
        boolean value13271;
        int edgeValue13286;
        int edgeValue13288;
        int edgeValue13303;
        int edgeValue13305;
        int comparison13307;
        int regionValue13322;
        int regionValue13324;
        int edgeValue13340;
        int edgeValue13342;
        int regionValue13358;
        int regionValue13360;
        int edgeValue13376;
        int edgeValue13378;
        int regionValue13394;
        int regionValue13396;
        int edgeValue13411;
        int edgeValue13413;
        int regionValue13428;
        int regionValue13430;
        int edgeValue13445;
        int edgeValue13447;
        int regionValue13462;
        int regionValue13464;
        int edgeValue13479;
        int edgeValue13481;
        int regionValue13496;
        int edgeValue13512;
        int regionValue13528;
        int edgeValue13544;
        java.lang.Object value13546;
        java.lang.Object value13548;
        java.lang.Object value13549;
        short converted13550;
        char converted13551;
        int value13553;
        int value13554;
        java.lang.Object value13556;
        double value13557;
        java.lang.Object value13558;
        short converted13559;
        char converted13560;
        int value13562;
        int value13563;
        java.lang.Object value13565;
        double value13566;
        int edgeValue13581;
        java.lang.Object value13583;
        java.lang.Object value13584;
        java.lang.Object value13586;
        int value13587;
        java.lang.Object value13591;
        boolean value13592;
        int edgeValue13607;
        int edgeValue13609;
        int edgeValue13624;
        int edgeValue13626;
        int regionValue13642;
        int regionValue13644;
        int edgeValue13659;
        int edgeValue13661;
        int regionValue13676;
        int regionValue13678;
        int edgeValue13693;
        int edgeValue13695;
        int regionValue13710;
        int edgeValue13726;
        int regionValue13742;
        int edgeValue13758;
        java.lang.Object value13760;
        java.lang.Object value13762;
        java.lang.Object value13763;
        short converted13764;
        char converted13765;
        int value13767;
        int value13768;
        java.lang.Object value13770;
        double value13771;
        java.lang.Object value13772;
        short converted13773;
        char converted13774;
        int value13776;
        int value13777;
        java.lang.Object value13779;
        double value13780;
        int edgeValue13795;
        int comparison13797;
        int regionValue13810;
        int regionValue13813;
        int edgeValue13827;
        int edgeValue13830;
        int regionValue13846;
        int edgeValue13865;
        int edgeValue13868;
        int edgeValue13882;
        short converted13955;
        short converted13956;
        int value13958;
        int value13960;
        java.lang.Object value13962;
        java.lang.Object value13963;
        java.lang.Object value13964;
        java.lang.Object value13966;
        int value13967;
        java.lang.Object value13971;
        int value13972;
        java.lang.Object value13976;
        int value13977;
        int edgeValue14009;
        int regionValue14024;
        int edgeValue14040;
        int value14043;
        java.lang.Object value14045;
        java.lang.Object value14046;
        int regionValue14061;
        int edgeValue14079;
        int regionValue14098;
        int edgeValue14117;
        int regionValue14136;
        int edgeValue14155;
        java.lang.Object value14159;
        java.lang.Object value14162;
        java.lang.Object value14163;
        boolean value14164;
        int comparison14165;
        int regionValue14180;
        int regionValue14183;
        int edgeValue14198;
        int edgeValue14201;
        int regionValue14216;
        int edgeValue14234;
        int edgeValue14237;
        int regionValue14252;
        int edgeValue14270;
        int regionValue14288;
        int edgeValue14305;
        int regionValue14322;
        int edgeValue14339;
        int regionValue14356;
        int edgeValue14373;
        java.lang.Object value14376;
        java.lang.Object value14378;
        int value14379;
        int edgeValue14394;
        int regionValue14412;
        int regionValue14415;
        int edgeValue14430;
        int edgeValue14433;
        int edgeValue14448;
        java.lang.Object value14452;
        java.lang.Object value14454;
        int value14455;
        int edgeValue14470;
        int value14475;
        java.lang.Object value14477;
        int value14478;
        java.lang.Object value14482;
        int value14483;
        int computed14484;
        int edgeValue14512;
        int edgeValue14527;
        int edgeValue14530;
        int edgeValue14543;
        int edgeValue14546;
        int regionValue14560;
        int regionValue14563;
        int edgeValue14576;
        int edgeValue14579;
        int regionValue14592;
        int regionValue14595;
        int edgeValue14608;
        int edgeValue14611;
        int regionValue14624;
        int edgeValue14639;
        int regionValue14654;
        int edgeValue14669;
        int value14672;
        int computed14673;
        int edgeValue14686;
        int regionValue14702;
        int regionValue14705;
        int edgeValue14718;
        int edgeValue14721;
        int edgeValue14734;
        int edgeValue14737;
        int regionValue14741;
        int edgeValue14745;
        int edgeValue14758;
        int regionValue14772;
        int edgeValue14786;
        int regionValue14800;
        int edgeValue14815;
        int regionValue14830;
        int edgeValue14845;
        int regionValue14860;
        int edgeValue14873;
        int regionValue14886;
        int edgeValue14900;
        int regionValue14914;
        int edgeValue14928;
        int edgeValue14942;
        java.lang.Object value14944;
        java.lang.Object value14945;
        int regionValue14958;
        int edgeValue14971;
        int edgeValue14984;
        java.lang.Object value14985;
        java.lang.Object value14986;
        java.lang.Object value14988;
        int value14989;
        java.lang.Object value14993;
        boolean value14994;
        int comparison14995;
        int regionValue15008;
        int regionValue15009;
        int edgeValue15023;
        int edgeValue15024;
        int regionValue15038;
        int edgeValue15053;
        int edgeValue15054;
        int regionValue15068;
        int edgeValue15083;
        int regionValue15098;
        int regionValue15099;
        int edgeValue15112;
        int regionValue15126;
        int edgeValue15140;
        int regionValue15154;
        int edgeValue15168;
        int regionValue15182;
        int edgeValue15195;
        int regionValue15208;
        int edgeValue15221;
        java.lang.Object value15222;
        java.lang.Object value15224;
        java.lang.Object value15225;
        short converted15226;
        char converted15227;
        int value15229;
        int value15230;
        java.lang.Object value15232;
        double value15233;
        java.lang.Object value15234;
        short converted15235;
        char converted15236;
        int value15238;
        int value15239;
        java.lang.Object value15241;
        double value15242;
        int edgeValue15255;
        java.lang.Object value15256;
        java.lang.Object value15257;
        java.lang.Object value15259;
        int value15260;
        java.lang.Object value15264;
        boolean value15265;
        int edgeValue15278;
        int edgeValue15279;
        int edgeValue15292;
        int edgeValue15293;
        int regionValue15307;
        int regionValue15308;
        int edgeValue15321;
        int edgeValue15322;
        int regionValue15335;
        int regionValue15336;
        int edgeValue15349;
        int edgeValue15350;
        int regionValue15363;
        int edgeValue15376;
        int regionValue15389;
        int edgeValue15402;
        java.lang.Object value15403;
        java.lang.Object value15405;
        java.lang.Object value15406;
        short converted15407;
        char converted15408;
        int value15410;
        int value15411;
        java.lang.Object value15413;
        double value15414;
        java.lang.Object value15415;
        short converted15416;
        char converted15417;
        int value15419;
        int value15420;
        java.lang.Object value15422;
        double value15423;
        int edgeValue15436;
        int comparison15437;
        int regionValue15451;
        int regionValue15478;
        int edgeValue15493;
        int regionValue15499;
        int edgeValue15504;
        short converted15558;
        int edgeValue15572;
        short converted15573;
        int value15575;
        int value15576;
        int value15577;
        java.lang.Object value15579;
        java.lang.Object value15580;
        java.lang.Object value15581;
        java.lang.Object value15583;
        int value15584;
        java.lang.Object value15588;
        int value15589;
        int edgeValue15608;
        int regionValue15621;
        int edgeValue15634;
        int value15636;
        java.lang.Object value15638;
        java.lang.Object value15639;
        java.lang.Object value15640;
        java.lang.Object value15642;
        int value15643;
        java.lang.Object value15647;
        int value15648;
        int computed15649;
        int comparison15651;
        int regionValue15664;
        int regionValue15665;
        java.lang.Object value15751;
        java.lang.Object value15752;
        java.lang.Object value15754;
        int value15755;
        java.lang.Object value15759;
        boolean value15760;
        int edgeValue15773;
        int edgeValue15774;
        int comparison15775;
        int regionValue15787;
        int regionValue15788;
        int edgeValue15801;
        int edgeValue15802;
        int regionValue15816;
        int regionValue15817;
        int edgeValue15831;
        int edgeValue15832;
        int regionValue15845;
        int regionValue15846;
        int edgeValue15858;
        int edgeValue15859;
        int regionValue15872;
        int regionValue15873;
        int edgeValue15886;
        int edgeValue15887;
        int regionValue15900;
        int regionValue15901;
        int edgeValue15914;
        int edgeValue15915;
        int regionValue15928;
        int edgeValue15941;
        int regionValue15954;
        int edgeValue15967;
        java.lang.Object value15968;
        java.lang.Object value15970;
        java.lang.Object value15971;
        short converted15972;
        char converted15973;
        int value15975;
        int value15976;
        java.lang.Object value15978;
        double value15979;
        java.lang.Object value15980;
        short converted15981;
        char converted15982;
        int value15984;
        int value15985;
        java.lang.Object value15987;
        double value15988;
        int edgeValue16001;
        java.lang.Object value16002;
        java.lang.Object value16003;
        java.lang.Object value16005;
        int value16006;
        java.lang.Object value16010;
        boolean value16011;
        int edgeValue16023;
        int edgeValue16024;
        int edgeValue16036;
        int edgeValue16037;
        int regionValue16044;
        int regionValue16045;
        int edgeValue16051;
        int edgeValue16052;
        int regionValue16064;
        int regionValue16065;
        int edgeValue16077;
        int edgeValue16078;
        int regionValue16087;
        int edgeValue16096;
        int regionValue16108;
        int edgeValue16120;
        java.lang.Object value16121;
        java.lang.Object value16123;
        java.lang.Object value16124;
        short converted16125;
        char converted16126;
        int value16128;
        int value16129;
        java.lang.Object value16131;
        double value16132;
        java.lang.Object value16133;
        short converted16134;
        char converted16135;
        int value16137;
        int value16138;
        java.lang.Object value16140;
        double value16141;
        int edgeValue16150;
        int comparison16151;
        int regionValue16154;
        int edgeValue16159;
        int regionValue16170;
        int edgeValue16181;
        int edgeValue16187;
        short converted16225;
        short converted16226;
        int value16228;
        int value16229;
        int value16230;
        java.lang.Object value16232;
        java.lang.Object value16233;
        java.lang.Object value16234;
        java.lang.Object value16236;
        int value16237;
        java.lang.Object value16241;
        int value16242;
        int edgeValue16254;
        int regionValue16260;
        int edgeValue16266;
        int value16268;
        java.lang.Object value16270;
        java.lang.Object value16271;
        java.lang.Object value16272;
        java.lang.Object value16274;
        int value16275;
        java.lang.Object value16279;
        int value16280;
        int computed16281;
        int edgeValue16290;
        int edgeValue16294;
        int comparison16297;
        int regionValue16298;
        int regionValue16300;
        int edgeValue16301;
        int regionValue16305;
        int edgeValue16309;
        int regionValue16313;
        int edgeValue16316;
        int regionValue16319;
        int edgeValue16322;
        int regionValue16325;
        int edgeValue16328;
        java.lang.Object value16330;
        int regionValue16331;
        int edgeValue16332;
        int regionValue16334;
        int edgeValue16336;
        int regionValue16338;
        int edgeValue16340;
        int edgeValue16342;
        java.lang.Object value16344;
        int value16345;
        int edgeValue16346;
        int edgeValue16349;
        int edgeValue16350;
        int incremented16395;
        int regionValue16406;
        long regionValue16408;
        long regionValue16409;
        long edgeValue16423;
        long value16424;
        long value16425;
        int comparison16426;
        int regionValue16451;
        long regionValue16453;
        long regionValue16454;
        java.lang.Object value16469;
        java.lang.Object value16470;
        java.lang.Object value16471;
        java.lang.Object value16472;
        java.lang.Object value16473;
        java.lang.Object value16474;
        int value16475;
        int value16476;
        long value16477;
        long value16478;
        java.lang.Object value16479;
        java.lang.Object value16480;
        java.lang.Object value16481;
        java.lang.Object value16482;
        int value16483;
        long converted16484;
        long computed16485;
        long value16486;
        long converted16487;
        long computed16488;
        int comparison16489;
        int regionValue16500;
        int edgeValue16512;
        int regionValue16524;
        int edgeValue16536;
        int regionValue16548;
        int edgeValue16559;
        int regionValue16570;
        int edgeValue16581;
        int edgeValue16592;
        int regionValue16603;
        int edgeValue16614;
        int regionValue16625;
        int edgeValue16636;
        long value16637;
        long value16638;
        int comparison16639;
        int edgeValue16650;
        long edgeValue16652;
        long edgeValue16653;
        int edgeValue16664;
        long edgeValue16666;
        long edgeValue16667;
        long value16668;
        long value16669;
        int comparison16670;
        int regionValue16681;
        int regionValue16682;
        int edgeValue16693;
        int edgeValue16694;
        int regionValue16705;
        int edgeValue16716;
        int regionValue16727;
        int edgeValue16738;
        int incremented16739;
        int regionValue16750;
        long regionValue16752;
        long regionValue16753;
        int edgeValue16764;
        long edgeValue16767;
        long value16768;
        long value16769;
        int comparison16770;
        int edgeValue16781;
        long edgeValue16783;
        long edgeValue16784;
        int edgeValue16795;
        long edgeValue16797;
        long edgeValue16798;
        java.lang.Object value16799;
        java.lang.Object value16800;
        java.lang.Object value16801;
        java.lang.Object value16802;
        java.lang.Object value16803;
        java.lang.Object value16804;
        int value16805;
        int value16806;
        long value16807;
        long value16808;
        java.lang.Object value16809;
        java.lang.Object value16810;
        java.lang.Object value16811;
        java.lang.Object value16812;
        int value16813;
        long converted16814;
        long computed16815;
        long value16816;
        long converted16817;
        long computed16818;
        int comparison16819;
        int edgeValue16830;
        int regionValue16842;
        int edgeValue16854;
        int edgeValue16866;
        int regionValue16877;
        int edgeValue16888;
        int edgeValue16899;
        int regionValue16910;
        int edgeValue16921;
        int regionValue16932;
        int edgeValue16943;
        long value16944;
        long value16945;
        int comparison16946;
        int edgeValue16957;
        long edgeValue16959;
        long edgeValue16960;
        int edgeValue16971;
        long edgeValue16973;
        long edgeValue16974;
        int comparison16975;
        int regionValue16986;
        int regionValue16988;
        int edgeValue16999;
        int regionValue17012;
        int edgeValue17025;
        int regionValue17038;
        int edgeValue17050;
        int regionValue17062;
        int edgeValue17074;
        int regionValue17086;
        int edgeValue17098;
        int edgeValue17110;
        int edgeValue17112;
        int regionValue17123;
        int regionValue17125;
        int edgeValue17136;
        int edgeValue17138;
        int edgeValue17149;
        int edgeValue17151;
        long value17152;
        long computed17153;
        int edgeValue17164;
        int edgeValue17175;
        int regionValue17186;
        int edgeValue17196;
        int edgeValue17207;
        long value17208;
        int regionValue17220;
        int edgeValue17232;
        long value17234;
        int comparison17235;
        int regionValue17246;
        int edgeValue17258;
        int regionValue17270;
        int edgeValue17282;
        int incremented17284;
        int regionValue17295;
        long regionValue17298;
        long regionValue17299;
        int edgeValue17310;
        long edgeValue17314;
        long value17315;
        int comparison17316;
        int edgeValue17327;
        long edgeValue17330;
        int regionValue17341;
        long regionValue17343;
        int edgeValue17354;
        long edgeValue17356;
        java.lang.Object value17358;
        java.lang.Object value17359;
        java.lang.Object value17360;
        java.lang.Object value17361;
        java.lang.Object value17362;
        java.lang.Object value17363;
        int value17364;
        int value17365;
        long value17366;
        long value17367;
        java.lang.Object value17368;
        java.lang.Object value17369;
        java.lang.Object value17370;
        java.lang.Object value17371;
        int value17372;
        long converted17373;
        long computed17374;
        int comparison17375;
        int regionValue17385;
        int edgeValue17396;
        int regionValue17408;
        int regionValue17410;
        int edgeValue17422;
        int edgeValue17424;
        long value17426;
        long converted17427;
        long computed17428;
        int regionValue17438;
        int edgeValue17448;
        int regionValue17459;
        int edgeValue17471;
        int edgeValue17483;
        int regionValue17495;
        int edgeValue17507;
        int regionValue17519;
        int edgeValue17531;
        long value17533;
        int comparison17534;
        int edgeValue17545;
        long edgeValue17548;
        int edgeValue17559;
        long edgeValue17561;
        int comparison17563;
        int regionValue17573;
        int regionValue17575;
        int edgeValue17585;
        int regionValue17597;
        int edgeValue17609;
        int regionValue17621;
        int edgeValue17632;
        int regionValue17643;
        int edgeValue17654;
        int regionValue17665;
        int edgeValue17676;
        int edgeValue17687;
        int edgeValue17689;
        int regionValue17699;
        int regionValue17701;
        int edgeValue17711;
        int edgeValue17713;
        int edgeValue17723;
        int edgeValue17725;
        int edgeValue17735;
        java.lang.Object value17736;
        java.lang.Object value17738;
        int edgeValue17748;
        int edgeValue17758;
        java.lang.Object value17760;
        java.lang.Object value17763;
        java.lang.Object value17764;
        float arrayValue17766;
        float arrayValue17767;
        java.lang.Object value17768;
        float arrayValue17769;
        byte converted17770;
        java.lang.Object value17771;
        float arrayValue17772;
        java.lang.Object value17773;
        java.lang.Object value17774;
        float arrayValue17775;
        java.lang.Object value17776;
        float arrayValue17777;
        int value17778;
        int value17780;
        java.lang.Object value17782;
        int value17783;
        int comparison17785;
        int regionValue17787;
        int regionValue17795;
        int edgeValue17801;
        java.lang.Object value17802;
        java.lang.Object value17803;
        java.lang.Object value17806;
        boolean value17807;
        int regionValue17809;
        int edgeValue17811;
        int regionValue17816;
        int edgeValue17822;
        int edgeValue17823;
        int regionValue17828;
        int edgeValue17834;
        int regionValue17842;
        int edgeValue17847;
        int regionValue17852;
        int edgeValue17857;
        int comparison17858;
        int regionValue17862;
        int regionValue17869;
        int edgeValue17874;
        int regionValue17879;
        int edgeValue17884;
        int regionValue17887;
        int regionValue17891;
        int edgeValue17895;
        int regionValue17899;
        int edgeValue17903;
        int edgeValue17908;
        int regionValue17909;
        int edgeValue17913;
        int value17914;
        int edgeValue17916;
        int edgeValue17917;
        int edgeValue17918;
        region2315: {
        region2314: {
        region2311: {
        region2310: {
        region2309: {
        region2308: {
        region2307: {
        region2305: {
        region2304: {
        region2302: {
        region2296: {
        region2294: {
        region2293: {
        region2291: {
        region2276: {
        region2199: {
        region2198: {
        region2188: {
        region2187: {
        region2186: {
        region2185: {
        region2184: {
        region2182: {
        region2181: {
        region2178: {
        region2108: {
        region2106: {
        region2105: {
        region2104: {
        region2097: {
        region2096: {
        region2095: {
        region2094: {
        region2092: {
        region2091: {
        region2088: {
        region2012: {
        region4049: {
        region4335: {
        region4043: {
        region4041: {
        region3820: {
        region3819: {
        region3817: {
        region3816: {
        region3813: {
        region3810: {
        region3808: {
        region3806: {
        region3804: {
        region3803: {
        region3799: {
        region3798: {
        region3797: {
        region3756: {
        region3755: {
        region3708: {
        region3706: {
        region3705: {
        region3699: {
        region3643: {
        region3642: {
        region3641: {
        region3640: {
        region3613: {
        region3557: {
        region3556: {
        region3554: {
        region3553: {
        region3548: {
        region3519: {
        region3517: {
        region3516: {
        region3470: {
        region3469: {
        region3424: {
        region3420: {
        region3418: {
        region3417: {
        region3411: {
        region3355: {
        region3354: {
        region3353: {
        region3352: {
        region3325: {
        region3269: {
        region3268: {
        region3266: {
        region3265: {
        region3263: {
        region3231: {
        region3228: {
        region3227: {
        region3225: {
        region3224: {
        region3222: {
        region3219: {
        region3216: {
        region3215: {
        region3214: {
        region3205: {
        region3204: {
        region3203: {
        region3202: {
        region3201: {
        region3200: {
        region3172: {
        region3163: {
        region3162: {
        region3161: {
        region3149: {
        region3147: {
        region3146: {
        region3144: {
        region3126: {
        region3124: {
        region3104: {
        region3103: {
        region3041: {
        region3039: {
        region3038: {
        region3031: {
        region2975: {
        region2974: {
        region2973: {
        region2972: {
        region2945: {
        region2889: {
        region2888: {
        region2886: {
        region2885: {
        region2881: {
        region2880: {
        region2851: {
        region2781: {
        region2710: {
        region2705: {
        region2703: {
        region2699: {
        region2697: {
        region2694: {
        region2692: {
        region2691: {
        region2687: {
        region2686: {
        region2683: {
        region2679: {
        region2678: {
        region2676: {
        region2675: {
        region2656: {
        region2651: {
        region2649: {
        region2648: {
        region2628: {
        region2627: {
        region2626: {
        region2625: {
        region2623: {
        region2622: {
        region2618: {
        region2615: {
        region2613: {
        region2610: {
        region2609: {
        region2608: {
        region2607: {
        region2606: {
        region2604: {
        region2603: {
        region2585: {
        region2584: {
        region2583: {
        region2580: {
        region2579: {
        region2578: {
        region2577: {
        region2576: {
        region2574: {
        region2573: {
        region2571: {
        region2565: {
        region2563: {
        region2562: {
        region2560: {
        region2545: {
        region2463: {
        region2462: {
        region2461: {
        region2460: {
        region2459: {
        region2458: {
        region2457: {
        region2445: {
        region2444: {
        region2442: {
        region2441: {
        region2389: {
        region2388: {
        region2380: {
        region2354: {
        region2352: {
        region2326: {
        region2324: {
        region2319: {
        region2316: {
        region2010: {
        region2009: {
        region1990: {
        region1987: {
        region1984: {
        region1983: {
        region1968: {
        region1966: {
        region1965: {
        region1964: {
        region1962: {
        region1961: {
        region1959: {
        region1953: {
        region1951: {
        region1950: {
        region1948: {
        region1855: {
        region1802: {
        region1801: {
        region1771: {
        region1767: {
        region1766: {
        region1710: {
        region1698: {
        region1697: {
        region1695: {
        region1691: {
        region1689: {
        region1688: {
        region1684: {
        region1683: {
        region1682: {
        region1681: {
        region1680: {
        region1679: {
        region1666: {
        region1665: {
        region1638: {
        region1604: {
        region1602: {
        region1601: {
        region1599: {
        region1571: {
        region1568: {
        region1557: {
        region1555: {
        region1554: {
        region1552: {
        region1541: {
        region1540: {
        region1538: {
        region1537: {
        region1533: {
        region1532: {
        region1522: {
        region1521: {
        region1494: {
        region1460: {
        region1458: {
        region1457: {
        region1455: {
        region1427: {
        region1424: {
        region1413: {
        region1411: {
        region1410: {
        region1408: {
        region1397: {
        region1396: {
        region1394: {
        region1393: {
        region1389: {
        region1388: {
        region1378: {
        region1339: {
        region1338: {
        region1336: {
        region1335: {
        region1232: {
        region1230: {
        region1229: {
        region1195: {
        region1194: {
        region1193: {
        region1192: {
        region1182: {
        region1143: {
        region1142: {
        region1140: {
        region1139: {
        region1036: {
        region1034: {
        region1033: {
        region999: {
        region997: {
        region996: {
        region983: {
        region973: {
        region928: {
        region926: {
        region925: {
        region897: {
        region896: {
        region879: {
        region878: {
        region873: {
        region871: {
        region869: {
        region868: {
        region866: {
        region863: {
        region861: {
        region860: {
        region855: {
        region854: {
        region853: {
        region852: {
        region850: {
        region849: {
        region846: {
        region834: {
        region833: {
        region832: {
        region831: {
        region819: {
        region818: {
        region814: {
        region812: {
        region811: {
        region809: {
        region795: {
        region794: {
        region793: {
        region792: {
        region780: {
        region779: {
        region777: {
        region776: {
        region772: {
        region771: {
        region759: {
        region758: {
        region756: {
        region755: {
        region751: {
        region750: {
        region738: {
        region737: {
        region735: {
        region734: {
        region732: {
        region715: {
        region713: {
        region712: {
        region710: {
        region695: {
        region693: {
        region683: {
        region681: {
        region680: {
        region678: {
        region666: {
        region664: {
        region663: {
        region661: {
        region660: {
        region658: {
        region657: {
        region653: {
        region651: {
        region626: {
        region570: {
        region568: {
        region567: {
        region565: {
        region563: {
        region561: {
        region530: {
        region527: {
        region526: {
        region524: {
        region523: {
        region520: {
        region519: {
        region518: {
        region516: {
        region515: {
        region513: {
        region500: {
        region499: {
        region466: {
        region410: {
        region409: {
        region408: {
        region407: {
        region378: {
        region376: {
        region375: {
        region368: {
        region366: {
        region364: {
        region362: {
        region361: {
        region341: {
        region340: {
        region339: {
        region338: {
        region337: {
        region335: {
        region334: {
        region332: {
        region331: {
        region326: {
        region321: {
        region319: {
        region318: {
        region311: {
        region309: {
        region308: {
        region306: {
        region301: {
        region299: {
        region298: {
        region291: {
        region289: {
        region288: {
        region286: {
        region281: {
        region279: {
        region278: {
        region271: {
        region269: {
        region268: {
        region266: {
        region261: {
        region259: {
        region258: {
        region251: {
        region249: {
        region248: {
        region246: {
        region241: {
        region239: {
        region238: {
        region231: {
        region229: {
        region228: {
        region226: {
        region221: {
        region219: {
        value6 = recovery$indy$flow$491();
        computed7 = value6 ^ a0;
        computed9 = computed7 ^ 101442983443004L;
        computed11 = computed7 ^ 137376818093348L;
        computed13 = computed7 ^ 96418732694697L;
        computed15 = computed7 ^ 18147948900048L;
        computed16 = computed15 >>> 48;
        converted17 = (int) (computed16);
        computed19 = computed15 << 16;
        computed20 = computed19 >>> 32;
        converted21 = (int) (computed20);
        computed23 = computed15 << 48;
        computed24 = computed23 >>> 48;
        converted25 = (int) (computed24);
        computed27 = computed7 ^ 37005068807730L;
        computed28 = computed27 >>> 32;
        converted29 = (int) (computed28);
        computed31 = computed27 << 32;
        computed32 = computed31 >>> 40;
        converted33 = (int) (computed32);
        computed35 = computed27 << 56;
        computed36 = computed35 >>> 56;
        converted37 = (int) (computed36);
        computed39 = computed7 ^ 54755146837371L;
        computed41 = computed7 ^ 71680763097868L;
        computed43 = computed7 ^ 23391087608142L;
        computed45 = computed7 ^ 101945802082093L;
        computed47 = computed7 ^ 93082031661877L;
        computed49 = computed7 ^ 121158726395338L;
        computed51 = computed7 ^ 47299454052916L;
        computed53 = computed7 ^ 45757635610391L;
        computed55 = computed7 ^ 138603280779117L;
        computed57 = computed7 ^ 60424964320457L;
        computed59 = computed7 ^ 43392601736768L;
        computed60 = computed59 >>> 48;
        converted61 = (int) (computed60);
        computed63 = computed59 << 16;
        computed64 = computed63 >>> 48;
        converted65 = (int) (computed64);
        computed67 = computed59 << 32;
        computed68 = computed67 >>> 32;
        converted69 = (int) (computed68);
        computed71 = computed7 ^ 140131311949032L;
        computed73 = computed7 ^ 65969991250327L;
        computed75 = computed7 ^ 99484615421546L;
        computed77 = computed7 ^ 8361827137561L;
        computed79 = computed7 ^ 63296493106069L;
        computed81 = computed7 ^ 35934841917263L;
        computed82 = computed81 >>> 16;
        computed84 = computed81 << 48;
        computed85 = computed84 >>> 48;
        converted86 = (int) (computed85);
        computed88 = computed7 ^ 55888732070570L;
        computed89 = computed88 >>> 48;
        converted90 = (int) (computed89);
        computed92 = computed88 << 16;
        computed93 = computed92 >>> 48;
        converted94 = (int) (computed93);
        computed96 = computed88 << 32;
        computed97 = computed96 >>> 32;
        converted98 = (int) (computed97);
        computed100 = computed7 ^ 105601474952761L;
        computed102 = computed7 ^ 122509243058416L;
        value104 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMode));
        value107 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value104))))));
        value108 = recovery$indy$flow$494(value107, computed73);
        value110 = recovery$indy$flow$495();
        value111 = -1;
        value112 = (int) ((value110 ? 1 : 0));
        value113 = recovery$indy$flow$496(value108);
        if (value112 == 0) {
            regionValue151 = value113;
            break region338;
        } else {
            break region219;
        }
        }
        switch (value113) {
            case -1818419758: {
                regionValue307 = value111;
                break region301;
            }
            case -734589744: {
                regionValue385 = value111;
                break region281;
            }
            case -654193598: {
                regionValue463 = value111;
                break region241;
            }
            case 79996329: {
                regionValue541 = value111;
                break region321;
            }
            case 1666574484: {
                break region221;
            }
            case 2027787361: {
                regionValue697 = value111;
                break region261;
            }
            default: {
                regionValue774 = value111;
                break region337;
            }
        }
        }
        value814 = recovery$indy$flow$497(value108, "DragClick");
        if (value112 == 0) {
            edgeValue852 = (int) ((value814 ? 1 : 0));
            regionValue151 = edgeValue852;
            break region338;
        } else {
            edgeValue932 = (int) ((value814 ? 1 : 0));
            break region226;
        }
        }
        break region228;
        }
        if (edgeValue932 == 0) {
            regionValue774 = value111;
            break region337;
        } else {
            break region229;
        }
        }
        break region231;
        }
        value1203 = 0;
        comparison1204 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1204 < 0) {
            regionValue1243 = value1203;
            regionValue1244 = value112;
            break region246;
        } else {
            break region238;
        }
        }
        if (value112 != 0) {
            regionValue774 = value1203;
            break region337;
        } else {
            break region239;
        }
        }
        regionValue463 = value1203;
        break region241;
        }
        value1520 = recovery$indy$flow$498(value108, "Advanced");
        edgeValue1559 = regionValue463;
        edgeValue1560 = (int) ((value1520 ? 1 : 0));
        regionValue1243 = edgeValue1559;
        regionValue1244 = edgeValue1560;
        break region246;
        }
        if (value112 == 0) {
            edgeValue1598 = regionValue1244;
            regionValue151 = edgeValue1598;
            break region338;
        } else {
            edgeValue1677 = regionValue1243;
            edgeValue1678 = regionValue1244;
            regionValue1637 = edgeValue1677;
            regionValue1638 = edgeValue1678;
            break region248;
        }
        }
        if (regionValue1638 == 0) {
            edgeValue1715 = regionValue1637;
            regionValue774 = edgeValue1715;
            break region337;
        } else {
            break region249;
        }
        }
        break region251;
        }
        value1869 = 1;
        comparison1870 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1870 < 0) {
            regionValue1909 = value1869;
            regionValue1910 = value112;
            break region266;
        } else {
            break region258;
        }
        }
        if (value112 != 0) {
            regionValue774 = value1869;
            break region337;
        } else {
            break region259;
        }
        }
        regionValue697 = value1869;
        break region261;
        }
        value2186 = recovery$indy$flow$499(value108, "Deviation");
        edgeValue2225 = regionValue697;
        edgeValue2226 = (int) ((value2186 ? 1 : 0));
        regionValue1909 = edgeValue2225;
        regionValue1910 = edgeValue2226;
        break region266;
        }
        if (value112 == 0) {
            edgeValue2264 = regionValue1910;
            regionValue151 = edgeValue2264;
            break region338;
        } else {
            edgeValue2343 = regionValue1909;
            edgeValue2344 = regionValue1910;
            regionValue2303 = edgeValue2343;
            regionValue2304 = edgeValue2344;
            break region268;
        }
        }
        if (regionValue2304 == 0) {
            edgeValue2381 = regionValue2303;
            regionValue774 = edgeValue2381;
            break region337;
        } else {
            break region269;
        }
        }
        break region271;
        }
        value2535 = 2;
        comparison2536 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2536 < 0) {
            regionValue2575 = value2535;
            regionValue2576 = value112;
            break region286;
        } else {
            break region278;
        }
        }
        if (value112 != 0) {
            regionValue774 = value2535;
            break region337;
        } else {
            break region279;
        }
        }
        regionValue385 = value2535;
        break region281;
        }
        value2852 = recovery$indy$flow$500(value108, "Recorded");
        edgeValue2891 = regionValue385;
        edgeValue2892 = (int) ((value2852 ? 1 : 0));
        regionValue2575 = edgeValue2891;
        regionValue2576 = edgeValue2892;
        break region286;
        }
        if (value112 == 0) {
            edgeValue2930 = regionValue2576;
            regionValue151 = edgeValue2930;
            break region338;
        } else {
            edgeValue3009 = regionValue2575;
            edgeValue3010 = regionValue2576;
            regionValue2969 = edgeValue3009;
            regionValue2970 = edgeValue3010;
            break region288;
        }
        }
        if (regionValue2970 == 0) {
            edgeValue3047 = regionValue2969;
            regionValue774 = edgeValue3047;
            break region337;
        } else {
            break region289;
        }
        }
        break region291;
        }
        value3201 = 3;
        comparison3202 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3202 <= 0) {
            regionValue3241 = value3201;
            regionValue3242 = value112;
            break region306;
        } else {
            break region298;
        }
        }
        if (value112 != 0) {
            regionValue774 = value3201;
            break region337;
        } else {
            break region299;
        }
        }
        regionValue307 = value3201;
        break region301;
        }
        value3518 = recovery$indy$flow$501(value108, "Simple");
        edgeValue3557 = regionValue307;
        edgeValue3558 = (int) ((value3518 ? 1 : 0));
        regionValue3241 = edgeValue3557;
        regionValue3242 = edgeValue3558;
        break region306;
        }
        if (value112 == 0) {
            edgeValue3596 = regionValue3242;
            regionValue151 = edgeValue3596;
            break region338;
        } else {
            edgeValue3675 = regionValue3241;
            edgeValue3676 = regionValue3242;
            regionValue3635 = edgeValue3675;
            regionValue3636 = edgeValue3676;
            break region308;
        }
        }
        if (regionValue3636 == 0) {
            edgeValue3713 = regionValue3635;
            regionValue774 = edgeValue3713;
            break region337;
        } else {
            break region309;
        }
        }
        break region311;
        }
        value3867 = 4;
        comparison3868 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3868 <= 0) {
            regionValue3906 = value3867;
            regionValue3907 = value112;
            break region326;
        } else {
            break region318;
        }
        }
        if (value112 != 0) {
            regionValue774 = value3867;
            break region337;
        } else {
            break region319;
        }
        }
        regionValue541 = value3867;
        break region321;
        }
        value4182 = recovery$indy$flow$502(value108, "Smart");
        edgeValue4220 = regionValue541;
        edgeValue4221 = (int) ((value4182 ? 1 : 0));
        regionValue3906 = edgeValue4220;
        regionValue3907 = edgeValue4221;
        break region326;
        }
        comparison4222 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4222 < 0) {
            edgeValue4299 = regionValue3907;
            regionValue4260 = edgeValue4299;
            break region339;
        } else {
            edgeValue4378 = regionValue3906;
            edgeValue4379 = regionValue3907;
            regionValue4338 = edgeValue4378;
            regionValue4339 = edgeValue4379;
            break region331;
        }
        }
        if (value112 == 0) {
            edgeValue4418 = regionValue4339;
            regionValue151 = edgeValue4418;
            break region338;
        } else {
            edgeValue4495 = regionValue4338;
            edgeValue4496 = regionValue4339;
            regionValue4456 = edgeValue4495;
            regionValue4457 = edgeValue4496;
            break region332;
        }
        }
        edgeValue4573 = regionValue4456;
        edgeValue4574 = regionValue4457;
        regionValue4534 = edgeValue4573;
        regionValue4535 = edgeValue4574;
        break region334;
        }
        if (regionValue4535 == 0) {
            edgeValue4611 = regionValue4534;
            regionValue774 = edgeValue4611;
            break region337;
        } else {
            break region335;
        }
        }
        value4687 = 5;
        regionValue774 = value4687;
        break region337;
        }
        edgeValue4763 = regionValue774;
        regionValue151 = edgeValue4763;
        break region338;
        }
        edgeValue4801 = regionValue151;
        regionValue4260 = edgeValue4801;
        break region339;
        }
        if (value112 == 0) {
            edgeValue4804 = regionValue4260;
            regionValue4803 = edgeValue4804;
            break region3820;
        } else {
            edgeValue4880 = regionValue4260;
            regionValue4842 = edgeValue4880;
            break region340;
        }
        }
        switch (regionValue4842) {
            case 0: {
                break region341;
            }
            case 1: {
                break region897;
            }
            case 2: {
                break region1802;
            }
            case 3: {
                break region1984;
            }
            case 4: {
                break region2316;
            }
            case 5: {
                break region2585;
            }
            default: {
                break region3819;
            }
        }
        }
        value5035 = 21;
        value5036 = recovery$indy$flow$503();
        value5038 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5036))))));
        value5039 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5038)))).field_42Y));
        value5041 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_43h));
        value5042 = recovery$indy$flow$507(value5041);
        comparison5043 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison5043 <= 0) {
            regionValue5057 = value5042;
            break region408;
        } else {
            break region361;
        }
        }
        if (value112 == 0) {
            regionValue5117 = value5042;
            break region407;
        } else {
            break region362;
        }
        }
        break region364;
        }
        if (value5042 >= 5) {
            break region378;
        } else {
            break region366;
        }
        }
        break region368;
        }
        value5266 = 1;
        comparison5267 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison5267 < 0) {
            regionValue5278 = value5266;
            regionValue5279 = value112;
            break region513;
        } else {
            break region375;
        }
        }
        if (value112 != 0) {
            regionValue5333 = value5266;
            break region500;
        } else {
            break region376;
        }
        }
        break region378;
        }
        value5385 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_442));
        value5386 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMaxCPSRecalculateTickDelay));
        value5388 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value5386))))));
        value5389 = recovery$indy$flow$511(value5388);
        value5393 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value5385))))));
        value5394 = recovery$indy$flow$513(value5393, computed71, value5389);
        edgeValue5408 = (int) ((value5394 ? 1 : 0));
        regionValue5117 = edgeValue5408;
        break region407;
        }
        edgeValue5422 = regionValue5117;
        regionValue5057 = edgeValue5422;
        break region408;
        }
        if (value112 == 0) {
            edgeValue5447 = regionValue5057;
            regionValue5435 = edgeValue5447;
            break region499;
        } else {
            edgeValue5475 = regionValue5057;
            regionValue5461 = edgeValue5475;
            break region409;
        }
        }
        if (regionValue5461 == 0) {
            break region466;
        } else {
            break region410;
        }
        }
        value5528 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_442));
        value5530 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value5528))))));
        recovery$indy$flow$516(value5530);
        value5531 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMaxCPSRecalculateTickDelay));
        converted5532 = (short) (converted90);
        converted5533 = (char) (converted94);
        value5535 = (int) (converted5533);
        value5536 = (int) (converted5532);
        value5538 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value5531))))));
        value5539 = recovery$indy$flow$519(value5538, (short) (value5536), (char) (value5535), converted98);
        value5540 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMaxCPS));
        converted5541 = (short) (converted90);
        converted5542 = (char) (converted94);
        value5544 = (int) (converted5542);
        value5545 = (int) (converted5541);
        value5547 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value5540))))));
        value5548 = recovery$indy$flow$522(value5547, (short) (value5545), (char) (value5544), converted98);
        break region466;
        }
        value5562 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_43h));
        value5563 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMinStandardDeviation));
        value5566 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value5563))))));
        value5567 = recovery$indy$flow$526(value5566, computed77);
        value5568 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingMaxCPS));
        value5570 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value5568))))));
        value5571 = recovery$indy$flow$529(value5570);
        converted5572 = (double) (value5571);
        value5573 = recovery$indy$flow$530(value5562, 21, value5567, computed51, converted5572, 3767637303013756370L, computed7);
        regionValue5435 = value5573;
        break region499;
        }
        value5586 = regionValue5435;
        edgeValue5598 = value5586;
        regionValue5333 = edgeValue5598;
        break region500;
        }
        value5599 = recovery$indy$flow$531();
        value5600 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value5599)))).field_44a));
        value5603 = ((java.lang.Object)(((augustus.recovered.modules.legit.SmartClicking_47Cz) (((java.lang.Object)(value5600))))));
        value5604 = recovery$indy$flow$534(value5603, computed53);
        edgeValue5615 = regionValue5333;
        edgeValue5616 = (int) ((value5604 ? 1 : 0));
        regionValue5278 = edgeValue5615;
        regionValue5279 = edgeValue5616;
        break region513;
        }
        if (value112 == 0) {
            edgeValue5638 = regionValue5279;
            regionValue5627 = edgeValue5638;
            break region519;
        } else {
            edgeValue5661 = regionValue5278;
            edgeValue5662 = regionValue5279;
            regionValue5649 = edgeValue5661;
            regionValue5650 = edgeValue5662;
            break region515;
        }
        }
        if (regionValue5650 == 0) {
            edgeValue5684 = regionValue5649;
            regionValue5673 = edgeValue5684;
            break region520;
        } else {
            break region516;
        }
        }
        break region518;
        }
        edgeValue5735 = 0;
        regionValue5627 = edgeValue5735;
        break region519;
        }
        value5736 = regionValue5627;
        edgeValue5747 = value5736;
        regionValue5673 = edgeValue5747;
        break region520;
        }
        if (value112 == 0) {
            edgeValue5768 = regionValue5673;
            regionValue5757 = edgeValue5768;
            break region527;
        } else {
            edgeValue5792 = regionValue5673;
            regionValue5780 = edgeValue5792;
            break region523;
        }
        }
        if (value5039 == null) {
            edgeValue5813 = regionValue5780;
            regionValue5803 = edgeValue5813;
            break region530;
        } else {
            edgeValue5835 = regionValue5780;
            regionValue5824 = edgeValue5835;
            break region524;
        }
        }
        edgeValue5857 = regionValue5824;
        regionValue5846 = edgeValue5857;
        break region526;
        }
        edgeValue5867 = regionValue5846;
        regionValue5757 = edgeValue5867;
        break region527;
        }
        value5869 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value5039)))).field_49));
        value5870 = recovery$indy$flow$536();
        if (((java.lang.Object) value5869) == ((java.lang.Object) value5870)) {
            edgeValue5880 = regionValue5757;
            regionValue5875 = edgeValue5880;
            break region660;
        } else {
            edgeValue5890 = regionValue5757;
            regionValue5803 = edgeValue5890;
            break region530;
        }
        }
        value5891 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48l));
        value5892 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDragCPSInAirRecalculateTickDelay));
        value5894 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value5892))))));
        value5895 = recovery$indy$flow$540(value5894);
        value5899 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value5891))))));
        value5900 = recovery$indy$flow$542(value5899, computed71, value5895);
        comparison5901 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison5901 < 0) {
            edgeValue5912 = regionValue5803;
            edgeValue5913 = (int) ((value5900 ? 1 : 0));
            regionValue5906 = edgeValue5912;
            regionValue5907 = edgeValue5913;
            break region653;
        } else {
            edgeValue5931 = (int) ((value5900 ? 1 : 0));
            break region561;
        }
        }
        break region563;
        }
        if (value112 == 0) {
            regionValue5954 = edgeValue5931;
            break region651;
        } else {
            break region565;
        }
        }
        break region567;
        }
        if (edgeValue5931 == 0) {
            break region626;
        } else {
            break region568;
        }
        }
        break region570;
        }
        value6038 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48l));
        value6040 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value6038))))));
        recovery$indy$flow$545(value6040);
        value6041 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDragCPSInAirRecalculateTickDelay));
        converted6042 = (short) (converted90);
        converted6043 = (char) (converted94);
        value6045 = (int) (converted6043);
        value6046 = (int) (converted6042);
        value6048 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value6041))))));
        value6049 = recovery$indy$flow$548(value6048, (short) (value6046), (char) (value6045), converted98);
        value6050 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDragCPSInAir));
        converted6051 = (short) (converted90);
        converted6052 = (char) (converted94);
        value6054 = (int) (converted6052);
        value6055 = (int) (converted6051);
        value6057 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value6050))))));
        value6058 = recovery$indy$flow$551(value6057, (short) (value6055), (char) (value6054), converted98);
        break region626;
        }
        value6064 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44f));
        value6065 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDragCPSInAir));
        value6067 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value6065))))));
        value6068 = recovery$indy$flow$555(value6067);
        value6072 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value6064))))));
        value6073 = recovery$indy$flow$557(value6072, value6068, computed100);
        regionValue5954 = value6073;
        break region651;
        }
        value6079 = regionValue5954;
        edgeValue6084 = value6079;
        regionValue5906 = edgeValue6084;
        regionValue5907 = value112;
        break region653;
        }
        comparison6086 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6086 < 0) {
            edgeValue6097 = regionValue5906;
            edgeValue6098 = regionValue5907;
            regionValue6091 = edgeValue6097;
            regionValue6092 = edgeValue6098;
            break region661;
        } else {
            edgeValue6109 = regionValue5906;
            edgeValue6110 = regionValue5907;
            regionValue6103 = edgeValue6109;
            regionValue6104 = edgeValue6110;
            break region657;
        }
        }
        if (regionValue6104 != 0) {
            edgeValue6118 = regionValue6103;
            regionValue6114 = edgeValue6118;
            break region873;
        } else {
            edgeValue6128 = regionValue6103;
            regionValue6123 = edgeValue6128;
            break region658;
        }
        }
        edgeValue6133 = regionValue6123;
        regionValue5875 = edgeValue6133;
        break region660;
        }
        edgeValue6138 = regionValue5875;
        edgeValue6139 = regionValue5875;
        regionValue6091 = edgeValue6138;
        regionValue6092 = edgeValue6139;
        break region661;
        }
        if (value112 == 0) {
            edgeValue6148 = regionValue6091;
            edgeValue6149 = regionValue6092;
            regionValue6143 = edgeValue6148;
            regionValue6144 = edgeValue6149;
            break region878;
        } else {
            edgeValue6160 = regionValue6091;
            edgeValue6161 = regionValue6092;
            regionValue6154 = edgeValue6160;
            regionValue6155 = edgeValue6161;
            break region663;
        }
        }
        if (regionValue6155 != 0) {
            edgeValue6165 = regionValue6154;
            regionValue6114 = edgeValue6165;
            break region873;
        } else {
            edgeValue6175 = regionValue6154;
            regionValue6170 = edgeValue6175;
            break region664;
        }
        }
        edgeValue6185 = regionValue6170;
        regionValue6180 = edgeValue6185;
        break region666;
        }
        value6186 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingCritFix));
        value6188 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value6186))))));
        value6189 = recovery$indy$flow$560(value6188);
        if (value112 == 0) {
            edgeValue6193 = regionValue6180;
            edgeValue6194 = (int) ((value6189 ? 1 : 0));
            regionValue6143 = edgeValue6193;
            regionValue6144 = edgeValue6194;
            break region878;
        } else {
            edgeValue6205 = regionValue6180;
            edgeValue6206 = (int) ((value6189 ? 1 : 0));
            regionValue6199 = edgeValue6205;
            break region678;
        }
        }
        edgeValue6217 = regionValue6199;
        regionValue6211 = edgeValue6217;
        break region680;
        }
        if (edgeValue6206 == 0) {
            edgeValue6222 = regionValue6211;
            regionValue6114 = edgeValue6222;
            break region873;
        } else {
            edgeValue6232 = regionValue6211;
            regionValue6227 = edgeValue6232;
            break region681;
        }
        }
        edgeValue6242 = regionValue6227;
        regionValue6237 = edgeValue6242;
        break region683;
        }
        value6243 = recovery$indy$flow$561();
        value6245 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6243))))));
        value6246 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6245)))).field_42Y));
        if (value6246 == null) {
            edgeValue6250 = regionValue6237;
            regionValue6114 = edgeValue6250;
            break region873;
        } else {
            edgeValue6260 = regionValue6237;
            regionValue6255 = edgeValue6260;
            break region693;
        }
        }
        edgeValue6270 = regionValue6255;
        regionValue6265 = edgeValue6270;
        break region695;
        }
        value6271 = recovery$indy$flow$564();
        value6272 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value6271)))).field_48e));
        value6275 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value6272))))));
        value6276 = recovery$indy$flow$567(value6275, computed9);
        if (value112 == 0) {
            edgeValue6285 = regionValue6265;
            edgeValue6286 = (int) ((value6276 ? 1 : 0));
            regionValue6280 = edgeValue6285;
            regionValue6281 = edgeValue6286;
            break region853;
        } else {
            edgeValue6295 = regionValue6265;
            edgeValue6296 = (int) ((value6276 ? 1 : 0));
            regionValue6290 = edgeValue6295;
            break region710;
        }
        }
        edgeValue6305 = regionValue6290;
        regionValue6300 = edgeValue6305;
        break region712;
        }
        if (edgeValue6296 != 0) {
            edgeValue6314 = regionValue6300;
            regionValue6310 = edgeValue6314;
            break region852;
        } else {
            edgeValue6322 = regionValue6300;
            regionValue6318 = edgeValue6322;
            break region713;
        }
        }
        edgeValue6330 = regionValue6318;
        regionValue6326 = edgeValue6330;
        break region715;
        }
        value6331 = recovery$indy$flow$568();
        value6333 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6331))))));
        value6334 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6333)))).field_42P));
        value6335 = recovery$indy$flow$571(value6334);
        comparison6336 = (java.lang.Float.isNaN(value6335) || java.lang.Float.isNaN(0.0F) ? -1 : (value6335 > 0.0F ? 1 : value6335 == 0.0F ? 0 : -1));
        comparison6337 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6337 <= 0) {
            edgeValue6347 = regionValue6326;
            regionValue6341 = edgeValue6347;
            regionValue6342 = comparison6336;
            break region751;
        } else {
            edgeValue6359 = regionValue6326;
            regionValue6353 = edgeValue6359;
            break region732;
        }
        }
        edgeValue6371 = regionValue6353;
        regionValue6365 = edgeValue6371;
        break region734;
        }
        if (value112 == 0) {
            edgeValue6382 = regionValue6365;
            regionValue6377 = edgeValue6382;
            regionValue6378 = comparison6336;
            break region750;
        } else {
            edgeValue6392 = regionValue6365;
            regionValue6387 = edgeValue6392;
            break region735;
        }
        }
        edgeValue6402 = regionValue6387;
        regionValue6397 = edgeValue6402;
        break region737;
        }
        if (comparison6336 <= 0) {
            edgeValue6411 = regionValue6397;
            regionValue6407 = edgeValue6411;
            break region854;
        } else {
            edgeValue6419 = regionValue6397;
            regionValue6415 = edgeValue6419;
            break region738;
        }
        }
        value6420 = recovery$indy$flow$572();
        value6422 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6420))))));
        value6423 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6422)))).field_42P));
        value6424 = recovery$indy$flow$575(value6423);
        edgeValue6428 = regionValue6415;
        edgeValue6429 = (int) ((value6424 ? 1 : 0));
        regionValue6377 = edgeValue6428;
        regionValue6378 = edgeValue6429;
        break region750;
        }
        edgeValue6433 = regionValue6377;
        edgeValue6434 = regionValue6378;
        regionValue6341 = edgeValue6433;
        regionValue6342 = edgeValue6434;
        break region751;
        }
        comparison6436 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6436 < 0) {
            edgeValue6446 = regionValue6341;
            edgeValue6447 = regionValue6342;
            regionValue6440 = edgeValue6446;
            regionValue6441 = edgeValue6447;
            break region772;
        } else {
            edgeValue6458 = regionValue6341;
            edgeValue6459 = regionValue6342;
            regionValue6452 = edgeValue6458;
            regionValue6453 = edgeValue6459;
            break region755;
        }
        }
        if (value112 == 0) {
            edgeValue6469 = regionValue6452;
            edgeValue6470 = regionValue6453;
            regionValue6464 = edgeValue6469;
            regionValue6465 = edgeValue6470;
            break region771;
        } else {
            edgeValue6479 = regionValue6452;
            edgeValue6480 = regionValue6453;
            regionValue6474 = edgeValue6479;
            regionValue6475 = edgeValue6480;
            break region756;
        }
        }
        edgeValue6489 = regionValue6474;
        edgeValue6490 = regionValue6475;
        regionValue6484 = edgeValue6489;
        regionValue6485 = edgeValue6490;
        break region758;
        }
        if (regionValue6485 != 0) {
            edgeValue6494 = regionValue6484;
            regionValue6407 = edgeValue6494;
            break region854;
        } else {
            edgeValue6502 = regionValue6484;
            regionValue6498 = edgeValue6502;
            break region759;
        }
        }
        value6503 = recovery$indy$flow$576();
        value6505 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6503))))));
        value6506 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6505)))).field_42P));
        value6507 = recovery$indy$flow$579(value6506);
        edgeValue6511 = regionValue6498;
        edgeValue6512 = (int) ((value6507 ? 1 : 0));
        regionValue6464 = edgeValue6511;
        regionValue6465 = edgeValue6512;
        break region771;
        }
        edgeValue6516 = regionValue6464;
        edgeValue6517 = regionValue6465;
        regionValue6440 = edgeValue6516;
        regionValue6441 = edgeValue6517;
        break region772;
        }
        comparison6519 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6519 < 0) {
            edgeValue6529 = regionValue6440;
            edgeValue6530 = regionValue6441;
            regionValue6523 = edgeValue6529;
            regionValue6524 = edgeValue6530;
            break region793;
        } else {
            edgeValue6541 = regionValue6440;
            edgeValue6542 = regionValue6441;
            regionValue6535 = edgeValue6541;
            regionValue6536 = edgeValue6542;
            break region776;
        }
        }
        if (value112 == 0) {
            edgeValue6552 = regionValue6535;
            edgeValue6553 = regionValue6536;
            regionValue6547 = edgeValue6552;
            regionValue6548 = edgeValue6553;
            break region792;
        } else {
            edgeValue6562 = regionValue6535;
            edgeValue6563 = regionValue6536;
            regionValue6557 = edgeValue6562;
            regionValue6558 = edgeValue6563;
            break region777;
        }
        }
        edgeValue6572 = regionValue6557;
        edgeValue6573 = regionValue6558;
        regionValue6567 = edgeValue6572;
        regionValue6568 = edgeValue6573;
        break region779;
        }
        if (regionValue6568 != 0) {
            edgeValue6577 = regionValue6567;
            regionValue6407 = edgeValue6577;
            break region854;
        } else {
            edgeValue6585 = regionValue6567;
            regionValue6581 = edgeValue6585;
            break region780;
        }
        }
        value6586 = recovery$indy$flow$580();
        value6588 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6586))))));
        value6589 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6588)))).field_42P));
        value6590 = recovery$indy$flow$583(value6589);
        edgeValue6594 = regionValue6581;
        edgeValue6595 = (int) ((value6590 ? 1 : 0));
        regionValue6547 = edgeValue6594;
        regionValue6548 = edgeValue6595;
        break region792;
        }
        edgeValue6599 = regionValue6547;
        edgeValue6600 = regionValue6548;
        regionValue6523 = edgeValue6599;
        regionValue6524 = edgeValue6600;
        break region793;
        }
        if (value112 == 0) {
            edgeValue6610 = regionValue6523;
            edgeValue6611 = regionValue6524;
            regionValue6605 = edgeValue6610;
            regionValue6606 = edgeValue6611;
            break region818;
        } else {
            edgeValue6620 = regionValue6523;
            edgeValue6621 = regionValue6524;
            regionValue6615 = edgeValue6620;
            regionValue6616 = edgeValue6621;
            break region794;
        }
        }
        if (regionValue6616 != 0) {
            edgeValue6625 = regionValue6615;
            regionValue6407 = edgeValue6625;
            break region854;
        } else {
            edgeValue6633 = regionValue6615;
            regionValue6629 = edgeValue6633;
            break region795;
        }
        }
        value6634 = recovery$indy$flow$584();
        value6636 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6634))))));
        value6637 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6636)))).field_42P));
        comparison6638 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6638 < 0) {
            edgeValue6648 = regionValue6629;
            regionValue6642 = edgeValue6648;
            regionValue6643 = value6637;
            break region832;
        } else {
            edgeValue6660 = regionValue6629;
            regionValue6654 = edgeValue6660;
            break region809;
        }
        }
        edgeValue6672 = regionValue6654;
        regionValue6666 = edgeValue6672;
        break region811;
        }
        if (value112 == 0) {
            edgeValue6683 = regionValue6666;
            regionValue6678 = edgeValue6683;
            regionValue6679 = value6637;
            break region831;
        } else {
            edgeValue6693 = regionValue6666;
            regionValue6688 = edgeValue6693;
            break region812;
        }
        }
        edgeValue6703 = regionValue6688;
        regionValue6698 = edgeValue6703;
        break region814;
        }
        value6705 = recovery$indy$flow$587();
        value6706 = recovery$indy$flow$588(value6637, value6705);
        edgeValue6710 = regionValue6698;
        edgeValue6711 = (int) ((value6706 ? 1 : 0));
        regionValue6605 = edgeValue6710;
        regionValue6606 = edgeValue6711;
        break region818;
        }
        if (regionValue6606 != 0) {
            edgeValue6715 = regionValue6605;
            regionValue6407 = edgeValue6715;
            break region854;
        } else {
            edgeValue6723 = regionValue6605;
            regionValue6719 = edgeValue6723;
            break region819;
        }
        }
        value6724 = recovery$indy$flow$589();
        value6726 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6724))))));
        value6727 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6726)))).field_42P));
        value6728 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value6727)))).field_48S));
        edgeValue6732 = regionValue6719;
        regionValue6678 = edgeValue6732;
        regionValue6679 = value6728;
        break region831;
        }
        edgeValue6737 = regionValue6678;
        edgeValue6738 = regionValue6679;
        regionValue6642 = edgeValue6737;
        regionValue6643 = edgeValue6738;
        break region832;
        }
        if (value112 == 0) {
            edgeValue6748 = regionValue6642;
            edgeValue6749 = regionValue6643;
            regionValue6743 = edgeValue6748;
            regionValue6744 = edgeValue6749;
            break region846;
        } else {
            edgeValue6758 = regionValue6642;
            edgeValue6759 = regionValue6643;
            regionValue6753 = edgeValue6758;
            regionValue6754 = edgeValue6759;
            break region833;
        }
        }
        if (regionValue6754 != null) {
            edgeValue6763 = regionValue6753;
            regionValue6407 = edgeValue6763;
            break region854;
        } else {
            edgeValue6771 = regionValue6753;
            regionValue6767 = edgeValue6771;
            break region834;
        }
        }
        value6772 = recovery$indy$flow$593();
        value6774 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6772))))));
        value6775 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6774)))).field_42Y));
        value6776 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value6775)))).field_47));
        edgeValue6780 = regionValue6767;
        regionValue6743 = edgeValue6780;
        regionValue6744 = value6776;
        break region846;
        }
        value6782 = recovery$indy$flow$597(regionValue6744);
        if (value112 == 0) {
            edgeValue6786 = regionValue6743;
            edgeValue6787 = (int) ((value6782 ? 1 : 0));
            regionValue6280 = edgeValue6786;
            regionValue6281 = edgeValue6787;
            break region853;
        } else {
            edgeValue6796 = regionValue6743;
            edgeValue6797 = (int) ((value6782 ? 1 : 0));
            regionValue6791 = edgeValue6796;
            break region849;
        }
        }
        if (edgeValue6797 == 0) {
            edgeValue6801 = regionValue6791;
            regionValue6407 = edgeValue6801;
            break region854;
        } else {
            edgeValue6809 = regionValue6791;
            regionValue6805 = edgeValue6809;
            break region850;
        }
        }
        edgeValue6813 = regionValue6805;
        regionValue6310 = edgeValue6813;
        break region852;
        }
        edgeValue6817 = regionValue6310;
        edgeValue6818 = 1;
        regionValue6280 = edgeValue6817;
        regionValue6281 = edgeValue6818;
        break region853;
        }
        edgeValue6827 = regionValue6280;
        edgeValue6828 = regionValue6281;
        regionValue6822 = edgeValue6827;
        regionValue6823 = edgeValue6828;
        break region855;
        }
        edgeValue6832 = regionValue6407;
        edgeValue6833 = 0;
        regionValue6822 = edgeValue6832;
        regionValue6823 = edgeValue6833;
        break region855;
        }
        value6834 = regionValue6823;
        value6835 = recovery$indy$flow$598(this);
        if (value112 == 0) {
            edgeValue6839 = regionValue6822;
            edgeValue6840 = (int) ((value6835 ? 1 : 0));
            regionValue6143 = edgeValue6839;
            regionValue6144 = edgeValue6840;
            break region878;
        } else {
            edgeValue6850 = regionValue6822;
            edgeValue6851 = value6834;
            edgeValue6852 = (int) ((value6835 ? 1 : 0));
            regionValue6844 = edgeValue6850;
            regionValue6845 = edgeValue6851;
            break region860;
        }
        }
        if (edgeValue6852 != 0) {
            edgeValue6856 = regionValue6844;
            regionValue6114 = edgeValue6856;
            break region873;
        } else {
            edgeValue6865 = regionValue6844;
            edgeValue6866 = regionValue6845;
            regionValue6860 = edgeValue6865;
            regionValue6861 = edgeValue6866;
            break region861;
        }
        }
        edgeValue6875 = regionValue6860;
        edgeValue6876 = regionValue6861;
        regionValue6870 = edgeValue6875;
        regionValue6871 = edgeValue6876;
        break region863;
        }
        if (value112 == 0) {
            edgeValue6880 = regionValue6870;
            edgeValue6881 = regionValue6871;
            regionValue6143 = edgeValue6880;
            regionValue6144 = edgeValue6881;
            break region878;
        } else {
            edgeValue6890 = regionValue6870;
            edgeValue6891 = regionValue6871;
            regionValue6885 = edgeValue6890;
            regionValue6886 = edgeValue6891;
            break region866;
        }
        }
        edgeValue6900 = regionValue6885;
        edgeValue6901 = regionValue6886;
        regionValue6895 = edgeValue6900;
        regionValue6896 = edgeValue6901;
        break region868;
        }
        if (regionValue6896 == 0) {
            edgeValue6905 = regionValue6895;
            regionValue6114 = edgeValue6905;
            break region873;
        } else {
            break region869;
        }
        }
        break region871;
        }
        value6918 = 1;
        regionValue6114 = value6918;
        break region873;
        }
        value6923 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_43h));
        value6924 = recovery$indy$flow$600(regionValue6114);
        value6925 = recovery$indy$flow$601(value6923, value6924);
        edgeValue6929 = regionValue6114;
        edgeValue6930 = (int) ((value6925 ? 1 : 0));
        regionValue6143 = edgeValue6929;
        regionValue6144 = edgeValue6930;
        break region878;
        }
        edgeValue6938 = regionValue6143;
        regionValue6934 = edgeValue6938;
        break region879;
        }
        loop879: while (true) {
        region890: {
        region4617: {
        region884: {
        value6939 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_43h));
        value6940 = recovery$indy$flow$603(value6939);
        if (value6940 <= 21) {
            edgeValue6948 = regionValue6934;
            regionValue6944 = edgeValue6948;
            break region4617;
        } else {
            edgeValue6956 = regionValue6934;
            regionValue6952 = edgeValue6956;
            break region884;
        }
        }
        value6957 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_43h));
        value6958 = recovery$indy$flow$605(value6957, 0);
        edgeValue6967 = regionValue6952;
        regionValue6962 = edgeValue6967;
        regionValue6963 = value112;
        break region890;
        }
        comparison6969 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6969 <= 0) {
            edgeValue6973 = regionValue6944;
            edgeValue6974 = regionValue6944;
            regionValue6962 = edgeValue6973;
            regionValue6963 = edgeValue6974;
            break region890;
        } else {
            edgeValue6976 = regionValue6944;
            regionValue6975 = edgeValue6976;
            break region896;
        }
        }
        loop890: while (true) {
        region891: {
        if (regionValue6963 != 0) {
            edgeValue6980 = regionValue6962;
            regionValue6934 = edgeValue6980;
            continue loop879;
        } else {
            edgeValue6988 = regionValue6962;
            regionValue6984 = edgeValue6988;
            break region891;
        }
        }
        comparison6989 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison6989 <= 0) {
            edgeValue6993 = regionValue6984;
            edgeValue6994 = regionValue6984;
            regionValue6962 = edgeValue6993;
            regionValue6963 = edgeValue6994;
            continue loop890;
        } else {
            edgeValue6995 = regionValue6984;
            regionValue6975 = edgeValue6995;
            break region896;
        }
        }
        }
        }
        return regionValue6975;
        }
        value6996 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48W));
        value6997 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPSRecalculateDelay));
        value6999 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value6997))))));
        value7000 = recovery$indy$flow$609(value6999);
        converted7001 = (long) (value7000);
        value7005 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value6996))))));
        value7006 = recovery$indy$flow$611(value7005, converted7001, computed79);
        if (value112 == 0) {
            edgeValue7036 = (int) ((value7006 ? 1 : 0));
            regionValue7021 = edgeValue7036;
            break region983;
        } else {
            edgeValue7072 = (int) ((value7006 ? 1 : 0));
            break region925;
        }
        }
        if (edgeValue7072 == 0) {
            break region973;
        } else {
            break region926;
        }
        }
        break region928;
        }
        value7169 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        converted7170 = (short) (converted90);
        converted7171 = (char) (converted94);
        value7173 = (int) (converted7171);
        value7174 = (int) (converted7170);
        value7176 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7169))))));
        value7177 = recovery$indy$flow$614(value7176, (short) (value7174), (char) (value7173), converted98);
        value7178 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPSRecalculateDelay));
        value7180 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7178))))));
        value7181 = recovery$indy$flow$617(value7180);
        value7182 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48W));
        value7184 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7182))))));
        recovery$indy$flow$620(value7184);
        break region973;
        }
        value7199 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        value7201 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7199))))));
        value7202 = recovery$indy$flow$623(value7201);
        regionValue7021 = value7202;
        break region983;
        }
        value7218 = regionValue7021;
        value7219 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSpikes));
        value7221 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7219))))));
        value7222 = recovery$indy$flow$626(value7221);
        if (value112 == 0) {
            edgeValue7253 = value7218;
            edgeValue7254 = (int) ((value7222 ? 1 : 0));
            regionValue7237 = edgeValue7253;
            regionValue7238 = edgeValue7254;
            break region1192;
        } else {
            edgeValue7285 = value7218;
            edgeValue7286 = (int) ((value7222 ? 1 : 0));
            regionValue7269 = edgeValue7285;
            break region996;
        }
        }
        if (edgeValue7286 == 0) {
            edgeValue7316 = regionValue7269;
            regionValue7301 = edgeValue7316;
            break region1182;
        } else {
            edgeValue7346 = regionValue7269;
            regionValue7331 = edgeValue7346;
            break region997;
        }
        }
        edgeValue7376 = regionValue7331;
        regionValue7361 = edgeValue7376;
        break region999;
        }
        value7377 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSpikeDelay));
        value7380 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7377))))));
        value7381 = recovery$indy$flow$629(value7380, computed77);
        converted7382 = (int) (value7381);
        value7384 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44M));
        value7385 = recovery$indy$flow$631(this);
        value7389 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7384))))));
        value7390 = recovery$indy$flow$633(value7389, value7385, computed79);
        if (value112 == 0) {
            edgeValue7405 = regionValue7361;
            edgeValue7406 = (int) ((value7390 ? 1 : 0));
            regionValue7237 = edgeValue7405;
            regionValue7238 = edgeValue7406;
            break region1192;
        } else {
            edgeValue7438 = regionValue7361;
            edgeValue7440 = (int) ((value7390 ? 1 : 0));
            regionValue7421 = edgeValue7438;
            break region1033;
        }
        }
        if (edgeValue7440 == 0) {
            edgeValue7455 = regionValue7421;
            regionValue7301 = edgeValue7455;
            break region1182;
        } else {
            break region1034;
        }
        }
        break region1036;
        }
        value7516 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        value7518 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7516))))));
        value7519 = recovery$indy$flow$636(value7518);
        converted7520 = (double) (value7519);
        value7521 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSpikeMultiplier));
        value7524 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7521))))));
        value7525 = recovery$indy$flow$639(value7524, computed77);
        computed7526 = converted7520 * value7525;
        value7527 = recovery$indy$flow$640(computed7526);
        converted7528 = (int) (value7527);
        value7530 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44M));
        value7531 = recovery$indy$flow$642(this);
        value7532 = recovery$indy$flow$643();
        value7533 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSpikeDuration));
        converted7534 = (char) (converted17);
        value7537 = (int) (converted7534);
        value7539 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7533))))));
        value7540 = recovery$indy$flow$646(value7539, (char) (value7537), converted21, converted25);
        converted7541 = (int) (value7540);
        value7542 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSpikeDuration));
        value7545 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value7542))))));
        value7546 = recovery$indy$flow$649(value7545, computed39);
        converted7547 = (int) (value7546);
        value7552 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(value7532))))));
        value7553 = recovery$indy$flow$651(value7552, converted7541, converted7547, computed102);
        converted7554 = (long) (value7553);
        computed7555 = value7531 + converted7554;
        value7559 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7530))))));
        value7560 = recovery$indy$flow$653(value7559, computed7555, computed79);
        comparison7561 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison7561 < 0) {
            edgeValue7594 = (int) ((value7560 ? 1 : 0));
            regionValue7576 = converted7528;
            regionValue7577 = edgeValue7594;
            break region1193;
        } else {
            edgeValue7630 = (int) ((value7560 ? 1 : 0));
            break region1139;
        }
        }
        if (value112 == 0) {
            regionValue7237 = converted7528;
            regionValue7238 = edgeValue7630;
            break region1192;
        } else {
            break region1140;
        }
        }
        break region1142;
        }
        if (edgeValue7630 == 0) {
            regionValue7301 = converted7528;
            break region1182;
        } else {
            break region1143;
        }
        }
        value7763 = recovery$indy$flow$654();
        computed7764 = converted7382 - 100;
        value7765 = recovery$indy$flow$655(0, computed7764);
        computed7766 = converted7382 + 100;
        value7771 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(value7763))))));
        value7772 = recovery$indy$flow$657(value7771, value7765, computed7766, computed102);
        converted7773 = (long) (value7772);
        recovery$indy$flow$658(this, converted7773);
        value7774 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44M));
        value7776 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7774))))));
        recovery$indy$flow$661(value7776);
        regionValue7301 = converted7528;
        break region1182;
        }
        value7792 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDrops));
        value7794 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7792))))));
        value7795 = recovery$indy$flow$664(value7794);
        edgeValue7810 = regionValue7301;
        edgeValue7811 = (int) ((value7795 ? 1 : 0));
        regionValue7237 = edgeValue7810;
        regionValue7238 = edgeValue7811;
        break region1192;
        }
        edgeValue7826 = regionValue7237;
        edgeValue7827 = regionValue7238;
        regionValue7576 = edgeValue7826;
        regionValue7577 = edgeValue7827;
        break region1193;
        }
        if (value112 == 0) {
            edgeValue7847 = regionValue7576;
            edgeValue7848 = regionValue7577;
            regionValue7837 = edgeValue7847;
            regionValue7838 = edgeValue7848;
            break region1388;
        } else {
            edgeValue7879 = regionValue7576;
            edgeValue7880 = regionValue7577;
            regionValue7863 = edgeValue7879;
            regionValue7864 = edgeValue7880;
            break region1194;
        }
        }
        if (regionValue7864 == 0) {
            edgeValue7898 = regionValue7863;
            regionValue7889 = edgeValue7898;
            break region1378;
        } else {
            edgeValue7928 = regionValue7863;
            regionValue7913 = edgeValue7928;
            break region1195;
        }
        }
        value7929 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDropDelay));
        value7932 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7929))))));
        value7933 = recovery$indy$flow$667(value7932, computed77);
        converted7934 = (int) (value7933);
        value7936 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_40));
        value7937 = recovery$indy$flow$669(this);
        value7941 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7936))))));
        value7942 = recovery$indy$flow$671(value7941, value7937, computed79);
        if (value112 == 0) {
            edgeValue7951 = regionValue7913;
            edgeValue7952 = (int) ((value7942 ? 1 : 0));
            regionValue7837 = edgeValue7951;
            regionValue7838 = edgeValue7952;
            break region1388;
        } else {
            edgeValue7984 = regionValue7913;
            edgeValue7986 = (int) ((value7942 ? 1 : 0));
            regionValue7967 = edgeValue7984;
            break region1229;
        }
        }
        if (edgeValue7986 == 0) {
            edgeValue7995 = regionValue7967;
            regionValue7889 = edgeValue7995;
            break region1378;
        } else {
            break region1230;
        }
        }
        break region1232;
        }
        value8056 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        value8058 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8056))))));
        value8059 = recovery$indy$flow$674(value8058);
        converted8060 = (double) (value8059);
        value8061 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDropMultiplier));
        value8064 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value8061))))));
        value8065 = recovery$indy$flow$677(value8064, computed77);
        computed8066 = converted8060 * value8065;
        value8067 = recovery$indy$flow$678(computed8066);
        converted8068 = (int) (value8067);
        value8070 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_40));
        value8071 = recovery$indy$flow$680(this);
        value8072 = recovery$indy$flow$681();
        value8073 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDropDuration));
        converted8074 = (char) (converted17);
        value8077 = (int) (converted8074);
        value8079 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8073))))));
        value8080 = recovery$indy$flow$684(value8079, (char) (value8077), converted21, converted25);
        converted8081 = (int) (value8080);
        value8082 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDropDuration));
        value8085 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8082))))));
        value8086 = recovery$indy$flow$687(value8085, computed39);
        converted8087 = (int) (value8086);
        value8092 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(value8072))))));
        value8093 = recovery$indy$flow$689(value8092, converted8081, converted8087, computed102);
        converted8094 = (long) (value8093);
        computed8095 = value8071 + converted8094;
        value8099 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value8070))))));
        value8100 = recovery$indy$flow$691(value8099, computed8095, computed79);
        comparison8101 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison8101 < 0) {
            edgeValue8122 = (int) ((value8100 ? 1 : 0));
            regionValue8110 = converted8068;
            regionValue8111 = edgeValue8122;
            break region1389;
        } else {
            edgeValue8148 = (int) ((value8100 ? 1 : 0));
            break region1335;
        }
        }
        if (value112 == 0) {
            regionValue7837 = converted8068;
            regionValue7838 = edgeValue8148;
            break region1388;
        } else {
            break region1336;
        }
        }
        break region1338;
        }
        if (edgeValue8148 == 0) {
            regionValue7889 = converted8068;
            break region1378;
        } else {
            break region1339;
        }
        }
        value8239 = recovery$indy$flow$692();
        computed8240 = converted7934 - 100;
        value8241 = recovery$indy$flow$693(0, computed8240);
        computed8242 = converted7934 + 100;
        value8247 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(value8239))))));
        value8248 = recovery$indy$flow$695(value8247, value8241, computed8242, computed102);
        converted8249 = (long) (value8248);
        recovery$indy$flow$696(this, converted8249);
        value8250 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_40));
        value8252 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value8250))))));
        recovery$indy$flow$699(value8252);
        regionValue7889 = converted8068;
        break region1378;
        }
        value8262 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceHitsInAir));
        value8264 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value8262))))));
        value8265 = recovery$indy$flow$702(value8264);
        edgeValue8274 = regionValue7889;
        edgeValue8275 = (int) ((value8265 ? 1 : 0));
        regionValue7837 = edgeValue8274;
        regionValue7838 = edgeValue8275;
        break region1388;
        }
        edgeValue8284 = regionValue7837;
        edgeValue8285 = regionValue7838;
        regionValue8110 = edgeValue8284;
        regionValue8111 = edgeValue8285;
        break region1389;
        }
        comparison8287 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison8287 <= 0) {
            edgeValue8307 = regionValue8110;
            edgeValue8308 = regionValue8111;
            regionValue8296 = edgeValue8307;
            regionValue8297 = edgeValue8308;
            break region1533;
        } else {
            edgeValue8329 = regionValue8110;
            edgeValue8330 = regionValue8111;
            regionValue8318 = edgeValue8329;
            regionValue8319 = edgeValue8330;
            break region1393;
        }
        }
        if (value112 == 0) {
            edgeValue8350 = regionValue8318;
            edgeValue8351 = regionValue8319;
            regionValue8340 = edgeValue8350;
            regionValue8341 = edgeValue8351;
            break region1532;
        } else {
            edgeValue8370 = regionValue8318;
            edgeValue8371 = regionValue8319;
            regionValue8360 = edgeValue8370;
            regionValue8361 = edgeValue8371;
            break region1394;
        }
        }
        edgeValue8390 = regionValue8360;
        edgeValue8391 = regionValue8361;
        regionValue8380 = edgeValue8390;
        regionValue8381 = edgeValue8391;
        break region1396;
        }
        if (regionValue8381 == 0) {
            edgeValue8409 = regionValue8380;
            regionValue8400 = edgeValue8409;
            break region1522;
        } else {
            edgeValue8427 = regionValue8380;
            regionValue8418 = edgeValue8427;
            break region1397;
        }
        }
        value8428 = recovery$indy$flow$703();
        value8430 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8428))))));
        value8431 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8430)))).field_42Y));
        if (value112 == 0) {
            edgeValue8450 = regionValue8418;
            regionValue8440 = edgeValue8450;
            regionValue8441 = value8431;
            break region1424;
        } else {
            edgeValue8470 = regionValue8418;
            regionValue8460 = edgeValue8470;
            break region1408;
        }
        }
        edgeValue8490 = regionValue8460;
        regionValue8480 = edgeValue8490;
        break region1410;
        }
        if (value8431 == null) {
            edgeValue8500 = regionValue8480;
            regionValue8400 = edgeValue8500;
            break region1522;
        } else {
            edgeValue8518 = regionValue8480;
            regionValue8509 = edgeValue8518;
            break region1411;
        }
        }
        edgeValue8536 = regionValue8509;
        regionValue8527 = edgeValue8536;
        break region1413;
        }
        value8537 = recovery$indy$flow$706();
        value8539 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8537))))));
        value8540 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8539)))).field_42Y));
        edgeValue8549 = regionValue8527;
        regionValue8440 = edgeValue8549;
        regionValue8441 = value8540;
        break region1424;
        }
        value8551 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue8441)))).field_49));
        value8552 = recovery$indy$flow$710();
        if (((java.lang.Object) value8551) != ((java.lang.Object) value8552)) {
            edgeValue8561 = regionValue8440;
            regionValue8400 = edgeValue8561;
            break region1522;
        } else {
            break region1427;
        }
        }
        value8578 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44n));
        value8579 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceRecalculateDelay));
        value8581 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8579))))));
        value8582 = recovery$indy$flow$714(value8581);
        converted8583 = (long) (value8582);
        value8587 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value8578))))));
        value8588 = recovery$indy$flow$716(value8587, converted8583, computed79);
        if (value112 == 0) {
            edgeValue8606 = (int) ((value8588 ? 1 : 0));
            regionValue8597 = edgeValue8606;
            break region1521;
        } else {
            edgeValue8624 = (int) ((value8588 ? 1 : 0));
            break region1455;
        }
        }
        break region1457;
        }
        if (edgeValue8624 == 0) {
            break region1494;
        } else {
            break region1458;
        }
        }
        break region1460;
        }
        value8691 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceRecalculateDelay));
        value8693 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8691))))));
        value8694 = recovery$indy$flow$719(value8693);
        value8695 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceMultiplier));
        value8697 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8695))))));
        value8698 = recovery$indy$flow$722(value8697);
        value8699 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44n));
        value8701 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value8699))))));
        recovery$indy$flow$725(value8701);
        break region1494;
        }
        value8710 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        value8712 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8710))))));
        value8713 = recovery$indy$flow$728(value8712);
        converted8714 = (double) (value8713);
        value8715 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceMultiplier));
        value8718 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value8715))))));
        value8719 = recovery$indy$flow$731(value8718, computed47);
        computed8720 = converted8714 * value8719;
        value8721 = recovery$indy$flow$732(computed8720);
        converted8722 = (int) (value8721);
        regionValue8597 = converted8722;
        break region1521;
        }
        value8732 = regionValue8597;
        edgeValue8741 = value8732;
        regionValue8400 = edgeValue8741;
        break region1522;
        }
        value8742 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceHitsOnWall));
        value8744 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value8742))))));
        value8745 = recovery$indy$flow$735(value8744);
        edgeValue8754 = regionValue8400;
        edgeValue8755 = (int) ((value8745 ? 1 : 0));
        regionValue8340 = edgeValue8754;
        regionValue8341 = edgeValue8755;
        break region1532;
        }
        edgeValue8764 = regionValue8340;
        edgeValue8765 = regionValue8341;
        regionValue8296 = edgeValue8764;
        regionValue8297 = edgeValue8765;
        break region1533;
        }
        comparison8767 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison8767 < 0) {
            edgeValue8781 = regionValue8296;
            edgeValue8782 = regionValue8297;
            regionValue8773 = edgeValue8781;
            regionValue8774 = edgeValue8782;
            break region1680;
        } else {
            edgeValue8803 = regionValue8296;
            edgeValue8804 = regionValue8297;
            regionValue8792 = edgeValue8803;
            regionValue8793 = edgeValue8804;
            break region1537;
        }
        }
        if (value112 == 0) {
            edgeValue8818 = regionValue8792;
            edgeValue8819 = regionValue8793;
            regionValue8811 = edgeValue8818;
            regionValue8812 = edgeValue8819;
            break region1679;
        } else {
            edgeValue8838 = regionValue8792;
            edgeValue8839 = regionValue8793;
            regionValue8828 = edgeValue8838;
            regionValue8829 = edgeValue8839;
            break region1538;
        }
        }
        edgeValue8858 = regionValue8828;
        edgeValue8859 = regionValue8829;
        regionValue8848 = edgeValue8858;
        regionValue8849 = edgeValue8859;
        break region1540;
        }
        if (regionValue8849 == 0) {
            edgeValue8873 = regionValue8848;
            regionValue8866 = edgeValue8873;
            break region1666;
        } else {
            edgeValue8891 = regionValue8848;
            regionValue8882 = edgeValue8891;
            break region1541;
        }
        }
        value8892 = recovery$indy$flow$736();
        value8894 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8892))))));
        value8895 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8894)))).field_42Y));
        if (value112 == 0) {
            edgeValue8914 = regionValue8882;
            regionValue8904 = edgeValue8914;
            regionValue8905 = value8895;
            break region1568;
        } else {
            edgeValue8934 = regionValue8882;
            regionValue8924 = edgeValue8934;
            break region1552;
        }
        }
        edgeValue8954 = regionValue8924;
        regionValue8944 = edgeValue8954;
        break region1554;
        }
        if (value8895 == null) {
            edgeValue8962 = regionValue8944;
            regionValue8866 = edgeValue8962;
            break region1666;
        } else {
            edgeValue8980 = regionValue8944;
            regionValue8971 = edgeValue8980;
            break region1555;
        }
        }
        edgeValue8998 = regionValue8971;
        regionValue8989 = edgeValue8998;
        break region1557;
        }
        value8999 = recovery$indy$flow$739();
        value9001 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8999))))));
        value9002 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9001)))).field_42Y));
        edgeValue9011 = regionValue8989;
        regionValue8904 = edgeValue9011;
        regionValue8905 = value9002;
        break region1568;
        }
        value9013 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue8905)))).field_49));
        value9014 = recovery$indy$flow$743();
        if (((java.lang.Object) value9013) != ((java.lang.Object) value9014)) {
            edgeValue9021 = regionValue8904;
            regionValue8866 = edgeValue9021;
            break region1666;
        } else {
            break region1571;
        }
        }
        value9038 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44h));
        value9039 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceRecalculateDelayOnWall));
        value9041 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9039))))));
        value9042 = recovery$indy$flow$747(value9041);
        converted9043 = (long) (value9042);
        value9047 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value9038))))));
        value9048 = recovery$indy$flow$749(value9047, converted9043, computed79);
        if (value112 == 0) {
            edgeValue9062 = (int) ((value9048 ? 1 : 0));
            regionValue9055 = edgeValue9062;
            break region1665;
        } else {
            edgeValue9078 = (int) ((value9048 ? 1 : 0));
            break region1599;
        }
        }
        break region1601;
        }
        if (edgeValue9078 == 0) {
            break region1638;
        } else {
            break region1602;
        }
        }
        break region1604;
        }
        value9137 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceRecalculateDelayOnWall));
        value9139 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9137))))));
        value9140 = recovery$indy$flow$752(value9139);
        value9141 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceMultiplierOnWall));
        value9143 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9141))))));
        value9144 = recovery$indy$flow$755(value9143);
        value9145 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44h));
        value9147 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value9145))))));
        recovery$indy$flow$758(value9147);
        break region1638;
        }
        value9155 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingAdvancedCPS));
        value9157 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9155))))));
        value9158 = recovery$indy$flow$761(value9157);
        converted9159 = (double) (value9158);
        value9160 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingReduceMultiplierOnWall));
        value9163 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9160))))));
        value9164 = recovery$indy$flow$764(value9163, computed47);
        computed9165 = converted9159 * value9164;
        value9166 = recovery$indy$flow$765(computed9165);
        converted9167 = (int) (value9166);
        regionValue9055 = converted9167;
        break region1665;
        }
        value9175 = regionValue9055;
        edgeValue9182 = value9175;
        regionValue8866 = edgeValue9182;
        break region1666;
        }
        value9183 = recovery$indy$flow$766();
        value9184 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value9183)))).field_44a));
        value9187 = ((java.lang.Object)(((augustus.recovered.modules.legit.SmartClicking_47Cz) (((java.lang.Object)(value9184))))));
        value9188 = recovery$indy$flow$769(value9187, computed53);
        edgeValue9194 = regionValue8866;
        edgeValue9195 = (int) ((value9188 ? 1 : 0));
        regionValue8811 = edgeValue9194;
        regionValue8812 = edgeValue9195;
        break region1679;
        }
        edgeValue9201 = regionValue8811;
        edgeValue9202 = regionValue8812;
        regionValue8773 = edgeValue9201;
        regionValue8774 = edgeValue9202;
        break region1680;
        }
        if (value112 == 0) {
            edgeValue9205 = regionValue8774;
            regionValue9204 = edgeValue9205;
            break region1683;
        } else {
            edgeValue9218 = regionValue8773;
            edgeValue9219 = regionValue8774;
            regionValue9211 = edgeValue9218;
            regionValue9212 = edgeValue9219;
            break region1681;
        }
        }
        if (regionValue9212 == 0) {
            edgeValue9231 = regionValue9211;
            regionValue9225 = edgeValue9231;
            break region1684;
        } else {
            break region1682;
        }
        }
        edgeValue9232 = 0;
        regionValue9204 = edgeValue9232;
        break region1683;
        }
        return regionValue9204;
        }
        value9233 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44Z));
        if (value112 == 0) {
            edgeValue9246 = regionValue9225;
            regionValue9239 = edgeValue9246;
            regionValue9240 = value9233;
            break region1695;
        } else {
            edgeValue9260 = regionValue9225;
            regionValue9253 = edgeValue9260;
            break region1688;
        }
        }
        if (value9233 == null) {
            edgeValue9273 = regionValue9253;
            regionValue9267 = edgeValue9273;
            break region1697;
        } else {
            edgeValue9285 = regionValue9253;
            regionValue9279 = edgeValue9285;
            break region1689;
        }
        }
        edgeValue9297 = regionValue9279;
        regionValue9291 = edgeValue9297;
        break region1691;
        }
        value9298 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44Z));
        edgeValue9304 = regionValue9291;
        regionValue9239 = edgeValue9304;
        regionValue9240 = value9298;
        break region1695;
        }
        value9306 = recovery$indy$flow$772(regionValue9240);
        edgeValue9319 = regionValue9239;
        regionValue9312 = edgeValue9319;
        regionValue9313 = value9306;
        break region1698;
        }
        edgeValue9326 = regionValue9267;
        edgeValue9327 = 11;
        regionValue9312 = edgeValue9326;
        regionValue9313 = edgeValue9327;
        break region1698;
        }
        value9328 = regionValue9313;
        value9329 = recovery$indy$flow$773();
        length9331 = java.lang.reflect.Array.getLength(value9329);
        value9333 = 0;
        edgeValue9349 = regionValue9312;
        edgeValue9350 = value9328;
        regionValue9339 = edgeValue9349;
        regionValue9340 = edgeValue9350;
        regionValue9343 = value9333;
        break region1710;
        }
        loop1710: while (true) {
        region1770: {
        region1769: {
        region1768: {
        region1765: {
        region1764: {
        region1752: {
        region1750: {
        region1749: {
        region1745: {
        region1744: {
        region1742: {
        region1741: {
        region1739: {
        region1725: {
        region1723: {
        region1722: {
        region1713: {
        if (regionValue9343 >= length9331) {
            edgeValue9363 = regionValue9339;
            regionValue9358 = edgeValue9363;
            break region1771;
        } else {
            edgeValue9379 = regionValue9339;
            edgeValue9380 = regionValue9340;
            edgeValue9383 = regionValue9343;
            regionValue9369 = edgeValue9379;
            regionValue9370 = edgeValue9380;
            regionValue9373 = edgeValue9383;
            break region1713;
        }
        }
        arrayValue9384 = ((java.lang.Object[]) value9329)[regionValue9373];
        value9385 = arrayValue9384;
        comparison9386 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison9386 <= 0) {
            edgeValue9403 = regionValue9369;
            edgeValue9404 = regionValue9370;
            edgeValue9407 = regionValue9373;
            regionValue9392 = edgeValue9403;
            regionValue9393 = edgeValue9404;
            regionValue9396 = edgeValue9407;
            break region1770;
        } else {
            edgeValue9426 = regionValue9369;
            edgeValue9427 = regionValue9370;
            edgeValue9430 = regionValue9373;
            edgeValue9431 = value9385;
            regionValue9414 = edgeValue9426;
            regionValue9415 = edgeValue9427;
            regionValue9418 = edgeValue9430;
            regionValue9419 = edgeValue9431;
            break region1722;
        }
        }
        if (value112 == 0) {
            edgeValue9448 = regionValue9414;
            edgeValue9449 = regionValue9415;
            edgeValue9452 = regionValue9418;
            regionValue9438 = edgeValue9448;
            regionValue9439 = edgeValue9449;
            regionValue9442 = edgeValue9452;
            break region1769;
        } else {
            edgeValue9469 = regionValue9414;
            edgeValue9470 = regionValue9415;
            edgeValue9473 = regionValue9418;
            edgeValue9474 = regionValue9419;
            regionValue9458 = edgeValue9469;
            regionValue9459 = edgeValue9470;
            regionValue9462 = edgeValue9473;
            regionValue9463 = edgeValue9474;
            break region1723;
        }
        }
        edgeValue9491 = regionValue9458;
        edgeValue9492 = regionValue9459;
        edgeValue9495 = regionValue9462;
        edgeValue9496 = regionValue9463;
        regionValue9480 = edgeValue9491;
        regionValue9481 = edgeValue9492;
        regionValue9484 = edgeValue9495;
        regionValue9485 = edgeValue9496;
        break region1725;
        }
        value9497 = regionValue9485;
        value9498 = ((java.lang.Object)(((net.C_47My) (((java.lang.Object)(value9497))))));
        value9499 = recovery$indy$flow$775(value9498);
        comparison9500 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison9500 <= 0) {
            edgeValue9519 = regionValue9480;
            edgeValue9520 = regionValue9481;
            edgeValue9523 = regionValue9484;
            edgeValue9524 = regionValue9485;
            edgeValue9525 = value9499;
            regionValue9506 = edgeValue9519;
            regionValue9507 = edgeValue9520;
            regionValue9510 = edgeValue9523;
            regionValue9511 = edgeValue9524;
            regionValue9512 = edgeValue9525;
            regionValue9513 = value112;
            break region1745;
        } else {
            edgeValue9545 = regionValue9480;
            edgeValue9546 = regionValue9481;
            edgeValue9549 = regionValue9484;
            edgeValue9550 = regionValue9485;
            edgeValue9551 = value9499;
            regionValue9532 = edgeValue9545;
            regionValue9533 = edgeValue9546;
            regionValue9536 = edgeValue9549;
            regionValue9537 = edgeValue9550;
            regionValue9538 = edgeValue9551;
            break region1739;
        }
        }
        edgeValue9571 = regionValue9532;
        edgeValue9572 = regionValue9533;
        edgeValue9575 = regionValue9536;
        edgeValue9576 = regionValue9537;
        edgeValue9577 = regionValue9538;
        regionValue9558 = edgeValue9571;
        regionValue9559 = edgeValue9572;
        regionValue9562 = edgeValue9575;
        regionValue9563 = edgeValue9576;
        regionValue9564 = edgeValue9577;
        break region1741;
        }
        if (value112 == 0) {
            edgeValue9580 = regionValue9564;
            regionValue9579 = edgeValue9580;
            break region1801;
        } else {
            edgeValue9598 = regionValue9558;
            edgeValue9599 = regionValue9559;
            edgeValue9602 = regionValue9562;
            edgeValue9603 = regionValue9563;
            edgeValue9604 = regionValue9564;
            regionValue9586 = edgeValue9598;
            regionValue9587 = edgeValue9599;
            regionValue9590 = edgeValue9602;
            regionValue9591 = edgeValue9603;
            regionValue9592 = edgeValue9604;
            break region1742;
        }
        }
        edgeValue9622 = regionValue9586;
        edgeValue9623 = regionValue9587;
        edgeValue9626 = regionValue9590;
        edgeValue9627 = regionValue9591;
        edgeValue9628 = regionValue9592;
        regionValue9610 = edgeValue9622;
        regionValue9611 = edgeValue9623;
        regionValue9614 = edgeValue9626;
        regionValue9615 = edgeValue9627;
        regionValue9616 = edgeValue9628;
        break region1744;
        }
        edgeValue9634 = regionValue9610;
        edgeValue9635 = regionValue9611;
        edgeValue9638 = regionValue9614;
        edgeValue9639 = regionValue9615;
        edgeValue9640 = regionValue9616;
        edgeValue9641 = regionValue9611;
        regionValue9506 = edgeValue9634;
        regionValue9507 = edgeValue9635;
        regionValue9510 = edgeValue9638;
        regionValue9511 = edgeValue9639;
        regionValue9512 = edgeValue9640;
        regionValue9513 = edgeValue9641;
        break region1745;
        }
        comparison9642 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison9642 < 0) {
            edgeValue9660 = regionValue9506;
            edgeValue9661 = regionValue9507;
            edgeValue9664 = regionValue9510;
            edgeValue9665 = regionValue9512;
            edgeValue9666 = regionValue9513;
            regionValue9648 = edgeValue9660;
            regionValue9649 = edgeValue9661;
            regionValue9652 = edgeValue9664;
            regionValue9653 = edgeValue9665;
            regionValue9654 = edgeValue9666;
            break region1764;
        } else {
            edgeValue9685 = regionValue9506;
            edgeValue9686 = regionValue9507;
            edgeValue9689 = regionValue9510;
            edgeValue9690 = regionValue9511;
            edgeValue9691 = regionValue9512;
            edgeValue9692 = regionValue9513;
            regionValue9672 = edgeValue9685;
            regionValue9673 = edgeValue9686;
            regionValue9676 = edgeValue9689;
            regionValue9677 = edgeValue9690;
            regionValue9678 = edgeValue9691;
            regionValue9679 = edgeValue9692;
            break region1749;
        }
        }
        if (regionValue9678 != regionValue9679) {
            edgeValue9708 = regionValue9672;
            edgeValue9709 = regionValue9673;
            edgeValue9712 = regionValue9676;
            regionValue9698 = edgeValue9708;
            regionValue9699 = edgeValue9709;
            regionValue9702 = edgeValue9712;
            break region1768;
        } else {
            edgeValue9729 = regionValue9672;
            edgeValue9730 = regionValue9673;
            edgeValue9733 = regionValue9676;
            edgeValue9734 = regionValue9677;
            regionValue9718 = edgeValue9729;
            regionValue9719 = edgeValue9730;
            regionValue9722 = edgeValue9733;
            regionValue9723 = edgeValue9734;
            break region1750;
        }
        }
        edgeValue9751 = regionValue9718;
        edgeValue9752 = regionValue9719;
        edgeValue9755 = regionValue9722;
        edgeValue9756 = regionValue9723;
        regionValue9740 = edgeValue9751;
        regionValue9741 = edgeValue9752;
        regionValue9744 = edgeValue9755;
        regionValue9745 = edgeValue9756;
        break region1752;
        }
        value9757 = regionValue9745;
        value9758 = ((java.lang.Object)(((net.C_47My) (((java.lang.Object)(value9757))))));
        value9759 = recovery$indy$flow$777(value9758);
        edgeValue9765 = regionValue9740;
        edgeValue9766 = regionValue9741;
        edgeValue9769 = regionValue9744;
        edgeValue9770 = (int) ((value9759 ? 1 : 0));
        regionValue9648 = edgeValue9765;
        regionValue9649 = edgeValue9766;
        regionValue9652 = edgeValue9769;
        regionValue9653 = edgeValue9770;
        regionValue9654 = value112;
        break region1764;
        }
        if (regionValue9654 == 0) {
            edgeValue9773 = regionValue9653;
            regionValue9772 = edgeValue9773;
            break region1767;
        } else {
            edgeValue9790 = regionValue9648;
            edgeValue9791 = regionValue9649;
            edgeValue9794 = regionValue9652;
            edgeValue9795 = regionValue9653;
            regionValue9779 = edgeValue9790;
            regionValue9780 = edgeValue9791;
            regionValue9783 = edgeValue9794;
            regionValue9784 = edgeValue9795;
            break region1765;
        }
        }
        if (regionValue9784 != 0) {
            edgeValue9801 = regionValue9779;
            edgeValue9802 = regionValue9780;
            edgeValue9805 = regionValue9783;
            regionValue9698 = edgeValue9801;
            regionValue9699 = edgeValue9802;
            regionValue9702 = edgeValue9805;
            break region1768;
        } else {
            break region1766;
        }
        }
        incremented9806 = regionValue9702 + (1);
        edgeValue9812 = regionValue9698;
        edgeValue9813 = regionValue9699;
        edgeValue9816 = incremented9806;
        regionValue9438 = edgeValue9812;
        regionValue9439 = edgeValue9813;
        regionValue9442 = edgeValue9816;
        break region1769;
        }
        edgeValue9822 = regionValue9438;
        edgeValue9823 = regionValue9439;
        edgeValue9826 = regionValue9442;
        regionValue9392 = edgeValue9822;
        regionValue9393 = edgeValue9823;
        regionValue9396 = edgeValue9826;
        break region1770;
        }
        if (value112 != 0) {
            edgeValue9833 = regionValue9392;
            edgeValue9834 = regionValue9393;
            edgeValue9837 = regionValue9396;
            regionValue9339 = edgeValue9833;
            regionValue9340 = edgeValue9834;
            regionValue9343 = edgeValue9837;
            continue loop1710;
        } else {
            edgeValue9842 = regionValue9392;
            regionValue9358 = edgeValue9842;
            break region1771;
        }
        }
        }
        edgeValue9843 = 0;
        regionValue9772 = edgeValue9843;
        break region1767;
        }
        return regionValue9772;
        }
        value9844 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48e));
        value9846 = regionValue9358;
        value9848 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value9844))))));
        value9849 = recovery$indy$flow$780(value9848, value9846, computed100);
        value9853 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value9854 = recovery$indy$flow$782(value9853, value9849, computed13);
        regionValue9579 = value9854;
        break region1801;
        }
        return regionValue9579;
        }
        value9856 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDeviationCPS));
        converted9857 = (char) (converted17);
        value9860 = (int) (converted9857);
        value9862 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9856))))));
        value9863 = recovery$indy$flow$785(value9862, (char) (value9860), converted21, converted25);
        converted9864 = (float) (value9863);
        value9866 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDeviationCPS));
        value9869 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value9866))))));
        value9870 = recovery$indy$flow$788(value9869, computed39);
        converted9871 = (float) (value9870);
        computed9873 = converted9864 + converted9871;
        computed9874 = computed9873 / 2.0F;
        computed9876 = converted9871 - converted9864;
        computed9877 = computed9876 / Float.intBitsToFloat(1086324736);
        value9879 = recovery$indy$flow$789();
        value9881 = 0;
        regionValue9890 = value9881;
        break region1855;
        }
        loop1855: while (true) {
        region1874: {
        region4504: {
        region1860: {
        value9900 = recovery$indy$flow$790(this);
        comparison9901 = (value9900 > value9879 ? 1 : value9900 == value9879 ? 0 : -1);
        if (comparison9901 >= 0) {
            edgeValue9919 = regionValue9890;
            regionValue9910 = edgeValue9919;
            break region4504;
        } else {
            edgeValue9937 = regionValue9890;
            regionValue9928 = edgeValue9937;
            break region1860;
        }
        }
        converted9938 = (double) (computed9874);
        converted9939 = (double) (computed9877);
        initialized9940 = new java.security.SecureRandom();
        value9941 = recovery$indy$flow$793(initialized9940);
        computed9942 = converted9939 * value9941;
        computed9943 = converted9938 + computed9942;
        converted9944 = (float) (computed9943);
        computed9945 = Float.intBitsToFloat(1148846080) / converted9944;
        converted9946 = (int) (computed9945);
        edgeValue9965 = regionValue9928;
        edgeValue9966 = converted9946;
        regionValue9955 = edgeValue9965;
        regionValue9956 = edgeValue9966;
        break region1874;
        }
        value9967 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDeviationDoubleClick));
        value9968 = value9967;
        value9969 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value9968))))));
        value9970 = recovery$indy$flow$810(value9969);
        comparison9971 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison9971 < 0) {
            edgeValue9980 = regionValue9910;
            edgeValue9981 = (int) ((value9970 ? 1 : 0));
            regionValue9955 = edgeValue9980;
            regionValue9956 = edgeValue9981;
            break region1874;
        } else {
            edgeValue9992 = regionValue9910;
            edgeValue9993 = (int) ((value9970 ? 1 : 0));
            regionValue9986 = edgeValue9992;
            regionValue9987 = edgeValue9993;
            break region1948;
        }
        }
        loop1874: while (true) {
        region1934: {
        region1922: {
        region1906: {
        region1903: {
        region1892: {
        region1890: {
        region1889: {
        region1878: {
        converted9994 = (double) (regionValue9956);
        value9995 = converted9994;
        if (value112 == 0) {
            edgeValue10003 = regionValue9955;
            regionValue9999 = edgeValue10003;
            break region1968;
        } else {
            edgeValue10022 = regionValue9955;
            edgeValue10023 = value9995;
            regionValue10012 = edgeValue10022;
            regionValue10013 = edgeValue10023;
            break region1878;
        }
        }
        value10024 = recovery$indy$flow$794();
        value10025 = value10024;
        value10026 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10025))))));
        value10027 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10026)))).field_42Y));
        if (value112 == 0) {
            edgeValue10047 = regionValue10012;
            edgeValue10048 = regionValue10013;
            edgeValue10049 = value10027;
            regionValue10036 = edgeValue10047;
            regionValue10037 = edgeValue10048;
            regionValue10038 = edgeValue10049;
            break region1903;
        } else {
            edgeValue10069 = regionValue10012;
            edgeValue10070 = regionValue10013;
            edgeValue10071 = value10027;
            regionValue10058 = edgeValue10069;
            regionValue10059 = edgeValue10070;
            regionValue10060 = edgeValue10071;
            break region1889;
        }
        }
        if (regionValue10060 == null) {
            edgeValue10090 = regionValue10058;
            edgeValue10091 = regionValue10059;
            regionValue10080 = edgeValue10090;
            regionValue10081 = edgeValue10091;
            break region1906;
        } else {
            edgeValue10110 = regionValue10058;
            edgeValue10111 = regionValue10059;
            regionValue10100 = edgeValue10110;
            regionValue10101 = edgeValue10111;
            break region1890;
        }
        }
        edgeValue10130 = regionValue10100;
        edgeValue10131 = regionValue10101;
        regionValue10120 = edgeValue10130;
        regionValue10121 = edgeValue10131;
        break region1892;
        }
        value10132 = recovery$indy$flow$797();
        value10133 = value10132;
        value10134 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10133))))));
        value10135 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10134)))).field_42Y));
        edgeValue10144 = regionValue10120;
        edgeValue10145 = regionValue10121;
        edgeValue10146 = value10135;
        regionValue10036 = edgeValue10144;
        regionValue10037 = edgeValue10145;
        regionValue10038 = edgeValue10146;
        break region1903;
        }
        value10147 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue10038)))).field_49));
        value10148 = recovery$indy$flow$801();
        if (((java.lang.Object) value10147) == ((java.lang.Object) value10148)) {
            edgeValue10167 = regionValue10036;
            edgeValue10168 = regionValue10037;
            regionValue10157 = edgeValue10167;
            regionValue10158 = edgeValue10168;
            break region1922;
        } else {
            edgeValue10177 = regionValue10036;
            edgeValue10178 = regionValue10037;
            regionValue10080 = edgeValue10177;
            regionValue10081 = edgeValue10178;
            break region1906;
        }
        }
        value10179 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDeviationAirMultiplier));
        value10181 = value10179;
        value10182 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value10181))))));
        value10183 = recovery$indy$flow$804(value10182, computed77);
        computed10184 = regionValue10081 / value10183;
        value10185 = computed10184;
        edgeValue10194 = regionValue10080;
        edgeValue10195 = value10185;
        regionValue10157 = edgeValue10194;
        regionValue10158 = edgeValue10195;
        break region1922;
        }
        value10196 = recovery$indy$flow$805(this);
        converted10197 = (long) (regionValue10158);
        value10198 = recovery$indy$flow$806(converted10197, 1000L);
        computed10199 = value10196 + value10198;
        recovery$indy$flow$807(this, computed10199);
        incremented10200 = regionValue10157 + (1);
        if (value112 != 0) {
            edgeValue10209 = incremented10200;
            regionValue9890 = edgeValue10209;
            continue loop1855;
        } else {
            edgeValue10227 = incremented10200;
            regionValue10218 = edgeValue10227;
            break region1934;
        }
        }
        value10228 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDeviationDoubleClick));
        value10229 = value10228;
        value10230 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value10229))))));
        value10231 = recovery$indy$flow$810(value10230);
        comparison10232 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison10232 < 0) {
            edgeValue10241 = regionValue10218;
            edgeValue10242 = (int) ((value10231 ? 1 : 0));
            regionValue9955 = edgeValue10241;
            regionValue9956 = edgeValue10242;
            continue loop1874;
        } else {
            edgeValue10247 = regionValue10218;
            edgeValue10248 = (int) ((value10231 ? 1 : 0));
            regionValue9986 = edgeValue10247;
            regionValue9987 = edgeValue10248;
            break region1948;
        }
        }
        }
        }
        if (value112 == 0) {
            edgeValue10250 = regionValue9987;
            regionValue10249 = edgeValue10250;
            break region1983;
        } else {
            edgeValue10261 = regionValue9986;
            edgeValue10262 = regionValue9987;
            regionValue10255 = edgeValue10261;
            regionValue10256 = edgeValue10262;
            break region1950;
        }
        }
        if (regionValue10256 != 0) {
            edgeValue10266 = regionValue10255;
            regionValue9999 = edgeValue10266;
            break region1968;
        } else {
            edgeValue10276 = regionValue10255;
            regionValue10271 = edgeValue10276;
            break region1951;
        }
        }
        edgeValue10286 = regionValue10271;
        regionValue10281 = edgeValue10286;
        break region1953;
        }
        comparison10287 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison10287 <= 0) {
            edgeValue10297 = regionValue10281;
            edgeValue10298 = regionValue10281;
            regionValue10291 = edgeValue10297;
            regionValue10292 = edgeValue10298;
            regionValue10293 = value112;
            break region1965;
        } else {
            edgeValue10309 = regionValue10281;
            edgeValue10310 = regionValue10281;
            regionValue10303 = edgeValue10309;
            regionValue10304 = edgeValue10310;
            break region1959;
        }
        }
        edgeValue10321 = regionValue10303;
        edgeValue10322 = regionValue10304;
        regionValue10315 = edgeValue10321;
        regionValue10316 = edgeValue10322;
        break region1961;
        }
        if (value112 == 0) {
            edgeValue10324 = regionValue10316;
            regionValue10249 = edgeValue10324;
            break region1983;
        } else {
            edgeValue10333 = regionValue10315;
            edgeValue10334 = regionValue10316;
            regionValue10328 = edgeValue10333;
            regionValue10329 = edgeValue10334;
            break region1962;
        }
        }
        edgeValue10343 = regionValue10328;
        edgeValue10344 = regionValue10329;
        regionValue10338 = edgeValue10343;
        regionValue10339 = edgeValue10344;
        break region1964;
        }
        edgeValue10348 = regionValue10338;
        edgeValue10349 = regionValue10339;
        edgeValue10350 = 1;
        regionValue10291 = edgeValue10348;
        regionValue10292 = edgeValue10349;
        regionValue10293 = edgeValue10350;
        break region1965;
        }
        if (regionValue10292 <= regionValue10293) {
            edgeValue10354 = regionValue10291;
            regionValue9999 = edgeValue10354;
            break region1968;
        } else {
            break region1966;
        }
        }
        value10361 = 1;
        regionValue9999 = value10361;
        break region1968;
        }
        value10367 = regionValue9999;
        value10369 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value10370 = recovery$indy$flow$812(value10369, value10367, computed13);
        regionValue10249 = value10370;
        break region1983;
        }
        return regionValue10249;
        }
        value10372 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48H));
        if (value10372 != null) {
            break region1990;
        } else {
            break region1987;
        }
        }
        return 0;
        }
        value10395 = 0;
        value10396 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingRecordedMode));
        value10399 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value10396))))));
        value10400 = recovery$indy$flow$816(value10399, computed73);
        value10401 = recovery$indy$flow$817(value10400, "Ticks");
        if (value112 == 0) {
            edgeValue10425 = (int) ((value10401 ? 1 : 0));
            break region4041;
        } else {
            edgeValue10449 = (int) ((value10401 ? 1 : 0));
            break region2009;
        }
        }
        if (edgeValue10449 == 0) {
            regionValue10460 = value10395;
            break region2106;
        } else {
            break region2010;
        }
        }
        regionValue10504 = value10395;
        break region2012;
        }
        if (value112 == 0) {
            break region2389;
        } else {
            break region2319;
        }
        }
        value10554 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44H));
        comparison10555 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison10555 <= 0) {
            regionValue10564 = value10554;
            break region2380;
        } else {
            break region2324;
        }
        }
        break region2326;
        }
        value10614 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleCPSRecalculateDelay));
        value10616 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value10614))))));
        value10617 = recovery$indy$flow$881(value10616);
        value10621 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value10554))))));
        value10622 = recovery$indy$flow$883(value10621, computed71, value10617);
        if ((int) ((value10622 ? 1 : 0)) == 0) {
            break region2388;
        } else {
            break region2352;
        }
        }
        break region2354;
        }
        value10671 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleCPSRecalculateDelay));
        value10673 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value10671))))));
        value10674 = recovery$indy$flow$886(value10673);
        value10675 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleCPS));
        value10677 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value10675))))));
        value10678 = recovery$indy$flow$889(value10677);
        value10679 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44H));
        regionValue10564 = value10679;
        break region2380;
        }
        value10689 = regionValue10564;
        value10690 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value10689))))));
        recovery$indy$flow$892(value10690);
        break region2388;
        }
        break region2389;
        }
        value10708 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_448));
        value10709 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleCPS));
        value10711 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value10709))))));
        value10712 = recovery$indy$flow$896(value10711);
        value10713 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleClickDutyCycle));
        value10716 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(value10713))))));
        value10717 = recovery$indy$flow$899(value10716, computed57);
        value10718 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleClickDutyCycle));
        value10721 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(value10718))))));
        value10722 = recovery$indy$flow$902(value10721, computed43);
        value10723 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleDoubleClicks));
        value10725 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value10723))))));
        value10726 = recovery$indy$flow$905(value10725);
        comparison10727 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison10727 < 0) {
            edgeValue10750 = (int) ((value10726 ? 1 : 0));
            regionValue10738 = edgeValue10750;
            break region2458;
        } else {
            edgeValue10774 = (int) ((value10726 ? 1 : 0));
            break region2441;
        }
        }
        if (value112 == 0) {
            regionValue10786 = edgeValue10774;
            break region2457;
        } else {
            break region2442;
        }
        }
        break region2444;
        }
        if (edgeValue10774 == 0) {
            break region2462;
        } else {
            break region2445;
        }
        }
        value10882 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleDoubleClicks));
        value10884 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(value10882))))));
        value10885 = recovery$indy$flow$908(value10884);
        edgeValue10896 = (int) ((value10885 ? 1 : 0));
        regionValue10786 = edgeValue10896;
        break region2457;
        }
        edgeValue10907 = regionValue10786;
        regionValue10738 = edgeValue10907;
        break region2458;
        }
        if (value112 == 0) {
            edgeValue10930 = regionValue10738;
            regionValue10919 = edgeValue10930;
            break region2461;
        } else {
            edgeValue10952 = regionValue10738;
            regionValue10941 = edgeValue10952;
            break region2459;
        }
        }
        if (regionValue10941 == 0) {
            break region2462;
        } else {
            break region2460;
        }
        }
        edgeValue10993 = 1;
        regionValue10919 = edgeValue10993;
        break region2461;
        }
        edgeValue11015 = regionValue10919;
        regionValue11004 = edgeValue11015;
        break region2463;
        }
        edgeValue11026 = 0;
        regionValue11004 = edgeValue11026;
        break region2463;
        }
        value11027 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSimpleExtraDoubleClickRandomize));
        value11029 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value11027))))));
        value11030 = recovery$indy$flow$911(value11029);
        value11031 = Double.longBitsToDouble(4605020690978879570L);
        value11033 = (int) ((value11030 ? 1 : 0));
        value11034 = regionValue11004;
        value11039 = ((java.lang.Object)(((net.C_47ej) (((java.lang.Object)(value10708))))));
        value11040 = recovery$indy$flow$913(value11039, value10712, value10717, value10722, ((value11034 & 1) != 0), ((value11033 & 1) != 0), computed75, value11031);
        value11043 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value11040))))));
        value11044 = recovery$indy$flow$915(value11043);
        value11045 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value11044))))));
        value11046 = recovery$indy$flow$917(value11045);
        value11049 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value11040))))));
        value11050 = recovery$indy$flow$919(value11049);
        value11051 = ((java.lang.Object)(((java.lang.Boolean) (((java.lang.Object)(value11050))))));
        value11052 = recovery$indy$flow$921(value11051);
        recovery$indy$flow$922(this, value11052);
        value11057 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value11058 = recovery$indy$flow$924(value11057, value11046, computed13);
        comparison11060 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison11060 < 0) {
            regionValue11062 = value11058;
            break region2580;
        } else {
            break region2545;
        }
        }
        value11077 = recovery$indy$flow$925();
        value11078 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value11077)))).field_44a));
        value11081 = ((java.lang.Object)(((augustus.recovered.modules.legit.SmartClicking_47Cz) (((java.lang.Object)(value11078))))));
        value11082 = recovery$indy$flow$928(value11081, computed53);
        if (value112 == 0) {
            edgeValue11086 = (int) ((value11082 ? 1 : 0));
            regionValue11084 = edgeValue11086;
            break region2579;
        } else {
            edgeValue11098 = (int) ((value11082 ? 1 : 0));
            break region2560;
        }
        }
        break region2562;
        }
        if (edgeValue11098 != 0) {
            break region2578;
        } else {
            break region2563;
        }
        }
        break region2565;
        }
        comparison11133 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison11133 < 0) {
            regionValue11137 = value112;
            break region2577;
        } else {
            break region2571;
        }
        }
        break region2573;
        }
        if (value112 == 0) {
            regionValue11162 = value11058;
            break region2584;
        } else {
            break region2574;
        }
        }
        break region2576;
        }
        regionValue11137 = value11046;
        break region2577;
        }
        if (value11058 == regionValue11137) {
            regionValue11184 = value11058;
            break region2583;
        } else {
            break region2578;
        }
        }
        edgeValue11188 = 0;
        regionValue11084 = edgeValue11188;
        break region2579;
        }
        value11189 = regionValue11084;
        edgeValue11191 = value11189;
        regionValue11062 = edgeValue11191;
        break region2580;
        }
        recovery$indy$flow$929(this, false);
        edgeValue11192 = regionValue11062;
        regionValue11184 = edgeValue11192;
        break region2583;
        }
        edgeValue11193 = regionValue11184;
        regionValue11162 = edgeValue11193;
        break region2584;
        }
        return regionValue11162;
        }
        value11194 = 0;
        value11195 = recovery$indy$flow$930();
        value11197 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11195))))));
        value11198 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11197)))).field_42Y));
        comparison11200 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison11200 < 0) {
            break region2609;
        } else {
            break region2603;
        }
        }
        if (value112 == 0) {
            break region2608;
        } else {
            break region2604;
        }
        }
        break region2606;
        }
        if (value11198 == null) {
            break region2627;
        } else {
            break region2607;
        }
        }
        break region2608;
        }
        break region2609;
        }
        if (value112 == 0) {
            break region2618;
        } else {
            break region2610;
        }
        }
        value11642 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value11198)))).field_49));
        value11643 = recovery$indy$flow$934();
        if (((java.lang.Object) value11642) != ((java.lang.Object) value11643)) {
            break region2627;
        } else {
            break region2613;
        }
        }
        break region2615;
        }
        break region2618;
        }
        value11771 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value11198)))).field_47));
        value11772 = recovery$indy$flow$936(value11771);
        if (value112 == 0) {
            edgeValue11816 = (int) ((value11772 ? 1 : 0));
            regionValue11794 = edgeValue11816;
            break region2626;
        } else {
            edgeValue11860 = (int) ((value11772 ? 1 : 0));
            break region2622;
        }
        }
        if (edgeValue11860 == 0) {
            break region2627;
        } else {
            break region2623;
        }
        }
        break region2625;
        }
        edgeValue11987 = 1;
        regionValue11794 = edgeValue11987;
        break region2626;
        }
        edgeValue12031 = regionValue11794;
        regionValue12009 = edgeValue12031;
        break region2628;
        }
        edgeValue12053 = 0;
        regionValue12009 = edgeValue12053;
        break region2628;
        }
        value12054 = regionValue12009;
        converted12055 = (char) (converted86);
        value12056 = (int) (converted12055);
        value12059 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        recovery$indy$flow$938(value12059, computed82, (char) (value12056));
        if (value112 == 0) {
            edgeValue12099 = value12054;
            regionValue12079 = edgeValue12099;
            break region2656;
        } else {
            edgeValue12139 = value12054;
            regionValue12119 = edgeValue12139;
            break region2648;
        }
        }
        if (regionValue12119 == 0) {
            regionValue12152 = value11194;
            break region3219;
        } else {
            break region2649;
        }
        }
        break region2651;
        }
        value12244 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44Z));
        value12245 = recovery$indy$flow$940(value12244);
        regionValue12079 = value12245;
        break region2656;
        }
        value12266 = regionValue12079;
        value12267 = recovery$indy$flow$941();
        value12268 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value12267)))).field_44a));
        value12271 = ((java.lang.Object)(((augustus.recovered.modules.legit.SmartClicking_47Cz) (((java.lang.Object)(value12268))))));
        value12272 = recovery$indy$flow$944(value12271, computed53);
        comparison12273 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison12273 < 0) {
            edgeValue12313 = value12266;
            edgeValue12314 = (int) ((value12272 ? 1 : 0));
            regionValue12290 = value11194;
            regionValue12292 = edgeValue12313;
            regionValue12293 = edgeValue12314;
            break region2687;
        } else {
            edgeValue12355 = value12266;
            edgeValue12356 = (int) ((value12272 ? 1 : 0));
            regionValue12334 = edgeValue12355;
            break region2675;
        }
        }
        if (value112 == 0) {
            edgeValue12396 = regionValue12334;
            regionValue12374 = value11194;
            regionValue12376 = edgeValue12396;
            regionValue12377 = edgeValue12356;
            break region2686;
        } else {
            edgeValue12436 = regionValue12334;
            regionValue12416 = edgeValue12436;
            break region2676;
        }
        }
        edgeValue12476 = regionValue12416;
        regionValue12456 = edgeValue12476;
        break region2678;
        }
        if (edgeValue12356 == 0) {
            edgeValue12515 = regionValue12456;
            regionValue12494 = value11194;
            regionValue12496 = edgeValue12515;
            break region2683;
        } else {
            edgeValue12551 = regionValue12456;
            regionValue12533 = edgeValue12551;
            break region2679;
        }
        }
        value12552 = 0;
        if (value112 != 0) {
            regionValue12566 = value12552;
            break region3200;
        } else {
            edgeValue12599 = regionValue12533;
            regionValue12494 = value12552;
            regionValue12496 = edgeValue12599;
            break region2683;
        }
        }
        edgeValue12616 = regionValue12494;
        edgeValue12618 = regionValue12496;
        edgeValue12619 = regionValue12496;
        regionValue12374 = edgeValue12616;
        regionValue12376 = edgeValue12618;
        regionValue12377 = edgeValue12619;
        break region2686;
        }
        edgeValue12636 = regionValue12374;
        edgeValue12638 = regionValue12376;
        edgeValue12639 = regionValue12377;
        regionValue12290 = edgeValue12636;
        regionValue12292 = edgeValue12638;
        regionValue12293 = edgeValue12639;
        break region2687;
        }
        comparison12641 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison12641 < 0) {
            edgeValue12674 = regionValue12290;
            edgeValue12676 = regionValue12293;
            regionValue12656 = edgeValue12674;
            regionValue12658 = edgeValue12676;
            break region2881;
        } else {
            edgeValue12715 = regionValue12290;
            edgeValue12717 = regionValue12292;
            edgeValue12718 = regionValue12293;
            regionValue12694 = edgeValue12715;
            regionValue12696 = edgeValue12717;
            regionValue12697 = edgeValue12718;
            break region2691;
        }
        }
        if (value112 == 0) {
            edgeValue12751 = regionValue12694;
            edgeValue12753 = regionValue12697;
            regionValue12734 = edgeValue12751;
            regionValue12736 = edgeValue12753;
            break region2880;
        } else {
            edgeValue12790 = regionValue12694;
            edgeValue12792 = regionValue12696;
            edgeValue12793 = regionValue12697;
            regionValue12770 = edgeValue12790;
            regionValue12772 = edgeValue12792;
            regionValue12773 = edgeValue12793;
            break region2692;
        }
        }
        edgeValue12830 = regionValue12770;
        edgeValue12832 = regionValue12772;
        edgeValue12833 = regionValue12773;
        regionValue12810 = edgeValue12830;
        regionValue12812 = edgeValue12832;
        regionValue12813 = edgeValue12833;
        break region2694;
        }
        value12834 = recovery$indy$flow$945(this);
        if (regionValue12813 == value12834) {
            edgeValue12865 = regionValue12810;
            regionValue12849 = edgeValue12865;
            break region2851;
        } else {
            edgeValue12902 = regionValue12810;
            edgeValue12904 = regionValue12812;
            regionValue12883 = edgeValue12902;
            regionValue12885 = edgeValue12904;
            break region2697;
        }
        }
        edgeValue12940 = regionValue12883;
        edgeValue12942 = regionValue12885;
        regionValue12921 = edgeValue12940;
        regionValue12923 = edgeValue12942;
        break region2699;
        }
        if (value112 == 0) {
            edgeValue12971 = regionValue12921;
            edgeValue12974 = regionValue12923;
            regionValue12955 = edgeValue12971;
            regionValue12958 = edgeValue12974;
            break region3202;
        } else {
            edgeValue13012 = regionValue12921;
            edgeValue13014 = regionValue12923;
            edgeValue13016 = regionValue12923;
            regionValue12991 = edgeValue13012;
            regionValue12993 = edgeValue13014;
            regionValue12995 = edgeValue13016;
            break region2703;
        }
        }
        edgeValue13054 = regionValue12991;
        edgeValue13056 = regionValue12993;
        edgeValue13058 = regionValue12995;
        regionValue13033 = edgeValue13054;
        regionValue13035 = edgeValue13056;
        regionValue13037 = edgeValue13058;
        break region2705;
        }
        value13059 = regionValue13037;
        comparison13060 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison13060 <= 0) {
            edgeValue13088 = regionValue13033;
            regionValue13073 = edgeValue13088;
            break region3201;
        } else {
            edgeValue13128 = regionValue13035;
            edgeValue13129 = value13059;
            regionValue13108 = edgeValue13128;
            regionValue13109 = edgeValue13129;
            break region2710;
        }
        }
        converted13131 = (short) (converted61);
        converted13132 = (short) (converted65);
        value13134 = (int) (converted13132);
        value13135 = regionValue13109;
        value13136 = (int) (converted13131);
        value13138 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13139 = recovery$indy$flow$947(value13138, (short) (value13136), value13135, (short) (value13134), converted69);
        computed13140 = regionValue13108 * 4;
        value13144 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13145 = recovery$indy$flow$949(value13144, computed45, computed13140);
        value13149 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13150 = recovery$indy$flow$951(value13149, value13145, computed13);
        value13154 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value13139))))));
        value13155 = recovery$indy$flow$953(value13154, value13150, computed100);
        if (value13155 <= 0) {
            regionValue12566 = value13155;
            break region3200;
        } else {
            edgeValue13205 = regionValue13108;
            regionValue13187 = edgeValue13205;
            break region2781;
        }
        }
        computed13207 = regionValue13187 + 11;
        value13211 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13212 = recovery$indy$flow$955(value13211, computed13207, computed11);
        computed13213 = regionValue13187 * 4;
        computed13214 = computed13213 + 2;
        value13218 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13219 = recovery$indy$flow$957(value13218, computed49, computed13214);
        value13223 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13224 = recovery$indy$flow$959(value13223, value13219, computed13);
        value13228 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value13212))))));
        value13229 = recovery$indy$flow$961(value13228, value13224, computed100);
        computed13230 = value13155 + value13229;
        if (value112 != 0) {
            regionValue12566 = computed13230;
            break region3200;
        } else {
            regionValue12849 = computed13230;
            break region2851;
        }
        }
        value13262 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48S));
        value13263 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSFirstHitRecalculateTickDelay));
        value13265 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13263))))));
        value13266 = recovery$indy$flow$965(value13265);
        value13270 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value13262))))));
        value13271 = recovery$indy$flow$967(value13270, computed71, value13266);
        edgeValue13286 = regionValue12849;
        edgeValue13288 = (int) ((value13271 ? 1 : 0));
        regionValue12734 = edgeValue13286;
        regionValue12736 = edgeValue13288;
        break region2880;
        }
        edgeValue13303 = regionValue12734;
        edgeValue13305 = regionValue12736;
        regionValue12656 = edgeValue13303;
        regionValue12658 = edgeValue13305;
        break region2881;
        }
        comparison13307 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison13307 <= 0) {
            edgeValue13340 = regionValue12656;
            edgeValue13342 = regionValue12658;
            regionValue13322 = edgeValue13340;
            regionValue13324 = edgeValue13342;
            break region2973;
        } else {
            edgeValue13376 = regionValue12656;
            edgeValue13378 = regionValue12658;
            regionValue13358 = edgeValue13376;
            regionValue13360 = edgeValue13378;
            break region2885;
        }
        }
        if (value112 == 0) {
            edgeValue13411 = regionValue13358;
            edgeValue13413 = regionValue13360;
            regionValue13394 = edgeValue13411;
            regionValue13396 = edgeValue13413;
            break region2972;
        } else {
            edgeValue13445 = regionValue13358;
            edgeValue13447 = regionValue13360;
            regionValue13428 = edgeValue13445;
            regionValue13430 = edgeValue13447;
            break region2886;
        }
        }
        edgeValue13479 = regionValue13428;
        edgeValue13481 = regionValue13430;
        regionValue13462 = edgeValue13479;
        regionValue13464 = edgeValue13481;
        break region2888;
        }
        if (regionValue13464 == 0) {
            edgeValue13512 = regionValue13462;
            regionValue13496 = edgeValue13512;
            break region2945;
        } else {
            edgeValue13544 = regionValue13462;
            regionValue13528 = edgeValue13544;
            break region2889;
        }
        }
        value13546 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48S));
        value13548 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value13546))))));
        recovery$indy$flow$970(value13548);
        value13549 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSFirstHitRecalculateTickDelay));
        converted13550 = (short) (converted90);
        converted13551 = (char) (converted94);
        value13553 = (int) (converted13551);
        value13554 = (int) (converted13550);
        value13556 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13549))))));
        value13557 = recovery$indy$flow$973(value13556, (short) (value13554), (char) (value13553), converted98);
        value13558 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSFirstHit));
        converted13559 = (short) (converted90);
        converted13560 = (char) (converted94);
        value13562 = (int) (converted13560);
        value13563 = (int) (converted13559);
        value13565 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13558))))));
        value13566 = recovery$indy$flow$976(value13565, (short) (value13563), (char) (value13562), converted98);
        edgeValue13581 = regionValue13528;
        regionValue13496 = edgeValue13581;
        break region2945;
        }
        value13583 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44p));
        value13584 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSFirstHitRecalculateTickDelay));
        value13586 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13584))))));
        value13587 = recovery$indy$flow$980(value13586);
        value13591 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value13583))))));
        value13592 = recovery$indy$flow$982(value13591, computed71, value13587);
        edgeValue13607 = regionValue13496;
        edgeValue13609 = (int) ((value13592 ? 1 : 0));
        regionValue13394 = edgeValue13607;
        regionValue13396 = edgeValue13609;
        break region2972;
        }
        edgeValue13624 = regionValue13394;
        edgeValue13626 = regionValue13396;
        regionValue13322 = edgeValue13624;
        regionValue13324 = edgeValue13626;
        break region2973;
        }
        if (value112 == 0) {
            edgeValue13659 = regionValue13322;
            edgeValue13661 = regionValue13324;
            regionValue13642 = edgeValue13659;
            regionValue13644 = edgeValue13661;
            break region3103;
        } else {
            edgeValue13693 = regionValue13322;
            edgeValue13695 = regionValue13324;
            regionValue13676 = edgeValue13693;
            regionValue13678 = edgeValue13695;
            break region2974;
        }
        }
        if (regionValue13678 == 0) {
            edgeValue13726 = regionValue13676;
            regionValue13710 = edgeValue13726;
            break region3031;
        } else {
            edgeValue13758 = regionValue13676;
            regionValue13742 = edgeValue13758;
            break region2975;
        }
        }
        value13760 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44p));
        value13762 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value13760))))));
        recovery$indy$flow$985(value13762);
        value13763 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSFirstHitRecalculateTickDelay));
        converted13764 = (short) (converted90);
        converted13765 = (char) (converted94);
        value13767 = (int) (converted13765);
        value13768 = (int) (converted13764);
        value13770 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13763))))));
        value13771 = recovery$indy$flow$988(value13770, (short) (value13768), (char) (value13767), converted98);
        value13772 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSFirstHit));
        converted13773 = (short) (converted90);
        converted13774 = (char) (converted94);
        value13776 = (int) (converted13774);
        value13777 = (int) (converted13773);
        value13779 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13772))))));
        value13780 = recovery$indy$flow$991(value13779, (short) (value13777), (char) (value13776), converted98);
        edgeValue13795 = regionValue13742;
        regionValue13710 = edgeValue13795;
        break region3031;
        }
        comparison13797 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison13797 <= 0) {
            edgeValue13827 = regionValue13710;
            edgeValue13830 = 22;
            regionValue13810 = edgeValue13827;
            regionValue13813 = edgeValue13830;
            break region3203;
        } else {
            edgeValue13865 = regionValue13710;
            edgeValue13868 = 22;
            regionValue13846 = edgeValue13865;
            break region3038;
        }
        }
        if (value112 == 0) {
            edgeValue13882 = regionValue13846;
            regionValue12955 = edgeValue13882;
            regionValue12958 = edgeValue13868;
            break region3202;
        } else {
            break region3039;
        }
        }
        break region3041;
        }
        converted13955 = (short) (converted61);
        converted13956 = (short) (converted65);
        value13958 = (int) (converted13956);
        value13960 = (int) (converted13955);
        value13962 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13963 = recovery$indy$flow$993(value13962, (short) (value13960), edgeValue13868, (short) (value13958), converted69);
        value13964 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSFirstHit));
        value13966 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value13964))))));
        value13967 = recovery$indy$flow$996(value13966);
        value13971 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value13972 = recovery$indy$flow$998(value13971, value13967, computed13);
        value13976 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value13963))))));
        value13977 = recovery$indy$flow$1000(value13976, value13972, computed100);
        regionValue13642 = value13977;
        regionValue13644 = value13977;
        break region3103;
        }
        if (regionValue13644 <= 0) {
            edgeValue14009 = regionValue13642;
            regionValue12566 = edgeValue14009;
            break region3200;
        } else {
            edgeValue14040 = regionValue13642;
            regionValue14024 = edgeValue14040;
            break region3104;
        }
        }
        value14043 = 23;
        value14045 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value14046 = recovery$indy$flow$1002(value14045, value14043, computed11);
        if (value112 == 0) {
            edgeValue14079 = regionValue14024;
            regionValue14061 = edgeValue14079;
            break region3163;
        } else {
            edgeValue14117 = regionValue14024;
            regionValue14098 = edgeValue14117;
            break region3124;
        }
        }
        edgeValue14155 = regionValue14098;
        regionValue14136 = edgeValue14155;
        break region3126;
        }
        value14159 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartMode));
        value14162 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value14159))))));
        value14163 = recovery$indy$flow$1005(value14162, computed73);
        value14164 = recovery$indy$flow$1006(value14163, "Recommended");
        comparison14165 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison14165 < 0) {
            edgeValue14198 = regionValue14136;
            edgeValue14201 = (int) ((value14164 ? 1 : 0));
            regionValue14180 = edgeValue14198;
            regionValue14183 = edgeValue14201;
            break region3161;
        } else {
            edgeValue14234 = regionValue14136;
            edgeValue14237 = (int) ((value14164 ? 1 : 0));
            regionValue14216 = edgeValue14234;
            break region3144;
        }
        }
        edgeValue14270 = regionValue14216;
        regionValue14252 = edgeValue14270;
        break region3146;
        }
        if (edgeValue14237 == 0) {
            edgeValue14305 = regionValue14252;
            regionValue14288 = edgeValue14305;
            break region3162;
        } else {
            edgeValue14339 = regionValue14252;
            regionValue14322 = edgeValue14339;
            break region3147;
        }
        }
        edgeValue14373 = regionValue14322;
        regionValue14356 = edgeValue14373;
        break region3149;
        }
        value14376 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPS));
        value14378 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value14376))))));
        value14379 = recovery$indy$flow$1009(value14378);
        edgeValue14394 = regionValue14356;
        regionValue14180 = edgeValue14394;
        regionValue14183 = value14379;
        break region3161;
        }
        edgeValue14430 = regionValue14180;
        edgeValue14433 = regionValue14183;
        regionValue14412 = edgeValue14430;
        regionValue14415 = edgeValue14433;
        break region3172;
        }
        edgeValue14448 = regionValue14288;
        regionValue14061 = edgeValue14448;
        break region3163;
        }
        value14452 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSFirstHit));
        value14454 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value14452))))));
        value14455 = recovery$indy$flow$1012(value14454);
        edgeValue14470 = regionValue14061;
        regionValue14412 = edgeValue14470;
        regionValue14415 = value14455;
        break region3172;
        }
        value14475 = regionValue14415;
        value14477 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value14478 = recovery$indy$flow$1014(value14477, value14475, computed13);
        value14482 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value14046))))));
        value14483 = recovery$indy$flow$1016(value14482, value14478, computed100);
        computed14484 = regionValue14412 + value14483;
        regionValue12566 = computed14484;
        break region3200;
        }
        edgeValue14512 = regionValue12566;
        regionValue13073 = edgeValue14512;
        break region3201;
        }
        edgeValue14527 = regionValue13073;
        edgeValue14530 = regionValue13073;
        regionValue12955 = edgeValue14527;
        regionValue12958 = edgeValue14530;
        break region3202;
        }
        edgeValue14543 = regionValue12955;
        edgeValue14546 = regionValue12958;
        regionValue13810 = edgeValue14543;
        regionValue13813 = edgeValue14546;
        break region3203;
        }
        if (value112 == 0) {
            edgeValue14576 = regionValue13810;
            edgeValue14579 = regionValue13813;
            regionValue14560 = edgeValue14576;
            regionValue14563 = edgeValue14579;
            break region3214;
        } else {
            edgeValue14608 = regionValue13810;
            edgeValue14611 = regionValue13813;
            regionValue14592 = edgeValue14608;
            regionValue14595 = edgeValue14611;
            break region3204;
        }
        }
        if (regionValue14595 <= 0) {
            edgeValue14639 = regionValue14592;
            regionValue14624 = edgeValue14639;
            break region3215;
        } else {
            edgeValue14669 = regionValue14592;
            regionValue14654 = edgeValue14669;
            break region3205;
        }
        }
        value14672 = recovery$indy$flow$1017(this);
        computed14673 = value14672 + 1;
        recovery$indy$flow$1018(this, computed14673);
        edgeValue14686 = regionValue14654;
        regionValue14560 = edgeValue14686;
        regionValue14563 = computed14673;
        break region3214;
        }
        edgeValue14718 = regionValue14560;
        edgeValue14721 = regionValue14563;
        regionValue14702 = edgeValue14718;
        regionValue14705 = edgeValue14721;
        break region3216;
        }
        edgeValue14734 = regionValue14624;
        edgeValue14737 = 0;
        regionValue14702 = edgeValue14734;
        regionValue14705 = edgeValue14737;
        break region3216;
        }
        recovery$indy$flow$1019(this, regionValue14705);
        if (value112 != 0) {
            edgeValue14745 = regionValue14702;
            regionValue14741 = edgeValue14745;
            break region3797;
        } else {
            edgeValue14758 = regionValue14702;
            regionValue12152 = edgeValue14758;
            break region3219;
        }
        }
        if (value112 == 0) {
            edgeValue14786 = regionValue12152;
            regionValue14772 = edgeValue14786;
            break region3228;
        } else {
            edgeValue14815 = regionValue12152;
            regionValue14800 = edgeValue14815;
            break region3222;
        }
        }
        edgeValue14845 = regionValue14800;
        regionValue14830 = edgeValue14845;
        break region3224;
        }
        if (value11198 == null) {
            edgeValue14873 = regionValue14830;
            regionValue14860 = edgeValue14873;
            break region3231;
        } else {
            edgeValue14900 = regionValue14830;
            regionValue14886 = edgeValue14900;
            break region3225;
        }
        }
        edgeValue14928 = regionValue14886;
        regionValue14914 = edgeValue14928;
        break region3227;
        }
        edgeValue14942 = regionValue14914;
        regionValue14772 = edgeValue14942;
        break region3228;
        }
        value14944 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value11198)))).field_49));
        value14945 = recovery$indy$flow$1021();
        if (((java.lang.Object) value14944) != ((java.lang.Object) value14945)) {
            edgeValue14971 = regionValue14772;
            regionValue14958 = edgeValue14971;
            break region3519;
        } else {
            edgeValue14984 = regionValue14772;
            regionValue14860 = edgeValue14984;
            break region3231;
        }
        }
        value14985 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48l));
        value14986 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSInAirRecalculateTickDelay));
        value14988 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value14986))))));
        value14989 = recovery$indy$flow$1025(value14988);
        value14993 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value14985))))));
        value14994 = recovery$indy$flow$1027(value14993, computed71, value14989);
        comparison14995 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison14995 <= 0) {
            edgeValue15023 = regionValue14860;
            edgeValue15024 = (int) ((value14994 ? 1 : 0));
            regionValue15008 = edgeValue15023;
            regionValue15009 = edgeValue15024;
            break region3353;
        } else {
            edgeValue15053 = regionValue14860;
            edgeValue15054 = (int) ((value14994 ? 1 : 0));
            regionValue15038 = edgeValue15053;
            break region3263;
        }
        }
        edgeValue15083 = regionValue15038;
        regionValue15068 = edgeValue15083;
        break region3265;
        }
        if (value112 == 0) {
            edgeValue15112 = regionValue15068;
            regionValue15098 = edgeValue15112;
            regionValue15099 = edgeValue15054;
            break region3352;
        } else {
            edgeValue15140 = regionValue15068;
            regionValue15126 = edgeValue15140;
            break region3266;
        }
        }
        edgeValue15168 = regionValue15126;
        regionValue15154 = edgeValue15168;
        break region3268;
        }
        if (edgeValue15054 == 0) {
            edgeValue15195 = regionValue15154;
            regionValue15182 = edgeValue15195;
            break region3325;
        } else {
            edgeValue15221 = regionValue15154;
            regionValue15208 = edgeValue15221;
            break region3269;
        }
        }
        value15222 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48l));
        value15224 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value15222))))));
        recovery$indy$flow$1030(value15224);
        value15225 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSInAirRecalculateTickDelay));
        converted15226 = (short) (converted90);
        converted15227 = (char) (converted94);
        value15229 = (int) (converted15227);
        value15230 = (int) (converted15226);
        value15232 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15225))))));
        value15233 = recovery$indy$flow$1033(value15232, (short) (value15230), (char) (value15229), converted98);
        value15234 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSInAir));
        converted15235 = (short) (converted90);
        converted15236 = (char) (converted94);
        value15238 = (int) (converted15236);
        value15239 = (int) (converted15235);
        value15241 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15234))))));
        value15242 = recovery$indy$flow$1036(value15241, (short) (value15239), (char) (value15238), converted98);
        edgeValue15255 = regionValue15208;
        regionValue15182 = edgeValue15255;
        break region3325;
        }
        value15256 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_444));
        value15257 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDCPSInAirRecalculateTickDelay));
        value15259 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15257))))));
        value15260 = recovery$indy$flow$1040(value15259);
        value15264 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value15256))))));
        value15265 = recovery$indy$flow$1042(value15264, computed71, value15260);
        edgeValue15278 = regionValue15182;
        edgeValue15279 = (int) ((value15265 ? 1 : 0));
        regionValue15098 = edgeValue15278;
        regionValue15099 = edgeValue15279;
        break region3352;
        }
        edgeValue15292 = regionValue15098;
        edgeValue15293 = regionValue15099;
        regionValue15008 = edgeValue15292;
        regionValue15009 = edgeValue15293;
        break region3353;
        }
        if (value112 == 0) {
            edgeValue15321 = regionValue15008;
            edgeValue15322 = regionValue15009;
            regionValue15307 = edgeValue15321;
            regionValue15308 = edgeValue15322;
            break region3469;
        } else {
            edgeValue15349 = regionValue15008;
            edgeValue15350 = regionValue15009;
            regionValue15335 = edgeValue15349;
            regionValue15336 = edgeValue15350;
            break region3354;
        }
        }
        if (regionValue15336 == 0) {
            edgeValue15376 = regionValue15335;
            regionValue15363 = edgeValue15376;
            break region3411;
        } else {
            edgeValue15402 = regionValue15335;
            regionValue15389 = edgeValue15402;
            break region3355;
        }
        }
        value15403 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_444));
        value15405 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value15403))))));
        recovery$indy$flow$1045(value15405);
        value15406 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDCPSInAirRecalculateTickDelay));
        converted15407 = (short) (converted90);
        converted15408 = (char) (converted94);
        value15410 = (int) (converted15408);
        value15411 = (int) (converted15407);
        value15413 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15406))))));
        value15414 = recovery$indy$flow$1048(value15413, (short) (value15411), (char) (value15410), converted98);
        value15415 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSInAir));
        converted15416 = (short) (converted90);
        converted15417 = (char) (converted94);
        value15419 = (int) (converted15417);
        value15420 = (int) (converted15416);
        value15422 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15415))))));
        value15423 = recovery$indy$flow$1051(value15422, (short) (value15420), (char) (value15419), converted98);
        edgeValue15436 = regionValue15389;
        regionValue15363 = edgeValue15436;
        break region3411;
        }
        comparison15437 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison15437 < 0) {
            regionValue15451 = value112;
            break region3424;
        } else {
            edgeValue15493 = regionValue15363;
            regionValue15478 = edgeValue15493;
            break region3417;
        }
        }
        if (value112 == 0) {
            edgeValue15504 = regionValue15478;
            regionValue15499 = edgeValue15504;
            break region3798;
        } else {
            break region3418;
        }
        }
        break region3420;
        }
        converted15558 = (short) (converted61);
        edgeValue15572 = (int) (converted15558);
        regionValue15451 = edgeValue15572;
        break region3424;
        }
        converted15573 = (short) (converted65);
        value15575 = (int) (converted15573);
        value15576 = 24;
        value15577 = regionValue15451;
        value15579 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value15580 = recovery$indy$flow$1053(value15579, (short) (value15577), value15576, (short) (value15575), converted69);
        value15581 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSInAir));
        value15583 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15581))))));
        value15584 = recovery$indy$flow$1056(value15583);
        value15588 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value15580))))));
        value15589 = recovery$indy$flow$1058(value15588, value15584, computed100);
        regionValue15307 = value15589;
        regionValue15308 = value15589;
        break region3469;
        }
        if (regionValue15308 <= 0) {
            edgeValue15608 = regionValue15307;
            regionValue14741 = edgeValue15608;
            break region3797;
        } else {
            edgeValue15634 = regionValue15307;
            regionValue15621 = edgeValue15634;
            break region3470;
        }
        }
        value15636 = 25;
        value15638 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value15639 = recovery$indy$flow$1060(value15638, value15636, computed11);
        value15640 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSInAir));
        value15642 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15640))))));
        value15643 = recovery$indy$flow$1063(value15642);
        value15647 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value15639))))));
        value15648 = recovery$indy$flow$1065(value15647, value15643, computed100);
        computed15649 = regionValue15621 + value15648;
        comparison15651 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison15651 < 0) {
            regionValue15664 = computed15649;
            regionValue15665 = value112;
            break region3548;
        } else {
            break region3516;
        }
        }
        if (value112 != 0) {
            regionValue14741 = computed15649;
            break region3797;
        } else {
            break region3517;
        }
        }
        regionValue14958 = computed15649;
        break region3519;
        }
        value15751 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44d));
        value15752 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSOnWallRecalculateTickDelay));
        value15754 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15752))))));
        value15755 = recovery$indy$flow$1069(value15754);
        value15759 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value15751))))));
        value15760 = recovery$indy$flow$1071(value15759, computed71, value15755);
        edgeValue15773 = regionValue14958;
        edgeValue15774 = (int) ((value15760 ? 1 : 0));
        regionValue15664 = edgeValue15773;
        regionValue15665 = edgeValue15774;
        break region3548;
        }
        comparison15775 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison15775 <= 0) {
            edgeValue15801 = regionValue15664;
            edgeValue15802 = regionValue15665;
            regionValue15787 = edgeValue15801;
            regionValue15788 = edgeValue15802;
            break region3641;
        } else {
            edgeValue15831 = regionValue15664;
            edgeValue15832 = regionValue15665;
            regionValue15816 = edgeValue15831;
            regionValue15817 = edgeValue15832;
            break region3553;
        }
        }
        if (value112 == 0) {
            edgeValue15858 = regionValue15816;
            edgeValue15859 = regionValue15817;
            regionValue15845 = edgeValue15858;
            regionValue15846 = edgeValue15859;
            break region3640;
        } else {
            edgeValue15886 = regionValue15816;
            edgeValue15887 = regionValue15817;
            regionValue15872 = edgeValue15886;
            regionValue15873 = edgeValue15887;
            break region3554;
        }
        }
        edgeValue15914 = regionValue15872;
        edgeValue15915 = regionValue15873;
        regionValue15900 = edgeValue15914;
        regionValue15901 = edgeValue15915;
        break region3556;
        }
        if (regionValue15901 == 0) {
            edgeValue15941 = regionValue15900;
            regionValue15928 = edgeValue15941;
            break region3613;
        } else {
            edgeValue15967 = regionValue15900;
            regionValue15954 = edgeValue15967;
            break region3557;
        }
        }
        value15968 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44d));
        value15970 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value15968))))));
        recovery$indy$flow$1074(value15970);
        value15971 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSOnWallRecalculateTickDelay));
        converted15972 = (short) (converted90);
        converted15973 = (char) (converted94);
        value15975 = (int) (converted15973);
        value15976 = (int) (converted15972);
        value15978 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15971))))));
        value15979 = recovery$indy$flow$1077(value15978, (short) (value15976), (char) (value15975), converted98);
        value15980 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSOnWall));
        converted15981 = (short) (converted90);
        converted15982 = (char) (converted94);
        value15984 = (int) (converted15982);
        value15985 = (int) (converted15981);
        value15987 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value15980))))));
        value15988 = recovery$indy$flow$1080(value15987, (short) (value15985), (char) (value15984), converted98);
        edgeValue16001 = regionValue15954;
        regionValue15928 = edgeValue16001;
        break region3613;
        }
        value16002 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48f));
        value16003 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDCPSOnWallRecalculateTickDelay));
        value16005 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value16003))))));
        value16006 = recovery$indy$flow$1084(value16005);
        value16010 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value16002))))));
        value16011 = recovery$indy$flow$1086(value16010, computed71, value16006);
        edgeValue16023 = regionValue15928;
        edgeValue16024 = (int) ((value16011 ? 1 : 0));
        regionValue15845 = edgeValue16023;
        regionValue15846 = edgeValue16024;
        break region3640;
        }
        edgeValue16036 = regionValue15845;
        edgeValue16037 = regionValue15846;
        regionValue15787 = edgeValue16036;
        regionValue15788 = edgeValue16037;
        break region3641;
        }
        if (value112 == 0) {
            edgeValue16051 = regionValue15787;
            edgeValue16052 = regionValue15788;
            regionValue16044 = edgeValue16051;
            regionValue16045 = edgeValue16052;
            break region3755;
        } else {
            edgeValue16077 = regionValue15787;
            edgeValue16078 = regionValue15788;
            regionValue16064 = edgeValue16077;
            regionValue16065 = edgeValue16078;
            break region3642;
        }
        }
        if (regionValue16065 == 0) {
            edgeValue16096 = regionValue16064;
            regionValue16087 = edgeValue16096;
            break region3699;
        } else {
            edgeValue16120 = regionValue16064;
            regionValue16108 = edgeValue16120;
            break region3643;
        }
        }
        value16121 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48f));
        value16123 = ((java.lang.Object)(((net.C_473X) (((java.lang.Object)(value16121))))));
        recovery$indy$flow$1089(value16123);
        value16124 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingDCPSOnWallRecalculateTickDelay));
        converted16125 = (short) (converted90);
        converted16126 = (char) (converted94);
        value16128 = (int) (converted16126);
        value16129 = (int) (converted16125);
        value16131 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value16124))))));
        value16132 = recovery$indy$flow$1092(value16131, (short) (value16129), (char) (value16128), converted98);
        value16133 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSOnWall));
        converted16134 = (short) (converted90);
        converted16135 = (char) (converted94);
        value16137 = (int) (converted16135);
        value16138 = (int) (converted16134);
        value16140 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value16133))))));
        value16141 = recovery$indy$flow$1095(value16140, (short) (value16138), (char) (value16137), converted98);
        edgeValue16150 = regionValue16108;
        regionValue16087 = edgeValue16150;
        break region3699;
        }
        comparison16151 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16151 < 0) {
            edgeValue16159 = regionValue16087;
            regionValue16154 = edgeValue16159;
            break region3799;
        } else {
            edgeValue16181 = regionValue16087;
            regionValue16170 = edgeValue16181;
            break region3705;
        }
        }
        if (value112 == 0) {
            edgeValue16187 = regionValue16170;
            regionValue15499 = edgeValue16187;
            break region3798;
        } else {
            break region3706;
        }
        }
        break region3708;
        }
        converted16225 = (short) (converted61);
        converted16226 = (short) (converted65);
        value16228 = (int) (converted16226);
        value16229 = 26;
        value16230 = (int) (converted16225);
        value16232 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value16233 = recovery$indy$flow$1097(value16232, (short) (value16230), value16229, (short) (value16228), converted69);
        value16234 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartCPSOnWall));
        value16236 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value16234))))));
        value16237 = recovery$indy$flow$1100(value16236);
        value16241 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value16233))))));
        value16242 = recovery$indy$flow$1102(value16241, value16237, computed100);
        regionValue16044 = value16242;
        regionValue16045 = value16242;
        break region3755;
        }
        if (regionValue16045 <= 0) {
            edgeValue16254 = regionValue16044;
            regionValue14741 = edgeValue16254;
            break region3797;
        } else {
            edgeValue16266 = regionValue16044;
            regionValue16260 = edgeValue16266;
            break region3756;
        }
        }
        value16268 = 27;
        value16270 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value16271 = recovery$indy$flow$1104(value16270, value16268, computed11);
        value16272 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingSmartDCPSOnWall));
        value16274 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value16272))))));
        value16275 = recovery$indy$flow$1107(value16274);
        value16279 = ((java.lang.Object)(((net.C_474k) (((java.lang.Object)(value16271))))));
        value16280 = recovery$indy$flow$1109(value16279, value16275, computed100);
        computed16281 = regionValue16260 + value16280;
        regionValue14741 = computed16281;
        break region3797;
        }
        edgeValue16290 = regionValue14741;
        regionValue15499 = edgeValue16290;
        break region3798;
        }
        edgeValue16294 = regionValue15499;
        regionValue16154 = edgeValue16294;
        break region3799;
        }
        comparison16297 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16297 <= 0) {
            edgeValue16301 = regionValue16154;
            regionValue16298 = edgeValue16301;
            regionValue16300 = value112;
            break region3816;
        } else {
            edgeValue16309 = regionValue16154;
            regionValue16305 = edgeValue16309;
            break region3803;
        }
        }
        if (value112 == 0) {
            edgeValue16316 = regionValue16305;
            regionValue16313 = edgeValue16316;
            break region3813;
        } else {
            edgeValue16322 = regionValue16305;
            regionValue16319 = edgeValue16322;
            break region3804;
        }
        }
        edgeValue16328 = regionValue16319;
        regionValue16325 = edgeValue16328;
        break region3806;
        }
        value16330 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44Z));
        if (value16330 == null) {
            edgeValue16332 = regionValue16325;
            regionValue16331 = edgeValue16332;
            break region3817;
        } else {
            edgeValue16336 = regionValue16325;
            regionValue16334 = edgeValue16336;
            break region3808;
        }
        }
        edgeValue16340 = regionValue16334;
        regionValue16338 = edgeValue16340;
        break region3810;
        }
        edgeValue16342 = regionValue16338;
        regionValue16313 = edgeValue16342;
        break region3813;
        }
        value16344 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_44Z));
        value16345 = recovery$indy$flow$1112(value16344);
        edgeValue16346 = regionValue16313;
        regionValue16298 = edgeValue16346;
        regionValue16300 = value16345;
        break region3816;
        }
        recovery$indy$flow$1113(this, regionValue16300);
        edgeValue16349 = regionValue16298;
        regionValue16331 = edgeValue16349;
        break region3817;
        }
        return regionValue16331;
        }
        edgeValue16350 = 0;
        regionValue4803 = edgeValue16350;
        break region3820;
        }
        return regionValue4803;
        }
        if (edgeValue10425 < 0) {
            break region4335;
        } else {
            break region4043;
        }
        }
        incremented16395 = value10395 + (1);
        edgeValue16423 = 3778927513354721686L;
        regionValue16406 = incremented16395;
        regionValue16408 = computed41;
        regionValue16409 = edgeValue16423;
        break region4049;
        }
        value16424 = recovery$indy$flow$835(this);
        value16425 = recovery$indy$flow$836(this);
        comparison16426 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16426 <= 0) {
            regionValue16406 = value10395;
            regionValue16408 = value16424;
            regionValue16409 = value16425;
            break region4049;
        } else {
            regionValue16451 = value10395;
            regionValue16453 = value16424;
            regionValue16454 = value16425;
            break region2088;
        }
        }
        loop4049: while (true) {
        region4105: {
        region4103: {
        region4100: {
        region4098: {
        value16469 = recovery$indy$flow$820(this, regionValue16408, regionValue16409, computed7);
        value16470 = value16469;
        value16471 = value16470;
        value16472 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value16471))))));
        value16473 = recovery$indy$flow$822(value16472);
        value16474 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value16473))))));
        value16475 = recovery$indy$flow$824(value16474);
        value16476 = value16475;
        value16477 = recovery$indy$flow$825(this);
        recovery$indy$flow$826(this, value16477);
        value16478 = recovery$indy$flow$827(this);
        value16479 = value16470;
        value16480 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value16479))))));
        value16481 = recovery$indy$flow$829(value16480);
        value16482 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value16481))))));
        value16483 = recovery$indy$flow$831(value16482);
        converted16484 = (long) (value16483);
        computed16485 = value16478 + converted16484;
        recovery$indy$flow$832(this, computed16485);
        value16486 = recovery$indy$flow$833(this);
        converted16487 = (long) (value16476);
        computed16488 = value16486 + converted16487;
        recovery$indy$flow$834(this, computed16488);
        comparison16489 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16489 <= 0) {
            edgeValue16512 = regionValue16406;
            regionValue16500 = edgeValue16512;
            break region2105;
        } else {
            edgeValue16536 = regionValue16406;
            regionValue16524 = edgeValue16536;
            break region4098;
        }
        }
        if (value112 == 0) {
            edgeValue16559 = regionValue16524;
            regionValue16548 = edgeValue16559;
            break region2104;
        } else {
            edgeValue16581 = regionValue16524;
            regionValue16570 = edgeValue16581;
            break region4100;
        }
        }
        if (value112 != 0) {
            edgeValue16592 = regionValue16570;
            regionValue10504 = edgeValue16592;
            break region2012;
        } else {
            edgeValue16614 = regionValue16570;
            regionValue16603 = edgeValue16614;
            break region4103;
        }
        }
        edgeValue16636 = regionValue16603;
        regionValue16625 = edgeValue16636;
        break region4105;
        }
        value16637 = recovery$indy$flow$835(this);
        value16638 = recovery$indy$flow$836(this);
        comparison16639 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16639 <= 0) {
            edgeValue16650 = regionValue16625;
            edgeValue16652 = value16637;
            edgeValue16653 = value16638;
            regionValue16406 = edgeValue16650;
            regionValue16408 = edgeValue16652;
            regionValue16409 = edgeValue16653;
            continue loop4049;
        } else {
            edgeValue16664 = regionValue16625;
            edgeValue16666 = value16637;
            edgeValue16667 = value16638;
            regionValue16451 = edgeValue16664;
            regionValue16453 = edgeValue16666;
            regionValue16454 = edgeValue16667;
            break region2088;
        }
        }
        }
        loop2012: while (true) {
        region2026: {
        region4220: {
        region2020: {
        region2019: {
        value16668 = recovery$indy$flow$818(this);
        value16669 = recovery$indy$flow$819(this);
        comparison16670 = (value16668 > value16669 ? 1 : value16668 == value16669 ? 0 : -1);
        edgeValue16693 = regionValue10504;
        edgeValue16694 = comparison16670;
        regionValue16681 = edgeValue16693;
        regionValue16682 = edgeValue16694;
        break region2019;
        }
        if (regionValue16682 < 0) {
            edgeValue16716 = regionValue16681;
            regionValue16705 = edgeValue16716;
            break region4220;
        } else {
            edgeValue16738 = regionValue16681;
            regionValue16727 = edgeValue16738;
            break region2020;
        }
        }
        incremented16739 = regionValue16727 + (1);
        edgeValue16764 = incremented16739;
        edgeValue16767 = 3778927513354721686L;
        regionValue16750 = edgeValue16764;
        regionValue16752 = computed41;
        regionValue16753 = edgeValue16767;
        break region2026;
        }
        value16768 = recovery$indy$flow$835(this);
        value16769 = recovery$indy$flow$836(this);
        comparison16770 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16770 <= 0) {
            edgeValue16781 = regionValue16705;
            edgeValue16783 = value16768;
            edgeValue16784 = value16769;
            regionValue16750 = edgeValue16781;
            regionValue16752 = edgeValue16783;
            regionValue16753 = edgeValue16784;
            break region2026;
        } else {
            edgeValue16795 = regionValue16705;
            edgeValue16797 = value16768;
            edgeValue16798 = value16769;
            regionValue16451 = edgeValue16795;
            regionValue16453 = edgeValue16797;
            regionValue16454 = edgeValue16798;
            break region2088;
        }
        }
        loop2026: while (true) {
        region2079: {
        region2077: {
        region2075: {
        region2074: {
        value16799 = recovery$indy$flow$820(this, regionValue16752, regionValue16753, computed7);
        value16800 = value16799;
        value16801 = value16800;
        value16802 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value16801))))));
        value16803 = recovery$indy$flow$822(value16802);
        value16804 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value16803))))));
        value16805 = recovery$indy$flow$824(value16804);
        value16806 = value16805;
        value16807 = recovery$indy$flow$825(this);
        recovery$indy$flow$826(this, value16807);
        value16808 = recovery$indy$flow$827(this);
        value16809 = value16800;
        value16810 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value16809))))));
        value16811 = recovery$indy$flow$829(value16810);
        value16812 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value16811))))));
        value16813 = recovery$indy$flow$831(value16812);
        converted16814 = (long) (value16813);
        computed16815 = value16808 + converted16814;
        recovery$indy$flow$832(this, computed16815);
        value16816 = recovery$indy$flow$833(this);
        converted16817 = (long) (value16806);
        computed16818 = value16816 + converted16817;
        recovery$indy$flow$834(this, computed16818);
        comparison16819 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16819 <= 0) {
            edgeValue16830 = regionValue16750;
            regionValue16500 = edgeValue16830;
            break region2105;
        } else {
            edgeValue16854 = regionValue16750;
            regionValue16842 = edgeValue16854;
            break region2074;
        }
        }
        if (value112 == 0) {
            edgeValue16866 = regionValue16842;
            regionValue16548 = edgeValue16866;
            break region2104;
        } else {
            edgeValue16888 = regionValue16842;
            regionValue16877 = edgeValue16888;
            break region2075;
        }
        }
        if (value112 != 0) {
            edgeValue16899 = regionValue16877;
            regionValue10504 = edgeValue16899;
            continue loop2012;
        } else {
            edgeValue16921 = regionValue16877;
            regionValue16910 = edgeValue16921;
            break region2077;
        }
        }
        edgeValue16943 = regionValue16910;
        regionValue16932 = edgeValue16943;
        break region2079;
        }
        value16944 = recovery$indy$flow$835(this);
        value16945 = recovery$indy$flow$836(this);
        comparison16946 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison16946 <= 0) {
            edgeValue16957 = regionValue16932;
            edgeValue16959 = value16944;
            edgeValue16960 = value16945;
            regionValue16750 = edgeValue16957;
            regionValue16752 = edgeValue16959;
            regionValue16753 = edgeValue16960;
            continue loop2026;
        } else {
            edgeValue16971 = regionValue16932;
            edgeValue16973 = value16944;
            edgeValue16974 = value16945;
            regionValue16451 = edgeValue16971;
            regionValue16453 = edgeValue16973;
            regionValue16454 = edgeValue16974;
            break region2088;
        }
        }
        }
        }
        comparison16975 = (regionValue16453 > regionValue16454 ? 1 : regionValue16453 == regionValue16454 ? 0 : -1);
        if (value112 == 0) {
            edgeValue16999 = regionValue16451;
            regionValue16986 = edgeValue16999;
            regionValue16988 = comparison16975;
            break region2095;
        } else {
            edgeValue17025 = regionValue16451;
            regionValue17012 = edgeValue17025;
            break region2091;
        }
        }
        if (comparison16975 <= 0) {
            edgeValue17050 = regionValue17012;
            regionValue17038 = edgeValue17050;
            break region2096;
        } else {
            edgeValue17074 = regionValue17012;
            regionValue17062 = edgeValue17074;
            break region2092;
        }
        }
        edgeValue17098 = regionValue17062;
        regionValue17086 = edgeValue17098;
        break region2094;
        }
        edgeValue17110 = regionValue17086;
        edgeValue17112 = 1;
        regionValue16986 = edgeValue17110;
        regionValue16988 = edgeValue17112;
        break region2095;
        }
        edgeValue17136 = regionValue16986;
        edgeValue17138 = regionValue16988;
        regionValue17123 = edgeValue17136;
        regionValue17125 = edgeValue17138;
        break region2097;
        }
        edgeValue17149 = regionValue17038;
        edgeValue17151 = 0;
        regionValue17123 = edgeValue17149;
        regionValue17125 = edgeValue17151;
        break region2097;
        }
        recovery$indy$flow$837(this, ((regionValue17125 & 1) != 0));
        value17152 = recovery$indy$flow$838(this);
        computed17153 = value17152 + 50L;
        recovery$indy$flow$839(this, computed17153);
        edgeValue17164 = regionValue17123;
        regionValue16548 = edgeValue17164;
        break region2104;
        }
        edgeValue17175 = regionValue16548;
        regionValue16500 = edgeValue17175;
        break region2105;
        }
        if (value112 != 0) {
            edgeValue17196 = regionValue16500;
            regionValue17186 = edgeValue17196;
            break region2188;
        } else {
            edgeValue17207 = regionValue16500;
            regionValue10460 = edgeValue17207;
            break region2106;
        }
        }
        value17208 = recovery$indy$flow$840();
        edgeValue17232 = regionValue10460;
        regionValue17220 = edgeValue17232;
        break region2108;
        }
        loop2108: while (true) {
        region2117: {
        region3934: {
        region2113: {
        value17234 = recovery$indy$flow$841(this);
        comparison17235 = (value17208 > value17234 ? 1 : value17208 == value17234 ? 0 : -1);
        if (comparison17235 < 0) {
            edgeValue17258 = regionValue17220;
            regionValue17246 = edgeValue17258;
            break region3934;
        } else {
            edgeValue17282 = regionValue17220;
            regionValue17270 = edgeValue17282;
            break region2113;
        }
        }
        incremented17284 = regionValue17270 + (1);
        edgeValue17310 = incremented17284;
        edgeValue17314 = 3778927513354721686L;
        regionValue17295 = edgeValue17310;
        regionValue17298 = computed41;
        regionValue17299 = edgeValue17314;
        break region2117;
        }
        value17315 = recovery$indy$flow$857(this);
        comparison17316 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison17316 <= 0) {
            edgeValue17327 = regionValue17246;
            edgeValue17330 = value17315;
            regionValue17295 = edgeValue17327;
            regionValue17298 = edgeValue17330;
            regionValue17299 = value17208;
            break region2117;
        } else {
            edgeValue17354 = regionValue17246;
            edgeValue17356 = value17315;
            regionValue17341 = edgeValue17354;
            regionValue17343 = edgeValue17356;
            break region2178;
        }
        }
        loop2117: while (true) {
        region2170: {
        region2168: {
        region2166: {
        region2158: {
        value17358 = recovery$indy$flow$842(this, regionValue17298, regionValue17299, computed7);
        value17359 = value17358;
        value17360 = value17359;
        value17361 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value17360))))));
        value17362 = recovery$indy$flow$844(value17361);
        value17363 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value17362))))));
        value17364 = recovery$indy$flow$846(value17363);
        value17365 = value17364;
        value17366 = recovery$indy$flow$847(this);
        recovery$indy$flow$848(this, value17366);
        value17367 = recovery$indy$flow$849(this);
        value17368 = value17359;
        value17369 = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(value17368))))));
        value17370 = recovery$indy$flow$851(value17369);
        value17371 = ((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(value17370))))));
        value17372 = recovery$indy$flow$853(value17371);
        converted17373 = (long) (value17372);
        computed17374 = value17367 + converted17373;
        recovery$indy$flow$854(this, computed17374);
        comparison17375 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison17375 <= 0) {
            edgeValue17396 = regionValue17295;
            regionValue17385 = edgeValue17396;
            break region2199;
        } else {
            edgeValue17422 = regionValue17295;
            edgeValue17424 = value17365;
            regionValue17408 = edgeValue17422;
            regionValue17410 = edgeValue17424;
            break region2158;
        }
        }
        value17426 = recovery$indy$flow$855(this);
        converted17427 = (long) (regionValue17410);
        computed17428 = value17426 + converted17427;
        recovery$indy$flow$856(this, computed17428);
        if (value112 == 0) {
            edgeValue17448 = regionValue17408;
            regionValue17438 = edgeValue17448;
            break region2198;
        } else {
            edgeValue17471 = regionValue17408;
            regionValue17459 = edgeValue17471;
            break region2166;
        }
        }
        if (value112 != 0) {
            edgeValue17483 = regionValue17459;
            regionValue17220 = edgeValue17483;
            continue loop2108;
        } else {
            edgeValue17507 = regionValue17459;
            regionValue17495 = edgeValue17507;
            break region2168;
        }
        }
        edgeValue17531 = regionValue17495;
        regionValue17519 = edgeValue17531;
        break region2170;
        }
        value17533 = recovery$indy$flow$857(this);
        comparison17534 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison17534 <= 0) {
            edgeValue17545 = regionValue17519;
            edgeValue17548 = value17533;
            regionValue17295 = edgeValue17545;
            regionValue17298 = edgeValue17548;
            regionValue17299 = value17208;
            continue loop2117;
        } else {
            edgeValue17559 = regionValue17519;
            edgeValue17561 = value17533;
            regionValue17341 = edgeValue17559;
            regionValue17343 = edgeValue17561;
            break region2178;
        }
        }
        }
        }
        comparison17563 = (regionValue17343 > value17208 ? 1 : regionValue17343 == value17208 ? 0 : -1);
        if (value112 == 0) {
            edgeValue17585 = regionValue17341;
            regionValue17573 = edgeValue17585;
            regionValue17575 = comparison17563;
            break region2185;
        } else {
            edgeValue17609 = regionValue17341;
            regionValue17597 = edgeValue17609;
            break region2181;
        }
        }
        if (comparison17563 <= 0) {
            edgeValue17632 = regionValue17597;
            regionValue17621 = edgeValue17632;
            break region2186;
        } else {
            edgeValue17654 = regionValue17597;
            regionValue17643 = edgeValue17654;
            break region2182;
        }
        }
        edgeValue17676 = regionValue17643;
        regionValue17665 = edgeValue17676;
        break region2184;
        }
        edgeValue17687 = regionValue17665;
        edgeValue17689 = 1;
        regionValue17573 = edgeValue17687;
        regionValue17575 = edgeValue17689;
        break region2185;
        }
        edgeValue17711 = regionValue17573;
        edgeValue17713 = regionValue17575;
        regionValue17699 = edgeValue17711;
        regionValue17701 = edgeValue17713;
        break region2187;
        }
        edgeValue17723 = regionValue17621;
        edgeValue17725 = 0;
        regionValue17699 = edgeValue17723;
        regionValue17701 = edgeValue17725;
        break region2187;
        }
        recovery$indy$flow$858(this, ((regionValue17701 & 1) != 0));
        edgeValue17735 = regionValue17699;
        regionValue17186 = edgeValue17735;
        break region2188;
        }
        value17736 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48H));
        value17738 = ((java.lang.Object)(((net.C_40d) (((java.lang.Object)(value17736))))));
        recovery$indy$flow$861(value17738);
        edgeValue17748 = regionValue17186;
        regionValue17438 = edgeValue17748;
        break region2198;
        }
        edgeValue17758 = regionValue17438;
        regionValue17385 = edgeValue17758;
        break region2199;
        }
        value17760 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48H));
        value17763 = ((java.lang.Object)(((net.C_40d) (((java.lang.Object)(value17760))))));
        value17764 = recovery$indy$flow$864(value17763, computed55);
        arrayValue17766 = ((float[]) value17764)[0];
        arrayValue17767 = ((float[]) value17764)[1];
        value17768 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48k));
        arrayValue17769 = ((float[]) value17768)[0];
        converted17770 = (byte) (converted37);
        value17771 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48k));
        arrayValue17772 = ((float[]) value17771)[1];
        value17773 = recovery$indy$flow$867(arrayValue17766, arrayValue17767, converted29, converted33, converted17770, arrayValue17769, arrayValue17772);
        recovery$indy$flow$868(this, value17773);
        value17774 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48k));
        arrayValue17775 = ((float[]) value17764)[0];
        ((float[]) value17774)[0] = arrayValue17775;
        value17776 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).field_48k));
        arrayValue17777 = ((float[]) value17764)[1];
        ((float[]) value17776)[1] = arrayValue17777;
        value17778 = regionValue17385;
        value17780 = regionValue17385;
        value17782 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this))))));
        value17783 = recovery$indy$flow$872(value17782, value17780, computed13);
        comparison17785 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison17785 < 0) {
            regionValue17787 = value17783;
            break region2311;
        } else {
            edgeValue17801 = value17778;
            regionValue17795 = edgeValue17801;
            break region2276;
        }
        }
        value17802 = recovery$indy$flow$873();
        value17803 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value17802)))).field_44a));
        value17806 = ((java.lang.Object)(((augustus.recovered.modules.legit.SmartClicking_47Cz) (((java.lang.Object)(value17803))))));
        value17807 = recovery$indy$flow$876(value17806, computed53);
        if (value112 == 0) {
            edgeValue17811 = (int) ((value17807 ? 1 : 0));
            regionValue17809 = edgeValue17811;
            break region2310;
        } else {
            edgeValue17822 = regionValue17795;
            edgeValue17823 = (int) ((value17807 ? 1 : 0));
            regionValue17816 = edgeValue17822;
            break region2291;
        }
        }
        edgeValue17834 = regionValue17816;
        regionValue17828 = edgeValue17834;
        break region2293;
        }
        if (edgeValue17823 != 0) {
            break region2309;
        } else {
            edgeValue17847 = regionValue17828;
            regionValue17842 = edgeValue17847;
            break region2294;
        }
        }
        edgeValue17857 = regionValue17842;
        regionValue17852 = edgeValue17857;
        break region2296;
        }
        comparison17858 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison17858 < 0) {
            regionValue17862 = value112;
            break region2308;
        } else {
            edgeValue17874 = regionValue17852;
            regionValue17869 = edgeValue17874;
            break region2302;
        }
        }
        edgeValue17884 = regionValue17869;
        regionValue17879 = edgeValue17884;
        break region2304;
        }
        if (value112 == 0) {
            regionValue17887 = value17783;
            break region2315;
        } else {
            edgeValue17895 = regionValue17879;
            regionValue17891 = edgeValue17895;
            break region2305;
        }
        }
        edgeValue17903 = regionValue17891;
        regionValue17899 = edgeValue17903;
        break region2307;
        }
        edgeValue17908 = regionValue17899;
        regionValue17862 = edgeValue17908;
        break region2308;
        }
        if (value17783 == regionValue17862) {
            regionValue17909 = value17783;
            break region2314;
        } else {
            break region2309;
        }
        }
        edgeValue17913 = 0;
        regionValue17809 = edgeValue17913;
        break region2310;
        }
        value17914 = regionValue17809;
        edgeValue17916 = value17914;
        regionValue17787 = edgeValue17916;
        break region2311;
        }
        recovery$indy$flow$877(this, false);
        edgeValue17917 = regionValue17787;
        regionValue17909 = edgeValue17917;
        break region2314;
        }
        edgeValue17918 = regionValue17909;
        regionValue17887 = edgeValue17918;
        break region2315;
        }
        return regionValue17887;
    }


































   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 27657970315269L;
      long var3 = var1 ^ 112880819688845L;
      long var10002 = 1179013887377278320L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Recorded");
   }



    private int method_45$bde84e76b3(int a0,int a1,byte a2) {
        int constructorPart1 = a0;
        int constructorPart2 = a1;
        int constructorPart3 = a2;
        java.lang.Object regionValue38;
        int regionValue39;
        int regionValue40;
        int regionValue41;
        long regionValue42;
        long regionValue43;
        long regionValue44;
        int regionValue45;
        long regionValue46;
        long regionValue47;
        long regionValue48;
        long regionValue49;
        long regionValue50;
        int regionValue51;
        java.lang.Object regionValue52;
        java.lang.Object regionValue68;
        int regionValue69;
        int regionValue70;
        int regionValue71;
        long regionValue72;
        long regionValue73;
        long regionValue74;
        int regionValue75;
        long regionValue76;
        long regionValue77;
        long regionValue78;
        long regionValue79;
        long regionValue80;
        int regionValue81;
        java.lang.Object regionValue82;
        java.lang.Object regionValue99;
        int regionValue100;
        int regionValue101;
        int regionValue102;
        long regionValue103;
        long regionValue104;
        long regionValue105;
        int regionValue106;
        long regionValue107;
        long regionValue108;
        long regionValue109;
        long regionValue110;
        long regionValue111;
        int regionValue112;
        java.lang.Object regionValue113;
        java.lang.Object regionValue129;
        int regionValue130;
        int regionValue131;
        int regionValue132;
        long regionValue133;
        long regionValue134;
        long regionValue135;
        int regionValue136;
        long regionValue137;
        long regionValue138;
        long regionValue139;
        long regionValue140;
        long regionValue141;
        int regionValue142;
        java.lang.Object regionValue143;
        java.lang.Object regionValue159;
        int regionValue160;
        int regionValue161;
        int regionValue162;
        long regionValue163;
        long regionValue164;
        long regionValue165;
        int regionValue166;
        long regionValue167;
        long regionValue168;
        long regionValue169;
        long regionValue170;
        long regionValue171;
        int regionValue172;
        java.lang.Object regionValue173;
        java.lang.Object regionValue189;
        int regionValue190;
        int regionValue191;
        int regionValue192;
        long regionValue193;
        long regionValue194;
        long regionValue195;
        int regionValue196;
        long regionValue197;
        long regionValue198;
        long regionValue199;
        long regionValue200;
        long regionValue201;
        int regionValue202;
        java.lang.Object regionValue217;
        int regionValue218;
        int regionValue219;
        int regionValue220;
        long regionValue221;
        long regionValue222;
        long regionValue223;
        int regionValue224;
        long regionValue225;
        long regionValue226;
        long regionValue227;
        long regionValue228;
        long regionValue229;
        int regionValue230;
        java.lang.Object regionValue245;
        int regionValue246;
        int regionValue247;
        int regionValue248;
        long regionValue249;
        long regionValue250;
        long regionValue251;
        int regionValue252;
        long regionValue253;
        long regionValue254;
        long regionValue255;
        long regionValue256;
        long regionValue257;
        int regionValue258;
        java.lang.Object regionValue290;
        int regionValue291;
        int regionValue292;
        int regionValue293;
        long regionValue294;
        long regionValue295;
        long regionValue296;
        int regionValue297;
        long regionValue298;
        long regionValue299;
        long regionValue300;
        long regionValue301;
        long regionValue302;
        int regionValue303;
        int regionValue304;
        int regionValue305;
        java.lang.Object regionValue322;
        int regionValue323;
        int regionValue324;
        int regionValue325;
        long regionValue326;
        long regionValue327;
        long regionValue328;
        int regionValue329;
        long regionValue330;
        long regionValue331;
        long regionValue332;
        long regionValue333;
        long regionValue334;
        int regionValue335;
        int regionValue336;
        int regionValue337;
        java.lang.Object regionValue354;
        int regionValue355;
        int regionValue356;
        int regionValue357;
        long regionValue358;
        long regionValue359;
        long regionValue360;
        int regionValue361;
        long regionValue362;
        long regionValue363;
        long regionValue364;
        long regionValue365;
        int regionValue366;
        int regionValue367;
        java.lang.Object regionValue382;
        int regionValue383;
        int regionValue384;
        int regionValue385;
        long regionValue386;
        long regionValue387;
        long regionValue388;
        int regionValue389;
        long regionValue390;
        long regionValue391;
        long regionValue392;
        long regionValue393;
        long regionValue394;
        int regionValue395;
        int regionValue396;
        java.lang.Object regionValue412;
        int regionValue413;
        int regionValue414;
        int regionValue415;
        long regionValue416;
        long regionValue417;
        long regionValue418;
        int regionValue419;
        long regionValue420;
        long regionValue421;
        long regionValue422;
        long regionValue423;
        long regionValue424;
        int regionValue425;
        int regionValue426;
        java.lang.Object regionValue472;
        int regionValue473;
        int regionValue474;
        int regionValue475;
        long regionValue476;
        long regionValue477;
        long regionValue478;
        int regionValue479;
        long regionValue480;
        long regionValue481;
        long regionValue482;
        long regionValue483;
        long regionValue484;
        int regionValue485;
        java.lang.Object regionValue546;
        int regionValue547;
        int regionValue548;
        int regionValue549;
        long regionValue550;
        long regionValue551;
        long regionValue552;
        int regionValue553;
        long regionValue554;
        long regionValue555;
        long regionValue556;
        long regionValue557;
        int regionValue558;
        int regionValue559;
        int regionValue560;
        int regionValue561;
        java.lang.Object regionValue578;
        int regionValue579;
        int regionValue580;
        int regionValue581;
        long regionValue582;
        long regionValue583;
        long regionValue584;
        int regionValue585;
        long regionValue586;
        long regionValue587;
        long regionValue588;
        long regionValue589;
        int regionValue590;
        int regionValue591;
        int regionValue592;
        int regionValue593;
        java.lang.Object regionValue610;
        int regionValue611;
        int regionValue612;
        int regionValue613;
        long regionValue614;
        long regionValue615;
        long regionValue616;
        int regionValue617;
        long regionValue618;
        long regionValue619;
        long regionValue620;
        long regionValue621;
        int regionValue622;
        int regionValue623;
        int regionValue624;
        java.lang.Object regionValue640;
        int regionValue641;
        int regionValue642;
        int regionValue643;
        long regionValue644;
        long regionValue645;
        long regionValue646;
        int regionValue647;
        long regionValue648;
        long regionValue649;
        long regionValue650;
        long regionValue651;
        int regionValue652;
        int regionValue653;
        int regionValue654;
        java.lang.Object regionValue670;
        int regionValue671;
        int regionValue672;
        int regionValue673;
        long regionValue674;
        long regionValue675;
        long regionValue676;
        int regionValue677;
        long regionValue678;
        long regionValue679;
        long regionValue680;
        long regionValue681;
        int regionValue682;
        int regionValue683;
        int regionValue684;
        java.lang.Object regionValue700;
        int regionValue701;
        int regionValue702;
        int regionValue703;
        long regionValue704;
        long regionValue705;
        long regionValue706;
        int regionValue707;
        long regionValue708;
        long regionValue709;
        long regionValue710;
        long regionValue711;
        int regionValue712;
        int regionValue713;
        java.lang.Object regionValue728;
        int regionValue729;
        int regionValue730;
        int regionValue731;
        long regionValue732;
        long regionValue733;
        long regionValue734;
        int regionValue735;
        long regionValue736;
        long regionValue737;
        long regionValue738;
        long regionValue739;
        int regionValue740;
        int regionValue741;
        java.lang.Object regionValue756;
        int regionValue757;
        int regionValue758;
        int regionValue759;
        long regionValue760;
        long regionValue761;
        long regionValue762;
        int regionValue763;
        long regionValue764;
        long regionValue765;
        long regionValue766;
        long regionValue767;
        int regionValue768;
        int regionValue769;
        int regionValue770;
        java.lang.Object regionValue786;
        int regionValue787;
        int regionValue788;
        int regionValue789;
        long regionValue790;
        long regionValue791;
        long regionValue792;
        int regionValue793;
        long regionValue794;
        long regionValue795;
        long regionValue796;
        long regionValue797;
        int regionValue798;
        int regionValue799;
        int regionValue800;
        java.lang.Object regionValue816;
        int regionValue817;
        int regionValue818;
        int regionValue819;
        long regionValue820;
        long regionValue821;
        long regionValue822;
        int regionValue823;
        long regionValue824;
        long regionValue825;
        long regionValue826;
        long regionValue827;
        int regionValue828;
        int regionValue829;
        int regionValue830;
        java.lang.Object regionValue846;
        int regionValue847;
        int regionValue848;
        int regionValue849;
        long regionValue850;
        long regionValue851;
        long regionValue852;
        int regionValue853;
        long regionValue854;
        long regionValue855;
        long regionValue856;
        long regionValue857;
        int regionValue858;
        int regionValue859;
        java.lang.Object regionValue874;
        int regionValue875;
        int regionValue876;
        int regionValue877;
        long regionValue878;
        long regionValue879;
        long regionValue880;
        int regionValue881;
        long regionValue882;
        long regionValue883;
        long regionValue884;
        long regionValue885;
        int regionValue886;
        int regionValue887;
        java.lang.Object regionValue902;
        int regionValue903;
        int regionValue904;
        int regionValue905;
        long regionValue906;
        long regionValue907;
        long regionValue908;
        int regionValue909;
        long regionValue910;
        long regionValue911;
        long regionValue912;
        long regionValue913;
        int regionValue914;
        int regionValue915;
        java.lang.Object regionValue930;
        int regionValue931;
        int regionValue932;
        int regionValue933;
        long regionValue934;
        long regionValue935;
        long regionValue936;
        int regionValue937;
        long regionValue938;
        long regionValue939;
        long regionValue940;
        long regionValue941;
        int regionValue942;
        int regionValue943;
        java.lang.Object regionValue944;
        int regionValue945;
        java.lang.Object regionValue962;
        int regionValue963;
        int regionValue964;
        int regionValue965;
        long regionValue966;
        long regionValue967;
        long regionValue968;
        int regionValue969;
        long regionValue970;
        long regionValue971;
        long regionValue972;
        long regionValue973;
        int regionValue974;
        int regionValue975;
        java.lang.Object regionValue976;
        int regionValue977;
        java.lang.Object regionValue994;
        int regionValue995;
        int regionValue996;
        int regionValue997;
        long regionValue998;
        long regionValue999;
        long regionValue1000;
        int regionValue1001;
        long regionValue1002;
        long regionValue1003;
        long regionValue1004;
        long regionValue1005;
        int regionValue1006;
        int regionValue1007;
        java.lang.Object regionValue1008;
        int regionValue1009;
        java.lang.Object regionValue1026;
        int regionValue1027;
        int regionValue1028;
        int regionValue1029;
        long regionValue1030;
        long regionValue1031;
        long regionValue1032;
        int regionValue1033;
        long regionValue1034;
        long regionValue1035;
        long regionValue1036;
        long regionValue1037;
        int regionValue1038;
        int regionValue1039;
        java.lang.Object regionValue1040;
        java.lang.Object regionValue1056;
        int regionValue1057;
        int regionValue1058;
        int regionValue1059;
        long regionValue1060;
        long regionValue1061;
        long regionValue1062;
        int regionValue1063;
        long regionValue1064;
        long regionValue1065;
        long regionValue1066;
        long regionValue1067;
        int regionValue1068;
        int regionValue1069;
        java.lang.Object regionValue1070;
        java.lang.Object regionValue1086;
        int regionValue1087;
        int regionValue1088;
        int regionValue1089;
        long regionValue1090;
        long regionValue1091;
        long regionValue1092;
        int regionValue1093;
        long regionValue1094;
        long regionValue1095;
        long regionValue1096;
        long regionValue1097;
        int regionValue1098;
        int regionValue1099;
        java.lang.Object regionValue1100;
        java.lang.Object regionValue1147;
        int regionValue1148;
        int regionValue1149;
        int regionValue1150;
        long regionValue1151;
        long regionValue1152;
        long regionValue1153;
        int regionValue1154;
        long regionValue1155;
        long regionValue1156;
        long regionValue1157;
        long regionValue1158;
        int regionValue1159;
        java.lang.Object regionValue1266;
        int regionValue1267;
        int regionValue1268;
        int regionValue1269;
        long regionValue1270;
        long regionValue1271;
        long regionValue1272;
        long regionValue1273;
        long regionValue1274;
        long regionValue1275;
        int regionValue1276;
        int regionValue1277;
        int regionValue1278;
        java.lang.Object regionValue1292;
        int regionValue1293;
        int regionValue1294;
        int regionValue1295;
        long regionValue1296;
        long regionValue1297;
        long regionValue1298;
        int regionValue1299;
        long regionValue1300;
        long regionValue1301;
        long regionValue1302;
        long regionValue1303;
        int regionValue1304;
        int regionValue1305;
        int regionValue1306;
        java.lang.Object regionValue1322;
        int regionValue1323;
        int regionValue1324;
        int regionValue1325;
        long regionValue1326;
        long regionValue1327;
        long regionValue1328;
        long regionValue1329;
        long regionValue1330;
        long regionValue1331;
        int regionValue1332;
        int regionValue1333;
        java.lang.Object regionValue1346;
        int regionValue1347;
        int regionValue1348;
        int regionValue1349;
        long regionValue1350;
        long regionValue1351;
        long regionValue1352;
        int regionValue1353;
        long regionValue1354;
        long regionValue1355;
        long regionValue1356;
        long regionValue1357;
        int regionValue1358;
        int regionValue1359;
        java.lang.Object regionValue1376;
        int regionValue1377;
        int regionValue1378;
        int regionValue1379;
        long regionValue1380;
        long regionValue1381;
        long regionValue1382;
        int regionValue1383;
        long regionValue1384;
        long regionValue1385;
        long regionValue1386;
        long regionValue1387;
        int regionValue1388;
        int regionValue1389;
        java.lang.Object regionValue1390;
        int regionValue1391;
        java.lang.Object regionValue1408;
        int regionValue1409;
        int regionValue1410;
        int regionValue1411;
        long regionValue1412;
        long regionValue1413;
        long regionValue1414;
        int regionValue1415;
        long regionValue1416;
        long regionValue1417;
        long regionValue1418;
        long regionValue1419;
        int regionValue1420;
        int regionValue1421;
        java.lang.Object regionValue1422;
        int regionValue1423;
        java.lang.Object regionValue1440;
        int regionValue1441;
        int regionValue1442;
        int regionValue1443;
        long regionValue1444;
        long regionValue1445;
        long regionValue1446;
        int regionValue1447;
        long regionValue1448;
        long regionValue1449;
        long regionValue1450;
        long regionValue1451;
        int regionValue1452;
        int regionValue1453;
        java.lang.Object regionValue1454;
        int regionValue1455;
        java.lang.Object regionValue1472;
        int regionValue1473;
        int regionValue1474;
        int regionValue1475;
        long regionValue1476;
        long regionValue1477;
        long regionValue1478;
        int regionValue1479;
        long regionValue1480;
        long regionValue1481;
        long regionValue1482;
        long regionValue1483;
        int regionValue1484;
        int regionValue1485;
        java.lang.Object regionValue1486;
        java.lang.Object regionValue1502;
        int regionValue1503;
        int regionValue1504;
        int regionValue1505;
        long regionValue1506;
        long regionValue1507;
        long regionValue1508;
        int regionValue1509;
        long regionValue1510;
        long regionValue1511;
        long regionValue1512;
        long regionValue1513;
        int regionValue1514;
        int regionValue1515;
        java.lang.Object regionValue1516;
        java.lang.Object regionValue1532;
        int regionValue1533;
        int regionValue1534;
        int regionValue1535;
        long regionValue1536;
        long regionValue1537;
        long regionValue1538;
        int regionValue1539;
        long regionValue1540;
        long regionValue1541;
        long regionValue1542;
        long regionValue1543;
        int regionValue1544;
        int regionValue1545;
        java.lang.Object regionValue1546;
        java.lang.Object regionValue1574;
        int regionValue1575;
        int regionValue1576;
        int regionValue1577;
        long regionValue1578;
        long regionValue1579;
        long regionValue1580;
        int regionValue1581;
        long regionValue1582;
        long regionValue1583;
        long regionValue1584;
        long regionValue1585;
        int regionValue1586;
        int regionValue1587;
        java.lang.Object regionValue1635;
        int regionValue1636;
        int regionValue1637;
        int regionValue1638;
        long regionValue1639;
        long regionValue1640;
        long regionValue1641;
        int regionValue1642;
        long regionValue1643;
        long regionValue1644;
        long regionValue1645;
        long regionValue1646;
        int regionValue1647;
        int regionValue1648;
        java.lang.Object regionValue1649;
        java.lang.Object regionValue1665;
        int regionValue1666;
        int regionValue1667;
        int regionValue1668;
        long regionValue1669;
        long regionValue1670;
        long regionValue1671;
        int regionValue1672;
        long regionValue1673;
        long regionValue1674;
        long regionValue1675;
        long regionValue1676;
        int regionValue1677;
        int regionValue1678;
        java.lang.Object regionValue1679;
        java.lang.Object regionValue1709;
        int regionValue1710;
        int regionValue1711;
        int regionValue1712;
        long regionValue1713;
        long regionValue1714;
        long regionValue1715;
        int regionValue1716;
        long regionValue1717;
        long regionValue1718;
        long regionValue1719;
        long regionValue1720;
        int regionValue1721;
        int regionValue1722;
        java.lang.Object regionValue1737;
        int regionValue1738;
        int regionValue1739;
        int regionValue1740;
        long regionValue1741;
        long regionValue1742;
        long regionValue1743;
        int regionValue1744;
        long regionValue1745;
        long regionValue1746;
        long regionValue1747;
        long regionValue1748;
        int regionValue1749;
        int regionValue1750;
        java.lang.Object regionValue1797;
        int regionValue1798;
        int regionValue1799;
        int regionValue1800;
        long regionValue1801;
        long regionValue1802;
        long regionValue1803;
        int regionValue1804;
        long regionValue1805;
        long regionValue1806;
        long regionValue1807;
        long regionValue1808;
        int regionValue1809;
        int regionValue1810;
        int regionValue1811;
        java.lang.Object regionValue1839;
        int regionValue1840;
        int regionValue1841;
        int regionValue1842;
        long regionValue1843;
        long regionValue1844;
        long regionValue1845;
        int regionValue1846;
        long regionValue1847;
        long regionValue1848;
        long regionValue1849;
        long regionValue1850;
        int regionValue1851;
        int regionValue1852;
        java.lang.Object regionValue1867;
        int regionValue1868;
        int regionValue1869;
        int regionValue1870;
        long regionValue1871;
        long regionValue1872;
        long regionValue1873;
        int regionValue1874;
        long regionValue1875;
        long regionValue1876;
        long regionValue1877;
        long regionValue1878;
        int regionValue1879;
        int regionValue1880;
        java.lang.Object regionValue1910;
        int regionValue1911;
        int regionValue1912;
        int regionValue1913;
        long regionValue1914;
        long regionValue1915;
        long regionValue1916;
        long regionValue1917;
        long regionValue1918;
        long regionValue1919;
        int regionValue1920;
        int regionValue1921;
        int regionValue1922;
        java.lang.Object regionValue1936;
        int regionValue1937;
        int regionValue1938;
        int regionValue1939;
        long regionValue1940;
        long regionValue1941;
        long regionValue1942;
        long regionValue1943;
        long regionValue1944;
        long regionValue1945;
        int regionValue1946;
        int regionValue1947;
        int regionValue1948;
        java.lang.Object regionValue1974;
        int regionValue1975;
        int regionValue1976;
        int regionValue1977;
        long regionValue1978;
        long regionValue1979;
        long regionValue1980;
        long regionValue1981;
        long regionValue1982;
        long regionValue1983;
        int regionValue1984;
        int regionValue1985;
        java.lang.Object regionValue1998;
        int regionValue1999;
        int regionValue2000;
        int regionValue2001;
        long regionValue2002;
        long regionValue2003;
        long regionValue2004;
        long regionValue2005;
        long regionValue2006;
        long regionValue2007;
        int regionValue2008;
        int regionValue2009;
        java.lang.Object regionValue2028;
        int regionValue2029;
        int regionValue2030;
        int regionValue2031;
        long regionValue2032;
        long regionValue2033;
        long regionValue2034;
        long regionValue2035;
        long regionValue2036;
        long regionValue2037;
        int regionValue2038;
        int regionValue2039;
        java.lang.Object regionValue2052;
        int regionValue2053;
        int regionValue2054;
        int regionValue2055;
        long regionValue2056;
        long regionValue2057;
        long regionValue2058;
        long regionValue2059;
        long regionValue2060;
        long regionValue2061;
        int regionValue2062;
        int regionValue2063;
        java.lang.Object regionValue2064;
        int regionValue2065;
        java.lang.Object regionValue2080;
        int regionValue2081;
        int regionValue2082;
        int regionValue2083;
        long regionValue2084;
        long regionValue2085;
        long regionValue2086;
        long regionValue2087;
        long regionValue2088;
        long regionValue2089;
        int regionValue2090;
        java.lang.Object regionValue2102;
        int regionValue2103;
        int regionValue2104;
        int regionValue2105;
        long regionValue2106;
        long regionValue2107;
        long regionValue2108;
        long regionValue2109;
        long regionValue2110;
        long regionValue2111;
        int regionValue2112;
        int regionValue2113;
        java.lang.Object regionValue2114;
        java.lang.Object regionValue2128;
        int regionValue2129;
        int regionValue2130;
        int regionValue2131;
        long regionValue2132;
        long regionValue2133;
        long regionValue2134;
        long regionValue2135;
        long regionValue2136;
        long regionValue2137;
        int regionValue2138;
        int regionValue2139;
        java.lang.Object regionValue2140;
        java.lang.Object regionValue2155;
        int regionValue2156;
        int regionValue2157;
        int regionValue2158;
        long regionValue2159;
        long regionValue2160;
        long regionValue2161;
        long regionValue2162;
        long regionValue2163;
        long regionValue2164;
        int regionValue2165;
        int regionValue2166;
        int regionValue2167;
        int regionValue2168;
        java.lang.Object regionValue2183;
        int regionValue2184;
        int regionValue2185;
        int regionValue2186;
        long regionValue2187;
        long regionValue2188;
        long regionValue2189;
        long regionValue2190;
        long regionValue2191;
        long regionValue2192;
        int regionValue2193;
        int regionValue2194;
        int regionValue2195;
        int regionValue2196;
        java.lang.Object regionValue2211;
        int regionValue2212;
        int regionValue2213;
        int regionValue2214;
        long regionValue2215;
        long regionValue2216;
        long regionValue2217;
        long regionValue2218;
        long regionValue2219;
        long regionValue2220;
        int regionValue2221;
        int regionValue2222;
        int regionValue2223;
        int regionValue2224;
        java.lang.Object regionValue2252;
        int regionValue2253;
        int regionValue2254;
        int regionValue2255;
        long regionValue2256;
        long regionValue2257;
        long regionValue2258;
        long regionValue2259;
        long regionValue2260;
        long regionValue2261;
        int regionValue2262;
        int regionValue2263;
        int regionValue2264;
        java.lang.Object regionValue2278;
        int regionValue2279;
        int regionValue2280;
        int regionValue2281;
        long regionValue2282;
        long regionValue2283;
        long regionValue2284;
        long regionValue2285;
        long regionValue2286;
        long regionValue2287;
        int regionValue2288;
        int regionValue2289;
        int regionValue2290;
        java.lang.Object regionValue2316;
        int regionValue2317;
        int regionValue2318;
        int regionValue2319;
        long regionValue2320;
        long regionValue2321;
        long regionValue2322;
        long regionValue2323;
        long regionValue2324;
        long regionValue2325;
        int regionValue2326;
        java.lang.Object regionValue2404;
        int regionValue2405;
        int regionValue2406;
        int regionValue2407;
        long regionValue2408;
        long regionValue2409;
        long regionValue2410;
        long regionValue2411;
        long regionValue2412;
        long regionValue2413;
        int regionValue2414;
        int regionValue2415;
        int regionValue2416;
        java.lang.Object regionValue2430;
        int regionValue2431;
        int regionValue2432;
        int regionValue2433;
        long regionValue2434;
        long regionValue2435;
        long regionValue2436;
        long regionValue2437;
        long regionValue2438;
        long regionValue2439;
        int regionValue2440;
        int regionValue2441;
        int regionValue2442;
        java.lang.Object regionValue2456;
        int regionValue2457;
        int regionValue2458;
        int regionValue2459;
        long regionValue2460;
        long regionValue2461;
        long regionValue2462;
        long regionValue2463;
        long regionValue2464;
        long regionValue2465;
        int regionValue2466;
        int regionValue2467;
        java.lang.Object regionValue2480;
        int regionValue2481;
        int regionValue2482;
        int regionValue2483;
        long regionValue2484;
        long regionValue2485;
        long regionValue2486;
        long regionValue2487;
        long regionValue2488;
        long regionValue2489;
        int regionValue2490;
        int regionValue2491;
        java.lang.Object regionValue2519;
        int regionValue2520;
        int regionValue2521;
        int regionValue2522;
        long regionValue2523;
        long regionValue2524;
        long regionValue2525;
        long regionValue2526;
        long regionValue2527;
        long regionValue2528;
        int regionValue2529;
        int regionValue2530;
        int regionValue2531;
        java.lang.Object regionValue2545;
        int regionValue2546;
        int regionValue2547;
        int regionValue2548;
        long regionValue2549;
        long regionValue2550;
        long regionValue2551;
        long regionValue2552;
        long regionValue2553;
        long regionValue2554;
        int regionValue2555;
        int regionValue2556;
        int regionValue2557;
        java.lang.Object regionValue2583;
        int regionValue2584;
        int regionValue2585;
        int regionValue2586;
        long regionValue2587;
        long regionValue2588;
        long regionValue2589;
        long regionValue2590;
        long regionValue2591;
        long regionValue2592;
        int regionValue2593;
        int regionValue2594;
        java.lang.Object regionValue2607;
        int regionValue2608;
        int regionValue2609;
        int regionValue2610;
        long regionValue2611;
        long regionValue2612;
        long regionValue2613;
        long regionValue2614;
        long regionValue2615;
        long regionValue2616;
        int regionValue2617;
        int regionValue2618;
        java.lang.Object regionValue2634;
        int regionValue2635;
        int regionValue2636;
        int regionValue2637;
        long regionValue2638;
        long regionValue2639;
        long regionValue2640;
        long regionValue2641;
        long regionValue2642;
        long regionValue2643;
        int regionValue2644;
        int regionValue2645;
        int regionValue2646;
        int regionValue2647;
        java.lang.Object regionValue2662;
        int regionValue2663;
        int regionValue2664;
        int regionValue2665;
        long regionValue2666;
        long regionValue2667;
        long regionValue2668;
        long regionValue2669;
        long regionValue2670;
        long regionValue2671;
        int regionValue2672;
        int regionValue2673;
        int regionValue2674;
        int regionValue2675;
        java.lang.Object regionValue2690;
        int regionValue2691;
        int regionValue2692;
        int regionValue2693;
        long regionValue2694;
        long regionValue2695;
        long regionValue2696;
        long regionValue2697;
        long regionValue2698;
        long regionValue2699;
        int regionValue2700;
        int regionValue2701;
        int regionValue2702;
        int regionValue2703;
        java.lang.Object regionValue2731;
        int regionValue2732;
        int regionValue2733;
        int regionValue2734;
        long regionValue2735;
        long regionValue2736;
        long regionValue2737;
        long regionValue2738;
        long regionValue2739;
        long regionValue2740;
        int regionValue2741;
        int regionValue2742;
        int regionValue2743;
        java.lang.Object regionValue2757;
        int regionValue2758;
        int regionValue2759;
        int regionValue2760;
        long regionValue2761;
        long regionValue2762;
        long regionValue2763;
        long regionValue2764;
        long regionValue2765;
        long regionValue2766;
        int regionValue2767;
        int regionValue2768;
        int regionValue2769;
        java.lang.Object regionValue2795;
        int regionValue2796;
        int regionValue2797;
        int regionValue2798;
        long regionValue2799;
        long regionValue2800;
        long regionValue2801;
        long regionValue2802;
        long regionValue2803;
        long regionValue2804;
        int regionValue2805;
        java.lang.Object regionValue2818;
        int regionValue2819;
        long regionValue2820;
        long regionValue2821;
        long regionValue2822;
        long regionValue2823;
        int regionValue2824;
        int regionValue2825;
        java.lang.Object regionValue2873;
        int regionValue2874;
        int regionValue2875;
        long regionValue2876;
        long regionValue2877;
        long regionValue2878;
        long regionValue2879;
        long regionValue2880;
        int regionValue2881;
        int regionValue2882;
        int regionValue2883;
        java.lang.Object regionValue2895;
        int regionValue2896;
        int regionValue2897;
        int regionValue2898;
        long regionValue2899;
        long regionValue2900;
        long regionValue2901;
        long regionValue2902;
        long regionValue2903;
        long regionValue2904;
        int regionValue2905;
        int regionValue2906;
        int regionValue2907;
        java.lang.Object regionValue2921;
        int regionValue2922;
        int regionValue2923;
        long regionValue2924;
        long regionValue2925;
        long regionValue2926;
        long regionValue2927;
        long regionValue2928;
        int regionValue2929;
        int regionValue2930;
        java.lang.Object regionValue2941;
        int regionValue2942;
        int regionValue2943;
        int regionValue2944;
        long regionValue2945;
        long regionValue2946;
        long regionValue2947;
        long regionValue2948;
        long regionValue2949;
        long regionValue2950;
        int regionValue2951;
        int regionValue2952;
        java.lang.Object regionValue2979;
        int regionValue2980;
        int regionValue2981;
        int regionValue2982;
        long regionValue2983;
        long regionValue2984;
        long regionValue2985;
        long regionValue2986;
        long regionValue2987;
        int regionValue2988;
        int regionValue2989;
        int regionValue2990;
        java.lang.Object regionValue3003;
        int regionValue3004;
        int regionValue3005;
        int regionValue3006;
        long regionValue3007;
        long regionValue3008;
        long regionValue3009;
        long regionValue3010;
        long regionValue3011;
        int regionValue3012;
        int regionValue3013;
        int regionValue3014;
        java.lang.Object regionValue3037;
        int regionValue3038;
        int regionValue3039;
        int regionValue3040;
        long regionValue3041;
        long regionValue3042;
        long regionValue3043;
        long regionValue3044;
        long regionValue3045;
        int regionValue3046;
        int regionValue3047;
        java.lang.Object regionValue3059;
        int regionValue3060;
        int regionValue3061;
        int regionValue3062;
        long regionValue3063;
        long regionValue3064;
        long regionValue3065;
        long regionValue3066;
        long regionValue3067;
        int regionValue3068;
        int regionValue3069;
        java.lang.Object regionValue3094;
        int regionValue3095;
        int regionValue3096;
        int regionValue3097;
        long regionValue3098;
        long regionValue3099;
        long regionValue3100;
        long regionValue3101;
        long regionValue3102;
        int regionValue3103;
        int regionValue3104;
        int regionValue3105;
        java.lang.Object regionValue3118;
        int regionValue3119;
        int regionValue3120;
        int regionValue3121;
        long regionValue3122;
        long regionValue3123;
        long regionValue3124;
        long regionValue3125;
        long regionValue3126;
        int regionValue3127;
        int regionValue3128;
        int regionValue3129;
        java.lang.Object regionValue3152;
        int regionValue3153;
        int regionValue3154;
        int regionValue3155;
        long regionValue3156;
        long regionValue3157;
        long regionValue3158;
        long regionValue3159;
        long regionValue3160;
        int regionValue3161;
        int regionValue3162;
        java.lang.Object regionValue3174;
        int regionValue3175;
        int regionValue3176;
        int regionValue3177;
        long regionValue3178;
        long regionValue3179;
        long regionValue3180;
        long regionValue3181;
        long regionValue3182;
        int regionValue3183;
        int regionValue3184;
        java.lang.Object regionValue3210;
        int regionValue3211;
        int regionValue3212;
        int regionValue3213;
        long regionValue3214;
        long regionValue3215;
        long regionValue3216;
        long regionValue3217;
        long regionValue3218;
        int regionValue3219;
        int regionValue3220;
        int regionValue3221;
        java.lang.Object regionValue3234;
        int regionValue3235;
        int regionValue3236;
        int regionValue3237;
        long regionValue3238;
        long regionValue3239;
        long regionValue3240;
        long regionValue3241;
        long regionValue3242;
        int regionValue3243;
        int regionValue3244;
        int regionValue3245;
        java.lang.Object regionValue3268;
        int regionValue3269;
        int regionValue3270;
        int regionValue3271;
        long regionValue3272;
        long regionValue3273;
        long regionValue3274;
        long regionValue3275;
        long regionValue3276;
        int regionValue3277;
        int regionValue3278;
        java.lang.Object regionValue3290;
        int regionValue3291;
        int regionValue3292;
        int regionValue3293;
        long regionValue3294;
        long regionValue3295;
        long regionValue3296;
        long regionValue3297;
        long regionValue3298;
        int regionValue3299;
        int regionValue3300;
        java.lang.Object regionValue3315;
        int regionValue3316;
        int regionValue3317;
        long regionValue3318;
        long regionValue3319;
        long regionValue3320;
        long regionValue3321;
        long regionValue3322;
        int regionValue3323;
        int regionValue3324;
        int regionValue3325;
        int regionValue3326;
        java.lang.Object regionValue3339;
        int regionValue3340;
        int regionValue3341;
        long regionValue3342;
        long regionValue3343;
        long regionValue3344;
        long regionValue3345;
        long regionValue3346;
        int regionValue3347;
        int regionValue3348;
        int regionValue3349;
        int regionValue3350;
        java.lang.Object regionValue3363;
        int regionValue3364;
        int regionValue3365;
        long regionValue3366;
        long regionValue3367;
        long regionValue3368;
        long regionValue3369;
        long regionValue3370;
        int regionValue3371;
        int regionValue3372;
        int regionValue3373;
        int regionValue3374;
        java.lang.Object regionValue3398;
        int regionValue3399;
        int regionValue3400;
        long regionValue3401;
        long regionValue3402;
        long regionValue3403;
        long regionValue3404;
        long regionValue3405;
        int regionValue3406;
        int regionValue3407;
        int regionValue3408;
        java.lang.Object regionValue3420;
        int regionValue3421;
        int regionValue3422;
        long regionValue3423;
        long regionValue3424;
        long regionValue3425;
        long regionValue3426;
        long regionValue3427;
        int regionValue3428;
        int regionValue3429;
        int regionValue3430;
        java.lang.Object regionValue3452;
        int regionValue3453;
        int regionValue3454;
        long regionValue3455;
        long regionValue3456;
        long regionValue3457;
        long regionValue3458;
        long regionValue3459;
        int regionValue3460;
        java.lang.Object regionValue3512;
        int regionValue3513;
        int regionValue3514;
        long regionValue3515;
        long regionValue3516;
        long regionValue3517;
        long regionValue3518;
        int regionValue3519;
        int regionValue3520;
        int regionValue3521;
        java.lang.Object regionValue3532;
        int regionValue3533;
        int regionValue3534;
        long regionValue3535;
        long regionValue3536;
        long regionValue3537;
        long regionValue3538;
        long regionValue3539;
        int regionValue3540;
        int regionValue3541;
        int regionValue3542;
        java.lang.Object regionValue3554;
        int regionValue3555;
        int regionValue3556;
        long regionValue3557;
        long regionValue3558;
        long regionValue3559;
        long regionValue3560;
        int regionValue3561;
        int regionValue3562;
        java.lang.Object regionValue3572;
        int regionValue3573;
        int regionValue3574;
        long regionValue3575;
        long regionValue3576;
        long regionValue3577;
        long regionValue3578;
        long regionValue3579;
        int regionValue3580;
        int regionValue3581;
        java.lang.Object regionValue3604;
        int regionValue3605;
        int regionValue3606;
        long regionValue3607;
        long regionValue3608;
        long regionValue3609;
        long regionValue3610;
        long regionValue3611;
        int regionValue3612;
        int regionValue3613;
        int regionValue3614;
        java.lang.Object regionValue3626;
        int regionValue3627;
        int regionValue3628;
        long regionValue3629;
        long regionValue3630;
        long regionValue3631;
        long regionValue3632;
        long regionValue3633;
        int regionValue3634;
        int regionValue3635;
        int regionValue3636;
        java.lang.Object regionValue3657;
        int regionValue3658;
        int regionValue3659;
        long regionValue3660;
        long regionValue3661;
        long regionValue3662;
        long regionValue3663;
        long regionValue3664;
        int regionValue3665;
        int regionValue3666;
        java.lang.Object regionValue3677;
        int regionValue3678;
        int regionValue3679;
        long regionValue3680;
        long regionValue3681;
        long regionValue3682;
        long regionValue3683;
        long regionValue3684;
        int regionValue3685;
        int regionValue3686;
        java.lang.Object regionValue3708;
        int regionValue3709;
        int regionValue3710;
        long regionValue3711;
        long regionValue3712;
        long regionValue3713;
        long regionValue3714;
        long regionValue3715;
        int regionValue3716;
        int regionValue3717;
        int regionValue3718;
        java.lang.Object regionValue3730;
        int regionValue3731;
        int regionValue3732;
        long regionValue3733;
        long regionValue3734;
        long regionValue3735;
        long regionValue3736;
        long regionValue3737;
        int regionValue3738;
        int regionValue3739;
        int regionValue3740;
        java.lang.Object regionValue3761;
        int regionValue3762;
        int regionValue3763;
        long regionValue3764;
        long regionValue3765;
        long regionValue3766;
        long regionValue3767;
        long regionValue3768;
        int regionValue3769;
        int regionValue3770;
        java.lang.Object regionValue3781;
        int regionValue3782;
        int regionValue3783;
        long regionValue3784;
        long regionValue3785;
        long regionValue3786;
        long regionValue3787;
        long regionValue3788;
        int regionValue3789;
        int regionValue3790;
        java.lang.Object regionValue3802;
        int regionValue3803;
        int regionValue3804;
        long regionValue3805;
        long regionValue3806;
        long regionValue3807;
        long regionValue3808;
        int regionValue3809;
        int regionValue3810;
        int regionValue3811;
        int regionValue3812;
        java.lang.Object regionValue3824;
        int regionValue3825;
        int regionValue3826;
        long regionValue3827;
        long regionValue3828;
        long regionValue3829;
        long regionValue3830;
        int regionValue3831;
        int regionValue3832;
        int regionValue3833;
        int regionValue3834;
        java.lang.Object regionValue3846;
        int regionValue3847;
        int regionValue3848;
        long regionValue3849;
        long regionValue3850;
        long regionValue3851;
        long regionValue3852;
        int regionValue3853;
        int regionValue3854;
        int regionValue3855;
        int regionValue3856;
        java.lang.Object regionValue3878;
        int regionValue3879;
        int regionValue3880;
        long regionValue3881;
        long regionValue3882;
        long regionValue3883;
        long regionValue3884;
        int regionValue3885;
        int regionValue3886;
        int regionValue3887;
        java.lang.Object regionValue3898;
        int regionValue3899;
        int regionValue3900;
        long regionValue3901;
        long regionValue3902;
        long regionValue3903;
        long regionValue3904;
        int regionValue3905;
        int regionValue3906;
        int regionValue3907;
        java.lang.Object regionValue3927;
        int regionValue3928;
        int regionValue3929;
        long regionValue3930;
        long regionValue3931;
        long regionValue3932;
        long regionValue3933;
        int regionValue3934;
        java.lang.Object regionValue3984;
        int regionValue3985;
        long regionValue3986;
        long regionValue3987;
        long regionValue3988;
        int regionValue3989;
        int regionValue3990;
        int regionValue3991;
        int regionValue3992;
        java.lang.Object regionValue4002;
        int regionValue4003;
        long regionValue4004;
        long regionValue4005;
        long regionValue4006;
        long regionValue4007;
        int regionValue4008;
        int regionValue4009;
        int regionValue4010;
        int regionValue4011;
        java.lang.Object regionValue4022;
        int regionValue4023;
        long regionValue4024;
        long regionValue4025;
        long regionValue4026;
        int regionValue4027;
        int regionValue4028;
        int regionValue4029;
        java.lang.Object regionValue4038;
        int regionValue4039;
        long regionValue4040;
        long regionValue4041;
        long regionValue4042;
        long regionValue4043;
        int regionValue4044;
        int regionValue4045;
        int regionValue4046;
        java.lang.Object regionValue4056;
        int regionValue4057;
        long regionValue4058;
        long regionValue4059;
        long regionValue4060;
        long regionValue4061;
        int regionValue4062;
        int regionValue4063;
        int regionValue4064;
        java.lang.Object regionValue4082;
        int regionValue4083;
        long regionValue4084;
        long regionValue4085;
        long regionValue4086;
        long regionValue4087;
        int regionValue4088;
        int regionValue4089;
        java.lang.Object regionValue4100;
        int regionValue4101;
        long regionValue4102;
        long regionValue4103;
        long regionValue4104;
        long regionValue4105;
        int regionValue4106;
        int regionValue4107;
        java.lang.Object regionValue4108;
        java.lang.Object regionValue4118;
        int regionValue4119;
        long regionValue4120;
        long regionValue4121;
        long regionValue4122;
        long regionValue4123;
        int regionValue4124;
        int regionValue4125;
        java.lang.Object regionValue4126;
        java.lang.Object regionValue4136;
        int regionValue4137;
        long regionValue4138;
        long regionValue4139;
        long regionValue4140;
        long regionValue4141;
        int regionValue4142;
        int regionValue4143;
        java.lang.Object regionValue4144;
        java.lang.Object regionValue4154;
        int regionValue4155;
        long regionValue4156;
        long regionValue4157;
        long regionValue4158;
        long regionValue4159;
        int regionValue4160;
        java.lang.Object regionValue4168;
        int regionValue4169;
        long regionValue4170;
        long regionValue4171;
        long regionValue4172;
        long regionValue4173;
        int regionValue4174;
        int regionValue4175;
        java.lang.Object regionValue4184;
        int regionValue4185;
        long regionValue4186;
        long regionValue4187;
        long regionValue4188;
        long regionValue4189;
        int regionValue4190;
        int regionValue4191;
        java.lang.Object regionValue4255;
        int regionValue4256;
        long regionValue4257;
        long regionValue4258;
        int regionValue4259;
        int regionValue4260;
        int regionValue4261;
        java.lang.Object regionValue4269;
        int regionValue4270;
        long regionValue4271;
        long regionValue4272;
        long regionValue4273;
        int regionValue4274;
        int regionValue4275;
        int regionValue4276;
        java.lang.Object regionValue4285;
        int regionValue4286;
        long regionValue4287;
        long regionValue4288;
        long regionValue4289;
        int regionValue4290;
        int regionValue4291;
        java.lang.Object regionValue4299;
        int regionValue4300;
        long regionValue4301;
        long regionValue4302;
        long regionValue4303;
        int regionValue4304;
        int regionValue4334;
        int regionValue4335;
        int regionValue4336;
        java.lang.Object regionValue4340;
        long regionValue4341;
        long regionValue4342;
        int regionValue4343;
        int regionValue4344;
        int regionValue4345;
        int regionValue4346;
        int regionValue4347;
        int regionValue4356;
        int regionValue4357;
        int regionValue4358;
        java.lang.Object regionValue4362;
        long regionValue4363;
        long regionValue4364;
        int regionValue4365;
        int regionValue4366;
        int regionValue4367;
        int regionValue4368;
        java.lang.Object regionValue4376;
        long regionValue4377;
        long regionValue4378;
        int regionValue4379;
        int regionValue4380;
        int regionValue4381;
        int regionValue4382;
        java.lang.Object regionValue4390;
        long regionValue4391;
        long regionValue4392;
        int regionValue4393;
        int regionValue4394;
        int regionValue4395;
        java.lang.Object regionValue4402;
        long regionValue4403;
        int regionValue4404;
        int regionValue4405;
        int regionValue4412;
        int regionValue4414;
        int regionValue4415;
        int regionValue4418;
        int regionValue4419;
        int regionValue4422;
        int regionValue4435;
        int regionValue4436;
        region471: {
        region470: {
        region468: {
        region467: {
        region466: {
        region465: {
        region456: {
        region455: {
        region453: {
        region452: {
        region450: {
        region443: {
        region442: {
        region440: {
        region439: {
        region430: {
        region421: {
        region419: {
        region418: {
        region417: {
        region416: {
        region411: {
        region409: {
        region406: {
        region400: {
        region398: {
        region397: {
        region395: {
        region389: {
        region388: {
        region386: {
        region385: {
        region383: {
        region382: {
        region375: {
        region371: {
        region370: {
        region368: {
        region367: {
        region365: {
        region357: {
        region355: {
        region354: {
        region352: {
        region348: {
        region346: {
        region345: {
        region343: {
        region336: {
        region335: {
        region334: {
        region333: {
        region330: {
        region326: {
        region325: {
        region323: {
        region322: {
        region320: {
        region312: {
        region310: {
        region309: {
        region307: {
        region300: {
        region298: {
        region297: {
        region295: {
        region289: {
        region287: {
        region286: {
        region284: {
        region276: {
        region275: {
        region274: {
        region273: {
        region270: {
        region266: {
        region265: {
        region263: {
        region262: {
        region260: {
        region252: {
        region250: {
        region249: {
        region247: {
        region241: {
        region240: {
        region239: {
        region238: {
        region232: {
        region231: {
        region228: {
        region226: {
        region224: {
        region222: {
        region221: {
        region219: {
        region214: {
        region212: {
        region211: {
        region200: {
        region198: {
        region197: {
        region195: {
        region186: {
        region184: {
        region183: {
        region179: {
        region173: {
        region171: {
        region168: {
        region167: {
        region166: {
        region160: {
        region159: {
        region157: {
        region156: {
        region154: {
        region147: {
        region146: {
        region145: {
        region144: {
        region139: {
        region138: {
        region137: {
        region136: {
        region134: {
        region133: {
        region127: {
        region125: {
        region124: {
        region122: {
        region118: {
        region116: {
        region115: {
        region113: {
        region110: {
        region109: {
        region107: {
        region106: {
        region100: {
        region96: {
        region95: {
        region90: {
        region89: {
        region88: {
        region86: {
        region85: {
        region81: {
        region77: {
        region75: {
        region74: {
        region72: {
        region69: {
        long converted4 = (long) (constructorPart1);
        long computed5 = converted4 << 32;
        long converted6 = (long) (constructorPart2);
        long computed7 = converted6 << 40;
        long computed8 = computed7 >>> 32;
        long computed9 = computed5 | computed8;
        long converted10 = (long) (constructorPart3);
        long computed11 = converted10 << 56;
        long computed12 = computed11 >>> 56;
        long computed13 = computed9 | computed12;
        long initialValue14 = recovery$indy$flow$1119();
        long computed15 = computed13 ^ initialValue14;
        long initialValue16 = computed15;
        long computed17 = initialValue16 ^ 22751485108545L;
        long initialValue18 = computed17;
        long computed19 = initialValue16 ^ 87311676236644L;
        long initialValue20 = computed19;
        long computed21 = initialValue16 ^ 51665681023300L;
        long computed22 = computed21 >>> 48;
        int converted23 = (int) (computed22);
        int initialValue24 = converted23;
        long computed25 = computed21 << 16;
        long computed26 = computed25 >>> 16;
        long initialValue27 = computed26;
        long computed28 = initialValue16 ^ 3647140294542L;
        long initialValue29 = computed28;
        long computed30 = initialValue16 ^ 39361727625985L;
        long initialValue31 = computed30;
        long computed32 = initialValue16 ^ 68698656051515L;
        long initialValue33 = computed32;
        long computed34 = initialValue16 ^ 127308424258543L;
        long initialValue35 = computed34;
        boolean initialValue36 = recovery$indy$flow$1120(3402231584771785402L, initialValue16);
        int initialValue37 = (int) ((initialValue36 ? 1 : 0));
        if (initialValue37 != 0) {
            java.lang.Object regionNext53 = this;
            int regionNext54 = constructorPart1;
            int regionNext55 = constructorPart2;
            int regionNext56 = constructorPart3;
            long regionNext57 = initialValue16;
            long regionNext58 = initialValue18;
            long regionNext59 = initialValue20;
            int regionNext60 = initialValue24;
            long regionNext61 = initialValue27;
            long regionNext62 = initialValue29;
            long regionNext63 = initialValue31;
            long regionNext64 = initialValue33;
            long regionNext65 = initialValue35;
            int regionNext66 = initialValue37;
            java.lang.Object regionNext67 = this;
            regionValue38 = regionNext53;
            regionValue39 = regionNext54;
            regionValue40 = regionNext55;
            regionValue41 = regionNext56;
            regionValue42 = regionNext57;
            regionValue43 = regionNext58;
            regionValue44 = regionNext59;
            regionValue45 = regionNext60;
            regionValue46 = regionNext61;
            regionValue47 = regionNext62;
            regionValue48 = regionNext63;
            regionValue49 = regionNext64;
            regionValue50 = regionNext65;
            regionValue51 = regionNext66;
            regionValue52 = regionNext67;
            break region96;
        } else {
            java.lang.Object regionNext83 = this;
            int regionNext84 = constructorPart1;
            int regionNext85 = constructorPart2;
            int regionNext86 = constructorPart3;
            long regionNext87 = initialValue16;
            long regionNext88 = initialValue18;
            long regionNext89 = initialValue20;
            int regionNext90 = initialValue24;
            long regionNext91 = initialValue27;
            long regionNext92 = initialValue29;
            long regionNext93 = initialValue31;
            long regionNext94 = initialValue33;
            long regionNext95 = initialValue35;
            int regionNext96 = initialValue37;
            java.lang.Object regionNext97 = this;
            regionValue68 = regionNext83;
            regionValue69 = regionNext84;
            regionValue70 = regionNext85;
            regionValue71 = regionNext86;
            regionValue72 = regionNext87;
            regionValue73 = regionNext88;
            regionValue74 = regionNext89;
            regionValue75 = regionNext90;
            regionValue76 = regionNext91;
            regionValue77 = regionNext92;
            regionValue78 = regionNext93;
            regionValue79 = regionNext94;
            regionValue80 = regionNext95;
            regionValue81 = regionNext96;
            regionValue82 = regionNext97;
            break region69;
        }
        }
        java.lang.Object initialValue98 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue82)))).field_44Z));
        if (regionValue70 < 0) {
            java.lang.Object regionNext114 = regionValue68;
            int regionNext115 = regionValue69;
            int regionNext116 = regionValue70;
            int regionNext117 = regionValue71;
            long regionNext118 = regionValue72;
            long regionNext119 = regionValue73;
            long regionNext120 = regionValue74;
            int regionNext121 = regionValue75;
            long regionNext122 = regionValue76;
            long regionNext123 = regionValue77;
            long regionNext124 = regionValue78;
            long regionNext125 = regionValue79;
            long regionNext126 = regionValue80;
            int regionNext127 = regionValue81;
            java.lang.Object regionNext128 = initialValue98;
            regionValue99 = regionNext114;
            regionValue100 = regionNext115;
            regionValue101 = regionNext116;
            regionValue102 = regionNext117;
            regionValue103 = regionNext118;
            regionValue104 = regionNext119;
            regionValue105 = regionNext120;
            regionValue106 = regionNext121;
            regionValue107 = regionNext122;
            regionValue108 = regionNext123;
            regionValue109 = regionNext124;
            regionValue110 = regionNext125;
            regionValue111 = regionNext126;
            regionValue112 = regionNext127;
            regionValue113 = regionNext128;
            break region81;
        } else {
            java.lang.Object regionNext144 = regionValue68;
            int regionNext145 = regionValue69;
            int regionNext146 = regionValue70;
            int regionNext147 = regionValue71;
            long regionNext148 = regionValue72;
            long regionNext149 = regionValue73;
            long regionNext150 = regionValue74;
            int regionNext151 = regionValue75;
            long regionNext152 = regionValue76;
            long regionNext153 = regionValue77;
            long regionNext154 = regionValue78;
            long regionNext155 = regionValue79;
            long regionNext156 = regionValue80;
            int regionNext157 = regionValue81;
            java.lang.Object regionNext158 = initialValue98;
            regionValue129 = regionNext144;
            regionValue130 = regionNext145;
            regionValue131 = regionNext146;
            regionValue132 = regionNext147;
            regionValue133 = regionNext148;
            regionValue134 = regionNext149;
            regionValue135 = regionNext150;
            regionValue136 = regionNext151;
            regionValue137 = regionNext152;
            regionValue138 = regionNext153;
            regionValue139 = regionNext154;
            regionValue140 = regionNext155;
            regionValue141 = regionNext156;
            regionValue142 = regionNext157;
            regionValue143 = regionNext158;
            break region72;
        }
        }
        java.lang.Object regionNext174 = regionValue129;
        int regionNext175 = regionValue130;
        int regionNext176 = regionValue131;
        int regionNext177 = regionValue132;
        long regionNext178 = regionValue133;
        long regionNext179 = regionValue134;
        long regionNext180 = regionValue135;
        int regionNext181 = regionValue136;
        long regionNext182 = regionValue137;
        long regionNext183 = regionValue138;
        long regionNext184 = regionValue139;
        long regionNext185 = regionValue140;
        long regionNext186 = regionValue141;
        int regionNext187 = regionValue142;
        java.lang.Object regionNext188 = regionValue143;
        regionValue159 = regionNext174;
        regionValue160 = regionNext175;
        regionValue161 = regionNext176;
        regionValue162 = regionNext177;
        regionValue163 = regionNext178;
        regionValue164 = regionNext179;
        regionValue165 = regionNext180;
        regionValue166 = regionNext181;
        regionValue167 = regionNext182;
        regionValue168 = regionNext183;
        regionValue169 = regionNext184;
        regionValue170 = regionNext185;
        regionValue171 = regionNext186;
        regionValue172 = regionNext187;
        regionValue173 = regionNext188;
        break region74;
        }
        if (regionValue173 == null) {
            java.lang.Object regionNext203 = regionValue159;
            int regionNext204 = regionValue160;
            int regionNext205 = regionValue161;
            int regionNext206 = regionValue162;
            long regionNext207 = regionValue163;
            long regionNext208 = regionValue164;
            long regionNext209 = regionValue165;
            int regionNext210 = regionValue166;
            long regionNext211 = regionValue167;
            long regionNext212 = regionValue168;
            long regionNext213 = regionValue169;
            long regionNext214 = regionValue170;
            long regionNext215 = regionValue171;
            int regionNext216 = regionValue172;
            regionValue189 = regionNext203;
            regionValue190 = regionNext204;
            regionValue191 = regionNext205;
            regionValue192 = regionNext206;
            regionValue193 = regionNext207;
            regionValue194 = regionNext208;
            regionValue195 = regionNext209;
            regionValue196 = regionNext210;
            regionValue197 = regionNext211;
            regionValue198 = regionNext212;
            regionValue199 = regionNext213;
            regionValue200 = regionNext214;
            regionValue201 = regionNext215;
            regionValue202 = regionNext216;
            break region95;
        } else {
            java.lang.Object regionNext231 = regionValue159;
            int regionNext232 = regionValue160;
            int regionNext233 = regionValue161;
            int regionNext234 = regionValue162;
            long regionNext235 = regionValue163;
            long regionNext236 = regionValue164;
            long regionNext237 = regionValue165;
            int regionNext238 = regionValue166;
            long regionNext239 = regionValue167;
            long regionNext240 = regionValue168;
            long regionNext241 = regionValue169;
            long regionNext242 = regionValue170;
            long regionNext243 = regionValue171;
            int regionNext244 = regionValue172;
            regionValue217 = regionNext231;
            regionValue218 = regionNext232;
            regionValue219 = regionNext233;
            regionValue220 = regionNext234;
            regionValue221 = regionNext235;
            regionValue222 = regionNext236;
            regionValue223 = regionNext237;
            regionValue224 = regionNext238;
            regionValue225 = regionNext239;
            regionValue226 = regionNext240;
            regionValue227 = regionNext241;
            regionValue228 = regionNext242;
            regionValue229 = regionNext243;
            regionValue230 = regionNext244;
            break region75;
        }
        }
        java.lang.Object regionNext259 = regionValue217;
        int regionNext260 = regionValue218;
        int regionNext261 = regionValue219;
        int regionNext262 = regionValue220;
        long regionNext263 = regionValue221;
        long regionNext264 = regionValue222;
        long regionNext265 = regionValue223;
        int regionNext266 = regionValue224;
        long regionNext267 = regionValue225;
        long regionNext268 = regionValue226;
        long regionNext269 = regionValue227;
        long regionNext270 = regionValue228;
        long regionNext271 = regionValue229;
        int regionNext272 = regionValue230;
        regionValue245 = regionNext259;
        regionValue246 = regionNext260;
        regionValue247 = regionNext261;
        regionValue248 = regionNext262;
        regionValue249 = regionNext263;
        regionValue250 = regionNext264;
        regionValue251 = regionNext265;
        regionValue252 = regionNext266;
        regionValue253 = regionNext267;
        regionValue254 = regionNext268;
        regionValue255 = regionNext269;
        regionValue256 = regionNext270;
        regionValue257 = regionNext271;
        regionValue258 = regionNext272;
        break region77;
        }
        java.lang.Object initialValue273 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue245)))).field_44Z));
        java.lang.Object regionNext274 = regionValue245;
        int regionNext275 = regionValue246;
        int regionNext276 = regionValue247;
        int regionNext277 = regionValue248;
        long regionNext278 = regionValue249;
        long regionNext279 = regionValue250;
        long regionNext280 = regionValue251;
        int regionNext281 = regionValue252;
        long regionNext282 = regionValue253;
        long regionNext283 = regionValue254;
        long regionNext284 = regionValue255;
        long regionNext285 = regionValue256;
        long regionNext286 = regionValue257;
        int regionNext287 = regionValue258;
        java.lang.Object regionNext288 = initialValue273;
        regionValue99 = regionNext274;
        regionValue100 = regionNext275;
        regionValue101 = regionNext276;
        regionValue102 = regionNext277;
        regionValue103 = regionNext278;
        regionValue104 = regionNext279;
        regionValue105 = regionNext280;
        regionValue106 = regionNext281;
        regionValue107 = regionNext282;
        regionValue108 = regionNext283;
        regionValue109 = regionNext284;
        regionValue110 = regionNext285;
        regionValue111 = regionNext286;
        regionValue112 = regionNext287;
        regionValue113 = regionNext288;
        break region81;
        }
        int initialValue289 = recovery$indy$flow$1123(regionValue113);
        if (regionValue100 < 0) {
            java.lang.Object regionNext306 = regionValue99;
            int regionNext307 = regionValue100;
            int regionNext308 = regionValue101;
            int regionNext309 = regionValue102;
            long regionNext310 = regionValue103;
            long regionNext311 = regionValue104;
            long regionNext312 = regionValue105;
            int regionNext313 = regionValue106;
            long regionNext314 = regionValue107;
            long regionNext315 = regionValue108;
            long regionNext316 = regionValue109;
            long regionNext317 = regionValue110;
            long regionNext318 = regionValue111;
            int regionNext319 = regionValue112;
            int regionNext320 = initialValue289;
            int regionNext321 = regionValue112;
            regionValue290 = regionNext306;
            regionValue291 = regionNext307;
            regionValue292 = regionNext308;
            regionValue293 = regionNext309;
            regionValue294 = regionNext310;
            regionValue295 = regionNext311;
            regionValue296 = regionNext312;
            regionValue297 = regionNext313;
            regionValue298 = regionNext314;
            regionValue299 = regionNext315;
            regionValue300 = regionNext316;
            regionValue301 = regionNext317;
            regionValue302 = regionNext318;
            regionValue303 = regionNext319;
            regionValue304 = regionNext320;
            regionValue305 = regionNext321;
            break region89;
        } else {
            java.lang.Object regionNext338 = regionValue99;
            int regionNext339 = regionValue100;
            int regionNext340 = regionValue101;
            int regionNext341 = regionValue102;
            long regionNext342 = regionValue103;
            long regionNext343 = regionValue104;
            long regionNext344 = regionValue105;
            int regionNext345 = regionValue106;
            long regionNext346 = regionValue107;
            long regionNext347 = regionValue108;
            long regionNext348 = regionValue109;
            long regionNext349 = regionValue110;
            long regionNext350 = regionValue111;
            int regionNext351 = regionValue112;
            int regionNext352 = initialValue289;
            int regionNext353 = regionValue112;
            regionValue322 = regionNext338;
            regionValue323 = regionNext339;
            regionValue324 = regionNext340;
            regionValue325 = regionNext341;
            regionValue326 = regionNext342;
            regionValue327 = regionNext343;
            regionValue328 = regionNext344;
            regionValue329 = regionNext345;
            regionValue330 = regionNext346;
            regionValue331 = regionNext347;
            regionValue332 = regionNext348;
            regionValue333 = regionNext349;
            regionValue334 = regionNext350;
            regionValue335 = regionNext351;
            regionValue336 = regionNext352;
            regionValue337 = regionNext353;
            break region85;
        }
        }
        if (regionValue337 != 0) {
            java.lang.Object regionNext368 = regionValue322;
            int regionNext369 = regionValue323;
            int regionNext370 = regionValue324;
            int regionNext371 = regionValue325;
            long regionNext372 = regionValue326;
            long regionNext373 = regionValue327;
            long regionNext374 = regionValue328;
            int regionNext375 = regionValue329;
            long regionNext376 = regionValue330;
            long regionNext377 = regionValue331;
            long regionNext378 = regionValue333;
            long regionNext379 = regionValue334;
            int regionNext380 = regionValue335;
            int regionNext381 = regionValue336;
            regionValue354 = regionNext368;
            regionValue355 = regionNext369;
            regionValue356 = regionNext370;
            regionValue357 = regionNext371;
            regionValue358 = regionNext372;
            regionValue359 = regionNext373;
            regionValue360 = regionNext374;
            regionValue361 = regionNext375;
            regionValue362 = regionNext376;
            regionValue363 = regionNext377;
            regionValue364 = regionNext378;
            regionValue365 = regionNext379;
            regionValue366 = regionNext380;
            regionValue367 = regionNext381;
            break region100;
        } else {
            java.lang.Object regionNext397 = regionValue322;
            int regionNext398 = regionValue323;
            int regionNext399 = regionValue324;
            int regionNext400 = regionValue325;
            long regionNext401 = regionValue326;
            long regionNext402 = regionValue327;
            long regionNext403 = regionValue328;
            int regionNext404 = regionValue329;
            long regionNext405 = regionValue330;
            long regionNext406 = regionValue331;
            long regionNext407 = regionValue332;
            long regionNext408 = regionValue333;
            long regionNext409 = regionValue334;
            int regionNext410 = regionValue335;
            int regionNext411 = regionValue336;
            regionValue382 = regionNext397;
            regionValue383 = regionNext398;
            regionValue384 = regionNext399;
            regionValue385 = regionNext400;
            regionValue386 = regionNext401;
            regionValue387 = regionNext402;
            regionValue388 = regionNext403;
            regionValue389 = regionNext404;
            regionValue390 = regionNext405;
            regionValue391 = regionNext406;
            regionValue392 = regionNext407;
            regionValue393 = regionNext408;
            regionValue394 = regionNext409;
            regionValue395 = regionNext410;
            regionValue396 = regionNext411;
            break region86;
        }
        }
        java.lang.Object regionNext427 = regionValue382;
        int regionNext428 = regionValue383;
        int regionNext429 = regionValue384;
        int regionNext430 = regionValue385;
        long regionNext431 = regionValue386;
        long regionNext432 = regionValue387;
        long regionNext433 = regionValue388;
        int regionNext434 = regionValue389;
        long regionNext435 = regionValue390;
        long regionNext436 = regionValue391;
        long regionNext437 = regionValue392;
        long regionNext438 = regionValue393;
        long regionNext439 = regionValue394;
        int regionNext440 = regionValue395;
        int regionNext441 = regionValue396;
        regionValue412 = regionNext427;
        regionValue413 = regionNext428;
        regionValue414 = regionNext429;
        regionValue415 = regionNext430;
        regionValue416 = regionNext431;
        regionValue417 = regionNext432;
        regionValue418 = regionNext433;
        regionValue419 = regionNext434;
        regionValue420 = regionNext435;
        regionValue421 = regionNext436;
        regionValue422 = regionNext437;
        regionValue423 = regionNext438;
        regionValue424 = regionNext439;
        regionValue425 = regionNext440;
        regionValue426 = regionNext441;
        break region88;
        }
        java.lang.Object regionNext442 = regionValue412;
        int regionNext443 = regionValue413;
        int regionNext444 = regionValue414;
        int regionNext445 = regionValue415;
        long regionNext446 = regionValue416;
        long regionNext447 = regionValue417;
        long regionNext448 = regionValue418;
        int regionNext449 = regionValue419;
        long regionNext450 = regionValue420;
        long regionNext451 = regionValue421;
        long regionNext452 = regionValue422;
        long regionNext453 = regionValue423;
        long regionNext454 = regionValue424;
        int regionNext455 = regionValue425;
        int regionNext456 = regionValue426;
        int regionNext457 = 10;
        regionValue290 = regionNext442;
        regionValue291 = regionNext443;
        regionValue292 = regionNext444;
        regionValue293 = regionNext445;
        regionValue294 = regionNext446;
        regionValue295 = regionNext447;
        regionValue296 = regionNext448;
        regionValue297 = regionNext449;
        regionValue298 = regionNext450;
        regionValue299 = regionNext451;
        regionValue300 = regionNext452;
        regionValue301 = regionNext453;
        regionValue302 = regionNext454;
        regionValue303 = regionNext455;
        regionValue304 = regionNext456;
        regionValue305 = regionNext457;
        break region89;
        }
        if (regionValue304 != regionValue305) {
            java.lang.Object regionNext458 = regionValue290;
            int regionNext459 = regionValue291;
            int regionNext460 = regionValue292;
            int regionNext461 = regionValue293;
            long regionNext462 = regionValue294;
            long regionNext463 = regionValue295;
            long regionNext464 = regionValue296;
            int regionNext465 = regionValue297;
            long regionNext466 = regionValue298;
            long regionNext467 = regionValue299;
            long regionNext468 = regionValue300;
            long regionNext469 = regionValue301;
            long regionNext470 = regionValue302;
            int regionNext471 = regionValue303;
            regionValue189 = regionNext458;
            regionValue190 = regionNext459;
            regionValue191 = regionNext460;
            regionValue192 = regionNext461;
            regionValue193 = regionNext462;
            regionValue194 = regionNext463;
            regionValue195 = regionNext464;
            regionValue196 = regionNext465;
            regionValue197 = regionNext466;
            regionValue198 = regionNext467;
            regionValue199 = regionNext468;
            regionValue200 = regionNext469;
            regionValue201 = regionNext470;
            regionValue202 = regionNext471;
            break region95;
        } else {
            java.lang.Object regionNext486 = regionValue290;
            int regionNext487 = regionValue291;
            int regionNext488 = regionValue292;
            int regionNext489 = regionValue293;
            long regionNext490 = regionValue294;
            long regionNext491 = regionValue295;
            long regionNext492 = regionValue296;
            int regionNext493 = regionValue297;
            long regionNext494 = regionValue298;
            long regionNext495 = regionValue299;
            long regionNext496 = regionValue300;
            long regionNext497 = regionValue301;
            long regionNext498 = regionValue302;
            int regionNext499 = regionValue303;
            regionValue472 = regionNext486;
            regionValue473 = regionNext487;
            regionValue474 = regionNext488;
            regionValue475 = regionNext489;
            regionValue476 = regionNext490;
            regionValue477 = regionNext491;
            regionValue478 = regionNext492;
            regionValue479 = regionNext493;
            regionValue480 = regionNext494;
            regionValue481 = regionNext495;
            regionValue482 = regionNext496;
            regionValue483 = regionNext497;
            regionValue484 = regionNext498;
            regionValue485 = regionNext499;
            break region90;
        }
        }
        recovery$indy$flow$1124(regionValue472, false);
        java.lang.Object regionNext500 = regionValue472;
        int regionNext501 = regionValue473;
        int regionNext502 = regionValue474;
        int regionNext503 = regionValue475;
        long regionNext504 = regionValue476;
        long regionNext505 = regionValue477;
        long regionNext506 = regionValue478;
        int regionNext507 = regionValue479;
        long regionNext508 = regionValue480;
        long regionNext509 = regionValue481;
        long regionNext510 = regionValue482;
        long regionNext511 = regionValue483;
        long regionNext512 = regionValue484;
        int regionNext513 = regionValue485;
        regionValue189 = regionNext500;
        regionValue190 = regionNext501;
        regionValue191 = regionNext502;
        regionValue192 = regionNext503;
        regionValue193 = regionNext504;
        regionValue194 = regionNext505;
        regionValue195 = regionNext506;
        regionValue196 = regionNext507;
        regionValue197 = regionNext508;
        regionValue198 = regionNext509;
        regionValue199 = regionNext510;
        regionValue200 = regionNext511;
        regionValue201 = regionNext512;
        regionValue202 = regionNext513;
        break region95;
        }
        java.lang.Object regionNext514 = regionValue189;
        int regionNext515 = regionValue190;
        int regionNext516 = regionValue191;
        int regionNext517 = regionValue192;
        long regionNext518 = regionValue193;
        long regionNext519 = regionValue194;
        long regionNext520 = regionValue195;
        int regionNext521 = regionValue196;
        long regionNext522 = regionValue197;
        long regionNext523 = regionValue198;
        long regionNext524 = regionValue199;
        long regionNext525 = regionValue200;
        long regionNext526 = regionValue201;
        int regionNext527 = regionValue202;
        java.lang.Object regionNext528 = regionValue189;
        regionValue38 = regionNext514;
        regionValue39 = regionNext515;
        regionValue40 = regionNext516;
        regionValue41 = regionNext517;
        regionValue42 = regionNext518;
        regionValue43 = regionNext519;
        regionValue44 = regionNext520;
        regionValue45 = regionNext521;
        regionValue46 = regionNext522;
        regionValue47 = regionNext523;
        regionValue48 = regionNext524;
        regionValue49 = regionNext525;
        regionValue50 = regionNext526;
        regionValue51 = regionNext527;
        regionValue52 = regionNext528;
        break region96;
        }
        int initialValue529 = recovery$indy$flow$1125(regionValue52, regionValue48, 3387674880871596235L, regionValue42);
        java.lang.Object regionNext530 = regionValue38;
        int regionNext531 = regionValue39;
        int regionNext532 = regionValue40;
        int regionNext533 = regionValue41;
        long regionNext534 = regionValue42;
        long regionNext535 = regionValue43;
        long regionNext536 = regionValue44;
        int regionNext537 = regionValue45;
        long regionNext538 = regionValue46;
        long regionNext539 = regionValue47;
        long regionNext540 = regionValue49;
        long regionNext541 = regionValue50;
        int regionNext542 = regionValue51;
        int regionNext543 = initialValue529;
        regionValue354 = regionNext530;
        regionValue355 = regionNext531;
        regionValue356 = regionNext532;
        regionValue357 = regionNext533;
        regionValue358 = regionNext534;
        regionValue359 = regionNext535;
        regionValue360 = regionNext536;
        regionValue361 = regionNext537;
        regionValue362 = regionNext538;
        regionValue363 = regionNext539;
        regionValue364 = regionNext540;
        regionValue365 = regionNext541;
        regionValue366 = regionNext542;
        regionValue367 = regionNext543;
        break region100;
        }
        int initialValue544 = regionValue367;
        boolean initialValue545 = recovery$indy$flow$1126(regionValue354);
        if (regionValue357 <= 0) {
            java.lang.Object regionNext562 = regionValue354;
            int regionNext563 = regionValue355;
            int regionNext564 = regionValue356;
            int regionNext565 = regionValue357;
            long regionNext566 = regionValue358;
            long regionNext567 = regionValue359;
            long regionNext568 = regionValue360;
            int regionNext569 = regionValue361;
            long regionNext570 = regionValue362;
            long regionNext571 = regionValue363;
            long regionNext572 = regionValue364;
            long regionNext573 = regionValue365;
            int regionNext574 = regionValue366;
            int regionNext575 = initialValue544;
            int regionNext576 = (int) ((initialValue545 ? 1 : 0));
            int regionNext577 = regionValue366;
            regionValue546 = regionNext562;
            regionValue547 = regionNext563;
            regionValue548 = regionNext564;
            regionValue549 = regionNext565;
            regionValue550 = regionNext566;
            regionValue551 = regionNext567;
            regionValue552 = regionNext568;
            regionValue553 = regionNext569;
            regionValue554 = regionNext570;
            regionValue555 = regionNext571;
            regionValue556 = regionNext572;
            regionValue557 = regionNext573;
            regionValue558 = regionNext574;
            regionValue559 = regionNext575;
            regionValue560 = regionNext576;
            regionValue561 = regionNext577;
            break region145;
        } else {
            java.lang.Object regionNext594 = regionValue354;
            int regionNext595 = regionValue355;
            int regionNext596 = regionValue356;
            int regionNext597 = regionValue357;
            long regionNext598 = regionValue358;
            long regionNext599 = regionValue359;
            long regionNext600 = regionValue360;
            int regionNext601 = regionValue361;
            long regionNext602 = regionValue362;
            long regionNext603 = regionValue363;
            long regionNext604 = regionValue364;
            long regionNext605 = regionValue365;
            int regionNext606 = regionValue366;
            int regionNext607 = initialValue544;
            int regionNext608 = (int) ((initialValue545 ? 1 : 0));
            int regionNext609 = regionValue366;
            regionValue578 = regionNext594;
            regionValue579 = regionNext595;
            regionValue580 = regionNext596;
            regionValue581 = regionNext597;
            regionValue582 = regionNext598;
            regionValue583 = regionNext599;
            regionValue584 = regionNext600;
            regionValue585 = regionNext601;
            regionValue586 = regionNext602;
            regionValue587 = regionNext603;
            regionValue588 = regionNext604;
            regionValue589 = regionNext605;
            regionValue590 = regionNext606;
            regionValue591 = regionNext607;
            regionValue592 = regionNext608;
            regionValue593 = regionNext609;
            break region106;
        }
        }
        if (regionValue593 != 0) {
            java.lang.Object regionNext625 = regionValue578;
            int regionNext626 = regionValue579;
            int regionNext627 = regionValue580;
            int regionNext628 = regionValue581;
            long regionNext629 = regionValue582;
            long regionNext630 = regionValue583;
            long regionNext631 = regionValue584;
            int regionNext632 = regionValue585;
            long regionNext633 = regionValue586;
            long regionNext634 = regionValue587;
            long regionNext635 = regionValue588;
            long regionNext636 = regionValue589;
            int regionNext637 = regionValue590;
            int regionNext638 = regionValue591;
            int regionNext639 = regionValue592;
            regionValue610 = regionNext625;
            regionValue611 = regionNext626;
            regionValue612 = regionNext627;
            regionValue613 = regionNext628;
            regionValue614 = regionNext629;
            regionValue615 = regionNext630;
            regionValue616 = regionNext631;
            regionValue617 = regionNext632;
            regionValue618 = regionNext633;
            regionValue619 = regionNext634;
            regionValue620 = regionNext635;
            regionValue621 = regionNext636;
            regionValue622 = regionNext637;
            regionValue623 = regionNext638;
            regionValue624 = regionNext639;
            break region144;
        } else {
            java.lang.Object regionNext655 = regionValue578;
            int regionNext656 = regionValue579;
            int regionNext657 = regionValue580;
            int regionNext658 = regionValue581;
            long regionNext659 = regionValue582;
            long regionNext660 = regionValue583;
            long regionNext661 = regionValue584;
            int regionNext662 = regionValue585;
            long regionNext663 = regionValue586;
            long regionNext664 = regionValue587;
            long regionNext665 = regionValue588;
            long regionNext666 = regionValue589;
            int regionNext667 = regionValue590;
            int regionNext668 = regionValue591;
            int regionNext669 = regionValue592;
            regionValue640 = regionNext655;
            regionValue641 = regionNext656;
            regionValue642 = regionNext657;
            regionValue643 = regionNext658;
            regionValue644 = regionNext659;
            regionValue645 = regionNext660;
            regionValue646 = regionNext661;
            regionValue647 = regionNext662;
            regionValue648 = regionNext663;
            regionValue649 = regionNext664;
            regionValue650 = regionNext665;
            regionValue651 = regionNext666;
            regionValue652 = regionNext667;
            regionValue653 = regionNext668;
            regionValue654 = regionNext669;
            break region107;
        }
        }
        java.lang.Object regionNext685 = regionValue640;
        int regionNext686 = regionValue641;
        int regionNext687 = regionValue642;
        int regionNext688 = regionValue643;
        long regionNext689 = regionValue644;
        long regionNext690 = regionValue645;
        long regionNext691 = regionValue646;
        int regionNext692 = regionValue647;
        long regionNext693 = regionValue648;
        long regionNext694 = regionValue649;
        long regionNext695 = regionValue650;
        long regionNext696 = regionValue651;
        int regionNext697 = regionValue652;
        int regionNext698 = regionValue653;
        int regionNext699 = regionValue654;
        regionValue670 = regionNext685;
        regionValue671 = regionNext686;
        regionValue672 = regionNext687;
        regionValue673 = regionNext688;
        regionValue674 = regionNext689;
        regionValue675 = regionNext690;
        regionValue676 = regionNext691;
        regionValue677 = regionNext692;
        regionValue678 = regionNext693;
        regionValue679 = regionNext694;
        regionValue680 = regionNext695;
        regionValue681 = regionNext696;
        regionValue682 = regionNext697;
        regionValue683 = regionNext698;
        regionValue684 = regionNext699;
        break region109;
        }
        if (regionValue684 == 0) {
            java.lang.Object regionNext714 = regionValue670;
            int regionNext715 = regionValue671;
            int regionNext716 = regionValue672;
            int regionNext717 = regionValue673;
            long regionNext718 = regionValue674;
            long regionNext719 = regionValue675;
            long regionNext720 = regionValue676;
            int regionNext721 = regionValue677;
            long regionNext722 = regionValue678;
            long regionNext723 = regionValue679;
            long regionNext724 = regionValue680;
            long regionNext725 = regionValue681;
            int regionNext726 = regionValue682;
            int regionNext727 = regionValue683;
            regionValue700 = regionNext714;
            regionValue701 = regionNext715;
            regionValue702 = regionNext716;
            regionValue703 = regionNext717;
            regionValue704 = regionNext718;
            regionValue705 = regionNext719;
            regionValue706 = regionNext720;
            regionValue707 = regionNext721;
            regionValue708 = regionNext722;
            regionValue709 = regionNext723;
            regionValue710 = regionNext724;
            regionValue711 = regionNext725;
            regionValue712 = regionNext726;
            regionValue713 = regionNext727;
            break region139;
        } else {
            java.lang.Object regionNext742 = regionValue670;
            int regionNext743 = regionValue671;
            int regionNext744 = regionValue672;
            int regionNext745 = regionValue673;
            long regionNext746 = regionValue674;
            long regionNext747 = regionValue675;
            long regionNext748 = regionValue676;
            int regionNext749 = regionValue677;
            long regionNext750 = regionValue678;
            long regionNext751 = regionValue679;
            long regionNext752 = regionValue680;
            long regionNext753 = regionValue681;
            int regionNext754 = regionValue682;
            int regionNext755 = regionValue683;
            regionValue728 = regionNext742;
            regionValue729 = regionNext743;
            regionValue730 = regionNext744;
            regionValue731 = regionNext745;
            regionValue732 = regionNext746;
            regionValue733 = regionNext747;
            regionValue734 = regionNext748;
            regionValue735 = regionNext749;
            regionValue736 = regionNext750;
            regionValue737 = regionNext751;
            regionValue738 = regionNext752;
            regionValue739 = regionNext753;
            regionValue740 = regionNext754;
            regionValue741 = regionNext755;
            break region110;
        }
        }
        if (regionValue740 != 0) {
            java.lang.Object regionNext771 = regionValue728;
            int regionNext772 = regionValue729;
            int regionNext773 = regionValue730;
            int regionNext774 = regionValue731;
            long regionNext775 = regionValue732;
            long regionNext776 = regionValue733;
            long regionNext777 = regionValue734;
            int regionNext778 = regionValue735;
            long regionNext779 = regionValue736;
            long regionNext780 = regionValue737;
            long regionNext781 = regionValue738;
            long regionNext782 = regionValue739;
            int regionNext783 = regionValue740;
            int regionNext784 = regionValue741;
            int regionNext785 = regionValue741;
            regionValue756 = regionNext771;
            regionValue757 = regionNext772;
            regionValue758 = regionNext773;
            regionValue759 = regionNext774;
            regionValue760 = regionNext775;
            regionValue761 = regionNext776;
            regionValue762 = regionNext777;
            regionValue763 = regionNext778;
            regionValue764 = regionNext779;
            regionValue765 = regionNext780;
            regionValue766 = regionNext781;
            regionValue767 = regionNext782;
            regionValue768 = regionNext783;
            regionValue769 = regionNext784;
            regionValue770 = regionNext785;
            break region133;
        } else {
            java.lang.Object regionNext801 = regionValue728;
            int regionNext802 = regionValue729;
            int regionNext803 = regionValue730;
            int regionNext804 = regionValue731;
            long regionNext805 = regionValue732;
            long regionNext806 = regionValue733;
            long regionNext807 = regionValue734;
            int regionNext808 = regionValue735;
            long regionNext809 = regionValue736;
            long regionNext810 = regionValue737;
            long regionNext811 = regionValue738;
            long regionNext812 = regionValue739;
            int regionNext813 = regionValue740;
            int regionNext814 = regionValue741;
            int regionNext815 = regionValue741;
            regionValue786 = regionNext801;
            regionValue787 = regionNext802;
            regionValue788 = regionNext803;
            regionValue789 = regionNext804;
            regionValue790 = regionNext805;
            regionValue791 = regionNext806;
            regionValue792 = regionNext807;
            regionValue793 = regionNext808;
            regionValue794 = regionNext809;
            regionValue795 = regionNext810;
            regionValue796 = regionNext811;
            regionValue797 = regionNext812;
            regionValue798 = regionNext813;
            regionValue799 = regionNext814;
            regionValue800 = regionNext815;
            break region113;
        }
        }
        java.lang.Object regionNext831 = regionValue786;
        int regionNext832 = regionValue787;
        int regionNext833 = regionValue788;
        int regionNext834 = regionValue789;
        long regionNext835 = regionValue790;
        long regionNext836 = regionValue791;
        long regionNext837 = regionValue792;
        int regionNext838 = regionValue793;
        long regionNext839 = regionValue794;
        long regionNext840 = regionValue795;
        long regionNext841 = regionValue796;
        long regionNext842 = regionValue797;
        int regionNext843 = regionValue798;
        int regionNext844 = regionValue799;
        int regionNext845 = regionValue800;
        regionValue816 = regionNext831;
        regionValue817 = regionNext832;
        regionValue818 = regionNext833;
        regionValue819 = regionNext834;
        regionValue820 = regionNext835;
        regionValue821 = regionNext836;
        regionValue822 = regionNext837;
        regionValue823 = regionNext838;
        regionValue824 = regionNext839;
        regionValue825 = regionNext840;
        regionValue826 = regionNext841;
        regionValue827 = regionNext842;
        regionValue828 = regionNext843;
        regionValue829 = regionNext844;
        regionValue830 = regionNext845;
        break region115;
        }
        if (regionValue830 > 0) {
            java.lang.Object regionNext860 = regionValue816;
            int regionNext861 = regionValue817;
            int regionNext862 = regionValue818;
            int regionNext863 = regionValue819;
            long regionNext864 = regionValue820;
            long regionNext865 = regionValue821;
            long regionNext866 = regionValue822;
            int regionNext867 = regionValue823;
            long regionNext868 = regionValue824;
            long regionNext869 = regionValue825;
            long regionNext870 = regionValue826;
            long regionNext871 = regionValue827;
            int regionNext872 = regionValue828;
            int regionNext873 = regionValue829;
            regionValue846 = regionNext860;
            regionValue847 = regionNext861;
            regionValue848 = regionNext862;
            regionValue849 = regionNext863;
            regionValue850 = regionNext864;
            regionValue851 = regionNext865;
            regionValue852 = regionNext866;
            regionValue853 = regionNext867;
            regionValue854 = regionNext868;
            regionValue855 = regionNext869;
            regionValue856 = regionNext870;
            regionValue857 = regionNext871;
            regionValue858 = regionNext872;
            regionValue859 = regionNext873;
            break region136;
        } else {
            java.lang.Object regionNext888 = regionValue816;
            int regionNext889 = regionValue817;
            int regionNext890 = regionValue818;
            int regionNext891 = regionValue819;
            long regionNext892 = regionValue820;
            long regionNext893 = regionValue821;
            long regionNext894 = regionValue822;
            int regionNext895 = regionValue823;
            long regionNext896 = regionValue824;
            long regionNext897 = regionValue825;
            long regionNext898 = regionValue826;
            long regionNext899 = regionValue827;
            int regionNext900 = regionValue828;
            int regionNext901 = regionValue829;
            regionValue874 = regionNext888;
            regionValue875 = regionNext889;
            regionValue876 = regionNext890;
            regionValue877 = regionNext891;
            regionValue878 = regionNext892;
            regionValue879 = regionNext893;
            regionValue880 = regionNext894;
            regionValue881 = regionNext895;
            regionValue882 = regionNext896;
            regionValue883 = regionNext897;
            regionValue884 = regionNext898;
            regionValue885 = regionNext899;
            regionValue886 = regionNext900;
            regionValue887 = regionNext901;
            break region116;
        }
        }
        java.lang.Object regionNext916 = regionValue874;
        int regionNext917 = regionValue875;
        int regionNext918 = regionValue876;
        int regionNext919 = regionValue877;
        long regionNext920 = regionValue878;
        long regionNext921 = regionValue879;
        long regionNext922 = regionValue880;
        int regionNext923 = regionValue881;
        long regionNext924 = regionValue882;
        long regionNext925 = regionValue883;
        long regionNext926 = regionValue884;
        long regionNext927 = regionValue885;
        int regionNext928 = regionValue886;
        int regionNext929 = regionValue887;
        regionValue902 = regionNext916;
        regionValue903 = regionNext917;
        regionValue904 = regionNext918;
        regionValue905 = regionNext919;
        regionValue906 = regionNext920;
        regionValue907 = regionNext921;
        regionValue908 = regionNext922;
        regionValue909 = regionNext923;
        regionValue910 = regionNext924;
        regionValue911 = regionNext925;
        regionValue912 = regionNext926;
        regionValue913 = regionNext927;
        regionValue914 = regionNext928;
        regionValue915 = regionNext929;
        break region118;
        }
        if (regionValue905 <= 0) {
            java.lang.Object regionNext946 = regionValue902;
            int regionNext947 = regionValue903;
            int regionNext948 = regionValue904;
            int regionNext949 = regionValue905;
            long regionNext950 = regionValue906;
            long regionNext951 = regionValue907;
            long regionNext952 = regionValue908;
            int regionNext953 = regionValue909;
            long regionNext954 = regionValue910;
            long regionNext955 = regionValue911;
            long regionNext956 = regionValue912;
            long regionNext957 = regionValue913;
            int regionNext958 = regionValue914;
            int regionNext959 = regionValue915;
            java.lang.Object regionNext960 = regionValue902;
            int regionNext961 = regionValue914;
            regionValue930 = regionNext946;
            regionValue931 = regionNext947;
            regionValue932 = regionNext948;
            regionValue933 = regionNext949;
            regionValue934 = regionNext950;
            regionValue935 = regionNext951;
            regionValue936 = regionNext952;
            regionValue937 = regionNext953;
            regionValue938 = regionNext954;
            regionValue939 = regionNext955;
            regionValue940 = regionNext956;
            regionValue941 = regionNext957;
            regionValue942 = regionNext958;
            regionValue943 = regionNext959;
            regionValue944 = regionNext960;
            regionValue945 = regionNext961;
            break region138;
        } else {
            java.lang.Object regionNext978 = regionValue902;
            int regionNext979 = regionValue903;
            int regionNext980 = regionValue904;
            int regionNext981 = regionValue905;
            long regionNext982 = regionValue906;
            long regionNext983 = regionValue907;
            long regionNext984 = regionValue908;
            int regionNext985 = regionValue909;
            long regionNext986 = regionValue910;
            long regionNext987 = regionValue911;
            long regionNext988 = regionValue912;
            long regionNext989 = regionValue913;
            int regionNext990 = regionValue914;
            int regionNext991 = regionValue915;
            java.lang.Object regionNext992 = regionValue902;
            int regionNext993 = regionValue914;
            regionValue962 = regionNext978;
            regionValue963 = regionNext979;
            regionValue964 = regionNext980;
            regionValue965 = regionNext981;
            regionValue966 = regionNext982;
            regionValue967 = regionNext983;
            regionValue968 = regionNext984;
            regionValue969 = regionNext985;
            regionValue970 = regionNext986;
            regionValue971 = regionNext987;
            regionValue972 = regionNext988;
            regionValue973 = regionNext989;
            regionValue974 = regionNext990;
            regionValue975 = regionNext991;
            regionValue976 = regionNext992;
            regionValue977 = regionNext993;
            break region122;
        }
        }
        java.lang.Object regionNext1010 = regionValue962;
        int regionNext1011 = regionValue963;
        int regionNext1012 = regionValue964;
        int regionNext1013 = regionValue965;
        long regionNext1014 = regionValue966;
        long regionNext1015 = regionValue967;
        long regionNext1016 = regionValue968;
        int regionNext1017 = regionValue969;
        long regionNext1018 = regionValue970;
        long regionNext1019 = regionValue971;
        long regionNext1020 = regionValue972;
        long regionNext1021 = regionValue973;
        int regionNext1022 = regionValue974;
        int regionNext1023 = regionValue975;
        java.lang.Object regionNext1024 = regionValue976;
        int regionNext1025 = regionValue977;
        regionValue994 = regionNext1010;
        regionValue995 = regionNext1011;
        regionValue996 = regionNext1012;
        regionValue997 = regionNext1013;
        regionValue998 = regionNext1014;
        regionValue999 = regionNext1015;
        regionValue1000 = regionNext1016;
        regionValue1001 = regionNext1017;
        regionValue1002 = regionNext1018;
        regionValue1003 = regionNext1019;
        regionValue1004 = regionNext1020;
        regionValue1005 = regionNext1021;
        regionValue1006 = regionNext1022;
        regionValue1007 = regionNext1023;
        regionValue1008 = regionNext1024;
        regionValue1009 = regionNext1025;
        break region124;
        }
        if (regionValue1009 != 0) {
            java.lang.Object regionNext1041 = regionValue994;
            int regionNext1042 = regionValue995;
            int regionNext1043 = regionValue996;
            int regionNext1044 = regionValue997;
            long regionNext1045 = regionValue998;
            long regionNext1046 = regionValue999;
            long regionNext1047 = regionValue1000;
            int regionNext1048 = regionValue1001;
            long regionNext1049 = regionValue1002;
            long regionNext1050 = regionValue1003;
            long regionNext1051 = regionValue1004;
            long regionNext1052 = regionValue1005;
            int regionNext1053 = regionValue1006;
            int regionNext1054 = regionValue1007;
            java.lang.Object regionNext1055 = regionValue1008;
            regionValue1026 = regionNext1041;
            regionValue1027 = regionNext1042;
            regionValue1028 = regionNext1043;
            regionValue1029 = regionNext1044;
            regionValue1030 = regionNext1045;
            regionValue1031 = regionNext1046;
            regionValue1032 = regionNext1047;
            regionValue1033 = regionNext1048;
            regionValue1034 = regionNext1049;
            regionValue1035 = regionNext1050;
            regionValue1036 = regionNext1051;
            regionValue1037 = regionNext1052;
            regionValue1038 = regionNext1053;
            regionValue1039 = regionNext1054;
            regionValue1040 = regionNext1055;
            break region137;
        } else {
            java.lang.Object regionNext1071 = regionValue994;
            int regionNext1072 = regionValue995;
            int regionNext1073 = regionValue996;
            int regionNext1074 = regionValue997;
            long regionNext1075 = regionValue998;
            long regionNext1076 = regionValue999;
            long regionNext1077 = regionValue1000;
            int regionNext1078 = regionValue1001;
            long regionNext1079 = regionValue1002;
            long regionNext1080 = regionValue1003;
            long regionNext1081 = regionValue1004;
            long regionNext1082 = regionValue1005;
            int regionNext1083 = regionValue1006;
            int regionNext1084 = regionValue1007;
            java.lang.Object regionNext1085 = regionValue1008;
            regionValue1056 = regionNext1071;
            regionValue1057 = regionNext1072;
            regionValue1058 = regionNext1073;
            regionValue1059 = regionNext1074;
            regionValue1060 = regionNext1075;
            regionValue1061 = regionNext1076;
            regionValue1062 = regionNext1077;
            regionValue1063 = regionNext1078;
            regionValue1064 = regionNext1079;
            regionValue1065 = regionNext1080;
            regionValue1066 = regionNext1081;
            regionValue1067 = regionNext1082;
            regionValue1068 = regionNext1083;
            regionValue1069 = regionNext1084;
            regionValue1070 = regionNext1085;
            break region125;
        }
        }
        java.lang.Object regionNext1101 = regionValue1056;
        int regionNext1102 = regionValue1057;
        int regionNext1103 = regionValue1058;
        int regionNext1104 = regionValue1059;
        long regionNext1105 = regionValue1060;
        long regionNext1106 = regionValue1061;
        long regionNext1107 = regionValue1062;
        int regionNext1108 = regionValue1063;
        long regionNext1109 = regionValue1064;
        long regionNext1110 = regionValue1065;
        long regionNext1111 = regionValue1066;
        long regionNext1112 = regionValue1067;
        int regionNext1113 = regionValue1068;
        int regionNext1114 = regionValue1069;
        java.lang.Object regionNext1115 = regionValue1070;
        regionValue1086 = regionNext1101;
        regionValue1087 = regionNext1102;
        regionValue1088 = regionNext1103;
        regionValue1089 = regionNext1104;
        regionValue1090 = regionNext1105;
        regionValue1091 = regionNext1106;
        regionValue1092 = regionNext1107;
        regionValue1093 = regionNext1108;
        regionValue1094 = regionNext1109;
        regionValue1095 = regionNext1110;
        regionValue1096 = regionNext1111;
        regionValue1097 = regionNext1112;
        regionValue1098 = regionNext1113;
        regionValue1099 = regionNext1114;
        regionValue1100 = regionNext1115;
        break region127;
        }
        java.lang.Object initialValue1116 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue1100)))).settingOnlyOnClick));
        boolean initialValue1117 = recovery$indy$flow$1128(initialValue1116, 3402585320628080900L, regionValue1090);
        java.lang.Object regionNext1118 = regionValue1086;
        int regionNext1119 = regionValue1087;
        int regionNext1120 = regionValue1088;
        int regionNext1121 = regionValue1089;
        long regionNext1122 = regionValue1090;
        long regionNext1123 = regionValue1091;
        long regionNext1124 = regionValue1092;
        int regionNext1125 = regionValue1093;
        long regionNext1126 = regionValue1094;
        long regionNext1127 = regionValue1095;
        long regionNext1128 = regionValue1096;
        long regionNext1129 = regionValue1097;
        int regionNext1130 = regionValue1098;
        int regionNext1131 = regionValue1099;
        int regionNext1132 = (int) ((initialValue1117 ? 1 : 0));
        regionValue756 = regionNext1118;
        regionValue757 = regionNext1119;
        regionValue758 = regionNext1120;
        regionValue759 = regionNext1121;
        regionValue760 = regionNext1122;
        regionValue761 = regionNext1123;
        regionValue762 = regionNext1124;
        regionValue763 = regionNext1125;
        regionValue764 = regionNext1126;
        regionValue765 = regionNext1127;
        regionValue766 = regionNext1128;
        regionValue767 = regionNext1129;
        regionValue768 = regionNext1130;
        regionValue769 = regionNext1131;
        regionValue770 = regionNext1132;
        break region133;
        }
        if (regionValue770 != 0) {
            java.lang.Object regionNext1133 = regionValue756;
            int regionNext1134 = regionValue757;
            int regionNext1135 = regionValue758;
            int regionNext1136 = regionValue759;
            long regionNext1137 = regionValue760;
            long regionNext1138 = regionValue761;
            long regionNext1139 = regionValue762;
            int regionNext1140 = regionValue763;
            long regionNext1141 = regionValue764;
            long regionNext1142 = regionValue765;
            long regionNext1143 = regionValue766;
            long regionNext1144 = regionValue767;
            int regionNext1145 = regionValue768;
            int regionNext1146 = regionValue769;
            regionValue846 = regionNext1133;
            regionValue847 = regionNext1134;
            regionValue848 = regionNext1135;
            regionValue849 = regionNext1136;
            regionValue850 = regionNext1137;
            regionValue851 = regionNext1138;
            regionValue852 = regionNext1139;
            regionValue853 = regionNext1140;
            regionValue854 = regionNext1141;
            regionValue855 = regionNext1142;
            regionValue856 = regionNext1143;
            regionValue857 = regionNext1144;
            regionValue858 = regionNext1145;
            regionValue859 = regionNext1146;
            break region136;
        } else {
            java.lang.Object regionNext1160 = regionValue756;
            int regionNext1161 = regionValue757;
            int regionNext1162 = regionValue758;
            int regionNext1163 = regionValue759;
            long regionNext1164 = regionValue760;
            long regionNext1165 = regionValue761;
            long regionNext1166 = regionValue762;
            int regionNext1167 = regionValue763;
            long regionNext1168 = regionValue764;
            long regionNext1169 = regionValue765;
            long regionNext1170 = regionValue766;
            long regionNext1171 = regionValue767;
            int regionNext1172 = regionValue768;
            regionValue1147 = regionNext1160;
            regionValue1148 = regionNext1161;
            regionValue1149 = regionNext1162;
            regionValue1150 = regionNext1163;
            regionValue1151 = regionNext1164;
            regionValue1152 = regionNext1165;
            regionValue1153 = regionNext1166;
            regionValue1154 = regionNext1167;
            regionValue1155 = regionNext1168;
            regionValue1156 = regionNext1169;
            regionValue1157 = regionNext1170;
            regionValue1158 = regionNext1171;
            regionValue1159 = regionNext1172;
            break region134;
        }
        }
        int initialValue1173 = 1;
        java.lang.Object regionNext1174 = regionValue1147;
        int regionNext1175 = regionValue1148;
        int regionNext1176 = regionValue1149;
        int regionNext1177 = regionValue1150;
        long regionNext1178 = regionValue1151;
        long regionNext1179 = regionValue1152;
        long regionNext1180 = regionValue1153;
        int regionNext1181 = regionValue1154;
        long regionNext1182 = regionValue1155;
        long regionNext1183 = regionValue1156;
        long regionNext1184 = regionValue1157;
        long regionNext1185 = regionValue1158;
        int regionNext1186 = regionValue1159;
        int regionNext1187 = initialValue1173;
        regionValue846 = regionNext1174;
        regionValue847 = regionNext1175;
        regionValue848 = regionNext1176;
        regionValue849 = regionNext1177;
        regionValue850 = regionNext1178;
        regionValue851 = regionNext1179;
        regionValue852 = regionNext1180;
        regionValue853 = regionNext1181;
        regionValue854 = regionNext1182;
        regionValue855 = regionNext1183;
        regionValue856 = regionNext1184;
        regionValue857 = regionNext1185;
        regionValue858 = regionNext1186;
        regionValue859 = regionNext1187;
        break region136;
        }
        java.lang.Object regionNext1188 = regionValue846;
        int regionNext1189 = regionValue847;
        int regionNext1190 = regionValue848;
        int regionNext1191 = regionValue849;
        long regionNext1192 = regionValue850;
        long regionNext1193 = regionValue851;
        long regionNext1194 = regionValue852;
        int regionNext1195 = regionValue853;
        long regionNext1196 = regionValue854;
        long regionNext1197 = regionValue855;
        long regionNext1198 = regionValue856;
        long regionNext1199 = regionValue857;
        int regionNext1200 = regionValue858;
        int regionNext1201 = regionValue859;
        java.lang.Object regionNext1202 = regionValue846;
        regionValue1026 = regionNext1188;
        regionValue1027 = regionNext1189;
        regionValue1028 = regionNext1190;
        regionValue1029 = regionNext1191;
        regionValue1030 = regionNext1192;
        regionValue1031 = regionNext1193;
        regionValue1032 = regionNext1194;
        regionValue1033 = regionNext1195;
        regionValue1034 = regionNext1196;
        regionValue1035 = regionNext1197;
        regionValue1036 = regionNext1198;
        regionValue1037 = regionNext1199;
        regionValue1038 = regionNext1200;
        regionValue1039 = regionNext1201;
        regionValue1040 = regionNext1202;
        break region137;
        }
        java.lang.Object regionNext1203 = regionValue1026;
        int regionNext1204 = regionValue1027;
        int regionNext1205 = regionValue1028;
        int regionNext1206 = regionValue1029;
        long regionNext1207 = regionValue1030;
        long regionNext1208 = regionValue1031;
        long regionNext1209 = regionValue1032;
        int regionNext1210 = regionValue1033;
        long regionNext1211 = regionValue1034;
        long regionNext1212 = regionValue1035;
        long regionNext1213 = regionValue1036;
        long regionNext1214 = regionValue1037;
        int regionNext1215 = regionValue1038;
        int regionNext1216 = regionValue1039;
        java.lang.Object regionNext1217 = regionValue1040;
        int regionNext1218 = 0;
        regionValue930 = regionNext1203;
        regionValue931 = regionNext1204;
        regionValue932 = regionNext1205;
        regionValue933 = regionNext1206;
        regionValue934 = regionNext1207;
        regionValue935 = regionNext1208;
        regionValue936 = regionNext1209;
        regionValue937 = regionNext1210;
        regionValue938 = regionNext1211;
        regionValue939 = regionNext1212;
        regionValue940 = regionNext1213;
        regionValue941 = regionNext1214;
        regionValue942 = regionNext1215;
        regionValue943 = regionNext1216;
        regionValue944 = regionNext1217;
        regionValue945 = regionNext1218;
        break region138;
        }
        recovery$indy$flow$1129(regionValue944, (regionValue945 != 0));
        java.lang.Object regionNext1219 = regionValue930;
        int regionNext1220 = regionValue931;
        int regionNext1221 = regionValue932;
        int regionNext1222 = regionValue933;
        long regionNext1223 = regionValue934;
        long regionNext1224 = regionValue935;
        long regionNext1225 = regionValue936;
        int regionNext1226 = regionValue937;
        long regionNext1227 = regionValue938;
        long regionNext1228 = regionValue939;
        long regionNext1229 = regionValue940;
        long regionNext1230 = regionValue941;
        int regionNext1231 = regionValue942;
        int regionNext1232 = regionValue943;
        regionValue700 = regionNext1219;
        regionValue701 = regionNext1220;
        regionValue702 = regionNext1221;
        regionValue703 = regionNext1222;
        regionValue704 = regionNext1223;
        regionValue705 = regionNext1224;
        regionValue706 = regionNext1225;
        regionValue707 = regionNext1226;
        regionValue708 = regionNext1227;
        regionValue709 = regionNext1228;
        regionValue710 = regionNext1229;
        regionValue711 = regionNext1230;
        regionValue712 = regionNext1231;
        regionValue713 = regionNext1232;
        break region139;
        }
        java.lang.Object initialValue1233 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue700)))).settingPerfectHit));
        boolean initialValue1234 = recovery$indy$flow$1131(initialValue1233, 3402585320628080900L, regionValue704);
        java.lang.Object regionNext1235 = regionValue700;
        int regionNext1236 = regionValue701;
        int regionNext1237 = regionValue702;
        int regionNext1238 = regionValue703;
        long regionNext1239 = regionValue704;
        long regionNext1240 = regionValue705;
        long regionNext1241 = regionValue706;
        int regionNext1242 = regionValue707;
        long regionNext1243 = regionValue708;
        long regionNext1244 = regionValue709;
        long regionNext1245 = regionValue710;
        long regionNext1246 = regionValue711;
        int regionNext1247 = regionValue712;
        int regionNext1248 = regionValue713;
        int regionNext1249 = (int) ((initialValue1234 ? 1 : 0));
        regionValue610 = regionNext1235;
        regionValue611 = regionNext1236;
        regionValue612 = regionNext1237;
        regionValue613 = regionNext1238;
        regionValue614 = regionNext1239;
        regionValue615 = regionNext1240;
        regionValue616 = regionNext1241;
        regionValue617 = regionNext1242;
        regionValue618 = regionNext1243;
        regionValue619 = regionNext1244;
        regionValue620 = regionNext1245;
        regionValue621 = regionNext1246;
        regionValue622 = regionNext1247;
        regionValue623 = regionNext1248;
        regionValue624 = regionNext1249;
        break region144;
        }
        java.lang.Object regionNext1250 = regionValue610;
        int regionNext1251 = regionValue611;
        int regionNext1252 = regionValue612;
        int regionNext1253 = regionValue613;
        long regionNext1254 = regionValue614;
        long regionNext1255 = regionValue615;
        long regionNext1256 = regionValue616;
        int regionNext1257 = regionValue617;
        long regionNext1258 = regionValue618;
        long regionNext1259 = regionValue619;
        long regionNext1260 = regionValue620;
        long regionNext1261 = regionValue621;
        int regionNext1262 = regionValue622;
        int regionNext1263 = regionValue623;
        int regionNext1264 = regionValue624;
        int regionNext1265 = regionValue622;
        regionValue546 = regionNext1250;
        regionValue547 = regionNext1251;
        regionValue548 = regionNext1252;
        regionValue549 = regionNext1253;
        regionValue550 = regionNext1254;
        regionValue551 = regionNext1255;
        regionValue552 = regionNext1256;
        regionValue553 = regionNext1257;
        regionValue554 = regionNext1258;
        regionValue555 = regionNext1259;
        regionValue556 = regionNext1260;
        regionValue557 = regionNext1261;
        regionValue558 = regionNext1262;
        regionValue559 = regionNext1263;
        regionValue560 = regionNext1264;
        regionValue561 = regionNext1265;
        break region145;
        }
        if (regionValue561 != 0) {
            java.lang.Object regionNext1279 = regionValue546;
            int regionNext1280 = regionValue547;
            int regionNext1281 = regionValue548;
            int regionNext1282 = regionValue549;
            long regionNext1283 = regionValue550;
            long regionNext1284 = regionValue551;
            long regionNext1285 = regionValue552;
            long regionNext1286 = regionValue555;
            long regionNext1287 = regionValue556;
            long regionNext1288 = regionValue557;
            int regionNext1289 = regionValue558;
            int regionNext1290 = regionValue559;
            int regionNext1291 = regionValue560;
            regionValue1266 = regionNext1279;
            regionValue1267 = regionNext1280;
            regionValue1268 = regionNext1281;
            regionValue1269 = regionNext1282;
            regionValue1270 = regionNext1283;
            regionValue1271 = regionNext1284;
            regionValue1272 = regionNext1285;
            regionValue1273 = regionNext1286;
            regionValue1274 = regionNext1287;
            regionValue1275 = regionNext1288;
            regionValue1276 = regionNext1289;
            regionValue1277 = regionNext1290;
            regionValue1278 = regionNext1291;
            break region238;
        } else {
            java.lang.Object regionNext1307 = regionValue546;
            int regionNext1308 = regionValue547;
            int regionNext1309 = regionValue548;
            int regionNext1310 = regionValue549;
            long regionNext1311 = regionValue550;
            long regionNext1312 = regionValue551;
            long regionNext1313 = regionValue552;
            int regionNext1314 = regionValue553;
            long regionNext1315 = regionValue554;
            long regionNext1316 = regionValue555;
            long regionNext1317 = regionValue556;
            long regionNext1318 = regionValue557;
            int regionNext1319 = regionValue558;
            int regionNext1320 = regionValue559;
            int regionNext1321 = regionValue560;
            regionValue1292 = regionNext1307;
            regionValue1293 = regionNext1308;
            regionValue1294 = regionNext1309;
            regionValue1295 = regionNext1310;
            regionValue1296 = regionNext1311;
            regionValue1297 = regionNext1312;
            regionValue1298 = regionNext1313;
            regionValue1299 = regionNext1314;
            regionValue1300 = regionNext1315;
            regionValue1301 = regionNext1316;
            regionValue1302 = regionNext1317;
            regionValue1303 = regionNext1318;
            regionValue1304 = regionNext1319;
            regionValue1305 = regionNext1320;
            regionValue1306 = regionNext1321;
            break region146;
        }
        }
        if (regionValue1306 == 0) {
            java.lang.Object regionNext1334 = regionValue1292;
            int regionNext1335 = regionValue1293;
            int regionNext1336 = regionValue1294;
            int regionNext1337 = regionValue1295;
            long regionNext1338 = regionValue1296;
            long regionNext1339 = regionValue1297;
            long regionNext1340 = regionValue1298;
            long regionNext1341 = regionValue1301;
            long regionNext1342 = regionValue1302;
            long regionNext1343 = regionValue1303;
            int regionNext1344 = regionValue1304;
            int regionNext1345 = regionValue1305;
            regionValue1322 = regionNext1334;
            regionValue1323 = regionNext1335;
            regionValue1324 = regionNext1336;
            regionValue1325 = regionNext1337;
            regionValue1326 = regionNext1338;
            regionValue1327 = regionNext1339;
            regionValue1328 = regionNext1340;
            regionValue1329 = regionNext1341;
            regionValue1330 = regionNext1342;
            regionValue1331 = regionNext1343;
            regionValue1332 = regionNext1344;
            regionValue1333 = regionNext1345;
            break region232;
        } else {
            java.lang.Object regionNext1360 = regionValue1292;
            int regionNext1361 = regionValue1293;
            int regionNext1362 = regionValue1294;
            int regionNext1363 = regionValue1295;
            long regionNext1364 = regionValue1296;
            long regionNext1365 = regionValue1297;
            long regionNext1366 = regionValue1298;
            int regionNext1367 = regionValue1299;
            long regionNext1368 = regionValue1300;
            long regionNext1369 = regionValue1301;
            long regionNext1370 = regionValue1302;
            long regionNext1371 = regionValue1303;
            int regionNext1372 = regionValue1304;
            int regionNext1373 = regionValue1305;
            regionValue1346 = regionNext1360;
            regionValue1347 = regionNext1361;
            regionValue1348 = regionNext1362;
            regionValue1349 = regionNext1363;
            regionValue1350 = regionNext1364;
            regionValue1351 = regionNext1365;
            regionValue1352 = regionNext1366;
            regionValue1353 = regionNext1367;
            regionValue1354 = regionNext1368;
            regionValue1355 = regionNext1369;
            regionValue1356 = regionNext1370;
            regionValue1357 = regionNext1371;
            regionValue1358 = regionNext1372;
            regionValue1359 = regionNext1373;
            break region147;
        }
        }
        java.lang.Object initialValue1374 = recovery$indy$flow$1132();
        java.lang.Object initialValue1375 = recovery$indy$flow$1133(initialValue1374, 3403966518427291986L, regionValue1350);
        if (regionValue1349 < 0) {
            java.lang.Object regionNext1392 = regionValue1346;
            int regionNext1393 = regionValue1347;
            int regionNext1394 = regionValue1348;
            int regionNext1395 = regionValue1349;
            long regionNext1396 = regionValue1350;
            long regionNext1397 = regionValue1351;
            long regionNext1398 = regionValue1352;
            int regionNext1399 = regionValue1353;
            long regionNext1400 = regionValue1354;
            long regionNext1401 = regionValue1355;
            long regionNext1402 = regionValue1356;
            long regionNext1403 = regionValue1357;
            int regionNext1404 = regionValue1358;
            int regionNext1405 = regionValue1359;
            java.lang.Object regionNext1406 = initialValue1375;
            int regionNext1407 = regionValue1358;
            regionValue1376 = regionNext1392;
            regionValue1377 = regionNext1393;
            regionValue1378 = regionNext1394;
            regionValue1379 = regionNext1395;
            regionValue1380 = regionNext1396;
            regionValue1381 = regionNext1397;
            regionValue1382 = regionNext1398;
            regionValue1383 = regionNext1399;
            regionValue1384 = regionNext1400;
            regionValue1385 = regionNext1401;
            regionValue1386 = regionNext1402;
            regionValue1387 = regionNext1403;
            regionValue1388 = regionNext1404;
            regionValue1389 = regionNext1405;
            regionValue1390 = regionNext1406;
            regionValue1391 = regionNext1407;
            break region167;
        } else {
            java.lang.Object regionNext1424 = regionValue1346;
            int regionNext1425 = regionValue1347;
            int regionNext1426 = regionValue1348;
            int regionNext1427 = regionValue1349;
            long regionNext1428 = regionValue1350;
            long regionNext1429 = regionValue1351;
            long regionNext1430 = regionValue1352;
            int regionNext1431 = regionValue1353;
            long regionNext1432 = regionValue1354;
            long regionNext1433 = regionValue1355;
            long regionNext1434 = regionValue1356;
            long regionNext1435 = regionValue1357;
            int regionNext1436 = regionValue1358;
            int regionNext1437 = regionValue1359;
            java.lang.Object regionNext1438 = initialValue1375;
            int regionNext1439 = regionValue1358;
            regionValue1408 = regionNext1424;
            regionValue1409 = regionNext1425;
            regionValue1410 = regionNext1426;
            regionValue1411 = regionNext1427;
            regionValue1412 = regionNext1428;
            regionValue1413 = regionNext1429;
            regionValue1414 = regionNext1430;
            regionValue1415 = regionNext1431;
            regionValue1416 = regionNext1432;
            regionValue1417 = regionNext1433;
            regionValue1418 = regionNext1434;
            regionValue1419 = regionNext1435;
            regionValue1420 = regionNext1436;
            regionValue1421 = regionNext1437;
            regionValue1422 = regionNext1438;
            regionValue1423 = regionNext1439;
            break region154;
        }
        }
        java.lang.Object regionNext1456 = regionValue1408;
        int regionNext1457 = regionValue1409;
        int regionNext1458 = regionValue1410;
        int regionNext1459 = regionValue1411;
        long regionNext1460 = regionValue1412;
        long regionNext1461 = regionValue1413;
        long regionNext1462 = regionValue1414;
        int regionNext1463 = regionValue1415;
        long regionNext1464 = regionValue1416;
        long regionNext1465 = regionValue1417;
        long regionNext1466 = regionValue1418;
        long regionNext1467 = regionValue1419;
        int regionNext1468 = regionValue1420;
        int regionNext1469 = regionValue1421;
        java.lang.Object regionNext1470 = regionValue1422;
        int regionNext1471 = regionValue1423;
        regionValue1440 = regionNext1456;
        regionValue1441 = regionNext1457;
        regionValue1442 = regionNext1458;
        regionValue1443 = regionNext1459;
        regionValue1444 = regionNext1460;
        regionValue1445 = regionNext1461;
        regionValue1446 = regionNext1462;
        regionValue1447 = regionNext1463;
        regionValue1448 = regionNext1464;
        regionValue1449 = regionNext1465;
        regionValue1450 = regionNext1466;
        regionValue1451 = regionNext1467;
        regionValue1452 = regionNext1468;
        regionValue1453 = regionNext1469;
        regionValue1454 = regionNext1470;
        regionValue1455 = regionNext1471;
        break region156;
        }
        if (regionValue1455 != 0) {
            java.lang.Object regionNext1487 = regionValue1440;
            int regionNext1488 = regionValue1441;
            int regionNext1489 = regionValue1442;
            int regionNext1490 = regionValue1443;
            long regionNext1491 = regionValue1444;
            long regionNext1492 = regionValue1445;
            long regionNext1493 = regionValue1446;
            int regionNext1494 = regionValue1447;
            long regionNext1495 = regionValue1448;
            long regionNext1496 = regionValue1449;
            long regionNext1497 = regionValue1450;
            long regionNext1498 = regionValue1451;
            int regionNext1499 = regionValue1452;
            int regionNext1500 = regionValue1453;
            java.lang.Object regionNext1501 = regionValue1454;
            regionValue1472 = regionNext1487;
            regionValue1473 = regionNext1488;
            regionValue1474 = regionNext1489;
            regionValue1475 = regionNext1490;
            regionValue1476 = regionNext1491;
            regionValue1477 = regionNext1492;
            regionValue1478 = regionNext1493;
            regionValue1479 = regionNext1494;
            regionValue1480 = regionNext1495;
            regionValue1481 = regionNext1496;
            regionValue1482 = regionNext1497;
            regionValue1483 = regionNext1498;
            regionValue1484 = regionNext1499;
            regionValue1485 = regionNext1500;
            regionValue1486 = regionNext1501;
            break region166;
        } else {
            java.lang.Object regionNext1517 = regionValue1440;
            int regionNext1518 = regionValue1441;
            int regionNext1519 = regionValue1442;
            int regionNext1520 = regionValue1443;
            long regionNext1521 = regionValue1444;
            long regionNext1522 = regionValue1445;
            long regionNext1523 = regionValue1446;
            int regionNext1524 = regionValue1447;
            long regionNext1525 = regionValue1448;
            long regionNext1526 = regionValue1449;
            long regionNext1527 = regionValue1450;
            long regionNext1528 = regionValue1451;
            int regionNext1529 = regionValue1452;
            int regionNext1530 = regionValue1453;
            java.lang.Object regionNext1531 = regionValue1454;
            regionValue1502 = regionNext1517;
            regionValue1503 = regionNext1518;
            regionValue1504 = regionNext1519;
            regionValue1505 = regionNext1520;
            regionValue1506 = regionNext1521;
            regionValue1507 = regionNext1522;
            regionValue1508 = regionNext1523;
            regionValue1509 = regionNext1524;
            regionValue1510 = regionNext1525;
            regionValue1511 = regionNext1526;
            regionValue1512 = regionNext1527;
            regionValue1513 = regionNext1528;
            regionValue1514 = regionNext1529;
            regionValue1515 = regionNext1530;
            regionValue1516 = regionNext1531;
            break region157;
        }
        }
        java.lang.Object regionNext1547 = regionValue1502;
        int regionNext1548 = regionValue1503;
        int regionNext1549 = regionValue1504;
        int regionNext1550 = regionValue1505;
        long regionNext1551 = regionValue1506;
        long regionNext1552 = regionValue1507;
        long regionNext1553 = regionValue1508;
        int regionNext1554 = regionValue1509;
        long regionNext1555 = regionValue1510;
        long regionNext1556 = regionValue1511;
        long regionNext1557 = regionValue1512;
        long regionNext1558 = regionValue1513;
        int regionNext1559 = regionValue1514;
        int regionNext1560 = regionValue1515;
        java.lang.Object regionNext1561 = regionValue1516;
        regionValue1532 = regionNext1547;
        regionValue1533 = regionNext1548;
        regionValue1534 = regionNext1549;
        regionValue1535 = regionNext1550;
        regionValue1536 = regionNext1551;
        regionValue1537 = regionNext1552;
        regionValue1538 = regionNext1553;
        regionValue1539 = regionNext1554;
        regionValue1540 = regionNext1555;
        regionValue1541 = regionNext1556;
        regionValue1542 = regionNext1557;
        regionValue1543 = regionNext1558;
        regionValue1544 = regionNext1559;
        regionValue1545 = regionNext1560;
        regionValue1546 = regionNext1561;
        break region159;
        }
        if (regionValue1546 == null) {
            java.lang.Object regionNext1562 = regionValue1532;
            int regionNext1563 = regionValue1533;
            int regionNext1564 = regionValue1534;
            int regionNext1565 = regionValue1535;
            long regionNext1566 = regionValue1536;
            long regionNext1567 = regionValue1537;
            long regionNext1568 = regionValue1538;
            long regionNext1569 = regionValue1541;
            long regionNext1570 = regionValue1542;
            long regionNext1571 = regionValue1543;
            int regionNext1572 = regionValue1544;
            int regionNext1573 = regionValue1545;
            regionValue1322 = regionNext1562;
            regionValue1323 = regionNext1563;
            regionValue1324 = regionNext1564;
            regionValue1325 = regionNext1565;
            regionValue1326 = regionNext1566;
            regionValue1327 = regionNext1567;
            regionValue1328 = regionNext1568;
            regionValue1329 = regionNext1569;
            regionValue1330 = regionNext1570;
            regionValue1331 = regionNext1571;
            regionValue1332 = regionNext1572;
            regionValue1333 = regionNext1573;
            break region232;
        } else {
            java.lang.Object regionNext1588 = regionValue1532;
            int regionNext1589 = regionValue1533;
            int regionNext1590 = regionValue1534;
            int regionNext1591 = regionValue1535;
            long regionNext1592 = regionValue1536;
            long regionNext1593 = regionValue1537;
            long regionNext1594 = regionValue1538;
            int regionNext1595 = regionValue1539;
            long regionNext1596 = regionValue1540;
            long regionNext1597 = regionValue1541;
            long regionNext1598 = regionValue1542;
            long regionNext1599 = regionValue1543;
            int regionNext1600 = regionValue1544;
            int regionNext1601 = regionValue1545;
            regionValue1574 = regionNext1588;
            regionValue1575 = regionNext1589;
            regionValue1576 = regionNext1590;
            regionValue1577 = regionNext1591;
            regionValue1578 = regionNext1592;
            regionValue1579 = regionNext1593;
            regionValue1580 = regionNext1594;
            regionValue1581 = regionNext1595;
            regionValue1582 = regionNext1596;
            regionValue1583 = regionNext1597;
            regionValue1584 = regionNext1598;
            regionValue1585 = regionNext1599;
            regionValue1586 = regionNext1600;
            regionValue1587 = regionNext1601;
            break region160;
        }
        }
        java.lang.Object initialValue1602 = recovery$indy$flow$1134();
        java.lang.Object initialValue1603 = recovery$indy$flow$1135(initialValue1602, 3403966518427291986L, regionValue1578);
        java.lang.Object regionNext1604 = regionValue1574;
        int regionNext1605 = regionValue1575;
        int regionNext1606 = regionValue1576;
        int regionNext1607 = regionValue1577;
        long regionNext1608 = regionValue1578;
        long regionNext1609 = regionValue1579;
        long regionNext1610 = regionValue1580;
        int regionNext1611 = regionValue1581;
        long regionNext1612 = regionValue1582;
        long regionNext1613 = regionValue1583;
        long regionNext1614 = regionValue1584;
        long regionNext1615 = regionValue1585;
        int regionNext1616 = regionValue1586;
        int regionNext1617 = regionValue1587;
        java.lang.Object regionNext1618 = initialValue1603;
        regionValue1472 = regionNext1604;
        regionValue1473 = regionNext1605;
        regionValue1474 = regionNext1606;
        regionValue1475 = regionNext1607;
        regionValue1476 = regionNext1608;
        regionValue1477 = regionNext1609;
        regionValue1478 = regionNext1610;
        regionValue1479 = regionNext1611;
        regionValue1480 = regionNext1612;
        regionValue1481 = regionNext1613;
        regionValue1482 = regionNext1614;
        regionValue1483 = regionNext1615;
        regionValue1484 = regionNext1616;
        regionValue1485 = regionNext1617;
        regionValue1486 = regionNext1618;
        break region166;
        }
        java.lang.Object regionNext1619 = regionValue1472;
        int regionNext1620 = regionValue1473;
        int regionNext1621 = regionValue1474;
        int regionNext1622 = regionValue1475;
        long regionNext1623 = regionValue1476;
        long regionNext1624 = regionValue1477;
        long regionNext1625 = regionValue1478;
        int regionNext1626 = regionValue1479;
        long regionNext1627 = regionValue1480;
        long regionNext1628 = regionValue1481;
        long regionNext1629 = regionValue1482;
        long regionNext1630 = regionValue1483;
        int regionNext1631 = regionValue1484;
        int regionNext1632 = regionValue1485;
        java.lang.Object regionNext1633 = regionValue1486;
        int regionNext1634 = regionValue1484;
        regionValue1376 = regionNext1619;
        regionValue1377 = regionNext1620;
        regionValue1378 = regionNext1621;
        regionValue1379 = regionNext1622;
        regionValue1380 = regionNext1623;
        regionValue1381 = regionNext1624;
        regionValue1382 = regionNext1625;
        regionValue1383 = regionNext1626;
        regionValue1384 = regionNext1627;
        regionValue1385 = regionNext1628;
        regionValue1386 = regionNext1629;
        regionValue1387 = regionNext1630;
        regionValue1388 = regionNext1631;
        regionValue1389 = regionNext1632;
        regionValue1390 = regionNext1633;
        regionValue1391 = regionNext1634;
        break region167;
        }
        if (regionValue1391 != 0) {
            java.lang.Object regionNext1650 = regionValue1376;
            int regionNext1651 = regionValue1377;
            int regionNext1652 = regionValue1378;
            int regionNext1653 = regionValue1379;
            long regionNext1654 = regionValue1380;
            long regionNext1655 = regionValue1381;
            long regionNext1656 = regionValue1382;
            int regionNext1657 = regionValue1383;
            long regionNext1658 = regionValue1384;
            long regionNext1659 = regionValue1385;
            long regionNext1660 = regionValue1386;
            long regionNext1661 = regionValue1387;
            int regionNext1662 = regionValue1388;
            int regionNext1663 = regionValue1389;
            java.lang.Object regionNext1664 = regionValue1390;
            regionValue1635 = regionNext1650;
            regionValue1636 = regionNext1651;
            regionValue1637 = regionNext1652;
            regionValue1638 = regionNext1653;
            regionValue1639 = regionNext1654;
            regionValue1640 = regionNext1655;
            regionValue1641 = regionNext1656;
            regionValue1642 = regionNext1657;
            regionValue1643 = regionNext1658;
            regionValue1644 = regionNext1659;
            regionValue1645 = regionNext1660;
            regionValue1646 = regionNext1661;
            regionValue1647 = regionNext1662;
            regionValue1648 = regionNext1663;
            regionValue1649 = regionNext1664;
            break region179;
        } else {
            java.lang.Object regionNext1680 = regionValue1376;
            int regionNext1681 = regionValue1377;
            int regionNext1682 = regionValue1378;
            int regionNext1683 = regionValue1379;
            long regionNext1684 = regionValue1380;
            long regionNext1685 = regionValue1381;
            long regionNext1686 = regionValue1382;
            int regionNext1687 = regionValue1383;
            long regionNext1688 = regionValue1384;
            long regionNext1689 = regionValue1385;
            long regionNext1690 = regionValue1386;
            long regionNext1691 = regionValue1387;
            int regionNext1692 = regionValue1388;
            int regionNext1693 = regionValue1389;
            java.lang.Object regionNext1694 = regionValue1390;
            regionValue1665 = regionNext1680;
            regionValue1666 = regionNext1681;
            regionValue1667 = regionNext1682;
            regionValue1668 = regionNext1683;
            regionValue1669 = regionNext1684;
            regionValue1670 = regionNext1685;
            regionValue1671 = regionNext1686;
            regionValue1672 = regionNext1687;
            regionValue1673 = regionNext1688;
            regionValue1674 = regionNext1689;
            regionValue1675 = regionNext1690;
            regionValue1676 = regionNext1691;
            regionValue1677 = regionNext1692;
            regionValue1678 = regionNext1693;
            regionValue1679 = regionNext1694;
            break region168;
        }
        }
        java.lang.Object initialValue1695 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue1679)))).field_49));
        java.lang.Object initialValue1696 = recovery$indy$flow$1137();
        if (((java.lang.Object) initialValue1695) != ((java.lang.Object) initialValue1696)) {
            java.lang.Object regionNext1697 = regionValue1665;
            int regionNext1698 = regionValue1666;
            int regionNext1699 = regionValue1667;
            int regionNext1700 = regionValue1668;
            long regionNext1701 = regionValue1669;
            long regionNext1702 = regionValue1670;
            long regionNext1703 = regionValue1671;
            long regionNext1704 = regionValue1674;
            long regionNext1705 = regionValue1675;
            long regionNext1706 = regionValue1676;
            int regionNext1707 = regionValue1677;
            int regionNext1708 = regionValue1678;
            regionValue1322 = regionNext1697;
            regionValue1323 = regionNext1698;
            regionValue1324 = regionNext1699;
            regionValue1325 = regionNext1700;
            regionValue1326 = regionNext1701;
            regionValue1327 = regionNext1702;
            regionValue1328 = regionNext1703;
            regionValue1329 = regionNext1704;
            regionValue1330 = regionNext1705;
            regionValue1331 = regionNext1706;
            regionValue1332 = regionNext1707;
            regionValue1333 = regionNext1708;
            break region232;
        } else {
            java.lang.Object regionNext1723 = regionValue1665;
            int regionNext1724 = regionValue1666;
            int regionNext1725 = regionValue1667;
            int regionNext1726 = regionValue1668;
            long regionNext1727 = regionValue1669;
            long regionNext1728 = regionValue1670;
            long regionNext1729 = regionValue1671;
            int regionNext1730 = regionValue1672;
            long regionNext1731 = regionValue1673;
            long regionNext1732 = regionValue1674;
            long regionNext1733 = regionValue1675;
            long regionNext1734 = regionValue1676;
            int regionNext1735 = regionValue1677;
            int regionNext1736 = regionValue1678;
            regionValue1709 = regionNext1723;
            regionValue1710 = regionNext1724;
            regionValue1711 = regionNext1725;
            regionValue1712 = regionNext1726;
            regionValue1713 = regionNext1727;
            regionValue1714 = regionNext1728;
            regionValue1715 = regionNext1729;
            regionValue1716 = regionNext1730;
            regionValue1717 = regionNext1731;
            regionValue1718 = regionNext1732;
            regionValue1719 = regionNext1733;
            regionValue1720 = regionNext1734;
            regionValue1721 = regionNext1735;
            regionValue1722 = regionNext1736;
            break region171;
        }
        }
        java.lang.Object regionNext1751 = regionValue1709;
        int regionNext1752 = regionValue1710;
        int regionNext1753 = regionValue1711;
        int regionNext1754 = regionValue1712;
        long regionNext1755 = regionValue1713;
        long regionNext1756 = regionValue1714;
        long regionNext1757 = regionValue1715;
        int regionNext1758 = regionValue1716;
        long regionNext1759 = regionValue1717;
        long regionNext1760 = regionValue1718;
        long regionNext1761 = regionValue1719;
        long regionNext1762 = regionValue1720;
        int regionNext1763 = regionValue1721;
        int regionNext1764 = regionValue1722;
        regionValue1737 = regionNext1751;
        regionValue1738 = regionNext1752;
        regionValue1739 = regionNext1753;
        regionValue1740 = regionNext1754;
        regionValue1741 = regionNext1755;
        regionValue1742 = regionNext1756;
        regionValue1743 = regionNext1757;
        regionValue1744 = regionNext1758;
        regionValue1745 = regionNext1759;
        regionValue1746 = regionNext1760;
        regionValue1747 = regionNext1761;
        regionValue1748 = regionNext1762;
        regionValue1749 = regionNext1763;
        regionValue1750 = regionNext1764;
        break region173;
        }
        java.lang.Object initialValue1765 = recovery$indy$flow$1138();
        java.lang.Object initialValue1766 = recovery$indy$flow$1139(initialValue1765, 3403966518427291986L, regionValue1741);
        java.lang.Object regionNext1767 = regionValue1737;
        int regionNext1768 = regionValue1738;
        int regionNext1769 = regionValue1739;
        int regionNext1770 = regionValue1740;
        long regionNext1771 = regionValue1741;
        long regionNext1772 = regionValue1742;
        long regionNext1773 = regionValue1743;
        int regionNext1774 = regionValue1744;
        long regionNext1775 = regionValue1745;
        long regionNext1776 = regionValue1746;
        long regionNext1777 = regionValue1747;
        long regionNext1778 = regionValue1748;
        int regionNext1779 = regionValue1749;
        int regionNext1780 = regionValue1750;
        java.lang.Object regionNext1781 = initialValue1766;
        regionValue1635 = regionNext1767;
        regionValue1636 = regionNext1768;
        regionValue1637 = regionNext1769;
        regionValue1638 = regionNext1770;
        regionValue1639 = regionNext1771;
        regionValue1640 = regionNext1772;
        regionValue1641 = regionNext1773;
        regionValue1642 = regionNext1774;
        regionValue1643 = regionNext1775;
        regionValue1644 = regionNext1776;
        regionValue1645 = regionNext1777;
        regionValue1646 = regionNext1778;
        regionValue1647 = regionNext1779;
        regionValue1648 = regionNext1780;
        regionValue1649 = regionNext1781;
        break region179;
        }
        java.lang.Object initialValue1782 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue1649)))).field_47));
        boolean initialValue1783 = recovery$indy$flow$1141(initialValue1782);
        if (regionValue1647 != 0) {
            java.lang.Object regionNext1784 = regionValue1635;
            int regionNext1785 = regionValue1636;
            int regionNext1786 = regionValue1637;
            int regionNext1787 = regionValue1638;
            long regionNext1788 = regionValue1639;
            long regionNext1789 = regionValue1640;
            long regionNext1790 = regionValue1641;
            long regionNext1791 = regionValue1644;
            long regionNext1792 = regionValue1645;
            long regionNext1793 = regionValue1646;
            int regionNext1794 = regionValue1647;
            int regionNext1795 = regionValue1648;
            int regionNext1796 = (int) ((initialValue1783 ? 1 : 0));
            regionValue1266 = regionNext1784;
            regionValue1267 = regionNext1785;
            regionValue1268 = regionNext1786;
            regionValue1269 = regionNext1787;
            regionValue1270 = regionNext1788;
            regionValue1271 = regionNext1789;
            regionValue1272 = regionNext1790;
            regionValue1273 = regionNext1791;
            regionValue1274 = regionNext1792;
            regionValue1275 = regionNext1793;
            regionValue1276 = regionNext1794;
            regionValue1277 = regionNext1795;
            regionValue1278 = regionNext1796;
            break region238;
        } else {
            java.lang.Object regionNext1812 = regionValue1635;
            int regionNext1813 = regionValue1636;
            int regionNext1814 = regionValue1637;
            int regionNext1815 = regionValue1638;
            long regionNext1816 = regionValue1639;
            long regionNext1817 = regionValue1640;
            long regionNext1818 = regionValue1641;
            int regionNext1819 = regionValue1642;
            long regionNext1820 = regionValue1643;
            long regionNext1821 = regionValue1644;
            long regionNext1822 = regionValue1645;
            long regionNext1823 = regionValue1646;
            int regionNext1824 = regionValue1647;
            int regionNext1825 = regionValue1648;
            int regionNext1826 = (int) ((initialValue1783 ? 1 : 0));
            regionValue1797 = regionNext1812;
            regionValue1798 = regionNext1813;
            regionValue1799 = regionNext1814;
            regionValue1800 = regionNext1815;
            regionValue1801 = regionNext1816;
            regionValue1802 = regionNext1817;
            regionValue1803 = regionNext1818;
            regionValue1804 = regionNext1819;
            regionValue1805 = regionNext1820;
            regionValue1806 = regionNext1821;
            regionValue1807 = regionNext1822;
            regionValue1808 = regionNext1823;
            regionValue1809 = regionNext1824;
            regionValue1810 = regionNext1825;
            regionValue1811 = regionNext1826;
            break region183;
        }
        }
        if (regionValue1811 == 0) {
            java.lang.Object regionNext1827 = regionValue1797;
            int regionNext1828 = regionValue1798;
            int regionNext1829 = regionValue1799;
            int regionNext1830 = regionValue1800;
            long regionNext1831 = regionValue1801;
            long regionNext1832 = regionValue1802;
            long regionNext1833 = regionValue1803;
            long regionNext1834 = regionValue1806;
            long regionNext1835 = regionValue1807;
            long regionNext1836 = regionValue1808;
            int regionNext1837 = regionValue1809;
            int regionNext1838 = regionValue1810;
            regionValue1322 = regionNext1827;
            regionValue1323 = regionNext1828;
            regionValue1324 = regionNext1829;
            regionValue1325 = regionNext1830;
            regionValue1326 = regionNext1831;
            regionValue1327 = regionNext1832;
            regionValue1328 = regionNext1833;
            regionValue1329 = regionNext1834;
            regionValue1330 = regionNext1835;
            regionValue1331 = regionNext1836;
            regionValue1332 = regionNext1837;
            regionValue1333 = regionNext1838;
            break region232;
        } else {
            java.lang.Object regionNext1853 = regionValue1797;
            int regionNext1854 = regionValue1798;
            int regionNext1855 = regionValue1799;
            int regionNext1856 = regionValue1800;
            long regionNext1857 = regionValue1801;
            long regionNext1858 = regionValue1802;
            long regionNext1859 = regionValue1803;
            int regionNext1860 = regionValue1804;
            long regionNext1861 = regionValue1805;
            long regionNext1862 = regionValue1806;
            long regionNext1863 = regionValue1807;
            long regionNext1864 = regionValue1808;
            int regionNext1865 = regionValue1809;
            int regionNext1866 = regionValue1810;
            regionValue1839 = regionNext1853;
            regionValue1840 = regionNext1854;
            regionValue1841 = regionNext1855;
            regionValue1842 = regionNext1856;
            regionValue1843 = regionNext1857;
            regionValue1844 = regionNext1858;
            regionValue1845 = regionNext1859;
            regionValue1846 = regionNext1860;
            regionValue1847 = regionNext1861;
            regionValue1848 = regionNext1862;
            regionValue1849 = regionNext1863;
            regionValue1850 = regionNext1864;
            regionValue1851 = regionNext1865;
            regionValue1852 = regionNext1866;
            break region184;
        }
        }
        java.lang.Object regionNext1881 = regionValue1839;
        int regionNext1882 = regionValue1840;
        int regionNext1883 = regionValue1841;
        int regionNext1884 = regionValue1842;
        long regionNext1885 = regionValue1843;
        long regionNext1886 = regionValue1844;
        long regionNext1887 = regionValue1845;
        int regionNext1888 = regionValue1846;
        long regionNext1889 = regionValue1847;
        long regionNext1890 = regionValue1848;
        long regionNext1891 = regionValue1849;
        long regionNext1892 = regionValue1850;
        int regionNext1893 = regionValue1851;
        int regionNext1894 = regionValue1852;
        regionValue1867 = regionNext1881;
        regionValue1868 = regionNext1882;
        regionValue1869 = regionNext1883;
        regionValue1870 = regionNext1884;
        regionValue1871 = regionNext1885;
        regionValue1872 = regionNext1886;
        regionValue1873 = regionNext1887;
        regionValue1874 = regionNext1888;
        regionValue1875 = regionNext1889;
        regionValue1876 = regionNext1890;
        regionValue1877 = regionNext1891;
        regionValue1878 = regionNext1892;
        regionValue1879 = regionNext1893;
        regionValue1880 = regionNext1894;
        break region186;
        }
        short converted1895 = (short) (regionValue1874);
        boolean initialValue1896 = recovery$indy$flow$1142(regionValue1867, converted1895, regionValue1875, 3404151525360942799L, regionValue1871);
        if (regionValue1879 != 0) {
            java.lang.Object regionNext1897 = regionValue1867;
            int regionNext1898 = regionValue1868;
            int regionNext1899 = regionValue1869;
            int regionNext1900 = regionValue1870;
            long regionNext1901 = regionValue1871;
            long regionNext1902 = regionValue1872;
            long regionNext1903 = regionValue1873;
            long regionNext1904 = regionValue1876;
            long regionNext1905 = regionValue1877;
            long regionNext1906 = regionValue1878;
            int regionNext1907 = regionValue1879;
            int regionNext1908 = regionValue1880;
            int regionNext1909 = (int) ((initialValue1896 ? 1 : 0));
            regionValue1266 = regionNext1897;
            regionValue1267 = regionNext1898;
            regionValue1268 = regionNext1899;
            regionValue1269 = regionNext1900;
            regionValue1270 = regionNext1901;
            regionValue1271 = regionNext1902;
            regionValue1272 = regionNext1903;
            regionValue1273 = regionNext1904;
            regionValue1274 = regionNext1905;
            regionValue1275 = regionNext1906;
            regionValue1276 = regionNext1907;
            regionValue1277 = regionNext1908;
            regionValue1278 = regionNext1909;
            break region238;
        } else {
            java.lang.Object regionNext1923 = regionValue1867;
            int regionNext1924 = regionValue1868;
            int regionNext1925 = regionValue1869;
            int regionNext1926 = regionValue1870;
            long regionNext1927 = regionValue1871;
            long regionNext1928 = regionValue1872;
            long regionNext1929 = regionValue1873;
            long regionNext1930 = regionValue1876;
            long regionNext1931 = regionValue1877;
            long regionNext1932 = regionValue1878;
            int regionNext1933 = regionValue1879;
            int regionNext1934 = regionValue1880;
            int regionNext1935 = (int) ((initialValue1896 ? 1 : 0));
            regionValue1910 = regionNext1923;
            regionValue1911 = regionNext1924;
            regionValue1912 = regionNext1925;
            regionValue1913 = regionNext1926;
            regionValue1914 = regionNext1927;
            regionValue1915 = regionNext1928;
            regionValue1916 = regionNext1929;
            regionValue1917 = regionNext1930;
            regionValue1918 = regionNext1931;
            regionValue1919 = regionNext1932;
            regionValue1920 = regionNext1933;
            regionValue1921 = regionNext1934;
            regionValue1922 = regionNext1935;
            break region195;
        }
        }
        java.lang.Object regionNext1949 = regionValue1910;
        int regionNext1950 = regionValue1911;
        int regionNext1951 = regionValue1912;
        int regionNext1952 = regionValue1913;
        long regionNext1953 = regionValue1914;
        long regionNext1954 = regionValue1915;
        long regionNext1955 = regionValue1916;
        long regionNext1956 = regionValue1917;
        long regionNext1957 = regionValue1918;
        long regionNext1958 = regionValue1919;
        int regionNext1959 = regionValue1920;
        int regionNext1960 = regionValue1921;
        int regionNext1961 = regionValue1922;
        regionValue1936 = regionNext1949;
        regionValue1937 = regionNext1950;
        regionValue1938 = regionNext1951;
        regionValue1939 = regionNext1952;
        regionValue1940 = regionNext1953;
        regionValue1941 = regionNext1954;
        regionValue1942 = regionNext1955;
        regionValue1943 = regionNext1956;
        regionValue1944 = regionNext1957;
        regionValue1945 = regionNext1958;
        regionValue1946 = regionNext1959;
        regionValue1947 = regionNext1960;
        regionValue1948 = regionNext1961;
        break region197;
        }
        if (regionValue1948 != 0) {
            java.lang.Object regionNext1962 = regionValue1936;
            int regionNext1963 = regionValue1937;
            int regionNext1964 = regionValue1938;
            int regionNext1965 = regionValue1939;
            long regionNext1966 = regionValue1940;
            long regionNext1967 = regionValue1941;
            long regionNext1968 = regionValue1942;
            long regionNext1969 = regionValue1943;
            long regionNext1970 = regionValue1944;
            long regionNext1971 = regionValue1945;
            int regionNext1972 = regionValue1946;
            int regionNext1973 = regionValue1947;
            regionValue1322 = regionNext1962;
            regionValue1323 = regionNext1963;
            regionValue1324 = regionNext1964;
            regionValue1325 = regionNext1965;
            regionValue1326 = regionNext1966;
            regionValue1327 = regionNext1967;
            regionValue1328 = regionNext1968;
            regionValue1329 = regionNext1969;
            regionValue1330 = regionNext1970;
            regionValue1331 = regionNext1971;
            regionValue1332 = regionNext1972;
            regionValue1333 = regionNext1973;
            break region232;
        } else {
            java.lang.Object regionNext1986 = regionValue1936;
            int regionNext1987 = regionValue1937;
            int regionNext1988 = regionValue1938;
            int regionNext1989 = regionValue1939;
            long regionNext1990 = regionValue1940;
            long regionNext1991 = regionValue1941;
            long regionNext1992 = regionValue1942;
            long regionNext1993 = regionValue1943;
            long regionNext1994 = regionValue1944;
            long regionNext1995 = regionValue1945;
            int regionNext1996 = regionValue1946;
            int regionNext1997 = regionValue1947;
            regionValue1974 = regionNext1986;
            regionValue1975 = regionNext1987;
            regionValue1976 = regionNext1988;
            regionValue1977 = regionNext1989;
            regionValue1978 = regionNext1990;
            regionValue1979 = regionNext1991;
            regionValue1980 = regionNext1992;
            regionValue1981 = regionNext1993;
            regionValue1982 = regionNext1994;
            regionValue1983 = regionNext1995;
            regionValue1984 = regionNext1996;
            regionValue1985 = regionNext1997;
            break region198;
        }
        }
        java.lang.Object regionNext2010 = regionValue1974;
        int regionNext2011 = regionValue1975;
        int regionNext2012 = regionValue1976;
        int regionNext2013 = regionValue1977;
        long regionNext2014 = regionValue1978;
        long regionNext2015 = regionValue1979;
        long regionNext2016 = regionValue1980;
        long regionNext2017 = regionValue1981;
        long regionNext2018 = regionValue1982;
        long regionNext2019 = regionValue1983;
        int regionNext2020 = regionValue1984;
        int regionNext2021 = regionValue1985;
        regionValue1998 = regionNext2010;
        regionValue1999 = regionNext2011;
        regionValue2000 = regionNext2012;
        regionValue2001 = regionNext2013;
        regionValue2002 = regionNext2014;
        regionValue2003 = regionNext2015;
        regionValue2004 = regionNext2016;
        regionValue2005 = regionNext2017;
        regionValue2006 = regionNext2018;
        regionValue2007 = regionNext2019;
        regionValue2008 = regionNext2020;
        regionValue2009 = regionNext2021;
        break region200;
        }
        java.lang.Object initialValue2022 = recovery$indy$flow$1143();
        java.lang.Object initialValue2023 = recovery$indy$flow$1144(initialValue2022, 3403966518427291986L, regionValue2002);
        java.lang.Object initialValue2024 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(initialValue2023)))).field_47));
        java.lang.Object initialValue2025 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(initialValue2024))))));
        java.lang.Object initialValue2026 = initialValue2025;
        int initialValue2027 = recovery$indy$flow$1147(initialValue2026);
        if (regionValue2008 != 0) {
            java.lang.Object regionNext2040 = regionValue1998;
            int regionNext2041 = regionValue1999;
            int regionNext2042 = regionValue2000;
            int regionNext2043 = regionValue2001;
            long regionNext2044 = regionValue2002;
            long regionNext2045 = regionValue2003;
            long regionNext2046 = regionValue2004;
            long regionNext2047 = regionValue2005;
            long regionNext2048 = regionValue2006;
            long regionNext2049 = regionValue2007;
            int regionNext2050 = regionValue2008;
            int regionNext2051 = initialValue2027;
            regionValue2028 = regionNext2040;
            regionValue2029 = regionNext2041;
            regionValue2030 = regionNext2042;
            regionValue2031 = regionNext2043;
            regionValue2032 = regionNext2044;
            regionValue2033 = regionNext2045;
            regionValue2034 = regionNext2046;
            regionValue2035 = regionNext2047;
            regionValue2036 = regionNext2048;
            regionValue2037 = regionNext2049;
            regionValue2038 = regionNext2050;
            regionValue2039 = regionNext2051;
            break region231;
        } else {
            java.lang.Object regionNext2066 = regionValue1998;
            int regionNext2067 = regionValue1999;
            int regionNext2068 = regionValue2000;
            int regionNext2069 = regionValue2001;
            long regionNext2070 = regionValue2002;
            long regionNext2071 = regionValue2003;
            long regionNext2072 = regionValue2004;
            long regionNext2073 = regionValue2005;
            long regionNext2074 = regionValue2006;
            long regionNext2075 = regionValue2007;
            int regionNext2076 = regionValue2008;
            int regionNext2077 = regionValue2009;
            java.lang.Object regionNext2078 = initialValue2026;
            int regionNext2079 = initialValue2027;
            regionValue2052 = regionNext2066;
            regionValue2053 = regionNext2067;
            regionValue2054 = regionNext2068;
            regionValue2055 = regionNext2069;
            regionValue2056 = regionNext2070;
            regionValue2057 = regionNext2071;
            regionValue2058 = regionNext2072;
            regionValue2059 = regionNext2073;
            regionValue2060 = regionNext2074;
            regionValue2061 = regionNext2075;
            regionValue2062 = regionNext2076;
            regionValue2063 = regionNext2077;
            regionValue2064 = regionNext2078;
            regionValue2065 = regionNext2079;
            break region211;
        }
        }
        if (regionValue2065 == 0) {
            java.lang.Object regionNext2091 = regionValue2052;
            int regionNext2092 = regionValue2053;
            int regionNext2093 = regionValue2054;
            int regionNext2094 = regionValue2055;
            long regionNext2095 = regionValue2056;
            long regionNext2096 = regionValue2057;
            long regionNext2097 = regionValue2058;
            long regionNext2098 = regionValue2059;
            long regionNext2099 = regionValue2060;
            long regionNext2100 = regionValue2061;
            int regionNext2101 = regionValue2062;
            regionValue2080 = regionNext2091;
            regionValue2081 = regionNext2092;
            regionValue2082 = regionNext2093;
            regionValue2083 = regionNext2094;
            regionValue2084 = regionNext2095;
            regionValue2085 = regionNext2096;
            regionValue2086 = regionNext2097;
            regionValue2087 = regionNext2098;
            regionValue2088 = regionNext2099;
            regionValue2089 = regionNext2100;
            regionValue2090 = regionNext2101;
            break region228;
        } else {
            java.lang.Object regionNext2115 = regionValue2052;
            int regionNext2116 = regionValue2053;
            int regionNext2117 = regionValue2054;
            int regionNext2118 = regionValue2055;
            long regionNext2119 = regionValue2056;
            long regionNext2120 = regionValue2057;
            long regionNext2121 = regionValue2058;
            long regionNext2122 = regionValue2059;
            long regionNext2123 = regionValue2060;
            long regionNext2124 = regionValue2061;
            int regionNext2125 = regionValue2062;
            int regionNext2126 = regionValue2063;
            java.lang.Object regionNext2127 = regionValue2064;
            regionValue2102 = regionNext2115;
            regionValue2103 = regionNext2116;
            regionValue2104 = regionNext2117;
            regionValue2105 = regionNext2118;
            regionValue2106 = regionNext2119;
            regionValue2107 = regionNext2120;
            regionValue2108 = regionNext2121;
            regionValue2109 = regionNext2122;
            regionValue2110 = regionNext2123;
            regionValue2111 = regionNext2124;
            regionValue2112 = regionNext2125;
            regionValue2113 = regionNext2126;
            regionValue2114 = regionNext2127;
            break region212;
        }
        }
        java.lang.Object regionNext2141 = regionValue2102;
        int regionNext2142 = regionValue2103;
        int regionNext2143 = regionValue2104;
        int regionNext2144 = regionValue2105;
        long regionNext2145 = regionValue2106;
        long regionNext2146 = regionValue2107;
        long regionNext2147 = regionValue2108;
        long regionNext2148 = regionValue2109;
        long regionNext2149 = regionValue2110;
        long regionNext2150 = regionValue2111;
        int regionNext2151 = regionValue2112;
        int regionNext2152 = regionValue2113;
        java.lang.Object regionNext2153 = regionValue2114;
        regionValue2128 = regionNext2141;
        regionValue2129 = regionNext2142;
        regionValue2130 = regionNext2143;
        regionValue2131 = regionNext2144;
        regionValue2132 = regionNext2145;
        regionValue2133 = regionNext2146;
        regionValue2134 = regionNext2147;
        regionValue2135 = regionNext2148;
        regionValue2136 = regionNext2149;
        regionValue2137 = regionNext2150;
        regionValue2138 = regionNext2151;
        regionValue2139 = regionNext2152;
        regionValue2140 = regionNext2153;
        break region214;
        }
        int initialValue2154 = recovery$indy$flow$1148(regionValue2140);
        if (regionValue2129 < 0) {
            java.lang.Object regionNext2169 = regionValue2128;
            int regionNext2170 = regionValue2129;
            int regionNext2171 = regionValue2130;
            int regionNext2172 = regionValue2131;
            long regionNext2173 = regionValue2132;
            long regionNext2174 = regionValue2133;
            long regionNext2175 = regionValue2134;
            long regionNext2176 = regionValue2135;
            long regionNext2177 = regionValue2136;
            long regionNext2178 = regionValue2137;
            int regionNext2179 = regionValue2138;
            int regionNext2180 = regionValue2139;
            int regionNext2181 = initialValue2154;
            int regionNext2182 = regionValue2138;
            regionValue2155 = regionNext2169;
            regionValue2156 = regionNext2170;
            regionValue2157 = regionNext2171;
            regionValue2158 = regionNext2172;
            regionValue2159 = regionNext2173;
            regionValue2160 = regionNext2174;
            regionValue2161 = regionNext2175;
            regionValue2162 = regionNext2176;
            regionValue2163 = regionNext2177;
            regionValue2164 = regionNext2178;
            regionValue2165 = regionNext2179;
            regionValue2166 = regionNext2180;
            regionValue2167 = regionNext2181;
            regionValue2168 = regionNext2182;
            break region239;
        } else {
            java.lang.Object regionNext2197 = regionValue2128;
            int regionNext2198 = regionValue2129;
            int regionNext2199 = regionValue2130;
            int regionNext2200 = regionValue2131;
            long regionNext2201 = regionValue2132;
            long regionNext2202 = regionValue2133;
            long regionNext2203 = regionValue2134;
            long regionNext2204 = regionValue2135;
            long regionNext2205 = regionValue2136;
            long regionNext2206 = regionValue2137;
            int regionNext2207 = regionValue2138;
            int regionNext2208 = regionValue2139;
            int regionNext2209 = initialValue2154;
            int regionNext2210 = regionValue2138;
            regionValue2183 = regionNext2197;
            regionValue2184 = regionNext2198;
            regionValue2185 = regionNext2199;
            regionValue2186 = regionNext2200;
            regionValue2187 = regionNext2201;
            regionValue2188 = regionNext2202;
            regionValue2189 = regionNext2203;
            regionValue2190 = regionNext2204;
            regionValue2191 = regionNext2205;
            regionValue2192 = regionNext2206;
            regionValue2193 = regionNext2207;
            regionValue2194 = regionNext2208;
            regionValue2195 = regionNext2209;
            regionValue2196 = regionNext2210;
            break region219;
        }
        }
        java.lang.Object regionNext2225 = regionValue2183;
        int regionNext2226 = regionValue2184;
        int regionNext2227 = regionValue2185;
        int regionNext2228 = regionValue2186;
        long regionNext2229 = regionValue2187;
        long regionNext2230 = regionValue2188;
        long regionNext2231 = regionValue2189;
        long regionNext2232 = regionValue2190;
        long regionNext2233 = regionValue2191;
        long regionNext2234 = regionValue2192;
        int regionNext2235 = regionValue2193;
        int regionNext2236 = regionValue2194;
        int regionNext2237 = regionValue2195;
        int regionNext2238 = regionValue2196;
        regionValue2211 = regionNext2225;
        regionValue2212 = regionNext2226;
        regionValue2213 = regionNext2227;
        regionValue2214 = regionNext2228;
        regionValue2215 = regionNext2229;
        regionValue2216 = regionNext2230;
        regionValue2217 = regionNext2231;
        regionValue2218 = regionNext2232;
        regionValue2219 = regionNext2233;
        regionValue2220 = regionNext2234;
        regionValue2221 = regionNext2235;
        regionValue2222 = regionNext2236;
        regionValue2223 = regionNext2237;
        regionValue2224 = regionNext2238;
        break region221;
        }
        if (regionValue2224 != 0) {
            java.lang.Object regionNext2239 = regionValue2211;
            int regionNext2240 = regionValue2212;
            int regionNext2241 = regionValue2213;
            int regionNext2242 = regionValue2214;
            long regionNext2243 = regionValue2215;
            long regionNext2244 = regionValue2216;
            long regionNext2245 = regionValue2217;
            long regionNext2246 = regionValue2218;
            long regionNext2247 = regionValue2219;
            long regionNext2248 = regionValue2220;
            int regionNext2249 = regionValue2221;
            int regionNext2250 = regionValue2222;
            int regionNext2251 = regionValue2223;
            regionValue1266 = regionNext2239;
            regionValue1267 = regionNext2240;
            regionValue1268 = regionNext2241;
            regionValue1269 = regionNext2242;
            regionValue1270 = regionNext2243;
            regionValue1271 = regionNext2244;
            regionValue1272 = regionNext2245;
            regionValue1273 = regionNext2246;
            regionValue1274 = regionNext2247;
            regionValue1275 = regionNext2248;
            regionValue1276 = regionNext2249;
            regionValue1277 = regionNext2250;
            regionValue1278 = regionNext2251;
            break region238;
        } else {
            java.lang.Object regionNext2265 = regionValue2211;
            int regionNext2266 = regionValue2212;
            int regionNext2267 = regionValue2213;
            int regionNext2268 = regionValue2214;
            long regionNext2269 = regionValue2215;
            long regionNext2270 = regionValue2216;
            long regionNext2271 = regionValue2217;
            long regionNext2272 = regionValue2218;
            long regionNext2273 = regionValue2219;
            long regionNext2274 = regionValue2220;
            int regionNext2275 = regionValue2221;
            int regionNext2276 = regionValue2222;
            int regionNext2277 = regionValue2223;
            regionValue2252 = regionNext2265;
            regionValue2253 = regionNext2266;
            regionValue2254 = regionNext2267;
            regionValue2255 = regionNext2268;
            regionValue2256 = regionNext2269;
            regionValue2257 = regionNext2270;
            regionValue2258 = regionNext2271;
            regionValue2259 = regionNext2272;
            regionValue2260 = regionNext2273;
            regionValue2261 = regionNext2274;
            regionValue2262 = regionNext2275;
            regionValue2263 = regionNext2276;
            regionValue2264 = regionNext2277;
            break region222;
        }
        }
        java.lang.Object regionNext2291 = regionValue2252;
        int regionNext2292 = regionValue2253;
        int regionNext2293 = regionValue2254;
        int regionNext2294 = regionValue2255;
        long regionNext2295 = regionValue2256;
        long regionNext2296 = regionValue2257;
        long regionNext2297 = regionValue2258;
        long regionNext2298 = regionValue2259;
        long regionNext2299 = regionValue2260;
        long regionNext2300 = regionValue2261;
        int regionNext2301 = regionValue2262;
        int regionNext2302 = regionValue2263;
        int regionNext2303 = regionValue2264;
        regionValue2278 = regionNext2291;
        regionValue2279 = regionNext2292;
        regionValue2280 = regionNext2293;
        regionValue2281 = regionNext2294;
        regionValue2282 = regionNext2295;
        regionValue2283 = regionNext2296;
        regionValue2284 = regionNext2297;
        regionValue2285 = regionNext2298;
        regionValue2286 = regionNext2299;
        regionValue2287 = regionNext2300;
        regionValue2288 = regionNext2301;
        regionValue2289 = regionNext2302;
        regionValue2290 = regionNext2303;
        break region224;
        }
        if (regionValue2290 != 1) {
            java.lang.Object regionNext2304 = regionValue2278;
            int regionNext2305 = regionValue2279;
            int regionNext2306 = regionValue2280;
            int regionNext2307 = regionValue2281;
            long regionNext2308 = regionValue2282;
            long regionNext2309 = regionValue2283;
            long regionNext2310 = regionValue2284;
            long regionNext2311 = regionValue2285;
            long regionNext2312 = regionValue2286;
            long regionNext2313 = regionValue2287;
            int regionNext2314 = regionValue2288;
            int regionNext2315 = regionValue2289;
            regionValue1322 = regionNext2304;
            regionValue1323 = regionNext2305;
            regionValue1324 = regionNext2306;
            regionValue1325 = regionNext2307;
            regionValue1326 = regionNext2308;
            regionValue1327 = regionNext2309;
            regionValue1328 = regionNext2310;
            regionValue1329 = regionNext2311;
            regionValue1330 = regionNext2312;
            regionValue1331 = regionNext2313;
            regionValue1332 = regionNext2314;
            regionValue1333 = regionNext2315;
            break region232;
        } else {
            java.lang.Object regionNext2327 = regionValue2278;
            int regionNext2328 = regionValue2279;
            int regionNext2329 = regionValue2280;
            int regionNext2330 = regionValue2281;
            long regionNext2331 = regionValue2282;
            long regionNext2332 = regionValue2283;
            long regionNext2333 = regionValue2284;
            long regionNext2334 = regionValue2285;
            long regionNext2335 = regionValue2286;
            long regionNext2336 = regionValue2287;
            int regionNext2337 = regionValue2288;
            regionValue2316 = regionNext2327;
            regionValue2317 = regionNext2328;
            regionValue2318 = regionNext2329;
            regionValue2319 = regionNext2330;
            regionValue2320 = regionNext2331;
            regionValue2321 = regionNext2332;
            regionValue2322 = regionNext2333;
            regionValue2323 = regionNext2334;
            regionValue2324 = regionNext2335;
            regionValue2325 = regionNext2336;
            regionValue2326 = regionNext2337;
            break region226;
        }
        }
        java.lang.Object regionNext2338 = regionValue2316;
        int regionNext2339 = regionValue2317;
        int regionNext2340 = regionValue2318;
        int regionNext2341 = regionValue2319;
        long regionNext2342 = regionValue2320;
        long regionNext2343 = regionValue2321;
        long regionNext2344 = regionValue2322;
        long regionNext2345 = regionValue2323;
        long regionNext2346 = regionValue2324;
        long regionNext2347 = regionValue2325;
        int regionNext2348 = regionValue2326;
        regionValue2080 = regionNext2338;
        regionValue2081 = regionNext2339;
        regionValue2082 = regionNext2340;
        regionValue2083 = regionNext2341;
        regionValue2084 = regionNext2342;
        regionValue2085 = regionNext2343;
        regionValue2086 = regionNext2344;
        regionValue2087 = regionNext2345;
        regionValue2088 = regionNext2346;
        regionValue2089 = regionNext2347;
        regionValue2090 = regionNext2348;
        break region228;
        }
        java.lang.Object regionNext2349 = regionValue2080;
        int regionNext2350 = regionValue2081;
        int regionNext2351 = regionValue2082;
        int regionNext2352 = regionValue2083;
        long regionNext2353 = regionValue2084;
        long regionNext2354 = regionValue2085;
        long regionNext2355 = regionValue2086;
        long regionNext2356 = regionValue2087;
        long regionNext2357 = regionValue2088;
        long regionNext2358 = regionValue2089;
        int regionNext2359 = regionValue2090;
        int regionNext2360 = 1;
        regionValue2028 = regionNext2349;
        regionValue2029 = regionNext2350;
        regionValue2030 = regionNext2351;
        regionValue2031 = regionNext2352;
        regionValue2032 = regionNext2353;
        regionValue2033 = regionNext2354;
        regionValue2034 = regionNext2355;
        regionValue2035 = regionNext2356;
        regionValue2036 = regionNext2357;
        regionValue2037 = regionNext2358;
        regionValue2038 = regionNext2359;
        regionValue2039 = regionNext2360;
        break region231;
        }
        int initialValue2361 = regionValue2039;
        java.lang.Object regionNext2362 = regionValue2028;
        int regionNext2363 = regionValue2029;
        int regionNext2364 = regionValue2030;
        int regionNext2365 = regionValue2031;
        long regionNext2366 = regionValue2032;
        long regionNext2367 = regionValue2033;
        long regionNext2368 = regionValue2034;
        long regionNext2369 = regionValue2035;
        long regionNext2370 = regionValue2036;
        long regionNext2371 = regionValue2037;
        int regionNext2372 = regionValue2038;
        int regionNext2373 = initialValue2361;
        regionValue1322 = regionNext2362;
        regionValue1323 = regionNext2363;
        regionValue1324 = regionNext2364;
        regionValue1325 = regionNext2365;
        regionValue1326 = regionNext2366;
        regionValue1327 = regionNext2367;
        regionValue1328 = regionNext2368;
        regionValue1329 = regionNext2369;
        regionValue1330 = regionNext2370;
        regionValue1331 = regionNext2371;
        regionValue1332 = regionNext2372;
        regionValue1333 = regionNext2373;
        break region232;
        }
        java.lang.Object initialValue2374 = recovery$indy$flow$1149();
        java.lang.Object initialValue2375 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue2374)))).field_41K));
        boolean initialValue2376 = recovery$indy$flow$1151(initialValue2375, regionValue1327, 3387107940511376946L, regionValue1326);
        java.lang.Object regionNext2377 = regionValue1322;
        int regionNext2378 = regionValue1323;
        int regionNext2379 = regionValue1324;
        int regionNext2380 = regionValue1325;
        long regionNext2381 = regionValue1326;
        long regionNext2382 = regionValue1327;
        long regionNext2383 = regionValue1328;
        long regionNext2384 = regionValue1329;
        long regionNext2385 = regionValue1330;
        long regionNext2386 = regionValue1331;
        int regionNext2387 = regionValue1332;
        int regionNext2388 = regionValue1333;
        int regionNext2389 = (int) ((initialValue2376 ? 1 : 0));
        regionValue1266 = regionNext2377;
        regionValue1267 = regionNext2378;
        regionValue1268 = regionNext2379;
        regionValue1269 = regionNext2380;
        regionValue1270 = regionNext2381;
        regionValue1271 = regionNext2382;
        regionValue1272 = regionNext2383;
        regionValue1273 = regionNext2384;
        regionValue1274 = regionNext2385;
        regionValue1275 = regionNext2386;
        regionValue1276 = regionNext2387;
        regionValue1277 = regionNext2388;
        regionValue1278 = regionNext2389;
        break region238;
        }
        java.lang.Object regionNext2390 = regionValue1266;
        int regionNext2391 = regionValue1267;
        int regionNext2392 = regionValue1268;
        int regionNext2393 = regionValue1269;
        long regionNext2394 = regionValue1270;
        long regionNext2395 = regionValue1271;
        long regionNext2396 = regionValue1272;
        long regionNext2397 = regionValue1273;
        long regionNext2398 = regionValue1274;
        long regionNext2399 = regionValue1275;
        int regionNext2400 = regionValue1276;
        int regionNext2401 = regionValue1277;
        int regionNext2402 = regionValue1278;
        int regionNext2403 = regionValue1276;
        regionValue2155 = regionNext2390;
        regionValue2156 = regionNext2391;
        regionValue2157 = regionNext2392;
        regionValue2158 = regionNext2393;
        regionValue2159 = regionNext2394;
        regionValue2160 = regionNext2395;
        regionValue2161 = regionNext2396;
        regionValue2162 = regionNext2397;
        regionValue2163 = regionNext2398;
        regionValue2164 = regionNext2399;
        regionValue2165 = regionNext2400;
        regionValue2166 = regionNext2401;
        regionValue2167 = regionNext2402;
        regionValue2168 = regionNext2403;
        break region239;
        }
        if (regionValue2168 != 0) {
            java.lang.Object regionNext2417 = regionValue2155;
            int regionNext2418 = regionValue2156;
            int regionNext2419 = regionValue2157;
            int regionNext2420 = regionValue2158;
            long regionNext2421 = regionValue2159;
            long regionNext2422 = regionValue2160;
            long regionNext2423 = regionValue2161;
            long regionNext2424 = regionValue2162;
            long regionNext2425 = regionValue2163;
            long regionNext2426 = regionValue2164;
            int regionNext2427 = regionValue2165;
            int regionNext2428 = regionValue2166;
            int regionNext2429 = regionValue2167;
            regionValue2404 = regionNext2417;
            regionValue2405 = regionNext2418;
            regionValue2406 = regionNext2419;
            regionValue2407 = regionNext2420;
            regionValue2408 = regionNext2421;
            regionValue2409 = regionNext2422;
            regionValue2410 = regionNext2423;
            regionValue2411 = regionNext2424;
            regionValue2412 = regionNext2425;
            regionValue2413 = regionNext2426;
            regionValue2414 = regionNext2427;
            regionValue2415 = regionNext2428;
            regionValue2416 = regionNext2429;
            break region273;
        } else {
            java.lang.Object regionNext2443 = regionValue2155;
            int regionNext2444 = regionValue2156;
            int regionNext2445 = regionValue2157;
            int regionNext2446 = regionValue2158;
            long regionNext2447 = regionValue2159;
            long regionNext2448 = regionValue2160;
            long regionNext2449 = regionValue2161;
            long regionNext2450 = regionValue2162;
            long regionNext2451 = regionValue2163;
            long regionNext2452 = regionValue2164;
            int regionNext2453 = regionValue2165;
            int regionNext2454 = regionValue2166;
            int regionNext2455 = regionValue2167;
            regionValue2430 = regionNext2443;
            regionValue2431 = regionNext2444;
            regionValue2432 = regionNext2445;
            regionValue2433 = regionNext2446;
            regionValue2434 = regionNext2447;
            regionValue2435 = regionNext2448;
            regionValue2436 = regionNext2449;
            regionValue2437 = regionNext2450;
            regionValue2438 = regionNext2451;
            regionValue2439 = regionNext2452;
            regionValue2440 = regionNext2453;
            regionValue2441 = regionNext2454;
            regionValue2442 = regionNext2455;
            break region240;
        }
        }
        if (regionValue2442 == 0) {
            java.lang.Object regionNext2468 = regionValue2430;
            int regionNext2469 = regionValue2431;
            int regionNext2470 = regionValue2432;
            int regionNext2471 = regionValue2433;
            long regionNext2472 = regionValue2434;
            long regionNext2473 = regionValue2435;
            long regionNext2474 = regionValue2436;
            long regionNext2475 = regionValue2437;
            long regionNext2476 = regionValue2438;
            long regionNext2477 = regionValue2439;
            int regionNext2478 = regionValue2440;
            int regionNext2479 = regionValue2441;
            regionValue2456 = regionNext2468;
            regionValue2457 = regionNext2469;
            regionValue2458 = regionNext2470;
            regionValue2459 = regionNext2471;
            regionValue2460 = regionNext2472;
            regionValue2461 = regionNext2473;
            regionValue2462 = regionNext2474;
            regionValue2463 = regionNext2475;
            regionValue2464 = regionNext2476;
            regionValue2465 = regionNext2477;
            regionValue2466 = regionNext2478;
            regionValue2467 = regionNext2479;
            break region270;
        } else {
            java.lang.Object regionNext2492 = regionValue2430;
            int regionNext2493 = regionValue2431;
            int regionNext2494 = regionValue2432;
            int regionNext2495 = regionValue2433;
            long regionNext2496 = regionValue2434;
            long regionNext2497 = regionValue2435;
            long regionNext2498 = regionValue2436;
            long regionNext2499 = regionValue2437;
            long regionNext2500 = regionValue2438;
            long regionNext2501 = regionValue2439;
            int regionNext2502 = regionValue2440;
            int regionNext2503 = regionValue2441;
            regionValue2480 = regionNext2492;
            regionValue2481 = regionNext2493;
            regionValue2482 = regionNext2494;
            regionValue2483 = regionNext2495;
            regionValue2484 = regionNext2496;
            regionValue2485 = regionNext2497;
            regionValue2486 = regionNext2498;
            regionValue2487 = regionNext2499;
            regionValue2488 = regionNext2500;
            regionValue2489 = regionNext2501;
            regionValue2490 = regionNext2502;
            regionValue2491 = regionNext2503;
            break region241;
        }
        }
        java.lang.Object initialValue2504 = recovery$indy$flow$1152();
        boolean initialValue2505 = recovery$indy$flow$1153(initialValue2504, 3387393322864457637L, regionValue2484);
        if (regionValue2490 != 0) {
            java.lang.Object regionNext2506 = regionValue2480;
            int regionNext2507 = regionValue2481;
            int regionNext2508 = regionValue2482;
            int regionNext2509 = regionValue2483;
            long regionNext2510 = regionValue2484;
            long regionNext2511 = regionValue2485;
            long regionNext2512 = regionValue2486;
            long regionNext2513 = regionValue2487;
            long regionNext2514 = regionValue2488;
            long regionNext2515 = regionValue2489;
            int regionNext2516 = regionValue2490;
            int regionNext2517 = regionValue2491;
            int regionNext2518 = (int) ((initialValue2505 ? 1 : 0));
            regionValue2404 = regionNext2506;
            regionValue2405 = regionNext2507;
            regionValue2406 = regionNext2508;
            regionValue2407 = regionNext2509;
            regionValue2408 = regionNext2510;
            regionValue2409 = regionNext2511;
            regionValue2410 = regionNext2512;
            regionValue2411 = regionNext2513;
            regionValue2412 = regionNext2514;
            regionValue2413 = regionNext2515;
            regionValue2414 = regionNext2516;
            regionValue2415 = regionNext2517;
            regionValue2416 = regionNext2518;
            break region273;
        } else {
            java.lang.Object regionNext2532 = regionValue2480;
            int regionNext2533 = regionValue2481;
            int regionNext2534 = regionValue2482;
            int regionNext2535 = regionValue2483;
            long regionNext2536 = regionValue2484;
            long regionNext2537 = regionValue2485;
            long regionNext2538 = regionValue2486;
            long regionNext2539 = regionValue2487;
            long regionNext2540 = regionValue2488;
            long regionNext2541 = regionValue2489;
            int regionNext2542 = regionValue2490;
            int regionNext2543 = regionValue2491;
            int regionNext2544 = (int) ((initialValue2505 ? 1 : 0));
            regionValue2519 = regionNext2532;
            regionValue2520 = regionNext2533;
            regionValue2521 = regionNext2534;
            regionValue2522 = regionNext2535;
            regionValue2523 = regionNext2536;
            regionValue2524 = regionNext2537;
            regionValue2525 = regionNext2538;
            regionValue2526 = regionNext2539;
            regionValue2527 = regionNext2540;
            regionValue2528 = regionNext2541;
            regionValue2529 = regionNext2542;
            regionValue2530 = regionNext2543;
            regionValue2531 = regionNext2544;
            break region247;
        }
        }
        java.lang.Object regionNext2558 = regionValue2519;
        int regionNext2559 = regionValue2520;
        int regionNext2560 = regionValue2521;
        int regionNext2561 = regionValue2522;
        long regionNext2562 = regionValue2523;
        long regionNext2563 = regionValue2524;
        long regionNext2564 = regionValue2525;
        long regionNext2565 = regionValue2526;
        long regionNext2566 = regionValue2527;
        long regionNext2567 = regionValue2528;
        int regionNext2568 = regionValue2529;
        int regionNext2569 = regionValue2530;
        int regionNext2570 = regionValue2531;
        regionValue2545 = regionNext2558;
        regionValue2546 = regionNext2559;
        regionValue2547 = regionNext2560;
        regionValue2548 = regionNext2561;
        regionValue2549 = regionNext2562;
        regionValue2550 = regionNext2563;
        regionValue2551 = regionNext2564;
        regionValue2552 = regionNext2565;
        regionValue2553 = regionNext2566;
        regionValue2554 = regionNext2567;
        regionValue2555 = regionNext2568;
        regionValue2556 = regionNext2569;
        regionValue2557 = regionNext2570;
        break region249;
        }
        if (regionValue2557 == 0) {
            java.lang.Object regionNext2571 = regionValue2545;
            int regionNext2572 = regionValue2546;
            int regionNext2573 = regionValue2547;
            int regionNext2574 = regionValue2548;
            long regionNext2575 = regionValue2549;
            long regionNext2576 = regionValue2550;
            long regionNext2577 = regionValue2551;
            long regionNext2578 = regionValue2552;
            long regionNext2579 = regionValue2553;
            long regionNext2580 = regionValue2554;
            int regionNext2581 = regionValue2555;
            int regionNext2582 = regionValue2556;
            regionValue2456 = regionNext2571;
            regionValue2457 = regionNext2572;
            regionValue2458 = regionNext2573;
            regionValue2459 = regionNext2574;
            regionValue2460 = regionNext2575;
            regionValue2461 = regionNext2576;
            regionValue2462 = regionNext2577;
            regionValue2463 = regionNext2578;
            regionValue2464 = regionNext2579;
            regionValue2465 = regionNext2580;
            regionValue2466 = regionNext2581;
            regionValue2467 = regionNext2582;
            break region270;
        } else {
            java.lang.Object regionNext2595 = regionValue2545;
            int regionNext2596 = regionValue2546;
            int regionNext2597 = regionValue2547;
            int regionNext2598 = regionValue2548;
            long regionNext2599 = regionValue2549;
            long regionNext2600 = regionValue2550;
            long regionNext2601 = regionValue2551;
            long regionNext2602 = regionValue2552;
            long regionNext2603 = regionValue2553;
            long regionNext2604 = regionValue2554;
            int regionNext2605 = regionValue2555;
            int regionNext2606 = regionValue2556;
            regionValue2583 = regionNext2595;
            regionValue2584 = regionNext2596;
            regionValue2585 = regionNext2597;
            regionValue2586 = regionNext2598;
            regionValue2587 = regionNext2599;
            regionValue2588 = regionNext2600;
            regionValue2589 = regionNext2601;
            regionValue2590 = regionNext2602;
            regionValue2591 = regionNext2603;
            regionValue2592 = regionNext2604;
            regionValue2593 = regionNext2605;
            regionValue2594 = regionNext2606;
            break region250;
        }
        }
        java.lang.Object regionNext2619 = regionValue2583;
        int regionNext2620 = regionValue2584;
        int regionNext2621 = regionValue2585;
        int regionNext2622 = regionValue2586;
        long regionNext2623 = regionValue2587;
        long regionNext2624 = regionValue2588;
        long regionNext2625 = regionValue2589;
        long regionNext2626 = regionValue2590;
        long regionNext2627 = regionValue2591;
        long regionNext2628 = regionValue2592;
        int regionNext2629 = regionValue2593;
        int regionNext2630 = regionValue2594;
        regionValue2607 = regionNext2619;
        regionValue2608 = regionNext2620;
        regionValue2609 = regionNext2621;
        regionValue2610 = regionNext2622;
        regionValue2611 = regionNext2623;
        regionValue2612 = regionNext2624;
        regionValue2613 = regionNext2625;
        regionValue2614 = regionNext2626;
        regionValue2615 = regionNext2627;
        regionValue2616 = regionNext2628;
        regionValue2617 = regionNext2629;
        regionValue2618 = regionNext2630;
        break region252;
        }
        java.lang.Object initialValue2631 = recovery$indy$flow$1154();
        java.lang.Object initialValue2632 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue2631)))).field_41K));
        boolean initialValue2633 = recovery$indy$flow$1156(initialValue2632, 3404398742894499063L, regionValue2611);
        if (regionValue2610 < 0) {
            java.lang.Object regionNext2648 = regionValue2607;
            int regionNext2649 = regionValue2608;
            int regionNext2650 = regionValue2609;
            int regionNext2651 = regionValue2610;
            long regionNext2652 = regionValue2611;
            long regionNext2653 = regionValue2612;
            long regionNext2654 = regionValue2613;
            long regionNext2655 = regionValue2614;
            long regionNext2656 = regionValue2615;
            long regionNext2657 = regionValue2616;
            int regionNext2658 = regionValue2617;
            int regionNext2659 = regionValue2618;
            int regionNext2660 = (int) ((initialValue2633 ? 1 : 0));
            int regionNext2661 = regionValue2617;
            regionValue2634 = regionNext2648;
            regionValue2635 = regionNext2649;
            regionValue2636 = regionNext2650;
            regionValue2637 = regionNext2651;
            regionValue2638 = regionNext2652;
            regionValue2639 = regionNext2653;
            regionValue2640 = regionNext2654;
            regionValue2641 = regionNext2655;
            regionValue2642 = regionNext2656;
            regionValue2643 = regionNext2657;
            regionValue2644 = regionNext2658;
            regionValue2645 = regionNext2659;
            regionValue2646 = regionNext2660;
            regionValue2647 = regionNext2661;
            break region274;
        } else {
            java.lang.Object regionNext2676 = regionValue2607;
            int regionNext2677 = regionValue2608;
            int regionNext2678 = regionValue2609;
            int regionNext2679 = regionValue2610;
            long regionNext2680 = regionValue2611;
            long regionNext2681 = regionValue2612;
            long regionNext2682 = regionValue2613;
            long regionNext2683 = regionValue2614;
            long regionNext2684 = regionValue2615;
            long regionNext2685 = regionValue2616;
            int regionNext2686 = regionValue2617;
            int regionNext2687 = regionValue2618;
            int regionNext2688 = (int) ((initialValue2633 ? 1 : 0));
            int regionNext2689 = regionValue2617;
            regionValue2662 = regionNext2676;
            regionValue2663 = regionNext2677;
            regionValue2664 = regionNext2678;
            regionValue2665 = regionNext2679;
            regionValue2666 = regionNext2680;
            regionValue2667 = regionNext2681;
            regionValue2668 = regionNext2682;
            regionValue2669 = regionNext2683;
            regionValue2670 = regionNext2684;
            regionValue2671 = regionNext2685;
            regionValue2672 = regionNext2686;
            regionValue2673 = regionNext2687;
            regionValue2674 = regionNext2688;
            regionValue2675 = regionNext2689;
            break region260;
        }
        }
        java.lang.Object regionNext2704 = regionValue2662;
        int regionNext2705 = regionValue2663;
        int regionNext2706 = regionValue2664;
        int regionNext2707 = regionValue2665;
        long regionNext2708 = regionValue2666;
        long regionNext2709 = regionValue2667;
        long regionNext2710 = regionValue2668;
        long regionNext2711 = regionValue2669;
        long regionNext2712 = regionValue2670;
        long regionNext2713 = regionValue2671;
        int regionNext2714 = regionValue2672;
        int regionNext2715 = regionValue2673;
        int regionNext2716 = regionValue2674;
        int regionNext2717 = regionValue2675;
        regionValue2690 = regionNext2704;
        regionValue2691 = regionNext2705;
        regionValue2692 = regionNext2706;
        regionValue2693 = regionNext2707;
        regionValue2694 = regionNext2708;
        regionValue2695 = regionNext2709;
        regionValue2696 = regionNext2710;
        regionValue2697 = regionNext2711;
        regionValue2698 = regionNext2712;
        regionValue2699 = regionNext2713;
        regionValue2700 = regionNext2714;
        regionValue2701 = regionNext2715;
        regionValue2702 = regionNext2716;
        regionValue2703 = regionNext2717;
        break region262;
        }
        if (regionValue2703 != 0) {
            java.lang.Object regionNext2718 = regionValue2690;
            int regionNext2719 = regionValue2691;
            int regionNext2720 = regionValue2692;
            int regionNext2721 = regionValue2693;
            long regionNext2722 = regionValue2694;
            long regionNext2723 = regionValue2695;
            long regionNext2724 = regionValue2696;
            long regionNext2725 = regionValue2697;
            long regionNext2726 = regionValue2698;
            long regionNext2727 = regionValue2699;
            int regionNext2728 = regionValue2700;
            int regionNext2729 = regionValue2701;
            int regionNext2730 = regionValue2702;
            regionValue2404 = regionNext2718;
            regionValue2405 = regionNext2719;
            regionValue2406 = regionNext2720;
            regionValue2407 = regionNext2721;
            regionValue2408 = regionNext2722;
            regionValue2409 = regionNext2723;
            regionValue2410 = regionNext2724;
            regionValue2411 = regionNext2725;
            regionValue2412 = regionNext2726;
            regionValue2413 = regionNext2727;
            regionValue2414 = regionNext2728;
            regionValue2415 = regionNext2729;
            regionValue2416 = regionNext2730;
            break region273;
        } else {
            java.lang.Object regionNext2744 = regionValue2690;
            int regionNext2745 = regionValue2691;
            int regionNext2746 = regionValue2692;
            int regionNext2747 = regionValue2693;
            long regionNext2748 = regionValue2694;
            long regionNext2749 = regionValue2695;
            long regionNext2750 = regionValue2696;
            long regionNext2751 = regionValue2697;
            long regionNext2752 = regionValue2698;
            long regionNext2753 = regionValue2699;
            int regionNext2754 = regionValue2700;
            int regionNext2755 = regionValue2701;
            int regionNext2756 = regionValue2702;
            regionValue2731 = regionNext2744;
            regionValue2732 = regionNext2745;
            regionValue2733 = regionNext2746;
            regionValue2734 = regionNext2747;
            regionValue2735 = regionNext2748;
            regionValue2736 = regionNext2749;
            regionValue2737 = regionNext2750;
            regionValue2738 = regionNext2751;
            regionValue2739 = regionNext2752;
            regionValue2740 = regionNext2753;
            regionValue2741 = regionNext2754;
            regionValue2742 = regionNext2755;
            regionValue2743 = regionNext2756;
            break region263;
        }
        }
        java.lang.Object regionNext2770 = regionValue2731;
        int regionNext2771 = regionValue2732;
        int regionNext2772 = regionValue2733;
        int regionNext2773 = regionValue2734;
        long regionNext2774 = regionValue2735;
        long regionNext2775 = regionValue2736;
        long regionNext2776 = regionValue2737;
        long regionNext2777 = regionValue2738;
        long regionNext2778 = regionValue2739;
        long regionNext2779 = regionValue2740;
        int regionNext2780 = regionValue2741;
        int regionNext2781 = regionValue2742;
        int regionNext2782 = regionValue2743;
        regionValue2757 = regionNext2770;
        regionValue2758 = regionNext2771;
        regionValue2759 = regionNext2772;
        regionValue2760 = regionNext2773;
        regionValue2761 = regionNext2774;
        regionValue2762 = regionNext2775;
        regionValue2763 = regionNext2776;
        regionValue2764 = regionNext2777;
        regionValue2765 = regionNext2778;
        regionValue2766 = regionNext2779;
        regionValue2767 = regionNext2780;
        regionValue2768 = regionNext2781;
        regionValue2769 = regionNext2782;
        break region265;
        }
        if (regionValue2769 == 0) {
            java.lang.Object regionNext2783 = regionValue2757;
            int regionNext2784 = regionValue2758;
            int regionNext2785 = regionValue2759;
            int regionNext2786 = regionValue2760;
            long regionNext2787 = regionValue2761;
            long regionNext2788 = regionValue2762;
            long regionNext2789 = regionValue2763;
            long regionNext2790 = regionValue2764;
            long regionNext2791 = regionValue2765;
            long regionNext2792 = regionValue2766;
            int regionNext2793 = regionValue2767;
            int regionNext2794 = regionValue2768;
            regionValue2456 = regionNext2783;
            regionValue2457 = regionNext2784;
            regionValue2458 = regionNext2785;
            regionValue2459 = regionNext2786;
            regionValue2460 = regionNext2787;
            regionValue2461 = regionNext2788;
            regionValue2462 = regionNext2789;
            regionValue2463 = regionNext2790;
            regionValue2464 = regionNext2791;
            regionValue2465 = regionNext2792;
            regionValue2466 = regionNext2793;
            regionValue2467 = regionNext2794;
            break region270;
        } else {
            java.lang.Object regionNext2806 = regionValue2757;
            int regionNext2807 = regionValue2758;
            int regionNext2808 = regionValue2759;
            int regionNext2809 = regionValue2760;
            long regionNext2810 = regionValue2761;
            long regionNext2811 = regionValue2762;
            long regionNext2812 = regionValue2763;
            long regionNext2813 = regionValue2764;
            long regionNext2814 = regionValue2765;
            long regionNext2815 = regionValue2766;
            int regionNext2816 = regionValue2767;
            regionValue2795 = regionNext2806;
            regionValue2796 = regionNext2807;
            regionValue2797 = regionNext2808;
            regionValue2798 = regionNext2809;
            regionValue2799 = regionNext2810;
            regionValue2800 = regionNext2811;
            regionValue2801 = regionNext2812;
            regionValue2802 = regionNext2813;
            regionValue2803 = regionNext2814;
            regionValue2804 = regionNext2815;
            regionValue2805 = regionNext2816;
            break region266;
        }
        }
        int initialValue2817 = 0;
        if (regionValue2805 == 0) {
            java.lang.Object regionNext2826 = regionValue2795;
            int regionNext2827 = regionValue2797;
            long regionNext2828 = regionValue2799;
            long regionNext2829 = regionValue2801;
            long regionNext2830 = regionValue2802;
            long regionNext2831 = regionValue2804;
            int regionNext2832 = regionValue2805;
            int regionNext2833 = initialValue2817;
            regionValue2818 = regionNext2826;
            regionValue2819 = regionNext2827;
            regionValue2820 = regionNext2828;
            regionValue2821 = regionNext2829;
            regionValue2822 = regionNext2830;
            regionValue2823 = regionNext2831;
            regionValue2824 = regionNext2832;
            regionValue2825 = regionNext2833;
            break region411;
        } else {
            java.lang.Object regionNext2834 = regionValue2795;
            int regionNext2835 = regionValue2796;
            int regionNext2836 = regionValue2797;
            int regionNext2837 = regionValue2798;
            long regionNext2838 = regionValue2799;
            long regionNext2839 = regionValue2800;
            long regionNext2840 = regionValue2801;
            long regionNext2841 = regionValue2802;
            long regionNext2842 = regionValue2803;
            long regionNext2843 = regionValue2804;
            int regionNext2844 = regionValue2805;
            int regionNext2845 = initialValue2817;
            regionValue2456 = regionNext2834;
            regionValue2457 = regionNext2835;
            regionValue2458 = regionNext2836;
            regionValue2459 = regionNext2837;
            regionValue2460 = regionNext2838;
            regionValue2461 = regionNext2839;
            regionValue2462 = regionNext2840;
            regionValue2463 = regionNext2841;
            regionValue2464 = regionNext2842;
            regionValue2465 = regionNext2843;
            regionValue2466 = regionNext2844;
            regionValue2467 = regionNext2845;
            break region270;
        }
        }
        java.lang.Object regionNext2846 = regionValue2456;
        int regionNext2847 = regionValue2457;
        int regionNext2848 = regionValue2458;
        int regionNext2849 = regionValue2459;
        long regionNext2850 = regionValue2460;
        long regionNext2851 = regionValue2461;
        long regionNext2852 = regionValue2462;
        long regionNext2853 = regionValue2463;
        long regionNext2854 = regionValue2464;
        long regionNext2855 = regionValue2465;
        int regionNext2856 = regionValue2466;
        int regionNext2857 = regionValue2467;
        int regionNext2858 = regionValue2467;
        regionValue2404 = regionNext2846;
        regionValue2405 = regionNext2847;
        regionValue2406 = regionNext2848;
        regionValue2407 = regionNext2849;
        regionValue2408 = regionNext2850;
        regionValue2409 = regionNext2851;
        regionValue2410 = regionNext2852;
        regionValue2411 = regionNext2853;
        regionValue2412 = regionNext2854;
        regionValue2413 = regionNext2855;
        regionValue2414 = regionNext2856;
        regionValue2415 = regionNext2857;
        regionValue2416 = regionNext2858;
        break region273;
        }
        java.lang.Object regionNext2859 = regionValue2404;
        int regionNext2860 = regionValue2405;
        int regionNext2861 = regionValue2406;
        int regionNext2862 = regionValue2407;
        long regionNext2863 = regionValue2408;
        long regionNext2864 = regionValue2409;
        long regionNext2865 = regionValue2410;
        long regionNext2866 = regionValue2411;
        long regionNext2867 = regionValue2412;
        long regionNext2868 = regionValue2413;
        int regionNext2869 = regionValue2414;
        int regionNext2870 = regionValue2415;
        int regionNext2871 = regionValue2416;
        int regionNext2872 = regionValue2414;
        regionValue2634 = regionNext2859;
        regionValue2635 = regionNext2860;
        regionValue2636 = regionNext2861;
        regionValue2637 = regionNext2862;
        regionValue2638 = regionNext2863;
        regionValue2639 = regionNext2864;
        regionValue2640 = regionNext2865;
        regionValue2641 = regionNext2866;
        regionValue2642 = regionNext2867;
        regionValue2643 = regionNext2868;
        regionValue2644 = regionNext2869;
        regionValue2645 = regionNext2870;
        regionValue2646 = regionNext2871;
        regionValue2647 = regionNext2872;
        break region274;
        }
        if (regionValue2647 != 0) {
            java.lang.Object regionNext2884 = regionValue2634;
            int regionNext2885 = regionValue2636;
            int regionNext2886 = regionValue2637;
            long regionNext2887 = regionValue2638;
            long regionNext2888 = regionValue2640;
            long regionNext2889 = regionValue2641;
            long regionNext2890 = regionValue2642;
            long regionNext2891 = regionValue2643;
            int regionNext2892 = regionValue2644;
            int regionNext2893 = regionValue2645;
            int regionNext2894 = regionValue2646;
            regionValue2873 = regionNext2884;
            regionValue2874 = regionNext2885;
            regionValue2875 = regionNext2886;
            regionValue2876 = regionNext2887;
            regionValue2877 = regionNext2888;
            regionValue2878 = regionNext2889;
            regionValue2879 = regionNext2890;
            regionValue2880 = regionNext2891;
            regionValue2881 = regionNext2892;
            regionValue2882 = regionNext2893;
            regionValue2883 = regionNext2894;
            break region333;
        } else {
            java.lang.Object regionNext2908 = regionValue2634;
            int regionNext2909 = regionValue2635;
            int regionNext2910 = regionValue2636;
            int regionNext2911 = regionValue2637;
            long regionNext2912 = regionValue2638;
            long regionNext2913 = regionValue2639;
            long regionNext2914 = regionValue2640;
            long regionNext2915 = regionValue2641;
            long regionNext2916 = regionValue2642;
            long regionNext2917 = regionValue2643;
            int regionNext2918 = regionValue2644;
            int regionNext2919 = regionValue2645;
            int regionNext2920 = regionValue2646;
            regionValue2895 = regionNext2908;
            regionValue2896 = regionNext2909;
            regionValue2897 = regionNext2910;
            regionValue2898 = regionNext2911;
            regionValue2899 = regionNext2912;
            regionValue2900 = regionNext2913;
            regionValue2901 = regionNext2914;
            regionValue2902 = regionNext2915;
            regionValue2903 = regionNext2916;
            regionValue2904 = regionNext2917;
            regionValue2905 = regionNext2918;
            regionValue2906 = regionNext2919;
            regionValue2907 = regionNext2920;
            break region275;
        }
        }
        if (regionValue2907 != 0) {
            java.lang.Object regionNext2931 = regionValue2895;
            int regionNext2932 = regionValue2897;
            int regionNext2933 = regionValue2898;
            long regionNext2934 = regionValue2899;
            long regionNext2935 = regionValue2901;
            long regionNext2936 = regionValue2902;
            long regionNext2937 = regionValue2903;
            long regionNext2938 = regionValue2904;
            int regionNext2939 = regionValue2905;
            int regionNext2940 = regionValue2906;
            regionValue2921 = regionNext2931;
            regionValue2922 = regionNext2932;
            regionValue2923 = regionNext2933;
            regionValue2924 = regionNext2934;
            regionValue2925 = regionNext2935;
            regionValue2926 = regionNext2936;
            regionValue2927 = regionNext2937;
            regionValue2928 = regionNext2938;
            regionValue2929 = regionNext2939;
            regionValue2930 = regionNext2940;
            break region330;
        } else {
            java.lang.Object regionNext2953 = regionValue2895;
            int regionNext2954 = regionValue2896;
            int regionNext2955 = regionValue2897;
            int regionNext2956 = regionValue2898;
            long regionNext2957 = regionValue2899;
            long regionNext2958 = regionValue2900;
            long regionNext2959 = regionValue2901;
            long regionNext2960 = regionValue2902;
            long regionNext2961 = regionValue2903;
            long regionNext2962 = regionValue2904;
            int regionNext2963 = regionValue2905;
            int regionNext2964 = regionValue2906;
            regionValue2941 = regionNext2953;
            regionValue2942 = regionNext2954;
            regionValue2943 = regionNext2955;
            regionValue2944 = regionNext2956;
            regionValue2945 = regionNext2957;
            regionValue2946 = regionNext2958;
            regionValue2947 = regionNext2959;
            regionValue2948 = regionNext2960;
            regionValue2949 = regionNext2961;
            regionValue2950 = regionNext2962;
            regionValue2951 = regionNext2963;
            regionValue2952 = regionNext2964;
            break region276;
        }
        }
        java.lang.Object initialValue2965 = recovery$indy$flow$1157();
        java.lang.Object initialValue2966 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue2965)))).field_41K));
        boolean initialValue2967 = recovery$indy$flow$1159(initialValue2966, regionValue2946, 3387107940511376946L, regionValue2945);
        if (regionValue2951 != 0) {
            java.lang.Object regionNext2968 = regionValue2941;
            int regionNext2969 = regionValue2943;
            int regionNext2970 = regionValue2944;
            long regionNext2971 = regionValue2945;
            long regionNext2972 = regionValue2947;
            long regionNext2973 = regionValue2948;
            long regionNext2974 = regionValue2949;
            long regionNext2975 = regionValue2950;
            int regionNext2976 = regionValue2951;
            int regionNext2977 = regionValue2952;
            int regionNext2978 = (int) ((initialValue2967 ? 1 : 0));
            regionValue2873 = regionNext2968;
            regionValue2874 = regionNext2969;
            regionValue2875 = regionNext2970;
            regionValue2876 = regionNext2971;
            regionValue2877 = regionNext2972;
            regionValue2878 = regionNext2973;
            regionValue2879 = regionNext2974;
            regionValue2880 = regionNext2975;
            regionValue2881 = regionNext2976;
            regionValue2882 = regionNext2977;
            regionValue2883 = regionNext2978;
            break region333;
        } else {
            java.lang.Object regionNext2991 = regionValue2941;
            int regionNext2992 = regionValue2942;
            int regionNext2993 = regionValue2943;
            int regionNext2994 = regionValue2944;
            long regionNext2995 = regionValue2945;
            long regionNext2996 = regionValue2947;
            long regionNext2997 = regionValue2948;
            long regionNext2998 = regionValue2949;
            long regionNext2999 = regionValue2950;
            int regionNext3000 = regionValue2951;
            int regionNext3001 = regionValue2952;
            int regionNext3002 = (int) ((initialValue2967 ? 1 : 0));
            regionValue2979 = regionNext2991;
            regionValue2980 = regionNext2992;
            regionValue2981 = regionNext2993;
            regionValue2982 = regionNext2994;
            regionValue2983 = regionNext2995;
            regionValue2984 = regionNext2996;
            regionValue2985 = regionNext2997;
            regionValue2986 = regionNext2998;
            regionValue2987 = regionNext2999;
            regionValue2988 = regionNext3000;
            regionValue2989 = regionNext3001;
            regionValue2990 = regionNext3002;
            break region284;
        }
        }
        java.lang.Object regionNext3015 = regionValue2979;
        int regionNext3016 = regionValue2980;
        int regionNext3017 = regionValue2981;
        int regionNext3018 = regionValue2982;
        long regionNext3019 = regionValue2983;
        long regionNext3020 = regionValue2984;
        long regionNext3021 = regionValue2985;
        long regionNext3022 = regionValue2986;
        long regionNext3023 = regionValue2987;
        int regionNext3024 = regionValue2988;
        int regionNext3025 = regionValue2989;
        int regionNext3026 = regionValue2990;
        regionValue3003 = regionNext3015;
        regionValue3004 = regionNext3016;
        regionValue3005 = regionNext3017;
        regionValue3006 = regionNext3018;
        regionValue3007 = regionNext3019;
        regionValue3008 = regionNext3020;
        regionValue3009 = regionNext3021;
        regionValue3010 = regionNext3022;
        regionValue3011 = regionNext3023;
        regionValue3012 = regionNext3024;
        regionValue3013 = regionNext3025;
        regionValue3014 = regionNext3026;
        break region286;
        }
        if (regionValue3014 == 0) {
            java.lang.Object regionNext3027 = regionValue3003;
            int regionNext3028 = regionValue3005;
            int regionNext3029 = regionValue3006;
            long regionNext3030 = regionValue3007;
            long regionNext3031 = regionValue3008;
            long regionNext3032 = regionValue3009;
            long regionNext3033 = regionValue3010;
            long regionNext3034 = regionValue3011;
            int regionNext3035 = regionValue3012;
            int regionNext3036 = regionValue3013;
            regionValue2921 = regionNext3027;
            regionValue2922 = regionNext3028;
            regionValue2923 = regionNext3029;
            regionValue2924 = regionNext3030;
            regionValue2925 = regionNext3031;
            regionValue2926 = regionNext3032;
            regionValue2927 = regionNext3033;
            regionValue2928 = regionNext3034;
            regionValue2929 = regionNext3035;
            regionValue2930 = regionNext3036;
            break region330;
        } else {
            java.lang.Object regionNext3048 = regionValue3003;
            int regionNext3049 = regionValue3004;
            int regionNext3050 = regionValue3005;
            int regionNext3051 = regionValue3006;
            long regionNext3052 = regionValue3007;
            long regionNext3053 = regionValue3008;
            long regionNext3054 = regionValue3009;
            long regionNext3055 = regionValue3010;
            long regionNext3056 = regionValue3011;
            int regionNext3057 = regionValue3012;
            int regionNext3058 = regionValue3013;
            regionValue3037 = regionNext3048;
            regionValue3038 = regionNext3049;
            regionValue3039 = regionNext3050;
            regionValue3040 = regionNext3051;
            regionValue3041 = regionNext3052;
            regionValue3042 = regionNext3053;
            regionValue3043 = regionNext3054;
            regionValue3044 = regionNext3055;
            regionValue3045 = regionNext3056;
            regionValue3046 = regionNext3057;
            regionValue3047 = regionNext3058;
            break region287;
        }
        }
        java.lang.Object regionNext3070 = regionValue3037;
        int regionNext3071 = regionValue3038;
        int regionNext3072 = regionValue3039;
        int regionNext3073 = regionValue3040;
        long regionNext3074 = regionValue3041;
        long regionNext3075 = regionValue3042;
        long regionNext3076 = regionValue3043;
        long regionNext3077 = regionValue3044;
        long regionNext3078 = regionValue3045;
        int regionNext3079 = regionValue3046;
        int regionNext3080 = regionValue3047;
        regionValue3059 = regionNext3070;
        regionValue3060 = regionNext3071;
        regionValue3061 = regionNext3072;
        regionValue3062 = regionNext3073;
        regionValue3063 = regionNext3074;
        regionValue3064 = regionNext3075;
        regionValue3065 = regionNext3076;
        regionValue3066 = regionNext3077;
        regionValue3067 = regionNext3078;
        regionValue3068 = regionNext3079;
        regionValue3069 = regionNext3080;
        break region289;
        }
        java.lang.Object initialValue3081 = recovery$indy$flow$1160();
        boolean initialValue3082 = recovery$indy$flow$1161(initialValue3081, 3387393322864457637L, regionValue3063);
        if (regionValue3068 != 0) {
            java.lang.Object regionNext3083 = regionValue3059;
            int regionNext3084 = regionValue3061;
            int regionNext3085 = regionValue3062;
            long regionNext3086 = regionValue3063;
            long regionNext3087 = regionValue3064;
            long regionNext3088 = regionValue3065;
            long regionNext3089 = regionValue3066;
            long regionNext3090 = regionValue3067;
            int regionNext3091 = regionValue3068;
            int regionNext3092 = regionValue3069;
            int regionNext3093 = (int) ((initialValue3082 ? 1 : 0));
            regionValue2873 = regionNext3083;
            regionValue2874 = regionNext3084;
            regionValue2875 = regionNext3085;
            regionValue2876 = regionNext3086;
            regionValue2877 = regionNext3087;
            regionValue2878 = regionNext3088;
            regionValue2879 = regionNext3089;
            regionValue2880 = regionNext3090;
            regionValue2881 = regionNext3091;
            regionValue2882 = regionNext3092;
            regionValue2883 = regionNext3093;
            break region333;
        } else {
            java.lang.Object regionNext3106 = regionValue3059;
            int regionNext3107 = regionValue3060;
            int regionNext3108 = regionValue3061;
            int regionNext3109 = regionValue3062;
            long regionNext3110 = regionValue3063;
            long regionNext3111 = regionValue3064;
            long regionNext3112 = regionValue3065;
            long regionNext3113 = regionValue3066;
            long regionNext3114 = regionValue3067;
            int regionNext3115 = regionValue3068;
            int regionNext3116 = regionValue3069;
            int regionNext3117 = (int) ((initialValue3082 ? 1 : 0));
            regionValue3094 = regionNext3106;
            regionValue3095 = regionNext3107;
            regionValue3096 = regionNext3108;
            regionValue3097 = regionNext3109;
            regionValue3098 = regionNext3110;
            regionValue3099 = regionNext3111;
            regionValue3100 = regionNext3112;
            regionValue3101 = regionNext3113;
            regionValue3102 = regionNext3114;
            regionValue3103 = regionNext3115;
            regionValue3104 = regionNext3116;
            regionValue3105 = regionNext3117;
            break region295;
        }
        }
        java.lang.Object regionNext3130 = regionValue3094;
        int regionNext3131 = regionValue3095;
        int regionNext3132 = regionValue3096;
        int regionNext3133 = regionValue3097;
        long regionNext3134 = regionValue3098;
        long regionNext3135 = regionValue3099;
        long regionNext3136 = regionValue3100;
        long regionNext3137 = regionValue3101;
        long regionNext3138 = regionValue3102;
        int regionNext3139 = regionValue3103;
        int regionNext3140 = regionValue3104;
        int regionNext3141 = regionValue3105;
        regionValue3118 = regionNext3130;
        regionValue3119 = regionNext3131;
        regionValue3120 = regionNext3132;
        regionValue3121 = regionNext3133;
        regionValue3122 = regionNext3134;
        regionValue3123 = regionNext3135;
        regionValue3124 = regionNext3136;
        regionValue3125 = regionNext3137;
        regionValue3126 = regionNext3138;
        regionValue3127 = regionNext3139;
        regionValue3128 = regionNext3140;
        regionValue3129 = regionNext3141;
        break region297;
        }
        if (regionValue3129 == 0) {
            java.lang.Object regionNext3142 = regionValue3118;
            int regionNext3143 = regionValue3120;
            int regionNext3144 = regionValue3121;
            long regionNext3145 = regionValue3122;
            long regionNext3146 = regionValue3123;
            long regionNext3147 = regionValue3124;
            long regionNext3148 = regionValue3125;
            long regionNext3149 = regionValue3126;
            int regionNext3150 = regionValue3127;
            int regionNext3151 = regionValue3128;
            regionValue2921 = regionNext3142;
            regionValue2922 = regionNext3143;
            regionValue2923 = regionNext3144;
            regionValue2924 = regionNext3145;
            regionValue2925 = regionNext3146;
            regionValue2926 = regionNext3147;
            regionValue2927 = regionNext3148;
            regionValue2928 = regionNext3149;
            regionValue2929 = regionNext3150;
            regionValue2930 = regionNext3151;
            break region330;
        } else {
            java.lang.Object regionNext3163 = regionValue3118;
            int regionNext3164 = regionValue3119;
            int regionNext3165 = regionValue3120;
            int regionNext3166 = regionValue3121;
            long regionNext3167 = regionValue3122;
            long regionNext3168 = regionValue3123;
            long regionNext3169 = regionValue3124;
            long regionNext3170 = regionValue3125;
            long regionNext3171 = regionValue3126;
            int regionNext3172 = regionValue3127;
            int regionNext3173 = regionValue3128;
            regionValue3152 = regionNext3163;
            regionValue3153 = regionNext3164;
            regionValue3154 = regionNext3165;
            regionValue3155 = regionNext3166;
            regionValue3156 = regionNext3167;
            regionValue3157 = regionNext3168;
            regionValue3158 = regionNext3169;
            regionValue3159 = regionNext3170;
            regionValue3160 = regionNext3171;
            regionValue3161 = regionNext3172;
            regionValue3162 = regionNext3173;
            break region298;
        }
        }
        java.lang.Object regionNext3185 = regionValue3152;
        int regionNext3186 = regionValue3153;
        int regionNext3187 = regionValue3154;
        int regionNext3188 = regionValue3155;
        long regionNext3189 = regionValue3156;
        long regionNext3190 = regionValue3157;
        long regionNext3191 = regionValue3158;
        long regionNext3192 = regionValue3159;
        long regionNext3193 = regionValue3160;
        int regionNext3194 = regionValue3161;
        int regionNext3195 = regionValue3162;
        regionValue3174 = regionNext3185;
        regionValue3175 = regionNext3186;
        regionValue3176 = regionNext3187;
        regionValue3177 = regionNext3188;
        regionValue3178 = regionNext3189;
        regionValue3179 = regionNext3190;
        regionValue3180 = regionNext3191;
        regionValue3181 = regionNext3192;
        regionValue3182 = regionNext3193;
        regionValue3183 = regionNext3194;
        regionValue3184 = regionNext3195;
        break region300;
        }
        java.lang.Object initialValue3196 = recovery$indy$flow$1162();
        java.lang.Object initialValue3197 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue3196)))).field_41K));
        boolean initialValue3198 = recovery$indy$flow$1164(initialValue3197, 3404398742894499063L, regionValue3178);
        if (regionValue3183 != 0) {
            java.lang.Object regionNext3199 = regionValue3174;
            int regionNext3200 = regionValue3176;
            int regionNext3201 = regionValue3177;
            long regionNext3202 = regionValue3178;
            long regionNext3203 = regionValue3179;
            long regionNext3204 = regionValue3180;
            long regionNext3205 = regionValue3181;
            long regionNext3206 = regionValue3182;
            int regionNext3207 = regionValue3183;
            int regionNext3208 = regionValue3184;
            int regionNext3209 = (int) ((initialValue3198 ? 1 : 0));
            regionValue2873 = regionNext3199;
            regionValue2874 = regionNext3200;
            regionValue2875 = regionNext3201;
            regionValue2876 = regionNext3202;
            regionValue2877 = regionNext3203;
            regionValue2878 = regionNext3204;
            regionValue2879 = regionNext3205;
            regionValue2880 = regionNext3206;
            regionValue2881 = regionNext3207;
            regionValue2882 = regionNext3208;
            regionValue2883 = regionNext3209;
            break region333;
        } else {
            java.lang.Object regionNext3222 = regionValue3174;
            int regionNext3223 = regionValue3175;
            int regionNext3224 = regionValue3176;
            int regionNext3225 = regionValue3177;
            long regionNext3226 = regionValue3178;
            long regionNext3227 = regionValue3179;
            long regionNext3228 = regionValue3180;
            long regionNext3229 = regionValue3181;
            long regionNext3230 = regionValue3182;
            int regionNext3231 = regionValue3183;
            int regionNext3232 = regionValue3184;
            int regionNext3233 = (int) ((initialValue3198 ? 1 : 0));
            regionValue3210 = regionNext3222;
            regionValue3211 = regionNext3223;
            regionValue3212 = regionNext3224;
            regionValue3213 = regionNext3225;
            regionValue3214 = regionNext3226;
            regionValue3215 = regionNext3227;
            regionValue3216 = regionNext3228;
            regionValue3217 = regionNext3229;
            regionValue3218 = regionNext3230;
            regionValue3219 = regionNext3231;
            regionValue3220 = regionNext3232;
            regionValue3221 = regionNext3233;
            break region307;
        }
        }
        java.lang.Object regionNext3246 = regionValue3210;
        int regionNext3247 = regionValue3211;
        int regionNext3248 = regionValue3212;
        int regionNext3249 = regionValue3213;
        long regionNext3250 = regionValue3214;
        long regionNext3251 = regionValue3215;
        long regionNext3252 = regionValue3216;
        long regionNext3253 = regionValue3217;
        long regionNext3254 = regionValue3218;
        int regionNext3255 = regionValue3219;
        int regionNext3256 = regionValue3220;
        int regionNext3257 = regionValue3221;
        regionValue3234 = regionNext3246;
        regionValue3235 = regionNext3247;
        regionValue3236 = regionNext3248;
        regionValue3237 = regionNext3249;
        regionValue3238 = regionNext3250;
        regionValue3239 = regionNext3251;
        regionValue3240 = regionNext3252;
        regionValue3241 = regionNext3253;
        regionValue3242 = regionNext3254;
        regionValue3243 = regionNext3255;
        regionValue3244 = regionNext3256;
        regionValue3245 = regionNext3257;
        break region309;
        }
        if (regionValue3245 != 0) {
            java.lang.Object regionNext3258 = regionValue3234;
            int regionNext3259 = regionValue3236;
            int regionNext3260 = regionValue3237;
            long regionNext3261 = regionValue3238;
            long regionNext3262 = regionValue3239;
            long regionNext3263 = regionValue3240;
            long regionNext3264 = regionValue3241;
            long regionNext3265 = regionValue3242;
            int regionNext3266 = regionValue3243;
            int regionNext3267 = regionValue3244;
            regionValue2921 = regionNext3258;
            regionValue2922 = regionNext3259;
            regionValue2923 = regionNext3260;
            regionValue2924 = regionNext3261;
            regionValue2925 = regionNext3262;
            regionValue2926 = regionNext3263;
            regionValue2927 = regionNext3264;
            regionValue2928 = regionNext3265;
            regionValue2929 = regionNext3266;
            regionValue2930 = regionNext3267;
            break region330;
        } else {
            java.lang.Object regionNext3279 = regionValue3234;
            int regionNext3280 = regionValue3235;
            int regionNext3281 = regionValue3236;
            int regionNext3282 = regionValue3237;
            long regionNext3283 = regionValue3238;
            long regionNext3284 = regionValue3239;
            long regionNext3285 = regionValue3240;
            long regionNext3286 = regionValue3241;
            long regionNext3287 = regionValue3242;
            int regionNext3288 = regionValue3243;
            int regionNext3289 = regionValue3244;
            regionValue3268 = regionNext3279;
            regionValue3269 = regionNext3280;
            regionValue3270 = regionNext3281;
            regionValue3271 = regionNext3282;
            regionValue3272 = regionNext3283;
            regionValue3273 = regionNext3284;
            regionValue3274 = regionNext3285;
            regionValue3275 = regionNext3286;
            regionValue3276 = regionNext3287;
            regionValue3277 = regionNext3288;
            regionValue3278 = regionNext3289;
            break region310;
        }
        }
        java.lang.Object regionNext3301 = regionValue3268;
        int regionNext3302 = regionValue3269;
        int regionNext3303 = regionValue3270;
        int regionNext3304 = regionValue3271;
        long regionNext3305 = regionValue3272;
        long regionNext3306 = regionValue3273;
        long regionNext3307 = regionValue3274;
        long regionNext3308 = regionValue3275;
        long regionNext3309 = regionValue3276;
        int regionNext3310 = regionValue3277;
        int regionNext3311 = regionValue3278;
        regionValue3290 = regionNext3301;
        regionValue3291 = regionNext3302;
        regionValue3292 = regionNext3303;
        regionValue3293 = regionNext3304;
        regionValue3294 = regionNext3305;
        regionValue3295 = regionNext3306;
        regionValue3296 = regionNext3307;
        regionValue3297 = regionNext3308;
        regionValue3298 = regionNext3309;
        regionValue3299 = regionNext3310;
        regionValue3300 = regionNext3311;
        break region312;
        }
        java.lang.Object initialValue3312 = recovery$indy$flow$1165();
        java.lang.Object initialValue3313 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue3312)))).field_41K));
        boolean initialValue3314 = recovery$indy$flow$1167(initialValue3313, 3403785276452356961L, regionValue3294);
        if (regionValue3291 < 0) {
            java.lang.Object regionNext3327 = regionValue3290;
            int regionNext3328 = regionValue3292;
            int regionNext3329 = regionValue3293;
            long regionNext3330 = regionValue3294;
            long regionNext3331 = regionValue3295;
            long regionNext3332 = regionValue3296;
            long regionNext3333 = regionValue3297;
            long regionNext3334 = regionValue3298;
            int regionNext3335 = regionValue3299;
            int regionNext3336 = regionValue3300;
            int regionNext3337 = (int) ((initialValue3314 ? 1 : 0));
            int regionNext3338 = regionValue3299;
            regionValue3315 = regionNext3327;
            regionValue3316 = regionNext3328;
            regionValue3317 = regionNext3329;
            regionValue3318 = regionNext3330;
            regionValue3319 = regionNext3331;
            regionValue3320 = regionNext3332;
            regionValue3321 = regionNext3333;
            regionValue3322 = regionNext3334;
            regionValue3323 = regionNext3335;
            regionValue3324 = regionNext3336;
            regionValue3325 = regionNext3337;
            regionValue3326 = regionNext3338;
            break region334;
        } else {
            java.lang.Object regionNext3351 = regionValue3290;
            int regionNext3352 = regionValue3292;
            int regionNext3353 = regionValue3293;
            long regionNext3354 = regionValue3294;
            long regionNext3355 = regionValue3295;
            long regionNext3356 = regionValue3296;
            long regionNext3357 = regionValue3297;
            long regionNext3358 = regionValue3298;
            int regionNext3359 = regionValue3299;
            int regionNext3360 = regionValue3300;
            int regionNext3361 = (int) ((initialValue3314 ? 1 : 0));
            int regionNext3362 = regionValue3299;
            regionValue3339 = regionNext3351;
            regionValue3340 = regionNext3352;
            regionValue3341 = regionNext3353;
            regionValue3342 = regionNext3354;
            regionValue3343 = regionNext3355;
            regionValue3344 = regionNext3356;
            regionValue3345 = regionNext3357;
            regionValue3346 = regionNext3358;
            regionValue3347 = regionNext3359;
            regionValue3348 = regionNext3360;
            regionValue3349 = regionNext3361;
            regionValue3350 = regionNext3362;
            break region320;
        }
        }
        java.lang.Object regionNext3375 = regionValue3339;
        int regionNext3376 = regionValue3340;
        int regionNext3377 = regionValue3341;
        long regionNext3378 = regionValue3342;
        long regionNext3379 = regionValue3343;
        long regionNext3380 = regionValue3344;
        long regionNext3381 = regionValue3345;
        long regionNext3382 = regionValue3346;
        int regionNext3383 = regionValue3347;
        int regionNext3384 = regionValue3348;
        int regionNext3385 = regionValue3349;
        int regionNext3386 = regionValue3350;
        regionValue3363 = regionNext3375;
        regionValue3364 = regionNext3376;
        regionValue3365 = regionNext3377;
        regionValue3366 = regionNext3378;
        regionValue3367 = regionNext3379;
        regionValue3368 = regionNext3380;
        regionValue3369 = regionNext3381;
        regionValue3370 = regionNext3382;
        regionValue3371 = regionNext3383;
        regionValue3372 = regionNext3384;
        regionValue3373 = regionNext3385;
        regionValue3374 = regionNext3386;
        break region322;
        }
        if (regionValue3374 != 0) {
            java.lang.Object regionNext3387 = regionValue3363;
            int regionNext3388 = regionValue3364;
            int regionNext3389 = regionValue3365;
            long regionNext3390 = regionValue3366;
            long regionNext3391 = regionValue3367;
            long regionNext3392 = regionValue3368;
            long regionNext3393 = regionValue3369;
            long regionNext3394 = regionValue3370;
            int regionNext3395 = regionValue3371;
            int regionNext3396 = regionValue3372;
            int regionNext3397 = regionValue3373;
            regionValue2873 = regionNext3387;
            regionValue2874 = regionNext3388;
            regionValue2875 = regionNext3389;
            regionValue2876 = regionNext3390;
            regionValue2877 = regionNext3391;
            regionValue2878 = regionNext3392;
            regionValue2879 = regionNext3393;
            regionValue2880 = regionNext3394;
            regionValue2881 = regionNext3395;
            regionValue2882 = regionNext3396;
            regionValue2883 = regionNext3397;
            break region333;
        } else {
            java.lang.Object regionNext3409 = regionValue3363;
            int regionNext3410 = regionValue3364;
            int regionNext3411 = regionValue3365;
            long regionNext3412 = regionValue3366;
            long regionNext3413 = regionValue3367;
            long regionNext3414 = regionValue3368;
            long regionNext3415 = regionValue3369;
            long regionNext3416 = regionValue3370;
            int regionNext3417 = regionValue3371;
            int regionNext3418 = regionValue3372;
            int regionNext3419 = regionValue3373;
            regionValue3398 = regionNext3409;
            regionValue3399 = regionNext3410;
            regionValue3400 = regionNext3411;
            regionValue3401 = regionNext3412;
            regionValue3402 = regionNext3413;
            regionValue3403 = regionNext3414;
            regionValue3404 = regionNext3415;
            regionValue3405 = regionNext3416;
            regionValue3406 = regionNext3417;
            regionValue3407 = regionNext3418;
            regionValue3408 = regionNext3419;
            break region323;
        }
        }
        java.lang.Object regionNext3431 = regionValue3398;
        int regionNext3432 = regionValue3399;
        int regionNext3433 = regionValue3400;
        long regionNext3434 = regionValue3401;
        long regionNext3435 = regionValue3402;
        long regionNext3436 = regionValue3403;
        long regionNext3437 = regionValue3404;
        long regionNext3438 = regionValue3405;
        int regionNext3439 = regionValue3406;
        int regionNext3440 = regionValue3407;
        int regionNext3441 = regionValue3408;
        regionValue3420 = regionNext3431;
        regionValue3421 = regionNext3432;
        regionValue3422 = regionNext3433;
        regionValue3423 = regionNext3434;
        regionValue3424 = regionNext3435;
        regionValue3425 = regionNext3436;
        regionValue3426 = regionNext3437;
        regionValue3427 = regionNext3438;
        regionValue3428 = regionNext3439;
        regionValue3429 = regionNext3440;
        regionValue3430 = regionNext3441;
        break region325;
        }
        if (regionValue3430 == 0) {
            java.lang.Object regionNext3442 = regionValue3420;
            int regionNext3443 = regionValue3421;
            int regionNext3444 = regionValue3422;
            long regionNext3445 = regionValue3423;
            long regionNext3446 = regionValue3424;
            long regionNext3447 = regionValue3425;
            long regionNext3448 = regionValue3426;
            long regionNext3449 = regionValue3427;
            int regionNext3450 = regionValue3428;
            int regionNext3451 = regionValue3429;
            regionValue2921 = regionNext3442;
            regionValue2922 = regionNext3443;
            regionValue2923 = regionNext3444;
            regionValue2924 = regionNext3445;
            regionValue2925 = regionNext3446;
            regionValue2926 = regionNext3447;
            regionValue2927 = regionNext3448;
            regionValue2928 = regionNext3449;
            regionValue2929 = regionNext3450;
            regionValue2930 = regionNext3451;
            break region330;
        } else {
            java.lang.Object regionNext3461 = regionValue3420;
            int regionNext3462 = regionValue3421;
            int regionNext3463 = regionValue3422;
            long regionNext3464 = regionValue3423;
            long regionNext3465 = regionValue3424;
            long regionNext3466 = regionValue3425;
            long regionNext3467 = regionValue3426;
            long regionNext3468 = regionValue3427;
            int regionNext3469 = regionValue3428;
            regionValue3452 = regionNext3461;
            regionValue3453 = regionNext3462;
            regionValue3454 = regionNext3463;
            regionValue3455 = regionNext3464;
            regionValue3456 = regionNext3465;
            regionValue3457 = regionNext3466;
            regionValue3458 = regionNext3467;
            regionValue3459 = regionNext3468;
            regionValue3460 = regionNext3469;
            break region326;
        }
        }
        int initialValue3470 = 1;
        if (regionValue3460 == 0) {
            java.lang.Object regionNext3471 = regionValue3452;
            int regionNext3472 = regionValue3453;
            long regionNext3473 = regionValue3455;
            long regionNext3474 = regionValue3456;
            long regionNext3475 = regionValue3457;
            long regionNext3476 = regionValue3459;
            int regionNext3477 = regionValue3460;
            int regionNext3478 = initialValue3470;
            regionValue2818 = regionNext3471;
            regionValue2819 = regionNext3472;
            regionValue2820 = regionNext3473;
            regionValue2821 = regionNext3474;
            regionValue2822 = regionNext3475;
            regionValue2823 = regionNext3476;
            regionValue2824 = regionNext3477;
            regionValue2825 = regionNext3478;
            break region411;
        } else {
            java.lang.Object regionNext3479 = regionValue3452;
            int regionNext3480 = regionValue3453;
            int regionNext3481 = regionValue3454;
            long regionNext3482 = regionValue3455;
            long regionNext3483 = regionValue3456;
            long regionNext3484 = regionValue3457;
            long regionNext3485 = regionValue3458;
            long regionNext3486 = regionValue3459;
            int regionNext3487 = regionValue3460;
            int regionNext3488 = initialValue3470;
            regionValue2921 = regionNext3479;
            regionValue2922 = regionNext3480;
            regionValue2923 = regionNext3481;
            regionValue2924 = regionNext3482;
            regionValue2925 = regionNext3483;
            regionValue2926 = regionNext3484;
            regionValue2927 = regionNext3485;
            regionValue2928 = regionNext3486;
            regionValue2929 = regionNext3487;
            regionValue2930 = regionNext3488;
            break region330;
        }
        }
        java.lang.Object regionNext3489 = regionValue2921;
        int regionNext3490 = regionValue2922;
        int regionNext3491 = regionValue2923;
        long regionNext3492 = regionValue2924;
        long regionNext3493 = regionValue2925;
        long regionNext3494 = regionValue2926;
        long regionNext3495 = regionValue2927;
        long regionNext3496 = regionValue2928;
        int regionNext3497 = regionValue2929;
        int regionNext3498 = regionValue2930;
        int regionNext3499 = regionValue2930;
        regionValue2873 = regionNext3489;
        regionValue2874 = regionNext3490;
        regionValue2875 = regionNext3491;
        regionValue2876 = regionNext3492;
        regionValue2877 = regionNext3493;
        regionValue2878 = regionNext3494;
        regionValue2879 = regionNext3495;
        regionValue2880 = regionNext3496;
        regionValue2881 = regionNext3497;
        regionValue2882 = regionNext3498;
        regionValue2883 = regionNext3499;
        break region333;
        }
        java.lang.Object regionNext3500 = regionValue2873;
        int regionNext3501 = regionValue2874;
        int regionNext3502 = regionValue2875;
        long regionNext3503 = regionValue2876;
        long regionNext3504 = regionValue2877;
        long regionNext3505 = regionValue2878;
        long regionNext3506 = regionValue2879;
        long regionNext3507 = regionValue2880;
        int regionNext3508 = regionValue2881;
        int regionNext3509 = regionValue2882;
        int regionNext3510 = regionValue2883;
        int regionNext3511 = regionValue2881;
        regionValue3315 = regionNext3500;
        regionValue3316 = regionNext3501;
        regionValue3317 = regionNext3502;
        regionValue3318 = regionNext3503;
        regionValue3319 = regionNext3504;
        regionValue3320 = regionNext3505;
        regionValue3321 = regionNext3506;
        regionValue3322 = regionNext3507;
        regionValue3323 = regionNext3508;
        regionValue3324 = regionNext3509;
        regionValue3325 = regionNext3510;
        regionValue3326 = regionNext3511;
        break region334;
        }
        if (regionValue3326 != 0) {
            java.lang.Object regionNext3522 = regionValue3315;
            int regionNext3523 = regionValue3316;
            int regionNext3524 = regionValue3317;
            long regionNext3525 = regionValue3318;
            long regionNext3526 = regionValue3319;
            long regionNext3527 = regionValue3320;
            long regionNext3528 = regionValue3322;
            int regionNext3529 = regionValue3323;
            int regionNext3530 = regionValue3324;
            int regionNext3531 = regionValue3325;
            regionValue3512 = regionNext3522;
            regionValue3513 = regionNext3523;
            regionValue3514 = regionNext3524;
            regionValue3515 = regionNext3525;
            regionValue3516 = regionNext3526;
            regionValue3517 = regionNext3527;
            regionValue3518 = regionNext3528;
            regionValue3519 = regionNext3529;
            regionValue3520 = regionNext3530;
            regionValue3521 = regionNext3531;
            break region382;
        } else {
            java.lang.Object regionNext3543 = regionValue3315;
            int regionNext3544 = regionValue3316;
            int regionNext3545 = regionValue3317;
            long regionNext3546 = regionValue3318;
            long regionNext3547 = regionValue3319;
            long regionNext3548 = regionValue3320;
            long regionNext3549 = regionValue3321;
            long regionNext3550 = regionValue3322;
            int regionNext3551 = regionValue3323;
            int regionNext3552 = regionValue3324;
            int regionNext3553 = regionValue3325;
            regionValue3532 = regionNext3543;
            regionValue3533 = regionNext3544;
            regionValue3534 = regionNext3545;
            regionValue3535 = regionNext3546;
            regionValue3536 = regionNext3547;
            regionValue3537 = regionNext3548;
            regionValue3538 = regionNext3549;
            regionValue3539 = regionNext3550;
            regionValue3540 = regionNext3551;
            regionValue3541 = regionNext3552;
            regionValue3542 = regionNext3553;
            break region335;
        }
        }
        if (regionValue3542 != 0) {
            java.lang.Object regionNext3563 = regionValue3532;
            int regionNext3564 = regionValue3533;
            int regionNext3565 = regionValue3534;
            long regionNext3566 = regionValue3535;
            long regionNext3567 = regionValue3536;
            long regionNext3568 = regionValue3537;
            long regionNext3569 = regionValue3539;
            int regionNext3570 = regionValue3540;
            int regionNext3571 = regionValue3541;
            regionValue3554 = regionNext3563;
            regionValue3555 = regionNext3564;
            regionValue3556 = regionNext3565;
            regionValue3557 = regionNext3566;
            regionValue3558 = regionNext3567;
            regionValue3559 = regionNext3568;
            regionValue3560 = regionNext3569;
            regionValue3561 = regionNext3570;
            regionValue3562 = regionNext3571;
            break region375;
        } else {
            java.lang.Object regionNext3582 = regionValue3532;
            int regionNext3583 = regionValue3533;
            int regionNext3584 = regionValue3534;
            long regionNext3585 = regionValue3535;
            long regionNext3586 = regionValue3536;
            long regionNext3587 = regionValue3537;
            long regionNext3588 = regionValue3538;
            long regionNext3589 = regionValue3539;
            int regionNext3590 = regionValue3540;
            int regionNext3591 = regionValue3541;
            regionValue3572 = regionNext3582;
            regionValue3573 = regionNext3583;
            regionValue3574 = regionNext3584;
            regionValue3575 = regionNext3585;
            regionValue3576 = regionNext3586;
            regionValue3577 = regionNext3587;
            regionValue3578 = regionNext3588;
            regionValue3579 = regionNext3589;
            regionValue3580 = regionNext3590;
            regionValue3581 = regionNext3591;
            break region336;
        }
        }
        java.lang.Object initialValue3592 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue3572)))).settingCritFix));
        boolean initialValue3593 = recovery$indy$flow$1169(initialValue3592, 3402585320628080900L, regionValue3575);
        if (regionValue3580 != 0) {
            java.lang.Object regionNext3594 = regionValue3572;
            int regionNext3595 = regionValue3573;
            int regionNext3596 = regionValue3574;
            long regionNext3597 = regionValue3575;
            long regionNext3598 = regionValue3576;
            long regionNext3599 = regionValue3577;
            long regionNext3600 = regionValue3579;
            int regionNext3601 = regionValue3580;
            int regionNext3602 = regionValue3581;
            int regionNext3603 = (int) ((initialValue3593 ? 1 : 0));
            regionValue3512 = regionNext3594;
            regionValue3513 = regionNext3595;
            regionValue3514 = regionNext3596;
            regionValue3515 = regionNext3597;
            regionValue3516 = regionNext3598;
            regionValue3517 = regionNext3599;
            regionValue3518 = regionNext3600;
            regionValue3519 = regionNext3601;
            regionValue3520 = regionNext3602;
            regionValue3521 = regionNext3603;
            break region382;
        } else {
            java.lang.Object regionNext3615 = regionValue3572;
            int regionNext3616 = regionValue3573;
            int regionNext3617 = regionValue3574;
            long regionNext3618 = regionValue3575;
            long regionNext3619 = regionValue3576;
            long regionNext3620 = regionValue3577;
            long regionNext3621 = regionValue3578;
            long regionNext3622 = regionValue3579;
            int regionNext3623 = regionValue3580;
            int regionNext3624 = regionValue3581;
            int regionNext3625 = (int) ((initialValue3593 ? 1 : 0));
            regionValue3604 = regionNext3615;
            regionValue3605 = regionNext3616;
            regionValue3606 = regionNext3617;
            regionValue3607 = regionNext3618;
            regionValue3608 = regionNext3619;
            regionValue3609 = regionNext3620;
            regionValue3610 = regionNext3621;
            regionValue3611 = regionNext3622;
            regionValue3612 = regionNext3623;
            regionValue3613 = regionNext3624;
            regionValue3614 = regionNext3625;
            break region343;
        }
        }
        java.lang.Object regionNext3637 = regionValue3604;
        int regionNext3638 = regionValue3605;
        int regionNext3639 = regionValue3606;
        long regionNext3640 = regionValue3607;
        long regionNext3641 = regionValue3608;
        long regionNext3642 = regionValue3609;
        long regionNext3643 = regionValue3610;
        long regionNext3644 = regionValue3611;
        int regionNext3645 = regionValue3612;
        int regionNext3646 = regionValue3613;
        int regionNext3647 = regionValue3614;
        regionValue3626 = regionNext3637;
        regionValue3627 = regionNext3638;
        regionValue3628 = regionNext3639;
        regionValue3629 = regionNext3640;
        regionValue3630 = regionNext3641;
        regionValue3631 = regionNext3642;
        regionValue3632 = regionNext3643;
        regionValue3633 = regionNext3644;
        regionValue3634 = regionNext3645;
        regionValue3635 = regionNext3646;
        regionValue3636 = regionNext3647;
        break region345;
        }
        if (regionValue3636 == 0) {
            java.lang.Object regionNext3648 = regionValue3626;
            int regionNext3649 = regionValue3627;
            int regionNext3650 = regionValue3628;
            long regionNext3651 = regionValue3629;
            long regionNext3652 = regionValue3630;
            long regionNext3653 = regionValue3631;
            long regionNext3654 = regionValue3633;
            int regionNext3655 = regionValue3634;
            int regionNext3656 = regionValue3635;
            regionValue3554 = regionNext3648;
            regionValue3555 = regionNext3649;
            regionValue3556 = regionNext3650;
            regionValue3557 = regionNext3651;
            regionValue3558 = regionNext3652;
            regionValue3559 = regionNext3653;
            regionValue3560 = regionNext3654;
            regionValue3561 = regionNext3655;
            regionValue3562 = regionNext3656;
            break region375;
        } else {
            java.lang.Object regionNext3667 = regionValue3626;
            int regionNext3668 = regionValue3627;
            int regionNext3669 = regionValue3628;
            long regionNext3670 = regionValue3629;
            long regionNext3671 = regionValue3630;
            long regionNext3672 = regionValue3631;
            long regionNext3673 = regionValue3632;
            long regionNext3674 = regionValue3633;
            int regionNext3675 = regionValue3634;
            int regionNext3676 = regionValue3635;
            regionValue3657 = regionNext3667;
            regionValue3658 = regionNext3668;
            regionValue3659 = regionNext3669;
            regionValue3660 = regionNext3670;
            regionValue3661 = regionNext3671;
            regionValue3662 = regionNext3672;
            regionValue3663 = regionNext3673;
            regionValue3664 = regionNext3674;
            regionValue3665 = regionNext3675;
            regionValue3666 = regionNext3676;
            break region346;
        }
        }
        java.lang.Object regionNext3687 = regionValue3657;
        int regionNext3688 = regionValue3658;
        int regionNext3689 = regionValue3659;
        long regionNext3690 = regionValue3660;
        long regionNext3691 = regionValue3661;
        long regionNext3692 = regionValue3662;
        long regionNext3693 = regionValue3663;
        long regionNext3694 = regionValue3664;
        int regionNext3695 = regionValue3665;
        int regionNext3696 = regionValue3666;
        regionValue3677 = regionNext3687;
        regionValue3678 = regionNext3688;
        regionValue3679 = regionNext3689;
        regionValue3680 = regionNext3690;
        regionValue3681 = regionNext3691;
        regionValue3682 = regionNext3692;
        regionValue3683 = regionNext3693;
        regionValue3684 = regionNext3694;
        regionValue3685 = regionNext3695;
        regionValue3686 = regionNext3696;
        break region348;
        }
        boolean initialValue3697 = recovery$indy$flow$1170(regionValue3677);
        if (regionValue3685 != 0) {
            java.lang.Object regionNext3698 = regionValue3677;
            int regionNext3699 = regionValue3678;
            int regionNext3700 = regionValue3679;
            long regionNext3701 = regionValue3680;
            long regionNext3702 = regionValue3681;
            long regionNext3703 = regionValue3682;
            long regionNext3704 = regionValue3684;
            int regionNext3705 = regionValue3685;
            int regionNext3706 = regionValue3686;
            int regionNext3707 = (int) ((initialValue3697 ? 1 : 0));
            regionValue3512 = regionNext3698;
            regionValue3513 = regionNext3699;
            regionValue3514 = regionNext3700;
            regionValue3515 = regionNext3701;
            regionValue3516 = regionNext3702;
            regionValue3517 = regionNext3703;
            regionValue3518 = regionNext3704;
            regionValue3519 = regionNext3705;
            regionValue3520 = regionNext3706;
            regionValue3521 = regionNext3707;
            break region382;
        } else {
            java.lang.Object regionNext3719 = regionValue3677;
            int regionNext3720 = regionValue3678;
            int regionNext3721 = regionValue3679;
            long regionNext3722 = regionValue3680;
            long regionNext3723 = regionValue3681;
            long regionNext3724 = regionValue3682;
            long regionNext3725 = regionValue3683;
            long regionNext3726 = regionValue3684;
            int regionNext3727 = regionValue3685;
            int regionNext3728 = regionValue3686;
            int regionNext3729 = (int) ((initialValue3697 ? 1 : 0));
            regionValue3708 = regionNext3719;
            regionValue3709 = regionNext3720;
            regionValue3710 = regionNext3721;
            regionValue3711 = regionNext3722;
            regionValue3712 = regionNext3723;
            regionValue3713 = regionNext3724;
            regionValue3714 = regionNext3725;
            regionValue3715 = regionNext3726;
            regionValue3716 = regionNext3727;
            regionValue3717 = regionNext3728;
            regionValue3718 = regionNext3729;
            break region352;
        }
        }
        java.lang.Object regionNext3741 = regionValue3708;
        int regionNext3742 = regionValue3709;
        int regionNext3743 = regionValue3710;
        long regionNext3744 = regionValue3711;
        long regionNext3745 = regionValue3712;
        long regionNext3746 = regionValue3713;
        long regionNext3747 = regionValue3714;
        long regionNext3748 = regionValue3715;
        int regionNext3749 = regionValue3716;
        int regionNext3750 = regionValue3717;
        int regionNext3751 = regionValue3718;
        regionValue3730 = regionNext3741;
        regionValue3731 = regionNext3742;
        regionValue3732 = regionNext3743;
        regionValue3733 = regionNext3744;
        regionValue3734 = regionNext3745;
        regionValue3735 = regionNext3746;
        regionValue3736 = regionNext3747;
        regionValue3737 = regionNext3748;
        regionValue3738 = regionNext3749;
        regionValue3739 = regionNext3750;
        regionValue3740 = regionNext3751;
        break region354;
        }
        if (regionValue3740 != 0) {
            java.lang.Object regionNext3752 = regionValue3730;
            int regionNext3753 = regionValue3731;
            int regionNext3754 = regionValue3732;
            long regionNext3755 = regionValue3733;
            long regionNext3756 = regionValue3734;
            long regionNext3757 = regionValue3735;
            long regionNext3758 = regionValue3737;
            int regionNext3759 = regionValue3738;
            int regionNext3760 = regionValue3739;
            regionValue3554 = regionNext3752;
            regionValue3555 = regionNext3753;
            regionValue3556 = regionNext3754;
            regionValue3557 = regionNext3755;
            regionValue3558 = regionNext3756;
            regionValue3559 = regionNext3757;
            regionValue3560 = regionNext3758;
            regionValue3561 = regionNext3759;
            regionValue3562 = regionNext3760;
            break region375;
        } else {
            java.lang.Object regionNext3771 = regionValue3730;
            int regionNext3772 = regionValue3731;
            int regionNext3773 = regionValue3732;
            long regionNext3774 = regionValue3733;
            long regionNext3775 = regionValue3734;
            long regionNext3776 = regionValue3735;
            long regionNext3777 = regionValue3736;
            long regionNext3778 = regionValue3737;
            int regionNext3779 = regionValue3738;
            int regionNext3780 = regionValue3739;
            regionValue3761 = regionNext3771;
            regionValue3762 = regionNext3772;
            regionValue3763 = regionNext3773;
            regionValue3764 = regionNext3774;
            regionValue3765 = regionNext3775;
            regionValue3766 = regionNext3776;
            regionValue3767 = regionNext3777;
            regionValue3768 = regionNext3778;
            regionValue3769 = regionNext3779;
            regionValue3770 = regionNext3780;
            break region355;
        }
        }
        java.lang.Object regionNext3791 = regionValue3761;
        int regionNext3792 = regionValue3762;
        int regionNext3793 = regionValue3763;
        long regionNext3794 = regionValue3764;
        long regionNext3795 = regionValue3765;
        long regionNext3796 = regionValue3766;
        long regionNext3797 = regionValue3767;
        long regionNext3798 = regionValue3768;
        int regionNext3799 = regionValue3769;
        int regionNext3800 = regionValue3770;
        regionValue3781 = regionNext3791;
        regionValue3782 = regionNext3792;
        regionValue3783 = regionNext3793;
        regionValue3784 = regionNext3794;
        regionValue3785 = regionNext3795;
        regionValue3786 = regionNext3796;
        regionValue3787 = regionNext3797;
        regionValue3788 = regionNext3798;
        regionValue3789 = regionNext3799;
        regionValue3790 = regionNext3800;
        break region357;
        }
        boolean initialValue3801 = recovery$indy$flow$1171(regionValue3781, regionValue3787, 3390959830144317033L, regionValue3784);
        if (regionValue3782 <= 0) {
            java.lang.Object regionNext3813 = regionValue3781;
            int regionNext3814 = regionValue3782;
            int regionNext3815 = regionValue3783;
            long regionNext3816 = regionValue3784;
            long regionNext3817 = regionValue3785;
            long regionNext3818 = regionValue3786;
            long regionNext3819 = regionValue3788;
            int regionNext3820 = regionValue3789;
            int regionNext3821 = regionValue3790;
            int regionNext3822 = (int) ((initialValue3801 ? 1 : 0));
            int regionNext3823 = regionValue3789;
            regionValue3802 = regionNext3813;
            regionValue3803 = regionNext3814;
            regionValue3804 = regionNext3815;
            regionValue3805 = regionNext3816;
            regionValue3806 = regionNext3817;
            regionValue3807 = regionNext3818;
            regionValue3808 = regionNext3819;
            regionValue3809 = regionNext3820;
            regionValue3810 = regionNext3821;
            regionValue3811 = regionNext3822;
            regionValue3812 = regionNext3823;
            break region383;
        } else {
            java.lang.Object regionNext3835 = regionValue3781;
            int regionNext3836 = regionValue3782;
            int regionNext3837 = regionValue3783;
            long regionNext3838 = regionValue3784;
            long regionNext3839 = regionValue3785;
            long regionNext3840 = regionValue3786;
            long regionNext3841 = regionValue3788;
            int regionNext3842 = regionValue3789;
            int regionNext3843 = regionValue3790;
            int regionNext3844 = (int) ((initialValue3801 ? 1 : 0));
            int regionNext3845 = regionValue3789;
            regionValue3824 = regionNext3835;
            regionValue3825 = regionNext3836;
            regionValue3826 = regionNext3837;
            regionValue3827 = regionNext3838;
            regionValue3828 = regionNext3839;
            regionValue3829 = regionNext3840;
            regionValue3830 = regionNext3841;
            regionValue3831 = regionNext3842;
            regionValue3832 = regionNext3843;
            regionValue3833 = regionNext3844;
            regionValue3834 = regionNext3845;
            break region365;
        }
        }
        java.lang.Object regionNext3857 = regionValue3824;
        int regionNext3858 = regionValue3825;
        int regionNext3859 = regionValue3826;
        long regionNext3860 = regionValue3827;
        long regionNext3861 = regionValue3828;
        long regionNext3862 = regionValue3829;
        long regionNext3863 = regionValue3830;
        int regionNext3864 = regionValue3831;
        int regionNext3865 = regionValue3832;
        int regionNext3866 = regionValue3833;
        int regionNext3867 = regionValue3834;
        regionValue3846 = regionNext3857;
        regionValue3847 = regionNext3858;
        regionValue3848 = regionNext3859;
        regionValue3849 = regionNext3860;
        regionValue3850 = regionNext3861;
        regionValue3851 = regionNext3862;
        regionValue3852 = regionNext3863;
        regionValue3853 = regionNext3864;
        regionValue3854 = regionNext3865;
        regionValue3855 = regionNext3866;
        regionValue3856 = regionNext3867;
        break region367;
        }
        if (regionValue3856 != 0) {
            java.lang.Object regionNext3868 = regionValue3846;
            int regionNext3869 = regionValue3847;
            int regionNext3870 = regionValue3848;
            long regionNext3871 = regionValue3849;
            long regionNext3872 = regionValue3850;
            long regionNext3873 = regionValue3851;
            long regionNext3874 = regionValue3852;
            int regionNext3875 = regionValue3853;
            int regionNext3876 = regionValue3854;
            int regionNext3877 = regionValue3855;
            regionValue3512 = regionNext3868;
            regionValue3513 = regionNext3869;
            regionValue3514 = regionNext3870;
            regionValue3515 = regionNext3871;
            regionValue3516 = regionNext3872;
            regionValue3517 = regionNext3873;
            regionValue3518 = regionNext3874;
            regionValue3519 = regionNext3875;
            regionValue3520 = regionNext3876;
            regionValue3521 = regionNext3877;
            break region382;
        } else {
            java.lang.Object regionNext3888 = regionValue3846;
            int regionNext3889 = regionValue3847;
            int regionNext3890 = regionValue3848;
            long regionNext3891 = regionValue3849;
            long regionNext3892 = regionValue3850;
            long regionNext3893 = regionValue3851;
            long regionNext3894 = regionValue3852;
            int regionNext3895 = regionValue3853;
            int regionNext3896 = regionValue3854;
            int regionNext3897 = regionValue3855;
            regionValue3878 = regionNext3888;
            regionValue3879 = regionNext3889;
            regionValue3880 = regionNext3890;
            regionValue3881 = regionNext3891;
            regionValue3882 = regionNext3892;
            regionValue3883 = regionNext3893;
            regionValue3884 = regionNext3894;
            regionValue3885 = regionNext3895;
            regionValue3886 = regionNext3896;
            regionValue3887 = regionNext3897;
            break region368;
        }
        }
        java.lang.Object regionNext3908 = regionValue3878;
        int regionNext3909 = regionValue3879;
        int regionNext3910 = regionValue3880;
        long regionNext3911 = regionValue3881;
        long regionNext3912 = regionValue3882;
        long regionNext3913 = regionValue3883;
        long regionNext3914 = regionValue3884;
        int regionNext3915 = regionValue3885;
        int regionNext3916 = regionValue3886;
        int regionNext3917 = regionValue3887;
        regionValue3898 = regionNext3908;
        regionValue3899 = regionNext3909;
        regionValue3900 = regionNext3910;
        regionValue3901 = regionNext3911;
        regionValue3902 = regionNext3912;
        regionValue3903 = regionNext3913;
        regionValue3904 = regionNext3914;
        regionValue3905 = regionNext3915;
        regionValue3906 = regionNext3916;
        regionValue3907 = regionNext3917;
        break region370;
        }
        if (regionValue3907 == 0) {
            java.lang.Object regionNext3918 = regionValue3898;
            int regionNext3919 = regionValue3899;
            int regionNext3920 = regionValue3900;
            long regionNext3921 = regionValue3901;
            long regionNext3922 = regionValue3902;
            long regionNext3923 = regionValue3903;
            long regionNext3924 = regionValue3904;
            int regionNext3925 = regionValue3905;
            int regionNext3926 = regionValue3906;
            regionValue3554 = regionNext3918;
            regionValue3555 = regionNext3919;
            regionValue3556 = regionNext3920;
            regionValue3557 = regionNext3921;
            regionValue3558 = regionNext3922;
            regionValue3559 = regionNext3923;
            regionValue3560 = regionNext3924;
            regionValue3561 = regionNext3925;
            regionValue3562 = regionNext3926;
            break region375;
        } else {
            java.lang.Object regionNext3935 = regionValue3898;
            int regionNext3936 = regionValue3899;
            int regionNext3937 = regionValue3900;
            long regionNext3938 = regionValue3901;
            long regionNext3939 = regionValue3902;
            long regionNext3940 = regionValue3903;
            long regionNext3941 = regionValue3904;
            int regionNext3942 = regionValue3905;
            regionValue3927 = regionNext3935;
            regionValue3928 = regionNext3936;
            regionValue3929 = regionNext3937;
            regionValue3930 = regionNext3938;
            regionValue3931 = regionNext3939;
            regionValue3932 = regionNext3940;
            regionValue3933 = regionNext3941;
            regionValue3934 = regionNext3942;
            break region371;
        }
        }
        int initialValue3943 = 1;
        if (regionValue3934 == 0) {
            java.lang.Object regionNext3944 = regionValue3927;
            int regionNext3945 = regionValue3928;
            long regionNext3946 = regionValue3930;
            long regionNext3947 = regionValue3931;
            long regionNext3948 = regionValue3932;
            long regionNext3949 = regionValue3933;
            int regionNext3950 = regionValue3934;
            int regionNext3951 = initialValue3943;
            regionValue2818 = regionNext3944;
            regionValue2819 = regionNext3945;
            regionValue2820 = regionNext3946;
            regionValue2821 = regionNext3947;
            regionValue2822 = regionNext3948;
            regionValue2823 = regionNext3949;
            regionValue2824 = regionNext3950;
            regionValue2825 = regionNext3951;
            break region411;
        } else {
            java.lang.Object regionNext3952 = regionValue3927;
            int regionNext3953 = regionValue3928;
            int regionNext3954 = regionValue3929;
            long regionNext3955 = regionValue3930;
            long regionNext3956 = regionValue3931;
            long regionNext3957 = regionValue3932;
            long regionNext3958 = regionValue3933;
            int regionNext3959 = regionValue3934;
            int regionNext3960 = initialValue3943;
            regionValue3554 = regionNext3952;
            regionValue3555 = regionNext3953;
            regionValue3556 = regionNext3954;
            regionValue3557 = regionNext3955;
            regionValue3558 = regionNext3956;
            regionValue3559 = regionNext3957;
            regionValue3560 = regionNext3958;
            regionValue3561 = regionNext3959;
            regionValue3562 = regionNext3960;
            break region375;
        }
        }
        java.lang.Object initialValue3961 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue3554)))).settingOnlyOnTarget));
        boolean initialValue3962 = recovery$indy$flow$1173(initialValue3961, 3402585320628080900L, regionValue3557);
        java.lang.Object regionNext3963 = regionValue3554;
        int regionNext3964 = regionValue3555;
        int regionNext3965 = regionValue3556;
        long regionNext3966 = regionValue3557;
        long regionNext3967 = regionValue3558;
        long regionNext3968 = regionValue3559;
        long regionNext3969 = regionValue3560;
        int regionNext3970 = regionValue3561;
        int regionNext3971 = regionValue3562;
        int regionNext3972 = (int) ((initialValue3962 ? 1 : 0));
        regionValue3512 = regionNext3963;
        regionValue3513 = regionNext3964;
        regionValue3514 = regionNext3965;
        regionValue3515 = regionNext3966;
        regionValue3516 = regionNext3967;
        regionValue3517 = regionNext3968;
        regionValue3518 = regionNext3969;
        regionValue3519 = regionNext3970;
        regionValue3520 = regionNext3971;
        regionValue3521 = regionNext3972;
        break region382;
        }
        java.lang.Object regionNext3973 = regionValue3512;
        int regionNext3974 = regionValue3513;
        int regionNext3975 = regionValue3514;
        long regionNext3976 = regionValue3515;
        long regionNext3977 = regionValue3516;
        long regionNext3978 = regionValue3517;
        long regionNext3979 = regionValue3518;
        int regionNext3980 = regionValue3519;
        int regionNext3981 = regionValue3520;
        int regionNext3982 = regionValue3521;
        int regionNext3983 = regionValue3519;
        regionValue3802 = regionNext3973;
        regionValue3803 = regionNext3974;
        regionValue3804 = regionNext3975;
        regionValue3805 = regionNext3976;
        regionValue3806 = regionNext3977;
        regionValue3807 = regionNext3978;
        regionValue3808 = regionNext3979;
        regionValue3809 = regionNext3980;
        regionValue3810 = regionNext3981;
        regionValue3811 = regionNext3982;
        regionValue3812 = regionNext3983;
        break region383;
        }
        if (regionValue3804 < 0) {
            java.lang.Object regionNext3993 = regionValue3802;
            int regionNext3994 = regionValue3803;
            long regionNext3995 = regionValue3805;
            long regionNext3996 = regionValue3806;
            long regionNext3997 = regionValue3808;
            int regionNext3998 = regionValue3809;
            int regionNext3999 = regionValue3810;
            int regionNext4000 = regionValue3811;
            int regionNext4001 = regionValue3812;
            regionValue3984 = regionNext3993;
            regionValue3985 = regionNext3994;
            regionValue3986 = regionNext3995;
            regionValue3987 = regionNext3996;
            regionValue3988 = regionNext3997;
            regionValue3989 = regionNext3998;
            regionValue3990 = regionNext3999;
            regionValue3991 = regionNext4000;
            regionValue3992 = regionNext4001;
            break region417;
        } else {
            java.lang.Object regionNext4012 = regionValue3802;
            int regionNext4013 = regionValue3803;
            long regionNext4014 = regionValue3805;
            long regionNext4015 = regionValue3806;
            long regionNext4016 = regionValue3807;
            long regionNext4017 = regionValue3808;
            int regionNext4018 = regionValue3809;
            int regionNext4019 = regionValue3810;
            int regionNext4020 = regionValue3811;
            int regionNext4021 = regionValue3812;
            regionValue4002 = regionNext4012;
            regionValue4003 = regionNext4013;
            regionValue4004 = regionNext4014;
            regionValue4005 = regionNext4015;
            regionValue4006 = regionNext4016;
            regionValue4007 = regionNext4017;
            regionValue4008 = regionNext4018;
            regionValue4009 = regionNext4019;
            regionValue4010 = regionNext4020;
            regionValue4011 = regionNext4021;
            break region385;
        }
        }
        if (regionValue4011 != 0) {
            java.lang.Object regionNext4030 = regionValue4002;
            int regionNext4031 = regionValue4003;
            long regionNext4032 = regionValue4004;
            long regionNext4033 = regionValue4005;
            long regionNext4034 = regionValue4007;
            int regionNext4035 = regionValue4008;
            int regionNext4036 = regionValue4009;
            int regionNext4037 = regionValue4010;
            regionValue4022 = regionNext4030;
            regionValue4023 = regionNext4031;
            regionValue4024 = regionNext4032;
            regionValue4025 = regionNext4033;
            regionValue4026 = regionNext4034;
            regionValue4027 = regionNext4035;
            regionValue4028 = regionNext4036;
            regionValue4029 = regionNext4037;
            break region416;
        } else {
            java.lang.Object regionNext4047 = regionValue4002;
            int regionNext4048 = regionValue4003;
            long regionNext4049 = regionValue4004;
            long regionNext4050 = regionValue4005;
            long regionNext4051 = regionValue4006;
            long regionNext4052 = regionValue4007;
            int regionNext4053 = regionValue4008;
            int regionNext4054 = regionValue4009;
            int regionNext4055 = regionValue4010;
            regionValue4038 = regionNext4047;
            regionValue4039 = regionNext4048;
            regionValue4040 = regionNext4049;
            regionValue4041 = regionNext4050;
            regionValue4042 = regionNext4051;
            regionValue4043 = regionNext4052;
            regionValue4044 = regionNext4053;
            regionValue4045 = regionNext4054;
            regionValue4046 = regionNext4055;
            break region386;
        }
        }
        java.lang.Object regionNext4065 = regionValue4038;
        int regionNext4066 = regionValue4039;
        long regionNext4067 = regionValue4040;
        long regionNext4068 = regionValue4041;
        long regionNext4069 = regionValue4042;
        long regionNext4070 = regionValue4043;
        int regionNext4071 = regionValue4044;
        int regionNext4072 = regionValue4045;
        int regionNext4073 = regionValue4046;
        regionValue4056 = regionNext4065;
        regionValue4057 = regionNext4066;
        regionValue4058 = regionNext4067;
        regionValue4059 = regionNext4068;
        regionValue4060 = regionNext4069;
        regionValue4061 = regionNext4070;
        regionValue4062 = regionNext4071;
        regionValue4063 = regionNext4072;
        regionValue4064 = regionNext4073;
        break region388;
        }
        if (regionValue4064 == 0) {
            java.lang.Object regionNext4074 = regionValue4056;
            int regionNext4075 = regionValue4057;
            long regionNext4076 = regionValue4058;
            long regionNext4077 = regionValue4059;
            long regionNext4078 = regionValue4060;
            long regionNext4079 = regionValue4061;
            int regionNext4080 = regionValue4062;
            int regionNext4081 = regionValue4063;
            regionValue2818 = regionNext4074;
            regionValue2819 = regionNext4075;
            regionValue2820 = regionNext4076;
            regionValue2821 = regionNext4077;
            regionValue2822 = regionNext4078;
            regionValue2823 = regionNext4079;
            regionValue2824 = regionNext4080;
            regionValue2825 = regionNext4081;
            break region411;
        } else {
            java.lang.Object regionNext4090 = regionValue4056;
            int regionNext4091 = regionValue4057;
            long regionNext4092 = regionValue4058;
            long regionNext4093 = regionValue4059;
            long regionNext4094 = regionValue4060;
            long regionNext4095 = regionValue4061;
            int regionNext4096 = regionValue4062;
            int regionNext4097 = regionValue4063;
            regionValue4082 = regionNext4090;
            regionValue4083 = regionNext4091;
            regionValue4084 = regionNext4092;
            regionValue4085 = regionNext4093;
            regionValue4086 = regionNext4094;
            regionValue4087 = regionNext4095;
            regionValue4088 = regionNext4096;
            regionValue4089 = regionNext4097;
            break region389;
        }
        }
        java.lang.Object initialValue4098 = recovery$indy$flow$1174();
        java.lang.Object initialValue4099 = recovery$indy$flow$1175(initialValue4098, 3403966518427291986L, regionValue4084);
        if (regionValue4088 != 0) {
            java.lang.Object regionNext4109 = regionValue4082;
            int regionNext4110 = regionValue4083;
            long regionNext4111 = regionValue4084;
            long regionNext4112 = regionValue4085;
            long regionNext4113 = regionValue4086;
            long regionNext4114 = regionValue4087;
            int regionNext4115 = regionValue4088;
            int regionNext4116 = regionValue4089;
            java.lang.Object regionNext4117 = initialValue4099;
            regionValue4100 = regionNext4109;
            regionValue4101 = regionNext4110;
            regionValue4102 = regionNext4111;
            regionValue4103 = regionNext4112;
            regionValue4104 = regionNext4113;
            regionValue4105 = regionNext4114;
            regionValue4106 = regionNext4115;
            regionValue4107 = regionNext4116;
            regionValue4108 = regionNext4117;
            break region406;
        } else {
            java.lang.Object regionNext4127 = regionValue4082;
            int regionNext4128 = regionValue4083;
            long regionNext4129 = regionValue4084;
            long regionNext4130 = regionValue4085;
            long regionNext4131 = regionValue4086;
            long regionNext4132 = regionValue4087;
            int regionNext4133 = regionValue4088;
            int regionNext4134 = regionValue4089;
            java.lang.Object regionNext4135 = initialValue4099;
            regionValue4118 = regionNext4127;
            regionValue4119 = regionNext4128;
            regionValue4120 = regionNext4129;
            regionValue4121 = regionNext4130;
            regionValue4122 = regionNext4131;
            regionValue4123 = regionNext4132;
            regionValue4124 = regionNext4133;
            regionValue4125 = regionNext4134;
            regionValue4126 = regionNext4135;
            break region395;
        }
        }
        java.lang.Object regionNext4145 = regionValue4118;
        int regionNext4146 = regionValue4119;
        long regionNext4147 = regionValue4120;
        long regionNext4148 = regionValue4121;
        long regionNext4149 = regionValue4122;
        long regionNext4150 = regionValue4123;
        int regionNext4151 = regionValue4124;
        int regionNext4152 = regionValue4125;
        java.lang.Object regionNext4153 = regionValue4126;
        regionValue4136 = regionNext4145;
        regionValue4137 = regionNext4146;
        regionValue4138 = regionNext4147;
        regionValue4139 = regionNext4148;
        regionValue4140 = regionNext4149;
        regionValue4141 = regionNext4150;
        regionValue4142 = regionNext4151;
        regionValue4143 = regionNext4152;
        regionValue4144 = regionNext4153;
        break region397;
        }
        if (regionValue4144 == null) {
            java.lang.Object regionNext4161 = regionValue4136;
            int regionNext4162 = regionValue4137;
            long regionNext4163 = regionValue4138;
            long regionNext4164 = regionValue4139;
            long regionNext4165 = regionValue4140;
            long regionNext4166 = regionValue4141;
            int regionNext4167 = regionValue4142;
            regionValue4154 = regionNext4161;
            regionValue4155 = regionNext4162;
            regionValue4156 = regionNext4163;
            regionValue4157 = regionNext4164;
            regionValue4158 = regionNext4165;
            regionValue4159 = regionNext4166;
            regionValue4160 = regionNext4167;
            break region409;
        } else {
            java.lang.Object regionNext4176 = regionValue4136;
            int regionNext4177 = regionValue4137;
            long regionNext4178 = regionValue4138;
            long regionNext4179 = regionValue4139;
            long regionNext4180 = regionValue4140;
            long regionNext4181 = regionValue4141;
            int regionNext4182 = regionValue4142;
            int regionNext4183 = regionValue4143;
            regionValue4168 = regionNext4176;
            regionValue4169 = regionNext4177;
            regionValue4170 = regionNext4178;
            regionValue4171 = regionNext4179;
            regionValue4172 = regionNext4180;
            regionValue4173 = regionNext4181;
            regionValue4174 = regionNext4182;
            regionValue4175 = regionNext4183;
            break region398;
        }
        }
        java.lang.Object regionNext4192 = regionValue4168;
        int regionNext4193 = regionValue4169;
        long regionNext4194 = regionValue4170;
        long regionNext4195 = regionValue4171;
        long regionNext4196 = regionValue4172;
        long regionNext4197 = regionValue4173;
        int regionNext4198 = regionValue4174;
        int regionNext4199 = regionValue4175;
        regionValue4184 = regionNext4192;
        regionValue4185 = regionNext4193;
        regionValue4186 = regionNext4194;
        regionValue4187 = regionNext4195;
        regionValue4188 = regionNext4196;
        regionValue4189 = regionNext4197;
        regionValue4190 = regionNext4198;
        regionValue4191 = regionNext4199;
        break region400;
        }
        java.lang.Object initialValue4200 = recovery$indy$flow$1176();
        java.lang.Object initialValue4201 = recovery$indy$flow$1177(initialValue4200, 3403966518427291986L, regionValue4186);
        java.lang.Object regionNext4202 = regionValue4184;
        int regionNext4203 = regionValue4185;
        long regionNext4204 = regionValue4186;
        long regionNext4205 = regionValue4187;
        long regionNext4206 = regionValue4188;
        long regionNext4207 = regionValue4189;
        int regionNext4208 = regionValue4190;
        int regionNext4209 = regionValue4191;
        java.lang.Object regionNext4210 = initialValue4201;
        regionValue4100 = regionNext4202;
        regionValue4101 = regionNext4203;
        regionValue4102 = regionNext4204;
        regionValue4103 = regionNext4205;
        regionValue4104 = regionNext4206;
        regionValue4105 = regionNext4207;
        regionValue4106 = regionNext4208;
        regionValue4107 = regionNext4209;
        regionValue4108 = regionNext4210;
        break region406;
        }
        java.lang.Object initialValue4211 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue4108)))).field_49));
        java.lang.Object initialValue4212 = recovery$indy$flow$1179();
        if (((java.lang.Object) initialValue4211) == ((java.lang.Object) initialValue4212)) {
            java.lang.Object regionNext4213 = regionValue4100;
            int regionNext4214 = regionValue4101;
            long regionNext4215 = regionValue4102;
            long regionNext4216 = regionValue4103;
            long regionNext4217 = regionValue4104;
            long regionNext4218 = regionValue4105;
            int regionNext4219 = regionValue4106;
            int regionNext4220 = regionValue4107;
            regionValue2818 = regionNext4213;
            regionValue2819 = regionNext4214;
            regionValue2820 = regionNext4215;
            regionValue2821 = regionNext4216;
            regionValue2822 = regionNext4217;
            regionValue2823 = regionNext4218;
            regionValue2824 = regionNext4219;
            regionValue2825 = regionNext4220;
            break region411;
        } else {
            java.lang.Object regionNext4221 = regionValue4100;
            int regionNext4222 = regionValue4101;
            long regionNext4223 = regionValue4102;
            long regionNext4224 = regionValue4103;
            long regionNext4225 = regionValue4104;
            long regionNext4226 = regionValue4105;
            int regionNext4227 = regionValue4106;
            regionValue4154 = regionNext4221;
            regionValue4155 = regionNext4222;
            regionValue4156 = regionNext4223;
            regionValue4157 = regionNext4224;
            regionValue4158 = regionNext4225;
            regionValue4159 = regionNext4226;
            regionValue4160 = regionNext4227;
            break region409;
        }
        }
        int initialValue4228 = 0;
        java.lang.Object regionNext4229 = regionValue4154;
        int regionNext4230 = regionValue4155;
        long regionNext4231 = regionValue4156;
        long regionNext4232 = regionValue4157;
        long regionNext4233 = regionValue4158;
        long regionNext4234 = regionValue4159;
        int regionNext4235 = regionValue4160;
        int regionNext4236 = initialValue4228;
        regionValue2818 = regionNext4229;
        regionValue2819 = regionNext4230;
        regionValue2820 = regionNext4231;
        regionValue2821 = regionNext4232;
        regionValue2822 = regionNext4233;
        regionValue2823 = regionNext4234;
        regionValue2824 = regionNext4235;
        regionValue2825 = regionNext4236;
        break region411;
        }
        boolean initialValue4237 = recovery$indy$flow$1180(regionValue2818, regionValue2822, 3404240859209694442L, regionValue2820);
        java.lang.Object regionNext4238 = regionValue2818;
        int regionNext4239 = regionValue2819;
        long regionNext4240 = regionValue2820;
        long regionNext4241 = regionValue2821;
        long regionNext4242 = regionValue2823;
        int regionNext4243 = regionValue2824;
        int regionNext4244 = regionValue2825;
        int regionNext4245 = (int) ((initialValue4237 ? 1 : 0));
        regionValue4022 = regionNext4238;
        regionValue4023 = regionNext4239;
        regionValue4024 = regionNext4240;
        regionValue4025 = regionNext4241;
        regionValue4026 = regionNext4242;
        regionValue4027 = regionNext4243;
        regionValue4028 = regionNext4244;
        regionValue4029 = regionNext4245;
        break region416;
        }
        java.lang.Object regionNext4246 = regionValue4022;
        int regionNext4247 = regionValue4023;
        long regionNext4248 = regionValue4024;
        long regionNext4249 = regionValue4025;
        long regionNext4250 = regionValue4026;
        int regionNext4251 = regionValue4027;
        int regionNext4252 = regionValue4028;
        int regionNext4253 = regionValue4029;
        int regionNext4254 = regionValue4027;
        regionValue3984 = regionNext4246;
        regionValue3985 = regionNext4247;
        regionValue3986 = regionNext4248;
        regionValue3987 = regionNext4249;
        regionValue3988 = regionNext4250;
        regionValue3989 = regionNext4251;
        regionValue3990 = regionNext4252;
        regionValue3991 = regionNext4253;
        regionValue3992 = regionNext4254;
        break region417;
        }
        if (regionValue3992 != 0) {
            java.lang.Object regionNext4262 = regionValue3984;
            int regionNext4263 = regionValue3985;
            long regionNext4264 = regionValue3986;
            long regionNext4265 = regionValue3987;
            int regionNext4266 = regionValue3989;
            int regionNext4267 = regionValue3990;
            int regionNext4268 = regionValue3991;
            regionValue4255 = regionNext4262;
            regionValue4256 = regionNext4263;
            regionValue4257 = regionNext4264;
            regionValue4258 = regionNext4265;
            regionValue4259 = regionNext4266;
            regionValue4260 = regionNext4267;
            regionValue4261 = regionNext4268;
            break region430;
        } else {
            java.lang.Object regionNext4277 = regionValue3984;
            int regionNext4278 = regionValue3985;
            long regionNext4279 = regionValue3986;
            long regionNext4280 = regionValue3987;
            long regionNext4281 = regionValue3988;
            int regionNext4282 = regionValue3989;
            int regionNext4283 = regionValue3990;
            int regionNext4284 = regionValue3991;
            regionValue4269 = regionNext4277;
            regionValue4270 = regionNext4278;
            regionValue4271 = regionNext4279;
            regionValue4272 = regionNext4280;
            regionValue4273 = regionNext4281;
            regionValue4274 = regionNext4282;
            regionValue4275 = regionNext4283;
            regionValue4276 = regionNext4284;
            break region418;
        }
        }
        if (regionValue4276 == 0) {
            java.lang.Object regionNext4292 = regionValue4269;
            int regionNext4293 = regionValue4270;
            long regionNext4294 = regionValue4271;
            long regionNext4295 = regionValue4272;
            long regionNext4296 = regionValue4273;
            int regionNext4297 = regionValue4274;
            int regionNext4298 = regionValue4275;
            regionValue4285 = regionNext4292;
            regionValue4286 = regionNext4293;
            regionValue4287 = regionNext4294;
            regionValue4288 = regionNext4295;
            regionValue4289 = regionNext4296;
            regionValue4290 = regionNext4297;
            regionValue4291 = regionNext4298;
            break region421;
        } else {
            java.lang.Object regionNext4305 = regionValue4269;
            int regionNext4306 = regionValue4270;
            long regionNext4307 = regionValue4271;
            long regionNext4308 = regionValue4272;
            long regionNext4309 = regionValue4273;
            int regionNext4310 = regionValue4274;
            regionValue4299 = regionNext4305;
            regionValue4300 = regionNext4306;
            regionValue4301 = regionNext4307;
            regionValue4302 = regionNext4308;
            regionValue4303 = regionNext4309;
            regionValue4304 = regionNext4310;
            break region419;
        }
        }
        int initialValue4311 = 0;
        java.lang.Object regionNext4312 = regionValue4299;
        int regionNext4313 = regionValue4300;
        long regionNext4314 = regionValue4301;
        long regionNext4315 = regionValue4302;
        long regionNext4316 = regionValue4303;
        int regionNext4317 = regionValue4304;
        int regionNext4318 = initialValue4311;
        regionValue4285 = regionNext4312;
        regionValue4286 = regionNext4313;
        regionValue4287 = regionNext4314;
        regionValue4288 = regionNext4315;
        regionValue4289 = regionNext4316;
        regionValue4290 = regionNext4317;
        regionValue4291 = regionNext4318;
        break region421;
        }
        double converted4319 = (double) (regionValue4291);
        java.lang.Object initialValue4320 = recovery$indy$flow$1181();
        double initialValue4321 = recovery$indy$flow$1182(initialValue4320, regionValue4289, 3402015321611889490L, regionValue4287);
        double computed4322 = converted4319 + initialValue4321;
        int converted4323 = (int) (computed4322);
        java.lang.Object regionNext4324 = regionValue4285;
        int regionNext4325 = regionValue4286;
        long regionNext4326 = regionValue4287;
        long regionNext4327 = regionValue4288;
        int regionNext4328 = regionValue4290;
        int regionNext4329 = regionValue4291;
        int regionNext4330 = converted4323;
        regionValue4255 = regionNext4324;
        regionValue4256 = regionNext4325;
        regionValue4257 = regionNext4326;
        regionValue4258 = regionNext4327;
        regionValue4259 = regionNext4328;
        regionValue4260 = regionNext4329;
        regionValue4261 = regionNext4330;
        break region430;
        }
        int initialValue4331 = regionValue4261;
        java.lang.Object initialValue4332 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue4255)))).settingCPSLimiterIntave));
        boolean initialValue4333 = recovery$indy$flow$1184(initialValue4332, 3402585320628080900L, regionValue4257);
        if (regionValue4256 <= 0) {
            int regionNext4337 = regionValue4260;
            int regionNext4338 = (int) ((initialValue4333 ? 1 : 0));
            int regionNext4339 = regionValue4259;
            regionValue4334 = regionNext4337;
            regionValue4335 = regionNext4338;
            regionValue4336 = regionNext4339;
            break region466;
        } else {
            java.lang.Object regionNext4348 = regionValue4255;
            long regionNext4349 = regionValue4257;
            long regionNext4350 = regionValue4258;
            int regionNext4351 = regionValue4259;
            int regionNext4352 = regionValue4260;
            int regionNext4353 = initialValue4331;
            int regionNext4354 = (int) ((initialValue4333 ? 1 : 0));
            int regionNext4355 = regionValue4259;
            regionValue4340 = regionNext4348;
            regionValue4341 = regionNext4349;
            regionValue4342 = regionNext4350;
            regionValue4343 = regionNext4351;
            regionValue4344 = regionNext4352;
            regionValue4345 = regionNext4353;
            regionValue4346 = regionNext4354;
            regionValue4347 = regionNext4355;
            break region439;
        }
        }
        if (regionValue4347 != 0) {
            int regionNext4359 = regionValue4343;
            int regionNext4360 = regionValue4344;
            int regionNext4361 = regionValue4346;
            regionValue4356 = regionNext4359;
            regionValue4357 = regionNext4360;
            regionValue4358 = regionNext4361;
            break region465;
        } else {
            java.lang.Object regionNext4369 = regionValue4340;
            long regionNext4370 = regionValue4341;
            long regionNext4371 = regionValue4342;
            int regionNext4372 = regionValue4343;
            int regionNext4373 = regionValue4344;
            int regionNext4374 = regionValue4345;
            int regionNext4375 = regionValue4346;
            regionValue4362 = regionNext4369;
            regionValue4363 = regionNext4370;
            regionValue4364 = regionNext4371;
            regionValue4365 = regionNext4372;
            regionValue4366 = regionNext4373;
            regionValue4367 = regionNext4374;
            regionValue4368 = regionNext4375;
            break region440;
        }
        }
        java.lang.Object regionNext4383 = regionValue4362;
        long regionNext4384 = regionValue4363;
        long regionNext4385 = regionValue4364;
        int regionNext4386 = regionValue4365;
        int regionNext4387 = regionValue4366;
        int regionNext4388 = regionValue4367;
        int regionNext4389 = regionValue4368;
        regionValue4376 = regionNext4383;
        regionValue4377 = regionNext4384;
        regionValue4378 = regionNext4385;
        regionValue4379 = regionNext4386;
        regionValue4380 = regionNext4387;
        regionValue4381 = regionNext4388;
        regionValue4382 = regionNext4389;
        break region442;
        }
        if (regionValue4382 == 0) {
            java.lang.Object regionNext4396 = regionValue4376;
            long regionNext4397 = regionValue4377;
            long regionNext4398 = regionValue4378;
            int regionNext4399 = regionValue4379;
            int regionNext4400 = regionValue4380;
            int regionNext4401 = regionValue4381;
            regionValue4390 = regionNext4396;
            regionValue4391 = regionNext4397;
            regionValue4392 = regionNext4398;
            regionValue4393 = regionNext4399;
            regionValue4394 = regionNext4400;
            regionValue4395 = regionNext4401;
            break region456;
        } else {
            java.lang.Object regionNext4406 = regionValue4376;
            long regionNext4407 = regionValue4377;
            int regionNext4408 = regionValue4379;
            int regionNext4409 = regionValue4380;
            regionValue4402 = regionNext4406;
            regionValue4403 = regionNext4407;
            regionValue4404 = regionNext4408;
            regionValue4405 = regionNext4409;
            break region443;
        }
        }
        java.lang.Object initialValue4410 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue4402)))).field_48z));
        boolean initialValue4411 = recovery$indy$flow$1186(initialValue4410, 3404220623615229392L, regionValue4403);
        if (regionValue4404 != 0) {
            int regionNext4413 = (int) ((initialValue4411 ? 1 : 0));
            regionValue4412 = regionNext4413;
            break region471;
        } else {
            int regionNext4416 = regionValue4405;
            int regionNext4417 = (int) ((initialValue4411 ? 1 : 0));
            regionValue4414 = regionNext4416;
            regionValue4415 = regionNext4417;
            break region450;
        }
        }
        int regionNext4420 = regionValue4414;
        int regionNext4421 = regionValue4415;
        regionValue4418 = regionNext4420;
        regionValue4419 = regionNext4421;
        break region452;
        }
        if (regionValue4419 == 0) {
            int regionNext4423 = regionValue4418;
            regionValue4422 = regionNext4423;
            break region470;
        } else {
            break region453;
        }
        }
        break region455;
        }
        break region468;
        }
        double converted4424 = (double) (regionValue4395);
        java.lang.Object initialValue4425 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(regionValue4390)))).settingCPSLimiter));
        double initialValue4426 = recovery$indy$flow$1188(initialValue4425, regionValue4392, 3388716092135847075L, regionValue4391);
        int comparison4427 = (java.lang.Double.isNaN(converted4424) || java.lang.Double.isNaN(initialValue4426) ? -1 : (converted4424 > initialValue4426 ? 1 : converted4424 == initialValue4426 ? 0 : -1));
        int regionNext4428 = regionValue4393;
        int regionNext4429 = regionValue4394;
        int regionNext4430 = comparison4427;
        regionValue4356 = regionNext4428;
        regionValue4357 = regionNext4429;
        regionValue4358 = regionNext4430;
        break region465;
        }
        int regionNext4431 = regionValue4357;
        int regionNext4432 = regionValue4358;
        int regionNext4433 = regionValue4356;
        regionValue4334 = regionNext4431;
        regionValue4335 = regionNext4432;
        regionValue4336 = regionNext4433;
        break region466;
        }
        if (regionValue4336 != 0) {
            int regionNext4434 = regionValue4335;
            regionValue4412 = regionNext4434;
            break region471;
        } else {
            int regionNext4437 = regionValue4334;
            int regionNext4438 = regionValue4335;
            regionValue4435 = regionNext4437;
            regionValue4436 = regionNext4438;
            break region467;
        }
        }
        if (regionValue4436 <= 0) {
            int regionNext4439 = regionValue4435;
            regionValue4422 = regionNext4439;
            break region470;
        } else {
            break region468;
        }
        }
        int initialValue4440 = 0;
        int regionNext4441 = initialValue4440;
        regionValue4422 = regionNext4441;
        break region470;
        }
        int regionNext4442 = regionValue4422;
        regionValue4412 = regionNext4442;
        break region471;
        }
        return regionValue4412;
    }






   private void method_47$3345a93977(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$86(1323917242149320119L, var4);
      int var7 = 0;

      while (true) {
         if (var7 < this.field_44B.length) {
            recovery$indy$87(this.field_44B[var7], 1319758695873533568L, var4);
            var7++;
            boolean var10000 = var6;
            if (var2 > 0) {
               if (!var6) {
                  return;
               }

               var10000 = var6;
            }

            if (var10000) {
               continue;
            }
         }

         boolean var8;
         do {
            recovery$indy$88(this.field_48l, 1319758695873533568L, var4);
            recovery$indy$89(this.field_444, 1319758695873533568L, var4);
            recovery$indy$90(this.field_44d, 1319758695873533568L, var4);
            recovery$indy$91(this.field_48f, 1319758695873533568L, var4);
            recovery$indy$92(this.field_48S, 1319758695873533568L, var4);
            recovery$indy$93(this.field_44p, 1319758695873533568L, var4);
            recovery$indy$94(this.field_442, 1319758695873533568L, var4);
            recovery$indy$95(this.field_44j, 1319758695873533568L, var4);
            if (var2 >= 0) {
               recovery$indy$96(this.field_44H, 1319758695873533568L, var4);
               return;
            }

            recovery$indy$87(this.field_44H, 1319758695873533568L, var4);
            var7++;
            var8 = var6;
            if (var2 > 0) {
               if (!var6) {
                  return;
               }

               var8 = var6;
            }
         } while (!var8);
      }
   }



   private int method_47$1978aaf78d(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 13715536729798L;
      boolean var6 = recovery$indy$97(1376791887019835030L, var1);
      AutoClicker_47Cn var10000 = this;
      if (!var6) {
         byte var8 = (byte) ((recovery$indy$98(this.settingSmartMode, var4, 1375805917206480443L, var1).equals(recovery$indy$99(1422, 2469934190012472085L ^ var1))) ? 1 : 0);
         if (var1 < 0L) {
            return var8;
         }

         if (var8 != 0) {
            return recovery$indy$100(this.settingSmartCPS, 1374829951764587129L, var1);
         }

         var10000 = this;
      }

      return recovery$indy$101(var10000.field_48y[var3], 1374829951764587129L, var1);
   }



   private EntityLivingBase method_43$f2b0beb8fc(long var1) {
      boolean var5;
      label69: {
         var1 = a ^ var1;
         long var3 = var1 ^ 10762098370892L;
         var5 = recovery$indy$102(-1785049563236463945L, var1);
         AimBot_47O_ var10000 = ClientGlobals.field_48.field_46e;
         if (!var5) {
            if (!recovery$indy$103(ClientGlobals.field_48.field_46e, var3, -1797937075687182785L, var1)) {
               break label69;
            }

            var10000 = ClientGlobals.field_48.field_46e;
         }

         if (var5) {
            return var10000.field_43c;
         }

         if (var10000.field_43c != null) {
            return ClientGlobals.field_48.field_46e.field_43c;
         }
      }

      C_47Ij var8 = recovery$indy$104(field_43, -1787844407000409761L, var1);
      boolean var10001 = var5;
      if (var1 > 0L) {
         if (!var5) {
            if (var8 == null) {
               return null;
            }

            var8 = recovery$indy$105(field_43, -1787844407000409761L, var1);
         }

         var10001 = var5;
      }

      if (!var10001) {
         if (var8.field_49 != C_47Az.ENTITY) {
            return null;
         }

         var8 = recovery$indy$106(field_43, -1787844407000409761L, var1);
      }

      if (var5) {
         return (EntityLivingBase)var8.field_47;
      } else {
         return var8.field_47 instanceof EntityLivingBase ? (EntityLivingBase)recovery$indy$107(field_43, -1787844407000409761L, var1).field_47 : null;
      }
   }



   private void method_43$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 84340680395737L;
      boolean var5 = recovery$indy$108(6790715493406767573L, var1);
      this.field_43U = Math.max(this.field_43U - recovery$indy$109(this.settingEnduranceReduction, var3, true, 6777291197192550432L, var1), 0);
      AutoClicker_47Cn var10000 = this;
      if (var5) {
         if (this.field_43U != 0) {
            return;
         }

         var10000 = this;
      }

      var10000.field_43P = false;
   }



   private boolean method_44G$aae029aa0a() {
      long var1 = a ^ 126026145952486L;
      long var3 = var1 ^ 14376295683950L;
      long var10000 = -7875852885320630466L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -7872334637031782509L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = -7872334637031782509L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Recommended");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44Y$aae029aa0a() {
      long var1 = a ^ 78104638704685L;
      long var3 = var1 ^ 62142361954725L;
      long var10002 = 3203445600148273496L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Recorded");
   }



   private boolean method_44W$aae029aa0a() {
      long var1 = a ^ 134444792570393L;
      long var3 = var1 ^ 6370985002897L;
      long var10002 = -9061012089580775572L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44s$aae029aa0a() {
      long var1 = a ^ 60542493382327L;
      long var3 = var1 ^ 79841958949695L;
      long var10002 = 3958273565388776386L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Recorded");
   }



   private boolean method_44m$f19a3ced8f(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      boolean var6 = recovery$indy$110(5621451317375035883L, var4);
      AutoClicker_47Cn var10000 = this;
      if (var6) {
         if (!recovery$indy$111(this.settingReduceCPSIfYouCanNotHitATargett, 5620541339334258748L, var4)) {
            return false;
         }

         var10000 = this;
      }

      EntityLivingBase var7 = var10000.field_44Z;
      if (var6) {
         if (var10000.field_44Z == null) {
            return false;
         }

         var7 = this.field_44Z;
      }

      int var8 = var7.field_432;
      boolean var10001 = var6;
      if (var1 >= 0) {
         if (var6) {
            if (var7.field_432 != 0) {
               return false;
            }

            long var9;
            var8 = (var9 = System.currentTimeMillis() - this.field_44Z.field_48i - 75L) == 0L ? 0 : (var9 < 0L ? -1 : 1);
         }

         var10001 = var6;
      }

      if (var2 >= 0L) {
         if (var10001) {
            if (var8 <= 0) {
               return false;
            }

            long var10;
            var8 = (var10 = System.currentTimeMillis() - this.field_44Z.field_48i - 225L) == 0L ? 0 : (var10 < 0L ? -1 : 1);
         }

         var10001 = var6;
      }

      return (boolean)(!var10001 ? var8 : var8 < 0);
   }



   private boolean method_44x$aae029aa0a() {
      long var1 = a ^ 79024707515882L;
      long var3 = var1 ^ 61928559382626L;
      long var10002 = 6175539112724938911L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$112(this, 7, var3, -7109609343707459932L, var1);
      recovery$indy$113(this, 17, var3, -7109609343707459932L, var1);
      recovery$indy$114(this, 19, var3, -7109609343707459932L, var1);
      recovery$indy$115(this, 40, var3, -7109609343707459932L, var1);
   }



   private boolean method_44T$aae029aa0a() {
      long var1 = a ^ 104407189862880L;
      long var3 = var1 ^ 36802285050984L;
      long var10000 = 6465338957324648017L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 6465468330473442453L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 6465545254168995718L;
         BooleanSetting var9 = this.settingSpikes;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44t$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 109949568491717L;
      boolean var5 = recovery$indy$116(-6860876020764211423L, var1);
      C_47Ij var10000 = recovery$indy$117(field_43, -6859200017531789664L, var1);
      if (var5) {
         if (var10000 == null) {
            return false;
         }

         var10000 = recovery$indy$118(field_43, -6859200017531789664L, var1);
      }

      if (var10000.field_49 == C_47Az.ENTITY) {
         boolean var7 = recovery$indy$120(
            ClientGlobals.field_48.field_46Z, recovery$indy$119(field_43, -6859200017531789664L, var1).field_47, var3, -6846888584773181171L, var1
         );
         boolean var10001 = var5;
         if (var1 >= 0L) {
            if (var5) {
               if (!var7) {
                  return false;
               }

               var7 = ClientGlobals.field_48.field_46Z.field_43P;
            }

            var10001 = var5;
         }

         if (var1 >= 0L) {
            if (var10001) {
               if (var7) {
                  return false;
               }

               var7 = recovery$indy$121(this.settingAttackFriends, -6860669717477433610L, var1);
            }

            var10001 = var5;
         }

         if (!var10001) {
            return var7;
         }

         if (!var7) {
            return true;
         }
      }

      return false;
   }



   private boolean method_49X$aae029aa0a() {
      long var1 = a ^ 90813558972426L;
      long var3 = var1 ^ 49571165783426L;
      long var10000 = -9196498315057861166L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -9199735431850977921L;
      long var6 = var3;
      ModeSetting var8 = this.settingTiming;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Always");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_44o$aae029aa0a() {
      long var1 = a ^ 89760287596118L;
      long var3 = var1 ^ 50781283204062L;
      long var10000 = 9080236218068603790L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 9083754294440651555L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = 9083754294440651555L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Recommended");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44V$aae029aa0a() {
      long var1 = a ^ 34985089604630L;
      long var3 = var1 ^ 105948714678686L;
      long var10000 = 8957447051372944295L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 8957576182942427491L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 8956667915211670128L;
         BooleanSetting var9 = this.settingReduceHitsOnWall;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44f$aae029aa0a() {
      long var1 = a ^ 75082414492728L;
      long var3 = var1 ^ 65717276977584L;
      long var10002 = -1413585420662605491L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("DragClick");
   }



   private boolean method_443$aae029aa0a() {
      long var1 = a ^ 21218736244794L;
      long var3 = var1 ^ 119579899243954L;
      long var10002 = 7522058703439297871L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44_$aae029aa0a() {
      long var1 = a ^ 78122832174503L;
      long var3 = var1 ^ 62126198569007L;
      long var10002 = -144417791159047982L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("DragClick");
   }



   private boolean method_449$aae029aa0a() {
      long var1 = a ^ 36768570313489L;
      long var3 = var1 ^ 104442259353241L;
      long var10002 = 7730581270384377444L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   private boolean method_44e$aae029aa0a() {
      long var1 = a ^ 73138471421384L;
      long var3 = var1 ^ 67110521659456L;
      long var10002 = 2707201317373554877L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44U$aae029aa0a() {
      long var1 = a ^ 102013829636861L;
      long var3 = var1 ^ 38802618173301L;
      long var10002 = 190548672940677000L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44g$aae029aa0a() {
      long var1 = a ^ 132473085517572L;
      long var3 = var1 ^ 8754374539916L;
      long var10002 = -4657333626329191823L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_44Z = null;
      this.field_43U = 0;
      this.field_43P = false;
   }



   private boolean method_442$aae029aa0a() {
      long var1 = a ^ 54404058705299L;
      long var3 = var1 ^ 86824588527643L;
      long var10002 = 993776813849778406L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Deviation");
   }



   private boolean method_44Z$aae029aa0a() {
      long var1 = a ^ 135587834225452L;
      long var3 = var1 ^ 5345135543972L;
      long var10002 = 249334692114798169L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44C$aae029aa0a() {
      long var1 = a ^ 88834675535652L;
      long var3 = var1 ^ 51981671549612L;
      long var10002 = -8107047713589585327L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44v$aae029aa0a() {
      long var1 = a ^ 1805128611344L;
      long var3 = var1 ^ 138717920138136L;
      long var10002 = 6217688096617677669L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   private boolean method_44J$aae029aa0a() {
      long var1 = a ^ 42583747586513L;
      long var3 = var1 ^ 98094091062361L;
      long var10002 = 686954520113781924L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Deviation");
   }



   private boolean method_44r$aae029aa0a() {
      long var1 = a ^ 63678315169653L;
      long var3 = var1 ^ 77411434439421L;
      long var10000 = -1792411814126417235L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -1788894218823536128L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = -1788894218823536128L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44j$aae029aa0a() {
      long var1 = a ^ 20579185256420L;
      long var3 = var1 ^ 120099991241324L;
      long var10002 = 557805831062033041L;
      long var5 = var3;
      ModeSetting var7 = this.settingTiming;
      return var7.method_46$5f9dc63072(var5).equals("Other");
   }



   private boolean method_440$aae029aa0a() {
      long var1 = a ^ 118166149339942L;
      long var3 = var1 ^ 23043322494638L;
      long var10002 = -324328728383066541L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_49o$aae029aa0a() {
      long var1 = a ^ 41809643843347L;
      long var3 = var1 ^ 98453848722075L;
      long var10000 = -3511104431411486005L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -3509837089683875226L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10001 = -3510199853651447435L;
         BooleanSetting var9 = this.settingReduceHitsOnWall;
         var10 = var9.method_49$aae029aa0a();
      }

      return var5 ? var10 : var10;
   }



   private boolean method_44w$0dd78e0064(long var1) {
      net.minecraft.entity.Entity var12;
      net.minecraft.entity.Entity var10;
      long var6 = a ^ var1;
      long var3 = var6 ^ 72519244140550L;
      boolean var5 = recovery$indy$flow$1449(6805065326981985277L, var6);
      if ((net.C_47Ij)recovery$indy$flow$1451(field_43, 6807759039399190549L, var6) == null) {
         return false;
      }

      boolean var10000 = recovery$indy$flow$1454(client.ClientGlobals.field_48.field_48e, var3, 6793180844173072245L, var6);
      if (var5) {
         return var10000;
      }

      if (var10000) {
         return true;
      }

      float var14;
      int var7 = (var14 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1456(field_43, 6793540426318162102L, var6)).field_48R - 0.0F) == 0.0F
         ? 0
         : (var14 < 0.0F ? -1 : 1);
      if (var6 >= 0L) {
         if (!var5) {
            if (var7 <= 0) {
               return false;
            }

            var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1459(field_43, 6793540426318162102L, var6)).field_48M ? 1 : 0));
         }

         if (var6 > 0L) {
            if (!var5) {
               if (var7 != 0) {
                  return false;
               }

               var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1462(field_43, 6793540426318162102L, var6)).method_49W$aae029aa0a() ? 1 : 0));
            }

            if (!var5) {
               if (var7 != 0) {
                  return false;
               }

               var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1465(field_43, 6793540426318162102L, var6)).method_48H$aae029aa0a() ? 1 : 0));
            }

            label259: {
               if (!var5) {
                  if (var7 != 0) {
                     return false;
                  }

                  var12 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1468(field_43, 6793540426318162102L, var6);
                  if (var5) {
                     break label259;
                  }

                  var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP) (var12)).method_41$e45115c4cf(net.C_47oY.field_463) ? 1 : 0));
               }

               if (var7 != 0) {
                  return false;
               }

               var12 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1472(field_43, 6793540426318162102L, var6)).field_48S;
            }

            if (!var5) {
               if (var12 != null) {
                  return false;
               }

               var12 = ((net.C_47Ij)recovery$indy$flow$1475(field_43, 6807759039399190549L, var6)).field_47;
            }

            return var12 instanceof EntityLivingBase;
         } else {
            if (!var5) {
               if (var7 != 0) {
                  return false;
               }

               var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1465(field_43, 6793540426318162102L, var6)).method_48H$aae029aa0a() ? 1 : 0));
            }

            label262: {
               if (!var5) {
                  if (var7 != 0) {
                     return false;
                  }

                  var10 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1468(field_43, 6793540426318162102L, var6);
                  if (var5) {
                     break label262;
                  }

                  var7 = ((int) (((net.minecraft.client.entity.EntityPlayerSP) (var10)).method_41$e45115c4cf(net.C_47oY.field_463) ? 1 : 0));
               }

               if (var7 != 0) {
                  return false;
               }

               var10 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1472(field_43, 6793540426318162102L, var6)).field_48S;
            }

            if (!var5) {
               if (var10 != null) {
                  return false;
               }

               var10 = ((net.C_47Ij)recovery$indy$flow$1475(field_43, 6807759039399190549L, var6)).field_47;
            }

            return var10 instanceof EntityLivingBase;
         }
      } else {
         net.minecraft.entity.Entity var8;
         boolean var10001;
         if (!var5) {
            if (var7 != 0) {
               return false;
            }

            var8 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1468(field_43, 6793540426318162102L, var6);
            var10001 = var5;
         } else {
            if (var7 != 0) {
               return false;
            }

            var8 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$1472(field_43, 6793540426318162102L, var6)).field_48S;
            var10001 = var5;
         }

         if (!var10001) {
            if (var8 != null) {
               return false;
            }

            var8 = ((net.C_47Ij)recovery$indy$flow$1475(field_43, 6807759039399190549L, var6)).field_47;
         }

         return var8 instanceof EntityLivingBase;
      }
   }




   private boolean method_444$aae029aa0a() {
      long var1 = a ^ 104879845183306L;
      long var3 = var1 ^ 36209791118018L;
      long var10000 = 8003879573496809723L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 8004009960410479167L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (var5) {
         if (!var12) {
            return false;
         }

         var10002 = 8004009960410479167L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return !var5 ? var12 : var12;
   }



   private boolean method_44q$aae029aa0a() {
      long var1 = a ^ 76964442130482L;
      long var3 = var1 ^ 64262046084538L;
      long var10002 = 2912683518899600711L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }



   private boolean method_44X$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 126819349141475L;
      long var10000 = 5922846663863793114L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 5922980212421248798L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var13 = var8.method_46$5f9dc63072(var6).equals("Simple");
      if (var5) {
         if (!var13) {
            var10002 = 5922980212421248798L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var15 = var11.method_46$5f9dc63072(var9).equals("Recorded");
            if (!var5) {
               return var15;
            }

            if (!var15) {
               return false;
            }
         }

         var13 = true;
      }

      return var13;
   }



   private boolean method_44H$aae029aa0a() {
      long var1 = a ^ 31148243969608L;
      long var3 = var1 ^ 109786986333120L;
      long var10002 = -8786039561989221571L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_49R$aae029aa0a() {
      long var1 = a ^ 131609582193071L;
      long var3 = var1 ^ 9067685964839L;
      long var10002 = -6199525431633527590L;
      long var5 = var3;
      ModeSetting var7 = this.settingTiming;
      return var7.method_46$5f9dc63072(var5).equals("Other");
   }



   private boolean method_44N$aae029aa0a() {
      long var1 = a ^ 29740694666815L;
      long var3 = var1 ^ 110505378995127L;
      long var10000 = -7031754999971875865L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -7032739389372069046L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = -7032739389372069046L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44M$aae029aa0a() {
      long var1 = a ^ 117844787076132L;
      long var3 = var1 ^ 22679087888812L;
      long var10002 = -252833900429907631L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_445$aae029aa0a() {
      long var1 = a ^ 72373040298461L;
      long var3 = var1 ^ 68578465127509L;
      long var10002 = 6450537952690130088L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   private boolean method_447$aae029aa0a() {
      long var1 = a ^ 18443677680373L;
      long var3 = var1 ^ 122371177277309L;
      long var10002 = -6724794519431825536L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("DragClick");
   }



   private boolean method_44h$aae029aa0a() {
      long var1 = a ^ 2042198360376L;
      long var3 = var1 ^ 138912107603120L;
      long var10002 = -2206295293830564787L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44n$aae029aa0a() {
      long var1 = a ^ 25251740277998L;
      long var3 = var1 ^ 115976520890726L;
      long var10000 = -4847212478342278858L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -4848198448306148965L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = -4848198448306148965L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Recommended");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44P$aae029aa0a() {
      long var1 = a ^ 45254128136971L;
      long var3 = var1 ^ 95266911639171L;
      long var10002 = -7831052846196488578L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }



   private boolean method_49W$aae029aa0a() {
      long var1 = a ^ 11182579771077L;
      long var3 = var1 ^ 129356494521165L;
      long var10002 = 476433706260566960L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Recorded");
   }



   private boolean method_44b$aae029aa0a() {
      long var1 = a ^ 3512018508278L;
      long var10001 = var1 ^ 96492968960825L;
      int var3 = (int)((var1 ^ 96492968960825L) >>> 48);
      int var4 = (int)((var1 ^ 96492968960825L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 137147815017598L;
      long var8 = var1 ^ 130357865013394L;
      long var10000 = 8764893453802705966L;
      boolean var10 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 8768412767276461187L;
      long var11 = var6;
      ModeSetting var13 = this.settingMode;
      byte var21 = (byte) ((var13.method_46$5f9dc63072(var11).equals("Simple")) ? 1 : 0);
      if (!var10) {
         if (var21 == 0) {
            return false;
         }

         var10002 = 8764377699769731965L;
         long var14 = var8;
         RangeSetting var16 = this.settingSimpleCPS;
         double var24;
         var21 = (byte)((var24 = var16.method_42$474dfaa627(var14) - 16.0) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1));
      }

      if (!var10) {
         if (var21 > 0) {
            return false;
         }

         char var22 = (char)var3;
         long var10004 = 8768194232363348005L;
         int var17 = var5;
         int var18 = var4;
         char var19 = var22;
         RangeSetting var20 = this.settingSimpleCPS;
         double var25;
         var21 = (byte)((var25 = var20.method_47$3192260b25(var19, var18, var17) - 10.0) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1));
      }

      return (boolean)(var10 ? var21 : var21 >= 0);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 4680525588849L;
      int var6 = (int)((var4 ^ 4680525588849L) >>> 32);
      int var7 = (int)((var4 ^ 4680525588849L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 109916674423601L;
      long var11 = var4 ^ 130423830740337L;
      long var13 = var4 ^ 7668165369880L;
      long var15 = var4 ^ 47323076686017L;
      long var17 = var4 ^ 120546192231256L;
      long var10002 = 2735411861317891373L;
      this.field_43W = C_47xl.method_41$97760315a3(var9);
      ModeSetting var10000 = this.settingClickPattern;
      long var10003 = 2723312420906800604L;
      ArrayList var19 = this.field_43W;
      long var20 = var17;
      String[] var45 = C_47xl.method_42$2ae1fe4536(var20, var19);
      var10003 = 2724533225521204825L;
      long var22 = var15;
      String[] var24 = var45;
      ModeSetting var25 = var10000;
      var25.method_42$7446cc8078(var24, var22);
      var10000 = this.settingClickPattern;
      var10003 = 2722939108330385637L;
      long var26 = var13;
      ModeSetting var28 = this.settingClickPattern;
      String var46 = var28.method_46$5f9dc63072(var26);
      long var10004 = 2737277702736497437L;
      ArrayList var29 = this.field_43W;
      long var30 = var11;
      String var32 = var46;
      String var47 = C_47xl.method_46$fc5f34b415(var32, var30, var29);
      var10002 = 2734343636952179331L;
      String var33 = var47;
      ModeSetting var34 = var10000;
      var34.method_49$a7421bf54c(var33);
      var10003 = 2722939108330385637L;
      long var35 = var13;
      ModeSetting var37 = this.settingClickPattern;
      String var48 = var37.method_46$5f9dc63072(var35);
      short var54 = (short)var7;
      char var55 = (char)var8;
      long var10006 = 2723870211595909961L;
      ArrayList var38 = this.field_43W;
      char var39 = var55;
      short var40 = var54;
      int var41 = var6;
      String var42 = var48;
      this.field_48H = C_47xl.method_49$93400a88bc(var42, var41, var40, var39, var38);
      this.field_48r = System.currentTimeMillis();
      this.field_43n = 0;
      this.field_480 = false;
      this.field_48I = true;
      this.field_441 = System.currentTimeMillis();
      this.field_485 = System.currentTimeMillis();
      var10001 = 2733949868584821727L;
      RangeSetting var43 = this.settingDelayClicksAfterClosingGuiScreen;
      var43.method_43$fedcb3e4d3();
      this.field_44S = true;
   }




   private boolean method_44E$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 57550716022324L;
      long var10000 = -6107684041228645163L;
      byte var5 = (byte) ((AimBot_47O_.method_45i$aae029aa0a()) ? 1 : 0);
      long var10002 = -6107236362086333054L;
      long var6 = var3;
      C_47Tf var8 = this.field_48B;
      int var16 = (int) ((var8.method_47$0dd78e0064(var6)) ? 1 : 0);
      if (var5 != 0) {
         if (var16 == 0) {
            return false;
         }

         long var10001 = -6107337285938817790L;
         BooleanSetting var9 = this.settingOnlyOnClick;
         var16 = (int) ((var9.method_49$aae029aa0a()) ? 1 : 0);
      }

      int var19;
      label76: {
         label75:
         if (var5 != 0) {
            if (var16 != 0) {
               long var17 = -6121473302506667418L;
               Minecraft var10 = field_43;
               var16 = (int) ((var10.field_44r.field_44l.method_42$aae029aa0a()) ? 1 : 0);
               if (var5 == 0) {
                  break label75;
               }

               if (var16 == 0) {
                  long var18 = -6121473302506667418L;
                  Minecraft var11 = field_43;
                  var16 = (int) ((var11.field_44r.field_44l.method_43$aae029aa0a()) ? 1 : 0);
                  var19 = var5;
                  if (var1 <= 0L) {
                     break label76;
                  }

                  if (var5 == 0) {
                     break label75;
                  }

                  if (var16 == 0) {
                     return false;
                  }
               }
            }

            long var20 = -6120536680643624624L;
            Minecraft var12 = field_43;
            var16 = (int) ((var12.method_44$aae029aa0a()) ? 1 : 0);
         }

         var19 = var5;
      }

      if (var1 > 0L) {
         if (var19 != 0) {
            if (var16 == 0) {
               return false;
            }

            long var21 = -6108595125522132637L;
            Minecraft var13 = field_43;
            var16 = var13.method_48$8abf5c6871();
         }

         var19 = var5;
      }

      if (var1 > 0L) {
         if (var19 == 0) {
            return var16 != 0;
         }

         var10002 = -6107417995992802733L;
         RangeSetting var14 = this.settingDelayClicksAfterClosingGuiScreen;
         var19 = var14.method_44$8abf5c6871();
      }

      return var16 >= var19;
   }




   private boolean method_446$aae029aa0a() {
      long var1 = a ^ 47856832418080L;
      long var3 = var1 ^ 92406408623272L;
      long var10002 = -1046664411787172779L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   private boolean method_44c$aae029aa0a() {
      long var1 = a ^ 116701672998861L;
      long var3 = var1 ^ 23838068154949L;
      long var10002 = 7463803677671518904L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("DragClick");
   }



   private boolean method_44z$aae029aa0a() {
      long var1 = a ^ 121390991472828L;
      long var3 = var1 ^ 19696866483508L;
      long var10000 = 1793926975577800461L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 1794057327560756681L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 1794134376295884506L;
         BooleanSetting var9 = this.settingDrops;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44R$aae029aa0a() {
      long var1 = a ^ 114055790018359L;
      long var3 = var1 ^ 26620954876607L;
      long var10002 = -2346713512265921982L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44Q$aae029aa0a() {
      long var1 = a ^ 12743091680760L;
      long var3 = var1 ^ 127661345460336L;
      long var10002 = 1558703224967200909L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   public void method_488$e45a9973e5(long var1) {
      this.field_44R[0] = this.field_44R[1] = 0;
      this.field_43y = (int)Math.abs(this.field_485 - System.currentTimeMillis());
      this.field_485 = System.currentTimeMillis();
      this.field_44r[0] = this.field_44r[1] = 0;
      this.field_44A[0] = this.field_44A[1] = 0.0;
   }



   private boolean method_44K$aae029aa0a() {
      long var1 = a ^ 65254458329194L;
      long var3 = var1 ^ 75680521465314L;
      long var10000 = -1711631462549420622L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = -1714868029552984801L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = -1714868029552984801L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_44d$aae029aa0a() {
      long var1 = a ^ 36940962852078L;
      long var3 = var1 ^ 103446411856230L;
      long var10002 = 916353181865810331L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_441$aae029aa0a() {
      long var1 = a ^ 93553815513792L;
      long var3 = var1 ^ 46848222351176L;
      long var10002 = 763921797915484085L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Recorded");
   }



   private boolean method_44I$aae029aa0a() {
      long var1 = a ^ 26635142364509L;
      long var3 = var1 ^ 114026959132885L;
      long var10002 = 2090994024657455144L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



   private boolean method_44A$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 26655025491078L;
      boolean var5 = recovery$indy$132(2365921215556537688L, var1);
      if (recovery$indy$133(this.settingBreakBlocks, 2367272743317004006L, var1)) {
         C_47Ij var10000 = recovery$indy$134(field_43, 2368619444006002352L, var1);
         if (!var5) {
            if (var10000 == null) {
               return false;
            }

            var10000 = recovery$indy$135(field_43, 2368619444006002352L, var1);
         }

         if (var10000.field_49 == C_47Az.BLOCK) {
            double var8;
            int var7 = (var8 = this.field_43n - recovery$indy$136(this.settingBreakTickDelay, var3, 2370428331528633153L, var1)) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
            if (var5) {
               return var7 != 0;
            }

            if (var7 > 0) {
               return true;
            }
         }
      }

      return false;
   }



   private boolean method_44S$aae029aa0a() {
      long var1 = a ^ 42606946856230L;
      long var3 = var1 ^ 98190229014702L;
      long var10000 = 5580819592919228670L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 5584337119518677075L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (!var5) {
         if (!var12) {
            return false;
         }

         var10002 = 5584337119518677075L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return var5 ? var12 : var12;
   }



   private boolean method_49D$aae029aa0a() {
      long var1 = a ^ 73726892045820L;
      long var3 = var1 ^ 66522120966260L;
      long var10000 = 1559761139520713293L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 1559908792587190409L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 1559977063534291866L;
         BooleanSetting var9 = this.settingDrops;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44i$aae029aa0a() {
      long var1 = a ^ 117399842929813L;
      long var3 = var1 ^ 23415183972637L;
      long var10000 = -2536569246514808028L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = -2536440268820723232L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = -2535791484743113997L;
         BooleanSetting var9 = this.settingReduceHitsInAir;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44p$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$137(-358811735796017528L, var1);
      C_47Ij var10000 = recovery$indy$138(field_43, -355985880472468128L, var1);
      if (!var3) {
         if (var10000 == null) {
            return true;
         }

         var10000 = recovery$indy$139(field_43, -355985880472468128L, var1);
      }

      return var10000.field_49 != C_47Az.ENTITY;
   }



   private boolean method_49U$aae029aa0a() {
      long var1 = a ^ 123823083152734L;
      long var3 = var1 ^ 16562680807638L;
      long var10002 = 362499466432614443L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44a$aae029aa0a() {
      long var1 = a ^ 76282377836878L;
      long var3 = var1 ^ 64791232036038L;
      long var10002 = 8725705196448410683L;
      long var5 = var3;
      ModeSetting var7 = this.settingTiming;
      return var7.method_46$5f9dc63072(var5).equals("Other");
   }



   private boolean method_44F$aae029aa0a() {
      long var1 = a ^ 67728670273070L;
      long var3 = var1 ^ 72657106308006L;
      long var10002 = -3569218855265117349L;
      long var5 = var3;
      ModeSetting var7 = this.settingTiming;
      return var7.method_46$5f9dc63072(var5).equals("Other");
   }



   private boolean method_44l$aae029aa0a() {
      long var1 = a ^ 92107698547443L;
      long var3 = var1 ^ 48691992924027L;
      long var10000 = -3843133203581375166L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = -3842986650309632122L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var11 = var8.method_46$5f9dc63072(var6).equals("Simple");
      if (var5) {
         if (!var11) {
            return false;
         }

         long var10001 = -3844448055742101439L;
         BooleanSetting var9 = this.settingSimpleDoubleClicks;
         var11 = var9.method_44$aae029aa0a();
      }

      if (var5) {
         if (!var11) {
            return false;
         }

         long var12 = -3843481333126581099L;
         BooleanSetting var10 = this.settingSimpleDoubleClicks;
         var11 = var10.method_49$aae029aa0a();
      }

      return !var5 ? var11 : var11;
   }



   private boolean method_44u$aae029aa0a() {
      long var1 = a ^ 133099412137296L;
      long var3 = var1 ^ 7147319984344L;
      long var10002 = -4248633015834456027L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_44B$aae029aa0a() {
      long var1 = a ^ 109377259180643L;
      long var3 = var1 ^ 5077318058100L;
      long var10000 = -992408159076428334L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = -1005328231892070009L;
      long var6 = var3;
      AutoClicker_47Cn var8 = this;
      boolean var9 = var8.method_44X$0dd78e0064(var6);
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_44O$aae029aa0a() {
      long var1 = a ^ 83554812814442L;
      long var3 = var1 ^ 57671155302882L;
      long var10000 = 306069848201161138L;
      boolean var5 = AimBot_47O_.method_45g$aae029aa0a();
      long var10002 = 302832147326112031L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 301791942460439052L;
         BooleanSetting var9 = this.settingSpikes;
         var10 = var9.method_49$aae029aa0a();
      }

      return var5 ? var10 : var10;
   }



   private boolean method_448$aae029aa0a() {
      long var1 = a ^ 97638462688191L;
      long var3 = var1 ^ 43158980570679L;
      long var10000 = 7775035667263802382L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 7775169026161671882L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 7774687535369852377L;
         BooleanSetting var9 = this.settingSpikes;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44k$aae029aa0a() {
      long var1 = a ^ 116144466513521L;
      long var3 = var1 ^ 24380381686777L;
      long var10000 = -5897383644941940288L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = -5897249976673256700L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Smart");
      if (var5) {
         if (!var12) {
            return false;
         }

         var10002 = -5897249976673256700L;
         long var9 = var3;
         ModeSetting var11 = this.settingSmartMode;
         var12 = var11.method_46$5f9dc63072(var9).equals("Overengineered");
      }

      return !var5 ? var12 : var12;
   }



   private boolean method_44y$aae029aa0a() {
      long var1 = a ^ 121383047693463L;
      long var3 = var1 ^ 19688988254495L;
      long var10000 = 7263830206510678822L;
      boolean var5 = AimBot_47O_.method_45i$aae029aa0a();
      long var10002 = 7263960541732696546L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Advanced");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 7263474657208212209L;
         BooleanSetting var9 = this.settingDrops;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_44L$aae029aa0a() {
      long var1 = a ^ 49342426852189L;
      long var3 = var1 ^ 91731635015381L;
      long var10002 = -3817777988086407640L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Deviation");
   }



   private boolean method_44D$aae029aa0a() {
      long var1 = a ^ 109669568984189L;
      long var3 = var1 ^ 31009360155125L;
      long var10002 = 6063191432018870536L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("DragClick");
   }



   private boolean method_49m$aae029aa0a() {
      long var1 = a ^ 29370455973250L;
      long var3 = var1 ^ 111307664553994L;
      long var10002 = -4766020670770992905L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Smart");
   }



   private boolean method_49z$aae029aa0a() {
      long var1 = a ^ 109871351982858L;
      long var3 = var1 ^ 31202546404994L;
      long var10002 = 816216034627886719L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Advanced");
   }



    public AutoClicker_47Cn(int a0,char a1,short a2) {
        super((java.lang.String) ("AutoClicker"),(java.lang.String) ("Selbstst\u00e4ndigerClicker"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 103901544043445L)),(java.awt.Color) (new java.awt.Color((int) (82),(int) (186),(int) (74))),(client.module.Category) (client.module.Category.LEGIT));
        int constructorPart1 = a1;
        int constructorPart2 = a1;
        long constructorKey3 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a);
        long constructorKey4 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 42375923767955L);
        long constructorKey5 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 55124115821286L);
        long constructorKey6 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 25520997153352L);
        long constructorKey7 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 40627087764955L);
        long constructorKey8 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 52072002686894L);
        int constructorPart9 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 137221636771403L) >>> 32));
        int constructorPart10 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 137221636771403L) << 32) >>> 48));
        int constructorPart11 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 137221636771403L) << 48) >>> 48));
        long constructorKey12 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 81034488285457L);
        int constructorPart13 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 61794286726957L) >>> 32));
        int constructorPart14 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 61794286726957L) << 32) >>> 48));
        int constructorPart15 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 61794286726957L) << 48) >>> 48));
        int constructorPart16 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 98364087677279L) >>> 48));
        int constructorPart17 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 98364087677279L) << 16) >>> 48));
        int constructorPart18 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 98364087677279L) << 32) >>> 32));
        long constructorKey19 = (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 17478242224502L) >>> 16);
        int constructorPart20 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 17478242224502L) << 48) >>> 48));
        long constructorKey21 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 98838085850660L);
        long constructorKey22 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 9333845372980L);
        int constructorPart23 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 77299915899423L) >>> 32));
        int constructorPart24 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 77299915899423L) << 32) >>> 48));
        int constructorPart25 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 77299915899423L) << 48) >>> 48));
        long constructorKey26 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 26996642310943L);
        long constructorKey27 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 29286828744460L);
        long constructorKey28 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 11790627998594L);
        int constructorPart29 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 34496314838034L) >>> 32));
        int constructorPart30 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 34496314838034L) << 32) >>> 48));
        int constructorPart31 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 34496314838034L) << 48) >>> 48));
        long constructorKey32 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 90810076059800L);
        int constructorPart33 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 69469557754120L) >>> 32));
        long constructorKey34 = ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 69469557754120L) << 32) >>> 32);
        long constructorKey35 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 52484270779316L);
        long constructorKey36 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 79841617478396L);
        long constructorKey37 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 23963366794104L);
        int constructorPart38 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 119558495414200L) >>> 32));
        int constructorPart39 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 119558495414200L) << 32) >>> 48));
        int constructorPart40 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 119558495414200L) << 48) >>> 48));
        int constructorPart41 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 63396786785795L) >>> 32));
        int constructorPart42 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 63396786785795L) << 32) >>> 48));
        int constructorPart43 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 63396786785795L) << 48) >>> 48));
        long constructorKey44 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.AutoClicker_47Cn.a) ^ 2215236677673L);
        boolean initialValue45 = recovery$indy$flow$1851();
        java.lang.Object initialValue46 = recovery$indy$flow$1853(6);
        ((java.lang.Object[]) initialValue46)[0] = "Deviation";
        ((java.lang.Object[]) initialValue46)[1] = "DragClick";
        ((java.lang.Object[]) initialValue46)[2] = "Simple";
        ((java.lang.Object[]) initialValue46)[3] = "Advanced";
        ((java.lang.Object[]) initialValue46)[4] = "Recorded";
        ((java.lang.Object[]) initialValue46)[5] = "Smart";
        client.setting.ModeSetting initialized47 = new client.setting.ModeSetting(this, "Mode", constructorKey37, "Smart", (java.lang.String[]) (initialValue46));
        recovery$indy$flow$1855(this, initialized47);
        client.setting.NumberSetting initialized48 = new client.setting.NumberSetting(this, "CPSLimiter", Double.longBitsToDouble(4626322717216342016L), constructorKey44, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4630826316843712512L), 0);
        recovery$indy$flow$1858(this, initialized48);
        int initialValue49 = (int) ((initialValue45 ? 1 : 0));
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey8, "CPSLimiterIntave", false);
        recovery$indy$flow$1861(this, initialized50);
        client.setting.SettingGroup initialized51 = new client.setting.SettingGroup(this, "ModeValues", true, constructorKey21);
        recovery$indy$flow$1864(this, initialized51);
        java.lang.Object initialValue52 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized53 = new client.setting.RangeSetting(constructorPart23, this, "SimpleCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4622945017495814144L), Double.longBitsToDouble(4625196817309499392L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue52));
        java.lang.String initialValue54 = "CPS";
        long initialValue55 = constructorKey28;
        client.setting.RangeSetting initialValue56 = initialized53;
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue58 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue59 = recovery$indy$flow$1870(initialValue57, initialValue55, initialValue58);
        java.lang.Object initialValue60 = recovery$indy$flow$1871(this);
        long initialValue61 = constructorKey34;
        java.lang.Object initialValue62 = initialValue60;
        int initialValue63 = constructorPart33;
        java.lang.Object initialValue64 = initialValue59;
        java.lang.Object initialValue65 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue66 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue67 = recovery$indy$flow$1874(initialValue65, initialValue63, initialValue66, initialValue61);
        recovery$indy$flow$1875(this, initialValue67);
        java.lang.Object initialValue68 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized69 = new client.setting.RangeSetting(constructorPart23, this, "SimpleCPSRecalculateDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue68));
        long initialValue70 = constructorKey6;
        client.setting.RangeSetting initialValue71 = initialized69;
        java.lang.Object initialValue72 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue73 = recovery$indy$flow$1880(initialValue72, initialValue70);
        java.lang.String initialValue74 = "CPSRecalculateDelay";
        long initialValue75 = constructorKey28;
        java.lang.Object initialValue76 = initialValue73;
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue78 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue79 = recovery$indy$flow$1883(initialValue77, initialValue75, initialValue78);
        java.lang.Object initialValue80 = recovery$indy$flow$1884(this);
        long initialValue81 = constructorKey34;
        java.lang.Object initialValue82 = initialValue80;
        int initialValue83 = constructorPart33;
        java.lang.Object initialValue84 = initialValue79;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue84))))));
        java.lang.Object initialValue86 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue87 = recovery$indy$flow$1887(initialValue85, initialValue83, initialValue86, initialValue81);
        recovery$indy$flow$1888(this, initialValue87);
        java.lang.Object initialValue88 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        net.C_47TU initialized89 = new net.C_47TU(this, "SimpleClickDutyCycle", Double.longBitsToDouble(4599976659396224614L), constructorKey35, Double.longBitsToDouble(4604029899060858061L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue88));
        short converted90 = (short) (constructorPart39);
        int initialValue91 = constructorPart40;
        java.lang.String initialValue92 = "ClickDutyCycle";
        int initialValue93 = (int) (converted90);
        int initialValue94 = constructorPart38;
        net.C_47TU initialValue95 = initialized89;
        java.lang.Object initialValue96 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue97 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue98 = recovery$indy$flow$1894(initialValue96, initialValue94, (short) (initialValue93), initialValue97, initialValue91);
        java.lang.Object initialValue99 = recovery$indy$flow$1895(this);
        long initialValue100 = constructorKey5;
        java.lang.Object initialValue101 = initialValue99;
        java.lang.Object initialValue102 = initialValue98;
        java.lang.Object initialValue103 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue104 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue105 = recovery$indy$flow$1898(initialValue103, initialValue104, initialValue100);
        recovery$indy$flow$1899(this, initialValue105);
        short converted106 = (short) (constructorPart16);
        char converted107 = (char) (constructorPart17);
        java.lang.Object initialValue108 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized109 = new client.setting.BooleanSetting(this, "SimpleDoubleClicks", converted106, converted107, constructorPart18, true, (client.setting.SettingGroup) (initialValue108));
        long initialValue110 = constructorKey7;
        java.lang.String initialValue111 = "DoubleClicks";
        client.setting.BooleanSetting initialValue112 = initialized109;
        java.lang.Object initialValue113 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue112))))));
        java.lang.Object initialValue114 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue111))))));
        java.lang.Object initialValue115 = recovery$indy$flow$1905(initialValue113, initialValue114, initialValue110);
        java.lang.Object initialValue116 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue115))))));
        java.lang.Object initialValue117 = recovery$indy$flow$1907(this);
        java.lang.Object initialValue118 = initialValue117;
        long initialValue119 = constructorKey4;
        java.lang.Object initialValue120 = initialValue116;
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue123 = recovery$indy$flow$1910(initialValue121, initialValue119, initialValue122);
        java.lang.Object initialValue124 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue123))))));
        recovery$indy$flow$1912(this, initialValue124);
        short converted125 = (short) (constructorPart16);
        char converted126 = (char) (constructorPart17);
        java.lang.Object initialValue127 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized128 = new client.setting.BooleanSetting(this, "SimpleExtraDoubleClickRandomize", converted125, converted126, constructorPart18, false, (client.setting.SettingGroup) (initialValue127));
        long initialValue129 = constructorKey7;
        java.lang.String initialValue130 = "ExtraDoubleClickRandomize";
        client.setting.BooleanSetting initialValue131 = initialized128;
        java.lang.Object initialValue132 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue131))))));
        java.lang.Object initialValue133 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue134 = recovery$indy$flow$1918(initialValue132, initialValue133, initialValue129);
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = recovery$indy$flow$1920(this);
        java.lang.Object initialValue137 = initialValue136;
        long initialValue138 = constructorKey4;
        java.lang.Object initialValue139 = initialValue135;
        java.lang.Object initialValue140 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue139))))));
        java.lang.Object initialValue141 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue137))))));
        java.lang.Object initialValue142 = recovery$indy$flow$1923(initialValue140, initialValue138, initialValue141);
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue142))))));
        recovery$indy$flow$1925(this, initialValue143);
        java.lang.Object initialValue144 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized145 = new client.setting.RangeSetting(constructorPart23, this, "DeviationCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4623507967449235456L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue144));
        long initialValue146 = constructorKey6;
        client.setting.RangeSetting initialValue147 = initialized145;
        java.lang.Object initialValue148 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue149 = recovery$indy$flow$1930(initialValue148, initialValue146);
        java.lang.String initialValue150 = "MaxCPS";
        java.lang.String initialValue151 = "MinCPS";
        long initialValue152 = constructorKey32;
        java.lang.Object initialValue153 = initialValue149;
        java.lang.Object initialValue154 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue155 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue151))))));
        java.lang.Object initialValue156 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue150))))));
        java.lang.Object initialValue157 = recovery$indy$flow$1934(initialValue154, initialValue152, initialValue155, initialValue156);
        java.lang.Object initialValue158 = recovery$indy$flow$1935(this);
        long initialValue159 = constructorKey34;
        java.lang.Object initialValue160 = initialValue158;
        int initialValue161 = constructorPart33;
        java.lang.Object initialValue162 = initialValue157;
        java.lang.Object initialValue163 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue162))))));
        java.lang.Object initialValue164 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue160))))));
        java.lang.Object initialValue165 = recovery$indy$flow$1938(initialValue163, initialValue161, initialValue164, initialValue159);
        recovery$indy$flow$1939(this, initialValue165);
        short converted166 = (short) (constructorPart16);
        char converted167 = (char) (constructorPart17);
        java.lang.Object initialValue168 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized169 = new client.setting.BooleanSetting(this, "DeviationDoubleClick", converted166, converted167, constructorPart18, true, (client.setting.SettingGroup) (initialValue168));
        long initialValue170 = constructorKey7;
        java.lang.String initialValue171 = "DoubleClick";
        client.setting.BooleanSetting initialValue172 = initialized169;
        java.lang.Object initialValue173 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue172))))));
        java.lang.Object initialValue174 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue171))))));
        java.lang.Object initialValue175 = recovery$indy$flow$1945(initialValue173, initialValue174, initialValue170);
        java.lang.Object initialValue176 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue175))))));
        java.lang.Object initialValue177 = recovery$indy$flow$1947(this);
        java.lang.Object initialValue178 = initialValue177;
        long initialValue179 = constructorKey4;
        java.lang.Object initialValue180 = initialValue176;
        java.lang.Object initialValue181 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue180))))));
        java.lang.Object initialValue182 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue183 = recovery$indy$flow$1950(initialValue181, initialValue179, initialValue182);
        java.lang.Object initialValue184 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue183))))));
        recovery$indy$flow$1952(this, initialValue184);
        java.lang.Object initialValue185 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized186 = new client.setting.NumberSetting(this, "DeviationAirMultiplier", Double.longBitsToDouble(4600877379321698714L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue185), constructorKey26);
        short converted187 = (short) (constructorPart31);
        int initialValue188 = (int) (converted187);
        int initialValue189 = constructorPart30;
        java.lang.String initialValue190 = "AirMultiplier";
        int initialValue191 = constructorPart29;
        client.setting.NumberSetting initialValue192 = initialized186;
        java.lang.Object initialValue193 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue194 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue190))))));
        java.lang.Object initialValue195 = recovery$indy$flow$1958(initialValue193, initialValue191, initialValue194, initialValue189, (short) (initialValue188));
        java.lang.Object initialValue196 = recovery$indy$flow$1959(this);
        java.lang.Object initialValue197 = initialValue196;
        java.lang.Object initialValue198 = initialValue195;
        java.lang.Object initialValue199 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue198))))));
        java.lang.Object initialValue200 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue197))))));
        java.lang.Object initialValue201 = recovery$indy$flow$1962(initialValue199, initialValue200);
        recovery$indy$flow$1963(this, initialValue201);
        java.lang.Object initialValue202 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized203 = new client.setting.RangeSetting(constructorPart23, this, "DragCPSInAir", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue202));
        java.lang.String initialValue204 = "CPSInAir";
        long initialValue205 = constructorKey28;
        client.setting.RangeSetting initialValue206 = initialized203;
        java.lang.Object initialValue207 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue206))))));
        java.lang.Object initialValue208 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue204))))));
        java.lang.Object initialValue209 = recovery$indy$flow$1969(initialValue207, initialValue205, initialValue208);
        java.lang.Object initialValue210 = recovery$indy$flow$1970(this);
        long initialValue211 = constructorKey34;
        java.lang.Object initialValue212 = initialValue210;
        int initialValue213 = constructorPart33;
        java.lang.Object initialValue214 = initialValue209;
        java.lang.Object initialValue215 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue214))))));
        java.lang.Object initialValue216 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue212))))));
        java.lang.Object initialValue217 = recovery$indy$flow$1973(initialValue215, initialValue213, initialValue216, initialValue211);
        recovery$indy$flow$1974(this, initialValue217);
        java.lang.Object initialValue218 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized219 = new client.setting.RangeSetting(constructorPart23, this, "DragCPSInAirRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4629137466983448576L), 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, (client.setting.SettingGroup) (initialValue218));
        java.lang.String initialValue220 = "CPSInAirRecalculateTickDelay";
        long initialValue221 = constructorKey28;
        client.setting.RangeSetting initialValue222 = initialized219;
        java.lang.Object initialValue223 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue222))))));
        java.lang.Object initialValue224 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue220))))));
        java.lang.Object initialValue225 = recovery$indy$flow$1980(initialValue223, initialValue221, initialValue224);
        long initialValue226 = constructorKey6;
        java.lang.Object initialValue227 = initialValue225;
        java.lang.Object initialValue228 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue227))))));
        java.lang.Object initialValue229 = recovery$indy$flow$1982(initialValue228, initialValue226);
        java.lang.Object initialValue230 = recovery$indy$flow$1983(this);
        long initialValue231 = constructorKey34;
        java.lang.Object initialValue232 = initialValue230;
        int initialValue233 = constructorPart33;
        java.lang.Object initialValue234 = initialValue229;
        java.lang.Object initialValue235 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue234))))));
        java.lang.Object initialValue236 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue232))))));
        java.lang.Object initialValue237 = recovery$indy$flow$1986(initialValue235, initialValue233, initialValue236, initialValue231);
        recovery$indy$flow$1987(this, initialValue237);
        java.lang.Object initialValue238 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized239 = new client.setting.RangeSetting(constructorPart23, this, "MaxCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4625759767262920704L), Double.longBitsToDouble(4626322717216342016L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue238));
        java.lang.Object initialValue240 = recovery$indy$flow$1991(this);
        long initialValue241 = constructorKey34;
        java.lang.Object initialValue242 = initialValue240;
        int initialValue243 = constructorPart33;
        client.setting.RangeSetting initialValue244 = initialized239;
        java.lang.Object initialValue245 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue244))))));
        java.lang.Object initialValue246 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue242))))));
        java.lang.Object initialValue247 = recovery$indy$flow$1994(initialValue245, initialValue243, initialValue246, initialValue241);
        recovery$indy$flow$1995(this, initialValue247);
        java.lang.Object initialValue248 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized249 = new client.setting.RangeSetting(constructorPart23, this, "MaxCPSRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue248));
        long initialValue250 = constructorKey6;
        client.setting.RangeSetting initialValue251 = initialized249;
        java.lang.Object initialValue252 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue251))))));
        java.lang.Object initialValue253 = recovery$indy$flow$2000(initialValue252, initialValue250);
        java.lang.Object initialValue254 = recovery$indy$flow$2001(this);
        long initialValue255 = constructorKey34;
        java.lang.Object initialValue256 = initialValue254;
        int initialValue257 = constructorPart33;
        java.lang.Object initialValue258 = initialValue253;
        java.lang.Object initialValue259 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue258))))));
        java.lang.Object initialValue260 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue256))))));
        java.lang.Object initialValue261 = recovery$indy$flow$2004(initialValue259, initialValue257, initialValue260, initialValue255);
        recovery$indy$flow$2005(this, initialValue261);
        java.lang.Object initialValue262 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized263 = new client.setting.NumberSetting(this, "MinStandardDeviation", Double.longBitsToDouble(4602678819172646912L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue262), constructorKey26);
        java.lang.Object initialValue264 = recovery$indy$flow$2009(this);
        java.lang.Object initialValue265 = initialValue264;
        client.setting.NumberSetting initialValue266 = initialized263;
        java.lang.Object initialValue267 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue266))))));
        java.lang.Object initialValue268 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue265))))));
        java.lang.Object initialValue269 = recovery$indy$flow$2012(initialValue267, initialValue268);
        recovery$indy$flow$2013(this, initialValue269);
        java.lang.Object initialValue270 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized271 = new client.setting.RangeSetting(constructorPart23, this, "AdvancedCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue270));
        long initialValue272 = constructorKey6;
        client.setting.RangeSetting initialValue273 = initialized271;
        java.lang.Object initialValue274 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue273))))));
        java.lang.Object initialValue275 = recovery$indy$flow$2018(initialValue274, initialValue272);
        java.lang.String initialValue276 = "CPS";
        long initialValue277 = constructorKey28;
        java.lang.Object initialValue278 = initialValue275;
        java.lang.Object initialValue279 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue278))))));
        java.lang.Object initialValue280 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue276))))));
        java.lang.Object initialValue281 = recovery$indy$flow$2021(initialValue279, initialValue277, initialValue280);
        java.lang.Object initialValue282 = recovery$indy$flow$2022(this);
        long initialValue283 = constructorKey34;
        java.lang.Object initialValue284 = initialValue282;
        int initialValue285 = constructorPart33;
        java.lang.Object initialValue286 = initialValue281;
        java.lang.Object initialValue287 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue286))))));
        java.lang.Object initialValue288 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue284))))));
        java.lang.Object initialValue289 = recovery$indy$flow$2025(initialValue287, initialValue285, initialValue288, initialValue283);
        recovery$indy$flow$2026(this, initialValue289);
        java.lang.Object initialValue290 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized291 = new client.setting.RangeSetting(constructorPart23, this, "AdvancedCPSRecalculateDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4648488871632306176L), 0.0D, Double.longBitsToDouble(4661014508095930368L), 0, (client.setting.SettingGroup) (initialValue290));
        long initialValue292 = constructorKey6;
        client.setting.RangeSetting initialValue293 = initialized291;
        java.lang.Object initialValue294 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue293))))));
        java.lang.Object initialValue295 = recovery$indy$flow$2031(initialValue294, initialValue292);
        java.lang.String initialValue296 = "CPSRecalculateDelay";
        long initialValue297 = constructorKey28;
        java.lang.Object initialValue298 = initialValue295;
        java.lang.Object initialValue299 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue298))))));
        java.lang.Object initialValue300 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue296))))));
        java.lang.Object initialValue301 = recovery$indy$flow$2034(initialValue299, initialValue297, initialValue300);
        java.lang.Object initialValue302 = recovery$indy$flow$2035(this);
        long initialValue303 = constructorKey34;
        java.lang.Object initialValue304 = initialValue302;
        int initialValue305 = constructorPart33;
        java.lang.Object initialValue306 = initialValue301;
        java.lang.Object initialValue307 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue306))))));
        java.lang.Object initialValue308 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue304))))));
        java.lang.Object initialValue309 = recovery$indy$flow$2038(initialValue307, initialValue305, initialValue308, initialValue303);
        recovery$indy$flow$2039(this, initialValue309);
        short converted310 = (short) (constructorPart16);
        char converted311 = (char) (constructorPart17);
        java.lang.Object initialValue312 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized313 = new client.setting.BooleanSetting(this, "Spikes", converted310, converted311, constructorPart18, false, (client.setting.SettingGroup) (initialValue312));
        java.lang.Object initialValue314 = recovery$indy$flow$2043(this);
        java.lang.Object initialValue315 = initialValue314;
        long initialValue316 = constructorKey4;
        client.setting.BooleanSetting initialValue317 = initialized313;
        java.lang.Object initialValue318 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue317))))));
        java.lang.Object initialValue319 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue315))))));
        java.lang.Object initialValue320 = recovery$indy$flow$2046(initialValue318, initialValue316, initialValue319);
        java.lang.Object initialValue321 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue320))))));
        recovery$indy$flow$2048(this, initialValue321);
        java.lang.Object initialValue322 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized323 = new client.setting.NumberSetting(this, "SpikeDelay", Double.longBitsToDouble(4669471951536783360L), 0.0D, Double.longBitsToDouble(4671226772094713856L), 0, (client.setting.SettingGroup) (initialValue322), constructorKey26);
        java.lang.Object initialValue324 = recovery$indy$flow$2052(this);
        java.lang.Object initialValue325 = initialValue324;
        client.setting.NumberSetting initialValue326 = initialized323;
        java.lang.Object initialValue327 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue326))))));
        java.lang.Object initialValue328 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue325))))));
        java.lang.Object initialValue329 = recovery$indy$flow$2055(initialValue327, initialValue328);
        recovery$indy$flow$2056(this, initialValue329);
        java.lang.Object initialValue330 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized331 = new client.setting.RangeSetting(constructorPart23, this, "SpikeDuration", constructorPart24, constructorPart25, Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4652007308841189376L), 0.0D, Double.longBitsToDouble(4656510908468559872L), 0, (client.setting.SettingGroup) (initialValue330));
        long initialValue332 = constructorKey6;
        client.setting.RangeSetting initialValue333 = initialized331;
        java.lang.Object initialValue334 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue333))))));
        java.lang.Object initialValue335 = recovery$indy$flow$2061(initialValue334, initialValue332);
        java.lang.Object initialValue336 = recovery$indy$flow$2062(this);
        long initialValue337 = constructorKey34;
        java.lang.Object initialValue338 = initialValue336;
        int initialValue339 = constructorPart33;
        java.lang.Object initialValue340 = initialValue335;
        java.lang.Object initialValue341 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue340))))));
        java.lang.Object initialValue342 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue338))))));
        java.lang.Object initialValue343 = recovery$indy$flow$2065(initialValue341, initialValue339, initialValue342, initialValue337);
        recovery$indy$flow$2066(this, initialValue343);
        java.lang.Object initialValue344 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized345 = new client.setting.NumberSetting(this, "SpikeMultiplier", Double.longBitsToDouble(4609434218613702656L), 1.0D, Double.longBitsToDouble(4613937818241073152L), 2, (client.setting.SettingGroup) (initialValue344), constructorKey26);
        java.lang.Object initialValue346 = recovery$indy$flow$2070(this);
        java.lang.Object initialValue347 = initialValue346;
        client.setting.NumberSetting initialValue348 = initialized345;
        java.lang.Object initialValue349 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue348))))));
        java.lang.Object initialValue350 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue347))))));
        java.lang.Object initialValue351 = recovery$indy$flow$2073(initialValue349, initialValue350);
        recovery$indy$flow$2074(this, initialValue351);
        short converted352 = (short) (constructorPart16);
        char converted353 = (char) (constructorPart17);
        java.lang.Object initialValue354 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized355 = new client.setting.BooleanSetting(this, "Drops", converted352, converted353, constructorPart18, false, (client.setting.SettingGroup) (initialValue354));
        java.lang.Object initialValue356 = recovery$indy$flow$2078(this);
        java.lang.Object initialValue357 = initialValue356;
        long initialValue358 = constructorKey4;
        client.setting.BooleanSetting initialValue359 = initialized355;
        java.lang.Object initialValue360 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue359))))));
        java.lang.Object initialValue361 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue357))))));
        java.lang.Object initialValue362 = recovery$indy$flow$2081(initialValue360, initialValue358, initialValue361);
        java.lang.Object initialValue363 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue362))))));
        recovery$indy$flow$2083(this, initialValue363);
        java.lang.Object initialValue364 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized365 = new client.setting.NumberSetting(this, "DropDelay", Double.longBitsToDouble(4664418596095524864L), 0.0D, Double.longBitsToDouble(4671226772094713856L), 0, (client.setting.SettingGroup) (initialValue364), constructorKey26);
        java.lang.Object initialValue366 = recovery$indy$flow$2087(this);
        java.lang.Object initialValue367 = initialValue366;
        client.setting.NumberSetting initialValue368 = initialized365;
        java.lang.Object initialValue369 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue368))))));
        java.lang.Object initialValue370 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue367))))));
        java.lang.Object initialValue371 = recovery$indy$flow$2090(initialValue369, initialValue370);
        recovery$indy$flow$2091(this, initialValue371);
        java.lang.Object initialValue372 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized373 = new client.setting.RangeSetting(constructorPart23, this, "DropDuration", constructorPart24, constructorPart25, Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4652007308841189376L), 0.0D, Double.longBitsToDouble(4656510908468559872L), 0, (client.setting.SettingGroup) (initialValue372));
        long initialValue374 = constructorKey6;
        client.setting.RangeSetting initialValue375 = initialized373;
        java.lang.Object initialValue376 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue375))))));
        java.lang.Object initialValue377 = recovery$indy$flow$2096(initialValue376, initialValue374);
        java.lang.Object initialValue378 = recovery$indy$flow$2097(this);
        long initialValue379 = constructorKey34;
        java.lang.Object initialValue380 = initialValue378;
        int initialValue381 = constructorPart33;
        java.lang.Object initialValue382 = initialValue377;
        java.lang.Object initialValue383 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue382))))));
        java.lang.Object initialValue384 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue380))))));
        java.lang.Object initialValue385 = recovery$indy$flow$2100(initialValue383, initialValue381, initialValue384, initialValue379);
        recovery$indy$flow$2101(this, initialValue385);
        java.lang.Object initialValue386 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized387 = new client.setting.NumberSetting(this, "DropMultiplier", Double.longBitsToDouble(4602678819172646912L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue386), constructorKey26);
        java.lang.Object initialValue388 = recovery$indy$flow$2105(this);
        java.lang.Object initialValue389 = initialValue388;
        client.setting.NumberSetting initialValue390 = initialized387;
        java.lang.Object initialValue391 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue390))))));
        java.lang.Object initialValue392 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue389))))));
        java.lang.Object initialValue393 = recovery$indy$flow$2108(initialValue391, initialValue392);
        recovery$indy$flow$2109(this, initialValue393);
        short converted394 = (short) (constructorPart16);
        char converted395 = (char) (constructorPart17);
        java.lang.Object initialValue396 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized397 = new client.setting.BooleanSetting(this, "ReduceHitsInAir", converted394, converted395, constructorPart18, true, (client.setting.SettingGroup) (initialValue396));
        java.lang.Object initialValue398 = recovery$indy$flow$2113(this);
        java.lang.Object initialValue399 = initialValue398;
        long initialValue400 = constructorKey4;
        client.setting.BooleanSetting initialValue401 = initialized397;
        java.lang.Object initialValue402 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue401))))));
        java.lang.Object initialValue403 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue399))))));
        java.lang.Object initialValue404 = recovery$indy$flow$2116(initialValue402, initialValue400, initialValue403);
        java.lang.Object initialValue405 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue404))))));
        recovery$indy$flow$2118(this, initialValue405);
        java.lang.Object initialValue406 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized407 = new client.setting.RangeSetting(constructorPart23, this, "ReduceRecalculateDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4641240890982006784L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue406));
        long initialValue408 = constructorKey6;
        client.setting.RangeSetting initialValue409 = initialized407;
        java.lang.Object initialValue410 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue409))))));
        java.lang.Object initialValue411 = recovery$indy$flow$2123(initialValue410, initialValue408);
        java.lang.Object initialValue412 = recovery$indy$flow$2124(this);
        long initialValue413 = constructorKey34;
        java.lang.Object initialValue414 = initialValue412;
        int initialValue415 = constructorPart33;
        java.lang.Object initialValue416 = initialValue411;
        java.lang.Object initialValue417 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue416))))));
        java.lang.Object initialValue418 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue414))))));
        java.lang.Object initialValue419 = recovery$indy$flow$2127(initialValue417, initialValue415, initialValue418, initialValue413);
        recovery$indy$flow$2128(this, initialValue419);
        java.lang.Object initialValue420 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized421 = new client.setting.RangeSetting(constructorPart23, this, "ReduceMultiplier", constructorPart24, constructorPart25, Double.longBitsToDouble(4600877379321698714L), Double.longBitsToDouble(4600877379321698714L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue420));
        long initialValue422 = constructorKey6;
        client.setting.RangeSetting initialValue423 = initialized421;
        java.lang.Object initialValue424 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue423))))));
        java.lang.Object initialValue425 = recovery$indy$flow$2133(initialValue424, initialValue422);
        java.lang.Object initialValue426 = recovery$indy$flow$2134(this);
        long initialValue427 = constructorKey34;
        java.lang.Object initialValue428 = initialValue426;
        int initialValue429 = constructorPart33;
        java.lang.Object initialValue430 = initialValue425;
        java.lang.Object initialValue431 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue430))))));
        java.lang.Object initialValue432 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue428))))));
        java.lang.Object initialValue433 = recovery$indy$flow$2137(initialValue431, initialValue429, initialValue432, initialValue427);
        recovery$indy$flow$2138(this, initialValue433);
        short converted434 = (short) (constructorPart16);
        char converted435 = (char) (constructorPart17);
        java.lang.Object initialValue436 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized437 = new client.setting.BooleanSetting(this, "ReduceHitsOnWall", converted434, converted435, constructorPart18, false, (client.setting.SettingGroup) (initialValue436));
        java.lang.Object initialValue438 = recovery$indy$flow$2142(this);
        java.lang.Object initialValue439 = initialValue438;
        long initialValue440 = constructorKey4;
        client.setting.BooleanSetting initialValue441 = initialized437;
        java.lang.Object initialValue442 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue441))))));
        java.lang.Object initialValue443 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue439))))));
        java.lang.Object initialValue444 = recovery$indy$flow$2145(initialValue442, initialValue440, initialValue443);
        java.lang.Object initialValue445 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue444))))));
        recovery$indy$flow$2147(this, initialValue445);
        java.lang.Object initialValue446 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized447 = new client.setting.RangeSetting(constructorPart23, this, "ReduceRecalculateDelayOnWall", constructorPart24, constructorPart25, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4641240890982006784L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue446));
        long initialValue448 = constructorKey6;
        client.setting.RangeSetting initialValue449 = initialized447;
        java.lang.Object initialValue450 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue449))))));
        java.lang.Object initialValue451 = recovery$indy$flow$2152(initialValue450, initialValue448);
        java.lang.Object initialValue452 = recovery$indy$flow$2153(this);
        long initialValue453 = constructorKey34;
        java.lang.Object initialValue454 = initialValue452;
        int initialValue455 = constructorPart33;
        java.lang.Object initialValue456 = initialValue451;
        java.lang.Object initialValue457 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue456))))));
        java.lang.Object initialValue458 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue454))))));
        java.lang.Object initialValue459 = recovery$indy$flow$2156(initialValue457, initialValue455, initialValue458, initialValue453);
        recovery$indy$flow$2157(this, initialValue459);
        java.lang.Object initialValue460 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.RangeSetting initialized461 = new client.setting.RangeSetting(constructorPart23, this, "ReduceMultiplierOnWall", constructorPart24, constructorPart25, Double.longBitsToDouble(4600877379321698714L), Double.longBitsToDouble(4600877379321698714L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue460));
        long initialValue462 = constructorKey6;
        client.setting.RangeSetting initialValue463 = initialized461;
        java.lang.Object initialValue464 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue463))))));
        java.lang.Object initialValue465 = recovery$indy$flow$2162(initialValue464, initialValue462);
        java.lang.Object initialValue466 = recovery$indy$flow$2163(this);
        long initialValue467 = constructorKey34;
        java.lang.Object initialValue468 = initialValue466;
        int initialValue469 = constructorPart33;
        java.lang.Object initialValue470 = initialValue465;
        java.lang.Object initialValue471 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue470))))));
        java.lang.Object initialValue472 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue468))))));
        java.lang.Object initialValue473 = recovery$indy$flow$2166(initialValue471, initialValue469, initialValue472, initialValue467);
        recovery$indy$flow$2167(this, initialValue473);
        java.lang.Object initialValue474 = recovery$indy$flow$2169();
        java.lang.Object initialValue475 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.MultiSelectSetting initialized476 = new client.setting.MultiSelectSetting(this, "HurttimesToHit", constructorKey22, (net.C_47OZ[]) (initialValue474), (client.setting.SettingGroup) (initialValue475));
        java.lang.Object initialValue477 = recovery$indy$flow$2172(this);
        java.lang.Object initialValue478 = initialValue477;
        client.setting.MultiSelectSetting initialValue479 = initialized476;
        java.lang.Object initialValue480 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue479))))));
        java.lang.Object initialValue481 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue478))))));
        java.lang.Object initialValue482 = recovery$indy$flow$2175(initialValue480, initialValue481);
        recovery$indy$flow$2176(this, initialValue482);
        java.lang.Object initialValue483 = recovery$indy$flow$2178(0);
        java.lang.Object initialValue484 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.ModeSetting initialized485 = new client.setting.ModeSetting(this, "ClickPattern", "", (java.lang.String[]) (initialValue483), (client.setting.SettingGroup) (initialValue484), constructorKey12);
        java.lang.Object initialValue486 = recovery$indy$flow$2181(this);
        java.lang.Object initialValue487 = initialValue486;
        client.setting.ModeSetting initialValue488 = initialized485;
        java.lang.Object initialValue489 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue488))))));
        java.lang.Object initialValue490 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue487))))));
        java.lang.Object initialValue491 = recovery$indy$flow$2184(initialValue489, initialValue490);
        recovery$indy$flow$2185(this, initialValue491);
        java.lang.Object initialValue492 = recovery$indy$flow$2187(2);
        ((java.lang.Object[]) initialValue492)[0] = "TimeMillis";
        ((java.lang.Object[]) initialValue492)[1] = "Ticks";
        java.lang.Object initialValue493 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.ModeSetting initialized494 = new client.setting.ModeSetting(this, "RecordedMode", "TimeMillis", (java.lang.String[]) (initialValue492), (client.setting.SettingGroup) (initialValue493), constructorKey12);
        java.lang.Object initialValue495 = recovery$indy$flow$2190(this);
        java.lang.Object initialValue496 = initialValue495;
        client.setting.ModeSetting initialValue497 = initialized494;
        java.lang.Object initialValue498 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue497))))));
        java.lang.Object initialValue499 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue496))))));
        java.lang.Object initialValue500 = recovery$indy$flow$2193(initialValue498, initialValue499);
        recovery$indy$flow$2194(this, initialValue500);
        java.lang.Object initialValue501 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized502 = new client.setting.NumberSetting(this, "Multiplier", 1.0D, 0.0D, Double.longBitsToDouble(4617315517961601024L), 2, (client.setting.SettingGroup) (initialValue501), constructorKey26);
        java.lang.Object initialValue503 = recovery$indy$flow$2198(this);
        java.lang.Object initialValue504 = initialValue503;
        client.setting.NumberSetting initialValue505 = initialized502;
        java.lang.Object initialValue506 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue505))))));
        java.lang.Object initialValue507 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue504))))));
        java.lang.Object initialValue508 = recovery$indy$flow$2201(initialValue506, initialValue507);
        recovery$indy$flow$2202(this, initialValue508);
        java.lang.Object initialValue509 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized510 = new client.setting.NumberSetting(this, "RecordedAirMultiplier", Double.longBitsToDouble(4600877379321698714L), 0.0D, 1.0D, 2, (client.setting.SettingGroup) (initialValue509), constructorKey26);
        short converted511 = (short) (constructorPart31);
        int initialValue512 = (int) (converted511);
        int initialValue513 = constructorPart30;
        java.lang.String initialValue514 = "AirMultiplier";
        int initialValue515 = constructorPart29;
        client.setting.NumberSetting initialValue516 = initialized510;
        java.lang.Object initialValue517 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue516))))));
        java.lang.Object initialValue518 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue514))))));
        java.lang.Object initialValue519 = recovery$indy$flow$2208(initialValue517, initialValue515, initialValue518, initialValue513, (short) (initialValue512));
        java.lang.Object initialValue520 = recovery$indy$flow$2209(this);
        java.lang.Object initialValue521 = initialValue520;
        java.lang.Object initialValue522 = initialValue519;
        java.lang.Object initialValue523 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue522))))));
        java.lang.Object initialValue524 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue521))))));
        java.lang.Object initialValue525 = recovery$indy$flow$2212(initialValue523, initialValue524);
        recovery$indy$flow$2213(this, initialValue525);
        short converted526 = (short) (constructorPart16);
        char converted527 = (char) (constructorPart17);
        java.lang.Object initialValue528 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized529 = new client.setting.BooleanSetting(this, "PlayRecordedMouseMovements", converted526, converted527, constructorPart18, false, (client.setting.SettingGroup) (initialValue528));
        java.lang.Object initialValue530 = recovery$indy$flow$2217(this);
        java.lang.Object initialValue531 = initialValue530;
        long initialValue532 = constructorKey4;
        client.setting.BooleanSetting initialValue533 = initialized529;
        java.lang.Object initialValue534 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue533))))));
        java.lang.Object initialValue535 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue531))))));
        java.lang.Object initialValue536 = recovery$indy$flow$2220(initialValue534, initialValue532, initialValue535);
        java.lang.Object initialValue537 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue536))))));
        recovery$indy$flow$2222(this, initialValue537);
        java.lang.Object initialValue538 = recovery$indy$flow$2224(2);
        ((java.lang.Object[]) initialValue538)[0] = "Recommended";
        ((java.lang.Object[]) initialValue538)[1] = "Overengineered";
        java.lang.Object initialValue539 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.ModeSetting initialized540 = new client.setting.ModeSetting(this, "SmartMode", "Recommended", (java.lang.String[]) (initialValue538), (client.setting.SettingGroup) (initialValue539), constructorKey12);
        java.lang.String initialValue541 = "Mode";
        long initialValue542 = constructorKey27;
        client.setting.ModeSetting initialValue543 = initialized540;
        java.lang.Object initialValue544 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue543))))));
        java.lang.Object initialValue545 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue541))))));
        java.lang.Object initialValue546 = recovery$indy$flow$2229(initialValue544, initialValue542, initialValue545);
        java.lang.Object initialValue547 = recovery$indy$flow$2230(this);
        java.lang.Object initialValue548 = initialValue547;
        java.lang.Object initialValue549 = initialValue546;
        java.lang.Object initialValue550 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue549))))));
        java.lang.Object initialValue551 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue548))))));
        java.lang.Object initialValue552 = recovery$indy$flow$2233(initialValue550, initialValue551);
        recovery$indy$flow$2234(this, initialValue552);
        java.lang.Object initialValue553 = recovery$indy$flow$2236(3);
        ((java.lang.Object[]) initialValue553)[0] = "Combined";
        ((java.lang.Object[]) initialValue553)[1] = "Default";
        ((java.lang.Object[]) initialValue553)[2] = "Separate";
        java.lang.Object initialValue554 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.ModeSetting initialized555 = new client.setting.ModeSetting(this, "SmartClickMode", "Combined", (java.lang.String[]) (initialValue553), (client.setting.SettingGroup) (initialValue554), constructorKey12);
        java.lang.String initialValue556 = "ClickMode";
        long initialValue557 = constructorKey27;
        client.setting.ModeSetting initialValue558 = initialized555;
        java.lang.Object initialValue559 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue558))))));
        java.lang.Object initialValue560 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue556))))));
        java.lang.Object initialValue561 = recovery$indy$flow$2241(initialValue559, initialValue557, initialValue560);
        java.lang.Object initialValue562 = recovery$indy$flow$2242(this);
        java.lang.Object initialValue563 = initialValue562;
        java.lang.Object initialValue564 = initialValue561;
        java.lang.Object initialValue565 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue564))))));
        java.lang.Object initialValue566 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue563))))));
        java.lang.Object initialValue567 = recovery$indy$flow$2245(initialValue565, initialValue566);
        recovery$indy$flow$2246(this, initialValue567);
        java.lang.Object initialValue568 = recovery$indy$flow$2248(3);
        ((java.lang.Object[]) initialValue568)[0] = "Combined";
        ((java.lang.Object[]) initialValue568)[1] = "Default";
        ((java.lang.Object[]) initialValue568)[2] = "Separate";
        java.lang.Object initialValue569 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.ModeSetting initialized570 = new client.setting.ModeSetting(this, "SmartDoubleClickModeS", "Default", (java.lang.String[]) (initialValue568), (client.setting.SettingGroup) (initialValue569), constructorKey12);
        java.lang.String initialValue571 = "DoubleClickMode";
        long initialValue572 = constructorKey27;
        client.setting.ModeSetting initialValue573 = initialized570;
        java.lang.Object initialValue574 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue573))))));
        java.lang.Object initialValue575 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue571))))));
        java.lang.Object initialValue576 = recovery$indy$flow$2253(initialValue574, initialValue572, initialValue575);
        java.lang.Object initialValue577 = recovery$indy$flow$2254(this);
        java.lang.Object initialValue578 = initialValue577;
        java.lang.Object initialValue579 = initialValue576;
        java.lang.Object initialValue580 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue579))))));
        java.lang.Object initialValue581 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue578))))));
        java.lang.Object initialValue582 = recovery$indy$flow$2257(initialValue580, initialValue581);
        recovery$indy$flow$2258(this, initialValue582);
        java.lang.Object initialValue583 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingModeValues));
        char converted584 = (char) (constructorPart20);
        client.setting.SettingGroup initialized585 = new client.setting.SettingGroup(this, "CPS Settings", true, constructorKey19, converted584, (client.setting.SettingGroup) (initialValue583));
        java.lang.Object initialValue586 = recovery$indy$flow$2262(this);
        char converted587 = (char) (constructorPart42);
        java.lang.Object initialValue588 = initialValue586;
        int initialValue589 = constructorPart43;
        int initialValue590 = (int) (converted587);
        int initialValue591 = constructorPart41;
        client.setting.SettingGroup initialValue592 = initialized585;
        java.lang.Object initialValue593 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue592))))));
        java.lang.Object initialValue594 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue588))))));
        java.lang.Object initialValue595 = recovery$indy$flow$2265(initialValue593, initialValue591, (char) (initialValue590), initialValue589, initialValue594);
        recovery$indy$flow$2266(this, initialValue595);
        java.lang.Object initialValue596 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingCPSSettings));
        char converted597 = (char) (constructorPart20);
        client.setting.SettingGroup initialized598 = new client.setting.SettingGroup(this, "In Air", true, constructorKey19, converted597, (client.setting.SettingGroup) (initialValue596));
        java.lang.Object initialValue599 = recovery$indy$flow$2270(this);
        char converted600 = (char) (constructorPart42);
        java.lang.Object initialValue601 = initialValue599;
        int initialValue602 = constructorPart43;
        int initialValue603 = (int) (converted600);
        int initialValue604 = constructorPart41;
        client.setting.SettingGroup initialValue605 = initialized598;
        java.lang.Object initialValue606 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue605))))));
        java.lang.Object initialValue607 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue601))))));
        java.lang.Object initialValue608 = recovery$indy$flow$2273(initialValue606, initialValue604, (char) (initialValue603), initialValue602, initialValue607);
        recovery$indy$flow$2274(this, initialValue608);
        java.lang.Object initialValue609 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingInAir));
        client.setting.RangeSetting initialized610 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSInAir", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue609));
        java.lang.String initialValue611 = "CPSInAir";
        long initialValue612 = constructorKey28;
        client.setting.RangeSetting initialValue613 = initialized610;
        java.lang.Object initialValue614 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue613))))));
        java.lang.Object initialValue615 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue611))))));
        java.lang.Object initialValue616 = recovery$indy$flow$2280(initialValue614, initialValue612, initialValue615);
        java.lang.Object initialValue617 = recovery$indy$flow$2281(this);
        long initialValue618 = constructorKey34;
        java.lang.Object initialValue619 = initialValue617;
        int initialValue620 = constructorPart33;
        java.lang.Object initialValue621 = initialValue616;
        java.lang.Object initialValue622 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue621))))));
        java.lang.Object initialValue623 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue619))))));
        java.lang.Object initialValue624 = recovery$indy$flow$2284(initialValue622, initialValue620, initialValue623, initialValue618);
        recovery$indy$flow$2285(this, initialValue624);
        java.lang.Object initialValue625 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingInAir));
        client.setting.RangeSetting initialized626 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSInAirRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, (client.setting.SettingGroup) (initialValue625));
        java.lang.String initialValue627 = "CPSInAirRecalculateTickDelay";
        long initialValue628 = constructorKey28;
        client.setting.RangeSetting initialValue629 = initialized626;
        java.lang.Object initialValue630 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue629))))));
        java.lang.Object initialValue631 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue627))))));
        java.lang.Object initialValue632 = recovery$indy$flow$2291(initialValue630, initialValue628, initialValue631);
        long initialValue633 = constructorKey6;
        java.lang.Object initialValue634 = initialValue632;
        java.lang.Object initialValue635 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue634))))));
        java.lang.Object initialValue636 = recovery$indy$flow$2293(initialValue635, initialValue633);
        java.lang.Object initialValue637 = recovery$indy$flow$2294(this);
        long initialValue638 = constructorKey34;
        java.lang.Object initialValue639 = initialValue637;
        int initialValue640 = constructorPart33;
        java.lang.Object initialValue641 = initialValue636;
        java.lang.Object initialValue642 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue641))))));
        java.lang.Object initialValue643 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue639))))));
        java.lang.Object initialValue644 = recovery$indy$flow$2297(initialValue642, initialValue640, initialValue643, initialValue638);
        recovery$indy$flow$2298(this, initialValue644);
        java.lang.Object initialValue645 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingInAir));
        client.setting.RangeSetting initialized646 = new client.setting.RangeSetting(constructorPart23, this, "SmartDCPSInAir", constructorPart24, constructorPart25, 0.0D, 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue645));
        java.lang.String initialValue647 = "DoubleClicksPerSecondInAir";
        long initialValue648 = constructorKey28;
        client.setting.RangeSetting initialValue649 = initialized646;
        java.lang.Object initialValue650 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue649))))));
        java.lang.Object initialValue651 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue647))))));
        java.lang.Object initialValue652 = recovery$indy$flow$2304(initialValue650, initialValue648, initialValue651);
        java.lang.Object initialValue653 = recovery$indy$flow$2305(this);
        long initialValue654 = constructorKey34;
        java.lang.Object initialValue655 = initialValue653;
        int initialValue656 = constructorPart33;
        java.lang.Object initialValue657 = initialValue652;
        java.lang.Object initialValue658 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue657))))));
        java.lang.Object initialValue659 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue655))))));
        java.lang.Object initialValue660 = recovery$indy$flow$2308(initialValue658, initialValue656, initialValue659, initialValue654);
        recovery$indy$flow$2309(this, initialValue660);
        java.lang.Object initialValue661 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingInAir));
        client.setting.RangeSetting initialized662 = new client.setting.RangeSetting(constructorPart23, this, "DCPSInAirRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue661));
        long initialValue663 = constructorKey6;
        client.setting.RangeSetting initialValue664 = initialized662;
        java.lang.Object initialValue665 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue664))))));
        java.lang.Object initialValue666 = recovery$indy$flow$2314(initialValue665, initialValue663);
        java.lang.Object initialValue667 = recovery$indy$flow$2315(this);
        long initialValue668 = constructorKey34;
        java.lang.Object initialValue669 = initialValue667;
        int initialValue670 = constructorPart33;
        java.lang.Object initialValue671 = initialValue666;
        java.lang.Object initialValue672 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue671))))));
        java.lang.Object initialValue673 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue669))))));
        java.lang.Object initialValue674 = recovery$indy$flow$2318(initialValue672, initialValue670, initialValue673, initialValue668);
        recovery$indy$flow$2319(this, initialValue674);
        java.lang.Object initialValue675 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingCPSSettings));
        char converted676 = (char) (constructorPart20);
        client.setting.SettingGroup initialized677 = new client.setting.SettingGroup(this, "On wall", true, constructorKey19, converted676, (client.setting.SettingGroup) (initialValue675));
        java.lang.Object initialValue678 = recovery$indy$flow$2323(this);
        char converted679 = (char) (constructorPart42);
        java.lang.Object initialValue680 = initialValue678;
        int initialValue681 = constructorPart43;
        int initialValue682 = (int) (converted679);
        int initialValue683 = constructorPart41;
        client.setting.SettingGroup initialValue684 = initialized677;
        java.lang.Object initialValue685 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue684))))));
        java.lang.Object initialValue686 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue680))))));
        java.lang.Object initialValue687 = recovery$indy$flow$2326(initialValue685, initialValue683, (char) (initialValue682), initialValue681, initialValue686);
        recovery$indy$flow$2327(this, initialValue687);
        java.lang.Object initialValue688 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnWall));
        client.setting.RangeSetting initialized689 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSOnWall", constructorPart24, constructorPart25, Double.longBitsToDouble(4620693217682128896L), Double.longBitsToDouble(4622945017495814144L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue688));
        java.lang.String initialValue690 = "CPSOnWall";
        long initialValue691 = constructorKey28;
        client.setting.RangeSetting initialValue692 = initialized689;
        java.lang.Object initialValue693 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue692))))));
        java.lang.Object initialValue694 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue690))))));
        java.lang.Object initialValue695 = recovery$indy$flow$2333(initialValue693, initialValue691, initialValue694);
        java.lang.Object initialValue696 = recovery$indy$flow$2334(this);
        long initialValue697 = constructorKey34;
        java.lang.Object initialValue698 = initialValue696;
        int initialValue699 = constructorPart33;
        java.lang.Object initialValue700 = initialValue695;
        java.lang.Object initialValue701 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue700))))));
        java.lang.Object initialValue702 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue698))))));
        java.lang.Object initialValue703 = recovery$indy$flow$2337(initialValue701, initialValue699, initialValue702, initialValue697);
        recovery$indy$flow$2338(this, initialValue703);
        java.lang.Object initialValue704 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnWall));
        client.setting.RangeSetting initialized705 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSOnWallRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, (client.setting.SettingGroup) (initialValue704));
        java.lang.String initialValue706 = "CPSOnWallRecalculateTickDelay";
        long initialValue707 = constructorKey28;
        client.setting.RangeSetting initialValue708 = initialized705;
        java.lang.Object initialValue709 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue708))))));
        java.lang.Object initialValue710 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue706))))));
        java.lang.Object initialValue711 = recovery$indy$flow$2344(initialValue709, initialValue707, initialValue710);
        long initialValue712 = constructorKey6;
        java.lang.Object initialValue713 = initialValue711;
        java.lang.Object initialValue714 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue713))))));
        java.lang.Object initialValue715 = recovery$indy$flow$2346(initialValue714, initialValue712);
        java.lang.Object initialValue716 = recovery$indy$flow$2347(this);
        long initialValue717 = constructorKey34;
        java.lang.Object initialValue718 = initialValue716;
        int initialValue719 = constructorPart33;
        java.lang.Object initialValue720 = initialValue715;
        java.lang.Object initialValue721 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue720))))));
        java.lang.Object initialValue722 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue718))))));
        java.lang.Object initialValue723 = recovery$indy$flow$2350(initialValue721, initialValue719, initialValue722, initialValue717);
        recovery$indy$flow$2351(this, initialValue723);
        java.lang.Object initialValue724 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnWall));
        client.setting.RangeSetting initialized725 = new client.setting.RangeSetting(constructorPart23, this, "SmartDCPSOnWall", constructorPart24, constructorPart25, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue724));
        java.lang.String initialValue726 = "DCPSOnWall";
        long initialValue727 = constructorKey28;
        client.setting.RangeSetting initialValue728 = initialized725;
        java.lang.Object initialValue729 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue728))))));
        java.lang.Object initialValue730 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue726))))));
        java.lang.Object initialValue731 = recovery$indy$flow$2357(initialValue729, initialValue727, initialValue730);
        java.lang.Object initialValue732 = recovery$indy$flow$2358(this);
        long initialValue733 = constructorKey34;
        java.lang.Object initialValue734 = initialValue732;
        int initialValue735 = constructorPart33;
        java.lang.Object initialValue736 = initialValue731;
        java.lang.Object initialValue737 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue736))))));
        java.lang.Object initialValue738 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue734))))));
        java.lang.Object initialValue739 = recovery$indy$flow$2361(initialValue737, initialValue735, initialValue738, initialValue733);
        recovery$indy$flow$2362(this, initialValue739);
        java.lang.Object initialValue740 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnWall));
        client.setting.RangeSetting initialized741 = new client.setting.RangeSetting(constructorPart23, this, "DCPSOnWallRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue740));
        long initialValue742 = constructorKey6;
        client.setting.RangeSetting initialValue743 = initialized741;
        java.lang.Object initialValue744 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue743))))));
        java.lang.Object initialValue745 = recovery$indy$flow$2367(initialValue744, initialValue742);
        java.lang.Object initialValue746 = recovery$indy$flow$2368(this);
        long initialValue747 = constructorKey34;
        java.lang.Object initialValue748 = initialValue746;
        int initialValue749 = constructorPart33;
        java.lang.Object initialValue750 = initialValue745;
        java.lang.Object initialValue751 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue750))))));
        java.lang.Object initialValue752 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue748))))));
        java.lang.Object initialValue753 = recovery$indy$flow$2371(initialValue751, initialValue749, initialValue752, initialValue747);
        recovery$indy$flow$2372(this, initialValue753);
        java.lang.Object initialValue754 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingCPSSettings));
        char converted755 = (char) (constructorPart20);
        client.setting.SettingGroup initialized756 = new client.setting.SettingGroup(this, "On first Hit", true, constructorKey19, converted755, (client.setting.SettingGroup) (initialValue754));
        java.lang.Object initialValue757 = recovery$indy$flow$2376(this);
        char converted758 = (char) (constructorPart42);
        java.lang.Object initialValue759 = initialValue757;
        int initialValue760 = constructorPart43;
        int initialValue761 = (int) (converted758);
        int initialValue762 = constructorPart41;
        client.setting.SettingGroup initialValue763 = initialized756;
        java.lang.Object initialValue764 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue763))))));
        java.lang.Object initialValue765 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue759))))));
        java.lang.Object initialValue766 = recovery$indy$flow$2379(initialValue764, initialValue762, (char) (initialValue761), initialValue760, initialValue765);
        recovery$indy$flow$2380(this, initialValue766);
        java.lang.Object initialValue767 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnFirstHit));
        client.setting.RangeSetting initialized768 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSFirstHit", constructorPart24, constructorPart25, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue767));
        java.lang.String initialValue769 = "CPSFirstHit";
        long initialValue770 = constructorKey28;
        client.setting.RangeSetting initialValue771 = initialized768;
        java.lang.Object initialValue772 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue771))))));
        java.lang.Object initialValue773 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue769))))));
        java.lang.Object initialValue774 = recovery$indy$flow$2386(initialValue772, initialValue770, initialValue773);
        java.lang.Object initialValue775 = recovery$indy$flow$2387(this);
        long initialValue776 = constructorKey34;
        java.lang.Object initialValue777 = initialValue775;
        int initialValue778 = constructorPart33;
        java.lang.Object initialValue779 = initialValue774;
        java.lang.Object initialValue780 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue779))))));
        java.lang.Object initialValue781 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue777))))));
        java.lang.Object initialValue782 = recovery$indy$flow$2390(initialValue780, initialValue778, initialValue781, initialValue776);
        recovery$indy$flow$2391(this, initialValue782);
        java.lang.Object initialValue783 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnFirstHit));
        client.setting.RangeSetting initialized784 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPSFirstHitRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, (client.setting.SettingGroup) (initialValue783));
        java.lang.String initialValue785 = "CPSFirstHitRecalculateTickDelay";
        long initialValue786 = constructorKey28;
        client.setting.RangeSetting initialValue787 = initialized784;
        java.lang.Object initialValue788 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue787))))));
        java.lang.Object initialValue789 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue785))))));
        java.lang.Object initialValue790 = recovery$indy$flow$2397(initialValue788, initialValue786, initialValue789);
        long initialValue791 = constructorKey6;
        java.lang.Object initialValue792 = initialValue790;
        java.lang.Object initialValue793 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue792))))));
        java.lang.Object initialValue794 = recovery$indy$flow$2399(initialValue793, initialValue791);
        java.lang.Object initialValue795 = recovery$indy$flow$2400(this);
        long initialValue796 = constructorKey34;
        java.lang.Object initialValue797 = initialValue795;
        int initialValue798 = constructorPart33;
        java.lang.Object initialValue799 = initialValue794;
        java.lang.Object initialValue800 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue799))))));
        java.lang.Object initialValue801 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue797))))));
        java.lang.Object initialValue802 = recovery$indy$flow$2403(initialValue800, initialValue798, initialValue801, initialValue796);
        recovery$indy$flow$2404(this, initialValue802);
        java.lang.Object initialValue803 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnFirstHit));
        client.setting.RangeSetting initialized804 = new client.setting.RangeSetting(constructorPart23, this, "SmartDCPSFirstHit", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue803));
        java.lang.String initialValue805 = "DoubleClicksPerSecondFirstHit";
        long initialValue806 = constructorKey28;
        client.setting.RangeSetting initialValue807 = initialized804;
        java.lang.Object initialValue808 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue807))))));
        java.lang.Object initialValue809 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue805))))));
        java.lang.Object initialValue810 = recovery$indy$flow$2410(initialValue808, initialValue806, initialValue809);
        java.lang.Object initialValue811 = recovery$indy$flow$2411(this);
        long initialValue812 = constructorKey34;
        java.lang.Object initialValue813 = initialValue811;
        int initialValue814 = constructorPart33;
        java.lang.Object initialValue815 = initialValue810;
        java.lang.Object initialValue816 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue815))))));
        java.lang.Object initialValue817 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue813))))));
        java.lang.Object initialValue818 = recovery$indy$flow$2414(initialValue816, initialValue814, initialValue817, initialValue812);
        recovery$indy$flow$2415(this, initialValue818);
        java.lang.Object initialValue819 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnFirstHit));
        client.setting.RangeSetting initialized820 = new client.setting.RangeSetting(constructorPart23, this, "SmartDCPSFirstHitRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue819));
        java.lang.String initialValue821 = "DCPSFirstHitRecalculateTickDelay";
        long initialValue822 = constructorKey28;
        client.setting.RangeSetting initialValue823 = initialized820;
        java.lang.Object initialValue824 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue823))))));
        java.lang.Object initialValue825 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue821))))));
        java.lang.Object initialValue826 = recovery$indy$flow$2421(initialValue824, initialValue822, initialValue825);
        long initialValue827 = constructorKey6;
        java.lang.Object initialValue828 = initialValue826;
        java.lang.Object initialValue829 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue828))))));
        java.lang.Object initialValue830 = recovery$indy$flow$2423(initialValue829, initialValue827);
        java.lang.Object initialValue831 = recovery$indy$flow$2424(this);
        long initialValue832 = constructorKey34;
        java.lang.Object initialValue833 = initialValue831;
        int initialValue834 = constructorPart33;
        java.lang.Object initialValue835 = initialValue830;
        java.lang.Object initialValue836 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue835))))));
        java.lang.Object initialValue837 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue833))))));
        java.lang.Object initialValue838 = recovery$indy$flow$2427(initialValue836, initialValue834, initialValue837, initialValue832);
        recovery$indy$flow$2428(this, initialValue838);
        java.lang.Object initialValue839 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingCPSSettings));
        char converted840 = (char) (constructorPart20);
        client.setting.SettingGroup initialized841 = new client.setting.SettingGroup(this, "On Target", true, constructorKey19, converted840, (client.setting.SettingGroup) (initialValue839));
        java.lang.Object initialValue842 = recovery$indy$flow$2432(this);
        char converted843 = (char) (constructorPart42);
        java.lang.Object initialValue844 = initialValue842;
        int initialValue845 = constructorPart43;
        int initialValue846 = (int) (converted843);
        int initialValue847 = constructorPart41;
        client.setting.SettingGroup initialValue848 = initialized841;
        java.lang.Object initialValue849 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue848))))));
        java.lang.Object initialValue850 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue844))))));
        java.lang.Object initialValue851 = recovery$indy$flow$2435(initialValue849, initialValue847, (char) (initialValue846), initialValue845, initialValue850);
        recovery$indy$flow$2436(this, initialValue851);
        java.lang.Object initialValue852 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnTarget));
        client.setting.RangeSetting initialized853 = new client.setting.RangeSetting(constructorPart23, this, "SmartCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626041242239631360L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue852));
        java.lang.String initialValue854 = "CPS";
        long initialValue855 = constructorKey28;
        client.setting.RangeSetting initialValue856 = initialized853;
        java.lang.Object initialValue857 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue856))))));
        java.lang.Object initialValue858 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue854))))));
        java.lang.Object initialValue859 = recovery$indy$flow$2442(initialValue857, initialValue855, initialValue858);
        java.lang.Object initialValue860 = recovery$indy$flow$2443(this);
        long initialValue861 = constructorKey34;
        java.lang.Object initialValue862 = initialValue860;
        int initialValue863 = constructorPart33;
        java.lang.Object initialValue864 = initialValue859;
        java.lang.Object initialValue865 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue864))))));
        java.lang.Object initialValue866 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue862))))));
        java.lang.Object initialValue867 = recovery$indy$flow$2446(initialValue865, initialValue863, initialValue866, initialValue861);
        recovery$indy$flow$2447(this, initialValue867);
        java.lang.Object initialValue868 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnTarget));
        client.setting.RangeSetting initialized869 = new client.setting.RangeSetting(constructorPart23, this, "CPSRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue868));
        long initialValue870 = constructorKey6;
        client.setting.RangeSetting initialValue871 = initialized869;
        java.lang.Object initialValue872 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue871))))));
        java.lang.Object initialValue873 = recovery$indy$flow$2452(initialValue872, initialValue870);
        java.lang.Object initialValue874 = recovery$indy$flow$2453(this);
        long initialValue875 = constructorKey34;
        java.lang.Object initialValue876 = initialValue874;
        int initialValue877 = constructorPart33;
        java.lang.Object initialValue878 = initialValue873;
        java.lang.Object initialValue879 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue878))))));
        java.lang.Object initialValue880 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue876))))));
        java.lang.Object initialValue881 = recovery$indy$flow$2456(initialValue879, initialValue877, initialValue880, initialValue875);
        recovery$indy$flow$2457(this, initialValue881);
        java.lang.Object initialValue882 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnTarget));
        client.setting.RangeSetting initialized883 = new client.setting.RangeSetting(constructorPart23, this, "SmartDCPS", constructorPart24, constructorPart25, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue882));
        java.lang.String initialValue884 = "DoubleClicksPerSecond";
        long initialValue885 = constructorKey28;
        client.setting.RangeSetting initialValue886 = initialized883;
        java.lang.Object initialValue887 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue886))))));
        java.lang.Object initialValue888 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue884))))));
        java.lang.Object initialValue889 = recovery$indy$flow$2463(initialValue887, initialValue885, initialValue888);
        java.lang.Object initialValue890 = recovery$indy$flow$2464(this);
        long initialValue891 = constructorKey34;
        java.lang.Object initialValue892 = initialValue890;
        int initialValue893 = constructorPart33;
        java.lang.Object initialValue894 = initialValue889;
        java.lang.Object initialValue895 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue894))))));
        java.lang.Object initialValue896 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue892))))));
        java.lang.Object initialValue897 = recovery$indy$flow$2467(initialValue895, initialValue893, initialValue896, initialValue891);
        recovery$indy$flow$2468(this, initialValue897);
        java.lang.Object initialValue898 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingOnTarget));
        client.setting.RangeSetting initialized899 = new client.setting.RangeSetting(constructorPart23, this, "DCPSRecalculateTickDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), 1.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue898));
        long initialValue900 = constructorKey6;
        client.setting.RangeSetting initialValue901 = initialized899;
        java.lang.Object initialValue902 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue901))))));
        java.lang.Object initialValue903 = recovery$indy$flow$2473(initialValue902, initialValue900);
        java.lang.Object initialValue904 = recovery$indy$flow$2474(this);
        long initialValue905 = constructorKey34;
        java.lang.Object initialValue906 = initialValue904;
        int initialValue907 = constructorPart33;
        java.lang.Object initialValue908 = initialValue903;
        java.lang.Object initialValue909 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue908))))));
        java.lang.Object initialValue910 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue906))))));
        java.lang.Object initialValue911 = recovery$indy$flow$2477(initialValue909, initialValue907, initialValue910, initialValue905);
        recovery$indy$flow$2478(this, initialValue911);
        java.lang.Object initialValue912 = recovery$indy$flow$2480(2);
        ((java.lang.Object[]) initialValue912)[0] = "Always";
        ((java.lang.Object[]) initialValue912)[1] = "Other";
        client.setting.ModeSetting initialized913 = new client.setting.ModeSetting(this, "Timing", constructorKey37, "Always", (java.lang.String[]) (initialValue912));
        recovery$indy$flow$2482(this, initialized913);
        client.setting.SettingGroup initialized914 = new client.setting.SettingGroup(this, "TimingValues", true, constructorKey21);
        java.lang.Object initialValue915 = recovery$indy$flow$2485(this);
        char converted916 = (char) (constructorPart42);
        java.lang.Object initialValue917 = initialValue915;
        int initialValue918 = constructorPart43;
        int initialValue919 = (int) (converted916);
        int initialValue920 = constructorPart41;
        client.setting.SettingGroup initialValue921 = initialized914;
        java.lang.Object initialValue922 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue921))))));
        java.lang.Object initialValue923 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue917))))));
        java.lang.Object initialValue924 = recovery$indy$flow$2488(initialValue922, initialValue920, (char) (initialValue919), initialValue918, initialValue923);
        recovery$indy$flow$2489(this, initialValue924);
        java.lang.Object initialValue925 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingTimingValues));
        client.setting.RangeSetting initialized926 = new client.setting.RangeSetting(constructorPart23, this, "Prediction", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4617315517961601024L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue925));
        long initialValue927 = constructorKey6;
        client.setting.RangeSetting initialValue928 = initialized926;
        java.lang.Object initialValue929 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue928))))));
        java.lang.Object initialValue930 = recovery$indy$flow$2494(initialValue929, initialValue927);
        java.lang.Object initialValue931 = recovery$indy$flow$2495(this);
        long initialValue932 = constructorKey34;
        java.lang.Object initialValue933 = initialValue931;
        int initialValue934 = constructorPart33;
        java.lang.Object initialValue935 = initialValue930;
        java.lang.Object initialValue936 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue935))))));
        java.lang.Object initialValue937 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue933))))));
        java.lang.Object initialValue938 = recovery$indy$flow$2498(initialValue936, initialValue934, initialValue937, initialValue932);
        recovery$indy$flow$2499(this, initialValue938);
        java.lang.Object initialValue939 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingTimingValues));
        client.setting.RangeSetting initialized940 = new client.setting.RangeSetting(constructorPart23, this, "LoseDelay", constructorPart24, constructorPart25, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4617315517961601024L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue939));
        long initialValue941 = constructorKey6;
        client.setting.RangeSetting initialValue942 = initialized940;
        java.lang.Object initialValue943 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue942))))));
        java.lang.Object initialValue944 = recovery$indy$flow$2504(initialValue943, initialValue941);
        java.lang.Object initialValue945 = recovery$indy$flow$2505(this);
        long initialValue946 = constructorKey34;
        java.lang.Object initialValue947 = initialValue945;
        int initialValue948 = constructorPart33;
        java.lang.Object initialValue949 = initialValue944;
        java.lang.Object initialValue950 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue949))))));
        java.lang.Object initialValue951 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue947))))));
        java.lang.Object initialValue952 = recovery$indy$flow$2508(initialValue950, initialValue948, initialValue951, initialValue946);
        recovery$indy$flow$2509(this, initialValue952);
        java.lang.Object initialValue953 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingTimingValues));
        client.setting.RangeSetting initialized954 = new client.setting.RangeSetting(constructorPart23, this, "Endurance", constructorPart24, constructorPart25, Double.longBitsToDouble(4636033603912859648L), Double.longBitsToDouble(4637440978796412928L), 1.0D, Double.longBitsToDouble(4645744490609377280L), 0, (client.setting.SettingGroup) (initialValue953));
        long initialValue955 = constructorKey6;
        client.setting.RangeSetting initialValue956 = initialized954;
        java.lang.Object initialValue957 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue956))))));
        java.lang.Object initialValue958 = recovery$indy$flow$2514(initialValue957, initialValue955);
        java.lang.Object initialValue959 = recovery$indy$flow$2515(this);
        long initialValue960 = constructorKey34;
        java.lang.Object initialValue961 = initialValue959;
        int initialValue962 = constructorPart33;
        java.lang.Object initialValue963 = initialValue958;
        java.lang.Object initialValue964 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue963))))));
        java.lang.Object initialValue965 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue961))))));
        java.lang.Object initialValue966 = recovery$indy$flow$2518(initialValue964, initialValue962, initialValue965, initialValue960);
        recovery$indy$flow$2519(this, initialValue966);
        java.lang.Object initialValue967 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingTimingValues));
        client.setting.RangeSetting initialized968 = new client.setting.RangeSetting(constructorPart23, this, "EnduranceReduction", constructorPart24, constructorPart25, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), 1.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue967));
        long initialValue969 = constructorKey6;
        client.setting.RangeSetting initialValue970 = initialized968;
        java.lang.Object initialValue971 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue970))))));
        java.lang.Object initialValue972 = recovery$indy$flow$2524(initialValue971, initialValue969);
        java.lang.Object initialValue973 = recovery$indy$flow$2525(this);
        long initialValue974 = constructorKey34;
        java.lang.Object initialValue975 = initialValue973;
        int initialValue976 = constructorPart33;
        java.lang.Object initialValue977 = initialValue972;
        java.lang.Object initialValue978 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue977))))));
        java.lang.Object initialValue979 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue975))))));
        java.lang.Object initialValue980 = recovery$indy$flow$2528(initialValue978, initialValue976, initialValue979, initialValue974);
        recovery$indy$flow$2529(this, initialValue980);
        short converted981 = (short) (constructorPart14);
        short converted982 = (short) (constructorPart15);
        client.setting.RangeSetting initialized983 = new client.setting.RangeSetting(constructorPart13, this, "DelayClicksAfterClosingGuiScreen", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4617315517961601024L), converted981, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted982);
        long initialValue984 = constructorKey6;
        client.setting.RangeSetting initialValue985 = initialized983;
        java.lang.Object initialValue986 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue985))))));
        java.lang.Object initialValue987 = recovery$indy$flow$2533(initialValue986, initialValue984);
        recovery$indy$flow$2534(this, initialValue987);
        client.setting.BooleanSetting initialized988 = new client.setting.BooleanSetting(this, constructorKey8, "ReduceCPSIfYouCanNotHitATargett", false);
        long initialValue989 = constructorKey7;
        java.lang.String initialValue990 = "ReduceCPSIfYouCanNotHitATarget";
        client.setting.BooleanSetting initialValue991 = initialized988;
        java.lang.Object initialValue992 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue991))))));
        java.lang.Object initialValue993 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue990))))));
        java.lang.Object initialValue994 = recovery$indy$flow$2539(initialValue992, initialValue993, initialValue989);
        java.lang.Object initialValue995 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue994))))));
        recovery$indy$flow$2541(this, initialValue995);
        client.setting.BooleanSetting initialized996 = new client.setting.BooleanSetting(this, constructorKey8, "CritFix", true);
        recovery$indy$flow$2544(this, initialized996);
        client.setting.BooleanSetting initialized997 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnTarget", false);
        recovery$indy$flow$2547(this, initialized997);
        client.setting.BooleanSetting initialized998 = new client.setting.BooleanSetting(this, constructorKey8, "PerfectHit", false);
        recovery$indy$flow$2550(this, initialized998);
        client.setting.BooleanSetting initialized999 = new client.setting.BooleanSetting(this, constructorKey8, "AttackFriends", false);
        recovery$indy$flow$2553(this, initialized999);
        client.setting.BooleanSetting initialized1000 = new client.setting.BooleanSetting(this, constructorKey8, "LongClick", false);
        java.lang.Object initialValue1001 = recovery$indy$flow$2556(this);
        java.lang.Object initialValue1002 = initialValue1001;
        long initialValue1003 = constructorKey4;
        client.setting.BooleanSetting initialValue1004 = initialized1000;
        java.lang.Object initialValue1005 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue1004))))));
        java.lang.Object initialValue1006 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue1002))))));
        java.lang.Object initialValue1007 = recovery$indy$flow$2559(initialValue1005, initialValue1003, initialValue1006);
        java.lang.Object initialValue1008 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue1007))))));
        recovery$indy$flow$2561(this, initialValue1008);
        client.setting.BooleanSetting initialized1009 = new client.setting.BooleanSetting(this, constructorKey8, "BreakBlocks", false);
        recovery$indy$flow$2564(this, initialized1009);
        client.setting.NumberSetting initialized1010 = new client.setting.NumberSetting(this, "BreakTickDelay", Double.longBitsToDouble(4617315517961601024L), constructorKey44, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        java.lang.Object initialValue1011 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingBreakBlocks));
        java.lang.Object initialValue1012 = recovery$indy$flow$2568(initialValue1011);
        java.lang.Object initialValue1013 = recovery$indy$flow$2569(initialValue1011);
        java.lang.Object initialValue1014 = initialValue1013;
        client.setting.NumberSetting initialValue1015 = initialized1010;
        java.lang.Object initialValue1016 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue1015))))));
        java.lang.Object initialValue1017 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue1014))))));
        java.lang.Object initialValue1018 = recovery$indy$flow$2572(initialValue1016, initialValue1017);
        recovery$indy$flow$2573(this, initialValue1018);
        client.setting.BooleanSetting initialized1019 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnClick", true);
        recovery$indy$flow$2576(this, initialized1019);
        char converted1020 = (char) (constructorPart10);
        net.C_47Tf initialized1021 = new net.C_47Tf(constructorPart9, converted1020, this, constructorPart11);
        recovery$indy$flow$2579(this, initialized1021);
        recovery$indy$flow$2580(this, 0L);
        recovery$indy$flow$2581(this, 0L);
        recovery$indy$flow$2582(this, 0L);
        recovery$indy$flow$2583(this, false);
        recovery$indy$flow$2584(this, 0);
        recovery$indy$flow$2585(this, null);
        java.util.ArrayList initialized1022 = new java.util.ArrayList();
        recovery$indy$flow$2588(this, initialized1022);
        recovery$indy$flow$2589(this, null);
        java.lang.Object initialValue1023 = recovery$indy$flow$2590(22);
        recovery$indy$flow$2591(this, initialValue1023);
        java.lang.Object initialValue1024 = recovery$indy$flow$2592(28);
        recovery$indy$flow$2593(this, initialValue1024);
        java.lang.Object initialValue1025 = recovery$indy$flow$2594(44);
        recovery$indy$flow$2595(this, initialValue1025);
        net.C_473X initialized1026 = new net.C_473X();
        recovery$indy$flow$2598(this, initialized1026);
        net.C_473X initialized1027 = new net.C_473X();
        recovery$indy$flow$2601(this, initialized1027);
        net.C_473X initialized1028 = new net.C_473X();
        recovery$indy$flow$2604(this, initialized1028);
        net.C_473X initialized1029 = new net.C_473X();
        recovery$indy$flow$2607(this, initialized1029);
        net.C_473X initialized1030 = new net.C_473X();
        recovery$indy$flow$2610(this, initialized1030);
        net.C_473X initialized1031 = new net.C_473X();
        recovery$indy$flow$2613(this, initialized1031);
        net.C_473X initialized1032 = new net.C_473X();
        recovery$indy$flow$2616(this, initialized1032);
        net.C_473X initialized1033 = new net.C_473X();
        recovery$indy$flow$2619(this, initialized1033);
        net.C_474k initialized1034 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2622(this, initialized1034);
        net.C_474k initialized1035 = new net.C_474k(20, Double.longBitsToDouble(4617315517961601024L));
        recovery$indy$flow$2625(this, initialized1035);
        net.C_47UR initialized1036 = new net.C_47UR(60);
        recovery$indy$flow$2628(this, initialized1036);
        net.C_47cu initialized1037 = new net.C_47cu();
        recovery$indy$flow$2631(this, initialized1037);
        net.C_47cu initialized1038 = new net.C_47cu();
        recovery$indy$flow$2634(this, initialized1038);
        net.C_47cu initialized1039 = new net.C_47cu();
        recovery$indy$flow$2637(this, initialized1039);
        net.C_47cu initialized1040 = new net.C_47cu();
        recovery$indy$flow$2640(this, initialized1040);
        net.C_47cu initialized1041 = new net.C_47cu();
        recovery$indy$flow$2643(this, initialized1041);
        net.C_474k initialized1042 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2646(this, initialized1042);
        net.C_474k initialized1043 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2649(this, initialized1043);
        java.util.ArrayList initialized1044 = new java.util.ArrayList();
        recovery$indy$flow$2652(this, initialized1044);
        net.C_47ej initialized1045 = new net.C_47ej();
        recovery$indy$flow$2655(this, initialized1045);
        net.C_473X initialized1046 = new net.C_473X();
        recovery$indy$flow$2658(this, initialized1046);
        recovery$indy$flow$2659(this, 0);
        recovery$indy$flow$2660(this, 0);
        recovery$indy$flow$2661(this, 0);
        recovery$indy$flow$2662(this, false);
        recovery$indy$flow$2663(this, false);
        recovery$indy$flow$2664(this, false);
        recovery$indy$flow$2665(this, 2000L);
        recovery$indy$flow$2666(this, 2000L);
        recovery$indy$flow$2667(this, 0L);
        recovery$indy$flow$2668(this, 0);
        recovery$indy$flow$2669(this, 0L);
        int[] values1047 = new int[2];
        recovery$indy$flow$2670(this, values1047);
        float[] values1048 = new float[2];
        recovery$indy$flow$2671(this, values1048);
        double[] values1049 = new double[2];
        recovery$indy$flow$2672(this, values1049);
        int[] values1050 = new int[2];
        recovery$indy$flow$2673(this, values1050);
        recovery$indy$flow$2674(this, false);
        recovery$indy$flow$2675(this, 0);
        recovery$indy$flow$2676(this, false);
        recovery$indy$flow$2677(this, false);
        recovery$indy$flow$2678(this, false);
        net.C_47cu initialized1051 = new net.C_47cu();
        recovery$indy$flow$2681(this, initialized1051);
        java.lang.Object initialValue1052 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(this)))).settingClickPattern));
        java.lang.Object initialValue1053 = recovery$indy$flow$2683(this);
        java.lang.Object initialValue1054 = initialValue1053;
        java.lang.Object initialValue1055 = initialValue1052;
        java.lang.Object initialValue1056 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue1055))))));
        java.lang.Object initialValue1057 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue1054))))));
        java.lang.Object initialValue1058 = recovery$indy$flow$2686(initialValue1056, initialValue1057);
        long initialValue1059 = constructorKey36;
        AutoClicker_47Cn initialValue1060 = this;
        java.lang.Object initialValue1061 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoClicker_47Cn) (((java.lang.Object)(initialValue1060))))));
        recovery$indy$flow$2688(initialValue1061, initialValue1059);
        java.lang.Object initialValue1062 = recovery$indy$flow$2689();
        if (initialValue1062 == null) {
            return;
        } else {
            if (constructorPart2 < 0) {
                recovery$indy$flow$2690((initialValue49 != 0));
                return;
            } else {
                if (initialValue49 == 0) {
                    recovery$indy$flow$2690(true);
                    return;
                } else {
                    recovery$indy$flow$2690(false);
                    return;
                }
            }
        }
    }
































    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$34(int a0,long a1);
    private static long recovery$indy$flow$491() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.a;
    }


    private static native java.lang.Object recovery$indy$flow$494(java.lang.Object a0,long a1);
    private static native boolean recovery$indy$flow$495();
    private static int recovery$indy$flow$496(java.lang.Object a0) {
        return ((java.lang.String) (a0)).hashCode();
    }
    private static boolean recovery$indy$flow$497(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$498(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$499(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$500(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$501(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$502(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$503() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static int recovery$indy$flow$507(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }



    private static native int recovery$indy$flow$511(java.lang.Object a0);

    private static native boolean recovery$indy$flow$513(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$516(java.lang.Object a0);


    private static native double recovery$indy$flow$519(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$522(java.lang.Object a0,short a1,char a2,int a3);



    private static native double recovery$indy$flow$526(java.lang.Object a0,long a1);


    private static native int recovery$indy$flow$529(java.lang.Object a0);
    private static native int recovery$indy$flow$530(java.lang.Object a0,int a1,double a2,long a3,double a4,long a5,long a6);
    private static java.lang.Object recovery$indy$flow$531() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$534(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$536() {
        return net.C_47Az.ENTITY;
    }



    private static native int recovery$indy$flow$540(java.lang.Object a0);

    private static native boolean recovery$indy$flow$542(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$545(java.lang.Object a0);


    private static native double recovery$indy$flow$548(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$551(java.lang.Object a0,short a1,char a2,int a3);



    private static native int recovery$indy$flow$555(java.lang.Object a0);

    private static native int recovery$indy$flow$557(java.lang.Object a0,int a1,long a2);


    private static native boolean recovery$indy$flow$560(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$561() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static java.lang.Object recovery$indy$flow$564() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$567(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$568() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static float recovery$indy$flow$571(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48R;
    }
    private static java.lang.Object recovery$indy$flow$572() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static boolean recovery$indy$flow$575(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48M;
    }
    private static java.lang.Object recovery$indy$flow$576() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static native boolean recovery$indy$flow$579(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$580() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static native boolean recovery$indy$flow$583(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$584() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static java.lang.Object recovery$indy$flow$587() {
        return net.C_47oY.field_463;
    }
    private static native boolean recovery$indy$flow$588(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$589() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static java.lang.Object recovery$indy$flow$593() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static boolean recovery$indy$flow$597(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }
    private static boolean recovery$indy$flow$598(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_480;
    }

    private static java.lang.Object recovery$indy$flow$600(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$601(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static int recovery$indy$flow$603(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$605(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }



    private static native int recovery$indy$flow$609(java.lang.Object a0);

    private static native boolean recovery$indy$flow$611(java.lang.Object a0,long a1,long a2);


    private static native double recovery$indy$flow$614(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$617(java.lang.Object a0);


    private static native void recovery$indy$flow$620(java.lang.Object a0);


    private static native int recovery$indy$flow$623(java.lang.Object a0);


    private static native boolean recovery$indy$flow$626(java.lang.Object a0);


    private static native double recovery$indy$flow$629(java.lang.Object a0,long a1);

    private static long recovery$indy$flow$631(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44i;
    }

    private static native boolean recovery$indy$flow$633(java.lang.Object a0,long a1,long a2);


    private static native int recovery$indy$flow$636(java.lang.Object a0);


    private static native double recovery$indy$flow$639(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$640(double a0) {
        return java.lang.Math.round(a0);
    }

    private static long recovery$indy$flow$642(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44i;
    }
    private static java.lang.Object recovery$indy$flow$643() {
        return net.C_476q.field_48;
    }


    private static native double recovery$indy$flow$646(java.lang.Object a0,char a1,int a2,int a3);


    private static native double recovery$indy$flow$649(java.lang.Object a0,long a1);

    private static native int recovery$indy$flow$651(java.lang.Object a0,int a1,int a2,long a3);

    private static native boolean recovery$indy$flow$653(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$654() {
        return net.C_476q.field_48;
    }
    private static int recovery$indy$flow$655(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }

    private static native int recovery$indy$flow$657(java.lang.Object a0,int a1,int a2,long a3);
    private static void recovery$indy$flow$658(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44i = a1;
        return;
    }


    private static native void recovery$indy$flow$661(java.lang.Object a0);


    private static native boolean recovery$indy$flow$664(java.lang.Object a0);


    private static native double recovery$indy$flow$667(java.lang.Object a0,long a1);

    private static long recovery$indy$flow$669(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44N;
    }

    private static native boolean recovery$indy$flow$671(java.lang.Object a0,long a1,long a2);


    private static native int recovery$indy$flow$674(java.lang.Object a0);


    private static native double recovery$indy$flow$677(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$678(double a0) {
        return java.lang.Math.round(a0);
    }

    private static long recovery$indy$flow$680(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44N;
    }
    private static java.lang.Object recovery$indy$flow$681() {
        return net.C_476q.field_48;
    }


    private static native double recovery$indy$flow$684(java.lang.Object a0,char a1,int a2,int a3);


    private static native double recovery$indy$flow$687(java.lang.Object a0,long a1);

    private static native int recovery$indy$flow$689(java.lang.Object a0,int a1,int a2,long a3);

    private static native boolean recovery$indy$flow$691(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$692() {
        return net.C_476q.field_48;
    }
    private static int recovery$indy$flow$693(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }

    private static native int recovery$indy$flow$695(java.lang.Object a0,int a1,int a2,long a3);
    private static void recovery$indy$flow$696(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44N = a1;
        return;
    }


    private static native void recovery$indy$flow$699(java.lang.Object a0);


    private static native boolean recovery$indy$flow$702(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$703() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static java.lang.Object recovery$indy$flow$706() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static java.lang.Object recovery$indy$flow$710() {
        return net.C_47Az.MISS;
    }



    private static native int recovery$indy$flow$714(java.lang.Object a0);

    private static native boolean recovery$indy$flow$716(java.lang.Object a0,long a1,long a2);


    private static native double recovery$indy$flow$719(java.lang.Object a0);


    private static native double recovery$indy$flow$722(java.lang.Object a0);


    private static native void recovery$indy$flow$725(java.lang.Object a0);


    private static native int recovery$indy$flow$728(java.lang.Object a0);


    private static native double recovery$indy$flow$731(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$732(double a0) {
        return java.lang.Math.round(a0);
    }


    private static native boolean recovery$indy$flow$735(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$736() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static java.lang.Object recovery$indy$flow$739() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static java.lang.Object recovery$indy$flow$743() {
        return net.C_47Az.BLOCK;
    }



    private static native int recovery$indy$flow$747(java.lang.Object a0);

    private static native boolean recovery$indy$flow$749(java.lang.Object a0,long a1,long a2);


    private static native double recovery$indy$flow$752(java.lang.Object a0);


    private static native double recovery$indy$flow$755(java.lang.Object a0);


    private static native void recovery$indy$flow$758(java.lang.Object a0);


    private static native int recovery$indy$flow$761(java.lang.Object a0);


    private static native double recovery$indy$flow$764(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$765(double a0) {
        return java.lang.Math.round(a0);
    }
    private static java.lang.Object recovery$indy$flow$766() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$769(java.lang.Object a0,long a1);


    private static int recovery$indy$flow$772(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static native java.lang.Object recovery$indy$flow$773();

    private static native int recovery$indy$flow$775(java.lang.Object a0);

    private static native boolean recovery$indy$flow$777(java.lang.Object a0);


    private static native int recovery$indy$flow$780(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$782(java.lang.Object a0,int a1,long a2);


    private static native double recovery$indy$flow$785(java.lang.Object a0,char a1,int a2,int a3);


    private static native double recovery$indy$flow$788(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$789() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$790(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static double recovery$indy$flow$793(java.lang.Object a0) {
        return ((java.security.SecureRandom) (a0)).nextGaussian();
    }
    private static java.lang.Object recovery$indy$flow$794() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }


    private static java.lang.Object recovery$indy$flow$797() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static java.lang.Object recovery$indy$flow$801() {
        return net.C_47Az.ENTITY;
    }


    private static native double recovery$indy$flow$804(java.lang.Object a0,long a1);
    private static long recovery$indy$flow$805(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static long recovery$indy$flow$806(long a0,long a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static void recovery$indy$flow$807(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r = a1;
        return;
    }


    private static native boolean recovery$indy$flow$810(java.lang.Object a0);

    private static native int recovery$indy$flow$812(java.lang.Object a0,int a1,long a2);



    private static native java.lang.Object recovery$indy$flow$816(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$817(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static long recovery$indy$flow$818(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_47;
    }
    private static long recovery$indy$flow$819(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static native java.lang.Object recovery$indy$flow$820(java.lang.Object a0,long a1,long a2,long a3);

    private static native java.lang.Object recovery$indy$flow$822(java.lang.Object a0);

    private static int recovery$indy$flow$824(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static long recovery$indy$flow$825(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static void recovery$indy$flow$826(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c = a1;
        return;
    }
    private static long recovery$indy$flow$827(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c;
    }

    private static native java.lang.Object recovery$indy$flow$829(java.lang.Object a0);

    private static int recovery$indy$flow$831(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static void recovery$indy$flow$832(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c = a1;
        return;
    }
    private static long recovery$indy$flow$833(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static void recovery$indy$flow$834(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r = a1;
        return;
    }
    private static long recovery$indy$flow$835(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c;
    }
    private static long recovery$indy$flow$836(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_47;
    }
    private static void recovery$indy$flow$837(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }
    private static long recovery$indy$flow$838(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_47;
    }
    private static void recovery$indy$flow$839(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_47 = a1;
        return;
    }
    private static long recovery$indy$flow$840() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$841(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static native java.lang.Object recovery$indy$flow$842(java.lang.Object a0,long a1,long a2,long a3);

    private static native java.lang.Object recovery$indy$flow$844(java.lang.Object a0);

    private static int recovery$indy$flow$846(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static long recovery$indy$flow$847(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static void recovery$indy$flow$848(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c = a1;
        return;
    }
    private static long recovery$indy$flow$849(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c;
    }

    private static native java.lang.Object recovery$indy$flow$851(java.lang.Object a0);

    private static int recovery$indy$flow$853(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static void recovery$indy$flow$854(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c = a1;
        return;
    }
    private static long recovery$indy$flow$855(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r;
    }
    private static void recovery$indy$flow$856(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r = a1;
        return;
    }
    private static long recovery$indy$flow$857(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c;
    }
    private static void recovery$indy$flow$858(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }


    private static native void recovery$indy$flow$861(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$864(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$867(float a0,float a1,int a2,int a3,byte a4,float a5,float a6);
    private static void recovery$indy$flow$868(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44R = ((int[]) (a1));
        return;
    }



    private static native int recovery$indy$flow$872(java.lang.Object a0,int a1,long a2);
    private static java.lang.Object recovery$indy$flow$873() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$876(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$877(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }



    private static native int recovery$indy$flow$881(java.lang.Object a0);

    private static native boolean recovery$indy$flow$883(java.lang.Object a0,long a1,int a2);


    private static native double recovery$indy$flow$886(java.lang.Object a0);


    private static native double recovery$indy$flow$889(java.lang.Object a0);


    private static native void recovery$indy$flow$892(java.lang.Object a0);



    private static native int recovery$indy$flow$896(java.lang.Object a0);


    private static native double recovery$indy$flow$899(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$902(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$905(java.lang.Object a0);


    private static native boolean recovery$indy$flow$908(java.lang.Object a0);


    private static native boolean recovery$indy$flow$911(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$913(java.lang.Object a0,int a1,double a2,double a3,boolean a4,boolean a5,long a6,double a7);

    private static native java.lang.Object recovery$indy$flow$915(java.lang.Object a0);

    private static int recovery$indy$flow$917(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }

    private static native java.lang.Object recovery$indy$flow$919(java.lang.Object a0);

    private static boolean recovery$indy$flow$921(java.lang.Object a0) {
        return ((java.lang.Boolean) (a0)).booleanValue();
    }
    private static void recovery$indy$flow$922(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }

    private static native int recovery$indy$flow$924(java.lang.Object a0,int a1,long a2);
    private static java.lang.Object recovery$indy$flow$925() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$928(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$929(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$930() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }



    private static java.lang.Object recovery$indy$flow$934() {
        return net.C_47Az.ENTITY;
    }

    private static boolean recovery$indy$flow$936(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }

    private static native void recovery$indy$flow$938(java.lang.Object a0,long a1,char a2);

    private static int recovery$indy$flow$940(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static java.lang.Object recovery$indy$flow$941() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$944(java.lang.Object a0,long a1);
    private static int recovery$indy$flow$945(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43p;
    }

    private static native java.lang.Object recovery$indy$flow$947(java.lang.Object a0,short a1,int a2,short a3,int a4);

    private static native int recovery$indy$flow$949(java.lang.Object a0,long a1,int a2);

    private static native int recovery$indy$flow$951(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$953(java.lang.Object a0,int a1,long a2);

    private static native java.lang.Object recovery$indy$flow$955(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$957(java.lang.Object a0,long a1,int a2);

    private static native int recovery$indy$flow$959(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$961(java.lang.Object a0,int a1,long a2);



    private static native int recovery$indy$flow$965(java.lang.Object a0);

    private static native boolean recovery$indy$flow$967(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$970(java.lang.Object a0);


    private static native double recovery$indy$flow$973(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$976(java.lang.Object a0,short a1,char a2,int a3);



    private static native int recovery$indy$flow$980(java.lang.Object a0);

    private static native boolean recovery$indy$flow$982(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$985(java.lang.Object a0);


    private static native double recovery$indy$flow$988(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$991(java.lang.Object a0,short a1,char a2,int a3);

    private static native java.lang.Object recovery$indy$flow$993(java.lang.Object a0,short a1,int a2,short a3,int a4);


    private static native int recovery$indy$flow$996(java.lang.Object a0);

    private static native int recovery$indy$flow$998(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$1000(java.lang.Object a0,int a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1002(java.lang.Object a0,int a1,long a2);


    private static native java.lang.Object recovery$indy$flow$1005(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$1006(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native int recovery$indy$flow$1009(java.lang.Object a0);


    private static native int recovery$indy$flow$1012(java.lang.Object a0);

    private static native int recovery$indy$flow$1014(java.lang.Object a0,int a1,long a2);

    private static native int recovery$indy$flow$1016(java.lang.Object a0,int a1,long a2);
    private static int recovery$indy$flow$1017(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_437;
    }
    private static void recovery$indy$flow$1018(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$1019(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_437 = a1;
        return;
    }

    private static java.lang.Object recovery$indy$flow$1021() {
        return net.C_47Az.MISS;
    }



    private static native int recovery$indy$flow$1025(java.lang.Object a0);

    private static native boolean recovery$indy$flow$1027(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$1030(java.lang.Object a0);


    private static native double recovery$indy$flow$1033(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$1036(java.lang.Object a0,short a1,char a2,int a3);



    private static native int recovery$indy$flow$1040(java.lang.Object a0);

    private static native boolean recovery$indy$flow$1042(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$1045(java.lang.Object a0);


    private static native double recovery$indy$flow$1048(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$1051(java.lang.Object a0,short a1,char a2,int a3);

    private static native java.lang.Object recovery$indy$flow$1053(java.lang.Object a0,short a1,int a2,short a3,int a4);


    private static native int recovery$indy$flow$1056(java.lang.Object a0);

    private static native int recovery$indy$flow$1058(java.lang.Object a0,int a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1060(java.lang.Object a0,int a1,long a2);


    private static native int recovery$indy$flow$1063(java.lang.Object a0);

    private static native int recovery$indy$flow$1065(java.lang.Object a0,int a1,long a2);



    private static native int recovery$indy$flow$1069(java.lang.Object a0);

    private static native boolean recovery$indy$flow$1071(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$1074(java.lang.Object a0);


    private static native double recovery$indy$flow$1077(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$1080(java.lang.Object a0,short a1,char a2,int a3);



    private static native int recovery$indy$flow$1084(java.lang.Object a0);

    private static native boolean recovery$indy$flow$1086(java.lang.Object a0,long a1,int a2);


    private static native void recovery$indy$flow$1089(java.lang.Object a0);


    private static native double recovery$indy$flow$1092(java.lang.Object a0,short a1,char a2,int a3);


    private static native double recovery$indy$flow$1095(java.lang.Object a0,short a1,char a2,int a3);

    private static native java.lang.Object recovery$indy$flow$1097(java.lang.Object a0,short a1,int a2,short a3,int a4);


    private static native int recovery$indy$flow$1100(java.lang.Object a0);

    private static native int recovery$indy$flow$1102(java.lang.Object a0,int a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1104(java.lang.Object a0,int a1,long a2);


    private static native int recovery$indy$flow$1107(java.lang.Object a0);

    private static native int recovery$indy$flow$1109(java.lang.Object a0,int a1,long a2);


    private static int recovery$indy$flow$1112(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static void recovery$indy$flow$1113(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43p = a1;
        return;
    }
    private static long recovery$indy$flow$1119() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.a;
    }
    private static native boolean recovery$indy$flow$1120(long a0,long a1);


    private static int recovery$indy$flow$1123(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static void recovery$indy$flow$1124(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_480 = a1;
        return;
    }
    private static native int recovery$indy$flow$1125(java.lang.Object a0,long a1,long a2,long a3);
    private static boolean recovery$indy$flow$1126(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48I;
    }

    private static native boolean recovery$indy$flow$1128(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$1129(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48I = a1;
        return;
    }

    private static native boolean recovery$indy$flow$1131(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1132() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1133(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1134() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1135(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$1137() {
        return net.C_47Az.ENTITY;
    }
    private static java.lang.Object recovery$indy$flow$1138() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1139(java.lang.Object a0,long a1,long a2);

    private static boolean recovery$indy$flow$1141(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }
    private static native boolean recovery$indy$flow$1142(java.lang.Object a0,short a1,long a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$1143() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1144(java.lang.Object a0,long a1,long a2);


    private static int recovery$indy$flow$1147(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static int recovery$indy$flow$1148(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static java.lang.Object recovery$indy$flow$1149() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$1151(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$1152() {
        return net.C_47Wq.HIT_SELECTION;
    }
    private static native boolean recovery$indy$flow$1153(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1154() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$1156(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1157() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$1159(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$1160() {
        return net.C_47Wq.HIT_SELECTION;
    }
    private static native boolean recovery$indy$flow$1161(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1162() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$1164(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1165() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$1167(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$1169(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$1170(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_480;
    }
    private static native boolean recovery$indy$flow$1171(java.lang.Object a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$1173(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1174() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1175(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$1176() {
        return augustus.recovered.modules.legit.AutoClicker_47Cn.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$1177(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$1179() {
        return net.C_47Az.ENTITY;
    }
    private static native boolean recovery$indy$flow$1180(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$1181() {
        return net.C_475c.field_46H;
    }
    private static native double recovery$indy$flow$1182(java.lang.Object a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$1184(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$1186(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$1188(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$1449(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1451(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$1454(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$1456(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1459(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1462(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1465(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1468(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1472(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1475(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$1851();
    private static native java.lang.Object recovery$indy$flow$1853(int a0);
    private static native void recovery$indy$flow$1855(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1858(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1861(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1864(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1870(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1871(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1874(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1875(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1880(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1883(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1884(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1887(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1888(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1894(java.lang.Object a0,int a1,short a2,java.lang.Object a3,int a4);
    private static native java.lang.Object recovery$indy$flow$1895(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1898(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$1899(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1905(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1907(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1910(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1912(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1918(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1920(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1923(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1925(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1930(java.lang.Object a0,long a1);



    private static native java.lang.Object recovery$indy$flow$1934(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1935(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1938(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1939(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1945(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1947(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1950(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1952(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1958(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1959(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1962(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1963(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1969(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1970(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1973(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1974(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1980(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$1982(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1983(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1986(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1987(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1991(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1994(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1995(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2000(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2001(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2004(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2005(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2009(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2012(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2013(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2018(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2021(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2022(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2025(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2026(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2031(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2034(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2035(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2038(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2039(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2043(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2046(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2048(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2052(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2055(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2056(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2061(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2062(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2065(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2066(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2070(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2073(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2074(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2078(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2081(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2083(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2087(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2090(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2091(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2096(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2097(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2100(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2101(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2105(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2108(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2109(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2113(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2116(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2118(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2123(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2124(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2127(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2128(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2133(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2134(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2137(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2138(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2142(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2145(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2147(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2152(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2153(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2156(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2157(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2162(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2163(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2166(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2167(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2169();

    private static native java.lang.Object recovery$indy$flow$2172(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2175(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2176(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2178(int a0);

    private static native java.lang.Object recovery$indy$flow$2181(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2184(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2185(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2187(int a0);

    private static native java.lang.Object recovery$indy$flow$2190(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2193(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2194(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2198(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2201(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2202(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2208(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2209(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2212(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2213(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2217(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2220(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2222(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2224(int a0);



    private static native java.lang.Object recovery$indy$flow$2229(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2230(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2233(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2234(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2236(int a0);



    private static native java.lang.Object recovery$indy$flow$2241(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2242(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2245(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2246(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2248(int a0);



    private static native java.lang.Object recovery$indy$flow$2253(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2254(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2257(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2258(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2262(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2265(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2266(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2270(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2273(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2274(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2280(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2281(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2284(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2285(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2291(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2293(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2294(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2297(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2298(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2304(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2305(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2308(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2309(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2314(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2315(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2318(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2319(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2323(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2326(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2327(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2333(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2334(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2337(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2338(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2344(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2346(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2347(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2350(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2351(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2357(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2358(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2361(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2362(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2367(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2368(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2371(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2372(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2376(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2379(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2380(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2386(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2387(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2390(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2391(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2397(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2399(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2400(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2403(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2404(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2410(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2411(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2414(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2415(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2421(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2423(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2424(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2427(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2428(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2432(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2435(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2436(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2442(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2443(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2446(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2447(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2452(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2453(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2456(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2457(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2463(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2464(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2467(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2468(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2473(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2474(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2477(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2478(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2480(int a0);
    private static native void recovery$indy$flow$2482(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2485(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2488(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2489(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2494(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2495(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2498(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2499(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2504(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2505(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2508(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2509(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2514(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2515(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2518(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2519(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2524(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2525(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2528(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2529(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2533(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$2534(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2539(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$2541(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2544(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2547(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2550(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2553(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2556(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2559(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$2561(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2564(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2568(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2569(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2572(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2573(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2576(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2579(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2580(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48r = a1;
        return;
    }
    private static void recovery$indy$flow$2581(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48c = a1;
        return;
    }
    private static void recovery$indy$flow$2582(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_47 = a1;
        return;
    }
    private static void recovery$indy$flow$2583(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$2584(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$2585(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48H = ((net.C_40d) (a1));
        return;
    }
    private static void recovery$indy$flow$2588(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43W = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$2589(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44Z = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$2590(int a0);
    private static native void recovery$indy$flow$2591(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2592(int a0);
    private static native void recovery$indy$flow$2593(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2594(int a0);
    private static native void recovery$indy$flow$2595(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2598(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2601(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2604(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2607(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2610(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2613(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2616(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2619(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2622(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2625(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2628(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2631(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2634(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2637(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2640(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2643(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2646(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2649(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2652(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2655(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2658(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2659(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$2660(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$2661(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$2662(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_480 = a1;
        return;
    }
    private static void recovery$indy$flow$2663(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48I = a1;
        return;
    }
    private static void recovery$indy$flow$2664(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$2665(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44i = a1;
        return;
    }
    private static void recovery$indy$flow$2666(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44N = a1;
        return;
    }
    private static void recovery$indy$flow$2667(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_485 = a1;
        return;
    }
    private static void recovery$indy$flow$2668(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$2669(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_441 = a1;
        return;
    }
    private static void recovery$indy$flow$2670(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44R = ((int[]) (a1));
        return;
    }
    private static void recovery$indy$flow$2671(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_48k = ((float[]) (a1));
        return;
    }
    private static void recovery$indy$flow$2672(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44A = ((double[]) (a1));
        return;
    }
    private static void recovery$indy$flow$2673(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44r = ((int[]) (a1));
        return;
    }
    private static void recovery$indy$flow$2674(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44S = a1;
        return;
    }
    private static void recovery$indy$flow$2675(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43U = a1;
        return;
    }
    private static void recovery$indy$flow$2676(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$2677(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_44g = a1;
        return;
    }
    private static void recovery$indy$flow$2678(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoClicker_47Cn) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$2681(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$2683(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2686(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2688(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2689();
    private static native void recovery$indy$flow$2690(boolean a0);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native String recovery$indy$3(int var0, long var1);
   private static native C_45n recovery$indy$4(AutoClicker_47Cn var0);
   private static native SettingGroup recovery$indy$5(Object var0, int var1, char var2, int var3, Object var4, long var5, long var7);
   private static native String recovery$indy$6(int var0, long var1);
   private static native String recovery$indy$7(int var0, long var1);
   private static native RangeSetting recovery$indy$8(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_45n recovery$indy$9(AutoClicker_47Cn var0);
   private static native RangeSetting recovery$indy$10(Object var0, int var1, Object var2, long var3, long var5, long var7);
   private static native String recovery$indy$11(int var0, long var1);
   private static native String recovery$indy$12(int var0, long var1);
   private static native String recovery$indy$13(int var0, long var1);
   private static native RangeSetting recovery$indy$14(Object var0, long var1, Object var3, long var4, long var6);
   private static native RangeSetting recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native C_45n recovery$indy$16(AutoClicker_47Cn var0);
   private static native RangeSetting recovery$indy$17(Object var0, int var1, Object var2, long var3, long var5, long var7);
   private static native String recovery$indy$18(int var0, long var1);
   private static native String recovery$indy$19(int var0, long var1);
   private static native RangeSetting recovery$indy$20(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_45n recovery$indy$21(AutoClicker_47Cn var0);
   private static native RangeSetting recovery$indy$22(Object var0, int var1, Object var2, long var3, long var5, long var7);
   private static native String recovery$indy$23(int var0, long var1);
   private static native String recovery$indy$24(int var0, long var1);
   private static native RangeSetting recovery$indy$25(Object var0, long var1, Object var3, long var4, long var6);
   private static native RangeSetting recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native C_45n recovery$indy$27(AutoClicker_47Cn var0);
   private static native RangeSetting recovery$indy$28(Object var0, int var1, Object var2, long var3, long var5, long var7);
   private static native boolean recovery$indy$29(long var0, long var2);
   private static native boolean recovery$indy$30(Object var0, short var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native boolean recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$33(int var0, long var1);
   private static native void recovery$indy$34(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$35(int var0, long var1);
   private static native boolean recovery$indy$36(long var0, long var2);
   private static native C_47Ij recovery$indy$37(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$38(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$40(Object var0, boolean var1, long var2, long var4);
   private static native C_47oo recovery$indy$41(Object var0, long var1, long var3);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$44(long var0, long var2);
   private static native int recovery$indy$45(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$47(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$48(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$49(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$50(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$51(long var0, long var2);
   private static native String recovery$indy$52(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$53(int var0, long var1);
   private static native int recovery$indy$54(Object var0, long var1, long var3);
   private static native int recovery$indy$55(Object var0, long var1, long var3);
   private static native String recovery$indy$56(int var0, long var1);
   private static native boolean recovery$indy$86(long var0, long var2);
   private static native void recovery$indy$87(Object var0, long var1, long var3);
   private static native void recovery$indy$88(Object var0, long var1, long var3);
   private static native void recovery$indy$89(Object var0, long var1, long var3);
   private static native void recovery$indy$90(Object var0, long var1, long var3);
   private static native void recovery$indy$91(Object var0, long var1, long var3);
   private static native void recovery$indy$92(Object var0, long var1, long var3);
   private static native void recovery$indy$93(Object var0, long var1, long var3);
   private static native void recovery$indy$94(Object var0, long var1, long var3);
   private static native void recovery$indy$95(Object var0, long var1, long var3);
   private static native void recovery$indy$96(Object var0, long var1, long var3);
   private static native boolean recovery$indy$97(long var0, long var2);
   private static native String recovery$indy$98(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$99(int var0, long var1);
   private static native int recovery$indy$100(Object var0, long var1, long var3);
   private static native int recovery$indy$101(Object var0, long var1, long var3);
   private static native boolean recovery$indy$102(long var0, long var2);
   private static native boolean recovery$indy$103(Object var0, long var1, long var3, long var5);
   private static native C_47Ij recovery$indy$104(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$105(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$106(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$107(Object var0, long var1, long var3);
   private static native boolean recovery$indy$108(long var0, long var2);
   private static native int recovery$indy$109(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$110(long var0, long var2);
   private static native boolean recovery$indy$111(Object var0, long var1, long var3);
   private static native void recovery$indy$112(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$113(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$114(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$115(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$116(long var0, long var2);
   private static native C_47Ij recovery$indy$117(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$118(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$119(Object var0, long var1, long var3);
   private static native boolean recovery$indy$120(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$121(Object var0, long var1, long var3);
   private static native boolean recovery$indy$132(long var0, long var2);
   private static native boolean recovery$indy$133(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$134(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$135(Object var0, long var1, long var3);
   private static native double recovery$indy$136(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$137(long var0, long var2);
   private static native C_47Ij recovery$indy$138(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$139(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$207();
}
