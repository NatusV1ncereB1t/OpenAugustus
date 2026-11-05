package augustus.recovered.modules.player;
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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40g;
import net.C_42R;
import net.C_42a;
import net.C_43S;
import net.C_43r;
import net.C_45n;
import net.C_4713;
import net.C_471Q;
import net.C_472n;
import net.C_473X;
import net.C_474i;
import net.C_474k;
import net.C_475c;
import net.C_475y;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47GS;
import net.C_47Ij;
import net.C_47JT;
import net.C_47KL;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import net.C_47Oh;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47UU;
import net.C_47cu;
import net.C_47dz;
import net.C_47gG;
import net.C_47hi;
import net.C_47i;
import net.C_47jt;
import net.minecraft.client.Minecraft;
import net.C_47pL;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_47tz;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class InvManager_47QL extends client.module.Module implements net.C_47GS,net.C_47hi,net.C_48T,net.C_47UH,net.C_47JT {
    private final java.lang.String[] field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingActions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBlockInputWhileManaging = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingVisualize = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStopMovement = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStopSprinting = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingSort = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSortInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSortMaxMouseMoveSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSortMouseMoveRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSortCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSortCPSRecalculate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSortFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSortSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingSlots = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot3 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot4 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot5 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot6 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot7 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot8 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSlot9 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingArmor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNoArmorDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyInHotbar = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIgnoreDurability = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingArmorInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingArmorMaxMouseMoveSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorMouseMoveRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorCPSRecalculate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorDoubleClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingArmorMissClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingArmorSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingClean = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingKeepAllArmor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCleanInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCleanMaxMouseMoveSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCleanMouseMoveRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCleanCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCleanCPSRecalculate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCleanFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCleanMissClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingCleanerSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingItemsToDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingItemStackLimits = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBlockStackLimit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFoodStackLimit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingWaterBucketLimit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLavaBucketLimit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingThrowablesLimit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCraft = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingReCraftIfSoupsLowerThan = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCraftInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCraftMaxMouseMoveSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCraftMouseMoveRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCraftCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCraftCPSRecalculate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingArmorHotbar = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingQSG = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTickDelayBeforeSwitch = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTickDelayBeforeClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTickDelayAfter = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingClickMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44k = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44Y = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44K = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44T = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44N = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44C = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_440 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_41k = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_414 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44g = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44Q = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_443 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43f; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_436; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_447; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43U; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_471Q field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

   private boolean method_46$b271fd46b4(
      ArrayList var1,
      ArrayList var2,
      C_474k var3,
      RangeSetting var4,
      RangeSetting var5,
      long var6,
      RangeSetting var8,
      RangeSetting var9,
      C_47gG var10,
      boolean var11,
      int var12,
      int var13,
      int var14
   ) {
      int var36;
      var6 = a ^ var6;
      long var10001 = var6 ^ 64259242411835L;
      int var15 = (int)((var6 ^ 64259242411835L) >>> 48);
      int var16 = (int)((var6 ^ 64259242411835L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var6 ^ 104167717326965L;
      long var20 = var6 ^ 5815256473563L;
      long var22 = var6 ^ 27182754030792L;
      long var24 = var6 ^ 14325245250621L;
      byte var26 = (byte) ((recovery$indy$1(1556008287415057046L, var6)) ? 1 : 0);
      int var10000 = (int) ((var11) ? 1 : 0);
      if (var26 != 0) {
         if ((var11 ? 1 : 0) != 0) {
            var1.forEach(recovery$indy$2());
            return true;
         }

         var10000 = (int) ((var2.isEmpty()) ? 1 : 0);
      }

      byte var35 = var26;
      if (var6 > 0L) {
         if (var26 != 0) {
            if (var10000 == 0) {
               label170: {
                  var36 = var2.size();
                  byte var10002 = var26;
                  if (var6 > 0L) {
                     if (var26 == 0) {
                        break label170;
                     }

                     var10002 = 1;
                  }

                  var36 = var36 > var10002 ? 1 : 0;
               }

               C_47rf var27 = (C_47rf)var2.get(var36);
               if (var27 != null) {
                  this.field_437 = var27.method_46$8abf5c6871();
               }
            }

            var10000 = (int) ((recovery$indy$3(this, var24, this.field_414, var5, 1555701048084042156L, var6)) ? 1 : 0);
         }

         var35 = var26;
      }

      if (var6 >= 0L) {
         if (var35 != 0) {
            if (var10000 != 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$4(this.settingMode, var18, 1558629953564331457L, var6).equals(recovery$indy$5(5368, 60915641612879586L ^ var6))) ? 1 : 0);
         }

         var35 = var26;
      }

      if (var35 != 0) {
         var10000 = var10000 != 0 ? 1 : recovery$indy$6(var3, var12, var20, 1560467553858152941L, var6);
      }

      int var30 = var10000;

      label161:
      while (true) {
         var10000 = var30;

         while (true) {
            Object var34;
            if (var10000 > 0) {
               int var32 = (int) ((var1.isEmpty()) ? 1 : 0);
               byte var37 = var26;
               if (var6 >= 0L) {
                  if (var26 == 0) {
                     return var32 != 0;
                  }

                  var37 = var26;
               }

               if (var37 == 0) {
                  return var32 != 0;
               }

               label155:
               if (!(var32 != 0)) {
                  var32 = (int) ((recovery$indy$7(this, var8, var10, var22, 1554305870775447439L, var6)) ? 1 : 0);
                  if (var26 != 0) {
                     if (var32 != 0) {
                        var30--;
                        var10000 = var26;
                        if (var6 < 0L) {
                           continue;
                        }

                        if (var26 != 0) {
                           break;
                        }
                     }

                     var34 = this;
                     if (var6 >= 0L) {
                        if (var26 == 0) {
                           break label155;
                        }

                        var30 = recovery$indy$8(
                           this,
                           var13,
                           (char)var15,
                           var14,
                           var10,
                           ((C_47rf)var2.get(0)).method_46$8abf5c6871(),
                           var30,
                           var9,
                           var16,
                           var17,
                           1557159062653547544L,
                           var6
                        );
                        var32 = var30;
                     } else {
                        var30 = recovery$indy$8(
                           this,
                           var26,
                           (char)var15,
                           var14,
                           var10,
                           ((C_47rf)var2.get(0)).method_46$8abf5c6871(),
                           var30,
                           var9,
                           var16,
                           var17,
                           1557159062653547544L,
                           var6
                        );
                        var32 = var30;
                     }
                  }

                  if (var32 <= 0) {
                     if (var6 >= 0L) {
                        return false;
                     }

                     var34 = var1.get(0);
                  } else {
                     var34 = var1.get(0);
                  }
               } else {
                  if (var6 >= 0L) {
                     return false;
                  }

                  var34 = var1.get(0);
               }
            } else {
               if (var6 >= 0L) {
                  return false;
               }

               var34 = var1.get(0);
            }

            while (true) {
               Runnable var28 = (Runnable)var34;
               var28.run();
               if (var6 > 0L) {
                  if (var26 != 0) {
                     if (recovery$indy$9(this, var24, this.field_41k, var4, 1555701048084042156L, var6)) {
                        var28.run();
                     }

                     var1.remove(0);
                     var2.remove(0);
                  }

                  var30--;
               }

               if (var26 != 0) {
                  continue label161;
               }

               if (var6 >= 0L) {
                  return false;
               }

               var34 = var1.get(0);
            }
         }
      }
   }





   private void method_46$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 1647853709130L;
      long var5 = var3 ^ 31814244265447L;
      long var10005 = -7372068059323582442L;
      C_47gG var7 = var2;
      byte var8 = -1;
      long var9 = var5;
      int var11 = var1;
      InvManager_47QL var12 = this;
      var12.method_49$dcf4412afe(var11, var9, var8, var7);
   }



   private void method_46$e556f6f180(C_47rf var1, C_47gG var2) {
      long var3 = a ^ 103000200575709L;
      long var5 = var3 ^ 50531964460898L;
      long var10004 = 4917532607810647086L;
      C_47gG var7 = var2;
      C_47rf var8 = var1;
      long var9 = var5;
      InvManager_47QL var11 = this;
      var11.method_44$bc4e8defcb(var9, var8, var7);
   }



   private void method_46$765f95ffe0(int var1, int var2, C_47gG var3) {
      long var4 = a ^ 47516068456608L;
      long var6 = var4 ^ 60094333575693L;
      long var10005 = 1610895998385534972L;
      C_47gG var8 = var3;
      int var9 = var2;
      long var10 = var6;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_49$dcf4412afe(var12, var10, var9, var8);
   }



   private void method_46$587a1b8d2d(C_47gG var1, long var2, int var4) {
      var2 = a ^ var2;
      ScaledResolution var5 = new ScaledResolution(field_43);
      int var6 = (var5.method_46$8abf5c6871() - 176) / 2;
      int var7 = (var5.method_48$8abf5c6871() - 166) / 2;
      C_47sT var8 = var1.method_46$4c10532da1(var4);
      recovery$indy$10(new double[]{var8.field_40 + 2 + var6, var8.field_46 + 2 + var7}, 755523453189261436L, var2);
      recovery$indy$11(var4, 744842539238910380L, var2);
      recovery$indy$12(this.field_44k, 751036007793607999L, var2);
   }



   private void method_46$100b9771e2(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      recovery$indy$13(this.settingStartDelay, -5337349760550167282L, var4);
      recovery$indy$14(this.settingArmorCPS, -5337349760550167282L, var4);
      recovery$indy$15(this.settingArmorCPSRecalculate, -5337349760550167282L, var4);
      recovery$indy$16(this.settingSortCPS, -5337349760550167282L, var4);
      recovery$indy$17(this.settingSortCPSRecalculate, -5337349760550167282L, var4);
      recovery$indy$18(this.settingCleanCPS, -5337349760550167282L, var4);
      recovery$indy$19(this.settingCleanCPSRecalculate, -5337349760550167282L, var4);
      recovery$indy$20(this.settingArmorDoubleClickRate, -5337349760550167282L, var4);
      recovery$indy$21(this.settingCleanMissClickRate, -5337349760550167282L, var4);
      recovery$indy$22(this.settingArmorMissClickRate, -5337349760550167282L, var4);
      recovery$indy$23(this.settingSortFailRate, -5337349760550167282L, var4);
      recovery$indy$24(this.settingArmorFailRate, -5337349760550167282L, var4);
      recovery$indy$25(this.settingCleanFailRate, -5337349760550167282L, var4);
      recovery$indy$26(this.settingCraftCPS, -5337349760550167282L, var4);
      recovery$indy$27(this.settingCraftCPSRecalculate, -5337349760550167282L, var4);
      recovery$indy$28(this.settingTickDelayBeforeSwitch, -5337349760550167282L, var4);
      recovery$indy$29(this.settingTickDelayBeforeClick, -5337349760550167282L, var4);
      recovery$indy$30(this.settingTickDelayAfter, -5337349760550167282L, var4);
      this.field_437 = -1;
      recovery$indy$31(this, -5337524358111749604L, var4);
   }




    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private void method_42$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 56158665433466L;
      long var5 = var3 ^ 2095291427992L;
      long var10005 = 6882454194985367528L;
      C_47gG var7 = var2;
      byte var8 = 0;
      int var9 = var1;
      long var10 = var5;
      InvManager_47QL var12 = this;
      var12.method_44$8a933f4c45(var10, var9, var8, var7);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(C_475c c_475c) {
        InvManager_47QL invManager_47QL;
        block14: {
            block15: {
                int n;
                boolean bl;
                long l;
                block16: {
                    long l2;
                    block17: {
                        int n2;
                        block13: {
                            block11: {
                                block9: {
                                    Minecraft c_47nT;
                                    block12: {
                                        C_47Ij c_47Ij;
                                        block10: {
                                            Minecraft c_47nT2;
                                            block8: {
                                                long l3;
                                                long l4 = l3 = a ^ 0x2D901F701E70L;
                                                l2 = l4 ^ 0x7B42658A37D2L;
                                                l = l4 ^ 0x1A764D1921A1L;
                                                bl = AirStuck_47Q4.method_419$aae029aa0a();
                                                c_47nT2 = field_43;
                                                if (bl) break block8;
                                                Minecraft c_47nT3 = c_47nT2;
                                                if (!c_47nT3.method_44$aae029aa0a()) break block9;
                                                c_47nT2 = field_43;
                                            }
                                            Minecraft c_47nT4 = c_47nT2;
                                            c_47Ij = c_47nT4.field_42Y;
                                            if (bl) break block10;
                                            if (c_47Ij == null) break block11;
                                            c_47nT = field_43;
                                            if (bl) break block12;
                                            Minecraft c_47nT5 = c_47nT;
                                            c_47Ij = c_47nT5.field_42Y;
                                        }
                                        if (c_47Ij.field_49 != C_47Az.BLOCK) break block11;
                                        c_47nT = field_43;
                                    }
                                    Minecraft c_47nT6 = c_47nT;
                                    Minecraft c_47nT7 = field_43;
                                    n2 = c_47nT6.field_44Q.method_46$efbf73d2b1(c_47nT7.field_42Y.method_49$5730377d31()).method_48$e084f7739d().method_48$aae029aa0a() ? 1 : 0;
                                    if (bl) break block13;
                                    if (n2 == 0) break block11;
                                }
                                return;
                            }
                            invManager_47QL = this;
                            if (bl) break block14;
                            n2 = invManager_47QL.field_43U;
                        }
                        if (n2 <= -1) break block15;
                        n = this.field_43p;
                        if (bl) break block16;
                        RangeSetting c_47Ts = this.settingTickDelayBeforeClick;
                        if (n <= c_47Ts.method_44$8abf5c6871()) break block17;
                        Minecraft c_47nT = field_43;
                        n = c_47nT.field_42P.method_436$aae029aa0a() ? 1 : 0;
                        if (bl) break block16;
                        if (n != 0) break block17;
                        n = this.field_43v ? 1 : 0;
                        if (bl) break block16;
                        if (n == 0) {
                            int n3 = 1;
                            C_475c c_475c2 = c_475c;
                            c_475c2.method_48$d00df7729d(n3);
                            this.field_43v = true;
                        }
                    }
                    invManager_47QL = this;
                    if (bl) break block14;
                    RangeSetting c_47Ts = this.settingTickDelayBeforeClick;
                    long l5 = l2;
                    RangeSetting c_47Ts2 = this.settingTickDelayAfter;
                    double d = (double)invManager_47QL.field_43p - ((double)c_47Ts.method_44$8abf5c6871() + c_47Ts2.method_41$474dfaa627(l5));
                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                }
                if (n <= 0) break block15;
                invManager_47QL = this;
                if (bl) break block14;
                if (invManager_47QL.field_43v) {
                    long l6 = l;
                    InvManager_47QL invManager_47QL2 = this;
                    invManager_47QL2.method_47$e45a9973e5(l6);
                }
            }
            invManager_47QL = this;
        }
        ++invManager_47QL.field_43p;
    }




   private void method_41$e556f6f180(C_47rf var1, C_47gG var2) {
      long var3 = a ^ 121794342562845L;
      long var5 = var3 ^ 33662025419170L;
      long var10004 = -7854657413747580178L;
      C_47gG var7 = var2;
      C_47rf var8 = var1;
      long var9 = var5;
      InvManager_47QL var11 = this;
      var11.method_44$bc4e8defcb(var9, var8, var7);
   }



   private void method_41$765f95ffe0(int var1, int var2, C_47gG var3) {
      long var4 = a ^ 97953627539947L;
      long var6 = var4 ^ 75343996830534L;
      long var10005 = 3967811191020132023L;
      C_47gG var8 = var3;
      int var9 = var2;
      long var10 = var6;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_49$dcf4412afe(var12, var10, var9, var8);
   }



   private void method_40$765f95ffe0(int var1, int var2, C_47gG var3) {
      long var4 = a ^ 121074329625290L;
      long var6 = var4 ^ 127050223380583L;
      long var10005 = 2031484393005464982L;
      C_47gG var8 = var3;
      int var9 = var2;
      long var10 = var6;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_49$dcf4412afe(var12, var10, var9, var8);
   }



    private boolean method_40$e1e9b6e76d(boolean a0,long a1) {

        int regionValue619;
        int constructorPart1;
        constructorPart1 = a0?1:0;
        region1125: {
        region1124: {
        region971: {
        region969: {
        region804: {
        region683: {
        region571: {
        long computed7;
        int value24;
        java.lang.Object value498;
        java.lang.Object value214;
        long computed21;
        int regionValue519;
        java.lang.Object regionValue518;
        int regionValue515;
        int regionValue496;
        long computed9;
        long computed17;
        long computed15;
        long computed13;

        region266: {
        boolean[] values503;
        int arrayValue333;
        int value505;
        java.lang.Object value501;
        java.lang.Object value500;
        java.lang.Object value499;

        region231: {
        region230: {
        int regionValue443;

        region229: {
        region228: {
        int regionValue420;
        int regionValue419;

        region227: {
        int regionValue465;

        region226: {
        int regionValue454;

        region224: {
        int regionValue431;

        region223: {
        int regionValue346;
        int comparison408;

        region219: {
        int regionValue371;

        region218: {
        int regionValue405;

        region217: {
        region211: {
        int regionValue395;
        int regionValue393;

        region210: {
        int regionValue383;
        int regionValue381;

        region208: {
        int regionValue359;
        int regionValue357;

        region207: {
        int value332;
        int regionValue296;
        int comparison335;

        region196: {
        int value331;
        int value330;
        int arrayValue329;
        int arrayValue328;
        int arrayValue327;

        region185: {
        int regionValue217;

        region184: {
        region178: {
        region176: {
        int arrayValue286;

        region175: {
        region173: {
        region168: {
        region166: {
        int arrayValue247;

        region165: {
        region163: {
        region158: {
        region156: {
        int arrayValue216;

        region155: {
        java.lang.Object value213;
        java.lang.Object value212;
        java.lang.Object value208;
        java.lang.Object value207;
        java.lang.Object value206;
        java.lang.Object value204;
        int value202;
        int computed203;

        region116: {
        int regionValue154;

        region115: {
        region109: {
        region107: {
        region106: {
        region104: {
        region101: {
        int regionValue78;

        region100: {
        region99: {
        int regionValue113;

        region98: {
        boolean value153;
        java.lang.Object value152;
        java.lang.Object value150;
        java.lang.Object value149;
        java.lang.Object value146;
        long computed19;
        long computed151;

        region79: {
        int regionValue29;

        region78: {
        region77: {
        int regionValue90;

        region76: {
        region74: {
        region73: {
        region71: {
        boolean value67;
        java.lang.Object value66;
        long computed11;
        int comparison68;

        region54: {
        region52: {
        int regionValue41;

        region51: {
        boolean value28;
        long value6;
        java.lang.Object value27;
        java.lang.Object value25;
        boolean value23;

        value6 = recovery$indy$flow$161();
        computed7 = value6 ^ a1;
        computed9 = computed7 ^ 83417100873103L;
        computed11 = computed7 ^ 114145254065246L;
        computed13 = computed7 ^ 10021697101341L;
        computed15 = computed7 ^ 114308103571292L;
        computed17 = computed7 ^ 19161537095230L;
        computed19 = computed7 ^ 58791356438419L;
        computed21 = computed7 ^ 40461995522323L;
        value23 = recovery$indy$flow$162();
        value24 = (int) ((value23 ? 1 : 0));
        value25 = recovery$indy$flow$163();
        value27 = ((java.lang.Object)(((net.C_47Oh) (((java.lang.Object)(value25))))));
        value28 = recovery$indy$flow$165(value27);
        if (value24 == 0) {
            regionValue29 = (int) ((value28 ? 1 : 0));
            break region78;
        } else {
            regionValue41 = (int) ((value28 ? 1 : 0));
            break region51;
        }
        }
        if (regionValue41 == 0) {
            break region77;
        } else {
            break region52;
        }
        }
        break region54;
        }
        value66 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value67 = recovery$indy$flow$167(value66, computed11);
        comparison68 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison68 < 0) {
            regionValue78 = (int) ((value67 ? 1 : 0));
            break region99;
        } else {
            regionValue90 = (int) ((value67 ? 1 : 0));
            break region71;
        }
        }
        break region73;
        }
        if (value24 == 0) {
            regionValue113 = regionValue90;
            break region98;
        } else {
            break region74;
        }
        }
        break region76;
        }
        if (regionValue90 == 0) {
            break region79;
        } else {
            break region77;
        }
        }
        regionValue29 = 1;
        break region78;
        }
        return ((regionValue29 & 1) != 0);
        }
        value146 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingMode));
        value149 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value146))))));
        value150 = recovery$indy$flow$170(value149, computed19);
        computed151 = 3389272794329347885L ^ computed7;
        value152 = recovery$indy$flow$171(25287, computed151);
        value153 = recovery$indy$flow$172(value150, value152);
        regionValue113 = (int) ((value153 ? 1 : 0));
        break region98;
        }
        regionValue78 = regionValue113;
        break region99;
        }
        if (value24 == 0) {
            regionValue154 = regionValue78;
            break region115;
        } else {
            break region100;
        }
        }
        if (regionValue78 == 0) {
            break region109;
        } else {
            break region101;
        }
        }
        if (value24 == 0) {
            regionValue154 = constructorPart1;
            break region115;
        } else {
            break region104;
        }
        }
        break region106;
        }
        if (constructorPart1 == 0) {
            break region116;
        } else {
            break region107;
        }
        }
        break region109;
        }
        recovery$indy$flow$173(this, false);
        regionValue154 = 1;
        break region115;
        }
        return ((regionValue154 & 1) != 0);
        }
        value202 = recovery$indy$flow$174(this);
        computed203 = value202 + 1;
        recovery$indy$flow$175(this, computed203);
        value204 = recovery$indy$flow$176();
        value206 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value204))))));
        value207 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value206)))).field_42P));
        value208 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value207)))).field_429));
        value212 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value213 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value208))))));
        value214 = recovery$indy$flow$182(value212, computed15, value213);
        arrayValue216 = ((int[]) value214)[1];
        if (value24 == 0) {
            regionValue217 = arrayValue216;
            break region184;
        } else {
            break region155;
        }
        }
        if (arrayValue216 == 0) {
            break region178;
        } else {
            break region156;
        }
        }
        break region158;
        }
        arrayValue247 = ((int[]) value214)[2];
        if (value24 == 0) {
            regionValue217 = arrayValue247;
            break region184;
        } else {
            break region163;
        }
        }
        break region165;
        }
        if (arrayValue247 == 0) {
            break region178;
        } else {
            break region166;
        }
        }
        break region168;
        }
        arrayValue286 = ((int[]) value214)[3];
        if (value24 == 0) {
            regionValue296 = arrayValue286;
            break region196;
        } else {
            break region173;
        }
        }
        break region175;
        }
        if (arrayValue286 != 0) {
            break region185;
        } else {
            break region176;
        }
        }
        break region178;
        }
        recovery$indy$flow$183(this, false);
        regionValue217 = 1;
        break region184;
        }
        return ((regionValue217 & 1) != 0);
        }
        arrayValue327 = ((int[]) value214)[1];
        arrayValue328 = ((int[]) value214)[2];
        arrayValue329 = ((int[]) value214)[3];
        value330 = recovery$indy$flow$184(arrayValue328, arrayValue329);
        value331 = recovery$indy$flow$185(arrayValue327, value330);
        regionValue296 = value331;
        break region196;
        }
        value332 = regionValue296;
        arrayValue333 = ((int[]) value214)[0];
        comparison335 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison335 < 0) {
            regionValue346 = value332;
            break region219;
        } else {
            regionValue357 = value332;
            regionValue359 = value332;
            break region207;
        }
        }
        if (value24 == 0) {
            regionValue371 = regionValue359;
            break region218;
        } else {
            regionValue381 = regionValue357;
            regionValue383 = regionValue359;
            break region208;
        }
        }
        regionValue393 = regionValue381;
        regionValue395 = regionValue383;
        break region210;
        }
        if (regionValue395 > 0) {
            regionValue405 = regionValue393;
            break region217;
        } else {
            break region211;
        }
        }
        recovery$indy$flow$186(this, false);
        return true;
        }
        regionValue371 = regionValue405;
        break region218;
        }
        regionValue346 = regionValue371;
        break region219;
        }
        comparison408 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison408 <= 0) {
            regionValue419 = regionValue346;
            regionValue420 = value24;
            break region227;
        } else {
            regionValue431 = regionValue346;
            break region223;
        }
        }
        if (value24 == 0) {
            regionValue443 = regionValue431;
            break region229;
        } else {
            regionValue454 = regionValue431;
            break region224;
        }
        }
        regionValue465 = regionValue454;
        break region226;
        }
        regionValue419 = regionValue465;
        regionValue420 = arrayValue333;
        break region227;
        }
        if (regionValue419 <= regionValue420) {
            break region230;
        } else {
            break region228;
        }
        }
        regionValue443 = 1;
        break region229;
        }
        regionValue496 = regionValue443;
        break region231;
        }
        regionValue496 = 0;
        break region231;
        }
        value498 = recovery$indy$flow$187(3);
        value499 = recovery$indy$flow$188();
        ((java.lang.Object[]) value498)[0] = value499;
        value500 = recovery$indy$flow$189(40);
        ((java.lang.Object[]) value498)[1] = value500;
        value501 = recovery$indy$flow$190(39);
        ((java.lang.Object[]) value498)[2] = value501;
        values503 = new boolean[3];
        values503[0] = false;
        values503[1] = false;
        values503[2] = false;
        value505 = 1;
        regionValue515 = arrayValue333;
        regionValue518 = values503;
        regionValue519 = value505;
        break region266;
        }
        loop266: while (true) {
        int regionValue534;
        int regionValue533;
        java.lang.Object regionValue532;
        int regionValue529;

        region267: {
        regionValue529 = regionValue515;
        regionValue532 = regionValue518;
        regionValue533 = regionValue519;
        regionValue534 = regionValue519;
        break region267;
        }
        loop267: while (true) {
        int regionValue555;
        java.lang.Object regionValue554;
        int regionValue551;
        int regionValue557;
        int regionValue556;

        region279: {
        int value541;
        java.lang.Object value540;
        java.lang.Object value539;
        java.lang.Object value538;
        java.lang.Object value537;
        java.lang.Object value536;
        java.lang.Object value535;

        value535 = recovery$indy$flow$191();
        value536 = value535;
        value537 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value536))))));
        value538 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value537)))).field_42P));
        value539 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value538)))).field_429));
        value540 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value539)))).field_46));
        value541 = recovery$indy$flow$196(value540);
        regionValue551 = regionValue529;
        regionValue554 = regionValue532;
        regionValue555 = regionValue533;
        regionValue556 = regionValue534;
        regionValue557 = value541;
        break region279;
        }
        loop279: while (true) {
        int regionValue740;
        java.lang.Object regionValue739;
        int regionValue736;

        region344: {
        int regionValue571;
        java.lang.Object regionValue570;
        int regionValue567;
        int comparison768;

        region2124: {
        int regionValue696;
        int regionValue695;
        java.lang.Object regionValue694;
        int value767;

        region343: {
        boolean[] values753;
        java.lang.Object value765;
        java.lang.Object value764;
        java.lang.Object value763;
        java.lang.Object value760;
        java.lang.Object value759;
        java.lang.Object value758;
        java.lang.Object value757;
        java.lang.Object value756;
        java.lang.Object value755;
        boolean[] value754;
        int regionValue752;
        int arrayValue766;

        region299: {
        int regionValue664;
        int regionValue666;
        int regionValue665;
        java.lang.Object regionValue663;
        int regionValue660;

        region298: {
        int regionValue726;
        int regionValue725;
        java.lang.Object regionValue724;
        int regionValue721;

        region297: {
        int regionValue711;
        int regionValue710;
        java.lang.Object regionValue709;
        int regionValue706;

        region295: {
        int regionValue681;
        int regionValue680;
        java.lang.Object regionValue679;
        int regionValue676;

        region294: {
        int regionValue601;
        int regionValue600;
        java.lang.Object regionValue599;
        int regionValue596;
        int comparison650;

        region290: {
        int regionValue649;
        int regionValue648;
        java.lang.Object regionValue647;
        int regionValue644;

        region289: {
        int regionValue634;
        int regionValue633;
        java.lang.Object regionValue632;
        int regionValue629;

        region287: {
        int regionValue617;
        int regionValue616;
        java.lang.Object regionValue615;
        int regionValue612;

        region286: {
        int regionValue585;
        java.lang.Object regionValue584;
        int regionValue581;
        int comparison586;

        region280: {
        if (regionValue556 >= regionValue557) {
            regionValue567 = regionValue551;
            regionValue570 = regionValue554;
            regionValue571 = regionValue555;
            break region2124;
        } else {
            regionValue581 = regionValue551;
            regionValue584 = regionValue554;
            regionValue585 = regionValue555;
            break region280;
        }
        }
        comparison586 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison586 <= 0) {
            regionValue596 = regionValue581;
            regionValue599 = regionValue584;
            regionValue600 = regionValue585;
            regionValue601 = regionValue585;
            break region290;
        } else {
            regionValue612 = regionValue581;
            regionValue615 = regionValue584;
            regionValue616 = regionValue585;
            regionValue617 = regionValue585;
            break region286;
        }
        }
        if (value24 == 0) {
            regionValue619 = regionValue617;
            break region1125;
        } else {
            regionValue629 = regionValue612;
            regionValue632 = regionValue615;
            regionValue633 = regionValue616;
            regionValue634 = regionValue617;
            break region287;
        }
        }
        regionValue644 = regionValue629;
        regionValue647 = regionValue632;
        regionValue648 = regionValue633;
        regionValue649 = regionValue634;
        break region289;
        }
        regionValue596 = regionValue644;
        regionValue599 = regionValue647;
        regionValue600 = regionValue648;
        regionValue601 = regionValue649;
        break region290;
        }
        comparison650 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison650 < 0) {
            regionValue660 = regionValue596;
            regionValue663 = regionValue599;
            regionValue664 = regionValue600;
            regionValue665 = regionValue601;
            regionValue666 = value24;
            break region298;
        } else {
            regionValue676 = regionValue596;
            regionValue679 = regionValue599;
            regionValue680 = regionValue600;
            regionValue681 = regionValue601;
            break region294;
        }
        }
        if (value24 == 0) {
            regionValue694 = regionValue679;
            regionValue695 = regionValue680;
            regionValue696 = regionValue681;
            break region343;
        } else {
            regionValue706 = regionValue676;
            regionValue709 = regionValue679;
            regionValue710 = regionValue680;
            regionValue711 = regionValue681;
            break region295;
        }
        }
        regionValue721 = regionValue706;
        regionValue724 = regionValue709;
        regionValue725 = regionValue710;
        regionValue726 = regionValue711;
        break region297;
        }
        regionValue660 = regionValue721;
        regionValue663 = regionValue724;
        regionValue664 = regionValue725;
        regionValue665 = regionValue726;
        regionValue666 = 1;
        break region298;
        }
        if (regionValue665 != regionValue666) {
            regionValue736 = regionValue660;
            regionValue739 = regionValue663;
            regionValue740 = regionValue664;
            break region344;
        } else {
            regionValue752 = regionValue664;
            break region299;
        }
        }
        values753 = new boolean[3];
        values753[0] = false;
        values753[1] = false;
        values753[2] = false;
        value754 = values753;
        value755 = recovery$indy$flow$197();
        value756 = value755;
        value757 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value756))))));
        value758 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value757)))).field_42P));
        value759 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value758)))).field_429));
        value760 = value759;
        value763 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value764 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value760))))));
        value765 = recovery$indy$flow$203(value763, computed15, value764);
        arrayValue766 = ((int[]) value765)[0];
        regionValue694 = value754;
        regionValue695 = regionValue752;
        regionValue696 = arrayValue766;
        break region343;
        }
        value767 = regionValue696;
        regionValue736 = value767;
        regionValue739 = regionValue694;
        regionValue740 = regionValue695;
        break region344;
        }
        comparison768 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison768 < 0) {
            regionValue736 = regionValue567;
            regionValue739 = regionValue570;
            regionValue740 = regionValue571;
            break region344;
        } else {
            break region1124;
        }
        }
        loop344: while (true) {
        int regionValue4713;
        java.lang.Object regionValue4712;
        int regionValue4709;
        int comparison4714;

        region1120: {
        int regionValue2671;
        java.lang.Object regionValue2670;
        int regionValue2667;

        region1119: {
        int regionValue1114;
        java.lang.Object regionValue1113;
        int regionValue1110;
        int comparison4699;

        region1114: {
        int regionValue2263;
        java.lang.Object regionValue2262;
        int regionValue2259;
        int incremented4698;

        region1113: {
        int regionValue853;
        java.lang.Object regionValue852;
        int regionValue849;

        region362: {
        java.lang.Object regionValue792;
        java.lang.Object regionValue791;
        int regionValue790;
        java.lang.Object regionValue789;
        int regionValue786;

        region359: {
        java.lang.Object value776;
        java.lang.Object value775;
        java.lang.Object value774;
        java.lang.Object value773;
        java.lang.Object value772;
        java.lang.Object value771;
        java.lang.Object value770;
        java.lang.Object value769;

        value769 = recovery$indy$flow$204();
        value770 = value769;
        value771 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value770))))));
        value772 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value771)))).field_42P));
        value773 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value772)))).field_429));
        value774 = recovery$indy$flow$208(value773, regionValue740);
        value775 = recovery$indy$flow$209(value774);
        value776 = value775;
        regionValue786 = regionValue736;
        regionValue789 = regionValue739;
        regionValue790 = regionValue740;
        regionValue791 = value776;
        regionValue792 = value776;
        break region359;
        }
        loop359: while (true) {
        int regionValue872;
        java.lang.Object regionValue871;
        java.lang.Object regionValue870;
        int regionValue869;
        java.lang.Object regionValue868;
        int regionValue865;

        region367: {
        int regionValue806;
        java.lang.Object regionValue808;
        java.lang.Object regionValue807;
        java.lang.Object regionValue805;
        int regionValue802;
        java.lang.Object value855;
        java.lang.Object value854;

        region364: {
        java.lang.Object regionValue839;
        int regionValue838;
        java.lang.Object regionValue837;
        int regionValue834;

        region363: {
        int regionValue822;
        java.lang.Object regionValue821;
        int regionValue818;
        java.lang.Object regionValue824;
        java.lang.Object regionValue823;

        region361: {
        if (value24 == 0) {
            regionValue802 = regionValue786;
            regionValue805 = regionValue789;
            regionValue806 = regionValue790;
            regionValue807 = regionValue791;
            regionValue808 = regionValue792;
            break region364;
        } else {
            regionValue818 = regionValue786;
            regionValue821 = regionValue789;
            regionValue822 = regionValue790;
            regionValue823 = regionValue791;
            regionValue824 = regionValue792;
            break region361;
        }
        }
        if (regionValue824 != null) {
            regionValue834 = regionValue818;
            regionValue837 = regionValue821;
            regionValue838 = regionValue822;
            regionValue839 = regionValue823;
            break region363;
        } else {
            regionValue849 = regionValue818;
            regionValue852 = regionValue821;
            regionValue853 = regionValue822;
            break region362;
        }
        }
        regionValue802 = regionValue834;
        regionValue805 = regionValue837;
        regionValue806 = regionValue838;
        regionValue807 = regionValue839;
        regionValue808 = regionValue839;
        break region364;
        }
        value854 = recovery$indy$flow$210(regionValue808);
        value855 = value854;
        regionValue865 = regionValue802;
        regionValue868 = regionValue805;
        regionValue869 = regionValue806;
        regionValue870 = regionValue807;
        regionValue871 = value855;
        regionValue872 = regionValue806;
        break region367;
        }
        loop367: while (true) {
        int regionValue3363;
        int regionValue3360;
        java.lang.Object regionValue3359;
        int regionValue3356;
        java.lang.Object regionValue3362;
        java.lang.Object regionValue3361;

        region873: {
        int regionValue3295;
        java.lang.Object regionValue3294;
        java.lang.Object regionValue3293;
        int regionValue3292;
        java.lang.Object regionValue3291;
        int regionValue3288;
        int value3346;

        region872: {
        java.lang.Object regionValue3345;
        java.lang.Object regionValue3344;
        int regionValue3343;
        java.lang.Object regionValue3342;
        int regionValue3339;

        region871: {
        int regionValue3256;
        java.lang.Object regionValue3255;
        int regionValue3252;
        int regionValue3260;
        int regionValue3259;
        java.lang.Object regionValue3258;
        java.lang.Object regionValue3257;

        region870: {
        int regionValue3329;
        java.lang.Object regionValue3328;
        java.lang.Object regionValue3327;
        int regionValue3326;
        java.lang.Object regionValue3325;
        int regionValue3322;

        region869: {
        int regionValue3312;
        java.lang.Object regionValue3311;
        java.lang.Object regionValue3310;
        int regionValue3309;
        java.lang.Object regionValue3308;
        int regionValue3305;

        region867: {
        int regionValue3277;
        java.lang.Object regionValue3276;
        java.lang.Object regionValue3275;
        int regionValue3274;
        java.lang.Object regionValue3273;
        int regionValue3270;

        region866: {
        int regionValue1222;
        java.lang.Object regionValue1221;
        java.lang.Object regionValue1220;
        int regionValue1219;
        java.lang.Object regionValue1218;
        int regionValue1215;
        int comparison3242;

        region862: {
        int regionValue1147;
        java.lang.Object regionValue1146;
        java.lang.Object regionValue1145;
        int regionValue1144;
        java.lang.Object regionValue1143;
        int regionValue1140;

        region861: {
        int regionValue1178;
        java.lang.Object regionValue1180;
        java.lang.Object regionValue1179;
        java.lang.Object regionValue1177;
        int regionValue1174;

        region860: {
        java.lang.Object regionValue3241;
        java.lang.Object regionValue3240;
        int regionValue3239;
        java.lang.Object regionValue3238;
        int regionValue3235;

        region858: {
        int regionValue3222;
        java.lang.Object regionValue3221;
        int regionValue3218;
        java.lang.Object regionValue3224;
        java.lang.Object regionValue3223;

        region857: {
        int regionValue2805;
        java.lang.Object regionValue2804;
        int regionValue2801;
        java.lang.Object regionValue2807;
        java.lang.Object regionValue2806;
        int comparison3208;

        region853: {
        int regionValue2733;
        java.lang.Object regionValue2732;
        java.lang.Object regionValue2731;
        java.lang.Object regionValue2730;
        int regionValue2729;
        java.lang.Object regionValue2728;
        int regionValue2725;

        region746: {
        java.lang.Object regionValue1332;
        java.lang.Object regionValue1331;
        java.lang.Object regionValue1330;
        int regionValue1329;
        java.lang.Object regionValue1328;
        int regionValue1325;
        int value2715;
        java.lang.Object value2714;
        java.lang.Object value2713;
        java.lang.Object value2712;

        region740: {
        java.lang.Object regionValue1382;
        java.lang.Object regionValue1381;
        int regionValue1380;
        java.lang.Object regionValue1379;
        int regionValue1376;
        java.lang.Object value2711;
        java.lang.Object value2710;
        java.lang.Object value2709;
        java.lang.Object value2708;
        java.lang.Object value2707;
        java.lang.Object value2706;

        region727: {
        int regionValue2705;
        java.lang.Object regionValue2704;
        java.lang.Object regionValue2703;
        java.lang.Object regionValue2702;
        int regionValue2699;

        region725: {
        int regionValue2688;
        java.lang.Object regionValue2685;
        int regionValue2682;
        java.lang.Object regionValue2687;
        java.lang.Object regionValue2686;

        region724: {
        java.lang.Object regionValue2609;
        int regionValue2606;
        int value2656;
        int regionValue2612;
        java.lang.Object regionValue2611;
        java.lang.Object regionValue2610;
        int comparison2657;

        region718: {
        java.lang.Object value2655;
        java.lang.Object value2654;
        int value2652;
        int value2650;
        java.lang.Object value2649;
        java.lang.Object value2648;
        java.lang.Object value2647;
        java.lang.Object value2646;
        java.lang.Object value2645;
        java.lang.Object value2644;
        java.lang.Object regionValue2643;
        java.lang.Object regionValue2642;
        java.lang.Object regionValue2641;
        int regionValue2638;

        region686: {
        int regionValue2628;
        java.lang.Object regionValue2627;
        java.lang.Object regionValue2626;
        java.lang.Object regionValue2625;
        int regionValue2622;

        region682: {
        int regionValue2507;
        java.lang.Object regionValue2506;
        java.lang.Object regionValue2505;
        java.lang.Object regionValue2504;
        int regionValue2501;

        region681: {
        int regionValue2542;
        java.lang.Object regionValue2541;
        java.lang.Object regionValue2540;
        java.lang.Object regionValue2539;
        int regionValue2536;

        region680: {
        boolean value2596;
        java.lang.Object value2595;
        int value2593;
        java.lang.Object regionValue2591;
        java.lang.Object regionValue2590;
        java.lang.Object regionValue2589;
        int regionValue2586;

        region663: {
        java.lang.Object regionValue2572;
        int regionValue2569;
        int regionValue2576;
        java.lang.Object regionValue2575;
        java.lang.Object regionValue2574;
        int regionValue2573;

        region662: {
        int regionValue2559;
        java.lang.Object regionValue2558;
        java.lang.Object regionValue2557;
        int regionValue2556;
        java.lang.Object regionValue2555;
        int regionValue2552;

        region660: {
        int regionValue2525;
        java.lang.Object regionValue2524;
        java.lang.Object regionValue2523;
        java.lang.Object regionValue2521;
        int regionValue2518;
        int regionValue2522;

        region659: {
        int regionValue2403;
        java.lang.Object regionValue2402;
        java.lang.Object regionValue2401;
        java.lang.Object regionValue2399;
        int regionValue2396;
        int regionValue2400;
        int comparison2491;

        region655: {
        int regionValue2439;
        java.lang.Object regionValue2438;
        java.lang.Object regionValue2437;
        int regionValue2436;
        java.lang.Object regionValue2435;
        int regionValue2432;

        region654: {
        java.lang.Object regionValue2486;
        java.lang.Object regionValue2489;
        java.lang.Object regionValue2488;
        int regionValue2487;
        int regionValue2483;
        int arrayValue2490;

        region649: {
        int regionValue2470;
        java.lang.Object regionValue2469;
        int regionValue2466;
        int regionValue2473;
        java.lang.Object regionValue2472;
        java.lang.Object regionValue2471;

        region648: {
        int regionValue2456;
        java.lang.Object regionValue2455;
        java.lang.Object regionValue2454;
        int regionValue2453;
        java.lang.Object regionValue2452;
        int regionValue2449;

        region646: {
        int regionValue2421;
        java.lang.Object regionValue2420;
        java.lang.Object regionValue2419;
        int regionValue2418;
        java.lang.Object regionValue2417;
        int regionValue2414;

        region645: {
        int regionValue2298;
        java.lang.Object regionValue2297;
        java.lang.Object regionValue2296;
        int regionValue2295;
        java.lang.Object regionValue2294;
        int regionValue2291;
        int comparison2386;

        region641: {
        int regionValue2334;
        java.lang.Object regionValue2333;
        java.lang.Object regionValue2332;
        int regionValue2331;
        java.lang.Object regionValue2330;
        int regionValue2327;

        region640: {
        java.lang.Object regionValue2381;
        java.lang.Object regionValue2384;
        java.lang.Object regionValue2383;
        int regionValue2382;
        int regionValue2378;
        int arrayValue2385;

        region635: {
        int regionValue2365;
        java.lang.Object regionValue2364;
        int regionValue2361;
        int regionValue2368;
        java.lang.Object regionValue2367;
        java.lang.Object regionValue2366;

        region634: {
        int regionValue2351;
        java.lang.Object regionValue2350;
        java.lang.Object regionValue2349;
        int regionValue2348;
        java.lang.Object regionValue2347;
        int regionValue2344;

        region632: {
        int regionValue2316;
        java.lang.Object regionValue2315;
        java.lang.Object regionValue2314;
        int regionValue2313;
        java.lang.Object regionValue2312;
        int regionValue2309;

        region631: {
        int regionValue2179;
        java.lang.Object regionValue2178;
        java.lang.Object regionValue2177;
        int regionValue2176;
        java.lang.Object regionValue2175;
        int regionValue2172;
        int comparison2281;

        region627: {
        int regionValue2215;
        java.lang.Object regionValue2214;
        java.lang.Object regionValue2213;
        int regionValue2212;
        java.lang.Object regionValue2211;
        int regionValue2208;

        region626: {
        java.lang.Object regionValue2276;
        java.lang.Object regionValue2279;
        java.lang.Object regionValue2278;
        int regionValue2277;
        int regionValue2273;
        int arrayValue2280;

        region621: {
        int regionValue1428;
        java.lang.Object regionValue1427;
        int regionValue1424;
        int regionValue1432;
        int regionValue1431;
        java.lang.Object regionValue1430;
        java.lang.Object regionValue1429;

        region620: {
        int regionValue2249;
        java.lang.Object regionValue2248;
        java.lang.Object regionValue2247;
        int regionValue2246;
        java.lang.Object regionValue2245;
        int regionValue2242;

        region619: {
        int regionValue2232;
        java.lang.Object regionValue2231;
        java.lang.Object regionValue2230;
        int regionValue2229;
        java.lang.Object regionValue2228;
        int regionValue2225;

        region617: {
        int regionValue2197;
        java.lang.Object regionValue2196;
        java.lang.Object regionValue2195;
        int regionValue2194;
        java.lang.Object regionValue2193;
        int regionValue2190;

        region616: {
        int regionValue2023;
        java.lang.Object regionValue2022;
        java.lang.Object regionValue2021;
        int regionValue2020;
        java.lang.Object regionValue2019;
        int regionValue2016;
        int comparison2162;

        region612: {
        int regionValue1971;
        java.lang.Object regionValue1970;
        java.lang.Object regionValue1969;
        int regionValue1968;
        java.lang.Object regionValue1967;
        int regionValue1964;

        region611: {
        int regionValue1482;
        java.lang.Object regionValue1484;
        java.lang.Object regionValue1483;
        java.lang.Object regionValue1481;
        int regionValue1478;

        region610: {
        int regionValue2115;
        java.lang.Object regionValue2114;
        java.lang.Object regionValue2113;
        java.lang.Object regionValue2112;
        int regionValue2109;
        int value2161;

        region609: {
        java.lang.Object value2160;
        java.lang.Object value2159;
        int value2157;
        java.lang.Object value2154;
        java.lang.Object value2153;
        java.lang.Object value2152;
        java.lang.Object value2151;
        java.lang.Object value2150;
        java.lang.Object value2149;
        java.lang.Object regionValue2148;
        java.lang.Object regionValue2147;
        int regionValue2146;
        java.lang.Object regionValue2145;
        int regionValue2142;

        region574: {
        int regionValue2132;
        java.lang.Object regionValue2131;
        java.lang.Object regionValue2130;
        int regionValue2129;
        java.lang.Object regionValue2128;
        int regionValue2125;

        region570: {
        int regionValue1881;
        java.lang.Object regionValue1880;
        java.lang.Object regionValue1879;
        java.lang.Object regionValue1877;
        int regionValue1874;
        int regionValue1878;

        region569: {
        int regionValue1674;
        java.lang.Object regionValue1673;
        java.lang.Object regionValue1672;
        int regionValue1671;
        java.lang.Object regionValue1670;
        int regionValue1667;

        region568: {
        int regionValue1722;
        java.lang.Object regionValue1724;
        java.lang.Object regionValue1723;
        java.lang.Object regionValue1721;
        int regionValue1718;
        boolean value2099;
        java.lang.Object value2098;
        int value2096;

        region551: {
        java.lang.Object regionValue2093;
        java.lang.Object regionValue2092;
        int regionValue2091;
        java.lang.Object regionValue2090;
        int regionValue2087;
        int regionValue2094;

        region550: {
        int regionValue2077;
        java.lang.Object regionValue2076;
        java.lang.Object regionValue2075;
        int regionValue2074;
        java.lang.Object regionValue2073;
        int regionValue2070;

        region548: {
        int regionValue2059;
        java.lang.Object regionValue2058;
        java.lang.Object regionValue2057;
        int regionValue2056;
        java.lang.Object regionValue2055;
        int regionValue2052;

        region547: {
        int regionValue2041;
        java.lang.Object regionValue2040;
        java.lang.Object regionValue2039;
        int regionValue2038;
        java.lang.Object regionValue2037;
        int regionValue2034;

        region545: {
        java.lang.Object regionValue2001;
        java.lang.Object regionValue2004;
        java.lang.Object regionValue2003;
        int regionValue2002;
        int regionValue1998;
        int arrayValue2005;
        int comparison2006;

        region537: {
        java.lang.Object regionValue1987;
        java.lang.Object regionValue1986;
        int regionValue1985;
        java.lang.Object regionValue1984;
        int regionValue1981;
        int regionValue1988;

        region536: {
        int regionValue1760;
        java.lang.Object regionValue1759;
        java.lang.Object regionValue1758;
        int regionValue1757;
        java.lang.Object regionValue1756;
        int regionValue1753;

        region535: {
        int regionValue1796;
        java.lang.Object regionValue1795;
        java.lang.Object regionValue1794;
        int regionValue1793;
        java.lang.Object regionValue1792;
        int regionValue1789;

        region534: {
        java.lang.Object regionValue1846;
        java.lang.Object regionValue1845;
        int regionValue1844;
        java.lang.Object regionValue1843;
        int regionValue1840;
        boolean value1954;
        java.lang.Object arrayValue1953;

        region527: {
        java.lang.Object regionValue1951;
        java.lang.Object regionValue1950;
        int regionValue1949;
        java.lang.Object regionValue1948;
        int regionValue1945;
        int regionValue1952;

        region526: {
        int regionValue1935;
        java.lang.Object regionValue1934;
        java.lang.Object regionValue1933;
        int regionValue1932;
        java.lang.Object regionValue1931;
        int regionValue1928;

        region524: {
        int regionValue1917;
        java.lang.Object regionValue1916;
        java.lang.Object regionValue1915;
        int regionValue1914;
        java.lang.Object regionValue1913;
        int regionValue1910;

        region523: {
        int regionValue1899;
        java.lang.Object regionValue1898;
        java.lang.Object regionValue1897;
        int regionValue1896;
        java.lang.Object regionValue1895;
        int regionValue1892;

        region521: {
        java.lang.Object regionValue1859;
        java.lang.Object regionValue1862;
        java.lang.Object regionValue1861;
        int regionValue1860;
        int regionValue1856;
        int arrayValue1863;
        int comparison1864;

        region513: {
        java.lang.Object regionValue1829;
        java.lang.Object regionValue1828;
        int regionValue1827;
        java.lang.Object regionValue1826;
        int regionValue1823;
        int regionValue1830;

        region512: {
        int regionValue1813;
        java.lang.Object regionValue1812;
        java.lang.Object regionValue1811;
        int regionValue1810;
        java.lang.Object regionValue1809;
        int regionValue1806;

        region510: {
        int regionValue1778;
        java.lang.Object regionValue1777;
        java.lang.Object regionValue1776;
        int regionValue1775;
        java.lang.Object regionValue1774;
        int regionValue1771;

        region509: {
        int regionValue1536;
        java.lang.Object regionValue1535;
        java.lang.Object regionValue1534;
        int regionValue1533;
        java.lang.Object regionValue1532;
        int regionValue1529;
        int comparison1743;

        region505: {
        int regionValue1590;
        java.lang.Object regionValue1589;
        java.lang.Object regionValue1588;
        int regionValue1587;
        java.lang.Object regionValue1586;
        int regionValue1583;

        region504: {
        java.lang.Object regionValue1640;
        java.lang.Object regionValue1639;
        int regionValue1638;
        java.lang.Object regionValue1637;
        int regionValue1634;
        boolean value1742;
        java.lang.Object arrayValue1741;

        region497: {
        java.lang.Object regionValue1740;
        java.lang.Object regionValue1739;
        int regionValue1738;
        java.lang.Object regionValue1737;
        int regionValue1734;

        region495: {
        java.lang.Object regionValue1707;
        java.lang.Object regionValue1706;
        int regionValue1705;
        java.lang.Object regionValue1704;
        int regionValue1701;
        int regionValue1708;

        region494: {
        int regionValue1691;
        java.lang.Object regionValue1690;
        java.lang.Object regionValue1689;
        int regionValue1688;
        java.lang.Object regionValue1687;
        int regionValue1684;

        region492: {
        java.lang.Object regionValue1653;
        java.lang.Object regionValue1656;
        java.lang.Object regionValue1655;
        int regionValue1654;
        int regionValue1650;
        int arrayValue1657;

        region487: {
        java.lang.Object regionValue1623;
        java.lang.Object regionValue1622;
        int regionValue1621;
        java.lang.Object regionValue1620;
        int regionValue1617;
        int regionValue1624;

        region486: {
        int regionValue1607;
        java.lang.Object regionValue1606;
        java.lang.Object regionValue1605;
        int regionValue1604;
        java.lang.Object regionValue1603;
        int regionValue1600;

        region484: {
        int regionValue1572;
        java.lang.Object regionValue1571;
        java.lang.Object regionValue1570;
        int regionValue1569;
        java.lang.Object regionValue1568;
        int regionValue1565;

        region483: {
        int regionValue1554;
        java.lang.Object regionValue1553;
        java.lang.Object regionValue1552;
        int regionValue1551;
        java.lang.Object regionValue1550;
        int regionValue1547;

        region481: {
        java.lang.Object regionValue1516;
        boolean value1518;
        java.lang.Object regionValue1515;
        int regionValue1514;
        java.lang.Object regionValue1513;
        int regionValue1510;
        int comparison1519;
        java.lang.Object arrayValue1517;

        region471: {
        java.lang.Object regionValue1500;
        java.lang.Object regionValue1499;
        int regionValue1498;
        java.lang.Object regionValue1497;
        int regionValue1494;

        region469: {
        java.lang.Object regionValue1466;
        java.lang.Object regionValue1465;
        int regionValue1464;
        java.lang.Object regionValue1463;
        int regionValue1460;
        int regionValue1468;
        int regionValue1467;

        region468: {
        int regionValue1450;
        int regionValue1449;
        java.lang.Object regionValue1448;
        java.lang.Object regionValue1447;
        int regionValue1446;
        java.lang.Object regionValue1445;
        int regionValue1442;

        region466: {
        int regionValue1412;
        java.lang.Object regionValue1414;
        java.lang.Object regionValue1413;
        java.lang.Object regionValue1411;
        int regionValue1408;

        region462: {
        java.lang.Object regionValue1398;
        java.lang.Object regionValue1397;
        int regionValue1396;
        java.lang.Object regionValue1395;
        int regionValue1392;

        region460: {
        java.lang.Object regionValue1365;
        java.lang.Object regionValue1364;
        int regionValue1363;
        java.lang.Object regionValue1362;
        int regionValue1359;
        java.lang.Object regionValue1366;

        region459: {
        java.lang.Object regionValue1349;
        java.lang.Object regionValue1348;
        java.lang.Object regionValue1347;
        int regionValue1346;
        java.lang.Object regionValue1345;
        int regionValue1342;

        region457: {
        java.lang.Object value1315;
        java.lang.Object regionValue1309;
        java.lang.Object regionValue1308;
        int regionValue1307;
        java.lang.Object regionValue1306;
        int regionValue1303;
        java.lang.Object value1314;
        java.lang.Object value1313;
        java.lang.Object value1312;
        java.lang.Object value1311;
        java.lang.Object value1310;

        region444: {
        java.lang.Object regionValue1292;
        java.lang.Object regionValue1291;
        int regionValue1290;
        java.lang.Object regionValue1289;
        int regionValue1286;
        int regionValue1293;

        region443: {
        int regionValue1276;
        java.lang.Object regionValue1275;
        java.lang.Object regionValue1274;
        int regionValue1273;
        java.lang.Object regionValue1272;
        int regionValue1269;

        region441: {
        int regionValue1258;
        java.lang.Object regionValue1257;
        java.lang.Object regionValue1256;
        int regionValue1255;
        java.lang.Object regionValue1254;
        int regionValue1251;

        region440: {
        int regionValue1240;
        java.lang.Object regionValue1239;
        java.lang.Object regionValue1238;
        int regionValue1237;
        java.lang.Object regionValue1236;
        int regionValue1233;

        region438: {
        double value1203;
        double converted1198;
        java.lang.Object regionValue1196;
        java.lang.Object regionValue1195;
        int regionValue1194;
        java.lang.Object regionValue1193;
        int regionValue1190;
        int comparison1204;
        java.lang.Object value1202;
        java.lang.Object value1201;
        java.lang.Object value1199;
        int comparison1205;
        int arrayValue1197;

        region415: {
        java.lang.Object regionValue1163;
        java.lang.Object regionValue1162;
        int regionValue1161;
        java.lang.Object regionValue1160;
        int regionValue1157;
        int regionValue1164;

        region414: {
        int regionValue890;
        java.lang.Object regionValue889;
        java.lang.Object regionValue888;
        int regionValue887;
        java.lang.Object regionValue886;
        int regionValue883;

        region413: {
        int regionValue926;
        java.lang.Object regionValue925;
        java.lang.Object regionValue924;
        int regionValue923;
        java.lang.Object regionValue922;
        int regionValue919;

        region412: {
        int regionValue1124;
        java.lang.Object regionValue1130;
        java.lang.Object regionValue1129;
        int regionValue1128;
        java.lang.Object regionValue1127;

        region409: {
        int regionValue957;
        java.lang.Object regionValue956;
        int regionValue953;
        java.lang.Object regionValue959;
        java.lang.Object regionValue958;
        int comparison1100;

        region405: {
        int regionValue1009;
        java.lang.Object regionValue1008;
        java.lang.Object regionValue1007;
        int regionValue1006;
        java.lang.Object regionValue1005;
        int regionValue1002;

        region379: {
        int value992;
        java.lang.Object regionValue991;
        java.lang.Object regionValue990;
        int regionValue989;
        java.lang.Object regionValue988;
        int regionValue985;

        region377: {
        java.lang.Object regionValue975;
        java.lang.Object regionValue974;
        int regionValue973;
        java.lang.Object regionValue972;
        int regionValue969;

        region375: {
        java.lang.Object regionValue942;
        java.lang.Object regionValue941;
        int regionValue940;
        java.lang.Object regionValue939;
        int regionValue936;
        int regionValue943;

        region373: {
        int regionValue908;
        java.lang.Object regionValue907;
        java.lang.Object regionValue906;
        int regionValue905;
        java.lang.Object regionValue904;
        int regionValue901;

        region372: {
        int comparison873;

        comparison873 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison873 <= 0) {
            regionValue883 = regionValue865;
            regionValue886 = regionValue868;
            regionValue887 = regionValue869;
            regionValue888 = regionValue870;
            regionValue889 = regionValue871;
            regionValue890 = regionValue872;
            break region413;
        } else {
            regionValue901 = regionValue865;
            regionValue904 = regionValue868;
            regionValue905 = regionValue869;
            regionValue906 = regionValue870;
            regionValue907 = regionValue871;
            regionValue908 = regionValue872;
            break region372;
        }
        }
        if (value24 == 0) {
            regionValue919 = regionValue901;
            regionValue922 = regionValue904;
            regionValue923 = regionValue905;
            regionValue924 = regionValue906;
            regionValue925 = regionValue907;
            regionValue926 = regionValue908;
            break region412;
        } else {
            regionValue936 = regionValue901;
            regionValue939 = regionValue904;
            regionValue940 = regionValue905;
            regionValue941 = regionValue906;
            regionValue942 = regionValue907;
            regionValue943 = regionValue908;
            break region373;
        }
        }
        if (regionValue943 >= 5) {
            regionValue953 = regionValue936;
            regionValue956 = regionValue939;
            regionValue957 = regionValue940;
            regionValue958 = regionValue941;
            regionValue959 = regionValue942;
            break region405;
        } else {
            regionValue969 = regionValue936;
            regionValue972 = regionValue939;
            regionValue973 = regionValue940;
            regionValue974 = regionValue941;
            regionValue975 = regionValue942;
            break region375;
        }
        }
        regionValue985 = regionValue969;
        regionValue988 = regionValue972;
        regionValue989 = regionValue973;
        regionValue990 = regionValue974;
        regionValue991 = regionValue975;
        break region377;
        }
        value992 = 0;
        regionValue1002 = regionValue985;
        regionValue1005 = regionValue988;
        regionValue1006 = regionValue989;
        regionValue1007 = regionValue990;
        regionValue1008 = regionValue991;
        regionValue1009 = value992;
        break region379;
        }
        loop379: while (true) {
        java.lang.Object regionValue1063;
        java.lang.Object regionValue1062;
        int regionValue1061;
        java.lang.Object regionValue1060;
        int regionValue1057;
        int regionValue1064;
        int incremented1099;

        region402: {
        java.lang.Object regionValue1094;
        int regionValue1098;
        java.lang.Object regionValue1097;
        java.lang.Object regionValue1096;
        int regionValue1095;
        int regionValue1091;

        region393: {
        int regionValue1081;
        java.lang.Object regionValue1080;
        java.lang.Object regionValue1079;
        int regionValue1078;
        java.lang.Object regionValue1077;
        int regionValue1074;

        region391: {
        int regionValue1046;
        java.lang.Object regionValue1045;
        java.lang.Object regionValue1044;
        int regionValue1043;
        java.lang.Object regionValue1042;
        int regionValue1039;
        int regionValue1047;

        region390: {
        java.lang.Object regionValue1026;
        boolean value1029;
        int regionValue1027;
        java.lang.Object regionValue1025;
        int regionValue1024;
        java.lang.Object regionValue1023;
        int regionValue1020;
        java.lang.Object arrayValue1028;

        region383: {
        int length1010;

        length1010 = java.lang.reflect.Array.getLength(value498);
        if (regionValue1009 >= length1010) {
            regionValue953 = regionValue1002;
            regionValue956 = regionValue1005;
            regionValue957 = regionValue1006;
            regionValue958 = regionValue1007;
            regionValue959 = regionValue1008;
            break region405;
        } else {
            regionValue1020 = regionValue1002;
            regionValue1023 = regionValue1005;
            regionValue1024 = regionValue1006;
            regionValue1025 = regionValue1007;
            regionValue1026 = regionValue1008;
            regionValue1027 = regionValue1009;
            break region383;
        }
        }
        arrayValue1028 = ((java.lang.Object[]) value498)[regionValue1027];
        value1029 = recovery$indy$flow$211(arrayValue1028, regionValue1026);
        if (value24 == 0) {
            regionValue919 = regionValue1020;
            regionValue922 = regionValue1023;
            regionValue923 = regionValue1024;
            regionValue924 = regionValue1025;
            regionValue925 = regionValue1026;
            regionValue926 = (int) ((value1029 ? 1 : 0));
            break region412;
        } else {
            regionValue1039 = regionValue1020;
            regionValue1042 = regionValue1023;
            regionValue1043 = regionValue1024;
            regionValue1044 = regionValue1025;
            regionValue1045 = regionValue1026;
            regionValue1046 = regionValue1027;
            regionValue1047 = (int) ((value1029 ? 1 : 0));
            break region390;
        }
        }
        if (regionValue1047 == 0) {
            regionValue1057 = regionValue1039;
            regionValue1060 = regionValue1042;
            regionValue1061 = regionValue1043;
            regionValue1062 = regionValue1044;
            regionValue1063 = regionValue1045;
            regionValue1064 = regionValue1046;
            break region402;
        } else {
            regionValue1074 = regionValue1039;
            regionValue1077 = regionValue1042;
            regionValue1078 = regionValue1043;
            regionValue1079 = regionValue1044;
            regionValue1080 = regionValue1045;
            regionValue1081 = regionValue1046;
            break region391;
        }
        }
        regionValue1091 = regionValue1074;
        regionValue1094 = regionValue1077;
        regionValue1095 = regionValue1078;
        regionValue1096 = regionValue1079;
        regionValue1097 = regionValue1080;
        regionValue1098 = regionValue1081;
        break region393;
        }
        recovery$indy$flow$212(this, true);
        if (regionValue1094 instanceof boolean[]) {
            ((boolean[]) regionValue1094)[regionValue1098] = true;
        } else {
            ((byte[]) regionValue1094)[regionValue1098] = (byte) (1);
        }
        regionValue1057 = regionValue1091;
        regionValue1060 = regionValue1094;
        regionValue1061 = regionValue1095;
        regionValue1062 = regionValue1096;
        regionValue1063 = regionValue1097;
        regionValue1064 = regionValue1098;
        break region402;
        }
        incremented1099 = regionValue1064 + (1);
        if (value24 != 0) {
            regionValue1002 = regionValue1057;
            regionValue1005 = regionValue1060;
            regionValue1006 = regionValue1061;
            regionValue1007 = regionValue1062;
            regionValue1008 = regionValue1063;
            regionValue1009 = incremented1099;
            continue loop379;
        } else {
            regionValue953 = regionValue1057;
            regionValue956 = regionValue1060;
            regionValue957 = regionValue1061;
            regionValue958 = regionValue1062;
            regionValue959 = regionValue1063;
            break region405;
        }
        }
        }
        comparison1100 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1100 <= 0) {
            regionValue1110 = regionValue953;
            regionValue1113 = regionValue956;
            regionValue1114 = regionValue957;
            break region1114;
        } else {
            regionValue1124 = regionValue953;
            regionValue1127 = regionValue956;
            regionValue1128 = regionValue957;
            regionValue1129 = regionValue958;
            regionValue1130 = regionValue959;
            break region409;
        }
        }
        regionValue919 = regionValue1124;
        regionValue922 = regionValue1127;
        regionValue923 = regionValue1128;
        regionValue924 = regionValue1129;
        regionValue925 = regionValue1130;
        regionValue926 = regionValue1124;
        break region412;
        }
        regionValue883 = regionValue919;
        regionValue886 = regionValue922;
        regionValue887 = regionValue923;
        regionValue888 = regionValue924;
        regionValue889 = regionValue925;
        regionValue890 = regionValue926;
        break region413;
        }
        if (value24 == 0) {
            regionValue1140 = regionValue883;
            regionValue1143 = regionValue886;
            regionValue1144 = regionValue887;
            regionValue1145 = regionValue888;
            regionValue1146 = regionValue889;
            regionValue1147 = regionValue890;
            break region861;
        } else {
            regionValue1157 = regionValue883;
            regionValue1160 = regionValue886;
            regionValue1161 = regionValue887;
            regionValue1162 = regionValue888;
            regionValue1163 = regionValue889;
            regionValue1164 = regionValue890;
            break region414;
        }
        }
        if (regionValue1164 <= 0) {
            regionValue1174 = regionValue1157;
            regionValue1177 = regionValue1160;
            regionValue1178 = regionValue1161;
            regionValue1179 = regionValue1162;
            regionValue1180 = regionValue1163;
            break region860;
        } else {
            regionValue1190 = regionValue1157;
            regionValue1193 = regionValue1160;
            regionValue1194 = regionValue1161;
            regionValue1195 = regionValue1162;
            regionValue1196 = regionValue1163;
            break region415;
        }
        }
        arrayValue1197 = ((int[]) value214)[4];
        converted1198 = (double) (arrayValue1197);
        value1199 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingReCraftIfSoupsLowerThan));
        value1201 = value1199;
        value1202 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1201))))));
        value1203 = recovery$indy$flow$215(value1202, computed13);
        comparison1204 = (java.lang.Double.isNaN(converted1198) || java.lang.Double.isNaN(value1203) ? 1 : (converted1198 > value1203 ? 1 : converted1198 == value1203 ? 0 : -1));
        comparison1205 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1205 <= 0) {
            regionValue1215 = regionValue1190;
            regionValue1218 = regionValue1193;
            regionValue1219 = regionValue1194;
            regionValue1220 = regionValue1195;
            regionValue1221 = regionValue1196;
            regionValue1222 = comparison1204;
            break region862;
        } else {
            regionValue1233 = regionValue1190;
            regionValue1236 = regionValue1193;
            regionValue1237 = regionValue1194;
            regionValue1238 = regionValue1195;
            regionValue1239 = regionValue1196;
            regionValue1240 = comparison1204;
            break region438;
        }
        }
        regionValue1251 = regionValue1233;
        regionValue1254 = regionValue1236;
        regionValue1255 = regionValue1237;
        regionValue1256 = regionValue1238;
        regionValue1257 = regionValue1239;
        regionValue1258 = regionValue1240;
        break region440;
        }
        if (value24 == 0) {
            regionValue1140 = regionValue1251;
            regionValue1143 = regionValue1254;
            regionValue1144 = regionValue1255;
            regionValue1145 = regionValue1256;
            regionValue1146 = regionValue1257;
            regionValue1147 = regionValue1258;
            break region861;
        } else {
            regionValue1269 = regionValue1251;
            regionValue1272 = regionValue1254;
            regionValue1273 = regionValue1255;
            regionValue1274 = regionValue1256;
            regionValue1275 = regionValue1257;
            regionValue1276 = regionValue1258;
            break region441;
        }
        }
        regionValue1286 = regionValue1269;
        regionValue1289 = regionValue1272;
        regionValue1290 = regionValue1273;
        regionValue1291 = regionValue1274;
        regionValue1292 = regionValue1275;
        regionValue1293 = regionValue1276;
        break region443;
        }
        if (regionValue1293 > 0) {
            regionValue1174 = regionValue1286;
            regionValue1177 = regionValue1289;
            regionValue1178 = regionValue1290;
            regionValue1179 = regionValue1291;
            regionValue1180 = regionValue1292;
            break region860;
        } else {
            regionValue1303 = regionValue1286;
            regionValue1306 = regionValue1289;
            regionValue1307 = regionValue1290;
            regionValue1308 = regionValue1291;
            regionValue1309 = regionValue1292;
            break region444;
        }
        }
        value1310 = recovery$indy$flow$216();
        value1311 = value1310;
        value1312 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1311))))));
        value1313 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1312)))).field_42P));
        value1314 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value1313)))).field_42X));
        value1315 = recovery$indy$flow$220(value1314);
        if (value24 == 0) {
            regionValue1325 = regionValue1303;
            regionValue1328 = regionValue1306;
            regionValue1329 = regionValue1307;
            regionValue1330 = regionValue1308;
            regionValue1331 = regionValue1309;
            regionValue1332 = value1315;
            break region740;
        } else {
            regionValue1342 = regionValue1303;
            regionValue1345 = regionValue1306;
            regionValue1346 = regionValue1307;
            regionValue1347 = regionValue1308;
            regionValue1348 = regionValue1309;
            regionValue1349 = value1315;
            break region457;
        }
        }
        regionValue1359 = regionValue1342;
        regionValue1362 = regionValue1345;
        regionValue1363 = regionValue1346;
        regionValue1364 = regionValue1347;
        regionValue1365 = regionValue1348;
        regionValue1366 = regionValue1349;
        break region459;
        }
        if (regionValue1366 != null) {
            regionValue1376 = regionValue1359;
            regionValue1379 = regionValue1362;
            regionValue1380 = regionValue1363;
            regionValue1381 = regionValue1364;
            regionValue1382 = regionValue1365;
            break region727;
        } else {
            regionValue1392 = regionValue1359;
            regionValue1395 = regionValue1362;
            regionValue1396 = regionValue1363;
            regionValue1397 = regionValue1364;
            regionValue1398 = regionValue1365;
            break region460;
        }
        }
        regionValue1408 = regionValue1392;
        regionValue1411 = regionValue1395;
        regionValue1412 = regionValue1396;
        regionValue1413 = regionValue1397;
        regionValue1414 = regionValue1398;
        break region462;
        }
        if (value24 == 0) {
            regionValue1424 = regionValue1408;
            regionValue1427 = regionValue1411;
            regionValue1428 = regionValue1412;
            regionValue1429 = regionValue1413;
            regionValue1430 = regionValue1414;
            regionValue1431 = regionValue1412;
            regionValue1432 = 8;
            break region620;
        } else {
            regionValue1442 = regionValue1408;
            regionValue1445 = regionValue1411;
            regionValue1446 = regionValue1412;
            regionValue1447 = regionValue1413;
            regionValue1448 = regionValue1414;
            regionValue1449 = regionValue1412;
            regionValue1450 = 8;
            break region466;
        }
        }
        regionValue1460 = regionValue1442;
        regionValue1463 = regionValue1445;
        regionValue1464 = regionValue1446;
        regionValue1465 = regionValue1447;
        regionValue1466 = regionValue1448;
        regionValue1467 = regionValue1449;
        regionValue1468 = regionValue1450;
        break region468;
        }
        if (regionValue1467 <= regionValue1468) {
            regionValue1478 = regionValue1460;
            regionValue1481 = regionValue1463;
            regionValue1482 = regionValue1464;
            regionValue1483 = regionValue1465;
            regionValue1484 = regionValue1466;
            break region610;
        } else {
            regionValue1494 = regionValue1460;
            regionValue1497 = regionValue1463;
            regionValue1498 = regionValue1464;
            regionValue1499 = regionValue1465;
            regionValue1500 = regionValue1466;
            break region469;
        }
        }
        regionValue1510 = regionValue1494;
        regionValue1513 = regionValue1497;
        regionValue1514 = regionValue1498;
        regionValue1515 = regionValue1499;
        regionValue1516 = regionValue1500;
        break region471;
        }
        arrayValue1517 = ((java.lang.Object[]) value498)[0];
        value1518 = recovery$indy$flow$221(regionValue1516, arrayValue1517);
        comparison1519 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1519 <= 0) {
            regionValue1529 = regionValue1510;
            regionValue1532 = regionValue1513;
            regionValue1533 = regionValue1514;
            regionValue1534 = regionValue1515;
            regionValue1535 = regionValue1516;
            regionValue1536 = (int) ((value1518 ? 1 : 0));
            break region505;
        } else {
            regionValue1547 = regionValue1510;
            regionValue1550 = regionValue1513;
            regionValue1551 = regionValue1514;
            regionValue1552 = regionValue1515;
            regionValue1553 = regionValue1516;
            regionValue1554 = (int) ((value1518 ? 1 : 0));
            break region481;
        }
        }
        regionValue1565 = regionValue1547;
        regionValue1568 = regionValue1550;
        regionValue1569 = regionValue1551;
        regionValue1570 = regionValue1552;
        regionValue1571 = regionValue1553;
        regionValue1572 = regionValue1554;
        break region483;
        }
        if (value24 == 0) {
            regionValue1583 = regionValue1565;
            regionValue1586 = regionValue1568;
            regionValue1587 = regionValue1569;
            regionValue1588 = regionValue1570;
            regionValue1589 = regionValue1571;
            regionValue1590 = regionValue1572;
            break region504;
        } else {
            regionValue1600 = regionValue1565;
            regionValue1603 = regionValue1568;
            regionValue1604 = regionValue1569;
            regionValue1605 = regionValue1570;
            regionValue1606 = regionValue1571;
            regionValue1607 = regionValue1572;
            break region484;
        }
        }
        regionValue1617 = regionValue1600;
        regionValue1620 = regionValue1603;
        regionValue1621 = regionValue1604;
        regionValue1622 = regionValue1605;
        regionValue1623 = regionValue1606;
        regionValue1624 = regionValue1607;
        break region486;
        }
        if (regionValue1624 == 0) {
            regionValue1634 = regionValue1617;
            regionValue1637 = regionValue1620;
            regionValue1638 = regionValue1621;
            regionValue1639 = regionValue1622;
            regionValue1640 = regionValue1623;
            break region497;
        } else {
            regionValue1650 = regionValue1617;
            regionValue1653 = regionValue1620;
            regionValue1654 = regionValue1621;
            regionValue1655 = regionValue1622;
            regionValue1656 = regionValue1623;
            break region487;
        }
        }
        arrayValue1657 = (regionValue1653 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue1653)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue1653)[0]);
        if (value24 == 0) {
            regionValue1667 = regionValue1650;
            regionValue1670 = regionValue1653;
            regionValue1671 = regionValue1654;
            regionValue1672 = regionValue1655;
            regionValue1673 = regionValue1656;
            regionValue1674 = arrayValue1657;
            break region568;
        } else {
            regionValue1684 = regionValue1650;
            regionValue1687 = regionValue1653;
            regionValue1688 = regionValue1654;
            regionValue1689 = regionValue1655;
            regionValue1690 = regionValue1656;
            regionValue1691 = arrayValue1657;
            break region492;
        }
        }
        regionValue1701 = regionValue1684;
        regionValue1704 = regionValue1687;
        regionValue1705 = regionValue1688;
        regionValue1706 = regionValue1689;
        regionValue1707 = regionValue1690;
        regionValue1708 = regionValue1691;
        break region494;
        }
        if (regionValue1708 == 0) {
            regionValue1718 = regionValue1701;
            regionValue1721 = regionValue1704;
            regionValue1722 = regionValue1705;
            regionValue1723 = regionValue1706;
            regionValue1724 = regionValue1707;
            break region551;
        } else {
            regionValue1734 = regionValue1701;
            regionValue1737 = regionValue1704;
            regionValue1738 = regionValue1705;
            regionValue1739 = regionValue1706;
            regionValue1740 = regionValue1707;
            break region495;
        }
        }
        regionValue1634 = regionValue1734;
        regionValue1637 = regionValue1737;
        regionValue1638 = regionValue1738;
        regionValue1639 = regionValue1739;
        regionValue1640 = regionValue1740;
        break region497;
        }
        arrayValue1741 = ((java.lang.Object[]) value498)[1];
        value1742 = recovery$indy$flow$222(regionValue1640, arrayValue1741);
        regionValue1583 = regionValue1634;
        regionValue1586 = regionValue1637;
        regionValue1587 = regionValue1638;
        regionValue1588 = regionValue1639;
        regionValue1589 = regionValue1640;
        regionValue1590 = (int) ((value1742 ? 1 : 0));
        break region504;
        }
        regionValue1529 = regionValue1583;
        regionValue1532 = regionValue1586;
        regionValue1533 = regionValue1587;
        regionValue1534 = regionValue1588;
        regionValue1535 = regionValue1589;
        regionValue1536 = regionValue1590;
        break region505;
        }
        comparison1743 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1743 < 0) {
            regionValue1753 = regionValue1529;
            regionValue1756 = regionValue1532;
            regionValue1757 = regionValue1533;
            regionValue1758 = regionValue1534;
            regionValue1759 = regionValue1535;
            regionValue1760 = regionValue1536;
            break region535;
        } else {
            regionValue1771 = regionValue1529;
            regionValue1774 = regionValue1532;
            regionValue1775 = regionValue1533;
            regionValue1776 = regionValue1534;
            regionValue1777 = regionValue1535;
            regionValue1778 = regionValue1536;
            break region509;
        }
        }
        if (value24 == 0) {
            regionValue1789 = regionValue1771;
            regionValue1792 = regionValue1774;
            regionValue1793 = regionValue1775;
            regionValue1794 = regionValue1776;
            regionValue1795 = regionValue1777;
            regionValue1796 = regionValue1778;
            break region534;
        } else {
            regionValue1806 = regionValue1771;
            regionValue1809 = regionValue1774;
            regionValue1810 = regionValue1775;
            regionValue1811 = regionValue1776;
            regionValue1812 = regionValue1777;
            regionValue1813 = regionValue1778;
            break region510;
        }
        }
        regionValue1823 = regionValue1806;
        regionValue1826 = regionValue1809;
        regionValue1827 = regionValue1810;
        regionValue1828 = regionValue1811;
        regionValue1829 = regionValue1812;
        regionValue1830 = regionValue1813;
        break region512;
        }
        if (regionValue1830 == 0) {
            regionValue1840 = regionValue1823;
            regionValue1843 = regionValue1826;
            regionValue1844 = regionValue1827;
            regionValue1845 = regionValue1828;
            regionValue1846 = regionValue1829;
            break region527;
        } else {
            regionValue1856 = regionValue1823;
            regionValue1859 = regionValue1826;
            regionValue1860 = regionValue1827;
            regionValue1861 = regionValue1828;
            regionValue1862 = regionValue1829;
            break region513;
        }
        }
        arrayValue1863 = (regionValue1859 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue1859)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue1859)[1]);
        comparison1864 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1864 < 0) {
            regionValue1874 = regionValue1856;
            regionValue1877 = regionValue1859;
            regionValue1878 = regionValue1860;
            regionValue1879 = regionValue1861;
            regionValue1880 = regionValue1862;
            regionValue1881 = arrayValue1863;
            break region569;
        } else {
            regionValue1892 = regionValue1856;
            regionValue1895 = regionValue1859;
            regionValue1896 = regionValue1860;
            regionValue1897 = regionValue1861;
            regionValue1898 = regionValue1862;
            regionValue1899 = arrayValue1863;
            break region521;
        }
        }
        regionValue1910 = regionValue1892;
        regionValue1913 = regionValue1895;
        regionValue1914 = regionValue1896;
        regionValue1915 = regionValue1897;
        regionValue1916 = regionValue1898;
        regionValue1917 = regionValue1899;
        break region523;
        }
        if (value24 == 0) {
            regionValue1667 = regionValue1910;
            regionValue1670 = regionValue1913;
            regionValue1671 = regionValue1914;
            regionValue1672 = regionValue1915;
            regionValue1673 = regionValue1916;
            regionValue1674 = regionValue1917;
            break region568;
        } else {
            regionValue1928 = regionValue1910;
            regionValue1931 = regionValue1913;
            regionValue1932 = regionValue1914;
            regionValue1933 = regionValue1915;
            regionValue1934 = regionValue1916;
            regionValue1935 = regionValue1917;
            break region524;
        }
        }
        regionValue1945 = regionValue1928;
        regionValue1948 = regionValue1931;
        regionValue1949 = regionValue1932;
        regionValue1950 = regionValue1933;
        regionValue1951 = regionValue1934;
        regionValue1952 = regionValue1935;
        break region526;
        }
        if (regionValue1952 == 0) {
            regionValue1718 = regionValue1945;
            regionValue1721 = regionValue1948;
            regionValue1722 = regionValue1949;
            regionValue1723 = regionValue1950;
            regionValue1724 = regionValue1951;
            break region551;
        } else {
            regionValue1840 = regionValue1945;
            regionValue1843 = regionValue1948;
            regionValue1844 = regionValue1949;
            regionValue1845 = regionValue1950;
            regionValue1846 = regionValue1951;
            break region527;
        }
        }
        arrayValue1953 = ((java.lang.Object[]) value498)[2];
        value1954 = recovery$indy$flow$223(regionValue1846, arrayValue1953);
        regionValue1789 = regionValue1840;
        regionValue1792 = regionValue1843;
        regionValue1793 = regionValue1844;
        regionValue1794 = regionValue1845;
        regionValue1795 = regionValue1846;
        regionValue1796 = (int) ((value1954 ? 1 : 0));
        break region534;
        }
        regionValue1753 = regionValue1789;
        regionValue1756 = regionValue1792;
        regionValue1757 = regionValue1793;
        regionValue1758 = regionValue1794;
        regionValue1759 = regionValue1795;
        regionValue1760 = regionValue1796;
        break region535;
        }
        if (value24 == 0) {
            regionValue1964 = regionValue1753;
            regionValue1967 = regionValue1756;
            regionValue1968 = regionValue1757;
            regionValue1969 = regionValue1758;
            regionValue1970 = regionValue1759;
            regionValue1971 = regionValue1760;
            break region611;
        } else {
            regionValue1981 = regionValue1753;
            regionValue1984 = regionValue1756;
            regionValue1985 = regionValue1757;
            regionValue1986 = regionValue1758;
            regionValue1987 = regionValue1759;
            regionValue1988 = regionValue1760;
            break region536;
        }
        }
        if (regionValue1988 == 0) {
            regionValue1478 = regionValue1981;
            regionValue1481 = regionValue1984;
            regionValue1482 = regionValue1985;
            regionValue1483 = regionValue1986;
            regionValue1484 = regionValue1987;
            break region610;
        } else {
            regionValue1998 = regionValue1981;
            regionValue2001 = regionValue1984;
            regionValue2002 = regionValue1985;
            regionValue2003 = regionValue1986;
            regionValue2004 = regionValue1987;
            break region537;
        }
        }
        arrayValue2005 = (regionValue2001 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2001)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2001)[2]);
        comparison2006 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2006 <= 0) {
            regionValue2016 = regionValue1998;
            regionValue2019 = regionValue2001;
            regionValue2020 = regionValue2002;
            regionValue2021 = regionValue2003;
            regionValue2022 = regionValue2004;
            regionValue2023 = arrayValue2005;
            break region612;
        } else {
            regionValue2034 = regionValue1998;
            regionValue2037 = regionValue2001;
            regionValue2038 = regionValue2002;
            regionValue2039 = regionValue2003;
            regionValue2040 = regionValue2004;
            regionValue2041 = arrayValue2005;
            break region545;
        }
        }
        regionValue2052 = regionValue2034;
        regionValue2055 = regionValue2037;
        regionValue2056 = regionValue2038;
        regionValue2057 = regionValue2039;
        regionValue2058 = regionValue2040;
        regionValue2059 = regionValue2041;
        break region547;
        }
        if (value24 == 0) {
            regionValue1964 = regionValue2052;
            regionValue1967 = regionValue2055;
            regionValue1968 = regionValue2056;
            regionValue1969 = regionValue2057;
            regionValue1970 = regionValue2058;
            regionValue1971 = regionValue2059;
            break region611;
        } else {
            regionValue2070 = regionValue2052;
            regionValue2073 = regionValue2055;
            regionValue2074 = regionValue2056;
            regionValue2075 = regionValue2057;
            regionValue2076 = regionValue2058;
            regionValue2077 = regionValue2059;
            break region548;
        }
        }
        regionValue2087 = regionValue2070;
        regionValue2090 = regionValue2073;
        regionValue2091 = regionValue2074;
        regionValue2092 = regionValue2075;
        regionValue2093 = regionValue2076;
        regionValue2094 = regionValue2077;
        break region550;
        }
        if (regionValue2094 != 0) {
            regionValue1478 = regionValue2087;
            regionValue1481 = regionValue2090;
            regionValue1482 = regionValue2091;
            regionValue1483 = regionValue2092;
            regionValue1484 = regionValue2093;
            break region610;
        } else {
            regionValue1718 = regionValue2087;
            regionValue1721 = regionValue2090;
            regionValue1722 = regionValue2091;
            regionValue1723 = regionValue2092;
            regionValue1724 = regionValue2093;
            break region551;
        }
        }
        value2096 = regionValue1722;
        value2098 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value2099 = recovery$indy$flow$225(value2098, value2096, computed21);
        regionValue1667 = regionValue1718;
        regionValue1670 = regionValue1721;
        regionValue1671 = regionValue1722;
        regionValue1672 = regionValue1723;
        regionValue1673 = regionValue1724;
        regionValue1674 = (int) ((value2099 ? 1 : 0));
        break region568;
        }
        regionValue1874 = regionValue1667;
        regionValue1877 = regionValue1670;
        regionValue1878 = regionValue1671;
        regionValue1879 = regionValue1672;
        regionValue1880 = regionValue1673;
        regionValue1881 = regionValue1674;
        break region569;
        }
        if (value24 == 0) {
            regionValue2109 = regionValue1874;
            regionValue2112 = regionValue1877;
            regionValue2113 = regionValue1879;
            regionValue2114 = regionValue1880;
            regionValue2115 = regionValue1881;
            break region609;
        } else {
            regionValue2125 = regionValue1874;
            regionValue2128 = regionValue1877;
            regionValue2129 = regionValue1878;
            regionValue2130 = regionValue1879;
            regionValue2131 = regionValue1880;
            regionValue2132 = regionValue1881;
            break region570;
        }
        }
        if (regionValue2132 == 0) {
            regionValue2142 = regionValue2125;
            regionValue2145 = regionValue2128;
            regionValue2146 = regionValue2129;
            regionValue2147 = regionValue2130;
            regionValue2148 = regionValue2131;
            break region574;
        } else {
            break region571;
        }
        }
        recovery$indy$flow$226(this, true);
        value2149 = recovery$indy$flow$227();
        value2150 = value2149;
        value2151 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2150))))));
        value2152 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2151)))).field_42P));
        value2153 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value2152)))).field_429));
        value2154 = value2153;
        value2157 = regionValue2146;
        value2159 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value2160 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value2154))))));
        recovery$indy$flow$233(value2159, value2157, computed9, regionValue496, value2160);
        regionValue2109 = regionValue2142;
        regionValue2112 = regionValue2145;
        regionValue2113 = regionValue2147;
        regionValue2114 = regionValue2148;
        regionValue2115 = 0;
        break region609;
        }
        value2161 = regionValue2115;
        regionValue1478 = regionValue2109;
        regionValue1481 = regionValue2112;
        regionValue1482 = value2161;
        regionValue1483 = regionValue2113;
        regionValue1484 = regionValue2114;
        break region610;
        }
        regionValue1964 = regionValue1478;
        regionValue1967 = regionValue1481;
        regionValue1968 = regionValue1482;
        regionValue1969 = regionValue1483;
        regionValue1970 = regionValue1484;
        regionValue1971 = regionValue1482;
        break region611;
        }
        regionValue2016 = regionValue1964;
        regionValue2019 = regionValue1967;
        regionValue2020 = regionValue1968;
        regionValue2021 = regionValue1969;
        regionValue2022 = regionValue1970;
        regionValue2023 = regionValue1971;
        break region612;
        }
        comparison2162 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2162 < 0) {
            regionValue2172 = regionValue2016;
            regionValue2175 = regionValue2019;
            regionValue2176 = regionValue2020;
            regionValue2177 = regionValue2021;
            regionValue2178 = regionValue2022;
            regionValue2179 = regionValue2023;
            break region627;
        } else {
            regionValue2190 = regionValue2016;
            regionValue2193 = regionValue2019;
            regionValue2194 = regionValue2020;
            regionValue2195 = regionValue2021;
            regionValue2196 = regionValue2022;
            regionValue2197 = regionValue2023;
            break region616;
        }
        }
        if (value24 == 0) {
            regionValue2208 = regionValue2190;
            regionValue2211 = regionValue2193;
            regionValue2212 = regionValue2194;
            regionValue2213 = regionValue2195;
            regionValue2214 = regionValue2196;
            regionValue2215 = regionValue2197;
            break region626;
        } else {
            regionValue2225 = regionValue2190;
            regionValue2228 = regionValue2193;
            regionValue2229 = regionValue2194;
            regionValue2230 = regionValue2195;
            regionValue2231 = regionValue2196;
            regionValue2232 = regionValue2197;
            break region617;
        }
        }
        regionValue2242 = regionValue2225;
        regionValue2245 = regionValue2228;
        regionValue2246 = regionValue2229;
        regionValue2247 = regionValue2230;
        regionValue2248 = regionValue2231;
        regionValue2249 = regionValue2232;
        break region619;
        }
        regionValue1424 = regionValue2242;
        regionValue1427 = regionValue2245;
        regionValue1428 = regionValue2246;
        regionValue1429 = regionValue2247;
        regionValue1430 = regionValue2248;
        regionValue1431 = regionValue2249;
        regionValue1432 = 4;
        break region620;
        }
        if (regionValue1431 <= regionValue1432) {
            regionValue2259 = regionValue1424;
            regionValue2262 = regionValue1427;
            regionValue2263 = regionValue1428;
            break region1113;
        } else {
            regionValue2273 = regionValue1424;
            regionValue2276 = regionValue1427;
            regionValue2277 = regionValue1428;
            regionValue2278 = regionValue1429;
            regionValue2279 = regionValue1430;
            break region621;
        }
        }
        arrayValue2280 = (regionValue2276 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2276)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2276)[0]);
        regionValue2208 = regionValue2273;
        regionValue2211 = regionValue2276;
        regionValue2212 = regionValue2277;
        regionValue2213 = regionValue2278;
        regionValue2214 = regionValue2279;
        regionValue2215 = arrayValue2280;
        break region626;
        }
        regionValue2172 = regionValue2208;
        regionValue2175 = regionValue2211;
        regionValue2176 = regionValue2212;
        regionValue2177 = regionValue2213;
        regionValue2178 = regionValue2214;
        regionValue2179 = regionValue2215;
        break region627;
        }
        comparison2281 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2281 < 0) {
            regionValue2291 = regionValue2172;
            regionValue2294 = regionValue2175;
            regionValue2295 = regionValue2176;
            regionValue2296 = regionValue2177;
            regionValue2297 = regionValue2178;
            regionValue2298 = regionValue2179;
            break region641;
        } else {
            regionValue2309 = regionValue2172;
            regionValue2312 = regionValue2175;
            regionValue2313 = regionValue2176;
            regionValue2314 = regionValue2177;
            regionValue2315 = regionValue2178;
            regionValue2316 = regionValue2179;
            break region631;
        }
        }
        if (value24 == 0) {
            regionValue2327 = regionValue2309;
            regionValue2330 = regionValue2312;
            regionValue2331 = regionValue2313;
            regionValue2332 = regionValue2314;
            regionValue2333 = regionValue2315;
            regionValue2334 = regionValue2316;
            break region640;
        } else {
            regionValue2344 = regionValue2309;
            regionValue2347 = regionValue2312;
            regionValue2348 = regionValue2313;
            regionValue2349 = regionValue2314;
            regionValue2350 = regionValue2315;
            regionValue2351 = regionValue2316;
            break region632;
        }
        }
        regionValue2361 = regionValue2344;
        regionValue2364 = regionValue2347;
        regionValue2365 = regionValue2348;
        regionValue2366 = regionValue2349;
        regionValue2367 = regionValue2350;
        regionValue2368 = regionValue2351;
        break region634;
        }
        if (regionValue2368 == 0) {
            regionValue2259 = regionValue2361;
            regionValue2262 = regionValue2364;
            regionValue2263 = regionValue2365;
            break region1113;
        } else {
            regionValue2378 = regionValue2361;
            regionValue2381 = regionValue2364;
            regionValue2382 = regionValue2365;
            regionValue2383 = regionValue2366;
            regionValue2384 = regionValue2367;
            break region635;
        }
        }
        arrayValue2385 = (regionValue2381 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2381)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2381)[1]);
        regionValue2327 = regionValue2378;
        regionValue2330 = regionValue2381;
        regionValue2331 = regionValue2382;
        regionValue2332 = regionValue2383;
        regionValue2333 = regionValue2384;
        regionValue2334 = arrayValue2385;
        break region640;
        }
        regionValue2291 = regionValue2327;
        regionValue2294 = regionValue2330;
        regionValue2295 = regionValue2331;
        regionValue2296 = regionValue2332;
        regionValue2297 = regionValue2333;
        regionValue2298 = regionValue2334;
        break region641;
        }
        comparison2386 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2386 <= 0) {
            regionValue2396 = regionValue2291;
            regionValue2399 = regionValue2294;
            regionValue2400 = regionValue2295;
            regionValue2401 = regionValue2296;
            regionValue2402 = regionValue2297;
            regionValue2403 = regionValue2298;
            break region655;
        } else {
            regionValue2414 = regionValue2291;
            regionValue2417 = regionValue2294;
            regionValue2418 = regionValue2295;
            regionValue2419 = regionValue2296;
            regionValue2420 = regionValue2297;
            regionValue2421 = regionValue2298;
            break region645;
        }
        }
        if (value24 == 0) {
            regionValue2432 = regionValue2414;
            regionValue2435 = regionValue2417;
            regionValue2436 = regionValue2418;
            regionValue2437 = regionValue2419;
            regionValue2438 = regionValue2420;
            regionValue2439 = regionValue2421;
            break region654;
        } else {
            regionValue2449 = regionValue2414;
            regionValue2452 = regionValue2417;
            regionValue2453 = regionValue2418;
            regionValue2454 = regionValue2419;
            regionValue2455 = regionValue2420;
            regionValue2456 = regionValue2421;
            break region646;
        }
        }
        regionValue2466 = regionValue2449;
        regionValue2469 = regionValue2452;
        regionValue2470 = regionValue2453;
        regionValue2471 = regionValue2454;
        regionValue2472 = regionValue2455;
        regionValue2473 = regionValue2456;
        break region648;
        }
        if (regionValue2473 == 0) {
            regionValue2259 = regionValue2466;
            regionValue2262 = regionValue2469;
            regionValue2263 = regionValue2470;
            break region1113;
        } else {
            regionValue2483 = regionValue2466;
            regionValue2486 = regionValue2469;
            regionValue2487 = regionValue2470;
            regionValue2488 = regionValue2471;
            regionValue2489 = regionValue2472;
            break region649;
        }
        }
        arrayValue2490 = (regionValue2486 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2486)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2486)[2]);
        regionValue2432 = regionValue2483;
        regionValue2435 = regionValue2486;
        regionValue2436 = regionValue2487;
        regionValue2437 = regionValue2488;
        regionValue2438 = regionValue2489;
        regionValue2439 = arrayValue2490;
        break region654;
        }
        regionValue2396 = regionValue2432;
        regionValue2399 = regionValue2435;
        regionValue2400 = regionValue2436;
        regionValue2401 = regionValue2437;
        regionValue2402 = regionValue2438;
        regionValue2403 = regionValue2439;
        break region655;
        }
        comparison2491 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2491 <= 0) {
            regionValue2501 = regionValue2396;
            regionValue2504 = regionValue2399;
            regionValue2505 = regionValue2401;
            regionValue2506 = regionValue2402;
            regionValue2507 = regionValue2403;
            break region681;
        } else {
            regionValue2518 = regionValue2396;
            regionValue2521 = regionValue2399;
            regionValue2522 = regionValue2400;
            regionValue2523 = regionValue2401;
            regionValue2524 = regionValue2402;
            regionValue2525 = regionValue2403;
            break region659;
        }
        }
        if (value24 == 0) {
            regionValue2536 = regionValue2518;
            regionValue2539 = regionValue2521;
            regionValue2540 = regionValue2523;
            regionValue2541 = regionValue2524;
            regionValue2542 = regionValue2525;
            break region680;
        } else {
            regionValue2552 = regionValue2518;
            regionValue2555 = regionValue2521;
            regionValue2556 = regionValue2522;
            regionValue2557 = regionValue2523;
            regionValue2558 = regionValue2524;
            regionValue2559 = regionValue2525;
            break region660;
        }
        }
        regionValue2569 = regionValue2552;
        regionValue2572 = regionValue2555;
        regionValue2573 = regionValue2556;
        regionValue2574 = regionValue2557;
        regionValue2575 = regionValue2558;
        regionValue2576 = regionValue2559;
        break region662;
        }
        if (regionValue2576 == 0) {
            regionValue2259 = regionValue2569;
            regionValue2262 = regionValue2572;
            regionValue2263 = regionValue2573;
            break region1113;
        } else {
            regionValue2586 = regionValue2569;
            regionValue2589 = regionValue2572;
            regionValue2590 = regionValue2574;
            regionValue2591 = regionValue2575;
            break region663;
        }
        }
        value2593 = 0;
        value2595 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value2596 = recovery$indy$flow$235(value2595, value2593, computed21);
        regionValue2536 = regionValue2586;
        regionValue2539 = regionValue2589;
        regionValue2540 = regionValue2590;
        regionValue2541 = regionValue2591;
        regionValue2542 = (int) ((value2596 ? 1 : 0));
        break region680;
        }
        regionValue2501 = regionValue2536;
        regionValue2504 = regionValue2539;
        regionValue2505 = regionValue2540;
        regionValue2506 = regionValue2541;
        regionValue2507 = regionValue2542;
        break region681;
        }
        if (value24 == 0) {
            regionValue2606 = regionValue2501;
            regionValue2609 = regionValue2504;
            regionValue2610 = regionValue2505;
            regionValue2611 = regionValue2506;
            regionValue2612 = regionValue2507;
            break region718;
        } else {
            regionValue2622 = regionValue2501;
            regionValue2625 = regionValue2504;
            regionValue2626 = regionValue2505;
            regionValue2627 = regionValue2506;
            regionValue2628 = regionValue2507;
            break region682;
        }
        }
        if (regionValue2628 == 0) {
            regionValue2638 = regionValue2622;
            regionValue2641 = regionValue2625;
            regionValue2642 = regionValue2626;
            regionValue2643 = regionValue2627;
            break region686;
        } else {
            break region683;
        }
        }
        value2644 = recovery$indy$flow$236();
        value2645 = value2644;
        value2646 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2645))))));
        value2647 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2646)))).field_42P));
        value2648 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value2647)))).field_429));
        value2649 = value2648;
        value2650 = -1;
        value2652 = 0;
        value2654 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value2655 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value2649))))));
        recovery$indy$flow$242(value2654, value2652, computed17, value2650, value2655);
        regionValue2606 = regionValue2638;
        regionValue2609 = regionValue2641;
        regionValue2610 = regionValue2642;
        regionValue2611 = regionValue2643;
        regionValue2612 = 0;
        break region718;
        }
        value2656 = regionValue2612;
        comparison2657 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2657 < 0) {
            regionValue2667 = regionValue2606;
            regionValue2670 = regionValue2609;
            regionValue2671 = value2656;
            break region1119;
        } else {
            regionValue2682 = regionValue2606;
            regionValue2685 = regionValue2609;
            regionValue2686 = regionValue2610;
            regionValue2687 = regionValue2611;
            regionValue2688 = value2656;
            break region724;
        }
        }
        if (value24 != 0) {
            regionValue2259 = regionValue2682;
            regionValue2262 = regionValue2685;
            regionValue2263 = regionValue2688;
            break region1113;
        } else {
            regionValue2699 = regionValue2682;
            regionValue2702 = regionValue2685;
            regionValue2703 = regionValue2686;
            regionValue2704 = regionValue2687;
            regionValue2705 = regionValue2688;
            break region725;
        }
        }
        regionValue1376 = regionValue2699;
        regionValue1379 = regionValue2702;
        regionValue1380 = regionValue2705;
        regionValue1381 = regionValue2703;
        regionValue1382 = regionValue2704;
        break region727;
        }
        value2706 = recovery$indy$flow$243();
        value2707 = value2706;
        value2708 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2707))))));
        value2709 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2708)))).field_42P));
        value2710 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value2709)))).field_42X));
        value2711 = recovery$indy$flow$247(value2710);
        regionValue1325 = regionValue1376;
        regionValue1328 = regionValue1379;
        regionValue1329 = regionValue1380;
        regionValue1330 = regionValue1381;
        regionValue1331 = regionValue1382;
        regionValue1332 = value2711;
        break region740;
        }
        value2712 = regionValue1332;
        value2713 = recovery$indy$flow$248(value2712);
        value2714 = value2713;
        value2715 = 0;
        regionValue2725 = regionValue1325;
        regionValue2728 = regionValue1328;
        regionValue2729 = regionValue1329;
        regionValue2730 = regionValue1330;
        regionValue2731 = regionValue1331;
        regionValue2732 = value2714;
        regionValue2733 = value2715;
        break region746;
        }
        loop746: while (true) {
        int regionValue2790;
        int regionValue2785;
        java.lang.Object regionValue2784;
        int regionValue2781;
        int regionValue2789;
        java.lang.Object regionValue2788;
        java.lang.Object regionValue2787;
        java.lang.Object regionValue2786;

        region754: {
        java.lang.Object regionValue2749;
        java.lang.Object regionValue2748;
        int regionValue2747;
        java.lang.Object regionValue2746;
        int regionValue2743;
        int regionValue2751;
        java.lang.Object regionValue2750;
        int comparison2791;

        region2332: {
        int regionValue2769;
        java.lang.Object regionValue2768;
        boolean value2771;
        java.lang.Object regionValue2767;
        java.lang.Object regionValue2766;
        int regionValue2765;
        java.lang.Object regionValue2764;
        int regionValue2761;
        java.lang.Object arrayValue2770;

        region749: {
        if (regionValue2733 >= 3) {
            regionValue2743 = regionValue2725;
            regionValue2746 = regionValue2728;
            regionValue2747 = regionValue2729;
            regionValue2748 = regionValue2730;
            regionValue2749 = regionValue2731;
            regionValue2750 = regionValue2732;
            regionValue2751 = regionValue2733;
            break region2332;
        } else {
            regionValue2761 = regionValue2725;
            regionValue2764 = regionValue2728;
            regionValue2765 = regionValue2729;
            regionValue2766 = regionValue2730;
            regionValue2767 = regionValue2731;
            regionValue2768 = regionValue2732;
            regionValue2769 = regionValue2733;
            break region749;
        }
        }
        arrayValue2770 = ((java.lang.Object[]) value498)[regionValue2769];
        value2771 = recovery$indy$flow$249(regionValue2768, arrayValue2770);
        regionValue2781 = regionValue2761;
        regionValue2784 = regionValue2764;
        regionValue2785 = regionValue2765;
        regionValue2786 = regionValue2766;
        regionValue2787 = regionValue2767;
        regionValue2788 = regionValue2768;
        regionValue2789 = regionValue2769;
        regionValue2790 = (int) ((value2771 ? 1 : 0));
        break region754;
        }
        comparison2791 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2791 <= 0) {
            regionValue2781 = regionValue2743;
            regionValue2784 = regionValue2746;
            regionValue2785 = regionValue2747;
            regionValue2786 = regionValue2748;
            regionValue2787 = regionValue2749;
            regionValue2788 = regionValue2750;
            regionValue2789 = regionValue2751;
            regionValue2790 = value24;
            break region754;
        } else {
            regionValue2801 = regionValue2743;
            regionValue2804 = regionValue2746;
            regionValue2805 = regionValue2747;
            regionValue2806 = regionValue2748;
            regionValue2807 = regionValue2749;
            break region853;
        }
        }
        loop754: while (true) {
        java.lang.Object regionValue3204;
        java.lang.Object regionValue3203;
        int regionValue3202;
        java.lang.Object regionValue3201;
        int regionValue3198;
        int regionValue3206;
        java.lang.Object regionValue3205;
        int comparison3207;

        region848: {
        java.lang.Object regionValue2963;
        java.lang.Object regionValue2962;
        java.lang.Object regionValue2961;
        int regionValue2960;
        java.lang.Object regionValue2959;
        int regionValue2956;
        int regionValue2964;
        int incremented3188;

        region845: {
        int regionValue3138;
        int regionValue3137;
        java.lang.Object regionValue3136;
        java.lang.Object regionValue3135;
        java.lang.Object regionValue3134;
        java.lang.Object regionValue3133;
        int regionValue3130;
        int value3187;

        region844: {
        int regionValue3173;
        java.lang.Object value3186;
        java.lang.Object value3185;
        int value3183;
        int value3181;
        java.lang.Object value3180;
        java.lang.Object value3179;
        java.lang.Object value3178;
        java.lang.Object value3177;
        java.lang.Object value3176;
        java.lang.Object value3175;
        java.lang.Object regionValue3172;
        java.lang.Object regionValue3171;
        java.lang.Object regionValue3170;
        java.lang.Object regionValue3169;
        int regionValue3166;
        int computed3174;

        region807: {
        int regionValue3156;
        int regionValue3155;
        java.lang.Object regionValue3154;
        java.lang.Object regionValue3153;
        java.lang.Object regionValue3152;
        java.lang.Object regionValue3151;
        int regionValue3148;

        region803: {
        int regionValue3002;
        int regionValue3001;
        java.lang.Object regionValue3000;
        java.lang.Object regionValue2999;
        java.lang.Object regionValue2998;
        java.lang.Object regionValue2997;
        int regionValue2994;

        region802: {
        int regionValue3041;
        int regionValue3040;
        java.lang.Object regionValue3039;
        java.lang.Object regionValue3038;
        java.lang.Object regionValue3037;
        java.lang.Object regionValue3036;
        int regionValue3033;

        region801: {
        int regionValue3096;
        boolean value3120;
        java.lang.Object value3119;
        int value3117;
        java.lang.Object regionValue3095;
        java.lang.Object regionValue3094;
        java.lang.Object regionValue3093;
        java.lang.Object regionValue3092;
        int regionValue3089;
        int computed3115;

        region784: {
        int regionValue3114;
        java.lang.Object regionValue3113;
        java.lang.Object regionValue3112;
        java.lang.Object regionValue3111;
        int regionValue3110;
        java.lang.Object regionValue3109;
        int regionValue3106;

        region783: {
        int regionValue3078;
        java.lang.Object regionValue3077;
        java.lang.Object regionValue3076;
        java.lang.Object regionValue3075;
        java.lang.Object regionValue3073;
        int regionValue3070;
        int regionValue3079;
        int regionValue3074;

        region782: {
        int regionValue3060;
        int regionValue3059;
        java.lang.Object regionValue3058;
        java.lang.Object regionValue3057;
        java.lang.Object regionValue3056;
        int regionValue3055;
        java.lang.Object regionValue3054;
        int regionValue3051;

        region780: {
        int regionValue3022;
        int regionValue3021;
        java.lang.Object regionValue3020;
        java.lang.Object regionValue3019;
        java.lang.Object regionValue3018;
        java.lang.Object regionValue3016;
        int regionValue3013;
        int regionValue3017;

        region779: {
        int regionValue2868;
        int regionValue2867;
        java.lang.Object regionValue2866;
        java.lang.Object regionValue2865;
        java.lang.Object regionValue2864;
        java.lang.Object regionValue2862;
        int regionValue2859;
        int regionValue2863;
        int comparison2984;

        region775: {
        int regionValue2908;
        int regionValue2907;
        java.lang.Object regionValue2906;
        java.lang.Object regionValue2905;
        java.lang.Object regionValue2904;
        int regionValue2903;
        java.lang.Object regionValue2902;
        int regionValue2899;

        region774: {
        java.lang.Object regionValue2977;
        int regionValue2982;
        java.lang.Object regionValue2981;
        java.lang.Object regionValue2980;
        java.lang.Object regionValue2979;
        int regionValue2978;
        int regionValue2974;
        int arrayValue2983;

        region769: {
        int regionValue2945;
        java.lang.Object regionValue2944;
        java.lang.Object regionValue2943;
        java.lang.Object regionValue2942;
        int regionValue2941;
        java.lang.Object regionValue2940;
        int regionValue2937;
        int regionValue2946;

        region768: {
        int regionValue2927;
        int regionValue2926;
        java.lang.Object regionValue2925;
        java.lang.Object regionValue2924;
        java.lang.Object regionValue2923;
        int regionValue2922;
        java.lang.Object regionValue2921;
        int regionValue2918;

        region766: {
        int regionValue2888;
        int regionValue2887;
        java.lang.Object regionValue2886;
        java.lang.Object regionValue2885;
        java.lang.Object regionValue2884;
        int regionValue2883;
        java.lang.Object regionValue2882;
        int regionValue2879;

        region765: {
        int regionValue2847;
        int regionValue2846;
        java.lang.Object regionValue2845;
        java.lang.Object regionValue2844;
        java.lang.Object regionValue2843;
        int regionValue2842;
        java.lang.Object regionValue2841;
        int regionValue2838;
        int comparison2849;

        region761: {
        int regionValue2827;
        int regionValue2822;
        java.lang.Object regionValue2821;
        int regionValue2818;
        int regionValue2826;
        java.lang.Object regionValue2825;
        java.lang.Object regionValue2824;
        java.lang.Object regionValue2823;
        int comparison2828;

        region756: {
        if (value24 == 0) {
            regionValue529 = regionValue2781;
            regionValue532 = regionValue2784;
            regionValue533 = regionValue2785;
            regionValue534 = regionValue2790;
            continue loop267;
        } else {
            regionValue2818 = regionValue2781;
            regionValue2821 = regionValue2784;
            regionValue2822 = regionValue2785;
            regionValue2823 = regionValue2786;
            regionValue2824 = regionValue2787;
            regionValue2825 = regionValue2788;
            regionValue2826 = regionValue2789;
            regionValue2827 = regionValue2790;
            break region756;
        }
        }
        comparison2828 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2828 < 0) {
            regionValue551 = regionValue2818;
            regionValue554 = regionValue2821;
            regionValue555 = regionValue2822;
            regionValue556 = regionValue2827;
            regionValue557 = value24;
            continue loop279;
        } else {
            regionValue2838 = regionValue2818;
            regionValue2841 = regionValue2821;
            regionValue2842 = regionValue2822;
            regionValue2843 = regionValue2823;
            regionValue2844 = regionValue2824;
            regionValue2845 = regionValue2825;
            regionValue2846 = regionValue2826;
            regionValue2847 = regionValue2827;
            break region761;
        }
        }
        comparison2849 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2849 < 0) {
            regionValue2859 = regionValue2838;
            regionValue2862 = regionValue2841;
            regionValue2863 = regionValue2842;
            regionValue2864 = regionValue2843;
            regionValue2865 = regionValue2844;
            regionValue2866 = regionValue2845;
            regionValue2867 = regionValue2846;
            regionValue2868 = regionValue2847;
            break region775;
        } else {
            regionValue2879 = regionValue2838;
            regionValue2882 = regionValue2841;
            regionValue2883 = regionValue2842;
            regionValue2884 = regionValue2843;
            regionValue2885 = regionValue2844;
            regionValue2886 = regionValue2845;
            regionValue2887 = regionValue2846;
            regionValue2888 = regionValue2847;
            break region765;
        }
        }
        if (value24 == 0) {
            regionValue2899 = regionValue2879;
            regionValue2902 = regionValue2882;
            regionValue2903 = regionValue2883;
            regionValue2904 = regionValue2884;
            regionValue2905 = regionValue2885;
            regionValue2906 = regionValue2886;
            regionValue2907 = regionValue2887;
            regionValue2908 = regionValue2888;
            break region774;
        } else {
            regionValue2918 = regionValue2879;
            regionValue2921 = regionValue2882;
            regionValue2922 = regionValue2883;
            regionValue2923 = regionValue2884;
            regionValue2924 = regionValue2885;
            regionValue2925 = regionValue2886;
            regionValue2926 = regionValue2887;
            regionValue2927 = regionValue2888;
            break region766;
        }
        }
        regionValue2937 = regionValue2918;
        regionValue2940 = regionValue2921;
        regionValue2941 = regionValue2922;
        regionValue2942 = regionValue2923;
        regionValue2943 = regionValue2924;
        regionValue2944 = regionValue2925;
        regionValue2945 = regionValue2926;
        regionValue2946 = regionValue2927;
        break region768;
        }
        if (regionValue2946 == 0) {
            regionValue2956 = regionValue2937;
            regionValue2959 = regionValue2940;
            regionValue2960 = regionValue2941;
            regionValue2961 = regionValue2942;
            regionValue2962 = regionValue2943;
            regionValue2963 = regionValue2944;
            regionValue2964 = regionValue2945;
            break region845;
        } else {
            regionValue2974 = regionValue2937;
            regionValue2977 = regionValue2940;
            regionValue2978 = regionValue2941;
            regionValue2979 = regionValue2942;
            regionValue2980 = regionValue2943;
            regionValue2981 = regionValue2944;
            regionValue2982 = regionValue2945;
            break region769;
        }
        }
        arrayValue2983 = (regionValue2977 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2977)[regionValue2982] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2977)[regionValue2982]);
        regionValue2899 = regionValue2974;
        regionValue2902 = regionValue2977;
        regionValue2903 = regionValue2978;
        regionValue2904 = regionValue2979;
        regionValue2905 = regionValue2980;
        regionValue2906 = regionValue2981;
        regionValue2907 = regionValue2982;
        regionValue2908 = arrayValue2983;
        break region774;
        }
        regionValue2859 = regionValue2899;
        regionValue2862 = regionValue2902;
        regionValue2863 = regionValue2903;
        regionValue2864 = regionValue2904;
        regionValue2865 = regionValue2905;
        regionValue2866 = regionValue2906;
        regionValue2867 = regionValue2907;
        regionValue2868 = regionValue2908;
        break region775;
        }
        comparison2984 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2984 < 0) {
            regionValue2994 = regionValue2859;
            regionValue2997 = regionValue2862;
            regionValue2998 = regionValue2864;
            regionValue2999 = regionValue2865;
            regionValue3000 = regionValue2866;
            regionValue3001 = regionValue2867;
            regionValue3002 = regionValue2868;
            break region802;
        } else {
            regionValue3013 = regionValue2859;
            regionValue3016 = regionValue2862;
            regionValue3017 = regionValue2863;
            regionValue3018 = regionValue2864;
            regionValue3019 = regionValue2865;
            regionValue3020 = regionValue2866;
            regionValue3021 = regionValue2867;
            regionValue3022 = regionValue2868;
            break region779;
        }
        }
        if (value24 == 0) {
            regionValue3033 = regionValue3013;
            regionValue3036 = regionValue3016;
            regionValue3037 = regionValue3018;
            regionValue3038 = regionValue3019;
            regionValue3039 = regionValue3020;
            regionValue3040 = regionValue3021;
            regionValue3041 = regionValue3022;
            break region801;
        } else {
            regionValue3051 = regionValue3013;
            regionValue3054 = regionValue3016;
            regionValue3055 = regionValue3017;
            regionValue3056 = regionValue3018;
            regionValue3057 = regionValue3019;
            regionValue3058 = regionValue3020;
            regionValue3059 = regionValue3021;
            regionValue3060 = regionValue3022;
            break region780;
        }
        }
        regionValue3070 = regionValue3051;
        regionValue3073 = regionValue3054;
        regionValue3074 = regionValue3055;
        regionValue3075 = regionValue3056;
        regionValue3076 = regionValue3057;
        regionValue3077 = regionValue3058;
        regionValue3078 = regionValue3059;
        regionValue3079 = regionValue3060;
        break region782;
        }
        if (regionValue3079 == 0) {
            regionValue3089 = regionValue3070;
            regionValue3092 = regionValue3073;
            regionValue3093 = regionValue3075;
            regionValue3094 = regionValue3076;
            regionValue3095 = regionValue3077;
            regionValue3096 = regionValue3078;
            break region784;
        } else {
            regionValue3106 = regionValue3070;
            regionValue3109 = regionValue3073;
            regionValue3110 = regionValue3074;
            regionValue3111 = regionValue3075;
            regionValue3112 = regionValue3076;
            regionValue3113 = regionValue3077;
            regionValue3114 = regionValue3078;
            break region783;
        }
        }
        regionValue2956 = regionValue3106;
        regionValue2959 = regionValue3109;
        regionValue2960 = regionValue3110;
        regionValue2961 = regionValue3111;
        regionValue2962 = regionValue3112;
        regionValue2963 = regionValue3113;
        regionValue2964 = regionValue3114;
        break region845;
        }
        computed3115 = regionValue3096 + 1;
        value3117 = computed3115;
        value3119 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value3120 = recovery$indy$flow$251(value3119, value3117, computed21);
        regionValue3033 = regionValue3089;
        regionValue3036 = regionValue3092;
        regionValue3037 = regionValue3093;
        regionValue3038 = regionValue3094;
        regionValue3039 = regionValue3095;
        regionValue3040 = regionValue3096;
        regionValue3041 = (int) ((value3120 ? 1 : 0));
        break region801;
        }
        regionValue2994 = regionValue3033;
        regionValue2997 = regionValue3036;
        regionValue2998 = regionValue3037;
        regionValue2999 = regionValue3038;
        regionValue3000 = regionValue3039;
        regionValue3001 = regionValue3040;
        regionValue3002 = regionValue3041;
        break region802;
        }
        if (value24 == 0) {
            regionValue3130 = regionValue2994;
            regionValue3133 = regionValue2997;
            regionValue3134 = regionValue2998;
            regionValue3135 = regionValue2999;
            regionValue3136 = regionValue3000;
            regionValue3137 = regionValue3001;
            regionValue3138 = regionValue3002;
            break region844;
        } else {
            regionValue3148 = regionValue2994;
            regionValue3151 = regionValue2997;
            regionValue3152 = regionValue2998;
            regionValue3153 = regionValue2999;
            regionValue3154 = regionValue3000;
            regionValue3155 = regionValue3001;
            regionValue3156 = regionValue3002;
            break region803;
        }
        }
        if (regionValue3156 == 0) {
            regionValue3166 = regionValue3148;
            regionValue3169 = regionValue3151;
            regionValue3170 = regionValue3152;
            regionValue3171 = regionValue3153;
            regionValue3172 = regionValue3154;
            regionValue3173 = regionValue3155;
            break region807;
        } else {
            break region804;
        }
        }
        recovery$indy$flow$252(this, false);
        computed3174 = regionValue3173 + 1;
        value3175 = recovery$indy$flow$253();
        value3176 = value3175;
        value3177 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3176))))));
        value3178 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3177)))).field_42P));
        value3179 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value3178)))).field_429));
        value3180 = value3179;
        value3181 = 0;
        value3183 = computed3174;
        value3185 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value3186 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value3180))))));
        recovery$indy$flow$259(value3185, value3183, computed9, value3181, value3186);
        regionValue3130 = regionValue3166;
        regionValue3133 = regionValue3169;
        regionValue3134 = regionValue3170;
        regionValue3135 = regionValue3171;
        regionValue3136 = regionValue3172;
        regionValue3137 = regionValue3173;
        regionValue3138 = 0;
        break region844;
        }
        value3187 = regionValue3138;
        regionValue2956 = regionValue3130;
        regionValue2959 = regionValue3133;
        regionValue2960 = value3187;
        regionValue2961 = regionValue3134;
        regionValue2962 = regionValue3135;
        regionValue2963 = regionValue3136;
        regionValue2964 = regionValue3137;
        break region845;
        }
        incremented3188 = regionValue2964 + (1);
        if (value24 != 0) {
            regionValue2725 = regionValue2956;
            regionValue2728 = regionValue2959;
            regionValue2729 = regionValue2960;
            regionValue2730 = regionValue2961;
            regionValue2731 = regionValue2962;
            regionValue2732 = regionValue2963;
            regionValue2733 = incremented3188;
            continue loop746;
        } else {
            regionValue3198 = regionValue2956;
            regionValue3201 = regionValue2959;
            regionValue3202 = regionValue2960;
            regionValue3203 = regionValue2961;
            regionValue3204 = regionValue2962;
            regionValue3205 = regionValue2963;
            regionValue3206 = incremented3188;
            break region848;
        }
        }
        comparison3207 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3207 <= 0) {
            regionValue2781 = regionValue3198;
            regionValue2784 = regionValue3201;
            regionValue2785 = regionValue3202;
            regionValue2786 = regionValue3203;
            regionValue2787 = regionValue3204;
            regionValue2788 = regionValue3205;
            regionValue2789 = regionValue3206;
            regionValue2790 = value24;
            continue loop754;
        } else {
            regionValue2801 = regionValue3198;
            regionValue2804 = regionValue3201;
            regionValue2805 = regionValue3202;
            regionValue2806 = regionValue3203;
            regionValue2807 = regionValue3204;
            break region853;
        }
        }
        }
        }
        comparison3208 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3208 <= 0) {
            regionValue2667 = regionValue2801;
            regionValue2670 = regionValue2804;
            regionValue2671 = regionValue2805;
            break region1119;
        } else {
            regionValue3218 = regionValue2801;
            regionValue3221 = regionValue2804;
            regionValue3222 = regionValue2805;
            regionValue3223 = regionValue2806;
            regionValue3224 = regionValue2807;
            break region857;
        }
        }
        if (value24 != 0) {
            regionValue2259 = regionValue3218;
            regionValue2262 = regionValue3221;
            regionValue2263 = regionValue3222;
            break region1113;
        } else {
            regionValue3235 = regionValue3218;
            regionValue3238 = regionValue3221;
            regionValue3239 = regionValue3222;
            regionValue3240 = regionValue3223;
            regionValue3241 = regionValue3224;
            break region858;
        }
        }
        regionValue1174 = regionValue3235;
        regionValue1177 = regionValue3238;
        regionValue1178 = regionValue3239;
        regionValue1179 = regionValue3240;
        regionValue1180 = regionValue3241;
        break region860;
        }
        regionValue1140 = regionValue1174;
        regionValue1143 = regionValue1177;
        regionValue1144 = regionValue1178;
        regionValue1145 = regionValue1179;
        regionValue1146 = regionValue1180;
        regionValue1147 = regionValue1178;
        break region861;
        }
        regionValue1215 = regionValue1140;
        regionValue1218 = regionValue1143;
        regionValue1219 = regionValue1144;
        regionValue1220 = regionValue1145;
        regionValue1221 = regionValue1146;
        regionValue1222 = regionValue1147;
        break region862;
        }
        comparison3242 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3242 < 0) {
            regionValue3252 = regionValue1215;
            regionValue3255 = regionValue1218;
            regionValue3256 = regionValue1219;
            regionValue3257 = regionValue1220;
            regionValue3258 = regionValue1221;
            regionValue3259 = regionValue1222;
            regionValue3260 = value24;
            break region870;
        } else {
            regionValue3270 = regionValue1215;
            regionValue3273 = regionValue1218;
            regionValue3274 = regionValue1219;
            regionValue3275 = regionValue1220;
            regionValue3276 = regionValue1221;
            regionValue3277 = regionValue1222;
            break region866;
        }
        }
        if (value24 == 0) {
            regionValue3288 = regionValue3270;
            regionValue3291 = regionValue3273;
            regionValue3292 = regionValue3274;
            regionValue3293 = regionValue3275;
            regionValue3294 = regionValue3276;
            regionValue3295 = regionValue3277;
            break region872;
        } else {
            regionValue3305 = regionValue3270;
            regionValue3308 = regionValue3273;
            regionValue3309 = regionValue3274;
            regionValue3310 = regionValue3275;
            regionValue3311 = regionValue3276;
            regionValue3312 = regionValue3277;
            break region867;
        }
        }
        regionValue3322 = regionValue3305;
        regionValue3325 = regionValue3308;
        regionValue3326 = regionValue3309;
        regionValue3327 = regionValue3310;
        regionValue3328 = regionValue3311;
        regionValue3329 = regionValue3312;
        break region869;
        }
        regionValue3252 = regionValue3322;
        regionValue3255 = regionValue3325;
        regionValue3256 = regionValue3326;
        regionValue3257 = regionValue3327;
        regionValue3258 = regionValue3328;
        regionValue3259 = regionValue3329;
        regionValue3260 = 5;
        break region870;
        }
        if (regionValue3259 <= regionValue3260) {
            regionValue2259 = regionValue3252;
            regionValue2262 = regionValue3255;
            regionValue2263 = regionValue3256;
            break region1113;
        } else {
            regionValue3339 = regionValue3252;
            regionValue3342 = regionValue3255;
            regionValue3343 = regionValue3256;
            regionValue3344 = regionValue3257;
            regionValue3345 = regionValue3258;
            break region871;
        }
        }
        regionValue3288 = regionValue3339;
        regionValue3291 = regionValue3342;
        regionValue3292 = regionValue3343;
        regionValue3293 = regionValue3344;
        regionValue3294 = regionValue3345;
        regionValue3295 = 0;
        break region872;
        }
        value3346 = regionValue3295;
        regionValue3356 = regionValue3288;
        regionValue3359 = regionValue3291;
        regionValue3360 = regionValue3292;
        regionValue3361 = regionValue3293;
        regionValue3362 = regionValue3294;
        regionValue3363 = value3346;
        break region873;
        }
        loop873: while (true) {
        int regionValue4652;
        java.lang.Object regionValue4648;
        int regionValue4645;
        int regionValue4651;
        java.lang.Object regionValue4650;
        java.lang.Object regionValue4649;

        region1112: {
        java.lang.Object regionValue3538;
        java.lang.Object regionValue3537;
        int regionValue3536;
        java.lang.Object regionValue3535;
        int regionValue3532;
        int regionValue3539;
        int comparison4697;

        region1108: {
        int regionValue3451;
        java.lang.Object regionValue3450;
        java.lang.Object regionValue3449;
        int regionValue3448;
        java.lang.Object regionValue3447;
        int regionValue3444;
        int incremented4696;

        region1106: {
        int regionValue4024;
        int regionValue4021;
        java.lang.Object regionValue4020;
        java.lang.Object regionValue4019;
        int regionValue4018;
        java.lang.Object regionValue4017;
        int regionValue4014;
        int regionValue4023;
        java.lang.Object regionValue4022;

        region976: {
        int regionValue3964;
        int regionValue3963;
        java.lang.Object regionValue3962;
        int regionValue3961;
        java.lang.Object regionValue3960;
        java.lang.Object regionValue3959;
        int regionValue3958;
        java.lang.Object regionValue3957;
        int regionValue3954;
        int value4004;

        region975: {
        int regionValue4003;
        java.lang.Object regionValue4002;
        int regionValue4001;
        java.lang.Object regionValue4000;
        java.lang.Object regionValue3999;
        int regionValue3998;
        java.lang.Object regionValue3997;
        int regionValue3994;

        region974: {
        int regionValue3984;
        int regionValue3983;
        java.lang.Object regionValue3982;
        int regionValue3981;
        java.lang.Object regionValue3980;
        java.lang.Object regionValue3979;
        int regionValue3978;
        java.lang.Object regionValue3977;
        int regionValue3974;

        region968: {
        int regionValue3937;
        java.lang.Object regionValue3936;
        int regionValue3935;
        java.lang.Object regionValue3934;
        java.lang.Object regionValue3933;
        int regionValue3932;
        java.lang.Object regionValue3931;
        int regionValue3928;
        boolean value3944;
        int regionValue3939;
        java.lang.Object value3943;
        int value3941;

        region953: {
        int regionValue3872;
        int regionValue3877;
        java.lang.Object regionValue3876;
        int regionValue3875;
        java.lang.Object regionValue3874;
        java.lang.Object regionValue3873;
        java.lang.Object regionValue3871;
        int regionValue3868;

        region952: {
        int regionValue3837;
        int regionValue3835;
        java.lang.Object regionValue3834;
        int regionValue3833;
        java.lang.Object regionValue3832;
        java.lang.Object regionValue3831;
        int regionValue3830;
        java.lang.Object regionValue3829;
        int regionValue3826;

        region951: {
        int regionValue3917;
        java.lang.Object regionValue3916;
        int regionValue3915;
        java.lang.Object regionValue3914;
        java.lang.Object regionValue3913;
        int regionValue3912;
        java.lang.Object regionValue3911;
        int regionValue3908;

        region950: {
        int regionValue3897;
        java.lang.Object regionValue3896;
        int regionValue3895;
        java.lang.Object regionValue3894;
        java.lang.Object regionValue3893;
        int regionValue3892;
        java.lang.Object regionValue3891;
        int regionValue3888;

        region948: {
        int regionValue3856;
        java.lang.Object regionValue3855;
        int regionValue3854;
        java.lang.Object regionValue3853;
        java.lang.Object regionValue3852;
        int regionValue3851;
        java.lang.Object regionValue3850;
        int regionValue3847;
        int regionValue3858;

        region947: {
        int regionValue3493;
        java.lang.Object regionValue3492;
        int regionValue3491;
        java.lang.Object regionValue3490;
        java.lang.Object regionValue3489;
        int regionValue3488;
        java.lang.Object regionValue3487;
        int regionValue3484;

        region943: {
        java.lang.Object regionValue3728;
        int regionValue3727;
        int regionValue3726;
        java.lang.Object regionValue3725;
        java.lang.Object regionValue3724;
        int regionValue3723;
        java.lang.Object regionValue3722;
        int regionValue3719;
        int value3816;
        java.lang.Object value3815;

        region937: {
        java.lang.Object regionValue3814;
        int regionValue3813;
        int regionValue3812;
        java.lang.Object regionValue3811;
        java.lang.Object regionValue3810;
        int regionValue3809;
        java.lang.Object regionValue3808;
        int regionValue3805;

        region934: {
        java.lang.Object regionValue3794;
        int regionValue3793;
        int regionValue3792;
        java.lang.Object regionValue3791;
        java.lang.Object regionValue3790;
        int regionValue3789;
        java.lang.Object regionValue3788;
        int regionValue3785;

        region932: {
        int regionValue3474;
        int regionValue3473;
        java.lang.Object regionValue3472;
        int regionValue3471;
        java.lang.Object regionValue3470;
        java.lang.Object regionValue3469;
        int regionValue3468;
        java.lang.Object regionValue3467;
        int regionValue3464;

        region890: {
        int value3454;
        int value3453;
        java.lang.Object value3452;
        int regionValue3417;
        java.lang.Object regionValue3416;
        java.lang.Object regionValue3415;
        int regionValue3414;
        java.lang.Object regionValue3413;
        int regionValue3410;

        region884: {
        int regionValue3434;
        java.lang.Object regionValue3433;
        java.lang.Object regionValue3432;
        int regionValue3431;
        java.lang.Object regionValue3430;
        int regionValue3427;

        region883: {
        int regionValue3399;
        java.lang.Object regionValue3398;
        java.lang.Object regionValue3397;
        int regionValue3396;
        java.lang.Object regionValue3395;
        int regionValue3392;
        int regionValue3400;

        region882: {
        java.lang.Object regionValue3377;
        int regionValue3381;
        int regionValue3378;
        int regionValue3374;
        int arrayValue3382;
        java.lang.Object regionValue3380;
        java.lang.Object regionValue3379;

        region877: {
        int length3364;

        length3364 = java.lang.reflect.Array.getLength(value498);
        if (regionValue3363 >= length3364) {
            regionValue2259 = regionValue3356;
            regionValue2262 = regionValue3359;
            regionValue2263 = regionValue3360;
            break region1113;
        } else {
            regionValue3374 = regionValue3356;
            regionValue3377 = regionValue3359;
            regionValue3378 = regionValue3360;
            regionValue3379 = regionValue3361;
            regionValue3380 = regionValue3362;
            regionValue3381 = regionValue3363;
            break region877;
        }
        }
        arrayValue3382 = (regionValue3377 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue3377)[regionValue3381] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue3377)[regionValue3381]);
        if (value24 == 0) {
            regionValue529 = regionValue3374;
            regionValue532 = regionValue3377;
            regionValue533 = regionValue3378;
            regionValue534 = arrayValue3382;
            continue loop267;
        } else {
            regionValue3392 = regionValue3374;
            regionValue3395 = regionValue3377;
            regionValue3396 = regionValue3378;
            regionValue3397 = regionValue3379;
            regionValue3398 = regionValue3380;
            regionValue3399 = regionValue3381;
            regionValue3400 = arrayValue3382;
            break region882;
        }
        }
        if (regionValue3400 != 0) {
            regionValue3410 = regionValue3392;
            regionValue3413 = regionValue3395;
            regionValue3414 = regionValue3396;
            regionValue3415 = regionValue3397;
            regionValue3416 = regionValue3398;
            regionValue3417 = regionValue3399;
            break region884;
        } else {
            regionValue3427 = regionValue3392;
            regionValue3430 = regionValue3395;
            regionValue3431 = regionValue3396;
            regionValue3432 = regionValue3397;
            regionValue3433 = regionValue3398;
            regionValue3434 = regionValue3399;
            break region883;
        }
        }
        regionValue3444 = regionValue3427;
        regionValue3447 = regionValue3430;
        regionValue3448 = regionValue3431;
        regionValue3449 = regionValue3432;
        regionValue3450 = regionValue3433;
        regionValue3451 = regionValue3434;
        break region1106;
        }
        value3452 = null;
        value3453 = -1;
        value3454 = 0;
        regionValue3464 = regionValue3410;
        regionValue3467 = regionValue3413;
        regionValue3468 = regionValue3414;
        regionValue3469 = regionValue3415;
        regionValue3470 = regionValue3416;
        regionValue3471 = regionValue3417;
        regionValue3472 = value3452;
        regionValue3473 = value3453;
        regionValue3474 = value3454;
        break region890;
        }
        loop890: while (true) {
        int regionValue3582;
        int regionValue3581;
        java.lang.Object regionValue3580;
        int regionValue3579;
        java.lang.Object regionValue3578;
        java.lang.Object regionValue3577;
        int regionValue3576;
        java.lang.Object regionValue3575;
        int regionValue3572;

        region942: {
        int regionValue3688;
        int regionValue3687;
        java.lang.Object regionValue3686;
        int regionValue3685;
        java.lang.Object regionValue3684;
        java.lang.Object regionValue3683;
        int regionValue3682;
        java.lang.Object regionValue3681;
        int regionValue3678;
        int incremented3795;

        region941: {
        int regionValue3767;
        int regionValue3770;
        java.lang.Object regionValue3766;
        java.lang.Object regionValue3765;
        int regionValue3764;
        java.lang.Object regionValue3763;
        int regionValue3760;
        boolean value3775;
        java.lang.Object value3773;
        java.lang.Object regionValue3772;
        java.lang.Object regionValue3771;
        int regionValue3769;
        java.lang.Object regionValue3768;
        java.lang.Object arrayValue3774;

        region926: {
        java.lang.Object regionValue3750;
        java.lang.Object regionValue3749;
        int regionValue3748;
        int regionValue3747;
        java.lang.Object regionValue3746;
        int regionValue3745;
        java.lang.Object regionValue3744;
        java.lang.Object regionValue3743;
        int regionValue3742;
        java.lang.Object regionValue3741;
        int regionValue3738;

        region924: {
        java.lang.Object regionValue3709;
        int regionValue3708;
        int regionValue3705;
        java.lang.Object regionValue3704;
        java.lang.Object regionValue3703;
        int regionValue3702;
        java.lang.Object regionValue3701;
        int regionValue3698;
        int regionValue3707;
        java.lang.Object regionValue3706;

        region921: {
        int regionValue3666;
        int regionValue3665;
        java.lang.Object regionValue3664;
        int regionValue3663;
        java.lang.Object regionValue3662;
        java.lang.Object regionValue3661;
        int regionValue3660;
        java.lang.Object regionValue3659;
        int regionValue3656;
        java.lang.Object regionValue3668;
        java.lang.Object regionValue3667;

        region920: {
        java.lang.Object regionValue3646;
        java.lang.Object regionValue3645;
        int regionValue3644;
        int regionValue3643;
        java.lang.Object regionValue3642;
        int regionValue3641;
        java.lang.Object regionValue3640;
        java.lang.Object regionValue3639;
        int regionValue3638;
        java.lang.Object regionValue3637;
        int regionValue3634;

        region918: {
        java.lang.Object regionValue3624;
        java.lang.Object regionValue3618;
        int regionValue3617;
        java.lang.Object regionValue3616;
        int regionValue3613;
        int regionValue3623;
        int regionValue3622;
        java.lang.Object regionValue3621;
        int regionValue3620;
        java.lang.Object regionValue3619;

        region915: {
        java.lang.Object regionValue3603;
        int regionValue3602;
        int regionValue3601;
        java.lang.Object regionValue3600;
        int regionValue3599;
        java.lang.Object regionValue3598;
        java.lang.Object regionValue3597;
        int regionValue3596;
        java.lang.Object regionValue3595;
        int regionValue3592;

        region913: {
        int regionValue3560;
        int regionValue3559;
        java.lang.Object regionValue3558;
        int regionValue3557;
        java.lang.Object regionValue3556;
        java.lang.Object regionValue3555;
        int regionValue3554;
        java.lang.Object regionValue3553;
        int regionValue3550;
        java.lang.Object regionValue3561;

        region912: {
        int regionValue3513;
        int regionValue3510;
        java.lang.Object regionValue3509;
        java.lang.Object regionValue3508;
        int regionValue3507;
        java.lang.Object regionValue3506;
        int regionValue3503;
        java.lang.Object value3521;
        java.lang.Object value3520;
        java.lang.Object value3519;
        java.lang.Object value3518;
        java.lang.Object value3517;
        java.lang.Object value3516;
        java.lang.Object value3515;
        java.lang.Object value3514;
        int regionValue3512;
        java.lang.Object regionValue3511;
        int comparison3522;

        region893: {
        if (regionValue3474 >= 5) {
            regionValue3484 = regionValue3464;
            regionValue3487 = regionValue3467;
            regionValue3488 = regionValue3468;
            regionValue3489 = regionValue3469;
            regionValue3490 = regionValue3470;
            regionValue3491 = regionValue3471;
            regionValue3492 = regionValue3472;
            regionValue3493 = regionValue3473;
            break region943;
        } else {
            regionValue3503 = regionValue3464;
            regionValue3506 = regionValue3467;
            regionValue3507 = regionValue3468;
            regionValue3508 = regionValue3469;
            regionValue3509 = regionValue3470;
            regionValue3510 = regionValue3471;
            regionValue3511 = regionValue3472;
            regionValue3512 = regionValue3473;
            regionValue3513 = regionValue3474;
            break region893;
        }
        }
        value3514 = recovery$indy$flow$260();
        value3515 = value3514;
        value3516 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3515))))));
        value3517 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3516)))).field_42P));
        value3518 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value3517)))).field_429));
        value3519 = recovery$indy$flow$264(value3518, regionValue3513);
        value3520 = recovery$indy$flow$265(value3519);
        value3521 = value3520;
        comparison3522 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison3522 < 0) {
            regionValue3532 = regionValue3503;
            regionValue3535 = regionValue3506;
            regionValue3536 = regionValue3507;
            regionValue3537 = regionValue3508;
            regionValue3538 = regionValue3509;
            regionValue3539 = regionValue3510;
            break region1108;
        } else {
            regionValue3550 = regionValue3503;
            regionValue3553 = regionValue3506;
            regionValue3554 = regionValue3507;
            regionValue3555 = regionValue3508;
            regionValue3556 = regionValue3509;
            regionValue3557 = regionValue3510;
            regionValue3558 = regionValue3511;
            regionValue3559 = regionValue3512;
            regionValue3560 = regionValue3513;
            regionValue3561 = value3521;
            break region912;
        }
        }
        if (value24 == 0) {
            regionValue3572 = regionValue3550;
            regionValue3575 = regionValue3553;
            regionValue3576 = regionValue3554;
            regionValue3577 = regionValue3555;
            regionValue3578 = regionValue3556;
            regionValue3579 = regionValue3557;
            regionValue3580 = regionValue3558;
            regionValue3581 = regionValue3559;
            regionValue3582 = regionValue3560;
            break region942;
        } else {
            regionValue3592 = regionValue3550;
            regionValue3595 = regionValue3553;
            regionValue3596 = regionValue3554;
            regionValue3597 = regionValue3555;
            regionValue3598 = regionValue3556;
            regionValue3599 = regionValue3557;
            regionValue3600 = regionValue3558;
            regionValue3601 = regionValue3559;
            regionValue3602 = regionValue3560;
            regionValue3603 = regionValue3561;
            break region913;
        }
        }
        regionValue3613 = regionValue3592;
        regionValue3616 = regionValue3595;
        regionValue3617 = regionValue3596;
        regionValue3618 = regionValue3597;
        regionValue3619 = regionValue3598;
        regionValue3620 = regionValue3599;
        regionValue3621 = regionValue3600;
        regionValue3622 = regionValue3601;
        regionValue3623 = regionValue3602;
        regionValue3624 = regionValue3603;
        break region915;
        }
        if (value24 == 0) {
            regionValue786 = regionValue3613;
            regionValue789 = regionValue3616;
            regionValue790 = regionValue3617;
            regionValue791 = regionValue3618;
            regionValue792 = regionValue3624;
            continue loop359;
        } else {
            regionValue3634 = regionValue3613;
            regionValue3637 = regionValue3616;
            regionValue3638 = regionValue3617;
            regionValue3639 = regionValue3618;
            regionValue3640 = regionValue3619;
            regionValue3641 = regionValue3620;
            regionValue3642 = regionValue3621;
            regionValue3643 = regionValue3622;
            regionValue3644 = regionValue3623;
            regionValue3645 = regionValue3624;
            regionValue3646 = regionValue3624;
            break region918;
        }
        }
        regionValue3656 = regionValue3634;
        regionValue3659 = regionValue3637;
        regionValue3660 = regionValue3638;
        regionValue3661 = regionValue3639;
        regionValue3662 = regionValue3640;
        regionValue3663 = regionValue3641;
        regionValue3664 = regionValue3642;
        regionValue3665 = regionValue3643;
        regionValue3666 = regionValue3644;
        regionValue3667 = regionValue3645;
        regionValue3668 = regionValue3646;
        break region920;
        }
        if (regionValue3668 == null) {
            regionValue3678 = regionValue3656;
            regionValue3681 = regionValue3659;
            regionValue3682 = regionValue3660;
            regionValue3683 = regionValue3661;
            regionValue3684 = regionValue3662;
            regionValue3685 = regionValue3663;
            regionValue3686 = regionValue3664;
            regionValue3687 = regionValue3665;
            regionValue3688 = regionValue3666;
            break region941;
        } else {
            regionValue3698 = regionValue3656;
            regionValue3701 = regionValue3659;
            regionValue3702 = regionValue3660;
            regionValue3703 = regionValue3661;
            regionValue3704 = regionValue3662;
            regionValue3705 = regionValue3663;
            regionValue3706 = regionValue3664;
            regionValue3707 = regionValue3665;
            regionValue3708 = regionValue3666;
            regionValue3709 = regionValue3667;
            break region921;
        }
        }
        if (value24 == 0) {
            regionValue3719 = regionValue3698;
            regionValue3722 = regionValue3701;
            regionValue3723 = regionValue3702;
            regionValue3724 = regionValue3703;
            regionValue3725 = regionValue3704;
            regionValue3726 = regionValue3705;
            regionValue3727 = regionValue3708;
            regionValue3728 = regionValue3709;
            break region937;
        } else {
            regionValue3738 = regionValue3698;
            regionValue3741 = regionValue3701;
            regionValue3742 = regionValue3702;
            regionValue3743 = regionValue3703;
            regionValue3744 = regionValue3704;
            regionValue3745 = regionValue3705;
            regionValue3746 = regionValue3706;
            regionValue3747 = regionValue3707;
            regionValue3748 = regionValue3708;
            regionValue3749 = regionValue3709;
            regionValue3750 = regionValue3709;
            break region924;
        }
        }
        regionValue3760 = regionValue3738;
        regionValue3763 = regionValue3741;
        regionValue3764 = regionValue3742;
        regionValue3765 = regionValue3743;
        regionValue3766 = regionValue3744;
        regionValue3767 = regionValue3745;
        regionValue3768 = regionValue3746;
        regionValue3769 = regionValue3747;
        regionValue3770 = regionValue3748;
        regionValue3771 = regionValue3749;
        regionValue3772 = regionValue3750;
        break region926;
        }
        value3773 = recovery$indy$flow$266(regionValue3772);
        arrayValue3774 = ((java.lang.Object[]) value498)[regionValue3767];
        value3775 = recovery$indy$flow$267(value3773, arrayValue3774);
        if ((int) ((value3775 ? 1 : 0)) == 0) {
            regionValue3678 = regionValue3760;
            regionValue3681 = regionValue3763;
            regionValue3682 = regionValue3764;
            regionValue3683 = regionValue3765;
            regionValue3684 = regionValue3766;
            regionValue3685 = regionValue3767;
            regionValue3686 = regionValue3768;
            regionValue3687 = regionValue3769;
            regionValue3688 = regionValue3770;
            break region941;
        } else {
            regionValue3785 = regionValue3760;
            regionValue3788 = regionValue3763;
            regionValue3789 = regionValue3764;
            regionValue3790 = regionValue3765;
            regionValue3791 = regionValue3766;
            regionValue3792 = regionValue3767;
            regionValue3793 = regionValue3770;
            regionValue3794 = regionValue3771;
            break region932;
        }
        }
        incremented3795 = regionValue3688 + (1);
        regionValue3572 = regionValue3678;
        regionValue3575 = regionValue3681;
        regionValue3576 = regionValue3682;
        regionValue3577 = regionValue3683;
        regionValue3578 = regionValue3684;
        regionValue3579 = regionValue3685;
        regionValue3580 = regionValue3686;
        regionValue3581 = regionValue3687;
        regionValue3582 = incremented3795;
        break region942;
        }
        regionValue3464 = regionValue3572;
        regionValue3467 = regionValue3575;
        regionValue3468 = regionValue3576;
        regionValue3469 = regionValue3577;
        regionValue3470 = regionValue3578;
        regionValue3471 = regionValue3579;
        regionValue3472 = regionValue3580;
        regionValue3473 = regionValue3581;
        regionValue3474 = regionValue3582;
        continue loop890;
        }
        }
        regionValue3805 = regionValue3785;
        regionValue3808 = regionValue3788;
        regionValue3809 = regionValue3789;
        regionValue3810 = regionValue3790;
        regionValue3811 = regionValue3791;
        regionValue3812 = regionValue3792;
        regionValue3813 = regionValue3793;
        regionValue3814 = regionValue3794;
        break region934;
        }
        regionValue3719 = regionValue3805;
        regionValue3722 = regionValue3808;
        regionValue3723 = regionValue3809;
        regionValue3724 = regionValue3810;
        regionValue3725 = regionValue3811;
        regionValue3726 = regionValue3812;
        regionValue3727 = regionValue3813;
        regionValue3728 = regionValue3814;
        break region937;
        }
        value3815 = regionValue3728;
        value3816 = regionValue3727;
        regionValue3484 = regionValue3719;
        regionValue3487 = regionValue3722;
        regionValue3488 = regionValue3723;
        regionValue3489 = regionValue3724;
        regionValue3490 = regionValue3725;
        regionValue3491 = regionValue3726;
        regionValue3492 = value3815;
        regionValue3493 = value3816;
        break region943;
        }
        if (value24 == 0) {
            regionValue3826 = regionValue3484;
            regionValue3829 = regionValue3487;
            regionValue3830 = regionValue3488;
            regionValue3831 = regionValue3489;
            regionValue3832 = regionValue3490;
            regionValue3833 = regionValue3491;
            regionValue3834 = regionValue3492;
            regionValue3835 = regionValue3493;
            regionValue3837 = regionValue3493;
            break region951;
        } else {
            regionValue3847 = regionValue3484;
            regionValue3850 = regionValue3487;
            regionValue3851 = regionValue3488;
            regionValue3852 = regionValue3489;
            regionValue3853 = regionValue3490;
            regionValue3854 = regionValue3491;
            regionValue3855 = regionValue3492;
            regionValue3856 = regionValue3493;
            regionValue3858 = regionValue3493;
            break region947;
        }
        }
        if (regionValue3858 == 0) {
            regionValue3868 = regionValue3847;
            regionValue3871 = regionValue3850;
            regionValue3872 = regionValue3851;
            regionValue3873 = regionValue3852;
            regionValue3874 = regionValue3853;
            regionValue3875 = regionValue3854;
            regionValue3876 = regionValue3855;
            regionValue3877 = regionValue3856;
            break region952;
        } else {
            regionValue3888 = regionValue3847;
            regionValue3891 = regionValue3850;
            regionValue3892 = regionValue3851;
            regionValue3893 = regionValue3852;
            regionValue3894 = regionValue3853;
            regionValue3895 = regionValue3854;
            regionValue3896 = regionValue3855;
            regionValue3897 = regionValue3856;
            break region948;
        }
        }
        regionValue3908 = regionValue3888;
        regionValue3911 = regionValue3891;
        regionValue3912 = regionValue3892;
        regionValue3913 = regionValue3893;
        regionValue3914 = regionValue3894;
        regionValue3915 = regionValue3895;
        regionValue3916 = regionValue3896;
        regionValue3917 = regionValue3897;
        break region950;
        }
        regionValue3826 = regionValue3908;
        regionValue3829 = regionValue3911;
        regionValue3830 = regionValue3912;
        regionValue3831 = regionValue3913;
        regionValue3832 = regionValue3914;
        regionValue3833 = regionValue3915;
        regionValue3834 = regionValue3916;
        regionValue3835 = regionValue3917;
        regionValue3837 = regionValue3917;
        break region951;
        }
        regionValue3928 = regionValue3826;
        regionValue3931 = regionValue3829;
        regionValue3932 = regionValue3830;
        regionValue3933 = regionValue3831;
        regionValue3934 = regionValue3832;
        regionValue3935 = regionValue3833;
        regionValue3936 = regionValue3834;
        regionValue3937 = regionValue3835;
        regionValue3939 = regionValue3837;
        break region953;
        }
        regionValue3928 = regionValue3868;
        regionValue3931 = regionValue3871;
        regionValue3932 = regionValue3872;
        regionValue3933 = regionValue3873;
        regionValue3934 = regionValue3874;
        regionValue3935 = regionValue3875;
        regionValue3936 = regionValue3876;
        regionValue3937 = regionValue3877;
        regionValue3939 = regionValue3872;
        break region953;
        }
        value3941 = regionValue3939;
        value3943 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value3944 = recovery$indy$flow$269(value3943, value3941, computed21);
        if (value24 == 0) {
            regionValue3954 = regionValue3928;
            regionValue3957 = regionValue3931;
            regionValue3958 = regionValue3932;
            regionValue3959 = regionValue3933;
            regionValue3960 = regionValue3934;
            regionValue3961 = regionValue3935;
            regionValue3962 = regionValue3936;
            regionValue3963 = regionValue3937;
            regionValue3964 = (int) ((value3944 ? 1 : 0));
            break region975;
        } else {
            regionValue3974 = regionValue3928;
            regionValue3977 = regionValue3931;
            regionValue3978 = regionValue3932;
            regionValue3979 = regionValue3933;
            regionValue3980 = regionValue3934;
            regionValue3981 = regionValue3935;
            regionValue3982 = regionValue3936;
            regionValue3983 = regionValue3937;
            regionValue3984 = (int) ((value3944 ? 1 : 0));
            break region968;
        }
        }
        if (regionValue3984 == 0) {
            regionValue3994 = regionValue3974;
            regionValue3997 = regionValue3977;
            regionValue3998 = regionValue3978;
            regionValue3999 = regionValue3979;
            regionValue4000 = regionValue3980;
            regionValue4001 = regionValue3981;
            regionValue4002 = regionValue3982;
            regionValue4003 = regionValue3983;
            break region974;
        } else {
            break region969;
        }
        }
        regionValue3954 = regionValue3994;
        regionValue3957 = regionValue3997;
        regionValue3958 = regionValue3998;
        regionValue3959 = regionValue3999;
        regionValue3960 = regionValue4000;
        regionValue3961 = regionValue4001;
        regionValue3962 = regionValue4002;
        regionValue3963 = regionValue4003;
        regionValue3964 = 9;
        break region975;
        }
        value4004 = regionValue3964;
        regionValue4014 = regionValue3954;
        regionValue4017 = regionValue3957;
        regionValue4018 = regionValue3958;
        regionValue4019 = regionValue3959;
        regionValue4020 = regionValue3960;
        regionValue4021 = regionValue3961;
        regionValue4022 = regionValue3962;
        regionValue4023 = regionValue3963;
        regionValue4024 = value4004;
        break region976;
        }
        loop976: while (true) {
        int regionValue4077;
        java.lang.Object regionValue4076;
        java.lang.Object regionValue4075;
        int regionValue4074;
        java.lang.Object regionValue4073;
        int regionValue4070;
        int regionValue4080;
        int regionValue4079;
        java.lang.Object regionValue4078;

        region1105: {
        int regionValue4123;
        int regionValue4122;
        java.lang.Object regionValue4121;
        int regionValue4120;
        java.lang.Object regionValue4119;
        java.lang.Object regionValue4118;
        int regionValue4117;
        java.lang.Object regionValue4116;
        int regionValue4113;

        region1104: {
        int regionValue4229;
        int regionValue4228;
        java.lang.Object regionValue4227;
        int regionValue4226;
        java.lang.Object regionValue4225;
        java.lang.Object regionValue4224;
        int regionValue4223;
        java.lang.Object regionValue4222;
        int regionValue4219;
        int incremented4695;

        region1103: {
        int regionValue4694;
        int regionValue4693;
        int regionValue4692;
        java.lang.Object regionValue4691;
        int regionValue4690;
        java.lang.Object regionValue4689;
        java.lang.Object regionValue4688;
        java.lang.Object regionValue4687;
        int regionValue4684;

        region1101: {
        int regionValue4673;
        int regionValue4669;
        java.lang.Object regionValue4668;
        java.lang.Object regionValue4667;
        java.lang.Object regionValue4666;
        int regionValue4663;
        int regionValue4672;
        int regionValue4671;
        java.lang.Object regionValue4670;

        region1100: {
        int regionValue4574;
        java.lang.Object regionValue4573;
        java.lang.Object regionValue4572;
        java.lang.Object regionValue4571;
        int regionValue4568;
        int value4634;
        int regionValue4578;
        int regionValue4577;
        int regionValue4576;
        java.lang.Object regionValue4575;
        int comparison4635;

        region1094: {
        int regionValue4334;
        int regionValue4335;
        java.lang.Object regionValue4333;
        int regionValue4332;
        java.lang.Object regionValue4331;
        java.lang.Object regionValue4330;
        java.lang.Object regionValue4329;
        int regionValue4326;
        java.lang.Object value4633;
        java.lang.Object value4632;
        int value4630;
        int value4628;
        java.lang.Object value4627;
        java.lang.Object value4626;
        java.lang.Object value4625;
        java.lang.Object value4624;
        java.lang.Object value4623;
        java.lang.Object value4622;

        region1057: {
        int regionValue4534;
        int regionValue4533;
        java.lang.Object regionValue4532;
        int regionValue4531;
        java.lang.Object regionValue4530;
        java.lang.Object regionValue4529;
        java.lang.Object regionValue4527;
        int regionValue4524;
        int regionValue4536;
        int regionValue4535;
        int regionValue4528;

        region1056: {
        java.lang.Object regionValue4617;
        int value4621;
        int regionValue4620;
        int regionValue4619;
        int regionValue4618;
        int regionValue4616;
        java.lang.Object regionValue4615;
        java.lang.Object regionValue4614;
        int regionValue4613;
        java.lang.Object regionValue4612;
        int regionValue4609;

        region1052: {
        int regionValue4599;
        int regionValue4598;
        int regionValue4597;
        java.lang.Object regionValue4596;
        int regionValue4595;
        java.lang.Object regionValue4594;
        java.lang.Object regionValue4593;
        int regionValue4592;
        java.lang.Object regionValue4591;
        int regionValue4588;

        region1050: {
        int regionValue4557;
        int regionValue4556;
        int regionValue4555;
        java.lang.Object regionValue4554;
        int regionValue4553;
        java.lang.Object regionValue4552;
        java.lang.Object regionValue4551;
        java.lang.Object regionValue4549;
        int regionValue4546;
        int regionValue4550;

        region1049: {
        int regionValue4402;
        int regionValue4401;
        int regionValue4400;
        java.lang.Object regionValue4399;
        int regionValue4398;
        java.lang.Object regionValue4397;
        java.lang.Object regionValue4396;
        int regionValue4395;
        java.lang.Object regionValue4394;
        int regionValue4391;
        int comparison4514;

        region1045: {
        int regionValue4447;
        int regionValue4446;
        int regionValue4445;
        java.lang.Object regionValue4444;
        int regionValue4443;
        java.lang.Object regionValue4442;
        java.lang.Object regionValue4441;
        int regionValue4440;
        java.lang.Object regionValue4439;
        int regionValue4436;

        region1044: {
        int value4513;
        java.lang.Object regionValue4512;
        int regionValue4511;
        int regionValue4510;
        java.lang.Object regionValue4509;
        int regionValue4508;
        java.lang.Object regionValue4507;
        java.lang.Object regionValue4506;
        int regionValue4505;
        java.lang.Object regionValue4504;
        int regionValue4501;

        region1040: {
        int regionValue4489;
        int regionValue4488;
        java.lang.Object regionValue4487;
        int regionValue4486;
        java.lang.Object regionValue4485;
        java.lang.Object regionValue4484;
        int regionValue4483;
        java.lang.Object regionValue4482;
        int regionValue4479;
        int regionValue4491;
        java.lang.Object regionValue4490;

        region1039: {
        int regionValue4469;
        java.lang.Object regionValue4468;
        int regionValue4467;
        int regionValue4466;
        java.lang.Object regionValue4465;
        int regionValue4464;
        java.lang.Object regionValue4463;
        java.lang.Object regionValue4462;
        int regionValue4461;
        java.lang.Object regionValue4460;
        int regionValue4457;

        region1037: {
        int regionValue4425;
        int regionValue4423;
        int regionValue4422;
        java.lang.Object regionValue4421;
        int regionValue4420;
        java.lang.Object regionValue4419;
        java.lang.Object regionValue4418;
        int regionValue4417;
        java.lang.Object regionValue4416;
        int regionValue4413;
        java.lang.Object regionValue4424;

        region1036: {
        java.lang.Object regionValue4268;
        int regionValue4270;
        int regionValue4269;
        int regionValue4267;
        java.lang.Object regionValue4266;
        java.lang.Object regionValue4265;
        int regionValue4264;
        java.lang.Object regionValue4263;
        int regionValue4260;
        boolean value4380;
        java.lang.Object regionValue4272;
        java.lang.Object regionValue4271;
        java.lang.Object value4379;
        java.lang.Object value4378;
        int comparison4381;

        region1027: {
        java.lang.Object regionValue4377;
        int regionValue4376;
        int regionValue4375;
        java.lang.Object regionValue4374;
        int regionValue4373;
        java.lang.Object regionValue4372;
        java.lang.Object regionValue4371;
        int regionValue4370;
        java.lang.Object regionValue4369;
        int regionValue4366;

        region1026: {
        java.lang.Object regionValue4356;
        int regionValue4355;
        int regionValue4354;
        java.lang.Object regionValue4353;
        int regionValue4352;
        java.lang.Object regionValue4351;
        java.lang.Object regionValue4350;
        int regionValue4349;
        java.lang.Object regionValue4348;
        int regionValue4345;

        region1024: {
        int regionValue4314;
        int regionValue4313;
        java.lang.Object regionValue4312;
        int regionValue4311;
        java.lang.Object regionValue4310;
        java.lang.Object regionValue4309;
        java.lang.Object regionValue4307;
        int regionValue4304;
        java.lang.Object regionValue4316;
        java.lang.Object regionValue4315;
        int regionValue4308;

        region1023: {
        java.lang.Object regionValue4294;
        java.lang.Object regionValue4293;
        int regionValue4292;
        int regionValue4291;
        java.lang.Object regionValue4290;
        int regionValue4289;
        java.lang.Object regionValue4288;
        java.lang.Object regionValue4287;
        int regionValue4286;
        java.lang.Object regionValue4285;
        int regionValue4282;

        region1021: {
        java.lang.Object regionValue4250;
        int regionValue4249;
        int regionValue4248;
        java.lang.Object regionValue4247;
        int regionValue4246;
        java.lang.Object regionValue4245;
        java.lang.Object regionValue4244;
        int regionValue4243;
        java.lang.Object regionValue4242;
        int regionValue4239;

        region1018: {
        int regionValue4207;
        int regionValue4206;
        java.lang.Object regionValue4205;
        int regionValue4204;
        java.lang.Object regionValue4203;
        java.lang.Object regionValue4202;
        int regionValue4201;
        java.lang.Object regionValue4200;
        int regionValue4197;
        java.lang.Object regionValue4209;
        java.lang.Object regionValue4208;

        region1017: {
        java.lang.Object regionValue4187;
        java.lang.Object regionValue4186;
        int regionValue4185;
        int regionValue4184;
        java.lang.Object regionValue4183;
        int regionValue4182;
        java.lang.Object regionValue4181;
        java.lang.Object regionValue4180;
        int regionValue4179;
        java.lang.Object regionValue4178;
        int regionValue4175;

        region1015: {
        java.lang.Object regionValue4162;
        java.lang.Object regionValue4159;
        int regionValue4158;
        java.lang.Object regionValue4157;
        int regionValue4154;
        java.lang.Object regionValue4165;
        int regionValue4164;
        int regionValue4163;
        int regionValue4161;
        java.lang.Object regionValue4160;

        region1012: {
        java.lang.Object regionValue4144;
        int regionValue4143;
        int regionValue4142;
        java.lang.Object regionValue4141;
        int regionValue4140;
        java.lang.Object regionValue4139;
        java.lang.Object regionValue4138;
        int regionValue4137;
        java.lang.Object regionValue4136;
        int regionValue4133;

        region1010: {
        int regionValue4101;
        int regionValue4100;
        java.lang.Object regionValue4099;
        int regionValue4098;
        java.lang.Object regionValue4097;
        java.lang.Object regionValue4096;
        int regionValue4095;
        java.lang.Object regionValue4094;
        int regionValue4091;
        java.lang.Object regionValue4102;

        region1009: {
        int regionValue4051;
        int regionValue4050;
        java.lang.Object regionValue4049;
        int regionValue4048;
        java.lang.Object regionValue4047;
        java.lang.Object regionValue4046;
        int regionValue4045;
        java.lang.Object regionValue4044;
        int regionValue4041;
        java.lang.Object value4059;
        java.lang.Object value4058;
        java.lang.Object value4057;
        java.lang.Object value4056;
        java.lang.Object value4055;
        java.lang.Object value4054;
        java.lang.Object value4053;
        java.lang.Object value4052;
        int comparison4060;

        region990: {
        int value4031;
        java.lang.Object value4030;
        java.lang.Object value4029;
        java.lang.Object value4028;
        java.lang.Object value4027;
        java.lang.Object value4026;
        java.lang.Object value4025;

        value4025 = recovery$indy$flow$270();
        value4026 = value4025;
        value4027 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4026))))));
        value4028 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4027)))).field_42P));
        value4029 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value4028)))).field_429));
        value4030 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value4029)))).field_46));
        value4031 = recovery$indy$flow$275(value4030);
        if (regionValue4024 >= value4031) {
            regionValue3444 = regionValue4014;
            regionValue3447 = regionValue4017;
            regionValue3448 = regionValue4018;
            regionValue3449 = regionValue4019;
            regionValue3450 = regionValue4020;
            regionValue3451 = regionValue4021;
            break region1106;
        } else {
            regionValue4041 = regionValue4014;
            regionValue4044 = regionValue4017;
            regionValue4045 = regionValue4018;
            regionValue4046 = regionValue4019;
            regionValue4047 = regionValue4020;
            regionValue4048 = regionValue4021;
            regionValue4049 = regionValue4022;
            regionValue4050 = regionValue4023;
            regionValue4051 = regionValue4024;
            break region990;
        }
        }
        value4052 = recovery$indy$flow$276();
        value4053 = value4052;
        value4054 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4053))))));
        value4055 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4054)))).field_42P));
        value4056 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value4055)))).field_429));
        value4057 = recovery$indy$flow$280(value4056, regionValue4051);
        value4058 = recovery$indy$flow$281(value4057);
        value4059 = value4058;
        comparison4060 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4060 <= 0) {
            regionValue4070 = regionValue4041;
            regionValue4073 = regionValue4044;
            regionValue4074 = regionValue4045;
            regionValue4075 = regionValue4046;
            regionValue4076 = regionValue4047;
            regionValue4077 = regionValue4048;
            regionValue4078 = regionValue4049;
            regionValue4079 = regionValue4050;
            regionValue4080 = regionValue4051;
            break region1105;
        } else {
            regionValue4091 = regionValue4041;
            regionValue4094 = regionValue4044;
            regionValue4095 = regionValue4045;
            regionValue4096 = regionValue4046;
            regionValue4097 = regionValue4047;
            regionValue4098 = regionValue4048;
            regionValue4099 = regionValue4049;
            regionValue4100 = regionValue4050;
            regionValue4101 = regionValue4051;
            regionValue4102 = value4059;
            break region1009;
        }
        }
        if (value24 == 0) {
            regionValue4113 = regionValue4091;
            regionValue4116 = regionValue4094;
            regionValue4117 = regionValue4095;
            regionValue4118 = regionValue4096;
            regionValue4119 = regionValue4097;
            regionValue4120 = regionValue4098;
            regionValue4121 = regionValue4099;
            regionValue4122 = regionValue4100;
            regionValue4123 = regionValue4101;
            break region1104;
        } else {
            regionValue4133 = regionValue4091;
            regionValue4136 = regionValue4094;
            regionValue4137 = regionValue4095;
            regionValue4138 = regionValue4096;
            regionValue4139 = regionValue4097;
            regionValue4140 = regionValue4098;
            regionValue4141 = regionValue4099;
            regionValue4142 = regionValue4100;
            regionValue4143 = regionValue4101;
            regionValue4144 = regionValue4102;
            break region1010;
        }
        }
        regionValue4154 = regionValue4133;
        regionValue4157 = regionValue4136;
        regionValue4158 = regionValue4137;
        regionValue4159 = regionValue4138;
        regionValue4160 = regionValue4139;
        regionValue4161 = regionValue4140;
        regionValue4162 = regionValue4141;
        regionValue4163 = regionValue4142;
        regionValue4164 = regionValue4143;
        regionValue4165 = regionValue4144;
        break region1012;
        }
        if (value24 == 0) {
            regionValue786 = regionValue4154;
            regionValue789 = regionValue4157;
            regionValue790 = regionValue4158;
            regionValue791 = regionValue4159;
            regionValue792 = regionValue4162;
            continue loop359;
        } else {
            regionValue4175 = regionValue4154;
            regionValue4178 = regionValue4157;
            regionValue4179 = regionValue4158;
            regionValue4180 = regionValue4159;
            regionValue4181 = regionValue4160;
            regionValue4182 = regionValue4161;
            regionValue4183 = regionValue4162;
            regionValue4184 = regionValue4163;
            regionValue4185 = regionValue4164;
            regionValue4186 = regionValue4165;
            regionValue4187 = regionValue4162;
            break region1015;
        }
        }
        regionValue4197 = regionValue4175;
        regionValue4200 = regionValue4178;
        regionValue4201 = regionValue4179;
        regionValue4202 = regionValue4180;
        regionValue4203 = regionValue4181;
        regionValue4204 = regionValue4182;
        regionValue4205 = regionValue4183;
        regionValue4206 = regionValue4184;
        regionValue4207 = regionValue4185;
        regionValue4208 = regionValue4186;
        regionValue4209 = regionValue4187;
        break region1017;
        }
        if (regionValue4209 == null) {
            regionValue4219 = regionValue4197;
            regionValue4222 = regionValue4200;
            regionValue4223 = regionValue4201;
            regionValue4224 = regionValue4202;
            regionValue4225 = regionValue4203;
            regionValue4226 = regionValue4204;
            regionValue4227 = regionValue4205;
            regionValue4228 = regionValue4206;
            regionValue4229 = regionValue4207;
            break region1103;
        } else {
            regionValue4239 = regionValue4197;
            regionValue4242 = regionValue4200;
            regionValue4243 = regionValue4201;
            regionValue4244 = regionValue4202;
            regionValue4245 = regionValue4203;
            regionValue4246 = regionValue4204;
            regionValue4247 = regionValue4205;
            regionValue4248 = regionValue4206;
            regionValue4249 = regionValue4207;
            regionValue4250 = regionValue4208;
            break region1018;
        }
        }
        if (value24 == 0) {
            regionValue4260 = regionValue4239;
            regionValue4263 = regionValue4242;
            regionValue4264 = regionValue4243;
            regionValue4265 = regionValue4244;
            regionValue4266 = regionValue4245;
            regionValue4267 = regionValue4246;
            regionValue4268 = regionValue4247;
            regionValue4269 = regionValue4248;
            regionValue4270 = regionValue4249;
            regionValue4271 = regionValue4250;
            regionValue4272 = regionValue4250;
            break region1027;
        } else {
            regionValue4282 = regionValue4239;
            regionValue4285 = regionValue4242;
            regionValue4286 = regionValue4243;
            regionValue4287 = regionValue4244;
            regionValue4288 = regionValue4245;
            regionValue4289 = regionValue4246;
            regionValue4290 = regionValue4247;
            regionValue4291 = regionValue4248;
            regionValue4292 = regionValue4249;
            regionValue4293 = regionValue4250;
            regionValue4294 = regionValue4250;
            break region1021;
        }
        }
        regionValue4304 = regionValue4282;
        regionValue4307 = regionValue4285;
        regionValue4308 = regionValue4286;
        regionValue4309 = regionValue4287;
        regionValue4310 = regionValue4288;
        regionValue4311 = regionValue4289;
        regionValue4312 = regionValue4290;
        regionValue4313 = regionValue4291;
        regionValue4314 = regionValue4292;
        regionValue4315 = regionValue4293;
        regionValue4316 = regionValue4294;
        break region1023;
        }
        if (regionValue4316 == null) {
            regionValue4326 = regionValue4304;
            regionValue4329 = regionValue4307;
            regionValue4330 = regionValue4309;
            regionValue4331 = regionValue4310;
            regionValue4332 = regionValue4311;
            regionValue4333 = regionValue4312;
            regionValue4334 = regionValue4313;
            regionValue4335 = regionValue4314;
            break region1057;
        } else {
            regionValue4345 = regionValue4304;
            regionValue4348 = regionValue4307;
            regionValue4349 = regionValue4308;
            regionValue4350 = regionValue4309;
            regionValue4351 = regionValue4310;
            regionValue4352 = regionValue4311;
            regionValue4353 = regionValue4312;
            regionValue4354 = regionValue4313;
            regionValue4355 = regionValue4314;
            regionValue4356 = regionValue4315;
            break region1024;
        }
        }
        regionValue4366 = regionValue4345;
        regionValue4369 = regionValue4348;
        regionValue4370 = regionValue4349;
        regionValue4371 = regionValue4350;
        regionValue4372 = regionValue4351;
        regionValue4373 = regionValue4352;
        regionValue4374 = regionValue4353;
        regionValue4375 = regionValue4354;
        regionValue4376 = regionValue4355;
        regionValue4377 = regionValue4356;
        break region1026;
        }
        regionValue4260 = regionValue4366;
        regionValue4263 = regionValue4369;
        regionValue4264 = regionValue4370;
        regionValue4265 = regionValue4371;
        regionValue4266 = regionValue4372;
        regionValue4267 = regionValue4373;
        regionValue4268 = regionValue4374;
        regionValue4269 = regionValue4375;
        regionValue4270 = regionValue4376;
        regionValue4271 = regionValue4377;
        regionValue4272 = regionValue4377;
        break region1027;
        }
        value4378 = recovery$indy$flow$282(regionValue4272);
        value4379 = recovery$indy$flow$283(regionValue4268);
        value4380 = recovery$indy$flow$284(value4378, value4379);
        comparison4381 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4381 <= 0) {
            regionValue4391 = regionValue4260;
            regionValue4394 = regionValue4263;
            regionValue4395 = regionValue4264;
            regionValue4396 = regionValue4265;
            regionValue4397 = regionValue4266;
            regionValue4398 = regionValue4267;
            regionValue4399 = regionValue4268;
            regionValue4400 = regionValue4269;
            regionValue4401 = regionValue4270;
            regionValue4402 = (int) ((value4380 ? 1 : 0));
            break region1045;
        } else {
            regionValue4413 = regionValue4260;
            regionValue4416 = regionValue4263;
            regionValue4417 = regionValue4264;
            regionValue4418 = regionValue4265;
            regionValue4419 = regionValue4266;
            regionValue4420 = regionValue4267;
            regionValue4421 = regionValue4268;
            regionValue4422 = regionValue4269;
            regionValue4423 = regionValue4270;
            regionValue4424 = regionValue4271;
            regionValue4425 = (int) ((value4380 ? 1 : 0));
            break region1036;
        }
        }
        if (value24 == 0) {
            regionValue4436 = regionValue4413;
            regionValue4439 = regionValue4416;
            regionValue4440 = regionValue4417;
            regionValue4441 = regionValue4418;
            regionValue4442 = regionValue4419;
            regionValue4443 = regionValue4420;
            regionValue4444 = regionValue4421;
            regionValue4445 = regionValue4422;
            regionValue4446 = regionValue4423;
            regionValue4447 = regionValue4425;
            break region1044;
        } else {
            regionValue4457 = regionValue4413;
            regionValue4460 = regionValue4416;
            regionValue4461 = regionValue4417;
            regionValue4462 = regionValue4418;
            regionValue4463 = regionValue4419;
            regionValue4464 = regionValue4420;
            regionValue4465 = regionValue4421;
            regionValue4466 = regionValue4422;
            regionValue4467 = regionValue4423;
            regionValue4468 = regionValue4424;
            regionValue4469 = regionValue4425;
            break region1037;
        }
        }
        regionValue4479 = regionValue4457;
        regionValue4482 = regionValue4460;
        regionValue4483 = regionValue4461;
        regionValue4484 = regionValue4462;
        regionValue4485 = regionValue4463;
        regionValue4486 = regionValue4464;
        regionValue4487 = regionValue4465;
        regionValue4488 = regionValue4466;
        regionValue4489 = regionValue4467;
        regionValue4490 = regionValue4468;
        regionValue4491 = regionValue4469;
        break region1039;
        }
        if (regionValue4491 == 0) {
            regionValue4219 = regionValue4479;
            regionValue4222 = regionValue4482;
            regionValue4223 = regionValue4483;
            regionValue4224 = regionValue4484;
            regionValue4225 = regionValue4485;
            regionValue4226 = regionValue4486;
            regionValue4227 = regionValue4487;
            regionValue4228 = regionValue4488;
            regionValue4229 = regionValue4489;
            break region1103;
        } else {
            regionValue4501 = regionValue4479;
            regionValue4504 = regionValue4482;
            regionValue4505 = regionValue4483;
            regionValue4506 = regionValue4484;
            regionValue4507 = regionValue4485;
            regionValue4508 = regionValue4486;
            regionValue4509 = regionValue4487;
            regionValue4510 = regionValue4488;
            regionValue4511 = regionValue4489;
            regionValue4512 = regionValue4490;
            break region1040;
        }
        }
        value4513 = recovery$indy$flow$285(regionValue4512);
        regionValue4436 = regionValue4501;
        regionValue4439 = regionValue4504;
        regionValue4440 = regionValue4505;
        regionValue4441 = regionValue4506;
        regionValue4442 = regionValue4507;
        regionValue4443 = regionValue4508;
        regionValue4444 = regionValue4509;
        regionValue4445 = regionValue4510;
        regionValue4446 = regionValue4511;
        regionValue4447 = value4513;
        break region1044;
        }
        regionValue4391 = regionValue4436;
        regionValue4394 = regionValue4439;
        regionValue4395 = regionValue4440;
        regionValue4396 = regionValue4441;
        regionValue4397 = regionValue4442;
        regionValue4398 = regionValue4443;
        regionValue4399 = regionValue4444;
        regionValue4400 = regionValue4445;
        regionValue4401 = regionValue4446;
        regionValue4402 = regionValue4447;
        break region1045;
        }
        comparison4514 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4514 <= 0) {
            regionValue4524 = regionValue4391;
            regionValue4527 = regionValue4394;
            regionValue4528 = regionValue4395;
            regionValue4529 = regionValue4396;
            regionValue4530 = regionValue4397;
            regionValue4531 = regionValue4398;
            regionValue4532 = regionValue4399;
            regionValue4533 = regionValue4400;
            regionValue4534 = regionValue4401;
            regionValue4535 = regionValue4402;
            regionValue4536 = value24;
            break region1056;
        } else {
            regionValue4546 = regionValue4391;
            regionValue4549 = regionValue4394;
            regionValue4550 = regionValue4395;
            regionValue4551 = regionValue4396;
            regionValue4552 = regionValue4397;
            regionValue4553 = regionValue4398;
            regionValue4554 = regionValue4399;
            regionValue4555 = regionValue4400;
            regionValue4556 = regionValue4401;
            regionValue4557 = regionValue4402;
            break region1049;
        }
        }
        if (value24 == 0) {
            regionValue4568 = regionValue4546;
            regionValue4571 = regionValue4549;
            regionValue4572 = regionValue4551;
            regionValue4573 = regionValue4552;
            regionValue4574 = regionValue4553;
            regionValue4575 = regionValue4554;
            regionValue4576 = regionValue4555;
            regionValue4577 = regionValue4556;
            regionValue4578 = regionValue4557;
            break region1094;
        } else {
            regionValue4588 = regionValue4546;
            regionValue4591 = regionValue4549;
            regionValue4592 = regionValue4550;
            regionValue4593 = regionValue4551;
            regionValue4594 = regionValue4552;
            regionValue4595 = regionValue4553;
            regionValue4596 = regionValue4554;
            regionValue4597 = regionValue4555;
            regionValue4598 = regionValue4556;
            regionValue4599 = regionValue4557;
            break region1050;
        }
        }
        regionValue4609 = regionValue4588;
        regionValue4612 = regionValue4591;
        regionValue4613 = regionValue4592;
        regionValue4614 = regionValue4593;
        regionValue4615 = regionValue4594;
        regionValue4616 = regionValue4595;
        regionValue4617 = regionValue4596;
        regionValue4618 = regionValue4597;
        regionValue4619 = regionValue4598;
        regionValue4620 = regionValue4599;
        break region1052;
        }
        value4621 = recovery$indy$flow$286(regionValue4617);
        regionValue4524 = regionValue4609;
        regionValue4527 = regionValue4612;
        regionValue4528 = regionValue4613;
        regionValue4529 = regionValue4614;
        regionValue4530 = regionValue4615;
        regionValue4531 = regionValue4616;
        regionValue4532 = regionValue4617;
        regionValue4533 = regionValue4618;
        regionValue4534 = regionValue4619;
        regionValue4535 = regionValue4620;
        regionValue4536 = value4621;
        break region1056;
        }
        if (regionValue4535 >= regionValue4536) {
            regionValue4219 = regionValue4524;
            regionValue4222 = regionValue4527;
            regionValue4223 = regionValue4528;
            regionValue4224 = regionValue4529;
            regionValue4225 = regionValue4530;
            regionValue4226 = regionValue4531;
            regionValue4227 = regionValue4532;
            regionValue4228 = regionValue4533;
            regionValue4229 = regionValue4534;
            break region1103;
        } else {
            regionValue4326 = regionValue4524;
            regionValue4329 = regionValue4527;
            regionValue4330 = regionValue4529;
            regionValue4331 = regionValue4530;
            regionValue4332 = regionValue4531;
            regionValue4333 = regionValue4532;
            regionValue4334 = regionValue4533;
            regionValue4335 = regionValue4534;
            break region1057;
        }
        }
        value4622 = recovery$indy$flow$287();
        value4623 = value4622;
        value4624 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4623))))));
        value4625 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4624)))).field_42P));
        value4626 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value4625)))).field_429));
        value4627 = value4626;
        value4628 = -1;
        value4630 = regionValue4334;
        value4632 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this))))));
        value4633 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value4627))))));
        recovery$indy$flow$293(value4632, value4630, computed17, value4628, value4633);
        recovery$indy$flow$294(this, false);
        regionValue4568 = regionValue4326;
        regionValue4571 = regionValue4329;
        regionValue4572 = regionValue4330;
        regionValue4573 = regionValue4331;
        regionValue4574 = regionValue4332;
        regionValue4575 = regionValue4333;
        regionValue4576 = regionValue4334;
        regionValue4577 = regionValue4335;
        regionValue4578 = 0;
        break region1094;
        }
        value4634 = regionValue4578;
        comparison4635 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4635 < 0) {
            regionValue4645 = regionValue4568;
            regionValue4648 = regionValue4571;
            regionValue4649 = regionValue4572;
            regionValue4650 = regionValue4573;
            regionValue4651 = regionValue4574;
            regionValue4652 = value4634;
            break region1112;
        } else {
            regionValue4663 = regionValue4568;
            regionValue4666 = regionValue4571;
            regionValue4667 = regionValue4572;
            regionValue4668 = regionValue4573;
            regionValue4669 = regionValue4574;
            regionValue4670 = regionValue4575;
            regionValue4671 = regionValue4576;
            regionValue4672 = regionValue4577;
            regionValue4673 = value4634;
            break region1100;
        }
        }
        if (value24 != 0) {
            regionValue3444 = regionValue4663;
            regionValue3447 = regionValue4666;
            regionValue3448 = regionValue4673;
            regionValue3449 = regionValue4667;
            regionValue3450 = regionValue4668;
            regionValue3451 = regionValue4669;
            break region1106;
        } else {
            regionValue4684 = regionValue4663;
            regionValue4687 = regionValue4666;
            regionValue4688 = regionValue4667;
            regionValue4689 = regionValue4668;
            regionValue4690 = regionValue4669;
            regionValue4691 = regionValue4670;
            regionValue4692 = regionValue4671;
            regionValue4693 = regionValue4672;
            regionValue4694 = regionValue4673;
            break region1101;
        }
        }
        regionValue4219 = regionValue4684;
        regionValue4222 = regionValue4687;
        regionValue4223 = regionValue4694;
        regionValue4224 = regionValue4688;
        regionValue4225 = regionValue4689;
        regionValue4226 = regionValue4690;
        regionValue4227 = regionValue4691;
        regionValue4228 = regionValue4692;
        regionValue4229 = regionValue4693;
        break region1103;
        }
        incremented4695 = regionValue4229 + (1);
        regionValue4113 = regionValue4219;
        regionValue4116 = regionValue4222;
        regionValue4117 = regionValue4223;
        regionValue4118 = regionValue4224;
        regionValue4119 = regionValue4225;
        regionValue4120 = regionValue4226;
        regionValue4121 = regionValue4227;
        regionValue4122 = regionValue4228;
        regionValue4123 = incremented4695;
        break region1104;
        }
        regionValue4070 = regionValue4113;
        regionValue4073 = regionValue4116;
        regionValue4074 = regionValue4117;
        regionValue4075 = regionValue4118;
        regionValue4076 = regionValue4119;
        regionValue4077 = regionValue4120;
        regionValue4078 = regionValue4121;
        regionValue4079 = regionValue4122;
        regionValue4080 = regionValue4123;
        break region1105;
        }
        if (value24 != 0) {
            regionValue4014 = regionValue4070;
            regionValue4017 = regionValue4073;
            regionValue4018 = regionValue4074;
            regionValue4019 = regionValue4075;
            regionValue4020 = regionValue4076;
            regionValue4021 = regionValue4077;
            regionValue4022 = regionValue4078;
            regionValue4023 = regionValue4079;
            regionValue4024 = regionValue4080;
            continue loop976;
        } else {
            regionValue3444 = regionValue4070;
            regionValue3447 = regionValue4073;
            regionValue3448 = regionValue4074;
            regionValue3449 = regionValue4075;
            regionValue3450 = regionValue4076;
            regionValue3451 = regionValue4077;
            break region1106;
        }
        }
        }
        incremented4696 = regionValue3451 + (1);
        regionValue3532 = regionValue3444;
        regionValue3535 = regionValue3447;
        regionValue3536 = regionValue3448;
        regionValue3537 = regionValue3449;
        regionValue3538 = regionValue3450;
        regionValue3539 = incremented4696;
        break region1108;
        }
        comparison4697 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4697 < 0) {
            regionValue865 = regionValue3532;
            regionValue868 = regionValue3535;
            regionValue869 = regionValue3536;
            regionValue870 = regionValue3537;
            regionValue871 = regionValue3538;
            regionValue872 = value24;
            continue loop367;
        } else {
            regionValue4645 = regionValue3532;
            regionValue4648 = regionValue3535;
            regionValue4649 = regionValue3537;
            regionValue4650 = regionValue3538;
            regionValue4651 = regionValue3539;
            regionValue4652 = regionValue3536;
            break region1112;
        }
        }
        if (value24 != 0) {
            regionValue3356 = regionValue4645;
            regionValue3359 = regionValue4648;
            regionValue3360 = regionValue4652;
            regionValue3361 = regionValue4649;
            regionValue3362 = regionValue4650;
            regionValue3363 = regionValue4651;
            continue loop873;
        } else {
            regionValue2259 = regionValue4645;
            regionValue2262 = regionValue4648;
            regionValue2263 = regionValue4652;
            break region1113;
        }
        }
        }
        }
        }
        regionValue2259 = regionValue849;
        regionValue2262 = regionValue852;
        regionValue2263 = regionValue853;
        break region1113;
        }
        incremented4698 = regionValue2263 + (1);
        regionValue1110 = regionValue2259;
        regionValue1113 = regionValue2262;
        regionValue1114 = incremented4698;
        break region1114;
        }
        comparison4699 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4699 < 0) {
            regionValue529 = regionValue1110;
            regionValue532 = regionValue1113;
            regionValue533 = regionValue1114;
            regionValue534 = value24;
            continue loop267;
        } else {
            regionValue2667 = regionValue1110;
            regionValue2670 = regionValue1113;
            regionValue2671 = regionValue1114;
            break region1119;
        }
        }
        if (value24 != 0) {
            regionValue515 = regionValue2667;
            regionValue518 = regionValue2670;
            regionValue519 = regionValue2671;
            continue loop266;
        } else {
            regionValue4709 = regionValue2667;
            regionValue4712 = regionValue2670;
            regionValue4713 = regionValue2671;
            break region1120;
        }
        }
        comparison4714 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison4714 < 0) {
            regionValue736 = regionValue4709;
            regionValue739 = regionValue4712;
            regionValue740 = regionValue4713;
            continue loop344;
        } else {
            break region1124;
        }
        }
        }
        }
        }
        }
        return false;
        }
        return false;
        }
        return false;
        }
        break region971;
        }
        return false;
        }
        regionValue619 = 1;
        break region1125;
        }
        return ((regionValue619 & 1) != 0);
    }












   public ArrayList method_40$0939088f00(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 119534325061238L;
      boolean var6 = recovery$indy$33(1415570536621446602L, var1);
      ArrayList var7 = new ArrayList();
      boolean var10000 = recovery$indy$34(this.settingSlot1, var4, 1414815989040565186L, var1).equals(var3);
      if (!var6) {
         if (var10000) {
            var7.add(0);
         }

         var10000 = recovery$indy$35(this.settingSlot2, var4, 1414815989040565186L, var1).equals(var3);
      }

      boolean var10001 = var6;
      if (var1 > 0L) {
         if (!var6) {
            if (var10000) {
               var7.add(1);
            }

            var10000 = recovery$indy$36(this.settingSlot3, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(2);
            }

            var10000 = recovery$indy$37(this.settingSlot4, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(3);
            }

            var10000 = recovery$indy$38(this.settingSlot5, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(4);
            }

            var10000 = recovery$indy$39(this.settingSlot6, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(5);
            }

            var10000 = recovery$indy$40(this.settingSlot7, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(6);
            }

            var10000 = recovery$indy$41(this.settingSlot8, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (!var10001) {
            if (var10000) {
               var7.add(7);
            }

            var10000 = recovery$indy$42(this.settingSlot9, var4, 1414815989040565186L, var1).equals(var3);
         }

         var10001 = var6;
      }

      if (!var10001 && var10000) {
         var7.add(8);
      }

      return var7;
   }




   public ArrayList method_40$7ff9eced9c(int var1, C_47gG var2, String var3, int var4, int var5) {
      long var6;
      long var8;
      int var10;
      int var11;
      int var12;
      long var13;
      long var15;
      long var17;
      long var19;
      int var21;
      int var22;
      int var23;
      long var24;
      long var26;
      int var31;
      var6 = ((long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      var8 = var6 ^ 91457200217452L;
      long var10001 = var6 ^ 59562647542790L;
      var10 = (int)((var6 ^ 59562647542790L) >>> 48);
      var11 = (int)((var6 ^ 59562647542790L) << 16 >>> 48);
      var12 = (int)(var10001 << 32 >>> 32);
      var13 = var6 ^ 43983777355932L;
      var15 = var6 ^ 21852510056199L;
      var17 = var6 ^ 26063093068042L;
      var19 = var6 ^ 140675391373284L;
      var10001 = var6 ^ 118054540646319L;
      var21 = (int)((var6 ^ 118054540646319L) >>> 32);
      var22 = (int)((var6 ^ 118054540646319L) << 32 >>> 48);
      var23 = (int)(var10001 << 48 >>> 48);
      var24 = var6 ^ 56038955066584L;
      var26 = var6 ^ 97261217073932L;
      String var29 = var3;
      byte var10000 = (byte) ((recovery$indy$43(2895005543681732162L, var6)) ? 1 : 0);
      byte var30 = -1;
      byte var28 = var10000;
      var31 = var29.hashCode();
      label209:
      if (var28 == 0) {
         label211: {
            label206: {
               label212: {
                  label204: {
                     label213: {
                        label202: {
                           label214: {
                              label200: {
                                 label215: {
                                    label198: {
                                       label216: {
                                          label196: {
                                             label217: {
                                                label194: {
                                                   label218: {
                                                      switch (var31) {
                                                         case 82343:
                                                            break label218;
                                                         case 2195582:
                                                            break label215;
                                                         case 80075068:
                                                            break label212;
                                                         case 80307677:
                                                            var31 = (int) ((var29.equals(recovery$indy$44(29279, 240716987438636424L ^ var6))) ? 1 : 0);
                                                            if (var28 != 0) {
                                                               break label209;
                                                            }

                                                            if (var31 == 0) {
                                                               break label211;
                                                            }

                                                            var30 = 0;
                                                            var31 = var28;
                                                            if (var1 < 0) {
                                                               break;
                                                            }

                                                            if (var28 == 0) {
                                                               break label211;
                                                            }
                                                         case 66986:
                                                            var31 = (int) ((var29.equals(recovery$indy$45(29610, 7707664355179764863L ^ var6))) ? 1 : 0);
                                                            break;
                                                         case 478938549:
                                                            break label213;
                                                         case 1721084755:
                                                            break label217;
                                                         case 1992669606:
                                                            break label216;
                                                         case 2125698931:
                                                            break label214;
                                                         default:
                                                            break label211;
                                                      }

                                                      if (var28 != 0) {
                                                         break label209;
                                                      }

                                                      if (var31 == 0) {
                                                         break label211;
                                                      }

                                                      var30 = 1;
                                                      var31 = var28;
                                                      if (var1 <= 0) {
                                                         break label194;
                                                      }

                                                      if (var28 == 0) {
                                                         break label211;
                                                      }
                                                   }

                                                   var31 = (int) ((var29.equals(recovery$indy$46(27404, 3591288907566351537L ^ var6))) ? 1 : 0);
                                                }

                                                if (var28 != 0) {
                                                   break label209;
                                                }

                                                if (var31 == 0) {
                                                   break label211;
                                                }

                                                var30 = 2;
                                                var31 = var28;
                                                if (var1 <= 0) {
                                                   break label196;
                                                }

                                                if (var28 == 0) {
                                                   break label211;
                                                }
                                             }

                                             var31 = (int) ((var29.equals(recovery$indy$47(7702, 8012730761104355758L ^ var6))) ? 1 : 0);
                                          }

                                          if (var28 != 0) {
                                             break label209;
                                          }

                                          if (var31 == 0) {
                                             break label211;
                                          }

                                          var30 = 3;
                                          var31 = var28;
                                          if (var4 <= 0) {
                                             break label198;
                                          }

                                          if (var28 == 0) {
                                             break label211;
                                          }
                                       }

                                       var31 = (int) ((var29.equals(recovery$indy$48(29567, 6834293684297505971L ^ var6))) ? 1 : 0);
                                    }

                                    if (var28 != 0) {
                                       break label209;
                                    }

                                    if (var31 == 0) {
                                       break label211;
                                    }

                                    var30 = 4;
                                    var31 = var28;
                                    if (var4 < 0) {
                                       break label200;
                                    }

                                    if (var28 == 0) {
                                       break label211;
                                    }
                                 }

                                 var31 = (int) ((var29.equals(recovery$indy$49(4641, 902162573067124135L ^ var6))) ? 1 : 0);
                              }

                              if (var28 != 0) {
                                 break label209;
                              }

                              if (var31 == 0) {
                                 break label211;
                              }

                              var30 = 5;
                              var31 = var28;
                              if (var1 <= 0) {
                                 break label202;
                              }

                              if (var28 == 0) {
                                 break label211;
                              }
                           }

                           var31 = (int) ((var29.equals(recovery$indy$50(7567, 6144256770751689244L ^ var6))) ? 1 : 0);
                        }

                        if (var28 != 0) {
                           break label209;
                        }

                        if (var31 == 0) {
                           break label211;
                        }

                        var30 = 6;
                        var31 = var28;
                        if (var4 <= 0) {
                           break label204;
                        }

                        if (var28 == 0) {
                           break label211;
                        }
                     }

                     var31 = (int) ((var29.equals(recovery$indy$51(2595, 4390085481087755775L ^ var6))) ? 1 : 0);
                  }

                  if (var28 != 0) {
                     break label209;
                  }

                  if (var31 == 0) {
                     break label211;
                  }

                  var30 = 7;
                  var31 = var28;
                  if (var5 <= 0) {
                     break label206;
                  }

                  if (var28 == 0) {
                     break label211;
                  }
               }

               var31 = (int) ((var29.equals(recovery$indy$52(22987, 2517513929499194932L ^ var6))) ? 1 : 0);
            }

            if (var28 != 0) {
               break label209;
            }

            if (var31 != 0) {
               var30 = 8;
            }
         }

         var31 = var30;
      }

      switch (var31) {
         case 0:
            return recovery$indy$53(var2, var17, 5, 2889175478407427179L, var6);
         case 1:
            return recovery$indy$54(var2, var24, 5, 2887748182957346384L, var6);
         case 2:
            return recovery$indy$55(var2, var19, 5, 2887307015105137805L, var6);
         case 3:
            return recovery$indy$56(var26, var2, 5, 2888232969030331692L, var6);
         case 4:
            return recovery$indy$57(var2, 5, var8, 2890149493929783628L, var6);
         case 5:
            return recovery$indy$58((short)var10, (char)var11, var12, var2, 5, 2894330746785027951L, var6);
         case 6:
            return recovery$indy$59(var13, var2, 5, 2894032286203706297L, var6);
         case 7:
            return recovery$indy$60(var2, var15, 5, 2895638713292520315L, var6);
         case 8:
            return recovery$indy$61(var21, (short)var22, var23, var2, 5, 2890212451267279601L, var6);
         default:
            return new ArrayList();
      }
   }






   private void method_40$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 30391929310863L;
      long var5 = var3 ^ 45425729110893L;
      long var10005 = 3492061125302065181L;
      C_47gG var7 = var2;
      byte var8 = 0;
      int var9 = var1;
      long var10 = var5;
      InvManager_47QL var12 = this;
      var12.method_44$8a933f4c45(var10, var9, var8, var7);
   }



   private void method_40$4759d2c13c(int var1, net.C_47rf var2, net.C_47gG var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 122101982309452L;
      long var8 = var4 ^ 69554911796542L;
      long var10000 = -1611940141068073297L;
      boolean var10 = AirStuck_47Q4.method_45$aae029aa0a();
      int var132 = ((int) (var10 ? 1 : 0));
      net.C_47rf var33 = var2;
      if ((var132) != 0) {
         var33 = var33;
         var33 = var33;
         net.C_47rf var180 = var33;
         if (var180 != null) {
            int var134;
            label166: {
               var33 = var2;
               var134 = var33.method_46$8abf5c6871();
               net.C_47rf var135 = var3.method_46$4c10532da1(var1 + 36).method_48$ac4db64966();
               long var214;
               var132 = (var214 = var4 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
               var33 = var135;
               if (var132 >= 0) {
                  var33 = var33;
                  var33 = var33;
                  var33 = var33;
                  net.C_47rf var182 = var33;
                  if (var182 == null) {
                     break label166;
                  }

                  var33 = var135;
               }

               var33.method_48$d00df7729d(var134);
            }

            long var10004 = -1609851212090208823L;
            int var15 = var134;
            long var16 = var8;
            net.C_47gG var18 = var3;
            InvManager_47QL var19 = this;
            var19.method_46$587a1b8d2d(var18, var16, var15);
            long var210 = -1614421585123495432L;
            long var138 = var6;
            client.setting.ModeSetting var139 = this.settingClickMode;
            String var136 = var139.method_46$5f9dc63072(var138);
            byte var137 = -1;
            int var151 = var136.hashCode();
            var132 = var151;
            switch (var132) {
               case 63955982:
                  boolean var164 = var136.equals("Basic");
                  var164 = var164;
                  int var192 = ((int) (var164 ? 1 : 0));
                  label158:
                  if ((var192) != 0) {
                     var137 = 1;
                     long var217;
                     var192 = (var217 = var4 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                     var164 = var10;
                     if (var192 > 0) {
                        var164 = var164;
                        var164 = var164;
                        boolean var194 = var164;
                        if (var194) {
                           break label158;
                        }

                        var164 = var136.equals("Other");
                     }

                     var164 = var164;
                     boolean var195 = var164;
                     if (var195) {
                        var137 = 2;
                     }
                  }
                  break;
               case 76517104:
                  boolean var162 = var136.equals("Other");
                  var162 = var162;
                  boolean var191 = var162;
                  if (var191) {
                     var137 = 2;
                  }
                  break;
               case 355504491:
                  boolean var152 = var136.equals("Exploit");
                  var152 = var152;
                  int var184 = ((int) (var152 ? 1 : 0));
                  label152:
                  if ((var184) != 0) {
                     var137 = 0;
                     long var215;
                     var184 = (var215 = var4 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                     var152 = var10;
                     if (var184 >= 0) {
                        var152 = var152;
                        var152 = var152;
                        boolean var186 = var152;
                        if (var186) {
                           break label152;
                        }

                        var152 = var136.equals("Basic");
                     }

                     var152 = var152;
                     int var187 = ((int) (var152 ? 1 : 0));
                     label146:
                     if ((var187) != 0) {
                        var137 = 1;
                        long var216;
                        var187 = (var216 = var4 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                        var152 = var10;
                        if (var187 > 0) {
                           var152 = var152;
                           var152 = var152;
                           boolean var189 = var152;
                           if (var189) {
                              break label146;
                           }

                           var152 = var136.equals("Other");
                        }

                        var152 = var152;
                        boolean var190 = var152;
                        if (var190) {
                           var137 = 2;
                        }
                     }
                  }
            }

            byte var170 = var137;
            int var196 = var170;
            switch (var196) {
               case 0:
                  var10000 = -1611424717835217008L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  long var218;
                  var196 = (var218 = var4 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                  if (var196 >= 0) {
                     long var207 = -1608588988192831908L;
                     InvManager_47QL var150 = this;
                     var150.method_43$da8c82d5d4();
                  }
                  break;
               case 1:
               case 2:
                  long var205 = -1605632249435318631L;
                  net.minecraft.client.Minecraft var141 = field_43;
                  var210 = -1612195983448174142L;
                  net.minecraft.client.Minecraft var143 = field_43;
                  long var213 = -1612195983448174142L;
                  net.minecraft.client.Minecraft var145 = field_43;
                  var141.field_44K.method_42$f0ddb617a2(var143.field_42P.field_429.field_43, var134, var1, 2, var145.field_42P);
                  var205 = -1608588988192831908L;
                  InvManager_47QL var149 = this;
                  var149.method_43$da8c82d5d4();
                  break;
               default:
                  long var204 = -1608588988192831908L;
                  InvManager_47QL var148 = this;
                  var148.method_43$da8c82d5d4();
            }
         }
      } else {
         int var11 = var33.method_46$8abf5c6871();
         net.C_47rf var12 = var3.method_46$4c10532da1(var1 + 36).method_48$ac4db64966();
         long var10002 = -1614421585123495432L;
         long var20 = var6;
         client.setting.ModeSetting var22 = this.settingClickMode;
         String var13 = var22.method_46$5f9dc63072(var20);
         byte var14 = -1;
         int var27 = var13.hashCode();
         var132 = var27;
         switch (var132) {
            case 0:
               var10000 = -1611424717835217008L;
               client.Client.method_44$fbc0c0be91().getClass();
               long var219;
               var132 = (var219 = var4 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
               if (var132 >= 0) {
                  long var202 = -1605632249435318631L;
                  net.minecraft.client.Minecraft var140 = field_43;
                  var10002 = -1612195983448174142L;
                  net.minecraft.client.Minecraft var142 = field_43;
                  long var212 = -1612195983448174142L;
                  net.minecraft.client.Minecraft var144 = field_43;
                  var140.field_44K.method_42$f0ddb617a2(var142.field_42P.field_429.field_43, var11, var1, 2, var144.field_42P);
                  var202 = -1608588988192831908L;
                  InvManager_47QL var147 = this;
                  var147.method_43$da8c82d5d4();
               }
               break;
            case 1:
            case 2:
               long var200 = -1605632249435318631L;
               net.minecraft.client.Minecraft var23 = field_43;
               var10002 = -1612195983448174142L;
               net.minecraft.client.Minecraft var24 = field_43;
               long var10006 = -1612195983448174142L;
               net.minecraft.client.Minecraft var25 = field_43;
               var23.field_44K.method_42$f0ddb617a2(var24.field_42P.field_429.field_43, var11, var1, 2, var25.field_42P);
               var200 = -1608588988192831908L;
               InvManager_47QL var146 = this;
               var146.method_43$da8c82d5d4();
               break;
            default:
               long var10001 = -1608588988192831908L;
               InvManager_47QL var26 = this;
               var26.method_43$da8c82d5d4();
         }
      }
   }




   private boolean method_44$64c3bd4fac(RangeSetting var1, C_47gG var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 87025767726052L;
      long var7 = var3 ^ 62163181950465L;
      byte var9 = (byte) ((recovery$indy$62(5738774244804223146L, var3)) ? 1 : 0);
      int var10000 = recovery$indy$63(5740279756430194828L, var3);
      if (var9 != 0) {
         if (var10000 > 0) {
            var10000 = recovery$indy$64(5740279756430194828L, var3);
            int var10001 = var9;
            if (var3 >= 0L) {
               if (var9 == 0) {
                  return var10000 != 0;
               }

               var10001 = var2.field_46.size();
            }

            label116:
            if (var10000 < var10001) {
               C_47sT var10 = var2.method_46$4c10532da1(recovery$indy$65(5740279756430194828L, var3));
               int var11 = var10.field_40;
               int var12 = var10.field_46;
               double var13 = Double.MAX_VALUE;
               int var15 = -1;
               int var16 = 5;

               while (var16 < var2.field_46.size()) {
                  C_47rf var17 = var2.method_46$4c10532da1(var16).method_48$ac4db64966();
                  int var24 = var9;
                  if (var3 >= 0L) {
                     if (var9 == 0) {
                        break label116;
                     }

                     var24 = var9;
                  }

                  label110: {
                     label109:
                     if (var24 != 0) {
                        label107:
                        if (var17 == null) {
                           var24 = var16;
                           var10001 = recovery$indy$66(5740279756430194828L, var3);
                           if (var9 != 0) {
                              if (var16 == var10001) {
                                 break label107;
                              }

                              var24 = var16;
                              var10001 = var15;
                           }

                           label101:
                           if (var24 != var10001) {
                              C_47sT var18 = var2.method_46$4c10532da1(var16);
                              int var19 = var11 - var18.field_40;
                              int var20 = var12 - var18.field_46;
                              double var21 = Math.sqrt(var19 * var19 + var20 * var20);
                              var24 = var9;
                              if (var3 <= 0L) {
                                 break label110;
                              }

                              if (var9 == 0) {
                                 break label109;
                              }

                              double var29;
                              var24 = (var29 = var21 - var13) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
                              if (var3 > 0L) {
                                 if (var24 >= 0) {
                                    break label101;
                                 }

                                 var13 = var21;
                                 var24 = var16;
                              }

                              var15 = var24;
                           }
                        }

                        var16++;
                     }

                     var24 = var9;
                  }

                  if (var24 == 0) {
                     break;
                  }
               }

               double var30;
               var10000 = (var30 = var13 - 36.0) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
               if (var3 < 0L || var9 == 0) {
                  return var10000 != 0;
               }

               if (var10000 < 0) {
                  boolean var33 = recovery$indy$67(this, var7, this.field_44g, var1, 5740612135579798416L, var3);
                  if (var9 == 0) {
                     return var33;
                  }

                  if (var33) {
                     recovery$indy$68(this, var15, var5, -1, var2, 5742780987373350421L, var3);
                     return true;
                  }
               }
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }




   private void method_44$674b75e8e1(char var1, int var2, short var3) {
      boolean var8;
      label44: {
         long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
         long var6 = var4 ^ 28560007384228L;
         long var10000 = -8541243089867043048L;
         var8 = AirStuck_47Q4.method_419$aae029aa0a();
         long var10002 = -8543298894276210416L;
         long var9 = var6;
         ModeSetting var11 = this.settingMode;
         boolean var20 = var11.method_46$5f9dc63072(var9).equals("SpoofInv");
         if (!var8) {
            if (var20) {
               break label44;
            }

            var10002 = -8543298894276210416L;
            long var12 = var6;
            ModeSetting var14 = this.settingMode;
            var20 = var14.method_46$5f9dc63072(var12).equals("SpoofInvOther");
         }

         if (!var20) {
            return;
         }
      }

      Minecraft var22;
      label48: {
         long var10001 = -8554549285065920214L;
         Minecraft var15 = field_43;
         GuiScreen var21 = var15.field_42P.method_46$f8ba6cbd86();
         if (!var8) {
            if (var21 != null) {
               return;
            }

            var22 = field_43;
            if (var8) {
               break label48;
            }

            var10001 = -8542000754078302906L;
            Minecraft var16 = field_43;
            var21 = var16.field_44m;
         }

         if (var21 != null) {
            return;
         }

         var10001 = -8554549285065920214L;
         Minecraft var17 = field_43;
         var17.field_42P.field_49m.method_45$631790539f(new C_47jt(C_4713.OPEN_INVENTORY_ACHIEVEMENT));
         var22 = field_43;
      }

      long var25 = -8554549285065920214L;
      Minecraft var18 = var22;
      long var10004 = -8554549285065920214L;
      Minecraft var19 = field_43;
      var18.field_42P.method_40$7480b345ab(new C_47pL(var19.field_42P));
   }




   private boolean method_44$fcc0b55219(boolean var1, boolean var2, long var3) {
        boolean var270;
        int var274;
        boolean var284;
        boolean var285;
        boolean var286;
        int var319;
      var3 = a ^ var3;
      long var10001 = var3 ^ 136350299347257L;
      int var5 = (int)((var3 ^ 136350299347257L) >>> 32);
      int var6 = (int)((var3 ^ 136350299347257L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 91228434782718L;
      var10001 = var3 ^ 124663920559386L;
      int var10 = (int)((var3 ^ 124663920559386L) >>> 32);
      int var11 = (int)((var3 ^ 124663920559386L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var3 ^ 344281713203L;
      long var15 = var3 ^ 113354266539214L;
      var10001 = var3 ^ 57858895968355L;
      int var17 = (int)((var3 ^ 57858895968355L) >>> 48);
      int var18 = (int)((var3 ^ 57858895968355L) << 16 >>> 32);
      int var19 = (int)(var10001 << 48 >>> 48);
      long var20 = var3 ^ 30703307871549L;
      long var22 = var3 ^ 72368975471281L;
      long var24 = var3 ^ 127386987357362L;
      var10001 = var3 ^ 39542064663134L;
      int var26 = (int)((var3 ^ 39542064663134L) >>> 48);
      int var27 = (int)((var3 ^ 39542064663134L) << 16 >>> 48);
      int var28 = (int)(var10001 << 32 >>> 32);
      long var10000 = -3467647467088688753L;
      byte var29 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      var10001 = -3468444237929809454L;
      net.C_47Oh var54 = net.C_47Oh.SORT;
      boolean var265 = var54.method_43$aae029aa0a();
      if (var29 != 0) {
         return var265;
      }

      if (!var265) {
         return true;
      }

      InvManager_47QL var266 = this;
      if (var3 >= 0L) {
         if (var29 == 0) {
            long var333 = -3470007238594656051L;
            long var55 = var8;
            InvManager_47QL var57 = this;
            if (var57.method_41I$0dd78e0064(var55)) {
               return true;
            }

            var266 = this;
         }

         var266.field_43n++;
         var10001 = -3467988221172860995L;
         net.minecraft.client.Minecraft var168 = field_43;
         net.C_47gG var127 = var168.field_42P.field_429;
         java.util.HashMap var31 = new java.util.HashMap();
         java.util.ArrayList var128 = new java.util.ArrayList();
         java.util.ArrayList var129 = new java.util.ArrayList();
         java.util.ArrayList var130 = new java.util.ArrayList();
         java.util.HashMap var131 = new java.util.HashMap();
         String[] var133 = this.field_40;
         int var138 = var133.length;
         int var143 = 0;

         label922: {
            label886: {
               label923: {
                  label924: {
                     while (true) {
                        if (var143 < var138) {
                           String var148 = var133[var143];
                           var270 = var2;
                           long var419;
                           int var334 = (var419 = var3 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                           if (var29 != 0) {
                              break;
                           }

                           label878: {
                              label926: {
                                 long var420;
                                 var334 = (var420 = var3 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                                 if (var29 == 0) {
                                    if (var2) {
                                       if (!var148.equals("Sword")) {
                                          break label878;
                                       }
                                       break label926;
                                    }

                                    var270 = var148.equals("None");
                                 }

                                 if (var29 == 0) {
                                    if (var270) {
                                       break label878;
                                    }

                                    var270 = var148.equals("Sword");
                                 }

                                 if (var270) {
                                    break label878;
                                 }
                              }

                              long var358 = -3468095011294238881L;
                              String var169 = var148;
                              long var173 = var22;
                              InvManager_47QL var177 = this;
                              java.util.ArrayList var154 = var177.method_40$0939088f00(var173, var169);
                              java.util.Iterator var159 = var154.iterator();
                              if (var159.hasNext()) {
                                 int var161 = (Integer)var159.next();
                                 int var271 = var161;
                                 int var299 = var29;
                                 if (var3 <= 0L) {
                                    while (true) {
                                       if (var271 < var299) {
                                          var148 = var133[var143];
                                          var286 = var2;
                                          long var421;
                                          var334 = (var421 = var3 - 0L) == 0L ? 0 : (var421 < 0L ? -1 : 1);
                                          if (var29 != 0) {
                                             break;
                                          }

                                          label731: {
                                             label930: {
                                                long var422;
                                                var334 = (var422 = var3 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                                                if (var29 == 0) {
                                                   if (var2) {
                                                      if (!var148.equals("Sword")) {
                                                         break label731;
                                                      }
                                                      break label930;
                                                   }

                                                   var286 = var148.equals("None");
                                                }

                                                if (var29 == 0) {
                                                   if (var286) {
                                                      break label731;
                                                   }

                                                   var286 = var148.equals("Sword");
                                                }

                                                if (var286) {
                                                   break label731;
                                                }
                                             }

                                             var358 = -3468095011294238881L;
                                             var169 = var148;
                                             var173 = var22;
                                             var177 = this;
                                             var154 = var177.method_40$0939088f00(var173, var169);
                                             var159 = var154.iterator();
                                             if (var159.hasNext()) {
                                                var161 = (Integer)var159.next();
                                                var271 = var161;
                                                var299 = var29;
                                                long var423;
                                                var334 = (var423 = var3 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
                                                continue;
                                             }
                                          }

                                          var143++;
                                          if (var29 == 0) {
                                             var271 = var143;
                                             var299 = var138;
                                             continue;
                                          }
                                       }

                                       long var424;
                                       int var320 = (var424 = var3 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                                       var286 = var130.isEmpty();
                                       break;
                                    }

                                    if (var286) {
                                       return true;
                                    }

                                    long var378 = -3465797806076225657L;
                                    long var181 = var13;
                                    client.setting.ModeSetting var183 = this.settingSortSequence;
                                    String var366 = var183.method_46$5f9dc63072(var181);
                                    var378 = -3467630185722412485L;
                                    String var185 = var366;
                                    long var187 = var15;
                                    java.util.ArrayList var189 = var130;
                                    net.C_47gG var191 = var127;

                                    for (Object recovered$element$31729 : net.C_47KL.method_43$b3a9e1cc19(var191, var189, var187, var185)) {
         int var145 = (int) recovered$element$31729;
                                       net.C_47rf var151 = var127.method_46$4c10532da1(var145).method_48$ac4db64966();
                                       var151.method_48$d00df7729d(var145);
                                       int var157 = (Integer)var131.get(var145);
                                       var128.add((Runnable)recovery$indy$flow$602(this, var157, var151, var127));
                                       var129.add(var151);
                                       long var425;
                                       int var321 = (var425 = var3 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                                       if (var29 != 0) {
                                          var285 = var1;
                                          var319 = var29;
                                          break label886;
                                       }

                                       if (var29 != 0) {
                                          break;
                                       }
                                    }

                                    var285 = var128.isEmpty();
                                    var319 = var29;
                                    long var426;
                                    var334 = (var426 = var3 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                                    break label886;
                                 }

                                 label859: {
                                    label858:
                                    while (true) {
                                       label856: {
                                          label932: {
                                             long var427;
                                             var334 = (var427 = var3 - 0L) == 0L ? 0 : (var427 < 0L ? -1 : 1);
                                             if (var299 == 0) {
                                                if (var271 == -1) {
                                                   break label932;
                                                }

                                                var271 = ((int) (var31.containsKey(var148) ? 1 : 0));
                                             }

                                             int var43 = var271;
                                             java.util.ArrayList var272;
                                             if (var43 != 0) {
                                                var272 = (java.util.ArrayList)var31.get(var148);
                                             } else {
                                                long var10006 = -3466994151269945430L;
                                                int var63 = var7;
                                                int var64 = var6;
                                                String var65 = var148;
                                                net.C_47gG var66 = var127;
                                                int var67 = var5;
                                                InvManager_47QL var68 = this;
                                                var272 = var68.method_40$7ff9eced9c(var67, var66, var65, var64, var63);
                                             }

                                             java.util.ArrayList var44 = var272;
                                             if (var43 == 0) {
                                                var31.put(var148, var44);
                                             }

                                             if (!var44.isEmpty()) {
                                                net.C_42a var45 = (net.C_42a)var44.get(0);
                                                java.util.ArrayList var46 = new java.util.ArrayList();
                                                java.util.Iterator var47 = var44.iterator();

                                                while (true) {
                                                   if (!var47.hasNext()) {
                                                      long var428;
                                                      int var301 = (var428 = var3 - 0L) == 0L ? 0 : (var428 < 0L ? -1 : 1);
                                                      var274 = var46.size();
                                                      break;
                                                   }

                                                   net.C_42a var48 = (net.C_42a)var47.next();
                                                   var10001 = -3473910342095674793L;
                                                   net.C_42a var69 = var48;
                                                   double var273 = (Double)var69.method_40$0502b11602();
                                                   long var337 = -3473910342095674793L;
                                                   net.C_42a var70 = var45;
                                                   double var429;
                                                   var274 = (var429 = var273 - (Double)var70.method_40$0502b11602()) == 0.0 ? 0 : (var429 < 0.0 ? -1 : 1);
                                                   long var430;
                                                   var334 = (var430 = var3 - 0L) == 0L ? 0 : (var430 < 0L ? -1 : 1);
                                                   if (var29 != 0) {
                                                      break;
                                                   }

                                                   if (var274 >= 0) {
                                                      var46.add(var48);
                                                   }
                                                }

                                                label935: {
                                                   long var431;
                                                   var334 = (var431 = var3 - 0L) == 0L ? 0 : (var431 < 0L ? -1 : 1);
                                                   if (var29 == 0) {
                                                      if (var274 <= 1) {
                                                         break label935;
                                                      }

                                                      var274 = 0;
                                                   }

                                                   for (int var163 = var274; var163 < var46.size(); var163++) {
                                                      long var432;
                                                      int var302 = (var432 = var3 - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
                                                      net.C_42a var303 = (net.C_42a)var46.get(var163);
                                                      long var340 = -3471249860088877247L;
                                                      net.C_42a var71 = var303;
                                                      if (!var154.contains((Integer)var71.method_45$0502b11602() - 36)) {
                                                         net.C_42a var275 = (net.C_42a)var46.get(var163);
                                                         long var433;
                                                         int var304 = (var433 = var3 - 0L) == 0L ? 0 : (var433 < 0L ? -1 : 1);
                                                         var45 = var275;
                                                         break;
                                                      }
                                                   }
                                                }

                                                long var434;
                                                int var305 = (var434 = var3 - 0L) == 0L ? 0 : (var434 < 0L ? -1 : 1);
                                                label828:
                                                if (var45 != null) {
                                                   int var164 = 0;
                                                   int var165 = 0;

                                                   while (var165 < var44.size()) {
                                                      net.C_42a var49 = (net.C_42a)var44.get(var165);
                                                      long var435;
                                                      int var306 = (var435 = var3 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
                                                      if (var29 == 0) {
                                                         var10001 = -3473910342095674793L;
                                                         net.C_42a var72 = var49;
                                                         Double var276 = (Double)var72.method_40$0502b11602();
                                                         long var436;
                                                         int var308 = (var436 = var3 - 0L) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                                                         long var341 = -3473910342095674793L;
                                                         net.C_42a var73 = var45;
                                                         if (var276.equals(var73.method_40$0502b11602())) {
                                                            var10001 = -3471249860088877247L;
                                                            net.C_42a var74 = var49;
                                                            Integer var277 = (Integer)var74.method_45$0502b11602();
                                                            long var342 = -3471249860088877247L;
                                                            net.C_42a var75 = var45;
                                                            boolean var278 = var277.equals(var75.method_45$0502b11602());
                                                            long var437;
                                                            int var310 = (var437 = var3 - 0L) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                                                            if (var278) {
                                                               var164 = var165;
                                                               long var438;
                                                               int var279 = (var438 = var3 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                                                               if (var29 == 0) {
                                                                  break;
                                                               }
                                                            }
                                                         }

                                                         var165++;
                                                      }

                                                      if (var29 != 0) {
                                                         break;
                                                      }
                                                   }

                                                   var44.remove(var164);
                                                   var10001 = -3471249860088877247L;
                                                   net.C_42a var76 = var45;
                                                   Integer var280 = (Integer)var76.method_45$0502b11602();
                                                   long var439;
                                                   int var312 = (var439 = var3 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                                                   var165 = var280;
                                                   var10001 = -3473910342095674793L;
                                                   net.C_42a var77 = var45;
                                                   double var167 = (Double)var77.method_40$0502b11602();
                                                   int var281 = var165;
                                                   long var440;
                                                   var334 = (var440 = var3 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                                                   if (var29 == 0) {
                                                      if (var165 == var161 + 36) {
                                                         break label828;
                                                      }

                                                      var281 = ((int) (var154.contains(var165 + 36) ? 1 : 0));
                                                   }

                                                   label809:
                                                   if (var281 == 0) {
                                                      net.C_47rf var51 = var127.method_46$4c10532da1(var161 + 36).method_48$ac4db64966();
                                                      int var344 = (short)var11;
                                                      short var359 = (short)var12;
                                                      long var374 = -3468888287848956497L;
                                                      short var78 = var359;
                                                      short var79 = (short)var344;
                                                      int var80 = var10;
                                                      net.C_47rf var81 = var51;
                                                      double var52 = net.C_47KL.method_47$8e790792c0(var81, var80, var79, var78);
                                                      if (var167 <= var52) {
                                                         char var282 = (char)var26;
                                                         short var360 = (short)var27;
                                                         long var385 = -3469683071858901379L;
                                                         int var82 = var28;
                                                         short var83 = var360;
                                                         boolean var84 = var2;
                                                         net.C_47rf var85 = var51;
                                                         char var86 = var282;
                                                         int var283 = net.C_47KL.method_44$060c84f419(var86, var85, var84, var83, var82);
                                                         long var441;
                                                         int var314 = (var441 = var3 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                                                         net.C_47rf var315 = var127.method_46$4c10532da1(var165).method_48$ac4db64966();
                                                         char var361 = (char)var26;
                                                         short var375 = (short)var27;
                                                         long var389 = -3469683071858901379L;
                                                         int var87 = var28;
                                                         short var88 = var375;
                                                         boolean var89 = var2;
                                                         net.C_47rf var90 = var315;
                                                         char var91 = var361;
                                                         if (var283 == net.C_47KL.method_44$060c84f419(var91, var90, var89, var88, var87)) {
                                                            break label809;
                                                         }
                                                      }

                                                      var130.add(var165);
                                                      var131.put(var165, var161);
                                                      long var442;
                                                      int var316 = (var442 = var3 - 0L) == 0L ? 0 : (var442 < 0L ? -1 : 1);
                                                      if (var29 != 0) {
                                                         while (true) {
                                                            if (var29 != 0 || ++var143 >= var138) {
                                                               break label858;
                                                            }

                                                            var148 = var133[var143];
                                                            var284 = var2;
                                                            long var443;
                                                            var344 = (var443 = var3 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                                                            if (var29 != 0) {
                                                               break label859;
                                                            }

                                                            label940: {
                                                               long var444;
                                                               var344 = (var444 = var3 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                                                               if (var29 == 0) {
                                                                  if (var2) {
                                                                     if (!var148.equals("Sword")) {
                                                                        continue;
                                                                     }
                                                                     break label940;
                                                                  }

                                                                  var284 = var148.equals("None");
                                                               }

                                                               if (var29 == 0) {
                                                                  if (var284) {
                                                                     continue;
                                                                  }

                                                                  var284 = var148.equals("Sword");
                                                               }

                                                               if (var284) {
                                                                  continue;
                                                               }
                                                            }

                                                            var358 = -3468095011294238881L;
                                                            var169 = var148;
                                                            var173 = var22;
                                                            var177 = this;
                                                            var154 = var177.method_40$0939088f00(var173, var169);
                                                            var159 = var154.iterator();
                                                            if (var159.hasNext()) {
                                                               break label856;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          while (!var159.hasNext()) {
                                             while (true) {
                                                if (var29 != 0 || ++var143 >= var138) {
                                                   break label858;
                                                }

                                                var148 = var133[var143];
                                                var284 = var2;
                                                long var445;
                                                var334 = (var445 = var3 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                                if (var29 != 0) {
                                                   break label859;
                                                }

                                                long var446;
                                                var334 = (var446 = var3 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                                if (var29 == 0) {
                                                   if (var2) {
                                                      if (var148.equals("Sword")) {
                                                         break;
                                                      }
                                                      continue;
                                                   }

                                                   var284 = var148.equals("None");
                                                }

                                                if (var29 == 0) {
                                                   if (var284) {
                                                      continue;
                                                   }

                                                   var284 = var148.equals("Sword");
                                                }

                                                if (!var284) {
                                                   break;
                                                }
                                             }

                                             var358 = -3468095011294238881L;
                                             var169 = var148;
                                             var173 = var22;
                                             var177 = this;
                                             var154 = var177.method_40$0939088f00(var173, var169);
                                             var159 = var154.iterator();
                                          }
                                       }

                                       var161 = (Integer)var159.next();
                                       var271 = var161;
                                       var299 = var29;
                                       long var447;
                                       var334 = (var447 = var3 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                    }

                                    long var448;
                                    int var317 = (var448 = var3 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                    var284 = var130.isEmpty();
                                 }

                                 if (var284) {
                                    return true;
                                 }

                                 long var376 = -3465797806076225657L;
                                 long var92 = var13;
                                 client.setting.ModeSetting var94 = this.settingSortSequence;
                                 String var364 = var94.method_46$5f9dc63072(var92);
                                 var376 = -3467630185722412485L;
                                 String var95 = var364;
                                 long var96 = var15;
                                 java.util.ArrayList var98 = var130;
                                 net.C_47gG var99 = var127;

                                 for (Object recovered$element$56341 : net.C_47KL.method_43$b3a9e1cc19(var99, var98, var96, var95)) {
         int var144 = (int) recovered$element$56341;
                                    net.C_47rf var149 = var127.method_46$4c10532da1(var144).method_48$ac4db64966();
                                    var149.method_48$d00df7729d(var144);
                                    int var155 = (Integer)var131.get(var144);
                                    var128.add((Runnable)recovery$indy$flow$602(this, var155, var149, var127));
                                    var129.add(var149);
                                    long var449;
                                    int var318 = (var449 = var3 - 0L) == 0L ? 0 : (var449 < 0L ? -1 : 1);
                                    if (var29 != 0) {
                                       break label923;
                                    }

                                    if (var29 != 0) {
                                       break;
                                    }
                                 }

                                 var285 = var128.isEmpty();
                                 var319 = var29;
                                 long var450;
                                 var334 = (var450 = var3 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                                 break label924;
                              }
                           }

                           var143++;
                           if (var29 == 0) {
                              continue;
                           }
                        }

                        long var451;
                        int var322 = (var451 = var3 - 0L) == 0L ? 0 : (var451 < 0L ? -1 : 1);
                        var270 = var130.isEmpty();
                        break;
                     }

                     if (var270) {
                        return true;
                     }

                     long var380 = -3465797806076225657L;
                     long var182 = var13;
                     client.setting.ModeSetting var184 = this.settingSortSequence;
                     String var367 = var184.method_46$5f9dc63072(var182);
                     var380 = -3467630185722412485L;
                     String var186 = var367;
                     long var188 = var15;
                     java.util.ArrayList var190 = var130;
                     net.C_47gG var192 = var127;

                     for (Object recovered$element$58787 : net.C_47KL.method_43$b3a9e1cc19(var192, var190, var188, var186)) {
         int var146 = (int) recovered$element$58787;
                        net.C_47rf var152 = var127.method_46$4c10532da1(var146).method_48$ac4db64966();
                        var152.method_48$d00df7729d(var146);
                        int var158 = (Integer)var131.get(var146);
                        var128.add((Runnable)recovery$indy$flow$602(this, var158, var152, var127));
                        var129.add(var152);
                        long var452;
                        int var323 = (var452 = var3 - 0L) == 0L ? 0 : (var452 < 0L ? -1 : 1);
                        if (var29 != 0) {
                           boolean var287 = var1;
                           if (var29 == 0) {
                              if (var1) {
                                 char var324 = (char)var17;
                                 short var369 = (short)var19;
                                 var380 = -3467247770138300917L;
                                 short var193 = var369;
                                 int var196 = var18;
                                 char var199 = var324;
                                 InvManager_47QL var202 = this;
                                 var202.method_44$674b75e8e1(var199, var196, var193);
                                 var10001 = -3465634284691732841L;
                                 client.setting.BooleanSetting var205 = this.settingSortInstant;
                                 return var205.method_49$aae029aa0a();
                              }

                              net.C_474k var368 = this.field_44N;
                              client.setting.RangeSetting var386 = this.settingSortFailRate;
                              client.setting.RangeSetting var390 = this.settingSortMouseMoveRandom;
                              long var397 = -3465634284691732841L;
                              client.setting.BooleanSetting var208 = this.settingSortInstant;
                              boolean var393 = var208.method_49$aae029aa0a();
                              long var404 = -3466007216174507496L;
                              client.setting.RangeSetting var211 = this.settingSortCPS;
                              int var398 = var211.method_44$8abf5c6871();
                              int var405 = this.field_43n;
                              long var416 = -3469118300215439771L;
                              long var214 = var20;
                              boolean var217 = true;
                              client.setting.NumberSetting var220 = this.settingSortMaxMouseMoveSpeed;
                              int var410 = (int)var220.method_43$a8c520d5d1(var217, var214);
                              long var413 = -3471004577529006416L;
                              int var223 = var410;
                              int var226 = var405;
                              int var229 = var398;
                              boolean var232 = var393;
                              net.C_47gG var235 = var127;
                              client.setting.RangeSetting var238 = var390;
                              Object var241 = null;
                              long var244 = var24;
                              client.setting.RangeSetting var247 = var386;
                              Object var250 = null;
                              net.C_474k var253 = var368;
                              java.util.ArrayList var256 = var129;
                              java.util.ArrayList var259 = var128;
                              InvManager_47QL var262 = this;
                              var287 = var262.method_46$b271fd46b4(
                                 var259,
                                 var256,
                                 var253,
                                 (client.setting.RangeSetting)var250,
                                 var247,
                                 var244,
                                 (client.setting.RangeSetting)var241,
                                 var238,
                                 var235,
                                 var232,
                                 var229,
                                 var226,
                                 var223
                              );
                           }

                           return var287;
                        }

                        if (var29 != 0) {
                           break;
                        }
                     }

                     var285 = var128.isEmpty();
                     var319 = var29;
                     if (var3 <= 0L) {
                        break label886;
                     }
                  }

                  long var453;
                  int var355 = (var453 = var3 - 0L) == 0L ? 0 : (var453 < 0L ? -1 : 1);
                  if (var319 != 0) {
                     break label922;
                  }

                  if (var285) {
                     return true;
                  }
               }

               var285 = var1;
               break label922;
            }

            if (var319 == 0) {
               if (var285) {
                  char var328 = (char)var17;
                  short var373 = (short)var19;
                  long var384 = -3467247770138300917L;
                  short var195 = var373;
                  int var198 = var18;
                  char var201 = var328;
                  InvManager_47QL var204 = this;
                  var204.method_44$674b75e8e1(var201, var198, var195);
                  var10001 = -3465634284691732841L;
                  client.setting.BooleanSetting var207 = this.settingSortInstant;
                  return var207.method_49$aae029aa0a();
               }

               net.C_474k var372 = this.field_44N;
               client.setting.RangeSetting var388 = this.settingSortFailRate;
               client.setting.RangeSetting var392 = this.settingSortMouseMoveRandom;
               long var401 = -3465634284691732841L;
               client.setting.BooleanSetting var210 = this.settingSortInstant;
               boolean var395 = var210.method_49$aae029aa0a();
               long var408 = -3466007216174507496L;
               client.setting.RangeSetting var213 = this.settingSortCPS;
               int var402 = var213.method_44$8abf5c6871();
               int var409 = this.field_43n;
               long var418 = -3469118300215439771L;
               long var216 = var20;
               boolean var219 = true;
               client.setting.NumberSetting var222 = this.settingSortMaxMouseMoveSpeed;
               int var412 = (int)var222.method_43$a8c520d5d1(var219, var216);
               long var415 = -3471004577529006416L;
               int var225 = var412;
               int var228 = var409;
               int var231 = var402;
               boolean var234 = var395;
               net.C_47gG var237 = var127;
               client.setting.RangeSetting var240 = var392;
               Object var243 = null;
               long var246 = var24;
               client.setting.RangeSetting var249 = var388;
               Object var252 = null;
               net.C_474k var255 = var372;
               java.util.ArrayList var258 = var129;
               java.util.ArrayList var261 = var128;
               InvManager_47QL var264 = this;
               var285 = var264.method_46$b271fd46b4(
                  var261, var258, var255, (client.setting.RangeSetting)var252, var249, var246, (client.setting.RangeSetting)var243, var240, var237, var234, var231, var228, var225
               );
            }

            return var285;
         }

         if (var29 == 0) {
            if (var285) {
               char var326 = (char)var17;
               short var371 = (short)var19;
               long var383 = -3467247770138300917L;
               short var194 = var371;
               int var197 = var18;
               char var200 = var326;
               InvManager_47QL var203 = this;
               var203.method_44$674b75e8e1(var200, var197, var194);
               var10001 = -3465634284691732841L;
               client.setting.BooleanSetting var206 = this.settingSortInstant;
               return var206.method_49$aae029aa0a();
            }

            net.C_474k var370 = this.field_44N;
            client.setting.RangeSetting var387 = this.settingSortFailRate;
            client.setting.RangeSetting var391 = this.settingSortMouseMoveRandom;
            long var399 = -3465634284691732841L;
            client.setting.BooleanSetting var209 = this.settingSortInstant;
            boolean var394 = var209.method_49$aae029aa0a();
            long var406 = -3466007216174507496L;
            client.setting.RangeSetting var212 = this.settingSortCPS;
            int var400 = var212.method_44$8abf5c6871();
            int var407 = this.field_43n;
            long var417 = -3469118300215439771L;
            long var215 = var20;
            boolean var218 = true;
            client.setting.NumberSetting var221 = this.settingSortMaxMouseMoveSpeed;
            int var411 = (int)var221.method_43$a8c520d5d1(var218, var215);
            long var414 = -3471004577529006416L;
            int var224 = var411;
            int var227 = var407;
            int var230 = var400;
            boolean var233 = var394;
            net.C_47gG var236 = var127;
            client.setting.RangeSetting var239 = var391;
            Object var242 = null;
            long var245 = var24;
            client.setting.RangeSetting var248 = var387;
            Object var251 = null;
            net.C_474k var254 = var370;
            java.util.ArrayList var257 = var129;
            java.util.ArrayList var260 = var128;
            InvManager_47QL var263 = this;
            var285 = var263.method_46$b271fd46b4(
               var260, var257, var254, (client.setting.RangeSetting)var251, var248, var245, (client.setting.RangeSetting)var242, var239, var236, var233, var230, var227, var224
            );
         }

         return var285;
      } else {
         this.field_43n = var29;
         var10001 = -3467988221172860995L;
         net.minecraft.client.Minecraft var58 = field_43;
         net.C_47gG var30 = var58.field_42P.field_429;
         new java.util.HashMap();
         java.util.ArrayList var32 = new java.util.ArrayList();
         java.util.ArrayList var33 = new java.util.ArrayList();
         java.util.ArrayList var34 = new java.util.ArrayList();
         java.util.HashMap var35 = new java.util.HashMap();
         String[] var36 = this.field_40;
         int var37 = var36.length;
         int var38 = 0;

         label917:
         while (true) {
            int var267 = var38;
            int var293 = var37;

            while (true) {
               if (var267 >= var293) {
                  break label917;
               }

               label912: {
                  String var39 = var36[var38];
                  boolean var268 = var2;
                  long var454;
                  int var10002 = (var454 = var3 - 0L) == 0L ? 0 : (var454 < 0L ? -1 : 1);
                  long var455;
                  var10002 = (var455 = var3 - 0L) == 0L ? 0 : (var455 < 0L ? -1 : 1);
                  if (var29 == 0) {
                     if (var2) {
                        break label912;
                     }

                     var268 = var39.equals("Sword");
                  }

                  if (!var268) {
                     long var10003 = -3468095011294238881L;
                     String var59 = var39;
                     long var60 = var22;
                     InvManager_47QL var62 = this;
                     java.util.ArrayList var40 = var62.method_40$0939088f00(var60, var59);
                     java.util.Iterator var41 = var40.iterator();
                     if (var41.hasNext()) {
                        int var42 = (Integer)var41.next();
                        var267 = var42;
                        var293 = var29;
                        long var456;
                        var10002 = (var456 = var3 - 0L) == 0L ? 0 : (var456 < 0L ? -1 : 1);
                        continue;
                     }
                  }
               }

               var38++;
               if (var29 != 0) {
                  break label917;
               }
               break;
            }
         }

         long var457;
         int var294 = (var457 = var3 - 0L) == 0L ? 0 : (var457 < 0L ? -1 : 1);

         for (Object recovered$element$71542 : var34) {
         int var142 = (int) recovered$element$71542;
            net.C_47rf var147 = var30.method_46$4c10532da1(var142).method_48$ac4db64966();
            var147.method_48$d00df7729d(var142);
            int var153 = (Integer)var35.get(var142);
            var32.add((Runnable)recovery$indy$flow$602(this, var153, var147, var30));
            var33.add(var147);
            long var458;
            int var295 = (var458 = var3 - 0L) == 0L ? 0 : (var458 < 0L ? -1 : 1);
            if (var29 != 0) {
               break;
            }
         }

         boolean var269 = var32.isEmpty();
         long var459;
         int var332 = (var459 = var3 - 0L) == 0L ? 0 : (var459 < 0L ? -1 : 1);
         if (var29 == 0) {
            if (var269) {
               char var296 = (char)var17;
               short var357 = (short)var19;
               long var10004 = -3467247770138300917L;
               short var100 = var357;
               int var101 = var18;
               char var102 = var296;
               InvManager_47QL var103 = this;
               var103.method_44$674b75e8e1(var102, var101, var100);
               var10001 = -3465634284691732841L;
               client.setting.BooleanSetting var104 = this.settingSortInstant;
               return var104.method_49$aae029aa0a();
            }

            net.C_474k var356 = this.field_44N;
            client.setting.RangeSetting var10005 = this.settingSortFailRate;
            client.setting.RangeSetting var10008 = this.settingSortMouseMoveRandom;
            long var10011 = -3465634284691732841L;
            client.setting.BooleanSetting var105 = this.settingSortInstant;
            boolean var10010 = var105.method_49$aae029aa0a();
            long var10012 = -3466007216174507496L;
            client.setting.RangeSetting var106 = this.settingSortCPS;
            int var396 = var106.method_44$8abf5c6871();
            int var403 = this.field_43n;
            long var10016 = -3469118300215439771L;
            long var107 = var20;
            boolean var109 = true;
            client.setting.NumberSetting var110 = this.settingSortMaxMouseMoveSpeed;
            int var10013 = (int)var110.method_43$a8c520d5d1(var109, var107);
            long var10014 = -3471004577529006416L;
            int var111 = var10013;
            int var112 = var403;
            int var113 = var396;
            boolean var114 = var10010;
            net.C_47gG var115 = var30;
            client.setting.RangeSetting var116 = var10008;
            Object var117 = null;
            long var118 = var24;
            client.setting.RangeSetting var120 = var10005;
            Object var121 = null;
            net.C_474k var122 = var356;
            java.util.ArrayList var123 = var33;
            java.util.ArrayList var124 = var32;
            InvManager_47QL var125 = this;
            var269 = var125.method_46$b271fd46b4(
               var124, var123, var122, (client.setting.RangeSetting)var121, var120, var118, (client.setting.RangeSetting)var117, var116, var115, var114, var113, var112, var111
            );
         }

         return var269;
      }
   }











   private int[] method_44$f5201c628e(long var1, net.C_47gG var3) {
      var1 = a ^ var1;
      int[] var5 = new int[5];
      byte var10000 = ((byte) (recovery$indy$70(7775481149237751175L, var1) ? 1 : 0));
      int var6 = -1;
      byte var4 = var10000;

      label495:
      while (true) {
         int var60 = var3.field_46.size();
         int var58 = var6;
         if (var58 < var60) {
            byte var254 = -1;
            var58 = var6;
            if (var58 == var254) {
               net.C_47rf var154 = recovery$indy$71(field_43, 7770755542719009717L, var1).field_42X.method_41$ac4db64966();

               while (true) {
                  int var121;
                  label383: {
                     label500: {
                        net.C_47rf var63 = var154;
                        int var227 = var4;
                        var154 = var63;
                        if (var227 == 0) {
                           var154 = var154;
                           net.C_47rf var228 = var154;
                           if (var228 == null) {
                              long var260;
                              var227 = (var260 = var1 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                              var121 = var6;
                              if (var227 <= 0) {
                                 break label383;
                              }

                              var121 = var121;
                              var121 = var121;
                              var254 = 8;
                              var227 = var121;
                              if (var227 <= var254) {
                                 break label500;
                              }

                              var5[0]++;
                              long var261;
                              var227 = (var261 = var1 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                              var121 = var4;
                              if (var227 < 0) {
                                 break label383;
                              }

                              var121 = var121;
                              var121 = var121;
                              var227 = var121;
                              if (var227 == 0) {
                                 break label500;
                              }
                           }

                           var154 = var63;
                        }

                        net.C_43r var65 = var154.method_48$dbd570a038();
                        var10000 = ((byte) (var65.equals(net.C_42R.field_45) ? 1 : 0));
                        long var262;
                        var227 = (var262 = var1 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                        byte var168 = var4;
                        int var126 = var10000;
                        if (var227 >= 0) {
                           var168 = var168;
                           var126 = (byte)var126;
                           int var234 = var168;
                           var126 = var126;
                           if (var234 == 0) {
                              var126 = var126;
                              var126 = var126;
                              var234 = var126;
                              if (var234 != 0) {
                                 var5[1] += var63.field_47;
                                 long var263;
                                 var234 = (var263 = var1 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var234 <= 0) {
                                    break label383;
                                 }

                                 var126 = var121;
                                 var126 = var126;
                                 var234 = var126;
                                 if (var234 == 0) {
                                    break label500;
                                 }
                              }

                              var126 = ((int) (var65.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                           }

                           var168 = var4;
                           var126 = var126;
                        }

                        long var264;
                        var227 = (var264 = var1 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                        var168 = var168;
                        int var133 = var126;
                        if (var227 >= 0) {
                           var168 = var168;
                           var133 = (byte)var133;
                           int var239 = var168;
                           var133 = var133;
                           if (var239 == 0) {
                              var133 = var133;
                              var133 = var133;
                              var239 = var133;
                              if (var239 != 0) {
                                 var5[2] += var63.field_47;
                                 long var265;
                                 var239 = (var265 = var1 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var239 < 0) {
                                    break label383;
                                 }

                                 var133 = var121;
                                 var133 = var133;
                                 var239 = var133;
                                 if (var239 == 0) {
                                    break label500;
                                 }
                              }

                              var133 = ((int) (var65.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                           }

                           var168 = var4;
                           var133 = var133;
                        }

                        long var266;
                        var227 = (var266 = var1 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                        var168 = var168;
                        int var140 = var133;
                        if (var227 >= 0) {
                           var168 = var168;
                           var140 = (byte)var140;
                           int var244 = var168;
                           var140 = var140;
                           if (var244 == 0) {
                              var140 = var140;
                              var140 = var140;
                              var244 = var140;
                              if (var244 != 0) {
                                 var5[3] += var63.field_47;
                                 long var267;
                                 var244 = (var267 = var1 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var244 <= 0) {
                                    break label383;
                                 }

                                 var140 = var121;
                                 var140 = var140;
                                 var244 = var140;
                                 if (var244 == 0) {
                                    break label500;
                                 }
                              }

                              var140 = ((int) (var65.equals(net.C_42R.field_41u) ? 1 : 0));
                           }

                           var168 = var4;
                           var140 = var140;
                        }

                        int var248 = var168;
                        var140 = var140;
                        if (var248 == 0) {
                           var140 = var140;
                           var248 = var140;
                           if (var248 == 0) {
                              break label500;
                           }

                           var140 = var6;
                        }

                        var248 = var140;
                        if (var248 != 0) {
                           var5[4]++;
                        }
                     }

                     var6++;
                     var121 = var4;
                  }

                  var58 = var121;
                  if (var58 == 0) {
                     break;
                  }

                  long var268;
                  var58 = (var268 = var1 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                  if (var58 > 0) {
                     return var5;
                  }

                  var154 = var3.method_46$4c10532da1(var6).method_48$ac4db64966();
               }
            } else {
               do {
                  int var93;
                  label436: {
                     label503: {
                        net.C_47rf var151 = var3.method_46$4c10532da1(var6).method_48$ac4db64966();
                        net.C_47rf var62 = var151;
                        int var201 = var4;
                        var151 = var62;
                        if (var201 == 0) {
                           var151 = var151;
                           net.C_47rf var202 = var151;
                           if (var202 == null) {
                              long var269;
                              var201 = (var269 = var1 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                              var93 = var6;
                              if (var201 <= 0) {
                                 break label436;
                              }

                              var93 = var93;
                              var93 = var93;
                              var254 = 8;
                              var201 = var93;
                              if (var201 <= var254) {
                                 break label503;
                              }

                              var5[0]++;
                              long var270;
                              var201 = (var270 = var1 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                              var93 = var4;
                              if (var201 < 0) {
                                 break label436;
                              }

                              var93 = var93;
                              var93 = var93;
                              var201 = var93;
                              if (var201 == 0) {
                                 break label503;
                              }
                           }

                           var151 = var62;
                        }

                        net.C_43r var64 = var151.method_48$dbd570a038();
                        var10000 = ((byte) (var64.equals(net.C_42R.field_45) ? 1 : 0));
                        long var271;
                        var201 = (var271 = var1 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                        byte var162 = var4;
                        int var98 = var10000;
                        if (var201 >= 0) {
                           var162 = var162;
                           var98 = (byte)var98;
                           int var208 = var162;
                           var98 = var98;
                           if (var208 == 0) {
                              var98 = var98;
                              var98 = var98;
                              var208 = var98;
                              if (var208 != 0) {
                                 var5[1] += var62.field_47;
                                 long var272;
                                 var208 = (var272 = var1 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var208 <= 0) {
                                    break label436;
                                 }

                                 var98 = var93;
                                 var98 = var98;
                                 var208 = var98;
                                 if (var208 == 0) {
                                    break label503;
                                 }
                              }

                              var98 = ((int) (var64.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                           }

                           var162 = var4;
                           var98 = var98;
                        }

                        long var273;
                        var201 = (var273 = var1 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                        var162 = var162;
                        int var105 = var98;
                        if (var201 >= 0) {
                           var162 = var162;
                           var105 = (byte)var105;
                           int var213 = var162;
                           var105 = var105;
                           if (var213 == 0) {
                              var105 = var105;
                              var105 = var105;
                              var213 = var105;
                              if (var213 != 0) {
                                 var5[2] += var62.field_47;
                                 long var274;
                                 var213 = (var274 = var1 - 0L) == 0L ? 0 : (var274 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var213 < 0) {
                                    break label436;
                                 }

                                 var105 = var93;
                                 var105 = var105;
                                 var213 = var105;
                                 if (var213 == 0) {
                                    break label503;
                                 }
                              }

                              var105 = ((int) (var64.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                           }

                           var162 = var4;
                           var105 = var105;
                        }

                        long var275;
                        var201 = (var275 = var1 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                        var162 = var162;
                        int var112 = var105;
                        if (var201 >= 0) {
                           var162 = var162;
                           var112 = (byte)var112;
                           int var218 = var162;
                           var112 = var112;
                           if (var218 == 0) {
                              var112 = var112;
                              var112 = var112;
                              var218 = var112;
                              if (var218 != 0) {
                                 var5[3] += var62.field_47;
                                 long var276;
                                 var218 = (var276 = var1 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var218 <= 0) {
                                    break label436;
                                 }

                                 var112 = var93;
                                 var112 = var112;
                                 var218 = var112;
                                 if (var218 == 0) {
                                    break label503;
                                 }
                              }

                              var112 = ((int) (var64.equals(net.C_42R.field_41u) ? 1 : 0));
                           }

                           var162 = var4;
                           var112 = var112;
                        }

                        int var222 = var162;
                        var112 = var112;
                        if (var222 == 0) {
                           var112 = var112;
                           var222 = var112;
                           if (var222 == 0) {
                              break label503;
                           }

                           var112 = var6;
                        }

                        var222 = var112;
                        if (var222 != 0) {
                           var5[4]++;
                        }
                     }

                     var6++;
                     var93 = var4;
                  }

                  var58 = var93;
                  if (var58 == 0) {
                     continue label495;
                  }

                  long var277;
                  var58 = (var277 = var1 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
               } while (var58 <= 0);

               return var5;
            }
         } else {
            while (true) {
               long var278;
               var58 = (var278 = var1 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
               if (var58 > 0) {
                  return var5;
               }

               int var9;
               label490: {
                  label506: {
                     net.C_47rf var15 = var3.method_46$4c10532da1(var6).method_48$ac4db64966();
                     net.C_47rf var7 = var15;
                     int var175 = var4;
                     var15 = var7;
                     if (var175 == 0) {
                        var15 = var15;
                        net.C_47rf var176 = var15;
                        if (var176 == null) {
                           long var279;
                           var175 = (var279 = var1 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                           var9 = var6;
                           if (var175 <= 0) {
                              break label490;
                           }

                           var9 = var9;
                           var9 = var9;
                           byte var253 = 8;
                           var175 = var9;
                           if (var175 <= var253) {
                              break label506;
                           }

                           var5[0]++;
                           long var280;
                           var175 = (var280 = var1 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                           var9 = var4;
                           if (var175 < 0) {
                              break label490;
                           }

                           var9 = var9;
                           var9 = var9;
                           var175 = var9;
                           if (var175 == 0) {
                              break label506;
                           }
                        }

                        var15 = var7;
                     }

                     net.C_43r var8 = var15.method_48$dbd570a038();
                     var10000 = ((byte) (var8.equals(net.C_42R.field_45) ? 1 : 0));
                     long var281;
                     var175 = (var281 = var1 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                     byte var16 = var4;
                     int var70 = var10000;
                     if (var175 >= 0) {
                        var16 = var16;
                        var70 = (byte)var70;
                        int var182 = var16;
                        var70 = var70;
                        if (var182 == 0) {
                           var70 = var70;
                           var70 = var70;
                           var182 = var70;
                           if (var182 != 0) {
                              var5[1] += var7.field_47;
                              long var282;
                              var182 = (var282 = var1 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var182 <= 0) {
                                 break label490;
                              }

                              var70 = var9;
                              var70 = var70;
                              var182 = var70;
                              if (var182 == 0) {
                                 break label506;
                              }
                           }

                           var70 = ((int) (var8.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                        }

                        var16 = var4;
                        var70 = var70;
                     }

                     long var283;
                     var175 = (var283 = var1 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                     var16 = var16;
                     int var77 = var70;
                     if (var175 >= 0) {
                        var16 = var16;
                        var77 = (byte)var77;
                        int var187 = var16;
                        var77 = var77;
                        if (var187 == 0) {
                           var77 = var77;
                           var77 = var77;
                           var187 = var77;
                           if (var187 != 0) {
                              var5[2] += var7.field_47;
                              long var284;
                              var187 = (var284 = var1 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var187 < 0) {
                                 break label490;
                              }

                              var77 = var9;
                              var77 = var77;
                              var187 = var77;
                              if (var187 == 0) {
                                 break label506;
                              }
                           }

                           var77 = ((int) (var8.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                        }

                        var16 = var4;
                        var77 = var77;
                     }

                     long var285;
                     var175 = (var285 = var1 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                     var16 = var16;
                     int var84 = var77;
                     if (var175 >= 0) {
                        var16 = var16;
                        var84 = (byte)var84;
                        int var192 = var16;
                        var84 = var84;
                        if (var192 == 0) {
                           var84 = var84;
                           var84 = var84;
                           var192 = var84;
                           if (var192 != 0) {
                              var5[3] += var7.field_47;
                              long var286;
                              var192 = (var286 = var1 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var192 <= 0) {
                                 break label490;
                              }

                              var84 = var9;
                              var84 = var84;
                              var192 = var84;
                              if (var192 == 0) {
                                 break label506;
                              }
                           }

                           var84 = ((int) (var8.equals(net.C_42R.field_41u) ? 1 : 0));
                        }

                        var16 = var4;
                        var84 = var84;
                     }

                     int var196 = var16;
                     var84 = var84;
                     if (var196 == 0) {
                        var84 = var84;
                        var196 = var84;
                        if (var196 == 0) {
                           break label506;
                        }

                        var84 = var6;
                     }

                     var196 = var84;
                     if (var196 != 0) {
                        var5[4]++;
                     }
                  }

                  var6++;
                  var9 = var4;
               }

               var58 = var9;
               if (var58 == 0) {
                  break;
               }
            }
         }
      }
   }




   private boolean method_44$89b62fc635(boolean var1, long var2, short var4) {
        net.C_47rf var347;
        int var352;
        net.C_47rf var354;
        int var359;
        net.C_47rf var360;
        int var377;
        int var382;
        int var384;
        int var388;
        int var389;
        int var391;
        int var392;
        int var394;
        int var397;
        int var399;
        int var400;
        int var402;
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 55003757419950L;
      long var9 = var5 ^ 106302081912419L;
      long var11 = var5 ^ 8684723024030L;
      long var10001 = var5 ^ 92776057158707L;
      int var13 = (int)((var5 ^ 92776057158707L) >>> 48);
      int var14 = (int)((var5 ^ 92776057158707L) << 16 >>> 32);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var5 ^ 135321045733741L;
      long var18 = (var5 ^ 57879028687049L) >>> 16;
      int var20 = (int)((var5 ^ 57879028687049L) << 48 >>> 48);
      long var21 = var5 ^ 21053145325794L;
      byte var26 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      net.C_47Oh var40 = net.C_47Oh.PUT_ON_ARMOR;
      int var10000 = ((int) (var40.method_43$aae029aa0a() ? 1 : 0));
      if (var26 != 0) {
         return (((var10000) & 1) != 0);
      }

      if (!(var10000 != 0)) {
         return true;
      }

      InvManager_47QL var339 = this;
      if (var2 >= 0L) {
         if (var26 == 0) {
            long var41 = var7;
            InvManager_47QL var43 = this;
            if (var43.method_41I$0dd78e0064(var41)) {
               return true;
            }

            var339 = this;
         }

         net.C_47gG var100;
         java.util.ArrayList var103;
         java.util.ArrayList var104;
         label2556: {
            label2557: {
               label2483: {
                  label2482: {
                     label2481: {
                        label2480: {
                           label2479: {
                              label2478: {
                                 label2477: {
                                    int var119;
                                    label2558: {
                                       label2559: {
                                          label2560: {
                                             label2561: {
                                                label2472: {
                                                   label2471: {
                                                      label2562: {
                                                         label2469: {
                                                            int var107;
                                                            label2563: {
                                                               java.util.ArrayList var101;
                                                               byte var102;
                                                               label2467: {
                                                                  label2466: {
                                                                     label2465: {
                                                                        label2564: {
                                                                           label2463: {
                                                                              label2462: {
                                                                                 label2565: {
                                                                                    label2566: {
                                                                                       label2459: {
                                                                                          label2567: {
                                                                                             label2568: {
                                                                                                label2456: {
                                                                                                   label2455: {
                                                                                                      label2454: {
                                                                                                         label2569: {
                                                                                                            var339.field_42++;
                                                                                                            net.minecraft.client.Minecraft var236 = field_43;
                                                                                                            var100 = var236.field_42P.field_429;
                                                                                                            client.setting.BooleanSetting var237 = this.settingOnlyInHotbar;
                                                                                                            int var406 = var237.method_49$aae029aa0a() ? 36 : 9;
                                                                                                            client.setting.BooleanSetting var238 = this.settingIgnoreDurability;
                                                                                                            boolean var97 = var238.method_49$aae029aa0a();
                                                                                                            int var98 = var406;
                                                                                                            net.C_47gG var99 = var100;
                                                                                                            short var411 = (short)var20;
                                                                                                            boolean var239 = var97;
                                                                                                            short var240 = var411;
                                                                                                            int var241 = var98;
                                                                                                            net.C_47gG var242 = var99;
                                                                                                            long var243 = var18;
                                                                                                            java.util.ArrayList var386 = net.C_47KL.method_48$83c66253fc(
                                                                                                               var243, var242, var241, var240, var239
                                                                                                            );
                                                                                                            long var244 = var9;
                                                                                                            client.setting.ModeSetting var245 = this.settingArmorSequence;
                                                                                                            String var246 = var245.method_46$5f9dc63072(var244);
                                                                                                            long var247 = var11;
                                                                                                            java.util.ArrayList var248 = var386;
                                                                                                            net.C_47gG var249 = var100;
                                                                                                            var101 = net.C_47KL.method_43$b3a9e1cc19(
                                                                                                               var249, var248, var247, var246
                                                                                                            );
                                                                                                            long var250 = var9;
                                                                                                            client.setting.ModeSetting var251 = this.settingArmorSequence;
                                                                                                            var102 = ((byte) (var251.method_46$5f9dc63072(var250)
                                                                                                               .equals(
                                                                                                                  (String)recovery$indy$flow$687(
                                                                                                                     29007, 8359569582349172005L ^ var5
                                                                                                                  )
                                                                                                               ) ? 1 : 0));
                                                                                                            var103 = new java.util.ArrayList();
                                                                                                            var104 = new java.util.ArrayList();
                                                                                                            InvManager_47QL var343 = this;
                                                                                                            if (var26 == 0) {
                                                                                                               client.setting.BooleanSetting var64 = this.settingNoArmorDrop;
                                                                                                               if (var64.method_49$aae029aa0a()) {
                                                                                                                  java.util.Iterator var106 = var101.iterator();

                                                                                                                  while (true) {
                                                                                                                     if (!var106.hasNext()) {
                                                                                                                        var10000 = 0;
                                                                                                                        break;
                                                                                                                     }

                                                                                                                     var119 = (Integer)var106.next();
                                                                                                                     var10000 = var119;
                                                                                                                     if (var26 != 0) {
                                                                                                                        break;
                                                                                                                     }

                                                                                                                     if (var119 >= 9) {
                                                                                                                        net.C_47rf var127 = var100.method_46$4c10532da1(
                                                                                                                              var119
                                                                                                                           )
                                                                                                                           .method_48$ac4db64966();
                                                                                                                        net.C_43S var154 = (net.C_43S)var127.method_48$dbd570a038();
                                                                                                                        int var178 = var154.field_41 + 5;
                                                                                                                        net.C_47rf var201 = var100.method_46$4c10532da1(
                                                                                                                              var178
                                                                                                                           )
                                                                                                                           .method_48$ac4db64966();
                                                                                                                        label2329:
                                                                                                                        if (var4 <= 0) {
                                                                                                                           if (var26 == 0) {
                                                                                                                              if (var201 != null) {
                                                                                                                                 break label2329;
                                                                                                                              }

                                                                                                                              var103.add(
                                                                                                                                 (Runnable)recovery$indy$flow$708(
                                                                                                                                    this,
                                                                                                                                    var119,
                                                                                                                                    var178,
                                                                                                                                    var100
                                                                                                                                 )
                                                                                                                              );
                                                                                                                           }

                                                                                                                           var104.add(var127);
                                                                                                                        }

                                                                                                                        int var345 = var26;
                                                                                                                        if (var2 <= 0L) {
                                                                                                                           while (true) {
                                                                                                                              if (var345 != 0) {
                                                                                                                                 var119 = (Integer)var106.next();
                                                                                                                                 var345 = var119;
                                                                                                                                 if (var26 == 0) {
                                                                                                                                    if (var119 < 9) {
                                                                                                                                       var345 = ((int) (var106.hasNext() ? 1 : 0));
                                                                                                                                    } else {
                                                                                                                                       var127 = var100.method_46$4c10532da1(
                                                                                                                                             var119
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       var154 = (net.C_43S)var127.method_48$dbd570a038();
                                                                                                                                       var178 = var154.field_41
                                                                                                                                          + 5;
                                                                                                                                       var201 = var100.method_46$4c10532da1(
                                                                                                                                             var178
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       label1791:
                                                                                                                                       if (var4 <= 0) {
                                                                                                                                          if (var26 == 0) {
                                                                                                                                             if (var201 != null
                                                                                                                                                )
                                                                                                                                              {
                                                                                                                                                break label1791;
                                                                                                                                             }

                                                                                                                                             var103.add(
                                                                                                                                                (Runnable)recovery$indy$flow$708(
                                                                                                                                                   this,
                                                                                                                                                   var119,
                                                                                                                                                   var178,
                                                                                                                                                   var100
                                                                                                                                                )
                                                                                                                                             );
                                                                                                                                          }

                                                                                                                                          var104.add(var127);
                                                                                                                                       }

                                                                                                                                       var345 = var26;
                                                                                                                                    }
                                                                                                                                    continue;
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var345 = 0;
                                                                                                                              }

                                                                                                                              var107 = var345;
                                                                                                                              var119 = 0;

                                                                                                                              for (int var134 = 9;
                                                                                                                                 var134
                                                                                                                                    < var100.field_46.size();
                                                                                                                                 var134++
                                                                                                                              ) {
                                                                                                                                 net.C_47rf var161 = var100.method_46$4c10532da1(
                                                                                                                                       var134
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 var354 = var161;
                                                                                                                                 byte var390 = var26;
                                                                                                                                 if (var4 < 0) {
                                                                                                                                    if (var26 != 0) {
                                                                                                                                       break label2472;
                                                                                                                                    }

                                                                                                                                    var390 = var26;
                                                                                                                                 }

                                                                                                                                 if (var390 == 0) {
                                                                                                                                    if (var161 != null) {
                                                                                                                                       continue;
                                                                                                                                    }

                                                                                                                                    net.minecraft.client.Minecraft var252 = field_43;
                                                                                                                                    var354 = var252.field_42P
                                                                                                                                       .field_42X
                                                                                                                                       .method_41$ac4db64966();
                                                                                                                                 }

                                                                                                                                 label2085: {
                                                                                                                                    if (var354 != null) {
                                                                                                                                       var345 = ((int) (this.field_43P ? 1 : 0));
                                                                                                                                       if (var26 != 0) {
                                                                                                                                          break label2085;
                                                                                                                                       }

                                                                                                                                       if (this.field_43P) {
                                                                                                                                          var178 = var134;
                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$721(
                                                                                                                                                this,
                                                                                                                                                var178,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          net.minecraft.client.Minecraft var254 = field_43;
                                                                                                                                          var104.add(
                                                                                                                                             var254.field_42P
                                                                                                                                                .field_42X
                                                                                                                                                .method_41$ac4db64966()
                                                                                                                                          );
                                                                                                                                          var119 = 1;
                                                                                                                                       }
                                                                                                                                    }

                                                                                                                                    var345 = var119;
                                                                                                                                 }

                                                                                                                                 if (var26 == 0) {
                                                                                                                                    if (var345 == 0) {
                                                                                                                                       var107 = 1;
                                                                                                                                       if (var26 == 0) {
                                                                                                                                          break;
                                                                                                                                       }
                                                                                                                                    }

                                                                                                                                    var345 = 0;
                                                                                                                                 }

                                                                                                                                 var119 = var345;
                                                                                                                              }

                                                                                                                              if (var107 != 0) {
                                                                                                                                 for (Object recovered$element$54927 : var101) {
         int var162 = (int) recovered$element$54927;
                                                                                                                                    var10000 = var162;
                                                                                                                                    var391 = 9;
                                                                                                                                    if (var26 != 0) {
                                                                                                                                       break label2471;
                                                                                                                                    }

                                                                                                                                    if (var162 >= 9) {
                                                                                                                                       net.C_47rf var186 = var100.method_46$4c10532da1(
                                                                                                                                             var162
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       net.C_43S var207 = (net.C_43S)var186.method_48$dbd570a038();
                                                                                                                                       int var220 = var207.field_41
                                                                                                                                          + 5;
                                                                                                                                       net.C_47rf var230 = var100.method_46$4c10532da1(
                                                                                                                                             var220
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       label2054:
                                                                                                                                       if (var4 < 0) {
                                                                                                                                          if (var26 == 0) {
                                                                                                                                             if (var230 == null
                                                                                                                                                )
                                                                                                                                              {
                                                                                                                                                break label2054;
                                                                                                                                             }

                                                                                                                                             var103.add(
                                                                                                                                                (Runnable)recovery$indy$flow$741(
                                                                                                                                                   this,
                                                                                                                                                   var220,
                                                                                                                                                   var100
                                                                                                                                                )
                                                                                                                                             );
                                                                                                                                          }

                                                                                                                                          var104.add(var230);
                                                                                                                                       }

                                                                                                                                       if (var26 != 0) {
                                                                                                                                          break;
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }

                                                                                                                                 java.util.Iterator var136 = var101.iterator();

                                                                                                                                 while (true) {
                                                                                                                                    if (!var136.hasNext()) {
                                                                                                                                       break label2466;
                                                                                                                                    }

                                                                                                                                    int var163 = (Integer)var136.next();
                                                                                                                                    var10000 = var163;
                                                                                                                                    var391 = 9;
                                                                                                                                    if (var26 != 0) {
                                                                                                                                       break label2471;
                                                                                                                                    }

                                                                                                                                    if (var163 >= 9) {
                                                                                                                                       net.C_47rf var187 = var100.method_46$4c10532da1(
                                                                                                                                             var163
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       net.C_43S var208 = (net.C_43S)var187.method_48$dbd570a038();
                                                                                                                                       int var221 = var208.field_41
                                                                                                                                          + 5;
                                                                                                                                       net.C_47rf var231 = var100.method_46$4c10532da1(
                                                                                                                                             var221
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       label2038:
                                                                                                                                       if (var231 != null) {
                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$756(
                                                                                                                                                this,
                                                                                                                                                var163,
                                                                                                                                                var221,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          boolean var357 = var104.add(
                                                                                                                                             var187
                                                                                                                                          );
                                                                                                                                          if (var26 == 0) {
                                                                                                                                             if (!var357) {
                                                                                                                                                break label2038;
                                                                                                                                             }

                                                                                                                                             var103.add(
                                                                                                                                                (Runnable)recovery$indy$flow$765(
                                                                                                                                                   this,
                                                                                                                                                   var163,
                                                                                                                                                   var100
                                                                                                                                                )
                                                                                                                                             );
                                                                                                                                             var104.add(var231);
                                                                                                                                          }

                                                                                                                                          this.field_43P = false;
                                                                                                                                       }

                                                                                                                                       if (var26 != 0) {
                                                                                                                                          break label2466;
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 java.util.Iterator var137 = var101.iterator();

                                                                                                                                 while (true) {
                                                                                                                                    if (!var137.hasNext()) {
                                                                                                                                       break label2466;
                                                                                                                                    }

                                                                                                                                    int var164 = (Integer)var137.next();
                                                                                                                                    var10000 = var164;
                                                                                                                                    var392 = 9;
                                                                                                                                    if (var4 > 0) {
                                                                                                                                       break label2469;
                                                                                                                                    }

                                                                                                                                    if (var164 >= 9) {
                                                                                                                                       net.C_47rf var188 = var100.method_46$4c10532da1(
                                                                                                                                             var164
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       net.C_43S var209 = (net.C_43S)var188.method_48$dbd570a038();
                                                                                                                                       int var222 = var209.field_41
                                                                                                                                          + 5;
                                                                                                                                       net.C_47rf var232 = var100.method_46$4c10532da1(
                                                                                                                                             var222
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       if (var232 != null) {
                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$781(
                                                                                                                                                this,
                                                                                                                                                var222,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          var104.add(var232);
                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$784(
                                                                                                                                                this,
                                                                                                                                                var164,
                                                                                                                                                var222,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          var104.add(var188);
                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$787(
                                                                                                                                                this,
                                                                                                                                                var164,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          var104.add(var232);
                                                                                                                                          this.field_43P = true;
                                                                                                                                       }

                                                                                                                                       var359 = var26;
                                                                                                                                       if (var4 >= 0) {
                                                                                                                                          break label2467;
                                                                                                                                       }

                                                                                                                                       if (var26 != 0) {
                                                                                                                                          break label2466;
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }

                                                                                                                        label2321: {
                                                                                                                           for (; var345 == 0; var345 = var26) {
                                                                                                                              while (var106.hasNext()) {
                                                                                                                                 var119 = (Integer)var106.next();
                                                                                                                                 var345 = var119;
                                                                                                                                 if (var26 != 0) {
                                                                                                                                    break label2321;
                                                                                                                                 }

                                                                                                                                 if (var119 >= 9) {
                                                                                                                                    var127 = var100.method_46$4c10532da1(
                                                                                                                                          var119
                                                                                                                                       )
                                                                                                                                       .method_48$ac4db64966();
                                                                                                                                    var154 = (net.C_43S)var127.method_48$dbd570a038();
                                                                                                                                    var178 = var154.field_41
                                                                                                                                       + 5;
                                                                                                                                    var201 = var100.method_46$4c10532da1(
                                                                                                                                          var178
                                                                                                                                       )
                                                                                                                                       .method_48$ac4db64966();
                                                                                                                                    if (var4 <= 0) {
                                                                                                                                       if (var26 == 0) {
                                                                                                                                          if (var201 != null) {
                                                                                                                                             break;
                                                                                                                                          }

                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$708(
                                                                                                                                                this,
                                                                                                                                                var119,
                                                                                                                                                var178,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                       }

                                                                                                                                       var104.add(var127);
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                 }
                                                                                                                              }
                                                                                                                              break;
                                                                                                                           }

                                                                                                                           var345 = 0;
                                                                                                                        }

                                                                                                                        var107 = var345;
                                                                                                                        var119 = 0;

                                                                                                                        for (int var129 = 9;
                                                                                                                           var129 < var100.field_46.size();
                                                                                                                           var129++
                                                                                                                        ) {
                                                                                                                           net.C_47rf var156 = var100.method_46$4c10532da1(
                                                                                                                                 var129
                                                                                                                              )
                                                                                                                              .method_48$ac4db64966();
                                                                                                                           var347 = var156;
                                                                                                                           byte var387 = var26;
                                                                                                                           if (var4 < 0) {
                                                                                                                              if (var26 != 0) {
                                                                                                                                 break label2463;
                                                                                                                              }

                                                                                                                              var387 = var26;
                                                                                                                           }

                                                                                                                           if (var387 == 0) {
                                                                                                                              if (var156 != null) {
                                                                                                                                 continue;
                                                                                                                              }

                                                                                                                              net.minecraft.client.Minecraft var65 = field_43;
                                                                                                                              var347 = var65.field_42P
                                                                                                                                 .field_42X
                                                                                                                                 .method_41$ac4db64966();
                                                                                                                           }

                                                                                                                           label2290: {
                                                                                                                              if (var347 != null) {
                                                                                                                                 var345 = ((int) (this.field_43P ? 1 : 0));
                                                                                                                                 if (var26 != 0) {
                                                                                                                                    break label2290;
                                                                                                                                 }

                                                                                                                                 if (this.field_43P) {
                                                                                                                                    var178 = var129;
                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$721(
                                                                                                                                          this, var178, var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    net.minecraft.client.Minecraft var66 = field_43;
                                                                                                                                    var104.add(
                                                                                                                                       var66.field_42P
                                                                                                                                          .field_42X
                                                                                                                                          .method_41$ac4db64966()
                                                                                                                                    );
                                                                                                                                    var119 = 1;
                                                                                                                                 }
                                                                                                                              }

                                                                                                                              var345 = var119;
                                                                                                                           }

                                                                                                                           if (var26 == 0) {
                                                                                                                              if (var345 == 0) {
                                                                                                                                 var107 = 1;
                                                                                                                                 if (var26 == 0) {
                                                                                                                                    break;
                                                                                                                                 }
                                                                                                                              }

                                                                                                                              var345 = 0;
                                                                                                                           }

                                                                                                                           var119 = var345;
                                                                                                                        }

                                                                                                                        if (var107 != 0) {
                                                                                                                           for (Object recovered$element$95021 : var101) {
         int var157 = (int) recovered$element$95021;
                                                                                                                              var10000 = var157;
                                                                                                                              var388 = 9;
                                                                                                                              if (var26 != 0) {
                                                                                                                                 break label2462;
                                                                                                                              }

                                                                                                                              if (var157 >= 9) {
                                                                                                                                 net.C_47rf var181 = var100.method_46$4c10532da1(
                                                                                                                                       var157
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 net.C_43S var203 = (net.C_43S)var181.method_48$dbd570a038();
                                                                                                                                 int var38 = var203.field_41
                                                                                                                                    + 5;
                                                                                                                                 net.C_47rf var39 = var100.method_46$4c10532da1(
                                                                                                                                       var38
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 label2235:
                                                                                                                                 if (var4 < 0) {
                                                                                                                                    if (var26 == 0) {
                                                                                                                                       if (var39 == null) {
                                                                                                                                          break label2235;
                                                                                                                                       }

                                                                                                                                       var103.add(
                                                                                                                                          (Runnable)recovery$indy$flow$741(
                                                                                                                                             this,
                                                                                                                                             var38,
                                                                                                                                             var100
                                                                                                                                          )
                                                                                                                                       );
                                                                                                                                    }

                                                                                                                                    var104.add(var39);
                                                                                                                                 }

                                                                                                                                 if (var26 != 0) {
                                                                                                                                    break;
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }

                                                                                                                           java.util.Iterator var131 = var101.iterator();

                                                                                                                           while (true) {
                                                                                                                              if (!var131.hasNext()) {
                                                                                                                                 break label2454;
                                                                                                                              }

                                                                                                                              int var158 = (Integer)var131.next();
                                                                                                                              var10000 = var158;
                                                                                                                              var388 = 9;
                                                                                                                              if (var26 != 0) {
                                                                                                                                 break label2462;
                                                                                                                              }

                                                                                                                              if (var158 >= 9) {
                                                                                                                                 net.C_47rf var182 = var100.method_46$4c10532da1(
                                                                                                                                       var158
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 net.C_43S var204 = (net.C_43S)var182.method_48$dbd570a038();
                                                                                                                                 int var218 = var204.field_41
                                                                                                                                    + 5;
                                                                                                                                 net.C_47rf var228 = var100.method_46$4c10532da1(
                                                                                                                                       var218
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 label2219:
                                                                                                                                 if (var228 != null) {
                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$756(
                                                                                                                                          this,
                                                                                                                                          var158,
                                                                                                                                          var218,
                                                                                                                                          var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    boolean var350 = var104.add(
                                                                                                                                       var182
                                                                                                                                    );
                                                                                                                                    if (var26 == 0) {
                                                                                                                                       net.minecraft.client.Minecraft var67 = field_43;
                                                                                                                                       if (var67.field_42P
                                                                                                                                             .field_42X
                                                                                                                                             .method_41$ac4db64966()
                                                                                                                                          == null) {
                                                                                                                                          break label2219;
                                                                                                                                       }

                                                                                                                                       var350 = this.field_43P;
                                                                                                                                    }

                                                                                                                                    if (var26 == 0) {
                                                                                                                                       if (!var350) {
                                                                                                                                          break label2219;
                                                                                                                                       }

                                                                                                                                       var103.add(
                                                                                                                                          (Runnable)recovery$indy$flow$765(
                                                                                                                                             this,
                                                                                                                                             var158,
                                                                                                                                             var100
                                                                                                                                          )
                                                                                                                                       );
                                                                                                                                       var104.add(var228);
                                                                                                                                    }

                                                                                                                                    this.field_43P = false;
                                                                                                                                 }

                                                                                                                                 if (var26 != 0) {
                                                                                                                                    break label2454;
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           java.util.Iterator var132 = var101.iterator();

                                                                                                                           while (true) {
                                                                                                                              if (!var132.hasNext()) {
                                                                                                                                 break label2454;
                                                                                                                              }

                                                                                                                              int var159 = (Integer)var132.next();
                                                                                                                              var10000 = var159;
                                                                                                                              var389 = 9;
                                                                                                                              if (var4 > 0) {
                                                                                                                                 break label2566;
                                                                                                                              }

                                                                                                                              if (var159 >= 9) {
                                                                                                                                 net.C_47rf var183 = var100.method_46$4c10532da1(
                                                                                                                                       var159
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 net.C_43S var205 = (net.C_43S)var183.method_48$dbd570a038();
                                                                                                                                 int var219 = var205.field_41
                                                                                                                                    + 5;
                                                                                                                                 net.C_47rf var229 = var100.method_46$4c10532da1(
                                                                                                                                       var219
                                                                                                                                    )
                                                                                                                                    .method_48$ac4db64966();
                                                                                                                                 if (var229 != null) {
                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$781(
                                                                                                                                          this, var219, var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    var104.add(var229);
                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$784(
                                                                                                                                          this,
                                                                                                                                          var159,
                                                                                                                                          var219,
                                                                                                                                          var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    var104.add(var183);
                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$787(
                                                                                                                                          this, var159, var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    var104.add(var229);
                                                                                                                                    this.field_43P = true;
                                                                                                                                 }

                                                                                                                                 var352 = var26;
                                                                                                                                 if (var4 >= 0) {
                                                                                                                                    break label2568;
                                                                                                                                 }

                                                                                                                                 if (var26 != 0) {
                                                                                                                                    break label2454;
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }
                                                                                                                     }
                                                                                                                  }

                                                                                                                  var107 = var10000;
                                                                                                                  var119 = 0;

                                                                                                                  for (int var138 = 9;
                                                                                                                     var138 < var100.field_46.size();
                                                                                                                     var138++
                                                                                                                  ) {
                                                                                                                     net.C_47rf var165 = var100.method_46$4c10532da1(
                                                                                                                           var138
                                                                                                                        )
                                                                                                                        .method_48$ac4db64966();
                                                                                                                     var360 = var165;
                                                                                                                     byte var393 = var26;
                                                                                                                     if (var4 < 0) {
                                                                                                                        if (var26 != 0) {
                                                                                                                           break label2459;
                                                                                                                        }

                                                                                                                        var393 = var26;
                                                                                                                     }

                                                                                                                     if (var393 == 0) {
                                                                                                                        if (var165 != null) {
                                                                                                                           continue;
                                                                                                                        }

                                                                                                                        net.minecraft.client.Minecraft var253 = field_43;
                                                                                                                        var360 = var253.field_42P
                                                                                                                           .field_42X
                                                                                                                           .method_41$ac4db64966();
                                                                                                                     }

                                                                                                                     label2431: {
                                                                                                                        if (var360 != null) {
                                                                                                                           var10000 = ((int) (this.field_43P ? 1 : 0));
                                                                                                                           if (var26 != 0) {
                                                                                                                              break label2431;
                                                                                                                           }

                                                                                                                           if (this.field_43P) {
                                                                                                                              int var189 = var138;
                                                                                                                              var103.add(
                                                                                                                                 (Runnable)recovery$indy$flow$721(
                                                                                                                                    this, var189, var100
                                                                                                                                 )
                                                                                                                              );
                                                                                                                              net.minecraft.client.Minecraft var255 = field_43;
                                                                                                                              var104.add(
                                                                                                                                 var255.field_42P
                                                                                                                                    .field_42X
                                                                                                                                    .method_41$ac4db64966()
                                                                                                                              );
                                                                                                                              var119 = 1;
                                                                                                                           }
                                                                                                                        }

                                                                                                                        var10000 = var119;
                                                                                                                     }

                                                                                                                     if (var26 == 0) {
                                                                                                                        if (var10000 == 0) {
                                                                                                                           var107 = 1;
                                                                                                                           if (var26 == 0) {
                                                                                                                              break;
                                                                                                                           }
                                                                                                                        }

                                                                                                                        var10000 = 0;
                                                                                                                     }

                                                                                                                     var119 = var10000;
                                                                                                                  }

                                                                                                                  label2417: {
                                                                                                                     if (var107 != 0) {
                                                                                                                        for (Object recovered$element$128251 : var101) {
         int var166 = (int) recovered$element$128251;
                                                                                                                           var10000 = var166;
                                                                                                                           var394 = 9;
                                                                                                                           if (var26 != 0) {
                                                                                                                              break label2567;
                                                                                                                           }

                                                                                                                           if (var166 >= 9) {
                                                                                                                              net.C_47rf var190 = var100.method_46$4c10532da1(
                                                                                                                                    var166
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              net.C_43S var210 = (net.C_43S)var190.method_48$dbd570a038();
                                                                                                                              int var223 = var210.field_41 + 5;
                                                                                                                              net.C_47rf var233 = var100.method_46$4c10532da1(
                                                                                                                                    var223
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              label2399:
                                                                                                                              if (var4 < 0) {
                                                                                                                                 if (var26 == 0) {
                                                                                                                                    if (var233 == null) {
                                                                                                                                       break label2399;
                                                                                                                                    }

                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$741(
                                                                                                                                          this, var223, var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                 }

                                                                                                                                 var104.add(var233);
                                                                                                                              }

                                                                                                                              if (var26 != 0) {
                                                                                                                                 break;
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }

                                                                                                                        java.util.Iterator var140 = var101.iterator();

                                                                                                                        while (var140.hasNext()) {
                                                                                                                           int var167 = (Integer)var140.next();
                                                                                                                           var10000 = var167;
                                                                                                                           var394 = 9;
                                                                                                                           if (var26 != 0) {
                                                                                                                              break label2567;
                                                                                                                           }

                                                                                                                           if (var167 >= 9) {
                                                                                                                              net.C_47rf var191 = var100.method_46$4c10532da1(
                                                                                                                                    var167
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              net.C_43S var211 = (net.C_43S)var191.method_48$dbd570a038();
                                                                                                                              int var224 = var211.field_41 + 5;
                                                                                                                              net.C_47rf var234 = var100.method_46$4c10532da1(
                                                                                                                                    var224
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              if (var234 != null) {
                                                                                                                                 var103.add(
                                                                                                                                    (Runnable)recovery$indy$flow$756(
                                                                                                                                       this,
                                                                                                                                       var167,
                                                                                                                                       var224,
                                                                                                                                       var100
                                                                                                                                    )
                                                                                                                                 );
                                                                                                                                 boolean var363 = var104.add(
                                                                                                                                    var191
                                                                                                                                 );
                                                                                                                                 byte var395 = var26;
                                                                                                                                 if (var2 <= 0L) {
                                                                                                                                    while (true) {
                                                                                                                                       label2111: {
                                                                                                                                          if (var395 == 0) {
                                                                                                                                             if (!var363) {
                                                                                                                                                break label2111;
                                                                                                                                             }

                                                                                                                                             var103.add(
                                                                                                                                                (Runnable)recovery$indy$flow$765(
                                                                                                                                                   this,
                                                                                                                                                   var167,
                                                                                                                                                   var100
                                                                                                                                                )
                                                                                                                                             );
                                                                                                                                             var104.add(var234);
                                                                                                                                          }

                                                                                                                                          this.field_43P = false;
                                                                                                                                       }

                                                                                                                                       do {
                                                                                                                                          if (var26 != 0) {
                                                                                                                                             break label2466;
                                                                                                                                          }

                                                                                                                                          do {
                                                                                                                                             if (!var140.hasNext()
                                                                                                                                                )
                                                                                                                                              {
                                                                                                                                                break label2466;
                                                                                                                                             }

                                                                                                                                             var167 = (Integer)var140.next();
                                                                                                                                             var10000 = var167;
                                                                                                                                             var391 = 9;
                                                                                                                                             if (var26 != 0) {
                                                                                                                                                break label2471;
                                                                                                                                             }
                                                                                                                                          } while (var167 < 9);

                                                                                                                                          var191 = var100.method_46$4c10532da1(
                                                                                                                                                var167
                                                                                                                                             )
                                                                                                                                             .method_48$ac4db64966();
                                                                                                                                          var211 = (net.C_43S)var191.method_48$dbd570a038();
                                                                                                                                          var224 = var211.field_41
                                                                                                                                             + 5;
                                                                                                                                          var234 = var100.method_46$4c10532da1(
                                                                                                                                                var224
                                                                                                                                             )
                                                                                                                                             .method_48$ac4db64966();
                                                                                                                                       } while (var234 == null);

                                                                                                                                       var103.add(
                                                                                                                                          (Runnable)recovery$indy$flow$756(
                                                                                                                                             this,
                                                                                                                                             var167,
                                                                                                                                             var224,
                                                                                                                                             var100
                                                                                                                                          )
                                                                                                                                       );
                                                                                                                                       var363 = var104.add(
                                                                                                                                          var191
                                                                                                                                       );
                                                                                                                                       var395 = var26;
                                                                                                                                    }
                                                                                                                                 }

                                                                                                                                 while (true) {
                                                                                                                                    label2595: {
                                                                                                                                       if (var395 == 0) {
                                                                                                                                          net.minecraft.client.Minecraft var256 = field_43;
                                                                                                                                          if (var256.field_42P
                                                                                                                                                .field_42X
                                                                                                                                                .method_41$ac4db64966()
                                                                                                                                             == null) {
                                                                                                                                             break label2595;
                                                                                                                                          }

                                                                                                                                          var363 = this.field_43P;
                                                                                                                                       }

                                                                                                                                       if (var26 == 0) {
                                                                                                                                          if (!var363) {
                                                                                                                                             break label2595;
                                                                                                                                          }

                                                                                                                                          var103.add(
                                                                                                                                             (Runnable)recovery$indy$flow$765(
                                                                                                                                                this,
                                                                                                                                                var167,
                                                                                                                                                var100
                                                                                                                                             )
                                                                                                                                          );
                                                                                                                                          var104.add(var234);
                                                                                                                                       }

                                                                                                                                       this.field_43P = false;
                                                                                                                                    }

                                                                                                                                    do {
                                                                                                                                       if (var26 != 0) {
                                                                                                                                          break label2454;
                                                                                                                                       }

                                                                                                                                       do {
                                                                                                                                          if (!var140.hasNext()
                                                                                                                                             )
                                                                                                                                           {
                                                                                                                                             break label2454;
                                                                                                                                          }

                                                                                                                                          var167 = (Integer)var140.next();
                                                                                                                                          var10000 = var167;
                                                                                                                                          var388 = 9;
                                                                                                                                          if (var26 != 0) {
                                                                                                                                             break label2462;
                                                                                                                                          }
                                                                                                                                       } while (var167 < 9);

                                                                                                                                       var191 = var100.method_46$4c10532da1(
                                                                                                                                             var167
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                       var211 = (net.C_43S)var191.method_48$dbd570a038();
                                                                                                                                       var224 = var211.field_41
                                                                                                                                          + 5;
                                                                                                                                       var234 = var100.method_46$4c10532da1(
                                                                                                                                             var224
                                                                                                                                          )
                                                                                                                                          .method_48$ac4db64966();
                                                                                                                                    } while (var234 == null);

                                                                                                                                    var103.add(
                                                                                                                                       (Runnable)recovery$indy$flow$756(
                                                                                                                                          this,
                                                                                                                                          var167,
                                                                                                                                          var224,
                                                                                                                                          var100
                                                                                                                                       )
                                                                                                                                    );
                                                                                                                                    var363 = var104.add(var191);
                                                                                                                                    var395 = var26;
                                                                                                                                 }
                                                                                                                              }

                                                                                                                              if (var26 != 0) {
                                                                                                                                 break;
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        for (Object recovered$element$158816 : var101) {
         int var174 = (int) recovered$element$158816;
                                                                                                                           var10000 = var174;
                                                                                                                           var400 = 9;
                                                                                                                           if (var4 > 0) {
                                                                                                                              break label2456;
                                                                                                                           }

                                                                                                                           if (var174 >= 9) {
                                                                                                                              net.C_47rf var198 = var100.method_46$4c10532da1(
                                                                                                                                    var174
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              net.C_43S var216 = (net.C_43S)var198.method_48$dbd570a038();
                                                                                                                              int var227 = var216.field_41 + 5;
                                                                                                                              net.C_47rf var235 = var100.method_46$4c10532da1(
                                                                                                                                    var227
                                                                                                                                 )
                                                                                                                                 .method_48$ac4db64966();
                                                                                                                              if (var235 != null) {
                                                                                                                                 var103.add(
                                                                                                                                    (Runnable)recovery$indy$flow$781(
                                                                                                                                       this, var227, var100
                                                                                                                                    )
                                                                                                                                 );
                                                                                                                                 var104.add(var235);
                                                                                                                                 var103.add(
                                                                                                                                    (Runnable)recovery$indy$flow$784(
                                                                                                                                       this,
                                                                                                                                       var174,
                                                                                                                                       var227,
                                                                                                                                       var100
                                                                                                                                    )
                                                                                                                                 );
                                                                                                                                 var104.add(var198);
                                                                                                                                 var103.add(
                                                                                                                                    (Runnable)recovery$indy$flow$787(
                                                                                                                                       this, var174, var100
                                                                                                                                    )
                                                                                                                                 );
                                                                                                                                 var104.add(var235);
                                                                                                                                 this.field_43P = true;
                                                                                                                              }

                                                                                                                              var377 = var26;
                                                                                                                              if (var4 >= 0) {
                                                                                                                                 break label2417;
                                                                                                                              }

                                                                                                                              if (var26 != 0) {
                                                                                                                                 break;
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }
                                                                                                                     }

                                                                                                                     var377 = var26;
                                                                                                                  }

                                                                                                                  if (var377 == 0) {
                                                                                                                     break label2569;
                                                                                                                  }
                                                                                                               }

                                                                                                               var343 = this;
                                                                                                            }

                                                                                                            var343.field_43P = false;
                                                                                                            java.util.Iterator var113 = var101.iterator();

                                                                                                            label2369: {
                                                                                                               while (true) {
                                                                                                                  if (var113.hasNext()) {
                                                                                                                     var119 = (Integer)var113.next();
                                                                                                                     var10000 = var119;
                                                                                                                     var400 = 9;
                                                                                                                     if (var4 > 0) {
                                                                                                                        break label2369;
                                                                                                                     }

                                                                                                                     if (var119 < 9) {
                                                                                                                        continue;
                                                                                                                     }

                                                                                                                     net.C_47rf var151;
                                                                                                                     int var199;
                                                                                                                     label2363: {
                                                                                                                        var151 = var100.method_46$4c10532da1(
                                                                                                                              var119
                                                                                                                           )
                                                                                                                           .method_48$ac4db64966();
                                                                                                                        net.C_43S var175 = (net.C_43S)var151.method_48$dbd570a038();
                                                                                                                        var199 = var175.field_41 + 5;
                                                                                                                        net.C_47rf var217 = var100.method_46$4c10532da1(
                                                                                                                              var199
                                                                                                                           )
                                                                                                                           .method_48$ac4db64966();
                                                                                                                        net.C_47rf var378 = var217;
                                                                                                                        int var401 = var26;
                                                                                                                        if (var4 < 0) {
                                                                                                                           if (var26 == 0) {
                                                                                                                              if (var217 == null) {
                                                                                                                                 break label2363;
                                                                                                                              }

                                                                                                                              var378 = var217;
                                                                                                                           }

                                                                                                                           var401 = var199;
                                                                                                                        }

                                                                                                                        var378.method_48$d00df7729d(var401);
                                                                                                                        var103.add(
                                                                                                                           (Runnable)recovery$indy$flow$805(
                                                                                                                              this, var217, var100
                                                                                                                           )
                                                                                                                        );
                                                                                                                        var104.add(var151);
                                                                                                                     }

                                                                                                                     if (var102 != 0) {
                                                                                                                        continue;
                                                                                                                     }

                                                                                                                     var103.add(
                                                                                                                        (Runnable)recovery$indy$flow$808(
                                                                                                                           this, var119, var199, var100
                                                                                                                        )
                                                                                                                     );
                                                                                                                     var104.add(var151);
                                                                                                                     var10000 = var26;
                                                                                                                     if (var4 >= 0) {
                                                                                                                        break;
                                                                                                                     }

                                                                                                                     if (var26 == 0) {
                                                                                                                        continue;
                                                                                                                     }
                                                                                                                  }

                                                                                                                  var10000 = var102;
                                                                                                                  break;
                                                                                                               }

                                                                                                               var400 = var26;
                                                                                                            }

                                                                                                            if (var4 > 0) {
                                                                                                               break label2456;
                                                                                                            }

                                                                                                            if (var400 != 0) {
                                                                                                               break label2455;
                                                                                                            }

                                                                                                            if (var10000 != 0) {
                                                                                                               for (Object recovered$element$177309 : var101) {
         int var126 = (int) recovered$element$177309;
                                                                                                                  var10000 = var126;
                                                                                                                  if (var26 != 0) {
                                                                                                                     break label2455;
                                                                                                                  }

                                                                                                                  if (var126 >= 9) {
                                                                                                                     net.C_47rf var152 = var100.method_46$4c10532da1(
                                                                                                                           var126
                                                                                                                        )
                                                                                                                        .method_48$ac4db64966();
                                                                                                                     net.C_43S var176 = (net.C_43S)var152.method_48$dbd570a038();
                                                                                                                     int var200 = var176.field_41 + 5;
                                                                                                                     var103.add(
                                                                                                                        (Runnable)recovery$indy$flow$821(
                                                                                                                           this, var126, var200, var100
                                                                                                                        )
                                                                                                                     );
                                                                                                                     var152.method_48$d00df7729d(var126);
                                                                                                                     var104.add(var152);
                                                                                                                  }
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var10000 = ((int) (var103.isEmpty() ? 1 : 0));
                                                                                                         break label2455;
                                                                                                      }

                                                                                                      var352 = var26;
                                                                                                      break label2568;
                                                                                                   }

                                                                                                   var400 = var26;
                                                                                                }

                                                                                                if (var400 != 0) {
                                                                                                   break label2482;
                                                                                                }

                                                                                                if (var10000 == 0) {
                                                                                                   break label2479;
                                                                                                }

                                                                                                var107 = 1;
                                                                                                var10000 = ((int) (this.field_43P ? 1 : 0));
                                                                                                var402 = var26;
                                                                                                if (var4 > 0) {
                                                                                                   break label2559;
                                                                                                }

                                                                                                if (var26 != 0) {
                                                                                                   var402 = var26;
                                                                                                   break label2559;
                                                                                                }

                                                                                                if (!this.field_43P) {
                                                                                                   break label2564;
                                                                                                }

                                                                                                net.minecraft.client.Minecraft var259 = field_43;
                                                                                                var360 = var259.field_42P.field_42X.method_41$ac4db64966();
                                                                                                break label2459;
                                                                                             }

                                                                                             label1953: {
                                                                                                if (var352 != 0) {
                                                                                                   this.field_43P = false;
                                                                                                   java.util.Iterator var109 = var101.iterator();

                                                                                                   label1949: {
                                                                                                      while (true) {
                                                                                                         if (var109.hasNext()) {
                                                                                                            var119 = (Integer)var109.next();
                                                                                                            var10000 = var119;
                                                                                                            var389 = 9;
                                                                                                            if (var4 > 0) {
                                                                                                               break label1949;
                                                                                                            }

                                                                                                            if (var119 < 9) {
                                                                                                               continue;
                                                                                                            }

                                                                                                            net.C_47rf var142;
                                                                                                            int var193;
                                                                                                            label1943: {
                                                                                                               var142 = var100.method_46$4c10532da1(var119)
                                                                                                                  .method_48$ac4db64966();
                                                                                                               net.C_43S var168 = (net.C_43S)var142.method_48$dbd570a038();
                                                                                                               var193 = var168.field_41 + 5;
                                                                                                               net.C_47rf var213 = var100.method_46$4c10532da1(
                                                                                                                     var193
                                                                                                                  )
                                                                                                                  .method_48$ac4db64966();
                                                                                                               net.C_47rf var366 = var213;
                                                                                                               int var396 = var26;
                                                                                                               if (var4 < 0) {
                                                                                                                  if (var26 == 0) {
                                                                                                                     if (var213 == null) {
                                                                                                                        break label1943;
                                                                                                                     }

                                                                                                                     var366 = var213;
                                                                                                                  }

                                                                                                                  var396 = var193;
                                                                                                               }

                                                                                                               var366.method_48$d00df7729d(var396);
                                                                                                               var103.add(
                                                                                                                  (Runnable)recovery$indy$flow$805(
                                                                                                                     this, var213, var100
                                                                                                                  )
                                                                                                               );
                                                                                                               var104.add(var142);
                                                                                                            }

                                                                                                            if (var102 != 0) {
                                                                                                               continue;
                                                                                                            }

                                                                                                            var103.add(
                                                                                                               (Runnable)recovery$indy$flow$808(
                                                                                                                  this, var119, var193, var100
                                                                                                               )
                                                                                                            );
                                                                                                            var104.add(var142);
                                                                                                            var10000 = var26;
                                                                                                            if (var4 >= 0) {
                                                                                                               break;
                                                                                                            }

                                                                                                            if (var26 == 0) {
                                                                                                               continue;
                                                                                                            }
                                                                                                         }

                                                                                                         var10000 = var102;
                                                                                                         break;
                                                                                                      }

                                                                                                      var389 = var26;
                                                                                                   }

                                                                                                   if (var4 > 0) {
                                                                                                      break label2566;
                                                                                                   }

                                                                                                   if (var389 != 0) {
                                                                                                      break label1953;
                                                                                                   }

                                                                                                   if (var10000 != 0) {
                                                                                                      for (Object recovered$element$193427 : var101) {
         int var122 = (int) recovered$element$193427;
                                                                                                         var10000 = var122;
                                                                                                         if (var26 != 0) {
                                                                                                            break label1953;
                                                                                                         }

                                                                                                         if (var122 >= 9) {
                                                                                                            net.C_47rf var143 = var100.method_46$4c10532da1(var122)
                                                                                                               .method_48$ac4db64966();
                                                                                                            net.C_43S var169 = (net.C_43S)var143.method_48$dbd570a038();
                                                                                                            int var194 = var169.field_41 + 5;
                                                                                                            var103.add(
                                                                                                               (Runnable)recovery$indy$flow$821(
                                                                                                                  this, var122, var194, var100
                                                                                                               )
                                                                                                            );
                                                                                                            var143.method_48$d00df7729d(var122);
                                                                                                            var104.add(var143);
                                                                                                         }
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                var10000 = ((int) (var103.isEmpty() ? 1 : 0));
                                                                                             }

                                                                                             var389 = var26;
                                                                                             break label2566;
                                                                                          }

                                                                                          while (true) {
                                                                                             if (var10000 >= var394) {
                                                                                                break label2564;
                                                                                             }

                                                                                             net.C_47rf var149 = var100.method_46$4c10532da1(var119)
                                                                                                .method_48$ac4db64966();
                                                                                             byte var374 = var26;
                                                                                             if (var4 <= 0) {
                                                                                                if (var26 != 0) {
                                                                                                   break label2479;
                                                                                                }

                                                                                                var374 = var26;
                                                                                             }

                                                                                             if (var374 == 0) {
                                                                                                label2184: {
                                                                                                   net.C_47rf var375 = var149;
                                                                                                   if (var4 <= 0) {
                                                                                                      if (var149 != null) {
                                                                                                         break label2184;
                                                                                                      }

                                                                                                      net.minecraft.client.Minecraft var263 = field_43;
                                                                                                      var375 = var263.field_42P
                                                                                                         .field_42X
                                                                                                         .method_41$ac4db64966();
                                                                                                   }

                                                                                                   if (var375 != null && this.field_43P) {
                                                                                                      break label2565;
                                                                                                   }
                                                                                                }

                                                                                                var119++;
                                                                                             }

                                                                                             if (var26 != 0) {
                                                                                                break label2564;
                                                                                             }

                                                                                             var10000 = var119;
                                                                                             var394 = var100.field_46.size();
                                                                                          }
                                                                                       }

                                                                                       if (var360 == null) {
                                                                                          break label2564;
                                                                                       }

                                                                                       var119 = 9;

                                                                                       while (true) {
                                                                                          if (var119 >= var100.field_46.size()) {
                                                                                             break label2564;
                                                                                          }

                                                                                          net.C_47rf var153 = var100.method_46$4c10532da1(var119)
                                                                                             .method_48$ac4db64966();
                                                                                          byte var379 = var26;
                                                                                          if (var4 <= 0) {
                                                                                             if (var26 != 0) {
                                                                                                break label2479;
                                                                                             }

                                                                                             var379 = var26;
                                                                                          }

                                                                                          if (var379 == 0) {
                                                                                             label2167: {
                                                                                                net.C_47rf var380 = var153;
                                                                                                if (var4 <= 0) {
                                                                                                   if (var153 != null) {
                                                                                                      break label2167;
                                                                                                   }

                                                                                                   net.minecraft.client.Minecraft var264 = field_43;
                                                                                                   var380 = var264.field_42P.field_42X.method_41$ac4db64966();
                                                                                                }

                                                                                                if (var380 != null && this.field_43P) {
                                                                                                   break label2565;
                                                                                                }
                                                                                             }

                                                                                             var119++;
                                                                                          }

                                                                                          if (var26 != 0) {
                                                                                             break label2564;
                                                                                          }
                                                                                       }
                                                                                    }

                                                                                    if (var389 != 0) {
                                                                                       break label2480;
                                                                                    }

                                                                                    if (var10000 == 0) {
                                                                                       break label2477;
                                                                                    }

                                                                                    var107 = 1;
                                                                                    var10000 = ((int) (this.field_43P ? 1 : 0));
                                                                                    var397 = var26;
                                                                                    if (var4 > 0) {
                                                                                       break label2561;
                                                                                    }

                                                                                    if (var26 != 0) {
                                                                                       break label2562;
                                                                                    }

                                                                                    if (!this.field_43P) {
                                                                                       break label2563;
                                                                                    }

                                                                                    net.minecraft.client.Minecraft var257 = field_43;
                                                                                    var347 = var257.field_42P.field_42X.method_41$ac4db64966();
                                                                                    break label2463;
                                                                                 }

                                                                                 int var177 = var119;
                                                                                 var103.add((Runnable)recovery$indy$flow$842(this, var177, var100));
                                                                                 net.minecraft.client.Minecraft var266 = field_43;
                                                                                 var104.add(var266.field_42P.field_42X.method_41$ac4db64966());
                                                                                 var107 = 0;
                                                                                 break label2564;
                                                                              }

                                                                              while (true) {
                                                                                 if (var10000 >= var388) {
                                                                                    break label2563;
                                                                                 }

                                                                                 net.C_47rf var141 = var100.method_46$4c10532da1(var119).method_48$ac4db64966();
                                                                                 byte var364 = var26;
                                                                                 if (var4 <= 0) {
                                                                                    if (var26 != 0) {
                                                                                       break label2477;
                                                                                    }

                                                                                    var364 = var26;
                                                                                 }

                                                                                 if (var364 == 0) {
                                                                                    label2133: {
                                                                                       net.C_47rf var365 = var141;
                                                                                       if (var4 <= 0) {
                                                                                          if (var141 != null) {
                                                                                             break label2133;
                                                                                          }

                                                                                          net.minecraft.client.Minecraft var69 = field_43;
                                                                                          var365 = var69.field_42P.field_42X.method_41$ac4db64966();
                                                                                       }

                                                                                       if (var365 != null && this.field_43P) {
                                                                                          break label2465;
                                                                                       }
                                                                                    }

                                                                                    var119++;
                                                                                 }

                                                                                 if (var26 != 0) {
                                                                                    break label2563;
                                                                                 }

                                                                                 var10000 = var119;
                                                                                 var388 = var100.field_46.size();
                                                                              }
                                                                           }

                                                                           if (var347 == null) {
                                                                              break label2563;
                                                                           }

                                                                           var119 = 9;

                                                                           while (true) {
                                                                              if (var119 >= var100.field_46.size()) {
                                                                                 break label2563;
                                                                              }

                                                                              net.C_47rf var144 = var100.method_46$4c10532da1(var119).method_48$ac4db64966();
                                                                              byte var367 = var26;
                                                                              if (var4 <= 0) {
                                                                                 if (var26 != 0) {
                                                                                    break label2477;
                                                                                 }

                                                                                 var367 = var26;
                                                                              }

                                                                              if (var367 == 0) {
                                                                                 label2021: {
                                                                                    net.C_47rf var368 = var144;
                                                                                    if (var4 <= 0) {
                                                                                       if (var144 != null) {
                                                                                          break label2021;
                                                                                       }

                                                                                       net.minecraft.client.Minecraft var260 = field_43;
                                                                                       var368 = var260.field_42P.field_42X.method_41$ac4db64966();
                                                                                    }

                                                                                    if (var368 != null && this.field_43P) {
                                                                                       break label2465;
                                                                                    }
                                                                                 }

                                                                                 var119++;
                                                                              }

                                                                              if (var26 != 0) {
                                                                                 break label2563;
                                                                              }
                                                                           }
                                                                        }

                                                                        if (var2 <= 0L) {
                                                                           break label2478;
                                                                        }
                                                                        break label2563;
                                                                     }

                                                                     int var170 = var119;
                                                                     var103.add((Runnable)recovery$indy$flow$842(this, var170, var100));
                                                                     net.minecraft.client.Minecraft var70 = field_43;
                                                                     var104.add(var70.field_42P.field_42X.method_41$ac4db64966());
                                                                     var107 = 0;
                                                                     break label2563;
                                                                  }

                                                                  var359 = var26;
                                                               }

                                                               label1887: {
                                                                  if (var359 != 0) {
                                                                     this.field_43P = false;
                                                                     java.util.Iterator var111 = var101.iterator();

                                                                     label1883: {
                                                                        while (true) {
                                                                           if (var111.hasNext()) {
                                                                              var119 = (Integer)var111.next();
                                                                              var10000 = var119;
                                                                              var392 = 9;
                                                                              if (var4 > 0) {
                                                                                 break label1883;
                                                                              }

                                                                              if (var119 < 9) {
                                                                                 continue;
                                                                              }

                                                                              net.C_47rf var146;
                                                                              int var196;
                                                                              label1877: {
                                                                                 var146 = var100.method_46$4c10532da1(var119).method_48$ac4db64966();
                                                                                 net.C_43S var171 = (net.C_43S)var146.method_48$dbd570a038();
                                                                                 var196 = var171.field_41 + 5;
                                                                                 net.C_47rf var215 = var100.method_46$4c10532da1(var196).method_48$ac4db64966();
                                                                                 net.C_47rf var371 = var215;
                                                                                 int var398 = var26;
                                                                                 if (var4 < 0) {
                                                                                    if (var26 == 0) {
                                                                                       if (var215 == null) {
                                                                                          break label1877;
                                                                                       }

                                                                                       var371 = var215;
                                                                                    }

                                                                                    var398 = var196;
                                                                                 }

                                                                                 var371.method_48$d00df7729d(var398);
                                                                                 var103.add((Runnable)recovery$indy$flow$805(this, var215, var100));
                                                                                 var104.add(var146);
                                                                              }

                                                                              if (var102 != 0) {
                                                                                 continue;
                                                                              }

                                                                              var103.add((Runnable)recovery$indy$flow$808(this, var119, var196, var100));
                                                                              var104.add(var146);
                                                                              var10000 = var26;
                                                                              if (var4 >= 0) {
                                                                                 break;
                                                                              }

                                                                              if (var26 == 0) {
                                                                                 continue;
                                                                              }
                                                                           }

                                                                           var10000 = var102;
                                                                           break;
                                                                        }

                                                                        var392 = var26;
                                                                     }

                                                                     if (var4 > 0) {
                                                                        break label2469;
                                                                     }

                                                                     if (var392 != 0) {
                                                                        break label1887;
                                                                     }

                                                                     if (var10000 != 0) {
                                                                        for (Object recovered$element$223029 : var101) {
         int var124 = (int) recovered$element$223029;
                                                                           var10000 = var124;
                                                                           if (var26 != 0) {
                                                                              break label1887;
                                                                           }

                                                                           if (var124 >= 9) {
                                                                              net.C_47rf var147 = var100.method_46$4c10532da1(var124).method_48$ac4db64966();
                                                                              net.C_43S var172 = (net.C_43S)var147.method_48$dbd570a038();
                                                                              int var197 = var172.field_41 + 5;
                                                                              var103.add((Runnable)recovery$indy$flow$821(this, var124, var197, var100));
                                                                              var147.method_48$d00df7729d(var124);
                                                                              var104.add(var147);
                                                                           }
                                                                        }
                                                                     }
                                                                  }

                                                                  var10000 = ((int) (var103.isEmpty() ? 1 : 0));
                                                               }

                                                               var392 = var26;
                                                               break label2469;
                                                            }

                                                            var10000 = var107;
                                                            break label2562;
                                                         }

                                                         if (var392 != 0) {
                                                            break label2481;
                                                         }

                                                         if (var10000 == 0) {
                                                            break label2478;
                                                         }

                                                         var10000 = ((int) (this.field_43P ? 1 : 0));
                                                         var399 = var26;
                                                         if (var4 > 0) {
                                                            break label2560;
                                                         }

                                                         if (var26 != 0) {
                                                            var399 = var26;
                                                            break label2560;
                                                         }

                                                         if (!this.field_43P) {
                                                            break label2478;
                                                         }

                                                         net.minecraft.client.Minecraft var258 = field_43;
                                                         var354 = var258.field_42P.field_42X.method_41$ac4db64966();
                                                         break label2472;
                                                      }

                                                      var397 = var26;
                                                      break label2561;
                                                   }

                                                   while (true) {
                                                      if (var10000 >= var391) {
                                                         break label2478;
                                                      }

                                                      net.C_47rf var145 = var100.method_46$4c10532da1(var119).method_48$ac4db64966();
                                                      byte var369 = var26;
                                                      if (var4 <= 0) {
                                                         if (var26 != 0) {
                                                            break label2478;
                                                         }

                                                         var369 = var26;
                                                      }

                                                      if (var369 == 0) {
                                                         label1965: {
                                                            net.C_47rf var370 = var145;
                                                            if (var4 <= 0) {
                                                               if (var145 != null) {
                                                                  break label1965;
                                                               }

                                                               net.minecraft.client.Minecraft var261 = field_43;
                                                               var370 = var261.field_42P.field_42X.method_41$ac4db64966();
                                                            }

                                                            if (var370 != null && this.field_43P) {
                                                               break label2558;
                                                            }
                                                         }

                                                         var119++;
                                                      }

                                                      if (var26 != 0) {
                                                         break label2478;
                                                      }

                                                      var10000 = var119;
                                                      var391 = var100.field_46.size();
                                                   }
                                                }

                                                if (var354 == null) {
                                                   break label2478;
                                                }

                                                var119 = 9;

                                                while (true) {
                                                   if (var119 >= var100.field_46.size()) {
                                                      break label2478;
                                                   }

                                                   net.C_47rf var148 = var100.method_46$4c10532da1(var119).method_48$ac4db64966();
                                                   byte var372 = var26;
                                                   if (var4 <= 0) {
                                                      if (var26 != 0) {
                                                         break label2478;
                                                      }

                                                      var372 = var26;
                                                   }

                                                   if (var372 == 0) {
                                                      label1897: {
                                                         net.C_47rf var373 = var148;
                                                         if (var4 <= 0) {
                                                            if (var148 != null) {
                                                               break label1897;
                                                            }

                                                            net.minecraft.client.Minecraft var262 = field_43;
                                                            var373 = var262.field_42P.field_42X.method_41$ac4db64966();
                                                         }

                                                         if (var373 != null && this.field_43P) {
                                                            break label2558;
                                                         }
                                                      }

                                                      var119++;
                                                   }

                                                   if (var26 != 0) {
                                                      break label2478;
                                                   }
                                                }
                                             }

                                             if (var4 > 0) {
                                                break label2556;
                                             }

                                             if (var397 != 0) {
                                                break label2480;
                                             }

                                             if (var10000 != 0) {
                                                return true;
                                             }
                                             break label2477;
                                          }

                                          if (var4 > 0) {
                                             break label2557;
                                          }

                                          if (var399 != 0) {
                                             break label2481;
                                          }

                                          if (this.field_43P) {
                                             return true;
                                          }
                                          break label2478;
                                       }

                                       if (var4 > 0) {
                                          break label2483;
                                       }

                                       if (var402 != 0) {
                                          break label2482;
                                       }

                                       if (this.field_43P) {
                                          return true;
                                       }
                                       break label2479;
                                    }

                                    int var173 = var119;
                                    var103.add((Runnable)recovery$indy$flow$842(this, var173, var100));
                                    net.minecraft.client.Minecraft var265 = field_43;
                                    var104.add(var265.field_42P.field_42X.method_41$ac4db64966());
                                    break label2478;
                                 }

                                 var10000 = ((int) (var1 ? 1 : 0));
                                 break label2480;
                              }

                              var10000 = ((int) (var1 ? 1 : 0));
                              break label2481;
                           }

                           var10000 = ((int) (var1 ? 1 : 0));
                           break label2482;
                        }

                        var397 = var26;
                        break label2556;
                     }

                     var399 = var26;
                     break label2557;
                  }

                  var402 = var26;
               }

               if (var402 == 0) {
                  if (var10000 != 0) {
                     char var405 = (char)var13;
                     short var269 = (short)var15;
                     int var272 = var14;
                     char var275 = var405;
                     InvManager_47QL var278 = this;
                     var278.method_44$674b75e8e1(var275, var272, var269);
                     client.setting.BooleanSetting var281 = this.settingArmorInstant;
                     return var281.method_49$aae029aa0a();
                  }

                  net.C_474k var409 = this.field_44K;
                  client.setting.RangeSetting var414 = this.settingArmorDoubleClickRate;
                  client.setting.RangeSetting var417 = this.settingArmorFailRate;
                  client.setting.RangeSetting var420 = this.settingArmorMissClickRate;
                  client.setting.RangeSetting var423 = this.settingArmorMouseMoveRandom;
                  client.setting.BooleanSetting var284 = this.settingArmorInstant;
                  boolean var426 = var284.method_49$aae029aa0a();
                  client.setting.RangeSetting var287 = this.settingArmorCPS;
                  int var429 = var287.method_44$8abf5c6871();
                  int var432 = this.field_42;
                  long var290 = var16;
                  boolean var293 = true;
                  client.setting.NumberSetting var296 = this.settingArmorMaxMouseMoveSpeed;
                  int var299 = (int)var296.method_43$a8c520d5d1(var293, var290);
                  int var302 = var432;
                  int var305 = var429;
                  boolean var308 = var426;
                  net.C_47gG var311 = var100;
                  client.setting.RangeSetting var314 = var423;
                  client.setting.RangeSetting var317 = var420;
                  long var320 = var21;
                  client.setting.RangeSetting var323 = var417;
                  client.setting.RangeSetting var326 = var414;
                  net.C_474k var329 = var409;
                  java.util.ArrayList var332 = var104;
                  java.util.ArrayList var335 = var103;
                  InvManager_47QL var338 = this;
                  var10000 = ((int) (var338.method_46$b271fd46b4(var335, var332, var329, var326, var323, var320, var317, var314, var311, var308, var305, var302, var299) ? 1 : 0));
               }

               return (((var10000) & 1) != 0);
            }

            if (var399 == 0) {
               if (var10000 != 0) {
                  char var404 = (char)var13;
                  short var268 = (short)var15;
                  int var271 = var14;
                  char var274 = var404;
                  InvManager_47QL var277 = this;
                  var277.method_44$674b75e8e1(var274, var271, var268);
                  client.setting.BooleanSetting var280 = this.settingArmorInstant;
                  return var280.method_49$aae029aa0a();
               }

               net.C_474k var408 = this.field_44K;
               client.setting.RangeSetting var413 = this.settingArmorDoubleClickRate;
               client.setting.RangeSetting var416 = this.settingArmorFailRate;
               client.setting.RangeSetting var419 = this.settingArmorMissClickRate;
               client.setting.RangeSetting var422 = this.settingArmorMouseMoveRandom;
               client.setting.BooleanSetting var283 = this.settingArmorInstant;
               boolean var425 = var283.method_49$aae029aa0a();
               client.setting.RangeSetting var286 = this.settingArmorCPS;
               int var428 = var286.method_44$8abf5c6871();
               int var431 = this.field_42;
               long var289 = var16;
               boolean var292 = true;
               client.setting.NumberSetting var295 = this.settingArmorMaxMouseMoveSpeed;
               int var298 = (int)var295.method_43$a8c520d5d1(var292, var289);
               int var301 = var431;
               int var304 = var428;
               boolean var307 = var425;
               net.C_47gG var310 = var100;
               client.setting.RangeSetting var313 = var422;
               client.setting.RangeSetting var316 = var419;
               long var319 = var21;
               client.setting.RangeSetting var322 = var416;
               client.setting.RangeSetting var325 = var413;
               net.C_474k var328 = var408;
               java.util.ArrayList var331 = var104;
               java.util.ArrayList var334 = var103;
               InvManager_47QL var337 = this;
               var10000 = ((int) (var337.method_46$b271fd46b4(var334, var331, var328, var325, var322, var319, var316, var313, var310, var307, var304, var301, var298) ? 1 : 0));
            }

            return (((var10000) & 1) != 0);
         }

         if (var397 == 0) {
            if (var10000 != 0) {
               char var403 = (char)var13;
               short var267 = (short)var15;
               int var270 = var14;
               char var273 = var403;
               InvManager_47QL var276 = this;
               var276.method_44$674b75e8e1(var273, var270, var267);
               client.setting.BooleanSetting var279 = this.settingArmorInstant;
               return var279.method_49$aae029aa0a();
            }

            net.C_474k var407 = this.field_44K;
            client.setting.RangeSetting var412 = this.settingArmorDoubleClickRate;
            client.setting.RangeSetting var415 = this.settingArmorFailRate;
            client.setting.RangeSetting var418 = this.settingArmorMissClickRate;
            client.setting.RangeSetting var421 = this.settingArmorMouseMoveRandom;
            client.setting.BooleanSetting var282 = this.settingArmorInstant;
            boolean var424 = var282.method_49$aae029aa0a();
            client.setting.RangeSetting var285 = this.settingArmorCPS;
            int var427 = var285.method_44$8abf5c6871();
            int var430 = this.field_42;
            long var288 = var16;
            boolean var291 = true;
            client.setting.NumberSetting var294 = this.settingArmorMaxMouseMoveSpeed;
            int var297 = (int)var294.method_43$a8c520d5d1(var291, var288);
            int var300 = var430;
            int var303 = var427;
            boolean var306 = var424;
            net.C_47gG var309 = var100;
            client.setting.RangeSetting var312 = var421;
            client.setting.RangeSetting var315 = var418;
            long var318 = var21;
            client.setting.RangeSetting var321 = var415;
            client.setting.RangeSetting var324 = var412;
            net.C_474k var327 = var407;
            java.util.ArrayList var330 = var104;
            java.util.ArrayList var333 = var103;
            InvManager_47QL var336 = this;
            var10000 = ((int) (var336.method_46$b271fd46b4(var333, var330, var327, var324, var321, var318, var315, var312, var309, var306, var303, var300, var297) ? 1 : 0));
         }

         return (((var10000) & 1) != 0);
      } else {
         this.field_42 = var26;
         net.minecraft.client.Minecraft var44 = field_43;
         net.C_47gG var27 = var44.field_42P.field_429;
         client.setting.BooleanSetting var45 = this.settingOnlyInHotbar;
         int var10002 = var45.method_49$aae029aa0a() ? 36 : 9;
         client.setting.BooleanSetting var46 = this.settingIgnoreDurability;
         boolean var23 = var46.method_49$aae029aa0a();
         int var24 = var10002;
         net.C_47gG var25 = var27;
         short var10004 = (short)var20;
         boolean var47 = var23;
         short var48 = var10004;
         int var49 = var24;
         net.C_47gG var50 = var25;
         long var51 = var18;
         java.util.ArrayList var381 = net.C_47KL.method_48$83c66253fc(var51, var50, var49, var48, var47);
         long var53 = var9;
         client.setting.ModeSetting var55 = this.settingArmorSequence;
         String var56 = var55.method_46$5f9dc63072(var53);
         long var57 = var11;
         java.util.ArrayList var59 = var381;
         net.C_47gG var60 = var27;
         java.util.ArrayList var28 = net.C_47KL.method_43$b3a9e1cc19(var60, var59, var57, var56);
         long var61 = var9;
         client.setting.ModeSetting var63 = this.settingArmorSequence;
         byte var29 = ((byte) (var63.method_46$5f9dc63072(var61).equals((String)recovery$indy$flow$687(29007, 8359569582349172005L ^ var5)) ? 1 : 0));
         java.util.ArrayList var30 = new java.util.ArrayList();
         java.util.ArrayList var31 = new java.util.ArrayList();
         this.field_43P = (boolean)((((int) (var26)) & 1) != 0);
         java.util.Iterator var32 = var28.iterator();

         label2551: {
            while (true) {
               if (var32.hasNext()) {
                  int var33 = (Integer)var32.next();
                  var10000 = var33;
                  var382 = 9;
                  if (var4 > 0) {
                     break label2551;
                  }

                  if (var33 < 9) {
                     continue;
                  }

                  label2545: {
                     net.C_47rf var34 = var27.method_46$4c10532da1(var33).method_48$ac4db64966();
                     net.C_43S var35 = (net.C_43S)var34.method_48$dbd570a038();
                     int var36 = var35.field_41 + 5;
                     net.C_47rf var37 = var27.method_46$4c10532da1(var36).method_48$ac4db64966();
                     net.C_47rf var341 = var37;
                     int var383 = var26;
                     if (var4 < 0) {
                        if (var26 == 0) {
                           if (var37 == null) {
                              break label2545;
                           }

                           var341 = var37;
                        }

                        var383 = var36;
                     }

                     var341.method_48$d00df7729d(var383);
                     var30.add((Runnable)recovery$indy$flow$805(this, var37, var27));
                     var31.add(var34);
                  }

                  var10000 = var29;
                  if (var4 >= 0) {
                     break;
                  }

                  if (var29 == 0) {
                     continue;
                  }
               }

               var10000 = var29;
               break;
            }

            var382 = var26;
         }

         label2529:
         if (var4 <= 0) {
            if (var382 == 0) {
               if (var10000 != 0) {
                  var32 = var28.iterator();
                  if (var32.hasNext()) {
                     int var115 = (Integer)var32.next();
                     var10000 = var115;
                     var382 = var26;
                     break label2529;
                  }
               }

               var10000 = ((int) (var30.isEmpty() ? 1 : 0));
            }

            var382 = var26;
         }

         label2521: {
            label2520:
            if (var382 == 0) {
               label2518:
               if (var10000 != 0) {
                  var10000 = ((int) (this.field_43P ? 1 : 0));
                  var384 = var26;
                  if (var4 <= 0) {
                     if (var26 == 0) {
                        if (this.field_43P) {
                           net.minecraft.client.Minecraft var68 = field_43;
                           if (var68.field_42P.field_42X.method_41$ac4db64966() != null) {
                              byte var116 = 9;

                              while (var116 < var27.field_46.size()) {
                                 var27.method_46$4c10532da1(var116).method_48$ac4db64966();
                                 byte var342 = var26;
                                 if (var4 <= 0) {
                                    if (var26 != 0) {
                                       break label2518;
                                    }

                                    var342 = var26;
                                 }

                                 if (var342 != 0) {
                                    break label2518;
                                 }
                              }
                           }
                        }
                        break label2518;
                     }

                     var384 = var26;
                  }

                  if (var4 > 0) {
                     break label2521;
                  }

                  if (var384 != 0) {
                     break label2520;
                  }

                  if (this.field_43P) {
                     return true;
                  }
               }

               var10000 = ((int) (var1 ? 1 : 0));
            }

            var384 = var26;
         }

         if (var384 == 0) {
            if (var10000 != 0) {
               char var385 = (char)var13;
               short var71 = (short)var15;
               int var72 = var14;
               char var73 = var385;
               InvManager_47QL var74 = this;
               var74.method_44$674b75e8e1(var73, var72, var71);
               client.setting.BooleanSetting var75 = this.settingArmorInstant;
               return var75.method_49$aae029aa0a();
            }

            net.C_474k var10003 = this.field_44K;
            client.setting.RangeSetting var410 = this.settingArmorDoubleClickRate;
            client.setting.RangeSetting var10005 = this.settingArmorFailRate;
            client.setting.RangeSetting var10007 = this.settingArmorMissClickRate;
            client.setting.RangeSetting var10008 = this.settingArmorMouseMoveRandom;
            client.setting.BooleanSetting var76 = this.settingArmorInstant;
            boolean var10010 = var76.method_49$aae029aa0a();
            client.setting.RangeSetting var77 = this.settingArmorCPS;
            int var10011 = var77.method_44$8abf5c6871();
            int var10012 = this.field_42;
            long var78 = var16;
            boolean var80 = true;
            client.setting.NumberSetting var81 = this.settingArmorMaxMouseMoveSpeed;
            int var82 = (int)var81.method_43$a8c520d5d1(var80, var78);
            int var83 = var10012;
            int var84 = var10011;
            boolean var85 = var10010;
            net.C_47gG var86 = var27;
            client.setting.RangeSetting var87 = var10008;
            client.setting.RangeSetting var88 = var10007;
            long var89 = var21;
            client.setting.RangeSetting var91 = var10005;
            client.setting.RangeSetting var92 = var410;
            net.C_474k var93 = var10003;
            java.util.ArrayList var94 = var31;
            java.util.ArrayList var95 = var30;
            InvManager_47QL var96 = this;
            var10000 = ((int) (var96.method_46$b271fd46b4(var95, var94, var93, var92, var91, var89, var88, var87, var86, var85, var84, var83, var82) ? 1 : 0));
         }

         return (((var10000) & 1) != 0);
      }
   }












   private void method_44$8a933f4c45(long var1, int var3, int var4, C_47gG var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 129777059084644L;
      this.field_43P = recovery$indy$85(field_43, 1007149360729585048L, var1).field_42X.method_41$ac4db64966() == null;
      recovery$indy$86(this, var5, var6, var3, 1005113677771139475L, var1);
      recovery$indy$87(field_43, 1003718547466220227L, var1)
         .method_42$f0ddb617a2(var5.field_43, var3, var4, 0, recovery$indy$88(field_43, 1007149360729585048L, var1));
      recovery$indy$89(this, 1006393558814925318L, var1);
   }



   private void method_44$bc4e8defcb(long var1, net.C_47rf var3, net.C_47gG var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 110963982704715L;
      long var7 = var1 ^ 57880158064953L;
      long var10000 = 7320625090380096503L;
      boolean var9 = AirStuck_47Q4.method_419$aae029aa0a();
      net.C_47rf var129 = var3;
      if (var129 != null) {
         int var10003 = var3.method_46$8abf5c6871();
         long var10004 = 7327254600601043406L;
         int var12 = var10003;
         long var13 = var7;
         net.C_47gG var15 = var4;
         InvManager_47QL var16 = this;
         var16.method_46$587a1b8d2d(var15, var13, var12);
         long var10002 = 7322685842322898431L;
         long var17 = var5;
         client.setting.ModeSetting var19 = this.settingClickMode;
         String var10 = var19.method_46$5f9dc63072(var17);
         byte var11 = -1;
         int var183 = var10.hashCode();
         boolean var162 = var9;
         int var24 = var183;
         if (var162) {
            int var179 = var24;
            switch (var179) {
               case 0:
                  long var201 = 7327548042468563614L;
                  net.minecraft.client.Minecraft var131 = field_43;
                  net.C_40g var190 = var131.field_44K;
                  var10002 = 7324928518793403845L;
                  net.minecraft.client.Minecraft var132 = field_43;
                  int var202 = var132.field_42P.field_429.field_43;
                  int var207 = var3.method_46$8abf5c6871();
                  long var208 = 7324928518793403845L;
                  net.minecraft.client.Minecraft var133 = field_43;
                  var190.method_42$f0ddb617a2(var202, var207, 1, 4, var133.field_42P);
                  long var210;
                  int var181 = (var210 = var1 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                  if (var181 >= 0) {
                     var10000 = 7324007650875169687L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     long var211;
                     int var182 = (var211 = var1 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                     if (var182 > 0) {
                        var10000 = 7324007650875169687L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        var201 = 7325719628228119131L;
                        InvManager_47QL var140 = this;
                        var140.method_43$da8c82d5d4();
                     }
                  }
                  break;
               case 1:
                  var10000 = 7324007650875169687L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  long var209;
                  int var180 = (var209 = var1 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                  if (var180 > 0) {
                     var10000 = 7324007650875169687L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     long var200 = 7325719628228119131L;
                     InvManager_47QL var139 = this;
                     var139.method_43$da8c82d5d4();
                  }
                  break;
               case 2:
                  var10000 = 7324007650875169687L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  long var199 = 7325719628228119131L;
                  InvManager_47QL var138 = this;
                  var138.method_43$da8c82d5d4();
                  break;
               default:
                  long var198 = 7325719628228119131L;
                  InvManager_47QL var137 = this;
                  var137.method_43$da8c82d5d4();
            }
         } else {
            var24 = var24;
            var24 = var24;
            int var163 = var24;
            switch (var163) {
               case 63955982:
                  boolean var151 = var10.equals("Basic");
                  var151 = var151;
                  boolean var169 = var151;
                  label165:
                  if (var169) {
                     var11 = 0;
                     long var213;
                     int var170 = (var213 = var1 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                     var151 = var9;
                     if (var170 >= 0) {
                        var151 = var151;
                        var151 = var151;
                        boolean var171 = var151;
                        if (!var171) {
                           break label165;
                        }

                        var151 = var10.equals("Other");
                     }

                     var151 = var151;
                     boolean var172 = var151;
                     label159:
                     if (var172) {
                        var11 = 1;
                        long var214;
                        int var173 = (var214 = var1 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                        var151 = var9;
                        if (var173 > 0) {
                           var151 = var151;
                           var151 = var151;
                           boolean var174 = var151;
                           if (!var174) {
                              break label159;
                           }

                           var151 = var10.equals("Exploit");
                        }

                        var151 = var151;
                        boolean var175 = var151;
                        if (var175) {
                           var11 = 2;
                        }
                     }
                  }
                  break;
               case 76517104:
                  boolean var145 = var10.equals("Other");
                  var145 = var145;
                  boolean var165 = var145;
                  label153:
                  if (var165) {
                     var11 = 1;
                     long var212;
                     int var166 = (var212 = var1 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                     var145 = var9;
                     if (var166 > 0) {
                        var145 = var145;
                        var145 = var145;
                        boolean var167 = var145;
                        if (!var167) {
                           break label153;
                        }

                        var145 = var10.equals("Exploit");
                     }

                     var145 = var145;
                     boolean var168 = var145;
                     if (var168) {
                        var11 = 2;
                     }
                  }
                  break;
               case 355504491:
                  boolean var143 = var10.equals("Exploit");
                  var143 = var143;
                  boolean var164 = var143;
                  if (var164) {
                     var11 = 2;
                  }
            }

            byte var161 = var11;
            byte var176 = var161;
            switch (var176) {
               case 0:
                  long var195 = 7327548042468563614L;
                  net.minecraft.client.Minecraft var20 = field_43;
                  net.C_40g var186 = var20.field_44K;
                  var10002 = 7324928518793403845L;
                  net.minecraft.client.Minecraft var21 = field_43;
                  int var196 = var21.field_42P.field_429.field_43;
                  int var205 = var3.method_46$8abf5c6871();
                  long var10006 = 7324928518793403845L;
                  net.minecraft.client.Minecraft var22 = field_43;
                  var186.method_42$f0ddb617a2(var196, var205, 1, 4, var22.field_42P);
                  long var216;
                  int var178 = (var216 = var1 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                  if (var178 >= 0) {
                     var195 = 7325719628228119131L;
                     InvManager_47QL var136 = this;
                     var136.method_43$da8c82d5d4();
                  }
                  break;
               case 1:
                  var10000 = 7324007650875169687L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  long var215;
                  int var177 = (var215 = var1 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                  if (var177 > 0) {
                     long var194 = 7325719628228119131L;
                     InvManager_47QL var135 = this;
                     var135.method_43$da8c82d5d4();
                  }
                  break;
               case 2:
                  var10000 = 7324007650875169687L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  long var193 = 7325719628228119131L;
                  InvManager_47QL var134 = this;
                  var134.method_43$da8c82d5d4();
                  break;
               default:
                  long var10001 = 7325719628228119131L;
                  InvManager_47QL var23 = this;
                  var23.method_43$da8c82d5d4();
            }
         }
      }
   }




   private void method_48$765f95ffe0(int var1, int var2, C_47gG var3) {
      long var4 = a ^ 33852467950172L;
      long var6 = var4 ^ 3681245591793L;
      long var10005 = 911759705115471104L;
      C_47gG var8 = var3;
      int var9 = var2;
      long var10 = var6;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_49$dcf4412afe(var12, var10, var9, var8);
   }



   public boolean method_48$b4bb6d006d(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 130891196303078L;
      long var10001 = var4 ^ 18106448015546L;
      int var8 = (int)((var4 ^ 18106448015546L) >>> 32);
      int var9 = (int)((var4 ^ 18106448015546L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var4 ^ 119231695538307L;
      recovery$indy$91(this, var6, recovery$indy$90(this.settingMode, var11, 961359516114244919L, var4), 967342756578389544L, var4);
      boolean var13 = recovery$indy$92(this, var8, var9, var10, 967448069990351553L, var4);
      recovery$indy$93(this.field_44T, 960052571743675196L, var4);
      recovery$indy$94(this.field_44C, 960052571743675196L, var4);
      recovery$indy$95(this.field_440, 960052571743675196L, var4);
      recovery$indy$96(this.field_443, 960052571743675196L, var4);
      return var13;
   }



   private void method_48$cf3f4a6978(long var1, C_47gG var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 31920468800681L;
      long var10000 = -1061636757561418166L;
      boolean var6 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -1061400018591774425L;
      Minecraft var7 = field_43;
      if (var7.field_42P.method_46$f8ba6cbd86() != null) {
         label41: {
            long var10002 = -1045646440631523043L;
            long var8 = var4;
            ModeSetting var10 = this.settingMode;
            boolean var17 = var10.method_46$5f9dc63072(var8).equals("SpoofInv");
            if (var6) {
               if (var17) {
                  break label41;
               }

               var10002 = -1045646440631523043L;
               long var11 = var4;
               ModeSetting var13 = this.settingMode;
               var17 = var13.method_46$5f9dc63072(var11).equals("SpoofInvOther");
            }

            if (!var17) {
               return;
            }
         }

         Minecraft var18 = field_43;
         if (var6) {
            var10001 = -1046608196792793781L;
            long var22 = var1;
            if (var1 > 0L) {
               Minecraft var14 = field_43;
               if (var14.field_44m != null) {
                  return;
               }

               var18 = field_43;
               var10001 = -1061400018591774425L;
               var22 = var1;
            }

            recovery$indy$97(var18, var10001, var22).field_49m.method_45$631790539f(new C_47dz(var3.field_43));
            var18 = field_43;
         }

         var10001 = -1061400018591774425L;
         Minecraft var15 = var18;
         var15.field_42P.method_40$7480b345ab(null);
      }
   }



   private void method_49$537c8d9634(int var1, short var2, char var3) {
      net.C_473X var9;
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 64292544757001L;
      byte var8 = (byte) ((recovery$indy$98(-7087241240951710774L, var4)) ? 1 : 0);
      boolean var10000 = recovery$indy$100(this.field_44T, var6, recovery$indy$99(this.settingArmorCPSRecalculate, -7087757167707813795L, var4), -7086833008299249724L, var4);
      if (var8 == 0) {
         if (var10000) {
            recovery$indy$101(this.settingArmorCPS, -7091035930307840652L, var4);
            recovery$indy$102(this.settingArmorCPSRecalculate, -7091035930307840652L, var4);
            recovery$indy$103(this.field_44T, -7093225357068253679L, var4);
         }

         var10000 = recovery$indy$105(this.field_44C, var6, recovery$indy$104(this.settingSortCPSRecalculate, -7087757167707813795L, var4), -7086833008299249724L, var4);
      }

      int var10001 = var8;
      if (var3 >= 0) {
         if (var8 == 0) {
            if (var10000) {
               recovery$indy$106(this.settingSortCPS, -7091035930307840652L, var4);
               recovery$indy$107(this.settingSortCPSRecalculate, -7091035930307840652L, var4);
               recovery$indy$108(this.field_44C, -7093225357068253679L, var4);
            }

            var10000 = recovery$indy$110(this.field_440, var6, recovery$indy$109(this.settingCleanCPSRecalculate, -7087757167707813795L, var4), -7086833008299249724L, var4);
         }

         var10001 = var8;
      }

      label61: {
         if (var10001 == 0) {
            if (var10000) {
               recovery$indy$111(this.settingCleanCPS, -7091035930307840652L, var4);
               recovery$indy$112(this.settingCleanCPSRecalculate, -7091035930307840652L, var4);
               recovery$indy$113(this.field_440, -7093225357068253679L, var4);
            }

            var9 = this.field_443;
            var10001 = var8;
            if (var1 >= 0) {
               if (var8 != 0) {
                  break label61;
               }

               var10001 = recovery$indy$114(this.settingCraftCPSRecalculate, -7087757167707813795L, var4);
            }

            var10000 = recovery$indy$115(this.field_443, var6, var10001, -7086833008299249724L, var4);
         }

         if (!var10000) {
            return;
         }

         recovery$indy$116(this.settingCraftCPS, -7091035930307840652L, var4);
         recovery$indy$117(this.settingCraftCPSRecalculate, -7091035930307840652L, var4);
         var9 = this.field_443;
      }

      recovery$indy$118(var9, -7093225357068253679L, var4);
   }




    private int method_49$55602b8d28(short upperKey, int middleKey, char lowerKey) {
        long key = (((long) upperKey << 48) | (((long) middleKey << 32) >>> 16) | (((long) lowerKey << 48) >>> 48)) ^ recovery$indy$flow$1012();
        long actionKey = key ^ 61822738792039L;
        long inventoryKey = key ^ 62301159351625L;
        Object inventory = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$1013())))))))))).field_42P)))))).field_429));
        Object inventorySetting = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingIgnoreDurability))))))));
        boolean inventoryOption = recovery$indy$flow$1019(inventorySetting);
        Object armorSlots = recovery$indy$flow$1021(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(inventory)))))), inventoryKey, 36, inventoryOption);
        java.util.ArrayList candidates = new java.util.ArrayList();
        boolean active = recovery$indy$flow$1024();
        Object iterator = recovery$indy$flow$1025(armorSlots);
        boolean ready = false;
        boolean comparePrevious = true;
        while (recovery$indy$flow$1026(iterator)) {
            int slot = recovery$indy$flow$1029(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$1027(iterator))))))));
            if (lowerKey == 0 || !active) {
                ready = slot != 0;
                comparePrevious = false;
                break;
            }
            if (slot < 36) continue;
            Object stack = recovery$indy$flow$1031(recovery$indy$flow$1030(inventory, slot));
            Object armor = ((java.lang.Object)(((net.C_43S) (((java.lang.Object)(recovery$indy$flow$1032(stack)))))));
            int equippedSlot = recovery$indy$flow$1034(armor) + 5;
            Object equipped = recovery$indy$flow$1036(recovery$indy$flow$1035(inventory, equippedSlot));
            if (equipped != null) {
                Object replacementSetting = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingQSG))))))));
                if (!recovery$indy$flow$1039(replacementSetting)) continue;
            }
            recovery$indy$flow$1041(candidates, recovery$indy$flow$1040(slot - 36));
        }
        if (comparePrevious) ready = recovery$indy$flow$1043(candidates, ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43h)));
        if (middleKey > 0 && active) {
            if (!ready) {
                Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$1044())))))))))).field_42P));
                recovery$indy$flow$1048(this, recovery$indy$flow$1047(player));
                recovery$indy$flow$1050(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43h)));
                recovery$indy$flow$1052(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43h)), candidates);
            }
            ready = recovery$indy$flow$1054(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))))), actionKey);
        }
        if (!active) {
            if (ready) return -1;
            return recovery$indy$flow$1068(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$1066(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)), 0))))))));
        }
        if (ready && !recovery$indy$flow$1055(this)) {
            if (!recovery$indy$flow$1057(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)), candidates)) {
                recovery$indy$flow$1059(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)));
                recovery$indy$flow$1061(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)), candidates);
                recovery$indy$flow$1062(this, 0);
            }
        }
        if (recovery$indy$flow$1064(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)))) return -1;
        return recovery$indy$flow$1068(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$1066(((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_43W)), 0))))))));
    }





   private void method_49$dcf4412afe(int var1, long var2, int var4, C_47gG var5) {
      byte var10;
      int var30;
      var2 = a ^ var2;
      long var6 = var2 ^ 10049524371289L;
      long var8 = var2 ^ 98321478975019L;
      long var10004 = 5385688280416988892L;
      int var13 = var1;
      long var14 = var8;
      C_47gG var16 = var5;
      InvManager_47QL var17 = this;
      var17.method_46$587a1b8d2d(var16, var14, var13);
      long var10000 = 5383027328432301498L;
      byte var29 = (byte) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
      long var10003 = 5371961140251267821L;
      long var18 = var6;
      ModeSetting var20 = this.settingClickMode;
      String var11 = var20.method_46$5f9dc63072(var18);
      byte var12 = -1;
      var10 = var29;
      var30 = var11.hashCode();
      label93:
      if (var10 != 0) {
         label96: {
            label90: {
               label97: {
                  switch (var30) {
                     case 63955982:
                        var30 = (int) ((var11.equals("Basic")) ? 1 : 0);
                        if (var10 == 0) {
                           break label93;
                        }

                        if (var30 == 0) {
                           break label96;
                        }

                        var12 = 0;
                        var30 = var10;
                        if (var2 <= 0L) {
                           break;
                        }

                        if (var10 != 0) {
                           break label96;
                        }
                     case 76517104:
                        var30 = (int) ((var11.equals("Other")) ? 1 : 0);
                        break;
                     case 355504491:
                        break label97;
                     default:
                        break label96;
                  }

                  if (var10 == 0) {
                     break label93;
                  }

                  if (var30 == 0) {
                     break label96;
                  }

                  var12 = 1;
                  var30 = var10;
                  if (var2 < 0L) {
                     break label90;
                  }

                  if (var10 != 0) {
                     break label96;
                  }
               }

               var30 = (int) ((var11.equals("Exploit")) ? 1 : 0);
            }

            if (var10 == 0) {
               break label93;
            }

            if (var30 != 0) {
               var12 = 2;
            }
         }

         var30 = var12;
      }

      switch (var30) {
         case 0:
            long var10001 = 5378076233880024460L;
            Minecraft var21 = field_43;
            long var10002 = 5383264342074340055L;
            Minecraft var22 = field_43;
            long var10006 = 5383264342074340055L;
            Minecraft var23 = field_43;
            var21.field_44K.method_42$f0ddb617a2(var22.field_42P.field_429.field_43, var1, 0, 1, var23.field_42P);
            if (var2 <= 0L) {
               return;
            }

            if (var10 != 0) {
               break;
            }
         case 1:
            long var31 = 5383622275033035909L;
            Client.method_44$fbc0c0be91().getClass();
            long var33 = 5378076233880024460L;
            Minecraft var24 = field_43;
            long var35 = 5383264342074340055L;
            Minecraft var25 = field_43;
            long var36 = 5383264342074340055L;
            Minecraft var26 = field_43;
            var24.field_44K.method_42$f0ddb617a2(var25.field_42P.field_429.field_43, var1, 0, 1, var26.field_42P);
            if (var2 < 0L) {
               return;
            }

            if (var10 != 0) {
               break;
            }
         case 2:
            long var32 = 5383622275033035909L;
            Client.method_44$fbc0c0be91().getClass();
      }

      long var34 = 5384126988551578953L;
      InvManager_47QL var27 = this;
      var27.method_43$da8c82d5d4();
   }




   private boolean method_49$800bd538b0(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 97094489474874L;
      int var4 = (int)((var2 ^ 97094489474874L) >>> 48);
      int var5 = (int)((var2 ^ 97094489474874L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 43151454556026L;
      long var9 = var2 ^ 113760523296730L;
      long var10000 = 6171987379029136328L;
      boolean var11 = AirStuck_47Q4.method_419$aae029aa0a();
      var10001 = 6170119679987965136L;
      BooleanSetting var13 = this.settingCraftInstant;
      int var36 = (int) ((var13.method_49$aae029aa0a()) ? 1 : 0);
      if (!var11) {
         if (var36 != 0) {
            return false;
         }

         C_474k var37 = this.field_44Q;
         long var10002 = 6170345037439090783L;
         RangeSetting var14 = this.settingCraftCPS;
         int var40 = var14.method_44$8abf5c6871();
         long var10003 = 6171768532387473900L;
         long var15 = var9;
         int var17 = var40;
         C_474k var18 = var37;
         var36 = var18.method_44$7ee0e11626(var17, var15);
      }

      int var12 = var36;
      int var38 = var12;
      boolean var41 = var11;
      if (var2 >= 0L) {
         if (!var11) {
            if (var12 <= 0) {
               return true;
            }

            int var42 = this.field_43f;
            long var10005 = 6168818351801275426L;
            long var19 = var7;
            boolean var21 = true;
            NumberSetting var22 = this.settingCraftMaxMouseMoveSpeed;
            int var43 = (int)var22.method_43$a8c520d5d1(var21, var19);
            char var10004 = (char)var4;
            var10005 = 6167688228466601466L;
            Minecraft var23 = field_43;
            long var10010 = 6169159450937652249L;
            int var24 = var6;
            int var25 = var5;
            RangeSetting var26 = this.settingCraftMouseMoveRandom;
            int var27 = var12;
            int var28 = var1;
            C_47gG var29 = var23.field_42P.field_429;
            int var30 = var43;
            char var31 = var10004;
            int var32 = var42;
            InvManager_47QL var33 = this;
            var12 = var33.method_49$7d68d9dd49(var32, var31, var30, var29, var28, var27, var26, var25, var24);
            var38 = var12;
         }

         var41 = var11;
      }

      if (!var41) {
         var38 = var38 <= 0 ? 1 : 0;
      }

      return var38 != 0;
   }




   private ArrayList method_49$4c49186100(C_47gG var1, long var2) {
      java.util.ArrayList var250;
      java.util.ArrayList var277;
      net.C_47gG var262;
      java.util.ArrayList var271;
      java.util.ArrayList var296;
      byte var39;
      ArrayList var40;
      ArrayList var41;
      ArrayList var46;
      int var47;
      int var256;
      int var312;
      label797: {
         long var18;
         long var30;
         label798: {
            int var45;
            ArrayList var192;
            label851: {
               long var16;
               label800: {
                  int var27;
                  int var28;
                  int var29;
                  label801: {
                     long var4;
                     long var20;
                     int var184;
                     label802: {
                        var2 = a ^ var2;
                        var4 = var2 ^ 17717383832536L;
                        long var6 = var2 ^ 119980146870217L;
                        long var8 = var2 ^ 25654388809643L;
                        long var10 = var2 ^ 111752454652222L;
                        long var12 = var2 ^ 107316252495890L;
                        long var14 = var2 ^ 49051204733742L;
                        var16 = var2 ^ 77096507122938L;
                        var18 = var2 ^ 129995515200416L;
                        var20 = var2 ^ 84958753239706L;
                        long var22 = var2 ^ 134867806893026L;
                        long var10001 = var2 ^ 119101466543139L;
                        int var24 = (int)((var2 ^ 119101466543139L) >>> 48);
                        int var25 = (int)((var2 ^ 119101466543139L) << 16 >>> 32);
                        int var26 = (int)(var10001 << 48 >>> 48);
                        long var303 = var2 ^ 44285606114288L;
                        var27 = (int)((var2 ^ 44285606114288L) >>> 48);
                        var28 = (int)((var2 ^ 44285606114288L) << 16 >>> 48);
                        var29 = (int)(var303 << 32 >>> 32);
                        var30 = var2 ^ 126900432833414L;
                        long var32 = var2 ^ 10854469181180L;
                        long var34 = var2 ^ 16006919056010L;
                        int var36 = (int)((var2 ^ 90993484170394L) >>> 48);
                        long var37 = (var2 ^ 90993484170394L) << 16 >>> 16;
                        long var10003 = -4043980002694016710L;
                        long var49 = var22;
                        byte var51 = 5;
                        C_47gG var52 = var1;
                        var40 = C_47KL.method_43$1bb508394f(var52, var51, var49);
                        long var10000 = -4042793234716825365L;
                        int var244 = (int) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
                        long var10006 = -4045120159921025364L;
                        BooleanSetting var53 = this.settingIgnoreDurability;
                        boolean var10005 = var53.method_49$aae029aa0a();
                        var10006 = -4042923225826440902L;
                        boolean var54 = var10005;
                        byte var55 = 5;
                        long var56 = var10;
                        C_47gG var58 = var1;
                        var40.addAll(C_47KL.method_44$d53d172ad2(var58, var56, var55, var54));
                        var39 = (byte)var244;
                        ArrayList var245 = var40;
                        if (var39 != 0) {
                           long var10004 = -4044542201590784862L;
                           long var59 = var6;
                           byte var61 = 5;
                           C_47gG var62 = var1;
                           var40.addAll(C_47KL.method_45e$1bb508394f(var62, var61, var59));
                           long var304 = -4045822640398415558L;
                           C_47Oh var63 = C_47Oh.SORT;
                           if (C_47Oh.method_48$a2948d1222(var63)) {
                              var10003 = -4042659437546393756L;
                              String var64 = "Sword";
                              long var65 = var34;
                              InvManager_47QL var67 = this;
                              var41 = var67.method_40$0939088f00(var65, var64);
                              ArrayList var246 = var41;
                              if (var39 != 0) {
                                 if (var41.isEmpty()) {
                                    var10003 = -4040160281029076067L;
                                    byte var68 = 5;
                                    long var69 = var32;
                                    C_47gG var71 = var1;
                                    var246 = C_47KL.method_46$fbb0b162a3(var71, var69, var68);
                                 } else {
                                    var10004 = -4045558420790103988L;
                                    ArrayList var72 = var41;
                                    byte var73 = 5;
                                    long var74 = var8;
                                    C_47gG var76 = var1;
                                    var246 = C_47KL.method_44$add7f5fc01(var76, var74, var73, var72);
                                 }
                              }

                              ArrayList var42 = var246;
                              int var43 = 0;

                              while (var43 < Math.max(1, var41.size())) {
                                 var244 = var43;
                                 if (var2 > 0L) {
                                    if (var39 != 0) {
                                       var312 = var42.size();
                                       if (var39 == 0) {
                                          while (true) {
                                             if (var244 >= var312) {
                                                break label801;
                                             }

                                             C_42a var248 = (C_42a)var42.get(var43);
                                             long var307 = -4041721199688079494L;
                                             C_42a var137 = var248;
                                             int var44 = (Integer)var137.method_45$0502b11602();
                                             byte var249 = var39;
                                             if (var2 > 0L) {
                                                if (var39 != 0) {
                                                   var250 = var40;
                                                   var312 = var39;
                                                   if (var2 > 0L) {
                                                      if (var39 == 0) {
                                                         break label800;
                                                      }

                                                      var312 = var44;
                                                   }

                                                   boolean var251 = var40.contains(var312);
                                                   if (var2 > 0L) {
                                                      if (!var251) {
                                                         var41.add(var44);
                                                      }
                                                   }

                                                   var43++;
                                                   var249 = var39;
                                                } else {
                                                   var249 = var39;
                                                }
                                             }

                                             if (var249 == 0) {
                                                break label801;
                                             }

                                             var244 = var43;
                                             var312 = var42.size();
                                          }
                                       }

                                       if (var43 >= var312) {
                                          break;
                                       }

                                       C_42a var306 = (C_42a)var42.get(var43);
                                       long var10002 = -4041721199688079494L;
                                       C_42a var77 = var306;
                                       var40.add(var77.method_45$0502b11602());
                                       var43++;
                                       var244 = var39;
                                    } else {
                                       var43++;
                                       var244 = var39;
                                    }
                                 }

                                 if (var244 == 0) {
                                    break;
                                 }
                              }

                              var10003 = -4042659437546393756L;
                              String var78 = "Bow";
                              long var79 = var34;
                              InvManager_47QL var81 = this;
                              ArrayList var187 = var81.method_40$0939088f00(var79, var78);
                              ArrayList var252 = var187;
                              if (var2 < 0L) {
                                 label557:
                                 if (var39 != 0) {
                                    label560: {
                                       double var286 = var187.size();
                                       var10003 = -4040363834978773754L;
                                       long var212 = var30;
                                       NumberSetting var213 = this.settingFoodStackLimit;
                                       double var384;
                                       var244 = (var384 = var286 - var213.method_44$474dfaa627(var212)) == 0.0 ? 0 : (var384 < 0.0 ? -1 : 1);
                                       int var196;
                                       if (var2 >= 0L) {
                                          if (var244 <= 0) {
                                             break label560;
                                          }

                                          long var342 = -4040363834978773754L;
                                          long var214 = var30;
                                          NumberSetting var215 = this.settingFoodStackLimit;
                                          var196 = (int)var215.method_44$474dfaa627(var214);
                                       } else {
                                          var196 = var244;
                                       }

                                       while (var196 < var187.size()) {
                                          C_42a var288 = (C_42a)var187.get(var196);
                                          long var326 = -4041721199688079494L;
                                          C_42a var216 = var288;
                                          var45 = (Integer)var216.method_45$0502b11602();
                                          byte var289 = var39;
                                          if (var2 >= 0L) {
                                             if (var39 != 0) {
                                                var252 = var40;
                                                var312 = var39;
                                                if (var2 > 0L) {
                                                   if (var39 == 0) {
                                                      break label557;
                                                   }

                                                   var312 = var45;
                                                }

                                                boolean var290 = var40.contains(var312);
                                                if (var2 >= 0L) {
                                                   if (!var290) {
                                                      var41.add(var45);
                                                   }
                                                }

                                                var196++;
                                                var289 = var39;
                                             } else {
                                                var289 = var39;
                                             }
                                          }

                                          if (var289 == 0) {
                                             break;
                                          }
                                       }
                                    }

                                    var10003 = -4043371555386883366L;
                                    byte var217 = 9;
                                    C_47gG var218 = var1;
                                    long var219 = var16;
                                    var252 = C_47KL.method_41$38ad863a40(var219, var218, var217);
                                 }

                                 var192 = var252;
                                 var277 = var192;
                                 if (var39 == 0) {
                                    break label798;
                                 }

                                 double var291 = var192.size();
                                 var10003 = -4040363834978773754L;
                                 long var220 = var30;
                                 NumberSetting var221 = this.settingThrowablesLimit;
                                 double var385;
                                 var244 = (var385 = var291 - var221.method_44$474dfaa627(var220)) == 0.0 ? 0 : (var385 < 0.0 ? -1 : 1);
                                 if (var2 > 0L) {
                                    if (var244 <= 0) {
                                       C_43r[] var368 = new C_43r[]{C_42R.field_45M};
                                       var10004 = -4045337273527461296L;
                                       C_43r[] var224 = var368;
                                       byte var226 = 9;
                                       long var228 = var18;
                                       C_47gG var230 = var1;
                                       var277 = C_47KL.method_42$fe7c24f1a0(var230, var228, var226, var224);
                                       break label798;
                                    }

                                    long var343 = -4040363834978773754L;
                                    long var222 = var30;
                                    NumberSetting var223 = this.settingThrowablesLimit;
                                    var45 = (int)var223.method_44$474dfaa627(var222);
                                 } else {
                                    var45 = var244;
                                 }

                                 var256 = var45;
                                 var312 = var192.size();
                                 break label851;
                              }

                              label387:
                              if (var39 != 0) {
                                 char var253 = ((char) (var187.isEmpty() ? 1 : 0));
                                 if (var2 >= 0L) {
                                    if (var253 != 0) {
                                       var10003 = -4042743970704186970L;
                                       byte var82 = 5;
                                       long var83 = var14;
                                       C_47gG var85 = var1;
                                       var252 = C_47KL.method_44$fbb0b162a3(var85, var83, var82);
                                       break label387;
                                    }

                                    var253 = (char)var24;
                                 }

                                 var10006 = -4042606141748634669L;
                                 ArrayList var86 = var187;
                                 int var87 = var26;
                                 int var88 = var25;
                                 byte var89 = 5;
                                 C_47gG var90 = var1;
                                 char var91 = var253;
                                 var252 = C_47KL.method_49$87d2923e43(var91, var90, var89, var88, var87, var86);
                              }

                              var192 = var252;
                              var45 = 0;

                              while (var45 < Math.max(1, var187.size())) {
                                 var256 = var45;
                                 if (var2 > 0L) {
                                    if (var39 != 0) {
                                       var312 = var192.size();
                                       if (var39 == 0) {
                                          break label851;
                                       }

                                       if (var45 >= var312) {
                                          break;
                                       }

                                       C_42a var310 = (C_42a)var192.get(var45);
                                       long var332 = -4041721199688079494L;
                                       C_42a var92 = var310;
                                       var40.add(var92.method_45$0502b11602());
                                       var45++;
                                       var256 = var39;
                                    } else {
                                       var45++;
                                       var256 = var39;
                                    }
                                 }

                                 if (var256 == 0) {
                                    break;
                                 }
                              }

                              var10003 = -4042659437546393756L;
                              String var93 = "Rod";
                              long var94 = var34;
                              InvManager_47QL var96 = this;
                              ArrayList var197 = var96.method_40$0939088f00(var94, var93);
                              ArrayList var255 = var197;
                              if (var2 < 0L) {
                                 label451:
                                 if (var39 != 0) {
                                    label818: {
                                       double var280 = var197.size();
                                       var10003 = -4040363834978773754L;
                                       long var166 = var30;
                                       NumberSetting var168 = this.settingLavaBucketLimit;
                                       double var386;
                                       var244 = (var386 = var280 - var168.method_44$474dfaa627(var166)) == 0.0 ? 0 : (var386 < 0.0 ? -1 : 1);
                                       if (var2 >= 0L) {
                                          if (var244 <= 0) {
                                             break label818;
                                          }

                                          long var340 = -4040363834978773754L;
                                          long var169 = var30;
                                          NumberSetting var171 = this.settingLavaBucketLimit;
                                          var244 = (int)var171.method_44$474dfaa627(var169);
                                       }

                                       int var201 = var244;

                                       while (var201 < var197.size()) {
                                          var47 = (Integer)var197.get(var201);
                                          byte var282 = var39;
                                          if (var2 > 0L) {
                                             if (var39 != 0) {
                                                var255 = var40;
                                                var312 = var39;
                                                if (var2 >= 0L) {
                                                   if (var39 == 0) {
                                                      break label451;
                                                   }

                                                   var312 = var47;
                                                }

                                                if (var2 > 0L && !var40.contains(var312)) {
                                                   var41.add(var47);
                                                }

                                                var201++;
                                             }

                                             var282 = var39;
                                          }

                                          if (var282 == 0) {
                                             break;
                                          }
                                       }
                                    }

                                    C_43r[] var363 = new C_43r[]{C_42R.field_457};
                                    var10004 = -4045337273527461296L;
                                    C_43r[] var172 = var363;
                                    byte var173 = 9;
                                    long var174 = var18;
                                    C_47gG var176 = var1;
                                    var255 = C_47KL.method_42$fe7c24f1a0(var176, var174, var173, var172);
                                 }

                                 var46 = var255;
                                 if (var39 == 0) {
                                    return var46;
                                 }

                                 double var284 = var46.size();
                                 var10003 = -4040363834978773754L;
                                 long var177 = var30;
                                 NumberSetting var179 = this.settingWaterBucketLimit;
                                 double var387;
                                 var244 = (var387 = var284 - var179.method_44$474dfaa627(var177)) == 0.0 ? 0 : (var387 < 0.0 ? -1 : 1);
                                 if (var2 >= 0L) {
                                    if (var244 <= 0) {
                                       return var41;
                                    }

                                    long var341 = -4040363834978773754L;
                                    long var180 = var30;
                                    NumberSetting var182 = this.settingWaterBucketLimit;
                                    var244 = (int)var182.method_44$474dfaa627(var180);
                                 }

                                 var47 = var244;
                                 var256 = var47;
                                 var312 = var46.size();
                                 break label797;
                              }

                              if (var39 != 0) {
                                 if (var197.isEmpty()) {
                                    var10003 = -4042024621175397509L;
                                    byte var97 = 5;
                                    long var98 = var12;
                                    C_47gG var100 = var1;
                                    var255 = C_47KL.method_47$fbb0b162a3(var100, var98, var97);
                                 } else {
                                    short var311 = (short)var36;
                                    long var379 = -4040085617869880369L;
                                    ArrayList var101 = var197;
                                    byte var102 = 5;
                                    long var103 = var37;
                                    short var105 = var311;
                                    C_47gG var106 = var1;
                                    var255 = C_47KL.method_42$a20231347a(var106, var105, var103, var102, var101);
                                 }
                              }

                              var46 = var255;
                              var47 = 0;

                              label757:
                              while (true) {
                                 if (var47 < Math.max(1, var197.size())) {
                                    var256 = var47;
                                 } else {
                                    var256 = var39;
                                    if (var2 >= 0L) {
                                       if (var39 != 0) {
                                          var41 = ((java.util.ArrayList) (new ArrayList()));
                                          var184 = 9;
                                          break label802;
                                       }
                                       break;
                                    }
                                 }

                                 do {
                                    if (var2 > 0L) {
                                       if (var39 != 0) {
                                          var312 = var46.size();
                                          if (var39 == 0) {
                                             break label797;
                                          }

                                          if (var256 < var312) {
                                             C_42a var313 = (C_42a)var46.get(var47);
                                             long var333 = -4041721199688079494L;
                                             C_42a var107 = var313;
                                             var40.add(var107.method_45$0502b11602());
                                             var47++;
                                             if (var39 != 0) {
                                                continue label757;
                                             }
                                          }
                                       } else {
                                          var47++;
                                          if (var39 != 0) {
                                             continue label757;
                                          }
                                       }
                                    } else if (var256 != 0) {
                                       continue label757;
                                    }

                                    var256 = var39;
                                 } while (var2 < 0L);

                                 if (var39 != 0) {
                                    var41 = ((java.util.ArrayList) (new ArrayList()));
                                    var184 = 9;
                                    break label802;
                                 }
                                 break;
                              }
                           }

                           var10003 = -4040160281029076067L;
                           byte var108 = 5;
                           long var109 = var32;
                           C_47gG var111 = var1;
                           var245 = C_47KL.method_46$fbb0b162a3(var111, var109, var108);
                        }

                        var41 = var245;
                        ArrayList var257 = var41;
                        if (var39 != 0) {
                           boolean var258 = var41.isEmpty();
                           if (var2 > 0L) {
                              if (!var258) {
                                 C_42a var314 = (C_42a)var41.get(0);
                                 long var334 = -4041721199688079494L;
                                 C_42a var112 = var314;
                                 var40.add(var112.method_45$0502b11602());
                              }
                           }

                           var10003 = -4042743970704186970L;
                           byte var113 = 5;
                           long var114 = var14;
                           C_47gG var116 = var1;
                           var257 = C_47KL.method_44$fbb0b162a3(var116, var114, var113);
                        }

                        ArrayList var185 = var257;
                        ArrayList var259 = var185;
                        if (var39 != 0) {
                           boolean var260 = var185.isEmpty();
                           if (var2 > 0L) {
                              if (!var260) {
                                 C_42a var315 = (C_42a)var185.get(0);
                                 long var335 = -4041721199688079494L;
                                 C_42a var117 = var315;
                                 var40.add(var117.method_45$0502b11602());
                              }
                           }

                           var10003 = -4042024621175397509L;
                           byte var118 = 5;
                           long var119 = var12;
                           C_47gG var121 = var1;
                           var259 = C_47KL.method_47$fbb0b162a3(var121, var119, var118);
                        }

                        ArrayList var188 = var259;
                        byte var261 = (byte) ((var188.isEmpty()) ? 1 : 0);
                        if (var39 == 0) {
                           var184 = var261;
                        } else {
                           if (var261 == 0) {
                              C_42a var316 = (C_42a)var188.get(0);
                              long var336 = -4041721199688079494L;
                              C_42a var122 = var316;
                              var40.add(var122.method_45$0502b11602());
                           }

                           var41 = ((java.util.ArrayList) (new ArrayList()));
                           var184 = 9;
                        }
                     }

                     label717:
                     while (true) {
                        if (var184 < var1.field_46.size()) {
                           var262 = var1;
                           var312 = var184;
                           if (var39 == 0) {
                              break;
                           }
                        } else {
                           var262 = var1;
                           if (var2 > 0L) {
                              var312 = 9;
                              break;
                           }

                           var312 = var184;
                           if (var39 == 0) {
                              break;
                           }
                        }

                        while (true) {
                           C_47rf var189 = var262.method_46$4c10532da1(var312).method_48$ac4db64966();
                           if (var189 == null) {
                              var184++;
                              if (var39 != 0) {
                                 break;
                              }
                           } else if (!var40.contains(var184)) {
                              C_43r var193 = var189.method_48$dbd570a038();
                              if (var2 >= 0L) {
                                 if (var39 != 0) {
                                    long var355 = -4043118083187290624L;
                                    C_43r var123 = var193;
                                    long var124 = var4;
                                    C_471Q var126 = this.field_49;
                                    boolean var263 = var126.method_41$f942ff83f3(var124, var123);
                                    if (var2 >= 0L) {
                                       if (var263) {
                                          var41.add(var184);
                                       }
                                    }

                                    var184++;
                                    if (var39 != 0) {
                                       break;
                                    }
                                 } else if (var39 != 0) {
                                    break;
                                 }
                              } else if (var39 != 0) {
                                 break;
                              }
                           } else {
                              var184++;
                              if (var39 != 0) {
                                 break;
                              }
                           }

                           var262 = var1;
                           if (var2 > 0L) {
                              var312 = 9;
                              break label717;
                           }

                           var312 = var184;
                           if (var39 == 0) {
                              break label717;
                           }
                        }
                     }

                     long var356 = -4040360200629821766L;
                     long var127 = var20;
                     int var129 = var312;
                     C_47gG var130 = var262;
                     ArrayList var186 = C_47KL.method_40$1bb508394f(var130, var129, var127);
                     var250 = var186;
                     if (var39 == 0) {
                        break label800;
                     }

                     double var264 = var186.size();
                     var356 = -4040363834978773754L;
                     long var131 = var30;
                     NumberSetting var133 = this.settingBlockStackLimit;
                     double var388;
                     var256 = (var388 = var264 - var133.method_44$474dfaa627(var131)) == 0.0 ? 0 : (var388 < 0.0 ? -1 : 1);
                     if (var2 <= 0L) {
                        char var322 = (char)var28;
                        long var381 = -4045177969390634855L;
                        byte var207 = 9;
                        C_47gG var208 = var1;
                        int var209 = var29;
                        char var210 = var322;
                        int var211 = var256;
                        var250 = C_47KL.method_45$89343c403f((short)var211, var210, var209, var208, var207);
                        break label800;
                     }

                     if (var256 > 0) {
                        long var337 = -4040363834978773754L;
                        long var134 = var30;
                        NumberSetting var136 = this.settingBlockStackLimit;
                        int var190 = (int)var136.method_44$474dfaa627(var134);
                        var256 = var190;

                        for (var312 = var186.size(); var256 < var312; var312 = var186.size()) {
                           C_42a var267 = (C_42a)var186.get(var190);
                           long var319 = -4041721199688079494L;
                           C_42a var206 = var267;
                           int var194 = (Integer)var206.method_45$0502b11602();
                           byte var268 = var39;
                           if (var2 > 0L) {
                              if (var39 != 0) {
                                 var250 = var40;
                                 var312 = var39;
                                 if (var2 > 0L) {
                                    if (var39 == 0) {
                                       break label800;
                                    }

                                    var312 = var194;
                                 }

                                 boolean var269 = var40.contains(var312);
                                 if (var2 > 0L) {
                                    if (!var269) {
                                       var41.add(var194);
                                    }
                                 }

                                 var190++;
                                 var268 = var39;
                              } else {
                                 var268 = var39;
                              }
                           }

                           if (var268 == 0) {
                              break;
                           }

                           var256 = var190;
                        }
                     }
                  }

                  short var270 = (short)var27;
                  char var321 = (char)var28;
                  long var380 = -4045177969390634855L;
                  byte var138 = 9;
                  C_47gG var139 = var1;
                  int var140 = var29;
                  char var141 = var321;
                  short var142 = var270;
                  var250 = C_47KL.method_45$89343c403f(var142, var141, var140, var139, var138);
               }

               ArrayList var191 = var250;
               var271 = var191;
               label538:
               if (var39 != 0) {
                  label548: {
                     double var272 = var191.size();
                     long var358 = -4040363834978773754L;
                     long var143 = var30;
                     NumberSetting var145 = this.settingFoodStackLimit;
                     double var389;
                     var256 = (var389 = var272 - var145.method_44$474dfaa627(var143)) == 0.0 ? 0 : (var389 < 0.0 ? -1 : 1);
                     int var195;
                     if (var2 >= 0L) {
                        if (var256 <= 0) {
                           break label548;
                        }

                        long var338 = -4040363834978773754L;
                        long var146 = var30;
                        NumberSetting var148 = this.settingFoodStackLimit;
                        var195 = (int)var148.method_44$474dfaa627(var146);
                     } else {
                        var195 = var256;
                     }

                     while (var195 < var191.size()) {
                        C_42a var274 = (C_42a)var191.get(var195);
                        long var323 = -4041721199688079494L;
                        C_42a var149 = var274;
                        var45 = (Integer)var149.method_45$0502b11602();
                        byte var275 = var39;
                        if (var2 >= 0L) {
                           if (var39 != 0) {
                              var271 = var40;
                              var312 = var39;
                              if (var2 > 0L) {
                                 if (var39 == 0) {
                                    break label538;
                                 }

                                 var312 = var45;
                              }

                              boolean var276 = var40.contains(var312);
                              if (var2 >= 0L) {
                                 if (!var276) {
                                    var41.add(var45);
                                 }
                              }

                              var195++;
                              var275 = var39;
                           } else {
                              var275 = var39;
                           }
                        }

                        if (var275 == 0) {
                           break;
                        }
                     }
                  }

                  long var359 = -4043371555386883366L;
                  byte var150 = 9;
                  C_47gG var151 = var1;
                  long var152 = var16;
                  var271 = C_47KL.method_41$38ad863a40(var152, var151, var150);
               }

               var192 = var271;
               var277 = var192;
               if (var39 == 0) {
                  break label798;
               }

               double var278 = var192.size();
               long var360 = -4040363834978773754L;
               long var154 = var30;
               NumberSetting var156 = this.settingThrowablesLimit;
               double var390;
               var256 = (var390 = var278 - var156.method_44$474dfaa627(var154)) == 0.0 ? 0 : (var390 < 0.0 ? -1 : 1);
               if (var2 > 0L) {
                  if (var256 <= 0) {
                     C_43r[] var361 = new C_43r[]{C_42R.field_45M};
                     long var374 = -4045337273527461296L;
                     C_43r[] var161 = var361;
                     byte var162 = 9;
                     long var163 = var18;
                     C_47gG var165 = var1;
                     var277 = C_47KL.method_42$fe7c24f1a0(var165, var163, var162, var161);
                     break label798;
                  }

                  long var339 = -4040363834978773754L;
                  long var157 = var30;
                  NumberSetting var159 = this.settingThrowablesLimit;
                  var45 = (int)var159.method_44$474dfaa627(var157);
               } else {
                  var45 = var256;
               }

               var256 = var45;
               var312 = var192.size();
            }

            while (var256 < var312) {
               C_42a var293 = (C_42a)var192.get(var45);
               long var328 = -4041721199688079494L;
               C_42a var160 = var293;
               int var202 = (Integer)var160.method_45$0502b11602();
               byte var294 = var39;
               if (var2 > 0L) {
                  if (var39 != 0) {
                     var277 = var40;
                     var312 = var39;
                     if (var2 > 0L) {
                        if (var39 == 0) {
                           break label798;
                        }

                        var312 = var202;
                     }

                     boolean var295 = var40.contains(var312);
                     if (var2 >= 0L) {
                        if (!var295) {
                           var41.add(var202);
                        }
                     }

                     var45++;
                     var294 = var39;
                  } else {
                     var294 = var39;
                  }
               }

               if (var294 == 0) {
                  break;
               }

               var256 = var45;
               var312 = var192.size();
            }

            C_43r[] var369 = new C_43r[]{C_42R.field_45M};
            long var377 = -4045337273527461296L;
            C_43r[] var225 = var369;
            byte var227 = 9;
            long var229 = var18;
            C_47gG var231 = var1;
            var277 = C_47KL.method_42$fe7c24f1a0(var231, var229, var227, var225);
         }

         ArrayList var200 = var277;
         var296 = var200;
         label380:
         if (var39 != 0) {
            label835: {
               double var297 = var200.size();
               long var370 = -4040363834978773754L;
               long var232 = var30;
               NumberSetting var233 = this.settingLavaBucketLimit;
               double var391;
               var256 = (var391 = var297 - var233.method_44$474dfaa627(var232)) == 0.0 ? 0 : (var391 < 0.0 ? -1 : 1);
               if (var2 >= 0L) {
                  if (var256 <= 0) {
                     break label835;
                  }

                  long var344 = -4040363834978773754L;
                  long var234 = var30;
                  NumberSetting var235 = this.settingLavaBucketLimit;
                  var256 = (int)var235.method_44$474dfaa627(var234);
               }

               int var203 = var256;

               while (var203 < var200.size()) {
                  var47 = (Integer)var200.get(var203);
                  byte var299 = var39;
                  if (var2 > 0L) {
                     if (var39 != 0) {
                        var296 = var40;
                        var312 = var39;
                        if (var2 >= 0L) {
                           if (var39 == 0) {
                              break label380;
                           }

                           var312 = var47;
                        }

                        if (var2 > 0L && !var40.contains(var312)) {
                           var41.add(var47);
                        }

                        var203++;
                     }

                     var299 = var39;
                  }

                  if (var299 == 0) {
                     break;
                  }
               }
            }

            C_43r[] var371 = new C_43r[]{C_42R.field_457};
            long var378 = -4045337273527461296L;
            C_43r[] var236 = var371;
            byte var237 = 9;
            long var238 = var18;
            C_47gG var239 = var1;
            var296 = C_47KL.method_42$fe7c24f1a0(var239, var238, var237, var236);
         }

         var46 = var296;
         if (var39 == 0) {
            return var46;
         }

         double var300 = var46.size();
         long var372 = -4040363834978773754L;
         long var240 = var30;
         NumberSetting var241 = this.settingWaterBucketLimit;
         double var392;
         var256 = (var392 = var300 - var241.method_44$474dfaa627(var240)) == 0.0 ? 0 : (var392 < 0.0 ? -1 : 1);
         if (var2 >= 0L) {
            if (var256 <= 0) {
               return var41;
            }

            long var345 = -4040363834978773754L;
            long var242 = var30;
            NumberSetting var243 = this.settingWaterBucketLimit;
            var256 = (int)var243.method_44$474dfaa627(var242);
         }

         var47 = var256;
         var256 = var47;
         var312 = var46.size();
      }

      while (var256 < var312) {
         int var48 = (Integer)var46.get(var47);
         byte var302 = var39;
         if (var2 >= 0L) {
            if (var39 != 0) {
               var312 = var39;
               if (var2 > 0L) {
                  if (var39 == 0) {
                     return var40;
                  }

                  var312 = var48;
               }

               if (var2 > 0L && !var40.contains(var312)) {
                  var41.add(var48);
               }

               var47++;
            }

            var302 = var39;
         }

         if (var302 == 0) {
            break;
         }

         var256 = var47;
         var312 = var46.size();
      }

      return var41;
   }














   private int method_49$7d68d9dd49(int var1, char var2, int var3, C_47gG var4, int var5, int var6, RangeSetting var7, int var8, int var9) {
      long var10 = ((long)var2 << 48 | (long)var8 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 81338992044474L;
      long var14 = var10 ^ 69189714600381L;
      long var10000 = -1411534703922157050L;
      byte var16 = (byte) ((AirStuck_47Q4.method_419$aae029aa0a()) ? 1 : 0);
      long var10002 = -1410107272690945010L;
      long var29 = var12;
      ModeSetting var31 = this.settingMode;
      int var34 = (int) ((var31.method_46$5f9dc63072(var29).equals(recovery$indy$119(13424, 4596375590434840570L ^ var10))) ? 1 : 0);
      if (var16 == 0) {
         if (var34 == 0) {
            C_47sT var17 = var4.method_46$4c10532da1(var5);
            ScaledResolution var18 = new ScaledResolution(field_43);
            int var19 = (var18.method_46$8abf5c6871() - 176) / 2;
            int var20 = (var18.method_48$8abf5c6871() - 166) / 2;
            double var35 = var17.field_40 + 2 + var19;
            long var10001 = -1414871230855955358L;
            double var21 = Math.abs(var35 - C_47KL.method_48$bb9accd06c()[0]);
            double var36 = var17.field_46 + 2 + var20;
            var10001 = -1414871230855955358L;
            double var23 = Math.abs(var36 - C_47KL.method_48$bb9accd06c()[1]);
            double var25 = Math.sqrt(var21 * var21 + var23 * var23);
            var10002 = -1410700022253318498L;
            byte var27 = (byte) ((C_47UU.method_48$800bd538b0(1, var14)) ? 1 : 0);
            byte var42 = var27;
            if (var16 == 0) {
               var42 = (byte)(var27 != 0 ? 40 : 0);
            }

            int var28 = (int)(var25 / (var3 + var42));
            int var37 = var28;
            int var39 = var16;
            if (var8 >= 0) {
               if (var16 == 0) {
                  if (var28 > 0) {
                     var10002 = -1409893422587020911L;
                     RangeSetting var32 = var7;
                     var28 += var32.method_44$8abf5c6871();
                  }

                  var37 = var1;
               }

               var39 = var16;
            }

            if (var8 >= 0) {
               if (var39 != 0) {
                  return var37;
               }

               var39 = var28;
            }

            if (var2 >= 0) {
               if (var37 <= var39) {
                  return 0;
               }

               double var44;
               var37 = (var44 = var25 - 19.0) == 0.0 ? 0 : (var44 < 0.0 ? -1 : 1);
               var39 = var16;
            }

            if (var39 == 0) {
               if (var37 > 0) {
                  var10001 = -1415357980748135240L;
                  RangeSetting var33 = var7;
                  var33.method_43$fedcb3e4d3();
               }

               var37 = var6;
            }

            return var37;
         }

         var34 = var6;
      }

      return var34;
   }




   public String[] method_45$44c5829186() {
      return this.field_40;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 8054166361019L;
      long var10000 = 3271952569901427463L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 3274021805446865951L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_45$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 102235051707590L;
      long var5 = var3 ^ 121014455681316L;
      long var10005 = 8232312147842095700L;
      C_47gG var7 = var2;
      byte var8 = 0;
      int var9 = var1;
      long var10 = var5;
      InvManager_47QL var12 = this;
      var12.method_44$8a933f4c45(var10, var9, var8, var7);
   }



   public int method_45$8abf5c6871() {
      return this.field_437;
   }



   private boolean method_45$860b9c5006(long var1, boolean var3) {
        boolean var84;
      var1 = a ^ var1;
      long var4 = var1 ^ 130621276915870L;
      long var6 = var1 ^ 77369175304111L;
      long var8 = var1 ^ 40013198220115L;
      long var10 = var1 ^ 73857272063406L;
      long var10001 = var1 ^ 18327536511235L;
      int var12 = (int)((var1 ^ 18327536511235L) >>> 48);
      int var13 = (int)((var1 ^ 18327536511235L) << 16 >>> 32);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var1 ^ 70200426693725L;
      long var17 = var1 ^ 96688246896082L;
      long var10000 = -7008032500298632784L;
      byte var19 = ((byte) (AirStuck_47Q4.method_45$aae029aa0a() ? 1 : 0));
      var10001 = -7008242705510946638L;
      net.C_47Oh var29 = net.C_47Oh.CLEAN;
      boolean var80 = var29.method_43$aae029aa0a();
      if (var19 == 0) {
         return var80;
      }

      if (!var80) {
         return true;
      }

      InvManager_47QL var81 = this;
      if (var1 < 0L) {
         this.field_436 = var19;
         var10001 = -7007848263680399651L;
         net.minecraft.client.Minecraft var76 = field_43;
         net.C_47gG var74 = var76.field_42P.field_429;
         long var100 = -7010551439726312403L;
         long var77 = var6;
         net.C_47gG var78 = var74;
         InvManager_47QL var79 = this;
         java.util.ArrayList var75 = var79.method_49$4c49186100(var78, var77);
         boolean var85 = var75.isEmpty();
         long var105;
         int var95 = (var105 = var1 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
         return var85;
      }

      if (var19 != 0) {
         long var10002 = -7009805569939383891L;
         long var30 = var4;
         InvManager_47QL var32 = this;
         if (var32.method_41I$0dd78e0064(var30)) {
            return true;
         }

         var81 = this;
      }

      var81.field_436++;
      var10001 = -7007848263680399651L;
      net.minecraft.client.Minecraft var33 = field_43;
      net.C_47gG var20 = var33.field_42P.field_429;
      long var10003 = -7010551439726312403L;
      long var34 = var6;
      net.C_47gG var36 = var20;
      InvManager_47QL var37 = this;
      java.util.ArrayList var21 = var37.method_49$4c49186100(var36, var34);
      boolean var82 = var21.isEmpty();
      if (var1 <= 0L) {
         return var82;
      }

      if (var82) {
         return true;
      }

      java.util.ArrayList var22 = new java.util.ArrayList();
      java.util.ArrayList var23 = new java.util.ArrayList();
      long var10004 = -7023601704259893529L;
      long var38 = var8;
      client.setting.ModeSetting var40 = this.settingCleanerSequence;
      String var97 = var40.method_46$5f9dc63072(var38);
      var10004 = -7025434533950041253L;
      String var41 = var97;
      long var42 = var10;
      java.util.ArrayList var44 = var21;
      net.C_47gG var45 = var20;
      java.util.ArrayList var24 = net.C_47KL.method_43$b3a9e1cc19(var45, var44, var42, var41);
      java.util.Iterator var25 = var24.iterator();

      label126: {
         while (true) {
            if (var25.hasNext()) {
               int var26 = (Integer)var25.next();
               net.C_47rf var27 = var20.method_46$4c10532da1(var26).method_48$ac4db64966();
               long var106;
               int var88 = (var106 = var1 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
               if (var19 == 0) {
                  break;
               }

               if (var27 == null) {
                  continue;
               }

               var10001 = -7023447393442621449L;
               client.setting.BooleanSetting var46 = this.settingKeepAllArmor;
               if (var46.method_49$aae029aa0a()) {
                  net.C_43r var28 = var27.method_48$dbd570a038();
                  boolean var83 = var28 instanceof C_43S;
                  long var107;
                  int var90 = (var107 = var1 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                  if (var83) {
                     continue;
                  }
               }

               var27.method_48$d00df7729d(var26);
               var23.add(var27);
               var22.add((Runnable)recovery$indy$flow$1419(this, var27, var20));
               long var108;
               int var91 = (var108 = var1 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
               if (var19 != 0) {
                  continue;
               }
            }

            var84 = var22.isEmpty();
            long var109;
            int var96 = (var109 = var1 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
            if (var19 == 0) {
               break label126;
            }

            if (var84) {
               return true;
            }
            break;
         }

         var84 = var3;
      }

      if (var19 != 0) {
         if (var84) {
            char var92 = (char)var12;
            short var99 = (short)var14;
            var10004 = -7025060502009446549L;
            short var47 = var99;
            int var48 = var13;
            char var49 = var92;
            InvManager_47QL var50 = this;
            var50.method_44$674b75e8e1(var49, var48, var47);
            var10001 = -7023447393442621449L;
            client.setting.BooleanSetting var51 = this.settingCleanInstant;
            return var51.method_49$aae029aa0a();
         }

         net.C_474k var98 = this.field_45;
         client.setting.RangeSetting var10005 = this.settingCleanFailRate;
         client.setting.RangeSetting var10007 = this.settingCleanMissClickRate;
         client.setting.RangeSetting var10008 = this.settingCleanMouseMoveRandom;
         long var10011 = -7023447393442621449L;
         client.setting.BooleanSetting var52 = this.settingCleanInstant;
         boolean var10010 = var52.method_49$aae029aa0a();
         long var10012 = -7023819948048315528L;
         client.setting.RangeSetting var53 = this.settingCleanCPS;
         int var103 = var53.method_44$8abf5c6871();
         int var104 = this.field_436;
         long var10016 = -7008986965946704123L;
         long var54 = var15;
         boolean var56 = true;
         client.setting.NumberSetting var57 = this.settingCleanMaxMouseMoveSpeed;
         int var10013 = (int)var57.method_43$a8c520d5d1(var56, var54);
         long var10014 = -7010794489667278896L;
         int var58 = var10013;
         int var59 = var104;
         int var60 = var103;
         boolean var61 = var10010;
         net.C_47gG var62 = var20;
         client.setting.RangeSetting var63 = var10008;
         client.setting.RangeSetting var64 = var10007;
         long var65 = var17;
         client.setting.RangeSetting var67 = var10005;
         Object var68 = null;
         net.C_474k var69 = var98;
         java.util.ArrayList var70 = var23;
         java.util.ArrayList var71 = var22;
         InvManager_47QL var72 = this;
         var84 = var72.method_46$b271fd46b4(var71, var70, var69, (client.setting.RangeSetting)var68, var67, var65, var64, var63, var62, var61, var60, var59, var58);
      }

      return var84;
   }






   private void method_47$765f95ffe0(int var1, int var2, C_47gG var3) {
      long var4 = a ^ 37529004699132L;
      long var6 = var4 ^ 70029877454673L;
      long var10005 = -3240616497768172896L;
      C_47gG var8 = var3;
      int var9 = var2;
      long var10 = var6;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_49$dcf4412afe(var12, var10, var9, var8);
   }



   private void method_47$e45a9973e5(long var1) {
      var1 = a ^ var1;
      this.field_43v = false;
      this.field_43U = -1;
      recovery$indy$121(this.settingTickDelayBeforeSwitch, 4595019368206669607L, var1);
      recovery$indy$122(this.settingTickDelayBeforeClick, 4595019368206669607L, var1);
      recovery$indy$123(this.settingTickDelayAfter, 4595019368206669607L, var1);
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10000 = 6403863579222767569L;
      boolean var4 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 6401398921368902105L;
      Minecraft var5 = field_43;
      boolean var17 = var5.method_44$aae029aa0a();
      if (var4) {
         if (!var17) {
            return;
         }

         var10001 = 6404990409347017029L;
         InvManager_47QL var6 = this;
         var17 = var6.method_41P$aae029aa0a();
      }

      if (var17) {
         var10001 = 6403695697774846140L;
         Minecraft var7 = field_43;
         if (var7.field_42P.method_46$f8ba6cbd86() != null) {
            var10001 = 6406040219293405590L;
            BooleanSetting var8 = this.settingStopMovement;
            if (var8.method_49$aae029aa0a()) {
               long var10002 = 6402784311295146358L;
               boolean var9 = false;
               C_472n var10 = var1;
               var10.method_47$f633c984d8(var9);
               var10002 = 6406207567845756721L;
               boolean var11 = false;
               C_472n var12 = var1;
               var12.method_43$f633c984d8(var11);
               var10002 = 6406303746916427259L;
               float var13 = 0.0F;
               C_472n var14 = var1;
               var14.method_45$24a796ab4c(var13);
               var10002 = 6399756921866656388L;
               float var15 = 0.0F;
               C_472n var16 = var1;
               var16.method_44$24a796ab4c(var15);
            }
         }
      }
   }



   private boolean method_47$2f066a671d(long var1, C_474k var3, RangeSetting var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 127762526018440L;
      boolean var7 = recovery$indy$124(2833095645067544671L, var1);
      if (var4 == null) {
         return false;
      }

      boolean var8 = recovery$indy$126(var3, recovery$indy$125(var4, 2839864881266340503L, var1), var5, 2834899999411654631L, var1);
      boolean var10000 = var8;
      if (var7) {
         if (var8) {
            recovery$indy$127(var4, 2836586190592315326L, var1);
         }

         var10000 = var8;
      }

      return var10000;
   }



   private void method_47$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 78772214209956L;
      long var5 = var3 ^ 128987423346758L;
      long var10005 = 2548218354975017782L;
      C_47gG var7 = var2;
      byte var8 = 0;
      int var9 = var1;
      long var10 = var5;
      InvManager_47QL var12 = this;
      var12.method_44$8a933f4c45(var10, var9, var8, var7);
   }



   public void method_43$ca1f9e88a9(C_47tz var1, long var2) {
      long var4 = var2 ^ 9985179174339L;
      long var10000 = -1966881449678904613L;
      boolean var6 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -1980642103782103668L;
      Minecraft var7 = field_43;
      boolean var17 = var7.method_44$aae029aa0a();
      if (!var6) {
         if (!var17) {
            return;
         }

         var10001 = -1966359789205711600L;
         InvManager_47QL var8 = this;
         var17 = var8.method_41P$aae029aa0a();
      }

      if (var17) {
         var10001 = -1978362644550083351L;
         Minecraft var9 = field_43;
         if (var9.field_42P.method_46$f8ba6cbd86() != null) {
            var10001 = -1966985325905908285L;
            BooleanSetting var10 = this.settingStopSprinting;
            if (var10.method_49$aae029aa0a()) {
               long var10002 = -1979914262359917132L;
               boolean var11 = false;
               C_47tz var12 = var1;
               var12.method_46$f633c984d8(var11);
               long var10003 = -1980725472183279200L;
               boolean var13 = false;
               long var14 = var4;
               C_47tz var16 = var1;
               var16.method_43$b757cde368(var14, var13);
            }
         }
      }
   }



   private void method_43$dcf4412afe(int var1, long var2, int var4, C_47gG var5) {
      var2 = a ^ var2;
      long var6 = var2 ^ 4257032254874L;
      recovery$indy$128(this, var5, var6, var1, -9147773707428829843L, var2);
      recovery$indy$129(field_43, -9145797762186117571L, var2)
         .method_42$f0ddb617a2(var5.field_43, var1, var4, 0, recovery$indy$130(field_43, -9150073271030843034L, var2));
      recovery$indy$131(this, -9148754456953540872L, var2);
   }



   public void method_43$da8c82d5d4() {
      this.field_42 = 0;
      this.field_43n = 0;
      this.field_436 = 0;
      this.field_43f = 0;
   }



   private void method_43$ea2db597b8(int var1, C_47gG var2) {
      long var3 = a ^ 73728446972995L;
      long var5 = var3 ^ 125321000012193L;
      long var10005 = -379969514305596719L;
      C_47gG var7 = var2;
      byte var8 = 0;
      int var9 = var1;
      long var10 = var5;
      InvManager_47QL var12 = this;
      var12.method_44$8a933f4c45(var10, var9, var8, var7);
   }



   private void method_43$f6d7af517a(int var1, C_47rf var2, C_47gG var3) {
      long var4 = a ^ 94466011558610L;
      long var6 = var4 ^ 50941148863338L;
      long var10005 = 5490960484902090548L;
      long var8 = var6;
      C_47gG var10 = var3;
      C_47rf var11 = var2;
      int var12 = var1;
      InvManager_47QL var13 = this;
      var13.method_40$4759d2c13c(var12, var11, var10, var8);
   }



    public void method_40G$e45a9973e5(long l) {
        block20: {
            int n;
            InvManager_47QL invManager_47QL;
            int n2;
            int n3;
            int n4;
            block18: {
                block19: {
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    block17: {
                        block12: {
                            block16: {
                                int n10;
                                block14: {
                                    block15: {
                                        Minecraft c_47nT;
                                        block13: {
                                            C_47Ij c_47Ij;
                                            block11: {
                                                Minecraft c_47nT2;
                                                block9: {
                                                    block10: {
                                                        InvManager_47QL invManager_47QL2;
                                                        long l2;
                                                        block8: {
                                                            block7: {
                                                                boolean bl;
                                                                block6: {
                                                                    long l3 = l;
                                                                    l2 = l3 ^ 0x6D46C00A4C86L;
                                                                    long l4 = l3 ^ 0x5D3DD120B88L;
                                                                    n4 = (int)(l4 >>> 32);
                                                                    n3 = (int)(l4 << 32 >>> 48);
                                                                    n2 = (int)(l4 << 48 >>> 48);
                                                                    long l5 = l3 ^ 0x632564130857L;
                                                                    long l6 = l3 ^ 0x5C16397590DCL;
                                                                    n9 = (int)(l6 >>> 48);
                                                                    n8 = (int)(l6 << 16 >>> 32);
                                                                    n7 = (int)(l6 << 48 >>> 48);
                                                                    n6 = ((int) (AirStuck_47Q4.method_45$aae029aa0a() ? 1 : 0));
                                                                    C_47Oh c_47Oh = C_47Oh.PUT_ON_ARMOR_HOT_BAR;
                                                                    bl = c_47Oh.method_43$aae029aa0a();
                                                                    if (n6 == 0) break block6;
                                                                    if (!bl) break block7;
                                                                    invManager_47QL2 = this;
                                                                    if (n6 == 0) break block8;
                                                                    long l7 = l5;
                                                                    ModeSetting c_47Tj = invManager_47QL2.settingMode;
                                                                    bl = c_47Tj.method_46$5f9dc63072(l7).equals(InvManager_47QL.recovery$indy$132(17910, 0x6CD7198E0C174FD5L ^ l));
                                                                }
                                                                if (!bl) break block7;
                                                                c_47nT2 = field_43;
                                                                if (n6 == 0) break block9;
                                                                Minecraft c_47nT3 = c_47nT2;
                                                                if (c_47nT3.method_44$aae029aa0a()) break block10;
                                                            }
                                                            this.field_43h.clear();
                                                            invManager_47QL2 = this;
                                                        }
                                                        long l8 = l2;
                                                        InvManager_47QL invManager_47QL3 = invManager_47QL2;
                                                        invManager_47QL3.method_47$e45a9973e5(l8);
                                                        return;
                                                    }
                                                    c_47nT2 = field_43;
                                                }
                                                Minecraft c_47nT4 = c_47nT2;
                                                c_47Ij = c_47nT4.field_42Y;
                                                if (n6 == 0) break block11;
                                                if (c_47Ij == null) break block12;
                                                c_47nT = field_43;
                                                if (n6 == 0) break block13;
                                                Minecraft c_47nT5 = c_47nT;
                                                c_47Ij = c_47nT5.field_42Y;
                                            }
                                            if (c_47Ij.field_49 != C_47Az.BLOCK) break block12;
                                            c_47nT = field_43;
                                        }
                                        Minecraft c_47nT6 = c_47nT;
                                        Minecraft c_47nT7 = field_43;
                                        C_475y c_475y = c_47nT6.field_44Q.method_46$efbf73d2b1(c_47nT7.field_42Y.method_49$5730377d31()).method_48$e084f7739d();
                                        n5 = c_475y.method_48$aae029aa0a() ? 1 : 0;
                                        n10 = n6;
                                        if (l <= 0L) break block14;
                                        if (n10 == 0) break block15;
                                        if (n5 != 0) break block16;
                                        C_475y c_475y2 = c_475y;
                                        n5 = C_474i.method_47$27a36fdbd7((C_475y)c_475y2) ? 1 : 0;
                                    }
                                    n10 = n6;
                                }
                                if (n10 == 0) break block17;
                                if (n5 == 0) break block12;
                            }
                            return;
                        }
                        n5 = this.field_43U;
                    }
                    int n11 = n5;
                    char c = (char)n7;
                    int n12 = n8;
                    short s = (short)n9;
                    InvManager_47QL invManager_47QL4 = this;
                    this.field_43U = invManager_47QL4.method_49$55602b8d28(s, n12, c);
                    this.field_438 = n11;
                    invManager_47QL = this;
                    n = n6;
                    if (l < 0L) break block18;
                    if (n == 0) break block19;
                    if (invManager_47QL.field_43U <= -1) break block20;
                    invManager_47QL = this;
                }
                n = 5;
            }
            int n13 = this.field_43U;
            int n14 = n;
            InvManager_47QL invManager_47QL5 = invManager_47QL;
            int n15 = n13;
            char c = (char)n2;
            char c2 = (char)n3;
            int n16 = n14;
            InvManager_47QL invManager_47QL6 = invManager_47QL5;
            int n17 = n4;
            C_47i.method_43$95cbd1eb82((int)n17, (Module)invManager_47QL6, (int)n16, (char)c2, (char)c, (int)n15);
        }
    }





   private boolean method_41O$aae029aa0a() {
      long var1 = a ^ 80953955248385L;
      long var10000 = 6328122028782113213L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6329219454895677093L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41I$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 57102468153268L;
      boolean var5 = recovery$indy$133(-6281346753868101670L, var1);
      boolean var10000 = recovery$indy$134(this.settingNotWhileScaffold, -6274103392418094691L, var1);
      if (var5) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$135(var3, -6279859935944798265L, var1);
      }

      return !var5 ? var10000 : var10000;
   }



   private boolean method_41B$0dd78e0064(long var1) {
      var1 = a ^ var1;
      byte var3 = (byte) ((recovery$indy$136(2539878839655048528L, var1)) ? 1 : 0);
      int var4 = recovery$indy$137(field_43, 2522082101462719330L, var1).field_48y - this.field_43y;
      int var10000 = var4;
      if (var3 == 0) {
         label57: {
            int var10001 = recovery$indy$138(this.settingTickDelayBeforeSwitch, 2538134175403521735L, var1);
            if (var1 >= 0L) {
               if (var4 >= var10001) {
                  break label57;
               }

               var10000 = this.field_438;
               var10001 = var3;
            }

            if (var1 > 0L) {
               if (var10001 != 0) {
                  return var10000 != 0;
               }

               var10001 = -1;
            }

            if (var1 >= 0L) {
               if (var10000 > var10001) {
                  break label57;
               }

               var10000 = this.field_43U;
               var10001 = var3;
            }

            if (var1 > 0L) {
               if (var10001 != 0) {
                  return var10000 != 0;
               }

               var10001 = -1;
            }

            if (var10000 <= var10001) {
               return false;
            }
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }



   private boolean method_41z$aae029aa0a() {
      long var1 = a ^ 28121352873908L;
      long var10000 = 1826618529994389079L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 1828663469177376784L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_418$aae029aa0a() {
      long var1 = a ^ 103844511615450L;
      long var3 = var1 ^ 114314200117978L;
      long var10000 = -5244666059458111431L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -5257828018839373336L;
      C_47Oh var6 = C_47Oh.CRAFT;
      boolean var10 = C_47Oh.method_48$a2948d1222(var6);
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10002 = -5256152776206979218L;
         long var7 = var3;
         ModeSetting var9 = this.settingMode;
         var10 = var9.method_46$5f9dc63072(var7).equals("OpenInv");
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_41u$aae029aa0a() {
      long var1 = a ^ 1638386300306L;
      long var10000 = 5422696416196807982L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 5424215569989386806L;
      BooleanSetting var4 = this.settingSortInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_411$aae029aa0a() {
      long var1 = a ^ 28365527084773L;
      long var10000 = -3456385446301139194L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -3444770053032453823L;
      BooleanSetting var4 = this.settingSortInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41C$aae029aa0a() {
      long var1 = a ^ 22521327634322L;
      long var10000 = 8737366655491178286L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 8738876999760179254L;
      BooleanSetting var4 = this.settingCraftInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41P$aae029aa0a() {
      long var1 = a ^ 77079019439813L;
      long var3 = var1 ^ 140323793845701L;
      long var10000 = 8653120019494731385L;
      boolean var5 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 8651833306542186609L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("SpoofInv");
      if (!var5) {
         if (!var12) {
            var10002 = 8651833306542186609L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("SpoofInvOther");
            if (var5) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private static boolean method_413$aae029aa0a() {
      long var0 = a ^ 2236649456420L;
      long var10001 = -146880198708301034L;
      C_47Oh var2 = C_47Oh.CLEAN;
      return C_47Oh.method_48$a2948d1222(var2);
   }



   private boolean method_41W$aae029aa0a() {
      long var1 = a ^ 118767293297102L;
      long var10000 = 5702408661974540333L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 5700081771138336362L;
      BooleanSetting var4 = this.settingSortInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41i$aae029aa0a() {
      long var1 = a ^ 27760831816283L;
      long var10000 = 6667669313951619815L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6669750855185880575L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$139(this, 52, 1, var3, -7103783262340099694L, var1);
      recovery$indy$140(this, 21, var5, -7108548819783834244L, var1);
      recovery$indy$141(this, 34, var5, -7108548819783834244L, var1);
      recovery$indy$142(this, 7, 100, var3, -7103783262340099694L, var1);
      recovery$indy$143(this, 36, 100, var3, -7103783262340099694L, var1);
   }



   private boolean method_41f$aae029aa0a() {
      long var1 = a ^ 133430179432886L;
      long var10000 = 3988802962540140629L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 3990989120255049234L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41g$aae029aa0a() {
      long var1 = a ^ 2796292181635L;
      long var10000 = 3481364281883080255L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 3483442657658812711L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41p$aae029aa0a() {
      long var1 = a ^ 100162943863038L;
      long var10000 = -715173582069966563L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -708484378853703846L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41T$aae029aa0a() {
      long var1 = a ^ 92439270770803L;
      long var10000 = 8547863734490165455L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 8550077560654364631L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41v$aae029aa0a() {
      long var1 = a ^ 17953479143405L;
      long var10000 = -7998258627838820850L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -7982139428719191991L;
      BooleanSetting var4 = this.settingSortInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41c$aae029aa0a() {
      long var1 = a ^ 20805013877329L;
      long var3 = var1 ^ 47734216608081L;
      long var10000 = -8305630986264140878L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -8321739688482733469L;
      C_47Oh var6 = C_47Oh.PUT_ON_ARMOR_HOT_BAR;
      boolean var10 = C_47Oh.method_48$a2948d1222(var6);
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10002 = -8321200224048261915L;
         long var7 = var3;
         ModeSetting var9 = this.settingMode;
         var10 = var9.method_46$5f9dc63072(var7).equals("OpenInv");
      }

      return !var5 ? var10 : var10;
   }



   public boolean method_41M$5a0422472c(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var6 = var4 ^ 58428650036628L;
      long var10000 = -7330375727590073302L;
      boolean var8 = AirStuck_47Q4.method_419$aae029aa0a();
      Minecraft var18 = field_43;
      if (!var8) {
         long var10001 = -7315521402839440872L;
         Minecraft var9 = field_43;
         if (var9.field_42P == null) {
            return false;
         }

         var18 = field_43;
      }

      long var20 = -7317581342494972265L;
      Minecraft var10 = var18;
      if (var10.field_44Q != null) {
         var20 = -7331120327114321102L;
         BooleanSetting var11 = this.settingBlockInputWhileManaging;
         boolean var19 = var11.method_49$aae029aa0a();
         boolean var22 = var8;
         if (var1 > 0) {
            if (!var8) {
               if (!var19) {
                  return false;
               }

               long var10003 = -7331567336810684241L;
               long var12 = var6;
               long var14 = 500L;
               C_47cu var16 = this.field_44k;
               var19 = var16.method_42$b0e346e6e3(var14, var12);
            }

            var22 = var8;
         }

         if (var3 <= 0) {
            if (!var22) {
               if (var19) {
                  return false;
               }

               var20 = -7330002952848593292L;
               Minecraft var17 = field_43;
               var19 = var17.field_44m instanceof C_47pL;
            }

            var22 = var8;
         }

         if (var22) {
            return var19;
         }

         if (var19) {
            return true;
         }
      }

      return false;
   }




   private boolean method_419$aae029aa0a() {
      long var1 = a ^ 88678680847809L;
      long var10000 = -2661037549667328643L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -2659940144547114395L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41L$aae029aa0a() {
      long var1 = a ^ 73379492040685L;
      long var10000 = 3548285004210616145L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 3547126301724522569L;
      BooleanSetting var4 = this.settingCraftInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41m$aae029aa0a() {
      long var1 = a ^ 44243553673322L;
      long var10000 = 6825593263464110294L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6827041498291132366L;
      BooleanSetting var4 = this.settingSortInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41d$aae029aa0a() {
      long var1 = a ^ 52098757468345L;
      long var10000 = 2191678207377381381L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 2192550761896613661L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41F$aae029aa0a() {
      long var1 = a ^ 112585513168246L;
      long var10000 = 6027275012990031306L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6026599472983071442L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41Y$aae029aa0a() {
      long var1 = a ^ 69206591754643L;
      long var10000 = -1189420330413146000L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -1204835090406578633L;
      BooleanSetting var4 = this.settingArmorInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41s$aae029aa0a() {
      long var1 = a ^ 21446775463734L;
      long var10000 = 7051363726031015637L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 7053408523490453650L;
      BooleanSetting var4 = this.settingCleanInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41t$aae029aa0a() {
      long var1 = a ^ 84762482934769L;
      long var10000 = 4403437849381573138L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 4406177641193616469L;
      BooleanSetting var4 = this.settingCraftInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_415$aae029aa0a() {
      long var1 = a ^ 48676156946269L;
      long var10000 = -8534773670586609695L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -8536148225848409863L;
      BooleanSetting var4 = this.settingCraftInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41K$ca7981a620(int var1, int var2, int var3) {
      net.minecraft.client.Minecraft var145;
      augustus.recovered.modules.player.InvManager_47QL var148;
      augustus.recovered.modules.player.InvManager_47QL var149;
      long var6;
      int var8;
      int var9;
      int var10;
      long var11;
      long var13;
      long var15;
      long var17;
      long var19;
      int var21;
      long var22;
      boolean var24;
      boolean var142;
      boolean var153;
      label401: {
         long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
         var6 = var4 ^ 97183211348842L;
         long var10001 = var4 ^ 3243639922767L;
         var8 = (int)((var4 ^ 3243639922767L) >>> 32);
         var9 = (int)((var4 ^ 3243639922767L) << 32 >>> 48);
         var10 = (int)(var10001 << 48 >>> 48);
         var11 = var4 ^ 89273741051597L;
         var13 = var4 ^ 91668032767183L;
         var15 = var4 ^ 80810268405674L;
         var17 = var4 ^ 106718772661392L;
         var19 = (var4 ^ 31512567871066L) >>> 16;
         var21 = (int)((var4 ^ 31512567871066L) << 48 >>> 48);
         var22 = var4 ^ 136714688868874L;
         long var10000 = 4836338654126327153L;
         var24 = AirStuck_47Q4.method_419$aae029aa0a();
         long var152 = 4836302338397108015L;
         Minecraft var25 = field_43;
         var142 = var25.field_44m instanceof C_47pL;
         label400:
         if (!var24) {
            if (!var142) {
               long var10002 = 4834985987520732025L;
               long var26 = var11;
               ModeSetting var28 = this.settingMode;
               var142 = var28.method_46$5f9dc63072(var26).equals("Basic");
               if (var24) {
                  break label400;
               }

               if (!var142) {
                  var10002 = 4834985987520732025L;
                  long var29 = var11;
                  ModeSetting var31 = this.settingMode;
                  var142 = var31.method_46$5f9dc63072(var29).equals("SpoofInv");
                  var153 = var24;
                  if (var1 < 0) {
                     break label401;
                  }

                  if (var24) {
                     break label400;
                  }

                  if (!var142) {
                     var10002 = 4834985987520732025L;
                     long var32 = var11;
                     ModeSetting var34 = this.settingMode;
                     var142 = var34.method_46$5f9dc63072(var32).equals("SpoofInvOther");
                     if (var24) {
                        return var142;
                     }

                     if (!var142) {
                        long var154 = 4840273292881226973L;
                        InvManager_47QL var140 = this;
                        var140.method_43$da8c82d5d4();
                        this.field_437 = -1;
                        long var155 = 4838866071478504564L;
                        C_47cu var141 = this.field_44Y;
                        var141.method_46$da8c82d5d4();
                        this.field_43a = false;
                        return false;
                     }
                  }
               }
            }

            var142 = this.field_43a;
         }

         var153 = var24;
      }

      if (var1 >= 0) {
         if (!var153) {
            if (!var142) {
               long var156 = 4840450003092368335L;
               RangeSetting var35 = this.settingStartDelay;
               var35.method_43$fedcb3e4d3();
            }

            this.field_43a = true;
            C_47cu var144 = this.field_44Y;
            long var173 = 4834638034696656614L;
            RangeSetting var36 = this.settingStartDelay;
            long var157 = var36.method_44$8abf5c6871();
            long var10003 = 4835296056657000948L;
            long var37 = var13;
            long var39 = var157;
            C_47cu var41 = var144;
            var142 = var41.method_42$b0e346e6e3(var39, var37);
         }

         var153 = var24;
      }

      if (!var153) {
         label370:
         if (var142) {
            var145 = field_43;
            label376:
            if (!var24) {
               long var158 = 4836302338397108015L;
               Minecraft var42 = field_43;
               if (var42.field_44m != null) {
                  var145 = field_43;
                  if (var24) {
                     break label376;
                  }

                  long var159 = 4836302338397108015L;
                  Minecraft var43 = field_43;
                  if (var43.field_44m.method_49$aae029aa0a()) {
                     break label370;
                  }
               }

               var145 = field_43;
            }

            label362: {
               label361: {
                  long var161 = 4837264537437944643L;
                  Minecraft var45 = var145;
                  if (var45.field_42P.field_42X.method_41$ac4db64966() != null) {
                     var142 = this.field_447;
                     if (var24) {
                        break label361;
                     }

                     if (!this.field_447) {
                        var142 = this.field_43P;
                        var153 = var24;
                        if (var2 <= 0) {
                           break label362;
                        }

                        if (var24) {
                           break label361;
                        }

                        if (!this.field_43P) {
                           return false;
                        }
                     }
                  }

                  long var163 = 4835755421378392762L;
                  InvManager_47QL var46 = this;
                  var142 = var46.method_41P$aae029aa0a();
               }

               var153 = var24;
            }

            if (var2 > 0) {
               if (!var153) {
                  if (var142) {
                     long var164 = 4836302338397108015L;
                     Minecraft var47 = field_43;
                     GuiScreen var147 = var47.field_44m;
                     var153 = var24;
                     if (var1 >= 0) {
                        if (!var24) {
                           if (var47.field_44m != null) {
                              this.field_43u = false;
                              return false;
                           }

                           long var166 = 4837264537437944643L;
                           Minecraft var48 = field_43;
                           var147 = var48.field_42P.method_46$f8ba6cbd86();
                        }

                        var153 = var24;
                     }

                     if (!var153) {
                        if (var147 == null) {
                           long var199 = 4834775444746457213L;
                           long var49 = var22;
                           boolean var51 = true;
                           boolean var52 = true;
                           InvManager_47QL var53 = this;
                           var142 = var53.method_44$fcc0b55219(var52, var51, var49);
                           if (!var24) {
                              if (var142) {
                                 short var190 = (short)var21;
                                 var199 = 4843539798453772795L;
                                 short var54 = var190;
                                 long var55 = var19;
                                 boolean var57 = true;
                                 InvManager_47QL var58 = this;
                                 var142 = var58.method_44$89b62fc635(var57, var55, var54);
                                 if (var24) {
                                    return var142;
                                 }

                                 if (var142) {
                                    var199 = 4834775444746457213L;
                                    long var59 = var22;
                                    boolean var61 = false;
                                    boolean var62 = true;
                                    InvManager_47QL var63 = this;
                                    var142 = var63.method_44$fcc0b55219(var62, var61, var59);
                                    if (var24) {
                                       return var142;
                                    }

                                    if (var142) {
                                       long var191 = 4835232399953140420L;
                                       boolean var64 = true;
                                       long var65 = var6;
                                       InvManager_47QL var67 = this;
                                       var142 = var67.method_45$860b9c5006(var65, var64);
                                       if (var24) {
                                          return var142;
                                       }

                                       if (var142) {
                                          long var192 = 4837214413290188957L;
                                          long var68 = var15;
                                          boolean var70 = true;
                                          InvManager_47QL var71 = this;
                                          var142 = var71.method_40$e1e9b6e76d(var70, var68);
                                          if (var24) {
                                             return var142;
                                          }

                                          if (var142) {
                                             return false;
                                          }
                                       }
                                    }
                                 }
                              }

                              var142 = true;
                           }

                           return var142;
                        }

                        long var167 = 4837264537437944643L;
                        Minecraft var72 = field_43;
                        var147 = var72.field_42P.method_46$f8ba6cbd86();
                     }

                     if (var147 == null) {
                        this.field_43u = false;
                        return true;
                     }

                     label323: {
                        label322: {
                           label411: {
                              var148 = this;
                              var153 = false;
                              boolean var175 = var24;
                              if (var2 > 0) {
                                 if (var24) {
                                    break label411;
                                 }

                                 var175 = true;
                              }

                              label412: {
                                 if (var3 >= 0) {
                                    long var196 = 4834775444746457213L;
                                    long var73 = var22;
                                    boolean var75 = var175;
                                    boolean var76 = false;
                                    InvManager_47QL var77 = this;
                                    if (!var77.method_44$fcc0b55219(var76, var75, var73)) {
                                       break label412;
                                    }

                                    var148 = this;
                                    var153 = false;
                                    var175 = var24;
                                 }

                                 if (var175) {
                                    break label411;
                                 }

                                 short var185 = (short)var21;
                                 long var197 = 4843539798453772795L;
                                 short var78 = var185;
                                 long var79 = var19;
                                 boolean var81 = var153;
                                 InvManager_47QL var82 = var148;
                                 label309:
                                 if (var82.method_44$89b62fc635(var81, var79, var78)) {
                                    var148 = this;
                                    var153 = false;
                                    var175 = var24;
                                    if (var2 >= 0) {
                                       if (var24) {
                                          break label411;
                                       }

                                       var175 = false;
                                    }

                                    if (var2 >= 0) {
                                       var197 = 4834775444746457213L;
                                       long var83 = var22;
                                       boolean var85 = var175;
                                       boolean var86 = false;
                                       InvManager_47QL var87 = this;
                                       if (!var87.method_44$fcc0b55219(var86, var85, var83)) {
                                          break label309;
                                       }

                                       var148 = this;
                                       var153 = false;
                                       var175 = var24;
                                    }

                                    if (var175) {
                                       break label411;
                                    }

                                    long var186 = 4835232399953140420L;
                                    boolean var88 = var153;
                                    long var89 = var6;
                                    InvManager_47QL var91 = var148;
                                    if (var91.method_45$860b9c5006(var89, var88)) {
                                       var148 = this;
                                       var153 = false;
                                       if (var24) {
                                          break label411;
                                       }

                                       long var187 = 4837214413290188957L;
                                       long var92 = var15;
                                       boolean var94 = false;
                                       InvManager_47QL var95 = this;
                                       if (var95.method_40$e1e9b6e76d(var94, var92)) {
                                          label297: {
                                             var149 = this;
                                             label296:
                                             if (!var24) {
                                                long var177 = 4834985987520732025L;
                                                long var96 = var11;
                                                ModeSetting var98 = this.settingMode;
                                                if (var98.method_46$5f9dc63072(var96).equals("SpoofInvOther")) {
                                                   var149 = this;
                                                   var153 = var24;
                                                   if (var3 <= 0) {
                                                      break label297;
                                                   }

                                                   if (var24) {
                                                      break label296;
                                                   }

                                                   if (this.field_43u) {
                                                      long var178 = 4837264537437944643L;
                                                      Minecraft var99 = field_43;
                                                      long var188 = 4839827633389375322L;
                                                      C_47gG var100 = var99.field_42P.field_429;
                                                      long var101 = var17;
                                                      InvManager_47QL var103 = this;
                                                      var103.method_48$cf3f4a6978(var101, var100);
                                                   }
                                                }

                                                var149 = this;
                                             }

                                             var153 = true;
                                          }

                                          var149.field_43u = var153;
                                          var142 = var24;
                                          if (var1 < 0) {
                                             break label323;
                                          }

                                          if (!var24) {
                                             break label322;
                                          }
                                       }
                                    }
                                 }
                              }

                              var148 = this;
                              var153 = false;
                           }

                           var148.field_43u = var153;
                        }

                        long var179 = 4834985987520732025L;
                        long var104 = var11;
                        ModeSetting var106 = this.settingMode;
                        var142 = var106.method_46$5f9dc63072(var104).equals("SpoofInv");
                     }

                     if (!var24) {
                        if (var142) {
                           long var180 = 4837264537437944643L;
                           Minecraft var107 = field_43;
                           long var189 = 4839827633389375322L;
                           C_47gG var108 = var107.field_42P.field_429;
                           long var109 = var17;
                           InvManager_47QL var111 = this;
                           var111.method_48$cf3f4a6978(var109, var108);
                           long var170 = 4840273292881226973L;
                           InvManager_47QL var112 = this;
                           var112.method_43$da8c82d5d4();
                        }

                        this.field_437 = -1;
                        var142 = true;
                     }

                     return var142;
                  }

                  long var10004 = 4834775444746457213L;
                  long var113 = var22;
                  boolean var115 = true;
                  boolean var116 = false;
                  InvManager_47QL var117 = this;
                  var142 = var117.method_44$fcc0b55219(var116, var115, var113);
               }

               var153 = var24;
            }

            if (!var153) {
               if (var142) {
                  short var181 = (short)var21;
                  long var193 = 4843539798453772795L;
                  short var118 = var181;
                  long var119 = var19;
                  boolean var121 = false;
                  InvManager_47QL var122 = this;
                  var142 = var122.method_44$89b62fc635(var121, var119, var118);
                  if (var24) {
                     return var142;
                  }

                  if (var142) {
                     var193 = 4834775444746457213L;
                     long var123 = var22;
                     boolean var125 = false;
                     boolean var126 = false;
                     InvManager_47QL var127 = this;
                     var142 = var127.method_44$fcc0b55219(var126, var125, var123);
                     if (var24) {
                        return var142;
                     }

                     if (var142) {
                        long var182 = 4835232399953140420L;
                        boolean var128 = false;
                        long var129 = var6;
                        InvManager_47QL var131 = this;
                        var142 = var131.method_45$860b9c5006(var129, var128);
                        if (var24) {
                           return var142;
                        }

                        if (var142) {
                           long var183 = 4837214413290188957L;
                           long var132 = var15;
                           boolean var134 = false;
                           InvManager_47QL var135 = this;
                           var142 = var135.method_40$e1e9b6e76d(var134, var132);
                           if (var24) {
                              return var142;
                           }

                           if (var142) {
                              this.field_437 = -1;
                              return false;
                           }
                        }
                     }
                  }
               }

               short var174 = (short)var9;
               char var184 = (char)var10;
               long var195 = 4839990688436632966L;
               char var136 = var184;
               short var137 = var174;
               int var138 = var8;
               InvManager_47QL var139 = this;
               var139.method_49$537c8d9634(var138, var137, var136);
               var142 = true;
            }

            return var142;
         }

         long var160 = 4840273292881226973L;
         InvManager_47QL var44 = this;
         var44.method_43$da8c82d5d4();
         var142 = true;
      }

      return var142;
   }










   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 50526125764320L;
      int var6 = (int)((var4 ^ 50526125764320L) >>> 48);
      int var7 = (int)((var4 ^ 50526125764320L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      recovery$indy$144(this, (char)var6, (char)var7, var8, 2734503576959481849L, var4);
   }



    public InvManager_47QL(long a0) {
        super((java.lang.String) ("InvManager"),(java.lang.String) ("InventarManager"),(long) (((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 103617448234977L)),(java.awt.Color) (new java.awt.Color((int) (32),(int) (94),(int) (103))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.InvManager_47QL.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 12073683621846L);
        long constructorKey4 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 42641748920007L);
        int constructorPart5 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 34213360930886L) >>> 32));
        int constructorPart6 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 34213360930886L) << 32) >>> 48));
        int constructorPart7 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 34213360930886L) << 48) >>> 48));
        long constructorKey8 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 25787895260700L);
        long constructorKey9 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 77041041377009L);
        long constructorKey10 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 40343106777487L);
        long constructorKey11 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 51787953804282L);
        long constructorKey12 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 103449738205063L);
        int constructorPart13 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 69735303484764L) >>> 32));
        long constructorKey14 = ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 69735303484764L) << 32) >>> 32);
        long constructorKey15 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 81301185860933L);
        long constructorKey16 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 122872713593367L);
        int constructorPart17 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 62061156266873L) >>> 32));
        int constructorPart18 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 62061156266873L) << 32) >>> 48));
        int constructorPart19 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 62061156266873L) << 48) >>> 48));
        int constructorPart20 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 98080060812555L) >>> 48));
        int constructorPart21 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 98080060812555L) << 16) >>> 48));
        int constructorPart22 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 98080060812555L) << 32) >>> 32));
        long constructorKey23 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 23679234293548L);
        int constructorPart24 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 63679623778903L) >>> 32));
        int constructorPart25 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 63679623778903L) << 32) >>> 48));
        int constructorPart26 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 63679623778903L) << 48) >>> 48));
        long constructorKey27 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 103558206138190L);
        int constructorPart28 = (int) ((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 77034225753675L) >>> 32));
        int constructorPart29 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 77034225753675L) << 32) >>> 48));
        int constructorPart30 = (int) (((((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 77034225753675L) << 48) >>> 48));
        long constructorKey31 = ((augustus.recovered.modules.player.InvManager_47QL.a ^ a0) ^ 27279533569867L);
        java.lang.Object initialValue32 = recovery$indy$flow$1882(10);
        ((java.lang.Object[]) initialValue32)[0] = "None";
        ((java.lang.Object[]) initialValue32)[1] = "Sword";
        ((java.lang.Object[]) initialValue32)[2] = "Bow";
        ((java.lang.Object[]) initialValue32)[3] = "Rod";
        ((java.lang.Object[]) initialValue32)[4] = "Throwables";
        ((java.lang.Object[]) initialValue32)[5] = "Blocks";
        ((java.lang.Object[]) initialValue32)[6] = "EnderPearls";
        ((java.lang.Object[]) initialValue32)[7] = "Food";
        ((java.lang.Object[]) initialValue32)[8] = "Gapple";
        ((java.lang.Object[]) initialValue32)[9] = "Soups";
        recovery$indy$flow$1883(this, initialValue32);
        java.lang.Object initialValue33 = recovery$indy$flow$1885();
        client.setting.MultiSelectSetting initialized34 = new client.setting.MultiSelectSetting(this, "Actions", constructorKey16, (net.C_47OZ[]) (initialValue33));
        recovery$indy$flow$1887(this, initialized34);
        java.lang.Object initialValue35 = recovery$indy$flow$1889(4);
        ((java.lang.Object[]) initialValue35)[0] = "OpenInv";
        ((java.lang.Object[]) initialValue35)[1] = "SpoofInv";
        ((java.lang.Object[]) initialValue35)[2] = "SpoofInvOther";
        ((java.lang.Object[]) initialValue35)[3] = "Basic";
        client.setting.ModeSetting initialized36 = new client.setting.ModeSetting(this, "Mode", constructorKey23, "OpenInv", (java.lang.String[]) (initialValue35));
        recovery$indy$flow$1891(this, initialized36);
        short converted37 = (short) (constructorPart18);
        short converted38 = (short) (constructorPart19);
        client.setting.RangeSetting initialized39 = new client.setting.RangeSetting(constructorPart17, this, "StartDelay", Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4641240890982006784L), converted37, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted38);
        long initialValue40 = constructorKey8;
        client.setting.RangeSetting initialValue41 = initialized39;
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue43 = recovery$indy$flow$1895(initialValue42, initialValue40);
        recovery$indy$flow$1896(this, initialValue43);
        client.setting.BooleanSetting initialized44 = new client.setting.BooleanSetting(this, constructorKey11, "BlockInputWhileManaging", true);
        recovery$indy$flow$1899(this, initialized44);
        client.setting.BooleanSetting initialized45 = new client.setting.BooleanSetting(this, constructorKey11, "Visualize", true);
        recovery$indy$flow$1902(this, initialized45);
        client.setting.BooleanSetting initialized46 = new client.setting.BooleanSetting(this, constructorKey11, "NotWhileScaffold", true);
        recovery$indy$flow$1905(this, initialized46);
        client.setting.BooleanSetting initialized47 = new client.setting.BooleanSetting(this, constructorKey11, "StopMovement", false);
        java.lang.Object initialValue48 = recovery$indy$flow$1908(this);
        java.lang.Object initialValue49 = initialValue48;
        long initialValue50 = constructorKey4;
        client.setting.BooleanSetting initialValue51 = initialized47;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue54 = recovery$indy$flow$1911(initialValue52, initialValue50, initialValue53);
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue54))))));
        recovery$indy$flow$1913(this, initialValue55);
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, constructorKey11, "StopSprinting", false);
        java.lang.Object initialValue57 = recovery$indy$flow$1916(this);
        java.lang.Object initialValue58 = initialValue57;
        long initialValue59 = constructorKey4;
        client.setting.BooleanSetting initialValue60 = initialized56;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue63 = recovery$indy$flow$1919(initialValue61, initialValue59, initialValue62);
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue63))))));
        recovery$indy$flow$1921(this, initialValue64);
        client.setting.SettingGroup initialized65 = new client.setting.SettingGroup(this, "Sort", constructorKey9);
        java.lang.Object initialValue66 = recovery$indy$flow$1924();
        java.lang.Object initialValue67 = recovery$indy$flow$1925(initialValue66);
        java.lang.Object initialValue68 = recovery$indy$flow$1926(initialValue66);
        char converted69 = (char) (constructorPart25);
        java.lang.Object initialValue70 = initialValue68;
        int initialValue71 = constructorPart26;
        int initialValue72 = (int) (converted69);
        int initialValue73 = constructorPart24;
        client.setting.SettingGroup initialValue74 = initialized65;
        java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue76 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue77 = recovery$indy$flow$1929(initialValue75, initialValue73, (char) (initialValue72), initialValue71, initialValue76);
        recovery$indy$flow$1930(this, initialValue77);
        short converted78 = (short) (constructorPart20);
        char converted79 = (char) (constructorPart21);
        java.lang.Object initialValue80 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.BooleanSetting initialized81 = new client.setting.BooleanSetting(this, "SortInstant", converted78, converted79, constructorPart22, false, (client.setting.SettingGroup) (initialValue80));
        long initialValue82 = constructorKey10;
        java.lang.String initialValue83 = "Instant";
        client.setting.BooleanSetting initialValue84 = initialized81;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue84))))));
        java.lang.Object initialValue86 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue87 = recovery$indy$flow$1936(initialValue85, initialValue86, initialValue82);
        java.lang.Object initialValue88 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue87))))));
        recovery$indy$flow$1938(this, initialValue88);
        java.lang.Object initialValue89 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.NumberSetting initialized90 = new client.setting.NumberSetting(this, "SortMaxMouseMoveSpeed", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue89), constructorKey31);
        short converted91 = (short) (constructorPart7);
        int initialValue92 = (int) (converted91);
        int initialValue93 = constructorPart6;
        java.lang.String initialValue94 = "MaxMouseMoveSpeed";
        int initialValue95 = constructorPart5;
        client.setting.NumberSetting initialValue96 = initialized90;
        java.lang.Object initialValue97 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue96))))));
        java.lang.Object initialValue98 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue94))))));
        java.lang.Object initialValue99 = recovery$indy$flow$1944(initialValue97, initialValue95, initialValue98, initialValue93, (short) (initialValue92));
        java.lang.Object initialValue100 = recovery$indy$flow$1945(this);
        java.lang.Object initialValue101 = initialValue100;
        java.lang.Object initialValue102 = initialValue99;
        java.lang.Object initialValue103 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue104 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue105 = recovery$indy$flow$1948(initialValue103, initialValue104);
        recovery$indy$flow$1949(this, initialValue105);
        java.lang.Object initialValue106 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.RangeSetting initialized107 = new client.setting.RangeSetting(constructorPart28, this, "SortMouseMoveRandom", constructorPart29, constructorPart30, 0.0D, 0.0D, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue106));
        long initialValue108 = constructorKey8;
        client.setting.RangeSetting initialValue109 = initialized107;
        java.lang.Object initialValue110 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue111 = recovery$indy$flow$1954(initialValue110, initialValue108);
        java.lang.String initialValue112 = "MouseMoveRandom";
        long initialValue113 = constructorKey3;
        java.lang.Object initialValue114 = initialValue111;
        java.lang.Object initialValue115 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue114))))));
        java.lang.Object initialValue116 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue112))))));
        java.lang.Object initialValue117 = recovery$indy$flow$1957(initialValue115, initialValue113, initialValue116);
        java.lang.Object initialValue118 = recovery$indy$flow$1958(this);
        long initialValue119 = constructorKey14;
        java.lang.Object initialValue120 = initialValue118;
        int initialValue121 = constructorPart13;
        java.lang.Object initialValue122 = initialValue117;
        java.lang.Object initialValue123 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue122))))));
        java.lang.Object initialValue124 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue125 = recovery$indy$flow$1961(initialValue123, initialValue121, initialValue124, initialValue119);
        recovery$indy$flow$1962(this, initialValue125);
        java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.RangeSetting initialized127 = new client.setting.RangeSetting(constructorPart28, this, "SortCPS", constructorPart29, constructorPart30, Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue126));
        java.lang.String initialValue128 = "CPS";
        long initialValue129 = constructorKey3;
        client.setting.RangeSetting initialValue130 = initialized127;
        java.lang.Object initialValue131 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue132 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue133 = recovery$indy$flow$1968(initialValue131, initialValue129, initialValue132);
        java.lang.Object initialValue134 = recovery$indy$flow$1969(this);
        long initialValue135 = constructorKey14;
        java.lang.Object initialValue136 = initialValue134;
        int initialValue137 = constructorPart13;
        java.lang.Object initialValue138 = initialValue133;
        java.lang.Object initialValue139 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue138))))));
        java.lang.Object initialValue140 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue136))))));
        java.lang.Object initialValue141 = recovery$indy$flow$1972(initialValue139, initialValue137, initialValue140, initialValue135);
        recovery$indy$flow$1973(this, initialValue141);
        java.lang.Object initialValue142 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.RangeSetting initialized143 = new client.setting.RangeSetting(constructorPart28, this, "SortCPSRecalculate", constructorPart29, constructorPart30, Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue142));
        long initialValue144 = constructorKey8;
        client.setting.RangeSetting initialValue145 = initialized143;
        java.lang.Object initialValue146 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue145))))));
        java.lang.Object initialValue147 = recovery$indy$flow$1978(initialValue146, initialValue144);
        java.lang.String initialValue148 = "CPSRecalculate";
        long initialValue149 = constructorKey3;
        java.lang.Object initialValue150 = initialValue147;
        java.lang.Object initialValue151 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue150))))));
        java.lang.Object initialValue152 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue153 = recovery$indy$flow$1981(initialValue151, initialValue149, initialValue152);
        java.lang.Object initialValue154 = recovery$indy$flow$1982(this);
        long initialValue155 = constructorKey14;
        java.lang.Object initialValue156 = initialValue154;
        int initialValue157 = constructorPart13;
        java.lang.Object initialValue158 = initialValue153;
        java.lang.Object initialValue159 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue158))))));
        java.lang.Object initialValue160 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue161 = recovery$indy$flow$1985(initialValue159, initialValue157, initialValue160, initialValue155);
        recovery$indy$flow$1986(this, initialValue161);
        java.lang.Object initialValue162 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.RangeSetting initialized163 = new client.setting.RangeSetting(constructorPart28, this, "SortFailRate", constructorPart29, constructorPart30, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue162));
        java.lang.String initialValue164 = "FailRate";
        long initialValue165 = constructorKey3;
        client.setting.RangeSetting initialValue166 = initialized163;
        java.lang.Object initialValue167 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue166))))));
        java.lang.Object initialValue168 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue164))))));
        java.lang.Object initialValue169 = recovery$indy$flow$1992(initialValue167, initialValue165, initialValue168);
        long initialValue170 = constructorKey8;
        java.lang.Object initialValue171 = initialValue169;
        java.lang.Object initialValue172 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue171))))));
        java.lang.Object initialValue173 = recovery$indy$flow$1994(initialValue172, initialValue170);
        java.lang.Object initialValue174 = recovery$indy$flow$1995(this);
        long initialValue175 = constructorKey14;
        java.lang.Object initialValue176 = initialValue174;
        int initialValue177 = constructorPart13;
        java.lang.Object initialValue178 = initialValue173;
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue176))))));
        java.lang.Object initialValue181 = recovery$indy$flow$1998(initialValue179, initialValue177, initialValue180, initialValue175);
        recovery$indy$flow$1999(this, initialValue181);
        java.lang.Object initialValue182 = recovery$indy$flow$2001(3);
        ((java.lang.Object[]) initialValue182)[0] = "Basic";
        ((java.lang.Object[]) initialValue182)[1] = "Nearest";
        ((java.lang.Object[]) initialValue182)[2] = "Random";
        java.lang.Object initialValue183 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.ModeSetting initialized184 = new client.setting.ModeSetting(this, "SortSequence", "Nearest", (java.lang.String[]) (initialValue182), (client.setting.SettingGroup) (initialValue183), constructorKey15);
        recovery$indy$flow$2004(this, initialized184);
        java.lang.Object initialValue185 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSort));
        client.setting.SettingGroup initialized186 = new client.setting.SettingGroup(constructorKey12, this, "Slots", (client.setting.SettingGroup) (initialValue185));
        recovery$indy$flow$2008(this, initialized186);
        java.lang.Object initialValue187 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue188 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized189 = new client.setting.ModeSetting(this, "Slot1", "Sword", (java.lang.String[]) (initialValue187), (client.setting.SettingGroup) (initialValue188), constructorKey15);
        recovery$indy$flow$2013(this, initialized189);
        java.lang.Object initialValue190 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue191 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized192 = new client.setting.ModeSetting(this, "Slot2", "Bow", (java.lang.String[]) (initialValue190), (client.setting.SettingGroup) (initialValue191), constructorKey15);
        recovery$indy$flow$2018(this, initialized192);
        java.lang.Object initialValue193 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue194 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized195 = new client.setting.ModeSetting(this, "Slot3", "Throwables", (java.lang.String[]) (initialValue193), (client.setting.SettingGroup) (initialValue194), constructorKey15);
        recovery$indy$flow$2023(this, initialized195);
        java.lang.Object initialValue196 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue197 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized198 = new client.setting.ModeSetting(this, "Slot4", "Blocks", (java.lang.String[]) (initialValue196), (client.setting.SettingGroup) (initialValue197), constructorKey15);
        recovery$indy$flow$2028(this, initialized198);
        java.lang.Object initialValue199 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue200 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized201 = new client.setting.ModeSetting(this, "Slot5", "Blocks", (java.lang.String[]) (initialValue199), (client.setting.SettingGroup) (initialValue200), constructorKey15);
        recovery$indy$flow$2033(this, initialized201);
        java.lang.Object initialValue202 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue203 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized204 = new client.setting.ModeSetting(this, "Slot6", "None", (java.lang.String[]) (initialValue202), (client.setting.SettingGroup) (initialValue203), constructorKey15);
        recovery$indy$flow$2038(this, initialized204);
        java.lang.Object initialValue205 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue206 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized207 = new client.setting.ModeSetting(this, "Slot7", "None", (java.lang.String[]) (initialValue205), (client.setting.SettingGroup) (initialValue206), constructorKey15);
        recovery$indy$flow$2043(this, initialized207);
        java.lang.Object initialValue208 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue209 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized210 = new client.setting.ModeSetting(this, "Slot8", "Food", (java.lang.String[]) (initialValue208), (client.setting.SettingGroup) (initialValue209), constructorKey15);
        recovery$indy$flow$2048(this, initialized210);
        java.lang.Object initialValue211 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).field_40));
        java.lang.Object initialValue212 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingSlots));
        client.setting.ModeSetting initialized213 = new client.setting.ModeSetting(this, "Slot9", "Gapple", (java.lang.String[]) (initialValue211), (client.setting.SettingGroup) (initialValue212), constructorKey15);
        recovery$indy$flow$2053(this, initialized213);
        client.setting.SettingGroup initialized214 = new client.setting.SettingGroup(this, "Armor", constructorKey9);
        java.lang.Object initialValue215 = recovery$indy$flow$2056();
        java.lang.Object initialValue216 = recovery$indy$flow$2057(initialValue215);
        java.lang.Object initialValue217 = recovery$indy$flow$2058(initialValue215);
        char converted218 = (char) (constructorPart25);
        java.lang.Object initialValue219 = initialValue217;
        int initialValue220 = constructorPart26;
        int initialValue221 = (int) (converted218);
        int initialValue222 = constructorPart24;
        client.setting.SettingGroup initialValue223 = initialized214;
        java.lang.Object initialValue224 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue223))))));
        java.lang.Object initialValue225 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue219))))));
        java.lang.Object initialValue226 = recovery$indy$flow$2061(initialValue224, initialValue222, (char) (initialValue221), initialValue220, initialValue225);
        recovery$indy$flow$2062(this, initialValue226);
        short converted227 = (short) (constructorPart20);
        char converted228 = (char) (constructorPart21);
        java.lang.Object initialValue229 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.BooleanSetting initialized230 = new client.setting.BooleanSetting(this, "NoArmorDrop", converted227, converted228, constructorPart22, false, (client.setting.SettingGroup) (initialValue229));
        recovery$indy$flow$2066(this, initialized230);
        short converted231 = (short) (constructorPart20);
        char converted232 = (char) (constructorPart21);
        java.lang.Object initialValue233 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.BooleanSetting initialized234 = new client.setting.BooleanSetting(this, "OnlyInHotbar", converted231, converted232, constructorPart22, false, (client.setting.SettingGroup) (initialValue233));
        recovery$indy$flow$2070(this, initialized234);
        short converted235 = (short) (constructorPart20);
        char converted236 = (char) (constructorPart21);
        java.lang.Object initialValue237 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.BooleanSetting initialized238 = new client.setting.BooleanSetting(this, "IgnoreDurability", converted235, converted236, constructorPart22, false, (client.setting.SettingGroup) (initialValue237));
        recovery$indy$flow$2074(this, initialized238);
        short converted239 = (short) (constructorPart20);
        char converted240 = (char) (constructorPart21);
        java.lang.Object initialValue241 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.BooleanSetting initialized242 = new client.setting.BooleanSetting(this, "ArmorInstant", converted239, converted240, constructorPart22, false, (client.setting.SettingGroup) (initialValue241));
        long initialValue243 = constructorKey10;
        java.lang.String initialValue244 = "Instant";
        client.setting.BooleanSetting initialValue245 = initialized242;
        java.lang.Object initialValue246 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue245))))));
        java.lang.Object initialValue247 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue244))))));
        java.lang.Object initialValue248 = recovery$indy$flow$2080(initialValue246, initialValue247, initialValue243);
        java.lang.Object initialValue249 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue248))))));
        recovery$indy$flow$2082(this, initialValue249);
        java.lang.Object initialValue250 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.NumberSetting initialized251 = new client.setting.NumberSetting(this, "ArmorMaxMouseMoveSpeed", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue250), constructorKey31);
        short converted252 = (short) (constructorPart7);
        int initialValue253 = (int) (converted252);
        int initialValue254 = constructorPart6;
        java.lang.String initialValue255 = "MaxMouseMoveSpeed";
        int initialValue256 = constructorPart5;
        client.setting.NumberSetting initialValue257 = initialized251;
        java.lang.Object initialValue258 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue257))))));
        java.lang.Object initialValue259 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue255))))));
        java.lang.Object initialValue260 = recovery$indy$flow$2088(initialValue258, initialValue256, initialValue259, initialValue254, (short) (initialValue253));
        java.lang.Object initialValue261 = recovery$indy$flow$2089(this);
        java.lang.Object initialValue262 = initialValue261;
        java.lang.Object initialValue263 = initialValue260;
        java.lang.Object initialValue264 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue263))))));
        java.lang.Object initialValue265 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue262))))));
        java.lang.Object initialValue266 = recovery$indy$flow$2092(initialValue264, initialValue265);
        recovery$indy$flow$2093(this, initialValue266);
        java.lang.Object initialValue267 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized268 = new client.setting.RangeSetting(constructorPart28, this, "ArmorMouseMoveRandom", constructorPart29, constructorPart30, 0.0D, 0.0D, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue267));
        long initialValue269 = constructorKey8;
        client.setting.RangeSetting initialValue270 = initialized268;
        java.lang.Object initialValue271 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue270))))));
        java.lang.Object initialValue272 = recovery$indy$flow$2098(initialValue271, initialValue269);
        java.lang.String initialValue273 = "MouseMoveRandom";
        long initialValue274 = constructorKey3;
        java.lang.Object initialValue275 = initialValue272;
        java.lang.Object initialValue276 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue275))))));
        java.lang.Object initialValue277 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue273))))));
        java.lang.Object initialValue278 = recovery$indy$flow$2101(initialValue276, initialValue274, initialValue277);
        java.lang.Object initialValue279 = recovery$indy$flow$2102(this);
        long initialValue280 = constructorKey14;
        java.lang.Object initialValue281 = initialValue279;
        int initialValue282 = constructorPart13;
        java.lang.Object initialValue283 = initialValue278;
        java.lang.Object initialValue284 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue283))))));
        java.lang.Object initialValue285 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue281))))));
        java.lang.Object initialValue286 = recovery$indy$flow$2105(initialValue284, initialValue282, initialValue285, initialValue280);
        recovery$indy$flow$2106(this, initialValue286);
        java.lang.Object initialValue287 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized288 = new client.setting.RangeSetting(constructorPart28, this, "ArmorCPS", constructorPart29, constructorPart30, Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue287));
        java.lang.String initialValue289 = "CPS";
        long initialValue290 = constructorKey3;
        client.setting.RangeSetting initialValue291 = initialized288;
        java.lang.Object initialValue292 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue291))))));
        java.lang.Object initialValue293 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue289))))));
        java.lang.Object initialValue294 = recovery$indy$flow$2112(initialValue292, initialValue290, initialValue293);
        java.lang.Object initialValue295 = recovery$indy$flow$2113(this);
        long initialValue296 = constructorKey14;
        java.lang.Object initialValue297 = initialValue295;
        int initialValue298 = constructorPart13;
        java.lang.Object initialValue299 = initialValue294;
        java.lang.Object initialValue300 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue299))))));
        java.lang.Object initialValue301 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue297))))));
        java.lang.Object initialValue302 = recovery$indy$flow$2116(initialValue300, initialValue298, initialValue301, initialValue296);
        recovery$indy$flow$2117(this, initialValue302);
        java.lang.Object initialValue303 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized304 = new client.setting.RangeSetting(constructorPart28, this, "ArmorCPSRecalculate", constructorPart29, constructorPart30, Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue303));
        long initialValue305 = constructorKey8;
        client.setting.RangeSetting initialValue306 = initialized304;
        java.lang.Object initialValue307 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue306))))));
        java.lang.Object initialValue308 = recovery$indy$flow$2122(initialValue307, initialValue305);
        java.lang.String initialValue309 = "CPSRecalculate";
        long initialValue310 = constructorKey3;
        java.lang.Object initialValue311 = initialValue308;
        java.lang.Object initialValue312 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue311))))));
        java.lang.Object initialValue313 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue309))))));
        java.lang.Object initialValue314 = recovery$indy$flow$2125(initialValue312, initialValue310, initialValue313);
        java.lang.Object initialValue315 = recovery$indy$flow$2126(this);
        long initialValue316 = constructorKey14;
        java.lang.Object initialValue317 = initialValue315;
        int initialValue318 = constructorPart13;
        java.lang.Object initialValue319 = initialValue314;
        java.lang.Object initialValue320 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue319))))));
        java.lang.Object initialValue321 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue317))))));
        java.lang.Object initialValue322 = recovery$indy$flow$2129(initialValue320, initialValue318, initialValue321, initialValue316);
        recovery$indy$flow$2130(this, initialValue322);
        java.lang.Object initialValue323 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized324 = new client.setting.RangeSetting(constructorPart28, this, "ArmorDoubleClickRate", constructorPart29, constructorPart30, 0.0D, 0.0D, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue323));
        java.lang.String initialValue325 = "DoubleClickRate";
        long initialValue326 = constructorKey3;
        client.setting.RangeSetting initialValue327 = initialized324;
        java.lang.Object initialValue328 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue327))))));
        java.lang.Object initialValue329 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue325))))));
        java.lang.Object initialValue330 = recovery$indy$flow$2136(initialValue328, initialValue326, initialValue329);
        long initialValue331 = constructorKey8;
        java.lang.Object initialValue332 = initialValue330;
        java.lang.Object initialValue333 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue332))))));
        java.lang.Object initialValue334 = recovery$indy$flow$2138(initialValue333, initialValue331);
        java.lang.Object initialValue335 = recovery$indy$flow$2139(this);
        long initialValue336 = constructorKey14;
        java.lang.Object initialValue337 = initialValue335;
        int initialValue338 = constructorPart13;
        java.lang.Object initialValue339 = initialValue334;
        java.lang.Object initialValue340 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue339))))));
        java.lang.Object initialValue341 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue337))))));
        java.lang.Object initialValue342 = recovery$indy$flow$2142(initialValue340, initialValue338, initialValue341, initialValue336);
        recovery$indy$flow$2143(this, initialValue342);
        java.lang.Object initialValue343 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized344 = new client.setting.RangeSetting(constructorPart28, this, "ArmorFailRate", constructorPart29, constructorPart30, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue343));
        java.lang.String initialValue345 = "FailRate";
        long initialValue346 = constructorKey3;
        client.setting.RangeSetting initialValue347 = initialized344;
        java.lang.Object initialValue348 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue347))))));
        java.lang.Object initialValue349 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue345))))));
        java.lang.Object initialValue350 = recovery$indy$flow$2149(initialValue348, initialValue346, initialValue349);
        long initialValue351 = constructorKey8;
        java.lang.Object initialValue352 = initialValue350;
        java.lang.Object initialValue353 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue352))))));
        java.lang.Object initialValue354 = recovery$indy$flow$2151(initialValue353, initialValue351);
        java.lang.Object initialValue355 = recovery$indy$flow$2152(this);
        long initialValue356 = constructorKey14;
        java.lang.Object initialValue357 = initialValue355;
        int initialValue358 = constructorPart13;
        java.lang.Object initialValue359 = initialValue354;
        java.lang.Object initialValue360 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue359))))));
        java.lang.Object initialValue361 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue357))))));
        java.lang.Object initialValue362 = recovery$indy$flow$2155(initialValue360, initialValue358, initialValue361, initialValue356);
        recovery$indy$flow$2156(this, initialValue362);
        java.lang.Object initialValue363 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.RangeSetting initialized364 = new client.setting.RangeSetting(constructorPart28, this, "ArmorMissClickRate", constructorPart29, constructorPart30, 0.0D, 0.0D, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue363));
        long initialValue365 = constructorKey8;
        client.setting.RangeSetting initialValue366 = initialized364;
        java.lang.Object initialValue367 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue366))))));
        java.lang.Object initialValue368 = recovery$indy$flow$2161(initialValue367, initialValue365);
        java.lang.String initialValue369 = "MissClickRate";
        long initialValue370 = constructorKey3;
        java.lang.Object initialValue371 = initialValue368;
        java.lang.Object initialValue372 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue371))))));
        java.lang.Object initialValue373 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue369))))));
        java.lang.Object initialValue374 = recovery$indy$flow$2164(initialValue372, initialValue370, initialValue373);
        java.lang.Object initialValue375 = recovery$indy$flow$2165(this);
        long initialValue376 = constructorKey14;
        java.lang.Object initialValue377 = initialValue375;
        int initialValue378 = constructorPart13;
        java.lang.Object initialValue379 = initialValue374;
        java.lang.Object initialValue380 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue379))))));
        java.lang.Object initialValue381 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue377))))));
        java.lang.Object initialValue382 = recovery$indy$flow$2168(initialValue380, initialValue378, initialValue381, initialValue376);
        recovery$indy$flow$2169(this, initialValue382);
        java.lang.Object initialValue383 = recovery$indy$flow$2171(3);
        ((java.lang.Object[]) initialValue383)[0] = "Basic";
        ((java.lang.Object[]) initialValue383)[1] = "Nearest";
        ((java.lang.Object[]) initialValue383)[2] = "Random";
        java.lang.Object initialValue384 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmor));
        client.setting.ModeSetting initialized385 = new client.setting.ModeSetting(this, "ArmorSequence", "Nearest", (java.lang.String[]) (initialValue383), (client.setting.SettingGroup) (initialValue384), constructorKey15);
        recovery$indy$flow$2174(this, initialized385);
        client.setting.SettingGroup initialized386 = new client.setting.SettingGroup(this, "Clean", constructorKey9);
        java.lang.Object initialValue387 = recovery$indy$flow$2177();
        java.lang.Object initialValue388 = recovery$indy$flow$2178(initialValue387);
        java.lang.Object initialValue389 = recovery$indy$flow$2179(initialValue387);
        char converted390 = (char) (constructorPart25);
        java.lang.Object initialValue391 = initialValue389;
        int initialValue392 = constructorPart26;
        int initialValue393 = (int) (converted390);
        int initialValue394 = constructorPart24;
        client.setting.SettingGroup initialValue395 = initialized386;
        java.lang.Object initialValue396 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue395))))));
        java.lang.Object initialValue397 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue391))))));
        java.lang.Object initialValue398 = recovery$indy$flow$2182(initialValue396, initialValue394, (char) (initialValue393), initialValue392, initialValue397);
        recovery$indy$flow$2183(this, initialValue398);
        boolean initialValue399 = recovery$indy$flow$2184();
        short converted400 = (short) (constructorPart20);
        char converted401 = (char) (constructorPart21);
        java.lang.Object initialValue402 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.BooleanSetting initialized403 = new client.setting.BooleanSetting(this, "KeepAllArmor", converted400, converted401, constructorPart22, false, (client.setting.SettingGroup) (initialValue402));
        recovery$indy$flow$2188(this, initialized403);
        short converted404 = (short) (constructorPart20);
        char converted405 = (char) (constructorPart21);
        java.lang.Object initialValue406 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.BooleanSetting initialized407 = new client.setting.BooleanSetting(this, "CleanInstant", converted404, converted405, constructorPart22, false, (client.setting.SettingGroup) (initialValue406));
        long initialValue408 = constructorKey10;
        java.lang.String initialValue409 = "Instant";
        client.setting.BooleanSetting initialValue410 = initialized407;
        java.lang.Object initialValue411 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue410))))));
        java.lang.Object initialValue412 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue409))))));
        java.lang.Object initialValue413 = recovery$indy$flow$2194(initialValue411, initialValue412, initialValue408);
        java.lang.Object initialValue414 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue413))))));
        recovery$indy$flow$2196(this, initialValue414);
        java.lang.Object initialValue415 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.NumberSetting initialized416 = new client.setting.NumberSetting(this, "CleanMaxMouseMoveSpeed", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue415), constructorKey31);
        short converted417 = (short) (constructorPart7);
        int initialValue418 = (int) (converted417);
        int initialValue419 = constructorPart6;
        java.lang.String initialValue420 = "MaxMouseMoveSpeed";
        int initialValue421 = constructorPart5;
        client.setting.NumberSetting initialValue422 = initialized416;
        java.lang.Object initialValue423 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue422))))));
        java.lang.Object initialValue424 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue420))))));
        java.lang.Object initialValue425 = recovery$indy$flow$2202(initialValue423, initialValue421, initialValue424, initialValue419, (short) (initialValue418));
        java.lang.Object initialValue426 = recovery$indy$flow$2203(this);
        java.lang.Object initialValue427 = initialValue426;
        java.lang.Object initialValue428 = initialValue425;
        java.lang.Object initialValue429 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue428))))));
        java.lang.Object initialValue430 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue427))))));
        java.lang.Object initialValue431 = recovery$indy$flow$2206(initialValue429, initialValue430);
        recovery$indy$flow$2207(this, initialValue431);
        java.lang.Object initialValue432 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.RangeSetting initialized433 = new client.setting.RangeSetting(constructorPart28, this, "CleanMouseMoveRandom", constructorPart29, constructorPart30, 0.0D, 0.0D, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue432));
        long initialValue434 = constructorKey8;
        client.setting.RangeSetting initialValue435 = initialized433;
        java.lang.Object initialValue436 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue435))))));
        java.lang.Object initialValue437 = recovery$indy$flow$2212(initialValue436, initialValue434);
        java.lang.String initialValue438 = "MouseMoveRandom";
        long initialValue439 = constructorKey3;
        java.lang.Object initialValue440 = initialValue437;
        java.lang.Object initialValue441 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue440))))));
        java.lang.Object initialValue442 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue438))))));
        java.lang.Object initialValue443 = recovery$indy$flow$2215(initialValue441, initialValue439, initialValue442);
        java.lang.Object initialValue444 = recovery$indy$flow$2216(this);
        long initialValue445 = constructorKey14;
        java.lang.Object initialValue446 = initialValue444;
        int initialValue447 = constructorPart13;
        java.lang.Object initialValue448 = initialValue443;
        java.lang.Object initialValue449 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue448))))));
        java.lang.Object initialValue450 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue446))))));
        java.lang.Object initialValue451 = recovery$indy$flow$2219(initialValue449, initialValue447, initialValue450, initialValue445);
        recovery$indy$flow$2220(this, initialValue451);
        java.lang.Object initialValue452 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.RangeSetting initialized453 = new client.setting.RangeSetting(constructorPart28, this, "CleanCPS", constructorPart29, constructorPart30, Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue452));
        java.lang.String initialValue454 = "CPS";
        long initialValue455 = constructorKey3;
        client.setting.RangeSetting initialValue456 = initialized453;
        java.lang.Object initialValue457 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue456))))));
        java.lang.Object initialValue458 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue454))))));
        java.lang.Object initialValue459 = recovery$indy$flow$2226(initialValue457, initialValue455, initialValue458);
        java.lang.Object initialValue460 = recovery$indy$flow$2227(this);
        long initialValue461 = constructorKey14;
        java.lang.Object initialValue462 = initialValue460;
        int initialValue463 = constructorPart13;
        java.lang.Object initialValue464 = initialValue459;
        java.lang.Object initialValue465 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue464))))));
        java.lang.Object initialValue466 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue462))))));
        java.lang.Object initialValue467 = recovery$indy$flow$2230(initialValue465, initialValue463, initialValue466, initialValue461);
        recovery$indy$flow$2231(this, initialValue467);
        int initialValue468 = (int) ((initialValue399 ? 1 : 0));
        java.lang.Object initialValue469 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.RangeSetting initialized470 = new client.setting.RangeSetting(constructorPart28, this, "CleanCPSRecalculate", constructorPart29, constructorPart30, Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue469));
        long initialValue471 = constructorKey8;
        client.setting.RangeSetting initialValue472 = initialized470;
        java.lang.Object initialValue473 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue472))))));
        java.lang.Object initialValue474 = recovery$indy$flow$2236(initialValue473, initialValue471);
        java.lang.String initialValue475 = "CPSRecalculate";
        long initialValue476 = constructorKey3;
        java.lang.Object initialValue477 = initialValue474;
        java.lang.Object initialValue478 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue477))))));
        java.lang.Object initialValue479 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue475))))));
        java.lang.Object initialValue480 = recovery$indy$flow$2239(initialValue478, initialValue476, initialValue479);
        java.lang.Object initialValue481 = recovery$indy$flow$2240(this);
        long initialValue482 = constructorKey14;
        java.lang.Object initialValue483 = initialValue481;
        int initialValue484 = constructorPart13;
        java.lang.Object initialValue485 = initialValue480;
        java.lang.Object initialValue486 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue485))))));
        java.lang.Object initialValue487 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue483))))));
        java.lang.Object initialValue488 = recovery$indy$flow$2243(initialValue486, initialValue484, initialValue487, initialValue482);
        recovery$indy$flow$2244(this, initialValue488);
        java.lang.Object initialValue489 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.RangeSetting initialized490 = new client.setting.RangeSetting(constructorPart28, this, "CleanFailRate", constructorPart29, constructorPart30, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4624633867356078080L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue489));
        java.lang.String initialValue491 = "FailRate";
        long initialValue492 = constructorKey3;
        client.setting.RangeSetting initialValue493 = initialized490;
        java.lang.Object initialValue494 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue493))))));
        java.lang.Object initialValue495 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue491))))));
        java.lang.Object initialValue496 = recovery$indy$flow$2250(initialValue494, initialValue492, initialValue495);
        long initialValue497 = constructorKey8;
        java.lang.Object initialValue498 = initialValue496;
        java.lang.Object initialValue499 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue498))))));
        java.lang.Object initialValue500 = recovery$indy$flow$2252(initialValue499, initialValue497);
        java.lang.Object initialValue501 = recovery$indy$flow$2253(this);
        long initialValue502 = constructorKey14;
        java.lang.Object initialValue503 = initialValue501;
        int initialValue504 = constructorPart13;
        java.lang.Object initialValue505 = initialValue500;
        java.lang.Object initialValue506 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue505))))));
        java.lang.Object initialValue507 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue503))))));
        java.lang.Object initialValue508 = recovery$indy$flow$2256(initialValue506, initialValue504, initialValue507, initialValue502);
        recovery$indy$flow$2257(this, initialValue508);
        java.lang.Object initialValue509 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.RangeSetting initialized510 = new client.setting.RangeSetting(constructorPart28, this, "CleanMissClickRate", constructorPart29, constructorPart30, 0.0D, 0.0D, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue509));
        long initialValue511 = constructorKey8;
        client.setting.RangeSetting initialValue512 = initialized510;
        java.lang.Object initialValue513 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue512))))));
        java.lang.Object initialValue514 = recovery$indy$flow$2262(initialValue513, initialValue511);
        java.lang.String initialValue515 = "MissClickRate";
        long initialValue516 = constructorKey3;
        java.lang.Object initialValue517 = initialValue514;
        java.lang.Object initialValue518 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue517))))));
        java.lang.Object initialValue519 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue515))))));
        java.lang.Object initialValue520 = recovery$indy$flow$2265(initialValue518, initialValue516, initialValue519);
        java.lang.Object initialValue521 = recovery$indy$flow$2266(this);
        long initialValue522 = constructorKey14;
        java.lang.Object initialValue523 = initialValue521;
        int initialValue524 = constructorPart13;
        java.lang.Object initialValue525 = initialValue520;
        java.lang.Object initialValue526 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue525))))));
        java.lang.Object initialValue527 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue523))))));
        java.lang.Object initialValue528 = recovery$indy$flow$2269(initialValue526, initialValue524, initialValue527, initialValue522);
        recovery$indy$flow$2270(this, initialValue528);
        java.lang.Object initialValue529 = recovery$indy$flow$2272(3);
        ((java.lang.Object[]) initialValue529)[0] = "Basic";
        ((java.lang.Object[]) initialValue529)[1] = "Nearest";
        ((java.lang.Object[]) initialValue529)[2] = "Random";
        java.lang.Object initialValue530 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.ModeSetting initialized531 = new client.setting.ModeSetting(this, "CleanerSequence", "Nearest", (java.lang.String[]) (initialValue529), (client.setting.SettingGroup) (initialValue530), constructorKey15);
        recovery$indy$flow$2275(this, initialized531);
        java.lang.Object initialValue532 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.SettingGroup initialized533 = new client.setting.SettingGroup(constructorKey12, this, "ItemsToDrop", (client.setting.SettingGroup) (initialValue532));
        java.lang.Object initialValue534 = recovery$indy$flow$2279();
        java.lang.Object initialValue535 = recovery$indy$flow$2280(initialValue534);
        java.lang.Object initialValue536 = recovery$indy$flow$2281(initialValue534);
        char converted537 = (char) (constructorPart25);
        java.lang.Object initialValue538 = initialValue536;
        int initialValue539 = constructorPart26;
        int initialValue540 = (int) (converted537);
        int initialValue541 = constructorPart24;
        client.setting.SettingGroup initialValue542 = initialized533;
        java.lang.Object initialValue543 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue542))))));
        java.lang.Object initialValue544 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue538))))));
        java.lang.Object initialValue545 = recovery$indy$flow$2284(initialValue543, initialValue541, (char) (initialValue540), initialValue539, initialValue544);
        recovery$indy$flow$2285(this, initialValue545);
        java.lang.Object initialValue546 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingClean));
        client.setting.SettingGroup initialized547 = new client.setting.SettingGroup(constructorKey12, this, "ItemStackLimits", (client.setting.SettingGroup) (initialValue546));
        java.lang.Object initialValue548 = recovery$indy$flow$2289();
        java.lang.Object initialValue549 = recovery$indy$flow$2290(initialValue548);
        java.lang.Object initialValue550 = recovery$indy$flow$2291(initialValue548);
        char converted551 = (char) (constructorPart25);
        java.lang.Object initialValue552 = initialValue550;
        int initialValue553 = constructorPart26;
        int initialValue554 = (int) (converted551);
        int initialValue555 = constructorPart24;
        client.setting.SettingGroup initialValue556 = initialized547;
        java.lang.Object initialValue557 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue556))))));
        java.lang.Object initialValue558 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue552))))));
        java.lang.Object initialValue559 = recovery$indy$flow$2294(initialValue557, initialValue555, (char) (initialValue554), initialValue553, initialValue558);
        recovery$indy$flow$2295(this, initialValue559);
        java.lang.Object initialValue560 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemStackLimits));
        client.setting.NumberSetting initialized561 = new client.setting.NumberSetting(this, "BlockStackLimit", Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue560), constructorKey31);
        recovery$indy$flow$2299(this, initialized561);
        java.lang.Object initialValue562 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemStackLimits));
        client.setting.NumberSetting initialized563 = new client.setting.NumberSetting(this, "FoodStackLimit", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue562), constructorKey31);
        recovery$indy$flow$2303(this, initialized563);
        java.lang.Object initialValue564 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemStackLimits));
        client.setting.NumberSetting initialized565 = new client.setting.NumberSetting(this, "WaterBucketLimit", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue564), constructorKey31);
        recovery$indy$flow$2307(this, initialized565);
        java.lang.Object initialValue566 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemStackLimits));
        client.setting.NumberSetting initialized567 = new client.setting.NumberSetting(this, "LavaBucketLimit", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue566), constructorKey31);
        recovery$indy$flow$2311(this, initialized567);
        java.lang.Object initialValue568 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemStackLimits));
        client.setting.NumberSetting initialized569 = new client.setting.NumberSetting(this, "ThrowablesLimit", Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue568), constructorKey31);
        recovery$indy$flow$2315(this, initialized569);
        client.setting.SettingGroup initialized570 = new client.setting.SettingGroup(this, "Craft", constructorKey9);
        java.lang.Object initialValue571 = recovery$indy$flow$2318(this);
        char converted572 = (char) (constructorPart25);
        java.lang.Object initialValue573 = initialValue571;
        int initialValue574 = constructorPart26;
        int initialValue575 = (int) (converted572);
        int initialValue576 = constructorPart24;
        client.setting.SettingGroup initialValue577 = initialized570;
        java.lang.Object initialValue578 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue577))))));
        java.lang.Object initialValue579 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue573))))));
        java.lang.Object initialValue580 = recovery$indy$flow$2321(initialValue578, initialValue576, (char) (initialValue575), initialValue574, initialValue579);
        recovery$indy$flow$2322(this, initialValue580);
        java.lang.Object initialValue581 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.NumberSetting initialized582 = new client.setting.NumberSetting(this, "ReCraftIfSoupsLowerThan", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue581), constructorKey31);
        recovery$indy$flow$2326(this, initialized582);
        short converted583 = (short) (constructorPart20);
        char converted584 = (char) (constructorPart21);
        java.lang.Object initialValue585 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.BooleanSetting initialized586 = new client.setting.BooleanSetting(this, "CraftInstant", converted583, converted584, constructorPart22, false, (client.setting.SettingGroup) (initialValue585));
        long initialValue587 = constructorKey10;
        java.lang.String initialValue588 = "Instant";
        client.setting.BooleanSetting initialValue589 = initialized586;
        java.lang.Object initialValue590 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue589))))));
        java.lang.Object initialValue591 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue588))))));
        java.lang.Object initialValue592 = recovery$indy$flow$2332(initialValue590, initialValue591, initialValue587);
        java.lang.Object initialValue593 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue592))))));
        recovery$indy$flow$2334(this, initialValue593);
        java.lang.Object initialValue594 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.NumberSetting initialized595 = new client.setting.NumberSetting(this, "CraftMaxMouseMoveSpeed", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue594), constructorKey31);
        short converted596 = (short) (constructorPart7);
        int initialValue597 = (int) (converted596);
        int initialValue598 = constructorPart6;
        java.lang.String initialValue599 = "MaxMouseMoveSpeed";
        int initialValue600 = constructorPart5;
        client.setting.NumberSetting initialValue601 = initialized595;
        java.lang.Object initialValue602 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue601))))));
        java.lang.Object initialValue603 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue599))))));
        java.lang.Object initialValue604 = recovery$indy$flow$2340(initialValue602, initialValue600, initialValue603, initialValue598, (short) (initialValue597));
        java.lang.Object initialValue605 = recovery$indy$flow$2341(this);
        java.lang.Object initialValue606 = initialValue605;
        java.lang.Object initialValue607 = initialValue604;
        java.lang.Object initialValue608 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue607))))));
        java.lang.Object initialValue609 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue606))))));
        java.lang.Object initialValue610 = recovery$indy$flow$2344(initialValue608, initialValue609);
        recovery$indy$flow$2345(this, initialValue610);
        java.lang.Object initialValue611 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.RangeSetting initialized612 = new client.setting.RangeSetting(constructorPart28, this, "CraftMouseMoveRandom", constructorPart29, constructorPart30, 0.0D, 0.0D, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(4611686018427387904L), 0, (client.setting.SettingGroup) (initialValue611));
        long initialValue613 = constructorKey8;
        client.setting.RangeSetting initialValue614 = initialized612;
        java.lang.Object initialValue615 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue614))))));
        java.lang.Object initialValue616 = recovery$indy$flow$2350(initialValue615, initialValue613);
        java.lang.String initialValue617 = "MouseMoveRandom";
        long initialValue618 = constructorKey3;
        java.lang.Object initialValue619 = initialValue616;
        java.lang.Object initialValue620 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue619))))));
        java.lang.Object initialValue621 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue617))))));
        java.lang.Object initialValue622 = recovery$indy$flow$2353(initialValue620, initialValue618, initialValue621);
        java.lang.Object initialValue623 = recovery$indy$flow$2354(this);
        long initialValue624 = constructorKey14;
        java.lang.Object initialValue625 = initialValue623;
        int initialValue626 = constructorPart13;
        java.lang.Object initialValue627 = initialValue622;
        java.lang.Object initialValue628 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue627))))));
        java.lang.Object initialValue629 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue625))))));
        java.lang.Object initialValue630 = recovery$indy$flow$2357(initialValue628, initialValue626, initialValue629, initialValue624);
        recovery$indy$flow$2358(this, initialValue630);
        java.lang.Object initialValue631 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.RangeSetting initialized632 = new client.setting.RangeSetting(constructorPart28, this, "CraftCPS", constructorPart29, constructorPart30, Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626322717216342016L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue631));
        java.lang.String initialValue633 = "CPS";
        long initialValue634 = constructorKey3;
        client.setting.RangeSetting initialValue635 = initialized632;
        java.lang.Object initialValue636 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue635))))));
        java.lang.Object initialValue637 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue633))))));
        java.lang.Object initialValue638 = recovery$indy$flow$2364(initialValue636, initialValue634, initialValue637);
        java.lang.Object initialValue639 = recovery$indy$flow$2365(this);
        long initialValue640 = constructorKey14;
        java.lang.Object initialValue641 = initialValue639;
        int initialValue642 = constructorPart13;
        java.lang.Object initialValue643 = initialValue638;
        java.lang.Object initialValue644 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue643))))));
        java.lang.Object initialValue645 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue641))))));
        java.lang.Object initialValue646 = recovery$indy$flow$2368(initialValue644, initialValue642, initialValue645, initialValue640);
        recovery$indy$flow$2369(this, initialValue646);
        java.lang.Object initialValue647 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingCraft));
        client.setting.RangeSetting initialized648 = new client.setting.RangeSetting(constructorPart28, this, "CraftCPSRecalculate", constructorPart29, constructorPart30, Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, (client.setting.SettingGroup) (initialValue647));
        long initialValue649 = constructorKey8;
        client.setting.RangeSetting initialValue650 = initialized648;
        java.lang.Object initialValue651 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue650))))));
        java.lang.Object initialValue652 = recovery$indy$flow$2374(initialValue651, initialValue649);
        java.lang.String initialValue653 = "CPSRecalculate";
        long initialValue654 = constructorKey3;
        java.lang.Object initialValue655 = initialValue652;
        java.lang.Object initialValue656 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue655))))));
        java.lang.Object initialValue657 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue653))))));
        java.lang.Object initialValue658 = recovery$indy$flow$2377(initialValue656, initialValue654, initialValue657);
        java.lang.Object initialValue659 = recovery$indy$flow$2378(this);
        long initialValue660 = constructorKey14;
        java.lang.Object initialValue661 = initialValue659;
        int initialValue662 = constructorPart13;
        java.lang.Object initialValue663 = initialValue658;
        java.lang.Object initialValue664 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue663))))));
        java.lang.Object initialValue665 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue661))))));
        java.lang.Object initialValue666 = recovery$indy$flow$2381(initialValue664, initialValue662, initialValue665, initialValue660);
        recovery$indy$flow$2382(this, initialValue666);
        client.setting.SettingGroup initialized667 = new client.setting.SettingGroup(this, "ArmorHotbar", constructorKey9);
        java.lang.Object initialValue668 = recovery$indy$flow$2385(this);
        char converted669 = (char) (constructorPart25);
        java.lang.Object initialValue670 = initialValue668;
        int initialValue671 = constructorPart26;
        int initialValue672 = (int) (converted669);
        int initialValue673 = constructorPart24;
        client.setting.SettingGroup initialValue674 = initialized667;
        java.lang.Object initialValue675 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue674))))));
        java.lang.Object initialValue676 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue670))))));
        java.lang.Object initialValue677 = recovery$indy$flow$2388(initialValue675, initialValue673, (char) (initialValue672), initialValue671, initialValue676);
        recovery$indy$flow$2389(this, initialValue677);
        short converted678 = (short) (constructorPart20);
        char converted679 = (char) (constructorPart21);
        java.lang.Object initialValue680 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmorHotbar));
        client.setting.BooleanSetting initialized681 = new client.setting.BooleanSetting(this, "QSG", converted678, converted679, constructorPart22, false, (client.setting.SettingGroup) (initialValue680));
        recovery$indy$flow$2393(this, initialized681);
        java.lang.Object initialValue682 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmorHotbar));
        client.setting.RangeSetting initialized683 = new client.setting.RangeSetting(constructorPart28, this, "TickDelayBeforeSwitch", constructorPart29, constructorPart30, 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0, (client.setting.SettingGroup) (initialValue682));
        long initialValue684 = constructorKey8;
        client.setting.RangeSetting initialValue685 = initialized683;
        java.lang.Object initialValue686 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue685))))));
        java.lang.Object initialValue687 = recovery$indy$flow$2398(initialValue686, initialValue684);
        recovery$indy$flow$2399(this, initialValue687);
        java.lang.Object initialValue688 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmorHotbar));
        client.setting.RangeSetting initialized689 = new client.setting.RangeSetting(constructorPart28, this, "TickDelayBeforeClick", constructorPart29, constructorPart30, 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0, (client.setting.SettingGroup) (initialValue688));
        long initialValue690 = constructorKey8;
        client.setting.RangeSetting initialValue691 = initialized689;
        java.lang.Object initialValue692 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue691))))));
        java.lang.Object initialValue693 = recovery$indy$flow$2404(initialValue692, initialValue690);
        recovery$indy$flow$2405(this, initialValue693);
        java.lang.Object initialValue694 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingArmorHotbar));
        client.setting.RangeSetting initialized695 = new client.setting.RangeSetting(constructorPart28, this, "TickDelayAfter", constructorPart29, constructorPart30, 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0, (client.setting.SettingGroup) (initialValue694));
        long initialValue696 = constructorKey8;
        client.setting.RangeSetting initialValue697 = initialized695;
        java.lang.Object initialValue698 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue697))))));
        java.lang.Object initialValue699 = recovery$indy$flow$2410(initialValue698, initialValue696);
        recovery$indy$flow$2411(this, initialValue699);
        java.lang.Object initialValue700 = recovery$indy$flow$2413();
        java.lang.Object initialValue701 = recovery$indy$flow$2414(initialValue700);
        java.lang.Object initialValue702 = recovery$indy$flow$2415(1);
        ((java.lang.Object[]) initialValue702)[0] = "Basic";
        client.setting.ModeSetting initialized703 = new client.setting.ModeSetting(this, "ClickMode", constructorKey23, "Basic", (java.lang.String[]) (initialValue702));
        recovery$indy$flow$2417(this, initialized703);
        net.C_47cu initialized704 = new net.C_47cu();
        recovery$indy$flow$2420(this, initialized704);
        net.C_47cu initialized705 = new net.C_47cu();
        recovery$indy$flow$2423(this, initialized705);
        net.C_474k initialized706 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2426(this, initialized706);
        net.C_473X initialized707 = new net.C_473X();
        recovery$indy$flow$2429(this, initialized707);
        net.C_474k initialized708 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2432(this, initialized708);
        net.C_473X initialized709 = new net.C_473X();
        recovery$indy$flow$2435(this, initialized709);
        net.C_474k initialized710 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2438(this, initialized710);
        net.C_473X initialized711 = new net.C_473X();
        recovery$indy$flow$2441(this, initialized711);
        net.C_474k initialized712 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$2444(this, initialized712);
        net.C_474k initialized713 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$2447(this, initialized713);
        net.C_474k initialized714 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$2450(this, initialized714);
        net.C_474k initialized715 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$2453(this, initialized715);
        net.C_473X initialized716 = new net.C_473X();
        recovery$indy$flow$2456(this, initialized716);
        recovery$indy$flow$2457(this, 0);
        recovery$indy$flow$2458(this, 0);
        recovery$indy$flow$2459(this, 0);
        recovery$indy$flow$2460(this, 0);
        recovery$indy$flow$2461(this, -1);
        recovery$indy$flow$2462(this, false);
        recovery$indy$flow$2463(this, false);
        java.util.ArrayList initialized717 = new java.util.ArrayList();
        recovery$indy$flow$2466(this, initialized717);
        java.util.ArrayList initialized718 = new java.util.ArrayList();
        recovery$indy$flow$2469(this, initialized718);
        recovery$indy$flow$2470(this, -1);
        recovery$indy$flow$2471(this, -1);
        recovery$indy$flow$2472(this, 0);
        recovery$indy$flow$2473(this, 0);
        recovery$indy$flow$2474(this, false);
        recovery$indy$flow$2475(this, true);
        recovery$indy$flow$2476(this, false);
        java.lang.Object initialValue719 = ((java.lang.Object)(((augustus.recovered.modules.player.InvManager_47QL) (((java.lang.Object)(this)))).settingItemsToDrop));
        java.lang.Object initialValue720 = recovery$indy$flow$2479();
        java.lang.Object initialValue721 = recovery$indy$flow$2480();
        net.C_471Q initialized722 = new net.C_471Q(this, constructorKey27, "Items", (client.setting.SettingGroup) (initialValue719), (net.C_45n) (initialValue720), (java.util.function.Function) (initialValue721));
        recovery$indy$flow$2482(this, initialized722);
        if (initialValue468 != 0) {
            return;
        } else {
            java.lang.Object initialValue723 = recovery$indy$flow$2483(3);
            java.lang.Object initialValue724 = initialValue723;
            java.lang.Object initialValue725 = recovery$indy$flow$2484(initialValue724);
            recovery$indy$flow$2485(initialValue725);
            return;
        }
    }
























    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$161() {
        return augustus.recovered.modules.player.InvManager_47QL.a;
    }
    private static native boolean recovery$indy$flow$162();
    private static java.lang.Object recovery$indy$flow$163() {
        return net.C_47Oh.CRAFT;
    }

    private static native boolean recovery$indy$flow$165(java.lang.Object a0);

    private static native boolean recovery$indy$flow$167(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$170(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$171(int a0,long a1);
    private static boolean recovery$indy$flow$172(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static void recovery$indy$flow$173(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static int recovery$indy$flow$174(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43f;
    }
    private static void recovery$indy$flow$175(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43f = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$176() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native java.lang.Object recovery$indy$flow$182(java.lang.Object a0,long a1,java.lang.Object a2);
    private static void recovery$indy$flow$183(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static int recovery$indy$flow$184(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static int recovery$indy$flow$185(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static void recovery$indy$flow$186(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$187(int a0);
    private static java.lang.Object recovery$indy$flow$188() {
        return net.C_42R.field_45;
    }
    private static native java.lang.Object recovery$indy$flow$189(int a0);
    private static native java.lang.Object recovery$indy$flow$190(int a0);
    private static java.lang.Object recovery$indy$flow$191() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }




    private static int recovery$indy$flow$196(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$197() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native java.lang.Object recovery$indy$flow$203(java.lang.Object a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$204() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$208(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$209(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$210(java.lang.Object a0);
    private static boolean recovery$indy$flow$211(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static void recovery$indy$flow$212(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }


    private static native double recovery$indy$flow$215(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$216() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0);
    private static boolean recovery$indy$flow$221(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static boolean recovery$indy$flow$222(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static boolean recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native boolean recovery$indy$flow$225(java.lang.Object a0,int a1,long a2);
    private static void recovery$indy$flow$226(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$227() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native void recovery$indy$flow$233(java.lang.Object a0,int a1,long a2,int a3,java.lang.Object a4);

    private static native boolean recovery$indy$flow$235(java.lang.Object a0,int a1,long a2);
    private static java.lang.Object recovery$indy$flow$236() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native void recovery$indy$flow$242(java.lang.Object a0,int a1,long a2,int a3,java.lang.Object a4);
    private static java.lang.Object recovery$indy$flow$243() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$247(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$248(java.lang.Object a0);
    private static boolean recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native boolean recovery$indy$flow$251(java.lang.Object a0,int a1,long a2);
    private static void recovery$indy$flow$252(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$253() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native void recovery$indy$flow$259(java.lang.Object a0,int a1,long a2,int a3,java.lang.Object a4);
    private static java.lang.Object recovery$indy$flow$260() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$264(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$265(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$266(java.lang.Object a0);
    private static boolean recovery$indy$flow$267(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native boolean recovery$indy$flow$269(java.lang.Object a0,int a1,long a2);
    private static java.lang.Object recovery$indy$flow$270() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }




    private static int recovery$indy$flow$275(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$276() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$281(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$282(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0);
    private static boolean recovery$indy$flow$284(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static int recovery$indy$flow$285(java.lang.Object a0) {
        return ((net.C_47rf) (a0)).field_47;
    }
    private static native int recovery$indy$flow$286(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$287() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native void recovery$indy$flow$293(java.lang.Object a0,int a1,long a2,int a3,java.lang.Object a4);
    private static void recovery$indy$flow$294(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$602(java.lang.Object a0,int a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$687(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$708(java.lang.Object a0,int a1,int a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$721(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$741(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$756(java.lang.Object a0,int a1,int a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$765(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$781(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$784(java.lang.Object a0,int a1,int a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$787(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$805(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$808(java.lang.Object a0,int a1,int a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$821(java.lang.Object a0,int a1,int a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$842(java.lang.Object a0,int a1,java.lang.Object a2);
    private static long recovery$indy$flow$1012() {
        return augustus.recovered.modules.player.InvManager_47QL.a;
    }
    private static java.lang.Object recovery$indy$flow$1013() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }





    private static native boolean recovery$indy$flow$1019(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$1021(java.lang.Object a0,long a1,int a2,boolean a3);
    private static native boolean recovery$indy$flow$1024();
    private static java.lang.Object recovery$indy$flow$1025(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$1026(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$1027(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static int recovery$indy$flow$1029(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static native java.lang.Object recovery$indy$flow$1030(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$1031(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$1032(java.lang.Object a0);

    private static int recovery$indy$flow$1034(java.lang.Object a0) {
        return ((net.C_43S) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$1035(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$1036(java.lang.Object a0);


    private static native boolean recovery$indy$flow$1039(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1040(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$1041(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static boolean recovery$indy$flow$1043(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$1044() {
        return augustus.recovered.modules.player.InvManager_47QL.field_43;
    }


    private static int recovery$indy$flow$1047(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static void recovery$indy$flow$1048(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43y = a1;
        return;
    }

    private static void recovery$indy$flow$1050(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }

    private static boolean recovery$indy$flow$1052(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).addAll(((java.util.Collection) (a1)));
    }

    private static native boolean recovery$indy$flow$1054(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$1055(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43v;
    }

    private static boolean recovery$indy$flow$1057(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).equals(a1);
    }

    private static void recovery$indy$flow$1059(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }

    private static boolean recovery$indy$flow$1061(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).addAll(((java.util.Collection) (a1)));
    }
    private static void recovery$indy$flow$1062(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43p = a1;
        return;
    }

    private static boolean recovery$indy$flow$1064(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static java.lang.Object recovery$indy$flow$1066(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static int recovery$indy$flow$1068(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static native java.lang.Object recovery$indy$flow$1419(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1882(int a0);
    private static native void recovery$indy$flow$1883(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1885();
    private static native void recovery$indy$flow$1887(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1889(int a0);
    private static native void recovery$indy$flow$1891(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1895(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1896(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1899(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1902(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1905(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1908(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1911(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1913(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1916(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1919(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1921(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1924() {
        return net.C_47Oh.SORT;
    }
    private static java.lang.Object recovery$indy$flow$1925(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1926(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1929(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1930(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1936(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1938(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1944(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1945(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1948(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1949(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1954(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1957(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1958(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1961(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1962(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1968(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1969(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1972(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1973(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1978(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1981(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1982(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1985(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1986(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1992(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$1994(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1995(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1998(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1999(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2001(int a0);

    private static native void recovery$indy$flow$2004(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2008(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2013(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2018(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2023(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2028(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2033(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2038(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2043(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2048(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$2053(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2056() {
        return net.C_47Oh.PUT_ON_ARMOR;
    }
    private static java.lang.Object recovery$indy$flow$2057(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2058(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2061(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2062(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2066(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2070(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2074(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2080(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$2082(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2088(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2089(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2092(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2093(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2098(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2101(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2102(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2105(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2106(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2112(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2113(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2116(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2117(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2122(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2125(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2126(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2129(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2130(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2136(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2138(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2139(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2142(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2143(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2149(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2151(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2152(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2155(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2156(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2161(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2164(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2165(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2168(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2169(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2171(int a0);

    private static native void recovery$indy$flow$2174(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$2177() {
        return net.C_47Oh.CLEAN;
    }
    private static java.lang.Object recovery$indy$flow$2178(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2179(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2182(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2183(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$2184();

    private static native void recovery$indy$flow$2188(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2194(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$2196(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2202(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2203(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2206(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2207(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2212(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2215(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2216(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2219(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2220(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2226(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2227(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2230(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2231(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2236(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2239(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2240(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2243(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2244(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2250(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$2252(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2253(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2256(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2257(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2262(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2265(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2266(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2269(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2270(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2272(int a0);

    private static native void recovery$indy$flow$2275(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2279() {
        return net.C_47Oh.CLEAN;
    }
    private static java.lang.Object recovery$indy$flow$2280(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2281(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2284(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2285(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$2289() {
        return net.C_47Oh.CLEAN;
    }
    private static java.lang.Object recovery$indy$flow$2290(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2291(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2294(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2295(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2299(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2303(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2307(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2311(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2315(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2318(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2321(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2322(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2326(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2332(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$2334(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2340(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$2341(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2344(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2345(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2350(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2353(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2354(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2357(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2358(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$2364(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2365(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2368(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2369(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2374(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$2377(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$2378(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2381(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$2382(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2385(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$2388(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$2389(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$2393(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2398(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$2399(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2404(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$2405(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$2410(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$2411(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2413();
    private static java.lang.Object recovery$indy$flow$2414(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$2415(int a0);
    private static native void recovery$indy$flow$2417(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2420(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2423(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2426(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2429(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2432(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2435(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2438(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2441(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2444(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2447(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2450(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2453(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2456(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2457(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$2458(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43f = a1;
        return;
    }
    private static void recovery$indy$flow$2459(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$2460(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_436 = a1;
        return;
    }
    private static void recovery$indy$flow$2461(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$2462(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_447 = a1;
        return;
    }
    private static void recovery$indy$flow$2463(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43P = a1;
        return;
    }
    private static native void recovery$indy$flow$2466(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$2469(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$2470(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43U = a1;
        return;
    }
    private static void recovery$indy$flow$2471(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$2472(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$2473(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$2474(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$2475(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$2476(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.InvManager_47QL) (a0)).field_43a = a1;
        return;
    }

    private static native java.lang.Object recovery$indy$flow$2479();
    private static native java.lang.Object recovery$indy$flow$2480();
    private static native void recovery$indy$flow$2482(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$2483(int a0);
    private static java.lang.Object recovery$indy$flow$2484(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$2485(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native Consumer recovery$indy$2();
   private static native boolean recovery$indy$3(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native String recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$5(int var0, long var1);
   private static native int recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$7(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native int recovery$indy$8(
      Object var0, int var1, char var2, int var3, Object var4, int var5, int var6, Object var7, int var8, int var9, long var10, long var12
   );
   private static native boolean recovery$indy$9(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native void recovery$indy$10(Object var0, long var1, long var3);
   private static native void recovery$indy$11(int var0, long var1, long var3);
   private static native void recovery$indy$12(Object var0, long var1, long var3);
   private static native double recovery$indy$13(Object var0, long var1, long var3);
   private static native double recovery$indy$14(Object var0, long var1, long var3);
   private static native double recovery$indy$15(Object var0, long var1, long var3);
   private static native double recovery$indy$16(Object var0, long var1, long var3);
   private static native double recovery$indy$17(Object var0, long var1, long var3);
   private static native double recovery$indy$18(Object var0, long var1, long var3);
   private static native double recovery$indy$19(Object var0, long var1, long var3);
   private static native double recovery$indy$20(Object var0, long var1, long var3);
   private static native double recovery$indy$21(Object var0, long var1, long var3);
   private static native double recovery$indy$22(Object var0, long var1, long var3);
   private static native double recovery$indy$23(Object var0, long var1, long var3);
   private static native double recovery$indy$24(Object var0, long var1, long var3);
   private static native double recovery$indy$25(Object var0, long var1, long var3);
   private static native double recovery$indy$26(Object var0, long var1, long var3);
   private static native double recovery$indy$27(Object var0, long var1, long var3);
   private static native double recovery$indy$28(Object var0, long var1, long var3);
   private static native double recovery$indy$29(Object var0, long var1, long var3);
   private static native double recovery$indy$30(Object var0, long var1, long var3);
   private static native void recovery$indy$31(Object var0, long var1, long var3);
   private static native boolean recovery$indy$33(long var0, long var2);
   private static native String recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$36(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$37(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$40(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$41(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$42(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$43(long var0, long var2);
   private static native String recovery$indy$44(int var0, long var1);
   private static native String recovery$indy$45(int var0, long var1);
   private static native String recovery$indy$46(int var0, long var1);
   private static native String recovery$indy$47(int var0, long var1);
   private static native String recovery$indy$48(int var0, long var1);
   private static native String recovery$indy$49(int var0, long var1);
   private static native String recovery$indy$50(int var0, long var1);
   private static native String recovery$indy$51(int var0, long var1);
   private static native String recovery$indy$52(int var0, long var1);
   private static native ArrayList recovery$indy$53(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$54(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$55(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$56(long var0, Object var2, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$57(Object var0, int var1, long var2, long var4, long var6);
   private static native ArrayList recovery$indy$58(short var0, char var1, int var2, Object var3, int var4, long var5, long var7);
   private static native ArrayList recovery$indy$59(long var0, Object var2, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$60(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$61(int var0, short var1, int var2, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$62(long var0, long var2);
   private static native int recovery$indy$63(long var0, long var2);
   private static native int recovery$indy$64(long var0, long var2);
   private static native int recovery$indy$65(long var0, long var2);
   private static native int recovery$indy$66(long var0, long var2);
   private static native boolean recovery$indy$67(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native void recovery$indy$68(Object var0, int var1, long var2, int var4, Object var5, long var6, long var8);
   private static native boolean recovery$indy$70(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$71(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$85(Object var0, long var1, long var3);
   private static native void recovery$indy$86(Object var0, Object var1, long var2, int var4, long var5, long var7);
   private static native C_40g recovery$indy$87(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native void recovery$indy$89(Object var0, long var1, long var3);
   private static native String recovery$indy$90(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$91(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$92(Object var0, int var1, int var2, int var3, long var4, long var6);
   private static native void recovery$indy$93(Object var0, long var1, long var3);
   private static native void recovery$indy$94(Object var0, long var1, long var3);
   private static native void recovery$indy$95(Object var0, long var1, long var3);
   private static native void recovery$indy$96(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$97(Object var0, long var1, long var3);
   private static native boolean recovery$indy$98(long var0, long var2);
   private static native int recovery$indy$99(Object var0, long var1, long var3);
   private static native boolean recovery$indy$100(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$101(Object var0, long var1, long var3);
   private static native double recovery$indy$102(Object var0, long var1, long var3);
   private static native void recovery$indy$103(Object var0, long var1, long var3);
   private static native int recovery$indy$104(Object var0, long var1, long var3);
   private static native boolean recovery$indy$105(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$106(Object var0, long var1, long var3);
   private static native double recovery$indy$107(Object var0, long var1, long var3);
   private static native void recovery$indy$108(Object var0, long var1, long var3);
   private static native int recovery$indy$109(Object var0, long var1, long var3);
   private static native boolean recovery$indy$110(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$111(Object var0, long var1, long var3);
   private static native double recovery$indy$112(Object var0, long var1, long var3);
   private static native void recovery$indy$113(Object var0, long var1, long var3);
   private static native int recovery$indy$114(Object var0, long var1, long var3);
   private static native boolean recovery$indy$115(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$116(Object var0, long var1, long var3);
   private static native double recovery$indy$117(Object var0, long var1, long var3);
   private static native void recovery$indy$118(Object var0, long var1, long var3);
   private static native String recovery$indy$119(int var0, long var1);
   private static native double recovery$indy$121(Object var0, long var1, long var3);
   private static native double recovery$indy$122(Object var0, long var1, long var3);
   private static native double recovery$indy$123(Object var0, long var1, long var3);
   private static native boolean recovery$indy$124(long var0, long var2);
   private static native int recovery$indy$125(Object var0, long var1, long var3);
   private static native boolean recovery$indy$126(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$127(Object var0, long var1, long var3);
   private static native void recovery$indy$128(Object var0, Object var1, long var2, int var4, long var5, long var7);
   private static native C_40g recovery$indy$129(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$130(Object var0, long var1, long var3);
   private static native void recovery$indy$131(Object var0, long var1, long var3);
   private static native String recovery$indy$132(int var0, long var1);
   private static native boolean recovery$indy$133(long var0, long var2);
   private static native boolean recovery$indy$134(Object var0, long var1, long var3);
   private static native boolean recovery$indy$135(long var0, long var2, long var4);
   private static native boolean recovery$indy$136(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$137(Object var0, long var1, long var3);
   private static native int recovery$indy$138(Object var0, long var1, long var3);
   private static native void recovery$indy$139(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$140(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$141(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$142(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$143(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$144(Object var0, char var1, char var2, int var3, long var4, long var6);
   private static native MethodHandle recovery$constant$178();
}
